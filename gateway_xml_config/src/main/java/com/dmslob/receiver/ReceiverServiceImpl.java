package com.dmslob.receiver;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.MessageChannel;
import org.springframework.stereotype.Service;

/**
 * Created by Dmytro_Slobodenyuk on 3/29/2018.
 */

@Service
public class ReceiverServiceImpl implements ReceiverService {

    @Autowired
    private MessageChannel outputChannel;

    public String response(String message) {
        return "Response: " + message;
    }
}
