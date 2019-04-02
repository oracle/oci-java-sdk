/**
 * Copyright (c) 2016, 2019, Oracle and/or its affiliates. All rights reserved.
 */
package com.oracle.bmc.keymanagement;

import com.oracle.bmc.keymanagement.requests.*;
import com.oracle.bmc.keymanagement.responses.*;

/**
 * Collection of helper methods to produce {@link Waiter}s for different
 * resources of KmsManagement.
 * <p>
 * The default configuration used is defined by {@link Waiters#DEFAULT_POLLING_WAITER}.
 */
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: release")
@lombok.RequiredArgsConstructor
public class KmsManagementWaiters {
    private final java.util.concurrent.ExecutorService executorService;
    private final KmsManagement client;

    /**
     * Creates a new {@link Waiter} using default configuration.
     *
     * @param request the request to send
     * @param targetStates the desired states to wait for. If multiple states are provided then the waiter will return once the resource reaches any of the provided states
     * @return a new {@code Waiter} instance
     */
    public com.oracle.bmc.waiter.Waiter<GetKeyRequest, GetKeyResponse> forKey(
            GetKeyRequest request,
            com.oracle.bmc.keymanagement.model.Key.LifecycleState... targetStates) {
        org.apache.commons.lang3.Validate.notEmpty(
                targetStates, "At least one targetState must be provided");
        org.apache.commons.lang3.Validate.noNullElements(
                targetStates, "Null targetState values are not permitted");

        return forKey(com.oracle.bmc.waiter.Waiters.DEFAULT_POLLING_WAITER, request, targetStates);
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
    public com.oracle.bmc.waiter.Waiter<GetKeyRequest, GetKeyResponse> forKey(
            GetKeyRequest request,
            com.oracle.bmc.keymanagement.model.Key.LifecycleState targetState,
            com.oracle.bmc.waiter.TerminationStrategy terminationStrategy,
            com.oracle.bmc.waiter.DelayStrategy delayStrategy) {
        org.apache.commons.lang3.Validate.notNull(targetState, "The targetState cannot be null");

        return forKey(
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
    public com.oracle.bmc.waiter.Waiter<GetKeyRequest, GetKeyResponse> forKey(
            GetKeyRequest request,
            com.oracle.bmc.waiter.TerminationStrategy terminationStrategy,
            com.oracle.bmc.waiter.DelayStrategy delayStrategy,
            com.oracle.bmc.keymanagement.model.Key.LifecycleState... targetStates) {
        org.apache.commons.lang3.Validate.notEmpty(
                targetStates, "At least one target state must be provided");
        org.apache.commons.lang3.Validate.noNullElements(
                targetStates, "Null target states are not permitted");

        return forKey(
                com.oracle.bmc.waiter.Waiters.newWaiter(terminationStrategy, delayStrategy),
                request,
                targetStates);
    }

    // Helper method to create a new Waiter for Key.
    private com.oracle.bmc.waiter.Waiter<GetKeyRequest, GetKeyResponse> forKey(
            com.oracle.bmc.waiter.BmcGenericWaiter waiter,
            final GetKeyRequest request,
            final com.oracle.bmc.keymanagement.model.Key.LifecycleState... targetStates) {
        final java.util.Set<com.oracle.bmc.keymanagement.model.Key.LifecycleState> targetStatesSet =
                new java.util.HashSet<>(java.util.Arrays.asList(targetStates));

        return new com.oracle.bmc.waiter.internal.SimpleWaiterImpl<>(
                executorService,
                waiter.toCallable(
                        com.google.common.base.Suppliers.ofInstance(request),
                        new com.google.common.base.Function<GetKeyRequest, GetKeyResponse>() {
                            @Override
                            public GetKeyResponse apply(GetKeyRequest request) {
                                return client.getKey(request);
                            }
                        },
                        new com.google.common.base.Predicate<GetKeyResponse>() {
                            @Override
                            public boolean apply(GetKeyResponse response) {
                                return targetStatesSet.contains(
                                        response.getKey().getLifecycleState());
                            }
                        },
                        targetStatesSet.contains(
                                com.oracle.bmc.keymanagement.model.Key.LifecycleState.Deleted)),
                request);
    }
}
