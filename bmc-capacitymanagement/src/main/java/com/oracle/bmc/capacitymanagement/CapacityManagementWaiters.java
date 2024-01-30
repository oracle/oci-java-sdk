/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.capacitymanagement;

import com.oracle.bmc.capacitymanagement.requests.*;
import com.oracle.bmc.capacitymanagement.responses.*;

/**
 * Collection of helper methods to produce {@link com.oracle.bmc.waiter.Waiter}s for different
 * resources of CapacityManagement.
 *
 * <p>The default configuration used is defined by {@link
 * com.oracle.bmc.waiter.Waiters.Waiters#DEFAULT_POLLING_WAITER}.
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20231107")
public class CapacityManagementWaiters {
    private final java.util.concurrent.ExecutorService executorService;
    private final CapacityManagement client;

    public CapacityManagementWaiters(
            java.util.concurrent.ExecutorService executorService, CapacityManagement client) {
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
                    GetOccAvailabilityCatalogRequest, GetOccAvailabilityCatalogResponse>
            forOccAvailabilityCatalog(
                    GetOccAvailabilityCatalogRequest request,
                    com.oracle.bmc.capacitymanagement.model.OccAvailabilityCatalog.LifecycleState...
                            targetStates) {
        com.oracle.bmc.util.internal.Validate.notEmpty(
                targetStates, "At least one targetState must be provided");
        com.oracle.bmc.util.internal.Validate.noNullElements(
                targetStates, "Null targetState values are not permitted");

        return forOccAvailabilityCatalog(
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
                    GetOccAvailabilityCatalogRequest, GetOccAvailabilityCatalogResponse>
            forOccAvailabilityCatalog(
                    GetOccAvailabilityCatalogRequest request,
                    com.oracle.bmc.capacitymanagement.model.OccAvailabilityCatalog.LifecycleState
                            targetState,
                    com.oracle.bmc.waiter.TerminationStrategy terminationStrategy,
                    com.oracle.bmc.waiter.DelayStrategy delayStrategy) {
        com.oracle.bmc.util.internal.Validate.notNull(
                targetState, "The targetState cannot be null");

        return forOccAvailabilityCatalog(
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
                    GetOccAvailabilityCatalogRequest, GetOccAvailabilityCatalogResponse>
            forOccAvailabilityCatalog(
                    GetOccAvailabilityCatalogRequest request,
                    com.oracle.bmc.waiter.TerminationStrategy terminationStrategy,
                    com.oracle.bmc.waiter.DelayStrategy delayStrategy,
                    com.oracle.bmc.capacitymanagement.model.OccAvailabilityCatalog.LifecycleState...
                            targetStates) {
        com.oracle.bmc.util.internal.Validate.notEmpty(
                targetStates, "At least one target state must be provided");
        com.oracle.bmc.util.internal.Validate.noNullElements(
                targetStates, "Null target states are not permitted");

        return forOccAvailabilityCatalog(
                com.oracle.bmc.waiter.Waiters.newWaiter(terminationStrategy, delayStrategy),
                request,
                targetStates);
    }

    // Helper method to create a new Waiter for OccAvailabilityCatalog.
    private com.oracle.bmc.waiter.Waiter<
                    GetOccAvailabilityCatalogRequest, GetOccAvailabilityCatalogResponse>
            forOccAvailabilityCatalog(
                    com.oracle.bmc.waiter.BmcGenericWaiter waiter,
                    final GetOccAvailabilityCatalogRequest request,
                    final com.oracle.bmc.capacitymanagement.model.OccAvailabilityCatalog
                                            .LifecycleState
                                    ...
                            targetStates) {
        final java.util.Set<
                        com.oracle.bmc.capacitymanagement.model.OccAvailabilityCatalog
                                .LifecycleState>
                targetStatesSet = new java.util.HashSet<>(java.util.Arrays.asList(targetStates));

        return new com.oracle.bmc.waiter.internal.SimpleWaiterImpl<>(
                executorService,
                waiter.toCallable(
                        () -> request,
                        new java.util.function.Function<
                                GetOccAvailabilityCatalogRequest,
                                GetOccAvailabilityCatalogResponse>() {
                            @Override
                            public GetOccAvailabilityCatalogResponse apply(
                                    GetOccAvailabilityCatalogRequest request) {
                                return client.getOccAvailabilityCatalog(request);
                            }
                        },
                        new java.util.function.Predicate<GetOccAvailabilityCatalogResponse>() {
                            @Override
                            public boolean test(GetOccAvailabilityCatalogResponse response) {
                                return targetStatesSet.contains(
                                        response.getOccAvailabilityCatalog().getLifecycleState());
                            }
                        },
                        targetStatesSet.contains(
                                com.oracle.bmc.capacitymanagement.model.OccAvailabilityCatalog
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
    public com.oracle.bmc.waiter.Waiter<GetOccCapacityRequestRequest, GetOccCapacityRequestResponse>
            forOccCapacityRequest(
                    GetOccCapacityRequestRequest request,
                    com.oracle.bmc.capacitymanagement.model.OccCapacityRequest.LifecycleState...
                            targetStates) {
        com.oracle.bmc.util.internal.Validate.notEmpty(
                targetStates, "At least one targetState must be provided");
        com.oracle.bmc.util.internal.Validate.noNullElements(
                targetStates, "Null targetState values are not permitted");

        return forOccCapacityRequest(
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
    public com.oracle.bmc.waiter.Waiter<GetOccCapacityRequestRequest, GetOccCapacityRequestResponse>
            forOccCapacityRequest(
                    GetOccCapacityRequestRequest request,
                    com.oracle.bmc.capacitymanagement.model.OccCapacityRequest.LifecycleState
                            targetState,
                    com.oracle.bmc.waiter.TerminationStrategy terminationStrategy,
                    com.oracle.bmc.waiter.DelayStrategy delayStrategy) {
        com.oracle.bmc.util.internal.Validate.notNull(
                targetState, "The targetState cannot be null");

        return forOccCapacityRequest(
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
    public com.oracle.bmc.waiter.Waiter<GetOccCapacityRequestRequest, GetOccCapacityRequestResponse>
            forOccCapacityRequest(
                    GetOccCapacityRequestRequest request,
                    com.oracle.bmc.waiter.TerminationStrategy terminationStrategy,
                    com.oracle.bmc.waiter.DelayStrategy delayStrategy,
                    com.oracle.bmc.capacitymanagement.model.OccCapacityRequest.LifecycleState...
                            targetStates) {
        com.oracle.bmc.util.internal.Validate.notEmpty(
                targetStates, "At least one target state must be provided");
        com.oracle.bmc.util.internal.Validate.noNullElements(
                targetStates, "Null target states are not permitted");

        return forOccCapacityRequest(
                com.oracle.bmc.waiter.Waiters.newWaiter(terminationStrategy, delayStrategy),
                request,
                targetStates);
    }

    // Helper method to create a new Waiter for OccCapacityRequest.
    private com.oracle.bmc.waiter.Waiter<
                    GetOccCapacityRequestRequest, GetOccCapacityRequestResponse>
            forOccCapacityRequest(
                    com.oracle.bmc.waiter.BmcGenericWaiter waiter,
                    final GetOccCapacityRequestRequest request,
                    final com.oracle.bmc.capacitymanagement.model.OccCapacityRequest.LifecycleState
                                    ...
                            targetStates) {
        final java.util.Set<
                        com.oracle.bmc.capacitymanagement.model.OccCapacityRequest.LifecycleState>
                targetStatesSet = new java.util.HashSet<>(java.util.Arrays.asList(targetStates));

        return new com.oracle.bmc.waiter.internal.SimpleWaiterImpl<>(
                executorService,
                waiter.toCallable(
                        () -> request,
                        new java.util.function.Function<
                                GetOccCapacityRequestRequest, GetOccCapacityRequestResponse>() {
                            @Override
                            public GetOccCapacityRequestResponse apply(
                                    GetOccCapacityRequestRequest request) {
                                return client.getOccCapacityRequest(request);
                            }
                        },
                        new java.util.function.Predicate<GetOccCapacityRequestResponse>() {
                            @Override
                            public boolean test(GetOccCapacityRequestResponse response) {
                                return targetStatesSet.contains(
                                        response.getOccCapacityRequest().getLifecycleState());
                            }
                        },
                        targetStatesSet.contains(
                                com.oracle.bmc.capacitymanagement.model.OccCapacityRequest
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
    public com.oracle.bmc.waiter.Waiter<GetOccCustomerGroupRequest, GetOccCustomerGroupResponse>
            forOccCustomerGroup(
                    GetOccCustomerGroupRequest request,
                    com.oracle.bmc.capacitymanagement.model.OccCustomerGroup.LifecycleState...
                            targetStates) {
        com.oracle.bmc.util.internal.Validate.notEmpty(
                targetStates, "At least one targetState must be provided");
        com.oracle.bmc.util.internal.Validate.noNullElements(
                targetStates, "Null targetState values are not permitted");

        return forOccCustomerGroup(
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
    public com.oracle.bmc.waiter.Waiter<GetOccCustomerGroupRequest, GetOccCustomerGroupResponse>
            forOccCustomerGroup(
                    GetOccCustomerGroupRequest request,
                    com.oracle.bmc.capacitymanagement.model.OccCustomerGroup.LifecycleState
                            targetState,
                    com.oracle.bmc.waiter.TerminationStrategy terminationStrategy,
                    com.oracle.bmc.waiter.DelayStrategy delayStrategy) {
        com.oracle.bmc.util.internal.Validate.notNull(
                targetState, "The targetState cannot be null");

        return forOccCustomerGroup(
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
    public com.oracle.bmc.waiter.Waiter<GetOccCustomerGroupRequest, GetOccCustomerGroupResponse>
            forOccCustomerGroup(
                    GetOccCustomerGroupRequest request,
                    com.oracle.bmc.waiter.TerminationStrategy terminationStrategy,
                    com.oracle.bmc.waiter.DelayStrategy delayStrategy,
                    com.oracle.bmc.capacitymanagement.model.OccCustomerGroup.LifecycleState...
                            targetStates) {
        com.oracle.bmc.util.internal.Validate.notEmpty(
                targetStates, "At least one target state must be provided");
        com.oracle.bmc.util.internal.Validate.noNullElements(
                targetStates, "Null target states are not permitted");

        return forOccCustomerGroup(
                com.oracle.bmc.waiter.Waiters.newWaiter(terminationStrategy, delayStrategy),
                request,
                targetStates);
    }

    // Helper method to create a new Waiter for OccCustomerGroup.
    private com.oracle.bmc.waiter.Waiter<GetOccCustomerGroupRequest, GetOccCustomerGroupResponse>
            forOccCustomerGroup(
                    com.oracle.bmc.waiter.BmcGenericWaiter waiter,
                    final GetOccCustomerGroupRequest request,
                    final com.oracle.bmc.capacitymanagement.model.OccCustomerGroup.LifecycleState...
                            targetStates) {
        final java.util.Set<com.oracle.bmc.capacitymanagement.model.OccCustomerGroup.LifecycleState>
                targetStatesSet = new java.util.HashSet<>(java.util.Arrays.asList(targetStates));

        return new com.oracle.bmc.waiter.internal.SimpleWaiterImpl<>(
                executorService,
                waiter.toCallable(
                        () -> request,
                        new java.util.function.Function<
                                GetOccCustomerGroupRequest, GetOccCustomerGroupResponse>() {
                            @Override
                            public GetOccCustomerGroupResponse apply(
                                    GetOccCustomerGroupRequest request) {
                                return client.getOccCustomerGroup(request);
                            }
                        },
                        new java.util.function.Predicate<GetOccCustomerGroupResponse>() {
                            @Override
                            public boolean test(GetOccCustomerGroupResponse response) {
                                return targetStatesSet.contains(
                                        response.getOccCustomerGroup().getLifecycleState());
                            }
                        },
                        targetStatesSet.contains(
                                com.oracle.bmc.capacitymanagement.model.OccCustomerGroup
                                        .LifecycleState.Deleted)),
                request);
    }
}
