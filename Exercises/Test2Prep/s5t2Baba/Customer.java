package s5t2Baba;

public abstract class Customer {
	private static int hashCode;
	private double money;

	public Customer(double money) {
		setMoney(money);
	}

	public double getMoney() {
		return this.money;
	}

	private void setMoney(double money) {
		if(money >= 0){
			this.money = money;
		} else {
			this.money = 0;
			System.out.println("ERR! Money must be positive! Set to 0!");
		}
	}
	
	public boolean pay(double money){
		if(money <= this.money){
			this.money -= money;
			return true;
		} else {
			return false;
		}
	}
	
}
