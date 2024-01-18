package com.example.limits.limits.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.limits.limits.components.LimitConfig;
import com.example.limits.limits.domain.HardCodedLimit;

@RestController
public class LimitController {
	
	
	private static final Logger log = LoggerFactory.getLogger(LimitController.class);

	
	@Autowired
	private LimitConfig limitConfig;
	
	@GetMapping("/limits")
	public HardCodedLimit getLimits() {
		log.error("Got a request");
		return new HardCodedLimit(limitConfig.getMinimum(), limitConfig.getMaximum());
	}
	
	@GetMapping("/greet")
	public String greetings()
	{
		return "Good morning";
	}
}
