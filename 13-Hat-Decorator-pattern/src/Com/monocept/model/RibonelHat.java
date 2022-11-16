package Com.monocept.model;

public class RibonelHat extends HatDecorator {

	public RibonelHat(IHat hat) {
		super(hat);
		// TODO Auto-generated constructor stub
	}
	@Override
	public String getName() {
		return hat.getName()+" Ribonel Hat";
	}

	@Override
	public String getPrice() {
		return hat.getPrice()+" 50 more";
	}

	@Override
	public String getDescription() {
		return hat.getDescription()+ " Yellow Color";
	}
}
