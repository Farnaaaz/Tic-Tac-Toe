// it is not complete yet

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class TicTacToe {

	public static void main(String[] args) {
		
		//static ArrayList<Integer> userPosition = new ArrayList<Integer>();
		//static ArrayList<Integer> computerPosition = new ArrayList<Integer>();

		
		char[][] board = {{' ', '|', ' ', '|', ' '},
						          {'-', '+', '-', '+', '-'},
						          {' ', '|', ' ', '|', ' '},
						          {'-', '+', '-', '+', '-'},
						          {' ', '|', ' ', '|', ' '}};
		
		
			//PrintBoard(board);
		

		while(true) {
			Scanner input = new Scanner(System.in);

			System.out.print("Please enter a location to play (between 1-9): ");
			int userPosition = input.nextInt();
			
			PlacePiece(board, userPosition, "user");
			PrintBoard(board);
			
			Random randPosition = new Random();
			int computerPosition = randPosition.nextInt(9)+1;
			PlacePiece(board, computerPosition, "computer");

			
			PrintBoard(board);
			}

	}
	public static void PrintBoard(char[][] board) {
		
		for (int i = 0; i < board.length; i++) {
			for(int j = 0; j < board.length; j++){
				System.out.print(board[i][j]);
			}
			System.out.println();
		}
	}
		public static void PlacePiece (char[][] board, int position, String player) {
			
			char piece = 'X';
			
			if ( player.equals("user")) {
				 piece = 'X';
			} else if (player.equals("computer") ) {
				piece = 'O';
			}
			
			
			switch(position){
			
			case 1: 
				board[0][0] = piece;
			   	break;
				
			case 2: 
				board[0][2] = piece;
				break;
				
			case 3: 
				board[0][4] = piece;
				break;
				
			case 4: 
				board[2][0] = piece;
				break;
								
			case 5: 
			    board[2][2] = piece;
				break;
				
			case 6: 
				board[2][0] = piece;
				break;
				
			case 7: 
				board[4][0] = piece;
				break;			
		
			case 8: 
				board[4][2] = piece;
				break;
				
			case 9: 
				board[4][4] = piece;
				break;
			default:
				break;
			}
		}
		
		public static String isWinner() {
			
			List topRow = Arrays.asList(1,2,3);
			List midRow = Arrays.asList(4,5,6);
			List botRow = Arrays.asList(7,8,9);
			List leftCol = Arrays.asList(1,4,7);
			List midCol = Arrays.asList(2,5,8);
			List rightCol = Arrays.asList(3,6,9);
			List diag1 = Arrays.asList(1,5,9);
			List diag2 = Arrays.asList(3,5,7);
			
			List<List> Winning = new ArrayList<List>();
			Winning.add(topRow);
			Winning.add(midRow);
			Winning.add(botRow);
			Winning.add(leftCol);
			Winning.add(midCol);
			Winning.add(rightCol);
			Winning.add(diag1);
			Winning.add(diag2);

			for (List l: Winning) {
				if(userPosition.containsAll(l))
					return " Congratulations";
				else if (computerPosition.containsAll(l))
					return "Computer won!";
			}



			return " "; 
		}
		
	public static void printGameBoard (char [][] gameBoard){ 
        for(char[] row : gameBoard) {
            for(char c : row) {
                System.out.print(c);              
            }
            System.out.println();
        }
    }
}
} 
	
