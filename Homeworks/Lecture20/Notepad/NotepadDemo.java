package Notepad;

public class NotepadDemo {
	public static void main(String[] args) {
		Page myPage = new Page("Demo page");
		myPage.addText("Some demo text for page");
		
		Page myDigisPage = new Page("Demo digits page");
		myDigisPage.addText("Demo text for digits page 123 oid934v l");
		
		SimpleNotepad test = new SimpleNotepad(5);
		test.addText(0, "csv");
		test.addPage(myDigisPage);
		test.addPage(myPage);
		test.replaceText(4, "Some text");
		test.showMeNotebook();
		test.printAllPagesWithDigits();
		
		SecuredNotepad securedNotepad = new SecuredNotepad("pass");
		securedNotepad.addPage(myDigisPage);
		securedNotepad.showMeNotebook();
		
		ElectronicSecuredNotepad esn = new ElectronicSecuredNotepad("pizza");
		esn.addPage(myPage);
		esn.start();
		esn.addText(0, "The quick brown fox jumps over the lazy dog");
		System.out.println(esn.searchWord("fox"));
		esn.showMeNotebook();
	}
}
