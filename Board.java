import java.util.Arrays;
import java.util.*;

public class Board {
	private int[][] myBoard;
	
	Board() {
		//0 = open
		//1 = peg
		//2 = shadow realm
		int[][] myBoard = new int[][]{ 
						  {0, 2, 2, 2, 2, 2},
						  {0, 0, 2, 2, 2, 2},
						  {0, 0, 0, 2, 2, 2},
						  {0, 0, 0, 0, 2, 2},
						  {0, 0, 0, 0, 0, 2},
						  {0, 0, 0, 0, 0, 0},
						};		
	}
	
	public void loadBoard(char a, int row, int col) {
		myBoard [row][col] = a;
	}
	
}