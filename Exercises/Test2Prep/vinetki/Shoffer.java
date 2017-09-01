package vinetki;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class Shoffer {
	private String name;
	private double money;
	private GasStation gasstation;
	private ArrayList<Vehicle> vehicles;
	
	public Shoffer(String name, double money, GasStation gasstation) {

		if(!name.isEmpty() && name != null){
			this.name = name;
		} else {
			System.out.println("Wrong name!");
			this.name = "Unnamed";
		}
		
		if(money >= 0){
			this.money = money;
		} else {
			System.out.println("Wrong money");
			this.money = 0;
		}
		
		this.gasstation = gasstation;
		
		this.vehicles = new ArrayList<>();
	}

	public String getName() {
		return this.name;
	}

	public double getMoney() {
		return this.money;
	}

	public GasStation getGasstation() {
		return this.gasstation;
	}

	public ArrayList<Vehicle> getVehicles() {
		return this.vehicles;
	}
	
	public void buyVineteForAll(){
		//TODO
	}
	
	public void buyVineteForOne(){
		
	}
	
	public void addVehicle(Vehicle v){
		this.vehicles.add(v);
		v.setNewOwner(this);
	}
	
	public ArrayList<Vehicle> checkExpiredVinetes(){
		ArrayList<Vehicle> ret = new ArrayList<>();
		Iterator<Vehicle> it = this.vehicles.iterator();
		while(it.hasNext()){
			Vehicle v = it.next();
			if(v.getVineteExpDate().compareTo(LocalDate.now()) != 1){
				ret.add(v);
			}
		}	
		return (ArrayList<Vehicle>)Collections.unmodifiableList(ret);
	}
}
