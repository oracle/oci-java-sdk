/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.fleetappsmanagement;

import com.oracle.bmc.fleetappsmanagement.requests.*;
import com.oracle.bmc.fleetappsmanagement.responses.*;

/**
 * Collection of helper methods to produce {@link com.oracle.bmc.waiter.Waiter}s for different
 * resources of FleetAppsManagementCatalog.
 *
 * <p>The default configuration used is defined by {@link
 * com.oracle.bmc.waiter.Waiters.Waiters#DEFAULT_POLLING_WAITER}.
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20250228")
public class FleetAppsManagementCatalogWaiters {
    private final java.util.concurrent.ExecutorService executorService;
    private final FleetAppsManagementCatalog client;

    public FleetAppsManagementCatalogWaiters(
            java.util.concurrent.ExecutorService executorService,
            FleetAppsManagementCatalog client) {
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
    public com.oracle.bmc.waiter.Waiter<GetCatalogItemRequest, GetCatalogItemResponse>
            forCatalogItem(
                    GetCatalogItemRequest request,
                    com.oracle.bmc.fleetappsmanagement.model.CatalogItem.LifecycleState...
                            targetStates) {
        com.oracle.bmc.util.internal.Validate.notEmpty(
                targetStates, "At least one targetState must be provided");
        com.oracle.bmc.util.internal.Validate.noNullElements(
                targetStates, "Null targetState values are not permitted");

        return forCatalogItem(
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
    public com.oracle.bmc.waiter.Waiter<GetCatalogItemRequest, GetCatalogItemResponse>
            forCatalogItem(
                    GetCatalogItemRequest request,
                    com.oracle.bmc.fleetappsmanagement.model.CatalogItem.LifecycleState targetState,
                    com.oracle.bmc.waiter.TerminationStrategy terminationStrategy,
                    com.oracle.bmc.waiter.DelayStrategy delayStrategy) {
        com.oracle.bmc.util.internal.Validate.notNull(
                targetState, "The targetState cannot be null");

        return forCatalogItem(
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
    public com.oracle.bmc.waiter.Waiter<GetCatalogItemRequest, GetCatalogItemResponse>
            forCatalogItem(
                    GetCatalogItemRequest request,
                    com.oracle.bmc.waiter.TerminationStrategy terminationStrategy,
                    com.oracle.bmc.waiter.DelayStrategy delayStrategy,
                    com.oracle.bmc.fleetappsmanagement.model.CatalogItem.LifecycleState...
                            targetStates) {
        com.oracle.bmc.util.internal.Validate.notEmpty(
                targetStates, "At least one target state must be provided");
        com.oracle.bmc.util.internal.Validate.noNullElements(
                targetStates, "Null target states are not permitted");

        return forCatalogItem(
                com.oracle.bmc.waiter.Waiters.newWaiter(terminationStrategy, delayStrategy),
                request,
                targetStates);
    }

    // Helper method to create a new Waiter for CatalogItem.
    private com.oracle.bmc.waiter.Waiter<GetCatalogItemRequest, GetCatalogItemResponse>
            forCatalogItem(
                    com.oracle.bmc.waiter.BmcGenericWaiter waiter,
                    final GetCatalogItemRequest request,
                    final com.oracle.bmc.fleetappsmanagement.model.CatalogItem.LifecycleState...
                            targetStates) {
        final java.util.Set<com.oracle.bmc.fleetappsmanagement.model.CatalogItem.LifecycleState>
                targetStatesSet = new java.util.HashSet<>(java.util.Arrays.asList(targetStates));

        return new com.oracle.bmc.waiter.internal.SimpleWaiterImpl<>(
                executorService,
                waiter.toCallable(
                        () -> request,
                        new java.util.function.Function<
                                GetCatalogItemRequest, GetCatalogItemResponse>() {
                            @Override
                            public GetCatalogItemResponse apply(GetCatalogItemRequest request) {
                                return client.getCatalogItem(request);
                            }
                        },
                        new java.util.function.Predicate<GetCatalogItemResponse>() {
                            @Override
                            public boolean test(GetCatalogItemResponse response) {
                                return targetStatesSet.contains(
                                        response.getCatalogItem().getLifecycleState());
                            }
                        },
                        targetStatesSet.contains(
                                com.oracle.bmc.fleetappsmanagement.model.CatalogItem.LifecycleState
                                        .Deleted)),
                request);
    }
}
