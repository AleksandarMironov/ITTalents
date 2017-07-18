package Task1AdvancedComputer;

public class Demo {
	public static void main(String[] args) {
		Computer a = new Computer(2016, 1000.99, false, 1024, 950, "Linux");
		Computer b = new Computer(2017, 1299.99, 2048, 1930);
		Computer c = new Computer(2017, 1999.9, true, 5000, 4500, "Windows 10");
		
		if(a.comparePrice(b) == 1){
			System.out.println("Computer a is cheaper than b");
		}
		
		if(b.comparePrice(c) == 1){
			System.out.println("Computer c is priciest!");
		}
	}
}
