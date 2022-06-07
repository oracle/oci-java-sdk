/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.opsi;

import com.oracle.bmc.opsi.requests.*;
import com.oracle.bmc.opsi.responses.*;
import javax.annotation.Nonnull;

/**
 * Collection of helper methods to produce {@link com.oracle.bmc.waiter.Waiter}s for different
 * resources of OperationsInsights.
 * <p>
 * The default configuration used is defined by {@link com.oracle.bmc.waiter.Waiters.Waiters#DEFAULT_POLLING_WAITER}.
 */
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200630")
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
     * @param targetState the desired states to wait for. If multiple states are provided then the waiter will return once the resource reaches any of the provided states
     * @return a new {@code com.oracle.bmc.waiter.Waiter} instance
     */
    public com.oracle.bmc.waiter.Waiter<GetAwrHubRequest, GetAwrHubResponse> forAwrHub(
            GetAwrHubRequest request,
            com.oracle.bmc.opsi.model.AwrHubLifecycleState... targetStates) {
        org.apache.commons.lang3.Validate.notEmpty(
                targetStates, "At least one targetState must be provided");
        org.apache.commons.lang3.Validate.noNullElements(
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
        org.apache.commons.lang3.Validate.notNull(targetState, "The targetState cannot be null");

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
     * @param targetStates the desired states to wait for. The waiter will return once the resource reaches any of the provided states
     * @return a new {@code Waiter} instance
     */
    public com.oracle.bmc.waiter.Waiter<GetAwrHubRequest, GetAwrHubResponse> forAwrHub(
            GetAwrHubRequest request,
            com.oracle.bmc.waiter.TerminationStrategy terminationStrategy,
            com.oracle.bmc.waiter.DelayStrategy delayStrategy,
            com.oracle.bmc.opsi.model.AwrHubLifecycleState... targetStates) {
        org.apache.commons.lang3.Validate.notEmpty(
                targetStates, "At least one targetState must be provided");
        org.apache.commons.lang3.Validate.noNullElements(
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
                        com.google.common.base.Suppliers.ofInstance(request),
                        new com.google.common.base.Function<GetAwrHubRequest, GetAwrHubResponse>() {
                            @Override
                            public GetAwrHubResponse apply(GetAwrHubRequest request) {
                                return client.getAwrHub(request);
                            }
                        },
                        new com.google.common.base.Predicate<GetAwrHubResponse>() {
                            @Override
                            public boolean apply(GetAwrHubResponse response) {
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
     * @param targetState the desired states to wait for. If multiple states are provided then the waiter will return once the resource reaches any of the provided states
     * @return a new {@code com.oracle.bmc.waiter.Waiter} instance
     */
    public com.oracle.bmc.waiter.Waiter<GetDatabaseInsightRequest, GetDatabaseInsightResponse>
            forDatabaseInsight(
                    GetDatabaseInsightRequest request,
                    com.oracle.bmc.opsi.model.LifecycleState... targetStates) {
        org.apache.commons.lang3.Validate.notEmpty(
                targetStates, "At least one targetState must be provided");
        org.apache.commons.lang3.Validate.noNullElements(
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
        org.apache.commons.lang3.Validate.notNull(targetState, "The targetState cannot be null");

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
     * @param targetStates the desired states to wait for. The waiter will return once the resource reaches any of the provided states
     * @return a new {@code Waiter} instance
     */
    public com.oracle.bmc.waiter.Waiter<GetDatabaseInsightRequest, GetDatabaseInsightResponse>
            forDatabaseInsight(
                    GetDatabaseInsightRequest request,
                    com.oracle.bmc.waiter.TerminationStrategy terminationStrategy,
                    com.oracle.bmc.waiter.DelayStrategy delayStrategy,
                    com.oracle.bmc.opsi.model.LifecycleState... targetStates) {
        org.apache.commons.lang3.Validate.notEmpty(
                targetStates, "At least one targetState must be provided");
        org.apache.commons.lang3.Validate.noNullElements(
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
                        com.google.common.base.Suppliers.ofInstance(request),
                        new com.google.common.base.Function<
                                GetDatabaseInsightRequest, GetDatabaseInsightResponse>() {
                            @Override
                            public GetDatabaseInsightResponse apply(
                                    GetDatabaseInsightRequest request) {
                                return client.getDatabaseInsight(request);
                            }
                        },
                        new com.google.common.base.Predicate<GetDatabaseInsightResponse>() {
                            @Override
                            public boolean apply(GetDatabaseInsightResponse response) {
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
     * @param targetState the desired states to wait for. If multiple states are provided then the waiter will return once the resource reaches any of the provided states
     * @return a new {@code com.oracle.bmc.waiter.Waiter} instance
     */
    public com.oracle.bmc.waiter.Waiter<
                    GetEnterpriseManagerBridgeRequest, GetEnterpriseManagerBridgeResponse>
            forEnterpriseManagerBridge(
                    GetEnterpriseManagerBridgeRequest request,
                    com.oracle.bmc.opsi.model.LifecycleState... targetStates) {
        org.apache.commons.lang3.Validate.notEmpty(
                targetStates, "At least one targetState must be provided");
        org.apache.commons.lang3.Validate.noNullElements(
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
        org.apache.commons.lang3.Validate.notNull(targetState, "The targetState cannot be null");

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
     * @param targetStates the desired states to wait for. The waiter will return once the resource reaches any of the provided states
     * @return a new {@code Waiter} instance
     */
    public com.oracle.bmc.waiter.Waiter<
                    GetEnterpriseManagerBridgeRequest, GetEnterpriseManagerBridgeResponse>
            forEnterpriseManagerBridge(
                    GetEnterpriseManagerBridgeRequest request,
                    com.oracle.bmc.waiter.TerminationStrategy terminationStrategy,
                    com.oracle.bmc.waiter.DelayStrategy delayStrategy,
                    com.oracle.bmc.opsi.model.LifecycleState... targetStates) {
        org.apache.commons.lang3.Validate.notEmpty(
                targetStates, "At least one targetState must be provided");
        org.apache.commons.lang3.Validate.noNullElements(
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
                        com.google.common.base.Suppliers.ofInstance(request),
                        new com.google.common.base.Function<
                                GetEnterpriseManagerBridgeRequest,
                                GetEnterpriseManagerBridgeResponse>() {
                            @Override
                            public GetEnterpriseManagerBridgeResponse apply(
                                    GetEnterpriseManagerBridgeRequest request) {
                                return client.getEnterpriseManagerBridge(request);
                            }
                        },
                        new com.google.common.base.Predicate<GetEnterpriseManagerBridgeResponse>() {
                            @Override
                            public boolean apply(GetEnterpriseManagerBridgeResponse response) {
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
     * @param targetState the desired states to wait for. If multiple states are provided then the waiter will return once the resource reaches any of the provided states
     * @return a new {@code com.oracle.bmc.waiter.Waiter} instance
     */
    public com.oracle.bmc.waiter.Waiter<GetExadataInsightRequest, GetExadataInsightResponse>
            forExadataInsight(
                    GetExadataInsightRequest request,
                    com.oracle.bmc.opsi.model.ExadataInsightLifecycleState... targetStates) {
        org.apache.commons.lang3.Validate.notEmpty(
                targetStates, "At least one targetState must be provided");
        org.apache.commons.lang3.Validate.noNullElements(
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
        org.apache.commons.lang3.Validate.notNull(targetState, "The targetState cannot be null");

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
     * @param targetStates the desired states to wait for. The waiter will return once the resource reaches any of the provided states
     * @return a new {@code Waiter} instance
     */
    public com.oracle.bmc.waiter.Waiter<GetExadataInsightRequest, GetExadataInsightResponse>
            forExadataInsight(
                    GetExadataInsightRequest request,
                    com.oracle.bmc.waiter.TerminationStrategy terminationStrategy,
                    com.oracle.bmc.waiter.DelayStrategy delayStrategy,
                    com.oracle.bmc.opsi.model.ExadataInsightLifecycleState... targetStates) {
        org.apache.commons.lang3.Validate.notEmpty(
                targetStates, "At least one targetState must be provided");
        org.apache.commons.lang3.Validate.noNullElements(
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
                        com.google.common.base.Suppliers.ofInstance(request),
                        new com.google.common.base.Function<
                                GetExadataInsightRequest, GetExadataInsightResponse>() {
                            @Override
                            public GetExadataInsightResponse apply(
                                    GetExadataInsightRequest request) {
                                return client.getExadataInsight(request);
                            }
                        },
                        new com.google.common.base.Predicate<GetExadataInsightResponse>() {
                            @Override
                            public boolean apply(GetExadataInsightResponse response) {
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
     * @param targetState the desired states to wait for. If multiple states are provided then the waiter will return once the resource reaches any of the provided states
     * @return a new {@code com.oracle.bmc.waiter.Waiter} instance
     */
    public com.oracle.bmc.waiter.Waiter<GetHostInsightRequest, GetHostInsightResponse>
            forHostInsight(
                    GetHostInsightRequest request,
                    com.oracle.bmc.opsi.model.LifecycleState... targetStates) {
        org.apache.commons.lang3.Validate.notEmpty(
                targetStates, "At least one targetState must be provided");
        org.apache.commons.lang3.Validate.noNullElements(
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
        org.apache.commons.lang3.Validate.notNull(targetState, "The targetState cannot be null");

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
     * @param targetStates the desired states to wait for. The waiter will return once the resource reaches any of the provided states
     * @return a new {@code Waiter} instance
     */
    public com.oracle.bmc.waiter.Waiter<GetHostInsightRequest, GetHostInsightResponse>
            forHostInsight(
                    GetHostInsightRequest request,
                    com.oracle.bmc.waiter.TerminationStrategy terminationStrategy,
                    com.oracle.bmc.waiter.DelayStrategy delayStrategy,
                    com.oracle.bmc.opsi.model.LifecycleState... targetStates) {
        org.apache.commons.lang3.Validate.notEmpty(
                targetStates, "At least one targetState must be provided");
        org.apache.commons.lang3.Validate.noNullElements(
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
                        com.google.common.base.Suppliers.ofInstance(request),
                        new com.google.common.base.Function<
                                GetHostInsightRequest, GetHostInsightResponse>() {
                            @Override
                            public GetHostInsightResponse apply(GetHostInsightRequest request) {
                                return client.getHostInsight(request);
                            }
                        },
                        new com.google.common.base.Predicate<GetHostInsightResponse>() {
                            @Override
                            public boolean apply(GetHostInsightResponse response) {
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
     * @param targetState the desired states to wait for. If multiple states are provided then the waiter will return once the resource reaches any of the provided states
     * @return a new {@code com.oracle.bmc.waiter.Waiter} instance
     */
    public com.oracle.bmc.waiter.Waiter<
                    GetOperationsInsightsPrivateEndpointRequest,
                    GetOperationsInsightsPrivateEndpointResponse>
            forOperationsInsightsPrivateEndpoint(
                    GetOperationsInsightsPrivateEndpointRequest request,
                    com.oracle.bmc.opsi.model.OperationsInsightsPrivateEndpointLifecycleState...
                            targetStates) {
        org.apache.commons.lang3.Validate.notEmpty(
                targetStates, "At least one targetState must be provided");
        org.apache.commons.lang3.Validate.noNullElements(
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
        org.apache.commons.lang3.Validate.notNull(targetState, "The targetState cannot be null");

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
     * @param targetStates the desired states to wait for. The waiter will return once the resource reaches any of the provided states
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
        org.apache.commons.lang3.Validate.notEmpty(
                targetStates, "At least one targetState must be provided");
        org.apache.commons.lang3.Validate.noNullElements(
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
                    final com.oracle.bmc.opsi.model
                                    .OperationsInsightsPrivateEndpointLifecycleState...
                            targetStates) {
        final java.util.Set<
                        com.oracle.bmc.opsi.model.OperationsInsightsPrivateEndpointLifecycleState>
                targetStatesSet = new java.util.HashSet<>(java.util.Arrays.asList(targetStates));

        return new com.oracle.bmc.waiter.internal.SimpleWaiterImpl<>(
                executorService,
                waiter.toCallable(
                        com.google.common.base.Suppliers.ofInstance(request),
                        new com.google.common.base.Function<
                                GetOperationsInsightsPrivateEndpointRequest,
                                GetOperationsInsightsPrivateEndpointResponse>() {
                            @Override
                            public GetOperationsInsightsPrivateEndpointResponse apply(
                                    GetOperationsInsightsPrivateEndpointRequest request) {
                                return client.getOperationsInsightsPrivateEndpoint(request);
                            }
                        },
                        new com.google.common.base.Predicate<
                                GetOperationsInsightsPrivateEndpointResponse>() {
                            @Override
                            public boolean apply(
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
     * @param targetState the desired states to wait for. If multiple states are provided then the waiter will return once the resource reaches any of the provided states
     * @return a new {@code com.oracle.bmc.waiter.Waiter} instance
     */
    public com.oracle.bmc.waiter.Waiter<
                    GetOperationsInsightsWarehouseRequest, GetOperationsInsightsWarehouseResponse>
            forOperationsInsightsWarehouse(
                    GetOperationsInsightsWarehouseRequest request,
                    com.oracle.bmc.opsi.model.OperationsInsightsWarehouseLifecycleState...
                            targetStates) {
        org.apache.commons.lang3.Validate.notEmpty(
                targetStates, "At least one targetState must be provided");
        org.apache.commons.lang3.Validate.noNullElements(
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
        org.apache.commons.lang3.Validate.notNull(targetState, "The targetState cannot be null");

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
     * @param targetStates the desired states to wait for. The waiter will return once the resource reaches any of the provided states
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
        org.apache.commons.lang3.Validate.notEmpty(
                targetStates, "At least one targetState must be provided");
        org.apache.commons.lang3.Validate.noNullElements(
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
                        com.google.common.base.Suppliers.ofInstance(request),
                        new com.google.common.base.Function<
                                GetOperationsInsightsWarehouseRequest,
                                GetOperationsInsightsWarehouseResponse>() {
                            @Override
                            public GetOperationsInsightsWarehouseResponse apply(
                                    GetOperationsInsightsWarehouseRequest request) {
                                return client.getOperationsInsightsWarehouse(request);
                            }
                        },
                        new com.google.common.base.Predicate<
                                GetOperationsInsightsWarehouseResponse>() {
                            @Override
                            public boolean apply(GetOperationsInsightsWarehouseResponse response) {
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
     * @param targetState the desired states to wait for. If multiple states are provided then the waiter will return once the resource reaches any of the provided states
     * @return a new {@code com.oracle.bmc.waiter.Waiter} instance
     */
    public com.oracle.bmc.waiter.Waiter<
                    GetOperationsInsightsWarehouseUserRequest,
                    GetOperationsInsightsWarehouseUserResponse>
            forOperationsInsightsWarehouseUser(
                    GetOperationsInsightsWarehouseUserRequest request,
                    com.oracle.bmc.opsi.model.OperationsInsightsWarehouseUserLifecycleState...
                            targetStates) {
        org.apache.commons.lang3.Validate.notEmpty(
                targetStates, "At least one targetState must be provided");
        org.apache.commons.lang3.Validate.noNullElements(
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
        org.apache.commons.lang3.Validate.notNull(targetState, "The targetState cannot be null");

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
     * @param targetStates the desired states to wait for. The waiter will return once the resource reaches any of the provided states
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
        org.apache.commons.lang3.Validate.notEmpty(
                targetStates, "At least one targetState must be provided");
        org.apache.commons.lang3.Validate.noNullElements(
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
                        com.google.common.base.Suppliers.ofInstance(request),
                        new com.google.common.base.Function<
                                GetOperationsInsightsWarehouseUserRequest,
                                GetOperationsInsightsWarehouseUserResponse>() {
                            @Override
                            public GetOperationsInsightsWarehouseUserResponse apply(
                                    GetOperationsInsightsWarehouseUserRequest request) {
                                return client.getOperationsInsightsWarehouseUser(request);
                            }
                        },
                        new com.google.common.base.Predicate<
                                GetOperationsInsightsWarehouseUserResponse>() {
                            @Override
                            public boolean apply(
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
                        com.google.common.base.Suppliers.ofInstance(request),
                        new com.google.common.base.Function<
                                GetWorkRequestRequest, GetWorkRequestResponse>() {
                            @Override
                            public GetWorkRequestResponse apply(GetWorkRequestRequest request) {
                                return client.getWorkRequest(request);
                            }
                        },
                        new com.google.common.base.Predicate<GetWorkRequestResponse>() {
                            @Override
                            public boolean apply(GetWorkRequestResponse response) {
                                // work requests are complete once the time finished is available
                                return response.getWorkRequest().getTimeFinished() != null;
                            }
                        },
                        false),
                request);
    }
}
