package atividades;

import java.util.Scanner;
public class idadeCompleta {

	public static void main(String[] args) {
		
		@SuppressWarnings("resource")
		Scanner read = new Scanner(System.in);
		
		int diasTotal, anos, meses, dias;
	     System.out.println("\nQUANTOS DIAS VOC� ACHA QUE J� VIVEU? ");
	     diasTotal = read.nextInt();

	    anos = diasTotal / 365;
	    meses = (diasTotal % 365) /30;
	    dias = (diasTotal % 365) % 30;
	    System.out.println("\nVOC� J� VIVEU EXATOS: "+anos+ " "
	    		+ "ANO(S) "+meses+ " M�S(ES) E "+dias+" DIA(S) NESTA TERRA!");	    
	}

}
