package Homework;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

import Homework.Tasks.ITask;

public class Scheduler {
	private Queue<ITask> tasks;

	public Scheduler() {
		this.tasks = new LinkedList<>();
	}
	
	public void push(ITask t){
		if(t != null){
			this.tasks.offer(t);
		}
	}
	
	public void doTasks(){
		if(this.tasks.size() == 0){
			System.out.println("No tasks!");
			
		} else {
			while(!this.tasks.isEmpty()){
				ITask t = this.tasks.remove();
				t.doWork();
			}
		}
	}
	
	public void doTasksWithoutDeleting(){
		if(this.tasks.size() == 0){
			System.out.println("No tasks!");
			
		} else {
			Iterator<ITask> iterator = tasks.iterator();
			while(iterator.hasNext()){
				iterator.next().doWork();
			}
		}
	}
}
