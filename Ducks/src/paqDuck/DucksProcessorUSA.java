package paqDuck;

public class DucksProcessorUSA extends DucksProcessor {

	public DucksProcessorUSA(String title) {
		super(title);
	}

	@Override
	protected Duck createDuck(String type) {
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
