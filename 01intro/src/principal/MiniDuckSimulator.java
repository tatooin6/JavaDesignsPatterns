package principal;

import principal.behaviorClasses.FlyRocketPowered;

public class MiniDuckSimulator {

	public static void main(String[] args) {
		// Implementation
		Duck mallard = new MallardDuck();
		mallard.performFly();
		mallard.performQuack();
		System.out.println("-------------");
		Duck model = new ModelDuck();
		model.performFly();
		model.setFlyBehavior(new FlyRocketPowered());
		model.performFly();
	}

}
