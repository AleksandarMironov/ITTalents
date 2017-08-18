
public class Demo {
	public static void main(String[] args) {
		Employee pesho = new Employee("Pesho");
		Employee desi = new Employee("Desi");
		Employee teo = new Employee("Teo");
		
		AllWork tasks = new AllWork();
		
		Task doHomework = new Task("Homework", 9.5);
		Task drink = new Task("New vodka test", 4);
		Task makeShisha = new Task("Make shisha", 0.5);
		Task fixFrontEnd = new Task("Fix site", 15);
		Task makeNewSite = new Task("Make site", 40);
		Task eat = new Task("Eating", 2);
		Task smoke = new Task("!moke", 1);
		Task makeFood = new Task("Making diner", 7);
		Task test = new Task("New site test", 15);
		
		tasks.addTask(doHomework);
		tasks.addTask(drink);
		tasks.addTask(makeFood);
		tasks.addTask(makeShisha);
		tasks.addTask(fixFrontEnd);
		tasks.addTask(eat);
		tasks.addTask(smoke);
		tasks.addTask(makeNewSite);
		tasks.addTask(test);
		
		pesho.setAllWork(tasks);
		teo.setAllWork(tasks);
		desi.setAllWork(tasks);
		
		Employee [] workers = {pesho, desi, teo};
		
		while(true){
			System.out.println("\nNew day - new work! :)\n");
			for(Employee e : workers){
				e.startWorkingDay();
			}
			
			for(Employee e : workers){
				while(e.getHoursLeft() > 0 && !tasks.isAllWorkDone()){
					e.work();
				}
			}
			if(tasks.isAllWorkDone()){
				System.out.println("All work is done!!!");
				break;
			}
		}
		
		
	}
}
