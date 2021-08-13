package atividades;

import java.util.Scanner;

public class pesquisaPsico {

	public static void main(String[] args) {
		
		int idade,sexo,mente,somaPC=0,somaMN=0,somaHA=0,somaOC=0,somaPN40= 0,somaPC18= 0,np=0;
		
		@SuppressWarnings("resource")
		Scanner read = new Scanner(System.in);
		
		while(np<=3)
		{
			System.out.println("\tDIGITE SUA IDADE: ");
			idade = read.nextInt();
			System.out.println("\tSEXO: \n\t1- MASC \n\t2- FEM \n\t3- PLUS");
			sexo = read.nextInt();
			System.out.println("\tSUA MENTALIDADE: \n\t1- CALMA \n\t2- NERVOSA \n\t3- AGRESSIVA");
			mente = read.nextInt();
			
			if(mente == 1)
			{
				somaPC++;
			}
			if(sexo == 2 && mente == 2)
			{
				somaMN++;
			}
			if(sexo == 1 && mente == 3)
			{
				somaHA++;
			}
			if(sexo == 3 && mente == 1)
			{
				somaOC++;
			}
			if(mente == 2 && idade > 40)
			{
				somaPN40++;
			}
			if(mente == 1 && idade < 18)
			{
				somaPC18++;
			}
			np++;
		}
		
		System.out.println("\tPESSOAS CALMAS --> " +somaPC);
		System.out.println("\tMULHERES NERVOSAS --> " +somaMN);
		System.out.println("\tHOMENS AGRESSIVOS --> " +somaHA);
		System.out.println("\tOUTRAS --> "+somaOC);
		System.out.println("\tPESSOAS NERVOSAS COM MAIS DE 40 ANOS --> " +somaPN40);
		System.out.println("\tPESSOAS CALMAS MENORES DE 18 ANOS --> " +somaPC18);
	}

}
