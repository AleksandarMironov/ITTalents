package S8T2Schetovoditeli;

import java.util.ArrayList;
import java.util.TreeSet;

public abstract class Employee {
	private String name;
	private double selary;
	private EmployeeRank rank;
	private int wrongDocuments;
	private ArrayList<Document> tasks;
	private String dep;
	private Office office;
	
	public Employee(String name, double selary, EmployeeRank rank, String dep, Office office) {

		if(!name.isEmpty() && name != null){
			this.name = name;
		} else {
			System.out.println("Wrong name!");
			this.name = UT.randomString(9);
		}
		
		this.selary = selary;
		this.rank = rank;
		this.dep = dep;
		this.office = office;
		this.wrongDocuments = 0;
	}
	
	public String getName() {
		return name;
	}

	public double getSelary() {
		return selary;
	}

	public EmployeeRank getRank() {
		return rank;
	}
	
	public int getWrongDocuments() {
		return wrongDocuments;
	}

	public String getDep() {
		return dep;
	}

	public void work(Document task){
		System.out.println(this.name + " is working on: " + task.getName());
		this.tasks.add(task);
		double err = 0;
		switch (task.getClass().getSimpleName()){
		case "DocumentNormal":
		{
			err = task.getComplexity()*this.rank.getValue();
			break;
		}
		case "DocumentSecret":
		{
			err = task.getComplexity()*this.rank.getValue() + 20.0;
			break;
		}
		default:
			err = 50;
			break;
		}
		
		if(err < UT.intFrom0To(100)){
			task.setStatus(false);
			this.wrongDocuments++;
		} else {
			task.setStatus(true);
		}
	}
	
	public void report(){
		int okCount = 0;
		int wrongCount = 0;
		for (Document document : tasks) {
			if(document.getStatus().equals(false)){
				wrongCount++;
			} else {
				okCount++;
			}
		}
		
		System.out.println("Employee " + this.name + " done " + (okCount + wrongCount) + " documents");
		System.out.println(okCount + " correct and " + wrongCount + " wrong");
	}
	
	public void reportWrongDocuments(){
		TreeSet<String> names = new TreeSet<>();
		for (Document document : tasks) {
			if(document.getStatus() == false){
				names.add(document.getName());
			}
		}
		System.out.println("Employee " + this.name + " done " + names.size() + " wrong documents:");
		for (String string : names) {
			System.out.println(string);
		}
	}
	
	public void getMoreMoney(){
		this.selary *= 1.1;
	}
}
