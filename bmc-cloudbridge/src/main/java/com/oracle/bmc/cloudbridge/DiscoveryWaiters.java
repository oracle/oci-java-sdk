/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.cloudbridge;

import com.oracle.bmc.cloudbridge.requests.*;
import com.oracle.bmc.cloudbridge.responses.*;

/**
 * Collection of helper methods to produce {@link com.oracle.bmc.waiter.Waiter}s for different
 * resources of Discovery.
 * <p>
 * The default configuration used is defined by {@link com.oracle.bmc.waiter.Waiters.Waiters#DEFAULT_POLLING_WAITER}.
 */
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20220509")
public class DiscoveryWaiters {
    private final java.util.concurrent.ExecutorService executorService;
    private final Discovery client;

    public DiscoveryWaiters(
            java.util.concurrent.ExecutorService executorService, Discovery client) {
        this.executorService = executorService;
        this.client = client;
    }

    /**
     * Creates a new {@link com.oracle.bmc.waiter.Waiter} using the default configuration.
     *
     * @param request the request to send
     * @param targetState the desired states to wait for. If multiple states are provided then the waiter will return once the resource reaches any of the provided states
     * @return a new {@code com.oracle.bmc.waiter.Waiter} instance
     */
    public com.oracle.bmc.waiter.Waiter<GetAssetSourceRequest, GetAssetSourceResponse>
            forAssetSource(
                    GetAssetSourceRequest request,
                    com.oracle.bmc.cloudbridge.model.AssetSourceLifecycleState... targetStates) {
        com.oracle.bmc.util.internal.Validate.notEmpty(
                targetStates, "At least one targetState must be provided");
        com.oracle.bmc.util.internal.Validate.noNullElements(
                targetStates, "Null targetState values are not permitted");

        return forAssetSource(
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
    public com.oracle.bmc.waiter.Waiter<GetAssetSourceRequest, GetAssetSourceResponse>
            forAssetSource(
                    GetAssetSourceRequest request,
                    com.oracle.bmc.cloudbridge.model.AssetSourceLifecycleState targetState,
                    com.oracle.bmc.waiter.TerminationStrategy terminationStrategy,
                    com.oracle.bmc.waiter.DelayStrategy delayStrategy) {
        com.oracle.bmc.util.internal.Validate.notNull(
                targetState, "The targetState cannot be null");

        return forAssetSource(
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
     * @return a new {@code Waiter} instance
     */
    public com.oracle.bmc.waiter.Waiter<GetAssetSourceRequest, GetAssetSourceResponse>
            forAssetSource(
                    GetAssetSourceRequest request,
                    com.oracle.bmc.waiter.TerminationStrategy terminationStrategy,
                    com.oracle.bmc.waiter.DelayStrategy delayStrategy,
                    com.oracle.bmc.cloudbridge.model.AssetSourceLifecycleState... targetStates) {
        com.oracle.bmc.util.internal.Validate.notEmpty(
                targetStates, "At least one targetState must be provided");
        com.oracle.bmc.util.internal.Validate.noNullElements(
                targetStates, "Null targetState values are not permitted");

        return forAssetSource(
                com.oracle.bmc.waiter.Waiters.newWaiter(terminationStrategy, delayStrategy),
                request,
                targetStates);
    }

    // Helper method to create a new Waiter for AssetSource.
    private com.oracle.bmc.waiter.Waiter<GetAssetSourceRequest, GetAssetSourceResponse>
            forAssetSource(
                    com.oracle.bmc.waiter.BmcGenericWaiter waiter,
                    final GetAssetSourceRequest request,
                    final com.oracle.bmc.cloudbridge.model.AssetSourceLifecycleState...
                            targetStates) {
        final java.util.Set<com.oracle.bmc.cloudbridge.model.AssetSourceLifecycleState>
                targetStatesSet = new java.util.HashSet<>(java.util.Arrays.asList(targetStates));

        return new com.oracle.bmc.waiter.internal.SimpleWaiterImpl<>(
                executorService,
                waiter.toCallable(
                        () -> request,
                        new java.util.function.Function<
                                GetAssetSourceRequest, GetAssetSourceResponse>() {
                            @Override
                            public GetAssetSourceResponse apply(GetAssetSourceRequest request) {
                                return client.getAssetSource(request);
                            }
                        },
                        new java.util.function.Predicate<GetAssetSourceResponse>() {
                            @Override
                            public boolean test(GetAssetSourceResponse response) {
                                return targetStatesSet.contains(
                                        response.getAssetSource().getLifecycleState());
                            }
                        },
                        targetStatesSet.contains(
                                com.oracle.bmc.cloudbridge.model.AssetSourceLifecycleState
                                        .Deleted)),
                request);
    }

    /**
     * Creates a new {@link com.oracle.bmc.waiter.Waiter} using the default configuration.
     *
     * @param request the request to send
     * @param targetState the desired states to wait for. If multiple states are provided then the waiter will return once the resource reaches any of the provided states
     * @return a new {@code com.oracle.bmc.waiter.Waiter} instance
     */
    public com.oracle.bmc.waiter.Waiter<GetDiscoveryScheduleRequest, GetDiscoveryScheduleResponse>
            forDiscoverySchedule(
                    GetDiscoveryScheduleRequest request,
                    com.oracle.bmc.cloudbridge.model.DiscoveryScheduleLifecycleState...
                            targetStates) {
        com.oracle.bmc.util.internal.Validate.notEmpty(
                targetStates, "At least one targetState must be provided");
        com.oracle.bmc.util.internal.Validate.noNullElements(
                targetStates, "Null targetState values are not permitted");

        return forDiscoverySchedule(
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
    public com.oracle.bmc.waiter.Waiter<GetDiscoveryScheduleRequest, GetDiscoveryScheduleResponse>
            forDiscoverySchedule(
                    GetDiscoveryScheduleRequest request,
                    com.oracle.bmc.cloudbridge.model.DiscoveryScheduleLifecycleState targetState,
                    com.oracle.bmc.waiter.TerminationStrategy terminationStrategy,
                    com.oracle.bmc.waiter.DelayStrategy delayStrategy) {
        com.oracle.bmc.util.internal.Validate.notNull(
                targetState, "The targetState cannot be null");

        return forDiscoverySchedule(
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
     * @return a new {@code Waiter} instance
     */
    public com.oracle.bmc.waiter.Waiter<GetDiscoveryScheduleRequest, GetDiscoveryScheduleResponse>
            forDiscoverySchedule(
                    GetDiscoveryScheduleRequest request,
                    com.oracle.bmc.waiter.TerminationStrategy terminationStrategy,
                    com.oracle.bmc.waiter.DelayStrategy delayStrategy,
                    com.oracle.bmc.cloudbridge.model.DiscoveryScheduleLifecycleState...
                            targetStates) {
        com.oracle.bmc.util.internal.Validate.notEmpty(
                targetStates, "At least one targetState must be provided");
        com.oracle.bmc.util.internal.Validate.noNullElements(
                targetStates, "Null targetState values are not permitted");

        return forDiscoverySchedule(
                com.oracle.bmc.waiter.Waiters.newWaiter(terminationStrategy, delayStrategy),
                request,
                targetStates);
    }

    // Helper method to create a new Waiter for DiscoverySchedule.
    private com.oracle.bmc.waiter.Waiter<GetDiscoveryScheduleRequest, GetDiscoveryScheduleResponse>
            forDiscoverySchedule(
                    com.oracle.bmc.waiter.BmcGenericWaiter waiter,
                    final GetDiscoveryScheduleRequest request,
                    final com.oracle.bmc.cloudbridge.model.DiscoveryScheduleLifecycleState...
                            targetStates) {
        final java.util.Set<com.oracle.bmc.cloudbridge.model.DiscoveryScheduleLifecycleState>
                targetStatesSet = new java.util.HashSet<>(java.util.Arrays.asList(targetStates));

        return new com.oracle.bmc.waiter.internal.SimpleWaiterImpl<>(
                executorService,
                waiter.toCallable(
                        () -> request,
                        new java.util.function.Function<
                                GetDiscoveryScheduleRequest, GetDiscoveryScheduleResponse>() {
                            @Override
                            public GetDiscoveryScheduleResponse apply(
                                    GetDiscoveryScheduleRequest request) {
                                return client.getDiscoverySchedule(request);
                            }
                        },
                        new java.util.function.Predicate<GetDiscoveryScheduleResponse>() {
                            @Override
                            public boolean test(GetDiscoveryScheduleResponse response) {
                                return targetStatesSet.contains(
                                        response.getDiscoverySchedule().getLifecycleState());
                            }
                        },
                        targetStatesSet.contains(
                                com.oracle.bmc.cloudbridge.model.DiscoveryScheduleLifecycleState
                                        .Deleted)),
                request);
    }
}
