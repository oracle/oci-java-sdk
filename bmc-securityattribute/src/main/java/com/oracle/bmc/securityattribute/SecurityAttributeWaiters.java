/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.securityattribute;

import com.oracle.bmc.securityattribute.requests.*;
import com.oracle.bmc.securityattribute.responses.*;

/**
 * Collection of helper methods to produce {@link com.oracle.bmc.waiter.Waiter}s for different
 * resources of SecurityAttribute.
 * <p>
 * The default configuration used is defined by {@link com.oracle.bmc.waiter.Waiters.Waiters#DEFAULT_POLLING_WAITER}.
 */
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20240815")
public class SecurityAttributeWaiters {
    private final java.util.concurrent.ExecutorService executorService;
    private final SecurityAttribute client;

    public SecurityAttributeWaiters(
            java.util.concurrent.ExecutorService executorService, SecurityAttribute client) {
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
    public com.oracle.bmc.waiter.Waiter<GetSecurityAttributeRequest, GetSecurityAttributeResponse>
            forSecurityAttribute(
                    GetSecurityAttributeRequest request,
                    com.oracle.bmc.securityattribute.model.SecurityAttribute.LifecycleState...
                            targetStates) {
        com.oracle.bmc.util.internal.Validate.notEmpty(
                targetStates, "At least one targetState must be provided");
        com.oracle.bmc.util.internal.Validate.noNullElements(
                targetStates, "Null targetState values are not permitted");

        return forSecurityAttribute(
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
    public com.oracle.bmc.waiter.Waiter<GetSecurityAttributeRequest, GetSecurityAttributeResponse>
            forSecurityAttribute(
                    GetSecurityAttributeRequest request,
                    com.oracle.bmc.securityattribute.model.SecurityAttribute.LifecycleState
                            targetState,
                    com.oracle.bmc.waiter.TerminationStrategy terminationStrategy,
                    com.oracle.bmc.waiter.DelayStrategy delayStrategy) {
        com.oracle.bmc.util.internal.Validate.notNull(
                targetState, "The targetState cannot be null");

        return forSecurityAttribute(
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
    public com.oracle.bmc.waiter.Waiter<GetSecurityAttributeRequest, GetSecurityAttributeResponse>
            forSecurityAttribute(
                    GetSecurityAttributeRequest request,
                    com.oracle.bmc.waiter.TerminationStrategy terminationStrategy,
                    com.oracle.bmc.waiter.DelayStrategy delayStrategy,
                    com.oracle.bmc.securityattribute.model.SecurityAttribute.LifecycleState...
                            targetStates) {
        com.oracle.bmc.util.internal.Validate.notEmpty(
                targetStates, "At least one target state must be provided");
        com.oracle.bmc.util.internal.Validate.noNullElements(
                targetStates, "Null target states are not permitted");

        return forSecurityAttribute(
                com.oracle.bmc.waiter.Waiters.newWaiter(terminationStrategy, delayStrategy),
                request,
                targetStates);
    }

    // Helper method to create a new Waiter for SecurityAttribute.
    private com.oracle.bmc.waiter.Waiter<GetSecurityAttributeRequest, GetSecurityAttributeResponse>
            forSecurityAttribute(
                    com.oracle.bmc.waiter.BmcGenericWaiter waiter,
                    final GetSecurityAttributeRequest request,
                    final com.oracle.bmc.securityattribute.model.SecurityAttribute.LifecycleState...
                            targetStates) {
        final java.util.Set<com.oracle.bmc.securityattribute.model.SecurityAttribute.LifecycleState>
                targetStatesSet = new java.util.HashSet<>(java.util.Arrays.asList(targetStates));

        return new com.oracle.bmc.waiter.internal.SimpleWaiterImpl<>(
                executorService,
                waiter.toCallable(
                        () -> request,
                        new java.util.function.Function<
                                GetSecurityAttributeRequest, GetSecurityAttributeResponse>() {
                            @Override
                            public GetSecurityAttributeResponse apply(
                                    GetSecurityAttributeRequest request) {
                                return client.getSecurityAttribute(request);
                            }
                        },
                        new java.util.function.Predicate<GetSecurityAttributeResponse>() {
                            @Override
                            public boolean test(GetSecurityAttributeResponse response) {
                                return targetStatesSet.contains(
                                        response.getSecurityAttribute().getLifecycleState());
                            }
                        },
                        targetStatesSet.contains(
                                com.oracle.bmc.securityattribute.model.SecurityAttribute
                                        .LifecycleState.Deleted)),
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
                    GetSecurityAttributeNamespaceRequest, GetSecurityAttributeNamespaceResponse>
            forSecurityAttributeNamespace(
                    GetSecurityAttributeNamespaceRequest request,
                    com.oracle.bmc.securityattribute.model.SecurityAttributeNamespace
                                    .LifecycleState...
                            targetStates) {
        com.oracle.bmc.util.internal.Validate.notEmpty(
                targetStates, "At least one targetState must be provided");
        com.oracle.bmc.util.internal.Validate.noNullElements(
                targetStates, "Null targetState values are not permitted");

        return forSecurityAttributeNamespace(
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
                    GetSecurityAttributeNamespaceRequest, GetSecurityAttributeNamespaceResponse>
            forSecurityAttributeNamespace(
                    GetSecurityAttributeNamespaceRequest request,
                    com.oracle.bmc.securityattribute.model.SecurityAttributeNamespace.LifecycleState
                            targetState,
                    com.oracle.bmc.waiter.TerminationStrategy terminationStrategy,
                    com.oracle.bmc.waiter.DelayStrategy delayStrategy) {
        com.oracle.bmc.util.internal.Validate.notNull(
                targetState, "The targetState cannot be null");

        return forSecurityAttributeNamespace(
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
                    GetSecurityAttributeNamespaceRequest, GetSecurityAttributeNamespaceResponse>
            forSecurityAttributeNamespace(
                    GetSecurityAttributeNamespaceRequest request,
                    com.oracle.bmc.waiter.TerminationStrategy terminationStrategy,
                    com.oracle.bmc.waiter.DelayStrategy delayStrategy,
                    com.oracle.bmc.securityattribute.model.SecurityAttributeNamespace
                                    .LifecycleState...
                            targetStates) {
        com.oracle.bmc.util.internal.Validate.notEmpty(
                targetStates, "At least one target state must be provided");
        com.oracle.bmc.util.internal.Validate.noNullElements(
                targetStates, "Null target states are not permitted");

        return forSecurityAttributeNamespace(
                com.oracle.bmc.waiter.Waiters.newWaiter(terminationStrategy, delayStrategy),
                request,
                targetStates);
    }

    // Helper method to create a new Waiter for SecurityAttributeNamespace.
    private com.oracle.bmc.waiter.Waiter<
                    GetSecurityAttributeNamespaceRequest, GetSecurityAttributeNamespaceResponse>
            forSecurityAttributeNamespace(
                    com.oracle.bmc.waiter.BmcGenericWaiter waiter,
                    final GetSecurityAttributeNamespaceRequest request,
                    final com.oracle.bmc.securityattribute.model.SecurityAttributeNamespace
                                    .LifecycleState...
                            targetStates) {
        final java.util.Set<
                        com.oracle.bmc.securityattribute.model.SecurityAttributeNamespace
                                .LifecycleState>
                targetStatesSet = new java.util.HashSet<>(java.util.Arrays.asList(targetStates));

        return new com.oracle.bmc.waiter.internal.SimpleWaiterImpl<>(
                executorService,
                waiter.toCallable(
                        () -> request,
                        new java.util.function.Function<
                                GetSecurityAttributeNamespaceRequest,
                                GetSecurityAttributeNamespaceResponse>() {
                            @Override
                            public GetSecurityAttributeNamespaceResponse apply(
                                    GetSecurityAttributeNamespaceRequest request) {
                                return client.getSecurityAttributeNamespace(request);
                            }
                        },
                        new java.util.function.Predicate<GetSecurityAttributeNamespaceResponse>() {
                            @Override
                            public boolean test(GetSecurityAttributeNamespaceResponse response) {
                                return targetStatesSet.contains(
                                        response.getSecurityAttributeNamespace()
                                                .getLifecycleState());
                            }
                        },
                        targetStatesSet.contains(
                                com.oracle.bmc.securityattribute.model.SecurityAttributeNamespace
                                        .LifecycleState.Deleted)),
                request);
    }

    /**
     * Creates a new {@link com.oracle.bmc.waiter.Waiter} using default configuration.
     *
     * @param request the request to send
     * @return a new {@code Waiter} instance
     */
    public com.oracle.bmc.waiter.Waiter<
                    GetSecurityAttributeWorkRequestRequest, GetSecurityAttributeWorkRequestResponse>
            forSecurityAttributeWorkRequest(GetSecurityAttributeWorkRequestRequest request) {
        return forSecurityAttributeWorkRequest(
                com.oracle.bmc.waiter.Waiters.DEFAULT_POLLING_WAITER, request);
    }

    /**
     * Creates a new {@link com.oracle.bmc.waiter.Waiter} using the provided configuration.
     *
     * @param request the request to send
     * @param terminationStrategy the {@link com.oracle.bmc.waiter.TerminationStrategy} to use
     * @param delayStrategy the {@linkcom.oracle.bmc.waiter. DelayStrategy} to use
     * @return a new {@code com.oracle.bmc.waiter.Waiter} instance
     */
    public com.oracle.bmc.waiter.Waiter<
                    GetSecurityAttributeWorkRequestRequest, GetSecurityAttributeWorkRequestResponse>
            forSecurityAttributeWorkRequest(
                    GetSecurityAttributeWorkRequestRequest request,
                    com.oracle.bmc.waiter.TerminationStrategy terminationStrategy,
                    com.oracle.bmc.waiter.DelayStrategy delayStrategy) {
        return forSecurityAttributeWorkRequest(
                com.oracle.bmc.waiter.Waiters.newWaiter(terminationStrategy, delayStrategy),
                request);
    }

    // Helper method to create a new Waiter for SecurityAttributeWorkRequest.
    private com.oracle.bmc.waiter.Waiter<
                    GetSecurityAttributeWorkRequestRequest, GetSecurityAttributeWorkRequestResponse>
            forSecurityAttributeWorkRequest(
                    com.oracle.bmc.waiter.BmcGenericWaiter waiter,
                    final GetSecurityAttributeWorkRequestRequest request) {
        return new com.oracle.bmc.waiter.internal.SimpleWaiterImpl<>(
                executorService,
                waiter.toCallable(
                        () -> request,
                        new java.util.function.Function<
                                GetSecurityAttributeWorkRequestRequest,
                                GetSecurityAttributeWorkRequestResponse>() {
                            @Override
                            public GetSecurityAttributeWorkRequestResponse apply(
                                    GetSecurityAttributeWorkRequestRequest request) {
                                return client.getSecurityAttributeWorkRequest(request);
                            }
                        },
                        new java.util.function.Predicate<
                                GetSecurityAttributeWorkRequestResponse>() {
                            @Override
                            public boolean test(GetSecurityAttributeWorkRequestResponse response) {
                                // work requests are complete once the time finished is available
                                return response.getSecurityAttributeWorkRequest().getTimeFinished()
                                        != null;
                            }
                        },
                        false),
                request);
    }
}
