package vinetki;

import java.time.LocalDate;

public abstract class Vehicle {
	private String model;
	private int year;
	private Vinete vinete;
	private Shoffer owner;
	
	public Vehicle(String model, int year) {
		
		if(!model.isEmpty() && model != null){
			this.model = model;
		} else {
			System.out.println("Wrong model name!");
			this.model = "Unnamed";
		}

		if(year <= LocalDate.now().getYear()){
			this.year = year;
		} else {
			System.out.println("Wrong year!");
			this.year = LocalDate.now().getYear();
		}
		this.vinete = null;
		this.owner = null;
	}

	public String getModel() {
		return this.model;
	}

	public int getYear() {
		return this.year;
	}

	public String getOwnerName() {
		return this.owner.getName();
	}

	public void setNewOwner(Shoffer owner) {
		if(this.owner == null){
			this.owner = owner;
		} else {
			System.out.println("ERR! Vehicle have owner!");
		}	
	}
	
	void addVinete(Vinete v){
		if(v != null){
			if(v.validThru().compareTo(LocalDate.now()) != -1){
				this.vinete = v;
				v.applay();
			} else{
				System.out.println("This vinete is old!");
			}
		} else {
			System.out.println("ERR!");
		}
	}
	
	public LocalDate getVineteExpDate() {
		return this.vinete.validThru();
	}

	@Override
	public String toString() {
		return "Vehicle [model=" + model + ", owner=" + owner.getName() + "]";
	}
	
	
}
