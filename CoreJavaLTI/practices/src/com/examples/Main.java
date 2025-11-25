package com.examples;


import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;
import java.util.TreeSet;
 class CustomException extends RuntimeException {
    public CustomException(String message) {
        super(message);
    }

    
}
	
	  
	public class Main {
		public static void main(String[] args) {
	        try {
	            throw new CustomException("Custom exception occurred");
	        } catch (CustomException e) {
	            System.out.println(e.getMessage());
	        } catch (Exception e) {
	            System.out.println("Exception occurred");
	        }
	    }
	}