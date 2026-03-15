import java.util.Scanner;
public class Grading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("Welcome to Grade calculator\n");
		System.out.println("please enter your percentage: ");
		float percentage = input.nextFloat();
		
		if(percentage >= 90) {
			System.out.println("you got A");
		}
		else if (percentage >= 75) {
			System.out.println("you got B");
		}
		else if(percentage >= 60) {
			System.out.println("you have got c, Work harder next time");
		}
		else if(percentage >= 30) {
			System.out.println("you have got D, you seriously need to work");
		}
		else {
			System.out.println("Sorry, you have failed the test");
		}

	}

}
