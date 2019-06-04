/**
 * Copyright (c) 2016, 2019, Oracle and/or its affiliates. All rights reserved.
 */
package com.oracle.bmc.identity;

import com.oracle.bmc.identity.requests.*;
import com.oracle.bmc.identity.responses.*;

/**
 * Collection of helper methods to produce {@link Waiter}s for different
 * resources of Identity.
 * <p>
 * The default configuration used is defined by {@link Waiters#DEFAULT_POLLING_WAITER}.
 */
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20160918")
@lombok.RequiredArgsConstructor
public class IdentityWaiters {
    private final java.util.concurrent.ExecutorService executorService;
    private final Identity client;

    /**
     * Creates a new {@link Waiter} using default configuration.
     *
     * @param request the request to send
     * @param targetStates the desired states to wait for. If multiple states are provided then the waiter will return once the resource reaches any of the provided states
     * @return a new {@code Waiter} instance
     */
    public com.oracle.bmc.waiter.Waiter<GetCompartmentRequest, GetCompartmentResponse>
            forCompartment(
                    GetCompartmentRequest request,
                    com.oracle.bmc.identity.model.Compartment.LifecycleState... targetStates) {
        org.apache.commons.lang3.Validate.notEmpty(
                targetStates, "At least one targetState must be provided");
        org.apache.commons.lang3.Validate.noNullElements(
                targetStates, "Null targetState values are not permitted");

        return forCompartment(
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
    public com.oracle.bmc.waiter.Waiter<GetCompartmentRequest, GetCompartmentResponse>
            forCompartment(
                    GetCompartmentRequest request,
                    com.oracle.bmc.identity.model.Compartment.LifecycleState targetState,
                    com.oracle.bmc.waiter.TerminationStrategy terminationStrategy,
                    com.oracle.bmc.waiter.DelayStrategy delayStrategy) {
        org.apache.commons.lang3.Validate.notNull(targetState, "The targetState cannot be null");

        return forCompartment(
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
    public com.oracle.bmc.waiter.Waiter<GetCompartmentRequest, GetCompartmentResponse>
            forCompartment(
                    GetCompartmentRequest request,
                    com.oracle.bmc.waiter.TerminationStrategy terminationStrategy,
                    com.oracle.bmc.waiter.DelayStrategy delayStrategy,
                    com.oracle.bmc.identity.model.Compartment.LifecycleState... targetStates) {
        org.apache.commons.lang3.Validate.notEmpty(
                targetStates, "At least one target state must be provided");
        org.apache.commons.lang3.Validate.noNullElements(
                targetStates, "Null target states are not permitted");

        return forCompartment(
                com.oracle.bmc.waiter.Waiters.newWaiter(terminationStrategy, delayStrategy),
                request,
                targetStates);
    }

    // Helper method to create a new Waiter for Compartment.
    private com.oracle.bmc.waiter.Waiter<GetCompartmentRequest, GetCompartmentResponse>
            forCompartment(
                    com.oracle.bmc.waiter.BmcGenericWaiter waiter,
                    final GetCompartmentRequest request,
                    final com.oracle.bmc.identity.model.Compartment.LifecycleState...
                            targetStates) {
        final java.util.Set<com.oracle.bmc.identity.model.Compartment.LifecycleState>
                targetStatesSet = new java.util.HashSet<>(java.util.Arrays.asList(targetStates));

        return new com.oracle.bmc.waiter.internal.SimpleWaiterImpl<>(
                executorService,
                waiter.toCallable(
                        com.google.common.base.Suppliers.ofInstance(request),
                        new com.google.common.base.Function<
                                GetCompartmentRequest, GetCompartmentResponse>() {
                            @Override
                            public GetCompartmentResponse apply(GetCompartmentRequest request) {
                                return client.getCompartment(request);
                            }
                        },
                        new com.google.common.base.Predicate<GetCompartmentResponse>() {
                            @Override
                            public boolean apply(GetCompartmentResponse response) {
                                return targetStatesSet.contains(
                                        response.getCompartment().getLifecycleState());
                            }
                        },
                        targetStatesSet.contains(
                                com.oracle.bmc.identity.model.Compartment.LifecycleState.Deleted)),
                request);
    }

    /**
     * Creates a new {@link Waiter} using default configuration.
     *
     * @param request the request to send
     * @param targetStates the desired states to wait for. If multiple states are provided then the waiter will return once the resource reaches any of the provided states
     * @return a new {@code Waiter} instance
     */
    public com.oracle.bmc.waiter.Waiter<GetDynamicGroupRequest, GetDynamicGroupResponse>
            forDynamicGroup(
                    GetDynamicGroupRequest request,
                    com.oracle.bmc.identity.model.DynamicGroup.LifecycleState... targetStates) {
        org.apache.commons.lang3.Validate.notEmpty(
                targetStates, "At least one targetState must be provided");
        org.apache.commons.lang3.Validate.noNullElements(
                targetStates, "Null targetState values are not permitted");

        return forDynamicGroup(
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
    public com.oracle.bmc.waiter.Waiter<GetDynamicGroupRequest, GetDynamicGroupResponse>
            forDynamicGroup(
                    GetDynamicGroupRequest request,
                    com.oracle.bmc.identity.model.DynamicGroup.LifecycleState targetState,
                    com.oracle.bmc.waiter.TerminationStrategy terminationStrategy,
                    com.oracle.bmc.waiter.DelayStrategy delayStrategy) {
        org.apache.commons.lang3.Validate.notNull(targetState, "The targetState cannot be null");

        return forDynamicGroup(
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
    public com.oracle.bmc.waiter.Waiter<GetDynamicGroupRequest, GetDynamicGroupResponse>
            forDynamicGroup(
                    GetDynamicGroupRequest request,
                    com.oracle.bmc.waiter.TerminationStrategy terminationStrategy,
                    com.oracle.bmc.waiter.DelayStrategy delayStrategy,
                    com.oracle.bmc.identity.model.DynamicGroup.LifecycleState... targetStates) {
        org.apache.commons.lang3.Validate.notEmpty(
                targetStates, "At least one target state must be provided");
        org.apache.commons.lang3.Validate.noNullElements(
                targetStates, "Null target states are not permitted");

        return forDynamicGroup(
                com.oracle.bmc.waiter.Waiters.newWaiter(terminationStrategy, delayStrategy),
                request,
                targetStates);
    }

    // Helper method to create a new Waiter for DynamicGroup.
    private com.oracle.bmc.waiter.Waiter<GetDynamicGroupRequest, GetDynamicGroupResponse>
            forDynamicGroup(
                    com.oracle.bmc.waiter.BmcGenericWaiter waiter,
                    final GetDynamicGroupRequest request,
                    final com.oracle.bmc.identity.model.DynamicGroup.LifecycleState...
                            targetStates) {
        final java.util.Set<com.oracle.bmc.identity.model.DynamicGroup.LifecycleState>
                targetStatesSet = new java.util.HashSet<>(java.util.Arrays.asList(targetStates));

        return new com.oracle.bmc.waiter.internal.SimpleWaiterImpl<>(
                executorService,
                waiter.toCallable(
                        com.google.common.base.Suppliers.ofInstance(request),
                        new com.google.common.base.Function<
                                GetDynamicGroupRequest, GetDynamicGroupResponse>() {
                            @Override
                            public GetDynamicGroupResponse apply(GetDynamicGroupRequest request) {
                                return client.getDynamicGroup(request);
                            }
                        },
                        new com.google.common.base.Predicate<GetDynamicGroupResponse>() {
                            @Override
                            public boolean apply(GetDynamicGroupResponse response) {
                                return targetStatesSet.contains(
                                        response.getDynamicGroup().getLifecycleState());
                            }
                        },
                        targetStatesSet.contains(
                                com.oracle.bmc.identity.model.DynamicGroup.LifecycleState.Deleted)),
                request);
    }

    /**
     * Creates a new {@link Waiter} using default configuration.
     *
     * @param request the request to send
     * @param targetStates the desired states to wait for. If multiple states are provided then the waiter will return once the resource reaches any of the provided states
     * @return a new {@code Waiter} instance
     */
    public com.oracle.bmc.waiter.Waiter<GetGroupRequest, GetGroupResponse> forGroup(
            GetGroupRequest request,
            com.oracle.bmc.identity.model.Group.LifecycleState... targetStates) {
        org.apache.commons.lang3.Validate.notEmpty(
                targetStates, "At least one targetState must be provided");
        org.apache.commons.lang3.Validate.noNullElements(
                targetStates, "Null targetState values are not permitted");

        return forGroup(
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
    public com.oracle.bmc.waiter.Waiter<GetGroupRequest, GetGroupResponse> forGroup(
            GetGroupRequest request,
            com.oracle.bmc.identity.model.Group.LifecycleState targetState,
            com.oracle.bmc.waiter.TerminationStrategy terminationStrategy,
            com.oracle.bmc.waiter.DelayStrategy delayStrategy) {
        org.apache.commons.lang3.Validate.notNull(targetState, "The targetState cannot be null");

        return forGroup(
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
    public com.oracle.bmc.waiter.Waiter<GetGroupRequest, GetGroupResponse> forGroup(
            GetGroupRequest request,
            com.oracle.bmc.waiter.TerminationStrategy terminationStrategy,
            com.oracle.bmc.waiter.DelayStrategy delayStrategy,
            com.oracle.bmc.identity.model.Group.LifecycleState... targetStates) {
        org.apache.commons.lang3.Validate.notEmpty(
                targetStates, "At least one target state must be provided");
        org.apache.commons.lang3.Validate.noNullElements(
                targetStates, "Null target states are not permitted");

        return forGroup(
                com.oracle.bmc.waiter.Waiters.newWaiter(terminationStrategy, delayStrategy),
                request,
                targetStates);
    }

    // Helper method to create a new Waiter for Group.
    private com.oracle.bmc.waiter.Waiter<GetGroupRequest, GetGroupResponse> forGroup(
            com.oracle.bmc.waiter.BmcGenericWaiter waiter,
            final GetGroupRequest request,
            final com.oracle.bmc.identity.model.Group.LifecycleState... targetStates) {
        final java.util.Set<com.oracle.bmc.identity.model.Group.LifecycleState> targetStatesSet =
                new java.util.HashSet<>(java.util.Arrays.asList(targetStates));

        return new com.oracle.bmc.waiter.internal.SimpleWaiterImpl<>(
                executorService,
                waiter.toCallable(
                        com.google.common.base.Suppliers.ofInstance(request),
                        new com.google.common.base.Function<GetGroupRequest, GetGroupResponse>() {
                            @Override
                            public GetGroupResponse apply(GetGroupRequest request) {
                                return client.getGroup(request);
                            }
                        },
                        new com.google.common.base.Predicate<GetGroupResponse>() {
                            @Override
                            public boolean apply(GetGroupResponse response) {
                                return targetStatesSet.contains(
                                        response.getGroup().getLifecycleState());
                            }
                        },
                        targetStatesSet.contains(
                                com.oracle.bmc.identity.model.Group.LifecycleState.Deleted)),
                request);
    }

    /**
     * Creates a new {@link Waiter} using default configuration.
     *
     * @param request the request to send
     * @param targetStates the desired states to wait for. If multiple states are provided then the waiter will return once the resource reaches any of the provided states
     * @return a new {@code Waiter} instance
     */
    public com.oracle.bmc.waiter.Waiter<GetIdentityProviderRequest, GetIdentityProviderResponse>
            forIdentityProvider(
                    GetIdentityProviderRequest request,
                    com.oracle.bmc.identity.model.IdentityProvider.LifecycleState... targetStates) {
        org.apache.commons.lang3.Validate.notEmpty(
                targetStates, "At least one targetState must be provided");
        org.apache.commons.lang3.Validate.noNullElements(
                targetStates, "Null targetState values are not permitted");

        return forIdentityProvider(
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
    public com.oracle.bmc.waiter.Waiter<GetIdentityProviderRequest, GetIdentityProviderResponse>
            forIdentityProvider(
                    GetIdentityProviderRequest request,
                    com.oracle.bmc.identity.model.IdentityProvider.LifecycleState targetState,
                    com.oracle.bmc.waiter.TerminationStrategy terminationStrategy,
                    com.oracle.bmc.waiter.DelayStrategy delayStrategy) {
        org.apache.commons.lang3.Validate.notNull(targetState, "The targetState cannot be null");

        return forIdentityProvider(
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
    public com.oracle.bmc.waiter.Waiter<GetIdentityProviderRequest, GetIdentityProviderResponse>
            forIdentityProvider(
                    GetIdentityProviderRequest request,
                    com.oracle.bmc.waiter.TerminationStrategy terminationStrategy,
                    com.oracle.bmc.waiter.DelayStrategy delayStrategy,
                    com.oracle.bmc.identity.model.IdentityProvider.LifecycleState... targetStates) {
        org.apache.commons.lang3.Validate.notEmpty(
                targetStates, "At least one target state must be provided");
        org.apache.commons.lang3.Validate.noNullElements(
                targetStates, "Null target states are not permitted");

        return forIdentityProvider(
                com.oracle.bmc.waiter.Waiters.newWaiter(terminationStrategy, delayStrategy),
                request,
                targetStates);
    }

    // Helper method to create a new Waiter for IdentityProvider.
    private com.oracle.bmc.waiter.Waiter<GetIdentityProviderRequest, GetIdentityProviderResponse>
            forIdentityProvider(
                    com.oracle.bmc.waiter.BmcGenericWaiter waiter,
                    final GetIdentityProviderRequest request,
                    final com.oracle.bmc.identity.model.IdentityProvider.LifecycleState...
                            targetStates) {
        final java.util.Set<com.oracle.bmc.identity.model.IdentityProvider.LifecycleState>
                targetStatesSet = new java.util.HashSet<>(java.util.Arrays.asList(targetStates));

        return new com.oracle.bmc.waiter.internal.SimpleWaiterImpl<>(
                executorService,
                waiter.toCallable(
                        com.google.common.base.Suppliers.ofInstance(request),
                        new com.google.common.base.Function<
                                GetIdentityProviderRequest, GetIdentityProviderResponse>() {
                            @Override
                            public GetIdentityProviderResponse apply(
                                    GetIdentityProviderRequest request) {
                                return client.getIdentityProvider(request);
                            }
                        },
                        new com.google.common.base.Predicate<GetIdentityProviderResponse>() {
                            @Override
                            public boolean apply(GetIdentityProviderResponse response) {
                                return targetStatesSet.contains(
                                        response.getIdentityProvider().getLifecycleState());
                            }
                        },
                        targetStatesSet.contains(
                                com.oracle.bmc.identity.model.IdentityProvider.LifecycleState
                                        .Deleted)),
                request);
    }

    /**
     * Creates a new {@link Waiter} using default configuration.
     *
     * @param request the request to send
     * @param targetStates the desired states to wait for. If multiple states are provided then the waiter will return once the resource reaches any of the provided states
     * @return a new {@code Waiter} instance
     */
    public com.oracle.bmc.waiter.Waiter<GetIdpGroupMappingRequest, GetIdpGroupMappingResponse>
            forIdpGroupMapping(
                    GetIdpGroupMappingRequest request,
                    com.oracle.bmc.identity.model.IdpGroupMapping.LifecycleState... targetStates) {
        org.apache.commons.lang3.Validate.notEmpty(
                targetStates, "At least one targetState must be provided");
        org.apache.commons.lang3.Validate.noNullElements(
                targetStates, "Null targetState values are not permitted");

        return forIdpGroupMapping(
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
    public com.oracle.bmc.waiter.Waiter<GetIdpGroupMappingRequest, GetIdpGroupMappingResponse>
            forIdpGroupMapping(
                    GetIdpGroupMappingRequest request,
                    com.oracle.bmc.identity.model.IdpGroupMapping.LifecycleState targetState,
                    com.oracle.bmc.waiter.TerminationStrategy terminationStrategy,
                    com.oracle.bmc.waiter.DelayStrategy delayStrategy) {
        org.apache.commons.lang3.Validate.notNull(targetState, "The targetState cannot be null");

        return forIdpGroupMapping(
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
    public com.oracle.bmc.waiter.Waiter<GetIdpGroupMappingRequest, GetIdpGroupMappingResponse>
            forIdpGroupMapping(
                    GetIdpGroupMappingRequest request,
                    com.oracle.bmc.waiter.TerminationStrategy terminationStrategy,
                    com.oracle.bmc.waiter.DelayStrategy delayStrategy,
                    com.oracle.bmc.identity.model.IdpGroupMapping.LifecycleState... targetStates) {
        org.apache.commons.lang3.Validate.notEmpty(
                targetStates, "At least one target state must be provided");
        org.apache.commons.lang3.Validate.noNullElements(
                targetStates, "Null target states are not permitted");

        return forIdpGroupMapping(
                com.oracle.bmc.waiter.Waiters.newWaiter(terminationStrategy, delayStrategy),
                request,
                targetStates);
    }

    // Helper method to create a new Waiter for IdpGroupMapping.
    private com.oracle.bmc.waiter.Waiter<GetIdpGroupMappingRequest, GetIdpGroupMappingResponse>
            forIdpGroupMapping(
                    com.oracle.bmc.waiter.BmcGenericWaiter waiter,
                    final GetIdpGroupMappingRequest request,
                    final com.oracle.bmc.identity.model.IdpGroupMapping.LifecycleState...
                            targetStates) {
        final java.util.Set<com.oracle.bmc.identity.model.IdpGroupMapping.LifecycleState>
                targetStatesSet = new java.util.HashSet<>(java.util.Arrays.asList(targetStates));

        return new com.oracle.bmc.waiter.internal.SimpleWaiterImpl<>(
                executorService,
                waiter.toCallable(
                        com.google.common.base.Suppliers.ofInstance(request),
                        new com.google.common.base.Function<
                                GetIdpGroupMappingRequest, GetIdpGroupMappingResponse>() {
                            @Override
                            public GetIdpGroupMappingResponse apply(
                                    GetIdpGroupMappingRequest request) {
                                return client.getIdpGroupMapping(request);
                            }
                        },
                        new com.google.common.base.Predicate<GetIdpGroupMappingResponse>() {
                            @Override
                            public boolean apply(GetIdpGroupMappingResponse response) {
                                return targetStatesSet.contains(
                                        response.getIdpGroupMapping().getLifecycleState());
                            }
                        },
                        targetStatesSet.contains(
                                com.oracle.bmc.identity.model.IdpGroupMapping.LifecycleState
                                        .Deleted)),
                request);
    }

    /**
     * Creates a new {@link Waiter} using default configuration.
     *
     * @param request the request to send
     * @param targetStates the desired states to wait for. If multiple states are provided then the waiter will return once the resource reaches any of the provided states
     * @return a new {@code Waiter} instance
     */
    public com.oracle.bmc.waiter.Waiter<GetPolicyRequest, GetPolicyResponse> forPolicy(
            GetPolicyRequest request,
            com.oracle.bmc.identity.model.Policy.LifecycleState... targetStates) {
        org.apache.commons.lang3.Validate.notEmpty(
                targetStates, "At least one targetState must be provided");
        org.apache.commons.lang3.Validate.noNullElements(
                targetStates, "Null targetState values are not permitted");

        return forPolicy(
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
    public com.oracle.bmc.waiter.Waiter<GetPolicyRequest, GetPolicyResponse> forPolicy(
            GetPolicyRequest request,
            com.oracle.bmc.identity.model.Policy.LifecycleState targetState,
            com.oracle.bmc.waiter.TerminationStrategy terminationStrategy,
            com.oracle.bmc.waiter.DelayStrategy delayStrategy) {
        org.apache.commons.lang3.Validate.notNull(targetState, "The targetState cannot be null");

        return forPolicy(
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
    public com.oracle.bmc.waiter.Waiter<GetPolicyRequest, GetPolicyResponse> forPolicy(
            GetPolicyRequest request,
            com.oracle.bmc.waiter.TerminationStrategy terminationStrategy,
            com.oracle.bmc.waiter.DelayStrategy delayStrategy,
            com.oracle.bmc.identity.model.Policy.LifecycleState... targetStates) {
        org.apache.commons.lang3.Validate.notEmpty(
                targetStates, "At least one target state must be provided");
        org.apache.commons.lang3.Validate.noNullElements(
                targetStates, "Null target states are not permitted");

        return forPolicy(
                com.oracle.bmc.waiter.Waiters.newWaiter(terminationStrategy, delayStrategy),
                request,
                targetStates);
    }

    // Helper method to create a new Waiter for Policy.
    private com.oracle.bmc.waiter.Waiter<GetPolicyRequest, GetPolicyResponse> forPolicy(
            com.oracle.bmc.waiter.BmcGenericWaiter waiter,
            final GetPolicyRequest request,
            final com.oracle.bmc.identity.model.Policy.LifecycleState... targetStates) {
        final java.util.Set<com.oracle.bmc.identity.model.Policy.LifecycleState> targetStatesSet =
                new java.util.HashSet<>(java.util.Arrays.asList(targetStates));

        return new com.oracle.bmc.waiter.internal.SimpleWaiterImpl<>(
                executorService,
                waiter.toCallable(
                        com.google.common.base.Suppliers.ofInstance(request),
                        new com.google.common.base.Function<GetPolicyRequest, GetPolicyResponse>() {
                            @Override
                            public GetPolicyResponse apply(GetPolicyRequest request) {
                                return client.getPolicy(request);
                            }
                        },
                        new com.google.common.base.Predicate<GetPolicyResponse>() {
                            @Override
                            public boolean apply(GetPolicyResponse response) {
                                return targetStatesSet.contains(
                                        response.getPolicy().getLifecycleState());
                            }
                        },
                        targetStatesSet.contains(
                                com.oracle.bmc.identity.model.Policy.LifecycleState.Deleted)),
                request);
    }

    /**
     * Creates a new {@link Waiter} using default configuration.
     *
     * @param request the request to send
     * @param targetStates the desired states to wait for. If multiple states are provided then the waiter will return once the resource reaches any of the provided states
     * @return a new {@code Waiter} instance
     */
    public com.oracle.bmc.waiter.Waiter<GetTagRequest, GetTagResponse> forTag(
            GetTagRequest request,
            com.oracle.bmc.identity.model.Tag.LifecycleState... targetStates) {
        org.apache.commons.lang3.Validate.notEmpty(
                targetStates, "At least one targetState must be provided");
        org.apache.commons.lang3.Validate.noNullElements(
                targetStates, "Null targetState values are not permitted");

        return forTag(com.oracle.bmc.waiter.Waiters.DEFAULT_POLLING_WAITER, request, targetStates);
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
    public com.oracle.bmc.waiter.Waiter<GetTagRequest, GetTagResponse> forTag(
            GetTagRequest request,
            com.oracle.bmc.identity.model.Tag.LifecycleState targetState,
            com.oracle.bmc.waiter.TerminationStrategy terminationStrategy,
            com.oracle.bmc.waiter.DelayStrategy delayStrategy) {
        org.apache.commons.lang3.Validate.notNull(targetState, "The targetState cannot be null");

        return forTag(
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
    public com.oracle.bmc.waiter.Waiter<GetTagRequest, GetTagResponse> forTag(
            GetTagRequest request,
            com.oracle.bmc.waiter.TerminationStrategy terminationStrategy,
            com.oracle.bmc.waiter.DelayStrategy delayStrategy,
            com.oracle.bmc.identity.model.Tag.LifecycleState... targetStates) {
        org.apache.commons.lang3.Validate.notEmpty(
                targetStates, "At least one target state must be provided");
        org.apache.commons.lang3.Validate.noNullElements(
                targetStates, "Null target states are not permitted");

        return forTag(
                com.oracle.bmc.waiter.Waiters.newWaiter(terminationStrategy, delayStrategy),
                request,
                targetStates);
    }

    // Helper method to create a new Waiter for Tag.
    private com.oracle.bmc.waiter.Waiter<GetTagRequest, GetTagResponse> forTag(
            com.oracle.bmc.waiter.BmcGenericWaiter waiter,
            final GetTagRequest request,
            final com.oracle.bmc.identity.model.Tag.LifecycleState... targetStates) {
        final java.util.Set<com.oracle.bmc.identity.model.Tag.LifecycleState> targetStatesSet =
                new java.util.HashSet<>(java.util.Arrays.asList(targetStates));

        return new com.oracle.bmc.waiter.internal.SimpleWaiterImpl<>(
                executorService,
                waiter.toCallable(
                        com.google.common.base.Suppliers.ofInstance(request),
                        new com.google.common.base.Function<GetTagRequest, GetTagResponse>() {
                            @Override
                            public GetTagResponse apply(GetTagRequest request) {
                                return client.getTag(request);
                            }
                        },
                        new com.google.common.base.Predicate<GetTagResponse>() {
                            @Override
                            public boolean apply(GetTagResponse response) {
                                return targetStatesSet.contains(
                                        response.getTag().getLifecycleState());
                            }
                        },
                        targetStatesSet.contains(
                                com.oracle.bmc.identity.model.Tag.LifecycleState.Deleted)),
                request);
    }

    /**
     * Creates a new {@link Waiter} using default configuration.
     *
     * @param request the request to send
     * @param targetStates the desired states to wait for. If multiple states are provided then the waiter will return once the resource reaches any of the provided states
     * @return a new {@code Waiter} instance
     */
    public com.oracle.bmc.waiter.Waiter<GetTagDefaultRequest, GetTagDefaultResponse> forTagDefault(
            GetTagDefaultRequest request,
            com.oracle.bmc.identity.model.TagDefault.LifecycleState... targetStates) {
        org.apache.commons.lang3.Validate.notEmpty(
                targetStates, "At least one targetState must be provided");
        org.apache.commons.lang3.Validate.noNullElements(
                targetStates, "Null targetState values are not permitted");

        return forTagDefault(
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
    public com.oracle.bmc.waiter.Waiter<GetTagDefaultRequest, GetTagDefaultResponse> forTagDefault(
            GetTagDefaultRequest request,
            com.oracle.bmc.identity.model.TagDefault.LifecycleState targetState,
            com.oracle.bmc.waiter.TerminationStrategy terminationStrategy,
            com.oracle.bmc.waiter.DelayStrategy delayStrategy) {
        org.apache.commons.lang3.Validate.notNull(targetState, "The targetState cannot be null");

        return forTagDefault(
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
    public com.oracle.bmc.waiter.Waiter<GetTagDefaultRequest, GetTagDefaultResponse> forTagDefault(
            GetTagDefaultRequest request,
            com.oracle.bmc.waiter.TerminationStrategy terminationStrategy,
            com.oracle.bmc.waiter.DelayStrategy delayStrategy,
            com.oracle.bmc.identity.model.TagDefault.LifecycleState... targetStates) {
        org.apache.commons.lang3.Validate.notEmpty(
                targetStates, "At least one target state must be provided");
        org.apache.commons.lang3.Validate.noNullElements(
                targetStates, "Null target states are not permitted");

        return forTagDefault(
                com.oracle.bmc.waiter.Waiters.newWaiter(terminationStrategy, delayStrategy),
                request,
                targetStates);
    }

    // Helper method to create a new Waiter for TagDefault.
    private com.oracle.bmc.waiter.Waiter<GetTagDefaultRequest, GetTagDefaultResponse> forTagDefault(
            com.oracle.bmc.waiter.BmcGenericWaiter waiter,
            final GetTagDefaultRequest request,
            final com.oracle.bmc.identity.model.TagDefault.LifecycleState... targetStates) {
        final java.util.Set<com.oracle.bmc.identity.model.TagDefault.LifecycleState>
                targetStatesSet = new java.util.HashSet<>(java.util.Arrays.asList(targetStates));

        return new com.oracle.bmc.waiter.internal.SimpleWaiterImpl<>(
                executorService,
                waiter.toCallable(
                        com.google.common.base.Suppliers.ofInstance(request),
                        new com.google.common.base.Function<
                                GetTagDefaultRequest, GetTagDefaultResponse>() {
                            @Override
                            public GetTagDefaultResponse apply(GetTagDefaultRequest request) {
                                return client.getTagDefault(request);
                            }
                        },
                        new com.google.common.base.Predicate<GetTagDefaultResponse>() {
                            @Override
                            public boolean apply(GetTagDefaultResponse response) {
                                return targetStatesSet.contains(
                                        response.getTagDefault().getLifecycleState());
                            }
                        },
                        false),
                request);
    }

    /**
     * Creates a new {@link Waiter} using default configuration.
     *
     * @param request the request to send
     * @param targetStates the desired states to wait for. If multiple states are provided then the waiter will return once the resource reaches any of the provided states
     * @return a new {@code Waiter} instance
     */
    public com.oracle.bmc.waiter.Waiter<GetTagNamespaceRequest, GetTagNamespaceResponse>
            forTagNamespace(
                    GetTagNamespaceRequest request,
                    com.oracle.bmc.identity.model.TagNamespace.LifecycleState... targetStates) {
        org.apache.commons.lang3.Validate.notEmpty(
                targetStates, "At least one targetState must be provided");
        org.apache.commons.lang3.Validate.noNullElements(
                targetStates, "Null targetState values are not permitted");

        return forTagNamespace(
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
    public com.oracle.bmc.waiter.Waiter<GetTagNamespaceRequest, GetTagNamespaceResponse>
            forTagNamespace(
                    GetTagNamespaceRequest request,
                    com.oracle.bmc.identity.model.TagNamespace.LifecycleState targetState,
                    com.oracle.bmc.waiter.TerminationStrategy terminationStrategy,
                    com.oracle.bmc.waiter.DelayStrategy delayStrategy) {
        org.apache.commons.lang3.Validate.notNull(targetState, "The targetState cannot be null");

        return forTagNamespace(
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
    public com.oracle.bmc.waiter.Waiter<GetTagNamespaceRequest, GetTagNamespaceResponse>
            forTagNamespace(
                    GetTagNamespaceRequest request,
                    com.oracle.bmc.waiter.TerminationStrategy terminationStrategy,
                    com.oracle.bmc.waiter.DelayStrategy delayStrategy,
                    com.oracle.bmc.identity.model.TagNamespace.LifecycleState... targetStates) {
        org.apache.commons.lang3.Validate.notEmpty(
                targetStates, "At least one target state must be provided");
        org.apache.commons.lang3.Validate.noNullElements(
                targetStates, "Null target states are not permitted");

        return forTagNamespace(
                com.oracle.bmc.waiter.Waiters.newWaiter(terminationStrategy, delayStrategy),
                request,
                targetStates);
    }

    // Helper method to create a new Waiter for TagNamespace.
    private com.oracle.bmc.waiter.Waiter<GetTagNamespaceRequest, GetTagNamespaceResponse>
            forTagNamespace(
                    com.oracle.bmc.waiter.BmcGenericWaiter waiter,
                    final GetTagNamespaceRequest request,
                    final com.oracle.bmc.identity.model.TagNamespace.LifecycleState...
                            targetStates) {
        final java.util.Set<com.oracle.bmc.identity.model.TagNamespace.LifecycleState>
                targetStatesSet = new java.util.HashSet<>(java.util.Arrays.asList(targetStates));

        return new com.oracle.bmc.waiter.internal.SimpleWaiterImpl<>(
                executorService,
                waiter.toCallable(
                        com.google.common.base.Suppliers.ofInstance(request),
                        new com.google.common.base.Function<
                                GetTagNamespaceRequest, GetTagNamespaceResponse>() {
                            @Override
                            public GetTagNamespaceResponse apply(GetTagNamespaceRequest request) {
                                return client.getTagNamespace(request);
                            }
                        },
                        new com.google.common.base.Predicate<GetTagNamespaceResponse>() {
                            @Override
                            public boolean apply(GetTagNamespaceResponse response) {
                                return targetStatesSet.contains(
                                        response.getTagNamespace().getLifecycleState());
                            }
                        },
                        targetStatesSet.contains(
                                com.oracle.bmc.identity.model.TagNamespace.LifecycleState.Deleted)),
                request);
    }

    /**
     * Creates a new {@link Waiter} using default configuration.
     *
     * @param request the request to send
     * @param targetStates the desired states to wait for. If multiple states are provided then the waiter will return once the resource reaches any of the provided states
     * @return a new {@code Waiter} instance
     */
    public com.oracle.bmc.waiter.Waiter<GetUserRequest, GetUserResponse> forUser(
            GetUserRequest request,
            com.oracle.bmc.identity.model.User.LifecycleState... targetStates) {
        org.apache.commons.lang3.Validate.notEmpty(
                targetStates, "At least one targetState must be provided");
        org.apache.commons.lang3.Validate.noNullElements(
                targetStates, "Null targetState values are not permitted");

        return forUser(com.oracle.bmc.waiter.Waiters.DEFAULT_POLLING_WAITER, request, targetStates);
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
    public com.oracle.bmc.waiter.Waiter<GetUserRequest, GetUserResponse> forUser(
            GetUserRequest request,
            com.oracle.bmc.identity.model.User.LifecycleState targetState,
            com.oracle.bmc.waiter.TerminationStrategy terminationStrategy,
            com.oracle.bmc.waiter.DelayStrategy delayStrategy) {
        org.apache.commons.lang3.Validate.notNull(targetState, "The targetState cannot be null");

        return forUser(
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
    public com.oracle.bmc.waiter.Waiter<GetUserRequest, GetUserResponse> forUser(
            GetUserRequest request,
            com.oracle.bmc.waiter.TerminationStrategy terminationStrategy,
            com.oracle.bmc.waiter.DelayStrategy delayStrategy,
            com.oracle.bmc.identity.model.User.LifecycleState... targetStates) {
        org.apache.commons.lang3.Validate.notEmpty(
                targetStates, "At least one target state must be provided");
        org.apache.commons.lang3.Validate.noNullElements(
                targetStates, "Null target states are not permitted");

        return forUser(
                com.oracle.bmc.waiter.Waiters.newWaiter(terminationStrategy, delayStrategy),
                request,
                targetStates);
    }

    // Helper method to create a new Waiter for User.
    private com.oracle.bmc.waiter.Waiter<GetUserRequest, GetUserResponse> forUser(
            com.oracle.bmc.waiter.BmcGenericWaiter waiter,
            final GetUserRequest request,
            final com.oracle.bmc.identity.model.User.LifecycleState... targetStates) {
        final java.util.Set<com.oracle.bmc.identity.model.User.LifecycleState> targetStatesSet =
                new java.util.HashSet<>(java.util.Arrays.asList(targetStates));

        return new com.oracle.bmc.waiter.internal.SimpleWaiterImpl<>(
                executorService,
                waiter.toCallable(
                        com.google.common.base.Suppliers.ofInstance(request),
                        new com.google.common.base.Function<GetUserRequest, GetUserResponse>() {
                            @Override
                            public GetUserResponse apply(GetUserRequest request) {
                                return client.getUser(request);
                            }
                        },
                        new com.google.common.base.Predicate<GetUserResponse>() {
                            @Override
                            public boolean apply(GetUserResponse response) {
                                return targetStatesSet.contains(
                                        response.getUser().getLifecycleState());
                            }
                        },
                        targetStatesSet.contains(
                                com.oracle.bmc.identity.model.User.LifecycleState.Deleted)),
                request);
    }

    /**
     * Creates a new {@link Waiter} using default configuration.
     *
     * @param request the request to send
     * @param targetStates the desired states to wait for. If multiple states are provided then the waiter will return once the resource reaches any of the provided states
     * @return a new {@code Waiter} instance
     */
    public com.oracle.bmc.waiter.Waiter<
                    GetUserGroupMembershipRequest, GetUserGroupMembershipResponse>
            forUserGroupMembership(
                    GetUserGroupMembershipRequest request,
                    com.oracle.bmc.identity.model.UserGroupMembership.LifecycleState...
                            targetStates) {
        org.apache.commons.lang3.Validate.notEmpty(
                targetStates, "At least one targetState must be provided");
        org.apache.commons.lang3.Validate.noNullElements(
                targetStates, "Null targetState values are not permitted");

        return forUserGroupMembership(
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
    public com.oracle.bmc.waiter.Waiter<
                    GetUserGroupMembershipRequest, GetUserGroupMembershipResponse>
            forUserGroupMembership(
                    GetUserGroupMembershipRequest request,
                    com.oracle.bmc.identity.model.UserGroupMembership.LifecycleState targetState,
                    com.oracle.bmc.waiter.TerminationStrategy terminationStrategy,
                    com.oracle.bmc.waiter.DelayStrategy delayStrategy) {
        org.apache.commons.lang3.Validate.notNull(targetState, "The targetState cannot be null");

        return forUserGroupMembership(
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
    public com.oracle.bmc.waiter.Waiter<
                    GetUserGroupMembershipRequest, GetUserGroupMembershipResponse>
            forUserGroupMembership(
                    GetUserGroupMembershipRequest request,
                    com.oracle.bmc.waiter.TerminationStrategy terminationStrategy,
                    com.oracle.bmc.waiter.DelayStrategy delayStrategy,
                    com.oracle.bmc.identity.model.UserGroupMembership.LifecycleState...
                            targetStates) {
        org.apache.commons.lang3.Validate.notEmpty(
                targetStates, "At least one target state must be provided");
        org.apache.commons.lang3.Validate.noNullElements(
                targetStates, "Null target states are not permitted");

        return forUserGroupMembership(
                com.oracle.bmc.waiter.Waiters.newWaiter(terminationStrategy, delayStrategy),
                request,
                targetStates);
    }

    // Helper method to create a new Waiter for UserGroupMembership.
    private com.oracle.bmc.waiter.Waiter<
                    GetUserGroupMembershipRequest, GetUserGroupMembershipResponse>
            forUserGroupMembership(
                    com.oracle.bmc.waiter.BmcGenericWaiter waiter,
                    final GetUserGroupMembershipRequest request,
                    final com.oracle.bmc.identity.model.UserGroupMembership.LifecycleState...
                            targetStates) {
        final java.util.Set<com.oracle.bmc.identity.model.UserGroupMembership.LifecycleState>
                targetStatesSet = new java.util.HashSet<>(java.util.Arrays.asList(targetStates));

        return new com.oracle.bmc.waiter.internal.SimpleWaiterImpl<>(
                executorService,
                waiter.toCallable(
                        com.google.common.base.Suppliers.ofInstance(request),
                        new com.google.common.base.Function<
                                GetUserGroupMembershipRequest, GetUserGroupMembershipResponse>() {
                            @Override
                            public GetUserGroupMembershipResponse apply(
                                    GetUserGroupMembershipRequest request) {
                                return client.getUserGroupMembership(request);
                            }
                        },
                        new com.google.common.base.Predicate<GetUserGroupMembershipResponse>() {
                            @Override
                            public boolean apply(GetUserGroupMembershipResponse response) {
                                return targetStatesSet.contains(
                                        response.getUserGroupMembership().getLifecycleState());
                            }
                        },
                        targetStatesSet.contains(
                                com.oracle.bmc.identity.model.UserGroupMembership.LifecycleState
                                        .Deleted)),
                request);
    }

    /**
     * Creates a new {@link Waiter} using default configuration.
     *
     * @param request the request to send
     * @return a new Waiter instance
     */
    public com.oracle.bmc.waiter.Waiter<GetWorkRequestRequest, GetWorkRequestResponse>
            forWorkRequest(GetWorkRequestRequest request) {
        return forWorkRequest(com.oracle.bmc.waiter.Waiters.DEFAULT_POLLING_WAITER, request);
    }

    /**
     * Creates a new {@link Waiter} using the provided configuration.
     *
     * @param request the request to send
     * @param terminationStrategy the {@link TerminationStrategy} to use
     * @param delayStrategy the {@link DelayStrategy} to use
     * @return a new {@code Waiter} instance
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
                        com.google.common.base.Suppliers.ofInstance(request),
                        new com.google.common.base.Function<
                                GetWorkRequestRequest, GetWorkRequestResponse>() {
                            @Override
                            public GetWorkRequestResponse apply(GetWorkRequestRequest request) {
                                return client.getWorkRequest(request);
                            }
                        },
                        new com.google.common.base.Predicate<GetWorkRequestResponse>() {
                            @Override
                            public boolean apply(GetWorkRequestResponse response) {
                                // work requests are complete once the time finished is available
                                return response.getWorkRequest().getTimeFinished() != null;
                            }
                        },
                        false),
                request);
    }
}
