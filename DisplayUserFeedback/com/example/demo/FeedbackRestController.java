package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class FeedbackRestController {
	@Autowired 
	FeedbackDAO feedbackservice;
	
	@GetMapping("/allfeedback")
	public List<Feedback> getAllFeedbacks(){
		return feedbackservice.getAllFeedbacks();
		
	}
	
	@PostMapping("/feedback")   //@REquestBody is used to read object from browser
	public String addFeedback(@RequestParam("name") String name,  @RequestParam("email") String email ,@RequestParam("feedback") String feedback ) {
	   Feedback f=new Feedback(name,email,feedback);
		boolean data=feedbackservice.addFeedback(f);
		if(data) {
			return "Feedback added succesfully!";
		}
		else {
			return "Unable to add the feedback";
		}
		}
	}

