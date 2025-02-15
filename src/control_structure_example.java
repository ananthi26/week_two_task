package task_two;
import java.util.Scanner;
class control_structure
{
	public void number_checking(int a)
	{
	if(a==0)
	{
		System.out.println("Number is zero.\n");
	}
	else if(a<0)
	{
		System.out.println("Negative number.\n");
	}
	else if(a%2==0)
	{
		System.out.println("The number is even.\n");
	}
	else 
	{
		System.out.println("The number is odd.\n");
	}
	}
}
class switchcase
{
	public void vowel_consonant_switch(int ch)
	{
		switch(ch) 
		{
		case 'a':
		{
			System.out.println("Vowel.\n");
			break;
		}
		case 'e':
		{
			System.out.println("Vowel.\n");
			break;
		}
		case 'i':
		{
			System.out.println("Vowel.\n");
			break;
		}
		case 'o':
		{
			System.out.println("Vowel.\n");
			break;
		}
		case 'u':
		{
			System.out.println("Vowel.\n");
			break;
		}
		default:
		{
			System.out.println("Consonant.\n");
		}	
		}	
	}
}
public class control_structure_example
{
public static void main(String[]args)
	{
	     Scanner s1=new Scanner(System.in);
	     System.out.println("Number Checking System using control structures:\nEnter the number:");
	     int a=s1.nextInt();
		 control_structure c1=new  control_structure();
		 c1.number_checking(a);
		 
	     System.out.println("To find vowel or consonant using switch case:\nEnter the character:");
	     char ch=s1.next().charAt(0);
	     switchcase sc=new switchcase();
	     sc.vowel_consonant_switch(ch);
	     
	     System.out.println("Looping concepts:\n");
	     System.out.println("For loop:\n");
			for(int i=1;i<=5;i++)
			{
				for(int j=1;j<=i;j++)
				{
				System.out.print(j);
				}
				System.out.println();
			}
		    System.out.println("\nWhile loop:\n");
            int k=6;
            while(k<=10)
            {
            	System.out.print(k); 
            	System.out.println(); 
            	k++;
            }
		    System.out.println("\nDo While loop:\n");
            int l=11;
            do
            {
            	System.out.println(l); //if condition is false it run only one time 
            	l++;
            }while(l<11);
		}
}