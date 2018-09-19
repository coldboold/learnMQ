package com.fxkj.mq.consumer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.amqp.core.Message;
import org.springframework.amqp.core.MessageListener;

public class FxkjConsumer implements MessageListener {
	private Logger logger = LoggerFactory.getLogger(FxkjConsumer.class);  
	  
    @Override  
    public void onMessage(Message message) {  
        logger.info("fxkj receive message------->:{}", message);  
    }  
}