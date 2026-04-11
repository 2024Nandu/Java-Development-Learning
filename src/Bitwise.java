import java.util.Scanner;
public class Bitwise {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("Showcasing bitwise AND operator: \n");
		System.out.println("please enter the first number: ");
		int first = input.nextInt();
		System.out.println("Now, enter the other number: ");
		int Second = input.nextInt();
		
		int result = first & Second;
		System.out.println("result is: " + result);
	}

}
