package org.decorator;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ConcreteComponent extends Component {
	private static final Logger logger = LoggerFactory.getLogger(ConcreteComponent.class);
	
	@Override
	public void operate() {
		logger.info("do something");
	}
}
