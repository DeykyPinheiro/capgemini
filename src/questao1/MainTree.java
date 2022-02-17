package questao1;

import java.util.Scanner;

public class MainTree {
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		Tree arvore = new Tree();
		int number = input.nextInt();
		
		arvore.ImprimirArvore(number);
		input.close();
	}
}
