/**
 * Copyright (c) 2016, 2019, Oracle and/or its affiliates. All rights reserved.
 */
package com.oracle.bmc.dns;

import com.oracle.bmc.dns.requests.*;
import com.oracle.bmc.dns.responses.*;

/**
 * Collection of helper methods to produce {@link com.oracle.bmc.waiter.Waiter}s for different
 * resources of Dns.
 * <p>
 * The default configuration used is defined by {@link com.oracle.bmc.waiter.Waiters.Waiters#DEFAULT_POLLING_WAITER}.
 */
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20180115")
@lombok.RequiredArgsConstructor
public class DnsWaiters {
    private final java.util.concurrent.ExecutorService executorService;
    private final Dns client;

    /**
     * Creates a new {@link com.oracle.bmc.waiter.Waiter} using the default configuration.
     *
     * @param request the request to send
     * @param targetStates the desired states to wait for. If multiple states are provided then the waiter will return once the resource reaches any of the provided states
     * @return a new {@code Waiter} instance
     */
    public com.oracle.bmc.waiter.Waiter<GetSteeringPolicyRequest, GetSteeringPolicyResponse>
            forSteeringPolicy(
                    GetSteeringPolicyRequest request,
                    com.oracle.bmc.dns.model.SteeringPolicy.LifecycleState... targetStates) {
        org.apache.commons.lang3.Validate.notEmpty(
                targetStates, "At least one targetState must be provided");
        org.apache.commons.lang3.Validate.noNullElements(
                targetStates, "Null targetState values are not permitted");

        return forSteeringPolicy(
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
    public com.oracle.bmc.waiter.Waiter<GetSteeringPolicyRequest, GetSteeringPolicyResponse>
            forSteeringPolicy(
                    GetSteeringPolicyRequest request,
                    com.oracle.bmc.dns.model.SteeringPolicy.LifecycleState targetState,
                    com.oracle.bmc.waiter.TerminationStrategy terminationStrategy,
                    com.oracle.bmc.waiter.DelayStrategy delayStrategy) {
        org.apache.commons.lang3.Validate.notNull(targetState, "The targetState cannot be null");

        return forSteeringPolicy(
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
    public com.oracle.bmc.waiter.Waiter<GetSteeringPolicyRequest, GetSteeringPolicyResponse>
            forSteeringPolicy(
                    GetSteeringPolicyRequest request,
                    com.oracle.bmc.waiter.TerminationStrategy terminationStrategy,
                    com.oracle.bmc.waiter.DelayStrategy delayStrategy,
                    com.oracle.bmc.dns.model.SteeringPolicy.LifecycleState... targetStates) {
        org.apache.commons.lang3.Validate.notEmpty(
                targetStates, "At least one target state must be provided");
        org.apache.commons.lang3.Validate.noNullElements(
                targetStates, "Null target states are not permitted");

        return forSteeringPolicy(
                com.oracle.bmc.waiter.Waiters.newWaiter(terminationStrategy, delayStrategy),
                request,
                targetStates);
    }

    // Helper method to create a new Waiter for SteeringPolicy.
    private com.oracle.bmc.waiter.Waiter<GetSteeringPolicyRequest, GetSteeringPolicyResponse>
            forSteeringPolicy(
                    com.oracle.bmc.waiter.BmcGenericWaiter waiter,
                    final GetSteeringPolicyRequest request,
                    final com.oracle.bmc.dns.model.SteeringPolicy.LifecycleState... targetStates) {
        final java.util.Set<com.oracle.bmc.dns.model.SteeringPolicy.LifecycleState>
                targetStatesSet = new java.util.HashSet<>(java.util.Arrays.asList(targetStates));

        return new com.oracle.bmc.waiter.internal.SimpleWaiterImpl<>(
                executorService,
                waiter.toCallable(
                        com.google.common.base.Suppliers.ofInstance(request),
                        new com.google.common.base.Function<
                                GetSteeringPolicyRequest, GetSteeringPolicyResponse>() {
                            @Override
                            public GetSteeringPolicyResponse apply(
                                    GetSteeringPolicyRequest request) {
                                return client.getSteeringPolicy(request);
                            }
                        },
                        new com.google.common.base.Predicate<GetSteeringPolicyResponse>() {
                            @Override
                            public boolean apply(GetSteeringPolicyResponse response) {
                                return targetStatesSet.contains(
                                        response.getSteeringPolicy().getLifecycleState());
                            }
                        },
                        targetStatesSet.contains(
                                com.oracle.bmc.dns.model.SteeringPolicy.LifecycleState.Deleted)),
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
                    GetSteeringPolicyAttachmentRequest, GetSteeringPolicyAttachmentResponse>
            forSteeringPolicyAttachment(
                    GetSteeringPolicyAttachmentRequest request,
                    com.oracle.bmc.dns.model.SteeringPolicyAttachment.LifecycleState...
                            targetStates) {
        org.apache.commons.lang3.Validate.notEmpty(
                targetStates, "At least one targetState must be provided");
        org.apache.commons.lang3.Validate.noNullElements(
                targetStates, "Null targetState values are not permitted");

        return forSteeringPolicyAttachment(
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
                    GetSteeringPolicyAttachmentRequest, GetSteeringPolicyAttachmentResponse>
            forSteeringPolicyAttachment(
                    GetSteeringPolicyAttachmentRequest request,
                    com.oracle.bmc.dns.model.SteeringPolicyAttachment.LifecycleState targetState,
                    com.oracle.bmc.waiter.TerminationStrategy terminationStrategy,
                    com.oracle.bmc.waiter.DelayStrategy delayStrategy) {
        org.apache.commons.lang3.Validate.notNull(targetState, "The targetState cannot be null");

        return forSteeringPolicyAttachment(
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
                    GetSteeringPolicyAttachmentRequest, GetSteeringPolicyAttachmentResponse>
            forSteeringPolicyAttachment(
                    GetSteeringPolicyAttachmentRequest request,
                    com.oracle.bmc.waiter.TerminationStrategy terminationStrategy,
                    com.oracle.bmc.waiter.DelayStrategy delayStrategy,
                    com.oracle.bmc.dns.model.SteeringPolicyAttachment.LifecycleState...
                            targetStates) {
        org.apache.commons.lang3.Validate.notEmpty(
                targetStates, "At least one target state must be provided");
        org.apache.commons.lang3.Validate.noNullElements(
                targetStates, "Null target states are not permitted");

        return forSteeringPolicyAttachment(
                com.oracle.bmc.waiter.Waiters.newWaiter(terminationStrategy, delayStrategy),
                request,
                targetStates);
    }

    // Helper method to create a new Waiter for SteeringPolicyAttachment.
    private com.oracle.bmc.waiter.Waiter<
                    GetSteeringPolicyAttachmentRequest, GetSteeringPolicyAttachmentResponse>
            forSteeringPolicyAttachment(
                    com.oracle.bmc.waiter.BmcGenericWaiter waiter,
                    final GetSteeringPolicyAttachmentRequest request,
                    final com.oracle.bmc.dns.model.SteeringPolicyAttachment.LifecycleState...
                            targetStates) {
        final java.util.Set<com.oracle.bmc.dns.model.SteeringPolicyAttachment.LifecycleState>
                targetStatesSet = new java.util.HashSet<>(java.util.Arrays.asList(targetStates));

        return new com.oracle.bmc.waiter.internal.SimpleWaiterImpl<>(
                executorService,
                waiter.toCallable(
                        com.google.common.base.Suppliers.ofInstance(request),
                        new com.google.common.base.Function<
                                GetSteeringPolicyAttachmentRequest,
                                GetSteeringPolicyAttachmentResponse>() {
                            @Override
                            public GetSteeringPolicyAttachmentResponse apply(
                                    GetSteeringPolicyAttachmentRequest request) {
                                return client.getSteeringPolicyAttachment(request);
                            }
                        },
                        new com.google.common.base.Predicate<
                                GetSteeringPolicyAttachmentResponse>() {
                            @Override
                            public boolean apply(GetSteeringPolicyAttachmentResponse response) {
                                return targetStatesSet.contains(
                                        response.getSteeringPolicyAttachment().getLifecycleState());
                            }
                        },
                        false),
                request);
    }

    /**
     * Creates a new {@link com.oracle.bmc.waiter.Waiter} using the default configuration.
     *
     * @param request the request to send
     * @param targetStates the desired states to wait for. If multiple states are provided then the waiter will return once the resource reaches any of the provided states
     * @return a new {@code Waiter} instance
     */
    public com.oracle.bmc.waiter.Waiter<GetZoneRequest, GetZoneResponse> forZone(
            GetZoneRequest request, com.oracle.bmc.dns.model.Zone.LifecycleState... targetStates) {
        org.apache.commons.lang3.Validate.notEmpty(
                targetStates, "At least one targetState must be provided");
        org.apache.commons.lang3.Validate.noNullElements(
                targetStates, "Null targetState values are not permitted");

        return forZone(com.oracle.bmc.waiter.Waiters.DEFAULT_POLLING_WAITER, request, targetStates);
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
    public com.oracle.bmc.waiter.Waiter<GetZoneRequest, GetZoneResponse> forZone(
            GetZoneRequest request,
            com.oracle.bmc.dns.model.Zone.LifecycleState targetState,
            com.oracle.bmc.waiter.TerminationStrategy terminationStrategy,
            com.oracle.bmc.waiter.DelayStrategy delayStrategy) {
        org.apache.commons.lang3.Validate.notNull(targetState, "The targetState cannot be null");

        return forZone(
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
    public com.oracle.bmc.waiter.Waiter<GetZoneRequest, GetZoneResponse> forZone(
            GetZoneRequest request,
            com.oracle.bmc.waiter.TerminationStrategy terminationStrategy,
            com.oracle.bmc.waiter.DelayStrategy delayStrategy,
            com.oracle.bmc.dns.model.Zone.LifecycleState... targetStates) {
        org.apache.commons.lang3.Validate.notEmpty(
                targetStates, "At least one target state must be provided");
        org.apache.commons.lang3.Validate.noNullElements(
                targetStates, "Null target states are not permitted");

        return forZone(
                com.oracle.bmc.waiter.Waiters.newWaiter(terminationStrategy, delayStrategy),
                request,
                targetStates);
    }

    // Helper method to create a new Waiter for Zone.
    private com.oracle.bmc.waiter.Waiter<GetZoneRequest, GetZoneResponse> forZone(
            com.oracle.bmc.waiter.BmcGenericWaiter waiter,
            final GetZoneRequest request,
            final com.oracle.bmc.dns.model.Zone.LifecycleState... targetStates) {
        final java.util.Set<com.oracle.bmc.dns.model.Zone.LifecycleState> targetStatesSet =
                new java.util.HashSet<>(java.util.Arrays.asList(targetStates));

        return new com.oracle.bmc.waiter.internal.SimpleWaiterImpl<>(
                executorService,
                waiter.toCallable(
                        com.google.common.base.Suppliers.ofInstance(request),
                        new com.google.common.base.Function<GetZoneRequest, GetZoneResponse>() {
                            @Override
                            public GetZoneResponse apply(GetZoneRequest request) {
                                return client.getZone(request);
                            }
                        },
                        new com.google.common.base.Predicate<GetZoneResponse>() {
                            @Override
                            public boolean apply(GetZoneResponse response) {
                                return targetStatesSet.contains(
                                        response.getZone().getLifecycleState());
                            }
                        },
                        targetStatesSet.contains(
                                com.oracle.bmc.dns.model.Zone.LifecycleState.Deleted)),
                request);
    }
}
