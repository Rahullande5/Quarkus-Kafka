package org.acme;

import org.eclipse.microprofile.reactive.messaging.*;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;

@ApplicationScoped
public class KafkaProducer {

    @Inject
    @Channel("generated-topic")
    Emitter<String> emitter;


    public void sendMessage(String message) {
        emitter.send(message);
    }
}
