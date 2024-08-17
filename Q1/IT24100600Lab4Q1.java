import java.util.Scanner;
public class IT24100600Lab4Q1
{
	public static void main(String[] args)
	{
		Scanner keyboard = new Scanner(System.in);
		
		System.out.print("Enter a number : ");
		double num1 = keyboard.nextDouble();
		
		if (num1>0)
				{System.out.println("The number is Positive");}
		else if (num1<0)
				{System.out.println("The number is Negative");}
		else
				{System.out.println("The number is Zero");}
	}
}