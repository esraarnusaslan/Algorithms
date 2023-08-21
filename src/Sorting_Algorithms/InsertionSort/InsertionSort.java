package Sorting_Algorithms.InsertionSort;

public class InsertionSort {


    public static void insertionSort(int arr[]){

        //her zaman sol tarafindaki elemana bakilacagi icin i degerini 1 ile baslatiyoruz


        for (int i = 1; i <arr.length ; i++) {

            int value=arr[i];//temp
            int j=i-1;

           while (j>=0 && arr[j]>value){
               arr[j+1]=arr[j];
               j=j-1;
           }
           arr[j+1]=value;
        }



    }



}
