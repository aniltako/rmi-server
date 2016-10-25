package com.fuse;

import org.apache.log4j.Logger;

public class CalculationImpl implements Calculation {
	
    private static Logger logger = Logger.getLogger(CalculationImpl.class);


	@Override
	public String greeding(String name) {
		logger.info("Request from " + name);
		return "Hello " + name + "! Welcome to Fusemachinse. " ;
	}

	
}
