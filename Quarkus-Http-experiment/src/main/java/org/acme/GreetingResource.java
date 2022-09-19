package org.acme;

import javax.annotation.PostConstruct;
import javax.inject.Inject;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.acme.infc.ReactiveKafkaProducerServiceInterface;
//import org.acme.infc.ReactiveKafkaProducerServiceInterface;
import org.acme.model.SamplePojo;
import org.eclipse.microprofile.config.inject.ConfigProperty;
import org.eclipse.microprofile.faulttolerance.Timeout;

import javax.ws.rs.core.Response;
import io.smallrye.common.annotation.NonBlocking;
import io.smallrye.mutiny.Uni;

@Path("/hello")
public class GreetingResource {

    @ConfigProperty(name = "REDPANDA_SSL_KEYSTORE_PASSWORD")
    private String keyStorePassword;

    @Inject
    ReactiveKafkaProducerServiceInterface reactiveKafkaProducerServiceInterface;

    @PostConstruct
    public void init()
    {
        System.out.println("Print password:"+keyStorePassword);
    }
    
    
    @Timeout(value = 4000)
    @NonBlocking
    @Consumes(MediaType.APPLICATION_JSON)
    public Uni<Response> handlePostRequest(SamplePojo message)
    {
       return Uni.createFrom().completionStage(reactiveKafkaProducerServiceInterface.postMessageToKafka(message))
               .map(element -> Response.accepted().build())
                .onFailure().recoverWithItem(Response.serverError().build());

    }
}