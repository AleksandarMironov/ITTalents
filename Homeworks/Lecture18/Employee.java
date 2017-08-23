
public class Employee extends Person {

	private double daySalary;
	
	public Employee(String name, int age, boolean isMale, double daySalary) {
		super(name, age, isMale);
		
		setDaySalary(daySalary);
	}

	private void setDaySalary(double daySalary) {
		if(daySalary < 0){
			this.daySalary = 0;
		} else {
			this.daySalary = daySalary;
		}
	}
	
	public double calculateOvertime(double hours){
		if(super.age < 18){
			return 0;
		}
		return this.daySalary * 1.5;
	}
	
	public void showEmployeeInfo(){
		super.showPersonInfo();
		System.out.println("My day salary is " + this.daySalary + (super.age < 18? " but don not tell!!! I am underage!" : ""));
	}
	
}
