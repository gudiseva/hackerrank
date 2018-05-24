package java7.stacks.balanced.brackets;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

	private static Stack<Character> stack = new Stack<Character>();
	
    private static final Scanner scanner = new Scanner(System.in);
    
    public static void main(String[] args) {
    	
        int t = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int tItr = 0; tItr < t; tItr++) {
            String expression = scanner.nextLine();
            
            //string to char array
        	char[] chars = expression.toCharArray();
        	System.out.println(isBalanced(chars) ? "YES" : "NO");
        	stack.clear();
        }

        scanner.close();
    	
    	/*
    	String expression1 = "{[()]}";
    	String expression2 = "{[(])}";
    	String expression3 = "{{[[(())]]}}";
    	
    	char[] chars1 = expression1.toCharArray();
    	char[] chars2 = expression2.toCharArray();
    	char[] chars3 = expression3.toCharArray();
    	
    	System.out.println(isBalanced(chars1) ? "YES" : "NO");
    	stack.clear();
    	System.out.println(isBalanced(chars2) ? "YES" : "NO");
    	stack.clear();
    	System.out.println(isBalanced(chars3) ? "YES" : "NO");
    	stack.clear();
    	*/		
    }

    private static boolean isBalanced(char exp[]) {
    	
    	for (int i = 0; i < exp.length; i++){
    		if (exp[i] == '{' || exp[i] == '(' || exp[i] == '['){
    			pushToStack(exp[i]);
    		}
    		
    		if (exp[i] == '}' || exp[i] == ')' || exp[i] == ']'){
    			
    			if (stack.isEmpty()) {
    				// There is an ending parenthesis without the corresponding pair of starting parenthesis.
    				return false;
    			}
    			char x = popFromStack();

    			if (!isMatchingPair(x, exp[i])){
    				return false;
    			}
    		}
    	}
    	
    	if (stack.isEmpty()) {
    		return true;
    	} else {
    		// Stack is not empty.  There is a starting parenthesis without a closing parenthesis.
    		return false;
    	}
    	
    }

	private static boolean isMatchingPair(char c, char x) {

		//System.out.println(c + " : " + x);
		if (c == '{' && x == '}'){
			return true;
		} else if (c == '(' && x == ')'){
			return true;
		} else if (c == '[' && x == ']') {
			return true;
		} else {
			return false;
		}
		
	}

	private static Character popFromStack() {
		return stack.pop();
	}

	private static void pushToStack(char c) {
		stack.push(c);		
	}
}
