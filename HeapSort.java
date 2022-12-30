package com.mycompany.sorting.algorithms;

public class HeapSort {
    void heapify(int arr[], int n, int i) {
        int l = 2 * i + 1;
        int r = 2 * i + 2;
        int max = i;
        
        if(l < n && arr[l] > arr[max])
            max = l;
        if(r < n && arr[r] > arr[max])
            max = r;
        
        if(max != i) {
            int temp = arr[i];
            arr[i] = arr[max];
            arr[max] = temp;
            heapify(arr, n, max);
        }
    }
    void buildHeap(int arr[], int n) {
        for(int i = n / 2 -1; i >= 0; i--)
            heapify(arr, n, i);
    }
    void heapSort(int arr[], int n) {
        buildHeap(arr, n);
        for(int i = n-1; i >= 0; i--) {
            int temp = arr[0];
            arr[0] = arr[i];
            arr[i] = temp;
            heapify(arr, i, 0);
        }
    }
    void print(int arr[], int n) {
        for(int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
