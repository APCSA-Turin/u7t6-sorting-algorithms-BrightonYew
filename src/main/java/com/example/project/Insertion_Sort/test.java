package com.example.project.Insertion_Sort;

import java.util.ArrayList;
import java.util.Arrays;


public class test {
    public static void main(String[] args) {
    int[] arrA = {90,4,84,13,23,34,100};
    InsertionSort.selectionSort(arrA);
    System.out.println(Arrays.toString(arrA));
    System.out.println();
    int[] arrB = {90,4,84,13,23,34,100};
    InsertionSort.insertionSort(arrB);
    System.out.println(Arrays.toString(arrB));

    }
}
