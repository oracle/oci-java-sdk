/**
 * Copyright (c) 2016, 2020, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.cloudguard;

import com.oracle.bmc.cloudguard.requests.*;
import com.oracle.bmc.cloudguard.responses.*;

/**
 * Collection of helper methods to produce {@link com.oracle.bmc.waiter.Waiter}s for different
 * resources of CloudGuard.
 * <p>
 * The default configuration used is defined by {@link com.oracle.bmc.waiter.Waiters.Waiters#DEFAULT_POLLING_WAITER}.
 */
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200131")
@lombok.RequiredArgsConstructor
public class CloudGuardWaiters {
    private final java.util.concurrent.ExecutorService executorService;
    private final CloudGuard client;

    /**
     * Creates a new {@link com.oracle.bmc.waiter.Waiter} using the default configuration.
     *
     * @param request the request to send
     * @param targetState the desired states to wait for. If multiple states are provided then the waiter will return once the resource reaches any of the provided states
     * @return a new {@code com.oracle.bmc.waiter.Waiter} instance
     */
    public com.oracle.bmc.waiter.Waiter<GetDetectorRequest, GetDetectorResponse> forDetector(
            GetDetectorRequest request,
            com.oracle.bmc.cloudguard.model.LifecycleState... targetStates) {
        org.apache.commons.lang3.Validate.notEmpty(
                targetStates, "At least one targetState must be provided");
        org.apache.commons.lang3.Validate.noNullElements(
                targetStates, "Null targetState values are not permitted");

        return forDetector(
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
    public com.oracle.bmc.waiter.Waiter<GetDetectorRequest, GetDetectorResponse> forDetector(
            GetDetectorRequest request,
            com.oracle.bmc.cloudguard.model.LifecycleState targetState,
            com.oracle.bmc.waiter.TerminationStrategy terminationStrategy,
            com.oracle.bmc.waiter.DelayStrategy delayStrategy) {
        org.apache.commons.lang3.Validate.notNull(targetState, "The targetState cannot be null");

        return forDetector(
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
    public com.oracle.bmc.waiter.Waiter<GetDetectorRequest, GetDetectorResponse> forDetector(
            GetDetectorRequest request,
            com.oracle.bmc.waiter.TerminationStrategy terminationStrategy,
            com.oracle.bmc.waiter.DelayStrategy delayStrategy,
            com.oracle.bmc.cloudguard.model.LifecycleState... targetStates) {
        org.apache.commons.lang3.Validate.notEmpty(
                targetStates, "At least one targetState must be provided");
        org.apache.commons.lang3.Validate.noNullElements(
                targetStates, "Null targetState values are not permitted");

        return forDetector(
                com.oracle.bmc.waiter.Waiters.newWaiter(terminationStrategy, delayStrategy),
                request,
                targetStates);
    }

    // Helper method to create a new Waiter for Detector.
    private com.oracle.bmc.waiter.Waiter<GetDetectorRequest, GetDetectorResponse> forDetector(
            com.oracle.bmc.waiter.BmcGenericWaiter waiter,
            final GetDetectorRequest request,
            final com.oracle.bmc.cloudguard.model.LifecycleState... targetStates) {
        final java.util.Set<com.oracle.bmc.cloudguard.model.LifecycleState> targetStatesSet =
                new java.util.HashSet<>(java.util.Arrays.asList(targetStates));

        return new com.oracle.bmc.waiter.internal.SimpleWaiterImpl<>(
                executorService,
                waiter.toCallable(
                        com.google.common.base.Suppliers.ofInstance(request),
                        new com.google.common.base.Function<
                                GetDetectorRequest, GetDetectorResponse>() {
                            @Override
                            public GetDetectorResponse apply(GetDetectorRequest request) {
                                return client.getDetector(request);
                            }
                        },
                        new com.google.common.base.Predicate<GetDetectorResponse>() {
                            @Override
                            public boolean apply(GetDetectorResponse response) {
                                return targetStatesSet.contains(
                                        response.getDetector().getLifecycleState());
                            }
                        },
                        targetStatesSet.contains(
                                com.oracle.bmc.cloudguard.model.LifecycleState.Deleted)),
                request);
    }

    /**
     * Creates a new {@link com.oracle.bmc.waiter.Waiter} using the default configuration.
     *
     * @param request the request to send
     * @param targetState the desired states to wait for. If multiple states are provided then the waiter will return once the resource reaches any of the provided states
     * @return a new {@code com.oracle.bmc.waiter.Waiter} instance
     */
    public com.oracle.bmc.waiter.Waiter<GetDetectorRecipeRequest, GetDetectorRecipeResponse>
            forDetectorRecipe(
                    GetDetectorRecipeRequest request,
                    com.oracle.bmc.cloudguard.model.LifecycleState... targetStates) {
        org.apache.commons.lang3.Validate.notEmpty(
                targetStates, "At least one targetState must be provided");
        org.apache.commons.lang3.Validate.noNullElements(
                targetStates, "Null targetState values are not permitted");

        return forDetectorRecipe(
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
    public com.oracle.bmc.waiter.Waiter<GetDetectorRecipeRequest, GetDetectorRecipeResponse>
            forDetectorRecipe(
                    GetDetectorRecipeRequest request,
                    com.oracle.bmc.cloudguard.model.LifecycleState targetState,
                    com.oracle.bmc.waiter.TerminationStrategy terminationStrategy,
                    com.oracle.bmc.waiter.DelayStrategy delayStrategy) {
        org.apache.commons.lang3.Validate.notNull(targetState, "The targetState cannot be null");

        return forDetectorRecipe(
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
    public com.oracle.bmc.waiter.Waiter<GetDetectorRecipeRequest, GetDetectorRecipeResponse>
            forDetectorRecipe(
                    GetDetectorRecipeRequest request,
                    com.oracle.bmc.waiter.TerminationStrategy terminationStrategy,
                    com.oracle.bmc.waiter.DelayStrategy delayStrategy,
                    com.oracle.bmc.cloudguard.model.LifecycleState... targetStates) {
        org.apache.commons.lang3.Validate.notEmpty(
                targetStates, "At least one targetState must be provided");
        org.apache.commons.lang3.Validate.noNullElements(
                targetStates, "Null targetState values are not permitted");

        return forDetectorRecipe(
                com.oracle.bmc.waiter.Waiters.newWaiter(terminationStrategy, delayStrategy),
                request,
                targetStates);
    }

    // Helper method to create a new Waiter for DetectorRecipe.
    private com.oracle.bmc.waiter.Waiter<GetDetectorRecipeRequest, GetDetectorRecipeResponse>
            forDetectorRecipe(
                    com.oracle.bmc.waiter.BmcGenericWaiter waiter,
                    final GetDetectorRecipeRequest request,
                    final com.oracle.bmc.cloudguard.model.LifecycleState... targetStates) {
        final java.util.Set<com.oracle.bmc.cloudguard.model.LifecycleState> targetStatesSet =
                new java.util.HashSet<>(java.util.Arrays.asList(targetStates));

        return new com.oracle.bmc.waiter.internal.SimpleWaiterImpl<>(
                executorService,
                waiter.toCallable(
                        com.google.common.base.Suppliers.ofInstance(request),
                        new com.google.common.base.Function<
                                GetDetectorRecipeRequest, GetDetectorRecipeResponse>() {
                            @Override
                            public GetDetectorRecipeResponse apply(
                                    GetDetectorRecipeRequest request) {
                                return client.getDetectorRecipe(request);
                            }
                        },
                        new com.google.common.base.Predicate<GetDetectorRecipeResponse>() {
                            @Override
                            public boolean apply(GetDetectorRecipeResponse response) {
                                return targetStatesSet.contains(
                                        response.getDetectorRecipe().getLifecycleState());
                            }
                        },
                        targetStatesSet.contains(
                                com.oracle.bmc.cloudguard.model.LifecycleState.Deleted)),
                request);
    }

    /**
     * Creates a new {@link com.oracle.bmc.waiter.Waiter} using the default configuration.
     *
     * @param request the request to send
     * @param targetState the desired states to wait for. If multiple states are provided then the waiter will return once the resource reaches any of the provided states
     * @return a new {@code com.oracle.bmc.waiter.Waiter} instance
     */
    public com.oracle.bmc.waiter.Waiter<
                    GetDetectorRecipeDetectorRuleRequest, GetDetectorRecipeDetectorRuleResponse>
            forDetectorRecipeDetectorRule(
                    GetDetectorRecipeDetectorRuleRequest request,
                    com.oracle.bmc.cloudguard.model.LifecycleState... targetStates) {
        org.apache.commons.lang3.Validate.notEmpty(
                targetStates, "At least one targetState must be provided");
        org.apache.commons.lang3.Validate.noNullElements(
                targetStates, "Null targetState values are not permitted");

        return forDetectorRecipeDetectorRule(
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
                    GetDetectorRecipeDetectorRuleRequest, GetDetectorRecipeDetectorRuleResponse>
            forDetectorRecipeDetectorRule(
                    GetDetectorRecipeDetectorRuleRequest request,
                    com.oracle.bmc.cloudguard.model.LifecycleState targetState,
                    com.oracle.bmc.waiter.TerminationStrategy terminationStrategy,
                    com.oracle.bmc.waiter.DelayStrategy delayStrategy) {
        org.apache.commons.lang3.Validate.notNull(targetState, "The targetState cannot be null");

        return forDetectorRecipeDetectorRule(
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
    public com.oracle.bmc.waiter.Waiter<
                    GetDetectorRecipeDetectorRuleRequest, GetDetectorRecipeDetectorRuleResponse>
            forDetectorRecipeDetectorRule(
                    GetDetectorRecipeDetectorRuleRequest request,
                    com.oracle.bmc.waiter.TerminationStrategy terminationStrategy,
                    com.oracle.bmc.waiter.DelayStrategy delayStrategy,
                    com.oracle.bmc.cloudguard.model.LifecycleState... targetStates) {
        org.apache.commons.lang3.Validate.notEmpty(
                targetStates, "At least one targetState must be provided");
        org.apache.commons.lang3.Validate.noNullElements(
                targetStates, "Null targetState values are not permitted");

        return forDetectorRecipeDetectorRule(
                com.oracle.bmc.waiter.Waiters.newWaiter(terminationStrategy, delayStrategy),
                request,
                targetStates);
    }

    // Helper method to create a new Waiter for DetectorRecipeDetectorRule.
    private com.oracle.bmc.waiter.Waiter<
                    GetDetectorRecipeDetectorRuleRequest, GetDetectorRecipeDetectorRuleResponse>
            forDetectorRecipeDetectorRule(
                    com.oracle.bmc.waiter.BmcGenericWaiter waiter,
                    final GetDetectorRecipeDetectorRuleRequest request,
                    final com.oracle.bmc.cloudguard.model.LifecycleState... targetStates) {
        final java.util.Set<com.oracle.bmc.cloudguard.model.LifecycleState> targetStatesSet =
                new java.util.HashSet<>(java.util.Arrays.asList(targetStates));

        return new com.oracle.bmc.waiter.internal.SimpleWaiterImpl<>(
                executorService,
                waiter.toCallable(
                        com.google.common.base.Suppliers.ofInstance(request),
                        new com.google.common.base.Function<
                                GetDetectorRecipeDetectorRuleRequest,
                                GetDetectorRecipeDetectorRuleResponse>() {
                            @Override
                            public GetDetectorRecipeDetectorRuleResponse apply(
                                    GetDetectorRecipeDetectorRuleRequest request) {
                                return client.getDetectorRecipeDetectorRule(request);
                            }
                        },
                        new com.google.common.base.Predicate<
                                GetDetectorRecipeDetectorRuleResponse>() {
                            @Override
                            public boolean apply(GetDetectorRecipeDetectorRuleResponse response) {
                                return targetStatesSet.contains(
                                        response.getDetectorRecipeDetectorRule()
                                                .getLifecycleState());
                            }
                        },
                        targetStatesSet.contains(
                                com.oracle.bmc.cloudguard.model.LifecycleState.Deleted)),
                request);
    }

    /**
     * Creates a new {@link com.oracle.bmc.waiter.Waiter} using the default configuration.
     *
     * @param request the request to send
     * @param targetState the desired states to wait for. If multiple states are provided then the waiter will return once the resource reaches any of the provided states
     * @return a new {@code com.oracle.bmc.waiter.Waiter} instance
     */
    public com.oracle.bmc.waiter.Waiter<GetDetectorRuleRequest, GetDetectorRuleResponse>
            forDetectorRule(
                    GetDetectorRuleRequest request,
                    com.oracle.bmc.cloudguard.model.LifecycleState... targetStates) {
        org.apache.commons.lang3.Validate.notEmpty(
                targetStates, "At least one targetState must be provided");
        org.apache.commons.lang3.Validate.noNullElements(
                targetStates, "Null targetState values are not permitted");

        return forDetectorRule(
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
    public com.oracle.bmc.waiter.Waiter<GetDetectorRuleRequest, GetDetectorRuleResponse>
            forDetectorRule(
                    GetDetectorRuleRequest request,
                    com.oracle.bmc.cloudguard.model.LifecycleState targetState,
                    com.oracle.bmc.waiter.TerminationStrategy terminationStrategy,
                    com.oracle.bmc.waiter.DelayStrategy delayStrategy) {
        org.apache.commons.lang3.Validate.notNull(targetState, "The targetState cannot be null");

        return forDetectorRule(
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
    public com.oracle.bmc.waiter.Waiter<GetDetectorRuleRequest, GetDetectorRuleResponse>
            forDetectorRule(
                    GetDetectorRuleRequest request,
                    com.oracle.bmc.waiter.TerminationStrategy terminationStrategy,
                    com.oracle.bmc.waiter.DelayStrategy delayStrategy,
                    com.oracle.bmc.cloudguard.model.LifecycleState... targetStates) {
        org.apache.commons.lang3.Validate.notEmpty(
                targetStates, "At least one targetState must be provided");
        org.apache.commons.lang3.Validate.noNullElements(
                targetStates, "Null targetState values are not permitted");

        return forDetectorRule(
                com.oracle.bmc.waiter.Waiters.newWaiter(terminationStrategy, delayStrategy),
                request,
                targetStates);
    }

    // Helper method to create a new Waiter for DetectorRule.
    private com.oracle.bmc.waiter.Waiter<GetDetectorRuleRequest, GetDetectorRuleResponse>
            forDetectorRule(
                    com.oracle.bmc.waiter.BmcGenericWaiter waiter,
                    final GetDetectorRuleRequest request,
                    final com.oracle.bmc.cloudguard.model.LifecycleState... targetStates) {
        final java.util.Set<com.oracle.bmc.cloudguard.model.LifecycleState> targetStatesSet =
                new java.util.HashSet<>(java.util.Arrays.asList(targetStates));

        return new com.oracle.bmc.waiter.internal.SimpleWaiterImpl<>(
                executorService,
                waiter.toCallable(
                        com.google.common.base.Suppliers.ofInstance(request),
                        new com.google.common.base.Function<
                                GetDetectorRuleRequest, GetDetectorRuleResponse>() {
                            @Override
                            public GetDetectorRuleResponse apply(GetDetectorRuleRequest request) {
                                return client.getDetectorRule(request);
                            }
                        },
                        new com.google.common.base.Predicate<GetDetectorRuleResponse>() {
                            @Override
                            public boolean apply(GetDetectorRuleResponse response) {
                                return targetStatesSet.contains(
                                        response.getDetectorRule().getLifecycleState());
                            }
                        },
                        targetStatesSet.contains(
                                com.oracle.bmc.cloudguard.model.LifecycleState.Deleted)),
                request);
    }

    /**
     * Creates a new {@link com.oracle.bmc.waiter.Waiter} using the default configuration.
     *
     * @param request the request to send
     * @param targetState the desired states to wait for. If multiple states are provided then the waiter will return once the resource reaches any of the provided states
     * @return a new {@code com.oracle.bmc.waiter.Waiter} instance
     */
    public com.oracle.bmc.waiter.Waiter<GetManagedListRequest, GetManagedListResponse>
            forManagedList(
                    GetManagedListRequest request,
                    com.oracle.bmc.cloudguard.model.LifecycleState... targetStates) {
        org.apache.commons.lang3.Validate.notEmpty(
                targetStates, "At least one targetState must be provided");
        org.apache.commons.lang3.Validate.noNullElements(
                targetStates, "Null targetState values are not permitted");

        return forManagedList(
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
    public com.oracle.bmc.waiter.Waiter<GetManagedListRequest, GetManagedListResponse>
            forManagedList(
                    GetManagedListRequest request,
                    com.oracle.bmc.cloudguard.model.LifecycleState targetState,
                    com.oracle.bmc.waiter.TerminationStrategy terminationStrategy,
                    com.oracle.bmc.waiter.DelayStrategy delayStrategy) {
        org.apache.commons.lang3.Validate.notNull(targetState, "The targetState cannot be null");

        return forManagedList(
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
    public com.oracle.bmc.waiter.Waiter<GetManagedListRequest, GetManagedListResponse>
            forManagedList(
                    GetManagedListRequest request,
                    com.oracle.bmc.waiter.TerminationStrategy terminationStrategy,
                    com.oracle.bmc.waiter.DelayStrategy delayStrategy,
                    com.oracle.bmc.cloudguard.model.LifecycleState... targetStates) {
        org.apache.commons.lang3.Validate.notEmpty(
                targetStates, "At least one targetState must be provided");
        org.apache.commons.lang3.Validate.noNullElements(
                targetStates, "Null targetState values are not permitted");

        return forManagedList(
                com.oracle.bmc.waiter.Waiters.newWaiter(terminationStrategy, delayStrategy),
                request,
                targetStates);
    }

    // Helper method to create a new Waiter for ManagedList.
    private com.oracle.bmc.waiter.Waiter<GetManagedListRequest, GetManagedListResponse>
            forManagedList(
                    com.oracle.bmc.waiter.BmcGenericWaiter waiter,
                    final GetManagedListRequest request,
                    final com.oracle.bmc.cloudguard.model.LifecycleState... targetStates) {
        final java.util.Set<com.oracle.bmc.cloudguard.model.LifecycleState> targetStatesSet =
                new java.util.HashSet<>(java.util.Arrays.asList(targetStates));

        return new com.oracle.bmc.waiter.internal.SimpleWaiterImpl<>(
                executorService,
                waiter.toCallable(
                        com.google.common.base.Suppliers.ofInstance(request),
                        new com.google.common.base.Function<
                                GetManagedListRequest, GetManagedListResponse>() {
                            @Override
                            public GetManagedListResponse apply(GetManagedListRequest request) {
                                return client.getManagedList(request);
                            }
                        },
                        new com.google.common.base.Predicate<GetManagedListResponse>() {
                            @Override
                            public boolean apply(GetManagedListResponse response) {
                                return targetStatesSet.contains(
                                        response.getManagedList().getLifecycleState());
                            }
                        },
                        targetStatesSet.contains(
                                com.oracle.bmc.cloudguard.model.LifecycleState.Deleted)),
                request);
    }

    /**
     * Creates a new {@link com.oracle.bmc.waiter.Waiter} using the default configuration.
     *
     * @param request the request to send
     * @param targetState the desired states to wait for. If multiple states are provided then the waiter will return once the resource reaches any of the provided states
     * @return a new {@code com.oracle.bmc.waiter.Waiter} instance
     */
    public com.oracle.bmc.waiter.Waiter<GetProblemRequest, GetProblemResponse> forProblem(
            GetProblemRequest request,
            com.oracle.bmc.cloudguard.model.ProblemLifecycleState... targetStates) {
        org.apache.commons.lang3.Validate.notEmpty(
                targetStates, "At least one targetState must be provided");
        org.apache.commons.lang3.Validate.noNullElements(
                targetStates, "Null targetState values are not permitted");

        return forProblem(
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
    public com.oracle.bmc.waiter.Waiter<GetProblemRequest, GetProblemResponse> forProblem(
            GetProblemRequest request,
            com.oracle.bmc.cloudguard.model.ProblemLifecycleState targetState,
            com.oracle.bmc.waiter.TerminationStrategy terminationStrategy,
            com.oracle.bmc.waiter.DelayStrategy delayStrategy) {
        org.apache.commons.lang3.Validate.notNull(targetState, "The targetState cannot be null");

        return forProblem(
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
    public com.oracle.bmc.waiter.Waiter<GetProblemRequest, GetProblemResponse> forProblem(
            GetProblemRequest request,
            com.oracle.bmc.waiter.TerminationStrategy terminationStrategy,
            com.oracle.bmc.waiter.DelayStrategy delayStrategy,
            com.oracle.bmc.cloudguard.model.ProblemLifecycleState... targetStates) {
        org.apache.commons.lang3.Validate.notEmpty(
                targetStates, "At least one targetState must be provided");
        org.apache.commons.lang3.Validate.noNullElements(
                targetStates, "Null targetState values are not permitted");

        return forProblem(
                com.oracle.bmc.waiter.Waiters.newWaiter(terminationStrategy, delayStrategy),
                request,
                targetStates);
    }

    // Helper method to create a new Waiter for Problem.
    private com.oracle.bmc.waiter.Waiter<GetProblemRequest, GetProblemResponse> forProblem(
            com.oracle.bmc.waiter.BmcGenericWaiter waiter,
            final GetProblemRequest request,
            final com.oracle.bmc.cloudguard.model.ProblemLifecycleState... targetStates) {
        final java.util.Set<com.oracle.bmc.cloudguard.model.ProblemLifecycleState> targetStatesSet =
                new java.util.HashSet<>(java.util.Arrays.asList(targetStates));

        return new com.oracle.bmc.waiter.internal.SimpleWaiterImpl<>(
                executorService,
                waiter.toCallable(
                        com.google.common.base.Suppliers.ofInstance(request),
                        new com.google.common.base.Function<
                                GetProblemRequest, GetProblemResponse>() {
                            @Override
                            public GetProblemResponse apply(GetProblemRequest request) {
                                return client.getProblem(request);
                            }
                        },
                        new com.google.common.base.Predicate<GetProblemResponse>() {
                            @Override
                            public boolean apply(GetProblemResponse response) {
                                return targetStatesSet.contains(
                                        response.getProblem().getLifecycleState());
                            }
                        },
                        false),
                request);
    }

    /**
     * Creates a new {@link com.oracle.bmc.waiter.Waiter} using the default configuration.
     *
     * @param request the request to send
     * @param targetState the desired states to wait for. If multiple states are provided then the waiter will return once the resource reaches any of the provided states
     * @return a new {@code com.oracle.bmc.waiter.Waiter} instance
     */
    public com.oracle.bmc.waiter.Waiter<GetResponderRecipeRequest, GetResponderRecipeResponse>
            forResponderRecipe(
                    GetResponderRecipeRequest request,
                    com.oracle.bmc.cloudguard.model.LifecycleState... targetStates) {
        org.apache.commons.lang3.Validate.notEmpty(
                targetStates, "At least one targetState must be provided");
        org.apache.commons.lang3.Validate.noNullElements(
                targetStates, "Null targetState values are not permitted");

        return forResponderRecipe(
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
    public com.oracle.bmc.waiter.Waiter<GetResponderRecipeRequest, GetResponderRecipeResponse>
            forResponderRecipe(
                    GetResponderRecipeRequest request,
                    com.oracle.bmc.cloudguard.model.LifecycleState targetState,
                    com.oracle.bmc.waiter.TerminationStrategy terminationStrategy,
                    com.oracle.bmc.waiter.DelayStrategy delayStrategy) {
        org.apache.commons.lang3.Validate.notNull(targetState, "The targetState cannot be null");

        return forResponderRecipe(
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
    public com.oracle.bmc.waiter.Waiter<GetResponderRecipeRequest, GetResponderRecipeResponse>
            forResponderRecipe(
                    GetResponderRecipeRequest request,
                    com.oracle.bmc.waiter.TerminationStrategy terminationStrategy,
                    com.oracle.bmc.waiter.DelayStrategy delayStrategy,
                    com.oracle.bmc.cloudguard.model.LifecycleState... targetStates) {
        org.apache.commons.lang3.Validate.notEmpty(
                targetStates, "At least one targetState must be provided");
        org.apache.commons.lang3.Validate.noNullElements(
                targetStates, "Null targetState values are not permitted");

        return forResponderRecipe(
                com.oracle.bmc.waiter.Waiters.newWaiter(terminationStrategy, delayStrategy),
                request,
                targetStates);
    }

    // Helper method to create a new Waiter for ResponderRecipe.
    private com.oracle.bmc.waiter.Waiter<GetResponderRecipeRequest, GetResponderRecipeResponse>
            forResponderRecipe(
                    com.oracle.bmc.waiter.BmcGenericWaiter waiter,
                    final GetResponderRecipeRequest request,
                    final com.oracle.bmc.cloudguard.model.LifecycleState... targetStates) {
        final java.util.Set<com.oracle.bmc.cloudguard.model.LifecycleState> targetStatesSet =
                new java.util.HashSet<>(java.util.Arrays.asList(targetStates));

        return new com.oracle.bmc.waiter.internal.SimpleWaiterImpl<>(
                executorService,
                waiter.toCallable(
                        com.google.common.base.Suppliers.ofInstance(request),
                        new com.google.common.base.Function<
                                GetResponderRecipeRequest, GetResponderRecipeResponse>() {
                            @Override
                            public GetResponderRecipeResponse apply(
                                    GetResponderRecipeRequest request) {
                                return client.getResponderRecipe(request);
                            }
                        },
                        new com.google.common.base.Predicate<GetResponderRecipeResponse>() {
                            @Override
                            public boolean apply(GetResponderRecipeResponse response) {
                                return targetStatesSet.contains(
                                        response.getResponderRecipe().getLifecycleState());
                            }
                        },
                        targetStatesSet.contains(
                                com.oracle.bmc.cloudguard.model.LifecycleState.Deleted)),
                request);
    }

    /**
     * Creates a new {@link com.oracle.bmc.waiter.Waiter} using the default configuration.
     *
     * @param request the request to send
     * @param targetState the desired states to wait for. If multiple states are provided then the waiter will return once the resource reaches any of the provided states
     * @return a new {@code com.oracle.bmc.waiter.Waiter} instance
     */
    public com.oracle.bmc.waiter.Waiter<
                    GetResponderRecipeResponderRuleRequest, GetResponderRecipeResponderRuleResponse>
            forResponderRecipeResponderRule(
                    GetResponderRecipeResponderRuleRequest request,
                    com.oracle.bmc.cloudguard.model.LifecycleState... targetStates) {
        org.apache.commons.lang3.Validate.notEmpty(
                targetStates, "At least one targetState must be provided");
        org.apache.commons.lang3.Validate.noNullElements(
                targetStates, "Null targetState values are not permitted");

        return forResponderRecipeResponderRule(
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
                    GetResponderRecipeResponderRuleRequest, GetResponderRecipeResponderRuleResponse>
            forResponderRecipeResponderRule(
                    GetResponderRecipeResponderRuleRequest request,
                    com.oracle.bmc.cloudguard.model.LifecycleState targetState,
                    com.oracle.bmc.waiter.TerminationStrategy terminationStrategy,
                    com.oracle.bmc.waiter.DelayStrategy delayStrategy) {
        org.apache.commons.lang3.Validate.notNull(targetState, "The targetState cannot be null");

        return forResponderRecipeResponderRule(
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
    public com.oracle.bmc.waiter.Waiter<
                    GetResponderRecipeResponderRuleRequest, GetResponderRecipeResponderRuleResponse>
            forResponderRecipeResponderRule(
                    GetResponderRecipeResponderRuleRequest request,
                    com.oracle.bmc.waiter.TerminationStrategy terminationStrategy,
                    com.oracle.bmc.waiter.DelayStrategy delayStrategy,
                    com.oracle.bmc.cloudguard.model.LifecycleState... targetStates) {
        org.apache.commons.lang3.Validate.notEmpty(
                targetStates, "At least one targetState must be provided");
        org.apache.commons.lang3.Validate.noNullElements(
                targetStates, "Null targetState values are not permitted");

        return forResponderRecipeResponderRule(
                com.oracle.bmc.waiter.Waiters.newWaiter(terminationStrategy, delayStrategy),
                request,
                targetStates);
    }

    // Helper method to create a new Waiter for ResponderRecipeResponderRule.
    private com.oracle.bmc.waiter.Waiter<
                    GetResponderRecipeResponderRuleRequest, GetResponderRecipeResponderRuleResponse>
            forResponderRecipeResponderRule(
                    com.oracle.bmc.waiter.BmcGenericWaiter waiter,
                    final GetResponderRecipeResponderRuleRequest request,
                    final com.oracle.bmc.cloudguard.model.LifecycleState... targetStates) {
        final java.util.Set<com.oracle.bmc.cloudguard.model.LifecycleState> targetStatesSet =
                new java.util.HashSet<>(java.util.Arrays.asList(targetStates));

        return new com.oracle.bmc.waiter.internal.SimpleWaiterImpl<>(
                executorService,
                waiter.toCallable(
                        com.google.common.base.Suppliers.ofInstance(request),
                        new com.google.common.base.Function<
                                GetResponderRecipeResponderRuleRequest,
                                GetResponderRecipeResponderRuleResponse>() {
                            @Override
                            public GetResponderRecipeResponderRuleResponse apply(
                                    GetResponderRecipeResponderRuleRequest request) {
                                return client.getResponderRecipeResponderRule(request);
                            }
                        },
                        new com.google.common.base.Predicate<
                                GetResponderRecipeResponderRuleResponse>() {
                            @Override
                            public boolean apply(GetResponderRecipeResponderRuleResponse response) {
                                return targetStatesSet.contains(
                                        response.getResponderRecipeResponderRule()
                                                .getLifecycleState());
                            }
                        },
                        targetStatesSet.contains(
                                com.oracle.bmc.cloudguard.model.LifecycleState.Deleted)),
                request);
    }

    /**
     * Creates a new {@link com.oracle.bmc.waiter.Waiter} using the default configuration.
     *
     * @param request the request to send
     * @param targetState the desired states to wait for. If multiple states are provided then the waiter will return once the resource reaches any of the provided states
     * @return a new {@code com.oracle.bmc.waiter.Waiter} instance
     */
    public com.oracle.bmc.waiter.Waiter<GetResponderRuleRequest, GetResponderRuleResponse>
            forResponderRule(
                    GetResponderRuleRequest request,
                    com.oracle.bmc.cloudguard.model.LifecycleState... targetStates) {
        org.apache.commons.lang3.Validate.notEmpty(
                targetStates, "At least one targetState must be provided");
        org.apache.commons.lang3.Validate.noNullElements(
                targetStates, "Null targetState values are not permitted");

        return forResponderRule(
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
    public com.oracle.bmc.waiter.Waiter<GetResponderRuleRequest, GetResponderRuleResponse>
            forResponderRule(
                    GetResponderRuleRequest request,
                    com.oracle.bmc.cloudguard.model.LifecycleState targetState,
                    com.oracle.bmc.waiter.TerminationStrategy terminationStrategy,
                    com.oracle.bmc.waiter.DelayStrategy delayStrategy) {
        org.apache.commons.lang3.Validate.notNull(targetState, "The targetState cannot be null");

        return forResponderRule(
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
    public com.oracle.bmc.waiter.Waiter<GetResponderRuleRequest, GetResponderRuleResponse>
            forResponderRule(
                    GetResponderRuleRequest request,
                    com.oracle.bmc.waiter.TerminationStrategy terminationStrategy,
                    com.oracle.bmc.waiter.DelayStrategy delayStrategy,
                    com.oracle.bmc.cloudguard.model.LifecycleState... targetStates) {
        org.apache.commons.lang3.Validate.notEmpty(
                targetStates, "At least one targetState must be provided");
        org.apache.commons.lang3.Validate.noNullElements(
                targetStates, "Null targetState values are not permitted");

        return forResponderRule(
                com.oracle.bmc.waiter.Waiters.newWaiter(terminationStrategy, delayStrategy),
                request,
                targetStates);
    }

    // Helper method to create a new Waiter for ResponderRule.
    private com.oracle.bmc.waiter.Waiter<GetResponderRuleRequest, GetResponderRuleResponse>
            forResponderRule(
                    com.oracle.bmc.waiter.BmcGenericWaiter waiter,
                    final GetResponderRuleRequest request,
                    final com.oracle.bmc.cloudguard.model.LifecycleState... targetStates) {
        final java.util.Set<com.oracle.bmc.cloudguard.model.LifecycleState> targetStatesSet =
                new java.util.HashSet<>(java.util.Arrays.asList(targetStates));

        return new com.oracle.bmc.waiter.internal.SimpleWaiterImpl<>(
                executorService,
                waiter.toCallable(
                        com.google.common.base.Suppliers.ofInstance(request),
                        new com.google.common.base.Function<
                                GetResponderRuleRequest, GetResponderRuleResponse>() {
                            @Override
                            public GetResponderRuleResponse apply(GetResponderRuleRequest request) {
                                return client.getResponderRule(request);
                            }
                        },
                        new com.google.common.base.Predicate<GetResponderRuleResponse>() {
                            @Override
                            public boolean apply(GetResponderRuleResponse response) {
                                return targetStatesSet.contains(
                                        response.getResponderRule().getLifecycleState());
                            }
                        },
                        targetStatesSet.contains(
                                com.oracle.bmc.cloudguard.model.LifecycleState.Deleted)),
                request);
    }

    /**
     * Creates a new {@link com.oracle.bmc.waiter.Waiter} using the default configuration.
     *
     * @param request the request to send
     * @param targetState the desired states to wait for. If multiple states are provided then the waiter will return once the resource reaches any of the provided states
     * @return a new {@code com.oracle.bmc.waiter.Waiter} instance
     */
    public com.oracle.bmc.waiter.Waiter<GetTargetRequest, GetTargetResponse> forTarget(
            GetTargetRequest request,
            com.oracle.bmc.cloudguard.model.LifecycleState... targetStates) {
        org.apache.commons.lang3.Validate.notEmpty(
                targetStates, "At least one targetState must be provided");
        org.apache.commons.lang3.Validate.noNullElements(
                targetStates, "Null targetState values are not permitted");

        return forTarget(
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
    public com.oracle.bmc.waiter.Waiter<GetTargetRequest, GetTargetResponse> forTarget(
            GetTargetRequest request,
            com.oracle.bmc.cloudguard.model.LifecycleState targetState,
            com.oracle.bmc.waiter.TerminationStrategy terminationStrategy,
            com.oracle.bmc.waiter.DelayStrategy delayStrategy) {
        org.apache.commons.lang3.Validate.notNull(targetState, "The targetState cannot be null");

        return forTarget(
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
    public com.oracle.bmc.waiter.Waiter<GetTargetRequest, GetTargetResponse> forTarget(
            GetTargetRequest request,
            com.oracle.bmc.waiter.TerminationStrategy terminationStrategy,
            com.oracle.bmc.waiter.DelayStrategy delayStrategy,
            com.oracle.bmc.cloudguard.model.LifecycleState... targetStates) {
        org.apache.commons.lang3.Validate.notEmpty(
                targetStates, "At least one targetState must be provided");
        org.apache.commons.lang3.Validate.noNullElements(
                targetStates, "Null targetState values are not permitted");

        return forTarget(
                com.oracle.bmc.waiter.Waiters.newWaiter(terminationStrategy, delayStrategy),
                request,
                targetStates);
    }

    // Helper method to create a new Waiter for Target.
    private com.oracle.bmc.waiter.Waiter<GetTargetRequest, GetTargetResponse> forTarget(
            com.oracle.bmc.waiter.BmcGenericWaiter waiter,
            final GetTargetRequest request,
            final com.oracle.bmc.cloudguard.model.LifecycleState... targetStates) {
        final java.util.Set<com.oracle.bmc.cloudguard.model.LifecycleState> targetStatesSet =
                new java.util.HashSet<>(java.util.Arrays.asList(targetStates));

        return new com.oracle.bmc.waiter.internal.SimpleWaiterImpl<>(
                executorService,
                waiter.toCallable(
                        com.google.common.base.Suppliers.ofInstance(request),
                        new com.google.common.base.Function<GetTargetRequest, GetTargetResponse>() {
                            @Override
                            public GetTargetResponse apply(GetTargetRequest request) {
                                return client.getTarget(request);
                            }
                        },
                        new com.google.common.base.Predicate<GetTargetResponse>() {
                            @Override
                            public boolean apply(GetTargetResponse response) {
                                return targetStatesSet.contains(
                                        response.getTarget().getLifecycleState());
                            }
                        },
                        targetStatesSet.contains(
                                com.oracle.bmc.cloudguard.model.LifecycleState.Deleted)),
                request);
    }

    /**
     * Creates a new {@link com.oracle.bmc.waiter.Waiter} using the default configuration.
     *
     * @param request the request to send
     * @param targetState the desired states to wait for. If multiple states are provided then the waiter will return once the resource reaches any of the provided states
     * @return a new {@code com.oracle.bmc.waiter.Waiter} instance
     */
    public com.oracle.bmc.waiter.Waiter<
                    GetTargetDetectorRecipeRequest, GetTargetDetectorRecipeResponse>
            forTargetDetectorRecipe(
                    GetTargetDetectorRecipeRequest request,
                    com.oracle.bmc.cloudguard.model.LifecycleState... targetStates) {
        org.apache.commons.lang3.Validate.notEmpty(
                targetStates, "At least one targetState must be provided");
        org.apache.commons.lang3.Validate.noNullElements(
                targetStates, "Null targetState values are not permitted");

        return forTargetDetectorRecipe(
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
                    GetTargetDetectorRecipeRequest, GetTargetDetectorRecipeResponse>
            forTargetDetectorRecipe(
                    GetTargetDetectorRecipeRequest request,
                    com.oracle.bmc.cloudguard.model.LifecycleState targetState,
                    com.oracle.bmc.waiter.TerminationStrategy terminationStrategy,
                    com.oracle.bmc.waiter.DelayStrategy delayStrategy) {
        org.apache.commons.lang3.Validate.notNull(targetState, "The targetState cannot be null");

        return forTargetDetectorRecipe(
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
    public com.oracle.bmc.waiter.Waiter<
                    GetTargetDetectorRecipeRequest, GetTargetDetectorRecipeResponse>
            forTargetDetectorRecipe(
                    GetTargetDetectorRecipeRequest request,
                    com.oracle.bmc.waiter.TerminationStrategy terminationStrategy,
                    com.oracle.bmc.waiter.DelayStrategy delayStrategy,
                    com.oracle.bmc.cloudguard.model.LifecycleState... targetStates) {
        org.apache.commons.lang3.Validate.notEmpty(
                targetStates, "At least one targetState must be provided");
        org.apache.commons.lang3.Validate.noNullElements(
                targetStates, "Null targetState values are not permitted");

        return forTargetDetectorRecipe(
                com.oracle.bmc.waiter.Waiters.newWaiter(terminationStrategy, delayStrategy),
                request,
                targetStates);
    }

    // Helper method to create a new Waiter for TargetDetectorRecipe.
    private com.oracle.bmc.waiter.Waiter<
                    GetTargetDetectorRecipeRequest, GetTargetDetectorRecipeResponse>
            forTargetDetectorRecipe(
                    com.oracle.bmc.waiter.BmcGenericWaiter waiter,
                    final GetTargetDetectorRecipeRequest request,
                    final com.oracle.bmc.cloudguard.model.LifecycleState... targetStates) {
        final java.util.Set<com.oracle.bmc.cloudguard.model.LifecycleState> targetStatesSet =
                new java.util.HashSet<>(java.util.Arrays.asList(targetStates));

        return new com.oracle.bmc.waiter.internal.SimpleWaiterImpl<>(
                executorService,
                waiter.toCallable(
                        com.google.common.base.Suppliers.ofInstance(request),
                        new com.google.common.base.Function<
                                GetTargetDetectorRecipeRequest, GetTargetDetectorRecipeResponse>() {
                            @Override
                            public GetTargetDetectorRecipeResponse apply(
                                    GetTargetDetectorRecipeRequest request) {
                                return client.getTargetDetectorRecipe(request);
                            }
                        },
                        new com.google.common.base.Predicate<GetTargetDetectorRecipeResponse>() {
                            @Override
                            public boolean apply(GetTargetDetectorRecipeResponse response) {
                                return targetStatesSet.contains(
                                        response.getTargetDetectorRecipe().getLifecycleState());
                            }
                        },
                        targetStatesSet.contains(
                                com.oracle.bmc.cloudguard.model.LifecycleState.Deleted)),
                request);
    }

    /**
     * Creates a new {@link com.oracle.bmc.waiter.Waiter} using the default configuration.
     *
     * @param request the request to send
     * @param targetState the desired states to wait for. If multiple states are provided then the waiter will return once the resource reaches any of the provided states
     * @return a new {@code com.oracle.bmc.waiter.Waiter} instance
     */
    public com.oracle.bmc.waiter.Waiter<
                    GetTargetDetectorRecipeDetectorRuleRequest,
                    GetTargetDetectorRecipeDetectorRuleResponse>
            forTargetDetectorRecipeDetectorRule(
                    GetTargetDetectorRecipeDetectorRuleRequest request,
                    com.oracle.bmc.cloudguard.model.LifecycleState... targetStates) {
        org.apache.commons.lang3.Validate.notEmpty(
                targetStates, "At least one targetState must be provided");
        org.apache.commons.lang3.Validate.noNullElements(
                targetStates, "Null targetState values are not permitted");

        return forTargetDetectorRecipeDetectorRule(
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
                    GetTargetDetectorRecipeDetectorRuleRequest,
                    GetTargetDetectorRecipeDetectorRuleResponse>
            forTargetDetectorRecipeDetectorRule(
                    GetTargetDetectorRecipeDetectorRuleRequest request,
                    com.oracle.bmc.cloudguard.model.LifecycleState targetState,
                    com.oracle.bmc.waiter.TerminationStrategy terminationStrategy,
                    com.oracle.bmc.waiter.DelayStrategy delayStrategy) {
        org.apache.commons.lang3.Validate.notNull(targetState, "The targetState cannot be null");

        return forTargetDetectorRecipeDetectorRule(
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
    public com.oracle.bmc.waiter.Waiter<
                    GetTargetDetectorRecipeDetectorRuleRequest,
                    GetTargetDetectorRecipeDetectorRuleResponse>
            forTargetDetectorRecipeDetectorRule(
                    GetTargetDetectorRecipeDetectorRuleRequest request,
                    com.oracle.bmc.waiter.TerminationStrategy terminationStrategy,
                    com.oracle.bmc.waiter.DelayStrategy delayStrategy,
                    com.oracle.bmc.cloudguard.model.LifecycleState... targetStates) {
        org.apache.commons.lang3.Validate.notEmpty(
                targetStates, "At least one targetState must be provided");
        org.apache.commons.lang3.Validate.noNullElements(
                targetStates, "Null targetState values are not permitted");

        return forTargetDetectorRecipeDetectorRule(
                com.oracle.bmc.waiter.Waiters.newWaiter(terminationStrategy, delayStrategy),
                request,
                targetStates);
    }

    // Helper method to create a new Waiter for TargetDetectorRecipeDetectorRule.
    private com.oracle.bmc.waiter.Waiter<
                    GetTargetDetectorRecipeDetectorRuleRequest,
                    GetTargetDetectorRecipeDetectorRuleResponse>
            forTargetDetectorRecipeDetectorRule(
                    com.oracle.bmc.waiter.BmcGenericWaiter waiter,
                    final GetTargetDetectorRecipeDetectorRuleRequest request,
                    final com.oracle.bmc.cloudguard.model.LifecycleState... targetStates) {
        final java.util.Set<com.oracle.bmc.cloudguard.model.LifecycleState> targetStatesSet =
                new java.util.HashSet<>(java.util.Arrays.asList(targetStates));

        return new com.oracle.bmc.waiter.internal.SimpleWaiterImpl<>(
                executorService,
                waiter.toCallable(
                        com.google.common.base.Suppliers.ofInstance(request),
                        new com.google.common.base.Function<
                                GetTargetDetectorRecipeDetectorRuleRequest,
                                GetTargetDetectorRecipeDetectorRuleResponse>() {
                            @Override
                            public GetTargetDetectorRecipeDetectorRuleResponse apply(
                                    GetTargetDetectorRecipeDetectorRuleRequest request) {
                                return client.getTargetDetectorRecipeDetectorRule(request);
                            }
                        },
                        new com.google.common.base.Predicate<
                                GetTargetDetectorRecipeDetectorRuleResponse>() {
                            @Override
                            public boolean apply(
                                    GetTargetDetectorRecipeDetectorRuleResponse response) {
                                return targetStatesSet.contains(
                                        response.getTargetDetectorRecipeDetectorRule()
                                                .getLifecycleState());
                            }
                        },
                        targetStatesSet.contains(
                                com.oracle.bmc.cloudguard.model.LifecycleState.Deleted)),
                request);
    }

    /**
     * Creates a new {@link com.oracle.bmc.waiter.Waiter} using the default configuration.
     *
     * @param request the request to send
     * @param targetState the desired states to wait for. If multiple states are provided then the waiter will return once the resource reaches any of the provided states
     * @return a new {@code com.oracle.bmc.waiter.Waiter} instance
     */
    public com.oracle.bmc.waiter.Waiter<
                    GetTargetResponderRecipeResponderRuleRequest,
                    GetTargetResponderRecipeResponderRuleResponse>
            forTargetResponderRecipeResponderRule(
                    GetTargetResponderRecipeResponderRuleRequest request,
                    com.oracle.bmc.cloudguard.model.LifecycleState... targetStates) {
        org.apache.commons.lang3.Validate.notEmpty(
                targetStates, "At least one targetState must be provided");
        org.apache.commons.lang3.Validate.noNullElements(
                targetStates, "Null targetState values are not permitted");

        return forTargetResponderRecipeResponderRule(
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
                    GetTargetResponderRecipeResponderRuleRequest,
                    GetTargetResponderRecipeResponderRuleResponse>
            forTargetResponderRecipeResponderRule(
                    GetTargetResponderRecipeResponderRuleRequest request,
                    com.oracle.bmc.cloudguard.model.LifecycleState targetState,
                    com.oracle.bmc.waiter.TerminationStrategy terminationStrategy,
                    com.oracle.bmc.waiter.DelayStrategy delayStrategy) {
        org.apache.commons.lang3.Validate.notNull(targetState, "The targetState cannot be null");

        return forTargetResponderRecipeResponderRule(
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
    public com.oracle.bmc.waiter.Waiter<
                    GetTargetResponderRecipeResponderRuleRequest,
                    GetTargetResponderRecipeResponderRuleResponse>
            forTargetResponderRecipeResponderRule(
                    GetTargetResponderRecipeResponderRuleRequest request,
                    com.oracle.bmc.waiter.TerminationStrategy terminationStrategy,
                    com.oracle.bmc.waiter.DelayStrategy delayStrategy,
                    com.oracle.bmc.cloudguard.model.LifecycleState... targetStates) {
        org.apache.commons.lang3.Validate.notEmpty(
                targetStates, "At least one targetState must be provided");
        org.apache.commons.lang3.Validate.noNullElements(
                targetStates, "Null targetState values are not permitted");

        return forTargetResponderRecipeResponderRule(
                com.oracle.bmc.waiter.Waiters.newWaiter(terminationStrategy, delayStrategy),
                request,
                targetStates);
    }

    // Helper method to create a new Waiter for TargetResponderRecipeResponderRule.
    private com.oracle.bmc.waiter.Waiter<
                    GetTargetResponderRecipeResponderRuleRequest,
                    GetTargetResponderRecipeResponderRuleResponse>
            forTargetResponderRecipeResponderRule(
                    com.oracle.bmc.waiter.BmcGenericWaiter waiter,
                    final GetTargetResponderRecipeResponderRuleRequest request,
                    final com.oracle.bmc.cloudguard.model.LifecycleState... targetStates) {
        final java.util.Set<com.oracle.bmc.cloudguard.model.LifecycleState> targetStatesSet =
                new java.util.HashSet<>(java.util.Arrays.asList(targetStates));

        return new com.oracle.bmc.waiter.internal.SimpleWaiterImpl<>(
                executorService,
                waiter.toCallable(
                        com.google.common.base.Suppliers.ofInstance(request),
                        new com.google.common.base.Function<
                                GetTargetResponderRecipeResponderRuleRequest,
                                GetTargetResponderRecipeResponderRuleResponse>() {
                            @Override
                            public GetTargetResponderRecipeResponderRuleResponse apply(
                                    GetTargetResponderRecipeResponderRuleRequest request) {
                                return client.getTargetResponderRecipeResponderRule(request);
                            }
                        },
                        new com.google.common.base.Predicate<
                                GetTargetResponderRecipeResponderRuleResponse>() {
                            @Override
                            public boolean apply(
                                    GetTargetResponderRecipeResponderRuleResponse response) {
                                return targetStatesSet.contains(
                                        response.getTargetResponderRecipeResponderRule()
                                                .getLifecycleState());
                            }
                        },
                        targetStatesSet.contains(
                                com.oracle.bmc.cloudguard.model.LifecycleState.Deleted)),
                request);
    }
}
