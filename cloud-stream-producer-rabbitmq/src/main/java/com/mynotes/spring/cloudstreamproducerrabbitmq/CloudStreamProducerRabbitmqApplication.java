package com.mynotes.spring.cloudstreamproducerrabbitmq;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.stream.annotation.EnableBinding;

import com.mynotes.spring.cloudstreamproducerrabbitmq.utils.HelloBinding;

@EnableBinding(HelloBinding.class)
@SpringBootApplication
public class CloudStreamProducerRabbitmqApplication {

	public static void main(String[] args) {
		SpringApplication.run(CloudStreamProducerRabbitmqApplication.class, args);
	}

}
