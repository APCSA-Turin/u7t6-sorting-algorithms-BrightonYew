package com.example.project.Selection_Sort;
public class test {
    public static void main(String[] args) {
        int[] test = {10,8,4,2,9,11,20,100};
        int[] sorted = SelectionSort.selectionSort(test);
        for (int i = 0; i < sorted.length;i++) {
            System.out.print(sorted[i] + " "); //FIRST TRY LETS FUCKING GO
        }
    }
}