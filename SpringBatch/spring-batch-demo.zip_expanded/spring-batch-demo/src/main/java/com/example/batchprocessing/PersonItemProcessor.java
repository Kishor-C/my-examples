package com.example.batchprocessing;


import org.springframework.batch.item.ItemProcessor;

public class PersonItemProcessor implements ItemProcessor<Person, Person>{


	@Override
	public Person process(Person item) throws Exception {
		
		// taking the person firstname & lastname and converting it into uppercase
		final String firstname = item.getFirstname().toUpperCase();
		final String lastname = item.getLastname().toUpperCase();
		
		// transforming the input Person object
		final Person tranformedPerson = new Person(firstname, lastname);
		// logging the ingested and transformed input
		System.out.println("Converting ("+item+") into ("+tranformedPerson+")");
		return tranformedPerson;
	}

}
