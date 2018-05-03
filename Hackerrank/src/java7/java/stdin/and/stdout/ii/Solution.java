package java7.java.stdin.and.stdout.ii;

import java.util.Scanner;

/*
 * Sample Input:
 * 	42
 * 	3.1415
 * 	Welcome to HackerRank's Java tutorials!
 * 	
 * Sample Output:
 * 	String: Welcome to HackerRank's Java tutorials!
 * 	Double: 3.1415
 * 	Int: 42
 * 
 */
public class Solution {

    public static void main(String[] args) {
    	
        Scanner scan = new Scanner(System.in);
        int i = scan.nextInt();

        // Write your code here.
        double d = scan.nextDouble();
        scan.nextLine(); // Reads the new line character
        String s = scan.nextLine();

        scan.close();
        
        System.out.println("String: " + s);
        System.out.println("Double: " + d);
        System.out.println("Int: " + i);
        
    }
}
