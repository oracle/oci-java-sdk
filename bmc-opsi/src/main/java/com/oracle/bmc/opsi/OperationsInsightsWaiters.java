/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.opsi;

import com.oracle.bmc.opsi.requests.*;
import com.oracle.bmc.opsi.responses.*;

/**
 * Collection of helper methods to produce {@link com.oracle.bmc.waiter.Waiter}s for different
 * resources of OperationsInsights.
 *
 * <p>The default configuration used is defined by {@link
 * com.oracle.bmc.waiter.Waiters.Waiters#DEFAULT_POLLING_WAITER}.
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200630")
public class OperationsInsightsWaiters {
    private final java.util.concurrent.ExecutorService executorService;
    private final OperationsInsights client;

    public OperationsInsightsWaiters(
            java.util.concurrent.ExecutorService executorService, OperationsInsights client) {
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
    public com.oracle.bmc.waiter.Waiter<GetAwrHubRequest, GetAwrHubResponse> forAwrHub(
            GetAwrHubRequest request,
            com.oracle.bmc.opsi.model.AwrHubLifecycleState... targetStates) {
        com.oracle.bmc.util.internal.Validate.notEmpty(
                targetStates, "At least one targetState must be provided");
        com.oracle.bmc.util.internal.Validate.noNullElements(
                targetStates, "Null targetState values are not permitted");

        return forAwrHub(
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
    public com.oracle.bmc.waiter.Waiter<GetAwrHubRequest, GetAwrHubResponse> forAwrHub(
            GetAwrHubRequest request,
            com.oracle.bmc.opsi.model.AwrHubLifecycleState targetState,
            com.oracle.bmc.waiter.TerminationStrategy terminationStrategy,
            com.oracle.bmc.waiter.DelayStrategy delayStrategy) {
        com.oracle.bmc.util.internal.Validate.notNull(
                targetState, "The targetState cannot be null");

        return forAwrHub(
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
    public com.oracle.bmc.waiter.Waiter<GetAwrHubRequest, GetAwrHubResponse> forAwrHub(
            GetAwrHubRequest request,
            com.oracle.bmc.waiter.TerminationStrategy terminationStrategy,
            com.oracle.bmc.waiter.DelayStrategy delayStrategy,
            com.oracle.bmc.opsi.model.AwrHubLifecycleState... targetStates) {
        com.oracle.bmc.util.internal.Validate.notEmpty(
                targetStates, "At least one targetState must be provided");
        com.oracle.bmc.util.internal.Validate.noNullElements(
                targetStates, "Null targetState values are not permitted");

        return forAwrHub(
                com.oracle.bmc.waiter.Waiters.newWaiter(terminationStrategy, delayStrategy),
                request,
                targetStates);
    }

    // Helper method to create a new Waiter for AwrHub.
    private com.oracle.bmc.waiter.Waiter<GetAwrHubRequest, GetAwrHubResponse> forAwrHub(
            com.oracle.bmc.waiter.BmcGenericWaiter waiter,
            final GetAwrHubRequest request,
            final com.oracle.bmc.opsi.model.AwrHubLifecycleState... targetStates) {
        final java.util.Set<com.oracle.bmc.opsi.model.AwrHubLifecycleState> targetStatesSet =
                new java.util.HashSet<>(java.util.Arrays.asList(targetStates));

        return new com.oracle.bmc.waiter.internal.SimpleWaiterImpl<>(
                executorService,
                waiter.toCallable(
                        () -> request,
                        new java.util.function.Function<GetAwrHubRequest, GetAwrHubResponse>() {
                            @Override
                            public GetAwrHubResponse apply(GetAwrHubRequest request) {
                                return client.getAwrHub(request);
                            }
                        },
                        new java.util.function.Predicate<GetAwrHubResponse>() {
                            @Override
                            public boolean test(GetAwrHubResponse response) {
                                return targetStatesSet.contains(
                                        response.getAwrHub().getLifecycleState());
                            }
                        },
                        targetStatesSet.contains(
                                com.oracle.bmc.opsi.model.AwrHubLifecycleState.Deleted)),
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
    public com.oracle.bmc.waiter.Waiter<GetAwrHubSourceRequest, GetAwrHubSourceResponse>
            forAwrHubSource(
                    GetAwrHubSourceRequest request,
                    com.oracle.bmc.opsi.model.AwrHubSourceLifecycleState... targetStates) {
        com.oracle.bmc.util.internal.Validate.notEmpty(
                targetStates, "At least one targetState must be provided");
        com.oracle.bmc.util.internal.Validate.noNullElements(
                targetStates, "Null targetState values are not permitted");

        return forAwrHubSource(
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
    public com.oracle.bmc.waiter.Waiter<GetAwrHubSourceRequest, GetAwrHubSourceResponse>
            forAwrHubSource(
                    GetAwrHubSourceRequest request,
                    com.oracle.bmc.opsi.model.AwrHubSourceLifecycleState targetState,
                    com.oracle.bmc.waiter.TerminationStrategy terminationStrategy,
                    com.oracle.bmc.waiter.DelayStrategy delayStrategy) {
        com.oracle.bmc.util.internal.Validate.notNull(
                targetState, "The targetState cannot be null");

        return forAwrHubSource(
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
    public com.oracle.bmc.waiter.Waiter<GetAwrHubSourceRequest, GetAwrHubSourceResponse>
            forAwrHubSource(
                    GetAwrHubSourceRequest request,
                    com.oracle.bmc.waiter.TerminationStrategy terminationStrategy,
                    com.oracle.bmc.waiter.DelayStrategy delayStrategy,
                    com.oracle.bmc.opsi.model.AwrHubSourceLifecycleState... targetStates) {
        com.oracle.bmc.util.internal.Validate.notEmpty(
                targetStates, "At least one targetState must be provided");
        com.oracle.bmc.util.internal.Validate.noNullElements(
                targetStates, "Null targetState values are not permitted");

        return forAwrHubSource(
                com.oracle.bmc.waiter.Waiters.newWaiter(terminationStrategy, delayStrategy),
                request,
                targetStates);
    }

    // Helper method to create a new Waiter for AwrHubSource.
    private com.oracle.bmc.waiter.Waiter<GetAwrHubSourceRequest, GetAwrHubSourceResponse>
            forAwrHubSource(
                    com.oracle.bmc.waiter.BmcGenericWaiter waiter,
                    final GetAwrHubSourceRequest request,
                    final com.oracle.bmc.opsi.model.AwrHubSourceLifecycleState... targetStates) {
        final java.util.Set<com.oracle.bmc.opsi.model.AwrHubSourceLifecycleState> targetStatesSet =
                new java.util.HashSet<>(java.util.Arrays.asList(targetStates));

        return new com.oracle.bmc.waiter.internal.SimpleWaiterImpl<>(
                executorService,
                waiter.toCallable(
                        () -> request,
                        new java.util.function.Function<
                                GetAwrHubSourceRequest, GetAwrHubSourceResponse>() {
                            @Override
                            public GetAwrHubSourceResponse apply(GetAwrHubSourceRequest request) {
                                return client.getAwrHubSource(request);
                            }
                        },
                        new java.util.function.Predicate<GetAwrHubSourceResponse>() {
                            @Override
                            public boolean test(GetAwrHubSourceResponse response) {
                                return targetStatesSet.contains(
                                        response.getAwrHubSource().getLifecycleState());
                            }
                        },
                        targetStatesSet.contains(
                                com.oracle.bmc.opsi.model.AwrHubSourceLifecycleState.Deleted)),
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
    public com.oracle.bmc.waiter.Waiter<GetDatabaseInsightRequest, GetDatabaseInsightResponse>
            forDatabaseInsight(
                    GetDatabaseInsightRequest request,
                    com.oracle.bmc.opsi.model.LifecycleState... targetStates) {
        com.oracle.bmc.util.internal.Validate.notEmpty(
                targetStates, "At least one targetState must be provided");
        com.oracle.bmc.util.internal.Validate.noNullElements(
                targetStates, "Null targetState values are not permitted");

        return forDatabaseInsight(
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
    public com.oracle.bmc.waiter.Waiter<GetDatabaseInsightRequest, GetDatabaseInsightResponse>
            forDatabaseInsight(
                    GetDatabaseInsightRequest request,
                    com.oracle.bmc.opsi.model.LifecycleState targetState,
                    com.oracle.bmc.waiter.TerminationStrategy terminationStrategy,
                    com.oracle.bmc.waiter.DelayStrategy delayStrategy) {
        com.oracle.bmc.util.internal.Validate.notNull(
                targetState, "The targetState cannot be null");

        return forDatabaseInsight(
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
    public com.oracle.bmc.waiter.Waiter<GetDatabaseInsightRequest, GetDatabaseInsightResponse>
            forDatabaseInsight(
                    GetDatabaseInsightRequest request,
                    com.oracle.bmc.waiter.TerminationStrategy terminationStrategy,
                    com.oracle.bmc.waiter.DelayStrategy delayStrategy,
                    com.oracle.bmc.opsi.model.LifecycleState... targetStates) {
        com.oracle.bmc.util.internal.Validate.notEmpty(
                targetStates, "At least one targetState must be provided");
        com.oracle.bmc.util.internal.Validate.noNullElements(
                targetStates, "Null targetState values are not permitted");

        return forDatabaseInsight(
                com.oracle.bmc.waiter.Waiters.newWaiter(terminationStrategy, delayStrategy),
                request,
                targetStates);
    }

    // Helper method to create a new Waiter for DatabaseInsight.
    private com.oracle.bmc.waiter.Waiter<GetDatabaseInsightRequest, GetDatabaseInsightResponse>
            forDatabaseInsight(
                    com.oracle.bmc.waiter.BmcGenericWaiter waiter,
                    final GetDatabaseInsightRequest request,
                    final com.oracle.bmc.opsi.model.LifecycleState... targetStates) {
        final java.util.Set<com.oracle.bmc.opsi.model.LifecycleState> targetStatesSet =
                new java.util.HashSet<>(java.util.Arrays.asList(targetStates));

        return new com.oracle.bmc.waiter.internal.SimpleWaiterImpl<>(
                executorService,
                waiter.toCallable(
                        () -> request,
                        new java.util.function.Function<
                                GetDatabaseInsightRequest, GetDatabaseInsightResponse>() {
                            @Override
                            public GetDatabaseInsightResponse apply(
                                    GetDatabaseInsightRequest request) {
                                return client.getDatabaseInsight(request);
                            }
                        },
                        new java.util.function.Predicate<GetDatabaseInsightResponse>() {
                            @Override
                            public boolean test(GetDatabaseInsightResponse response) {
                                return targetStatesSet.contains(
                                        response.getDatabaseInsight().getLifecycleState());
                            }
                        },
                        targetStatesSet.contains(com.oracle.bmc.opsi.model.LifecycleState.Deleted)),
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
                    GetEnterpriseManagerBridgeRequest, GetEnterpriseManagerBridgeResponse>
            forEnterpriseManagerBridge(
                    GetEnterpriseManagerBridgeRequest request,
                    com.oracle.bmc.opsi.model.LifecycleState... targetStates) {
        com.oracle.bmc.util.internal.Validate.notEmpty(
                targetStates, "At least one targetState must be provided");
        com.oracle.bmc.util.internal.Validate.noNullElements(
                targetStates, "Null targetState values are not permitted");

        return forEnterpriseManagerBridge(
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
                    GetEnterpriseManagerBridgeRequest, GetEnterpriseManagerBridgeResponse>
            forEnterpriseManagerBridge(
                    GetEnterpriseManagerBridgeRequest request,
                    com.oracle.bmc.opsi.model.LifecycleState targetState,
                    com.oracle.bmc.waiter.TerminationStrategy terminationStrategy,
                    com.oracle.bmc.waiter.DelayStrategy delayStrategy) {
        com.oracle.bmc.util.internal.Validate.notNull(
                targetState, "The targetState cannot be null");

        return forEnterpriseManagerBridge(
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
                    GetEnterpriseManagerBridgeRequest, GetEnterpriseManagerBridgeResponse>
            forEnterpriseManagerBridge(
                    GetEnterpriseManagerBridgeRequest request,
                    com.oracle.bmc.waiter.TerminationStrategy terminationStrategy,
                    com.oracle.bmc.waiter.DelayStrategy delayStrategy,
                    com.oracle.bmc.opsi.model.LifecycleState... targetStates) {
        com.oracle.bmc.util.internal.Validate.notEmpty(
                targetStates, "At least one targetState must be provided");
        com.oracle.bmc.util.internal.Validate.noNullElements(
                targetStates, "Null targetState values are not permitted");

        return forEnterpriseManagerBridge(
                com.oracle.bmc.waiter.Waiters.newWaiter(terminationStrategy, delayStrategy),
                request,
                targetStates);
    }

    // Helper method to create a new Waiter for EnterpriseManagerBridge.
    private com.oracle.bmc.waiter.Waiter<
                    GetEnterpriseManagerBridgeRequest, GetEnterpriseManagerBridgeResponse>
            forEnterpriseManagerBridge(
                    com.oracle.bmc.waiter.BmcGenericWaiter waiter,
                    final GetEnterpriseManagerBridgeRequest request,
                    final com.oracle.bmc.opsi.model.LifecycleState... targetStates) {
        final java.util.Set<com.oracle.bmc.opsi.model.LifecycleState> targetStatesSet =
                new java.util.HashSet<>(java.util.Arrays.asList(targetStates));

        return new com.oracle.bmc.waiter.internal.SimpleWaiterImpl<>(
                executorService,
                waiter.toCallable(
                        () -> request,
                        new java.util.function.Function<
                                GetEnterpriseManagerBridgeRequest,
                                GetEnterpriseManagerBridgeResponse>() {
                            @Override
                            public GetEnterpriseManagerBridgeResponse apply(
                                    GetEnterpriseManagerBridgeRequest request) {
                                return client.getEnterpriseManagerBridge(request);
                            }
                        },
                        new java.util.function.Predicate<GetEnterpriseManagerBridgeResponse>() {
                            @Override
                            public boolean test(GetEnterpriseManagerBridgeResponse response) {
                                return targetStatesSet.contains(
                                        response.getEnterpriseManagerBridge().getLifecycleState());
                            }
                        },
                        targetStatesSet.contains(com.oracle.bmc.opsi.model.LifecycleState.Deleted)),
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
    public com.oracle.bmc.waiter.Waiter<GetExadataInsightRequest, GetExadataInsightResponse>
            forExadataInsight(
                    GetExadataInsightRequest request,
                    com.oracle.bmc.opsi.model.ExadataInsightLifecycleState... targetStates) {
        com.oracle.bmc.util.internal.Validate.notEmpty(
                targetStates, "At least one targetState must be provided");
        com.oracle.bmc.util.internal.Validate.noNullElements(
                targetStates, "Null targetState values are not permitted");

        return forExadataInsight(
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
    public com.oracle.bmc.waiter.Waiter<GetExadataInsightRequest, GetExadataInsightResponse>
            forExadataInsight(
                    GetExadataInsightRequest request,
                    com.oracle.bmc.opsi.model.ExadataInsightLifecycleState targetState,
                    com.oracle.bmc.waiter.TerminationStrategy terminationStrategy,
                    com.oracle.bmc.waiter.DelayStrategy delayStrategy) {
        com.oracle.bmc.util.internal.Validate.notNull(
                targetState, "The targetState cannot be null");

        return forExadataInsight(
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
    public com.oracle.bmc.waiter.Waiter<GetExadataInsightRequest, GetExadataInsightResponse>
            forExadataInsight(
                    GetExadataInsightRequest request,
                    com.oracle.bmc.waiter.TerminationStrategy terminationStrategy,
                    com.oracle.bmc.waiter.DelayStrategy delayStrategy,
                    com.oracle.bmc.opsi.model.ExadataInsightLifecycleState... targetStates) {
        com.oracle.bmc.util.internal.Validate.notEmpty(
                targetStates, "At least one targetState must be provided");
        com.oracle.bmc.util.internal.Validate.noNullElements(
                targetStates, "Null targetState values are not permitted");

        return forExadataInsight(
                com.oracle.bmc.waiter.Waiters.newWaiter(terminationStrategy, delayStrategy),
                request,
                targetStates);
    }

    // Helper method to create a new Waiter for ExadataInsight.
    private com.oracle.bmc.waiter.Waiter<GetExadataInsightRequest, GetExadataInsightResponse>
            forExadataInsight(
                    com.oracle.bmc.waiter.BmcGenericWaiter waiter,
                    final GetExadataInsightRequest request,
                    final com.oracle.bmc.opsi.model.ExadataInsightLifecycleState... targetStates) {
        final java.util.Set<com.oracle.bmc.opsi.model.ExadataInsightLifecycleState>
                targetStatesSet = new java.util.HashSet<>(java.util.Arrays.asList(targetStates));

        return new com.oracle.bmc.waiter.internal.SimpleWaiterImpl<>(
                executorService,
                waiter.toCallable(
                        () -> request,
                        new java.util.function.Function<
                                GetExadataInsightRequest, GetExadataInsightResponse>() {
                            @Override
                            public GetExadataInsightResponse apply(
                                    GetExadataInsightRequest request) {
                                return client.getExadataInsight(request);
                            }
                        },
                        new java.util.function.Predicate<GetExadataInsightResponse>() {
                            @Override
                            public boolean test(GetExadataInsightResponse response) {
                                return targetStatesSet.contains(
                                        response.getExadataInsight().getLifecycleState());
                            }
                        },
                        targetStatesSet.contains(
                                com.oracle.bmc.opsi.model.ExadataInsightLifecycleState.Deleted)),
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
    public com.oracle.bmc.waiter.Waiter<GetHostInsightRequest, GetHostInsightResponse>
            forHostInsight(
                    GetHostInsightRequest request,
                    com.oracle.bmc.opsi.model.LifecycleState... targetStates) {
        com.oracle.bmc.util.internal.Validate.notEmpty(
                targetStates, "At least one targetState must be provided");
        com.oracle.bmc.util.internal.Validate.noNullElements(
                targetStates, "Null targetState values are not permitted");

        return forHostInsight(
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
    public com.oracle.bmc.waiter.Waiter<GetHostInsightRequest, GetHostInsightResponse>
            forHostInsight(
                    GetHostInsightRequest request,
                    com.oracle.bmc.opsi.model.LifecycleState targetState,
                    com.oracle.bmc.waiter.TerminationStrategy terminationStrategy,
                    com.oracle.bmc.waiter.DelayStrategy delayStrategy) {
        com.oracle.bmc.util.internal.Validate.notNull(
                targetState, "The targetState cannot be null");

        return forHostInsight(
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
    public com.oracle.bmc.waiter.Waiter<GetHostInsightRequest, GetHostInsightResponse>
            forHostInsight(
                    GetHostInsightRequest request,
                    com.oracle.bmc.waiter.TerminationStrategy terminationStrategy,
                    com.oracle.bmc.waiter.DelayStrategy delayStrategy,
                    com.oracle.bmc.opsi.model.LifecycleState... targetStates) {
        com.oracle.bmc.util.internal.Validate.notEmpty(
                targetStates, "At least one targetState must be provided");
        com.oracle.bmc.util.internal.Validate.noNullElements(
                targetStates, "Null targetState values are not permitted");

        return forHostInsight(
                com.oracle.bmc.waiter.Waiters.newWaiter(terminationStrategy, delayStrategy),
                request,
                targetStates);
    }

    // Helper method to create a new Waiter for HostInsight.
    private com.oracle.bmc.waiter.Waiter<GetHostInsightRequest, GetHostInsightResponse>
            forHostInsight(
                    com.oracle.bmc.waiter.BmcGenericWaiter waiter,
                    final GetHostInsightRequest request,
                    final com.oracle.bmc.opsi.model.LifecycleState... targetStates) {
        final java.util.Set<com.oracle.bmc.opsi.model.LifecycleState> targetStatesSet =
                new java.util.HashSet<>(java.util.Arrays.asList(targetStates));

        return new com.oracle.bmc.waiter.internal.SimpleWaiterImpl<>(
                executorService,
                waiter.toCallable(
                        () -> request,
                        new java.util.function.Function<
                                GetHostInsightRequest, GetHostInsightResponse>() {
                            @Override
                            public GetHostInsightResponse apply(GetHostInsightRequest request) {
                                return client.getHostInsight(request);
                            }
                        },
                        new java.util.function.Predicate<GetHostInsightResponse>() {
                            @Override
                            public boolean test(GetHostInsightResponse response) {
                                return targetStatesSet.contains(
                                        response.getHostInsight().getLifecycleState());
                            }
                        },
                        targetStatesSet.contains(com.oracle.bmc.opsi.model.LifecycleState.Deleted)),
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
    public com.oracle.bmc.waiter.Waiter<GetNewsReportRequest, GetNewsReportResponse> forNewsReport(
            GetNewsReportRequest request,
            com.oracle.bmc.opsi.model.LifecycleState... targetStates) {
        com.oracle.bmc.util.internal.Validate.notEmpty(
                targetStates, "At least one targetState must be provided");
        com.oracle.bmc.util.internal.Validate.noNullElements(
                targetStates, "Null targetState values are not permitted");

        return forNewsReport(
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
    public com.oracle.bmc.waiter.Waiter<GetNewsReportRequest, GetNewsReportResponse> forNewsReport(
            GetNewsReportRequest request,
            com.oracle.bmc.opsi.model.LifecycleState targetState,
            com.oracle.bmc.waiter.TerminationStrategy terminationStrategy,
            com.oracle.bmc.waiter.DelayStrategy delayStrategy) {
        com.oracle.bmc.util.internal.Validate.notNull(
                targetState, "The targetState cannot be null");

        return forNewsReport(
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
    public com.oracle.bmc.waiter.Waiter<GetNewsReportRequest, GetNewsReportResponse> forNewsReport(
            GetNewsReportRequest request,
            com.oracle.bmc.waiter.TerminationStrategy terminationStrategy,
            com.oracle.bmc.waiter.DelayStrategy delayStrategy,
            com.oracle.bmc.opsi.model.LifecycleState... targetStates) {
        com.oracle.bmc.util.internal.Validate.notEmpty(
                targetStates, "At least one targetState must be provided");
        com.oracle.bmc.util.internal.Validate.noNullElements(
                targetStates, "Null targetState values are not permitted");

        return forNewsReport(
                com.oracle.bmc.waiter.Waiters.newWaiter(terminationStrategy, delayStrategy),
                request,
                targetStates);
    }

    // Helper method to create a new Waiter for NewsReport.
    private com.oracle.bmc.waiter.Waiter<GetNewsReportRequest, GetNewsReportResponse> forNewsReport(
            com.oracle.bmc.waiter.BmcGenericWaiter waiter,
            final GetNewsReportRequest request,
            final com.oracle.bmc.opsi.model.LifecycleState... targetStates) {
        final java.util.Set<com.oracle.bmc.opsi.model.LifecycleState> targetStatesSet =
                new java.util.HashSet<>(java.util.Arrays.asList(targetStates));

        return new com.oracle.bmc.waiter.internal.SimpleWaiterImpl<>(
                executorService,
                waiter.toCallable(
                        () -> request,
                        new java.util.function.Function<
                                GetNewsReportRequest, GetNewsReportResponse>() {
                            @Override
                            public GetNewsReportResponse apply(GetNewsReportRequest request) {
                                return client.getNewsReport(request);
                            }
                        },
                        new java.util.function.Predicate<GetNewsReportResponse>() {
                            @Override
                            public boolean test(GetNewsReportResponse response) {
                                return targetStatesSet.contains(
                                        response.getNewsReport().getLifecycleState());
                            }
                        },
                        targetStatesSet.contains(com.oracle.bmc.opsi.model.LifecycleState.Deleted)),
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
                    GetOperationsInsightsPrivateEndpointRequest,
                    GetOperationsInsightsPrivateEndpointResponse>
            forOperationsInsightsPrivateEndpoint(
                    GetOperationsInsightsPrivateEndpointRequest request,
                    com.oracle.bmc.opsi.model.OperationsInsightsPrivateEndpointLifecycleState...
                            targetStates) {
        com.oracle.bmc.util.internal.Validate.notEmpty(
                targetStates, "At least one targetState must be provided");
        com.oracle.bmc.util.internal.Validate.noNullElements(
                targetStates, "Null targetState values are not permitted");

        return forOperationsInsightsPrivateEndpoint(
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
                    GetOperationsInsightsPrivateEndpointRequest,
                    GetOperationsInsightsPrivateEndpointResponse>
            forOperationsInsightsPrivateEndpoint(
                    GetOperationsInsightsPrivateEndpointRequest request,
                    com.oracle.bmc.opsi.model.OperationsInsightsPrivateEndpointLifecycleState
                            targetState,
                    com.oracle.bmc.waiter.TerminationStrategy terminationStrategy,
                    com.oracle.bmc.waiter.DelayStrategy delayStrategy) {
        com.oracle.bmc.util.internal.Validate.notNull(
                targetState, "The targetState cannot be null");

        return forOperationsInsightsPrivateEndpoint(
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
                    GetOperationsInsightsPrivateEndpointRequest,
                    GetOperationsInsightsPrivateEndpointResponse>
            forOperationsInsightsPrivateEndpoint(
                    GetOperationsInsightsPrivateEndpointRequest request,
                    com.oracle.bmc.waiter.TerminationStrategy terminationStrategy,
                    com.oracle.bmc.waiter.DelayStrategy delayStrategy,
                    com.oracle.bmc.opsi.model.OperationsInsightsPrivateEndpointLifecycleState...
                            targetStates) {
        com.oracle.bmc.util.internal.Validate.notEmpty(
                targetStates, "At least one targetState must be provided");
        com.oracle.bmc.util.internal.Validate.noNullElements(
                targetStates, "Null targetState values are not permitted");

        return forOperationsInsightsPrivateEndpoint(
                com.oracle.bmc.waiter.Waiters.newWaiter(terminationStrategy, delayStrategy),
                request,
                targetStates);
    }

    // Helper method to create a new Waiter for OperationsInsightsPrivateEndpoint.
    private com.oracle.bmc.waiter.Waiter<
                    GetOperationsInsightsPrivateEndpointRequest,
                    GetOperationsInsightsPrivateEndpointResponse>
            forOperationsInsightsPrivateEndpoint(
                    com.oracle.bmc.waiter.BmcGenericWaiter waiter,
                    final GetOperationsInsightsPrivateEndpointRequest request,
                    final com.oracle.bmc.opsi.model.OperationsInsightsPrivateEndpointLifecycleState
                                    ...
                            targetStates) {
        final java.util.Set<
                        com.oracle.bmc.opsi.model.OperationsInsightsPrivateEndpointLifecycleState>
                targetStatesSet = new java.util.HashSet<>(java.util.Arrays.asList(targetStates));

        return new com.oracle.bmc.waiter.internal.SimpleWaiterImpl<>(
                executorService,
                waiter.toCallable(
                        () -> request,
                        new java.util.function.Function<
                                GetOperationsInsightsPrivateEndpointRequest,
                                GetOperationsInsightsPrivateEndpointResponse>() {
                            @Override
                            public GetOperationsInsightsPrivateEndpointResponse apply(
                                    GetOperationsInsightsPrivateEndpointRequest request) {
                                return client.getOperationsInsightsPrivateEndpoint(request);
                            }
                        },
                        new java.util.function.Predicate<
                                GetOperationsInsightsPrivateEndpointResponse>() {
                            @Override
                            public boolean test(
                                    GetOperationsInsightsPrivateEndpointResponse response) {
                                return targetStatesSet.contains(
                                        response.getOperationsInsightsPrivateEndpoint()
                                                .getLifecycleState());
                            }
                        },
                        targetStatesSet.contains(
                                com.oracle.bmc.opsi.model
                                        .OperationsInsightsPrivateEndpointLifecycleState.Deleted)),
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
                    GetOperationsInsightsWarehouseRequest, GetOperationsInsightsWarehouseResponse>
            forOperationsInsightsWarehouse(
                    GetOperationsInsightsWarehouseRequest request,
                    com.oracle.bmc.opsi.model.OperationsInsightsWarehouseLifecycleState...
                            targetStates) {
        com.oracle.bmc.util.internal.Validate.notEmpty(
                targetStates, "At least one targetState must be provided");
        com.oracle.bmc.util.internal.Validate.noNullElements(
                targetStates, "Null targetState values are not permitted");

        return forOperationsInsightsWarehouse(
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
                    GetOperationsInsightsWarehouseRequest, GetOperationsInsightsWarehouseResponse>
            forOperationsInsightsWarehouse(
                    GetOperationsInsightsWarehouseRequest request,
                    com.oracle.bmc.opsi.model.OperationsInsightsWarehouseLifecycleState targetState,
                    com.oracle.bmc.waiter.TerminationStrategy terminationStrategy,
                    com.oracle.bmc.waiter.DelayStrategy delayStrategy) {
        com.oracle.bmc.util.internal.Validate.notNull(
                targetState, "The targetState cannot be null");

        return forOperationsInsightsWarehouse(
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
                    GetOperationsInsightsWarehouseRequest, GetOperationsInsightsWarehouseResponse>
            forOperationsInsightsWarehouse(
                    GetOperationsInsightsWarehouseRequest request,
                    com.oracle.bmc.waiter.TerminationStrategy terminationStrategy,
                    com.oracle.bmc.waiter.DelayStrategy delayStrategy,
                    com.oracle.bmc.opsi.model.OperationsInsightsWarehouseLifecycleState...
                            targetStates) {
        com.oracle.bmc.util.internal.Validate.notEmpty(
                targetStates, "At least one targetState must be provided");
        com.oracle.bmc.util.internal.Validate.noNullElements(
                targetStates, "Null targetState values are not permitted");

        return forOperationsInsightsWarehouse(
                com.oracle.bmc.waiter.Waiters.newWaiter(terminationStrategy, delayStrategy),
                request,
                targetStates);
    }

    // Helper method to create a new Waiter for OperationsInsightsWarehouse.
    private com.oracle.bmc.waiter.Waiter<
                    GetOperationsInsightsWarehouseRequest, GetOperationsInsightsWarehouseResponse>
            forOperationsInsightsWarehouse(
                    com.oracle.bmc.waiter.BmcGenericWaiter waiter,
                    final GetOperationsInsightsWarehouseRequest request,
                    final com.oracle.bmc.opsi.model.OperationsInsightsWarehouseLifecycleState...
                            targetStates) {
        final java.util.Set<com.oracle.bmc.opsi.model.OperationsInsightsWarehouseLifecycleState>
                targetStatesSet = new java.util.HashSet<>(java.util.Arrays.asList(targetStates));

        return new com.oracle.bmc.waiter.internal.SimpleWaiterImpl<>(
                executorService,
                waiter.toCallable(
                        () -> request,
                        new java.util.function.Function<
                                GetOperationsInsightsWarehouseRequest,
                                GetOperationsInsightsWarehouseResponse>() {
                            @Override
                            public GetOperationsInsightsWarehouseResponse apply(
                                    GetOperationsInsightsWarehouseRequest request) {
                                return client.getOperationsInsightsWarehouse(request);
                            }
                        },
                        new java.util.function.Predicate<GetOperationsInsightsWarehouseResponse>() {
                            @Override
                            public boolean test(GetOperationsInsightsWarehouseResponse response) {
                                return targetStatesSet.contains(
                                        response.getOperationsInsightsWarehouse()
                                                .getLifecycleState());
                            }
                        },
                        targetStatesSet.contains(
                                com.oracle.bmc.opsi.model.OperationsInsightsWarehouseLifecycleState
                                        .Deleted)),
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
                    GetOperationsInsightsWarehouseUserRequest,
                    GetOperationsInsightsWarehouseUserResponse>
            forOperationsInsightsWarehouseUser(
                    GetOperationsInsightsWarehouseUserRequest request,
                    com.oracle.bmc.opsi.model.OperationsInsightsWarehouseUserLifecycleState...
                            targetStates) {
        com.oracle.bmc.util.internal.Validate.notEmpty(
                targetStates, "At least one targetState must be provided");
        com.oracle.bmc.util.internal.Validate.noNullElements(
                targetStates, "Null targetState values are not permitted");

        return forOperationsInsightsWarehouseUser(
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
                    GetOperationsInsightsWarehouseUserRequest,
                    GetOperationsInsightsWarehouseUserResponse>
            forOperationsInsightsWarehouseUser(
                    GetOperationsInsightsWarehouseUserRequest request,
                    com.oracle.bmc.opsi.model.OperationsInsightsWarehouseUserLifecycleState
                            targetState,
                    com.oracle.bmc.waiter.TerminationStrategy terminationStrategy,
                    com.oracle.bmc.waiter.DelayStrategy delayStrategy) {
        com.oracle.bmc.util.internal.Validate.notNull(
                targetState, "The targetState cannot be null");

        return forOperationsInsightsWarehouseUser(
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
                    GetOperationsInsightsWarehouseUserRequest,
                    GetOperationsInsightsWarehouseUserResponse>
            forOperationsInsightsWarehouseUser(
                    GetOperationsInsightsWarehouseUserRequest request,
                    com.oracle.bmc.waiter.TerminationStrategy terminationStrategy,
                    com.oracle.bmc.waiter.DelayStrategy delayStrategy,
                    com.oracle.bmc.opsi.model.OperationsInsightsWarehouseUserLifecycleState...
                            targetStates) {
        com.oracle.bmc.util.internal.Validate.notEmpty(
                targetStates, "At least one targetState must be provided");
        com.oracle.bmc.util.internal.Validate.noNullElements(
                targetStates, "Null targetState values are not permitted");

        return forOperationsInsightsWarehouseUser(
                com.oracle.bmc.waiter.Waiters.newWaiter(terminationStrategy, delayStrategy),
                request,
                targetStates);
    }

    // Helper method to create a new Waiter for OperationsInsightsWarehouseUser.
    private com.oracle.bmc.waiter.Waiter<
                    GetOperationsInsightsWarehouseUserRequest,
                    GetOperationsInsightsWarehouseUserResponse>
            forOperationsInsightsWarehouseUser(
                    com.oracle.bmc.waiter.BmcGenericWaiter waiter,
                    final GetOperationsInsightsWarehouseUserRequest request,
                    final com.oracle.bmc.opsi.model.OperationsInsightsWarehouseUserLifecycleState...
                            targetStates) {
        final java.util.Set<com.oracle.bmc.opsi.model.OperationsInsightsWarehouseUserLifecycleState>
                targetStatesSet = new java.util.HashSet<>(java.util.Arrays.asList(targetStates));

        return new com.oracle.bmc.waiter.internal.SimpleWaiterImpl<>(
                executorService,
                waiter.toCallable(
                        () -> request,
                        new java.util.function.Function<
                                GetOperationsInsightsWarehouseUserRequest,
                                GetOperationsInsightsWarehouseUserResponse>() {
                            @Override
                            public GetOperationsInsightsWarehouseUserResponse apply(
                                    GetOperationsInsightsWarehouseUserRequest request) {
                                return client.getOperationsInsightsWarehouseUser(request);
                            }
                        },
                        new java.util.function.Predicate<
                                GetOperationsInsightsWarehouseUserResponse>() {
                            @Override
                            public boolean test(
                                    GetOperationsInsightsWarehouseUserResponse response) {
                                return targetStatesSet.contains(
                                        response.getOperationsInsightsWarehouseUser()
                                                .getLifecycleState());
                            }
                        },
                        targetStatesSet.contains(
                                com.oracle.bmc.opsi.model
                                        .OperationsInsightsWarehouseUserLifecycleState.Deleted)),
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
    public com.oracle.bmc.waiter.Waiter<GetOpsiConfigurationRequest, GetOpsiConfigurationResponse>
            forOpsiConfiguration(
                    GetOpsiConfigurationRequest request,
                    com.oracle.bmc.opsi.model.OpsiConfigurationLifecycleState... targetStates) {
        com.oracle.bmc.util.internal.Validate.notEmpty(
                targetStates, "At least one targetState must be provided");
        com.oracle.bmc.util.internal.Validate.noNullElements(
                targetStates, "Null targetState values are not permitted");

        return forOpsiConfiguration(
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
    public com.oracle.bmc.waiter.Waiter<GetOpsiConfigurationRequest, GetOpsiConfigurationResponse>
            forOpsiConfiguration(
                    GetOpsiConfigurationRequest request,
                    com.oracle.bmc.opsi.model.OpsiConfigurationLifecycleState targetState,
                    com.oracle.bmc.waiter.TerminationStrategy terminationStrategy,
                    com.oracle.bmc.waiter.DelayStrategy delayStrategy) {
        com.oracle.bmc.util.internal.Validate.notNull(
                targetState, "The targetState cannot be null");

        return forOpsiConfiguration(
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
    public com.oracle.bmc.waiter.Waiter<GetOpsiConfigurationRequest, GetOpsiConfigurationResponse>
            forOpsiConfiguration(
                    GetOpsiConfigurationRequest request,
                    com.oracle.bmc.waiter.TerminationStrategy terminationStrategy,
                    com.oracle.bmc.waiter.DelayStrategy delayStrategy,
                    com.oracle.bmc.opsi.model.OpsiConfigurationLifecycleState... targetStates) {
        com.oracle.bmc.util.internal.Validate.notEmpty(
                targetStates, "At least one targetState must be provided");
        com.oracle.bmc.util.internal.Validate.noNullElements(
                targetStates, "Null targetState values are not permitted");

        return forOpsiConfiguration(
                com.oracle.bmc.waiter.Waiters.newWaiter(terminationStrategy, delayStrategy),
                request,
                targetStates);
    }

    // Helper method to create a new Waiter for OpsiConfiguration.
    private com.oracle.bmc.waiter.Waiter<GetOpsiConfigurationRequest, GetOpsiConfigurationResponse>
            forOpsiConfiguration(
                    com.oracle.bmc.waiter.BmcGenericWaiter waiter,
                    final GetOpsiConfigurationRequest request,
                    final com.oracle.bmc.opsi.model.OpsiConfigurationLifecycleState...
                            targetStates) {
        final java.util.Set<com.oracle.bmc.opsi.model.OpsiConfigurationLifecycleState>
                targetStatesSet = new java.util.HashSet<>(java.util.Arrays.asList(targetStates));

        return new com.oracle.bmc.waiter.internal.SimpleWaiterImpl<>(
                executorService,
                waiter.toCallable(
                        () -> request,
                        new java.util.function.Function<
                                GetOpsiConfigurationRequest, GetOpsiConfigurationResponse>() {
                            @Override
                            public GetOpsiConfigurationResponse apply(
                                    GetOpsiConfigurationRequest request) {
                                return client.getOpsiConfiguration(request);
                            }
                        },
                        new java.util.function.Predicate<GetOpsiConfigurationResponse>() {
                            @Override
                            public boolean test(GetOpsiConfigurationResponse response) {
                                return targetStatesSet.contains(
                                        response.getOpsiConfiguration().getLifecycleState());
                            }
                        },
                        targetStatesSet.contains(
                                com.oracle.bmc.opsi.model.OpsiConfigurationLifecycleState.Deleted)),
                request);
    }

    /**
     * Creates a new {@link com.oracle.bmc.waiter.Waiter} using default configuration.
     *
     * @param request the request to send
     * @return a new {@code Waiter} instance
     */
    public com.oracle.bmc.waiter.Waiter<GetWorkRequestRequest, GetWorkRequestResponse>
            forWorkRequest(GetWorkRequestRequest request) {
        return forWorkRequest(com.oracle.bmc.waiter.Waiters.DEFAULT_POLLING_WAITER, request);
    }

    /**
     * Creates a new {@link com.oracle.bmc.waiter.Waiter} using the provided configuration.
     *
     * @param request the request to send
     * @param terminationStrategy the {@link com.oracle.bmc.waiter.TerminationStrategy} to use
     * @param delayStrategy the {@linkcom.oracle.bmc.waiter. DelayStrategy} to use
     * @return a new {@code com.oracle.bmc.waiter.Waiter} instance
     */
    public com.oracle.bmc.waiter.Waiter<GetWorkRequestRequest, GetWorkRequestResponse>
            forWorkRequest(
                    GetWorkRequestRequest request,
                    com.oracle.bmc.waiter.TerminationStrategy terminationStrategy,
                    com.oracle.bmc.waiter.DelayStrategy delayStrategy) {
        return forWorkRequest(
                com.oracle.bmc.waiter.Waiters.newWaiter(terminationStrategy, delayStrategy),
                request);
    }

    // Helper method to create a new Waiter for WorkRequest.
    private com.oracle.bmc.waiter.Waiter<GetWorkRequestRequest, GetWorkRequestResponse>
            forWorkRequest(
                    com.oracle.bmc.waiter.BmcGenericWaiter waiter,
                    final GetWorkRequestRequest request) {
        return new com.oracle.bmc.waiter.internal.SimpleWaiterImpl<>(
                executorService,
                waiter.toCallable(
                        () -> request,
                        new java.util.function.Function<
                                GetWorkRequestRequest, GetWorkRequestResponse>() {
                            @Override
                            public GetWorkRequestResponse apply(GetWorkRequestRequest request) {
                                return client.getWorkRequest(request);
                            }
                        },
                        new java.util.function.Predicate<GetWorkRequestResponse>() {
                            @Override
                            public boolean test(GetWorkRequestResponse response) {
                                // work requests are complete once the time finished is available
                                return response.getWorkRequest().getTimeFinished() != null;
                            }
                        },
                        false),
                request);
    }
}
