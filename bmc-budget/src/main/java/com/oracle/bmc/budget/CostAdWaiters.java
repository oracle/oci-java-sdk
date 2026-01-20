/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.budget;

import com.oracle.bmc.budget.requests.*;
import com.oracle.bmc.budget.responses.*;

/**
 * Collection of helper methods to produce {@link com.oracle.bmc.waiter.Waiter}s for different
 * resources of CostAd.
 *
 * <p>The default configuration used is defined by {@link
 * com.oracle.bmc.waiter.Waiters.Waiters#DEFAULT_POLLING_WAITER}.
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20190111")
public class CostAdWaiters {
    private final java.util.concurrent.ExecutorService executorService;
    private final CostAd client;

    public CostAdWaiters(java.util.concurrent.ExecutorService executorService, CostAd client) {
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
                    GetCostAlertSubscriptionRequest, GetCostAlertSubscriptionResponse>
            forCostAlertSubscription(
                    GetCostAlertSubscriptionRequest request,
                    com.oracle.bmc.budget.model.CostAlertSubscription.LifecycleState...
                            targetStates) {
        com.oracle.bmc.util.internal.Validate.notEmpty(
                targetStates, "At least one targetState must be provided");
        com.oracle.bmc.util.internal.Validate.noNullElements(
                targetStates, "Null targetState values are not permitted");

        return forCostAlertSubscription(
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
                    GetCostAlertSubscriptionRequest, GetCostAlertSubscriptionResponse>
            forCostAlertSubscription(
                    GetCostAlertSubscriptionRequest request,
                    com.oracle.bmc.budget.model.CostAlertSubscription.LifecycleState targetState,
                    com.oracle.bmc.waiter.TerminationStrategy terminationStrategy,
                    com.oracle.bmc.waiter.DelayStrategy delayStrategy) {
        com.oracle.bmc.util.internal.Validate.notNull(
                targetState, "The targetState cannot be null");

        return forCostAlertSubscription(
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
                    GetCostAlertSubscriptionRequest, GetCostAlertSubscriptionResponse>
            forCostAlertSubscription(
                    GetCostAlertSubscriptionRequest request,
                    com.oracle.bmc.waiter.TerminationStrategy terminationStrategy,
                    com.oracle.bmc.waiter.DelayStrategy delayStrategy,
                    com.oracle.bmc.budget.model.CostAlertSubscription.LifecycleState...
                            targetStates) {
        com.oracle.bmc.util.internal.Validate.notEmpty(
                targetStates, "At least one target state must be provided");
        com.oracle.bmc.util.internal.Validate.noNullElements(
                targetStates, "Null target states are not permitted");

        return forCostAlertSubscription(
                com.oracle.bmc.waiter.Waiters.newWaiter(terminationStrategy, delayStrategy),
                request,
                targetStates);
    }

    // Helper method to create a new Waiter for CostAlertSubscription.
    private com.oracle.bmc.waiter.Waiter<
                    GetCostAlertSubscriptionRequest, GetCostAlertSubscriptionResponse>
            forCostAlertSubscription(
                    com.oracle.bmc.waiter.BmcGenericWaiter waiter,
                    final GetCostAlertSubscriptionRequest request,
                    final com.oracle.bmc.budget.model.CostAlertSubscription.LifecycleState...
                            targetStates) {
        final java.util.Set<com.oracle.bmc.budget.model.CostAlertSubscription.LifecycleState>
                targetStatesSet = new java.util.HashSet<>(java.util.Arrays.asList(targetStates));

        return new com.oracle.bmc.waiter.internal.SimpleWaiterImpl<>(
                executorService,
                waiter.toCallable(
                        () -> request,
                        new java.util.function.Function<
                                GetCostAlertSubscriptionRequest,
                                GetCostAlertSubscriptionResponse>() {
                            @Override
                            public GetCostAlertSubscriptionResponse apply(
                                    GetCostAlertSubscriptionRequest request) {
                                return client.getCostAlertSubscription(request);
                            }
                        },
                        new java.util.function.Predicate<GetCostAlertSubscriptionResponse>() {
                            @Override
                            public boolean test(GetCostAlertSubscriptionResponse response) {
                                return targetStatesSet.contains(
                                        response.getCostAlertSubscription().getLifecycleState());
                            }
                        },
                        false),
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
    public com.oracle.bmc.waiter.Waiter<GetCostAnomalyEventRequest, GetCostAnomalyEventResponse>
            forCostAnomalyEvent(
                    GetCostAnomalyEventRequest request,
                    com.oracle.bmc.budget.model.CostAnomalyEvent.LifecycleState... targetStates) {
        com.oracle.bmc.util.internal.Validate.notEmpty(
                targetStates, "At least one targetState must be provided");
        com.oracle.bmc.util.internal.Validate.noNullElements(
                targetStates, "Null targetState values are not permitted");

        return forCostAnomalyEvent(
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
    public com.oracle.bmc.waiter.Waiter<GetCostAnomalyEventRequest, GetCostAnomalyEventResponse>
            forCostAnomalyEvent(
                    GetCostAnomalyEventRequest request,
                    com.oracle.bmc.budget.model.CostAnomalyEvent.LifecycleState targetState,
                    com.oracle.bmc.waiter.TerminationStrategy terminationStrategy,
                    com.oracle.bmc.waiter.DelayStrategy delayStrategy) {
        com.oracle.bmc.util.internal.Validate.notNull(
                targetState, "The targetState cannot be null");

        return forCostAnomalyEvent(
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
    public com.oracle.bmc.waiter.Waiter<GetCostAnomalyEventRequest, GetCostAnomalyEventResponse>
            forCostAnomalyEvent(
                    GetCostAnomalyEventRequest request,
                    com.oracle.bmc.waiter.TerminationStrategy terminationStrategy,
                    com.oracle.bmc.waiter.DelayStrategy delayStrategy,
                    com.oracle.bmc.budget.model.CostAnomalyEvent.LifecycleState... targetStates) {
        com.oracle.bmc.util.internal.Validate.notEmpty(
                targetStates, "At least one target state must be provided");
        com.oracle.bmc.util.internal.Validate.noNullElements(
                targetStates, "Null target states are not permitted");

        return forCostAnomalyEvent(
                com.oracle.bmc.waiter.Waiters.newWaiter(terminationStrategy, delayStrategy),
                request,
                targetStates);
    }

    // Helper method to create a new Waiter for CostAnomalyEvent.
    private com.oracle.bmc.waiter.Waiter<GetCostAnomalyEventRequest, GetCostAnomalyEventResponse>
            forCostAnomalyEvent(
                    com.oracle.bmc.waiter.BmcGenericWaiter waiter,
                    final GetCostAnomalyEventRequest request,
                    final com.oracle.bmc.budget.model.CostAnomalyEvent.LifecycleState...
                            targetStates) {
        final java.util.Set<com.oracle.bmc.budget.model.CostAnomalyEvent.LifecycleState>
                targetStatesSet = new java.util.HashSet<>(java.util.Arrays.asList(targetStates));

        return new com.oracle.bmc.waiter.internal.SimpleWaiterImpl<>(
                executorService,
                waiter.toCallable(
                        () -> request,
                        new java.util.function.Function<
                                GetCostAnomalyEventRequest, GetCostAnomalyEventResponse>() {
                            @Override
                            public GetCostAnomalyEventResponse apply(
                                    GetCostAnomalyEventRequest request) {
                                return client.getCostAnomalyEvent(request);
                            }
                        },
                        new java.util.function.Predicate<GetCostAnomalyEventResponse>() {
                            @Override
                            public boolean test(GetCostAnomalyEventResponse response) {
                                return targetStatesSet.contains(
                                        response.getCostAnomalyEvent().getLifecycleState());
                            }
                        },
                        false),
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
    public com.oracle.bmc.waiter.Waiter<GetCostAnomalyMonitorRequest, GetCostAnomalyMonitorResponse>
            forCostAnomalyMonitor(
                    GetCostAnomalyMonitorRequest request,
                    com.oracle.bmc.budget.model.CostAnomalyMonitor.LifecycleState... targetStates) {
        com.oracle.bmc.util.internal.Validate.notEmpty(
                targetStates, "At least one targetState must be provided");
        com.oracle.bmc.util.internal.Validate.noNullElements(
                targetStates, "Null targetState values are not permitted");

        return forCostAnomalyMonitor(
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
    public com.oracle.bmc.waiter.Waiter<GetCostAnomalyMonitorRequest, GetCostAnomalyMonitorResponse>
            forCostAnomalyMonitor(
                    GetCostAnomalyMonitorRequest request,
                    com.oracle.bmc.budget.model.CostAnomalyMonitor.LifecycleState targetState,
                    com.oracle.bmc.waiter.TerminationStrategy terminationStrategy,
                    com.oracle.bmc.waiter.DelayStrategy delayStrategy) {
        com.oracle.bmc.util.internal.Validate.notNull(
                targetState, "The targetState cannot be null");

        return forCostAnomalyMonitor(
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
    public com.oracle.bmc.waiter.Waiter<GetCostAnomalyMonitorRequest, GetCostAnomalyMonitorResponse>
            forCostAnomalyMonitor(
                    GetCostAnomalyMonitorRequest request,
                    com.oracle.bmc.waiter.TerminationStrategy terminationStrategy,
                    com.oracle.bmc.waiter.DelayStrategy delayStrategy,
                    com.oracle.bmc.budget.model.CostAnomalyMonitor.LifecycleState... targetStates) {
        com.oracle.bmc.util.internal.Validate.notEmpty(
                targetStates, "At least one target state must be provided");
        com.oracle.bmc.util.internal.Validate.noNullElements(
                targetStates, "Null target states are not permitted");

        return forCostAnomalyMonitor(
                com.oracle.bmc.waiter.Waiters.newWaiter(terminationStrategy, delayStrategy),
                request,
                targetStates);
    }

    // Helper method to create a new Waiter for CostAnomalyMonitor.
    private com.oracle.bmc.waiter.Waiter<
                    GetCostAnomalyMonitorRequest, GetCostAnomalyMonitorResponse>
            forCostAnomalyMonitor(
                    com.oracle.bmc.waiter.BmcGenericWaiter waiter,
                    final GetCostAnomalyMonitorRequest request,
                    final com.oracle.bmc.budget.model.CostAnomalyMonitor.LifecycleState...
                            targetStates) {
        final java.util.Set<com.oracle.bmc.budget.model.CostAnomalyMonitor.LifecycleState>
                targetStatesSet = new java.util.HashSet<>(java.util.Arrays.asList(targetStates));

        return new com.oracle.bmc.waiter.internal.SimpleWaiterImpl<>(
                executorService,
                waiter.toCallable(
                        () -> request,
                        new java.util.function.Function<
                                GetCostAnomalyMonitorRequest, GetCostAnomalyMonitorResponse>() {
                            @Override
                            public GetCostAnomalyMonitorResponse apply(
                                    GetCostAnomalyMonitorRequest request) {
                                return client.getCostAnomalyMonitor(request);
                            }
                        },
                        new java.util.function.Predicate<GetCostAnomalyMonitorResponse>() {
                            @Override
                            public boolean test(GetCostAnomalyMonitorResponse response) {
                                return targetStatesSet.contains(
                                        response.getCostAnomalyMonitor().getLifecycleState());
                            }
                        },
                        targetStatesSet.contains(
                                com.oracle.bmc.budget.model.CostAnomalyMonitor.LifecycleState
                                        .Deleted)),
                request);
    }
}
