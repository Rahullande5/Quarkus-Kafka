package org.acme;

import jakarta.enterprise.context.ApplicationScoped;
import org.eclipse.microprofile.reactive.messaging.Incoming;

@ApplicationScoped
public class KafkaConsumer {

    @Incoming("my-topic")
    public void consume(String message) {
        System.out.println("Received: " + message);
    }
}
