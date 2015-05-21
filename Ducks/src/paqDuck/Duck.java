package paqDuck;
public class Duck {
	FlyBehavior flyBehavior;
	QuackBehavior quackBehavior;
	
	public Duck() {}
	
	public void setFlyBehavior (FlyBehavior fb) {
		flyBehavior = fb;
	}
	
	public void setQuackBehavior (QuackBehavior qb) {
		quackBehavior = qb;
	}
	
	void display() {
		System.out.println("I'm a duck");
	}
	
	public void performFly() {
		flyBehavior.fly();
	}
	
	public void performQuack() {
		quackBehavior.quack();
	}
	
	public void swim() {
		System.out.println("All ducks float, even decoys!");
	}
}
