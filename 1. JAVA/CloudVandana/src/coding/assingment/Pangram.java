package coding.assingment;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Pangram {
	
	public static Boolean pangram(String sen) {
		if(sen.length()<26) {
			return false;
		}
		sen =sen.toLowerCase();
		for(char c='a'; c<='z'; c++) {
			if(sen.indexOf(c)<0) {
				return false;
			}
		}
		return true;
	}
	
	public static boolean isPangram(String s) {
		if(s.length()<26) {
			return false;
		}
		
		s=s.toLowerCase();
		
		Set<Character> set = new HashSet<Character>();
		for(char c='a'; c<='z'; c++) {
			set.add(c);
		}
		
		char[] charArray = s.toCharArray(); // Convert the string to a character array
		for (int i = 0; i < charArray.length; i++) {
		    if (set.contains(charArray[i])) {
		        set.remove(charArray[i]);
		    }
		}
		return set.isEmpty();
	}

	public static void main(String[] args) {

		System.out.println("Enter a Sentence to clarify It is pangram or not: ");
		Scanner sc = new Scanner(System.in);
		
		String sen = sc.nextLine();
		
		System.out.println(pangram(sen));
		System.out.println(isPangram(sen));
	}

}

