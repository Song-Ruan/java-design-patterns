package org.prototype;

import java.util.ArrayList;
import java.util.Arrays;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @ClassName: App
 * @Description: Tips:对象拷贝时，构造函数没有被执行，因为Object类的clone方法的原理是从内存中（堆）仪二进制流的方式进行拷贝
 * @author chengwy
 * @date 2018年8月24日
 */
public class App {
	private static final Logger logger = LoggerFactory.getLogger(App.class);

	public static void main(String[] args) {
		Person person = new Person(123, "wycheng", new ArrayList<>(Arrays.asList("ICBC", "BOC", "ABC", "CCB")));

		logger.info(String.format("construct Person by constructor, value:%s", person));
		logger.info(String.format("construct Person by clone, value:%s", person.clone()));
	}
}
