package paqDuck;

public class DucksProcessorMX extends DucksProcessor {

	public DucksProcessorMX(String title) {
		super(title);
	}

	@Override
	protected Duck createDuck(String type) {
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
