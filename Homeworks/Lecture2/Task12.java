//// I prefer build in Calendar.... 
//// and year 2000 is leap - there is mistake in the example

import java.util.Scanner;    

public class Task12 {
	public static void main(String[] args) {
		System.out.println("Enter day, month and year:");
		
		Scanner sc = new Scanner(System.in);
		
		int day = sc.nextInt();
		int month = sc.nextInt();
		int year = sc.nextInt();
		
		boolean isLeapYear = (year%4 == 0) && 
				((year%100==0 && year%400==0) || (year %100 != 0));
		
		if(day < 28){
			day++;
		}else if (day == 31){
			if(month != 12){
				day = 1;
				month++;
			}else{
				day = 1;
				month = 1;
				year++;
			}
		}else if (day ==30){
			if (month == 1 || month == 3 ||
					month == 5 || month == 7 || 
					month == 8 || month == 10 || 
					month == 12){
				day++;
			}else{
				day = 1;
				month++;
			}
		}else if (month == 2){
			if(day == 29){
				day = 1;
				month++;
			}else{
				if(!isLeapYear){
					day = 1;
					month++;
				}else {
					day++;
				}
			}
		}else{
			day++;
		}
		
		System.out.println(day + " " + month + " " + year);
		
		sc.close();
	}
}
