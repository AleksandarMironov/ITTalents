package AdvancedTaskCarHomework;

public class Car {
	private String model;
	private int maxSpeed = 250;
	private double currentSpeed = 0;
	private String color;
	private int currentGear = 0;
	private Person owner = new Person("Car shop", "0000000000");
	
	public Car (String model, String color){
		setModel(model);
		setColor(color);		
	}
	
	public void accelerate(){
		if(this.currentSpeed < this.maxSpeed){
			this.currentSpeed++;
		} else {
			System.out.println("Car is on max speed!");
		}		
	}
	
	public void deaccelerate(){
		if(this.currentSpeed > 0){
			this.currentSpeed--;
		} else {
			System.out.println("Car is STOPED");
		}		
	}
	
	public void changeGearUp() {
		if(this.currentGear < 6) {
			this.currentGear++;
		} else {
			System.out.println("You are on top gear");
		}
	} 
	
	public void changeGearDown() {
		if(this.currentGear > -1 ) {
			this.currentGear--;
		} else {
		System.out.println("You are now on reverce gear!!!");
		}
	} 
	
	public void changeGear(int nextGear) {
		if(nextGear > 0 && nextGear < 6) {
			this.currentGear = nextGear;
		}
	}
	
	public void changeColor(String newColor, Person p){
		if(this.owner.getName().equals(p.getName()) && !newColor.isEmpty()){
			this.color = newColor;
		}
	}

	public int getMaxSpeed() {
		return this.maxSpeed;
	}

	public void setMaxSpeed(int maxSpeed, Person p) {
		if(this.owner.getName().equals(p.getName()) && maxSpeed > 0){
			this.maxSpeed = maxSpeed;
		}
	}

	public Person getOwner() {
		return this.owner;
	}

	public void setOwner(Person owner) {
		if(this.owner == null || this.owner.getName().equals("Car shop")){
			this.owner = owner;
		}	
	}

	public String getModel() {
		return this.model;
	}

	public double getCurrentSpeed() {
		return this.currentSpeed;
	}

	public int getCurrentGear() {
		return this.currentGear;
	}
	
	public String getColor(){
		return this.color;
	}
	
	private void setModel(String model) {
		if(!model.isEmpty()){
			this.model = model;
		} else {
			System.out.println("Name can not be empty! Now you have Trabi!");
			this.model = "trabiiiii";
		}
	}

	private void setColor(String color) {
		if(!color.isEmpty()){
			this.color = color;
		} else {
			System.out.println("Color is not entered! Now you have white car!");
			this.color = "white";
		}
	}
		
	@Override
	public boolean equals(Object obj) {
		Car c = (Car) obj;
		if(c == null){
			return false;
		}
		
		if(this.model.equals(c.model)){
			if(this.owner.getName().equals(c.owner.getName())){
				if(this.owner.getEgn().equals(c.owner.getEgn())){
					return true;
				}
			}
		}	
		return false;
	}
		
	@Override
	public String toString(){
		return "\nModel: " + this.model + 
				"\nColor: " + this.color + 
				"\nMax speed: " + this.maxSpeed + 
				"\nOwner: " + this.owner.getName() + "\n";
	}
}
