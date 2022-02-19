package questao1;

public class Tree {

	public void ImprimirArvore(int n) {

		for (int i = 0; i < n; i++) {
			for (int j = n - i - 1; j > 0 ; j--) {
				System.out.print(" ");
			}
			for (int j = 0; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	public int caracteresImpressos(int n) {
		
		int caracteresImpressoes = 0;
		for (int i = 0; i < n; i++) {
			for (int j = n - i - 1; j > 0 ; j--) {
				caracteresImpressoes++;
			}
			for (int j = 0; j <= i; j++) {
				caracteresImpressoes++;
			}
		}
		return caracteresImpressoes;
	}
}
