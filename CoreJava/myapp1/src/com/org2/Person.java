package com.org2;

import java.util.Objects;

public record Person(String name, int age) {
	public Person {
		Objects.requireNonNull(name);
		Objects.requireNonNull(age);
	}
}
