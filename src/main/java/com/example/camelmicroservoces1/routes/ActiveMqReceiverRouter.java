package com.example.camelmicroservoces1.routes;

import org.apache.camel.builder.RouteBuilder;
import org.springframework.stereotype.Component;

@Component
public class ActiveMqReceiverRouter extends RouteBuilder {
    @Override
    public void configure() throws Exception {

        from("activemq:my-activemq-queue")
                .log("${body}")
                .to("log:received-message-from-active-mq");

    }
}
