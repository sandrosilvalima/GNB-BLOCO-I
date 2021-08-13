package atividades;

import java.util.Scanner;

public class par_impar {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner read = new Scanner(System.in);

		int num, somaP = 0, somaI = 0;

		for (int x = 1; x <= 10; x++) {
			System.out.println("\nDIGITE O " + x + "º NÚMERO:");
			num = read.nextInt();

			if (num % 2 == 0) 
			{
				somaP++;
			}

			if (num % 2 !=0) 
			{
				somaI++;
			}

		}

		System.out.println("\n\tENCONTRAMOS " + somaP + " NÚMERO(S) PAR(ES)");
		System.out.println("\t---------------------------------");
		System.out.println("\tENCONTRAMOS " + somaI + " NÚMERO(S) ÍMPAR(ES)");

	}
}