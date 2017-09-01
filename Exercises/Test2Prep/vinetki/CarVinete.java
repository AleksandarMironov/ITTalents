package vinetki;

import java.awt.Color;
import java.time.LocalDate;
import java.time.Period;


public class CarVinete extends Vinete {
	private static final double basePrice = 5.00;
	private static final Color color = Color.GREEN;
	
	public CarVinete(VineteType t){
		super((basePrice*t.getValue()),LocalDate.now(), LocalDate.now().plus(Period.ofDays(t.getValidity())), color);
	}

	@Override
	public void applay() {
		System.out.println("You need 5 sec to applay this vinete");		
	}
}
