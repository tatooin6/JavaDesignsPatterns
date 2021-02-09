package principal;

import principal.behaviorClasses.*;

public class MallardDuck extends Duck {

	@Override
	public void display() {
		System.out.println("I'm a real mallard Duck!");
	}
	
	public MallardDuck() {
		flyBehavior = new FlyWithWings();
		quackBehavior = new Quack();
	}

}
