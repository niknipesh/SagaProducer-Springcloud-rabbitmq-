package com.mynotes.spring.cloudstreamconsumerrabbitmq.util;

import org.springframework.messaging.Message;
import org.springframework.messaging.MessageChannel;
import org.springframework.messaging.support.MessageBuilder;

public class ConsumerResponse {
	
	private MessageChannel consumerResponse;
	
	public ConsumerResponse(ConsumerResponseBinding binding) {
		consumerResponse = binding.sendResponse();
	}
	
	public void consumerMessage(String response) {
		String res = response;
		Message<String> msg = MessageBuilder.withPayload(res)
				.build();
		this.consumerResponse.send(msg);
		System.out.println("Message sent from consumer");
	}

}
