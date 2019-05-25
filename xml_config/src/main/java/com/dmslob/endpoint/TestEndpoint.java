package com.dmslob.endpoint;

import com.dmslob.message.TestMessage;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.integration.support.MessageBuilder;
import org.springframework.messaging.Message;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

@Component
public class TestEndpoint {

    private static final Logger LOGGER = LoggerFactory.getLogger(TestEndpoint.class.getName());

    private DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");

    public Message<?> get(Message<String> message) {
        String name = message.getPayload();
        LOGGER.info("Request with name = " + name);

        LocalDateTime now = LocalDateTime.now();
        String currentTime = dateTimeFormatter.format(now);

        String textMessage = "Your name is " + name + "!";
        TestMessage messageObject = new TestMessage(textMessage, currentTime);

        return MessageBuilder.withPayload(messageObject)
                .copyHeadersIfAbsent(message.getHeaders())
                .setHeader("http_statusCode", HttpStatus.OK)
                .build();
    }
}
