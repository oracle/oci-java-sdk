/**
 * Copyright (c) 2016, 2020, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.loganalytics;

import com.oracle.bmc.loganalytics.requests.*;
import com.oracle.bmc.loganalytics.responses.*;

/**
 * Collection of helper methods to produce {@link com.oracle.bmc.waiter.Waiter}s for different
 * resources of LogAnalytics.
 * <p>
 * The default configuration used is defined by {@link com.oracle.bmc.waiter.Waiters.Waiters#DEFAULT_POLLING_WAITER}.
 */
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200601")
@lombok.RequiredArgsConstructor
public class LogAnalyticsWaiters {
    private final java.util.concurrent.ExecutorService executorService;
    private final LogAnalytics client;

    /**
     * Creates a new {@link com.oracle.bmc.waiter.Waiter} using the default configuration.
     *
     * @param request the request to send
     * @param targetState the desired states to wait for. If multiple states are provided then the waiter will return once the resource reaches any of the provided states
     * @return a new {@code com.oracle.bmc.waiter.Waiter} instance
     */
    public com.oracle.bmc.waiter.Waiter<GetLogAnalyticsEntityRequest, GetLogAnalyticsEntityResponse>
            forLogAnalyticsEntity(
                    GetLogAnalyticsEntityRequest request,
                    com.oracle.bmc.loganalytics.model.EntityLifecycleStates... targetStates) {
        org.apache.commons.lang3.Validate.notEmpty(
                targetStates, "At least one targetState must be provided");
        org.apache.commons.lang3.Validate.noNullElements(
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
        org.apache.commons.lang3.Validate.notNull(targetState, "The targetState cannot be null");

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
     * @param targetStates the desired states to wait for. The waiter will return once the resource reaches any of the provided states
     * @return a new {@code Waiter} instance
     */
    public com.oracle.bmc.waiter.Waiter<GetLogAnalyticsEntityRequest, GetLogAnalyticsEntityResponse>
            forLogAnalyticsEntity(
                    GetLogAnalyticsEntityRequest request,
                    com.oracle.bmc.waiter.TerminationStrategy terminationStrategy,
                    com.oracle.bmc.waiter.DelayStrategy delayStrategy,
                    com.oracle.bmc.loganalytics.model.EntityLifecycleStates... targetStates) {
        org.apache.commons.lang3.Validate.notEmpty(
                targetStates, "At least one targetState must be provided");
        org.apache.commons.lang3.Validate.noNullElements(
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
                        com.google.common.base.Suppliers.ofInstance(request),
                        new com.google.common.base.Function<
                                GetLogAnalyticsEntityRequest, GetLogAnalyticsEntityResponse>() {
                            @Override
                            public GetLogAnalyticsEntityResponse apply(
                                    GetLogAnalyticsEntityRequest request) {
                                return client.getLogAnalyticsEntity(request);
                            }
                        },
                        new com.google.common.base.Predicate<GetLogAnalyticsEntityResponse>() {
                            @Override
                            public boolean apply(GetLogAnalyticsEntityResponse response) {
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
     * @param targetState the desired states to wait for. If multiple states are provided then the waiter will return once the resource reaches any of the provided states
     * @return a new {@code com.oracle.bmc.waiter.Waiter} instance
     */
    public com.oracle.bmc.waiter.Waiter<
                    GetLogAnalyticsEntityTypeRequest, GetLogAnalyticsEntityTypeResponse>
            forLogAnalyticsEntityType(
                    GetLogAnalyticsEntityTypeRequest request,
                    com.oracle.bmc.loganalytics.model.EntityLifecycleStates... targetStates) {
        org.apache.commons.lang3.Validate.notEmpty(
                targetStates, "At least one targetState must be provided");
        org.apache.commons.lang3.Validate.noNullElements(
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
        org.apache.commons.lang3.Validate.notNull(targetState, "The targetState cannot be null");

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
     * @param targetStates the desired states to wait for. The waiter will return once the resource reaches any of the provided states
     * @return a new {@code Waiter} instance
     */
    public com.oracle.bmc.waiter.Waiter<
                    GetLogAnalyticsEntityTypeRequest, GetLogAnalyticsEntityTypeResponse>
            forLogAnalyticsEntityType(
                    GetLogAnalyticsEntityTypeRequest request,
                    com.oracle.bmc.waiter.TerminationStrategy terminationStrategy,
                    com.oracle.bmc.waiter.DelayStrategy delayStrategy,
                    com.oracle.bmc.loganalytics.model.EntityLifecycleStates... targetStates) {
        org.apache.commons.lang3.Validate.notEmpty(
                targetStates, "At least one targetState must be provided");
        org.apache.commons.lang3.Validate.noNullElements(
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
                        com.google.common.base.Suppliers.ofInstance(request),
                        new com.google.common.base.Function<
                                GetLogAnalyticsEntityTypeRequest,
                                GetLogAnalyticsEntityTypeResponse>() {
                            @Override
                            public GetLogAnalyticsEntityTypeResponse apply(
                                    GetLogAnalyticsEntityTypeRequest request) {
                                return client.getLogAnalyticsEntityType(request);
                            }
                        },
                        new com.google.common.base.Predicate<GetLogAnalyticsEntityTypeResponse>() {
                            @Override
                            public boolean apply(GetLogAnalyticsEntityTypeResponse response) {
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
     * @param targetStates the desired states to wait for. If multiple states are provided then the waiter will return once the resource reaches any of the provided states
     * @return a new {@code Waiter} instance
     */
    public com.oracle.bmc.waiter.Waiter<
                    GetLogAnalyticsObjectCollectionRuleRequest,
                    GetLogAnalyticsObjectCollectionRuleResponse>
            forLogAnalyticsObjectCollectionRule(
                    GetLogAnalyticsObjectCollectionRuleRequest request,
                    com.oracle.bmc.loganalytics.model.LogAnalyticsObjectCollectionRule
                                    .LifecycleState...
                            targetStates) {
        org.apache.commons.lang3.Validate.notEmpty(
                targetStates, "At least one targetState must be provided");
        org.apache.commons.lang3.Validate.noNullElements(
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
                    com.oracle.bmc.loganalytics.model.LogAnalyticsObjectCollectionRule
                                    .LifecycleState
                            targetState,
                    com.oracle.bmc.waiter.TerminationStrategy terminationStrategy,
                    com.oracle.bmc.waiter.DelayStrategy delayStrategy) {
        org.apache.commons.lang3.Validate.notNull(targetState, "The targetState cannot be null");

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
     * @param targetStates the desired states to wait for. The waiter will return once the resource reaches any of the provided states
     * @return a new {@code com.oracle.bmc.waiter.Waiter} instance
     */
    public com.oracle.bmc.waiter.Waiter<
                    GetLogAnalyticsObjectCollectionRuleRequest,
                    GetLogAnalyticsObjectCollectionRuleResponse>
            forLogAnalyticsObjectCollectionRule(
                    GetLogAnalyticsObjectCollectionRuleRequest request,
                    com.oracle.bmc.waiter.TerminationStrategy terminationStrategy,
                    com.oracle.bmc.waiter.DelayStrategy delayStrategy,
                    com.oracle.bmc.loganalytics.model.LogAnalyticsObjectCollectionRule
                                    .LifecycleState...
                            targetStates) {
        org.apache.commons.lang3.Validate.notEmpty(
                targetStates, "At least one target state must be provided");
        org.apache.commons.lang3.Validate.noNullElements(
                targetStates, "Null target states are not permitted");

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
                    final com.oracle.bmc.loganalytics.model.LogAnalyticsObjectCollectionRule
                                    .LifecycleState...
                            targetStates) {
        final java.util.Set<
                        com.oracle.bmc.loganalytics.model.LogAnalyticsObjectCollectionRule
                                .LifecycleState>
                targetStatesSet = new java.util.HashSet<>(java.util.Arrays.asList(targetStates));

        return new com.oracle.bmc.waiter.internal.SimpleWaiterImpl<>(
                executorService,
                waiter.toCallable(
                        com.google.common.base.Suppliers.ofInstance(request),
                        new com.google.common.base.Function<
                                GetLogAnalyticsObjectCollectionRuleRequest,
                                GetLogAnalyticsObjectCollectionRuleResponse>() {
                            @Override
                            public GetLogAnalyticsObjectCollectionRuleResponse apply(
                                    GetLogAnalyticsObjectCollectionRuleRequest request) {
                                return client.getLogAnalyticsObjectCollectionRule(request);
                            }
                        },
                        new com.google.common.base.Predicate<
                                GetLogAnalyticsObjectCollectionRuleResponse>() {
                            @Override
                            public boolean apply(
                                    GetLogAnalyticsObjectCollectionRuleResponse response) {
                                return targetStatesSet.contains(
                                        response.getLogAnalyticsObjectCollectionRule()
                                                .getLifecycleState());
                            }
                        },
                        targetStatesSet.contains(
                                com.oracle.bmc.loganalytics.model.LogAnalyticsObjectCollectionRule
                                        .LifecycleState.Deleted)),
                request);
    }

    /**
     * Creates a new {@link com.oracle.bmc.waiter.Waiter} using the default configuration.
     *
     * @param request the request to send
     * @param targetStates the desired states to wait for. If multiple states are provided then the waiter will return once the resource reaches any of the provided states
     * @return a new {@code Waiter} instance
     */
    public com.oracle.bmc.waiter.Waiter<GetScheduledTaskRequest, GetScheduledTaskResponse>
            forScheduledTask(
                    GetScheduledTaskRequest request,
                    com.oracle.bmc.loganalytics.model.ScheduledTask.LifecycleState...
                            targetStates) {
        org.apache.commons.lang3.Validate.notEmpty(
                targetStates, "At least one targetState must be provided");
        org.apache.commons.lang3.Validate.noNullElements(
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
        org.apache.commons.lang3.Validate.notNull(targetState, "The targetState cannot be null");

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
     * @param targetStates the desired states to wait for. The waiter will return once the resource reaches any of the provided states
     * @return a new {@code com.oracle.bmc.waiter.Waiter} instance
     */
    public com.oracle.bmc.waiter.Waiter<GetScheduledTaskRequest, GetScheduledTaskResponse>
            forScheduledTask(
                    GetScheduledTaskRequest request,
                    com.oracle.bmc.waiter.TerminationStrategy terminationStrategy,
                    com.oracle.bmc.waiter.DelayStrategy delayStrategy,
                    com.oracle.bmc.loganalytics.model.ScheduledTask.LifecycleState...
                            targetStates) {
        org.apache.commons.lang3.Validate.notEmpty(
                targetStates, "At least one target state must be provided");
        org.apache.commons.lang3.Validate.noNullElements(
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
                        com.google.common.base.Suppliers.ofInstance(request),
                        new com.google.common.base.Function<
                                GetScheduledTaskRequest, GetScheduledTaskResponse>() {
                            @Override
                            public GetScheduledTaskResponse apply(GetScheduledTaskRequest request) {
                                return client.getScheduledTask(request);
                            }
                        },
                        new com.google.common.base.Predicate<GetScheduledTaskResponse>() {
                            @Override
                            public boolean apply(GetScheduledTaskResponse response) {
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
