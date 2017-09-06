package S8T2Schetovoditeli;

import java.util.ArrayList;

public class SeniorEmployee extends Employee implements ITransfer {
	private Office office;
	public SeniorEmployee(String name, double selary, String dep, Office office) {
		super(name, selary, EmployeeRank.SENIOR, dep);
		this.office  = office;
	}

	@Override
	public void transferWork(Document d) {
		ArrayList<Employee> list = office.getEmplFromDep(super.getDep());
		int rand = UT.intInRange(1, (list.size()-1));
		list.get(rand).work(d);
		list.get(rand).getMoreMoney(1.05);
		System.out.println("Task " + d.getName() + " is transfered from " + this.getName() + " to " + list.get(rand).getName());
	}
	
	public void fire(){
		//TODO
	}
}
