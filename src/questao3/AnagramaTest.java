package questao3;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class AnagramaTest {

	@Test
	@DisplayName("temQueRetornarZero")
	void temQueRetornarZero() {
		StringUtils c = new StringUtils();
		assertEquals(0, c.compararSubstring(c.geradorNSubstring("abc")));
	}
	
	@Test
	@DisplayName("temQueRetornarDois")
	void temQueRetornarDois() {
		StringUtils c = new StringUtils();
		assertEquals(2, c.compararSubstring(c.geradorNSubstring("ovo")));
	}
	
	@Test
	@DisplayName("temQueRetornarTres")
	void temQueRetornarTres() {
		StringUtils c = new StringUtils();
		assertEquals(3, c.compararSubstring(c.geradorNSubstring("ifailuhkqq")));
	}

}
