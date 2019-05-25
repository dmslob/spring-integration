package com.dmslob.sender;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.integration.support.MessageBuilder;
import org.springframework.messaging.MessageChannel;
import org.springframework.stereotype.Service;

/**
 * Created by Dmytro_Slobodenyuk on 3/29/2018.
 */

@Service
public class GreeterServiceImpl implements GreeterService {

    @Autowired
    private MessageChannel inputChannel;

    public void send(String message) {
        inputChannel.send(MessageBuilder.withPayload(message).build());
    }
}
