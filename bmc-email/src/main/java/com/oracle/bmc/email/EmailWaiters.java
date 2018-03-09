/**
 * Copyright (c) 2016, 2018, Oracle and/or its affiliates. All rights reserved.
 */
package com.oracle.bmc.email;

import com.oracle.bmc.email.requests.*;
import com.oracle.bmc.email.responses.*;

/**
 * Collection of helper methods to produce {@link Waiter}s for different
 * resources of Email.
 * <p>
 * The default configuration used is defined by {@link Waiters#DEFAULT_POLLING_WAITER}.
 */
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20170907")
@lombok.RequiredArgsConstructor
public class EmailWaiters {
    private final java.util.concurrent.ExecutorService executorService;
    private final Email client;

    /**
     * Creates a new {@link Waiter} using default configuration.
     *
     * @param request the request to send
     * @param targetState the desired state to wait for
     * @return a new {@code Waiter} instance
     */
    public com.oracle.bmc.waiter.Waiter<GetSenderRequest, GetSenderResponse> forSender(
            GetSenderRequest request,
            com.oracle.bmc.email.model.Sender.LifecycleState targetState) {
        return forSender(
                com.oracle.bmc.waiter.Waiters.DEFAULT_POLLING_WAITER, request, targetState);
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
    public com.oracle.bmc.waiter.Waiter<GetSenderRequest, GetSenderResponse> forSender(
            GetSenderRequest request,
            com.oracle.bmc.email.model.Sender.LifecycleState targetState,
            com.oracle.bmc.waiter.TerminationStrategy terminationStrategy,
            com.oracle.bmc.waiter.DelayStrategy delayStrategy) {
        return forSender(
                com.oracle.bmc.waiter.Waiters.newWaiter(terminationStrategy, delayStrategy),
                request,
                targetState);
    }

    // Helper method to create a new Waiter for Sender.
    private com.oracle.bmc.waiter.Waiter<GetSenderRequest, GetSenderResponse> forSender(
            com.oracle.bmc.waiter.BmcGenericWaiter waiter,
            final GetSenderRequest request,
            final com.oracle.bmc.email.model.Sender.LifecycleState targetState) {
        return new com.oracle.bmc.waiter.internal.SimpleWaiterImpl<>(
                executorService,
                waiter.toCallable(
                        com.google.common.base.Suppliers.ofInstance(request),
                        new com.google.common.base.Function<GetSenderRequest, GetSenderResponse>() {
                            @Override
                            public GetSenderResponse apply(GetSenderRequest request) {
                                return client.getSender(request);
                            }
                        },
                        new com.google.common.base.Predicate<GetSenderResponse>() {
                            @Override
                            public boolean apply(GetSenderResponse response) {
                                return response.getSender().getLifecycleState() == targetState;
                            }
                        },
                        targetState == com.oracle.bmc.email.model.Sender.LifecycleState.Deleted),
                request);
    }
}
