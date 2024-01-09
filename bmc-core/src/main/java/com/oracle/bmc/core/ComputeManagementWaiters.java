/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.core;

import com.oracle.bmc.core.requests.*;
import com.oracle.bmc.core.responses.*;

/**
 * Collection of helper methods to produce {@link com.oracle.bmc.waiter.Waiter}s for different
 * resources of ComputeManagement.
 *
 * <p>The default configuration used is defined by {@link
 * com.oracle.bmc.waiter.Waiters.Waiters#DEFAULT_POLLING_WAITER}.
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20160918")
public class ComputeManagementWaiters {
    @jakarta.annotation.Nonnull private final java.util.concurrent.ExecutorService executorService;
    @jakarta.annotation.Nonnull private final ComputeManagement client;
    private final com.oracle.bmc.workrequests.WorkRequest workRequestClient;

    @Deprecated
    public ComputeManagementWaiters(
            @jakarta.annotation.Nonnull java.util.concurrent.ExecutorService executorService,
            @jakarta.annotation.Nonnull ComputeManagement client) {
        this(executorService, client, null);
    }

    public ComputeManagementWaiters(
            @jakarta.annotation.Nonnull java.util.concurrent.ExecutorService executorService,
            @jakarta.annotation.Nonnull ComputeManagement client,
            com.oracle.bmc.workrequests.WorkRequest workRequestClient) {
        if (executorService == null) {
            throw new NullPointerException("executorService is marked non-null but is null");
        }
        if (client == null) {
            throw new NullPointerException("client is marked non-null but is null");
        }
        this.executorService = executorService;
        this.client = client;
        this.workRequestClient = workRequestClient;
    }

    /**
     * Creates a new {@link com.oracle.bmc.waiter.Waiter} using the default configuration.
     *
     * @param request the request to send
     * @return a new {@link com.oracle.bmc.waiter.Waiter} instance
     */
    public com.oracle.bmc.waiter.Waiter<
                    AttachInstancePoolInstanceRequest, AttachInstancePoolInstanceResponse>
            forAttachInstancePoolInstance(AttachInstancePoolInstanceRequest request) {
        return forAttachInstancePoolInstance(
                request,
                com.oracle.bmc.waiter.Waiters.DEFAULT_POLLING_TERMINATION_STRATEGY,
                com.oracle.bmc.waiter.Waiters.DEFAULT_POLLING_DELAY_STRATEGY);
    }

    /**
     * Creates a new {@link com.oracle.bmc.waiter.Waiter} using the provided configuration.
     *
     * @param request the request to send
     * @param terminationStrategy the {@link com.oracle.bmc.waiter.TerminationStrategy} to use
     * @param delayStrategy the {@link com.oracle.bmc.waiter.DelayStrategy} to use
     * @return a new {@link com.oracle.bmc.waiter.Waiter} instance
     */
    public com.oracle.bmc.waiter.Waiter<
                    AttachInstancePoolInstanceRequest, AttachInstancePoolInstanceResponse>
            forAttachInstancePoolInstance(
                    AttachInstancePoolInstanceRequest request,
                    com.oracle.bmc.waiter.TerminationStrategy terminationStrategy,
                    com.oracle.bmc.waiter.DelayStrategy delayStrategy) {
        if (workRequestClient == null) {
            throw new IllegalStateException(
                    "A WorkRequestClient must be supplied to this waiter for this operation");
        }

        return new com.oracle.bmc.waiter.internal.SimpleWaiterImpl<>(
                executorService,
                new java.util.concurrent.Callable<AttachInstancePoolInstanceResponse>() {
                    @Override
                    public AttachInstancePoolInstanceResponse call() throws Exception {
                        final AttachInstancePoolInstanceResponse response =
                                client.attachInstancePoolInstance(request);

                        if (response.getOpcWorkRequestId() != null) {
                            final com.oracle.bmc.workrequests.requests.GetWorkRequestRequest
                                    getWorkRequestRequest =
                                            com.oracle.bmc.workrequests.requests
                                                    .GetWorkRequestRequest.builder()
                                                    .workRequestId(response.getOpcWorkRequestId())
                                                    .build();
                            workRequestClient
                                    .getWaiters()
                                    .forWorkRequest(
                                            getWorkRequestRequest,
                                            terminationStrategy,
                                            delayStrategy)
                                    .execute();
                        }
                        return response;
                    }
                },
                request);
    }

    /**
     * Creates a new {@link com.oracle.bmc.waiter.Waiter} using the default configuration.
     *
     * @param request the request to send
     * @return a new {@link com.oracle.bmc.waiter.Waiter} instance
     */
    public com.oracle.bmc.waiter.Waiter<CreateClusterNetworkRequest, CreateClusterNetworkResponse>
            forCreateClusterNetwork(CreateClusterNetworkRequest request) {
        return forCreateClusterNetwork(
                request,
                com.oracle.bmc.waiter.Waiters.DEFAULT_POLLING_TERMINATION_STRATEGY,
                com.oracle.bmc.waiter.Waiters.DEFAULT_POLLING_DELAY_STRATEGY);
    }

    /**
     * Creates a new {@link com.oracle.bmc.waiter.Waiter} using the provided configuration.
     *
     * @param request the request to send
     * @param terminationStrategy the {@link com.oracle.bmc.waiter.TerminationStrategy} to use
     * @param delayStrategy the {@link com.oracle.bmc.waiter.DelayStrategy} to use
     * @return a new {@link com.oracle.bmc.waiter.Waiter} instance
     */
    public com.oracle.bmc.waiter.Waiter<CreateClusterNetworkRequest, CreateClusterNetworkResponse>
            forCreateClusterNetwork(
                    CreateClusterNetworkRequest request,
                    com.oracle.bmc.waiter.TerminationStrategy terminationStrategy,
                    com.oracle.bmc.waiter.DelayStrategy delayStrategy) {
        if (workRequestClient == null) {
            throw new IllegalStateException(
                    "A WorkRequestClient must be supplied to this waiter for this operation");
        }

        return new com.oracle.bmc.waiter.internal.SimpleWaiterImpl<>(
                executorService,
                new java.util.concurrent.Callable<CreateClusterNetworkResponse>() {
                    @Override
                    public CreateClusterNetworkResponse call() throws Exception {
                        final CreateClusterNetworkResponse response =
                                client.createClusterNetwork(request);

                        if (response.getOpcWorkRequestId() != null) {
                            final com.oracle.bmc.workrequests.requests.GetWorkRequestRequest
                                    getWorkRequestRequest =
                                            com.oracle.bmc.workrequests.requests
                                                    .GetWorkRequestRequest.builder()
                                                    .workRequestId(response.getOpcWorkRequestId())
                                                    .build();
                            workRequestClient
                                    .getWaiters()
                                    .forWorkRequest(
                                            getWorkRequestRequest,
                                            terminationStrategy,
                                            delayStrategy)
                                    .execute();
                        }
                        return response;
                    }
                },
                request);
    }

    /**
     * Creates a new {@link com.oracle.bmc.waiter.Waiter} using the default configuration.
     *
     * @param request the request to send
     * @return a new {@link com.oracle.bmc.waiter.Waiter} instance
     */
    public com.oracle.bmc.waiter.Waiter<
                    DetachInstancePoolInstanceRequest, DetachInstancePoolInstanceResponse>
            forDetachInstancePoolInstance(DetachInstancePoolInstanceRequest request) {
        return forDetachInstancePoolInstance(
                request,
                com.oracle.bmc.waiter.Waiters.DEFAULT_POLLING_TERMINATION_STRATEGY,
                com.oracle.bmc.waiter.Waiters.DEFAULT_POLLING_DELAY_STRATEGY);
    }

    /**
     * Creates a new {@link com.oracle.bmc.waiter.Waiter} using the provided configuration.
     *
     * @param request the request to send
     * @param terminationStrategy the {@link com.oracle.bmc.waiter.TerminationStrategy} to use
     * @param delayStrategy the {@link com.oracle.bmc.waiter.DelayStrategy} to use
     * @return a new {@link com.oracle.bmc.waiter.Waiter} instance
     */
    public com.oracle.bmc.waiter.Waiter<
                    DetachInstancePoolInstanceRequest, DetachInstancePoolInstanceResponse>
            forDetachInstancePoolInstance(
                    DetachInstancePoolInstanceRequest request,
                    com.oracle.bmc.waiter.TerminationStrategy terminationStrategy,
                    com.oracle.bmc.waiter.DelayStrategy delayStrategy) {
        if (workRequestClient == null) {
            throw new IllegalStateException(
                    "A WorkRequestClient must be supplied to this waiter for this operation");
        }

        return new com.oracle.bmc.waiter.internal.SimpleWaiterImpl<>(
                executorService,
                new java.util.concurrent.Callable<DetachInstancePoolInstanceResponse>() {
                    @Override
                    public DetachInstancePoolInstanceResponse call() throws Exception {
                        final DetachInstancePoolInstanceResponse response =
                                client.detachInstancePoolInstance(request);

                        if (response.getOpcWorkRequestId() != null) {
                            final com.oracle.bmc.workrequests.requests.GetWorkRequestRequest
                                    getWorkRequestRequest =
                                            com.oracle.bmc.workrequests.requests
                                                    .GetWorkRequestRequest.builder()
                                                    .workRequestId(response.getOpcWorkRequestId())
                                                    .build();
                            workRequestClient
                                    .getWaiters()
                                    .forWorkRequest(
                                            getWorkRequestRequest,
                                            terminationStrategy,
                                            delayStrategy)
                                    .execute();
                        }
                        return response;
                    }
                },
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
    public com.oracle.bmc.waiter.Waiter<GetClusterNetworkRequest, GetClusterNetworkResponse>
            forClusterNetwork(
                    GetClusterNetworkRequest request,
                    com.oracle.bmc.core.model.ClusterNetwork.LifecycleState... targetStates) {
        com.oracle.bmc.util.internal.Validate.notEmpty(
                targetStates, "At least one targetState must be provided");
        com.oracle.bmc.util.internal.Validate.noNullElements(
                targetStates, "Null targetState values are not permitted");

        return forClusterNetwork(
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
    public com.oracle.bmc.waiter.Waiter<GetClusterNetworkRequest, GetClusterNetworkResponse>
            forClusterNetwork(
                    GetClusterNetworkRequest request,
                    com.oracle.bmc.core.model.ClusterNetwork.LifecycleState targetState,
                    com.oracle.bmc.waiter.TerminationStrategy terminationStrategy,
                    com.oracle.bmc.waiter.DelayStrategy delayStrategy) {
        com.oracle.bmc.util.internal.Validate.notNull(
                targetState, "The targetState cannot be null");

        return forClusterNetwork(
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
    public com.oracle.bmc.waiter.Waiter<GetClusterNetworkRequest, GetClusterNetworkResponse>
            forClusterNetwork(
                    GetClusterNetworkRequest request,
                    com.oracle.bmc.waiter.TerminationStrategy terminationStrategy,
                    com.oracle.bmc.waiter.DelayStrategy delayStrategy,
                    com.oracle.bmc.core.model.ClusterNetwork.LifecycleState... targetStates) {
        com.oracle.bmc.util.internal.Validate.notEmpty(
                targetStates, "At least one target state must be provided");
        com.oracle.bmc.util.internal.Validate.noNullElements(
                targetStates, "Null target states are not permitted");

        return forClusterNetwork(
                com.oracle.bmc.waiter.Waiters.newWaiter(terminationStrategy, delayStrategy),
                request,
                targetStates);
    }

    // Helper method to create a new Waiter for ClusterNetwork.
    private com.oracle.bmc.waiter.Waiter<GetClusterNetworkRequest, GetClusterNetworkResponse>
            forClusterNetwork(
                    com.oracle.bmc.waiter.BmcGenericWaiter waiter,
                    final GetClusterNetworkRequest request,
                    final com.oracle.bmc.core.model.ClusterNetwork.LifecycleState... targetStates) {
        final java.util.Set<com.oracle.bmc.core.model.ClusterNetwork.LifecycleState>
                targetStatesSet = new java.util.HashSet<>(java.util.Arrays.asList(targetStates));

        return new com.oracle.bmc.waiter.internal.SimpleWaiterImpl<>(
                executorService,
                waiter.toCallable(
                        () -> request,
                        new java.util.function.Function<
                                GetClusterNetworkRequest, GetClusterNetworkResponse>() {
                            @Override
                            public GetClusterNetworkResponse apply(
                                    GetClusterNetworkRequest request) {
                                return client.getClusterNetwork(request);
                            }
                        },
                        new java.util.function.Predicate<GetClusterNetworkResponse>() {
                            @Override
                            public boolean test(GetClusterNetworkResponse response) {
                                return targetStatesSet.contains(
                                        response.getClusterNetwork().getLifecycleState());
                            }
                        },
                        targetStatesSet.contains(
                                com.oracle.bmc.core.model.ClusterNetwork.LifecycleState
                                        .Terminated)),
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
    public com.oracle.bmc.waiter.Waiter<GetInstancePoolRequest, GetInstancePoolResponse>
            forInstancePool(
                    GetInstancePoolRequest request,
                    com.oracle.bmc.core.model.InstancePool.LifecycleState... targetStates) {
        com.oracle.bmc.util.internal.Validate.notEmpty(
                targetStates, "At least one targetState must be provided");
        com.oracle.bmc.util.internal.Validate.noNullElements(
                targetStates, "Null targetState values are not permitted");

        return forInstancePool(
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
    public com.oracle.bmc.waiter.Waiter<GetInstancePoolRequest, GetInstancePoolResponse>
            forInstancePool(
                    GetInstancePoolRequest request,
                    com.oracle.bmc.core.model.InstancePool.LifecycleState targetState,
                    com.oracle.bmc.waiter.TerminationStrategy terminationStrategy,
                    com.oracle.bmc.waiter.DelayStrategy delayStrategy) {
        com.oracle.bmc.util.internal.Validate.notNull(
                targetState, "The targetState cannot be null");

        return forInstancePool(
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
    public com.oracle.bmc.waiter.Waiter<GetInstancePoolRequest, GetInstancePoolResponse>
            forInstancePool(
                    GetInstancePoolRequest request,
                    com.oracle.bmc.waiter.TerminationStrategy terminationStrategy,
                    com.oracle.bmc.waiter.DelayStrategy delayStrategy,
                    com.oracle.bmc.core.model.InstancePool.LifecycleState... targetStates) {
        com.oracle.bmc.util.internal.Validate.notEmpty(
                targetStates, "At least one target state must be provided");
        com.oracle.bmc.util.internal.Validate.noNullElements(
                targetStates, "Null target states are not permitted");

        return forInstancePool(
                com.oracle.bmc.waiter.Waiters.newWaiter(terminationStrategy, delayStrategy),
                request,
                targetStates);
    }

    // Helper method to create a new Waiter for InstancePool.
    private com.oracle.bmc.waiter.Waiter<GetInstancePoolRequest, GetInstancePoolResponse>
            forInstancePool(
                    com.oracle.bmc.waiter.BmcGenericWaiter waiter,
                    final GetInstancePoolRequest request,
                    final com.oracle.bmc.core.model.InstancePool.LifecycleState... targetStates) {
        final java.util.Set<com.oracle.bmc.core.model.InstancePool.LifecycleState> targetStatesSet =
                new java.util.HashSet<>(java.util.Arrays.asList(targetStates));

        return new com.oracle.bmc.waiter.internal.SimpleWaiterImpl<>(
                executorService,
                waiter.toCallable(
                        () -> request,
                        new java.util.function.Function<
                                GetInstancePoolRequest, GetInstancePoolResponse>() {
                            @Override
                            public GetInstancePoolResponse apply(GetInstancePoolRequest request) {
                                return client.getInstancePool(request);
                            }
                        },
                        new java.util.function.Predicate<GetInstancePoolResponse>() {
                            @Override
                            public boolean test(GetInstancePoolResponse response) {
                                return targetStatesSet.contains(
                                        response.getInstancePool().getLifecycleState());
                            }
                        },
                        targetStatesSet.contains(
                                com.oracle.bmc.core.model.InstancePool.LifecycleState.Terminated)),
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
                    GetInstancePoolInstanceRequest, GetInstancePoolInstanceResponse>
            forInstancePoolInstance(
                    GetInstancePoolInstanceRequest request,
                    com.oracle.bmc.core.model.InstancePoolInstance.LifecycleState... targetStates) {
        com.oracle.bmc.util.internal.Validate.notEmpty(
                targetStates, "At least one targetState must be provided");
        com.oracle.bmc.util.internal.Validate.noNullElements(
                targetStates, "Null targetState values are not permitted");

        return forInstancePoolInstance(
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
                    GetInstancePoolInstanceRequest, GetInstancePoolInstanceResponse>
            forInstancePoolInstance(
                    GetInstancePoolInstanceRequest request,
                    com.oracle.bmc.core.model.InstancePoolInstance.LifecycleState targetState,
                    com.oracle.bmc.waiter.TerminationStrategy terminationStrategy,
                    com.oracle.bmc.waiter.DelayStrategy delayStrategy) {
        com.oracle.bmc.util.internal.Validate.notNull(
                targetState, "The targetState cannot be null");

        return forInstancePoolInstance(
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
                    GetInstancePoolInstanceRequest, GetInstancePoolInstanceResponse>
            forInstancePoolInstance(
                    GetInstancePoolInstanceRequest request,
                    com.oracle.bmc.waiter.TerminationStrategy terminationStrategy,
                    com.oracle.bmc.waiter.DelayStrategy delayStrategy,
                    com.oracle.bmc.core.model.InstancePoolInstance.LifecycleState... targetStates) {
        com.oracle.bmc.util.internal.Validate.notEmpty(
                targetStates, "At least one target state must be provided");
        com.oracle.bmc.util.internal.Validate.noNullElements(
                targetStates, "Null target states are not permitted");

        return forInstancePoolInstance(
                com.oracle.bmc.waiter.Waiters.newWaiter(terminationStrategy, delayStrategy),
                request,
                targetStates);
    }

    // Helper method to create a new Waiter for InstancePoolInstance.
    private com.oracle.bmc.waiter.Waiter<
                    GetInstancePoolInstanceRequest, GetInstancePoolInstanceResponse>
            forInstancePoolInstance(
                    com.oracle.bmc.waiter.BmcGenericWaiter waiter,
                    final GetInstancePoolInstanceRequest request,
                    final com.oracle.bmc.core.model.InstancePoolInstance.LifecycleState...
                            targetStates) {
        final java.util.Set<com.oracle.bmc.core.model.InstancePoolInstance.LifecycleState>
                targetStatesSet = new java.util.HashSet<>(java.util.Arrays.asList(targetStates));

        return new com.oracle.bmc.waiter.internal.SimpleWaiterImpl<>(
                executorService,
                waiter.toCallable(
                        () -> request,
                        new java.util.function.Function<
                                GetInstancePoolInstanceRequest, GetInstancePoolInstanceResponse>() {
                            @Override
                            public GetInstancePoolInstanceResponse apply(
                                    GetInstancePoolInstanceRequest request) {
                                return client.getInstancePoolInstance(request);
                            }
                        },
                        new java.util.function.Predicate<GetInstancePoolInstanceResponse>() {
                            @Override
                            public boolean test(GetInstancePoolInstanceResponse response) {
                                return targetStatesSet.contains(
                                        response.getInstancePoolInstance().getLifecycleState());
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
    public com.oracle.bmc.waiter.Waiter<
                    GetInstancePoolLoadBalancerAttachmentRequest,
                    GetInstancePoolLoadBalancerAttachmentResponse>
            forInstancePoolLoadBalancerAttachment(
                    GetInstancePoolLoadBalancerAttachmentRequest request,
                    com.oracle.bmc.core.model.InstancePoolLoadBalancerAttachment.LifecycleState...
                            targetStates) {
        com.oracle.bmc.util.internal.Validate.notEmpty(
                targetStates, "At least one targetState must be provided");
        com.oracle.bmc.util.internal.Validate.noNullElements(
                targetStates, "Null targetState values are not permitted");

        return forInstancePoolLoadBalancerAttachment(
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
                    GetInstancePoolLoadBalancerAttachmentRequest,
                    GetInstancePoolLoadBalancerAttachmentResponse>
            forInstancePoolLoadBalancerAttachment(
                    GetInstancePoolLoadBalancerAttachmentRequest request,
                    com.oracle.bmc.core.model.InstancePoolLoadBalancerAttachment.LifecycleState
                            targetState,
                    com.oracle.bmc.waiter.TerminationStrategy terminationStrategy,
                    com.oracle.bmc.waiter.DelayStrategy delayStrategy) {
        com.oracle.bmc.util.internal.Validate.notNull(
                targetState, "The targetState cannot be null");

        return forInstancePoolLoadBalancerAttachment(
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
                    GetInstancePoolLoadBalancerAttachmentRequest,
                    GetInstancePoolLoadBalancerAttachmentResponse>
            forInstancePoolLoadBalancerAttachment(
                    GetInstancePoolLoadBalancerAttachmentRequest request,
                    com.oracle.bmc.waiter.TerminationStrategy terminationStrategy,
                    com.oracle.bmc.waiter.DelayStrategy delayStrategy,
                    com.oracle.bmc.core.model.InstancePoolLoadBalancerAttachment.LifecycleState...
                            targetStates) {
        com.oracle.bmc.util.internal.Validate.notEmpty(
                targetStates, "At least one target state must be provided");
        com.oracle.bmc.util.internal.Validate.noNullElements(
                targetStates, "Null target states are not permitted");

        return forInstancePoolLoadBalancerAttachment(
                com.oracle.bmc.waiter.Waiters.newWaiter(terminationStrategy, delayStrategy),
                request,
                targetStates);
    }

    // Helper method to create a new Waiter for InstancePoolLoadBalancerAttachment.
    private com.oracle.bmc.waiter.Waiter<
                    GetInstancePoolLoadBalancerAttachmentRequest,
                    GetInstancePoolLoadBalancerAttachmentResponse>
            forInstancePoolLoadBalancerAttachment(
                    com.oracle.bmc.waiter.BmcGenericWaiter waiter,
                    final GetInstancePoolLoadBalancerAttachmentRequest request,
                    final com.oracle.bmc.core.model.InstancePoolLoadBalancerAttachment
                                            .LifecycleState
                                    ...
                            targetStates) {
        final java.util.Set<
                        com.oracle.bmc.core.model.InstancePoolLoadBalancerAttachment.LifecycleState>
                targetStatesSet = new java.util.HashSet<>(java.util.Arrays.asList(targetStates));

        return new com.oracle.bmc.waiter.internal.SimpleWaiterImpl<>(
                executorService,
                waiter.toCallable(
                        () -> request,
                        new java.util.function.Function<
                                GetInstancePoolLoadBalancerAttachmentRequest,
                                GetInstancePoolLoadBalancerAttachmentResponse>() {
                            @Override
                            public GetInstancePoolLoadBalancerAttachmentResponse apply(
                                    GetInstancePoolLoadBalancerAttachmentRequest request) {
                                return client.getInstancePoolLoadBalancerAttachment(request);
                            }
                        },
                        new java.util.function.Predicate<
                                GetInstancePoolLoadBalancerAttachmentResponse>() {
                            @Override
                            public boolean test(
                                    GetInstancePoolLoadBalancerAttachmentResponse response) {
                                return targetStatesSet.contains(
                                        response.getInstancePoolLoadBalancerAttachment()
                                                .getLifecycleState());
                            }
                        },
                        false),
                request);
    }

    /**
     * Creates a new {@link com.oracle.bmc.waiter.Waiter} using the default configuration.
     *
     * @param request the request to send
     * @return a new {@link com.oracle.bmc.waiter.Waiter} instance
     */
    public com.oracle.bmc.waiter.Waiter<
                    LaunchInstanceConfigurationRequest, LaunchInstanceConfigurationResponse>
            forLaunchInstanceConfiguration(LaunchInstanceConfigurationRequest request) {
        return forLaunchInstanceConfiguration(
                request,
                com.oracle.bmc.waiter.Waiters.DEFAULT_POLLING_TERMINATION_STRATEGY,
                com.oracle.bmc.waiter.Waiters.DEFAULT_POLLING_DELAY_STRATEGY);
    }

    /**
     * Creates a new {@link com.oracle.bmc.waiter.Waiter} using the provided configuration.
     *
     * @param request the request to send
     * @param terminationStrategy the {@link com.oracle.bmc.waiter.TerminationStrategy} to use
     * @param delayStrategy the {@link com.oracle.bmc.waiter.DelayStrategy} to use
     * @return a new {@link com.oracle.bmc.waiter.Waiter} instance
     */
    public com.oracle.bmc.waiter.Waiter<
                    LaunchInstanceConfigurationRequest, LaunchInstanceConfigurationResponse>
            forLaunchInstanceConfiguration(
                    LaunchInstanceConfigurationRequest request,
                    com.oracle.bmc.waiter.TerminationStrategy terminationStrategy,
                    com.oracle.bmc.waiter.DelayStrategy delayStrategy) {
        if (workRequestClient == null) {
            throw new IllegalStateException(
                    "A WorkRequestClient must be supplied to this waiter for this operation");
        }

        return new com.oracle.bmc.waiter.internal.SimpleWaiterImpl<>(
                executorService,
                new java.util.concurrent.Callable<LaunchInstanceConfigurationResponse>() {
                    @Override
                    public LaunchInstanceConfigurationResponse call() throws Exception {
                        final LaunchInstanceConfigurationResponse response =
                                client.launchInstanceConfiguration(request);

                        if (response.getOpcWorkRequestId() != null) {
                            final com.oracle.bmc.workrequests.requests.GetWorkRequestRequest
                                    getWorkRequestRequest =
                                            com.oracle.bmc.workrequests.requests
                                                    .GetWorkRequestRequest.builder()
                                                    .workRequestId(response.getOpcWorkRequestId())
                                                    .build();
                            workRequestClient
                                    .getWaiters()
                                    .forWorkRequest(
                                            getWorkRequestRequest,
                                            terminationStrategy,
                                            delayStrategy)
                                    .execute();
                        }
                        return response;
                    }
                },
                request);
    }

    /**
     * Creates a new {@link com.oracle.bmc.waiter.Waiter} using the default configuration.
     *
     * @param request the request to send
     * @return a new {@link com.oracle.bmc.waiter.Waiter} instance
     */
    public com.oracle.bmc.waiter.Waiter<
                    TerminateClusterNetworkRequest, TerminateClusterNetworkResponse>
            forTerminateClusterNetwork(TerminateClusterNetworkRequest request) {
        return forTerminateClusterNetwork(
                request,
                com.oracle.bmc.waiter.Waiters.DEFAULT_POLLING_TERMINATION_STRATEGY,
                com.oracle.bmc.waiter.Waiters.DEFAULT_POLLING_DELAY_STRATEGY);
    }

    /**
     * Creates a new {@link com.oracle.bmc.waiter.Waiter} using the provided configuration.
     *
     * @param request the request to send
     * @param terminationStrategy the {@link com.oracle.bmc.waiter.TerminationStrategy} to use
     * @param delayStrategy the {@link com.oracle.bmc.waiter.DelayStrategy} to use
     * @return a new {@link com.oracle.bmc.waiter.Waiter} instance
     */
    public com.oracle.bmc.waiter.Waiter<
                    TerminateClusterNetworkRequest, TerminateClusterNetworkResponse>
            forTerminateClusterNetwork(
                    TerminateClusterNetworkRequest request,
                    com.oracle.bmc.waiter.TerminationStrategy terminationStrategy,
                    com.oracle.bmc.waiter.DelayStrategy delayStrategy) {
        if (workRequestClient == null) {
            throw new IllegalStateException(
                    "A WorkRequestClient must be supplied to this waiter for this operation");
        }

        return new com.oracle.bmc.waiter.internal.SimpleWaiterImpl<>(
                executorService,
                new java.util.concurrent.Callable<TerminateClusterNetworkResponse>() {
                    @Override
                    public TerminateClusterNetworkResponse call() throws Exception {
                        final TerminateClusterNetworkResponse response =
                                client.terminateClusterNetwork(request);

                        if (response.getOpcWorkRequestId() != null) {
                            final com.oracle.bmc.workrequests.requests.GetWorkRequestRequest
                                    getWorkRequestRequest =
                                            com.oracle.bmc.workrequests.requests
                                                    .GetWorkRequestRequest.builder()
                                                    .workRequestId(response.getOpcWorkRequestId())
                                                    .build();
                            workRequestClient
                                    .getWaiters()
                                    .forWorkRequest(
                                            getWorkRequestRequest,
                                            terminationStrategy,
                                            delayStrategy)
                                    .execute();
                        }
                        return response;
                    }
                },
                request);
    }
}
