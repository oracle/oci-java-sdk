/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.gdp;

import com.oracle.bmc.gdp.requests.*;
import com.oracle.bmc.gdp.responses.*;

/**
 * Collection of helper methods to produce {@link com.oracle.bmc.waiter.Waiter}s for different
 * resources of GuardedDataPipeline.
 * <p>
 * The default configuration used is defined by {@link com.oracle.bmc.waiter.Waiters.Waiters#DEFAULT_POLLING_WAITER}.
 */
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20230301")
public class GuardedDataPipelineWaiters {
    private final java.util.concurrent.ExecutorService executorService;
    private final GuardedDataPipeline client;

    public GuardedDataPipelineWaiters(
            java.util.concurrent.ExecutorService executorService, GuardedDataPipeline client) {
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
    public com.oracle.bmc.waiter.Waiter<GetGdpPipelineRequest, GetGdpPipelineResponse>
            forGdpPipeline(
                    GetGdpPipelineRequest request,
                    com.oracle.bmc.gdp.model.GdpPipeline.LifecycleState... targetStates) {
        com.oracle.bmc.util.internal.Validate.notEmpty(
                targetStates, "At least one targetState must be provided");
        com.oracle.bmc.util.internal.Validate.noNullElements(
                targetStates, "Null targetState values are not permitted");

        return forGdpPipeline(
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
    public com.oracle.bmc.waiter.Waiter<GetGdpPipelineRequest, GetGdpPipelineResponse>
            forGdpPipeline(
                    GetGdpPipelineRequest request,
                    com.oracle.bmc.gdp.model.GdpPipeline.LifecycleState targetState,
                    com.oracle.bmc.waiter.TerminationStrategy terminationStrategy,
                    com.oracle.bmc.waiter.DelayStrategy delayStrategy) {
        com.oracle.bmc.util.internal.Validate.notNull(
                targetState, "The targetState cannot be null");

        return forGdpPipeline(
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
    public com.oracle.bmc.waiter.Waiter<GetGdpPipelineRequest, GetGdpPipelineResponse>
            forGdpPipeline(
                    GetGdpPipelineRequest request,
                    com.oracle.bmc.waiter.TerminationStrategy terminationStrategy,
                    com.oracle.bmc.waiter.DelayStrategy delayStrategy,
                    com.oracle.bmc.gdp.model.GdpPipeline.LifecycleState... targetStates) {
        com.oracle.bmc.util.internal.Validate.notEmpty(
                targetStates, "At least one target state must be provided");
        com.oracle.bmc.util.internal.Validate.noNullElements(
                targetStates, "Null target states are not permitted");

        return forGdpPipeline(
                com.oracle.bmc.waiter.Waiters.newWaiter(terminationStrategy, delayStrategy),
                request,
                targetStates);
    }

    // Helper method to create a new Waiter for GdpPipeline.
    private com.oracle.bmc.waiter.Waiter<GetGdpPipelineRequest, GetGdpPipelineResponse>
            forGdpPipeline(
                    com.oracle.bmc.waiter.BmcGenericWaiter waiter,
                    final GetGdpPipelineRequest request,
                    final com.oracle.bmc.gdp.model.GdpPipeline.LifecycleState... targetStates) {
        final java.util.Set<com.oracle.bmc.gdp.model.GdpPipeline.LifecycleState> targetStatesSet =
                new java.util.HashSet<>(java.util.Arrays.asList(targetStates));

        return new com.oracle.bmc.waiter.internal.SimpleWaiterImpl<>(
                executorService,
                waiter.toCallable(
                        () -> request,
                        new java.util.function.Function<
                                GetGdpPipelineRequest, GetGdpPipelineResponse>() {
                            @Override
                            public GetGdpPipelineResponse apply(GetGdpPipelineRequest request) {
                                return client.getGdpPipeline(request);
                            }
                        },
                        new java.util.function.Predicate<GetGdpPipelineResponse>() {
                            @Override
                            public boolean test(GetGdpPipelineResponse response) {
                                return targetStatesSet.contains(
                                        response.getGdpPipeline().getLifecycleState());
                            }
                        },
                        targetStatesSet.contains(
                                com.oracle.bmc.gdp.model.GdpPipeline.LifecycleState.Deleted)),
                request);
    }

    /**
     * Creates a new {@link com.oracle.bmc.waiter.Waiter} using default configuration.
     *
     * @param request the request to send
     * @return a new {@code Waiter} instance
     */
    public com.oracle.bmc.waiter.Waiter<GetGdpWorkRequestRequest, GetGdpWorkRequestResponse>
            forGdpWorkRequest(GetGdpWorkRequestRequest request) {
        return forGdpWorkRequest(com.oracle.bmc.waiter.Waiters.DEFAULT_POLLING_WAITER, request);
    }

    /**
     * Creates a new {@link com.oracle.bmc.waiter.Waiter} using the provided configuration.
     *
     * @param request the request to send
     * @param terminationStrategy the {@link com.oracle.bmc.waiter.TerminationStrategy} to use
     * @param delayStrategy the {@linkcom.oracle.bmc.waiter. DelayStrategy} to use
     * @return a new {@code com.oracle.bmc.waiter.Waiter} instance
     */
    public com.oracle.bmc.waiter.Waiter<GetGdpWorkRequestRequest, GetGdpWorkRequestResponse>
            forGdpWorkRequest(
                    GetGdpWorkRequestRequest request,
                    com.oracle.bmc.waiter.TerminationStrategy terminationStrategy,
                    com.oracle.bmc.waiter.DelayStrategy delayStrategy) {
        return forGdpWorkRequest(
                com.oracle.bmc.waiter.Waiters.newWaiter(terminationStrategy, delayStrategy),
                request);
    }

    // Helper method to create a new Waiter for GdpWorkRequest.
    private com.oracle.bmc.waiter.Waiter<GetGdpWorkRequestRequest, GetGdpWorkRequestResponse>
            forGdpWorkRequest(
                    com.oracle.bmc.waiter.BmcGenericWaiter waiter,
                    final GetGdpWorkRequestRequest request) {
        return new com.oracle.bmc.waiter.internal.SimpleWaiterImpl<>(
                executorService,
                waiter.toCallable(
                        () -> request,
                        new java.util.function.Function<
                                GetGdpWorkRequestRequest, GetGdpWorkRequestResponse>() {
                            @Override
                            public GetGdpWorkRequestResponse apply(
                                    GetGdpWorkRequestRequest request) {
                                return client.getGdpWorkRequest(request);
                            }
                        },
                        new java.util.function.Predicate<GetGdpWorkRequestResponse>() {
                            @Override
                            public boolean test(GetGdpWorkRequestResponse response) {
                                // work requests are complete once the time finished is available
                                return response.getGdpWorkRequest().getTimeFinished() != null;
                            }
                        },
                        false),
                request);
    }
}
