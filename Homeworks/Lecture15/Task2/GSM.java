package Task2;

public class GSM {
	String model;
	boolean hasSimCard;
	String simMobileNumber; 
	double outgoingCallsDuration; 
	Call lastIncomingCall; 
	Call lastOutgoingCall; 
	
	void insertSimCard(String simMobileNumber){
		if (hasSimCard){
			System.out.println("There is  SIM card in the GSM! Remove it first!");
			
		} else if (simMobileNumber.length() == 10 && simMobileNumber.charAt(0) == '0' 
				&& simMobileNumber.charAt(1) == '8'){
			hasSimCard = true;
			this.simMobileNumber = simMobileNumber;
			
		} else {
			System.out.println("Wrong number");
		}
	}
	
	void removeSimCard(){
		hasSimCard = false;
	}

	void call( GSM receiver, double duration){
		if(duration < 0){
			System.out.println("Invalild duration!");
			return;
		}
		
		if (this.simMobileNumber.equals(receiver.simMobileNumber)){
			System.out.println("You can not call yourself");
			return;
		}
		
		if(!this.hasSimCard){
			System.out.println("Can not make call with no SIM card!");
			return;
		}
		
		if(!receiver.hasSimCard){
			System.out.println("Receiver don not have SIM card!");
			return;
		}
		
		this.outgoingCallsDuration += duration;
		this.lastOutgoingCall = new Call(this, receiver, duration);
		receiver.lastIncomingCall = new Call(this, receiver, duration);
	}
	
	double getSumForCall(){
		return this.outgoingCallsDuration * Call.priceForAMinute;
	}
	
	void printInfoForTheLastOutgoingCall(){
		if(this.lastOutgoingCall == null){
			System.out.println("There is no outgoing calls!");
		} else {
			System.out.println("Last outgoing call: Number: " + this.lastOutgoingCall.receiver.simMobileNumber +
					" Duration: " + this.lastOutgoingCall.duration);
		}
	}
	
	void printInfoForTheLastIncomingCall(){
		if(this.lastIncomingCall == null){
			System.out.println("There is no incoming calls!");
		} else {
			System.out.println("Last incoming call: Number: " + this.lastIncomingCall.caller.simMobileNumber +
					" Duration: " + this.lastIncomingCall.duration);
		}
	}
}
