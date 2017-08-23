
public class Demo {
	public static void main(String[] args) {
		Person pesho = new Person("Pesho", 18, true);
		Person gosho = new Person("Gosho", 38, true);
		Person ivan = new Person("Ivan", 25, true);
		Person toni = new Person("Toni", 21, false);
		Person ani = new Person("Ani", 26, false);
		Person stefomir = new Person("Stefomir", 45, true);
		Person sasho = new Person("Sasho", 16, true);
		Person stefan = new Person("Stefan", 23, true);
		Person desi = new Person("Desi", 18, false);
		Person hristo = new Person("Hristo", 1, true);
		
		Person kiril = new Person("Kiril", 29, true);
		Person iva = new Person("Iva", 16, false);
		Student aleksandar = new Student("Sasho", 27, true, 5.68);
		Student desislava = new Student("Desi", 25, false, 3.52);
		Employee vladi = new Employee("Vladi", 29, true, 73.25);
		Employee vili= new Employee("Vili", 17, false, 91.13);
		
		Person [] arr = {kiril, iva, aleksandar, desislava, vladi, vili};
		
		for(int i = 0; i < arr.length; i++){
			if(arr[i] instanceof Employee){
				((Employee)arr[i]).showEmployeeInfo();
				System.out.println();
				
			} else if(arr[i] instanceof Student){
				((Student)arr[i]).showStudentInfo();
				System.out.println();
				
			} else {
				arr[i].showPersonInfo();
				System.out.println();
			}
		}
		
		for (Person person : arr){
			if(person instanceof Employee){
				System.out.println(((Employee)person).calculateOvertime(2));
			}
		}
	}
}
