package org.singleton;

/**
 * @ClassName: Singleton
 * @Description: 饿汉式单例（线程安全）
 * @author chengwy
 * @date 2018年8月20日
 */
public class EagerSingleton {
	public static final EagerSingleton singleton = new EagerSingleton();

	private EagerSingleton() {
	}

	public static EagerSingleton getInstance() {
		return singleton;
	}
}
