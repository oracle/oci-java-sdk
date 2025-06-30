/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.apmtraces;

import com.oracle.bmc.apmtraces.requests.*;
import com.oracle.bmc.apmtraces.responses.*;

/**
 * Collection of helper methods to produce {@link com.oracle.bmc.waiter.Waiter}s for different
 * resources of ScheduledQuery.
 *
 * <p>The default configuration used is defined by {@link
 * com.oracle.bmc.waiter.Waiters.Waiters#DEFAULT_POLLING_WAITER}.
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200630")
public class ScheduledQueryWaiters {
    private final java.util.concurrent.ExecutorService executorService;
    private final ScheduledQuery client;

    public ScheduledQueryWaiters(
            java.util.concurrent.ExecutorService executorService, ScheduledQuery client) {
        this.executorService = executorService;
        this.client = client;
    }

    /**
     * Creates a new {@link com.oracle.bmc.waiter.Waiter} using the default configuration.
     *
     * @param request the request to send
     * @param targetState the desired states to wait for. If multiple states are provided then the
     *     waiter will return once the resource reaches any of the provided states
     * @return a new {@code com.oracle.bmc.waiter.Waiter} instance
     */
    public com.oracle.bmc.waiter.Waiter<GetScheduledQueryRequest, GetScheduledQueryResponse>
            forScheduledQuery(
                    GetScheduledQueryRequest request,
                    com.oracle.bmc.apmtraces.model.LifecycleStates... targetStates) {
        com.oracle.bmc.util.internal.Validate.notEmpty(
                targetStates, "At least one targetState must be provided");
        com.oracle.bmc.util.internal.Validate.noNullElements(
                targetStates, "Null targetState values are not permitted");

        return forScheduledQuery(
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
    public com.oracle.bmc.waiter.Waiter<GetScheduledQueryRequest, GetScheduledQueryResponse>
            forScheduledQuery(
                    GetScheduledQueryRequest request,
                    com.oracle.bmc.apmtraces.model.LifecycleStates targetState,
                    com.oracle.bmc.waiter.TerminationStrategy terminationStrategy,
                    com.oracle.bmc.waiter.DelayStrategy delayStrategy) {
        com.oracle.bmc.util.internal.Validate.notNull(
                targetState, "The targetState cannot be null");

        return forScheduledQuery(
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
     * @return a new {@code Waiter} instance
     */
    public com.oracle.bmc.waiter.Waiter<GetScheduledQueryRequest, GetScheduledQueryResponse>
            forScheduledQuery(
                    GetScheduledQueryRequest request,
                    com.oracle.bmc.waiter.TerminationStrategy terminationStrategy,
                    com.oracle.bmc.waiter.DelayStrategy delayStrategy,
                    com.oracle.bmc.apmtraces.model.LifecycleStates... targetStates) {
        com.oracle.bmc.util.internal.Validate.notEmpty(
                targetStates, "At least one targetState must be provided");
        com.oracle.bmc.util.internal.Validate.noNullElements(
                targetStates, "Null targetState values are not permitted");

        return forScheduledQuery(
                com.oracle.bmc.waiter.Waiters.newWaiter(terminationStrategy, delayStrategy),
                request,
                targetStates);
    }

    // Helper method to create a new Waiter for ScheduledQuery.
    private com.oracle.bmc.waiter.Waiter<GetScheduledQueryRequest, GetScheduledQueryResponse>
            forScheduledQuery(
                    com.oracle.bmc.waiter.BmcGenericWaiter waiter,
                    final GetScheduledQueryRequest request,
                    final com.oracle.bmc.apmtraces.model.LifecycleStates... targetStates) {
        final java.util.Set<com.oracle.bmc.apmtraces.model.LifecycleStates> targetStatesSet =
                new java.util.HashSet<>(java.util.Arrays.asList(targetStates));

        return new com.oracle.bmc.waiter.internal.SimpleWaiterImpl<>(
                executorService,
                waiter.toCallable(
                        () -> request,
                        new java.util.function.Function<
                                GetScheduledQueryRequest, GetScheduledQueryResponse>() {
                            @Override
                            public GetScheduledQueryResponse apply(
                                    GetScheduledQueryRequest request) {
                                return client.getScheduledQuery(request);
                            }
                        },
                        new java.util.function.Predicate<GetScheduledQueryResponse>() {
                            @Override
                            public boolean test(GetScheduledQueryResponse response) {
                                return targetStatesSet.contains(
                                        response.getScheduledQuery().getLifecycleState());
                            }
                        },
                        targetStatesSet.contains(
                                com.oracle.bmc.apmtraces.model.LifecycleStates.Deleted)),
                request);
    }
}
