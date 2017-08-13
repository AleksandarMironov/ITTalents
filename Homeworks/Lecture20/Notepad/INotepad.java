package Notepad;

public interface INotepad {
	
	public void addText(int page, String text);
	public void addPage(String title);
	public void addPage(Page p);
	public void replaceText(int page, String text);
	public void removeText(int page);
	public void showMeNotebook();
	public boolean searchWord(String word);
	public void printAllPagesWithDigits();
}