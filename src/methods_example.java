package task_two;
abstract class example //abstract class
{
	public abstract void abstract_method(); //abstract method
}
class method_types
{
	public void instance_method(int a,int b)
	{
		System.out.println("Addition of two number is:"+(a+b));
	}
	public static void static_method(int c,int d)
	{
		System.out.println("Multiplication of two number is:"+(c*d));
	}
	void abstract_method()
	{
		int e=9,f=3;
		System.out.println("Division of two number is:"+(e/f));
	}
	public final void final_method()
	{
		System.out.println("Final method can't over ridden.");
	}
	private void private_method()
	{
		System.out.println("This is private method.");
	}
}
public class methods_example
{
	public static void main(String[] args)
	{
		method_types m1=new method_types();
		m1.instance_method(6, 10);  //instance method call by instances only
		
		method_types.static_method(10,5); //static method call by using class name
		
		m1.abstract_method(); // abstract method call by using instances name 
		
		m1.final_method(); // final method call by using instances name 		
}
}