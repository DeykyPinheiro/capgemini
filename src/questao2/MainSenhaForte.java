package questao2;

import java.util.Scanner;

public class MainSenhaForte {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in); 
		SenhaForte senhaForte = new SenhaForte();
		
		String senha = input.nextLine();
		System.out.println(senhaForte.VefificarParametrosDaSenha(senha));
		input.close();
	}
}
