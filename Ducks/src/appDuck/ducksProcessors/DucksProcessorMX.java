package appDuck.ducksProcessors;

import appDuck.ducks.MallardDuck;
import appDuck.ducks.RedheadDuck;
import frmDuck.Duck;
import frmDuck.DucksProcessor;

public class DucksProcessorMX extends DucksProcessor {

	public DucksProcessorMX(String title) {
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
				return null;
	}
}
