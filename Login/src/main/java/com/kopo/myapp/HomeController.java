package com.kopo.myapp;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Handles requests for the application home page.
 */
@Controller
public class HomeController {
	
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	
	/**
	 * Simply selects the home view to render by returning its name.
	 */
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home(Locale locale, Model model) {
		logger.info("Welcome home! The client locale is {}.", locale);
		
		Date date = new Date();
		DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, locale);
		
		String formattedDate = dateFormat.format(date);
		
		model.addAttribute("serverTime", formattedDate );
		
		return "home";
	}
	@RequestMapping(value = "/login", method = RequestMethod.GET)
	public String login(Locale locale, Model model) {
		return "login";
	}

	@RequestMapping(value = "/list", method = RequestMethod.GET)
	public String list(Locale locale, Model model) {
		return "list";
	}
	@RequestMapping(value = "/create", method = RequestMethod.GET)
	public String create(Locale locale, Model model) {
		DBCommon<Student> db = new DBCommon<Student>("C:\\KOPO\\s.sqlite","Student");
		db.createTable(new Student());
		model.addAttribute("message","success");
		return "message";
	}
	
	@RequestMapping(value = "/insert", method = RequestMethod.GET)
	public String insert(Locale locale, Model model) {
		return "join";
	}
	
	@RequestMapping(value = "/insert_action", method = RequestMethod.GET)
	public String insertAction(Locale locale, Model model
			,@RequestParam("name") String name
			,@RequestParam("phone") String p
			,@RequestParam("address") String address) {
		
		DBCommon<Student> db = new DBCommon<Student>("C:\\KOPO\\s.sqlite","Student");
		db.insertData(new Student(name, p, address));
		
		model.addAttribute("message","success");
		return "message";
	}
	
	@RequestMapping(value = "/update", method = RequestMethod.GET)
	public String update(Locale locale, Model model, @RequestParam("idx") int idx) {
		DBCommon<Student> db = new DBCommon<Student>("C:\\KOPO\\s.sqlite","Student");
		Student row = db.detailsData(new Student(), idx);
		model.addAttribute("idx",row.idx);
		model.addAttribute("name",row.name);
		model.addAttribute("phone",row.phone);
		model.addAttribute("address",row.address);
		return "update";
	}
	
	@RequestMapping(value = "/update_action", method = RequestMethod.GET)
	public String updateAction(Locale locale, Model model
			, @RequestParam("idx") int idx
			, @RequestParam("name") String name
			, @RequestParam("phone") String p
			, @RequestParam("address") String address) {
		DBCommon<Student> db = new DBCommon<Student>("C:\\KOPO\\s.sqlite","Student");
		db.insertData(new Student(name, p, address));
		
		model.addAttribute("message","success");
		return "update";
	}
	
	
	
}
