package com.mycompany.sorting.algorithms;

public class SortingAlgorithms {

    public static void main(String[] args) {
        LinearSearch search = new LinearSearch();
        
        int arr[] = {12, 11, 5, 100, -20};
        int n = arr.length;
        int key = 12;
        int index = search.linearSearch(arr, n, key);
        
        if(index == -1)
            System.out.println("The number " + key + " was not founded");
        else
            System.out.println("The number " + key + " was founded at index[" + index + "]");
    }
}
