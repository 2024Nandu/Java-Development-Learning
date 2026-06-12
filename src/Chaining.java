

public class Chaining {
	Chaining()
	{
		this(10);
		System.out.println("Inside zero para constructor");
	}
	
	Chaining(int a)
	{
		this(10, 20);
		System.out.println("Inside one para constructor");
	}
	
	Chaining(int a, int b)
	{
		System.out.println("Inside two para constructor");
	}
}
