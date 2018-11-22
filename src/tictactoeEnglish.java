import java.util.Scanner;

public class tictactoeEnglish {
	public static void main(String[] args) {
		Scanner myScan= new Scanner(System.in);
		String player="O";
		int iterations=0;
		String[] board;
		board= new String[11];
		
		for (int i = 0; i < board.length; i++) {board[i]=" ";}

		while (!checkWin(board, "O") && !checkWin(board, "X") && !(iterations==9)) {
			print(board);
			read(myScan, board, player);
			checkWin(board, player);
			if (player.equals("O")) {player="X";} else if (player.equals("X")) {player="O";}
			for (int i = 0; i < 50; i++) {System.out.println("");}
			iterations++;
		}
		
		
	}

	private static void print(String[] tablero) {
		System.out.println("TicTacToe game");
		System.out.println("This game uses a 3x3 matrix, which matches the number keypad.");
		System.out.println(tablero[7]+" | "+tablero[8]+" | "+tablero[9]);
		System.out.println(tablero[4]+" | "+tablero[5]+" | "+tablero[6]);
		System.out.println(tablero[1]+" | "+tablero[2]+" | "+tablero[3]);
	}

	private static boolean checkWin(String[] tablero, String jugador) {
		if ((tablero[1].equals(jugador) && tablero[2].equals(jugador) && tablero[3].equals(jugador) || (tablero[4].equals(jugador) && tablero[5].equals(jugador) && tablero[6].equals(jugador)) || (tablero[7].equals(jugador) && tablero[8].equals(jugador) && tablero[9].equals(jugador)) || (tablero[1].equals(jugador) && tablero[4].equals(jugador) && tablero[7].equals(jugador)) || (tablero[2].equals(jugador) && tablero[5].equals(jugador) && tablero[8].equals(jugador)) || (tablero[3].equals(jugador) && tablero[6].equals(jugador) && tablero[9].equals(jugador)) || (tablero[1].equals(jugador) && tablero[5].equals(jugador) && tablero[9].equals(jugador)) || (tablero[3].equals(jugador) && tablero[5].equals(jugador) && tablero[7].equals(jugador)))) {
			print(tablero);
			System.out.println("Player "+jugador+" won!");
			return true;
		} else {return false;}
	}

	private static void read(Scanner myScan, String[] tablero, String jugador) {
		int eleccion;
		System.out.print("In which position places player "+jugador+"? > ");
		eleccion= myScan.nextInt();
		while (!(tablero[eleccion].equals(" "))) {
			System.out.print("The position is occupied. Retry player "+jugador+" > ");
			eleccion= myScan.nextInt();
			
		}
		tablero[eleccion]=jugador;
	}
}
