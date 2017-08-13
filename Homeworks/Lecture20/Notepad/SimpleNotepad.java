package Notepad;

import java.util.ArrayList;

public class SimpleNotepad implements INotepad {

	private ArrayList<Page> pages;

	public SimpleNotepad(){
		this.pages = new ArrayList<Page>();
		this.pages.add(new Page());
	}
	
	public SimpleNotepad(int numberOfPages){
		this();
		if(numberOfPages > 1){
			for (int i = 1; i < numberOfPages; i++) {
				this.pages.add(new Page());
			}
		}
	}
	
	@Override
	public void addText(int page, String text) {
		if(page < this.pages.size()){
			this.pages.get(page).addText(text);
			System.out.println("Text added");
		} else {
			System.out.println("No such page in notebook!");
		}
		
	}

	@Override
	public void replaceText(int page, String text) {
		if(page < this.pages.size()){
			this.pages.get(page).removeText();
			this.pages.get(page).addText(text);
			System.out.println("Text replaced");
		} else {
			System.out.println("No such page in notebook!");
		}	
	}

	@Override
	public void removeText(int page) {
		if(page < this.pages.size()){
			this.pages.get(page).removeText();
			System.out.println("Text removed!");
		} else {
			System.out.println("No such page in notebook!");
		}		
	}

	@Override
	public void showMeNotebook() {
		for (Page p : this.pages){
			System.out.println(p.toString());
		}
	}

	@Override
	public boolean searchWord(String word) {
		if(!word.isEmpty()){
			for (Page p : this.pages){
				if(p.searchWord(word)){
					return true;
				}
			}
		}
		return false;
	}

	@Override
	public void printAllPagesWithDigits() {
		for (Page p : this.pages){
			if(p.containsDigits()){
				System.out.println(p.toString());
			}
		}
	}

	@Override
	public void addPage(String title) {
		this.pages.add(new Page(title));
		System.out.println("Page added");
	}

	@Override
	public void addPage(Page p) {
		if(p != null){
			this.pages.add(p);
			System.out.println("Page added");
		} else {
			System.out.println("Page is not added! Page is empty!");
		}
	}
	
	
}
