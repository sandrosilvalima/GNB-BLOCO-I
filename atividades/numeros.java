package atividades;

import java.util.Scanner;

public class numeros {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner read = new Scanner(System.in);

		double numero;
		System.out.println("\nDIGITE UM N�MERO: ");
		numero = read.nextDouble();

		
		{System.out.println("\n� PAR! E SUA RA�Z QUADRADADA �: "+Math.sqrt(numero));
		
		}if (numero % 2 !=0)
		{System.out.println("� �MPAR E SEU RESULTADO ELEVADO AO QUADRADO �: "+Math.pow(numero, 2));
		
		}

}

}
