/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.datacc;

import com.oracle.bmc.datacc.requests.*;
import com.oracle.bmc.datacc.responses.*;

/**
 * Collection of helper methods to produce {@link com.oracle.bmc.waiter.Waiter}s for different
 * resources of Baseinfra.
 *
 * <p>The default configuration used is defined by {@link
 * com.oracle.bmc.waiter.Waiters.Waiters#DEFAULT_POLLING_WAITER}.
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20251101")
public class BaseinfraWaiters {
    private final java.util.concurrent.ExecutorService executorService;
    private final Baseinfra client;

    public BaseinfraWaiters(
            java.util.concurrent.ExecutorService executorService, Baseinfra client) {
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
    public com.oracle.bmc.waiter.Waiter<GetInfrastructureRequest, GetInfrastructureResponse>
            forInfrastructure(
                    GetInfrastructureRequest request,
                    com.oracle.bmc.datacc.model.InfrastructureLifecycleState... targetStates) {
        com.oracle.bmc.util.internal.Validate.notEmpty(
                targetStates, "At least one targetState must be provided");
        com.oracle.bmc.util.internal.Validate.noNullElements(
                targetStates, "Null targetState values are not permitted");

        return forInfrastructure(
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
    public com.oracle.bmc.waiter.Waiter<GetInfrastructureRequest, GetInfrastructureResponse>
            forInfrastructure(
                    GetInfrastructureRequest request,
                    com.oracle.bmc.datacc.model.InfrastructureLifecycleState targetState,
                    com.oracle.bmc.waiter.TerminationStrategy terminationStrategy,
                    com.oracle.bmc.waiter.DelayStrategy delayStrategy) {
        com.oracle.bmc.util.internal.Validate.notNull(
                targetState, "The targetState cannot be null");

        return forInfrastructure(
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
    public com.oracle.bmc.waiter.Waiter<GetInfrastructureRequest, GetInfrastructureResponse>
            forInfrastructure(
                    GetInfrastructureRequest request,
                    com.oracle.bmc.waiter.TerminationStrategy terminationStrategy,
                    com.oracle.bmc.waiter.DelayStrategy delayStrategy,
                    com.oracle.bmc.datacc.model.InfrastructureLifecycleState... targetStates) {
        com.oracle.bmc.util.internal.Validate.notEmpty(
                targetStates, "At least one targetState must be provided");
        com.oracle.bmc.util.internal.Validate.noNullElements(
                targetStates, "Null targetState values are not permitted");

        return forInfrastructure(
                com.oracle.bmc.waiter.Waiters.newWaiter(terminationStrategy, delayStrategy),
                request,
                targetStates);
    }

    // Helper method to create a new Waiter for Infrastructure.
    private com.oracle.bmc.waiter.Waiter<GetInfrastructureRequest, GetInfrastructureResponse>
            forInfrastructure(
                    com.oracle.bmc.waiter.BmcGenericWaiter waiter,
                    final GetInfrastructureRequest request,
                    final com.oracle.bmc.datacc.model.InfrastructureLifecycleState...
                            targetStates) {
        final java.util.Set<com.oracle.bmc.datacc.model.InfrastructureLifecycleState>
                targetStatesSet = new java.util.HashSet<>(java.util.Arrays.asList(targetStates));

        return new com.oracle.bmc.waiter.internal.SimpleWaiterImpl<>(
                executorService,
                waiter.toCallable(
                        () -> request,
                        new java.util.function.Function<
                                GetInfrastructureRequest, GetInfrastructureResponse>() {
                            @Override
                            public GetInfrastructureResponse apply(
                                    GetInfrastructureRequest request) {
                                return client.getInfrastructure(request);
                            }
                        },
                        new java.util.function.Predicate<GetInfrastructureResponse>() {
                            @Override
                            public boolean test(GetInfrastructureResponse response) {
                                return targetStatesSet.contains(
                                        response.getInfrastructure().getLifecycleState());
                            }
                        },
                        targetStatesSet.contains(
                                com.oracle.bmc.datacc.model.InfrastructureLifecycleState.Deleted)),
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
                    GetMaintenanceExecutionRequest, GetMaintenanceExecutionResponse>
            forMaintenanceExecution(
                    GetMaintenanceExecutionRequest request,
                    com.oracle.bmc.datacc.model.MaintenanceRunLifecycleState... targetStates) {
        com.oracle.bmc.util.internal.Validate.notEmpty(
                targetStates, "At least one targetState must be provided");
        com.oracle.bmc.util.internal.Validate.noNullElements(
                targetStates, "Null targetState values are not permitted");

        return forMaintenanceExecution(
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
                    GetMaintenanceExecutionRequest, GetMaintenanceExecutionResponse>
            forMaintenanceExecution(
                    GetMaintenanceExecutionRequest request,
                    com.oracle.bmc.datacc.model.MaintenanceRunLifecycleState targetState,
                    com.oracle.bmc.waiter.TerminationStrategy terminationStrategy,
                    com.oracle.bmc.waiter.DelayStrategy delayStrategy) {
        com.oracle.bmc.util.internal.Validate.notNull(
                targetState, "The targetState cannot be null");

        return forMaintenanceExecution(
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
                    GetMaintenanceExecutionRequest, GetMaintenanceExecutionResponse>
            forMaintenanceExecution(
                    GetMaintenanceExecutionRequest request,
                    com.oracle.bmc.waiter.TerminationStrategy terminationStrategy,
                    com.oracle.bmc.waiter.DelayStrategy delayStrategy,
                    com.oracle.bmc.datacc.model.MaintenanceRunLifecycleState... targetStates) {
        com.oracle.bmc.util.internal.Validate.notEmpty(
                targetStates, "At least one targetState must be provided");
        com.oracle.bmc.util.internal.Validate.noNullElements(
                targetStates, "Null targetState values are not permitted");

        return forMaintenanceExecution(
                com.oracle.bmc.waiter.Waiters.newWaiter(terminationStrategy, delayStrategy),
                request,
                targetStates);
    }

    // Helper method to create a new Waiter for MaintenanceExecution.
    private com.oracle.bmc.waiter.Waiter<
                    GetMaintenanceExecutionRequest, GetMaintenanceExecutionResponse>
            forMaintenanceExecution(
                    com.oracle.bmc.waiter.BmcGenericWaiter waiter,
                    final GetMaintenanceExecutionRequest request,
                    final com.oracle.bmc.datacc.model.MaintenanceRunLifecycleState...
                            targetStates) {
        final java.util.Set<com.oracle.bmc.datacc.model.MaintenanceRunLifecycleState>
                targetStatesSet = new java.util.HashSet<>(java.util.Arrays.asList(targetStates));

        return new com.oracle.bmc.waiter.internal.SimpleWaiterImpl<>(
                executorService,
                waiter.toCallable(
                        () -> request,
                        new java.util.function.Function<
                                GetMaintenanceExecutionRequest, GetMaintenanceExecutionResponse>() {
                            @Override
                            public GetMaintenanceExecutionResponse apply(
                                    GetMaintenanceExecutionRequest request) {
                                return client.getMaintenanceExecution(request);
                            }
                        },
                        new java.util.function.Predicate<GetMaintenanceExecutionResponse>() {
                            @Override
                            public boolean test(GetMaintenanceExecutionResponse response) {
                                return targetStatesSet.contains(
                                        response.getMaintenanceExecution().getLifecycleState());
                            }
                        },
                        targetStatesSet.contains(
                                com.oracle.bmc.datacc.model.MaintenanceRunLifecycleState.Deleted)),
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
    public com.oracle.bmc.waiter.Waiter<GetMaintenanceRunRequest, GetMaintenanceRunResponse>
            forMaintenanceRun(
                    GetMaintenanceRunRequest request,
                    com.oracle.bmc.datacc.model.MaintenanceRunLifecycleState... targetStates) {
        com.oracle.bmc.util.internal.Validate.notEmpty(
                targetStates, "At least one targetState must be provided");
        com.oracle.bmc.util.internal.Validate.noNullElements(
                targetStates, "Null targetState values are not permitted");

        return forMaintenanceRun(
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
    public com.oracle.bmc.waiter.Waiter<GetMaintenanceRunRequest, GetMaintenanceRunResponse>
            forMaintenanceRun(
                    GetMaintenanceRunRequest request,
                    com.oracle.bmc.datacc.model.MaintenanceRunLifecycleState targetState,
                    com.oracle.bmc.waiter.TerminationStrategy terminationStrategy,
                    com.oracle.bmc.waiter.DelayStrategy delayStrategy) {
        com.oracle.bmc.util.internal.Validate.notNull(
                targetState, "The targetState cannot be null");

        return forMaintenanceRun(
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
    public com.oracle.bmc.waiter.Waiter<GetMaintenanceRunRequest, GetMaintenanceRunResponse>
            forMaintenanceRun(
                    GetMaintenanceRunRequest request,
                    com.oracle.bmc.waiter.TerminationStrategy terminationStrategy,
                    com.oracle.bmc.waiter.DelayStrategy delayStrategy,
                    com.oracle.bmc.datacc.model.MaintenanceRunLifecycleState... targetStates) {
        com.oracle.bmc.util.internal.Validate.notEmpty(
                targetStates, "At least one targetState must be provided");
        com.oracle.bmc.util.internal.Validate.noNullElements(
                targetStates, "Null targetState values are not permitted");

        return forMaintenanceRun(
                com.oracle.bmc.waiter.Waiters.newWaiter(terminationStrategy, delayStrategy),
                request,
                targetStates);
    }

    // Helper method to create a new Waiter for MaintenanceRun.
    private com.oracle.bmc.waiter.Waiter<GetMaintenanceRunRequest, GetMaintenanceRunResponse>
            forMaintenanceRun(
                    com.oracle.bmc.waiter.BmcGenericWaiter waiter,
                    final GetMaintenanceRunRequest request,
                    final com.oracle.bmc.datacc.model.MaintenanceRunLifecycleState...
                            targetStates) {
        final java.util.Set<com.oracle.bmc.datacc.model.MaintenanceRunLifecycleState>
                targetStatesSet = new java.util.HashSet<>(java.util.Arrays.asList(targetStates));

        return new com.oracle.bmc.waiter.internal.SimpleWaiterImpl<>(
                executorService,
                waiter.toCallable(
                        () -> request,
                        new java.util.function.Function<
                                GetMaintenanceRunRequest, GetMaintenanceRunResponse>() {
                            @Override
                            public GetMaintenanceRunResponse apply(
                                    GetMaintenanceRunRequest request) {
                                return client.getMaintenanceRun(request);
                            }
                        },
                        new java.util.function.Predicate<GetMaintenanceRunResponse>() {
                            @Override
                            public boolean test(GetMaintenanceRunResponse response) {
                                return targetStatesSet.contains(
                                        response.getMaintenanceRun().getLifecycleState());
                            }
                        },
                        targetStatesSet.contains(
                                com.oracle.bmc.datacc.model.MaintenanceRunLifecycleState.Deleted)),
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
    public com.oracle.bmc.waiter.Waiter<GetVmClusterNetworkRequest, GetVmClusterNetworkResponse>
            forVmClusterNetwork(
                    GetVmClusterNetworkRequest request,
                    com.oracle.bmc.datacc.model.VmClusterNetworkLifecycleState... targetStates) {
        com.oracle.bmc.util.internal.Validate.notEmpty(
                targetStates, "At least one targetState must be provided");
        com.oracle.bmc.util.internal.Validate.noNullElements(
                targetStates, "Null targetState values are not permitted");

        return forVmClusterNetwork(
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
    public com.oracle.bmc.waiter.Waiter<GetVmClusterNetworkRequest, GetVmClusterNetworkResponse>
            forVmClusterNetwork(
                    GetVmClusterNetworkRequest request,
                    com.oracle.bmc.datacc.model.VmClusterNetworkLifecycleState targetState,
                    com.oracle.bmc.waiter.TerminationStrategy terminationStrategy,
                    com.oracle.bmc.waiter.DelayStrategy delayStrategy) {
        com.oracle.bmc.util.internal.Validate.notNull(
                targetState, "The targetState cannot be null");

        return forVmClusterNetwork(
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
    public com.oracle.bmc.waiter.Waiter<GetVmClusterNetworkRequest, GetVmClusterNetworkResponse>
            forVmClusterNetwork(
                    GetVmClusterNetworkRequest request,
                    com.oracle.bmc.waiter.TerminationStrategy terminationStrategy,
                    com.oracle.bmc.waiter.DelayStrategy delayStrategy,
                    com.oracle.bmc.datacc.model.VmClusterNetworkLifecycleState... targetStates) {
        com.oracle.bmc.util.internal.Validate.notEmpty(
                targetStates, "At least one targetState must be provided");
        com.oracle.bmc.util.internal.Validate.noNullElements(
                targetStates, "Null targetState values are not permitted");

        return forVmClusterNetwork(
                com.oracle.bmc.waiter.Waiters.newWaiter(terminationStrategy, delayStrategy),
                request,
                targetStates);
    }

    // Helper method to create a new Waiter for VmClusterNetwork.
    private com.oracle.bmc.waiter.Waiter<GetVmClusterNetworkRequest, GetVmClusterNetworkResponse>
            forVmClusterNetwork(
                    com.oracle.bmc.waiter.BmcGenericWaiter waiter,
                    final GetVmClusterNetworkRequest request,
                    final com.oracle.bmc.datacc.model.VmClusterNetworkLifecycleState...
                            targetStates) {
        final java.util.Set<com.oracle.bmc.datacc.model.VmClusterNetworkLifecycleState>
                targetStatesSet = new java.util.HashSet<>(java.util.Arrays.asList(targetStates));

        return new com.oracle.bmc.waiter.internal.SimpleWaiterImpl<>(
                executorService,
                waiter.toCallable(
                        () -> request,
                        new java.util.function.Function<
                                GetVmClusterNetworkRequest, GetVmClusterNetworkResponse>() {
                            @Override
                            public GetVmClusterNetworkResponse apply(
                                    GetVmClusterNetworkRequest request) {
                                return client.getVmClusterNetwork(request);
                            }
                        },
                        new java.util.function.Predicate<GetVmClusterNetworkResponse>() {
                            @Override
                            public boolean test(GetVmClusterNetworkResponse response) {
                                return targetStatesSet.contains(
                                        response.getVmClusterNetwork().getLifecycleState());
                            }
                        },
                        targetStatesSet.contains(
                                com.oracle.bmc.datacc.model.VmClusterNetworkLifecycleState
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
    public com.oracle.bmc.waiter.Waiter<GetVmInstanceRequest, GetVmInstanceResponse> forVmInstance(
            GetVmInstanceRequest request,
            com.oracle.bmc.datacc.model.VmInstanceLifecycleState... targetStates) {
        com.oracle.bmc.util.internal.Validate.notEmpty(
                targetStates, "At least one targetState must be provided");
        com.oracle.bmc.util.internal.Validate.noNullElements(
                targetStates, "Null targetState values are not permitted");

        return forVmInstance(
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
    public com.oracle.bmc.waiter.Waiter<GetVmInstanceRequest, GetVmInstanceResponse> forVmInstance(
            GetVmInstanceRequest request,
            com.oracle.bmc.datacc.model.VmInstanceLifecycleState targetState,
            com.oracle.bmc.waiter.TerminationStrategy terminationStrategy,
            com.oracle.bmc.waiter.DelayStrategy delayStrategy) {
        com.oracle.bmc.util.internal.Validate.notNull(
                targetState, "The targetState cannot be null");

        return forVmInstance(
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
    public com.oracle.bmc.waiter.Waiter<GetVmInstanceRequest, GetVmInstanceResponse> forVmInstance(
            GetVmInstanceRequest request,
            com.oracle.bmc.waiter.TerminationStrategy terminationStrategy,
            com.oracle.bmc.waiter.DelayStrategy delayStrategy,
            com.oracle.bmc.datacc.model.VmInstanceLifecycleState... targetStates) {
        com.oracle.bmc.util.internal.Validate.notEmpty(
                targetStates, "At least one targetState must be provided");
        com.oracle.bmc.util.internal.Validate.noNullElements(
                targetStates, "Null targetState values are not permitted");

        return forVmInstance(
                com.oracle.bmc.waiter.Waiters.newWaiter(terminationStrategy, delayStrategy),
                request,
                targetStates);
    }

    // Helper method to create a new Waiter for VmInstance.
    private com.oracle.bmc.waiter.Waiter<GetVmInstanceRequest, GetVmInstanceResponse> forVmInstance(
            com.oracle.bmc.waiter.BmcGenericWaiter waiter,
            final GetVmInstanceRequest request,
            final com.oracle.bmc.datacc.model.VmInstanceLifecycleState... targetStates) {
        final java.util.Set<com.oracle.bmc.datacc.model.VmInstanceLifecycleState> targetStatesSet =
                new java.util.HashSet<>(java.util.Arrays.asList(targetStates));

        return new com.oracle.bmc.waiter.internal.SimpleWaiterImpl<>(
                executorService,
                waiter.toCallable(
                        () -> request,
                        new java.util.function.Function<
                                GetVmInstanceRequest, GetVmInstanceResponse>() {
                            @Override
                            public GetVmInstanceResponse apply(GetVmInstanceRequest request) {
                                return client.getVmInstance(request);
                            }
                        },
                        new java.util.function.Predicate<GetVmInstanceResponse>() {
                            @Override
                            public boolean test(GetVmInstanceResponse response) {
                                return targetStatesSet.contains(
                                        response.getVmInstance().getLifecycleState());
                            }
                        },
                        targetStatesSet.contains(
                                com.oracle.bmc.datacc.model.VmInstanceLifecycleState.Deleted)),
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
