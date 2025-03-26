/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.vault;

import com.oracle.bmc.vault.requests.*;
import com.oracle.bmc.vault.responses.*;

/**
 * Collection of helper methods to produce {@link com.oracle.bmc.waiter.Waiter}s for different
 * resources of Vaults.
 * <p>
 * The default configuration used is defined by {@link com.oracle.bmc.waiter.Waiters.Waiters#DEFAULT_POLLING_WAITER}.
 */
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20180608")
public class VaultsWaiters {
    @javax.annotation.Nonnull private final java.util.concurrent.ExecutorService executorService;
    @javax.annotation.Nonnull private final Vaults client;
    private final com.oracle.bmc.workrequests.WorkRequest workRequestClient;

    @Deprecated
    public VaultsWaiters(
            @javax.annotation.Nonnull java.util.concurrent.ExecutorService executorService,
            @javax.annotation.Nonnull Vaults client) {
        this(executorService, client, null);
    }

    public VaultsWaiters(
            @javax.annotation.Nonnull java.util.concurrent.ExecutorService executorService,
            @javax.annotation.Nonnull Vaults client,
            com.oracle.bmc.workrequests.WorkRequest workRequestClient) {
        if (executorService == null) {
            throw new NullPointerException("executorService is marked non-null but is null");
        }
        if (client == null) {
            throw new NullPointerException("client is marked non-null but is null");
        }
        this.executorService = executorService;
        this.client = client;
        this.workRequestClient = workRequestClient;
    }

    /**
     * Creates a new {@link com.oracle.bmc.waiter.Waiter} using the default configuration.
     *
     * @param request the request to send
     * @param targetStates the desired states to wait for. If multiple states are provided then the waiter will return once the resource reaches any of the provided states
     * @return a new {@code Waiter} instance
     */
    public com.oracle.bmc.waiter.Waiter<GetSecretRequest, GetSecretResponse> forSecret(
            GetSecretRequest request,
            com.oracle.bmc.vault.model.Secret.LifecycleState... targetStates) {
        com.oracle.bmc.util.internal.Validate.notEmpty(
                targetStates, "At least one targetState must be provided");
        com.oracle.bmc.util.internal.Validate.noNullElements(
                targetStates, "Null targetState values are not permitted");

        return forSecret(
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
    public com.oracle.bmc.waiter.Waiter<GetSecretRequest, GetSecretResponse> forSecret(
            GetSecretRequest request,
            com.oracle.bmc.vault.model.Secret.LifecycleState targetState,
            com.oracle.bmc.waiter.TerminationStrategy terminationStrategy,
            com.oracle.bmc.waiter.DelayStrategy delayStrategy) {
        com.oracle.bmc.util.internal.Validate.notNull(
                targetState, "The targetState cannot be null");

        return forSecret(
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
    public com.oracle.bmc.waiter.Waiter<GetSecretRequest, GetSecretResponse> forSecret(
            GetSecretRequest request,
            com.oracle.bmc.waiter.TerminationStrategy terminationStrategy,
            com.oracle.bmc.waiter.DelayStrategy delayStrategy,
            com.oracle.bmc.vault.model.Secret.LifecycleState... targetStates) {
        com.oracle.bmc.util.internal.Validate.notEmpty(
                targetStates, "At least one target state must be provided");
        com.oracle.bmc.util.internal.Validate.noNullElements(
                targetStates, "Null target states are not permitted");

        return forSecret(
                com.oracle.bmc.waiter.Waiters.newWaiter(terminationStrategy, delayStrategy),
                request,
                targetStates);
    }

    // Helper method to create a new Waiter for Secret.
    private com.oracle.bmc.waiter.Waiter<GetSecretRequest, GetSecretResponse> forSecret(
            com.oracle.bmc.waiter.BmcGenericWaiter waiter,
            final GetSecretRequest request,
            final com.oracle.bmc.vault.model.Secret.LifecycleState... targetStates) {
        final java.util.Set<com.oracle.bmc.vault.model.Secret.LifecycleState> targetStatesSet =
                new java.util.HashSet<>(java.util.Arrays.asList(targetStates));

        return new com.oracle.bmc.waiter.internal.SimpleWaiterImpl<>(
                executorService,
                waiter.toCallable(
                        () -> request,
                        new java.util.function.Function<GetSecretRequest, GetSecretResponse>() {
                            @Override
                            public GetSecretResponse apply(GetSecretRequest request) {
                                return client.getSecret(request);
                            }
                        },
                        new java.util.function.Predicate<GetSecretResponse>() {
                            @Override
                            public boolean test(GetSecretResponse response) {
                                return targetStatesSet.contains(
                                        response.getSecret().getLifecycleState());
                            }
                        },
                        targetStatesSet.contains(
                                com.oracle.bmc.vault.model.Secret.LifecycleState.Deleted)),
                request);
    }

    /**
     * Creates a new {@link com.oracle.bmc.waiter.Waiter} using the default configuration.
     *
     * @param request the request to send
     * @return a new {@link com.oracle.bmc.waiter.Waiter} instance
     */
    public com.oracle.bmc.waiter.Waiter<RotateSecretRequest, RotateSecretResponse> forRotateSecret(
            RotateSecretRequest request) {
        return forRotateSecret(
                request,
                com.oracle.bmc.waiter.Waiters.DEFAULT_POLLING_TERMINATION_STRATEGY,
                com.oracle.bmc.waiter.Waiters.DEFAULT_POLLING_DELAY_STRATEGY);
    }

    /**
     * Creates a new {@link com.oracle.bmc.waiter.Waiter} using the provided configuration.
     *
     * @param request the request to send
     * @param terminationStrategy the {@link com.oracle.bmc.waiter.TerminationStrategy} to use
     * @param delayStrategy the {@link com.oracle.bmc.waiter.DelayStrategy} to use
     * @return a new {@link com.oracle.bmc.waiter.Waiter} instance
     */
    public com.oracle.bmc.waiter.Waiter<RotateSecretRequest, RotateSecretResponse> forRotateSecret(
            RotateSecretRequest request,
            com.oracle.bmc.waiter.TerminationStrategy terminationStrategy,
            com.oracle.bmc.waiter.DelayStrategy delayStrategy) {
        if (workRequestClient == null) {
            throw new IllegalStateException(
                    "A WorkRequestClient must be supplied to this waiter for this operation");
        }

        return new com.oracle.bmc.waiter.internal.SimpleWaiterImpl<>(
                executorService,
                new java.util.concurrent.Callable<RotateSecretResponse>() {
                    @Override
                    public RotateSecretResponse call() throws Exception {
                        final RotateSecretResponse response = client.rotateSecret(request);

                        if (response.getOpcWorkRequestId() != null) {
                            final com.oracle.bmc.workrequests.requests.GetWorkRequestRequest
                                    getWorkRequestRequest =
                                            com.oracle.bmc.workrequests.requests
                                                    .GetWorkRequestRequest.builder()
                                                    .workRequestId(response.getOpcWorkRequestId())
                                                    .build();
                            workRequestClient
                                    .getWaiters()
                                    .forWorkRequest(
                                            getWorkRequestRequest,
                                            terminationStrategy,
                                            delayStrategy)
                                    .execute();
                        }
                        return response;
                    }
                },
                request);
    }
}
