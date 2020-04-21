/**
 * Copyright (c) 2016, 2020, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.waas;

import com.oracle.bmc.waas.requests.*;
import com.oracle.bmc.waas.responses.*;

/**
 * Collection of helper methods to produce {@link com.oracle.bmc.waiter.Waiter}s for different
 * resources of Redirect.
 * <p>
 * The default configuration used is defined by {@link com.oracle.bmc.waiter.Waiters.Waiters#DEFAULT_POLLING_WAITER}.
 */
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20181116")
@lombok.RequiredArgsConstructor
public class RedirectWaiters {
    private final java.util.concurrent.ExecutorService executorService;
    private final Redirect client;

    /**
     * Creates a new {@link com.oracle.bmc.waiter.Waiter} using the default configuration.
     *
     * @param request the request to send
     * @param targetState the desired states to wait for. If multiple states are provided then the waiter will return once the resource reaches any of the provided states
     * @return a new {@code com.oracle.bmc.waiter.Waiter} instance
     */
    public com.oracle.bmc.waiter.Waiter<GetHttpRedirectRequest, GetHttpRedirectResponse>
            forHttpRedirect(
                    GetHttpRedirectRequest request,
                    com.oracle.bmc.waas.model.LifecycleStates... targetStates) {
        org.apache.commons.lang3.Validate.notEmpty(
                targetStates, "At least one targetState must be provided");
        org.apache.commons.lang3.Validate.noNullElements(
                targetStates, "Null targetState values are not permitted");

        return forHttpRedirect(
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
    public com.oracle.bmc.waiter.Waiter<GetHttpRedirectRequest, GetHttpRedirectResponse>
            forHttpRedirect(
                    GetHttpRedirectRequest request,
                    com.oracle.bmc.waas.model.LifecycleStates targetState,
                    com.oracle.bmc.waiter.TerminationStrategy terminationStrategy,
                    com.oracle.bmc.waiter.DelayStrategy delayStrategy) {
        org.apache.commons.lang3.Validate.notNull(targetState, "The targetState cannot be null");

        return forHttpRedirect(
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
     * @return a new {@code Waiter} instance
     */
    public com.oracle.bmc.waiter.Waiter<GetHttpRedirectRequest, GetHttpRedirectResponse>
            forHttpRedirect(
                    GetHttpRedirectRequest request,
                    com.oracle.bmc.waiter.TerminationStrategy terminationStrategy,
                    com.oracle.bmc.waiter.DelayStrategy delayStrategy,
                    com.oracle.bmc.waas.model.LifecycleStates... targetStates) {
        org.apache.commons.lang3.Validate.notEmpty(
                targetStates, "At least one targetState must be provided");
        org.apache.commons.lang3.Validate.noNullElements(
                targetStates, "Null targetState values are not permitted");

        return forHttpRedirect(
                com.oracle.bmc.waiter.Waiters.newWaiter(terminationStrategy, delayStrategy),
                request,
                targetStates);
    }

    // Helper method to create a new Waiter for HttpRedirect.
    private com.oracle.bmc.waiter.Waiter<GetHttpRedirectRequest, GetHttpRedirectResponse>
            forHttpRedirect(
                    com.oracle.bmc.waiter.BmcGenericWaiter waiter,
                    final GetHttpRedirectRequest request,
                    final com.oracle.bmc.waas.model.LifecycleStates... targetStates) {
        final java.util.Set<com.oracle.bmc.waas.model.LifecycleStates> targetStatesSet =
                new java.util.HashSet<>(java.util.Arrays.asList(targetStates));

        return new com.oracle.bmc.waiter.internal.SimpleWaiterImpl<>(
                executorService,
                waiter.toCallable(
                        com.google.common.base.Suppliers.ofInstance(request),
                        new com.google.common.base.Function<
                                GetHttpRedirectRequest, GetHttpRedirectResponse>() {
                            @Override
                            public GetHttpRedirectResponse apply(GetHttpRedirectRequest request) {
                                return client.getHttpRedirect(request);
                            }
                        },
                        new com.google.common.base.Predicate<GetHttpRedirectResponse>() {
                            @Override
                            public boolean apply(GetHttpRedirectResponse response) {
                                return targetStatesSet.contains(
                                        response.getHttpRedirect().getLifecycleState());
                            }
                        },
                        targetStatesSet.contains(
                                com.oracle.bmc.waas.model.LifecycleStates.Deleted)),
                request);
    }
}
