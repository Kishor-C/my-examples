package examples.lab4;

import java.io.UnsupportedEncodingException;

public class Lab4StringConstructors {
	public static void main(String[] args) {
		char[] charArray = {'J', 'a', 'v', 'a','W', 'e', 'l', 'c', 'o', 'm', 'e'};
		// String(char[]) converts character array to string
		String characterString = new String(charArray);
		System.out.println("Character String: "+characterString);
		byte[] bytes = new byte[]{'2', '1', '5', '6', '4', '3', '7', '9'};
		// String(int[])
		String bytesString = new String(bytes);
		System.out.println("Byte String: "+bytesString);
		/*
		// ASCII 128 + 128 -> 256 -> A-Z, * A-65, a - 96 -> 2 ^ 16 => 65536
		System.out.println("Integer size in bits:"+Integer.SIZE);
		System.out.println("Byte size in bits:"+Byte.SIZE);
		System.out.println("Character size in bits:"+Character.SIZE);
		char[] c = {'C', 'S', 'E'};
		System.out.println("Length: "+c.length);
		System.out.println((Character.SIZE * c.length) / 8);
		*/
		// String(char[], int offset, int count)
		String subarray = new String(charArray, 4, 7);
		System.out.println(subarray);
	
		// String(byte[], int offset, int count);
		String subarrayBytes = null;
		try {
			subarrayBytes = new String(bytes, 2, 3, "ISO-8859-1");
		} catch (UnsupportedEncodingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Sub array bytes: "+subarrayBytes);
		// String(byte[], int offset, int length, charset);
		try {
			bytes = new byte[]{'a', 'e', 'i', 'o', 'u'};
			String subarrayBytes2 = new String(bytes, 2, 3, "UTF-8");
			System.out.println("Sub array bytes2 "+subarrayBytes2);
		} catch (UnsupportedEncodingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		// empty string object - String()
		String emptyString = new String();
		System.out.println(emptyString); // prints empty character
		// String(string)
		String original = new String("Welcome");
		System.out.println(original);
		
	}
}
