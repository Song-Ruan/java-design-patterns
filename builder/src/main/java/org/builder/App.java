package org.builder;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class App {
	private static final Logger logger = LoggerFactory.getLogger(App.class);

	public static void main(String[] args) {
		Person person = new Person(123, "James", 23, "CAVS");
		logger.info(person.toString());

		person = new Person(123, "James", 23, "CAVS", "LA", 40_000_000);
		logger.info(person.toString());

		PersonWithBuilder personWithBuilder = new PersonWithBuilder.Builder(456, "Rose", 21).build();
		logger.info(personWithBuilder.toString());

		personWithBuilder = new PersonWithBuilder.Builder(456, "Rose", 21).school("HOU").build();
		logger.info(personWithBuilder.toString());
	}
}
