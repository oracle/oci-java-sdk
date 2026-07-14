/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.generativeai;

import com.oracle.bmc.generativeai.requests.*;
import com.oracle.bmc.generativeai.responses.*;

/**
 * Collection of helper methods to produce {@link com.oracle.bmc.waiter.Waiter}s for different
 * resources of GenerativeAi.
 *
 * <p>The default configuration used is defined by {@link
 * com.oracle.bmc.waiter.Waiters.Waiters#DEFAULT_POLLING_WAITER}.
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20231130")
public class GenerativeAiWaiters {
    private final java.util.concurrent.ExecutorService executorService;
    private final GenerativeAi client;

    public GenerativeAiWaiters(
            java.util.concurrent.ExecutorService executorService, GenerativeAi client) {
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
    public com.oracle.bmc.waiter.Waiter<GetApiKeyRequest, GetApiKeyResponse> forApiKey(
            GetApiKeyRequest request,
            com.oracle.bmc.generativeai.model.ApiKey.LifecycleState... targetStates) {
        com.oracle.bmc.util.internal.Validate.notEmpty(
                targetStates, "At least one targetState must be provided");
        com.oracle.bmc.util.internal.Validate.noNullElements(
                targetStates, "Null targetState values are not permitted");

        return forApiKey(
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
    public com.oracle.bmc.waiter.Waiter<GetApiKeyRequest, GetApiKeyResponse> forApiKey(
            GetApiKeyRequest request,
            com.oracle.bmc.generativeai.model.ApiKey.LifecycleState targetState,
            com.oracle.bmc.waiter.TerminationStrategy terminationStrategy,
            com.oracle.bmc.waiter.DelayStrategy delayStrategy) {
        com.oracle.bmc.util.internal.Validate.notNull(
                targetState, "The targetState cannot be null");

        return forApiKey(
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
    public com.oracle.bmc.waiter.Waiter<GetApiKeyRequest, GetApiKeyResponse> forApiKey(
            GetApiKeyRequest request,
            com.oracle.bmc.waiter.TerminationStrategy terminationStrategy,
            com.oracle.bmc.waiter.DelayStrategy delayStrategy,
            com.oracle.bmc.generativeai.model.ApiKey.LifecycleState... targetStates) {
        com.oracle.bmc.util.internal.Validate.notEmpty(
                targetStates, "At least one target state must be provided");
        com.oracle.bmc.util.internal.Validate.noNullElements(
                targetStates, "Null target states are not permitted");

        return forApiKey(
                com.oracle.bmc.waiter.Waiters.newWaiter(terminationStrategy, delayStrategy),
                request,
                targetStates);
    }

    // Helper method to create a new Waiter for ApiKey.
    private com.oracle.bmc.waiter.Waiter<GetApiKeyRequest, GetApiKeyResponse> forApiKey(
            com.oracle.bmc.waiter.BmcGenericWaiter waiter,
            final GetApiKeyRequest request,
            final com.oracle.bmc.generativeai.model.ApiKey.LifecycleState... targetStates) {
        final java.util.Set<com.oracle.bmc.generativeai.model.ApiKey.LifecycleState>
                targetStatesSet = new java.util.HashSet<>(java.util.Arrays.asList(targetStates));

        return new com.oracle.bmc.waiter.internal.SimpleWaiterImpl<>(
                executorService,
                waiter.toCallable(
                        () -> request,
                        new java.util.function.Function<GetApiKeyRequest, GetApiKeyResponse>() {
                            @Override
                            public GetApiKeyResponse apply(GetApiKeyRequest request) {
                                return client.getApiKey(request);
                            }
                        },
                        new java.util.function.Predicate<GetApiKeyResponse>() {
                            @Override
                            public boolean test(GetApiKeyResponse response) {
                                return targetStatesSet.contains(
                                        response.getApiKey().getLifecycleState());
                            }
                        },
                        targetStatesSet.contains(
                                com.oracle.bmc.generativeai.model.ApiKey.LifecycleState.Deleted)),
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
    public com.oracle.bmc.waiter.Waiter<GetDedicatedAiClusterRequest, GetDedicatedAiClusterResponse>
            forDedicatedAiCluster(
                    GetDedicatedAiClusterRequest request,
                    com.oracle.bmc.generativeai.model.DedicatedAiCluster.LifecycleState...
                            targetStates) {
        com.oracle.bmc.util.internal.Validate.notEmpty(
                targetStates, "At least one targetState must be provided");
        com.oracle.bmc.util.internal.Validate.noNullElements(
                targetStates, "Null targetState values are not permitted");

        return forDedicatedAiCluster(
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
    public com.oracle.bmc.waiter.Waiter<GetDedicatedAiClusterRequest, GetDedicatedAiClusterResponse>
            forDedicatedAiCluster(
                    GetDedicatedAiClusterRequest request,
                    com.oracle.bmc.generativeai.model.DedicatedAiCluster.LifecycleState targetState,
                    com.oracle.bmc.waiter.TerminationStrategy terminationStrategy,
                    com.oracle.bmc.waiter.DelayStrategy delayStrategy) {
        com.oracle.bmc.util.internal.Validate.notNull(
                targetState, "The targetState cannot be null");

        return forDedicatedAiCluster(
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
    public com.oracle.bmc.waiter.Waiter<GetDedicatedAiClusterRequest, GetDedicatedAiClusterResponse>
            forDedicatedAiCluster(
                    GetDedicatedAiClusterRequest request,
                    com.oracle.bmc.waiter.TerminationStrategy terminationStrategy,
                    com.oracle.bmc.waiter.DelayStrategy delayStrategy,
                    com.oracle.bmc.generativeai.model.DedicatedAiCluster.LifecycleState...
                            targetStates) {
        com.oracle.bmc.util.internal.Validate.notEmpty(
                targetStates, "At least one target state must be provided");
        com.oracle.bmc.util.internal.Validate.noNullElements(
                targetStates, "Null target states are not permitted");

        return forDedicatedAiCluster(
                com.oracle.bmc.waiter.Waiters.newWaiter(terminationStrategy, delayStrategy),
                request,
                targetStates);
    }

    // Helper method to create a new Waiter for DedicatedAiCluster.
    private com.oracle.bmc.waiter.Waiter<
                    GetDedicatedAiClusterRequest, GetDedicatedAiClusterResponse>
            forDedicatedAiCluster(
                    com.oracle.bmc.waiter.BmcGenericWaiter waiter,
                    final GetDedicatedAiClusterRequest request,
                    final com.oracle.bmc.generativeai.model.DedicatedAiCluster.LifecycleState...
                            targetStates) {
        final java.util.Set<com.oracle.bmc.generativeai.model.DedicatedAiCluster.LifecycleState>
                targetStatesSet = new java.util.HashSet<>(java.util.Arrays.asList(targetStates));

        return new com.oracle.bmc.waiter.internal.SimpleWaiterImpl<>(
                executorService,
                waiter.toCallable(
                        () -> request,
                        new java.util.function.Function<
                                GetDedicatedAiClusterRequest, GetDedicatedAiClusterResponse>() {
                            @Override
                            public GetDedicatedAiClusterResponse apply(
                                    GetDedicatedAiClusterRequest request) {
                                return client.getDedicatedAiCluster(request);
                            }
                        },
                        new java.util.function.Predicate<GetDedicatedAiClusterResponse>() {
                            @Override
                            public boolean test(GetDedicatedAiClusterResponse response) {
                                return targetStatesSet.contains(
                                        response.getDedicatedAiCluster().getLifecycleState());
                            }
                        },
                        targetStatesSet.contains(
                                com.oracle.bmc.generativeai.model.DedicatedAiCluster.LifecycleState
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
    public com.oracle.bmc.waiter.Waiter<GetEndpointRequest, GetEndpointResponse> forEndpoint(
            GetEndpointRequest request,
            com.oracle.bmc.generativeai.model.Endpoint.LifecycleState... targetStates) {
        com.oracle.bmc.util.internal.Validate.notEmpty(
                targetStates, "At least one targetState must be provided");
        com.oracle.bmc.util.internal.Validate.noNullElements(
                targetStates, "Null targetState values are not permitted");

        return forEndpoint(
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
    public com.oracle.bmc.waiter.Waiter<GetEndpointRequest, GetEndpointResponse> forEndpoint(
            GetEndpointRequest request,
            com.oracle.bmc.generativeai.model.Endpoint.LifecycleState targetState,
            com.oracle.bmc.waiter.TerminationStrategy terminationStrategy,
            com.oracle.bmc.waiter.DelayStrategy delayStrategy) {
        com.oracle.bmc.util.internal.Validate.notNull(
                targetState, "The targetState cannot be null");

        return forEndpoint(
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
    public com.oracle.bmc.waiter.Waiter<GetEndpointRequest, GetEndpointResponse> forEndpoint(
            GetEndpointRequest request,
            com.oracle.bmc.waiter.TerminationStrategy terminationStrategy,
            com.oracle.bmc.waiter.DelayStrategy delayStrategy,
            com.oracle.bmc.generativeai.model.Endpoint.LifecycleState... targetStates) {
        com.oracle.bmc.util.internal.Validate.notEmpty(
                targetStates, "At least one target state must be provided");
        com.oracle.bmc.util.internal.Validate.noNullElements(
                targetStates, "Null target states are not permitted");

        return forEndpoint(
                com.oracle.bmc.waiter.Waiters.newWaiter(terminationStrategy, delayStrategy),
                request,
                targetStates);
    }

    // Helper method to create a new Waiter for Endpoint.
    private com.oracle.bmc.waiter.Waiter<GetEndpointRequest, GetEndpointResponse> forEndpoint(
            com.oracle.bmc.waiter.BmcGenericWaiter waiter,
            final GetEndpointRequest request,
            final com.oracle.bmc.generativeai.model.Endpoint.LifecycleState... targetStates) {
        final java.util.Set<com.oracle.bmc.generativeai.model.Endpoint.LifecycleState>
                targetStatesSet = new java.util.HashSet<>(java.util.Arrays.asList(targetStates));

        return new com.oracle.bmc.waiter.internal.SimpleWaiterImpl<>(
                executorService,
                waiter.toCallable(
                        () -> request,
                        new java.util.function.Function<GetEndpointRequest, GetEndpointResponse>() {
                            @Override
                            public GetEndpointResponse apply(GetEndpointRequest request) {
                                return client.getEndpoint(request);
                            }
                        },
                        new java.util.function.Predicate<GetEndpointResponse>() {
                            @Override
                            public boolean test(GetEndpointResponse response) {
                                return targetStatesSet.contains(
                                        response.getEndpoint().getLifecycleState());
                            }
                        },
                        targetStatesSet.contains(
                                com.oracle.bmc.generativeai.model.Endpoint.LifecycleState.Deleted)),
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
                    GetGenerativeAiPrivateEndpointRequest, GetGenerativeAiPrivateEndpointResponse>
            forGenerativeAiPrivateEndpoint(
                    GetGenerativeAiPrivateEndpointRequest request,
                    com.oracle.bmc.generativeai.model.GenerativeAiPrivateEndpoint.LifecycleState...
                            targetStates) {
        com.oracle.bmc.util.internal.Validate.notEmpty(
                targetStates, "At least one targetState must be provided");
        com.oracle.bmc.util.internal.Validate.noNullElements(
                targetStates, "Null targetState values are not permitted");

        return forGenerativeAiPrivateEndpoint(
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
                    GetGenerativeAiPrivateEndpointRequest, GetGenerativeAiPrivateEndpointResponse>
            forGenerativeAiPrivateEndpoint(
                    GetGenerativeAiPrivateEndpointRequest request,
                    com.oracle.bmc.generativeai.model.GenerativeAiPrivateEndpoint.LifecycleState
                            targetState,
                    com.oracle.bmc.waiter.TerminationStrategy terminationStrategy,
                    com.oracle.bmc.waiter.DelayStrategy delayStrategy) {
        com.oracle.bmc.util.internal.Validate.notNull(
                targetState, "The targetState cannot be null");

        return forGenerativeAiPrivateEndpoint(
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
                    GetGenerativeAiPrivateEndpointRequest, GetGenerativeAiPrivateEndpointResponse>
            forGenerativeAiPrivateEndpoint(
                    GetGenerativeAiPrivateEndpointRequest request,
                    com.oracle.bmc.waiter.TerminationStrategy terminationStrategy,
                    com.oracle.bmc.waiter.DelayStrategy delayStrategy,
                    com.oracle.bmc.generativeai.model.GenerativeAiPrivateEndpoint.LifecycleState...
                            targetStates) {
        com.oracle.bmc.util.internal.Validate.notEmpty(
                targetStates, "At least one target state must be provided");
        com.oracle.bmc.util.internal.Validate.noNullElements(
                targetStates, "Null target states are not permitted");

        return forGenerativeAiPrivateEndpoint(
                com.oracle.bmc.waiter.Waiters.newWaiter(terminationStrategy, delayStrategy),
                request,
                targetStates);
    }

    // Helper method to create a new Waiter for GenerativeAiPrivateEndpoint.
    private com.oracle.bmc.waiter.Waiter<
                    GetGenerativeAiPrivateEndpointRequest, GetGenerativeAiPrivateEndpointResponse>
            forGenerativeAiPrivateEndpoint(
                    com.oracle.bmc.waiter.BmcGenericWaiter waiter,
                    final GetGenerativeAiPrivateEndpointRequest request,
                    final com.oracle.bmc.generativeai.model.GenerativeAiPrivateEndpoint
                                            .LifecycleState
                                    ...
                            targetStates) {
        final java.util.Set<
                        com.oracle.bmc.generativeai.model.GenerativeAiPrivateEndpoint
                                .LifecycleState>
                targetStatesSet = new java.util.HashSet<>(java.util.Arrays.asList(targetStates));

        return new com.oracle.bmc.waiter.internal.SimpleWaiterImpl<>(
                executorService,
                waiter.toCallable(
                        () -> request,
                        new java.util.function.Function<
                                GetGenerativeAiPrivateEndpointRequest,
                                GetGenerativeAiPrivateEndpointResponse>() {
                            @Override
                            public GetGenerativeAiPrivateEndpointResponse apply(
                                    GetGenerativeAiPrivateEndpointRequest request) {
                                return client.getGenerativeAiPrivateEndpoint(request);
                            }
                        },
                        new java.util.function.Predicate<GetGenerativeAiPrivateEndpointResponse>() {
                            @Override
                            public boolean test(GetGenerativeAiPrivateEndpointResponse response) {
                                return targetStatesSet.contains(
                                        response.getGenerativeAiPrivateEndpoint()
                                                .getLifecycleState());
                            }
                        },
                        targetStatesSet.contains(
                                com.oracle.bmc.generativeai.model.GenerativeAiPrivateEndpoint
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
                    GetGenerativeAiProjectRequest, GetGenerativeAiProjectResponse>
            forGenerativeAiProject(
                    GetGenerativeAiProjectRequest request,
                    com.oracle.bmc.generativeai.model.GenerativeAiProject.LifecycleState...
                            targetStates) {
        com.oracle.bmc.util.internal.Validate.notEmpty(
                targetStates, "At least one targetState must be provided");
        com.oracle.bmc.util.internal.Validate.noNullElements(
                targetStates, "Null targetState values are not permitted");

        return forGenerativeAiProject(
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
                    GetGenerativeAiProjectRequest, GetGenerativeAiProjectResponse>
            forGenerativeAiProject(
                    GetGenerativeAiProjectRequest request,
                    com.oracle.bmc.generativeai.model.GenerativeAiProject.LifecycleState
                            targetState,
                    com.oracle.bmc.waiter.TerminationStrategy terminationStrategy,
                    com.oracle.bmc.waiter.DelayStrategy delayStrategy) {
        com.oracle.bmc.util.internal.Validate.notNull(
                targetState, "The targetState cannot be null");

        return forGenerativeAiProject(
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
                    GetGenerativeAiProjectRequest, GetGenerativeAiProjectResponse>
            forGenerativeAiProject(
                    GetGenerativeAiProjectRequest request,
                    com.oracle.bmc.waiter.TerminationStrategy terminationStrategy,
                    com.oracle.bmc.waiter.DelayStrategy delayStrategy,
                    com.oracle.bmc.generativeai.model.GenerativeAiProject.LifecycleState...
                            targetStates) {
        com.oracle.bmc.util.internal.Validate.notEmpty(
                targetStates, "At least one target state must be provided");
        com.oracle.bmc.util.internal.Validate.noNullElements(
                targetStates, "Null target states are not permitted");

        return forGenerativeAiProject(
                com.oracle.bmc.waiter.Waiters.newWaiter(terminationStrategy, delayStrategy),
                request,
                targetStates);
    }

    // Helper method to create a new Waiter for GenerativeAiProject.
    private com.oracle.bmc.waiter.Waiter<
                    GetGenerativeAiProjectRequest, GetGenerativeAiProjectResponse>
            forGenerativeAiProject(
                    com.oracle.bmc.waiter.BmcGenericWaiter waiter,
                    final GetGenerativeAiProjectRequest request,
                    final com.oracle.bmc.generativeai.model.GenerativeAiProject.LifecycleState...
                            targetStates) {
        final java.util.Set<com.oracle.bmc.generativeai.model.GenerativeAiProject.LifecycleState>
                targetStatesSet = new java.util.HashSet<>(java.util.Arrays.asList(targetStates));

        return new com.oracle.bmc.waiter.internal.SimpleWaiterImpl<>(
                executorService,
                waiter.toCallable(
                        () -> request,
                        new java.util.function.Function<
                                GetGenerativeAiProjectRequest, GetGenerativeAiProjectResponse>() {
                            @Override
                            public GetGenerativeAiProjectResponse apply(
                                    GetGenerativeAiProjectRequest request) {
                                return client.getGenerativeAiProject(request);
                            }
                        },
                        new java.util.function.Predicate<GetGenerativeAiProjectResponse>() {
                            @Override
                            public boolean test(GetGenerativeAiProjectResponse response) {
                                return targetStatesSet.contains(
                                        response.getGenerativeAiProject().getLifecycleState());
                            }
                        },
                        targetStatesSet.contains(
                                com.oracle.bmc.generativeai.model.GenerativeAiProject.LifecycleState
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
    public com.oracle.bmc.waiter.Waiter<GetHostedApplicationRequest, GetHostedApplicationResponse>
            forHostedApplication(
                    GetHostedApplicationRequest request,
                    com.oracle.bmc.generativeai.model.HostedApplication.LifecycleState...
                            targetStates) {
        com.oracle.bmc.util.internal.Validate.notEmpty(
                targetStates, "At least one targetState must be provided");
        com.oracle.bmc.util.internal.Validate.noNullElements(
                targetStates, "Null targetState values are not permitted");

        return forHostedApplication(
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
    public com.oracle.bmc.waiter.Waiter<GetHostedApplicationRequest, GetHostedApplicationResponse>
            forHostedApplication(
                    GetHostedApplicationRequest request,
                    com.oracle.bmc.generativeai.model.HostedApplication.LifecycleState targetState,
                    com.oracle.bmc.waiter.TerminationStrategy terminationStrategy,
                    com.oracle.bmc.waiter.DelayStrategy delayStrategy) {
        com.oracle.bmc.util.internal.Validate.notNull(
                targetState, "The targetState cannot be null");

        return forHostedApplication(
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
    public com.oracle.bmc.waiter.Waiter<GetHostedApplicationRequest, GetHostedApplicationResponse>
            forHostedApplication(
                    GetHostedApplicationRequest request,
                    com.oracle.bmc.waiter.TerminationStrategy terminationStrategy,
                    com.oracle.bmc.waiter.DelayStrategy delayStrategy,
                    com.oracle.bmc.generativeai.model.HostedApplication.LifecycleState...
                            targetStates) {
        com.oracle.bmc.util.internal.Validate.notEmpty(
                targetStates, "At least one target state must be provided");
        com.oracle.bmc.util.internal.Validate.noNullElements(
                targetStates, "Null target states are not permitted");

        return forHostedApplication(
                com.oracle.bmc.waiter.Waiters.newWaiter(terminationStrategy, delayStrategy),
                request,
                targetStates);
    }

    // Helper method to create a new Waiter for HostedApplication.
    private com.oracle.bmc.waiter.Waiter<GetHostedApplicationRequest, GetHostedApplicationResponse>
            forHostedApplication(
                    com.oracle.bmc.waiter.BmcGenericWaiter waiter,
                    final GetHostedApplicationRequest request,
                    final com.oracle.bmc.generativeai.model.HostedApplication.LifecycleState...
                            targetStates) {
        final java.util.Set<com.oracle.bmc.generativeai.model.HostedApplication.LifecycleState>
                targetStatesSet = new java.util.HashSet<>(java.util.Arrays.asList(targetStates));

        return new com.oracle.bmc.waiter.internal.SimpleWaiterImpl<>(
                executorService,
                waiter.toCallable(
                        () -> request,
                        new java.util.function.Function<
                                GetHostedApplicationRequest, GetHostedApplicationResponse>() {
                            @Override
                            public GetHostedApplicationResponse apply(
                                    GetHostedApplicationRequest request) {
                                return client.getHostedApplication(request);
                            }
                        },
                        new java.util.function.Predicate<GetHostedApplicationResponse>() {
                            @Override
                            public boolean test(GetHostedApplicationResponse response) {
                                return targetStatesSet.contains(
                                        response.getHostedApplication().getLifecycleState());
                            }
                        },
                        targetStatesSet.contains(
                                com.oracle.bmc.generativeai.model.HostedApplication.LifecycleState
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
                    GetHostedApplicationIamRequest, GetHostedApplicationIamResponse>
            forHostedApplicationIam(
                    GetHostedApplicationIamRequest request,
                    com.oracle.bmc.generativeai.model.HostedApplicationIam.LifecycleState...
                            targetStates) {
        com.oracle.bmc.util.internal.Validate.notEmpty(
                targetStates, "At least one targetState must be provided");
        com.oracle.bmc.util.internal.Validate.noNullElements(
                targetStates, "Null targetState values are not permitted");

        return forHostedApplicationIam(
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
                    GetHostedApplicationIamRequest, GetHostedApplicationIamResponse>
            forHostedApplicationIam(
                    GetHostedApplicationIamRequest request,
                    com.oracle.bmc.generativeai.model.HostedApplicationIam.LifecycleState
                            targetState,
                    com.oracle.bmc.waiter.TerminationStrategy terminationStrategy,
                    com.oracle.bmc.waiter.DelayStrategy delayStrategy) {
        com.oracle.bmc.util.internal.Validate.notNull(
                targetState, "The targetState cannot be null");

        return forHostedApplicationIam(
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
                    GetHostedApplicationIamRequest, GetHostedApplicationIamResponse>
            forHostedApplicationIam(
                    GetHostedApplicationIamRequest request,
                    com.oracle.bmc.waiter.TerminationStrategy terminationStrategy,
                    com.oracle.bmc.waiter.DelayStrategy delayStrategy,
                    com.oracle.bmc.generativeai.model.HostedApplicationIam.LifecycleState...
                            targetStates) {
        com.oracle.bmc.util.internal.Validate.notEmpty(
                targetStates, "At least one target state must be provided");
        com.oracle.bmc.util.internal.Validate.noNullElements(
                targetStates, "Null target states are not permitted");

        return forHostedApplicationIam(
                com.oracle.bmc.waiter.Waiters.newWaiter(terminationStrategy, delayStrategy),
                request,
                targetStates);
    }

    // Helper method to create a new Waiter for HostedApplicationIam.
    private com.oracle.bmc.waiter.Waiter<
                    GetHostedApplicationIamRequest, GetHostedApplicationIamResponse>
            forHostedApplicationIam(
                    com.oracle.bmc.waiter.BmcGenericWaiter waiter,
                    final GetHostedApplicationIamRequest request,
                    final com.oracle.bmc.generativeai.model.HostedApplicationIam.LifecycleState...
                            targetStates) {
        final java.util.Set<com.oracle.bmc.generativeai.model.HostedApplicationIam.LifecycleState>
                targetStatesSet = new java.util.HashSet<>(java.util.Arrays.asList(targetStates));

        return new com.oracle.bmc.waiter.internal.SimpleWaiterImpl<>(
                executorService,
                waiter.toCallable(
                        () -> request,
                        new java.util.function.Function<
                                GetHostedApplicationIamRequest, GetHostedApplicationIamResponse>() {
                            @Override
                            public GetHostedApplicationIamResponse apply(
                                    GetHostedApplicationIamRequest request) {
                                return client.getHostedApplicationIam(request);
                            }
                        },
                        new java.util.function.Predicate<GetHostedApplicationIamResponse>() {
                            @Override
                            public boolean test(GetHostedApplicationIamResponse response) {
                                return targetStatesSet.contains(
                                        response.getHostedApplicationIam().getLifecycleState());
                            }
                        },
                        targetStatesSet.contains(
                                com.oracle.bmc.generativeai.model.HostedApplicationIam
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
                    GetHostedApplicationStorageRequest, GetHostedApplicationStorageResponse>
            forHostedApplicationStorage(
                    GetHostedApplicationStorageRequest request,
                    com.oracle.bmc.generativeai.model.HostedApplicationStorage.LifecycleState...
                            targetStates) {
        com.oracle.bmc.util.internal.Validate.notEmpty(
                targetStates, "At least one targetState must be provided");
        com.oracle.bmc.util.internal.Validate.noNullElements(
                targetStates, "Null targetState values are not permitted");

        return forHostedApplicationStorage(
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
                    GetHostedApplicationStorageRequest, GetHostedApplicationStorageResponse>
            forHostedApplicationStorage(
                    GetHostedApplicationStorageRequest request,
                    com.oracle.bmc.generativeai.model.HostedApplicationStorage.LifecycleState
                            targetState,
                    com.oracle.bmc.waiter.TerminationStrategy terminationStrategy,
                    com.oracle.bmc.waiter.DelayStrategy delayStrategy) {
        com.oracle.bmc.util.internal.Validate.notNull(
                targetState, "The targetState cannot be null");

        return forHostedApplicationStorage(
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
                    GetHostedApplicationStorageRequest, GetHostedApplicationStorageResponse>
            forHostedApplicationStorage(
                    GetHostedApplicationStorageRequest request,
                    com.oracle.bmc.waiter.TerminationStrategy terminationStrategy,
                    com.oracle.bmc.waiter.DelayStrategy delayStrategy,
                    com.oracle.bmc.generativeai.model.HostedApplicationStorage.LifecycleState...
                            targetStates) {
        com.oracle.bmc.util.internal.Validate.notEmpty(
                targetStates, "At least one target state must be provided");
        com.oracle.bmc.util.internal.Validate.noNullElements(
                targetStates, "Null target states are not permitted");

        return forHostedApplicationStorage(
                com.oracle.bmc.waiter.Waiters.newWaiter(terminationStrategy, delayStrategy),
                request,
                targetStates);
    }

    // Helper method to create a new Waiter for HostedApplicationStorage.
    private com.oracle.bmc.waiter.Waiter<
                    GetHostedApplicationStorageRequest, GetHostedApplicationStorageResponse>
            forHostedApplicationStorage(
                    com.oracle.bmc.waiter.BmcGenericWaiter waiter,
                    final GetHostedApplicationStorageRequest request,
                    final com.oracle.bmc.generativeai.model.HostedApplicationStorage.LifecycleState
                                    ...
                            targetStates) {
        final java.util.Set<
                        com.oracle.bmc.generativeai.model.HostedApplicationStorage.LifecycleState>
                targetStatesSet = new java.util.HashSet<>(java.util.Arrays.asList(targetStates));

        return new com.oracle.bmc.waiter.internal.SimpleWaiterImpl<>(
                executorService,
                waiter.toCallable(
                        () -> request,
                        new java.util.function.Function<
                                GetHostedApplicationStorageRequest,
                                GetHostedApplicationStorageResponse>() {
                            @Override
                            public GetHostedApplicationStorageResponse apply(
                                    GetHostedApplicationStorageRequest request) {
                                return client.getHostedApplicationStorage(request);
                            }
                        },
                        new java.util.function.Predicate<GetHostedApplicationStorageResponse>() {
                            @Override
                            public boolean test(GetHostedApplicationStorageResponse response) {
                                return targetStatesSet.contains(
                                        response.getHostedApplicationStorage().getLifecycleState());
                            }
                        },
                        targetStatesSet.contains(
                                com.oracle.bmc.generativeai.model.HostedApplicationStorage
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
    public com.oracle.bmc.waiter.Waiter<GetHostedDeploymentRequest, GetHostedDeploymentResponse>
            forHostedDeployment(
                    GetHostedDeploymentRequest request,
                    com.oracle.bmc.generativeai.model.HostedDeployment.LifecycleState...
                            targetStates) {
        com.oracle.bmc.util.internal.Validate.notEmpty(
                targetStates, "At least one targetState must be provided");
        com.oracle.bmc.util.internal.Validate.noNullElements(
                targetStates, "Null targetState values are not permitted");

        return forHostedDeployment(
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
    public com.oracle.bmc.waiter.Waiter<GetHostedDeploymentRequest, GetHostedDeploymentResponse>
            forHostedDeployment(
                    GetHostedDeploymentRequest request,
                    com.oracle.bmc.generativeai.model.HostedDeployment.LifecycleState targetState,
                    com.oracle.bmc.waiter.TerminationStrategy terminationStrategy,
                    com.oracle.bmc.waiter.DelayStrategy delayStrategy) {
        com.oracle.bmc.util.internal.Validate.notNull(
                targetState, "The targetState cannot be null");

        return forHostedDeployment(
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
    public com.oracle.bmc.waiter.Waiter<GetHostedDeploymentRequest, GetHostedDeploymentResponse>
            forHostedDeployment(
                    GetHostedDeploymentRequest request,
                    com.oracle.bmc.waiter.TerminationStrategy terminationStrategy,
                    com.oracle.bmc.waiter.DelayStrategy delayStrategy,
                    com.oracle.bmc.generativeai.model.HostedDeployment.LifecycleState...
                            targetStates) {
        com.oracle.bmc.util.internal.Validate.notEmpty(
                targetStates, "At least one target state must be provided");
        com.oracle.bmc.util.internal.Validate.noNullElements(
                targetStates, "Null target states are not permitted");

        return forHostedDeployment(
                com.oracle.bmc.waiter.Waiters.newWaiter(terminationStrategy, delayStrategy),
                request,
                targetStates);
    }

    // Helper method to create a new Waiter for HostedDeployment.
    private com.oracle.bmc.waiter.Waiter<GetHostedDeploymentRequest, GetHostedDeploymentResponse>
            forHostedDeployment(
                    com.oracle.bmc.waiter.BmcGenericWaiter waiter,
                    final GetHostedDeploymentRequest request,
                    final com.oracle.bmc.generativeai.model.HostedDeployment.LifecycleState...
                            targetStates) {
        final java.util.Set<com.oracle.bmc.generativeai.model.HostedDeployment.LifecycleState>
                targetStatesSet = new java.util.HashSet<>(java.util.Arrays.asList(targetStates));

        return new com.oracle.bmc.waiter.internal.SimpleWaiterImpl<>(
                executorService,
                waiter.toCallable(
                        () -> request,
                        new java.util.function.Function<
                                GetHostedDeploymentRequest, GetHostedDeploymentResponse>() {
                            @Override
                            public GetHostedDeploymentResponse apply(
                                    GetHostedDeploymentRequest request) {
                                return client.getHostedDeployment(request);
                            }
                        },
                        new java.util.function.Predicate<GetHostedDeploymentResponse>() {
                            @Override
                            public boolean test(GetHostedDeploymentResponse response) {
                                return targetStatesSet.contains(
                                        response.getHostedDeployment().getLifecycleState());
                            }
                        },
                        targetStatesSet.contains(
                                com.oracle.bmc.generativeai.model.HostedDeployment.LifecycleState
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
    public com.oracle.bmc.waiter.Waiter<GetImportedModelRequest, GetImportedModelResponse>
            forImportedModel(
                    GetImportedModelRequest request,
                    com.oracle.bmc.generativeai.model.ImportedModel.LifecycleState...
                            targetStates) {
        com.oracle.bmc.util.internal.Validate.notEmpty(
                targetStates, "At least one targetState must be provided");
        com.oracle.bmc.util.internal.Validate.noNullElements(
                targetStates, "Null targetState values are not permitted");

        return forImportedModel(
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
    public com.oracle.bmc.waiter.Waiter<GetImportedModelRequest, GetImportedModelResponse>
            forImportedModel(
                    GetImportedModelRequest request,
                    com.oracle.bmc.generativeai.model.ImportedModel.LifecycleState targetState,
                    com.oracle.bmc.waiter.TerminationStrategy terminationStrategy,
                    com.oracle.bmc.waiter.DelayStrategy delayStrategy) {
        com.oracle.bmc.util.internal.Validate.notNull(
                targetState, "The targetState cannot be null");

        return forImportedModel(
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
    public com.oracle.bmc.waiter.Waiter<GetImportedModelRequest, GetImportedModelResponse>
            forImportedModel(
                    GetImportedModelRequest request,
                    com.oracle.bmc.waiter.TerminationStrategy terminationStrategy,
                    com.oracle.bmc.waiter.DelayStrategy delayStrategy,
                    com.oracle.bmc.generativeai.model.ImportedModel.LifecycleState...
                            targetStates) {
        com.oracle.bmc.util.internal.Validate.notEmpty(
                targetStates, "At least one target state must be provided");
        com.oracle.bmc.util.internal.Validate.noNullElements(
                targetStates, "Null target states are not permitted");

        return forImportedModel(
                com.oracle.bmc.waiter.Waiters.newWaiter(terminationStrategy, delayStrategy),
                request,
                targetStates);
    }

    // Helper method to create a new Waiter for ImportedModel.
    private com.oracle.bmc.waiter.Waiter<GetImportedModelRequest, GetImportedModelResponse>
            forImportedModel(
                    com.oracle.bmc.waiter.BmcGenericWaiter waiter,
                    final GetImportedModelRequest request,
                    final com.oracle.bmc.generativeai.model.ImportedModel.LifecycleState...
                            targetStates) {
        final java.util.Set<com.oracle.bmc.generativeai.model.ImportedModel.LifecycleState>
                targetStatesSet = new java.util.HashSet<>(java.util.Arrays.asList(targetStates));

        return new com.oracle.bmc.waiter.internal.SimpleWaiterImpl<>(
                executorService,
                waiter.toCallable(
                        () -> request,
                        new java.util.function.Function<
                                GetImportedModelRequest, GetImportedModelResponse>() {
                            @Override
                            public GetImportedModelResponse apply(GetImportedModelRequest request) {
                                return client.getImportedModel(request);
                            }
                        },
                        new java.util.function.Predicate<GetImportedModelResponse>() {
                            @Override
                            public boolean test(GetImportedModelResponse response) {
                                return targetStatesSet.contains(
                                        response.getImportedModel().getLifecycleState());
                            }
                        },
                        targetStatesSet.contains(
                                com.oracle.bmc.generativeai.model.ImportedModel.LifecycleState
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
    public com.oracle.bmc.waiter.Waiter<GetModelRequest, GetModelResponse> forModel(
            GetModelRequest request,
            com.oracle.bmc.generativeai.model.Model.LifecycleState... targetStates) {
        com.oracle.bmc.util.internal.Validate.notEmpty(
                targetStates, "At least one targetState must be provided");
        com.oracle.bmc.util.internal.Validate.noNullElements(
                targetStates, "Null targetState values are not permitted");

        return forModel(
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
    public com.oracle.bmc.waiter.Waiter<GetModelRequest, GetModelResponse> forModel(
            GetModelRequest request,
            com.oracle.bmc.generativeai.model.Model.LifecycleState targetState,
            com.oracle.bmc.waiter.TerminationStrategy terminationStrategy,
            com.oracle.bmc.waiter.DelayStrategy delayStrategy) {
        com.oracle.bmc.util.internal.Validate.notNull(
                targetState, "The targetState cannot be null");

        return forModel(
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
    public com.oracle.bmc.waiter.Waiter<GetModelRequest, GetModelResponse> forModel(
            GetModelRequest request,
            com.oracle.bmc.waiter.TerminationStrategy terminationStrategy,
            com.oracle.bmc.waiter.DelayStrategy delayStrategy,
            com.oracle.bmc.generativeai.model.Model.LifecycleState... targetStates) {
        com.oracle.bmc.util.internal.Validate.notEmpty(
                targetStates, "At least one target state must be provided");
        com.oracle.bmc.util.internal.Validate.noNullElements(
                targetStates, "Null target states are not permitted");

        return forModel(
                com.oracle.bmc.waiter.Waiters.newWaiter(terminationStrategy, delayStrategy),
                request,
                targetStates);
    }

    // Helper method to create a new Waiter for Model.
    private com.oracle.bmc.waiter.Waiter<GetModelRequest, GetModelResponse> forModel(
            com.oracle.bmc.waiter.BmcGenericWaiter waiter,
            final GetModelRequest request,
            final com.oracle.bmc.generativeai.model.Model.LifecycleState... targetStates) {
        final java.util.Set<com.oracle.bmc.generativeai.model.Model.LifecycleState>
                targetStatesSet = new java.util.HashSet<>(java.util.Arrays.asList(targetStates));

        return new com.oracle.bmc.waiter.internal.SimpleWaiterImpl<>(
                executorService,
                waiter.toCallable(
                        () -> request,
                        new java.util.function.Function<GetModelRequest, GetModelResponse>() {
                            @Override
                            public GetModelResponse apply(GetModelRequest request) {
                                return client.getModel(request);
                            }
                        },
                        new java.util.function.Predicate<GetModelResponse>() {
                            @Override
                            public boolean test(GetModelResponse response) {
                                return targetStatesSet.contains(
                                        response.getModel().getLifecycleState());
                            }
                        },
                        targetStatesSet.contains(
                                com.oracle.bmc.generativeai.model.Model.LifecycleState.Deleted)),
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
    public com.oracle.bmc.waiter.Waiter<GetSemanticStoreRequest, GetSemanticStoreResponse>
            forSemanticStore(
                    GetSemanticStoreRequest request,
                    com.oracle.bmc.generativeai.model.SemanticStore.LifecycleState...
                            targetStates) {
        com.oracle.bmc.util.internal.Validate.notEmpty(
                targetStates, "At least one targetState must be provided");
        com.oracle.bmc.util.internal.Validate.noNullElements(
                targetStates, "Null targetState values are not permitted");

        return forSemanticStore(
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
    public com.oracle.bmc.waiter.Waiter<GetSemanticStoreRequest, GetSemanticStoreResponse>
            forSemanticStore(
                    GetSemanticStoreRequest request,
                    com.oracle.bmc.generativeai.model.SemanticStore.LifecycleState targetState,
                    com.oracle.bmc.waiter.TerminationStrategy terminationStrategy,
                    com.oracle.bmc.waiter.DelayStrategy delayStrategy) {
        com.oracle.bmc.util.internal.Validate.notNull(
                targetState, "The targetState cannot be null");

        return forSemanticStore(
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
    public com.oracle.bmc.waiter.Waiter<GetSemanticStoreRequest, GetSemanticStoreResponse>
            forSemanticStore(
                    GetSemanticStoreRequest request,
                    com.oracle.bmc.waiter.TerminationStrategy terminationStrategy,
                    com.oracle.bmc.waiter.DelayStrategy delayStrategy,
                    com.oracle.bmc.generativeai.model.SemanticStore.LifecycleState...
                            targetStates) {
        com.oracle.bmc.util.internal.Validate.notEmpty(
                targetStates, "At least one target state must be provided");
        com.oracle.bmc.util.internal.Validate.noNullElements(
                targetStates, "Null target states are not permitted");

        return forSemanticStore(
                com.oracle.bmc.waiter.Waiters.newWaiter(terminationStrategy, delayStrategy),
                request,
                targetStates);
    }

    // Helper method to create a new Waiter for SemanticStore.
    private com.oracle.bmc.waiter.Waiter<GetSemanticStoreRequest, GetSemanticStoreResponse>
            forSemanticStore(
                    com.oracle.bmc.waiter.BmcGenericWaiter waiter,
                    final GetSemanticStoreRequest request,
                    final com.oracle.bmc.generativeai.model.SemanticStore.LifecycleState...
                            targetStates) {
        final java.util.Set<com.oracle.bmc.generativeai.model.SemanticStore.LifecycleState>
                targetStatesSet = new java.util.HashSet<>(java.util.Arrays.asList(targetStates));

        return new com.oracle.bmc.waiter.internal.SimpleWaiterImpl<>(
                executorService,
                waiter.toCallable(
                        () -> request,
                        new java.util.function.Function<
                                GetSemanticStoreRequest, GetSemanticStoreResponse>() {
                            @Override
                            public GetSemanticStoreResponse apply(GetSemanticStoreRequest request) {
                                return client.getSemanticStore(request);
                            }
                        },
                        new java.util.function.Predicate<GetSemanticStoreResponse>() {
                            @Override
                            public boolean test(GetSemanticStoreResponse response) {
                                return targetStatesSet.contains(
                                        response.getSemanticStore().getLifecycleState());
                            }
                        },
                        targetStatesSet.contains(
                                com.oracle.bmc.generativeai.model.SemanticStore.LifecycleState
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
                    GetVectorStoreConnectorRequest, GetVectorStoreConnectorResponse>
            forVectorStoreConnector(
                    GetVectorStoreConnectorRequest request,
                    com.oracle.bmc.generativeai.model.VectorStoreConnector.LifecycleState...
                            targetStates) {
        com.oracle.bmc.util.internal.Validate.notEmpty(
                targetStates, "At least one targetState must be provided");
        com.oracle.bmc.util.internal.Validate.noNullElements(
                targetStates, "Null targetState values are not permitted");

        return forVectorStoreConnector(
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
                    GetVectorStoreConnectorRequest, GetVectorStoreConnectorResponse>
            forVectorStoreConnector(
                    GetVectorStoreConnectorRequest request,
                    com.oracle.bmc.generativeai.model.VectorStoreConnector.LifecycleState
                            targetState,
                    com.oracle.bmc.waiter.TerminationStrategy terminationStrategy,
                    com.oracle.bmc.waiter.DelayStrategy delayStrategy) {
        com.oracle.bmc.util.internal.Validate.notNull(
                targetState, "The targetState cannot be null");

        return forVectorStoreConnector(
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
                    GetVectorStoreConnectorRequest, GetVectorStoreConnectorResponse>
            forVectorStoreConnector(
                    GetVectorStoreConnectorRequest request,
                    com.oracle.bmc.waiter.TerminationStrategy terminationStrategy,
                    com.oracle.bmc.waiter.DelayStrategy delayStrategy,
                    com.oracle.bmc.generativeai.model.VectorStoreConnector.LifecycleState...
                            targetStates) {
        com.oracle.bmc.util.internal.Validate.notEmpty(
                targetStates, "At least one target state must be provided");
        com.oracle.bmc.util.internal.Validate.noNullElements(
                targetStates, "Null target states are not permitted");

        return forVectorStoreConnector(
                com.oracle.bmc.waiter.Waiters.newWaiter(terminationStrategy, delayStrategy),
                request,
                targetStates);
    }

    // Helper method to create a new Waiter for VectorStoreConnector.
    private com.oracle.bmc.waiter.Waiter<
                    GetVectorStoreConnectorRequest, GetVectorStoreConnectorResponse>
            forVectorStoreConnector(
                    com.oracle.bmc.waiter.BmcGenericWaiter waiter,
                    final GetVectorStoreConnectorRequest request,
                    final com.oracle.bmc.generativeai.model.VectorStoreConnector.LifecycleState...
                            targetStates) {
        final java.util.Set<com.oracle.bmc.generativeai.model.VectorStoreConnector.LifecycleState>
                targetStatesSet = new java.util.HashSet<>(java.util.Arrays.asList(targetStates));

        return new com.oracle.bmc.waiter.internal.SimpleWaiterImpl<>(
                executorService,
                waiter.toCallable(
                        () -> request,
                        new java.util.function.Function<
                                GetVectorStoreConnectorRequest, GetVectorStoreConnectorResponse>() {
                            @Override
                            public GetVectorStoreConnectorResponse apply(
                                    GetVectorStoreConnectorRequest request) {
                                return client.getVectorStoreConnector(request);
                            }
                        },
                        new java.util.function.Predicate<GetVectorStoreConnectorResponse>() {
                            @Override
                            public boolean test(GetVectorStoreConnectorResponse response) {
                                return targetStatesSet.contains(
                                        response.getVectorStoreConnector().getLifecycleState());
                            }
                        },
                        targetStatesSet.contains(
                                com.oracle.bmc.generativeai.model.VectorStoreConnector
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
                    GetVectorStoreConnectorFileSyncRequest, GetVectorStoreConnectorFileSyncResponse>
            forVectorStoreConnectorFileSync(
                    GetVectorStoreConnectorFileSyncRequest request,
                    com.oracle.bmc.generativeai.model.VectorStoreConnectorFileSync.LifecycleState...
                            targetStates) {
        com.oracle.bmc.util.internal.Validate.notEmpty(
                targetStates, "At least one targetState must be provided");
        com.oracle.bmc.util.internal.Validate.noNullElements(
                targetStates, "Null targetState values are not permitted");

        return forVectorStoreConnectorFileSync(
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
                    GetVectorStoreConnectorFileSyncRequest, GetVectorStoreConnectorFileSyncResponse>
            forVectorStoreConnectorFileSync(
                    GetVectorStoreConnectorFileSyncRequest request,
                    com.oracle.bmc.generativeai.model.VectorStoreConnectorFileSync.LifecycleState
                            targetState,
                    com.oracle.bmc.waiter.TerminationStrategy terminationStrategy,
                    com.oracle.bmc.waiter.DelayStrategy delayStrategy) {
        com.oracle.bmc.util.internal.Validate.notNull(
                targetState, "The targetState cannot be null");

        return forVectorStoreConnectorFileSync(
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
                    GetVectorStoreConnectorFileSyncRequest, GetVectorStoreConnectorFileSyncResponse>
            forVectorStoreConnectorFileSync(
                    GetVectorStoreConnectorFileSyncRequest request,
                    com.oracle.bmc.waiter.TerminationStrategy terminationStrategy,
                    com.oracle.bmc.waiter.DelayStrategy delayStrategy,
                    com.oracle.bmc.generativeai.model.VectorStoreConnectorFileSync.LifecycleState...
                            targetStates) {
        com.oracle.bmc.util.internal.Validate.notEmpty(
                targetStates, "At least one target state must be provided");
        com.oracle.bmc.util.internal.Validate.noNullElements(
                targetStates, "Null target states are not permitted");

        return forVectorStoreConnectorFileSync(
                com.oracle.bmc.waiter.Waiters.newWaiter(terminationStrategy, delayStrategy),
                request,
                targetStates);
    }

    // Helper method to create a new Waiter for VectorStoreConnectorFileSync.
    private com.oracle.bmc.waiter.Waiter<
                    GetVectorStoreConnectorFileSyncRequest, GetVectorStoreConnectorFileSyncResponse>
            forVectorStoreConnectorFileSync(
                    com.oracle.bmc.waiter.BmcGenericWaiter waiter,
                    final GetVectorStoreConnectorFileSyncRequest request,
                    final com.oracle.bmc.generativeai.model.VectorStoreConnectorFileSync
                                            .LifecycleState
                                    ...
                            targetStates) {
        final java.util.Set<
                        com.oracle.bmc.generativeai.model.VectorStoreConnectorFileSync
                                .LifecycleState>
                targetStatesSet = new java.util.HashSet<>(java.util.Arrays.asList(targetStates));

        return new com.oracle.bmc.waiter.internal.SimpleWaiterImpl<>(
                executorService,
                waiter.toCallable(
                        () -> request,
                        new java.util.function.Function<
                                GetVectorStoreConnectorFileSyncRequest,
                                GetVectorStoreConnectorFileSyncResponse>() {
                            @Override
                            public GetVectorStoreConnectorFileSyncResponse apply(
                                    GetVectorStoreConnectorFileSyncRequest request) {
                                return client.getVectorStoreConnectorFileSync(request);
                            }
                        },
                        new java.util.function.Predicate<
                                GetVectorStoreConnectorFileSyncResponse>() {
                            @Override
                            public boolean test(GetVectorStoreConnectorFileSyncResponse response) {
                                return targetStatesSet.contains(
                                        response.getVectorStoreConnectorFileSync()
                                                .getLifecycleState());
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
