package questao1;

import java.util.Scanner;

/*
 * @brief impreme uma escada com n degraus e n arteiscos por degrau
 * centralizado a direita
 * */
public class MainTree {

	public static void main(String[] args) {

		System.out.print("Digite o numero de degraus: ");
		Scanner input = new Scanner(System.in);
		Tree arvore = new Tree();
		int number = input.nextInt();

		arvore.ImprimirArvore(number);
		input.close();
	}
}
