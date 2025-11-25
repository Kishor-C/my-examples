package examples.lab5;

import java.util.Scanner;

public class Lab5StringMethods {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input string
        System.out.print("Enter a string: ");
        String str = scanner.nextLine();

        // 1. Character Extraction Methods
        System.out.println("\nCharacter Extraction Methods:");
        
        // charAt(int index) - Extract a single character at the specified index
        System.out.println("Enter the index number from 0 to "+(str.length() - 1)+" to extract a character");
        int index = scanner.nextInt();
        try {
            System.out.println("Character at "+index+" is: "+str.charAt(index));
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("Index out of bounds");
        }
        System.out.println("Enter how many characters you want to extract from: "+str);
        int charSize = scanner.nextInt();
        if(charSize > str.length() || charSize <= 0) {
        	System.out.println("Invalid length, re-run the program");
        	System.exit(0);
        }
        // Extract characters into a char array
        char[] charArray = new char[charSize];
        // getChars(int srcBegin, int srcEnd, char[] dst, int dstBegin) -
        str.getChars(0, charSize, charArray, 0);
        System.out.println("Extracted characters: "+new String(charArray));
        

        // String Comparison Methods - equals & equalsIgnoreCase
        System.out.println("String Comparison Methods:");

        // equals() - Compare two strings for exact match
        System.out.println("Enter another string to compare: ");
        scanner.nextLine(); // to clear the buffer of next line
        String compareStr = scanner.nextLine();
        System.out.println("Strings are equal: " + str.equals(compareStr));

        // equalsIgnoreCase() - Compare strings ignoring case
        System.out.println("Strings are equal ignoring case: " + str.equalsIgnoreCase(compareStr));

        
        // String Search Methods
        System.out.println("String Search Methods:");

        // indexOf() - to find the character at the 1st index i.e, 0
        System.out.print("Enter a character to search for: ");
        char searchChar = scanner.next().charAt(0);
        int index2 = str.indexOf(searchChar);
        if (index2 != -1) {
            System.out.println("First occurrence of '" + searchChar + "' is at index: " + index);
        } else {
            System.out.println("Character not found");
        }

        // String modification methods
        System.out.println("Converting to upper case");
        // uppercase
        System.out.println("Uppercase on "+str+" is "+str.toUpperCase());
        // lowercase
        System.out.println("Lowerwcase on "+str+" is "+str.toLowerCase());
        // concatenate
        System.out.println("Enter a string to concatenate with "+str);
        scanner.nextLine(); // to clear the buffer as there is next line while taking input from the keyboard
        String concatString = scanner.nextLine();
        System.out.println(str+" after concatenating "+concatString+" is "+str.concat(concatString));
        scanner.close();
    }
}
