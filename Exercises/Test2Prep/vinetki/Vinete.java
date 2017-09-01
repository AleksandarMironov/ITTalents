package vinetki;

import java.awt.Color;
import java.time.LocalDate;

public abstract class Vinete {
	
	private double price;
	private LocalDate validThru;
	private LocalDate buyDate;
	private Color color;
	
	public Vinete(double price, LocalDate validThru, LocalDate buyDate, Color color) {
		this.buyDate = buyDate;
		this.price = price;
		this.validThru = validThru;
		this.color = color;
	}

	public abstract void applay();
	
	public LocalDate validThru(){
		return this.validThru;
	}

	public double getPrice() {
		return this.price;
	}

	@Override
	public String toString() {
		return "price= " + price + ", color= " + color;
	}
	
}
