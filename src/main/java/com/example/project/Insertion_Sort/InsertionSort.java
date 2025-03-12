package com.example.project.Insertion_Sort;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class InsertionSort {

    // PART A. implementing insertion sort
    public static int[] insertionSort(int[] elements) {
        int count = 0;
        for (int j = 0; j < elements.length; j++) {
            int temp = elements[j];
            int possibleIndex = j;
            while (possibleIndex > 0 && temp < elements[possibleIndex - 1]) {
                count++;
                elements[possibleIndex] = elements [possibleIndex - 1];
                possibleIndex--;
            }
            elements[possibleIndex] = temp;
        }
        System.out.println(count);
        return elements;
    }

   
    public static int[] selectionSort(int[] elements) {

        int minInt = 0;
        int minIntIndex = 0;
        int tempInt = 0;
        int currentInt = 0;
        int counter = 0;

        for (int i = 0; i < elements.length; i++) { //searches through elements

            currentInt = elements[i];
            minInt = elements[i];
            minIntIndex = i;

            for (int j = i + 1; j < elements.length; j++) { //searches the list ahead
                counter++;
                if (elements[j] < minInt) { //looks if the element is less than the lowest so far

                    minInt = elements[j];
                    minIntIndex = j;

                }
            }

            tempInt = currentInt; //swap
            elements[i] = elements[minIntIndex];
            elements[minIntIndex] = tempInt;
        }
        System.out.println(counter);
        return elements;
    }


    // PART B. sorting a 1000-word list
    public static ArrayList<String> insertionSortWordList(ArrayList<String> words) {
        int counter = 0;
        for (int i = 1; i < words.size(); i++) {
            String currentStr = words.get(i);
            int currentIndex = i - 1;
    

            while (currentIndex >= 0 && words.get(currentIndex).compareTo(currentStr) > 0) {
                counter++;
                words.set(currentIndex + 1, words.get(currentIndex));
                currentIndex--;
            }
            

            words.set(currentIndex + 1, currentStr);
        }
        System.out.println(counter);
        return words;
    }
    


    public static ArrayList<String> loadWordsInto(ArrayList<String> wordList) {
        try {
            Scanner input = new Scanner(new File("src/main/java/com/example/project/Selection_Sort/words.txt"));
            while (input.hasNext()) {
                String word = input.next();
                wordList.add(word);
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
        return wordList;
    }

   
}