package com.nitish.insertionsort;

public class InsertionSort {


public static void sort(int[] arr){
		int i,j,temp = 0;
		
		for(i=1; i<arr.length; i++){
			temp=arr[i];                  // start from i=1 and store arr[i] in temp
			j=i-1;					// inner loop compares elements to the left of arr[i]
			while (j>=0 && temp < arr[j])  // if temp < current left element 
			{
				arr[j+1] = arr[j];            //shift arr[j] one place to right
				j--;
			}
		arr[j+1] = temp;		// store the starting reference element							
		}                      //when current element (j) < a[i] 	
		
		for (Integer obj: arr)
			System.out.print(" " +obj);
	}
	
	public static void main(String args[]){
		int arr[] = {8,4,6,2,9,32,12};
		sort(arr);
	}
}
