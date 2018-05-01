package java7.strings.making.anagrams;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution1 {

    public static int numberNeeded(String first, String second) {
        
    	char[] firstChars = first.toCharArray();
    	int firstLen = firstChars.length;

    	char[] secondChars = second.toCharArray();
    	int secondLen = secondChars.length;
    	
    	StringBuilder firstSB = new StringBuilder();
    	StringBuilder secondSB = new StringBuilder();
    	
    	for (int i = 0; i < firstLen; i++){
    		for (int j = 0; j < secondLen; j++){
    			if(firstChars[i] == secondChars[j]){
    				firstSB.append(secondChars[j]);
    			} 
    		}
    	}
    	
    	
    	for (int i = 0; i < secondLen; i++){
    		for (int j = 0; j < firstLen; j++){
    			if(secondChars[i] == firstChars[j]){
    				secondSB.append(firstChars[j]);
    			}
    		}
    	}
   	
    	int secondCount = second.length() - secondSB.length();
    	int firstCount = first.length() - firstSB.length();
    	
    	/*
    	System.out.println("First String: " + firstSB.toString());
    	System.out.println("Second String: " + secondSB.toString());
    	System.out.println("First Count: " + (firstCount));
    	System.out.println("Second Count: " + (secondCount));
    	*/
    	
    	return (firstCount + secondCount);
    }
  
    public static void main(String[] args) {
    	
    	/*
        Scanner in = new Scanner(System.in);
        String a = in.next();
        String b = in.next();
        System.out.println(numberNeeded(a, b));
        in.close();
        */
    	
    	System.out.println(numberNeeded("cde", "abc"));
    	System.out.println(numberNeeded("arvind", "gudiseva"));
    	System.out.println(numberNeeded("haritha", "murari"));
    	
    }

}
