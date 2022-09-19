package org.acme.impl;

import java.nio.ByteBuffer;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.CompletionStage;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;

import org.acme.infc.ReactiveKafkaProducerServiceInterface;
import org.acme.model.SamplePojo;
import org.eclipse.microprofile.reactive.messaging.Channel;
import org.eclipse.microprofile.reactive.messaging.Emitter;
import org.eclipse.microprofile.reactive.messaging.Message;
import org.jboss.logging.Logger;

import com.spartans.schema.SpartansKey;
import com.spartans.schema.SpartansValue;
import io.smallrye.reactive.messaging.kafka.api.OutgoingKafkaRecordMetadata;
import io.vertx.mutiny.core.buffer.Buffer;

@ApplicationScoped
public class ReactiveKafkaProducerService implements ReactiveKafkaProducerServiceInterface  {

    @Inject
    @Channel("kafka_topic")
    Emitter<SpartansValue> emitter;

    
    private static final Logger LOG = Logger.getLogger(ReactiveKafkaProducerService.class);

    SpartansKey spartansKey;
    SpartansValue spartansValue;

    @Override
    public CompletionStage<Void> postMessageToKafka(SamplePojo message) {

        //doing random math operation to induce delay
        double res = 0;
        for (int i = 0; i < 1000; i++) {
                res += Math.sin(StrictMath.cos(res)) * 2;
        }
        

        spartansKey = SpartansKey.newBuilder().setPatientMrnIdentifier("pid123")
        .build();

        spartansValue = SpartansValue.newBuilder()
                        .setMedData(ByteBuffer.wrap("sample_waveform_data.".getBytes()))
                        .build();

        
         emitter.send(prepareDataForMessageBroker(spartansKey,spartansValue)
         .withAck(() -> 
         {
            return CompletableFuture.completedStage(null);
         })
         .withNack((t) ->
         {
            return CompletableFuture.failedStage(t);
         }));
          return CompletableFuture.completedStage(null);
         
    }



    protected Message<SpartansValue> prepareDataForMessageBroker(SpartansKey spartansKey ,SpartansValue spartansValue)
    {
        Message<SpartansValue> message = Message.of(spartansValue).addMetadata(
            OutgoingKafkaRecordMetadata.<SpartansKey>builder()
            .withKey(spartansKey)
            .build()
            
        );

        return message;
    
    }

}