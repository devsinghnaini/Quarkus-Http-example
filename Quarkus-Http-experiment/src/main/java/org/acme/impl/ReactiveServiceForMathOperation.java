package org.acme.impl;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.CompletionStage;

import javax.enterprise.context.ApplicationScoped;

import org.acme.model.SamplePojo;

@ApplicationScoped
public class ReactiveServiceForMathOperation {

    
    public CompletionStage<Void> processMessage(SamplePojo samplePojo)
    {

            double res = 0;
            for (int i = 0; i < 1000; i++) {
                res += Math.sin(StrictMath.cos(res)) * 2;
            }
            samplePojo.waveFormData= samplePojo.waveFormData + res;
            return CompletableFuture.completedStage(null);

    }

}
