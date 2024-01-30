/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.databasemanagement;

import com.oracle.bmc.databasemanagement.requests.*;
import com.oracle.bmc.databasemanagement.responses.*;

/**
 * Collection of helper methods to produce {@link com.oracle.bmc.waiter.Waiter}s for different
 * resources of DbManagement.
 *
 * <p>The default configuration used is defined by {@link
 * com.oracle.bmc.waiter.Waiters.Waiters#DEFAULT_POLLING_WAITER}.
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20201101")
public class DbManagementWaiters {
    private final java.util.concurrent.ExecutorService executorService;
    private final DbManagement client;

    public DbManagementWaiters(
            java.util.concurrent.ExecutorService executorService, DbManagement client) {
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
    public com.oracle.bmc.waiter.Waiter<
                    GetDbManagementPrivateEndpointRequest, GetDbManagementPrivateEndpointResponse>
            forDbManagementPrivateEndpoint(
                    GetDbManagementPrivateEndpointRequest request,
                    com.oracle.bmc.databasemanagement.model.LifecycleStates... targetStates) {
        com.oracle.bmc.util.internal.Validate.notEmpty(
                targetStates, "At least one targetState must be provided");
        com.oracle.bmc.util.internal.Validate.noNullElements(
                targetStates, "Null targetState values are not permitted");

        return forDbManagementPrivateEndpoint(
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
                    GetDbManagementPrivateEndpointRequest, GetDbManagementPrivateEndpointResponse>
            forDbManagementPrivateEndpoint(
                    GetDbManagementPrivateEndpointRequest request,
                    com.oracle.bmc.databasemanagement.model.LifecycleStates targetState,
                    com.oracle.bmc.waiter.TerminationStrategy terminationStrategy,
                    com.oracle.bmc.waiter.DelayStrategy delayStrategy) {
        com.oracle.bmc.util.internal.Validate.notNull(
                targetState, "The targetState cannot be null");

        return forDbManagementPrivateEndpoint(
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
                    GetDbManagementPrivateEndpointRequest, GetDbManagementPrivateEndpointResponse>
            forDbManagementPrivateEndpoint(
                    GetDbManagementPrivateEndpointRequest request,
                    com.oracle.bmc.waiter.TerminationStrategy terminationStrategy,
                    com.oracle.bmc.waiter.DelayStrategy delayStrategy,
                    com.oracle.bmc.databasemanagement.model.LifecycleStates... targetStates) {
        com.oracle.bmc.util.internal.Validate.notEmpty(
                targetStates, "At least one targetState must be provided");
        com.oracle.bmc.util.internal.Validate.noNullElements(
                targetStates, "Null targetState values are not permitted");

        return forDbManagementPrivateEndpoint(
                com.oracle.bmc.waiter.Waiters.newWaiter(terminationStrategy, delayStrategy),
                request,
                targetStates);
    }

    // Helper method to create a new Waiter for DbManagementPrivateEndpoint.
    private com.oracle.bmc.waiter.Waiter<
                    GetDbManagementPrivateEndpointRequest, GetDbManagementPrivateEndpointResponse>
            forDbManagementPrivateEndpoint(
                    com.oracle.bmc.waiter.BmcGenericWaiter waiter,
                    final GetDbManagementPrivateEndpointRequest request,
                    final com.oracle.bmc.databasemanagement.model.LifecycleStates... targetStates) {
        final java.util.Set<com.oracle.bmc.databasemanagement.model.LifecycleStates>
                targetStatesSet = new java.util.HashSet<>(java.util.Arrays.asList(targetStates));

        return new com.oracle.bmc.waiter.internal.SimpleWaiterImpl<>(
                executorService,
                waiter.toCallable(
                        () -> request,
                        new java.util.function.Function<
                                GetDbManagementPrivateEndpointRequest,
                                GetDbManagementPrivateEndpointResponse>() {
                            @Override
                            public GetDbManagementPrivateEndpointResponse apply(
                                    GetDbManagementPrivateEndpointRequest request) {
                                return client.getDbManagementPrivateEndpoint(request);
                            }
                        },
                        new java.util.function.Predicate<GetDbManagementPrivateEndpointResponse>() {
                            @Override
                            public boolean test(GetDbManagementPrivateEndpointResponse response) {
                                return targetStatesSet.contains(
                                        response.getDbManagementPrivateEndpoint()
                                                .getLifecycleState());
                            }
                        },
                        targetStatesSet.contains(
                                com.oracle.bmc.databasemanagement.model.LifecycleStates.Deleted)),
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
    public com.oracle.bmc.waiter.Waiter<GetExternalAsmRequest, GetExternalAsmResponse>
            forExternalAsm(
                    GetExternalAsmRequest request,
                    com.oracle.bmc.databasemanagement.model.ExternalAsm.LifecycleState...
                            targetStates) {
        com.oracle.bmc.util.internal.Validate.notEmpty(
                targetStates, "At least one targetState must be provided");
        com.oracle.bmc.util.internal.Validate.noNullElements(
                targetStates, "Null targetState values are not permitted");

        return forExternalAsm(
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
    public com.oracle.bmc.waiter.Waiter<GetExternalAsmRequest, GetExternalAsmResponse>
            forExternalAsm(
                    GetExternalAsmRequest request,
                    com.oracle.bmc.databasemanagement.model.ExternalAsm.LifecycleState targetState,
                    com.oracle.bmc.waiter.TerminationStrategy terminationStrategy,
                    com.oracle.bmc.waiter.DelayStrategy delayStrategy) {
        com.oracle.bmc.util.internal.Validate.notNull(
                targetState, "The targetState cannot be null");

        return forExternalAsm(
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
    public com.oracle.bmc.waiter.Waiter<GetExternalAsmRequest, GetExternalAsmResponse>
            forExternalAsm(
                    GetExternalAsmRequest request,
                    com.oracle.bmc.waiter.TerminationStrategy terminationStrategy,
                    com.oracle.bmc.waiter.DelayStrategy delayStrategy,
                    com.oracle.bmc.databasemanagement.model.ExternalAsm.LifecycleState...
                            targetStates) {
        com.oracle.bmc.util.internal.Validate.notEmpty(
                targetStates, "At least one target state must be provided");
        com.oracle.bmc.util.internal.Validate.noNullElements(
                targetStates, "Null target states are not permitted");

        return forExternalAsm(
                com.oracle.bmc.waiter.Waiters.newWaiter(terminationStrategy, delayStrategy),
                request,
                targetStates);
    }

    // Helper method to create a new Waiter for ExternalAsm.
    private com.oracle.bmc.waiter.Waiter<GetExternalAsmRequest, GetExternalAsmResponse>
            forExternalAsm(
                    com.oracle.bmc.waiter.BmcGenericWaiter waiter,
                    final GetExternalAsmRequest request,
                    final com.oracle.bmc.databasemanagement.model.ExternalAsm.LifecycleState...
                            targetStates) {
        final java.util.Set<com.oracle.bmc.databasemanagement.model.ExternalAsm.LifecycleState>
                targetStatesSet = new java.util.HashSet<>(java.util.Arrays.asList(targetStates));

        return new com.oracle.bmc.waiter.internal.SimpleWaiterImpl<>(
                executorService,
                waiter.toCallable(
                        () -> request,
                        new java.util.function.Function<
                                GetExternalAsmRequest, GetExternalAsmResponse>() {
                            @Override
                            public GetExternalAsmResponse apply(GetExternalAsmRequest request) {
                                return client.getExternalAsm(request);
                            }
                        },
                        new java.util.function.Predicate<GetExternalAsmResponse>() {
                            @Override
                            public boolean test(GetExternalAsmResponse response) {
                                return targetStatesSet.contains(
                                        response.getExternalAsm().getLifecycleState());
                            }
                        },
                        targetStatesSet.contains(
                                com.oracle.bmc.databasemanagement.model.ExternalAsm.LifecycleState
                                        .Deleted)),
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
    public com.oracle.bmc.waiter.Waiter<
                    GetExternalAsmInstanceRequest, GetExternalAsmInstanceResponse>
            forExternalAsmInstance(
                    GetExternalAsmInstanceRequest request,
                    com.oracle.bmc.databasemanagement.model.ExternalAsmInstance.LifecycleState...
                            targetStates) {
        com.oracle.bmc.util.internal.Validate.notEmpty(
                targetStates, "At least one targetState must be provided");
        com.oracle.bmc.util.internal.Validate.noNullElements(
                targetStates, "Null targetState values are not permitted");

        return forExternalAsmInstance(
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
                    GetExternalAsmInstanceRequest, GetExternalAsmInstanceResponse>
            forExternalAsmInstance(
                    GetExternalAsmInstanceRequest request,
                    com.oracle.bmc.databasemanagement.model.ExternalAsmInstance.LifecycleState
                            targetState,
                    com.oracle.bmc.waiter.TerminationStrategy terminationStrategy,
                    com.oracle.bmc.waiter.DelayStrategy delayStrategy) {
        com.oracle.bmc.util.internal.Validate.notNull(
                targetState, "The targetState cannot be null");

        return forExternalAsmInstance(
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
                    GetExternalAsmInstanceRequest, GetExternalAsmInstanceResponse>
            forExternalAsmInstance(
                    GetExternalAsmInstanceRequest request,
                    com.oracle.bmc.waiter.TerminationStrategy terminationStrategy,
                    com.oracle.bmc.waiter.DelayStrategy delayStrategy,
                    com.oracle.bmc.databasemanagement.model.ExternalAsmInstance.LifecycleState...
                            targetStates) {
        com.oracle.bmc.util.internal.Validate.notEmpty(
                targetStates, "At least one target state must be provided");
        com.oracle.bmc.util.internal.Validate.noNullElements(
                targetStates, "Null target states are not permitted");

        return forExternalAsmInstance(
                com.oracle.bmc.waiter.Waiters.newWaiter(terminationStrategy, delayStrategy),
                request,
                targetStates);
    }

    // Helper method to create a new Waiter for ExternalAsmInstance.
    private com.oracle.bmc.waiter.Waiter<
                    GetExternalAsmInstanceRequest, GetExternalAsmInstanceResponse>
            forExternalAsmInstance(
                    com.oracle.bmc.waiter.BmcGenericWaiter waiter,
                    final GetExternalAsmInstanceRequest request,
                    final com.oracle.bmc.databasemanagement.model.ExternalAsmInstance.LifecycleState
                                    ...
                            targetStates) {
        final java.util.Set<
                        com.oracle.bmc.databasemanagement.model.ExternalAsmInstance.LifecycleState>
                targetStatesSet = new java.util.HashSet<>(java.util.Arrays.asList(targetStates));

        return new com.oracle.bmc.waiter.internal.SimpleWaiterImpl<>(
                executorService,
                waiter.toCallable(
                        () -> request,
                        new java.util.function.Function<
                                GetExternalAsmInstanceRequest, GetExternalAsmInstanceResponse>() {
                            @Override
                            public GetExternalAsmInstanceResponse apply(
                                    GetExternalAsmInstanceRequest request) {
                                return client.getExternalAsmInstance(request);
                            }
                        },
                        new java.util.function.Predicate<GetExternalAsmInstanceResponse>() {
                            @Override
                            public boolean test(GetExternalAsmInstanceResponse response) {
                                return targetStatesSet.contains(
                                        response.getExternalAsmInstance().getLifecycleState());
                            }
                        },
                        targetStatesSet.contains(
                                com.oracle.bmc.databasemanagement.model.ExternalAsmInstance
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
    public com.oracle.bmc.waiter.Waiter<GetExternalClusterRequest, GetExternalClusterResponse>
            forExternalCluster(
                    GetExternalClusterRequest request,
                    com.oracle.bmc.databasemanagement.model.ExternalCluster.LifecycleState...
                            targetStates) {
        com.oracle.bmc.util.internal.Validate.notEmpty(
                targetStates, "At least one targetState must be provided");
        com.oracle.bmc.util.internal.Validate.noNullElements(
                targetStates, "Null targetState values are not permitted");

        return forExternalCluster(
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
    public com.oracle.bmc.waiter.Waiter<GetExternalClusterRequest, GetExternalClusterResponse>
            forExternalCluster(
                    GetExternalClusterRequest request,
                    com.oracle.bmc.databasemanagement.model.ExternalCluster.LifecycleState
                            targetState,
                    com.oracle.bmc.waiter.TerminationStrategy terminationStrategy,
                    com.oracle.bmc.waiter.DelayStrategy delayStrategy) {
        com.oracle.bmc.util.internal.Validate.notNull(
                targetState, "The targetState cannot be null");

        return forExternalCluster(
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
    public com.oracle.bmc.waiter.Waiter<GetExternalClusterRequest, GetExternalClusterResponse>
            forExternalCluster(
                    GetExternalClusterRequest request,
                    com.oracle.bmc.waiter.TerminationStrategy terminationStrategy,
                    com.oracle.bmc.waiter.DelayStrategy delayStrategy,
                    com.oracle.bmc.databasemanagement.model.ExternalCluster.LifecycleState...
                            targetStates) {
        com.oracle.bmc.util.internal.Validate.notEmpty(
                targetStates, "At least one target state must be provided");
        com.oracle.bmc.util.internal.Validate.noNullElements(
                targetStates, "Null target states are not permitted");

        return forExternalCluster(
                com.oracle.bmc.waiter.Waiters.newWaiter(terminationStrategy, delayStrategy),
                request,
                targetStates);
    }

    // Helper method to create a new Waiter for ExternalCluster.
    private com.oracle.bmc.waiter.Waiter<GetExternalClusterRequest, GetExternalClusterResponse>
            forExternalCluster(
                    com.oracle.bmc.waiter.BmcGenericWaiter waiter,
                    final GetExternalClusterRequest request,
                    final com.oracle.bmc.databasemanagement.model.ExternalCluster.LifecycleState...
                            targetStates) {
        final java.util.Set<com.oracle.bmc.databasemanagement.model.ExternalCluster.LifecycleState>
                targetStatesSet = new java.util.HashSet<>(java.util.Arrays.asList(targetStates));

        return new com.oracle.bmc.waiter.internal.SimpleWaiterImpl<>(
                executorService,
                waiter.toCallable(
                        () -> request,
                        new java.util.function.Function<
                                GetExternalClusterRequest, GetExternalClusterResponse>() {
                            @Override
                            public GetExternalClusterResponse apply(
                                    GetExternalClusterRequest request) {
                                return client.getExternalCluster(request);
                            }
                        },
                        new java.util.function.Predicate<GetExternalClusterResponse>() {
                            @Override
                            public boolean test(GetExternalClusterResponse response) {
                                return targetStatesSet.contains(
                                        response.getExternalCluster().getLifecycleState());
                            }
                        },
                        targetStatesSet.contains(
                                com.oracle.bmc.databasemanagement.model.ExternalCluster
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
    public com.oracle.bmc.waiter.Waiter<
                    GetExternalClusterInstanceRequest, GetExternalClusterInstanceResponse>
            forExternalClusterInstance(
                    GetExternalClusterInstanceRequest request,
                    com.oracle.bmc.databasemanagement.model.ExternalClusterInstance.LifecycleState
                                    ...
                            targetStates) {
        com.oracle.bmc.util.internal.Validate.notEmpty(
                targetStates, "At least one targetState must be provided");
        com.oracle.bmc.util.internal.Validate.noNullElements(
                targetStates, "Null targetState values are not permitted");

        return forExternalClusterInstance(
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
                    GetExternalClusterInstanceRequest, GetExternalClusterInstanceResponse>
            forExternalClusterInstance(
                    GetExternalClusterInstanceRequest request,
                    com.oracle.bmc.databasemanagement.model.ExternalClusterInstance.LifecycleState
                            targetState,
                    com.oracle.bmc.waiter.TerminationStrategy terminationStrategy,
                    com.oracle.bmc.waiter.DelayStrategy delayStrategy) {
        com.oracle.bmc.util.internal.Validate.notNull(
                targetState, "The targetState cannot be null");

        return forExternalClusterInstance(
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
                    GetExternalClusterInstanceRequest, GetExternalClusterInstanceResponse>
            forExternalClusterInstance(
                    GetExternalClusterInstanceRequest request,
                    com.oracle.bmc.waiter.TerminationStrategy terminationStrategy,
                    com.oracle.bmc.waiter.DelayStrategy delayStrategy,
                    com.oracle.bmc.databasemanagement.model.ExternalClusterInstance.LifecycleState
                                    ...
                            targetStates) {
        com.oracle.bmc.util.internal.Validate.notEmpty(
                targetStates, "At least one target state must be provided");
        com.oracle.bmc.util.internal.Validate.noNullElements(
                targetStates, "Null target states are not permitted");

        return forExternalClusterInstance(
                com.oracle.bmc.waiter.Waiters.newWaiter(terminationStrategy, delayStrategy),
                request,
                targetStates);
    }

    // Helper method to create a new Waiter for ExternalClusterInstance.
    private com.oracle.bmc.waiter.Waiter<
                    GetExternalClusterInstanceRequest, GetExternalClusterInstanceResponse>
            forExternalClusterInstance(
                    com.oracle.bmc.waiter.BmcGenericWaiter waiter,
                    final GetExternalClusterInstanceRequest request,
                    final com.oracle.bmc.databasemanagement.model.ExternalClusterInstance
                                            .LifecycleState
                                    ...
                            targetStates) {
        final java.util.Set<
                        com.oracle.bmc.databasemanagement.model.ExternalClusterInstance
                                .LifecycleState>
                targetStatesSet = new java.util.HashSet<>(java.util.Arrays.asList(targetStates));

        return new com.oracle.bmc.waiter.internal.SimpleWaiterImpl<>(
                executorService,
                waiter.toCallable(
                        () -> request,
                        new java.util.function.Function<
                                GetExternalClusterInstanceRequest,
                                GetExternalClusterInstanceResponse>() {
                            @Override
                            public GetExternalClusterInstanceResponse apply(
                                    GetExternalClusterInstanceRequest request) {
                                return client.getExternalClusterInstance(request);
                            }
                        },
                        new java.util.function.Predicate<GetExternalClusterInstanceResponse>() {
                            @Override
                            public boolean test(GetExternalClusterInstanceResponse response) {
                                return targetStatesSet.contains(
                                        response.getExternalClusterInstance().getLifecycleState());
                            }
                        },
                        targetStatesSet.contains(
                                com.oracle.bmc.databasemanagement.model.ExternalClusterInstance
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
    public com.oracle.bmc.waiter.Waiter<GetExternalDbHomeRequest, GetExternalDbHomeResponse>
            forExternalDbHome(
                    GetExternalDbHomeRequest request,
                    com.oracle.bmc.databasemanagement.model.ExternalDbHome.LifecycleState...
                            targetStates) {
        com.oracle.bmc.util.internal.Validate.notEmpty(
                targetStates, "At least one targetState must be provided");
        com.oracle.bmc.util.internal.Validate.noNullElements(
                targetStates, "Null targetState values are not permitted");

        return forExternalDbHome(
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
    public com.oracle.bmc.waiter.Waiter<GetExternalDbHomeRequest, GetExternalDbHomeResponse>
            forExternalDbHome(
                    GetExternalDbHomeRequest request,
                    com.oracle.bmc.databasemanagement.model.ExternalDbHome.LifecycleState
                            targetState,
                    com.oracle.bmc.waiter.TerminationStrategy terminationStrategy,
                    com.oracle.bmc.waiter.DelayStrategy delayStrategy) {
        com.oracle.bmc.util.internal.Validate.notNull(
                targetState, "The targetState cannot be null");

        return forExternalDbHome(
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
    public com.oracle.bmc.waiter.Waiter<GetExternalDbHomeRequest, GetExternalDbHomeResponse>
            forExternalDbHome(
                    GetExternalDbHomeRequest request,
                    com.oracle.bmc.waiter.TerminationStrategy terminationStrategy,
                    com.oracle.bmc.waiter.DelayStrategy delayStrategy,
                    com.oracle.bmc.databasemanagement.model.ExternalDbHome.LifecycleState...
                            targetStates) {
        com.oracle.bmc.util.internal.Validate.notEmpty(
                targetStates, "At least one target state must be provided");
        com.oracle.bmc.util.internal.Validate.noNullElements(
                targetStates, "Null target states are not permitted");

        return forExternalDbHome(
                com.oracle.bmc.waiter.Waiters.newWaiter(terminationStrategy, delayStrategy),
                request,
                targetStates);
    }

    // Helper method to create a new Waiter for ExternalDbHome.
    private com.oracle.bmc.waiter.Waiter<GetExternalDbHomeRequest, GetExternalDbHomeResponse>
            forExternalDbHome(
                    com.oracle.bmc.waiter.BmcGenericWaiter waiter,
                    final GetExternalDbHomeRequest request,
                    final com.oracle.bmc.databasemanagement.model.ExternalDbHome.LifecycleState...
                            targetStates) {
        final java.util.Set<com.oracle.bmc.databasemanagement.model.ExternalDbHome.LifecycleState>
                targetStatesSet = new java.util.HashSet<>(java.util.Arrays.asList(targetStates));

        return new com.oracle.bmc.waiter.internal.SimpleWaiterImpl<>(
                executorService,
                waiter.toCallable(
                        () -> request,
                        new java.util.function.Function<
                                GetExternalDbHomeRequest, GetExternalDbHomeResponse>() {
                            @Override
                            public GetExternalDbHomeResponse apply(
                                    GetExternalDbHomeRequest request) {
                                return client.getExternalDbHome(request);
                            }
                        },
                        new java.util.function.Predicate<GetExternalDbHomeResponse>() {
                            @Override
                            public boolean test(GetExternalDbHomeResponse response) {
                                return targetStatesSet.contains(
                                        response.getExternalDbHome().getLifecycleState());
                            }
                        },
                        targetStatesSet.contains(
                                com.oracle.bmc.databasemanagement.model.ExternalDbHome
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
    public com.oracle.bmc.waiter.Waiter<GetExternalDbNodeRequest, GetExternalDbNodeResponse>
            forExternalDbNode(
                    GetExternalDbNodeRequest request,
                    com.oracle.bmc.databasemanagement.model.ExternalDbNode.LifecycleState...
                            targetStates) {
        com.oracle.bmc.util.internal.Validate.notEmpty(
                targetStates, "At least one targetState must be provided");
        com.oracle.bmc.util.internal.Validate.noNullElements(
                targetStates, "Null targetState values are not permitted");

        return forExternalDbNode(
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
    public com.oracle.bmc.waiter.Waiter<GetExternalDbNodeRequest, GetExternalDbNodeResponse>
            forExternalDbNode(
                    GetExternalDbNodeRequest request,
                    com.oracle.bmc.databasemanagement.model.ExternalDbNode.LifecycleState
                            targetState,
                    com.oracle.bmc.waiter.TerminationStrategy terminationStrategy,
                    com.oracle.bmc.waiter.DelayStrategy delayStrategy) {
        com.oracle.bmc.util.internal.Validate.notNull(
                targetState, "The targetState cannot be null");

        return forExternalDbNode(
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
    public com.oracle.bmc.waiter.Waiter<GetExternalDbNodeRequest, GetExternalDbNodeResponse>
            forExternalDbNode(
                    GetExternalDbNodeRequest request,
                    com.oracle.bmc.waiter.TerminationStrategy terminationStrategy,
                    com.oracle.bmc.waiter.DelayStrategy delayStrategy,
                    com.oracle.bmc.databasemanagement.model.ExternalDbNode.LifecycleState...
                            targetStates) {
        com.oracle.bmc.util.internal.Validate.notEmpty(
                targetStates, "At least one target state must be provided");
        com.oracle.bmc.util.internal.Validate.noNullElements(
                targetStates, "Null target states are not permitted");

        return forExternalDbNode(
                com.oracle.bmc.waiter.Waiters.newWaiter(terminationStrategy, delayStrategy),
                request,
                targetStates);
    }

    // Helper method to create a new Waiter for ExternalDbNode.
    private com.oracle.bmc.waiter.Waiter<GetExternalDbNodeRequest, GetExternalDbNodeResponse>
            forExternalDbNode(
                    com.oracle.bmc.waiter.BmcGenericWaiter waiter,
                    final GetExternalDbNodeRequest request,
                    final com.oracle.bmc.databasemanagement.model.ExternalDbNode.LifecycleState...
                            targetStates) {
        final java.util.Set<com.oracle.bmc.databasemanagement.model.ExternalDbNode.LifecycleState>
                targetStatesSet = new java.util.HashSet<>(java.util.Arrays.asList(targetStates));

        return new com.oracle.bmc.waiter.internal.SimpleWaiterImpl<>(
                executorService,
                waiter.toCallable(
                        () -> request,
                        new java.util.function.Function<
                                GetExternalDbNodeRequest, GetExternalDbNodeResponse>() {
                            @Override
                            public GetExternalDbNodeResponse apply(
                                    GetExternalDbNodeRequest request) {
                                return client.getExternalDbNode(request);
                            }
                        },
                        new java.util.function.Predicate<GetExternalDbNodeResponse>() {
                            @Override
                            public boolean test(GetExternalDbNodeResponse response) {
                                return targetStatesSet.contains(
                                        response.getExternalDbNode().getLifecycleState());
                            }
                        },
                        targetStatesSet.contains(
                                com.oracle.bmc.databasemanagement.model.ExternalDbNode
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
    public com.oracle.bmc.waiter.Waiter<GetExternalDbSystemRequest, GetExternalDbSystemResponse>
            forExternalDbSystem(
                    GetExternalDbSystemRequest request,
                    com.oracle.bmc.databasemanagement.model.ExternalDbSystem.LifecycleState...
                            targetStates) {
        com.oracle.bmc.util.internal.Validate.notEmpty(
                targetStates, "At least one targetState must be provided");
        com.oracle.bmc.util.internal.Validate.noNullElements(
                targetStates, "Null targetState values are not permitted");

        return forExternalDbSystem(
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
    public com.oracle.bmc.waiter.Waiter<GetExternalDbSystemRequest, GetExternalDbSystemResponse>
            forExternalDbSystem(
                    GetExternalDbSystemRequest request,
                    com.oracle.bmc.databasemanagement.model.ExternalDbSystem.LifecycleState
                            targetState,
                    com.oracle.bmc.waiter.TerminationStrategy terminationStrategy,
                    com.oracle.bmc.waiter.DelayStrategy delayStrategy) {
        com.oracle.bmc.util.internal.Validate.notNull(
                targetState, "The targetState cannot be null");

        return forExternalDbSystem(
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
    public com.oracle.bmc.waiter.Waiter<GetExternalDbSystemRequest, GetExternalDbSystemResponse>
            forExternalDbSystem(
                    GetExternalDbSystemRequest request,
                    com.oracle.bmc.waiter.TerminationStrategy terminationStrategy,
                    com.oracle.bmc.waiter.DelayStrategy delayStrategy,
                    com.oracle.bmc.databasemanagement.model.ExternalDbSystem.LifecycleState...
                            targetStates) {
        com.oracle.bmc.util.internal.Validate.notEmpty(
                targetStates, "At least one target state must be provided");
        com.oracle.bmc.util.internal.Validate.noNullElements(
                targetStates, "Null target states are not permitted");

        return forExternalDbSystem(
                com.oracle.bmc.waiter.Waiters.newWaiter(terminationStrategy, delayStrategy),
                request,
                targetStates);
    }

    // Helper method to create a new Waiter for ExternalDbSystem.
    private com.oracle.bmc.waiter.Waiter<GetExternalDbSystemRequest, GetExternalDbSystemResponse>
            forExternalDbSystem(
                    com.oracle.bmc.waiter.BmcGenericWaiter waiter,
                    final GetExternalDbSystemRequest request,
                    final com.oracle.bmc.databasemanagement.model.ExternalDbSystem.LifecycleState...
                            targetStates) {
        final java.util.Set<com.oracle.bmc.databasemanagement.model.ExternalDbSystem.LifecycleState>
                targetStatesSet = new java.util.HashSet<>(java.util.Arrays.asList(targetStates));

        return new com.oracle.bmc.waiter.internal.SimpleWaiterImpl<>(
                executorService,
                waiter.toCallable(
                        () -> request,
                        new java.util.function.Function<
                                GetExternalDbSystemRequest, GetExternalDbSystemResponse>() {
                            @Override
                            public GetExternalDbSystemResponse apply(
                                    GetExternalDbSystemRequest request) {
                                return client.getExternalDbSystem(request);
                            }
                        },
                        new java.util.function.Predicate<GetExternalDbSystemResponse>() {
                            @Override
                            public boolean test(GetExternalDbSystemResponse response) {
                                return targetStatesSet.contains(
                                        response.getExternalDbSystem().getLifecycleState());
                            }
                        },
                        targetStatesSet.contains(
                                com.oracle.bmc.databasemanagement.model.ExternalDbSystem
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
    public com.oracle.bmc.waiter.Waiter<
                    GetExternalDbSystemConnectorRequest, GetExternalDbSystemConnectorResponse>
            forExternalDbSystemConnector(
                    GetExternalDbSystemConnectorRequest request,
                    com.oracle.bmc.databasemanagement.model.ExternalDbSystemConnector.LifecycleState
                                    ...
                            targetStates) {
        com.oracle.bmc.util.internal.Validate.notEmpty(
                targetStates, "At least one targetState must be provided");
        com.oracle.bmc.util.internal.Validate.noNullElements(
                targetStates, "Null targetState values are not permitted");

        return forExternalDbSystemConnector(
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
                    GetExternalDbSystemConnectorRequest, GetExternalDbSystemConnectorResponse>
            forExternalDbSystemConnector(
                    GetExternalDbSystemConnectorRequest request,
                    com.oracle.bmc.databasemanagement.model.ExternalDbSystemConnector.LifecycleState
                            targetState,
                    com.oracle.bmc.waiter.TerminationStrategy terminationStrategy,
                    com.oracle.bmc.waiter.DelayStrategy delayStrategy) {
        com.oracle.bmc.util.internal.Validate.notNull(
                targetState, "The targetState cannot be null");

        return forExternalDbSystemConnector(
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
                    GetExternalDbSystemConnectorRequest, GetExternalDbSystemConnectorResponse>
            forExternalDbSystemConnector(
                    GetExternalDbSystemConnectorRequest request,
                    com.oracle.bmc.waiter.TerminationStrategy terminationStrategy,
                    com.oracle.bmc.waiter.DelayStrategy delayStrategy,
                    com.oracle.bmc.databasemanagement.model.ExternalDbSystemConnector.LifecycleState
                                    ...
                            targetStates) {
        com.oracle.bmc.util.internal.Validate.notEmpty(
                targetStates, "At least one target state must be provided");
        com.oracle.bmc.util.internal.Validate.noNullElements(
                targetStates, "Null target states are not permitted");

        return forExternalDbSystemConnector(
                com.oracle.bmc.waiter.Waiters.newWaiter(terminationStrategy, delayStrategy),
                request,
                targetStates);
    }

    // Helper method to create a new Waiter for ExternalDbSystemConnector.
    private com.oracle.bmc.waiter.Waiter<
                    GetExternalDbSystemConnectorRequest, GetExternalDbSystemConnectorResponse>
            forExternalDbSystemConnector(
                    com.oracle.bmc.waiter.BmcGenericWaiter waiter,
                    final GetExternalDbSystemConnectorRequest request,
                    final com.oracle.bmc.databasemanagement.model.ExternalDbSystemConnector
                                            .LifecycleState
                                    ...
                            targetStates) {
        final java.util.Set<
                        com.oracle.bmc.databasemanagement.model.ExternalDbSystemConnector
                                .LifecycleState>
                targetStatesSet = new java.util.HashSet<>(java.util.Arrays.asList(targetStates));

        return new com.oracle.bmc.waiter.internal.SimpleWaiterImpl<>(
                executorService,
                waiter.toCallable(
                        () -> request,
                        new java.util.function.Function<
                                GetExternalDbSystemConnectorRequest,
                                GetExternalDbSystemConnectorResponse>() {
                            @Override
                            public GetExternalDbSystemConnectorResponse apply(
                                    GetExternalDbSystemConnectorRequest request) {
                                return client.getExternalDbSystemConnector(request);
                            }
                        },
                        new java.util.function.Predicate<GetExternalDbSystemConnectorResponse>() {
                            @Override
                            public boolean test(GetExternalDbSystemConnectorResponse response) {
                                return targetStatesSet.contains(
                                        response.getExternalDbSystemConnector()
                                                .getLifecycleState());
                            }
                        },
                        targetStatesSet.contains(
                                com.oracle.bmc.databasemanagement.model.ExternalDbSystemConnector
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
    public com.oracle.bmc.waiter.Waiter<
                    GetExternalDbSystemDiscoveryRequest, GetExternalDbSystemDiscoveryResponse>
            forExternalDbSystemDiscovery(
                    GetExternalDbSystemDiscoveryRequest request,
                    com.oracle.bmc.databasemanagement.model.ExternalDbSystemDiscovery.LifecycleState
                                    ...
                            targetStates) {
        com.oracle.bmc.util.internal.Validate.notEmpty(
                targetStates, "At least one targetState must be provided");
        com.oracle.bmc.util.internal.Validate.noNullElements(
                targetStates, "Null targetState values are not permitted");

        return forExternalDbSystemDiscovery(
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
                    GetExternalDbSystemDiscoveryRequest, GetExternalDbSystemDiscoveryResponse>
            forExternalDbSystemDiscovery(
                    GetExternalDbSystemDiscoveryRequest request,
                    com.oracle.bmc.databasemanagement.model.ExternalDbSystemDiscovery.LifecycleState
                            targetState,
                    com.oracle.bmc.waiter.TerminationStrategy terminationStrategy,
                    com.oracle.bmc.waiter.DelayStrategy delayStrategy) {
        com.oracle.bmc.util.internal.Validate.notNull(
                targetState, "The targetState cannot be null");

        return forExternalDbSystemDiscovery(
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
                    GetExternalDbSystemDiscoveryRequest, GetExternalDbSystemDiscoveryResponse>
            forExternalDbSystemDiscovery(
                    GetExternalDbSystemDiscoveryRequest request,
                    com.oracle.bmc.waiter.TerminationStrategy terminationStrategy,
                    com.oracle.bmc.waiter.DelayStrategy delayStrategy,
                    com.oracle.bmc.databasemanagement.model.ExternalDbSystemDiscovery.LifecycleState
                                    ...
                            targetStates) {
        com.oracle.bmc.util.internal.Validate.notEmpty(
                targetStates, "At least one target state must be provided");
        com.oracle.bmc.util.internal.Validate.noNullElements(
                targetStates, "Null target states are not permitted");

        return forExternalDbSystemDiscovery(
                com.oracle.bmc.waiter.Waiters.newWaiter(terminationStrategy, delayStrategy),
                request,
                targetStates);
    }

    // Helper method to create a new Waiter for ExternalDbSystemDiscovery.
    private com.oracle.bmc.waiter.Waiter<
                    GetExternalDbSystemDiscoveryRequest, GetExternalDbSystemDiscoveryResponse>
            forExternalDbSystemDiscovery(
                    com.oracle.bmc.waiter.BmcGenericWaiter waiter,
                    final GetExternalDbSystemDiscoveryRequest request,
                    final com.oracle.bmc.databasemanagement.model.ExternalDbSystemDiscovery
                                            .LifecycleState
                                    ...
                            targetStates) {
        final java.util.Set<
                        com.oracle.bmc.databasemanagement.model.ExternalDbSystemDiscovery
                                .LifecycleState>
                targetStatesSet = new java.util.HashSet<>(java.util.Arrays.asList(targetStates));

        return new com.oracle.bmc.waiter.internal.SimpleWaiterImpl<>(
                executorService,
                waiter.toCallable(
                        () -> request,
                        new java.util.function.Function<
                                GetExternalDbSystemDiscoveryRequest,
                                GetExternalDbSystemDiscoveryResponse>() {
                            @Override
                            public GetExternalDbSystemDiscoveryResponse apply(
                                    GetExternalDbSystemDiscoveryRequest request) {
                                return client.getExternalDbSystemDiscovery(request);
                            }
                        },
                        new java.util.function.Predicate<GetExternalDbSystemDiscoveryResponse>() {
                            @Override
                            public boolean test(GetExternalDbSystemDiscoveryResponse response) {
                                return targetStatesSet.contains(
                                        response.getExternalDbSystemDiscovery()
                                                .getLifecycleState());
                            }
                        },
                        targetStatesSet.contains(
                                com.oracle.bmc.databasemanagement.model.ExternalDbSystemDiscovery
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
    public com.oracle.bmc.waiter.Waiter<GetExternalListenerRequest, GetExternalListenerResponse>
            forExternalListener(
                    GetExternalListenerRequest request,
                    com.oracle.bmc.databasemanagement.model.ExternalListener.LifecycleState...
                            targetStates) {
        com.oracle.bmc.util.internal.Validate.notEmpty(
                targetStates, "At least one targetState must be provided");
        com.oracle.bmc.util.internal.Validate.noNullElements(
                targetStates, "Null targetState values are not permitted");

        return forExternalListener(
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
    public com.oracle.bmc.waiter.Waiter<GetExternalListenerRequest, GetExternalListenerResponse>
            forExternalListener(
                    GetExternalListenerRequest request,
                    com.oracle.bmc.databasemanagement.model.ExternalListener.LifecycleState
                            targetState,
                    com.oracle.bmc.waiter.TerminationStrategy terminationStrategy,
                    com.oracle.bmc.waiter.DelayStrategy delayStrategy) {
        com.oracle.bmc.util.internal.Validate.notNull(
                targetState, "The targetState cannot be null");

        return forExternalListener(
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
    public com.oracle.bmc.waiter.Waiter<GetExternalListenerRequest, GetExternalListenerResponse>
            forExternalListener(
                    GetExternalListenerRequest request,
                    com.oracle.bmc.waiter.TerminationStrategy terminationStrategy,
                    com.oracle.bmc.waiter.DelayStrategy delayStrategy,
                    com.oracle.bmc.databasemanagement.model.ExternalListener.LifecycleState...
                            targetStates) {
        com.oracle.bmc.util.internal.Validate.notEmpty(
                targetStates, "At least one target state must be provided");
        com.oracle.bmc.util.internal.Validate.noNullElements(
                targetStates, "Null target states are not permitted");

        return forExternalListener(
                com.oracle.bmc.waiter.Waiters.newWaiter(terminationStrategy, delayStrategy),
                request,
                targetStates);
    }

    // Helper method to create a new Waiter for ExternalListener.
    private com.oracle.bmc.waiter.Waiter<GetExternalListenerRequest, GetExternalListenerResponse>
            forExternalListener(
                    com.oracle.bmc.waiter.BmcGenericWaiter waiter,
                    final GetExternalListenerRequest request,
                    final com.oracle.bmc.databasemanagement.model.ExternalListener.LifecycleState...
                            targetStates) {
        final java.util.Set<com.oracle.bmc.databasemanagement.model.ExternalListener.LifecycleState>
                targetStatesSet = new java.util.HashSet<>(java.util.Arrays.asList(targetStates));

        return new com.oracle.bmc.waiter.internal.SimpleWaiterImpl<>(
                executorService,
                waiter.toCallable(
                        () -> request,
                        new java.util.function.Function<
                                GetExternalListenerRequest, GetExternalListenerResponse>() {
                            @Override
                            public GetExternalListenerResponse apply(
                                    GetExternalListenerRequest request) {
                                return client.getExternalListener(request);
                            }
                        },
                        new java.util.function.Predicate<GetExternalListenerResponse>() {
                            @Override
                            public boolean test(GetExternalListenerResponse response) {
                                return targetStatesSet.contains(
                                        response.getExternalListener().getLifecycleState());
                            }
                        },
                        targetStatesSet.contains(
                                com.oracle.bmc.databasemanagement.model.ExternalListener
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
    public com.oracle.bmc.waiter.Waiter<GetJobRequest, GetJobResponse> forJob(
            GetJobRequest request,
            com.oracle.bmc.databasemanagement.model.Job.LifecycleState... targetStates) {
        com.oracle.bmc.util.internal.Validate.notEmpty(
                targetStates, "At least one targetState must be provided");
        com.oracle.bmc.util.internal.Validate.noNullElements(
                targetStates, "Null targetState values are not permitted");

        return forJob(com.oracle.bmc.waiter.Waiters.DEFAULT_POLLING_WAITER, request, targetStates);
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
    public com.oracle.bmc.waiter.Waiter<GetJobRequest, GetJobResponse> forJob(
            GetJobRequest request,
            com.oracle.bmc.databasemanagement.model.Job.LifecycleState targetState,
            com.oracle.bmc.waiter.TerminationStrategy terminationStrategy,
            com.oracle.bmc.waiter.DelayStrategy delayStrategy) {
        com.oracle.bmc.util.internal.Validate.notNull(
                targetState, "The targetState cannot be null");

        return forJob(
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
    public com.oracle.bmc.waiter.Waiter<GetJobRequest, GetJobResponse> forJob(
            GetJobRequest request,
            com.oracle.bmc.waiter.TerminationStrategy terminationStrategy,
            com.oracle.bmc.waiter.DelayStrategy delayStrategy,
            com.oracle.bmc.databasemanagement.model.Job.LifecycleState... targetStates) {
        com.oracle.bmc.util.internal.Validate.notEmpty(
                targetStates, "At least one target state must be provided");
        com.oracle.bmc.util.internal.Validate.noNullElements(
                targetStates, "Null target states are not permitted");

        return forJob(
                com.oracle.bmc.waiter.Waiters.newWaiter(terminationStrategy, delayStrategy),
                request,
                targetStates);
    }

    // Helper method to create a new Waiter for Job.
    private com.oracle.bmc.waiter.Waiter<GetJobRequest, GetJobResponse> forJob(
            com.oracle.bmc.waiter.BmcGenericWaiter waiter,
            final GetJobRequest request,
            final com.oracle.bmc.databasemanagement.model.Job.LifecycleState... targetStates) {
        final java.util.Set<com.oracle.bmc.databasemanagement.model.Job.LifecycleState>
                targetStatesSet = new java.util.HashSet<>(java.util.Arrays.asList(targetStates));

        return new com.oracle.bmc.waiter.internal.SimpleWaiterImpl<>(
                executorService,
                waiter.toCallable(
                        () -> request,
                        new java.util.function.Function<GetJobRequest, GetJobResponse>() {
                            @Override
                            public GetJobResponse apply(GetJobRequest request) {
                                return client.getJob(request);
                            }
                        },
                        new java.util.function.Predicate<GetJobResponse>() {
                            @Override
                            public boolean test(GetJobResponse response) {
                                return targetStatesSet.contains(
                                        response.getJob().getLifecycleState());
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
                    GetManagedDatabaseGroupRequest, GetManagedDatabaseGroupResponse>
            forManagedDatabaseGroup(
                    GetManagedDatabaseGroupRequest request,
                    com.oracle.bmc.databasemanagement.model.LifecycleStates... targetStates) {
        com.oracle.bmc.util.internal.Validate.notEmpty(
                targetStates, "At least one targetState must be provided");
        com.oracle.bmc.util.internal.Validate.noNullElements(
                targetStates, "Null targetState values are not permitted");

        return forManagedDatabaseGroup(
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
                    GetManagedDatabaseGroupRequest, GetManagedDatabaseGroupResponse>
            forManagedDatabaseGroup(
                    GetManagedDatabaseGroupRequest request,
                    com.oracle.bmc.databasemanagement.model.LifecycleStates targetState,
                    com.oracle.bmc.waiter.TerminationStrategy terminationStrategy,
                    com.oracle.bmc.waiter.DelayStrategy delayStrategy) {
        com.oracle.bmc.util.internal.Validate.notNull(
                targetState, "The targetState cannot be null");

        return forManagedDatabaseGroup(
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
                    GetManagedDatabaseGroupRequest, GetManagedDatabaseGroupResponse>
            forManagedDatabaseGroup(
                    GetManagedDatabaseGroupRequest request,
                    com.oracle.bmc.waiter.TerminationStrategy terminationStrategy,
                    com.oracle.bmc.waiter.DelayStrategy delayStrategy,
                    com.oracle.bmc.databasemanagement.model.LifecycleStates... targetStates) {
        com.oracle.bmc.util.internal.Validate.notEmpty(
                targetStates, "At least one targetState must be provided");
        com.oracle.bmc.util.internal.Validate.noNullElements(
                targetStates, "Null targetState values are not permitted");

        return forManagedDatabaseGroup(
                com.oracle.bmc.waiter.Waiters.newWaiter(terminationStrategy, delayStrategy),
                request,
                targetStates);
    }

    // Helper method to create a new Waiter for ManagedDatabaseGroup.
    private com.oracle.bmc.waiter.Waiter<
                    GetManagedDatabaseGroupRequest, GetManagedDatabaseGroupResponse>
            forManagedDatabaseGroup(
                    com.oracle.bmc.waiter.BmcGenericWaiter waiter,
                    final GetManagedDatabaseGroupRequest request,
                    final com.oracle.bmc.databasemanagement.model.LifecycleStates... targetStates) {
        final java.util.Set<com.oracle.bmc.databasemanagement.model.LifecycleStates>
                targetStatesSet = new java.util.HashSet<>(java.util.Arrays.asList(targetStates));

        return new com.oracle.bmc.waiter.internal.SimpleWaiterImpl<>(
                executorService,
                waiter.toCallable(
                        () -> request,
                        new java.util.function.Function<
                                GetManagedDatabaseGroupRequest, GetManagedDatabaseGroupResponse>() {
                            @Override
                            public GetManagedDatabaseGroupResponse apply(
                                    GetManagedDatabaseGroupRequest request) {
                                return client.getManagedDatabaseGroup(request);
                            }
                        },
                        new java.util.function.Predicate<GetManagedDatabaseGroupResponse>() {
                            @Override
                            public boolean test(GetManagedDatabaseGroupResponse response) {
                                return targetStatesSet.contains(
                                        response.getManagedDatabaseGroup().getLifecycleState());
                            }
                        },
                        targetStatesSet.contains(
                                com.oracle.bmc.databasemanagement.model.LifecycleStates.Deleted)),
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
    public com.oracle.bmc.waiter.Waiter<GetNamedCredentialRequest, GetNamedCredentialResponse>
            forNamedCredential(
                    GetNamedCredentialRequest request,
                    com.oracle.bmc.databasemanagement.model.LifecycleStates... targetStates) {
        com.oracle.bmc.util.internal.Validate.notEmpty(
                targetStates, "At least one targetState must be provided");
        com.oracle.bmc.util.internal.Validate.noNullElements(
                targetStates, "Null targetState values are not permitted");

        return forNamedCredential(
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
    public com.oracle.bmc.waiter.Waiter<GetNamedCredentialRequest, GetNamedCredentialResponse>
            forNamedCredential(
                    GetNamedCredentialRequest request,
                    com.oracle.bmc.databasemanagement.model.LifecycleStates targetState,
                    com.oracle.bmc.waiter.TerminationStrategy terminationStrategy,
                    com.oracle.bmc.waiter.DelayStrategy delayStrategy) {
        com.oracle.bmc.util.internal.Validate.notNull(
                targetState, "The targetState cannot be null");

        return forNamedCredential(
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
    public com.oracle.bmc.waiter.Waiter<GetNamedCredentialRequest, GetNamedCredentialResponse>
            forNamedCredential(
                    GetNamedCredentialRequest request,
                    com.oracle.bmc.waiter.TerminationStrategy terminationStrategy,
                    com.oracle.bmc.waiter.DelayStrategy delayStrategy,
                    com.oracle.bmc.databasemanagement.model.LifecycleStates... targetStates) {
        com.oracle.bmc.util.internal.Validate.notEmpty(
                targetStates, "At least one targetState must be provided");
        com.oracle.bmc.util.internal.Validate.noNullElements(
                targetStates, "Null targetState values are not permitted");

        return forNamedCredential(
                com.oracle.bmc.waiter.Waiters.newWaiter(terminationStrategy, delayStrategy),
                request,
                targetStates);
    }

    // Helper method to create a new Waiter for NamedCredential.
    private com.oracle.bmc.waiter.Waiter<GetNamedCredentialRequest, GetNamedCredentialResponse>
            forNamedCredential(
                    com.oracle.bmc.waiter.BmcGenericWaiter waiter,
                    final GetNamedCredentialRequest request,
                    final com.oracle.bmc.databasemanagement.model.LifecycleStates... targetStates) {
        final java.util.Set<com.oracle.bmc.databasemanagement.model.LifecycleStates>
                targetStatesSet = new java.util.HashSet<>(java.util.Arrays.asList(targetStates));

        return new com.oracle.bmc.waiter.internal.SimpleWaiterImpl<>(
                executorService,
                waiter.toCallable(
                        () -> request,
                        new java.util.function.Function<
                                GetNamedCredentialRequest, GetNamedCredentialResponse>() {
                            @Override
                            public GetNamedCredentialResponse apply(
                                    GetNamedCredentialRequest request) {
                                return client.getNamedCredential(request);
                            }
                        },
                        new java.util.function.Predicate<GetNamedCredentialResponse>() {
                            @Override
                            public boolean test(GetNamedCredentialResponse response) {
                                return targetStatesSet.contains(
                                        response.getNamedCredential().getLifecycleState());
                            }
                        },
                        targetStatesSet.contains(
                                com.oracle.bmc.databasemanagement.model.LifecycleStates.Deleted)),
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
