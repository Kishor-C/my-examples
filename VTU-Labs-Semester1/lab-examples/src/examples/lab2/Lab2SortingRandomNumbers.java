package examples.lab2;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Lab2SortingRandomNumbers {
    // Function to generate random numbers that are multiples of 2 and 5 within the given range
    public static List<Integer> generateMultiples(int start, int end) {
        List<Integer> multiples = new ArrayList<>();
        for (int num = start; num <= end; num++) {
            if (num % 2 == 0 && num % 5 == 0) {
                multiples.add(num);
            }
        }
        return multiples;
    }

    // Comparator function to sort based on the tens place
    public static class TensPlaceComparator implements Comparator<Integer> {
        @Override
        public int compare(Integer x, Integer y) {
            // Extract the tens place
            int tensX = (x / 10) % 10;
            int tensY = (y / 10) % 10;

            return Integer.compare(tensX, tensY);
        }
    }

    public static void main(String[] args) {
        // Input range from user
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the start of the range: ");
        int start = scanner.nextInt();
        System.out.print("Enter the end of the range: ");
        int end = scanner.nextInt();

        // Generate multiples of 2 and 5 in the range
        List<Integer> numbers = generateMultiples(start, end);

        // Sort the numbers based on the tens place using the comparator
        Collections.sort(numbers, new TensPlaceComparator());

        // Print the sorted numbers
        System.out.println("Sorted numbers based on tens place: " + numbers);
        scanner.close();
    }
}