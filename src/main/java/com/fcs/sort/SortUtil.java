package com.fcs.sort;

/**
 * Created by Lucare.Feng on 2017/5/19.
 */
public class SortUtil {

    /**
     * 交换位置
     */
    public static void exch(int[] a, int i, int j) {
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }

    public static void show(int[] a) {
        for (int v : a) {
            System.out.print(v + " ");
        }
        System.out.println();
    }
}
