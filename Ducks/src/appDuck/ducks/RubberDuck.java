package appDuck.ducks;

import frmDuck.CantFly;
import frmDuck.Duck;
import frmDuck.Squeak;

public class RubberDuck extends Duck {
 
	public RubberDuck() {
		flyBehavior = new CantFly();
		quackBehavior = new Squeak();
	}
 
	public void display() {
		System.out.println("I'm a rubber duckie");
	}
}
