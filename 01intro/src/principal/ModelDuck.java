package principal;

import principal.behaviorClasses.*;

public class ModelDuck extends Duck {

	@Override
	public void display() {
		System.out.println("I'm a Model Duck!");
	}
	
	public ModelDuck() {
		flyBehavior = new FlyNoWay();
		quackBehavior = new Quack();
	}

}
