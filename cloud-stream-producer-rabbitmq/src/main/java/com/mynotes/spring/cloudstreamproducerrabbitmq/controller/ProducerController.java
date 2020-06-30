package com.mynotes.spring.cloudstreamproducerrabbitmq.controller;

import org.springframework.messaging.Message;
import org.springframework.messaging.MessageChannel;
import org.springframework.messaging.support.MessageBuilder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.mynotes.spring.cloudstreamproducerrabbitmq.utils.HelloBinding;
import com.rabbitmq.client.AMQP;
import com.rabbitmq.client.AMQP.Basic;

@RestController
public class ProducerController {
	
	private MessageChannel greet;
	
	public ProducerController(HelloBinding binding) {
		greet = binding.greeting();
	}
	
	@GetMapping("/greet/{name}")
	public @ResponseBody String publish(@PathVariable String name) {
		String greeting = "Hello, "+name+"!";
		Message<String> msg = MessageBuilder.withPayload(greeting)
											.build();
		this.greet.send(msg);
		System.out.println("Message sent to the queue");
		return "Success";
		//AMQP.Basic.Ack;
		
		
	}

}
