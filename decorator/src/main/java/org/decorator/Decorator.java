package org.decorator;

public abstract class Decorator extends Component {
	private Component component;

	public Decorator(Component component) {
		super();
		this.component = component;
	}

	@Override
	public void operate() {
		this.component.operate();
	}
}
