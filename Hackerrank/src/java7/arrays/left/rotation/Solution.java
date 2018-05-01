package java7.arrays.left.rotation;

import java.util.Scanner;


/*
 * Sample Input
 * 5 4
 * 1 2 3 4 5
 * 
 * Sample Output
 * 5 1 2 3 4
 * 
 */


public class Solution {

    public static int[] arrayLeftRotation(int[] a, int n, int k) {
    	
    	/*
        int[] result = new int[]{ 5, 1, 2, 3, 4 }; 
        return result;
        */
    	
    	for (int i = 0; i < k; i++){
    		int temp = a[0];
    		for (int j = 0; j < n-1; j++){
    			a[j] = a[j+1];    				
    		}
    		a[n-1] = temp;
    	}
        
        return a;
    }

	public static void main(String[] args) {
		
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        int a[] = new int[n];
        for(int a_i=0; a_i < n; a_i++){
            a[a_i] = in.nextInt();
        }
      
        int[] output = new int[n];
        output = arrayLeftRotation(a, n, k);
        for(int i = 0; i < n; i++)
            System.out.print(output[i] + " ");
      
        System.out.println();

        in.close();
	}

}
