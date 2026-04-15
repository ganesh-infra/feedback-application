package com.example.demo.Controller;



import com.example.demo.Entity.Feedback;
import com.example.demo.FeedbackRepository.FeedbackRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;



@Controller
public class FeedbackController {
	
	@Autowired
    public FeedbackRepository repository;
    

    @GetMapping("/")
    public String form(Model model) {
    	System.out.println("Started");
        model.addAttribute("feedback", new Feedback());
    	System.out.println("End");
        return "form";
    }
    
    @GetMapping("/test")
    @ResponseBody
    public String test_info() {
    	return "Feedback Application Working Properly";
    }

    @PostMapping("/submit")
    public String submit(@ModelAttribute Feedback feedback) {
        repository.save(feedback);
        return "redirect:/";
    }
}