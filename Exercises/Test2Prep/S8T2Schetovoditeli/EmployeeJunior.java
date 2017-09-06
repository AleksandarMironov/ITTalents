package S8T2Schetovoditeli;

public class EmployeeJunior extends Employee{
	public EmployeeJunior(String name, double selary, String dep, Office office) {
		super(name, selary, EmployeeRank.JUNIOR, dep);
	}
}
