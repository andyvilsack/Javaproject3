/*
 * Andrew Vilsack
 * John-George Sample
 * 
 */
import java.util.Scanner;
import java.util.Arrays;
public class main 
{

	public static void main(String[] args) 
	{
		Scanner scanner = new Scanner(System.in);
		String input = "";
		System.out.println("Please enter values for the starting positions:");
		for(int i=0;i<6;i++)
		{
			System.out.println("Enter for line "+(i+1));
			input = scanner.nextLine();
		}
		
		for(int j=0;j<6;j++)
		{
			System.out.println("enter for Line "+(j+1));
			input = scanner.nextLine();
		}
	}

}
