/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.datasafe;

import com.oracle.bmc.datasafe.requests.*;
import com.oracle.bmc.datasafe.responses.*;

/**
 * Collection of helper methods to produce {@link com.oracle.bmc.waiter.Waiter}s for different
 * resources of DataSafe.
 *
 * <p>The default configuration used is defined by {@link
 * com.oracle.bmc.waiter.Waiters.Waiters#DEFAULT_POLLING_WAITER}.
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20181201")
public class DataSafeWaiters {
    private final java.util.concurrent.ExecutorService executorService;
    private final DataSafe client;

    public DataSafeWaiters(java.util.concurrent.ExecutorService executorService, DataSafe client) {
        this.executorService = executorService;
        this.client = client;
    }

    /**
     * Creates a new {@link com.oracle.bmc.waiter.Waiter} using the default configuration.
     *
     * @param request the request to send
     * @param targetState the desired states to wait for. If multiple states are provided then the
     *     waiter will return once the resource reaches any of the provided states
     * @return a new {@code com.oracle.bmc.waiter.Waiter} instance
     */
    public com.oracle.bmc.waiter.Waiter<GetAlertRequest, GetAlertResponse> forAlert(
            GetAlertRequest request,
            com.oracle.bmc.datasafe.model.AlertLifecycleState... targetStates) {
        com.oracle.bmc.util.internal.Validate.notEmpty(
                targetStates, "At least one targetState must be provided");
        com.oracle.bmc.util.internal.Validate.noNullElements(
                targetStates, "Null targetState values are not permitted");

        return forAlert(
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
    public com.oracle.bmc.waiter.Waiter<GetAlertRequest, GetAlertResponse> forAlert(
            GetAlertRequest request,
            com.oracle.bmc.datasafe.model.AlertLifecycleState targetState,
            com.oracle.bmc.waiter.TerminationStrategy terminationStrategy,
            com.oracle.bmc.waiter.DelayStrategy delayStrategy) {
        com.oracle.bmc.util.internal.Validate.notNull(
                targetState, "The targetState cannot be null");

        return forAlert(
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
     * @return a new {@code Waiter} instance
     */
    public com.oracle.bmc.waiter.Waiter<GetAlertRequest, GetAlertResponse> forAlert(
            GetAlertRequest request,
            com.oracle.bmc.waiter.TerminationStrategy terminationStrategy,
            com.oracle.bmc.waiter.DelayStrategy delayStrategy,
            com.oracle.bmc.datasafe.model.AlertLifecycleState... targetStates) {
        com.oracle.bmc.util.internal.Validate.notEmpty(
                targetStates, "At least one targetState must be provided");
        com.oracle.bmc.util.internal.Validate.noNullElements(
                targetStates, "Null targetState values are not permitted");

        return forAlert(
                com.oracle.bmc.waiter.Waiters.newWaiter(terminationStrategy, delayStrategy),
                request,
                targetStates);
    }

    // Helper method to create a new Waiter for Alert.
    private com.oracle.bmc.waiter.Waiter<GetAlertRequest, GetAlertResponse> forAlert(
            com.oracle.bmc.waiter.BmcGenericWaiter waiter,
            final GetAlertRequest request,
            final com.oracle.bmc.datasafe.model.AlertLifecycleState... targetStates) {
        final java.util.Set<com.oracle.bmc.datasafe.model.AlertLifecycleState> targetStatesSet =
                new java.util.HashSet<>(java.util.Arrays.asList(targetStates));

        return new com.oracle.bmc.waiter.internal.SimpleWaiterImpl<>(
                executorService,
                waiter.toCallable(
                        () -> request,
                        new java.util.function.Function<GetAlertRequest, GetAlertResponse>() {
                            @Override
                            public GetAlertResponse apply(GetAlertRequest request) {
                                return client.getAlert(request);
                            }
                        },
                        new java.util.function.Predicate<GetAlertResponse>() {
                            @Override
                            public boolean test(GetAlertResponse response) {
                                return targetStatesSet.contains(
                                        response.getAlert().getLifecycleState());
                            }
                        },
                        false),
                request);
    }

    /**
     * Creates a new {@link com.oracle.bmc.waiter.Waiter} using the default configuration.
     *
     * @param request the request to send
     * @param targetState the desired states to wait for. If multiple states are provided then the
     *     waiter will return once the resource reaches any of the provided states
     * @return a new {@code com.oracle.bmc.waiter.Waiter} instance
     */
    public com.oracle.bmc.waiter.Waiter<GetAlertPolicyRequest, GetAlertPolicyResponse>
            forAlertPolicy(
                    GetAlertPolicyRequest request,
                    com.oracle.bmc.datasafe.model.AlertPolicyLifecycleState... targetStates) {
        com.oracle.bmc.util.internal.Validate.notEmpty(
                targetStates, "At least one targetState must be provided");
        com.oracle.bmc.util.internal.Validate.noNullElements(
                targetStates, "Null targetState values are not permitted");

        return forAlertPolicy(
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
    public com.oracle.bmc.waiter.Waiter<GetAlertPolicyRequest, GetAlertPolicyResponse>
            forAlertPolicy(
                    GetAlertPolicyRequest request,
                    com.oracle.bmc.datasafe.model.AlertPolicyLifecycleState targetState,
                    com.oracle.bmc.waiter.TerminationStrategy terminationStrategy,
                    com.oracle.bmc.waiter.DelayStrategy delayStrategy) {
        com.oracle.bmc.util.internal.Validate.notNull(
                targetState, "The targetState cannot be null");

        return forAlertPolicy(
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
     * @return a new {@code Waiter} instance
     */
    public com.oracle.bmc.waiter.Waiter<GetAlertPolicyRequest, GetAlertPolicyResponse>
            forAlertPolicy(
                    GetAlertPolicyRequest request,
                    com.oracle.bmc.waiter.TerminationStrategy terminationStrategy,
                    com.oracle.bmc.waiter.DelayStrategy delayStrategy,
                    com.oracle.bmc.datasafe.model.AlertPolicyLifecycleState... targetStates) {
        com.oracle.bmc.util.internal.Validate.notEmpty(
                targetStates, "At least one targetState must be provided");
        com.oracle.bmc.util.internal.Validate.noNullElements(
                targetStates, "Null targetState values are not permitted");

        return forAlertPolicy(
                com.oracle.bmc.waiter.Waiters.newWaiter(terminationStrategy, delayStrategy),
                request,
                targetStates);
    }

    // Helper method to create a new Waiter for AlertPolicy.
    private com.oracle.bmc.waiter.Waiter<GetAlertPolicyRequest, GetAlertPolicyResponse>
            forAlertPolicy(
                    com.oracle.bmc.waiter.BmcGenericWaiter waiter,
                    final GetAlertPolicyRequest request,
                    final com.oracle.bmc.datasafe.model.AlertPolicyLifecycleState... targetStates) {
        final java.util.Set<com.oracle.bmc.datasafe.model.AlertPolicyLifecycleState>
                targetStatesSet = new java.util.HashSet<>(java.util.Arrays.asList(targetStates));

        return new com.oracle.bmc.waiter.internal.SimpleWaiterImpl<>(
                executorService,
                waiter.toCallable(
                        () -> request,
                        new java.util.function.Function<
                                GetAlertPolicyRequest, GetAlertPolicyResponse>() {
                            @Override
                            public GetAlertPolicyResponse apply(GetAlertPolicyRequest request) {
                                return client.getAlertPolicy(request);
                            }
                        },
                        new java.util.function.Predicate<GetAlertPolicyResponse>() {
                            @Override
                            public boolean test(GetAlertPolicyResponse response) {
                                return targetStatesSet.contains(
                                        response.getAlertPolicy().getLifecycleState());
                            }
                        },
                        targetStatesSet.contains(
                                com.oracle.bmc.datasafe.model.AlertPolicyLifecycleState.Deleted)),
                request);
    }

    /**
     * Creates a new {@link com.oracle.bmc.waiter.Waiter} using the default configuration.
     *
     * @param request the request to send
     * @param targetState the desired states to wait for. If multiple states are provided then the
     *     waiter will return once the resource reaches any of the provided states
     * @return a new {@code com.oracle.bmc.waiter.Waiter} instance
     */
    public com.oracle.bmc.waiter.Waiter<
                    GetAuditArchiveRetrievalRequest, GetAuditArchiveRetrievalResponse>
            forAuditArchiveRetrieval(
                    GetAuditArchiveRetrievalRequest request,
                    com.oracle.bmc.datasafe.model.AuditArchiveRetrievalLifecycleState...
                            targetStates) {
        com.oracle.bmc.util.internal.Validate.notEmpty(
                targetStates, "At least one targetState must be provided");
        com.oracle.bmc.util.internal.Validate.noNullElements(
                targetStates, "Null targetState values are not permitted");

        return forAuditArchiveRetrieval(
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
                    GetAuditArchiveRetrievalRequest, GetAuditArchiveRetrievalResponse>
            forAuditArchiveRetrieval(
                    GetAuditArchiveRetrievalRequest request,
                    com.oracle.bmc.datasafe.model.AuditArchiveRetrievalLifecycleState targetState,
                    com.oracle.bmc.waiter.TerminationStrategy terminationStrategy,
                    com.oracle.bmc.waiter.DelayStrategy delayStrategy) {
        com.oracle.bmc.util.internal.Validate.notNull(
                targetState, "The targetState cannot be null");

        return forAuditArchiveRetrieval(
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
     * @return a new {@code Waiter} instance
     */
    public com.oracle.bmc.waiter.Waiter<
                    GetAuditArchiveRetrievalRequest, GetAuditArchiveRetrievalResponse>
            forAuditArchiveRetrieval(
                    GetAuditArchiveRetrievalRequest request,
                    com.oracle.bmc.waiter.TerminationStrategy terminationStrategy,
                    com.oracle.bmc.waiter.DelayStrategy delayStrategy,
                    com.oracle.bmc.datasafe.model.AuditArchiveRetrievalLifecycleState...
                            targetStates) {
        com.oracle.bmc.util.internal.Validate.notEmpty(
                targetStates, "At least one targetState must be provided");
        com.oracle.bmc.util.internal.Validate.noNullElements(
                targetStates, "Null targetState values are not permitted");

        return forAuditArchiveRetrieval(
                com.oracle.bmc.waiter.Waiters.newWaiter(terminationStrategy, delayStrategy),
                request,
                targetStates);
    }

    // Helper method to create a new Waiter for AuditArchiveRetrieval.
    private com.oracle.bmc.waiter.Waiter<
                    GetAuditArchiveRetrievalRequest, GetAuditArchiveRetrievalResponse>
            forAuditArchiveRetrieval(
                    com.oracle.bmc.waiter.BmcGenericWaiter waiter,
                    final GetAuditArchiveRetrievalRequest request,
                    final com.oracle.bmc.datasafe.model.AuditArchiveRetrievalLifecycleState...
                            targetStates) {
        final java.util.Set<com.oracle.bmc.datasafe.model.AuditArchiveRetrievalLifecycleState>
                targetStatesSet = new java.util.HashSet<>(java.util.Arrays.asList(targetStates));

        return new com.oracle.bmc.waiter.internal.SimpleWaiterImpl<>(
                executorService,
                waiter.toCallable(
                        () -> request,
                        new java.util.function.Function<
                                GetAuditArchiveRetrievalRequest,
                                GetAuditArchiveRetrievalResponse>() {
                            @Override
                            public GetAuditArchiveRetrievalResponse apply(
                                    GetAuditArchiveRetrievalRequest request) {
                                return client.getAuditArchiveRetrieval(request);
                            }
                        },
                        new java.util.function.Predicate<GetAuditArchiveRetrievalResponse>() {
                            @Override
                            public boolean test(GetAuditArchiveRetrievalResponse response) {
                                return targetStatesSet.contains(
                                        response.getAuditArchiveRetrieval().getLifecycleState());
                            }
                        },
                        targetStatesSet.contains(
                                com.oracle.bmc.datasafe.model.AuditArchiveRetrievalLifecycleState
                                        .Deleted)),
                request);
    }

    /**
     * Creates a new {@link com.oracle.bmc.waiter.Waiter} using the default configuration.
     *
     * @param request the request to send
     * @param targetState the desired states to wait for. If multiple states are provided then the
     *     waiter will return once the resource reaches any of the provided states
     * @return a new {@code com.oracle.bmc.waiter.Waiter} instance
     */
    public com.oracle.bmc.waiter.Waiter<GetAuditPolicyRequest, GetAuditPolicyResponse>
            forAuditPolicy(
                    GetAuditPolicyRequest request,
                    com.oracle.bmc.datasafe.model.AuditPolicyLifecycleState... targetStates) {
        com.oracle.bmc.util.internal.Validate.notEmpty(
                targetStates, "At least one targetState must be provided");
        com.oracle.bmc.util.internal.Validate.noNullElements(
                targetStates, "Null targetState values are not permitted");

        return forAuditPolicy(
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
    public com.oracle.bmc.waiter.Waiter<GetAuditPolicyRequest, GetAuditPolicyResponse>
            forAuditPolicy(
                    GetAuditPolicyRequest request,
                    com.oracle.bmc.datasafe.model.AuditPolicyLifecycleState targetState,
                    com.oracle.bmc.waiter.TerminationStrategy terminationStrategy,
                    com.oracle.bmc.waiter.DelayStrategy delayStrategy) {
        com.oracle.bmc.util.internal.Validate.notNull(
                targetState, "The targetState cannot be null");

        return forAuditPolicy(
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
     * @return a new {@code Waiter} instance
     */
    public com.oracle.bmc.waiter.Waiter<GetAuditPolicyRequest, GetAuditPolicyResponse>
            forAuditPolicy(
                    GetAuditPolicyRequest request,
                    com.oracle.bmc.waiter.TerminationStrategy terminationStrategy,
                    com.oracle.bmc.waiter.DelayStrategy delayStrategy,
                    com.oracle.bmc.datasafe.model.AuditPolicyLifecycleState... targetStates) {
        com.oracle.bmc.util.internal.Validate.notEmpty(
                targetStates, "At least one targetState must be provided");
        com.oracle.bmc.util.internal.Validate.noNullElements(
                targetStates, "Null targetState values are not permitted");

        return forAuditPolicy(
                com.oracle.bmc.waiter.Waiters.newWaiter(terminationStrategy, delayStrategy),
                request,
                targetStates);
    }

    // Helper method to create a new Waiter for AuditPolicy.
    private com.oracle.bmc.waiter.Waiter<GetAuditPolicyRequest, GetAuditPolicyResponse>
            forAuditPolicy(
                    com.oracle.bmc.waiter.BmcGenericWaiter waiter,
                    final GetAuditPolicyRequest request,
                    final com.oracle.bmc.datasafe.model.AuditPolicyLifecycleState... targetStates) {
        final java.util.Set<com.oracle.bmc.datasafe.model.AuditPolicyLifecycleState>
                targetStatesSet = new java.util.HashSet<>(java.util.Arrays.asList(targetStates));

        return new com.oracle.bmc.waiter.internal.SimpleWaiterImpl<>(
                executorService,
                waiter.toCallable(
                        () -> request,
                        new java.util.function.Function<
                                GetAuditPolicyRequest, GetAuditPolicyResponse>() {
                            @Override
                            public GetAuditPolicyResponse apply(GetAuditPolicyRequest request) {
                                return client.getAuditPolicy(request);
                            }
                        },
                        new java.util.function.Predicate<GetAuditPolicyResponse>() {
                            @Override
                            public boolean test(GetAuditPolicyResponse response) {
                                return targetStatesSet.contains(
                                        response.getAuditPolicy().getLifecycleState());
                            }
                        },
                        targetStatesSet.contains(
                                com.oracle.bmc.datasafe.model.AuditPolicyLifecycleState.Deleted)),
                request);
    }

    /**
     * Creates a new {@link com.oracle.bmc.waiter.Waiter} using the default configuration.
     *
     * @param request the request to send
     * @param targetState the desired states to wait for. If multiple states are provided then the
     *     waiter will return once the resource reaches any of the provided states
     * @return a new {@code com.oracle.bmc.waiter.Waiter} instance
     */
    public com.oracle.bmc.waiter.Waiter<GetAuditProfileRequest, GetAuditProfileResponse>
            forAuditProfile(
                    GetAuditProfileRequest request,
                    com.oracle.bmc.datasafe.model.AuditProfileLifecycleState... targetStates) {
        com.oracle.bmc.util.internal.Validate.notEmpty(
                targetStates, "At least one targetState must be provided");
        com.oracle.bmc.util.internal.Validate.noNullElements(
                targetStates, "Null targetState values are not permitted");

        return forAuditProfile(
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
    public com.oracle.bmc.waiter.Waiter<GetAuditProfileRequest, GetAuditProfileResponse>
            forAuditProfile(
                    GetAuditProfileRequest request,
                    com.oracle.bmc.datasafe.model.AuditProfileLifecycleState targetState,
                    com.oracle.bmc.waiter.TerminationStrategy terminationStrategy,
                    com.oracle.bmc.waiter.DelayStrategy delayStrategy) {
        com.oracle.bmc.util.internal.Validate.notNull(
                targetState, "The targetState cannot be null");

        return forAuditProfile(
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
     * @return a new {@code Waiter} instance
     */
    public com.oracle.bmc.waiter.Waiter<GetAuditProfileRequest, GetAuditProfileResponse>
            forAuditProfile(
                    GetAuditProfileRequest request,
                    com.oracle.bmc.waiter.TerminationStrategy terminationStrategy,
                    com.oracle.bmc.waiter.DelayStrategy delayStrategy,
                    com.oracle.bmc.datasafe.model.AuditProfileLifecycleState... targetStates) {
        com.oracle.bmc.util.internal.Validate.notEmpty(
                targetStates, "At least one targetState must be provided");
        com.oracle.bmc.util.internal.Validate.noNullElements(
                targetStates, "Null targetState values are not permitted");

        return forAuditProfile(
                com.oracle.bmc.waiter.Waiters.newWaiter(terminationStrategy, delayStrategy),
                request,
                targetStates);
    }

    // Helper method to create a new Waiter for AuditProfile.
    private com.oracle.bmc.waiter.Waiter<GetAuditProfileRequest, GetAuditProfileResponse>
            forAuditProfile(
                    com.oracle.bmc.waiter.BmcGenericWaiter waiter,
                    final GetAuditProfileRequest request,
                    final com.oracle.bmc.datasafe.model.AuditProfileLifecycleState...
                            targetStates) {
        final java.util.Set<com.oracle.bmc.datasafe.model.AuditProfileLifecycleState>
                targetStatesSet = new java.util.HashSet<>(java.util.Arrays.asList(targetStates));

        return new com.oracle.bmc.waiter.internal.SimpleWaiterImpl<>(
                executorService,
                waiter.toCallable(
                        () -> request,
                        new java.util.function.Function<
                                GetAuditProfileRequest, GetAuditProfileResponse>() {
                            @Override
                            public GetAuditProfileResponse apply(GetAuditProfileRequest request) {
                                return client.getAuditProfile(request);
                            }
                        },
                        new java.util.function.Predicate<GetAuditProfileResponse>() {
                            @Override
                            public boolean test(GetAuditProfileResponse response) {
                                return targetStatesSet.contains(
                                        response.getAuditProfile().getLifecycleState());
                            }
                        },
                        targetStatesSet.contains(
                                com.oracle.bmc.datasafe.model.AuditProfileLifecycleState.Deleted)),
                request);
    }

    /**
     * Creates a new {@link com.oracle.bmc.waiter.Waiter} using the default configuration.
     *
     * @param request the request to send
     * @param targetState the desired states to wait for. If multiple states are provided then the
     *     waiter will return once the resource reaches any of the provided states
     * @return a new {@code com.oracle.bmc.waiter.Waiter} instance
     */
    public com.oracle.bmc.waiter.Waiter<GetAuditTrailRequest, GetAuditTrailResponse> forAuditTrail(
            GetAuditTrailRequest request,
            com.oracle.bmc.datasafe.model.AuditTrailLifecycleState... targetStates) {
        com.oracle.bmc.util.internal.Validate.notEmpty(
                targetStates, "At least one targetState must be provided");
        com.oracle.bmc.util.internal.Validate.noNullElements(
                targetStates, "Null targetState values are not permitted");

        return forAuditTrail(
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
    public com.oracle.bmc.waiter.Waiter<GetAuditTrailRequest, GetAuditTrailResponse> forAuditTrail(
            GetAuditTrailRequest request,
            com.oracle.bmc.datasafe.model.AuditTrailLifecycleState targetState,
            com.oracle.bmc.waiter.TerminationStrategy terminationStrategy,
            com.oracle.bmc.waiter.DelayStrategy delayStrategy) {
        com.oracle.bmc.util.internal.Validate.notNull(
                targetState, "The targetState cannot be null");

        return forAuditTrail(
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
     * @return a new {@code Waiter} instance
     */
    public com.oracle.bmc.waiter.Waiter<GetAuditTrailRequest, GetAuditTrailResponse> forAuditTrail(
            GetAuditTrailRequest request,
            com.oracle.bmc.waiter.TerminationStrategy terminationStrategy,
            com.oracle.bmc.waiter.DelayStrategy delayStrategy,
            com.oracle.bmc.datasafe.model.AuditTrailLifecycleState... targetStates) {
        com.oracle.bmc.util.internal.Validate.notEmpty(
                targetStates, "At least one targetState must be provided");
        com.oracle.bmc.util.internal.Validate.noNullElements(
                targetStates, "Null targetState values are not permitted");

        return forAuditTrail(
                com.oracle.bmc.waiter.Waiters.newWaiter(terminationStrategy, delayStrategy),
                request,
                targetStates);
    }

    // Helper method to create a new Waiter for AuditTrail.
    private com.oracle.bmc.waiter.Waiter<GetAuditTrailRequest, GetAuditTrailResponse> forAuditTrail(
            com.oracle.bmc.waiter.BmcGenericWaiter waiter,
            final GetAuditTrailRequest request,
            final com.oracle.bmc.datasafe.model.AuditTrailLifecycleState... targetStates) {
        final java.util.Set<com.oracle.bmc.datasafe.model.AuditTrailLifecycleState>
                targetStatesSet = new java.util.HashSet<>(java.util.Arrays.asList(targetStates));

        return new com.oracle.bmc.waiter.internal.SimpleWaiterImpl<>(
                executorService,
                waiter.toCallable(
                        () -> request,
                        new java.util.function.Function<
                                GetAuditTrailRequest, GetAuditTrailResponse>() {
                            @Override
                            public GetAuditTrailResponse apply(GetAuditTrailRequest request) {
                                return client.getAuditTrail(request);
                            }
                        },
                        new java.util.function.Predicate<GetAuditTrailResponse>() {
                            @Override
                            public boolean test(GetAuditTrailResponse response) {
                                return targetStatesSet.contains(
                                        response.getAuditTrail().getLifecycleState());
                            }
                        },
                        false),
                request);
    }

    /**
     * Creates a new {@link com.oracle.bmc.waiter.Waiter} using the default configuration.
     *
     * @param request the request to send
     * @param targetState the desired states to wait for. If multiple states are provided then the
     *     waiter will return once the resource reaches any of the provided states
     * @return a new {@code com.oracle.bmc.waiter.Waiter} instance
     */
    public com.oracle.bmc.waiter.Waiter<
                    GetDataSafeConfigurationRequest, GetDataSafeConfigurationResponse>
            forDataSafeConfiguration(
                    GetDataSafeConfigurationRequest request,
                    com.oracle.bmc.datasafe.model.LifecycleState... targetStates) {
        com.oracle.bmc.util.internal.Validate.notEmpty(
                targetStates, "At least one targetState must be provided");
        com.oracle.bmc.util.internal.Validate.noNullElements(
                targetStates, "Null targetState values are not permitted");

        return forDataSafeConfiguration(
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
                    GetDataSafeConfigurationRequest, GetDataSafeConfigurationResponse>
            forDataSafeConfiguration(
                    GetDataSafeConfigurationRequest request,
                    com.oracle.bmc.datasafe.model.LifecycleState targetState,
                    com.oracle.bmc.waiter.TerminationStrategy terminationStrategy,
                    com.oracle.bmc.waiter.DelayStrategy delayStrategy) {
        com.oracle.bmc.util.internal.Validate.notNull(
                targetState, "The targetState cannot be null");

        return forDataSafeConfiguration(
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
     * @return a new {@code Waiter} instance
     */
    public com.oracle.bmc.waiter.Waiter<
                    GetDataSafeConfigurationRequest, GetDataSafeConfigurationResponse>
            forDataSafeConfiguration(
                    GetDataSafeConfigurationRequest request,
                    com.oracle.bmc.waiter.TerminationStrategy terminationStrategy,
                    com.oracle.bmc.waiter.DelayStrategy delayStrategy,
                    com.oracle.bmc.datasafe.model.LifecycleState... targetStates) {
        com.oracle.bmc.util.internal.Validate.notEmpty(
                targetStates, "At least one targetState must be provided");
        com.oracle.bmc.util.internal.Validate.noNullElements(
                targetStates, "Null targetState values are not permitted");

        return forDataSafeConfiguration(
                com.oracle.bmc.waiter.Waiters.newWaiter(terminationStrategy, delayStrategy),
                request,
                targetStates);
    }

    // Helper method to create a new Waiter for DataSafeConfiguration.
    private com.oracle.bmc.waiter.Waiter<
                    GetDataSafeConfigurationRequest, GetDataSafeConfigurationResponse>
            forDataSafeConfiguration(
                    com.oracle.bmc.waiter.BmcGenericWaiter waiter,
                    final GetDataSafeConfigurationRequest request,
                    final com.oracle.bmc.datasafe.model.LifecycleState... targetStates) {
        final java.util.Set<com.oracle.bmc.datasafe.model.LifecycleState> targetStatesSet =
                new java.util.HashSet<>(java.util.Arrays.asList(targetStates));

        return new com.oracle.bmc.waiter.internal.SimpleWaiterImpl<>(
                executorService,
                waiter.toCallable(
                        () -> request,
                        new java.util.function.Function<
                                GetDataSafeConfigurationRequest,
                                GetDataSafeConfigurationResponse>() {
                            @Override
                            public GetDataSafeConfigurationResponse apply(
                                    GetDataSafeConfigurationRequest request) {
                                return client.getDataSafeConfiguration(request);
                            }
                        },
                        new java.util.function.Predicate<GetDataSafeConfigurationResponse>() {
                            @Override
                            public boolean test(GetDataSafeConfigurationResponse response) {
                                return targetStatesSet.contains(
                                        response.getDataSafeConfiguration().getLifecycleState());
                            }
                        },
                        targetStatesSet.contains(
                                com.oracle.bmc.datasafe.model.LifecycleState.Deleted)),
                request);
    }

    /**
     * Creates a new {@link com.oracle.bmc.waiter.Waiter} using the default configuration.
     *
     * @param request the request to send
     * @param targetState the desired states to wait for. If multiple states are provided then the
     *     waiter will return once the resource reaches any of the provided states
     * @return a new {@code com.oracle.bmc.waiter.Waiter} instance
     */
    public com.oracle.bmc.waiter.Waiter<
                    GetDataSafePrivateEndpointRequest, GetDataSafePrivateEndpointResponse>
            forDataSafePrivateEndpoint(
                    GetDataSafePrivateEndpointRequest request,
                    com.oracle.bmc.datasafe.model.LifecycleState... targetStates) {
        com.oracle.bmc.util.internal.Validate.notEmpty(
                targetStates, "At least one targetState must be provided");
        com.oracle.bmc.util.internal.Validate.noNullElements(
                targetStates, "Null targetState values are not permitted");

        return forDataSafePrivateEndpoint(
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
                    GetDataSafePrivateEndpointRequest, GetDataSafePrivateEndpointResponse>
            forDataSafePrivateEndpoint(
                    GetDataSafePrivateEndpointRequest request,
                    com.oracle.bmc.datasafe.model.LifecycleState targetState,
                    com.oracle.bmc.waiter.TerminationStrategy terminationStrategy,
                    com.oracle.bmc.waiter.DelayStrategy delayStrategy) {
        com.oracle.bmc.util.internal.Validate.notNull(
                targetState, "The targetState cannot be null");

        return forDataSafePrivateEndpoint(
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
     * @return a new {@code Waiter} instance
     */
    public com.oracle.bmc.waiter.Waiter<
                    GetDataSafePrivateEndpointRequest, GetDataSafePrivateEndpointResponse>
            forDataSafePrivateEndpoint(
                    GetDataSafePrivateEndpointRequest request,
                    com.oracle.bmc.waiter.TerminationStrategy terminationStrategy,
                    com.oracle.bmc.waiter.DelayStrategy delayStrategy,
                    com.oracle.bmc.datasafe.model.LifecycleState... targetStates) {
        com.oracle.bmc.util.internal.Validate.notEmpty(
                targetStates, "At least one targetState must be provided");
        com.oracle.bmc.util.internal.Validate.noNullElements(
                targetStates, "Null targetState values are not permitted");

        return forDataSafePrivateEndpoint(
                com.oracle.bmc.waiter.Waiters.newWaiter(terminationStrategy, delayStrategy),
                request,
                targetStates);
    }

    // Helper method to create a new Waiter for DataSafePrivateEndpoint.
    private com.oracle.bmc.waiter.Waiter<
                    GetDataSafePrivateEndpointRequest, GetDataSafePrivateEndpointResponse>
            forDataSafePrivateEndpoint(
                    com.oracle.bmc.waiter.BmcGenericWaiter waiter,
                    final GetDataSafePrivateEndpointRequest request,
                    final com.oracle.bmc.datasafe.model.LifecycleState... targetStates) {
        final java.util.Set<com.oracle.bmc.datasafe.model.LifecycleState> targetStatesSet =
                new java.util.HashSet<>(java.util.Arrays.asList(targetStates));

        return new com.oracle.bmc.waiter.internal.SimpleWaiterImpl<>(
                executorService,
                waiter.toCallable(
                        () -> request,
                        new java.util.function.Function<
                                GetDataSafePrivateEndpointRequest,
                                GetDataSafePrivateEndpointResponse>() {
                            @Override
                            public GetDataSafePrivateEndpointResponse apply(
                                    GetDataSafePrivateEndpointRequest request) {
                                return client.getDataSafePrivateEndpoint(request);
                            }
                        },
                        new java.util.function.Predicate<GetDataSafePrivateEndpointResponse>() {
                            @Override
                            public boolean test(GetDataSafePrivateEndpointResponse response) {
                                return targetStatesSet.contains(
                                        response.getDataSafePrivateEndpoint().getLifecycleState());
                            }
                        },
                        targetStatesSet.contains(
                                com.oracle.bmc.datasafe.model.LifecycleState.Deleted)),
                request);
    }

    /**
     * Creates a new {@link com.oracle.bmc.waiter.Waiter} using the default configuration.
     *
     * @param request the request to send
     * @param targetState the desired states to wait for. If multiple states are provided then the
     *     waiter will return once the resource reaches any of the provided states
     * @return a new {@code com.oracle.bmc.waiter.Waiter} instance
     */
    public com.oracle.bmc.waiter.Waiter<GetDiscoveryJobRequest, GetDiscoveryJobResponse>
            forDiscoveryJob(
                    GetDiscoveryJobRequest request,
                    com.oracle.bmc.datasafe.model.DiscoveryLifecycleState... targetStates) {
        com.oracle.bmc.util.internal.Validate.notEmpty(
                targetStates, "At least one targetState must be provided");
        com.oracle.bmc.util.internal.Validate.noNullElements(
                targetStates, "Null targetState values are not permitted");

        return forDiscoveryJob(
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
    public com.oracle.bmc.waiter.Waiter<GetDiscoveryJobRequest, GetDiscoveryJobResponse>
            forDiscoveryJob(
                    GetDiscoveryJobRequest request,
                    com.oracle.bmc.datasafe.model.DiscoveryLifecycleState targetState,
                    com.oracle.bmc.waiter.TerminationStrategy terminationStrategy,
                    com.oracle.bmc.waiter.DelayStrategy delayStrategy) {
        com.oracle.bmc.util.internal.Validate.notNull(
                targetState, "The targetState cannot be null");

        return forDiscoveryJob(
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
     * @return a new {@code Waiter} instance
     */
    public com.oracle.bmc.waiter.Waiter<GetDiscoveryJobRequest, GetDiscoveryJobResponse>
            forDiscoveryJob(
                    GetDiscoveryJobRequest request,
                    com.oracle.bmc.waiter.TerminationStrategy terminationStrategy,
                    com.oracle.bmc.waiter.DelayStrategy delayStrategy,
                    com.oracle.bmc.datasafe.model.DiscoveryLifecycleState... targetStates) {
        com.oracle.bmc.util.internal.Validate.notEmpty(
                targetStates, "At least one targetState must be provided");
        com.oracle.bmc.util.internal.Validate.noNullElements(
                targetStates, "Null targetState values are not permitted");

        return forDiscoveryJob(
                com.oracle.bmc.waiter.Waiters.newWaiter(terminationStrategy, delayStrategy),
                request,
                targetStates);
    }

    // Helper method to create a new Waiter for DiscoveryJob.
    private com.oracle.bmc.waiter.Waiter<GetDiscoveryJobRequest, GetDiscoveryJobResponse>
            forDiscoveryJob(
                    com.oracle.bmc.waiter.BmcGenericWaiter waiter,
                    final GetDiscoveryJobRequest request,
                    final com.oracle.bmc.datasafe.model.DiscoveryLifecycleState... targetStates) {
        final java.util.Set<com.oracle.bmc.datasafe.model.DiscoveryLifecycleState> targetStatesSet =
                new java.util.HashSet<>(java.util.Arrays.asList(targetStates));

        return new com.oracle.bmc.waiter.internal.SimpleWaiterImpl<>(
                executorService,
                waiter.toCallable(
                        () -> request,
                        new java.util.function.Function<
                                GetDiscoveryJobRequest, GetDiscoveryJobResponse>() {
                            @Override
                            public GetDiscoveryJobResponse apply(GetDiscoveryJobRequest request) {
                                return client.getDiscoveryJob(request);
                            }
                        },
                        new java.util.function.Predicate<GetDiscoveryJobResponse>() {
                            @Override
                            public boolean test(GetDiscoveryJobResponse response) {
                                return targetStatesSet.contains(
                                        response.getDiscoveryJob().getLifecycleState());
                            }
                        },
                        targetStatesSet.contains(
                                com.oracle.bmc.datasafe.model.DiscoveryLifecycleState.Deleted)),
                request);
    }

    /**
     * Creates a new {@link com.oracle.bmc.waiter.Waiter} using the default configuration.
     *
     * @param request the request to send
     * @param targetState the desired states to wait for. If multiple states are provided then the
     *     waiter will return once the resource reaches any of the provided states
     * @return a new {@code com.oracle.bmc.waiter.Waiter} instance
     */
    public com.oracle.bmc.waiter.Waiter<
                    GetLibraryMaskingFormatRequest, GetLibraryMaskingFormatResponse>
            forLibraryMaskingFormat(
                    GetLibraryMaskingFormatRequest request,
                    com.oracle.bmc.datasafe.model.MaskingLifecycleState... targetStates) {
        com.oracle.bmc.util.internal.Validate.notEmpty(
                targetStates, "At least one targetState must be provided");
        com.oracle.bmc.util.internal.Validate.noNullElements(
                targetStates, "Null targetState values are not permitted");

        return forLibraryMaskingFormat(
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
                    GetLibraryMaskingFormatRequest, GetLibraryMaskingFormatResponse>
            forLibraryMaskingFormat(
                    GetLibraryMaskingFormatRequest request,
                    com.oracle.bmc.datasafe.model.MaskingLifecycleState targetState,
                    com.oracle.bmc.waiter.TerminationStrategy terminationStrategy,
                    com.oracle.bmc.waiter.DelayStrategy delayStrategy) {
        com.oracle.bmc.util.internal.Validate.notNull(
                targetState, "The targetState cannot be null");

        return forLibraryMaskingFormat(
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
     * @return a new {@code Waiter} instance
     */
    public com.oracle.bmc.waiter.Waiter<
                    GetLibraryMaskingFormatRequest, GetLibraryMaskingFormatResponse>
            forLibraryMaskingFormat(
                    GetLibraryMaskingFormatRequest request,
                    com.oracle.bmc.waiter.TerminationStrategy terminationStrategy,
                    com.oracle.bmc.waiter.DelayStrategy delayStrategy,
                    com.oracle.bmc.datasafe.model.MaskingLifecycleState... targetStates) {
        com.oracle.bmc.util.internal.Validate.notEmpty(
                targetStates, "At least one targetState must be provided");
        com.oracle.bmc.util.internal.Validate.noNullElements(
                targetStates, "Null targetState values are not permitted");

        return forLibraryMaskingFormat(
                com.oracle.bmc.waiter.Waiters.newWaiter(terminationStrategy, delayStrategy),
                request,
                targetStates);
    }

    // Helper method to create a new Waiter for LibraryMaskingFormat.
    private com.oracle.bmc.waiter.Waiter<
                    GetLibraryMaskingFormatRequest, GetLibraryMaskingFormatResponse>
            forLibraryMaskingFormat(
                    com.oracle.bmc.waiter.BmcGenericWaiter waiter,
                    final GetLibraryMaskingFormatRequest request,
                    final com.oracle.bmc.datasafe.model.MaskingLifecycleState... targetStates) {
        final java.util.Set<com.oracle.bmc.datasafe.model.MaskingLifecycleState> targetStatesSet =
                new java.util.HashSet<>(java.util.Arrays.asList(targetStates));

        return new com.oracle.bmc.waiter.internal.SimpleWaiterImpl<>(
                executorService,
                waiter.toCallable(
                        () -> request,
                        new java.util.function.Function<
                                GetLibraryMaskingFormatRequest, GetLibraryMaskingFormatResponse>() {
                            @Override
                            public GetLibraryMaskingFormatResponse apply(
                                    GetLibraryMaskingFormatRequest request) {
                                return client.getLibraryMaskingFormat(request);
                            }
                        },
                        new java.util.function.Predicate<GetLibraryMaskingFormatResponse>() {
                            @Override
                            public boolean test(GetLibraryMaskingFormatResponse response) {
                                return targetStatesSet.contains(
                                        response.getLibraryMaskingFormat().getLifecycleState());
                            }
                        },
                        targetStatesSet.contains(
                                com.oracle.bmc.datasafe.model.MaskingLifecycleState.Deleted)),
                request);
    }

    /**
     * Creates a new {@link com.oracle.bmc.waiter.Waiter} using the default configuration.
     *
     * @param request the request to send
     * @param targetState the desired states to wait for. If multiple states are provided then the
     *     waiter will return once the resource reaches any of the provided states
     * @return a new {@code com.oracle.bmc.waiter.Waiter} instance
     */
    public com.oracle.bmc.waiter.Waiter<GetMaskingColumnRequest, GetMaskingColumnResponse>
            forMaskingColumn(
                    GetMaskingColumnRequest request,
                    com.oracle.bmc.datasafe.model.MaskingColumnLifecycleState... targetStates) {
        com.oracle.bmc.util.internal.Validate.notEmpty(
                targetStates, "At least one targetState must be provided");
        com.oracle.bmc.util.internal.Validate.noNullElements(
                targetStates, "Null targetState values are not permitted");

        return forMaskingColumn(
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
    public com.oracle.bmc.waiter.Waiter<GetMaskingColumnRequest, GetMaskingColumnResponse>
            forMaskingColumn(
                    GetMaskingColumnRequest request,
                    com.oracle.bmc.datasafe.model.MaskingColumnLifecycleState targetState,
                    com.oracle.bmc.waiter.TerminationStrategy terminationStrategy,
                    com.oracle.bmc.waiter.DelayStrategy delayStrategy) {
        com.oracle.bmc.util.internal.Validate.notNull(
                targetState, "The targetState cannot be null");

        return forMaskingColumn(
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
     * @return a new {@code Waiter} instance
     */
    public com.oracle.bmc.waiter.Waiter<GetMaskingColumnRequest, GetMaskingColumnResponse>
            forMaskingColumn(
                    GetMaskingColumnRequest request,
                    com.oracle.bmc.waiter.TerminationStrategy terminationStrategy,
                    com.oracle.bmc.waiter.DelayStrategy delayStrategy,
                    com.oracle.bmc.datasafe.model.MaskingColumnLifecycleState... targetStates) {
        com.oracle.bmc.util.internal.Validate.notEmpty(
                targetStates, "At least one targetState must be provided");
        com.oracle.bmc.util.internal.Validate.noNullElements(
                targetStates, "Null targetState values are not permitted");

        return forMaskingColumn(
                com.oracle.bmc.waiter.Waiters.newWaiter(terminationStrategy, delayStrategy),
                request,
                targetStates);
    }

    // Helper method to create a new Waiter for MaskingColumn.
    private com.oracle.bmc.waiter.Waiter<GetMaskingColumnRequest, GetMaskingColumnResponse>
            forMaskingColumn(
                    com.oracle.bmc.waiter.BmcGenericWaiter waiter,
                    final GetMaskingColumnRequest request,
                    final com.oracle.bmc.datasafe.model.MaskingColumnLifecycleState...
                            targetStates) {
        final java.util.Set<com.oracle.bmc.datasafe.model.MaskingColumnLifecycleState>
                targetStatesSet = new java.util.HashSet<>(java.util.Arrays.asList(targetStates));

        return new com.oracle.bmc.waiter.internal.SimpleWaiterImpl<>(
                executorService,
                waiter.toCallable(
                        () -> request,
                        new java.util.function.Function<
                                GetMaskingColumnRequest, GetMaskingColumnResponse>() {
                            @Override
                            public GetMaskingColumnResponse apply(GetMaskingColumnRequest request) {
                                return client.getMaskingColumn(request);
                            }
                        },
                        new java.util.function.Predicate<GetMaskingColumnResponse>() {
                            @Override
                            public boolean test(GetMaskingColumnResponse response) {
                                return targetStatesSet.contains(
                                        response.getMaskingColumn().getLifecycleState());
                            }
                        },
                        false),
                request);
    }

    /**
     * Creates a new {@link com.oracle.bmc.waiter.Waiter} using the default configuration.
     *
     * @param request the request to send
     * @param targetState the desired states to wait for. If multiple states are provided then the
     *     waiter will return once the resource reaches any of the provided states
     * @return a new {@code com.oracle.bmc.waiter.Waiter} instance
     */
    public com.oracle.bmc.waiter.Waiter<GetMaskingPolicyRequest, GetMaskingPolicyResponse>
            forMaskingPolicy(
                    GetMaskingPolicyRequest request,
                    com.oracle.bmc.datasafe.model.MaskingLifecycleState... targetStates) {
        com.oracle.bmc.util.internal.Validate.notEmpty(
                targetStates, "At least one targetState must be provided");
        com.oracle.bmc.util.internal.Validate.noNullElements(
                targetStates, "Null targetState values are not permitted");

        return forMaskingPolicy(
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
    public com.oracle.bmc.waiter.Waiter<GetMaskingPolicyRequest, GetMaskingPolicyResponse>
            forMaskingPolicy(
                    GetMaskingPolicyRequest request,
                    com.oracle.bmc.datasafe.model.MaskingLifecycleState targetState,
                    com.oracle.bmc.waiter.TerminationStrategy terminationStrategy,
                    com.oracle.bmc.waiter.DelayStrategy delayStrategy) {
        com.oracle.bmc.util.internal.Validate.notNull(
                targetState, "The targetState cannot be null");

        return forMaskingPolicy(
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
     * @return a new {@code Waiter} instance
     */
    public com.oracle.bmc.waiter.Waiter<GetMaskingPolicyRequest, GetMaskingPolicyResponse>
            forMaskingPolicy(
                    GetMaskingPolicyRequest request,
                    com.oracle.bmc.waiter.TerminationStrategy terminationStrategy,
                    com.oracle.bmc.waiter.DelayStrategy delayStrategy,
                    com.oracle.bmc.datasafe.model.MaskingLifecycleState... targetStates) {
        com.oracle.bmc.util.internal.Validate.notEmpty(
                targetStates, "At least one targetState must be provided");
        com.oracle.bmc.util.internal.Validate.noNullElements(
                targetStates, "Null targetState values are not permitted");

        return forMaskingPolicy(
                com.oracle.bmc.waiter.Waiters.newWaiter(terminationStrategy, delayStrategy),
                request,
                targetStates);
    }

    // Helper method to create a new Waiter for MaskingPolicy.
    private com.oracle.bmc.waiter.Waiter<GetMaskingPolicyRequest, GetMaskingPolicyResponse>
            forMaskingPolicy(
                    com.oracle.bmc.waiter.BmcGenericWaiter waiter,
                    final GetMaskingPolicyRequest request,
                    final com.oracle.bmc.datasafe.model.MaskingLifecycleState... targetStates) {
        final java.util.Set<com.oracle.bmc.datasafe.model.MaskingLifecycleState> targetStatesSet =
                new java.util.HashSet<>(java.util.Arrays.asList(targetStates));

        return new com.oracle.bmc.waiter.internal.SimpleWaiterImpl<>(
                executorService,
                waiter.toCallable(
                        () -> request,
                        new java.util.function.Function<
                                GetMaskingPolicyRequest, GetMaskingPolicyResponse>() {
                            @Override
                            public GetMaskingPolicyResponse apply(GetMaskingPolicyRequest request) {
                                return client.getMaskingPolicy(request);
                            }
                        },
                        new java.util.function.Predicate<GetMaskingPolicyResponse>() {
                            @Override
                            public boolean test(GetMaskingPolicyResponse response) {
                                return targetStatesSet.contains(
                                        response.getMaskingPolicy().getLifecycleState());
                            }
                        },
                        targetStatesSet.contains(
                                com.oracle.bmc.datasafe.model.MaskingLifecycleState.Deleted)),
                request);
    }

    /**
     * Creates a new {@link com.oracle.bmc.waiter.Waiter} using the default configuration.
     *
     * @param request the request to send
     * @param targetState the desired states to wait for. If multiple states are provided then the
     *     waiter will return once the resource reaches any of the provided states
     * @return a new {@code com.oracle.bmc.waiter.Waiter} instance
     */
    public com.oracle.bmc.waiter.Waiter<GetMaskingReportRequest, GetMaskingReportResponse>
            forMaskingReport(
                    GetMaskingReportRequest request,
                    com.oracle.bmc.datasafe.model.MaskingLifecycleState... targetStates) {
        com.oracle.bmc.util.internal.Validate.notEmpty(
                targetStates, "At least one targetState must be provided");
        com.oracle.bmc.util.internal.Validate.noNullElements(
                targetStates, "Null targetState values are not permitted");

        return forMaskingReport(
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
    public com.oracle.bmc.waiter.Waiter<GetMaskingReportRequest, GetMaskingReportResponse>
            forMaskingReport(
                    GetMaskingReportRequest request,
                    com.oracle.bmc.datasafe.model.MaskingLifecycleState targetState,
                    com.oracle.bmc.waiter.TerminationStrategy terminationStrategy,
                    com.oracle.bmc.waiter.DelayStrategy delayStrategy) {
        com.oracle.bmc.util.internal.Validate.notNull(
                targetState, "The targetState cannot be null");

        return forMaskingReport(
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
     * @return a new {@code Waiter} instance
     */
    public com.oracle.bmc.waiter.Waiter<GetMaskingReportRequest, GetMaskingReportResponse>
            forMaskingReport(
                    GetMaskingReportRequest request,
                    com.oracle.bmc.waiter.TerminationStrategy terminationStrategy,
                    com.oracle.bmc.waiter.DelayStrategy delayStrategy,
                    com.oracle.bmc.datasafe.model.MaskingLifecycleState... targetStates) {
        com.oracle.bmc.util.internal.Validate.notEmpty(
                targetStates, "At least one targetState must be provided");
        com.oracle.bmc.util.internal.Validate.noNullElements(
                targetStates, "Null targetState values are not permitted");

        return forMaskingReport(
                com.oracle.bmc.waiter.Waiters.newWaiter(terminationStrategy, delayStrategy),
                request,
                targetStates);
    }

    // Helper method to create a new Waiter for MaskingReport.
    private com.oracle.bmc.waiter.Waiter<GetMaskingReportRequest, GetMaskingReportResponse>
            forMaskingReport(
                    com.oracle.bmc.waiter.BmcGenericWaiter waiter,
                    final GetMaskingReportRequest request,
                    final com.oracle.bmc.datasafe.model.MaskingLifecycleState... targetStates) {
        final java.util.Set<com.oracle.bmc.datasafe.model.MaskingLifecycleState> targetStatesSet =
                new java.util.HashSet<>(java.util.Arrays.asList(targetStates));

        return new com.oracle.bmc.waiter.internal.SimpleWaiterImpl<>(
                executorService,
                waiter.toCallable(
                        () -> request,
                        new java.util.function.Function<
                                GetMaskingReportRequest, GetMaskingReportResponse>() {
                            @Override
                            public GetMaskingReportResponse apply(GetMaskingReportRequest request) {
                                return client.getMaskingReport(request);
                            }
                        },
                        new java.util.function.Predicate<GetMaskingReportResponse>() {
                            @Override
                            public boolean test(GetMaskingReportResponse response) {
                                return targetStatesSet.contains(
                                        response.getMaskingReport().getLifecycleState());
                            }
                        },
                        targetStatesSet.contains(
                                com.oracle.bmc.datasafe.model.MaskingLifecycleState.Deleted)),
                request);
    }

    /**
     * Creates a new {@link com.oracle.bmc.waiter.Waiter} using the default configuration.
     *
     * @param request the request to send
     * @param targetState the desired states to wait for. If multiple states are provided then the
     *     waiter will return once the resource reaches any of the provided states
     * @return a new {@code com.oracle.bmc.waiter.Waiter} instance
     */
    public com.oracle.bmc.waiter.Waiter<GetOnPremConnectorRequest, GetOnPremConnectorResponse>
            forOnPremConnector(
                    GetOnPremConnectorRequest request,
                    com.oracle.bmc.datasafe.model.LifecycleState... targetStates) {
        com.oracle.bmc.util.internal.Validate.notEmpty(
                targetStates, "At least one targetState must be provided");
        com.oracle.bmc.util.internal.Validate.noNullElements(
                targetStates, "Null targetState values are not permitted");

        return forOnPremConnector(
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
    public com.oracle.bmc.waiter.Waiter<GetOnPremConnectorRequest, GetOnPremConnectorResponse>
            forOnPremConnector(
                    GetOnPremConnectorRequest request,
                    com.oracle.bmc.datasafe.model.LifecycleState targetState,
                    com.oracle.bmc.waiter.TerminationStrategy terminationStrategy,
                    com.oracle.bmc.waiter.DelayStrategy delayStrategy) {
        com.oracle.bmc.util.internal.Validate.notNull(
                targetState, "The targetState cannot be null");

        return forOnPremConnector(
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
     * @return a new {@code Waiter} instance
     */
    public com.oracle.bmc.waiter.Waiter<GetOnPremConnectorRequest, GetOnPremConnectorResponse>
            forOnPremConnector(
                    GetOnPremConnectorRequest request,
                    com.oracle.bmc.waiter.TerminationStrategy terminationStrategy,
                    com.oracle.bmc.waiter.DelayStrategy delayStrategy,
                    com.oracle.bmc.datasafe.model.LifecycleState... targetStates) {
        com.oracle.bmc.util.internal.Validate.notEmpty(
                targetStates, "At least one targetState must be provided");
        com.oracle.bmc.util.internal.Validate.noNullElements(
                targetStates, "Null targetState values are not permitted");

        return forOnPremConnector(
                com.oracle.bmc.waiter.Waiters.newWaiter(terminationStrategy, delayStrategy),
                request,
                targetStates);
    }

    // Helper method to create a new Waiter for OnPremConnector.
    private com.oracle.bmc.waiter.Waiter<GetOnPremConnectorRequest, GetOnPremConnectorResponse>
            forOnPremConnector(
                    com.oracle.bmc.waiter.BmcGenericWaiter waiter,
                    final GetOnPremConnectorRequest request,
                    final com.oracle.bmc.datasafe.model.LifecycleState... targetStates) {
        final java.util.Set<com.oracle.bmc.datasafe.model.LifecycleState> targetStatesSet =
                new java.util.HashSet<>(java.util.Arrays.asList(targetStates));

        return new com.oracle.bmc.waiter.internal.SimpleWaiterImpl<>(
                executorService,
                waiter.toCallable(
                        () -> request,
                        new java.util.function.Function<
                                GetOnPremConnectorRequest, GetOnPremConnectorResponse>() {
                            @Override
                            public GetOnPremConnectorResponse apply(
                                    GetOnPremConnectorRequest request) {
                                return client.getOnPremConnector(request);
                            }
                        },
                        new java.util.function.Predicate<GetOnPremConnectorResponse>() {
                            @Override
                            public boolean test(GetOnPremConnectorResponse response) {
                                return targetStatesSet.contains(
                                        response.getOnPremConnector().getLifecycleState());
                            }
                        },
                        targetStatesSet.contains(
                                com.oracle.bmc.datasafe.model.LifecycleState.Deleted)),
                request);
    }

    /**
     * Creates a new {@link com.oracle.bmc.waiter.Waiter} using the default configuration.
     *
     * @param request the request to send
     * @param targetState the desired states to wait for. If multiple states are provided then the
     *     waiter will return once the resource reaches any of the provided states
     * @return a new {@code com.oracle.bmc.waiter.Waiter} instance
     */
    public com.oracle.bmc.waiter.Waiter<GetReportRequest, GetReportResponse> forReport(
            GetReportRequest request,
            com.oracle.bmc.datasafe.model.ReportLifecycleState... targetStates) {
        com.oracle.bmc.util.internal.Validate.notEmpty(
                targetStates, "At least one targetState must be provided");
        com.oracle.bmc.util.internal.Validate.noNullElements(
                targetStates, "Null targetState values are not permitted");

        return forReport(
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
    public com.oracle.bmc.waiter.Waiter<GetReportRequest, GetReportResponse> forReport(
            GetReportRequest request,
            com.oracle.bmc.datasafe.model.ReportLifecycleState targetState,
            com.oracle.bmc.waiter.TerminationStrategy terminationStrategy,
            com.oracle.bmc.waiter.DelayStrategy delayStrategy) {
        com.oracle.bmc.util.internal.Validate.notNull(
                targetState, "The targetState cannot be null");

        return forReport(
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
     * @return a new {@code Waiter} instance
     */
    public com.oracle.bmc.waiter.Waiter<GetReportRequest, GetReportResponse> forReport(
            GetReportRequest request,
            com.oracle.bmc.waiter.TerminationStrategy terminationStrategy,
            com.oracle.bmc.waiter.DelayStrategy delayStrategy,
            com.oracle.bmc.datasafe.model.ReportLifecycleState... targetStates) {
        com.oracle.bmc.util.internal.Validate.notEmpty(
                targetStates, "At least one targetState must be provided");
        com.oracle.bmc.util.internal.Validate.noNullElements(
                targetStates, "Null targetState values are not permitted");

        return forReport(
                com.oracle.bmc.waiter.Waiters.newWaiter(terminationStrategy, delayStrategy),
                request,
                targetStates);
    }

    // Helper method to create a new Waiter for Report.
    private com.oracle.bmc.waiter.Waiter<GetReportRequest, GetReportResponse> forReport(
            com.oracle.bmc.waiter.BmcGenericWaiter waiter,
            final GetReportRequest request,
            final com.oracle.bmc.datasafe.model.ReportLifecycleState... targetStates) {
        final java.util.Set<com.oracle.bmc.datasafe.model.ReportLifecycleState> targetStatesSet =
                new java.util.HashSet<>(java.util.Arrays.asList(targetStates));

        return new com.oracle.bmc.waiter.internal.SimpleWaiterImpl<>(
                executorService,
                waiter.toCallable(
                        () -> request,
                        new java.util.function.Function<GetReportRequest, GetReportResponse>() {
                            @Override
                            public GetReportResponse apply(GetReportRequest request) {
                                return client.getReport(request);
                            }
                        },
                        new java.util.function.Predicate<GetReportResponse>() {
                            @Override
                            public boolean test(GetReportResponse response) {
                                return targetStatesSet.contains(
                                        response.getReport().getLifecycleState());
                            }
                        },
                        false),
                request);
    }

    /**
     * Creates a new {@link com.oracle.bmc.waiter.Waiter} using the default configuration.
     *
     * @param request the request to send
     * @param targetState the desired states to wait for. If multiple states are provided then the
     *     waiter will return once the resource reaches any of the provided states
     * @return a new {@code com.oracle.bmc.waiter.Waiter} instance
     */
    public com.oracle.bmc.waiter.Waiter<GetReportDefinitionRequest, GetReportDefinitionResponse>
            forReportDefinition(
                    GetReportDefinitionRequest request,
                    com.oracle.bmc.datasafe.model.ReportDefinitionLifecycleState... targetStates) {
        com.oracle.bmc.util.internal.Validate.notEmpty(
                targetStates, "At least one targetState must be provided");
        com.oracle.bmc.util.internal.Validate.noNullElements(
                targetStates, "Null targetState values are not permitted");

        return forReportDefinition(
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
    public com.oracle.bmc.waiter.Waiter<GetReportDefinitionRequest, GetReportDefinitionResponse>
            forReportDefinition(
                    GetReportDefinitionRequest request,
                    com.oracle.bmc.datasafe.model.ReportDefinitionLifecycleState targetState,
                    com.oracle.bmc.waiter.TerminationStrategy terminationStrategy,
                    com.oracle.bmc.waiter.DelayStrategy delayStrategy) {
        com.oracle.bmc.util.internal.Validate.notNull(
                targetState, "The targetState cannot be null");

        return forReportDefinition(
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
     * @return a new {@code Waiter} instance
     */
    public com.oracle.bmc.waiter.Waiter<GetReportDefinitionRequest, GetReportDefinitionResponse>
            forReportDefinition(
                    GetReportDefinitionRequest request,
                    com.oracle.bmc.waiter.TerminationStrategy terminationStrategy,
                    com.oracle.bmc.waiter.DelayStrategy delayStrategy,
                    com.oracle.bmc.datasafe.model.ReportDefinitionLifecycleState... targetStates) {
        com.oracle.bmc.util.internal.Validate.notEmpty(
                targetStates, "At least one targetState must be provided");
        com.oracle.bmc.util.internal.Validate.noNullElements(
                targetStates, "Null targetState values are not permitted");

        return forReportDefinition(
                com.oracle.bmc.waiter.Waiters.newWaiter(terminationStrategy, delayStrategy),
                request,
                targetStates);
    }

    // Helper method to create a new Waiter for ReportDefinition.
    private com.oracle.bmc.waiter.Waiter<GetReportDefinitionRequest, GetReportDefinitionResponse>
            forReportDefinition(
                    com.oracle.bmc.waiter.BmcGenericWaiter waiter,
                    final GetReportDefinitionRequest request,
                    final com.oracle.bmc.datasafe.model.ReportDefinitionLifecycleState...
                            targetStates) {
        final java.util.Set<com.oracle.bmc.datasafe.model.ReportDefinitionLifecycleState>
                targetStatesSet = new java.util.HashSet<>(java.util.Arrays.asList(targetStates));

        return new com.oracle.bmc.waiter.internal.SimpleWaiterImpl<>(
                executorService,
                waiter.toCallable(
                        () -> request,
                        new java.util.function.Function<
                                GetReportDefinitionRequest, GetReportDefinitionResponse>() {
                            @Override
                            public GetReportDefinitionResponse apply(
                                    GetReportDefinitionRequest request) {
                                return client.getReportDefinition(request);
                            }
                        },
                        new java.util.function.Predicate<GetReportDefinitionResponse>() {
                            @Override
                            public boolean test(GetReportDefinitionResponse response) {
                                return targetStatesSet.contains(
                                        response.getReportDefinition().getLifecycleState());
                            }
                        },
                        targetStatesSet.contains(
                                com.oracle.bmc.datasafe.model.ReportDefinitionLifecycleState
                                        .Deleted)),
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
                    GetSdmMaskingPolicyDifferenceRequest, GetSdmMaskingPolicyDifferenceResponse>
            forSdmMaskingPolicyDifference(
                    GetSdmMaskingPolicyDifferenceRequest request,
                    com.oracle.bmc.datasafe.model.SdmMaskingPolicyDifference.LifecycleState...
                            targetStates) {
        com.oracle.bmc.util.internal.Validate.notEmpty(
                targetStates, "At least one targetState must be provided");
        com.oracle.bmc.util.internal.Validate.noNullElements(
                targetStates, "Null targetState values are not permitted");

        return forSdmMaskingPolicyDifference(
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
                    GetSdmMaskingPolicyDifferenceRequest, GetSdmMaskingPolicyDifferenceResponse>
            forSdmMaskingPolicyDifference(
                    GetSdmMaskingPolicyDifferenceRequest request,
                    com.oracle.bmc.datasafe.model.SdmMaskingPolicyDifference.LifecycleState
                            targetState,
                    com.oracle.bmc.waiter.TerminationStrategy terminationStrategy,
                    com.oracle.bmc.waiter.DelayStrategy delayStrategy) {
        com.oracle.bmc.util.internal.Validate.notNull(
                targetState, "The targetState cannot be null");

        return forSdmMaskingPolicyDifference(
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
                    GetSdmMaskingPolicyDifferenceRequest, GetSdmMaskingPolicyDifferenceResponse>
            forSdmMaskingPolicyDifference(
                    GetSdmMaskingPolicyDifferenceRequest request,
                    com.oracle.bmc.waiter.TerminationStrategy terminationStrategy,
                    com.oracle.bmc.waiter.DelayStrategy delayStrategy,
                    com.oracle.bmc.datasafe.model.SdmMaskingPolicyDifference.LifecycleState...
                            targetStates) {
        com.oracle.bmc.util.internal.Validate.notEmpty(
                targetStates, "At least one target state must be provided");
        com.oracle.bmc.util.internal.Validate.noNullElements(
                targetStates, "Null target states are not permitted");

        return forSdmMaskingPolicyDifference(
                com.oracle.bmc.waiter.Waiters.newWaiter(terminationStrategy, delayStrategy),
                request,
                targetStates);
    }

    // Helper method to create a new Waiter for SdmMaskingPolicyDifference.
    private com.oracle.bmc.waiter.Waiter<
                    GetSdmMaskingPolicyDifferenceRequest, GetSdmMaskingPolicyDifferenceResponse>
            forSdmMaskingPolicyDifference(
                    com.oracle.bmc.waiter.BmcGenericWaiter waiter,
                    final GetSdmMaskingPolicyDifferenceRequest request,
                    final com.oracle.bmc.datasafe.model.SdmMaskingPolicyDifference.LifecycleState...
                            targetStates) {
        final java.util.Set<com.oracle.bmc.datasafe.model.SdmMaskingPolicyDifference.LifecycleState>
                targetStatesSet = new java.util.HashSet<>(java.util.Arrays.asList(targetStates));

        return new com.oracle.bmc.waiter.internal.SimpleWaiterImpl<>(
                executorService,
                waiter.toCallable(
                        () -> request,
                        new java.util.function.Function<
                                GetSdmMaskingPolicyDifferenceRequest,
                                GetSdmMaskingPolicyDifferenceResponse>() {
                            @Override
                            public GetSdmMaskingPolicyDifferenceResponse apply(
                                    GetSdmMaskingPolicyDifferenceRequest request) {
                                return client.getSdmMaskingPolicyDifference(request);
                            }
                        },
                        new java.util.function.Predicate<GetSdmMaskingPolicyDifferenceResponse>() {
                            @Override
                            public boolean test(GetSdmMaskingPolicyDifferenceResponse response) {
                                return targetStatesSet.contains(
                                        response.getSdmMaskingPolicyDifference()
                                                .getLifecycleState());
                            }
                        },
                        targetStatesSet.contains(
                                com.oracle.bmc.datasafe.model.SdmMaskingPolicyDifference
                                        .LifecycleState.Deleted)),
                request);
    }

    /**
     * Creates a new {@link com.oracle.bmc.waiter.Waiter} using the default configuration.
     *
     * @param request the request to send
     * @param targetState the desired states to wait for. If multiple states are provided then the
     *     waiter will return once the resource reaches any of the provided states
     * @return a new {@code com.oracle.bmc.waiter.Waiter} instance
     */
    public com.oracle.bmc.waiter.Waiter<GetSecurityAssessmentRequest, GetSecurityAssessmentResponse>
            forSecurityAssessment(
                    GetSecurityAssessmentRequest request,
                    com.oracle.bmc.datasafe.model.SecurityAssessmentLifecycleState...
                            targetStates) {
        com.oracle.bmc.util.internal.Validate.notEmpty(
                targetStates, "At least one targetState must be provided");
        com.oracle.bmc.util.internal.Validate.noNullElements(
                targetStates, "Null targetState values are not permitted");

        return forSecurityAssessment(
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
    public com.oracle.bmc.waiter.Waiter<GetSecurityAssessmentRequest, GetSecurityAssessmentResponse>
            forSecurityAssessment(
                    GetSecurityAssessmentRequest request,
                    com.oracle.bmc.datasafe.model.SecurityAssessmentLifecycleState targetState,
                    com.oracle.bmc.waiter.TerminationStrategy terminationStrategy,
                    com.oracle.bmc.waiter.DelayStrategy delayStrategy) {
        com.oracle.bmc.util.internal.Validate.notNull(
                targetState, "The targetState cannot be null");

        return forSecurityAssessment(
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
     * @return a new {@code Waiter} instance
     */
    public com.oracle.bmc.waiter.Waiter<GetSecurityAssessmentRequest, GetSecurityAssessmentResponse>
            forSecurityAssessment(
                    GetSecurityAssessmentRequest request,
                    com.oracle.bmc.waiter.TerminationStrategy terminationStrategy,
                    com.oracle.bmc.waiter.DelayStrategy delayStrategy,
                    com.oracle.bmc.datasafe.model.SecurityAssessmentLifecycleState...
                            targetStates) {
        com.oracle.bmc.util.internal.Validate.notEmpty(
                targetStates, "At least one targetState must be provided");
        com.oracle.bmc.util.internal.Validate.noNullElements(
                targetStates, "Null targetState values are not permitted");

        return forSecurityAssessment(
                com.oracle.bmc.waiter.Waiters.newWaiter(terminationStrategy, delayStrategy),
                request,
                targetStates);
    }

    // Helper method to create a new Waiter for SecurityAssessment.
    private com.oracle.bmc.waiter.Waiter<
                    GetSecurityAssessmentRequest, GetSecurityAssessmentResponse>
            forSecurityAssessment(
                    com.oracle.bmc.waiter.BmcGenericWaiter waiter,
                    final GetSecurityAssessmentRequest request,
                    final com.oracle.bmc.datasafe.model.SecurityAssessmentLifecycleState...
                            targetStates) {
        final java.util.Set<com.oracle.bmc.datasafe.model.SecurityAssessmentLifecycleState>
                targetStatesSet = new java.util.HashSet<>(java.util.Arrays.asList(targetStates));

        return new com.oracle.bmc.waiter.internal.SimpleWaiterImpl<>(
                executorService,
                waiter.toCallable(
                        () -> request,
                        new java.util.function.Function<
                                GetSecurityAssessmentRequest, GetSecurityAssessmentResponse>() {
                            @Override
                            public GetSecurityAssessmentResponse apply(
                                    GetSecurityAssessmentRequest request) {
                                return client.getSecurityAssessment(request);
                            }
                        },
                        new java.util.function.Predicate<GetSecurityAssessmentResponse>() {
                            @Override
                            public boolean test(GetSecurityAssessmentResponse response) {
                                return targetStatesSet.contains(
                                        response.getSecurityAssessment().getLifecycleState());
                            }
                        },
                        targetStatesSet.contains(
                                com.oracle.bmc.datasafe.model.SecurityAssessmentLifecycleState
                                        .Deleted)),
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
                    GetSecurityAssessmentComparisonRequest, GetSecurityAssessmentComparisonResponse>
            forSecurityAssessmentComparison(
                    GetSecurityAssessmentComparisonRequest request,
                    com.oracle.bmc.datasafe.model.SecurityAssessmentComparison.LifecycleState...
                            targetStates) {
        com.oracle.bmc.util.internal.Validate.notEmpty(
                targetStates, "At least one targetState must be provided");
        com.oracle.bmc.util.internal.Validate.noNullElements(
                targetStates, "Null targetState values are not permitted");

        return forSecurityAssessmentComparison(
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
                    GetSecurityAssessmentComparisonRequest, GetSecurityAssessmentComparisonResponse>
            forSecurityAssessmentComparison(
                    GetSecurityAssessmentComparisonRequest request,
                    com.oracle.bmc.datasafe.model.SecurityAssessmentComparison.LifecycleState
                            targetState,
                    com.oracle.bmc.waiter.TerminationStrategy terminationStrategy,
                    com.oracle.bmc.waiter.DelayStrategy delayStrategy) {
        com.oracle.bmc.util.internal.Validate.notNull(
                targetState, "The targetState cannot be null");

        return forSecurityAssessmentComparison(
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
                    GetSecurityAssessmentComparisonRequest, GetSecurityAssessmentComparisonResponse>
            forSecurityAssessmentComparison(
                    GetSecurityAssessmentComparisonRequest request,
                    com.oracle.bmc.waiter.TerminationStrategy terminationStrategy,
                    com.oracle.bmc.waiter.DelayStrategy delayStrategy,
                    com.oracle.bmc.datasafe.model.SecurityAssessmentComparison.LifecycleState...
                            targetStates) {
        com.oracle.bmc.util.internal.Validate.notEmpty(
                targetStates, "At least one target state must be provided");
        com.oracle.bmc.util.internal.Validate.noNullElements(
                targetStates, "Null target states are not permitted");

        return forSecurityAssessmentComparison(
                com.oracle.bmc.waiter.Waiters.newWaiter(terminationStrategy, delayStrategy),
                request,
                targetStates);
    }

    // Helper method to create a new Waiter for SecurityAssessmentComparison.
    private com.oracle.bmc.waiter.Waiter<
                    GetSecurityAssessmentComparisonRequest, GetSecurityAssessmentComparisonResponse>
            forSecurityAssessmentComparison(
                    com.oracle.bmc.waiter.BmcGenericWaiter waiter,
                    final GetSecurityAssessmentComparisonRequest request,
                    final com.oracle.bmc.datasafe.model.SecurityAssessmentComparison.LifecycleState
                                    ...
                            targetStates) {
        final java.util.Set<
                        com.oracle.bmc.datasafe.model.SecurityAssessmentComparison.LifecycleState>
                targetStatesSet = new java.util.HashSet<>(java.util.Arrays.asList(targetStates));

        return new com.oracle.bmc.waiter.internal.SimpleWaiterImpl<>(
                executorService,
                waiter.toCallable(
                        () -> request,
                        new java.util.function.Function<
                                GetSecurityAssessmentComparisonRequest,
                                GetSecurityAssessmentComparisonResponse>() {
                            @Override
                            public GetSecurityAssessmentComparisonResponse apply(
                                    GetSecurityAssessmentComparisonRequest request) {
                                return client.getSecurityAssessmentComparison(request);
                            }
                        },
                        new java.util.function.Predicate<
                                GetSecurityAssessmentComparisonResponse>() {
                            @Override
                            public boolean test(GetSecurityAssessmentComparisonResponse response) {
                                return targetStatesSet.contains(
                                        response.getSecurityAssessmentComparison()
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
     * @param targetState the desired states to wait for. If multiple states are provided then the
     *     waiter will return once the resource reaches any of the provided states
     * @return a new {@code com.oracle.bmc.waiter.Waiter} instance
     */
    public com.oracle.bmc.waiter.Waiter<GetSensitiveColumnRequest, GetSensitiveColumnResponse>
            forSensitiveColumn(
                    GetSensitiveColumnRequest request,
                    com.oracle.bmc.datasafe.model.SensitiveColumnLifecycleState... targetStates) {
        com.oracle.bmc.util.internal.Validate.notEmpty(
                targetStates, "At least one targetState must be provided");
        com.oracle.bmc.util.internal.Validate.noNullElements(
                targetStates, "Null targetState values are not permitted");

        return forSensitiveColumn(
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
    public com.oracle.bmc.waiter.Waiter<GetSensitiveColumnRequest, GetSensitiveColumnResponse>
            forSensitiveColumn(
                    GetSensitiveColumnRequest request,
                    com.oracle.bmc.datasafe.model.SensitiveColumnLifecycleState targetState,
                    com.oracle.bmc.waiter.TerminationStrategy terminationStrategy,
                    com.oracle.bmc.waiter.DelayStrategy delayStrategy) {
        com.oracle.bmc.util.internal.Validate.notNull(
                targetState, "The targetState cannot be null");

        return forSensitiveColumn(
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
     * @return a new {@code Waiter} instance
     */
    public com.oracle.bmc.waiter.Waiter<GetSensitiveColumnRequest, GetSensitiveColumnResponse>
            forSensitiveColumn(
                    GetSensitiveColumnRequest request,
                    com.oracle.bmc.waiter.TerminationStrategy terminationStrategy,
                    com.oracle.bmc.waiter.DelayStrategy delayStrategy,
                    com.oracle.bmc.datasafe.model.SensitiveColumnLifecycleState... targetStates) {
        com.oracle.bmc.util.internal.Validate.notEmpty(
                targetStates, "At least one targetState must be provided");
        com.oracle.bmc.util.internal.Validate.noNullElements(
                targetStates, "Null targetState values are not permitted");

        return forSensitiveColumn(
                com.oracle.bmc.waiter.Waiters.newWaiter(terminationStrategy, delayStrategy),
                request,
                targetStates);
    }

    // Helper method to create a new Waiter for SensitiveColumn.
    private com.oracle.bmc.waiter.Waiter<GetSensitiveColumnRequest, GetSensitiveColumnResponse>
            forSensitiveColumn(
                    com.oracle.bmc.waiter.BmcGenericWaiter waiter,
                    final GetSensitiveColumnRequest request,
                    final com.oracle.bmc.datasafe.model.SensitiveColumnLifecycleState...
                            targetStates) {
        final java.util.Set<com.oracle.bmc.datasafe.model.SensitiveColumnLifecycleState>
                targetStatesSet = new java.util.HashSet<>(java.util.Arrays.asList(targetStates));

        return new com.oracle.bmc.waiter.internal.SimpleWaiterImpl<>(
                executorService,
                waiter.toCallable(
                        () -> request,
                        new java.util.function.Function<
                                GetSensitiveColumnRequest, GetSensitiveColumnResponse>() {
                            @Override
                            public GetSensitiveColumnResponse apply(
                                    GetSensitiveColumnRequest request) {
                                return client.getSensitiveColumn(request);
                            }
                        },
                        new java.util.function.Predicate<GetSensitiveColumnResponse>() {
                            @Override
                            public boolean test(GetSensitiveColumnResponse response) {
                                return targetStatesSet.contains(
                                        response.getSensitiveColumn().getLifecycleState());
                            }
                        },
                        false),
                request);
    }

    /**
     * Creates a new {@link com.oracle.bmc.waiter.Waiter} using the default configuration.
     *
     * @param request the request to send
     * @param targetState the desired states to wait for. If multiple states are provided then the
     *     waiter will return once the resource reaches any of the provided states
     * @return a new {@code com.oracle.bmc.waiter.Waiter} instance
     */
    public com.oracle.bmc.waiter.Waiter<GetSensitiveDataModelRequest, GetSensitiveDataModelResponse>
            forSensitiveDataModel(
                    GetSensitiveDataModelRequest request,
                    com.oracle.bmc.datasafe.model.DiscoveryLifecycleState... targetStates) {
        com.oracle.bmc.util.internal.Validate.notEmpty(
                targetStates, "At least one targetState must be provided");
        com.oracle.bmc.util.internal.Validate.noNullElements(
                targetStates, "Null targetState values are not permitted");

        return forSensitiveDataModel(
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
    public com.oracle.bmc.waiter.Waiter<GetSensitiveDataModelRequest, GetSensitiveDataModelResponse>
            forSensitiveDataModel(
                    GetSensitiveDataModelRequest request,
                    com.oracle.bmc.datasafe.model.DiscoveryLifecycleState targetState,
                    com.oracle.bmc.waiter.TerminationStrategy terminationStrategy,
                    com.oracle.bmc.waiter.DelayStrategy delayStrategy) {
        com.oracle.bmc.util.internal.Validate.notNull(
                targetState, "The targetState cannot be null");

        return forSensitiveDataModel(
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
     * @return a new {@code Waiter} instance
     */
    public com.oracle.bmc.waiter.Waiter<GetSensitiveDataModelRequest, GetSensitiveDataModelResponse>
            forSensitiveDataModel(
                    GetSensitiveDataModelRequest request,
                    com.oracle.bmc.waiter.TerminationStrategy terminationStrategy,
                    com.oracle.bmc.waiter.DelayStrategy delayStrategy,
                    com.oracle.bmc.datasafe.model.DiscoveryLifecycleState... targetStates) {
        com.oracle.bmc.util.internal.Validate.notEmpty(
                targetStates, "At least one targetState must be provided");
        com.oracle.bmc.util.internal.Validate.noNullElements(
                targetStates, "Null targetState values are not permitted");

        return forSensitiveDataModel(
                com.oracle.bmc.waiter.Waiters.newWaiter(terminationStrategy, delayStrategy),
                request,
                targetStates);
    }

    // Helper method to create a new Waiter for SensitiveDataModel.
    private com.oracle.bmc.waiter.Waiter<
                    GetSensitiveDataModelRequest, GetSensitiveDataModelResponse>
            forSensitiveDataModel(
                    com.oracle.bmc.waiter.BmcGenericWaiter waiter,
                    final GetSensitiveDataModelRequest request,
                    final com.oracle.bmc.datasafe.model.DiscoveryLifecycleState... targetStates) {
        final java.util.Set<com.oracle.bmc.datasafe.model.DiscoveryLifecycleState> targetStatesSet =
                new java.util.HashSet<>(java.util.Arrays.asList(targetStates));

        return new com.oracle.bmc.waiter.internal.SimpleWaiterImpl<>(
                executorService,
                waiter.toCallable(
                        () -> request,
                        new java.util.function.Function<
                                GetSensitiveDataModelRequest, GetSensitiveDataModelResponse>() {
                            @Override
                            public GetSensitiveDataModelResponse apply(
                                    GetSensitiveDataModelRequest request) {
                                return client.getSensitiveDataModel(request);
                            }
                        },
                        new java.util.function.Predicate<GetSensitiveDataModelResponse>() {
                            @Override
                            public boolean test(GetSensitiveDataModelResponse response) {
                                return targetStatesSet.contains(
                                        response.getSensitiveDataModel().getLifecycleState());
                            }
                        },
                        targetStatesSet.contains(
                                com.oracle.bmc.datasafe.model.DiscoveryLifecycleState.Deleted)),
                request);
    }

    /**
     * Creates a new {@link com.oracle.bmc.waiter.Waiter} using the default configuration.
     *
     * @param request the request to send
     * @param targetState the desired states to wait for. If multiple states are provided then the
     *     waiter will return once the resource reaches any of the provided states
     * @return a new {@code com.oracle.bmc.waiter.Waiter} instance
     */
    public com.oracle.bmc.waiter.Waiter<GetSensitiveTypeRequest, GetSensitiveTypeResponse>
            forSensitiveType(
                    GetSensitiveTypeRequest request,
                    com.oracle.bmc.datasafe.model.DiscoveryLifecycleState... targetStates) {
        com.oracle.bmc.util.internal.Validate.notEmpty(
                targetStates, "At least one targetState must be provided");
        com.oracle.bmc.util.internal.Validate.noNullElements(
                targetStates, "Null targetState values are not permitted");

        return forSensitiveType(
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
    public com.oracle.bmc.waiter.Waiter<GetSensitiveTypeRequest, GetSensitiveTypeResponse>
            forSensitiveType(
                    GetSensitiveTypeRequest request,
                    com.oracle.bmc.datasafe.model.DiscoveryLifecycleState targetState,
                    com.oracle.bmc.waiter.TerminationStrategy terminationStrategy,
                    com.oracle.bmc.waiter.DelayStrategy delayStrategy) {
        com.oracle.bmc.util.internal.Validate.notNull(
                targetState, "The targetState cannot be null");

        return forSensitiveType(
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
     * @return a new {@code Waiter} instance
     */
    public com.oracle.bmc.waiter.Waiter<GetSensitiveTypeRequest, GetSensitiveTypeResponse>
            forSensitiveType(
                    GetSensitiveTypeRequest request,
                    com.oracle.bmc.waiter.TerminationStrategy terminationStrategy,
                    com.oracle.bmc.waiter.DelayStrategy delayStrategy,
                    com.oracle.bmc.datasafe.model.DiscoveryLifecycleState... targetStates) {
        com.oracle.bmc.util.internal.Validate.notEmpty(
                targetStates, "At least one targetState must be provided");
        com.oracle.bmc.util.internal.Validate.noNullElements(
                targetStates, "Null targetState values are not permitted");

        return forSensitiveType(
                com.oracle.bmc.waiter.Waiters.newWaiter(terminationStrategy, delayStrategy),
                request,
                targetStates);
    }

    // Helper method to create a new Waiter for SensitiveType.
    private com.oracle.bmc.waiter.Waiter<GetSensitiveTypeRequest, GetSensitiveTypeResponse>
            forSensitiveType(
                    com.oracle.bmc.waiter.BmcGenericWaiter waiter,
                    final GetSensitiveTypeRequest request,
                    final com.oracle.bmc.datasafe.model.DiscoveryLifecycleState... targetStates) {
        final java.util.Set<com.oracle.bmc.datasafe.model.DiscoveryLifecycleState> targetStatesSet =
                new java.util.HashSet<>(java.util.Arrays.asList(targetStates));

        return new com.oracle.bmc.waiter.internal.SimpleWaiterImpl<>(
                executorService,
                waiter.toCallable(
                        () -> request,
                        new java.util.function.Function<
                                GetSensitiveTypeRequest, GetSensitiveTypeResponse>() {
                            @Override
                            public GetSensitiveTypeResponse apply(GetSensitiveTypeRequest request) {
                                return client.getSensitiveType(request);
                            }
                        },
                        new java.util.function.Predicate<GetSensitiveTypeResponse>() {
                            @Override
                            public boolean test(GetSensitiveTypeResponse response) {
                                return targetStatesSet.contains(
                                        response.getSensitiveType().getLifecycleState());
                            }
                        },
                        targetStatesSet.contains(
                                com.oracle.bmc.datasafe.model.DiscoveryLifecycleState.Deleted)),
                request);
    }

    /**
     * Creates a new {@link com.oracle.bmc.waiter.Waiter} using the default configuration.
     *
     * @param request the request to send
     * @param targetState the desired states to wait for. If multiple states are provided then the
     *     waiter will return once the resource reaches any of the provided states
     * @return a new {@code com.oracle.bmc.waiter.Waiter} instance
     */
    public com.oracle.bmc.waiter.Waiter<
                    GetTargetAlertPolicyAssociationRequest, GetTargetAlertPolicyAssociationResponse>
            forTargetAlertPolicyAssociation(
                    GetTargetAlertPolicyAssociationRequest request,
                    com.oracle.bmc.datasafe.model.AlertPolicyLifecycleState... targetStates) {
        com.oracle.bmc.util.internal.Validate.notEmpty(
                targetStates, "At least one targetState must be provided");
        com.oracle.bmc.util.internal.Validate.noNullElements(
                targetStates, "Null targetState values are not permitted");

        return forTargetAlertPolicyAssociation(
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
                    GetTargetAlertPolicyAssociationRequest, GetTargetAlertPolicyAssociationResponse>
            forTargetAlertPolicyAssociation(
                    GetTargetAlertPolicyAssociationRequest request,
                    com.oracle.bmc.datasafe.model.AlertPolicyLifecycleState targetState,
                    com.oracle.bmc.waiter.TerminationStrategy terminationStrategy,
                    com.oracle.bmc.waiter.DelayStrategy delayStrategy) {
        com.oracle.bmc.util.internal.Validate.notNull(
                targetState, "The targetState cannot be null");

        return forTargetAlertPolicyAssociation(
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
     * @return a new {@code Waiter} instance
     */
    public com.oracle.bmc.waiter.Waiter<
                    GetTargetAlertPolicyAssociationRequest, GetTargetAlertPolicyAssociationResponse>
            forTargetAlertPolicyAssociation(
                    GetTargetAlertPolicyAssociationRequest request,
                    com.oracle.bmc.waiter.TerminationStrategy terminationStrategy,
                    com.oracle.bmc.waiter.DelayStrategy delayStrategy,
                    com.oracle.bmc.datasafe.model.AlertPolicyLifecycleState... targetStates) {
        com.oracle.bmc.util.internal.Validate.notEmpty(
                targetStates, "At least one targetState must be provided");
        com.oracle.bmc.util.internal.Validate.noNullElements(
                targetStates, "Null targetState values are not permitted");

        return forTargetAlertPolicyAssociation(
                com.oracle.bmc.waiter.Waiters.newWaiter(terminationStrategy, delayStrategy),
                request,
                targetStates);
    }

    // Helper method to create a new Waiter for TargetAlertPolicyAssociation.
    private com.oracle.bmc.waiter.Waiter<
                    GetTargetAlertPolicyAssociationRequest, GetTargetAlertPolicyAssociationResponse>
            forTargetAlertPolicyAssociation(
                    com.oracle.bmc.waiter.BmcGenericWaiter waiter,
                    final GetTargetAlertPolicyAssociationRequest request,
                    final com.oracle.bmc.datasafe.model.AlertPolicyLifecycleState... targetStates) {
        final java.util.Set<com.oracle.bmc.datasafe.model.AlertPolicyLifecycleState>
                targetStatesSet = new java.util.HashSet<>(java.util.Arrays.asList(targetStates));

        return new com.oracle.bmc.waiter.internal.SimpleWaiterImpl<>(
                executorService,
                waiter.toCallable(
                        () -> request,
                        new java.util.function.Function<
                                GetTargetAlertPolicyAssociationRequest,
                                GetTargetAlertPolicyAssociationResponse>() {
                            @Override
                            public GetTargetAlertPolicyAssociationResponse apply(
                                    GetTargetAlertPolicyAssociationRequest request) {
                                return client.getTargetAlertPolicyAssociation(request);
                            }
                        },
                        new java.util.function.Predicate<
                                GetTargetAlertPolicyAssociationResponse>() {
                            @Override
                            public boolean test(GetTargetAlertPolicyAssociationResponse response) {
                                return targetStatesSet.contains(
                                        response.getTargetAlertPolicyAssociation()
                                                .getLifecycleState());
                            }
                        },
                        targetStatesSet.contains(
                                com.oracle.bmc.datasafe.model.AlertPolicyLifecycleState.Deleted)),
                request);
    }

    /**
     * Creates a new {@link com.oracle.bmc.waiter.Waiter} using the default configuration.
     *
     * @param request the request to send
     * @param targetState the desired states to wait for. If multiple states are provided then the
     *     waiter will return once the resource reaches any of the provided states
     * @return a new {@code com.oracle.bmc.waiter.Waiter} instance
     */
    public com.oracle.bmc.waiter.Waiter<GetTargetDatabaseRequest, GetTargetDatabaseResponse>
            forTargetDatabase(
                    GetTargetDatabaseRequest request,
                    com.oracle.bmc.datasafe.model.TargetDatabaseLifecycleState... targetStates) {
        com.oracle.bmc.util.internal.Validate.notEmpty(
                targetStates, "At least one targetState must be provided");
        com.oracle.bmc.util.internal.Validate.noNullElements(
                targetStates, "Null targetState values are not permitted");

        return forTargetDatabase(
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
    public com.oracle.bmc.waiter.Waiter<GetTargetDatabaseRequest, GetTargetDatabaseResponse>
            forTargetDatabase(
                    GetTargetDatabaseRequest request,
                    com.oracle.bmc.datasafe.model.TargetDatabaseLifecycleState targetState,
                    com.oracle.bmc.waiter.TerminationStrategy terminationStrategy,
                    com.oracle.bmc.waiter.DelayStrategy delayStrategy) {
        com.oracle.bmc.util.internal.Validate.notNull(
                targetState, "The targetState cannot be null");

        return forTargetDatabase(
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
     * @return a new {@code Waiter} instance
     */
    public com.oracle.bmc.waiter.Waiter<GetTargetDatabaseRequest, GetTargetDatabaseResponse>
            forTargetDatabase(
                    GetTargetDatabaseRequest request,
                    com.oracle.bmc.waiter.TerminationStrategy terminationStrategy,
                    com.oracle.bmc.waiter.DelayStrategy delayStrategy,
                    com.oracle.bmc.datasafe.model.TargetDatabaseLifecycleState... targetStates) {
        com.oracle.bmc.util.internal.Validate.notEmpty(
                targetStates, "At least one targetState must be provided");
        com.oracle.bmc.util.internal.Validate.noNullElements(
                targetStates, "Null targetState values are not permitted");

        return forTargetDatabase(
                com.oracle.bmc.waiter.Waiters.newWaiter(terminationStrategy, delayStrategy),
                request,
                targetStates);
    }

    // Helper method to create a new Waiter for TargetDatabase.
    private com.oracle.bmc.waiter.Waiter<GetTargetDatabaseRequest, GetTargetDatabaseResponse>
            forTargetDatabase(
                    com.oracle.bmc.waiter.BmcGenericWaiter waiter,
                    final GetTargetDatabaseRequest request,
                    final com.oracle.bmc.datasafe.model.TargetDatabaseLifecycleState...
                            targetStates) {
        final java.util.Set<com.oracle.bmc.datasafe.model.TargetDatabaseLifecycleState>
                targetStatesSet = new java.util.HashSet<>(java.util.Arrays.asList(targetStates));

        return new com.oracle.bmc.waiter.internal.SimpleWaiterImpl<>(
                executorService,
                waiter.toCallable(
                        () -> request,
                        new java.util.function.Function<
                                GetTargetDatabaseRequest, GetTargetDatabaseResponse>() {
                            @Override
                            public GetTargetDatabaseResponse apply(
                                    GetTargetDatabaseRequest request) {
                                return client.getTargetDatabase(request);
                            }
                        },
                        new java.util.function.Predicate<GetTargetDatabaseResponse>() {
                            @Override
                            public boolean test(GetTargetDatabaseResponse response) {
                                return targetStatesSet.contains(
                                        response.getTargetDatabase().getLifecycleState());
                            }
                        },
                        targetStatesSet.contains(
                                com.oracle.bmc.datasafe.model.TargetDatabaseLifecycleState
                                        .Deleted)),
                request);
    }

    /**
     * Creates a new {@link com.oracle.bmc.waiter.Waiter} using the default configuration.
     *
     * @param request the request to send
     * @param targetState the desired states to wait for. If multiple states are provided then the
     *     waiter will return once the resource reaches any of the provided states
     * @return a new {@code com.oracle.bmc.waiter.Waiter} instance
     */
    public com.oracle.bmc.waiter.Waiter<GetUserAssessmentRequest, GetUserAssessmentResponse>
            forUserAssessment(
                    GetUserAssessmentRequest request,
                    com.oracle.bmc.datasafe.model.UserAssessmentLifecycleState... targetStates) {
        com.oracle.bmc.util.internal.Validate.notEmpty(
                targetStates, "At least one targetState must be provided");
        com.oracle.bmc.util.internal.Validate.noNullElements(
                targetStates, "Null targetState values are not permitted");

        return forUserAssessment(
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
    public com.oracle.bmc.waiter.Waiter<GetUserAssessmentRequest, GetUserAssessmentResponse>
            forUserAssessment(
                    GetUserAssessmentRequest request,
                    com.oracle.bmc.datasafe.model.UserAssessmentLifecycleState targetState,
                    com.oracle.bmc.waiter.TerminationStrategy terminationStrategy,
                    com.oracle.bmc.waiter.DelayStrategy delayStrategy) {
        com.oracle.bmc.util.internal.Validate.notNull(
                targetState, "The targetState cannot be null");

        return forUserAssessment(
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
     * @return a new {@code Waiter} instance
     */
    public com.oracle.bmc.waiter.Waiter<GetUserAssessmentRequest, GetUserAssessmentResponse>
            forUserAssessment(
                    GetUserAssessmentRequest request,
                    com.oracle.bmc.waiter.TerminationStrategy terminationStrategy,
                    com.oracle.bmc.waiter.DelayStrategy delayStrategy,
                    com.oracle.bmc.datasafe.model.UserAssessmentLifecycleState... targetStates) {
        com.oracle.bmc.util.internal.Validate.notEmpty(
                targetStates, "At least one targetState must be provided");
        com.oracle.bmc.util.internal.Validate.noNullElements(
                targetStates, "Null targetState values are not permitted");

        return forUserAssessment(
                com.oracle.bmc.waiter.Waiters.newWaiter(terminationStrategy, delayStrategy),
                request,
                targetStates);
    }

    // Helper method to create a new Waiter for UserAssessment.
    private com.oracle.bmc.waiter.Waiter<GetUserAssessmentRequest, GetUserAssessmentResponse>
            forUserAssessment(
                    com.oracle.bmc.waiter.BmcGenericWaiter waiter,
                    final GetUserAssessmentRequest request,
                    final com.oracle.bmc.datasafe.model.UserAssessmentLifecycleState...
                            targetStates) {
        final java.util.Set<com.oracle.bmc.datasafe.model.UserAssessmentLifecycleState>
                targetStatesSet = new java.util.HashSet<>(java.util.Arrays.asList(targetStates));

        return new com.oracle.bmc.waiter.internal.SimpleWaiterImpl<>(
                executorService,
                waiter.toCallable(
                        () -> request,
                        new java.util.function.Function<
                                GetUserAssessmentRequest, GetUserAssessmentResponse>() {
                            @Override
                            public GetUserAssessmentResponse apply(
                                    GetUserAssessmentRequest request) {
                                return client.getUserAssessment(request);
                            }
                        },
                        new java.util.function.Predicate<GetUserAssessmentResponse>() {
                            @Override
                            public boolean test(GetUserAssessmentResponse response) {
                                return targetStatesSet.contains(
                                        response.getUserAssessment().getLifecycleState());
                            }
                        },
                        targetStatesSet.contains(
                                com.oracle.bmc.datasafe.model.UserAssessmentLifecycleState
                                        .Deleted)),
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
                    GetUserAssessmentComparisonRequest, GetUserAssessmentComparisonResponse>
            forUserAssessmentComparison(
                    GetUserAssessmentComparisonRequest request,
                    com.oracle.bmc.datasafe.model.UserAssessmentComparison.LifecycleState...
                            targetStates) {
        com.oracle.bmc.util.internal.Validate.notEmpty(
                targetStates, "At least one targetState must be provided");
        com.oracle.bmc.util.internal.Validate.noNullElements(
                targetStates, "Null targetState values are not permitted");

        return forUserAssessmentComparison(
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
                    GetUserAssessmentComparisonRequest, GetUserAssessmentComparisonResponse>
            forUserAssessmentComparison(
                    GetUserAssessmentComparisonRequest request,
                    com.oracle.bmc.datasafe.model.UserAssessmentComparison.LifecycleState
                            targetState,
                    com.oracle.bmc.waiter.TerminationStrategy terminationStrategy,
                    com.oracle.bmc.waiter.DelayStrategy delayStrategy) {
        com.oracle.bmc.util.internal.Validate.notNull(
                targetState, "The targetState cannot be null");

        return forUserAssessmentComparison(
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
                    GetUserAssessmentComparisonRequest, GetUserAssessmentComparisonResponse>
            forUserAssessmentComparison(
                    GetUserAssessmentComparisonRequest request,
                    com.oracle.bmc.waiter.TerminationStrategy terminationStrategy,
                    com.oracle.bmc.waiter.DelayStrategy delayStrategy,
                    com.oracle.bmc.datasafe.model.UserAssessmentComparison.LifecycleState...
                            targetStates) {
        com.oracle.bmc.util.internal.Validate.notEmpty(
                targetStates, "At least one target state must be provided");
        com.oracle.bmc.util.internal.Validate.noNullElements(
                targetStates, "Null target states are not permitted");

        return forUserAssessmentComparison(
                com.oracle.bmc.waiter.Waiters.newWaiter(terminationStrategy, delayStrategy),
                request,
                targetStates);
    }

    // Helper method to create a new Waiter for UserAssessmentComparison.
    private com.oracle.bmc.waiter.Waiter<
                    GetUserAssessmentComparisonRequest, GetUserAssessmentComparisonResponse>
            forUserAssessmentComparison(
                    com.oracle.bmc.waiter.BmcGenericWaiter waiter,
                    final GetUserAssessmentComparisonRequest request,
                    final com.oracle.bmc.datasafe.model.UserAssessmentComparison.LifecycleState...
                            targetStates) {
        final java.util.Set<com.oracle.bmc.datasafe.model.UserAssessmentComparison.LifecycleState>
                targetStatesSet = new java.util.HashSet<>(java.util.Arrays.asList(targetStates));

        return new com.oracle.bmc.waiter.internal.SimpleWaiterImpl<>(
                executorService,
                waiter.toCallable(
                        () -> request,
                        new java.util.function.Function<
                                GetUserAssessmentComparisonRequest,
                                GetUserAssessmentComparisonResponse>() {
                            @Override
                            public GetUserAssessmentComparisonResponse apply(
                                    GetUserAssessmentComparisonRequest request) {
                                return client.getUserAssessmentComparison(request);
                            }
                        },
                        new java.util.function.Predicate<GetUserAssessmentComparisonResponse>() {
                            @Override
                            public boolean test(GetUserAssessmentComparisonResponse response) {
                                return targetStatesSet.contains(
                                        response.getUserAssessmentComparison().getLifecycleState());
                            }
                        },
                        false),
                request);
    }

    /**
     * Creates a new {@link com.oracle.bmc.waiter.Waiter} using default configuration.
     *
     * @param request the request to send
     * @return a new {@code Waiter} instance
     */
    public com.oracle.bmc.waiter.Waiter<GetWorkRequestRequest, GetWorkRequestResponse>
            forWorkRequest(GetWorkRequestRequest request) {
        return forWorkRequest(com.oracle.bmc.waiter.Waiters.DEFAULT_POLLING_WAITER, request);
    }

    /**
     * Creates a new {@link com.oracle.bmc.waiter.Waiter} using the provided configuration.
     *
     * @param request the request to send
     * @param terminationStrategy the {@link com.oracle.bmc.waiter.TerminationStrategy} to use
     * @param delayStrategy the {@linkcom.oracle.bmc.waiter. DelayStrategy} to use
     * @return a new {@code com.oracle.bmc.waiter.Waiter} instance
     */
    public com.oracle.bmc.waiter.Waiter<GetWorkRequestRequest, GetWorkRequestResponse>
            forWorkRequest(
                    GetWorkRequestRequest request,
                    com.oracle.bmc.waiter.TerminationStrategy terminationStrategy,
                    com.oracle.bmc.waiter.DelayStrategy delayStrategy) {
        return forWorkRequest(
                com.oracle.bmc.waiter.Waiters.newWaiter(terminationStrategy, delayStrategy),
                request);
    }

    // Helper method to create a new Waiter for WorkRequest.
    private com.oracle.bmc.waiter.Waiter<GetWorkRequestRequest, GetWorkRequestResponse>
            forWorkRequest(
                    com.oracle.bmc.waiter.BmcGenericWaiter waiter,
                    final GetWorkRequestRequest request) {
        return new com.oracle.bmc.waiter.internal.SimpleWaiterImpl<>(
                executorService,
                waiter.toCallable(
                        () -> request,
                        new java.util.function.Function<
                                GetWorkRequestRequest, GetWorkRequestResponse>() {
                            @Override
                            public GetWorkRequestResponse apply(GetWorkRequestRequest request) {
                                return client.getWorkRequest(request);
                            }
                        },
                        new java.util.function.Predicate<GetWorkRequestResponse>() {
                            @Override
                            public boolean test(GetWorkRequestResponse response) {
                                // work requests are complete once the time finished is available
                                return response.getWorkRequest().getTimeFinished() != null;
                            }
                        },
                        false),
                request);
    }
}
