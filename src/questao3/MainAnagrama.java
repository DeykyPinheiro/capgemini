package questao3;

public class MainAnagrama {
	 public static void main(String[] args) 
	    {
	        String str = "ifailuhkqq"; 
	        System.out.println("String is:-"+str);
	        System.out.println("Anagram of the given string is:-");
	        
	        
	        int size = str.length(); 
	        Anagram a = new Anagram(); 
	        a.anagm(str, 0, size - 1); 
	    } 


}
