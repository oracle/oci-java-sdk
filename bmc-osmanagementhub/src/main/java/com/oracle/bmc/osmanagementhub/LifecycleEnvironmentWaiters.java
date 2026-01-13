/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.osmanagementhub;

import com.oracle.bmc.osmanagementhub.requests.*;
import com.oracle.bmc.osmanagementhub.responses.*;

/**
 * Collection of helper methods to produce {@link com.oracle.bmc.waiter.Waiter}s for different
 * resources of LifecycleEnvironment.
 *
 * <p>The default configuration used is defined by {@link
 * com.oracle.bmc.waiter.Waiters.Waiters#DEFAULT_POLLING_WAITER}.
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20220901")
public class LifecycleEnvironmentWaiters {
    private final java.util.concurrent.ExecutorService executorService;
    private final LifecycleEnvironment client;

    public LifecycleEnvironmentWaiters(
            java.util.concurrent.ExecutorService executorService, LifecycleEnvironment client) {
        this.executorService = executorService;
        this.client = client;
    }

    /**
     * Creates a new {@link com.oracle.bmc.waiter.Waiter} using the default configuration.
     *
     * @param request the request to send
     * @param targetStates the desired states to wait for. If multiple states are provided then the
     *     waiter will return once the resource reaches any of the provided states
     * @return a new {@code Waiter} instance
     */
    public com.oracle.bmc.waiter.Waiter<
                    GetLifecycleEnvironmentRequest, GetLifecycleEnvironmentResponse>
            forLifecycleEnvironment(
                    GetLifecycleEnvironmentRequest request,
                    com.oracle.bmc.osmanagementhub.model.LifecycleEnvironment.LifecycleState...
                            targetStates) {
        com.oracle.bmc.util.internal.Validate.notEmpty(
                targetStates, "At least one targetState must be provided");
        com.oracle.bmc.util.internal.Validate.noNullElements(
                targetStates, "Null targetState values are not permitted");

        return forLifecycleEnvironment(
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
    public com.oracle.bmc.waiter.Waiter<
                    GetLifecycleEnvironmentRequest, GetLifecycleEnvironmentResponse>
            forLifecycleEnvironment(
                    GetLifecycleEnvironmentRequest request,
                    com.oracle.bmc.osmanagementhub.model.LifecycleEnvironment.LifecycleState
                            targetState,
                    com.oracle.bmc.waiter.TerminationStrategy terminationStrategy,
                    com.oracle.bmc.waiter.DelayStrategy delayStrategy) {
        com.oracle.bmc.util.internal.Validate.notNull(
                targetState, "The targetState cannot be null");

        return forLifecycleEnvironment(
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
     * @param targetStates the desired states to wait for. The waiter will return once the resource
     *     reaches any of the provided states
     * @return a new {@code com.oracle.bmc.waiter.Waiter} instance
     */
    public com.oracle.bmc.waiter.Waiter<
                    GetLifecycleEnvironmentRequest, GetLifecycleEnvironmentResponse>
            forLifecycleEnvironment(
                    GetLifecycleEnvironmentRequest request,
                    com.oracle.bmc.waiter.TerminationStrategy terminationStrategy,
                    com.oracle.bmc.waiter.DelayStrategy delayStrategy,
                    com.oracle.bmc.osmanagementhub.model.LifecycleEnvironment.LifecycleState...
                            targetStates) {
        com.oracle.bmc.util.internal.Validate.notEmpty(
                targetStates, "At least one target state must be provided");
        com.oracle.bmc.util.internal.Validate.noNullElements(
                targetStates, "Null target states are not permitted");

        return forLifecycleEnvironment(
                com.oracle.bmc.waiter.Waiters.newWaiter(terminationStrategy, delayStrategy),
                request,
                targetStates);
    }

    // Helper method to create a new Waiter for LifecycleEnvironment.
    private com.oracle.bmc.waiter.Waiter<
                    GetLifecycleEnvironmentRequest, GetLifecycleEnvironmentResponse>
            forLifecycleEnvironment(
                    com.oracle.bmc.waiter.BmcGenericWaiter waiter,
                    final GetLifecycleEnvironmentRequest request,
                    final com.oracle.bmc.osmanagementhub.model.LifecycleEnvironment.LifecycleState
                                    ...
                            targetStates) {
        final java.util.Set<
                        com.oracle.bmc.osmanagementhub.model.LifecycleEnvironment.LifecycleState>
                targetStatesSet = new java.util.HashSet<>(java.util.Arrays.asList(targetStates));

        return new com.oracle.bmc.waiter.internal.SimpleWaiterImpl<>(
                executorService,
                waiter.toCallable(
                        () -> request,
                        new java.util.function.Function<
                                GetLifecycleEnvironmentRequest, GetLifecycleEnvironmentResponse>() {
                            @Override
                            public GetLifecycleEnvironmentResponse apply(
                                    GetLifecycleEnvironmentRequest request) {
                                return client.getLifecycleEnvironment(request);
                            }
                        },
                        new java.util.function.Predicate<GetLifecycleEnvironmentResponse>() {
                            @Override
                            public boolean test(GetLifecycleEnvironmentResponse response) {
                                return targetStatesSet.contains(
                                        response.getLifecycleEnvironment().getLifecycleState());
                            }
                        },
                        targetStatesSet.contains(
                                com.oracle.bmc.osmanagementhub.model.LifecycleEnvironment
                                        .LifecycleState.Deleted)),
                request);
    }

    /**
     * Creates a new {@link com.oracle.bmc.waiter.Waiter} using the default configuration.
     *
     * @param request the request to send
     * @param targetStates the desired states to wait for. If multiple states are provided then the
     *     waiter will return once the resource reaches any of the provided states
     * @return a new {@code Waiter} instance
     */
    public com.oracle.bmc.waiter.Waiter<GetLifecycleStageRequest, GetLifecycleStageResponse>
            forLifecycleStage(
                    GetLifecycleStageRequest request,
                    com.oracle.bmc.osmanagementhub.model.LifecycleStage.LifecycleState...
                            targetStates) {
        com.oracle.bmc.util.internal.Validate.notEmpty(
                targetStates, "At least one targetState must be provided");
        com.oracle.bmc.util.internal.Validate.noNullElements(
                targetStates, "Null targetState values are not permitted");

        return forLifecycleStage(
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
    public com.oracle.bmc.waiter.Waiter<GetLifecycleStageRequest, GetLifecycleStageResponse>
            forLifecycleStage(
                    GetLifecycleStageRequest request,
                    com.oracle.bmc.osmanagementhub.model.LifecycleStage.LifecycleState targetState,
                    com.oracle.bmc.waiter.TerminationStrategy terminationStrategy,
                    com.oracle.bmc.waiter.DelayStrategy delayStrategy) {
        com.oracle.bmc.util.internal.Validate.notNull(
                targetState, "The targetState cannot be null");

        return forLifecycleStage(
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
     * @param targetStates the desired states to wait for. The waiter will return once the resource
     *     reaches any of the provided states
     * @return a new {@code com.oracle.bmc.waiter.Waiter} instance
     */
    public com.oracle.bmc.waiter.Waiter<GetLifecycleStageRequest, GetLifecycleStageResponse>
            forLifecycleStage(
                    GetLifecycleStageRequest request,
                    com.oracle.bmc.waiter.TerminationStrategy terminationStrategy,
                    com.oracle.bmc.waiter.DelayStrategy delayStrategy,
                    com.oracle.bmc.osmanagementhub.model.LifecycleStage.LifecycleState...
                            targetStates) {
        com.oracle.bmc.util.internal.Validate.notEmpty(
                targetStates, "At least one target state must be provided");
        com.oracle.bmc.util.internal.Validate.noNullElements(
                targetStates, "Null target states are not permitted");

        return forLifecycleStage(
                com.oracle.bmc.waiter.Waiters.newWaiter(terminationStrategy, delayStrategy),
                request,
                targetStates);
    }

    // Helper method to create a new Waiter for LifecycleStage.
    private com.oracle.bmc.waiter.Waiter<GetLifecycleStageRequest, GetLifecycleStageResponse>
            forLifecycleStage(
                    com.oracle.bmc.waiter.BmcGenericWaiter waiter,
                    final GetLifecycleStageRequest request,
                    final com.oracle.bmc.osmanagementhub.model.LifecycleStage.LifecycleState...
                            targetStates) {
        final java.util.Set<com.oracle.bmc.osmanagementhub.model.LifecycleStage.LifecycleState>
                targetStatesSet = new java.util.HashSet<>(java.util.Arrays.asList(targetStates));

        return new com.oracle.bmc.waiter.internal.SimpleWaiterImpl<>(
                executorService,
                waiter.toCallable(
                        () -> request,
                        new java.util.function.Function<
                                GetLifecycleStageRequest, GetLifecycleStageResponse>() {
                            @Override
                            public GetLifecycleStageResponse apply(
                                    GetLifecycleStageRequest request) {
                                return client.getLifecycleStage(request);
                            }
                        },
                        new java.util.function.Predicate<GetLifecycleStageResponse>() {
                            @Override
                            public boolean test(GetLifecycleStageResponse response) {
                                return targetStatesSet.contains(
                                        response.getLifecycleStage().getLifecycleState());
                            }
                        },
                        targetStatesSet.contains(
                                com.oracle.bmc.osmanagementhub.model.LifecycleStage.LifecycleState
                                        .Deleted)),
                request);
    }
}
