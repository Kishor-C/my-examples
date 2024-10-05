package com.example.webfluxdemo;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import reactor.core.publisher.Flux;

@Service
public class MyService {

	public List<User> getUsers1() {
		List<User> list = new ArrayList<>();
		try {
			for(int i = 1; i <= 5; i++) {
				Thread.sleep(1000);
				list.add(new User(i, "name "+i));
			}
		} catch(InterruptedException e) {
			e.printStackTrace();
		}
		return list;
	}
	public Flux<User> getUsers2() {
		return Flux.range(1, 5)
				.delayElements(Duration.ofSeconds(1))
				.map(x -> new User(x, "name "+x));
	}
}
