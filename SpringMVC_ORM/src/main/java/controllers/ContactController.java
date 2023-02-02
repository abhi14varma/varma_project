package controllers;

import java.util.List;

import javax.servlet.ServletContext;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import dao.ContactDAO;
import models.Contact;

@Controller
public class ContactController
 {
	

	@Autowired
	ContactDAO cdao;
	
	
	@RequestMapping("/all")
	public String getAll(ModelMap map)
	{
		List<Contact> all = cdao.getAll();
		map.addAttribute("clist", all);
		return "all" ;
	}
	
	@RequestMapping("/create")
	public ModelAndView createNew()
	{
		return  new ModelAndView("contactform","con",new Contact());
	}
	
	@RequestMapping("/save")
	public ModelAndView savecontact(@ModelAttribute("con") Contact ct)
	{
		int insertedid = cdao.save(ct);
		return new ModelAndView("savemsg","insertedid",insertedid);
	}
	
	@RequestMapping("/delete")
	public ModelAndView deleteContact(@RequestParam("cid") int cid)
	{
		boolean flag = cdao.delete(cid);
		return new ModelAndView("deletemsg","del_success",flag);
	}
	
	@RequestMapping("/edit")
	public String editContact(@RequestParam("cid") int cid)
	{
		//fetch contact using cid
		//contactform.jsp to edit
		//update information
		return "";
	}
	
	@RequestMapping("/update")
	public String updateContact()
	{
		//get contact object which is updated
		//update it using template's method
		return "";
	}
	
	
}
