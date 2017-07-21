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
		
		setYear(year);
		
		setPrice(price);
		
		setHardDiskMemory(hardDiskMemory);
		
		setFreeMemory(freeMemory, hardDiskMemory);
	}
	
	private void setYear(int year) {
		if(year >= 0){
			this.year = year;
		} else {
			this.year = 0;
		}
	}

	private void setPrice(double price) {
		if(price >= 0){
			this.price = price;
		} else {
			this.price = 0;
		}
	}

	private void setHardDiskMemory(double hardDiskMemory) {
		if(hardDiskMemory > 0){
			this.hardDiskMemory = hardDiskMemory;
		} else {
			this.hardDiskMemory = 0;
		}
	}

	private void setFreeMemory(double freeMemory, double hardDiskMemory) {
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
		this.operationSystem = newOperationSystem;
	}
	
	void useMemory(double memory){
		if(this.freeMemory < memory){
			System.out.println("Not enough free memory!");
		} else {
			this.freeMemory -= memory;
		}
	}	
	
	@Override
	public String toString(){
		StringBuilder sb = new StringBuilder();
		sb.append("This computer is produced at ").append(this.year).append(" year.\n");
		sb.append("Price of the computer was: $").append(this.price).append("\n");
		sb.append("Computer is ").append(this.isNotebook? "portable\n" : "NOT portable\n");
		sb.append("Operation system: ").append(this.operationSystem).append("\n");
		sb.append("Hard disk capacity: ").append(this.hardDiskMemory);
		sb.append("\nFree memory: ").append(this.freeMemory).append("\n");
		return sb.toString();
	}
}
