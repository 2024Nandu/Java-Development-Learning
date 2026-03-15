import java.util.Scanner;
public class LeapYear {

	public static void main(String[] args) {
//		this code for the leap year
		
		Scanner input = new Scanner(System.in);
		System.out.println("Welcome to New year Calculator");
		System.out.println("Please enter the year that you want to check: ");
		int year = input.nextInt();
		
		if(year % 400 == 0) {
			System.out.println("your year is a leap year");
		}
		else if (year % 100 == 0) {
			System.out.println("your year is not a leap year");
		}
		else if (year % 4 == 0) {
			System.out.println("year is a leap year");
		}
		else {
			System.out.println("your year is not a leap year");
		}

	}

}
