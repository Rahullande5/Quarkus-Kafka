package org.acme;

import jakarta.inject.Inject;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@Path("/hello")
public class ExampleResource {

    @Inject
    private KafkaProducer kafkaProducerResource;
    @POST
    @Produces(MediaType.TEXT_PLAIN)
    public void producer(String message) {
        kafkaProducerResource.sendMessage(message);
    }
}
