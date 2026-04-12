package com.example.demo.Controller;



import com.example.demo.Entity.Feedback;
import com.example.demo.FeedbackRepository.FeedbackRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class FeedbackController {

    private final FeedbackRepository repository;
    
    @GetMapping("/test")
    @ResponseBody
    public String test() {
    	return "Feedback Application Working Properly";
    }

    public FeedbackController(FeedbackRepository repository) {
        this.repository = repository;
    }

    @GetMapping("/")
    public String form(Model model) {
        model.addAttribute("feedback", new Feedback());
        return "form";
    }

    @PostMapping("/submit")
    public String submit(@ModelAttribute Feedback feedback) {
        repository.save(feedback);
        return "redirect:/";
    }
}