/**
 * Copyright (c) 2016, 2021, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.ons;

import com.oracle.bmc.ons.requests.*;
import com.oracle.bmc.ons.responses.*;

/**
 * Collection of helper methods to produce {@link com.oracle.bmc.waiter.Waiter}s for different
 * resources of NotificationDataPlane.
 * <p>
 * The default configuration used is defined by {@link com.oracle.bmc.waiter.Waiters.Waiters#DEFAULT_POLLING_WAITER}.
 */
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20181201")
@lombok.RequiredArgsConstructor
public class NotificationDataPlaneWaiters {
    private final java.util.concurrent.ExecutorService executorService;
    private final NotificationDataPlane client;

    /**
     * Creates a new {@link com.oracle.bmc.waiter.Waiter} using the default configuration.
     *
     * @param request the request to send
     * @param targetStates the desired states to wait for. If multiple states are provided then the waiter will return once the resource reaches any of the provided states
     * @return a new {@code Waiter} instance
     */
    public com.oracle.bmc.waiter.Waiter<GetSubscriptionRequest, GetSubscriptionResponse>
            forSubscription(
                    GetSubscriptionRequest request,
                    com.oracle.bmc.ons.model.Subscription.LifecycleState... targetStates) {
        org.apache.commons.lang3.Validate.notEmpty(
                targetStates, "At least one targetState must be provided");
        org.apache.commons.lang3.Validate.noNullElements(
                targetStates, "Null targetState values are not permitted");

        return forSubscription(
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
    public com.oracle.bmc.waiter.Waiter<GetSubscriptionRequest, GetSubscriptionResponse>
            forSubscription(
                    GetSubscriptionRequest request,
                    com.oracle.bmc.ons.model.Subscription.LifecycleState targetState,
                    com.oracle.bmc.waiter.TerminationStrategy terminationStrategy,
                    com.oracle.bmc.waiter.DelayStrategy delayStrategy) {
        org.apache.commons.lang3.Validate.notNull(targetState, "The targetState cannot be null");

        return forSubscription(
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
    public com.oracle.bmc.waiter.Waiter<GetSubscriptionRequest, GetSubscriptionResponse>
            forSubscription(
                    GetSubscriptionRequest request,
                    com.oracle.bmc.waiter.TerminationStrategy terminationStrategy,
                    com.oracle.bmc.waiter.DelayStrategy delayStrategy,
                    com.oracle.bmc.ons.model.Subscription.LifecycleState... targetStates) {
        org.apache.commons.lang3.Validate.notEmpty(
                targetStates, "At least one target state must be provided");
        org.apache.commons.lang3.Validate.noNullElements(
                targetStates, "Null target states are not permitted");

        return forSubscription(
                com.oracle.bmc.waiter.Waiters.newWaiter(terminationStrategy, delayStrategy),
                request,
                targetStates);
    }

    // Helper method to create a new Waiter for Subscription.
    private com.oracle.bmc.waiter.Waiter<GetSubscriptionRequest, GetSubscriptionResponse>
            forSubscription(
                    com.oracle.bmc.waiter.BmcGenericWaiter waiter,
                    final GetSubscriptionRequest request,
                    final com.oracle.bmc.ons.model.Subscription.LifecycleState... targetStates) {
        final java.util.Set<com.oracle.bmc.ons.model.Subscription.LifecycleState> targetStatesSet =
                new java.util.HashSet<>(java.util.Arrays.asList(targetStates));

        return new com.oracle.bmc.waiter.internal.SimpleWaiterImpl<>(
                executorService,
                waiter.toCallable(
                        com.google.common.base.Suppliers.ofInstance(request),
                        new com.google.common.base.Function<
                                GetSubscriptionRequest, GetSubscriptionResponse>() {
                            @Override
                            public GetSubscriptionResponse apply(GetSubscriptionRequest request) {
                                return client.getSubscription(request);
                            }
                        },
                        new com.google.common.base.Predicate<GetSubscriptionResponse>() {
                            @Override
                            public boolean apply(GetSubscriptionResponse response) {
                                return targetStatesSet.contains(
                                        response.getSubscription().getLifecycleState());
                            }
                        },
                        targetStatesSet.contains(
                                com.oracle.bmc.ons.model.Subscription.LifecycleState.Deleted)),
                request);
    }
}
