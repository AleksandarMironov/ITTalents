package Notepad;

public class ElectronicSecuredNotepad extends SecuredNotepad implements IElectronicDevice {
	
	private boolean isOn;
	
	public ElectronicSecuredNotepad(String password) {
		super(password);
	}
	
	public ElectronicSecuredNotepad(String password, int numberOfPages) {
		super(password, numberOfPages);
	}
	
	@Override
	public void start() {
		this.isOn = true;
		System.out.println("ON!");		
	}

	@Override
	public void stop() {
		this.isOn = false;
		System.out.println("OFF!");
	}

	@Override
	public boolean isStarted() {
		return this.isOn;
	}

	@Override
	public void addText(int page, String text) {
		if(this.isStarted()){
			super.addText(page, text);
		} else {
			System.out.println("Notepad is OFF!");
		}
	}

	@Override
	public void replaceText(int page, String text) {
		if(this.isStarted()){
			super.replaceText(page, text);
		} else {
			System.out.println("Notepad is OFF!");
		}
	}

	@Override
	public void removeText(int page) {
		if(this.isStarted()){
			super.removeText(page);
		} else {
			System.out.println("Notepad is OFF!");
		}
	}

	@Override
	public void showMeNotebook() {
		if(this.isStarted()){
			super.showMeNotebook();
		} else {
			System.out.println("Notepad is OFF!");
		}
	}

	@Override
	public boolean searchWord(String word) {
		if(this.isStarted()){
			return super.searchWord(word);
		} else {
			System.out.println("Notepad is OFF!");
			return false;
		}
	}

	@Override
	public void printAllPagesWithDigits() {
		if(this.isStarted()){
			super.printAllPagesWithDigits();
		} else {
			System.out.println("Notepad is OFF!");
		}
	}

	@Override
	public void addPage(String title) {
		if(this.isStarted()){
			super.addPage(title);
		} else {
			System.out.println("Notepad is OFF!");
		}
	}

	@Override
	public void addPage(Page p) {
		if(this.isStarted()){
			super.addPage(p);
		} else {
			System.out.println("Notepad is OFF!");
		}
	}
}
