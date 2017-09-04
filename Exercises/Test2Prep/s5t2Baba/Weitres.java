package s5t2Baba;

import java.util.HashMap;

public class Weitres {
	private String name;
	private double tips;
	private HashMap <Customer, Double> bills; 
	
	public Weitres(String name){
		setName(name);
		this.tips = 0;
		this.bills = new HashMap<>();
	}
	
	public String getName() {
		return this.name;
	}

	private void setName(String name) {
		if(name.isEmpty()){
			System.out.println("Wrong name!");
			this.name = "Unnamed";
		} else {
			this.name = name;
		}
	}

	public double getTips() {
		return this.tips;
	}
	
	public void addTips (double tip){
		if(tip > 0){
			this.tips += tip;
		} else {
			System.out.println("Tip must be positive!");
		}
	}
}
