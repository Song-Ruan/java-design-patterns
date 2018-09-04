package org.command;

public class ConcreteCommand2 extends Command {
	/*
	 * 使用哪个Receiver类进行命令处理
	 */
	private Receiver receiver;
	
	public ConcreteCommand2(Receiver receiver) {
		super();
		this.receiver = receiver;
	}

	@Override
	public void execute() {
		this.receiver.doSomething();
	}
}
