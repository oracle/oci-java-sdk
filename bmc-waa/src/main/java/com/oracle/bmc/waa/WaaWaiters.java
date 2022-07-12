/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.waa;

import com.oracle.bmc.waa.requests.*;
import com.oracle.bmc.waa.responses.*;

/**
 * Collection of helper methods to produce {@link com.oracle.bmc.waiter.Waiter}s for different
 * resources of Waa.
 * <p>
 * The default configuration used is defined by {@link com.oracle.bmc.waiter.Waiters.Waiters#DEFAULT_POLLING_WAITER}.
 */
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20211230")
public class WaaWaiters {
    private final java.util.concurrent.ExecutorService executorService;
    private final Waa client;

    public WaaWaiters(java.util.concurrent.ExecutorService executorService, Waa client) {
        this.executorService = executorService;
        this.client = client;
    }

    /**
     * Creates a new {@link com.oracle.bmc.waiter.Waiter} using the default configuration.
     *
     * @param request the request to send
     * @param targetStates the desired states to wait for. If multiple states are provided then the waiter will return once the resource reaches any of the provided states
     * @return a new {@code Waiter} instance
     */
    public com.oracle.bmc.waiter.Waiter<GetWebAppAccelerationRequest, GetWebAppAccelerationResponse>
            forWebAppAcceleration(
                    GetWebAppAccelerationRequest request,
                    com.oracle.bmc.waa.model.WebAppAcceleration.LifecycleState... targetStates) {
        com.oracle.bmc.util.internal.Validate.notEmpty(
                targetStates, "At least one targetState must be provided");
        com.oracle.bmc.util.internal.Validate.noNullElements(
                targetStates, "Null targetState values are not permitted");

        return forWebAppAcceleration(
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
    public com.oracle.bmc.waiter.Waiter<GetWebAppAccelerationRequest, GetWebAppAccelerationResponse>
            forWebAppAcceleration(
                    GetWebAppAccelerationRequest request,
                    com.oracle.bmc.waa.model.WebAppAcceleration.LifecycleState targetState,
                    com.oracle.bmc.waiter.TerminationStrategy terminationStrategy,
                    com.oracle.bmc.waiter.DelayStrategy delayStrategy) {
        com.oracle.bmc.util.internal.Validate.notNull(
                targetState, "The targetState cannot be null");

        return forWebAppAcceleration(
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
    public com.oracle.bmc.waiter.Waiter<GetWebAppAccelerationRequest, GetWebAppAccelerationResponse>
            forWebAppAcceleration(
                    GetWebAppAccelerationRequest request,
                    com.oracle.bmc.waiter.TerminationStrategy terminationStrategy,
                    com.oracle.bmc.waiter.DelayStrategy delayStrategy,
                    com.oracle.bmc.waa.model.WebAppAcceleration.LifecycleState... targetStates) {
        com.oracle.bmc.util.internal.Validate.notEmpty(
                targetStates, "At least one target state must be provided");
        com.oracle.bmc.util.internal.Validate.noNullElements(
                targetStates, "Null target states are not permitted");

        return forWebAppAcceleration(
                com.oracle.bmc.waiter.Waiters.newWaiter(terminationStrategy, delayStrategy),
                request,
                targetStates);
    }

    // Helper method to create a new Waiter for WebAppAcceleration.
    private com.oracle.bmc.waiter.Waiter<
                    GetWebAppAccelerationRequest, GetWebAppAccelerationResponse>
            forWebAppAcceleration(
                    com.oracle.bmc.waiter.BmcGenericWaiter waiter,
                    final GetWebAppAccelerationRequest request,
                    final com.oracle.bmc.waa.model.WebAppAcceleration.LifecycleState...
                            targetStates) {
        final java.util.Set<com.oracle.bmc.waa.model.WebAppAcceleration.LifecycleState>
                targetStatesSet = new java.util.HashSet<>(java.util.Arrays.asList(targetStates));

        return new com.oracle.bmc.waiter.internal.SimpleWaiterImpl<>(
                executorService,
                waiter.toCallable(
                        () -> request,
                        new java.util.function.Function<
                                GetWebAppAccelerationRequest, GetWebAppAccelerationResponse>() {
                            @Override
                            public GetWebAppAccelerationResponse apply(
                                    GetWebAppAccelerationRequest request) {
                                return client.getWebAppAcceleration(request);
                            }
                        },
                        new java.util.function.Predicate<GetWebAppAccelerationResponse>() {
                            @Override
                            public boolean test(GetWebAppAccelerationResponse response) {
                                return targetStatesSet.contains(
                                        response.getWebAppAcceleration().getLifecycleState());
                            }
                        },
                        targetStatesSet.contains(
                                com.oracle.bmc.waa.model.WebAppAcceleration.LifecycleState
                                        .Deleted)),
                request);
    }

    /**
     * Creates a new {@link com.oracle.bmc.waiter.Waiter} using the default configuration.
     *
     * @param request the request to send
     * @param targetStates the desired states to wait for. If multiple states are provided then the waiter will return once the resource reaches any of the provided states
     * @return a new {@code Waiter} instance
     */
    public com.oracle.bmc.waiter.Waiter<
                    GetWebAppAccelerationPolicyRequest, GetWebAppAccelerationPolicyResponse>
            forWebAppAccelerationPolicy(
                    GetWebAppAccelerationPolicyRequest request,
                    com.oracle.bmc.waa.model.WebAppAccelerationPolicy.LifecycleState...
                            targetStates) {
        com.oracle.bmc.util.internal.Validate.notEmpty(
                targetStates, "At least one targetState must be provided");
        com.oracle.bmc.util.internal.Validate.noNullElements(
                targetStates, "Null targetState values are not permitted");

        return forWebAppAccelerationPolicy(
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
    public com.oracle.bmc.waiter.Waiter<
                    GetWebAppAccelerationPolicyRequest, GetWebAppAccelerationPolicyResponse>
            forWebAppAccelerationPolicy(
                    GetWebAppAccelerationPolicyRequest request,
                    com.oracle.bmc.waa.model.WebAppAccelerationPolicy.LifecycleState targetState,
                    com.oracle.bmc.waiter.TerminationStrategy terminationStrategy,
                    com.oracle.bmc.waiter.DelayStrategy delayStrategy) {
        com.oracle.bmc.util.internal.Validate.notNull(
                targetState, "The targetState cannot be null");

        return forWebAppAccelerationPolicy(
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
    public com.oracle.bmc.waiter.Waiter<
                    GetWebAppAccelerationPolicyRequest, GetWebAppAccelerationPolicyResponse>
            forWebAppAccelerationPolicy(
                    GetWebAppAccelerationPolicyRequest request,
                    com.oracle.bmc.waiter.TerminationStrategy terminationStrategy,
                    com.oracle.bmc.waiter.DelayStrategy delayStrategy,
                    com.oracle.bmc.waa.model.WebAppAccelerationPolicy.LifecycleState...
                            targetStates) {
        com.oracle.bmc.util.internal.Validate.notEmpty(
                targetStates, "At least one target state must be provided");
        com.oracle.bmc.util.internal.Validate.noNullElements(
                targetStates, "Null target states are not permitted");

        return forWebAppAccelerationPolicy(
                com.oracle.bmc.waiter.Waiters.newWaiter(terminationStrategy, delayStrategy),
                request,
                targetStates);
    }

    // Helper method to create a new Waiter for WebAppAccelerationPolicy.
    private com.oracle.bmc.waiter.Waiter<
                    GetWebAppAccelerationPolicyRequest, GetWebAppAccelerationPolicyResponse>
            forWebAppAccelerationPolicy(
                    com.oracle.bmc.waiter.BmcGenericWaiter waiter,
                    final GetWebAppAccelerationPolicyRequest request,
                    final com.oracle.bmc.waa.model.WebAppAccelerationPolicy.LifecycleState...
                            targetStates) {
        final java.util.Set<com.oracle.bmc.waa.model.WebAppAccelerationPolicy.LifecycleState>
                targetStatesSet = new java.util.HashSet<>(java.util.Arrays.asList(targetStates));

        return new com.oracle.bmc.waiter.internal.SimpleWaiterImpl<>(
                executorService,
                waiter.toCallable(
                        () -> request,
                        new java.util.function.Function<
                                GetWebAppAccelerationPolicyRequest,
                                GetWebAppAccelerationPolicyResponse>() {
                            @Override
                            public GetWebAppAccelerationPolicyResponse apply(
                                    GetWebAppAccelerationPolicyRequest request) {
                                return client.getWebAppAccelerationPolicy(request);
                            }
                        },
                        new java.util.function.Predicate<GetWebAppAccelerationPolicyResponse>() {
                            @Override
                            public boolean test(GetWebAppAccelerationPolicyResponse response) {
                                return targetStatesSet.contains(
                                        response.getWebAppAccelerationPolicy().getLifecycleState());
                            }
                        },
                        targetStatesSet.contains(
                                com.oracle.bmc.waa.model.WebAppAccelerationPolicy.LifecycleState
                                        .Deleted)),
                request);
    }
}
