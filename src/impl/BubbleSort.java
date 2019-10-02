package impl;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author nuclei
 */
public class BubbleSort {
     public static String[] sort(String[] words) {
        int length = words.length;
        for (int i = 0; i < length; i++) {
            for (int j = i; j < length; j++) {
                if (words[i].compareTo(words[j]) > 0) {
                    String temp = words[i];
                    words[i] = words[j];
                    words[j] = temp;
                }
            }
        }
        return words;
    }
}
