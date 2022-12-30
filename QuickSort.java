package com.mycompany.sorting.algorithms;

public class QuickSort {
    void swap(int arr[], int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    int partition(int arr[], int low, int high) {
        int pivot = arr[high];
        int i = low - 1;
        for(int j = low; j <= high; j++) {
            if(arr[j] < pivot) {
                i++;
                swap(arr, i, j);
            }
        }
        swap(arr, i+1, high);
        return (i+1);
    }
    void quickSort(int arr[], int low, int high) {
        if(low < high) {
            int pi = partition(arr, low, high);
            quickSort(arr, low, pi - 1);
            quickSort(arr, pi + 1, high);
        }
    }
    void print(int arr[], int n) {
        for(int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}

//        QuickSort quick = new QuickSort();
//        int arr[] = {15, -5, 64, 11, 96, 22};
//        int n = arr.length;
//       
//        System.out.println("Given Array: ");
//        quick.print(arr, n);
//        
//        quick.quickSort(arr, 0, n-1);
//        System.out.println("Sorted Array: ");
//        quick.print(arr, n);