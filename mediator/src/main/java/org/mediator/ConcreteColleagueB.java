package org.mediator;

public class ConcreteColleagueB extends Colleague{
    public void notifyColleagueA() {
        mediator.notifyColleagueA();
    }

    @Override
    public void operation() {
        System.out.print("this is ConcreteColleagueB's operation\n");
    }
}
