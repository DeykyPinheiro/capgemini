package questao2;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class SenhaForteTest {

	@Test
	@DisplayName("retornaDois")
	void retornaDois() {
		String str = "2222";
		SenhaForte senhaForte = new SenhaForte();
		assertEquals(2, senhaForte.VefificarParametrosDaSenha(str));
	}
	
	@Test
	@DisplayName("retornaZero")
	void retornaZero() {
		String str = "123@aB";
		SenhaForte senhaForte = new SenhaForte();
		assertEquals(0, senhaForte.VefificarParametrosDaSenha(str));
	}
	
	@Test
	@DisplayName("FaltaDoisCaracteres")
	void FaltaDoisCaracteres() {
		String str = "3@aB";
		SenhaForte senhaForte = new SenhaForte();
		assertEquals(2, senhaForte.VefificarParametrosDaSenha(str));
	}
	
	@Test
	@DisplayName("FaltaTresCaracteres")
	void FaltaTresCaracteres() {
		String str = "Ya3";
		SenhaForte senhaForte = new SenhaForte();
		assertEquals(3, senhaForte.VefificarParametrosDaSenha(str));
	}
}
