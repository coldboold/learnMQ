package com.fxkj.mq.test;

import org.junit.Before;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.fxkj.mq.producer.MessageProducer;

public class TestMQ {

    private Logger logger = LoggerFactory.getLogger(TestMQ.class);  
  
    private ApplicationContext context = null;  
  
    @Before
    public void setUp() throws Exception {  
        context = new ClassPathXmlApplicationContext("application.xml");  
    }  
  
    @Test  
    public void sendMessage() throws Exception {  
        MessageProducer messageProducer = (MessageProducer) context.getBean("messageProducer");  
        int a = 1000;  
        while (a > 0) {  
            messageProducer.sendMessage("Hello, I am amq sender num :" + a--);  
            try {  
                //暂停一下，好让消息消费者去取消息打印出来  
                Thread.sleep(1000);  
            } catch (InterruptedException e) {  
                e.printStackTrace();  
            }  
        }  
    }  
}