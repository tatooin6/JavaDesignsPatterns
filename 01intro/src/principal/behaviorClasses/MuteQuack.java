package principal.behaviorClasses;

import principal.interfaces.QuackBehavior;

public class MuteQuack implements QuackBehavior {

	@Override
	public void quack() {
		System.out.println("<<Silence>>");
	}

}
