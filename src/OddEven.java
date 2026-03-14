import java.util.Scanner;
public class OddEven {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("Check the Number is Even Or Odd");
		System.out.println("please enter your number");
		int num = input.nextInt();
		
		if(num % 2 == 0) {
			System.out.println("your number is an evn");
		}
		else {
			System.out.println("your number is an odd");
		}

	}

}
