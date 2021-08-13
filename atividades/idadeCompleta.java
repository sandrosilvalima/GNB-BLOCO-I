package atividades;

import java.util.Scanner;
public class idadeCompleta {

	public static void main(String[] args) {
		
		@SuppressWarnings("resource")
		Scanner read = new Scanner(System.in);
		
		int diasTotal, anos, meses, dias;
	     System.out.println("\nQUANTOS DIAS VOCÊ ACHA QUE JÁ VIVEU? ");
	     diasTotal = read.nextInt();

	    anos = diasTotal / 365;
	    meses = (diasTotal % 365) /30;
	    dias = (diasTotal % 365) % 30;
	    System.out.println("\nVOCÊ JÁ VIVEU EXATOS: "+anos+ " "
	    		+ "ANO(S) "+meses+ " MÊS(ES) E "+dias+" DIA(S) NESTA TERRA!");	    
	}

}
