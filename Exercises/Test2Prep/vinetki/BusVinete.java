package vinetki;

import java.awt.Color;
import java.time.LocalDate;
import java.time.Period;


public class BusVinete extends Vinete {
	private static final double basePrice = 9.00;
	private static final Color color = Color.BLUE;
	
	public BusVinete(VineteType t){
		super((basePrice*t.getValue()),LocalDate.now(), LocalDate.now().plus(Period.ofDays(t.getValidity())), color);
	}

	@Override
	public void applay() {
		System.out.println("You need 20 sec to applay this vinete");		
	}
}