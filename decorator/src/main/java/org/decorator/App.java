package org.decorator;

/**
 * @ClassName: App
 * @Description: 动态地给一个对象添加一些额外的职责。就增加功能来说，装饰模式相比生成子类更为灵活
 * @author chengwy
 * @date 2018年9月6日
 *
 */
public class App {
	public static void main(String[] args) {
		Component component = new ConcreteComponent();
		// 修饰
		component = new ConcreteDecorator(component);
		component.operate();
	}
}
