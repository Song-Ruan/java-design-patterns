package org.strategy;

/**
 * @ClassName: App
 * @Description: 策略模式：定义一组算法，将每个算法都封装起来，并且使它们之间可以互换
 * @author chengwy
 * @date 2018年9月7日
 *
 */
public class App {
	public static void main(String[] args) {
		Context context = new Context(new ConcreteStrategy1());
		context.doAnything();
		
		context = new Context(new ConcreteStrategy2());
		context.doAnything();
	}
}
