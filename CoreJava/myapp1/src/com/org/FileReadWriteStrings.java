package com.org;


import java.nio.file.Files;
import java.nio.file.Path;

public class FileReadWriteStrings {
	public static void main(String[] args) throws Exception {
		String content = Files.readString(Path.of("D:\\MouseMove.java"));
		System.out.println(content);
		
		Files.writeString(Path.of("test.txt"), "HELLO WORLD");
		System.out.println("DONE");
	}
}
