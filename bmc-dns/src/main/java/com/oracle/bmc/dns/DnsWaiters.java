/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.dns;

import com.oracle.bmc.dns.requests.*;
import com.oracle.bmc.dns.responses.*;

/**
 * Collection of helper methods to produce {@link com.oracle.bmc.waiter.Waiter}s for different
 * resources of Dns.
 * <p>
 * The default configuration used is defined by {@link com.oracle.bmc.waiter.Waiters.Waiters#DEFAULT_POLLING_WAITER}.
 */
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20180115")
public class DnsWaiters {
    private final java.util.concurrent.ExecutorService executorService;
    private final Dns client;

    public DnsWaiters(java.util.concurrent.ExecutorService executorService, Dns client) {
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
    public com.oracle.bmc.waiter.Waiter<GetResolverRequest, GetResolverResponse> forResolver(
            GetResolverRequest request,
            com.oracle.bmc.dns.model.Resolver.LifecycleState... targetStates) {
        com.oracle.bmc.util.internal.Validate.notEmpty(
                targetStates, "At least one targetState must be provided");
        com.oracle.bmc.util.internal.Validate.noNullElements(
                targetStates, "Null targetState values are not permitted");

        return forResolver(
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
    public com.oracle.bmc.waiter.Waiter<GetResolverRequest, GetResolverResponse> forResolver(
            GetResolverRequest request,
            com.oracle.bmc.dns.model.Resolver.LifecycleState targetState,
            com.oracle.bmc.waiter.TerminationStrategy terminationStrategy,
            com.oracle.bmc.waiter.DelayStrategy delayStrategy) {
        com.oracle.bmc.util.internal.Validate.notNull(
                targetState, "The targetState cannot be null");

        return forResolver(
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
    public com.oracle.bmc.waiter.Waiter<GetResolverRequest, GetResolverResponse> forResolver(
            GetResolverRequest request,
            com.oracle.bmc.waiter.TerminationStrategy terminationStrategy,
            com.oracle.bmc.waiter.DelayStrategy delayStrategy,
            com.oracle.bmc.dns.model.Resolver.LifecycleState... targetStates) {
        com.oracle.bmc.util.internal.Validate.notEmpty(
                targetStates, "At least one target state must be provided");
        com.oracle.bmc.util.internal.Validate.noNullElements(
                targetStates, "Null target states are not permitted");

        return forResolver(
                com.oracle.bmc.waiter.Waiters.newWaiter(terminationStrategy, delayStrategy),
                request,
                targetStates);
    }

    // Helper method to create a new Waiter for Resolver.
    private com.oracle.bmc.waiter.Waiter<GetResolverRequest, GetResolverResponse> forResolver(
            com.oracle.bmc.waiter.BmcGenericWaiter waiter,
            final GetResolverRequest request,
            final com.oracle.bmc.dns.model.Resolver.LifecycleState... targetStates) {
        final java.util.Set<com.oracle.bmc.dns.model.Resolver.LifecycleState> targetStatesSet =
                new java.util.HashSet<>(java.util.Arrays.asList(targetStates));

        return new com.oracle.bmc.waiter.internal.SimpleWaiterImpl<>(
                executorService,
                waiter.toCallable(
                        () -> request,
                        new java.util.function.Function<GetResolverRequest, GetResolverResponse>() {
                            @Override
                            public GetResolverResponse apply(GetResolverRequest request) {
                                return client.getResolver(request);
                            }
                        },
                        new java.util.function.Predicate<GetResolverResponse>() {
                            @Override
                            public boolean test(GetResolverResponse response) {
                                return targetStatesSet.contains(
                                        response.getResolver().getLifecycleState());
                            }
                        },
                        targetStatesSet.contains(
                                com.oracle.bmc.dns.model.Resolver.LifecycleState.Deleted)),
                request);
    }

    /**
     * Creates a new {@link com.oracle.bmc.waiter.Waiter} using the default configuration.
     *
     * @param request the request to send
     * @param targetStates the desired states to wait for. If multiple states are provided then the waiter will return once the resource reaches any of the provided states
     * @return a new {@code Waiter} instance
     */
    public com.oracle.bmc.waiter.Waiter<GetResolverEndpointRequest, GetResolverEndpointResponse>
            forResolverEndpoint(
                    GetResolverEndpointRequest request,
                    com.oracle.bmc.dns.model.ResolverEndpoint.LifecycleState... targetStates) {
        com.oracle.bmc.util.internal.Validate.notEmpty(
                targetStates, "At least one targetState must be provided");
        com.oracle.bmc.util.internal.Validate.noNullElements(
                targetStates, "Null targetState values are not permitted");

        return forResolverEndpoint(
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
    public com.oracle.bmc.waiter.Waiter<GetResolverEndpointRequest, GetResolverEndpointResponse>
            forResolverEndpoint(
                    GetResolverEndpointRequest request,
                    com.oracle.bmc.dns.model.ResolverEndpoint.LifecycleState targetState,
                    com.oracle.bmc.waiter.TerminationStrategy terminationStrategy,
                    com.oracle.bmc.waiter.DelayStrategy delayStrategy) {
        com.oracle.bmc.util.internal.Validate.notNull(
                targetState, "The targetState cannot be null");

        return forResolverEndpoint(
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
    public com.oracle.bmc.waiter.Waiter<GetResolverEndpointRequest, GetResolverEndpointResponse>
            forResolverEndpoint(
                    GetResolverEndpointRequest request,
                    com.oracle.bmc.waiter.TerminationStrategy terminationStrategy,
                    com.oracle.bmc.waiter.DelayStrategy delayStrategy,
                    com.oracle.bmc.dns.model.ResolverEndpoint.LifecycleState... targetStates) {
        com.oracle.bmc.util.internal.Validate.notEmpty(
                targetStates, "At least one target state must be provided");
        com.oracle.bmc.util.internal.Validate.noNullElements(
                targetStates, "Null target states are not permitted");

        return forResolverEndpoint(
                com.oracle.bmc.waiter.Waiters.newWaiter(terminationStrategy, delayStrategy),
                request,
                targetStates);
    }

    // Helper method to create a new Waiter for ResolverEndpoint.
    private com.oracle.bmc.waiter.Waiter<GetResolverEndpointRequest, GetResolverEndpointResponse>
            forResolverEndpoint(
                    com.oracle.bmc.waiter.BmcGenericWaiter waiter,
                    final GetResolverEndpointRequest request,
                    final com.oracle.bmc.dns.model.ResolverEndpoint.LifecycleState...
                            targetStates) {
        final java.util.Set<com.oracle.bmc.dns.model.ResolverEndpoint.LifecycleState>
                targetStatesSet = new java.util.HashSet<>(java.util.Arrays.asList(targetStates));

        return new com.oracle.bmc.waiter.internal.SimpleWaiterImpl<>(
                executorService,
                waiter.toCallable(
                        () -> request,
                        new java.util.function.Function<
                                GetResolverEndpointRequest, GetResolverEndpointResponse>() {
                            @Override
                            public GetResolverEndpointResponse apply(
                                    GetResolverEndpointRequest request) {
                                return client.getResolverEndpoint(request);
                            }
                        },
                        new java.util.function.Predicate<GetResolverEndpointResponse>() {
                            @Override
                            public boolean test(GetResolverEndpointResponse response) {
                                return targetStatesSet.contains(
                                        response.getResolverEndpoint().getLifecycleState());
                            }
                        },
                        targetStatesSet.contains(
                                com.oracle.bmc.dns.model.ResolverEndpoint.LifecycleState.Deleted)),
                request);
    }

    /**
     * Creates a new {@link com.oracle.bmc.waiter.Waiter} using the default configuration.
     *
     * @param request the request to send
     * @param targetStates the desired states to wait for. If multiple states are provided then the waiter will return once the resource reaches any of the provided states
     * @return a new {@code Waiter} instance
     */
    public com.oracle.bmc.waiter.Waiter<GetSteeringPolicyRequest, GetSteeringPolicyResponse>
            forSteeringPolicy(
                    GetSteeringPolicyRequest request,
                    com.oracle.bmc.dns.model.SteeringPolicy.LifecycleState... targetStates) {
        com.oracle.bmc.util.internal.Validate.notEmpty(
                targetStates, "At least one targetState must be provided");
        com.oracle.bmc.util.internal.Validate.noNullElements(
                targetStates, "Null targetState values are not permitted");

        return forSteeringPolicy(
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
    public com.oracle.bmc.waiter.Waiter<GetSteeringPolicyRequest, GetSteeringPolicyResponse>
            forSteeringPolicy(
                    GetSteeringPolicyRequest request,
                    com.oracle.bmc.dns.model.SteeringPolicy.LifecycleState targetState,
                    com.oracle.bmc.waiter.TerminationStrategy terminationStrategy,
                    com.oracle.bmc.waiter.DelayStrategy delayStrategy) {
        com.oracle.bmc.util.internal.Validate.notNull(
                targetState, "The targetState cannot be null");

        return forSteeringPolicy(
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
    public com.oracle.bmc.waiter.Waiter<GetSteeringPolicyRequest, GetSteeringPolicyResponse>
            forSteeringPolicy(
                    GetSteeringPolicyRequest request,
                    com.oracle.bmc.waiter.TerminationStrategy terminationStrategy,
                    com.oracle.bmc.waiter.DelayStrategy delayStrategy,
                    com.oracle.bmc.dns.model.SteeringPolicy.LifecycleState... targetStates) {
        com.oracle.bmc.util.internal.Validate.notEmpty(
                targetStates, "At least one target state must be provided");
        com.oracle.bmc.util.internal.Validate.noNullElements(
                targetStates, "Null target states are not permitted");

        return forSteeringPolicy(
                com.oracle.bmc.waiter.Waiters.newWaiter(terminationStrategy, delayStrategy),
                request,
                targetStates);
    }

    // Helper method to create a new Waiter for SteeringPolicy.
    private com.oracle.bmc.waiter.Waiter<GetSteeringPolicyRequest, GetSteeringPolicyResponse>
            forSteeringPolicy(
                    com.oracle.bmc.waiter.BmcGenericWaiter waiter,
                    final GetSteeringPolicyRequest request,
                    final com.oracle.bmc.dns.model.SteeringPolicy.LifecycleState... targetStates) {
        final java.util.Set<com.oracle.bmc.dns.model.SteeringPolicy.LifecycleState>
                targetStatesSet = new java.util.HashSet<>(java.util.Arrays.asList(targetStates));

        return new com.oracle.bmc.waiter.internal.SimpleWaiterImpl<>(
                executorService,
                waiter.toCallable(
                        () -> request,
                        new java.util.function.Function<
                                GetSteeringPolicyRequest, GetSteeringPolicyResponse>() {
                            @Override
                            public GetSteeringPolicyResponse apply(
                                    GetSteeringPolicyRequest request) {
                                return client.getSteeringPolicy(request);
                            }
                        },
                        new java.util.function.Predicate<GetSteeringPolicyResponse>() {
                            @Override
                            public boolean test(GetSteeringPolicyResponse response) {
                                return targetStatesSet.contains(
                                        response.getSteeringPolicy().getLifecycleState());
                            }
                        },
                        targetStatesSet.contains(
                                com.oracle.bmc.dns.model.SteeringPolicy.LifecycleState.Deleted)),
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
                    GetSteeringPolicyAttachmentRequest, GetSteeringPolicyAttachmentResponse>
            forSteeringPolicyAttachment(
                    GetSteeringPolicyAttachmentRequest request,
                    com.oracle.bmc.dns.model.SteeringPolicyAttachment.LifecycleState...
                            targetStates) {
        com.oracle.bmc.util.internal.Validate.notEmpty(
                targetStates, "At least one targetState must be provided");
        com.oracle.bmc.util.internal.Validate.noNullElements(
                targetStates, "Null targetState values are not permitted");

        return forSteeringPolicyAttachment(
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
                    GetSteeringPolicyAttachmentRequest, GetSteeringPolicyAttachmentResponse>
            forSteeringPolicyAttachment(
                    GetSteeringPolicyAttachmentRequest request,
                    com.oracle.bmc.dns.model.SteeringPolicyAttachment.LifecycleState targetState,
                    com.oracle.bmc.waiter.TerminationStrategy terminationStrategy,
                    com.oracle.bmc.waiter.DelayStrategy delayStrategy) {
        com.oracle.bmc.util.internal.Validate.notNull(
                targetState, "The targetState cannot be null");

        return forSteeringPolicyAttachment(
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
                    GetSteeringPolicyAttachmentRequest, GetSteeringPolicyAttachmentResponse>
            forSteeringPolicyAttachment(
                    GetSteeringPolicyAttachmentRequest request,
                    com.oracle.bmc.waiter.TerminationStrategy terminationStrategy,
                    com.oracle.bmc.waiter.DelayStrategy delayStrategy,
                    com.oracle.bmc.dns.model.SteeringPolicyAttachment.LifecycleState...
                            targetStates) {
        com.oracle.bmc.util.internal.Validate.notEmpty(
                targetStates, "At least one target state must be provided");
        com.oracle.bmc.util.internal.Validate.noNullElements(
                targetStates, "Null target states are not permitted");

        return forSteeringPolicyAttachment(
                com.oracle.bmc.waiter.Waiters.newWaiter(terminationStrategy, delayStrategy),
                request,
                targetStates);
    }

    // Helper method to create a new Waiter for SteeringPolicyAttachment.
    private com.oracle.bmc.waiter.Waiter<
                    GetSteeringPolicyAttachmentRequest, GetSteeringPolicyAttachmentResponse>
            forSteeringPolicyAttachment(
                    com.oracle.bmc.waiter.BmcGenericWaiter waiter,
                    final GetSteeringPolicyAttachmentRequest request,
                    final com.oracle.bmc.dns.model.SteeringPolicyAttachment.LifecycleState...
                            targetStates) {
        final java.util.Set<com.oracle.bmc.dns.model.SteeringPolicyAttachment.LifecycleState>
                targetStatesSet = new java.util.HashSet<>(java.util.Arrays.asList(targetStates));

        return new com.oracle.bmc.waiter.internal.SimpleWaiterImpl<>(
                executorService,
                waiter.toCallable(
                        () -> request,
                        new java.util.function.Function<
                                GetSteeringPolicyAttachmentRequest,
                                GetSteeringPolicyAttachmentResponse>() {
                            @Override
                            public GetSteeringPolicyAttachmentResponse apply(
                                    GetSteeringPolicyAttachmentRequest request) {
                                return client.getSteeringPolicyAttachment(request);
                            }
                        },
                        new java.util.function.Predicate<GetSteeringPolicyAttachmentResponse>() {
                            @Override
                            public boolean test(GetSteeringPolicyAttachmentResponse response) {
                                return targetStatesSet.contains(
                                        response.getSteeringPolicyAttachment().getLifecycleState());
                            }
                        },
                        false),
                request);
    }

    /**
     * Creates a new {@link com.oracle.bmc.waiter.Waiter} using the default configuration.
     *
     * @param request the request to send
     * @param targetStates the desired states to wait for. If multiple states are provided then the waiter will return once the resource reaches any of the provided states
     * @return a new {@code Waiter} instance
     */
    public com.oracle.bmc.waiter.Waiter<GetTsigKeyRequest, GetTsigKeyResponse> forTsigKey(
            GetTsigKeyRequest request,
            com.oracle.bmc.dns.model.TsigKey.LifecycleState... targetStates) {
        com.oracle.bmc.util.internal.Validate.notEmpty(
                targetStates, "At least one targetState must be provided");
        com.oracle.bmc.util.internal.Validate.noNullElements(
                targetStates, "Null targetState values are not permitted");

        return forTsigKey(
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
    public com.oracle.bmc.waiter.Waiter<GetTsigKeyRequest, GetTsigKeyResponse> forTsigKey(
            GetTsigKeyRequest request,
            com.oracle.bmc.dns.model.TsigKey.LifecycleState targetState,
            com.oracle.bmc.waiter.TerminationStrategy terminationStrategy,
            com.oracle.bmc.waiter.DelayStrategy delayStrategy) {
        com.oracle.bmc.util.internal.Validate.notNull(
                targetState, "The targetState cannot be null");

        return forTsigKey(
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
    public com.oracle.bmc.waiter.Waiter<GetTsigKeyRequest, GetTsigKeyResponse> forTsigKey(
            GetTsigKeyRequest request,
            com.oracle.bmc.waiter.TerminationStrategy terminationStrategy,
            com.oracle.bmc.waiter.DelayStrategy delayStrategy,
            com.oracle.bmc.dns.model.TsigKey.LifecycleState... targetStates) {
        com.oracle.bmc.util.internal.Validate.notEmpty(
                targetStates, "At least one target state must be provided");
        com.oracle.bmc.util.internal.Validate.noNullElements(
                targetStates, "Null target states are not permitted");

        return forTsigKey(
                com.oracle.bmc.waiter.Waiters.newWaiter(terminationStrategy, delayStrategy),
                request,
                targetStates);
    }

    // Helper method to create a new Waiter for TsigKey.
    private com.oracle.bmc.waiter.Waiter<GetTsigKeyRequest, GetTsigKeyResponse> forTsigKey(
            com.oracle.bmc.waiter.BmcGenericWaiter waiter,
            final GetTsigKeyRequest request,
            final com.oracle.bmc.dns.model.TsigKey.LifecycleState... targetStates) {
        final java.util.Set<com.oracle.bmc.dns.model.TsigKey.LifecycleState> targetStatesSet =
                new java.util.HashSet<>(java.util.Arrays.asList(targetStates));

        return new com.oracle.bmc.waiter.internal.SimpleWaiterImpl<>(
                executorService,
                waiter.toCallable(
                        () -> request,
                        new java.util.function.Function<GetTsigKeyRequest, GetTsigKeyResponse>() {
                            @Override
                            public GetTsigKeyResponse apply(GetTsigKeyRequest request) {
                                return client.getTsigKey(request);
                            }
                        },
                        new java.util.function.Predicate<GetTsigKeyResponse>() {
                            @Override
                            public boolean test(GetTsigKeyResponse response) {
                                return targetStatesSet.contains(
                                        response.getTsigKey().getLifecycleState());
                            }
                        },
                        targetStatesSet.contains(
                                com.oracle.bmc.dns.model.TsigKey.LifecycleState.Deleted)),
                request);
    }

    /**
     * Creates a new {@link com.oracle.bmc.waiter.Waiter} using the default configuration.
     *
     * @param request the request to send
     * @param targetStates the desired states to wait for. If multiple states are provided then the waiter will return once the resource reaches any of the provided states
     * @return a new {@code Waiter} instance
     */
    public com.oracle.bmc.waiter.Waiter<GetViewRequest, GetViewResponse> forView(
            GetViewRequest request, com.oracle.bmc.dns.model.View.LifecycleState... targetStates) {
        com.oracle.bmc.util.internal.Validate.notEmpty(
                targetStates, "At least one targetState must be provided");
        com.oracle.bmc.util.internal.Validate.noNullElements(
                targetStates, "Null targetState values are not permitted");

        return forView(com.oracle.bmc.waiter.Waiters.DEFAULT_POLLING_WAITER, request, targetStates);
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
    public com.oracle.bmc.waiter.Waiter<GetViewRequest, GetViewResponse> forView(
            GetViewRequest request,
            com.oracle.bmc.dns.model.View.LifecycleState targetState,
            com.oracle.bmc.waiter.TerminationStrategy terminationStrategy,
            com.oracle.bmc.waiter.DelayStrategy delayStrategy) {
        com.oracle.bmc.util.internal.Validate.notNull(
                targetState, "The targetState cannot be null");

        return forView(
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
    public com.oracle.bmc.waiter.Waiter<GetViewRequest, GetViewResponse> forView(
            GetViewRequest request,
            com.oracle.bmc.waiter.TerminationStrategy terminationStrategy,
            com.oracle.bmc.waiter.DelayStrategy delayStrategy,
            com.oracle.bmc.dns.model.View.LifecycleState... targetStates) {
        com.oracle.bmc.util.internal.Validate.notEmpty(
                targetStates, "At least one target state must be provided");
        com.oracle.bmc.util.internal.Validate.noNullElements(
                targetStates, "Null target states are not permitted");

        return forView(
                com.oracle.bmc.waiter.Waiters.newWaiter(terminationStrategy, delayStrategy),
                request,
                targetStates);
    }

    // Helper method to create a new Waiter for View.
    private com.oracle.bmc.waiter.Waiter<GetViewRequest, GetViewResponse> forView(
            com.oracle.bmc.waiter.BmcGenericWaiter waiter,
            final GetViewRequest request,
            final com.oracle.bmc.dns.model.View.LifecycleState... targetStates) {
        final java.util.Set<com.oracle.bmc.dns.model.View.LifecycleState> targetStatesSet =
                new java.util.HashSet<>(java.util.Arrays.asList(targetStates));

        return new com.oracle.bmc.waiter.internal.SimpleWaiterImpl<>(
                executorService,
                waiter.toCallable(
                        () -> request,
                        new java.util.function.Function<GetViewRequest, GetViewResponse>() {
                            @Override
                            public GetViewResponse apply(GetViewRequest request) {
                                return client.getView(request);
                            }
                        },
                        new java.util.function.Predicate<GetViewResponse>() {
                            @Override
                            public boolean test(GetViewResponse response) {
                                return targetStatesSet.contains(
                                        response.getView().getLifecycleState());
                            }
                        },
                        targetStatesSet.contains(
                                com.oracle.bmc.dns.model.View.LifecycleState.Deleted)),
                request);
    }

    /**
     * Creates a new {@link com.oracle.bmc.waiter.Waiter} using the default configuration.
     *
     * @param request the request to send
     * @param targetStates the desired states to wait for. If multiple states are provided then the waiter will return once the resource reaches any of the provided states
     * @return a new {@code Waiter} instance
     */
    public com.oracle.bmc.waiter.Waiter<GetZoneRequest, GetZoneResponse> forZone(
            GetZoneRequest request, com.oracle.bmc.dns.model.Zone.LifecycleState... targetStates) {
        com.oracle.bmc.util.internal.Validate.notEmpty(
                targetStates, "At least one targetState must be provided");
        com.oracle.bmc.util.internal.Validate.noNullElements(
                targetStates, "Null targetState values are not permitted");

        return forZone(com.oracle.bmc.waiter.Waiters.DEFAULT_POLLING_WAITER, request, targetStates);
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
    public com.oracle.bmc.waiter.Waiter<GetZoneRequest, GetZoneResponse> forZone(
            GetZoneRequest request,
            com.oracle.bmc.dns.model.Zone.LifecycleState targetState,
            com.oracle.bmc.waiter.TerminationStrategy terminationStrategy,
            com.oracle.bmc.waiter.DelayStrategy delayStrategy) {
        com.oracle.bmc.util.internal.Validate.notNull(
                targetState, "The targetState cannot be null");

        return forZone(
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
    public com.oracle.bmc.waiter.Waiter<GetZoneRequest, GetZoneResponse> forZone(
            GetZoneRequest request,
            com.oracle.bmc.waiter.TerminationStrategy terminationStrategy,
            com.oracle.bmc.waiter.DelayStrategy delayStrategy,
            com.oracle.bmc.dns.model.Zone.LifecycleState... targetStates) {
        com.oracle.bmc.util.internal.Validate.notEmpty(
                targetStates, "At least one target state must be provided");
        com.oracle.bmc.util.internal.Validate.noNullElements(
                targetStates, "Null target states are not permitted");

        return forZone(
                com.oracle.bmc.waiter.Waiters.newWaiter(terminationStrategy, delayStrategy),
                request,
                targetStates);
    }

    // Helper method to create a new Waiter for Zone.
    private com.oracle.bmc.waiter.Waiter<GetZoneRequest, GetZoneResponse> forZone(
            com.oracle.bmc.waiter.BmcGenericWaiter waiter,
            final GetZoneRequest request,
            final com.oracle.bmc.dns.model.Zone.LifecycleState... targetStates) {
        final java.util.Set<com.oracle.bmc.dns.model.Zone.LifecycleState> targetStatesSet =
                new java.util.HashSet<>(java.util.Arrays.asList(targetStates));

        return new com.oracle.bmc.waiter.internal.SimpleWaiterImpl<>(
                executorService,
                waiter.toCallable(
                        () -> request,
                        new java.util.function.Function<GetZoneRequest, GetZoneResponse>() {
                            @Override
                            public GetZoneResponse apply(GetZoneRequest request) {
                                return client.getZone(request);
                            }
                        },
                        new java.util.function.Predicate<GetZoneResponse>() {
                            @Override
                            public boolean test(GetZoneResponse response) {
                                return targetStatesSet.contains(
                                        response.getZone().getLifecycleState());
                            }
                        },
                        targetStatesSet.contains(
                                com.oracle.bmc.dns.model.Zone.LifecycleState.Deleted)),
                request);
    }
}
