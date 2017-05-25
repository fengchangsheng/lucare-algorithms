package com.fcs.sort;

/**
 * Created by Lucare.Feng on 2017/5/19.
 * 初级排序算法
 */
public class SimpleSort {

    /**
     * 选择排序
     * 首先，找到数组中最小的那个元素，其次，将它和数组的第一个元素交换位置。
     * 再次，在剩下的元素中找到最小的元素，将它与数组的第二个元素交换位置，
     * 如此往复，直到将整个数组排序
     */
    public static void selectSort(int[] a){
        int n = a.length;
        for (int i = 0; i < n; i++) {
            int min = i;
            for (int j = i + 1; j < n; j++) {
                if (a[j] < a[min]) {
                    min = j;
                }
            }
            SortUtil.exch(a, i, min);
            SortUtil.show(a);
        }
    }

    /**
     * 插入排序
     */
    public static void insertSort(int[] a){
        int n = a.length;
        for (int i = 1; i < n; i++) {
            for (int j = i; j > 0; j--) {
                if (a[j] < a[j-1])
                    SortUtil.exch(a, j, j - 1);
            }
            SortUtil.show(a);
        }
    }

    public static void main(String[] args) {
        int a[] = new int[]{56,1,44,88,45,7,35};
//        selectSort(a);
        insertSort(a);
    }


}
