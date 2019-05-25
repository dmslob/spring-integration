package com.dmslob.receiver;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by Dmytro_Slobodenyuk on 3/29/2018.
 */

@Service
public class ReceiverGatewayImpl implements ReceiverGateway {

    @Autowired
    private ReceiverService gateway;

    public void get(String message) {
        System.out.println(gateway.response(message));
    }
}
