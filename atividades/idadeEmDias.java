package atividades;

import java.util.Scanner;
public class idadeEmDias {

	public static void main(String[] args) {
		
		@SuppressWarnings("resource")
		Scanner read = new Scanner(System.in);
		
		int anos, meses, dias, idadeDias, diasAno, diasMes;
		
		diasAno = 365;
		diasMes = 30;
			
		System.out.println("\nDIGITE SUA IDADE EM ANOS: ");
		anos = read.nextInt();
				
		System.out.println("\nDIGITE AGORA OS MESES: ");
		meses = read.nextInt();
		
		System.out.println("\nE POR FIM OS DIAS: ");
		dias = read.nextInt();
		
		idadeDias = (anos*diasAno) + (meses*diasMes + dias);
          System.out.println("\nSUA IDADE EM DIAS É IGUAL A: "+idadeDias+" DIAS");
		

	}

}
