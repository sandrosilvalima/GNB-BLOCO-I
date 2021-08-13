package atividades;

import java.util.Scanner;

public class mediaMult3 {

	public static void main(String[] args) {

		int num;
		float media3= 0, soma3 = 0, mult3 = 0;

		@SuppressWarnings("resource")
		Scanner read = new Scanner(System.in);

		do {
			System.out.println("\nDIGITE UM NÚMERO, SE QUISER VER O RESULTADO DIGITE O: ");
			num = read.nextInt();
			
			if (num % 3 == 0 && num != 0) 
			{
				soma3 = soma3 + num;
				mult3++;
			}

		} while (num != 0);

			if (mult3 != 0) {
			media3 = soma3 / mult3;

			System.out.println("\nMÉDIA DOS MÚLTIPLOS DE 3 É IGUAL A --> " + media3);
		} else {
			
			
		}
	}

	{

	}

}
