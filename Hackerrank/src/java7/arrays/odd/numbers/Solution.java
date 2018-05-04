package java7.arrays.odd.numbers;

/*
 * 
Given two integers, l and r, print all the odd numbers between l and r (l and r inclusive)

Complete the oddNumbers function: It has 2 parameters:

1. An integer l, denoting the left part of the range.

2. An integer r, denoting the right part of the range.

The function must return an array of integers denoting the odd numbers between l and r.

Input Format:

Read the following input:: the first line contains an integer, l, denoting the left part of the range.

The second line contains an integer, r, denoting the right part of the range.

Constraints:

1<_l<_r<_10^5

Output Format: The function must return an array of integers denoting the odd numbers between l and r.

Sample Input 0: 2,5

Sample Output 0

Explanation 0: The value of l is 2 and value of r is 5. The odd numbers between [2,5] are 3 and 5.
 * 
 */


import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Solution {

	static int[] oddNumbers(int l, int r) {
		
		int odd[] = new int[r-l];
		int x = 0;
		  while (r >= l) {
			    if (l%2 != 0) {
			      System.out.println(l);
			      odd[x] = l;
			    }
			    l++;
			    x++;
			  }
		  
		return odd;
	}

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
    	
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int l = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])*");

        int r = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])*");

        int[] res = oddNumbers(l, r);

        System.out.println(res.length);
        for (int resItr = 0; resItr < res.length; resItr++) {
            bufferedWriter.write(String.valueOf(res[resItr]));

            if (resItr != res.length - 1) {
                bufferedWriter.write("\n");
            }
        }

        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
        
    	
    	//oddNumbers(94, 95);
    }
}
