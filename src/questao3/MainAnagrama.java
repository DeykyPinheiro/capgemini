package questao3;
import java.util.Arrays;


public class MainAnagrama {
	 public static void main(String[] args) 
	    {
	        String str = "ovo"; 
//	        System.out.println("String is:-"+str);
//	        System.out.println("Anagram of the given string is: ");
//	        
	        
	        int size = str.length(); 
	        Anagram a = new Anagram(); 
	        StringUtils c = new StringUtils();
	        a.anagm(str, 0, size - 1);
	        
//	        Arrays.sort(null);
	        
//	        System.out.println(a.getListaDeAnagramas());
//	        
	        c.compararSubstring(c.geradorNSubstring(str));
	        
//	        for (int i = 0; i< c.geradorNSubstring(str).size();i++ )
//	        	System.out.println(c.geradorNSubstring(str));
//	        System.out.println("tamanho da lista: "+ a.getListaDeAnagramas());
		}
	}
