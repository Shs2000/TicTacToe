import java.util.Scanner;

public class tictactoeSpanish {
	public static void main(String[] args) {
		Scanner miEscaner= new Scanner(System.in);
		String jugador="O";
		int iteraciones=0;
		String[] tablero;
		tablero= new String[11];
		
		for (int i = 0; i < tablero.length; i++) {tablero[i]=" ";}

		while (!comprobarGanador(tablero, "O") && !comprobarGanador(tablero, "X") && !(iteraciones==9)) {
			imprimir(tablero);
			leer(miEscaner, tablero, jugador);
			comprobarGanador(tablero, jugador);
			if (jugador.equals("O")) {jugador="X";} else if (jugador.equals("X")) {jugador="O";}
			for (int i = 0; i < 50; i++) {System.out.println("");}
			iteraciones++;
		}
		
		
	}

	private static void imprimir(String[] tablero) {
		System.out.println("Juego del 3 en raya");
		System.out.println("Este juego utiliza una rejilla del 3x3, que se corresponde con el teclado numérico.");
		System.out.println(tablero[7]+" | "+tablero[8]+" | "+tablero[9]);
		System.out.println(tablero[4]+" | "+tablero[5]+" | "+tablero[6]);
		System.out.println(tablero[1]+" | "+tablero[2]+" | "+tablero[3]);
	}

	private static boolean comprobarGanador(String[] tablero, String jugador) {
		if ((tablero[1].equals(jugador) && tablero[2].equals(jugador) && tablero[3].equals(jugador) || (tablero[4].equals(jugador) && tablero[5].equals(jugador) && tablero[6].equals(jugador)) || (tablero[7].equals(jugador) && tablero[8].equals(jugador) && tablero[9].equals(jugador)) || (tablero[1].equals(jugador) && tablero[4].equals(jugador) && tablero[7].equals(jugador)) || (tablero[2].equals(jugador) && tablero[5].equals(jugador) && tablero[8].equals(jugador)) || (tablero[3].equals(jugador) && tablero[6].equals(jugador) && tablero[9].equals(jugador)) || (tablero[1].equals(jugador) && tablero[5].equals(jugador) && tablero[9].equals(jugador)) || (tablero[3].equals(jugador) && tablero[5].equals(jugador) && tablero[7].equals(jugador)))) {
			imprimir(tablero);
			System.out.println("Ganó el Jugador "+jugador);
			return true;
		} else {return false;}
	}

	private static void leer(Scanner myScan, String[] tablero, String jugador) {
		int eleccion;
		System.out.print("¿En que posición marca el jugador "+jugador+"? > ");
		eleccion= myScan.nextInt();
		while (!(tablero[eleccion].equals(" "))) {
			System.out.print("La casilla está ocupada. Reintentar jugador "+jugador+" > ");
			eleccion= myScan.nextInt();
			
		}
		tablero[eleccion]=jugador;
	}
}
