package atividades;

import java.util.Scanner;

public class maiorNumero {

	private static final int O = 0;

	public static void main(String[] args) {

		@SuppressWarnings("resource")
		Scanner read = new Scanner(System.in);

		int x, y, z, maior = O;

		System.out.println("\nDIGITE O PRIMEIRO NÚMERO: ");
		x = read.nextInt();
		System.out.println("\nDIGITE O SEGUNDO NÚMERO: ");
		y = read.nextInt();
		System.out.println("\nDIGITE O TERCEIRO NÚMERO: ");
		z = read.nextInt();

		if (x > y && x > z)
			maior = x;
		else if (y > x && y > z) {
			maior = y;
		} else {
			maior = z;
		}
		System.out.println("\nO MAIOR NÚMERO ENTRE OS APRESENTADOS É: " + maior);

	}

}
