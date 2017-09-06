package S8T2Schetovoditeli;

public class SeniorEmployee extends Employee implements ITransfer {

	public SeniorEmployee(String name, double selary, String dep, Office office) {
		super(name, selary, EmployeeRank.SENIOR, dep, office);
	}

	@Override
	public void transferWork() {
		// TODO Auto-generated method stub
		
	}
	
	public void fire(){
		
	}
}
