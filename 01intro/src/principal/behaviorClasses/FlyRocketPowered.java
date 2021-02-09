package principal.behaviorClasses;

import principal.interfaces.FlyBehavior;

public class FlyRocketPowered implements FlyBehavior {

	@Override
	public void fly() {
		System.out.println("I'm powered by a rocket!!!");
	}

}
