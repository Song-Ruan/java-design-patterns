package org.templatemethod;

public class BikeTrip extends TripTemplate {
	public BikeTrip(String name, String from, String to) {
		super(name, from, to);
	}

	@Override
	protected String vehicle() {
		return "bike";
	}
}
