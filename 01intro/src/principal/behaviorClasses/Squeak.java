package principal.behaviorClasses;

import principal.interfaces.QuackBehavior;

public class Squeak implements QuackBehavior {

	@Override
	public void quack() {
		System.out.println("Squeak!");
	}

}
