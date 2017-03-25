package com.gmail.italkingtan.structure.adapter;

/**
 * Created by tantan on 2017/1/23.
 */
public class Adapter implements ScoreOperation {
    //适配者
    public QuickSort quickSort = new QuickSort();
    public BinarySearch binarySearch = new BinarySearch();


    @Override
    public int[] sort(int[] array) {
        return quickSort.sort(array);
    }

    @Override
    public int search(int[] array, int key) {
        return binarySearch.search(array, key);
    }
}
