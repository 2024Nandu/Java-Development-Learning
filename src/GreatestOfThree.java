import java.util.Scanner;
public class GreatestOfThree {

	public static void main(String[] args) {
		// TODO Auto-generated method 
    Scanner input = new Scanner(System.in);
    System.out.println("Please enter your first number");
    int first = input.nextInt();
    System.out.println("please enter your second number");
    int second = input.nextInt();
    System.out.println("please enter your third number");
    int third = input.nextInt();
    
    if(first >= second && first >= third) {
    	System.out.println(first + " is the greatest number");
    }
    else if (second >= third) {
    	System.out.println(second + " is the greatest number");
    }
    else {
    	System.out.println(third + " is the greatest number:");
    }
	}

}
