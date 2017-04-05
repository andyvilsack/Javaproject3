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
		Board myBoard = new Board();
		Scanner scanner = new Scanner(System.in);
		String input = "";
		char holdChar;
		System.out.println("Please enter values for the starting positions:");
		for(int i=0;i<6;i++)
		{
			System.out.println("Enter for line "+(i+1));
			input = scanner.nextLine();
			
			for(int j=0;j<input.length();j++)
			{
				holdChar = input.charAt(j);
				//i is col
				//k is row
				if(holdChar=='O')
				{
					myBoard.loadBoard(0, j, i);
				}
				else if(holdChar=='P')
				{
					System.out.println(j +" " + " " +i);
					myBoard.loadBoard(1, j, i);
				}
				else
				{
					System.out.println("User has entered a value that was not P or O");
				}
			}
			
			
			
			
		}
		
		for(int k=0;k<6;k++)
		{
			System.out.println("Enter for Line "+(k+1));
			input = scanner.nextLine();
		}
	}

}
