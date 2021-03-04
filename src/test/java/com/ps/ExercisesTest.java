package com.ps;

import java.util.HashMap;
import java.util.Map;

/**
 * Main class.
 */
public class ExercisesTest {
    /** Used on a variant of methods. */
    private static final String PHRASE = "I am using a lot of letters.";
    private static final int INT_TO_CHAR = 87;
    private static final int[] LIST = {1, 2, 4, 4, 1, 3, 7, 5, 5, 2};

    /**
     * Method to run tests.
     */
    //@Test
    public void runTests() {
        simpleFibonacci(INT_TO_CHAR);
    }

    /**
     * Obtain ascii from int.
     */
    public void intToCharascii() {
        char intToChar = (char) INT_TO_CHAR;
        System.out.println(intToChar);
    }

    /**
     * Number of vocals on a phrase.
     */
    public void countVocals() {
        Map<String, Integer> hashMap = new HashMap<>();
        hashMap.put("a", 0);
        hashMap.put("e", 0);
        hashMap.put("i", 0);
        hashMap.put("o", 0);
        hashMap.put("u", 0);
        /*
        for (String key : hashMap.keySet()) {
            int count = (int) PHRASE.toLowerCase().valueOf().filter(c -> c == key).count();
            System.out.println("key: " + key + ", value: " + count);
            hashMap.replace(key, count);
        }
        */
    }

    /**
     * Simple replace.
     */
    public void deleteSpacesFromPhrase() {
        String phraseFormat = PHRASE.replace(" ", "");
        System.out.println(phraseFormat);
    }

    /**
     * Lower or Upper.
     */
    public void stringCase() {
        boolean toUpper = false;
        String format = toUpper ? PHRASE.toUpperCase() : PHRASE.toLowerCase();
        System.out.println(format);
    }

    /**
     * Simple fibonacci.
     */
    public void simpleFibonacci(int maxNumber) {
        int number1 = 0;
        int sum = 0;
        int temp = 1;

        for (int i = 0; i < maxNumber; i++) {
            sum = number1 + temp;
            number1 = temp;
            temp = sum;

            System.out.println(sum);
        }
    }

    /**
     * Search the first coincidence of a digit.
     */
    public void findFirstCoincidence() {
        int result = 0;

        for (int i = 0; i < LIST.length; i++) {
            int element = LIST[i];

            for (int j = i; j < LIST.length - 1; j++) {
                if (element == LIST[j + 1]) {
                    result = element;
                    break;
                }
            }

            if (result > 0) {
                break;
            }
        }

        System.out.println(result);
    }
}
