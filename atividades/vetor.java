package atividades;

import java.util.Scanner;

public class vetor {

	public static void main(String[] args) {

		  int[] vetor = new int[6];

	        Scanner read = new Scanner(System.in);

	        for (int s = 0; s < 6; s++) {
	            System.out.print("\n\t\tDIGITE UM NÚMERO: ");
	            vetor[s] = read.nextInt();
	        }

	        for (int i = 0; i < 6; i++) {
	            System.out.print("\n\t\t "+" "+vetor[5 - i]);
		
		
			
	}

}
}
