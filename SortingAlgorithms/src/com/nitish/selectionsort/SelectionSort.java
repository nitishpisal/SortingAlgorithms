package com.nitish.selectionsort;

public class SelectionSort {
    
    public void sort(int a[]){
        int out,in=0,min=0;
        
        for(out=0; out<a.length-1; out++){   //outer loop
            min=out;                         // assume 0th as minimum    
                for(in=out+1; in<a.length; in++){  // inner loop starting from out+1
                    if(a[in]<a[min])            // if min is greater
                        min=in;                    //new min taken
                }
                
                int temp = a[min];
                a[min]=a[out];
                a[out]= temp;      //final swap after 1 round of inner loop    

        }        
    }
    
}