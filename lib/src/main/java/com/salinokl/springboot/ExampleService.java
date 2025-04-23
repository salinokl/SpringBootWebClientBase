package com.salinokl.springboot;

import org.springframework.stereotype.Service;

import org.springframework.web.reactive.function.client.WebClient;
import org.springframework.web.reactive.function.client.WebClient.ResponseSpec;

@Service
public class ExampleService {
	private final WebClient webClient;

	public ExampleService(WebClient.Builder webClientBuilder) {
		this.webClient = webClientBuilder.baseUrl("https://example.org").build();
	}

	public ResponseSpec someRestCall() {
		return this.webClient.get().retrieve();
	}
}
