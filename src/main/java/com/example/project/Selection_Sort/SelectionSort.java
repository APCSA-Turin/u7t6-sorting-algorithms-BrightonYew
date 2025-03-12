package com.example.project.Selection_Sort;
import java.util.ArrayList;
import java.util.Scanner;
import java.io.IOException;
import java.io.File;

public class SelectionSort {

    // PART A. implementing selection sort
    public static int[] selectionSort(int[] elements) {

        int minInt = 0;
        int minIntIndex = 0;
        int tempInt = 0;
        int currentInt = 0;

        for (int i = 0; i < elements.length; i++) { //searches through elements

            currentInt = elements[i];
            minInt = elements[i];
            minIntIndex = i;

            for (int j = i + 1; j < elements.length; j++) { //searches the list ahead

                if (elements[j] < minInt) { //looks if the element is less than the lowest so far

                    minInt = elements[j];
                    minIntIndex = j;

                }
            }

            tempInt = currentInt; //swap
            elements[i] = elements[minIntIndex];
            elements[minIntIndex] = tempInt;
        }
        return elements;
    }


    // PART B. sorting a 1000-word list
    public static ArrayList<String> selectionSortWordList(ArrayList<String> words) {

        String minStr = "";
        int minStrIndex = 0;
        String tempStr = "";
        String currentStr = "";
        int count = 0;

        for (int i = 0; i < words.size(); i++) { //searches through elements

            currentStr = words.get(i);
            minStr = words.get(i);
            minStrIndex = i;

            for (int j = i + 1; j < words.size(); j++) { //searches the list ahead
                count++;
                if (words.get(j).compareTo(minStr) < 0) { //looks if the element is less than the lowest so far

                    minStr = words.get(j);
                    minStrIndex = j;

                }
            }

            tempStr = currentStr; //swap
            words.set(i, words.get(minStrIndex));
            words.set(minStrIndex, tempStr);
        }
        System.out.println(count);
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
