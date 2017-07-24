package AdvancedTaskCarHomework;

public class CarShop {
	private final int capacity;
	private Car [] carList;
	
	
	public CarShop(int capacity){
		if(capacity >= 1){
			this.capacity = capacity;
		} else {
			this.capacity = 1;
		}
		
		this.carList = new Car[capacity];
	}
	
	public boolean addCar(Car car){
		for (int i = 0; i < this.carList.length; i++) {
			if(this.carList[i] == null){
				this.carList[i] = car;
				return true;
			}
		}
		return false;
	}
	
	public Car getNextCar(){
		for (int i = carList.length - 1; i >= 0; i--) {
			if(this.carList[i] != null){
				return this.carList[i];
			}
		}
		
		System.out.println("No more cars!");
		return null;
	}
	
	public void sellNextCar(Person buyer){
		Car c = getNextCar();
		c.setOwner(buyer);
		removeCar(c);
	}
	
	public boolean removeCar(Car car){
		for (int i = carList.length - 1; i >= 0; i--) {
			if(this.carList[i] != null && this.carList[i].equals(car)){
				this.carList[i] = null;
				return true;
			}
		}
		return false;
	}
	
	void showAllCarsInTheShop(){
		System.out.println("Cars:");
		int ind = 1;
		for (int i = 0; i < carList.length; i++) {
			System.out.println(ind + "." + this.carList[i]);
			ind++;
		}
	}

	public int getCapacity() {
		return this.capacity;
	}	
}
