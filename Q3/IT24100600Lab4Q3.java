import java.util.Scanner;
public class IT24100600Lab4Q3
{
	public static void main(String[] args)
	{
		Scanner keyboard = new Scanner(System.in);
		
		System.out.print("Enter a number : ");
		double num1 = keyboard.nextDouble();
		
						
		String result = (num1 > 0) ? "The number is Positive" : (num1 < 0) ? "The number is Negative" : "The number is Zero";
		System.out.println(result);
	}
}
