package java7.arrays.search.value;

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

import java.io.*;
import java.math.*;
import java.text.*;
import java.util.*;
import java.util.regex.*;

public class Solution {

	/*
     * Complete the findNumber function below.
     */
    static String findNumber(int[] arr, int k) {
        /*
         * Write your code here.
         */
		int n = arr.length;
        
		for (int i = 0; i < n; i++){
    		
    		if(k == arr[i]){
    			return "YES";
    		}
    	}
        
        return "NO";
    }


	private static final Scanner scanner = new Scanner(System.in);
	
	public static void main(String[] args) throws IOException {
		
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int arrCount = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])*");

        int[] arr = new int[arrCount];

        for (int arrItr = 0; arrItr < arrCount; arrItr++) {
            int arrItem = scanner.nextInt();
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])*");
            arr[arrItr] = arrItem;
        }

        int k = scanner.nextInt();
        //scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])*");

        String res = findNumber(arr, k);

        bufferedWriter.write(res);
        bufferedWriter.newLine();

        bufferedWriter.flush();
        bufferedWriter.close();

        scanner.close();		
		
	}

}