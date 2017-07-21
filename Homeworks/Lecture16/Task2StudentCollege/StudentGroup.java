package Task2StudentCollege;

public class StudentGroup {
	String groupSubject;
	Student [] students;
	int freePlaces;
	
	public StudentGroup() {		
		setFreePlaces(5);
		this.students = new Student [this.freePlaces];
	}
	
	public StudentGroup(String subject) {
		this();
		setGroupSubject(subject);
	}
	
	private void setGroupSubject(String groupSubject) {
		if(!groupSubject.isEmpty()){
			this.groupSubject = groupSubject;
		} else {
			System.out.println("You did not entered group subject. Now you have Java group!");
			this.groupSubject = "Java";
		}
	}

	private void setFreePlaces(int freePlaces) {
		if(freePlaces < 2){
			System.out.println("Group must have atleast 2 students!");
			this.freePlaces = 2;
		} else {
			this.freePlaces = freePlaces;
		}
	}


	
	void addStudent (Student s){
		if (s.subject.equalsIgnoreCase(this.groupSubject)) {
			if (this.freePlaces > 0){
				this.students[this.students.length - this.freePlaces] = s;
				this.freePlaces--;
			} else {
				System.out.println("No free places");
			}
		} else {
			System.out.println("Wrong subject");
		}	
	}
	
	void emptyGroup(){
		this.students = new Student [5];
		this.freePlaces = 5;
	}
	
	String theBestStudent(){
		if(this.students[0] == null){
			return "There is no students in group!!!";
		}
		Student best = this.students[0];
		for (int i = 1; i < this.students.length - this.freePlaces; i++) {
			if(best.grade < this.students[i].grade){
				best = this.students[i];
			}
		}
		return "Best student in group " + this.groupSubject + " is " + best.name;
	}
	
	void printStudentsInGroup(){
		if(this.students[0] == null){
			System.out.println("There is no students in group!!!");
			return;
		}
		System.out.println("Students in " + this.groupSubject);
		for(Student st : this.students){
			if(st != null){
				System.out.println(st.name);
			}
		}
	}
}
