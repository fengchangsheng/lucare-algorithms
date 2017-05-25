package com.fcs.search;

/**
 * Created by Lucare.Feng on 2017/5/22.
 * 二分查找
 */
public class BinarySearch {

    public static int search(int[] a, int num, int low, int high){
        if (low > high) {
            return -1;
        }

        int mid = low + (high - low)/2;
        System.out.println("low=" + low + " mid=" + mid + " high=" + high);
        if (a[mid] < num){
            System.out.println("大的部分");
            return search(a, num, mid + 1, high);
        } else if (a[mid] > num){
            System.out.println("小的部分");
            return search(a, num, low, mid - 1);
        } else
            return mid;
    }

    public static int search(int[] a, int key){
        int low = 0, high = a.length - 1;
        while (low <= high) {
            int mid = (low + high) / 2;//可能会溢出
            if (a[mid] < key) {
                low = mid + 1;
            } else if (a[mid] > key) {
                high = mid - 1;
            } else {
                return mid;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] a = new int[]{-1,1,22,55,66,88,99,102,135,156,189,520,552};
        int exits = search(a, 135, 0, a.length - 1);
//        int exits = search(a, 552);
        System.out.println(exits);
    }
}
