/**
 * Copyright (c) 2016, 2018, Oracle and/or its affiliates. All rights reserved.
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
     * @param request The request to send.
     * @param targetState The desired state to wait for.
     * @return A new Waiter instance.
     */
    public com.oracle.bmc.waiter.Waiter<GetCompartmentRequest, GetCompartmentResponse>
            forCompartment(
                    GetCompartmentRequest request,
                    com.oracle.bmc.identity.model.Compartment.LifecycleState targetState) {
        return forCompartment(
                com.oracle.bmc.waiter.Waiters.DEFAULT_POLLING_WAITER, request, targetState);
    }

    /**
     * Creates a new {@link Waiter} using the provided configuration.
     *
     * @param request The request to send.
     * @param targetState The desired state to wait for.
     * @param terminationStrategy The {@link TerminationStrategy} to use.
     * @param delayStrategy The {@link DelayStrategy} to use.
     * @return A new Waiter instance.
     */
    public com.oracle.bmc.waiter.Waiter<GetCompartmentRequest, GetCompartmentResponse>
            forCompartment(
                    GetCompartmentRequest request,
                    com.oracle.bmc.identity.model.Compartment.LifecycleState targetState,
                    com.oracle.bmc.waiter.TerminationStrategy terminationStrategy,
                    com.oracle.bmc.waiter.DelayStrategy delayStrategy) {
        return forCompartment(
                com.oracle.bmc.waiter.Waiters.newWaiter(terminationStrategy, delayStrategy),
                request,
                targetState);
    }

    // Helper method to create a new Waiter for Compartment.
    private com.oracle.bmc.waiter.Waiter<GetCompartmentRequest, GetCompartmentResponse>
            forCompartment(
                    com.oracle.bmc.waiter.BmcGenericWaiter waiter,
                    final GetCompartmentRequest request,
                    final com.oracle.bmc.identity.model.Compartment.LifecycleState targetState) {
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
                                return response.getCompartment().getLifecycleState() == targetState;
                            }
                        },
                        targetState
                                == com.oracle.bmc.identity.model.Compartment.LifecycleState
                                        .Deleted),
                request);
    }

    /**
     * Creates a new {@link Waiter} using default configuration.
     *
     * @param request The request to send.
     * @param targetState The desired state to wait for.
     * @return A new Waiter instance.
     */
    public com.oracle.bmc.waiter.Waiter<GetDynamicGroupRequest, GetDynamicGroupResponse>
            forDynamicGroup(
                    GetDynamicGroupRequest request,
                    com.oracle.bmc.identity.model.DynamicGroup.LifecycleState targetState) {
        return forDynamicGroup(
                com.oracle.bmc.waiter.Waiters.DEFAULT_POLLING_WAITER, request, targetState);
    }

    /**
     * Creates a new {@link Waiter} using the provided configuration.
     *
     * @param request The request to send.
     * @param targetState The desired state to wait for.
     * @param terminationStrategy The {@link TerminationStrategy} to use.
     * @param delayStrategy The {@link DelayStrategy} to use.
     * @return A new Waiter instance.
     */
    public com.oracle.bmc.waiter.Waiter<GetDynamicGroupRequest, GetDynamicGroupResponse>
            forDynamicGroup(
                    GetDynamicGroupRequest request,
                    com.oracle.bmc.identity.model.DynamicGroup.LifecycleState targetState,
                    com.oracle.bmc.waiter.TerminationStrategy terminationStrategy,
                    com.oracle.bmc.waiter.DelayStrategy delayStrategy) {
        return forDynamicGroup(
                com.oracle.bmc.waiter.Waiters.newWaiter(terminationStrategy, delayStrategy),
                request,
                targetState);
    }

    // Helper method to create a new Waiter for DynamicGroup.
    private com.oracle.bmc.waiter.Waiter<GetDynamicGroupRequest, GetDynamicGroupResponse>
            forDynamicGroup(
                    com.oracle.bmc.waiter.BmcGenericWaiter waiter,
                    final GetDynamicGroupRequest request,
                    final com.oracle.bmc.identity.model.DynamicGroup.LifecycleState targetState) {
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
                                return response.getDynamicGroup().getLifecycleState()
                                        == targetState;
                            }
                        },
                        targetState
                                == com.oracle.bmc.identity.model.DynamicGroup.LifecycleState
                                        .Deleted),
                request);
    }

    /**
     * Creates a new {@link Waiter} using default configuration.
     *
     * @param request The request to send.
     * @param targetState The desired state to wait for.
     * @return A new Waiter instance.
     */
    public com.oracle.bmc.waiter.Waiter<GetGroupRequest, GetGroupResponse> forGroup(
            GetGroupRequest request,
            com.oracle.bmc.identity.model.Group.LifecycleState targetState) {
        return forGroup(com.oracle.bmc.waiter.Waiters.DEFAULT_POLLING_WAITER, request, targetState);
    }

    /**
     * Creates a new {@link Waiter} using the provided configuration.
     *
     * @param request The request to send.
     * @param targetState The desired state to wait for.
     * @param terminationStrategy The {@link TerminationStrategy} to use.
     * @param delayStrategy The {@link DelayStrategy} to use.
     * @return A new Waiter instance.
     */
    public com.oracle.bmc.waiter.Waiter<GetGroupRequest, GetGroupResponse> forGroup(
            GetGroupRequest request,
            com.oracle.bmc.identity.model.Group.LifecycleState targetState,
            com.oracle.bmc.waiter.TerminationStrategy terminationStrategy,
            com.oracle.bmc.waiter.DelayStrategy delayStrategy) {
        return forGroup(
                com.oracle.bmc.waiter.Waiters.newWaiter(terminationStrategy, delayStrategy),
                request,
                targetState);
    }

    // Helper method to create a new Waiter for Group.
    private com.oracle.bmc.waiter.Waiter<GetGroupRequest, GetGroupResponse> forGroup(
            com.oracle.bmc.waiter.BmcGenericWaiter waiter,
            final GetGroupRequest request,
            final com.oracle.bmc.identity.model.Group.LifecycleState targetState) {
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
                                return response.getGroup().getLifecycleState() == targetState;
                            }
                        },
                        targetState == com.oracle.bmc.identity.model.Group.LifecycleState.Deleted),
                request);
    }

    /**
     * Creates a new {@link Waiter} using default configuration.
     *
     * @param request The request to send.
     * @param targetState The desired state to wait for.
     * @return A new Waiter instance.
     */
    public com.oracle.bmc.waiter.Waiter<GetIdentityProviderRequest, GetIdentityProviderResponse>
            forIdentityProvider(
                    GetIdentityProviderRequest request,
                    com.oracle.bmc.identity.model.IdentityProvider.LifecycleState targetState) {
        return forIdentityProvider(
                com.oracle.bmc.waiter.Waiters.DEFAULT_POLLING_WAITER, request, targetState);
    }

    /**
     * Creates a new {@link Waiter} using the provided configuration.
     *
     * @param request The request to send.
     * @param targetState The desired state to wait for.
     * @param terminationStrategy The {@link TerminationStrategy} to use.
     * @param delayStrategy The {@link DelayStrategy} to use.
     * @return A new Waiter instance.
     */
    public com.oracle.bmc.waiter.Waiter<GetIdentityProviderRequest, GetIdentityProviderResponse>
            forIdentityProvider(
                    GetIdentityProviderRequest request,
                    com.oracle.bmc.identity.model.IdentityProvider.LifecycleState targetState,
                    com.oracle.bmc.waiter.TerminationStrategy terminationStrategy,
                    com.oracle.bmc.waiter.DelayStrategy delayStrategy) {
        return forIdentityProvider(
                com.oracle.bmc.waiter.Waiters.newWaiter(terminationStrategy, delayStrategy),
                request,
                targetState);
    }

    // Helper method to create a new Waiter for IdentityProvider.
    private com.oracle.bmc.waiter.Waiter<GetIdentityProviderRequest, GetIdentityProviderResponse>
            forIdentityProvider(
                    com.oracle.bmc.waiter.BmcGenericWaiter waiter,
                    final GetIdentityProviderRequest request,
                    final com.oracle.bmc.identity.model.IdentityProvider.LifecycleState
                            targetState) {
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
                                return response.getIdentityProvider().getLifecycleState()
                                        == targetState;
                            }
                        },
                        targetState
                                == com.oracle.bmc.identity.model.IdentityProvider.LifecycleState
                                        .Deleted),
                request);
    }

    /**
     * Creates a new {@link Waiter} using default configuration.
     *
     * @param request The request to send.
     * @param targetState The desired state to wait for.
     * @return A new Waiter instance.
     */
    public com.oracle.bmc.waiter.Waiter<GetIdpGroupMappingRequest, GetIdpGroupMappingResponse>
            forIdpGroupMapping(
                    GetIdpGroupMappingRequest request,
                    com.oracle.bmc.identity.model.IdpGroupMapping.LifecycleState targetState) {
        return forIdpGroupMapping(
                com.oracle.bmc.waiter.Waiters.DEFAULT_POLLING_WAITER, request, targetState);
    }

    /**
     * Creates a new {@link Waiter} using the provided configuration.
     *
     * @param request The request to send.
     * @param targetState The desired state to wait for.
     * @param terminationStrategy The {@link TerminationStrategy} to use.
     * @param delayStrategy The {@link DelayStrategy} to use.
     * @return A new Waiter instance.
     */
    public com.oracle.bmc.waiter.Waiter<GetIdpGroupMappingRequest, GetIdpGroupMappingResponse>
            forIdpGroupMapping(
                    GetIdpGroupMappingRequest request,
                    com.oracle.bmc.identity.model.IdpGroupMapping.LifecycleState targetState,
                    com.oracle.bmc.waiter.TerminationStrategy terminationStrategy,
                    com.oracle.bmc.waiter.DelayStrategy delayStrategy) {
        return forIdpGroupMapping(
                com.oracle.bmc.waiter.Waiters.newWaiter(terminationStrategy, delayStrategy),
                request,
                targetState);
    }

    // Helper method to create a new Waiter for IdpGroupMapping.
    private com.oracle.bmc.waiter.Waiter<GetIdpGroupMappingRequest, GetIdpGroupMappingResponse>
            forIdpGroupMapping(
                    com.oracle.bmc.waiter.BmcGenericWaiter waiter,
                    final GetIdpGroupMappingRequest request,
                    final com.oracle.bmc.identity.model.IdpGroupMapping.LifecycleState
                            targetState) {
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
                                return response.getIdpGroupMapping().getLifecycleState()
                                        == targetState;
                            }
                        },
                        targetState
                                == com.oracle.bmc.identity.model.IdpGroupMapping.LifecycleState
                                        .Deleted),
                request);
    }

    /**
     * Creates a new {@link Waiter} using default configuration.
     *
     * @param request The request to send.
     * @param targetState The desired state to wait for.
     * @return A new Waiter instance.
     */
    public com.oracle.bmc.waiter.Waiter<GetPolicyRequest, GetPolicyResponse> forPolicy(
            GetPolicyRequest request,
            com.oracle.bmc.identity.model.Policy.LifecycleState targetState) {
        return forPolicy(
                com.oracle.bmc.waiter.Waiters.DEFAULT_POLLING_WAITER, request, targetState);
    }

    /**
     * Creates a new {@link Waiter} using the provided configuration.
     *
     * @param request The request to send.
     * @param targetState The desired state to wait for.
     * @param terminationStrategy The {@link TerminationStrategy} to use.
     * @param delayStrategy The {@link DelayStrategy} to use.
     * @return A new Waiter instance.
     */
    public com.oracle.bmc.waiter.Waiter<GetPolicyRequest, GetPolicyResponse> forPolicy(
            GetPolicyRequest request,
            com.oracle.bmc.identity.model.Policy.LifecycleState targetState,
            com.oracle.bmc.waiter.TerminationStrategy terminationStrategy,
            com.oracle.bmc.waiter.DelayStrategy delayStrategy) {
        return forPolicy(
                com.oracle.bmc.waiter.Waiters.newWaiter(terminationStrategy, delayStrategy),
                request,
                targetState);
    }

    // Helper method to create a new Waiter for Policy.
    private com.oracle.bmc.waiter.Waiter<GetPolicyRequest, GetPolicyResponse> forPolicy(
            com.oracle.bmc.waiter.BmcGenericWaiter waiter,
            final GetPolicyRequest request,
            final com.oracle.bmc.identity.model.Policy.LifecycleState targetState) {
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
                                return response.getPolicy().getLifecycleState() == targetState;
                            }
                        },
                        targetState == com.oracle.bmc.identity.model.Policy.LifecycleState.Deleted),
                request);
    }

    /**
     * Creates a new {@link Waiter} using default configuration.
     *
     * @param request The request to send.
     * @param targetState The desired state to wait for.
     * @return A new Waiter instance.
     */
    public com.oracle.bmc.waiter.Waiter<GetUserRequest, GetUserResponse> forUser(
            GetUserRequest request, com.oracle.bmc.identity.model.User.LifecycleState targetState) {
        return forUser(com.oracle.bmc.waiter.Waiters.DEFAULT_POLLING_WAITER, request, targetState);
    }

    /**
     * Creates a new {@link Waiter} using the provided configuration.
     *
     * @param request The request to send.
     * @param targetState The desired state to wait for.
     * @param terminationStrategy The {@link TerminationStrategy} to use.
     * @param delayStrategy The {@link DelayStrategy} to use.
     * @return A new Waiter instance.
     */
    public com.oracle.bmc.waiter.Waiter<GetUserRequest, GetUserResponse> forUser(
            GetUserRequest request,
            com.oracle.bmc.identity.model.User.LifecycleState targetState,
            com.oracle.bmc.waiter.TerminationStrategy terminationStrategy,
            com.oracle.bmc.waiter.DelayStrategy delayStrategy) {
        return forUser(
                com.oracle.bmc.waiter.Waiters.newWaiter(terminationStrategy, delayStrategy),
                request,
                targetState);
    }

    // Helper method to create a new Waiter for User.
    private com.oracle.bmc.waiter.Waiter<GetUserRequest, GetUserResponse> forUser(
            com.oracle.bmc.waiter.BmcGenericWaiter waiter,
            final GetUserRequest request,
            final com.oracle.bmc.identity.model.User.LifecycleState targetState) {
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
                                return response.getUser().getLifecycleState() == targetState;
                            }
                        },
                        targetState == com.oracle.bmc.identity.model.User.LifecycleState.Deleted),
                request);
    }

    /**
     * Creates a new {@link Waiter} using default configuration.
     *
     * @param request The request to send.
     * @param targetState The desired state to wait for.
     * @return A new Waiter instance.
     */
    public com.oracle.bmc.waiter.Waiter<
                    GetUserGroupMembershipRequest, GetUserGroupMembershipResponse>
            forUserGroupMembership(
                    GetUserGroupMembershipRequest request,
                    com.oracle.bmc.identity.model.UserGroupMembership.LifecycleState targetState) {
        return forUserGroupMembership(
                com.oracle.bmc.waiter.Waiters.DEFAULT_POLLING_WAITER, request, targetState);
    }

    /**
     * Creates a new {@link Waiter} using the provided configuration.
     *
     * @param request The request to send.
     * @param targetState The desired state to wait for.
     * @param terminationStrategy The {@link TerminationStrategy} to use.
     * @param delayStrategy The {@link DelayStrategy} to use.
     * @return A new Waiter instance.
     */
    public com.oracle.bmc.waiter.Waiter<
                    GetUserGroupMembershipRequest, GetUserGroupMembershipResponse>
            forUserGroupMembership(
                    GetUserGroupMembershipRequest request,
                    com.oracle.bmc.identity.model.UserGroupMembership.LifecycleState targetState,
                    com.oracle.bmc.waiter.TerminationStrategy terminationStrategy,
                    com.oracle.bmc.waiter.DelayStrategy delayStrategy) {
        return forUserGroupMembership(
                com.oracle.bmc.waiter.Waiters.newWaiter(terminationStrategy, delayStrategy),
                request,
                targetState);
    }

    // Helper method to create a new Waiter for UserGroupMembership.
    private com.oracle.bmc.waiter.Waiter<
                    GetUserGroupMembershipRequest, GetUserGroupMembershipResponse>
            forUserGroupMembership(
                    com.oracle.bmc.waiter.BmcGenericWaiter waiter,
                    final GetUserGroupMembershipRequest request,
                    final com.oracle.bmc.identity.model.UserGroupMembership.LifecycleState
                            targetState) {
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
                                return response.getUserGroupMembership().getLifecycleState()
                                        == targetState;
                            }
                        },
                        targetState
                                == com.oracle.bmc.identity.model.UserGroupMembership.LifecycleState
                                        .Deleted),
                request);
    }
}
