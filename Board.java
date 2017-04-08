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
	
	public Boolean doBoard(Board finish) {
	  if(this.myBoard == finish.myBoard) {
			return true;
		}

		for (int i =0;i<6;i++) {
		  for(int j=0; j<6;j++) {
			  if(this.myBoard[i][j]!=2) {

					//---------------------------
					
				  try {
					  if(this.myBoard[i-1][j-1] == 1 && this.myBoard[i-2][j-2] == 0) { //upleft
							this.myBoard[i][j] = 0; //start position
							this.myBoard[i-1][j-1] = 0; //jumpped peg
							this.myBoard[i-2][j-2] = 1; //final position
							return this.doBoard(finish);
						}
					}
					catch(Exception e) {
							//upleft
					}	
	        
	        //---------------------------

					try {
						if(this.myBoard[i-1][j+1] == 1 && this.myBoard[i-2][j+2] == 0) { //upright
							this.myBoard[i][j] = 0; //start position
							this.myBoard[i-1][j+1] = 0; //jumpped peg
							this.myBoard[i-2][j+2] = 1; //final position
							return this.doBoard(finish);
						}
					}
					catch(Exception e) {
							//upright
					}

					//---------------------------

					try {
					  if(this.myBoard[i][j+1] == 1 && this.myBoard[i][j+2] == 0) { //right
							this.myBoard[i][j] = 0; //start position
							this.myBoard[i][j+1] = 0; //jumpped peg
							this.myBoard[i][j+2] = 1; //final position
							return this.doBoard(finish);
						}
					}
					catch(Exception e) {
							//right
					}

					//---------------------------
					
					try {
					  if(this.myBoard[i+1][j+1] == 1 && this.myBoard[i+2][j+2] == 0) { //downright
							this.myBoard[i][j] = 0; //start position
							this.myBoard[i+1][j+1] = 0; //jumpped peg
							this.myBoard[i+1][j+2] = 1; //final position
							return this.doBoard(finish);
						}
					}
					catch(Exception e) {
							//downright
					}

					//---------------------------
	    
	        try {
					  if(this.myBoard[i+1][j-1] == 1 && this.myBoard[i+2][j-2] == 0) { //downleft
							this.myBoard[i][j] = 0; //start position
							this.myBoard[i+1][j-1] = 0; //jumpped peg
							this.myBoard[i+1][j-2] = 1; //final position
							return this.doBoard(finish);
						}
					}
					catch(Exception e) {
							//downleft
					}

					//---------------------------

	        try {
					  if(this.myBoard[i][j-1] == 1 && this.myBoard[i][j-2] == 0) { //left
								this.myBoard[i][j] = 0; //start position
								this.myBoard[i][j-2] = 0; //jumpped peg
								this.myBoard[i][j-2] = 1; //final position
								return this.doBoard(finish);
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