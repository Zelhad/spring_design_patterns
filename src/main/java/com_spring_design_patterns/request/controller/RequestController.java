package com_spring_design_patterns.request.controller;

import com_spring_design_patterns.request.RequestService;

@org.springframework.stereotype.Controller
public class RequestController {
	
	@org.springframework.beans.factory.annotation.Autowired
	private RequestService requestService;
	

	@org.springframework.web.bind.annotation.GetMapping("/testRequestScope")
	public String testRequestScope() {
		return "Bean id for this request is  -->" + requestService.getId();
	}
	
	
	

}
