package org.chain_of_responsibility;

/**
 * @ClassName: App
 * @Description: 责任链模式，使多个对象都有机会处理请求，从而避免请求的发送者和接收者之间的耦合关系。
 *               将这些对象连成一条链，并沿着这条链传递该请求，直到有对象处理它为止
 * @author chengwy
 * @date 2018年9月5日
 *
 */
public class App {
	public static void main(String[] args) {
		Handler handler1 = new ConcreteHandler1();
		Handler handler2 = new ConcreteHandler2();

		// 设置链中的顺序为1->2
		handler1.setNextHandler(handler2);

		Response response = handler1.handleMessage(new Request());
	}
}
