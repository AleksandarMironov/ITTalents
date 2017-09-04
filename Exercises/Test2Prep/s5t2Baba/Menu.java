package s5t2Baba;

import java.util.HashMap;

public class Menu {
	private HashMap<Food, Integer> foods;  
	private HashMap<Bevarige, Integer> bevariges;
	
	public Menu (){
		this.foods = new HashMap<Food, Integer>();
		this.bevariges = new HashMap<Bevarige, Integer>();
	}
	
	public boolean hasFood(Food f){
		if(this.foods.containsKey(f)){
			if(this.foods.get(f) > 0){
				return true;
			}
		}
		return false;
	}
	
	public boolean hasBevarige(Bevarige b){
		if(this.bevariges.containsKey(b)){
			if(this.bevariges.get(b) > 0){
				return true;
			}
		}
		return true;
	}
	
	public void addFood (Food f){
		if(!this.foods.containsKey(f)){
			this.foods.put(f, 0);
		}
		this.foods.put(f, (this.foods.get(f) + 1));
	}
	
	public void addFood (Food f, int quantity){
		if(!this.foods.containsKey(f)){
			this.foods.put(f, 0);
		}
		this.foods.put(f, (this.foods.get(f) + quantity));
	}
	
	public void addFood (Bevarige b){
		if(!this.bevariges.containsKey(b)){
			this.bevariges.put(b, 0);
		}
		this.bevariges.put(b, (this.bevariges.get(b) + 1));
	}
	
	public void addFood (Bevarige b, int quantity){
		if(!this.bevariges.containsKey(b)){
			this.bevariges.put(b, 0);
		}
		this.bevariges.put(b, (this.bevariges.get(b) + quantity));
	}
	
	public void getFood(Food f) {
		
	}
}
