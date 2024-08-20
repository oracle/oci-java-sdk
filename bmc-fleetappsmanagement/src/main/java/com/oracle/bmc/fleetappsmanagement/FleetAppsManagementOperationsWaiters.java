/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.fleetappsmanagement;

import com.oracle.bmc.fleetappsmanagement.requests.*;
import com.oracle.bmc.fleetappsmanagement.responses.*;

/**
 * Collection of helper methods to produce {@link com.oracle.bmc.waiter.Waiter}s for different
 * resources of FleetAppsManagementOperations.
 *
 * <p>The default configuration used is defined by {@link
 * com.oracle.bmc.waiter.Waiters.Waiters#DEFAULT_POLLING_WAITER}.
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20230831")
public class FleetAppsManagementOperationsWaiters {
    private final java.util.concurrent.ExecutorService executorService;
    private final FleetAppsManagementOperations client;

    public FleetAppsManagementOperationsWaiters(
            java.util.concurrent.ExecutorService executorService,
            FleetAppsManagementOperations client) {
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
                    GetSchedulerDefinitionRequest, GetSchedulerDefinitionResponse>
            forSchedulerDefinition(
                    GetSchedulerDefinitionRequest request,
                    com.oracle.bmc.fleetappsmanagement.model.SchedulerDefinition.LifecycleState...
                            targetStates) {
        com.oracle.bmc.util.internal.Validate.notEmpty(
                targetStates, "At least one targetState must be provided");
        com.oracle.bmc.util.internal.Validate.noNullElements(
                targetStates, "Null targetState values are not permitted");

        return forSchedulerDefinition(
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
                    GetSchedulerDefinitionRequest, GetSchedulerDefinitionResponse>
            forSchedulerDefinition(
                    GetSchedulerDefinitionRequest request,
                    com.oracle.bmc.fleetappsmanagement.model.SchedulerDefinition.LifecycleState
                            targetState,
                    com.oracle.bmc.waiter.TerminationStrategy terminationStrategy,
                    com.oracle.bmc.waiter.DelayStrategy delayStrategy) {
        com.oracle.bmc.util.internal.Validate.notNull(
                targetState, "The targetState cannot be null");

        return forSchedulerDefinition(
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
                    GetSchedulerDefinitionRequest, GetSchedulerDefinitionResponse>
            forSchedulerDefinition(
                    GetSchedulerDefinitionRequest request,
                    com.oracle.bmc.waiter.TerminationStrategy terminationStrategy,
                    com.oracle.bmc.waiter.DelayStrategy delayStrategy,
                    com.oracle.bmc.fleetappsmanagement.model.SchedulerDefinition.LifecycleState...
                            targetStates) {
        com.oracle.bmc.util.internal.Validate.notEmpty(
                targetStates, "At least one target state must be provided");
        com.oracle.bmc.util.internal.Validate.noNullElements(
                targetStates, "Null target states are not permitted");

        return forSchedulerDefinition(
                com.oracle.bmc.waiter.Waiters.newWaiter(terminationStrategy, delayStrategy),
                request,
                targetStates);
    }

    // Helper method to create a new Waiter for SchedulerDefinition.
    private com.oracle.bmc.waiter.Waiter<
                    GetSchedulerDefinitionRequest, GetSchedulerDefinitionResponse>
            forSchedulerDefinition(
                    com.oracle.bmc.waiter.BmcGenericWaiter waiter,
                    final GetSchedulerDefinitionRequest request,
                    final com.oracle.bmc.fleetappsmanagement.model.SchedulerDefinition
                                            .LifecycleState
                                    ...
                            targetStates) {
        final java.util.Set<
                        com.oracle.bmc.fleetappsmanagement.model.SchedulerDefinition.LifecycleState>
                targetStatesSet = new java.util.HashSet<>(java.util.Arrays.asList(targetStates));

        return new com.oracle.bmc.waiter.internal.SimpleWaiterImpl<>(
                executorService,
                waiter.toCallable(
                        () -> request,
                        new java.util.function.Function<
                                GetSchedulerDefinitionRequest, GetSchedulerDefinitionResponse>() {
                            @Override
                            public GetSchedulerDefinitionResponse apply(
                                    GetSchedulerDefinitionRequest request) {
                                return client.getSchedulerDefinition(request);
                            }
                        },
                        new java.util.function.Predicate<GetSchedulerDefinitionResponse>() {
                            @Override
                            public boolean test(GetSchedulerDefinitionResponse response) {
                                return targetStatesSet.contains(
                                        response.getSchedulerDefinition().getLifecycleState());
                            }
                        },
                        targetStatesSet.contains(
                                com.oracle.bmc.fleetappsmanagement.model.SchedulerDefinition
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
    public com.oracle.bmc.waiter.Waiter<GetSchedulerJobRequest, GetSchedulerJobResponse>
            forSchedulerJob(
                    GetSchedulerJobRequest request,
                    com.oracle.bmc.fleetappsmanagement.model.SchedulerJob.LifecycleState...
                            targetStates) {
        com.oracle.bmc.util.internal.Validate.notEmpty(
                targetStates, "At least one targetState must be provided");
        com.oracle.bmc.util.internal.Validate.noNullElements(
                targetStates, "Null targetState values are not permitted");

        return forSchedulerJob(
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
    public com.oracle.bmc.waiter.Waiter<GetSchedulerJobRequest, GetSchedulerJobResponse>
            forSchedulerJob(
                    GetSchedulerJobRequest request,
                    com.oracle.bmc.fleetappsmanagement.model.SchedulerJob.LifecycleState
                            targetState,
                    com.oracle.bmc.waiter.TerminationStrategy terminationStrategy,
                    com.oracle.bmc.waiter.DelayStrategy delayStrategy) {
        com.oracle.bmc.util.internal.Validate.notNull(
                targetState, "The targetState cannot be null");

        return forSchedulerJob(
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
    public com.oracle.bmc.waiter.Waiter<GetSchedulerJobRequest, GetSchedulerJobResponse>
            forSchedulerJob(
                    GetSchedulerJobRequest request,
                    com.oracle.bmc.waiter.TerminationStrategy terminationStrategy,
                    com.oracle.bmc.waiter.DelayStrategy delayStrategy,
                    com.oracle.bmc.fleetappsmanagement.model.SchedulerJob.LifecycleState...
                            targetStates) {
        com.oracle.bmc.util.internal.Validate.notEmpty(
                targetStates, "At least one target state must be provided");
        com.oracle.bmc.util.internal.Validate.noNullElements(
                targetStates, "Null target states are not permitted");

        return forSchedulerJob(
                com.oracle.bmc.waiter.Waiters.newWaiter(terminationStrategy, delayStrategy),
                request,
                targetStates);
    }

    // Helper method to create a new Waiter for SchedulerJob.
    private com.oracle.bmc.waiter.Waiter<GetSchedulerJobRequest, GetSchedulerJobResponse>
            forSchedulerJob(
                    com.oracle.bmc.waiter.BmcGenericWaiter waiter,
                    final GetSchedulerJobRequest request,
                    final com.oracle.bmc.fleetappsmanagement.model.SchedulerJob.LifecycleState...
                            targetStates) {
        final java.util.Set<com.oracle.bmc.fleetappsmanagement.model.SchedulerJob.LifecycleState>
                targetStatesSet = new java.util.HashSet<>(java.util.Arrays.asList(targetStates));

        return new com.oracle.bmc.waiter.internal.SimpleWaiterImpl<>(
                executorService,
                waiter.toCallable(
                        () -> request,
                        new java.util.function.Function<
                                GetSchedulerJobRequest, GetSchedulerJobResponse>() {
                            @Override
                            public GetSchedulerJobResponse apply(GetSchedulerJobRequest request) {
                                return client.getSchedulerJob(request);
                            }
                        },
                        new java.util.function.Predicate<GetSchedulerJobResponse>() {
                            @Override
                            public boolean test(GetSchedulerJobResponse response) {
                                return targetStatesSet.contains(
                                        response.getSchedulerJob().getLifecycleState());
                            }
                        },
                        targetStatesSet.contains(
                                com.oracle.bmc.fleetappsmanagement.model.SchedulerJob.LifecycleState
                                        .Deleted)),
                request);
    }
}
