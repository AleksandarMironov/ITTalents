package Task1;

public class Demo {
	public static void main(String[] args) {
		Computer firstComputer = new Computer();
		Computer secondComputer = new Computer();
		
		firstComputer.year = 2016;
		firstComputer.price = 899.99;
		firstComputer.isNotebook = false;
		firstComputer.operationSystem = "Linux";
		firstComputer.hardDiskMemory = 1000000;
		firstComputer.freeMemory = 950000;
		
		secondComputer.year = 2017;
		secondComputer.price = 1399.99;
		secondComputer.isNotebook = true;
		secondComputer.operationSystem = "Windows";
		secondComputer.hardDiskMemory = 1000000;
		secondComputer.freeMemory = 900000;
		
		firstComputer.changeOperationSystem("Windows");
		secondComputer.useMemory(1200);
		
		System.out.println("First computer:");
		System.out.println(firstComputer);
		
		System.out.println("Second computer:");
		System.out.println(secondComputer);
	}
}
