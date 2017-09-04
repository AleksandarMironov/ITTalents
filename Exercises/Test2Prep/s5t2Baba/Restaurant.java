package s5t2Baba;

import java.util.ArrayList;

public class Restaurant {
	private String name;
	private String addres;
	private double money;
	private Menu menu;
	private ArrayList<Weitres> weitres; 
	
	
	public Restaurant(String name, String addres, double money){
		setName(name);
		setAddres(addres);
		setMoney(money);
		setMenu(); // add 20 bev + 10 food
		this.weitres = new ArrayList<>();
	}
	
	
	public String getName() {
		return this.name;
	}

	private void setName(String name) {
		if(name.isEmpty()){
			System.out.println("Wrong name!");
			this.name = "Pri pesho Talanta";
		} else {
			this.name = name;
		}
	}
	
	public String getAddres() {
		return this.addres;
	}

	private void setAddres(String addres) {
		if(addres.isEmpty()){
			System.out.println("Wrong addres!");
			this.addres = "Sofia";
		} else {
			this.addres = addres;
		}
	}


	public double getMoney() {
		return this.money;
	}


	private void setMoney(double money) {
		if(money > 0){
			this.money = money;
		} else {
			System.out.println("Money must be positive!");
			this.money = 0;
		}
	}


	public Menu getMenu() {
		return this.menu;
	}


	private void setMenu() {
		this.menu = new Menu();
		for (int i = 0; i < 10; i++) {
		
		}
		for (int i = 0; i < 20; i++) {
			
		}
	}


	public ArrayList<Weitres> getWeitres() {
		return this.weitres;
	}


	public void addWeitres(ArrayList<Weitres> weitres) {
		this.weitres.addAll(weitres);
	}
	
	public void addWeitres(Weitres weitres) {
		this.weitres.add(weitres);
	}
	
	public void addMoney (double money){
		this.money += money;
	}
	
	public void removeMoney (double money){
		this.money -= money;
	}
}
