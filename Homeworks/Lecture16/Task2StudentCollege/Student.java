package Task2StudentCollege;

public class Student {
	String name;
	String subject;
	double grade;
	int yearInCollege;
	int age;
	boolean isDegree;
	double money;
	
	public Student (){
		this.grade = 4.0;
		this.yearInCollege = 1;
		this.isDegree = false;
		this.money = 0;
	}
	
	Student (String name, String subject, int age){
		this();
		setName(name);
		setSubject(subject);
		setAge(age);
	}
	
	private void setName(String name) {
		if(name.isEmpty()){
			System.out.println("You did not enter name! Now your name is Gor!");
			this.name = "Gor";
		} else {
			this.name = name;
		}
	}

	private void setSubject(String subject) {
		if(subject.isEmpty()){
			System.out.println("You did not enter subject! Now are in Java!");
			this.subject = "Java";
		} else {
			this.subject = subject;
		}
	}

	private void setAge(int age) {
		if(age > 0 && age < 155){
			this.age = age;
		} else {
			this.age = 1;
		}
	}

	void upYear(){
		if (this.yearInCollege == 4){
			System.out.println("Student is graduated!");
			
		} else if (this.yearInCollege < 4){
			this.yearInCollege++;
			
			if(this.yearInCollege == 4){
				this.isDegree = true;
			}
		}	
	}
	
	double receiveScholarship (double min, double amount){
		if(min <= this.grade && this.age < 30){
			this.money += amount;
		}
		return this.money;
	}
}
