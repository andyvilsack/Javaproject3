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
	
	public Boolean doBoard(Board start, Board finish) {
	  if(start == finish) {
			return true;
		}

		for (int i =0;i<36;i++) {
		  for(int j=0; j<36;j++) {
			  if(start.myBoard[i][j]!=2) {

					//---------------------------
					
				  try {
					  if() { //upleft
								
						}
					}
					catch(Exception e) {
							//upleft
					}	
	        
	        //---------------------------

					try {
					  if() { //upright
								
						}
					}
					catch(Exception e) {
							//upright
					}

					//---------------------------

					try {
					  if() { //right
								
						}
					}
					catch(Exception e) {
							//right
					}

					//---------------------------
					
					try {
					  if() { //downright
								
						}
					}
					catch(Exception e) {
							//downright
					}

					//---------------------------
	    
	        try {
					  if() { //downleft
								
						}
					}
					catch(Exception e) {
							//downleft
					}

					//---------------------------

	        try {
					  if() { //left
								
						}
					}
					catch(Exception e) {
							//left
					}

					//---------------------------
					
					
				} //if
			} //j36
		} //i36
			return false;
	}
}