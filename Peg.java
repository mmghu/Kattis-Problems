// Purpose: Check possible moves given a peg board
// Preconditions: Properly formatted peg board
// Postconditions: Outputs number of possible moves
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;

public class Peg {
	
	/* Function that takes blank space and returns number of pieces that can move there */
	public static int checkMoves(ArrayList<ArrayList<String>> board, int x, int y){
		int total = 0;
		
		if(y-2 >= 0){ // check top positions
			if(board.get(y-1).get(x).equals("o") && board.get(y-2).get(x).equals("o")){total++;}
		}
		if(y+2 < 7){ // check bottom positions
			if(board.get(y+1).get(x).equals("o") && board.get(y+2).get(x).equals("o")){total++;}
		}
		if(x-2 >= 0){ // check left positions
			if(board.get(y).get(x-1).equals("o") && board.get(y).get(x-2).equals("o")){total++;}
		}
		if(x+2 < 7){ // check right positions
			if(board.get(y).get(x+1).equals("o") && board.get(y).get(x+2).equals("o")){total++;}
		}
		
		return total;
	} // end checkMoves
	
	public static void main(String[] args) throws IOException {
		// Get board state
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		ArrayList<ArrayList<String>> board = new ArrayList<ArrayList<String>>();
		
		// Loop through input and put into board
		for(int i = 0; i < 7; i++){
			// Split input into array -> convert to array list
			String[] temp = reader.readLine().split("");
			ArrayList<String> row = new ArrayList<String>(Arrays.asList(temp));
			board.add(row);
		} // end for loop
		
		int moves = 0;
		
		// Loop through possible moves
		for(int y = 0; y < 7; y++){
			for(int x = 0; x < 7; x++){
				if(board.get(y).get(x).equals(".")){ // If empty position
					moves += checkMoves(board, x , y); // Check how many pieces can move there and add to moves
				}
			}
		}
		
		// Output total moves to the user
		System.out.println(moves);
		
	} // end main
} // end class
