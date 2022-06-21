/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.aispeech;

import com.oracle.bmc.aispeech.requests.*;
import com.oracle.bmc.aispeech.responses.*;
import javax.annotation.Nonnull;

/**
 * Collection of helper methods to produce {@link com.oracle.bmc.waiter.Waiter}s for different
 * resources of AIServiceSpeech.
 * <p>
 * The default configuration used is defined by {@link com.oracle.bmc.waiter.Waiters.Waiters#DEFAULT_POLLING_WAITER}.
 */
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20220101")
public class AIServiceSpeechWaiters {
    private final java.util.concurrent.ExecutorService executorService;
    private final AIServiceSpeech client;

    public AIServiceSpeechWaiters(
            java.util.concurrent.ExecutorService executorService, AIServiceSpeech client) {
        this.executorService = executorService;
        this.client = client;
    }

    /**
     * Creates a new {@link com.oracle.bmc.waiter.Waiter} using the default configuration.
     *
     * @param request the request to send
     * @param targetStates the desired states to wait for. If multiple states are provided then the waiter will return once the resource reaches any of the provided states
     * @return a new {@code Waiter} instance
     */
    public com.oracle.bmc.waiter.Waiter<GetTranscriptionJobRequest, GetTranscriptionJobResponse>
            forTranscriptionJob(
                    GetTranscriptionJobRequest request,
                    com.oracle.bmc.aispeech.model.TranscriptionJob.LifecycleState... targetStates) {
        com.oracle.bmc.util.internal.Validate.notEmpty(
                targetStates, "At least one targetState must be provided");
        com.oracle.bmc.util.internal.Validate.noNullElements(
                targetStates, "Null targetState values are not permitted");

        return forTranscriptionJob(
                com.oracle.bmc.waiter.Waiters.DEFAULT_POLLING_WAITER, request, targetStates);
    }

    /**
     * Creates a new {@link com.oracle.bmc.waiter.Waiter} using the provided configuration.
     *
     * @param request the request to send
     * @param targetState the desired state to wait for
     * @param terminationStrategy the {@link com.oracle.bmc.waiter.TerminationStrategy} to use
     * @param delayStrategy the {@link com.oracle.bmc.waiter.DelayStrategy} to use
     * @return a new {@code com.oracle.bmc.waiter.Waiter} instance
     */
    public com.oracle.bmc.waiter.Waiter<GetTranscriptionJobRequest, GetTranscriptionJobResponse>
            forTranscriptionJob(
                    GetTranscriptionJobRequest request,
                    com.oracle.bmc.aispeech.model.TranscriptionJob.LifecycleState targetState,
                    com.oracle.bmc.waiter.TerminationStrategy terminationStrategy,
                    com.oracle.bmc.waiter.DelayStrategy delayStrategy) {
        com.oracle.bmc.util.internal.Validate.notNull(
                targetState, "The targetState cannot be null");

        return forTranscriptionJob(
                com.oracle.bmc.waiter.Waiters.newWaiter(terminationStrategy, delayStrategy),
                request,
                targetState);
    }

    /**
     * Creates a new {@link com.oracle.bmc.waiter.Waiter} using the provided configuration.
     *
     * @param request the request to send
     * @param terminationStrategy the {@link com.oracle.bmc.waiter.TerminationStrategy} to use
     * @param delayStrategy the {@link com.oracle.bmc.waiter.DelayStrategy} to use
     * @param targetStates the desired states to wait for. The waiter will return once the resource reaches any of the provided states
     * @return a new {@code com.oracle.bmc.waiter.Waiter} instance
     */
    public com.oracle.bmc.waiter.Waiter<GetTranscriptionJobRequest, GetTranscriptionJobResponse>
            forTranscriptionJob(
                    GetTranscriptionJobRequest request,
                    com.oracle.bmc.waiter.TerminationStrategy terminationStrategy,
                    com.oracle.bmc.waiter.DelayStrategy delayStrategy,
                    com.oracle.bmc.aispeech.model.TranscriptionJob.LifecycleState... targetStates) {
        com.oracle.bmc.util.internal.Validate.notEmpty(
                targetStates, "At least one target state must be provided");
        com.oracle.bmc.util.internal.Validate.noNullElements(
                targetStates, "Null target states are not permitted");

        return forTranscriptionJob(
                com.oracle.bmc.waiter.Waiters.newWaiter(terminationStrategy, delayStrategy),
                request,
                targetStates);
    }

    // Helper method to create a new Waiter for TranscriptionJob.
    private com.oracle.bmc.waiter.Waiter<GetTranscriptionJobRequest, GetTranscriptionJobResponse>
            forTranscriptionJob(
                    com.oracle.bmc.waiter.BmcGenericWaiter waiter,
                    final GetTranscriptionJobRequest request,
                    final com.oracle.bmc.aispeech.model.TranscriptionJob.LifecycleState...
                            targetStates) {
        final java.util.Set<com.oracle.bmc.aispeech.model.TranscriptionJob.LifecycleState>
                targetStatesSet = new java.util.HashSet<>(java.util.Arrays.asList(targetStates));

        return new com.oracle.bmc.waiter.internal.SimpleWaiterImpl<>(
                executorService,
                waiter.toCallable(
                        com.google.common.base.Suppliers.ofInstance(request),
                        new com.google.common.base.Function<
                                GetTranscriptionJobRequest, GetTranscriptionJobResponse>() {
                            @Override
                            public GetTranscriptionJobResponse apply(
                                    GetTranscriptionJobRequest request) {
                                return client.getTranscriptionJob(request);
                            }
                        },
                        new com.google.common.base.Predicate<GetTranscriptionJobResponse>() {
                            @Override
                            public boolean apply(GetTranscriptionJobResponse response) {
                                return targetStatesSet.contains(
                                        response.getTranscriptionJob().getLifecycleState());
                            }
                        },
                        false),
                request);
    }

    /**
     * Creates a new {@link com.oracle.bmc.waiter.Waiter} using the default configuration.
     *
     * @param request the request to send
     * @param targetStates the desired states to wait for. If multiple states are provided then the waiter will return once the resource reaches any of the provided states
     * @return a new {@code Waiter} instance
     */
    public com.oracle.bmc.waiter.Waiter<GetTranscriptionTaskRequest, GetTranscriptionTaskResponse>
            forTranscriptionTask(
                    GetTranscriptionTaskRequest request,
                    com.oracle.bmc.aispeech.model.TranscriptionTask.LifecycleState...
                            targetStates) {
        com.oracle.bmc.util.internal.Validate.notEmpty(
                targetStates, "At least one targetState must be provided");
        com.oracle.bmc.util.internal.Validate.noNullElements(
                targetStates, "Null targetState values are not permitted");

        return forTranscriptionTask(
                com.oracle.bmc.waiter.Waiters.DEFAULT_POLLING_WAITER, request, targetStates);
    }

    /**
     * Creates a new {@link com.oracle.bmc.waiter.Waiter} using the provided configuration.
     *
     * @param request the request to send
     * @param targetState the desired state to wait for
     * @param terminationStrategy the {@link com.oracle.bmc.waiter.TerminationStrategy} to use
     * @param delayStrategy the {@link com.oracle.bmc.waiter.DelayStrategy} to use
     * @return a new {@code com.oracle.bmc.waiter.Waiter} instance
     */
    public com.oracle.bmc.waiter.Waiter<GetTranscriptionTaskRequest, GetTranscriptionTaskResponse>
            forTranscriptionTask(
                    GetTranscriptionTaskRequest request,
                    com.oracle.bmc.aispeech.model.TranscriptionTask.LifecycleState targetState,
                    com.oracle.bmc.waiter.TerminationStrategy terminationStrategy,
                    com.oracle.bmc.waiter.DelayStrategy delayStrategy) {
        com.oracle.bmc.util.internal.Validate.notNull(
                targetState, "The targetState cannot be null");

        return forTranscriptionTask(
                com.oracle.bmc.waiter.Waiters.newWaiter(terminationStrategy, delayStrategy),
                request,
                targetState);
    }

    /**
     * Creates a new {@link com.oracle.bmc.waiter.Waiter} using the provided configuration.
     *
     * @param request the request to send
     * @param terminationStrategy the {@link com.oracle.bmc.waiter.TerminationStrategy} to use
     * @param delayStrategy the {@link com.oracle.bmc.waiter.DelayStrategy} to use
     * @param targetStates the desired states to wait for. The waiter will return once the resource reaches any of the provided states
     * @return a new {@code com.oracle.bmc.waiter.Waiter} instance
     */
    public com.oracle.bmc.waiter.Waiter<GetTranscriptionTaskRequest, GetTranscriptionTaskResponse>
            forTranscriptionTask(
                    GetTranscriptionTaskRequest request,
                    com.oracle.bmc.waiter.TerminationStrategy terminationStrategy,
                    com.oracle.bmc.waiter.DelayStrategy delayStrategy,
                    com.oracle.bmc.aispeech.model.TranscriptionTask.LifecycleState...
                            targetStates) {
        com.oracle.bmc.util.internal.Validate.notEmpty(
                targetStates, "At least one target state must be provided");
        com.oracle.bmc.util.internal.Validate.noNullElements(
                targetStates, "Null target states are not permitted");

        return forTranscriptionTask(
                com.oracle.bmc.waiter.Waiters.newWaiter(terminationStrategy, delayStrategy),
                request,
                targetStates);
    }

    // Helper method to create a new Waiter for TranscriptionTask.
    private com.oracle.bmc.waiter.Waiter<GetTranscriptionTaskRequest, GetTranscriptionTaskResponse>
            forTranscriptionTask(
                    com.oracle.bmc.waiter.BmcGenericWaiter waiter,
                    final GetTranscriptionTaskRequest request,
                    final com.oracle.bmc.aispeech.model.TranscriptionTask.LifecycleState...
                            targetStates) {
        final java.util.Set<com.oracle.bmc.aispeech.model.TranscriptionTask.LifecycleState>
                targetStatesSet = new java.util.HashSet<>(java.util.Arrays.asList(targetStates));

        return new com.oracle.bmc.waiter.internal.SimpleWaiterImpl<>(
                executorService,
                waiter.toCallable(
                        com.google.common.base.Suppliers.ofInstance(request),
                        new com.google.common.base.Function<
                                GetTranscriptionTaskRequest, GetTranscriptionTaskResponse>() {
                            @Override
                            public GetTranscriptionTaskResponse apply(
                                    GetTranscriptionTaskRequest request) {
                                return client.getTranscriptionTask(request);
                            }
                        },
                        new com.google.common.base.Predicate<GetTranscriptionTaskResponse>() {
                            @Override
                            public boolean apply(GetTranscriptionTaskResponse response) {
                                return targetStatesSet.contains(
                                        response.getTranscriptionTask().getLifecycleState());
                            }
                        },
                        false),
                request);
    }
}
