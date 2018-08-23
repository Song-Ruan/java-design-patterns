package org.proxy;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Robot extends Human {
	private static final Logger logger = LoggerFactory.getLogger(Robot.class);
	private Human human;

	public Robot(Human human) {
		super();
		this.human = human;
	}

	@Override
	protected String behave() {
		startUp();
		String behave = human.behave();
		tearDown();
		return behave;
	}

	private void startUp() {
		logger.info("proxy entrance");
	}

	private void tearDown() {
		logger.info("proxy exit");
	}

}