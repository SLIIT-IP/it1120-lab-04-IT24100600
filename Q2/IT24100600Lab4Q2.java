import java.util.Scanner;
public class IT24100600Lab4Q2
{
	public static void main(String[] args)
	{
		Scanner keyboard = new Scanner(System.in);
		
		System.out.print("Please enter exam marks (out of 100) : ");
		double exMARKS = keyboard.nextDouble();
			
			if (exMARKS>100 || exMARKS<0){System.out.println("Invalod input exam marks. Terminating program.");}
			
		
		System.out.print("Please enter lab submission marks (out of 100) : ");
		double lbsMARKS = keyboard.nextDouble();
		
			if (lbsMARKS>100 || lbsMARKS<0){System.out.println("Invalid input lab submission marks. Terminating program.");}
			
			
		System.out.print("Please enter the percentage given for the exam : ");
		double perexMARKS = keyboard.nextDouble();
			if (perexMARKS<0 || perexMARKS>100){System.out.println("Invalid input for exam percentage. Termination program.");}
			
			
		System.out.print("Please enter the percentage given for the lab submission : ");
		double perlbMARKS = keyboard.nextDouble();
			if (perlbMARKS<0 || perlbMARKS>100){System.out.println("Invalid input for lab percentage. Termination program.");}
			
		
		if (perexMARKS + perlbMARKS != 100) {System.out.println("The percentages do not sum up to 100. Terminating program.");}
		
		double finMARKS = (exMARKS * perexMARKS / 100)+(lbsMARKS * perlbMARKS / 100);
		System.out.print("Final mark is : " +finMARKS);
	}
}
