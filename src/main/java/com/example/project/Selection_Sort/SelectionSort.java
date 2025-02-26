package com.example.project.Selection_Sort;
import java.util.ArrayList;
import java.util.Scanner;
import java.io.IOException;
import java.io.File;

public class SelectionSort {

    // PART A. implementing selection sort
    public static int[] selectionSort(int[] elements) {

        int currentNum = 0;
        boolean foundCorrectPlace = false;
        int currentSearchIndex = 0;
        int tempInt = 0;

        for (int i = 0; i < elements.length; i++) { //for loop to search through all elements

            currentNum = elements[i];
            foundCorrectPlace = false;
            currentSearchIndex = i - 1;

            while(!foundCorrectPlace && currentSearchIndex > -1) { //while loop to keep searching until the element is in the correct place

                if (currentNum < elements[currentSearchIndex]) { //swap 
                    tempInt = elements[currentSearchIndex];
                    elements[currentSearchIndex] = currentNum;
                    elements[currentSearchIndex + 1] = tempInt;
                    
                } else {
                    foundCorrectPlace = true;
                }
                currentSearchIndex--;
            }
        }
       
        return elements;
    }


    // PART B. sorting a 1000-word list
    public static ArrayList<String> selectionSortWordList(ArrayList<String> words) {
      
        return words;
    }

    //call this method to load 1000 words into list. Use it to test Part B
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
