package atividades;
import java.util.Scanner;

public class notasAluno {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner read = new Scanner(System.in);
		
		double N1,N2,N3,mediaF, notaP1,notaP2,notaP3;
			
		notaP1 = 2.0;
		notaP2 = 3.0;
		notaP3 = 5.0;

		System.out.println("\nQUAL A NOTA 1? ");
		N1 = read.nextDouble();
		
		System.out.println("\nQUAL A NOTA 2? ");
		N2 = read.nextDouble();
		
		System.out.println("\nQUAL A NOTA 3? ");
		N3 = read.nextDouble();

		mediaF= (N1/notaP1) + (N2/notaP2) + (N3/notaP3);
		System.out.println("\nSUA MÉDIA FINAL É --> "	);
		 System.out.println(mediaF);Math.floor(mediaF);
		 
	}

}
