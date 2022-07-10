package com.posco.kafkasender;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class KafkasenderApplication {

	@Autowired
	private KafkaSampleProducerService kafkaSampleProducerService;

	public static void main(String[] args) {
		SpringApplication.run(KafkasenderApplication.class, args);
	}

	@GetMapping("/health")
	public String health(){
		return "ok";
	}

	@PostMapping("/send")
	public void sendMessage(String message){
		kafkaSampleProducerService.sendMessage(message);
	}

}
