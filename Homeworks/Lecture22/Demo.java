package Homework;

import Homework.Tasks.DoHomeworks;
import Homework.Tasks.Drink;
import Homework.Tasks.Eat;
import Homework.Tasks.Sleep;

public class Demo {
	public static void main(String[] args) {
		Eat eat = new Eat();
		Sleep sleep = new Sleep();
		DoHomeworks doHomeworks = new DoHomeworks();
		Drink drink = new Drink();
		
		Scheduler scheduler = new Scheduler();
		
		scheduler.push(sleep);
		scheduler.push(eat);
		scheduler.push(doHomeworks);
		scheduler.push(eat);
		scheduler.push(doHomeworks);
		scheduler.push(drink);
		scheduler.push(sleep);
		
		scheduler.doTasksWithoutDeleting();
		scheduler.doTasks();
		scheduler.doTasks();
	}
}
