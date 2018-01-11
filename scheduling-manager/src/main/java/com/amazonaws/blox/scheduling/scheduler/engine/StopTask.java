package com.amazonaws.blox.scheduling.scheduler.engine;

import lombok.Builder;
import lombok.Value;
import lombok.extern.slf4j.Slf4j;
import software.amazon.awssdk.services.ecs.ECSAsyncClient;
import software.amazon.awssdk.services.ecs.model.StopTaskRequest;
import software.amazon.awssdk.services.ecs.model.StopTaskResponse;

import java.util.concurrent.CompletableFuture;

@Value
@Builder
@Slf4j
public class StopTask implements SchedulingAction {
    private final String clusterArn;
    private final String taskArn;
    private final String reason;

    @Override
    public CompletableFuture<Boolean> execute(ECSAsyncClient ecs) {
        CompletableFuture<StopTaskResponse> pendingRequest =
            ecs.stopTask(
                    StopTaskRequest.builder()
                    .cluster(clusterArn)
                    .task(taskArn)
                    .reason(reason)
                    .build());

        pendingRequest.thenAccept(r -> log.debug("ECS response: {}", r));

        return pendingRequest.thenApply(stopTaskResponse -> )
    }
}
