package atividades;
import java.util.ArrayList;
import java.util.Scanner;

public class EstoqueSandro {

	public static void main(String[] args) {

		int escolha;

		Scanner read = new Scanner(System.in);

		ArrayList<String> estoqueEletro = new ArrayList();

		do {
			System.out.println("\n\t\t\tSEU ESTOQUE");
			System.out.println("\n\t(1) QUAIS S�O OS PRODUTOS NO ESTOQUE?" + "\n\t(2) QUER TIRAR ALGO DO ESTOQUE?"
					+ "\n\t(3) ATUALIZAR ESTOQUE" + "\n\t(4) VEJA TODOS OS PRODUTOS DO ESTOQUE"
					+ "\n\t(0) SAIR DO ESTOQUE");
			System.out.println("\n\tESCOLHA DIGITANDO O N�MERO DA OP��O");
			escolha = read.nextInt();

			switch (escolha) {
			case 1:
				read.nextLine();
				System.out.println("\nDIGITE O PRODUTO PARA ENTRAR NO ESTOQUE -->");
				String produto = read.nextLine();
				estoqueEletro.add(produto);
				break;
			case 2:
				read.nextLine();
				System.out.println("\nQUAL PRODUTO DESEJA RETIRAR DO ESTOQUE? ");
				String produtor = read.nextLine();
				if (estoqueEletro.contains(produtor)) {
					estoqueEletro.remove(produtor);
				} else {
					System.out.println("\nPRODUTO INDISPON�VEL");
				}
				break;
			case 3:
				read.nextLine();
				System.out.println("\nPRODUTO A ATUALIZAR: ");
				String verifica = read.nextLine();
				System.out.println("\nSUBSTITUTO DO PRODUTO" + verifica +": ");
				String novo = read.nextLine();

				if (estoqueEletro.contains(verifica)) {
					estoqueEletro.remove(verifica);
					estoqueEletro.add(novo);
				} else {
					System.out.println("\nPRODUTO N�O DISPON�VEL");
				}
				System.out.println("\n" + estoqueEletro);
				break;
			case 4:
				System.out.println("\nPRODUTOS DISPON�VEIS ");
				System.out.println("\n" + estoqueEletro);
				break;
			default:
				System.out.println("\nVOC� SAIU DO ESTOQUE!");
			}

		} while (escolha != 0);
	}

}
