package org.proxy;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @ClassName: App
 * @Description: 代理模式常用，如Spring中的AOP实现（cglib动态代理）。
 *               一般用于将通用的逻辑抽出来，如记录进入、推出日志，事务管理等
 * @author chengwy
 * @date 2018年8月23日
 *
 */
public class App {
	private static final Logger logger = LoggerFactory.getLogger(App.class);

	public static void main(String[] args) {
		Human adult = new Adult();

		Human proxy = new Robot(adult);
		logger.info(proxy.behave());
	}
}
