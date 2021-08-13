package atividades;

import java.util.Scanner;

public class idadeCategoria {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner read = new Scanner(System.in);

		int idade;

		System.out.println("\nQUAL A SUA IDADE?: ");
		idade = read.nextInt();

		if (idade >= 0 && idade < 10) {
			System.out.println("\nSUA IDADE NÃO TEM CLASSIFICAÇÃO");
		}

		if (idade >= 10 && idade <= 14) {
			System.out.println("\nSUA IDADE ESTA NA CATEGORIA INFANTIL");
		}

		if (idade >= 15 && idade <= 17) {
			System.out.println("\nSUA IDADE ESTÁ NA CATEGORIA JUVENIL");
		}

		if (idade >= 18 && idade <= 25 || idade >25) {
			System.out.println("\nSUA IDADE ESTÁ NA CATEGORIA ADULTO");
		}

	}

}
