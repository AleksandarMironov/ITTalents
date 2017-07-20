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
		this.name = name;
		this.subject = subject;
		if(age > 0){
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
