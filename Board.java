import java.util.Arrays;
import java.util.*;

public class Board {
//	private int[][] myBoard;
	public int[][] myBoard = new int[][]{ 
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
	public void testBoard1()
	{
		myBoard = new int[][]{ 
			  {1, 2, 2, 2, 2, 2},
			  {1, 1, 2, 2, 2, 2},
			  {1, 1, 1, 2, 2, 2},
			  {1, 0, 1, 1, 2, 2},
			  {1, 1, 1, 1, 1, 2},
			  {1, 1, 1, 1, 1, 1},
			};
	}
	public void testBoard2()
	{
		myBoard= new int[][]{ 
			  {0, 2, 2, 2, 2, 2},
			  {0, 0, 2, 2, 2, 2},
			  {0, 1, 0, 2, 2, 2},
			  {0, 0, 0, 0, 2, 2},
			  {0, 0, 1, 1, 1, 2},
			  {0, 0, 0, 0, 0, 0},
			};
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
	
	public Boolean doBoard(Board start) {
	  if(this.myBoard == start.myBoard) {
			return true;
		}

		for (int i=0;i<6;i++) {
		  for(int j=0; j<6;j++) {
			  if(start.myBoard[i][j]!=2) {

					//---------------------------
					
				  try {
					  if(start.myBoard[i][j] == 1 && start.myBoard[i-1][j-1] == 1 && start.myBoard[i-2][j-2] == 0) { //upleft
							start.myBoard[i][j] = 0; //start position
							start.myBoard[i-1][j-1] = 0; //jumpped peg
							start.myBoard[i-2][j-2] = 1; //final position
							System.out.println(start);
							return this.doBoard(start);
						}
					}
					catch(Exception e) {
							//upleft
					}	
	        
	        //---------------------------

					try {
						if(start.myBoard[i][j] == 1 && start.myBoard[i-1][j] == 1 && start.myBoard[i-2][j] == 0) { //up
							start.myBoard[i][j] = 0; //start position
							start.myBoard[i-1][j] = 0; //jumpped peg
							start.myBoard[i-2][j] = 1; //final position
							System.out.println(start);
							return this.doBoard(start);
						}
					}
					catch(Exception e) {
							//upright
					}

					//---------------------------

					try {
					  if(start.myBoard[i][j] == 1 && start.myBoard[i][j+1] == 1 && start.myBoard[i][j+2] == 0) { //right
							start.myBoard[i][j] = 0; //start position
							start.myBoard[i][j+1] = 0; //jumpped peg
							start.myBoard[i][j+2] = 1; //final position
							System.out.println(start);
							return this.doBoard(start);
						}
					}
					catch(Exception e) {
							//right
					}

					//---------------------------
					
					try {
					  if(start.myBoard[i][j] == 1 && start.myBoard[i+1][j+1] == 1 && start.myBoard[i+2][j+2] == 0) { //downright
							start.myBoard[i][j] = 0; //start position
							start.myBoard[i+1][j+1] = 0; //jumpped peg
							start.myBoard[i+2][j+2] = 1; //final position
							System.out.println(start);
							return this.doBoard(start);
						}
					}
					catch(Exception e) {
							//downright
					}

					//---------------------------
	    
	        try {
					  if(start.myBoard[i][j] == 1 && start.myBoard[i+1][j] == 1 && start.myBoard[i+2][j] == 0) { //downleft
							start.myBoard[i][j] = 0; //start position
							start.myBoard[i+1][j] = 0; //jumpped peg
							start.myBoard[i+2][j] = 1; //final position
							System.out.println(start);
							return this.doBoard(start);
						}
					}
					catch(Exception e) {
							//downleft
					}

					//---------------------------

	        try {
					  if(start.myBoard[i][j] == 1 && start.myBoard[i][j-1] == 1 && start.myBoard[i][j-2] == 0) { //left
								start.myBoard[i][j] = 0; //start position
								start.myBoard[i][j-2] = 0; //jumpped peg
								start.myBoard[i][j-2] = 1; //final position
								System.out.println(start);
								return this.doBoard(start);
						}
					}
					catch(Exception e) {
							//left
					}
				} //if
			} //j36
		} //i36
			return false;
	}
}