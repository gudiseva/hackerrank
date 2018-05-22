package java7.assessment1;

import java.util.Arrays;

/*
 * 
 * Given two arrays of positive integers, for each element in the second array, find the total number of elements in the first array which are less than
 * or equal to that element.  Store the values determined in an array.
 * 
 * For example, if the first array is [1, 2, 3] and the second array is [2, 4], then there are 2 elements in the first array less than or equal to 2.
 * There are 3 elements in the first array which are less than or equal to 4. We can store these answers in an array, answer = [2,3]
 * 
 * 
 */
public class Solution {
	
	static int binarySearch(int[] arr, int leftIndex, int rightIndex, int item) {
		
		int midIndex = leftIndex + (rightIndex - leftIndex) / 2;
		
		if (rightIndex >= leftIndex) {

			// Check if item is present at midIndex
			if (arr[midIndex] == item) {
				return midIndex;
			} else if (arr[midIndex] > item) {
				// If item is smaller, ignore right half
				return binarySearch(arr, leftIndex, midIndex - 1, item);
			} else {
				// If item is greater, ignore left half
				return binarySearch(arr, midIndex + 1, rightIndex, item);
			}
			
		} else {
			// if we reach here, then element is not present
			return -1;			
		}

	}

	public static void main(String[] args) {

		int arr1[] = {1, 2, 3};
        int arr2[] = {2, 4};
        
        // sort the first array
        Arrays.sort(arr1);
        
        int arr1Size = arr1.length;
        int arr2Size = arr2.length;
        
        int arr3[] = new int[arr2Size]; 
        
        // for each element of second array
        for (int i = 0; i < arr2Size; i++)  {
        	
        	int count = 0;
        	int element = arr2[i];

        	while (element >= arr1[0]) {

        		int result = binarySearch(arr1, 0, arr1Size - 1, element);
            	
            	if (result >= 0) {
            		count += 1;
            	}
            	element --;
        	}
        	arr3[i] = count;
        }
        
        // Print the third Array
        for(int i = 0; i < arr3.length; i++)
            System.out.print(arr3[i] + " ");
      
        System.out.println();
	}

}
