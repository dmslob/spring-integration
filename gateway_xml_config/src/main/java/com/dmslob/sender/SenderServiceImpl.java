package com.dmslob.sender;

import org.springframework.stereotype.Service;

/**
 * Created by Dmytro_Slobodenyuk on 3/29/2018.
 */

@Service
public class SenderServiceImpl implements SenderService {
    public void sayHello(String message) {
        System.out.println("Message: " + message);
    }
}
