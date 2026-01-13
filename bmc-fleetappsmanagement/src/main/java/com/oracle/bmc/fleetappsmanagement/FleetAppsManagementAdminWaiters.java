/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.fleetappsmanagement;

import com.oracle.bmc.fleetappsmanagement.requests.*;
import com.oracle.bmc.fleetappsmanagement.responses.*;

/**
 * Collection of helper methods to produce {@link com.oracle.bmc.waiter.Waiter}s for different
 * resources of FleetAppsManagementAdmin.
 *
 * <p>The default configuration used is defined by {@link
 * com.oracle.bmc.waiter.Waiters.Waiters#DEFAULT_POLLING_WAITER}.
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20250228")
public class FleetAppsManagementAdminWaiters {
    private final java.util.concurrent.ExecutorService executorService;
    private final FleetAppsManagementAdmin client;

    public FleetAppsManagementAdminWaiters(
            java.util.concurrent.ExecutorService executorService, FleetAppsManagementAdmin client) {
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
    public com.oracle.bmc.waiter.Waiter<GetCompliancePolicyRequest, GetCompliancePolicyResponse>
            forCompliancePolicy(
                    GetCompliancePolicyRequest request,
                    com.oracle.bmc.fleetappsmanagement.model.CompliancePolicy.LifecycleState...
                            targetStates) {
        com.oracle.bmc.util.internal.Validate.notEmpty(
                targetStates, "At least one targetState must be provided");
        com.oracle.bmc.util.internal.Validate.noNullElements(
                targetStates, "Null targetState values are not permitted");

        return forCompliancePolicy(
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
    public com.oracle.bmc.waiter.Waiter<GetCompliancePolicyRequest, GetCompliancePolicyResponse>
            forCompliancePolicy(
                    GetCompliancePolicyRequest request,
                    com.oracle.bmc.fleetappsmanagement.model.CompliancePolicy.LifecycleState
                            targetState,
                    com.oracle.bmc.waiter.TerminationStrategy terminationStrategy,
                    com.oracle.bmc.waiter.DelayStrategy delayStrategy) {
        com.oracle.bmc.util.internal.Validate.notNull(
                targetState, "The targetState cannot be null");

        return forCompliancePolicy(
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
    public com.oracle.bmc.waiter.Waiter<GetCompliancePolicyRequest, GetCompliancePolicyResponse>
            forCompliancePolicy(
                    GetCompliancePolicyRequest request,
                    com.oracle.bmc.waiter.TerminationStrategy terminationStrategy,
                    com.oracle.bmc.waiter.DelayStrategy delayStrategy,
                    com.oracle.bmc.fleetappsmanagement.model.CompliancePolicy.LifecycleState...
                            targetStates) {
        com.oracle.bmc.util.internal.Validate.notEmpty(
                targetStates, "At least one target state must be provided");
        com.oracle.bmc.util.internal.Validate.noNullElements(
                targetStates, "Null target states are not permitted");

        return forCompliancePolicy(
                com.oracle.bmc.waiter.Waiters.newWaiter(terminationStrategy, delayStrategy),
                request,
                targetStates);
    }

    // Helper method to create a new Waiter for CompliancePolicy.
    private com.oracle.bmc.waiter.Waiter<GetCompliancePolicyRequest, GetCompliancePolicyResponse>
            forCompliancePolicy(
                    com.oracle.bmc.waiter.BmcGenericWaiter waiter,
                    final GetCompliancePolicyRequest request,
                    final com.oracle.bmc.fleetappsmanagement.model.CompliancePolicy.LifecycleState
                                    ...
                            targetStates) {
        final java.util.Set<
                        com.oracle.bmc.fleetappsmanagement.model.CompliancePolicy.LifecycleState>
                targetStatesSet = new java.util.HashSet<>(java.util.Arrays.asList(targetStates));

        return new com.oracle.bmc.waiter.internal.SimpleWaiterImpl<>(
                executorService,
                waiter.toCallable(
                        () -> request,
                        new java.util.function.Function<
                                GetCompliancePolicyRequest, GetCompliancePolicyResponse>() {
                            @Override
                            public GetCompliancePolicyResponse apply(
                                    GetCompliancePolicyRequest request) {
                                return client.getCompliancePolicy(request);
                            }
                        },
                        new java.util.function.Predicate<GetCompliancePolicyResponse>() {
                            @Override
                            public boolean test(GetCompliancePolicyResponse response) {
                                return targetStatesSet.contains(
                                        response.getCompliancePolicy().getLifecycleState());
                            }
                        },
                        targetStatesSet.contains(
                                com.oracle.bmc.fleetappsmanagement.model.CompliancePolicy
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
                    GetCompliancePolicyRuleRequest, GetCompliancePolicyRuleResponse>
            forCompliancePolicyRule(
                    GetCompliancePolicyRuleRequest request,
                    com.oracle.bmc.fleetappsmanagement.model.CompliancePolicyRule.LifecycleState...
                            targetStates) {
        com.oracle.bmc.util.internal.Validate.notEmpty(
                targetStates, "At least one targetState must be provided");
        com.oracle.bmc.util.internal.Validate.noNullElements(
                targetStates, "Null targetState values are not permitted");

        return forCompliancePolicyRule(
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
                    GetCompliancePolicyRuleRequest, GetCompliancePolicyRuleResponse>
            forCompliancePolicyRule(
                    GetCompliancePolicyRuleRequest request,
                    com.oracle.bmc.fleetappsmanagement.model.CompliancePolicyRule.LifecycleState
                            targetState,
                    com.oracle.bmc.waiter.TerminationStrategy terminationStrategy,
                    com.oracle.bmc.waiter.DelayStrategy delayStrategy) {
        com.oracle.bmc.util.internal.Validate.notNull(
                targetState, "The targetState cannot be null");

        return forCompliancePolicyRule(
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
                    GetCompliancePolicyRuleRequest, GetCompliancePolicyRuleResponse>
            forCompliancePolicyRule(
                    GetCompliancePolicyRuleRequest request,
                    com.oracle.bmc.waiter.TerminationStrategy terminationStrategy,
                    com.oracle.bmc.waiter.DelayStrategy delayStrategy,
                    com.oracle.bmc.fleetappsmanagement.model.CompliancePolicyRule.LifecycleState...
                            targetStates) {
        com.oracle.bmc.util.internal.Validate.notEmpty(
                targetStates, "At least one target state must be provided");
        com.oracle.bmc.util.internal.Validate.noNullElements(
                targetStates, "Null target states are not permitted");

        return forCompliancePolicyRule(
                com.oracle.bmc.waiter.Waiters.newWaiter(terminationStrategy, delayStrategy),
                request,
                targetStates);
    }

    // Helper method to create a new Waiter for CompliancePolicyRule.
    private com.oracle.bmc.waiter.Waiter<
                    GetCompliancePolicyRuleRequest, GetCompliancePolicyRuleResponse>
            forCompliancePolicyRule(
                    com.oracle.bmc.waiter.BmcGenericWaiter waiter,
                    final GetCompliancePolicyRuleRequest request,
                    final com.oracle.bmc.fleetappsmanagement.model.CompliancePolicyRule
                                            .LifecycleState
                                    ...
                            targetStates) {
        final java.util.Set<
                        com.oracle.bmc.fleetappsmanagement.model.CompliancePolicyRule
                                .LifecycleState>
                targetStatesSet = new java.util.HashSet<>(java.util.Arrays.asList(targetStates));

        return new com.oracle.bmc.waiter.internal.SimpleWaiterImpl<>(
                executorService,
                waiter.toCallable(
                        () -> request,
                        new java.util.function.Function<
                                GetCompliancePolicyRuleRequest, GetCompliancePolicyRuleResponse>() {
                            @Override
                            public GetCompliancePolicyRuleResponse apply(
                                    GetCompliancePolicyRuleRequest request) {
                                return client.getCompliancePolicyRule(request);
                            }
                        },
                        new java.util.function.Predicate<GetCompliancePolicyRuleResponse>() {
                            @Override
                            public boolean test(GetCompliancePolicyRuleResponse response) {
                                return targetStatesSet.contains(
                                        response.getCompliancePolicyRule().getLifecycleState());
                            }
                        },
                        targetStatesSet.contains(
                                com.oracle.bmc.fleetappsmanagement.model.CompliancePolicyRule
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
    public com.oracle.bmc.waiter.Waiter<GetOnboardingRequest, GetOnboardingResponse> forOnboarding(
            GetOnboardingRequest request,
            com.oracle.bmc.fleetappsmanagement.model.Onboarding.LifecycleState... targetStates) {
        com.oracle.bmc.util.internal.Validate.notEmpty(
                targetStates, "At least one targetState must be provided");
        com.oracle.bmc.util.internal.Validate.noNullElements(
                targetStates, "Null targetState values are not permitted");

        return forOnboarding(
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
    public com.oracle.bmc.waiter.Waiter<GetOnboardingRequest, GetOnboardingResponse> forOnboarding(
            GetOnboardingRequest request,
            com.oracle.bmc.fleetappsmanagement.model.Onboarding.LifecycleState targetState,
            com.oracle.bmc.waiter.TerminationStrategy terminationStrategy,
            com.oracle.bmc.waiter.DelayStrategy delayStrategy) {
        com.oracle.bmc.util.internal.Validate.notNull(
                targetState, "The targetState cannot be null");

        return forOnboarding(
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
    public com.oracle.bmc.waiter.Waiter<GetOnboardingRequest, GetOnboardingResponse> forOnboarding(
            GetOnboardingRequest request,
            com.oracle.bmc.waiter.TerminationStrategy terminationStrategy,
            com.oracle.bmc.waiter.DelayStrategy delayStrategy,
            com.oracle.bmc.fleetappsmanagement.model.Onboarding.LifecycleState... targetStates) {
        com.oracle.bmc.util.internal.Validate.notEmpty(
                targetStates, "At least one target state must be provided");
        com.oracle.bmc.util.internal.Validate.noNullElements(
                targetStates, "Null target states are not permitted");

        return forOnboarding(
                com.oracle.bmc.waiter.Waiters.newWaiter(terminationStrategy, delayStrategy),
                request,
                targetStates);
    }

    // Helper method to create a new Waiter for Onboarding.
    private com.oracle.bmc.waiter.Waiter<GetOnboardingRequest, GetOnboardingResponse> forOnboarding(
            com.oracle.bmc.waiter.BmcGenericWaiter waiter,
            final GetOnboardingRequest request,
            final com.oracle.bmc.fleetappsmanagement.model.Onboarding.LifecycleState...
                    targetStates) {
        final java.util.Set<com.oracle.bmc.fleetappsmanagement.model.Onboarding.LifecycleState>
                targetStatesSet = new java.util.HashSet<>(java.util.Arrays.asList(targetStates));

        return new com.oracle.bmc.waiter.internal.SimpleWaiterImpl<>(
                executorService,
                waiter.toCallable(
                        () -> request,
                        new java.util.function.Function<
                                GetOnboardingRequest, GetOnboardingResponse>() {
                            @Override
                            public GetOnboardingResponse apply(GetOnboardingRequest request) {
                                return client.getOnboarding(request);
                            }
                        },
                        new java.util.function.Predicate<GetOnboardingResponse>() {
                            @Override
                            public boolean test(GetOnboardingResponse response) {
                                return targetStatesSet.contains(
                                        response.getOnboarding().getLifecycleState());
                            }
                        },
                        targetStatesSet.contains(
                                com.oracle.bmc.fleetappsmanagement.model.Onboarding.LifecycleState
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
                    GetPlatformConfigurationRequest, GetPlatformConfigurationResponse>
            forPlatformConfiguration(
                    GetPlatformConfigurationRequest request,
                    com.oracle.bmc.fleetappsmanagement.model.PlatformConfiguration.LifecycleState...
                            targetStates) {
        com.oracle.bmc.util.internal.Validate.notEmpty(
                targetStates, "At least one targetState must be provided");
        com.oracle.bmc.util.internal.Validate.noNullElements(
                targetStates, "Null targetState values are not permitted");

        return forPlatformConfiguration(
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
                    GetPlatformConfigurationRequest, GetPlatformConfigurationResponse>
            forPlatformConfiguration(
                    GetPlatformConfigurationRequest request,
                    com.oracle.bmc.fleetappsmanagement.model.PlatformConfiguration.LifecycleState
                            targetState,
                    com.oracle.bmc.waiter.TerminationStrategy terminationStrategy,
                    com.oracle.bmc.waiter.DelayStrategy delayStrategy) {
        com.oracle.bmc.util.internal.Validate.notNull(
                targetState, "The targetState cannot be null");

        return forPlatformConfiguration(
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
                    GetPlatformConfigurationRequest, GetPlatformConfigurationResponse>
            forPlatformConfiguration(
                    GetPlatformConfigurationRequest request,
                    com.oracle.bmc.waiter.TerminationStrategy terminationStrategy,
                    com.oracle.bmc.waiter.DelayStrategy delayStrategy,
                    com.oracle.bmc.fleetappsmanagement.model.PlatformConfiguration.LifecycleState...
                            targetStates) {
        com.oracle.bmc.util.internal.Validate.notEmpty(
                targetStates, "At least one target state must be provided");
        com.oracle.bmc.util.internal.Validate.noNullElements(
                targetStates, "Null target states are not permitted");

        return forPlatformConfiguration(
                com.oracle.bmc.waiter.Waiters.newWaiter(terminationStrategy, delayStrategy),
                request,
                targetStates);
    }

    // Helper method to create a new Waiter for PlatformConfiguration.
    private com.oracle.bmc.waiter.Waiter<
                    GetPlatformConfigurationRequest, GetPlatformConfigurationResponse>
            forPlatformConfiguration(
                    com.oracle.bmc.waiter.BmcGenericWaiter waiter,
                    final GetPlatformConfigurationRequest request,
                    final com.oracle.bmc.fleetappsmanagement.model.PlatformConfiguration
                                            .LifecycleState
                                    ...
                            targetStates) {
        final java.util.Set<
                        com.oracle.bmc.fleetappsmanagement.model.PlatformConfiguration
                                .LifecycleState>
                targetStatesSet = new java.util.HashSet<>(java.util.Arrays.asList(targetStates));

        return new com.oracle.bmc.waiter.internal.SimpleWaiterImpl<>(
                executorService,
                waiter.toCallable(
                        () -> request,
                        new java.util.function.Function<
                                GetPlatformConfigurationRequest,
                                GetPlatformConfigurationResponse>() {
                            @Override
                            public GetPlatformConfigurationResponse apply(
                                    GetPlatformConfigurationRequest request) {
                                return client.getPlatformConfiguration(request);
                            }
                        },
                        new java.util.function.Predicate<GetPlatformConfigurationResponse>() {
                            @Override
                            public boolean test(GetPlatformConfigurationResponse response) {
                                return targetStatesSet.contains(
                                        response.getPlatformConfiguration().getLifecycleState());
                            }
                        },
                        targetStatesSet.contains(
                                com.oracle.bmc.fleetappsmanagement.model.PlatformConfiguration
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
    public com.oracle.bmc.waiter.Waiter<GetPropertyRequest, GetPropertyResponse> forProperty(
            GetPropertyRequest request,
            com.oracle.bmc.fleetappsmanagement.model.Property.LifecycleState... targetStates) {
        com.oracle.bmc.util.internal.Validate.notEmpty(
                targetStates, "At least one targetState must be provided");
        com.oracle.bmc.util.internal.Validate.noNullElements(
                targetStates, "Null targetState values are not permitted");

        return forProperty(
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
    public com.oracle.bmc.waiter.Waiter<GetPropertyRequest, GetPropertyResponse> forProperty(
            GetPropertyRequest request,
            com.oracle.bmc.fleetappsmanagement.model.Property.LifecycleState targetState,
            com.oracle.bmc.waiter.TerminationStrategy terminationStrategy,
            com.oracle.bmc.waiter.DelayStrategy delayStrategy) {
        com.oracle.bmc.util.internal.Validate.notNull(
                targetState, "The targetState cannot be null");

        return forProperty(
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
    public com.oracle.bmc.waiter.Waiter<GetPropertyRequest, GetPropertyResponse> forProperty(
            GetPropertyRequest request,
            com.oracle.bmc.waiter.TerminationStrategy terminationStrategy,
            com.oracle.bmc.waiter.DelayStrategy delayStrategy,
            com.oracle.bmc.fleetappsmanagement.model.Property.LifecycleState... targetStates) {
        com.oracle.bmc.util.internal.Validate.notEmpty(
                targetStates, "At least one target state must be provided");
        com.oracle.bmc.util.internal.Validate.noNullElements(
                targetStates, "Null target states are not permitted");

        return forProperty(
                com.oracle.bmc.waiter.Waiters.newWaiter(terminationStrategy, delayStrategy),
                request,
                targetStates);
    }

    // Helper method to create a new Waiter for Property.
    private com.oracle.bmc.waiter.Waiter<GetPropertyRequest, GetPropertyResponse> forProperty(
            com.oracle.bmc.waiter.BmcGenericWaiter waiter,
            final GetPropertyRequest request,
            final com.oracle.bmc.fleetappsmanagement.model.Property.LifecycleState...
                    targetStates) {
        final java.util.Set<com.oracle.bmc.fleetappsmanagement.model.Property.LifecycleState>
                targetStatesSet = new java.util.HashSet<>(java.util.Arrays.asList(targetStates));

        return new com.oracle.bmc.waiter.internal.SimpleWaiterImpl<>(
                executorService,
                waiter.toCallable(
                        () -> request,
                        new java.util.function.Function<GetPropertyRequest, GetPropertyResponse>() {
                            @Override
                            public GetPropertyResponse apply(GetPropertyRequest request) {
                                return client.getProperty(request);
                            }
                        },
                        new java.util.function.Predicate<GetPropertyResponse>() {
                            @Override
                            public boolean test(GetPropertyResponse response) {
                                return targetStatesSet.contains(
                                        response.getProperty().getLifecycleState());
                            }
                        },
                        targetStatesSet.contains(
                                com.oracle.bmc.fleetappsmanagement.model.Property.LifecycleState
                                        .Deleted)),
                request);
    }
}
