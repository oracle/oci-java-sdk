/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.osmanagementhub;

import com.oracle.bmc.osmanagementhub.requests.*;
import com.oracle.bmc.osmanagementhub.responses.*;

/**
 * Collection of helper methods to produce {@link com.oracle.bmc.waiter.Waiter}s for different
 * resources of ManagedInstanceGroup.
 * <p>
 * The default configuration used is defined by {@link com.oracle.bmc.waiter.Waiters.Waiters#DEFAULT_POLLING_WAITER}.
 */
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20220901")
public class ManagedInstanceGroupWaiters {
    private final java.util.concurrent.ExecutorService executorService;
    private final ManagedInstanceGroup client;

    public ManagedInstanceGroupWaiters(
            java.util.concurrent.ExecutorService executorService, ManagedInstanceGroup client) {
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
                    GetManagedInstanceGroupRequest, GetManagedInstanceGroupResponse>
            forManagedInstanceGroup(
                    GetManagedInstanceGroupRequest request,
                    com.oracle.bmc.osmanagementhub.model.ManagedInstanceGroup.LifecycleState...
                            targetStates) {
        com.oracle.bmc.util.internal.Validate.notEmpty(
                targetStates, "At least one targetState must be provided");
        com.oracle.bmc.util.internal.Validate.noNullElements(
                targetStates, "Null targetState values are not permitted");

        return forManagedInstanceGroup(
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
                    GetManagedInstanceGroupRequest, GetManagedInstanceGroupResponse>
            forManagedInstanceGroup(
                    GetManagedInstanceGroupRequest request,
                    com.oracle.bmc.osmanagementhub.model.ManagedInstanceGroup.LifecycleState
                            targetState,
                    com.oracle.bmc.waiter.TerminationStrategy terminationStrategy,
                    com.oracle.bmc.waiter.DelayStrategy delayStrategy) {
        com.oracle.bmc.util.internal.Validate.notNull(
                targetState, "The targetState cannot be null");

        return forManagedInstanceGroup(
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
                    GetManagedInstanceGroupRequest, GetManagedInstanceGroupResponse>
            forManagedInstanceGroup(
                    GetManagedInstanceGroupRequest request,
                    com.oracle.bmc.waiter.TerminationStrategy terminationStrategy,
                    com.oracle.bmc.waiter.DelayStrategy delayStrategy,
                    com.oracle.bmc.osmanagementhub.model.ManagedInstanceGroup.LifecycleState...
                            targetStates) {
        com.oracle.bmc.util.internal.Validate.notEmpty(
                targetStates, "At least one target state must be provided");
        com.oracle.bmc.util.internal.Validate.noNullElements(
                targetStates, "Null target states are not permitted");

        return forManagedInstanceGroup(
                com.oracle.bmc.waiter.Waiters.newWaiter(terminationStrategy, delayStrategy),
                request,
                targetStates);
    }

    // Helper method to create a new Waiter for ManagedInstanceGroup.
    private com.oracle.bmc.waiter.Waiter<
                    GetManagedInstanceGroupRequest, GetManagedInstanceGroupResponse>
            forManagedInstanceGroup(
                    com.oracle.bmc.waiter.BmcGenericWaiter waiter,
                    final GetManagedInstanceGroupRequest request,
                    final com.oracle.bmc.osmanagementhub.model.ManagedInstanceGroup
                                    .LifecycleState...
                            targetStates) {
        final java.util.Set<
                        com.oracle.bmc.osmanagementhub.model.ManagedInstanceGroup.LifecycleState>
                targetStatesSet = new java.util.HashSet<>(java.util.Arrays.asList(targetStates));

        return new com.oracle.bmc.waiter.internal.SimpleWaiterImpl<>(
                executorService,
                waiter.toCallable(
                        () -> request,
                        new java.util.function.Function<
                                GetManagedInstanceGroupRequest, GetManagedInstanceGroupResponse>() {
                            @Override
                            public GetManagedInstanceGroupResponse apply(
                                    GetManagedInstanceGroupRequest request) {
                                return client.getManagedInstanceGroup(request);
                            }
                        },
                        new java.util.function.Predicate<GetManagedInstanceGroupResponse>() {
                            @Override
                            public boolean test(GetManagedInstanceGroupResponse response) {
                                return targetStatesSet.contains(
                                        response.getManagedInstanceGroup().getLifecycleState());
                            }
                        },
                        targetStatesSet.contains(
                                com.oracle.bmc.osmanagementhub.model.ManagedInstanceGroup
                                        .LifecycleState.Deleted)),
                request);
    }
}
