package atividades;

import java.util.Scanner;

public class seisNumerosInt {

	public static void main(String[] args) {

	}

	Scanner read = new Scanner(System.in);

	{
		float matriz[][] = new float[3][3];
		int linha, coluna, contador = 0;

		for (linha = 0; linha < 3; linha++) {
			for (coluna = 0; coluna < 3; coluna++) {
				System.out.println("\nDIGITE UM NÚMERO: ");
				matriz[linha][coluna] = read.nextFloat();
			}
		}

		for (linha = 0; linha < 3; linha++)
			for (coluna = 0; coluna < 3; coluna++)
				if (matriz[linha][coluna] > 10)
					contador++;

		System.out.println("\n\nEXISTEM: " + contador);

	}
}
