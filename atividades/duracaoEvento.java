package atividades;
import java.util.Scanner;

public class duracaoEvento {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner read = new Scanner(System.in);

		
		int horas, minutos, segundos, seg;
	      System.out.println("\nFICAMOS SEM NENHUM ACIDENTE NA FÁBRICA DURANTE: ");
	      segundos = read.nextInt();
	      
	      horas = segundos / 365;
	      minutos = (segundos % 3600) /60;
	      seg = (segundos % 3600) % 60;

	      System.out.println("\nFICAMOS SEM ACIDENTES DURANTE: "+horas+
		" HORA(S) "+minutos+ " MINUTO(S) E "+seg+ " SEG(S)");
		
		
	}
}
