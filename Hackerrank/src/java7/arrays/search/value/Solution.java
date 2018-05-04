package java7.arrays.search.value;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/*
 * Number of digits
 * Number in array
 * search in array
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
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])*");

        String res = arraySearch(a, n, k);
        //System.out.println(res);
        bufferedWriter.write("Result: " + res);

        bufferedWriter.newLine();
        bufferedWriter.flush();
        bufferedWriter.close();

        scanner.close();

	}

}
