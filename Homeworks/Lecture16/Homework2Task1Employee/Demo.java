package Homework2Task1Employee;

public class Demo {
	public static void main(String[] args) {
		Task doHomework = new Task("Homework", 9.5);
		Task drink = new Task("New vodka test", 4);
		Task makeShisha = new Task("Make shisha", 0.5);
		
		Employee pesho = new Employee("Pesho");
		Employee desi = new Employee("Desi");
		Employee teo = new Employee("Teo");
		
		desi.work();
		System.out.println();
		
		pesho.setHoursLeft(4);
		pesho.setCurrentTask(drink);
		pesho.setCurrentTask(makeShisha);
		
		desi.setHoursLeft(8);
		desi.setCurrentTask(makeShisha);
		
		teo.setHoursLeft(8);
		teo.setCurrentTask(doHomework);
		
		System.out.println();
		pesho.work();
		System.out.println();
		desi.work();
		System.out.println();
		teo.work();	
	}
}
