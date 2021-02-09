package principal.behaviorClasses;

import principal.interfaces.FlyBehavior;

public class FlyWithWings implements FlyBehavior{

	@Override
	public void fly() {
		System.out.println("I'm Flying!");
	}

}
