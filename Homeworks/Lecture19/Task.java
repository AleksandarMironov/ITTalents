public class Task {
	private String name;
	private double workingHours;
	
	public Task(String name, double workingHours){
		setName(name);

		setWorkingHours(workingHours);
	}

	private void setName(String name) {
		if(!name.isEmpty()){
			this.name = name;
		} else {
			System.out.println("Name is empty");
			this.name = "Unknown Task";
		}
	}

	public double getWorkingHours() {
		return this.workingHours;
	}

	public void setWorkingHours(double workingHours) {
		if (workingHours >= 0){
			this.workingHours = workingHours;
		} else {
			System.out.println("Working hours can't be negative!");
			this.workingHours = 0;
		}
	}

	public String getName() {
		return this.name;
	}
}
