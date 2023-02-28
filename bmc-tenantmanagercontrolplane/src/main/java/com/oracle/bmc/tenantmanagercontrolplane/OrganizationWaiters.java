/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.tenantmanagercontrolplane;

import com.oracle.bmc.tenantmanagercontrolplane.requests.*;
import com.oracle.bmc.tenantmanagercontrolplane.responses.*;

/**
 * Collection of helper methods to produce {@link com.oracle.bmc.waiter.Waiter}s for different
 * resources of Organization.
 *
 * <p>The default configuration used is defined by {@link
 * com.oracle.bmc.waiter.Waiters.Waiters#DEFAULT_POLLING_WAITER}.
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200801")
public class OrganizationWaiters {
    private final java.util.concurrent.ExecutorService executorService;
    private final Organization client;

    public OrganizationWaiters(
            java.util.concurrent.ExecutorService executorService, Organization client) {
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
    public com.oracle.bmc.waiter.Waiter<GetOrganizationRequest, GetOrganizationResponse>
            forOrganization(
                    GetOrganizationRequest request,
                    com.oracle.bmc.tenantmanagercontrolplane.model.Organization.LifecycleState...
                            targetStates) {
        com.oracle.bmc.util.internal.Validate.notEmpty(
                targetStates, "At least one targetState must be provided");
        com.oracle.bmc.util.internal.Validate.noNullElements(
                targetStates, "Null targetState values are not permitted");

        return forOrganization(
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
    public com.oracle.bmc.waiter.Waiter<GetOrganizationRequest, GetOrganizationResponse>
            forOrganization(
                    GetOrganizationRequest request,
                    com.oracle.bmc.tenantmanagercontrolplane.model.Organization.LifecycleState
                            targetState,
                    com.oracle.bmc.waiter.TerminationStrategy terminationStrategy,
                    com.oracle.bmc.waiter.DelayStrategy delayStrategy) {
        com.oracle.bmc.util.internal.Validate.notNull(
                targetState, "The targetState cannot be null");

        return forOrganization(
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
    public com.oracle.bmc.waiter.Waiter<GetOrganizationRequest, GetOrganizationResponse>
            forOrganization(
                    GetOrganizationRequest request,
                    com.oracle.bmc.waiter.TerminationStrategy terminationStrategy,
                    com.oracle.bmc.waiter.DelayStrategy delayStrategy,
                    com.oracle.bmc.tenantmanagercontrolplane.model.Organization.LifecycleState...
                            targetStates) {
        com.oracle.bmc.util.internal.Validate.notEmpty(
                targetStates, "At least one target state must be provided");
        com.oracle.bmc.util.internal.Validate.noNullElements(
                targetStates, "Null target states are not permitted");

        return forOrganization(
                com.oracle.bmc.waiter.Waiters.newWaiter(terminationStrategy, delayStrategy),
                request,
                targetStates);
    }

    // Helper method to create a new Waiter for Organization.
    private com.oracle.bmc.waiter.Waiter<GetOrganizationRequest, GetOrganizationResponse>
            forOrganization(
                    com.oracle.bmc.waiter.BmcGenericWaiter waiter,
                    final GetOrganizationRequest request,
                    final com.oracle.bmc.tenantmanagercontrolplane.model.Organization.LifecycleState
                                    ...
                            targetStates) {
        final java.util.Set<
                        com.oracle.bmc.tenantmanagercontrolplane.model.Organization.LifecycleState>
                targetStatesSet = new java.util.HashSet<>(java.util.Arrays.asList(targetStates));

        return new com.oracle.bmc.waiter.internal.SimpleWaiterImpl<>(
                executorService,
                waiter.toCallable(
                        () -> request,
                        new java.util.function.Function<
                                GetOrganizationRequest, GetOrganizationResponse>() {
                            @Override
                            public GetOrganizationResponse apply(GetOrganizationRequest request) {
                                return client.getOrganization(request);
                            }
                        },
                        new java.util.function.Predicate<GetOrganizationResponse>() {
                            @Override
                            public boolean test(GetOrganizationResponse response) {
                                return targetStatesSet.contains(
                                        response.getOrganization().getLifecycleState());
                            }
                        },
                        targetStatesSet.contains(
                                com.oracle.bmc.tenantmanagercontrolplane.model.Organization
                                        .LifecycleState.Deleted)),
                request);
    }

    /**
     * Creates a new {@link com.oracle.bmc.waiter.Waiter} using the default configuration.
     *
     * @param request the request to send
     * @param targetState the desired states to wait for. If multiple states are provided then the
     *     waiter will return once the resource reaches any of the provided states
     * @return a new {@code com.oracle.bmc.waiter.Waiter} instance
     */
    public com.oracle.bmc.waiter.Waiter<
                    GetOrganizationTenancyRequest, GetOrganizationTenancyResponse>
            forOrganizationTenancy(
                    GetOrganizationTenancyRequest request,
                    com.oracle.bmc.tenantmanagercontrolplane.model.OrganizationTenancyLifecycleState
                                    ...
                            targetStates) {
        com.oracle.bmc.util.internal.Validate.notEmpty(
                targetStates, "At least one targetState must be provided");
        com.oracle.bmc.util.internal.Validate.noNullElements(
                targetStates, "Null targetState values are not permitted");

        return forOrganizationTenancy(
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
                    GetOrganizationTenancyRequest, GetOrganizationTenancyResponse>
            forOrganizationTenancy(
                    GetOrganizationTenancyRequest request,
                    com.oracle.bmc.tenantmanagercontrolplane.model.OrganizationTenancyLifecycleState
                            targetState,
                    com.oracle.bmc.waiter.TerminationStrategy terminationStrategy,
                    com.oracle.bmc.waiter.DelayStrategy delayStrategy) {
        com.oracle.bmc.util.internal.Validate.notNull(
                targetState, "The targetState cannot be null");

        return forOrganizationTenancy(
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
    public com.oracle.bmc.waiter.Waiter<
                    GetOrganizationTenancyRequest, GetOrganizationTenancyResponse>
            forOrganizationTenancy(
                    GetOrganizationTenancyRequest request,
                    com.oracle.bmc.waiter.TerminationStrategy terminationStrategy,
                    com.oracle.bmc.waiter.DelayStrategy delayStrategy,
                    com.oracle.bmc.tenantmanagercontrolplane.model.OrganizationTenancyLifecycleState
                                    ...
                            targetStates) {
        com.oracle.bmc.util.internal.Validate.notEmpty(
                targetStates, "At least one targetState must be provided");
        com.oracle.bmc.util.internal.Validate.noNullElements(
                targetStates, "Null targetState values are not permitted");

        return forOrganizationTenancy(
                com.oracle.bmc.waiter.Waiters.newWaiter(terminationStrategy, delayStrategy),
                request,
                targetStates);
    }

    // Helper method to create a new Waiter for OrganizationTenancy.
    private com.oracle.bmc.waiter.Waiter<
                    GetOrganizationTenancyRequest, GetOrganizationTenancyResponse>
            forOrganizationTenancy(
                    com.oracle.bmc.waiter.BmcGenericWaiter waiter,
                    final GetOrganizationTenancyRequest request,
                    final com.oracle.bmc.tenantmanagercontrolplane.model
                                            .OrganizationTenancyLifecycleState
                                    ...
                            targetStates) {
        final java.util.Set<
                        com.oracle.bmc.tenantmanagercontrolplane.model
                                .OrganizationTenancyLifecycleState>
                targetStatesSet = new java.util.HashSet<>(java.util.Arrays.asList(targetStates));

        return new com.oracle.bmc.waiter.internal.SimpleWaiterImpl<>(
                executorService,
                waiter.toCallable(
                        () -> request,
                        new java.util.function.Function<
                                GetOrganizationTenancyRequest, GetOrganizationTenancyResponse>() {
                            @Override
                            public GetOrganizationTenancyResponse apply(
                                    GetOrganizationTenancyRequest request) {
                                return client.getOrganizationTenancy(request);
                            }
                        },
                        new java.util.function.Predicate<GetOrganizationTenancyResponse>() {
                            @Override
                            public boolean test(GetOrganizationTenancyResponse response) {
                                return targetStatesSet.contains(
                                        response.getOrganizationTenancy().getLifecycleState());
                            }
                        },
                        targetStatesSet.contains(
                                com.oracle.bmc.tenantmanagercontrolplane.model
                                        .OrganizationTenancyLifecycleState.Deleted)),
                request);
    }
}
