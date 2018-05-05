package java7.arrays.search.value;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/*
 * Input:
 * Line 1: Number of digits
 * Line 2: Array of Numbers
 * Line 3: Number to be searched in the Array
 * 
 * E.g.
 * 5
 * 1 2 3 4 5
 * 3
 * 
 * Output:
 * TRUE
 * 
 * <<< SET OUTPUT_PATH = System.out in Run As -> Run Configurations... -> Environment >>>
 * 
 */

public class Solution {

    public static String arraySearch(int[] a, int n, int k) {
    	
    	for (int i = 0; i < n; i++){
    		
    		if(k == a[i]){
    			return "YES";
    		}
    	}
        
        return "NO";
    }

	private static final Scanner scanner = new Scanner(System.in);
	
	public static void main(String[] args) throws IOException {
		
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])*");

        int a[] = new int[n];
        for(int a_i=0; a_i < n; a_i++){
            a[a_i] = scanner.nextInt();
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])*");
        }
        
        int k = scanner.nextInt();
        //scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])*");
        
        scanner.close();
        
        String res = arraySearch(a, n, k);
        bufferedWriter.write(String.valueOf(res));
        bufferedWriter.newLine();

        bufferedWriter.flush();
        bufferedWriter.close();

	}

}