package org.chain_of_responsibility;

public abstract class Handler {
	private Handler nextHandler;
	/*
	 * 每一个处理者都有一个处理级别
	 */
	protected abstract Level getHandlerLevel();
	/*
	 * 每个处理者都必须实现处理任务
	 */
	protected abstract Response echo(Request request );
	
	public final Response handleMessage(Request request){
		Response response = null;
		
		/**
		 * 判断是否是自己处理的级别
		 */
		if(this.getHandlerLevel().equals(request.getRequestLevel())){
			response = this.echo(request);
		}else{
			/**
			 * 不属于自己的处理级别; 判断是否有下一个处理者
			 */
			if(this.nextHandler!=null){
				response = this.nextHandler.handleMessage(request);
			}else{
				/*
				 * 没有适当的处理者，业务自行处理
				 */
				;
			}
		}
		return response;
	}

	/**
	    * @Title: setNextHandler
	    * @Description: 设置后继处理者
	    * @param @param nextHandler    参数
	    * @return void    返回类型
	    * @throws
	 */
	public void setNextHandler(Handler nextHandler) {
		this.nextHandler = nextHandler;
	}
}
