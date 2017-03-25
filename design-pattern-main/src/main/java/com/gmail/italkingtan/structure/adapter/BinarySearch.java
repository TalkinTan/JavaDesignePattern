package com.gmail.italkingtan.structure.adapter;

/**
 * Created by tantan on 2017/1/23.
 */
public class BinarySearch {
    public int search(int[] array, int key) {

        int start = 0;
        int end = array.length - 1;

        while (start <= end) {
            int mid = (end + start) / 2;
            
            int midVal = array[mid];
            if (midVal > key) {
                end = mid - 1;
            } else if (midVal < key) {
                start = mid + 1;
            } else {
                return 1;
            }

        }

        return -1;
    }

}
