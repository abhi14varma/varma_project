package dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import models.Contact;

public class ContactJdbcDAO 
{
	@Autowired
	JdbcTemplate jtemplate;
	
	public List<Contact> getAll()
	{
			
		return jtemplate.query("select * from contacts", new RowMapper<Contact>() {

			@Override
			public Contact mapRow(ResultSet rs, int rowNum) throws SQLException {
				// TODO Auto-generated method stub
				return new Contact(rs.getInt(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getString(5),rs.getString(6),rs.getString(7));
			}
			
		});
	}
	
	public void save(Contact c)
	{
		//jtemplate.update("insert into contacts(uid,password,fnanme,lname,email,conatctno) values(?,?,?,?,?,?)", c.getUid(),c.getPassword())
	}
	
	
}
