package appDuck.ducksProcessors;

import appDuck.ducks.DecoyDuck;
import appDuck.ducks.MallardDuck;
import appDuck.ducks.RedheadDuck;
import appDuck.ducks.RubberDuck;
import frmDuck.Duck;
import frmDuck.DucksProcessor;

public class DucksProcessorMXUSA extends DucksProcessor {

	public DucksProcessorMXUSA(String title) {
		super(title);
	}

	@Override
	public Duck createDuck(String type) {
		if (type.equals("Mallard"))
		{
			return new MallardDuck();
		}
		else
			if (type.equals("Redhead"))
			{
				return new RedheadDuck();
			}
			else
				if (type.equals("Decoy"))
				{
					return new DecoyDuck();
				}
				else
					if (type.equals("Rubber"))
					{
						return new RubberDuck();
					}
					else
						return null;
	}

}
