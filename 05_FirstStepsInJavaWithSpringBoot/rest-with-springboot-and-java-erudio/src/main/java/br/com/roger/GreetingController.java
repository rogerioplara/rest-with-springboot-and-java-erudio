package br.com.roger;

import java.util.concurrent.atomic.AtomicLong;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingController {
	private static final String template = "Hello, %s!";
	private final AtomicLong counter = new AtomicLong();
	
	@RequestMapping("/greeting")
	public Greeting greeting(
			// @RequestParam é o parametro passado na url - opcional
			@RequestParam(value = "name", defaultValue = "World") 
			String name) {
		return new Greeting(counter.incrementAndGet(), String.format(template, name));
	}
}
