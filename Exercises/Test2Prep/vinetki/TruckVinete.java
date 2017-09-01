package vinetki;

import java.awt.Color;
import java.time.LocalDate;
import java.time.Period;


public class TruckVinete extends Vinete {
	private static final double basePrice = 7.00;
	private static final Color color = Color.BLACK;
	
	public TruckVinete(VineteType t){
		super((basePrice*t.getValue()),LocalDate.now(), LocalDate.now().plus(Period.ofDays(t.getValidity())), color);
	}

	@Override
	public void applay() {
		System.out.println("You need 10 sec to applay this vinete");		
	}
}