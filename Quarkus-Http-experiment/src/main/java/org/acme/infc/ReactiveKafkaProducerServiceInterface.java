package org.acme.infc;

import java.util.concurrent.CompletionStage;

import org.acme.model.SamplePojo;

public interface ReactiveKafkaProducerServiceInterface {
    
    public CompletionStage<Void> postMessageToKafka(SamplePojo message);

}
