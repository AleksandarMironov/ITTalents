
public class Person {
	String name;
	int age;
	boolean isMale;
	
	public Person(String name, int age, boolean isMale){
		setName(name);
		setAge(age);
		setIsMale(isMale);
	}

	private void setName(String name) {
		if(name.isEmpty()){
			System.out.println("You did not enter name! Now your name is Gor!");
			this.name = "Gor";
		} else {
			this.name = name;
		}
	}

	private void setAge(int age) {
		if(age < 0 || age > 155){
			this.age = 0;
		} else {
			this.age = age;
		}
	}

	private void setIsMale(boolean isMale) {
		this.isMale = isMale;
	}
	
	public void showPersonInfo(){
		System.out.println("\nMy name is " + this.name + 
				"\nI am " + this.age + " years old" +
				"\nAnd I am " + (this.isMale? "male" : "female"));
	}
}
