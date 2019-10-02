/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package impl;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author nuclei
 */
public class StringBinarySearch {

   

    public static int bsearch(String word, String[] words, int a, int b) {
        if (b <= a) {
            return -1;
        }

        if (b - a == 1) {
            return words[a].equals(word) ? a : -1;
        }

        int pivot = (a + b) / 2;
        if (word.compareTo(words[pivot]) < 0) {
            return bsearch(word, words, 0, pivot);
        } else if (word.compareTo(words[pivot]) > 0) {
            return bsearch(word, words, pivot, b);
        }

        return pivot;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] words = new String[10];
        for (int i = 0; i < 10; i++) {
            System.out.print("words[" + i + "]: ");
            words[i] = br.readLine();
        }
        
        words = BubbleSort.sort(words);
        for (int i = 0; i < 10; i++) {
            System.out.println("words[" + i + "] = " + words[i]);
        }

        System.out.print("Enter word to search for: ");
        String word = br.readLine();

        int index = bsearch(word, words, 0, words.length);
        if (index < 0) {
            System.out.println("not found");
        } else {
            System.out.println("found at index " + index);
        }
    }
}
