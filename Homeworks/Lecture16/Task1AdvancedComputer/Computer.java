package Task1AdvancedComputer;

public class Computer {
	int year; 
	double price;
	boolean isNotebook;
	double hardDiskMemory;
	double freeMemory; 
	String operationSystem;
	
	Computer(){
		this.isNotebook = false;
		this.operationSystem = "Win XP";
	}
	
	Computer(int year, double price, double hardDiskMemory, double freeMemory){
		this();
		if(year >= 0){
			this.year = year;
		} else {
			this.year = 0;
		}
		
		if(price >= 0){
			this.price = price;
		} else {
			this.price = 0;
		}
		
		if(hardDiskMemory > 0){
			this.hardDiskMemory = hardDiskMemory;
		} else {
			this.hardDiskMemory = 0;
		}
		
		if(freeMemory > hardDiskMemory){
			this.freeMemory = hardDiskMemory;
		} else {
			this.freeMemory = freeMemory;
		}
	}
	
	Computer(int year, double price, boolean isNotebook, double hardDiskMemory, double freeMemory, String operationSystem){
		this(year, price, hardDiskMemory, freeMemory);
		this.isNotebook = isNotebook;
		this.operationSystem = operationSystem;
	}
	
	int comparePrice(Computer c){
		if (this.price > c.price){
			return -1;
		} else if (this.price < c.price){
			return 1;
		} else {
			return 0;
		}
	}
	
	void changeOperationSystem(String newOperationSystem){
		operationSystem = newOperationSystem;
	}
	
	void useMemory(double memory){
		if(freeMemory < memory){
			System.out.println("Not enough free memory!");
		} else {
			freeMemory -= memory;
		}
	}
	
	
	
	public String toString(){
		StringBuilder sb = new StringBuilder();
		sb.append("This computer is produced at ").append(year).append(" year.\n");
		sb.append("Price of the computer was: $").append(price).append("\n");
		sb.append("Computer is ").append(isNotebook? "portable\n" : "NOT portable\n");
		sb.append("Operation system: ").append(operationSystem).append("\n");
		sb.append("Hard disk capacity: ").append(hardDiskMemory);
		sb.append("\nFree memory: ").append(freeMemory).append("\n");
		return sb.toString();
	}
}
