/**
 * Copyright (c) 2016, 2018, Oracle and/or its affiliates. All rights reserved.
 */
package com.oracle.bmc.keymanagement;

import com.oracle.bmc.keymanagement.requests.*;
import com.oracle.bmc.keymanagement.responses.*;

/**
 * Collection of helper methods to produce {@link Waiter}s for different
 * resources of KmsVault.
 * <p>
 * The default configuration used is defined by {@link Waiters#DEFAULT_POLLING_WAITER}.
 */
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20180608")
@lombok.RequiredArgsConstructor
public class KmsVaultWaiters {
    private final java.util.concurrent.ExecutorService executorService;
    private final KmsVault client;

    /**
     * Creates a new {@link Waiter} using default configuration.
     *
     * @param request the request to send
     * @param targetStates the desired states to wait for. If multiple states are provided then the waiter will return once the resource reaches any of the provided states
     * @return a new {@code Waiter} instance
     */
    public com.oracle.bmc.waiter.Waiter<GetVaultRequest, GetVaultResponse> forVault(
            GetVaultRequest request,
            com.oracle.bmc.keymanagement.model.Vault.LifecycleState... targetStates) {
        org.apache.commons.lang3.Validate.notEmpty(
                targetStates, "At least one targetState must be provided");
        org.apache.commons.lang3.Validate.noNullElements(
                targetStates, "Null targetState values are not permitted");

        return forVault(
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
    public com.oracle.bmc.waiter.Waiter<GetVaultRequest, GetVaultResponse> forVault(
            GetVaultRequest request,
            com.oracle.bmc.keymanagement.model.Vault.LifecycleState targetState,
            com.oracle.bmc.waiter.TerminationStrategy terminationStrategy,
            com.oracle.bmc.waiter.DelayStrategy delayStrategy) {
        org.apache.commons.lang3.Validate.notNull(targetState, "The targetState cannot be null");

        return forVault(
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
    public com.oracle.bmc.waiter.Waiter<GetVaultRequest, GetVaultResponse> forVault(
            GetVaultRequest request,
            com.oracle.bmc.waiter.TerminationStrategy terminationStrategy,
            com.oracle.bmc.waiter.DelayStrategy delayStrategy,
            com.oracle.bmc.keymanagement.model.Vault.LifecycleState... targetStates) {
        org.apache.commons.lang3.Validate.notEmpty(
                targetStates, "At least one target state must be provided");
        org.apache.commons.lang3.Validate.noNullElements(
                targetStates, "Null target states are not permitted");

        return forVault(
                com.oracle.bmc.waiter.Waiters.newWaiter(terminationStrategy, delayStrategy),
                request,
                targetStates);
    }

    // Helper method to create a new Waiter for Vault.
    private com.oracle.bmc.waiter.Waiter<GetVaultRequest, GetVaultResponse> forVault(
            com.oracle.bmc.waiter.BmcGenericWaiter waiter,
            final GetVaultRequest request,
            final com.oracle.bmc.keymanagement.model.Vault.LifecycleState... targetStates) {
        final java.util.Set<com.oracle.bmc.keymanagement.model.Vault.LifecycleState>
                targetStatesSet = new java.util.HashSet<>(java.util.Arrays.asList(targetStates));

        return new com.oracle.bmc.waiter.internal.SimpleWaiterImpl<>(
                executorService,
                waiter.toCallable(
                        com.google.common.base.Suppliers.ofInstance(request),
                        new com.google.common.base.Function<GetVaultRequest, GetVaultResponse>() {
                            @Override
                            public GetVaultResponse apply(GetVaultRequest request) {
                                return client.getVault(request);
                            }
                        },
                        new com.google.common.base.Predicate<GetVaultResponse>() {
                            @Override
                            public boolean apply(GetVaultResponse response) {
                                return targetStatesSet.contains(
                                        response.getVault().getLifecycleState());
                            }
                        },
                        targetStatesSet.contains(
                                com.oracle.bmc.keymanagement.model.Vault.LifecycleState.Deleted)),
                request);
    }
}
