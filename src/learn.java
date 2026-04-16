public class learn {
//Instance variables
int age;

String name;

double height;


learn(int age,String name,double height)

{
// local variables,,,
	// use this key word when local variable name and instance variable name is same
	//most priority is given to local variables
	// when local varaibel name and instance variable name is same than 
	// shadowing property will occur
	
this.age = age;

this.name= name;

this.height = height;

}

void disp()

{

System.out.println(age);

System.out.println(name);

System.out.println(height);

}

}
