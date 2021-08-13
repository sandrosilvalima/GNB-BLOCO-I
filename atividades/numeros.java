package atividades;

import java.util.Scanner;

public class numeros {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner read = new Scanner(System.in);

		double numero;
		System.out.println("\nDIGITE UM NÚMERO: ");
		numero = read.nextDouble();

		
		{System.out.println("\nÉ PAR! E SUA RAÍZ QUADRADADA É: "+Math.sqrt(numero));
		
		}if (numero % 2 !=0)
		{System.out.println("É ÍMPAR E SEU RESULTADO ELEVADO AO QUADRADO É: "+Math.pow(numero, 2));
		
		}

}

}
