package AdvancedTaskCarHomework;

public class Demo {
	public static void main(String[] args) {
		Person pesho = new Person("Pesho", "8010102326", 37, 'M', 68);
		Person ivan = new Person("Ivan", "9010108325", 27, 'M', 88);
		Person ivanka = new Person("Ivanka", "9210108325", 25, 'F', 48);
		
		Car reno = new Car("Clio", "blue");
		Car citroen = new Car("C5", "black");
		Car audi = new Car("RS6", "dark blue");
		Car mercedess = new Car("G-klasse", "braun");
		Car kia = new Car("nekva", "green");
		Car fiat = new Car("Croma", "blue");
		Car bmw = new Car("X6", "red");
		
		CarShop shop = new CarShop(10);
		
		shop.addCar(reno);
		shop.addCar(citroen);
		shop.addCar(audi);
		shop.addCar(mercedess);
		shop.addCar(kia);
		shop.addCar(fiat);
		shop.addCar(bmw);
		
		pesho.addNewFriend(ivan);
		pesho.addNewFriend(ivanka);
		
		shop.showAllCarsInTheShop();
		shop.sellNextCar(pesho);
		
		System.out.println(bmw.getOwner().getName());
		bmw.setMaxSpeed(300, pesho);
		System.out.println(bmw);
		
		fiat.accelerate();
		
		System.out.println(fiat);
		
	}
}
