package org.command;

/**
    * @ClassName: Invoker
    * @Description: 调用者类
    * @author chengwy
    * @date 2018年9月4日
    *
 */
public class Invoker {
	private Command command;

	public Invoker(Command command) {
		super();
		this.command = command;
	}
	
	/*
	 * 执行命令
	 */
	public void action(){
		this.command.execute();
	}
}
