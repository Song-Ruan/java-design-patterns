package org.mediator;

/**
 * @ClassName: App
 * @Description: 中介者模式：用一个中介对象封装一系列的对象交互，中介者使各对象不需要显示地相互作用，
 *               从而使其耦合松散，而且可以独立地改变它们之间的交互
 * @author chengwy
 * @date 2018年9月3日
 *
 */
public class App {
	public static void main(String[] args) {
		Colleague colleagueA = new ConcreteColleagueA();
		Colleague colleagueB = new ConcreteColleagueB();

		Mediator mediator = new ConcreteMediator(colleagueA, colleagueB);
		colleagueA.setMediator(mediator);
		colleagueB.setMediator(mediator);

		((ConcreteColleagueA) colleagueA).notifyColleagueB();
		((ConcreteColleagueB) colleagueB).notifyColleagueA();
	}
}
