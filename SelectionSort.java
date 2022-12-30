package com.mycompany.sorting.algorithms;

public class SelectionSort {
    void selectionSort(int arr[], int n) {
        
    for(int i = 0; i < n-1; i++) {
        int midIdx = i;
        
        for(int j = i+1; j < n; j++)
            if(arr[j] < arr[midIdx])
                midIdx = j;
        // swap
        int temp = arr[midIdx];
        arr[midIdx] = arr[i];
        arr[i] = temp;
    }
}
    void print(int arr[]) {
        int n = arr.length;
        for(int i = 0; i < n; i++)
            System.out.print(arr[i] + " ");
        System.out.println();
    }
}
        // Main Code
//        SelectionSort selection = new SelectionSort();
//        int arr[] = {15, -5, 64, 11, 96, 22};
//        int n = arr.length;
//        System.out.println("Given Array: ");
//        selection.print(arr);
//        selection.selectionSort(arr, n);
//        System.out.println("Sorted array: ");
//        selection.print(arr);