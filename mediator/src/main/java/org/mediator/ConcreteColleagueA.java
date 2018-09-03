package org.mediator;

public class ConcreteColleagueA extends Colleague{
    public void notifyColleagueB() {
        mediator.notifyColleagueB();
    }

    @Override
    public void operation() {
        System.out.print("this is ConcreteColleagueA's operation\n");
    }
}
