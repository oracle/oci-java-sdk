/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.stackmonitoring;

import com.oracle.bmc.stackmonitoring.requests.*;
import com.oracle.bmc.stackmonitoring.responses.*;

/**
 * Collection of helper methods to produce {@link com.oracle.bmc.waiter.Waiter}s for different
 * resources of StackMonitoring.
 *
 * <p>The default configuration used is defined by {@link
 * com.oracle.bmc.waiter.Waiters.Waiters#DEFAULT_POLLING_WAITER}.
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20210330")
public class StackMonitoringWaiters {
    private final java.util.concurrent.ExecutorService executorService;
    private final StackMonitoring client;

    public StackMonitoringWaiters(
            java.util.concurrent.ExecutorService executorService, StackMonitoring client) {
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
    public com.oracle.bmc.waiter.Waiter<GetBaselineableMetricRequest, GetBaselineableMetricResponse>
            forBaselineableMetric(
                    GetBaselineableMetricRequest request,
                    com.oracle.bmc.stackmonitoring.model.BaselineableMetricLifeCycleStates...
                            targetStates) {
        com.oracle.bmc.util.internal.Validate.notEmpty(
                targetStates, "At least one targetState must be provided");
        com.oracle.bmc.util.internal.Validate.noNullElements(
                targetStates, "Null targetState values are not permitted");

        return forBaselineableMetric(
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
    public com.oracle.bmc.waiter.Waiter<GetBaselineableMetricRequest, GetBaselineableMetricResponse>
            forBaselineableMetric(
                    GetBaselineableMetricRequest request,
                    com.oracle.bmc.stackmonitoring.model.BaselineableMetricLifeCycleStates
                            targetState,
                    com.oracle.bmc.waiter.TerminationStrategy terminationStrategy,
                    com.oracle.bmc.waiter.DelayStrategy delayStrategy) {
        com.oracle.bmc.util.internal.Validate.notNull(
                targetState, "The targetState cannot be null");

        return forBaselineableMetric(
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
    public com.oracle.bmc.waiter.Waiter<GetBaselineableMetricRequest, GetBaselineableMetricResponse>
            forBaselineableMetric(
                    GetBaselineableMetricRequest request,
                    com.oracle.bmc.waiter.TerminationStrategy terminationStrategy,
                    com.oracle.bmc.waiter.DelayStrategy delayStrategy,
                    com.oracle.bmc.stackmonitoring.model.BaselineableMetricLifeCycleStates...
                            targetStates) {
        com.oracle.bmc.util.internal.Validate.notEmpty(
                targetStates, "At least one targetState must be provided");
        com.oracle.bmc.util.internal.Validate.noNullElements(
                targetStates, "Null targetState values are not permitted");

        return forBaselineableMetric(
                com.oracle.bmc.waiter.Waiters.newWaiter(terminationStrategy, delayStrategy),
                request,
                targetStates);
    }

    // Helper method to create a new Waiter for BaselineableMetric.
    private com.oracle.bmc.waiter.Waiter<
                    GetBaselineableMetricRequest, GetBaselineableMetricResponse>
            forBaselineableMetric(
                    com.oracle.bmc.waiter.BmcGenericWaiter waiter,
                    final GetBaselineableMetricRequest request,
                    final com.oracle.bmc.stackmonitoring.model.BaselineableMetricLifeCycleStates...
                            targetStates) {
        final java.util.Set<com.oracle.bmc.stackmonitoring.model.BaselineableMetricLifeCycleStates>
                targetStatesSet = new java.util.HashSet<>(java.util.Arrays.asList(targetStates));

        return new com.oracle.bmc.waiter.internal.SimpleWaiterImpl<>(
                executorService,
                waiter.toCallable(
                        () -> request,
                        new java.util.function.Function<
                                GetBaselineableMetricRequest, GetBaselineableMetricResponse>() {
                            @Override
                            public GetBaselineableMetricResponse apply(
                                    GetBaselineableMetricRequest request) {
                                return client.getBaselineableMetric(request);
                            }
                        },
                        new java.util.function.Predicate<GetBaselineableMetricResponse>() {
                            @Override
                            public boolean test(GetBaselineableMetricResponse response) {
                                return targetStatesSet.contains(
                                        response.getBaselineableMetric().getLifecycleState());
                            }
                        },
                        targetStatesSet.contains(
                                com.oracle.bmc.stackmonitoring.model
                                        .BaselineableMetricLifeCycleStates.Deleted)),
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
    public com.oracle.bmc.waiter.Waiter<GetConfigRequest, GetConfigResponse> forConfig(
            GetConfigRequest request,
            com.oracle.bmc.stackmonitoring.model.Config.LifecycleState... targetStates) {
        com.oracle.bmc.util.internal.Validate.notEmpty(
                targetStates, "At least one targetState must be provided");
        com.oracle.bmc.util.internal.Validate.noNullElements(
                targetStates, "Null targetState values are not permitted");

        return forConfig(
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
    public com.oracle.bmc.waiter.Waiter<GetConfigRequest, GetConfigResponse> forConfig(
            GetConfigRequest request,
            com.oracle.bmc.stackmonitoring.model.Config.LifecycleState targetState,
            com.oracle.bmc.waiter.TerminationStrategy terminationStrategy,
            com.oracle.bmc.waiter.DelayStrategy delayStrategy) {
        com.oracle.bmc.util.internal.Validate.notNull(
                targetState, "The targetState cannot be null");

        return forConfig(
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
    public com.oracle.bmc.waiter.Waiter<GetConfigRequest, GetConfigResponse> forConfig(
            GetConfigRequest request,
            com.oracle.bmc.waiter.TerminationStrategy terminationStrategy,
            com.oracle.bmc.waiter.DelayStrategy delayStrategy,
            com.oracle.bmc.stackmonitoring.model.Config.LifecycleState... targetStates) {
        com.oracle.bmc.util.internal.Validate.notEmpty(
                targetStates, "At least one target state must be provided");
        com.oracle.bmc.util.internal.Validate.noNullElements(
                targetStates, "Null target states are not permitted");

        return forConfig(
                com.oracle.bmc.waiter.Waiters.newWaiter(terminationStrategy, delayStrategy),
                request,
                targetStates);
    }

    // Helper method to create a new Waiter for Config.
    private com.oracle.bmc.waiter.Waiter<GetConfigRequest, GetConfigResponse> forConfig(
            com.oracle.bmc.waiter.BmcGenericWaiter waiter,
            final GetConfigRequest request,
            final com.oracle.bmc.stackmonitoring.model.Config.LifecycleState... targetStates) {
        final java.util.Set<com.oracle.bmc.stackmonitoring.model.Config.LifecycleState>
                targetStatesSet = new java.util.HashSet<>(java.util.Arrays.asList(targetStates));

        return new com.oracle.bmc.waiter.internal.SimpleWaiterImpl<>(
                executorService,
                waiter.toCallable(
                        () -> request,
                        new java.util.function.Function<GetConfigRequest, GetConfigResponse>() {
                            @Override
                            public GetConfigResponse apply(GetConfigRequest request) {
                                return client.getConfig(request);
                            }
                        },
                        new java.util.function.Predicate<GetConfigResponse>() {
                            @Override
                            public boolean test(GetConfigResponse response) {
                                return targetStatesSet.contains(
                                        response.getConfig().getLifecycleState());
                            }
                        },
                        targetStatesSet.contains(
                                com.oracle.bmc.stackmonitoring.model.Config.LifecycleState
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
    public com.oracle.bmc.waiter.Waiter<GetDiscoveryJobRequest, GetDiscoveryJobResponse>
            forDiscoveryJob(
                    GetDiscoveryJobRequest request,
                    com.oracle.bmc.stackmonitoring.model.LifecycleState... targetStates) {
        com.oracle.bmc.util.internal.Validate.notEmpty(
                targetStates, "At least one targetState must be provided");
        com.oracle.bmc.util.internal.Validate.noNullElements(
                targetStates, "Null targetState values are not permitted");

        return forDiscoveryJob(
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
    public com.oracle.bmc.waiter.Waiter<GetDiscoveryJobRequest, GetDiscoveryJobResponse>
            forDiscoveryJob(
                    GetDiscoveryJobRequest request,
                    com.oracle.bmc.stackmonitoring.model.LifecycleState targetState,
                    com.oracle.bmc.waiter.TerminationStrategy terminationStrategy,
                    com.oracle.bmc.waiter.DelayStrategy delayStrategy) {
        com.oracle.bmc.util.internal.Validate.notNull(
                targetState, "The targetState cannot be null");

        return forDiscoveryJob(
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
    public com.oracle.bmc.waiter.Waiter<GetDiscoveryJobRequest, GetDiscoveryJobResponse>
            forDiscoveryJob(
                    GetDiscoveryJobRequest request,
                    com.oracle.bmc.waiter.TerminationStrategy terminationStrategy,
                    com.oracle.bmc.waiter.DelayStrategy delayStrategy,
                    com.oracle.bmc.stackmonitoring.model.LifecycleState... targetStates) {
        com.oracle.bmc.util.internal.Validate.notEmpty(
                targetStates, "At least one targetState must be provided");
        com.oracle.bmc.util.internal.Validate.noNullElements(
                targetStates, "Null targetState values are not permitted");

        return forDiscoveryJob(
                com.oracle.bmc.waiter.Waiters.newWaiter(terminationStrategy, delayStrategy),
                request,
                targetStates);
    }

    // Helper method to create a new Waiter for DiscoveryJob.
    private com.oracle.bmc.waiter.Waiter<GetDiscoveryJobRequest, GetDiscoveryJobResponse>
            forDiscoveryJob(
                    com.oracle.bmc.waiter.BmcGenericWaiter waiter,
                    final GetDiscoveryJobRequest request,
                    final com.oracle.bmc.stackmonitoring.model.LifecycleState... targetStates) {
        final java.util.Set<com.oracle.bmc.stackmonitoring.model.LifecycleState> targetStatesSet =
                new java.util.HashSet<>(java.util.Arrays.asList(targetStates));

        return new com.oracle.bmc.waiter.internal.SimpleWaiterImpl<>(
                executorService,
                waiter.toCallable(
                        () -> request,
                        new java.util.function.Function<
                                GetDiscoveryJobRequest, GetDiscoveryJobResponse>() {
                            @Override
                            public GetDiscoveryJobResponse apply(GetDiscoveryJobRequest request) {
                                return client.getDiscoveryJob(request);
                            }
                        },
                        new java.util.function.Predicate<GetDiscoveryJobResponse>() {
                            @Override
                            public boolean test(GetDiscoveryJobResponse response) {
                                return targetStatesSet.contains(
                                        response.getDiscoveryJob().getLifecycleState());
                            }
                        },
                        targetStatesSet.contains(
                                com.oracle.bmc.stackmonitoring.model.LifecycleState.Deleted)),
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
    public com.oracle.bmc.waiter.Waiter<GetMetricExtensionRequest, GetMetricExtensionResponse>
            forMetricExtension(
                    GetMetricExtensionRequest request,
                    com.oracle.bmc.stackmonitoring.model.MetricExtensionLifeCycleStates...
                            targetStates) {
        com.oracle.bmc.util.internal.Validate.notEmpty(
                targetStates, "At least one targetState must be provided");
        com.oracle.bmc.util.internal.Validate.noNullElements(
                targetStates, "Null targetState values are not permitted");

        return forMetricExtension(
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
    public com.oracle.bmc.waiter.Waiter<GetMetricExtensionRequest, GetMetricExtensionResponse>
            forMetricExtension(
                    GetMetricExtensionRequest request,
                    com.oracle.bmc.stackmonitoring.model.MetricExtensionLifeCycleStates targetState,
                    com.oracle.bmc.waiter.TerminationStrategy terminationStrategy,
                    com.oracle.bmc.waiter.DelayStrategy delayStrategy) {
        com.oracle.bmc.util.internal.Validate.notNull(
                targetState, "The targetState cannot be null");

        return forMetricExtension(
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
    public com.oracle.bmc.waiter.Waiter<GetMetricExtensionRequest, GetMetricExtensionResponse>
            forMetricExtension(
                    GetMetricExtensionRequest request,
                    com.oracle.bmc.waiter.TerminationStrategy terminationStrategy,
                    com.oracle.bmc.waiter.DelayStrategy delayStrategy,
                    com.oracle.bmc.stackmonitoring.model.MetricExtensionLifeCycleStates...
                            targetStates) {
        com.oracle.bmc.util.internal.Validate.notEmpty(
                targetStates, "At least one targetState must be provided");
        com.oracle.bmc.util.internal.Validate.noNullElements(
                targetStates, "Null targetState values are not permitted");

        return forMetricExtension(
                com.oracle.bmc.waiter.Waiters.newWaiter(terminationStrategy, delayStrategy),
                request,
                targetStates);
    }

    // Helper method to create a new Waiter for MetricExtension.
    private com.oracle.bmc.waiter.Waiter<GetMetricExtensionRequest, GetMetricExtensionResponse>
            forMetricExtension(
                    com.oracle.bmc.waiter.BmcGenericWaiter waiter,
                    final GetMetricExtensionRequest request,
                    final com.oracle.bmc.stackmonitoring.model.MetricExtensionLifeCycleStates...
                            targetStates) {
        final java.util.Set<com.oracle.bmc.stackmonitoring.model.MetricExtensionLifeCycleStates>
                targetStatesSet = new java.util.HashSet<>(java.util.Arrays.asList(targetStates));

        return new com.oracle.bmc.waiter.internal.SimpleWaiterImpl<>(
                executorService,
                waiter.toCallable(
                        () -> request,
                        new java.util.function.Function<
                                GetMetricExtensionRequest, GetMetricExtensionResponse>() {
                            @Override
                            public GetMetricExtensionResponse apply(
                                    GetMetricExtensionRequest request) {
                                return client.getMetricExtension(request);
                            }
                        },
                        new java.util.function.Predicate<GetMetricExtensionResponse>() {
                            @Override
                            public boolean test(GetMetricExtensionResponse response) {
                                return targetStatesSet.contains(
                                        response.getMetricExtension().getLifecycleState());
                            }
                        },
                        targetStatesSet.contains(
                                com.oracle.bmc.stackmonitoring.model.MetricExtensionLifeCycleStates
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
    public com.oracle.bmc.waiter.Waiter<GetMonitoredResourceRequest, GetMonitoredResourceResponse>
            forMonitoredResource(
                    GetMonitoredResourceRequest request,
                    com.oracle.bmc.stackmonitoring.model.ResourceLifecycleState... targetStates) {
        com.oracle.bmc.util.internal.Validate.notEmpty(
                targetStates, "At least one targetState must be provided");
        com.oracle.bmc.util.internal.Validate.noNullElements(
                targetStates, "Null targetState values are not permitted");

        return forMonitoredResource(
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
    public com.oracle.bmc.waiter.Waiter<GetMonitoredResourceRequest, GetMonitoredResourceResponse>
            forMonitoredResource(
                    GetMonitoredResourceRequest request,
                    com.oracle.bmc.stackmonitoring.model.ResourceLifecycleState targetState,
                    com.oracle.bmc.waiter.TerminationStrategy terminationStrategy,
                    com.oracle.bmc.waiter.DelayStrategy delayStrategy) {
        com.oracle.bmc.util.internal.Validate.notNull(
                targetState, "The targetState cannot be null");

        return forMonitoredResource(
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
    public com.oracle.bmc.waiter.Waiter<GetMonitoredResourceRequest, GetMonitoredResourceResponse>
            forMonitoredResource(
                    GetMonitoredResourceRequest request,
                    com.oracle.bmc.waiter.TerminationStrategy terminationStrategy,
                    com.oracle.bmc.waiter.DelayStrategy delayStrategy,
                    com.oracle.bmc.stackmonitoring.model.ResourceLifecycleState... targetStates) {
        com.oracle.bmc.util.internal.Validate.notEmpty(
                targetStates, "At least one targetState must be provided");
        com.oracle.bmc.util.internal.Validate.noNullElements(
                targetStates, "Null targetState values are not permitted");

        return forMonitoredResource(
                com.oracle.bmc.waiter.Waiters.newWaiter(terminationStrategy, delayStrategy),
                request,
                targetStates);
    }

    // Helper method to create a new Waiter for MonitoredResource.
    private com.oracle.bmc.waiter.Waiter<GetMonitoredResourceRequest, GetMonitoredResourceResponse>
            forMonitoredResource(
                    com.oracle.bmc.waiter.BmcGenericWaiter waiter,
                    final GetMonitoredResourceRequest request,
                    final com.oracle.bmc.stackmonitoring.model.ResourceLifecycleState...
                            targetStates) {
        final java.util.Set<com.oracle.bmc.stackmonitoring.model.ResourceLifecycleState>
                targetStatesSet = new java.util.HashSet<>(java.util.Arrays.asList(targetStates));

        return new com.oracle.bmc.waiter.internal.SimpleWaiterImpl<>(
                executorService,
                waiter.toCallable(
                        () -> request,
                        new java.util.function.Function<
                                GetMonitoredResourceRequest, GetMonitoredResourceResponse>() {
                            @Override
                            public GetMonitoredResourceResponse apply(
                                    GetMonitoredResourceRequest request) {
                                return client.getMonitoredResource(request);
                            }
                        },
                        new java.util.function.Predicate<GetMonitoredResourceResponse>() {
                            @Override
                            public boolean test(GetMonitoredResourceResponse response) {
                                return targetStatesSet.contains(
                                        response.getMonitoredResource().getLifecycleState());
                            }
                        },
                        targetStatesSet.contains(
                                com.oracle.bmc.stackmonitoring.model.ResourceLifecycleState
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
                    GetMonitoredResourceTaskRequest, GetMonitoredResourceTaskResponse>
            forMonitoredResourceTask(
                    GetMonitoredResourceTaskRequest request,
                    com.oracle.bmc.stackmonitoring.model.MonitoredResourceTaskLifecycleState...
                            targetStates) {
        com.oracle.bmc.util.internal.Validate.notEmpty(
                targetStates, "At least one targetState must be provided");
        com.oracle.bmc.util.internal.Validate.noNullElements(
                targetStates, "Null targetState values are not permitted");

        return forMonitoredResourceTask(
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
                    GetMonitoredResourceTaskRequest, GetMonitoredResourceTaskResponse>
            forMonitoredResourceTask(
                    GetMonitoredResourceTaskRequest request,
                    com.oracle.bmc.stackmonitoring.model.MonitoredResourceTaskLifecycleState
                            targetState,
                    com.oracle.bmc.waiter.TerminationStrategy terminationStrategy,
                    com.oracle.bmc.waiter.DelayStrategy delayStrategy) {
        com.oracle.bmc.util.internal.Validate.notNull(
                targetState, "The targetState cannot be null");

        return forMonitoredResourceTask(
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
                    GetMonitoredResourceTaskRequest, GetMonitoredResourceTaskResponse>
            forMonitoredResourceTask(
                    GetMonitoredResourceTaskRequest request,
                    com.oracle.bmc.waiter.TerminationStrategy terminationStrategy,
                    com.oracle.bmc.waiter.DelayStrategy delayStrategy,
                    com.oracle.bmc.stackmonitoring.model.MonitoredResourceTaskLifecycleState...
                            targetStates) {
        com.oracle.bmc.util.internal.Validate.notEmpty(
                targetStates, "At least one targetState must be provided");
        com.oracle.bmc.util.internal.Validate.noNullElements(
                targetStates, "Null targetState values are not permitted");

        return forMonitoredResourceTask(
                com.oracle.bmc.waiter.Waiters.newWaiter(terminationStrategy, delayStrategy),
                request,
                targetStates);
    }

    // Helper method to create a new Waiter for MonitoredResourceTask.
    private com.oracle.bmc.waiter.Waiter<
                    GetMonitoredResourceTaskRequest, GetMonitoredResourceTaskResponse>
            forMonitoredResourceTask(
                    com.oracle.bmc.waiter.BmcGenericWaiter waiter,
                    final GetMonitoredResourceTaskRequest request,
                    final com.oracle.bmc.stackmonitoring.model.MonitoredResourceTaskLifecycleState
                                    ...
                            targetStates) {
        final java.util.Set<
                        com.oracle.bmc.stackmonitoring.model.MonitoredResourceTaskLifecycleState>
                targetStatesSet = new java.util.HashSet<>(java.util.Arrays.asList(targetStates));

        return new com.oracle.bmc.waiter.internal.SimpleWaiterImpl<>(
                executorService,
                waiter.toCallable(
                        () -> request,
                        new java.util.function.Function<
                                GetMonitoredResourceTaskRequest,
                                GetMonitoredResourceTaskResponse>() {
                            @Override
                            public GetMonitoredResourceTaskResponse apply(
                                    GetMonitoredResourceTaskRequest request) {
                                return client.getMonitoredResourceTask(request);
                            }
                        },
                        new java.util.function.Predicate<GetMonitoredResourceTaskResponse>() {
                            @Override
                            public boolean test(GetMonitoredResourceTaskResponse response) {
                                return targetStatesSet.contains(
                                        response.getMonitoredResourceTask().getLifecycleState());
                            }
                        },
                        false),
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
                    GetMonitoredResourceTypeRequest, GetMonitoredResourceTypeResponse>
            forMonitoredResourceType(
                    GetMonitoredResourceTypeRequest request,
                    com.oracle.bmc.stackmonitoring.model.ResourceTypeLifecycleState...
                            targetStates) {
        com.oracle.bmc.util.internal.Validate.notEmpty(
                targetStates, "At least one targetState must be provided");
        com.oracle.bmc.util.internal.Validate.noNullElements(
                targetStates, "Null targetState values are not permitted");

        return forMonitoredResourceType(
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
                    GetMonitoredResourceTypeRequest, GetMonitoredResourceTypeResponse>
            forMonitoredResourceType(
                    GetMonitoredResourceTypeRequest request,
                    com.oracle.bmc.stackmonitoring.model.ResourceTypeLifecycleState targetState,
                    com.oracle.bmc.waiter.TerminationStrategy terminationStrategy,
                    com.oracle.bmc.waiter.DelayStrategy delayStrategy) {
        com.oracle.bmc.util.internal.Validate.notNull(
                targetState, "The targetState cannot be null");

        return forMonitoredResourceType(
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
                    GetMonitoredResourceTypeRequest, GetMonitoredResourceTypeResponse>
            forMonitoredResourceType(
                    GetMonitoredResourceTypeRequest request,
                    com.oracle.bmc.waiter.TerminationStrategy terminationStrategy,
                    com.oracle.bmc.waiter.DelayStrategy delayStrategy,
                    com.oracle.bmc.stackmonitoring.model.ResourceTypeLifecycleState...
                            targetStates) {
        com.oracle.bmc.util.internal.Validate.notEmpty(
                targetStates, "At least one targetState must be provided");
        com.oracle.bmc.util.internal.Validate.noNullElements(
                targetStates, "Null targetState values are not permitted");

        return forMonitoredResourceType(
                com.oracle.bmc.waiter.Waiters.newWaiter(terminationStrategy, delayStrategy),
                request,
                targetStates);
    }

    // Helper method to create a new Waiter for MonitoredResourceType.
    private com.oracle.bmc.waiter.Waiter<
                    GetMonitoredResourceTypeRequest, GetMonitoredResourceTypeResponse>
            forMonitoredResourceType(
                    com.oracle.bmc.waiter.BmcGenericWaiter waiter,
                    final GetMonitoredResourceTypeRequest request,
                    final com.oracle.bmc.stackmonitoring.model.ResourceTypeLifecycleState...
                            targetStates) {
        final java.util.Set<com.oracle.bmc.stackmonitoring.model.ResourceTypeLifecycleState>
                targetStatesSet = new java.util.HashSet<>(java.util.Arrays.asList(targetStates));

        return new com.oracle.bmc.waiter.internal.SimpleWaiterImpl<>(
                executorService,
                waiter.toCallable(
                        () -> request,
                        new java.util.function.Function<
                                GetMonitoredResourceTypeRequest,
                                GetMonitoredResourceTypeResponse>() {
                            @Override
                            public GetMonitoredResourceTypeResponse apply(
                                    GetMonitoredResourceTypeRequest request) {
                                return client.getMonitoredResourceType(request);
                            }
                        },
                        new java.util.function.Predicate<GetMonitoredResourceTypeResponse>() {
                            @Override
                            public boolean test(GetMonitoredResourceTypeResponse response) {
                                return targetStatesSet.contains(
                                        response.getMonitoredResourceType().getLifecycleState());
                            }
                        },
                        targetStatesSet.contains(
                                com.oracle.bmc.stackmonitoring.model.ResourceTypeLifecycleState
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
    public com.oracle.bmc.waiter.Waiter<GetProcessSetRequest, GetProcessSetResponse> forProcessSet(
            GetProcessSetRequest request,
            com.oracle.bmc.stackmonitoring.model.LifecycleState... targetStates) {
        com.oracle.bmc.util.internal.Validate.notEmpty(
                targetStates, "At least one targetState must be provided");
        com.oracle.bmc.util.internal.Validate.noNullElements(
                targetStates, "Null targetState values are not permitted");

        return forProcessSet(
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
    public com.oracle.bmc.waiter.Waiter<GetProcessSetRequest, GetProcessSetResponse> forProcessSet(
            GetProcessSetRequest request,
            com.oracle.bmc.stackmonitoring.model.LifecycleState targetState,
            com.oracle.bmc.waiter.TerminationStrategy terminationStrategy,
            com.oracle.bmc.waiter.DelayStrategy delayStrategy) {
        com.oracle.bmc.util.internal.Validate.notNull(
                targetState, "The targetState cannot be null");

        return forProcessSet(
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
    public com.oracle.bmc.waiter.Waiter<GetProcessSetRequest, GetProcessSetResponse> forProcessSet(
            GetProcessSetRequest request,
            com.oracle.bmc.waiter.TerminationStrategy terminationStrategy,
            com.oracle.bmc.waiter.DelayStrategy delayStrategy,
            com.oracle.bmc.stackmonitoring.model.LifecycleState... targetStates) {
        com.oracle.bmc.util.internal.Validate.notEmpty(
                targetStates, "At least one targetState must be provided");
        com.oracle.bmc.util.internal.Validate.noNullElements(
                targetStates, "Null targetState values are not permitted");

        return forProcessSet(
                com.oracle.bmc.waiter.Waiters.newWaiter(terminationStrategy, delayStrategy),
                request,
                targetStates);
    }

    // Helper method to create a new Waiter for ProcessSet.
    private com.oracle.bmc.waiter.Waiter<GetProcessSetRequest, GetProcessSetResponse> forProcessSet(
            com.oracle.bmc.waiter.BmcGenericWaiter waiter,
            final GetProcessSetRequest request,
            final com.oracle.bmc.stackmonitoring.model.LifecycleState... targetStates) {
        final java.util.Set<com.oracle.bmc.stackmonitoring.model.LifecycleState> targetStatesSet =
                new java.util.HashSet<>(java.util.Arrays.asList(targetStates));

        return new com.oracle.bmc.waiter.internal.SimpleWaiterImpl<>(
                executorService,
                waiter.toCallable(
                        () -> request,
                        new java.util.function.Function<
                                GetProcessSetRequest, GetProcessSetResponse>() {
                            @Override
                            public GetProcessSetResponse apply(GetProcessSetRequest request) {
                                return client.getProcessSet(request);
                            }
                        },
                        new java.util.function.Predicate<GetProcessSetResponse>() {
                            @Override
                            public boolean test(GetProcessSetResponse response) {
                                return targetStatesSet.contains(
                                        response.getProcessSet().getLifecycleState());
                            }
                        },
                        targetStatesSet.contains(
                                com.oracle.bmc.stackmonitoring.model.LifecycleState.Deleted)),
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
