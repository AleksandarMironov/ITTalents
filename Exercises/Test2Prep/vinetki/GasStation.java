package vinetki;

import java.util.ArrayList;

public class GasStation {
	private double money;
	private ArrayList<Vinete> vinetes;
	
	public GasStation() {
		this.money = 0;
		
	}
	
	public void getVineteInfo(){
		for (Vinete vinete : vinetes) {
			System.out.println(vinete);
		}
	}
	
}
