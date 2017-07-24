package AdvancedTaskCarHomework;

import java.util.ArrayList;

public class Person {
	private String name;
	private int age = 0;
	private String egn;
	private char sex;
	private double weight = 5;
	private ArrayList<Person> friends; 
	
	public Person(String name, String egn){
		this.friends = new ArrayList<>();
		
		setName(name);
		
		setEgn(egn);
	}
	
	public int getAge() {
		return this.age;
	}

	public String getEgn() {
		return this.egn;
	}

	public char getSex() {
		return this.sex;
	}

	public double getWeight() {
		return this.weight;
	}

	public Person [] getFriends() {
		return this.friends.toArray(new Person [this.friends.size()]);
	}
		
	public String getName(){
		return this.name;
	}
	
	public Person(String name, String eng, int age, char sex, double weight){
		this(name, eng);
		
		if(age >= 0){
			this.age = age;
		}
		
		this.sex = sex;
		
		if(weight >= 0){
			this.weight = weight;
		}
	}
	
	public void eat() {
		System.out.println("Eating...");
	}
	
	public void walk() {
		System.out.println(this.name + " is walking");
	}
	
	public void growUp() {
		this.age++;
	}
	
	public void drinkWater(double liters) {
		if(liters > 1) {
			System.out.println("This is too much water!!!");
		} else {
			System.out.println(name + " is drinking " + liters + " water.");
		}
	}
	
	public void addNewFriend(Person p){
		this.friends.add(p);
	}

	private void setName(String name) {
		if(!name.isEmpty()){
			this.name = name;
		} else {
			System.out.println("You must add name! Now you are called Vetrosvir!");
			this.name = "Vetrosvir";
		}
	}

	private void setEgn(String egn) {	
		if(egn.length() == 10){
			this.egn = egn;
		} else {
			System.out.println("Wrong eng! Now you do not have one");
		}
	}
}
