package atividades;

import java.util.Scanner;

public class maiorNumero {

	private static final int O = 0;

	public static void main(String[] args) {

		@SuppressWarnings("resource")
		Scanner read = new Scanner(System.in);

		int x, y, z, maior = O;

		System.out.println("\nDIGITE O PRIMEIRO N�MERO: ");
		x = read.nextInt();
		System.out.println("\nDIGITE O SEGUNDO N�MERO: ");
		y = read.nextInt();
		System.out.println("\nDIGITE O TERCEIRO N�MERO: ");
		z = read.nextInt();

		if (x > y && x > z)
			maior = x;
		else if (y > x && y > z) {
			maior = y;
		} else {
			maior = z;
		}
		System.out.println("\nO MAIOR N�MERO ENTRE OS APRESENTADOS �: " + maior);

	}

}
