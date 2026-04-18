
public class Default {
	int roll;
	String name;
	
	Default()
	{
		roll = 1;
		name = "Raja";
	}
	
	Default(int roll, String name)
	{
		this.roll = roll;
		this.name = name;
	}
	
	Default(int roll)
	{
		this.roll = roll;
	}
	
	void disp()
	{
		System.out.println(roll);
		System.out.println(name);
	}

}
