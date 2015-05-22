package appDuck.ducksProcessors;

import frmDuck.Duck;
import frmDuck.DucksProcessor;
import frmDuck.MallardDuck;
import frmDuck.RedheadDuck;

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
