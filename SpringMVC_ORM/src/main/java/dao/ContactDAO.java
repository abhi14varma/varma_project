package dao;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;

import models.Contact;

@Transactional
public class ContactDAO {

	@Autowired
	HibernateTemplate template;


	public List<Contact> getAll()
	{
		return template.loadAll(Contact.class);
	}
 	
	
	public int save(Contact ct)
	{
		 int n= (int)template.save(ct);
		 return n;
	}
	
	public Contact getContact(int cid)
	{
		return template.get(Contact.class, cid);
	}
	
	public boolean delete(int cid)
	{
		boolean flag = false;
		try
		{
			template.delete(getContact(cid));
			flag = true;
		}
		catch(Exception e)
		{
			flag = false;
		}
		return flag;
	}
	
	
}
