/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.multicloud;

import com.oracle.bmc.multicloud.requests.*;
import com.oracle.bmc.multicloud.responses.*;

/**
 * Collection of helper methods to produce {@link com.oracle.bmc.waiter.Waiter}s for different
 * resources of OmhubResourceAnchor.
 *
 * <p>The default configuration used is defined by {@link
 * com.oracle.bmc.waiter.Waiters.Waiters#DEFAULT_POLLING_WAITER}.
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20180828")
public class OmhubResourceAnchorWaiters {
    private final java.util.concurrent.ExecutorService executorService;
    private final OmhubResourceAnchor client;

    public OmhubResourceAnchorWaiters(
            java.util.concurrent.ExecutorService executorService, OmhubResourceAnchor client) {
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
    public com.oracle.bmc.waiter.Waiter<GetResourceAnchorRequest, GetResourceAnchorResponse>
            forResourceAnchor(
                    GetResourceAnchorRequest request,
                    com.oracle.bmc.multicloud.model.ResourceAnchor.LifecycleState... targetStates) {
        com.oracle.bmc.util.internal.Validate.notEmpty(
                targetStates, "At least one targetState must be provided");
        com.oracle.bmc.util.internal.Validate.noNullElements(
                targetStates, "Null targetState values are not permitted");

        return forResourceAnchor(
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
    public com.oracle.bmc.waiter.Waiter<GetResourceAnchorRequest, GetResourceAnchorResponse>
            forResourceAnchor(
                    GetResourceAnchorRequest request,
                    com.oracle.bmc.multicloud.model.ResourceAnchor.LifecycleState targetState,
                    com.oracle.bmc.waiter.TerminationStrategy terminationStrategy,
                    com.oracle.bmc.waiter.DelayStrategy delayStrategy) {
        com.oracle.bmc.util.internal.Validate.notNull(
                targetState, "The targetState cannot be null");

        return forResourceAnchor(
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
    public com.oracle.bmc.waiter.Waiter<GetResourceAnchorRequest, GetResourceAnchorResponse>
            forResourceAnchor(
                    GetResourceAnchorRequest request,
                    com.oracle.bmc.waiter.TerminationStrategy terminationStrategy,
                    com.oracle.bmc.waiter.DelayStrategy delayStrategy,
                    com.oracle.bmc.multicloud.model.ResourceAnchor.LifecycleState... targetStates) {
        com.oracle.bmc.util.internal.Validate.notEmpty(
                targetStates, "At least one target state must be provided");
        com.oracle.bmc.util.internal.Validate.noNullElements(
                targetStates, "Null target states are not permitted");

        return forResourceAnchor(
                com.oracle.bmc.waiter.Waiters.newWaiter(terminationStrategy, delayStrategy),
                request,
                targetStates);
    }

    // Helper method to create a new Waiter for ResourceAnchor.
    private com.oracle.bmc.waiter.Waiter<GetResourceAnchorRequest, GetResourceAnchorResponse>
            forResourceAnchor(
                    com.oracle.bmc.waiter.BmcGenericWaiter waiter,
                    final GetResourceAnchorRequest request,
                    final com.oracle.bmc.multicloud.model.ResourceAnchor.LifecycleState...
                            targetStates) {
        final java.util.Set<com.oracle.bmc.multicloud.model.ResourceAnchor.LifecycleState>
                targetStatesSet = new java.util.HashSet<>(java.util.Arrays.asList(targetStates));

        return new com.oracle.bmc.waiter.internal.SimpleWaiterImpl<>(
                executorService,
                waiter.toCallable(
                        () -> request,
                        new java.util.function.Function<
                                GetResourceAnchorRequest, GetResourceAnchorResponse>() {
                            @Override
                            public GetResourceAnchorResponse apply(
                                    GetResourceAnchorRequest request) {
                                return client.getResourceAnchor(request);
                            }
                        },
                        new java.util.function.Predicate<GetResourceAnchorResponse>() {
                            @Override
                            public boolean test(GetResourceAnchorResponse response) {
                                return targetStatesSet.contains(
                                        response.getResourceAnchor().getLifecycleState());
                            }
                        },
                        targetStatesSet.contains(
                                com.oracle.bmc.multicloud.model.ResourceAnchor.LifecycleState
                                        .Deleted)),
                request);
    }
}
