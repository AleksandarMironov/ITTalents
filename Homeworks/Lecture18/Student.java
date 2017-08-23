
public class Student extends Person {
	private double score;
	
	public Student(String name, int age, boolean isMale, double score){
		super(name, age, isMale);
		setScore(score);
	}
	
	private void setScore(double score) {
		if(2 <= score && score <= 6){
			this.score = score;
		} else {
			System.out.println("Wrong score!");
			this.score = -1;
		}
	}

	public void showStudentInfo(){
		super.showPersonInfo();
		System.out.println("My score is " + this.score);
	}
}
