import java.util.Iterator;

public class factorial {
	public static void main(String[] args) {

		int n= 5;

		int m = 3;

		int factN = 1;

		int factM = 1;

		
		int i=1;

		do

		{

			factN = factN * i;

			i++;

		}while(i<=n);

		i =1;

		do

		{

			factM = factM * i;

			i++;

			
		}while(i<=m);		
		System.out.println("Factorial of " + n + " is : " +factN);

		System.out.println("Factorial of " + m + " is : " +factM);

	}

}