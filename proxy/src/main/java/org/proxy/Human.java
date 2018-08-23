package org.proxy;

public abstract class Human {
	private String name;
	
	protected abstract String behave();

	@Override
	public String toString() {
		return "Human [name=" + name + "], Can do: "+behave();
	}
}
