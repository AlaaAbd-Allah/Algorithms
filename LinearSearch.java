package com.mycompany.sorting.algorithms;

public class LinearSearch {
    int linearSearch(int arr[], int n, int key) {
        for(int i = 0; i < n; i++) {
            if(arr[i] == key)
                return i;
        }
        return -1;
    }
    void print(int arr[], int n) {
        for(int i = 0; i < n; i++)
            System.out.print(arr[i] + " ");
        System.out.println();
    }
}
