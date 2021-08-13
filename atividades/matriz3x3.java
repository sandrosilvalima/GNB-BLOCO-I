package atividades;

import java.util.Scanner;

public class matriz3x3 {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner read = new Scanner(System.in);

		{
			float matriz[][] = new float[3][3];
			int linha, coluna, contMaior10= 0;

			for (linha = 0; linha < 3; linha++) {
				for (coluna = 0; coluna < 3; coluna++) {
					System.out.println("\n\t\tDIGITE UM NÚMERO: ");
					matriz[linha][coluna] = read.nextFloat();
				}
			}

			for (linha = 0; linha < 3; linha++)
				for (coluna = 0; coluna < 3; coluna++)
					if (matriz[linha][coluna] > 10)
						contMaior10++;
				
			System.out.println("\n\t\tEXISTEM: " + contMaior10+ " NÚMEROS MAIORES DO QUE 10 NA MATRIZ 3X3");

		}
	}


	}

