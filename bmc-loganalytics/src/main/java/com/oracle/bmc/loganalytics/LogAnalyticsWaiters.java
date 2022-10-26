/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.loganalytics;

import com.oracle.bmc.loganalytics.requests.*;
import com.oracle.bmc.loganalytics.responses.*;

/**
 * Collection of helper methods to produce {@link com.oracle.bmc.waiter.Waiter}s for different
 * resources of LogAnalytics.
 *
 * <p>The default configuration used is defined by {@link
 * com.oracle.bmc.waiter.Waiters.Waiters#DEFAULT_POLLING_WAITER}.
 */
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200601")
public class LogAnalyticsWaiters {
    private final java.util.concurrent.ExecutorService executorService;
    private final LogAnalytics client;

    public LogAnalyticsWaiters(
            java.util.concurrent.ExecutorService executorService, LogAnalytics client) {
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
    public com.oracle.bmc.waiter.Waiter<GetIngestTimeRuleRequest, GetIngestTimeRuleResponse>
            forIngestTimeRule(
                    GetIngestTimeRuleRequest request,
                    com.oracle.bmc.loganalytics.model.ConfigLifecycleState... targetStates) {
        com.oracle.bmc.util.internal.Validate.notEmpty(
                targetStates, "At least one targetState must be provided");
        com.oracle.bmc.util.internal.Validate.noNullElements(
                targetStates, "Null targetState values are not permitted");

        return forIngestTimeRule(
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
    public com.oracle.bmc.waiter.Waiter<GetIngestTimeRuleRequest, GetIngestTimeRuleResponse>
            forIngestTimeRule(
                    GetIngestTimeRuleRequest request,
                    com.oracle.bmc.loganalytics.model.ConfigLifecycleState targetState,
                    com.oracle.bmc.waiter.TerminationStrategy terminationStrategy,
                    com.oracle.bmc.waiter.DelayStrategy delayStrategy) {
        com.oracle.bmc.util.internal.Validate.notNull(
                targetState, "The targetState cannot be null");

        return forIngestTimeRule(
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
    public com.oracle.bmc.waiter.Waiter<GetIngestTimeRuleRequest, GetIngestTimeRuleResponse>
            forIngestTimeRule(
                    GetIngestTimeRuleRequest request,
                    com.oracle.bmc.waiter.TerminationStrategy terminationStrategy,
                    com.oracle.bmc.waiter.DelayStrategy delayStrategy,
                    com.oracle.bmc.loganalytics.model.ConfigLifecycleState... targetStates) {
        com.oracle.bmc.util.internal.Validate.notEmpty(
                targetStates, "At least one targetState must be provided");
        com.oracle.bmc.util.internal.Validate.noNullElements(
                targetStates, "Null targetState values are not permitted");

        return forIngestTimeRule(
                com.oracle.bmc.waiter.Waiters.newWaiter(terminationStrategy, delayStrategy),
                request,
                targetStates);
    }

    // Helper method to create a new Waiter for IngestTimeRule.
    private com.oracle.bmc.waiter.Waiter<GetIngestTimeRuleRequest, GetIngestTimeRuleResponse>
            forIngestTimeRule(
                    com.oracle.bmc.waiter.BmcGenericWaiter waiter,
                    final GetIngestTimeRuleRequest request,
                    final com.oracle.bmc.loganalytics.model.ConfigLifecycleState... targetStates) {
        final java.util.Set<com.oracle.bmc.loganalytics.model.ConfigLifecycleState>
                targetStatesSet = new java.util.HashSet<>(java.util.Arrays.asList(targetStates));

        return new com.oracle.bmc.waiter.internal.SimpleWaiterImpl<>(
                executorService,
                waiter.toCallable(
                        () -> request,
                        new java.util.function.Function<
                                GetIngestTimeRuleRequest, GetIngestTimeRuleResponse>() {
                            @Override
                            public GetIngestTimeRuleResponse apply(
                                    GetIngestTimeRuleRequest request) {
                                return client.getIngestTimeRule(request);
                            }
                        },
                        new java.util.function.Predicate<GetIngestTimeRuleResponse>() {
                            @Override
                            public boolean test(GetIngestTimeRuleResponse response) {
                                return targetStatesSet.contains(
                                        response.getIngestTimeRule().getLifecycleState());
                            }
                        },
                        targetStatesSet.contains(
                                com.oracle.bmc.loganalytics.model.ConfigLifecycleState.Deleted)),
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
                    GetLogAnalyticsEmBridgeRequest, GetLogAnalyticsEmBridgeResponse>
            forLogAnalyticsEmBridge(
                    GetLogAnalyticsEmBridgeRequest request,
                    com.oracle.bmc.loganalytics.model.EmBridgeLifecycleStates... targetStates) {
        com.oracle.bmc.util.internal.Validate.notEmpty(
                targetStates, "At least one targetState must be provided");
        com.oracle.bmc.util.internal.Validate.noNullElements(
                targetStates, "Null targetState values are not permitted");

        return forLogAnalyticsEmBridge(
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
                    GetLogAnalyticsEmBridgeRequest, GetLogAnalyticsEmBridgeResponse>
            forLogAnalyticsEmBridge(
                    GetLogAnalyticsEmBridgeRequest request,
                    com.oracle.bmc.loganalytics.model.EmBridgeLifecycleStates targetState,
                    com.oracle.bmc.waiter.TerminationStrategy terminationStrategy,
                    com.oracle.bmc.waiter.DelayStrategy delayStrategy) {
        com.oracle.bmc.util.internal.Validate.notNull(
                targetState, "The targetState cannot be null");

        return forLogAnalyticsEmBridge(
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
                    GetLogAnalyticsEmBridgeRequest, GetLogAnalyticsEmBridgeResponse>
            forLogAnalyticsEmBridge(
                    GetLogAnalyticsEmBridgeRequest request,
                    com.oracle.bmc.waiter.TerminationStrategy terminationStrategy,
                    com.oracle.bmc.waiter.DelayStrategy delayStrategy,
                    com.oracle.bmc.loganalytics.model.EmBridgeLifecycleStates... targetStates) {
        com.oracle.bmc.util.internal.Validate.notEmpty(
                targetStates, "At least one targetState must be provided");
        com.oracle.bmc.util.internal.Validate.noNullElements(
                targetStates, "Null targetState values are not permitted");

        return forLogAnalyticsEmBridge(
                com.oracle.bmc.waiter.Waiters.newWaiter(terminationStrategy, delayStrategy),
                request,
                targetStates);
    }

    // Helper method to create a new Waiter for LogAnalyticsEmBridge.
    private com.oracle.bmc.waiter.Waiter<
                    GetLogAnalyticsEmBridgeRequest, GetLogAnalyticsEmBridgeResponse>
            forLogAnalyticsEmBridge(
                    com.oracle.bmc.waiter.BmcGenericWaiter waiter,
                    final GetLogAnalyticsEmBridgeRequest request,
                    final com.oracle.bmc.loganalytics.model.EmBridgeLifecycleStates...
                            targetStates) {
        final java.util.Set<com.oracle.bmc.loganalytics.model.EmBridgeLifecycleStates>
                targetStatesSet = new java.util.HashSet<>(java.util.Arrays.asList(targetStates));

        return new com.oracle.bmc.waiter.internal.SimpleWaiterImpl<>(
                executorService,
                waiter.toCallable(
                        () -> request,
                        new java.util.function.Function<
                                GetLogAnalyticsEmBridgeRequest, GetLogAnalyticsEmBridgeResponse>() {
                            @Override
                            public GetLogAnalyticsEmBridgeResponse apply(
                                    GetLogAnalyticsEmBridgeRequest request) {
                                return client.getLogAnalyticsEmBridge(request);
                            }
                        },
                        new java.util.function.Predicate<GetLogAnalyticsEmBridgeResponse>() {
                            @Override
                            public boolean test(GetLogAnalyticsEmBridgeResponse response) {
                                return targetStatesSet.contains(
                                        response.getLogAnalyticsEmBridge().getLifecycleState());
                            }
                        },
                        targetStatesSet.contains(
                                com.oracle.bmc.loganalytics.model.EmBridgeLifecycleStates.Deleted)),
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
    public com.oracle.bmc.waiter.Waiter<GetLogAnalyticsEntityRequest, GetLogAnalyticsEntityResponse>
            forLogAnalyticsEntity(
                    GetLogAnalyticsEntityRequest request,
                    com.oracle.bmc.loganalytics.model.EntityLifecycleStates... targetStates) {
        com.oracle.bmc.util.internal.Validate.notEmpty(
                targetStates, "At least one targetState must be provided");
        com.oracle.bmc.util.internal.Validate.noNullElements(
                targetStates, "Null targetState values are not permitted");

        return forLogAnalyticsEntity(
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
    public com.oracle.bmc.waiter.Waiter<GetLogAnalyticsEntityRequest, GetLogAnalyticsEntityResponse>
            forLogAnalyticsEntity(
                    GetLogAnalyticsEntityRequest request,
                    com.oracle.bmc.loganalytics.model.EntityLifecycleStates targetState,
                    com.oracle.bmc.waiter.TerminationStrategy terminationStrategy,
                    com.oracle.bmc.waiter.DelayStrategy delayStrategy) {
        com.oracle.bmc.util.internal.Validate.notNull(
                targetState, "The targetState cannot be null");

        return forLogAnalyticsEntity(
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
    public com.oracle.bmc.waiter.Waiter<GetLogAnalyticsEntityRequest, GetLogAnalyticsEntityResponse>
            forLogAnalyticsEntity(
                    GetLogAnalyticsEntityRequest request,
                    com.oracle.bmc.waiter.TerminationStrategy terminationStrategy,
                    com.oracle.bmc.waiter.DelayStrategy delayStrategy,
                    com.oracle.bmc.loganalytics.model.EntityLifecycleStates... targetStates) {
        com.oracle.bmc.util.internal.Validate.notEmpty(
                targetStates, "At least one targetState must be provided");
        com.oracle.bmc.util.internal.Validate.noNullElements(
                targetStates, "Null targetState values are not permitted");

        return forLogAnalyticsEntity(
                com.oracle.bmc.waiter.Waiters.newWaiter(terminationStrategy, delayStrategy),
                request,
                targetStates);
    }

    // Helper method to create a new Waiter for LogAnalyticsEntity.
    private com.oracle.bmc.waiter.Waiter<
                    GetLogAnalyticsEntityRequest, GetLogAnalyticsEntityResponse>
            forLogAnalyticsEntity(
                    com.oracle.bmc.waiter.BmcGenericWaiter waiter,
                    final GetLogAnalyticsEntityRequest request,
                    final com.oracle.bmc.loganalytics.model.EntityLifecycleStates... targetStates) {
        final java.util.Set<com.oracle.bmc.loganalytics.model.EntityLifecycleStates>
                targetStatesSet = new java.util.HashSet<>(java.util.Arrays.asList(targetStates));

        return new com.oracle.bmc.waiter.internal.SimpleWaiterImpl<>(
                executorService,
                waiter.toCallable(
                        () -> request,
                        new java.util.function.Function<
                                GetLogAnalyticsEntityRequest, GetLogAnalyticsEntityResponse>() {
                            @Override
                            public GetLogAnalyticsEntityResponse apply(
                                    GetLogAnalyticsEntityRequest request) {
                                return client.getLogAnalyticsEntity(request);
                            }
                        },
                        new java.util.function.Predicate<GetLogAnalyticsEntityResponse>() {
                            @Override
                            public boolean test(GetLogAnalyticsEntityResponse response) {
                                return targetStatesSet.contains(
                                        response.getLogAnalyticsEntity().getLifecycleState());
                            }
                        },
                        targetStatesSet.contains(
                                com.oracle.bmc.loganalytics.model.EntityLifecycleStates.Deleted)),
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
                    GetLogAnalyticsEntityTypeRequest, GetLogAnalyticsEntityTypeResponse>
            forLogAnalyticsEntityType(
                    GetLogAnalyticsEntityTypeRequest request,
                    com.oracle.bmc.loganalytics.model.EntityLifecycleStates... targetStates) {
        com.oracle.bmc.util.internal.Validate.notEmpty(
                targetStates, "At least one targetState must be provided");
        com.oracle.bmc.util.internal.Validate.noNullElements(
                targetStates, "Null targetState values are not permitted");

        return forLogAnalyticsEntityType(
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
                    GetLogAnalyticsEntityTypeRequest, GetLogAnalyticsEntityTypeResponse>
            forLogAnalyticsEntityType(
                    GetLogAnalyticsEntityTypeRequest request,
                    com.oracle.bmc.loganalytics.model.EntityLifecycleStates targetState,
                    com.oracle.bmc.waiter.TerminationStrategy terminationStrategy,
                    com.oracle.bmc.waiter.DelayStrategy delayStrategy) {
        com.oracle.bmc.util.internal.Validate.notNull(
                targetState, "The targetState cannot be null");

        return forLogAnalyticsEntityType(
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
                    GetLogAnalyticsEntityTypeRequest, GetLogAnalyticsEntityTypeResponse>
            forLogAnalyticsEntityType(
                    GetLogAnalyticsEntityTypeRequest request,
                    com.oracle.bmc.waiter.TerminationStrategy terminationStrategy,
                    com.oracle.bmc.waiter.DelayStrategy delayStrategy,
                    com.oracle.bmc.loganalytics.model.EntityLifecycleStates... targetStates) {
        com.oracle.bmc.util.internal.Validate.notEmpty(
                targetStates, "At least one targetState must be provided");
        com.oracle.bmc.util.internal.Validate.noNullElements(
                targetStates, "Null targetState values are not permitted");

        return forLogAnalyticsEntityType(
                com.oracle.bmc.waiter.Waiters.newWaiter(terminationStrategy, delayStrategy),
                request,
                targetStates);
    }

    // Helper method to create a new Waiter for LogAnalyticsEntityType.
    private com.oracle.bmc.waiter.Waiter<
                    GetLogAnalyticsEntityTypeRequest, GetLogAnalyticsEntityTypeResponse>
            forLogAnalyticsEntityType(
                    com.oracle.bmc.waiter.BmcGenericWaiter waiter,
                    final GetLogAnalyticsEntityTypeRequest request,
                    final com.oracle.bmc.loganalytics.model.EntityLifecycleStates... targetStates) {
        final java.util.Set<com.oracle.bmc.loganalytics.model.EntityLifecycleStates>
                targetStatesSet = new java.util.HashSet<>(java.util.Arrays.asList(targetStates));

        return new com.oracle.bmc.waiter.internal.SimpleWaiterImpl<>(
                executorService,
                waiter.toCallable(
                        () -> request,
                        new java.util.function.Function<
                                GetLogAnalyticsEntityTypeRequest,
                                GetLogAnalyticsEntityTypeResponse>() {
                            @Override
                            public GetLogAnalyticsEntityTypeResponse apply(
                                    GetLogAnalyticsEntityTypeRequest request) {
                                return client.getLogAnalyticsEntityType(request);
                            }
                        },
                        new java.util.function.Predicate<GetLogAnalyticsEntityTypeResponse>() {
                            @Override
                            public boolean test(GetLogAnalyticsEntityTypeResponse response) {
                                return targetStatesSet.contains(
                                        response.getLogAnalyticsEntityType().getLifecycleState());
                            }
                        },
                        targetStatesSet.contains(
                                com.oracle.bmc.loganalytics.model.EntityLifecycleStates.Deleted)),
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
                    GetLogAnalyticsObjectCollectionRuleRequest,
                    GetLogAnalyticsObjectCollectionRuleResponse>
            forLogAnalyticsObjectCollectionRule(
                    GetLogAnalyticsObjectCollectionRuleRequest request,
                    com.oracle.bmc.loganalytics.model.ObjectCollectionRuleLifecycleStates...
                            targetStates) {
        com.oracle.bmc.util.internal.Validate.notEmpty(
                targetStates, "At least one targetState must be provided");
        com.oracle.bmc.util.internal.Validate.noNullElements(
                targetStates, "Null targetState values are not permitted");

        return forLogAnalyticsObjectCollectionRule(
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
                    GetLogAnalyticsObjectCollectionRuleRequest,
                    GetLogAnalyticsObjectCollectionRuleResponse>
            forLogAnalyticsObjectCollectionRule(
                    GetLogAnalyticsObjectCollectionRuleRequest request,
                    com.oracle.bmc.loganalytics.model.ObjectCollectionRuleLifecycleStates
                            targetState,
                    com.oracle.bmc.waiter.TerminationStrategy terminationStrategy,
                    com.oracle.bmc.waiter.DelayStrategy delayStrategy) {
        com.oracle.bmc.util.internal.Validate.notNull(
                targetState, "The targetState cannot be null");

        return forLogAnalyticsObjectCollectionRule(
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
                    GetLogAnalyticsObjectCollectionRuleRequest,
                    GetLogAnalyticsObjectCollectionRuleResponse>
            forLogAnalyticsObjectCollectionRule(
                    GetLogAnalyticsObjectCollectionRuleRequest request,
                    com.oracle.bmc.waiter.TerminationStrategy terminationStrategy,
                    com.oracle.bmc.waiter.DelayStrategy delayStrategy,
                    com.oracle.bmc.loganalytics.model.ObjectCollectionRuleLifecycleStates...
                            targetStates) {
        com.oracle.bmc.util.internal.Validate.notEmpty(
                targetStates, "At least one targetState must be provided");
        com.oracle.bmc.util.internal.Validate.noNullElements(
                targetStates, "Null targetState values are not permitted");

        return forLogAnalyticsObjectCollectionRule(
                com.oracle.bmc.waiter.Waiters.newWaiter(terminationStrategy, delayStrategy),
                request,
                targetStates);
    }

    // Helper method to create a new Waiter for LogAnalyticsObjectCollectionRule.
    private com.oracle.bmc.waiter.Waiter<
                    GetLogAnalyticsObjectCollectionRuleRequest,
                    GetLogAnalyticsObjectCollectionRuleResponse>
            forLogAnalyticsObjectCollectionRule(
                    com.oracle.bmc.waiter.BmcGenericWaiter waiter,
                    final GetLogAnalyticsObjectCollectionRuleRequest request,
                    final com.oracle.bmc.loganalytics.model.ObjectCollectionRuleLifecycleStates...
                            targetStates) {
        final java.util.Set<com.oracle.bmc.loganalytics.model.ObjectCollectionRuleLifecycleStates>
                targetStatesSet = new java.util.HashSet<>(java.util.Arrays.asList(targetStates));

        return new com.oracle.bmc.waiter.internal.SimpleWaiterImpl<>(
                executorService,
                waiter.toCallable(
                        () -> request,
                        new java.util.function.Function<
                                GetLogAnalyticsObjectCollectionRuleRequest,
                                GetLogAnalyticsObjectCollectionRuleResponse>() {
                            @Override
                            public GetLogAnalyticsObjectCollectionRuleResponse apply(
                                    GetLogAnalyticsObjectCollectionRuleRequest request) {
                                return client.getLogAnalyticsObjectCollectionRule(request);
                            }
                        },
                        new java.util.function.Predicate<
                                GetLogAnalyticsObjectCollectionRuleResponse>() {
                            @Override
                            public boolean test(
                                    GetLogAnalyticsObjectCollectionRuleResponse response) {
                                return targetStatesSet.contains(
                                        response.getLogAnalyticsObjectCollectionRule()
                                                .getLifecycleState());
                            }
                        },
                        targetStatesSet.contains(
                                com.oracle.bmc.loganalytics.model
                                        .ObjectCollectionRuleLifecycleStates.Deleted)),
                request);
    }

    /**
     * Creates a new {@link com.oracle.bmc.waiter.Waiter} using default configuration.
     *
     * @param request the request to send
     * @return a new {@code Waiter} instance
     */
    public com.oracle.bmc.waiter.Waiter<GetQueryWorkRequestRequest, GetQueryWorkRequestResponse>
            forQueryWorkRequest(GetQueryWorkRequestRequest request) {
        return forQueryWorkRequest(com.oracle.bmc.waiter.Waiters.DEFAULT_POLLING_WAITER, request);
    }

    /**
     * Creates a new {@link com.oracle.bmc.waiter.Waiter} using the provided configuration.
     *
     * @param request the request to send
     * @param terminationStrategy the {@link com.oracle.bmc.waiter.TerminationStrategy} to use
     * @param delayStrategy the {@linkcom.oracle.bmc.waiter. DelayStrategy} to use
     * @return a new {@code com.oracle.bmc.waiter.Waiter} instance
     */
    public com.oracle.bmc.waiter.Waiter<GetQueryWorkRequestRequest, GetQueryWorkRequestResponse>
            forQueryWorkRequest(
                    GetQueryWorkRequestRequest request,
                    com.oracle.bmc.waiter.TerminationStrategy terminationStrategy,
                    com.oracle.bmc.waiter.DelayStrategy delayStrategy) {
        return forQueryWorkRequest(
                com.oracle.bmc.waiter.Waiters.newWaiter(terminationStrategy, delayStrategy),
                request);
    }

    // Helper method to create a new Waiter for QueryWorkRequest.
    private com.oracle.bmc.waiter.Waiter<GetQueryWorkRequestRequest, GetQueryWorkRequestResponse>
            forQueryWorkRequest(
                    com.oracle.bmc.waiter.BmcGenericWaiter waiter,
                    final GetQueryWorkRequestRequest request) {
        return new com.oracle.bmc.waiter.internal.SimpleWaiterImpl<>(
                executorService,
                waiter.toCallable(
                        () -> request,
                        new java.util.function.Function<
                                GetQueryWorkRequestRequest, GetQueryWorkRequestResponse>() {
                            @Override
                            public GetQueryWorkRequestResponse apply(
                                    GetQueryWorkRequestRequest request) {
                                return client.getQueryWorkRequest(request);
                            }
                        },
                        new java.util.function.Predicate<GetQueryWorkRequestResponse>() {
                            @Override
                            public boolean test(GetQueryWorkRequestResponse response) {
                                // work requests are complete once the time finished is available
                                return response.getQueryWorkRequest().getTimeFinished() != null;
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
    public com.oracle.bmc.waiter.Waiter<GetScheduledTaskRequest, GetScheduledTaskResponse>
            forScheduledTask(
                    GetScheduledTaskRequest request,
                    com.oracle.bmc.loganalytics.model.ScheduledTask.LifecycleState...
                            targetStates) {
        com.oracle.bmc.util.internal.Validate.notEmpty(
                targetStates, "At least one targetState must be provided");
        com.oracle.bmc.util.internal.Validate.noNullElements(
                targetStates, "Null targetState values are not permitted");

        return forScheduledTask(
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
    public com.oracle.bmc.waiter.Waiter<GetScheduledTaskRequest, GetScheduledTaskResponse>
            forScheduledTask(
                    GetScheduledTaskRequest request,
                    com.oracle.bmc.loganalytics.model.ScheduledTask.LifecycleState targetState,
                    com.oracle.bmc.waiter.TerminationStrategy terminationStrategy,
                    com.oracle.bmc.waiter.DelayStrategy delayStrategy) {
        com.oracle.bmc.util.internal.Validate.notNull(
                targetState, "The targetState cannot be null");

        return forScheduledTask(
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
    public com.oracle.bmc.waiter.Waiter<GetScheduledTaskRequest, GetScheduledTaskResponse>
            forScheduledTask(
                    GetScheduledTaskRequest request,
                    com.oracle.bmc.waiter.TerminationStrategy terminationStrategy,
                    com.oracle.bmc.waiter.DelayStrategy delayStrategy,
                    com.oracle.bmc.loganalytics.model.ScheduledTask.LifecycleState...
                            targetStates) {
        com.oracle.bmc.util.internal.Validate.notEmpty(
                targetStates, "At least one target state must be provided");
        com.oracle.bmc.util.internal.Validate.noNullElements(
                targetStates, "Null target states are not permitted");

        return forScheduledTask(
                com.oracle.bmc.waiter.Waiters.newWaiter(terminationStrategy, delayStrategy),
                request,
                targetStates);
    }

    // Helper method to create a new Waiter for ScheduledTask.
    private com.oracle.bmc.waiter.Waiter<GetScheduledTaskRequest, GetScheduledTaskResponse>
            forScheduledTask(
                    com.oracle.bmc.waiter.BmcGenericWaiter waiter,
                    final GetScheduledTaskRequest request,
                    final com.oracle.bmc.loganalytics.model.ScheduledTask.LifecycleState...
                            targetStates) {
        final java.util.Set<com.oracle.bmc.loganalytics.model.ScheduledTask.LifecycleState>
                targetStatesSet = new java.util.HashSet<>(java.util.Arrays.asList(targetStates));

        return new com.oracle.bmc.waiter.internal.SimpleWaiterImpl<>(
                executorService,
                waiter.toCallable(
                        () -> request,
                        new java.util.function.Function<
                                GetScheduledTaskRequest, GetScheduledTaskResponse>() {
                            @Override
                            public GetScheduledTaskResponse apply(GetScheduledTaskRequest request) {
                                return client.getScheduledTask(request);
                            }
                        },
                        new java.util.function.Predicate<GetScheduledTaskResponse>() {
                            @Override
                            public boolean test(GetScheduledTaskResponse response) {
                                return targetStatesSet.contains(
                                        response.getScheduledTask().getLifecycleState());
                            }
                        },
                        targetStatesSet.contains(
                                com.oracle.bmc.loganalytics.model.ScheduledTask.LifecycleState
                                        .Deleted)),
                request);
    }

    /**
     * Creates a new {@link com.oracle.bmc.waiter.Waiter} using default configuration.
     *
     * @param request the request to send
     * @return a new {@code Waiter} instance
     */
    public com.oracle.bmc.waiter.Waiter<GetStorageWorkRequestRequest, GetStorageWorkRequestResponse>
            forStorageWorkRequest(GetStorageWorkRequestRequest request) {
        return forStorageWorkRequest(com.oracle.bmc.waiter.Waiters.DEFAULT_POLLING_WAITER, request);
    }

    /**
     * Creates a new {@link com.oracle.bmc.waiter.Waiter} using the provided configuration.
     *
     * @param request the request to send
     * @param terminationStrategy the {@link com.oracle.bmc.waiter.TerminationStrategy} to use
     * @param delayStrategy the {@linkcom.oracle.bmc.waiter. DelayStrategy} to use
     * @return a new {@code com.oracle.bmc.waiter.Waiter} instance
     */
    public com.oracle.bmc.waiter.Waiter<GetStorageWorkRequestRequest, GetStorageWorkRequestResponse>
            forStorageWorkRequest(
                    GetStorageWorkRequestRequest request,
                    com.oracle.bmc.waiter.TerminationStrategy terminationStrategy,
                    com.oracle.bmc.waiter.DelayStrategy delayStrategy) {
        return forStorageWorkRequest(
                com.oracle.bmc.waiter.Waiters.newWaiter(terminationStrategy, delayStrategy),
                request);
    }

    // Helper method to create a new Waiter for StorageWorkRequest.
    private com.oracle.bmc.waiter.Waiter<
                    GetStorageWorkRequestRequest, GetStorageWorkRequestResponse>
            forStorageWorkRequest(
                    com.oracle.bmc.waiter.BmcGenericWaiter waiter,
                    final GetStorageWorkRequestRequest request) {
        return new com.oracle.bmc.waiter.internal.SimpleWaiterImpl<>(
                executorService,
                waiter.toCallable(
                        () -> request,
                        new java.util.function.Function<
                                GetStorageWorkRequestRequest, GetStorageWorkRequestResponse>() {
                            @Override
                            public GetStorageWorkRequestResponse apply(
                                    GetStorageWorkRequestRequest request) {
                                return client.getStorageWorkRequest(request);
                            }
                        },
                        new java.util.function.Predicate<GetStorageWorkRequestResponse>() {
                            @Override
                            public boolean test(GetStorageWorkRequestResponse response) {
                                // work requests are complete once the time finished is available
                                return response.getStorageWorkRequest().getTimeFinished() != null;
                            }
                        },
                        false),
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
