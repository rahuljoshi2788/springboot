package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class MyController {

//	@RequestMapping(value = "/calculate", method = RequestMethod.POST)
//
//    public String addNumbers(@ModelAttribute("n1")
//    Numbers n1, BindingResult result) {
//
//        System.out.println(n1.getI1()+n1.getI2());
//        
//        return "redirect:result.jsp";
//
//    }
	
	 @RequestMapping(value = "/calculate", method = RequestMethod.GET)
	    public String addNumbers(Numbers n1,Model model) {

	        System.out.println(n1.getI1() + n1.getI2());
	        int i3=n1.getI1()+n1.getI2();
	        
	        
	        model.addAttribute("n1", n1);
	        model.addAttribute("n2", i3);
	        
	               
	        return "result.jsp";

	    }


}
