package Task2;

public class Call {
	static double priceForAMinute = 0.43;
	GSM caller;
	GSM receiver;
	double duration;
	
	Call (GSM caller, GSM receiver, double duration){
		this.caller = caller;
		this.receiver = receiver;
		this.duration = duration;
	}
}
