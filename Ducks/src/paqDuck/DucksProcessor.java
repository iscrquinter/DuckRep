package paqDuck;

import java.util.LinkedList;
import java.util.List;

public abstract class DucksProcessor {
	List<Duck> ducks;
	
	public DucksProcessor(String title)
	{
		System.out.println(title);
		ducks=new LinkedList<Duck>();
	}
	
// Factory Method ------------------------------------------------	
	
	protected abstract Duck createDuck(String type);
		
	public void processDucks() {
		for (Duck d : ducks) {
			System.out.println("--------------------");
			System.out.println("Name: " + d.getClass().getName());
			d.display();
			d.performQuack();
			d.performFly();
			d.swim();
		}
		System.out.println("Done processing ducks\n");
	}
	
	public void addDuck(Duck d)
	{
		ducks.add(d);
	}
 }
