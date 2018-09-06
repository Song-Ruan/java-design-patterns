package org.decorator;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ConcreteDecorator extends Decorator {
	private static final Logger logger = LoggerFactory.getLogger(ConcreteDecorator.class);
	
	public ConcreteDecorator(Component component) {
		super(component);
	}
	
	/*
	 * 定义自己的修饰方法
	 */
	private void method1(){
		logger.info("method1 decorate");
	}
	
	// 重写父类的Oprate方法
	public void operate(){
		this.method1();
		super.operate();
	}
}
