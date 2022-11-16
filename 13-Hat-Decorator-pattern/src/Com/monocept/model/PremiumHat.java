package Com.monocept.model;

public class PremiumHat implements IHat {

	@Override
	public String getName() {
		return "Leather top";
	}

	@Override
	public String getPrice() {
		return "600";
	}

	@Override
	public String getDescription() {
		return "Its premium and heavy";
	}

}
