package com.vishwas.controller;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.vishwas.model.User;

@Controller
public class newcontroller {
	@RequestMapping(value = "/home")
public String home(Model model) {
    model.addAttribute("name","vishwas tiwari");
    List<Integer>al = new ArrayList<>();
    al.add(12);
    al.add(121);
    al.add(1232);
    al.add(1267);
    al.add(1244);
    model.addAttribute("num",al);
	return "home";
}

	@RequestMapping(value = "/about")
	public ModelAndView about() {
		// creating the modeland view obj
	ModelAndView mv =new ModelAndView();
	//setting the data
	mv.addObject("name","vishwas");
	//setting the view
	mv.setViewName("about");
	LocalDateTime ld =LocalDateTime.now();
	mv.addObject("time","ld");
		return mv;
		
	}
    @RequestMapping(value = "register")
	public String openform() {
		return "form";
	}
//    @RequestMapping(value = "formprocess",method = RequestMethod.POST)
//    public String handleform(@RequestParam("name") String sname, @RequestParam("email") String semail,Model m){
//   User user =new User(sname,semail);
//    
//    
//    m.addAttribute("uobj",user);
//    
//    	return "success";
//    
//}
    @RequestMapping(value = "formprocess",method = RequestMethod.POST)
    public String handleform(@ModelAttribute User user,Model m){
    
    	return "success";
    
}
}