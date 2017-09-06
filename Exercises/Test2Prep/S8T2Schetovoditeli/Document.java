package S8T2Schetovoditeli;

public abstract class Document {
	private String name;
	private int complexity;
	private Boolean status;
	
	public Document(String name) {
		
		if(!name.isEmpty() && name != null){
			this.name = name;
		} else {
			System.out.println("Wrong name!");
			this.name = UT.randomString(9);
		}
		
		this.complexity = UT.intInRange(1, 20);
		
		this.status = null;
	}
	public String getName() {
		return this.name;
	}
	public int getComplexity() {
		return this.complexity;
	}
	public Boolean getStatus() {
		return this.status;
	}
	public void setStatus(Boolean status) {
		this.status = status;
	}
	
	
	
}
