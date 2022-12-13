/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.servicemesh;

import com.oracle.bmc.servicemesh.requests.*;
import com.oracle.bmc.servicemesh.responses.*;

/**
 * Collection of helper methods to produce {@link com.oracle.bmc.waiter.Waiter}s for different
 * resources of ServiceMesh.
 * <p>
 * The default configuration used is defined by {@link com.oracle.bmc.waiter.Waiters.Waiters#DEFAULT_POLLING_WAITER}.
 */
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20220615")
public class ServiceMeshWaiters {
    private final java.util.concurrent.ExecutorService executorService;
    private final ServiceMesh client;

    public ServiceMeshWaiters(
            java.util.concurrent.ExecutorService executorService, ServiceMesh client) {
        this.executorService = executorService;
        this.client = client;
    }

    /**
     * Creates a new {@link com.oracle.bmc.waiter.Waiter} using the default configuration.
     *
     * @param request the request to send
     * @param targetStates the desired states to wait for. If multiple states are provided then the waiter will return once the resource reaches any of the provided states
     * @return a new {@code Waiter} instance
     */
    public com.oracle.bmc.waiter.Waiter<GetAccessPolicyRequest, GetAccessPolicyResponse>
            forAccessPolicy(
                    GetAccessPolicyRequest request,
                    com.oracle.bmc.servicemesh.model.AccessPolicy.LifecycleState... targetStates) {
        com.oracle.bmc.util.internal.Validate.notEmpty(
                targetStates, "At least one targetState must be provided");
        com.oracle.bmc.util.internal.Validate.noNullElements(
                targetStates, "Null targetState values are not permitted");

        return forAccessPolicy(
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
    public com.oracle.bmc.waiter.Waiter<GetAccessPolicyRequest, GetAccessPolicyResponse>
            forAccessPolicy(
                    GetAccessPolicyRequest request,
                    com.oracle.bmc.servicemesh.model.AccessPolicy.LifecycleState targetState,
                    com.oracle.bmc.waiter.TerminationStrategy terminationStrategy,
                    com.oracle.bmc.waiter.DelayStrategy delayStrategy) {
        com.oracle.bmc.util.internal.Validate.notNull(
                targetState, "The targetState cannot be null");

        return forAccessPolicy(
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
    public com.oracle.bmc.waiter.Waiter<GetAccessPolicyRequest, GetAccessPolicyResponse>
            forAccessPolicy(
                    GetAccessPolicyRequest request,
                    com.oracle.bmc.waiter.TerminationStrategy terminationStrategy,
                    com.oracle.bmc.waiter.DelayStrategy delayStrategy,
                    com.oracle.bmc.servicemesh.model.AccessPolicy.LifecycleState... targetStates) {
        com.oracle.bmc.util.internal.Validate.notEmpty(
                targetStates, "At least one target state must be provided");
        com.oracle.bmc.util.internal.Validate.noNullElements(
                targetStates, "Null target states are not permitted");

        return forAccessPolicy(
                com.oracle.bmc.waiter.Waiters.newWaiter(terminationStrategy, delayStrategy),
                request,
                targetStates);
    }

    // Helper method to create a new Waiter for AccessPolicy.
    private com.oracle.bmc.waiter.Waiter<GetAccessPolicyRequest, GetAccessPolicyResponse>
            forAccessPolicy(
                    com.oracle.bmc.waiter.BmcGenericWaiter waiter,
                    final GetAccessPolicyRequest request,
                    final com.oracle.bmc.servicemesh.model.AccessPolicy.LifecycleState...
                            targetStates) {
        final java.util.Set<com.oracle.bmc.servicemesh.model.AccessPolicy.LifecycleState>
                targetStatesSet = new java.util.HashSet<>(java.util.Arrays.asList(targetStates));

        return new com.oracle.bmc.waiter.internal.SimpleWaiterImpl<>(
                executorService,
                waiter.toCallable(
                        () -> request,
                        new java.util.function.Function<
                                GetAccessPolicyRequest, GetAccessPolicyResponse>() {
                            @Override
                            public GetAccessPolicyResponse apply(GetAccessPolicyRequest request) {
                                return client.getAccessPolicy(request);
                            }
                        },
                        new java.util.function.Predicate<GetAccessPolicyResponse>() {
                            @Override
                            public boolean test(GetAccessPolicyResponse response) {
                                return targetStatesSet.contains(
                                        response.getAccessPolicy().getLifecycleState());
                            }
                        },
                        targetStatesSet.contains(
                                com.oracle.bmc.servicemesh.model.AccessPolicy.LifecycleState
                                        .Deleted)),
                request);
    }

    /**
     * Creates a new {@link com.oracle.bmc.waiter.Waiter} using the default configuration.
     *
     * @param request the request to send
     * @param targetStates the desired states to wait for. If multiple states are provided then the waiter will return once the resource reaches any of the provided states
     * @return a new {@code Waiter} instance
     */
    public com.oracle.bmc.waiter.Waiter<GetIngressGatewayRequest, GetIngressGatewayResponse>
            forIngressGateway(
                    GetIngressGatewayRequest request,
                    com.oracle.bmc.servicemesh.model.IngressGateway.LifecycleState...
                            targetStates) {
        com.oracle.bmc.util.internal.Validate.notEmpty(
                targetStates, "At least one targetState must be provided");
        com.oracle.bmc.util.internal.Validate.noNullElements(
                targetStates, "Null targetState values are not permitted");

        return forIngressGateway(
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
    public com.oracle.bmc.waiter.Waiter<GetIngressGatewayRequest, GetIngressGatewayResponse>
            forIngressGateway(
                    GetIngressGatewayRequest request,
                    com.oracle.bmc.servicemesh.model.IngressGateway.LifecycleState targetState,
                    com.oracle.bmc.waiter.TerminationStrategy terminationStrategy,
                    com.oracle.bmc.waiter.DelayStrategy delayStrategy) {
        com.oracle.bmc.util.internal.Validate.notNull(
                targetState, "The targetState cannot be null");

        return forIngressGateway(
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
    public com.oracle.bmc.waiter.Waiter<GetIngressGatewayRequest, GetIngressGatewayResponse>
            forIngressGateway(
                    GetIngressGatewayRequest request,
                    com.oracle.bmc.waiter.TerminationStrategy terminationStrategy,
                    com.oracle.bmc.waiter.DelayStrategy delayStrategy,
                    com.oracle.bmc.servicemesh.model.IngressGateway.LifecycleState...
                            targetStates) {
        com.oracle.bmc.util.internal.Validate.notEmpty(
                targetStates, "At least one target state must be provided");
        com.oracle.bmc.util.internal.Validate.noNullElements(
                targetStates, "Null target states are not permitted");

        return forIngressGateway(
                com.oracle.bmc.waiter.Waiters.newWaiter(terminationStrategy, delayStrategy),
                request,
                targetStates);
    }

    // Helper method to create a new Waiter for IngressGateway.
    private com.oracle.bmc.waiter.Waiter<GetIngressGatewayRequest, GetIngressGatewayResponse>
            forIngressGateway(
                    com.oracle.bmc.waiter.BmcGenericWaiter waiter,
                    final GetIngressGatewayRequest request,
                    final com.oracle.bmc.servicemesh.model.IngressGateway.LifecycleState...
                            targetStates) {
        final java.util.Set<com.oracle.bmc.servicemesh.model.IngressGateway.LifecycleState>
                targetStatesSet = new java.util.HashSet<>(java.util.Arrays.asList(targetStates));

        return new com.oracle.bmc.waiter.internal.SimpleWaiterImpl<>(
                executorService,
                waiter.toCallable(
                        () -> request,
                        new java.util.function.Function<
                                GetIngressGatewayRequest, GetIngressGatewayResponse>() {
                            @Override
                            public GetIngressGatewayResponse apply(
                                    GetIngressGatewayRequest request) {
                                return client.getIngressGateway(request);
                            }
                        },
                        new java.util.function.Predicate<GetIngressGatewayResponse>() {
                            @Override
                            public boolean test(GetIngressGatewayResponse response) {
                                return targetStatesSet.contains(
                                        response.getIngressGateway().getLifecycleState());
                            }
                        },
                        targetStatesSet.contains(
                                com.oracle.bmc.servicemesh.model.IngressGateway.LifecycleState
                                        .Deleted)),
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
                    GetIngressGatewayRouteTableRequest, GetIngressGatewayRouteTableResponse>
            forIngressGatewayRouteTable(
                    GetIngressGatewayRouteTableRequest request,
                    com.oracle.bmc.servicemesh.model.IngressGatewayRouteTable.LifecycleState...
                            targetStates) {
        com.oracle.bmc.util.internal.Validate.notEmpty(
                targetStates, "At least one targetState must be provided");
        com.oracle.bmc.util.internal.Validate.noNullElements(
                targetStates, "Null targetState values are not permitted");

        return forIngressGatewayRouteTable(
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
                    GetIngressGatewayRouteTableRequest, GetIngressGatewayRouteTableResponse>
            forIngressGatewayRouteTable(
                    GetIngressGatewayRouteTableRequest request,
                    com.oracle.bmc.servicemesh.model.IngressGatewayRouteTable.LifecycleState
                            targetState,
                    com.oracle.bmc.waiter.TerminationStrategy terminationStrategy,
                    com.oracle.bmc.waiter.DelayStrategy delayStrategy) {
        com.oracle.bmc.util.internal.Validate.notNull(
                targetState, "The targetState cannot be null");

        return forIngressGatewayRouteTable(
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
                    GetIngressGatewayRouteTableRequest, GetIngressGatewayRouteTableResponse>
            forIngressGatewayRouteTable(
                    GetIngressGatewayRouteTableRequest request,
                    com.oracle.bmc.waiter.TerminationStrategy terminationStrategy,
                    com.oracle.bmc.waiter.DelayStrategy delayStrategy,
                    com.oracle.bmc.servicemesh.model.IngressGatewayRouteTable.LifecycleState...
                            targetStates) {
        com.oracle.bmc.util.internal.Validate.notEmpty(
                targetStates, "At least one target state must be provided");
        com.oracle.bmc.util.internal.Validate.noNullElements(
                targetStates, "Null target states are not permitted");

        return forIngressGatewayRouteTable(
                com.oracle.bmc.waiter.Waiters.newWaiter(terminationStrategy, delayStrategy),
                request,
                targetStates);
    }

    // Helper method to create a new Waiter for IngressGatewayRouteTable.
    private com.oracle.bmc.waiter.Waiter<
                    GetIngressGatewayRouteTableRequest, GetIngressGatewayRouteTableResponse>
            forIngressGatewayRouteTable(
                    com.oracle.bmc.waiter.BmcGenericWaiter waiter,
                    final GetIngressGatewayRouteTableRequest request,
                    final com.oracle.bmc.servicemesh.model.IngressGatewayRouteTable
                                    .LifecycleState...
                            targetStates) {
        final java.util.Set<
                        com.oracle.bmc.servicemesh.model.IngressGatewayRouteTable.LifecycleState>
                targetStatesSet = new java.util.HashSet<>(java.util.Arrays.asList(targetStates));

        return new com.oracle.bmc.waiter.internal.SimpleWaiterImpl<>(
                executorService,
                waiter.toCallable(
                        () -> request,
                        new java.util.function.Function<
                                GetIngressGatewayRouteTableRequest,
                                GetIngressGatewayRouteTableResponse>() {
                            @Override
                            public GetIngressGatewayRouteTableResponse apply(
                                    GetIngressGatewayRouteTableRequest request) {
                                return client.getIngressGatewayRouteTable(request);
                            }
                        },
                        new java.util.function.Predicate<GetIngressGatewayRouteTableResponse>() {
                            @Override
                            public boolean test(GetIngressGatewayRouteTableResponse response) {
                                return targetStatesSet.contains(
                                        response.getIngressGatewayRouteTable().getLifecycleState());
                            }
                        },
                        targetStatesSet.contains(
                                com.oracle.bmc.servicemesh.model.IngressGatewayRouteTable
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
    public com.oracle.bmc.waiter.Waiter<GetMeshRequest, GetMeshResponse> forMesh(
            GetMeshRequest request,
            com.oracle.bmc.servicemesh.model.Mesh.LifecycleState... targetStates) {
        com.oracle.bmc.util.internal.Validate.notEmpty(
                targetStates, "At least one targetState must be provided");
        com.oracle.bmc.util.internal.Validate.noNullElements(
                targetStates, "Null targetState values are not permitted");

        return forMesh(com.oracle.bmc.waiter.Waiters.DEFAULT_POLLING_WAITER, request, targetStates);
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
    public com.oracle.bmc.waiter.Waiter<GetMeshRequest, GetMeshResponse> forMesh(
            GetMeshRequest request,
            com.oracle.bmc.servicemesh.model.Mesh.LifecycleState targetState,
            com.oracle.bmc.waiter.TerminationStrategy terminationStrategy,
            com.oracle.bmc.waiter.DelayStrategy delayStrategy) {
        com.oracle.bmc.util.internal.Validate.notNull(
                targetState, "The targetState cannot be null");

        return forMesh(
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
    public com.oracle.bmc.waiter.Waiter<GetMeshRequest, GetMeshResponse> forMesh(
            GetMeshRequest request,
            com.oracle.bmc.waiter.TerminationStrategy terminationStrategy,
            com.oracle.bmc.waiter.DelayStrategy delayStrategy,
            com.oracle.bmc.servicemesh.model.Mesh.LifecycleState... targetStates) {
        com.oracle.bmc.util.internal.Validate.notEmpty(
                targetStates, "At least one target state must be provided");
        com.oracle.bmc.util.internal.Validate.noNullElements(
                targetStates, "Null target states are not permitted");

        return forMesh(
                com.oracle.bmc.waiter.Waiters.newWaiter(terminationStrategy, delayStrategy),
                request,
                targetStates);
    }

    // Helper method to create a new Waiter for Mesh.
    private com.oracle.bmc.waiter.Waiter<GetMeshRequest, GetMeshResponse> forMesh(
            com.oracle.bmc.waiter.BmcGenericWaiter waiter,
            final GetMeshRequest request,
            final com.oracle.bmc.servicemesh.model.Mesh.LifecycleState... targetStates) {
        final java.util.Set<com.oracle.bmc.servicemesh.model.Mesh.LifecycleState> targetStatesSet =
                new java.util.HashSet<>(java.util.Arrays.asList(targetStates));

        return new com.oracle.bmc.waiter.internal.SimpleWaiterImpl<>(
                executorService,
                waiter.toCallable(
                        () -> request,
                        new java.util.function.Function<GetMeshRequest, GetMeshResponse>() {
                            @Override
                            public GetMeshResponse apply(GetMeshRequest request) {
                                return client.getMesh(request);
                            }
                        },
                        new java.util.function.Predicate<GetMeshResponse>() {
                            @Override
                            public boolean test(GetMeshResponse response) {
                                return targetStatesSet.contains(
                                        response.getMesh().getLifecycleState());
                            }
                        },
                        targetStatesSet.contains(
                                com.oracle.bmc.servicemesh.model.Mesh.LifecycleState.Deleted)),
                request);
    }

    /**
     * Creates a new {@link com.oracle.bmc.waiter.Waiter} using the default configuration.
     *
     * @param request the request to send
     * @param targetStates the desired states to wait for. If multiple states are provided then the waiter will return once the resource reaches any of the provided states
     * @return a new {@code Waiter} instance
     */
    public com.oracle.bmc.waiter.Waiter<GetVirtualDeploymentRequest, GetVirtualDeploymentResponse>
            forVirtualDeployment(
                    GetVirtualDeploymentRequest request,
                    com.oracle.bmc.servicemesh.model.VirtualDeployment.LifecycleState...
                            targetStates) {
        com.oracle.bmc.util.internal.Validate.notEmpty(
                targetStates, "At least one targetState must be provided");
        com.oracle.bmc.util.internal.Validate.noNullElements(
                targetStates, "Null targetState values are not permitted");

        return forVirtualDeployment(
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
    public com.oracle.bmc.waiter.Waiter<GetVirtualDeploymentRequest, GetVirtualDeploymentResponse>
            forVirtualDeployment(
                    GetVirtualDeploymentRequest request,
                    com.oracle.bmc.servicemesh.model.VirtualDeployment.LifecycleState targetState,
                    com.oracle.bmc.waiter.TerminationStrategy terminationStrategy,
                    com.oracle.bmc.waiter.DelayStrategy delayStrategy) {
        com.oracle.bmc.util.internal.Validate.notNull(
                targetState, "The targetState cannot be null");

        return forVirtualDeployment(
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
    public com.oracle.bmc.waiter.Waiter<GetVirtualDeploymentRequest, GetVirtualDeploymentResponse>
            forVirtualDeployment(
                    GetVirtualDeploymentRequest request,
                    com.oracle.bmc.waiter.TerminationStrategy terminationStrategy,
                    com.oracle.bmc.waiter.DelayStrategy delayStrategy,
                    com.oracle.bmc.servicemesh.model.VirtualDeployment.LifecycleState...
                            targetStates) {
        com.oracle.bmc.util.internal.Validate.notEmpty(
                targetStates, "At least one target state must be provided");
        com.oracle.bmc.util.internal.Validate.noNullElements(
                targetStates, "Null target states are not permitted");

        return forVirtualDeployment(
                com.oracle.bmc.waiter.Waiters.newWaiter(terminationStrategy, delayStrategy),
                request,
                targetStates);
    }

    // Helper method to create a new Waiter for VirtualDeployment.
    private com.oracle.bmc.waiter.Waiter<GetVirtualDeploymentRequest, GetVirtualDeploymentResponse>
            forVirtualDeployment(
                    com.oracle.bmc.waiter.BmcGenericWaiter waiter,
                    final GetVirtualDeploymentRequest request,
                    final com.oracle.bmc.servicemesh.model.VirtualDeployment.LifecycleState...
                            targetStates) {
        final java.util.Set<com.oracle.bmc.servicemesh.model.VirtualDeployment.LifecycleState>
                targetStatesSet = new java.util.HashSet<>(java.util.Arrays.asList(targetStates));

        return new com.oracle.bmc.waiter.internal.SimpleWaiterImpl<>(
                executorService,
                waiter.toCallable(
                        () -> request,
                        new java.util.function.Function<
                                GetVirtualDeploymentRequest, GetVirtualDeploymentResponse>() {
                            @Override
                            public GetVirtualDeploymentResponse apply(
                                    GetVirtualDeploymentRequest request) {
                                return client.getVirtualDeployment(request);
                            }
                        },
                        new java.util.function.Predicate<GetVirtualDeploymentResponse>() {
                            @Override
                            public boolean test(GetVirtualDeploymentResponse response) {
                                return targetStatesSet.contains(
                                        response.getVirtualDeployment().getLifecycleState());
                            }
                        },
                        targetStatesSet.contains(
                                com.oracle.bmc.servicemesh.model.VirtualDeployment.LifecycleState
                                        .Deleted)),
                request);
    }

    /**
     * Creates a new {@link com.oracle.bmc.waiter.Waiter} using the default configuration.
     *
     * @param request the request to send
     * @param targetStates the desired states to wait for. If multiple states are provided then the waiter will return once the resource reaches any of the provided states
     * @return a new {@code Waiter} instance
     */
    public com.oracle.bmc.waiter.Waiter<GetVirtualServiceRequest, GetVirtualServiceResponse>
            forVirtualService(
                    GetVirtualServiceRequest request,
                    com.oracle.bmc.servicemesh.model.VirtualService.LifecycleState...
                            targetStates) {
        com.oracle.bmc.util.internal.Validate.notEmpty(
                targetStates, "At least one targetState must be provided");
        com.oracle.bmc.util.internal.Validate.noNullElements(
                targetStates, "Null targetState values are not permitted");

        return forVirtualService(
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
    public com.oracle.bmc.waiter.Waiter<GetVirtualServiceRequest, GetVirtualServiceResponse>
            forVirtualService(
                    GetVirtualServiceRequest request,
                    com.oracle.bmc.servicemesh.model.VirtualService.LifecycleState targetState,
                    com.oracle.bmc.waiter.TerminationStrategy terminationStrategy,
                    com.oracle.bmc.waiter.DelayStrategy delayStrategy) {
        com.oracle.bmc.util.internal.Validate.notNull(
                targetState, "The targetState cannot be null");

        return forVirtualService(
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
    public com.oracle.bmc.waiter.Waiter<GetVirtualServiceRequest, GetVirtualServiceResponse>
            forVirtualService(
                    GetVirtualServiceRequest request,
                    com.oracle.bmc.waiter.TerminationStrategy terminationStrategy,
                    com.oracle.bmc.waiter.DelayStrategy delayStrategy,
                    com.oracle.bmc.servicemesh.model.VirtualService.LifecycleState...
                            targetStates) {
        com.oracle.bmc.util.internal.Validate.notEmpty(
                targetStates, "At least one target state must be provided");
        com.oracle.bmc.util.internal.Validate.noNullElements(
                targetStates, "Null target states are not permitted");

        return forVirtualService(
                com.oracle.bmc.waiter.Waiters.newWaiter(terminationStrategy, delayStrategy),
                request,
                targetStates);
    }

    // Helper method to create a new Waiter for VirtualService.
    private com.oracle.bmc.waiter.Waiter<GetVirtualServiceRequest, GetVirtualServiceResponse>
            forVirtualService(
                    com.oracle.bmc.waiter.BmcGenericWaiter waiter,
                    final GetVirtualServiceRequest request,
                    final com.oracle.bmc.servicemesh.model.VirtualService.LifecycleState...
                            targetStates) {
        final java.util.Set<com.oracle.bmc.servicemesh.model.VirtualService.LifecycleState>
                targetStatesSet = new java.util.HashSet<>(java.util.Arrays.asList(targetStates));

        return new com.oracle.bmc.waiter.internal.SimpleWaiterImpl<>(
                executorService,
                waiter.toCallable(
                        () -> request,
                        new java.util.function.Function<
                                GetVirtualServiceRequest, GetVirtualServiceResponse>() {
                            @Override
                            public GetVirtualServiceResponse apply(
                                    GetVirtualServiceRequest request) {
                                return client.getVirtualService(request);
                            }
                        },
                        new java.util.function.Predicate<GetVirtualServiceResponse>() {
                            @Override
                            public boolean test(GetVirtualServiceResponse response) {
                                return targetStatesSet.contains(
                                        response.getVirtualService().getLifecycleState());
                            }
                        },
                        targetStatesSet.contains(
                                com.oracle.bmc.servicemesh.model.VirtualService.LifecycleState
                                        .Deleted)),
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
                    GetVirtualServiceRouteTableRequest, GetVirtualServiceRouteTableResponse>
            forVirtualServiceRouteTable(
                    GetVirtualServiceRouteTableRequest request,
                    com.oracle.bmc.servicemesh.model.VirtualServiceRouteTable.LifecycleState...
                            targetStates) {
        com.oracle.bmc.util.internal.Validate.notEmpty(
                targetStates, "At least one targetState must be provided");
        com.oracle.bmc.util.internal.Validate.noNullElements(
                targetStates, "Null targetState values are not permitted");

        return forVirtualServiceRouteTable(
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
                    GetVirtualServiceRouteTableRequest, GetVirtualServiceRouteTableResponse>
            forVirtualServiceRouteTable(
                    GetVirtualServiceRouteTableRequest request,
                    com.oracle.bmc.servicemesh.model.VirtualServiceRouteTable.LifecycleState
                            targetState,
                    com.oracle.bmc.waiter.TerminationStrategy terminationStrategy,
                    com.oracle.bmc.waiter.DelayStrategy delayStrategy) {
        com.oracle.bmc.util.internal.Validate.notNull(
                targetState, "The targetState cannot be null");

        return forVirtualServiceRouteTable(
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
                    GetVirtualServiceRouteTableRequest, GetVirtualServiceRouteTableResponse>
            forVirtualServiceRouteTable(
                    GetVirtualServiceRouteTableRequest request,
                    com.oracle.bmc.waiter.TerminationStrategy terminationStrategy,
                    com.oracle.bmc.waiter.DelayStrategy delayStrategy,
                    com.oracle.bmc.servicemesh.model.VirtualServiceRouteTable.LifecycleState...
                            targetStates) {
        com.oracle.bmc.util.internal.Validate.notEmpty(
                targetStates, "At least one target state must be provided");
        com.oracle.bmc.util.internal.Validate.noNullElements(
                targetStates, "Null target states are not permitted");

        return forVirtualServiceRouteTable(
                com.oracle.bmc.waiter.Waiters.newWaiter(terminationStrategy, delayStrategy),
                request,
                targetStates);
    }

    // Helper method to create a new Waiter for VirtualServiceRouteTable.
    private com.oracle.bmc.waiter.Waiter<
                    GetVirtualServiceRouteTableRequest, GetVirtualServiceRouteTableResponse>
            forVirtualServiceRouteTable(
                    com.oracle.bmc.waiter.BmcGenericWaiter waiter,
                    final GetVirtualServiceRouteTableRequest request,
                    final com.oracle.bmc.servicemesh.model.VirtualServiceRouteTable
                                    .LifecycleState...
                            targetStates) {
        final java.util.Set<
                        com.oracle.bmc.servicemesh.model.VirtualServiceRouteTable.LifecycleState>
                targetStatesSet = new java.util.HashSet<>(java.util.Arrays.asList(targetStates));

        return new com.oracle.bmc.waiter.internal.SimpleWaiterImpl<>(
                executorService,
                waiter.toCallable(
                        () -> request,
                        new java.util.function.Function<
                                GetVirtualServiceRouteTableRequest,
                                GetVirtualServiceRouteTableResponse>() {
                            @Override
                            public GetVirtualServiceRouteTableResponse apply(
                                    GetVirtualServiceRouteTableRequest request) {
                                return client.getVirtualServiceRouteTable(request);
                            }
                        },
                        new java.util.function.Predicate<GetVirtualServiceRouteTableResponse>() {
                            @Override
                            public boolean test(GetVirtualServiceRouteTableResponse response) {
                                return targetStatesSet.contains(
                                        response.getVirtualServiceRouteTable().getLifecycleState());
                            }
                        },
                        targetStatesSet.contains(
                                com.oracle.bmc.servicemesh.model.VirtualServiceRouteTable
                                        .LifecycleState.Deleted)),
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
