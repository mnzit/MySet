/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mnzit.myset;

/**
 *
 * @author Mnzit
 */
public class MySet {

    private DynamicArray<Integer> dynamicArray;

    public DynamicArray<Integer> intersection(Object[] coll) {
        dynamicArray = new DynamicArray();
        Integer[] a, b;
        int i = 0;
        while (i < coll.length - 1) {
            a = i > 0 ? dynamicArray.toArray(new Integer[dynamicArray.size()]) : (Integer[]) coll[i];
            dynamicArray = new DynamicArray();
            b = (Integer[]) coll[i + 1];
            for (Integer a1 : a) {
                for (Integer b1 : b) {
                    if (a1 == b1) {
                        dynamicArray.put(a1);
                        break;
                    }
                }
            }
            i++;
        }
        return dynamicArray;
    }

    public Object[] sort(Object[] coll) {
        int collLength = coll.length;
        Object[] val = new Object[collLength];
        for (int m = 0; m < collLength; m++) {
            int[] single = (int[]) coll[m];
            int length = single.length;
            for (int i = 0; i < length; i++) {
                for (int j = 0; j < length - i - 1; j++) {
                    if (single[j] > single[j + 1]) {
                        int temp = single[j];
                        single[j] = single[j + 1];
                        single[j + 1] = temp;
                    }
                }
            }
            val[m] = single;
        }
        return val;
    }

    public DynamicArray<Integer> complementDifference(Object[] coll) {
        dynamicArray = new DynamicArray();
        int count = 0, i = 0;
        Integer[] a, b;
        while (i < coll.length - 1) {
            a = i > 0 ? dynamicArray.toArray(new Integer[dynamicArray.size()]) : (Integer[]) coll[i];
            dynamicArray = new DynamicArray();
            b = (Integer[]) coll[i + 1];
            for (Integer a1 : a) {
                for (Integer b1 : b) {
                    if (a1 != b1) {
                        count++;
                        if (count == b.length) {
                            dynamicArray.put(a1);
                        }
                    } else {
                        break;
                    }
                }
                count = 0;
            }
            i++;
        }
        return dynamicArray;
    }

    public DynamicArray<Integer> union(Object[] coll) {
        dynamicArray = new DynamicArray();
        int count = 0, count2 = 0, i = 0;
        Integer[] a, b;
        while (i < coll.length - 1) {
            a = i > 0 ? dynamicArray.toArray(new Integer[dynamicArray.size()]) : (Integer[]) coll[i];
            dynamicArray = new DynamicArray();
            b = (Integer[]) coll[i + 1];
            for (Integer a1 : a) {
                for (Integer b1 : b) {
                    if (count2 == 0) {
                        dynamicArray.put(b1);
                    }
                    if (a1 != b1) {
                        count++;
                        if (count == b.length) {
                            dynamicArray.put(a1);
                        }
                    } else {
                        break;
                    }

                }
                count = 0;
                count2++;
            }
            i++;
            count2 = 0;
        }
        return dynamicArray;
    }
}
