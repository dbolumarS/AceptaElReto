package _176;

import java.util.Scanner;

public class Campo_minas {

	public static void main(String[] args) {
		
		Scanner tec = new Scanner(System.in);

		
		System.out.println("Introduce ancho campo: ");
		int ancho = tec.nextInt();
		System.out.println("Introduce el alto del campo: ");
		int alto = tec.nextInt();
		
		String[][] tablero = new String[alto][ancho];
		for (int i = 0; i < tablero.length; i++) {
			for (int j = 0; j < tablero.length-1; j++) {
				System.out.println("fila " + i + ", añade contenido:");
				String contenido = tec.next();
				tablero[i][j] = contenido;
			}
		}
		
		
		int cont = 0;
		int cont_total = 0;
		for (int i = 1; i < tablero.length; i++) {
			for (int j = 1; j < tablero[i].length; j++) {
				if (tablero[i][j].equals("-")){
					for (int x=i-1; x <= i+1; x++) {
						for (int y = j-1; y <= j+1 ; y++) {
							if(tablero[x][y].equals("*")){
								cont++;
							}
						}
					}
					if(cont >= 6){
						cont_total++;
					}
				}
			}
		}
		System.out.println("Salida:" + cont_total);
	}
}
