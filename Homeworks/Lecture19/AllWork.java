
public class AllWork {
	private Task [] tasks;
	private int freePlacesForTasks;
	private int currentUnassignedTask;
	
	public AllWork(){
		this.tasks = new Task [10];
		this.freePlacesForTasks = 10;
		this.currentUnassignedTask = 0;
	}
	
	public void addTask(Task t){
		if (this.freePlacesForTasks > 0){
			for (int i = 0; i < tasks.length; i++) {
				if(t != null && this.tasks[i] == null){
					this.tasks[i] = t;
					this.freePlacesForTasks--;
					break;
				}
			}		
		} else {
			System.out.println("Task is not added! No  more free task spaces!");
		}		
	}
	
	public Task getNextTask(){
		for (int i = 0; i < tasks.length; i++) {
			if(this.tasks[this.currentUnassignedTask] != null && 
					this.tasks[this.currentUnassignedTask].getWorkingHours() > 0){
				Task t = this.tasks[this.currentUnassignedTask];
				this.currentUnassignedTask = (this.currentUnassignedTask + 1) % 10;
				return t;
			} else {
				this.currentUnassignedTask = (this.currentUnassignedTask + 1) % 10;
			}
		}
		System.out.println("No more tasks!");
		return null;
	}
	
	public boolean isAllWorkDone(){
		int counter = 0;
		for (int i = 0; i < tasks.length; i++) {
			if(this.tasks[i] == null) {
				counter++;
			} else if(this.tasks[i].getWorkingHours() == 0){
				this.tasks[i] = null;
				counter++;
			}
		}
		
		this.freePlacesForTasks = counter > 10? 10 : counter;
		
		if(counter >= 10){
			return true;
		} else {
			return false;
		}
	}
}
