package org.strategy;

/**
    * @ClassName: Context
    * @Description: 封装角色
    * @author chengwy
    * @date 2018年9月7日
    *
 */
public class Context {
	/*
	 * 抽象策略
	 */
	private Strategy strategy;

	public Context(Strategy strategy) {
		super();
		this.strategy = strategy;
	}
	/*
	 * 封装后的策略方法
	 */
	public void doAnything(){
		this.strategy.doSomething();
	}
	
}
