package com.examples.session1;

import java.util.Arrays;

public class TestUtilArrays {
	public static void modifyArray(int[] array) {

        array[0] = 99;

    }

    public static void main(String[] args) {

    	int[] originalNumbers = {5, 10, 15};
    	System.out.println("Main: "+Arrays.toString(originalNumbers));
    	newArray(originalNumbers);
    	System.out.println("Main: "+Arrays.toString(originalNumbers));

    }
    static void newArray(int[] numbers) {

    	  int temp;

    	  for (int i = 0; i < numbers.length / 2; i++) {

    	    temp = numbers[i];

    	    numbers[i] = numbers[numbers.length - 1 - i];

    	    numbers[numbers.length - 1 - i] = temp;

    	  }

    	}
}
