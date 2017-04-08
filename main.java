/*
 * Andrew Vilsack
 * John-George Sample
 * 
 */
import java.util.Scanner;
import java.util.Arrays;
public class Main 
{
	public static void main(String[] args) 
	{
		Board myBoard = new Board();
		Board finishedBoard = new Board();
		Scanner scanner = new Scanner(System.in);
		String input = "";
		char holdChar;
		System.out.println("Please enter values for the starting positions:");
		for(int i=0;i<6;i++) //col
		{
			System.out.println("Enter for line "+(i+1));
			input = scanner.nextLine();
			
			for(int j=0;j<input.length();j++) //row
			{
				holdChar = input.charAt(j);
				//j is col
				//i is row
				if(holdChar=='O')
				{
					myBoard.loadBoard(0,i,j);
				}
				else if(holdChar=='P')
				{
					//System.out.println(j +" " + " " +i);
					myBoard.loadBoard(1,i,j);
				}
				else
				{
					System.out.println("User has entered a value that was not P or O");
				}
			}	
		}
		
		System.out.println(myBoard);
		
		for(int k=0;k<6;k++) //board 2
		{
			System.out.println("Enter for Line "+(k+1));
			input = scanner.nextLine();
			for(int l=0;l<input.length();l++)
			{
				holdChar = input.charAt(l);
				//l is col
				//k is row
				if(holdChar=='O')
				{
					finishedBoard.loadBoard(0, k, l);
				}
				else if(holdChar=='P')
				{
					//System.out.println(l +" " + " " +k);
					finishedBoard.loadBoard(1, k, l);
				}
				else
				{
					System.out.println("User has entered a value that was not P or O");
				}
			}
		}
		System.out.println(finishedBoard);
	}

}
