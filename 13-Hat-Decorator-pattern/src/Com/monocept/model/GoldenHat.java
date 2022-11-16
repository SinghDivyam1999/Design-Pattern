package Com.monocept.model;

public class GoldenHat extends HatDecorator {
	private IHat hat;

	public GoldenHat(IHat hat) {
		super(hat);
	}

	@Override
	public String getName() {
		return " Golden Hat";
	}

	@Override
	public String getPrice() {
		return "3000";
	}

	@Override
	public String getDescription() {
		return "Golden Color";
	}

}