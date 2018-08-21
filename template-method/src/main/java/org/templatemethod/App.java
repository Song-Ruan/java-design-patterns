package org.templatemethod;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class App {
	private static final Logger logger = LoggerFactory.getLogger(App.class);

	public static void main(String[] args) {
		TripTemplate template = new TrainTrip("wycheng", "nanjing", "hangzhou");
		logger.info(template.trip());

		template = new BikeTrip("wycheng", "hangzhou", "shanghai");
		logger.info(template.trip());
	}
}
