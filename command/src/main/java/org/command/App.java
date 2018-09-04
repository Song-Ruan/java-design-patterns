package org.command;

/**
 * @ClassName: App
 * @Description: 命令模式是一个高内聚模式，是一种数据驱动的设计模式，它属于行为型模式。请求以命令的形式包裹在对象中，并传给调用对象。
 *               调用对象寻找可以处理该命令的合适的对象，并把该命令传给相应的对象，该对象执行命令。
 * @author chengwy
 * @date 2018年9月4日
 *
 */
public class App {
	public static void main(String[] args) {
		/**
		 * 定义接收者
		 */
		Receiver receiver = new ConcreteReceiver1();
		/**
		 * 定义一个发送给接收者的命令
		 */
		Command command = new ConcreteCommand1(receiver);
		/*
		 * 首先声明调用者Invoker
		 */
		Invoker invoker = new Invoker(command);
		/*
		 * 把命令交给调用者invoker去执行
		 */
		invoker.action();
	}
}
