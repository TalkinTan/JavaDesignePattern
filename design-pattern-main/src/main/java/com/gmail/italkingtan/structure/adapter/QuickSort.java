package com.gmail.italkingtan.structure.adapter;

/**
 * Created by tantan on 2017/1/23.
 */
public class QuickSort {
    public int[] sort(int[] array) {

        for (int i = 0, len = array.length; i < len; i++) {
            for (int j = i + 1; j < len; j++) {

                if (array[i] > array[j]) {
                    swap(array, i, j);
                }

            }
        }

        return array;
    }


    private void swap(int[] array, int i, int j) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }

}
