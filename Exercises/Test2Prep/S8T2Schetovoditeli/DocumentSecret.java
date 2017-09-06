package S8T2Schetovoditeli;

import java.util.Scanner;

public class DocumentSecret extends Document {
	
	private String pass;
	
	public DocumentSecret(String name, String pass) {
		super(name);
		
		if(!pass.isEmpty() && pass != null && pass.length() >= 5){
			this.pass = pass;
		} else {
			Scanner sc = new Scanner(System.in);
			while(!(!pass.isEmpty() && pass != null && pass.length() >= 5)){
				System.out.println("Wrong password! Enter new (5 simbols min):");
				this.pass = sc.nextLine();
			}
			sc.close();
		}
	}

	public boolean enterPass (){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter pass");
		String inp = sc.nextLine();
		sc.close();
		if(inp.equals(pass)){
			return true;
		}
		return false;
	}
}
