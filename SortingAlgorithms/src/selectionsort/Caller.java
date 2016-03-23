package selectionsort;

import java.util.Scanner;

public class Caller {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        int arr[], n;
        
        @SuppressWarnings("resource")
		Scanner xyz = new Scanner(System.in);
        System.out.println("Enter the size of array");
        n = xyz.nextInt();
        arr= new int[n];
        System.out.println("Enter the elements");
        for (int i = 0; i < n; i++) 
            arr[i] = xyz.nextInt();
        
        
        SelectionSort arr1= new SelectionSort();
        arr1.sort(arr);
        
        System.out.print("Sorted Array: ");
        for(Integer obj : arr)
            System.out.print(" " +obj);

        }

}