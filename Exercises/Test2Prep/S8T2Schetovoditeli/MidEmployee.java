package S8T2Schetovoditeli;

import java.util.ArrayList;

public class MidEmployee extends Employee implements ITransfer {
	private Office office;
	public MidEmployee(String name, double selary, String dep, Office office) {
		super(name, selary, EmployeeRank.MID, dep);
		this.office = office;
	}

	@Override
	public void transferWork(Document d) {
		ArrayList<Employee> list = office.getEmplFromDep(super.getDep());
		for (int i = 0; i < list.size(); i++) {
			if(list.get(i).getRank().getValue() >= this.getRank().getValue()){
				if(!list.get(i).getName().equals(this.getName())){
					System.out.println("Task " + d.getName() + " is transfered from " + this.getName() + " to " + list.get(i).getName());
					list.get(i).work(d);
					return;
				}
			}
		}
		System.out.println("Problem!! Did not transfer task!");
		this.work(d);
	}

}
