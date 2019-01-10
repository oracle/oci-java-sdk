/**
 * Copyright (c) 2016, 2019, Oracle and/or its affiliates. All rights reserved.
 */
package com.oracle.bmc.core;

import com.oracle.bmc.core.requests.*;
import com.oracle.bmc.core.responses.*;

/**
 * Collection of helper methods to produce {@link Waiter}s for different
 * resources of VirtualNetwork.
 * <p>
 * The default configuration used is defined by {@link Waiters#DEFAULT_POLLING_WAITER}.
 */
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20160918")
@lombok.RequiredArgsConstructor
public class VirtualNetworkWaiters {
    private final java.util.concurrent.ExecutorService executorService;
    private final VirtualNetwork client;

    /**
     * Creates a new {@link Waiter} using default configuration.
     *
     * @param request the request to send
     * @param targetStates the desired states to wait for. If multiple states are provided then the waiter will return once the resource reaches any of the provided states
     * @return a new {@code Waiter} instance
     */
    public com.oracle.bmc.waiter.Waiter<GetCrossConnectRequest, GetCrossConnectResponse>
            forCrossConnect(
                    GetCrossConnectRequest request,
                    com.oracle.bmc.core.model.CrossConnect.LifecycleState... targetStates) {
        org.apache.commons.lang3.Validate.notEmpty(
                targetStates, "At least one targetState must be provided");
        org.apache.commons.lang3.Validate.noNullElements(
                targetStates, "Null targetState values are not permitted");

        return forCrossConnect(
                com.oracle.bmc.waiter.Waiters.DEFAULT_POLLING_WAITER, request, targetStates);
    }

    /**
     * Creates a new {@link Waiter} using the provided configuration.
     *
     * @param request the request to send
     * @param targetState the desired state to wait for
     * @param terminationStrategy the {@link TerminationStrategy} to use
     * @param delayStrategy the {@link DelayStrategy} to use
     * @return a new {@code Waiter} instance
     */
    public com.oracle.bmc.waiter.Waiter<GetCrossConnectRequest, GetCrossConnectResponse>
            forCrossConnect(
                    GetCrossConnectRequest request,
                    com.oracle.bmc.core.model.CrossConnect.LifecycleState targetState,
                    com.oracle.bmc.waiter.TerminationStrategy terminationStrategy,
                    com.oracle.bmc.waiter.DelayStrategy delayStrategy) {
        org.apache.commons.lang3.Validate.notNull(targetState, "The targetState cannot be null");

        return forCrossConnect(
                com.oracle.bmc.waiter.Waiters.newWaiter(terminationStrategy, delayStrategy),
                request,
                targetState);
    }

    /**
     * Creates a new {@link Waiter} using the provided configuration.
     *
     * @param request the request to send
     * @param terminationStrategy the {@link TerminationStrategy} to use
     * @param delayStrategy the {@link DelayStrategy} to use
     * @param targetStates the desired states to wait for. The waiter will return once the resource reaches any of the provided states
     * @return a new {@code Waiter} instance
     */
    public com.oracle.bmc.waiter.Waiter<GetCrossConnectRequest, GetCrossConnectResponse>
            forCrossConnect(
                    GetCrossConnectRequest request,
                    com.oracle.bmc.waiter.TerminationStrategy terminationStrategy,
                    com.oracle.bmc.waiter.DelayStrategy delayStrategy,
                    com.oracle.bmc.core.model.CrossConnect.LifecycleState... targetStates) {
        org.apache.commons.lang3.Validate.notEmpty(
                targetStates, "At least one target state must be provided");
        org.apache.commons.lang3.Validate.noNullElements(
                targetStates, "Null target states are not permitted");

        return forCrossConnect(
                com.oracle.bmc.waiter.Waiters.newWaiter(terminationStrategy, delayStrategy),
                request,
                targetStates);
    }

    // Helper method to create a new Waiter for CrossConnect.
    private com.oracle.bmc.waiter.Waiter<GetCrossConnectRequest, GetCrossConnectResponse>
            forCrossConnect(
                    com.oracle.bmc.waiter.BmcGenericWaiter waiter,
                    final GetCrossConnectRequest request,
                    final com.oracle.bmc.core.model.CrossConnect.LifecycleState... targetStates) {
        final java.util.Set<com.oracle.bmc.core.model.CrossConnect.LifecycleState> targetStatesSet =
                new java.util.HashSet<>(java.util.Arrays.asList(targetStates));

        return new com.oracle.bmc.waiter.internal.SimpleWaiterImpl<>(
                executorService,
                waiter.toCallable(
                        com.google.common.base.Suppliers.ofInstance(request),
                        new com.google.common.base.Function<
                                GetCrossConnectRequest, GetCrossConnectResponse>() {
                            @Override
                            public GetCrossConnectResponse apply(GetCrossConnectRequest request) {
                                return client.getCrossConnect(request);
                            }
                        },
                        new com.google.common.base.Predicate<GetCrossConnectResponse>() {
                            @Override
                            public boolean apply(GetCrossConnectResponse response) {
                                return targetStatesSet.contains(
                                        response.getCrossConnect().getLifecycleState());
                            }
                        },
                        targetStatesSet.contains(
                                com.oracle.bmc.core.model.CrossConnect.LifecycleState.Terminated)),
                request);
    }

    /**
     * Creates a new {@link Waiter} using default configuration.
     *
     * @param request the request to send
     * @param targetStates the desired states to wait for. If multiple states are provided then the waiter will return once the resource reaches any of the provided states
     * @return a new {@code Waiter} instance
     */
    public com.oracle.bmc.waiter.Waiter<GetCrossConnectGroupRequest, GetCrossConnectGroupResponse>
            forCrossConnectGroup(
                    GetCrossConnectGroupRequest request,
                    com.oracle.bmc.core.model.CrossConnectGroup.LifecycleState... targetStates) {
        org.apache.commons.lang3.Validate.notEmpty(
                targetStates, "At least one targetState must be provided");
        org.apache.commons.lang3.Validate.noNullElements(
                targetStates, "Null targetState values are not permitted");

        return forCrossConnectGroup(
                com.oracle.bmc.waiter.Waiters.DEFAULT_POLLING_WAITER, request, targetStates);
    }

    /**
     * Creates a new {@link Waiter} using the provided configuration.
     *
     * @param request the request to send
     * @param targetState the desired state to wait for
     * @param terminationStrategy the {@link TerminationStrategy} to use
     * @param delayStrategy the {@link DelayStrategy} to use
     * @return a new {@code Waiter} instance
     */
    public com.oracle.bmc.waiter.Waiter<GetCrossConnectGroupRequest, GetCrossConnectGroupResponse>
            forCrossConnectGroup(
                    GetCrossConnectGroupRequest request,
                    com.oracle.bmc.core.model.CrossConnectGroup.LifecycleState targetState,
                    com.oracle.bmc.waiter.TerminationStrategy terminationStrategy,
                    com.oracle.bmc.waiter.DelayStrategy delayStrategy) {
        org.apache.commons.lang3.Validate.notNull(targetState, "The targetState cannot be null");

        return forCrossConnectGroup(
                com.oracle.bmc.waiter.Waiters.newWaiter(terminationStrategy, delayStrategy),
                request,
                targetState);
    }

    /**
     * Creates a new {@link Waiter} using the provided configuration.
     *
     * @param request the request to send
     * @param terminationStrategy the {@link TerminationStrategy} to use
     * @param delayStrategy the {@link DelayStrategy} to use
     * @param targetStates the desired states to wait for. The waiter will return once the resource reaches any of the provided states
     * @return a new {@code Waiter} instance
     */
    public com.oracle.bmc.waiter.Waiter<GetCrossConnectGroupRequest, GetCrossConnectGroupResponse>
            forCrossConnectGroup(
                    GetCrossConnectGroupRequest request,
                    com.oracle.bmc.waiter.TerminationStrategy terminationStrategy,
                    com.oracle.bmc.waiter.DelayStrategy delayStrategy,
                    com.oracle.bmc.core.model.CrossConnectGroup.LifecycleState... targetStates) {
        org.apache.commons.lang3.Validate.notEmpty(
                targetStates, "At least one target state must be provided");
        org.apache.commons.lang3.Validate.noNullElements(
                targetStates, "Null target states are not permitted");

        return forCrossConnectGroup(
                com.oracle.bmc.waiter.Waiters.newWaiter(terminationStrategy, delayStrategy),
                request,
                targetStates);
    }

    // Helper method to create a new Waiter for CrossConnectGroup.
    private com.oracle.bmc.waiter.Waiter<GetCrossConnectGroupRequest, GetCrossConnectGroupResponse>
            forCrossConnectGroup(
                    com.oracle.bmc.waiter.BmcGenericWaiter waiter,
                    final GetCrossConnectGroupRequest request,
                    final com.oracle.bmc.core.model.CrossConnectGroup.LifecycleState...
                            targetStates) {
        final java.util.Set<com.oracle.bmc.core.model.CrossConnectGroup.LifecycleState>
                targetStatesSet = new java.util.HashSet<>(java.util.Arrays.asList(targetStates));

        return new com.oracle.bmc.waiter.internal.SimpleWaiterImpl<>(
                executorService,
                waiter.toCallable(
                        com.google.common.base.Suppliers.ofInstance(request),
                        new com.google.common.base.Function<
                                GetCrossConnectGroupRequest, GetCrossConnectGroupResponse>() {
                            @Override
                            public GetCrossConnectGroupResponse apply(
                                    GetCrossConnectGroupRequest request) {
                                return client.getCrossConnectGroup(request);
                            }
                        },
                        new com.google.common.base.Predicate<GetCrossConnectGroupResponse>() {
                            @Override
                            public boolean apply(GetCrossConnectGroupResponse response) {
                                return targetStatesSet.contains(
                                        response.getCrossConnectGroup().getLifecycleState());
                            }
                        },
                        targetStatesSet.contains(
                                com.oracle.bmc.core.model.CrossConnectGroup.LifecycleState
                                        .Terminated)),
                request);
    }

    /**
     * Creates a new {@link Waiter} using default configuration.
     *
     * @param request the request to send
     * @param targetStates the desired states to wait for. If multiple states are provided then the waiter will return once the resource reaches any of the provided states
     * @return a new {@code Waiter} instance
     */
    public com.oracle.bmc.waiter.Waiter<GetDhcpOptionsRequest, GetDhcpOptionsResponse>
            forDhcpOptions(
                    GetDhcpOptionsRequest request,
                    com.oracle.bmc.core.model.DhcpOptions.LifecycleState... targetStates) {
        org.apache.commons.lang3.Validate.notEmpty(
                targetStates, "At least one targetState must be provided");
        org.apache.commons.lang3.Validate.noNullElements(
                targetStates, "Null targetState values are not permitted");

        return forDhcpOptions(
                com.oracle.bmc.waiter.Waiters.DEFAULT_POLLING_WAITER, request, targetStates);
    }

    /**
     * Creates a new {@link Waiter} using the provided configuration.
     *
     * @param request the request to send
     * @param targetState the desired state to wait for
     * @param terminationStrategy the {@link TerminationStrategy} to use
     * @param delayStrategy the {@link DelayStrategy} to use
     * @return a new {@code Waiter} instance
     */
    public com.oracle.bmc.waiter.Waiter<GetDhcpOptionsRequest, GetDhcpOptionsResponse>
            forDhcpOptions(
                    GetDhcpOptionsRequest request,
                    com.oracle.bmc.core.model.DhcpOptions.LifecycleState targetState,
                    com.oracle.bmc.waiter.TerminationStrategy terminationStrategy,
                    com.oracle.bmc.waiter.DelayStrategy delayStrategy) {
        org.apache.commons.lang3.Validate.notNull(targetState, "The targetState cannot be null");

        return forDhcpOptions(
                com.oracle.bmc.waiter.Waiters.newWaiter(terminationStrategy, delayStrategy),
                request,
                targetState);
    }

    /**
     * Creates a new {@link Waiter} using the provided configuration.
     *
     * @param request the request to send
     * @param terminationStrategy the {@link TerminationStrategy} to use
     * @param delayStrategy the {@link DelayStrategy} to use
     * @param targetStates the desired states to wait for. The waiter will return once the resource reaches any of the provided states
     * @return a new {@code Waiter} instance
     */
    public com.oracle.bmc.waiter.Waiter<GetDhcpOptionsRequest, GetDhcpOptionsResponse>
            forDhcpOptions(
                    GetDhcpOptionsRequest request,
                    com.oracle.bmc.waiter.TerminationStrategy terminationStrategy,
                    com.oracle.bmc.waiter.DelayStrategy delayStrategy,
                    com.oracle.bmc.core.model.DhcpOptions.LifecycleState... targetStates) {
        org.apache.commons.lang3.Validate.notEmpty(
                targetStates, "At least one target state must be provided");
        org.apache.commons.lang3.Validate.noNullElements(
                targetStates, "Null target states are not permitted");

        return forDhcpOptions(
                com.oracle.bmc.waiter.Waiters.newWaiter(terminationStrategy, delayStrategy),
                request,
                targetStates);
    }

    // Helper method to create a new Waiter for DhcpOptions.
    private com.oracle.bmc.waiter.Waiter<GetDhcpOptionsRequest, GetDhcpOptionsResponse>
            forDhcpOptions(
                    com.oracle.bmc.waiter.BmcGenericWaiter waiter,
                    final GetDhcpOptionsRequest request,
                    final com.oracle.bmc.core.model.DhcpOptions.LifecycleState... targetStates) {
        final java.util.Set<com.oracle.bmc.core.model.DhcpOptions.LifecycleState> targetStatesSet =
                new java.util.HashSet<>(java.util.Arrays.asList(targetStates));

        return new com.oracle.bmc.waiter.internal.SimpleWaiterImpl<>(
                executorService,
                waiter.toCallable(
                        com.google.common.base.Suppliers.ofInstance(request),
                        new com.google.common.base.Function<
                                GetDhcpOptionsRequest, GetDhcpOptionsResponse>() {
                            @Override
                            public GetDhcpOptionsResponse apply(GetDhcpOptionsRequest request) {
                                return client.getDhcpOptions(request);
                            }
                        },
                        new com.google.common.base.Predicate<GetDhcpOptionsResponse>() {
                            @Override
                            public boolean apply(GetDhcpOptionsResponse response) {
                                return targetStatesSet.contains(
                                        response.getDhcpOptions().getLifecycleState());
                            }
                        },
                        targetStatesSet.contains(
                                com.oracle.bmc.core.model.DhcpOptions.LifecycleState.Terminated)),
                request);
    }

    /**
     * Creates a new {@link Waiter} using default configuration.
     *
     * @param request the request to send
     * @param targetStates the desired states to wait for. If multiple states are provided then the waiter will return once the resource reaches any of the provided states
     * @return a new {@code Waiter} instance
     */
    public com.oracle.bmc.waiter.Waiter<GetDrgRequest, GetDrgResponse> forDrg(
            GetDrgRequest request, com.oracle.bmc.core.model.Drg.LifecycleState... targetStates) {
        org.apache.commons.lang3.Validate.notEmpty(
                targetStates, "At least one targetState must be provided");
        org.apache.commons.lang3.Validate.noNullElements(
                targetStates, "Null targetState values are not permitted");

        return forDrg(com.oracle.bmc.waiter.Waiters.DEFAULT_POLLING_WAITER, request, targetStates);
    }

    /**
     * Creates a new {@link Waiter} using the provided configuration.
     *
     * @param request the request to send
     * @param targetState the desired state to wait for
     * @param terminationStrategy the {@link TerminationStrategy} to use
     * @param delayStrategy the {@link DelayStrategy} to use
     * @return a new {@code Waiter} instance
     */
    public com.oracle.bmc.waiter.Waiter<GetDrgRequest, GetDrgResponse> forDrg(
            GetDrgRequest request,
            com.oracle.bmc.core.model.Drg.LifecycleState targetState,
            com.oracle.bmc.waiter.TerminationStrategy terminationStrategy,
            com.oracle.bmc.waiter.DelayStrategy delayStrategy) {
        org.apache.commons.lang3.Validate.notNull(targetState, "The targetState cannot be null");

        return forDrg(
                com.oracle.bmc.waiter.Waiters.newWaiter(terminationStrategy, delayStrategy),
                request,
                targetState);
    }

    /**
     * Creates a new {@link Waiter} using the provided configuration.
     *
     * @param request the request to send
     * @param terminationStrategy the {@link TerminationStrategy} to use
     * @param delayStrategy the {@link DelayStrategy} to use
     * @param targetStates the desired states to wait for. The waiter will return once the resource reaches any of the provided states
     * @return a new {@code Waiter} instance
     */
    public com.oracle.bmc.waiter.Waiter<GetDrgRequest, GetDrgResponse> forDrg(
            GetDrgRequest request,
            com.oracle.bmc.waiter.TerminationStrategy terminationStrategy,
            com.oracle.bmc.waiter.DelayStrategy delayStrategy,
            com.oracle.bmc.core.model.Drg.LifecycleState... targetStates) {
        org.apache.commons.lang3.Validate.notEmpty(
                targetStates, "At least one target state must be provided");
        org.apache.commons.lang3.Validate.noNullElements(
                targetStates, "Null target states are not permitted");

        return forDrg(
                com.oracle.bmc.waiter.Waiters.newWaiter(terminationStrategy, delayStrategy),
                request,
                targetStates);
    }

    // Helper method to create a new Waiter for Drg.
    private com.oracle.bmc.waiter.Waiter<GetDrgRequest, GetDrgResponse> forDrg(
            com.oracle.bmc.waiter.BmcGenericWaiter waiter,
            final GetDrgRequest request,
            final com.oracle.bmc.core.model.Drg.LifecycleState... targetStates) {
        final java.util.Set<com.oracle.bmc.core.model.Drg.LifecycleState> targetStatesSet =
                new java.util.HashSet<>(java.util.Arrays.asList(targetStates));

        return new com.oracle.bmc.waiter.internal.SimpleWaiterImpl<>(
                executorService,
                waiter.toCallable(
                        com.google.common.base.Suppliers.ofInstance(request),
                        new com.google.common.base.Function<GetDrgRequest, GetDrgResponse>() {
                            @Override
                            public GetDrgResponse apply(GetDrgRequest request) {
                                return client.getDrg(request);
                            }
                        },
                        new com.google.common.base.Predicate<GetDrgResponse>() {
                            @Override
                            public boolean apply(GetDrgResponse response) {
                                return targetStatesSet.contains(
                                        response.getDrg().getLifecycleState());
                            }
                        },
                        targetStatesSet.contains(
                                com.oracle.bmc.core.model.Drg.LifecycleState.Terminated)),
                request);
    }

    /**
     * Creates a new {@link Waiter} using default configuration.
     *
     * @param request the request to send
     * @param targetStates the desired states to wait for. If multiple states are provided then the waiter will return once the resource reaches any of the provided states
     * @return a new {@code Waiter} instance
     */
    public com.oracle.bmc.waiter.Waiter<GetDrgAttachmentRequest, GetDrgAttachmentResponse>
            forDrgAttachment(
                    GetDrgAttachmentRequest request,
                    com.oracle.bmc.core.model.DrgAttachment.LifecycleState... targetStates) {
        org.apache.commons.lang3.Validate.notEmpty(
                targetStates, "At least one targetState must be provided");
        org.apache.commons.lang3.Validate.noNullElements(
                targetStates, "Null targetState values are not permitted");

        return forDrgAttachment(
                com.oracle.bmc.waiter.Waiters.DEFAULT_POLLING_WAITER, request, targetStates);
    }

    /**
     * Creates a new {@link Waiter} using the provided configuration.
     *
     * @param request the request to send
     * @param targetState the desired state to wait for
     * @param terminationStrategy the {@link TerminationStrategy} to use
     * @param delayStrategy the {@link DelayStrategy} to use
     * @return a new {@code Waiter} instance
     */
    public com.oracle.bmc.waiter.Waiter<GetDrgAttachmentRequest, GetDrgAttachmentResponse>
            forDrgAttachment(
                    GetDrgAttachmentRequest request,
                    com.oracle.bmc.core.model.DrgAttachment.LifecycleState targetState,
                    com.oracle.bmc.waiter.TerminationStrategy terminationStrategy,
                    com.oracle.bmc.waiter.DelayStrategy delayStrategy) {
        org.apache.commons.lang3.Validate.notNull(targetState, "The targetState cannot be null");

        return forDrgAttachment(
                com.oracle.bmc.waiter.Waiters.newWaiter(terminationStrategy, delayStrategy),
                request,
                targetState);
    }

    /**
     * Creates a new {@link Waiter} using the provided configuration.
     *
     * @param request the request to send
     * @param terminationStrategy the {@link TerminationStrategy} to use
     * @param delayStrategy the {@link DelayStrategy} to use
     * @param targetStates the desired states to wait for. The waiter will return once the resource reaches any of the provided states
     * @return a new {@code Waiter} instance
     */
    public com.oracle.bmc.waiter.Waiter<GetDrgAttachmentRequest, GetDrgAttachmentResponse>
            forDrgAttachment(
                    GetDrgAttachmentRequest request,
                    com.oracle.bmc.waiter.TerminationStrategy terminationStrategy,
                    com.oracle.bmc.waiter.DelayStrategy delayStrategy,
                    com.oracle.bmc.core.model.DrgAttachment.LifecycleState... targetStates) {
        org.apache.commons.lang3.Validate.notEmpty(
                targetStates, "At least one target state must be provided");
        org.apache.commons.lang3.Validate.noNullElements(
                targetStates, "Null target states are not permitted");

        return forDrgAttachment(
                com.oracle.bmc.waiter.Waiters.newWaiter(terminationStrategy, delayStrategy),
                request,
                targetStates);
    }

    // Helper method to create a new Waiter for DrgAttachment.
    private com.oracle.bmc.waiter.Waiter<GetDrgAttachmentRequest, GetDrgAttachmentResponse>
            forDrgAttachment(
                    com.oracle.bmc.waiter.BmcGenericWaiter waiter,
                    final GetDrgAttachmentRequest request,
                    final com.oracle.bmc.core.model.DrgAttachment.LifecycleState... targetStates) {
        final java.util.Set<com.oracle.bmc.core.model.DrgAttachment.LifecycleState>
                targetStatesSet = new java.util.HashSet<>(java.util.Arrays.asList(targetStates));

        return new com.oracle.bmc.waiter.internal.SimpleWaiterImpl<>(
                executorService,
                waiter.toCallable(
                        com.google.common.base.Suppliers.ofInstance(request),
                        new com.google.common.base.Function<
                                GetDrgAttachmentRequest, GetDrgAttachmentResponse>() {
                            @Override
                            public GetDrgAttachmentResponse apply(GetDrgAttachmentRequest request) {
                                return client.getDrgAttachment(request);
                            }
                        },
                        new com.google.common.base.Predicate<GetDrgAttachmentResponse>() {
                            @Override
                            public boolean apply(GetDrgAttachmentResponse response) {
                                return targetStatesSet.contains(
                                        response.getDrgAttachment().getLifecycleState());
                            }
                        },
                        targetStatesSet.contains(
                                com.oracle.bmc.core.model.DrgAttachment.LifecycleState.Detached)),
                request);
    }

    /**
     * Creates a new {@link Waiter} using default configuration.
     *
     * @param request the request to send
     * @param targetStates the desired states to wait for. If multiple states are provided then the waiter will return once the resource reaches any of the provided states
     * @return a new {@code Waiter} instance
     */
    public com.oracle.bmc.waiter.Waiter<GetIPSecConnectionRequest, GetIPSecConnectionResponse>
            forIPSecConnection(
                    GetIPSecConnectionRequest request,
                    com.oracle.bmc.core.model.IPSecConnection.LifecycleState... targetStates) {
        org.apache.commons.lang3.Validate.notEmpty(
                targetStates, "At least one targetState must be provided");
        org.apache.commons.lang3.Validate.noNullElements(
                targetStates, "Null targetState values are not permitted");

        return forIPSecConnection(
                com.oracle.bmc.waiter.Waiters.DEFAULT_POLLING_WAITER, request, targetStates);
    }

    /**
     * Creates a new {@link Waiter} using the provided configuration.
     *
     * @param request the request to send
     * @param targetState the desired state to wait for
     * @param terminationStrategy the {@link TerminationStrategy} to use
     * @param delayStrategy the {@link DelayStrategy} to use
     * @return a new {@code Waiter} instance
     */
    public com.oracle.bmc.waiter.Waiter<GetIPSecConnectionRequest, GetIPSecConnectionResponse>
            forIPSecConnection(
                    GetIPSecConnectionRequest request,
                    com.oracle.bmc.core.model.IPSecConnection.LifecycleState targetState,
                    com.oracle.bmc.waiter.TerminationStrategy terminationStrategy,
                    com.oracle.bmc.waiter.DelayStrategy delayStrategy) {
        org.apache.commons.lang3.Validate.notNull(targetState, "The targetState cannot be null");

        return forIPSecConnection(
                com.oracle.bmc.waiter.Waiters.newWaiter(terminationStrategy, delayStrategy),
                request,
                targetState);
    }

    /**
     * Creates a new {@link Waiter} using the provided configuration.
     *
     * @param request the request to send
     * @param terminationStrategy the {@link TerminationStrategy} to use
     * @param delayStrategy the {@link DelayStrategy} to use
     * @param targetStates the desired states to wait for. The waiter will return once the resource reaches any of the provided states
     * @return a new {@code Waiter} instance
     */
    public com.oracle.bmc.waiter.Waiter<GetIPSecConnectionRequest, GetIPSecConnectionResponse>
            forIPSecConnection(
                    GetIPSecConnectionRequest request,
                    com.oracle.bmc.waiter.TerminationStrategy terminationStrategy,
                    com.oracle.bmc.waiter.DelayStrategy delayStrategy,
                    com.oracle.bmc.core.model.IPSecConnection.LifecycleState... targetStates) {
        org.apache.commons.lang3.Validate.notEmpty(
                targetStates, "At least one target state must be provided");
        org.apache.commons.lang3.Validate.noNullElements(
                targetStates, "Null target states are not permitted");

        return forIPSecConnection(
                com.oracle.bmc.waiter.Waiters.newWaiter(terminationStrategy, delayStrategy),
                request,
                targetStates);
    }

    // Helper method to create a new Waiter for IPSecConnection.
    private com.oracle.bmc.waiter.Waiter<GetIPSecConnectionRequest, GetIPSecConnectionResponse>
            forIPSecConnection(
                    com.oracle.bmc.waiter.BmcGenericWaiter waiter,
                    final GetIPSecConnectionRequest request,
                    final com.oracle.bmc.core.model.IPSecConnection.LifecycleState...
                            targetStates) {
        final java.util.Set<com.oracle.bmc.core.model.IPSecConnection.LifecycleState>
                targetStatesSet = new java.util.HashSet<>(java.util.Arrays.asList(targetStates));

        return new com.oracle.bmc.waiter.internal.SimpleWaiterImpl<>(
                executorService,
                waiter.toCallable(
                        com.google.common.base.Suppliers.ofInstance(request),
                        new com.google.common.base.Function<
                                GetIPSecConnectionRequest, GetIPSecConnectionResponse>() {
                            @Override
                            public GetIPSecConnectionResponse apply(
                                    GetIPSecConnectionRequest request) {
                                return client.getIPSecConnection(request);
                            }
                        },
                        new com.google.common.base.Predicate<GetIPSecConnectionResponse>() {
                            @Override
                            public boolean apply(GetIPSecConnectionResponse response) {
                                return targetStatesSet.contains(
                                        response.getIPSecConnection().getLifecycleState());
                            }
                        },
                        targetStatesSet.contains(
                                com.oracle.bmc.core.model.IPSecConnection.LifecycleState
                                        .Terminated)),
                request);
    }

    /**
     * Creates a new {@link Waiter} using default configuration.
     *
     * @param request the request to send
     * @param targetStates the desired states to wait for. If multiple states are provided then the waiter will return once the resource reaches any of the provided states
     * @return a new {@code Waiter} instance
     */
    public com.oracle.bmc.waiter.Waiter<GetInternetGatewayRequest, GetInternetGatewayResponse>
            forInternetGateway(
                    GetInternetGatewayRequest request,
                    com.oracle.bmc.core.model.InternetGateway.LifecycleState... targetStates) {
        org.apache.commons.lang3.Validate.notEmpty(
                targetStates, "At least one targetState must be provided");
        org.apache.commons.lang3.Validate.noNullElements(
                targetStates, "Null targetState values are not permitted");

        return forInternetGateway(
                com.oracle.bmc.waiter.Waiters.DEFAULT_POLLING_WAITER, request, targetStates);
    }

    /**
     * Creates a new {@link Waiter} using the provided configuration.
     *
     * @param request the request to send
     * @param targetState the desired state to wait for
     * @param terminationStrategy the {@link TerminationStrategy} to use
     * @param delayStrategy the {@link DelayStrategy} to use
     * @return a new {@code Waiter} instance
     */
    public com.oracle.bmc.waiter.Waiter<GetInternetGatewayRequest, GetInternetGatewayResponse>
            forInternetGateway(
                    GetInternetGatewayRequest request,
                    com.oracle.bmc.core.model.InternetGateway.LifecycleState targetState,
                    com.oracle.bmc.waiter.TerminationStrategy terminationStrategy,
                    com.oracle.bmc.waiter.DelayStrategy delayStrategy) {
        org.apache.commons.lang3.Validate.notNull(targetState, "The targetState cannot be null");

        return forInternetGateway(
                com.oracle.bmc.waiter.Waiters.newWaiter(terminationStrategy, delayStrategy),
                request,
                targetState);
    }

    /**
     * Creates a new {@link Waiter} using the provided configuration.
     *
     * @param request the request to send
     * @param terminationStrategy the {@link TerminationStrategy} to use
     * @param delayStrategy the {@link DelayStrategy} to use
     * @param targetStates the desired states to wait for. The waiter will return once the resource reaches any of the provided states
     * @return a new {@code Waiter} instance
     */
    public com.oracle.bmc.waiter.Waiter<GetInternetGatewayRequest, GetInternetGatewayResponse>
            forInternetGateway(
                    GetInternetGatewayRequest request,
                    com.oracle.bmc.waiter.TerminationStrategy terminationStrategy,
                    com.oracle.bmc.waiter.DelayStrategy delayStrategy,
                    com.oracle.bmc.core.model.InternetGateway.LifecycleState... targetStates) {
        org.apache.commons.lang3.Validate.notEmpty(
                targetStates, "At least one target state must be provided");
        org.apache.commons.lang3.Validate.noNullElements(
                targetStates, "Null target states are not permitted");

        return forInternetGateway(
                com.oracle.bmc.waiter.Waiters.newWaiter(terminationStrategy, delayStrategy),
                request,
                targetStates);
    }

    // Helper method to create a new Waiter for InternetGateway.
    private com.oracle.bmc.waiter.Waiter<GetInternetGatewayRequest, GetInternetGatewayResponse>
            forInternetGateway(
                    com.oracle.bmc.waiter.BmcGenericWaiter waiter,
                    final GetInternetGatewayRequest request,
                    final com.oracle.bmc.core.model.InternetGateway.LifecycleState...
                            targetStates) {
        final java.util.Set<com.oracle.bmc.core.model.InternetGateway.LifecycleState>
                targetStatesSet = new java.util.HashSet<>(java.util.Arrays.asList(targetStates));

        return new com.oracle.bmc.waiter.internal.SimpleWaiterImpl<>(
                executorService,
                waiter.toCallable(
                        com.google.common.base.Suppliers.ofInstance(request),
                        new com.google.common.base.Function<
                                GetInternetGatewayRequest, GetInternetGatewayResponse>() {
                            @Override
                            public GetInternetGatewayResponse apply(
                                    GetInternetGatewayRequest request) {
                                return client.getInternetGateway(request);
                            }
                        },
                        new com.google.common.base.Predicate<GetInternetGatewayResponse>() {
                            @Override
                            public boolean apply(GetInternetGatewayResponse response) {
                                return targetStatesSet.contains(
                                        response.getInternetGateway().getLifecycleState());
                            }
                        },
                        targetStatesSet.contains(
                                com.oracle.bmc.core.model.InternetGateway.LifecycleState
                                        .Terminated)),
                request);
    }

    /**
     * Creates a new {@link Waiter} using default configuration.
     *
     * @param request the request to send
     * @param targetStates the desired states to wait for. If multiple states are provided then the waiter will return once the resource reaches any of the provided states
     * @return a new {@code Waiter} instance
     */
    public com.oracle.bmc.waiter.Waiter<
                    GetLocalPeeringGatewayRequest, GetLocalPeeringGatewayResponse>
            forLocalPeeringGateway(
                    GetLocalPeeringGatewayRequest request,
                    com.oracle.bmc.core.model.LocalPeeringGateway.LifecycleState... targetStates) {
        org.apache.commons.lang3.Validate.notEmpty(
                targetStates, "At least one targetState must be provided");
        org.apache.commons.lang3.Validate.noNullElements(
                targetStates, "Null targetState values are not permitted");

        return forLocalPeeringGateway(
                com.oracle.bmc.waiter.Waiters.DEFAULT_POLLING_WAITER, request, targetStates);
    }

    /**
     * Creates a new {@link Waiter} using the provided configuration.
     *
     * @param request the request to send
     * @param targetState the desired state to wait for
     * @param terminationStrategy the {@link TerminationStrategy} to use
     * @param delayStrategy the {@link DelayStrategy} to use
     * @return a new {@code Waiter} instance
     */
    public com.oracle.bmc.waiter.Waiter<
                    GetLocalPeeringGatewayRequest, GetLocalPeeringGatewayResponse>
            forLocalPeeringGateway(
                    GetLocalPeeringGatewayRequest request,
                    com.oracle.bmc.core.model.LocalPeeringGateway.LifecycleState targetState,
                    com.oracle.bmc.waiter.TerminationStrategy terminationStrategy,
                    com.oracle.bmc.waiter.DelayStrategy delayStrategy) {
        org.apache.commons.lang3.Validate.notNull(targetState, "The targetState cannot be null");

        return forLocalPeeringGateway(
                com.oracle.bmc.waiter.Waiters.newWaiter(terminationStrategy, delayStrategy),
                request,
                targetState);
    }

    /**
     * Creates a new {@link Waiter} using the provided configuration.
     *
     * @param request the request to send
     * @param terminationStrategy the {@link TerminationStrategy} to use
     * @param delayStrategy the {@link DelayStrategy} to use
     * @param targetStates the desired states to wait for. The waiter will return once the resource reaches any of the provided states
     * @return a new {@code Waiter} instance
     */
    public com.oracle.bmc.waiter.Waiter<
                    GetLocalPeeringGatewayRequest, GetLocalPeeringGatewayResponse>
            forLocalPeeringGateway(
                    GetLocalPeeringGatewayRequest request,
                    com.oracle.bmc.waiter.TerminationStrategy terminationStrategy,
                    com.oracle.bmc.waiter.DelayStrategy delayStrategy,
                    com.oracle.bmc.core.model.LocalPeeringGateway.LifecycleState... targetStates) {
        org.apache.commons.lang3.Validate.notEmpty(
                targetStates, "At least one target state must be provided");
        org.apache.commons.lang3.Validate.noNullElements(
                targetStates, "Null target states are not permitted");

        return forLocalPeeringGateway(
                com.oracle.bmc.waiter.Waiters.newWaiter(terminationStrategy, delayStrategy),
                request,
                targetStates);
    }

    // Helper method to create a new Waiter for LocalPeeringGateway.
    private com.oracle.bmc.waiter.Waiter<
                    GetLocalPeeringGatewayRequest, GetLocalPeeringGatewayResponse>
            forLocalPeeringGateway(
                    com.oracle.bmc.waiter.BmcGenericWaiter waiter,
                    final GetLocalPeeringGatewayRequest request,
                    final com.oracle.bmc.core.model.LocalPeeringGateway.LifecycleState...
                            targetStates) {
        final java.util.Set<com.oracle.bmc.core.model.LocalPeeringGateway.LifecycleState>
                targetStatesSet = new java.util.HashSet<>(java.util.Arrays.asList(targetStates));

        return new com.oracle.bmc.waiter.internal.SimpleWaiterImpl<>(
                executorService,
                waiter.toCallable(
                        com.google.common.base.Suppliers.ofInstance(request),
                        new com.google.common.base.Function<
                                GetLocalPeeringGatewayRequest, GetLocalPeeringGatewayResponse>() {
                            @Override
                            public GetLocalPeeringGatewayResponse apply(
                                    GetLocalPeeringGatewayRequest request) {
                                return client.getLocalPeeringGateway(request);
                            }
                        },
                        new com.google.common.base.Predicate<GetLocalPeeringGatewayResponse>() {
                            @Override
                            public boolean apply(GetLocalPeeringGatewayResponse response) {
                                return targetStatesSet.contains(
                                        response.getLocalPeeringGateway().getLifecycleState());
                            }
                        },
                        targetStatesSet.contains(
                                com.oracle.bmc.core.model.LocalPeeringGateway.LifecycleState
                                        .Terminated)),
                request);
    }

    /**
     * Creates a new {@link Waiter} using default configuration.
     *
     * @param request the request to send
     * @param targetStates the desired states to wait for. If multiple states are provided then the waiter will return once the resource reaches any of the provided states
     * @return a new {@code Waiter} instance
     */
    public com.oracle.bmc.waiter.Waiter<
                    GetLocalPeeringGatewayRequest, GetLocalPeeringGatewayResponse>
            forLocalPeeringGateway(
                    GetLocalPeeringGatewayRequest request,
                    com.oracle.bmc.core.model.LocalPeeringGateway.PeeringStatus... targetStates) {
        org.apache.commons.lang3.Validate.notEmpty(
                targetStates, "At least one targetState must be provided");
        org.apache.commons.lang3.Validate.noNullElements(
                targetStates, "Null targetState values are not permitted");

        return forLocalPeeringGateway(
                com.oracle.bmc.waiter.Waiters.DEFAULT_POLLING_WAITER, request, targetStates);
    }

    /**
     * Creates a new {@link Waiter} using the provided configuration.
     *
     * @param request the request to send
     * @param targetState the desired state to wait for
     * @param terminationStrategy the {@link TerminationStrategy} to use
     * @param delayStrategy the {@link DelayStrategy} to use
     * @return a new {@code Waiter} instance
     */
    public com.oracle.bmc.waiter.Waiter<
                    GetLocalPeeringGatewayRequest, GetLocalPeeringGatewayResponse>
            forLocalPeeringGateway(
                    GetLocalPeeringGatewayRequest request,
                    com.oracle.bmc.core.model.LocalPeeringGateway.PeeringStatus targetState,
                    com.oracle.bmc.waiter.TerminationStrategy terminationStrategy,
                    com.oracle.bmc.waiter.DelayStrategy delayStrategy) {
        org.apache.commons.lang3.Validate.notNull(targetState, "The targetState cannot be null");

        return forLocalPeeringGateway(
                com.oracle.bmc.waiter.Waiters.newWaiter(terminationStrategy, delayStrategy),
                request,
                targetState);
    }

    /**
     * Creates a new {@link Waiter} using the provided configuration.
     *
     * @param request the request to send
     * @param terminationStrategy the {@link TerminationStrategy} to use
     * @param delayStrategy the {@link DelayStrategy} to use
     * @param targetStates the desired states to wait for. The waiter will return once the resource reaches any of the provided states
     * @return a new {@code Waiter} instance
     */
    public com.oracle.bmc.waiter.Waiter<
                    GetLocalPeeringGatewayRequest, GetLocalPeeringGatewayResponse>
            forLocalPeeringGateway(
                    GetLocalPeeringGatewayRequest request,
                    com.oracle.bmc.waiter.TerminationStrategy terminationStrategy,
                    com.oracle.bmc.waiter.DelayStrategy delayStrategy,
                    com.oracle.bmc.core.model.LocalPeeringGateway.PeeringStatus... targetStates) {
        org.apache.commons.lang3.Validate.notEmpty(
                targetStates, "At least one target state must be provided");
        org.apache.commons.lang3.Validate.noNullElements(
                targetStates, "Null target states are not permitted");

        return forLocalPeeringGateway(
                com.oracle.bmc.waiter.Waiters.newWaiter(terminationStrategy, delayStrategy),
                request,
                targetStates);
    }

    // Helper method to create a new Waiter for LocalPeeringGateway.
    private com.oracle.bmc.waiter.Waiter<
                    GetLocalPeeringGatewayRequest, GetLocalPeeringGatewayResponse>
            forLocalPeeringGateway(
                    com.oracle.bmc.waiter.BmcGenericWaiter waiter,
                    final GetLocalPeeringGatewayRequest request,
                    final com.oracle.bmc.core.model.LocalPeeringGateway.PeeringStatus...
                            targetStates) {
        final java.util.Set<com.oracle.bmc.core.model.LocalPeeringGateway.PeeringStatus>
                targetStatesSet = new java.util.HashSet<>(java.util.Arrays.asList(targetStates));

        return new com.oracle.bmc.waiter.internal.SimpleWaiterImpl<>(
                executorService,
                waiter.toCallable(
                        com.google.common.base.Suppliers.ofInstance(request),
                        new com.google.common.base.Function<
                                GetLocalPeeringGatewayRequest, GetLocalPeeringGatewayResponse>() {
                            @Override
                            public GetLocalPeeringGatewayResponse apply(
                                    GetLocalPeeringGatewayRequest request) {
                                return client.getLocalPeeringGateway(request);
                            }
                        },
                        new com.google.common.base.Predicate<GetLocalPeeringGatewayResponse>() {
                            @Override
                            public boolean apply(GetLocalPeeringGatewayResponse response) {
                                return targetStatesSet.contains(
                                        response.getLocalPeeringGateway().getPeeringStatus());
                            }
                        },
                        targetStatesSet.contains(
                                com.oracle.bmc.core.model.LocalPeeringGateway.PeeringStatus
                                        .Revoked)),
                request);
    }

    /**
     * Creates a new {@link Waiter} using default configuration.
     *
     * @param request the request to send
     * @param targetStates the desired states to wait for. If multiple states are provided then the waiter will return once the resource reaches any of the provided states
     * @return a new {@code Waiter} instance
     */
    public com.oracle.bmc.waiter.Waiter<GetNatGatewayRequest, GetNatGatewayResponse> forNatGateway(
            GetNatGatewayRequest request,
            com.oracle.bmc.core.model.NatGateway.LifecycleState... targetStates) {
        org.apache.commons.lang3.Validate.notEmpty(
                targetStates, "At least one targetState must be provided");
        org.apache.commons.lang3.Validate.noNullElements(
                targetStates, "Null targetState values are not permitted");

        return forNatGateway(
                com.oracle.bmc.waiter.Waiters.DEFAULT_POLLING_WAITER, request, targetStates);
    }

    /**
     * Creates a new {@link Waiter} using the provided configuration.
     *
     * @param request the request to send
     * @param targetState the desired state to wait for
     * @param terminationStrategy the {@link TerminationStrategy} to use
     * @param delayStrategy the {@link DelayStrategy} to use
     * @return a new {@code Waiter} instance
     */
    public com.oracle.bmc.waiter.Waiter<GetNatGatewayRequest, GetNatGatewayResponse> forNatGateway(
            GetNatGatewayRequest request,
            com.oracle.bmc.core.model.NatGateway.LifecycleState targetState,
            com.oracle.bmc.waiter.TerminationStrategy terminationStrategy,
            com.oracle.bmc.waiter.DelayStrategy delayStrategy) {
        org.apache.commons.lang3.Validate.notNull(targetState, "The targetState cannot be null");

        return forNatGateway(
                com.oracle.bmc.waiter.Waiters.newWaiter(terminationStrategy, delayStrategy),
                request,
                targetState);
    }

    /**
     * Creates a new {@link Waiter} using the provided configuration.
     *
     * @param request the request to send
     * @param terminationStrategy the {@link TerminationStrategy} to use
     * @param delayStrategy the {@link DelayStrategy} to use
     * @param targetStates the desired states to wait for. The waiter will return once the resource reaches any of the provided states
     * @return a new {@code Waiter} instance
     */
    public com.oracle.bmc.waiter.Waiter<GetNatGatewayRequest, GetNatGatewayResponse> forNatGateway(
            GetNatGatewayRequest request,
            com.oracle.bmc.waiter.TerminationStrategy terminationStrategy,
            com.oracle.bmc.waiter.DelayStrategy delayStrategy,
            com.oracle.bmc.core.model.NatGateway.LifecycleState... targetStates) {
        org.apache.commons.lang3.Validate.notEmpty(
                targetStates, "At least one target state must be provided");
        org.apache.commons.lang3.Validate.noNullElements(
                targetStates, "Null target states are not permitted");

        return forNatGateway(
                com.oracle.bmc.waiter.Waiters.newWaiter(terminationStrategy, delayStrategy),
                request,
                targetStates);
    }

    // Helper method to create a new Waiter for NatGateway.
    private com.oracle.bmc.waiter.Waiter<GetNatGatewayRequest, GetNatGatewayResponse> forNatGateway(
            com.oracle.bmc.waiter.BmcGenericWaiter waiter,
            final GetNatGatewayRequest request,
            final com.oracle.bmc.core.model.NatGateway.LifecycleState... targetStates) {
        final java.util.Set<com.oracle.bmc.core.model.NatGateway.LifecycleState> targetStatesSet =
                new java.util.HashSet<>(java.util.Arrays.asList(targetStates));

        return new com.oracle.bmc.waiter.internal.SimpleWaiterImpl<>(
                executorService,
                waiter.toCallable(
                        com.google.common.base.Suppliers.ofInstance(request),
                        new com.google.common.base.Function<
                                GetNatGatewayRequest, GetNatGatewayResponse>() {
                            @Override
                            public GetNatGatewayResponse apply(GetNatGatewayRequest request) {
                                return client.getNatGateway(request);
                            }
                        },
                        new com.google.common.base.Predicate<GetNatGatewayResponse>() {
                            @Override
                            public boolean apply(GetNatGatewayResponse response) {
                                return targetStatesSet.contains(
                                        response.getNatGateway().getLifecycleState());
                            }
                        },
                        targetStatesSet.contains(
                                com.oracle.bmc.core.model.NatGateway.LifecycleState.Terminated)),
                request);
    }

    /**
     * Creates a new {@link Waiter} using default configuration.
     *
     * @param request the request to send
     * @param targetStates the desired states to wait for. If multiple states are provided then the waiter will return once the resource reaches any of the provided states
     * @return a new {@code Waiter} instance
     */
    public com.oracle.bmc.waiter.Waiter<GetPublicIpRequest, GetPublicIpResponse> forPublicIp(
            GetPublicIpRequest request,
            com.oracle.bmc.core.model.PublicIp.LifecycleState... targetStates) {
        org.apache.commons.lang3.Validate.notEmpty(
                targetStates, "At least one targetState must be provided");
        org.apache.commons.lang3.Validate.noNullElements(
                targetStates, "Null targetState values are not permitted");

        return forPublicIp(
                com.oracle.bmc.waiter.Waiters.DEFAULT_POLLING_WAITER, request, targetStates);
    }

    /**
     * Creates a new {@link Waiter} using the provided configuration.
     *
     * @param request the request to send
     * @param targetState the desired state to wait for
     * @param terminationStrategy the {@link TerminationStrategy} to use
     * @param delayStrategy the {@link DelayStrategy} to use
     * @return a new {@code Waiter} instance
     */
    public com.oracle.bmc.waiter.Waiter<GetPublicIpRequest, GetPublicIpResponse> forPublicIp(
            GetPublicIpRequest request,
            com.oracle.bmc.core.model.PublicIp.LifecycleState targetState,
            com.oracle.bmc.waiter.TerminationStrategy terminationStrategy,
            com.oracle.bmc.waiter.DelayStrategy delayStrategy) {
        org.apache.commons.lang3.Validate.notNull(targetState, "The targetState cannot be null");

        return forPublicIp(
                com.oracle.bmc.waiter.Waiters.newWaiter(terminationStrategy, delayStrategy),
                request,
                targetState);
    }

    /**
     * Creates a new {@link Waiter} using the provided configuration.
     *
     * @param request the request to send
     * @param terminationStrategy the {@link TerminationStrategy} to use
     * @param delayStrategy the {@link DelayStrategy} to use
     * @param targetStates the desired states to wait for. The waiter will return once the resource reaches any of the provided states
     * @return a new {@code Waiter} instance
     */
    public com.oracle.bmc.waiter.Waiter<GetPublicIpRequest, GetPublicIpResponse> forPublicIp(
            GetPublicIpRequest request,
            com.oracle.bmc.waiter.TerminationStrategy terminationStrategy,
            com.oracle.bmc.waiter.DelayStrategy delayStrategy,
            com.oracle.bmc.core.model.PublicIp.LifecycleState... targetStates) {
        org.apache.commons.lang3.Validate.notEmpty(
                targetStates, "At least one target state must be provided");
        org.apache.commons.lang3.Validate.noNullElements(
                targetStates, "Null target states are not permitted");

        return forPublicIp(
                com.oracle.bmc.waiter.Waiters.newWaiter(terminationStrategy, delayStrategy),
                request,
                targetStates);
    }

    // Helper method to create a new Waiter for PublicIp.
    private com.oracle.bmc.waiter.Waiter<GetPublicIpRequest, GetPublicIpResponse> forPublicIp(
            com.oracle.bmc.waiter.BmcGenericWaiter waiter,
            final GetPublicIpRequest request,
            final com.oracle.bmc.core.model.PublicIp.LifecycleState... targetStates) {
        final java.util.Set<com.oracle.bmc.core.model.PublicIp.LifecycleState> targetStatesSet =
                new java.util.HashSet<>(java.util.Arrays.asList(targetStates));

        return new com.oracle.bmc.waiter.internal.SimpleWaiterImpl<>(
                executorService,
                waiter.toCallable(
                        com.google.common.base.Suppliers.ofInstance(request),
                        new com.google.common.base.Function<
                                GetPublicIpRequest, GetPublicIpResponse>() {
                            @Override
                            public GetPublicIpResponse apply(GetPublicIpRequest request) {
                                return client.getPublicIp(request);
                            }
                        },
                        new com.google.common.base.Predicate<GetPublicIpResponse>() {
                            @Override
                            public boolean apply(GetPublicIpResponse response) {
                                return targetStatesSet.contains(
                                        response.getPublicIp().getLifecycleState());
                            }
                        },
                        targetStatesSet.contains(
                                com.oracle.bmc.core.model.PublicIp.LifecycleState.Terminated)),
                request);
    }

    /**
     * Creates a new {@link Waiter} using default configuration.
     *
     * @param request the request to send
     * @param targetStates the desired states to wait for. If multiple states are provided then the waiter will return once the resource reaches any of the provided states
     * @return a new {@code Waiter} instance
     */
    public com.oracle.bmc.waiter.Waiter<
                    GetRemotePeeringConnectionRequest, GetRemotePeeringConnectionResponse>
            forRemotePeeringConnection(
                    GetRemotePeeringConnectionRequest request,
                    com.oracle.bmc.core.model.RemotePeeringConnection.PeeringStatus...
                            targetStates) {
        org.apache.commons.lang3.Validate.notEmpty(
                targetStates, "At least one targetState must be provided");
        org.apache.commons.lang3.Validate.noNullElements(
                targetStates, "Null targetState values are not permitted");

        return forRemotePeeringConnection(
                com.oracle.bmc.waiter.Waiters.DEFAULT_POLLING_WAITER, request, targetStates);
    }

    /**
     * Creates a new {@link Waiter} using the provided configuration.
     *
     * @param request the request to send
     * @param targetState the desired state to wait for
     * @param terminationStrategy the {@link TerminationStrategy} to use
     * @param delayStrategy the {@link DelayStrategy} to use
     * @return a new {@code Waiter} instance
     */
    public com.oracle.bmc.waiter.Waiter<
                    GetRemotePeeringConnectionRequest, GetRemotePeeringConnectionResponse>
            forRemotePeeringConnection(
                    GetRemotePeeringConnectionRequest request,
                    com.oracle.bmc.core.model.RemotePeeringConnection.PeeringStatus targetState,
                    com.oracle.bmc.waiter.TerminationStrategy terminationStrategy,
                    com.oracle.bmc.waiter.DelayStrategy delayStrategy) {
        org.apache.commons.lang3.Validate.notNull(targetState, "The targetState cannot be null");

        return forRemotePeeringConnection(
                com.oracle.bmc.waiter.Waiters.newWaiter(terminationStrategy, delayStrategy),
                request,
                targetState);
    }

    /**
     * Creates a new {@link Waiter} using the provided configuration.
     *
     * @param request the request to send
     * @param terminationStrategy the {@link TerminationStrategy} to use
     * @param delayStrategy the {@link DelayStrategy} to use
     * @param targetStates the desired states to wait for. The waiter will return once the resource reaches any of the provided states
     * @return a new {@code Waiter} instance
     */
    public com.oracle.bmc.waiter.Waiter<
                    GetRemotePeeringConnectionRequest, GetRemotePeeringConnectionResponse>
            forRemotePeeringConnection(
                    GetRemotePeeringConnectionRequest request,
                    com.oracle.bmc.waiter.TerminationStrategy terminationStrategy,
                    com.oracle.bmc.waiter.DelayStrategy delayStrategy,
                    com.oracle.bmc.core.model.RemotePeeringConnection.PeeringStatus...
                            targetStates) {
        org.apache.commons.lang3.Validate.notEmpty(
                targetStates, "At least one target state must be provided");
        org.apache.commons.lang3.Validate.noNullElements(
                targetStates, "Null target states are not permitted");

        return forRemotePeeringConnection(
                com.oracle.bmc.waiter.Waiters.newWaiter(terminationStrategy, delayStrategy),
                request,
                targetStates);
    }

    // Helper method to create a new Waiter for RemotePeeringConnection.
    private com.oracle.bmc.waiter.Waiter<
                    GetRemotePeeringConnectionRequest, GetRemotePeeringConnectionResponse>
            forRemotePeeringConnection(
                    com.oracle.bmc.waiter.BmcGenericWaiter waiter,
                    final GetRemotePeeringConnectionRequest request,
                    final com.oracle.bmc.core.model.RemotePeeringConnection.PeeringStatus...
                            targetStates) {
        final java.util.Set<com.oracle.bmc.core.model.RemotePeeringConnection.PeeringStatus>
                targetStatesSet = new java.util.HashSet<>(java.util.Arrays.asList(targetStates));

        return new com.oracle.bmc.waiter.internal.SimpleWaiterImpl<>(
                executorService,
                waiter.toCallable(
                        com.google.common.base.Suppliers.ofInstance(request),
                        new com.google.common.base.Function<
                                GetRemotePeeringConnectionRequest,
                                GetRemotePeeringConnectionResponse>() {
                            @Override
                            public GetRemotePeeringConnectionResponse apply(
                                    GetRemotePeeringConnectionRequest request) {
                                return client.getRemotePeeringConnection(request);
                            }
                        },
                        new com.google.common.base.Predicate<GetRemotePeeringConnectionResponse>() {
                            @Override
                            public boolean apply(GetRemotePeeringConnectionResponse response) {
                                return targetStatesSet.contains(
                                        response.getRemotePeeringConnection().getPeeringStatus());
                            }
                        },
                        targetStatesSet.contains(
                                com.oracle.bmc.core.model.RemotePeeringConnection.PeeringStatus
                                        .Revoked)),
                request);
    }

    /**
     * Creates a new {@link Waiter} using default configuration.
     *
     * @param request the request to send
     * @param targetStates the desired states to wait for. If multiple states are provided then the waiter will return once the resource reaches any of the provided states
     * @return a new {@code Waiter} instance
     */
    public com.oracle.bmc.waiter.Waiter<
                    GetRemotePeeringConnectionRequest, GetRemotePeeringConnectionResponse>
            forRemotePeeringConnection(
                    GetRemotePeeringConnectionRequest request,
                    com.oracle.bmc.core.model.RemotePeeringConnection.LifecycleState...
                            targetStates) {
        org.apache.commons.lang3.Validate.notEmpty(
                targetStates, "At least one targetState must be provided");
        org.apache.commons.lang3.Validate.noNullElements(
                targetStates, "Null targetState values are not permitted");

        return forRemotePeeringConnection(
                com.oracle.bmc.waiter.Waiters.DEFAULT_POLLING_WAITER, request, targetStates);
    }

    /**
     * Creates a new {@link Waiter} using the provided configuration.
     *
     * @param request the request to send
     * @param targetState the desired state to wait for
     * @param terminationStrategy the {@link TerminationStrategy} to use
     * @param delayStrategy the {@link DelayStrategy} to use
     * @return a new {@code Waiter} instance
     */
    public com.oracle.bmc.waiter.Waiter<
                    GetRemotePeeringConnectionRequest, GetRemotePeeringConnectionResponse>
            forRemotePeeringConnection(
                    GetRemotePeeringConnectionRequest request,
                    com.oracle.bmc.core.model.RemotePeeringConnection.LifecycleState targetState,
                    com.oracle.bmc.waiter.TerminationStrategy terminationStrategy,
                    com.oracle.bmc.waiter.DelayStrategy delayStrategy) {
        org.apache.commons.lang3.Validate.notNull(targetState, "The targetState cannot be null");

        return forRemotePeeringConnection(
                com.oracle.bmc.waiter.Waiters.newWaiter(terminationStrategy, delayStrategy),
                request,
                targetState);
    }

    /**
     * Creates a new {@link Waiter} using the provided configuration.
     *
     * @param request the request to send
     * @param terminationStrategy the {@link TerminationStrategy} to use
     * @param delayStrategy the {@link DelayStrategy} to use
     * @param targetStates the desired states to wait for. The waiter will return once the resource reaches any of the provided states
     * @return a new {@code Waiter} instance
     */
    public com.oracle.bmc.waiter.Waiter<
                    GetRemotePeeringConnectionRequest, GetRemotePeeringConnectionResponse>
            forRemotePeeringConnection(
                    GetRemotePeeringConnectionRequest request,
                    com.oracle.bmc.waiter.TerminationStrategy terminationStrategy,
                    com.oracle.bmc.waiter.DelayStrategy delayStrategy,
                    com.oracle.bmc.core.model.RemotePeeringConnection.LifecycleState...
                            targetStates) {
        org.apache.commons.lang3.Validate.notEmpty(
                targetStates, "At least one target state must be provided");
        org.apache.commons.lang3.Validate.noNullElements(
                targetStates, "Null target states are not permitted");

        return forRemotePeeringConnection(
                com.oracle.bmc.waiter.Waiters.newWaiter(terminationStrategy, delayStrategy),
                request,
                targetStates);
    }

    // Helper method to create a new Waiter for RemotePeeringConnection.
    private com.oracle.bmc.waiter.Waiter<
                    GetRemotePeeringConnectionRequest, GetRemotePeeringConnectionResponse>
            forRemotePeeringConnection(
                    com.oracle.bmc.waiter.BmcGenericWaiter waiter,
                    final GetRemotePeeringConnectionRequest request,
                    final com.oracle.bmc.core.model.RemotePeeringConnection.LifecycleState...
                            targetStates) {
        final java.util.Set<com.oracle.bmc.core.model.RemotePeeringConnection.LifecycleState>
                targetStatesSet = new java.util.HashSet<>(java.util.Arrays.asList(targetStates));

        return new com.oracle.bmc.waiter.internal.SimpleWaiterImpl<>(
                executorService,
                waiter.toCallable(
                        com.google.common.base.Suppliers.ofInstance(request),
                        new com.google.common.base.Function<
                                GetRemotePeeringConnectionRequest,
                                GetRemotePeeringConnectionResponse>() {
                            @Override
                            public GetRemotePeeringConnectionResponse apply(
                                    GetRemotePeeringConnectionRequest request) {
                                return client.getRemotePeeringConnection(request);
                            }
                        },
                        new com.google.common.base.Predicate<GetRemotePeeringConnectionResponse>() {
                            @Override
                            public boolean apply(GetRemotePeeringConnectionResponse response) {
                                return targetStatesSet.contains(
                                        response.getRemotePeeringConnection().getLifecycleState());
                            }
                        },
                        targetStatesSet.contains(
                                com.oracle.bmc.core.model.RemotePeeringConnection.LifecycleState
                                        .Terminated)),
                request);
    }

    /**
     * Creates a new {@link Waiter} using default configuration.
     *
     * @param request the request to send
     * @param targetStates the desired states to wait for. If multiple states are provided then the waiter will return once the resource reaches any of the provided states
     * @return a new {@code Waiter} instance
     */
    public com.oracle.bmc.waiter.Waiter<GetRouteTableRequest, GetRouteTableResponse> forRouteTable(
            GetRouteTableRequest request,
            com.oracle.bmc.core.model.RouteTable.LifecycleState... targetStates) {
        org.apache.commons.lang3.Validate.notEmpty(
                targetStates, "At least one targetState must be provided");
        org.apache.commons.lang3.Validate.noNullElements(
                targetStates, "Null targetState values are not permitted");

        return forRouteTable(
                com.oracle.bmc.waiter.Waiters.DEFAULT_POLLING_WAITER, request, targetStates);
    }

    /**
     * Creates a new {@link Waiter} using the provided configuration.
     *
     * @param request the request to send
     * @param targetState the desired state to wait for
     * @param terminationStrategy the {@link TerminationStrategy} to use
     * @param delayStrategy the {@link DelayStrategy} to use
     * @return a new {@code Waiter} instance
     */
    public com.oracle.bmc.waiter.Waiter<GetRouteTableRequest, GetRouteTableResponse> forRouteTable(
            GetRouteTableRequest request,
            com.oracle.bmc.core.model.RouteTable.LifecycleState targetState,
            com.oracle.bmc.waiter.TerminationStrategy terminationStrategy,
            com.oracle.bmc.waiter.DelayStrategy delayStrategy) {
        org.apache.commons.lang3.Validate.notNull(targetState, "The targetState cannot be null");

        return forRouteTable(
                com.oracle.bmc.waiter.Waiters.newWaiter(terminationStrategy, delayStrategy),
                request,
                targetState);
    }

    /**
     * Creates a new {@link Waiter} using the provided configuration.
     *
     * @param request the request to send
     * @param terminationStrategy the {@link TerminationStrategy} to use
     * @param delayStrategy the {@link DelayStrategy} to use
     * @param targetStates the desired states to wait for. The waiter will return once the resource reaches any of the provided states
     * @return a new {@code Waiter} instance
     */
    public com.oracle.bmc.waiter.Waiter<GetRouteTableRequest, GetRouteTableResponse> forRouteTable(
            GetRouteTableRequest request,
            com.oracle.bmc.waiter.TerminationStrategy terminationStrategy,
            com.oracle.bmc.waiter.DelayStrategy delayStrategy,
            com.oracle.bmc.core.model.RouteTable.LifecycleState... targetStates) {
        org.apache.commons.lang3.Validate.notEmpty(
                targetStates, "At least one target state must be provided");
        org.apache.commons.lang3.Validate.noNullElements(
                targetStates, "Null target states are not permitted");

        return forRouteTable(
                com.oracle.bmc.waiter.Waiters.newWaiter(terminationStrategy, delayStrategy),
                request,
                targetStates);
    }

    // Helper method to create a new Waiter for RouteTable.
    private com.oracle.bmc.waiter.Waiter<GetRouteTableRequest, GetRouteTableResponse> forRouteTable(
            com.oracle.bmc.waiter.BmcGenericWaiter waiter,
            final GetRouteTableRequest request,
            final com.oracle.bmc.core.model.RouteTable.LifecycleState... targetStates) {
        final java.util.Set<com.oracle.bmc.core.model.RouteTable.LifecycleState> targetStatesSet =
                new java.util.HashSet<>(java.util.Arrays.asList(targetStates));

        return new com.oracle.bmc.waiter.internal.SimpleWaiterImpl<>(
                executorService,
                waiter.toCallable(
                        com.google.common.base.Suppliers.ofInstance(request),
                        new com.google.common.base.Function<
                                GetRouteTableRequest, GetRouteTableResponse>() {
                            @Override
                            public GetRouteTableResponse apply(GetRouteTableRequest request) {
                                return client.getRouteTable(request);
                            }
                        },
                        new com.google.common.base.Predicate<GetRouteTableResponse>() {
                            @Override
                            public boolean apply(GetRouteTableResponse response) {
                                return targetStatesSet.contains(
                                        response.getRouteTable().getLifecycleState());
                            }
                        },
                        targetStatesSet.contains(
                                com.oracle.bmc.core.model.RouteTable.LifecycleState.Terminated)),
                request);
    }

    /**
     * Creates a new {@link Waiter} using default configuration.
     *
     * @param request the request to send
     * @param targetStates the desired states to wait for. If multiple states are provided then the waiter will return once the resource reaches any of the provided states
     * @return a new {@code Waiter} instance
     */
    public com.oracle.bmc.waiter.Waiter<GetSecurityListRequest, GetSecurityListResponse>
            forSecurityList(
                    GetSecurityListRequest request,
                    com.oracle.bmc.core.model.SecurityList.LifecycleState... targetStates) {
        org.apache.commons.lang3.Validate.notEmpty(
                targetStates, "At least one targetState must be provided");
        org.apache.commons.lang3.Validate.noNullElements(
                targetStates, "Null targetState values are not permitted");

        return forSecurityList(
                com.oracle.bmc.waiter.Waiters.DEFAULT_POLLING_WAITER, request, targetStates);
    }

    /**
     * Creates a new {@link Waiter} using the provided configuration.
     *
     * @param request the request to send
     * @param targetState the desired state to wait for
     * @param terminationStrategy the {@link TerminationStrategy} to use
     * @param delayStrategy the {@link DelayStrategy} to use
     * @return a new {@code Waiter} instance
     */
    public com.oracle.bmc.waiter.Waiter<GetSecurityListRequest, GetSecurityListResponse>
            forSecurityList(
                    GetSecurityListRequest request,
                    com.oracle.bmc.core.model.SecurityList.LifecycleState targetState,
                    com.oracle.bmc.waiter.TerminationStrategy terminationStrategy,
                    com.oracle.bmc.waiter.DelayStrategy delayStrategy) {
        org.apache.commons.lang3.Validate.notNull(targetState, "The targetState cannot be null");

        return forSecurityList(
                com.oracle.bmc.waiter.Waiters.newWaiter(terminationStrategy, delayStrategy),
                request,
                targetState);
    }

    /**
     * Creates a new {@link Waiter} using the provided configuration.
     *
     * @param request the request to send
     * @param terminationStrategy the {@link TerminationStrategy} to use
     * @param delayStrategy the {@link DelayStrategy} to use
     * @param targetStates the desired states to wait for. The waiter will return once the resource reaches any of the provided states
     * @return a new {@code Waiter} instance
     */
    public com.oracle.bmc.waiter.Waiter<GetSecurityListRequest, GetSecurityListResponse>
            forSecurityList(
                    GetSecurityListRequest request,
                    com.oracle.bmc.waiter.TerminationStrategy terminationStrategy,
                    com.oracle.bmc.waiter.DelayStrategy delayStrategy,
                    com.oracle.bmc.core.model.SecurityList.LifecycleState... targetStates) {
        org.apache.commons.lang3.Validate.notEmpty(
                targetStates, "At least one target state must be provided");
        org.apache.commons.lang3.Validate.noNullElements(
                targetStates, "Null target states are not permitted");

        return forSecurityList(
                com.oracle.bmc.waiter.Waiters.newWaiter(terminationStrategy, delayStrategy),
                request,
                targetStates);
    }

    // Helper method to create a new Waiter for SecurityList.
    private com.oracle.bmc.waiter.Waiter<GetSecurityListRequest, GetSecurityListResponse>
            forSecurityList(
                    com.oracle.bmc.waiter.BmcGenericWaiter waiter,
                    final GetSecurityListRequest request,
                    final com.oracle.bmc.core.model.SecurityList.LifecycleState... targetStates) {
        final java.util.Set<com.oracle.bmc.core.model.SecurityList.LifecycleState> targetStatesSet =
                new java.util.HashSet<>(java.util.Arrays.asList(targetStates));

        return new com.oracle.bmc.waiter.internal.SimpleWaiterImpl<>(
                executorService,
                waiter.toCallable(
                        com.google.common.base.Suppliers.ofInstance(request),
                        new com.google.common.base.Function<
                                GetSecurityListRequest, GetSecurityListResponse>() {
                            @Override
                            public GetSecurityListResponse apply(GetSecurityListRequest request) {
                                return client.getSecurityList(request);
                            }
                        },
                        new com.google.common.base.Predicate<GetSecurityListResponse>() {
                            @Override
                            public boolean apply(GetSecurityListResponse response) {
                                return targetStatesSet.contains(
                                        response.getSecurityList().getLifecycleState());
                            }
                        },
                        targetStatesSet.contains(
                                com.oracle.bmc.core.model.SecurityList.LifecycleState.Terminated)),
                request);
    }

    /**
     * Creates a new {@link Waiter} using default configuration.
     *
     * @param request the request to send
     * @param targetStates the desired states to wait for. If multiple states are provided then the waiter will return once the resource reaches any of the provided states
     * @return a new {@code Waiter} instance
     */
    public com.oracle.bmc.waiter.Waiter<GetServiceGatewayRequest, GetServiceGatewayResponse>
            forServiceGateway(
                    GetServiceGatewayRequest request,
                    com.oracle.bmc.core.model.ServiceGateway.LifecycleState... targetStates) {
        org.apache.commons.lang3.Validate.notEmpty(
                targetStates, "At least one targetState must be provided");
        org.apache.commons.lang3.Validate.noNullElements(
                targetStates, "Null targetState values are not permitted");

        return forServiceGateway(
                com.oracle.bmc.waiter.Waiters.DEFAULT_POLLING_WAITER, request, targetStates);
    }

    /**
     * Creates a new {@link Waiter} using the provided configuration.
     *
     * @param request the request to send
     * @param targetState the desired state to wait for
     * @param terminationStrategy the {@link TerminationStrategy} to use
     * @param delayStrategy the {@link DelayStrategy} to use
     * @return a new {@code Waiter} instance
     */
    public com.oracle.bmc.waiter.Waiter<GetServiceGatewayRequest, GetServiceGatewayResponse>
            forServiceGateway(
                    GetServiceGatewayRequest request,
                    com.oracle.bmc.core.model.ServiceGateway.LifecycleState targetState,
                    com.oracle.bmc.waiter.TerminationStrategy terminationStrategy,
                    com.oracle.bmc.waiter.DelayStrategy delayStrategy) {
        org.apache.commons.lang3.Validate.notNull(targetState, "The targetState cannot be null");

        return forServiceGateway(
                com.oracle.bmc.waiter.Waiters.newWaiter(terminationStrategy, delayStrategy),
                request,
                targetState);
    }

    /**
     * Creates a new {@link Waiter} using the provided configuration.
     *
     * @param request the request to send
     * @param terminationStrategy the {@link TerminationStrategy} to use
     * @param delayStrategy the {@link DelayStrategy} to use
     * @param targetStates the desired states to wait for. The waiter will return once the resource reaches any of the provided states
     * @return a new {@code Waiter} instance
     */
    public com.oracle.bmc.waiter.Waiter<GetServiceGatewayRequest, GetServiceGatewayResponse>
            forServiceGateway(
                    GetServiceGatewayRequest request,
                    com.oracle.bmc.waiter.TerminationStrategy terminationStrategy,
                    com.oracle.bmc.waiter.DelayStrategy delayStrategy,
                    com.oracle.bmc.core.model.ServiceGateway.LifecycleState... targetStates) {
        org.apache.commons.lang3.Validate.notEmpty(
                targetStates, "At least one target state must be provided");
        org.apache.commons.lang3.Validate.noNullElements(
                targetStates, "Null target states are not permitted");

        return forServiceGateway(
                com.oracle.bmc.waiter.Waiters.newWaiter(terminationStrategy, delayStrategy),
                request,
                targetStates);
    }

    // Helper method to create a new Waiter for ServiceGateway.
    private com.oracle.bmc.waiter.Waiter<GetServiceGatewayRequest, GetServiceGatewayResponse>
            forServiceGateway(
                    com.oracle.bmc.waiter.BmcGenericWaiter waiter,
                    final GetServiceGatewayRequest request,
                    final com.oracle.bmc.core.model.ServiceGateway.LifecycleState... targetStates) {
        final java.util.Set<com.oracle.bmc.core.model.ServiceGateway.LifecycleState>
                targetStatesSet = new java.util.HashSet<>(java.util.Arrays.asList(targetStates));

        return new com.oracle.bmc.waiter.internal.SimpleWaiterImpl<>(
                executorService,
                waiter.toCallable(
                        com.google.common.base.Suppliers.ofInstance(request),
                        new com.google.common.base.Function<
                                GetServiceGatewayRequest, GetServiceGatewayResponse>() {
                            @Override
                            public GetServiceGatewayResponse apply(
                                    GetServiceGatewayRequest request) {
                                return client.getServiceGateway(request);
                            }
                        },
                        new com.google.common.base.Predicate<GetServiceGatewayResponse>() {
                            @Override
                            public boolean apply(GetServiceGatewayResponse response) {
                                return targetStatesSet.contains(
                                        response.getServiceGateway().getLifecycleState());
                            }
                        },
                        targetStatesSet.contains(
                                com.oracle.bmc.core.model.ServiceGateway.LifecycleState
                                        .Terminated)),
                request);
    }

    /**
     * Creates a new {@link Waiter} using default configuration.
     *
     * @param request the request to send
     * @param targetStates the desired states to wait for. If multiple states are provided then the waiter will return once the resource reaches any of the provided states
     * @return a new {@code Waiter} instance
     */
    public com.oracle.bmc.waiter.Waiter<GetSubnetRequest, GetSubnetResponse> forSubnet(
            GetSubnetRequest request,
            com.oracle.bmc.core.model.Subnet.LifecycleState... targetStates) {
        org.apache.commons.lang3.Validate.notEmpty(
                targetStates, "At least one targetState must be provided");
        org.apache.commons.lang3.Validate.noNullElements(
                targetStates, "Null targetState values are not permitted");

        return forSubnet(
                com.oracle.bmc.waiter.Waiters.DEFAULT_POLLING_WAITER, request, targetStates);
    }

    /**
     * Creates a new {@link Waiter} using the provided configuration.
     *
     * @param request the request to send
     * @param targetState the desired state to wait for
     * @param terminationStrategy the {@link TerminationStrategy} to use
     * @param delayStrategy the {@link DelayStrategy} to use
     * @return a new {@code Waiter} instance
     */
    public com.oracle.bmc.waiter.Waiter<GetSubnetRequest, GetSubnetResponse> forSubnet(
            GetSubnetRequest request,
            com.oracle.bmc.core.model.Subnet.LifecycleState targetState,
            com.oracle.bmc.waiter.TerminationStrategy terminationStrategy,
            com.oracle.bmc.waiter.DelayStrategy delayStrategy) {
        org.apache.commons.lang3.Validate.notNull(targetState, "The targetState cannot be null");

        return forSubnet(
                com.oracle.bmc.waiter.Waiters.newWaiter(terminationStrategy, delayStrategy),
                request,
                targetState);
    }

    /**
     * Creates a new {@link Waiter} using the provided configuration.
     *
     * @param request the request to send
     * @param terminationStrategy the {@link TerminationStrategy} to use
     * @param delayStrategy the {@link DelayStrategy} to use
     * @param targetStates the desired states to wait for. The waiter will return once the resource reaches any of the provided states
     * @return a new {@code Waiter} instance
     */
    public com.oracle.bmc.waiter.Waiter<GetSubnetRequest, GetSubnetResponse> forSubnet(
            GetSubnetRequest request,
            com.oracle.bmc.waiter.TerminationStrategy terminationStrategy,
            com.oracle.bmc.waiter.DelayStrategy delayStrategy,
            com.oracle.bmc.core.model.Subnet.LifecycleState... targetStates) {
        org.apache.commons.lang3.Validate.notEmpty(
                targetStates, "At least one target state must be provided");
        org.apache.commons.lang3.Validate.noNullElements(
                targetStates, "Null target states are not permitted");

        return forSubnet(
                com.oracle.bmc.waiter.Waiters.newWaiter(terminationStrategy, delayStrategy),
                request,
                targetStates);
    }

    // Helper method to create a new Waiter for Subnet.
    private com.oracle.bmc.waiter.Waiter<GetSubnetRequest, GetSubnetResponse> forSubnet(
            com.oracle.bmc.waiter.BmcGenericWaiter waiter,
            final GetSubnetRequest request,
            final com.oracle.bmc.core.model.Subnet.LifecycleState... targetStates) {
        final java.util.Set<com.oracle.bmc.core.model.Subnet.LifecycleState> targetStatesSet =
                new java.util.HashSet<>(java.util.Arrays.asList(targetStates));

        return new com.oracle.bmc.waiter.internal.SimpleWaiterImpl<>(
                executorService,
                waiter.toCallable(
                        com.google.common.base.Suppliers.ofInstance(request),
                        new com.google.common.base.Function<GetSubnetRequest, GetSubnetResponse>() {
                            @Override
                            public GetSubnetResponse apply(GetSubnetRequest request) {
                                return client.getSubnet(request);
                            }
                        },
                        new com.google.common.base.Predicate<GetSubnetResponse>() {
                            @Override
                            public boolean apply(GetSubnetResponse response) {
                                return targetStatesSet.contains(
                                        response.getSubnet().getLifecycleState());
                            }
                        },
                        targetStatesSet.contains(
                                com.oracle.bmc.core.model.Subnet.LifecycleState.Terminated)),
                request);
    }

    /**
     * Creates a new {@link Waiter} using default configuration.
     *
     * @param request the request to send
     * @param targetStates the desired states to wait for. If multiple states are provided then the waiter will return once the resource reaches any of the provided states
     * @return a new {@code Waiter} instance
     */
    public com.oracle.bmc.waiter.Waiter<GetVcnRequest, GetVcnResponse> forVcn(
            GetVcnRequest request, com.oracle.bmc.core.model.Vcn.LifecycleState... targetStates) {
        org.apache.commons.lang3.Validate.notEmpty(
                targetStates, "At least one targetState must be provided");
        org.apache.commons.lang3.Validate.noNullElements(
                targetStates, "Null targetState values are not permitted");

        return forVcn(com.oracle.bmc.waiter.Waiters.DEFAULT_POLLING_WAITER, request, targetStates);
    }

    /**
     * Creates a new {@link Waiter} using the provided configuration.
     *
     * @param request the request to send
     * @param targetState the desired state to wait for
     * @param terminationStrategy the {@link TerminationStrategy} to use
     * @param delayStrategy the {@link DelayStrategy} to use
     * @return a new {@code Waiter} instance
     */
    public com.oracle.bmc.waiter.Waiter<GetVcnRequest, GetVcnResponse> forVcn(
            GetVcnRequest request,
            com.oracle.bmc.core.model.Vcn.LifecycleState targetState,
            com.oracle.bmc.waiter.TerminationStrategy terminationStrategy,
            com.oracle.bmc.waiter.DelayStrategy delayStrategy) {
        org.apache.commons.lang3.Validate.notNull(targetState, "The targetState cannot be null");

        return forVcn(
                com.oracle.bmc.waiter.Waiters.newWaiter(terminationStrategy, delayStrategy),
                request,
                targetState);
    }

    /**
     * Creates a new {@link Waiter} using the provided configuration.
     *
     * @param request the request to send
     * @param terminationStrategy the {@link TerminationStrategy} to use
     * @param delayStrategy the {@link DelayStrategy} to use
     * @param targetStates the desired states to wait for. The waiter will return once the resource reaches any of the provided states
     * @return a new {@code Waiter} instance
     */
    public com.oracle.bmc.waiter.Waiter<GetVcnRequest, GetVcnResponse> forVcn(
            GetVcnRequest request,
            com.oracle.bmc.waiter.TerminationStrategy terminationStrategy,
            com.oracle.bmc.waiter.DelayStrategy delayStrategy,
            com.oracle.bmc.core.model.Vcn.LifecycleState... targetStates) {
        org.apache.commons.lang3.Validate.notEmpty(
                targetStates, "At least one target state must be provided");
        org.apache.commons.lang3.Validate.noNullElements(
                targetStates, "Null target states are not permitted");

        return forVcn(
                com.oracle.bmc.waiter.Waiters.newWaiter(terminationStrategy, delayStrategy),
                request,
                targetStates);
    }

    // Helper method to create a new Waiter for Vcn.
    private com.oracle.bmc.waiter.Waiter<GetVcnRequest, GetVcnResponse> forVcn(
            com.oracle.bmc.waiter.BmcGenericWaiter waiter,
            final GetVcnRequest request,
            final com.oracle.bmc.core.model.Vcn.LifecycleState... targetStates) {
        final java.util.Set<com.oracle.bmc.core.model.Vcn.LifecycleState> targetStatesSet =
                new java.util.HashSet<>(java.util.Arrays.asList(targetStates));

        return new com.oracle.bmc.waiter.internal.SimpleWaiterImpl<>(
                executorService,
                waiter.toCallable(
                        com.google.common.base.Suppliers.ofInstance(request),
                        new com.google.common.base.Function<GetVcnRequest, GetVcnResponse>() {
                            @Override
                            public GetVcnResponse apply(GetVcnRequest request) {
                                return client.getVcn(request);
                            }
                        },
                        new com.google.common.base.Predicate<GetVcnResponse>() {
                            @Override
                            public boolean apply(GetVcnResponse response) {
                                return targetStatesSet.contains(
                                        response.getVcn().getLifecycleState());
                            }
                        },
                        targetStatesSet.contains(
                                com.oracle.bmc.core.model.Vcn.LifecycleState.Terminated)),
                request);
    }

    /**
     * Creates a new {@link Waiter} using default configuration.
     *
     * @param request the request to send
     * @param targetStates the desired states to wait for. If multiple states are provided then the waiter will return once the resource reaches any of the provided states
     * @return a new {@code Waiter} instance
     */
    public com.oracle.bmc.waiter.Waiter<GetVirtualCircuitRequest, GetVirtualCircuitResponse>
            forVirtualCircuit(
                    GetVirtualCircuitRequest request,
                    com.oracle.bmc.core.model.VirtualCircuit.LifecycleState... targetStates) {
        org.apache.commons.lang3.Validate.notEmpty(
                targetStates, "At least one targetState must be provided");
        org.apache.commons.lang3.Validate.noNullElements(
                targetStates, "Null targetState values are not permitted");

        return forVirtualCircuit(
                com.oracle.bmc.waiter.Waiters.DEFAULT_POLLING_WAITER, request, targetStates);
    }

    /**
     * Creates a new {@link Waiter} using the provided configuration.
     *
     * @param request the request to send
     * @param targetState the desired state to wait for
     * @param terminationStrategy the {@link TerminationStrategy} to use
     * @param delayStrategy the {@link DelayStrategy} to use
     * @return a new {@code Waiter} instance
     */
    public com.oracle.bmc.waiter.Waiter<GetVirtualCircuitRequest, GetVirtualCircuitResponse>
            forVirtualCircuit(
                    GetVirtualCircuitRequest request,
                    com.oracle.bmc.core.model.VirtualCircuit.LifecycleState targetState,
                    com.oracle.bmc.waiter.TerminationStrategy terminationStrategy,
                    com.oracle.bmc.waiter.DelayStrategy delayStrategy) {
        org.apache.commons.lang3.Validate.notNull(targetState, "The targetState cannot be null");

        return forVirtualCircuit(
                com.oracle.bmc.waiter.Waiters.newWaiter(terminationStrategy, delayStrategy),
                request,
                targetState);
    }

    /**
     * Creates a new {@link Waiter} using the provided configuration.
     *
     * @param request the request to send
     * @param terminationStrategy the {@link TerminationStrategy} to use
     * @param delayStrategy the {@link DelayStrategy} to use
     * @param targetStates the desired states to wait for. The waiter will return once the resource reaches any of the provided states
     * @return a new {@code Waiter} instance
     */
    public com.oracle.bmc.waiter.Waiter<GetVirtualCircuitRequest, GetVirtualCircuitResponse>
            forVirtualCircuit(
                    GetVirtualCircuitRequest request,
                    com.oracle.bmc.waiter.TerminationStrategy terminationStrategy,
                    com.oracle.bmc.waiter.DelayStrategy delayStrategy,
                    com.oracle.bmc.core.model.VirtualCircuit.LifecycleState... targetStates) {
        org.apache.commons.lang3.Validate.notEmpty(
                targetStates, "At least one target state must be provided");
        org.apache.commons.lang3.Validate.noNullElements(
                targetStates, "Null target states are not permitted");

        return forVirtualCircuit(
                com.oracle.bmc.waiter.Waiters.newWaiter(terminationStrategy, delayStrategy),
                request,
                targetStates);
    }

    // Helper method to create a new Waiter for VirtualCircuit.
    private com.oracle.bmc.waiter.Waiter<GetVirtualCircuitRequest, GetVirtualCircuitResponse>
            forVirtualCircuit(
                    com.oracle.bmc.waiter.BmcGenericWaiter waiter,
                    final GetVirtualCircuitRequest request,
                    final com.oracle.bmc.core.model.VirtualCircuit.LifecycleState... targetStates) {
        final java.util.Set<com.oracle.bmc.core.model.VirtualCircuit.LifecycleState>
                targetStatesSet = new java.util.HashSet<>(java.util.Arrays.asList(targetStates));

        return new com.oracle.bmc.waiter.internal.SimpleWaiterImpl<>(
                executorService,
                waiter.toCallable(
                        com.google.common.base.Suppliers.ofInstance(request),
                        new com.google.common.base.Function<
                                GetVirtualCircuitRequest, GetVirtualCircuitResponse>() {
                            @Override
                            public GetVirtualCircuitResponse apply(
                                    GetVirtualCircuitRequest request) {
                                return client.getVirtualCircuit(request);
                            }
                        },
                        new com.google.common.base.Predicate<GetVirtualCircuitResponse>() {
                            @Override
                            public boolean apply(GetVirtualCircuitResponse response) {
                                return targetStatesSet.contains(
                                        response.getVirtualCircuit().getLifecycleState());
                            }
                        },
                        targetStatesSet.contains(
                                com.oracle.bmc.core.model.VirtualCircuit.LifecycleState
                                        .Terminated)),
                request);
    }

    /**
     * Creates a new {@link Waiter} using default configuration.
     *
     * @param request the request to send
     * @param targetStates the desired states to wait for. If multiple states are provided then the waiter will return once the resource reaches any of the provided states
     * @return a new {@code Waiter} instance
     */
    public com.oracle.bmc.waiter.Waiter<GetVnicRequest, GetVnicResponse> forVnic(
            GetVnicRequest request, com.oracle.bmc.core.model.Vnic.LifecycleState... targetStates) {
        org.apache.commons.lang3.Validate.notEmpty(
                targetStates, "At least one targetState must be provided");
        org.apache.commons.lang3.Validate.noNullElements(
                targetStates, "Null targetState values are not permitted");

        return forVnic(com.oracle.bmc.waiter.Waiters.DEFAULT_POLLING_WAITER, request, targetStates);
    }

    /**
     * Creates a new {@link Waiter} using the provided configuration.
     *
     * @param request the request to send
     * @param targetState the desired state to wait for
     * @param terminationStrategy the {@link TerminationStrategy} to use
     * @param delayStrategy the {@link DelayStrategy} to use
     * @return a new {@code Waiter} instance
     */
    public com.oracle.bmc.waiter.Waiter<GetVnicRequest, GetVnicResponse> forVnic(
            GetVnicRequest request,
            com.oracle.bmc.core.model.Vnic.LifecycleState targetState,
            com.oracle.bmc.waiter.TerminationStrategy terminationStrategy,
            com.oracle.bmc.waiter.DelayStrategy delayStrategy) {
        org.apache.commons.lang3.Validate.notNull(targetState, "The targetState cannot be null");

        return forVnic(
                com.oracle.bmc.waiter.Waiters.newWaiter(terminationStrategy, delayStrategy),
                request,
                targetState);
    }

    /**
     * Creates a new {@link Waiter} using the provided configuration.
     *
     * @param request the request to send
     * @param terminationStrategy the {@link TerminationStrategy} to use
     * @param delayStrategy the {@link DelayStrategy} to use
     * @param targetStates the desired states to wait for. The waiter will return once the resource reaches any of the provided states
     * @return a new {@code Waiter} instance
     */
    public com.oracle.bmc.waiter.Waiter<GetVnicRequest, GetVnicResponse> forVnic(
            GetVnicRequest request,
            com.oracle.bmc.waiter.TerminationStrategy terminationStrategy,
            com.oracle.bmc.waiter.DelayStrategy delayStrategy,
            com.oracle.bmc.core.model.Vnic.LifecycleState... targetStates) {
        org.apache.commons.lang3.Validate.notEmpty(
                targetStates, "At least one target state must be provided");
        org.apache.commons.lang3.Validate.noNullElements(
                targetStates, "Null target states are not permitted");

        return forVnic(
                com.oracle.bmc.waiter.Waiters.newWaiter(terminationStrategy, delayStrategy),
                request,
                targetStates);
    }

    // Helper method to create a new Waiter for Vnic.
    private com.oracle.bmc.waiter.Waiter<GetVnicRequest, GetVnicResponse> forVnic(
            com.oracle.bmc.waiter.BmcGenericWaiter waiter,
            final GetVnicRequest request,
            final com.oracle.bmc.core.model.Vnic.LifecycleState... targetStates) {
        final java.util.Set<com.oracle.bmc.core.model.Vnic.LifecycleState> targetStatesSet =
                new java.util.HashSet<>(java.util.Arrays.asList(targetStates));

        return new com.oracle.bmc.waiter.internal.SimpleWaiterImpl<>(
                executorService,
                waiter.toCallable(
                        com.google.common.base.Suppliers.ofInstance(request),
                        new com.google.common.base.Function<GetVnicRequest, GetVnicResponse>() {
                            @Override
                            public GetVnicResponse apply(GetVnicRequest request) {
                                return client.getVnic(request);
                            }
                        },
                        new com.google.common.base.Predicate<GetVnicResponse>() {
                            @Override
                            public boolean apply(GetVnicResponse response) {
                                return targetStatesSet.contains(
                                        response.getVnic().getLifecycleState());
                            }
                        },
                        targetStatesSet.contains(
                                com.oracle.bmc.core.model.Vnic.LifecycleState.Terminated)),
                request);
    }
}
