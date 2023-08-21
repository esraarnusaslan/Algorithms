package Sorting_Algorithms.InsertionSort;

import java.util.Arrays;

public class InsertionSortRunner {
    public static void main(String[] args) {

        int arr[]={12,9,4,99,120,1,3,10};

        System.out.println("Insertion Sort Oncesi Array: "+ Arrays.toString(arr));


        System.out.println("***************************");


        InsertionSort.insertionSort(arr);

        System.out.println("Insertion Sort Sonrasi Array: "+ Arrays.toString(arr));




    }
}
