package appDuck.ducksProcessors;

import frmDuck.DecoyDuck;
import frmDuck.Duck;
import frmDuck.DucksProcessor;
import frmDuck.RubberDuck;

public class DucksProcessorUSA extends DucksProcessor {

	public DucksProcessorUSA(String title) {
		super(title);
	}

	@Override
	public Duck createDuck(String type) {
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
