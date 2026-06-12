
public class Developer {
	void work() 
	{
	 System.out.println("Developer doing work");
	}
	
	void project() 
	{
		System.out.println("Developer doing project");
	}
}

class JavaDeveloper extends Developer{ 
//	@override
	
	void work() 
	{
		System.out.println("JavaDeveloper is working");
	}
	
	void project() 
	{
		System.out.println("JavaDeveloper is project");  
	}
	
	
}


class PythonDeveloper extends Developer{
//	@override
	
	void work() {
		System.out.println("PythonDeveloper is working");
	}
	
	void project() 
	{
		System.out.println("PythonDeveloper is doing project");
	}
}


public class Main7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Developer dev1 = new JavaDeveloper();
		dev1.work();
		dev1.project();
		
		Developer dev2 = new PythonDeveloper();
		dev2.work();
		dev2.project();

	}

}
