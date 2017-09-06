package S8T2Schetovoditeli;

import java.util.ArrayList;

public class Dep {
	private String name;
	private ArrayList<Employee> employees;
	
	public Dep(String name) {
		
		this.name = name;
		this.employees = new ArrayList<>();
	}
	
	public void addEmployee(Employee e){
		this.employees.add(e);
	}
	
	public int workersNumber(){
		return this.employees.size();
	}

	public String getName() {
		return name;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}
	
	
	
}
