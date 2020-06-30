package com.mynotes.spring.cloudstreamconsumerrabbitmq.util;

import org.springframework.cloud.stream.annotation.Output;
import org.springframework.messaging.MessageChannel;

public interface ConsumerResponseBinding {
	
	@Output("ConsumerResponseChannel")
	MessageChannel sendResponse();

}
