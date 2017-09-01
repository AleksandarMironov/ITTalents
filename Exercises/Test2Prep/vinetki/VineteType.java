package vinetki;

public enum VineteType {
	 DAY(1), MOUNTH(10), YEAR(60);
	 
	 private final int value;
	 private VineteType(int value) {
	    this.value = value;
	 }

	 public int getValue() {
	    return value;
	 }
	 
	 public int getValidity(){
		 switch (this.value) {
			case 1:
				return 7;
			case 10:
				return 30;
			case 60:
				return 365;
			default:
				System.out.println("Wrong vinete!");
				return 0;
		}
	 }
}
	

