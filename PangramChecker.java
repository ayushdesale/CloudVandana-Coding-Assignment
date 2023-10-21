package codeAssignment;

	import java.util.HashSet;

	public class PangramChecker {
	    public static boolean isPangram(String sentence) {
	        
	        sentence = sentence.replaceAll("\\s", "").toLowerCase();
	        
	        
	        HashSet<Character> uniqueCharacters = new HashSet<>();
	        
	       
	        for (char c : sentence.toCharArray()) {
	            if (c >= 'a' && c <= 'z') {
	                uniqueCharacters.add(c);
	            }
	        }
	        
	        
	        return uniqueCharacters.size() == 26;
	    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 String input = "The quick brown fox jumps over the lazy dog"; 
	        boolean isPangram = isPangram(input);
	        
	        if (isPangram) {
	            System.out.println("The input is a pangram.");
	        } else {
	            System.out.println("The input is not a pangram.");
	        }
	    }
	
	}


