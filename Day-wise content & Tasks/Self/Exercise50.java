package techment.self;

import java.util.Arrays;
import java.util.Scanner;

public class Exercise50 {

	/** Program to find Anagram. If two strings contain same set of characters but in different
		order then the two strings are called anagrams */
	
	static void checkAnagram(String str1, String str2) 
	{  
        
		String s1 = str1.replaceAll("\\s", "");  
        String s2 = str2.replaceAll("\\s", ""); 
        
        boolean status = true;
        
        if (s1.length() != s2.length()) 
        {  
            status = false;  
        } 
        else 
        {  
            char[] ArrayS1 = s1.toLowerCase().toCharArray();  
            char[] ArrayS2 = s2.toLowerCase().toCharArray();  
            Arrays.sort(ArrayS1);  
            Arrays.sort(ArrayS2);  
            status = Arrays.equals(ArrayS1, ArrayS2);  
        }  
        
        if(status)   
            System.out.println(s1 + " and " + s2 + " are Anagrams.");  
        else  
            System.out.println(s1 + " and " + s2 + " are not Anagrams.");  
        
    }  
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter the first string : ");
		String word1 = scanner.next();
		System.out.print("Enter the secong string : ");
		String word2 = scanner.next();
		System.out.print("\n");
		
		//for checking Anagrams
		checkAnagram(word1, word2);
	}

}
