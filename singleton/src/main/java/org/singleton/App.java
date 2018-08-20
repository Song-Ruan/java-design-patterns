package org.singleton;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.function.Supplier;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class App {
	private static final Logger logger = LoggerFactory.getLogger(App.class);

	public static void main(String[] args) {
		logger.info("isSingletin?" + isSingleton(DoubleCheckSingleton::getInstance));
		logger.info("isSingletin?" + isSingleton(EagerSingleton::getInstance));
		logger.info("isSingletin?" + isSingleton(LazySingleton::getInstance));
		logger.info("isSingletin?" + isSingleton(StaticInnerClassSingleton::getInstance));
	}

	public static boolean isSingleton(Supplier<?> func) {
		Map<String, String> map = new ConcurrentHashMap<>();
		Runnable r = () -> {
			map.put(func.get().toString(), func.get().toString());
		};

		for (int i = 1; i < 100; ++i) {
			Thread t = new Thread(r);
			t.start();
		}
		return map.keySet().size() == 1;
	}

}
