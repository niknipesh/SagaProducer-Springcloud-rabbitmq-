package com.mynotes.spring.cloudstreamconsumerrabbitmq.util;

import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.annotation.StreamListener;

@EnableBinding(HelloBinding.class)
public class HelloListener {
	private int counter = 0;
	ConsumerResponseBinding binding;
	
	@StreamListener(target=HelloBinding.GREETING)
	public void processHelloChannelGreeting(String msg) {
		System.out.println("Message recieved:- "+msg);
		if (counter%2 == 0) {
			System.out.println("Successfull implementation");
			ConsumerResponse obj = new ConsumerResponse(binding);
			obj.consumerMessage("IMPLEMENTATION SUCCESSFULL AT CONSUMER");
		}else {
			System.out.println("Implementation failed");
			ConsumerResponse obj = new ConsumerResponse(binding);
			obj.consumerMessage("IMPLEMENTATION FAILED");
		}
		counter++;
	}

}
