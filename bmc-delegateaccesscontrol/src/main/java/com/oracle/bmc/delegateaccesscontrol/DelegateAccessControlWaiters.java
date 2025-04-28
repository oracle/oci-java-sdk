/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.delegateaccesscontrol;

import com.oracle.bmc.delegateaccesscontrol.requests.*;
import com.oracle.bmc.delegateaccesscontrol.responses.*;

/**
 * Collection of helper methods to produce {@link com.oracle.bmc.waiter.Waiter}s for different
 * resources of DelegateAccessControl.
 *
 * <p>The default configuration used is defined by {@link
 * com.oracle.bmc.waiter.Waiters.Waiters#DEFAULT_POLLING_WAITER}.
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20230801")
public class DelegateAccessControlWaiters {
    private final java.util.concurrent.ExecutorService executorService;
    private final DelegateAccessControl client;

    public DelegateAccessControlWaiters(
            java.util.concurrent.ExecutorService executorService, DelegateAccessControl client) {
        this.executorService = executorService;
        this.client = client;
    }

    /**
     * Creates a new {@link com.oracle.bmc.waiter.Waiter} using the default configuration.
     *
     * @param request the request to send
     * @param targetStates the desired states to wait for. If multiple states are provided then the
     *     waiter will return once the resource reaches any of the provided states
     * @return a new {@code Waiter} instance
     */
    public com.oracle.bmc.waiter.Waiter<
                    GetDelegatedResourceAccessRequestRequest,
                    GetDelegatedResourceAccessRequestResponse>
            forDelegatedResourceAccessRequest(
                    GetDelegatedResourceAccessRequestRequest request,
                    com.oracle.bmc.delegateaccesscontrol.model.DelegatedResourceAccessRequest
                                            .LifecycleState
                                    ...
                            targetStates) {
        com.oracle.bmc.util.internal.Validate.notEmpty(
                targetStates, "At least one targetState must be provided");
        com.oracle.bmc.util.internal.Validate.noNullElements(
                targetStates, "Null targetState values are not permitted");

        return forDelegatedResourceAccessRequest(
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
                    GetDelegatedResourceAccessRequestRequest,
                    GetDelegatedResourceAccessRequestResponse>
            forDelegatedResourceAccessRequest(
                    GetDelegatedResourceAccessRequestRequest request,
                    com.oracle.bmc.delegateaccesscontrol.model.DelegatedResourceAccessRequest
                                    .LifecycleState
                            targetState,
                    com.oracle.bmc.waiter.TerminationStrategy terminationStrategy,
                    com.oracle.bmc.waiter.DelayStrategy delayStrategy) {
        com.oracle.bmc.util.internal.Validate.notNull(
                targetState, "The targetState cannot be null");

        return forDelegatedResourceAccessRequest(
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
     * @param targetStates the desired states to wait for. The waiter will return once the resource
     *     reaches any of the provided states
     * @return a new {@code com.oracle.bmc.waiter.Waiter} instance
     */
    public com.oracle.bmc.waiter.Waiter<
                    GetDelegatedResourceAccessRequestRequest,
                    GetDelegatedResourceAccessRequestResponse>
            forDelegatedResourceAccessRequest(
                    GetDelegatedResourceAccessRequestRequest request,
                    com.oracle.bmc.waiter.TerminationStrategy terminationStrategy,
                    com.oracle.bmc.waiter.DelayStrategy delayStrategy,
                    com.oracle.bmc.delegateaccesscontrol.model.DelegatedResourceAccessRequest
                                            .LifecycleState
                                    ...
                            targetStates) {
        com.oracle.bmc.util.internal.Validate.notEmpty(
                targetStates, "At least one target state must be provided");
        com.oracle.bmc.util.internal.Validate.noNullElements(
                targetStates, "Null target states are not permitted");

        return forDelegatedResourceAccessRequest(
                com.oracle.bmc.waiter.Waiters.newWaiter(terminationStrategy, delayStrategy),
                request,
                targetStates);
    }

    // Helper method to create a new Waiter for DelegatedResourceAccessRequest.
    private com.oracle.bmc.waiter.Waiter<
                    GetDelegatedResourceAccessRequestRequest,
                    GetDelegatedResourceAccessRequestResponse>
            forDelegatedResourceAccessRequest(
                    com.oracle.bmc.waiter.BmcGenericWaiter waiter,
                    final GetDelegatedResourceAccessRequestRequest request,
                    final com.oracle.bmc.delegateaccesscontrol.model.DelegatedResourceAccessRequest
                                            .LifecycleState
                                    ...
                            targetStates) {
        final java.util.Set<
                        com.oracle.bmc.delegateaccesscontrol.model.DelegatedResourceAccessRequest
                                .LifecycleState>
                targetStatesSet = new java.util.HashSet<>(java.util.Arrays.asList(targetStates));

        return new com.oracle.bmc.waiter.internal.SimpleWaiterImpl<>(
                executorService,
                waiter.toCallable(
                        () -> request,
                        new java.util.function.Function<
                                GetDelegatedResourceAccessRequestRequest,
                                GetDelegatedResourceAccessRequestResponse>() {
                            @Override
                            public GetDelegatedResourceAccessRequestResponse apply(
                                    GetDelegatedResourceAccessRequestRequest request) {
                                return client.getDelegatedResourceAccessRequest(request);
                            }
                        },
                        new java.util.function.Predicate<
                                GetDelegatedResourceAccessRequestResponse>() {
                            @Override
                            public boolean test(
                                    GetDelegatedResourceAccessRequestResponse response) {
                                return targetStatesSet.contains(
                                        response.getDelegatedResourceAccessRequest()
                                                .getLifecycleState());
                            }
                        },
                        false),
                request);
    }

    /**
     * Creates a new {@link com.oracle.bmc.waiter.Waiter} using the default configuration.
     *
     * @param request the request to send
     * @param targetStates the desired states to wait for. If multiple states are provided then the
     *     waiter will return once the resource reaches any of the provided states
     * @return a new {@code Waiter} instance
     */
    public com.oracle.bmc.waiter.Waiter<GetDelegationControlRequest, GetDelegationControlResponse>
            forDelegationControl(
                    GetDelegationControlRequest request,
                    com.oracle.bmc.delegateaccesscontrol.model.DelegationControl.LifecycleState...
                            targetStates) {
        com.oracle.bmc.util.internal.Validate.notEmpty(
                targetStates, "At least one targetState must be provided");
        com.oracle.bmc.util.internal.Validate.noNullElements(
                targetStates, "Null targetState values are not permitted");

        return forDelegationControl(
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
    public com.oracle.bmc.waiter.Waiter<GetDelegationControlRequest, GetDelegationControlResponse>
            forDelegationControl(
                    GetDelegationControlRequest request,
                    com.oracle.bmc.delegateaccesscontrol.model.DelegationControl.LifecycleState
                            targetState,
                    com.oracle.bmc.waiter.TerminationStrategy terminationStrategy,
                    com.oracle.bmc.waiter.DelayStrategy delayStrategy) {
        com.oracle.bmc.util.internal.Validate.notNull(
                targetState, "The targetState cannot be null");

        return forDelegationControl(
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
     * @param targetStates the desired states to wait for. The waiter will return once the resource
     *     reaches any of the provided states
     * @return a new {@code com.oracle.bmc.waiter.Waiter} instance
     */
    public com.oracle.bmc.waiter.Waiter<GetDelegationControlRequest, GetDelegationControlResponse>
            forDelegationControl(
                    GetDelegationControlRequest request,
                    com.oracle.bmc.waiter.TerminationStrategy terminationStrategy,
                    com.oracle.bmc.waiter.DelayStrategy delayStrategy,
                    com.oracle.bmc.delegateaccesscontrol.model.DelegationControl.LifecycleState...
                            targetStates) {
        com.oracle.bmc.util.internal.Validate.notEmpty(
                targetStates, "At least one target state must be provided");
        com.oracle.bmc.util.internal.Validate.noNullElements(
                targetStates, "Null target states are not permitted");

        return forDelegationControl(
                com.oracle.bmc.waiter.Waiters.newWaiter(terminationStrategy, delayStrategy),
                request,
                targetStates);
    }

    // Helper method to create a new Waiter for DelegationControl.
    private com.oracle.bmc.waiter.Waiter<GetDelegationControlRequest, GetDelegationControlResponse>
            forDelegationControl(
                    com.oracle.bmc.waiter.BmcGenericWaiter waiter,
                    final GetDelegationControlRequest request,
                    final com.oracle.bmc.delegateaccesscontrol.model.DelegationControl
                                            .LifecycleState
                                    ...
                            targetStates) {
        final java.util.Set<
                        com.oracle.bmc.delegateaccesscontrol.model.DelegationControl.LifecycleState>
                targetStatesSet = new java.util.HashSet<>(java.util.Arrays.asList(targetStates));

        return new com.oracle.bmc.waiter.internal.SimpleWaiterImpl<>(
                executorService,
                waiter.toCallable(
                        () -> request,
                        new java.util.function.Function<
                                GetDelegationControlRequest, GetDelegationControlResponse>() {
                            @Override
                            public GetDelegationControlResponse apply(
                                    GetDelegationControlRequest request) {
                                return client.getDelegationControl(request);
                            }
                        },
                        new java.util.function.Predicate<GetDelegationControlResponse>() {
                            @Override
                            public boolean test(GetDelegationControlResponse response) {
                                return targetStatesSet.contains(
                                        response.getDelegationControl().getLifecycleState());
                            }
                        },
                        targetStatesSet.contains(
                                com.oracle.bmc.delegateaccesscontrol.model.DelegationControl
                                        .LifecycleState.Deleted)),
                request);
    }

    /**
     * Creates a new {@link com.oracle.bmc.waiter.Waiter} using the default configuration.
     *
     * @param request the request to send
     * @param targetStates the desired states to wait for. If multiple states are provided then the
     *     waiter will return once the resource reaches any of the provided states
     * @return a new {@code Waiter} instance
     */
    public com.oracle.bmc.waiter.Waiter<
                    GetDelegationSubscriptionRequest, GetDelegationSubscriptionResponse>
            forDelegationSubscription(
                    GetDelegationSubscriptionRequest request,
                    com.oracle.bmc.delegateaccesscontrol.model.DelegationSubscription.LifecycleState
                                    ...
                            targetStates) {
        com.oracle.bmc.util.internal.Validate.notEmpty(
                targetStates, "At least one targetState must be provided");
        com.oracle.bmc.util.internal.Validate.noNullElements(
                targetStates, "Null targetState values are not permitted");

        return forDelegationSubscription(
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
                    GetDelegationSubscriptionRequest, GetDelegationSubscriptionResponse>
            forDelegationSubscription(
                    GetDelegationSubscriptionRequest request,
                    com.oracle.bmc.delegateaccesscontrol.model.DelegationSubscription.LifecycleState
                            targetState,
                    com.oracle.bmc.waiter.TerminationStrategy terminationStrategy,
                    com.oracle.bmc.waiter.DelayStrategy delayStrategy) {
        com.oracle.bmc.util.internal.Validate.notNull(
                targetState, "The targetState cannot be null");

        return forDelegationSubscription(
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
     * @param targetStates the desired states to wait for. The waiter will return once the resource
     *     reaches any of the provided states
     * @return a new {@code com.oracle.bmc.waiter.Waiter} instance
     */
    public com.oracle.bmc.waiter.Waiter<
                    GetDelegationSubscriptionRequest, GetDelegationSubscriptionResponse>
            forDelegationSubscription(
                    GetDelegationSubscriptionRequest request,
                    com.oracle.bmc.waiter.TerminationStrategy terminationStrategy,
                    com.oracle.bmc.waiter.DelayStrategy delayStrategy,
                    com.oracle.bmc.delegateaccesscontrol.model.DelegationSubscription.LifecycleState
                                    ...
                            targetStates) {
        com.oracle.bmc.util.internal.Validate.notEmpty(
                targetStates, "At least one target state must be provided");
        com.oracle.bmc.util.internal.Validate.noNullElements(
                targetStates, "Null target states are not permitted");

        return forDelegationSubscription(
                com.oracle.bmc.waiter.Waiters.newWaiter(terminationStrategy, delayStrategy),
                request,
                targetStates);
    }

    // Helper method to create a new Waiter for DelegationSubscription.
    private com.oracle.bmc.waiter.Waiter<
                    GetDelegationSubscriptionRequest, GetDelegationSubscriptionResponse>
            forDelegationSubscription(
                    com.oracle.bmc.waiter.BmcGenericWaiter waiter,
                    final GetDelegationSubscriptionRequest request,
                    final com.oracle.bmc.delegateaccesscontrol.model.DelegationSubscription
                                            .LifecycleState
                                    ...
                            targetStates) {
        final java.util.Set<
                        com.oracle.bmc.delegateaccesscontrol.model.DelegationSubscription
                                .LifecycleState>
                targetStatesSet = new java.util.HashSet<>(java.util.Arrays.asList(targetStates));

        return new com.oracle.bmc.waiter.internal.SimpleWaiterImpl<>(
                executorService,
                waiter.toCallable(
                        () -> request,
                        new java.util.function.Function<
                                GetDelegationSubscriptionRequest,
                                GetDelegationSubscriptionResponse>() {
                            @Override
                            public GetDelegationSubscriptionResponse apply(
                                    GetDelegationSubscriptionRequest request) {
                                return client.getDelegationSubscription(request);
                            }
                        },
                        new java.util.function.Predicate<GetDelegationSubscriptionResponse>() {
                            @Override
                            public boolean test(GetDelegationSubscriptionResponse response) {
                                return targetStatesSet.contains(
                                        response.getDelegationSubscription().getLifecycleState());
                            }
                        },
                        targetStatesSet.contains(
                                com.oracle.bmc.delegateaccesscontrol.model.DelegationSubscription
                                        .LifecycleState.Deleted)),
                request);
    }

    /**
     * Creates a new {@link com.oracle.bmc.waiter.Waiter} using the default configuration.
     *
     * @param request the request to send
     * @param targetStates the desired states to wait for. If multiple states are provided then the
     *     waiter will return once the resource reaches any of the provided states
     * @return a new {@code Waiter} instance
     */
    public com.oracle.bmc.waiter.Waiter<GetServiceProviderRequest, GetServiceProviderResponse>
            forServiceProvider(
                    GetServiceProviderRequest request,
                    com.oracle.bmc.delegateaccesscontrol.model.ServiceProvider.LifecycleState...
                            targetStates) {
        com.oracle.bmc.util.internal.Validate.notEmpty(
                targetStates, "At least one targetState must be provided");
        com.oracle.bmc.util.internal.Validate.noNullElements(
                targetStates, "Null targetState values are not permitted");

        return forServiceProvider(
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
    public com.oracle.bmc.waiter.Waiter<GetServiceProviderRequest, GetServiceProviderResponse>
            forServiceProvider(
                    GetServiceProviderRequest request,
                    com.oracle.bmc.delegateaccesscontrol.model.ServiceProvider.LifecycleState
                            targetState,
                    com.oracle.bmc.waiter.TerminationStrategy terminationStrategy,
                    com.oracle.bmc.waiter.DelayStrategy delayStrategy) {
        com.oracle.bmc.util.internal.Validate.notNull(
                targetState, "The targetState cannot be null");

        return forServiceProvider(
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
     * @param targetStates the desired states to wait for. The waiter will return once the resource
     *     reaches any of the provided states
     * @return a new {@code com.oracle.bmc.waiter.Waiter} instance
     */
    public com.oracle.bmc.waiter.Waiter<GetServiceProviderRequest, GetServiceProviderResponse>
            forServiceProvider(
                    GetServiceProviderRequest request,
                    com.oracle.bmc.waiter.TerminationStrategy terminationStrategy,
                    com.oracle.bmc.waiter.DelayStrategy delayStrategy,
                    com.oracle.bmc.delegateaccesscontrol.model.ServiceProvider.LifecycleState...
                            targetStates) {
        com.oracle.bmc.util.internal.Validate.notEmpty(
                targetStates, "At least one target state must be provided");
        com.oracle.bmc.util.internal.Validate.noNullElements(
                targetStates, "Null target states are not permitted");

        return forServiceProvider(
                com.oracle.bmc.waiter.Waiters.newWaiter(terminationStrategy, delayStrategy),
                request,
                targetStates);
    }

    // Helper method to create a new Waiter for ServiceProvider.
    private com.oracle.bmc.waiter.Waiter<GetServiceProviderRequest, GetServiceProviderResponse>
            forServiceProvider(
                    com.oracle.bmc.waiter.BmcGenericWaiter waiter,
                    final GetServiceProviderRequest request,
                    final com.oracle.bmc.delegateaccesscontrol.model.ServiceProvider.LifecycleState
                                    ...
                            targetStates) {
        final java.util.Set<
                        com.oracle.bmc.delegateaccesscontrol.model.ServiceProvider.LifecycleState>
                targetStatesSet = new java.util.HashSet<>(java.util.Arrays.asList(targetStates));

        return new com.oracle.bmc.waiter.internal.SimpleWaiterImpl<>(
                executorService,
                waiter.toCallable(
                        () -> request,
                        new java.util.function.Function<
                                GetServiceProviderRequest, GetServiceProviderResponse>() {
                            @Override
                            public GetServiceProviderResponse apply(
                                    GetServiceProviderRequest request) {
                                return client.getServiceProvider(request);
                            }
                        },
                        new java.util.function.Predicate<GetServiceProviderResponse>() {
                            @Override
                            public boolean test(GetServiceProviderResponse response) {
                                return targetStatesSet.contains(
                                        response.getServiceProvider().getLifecycleState());
                            }
                        },
                        targetStatesSet.contains(
                                com.oracle.bmc.delegateaccesscontrol.model.ServiceProvider
                                        .LifecycleState.Deleted)),
                request);
    }

    /**
     * Creates a new {@link com.oracle.bmc.waiter.Waiter} using the default configuration.
     *
     * @param request the request to send
     * @param targetStates the desired states to wait for. If multiple states are provided then the
     *     waiter will return once the resource reaches any of the provided states
     * @return a new {@code Waiter} instance
     */
    public com.oracle.bmc.waiter.Waiter<
                    GetServiceProviderActionRequest, GetServiceProviderActionResponse>
            forServiceProviderAction(
                    GetServiceProviderActionRequest request,
                    com.oracle.bmc.delegateaccesscontrol.model.ServiceProviderAction.LifecycleState
                                    ...
                            targetStates) {
        com.oracle.bmc.util.internal.Validate.notEmpty(
                targetStates, "At least one targetState must be provided");
        com.oracle.bmc.util.internal.Validate.noNullElements(
                targetStates, "Null targetState values are not permitted");

        return forServiceProviderAction(
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
                    GetServiceProviderActionRequest, GetServiceProviderActionResponse>
            forServiceProviderAction(
                    GetServiceProviderActionRequest request,
                    com.oracle.bmc.delegateaccesscontrol.model.ServiceProviderAction.LifecycleState
                            targetState,
                    com.oracle.bmc.waiter.TerminationStrategy terminationStrategy,
                    com.oracle.bmc.waiter.DelayStrategy delayStrategy) {
        com.oracle.bmc.util.internal.Validate.notNull(
                targetState, "The targetState cannot be null");

        return forServiceProviderAction(
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
     * @param targetStates the desired states to wait for. The waiter will return once the resource
     *     reaches any of the provided states
     * @return a new {@code com.oracle.bmc.waiter.Waiter} instance
     */
    public com.oracle.bmc.waiter.Waiter<
                    GetServiceProviderActionRequest, GetServiceProviderActionResponse>
            forServiceProviderAction(
                    GetServiceProviderActionRequest request,
                    com.oracle.bmc.waiter.TerminationStrategy terminationStrategy,
                    com.oracle.bmc.waiter.DelayStrategy delayStrategy,
                    com.oracle.bmc.delegateaccesscontrol.model.ServiceProviderAction.LifecycleState
                                    ...
                            targetStates) {
        com.oracle.bmc.util.internal.Validate.notEmpty(
                targetStates, "At least one target state must be provided");
        com.oracle.bmc.util.internal.Validate.noNullElements(
                targetStates, "Null target states are not permitted");

        return forServiceProviderAction(
                com.oracle.bmc.waiter.Waiters.newWaiter(terminationStrategy, delayStrategy),
                request,
                targetStates);
    }

    // Helper method to create a new Waiter for ServiceProviderAction.
    private com.oracle.bmc.waiter.Waiter<
                    GetServiceProviderActionRequest, GetServiceProviderActionResponse>
            forServiceProviderAction(
                    com.oracle.bmc.waiter.BmcGenericWaiter waiter,
                    final GetServiceProviderActionRequest request,
                    final com.oracle.bmc.delegateaccesscontrol.model.ServiceProviderAction
                                            .LifecycleState
                                    ...
                            targetStates) {
        final java.util.Set<
                        com.oracle.bmc.delegateaccesscontrol.model.ServiceProviderAction
                                .LifecycleState>
                targetStatesSet = new java.util.HashSet<>(java.util.Arrays.asList(targetStates));

        return new com.oracle.bmc.waiter.internal.SimpleWaiterImpl<>(
                executorService,
                waiter.toCallable(
                        () -> request,
                        new java.util.function.Function<
                                GetServiceProviderActionRequest,
                                GetServiceProviderActionResponse>() {
                            @Override
                            public GetServiceProviderActionResponse apply(
                                    GetServiceProviderActionRequest request) {
                                return client.getServiceProviderAction(request);
                            }
                        },
                        new java.util.function.Predicate<GetServiceProviderActionResponse>() {
                            @Override
                            public boolean test(GetServiceProviderActionResponse response) {
                                return targetStatesSet.contains(
                                        response.getServiceProviderAction().getLifecycleState());
                            }
                        },
                        false),
                request);
    }
}
