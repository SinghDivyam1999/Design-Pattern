package Com.monocept.test;

import Com.monocept.model.GoldenHat;
import Com.monocept.model.IHat;
import Com.monocept.model.PremiumHat;
import Com.monocept.model.RibonelHat;
import Com.monocept.model.StanderdHat;

public class HatDecoratorTest {
	public static void main(String[] args) {
		

	IHat hat=new StanderdHat();
	IHat hat2=new PremiumHat();
	
	GoldenHat gh=new GoldenHat(hat);
	System.out.println("The price is: "+gh.getPrice()+", Name is: "+gh.getName()+", Description is: "+gh.getDescription());
	
		
	
RibonelHat rb=new RibonelHat(hat2);
System.out.println("The price is: "+rb.getPrice()+", Name is: "+rb.getName()+", Description is: "+rb.getDescription());


	}
}
