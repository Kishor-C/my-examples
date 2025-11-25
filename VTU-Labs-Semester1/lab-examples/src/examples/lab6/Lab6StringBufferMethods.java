package examples.lab6;

public class Lab6StringBufferMethods {
	public static void main(String[] args) {
		// creating a StringBuffer
		StringBuffer buffer = new StringBuffer("loop");
		System.out.println("String Buffer Content = "+buffer);
		//reversing the content
		buffer.reverse();
		System.out.println("String Buffer after reversing = "+buffer);
		// replacing p with ep
		buffer.replace(0, 1, "thread-p");
		System.out.println("String Buffer Content after replacing = "+buffer);
		// appending or blue
		buffer.append("-1");
		System.out.println("String Buffer Content after append = "+buffer);
		// deleting first 7 characters
		buffer.delete(0, 7);
		System.out.println("String Buffer Content after deleting = "+buffer);
		// inserting some character sequence
		// insert(destinationOffSet, characterSequence, start, end)
		buffer.insert(6, "-worker", 0, 7);
		System.out.println("String Buffer Content = "+buffer);
		
		
	}
}
