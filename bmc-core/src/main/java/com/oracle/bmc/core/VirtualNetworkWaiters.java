/**
 * Copyright (c) 2016 Oracle and/or its affiliates. All rights reserved.
 */
package com.oracle.bmc.core;

import com.oracle.bmc.core.model.*;
import com.oracle.bmc.core.requests.*;
import com.oracle.bmc.core.responses.*;

import com.oracle.bmc.waiter.*;
import com.oracle.bmc.waiter.internal.SimpleWaiterImpl;

import java.util.concurrent.ExecutorService;

import com.google.common.base.Function;
import com.google.common.base.Predicate;
import com.google.common.base.Suppliers;

import lombok.RequiredArgsConstructor;

/**
 * Collection of helper methods to produce {@link Waiter}s for different
 * resources of VirtualNetwork.
 * <p>
 * The default configuration used is defined by {@link Waiters#DEFAULT_POLLING_WAITER}.
 */
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20160918")
@RequiredArgsConstructor
public class VirtualNetworkWaiters {
    private final ExecutorService executorService;
    private final VirtualNetwork client;

    /**
     * Creates a new {@link Waiter} using default configuration.
     *
     * @param request The request to send.
     * @param targetState The desired state to wait for.
     * @return A new Waiter instance.
     */
    public Waiter<GetDhcpOptionsRequest, GetDhcpOptionsResponse> forDhcpOptions(
            GetDhcpOptionsRequest request, DhcpOptions.LifecycleState targetState) {
        return forDhcpOptions(Waiters.DEFAULT_POLLING_WAITER, request, targetState);
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
    public Waiter<GetDhcpOptionsRequest, GetDhcpOptionsResponse> forDhcpOptions(
            GetDhcpOptionsRequest request,
            DhcpOptions.LifecycleState targetState,
            TerminationStrategy terminationStrategy,
            DelayStrategy delayStrategy) {
        return forDhcpOptions(
                Waiters.newWaiter(terminationStrategy, delayStrategy), request, targetState);
    }

    // Helper method to create a new Waiter for DhcpOptions.
    private Waiter<GetDhcpOptionsRequest, GetDhcpOptionsResponse> forDhcpOptions(
            BmcGenericWaiter waiter,
            final GetDhcpOptionsRequest request,
            final DhcpOptions.LifecycleState targetState) {
        return new SimpleWaiterImpl<>(
                executorService,
                waiter.toCallable(
                        Suppliers.ofInstance(request),
                        new Function<GetDhcpOptionsRequest, GetDhcpOptionsResponse>() {
                            @Override
                            public GetDhcpOptionsResponse apply(GetDhcpOptionsRequest request) {
                                return client.getDhcpOptions(request);
                            }
                        },
                        new Predicate<GetDhcpOptionsResponse>() {
                            @Override
                            public boolean apply(GetDhcpOptionsResponse response) {
                                return response.getDhcpOptions().getLifecycleState() == targetState;
                            }
                        },
                        targetState == DhcpOptions.LifecycleState.Terminated),
                request);
    }

    /**
     * Creates a new {@link Waiter} using default configuration.
     *
     * @param request The request to send.
     * @param targetState The desired state to wait for.
     * @return A new Waiter instance.
     */
    public Waiter<GetDrgRequest, GetDrgResponse> forDrg(
            GetDrgRequest request, Drg.LifecycleState targetState) {
        return forDrg(Waiters.DEFAULT_POLLING_WAITER, request, targetState);
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
    public Waiter<GetDrgRequest, GetDrgResponse> forDrg(
            GetDrgRequest request,
            Drg.LifecycleState targetState,
            TerminationStrategy terminationStrategy,
            DelayStrategy delayStrategy) {
        return forDrg(Waiters.newWaiter(terminationStrategy, delayStrategy), request, targetState);
    }

    // Helper method to create a new Waiter for Drg.
    private Waiter<GetDrgRequest, GetDrgResponse> forDrg(
            BmcGenericWaiter waiter,
            final GetDrgRequest request,
            final Drg.LifecycleState targetState) {
        return new SimpleWaiterImpl<>(
                executorService,
                waiter.toCallable(
                        Suppliers.ofInstance(request),
                        new Function<GetDrgRequest, GetDrgResponse>() {
                            @Override
                            public GetDrgResponse apply(GetDrgRequest request) {
                                return client.getDrg(request);
                            }
                        },
                        new Predicate<GetDrgResponse>() {
                            @Override
                            public boolean apply(GetDrgResponse response) {
                                return response.getDrg().getLifecycleState() == targetState;
                            }
                        },
                        targetState == Drg.LifecycleState.Terminated),
                request);
    }

    /**
     * Creates a new {@link Waiter} using default configuration.
     *
     * @param request The request to send.
     * @param targetState The desired state to wait for.
     * @return A new Waiter instance.
     */
    public Waiter<GetDrgAttachmentRequest, GetDrgAttachmentResponse> forDrgAttachment(
            GetDrgAttachmentRequest request, DrgAttachment.LifecycleState targetState) {
        return forDrgAttachment(Waiters.DEFAULT_POLLING_WAITER, request, targetState);
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
    public Waiter<GetDrgAttachmentRequest, GetDrgAttachmentResponse> forDrgAttachment(
            GetDrgAttachmentRequest request,
            DrgAttachment.LifecycleState targetState,
            TerminationStrategy terminationStrategy,
            DelayStrategy delayStrategy) {
        return forDrgAttachment(
                Waiters.newWaiter(terminationStrategy, delayStrategy), request, targetState);
    }

    // Helper method to create a new Waiter for DrgAttachment.
    private Waiter<GetDrgAttachmentRequest, GetDrgAttachmentResponse> forDrgAttachment(
            BmcGenericWaiter waiter,
            final GetDrgAttachmentRequest request,
            final DrgAttachment.LifecycleState targetState) {
        return new SimpleWaiterImpl<>(
                executorService,
                waiter.toCallable(
                        Suppliers.ofInstance(request),
                        new Function<GetDrgAttachmentRequest, GetDrgAttachmentResponse>() {
                            @Override
                            public GetDrgAttachmentResponse apply(GetDrgAttachmentRequest request) {
                                return client.getDrgAttachment(request);
                            }
                        },
                        new Predicate<GetDrgAttachmentResponse>() {
                            @Override
                            public boolean apply(GetDrgAttachmentResponse response) {
                                return response.getDrgAttachment().getLifecycleState()
                                        == targetState;
                            }
                        },
                        targetState == DrgAttachment.LifecycleState.Detached),
                request);
    }

    /**
     * Creates a new {@link Waiter} using default configuration.
     *
     * @param request The request to send.
     * @param targetState The desired state to wait for.
     * @return A new Waiter instance.
     */
    public Waiter<GetIPSecConnectionRequest, GetIPSecConnectionResponse> forIPSecConnection(
            GetIPSecConnectionRequest request, IPSecConnection.LifecycleState targetState) {
        return forIPSecConnection(Waiters.DEFAULT_POLLING_WAITER, request, targetState);
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
    public Waiter<GetIPSecConnectionRequest, GetIPSecConnectionResponse> forIPSecConnection(
            GetIPSecConnectionRequest request,
            IPSecConnection.LifecycleState targetState,
            TerminationStrategy terminationStrategy,
            DelayStrategy delayStrategy) {
        return forIPSecConnection(
                Waiters.newWaiter(terminationStrategy, delayStrategy), request, targetState);
    }

    // Helper method to create a new Waiter for IPSecConnection.
    private Waiter<GetIPSecConnectionRequest, GetIPSecConnectionResponse> forIPSecConnection(
            BmcGenericWaiter waiter,
            final GetIPSecConnectionRequest request,
            final IPSecConnection.LifecycleState targetState) {
        return new SimpleWaiterImpl<>(
                executorService,
                waiter.toCallable(
                        Suppliers.ofInstance(request),
                        new Function<GetIPSecConnectionRequest, GetIPSecConnectionResponse>() {
                            @Override
                            public GetIPSecConnectionResponse apply(
                                    GetIPSecConnectionRequest request) {
                                return client.getIPSecConnection(request);
                            }
                        },
                        new Predicate<GetIPSecConnectionResponse>() {
                            @Override
                            public boolean apply(GetIPSecConnectionResponse response) {
                                return response.getIPSecConnection().getLifecycleState()
                                        == targetState;
                            }
                        },
                        targetState == IPSecConnection.LifecycleState.Terminated),
                request);
    }

    /**
     * Creates a new {@link Waiter} using default configuration.
     *
     * @param request The request to send.
     * @param targetState The desired state to wait for.
     * @return A new Waiter instance.
     */
    public Waiter<GetInternetGatewayRequest, GetInternetGatewayResponse> forInternetGateway(
            GetInternetGatewayRequest request, InternetGateway.LifecycleState targetState) {
        return forInternetGateway(Waiters.DEFAULT_POLLING_WAITER, request, targetState);
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
    public Waiter<GetInternetGatewayRequest, GetInternetGatewayResponse> forInternetGateway(
            GetInternetGatewayRequest request,
            InternetGateway.LifecycleState targetState,
            TerminationStrategy terminationStrategy,
            DelayStrategy delayStrategy) {
        return forInternetGateway(
                Waiters.newWaiter(terminationStrategy, delayStrategy), request, targetState);
    }

    // Helper method to create a new Waiter for InternetGateway.
    private Waiter<GetInternetGatewayRequest, GetInternetGatewayResponse> forInternetGateway(
            BmcGenericWaiter waiter,
            final GetInternetGatewayRequest request,
            final InternetGateway.LifecycleState targetState) {
        return new SimpleWaiterImpl<>(
                executorService,
                waiter.toCallable(
                        Suppliers.ofInstance(request),
                        new Function<GetInternetGatewayRequest, GetInternetGatewayResponse>() {
                            @Override
                            public GetInternetGatewayResponse apply(
                                    GetInternetGatewayRequest request) {
                                return client.getInternetGateway(request);
                            }
                        },
                        new Predicate<GetInternetGatewayResponse>() {
                            @Override
                            public boolean apply(GetInternetGatewayResponse response) {
                                return response.getInternetGateway().getLifecycleState()
                                        == targetState;
                            }
                        },
                        targetState == InternetGateway.LifecycleState.Terminated),
                request);
    }

    /**
     * Creates a new {@link Waiter} using default configuration.
     *
     * @param request The request to send.
     * @param targetState The desired state to wait for.
     * @return A new Waiter instance.
     */
    public Waiter<GetRouteTableRequest, GetRouteTableResponse> forRouteTable(
            GetRouteTableRequest request, RouteTable.LifecycleState targetState) {
        return forRouteTable(Waiters.DEFAULT_POLLING_WAITER, request, targetState);
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
    public Waiter<GetRouteTableRequest, GetRouteTableResponse> forRouteTable(
            GetRouteTableRequest request,
            RouteTable.LifecycleState targetState,
            TerminationStrategy terminationStrategy,
            DelayStrategy delayStrategy) {
        return forRouteTable(
                Waiters.newWaiter(terminationStrategy, delayStrategy), request, targetState);
    }

    // Helper method to create a new Waiter for RouteTable.
    private Waiter<GetRouteTableRequest, GetRouteTableResponse> forRouteTable(
            BmcGenericWaiter waiter,
            final GetRouteTableRequest request,
            final RouteTable.LifecycleState targetState) {
        return new SimpleWaiterImpl<>(
                executorService,
                waiter.toCallable(
                        Suppliers.ofInstance(request),
                        new Function<GetRouteTableRequest, GetRouteTableResponse>() {
                            @Override
                            public GetRouteTableResponse apply(GetRouteTableRequest request) {
                                return client.getRouteTable(request);
                            }
                        },
                        new Predicate<GetRouteTableResponse>() {
                            @Override
                            public boolean apply(GetRouteTableResponse response) {
                                return response.getRouteTable().getLifecycleState() == targetState;
                            }
                        },
                        targetState == RouteTable.LifecycleState.Terminated),
                request);
    }

    /**
     * Creates a new {@link Waiter} using default configuration.
     *
     * @param request The request to send.
     * @param targetState The desired state to wait for.
     * @return A new Waiter instance.
     */
    public Waiter<GetSecurityListRequest, GetSecurityListResponse> forSecurityList(
            GetSecurityListRequest request, SecurityList.LifecycleState targetState) {
        return forSecurityList(Waiters.DEFAULT_POLLING_WAITER, request, targetState);
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
    public Waiter<GetSecurityListRequest, GetSecurityListResponse> forSecurityList(
            GetSecurityListRequest request,
            SecurityList.LifecycleState targetState,
            TerminationStrategy terminationStrategy,
            DelayStrategy delayStrategy) {
        return forSecurityList(
                Waiters.newWaiter(terminationStrategy, delayStrategy), request, targetState);
    }

    // Helper method to create a new Waiter for SecurityList.
    private Waiter<GetSecurityListRequest, GetSecurityListResponse> forSecurityList(
            BmcGenericWaiter waiter,
            final GetSecurityListRequest request,
            final SecurityList.LifecycleState targetState) {
        return new SimpleWaiterImpl<>(
                executorService,
                waiter.toCallable(
                        Suppliers.ofInstance(request),
                        new Function<GetSecurityListRequest, GetSecurityListResponse>() {
                            @Override
                            public GetSecurityListResponse apply(GetSecurityListRequest request) {
                                return client.getSecurityList(request);
                            }
                        },
                        new Predicate<GetSecurityListResponse>() {
                            @Override
                            public boolean apply(GetSecurityListResponse response) {
                                return response.getSecurityList().getLifecycleState()
                                        == targetState;
                            }
                        },
                        targetState == SecurityList.LifecycleState.Terminated),
                request);
    }

    /**
     * Creates a new {@link Waiter} using default configuration.
     *
     * @param request The request to send.
     * @param targetState The desired state to wait for.
     * @return A new Waiter instance.
     */
    public Waiter<GetSubnetRequest, GetSubnetResponse> forSubnet(
            GetSubnetRequest request, Subnet.LifecycleState targetState) {
        return forSubnet(Waiters.DEFAULT_POLLING_WAITER, request, targetState);
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
    public Waiter<GetSubnetRequest, GetSubnetResponse> forSubnet(
            GetSubnetRequest request,
            Subnet.LifecycleState targetState,
            TerminationStrategy terminationStrategy,
            DelayStrategy delayStrategy) {
        return forSubnet(
                Waiters.newWaiter(terminationStrategy, delayStrategy), request, targetState);
    }

    // Helper method to create a new Waiter for Subnet.
    private Waiter<GetSubnetRequest, GetSubnetResponse> forSubnet(
            BmcGenericWaiter waiter,
            final GetSubnetRequest request,
            final Subnet.LifecycleState targetState) {
        return new SimpleWaiterImpl<>(
                executorService,
                waiter.toCallable(
                        Suppliers.ofInstance(request),
                        new Function<GetSubnetRequest, GetSubnetResponse>() {
                            @Override
                            public GetSubnetResponse apply(GetSubnetRequest request) {
                                return client.getSubnet(request);
                            }
                        },
                        new Predicate<GetSubnetResponse>() {
                            @Override
                            public boolean apply(GetSubnetResponse response) {
                                return response.getSubnet().getLifecycleState() == targetState;
                            }
                        },
                        targetState == Subnet.LifecycleState.Terminated),
                request);
    }

    /**
     * Creates a new {@link Waiter} using default configuration.
     *
     * @param request The request to send.
     * @param targetState The desired state to wait for.
     * @return A new Waiter instance.
     */
    public Waiter<GetVcnRequest, GetVcnResponse> forVcn(
            GetVcnRequest request, Vcn.LifecycleState targetState) {
        return forVcn(Waiters.DEFAULT_POLLING_WAITER, request, targetState);
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
    public Waiter<GetVcnRequest, GetVcnResponse> forVcn(
            GetVcnRequest request,
            Vcn.LifecycleState targetState,
            TerminationStrategy terminationStrategy,
            DelayStrategy delayStrategy) {
        return forVcn(Waiters.newWaiter(terminationStrategy, delayStrategy), request, targetState);
    }

    // Helper method to create a new Waiter for Vcn.
    private Waiter<GetVcnRequest, GetVcnResponse> forVcn(
            BmcGenericWaiter waiter,
            final GetVcnRequest request,
            final Vcn.LifecycleState targetState) {
        return new SimpleWaiterImpl<>(
                executorService,
                waiter.toCallable(
                        Suppliers.ofInstance(request),
                        new Function<GetVcnRequest, GetVcnResponse>() {
                            @Override
                            public GetVcnResponse apply(GetVcnRequest request) {
                                return client.getVcn(request);
                            }
                        },
                        new Predicate<GetVcnResponse>() {
                            @Override
                            public boolean apply(GetVcnResponse response) {
                                return response.getVcn().getLifecycleState() == targetState;
                            }
                        },
                        targetState == Vcn.LifecycleState.Terminated),
                request);
    }

    /**
     * Creates a new {@link Waiter} using default configuration.
     *
     * @param request The request to send.
     * @param targetState The desired state to wait for.
     * @return A new Waiter instance.
     */
    public Waiter<GetVnicRequest, GetVnicResponse> forVnic(
            GetVnicRequest request, Vnic.LifecycleState targetState) {
        return forVnic(Waiters.DEFAULT_POLLING_WAITER, request, targetState);
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
    public Waiter<GetVnicRequest, GetVnicResponse> forVnic(
            GetVnicRequest request,
            Vnic.LifecycleState targetState,
            TerminationStrategy terminationStrategy,
            DelayStrategy delayStrategy) {
        return forVnic(Waiters.newWaiter(terminationStrategy, delayStrategy), request, targetState);
    }

    // Helper method to create a new Waiter for Vnic.
    private Waiter<GetVnicRequest, GetVnicResponse> forVnic(
            BmcGenericWaiter waiter,
            final GetVnicRequest request,
            final Vnic.LifecycleState targetState) {
        return new SimpleWaiterImpl<>(
                executorService,
                waiter.toCallable(
                        Suppliers.ofInstance(request),
                        new Function<GetVnicRequest, GetVnicResponse>() {
                            @Override
                            public GetVnicResponse apply(GetVnicRequest request) {
                                return client.getVnic(request);
                            }
                        },
                        new Predicate<GetVnicResponse>() {
                            @Override
                            public boolean apply(GetVnicResponse response) {
                                return response.getVnic().getLifecycleState() == targetState;
                            }
                        },
                        targetState == Vnic.LifecycleState.Terminated),
                request);
    }
}
