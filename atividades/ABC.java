package atividades;

import java.util.Scanner;

	public class ABC {
	public static void main(String[] args) {

		@SuppressWarnings("resource")
		Scanner read = new Scanner(System.in);

		double R, S, D;
		int a, b, c;

		System.out.println("\nINSIRA O PRIMEIRO VALOR ");
		a = read.nextInt();

		System.out.println("\nINSIRA O SEGUNDO VALOR ");
		b = read.nextInt();

		System.out.println("\nINSIRA O TERCEIRO VALOR ");
		c = read.nextInt();

		R = (a + b) ^ 2;
		S = (b + c) ^ 2;
		D = (R + S) / 2;
		
		System.out.println("O RESULTADO É: "+ D);
	}
}
