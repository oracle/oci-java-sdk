/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.limitsincrease;

import com.oracle.bmc.limitsincrease.requests.*;
import com.oracle.bmc.limitsincrease.responses.*;

/**
 * Collection of helper methods to produce {@link com.oracle.bmc.waiter.Waiter}s for different
 * resources of LimitsIncrease.
 * <p>
 * The default configuration used is defined by {@link com.oracle.bmc.waiter.Waiters.Waiters#DEFAULT_POLLING_WAITER}.
 */
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20251101")
public class LimitsIncreaseWaiters {
    private final java.util.concurrent.ExecutorService executorService;
    private final LimitsIncrease client;

    public LimitsIncreaseWaiters(
            java.util.concurrent.ExecutorService executorService, LimitsIncrease client) {
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
    public com.oracle.bmc.waiter.Waiter<
                    GetLimitsIncreaseItemRequestRequest, GetLimitsIncreaseItemRequestResponse>
            forLimitsIncreaseItemRequest(
                    GetLimitsIncreaseItemRequestRequest request,
                    com.oracle.bmc.limitsincrease.model.LimitsIncreaseItemRequest.LifecycleState...
                            targetStates) {
        com.oracle.bmc.util.internal.Validate.notEmpty(
                targetStates, "At least one targetState must be provided");
        com.oracle.bmc.util.internal.Validate.noNullElements(
                targetStates, "Null targetState values are not permitted");

        return forLimitsIncreaseItemRequest(
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
                    GetLimitsIncreaseItemRequestRequest, GetLimitsIncreaseItemRequestResponse>
            forLimitsIncreaseItemRequest(
                    GetLimitsIncreaseItemRequestRequest request,
                    com.oracle.bmc.limitsincrease.model.LimitsIncreaseItemRequest.LifecycleState
                            targetState,
                    com.oracle.bmc.waiter.TerminationStrategy terminationStrategy,
                    com.oracle.bmc.waiter.DelayStrategy delayStrategy) {
        com.oracle.bmc.util.internal.Validate.notNull(
                targetState, "The targetState cannot be null");

        return forLimitsIncreaseItemRequest(
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
    public com.oracle.bmc.waiter.Waiter<
                    GetLimitsIncreaseItemRequestRequest, GetLimitsIncreaseItemRequestResponse>
            forLimitsIncreaseItemRequest(
                    GetLimitsIncreaseItemRequestRequest request,
                    com.oracle.bmc.waiter.TerminationStrategy terminationStrategy,
                    com.oracle.bmc.waiter.DelayStrategy delayStrategy,
                    com.oracle.bmc.limitsincrease.model.LimitsIncreaseItemRequest.LifecycleState...
                            targetStates) {
        com.oracle.bmc.util.internal.Validate.notEmpty(
                targetStates, "At least one target state must be provided");
        com.oracle.bmc.util.internal.Validate.noNullElements(
                targetStates, "Null target states are not permitted");

        return forLimitsIncreaseItemRequest(
                com.oracle.bmc.waiter.Waiters.newWaiter(terminationStrategy, delayStrategy),
                request,
                targetStates);
    }

    // Helper method to create a new Waiter for LimitsIncreaseItemRequest.
    private com.oracle.bmc.waiter.Waiter<
                    GetLimitsIncreaseItemRequestRequest, GetLimitsIncreaseItemRequestResponse>
            forLimitsIncreaseItemRequest(
                    com.oracle.bmc.waiter.BmcGenericWaiter waiter,
                    final GetLimitsIncreaseItemRequestRequest request,
                    final com.oracle.bmc.limitsincrease.model.LimitsIncreaseItemRequest
                                    .LifecycleState...
                            targetStates) {
        final java.util.Set<
                        com.oracle.bmc.limitsincrease.model.LimitsIncreaseItemRequest
                                .LifecycleState>
                targetStatesSet = new java.util.HashSet<>(java.util.Arrays.asList(targetStates));

        return new com.oracle.bmc.waiter.internal.SimpleWaiterImpl<>(
                executorService,
                waiter.toCallable(
                        () -> request,
                        new java.util.function.Function<
                                GetLimitsIncreaseItemRequestRequest,
                                GetLimitsIncreaseItemRequestResponse>() {
                            @Override
                            public GetLimitsIncreaseItemRequestResponse apply(
                                    GetLimitsIncreaseItemRequestRequest request) {
                                return client.getLimitsIncreaseItemRequest(request);
                            }
                        },
                        new java.util.function.Predicate<GetLimitsIncreaseItemRequestResponse>() {
                            @Override
                            public boolean test(GetLimitsIncreaseItemRequestResponse response) {
                                return targetStatesSet.contains(
                                        response.getLimitsIncreaseItemRequest()
                                                .getLifecycleState());
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
    public com.oracle.bmc.waiter.Waiter<
                    GetLimitsIncreaseRequestRequest, GetLimitsIncreaseRequestResponse>
            forLimitsIncreaseRequest(
                    GetLimitsIncreaseRequestRequest request,
                    com.oracle.bmc.limitsincrease.model.LimitsIncreaseRequest.LifecycleState...
                            targetStates) {
        com.oracle.bmc.util.internal.Validate.notEmpty(
                targetStates, "At least one targetState must be provided");
        com.oracle.bmc.util.internal.Validate.noNullElements(
                targetStates, "Null targetState values are not permitted");

        return forLimitsIncreaseRequest(
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
                    GetLimitsIncreaseRequestRequest, GetLimitsIncreaseRequestResponse>
            forLimitsIncreaseRequest(
                    GetLimitsIncreaseRequestRequest request,
                    com.oracle.bmc.limitsincrease.model.LimitsIncreaseRequest.LifecycleState
                            targetState,
                    com.oracle.bmc.waiter.TerminationStrategy terminationStrategy,
                    com.oracle.bmc.waiter.DelayStrategy delayStrategy) {
        com.oracle.bmc.util.internal.Validate.notNull(
                targetState, "The targetState cannot be null");

        return forLimitsIncreaseRequest(
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
    public com.oracle.bmc.waiter.Waiter<
                    GetLimitsIncreaseRequestRequest, GetLimitsIncreaseRequestResponse>
            forLimitsIncreaseRequest(
                    GetLimitsIncreaseRequestRequest request,
                    com.oracle.bmc.waiter.TerminationStrategy terminationStrategy,
                    com.oracle.bmc.waiter.DelayStrategy delayStrategy,
                    com.oracle.bmc.limitsincrease.model.LimitsIncreaseRequest.LifecycleState...
                            targetStates) {
        com.oracle.bmc.util.internal.Validate.notEmpty(
                targetStates, "At least one target state must be provided");
        com.oracle.bmc.util.internal.Validate.noNullElements(
                targetStates, "Null target states are not permitted");

        return forLimitsIncreaseRequest(
                com.oracle.bmc.waiter.Waiters.newWaiter(terminationStrategy, delayStrategy),
                request,
                targetStates);
    }

    // Helper method to create a new Waiter for LimitsIncreaseRequest.
    private com.oracle.bmc.waiter.Waiter<
                    GetLimitsIncreaseRequestRequest, GetLimitsIncreaseRequestResponse>
            forLimitsIncreaseRequest(
                    com.oracle.bmc.waiter.BmcGenericWaiter waiter,
                    final GetLimitsIncreaseRequestRequest request,
                    final com.oracle.bmc.limitsincrease.model.LimitsIncreaseRequest
                                    .LifecycleState...
                            targetStates) {
        final java.util.Set<
                        com.oracle.bmc.limitsincrease.model.LimitsIncreaseRequest.LifecycleState>
                targetStatesSet = new java.util.HashSet<>(java.util.Arrays.asList(targetStates));

        return new com.oracle.bmc.waiter.internal.SimpleWaiterImpl<>(
                executorService,
                waiter.toCallable(
                        () -> request,
                        new java.util.function.Function<
                                GetLimitsIncreaseRequestRequest,
                                GetLimitsIncreaseRequestResponse>() {
                            @Override
                            public GetLimitsIncreaseRequestResponse apply(
                                    GetLimitsIncreaseRequestRequest request) {
                                return client.getLimitsIncreaseRequest(request);
                            }
                        },
                        new java.util.function.Predicate<GetLimitsIncreaseRequestResponse>() {
                            @Override
                            public boolean test(GetLimitsIncreaseRequestResponse response) {
                                return targetStatesSet.contains(
                                        response.getLimitsIncreaseRequest().getLifecycleState());
                            }
                        },
                        false),
                request);
    }
}
