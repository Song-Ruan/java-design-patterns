package org.singleton;

/**
 * @ClassName: StaticInnerClassSingleton
 * @Description: 使用静态内部类延迟加载形式的单例模式（利用JVM特性保证线程安全）
 * @author chengwy
 * @date 2018年8月20日
 *
 */
public class StaticInnerClassSingleton {
	private StaticInnerClassSingleton() {
	}

	public static StaticInnerClassSingleton getInstance() {
		return HelperHolder.INSTANCE;
	}

	private static class HelperHolder {
		private static final StaticInnerClassSingleton INSTANCE = new StaticInnerClassSingleton();
	}
}
