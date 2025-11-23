package com_spring_design_patterns.request;


import org.springframework.stereotype.Service;

@Service
@org.springframework.context.annotation.Scope("request")
public class RequestService {
	private static java.util.logging.Logger log =java.util.logging.Logger.getLogger(RequestService.class.getName());

	private String id ; 
	@jakarta.annotation.PostConstruct
	public  void init() {
		id =java.util.UUID.randomUUID().toString();
	}
	public String getId() {
		return id;
	}
//We can postpone it until later becuase Request scope we need to test it using HTTP protocol
	
	


}
