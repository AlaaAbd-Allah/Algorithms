package com.mycompany.sorting.algorithms;

public class InsertionSort {
    void insertionSort(int arr[], int n) {
        for(int i = 1; i < n; i++) {
            int key = arr[i];
            int j = i - 1;
            while(j >= 0 && arr[j] > key) {
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1] = key;
        }
    }
}

//        Main Code
//        InsertionSort insertion = new InsertionSort();
//        int arr[] = {12, 11, 5, 100, -20};
//        int n = arr.length;
//        System.out.println("Given Array: ");
//        insertion.print(arr);
//        insertion.insertionSort(arr, n);
//        System.out.println("Sorted array: ");
//        insertion.print(arr);