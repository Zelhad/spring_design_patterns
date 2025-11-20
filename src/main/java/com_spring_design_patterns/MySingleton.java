package com_spring_design_patterns;

import java.util.logging.Logger;

class MySingleton {

	private static final Logger log = Logger.getLogger(MySingleton.class.getName());
	private static MySingleton UNIQUE = null;

	private MySingleton() {
	}

	private static synchronized MySingleton getInstance() {
		if (UNIQUE == null) {
			UNIQUE = new MySingleton();
		}
		return UNIQUE;
	}

	public static void main(String[] args) {
		MySingleton s1 =   MySingleton.getInstance();
		MySingleton s2 =   MySingleton.getInstance();
		boolean test = s1==s2;
		
		log.info("s1==s2 : " + test);
	}
}
