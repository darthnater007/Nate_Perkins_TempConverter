import java.util.Scanner;

public class TempConverter 
{

	public static void main(String[] args) 
	{
		System.out.println("Welcome to the F to C Temperature Conversion App\n\n");
		
		Scanner sc= new Scanner(System.in);
		
		
		String choice = "Y";
		
		while (choice.equalsIgnoreCase("Y")) 
		{
			System.out.print("Enter a temperature in Farenheit: ");
			
			double fTemp = sc.nextDouble();
			double cTemp = (fTemp-32)*(5.0/9.0);
			System.out.println(fTemp +" degrees F is " + cTemp + " degrees C.");
			
			while(!choice.equalsIgnoreCase("N")) 
			{
				System.out.print("Continue? y/n:  ");
				choice = sc.next();
				if(choice.equalsIgnoreCase("Y")) 
				{
					break;
				}
			}
		}
		sc.close();
		System.out.println("Buh Bye Now.");
	
	}

}
