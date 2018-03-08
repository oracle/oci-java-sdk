/**
 * Copyright (c) 2016, 2018, Oracle and/or its affiliates. All rights reserved.
 */
package com.oracle.bmc.dns;

import com.oracle.bmc.dns.requests.*;
import com.oracle.bmc.dns.responses.*;

/**
 * Collection of helper methods to produce {@link Waiter}s for different
 * resources of Dns.
 * <p>
 * The default configuration used is defined by {@link Waiters#DEFAULT_POLLING_WAITER}.
 */
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20180115")
@lombok.RequiredArgsConstructor
public class DnsWaiters {
    private final java.util.concurrent.ExecutorService executorService;
    private final Dns client;

    /**
     * Creates a new {@link Waiter} using default configuration.
     *
     * @param request the request to send
     * @param targetState the desired state to wait for
     * @return a new {@code Waiter} instance
     */
    public com.oracle.bmc.waiter.Waiter<GetZoneRequest, GetZoneResponse> forZone(
            GetZoneRequest request, com.oracle.bmc.dns.model.Zone.LifecycleState targetState) {
        return forZone(com.oracle.bmc.waiter.Waiters.DEFAULT_POLLING_WAITER, request, targetState);
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
    public com.oracle.bmc.waiter.Waiter<GetZoneRequest, GetZoneResponse> forZone(
            GetZoneRequest request,
            com.oracle.bmc.dns.model.Zone.LifecycleState targetState,
            com.oracle.bmc.waiter.TerminationStrategy terminationStrategy,
            com.oracle.bmc.waiter.DelayStrategy delayStrategy) {
        return forZone(
                com.oracle.bmc.waiter.Waiters.newWaiter(terminationStrategy, delayStrategy),
                request,
                targetState);
    }

    // Helper method to create a new Waiter for Zone.
    private com.oracle.bmc.waiter.Waiter<GetZoneRequest, GetZoneResponse> forZone(
            com.oracle.bmc.waiter.BmcGenericWaiter waiter,
            final GetZoneRequest request,
            final com.oracle.bmc.dns.model.Zone.LifecycleState targetState) {
        return new com.oracle.bmc.waiter.internal.SimpleWaiterImpl<>(
                executorService,
                waiter.toCallable(
                        com.google.common.base.Suppliers.ofInstance(request),
                        new com.google.common.base.Function<GetZoneRequest, GetZoneResponse>() {
                            @Override
                            public GetZoneResponse apply(GetZoneRequest request) {
                                return client.getZone(request);
                            }
                        },
                        new com.google.common.base.Predicate<GetZoneResponse>() {
                            @Override
                            public boolean apply(GetZoneResponse response) {
                                return response.getZone().getLifecycleState() == targetState;
                            }
                        },
                        targetState == com.oracle.bmc.dns.model.Zone.LifecycleState.Deleted),
                request);
    }
}
