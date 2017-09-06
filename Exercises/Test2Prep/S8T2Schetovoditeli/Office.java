package S8T2Schetovoditeli;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.TreeSet;

public class Office {
	private int employees;
	private HashMap<String, ArrayList<Employee>> departaments;
	private ArrayList<Document> documents; // can be changed to treeset
	
	public Office() {

		this.departaments = new HashMap<>();
		this.documents = new ArrayList<>();
		this.employees = 0;
	}
	
	public void naznachi (String depName, String employeeName){
		if(!this.departaments.containsKey(depName)){
			this.departaments.put(depName, new ArrayList<>());
			this.departaments.get(depName).add(new SeniorEmployee(UT.randomString(7), UT.intInRange(1500, 3000), depName, this));
		} else {
			if(UT.ran.nextBoolean()){
				this.departaments.get(depName).add(new MidEmployee(UT.randomString(7), UT.intInRange(1000, 2000), depName, this));
			} else {
				this.departaments.get(depName).add(new EmployeeJunior(UT.randomString(7), UT.intInRange(900, 1800), depName, this));
			}
		}
		this.employees++;
	}
	
	public void doWork(Document d){
		if(d.getClass().getSimpleName().equals("DocumentSecret")){
			int counter = UT.intFrom0To(this.departaments.keySet().size() - 1);
			for (Entry<String, ArrayList<Employee>> e : this.departaments.entrySet()) {
				if(counter == 0){
					e.getValue().get(0).work(d);
					System.out.println("Task: " + d.getName() + " is assignet to " + e.getValue().get(0).getName() );
					return;
				}
				counter--;
			}
		} else {
			int counter = this.employees - UT.intFrom0To(employees - 1);
			for (ArrayList<Employee> a : this.departaments.values()) {
				for (Employee employee : a) {
					if(counter == 0){
						employee.work(d);
						System.out.println("Task: " + d.getName() + " is assignet to " + employee.getName() );
						return;
					}
					counter --;
				}
			}
		}
	}
	
	public void getDocumentsInfo(){
		this.documents.sort((d1, d2) -> d1.getComplexity() - d2.getComplexity());
		System.out.println("Documents:");
		for (Document document : documents) {
			System.out.println("Name: " + document.getName() + ", Complexity: " + document.getComplexity());
		}
	}
	
	public void getSelarySpendings(){
		double total = 0;
		for (ArrayList<Employee> a : this.departaments.values()) {
			for (Employee employee : a) {
				total += employee.getSelary();
			}
		}
		System.out.println("Total spendings for selary: " + total);
	}
	
	public void getEmployeeWithBestResults(){
		Employee best = null;
		for (ArrayList<Employee> a : this.departaments.values()) {
			for (Employee employee : a) {
				if(best == null){
					best = employee;
				}
				if(employee.getWrongDocuments() < best.getWrongDocuments()){
					best = employee;
				}
			}
		}
		System.out.println("Best employee is " + best.getName() + " with " + best.getWrongDocuments() + " errors!");
	}
	
	public void getWorstDep(){
		int count = 0;
		String dep = "";
		for (ArrayList<Employee> a : this.departaments.values()) {
			int temp = 0;
			for (Employee employee : a) {
				temp += employee.getWrongDocuments();
			}
			if(temp >= count){
				count = temp;
				dep = a.get(0).getDep();
			}
		}
		
		System.out.println("Worst dep is " + dep + " with " + count + " errors!");
	}
	
	public void get3BestEmployees(){
		TreeSet<Employee> temp = new TreeSet<>((e1,e2) -> e1.getWrongDocuments() - e2.getWrongDocuments());
		for (ArrayList<Employee> a : this.departaments.values()) {
			for (Employee employee : a) {
				temp.add(employee);
			}
		}
		System.out.println("Best employees are:");
		int count = 0;
		for (Employee e : temp) {
			if(count < 3){
				System.out.println(++count + "." + e.getName() + " from " + e.getDep() + " with " + e.getWrongDocuments());
				e.getMoreMoney();
			}
		}
		System.out.println("Salary is rised!");
	}
}
