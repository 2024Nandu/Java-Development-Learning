import java.util.Scanner;
public class BitwiseXOR {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Showcasing bitwise XOR operator");
		System.out.println("Enetr the first number");
		int first = input.nextInt();
		System.out.println("Now enter the second number");
		int second = input.nextInt();
		
		int result = first ^ second;
		System.out.println("Result is: " + result);
	}

}
