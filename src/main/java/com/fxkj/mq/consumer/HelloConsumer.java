package com.fxkj.mq.consumer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.amqp.core.Message;
import org.springframework.amqp.core.MessageListener;

public class HelloConsumer implements MessageListener {
	private Logger logger = LoggerFactory.getLogger(HelloConsumer.class);  
	@Override  
	public void onMessage(Message message) {  
		logger.info("hello receive message------->:{}", message);  
	}  
}