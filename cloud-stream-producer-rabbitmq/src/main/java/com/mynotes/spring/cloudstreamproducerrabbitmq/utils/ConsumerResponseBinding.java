package com.mynotes.spring.cloudstreamproducerrabbitmq.utils;

import org.springframework.cloud.stream.annotation.Input;
import org.springframework.messaging.SubscribableChannel;

public interface ConsumerResponseBinding {
	
	String CONSUMER_RESPONSE = "ConsumerResponseChannel";
	
	@Input("CONSUMER_RESPONSE")
	SubscribableChannel sendResponse();

}
