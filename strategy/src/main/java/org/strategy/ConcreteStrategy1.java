package org.strategy;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ConcreteStrategy1 implements Strategy {
	private static final Logger logger = LoggerFactory.getLogger(ConcreteStrategy1.class);
	
	@Override
	public void doSomething() {
		// TODO Auto-generated method stub
		logger.info("doSomething of "+this.getClass().getName());
	}
}
