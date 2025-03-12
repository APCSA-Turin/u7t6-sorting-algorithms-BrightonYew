package com.example.project.Selection_Sort;
import java.util.ArrayList;

public class test {
    public static void main(String[] args) {
        ArrayList<String> test2 = new ArrayList<String>();
        test2.add("d");
        test2.add("i");
        test2.add("c");
        test2.add("e");
        test2.add("a");
        test2.add("j");
        test2.add("k");
        test2.add("h");
        test2.add("b");
        test2.add("l");
        test2.add("f");
        test2.add("g");

        
        ArrayList<String> test3 = SelectionSort.selectionSortWordList(test2);
        System.out.println(test3);
    }
}