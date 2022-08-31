package com.example.demo;

import java.util.List;


import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class FeedbackDAO{
	
	@Autowired
	FeedbackRepo feedbackrepository;//reference object of interface
	
	
	//get list of all records
	public List<Feedback> getAllFeedbacks(){
		return feedbackrepository.findAll();
	}
	
	public boolean addFeedback(Feedback pe){
        feedbackrepository.save(pe);
        return true;
    }
}
