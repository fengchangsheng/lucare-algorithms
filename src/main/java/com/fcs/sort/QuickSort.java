package com.fcs.sort;

/**
 * Created by Lucare.Feng on 2017/5/19.
 */
public class QuickSort {

    /**
     * 三向切分快速排序
     */
    public static void threeSwapSort(int[] a, int low, int high){
        if (high <= low)
            return;
        int i = low, k = low + 1, j = high;
        int v = a[low];
        while (k <= j) {
            if (a[k] < v)
                SortUtil.exch(a, i++, k++);
            else if (a[k] > v)
                SortUtil.exch(a, k, j--);
            else
                k++;
        }
        threeSwapSort(a, low, i-1);
        threeSwapSort(a, j + 1, high);
        SortUtil.show(a);
    }

    public static void main(String[] args) {
        int a[] = new int[]{56,1,44,88,45,7,35};
        threeSwapSort(a, 0, a.length - 1);
    }

}
