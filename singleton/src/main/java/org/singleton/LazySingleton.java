package org.singleton;

/**
 * @ClassName: LazySingleton
 * @Description: 懒汉式单例
 * @author chengwy
 * @date 2018年8月20日
 *
 */
public class LazySingleton {
	private static LazySingleton intance;

	private LazySingleton() {
	}
	/**
	    * @Title: getInstance
	    * @Description: 加锁确保线程安全（效率较低）
	    * @param @return    参数
	    * @return LazySingleton    返回类型
	    * @throws
	 */
	public static synchronized LazySingleton getInstance() {
		if (intance == null) {
			intance = new LazySingleton();
		}
		return intance;
	}
}
