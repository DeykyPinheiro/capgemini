package questao3;

import java.util.ArrayList;
import java.util.List;

public class StringUtils {

	public List<List<String>> geradorNSubstring(String palavra) {

		List<List<String>> listaDesubstring = new ArrayList<>();
		for (int i = 0; i < palavra.length(); i++) {
			listaDesubstring.add(new ArrayList<String>(i));
			for (int j = i + 1; j < palavra.length() + 1; j++) {
				listaDesubstring.get(i).add(palavra.substring(i, j));
//				System.out.println("palavra adc: " + palavra.substring(i, j));
//				System.out.println("valor de i: " + i + " valor de j: " + j);
			}
		}
		return listaDesubstring;
	}

	public void compararSubstring(List<List<String>> listaDesubstring) {

		int quantosSaoAnagrama = 0;
		List<String> listaAnagramasRepetido = new ArrayList<>();
		for (int i = 0; i < listaDesubstring.size(); i++) {
//			System.out.println(listaDesubstring.get(i));
			for (int j = 0; j < listaDesubstring.get(i).size(); j++) {
				System.out.println(listaDesubstring.get(i).get(j));

//				for (int m = 0; m < listaDesubstring.size(); m++) {
//					for (int n = 0; n < listaDesubstring.get(m).size(); n++) {
////						System.out.println("i: " + i);
////						System.out.println("j: " + j);
////						
////						System.out.println("m: " + m);
////						System.out.println("n: " + n);
////						System.out.println("====================================================");
////						System.out.println("valor de m: "+ m);
//						if (compararAnagrama(listaDesubstring.get(i).get(j), listaDesubstring.get(m).get(n))) {
//							for(int a = 0; a < listaAnagramasRepetido.size(); a++) {
//								listaAnagramasRepetido.add(listaDesubstring.get(m).get(n));
//								if (compararAnagrama(listaDesubstring.get(m).get(n), listaAnagramasRepetido.get(a))) {
//									quantosSaoAnagrama++;									
//								}
//								
//							}
//							System.out.println(listaDesubstring.get(m).get(n));
////							System.out.println("string a: " + listaDesubstring.get(i).get(j));
////							System.out.println("string b: " + listaDesubstring.get(m).get(n));
//							System.out.println("====================================================");
//							break;
//						}
//					}
//				}
			}
//			System.out.println(listaAnagramasRepetido);
//			System.out.println(quantosSaoAnagrama);
		}
	}

//				System.out.println(listaDesubstring.get(i).get(j));

	public boolean compararAnagrama(String a, String b) {

		int contador = 0;
		int lenString = a.length();

		if (a.length() != b.length()) {
			return false;
		} else {
			for (int i = 0; i < lenString; i++) {
				for (int j = 0; j < lenString; j++) {

					if (a.toCharArray()[i] == b.toCharArray()[j]) {
						contador++;
					}
				}
			}
		}
		if (contador == lenString) {
			return true;
		}
		return false;
	}
}
