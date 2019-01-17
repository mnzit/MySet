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
public class Program {

    public static void main(String[] args) {
        MySet mySet = new MySet();
        Integer[] a = {23, 25, 27, 26};
        Integer[] b = {7, 8, 9, 10, 1, 2, 3};
        Integer[] c = {18, 19, 20, 21, 22, 23, 25, 27};
        Integer[] d = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20};
        DynamicArray<Integer> dynamicArray = mySet.union(new Object[]{a, b, c, d});
        for (Integer integer : dynamicArray.toArray(new Integer[dynamicArray.size()])) {
            System.out.println(integer);
        }
    }
}
