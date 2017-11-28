/**
 * Copyright (c) 2016, 2017, Oracle and/or its affiliates. All rights reserved.
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
     * @param request The request to send.
     * @param targetState The desired state to wait for.
     * @return A new Waiter instance.
     */
    public com.oracle.bmc.waiter.Waiter<GetCrossConnectRequest, GetCrossConnectResponse>
            forCrossConnect(
                    GetCrossConnectRequest request,
                    com.oracle.bmc.core.model.CrossConnect.LifecycleState targetState) {
        return forCrossConnect(
                com.oracle.bmc.waiter.Waiters.DEFAULT_POLLING_WAITER, request, targetState);
    }

    /**
     * Creates a new {@link Waiter} using the provided configuration.
     *
     * @param request The request to send.
     * @param targetState The desired state to wait for.
     * @param terminationStrategy The {@link TerminationStrategy} to use.
     * @param delayStrategy The {@link DelayStrategy} to use.
     * @return A new Waiter instance.
     */
    public com.oracle.bmc.waiter.Waiter<GetCrossConnectRequest, GetCrossConnectResponse>
            forCrossConnect(
                    GetCrossConnectRequest request,
                    com.oracle.bmc.core.model.CrossConnect.LifecycleState targetState,
                    com.oracle.bmc.waiter.TerminationStrategy terminationStrategy,
                    com.oracle.bmc.waiter.DelayStrategy delayStrategy) {
        return forCrossConnect(
                com.oracle.bmc.waiter.Waiters.newWaiter(terminationStrategy, delayStrategy),
                request,
                targetState);
    }

    // Helper method to create a new Waiter for CrossConnect.
    private com.oracle.bmc.waiter.Waiter<GetCrossConnectRequest, GetCrossConnectResponse>
            forCrossConnect(
                    com.oracle.bmc.waiter.BmcGenericWaiter waiter,
                    final GetCrossConnectRequest request,
                    final com.oracle.bmc.core.model.CrossConnect.LifecycleState targetState) {
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
                                return response.getCrossConnect().getLifecycleState()
                                        == targetState;
                            }
                        },
                        targetState
                                == com.oracle.bmc.core.model.CrossConnect.LifecycleState
                                        .Terminated),
                request);
    }

    /**
     * Creates a new {@link Waiter} using default configuration.
     *
     * @param request The request to send.
     * @param targetState The desired state to wait for.
     * @return A new Waiter instance.
     */
    public com.oracle.bmc.waiter.Waiter<GetCrossConnectGroupRequest, GetCrossConnectGroupResponse>
            forCrossConnectGroup(
                    GetCrossConnectGroupRequest request,
                    com.oracle.bmc.core.model.CrossConnectGroup.LifecycleState targetState) {
        return forCrossConnectGroup(
                com.oracle.bmc.waiter.Waiters.DEFAULT_POLLING_WAITER, request, targetState);
    }

    /**
     * Creates a new {@link Waiter} using the provided configuration.
     *
     * @param request The request to send.
     * @param targetState The desired state to wait for.
     * @param terminationStrategy The {@link TerminationStrategy} to use.
     * @param delayStrategy The {@link DelayStrategy} to use.
     * @return A new Waiter instance.
     */
    public com.oracle.bmc.waiter.Waiter<GetCrossConnectGroupRequest, GetCrossConnectGroupResponse>
            forCrossConnectGroup(
                    GetCrossConnectGroupRequest request,
                    com.oracle.bmc.core.model.CrossConnectGroup.LifecycleState targetState,
                    com.oracle.bmc.waiter.TerminationStrategy terminationStrategy,
                    com.oracle.bmc.waiter.DelayStrategy delayStrategy) {
        return forCrossConnectGroup(
                com.oracle.bmc.waiter.Waiters.newWaiter(terminationStrategy, delayStrategy),
                request,
                targetState);
    }

    // Helper method to create a new Waiter for CrossConnectGroup.
    private com.oracle.bmc.waiter.Waiter<GetCrossConnectGroupRequest, GetCrossConnectGroupResponse>
            forCrossConnectGroup(
                    com.oracle.bmc.waiter.BmcGenericWaiter waiter,
                    final GetCrossConnectGroupRequest request,
                    final com.oracle.bmc.core.model.CrossConnectGroup.LifecycleState targetState) {
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
                                return response.getCrossConnectGroup().getLifecycleState()
                                        == targetState;
                            }
                        },
                        targetState
                                == com.oracle.bmc.core.model.CrossConnectGroup.LifecycleState
                                        .Terminated),
                request);
    }

    /**
     * Creates a new {@link Waiter} using default configuration.
     *
     * @param request The request to send.
     * @param targetState The desired state to wait for.
     * @return A new Waiter instance.
     */
    public com.oracle.bmc.waiter.Waiter<GetDhcpOptionsRequest, GetDhcpOptionsResponse>
            forDhcpOptions(
                    GetDhcpOptionsRequest request,
                    com.oracle.bmc.core.model.DhcpOptions.LifecycleState targetState) {
        return forDhcpOptions(
                com.oracle.bmc.waiter.Waiters.DEFAULT_POLLING_WAITER, request, targetState);
    }

    /**
     * Creates a new {@link Waiter} using the provided configuration.
     *
     * @param request The request to send.
     * @param targetState The desired state to wait for.
     * @param terminationStrategy The {@link TerminationStrategy} to use.
     * @param delayStrategy The {@link DelayStrategy} to use.
     * @return A new Waiter instance.
     */
    public com.oracle.bmc.waiter.Waiter<GetDhcpOptionsRequest, GetDhcpOptionsResponse>
            forDhcpOptions(
                    GetDhcpOptionsRequest request,
                    com.oracle.bmc.core.model.DhcpOptions.LifecycleState targetState,
                    com.oracle.bmc.waiter.TerminationStrategy terminationStrategy,
                    com.oracle.bmc.waiter.DelayStrategy delayStrategy) {
        return forDhcpOptions(
                com.oracle.bmc.waiter.Waiters.newWaiter(terminationStrategy, delayStrategy),
                request,
                targetState);
    }

    // Helper method to create a new Waiter for DhcpOptions.
    private com.oracle.bmc.waiter.Waiter<GetDhcpOptionsRequest, GetDhcpOptionsResponse>
            forDhcpOptions(
                    com.oracle.bmc.waiter.BmcGenericWaiter waiter,
                    final GetDhcpOptionsRequest request,
                    final com.oracle.bmc.core.model.DhcpOptions.LifecycleState targetState) {
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
                                return response.getDhcpOptions().getLifecycleState() == targetState;
                            }
                        },
                        targetState
                                == com.oracle.bmc.core.model.DhcpOptions.LifecycleState.Terminated),
                request);
    }

    /**
     * Creates a new {@link Waiter} using default configuration.
     *
     * @param request The request to send.
     * @param targetState The desired state to wait for.
     * @return A new Waiter instance.
     */
    public com.oracle.bmc.waiter.Waiter<GetDrgRequest, GetDrgResponse> forDrg(
            GetDrgRequest request, com.oracle.bmc.core.model.Drg.LifecycleState targetState) {
        return forDrg(com.oracle.bmc.waiter.Waiters.DEFAULT_POLLING_WAITER, request, targetState);
    }

    /**
     * Creates a new {@link Waiter} using the provided configuration.
     *
     * @param request The request to send.
     * @param targetState The desired state to wait for.
     * @param terminationStrategy The {@link TerminationStrategy} to use.
     * @param delayStrategy The {@link DelayStrategy} to use.
     * @return A new Waiter instance.
     */
    public com.oracle.bmc.waiter.Waiter<GetDrgRequest, GetDrgResponse> forDrg(
            GetDrgRequest request,
            com.oracle.bmc.core.model.Drg.LifecycleState targetState,
            com.oracle.bmc.waiter.TerminationStrategy terminationStrategy,
            com.oracle.bmc.waiter.DelayStrategy delayStrategy) {
        return forDrg(
                com.oracle.bmc.waiter.Waiters.newWaiter(terminationStrategy, delayStrategy),
                request,
                targetState);
    }

    // Helper method to create a new Waiter for Drg.
    private com.oracle.bmc.waiter.Waiter<GetDrgRequest, GetDrgResponse> forDrg(
            com.oracle.bmc.waiter.BmcGenericWaiter waiter,
            final GetDrgRequest request,
            final com.oracle.bmc.core.model.Drg.LifecycleState targetState) {
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
                                return response.getDrg().getLifecycleState() == targetState;
                            }
                        },
                        targetState == com.oracle.bmc.core.model.Drg.LifecycleState.Terminated),
                request);
    }

    /**
     * Creates a new {@link Waiter} using default configuration.
     *
     * @param request The request to send.
     * @param targetState The desired state to wait for.
     * @return A new Waiter instance.
     */
    public com.oracle.bmc.waiter.Waiter<GetDrgAttachmentRequest, GetDrgAttachmentResponse>
            forDrgAttachment(
                    GetDrgAttachmentRequest request,
                    com.oracle.bmc.core.model.DrgAttachment.LifecycleState targetState) {
        return forDrgAttachment(
                com.oracle.bmc.waiter.Waiters.DEFAULT_POLLING_WAITER, request, targetState);
    }

    /**
     * Creates a new {@link Waiter} using the provided configuration.
     *
     * @param request The request to send.
     * @param targetState The desired state to wait for.
     * @param terminationStrategy The {@link TerminationStrategy} to use.
     * @param delayStrategy The {@link DelayStrategy} to use.
     * @return A new Waiter instance.
     */
    public com.oracle.bmc.waiter.Waiter<GetDrgAttachmentRequest, GetDrgAttachmentResponse>
            forDrgAttachment(
                    GetDrgAttachmentRequest request,
                    com.oracle.bmc.core.model.DrgAttachment.LifecycleState targetState,
                    com.oracle.bmc.waiter.TerminationStrategy terminationStrategy,
                    com.oracle.bmc.waiter.DelayStrategy delayStrategy) {
        return forDrgAttachment(
                com.oracle.bmc.waiter.Waiters.newWaiter(terminationStrategy, delayStrategy),
                request,
                targetState);
    }

    // Helper method to create a new Waiter for DrgAttachment.
    private com.oracle.bmc.waiter.Waiter<GetDrgAttachmentRequest, GetDrgAttachmentResponse>
            forDrgAttachment(
                    com.oracle.bmc.waiter.BmcGenericWaiter waiter,
                    final GetDrgAttachmentRequest request,
                    final com.oracle.bmc.core.model.DrgAttachment.LifecycleState targetState) {
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
                                return response.getDrgAttachment().getLifecycleState()
                                        == targetState;
                            }
                        },
                        targetState
                                == com.oracle.bmc.core.model.DrgAttachment.LifecycleState.Detached),
                request);
    }

    /**
     * Creates a new {@link Waiter} using default configuration.
     *
     * @param request The request to send.
     * @param targetState The desired state to wait for.
     * @return A new Waiter instance.
     */
    public com.oracle.bmc.waiter.Waiter<GetIPSecConnectionRequest, GetIPSecConnectionResponse>
            forIPSecConnection(
                    GetIPSecConnectionRequest request,
                    com.oracle.bmc.core.model.IPSecConnection.LifecycleState targetState) {
        return forIPSecConnection(
                com.oracle.bmc.waiter.Waiters.DEFAULT_POLLING_WAITER, request, targetState);
    }

    /**
     * Creates a new {@link Waiter} using the provided configuration.
     *
     * @param request The request to send.
     * @param targetState The desired state to wait for.
     * @param terminationStrategy The {@link TerminationStrategy} to use.
     * @param delayStrategy The {@link DelayStrategy} to use.
     * @return A new Waiter instance.
     */
    public com.oracle.bmc.waiter.Waiter<GetIPSecConnectionRequest, GetIPSecConnectionResponse>
            forIPSecConnection(
                    GetIPSecConnectionRequest request,
                    com.oracle.bmc.core.model.IPSecConnection.LifecycleState targetState,
                    com.oracle.bmc.waiter.TerminationStrategy terminationStrategy,
                    com.oracle.bmc.waiter.DelayStrategy delayStrategy) {
        return forIPSecConnection(
                com.oracle.bmc.waiter.Waiters.newWaiter(terminationStrategy, delayStrategy),
                request,
                targetState);
    }

    // Helper method to create a new Waiter for IPSecConnection.
    private com.oracle.bmc.waiter.Waiter<GetIPSecConnectionRequest, GetIPSecConnectionResponse>
            forIPSecConnection(
                    com.oracle.bmc.waiter.BmcGenericWaiter waiter,
                    final GetIPSecConnectionRequest request,
                    final com.oracle.bmc.core.model.IPSecConnection.LifecycleState targetState) {
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
                                return response.getIPSecConnection().getLifecycleState()
                                        == targetState;
                            }
                        },
                        targetState
                                == com.oracle.bmc.core.model.IPSecConnection.LifecycleState
                                        .Terminated),
                request);
    }

    /**
     * Creates a new {@link Waiter} using default configuration.
     *
     * @param request The request to send.
     * @param targetState The desired state to wait for.
     * @return A new Waiter instance.
     */
    public com.oracle.bmc.waiter.Waiter<GetInternetGatewayRequest, GetInternetGatewayResponse>
            forInternetGateway(
                    GetInternetGatewayRequest request,
                    com.oracle.bmc.core.model.InternetGateway.LifecycleState targetState) {
        return forInternetGateway(
                com.oracle.bmc.waiter.Waiters.DEFAULT_POLLING_WAITER, request, targetState);
    }

    /**
     * Creates a new {@link Waiter} using the provided configuration.
     *
     * @param request The request to send.
     * @param targetState The desired state to wait for.
     * @param terminationStrategy The {@link TerminationStrategy} to use.
     * @param delayStrategy The {@link DelayStrategy} to use.
     * @return A new Waiter instance.
     */
    public com.oracle.bmc.waiter.Waiter<GetInternetGatewayRequest, GetInternetGatewayResponse>
            forInternetGateway(
                    GetInternetGatewayRequest request,
                    com.oracle.bmc.core.model.InternetGateway.LifecycleState targetState,
                    com.oracle.bmc.waiter.TerminationStrategy terminationStrategy,
                    com.oracle.bmc.waiter.DelayStrategy delayStrategy) {
        return forInternetGateway(
                com.oracle.bmc.waiter.Waiters.newWaiter(terminationStrategy, delayStrategy),
                request,
                targetState);
    }

    // Helper method to create a new Waiter for InternetGateway.
    private com.oracle.bmc.waiter.Waiter<GetInternetGatewayRequest, GetInternetGatewayResponse>
            forInternetGateway(
                    com.oracle.bmc.waiter.BmcGenericWaiter waiter,
                    final GetInternetGatewayRequest request,
                    final com.oracle.bmc.core.model.InternetGateway.LifecycleState targetState) {
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
                                return response.getInternetGateway().getLifecycleState()
                                        == targetState;
                            }
                        },
                        targetState
                                == com.oracle.bmc.core.model.InternetGateway.LifecycleState
                                        .Terminated),
                request);
    }

    /**
     * Creates a new {@link Waiter} using default configuration.
     *
     * @param request The request to send.
     * @param targetState The desired state to wait for.
     * @return A new Waiter instance.
     */
    public com.oracle.bmc.waiter.Waiter<
                    GetLocalPeeringGatewayRequest, GetLocalPeeringGatewayResponse>
            forLocalPeeringGateway(
                    GetLocalPeeringGatewayRequest request,
                    com.oracle.bmc.core.model.LocalPeeringGateway.LifecycleState targetState) {
        return forLocalPeeringGateway(
                com.oracle.bmc.waiter.Waiters.DEFAULT_POLLING_WAITER, request, targetState);
    }

    /**
     * Creates a new {@link Waiter} using the provided configuration.
     *
     * @param request The request to send.
     * @param targetState The desired state to wait for.
     * @param terminationStrategy The {@link TerminationStrategy} to use.
     * @param delayStrategy The {@link DelayStrategy} to use.
     * @return A new Waiter instance.
     */
    public com.oracle.bmc.waiter.Waiter<
                    GetLocalPeeringGatewayRequest, GetLocalPeeringGatewayResponse>
            forLocalPeeringGateway(
                    GetLocalPeeringGatewayRequest request,
                    com.oracle.bmc.core.model.LocalPeeringGateway.LifecycleState targetState,
                    com.oracle.bmc.waiter.TerminationStrategy terminationStrategy,
                    com.oracle.bmc.waiter.DelayStrategy delayStrategy) {
        return forLocalPeeringGateway(
                com.oracle.bmc.waiter.Waiters.newWaiter(terminationStrategy, delayStrategy),
                request,
                targetState);
    }

    // Helper method to create a new Waiter for LocalPeeringGateway.
    private com.oracle.bmc.waiter.Waiter<
                    GetLocalPeeringGatewayRequest, GetLocalPeeringGatewayResponse>
            forLocalPeeringGateway(
                    com.oracle.bmc.waiter.BmcGenericWaiter waiter,
                    final GetLocalPeeringGatewayRequest request,
                    final com.oracle.bmc.core.model.LocalPeeringGateway.LifecycleState
                            targetState) {
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
                                return response.getLocalPeeringGateway().getLifecycleState()
                                        == targetState;
                            }
                        },
                        targetState
                                == com.oracle.bmc.core.model.LocalPeeringGateway.LifecycleState
                                        .Terminated),
                request);
    }

    /**
     * Creates a new {@link Waiter} using default configuration.
     *
     * @param request The request to send.
     * @param targetState The desired state to wait for.
     * @return A new Waiter instance.
     */
    public com.oracle.bmc.waiter.Waiter<GetRouteTableRequest, GetRouteTableResponse> forRouteTable(
            GetRouteTableRequest request,
            com.oracle.bmc.core.model.RouteTable.LifecycleState targetState) {
        return forRouteTable(
                com.oracle.bmc.waiter.Waiters.DEFAULT_POLLING_WAITER, request, targetState);
    }

    /**
     * Creates a new {@link Waiter} using the provided configuration.
     *
     * @param request The request to send.
     * @param targetState The desired state to wait for.
     * @param terminationStrategy The {@link TerminationStrategy} to use.
     * @param delayStrategy The {@link DelayStrategy} to use.
     * @return A new Waiter instance.
     */
    public com.oracle.bmc.waiter.Waiter<GetRouteTableRequest, GetRouteTableResponse> forRouteTable(
            GetRouteTableRequest request,
            com.oracle.bmc.core.model.RouteTable.LifecycleState targetState,
            com.oracle.bmc.waiter.TerminationStrategy terminationStrategy,
            com.oracle.bmc.waiter.DelayStrategy delayStrategy) {
        return forRouteTable(
                com.oracle.bmc.waiter.Waiters.newWaiter(terminationStrategy, delayStrategy),
                request,
                targetState);
    }

    // Helper method to create a new Waiter for RouteTable.
    private com.oracle.bmc.waiter.Waiter<GetRouteTableRequest, GetRouteTableResponse> forRouteTable(
            com.oracle.bmc.waiter.BmcGenericWaiter waiter,
            final GetRouteTableRequest request,
            final com.oracle.bmc.core.model.RouteTable.LifecycleState targetState) {
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
                                return response.getRouteTable().getLifecycleState() == targetState;
                            }
                        },
                        targetState
                                == com.oracle.bmc.core.model.RouteTable.LifecycleState.Terminated),
                request);
    }

    /**
     * Creates a new {@link Waiter} using default configuration.
     *
     * @param request The request to send.
     * @param targetState The desired state to wait for.
     * @return A new Waiter instance.
     */
    public com.oracle.bmc.waiter.Waiter<GetSecurityListRequest, GetSecurityListResponse>
            forSecurityList(
                    GetSecurityListRequest request,
                    com.oracle.bmc.core.model.SecurityList.LifecycleState targetState) {
        return forSecurityList(
                com.oracle.bmc.waiter.Waiters.DEFAULT_POLLING_WAITER, request, targetState);
    }

    /**
     * Creates a new {@link Waiter} using the provided configuration.
     *
     * @param request The request to send.
     * @param targetState The desired state to wait for.
     * @param terminationStrategy The {@link TerminationStrategy} to use.
     * @param delayStrategy The {@link DelayStrategy} to use.
     * @return A new Waiter instance.
     */
    public com.oracle.bmc.waiter.Waiter<GetSecurityListRequest, GetSecurityListResponse>
            forSecurityList(
                    GetSecurityListRequest request,
                    com.oracle.bmc.core.model.SecurityList.LifecycleState targetState,
                    com.oracle.bmc.waiter.TerminationStrategy terminationStrategy,
                    com.oracle.bmc.waiter.DelayStrategy delayStrategy) {
        return forSecurityList(
                com.oracle.bmc.waiter.Waiters.newWaiter(terminationStrategy, delayStrategy),
                request,
                targetState);
    }

    // Helper method to create a new Waiter for SecurityList.
    private com.oracle.bmc.waiter.Waiter<GetSecurityListRequest, GetSecurityListResponse>
            forSecurityList(
                    com.oracle.bmc.waiter.BmcGenericWaiter waiter,
                    final GetSecurityListRequest request,
                    final com.oracle.bmc.core.model.SecurityList.LifecycleState targetState) {
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
                                return response.getSecurityList().getLifecycleState()
                                        == targetState;
                            }
                        },
                        targetState
                                == com.oracle.bmc.core.model.SecurityList.LifecycleState
                                        .Terminated),
                request);
    }

    /**
     * Creates a new {@link Waiter} using default configuration.
     *
     * @param request The request to send.
     * @param targetState The desired state to wait for.
     * @return A new Waiter instance.
     */
    public com.oracle.bmc.waiter.Waiter<GetSubnetRequest, GetSubnetResponse> forSubnet(
            GetSubnetRequest request, com.oracle.bmc.core.model.Subnet.LifecycleState targetState) {
        return forSubnet(
                com.oracle.bmc.waiter.Waiters.DEFAULT_POLLING_WAITER, request, targetState);
    }

    /**
     * Creates a new {@link Waiter} using the provided configuration.
     *
     * @param request The request to send.
     * @param targetState The desired state to wait for.
     * @param terminationStrategy The {@link TerminationStrategy} to use.
     * @param delayStrategy The {@link DelayStrategy} to use.
     * @return A new Waiter instance.
     */
    public com.oracle.bmc.waiter.Waiter<GetSubnetRequest, GetSubnetResponse> forSubnet(
            GetSubnetRequest request,
            com.oracle.bmc.core.model.Subnet.LifecycleState targetState,
            com.oracle.bmc.waiter.TerminationStrategy terminationStrategy,
            com.oracle.bmc.waiter.DelayStrategy delayStrategy) {
        return forSubnet(
                com.oracle.bmc.waiter.Waiters.newWaiter(terminationStrategy, delayStrategy),
                request,
                targetState);
    }

    // Helper method to create a new Waiter for Subnet.
    private com.oracle.bmc.waiter.Waiter<GetSubnetRequest, GetSubnetResponse> forSubnet(
            com.oracle.bmc.waiter.BmcGenericWaiter waiter,
            final GetSubnetRequest request,
            final com.oracle.bmc.core.model.Subnet.LifecycleState targetState) {
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
                                return response.getSubnet().getLifecycleState() == targetState;
                            }
                        },
                        targetState == com.oracle.bmc.core.model.Subnet.LifecycleState.Terminated),
                request);
    }

    /**
     * Creates a new {@link Waiter} using default configuration.
     *
     * @param request The request to send.
     * @param targetState The desired state to wait for.
     * @return A new Waiter instance.
     */
    public com.oracle.bmc.waiter.Waiter<GetVcnRequest, GetVcnResponse> forVcn(
            GetVcnRequest request, com.oracle.bmc.core.model.Vcn.LifecycleState targetState) {
        return forVcn(com.oracle.bmc.waiter.Waiters.DEFAULT_POLLING_WAITER, request, targetState);
    }

    /**
     * Creates a new {@link Waiter} using the provided configuration.
     *
     * @param request The request to send.
     * @param targetState The desired state to wait for.
     * @param terminationStrategy The {@link TerminationStrategy} to use.
     * @param delayStrategy The {@link DelayStrategy} to use.
     * @return A new Waiter instance.
     */
    public com.oracle.bmc.waiter.Waiter<GetVcnRequest, GetVcnResponse> forVcn(
            GetVcnRequest request,
            com.oracle.bmc.core.model.Vcn.LifecycleState targetState,
            com.oracle.bmc.waiter.TerminationStrategy terminationStrategy,
            com.oracle.bmc.waiter.DelayStrategy delayStrategy) {
        return forVcn(
                com.oracle.bmc.waiter.Waiters.newWaiter(terminationStrategy, delayStrategy),
                request,
                targetState);
    }

    // Helper method to create a new Waiter for Vcn.
    private com.oracle.bmc.waiter.Waiter<GetVcnRequest, GetVcnResponse> forVcn(
            com.oracle.bmc.waiter.BmcGenericWaiter waiter,
            final GetVcnRequest request,
            final com.oracle.bmc.core.model.Vcn.LifecycleState targetState) {
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
                                return response.getVcn().getLifecycleState() == targetState;
                            }
                        },
                        targetState == com.oracle.bmc.core.model.Vcn.LifecycleState.Terminated),
                request);
    }

    /**
     * Creates a new {@link Waiter} using default configuration.
     *
     * @param request The request to send.
     * @param targetState The desired state to wait for.
     * @return A new Waiter instance.
     */
    public com.oracle.bmc.waiter.Waiter<GetVirtualCircuitRequest, GetVirtualCircuitResponse>
            forVirtualCircuit(
                    GetVirtualCircuitRequest request,
                    com.oracle.bmc.core.model.VirtualCircuit.LifecycleState targetState) {
        return forVirtualCircuit(
                com.oracle.bmc.waiter.Waiters.DEFAULT_POLLING_WAITER, request, targetState);
    }

    /**
     * Creates a new {@link Waiter} using the provided configuration.
     *
     * @param request The request to send.
     * @param targetState The desired state to wait for.
     * @param terminationStrategy The {@link TerminationStrategy} to use.
     * @param delayStrategy The {@link DelayStrategy} to use.
     * @return A new Waiter instance.
     */
    public com.oracle.bmc.waiter.Waiter<GetVirtualCircuitRequest, GetVirtualCircuitResponse>
            forVirtualCircuit(
                    GetVirtualCircuitRequest request,
                    com.oracle.bmc.core.model.VirtualCircuit.LifecycleState targetState,
                    com.oracle.bmc.waiter.TerminationStrategy terminationStrategy,
                    com.oracle.bmc.waiter.DelayStrategy delayStrategy) {
        return forVirtualCircuit(
                com.oracle.bmc.waiter.Waiters.newWaiter(terminationStrategy, delayStrategy),
                request,
                targetState);
    }

    // Helper method to create a new Waiter for VirtualCircuit.
    private com.oracle.bmc.waiter.Waiter<GetVirtualCircuitRequest, GetVirtualCircuitResponse>
            forVirtualCircuit(
                    com.oracle.bmc.waiter.BmcGenericWaiter waiter,
                    final GetVirtualCircuitRequest request,
                    final com.oracle.bmc.core.model.VirtualCircuit.LifecycleState targetState) {
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
                                return response.getVirtualCircuit().getLifecycleState()
                                        == targetState;
                            }
                        },
                        targetState
                                == com.oracle.bmc.core.model.VirtualCircuit.LifecycleState
                                        .Terminated),
                request);
    }

    /**
     * Creates a new {@link Waiter} using default configuration.
     *
     * @param request The request to send.
     * @param targetState The desired state to wait for.
     * @return A new Waiter instance.
     */
    public com.oracle.bmc.waiter.Waiter<GetVnicRequest, GetVnicResponse> forVnic(
            GetVnicRequest request, com.oracle.bmc.core.model.Vnic.LifecycleState targetState) {
        return forVnic(com.oracle.bmc.waiter.Waiters.DEFAULT_POLLING_WAITER, request, targetState);
    }

    /**
     * Creates a new {@link Waiter} using the provided configuration.
     *
     * @param request The request to send.
     * @param targetState The desired state to wait for.
     * @param terminationStrategy The {@link TerminationStrategy} to use.
     * @param delayStrategy The {@link DelayStrategy} to use.
     * @return A new Waiter instance.
     */
    public com.oracle.bmc.waiter.Waiter<GetVnicRequest, GetVnicResponse> forVnic(
            GetVnicRequest request,
            com.oracle.bmc.core.model.Vnic.LifecycleState targetState,
            com.oracle.bmc.waiter.TerminationStrategy terminationStrategy,
            com.oracle.bmc.waiter.DelayStrategy delayStrategy) {
        return forVnic(
                com.oracle.bmc.waiter.Waiters.newWaiter(terminationStrategy, delayStrategy),
                request,
                targetState);
    }

    // Helper method to create a new Waiter for Vnic.
    private com.oracle.bmc.waiter.Waiter<GetVnicRequest, GetVnicResponse> forVnic(
            com.oracle.bmc.waiter.BmcGenericWaiter waiter,
            final GetVnicRequest request,
            final com.oracle.bmc.core.model.Vnic.LifecycleState targetState) {
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
                                return response.getVnic().getLifecycleState() == targetState;
                            }
                        },
                        targetState == com.oracle.bmc.core.model.Vnic.LifecycleState.Terminated),
                request);
    }
}
