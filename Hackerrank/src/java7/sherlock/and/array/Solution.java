package java7.sherlock.and.array;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    static String solve(int[] a){
        // Complete this function
    	int leftIndex = 0;
    	int rightIndex = a.length - 1;
    	
    	int leftSum = a[leftIndex];
    	int rightSum = a[rightIndex];
    	
    	while(leftIndex != rightIndex) {
    		
    		if(leftSum < rightSum) {
    			leftIndex += 1;
    			leftSum += a[leftIndex];
    		} else {
    			rightIndex -= 1;
    			rightSum += a[rightIndex];
    		}
    		
    	}
    	
    	return (leftSum == rightSum) ? "YES" : "NO";
 
    }

	public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int T = in.nextInt();
        for(int a0 = 0; a0 < T; a0++){
            int n = in.nextInt();
            int[] a = new int[n];
            for(int a_i=0; a_i < n; a_i++){
                a[a_i] = in.nextInt();
            }
            String result = solve(a);
            System.out.println(result);
        }
        
	}

}
