/**
 * Copyright (c) 2016, 2019, Oracle and/or its affiliates. All rights reserved.
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
     * @param targetStates the desired states to wait for. If multiple states are provided then the waiter will return once the resource reaches any of the provided states
     * @return a new {@code Waiter} instance
     */
    public com.oracle.bmc.waiter.Waiter<GetZoneRequest, GetZoneResponse> forZone(
            GetZoneRequest request, com.oracle.bmc.dns.model.Zone.LifecycleState... targetStates) {
        org.apache.commons.lang3.Validate.notEmpty(
                targetStates, "At least one targetState must be provided");
        org.apache.commons.lang3.Validate.noNullElements(
                targetStates, "Null targetState values are not permitted");

        return forZone(com.oracle.bmc.waiter.Waiters.DEFAULT_POLLING_WAITER, request, targetStates);
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
        org.apache.commons.lang3.Validate.notNull(targetState, "The targetState cannot be null");

        return forZone(
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
    public com.oracle.bmc.waiter.Waiter<GetZoneRequest, GetZoneResponse> forZone(
            GetZoneRequest request,
            com.oracle.bmc.waiter.TerminationStrategy terminationStrategy,
            com.oracle.bmc.waiter.DelayStrategy delayStrategy,
            com.oracle.bmc.dns.model.Zone.LifecycleState... targetStates) {
        org.apache.commons.lang3.Validate.notEmpty(
                targetStates, "At least one target state must be provided");
        org.apache.commons.lang3.Validate.noNullElements(
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
                                return targetStatesSet.contains(
                                        response.getZone().getLifecycleState());
                            }
                        },
                        targetStatesSet.contains(
                                com.oracle.bmc.dns.model.Zone.LifecycleState.Deleted)),
                request);
    }
}
