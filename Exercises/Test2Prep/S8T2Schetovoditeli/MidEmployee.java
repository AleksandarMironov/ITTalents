package S8T2Schetovoditeli;

public class MidEmployee extends Employee implements ITransfer {

	public MidEmployee(String name, double selary, String dep, Office office) {
		super(name, selary, EmployeeRank.MID, dep, office);
	}

	@Override
	public void transferWork() {
		// TODO Auto-generated method stub
		
	}

}
