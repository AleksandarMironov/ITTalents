package S8T2Schetovoditeli;

import java.util.ArrayList;

public class Demo {
	public static void main(String[] args) {
		Office office = new Office();
		
		//////////////////////////
		
		office.naznachi("IT", "Pesho");
		office.naznachi("IT", "Gosho");
		office.naznachi("IT", "Ivan");
		office.naznachi("IT", "Sasho");
		office.naznachi("Sales", "Desi");
		office.naznachi("Sales", "Vesi");
		office.naznachi("Sales", "Toni");
		office.naznachi("Sales", "Dani");
		office.naznachi("HR", "Kami");
		office.naznachi("HR", "Sisi");
		office.naznachi("HR", "Veso");
		office.naznachi("HR", "Gega");
		office.naznachi("Finance", "Pam");
		office.naznachi("Finance", "Nik");
		office.naznachi("Finance", "Dik");
		office.naznachi("Finance", "Eba");
		office.naznachi("Nz", "Ligo");
		office.naznachi("Nz", "Nqmam");
		office.naznachi("Nz", "Imena");
		office.naznachi("Nz", "Random");
		
		//////////////////
		
		ArrayList<Document> documents = new ArrayList<>();
		
		for (int i = 0; i < 50; i++) {
			if (UT.intInRange(0, 100) < 80){
				documents.add(new DocumentNormal(UT.randomString(5)));
			} else {
				documents.add(new DocumentSecret(UT.randomString(5), UT.randomString(8)));
			}
		}
		
		for (Document document : documents) {
			office.doWork(document);
		}
		
		//////////////////////
		
		ArrayList<Document> documentsTransfer = new ArrayList<>();
		for (int i = 0; i < 10; i++) {
			documentsTransfer.add(new DocumentNormal(UT.randomString(5)));
		}
		
		for (Document document : documentsTransfer) {
			office.doTransferWork(document);
		}
		
		///////////////////////////////////////////
		
		office.fullInfo();
	}
}
