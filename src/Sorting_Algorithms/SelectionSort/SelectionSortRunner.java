package Sorting_Algorithms.SelectionSort;

import java.util.Arrays;

public class SelectionSortRunner {
    public static void main(String[] args) {

        int arr[]={7,4,5,9,8,2,1};

        System.out.println("Selection Sort oncesi array: " + Arrays.toString(arr));
        System.out.println("************************");
        SelectionSort.selectionSort(arr);
        System.out.println("Selection Sort sonrasi array: "+Arrays.toString(arr));



    }
}
