package Sorting_Algorithms.SelectionSort;

public class SelectionSort {

   public static void selectionSort(int arr[]){
       int min;

       for (int i = 0; i <arr.length ; i++) {
           min=i;
           for (int j = i+1; j <arr.length ; j++) {
               if(arr[j]<arr[min]){
                   min=j;
               }
           }
           //swap islemi

           int temp=arr[i];
           arr[i]=arr[min];
           arr[min]=temp;

       }




   }


}
