package atividades;
import java.util.Scanner;

public class ordemCrescente {

	public static void main(String[] args) {

		int x, y, z;

		@SuppressWarnings("resource")
		Scanner read = new Scanner(System.in);

		System.out.println("\nENTRE COM O PRIMEIRO NÚMERO: ");
		x = read.nextInt();
		System.out.println("\nENTRE COM O SEGUNDO NÚMERO: ");
		y = read.nextInt();
		System.out.println("\nENTRE COM O TERCEIRO NÚMERO: ");
		z = read.nextInt();

		if (x <= y && y <= z) {
			System.out.println("\nOrdem crescente: " + x + ", " + y + " e " + z);
		} else if (x <= z && z <= y) {
			System.out.println("\nOrdem crescente: " + x + ", " + z + " e " + y);
		} else if (y <= x && x <= z) {
			System.out.println("\nOrdem crescente: " + y + ", " + x + " e " + z);
		} else if (y <= z && z <= x) {
			System.out.println("\nOrdem crescente: " + y + ", " + z + " e " + x);
		} else if (z <= x && x <= y) {
			System.out.println("\nOrdem crescente: " + z + ", " + x + " e " + y);
		} else {
			System.out.println("\nOrdem crescente: " + z + ", " + y + " e " + x);
		}
	}

	{

	}

}
