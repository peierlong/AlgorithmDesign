package com.peierlong.utils;

/**
 * @author elong
 * @version V1.0
 * @date 2017/12/12
 */
public class Util {

    public static void swap(Object[] a, int i, int j) {
        Object t = a[i];
        a[i] = a[j];
        a[j] = t;
    }

    public static boolean less(Object c1, Object c2) {
        return ((Comparable)c1).compareTo(c2) < 0;
    }

}
