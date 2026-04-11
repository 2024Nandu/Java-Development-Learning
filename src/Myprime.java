import java.util.Scanner;

public class Myprime {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);

		System.out.println("Enter the number: ");

		int n = scan.nextInt();
		
		if(n%1==0 && n%n == 0) {
			System.out.println(n + "is a prime number");
		}
		else {
			System.out.println("Not a prime");
		}

	}

}
