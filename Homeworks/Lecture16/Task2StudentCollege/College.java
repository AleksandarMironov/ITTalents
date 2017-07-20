package Task2StudentCollege;

public class College {
	public static void main(String[] args) {
		Student pesho = new Student("Pesho", "Java/Android", 20);
		Student gosho = new Student("Gosho", "Java/Android", 27);
		Student ivan = new Student("Ivan", "Java/Android", 23);
		Student veso = new Student("Veso", "Java/Android", 25);
		Student desi = new Student("Desi", "Java/Android", 21);
		Student hristo = new Student("Hristo", "Java EE", 20);
		
		StudentGroup android = new StudentGroup("Java/Android");
		StudentGroup javaEE = new StudentGroup("Java EE");
		
		android.addStudent(pesho);
		android.addStudent(gosho);
		android.addStudent(ivan);
		android.addStudent(veso);
		android.addStudent(desi);
		android.addStudent(hristo);
		javaEE.addStudent(desi);
		javaEE.addStudent(hristo);
		
		desi.upYear();
		desi.grade = 5;
		System.out.println("Desis money: " + desi.receiveScholarship(3.5, 150));
		
		android.printStudentsInGroup();
		System.out.println(android.theBestStudent());
		
		javaEE.printStudentsInGroup();
		System.out.println(javaEE.theBestStudent());				
	}
}
