package com.nitish.bubblesort;

public class BubbleSort {
	
	public static void main(String args[]){
		int a[] = {4,23,7,43,23,98,65};
		sortBubble(a);
	}
	
	public static void sortBubble(int x[]){
		int out, in;
		int nElements = x.length;
		for (out=nElements-1; out>1; out--) //outer loop backward
			for(in=0; in<out; in++)         // inner loop forward
				if(x[in]>x[in+1])           //swap if left element > right element 
					swap(in,in+1,x);
		
		for(int i=0; i< x.length;i++)
			System.out.print(" " +x[i]);
	}

	private static void swap(int one, int two, int z[]) {
		int temp = z[one];
		z[one] = z[two];
		z[two] = temp;
		
	}

}
