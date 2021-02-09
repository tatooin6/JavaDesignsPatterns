/**
 * 
 */
package principal;

import principal.interfaces.FlyBehavior;
import principal.interfaces.QuackBehavior;

/**
 * @author Tattoo
 *
 */
public abstract class Duck {
	// Interface definition on properties
	FlyBehavior flyBehavior;
	QuackBehavior quackBehavior;
	
	// Constructor
	public Duck() {
		// TODO Auto-generated constructor stub
	}
	
	// display
	public abstract void display();
	
	// Functions
	public void performFly() {
		flyBehavior.fly();
	}
	
	public void performQuack() {
		quackBehavior.quack();
	}
	
	public void swim() {
		System.out.println("All ducks float!");
	}
	
	public void setFlyBehavior (FlyBehavior fb) {
		flyBehavior = fb;
	}
	
	public void setQuackBehavior (QuackBehavior qb) {
		quackBehavior = qb;
	}
	
}
