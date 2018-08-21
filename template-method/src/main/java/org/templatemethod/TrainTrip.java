package org.templatemethod;

public class TrainTrip extends TripTemplate {
	public TrainTrip(String name, String from, String to) {
		super(name, from, to);
	}

	@Override
	protected String vehicle() {
		return "train";
	}
}
