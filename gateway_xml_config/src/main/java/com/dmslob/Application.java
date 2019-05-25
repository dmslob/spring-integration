package com.dmslob;

import com.dmslob.receiver.ReceiverGateway;
import com.dmslob.sender.GreeterService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by Dmytro_Slobodenyuk on 3/29/2018.
 */
public class Application {

    public static void main(String[] args) {

        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring-integration-servlet.xml");
        GreeterService greeterService = applicationContext.getBean("greeterServiceImpl", GreeterService.class);
        ReceiverGateway receiverGateway = applicationContext.getBean("receiverGatewayImpl", ReceiverGateway.class);

        greeterService.send("Test messsage!");
        receiverGateway.get("Test response");
    }
}
