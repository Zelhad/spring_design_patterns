package com_spring_design_patterns.prototype;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

@Service
@Scope("prototype")
public class ServicePrototype {
	private static java.util.logging.Logger log = java.util.logging.Logger.getLogger(ServicePrototype.class.getName());
	private static int counter = 0;
	private  int id ; 
	
	public ServicePrototype() {
		id = ++counter;
	}
	public int getId() {
		return  this.id;
	}
	@Override
	public String toString() {
		return "ServiceProtoType{ id --->" + id + "}";
	}
	
	
}
