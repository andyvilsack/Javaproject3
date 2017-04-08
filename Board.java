import java.util.Arrays;
import java.util.*;

public class Board {
//	private int[][] myBoard;
	private int[][] myBoard = new int[][]{ 
						  {0, 2, 2, 2, 2, 2},
						  {0, 0, 2, 2, 2, 2},
						  {0, 0, 0, 2, 2, 2},
						  {0, 0, 0, 0, 2, 2},
						  {0, 0, 0, 0, 0, 2},
						  {0, 0, 0, 0, 0, 0},
						};
	
	Board() {
		//0 = open
		//1 = peg
		//2 = shadow realm
			
	}
	
	public void loadBoard(int a, int row, int col) {
//		System.out.println("a:" + a);
//		System.out.println(myBoard[0][0]);
		myBoard[row][col] = a;
//		System.out.println(myBoard[0][0]);
		
	}
	
	public String toString() {
		String a = "";
		for(int i=0;i<= 5;i++) {
			for(int j=0;j<=5;j++) {
				a += myBoard[i][j] + " "; 
			}
			a += "\n";
		}
		return a;
	}
}