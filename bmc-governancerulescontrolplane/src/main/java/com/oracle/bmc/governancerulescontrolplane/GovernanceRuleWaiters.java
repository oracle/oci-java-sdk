/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.governancerulescontrolplane;

import com.oracle.bmc.governancerulescontrolplane.requests.*;
import com.oracle.bmc.governancerulescontrolplane.responses.*;

/**
 * Collection of helper methods to produce {@link com.oracle.bmc.waiter.Waiter}s for different
 * resources of GovernanceRule.
 * <p>
 * The default configuration used is defined by {@link com.oracle.bmc.waiter.Waiters.Waiters#DEFAULT_POLLING_WAITER}.
 */
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20220504")
public class GovernanceRuleWaiters {
    private final java.util.concurrent.ExecutorService executorService;
    private final GovernanceRule client;

    public GovernanceRuleWaiters(
            java.util.concurrent.ExecutorService executorService, GovernanceRule client) {
        this.executorService = executorService;
        this.client = client;
    }

    /**
     * Creates a new {@link com.oracle.bmc.waiter.Waiter} using the default configuration.
     *
     * @param request the request to send
     * @param targetState the desired states to wait for. If multiple states are provided then the waiter will return once the resource reaches any of the provided states
     * @return a new {@code com.oracle.bmc.waiter.Waiter} instance
     */
    public com.oracle.bmc.waiter.Waiter<
                    GetEnforcedGovernanceRuleRequest, GetEnforcedGovernanceRuleResponse>
            forEnforcedGovernanceRule(
                    GetEnforcedGovernanceRuleRequest request,
                    com.oracle.bmc.governancerulescontrolplane.model.GovernanceRuleLifecycleState...
                            targetStates) {
        com.oracle.bmc.util.internal.Validate.notEmpty(
                targetStates, "At least one targetState must be provided");
        com.oracle.bmc.util.internal.Validate.noNullElements(
                targetStates, "Null targetState values are not permitted");

        return forEnforcedGovernanceRule(
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
                    GetEnforcedGovernanceRuleRequest, GetEnforcedGovernanceRuleResponse>
            forEnforcedGovernanceRule(
                    GetEnforcedGovernanceRuleRequest request,
                    com.oracle.bmc.governancerulescontrolplane.model.GovernanceRuleLifecycleState
                            targetState,
                    com.oracle.bmc.waiter.TerminationStrategy terminationStrategy,
                    com.oracle.bmc.waiter.DelayStrategy delayStrategy) {
        com.oracle.bmc.util.internal.Validate.notNull(
                targetState, "The targetState cannot be null");

        return forEnforcedGovernanceRule(
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
                    GetEnforcedGovernanceRuleRequest, GetEnforcedGovernanceRuleResponse>
            forEnforcedGovernanceRule(
                    GetEnforcedGovernanceRuleRequest request,
                    com.oracle.bmc.waiter.TerminationStrategy terminationStrategy,
                    com.oracle.bmc.waiter.DelayStrategy delayStrategy,
                    com.oracle.bmc.governancerulescontrolplane.model.GovernanceRuleLifecycleState...
                            targetStates) {
        com.oracle.bmc.util.internal.Validate.notEmpty(
                targetStates, "At least one targetState must be provided");
        com.oracle.bmc.util.internal.Validate.noNullElements(
                targetStates, "Null targetState values are not permitted");

        return forEnforcedGovernanceRule(
                com.oracle.bmc.waiter.Waiters.newWaiter(terminationStrategy, delayStrategy),
                request,
                targetStates);
    }

    // Helper method to create a new Waiter for EnforcedGovernanceRule.
    private com.oracle.bmc.waiter.Waiter<
                    GetEnforcedGovernanceRuleRequest, GetEnforcedGovernanceRuleResponse>
            forEnforcedGovernanceRule(
                    com.oracle.bmc.waiter.BmcGenericWaiter waiter,
                    final GetEnforcedGovernanceRuleRequest request,
                    final com.oracle.bmc.governancerulescontrolplane.model
                                    .GovernanceRuleLifecycleState...
                            targetStates) {
        final java.util.Set<
                        com.oracle.bmc.governancerulescontrolplane.model
                                .GovernanceRuleLifecycleState>
                targetStatesSet = new java.util.HashSet<>(java.util.Arrays.asList(targetStates));

        return new com.oracle.bmc.waiter.internal.SimpleWaiterImpl<>(
                executorService,
                waiter.toCallable(
                        () -> request,
                        new java.util.function.Function<
                                GetEnforcedGovernanceRuleRequest,
                                GetEnforcedGovernanceRuleResponse>() {
                            @Override
                            public GetEnforcedGovernanceRuleResponse apply(
                                    GetEnforcedGovernanceRuleRequest request) {
                                return client.getEnforcedGovernanceRule(request);
                            }
                        },
                        new java.util.function.Predicate<GetEnforcedGovernanceRuleResponse>() {
                            @Override
                            public boolean test(GetEnforcedGovernanceRuleResponse response) {
                                return targetStatesSet.contains(
                                        response.getEnforcedGovernanceRule().getLifecycleState());
                            }
                        },
                        targetStatesSet.contains(
                                com.oracle.bmc.governancerulescontrolplane.model
                                        .GovernanceRuleLifecycleState.Deleted)),
                request);
    }

    /**
     * Creates a new {@link com.oracle.bmc.waiter.Waiter} using the default configuration.
     *
     * @param request the request to send
     * @param targetState the desired states to wait for. If multiple states are provided then the waiter will return once the resource reaches any of the provided states
     * @return a new {@code com.oracle.bmc.waiter.Waiter} instance
     */
    public com.oracle.bmc.waiter.Waiter<GetGovernanceRuleRequest, GetGovernanceRuleResponse>
            forGovernanceRule(
                    GetGovernanceRuleRequest request,
                    com.oracle.bmc.governancerulescontrolplane.model.GovernanceRuleLifecycleState...
                            targetStates) {
        com.oracle.bmc.util.internal.Validate.notEmpty(
                targetStates, "At least one targetState must be provided");
        com.oracle.bmc.util.internal.Validate.noNullElements(
                targetStates, "Null targetState values are not permitted");

        return forGovernanceRule(
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
    public com.oracle.bmc.waiter.Waiter<GetGovernanceRuleRequest, GetGovernanceRuleResponse>
            forGovernanceRule(
                    GetGovernanceRuleRequest request,
                    com.oracle.bmc.governancerulescontrolplane.model.GovernanceRuleLifecycleState
                            targetState,
                    com.oracle.bmc.waiter.TerminationStrategy terminationStrategy,
                    com.oracle.bmc.waiter.DelayStrategy delayStrategy) {
        com.oracle.bmc.util.internal.Validate.notNull(
                targetState, "The targetState cannot be null");

        return forGovernanceRule(
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
    public com.oracle.bmc.waiter.Waiter<GetGovernanceRuleRequest, GetGovernanceRuleResponse>
            forGovernanceRule(
                    GetGovernanceRuleRequest request,
                    com.oracle.bmc.waiter.TerminationStrategy terminationStrategy,
                    com.oracle.bmc.waiter.DelayStrategy delayStrategy,
                    com.oracle.bmc.governancerulescontrolplane.model.GovernanceRuleLifecycleState...
                            targetStates) {
        com.oracle.bmc.util.internal.Validate.notEmpty(
                targetStates, "At least one targetState must be provided");
        com.oracle.bmc.util.internal.Validate.noNullElements(
                targetStates, "Null targetState values are not permitted");

        return forGovernanceRule(
                com.oracle.bmc.waiter.Waiters.newWaiter(terminationStrategy, delayStrategy),
                request,
                targetStates);
    }

    // Helper method to create a new Waiter for GovernanceRule.
    private com.oracle.bmc.waiter.Waiter<GetGovernanceRuleRequest, GetGovernanceRuleResponse>
            forGovernanceRule(
                    com.oracle.bmc.waiter.BmcGenericWaiter waiter,
                    final GetGovernanceRuleRequest request,
                    final com.oracle.bmc.governancerulescontrolplane.model
                                    .GovernanceRuleLifecycleState...
                            targetStates) {
        final java.util.Set<
                        com.oracle.bmc.governancerulescontrolplane.model
                                .GovernanceRuleLifecycleState>
                targetStatesSet = new java.util.HashSet<>(java.util.Arrays.asList(targetStates));

        return new com.oracle.bmc.waiter.internal.SimpleWaiterImpl<>(
                executorService,
                waiter.toCallable(
                        () -> request,
                        new java.util.function.Function<
                                GetGovernanceRuleRequest, GetGovernanceRuleResponse>() {
                            @Override
                            public GetGovernanceRuleResponse apply(
                                    GetGovernanceRuleRequest request) {
                                return client.getGovernanceRule(request);
                            }
                        },
                        new java.util.function.Predicate<GetGovernanceRuleResponse>() {
                            @Override
                            public boolean test(GetGovernanceRuleResponse response) {
                                return targetStatesSet.contains(
                                        response.getGovernanceRule().getLifecycleState());
                            }
                        },
                        targetStatesSet.contains(
                                com.oracle.bmc.governancerulescontrolplane.model
                                        .GovernanceRuleLifecycleState.Deleted)),
                request);
    }

    /**
     * Creates a new {@link com.oracle.bmc.waiter.Waiter} using the default configuration.
     *
     * @param request the request to send
     * @param targetStates the desired states to wait for. If multiple states are provided then the waiter will return once the resource reaches any of the provided states
     * @return a new {@code Waiter} instance
     */
    public com.oracle.bmc.waiter.Waiter<GetInclusionCriterionRequest, GetInclusionCriterionResponse>
            forInclusionCriterion(
                    GetInclusionCriterionRequest request,
                    com.oracle.bmc.governancerulescontrolplane.model.InclusionCriterion
                                    .LifecycleState...
                            targetStates) {
        com.oracle.bmc.util.internal.Validate.notEmpty(
                targetStates, "At least one targetState must be provided");
        com.oracle.bmc.util.internal.Validate.noNullElements(
                targetStates, "Null targetState values are not permitted");

        return forInclusionCriterion(
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
    public com.oracle.bmc.waiter.Waiter<GetInclusionCriterionRequest, GetInclusionCriterionResponse>
            forInclusionCriterion(
                    GetInclusionCriterionRequest request,
                    com.oracle.bmc.governancerulescontrolplane.model.InclusionCriterion
                                    .LifecycleState
                            targetState,
                    com.oracle.bmc.waiter.TerminationStrategy terminationStrategy,
                    com.oracle.bmc.waiter.DelayStrategy delayStrategy) {
        com.oracle.bmc.util.internal.Validate.notNull(
                targetState, "The targetState cannot be null");

        return forInclusionCriterion(
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
    public com.oracle.bmc.waiter.Waiter<GetInclusionCriterionRequest, GetInclusionCriterionResponse>
            forInclusionCriterion(
                    GetInclusionCriterionRequest request,
                    com.oracle.bmc.waiter.TerminationStrategy terminationStrategy,
                    com.oracle.bmc.waiter.DelayStrategy delayStrategy,
                    com.oracle.bmc.governancerulescontrolplane.model.InclusionCriterion
                                    .LifecycleState...
                            targetStates) {
        com.oracle.bmc.util.internal.Validate.notEmpty(
                targetStates, "At least one target state must be provided");
        com.oracle.bmc.util.internal.Validate.noNullElements(
                targetStates, "Null target states are not permitted");

        return forInclusionCriterion(
                com.oracle.bmc.waiter.Waiters.newWaiter(terminationStrategy, delayStrategy),
                request,
                targetStates);
    }

    // Helper method to create a new Waiter for InclusionCriterion.
    private com.oracle.bmc.waiter.Waiter<
                    GetInclusionCriterionRequest, GetInclusionCriterionResponse>
            forInclusionCriterion(
                    com.oracle.bmc.waiter.BmcGenericWaiter waiter,
                    final GetInclusionCriterionRequest request,
                    final com.oracle.bmc.governancerulescontrolplane.model.InclusionCriterion
                                    .LifecycleState...
                            targetStates) {
        final java.util.Set<
                        com.oracle.bmc.governancerulescontrolplane.model.InclusionCriterion
                                .LifecycleState>
                targetStatesSet = new java.util.HashSet<>(java.util.Arrays.asList(targetStates));

        return new com.oracle.bmc.waiter.internal.SimpleWaiterImpl<>(
                executorService,
                waiter.toCallable(
                        () -> request,
                        new java.util.function.Function<
                                GetInclusionCriterionRequest, GetInclusionCriterionResponse>() {
                            @Override
                            public GetInclusionCriterionResponse apply(
                                    GetInclusionCriterionRequest request) {
                                return client.getInclusionCriterion(request);
                            }
                        },
                        new java.util.function.Predicate<GetInclusionCriterionResponse>() {
                            @Override
                            public boolean test(GetInclusionCriterionResponse response) {
                                return targetStatesSet.contains(
                                        response.getInclusionCriterion().getLifecycleState());
                            }
                        },
                        targetStatesSet.contains(
                                com.oracle.bmc.governancerulescontrolplane.model.InclusionCriterion
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
    public com.oracle.bmc.waiter.Waiter<GetTenancyAttachmentRequest, GetTenancyAttachmentResponse>
            forTenancyAttachment(
                    GetTenancyAttachmentRequest request,
                    com.oracle.bmc.governancerulescontrolplane.model.TenancyAttachment
                                    .LifecycleState...
                            targetStates) {
        com.oracle.bmc.util.internal.Validate.notEmpty(
                targetStates, "At least one targetState must be provided");
        com.oracle.bmc.util.internal.Validate.noNullElements(
                targetStates, "Null targetState values are not permitted");

        return forTenancyAttachment(
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
    public com.oracle.bmc.waiter.Waiter<GetTenancyAttachmentRequest, GetTenancyAttachmentResponse>
            forTenancyAttachment(
                    GetTenancyAttachmentRequest request,
                    com.oracle.bmc.governancerulescontrolplane.model.TenancyAttachment
                                    .LifecycleState
                            targetState,
                    com.oracle.bmc.waiter.TerminationStrategy terminationStrategy,
                    com.oracle.bmc.waiter.DelayStrategy delayStrategy) {
        com.oracle.bmc.util.internal.Validate.notNull(
                targetState, "The targetState cannot be null");

        return forTenancyAttachment(
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
    public com.oracle.bmc.waiter.Waiter<GetTenancyAttachmentRequest, GetTenancyAttachmentResponse>
            forTenancyAttachment(
                    GetTenancyAttachmentRequest request,
                    com.oracle.bmc.waiter.TerminationStrategy terminationStrategy,
                    com.oracle.bmc.waiter.DelayStrategy delayStrategy,
                    com.oracle.bmc.governancerulescontrolplane.model.TenancyAttachment
                                    .LifecycleState...
                            targetStates) {
        com.oracle.bmc.util.internal.Validate.notEmpty(
                targetStates, "At least one target state must be provided");
        com.oracle.bmc.util.internal.Validate.noNullElements(
                targetStates, "Null target states are not permitted");

        return forTenancyAttachment(
                com.oracle.bmc.waiter.Waiters.newWaiter(terminationStrategy, delayStrategy),
                request,
                targetStates);
    }

    // Helper method to create a new Waiter for TenancyAttachment.
    private com.oracle.bmc.waiter.Waiter<GetTenancyAttachmentRequest, GetTenancyAttachmentResponse>
            forTenancyAttachment(
                    com.oracle.bmc.waiter.BmcGenericWaiter waiter,
                    final GetTenancyAttachmentRequest request,
                    final com.oracle.bmc.governancerulescontrolplane.model.TenancyAttachment
                                    .LifecycleState...
                            targetStates) {
        final java.util.Set<
                        com.oracle.bmc.governancerulescontrolplane.model.TenancyAttachment
                                .LifecycleState>
                targetStatesSet = new java.util.HashSet<>(java.util.Arrays.asList(targetStates));

        return new com.oracle.bmc.waiter.internal.SimpleWaiterImpl<>(
                executorService,
                waiter.toCallable(
                        () -> request,
                        new java.util.function.Function<
                                GetTenancyAttachmentRequest, GetTenancyAttachmentResponse>() {
                            @Override
                            public GetTenancyAttachmentResponse apply(
                                    GetTenancyAttachmentRequest request) {
                                return client.getTenancyAttachment(request);
                            }
                        },
                        new java.util.function.Predicate<GetTenancyAttachmentResponse>() {
                            @Override
                            public boolean test(GetTenancyAttachmentResponse response) {
                                return targetStatesSet.contains(
                                        response.getTenancyAttachment().getLifecycleState());
                            }
                        },
                        targetStatesSet.contains(
                                com.oracle.bmc.governancerulescontrolplane.model.TenancyAttachment
                                        .LifecycleState.Deleted)),
                request);
    }
}
