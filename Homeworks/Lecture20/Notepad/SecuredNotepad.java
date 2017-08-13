package Notepad;

import java.util.Scanner;

public class SecuredNotepad extends SimpleNotepad implements INotepad  {

	private char [] password;
	private Scanner sc = new Scanner(System.in);
	
	public SecuredNotepad(String password) {
		super();
		this.password = password.toCharArray();
	}
	
	public SecuredNotepad(String password, int numberOfPages) {
		super(numberOfPages);
		this.password = password.toCharArray();
	}

	private boolean checkPassword(){
		System.out.println("Enter password:");
		String pass = sc.nextLine();
		for (int i = 0; i < password.length; i++) {
			if(pass.charAt(i) != password[i]){
				System.out.println("WRONG PASSWORD!");
				return false;
			}
		}
		return true;
	}

	@Override
	public void addText(int page, String text) {
		if(checkPassword()){
			super.addText(page, text);
		}
	}

	@Override
	public void replaceText(int page, String text) {
		if(checkPassword()){
			super.replaceText(page, text);
		}
	}


	@Override
	public void removeText(int page) {
		if(checkPassword()){
			super.removeText(page);
		}
	}


	@Override
	public void showMeNotebook() {
		if(checkPassword()){
			super.showMeNotebook();
		}
	}

	@Override
	public boolean searchWord(String word) {
		if(checkPassword()){
			return super.searchWord(word);
		} else {
			return false;
		}
	}

	@Override
	public void printAllPagesWithDigits() {
		if(checkPassword()){
			super.printAllPagesWithDigits();
		}
	}

	@Override
	public void addPage(String title) {
		if(checkPassword()){
			super.addPage(title);
		}
	}

	@Override
	public void addPage(Page p) {
		if(checkPassword()){
			super.addPage(p);
		}
	}
	

}
