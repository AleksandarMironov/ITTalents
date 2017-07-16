package Task2;

public class Demo {
	public static void main(String[] args) {
		GSM nokia = new GSM();
		nokia.model = "3310new";
		nokia.insertSimCard("0888888888");
		
		GSM sony = new GSM();
		sony.model = "XA1";
		sony.insertSimCard("0886666666");
		
		nokia.call(sony, 1.7);
		sony.call(nokia, 7.2);
		
		System.out.println(nokia.getSumForCall());
		nokia.printInfoForTheLastIncomingCall();
		nokia.printInfoForTheLastOutgoingCall();
		
		System.out.println(sony.getSumForCall());
		sony.printInfoForTheLastIncomingCall();
		sony.printInfoForTheLastOutgoingCall();
	}
}
