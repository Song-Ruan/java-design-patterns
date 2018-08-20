package org.singleton;

/**
 * @ClassName: DoubleCheckSingleton
 * @Description: 双重检查锁方式的单例，解决懒汉式的低效率问题
 * @author chengwy
 * @date 2018年8月20日
 */
public class DoubleCheckSingleton {
	private static volatile DoubleCheckSingleton instance;

	private DoubleCheckSingleton() {
	}

	public static DoubleCheckSingleton getInstance() {
		DoubleCheckSingleton result = instance;
		if (result == null) {
			synchronized (DoubleCheckSingleton.class) {
				result = instance;
				if (result == null) {
					instance = result = new DoubleCheckSingleton();
				}
			}
		}
		return result;
	}
}
