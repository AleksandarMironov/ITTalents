package Notepad;

import java.lang.StringBuilder;

public class Page {
	private String title;
	private StringBuilder text;
	
	public Page() {
		this.text = new StringBuilder();
		this.title = " ";
	}
	
	public Page(String title) {
		this();
		if(!title.isEmpty()){
			this.title = title;
		}
	}

	public String getTitle() {
		return this.title;
	}

	public void addText(String addText){
		if(!addText.isEmpty()){
			this.text.append(addText);
		}
	}
	
	public void removeText(){
		this.text = new StringBuilder();
	}
	
	public boolean searchWord(String word){
		if(this.text.indexOf(word) < 0){
			return false;
		}
		
		return true;
	}
	
	public boolean containsDigits(){
		if(this.text.toString().matches(".?[0-9].?")){
			return true;
		}
		return false;
	}
	
	@Override
	public String toString() {
		String ret = "\nTitle: " + this.title + "\nText:\n" + this.text.toString(); 
		return ret;
	}
}
