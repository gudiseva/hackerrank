package java7.arrays.odd.numbers;

/*
 * <<< SET OUTPUT_PATH = System.out in Run As -> Run Configurations... -> Environment >>>
 * 
 * Given two integers, l and r, print all the odd numbers between l and r (l and r inclusive)
 * 
 * Complete the oddNumbers function: It has 2 parameters:
 * 
 * 1. An integer l, denoting the left part of the range.
 * 
 * 2. An integer r, denoting the right part of the range.
 * 
 * The function must return an array of integers denoting the odd numbers between l and r.
 * 
 * Input Format:
 * 
 * Read the following input:: the first line contains an integer, l, denoting the left part of the range.
 * 
 * The second line contains an integer, r, denoting the right part of the range.
 * 
 * Constraints:
 * 
 * 1<_l<_r<_10^5
 * 
 * Output Format: The function must return an array of integers denoting the odd numbers between l and r.
 * 
 * Sample Input 0: 2,5
 * 
 * Sample Output 0
 * 
 * Explanation 0: The value of l is 2 and value of r is 5. The odd numbers between [2,5] are 3 and 5.
 * 
 */


import java.io.*;
import java.math.*;
import java.text.*;
import java.util.*;
import java.util.regex.*;

public class Solution {

    /*
     * Complete the oddNumbers function below.
     */
	static int[] oddNumbers(int l, int r) {
		
	     /*
         * Write your code here.
         */
		int arrSize = 0;
		
		if(isEven(l) && isEven(r)) {
			arrSize = (r-l) / 2;
		} else if(isOdd(l) && isOdd(r)) {
			arrSize = ((r-l) / 2) + 1;
		} else if(isOdd(l) && isEven(r)) {
			arrSize = ((r-l) / 2) + 1;
		} else if(isEven(l) && isOdd(r)) {
			arrSize = ((r-l) / 2) + 1;
		}
		
		
		int oddArr[] = new int[arrSize];
		
		int counter = 0;
		while (r >= l) {
			if (isOdd(l)) {
				oddArr[counter] = l;
				counter++;
			}
			
			l++;
		}
		  
		return oddArr;
	}
	
	static boolean isEven (int n) {
		return (n % 2 == 0);
	}

	static boolean isOdd (int n) {
		return (n % 2 != 0);
	}
	
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
    	
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int l = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])*");

        int r = scanner.nextInt();
        //scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])*");

        int[] res = oddNumbers(l, r);
        
        for (int resItr = 0; resItr < res.length; resItr++) {
            bufferedWriter.write(String.valueOf(res[resItr]));

            if (resItr != res.length - 1) {
                bufferedWriter.write("\n");
            }
        }
        
        bufferedWriter.newLine();

        bufferedWriter.flush();
        bufferedWriter.close();
    	
        scanner.close();
    }
}
