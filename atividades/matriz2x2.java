package atividades;

import java.util.Scanner;

public class matriz2x2 {

	public static void main(String[] args) {

		float matriz1[][] = new float[2][2];
		float matriz2[][] = new float[2][2];
		float matriz3[][] = new float[2][2];

		int constante, lin, col, opção;

		Scanner read = new Scanner(System.in);

		for (lin = 0; lin < 2; lin++) {
			for (col = 0; col < 2; col++) {

				System.out.println("\nDIGITE UM NÚMERO PARA A MATRIZ 1: ");
				matriz1[lin][col] = read.nextFloat();
				System.out.println("\nDIGITE UM NÚMERO PARA A MATRIZ 2: ");
				matriz2[lin][col] = read.nextFloat();
			}
		}

		do 
		{
			System.out.println("\n\t\t\tESCOLHA UMA DAS OPÇÕES ABAIXO");
			System.out.println("\n\t\t(1) SOMAR AS DUAS MATRIZES");
			System.out.println("\n\t\t(2) SUBTRAIR A PRIMEIRA MATRIZ DA SEGUNDA");
			System.out.println("\n\t\t(3) ADICIONAR UMA CONSTANTE AS DUAS MATRIZES");
			System.out.println("\n\t\t(4) IMPRIMIR AS MATRIZES");
			System.out.println("\n\t\t(0) SAIR DO PROGRAMA");

			System.out.println("\nDIGITE SUA OPÇÃO: ");
			opção = read.nextInt();

			switch (opção) {
			case 1:
				for (lin = 0; lin < 2; lin++) {
					for (col = 0; col < 2; col++) {
						matriz3[lin][col] = matriz1[lin][col] + matriz2[lin][col];
						System.out.println("\nSOMA --> " + matriz3[lin][col]);
					}
				}
				break;
			case 2:
				for (lin = 0; lin < 2; lin++) {
					for (col = 0; col < 2; col++) {
						matriz3[lin][col] = matriz2[lin][col] - matriz1[lin][col];
						System.out.println("\nDIFERENÇA --> " + matriz3[lin][col]);
					}
				}
				break;
			case 3:
				System.out.println("\nDIGITE O VALOR DA CONSTANTE --> ");
				constante = read.nextInt();
				for (lin = 0; lin < 2; lin++) {
					for (col = 0; col < 2; col++) {
						matriz1[lin][col] = matriz1[lin][col] + constante;
						matriz2[lin][col] = matriz2[lin][col] + constante;
						System.out.println("\nMATRIZ 1: " + matriz1[lin][col]);
						System.out.println("\nMATRIZ 2: " + matriz2[lin][col]);
					}
				}
				break;
			case 4:
				for (lin = 0; lin < 2; lin++) {
					for (col = 0; col < 2; col++) {

						System.out.println("\nMATRIZ1: " + matriz1[lin][col]);
						System.out.println("\nMatriz2: " + matriz2[lin][col]);
					}
				}
				break;
			default:
				System.out.println("\nOPÇÃO INDISPONÍVEL");
				for (int x = 1; x <= 15; x++) {
					System.out.println("\n");
				}

			}
		} while (opção != 0);
	}

}
