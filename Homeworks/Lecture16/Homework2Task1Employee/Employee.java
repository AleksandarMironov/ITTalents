package Homework2Task1Employee;

public class Employee {
	private String name; 
	private Task currentTask; 
	private double hoursLeft;
	
	public Employee (String name){
		setName(name);
	}
	
	private void setName(String name) {
		if(!name.isEmpty()){
			this.name = name;
		} else {
			System.out.println("Name is empty");
			this.name = "Unknown name!";
		}	
	}

	public String getName(){
		return "My name is: " + this.name;
	}
	
	public double getHoursLeft(){
		return this.hoursLeft;
	}
	
	public void setHoursLeft (double newHoursLeft){
		if (newHoursLeft >= 0){
			this.hoursLeft = newHoursLeft;
		}
	}
	
	public void setCurrentTask (Task newTask){
		if (this.currentTask == null || this.currentTask.getWorkingHours() == 0){
			this.currentTask = newTask;
		} else {
			System.out.println("NO!! I have another work!");
		}
	}
	
	public void work(){
		showReport();
		
		if(this.currentTask == null || this.currentTask.getWorkingHours() == 0){
			System.out.println("I do not have available task!");
			
		} else if (this.currentTask.getWorkingHours() >= this.hoursLeft) {
			this.currentTask.setWorkingHours(this.currentTask.getWorkingHours() - this.hoursLeft);
			this.hoursLeft = 0;
			
		} else if (this.currentTask.getWorkingHours() < this.hoursLeft){ // only else is fine, but like this is more readable 
			this.hoursLeft -= this.currentTask.getWorkingHours();
			this.currentTask.setWorkingHours(0);			
		}
	}
	
	public void showReport(){ 
		System.out.println("Name: " + this.name);
		System.out.println("Task: " + ((this.currentTask == null)? "No task!" : this.currentTask.getName()));
		System.out.println("Work hours left: " + this.hoursLeft);
		System.out.println("Current task hours left: " + ((this.currentTask == null)? "No task!" : this.currentTask.getWorkingHours()));
	}
}
