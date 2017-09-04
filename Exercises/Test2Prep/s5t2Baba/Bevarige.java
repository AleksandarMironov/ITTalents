package s5t2Baba;

public abstract class Bevarige {
	private double price;
	
	public Bevarige (double price){
		setPrice(price);
	}

	public double getPrice() {
		return this.price;
	}

	private void setPrice(double price) {
		if(price > 0){
			this.price = price;
		} else {
			System.out.println("price must be positive!");
			this.price = 0;
		}
	}
	
	
}
