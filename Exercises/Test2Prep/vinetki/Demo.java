package vinetki;

import java.time.LocalDate;
import java.time.Period;
import java.util.ArrayList;
import java.util.Calendar;

public class Demo {

	public static void main(String[] args) {
		GasStation station = new GasStation();
		station.getVineteInfo();
		
		
		ArrayList<Shoffer> shoffers = new ArrayList<>();
		for (int i = 0; i < 20; i++) {
			shoffers.add(new Shoffer(RanGen.randomString(10), RanGen.intInRange(1000, 10000), station));
		}
		
		
		ArrayList<Vehicle> vihicles = new ArrayList<>();
		for (int i = 0; i < 200; i++) {
			int temp = RanGen.intInRange(1, 3);
			switch (temp) {
			case 1:
				vihicles.add(new Car(RanGen.randomString(5), RanGen.intFrom0To(2017)));
				break;
			case 2:
				vihicles.add(new Bus(RanGen.randomString(5), RanGen.intFrom0To(2017)));
				break;
			case 3:
				vihicles.add(new Truck(RanGen.randomString(5), RanGen.intFrom0To(2017)));
				break;
			default:
				System.out.println("Wrong nummber!!!");
			}
		}
		
		int count = 0;
		for (Shoffer s : shoffers) {
			for (int i = 0; i < 10; i++) {
				s.addVehicle(vihicles.get(count++));
			}
		}
		
		
	}
}
