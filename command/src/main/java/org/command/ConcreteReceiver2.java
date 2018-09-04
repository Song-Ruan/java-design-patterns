package org.command;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ConcreteReceiver2 extends Receiver {
	private static final Logger logger = LoggerFactory.getLogger(App.class);
	
	@Override
	public void doSomething() {
		logger.info(this.getClass().getName()+" doSomething");
	}

}
