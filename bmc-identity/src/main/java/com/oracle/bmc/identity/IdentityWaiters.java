/**
 * Copyright (c) 2016, 2017, Oracle and/or its affiliates. All rights reserved.
 */
package com.oracle.bmc.identity;

import com.oracle.bmc.identity.requests.*;
import com.oracle.bmc.identity.responses.*;

import com.oracle.bmc.waiter.*;
import com.oracle.bmc.waiter.internal.SimpleWaiterImpl;

import java.util.concurrent.ExecutorService;

import com.google.common.base.Function;
import com.google.common.base.Predicate;
import com.google.common.base.Suppliers;

import lombok.RequiredArgsConstructor;

/**
 * Collection of helper methods to produce {@link Waiter}s for different
 * resources of Identity.
 * <p>
 * The default configuration used is defined by {@link Waiters#DEFAULT_POLLING_WAITER}.
 */
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20160918")
@RequiredArgsConstructor
public class IdentityWaiters {
    private final ExecutorService executorService;
    private final Identity client;

    /**
     * Creates a new {@link Waiter} using default configuration.
     *
     * @param request The request to send.
     * @param targetState The desired state to wait for.
     * @return A new Waiter instance.
     */
    public Waiter<GetCompartmentRequest, GetCompartmentResponse> forCompartment(
            GetCompartmentRequest request,
            com.oracle.bmc.identity.model.Compartment.LifecycleState targetState) {
        return forCompartment(Waiters.DEFAULT_POLLING_WAITER, request, targetState);
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
    public Waiter<GetCompartmentRequest, GetCompartmentResponse> forCompartment(
            GetCompartmentRequest request,
            com.oracle.bmc.identity.model.Compartment.LifecycleState targetState,
            TerminationStrategy terminationStrategy,
            DelayStrategy delayStrategy) {
        return forCompartment(
                Waiters.newWaiter(terminationStrategy, delayStrategy), request, targetState);
    }

    // Helper method to create a new Waiter for Compartment.
    private Waiter<GetCompartmentRequest, GetCompartmentResponse> forCompartment(
            BmcGenericWaiter waiter,
            final GetCompartmentRequest request,
            final com.oracle.bmc.identity.model.Compartment.LifecycleState targetState) {
        return new SimpleWaiterImpl<>(
                executorService,
                waiter.toCallable(
                        Suppliers.ofInstance(request),
                        new Function<GetCompartmentRequest, GetCompartmentResponse>() {
                            @Override
                            public GetCompartmentResponse apply(GetCompartmentRequest request) {
                                return client.getCompartment(request);
                            }
                        },
                        new Predicate<GetCompartmentResponse>() {
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
    public Waiter<GetGroupRequest, GetGroupResponse> forGroup(
            GetGroupRequest request,
            com.oracle.bmc.identity.model.Group.LifecycleState targetState) {
        return forGroup(Waiters.DEFAULT_POLLING_WAITER, request, targetState);
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
    public Waiter<GetGroupRequest, GetGroupResponse> forGroup(
            GetGroupRequest request,
            com.oracle.bmc.identity.model.Group.LifecycleState targetState,
            TerminationStrategy terminationStrategy,
            DelayStrategy delayStrategy) {
        return forGroup(
                Waiters.newWaiter(terminationStrategy, delayStrategy), request, targetState);
    }

    // Helper method to create a new Waiter for Group.
    private Waiter<GetGroupRequest, GetGroupResponse> forGroup(
            BmcGenericWaiter waiter,
            final GetGroupRequest request,
            final com.oracle.bmc.identity.model.Group.LifecycleState targetState) {
        return new SimpleWaiterImpl<>(
                executorService,
                waiter.toCallable(
                        Suppliers.ofInstance(request),
                        new Function<GetGroupRequest, GetGroupResponse>() {
                            @Override
                            public GetGroupResponse apply(GetGroupRequest request) {
                                return client.getGroup(request);
                            }
                        },
                        new Predicate<GetGroupResponse>() {
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
    public Waiter<GetPolicyRequest, GetPolicyResponse> forPolicy(
            GetPolicyRequest request,
            com.oracle.bmc.identity.model.Policy.LifecycleState targetState) {
        return forPolicy(Waiters.DEFAULT_POLLING_WAITER, request, targetState);
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
    public Waiter<GetPolicyRequest, GetPolicyResponse> forPolicy(
            GetPolicyRequest request,
            com.oracle.bmc.identity.model.Policy.LifecycleState targetState,
            TerminationStrategy terminationStrategy,
            DelayStrategy delayStrategy) {
        return forPolicy(
                Waiters.newWaiter(terminationStrategy, delayStrategy), request, targetState);
    }

    // Helper method to create a new Waiter for Policy.
    private Waiter<GetPolicyRequest, GetPolicyResponse> forPolicy(
            BmcGenericWaiter waiter,
            final GetPolicyRequest request,
            final com.oracle.bmc.identity.model.Policy.LifecycleState targetState) {
        return new SimpleWaiterImpl<>(
                executorService,
                waiter.toCallable(
                        Suppliers.ofInstance(request),
                        new Function<GetPolicyRequest, GetPolicyResponse>() {
                            @Override
                            public GetPolicyResponse apply(GetPolicyRequest request) {
                                return client.getPolicy(request);
                            }
                        },
                        new Predicate<GetPolicyResponse>() {
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
    public Waiter<GetUserRequest, GetUserResponse> forUser(
            GetUserRequest request, com.oracle.bmc.identity.model.User.LifecycleState targetState) {
        return forUser(Waiters.DEFAULT_POLLING_WAITER, request, targetState);
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
    public Waiter<GetUserRequest, GetUserResponse> forUser(
            GetUserRequest request,
            com.oracle.bmc.identity.model.User.LifecycleState targetState,
            TerminationStrategy terminationStrategy,
            DelayStrategy delayStrategy) {
        return forUser(Waiters.newWaiter(terminationStrategy, delayStrategy), request, targetState);
    }

    // Helper method to create a new Waiter for User.
    private Waiter<GetUserRequest, GetUserResponse> forUser(
            BmcGenericWaiter waiter,
            final GetUserRequest request,
            final com.oracle.bmc.identity.model.User.LifecycleState targetState) {
        return new SimpleWaiterImpl<>(
                executorService,
                waiter.toCallable(
                        Suppliers.ofInstance(request),
                        new Function<GetUserRequest, GetUserResponse>() {
                            @Override
                            public GetUserResponse apply(GetUserRequest request) {
                                return client.getUser(request);
                            }
                        },
                        new Predicate<GetUserResponse>() {
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
    public Waiter<GetUserGroupMembershipRequest, GetUserGroupMembershipResponse>
            forUserGroupMembership(
                    GetUserGroupMembershipRequest request,
                    com.oracle.bmc.identity.model.UserGroupMembership.LifecycleState targetState) {
        return forUserGroupMembership(Waiters.DEFAULT_POLLING_WAITER, request, targetState);
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
    public Waiter<GetUserGroupMembershipRequest, GetUserGroupMembershipResponse>
            forUserGroupMembership(
                    GetUserGroupMembershipRequest request,
                    com.oracle.bmc.identity.model.UserGroupMembership.LifecycleState targetState,
                    TerminationStrategy terminationStrategy,
                    DelayStrategy delayStrategy) {
        return forUserGroupMembership(
                Waiters.newWaiter(terminationStrategy, delayStrategy), request, targetState);
    }

    // Helper method to create a new Waiter for UserGroupMembership.
    private Waiter<GetUserGroupMembershipRequest, GetUserGroupMembershipResponse>
            forUserGroupMembership(
                    BmcGenericWaiter waiter,
                    final GetUserGroupMembershipRequest request,
                    final com.oracle.bmc.identity.model.UserGroupMembership.LifecycleState
                            targetState) {
        return new SimpleWaiterImpl<>(
                executorService,
                waiter.toCallable(
                        Suppliers.ofInstance(request),
                        new Function<
                                GetUserGroupMembershipRequest, GetUserGroupMembershipResponse>() {
                            @Override
                            public GetUserGroupMembershipResponse apply(
                                    GetUserGroupMembershipRequest request) {
                                return client.getUserGroupMembership(request);
                            }
                        },
                        new Predicate<GetUserGroupMembershipResponse>() {
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
