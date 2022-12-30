package com.mycompany.sorting.algorithms;

public class BinarySearch {
    int binarySearch(int arr[], int l, int h, int key) {
        while(l <= h) {
            int m = (l + h) / 2;
            if(arr[m] == key)
                return m;
            if(arr[m] > key)
                h = m - 1;
            else
                l = m + 1;
        }
        return -1;
    }
}


//        BinarySearch bs = new BinarySearch();
//        
//        int arr[] = {12, 11, 5, 100, -20};
//        int n = arr.length;
//        
//        int key = 100;
//        int result = bs.binarySearch(arr, 0, n-1, key);
//        if(result == -1)
//            System.out.println("The number " + key + " was not founded");
//        else
//            System.out.println("The number " + key + " was founded at index [" + result + "]");