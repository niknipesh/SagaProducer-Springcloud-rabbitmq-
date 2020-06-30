package com.mynotes.spring.cloudstreamproducerrabbitmq.utils;

import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.annotation.StreamListener;

@EnableBinding(ConsumerResponseBinding.class)
public class ConsumerResponseListener {
	
	@StreamListener(target=ConsumerResponseBinding.CONSUMER_RESPONSE)
	public void processConsumerResponseChannelMessage(String msg) {
		
		System.out.println("Message recieved from Consumer:- "+msg);
		if(msg.toUpperCase().equals("IMPLEMENTATION FAILED")) {
			System.out.println("Implementation failed. Doing Rollback");
		}else {
			System.out.println("Implementation successfull");
		}
		
	}

}
