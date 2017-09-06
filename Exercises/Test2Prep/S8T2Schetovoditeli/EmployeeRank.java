package S8T2Schetovoditeli;

public enum EmployeeRank {
	JUNIOR(2.5), MID(1.8), SENIOR(1.0);
	
	private double val;
	private EmployeeRank(double a){
		this.val = a;
	}
	
	public double getValue(){
		return this.val;
	}
}
