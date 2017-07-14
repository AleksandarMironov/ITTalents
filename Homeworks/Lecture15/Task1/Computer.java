package Task1;

public class Computer {
	short year; 
	double price;
	boolean isNotebook;
	double hardDiskMemory;
	double freeMemory; 
	String operationSystem;
	
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
