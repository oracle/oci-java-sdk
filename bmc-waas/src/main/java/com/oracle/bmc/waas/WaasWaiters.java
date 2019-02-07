/**
 * Copyright (c) 2016, 2019, Oracle and/or its affiliates. All rights reserved.
 */
package com.oracle.bmc.waas;

import com.oracle.bmc.waas.requests.*;
import com.oracle.bmc.waas.responses.*;

/**
 * Collection of helper methods to produce {@link Waiter}s for different
 * resources of Waas.
 * <p>
 * The default configuration used is defined by {@link Waiters#DEFAULT_POLLING_WAITER}.
 */
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20181116")
@lombok.RequiredArgsConstructor
public class WaasWaiters {
    private final java.util.concurrent.ExecutorService executorService;
    private final Waas client;

    /**
     * Creates a new {@link Waiter} using default configuration.
     *
     * @param request the request to send
     * @param targetState the desired states to wait for. If multiple states are provided then the waiter will return once the resource reaches any of the provided states
     * @return a new {@code Waiter} instance
     */
    public com.oracle.bmc.waiter.Waiter<GetCertificateRequest, GetCertificateResponse>
            forCertificate(
                    GetCertificateRequest request,
                    com.oracle.bmc.waas.model.LifecycleStates... targetStates) {
        org.apache.commons.lang3.Validate.notEmpty(
                targetStates, "At least one targetState must be provided");
        org.apache.commons.lang3.Validate.noNullElements(
                targetStates, "Null targetState values are not permitted");

        return forCertificate(
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
    public com.oracle.bmc.waiter.Waiter<GetCertificateRequest, GetCertificateResponse>
            forCertificate(
                    GetCertificateRequest request,
                    com.oracle.bmc.waas.model.LifecycleStates targetState,
                    com.oracle.bmc.waiter.TerminationStrategy terminationStrategy,
                    com.oracle.bmc.waiter.DelayStrategy delayStrategy) {
        org.apache.commons.lang3.Validate.notNull(targetState, "The targetState cannot be null");

        return forCertificate(
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
    public com.oracle.bmc.waiter.Waiter<GetCertificateRequest, GetCertificateResponse>
            forCertificate(
                    GetCertificateRequest request,
                    com.oracle.bmc.waiter.TerminationStrategy terminationStrategy,
                    com.oracle.bmc.waiter.DelayStrategy delayStrategy,
                    com.oracle.bmc.waas.model.LifecycleStates... targetStates) {
        org.apache.commons.lang3.Validate.notEmpty(
                targetStates, "At least one targetState must be provided");
        org.apache.commons.lang3.Validate.noNullElements(
                targetStates, "Null targetState values are not permitted");

        return forCertificate(
                com.oracle.bmc.waiter.Waiters.newWaiter(terminationStrategy, delayStrategy),
                request,
                targetStates);
    }

    // Helper method to create a new Waiter for Certificate.
    private com.oracle.bmc.waiter.Waiter<GetCertificateRequest, GetCertificateResponse>
            forCertificate(
                    com.oracle.bmc.waiter.BmcGenericWaiter waiter,
                    final GetCertificateRequest request,
                    final com.oracle.bmc.waas.model.LifecycleStates... targetStates) {
        final java.util.Set<com.oracle.bmc.waas.model.LifecycleStates> targetStatesSet =
                new java.util.HashSet<>(java.util.Arrays.asList(targetStates));

        return new com.oracle.bmc.waiter.internal.SimpleWaiterImpl<>(
                executorService,
                waiter.toCallable(
                        com.google.common.base.Suppliers.ofInstance(request),
                        new com.google.common.base.Function<
                                GetCertificateRequest, GetCertificateResponse>() {
                            @Override
                            public GetCertificateResponse apply(GetCertificateRequest request) {
                                return client.getCertificate(request);
                            }
                        },
                        new com.google.common.base.Predicate<GetCertificateResponse>() {
                            @Override
                            public boolean apply(GetCertificateResponse response) {
                                return targetStatesSet.contains(
                                        response.getCertificate().getLifecycleState());
                            }
                        },
                        targetStatesSet.contains(
                                com.oracle.bmc.waas.model.LifecycleStates.Deleted)),
                request);
    }

    /**
     * Creates a new {@link Waiter} using default configuration.
     *
     * @param request the request to send
     * @param targetState the desired states to wait for. If multiple states are provided then the waiter will return once the resource reaches any of the provided states
     * @return a new {@code Waiter} instance
     */
    public com.oracle.bmc.waiter.Waiter<GetWaasPolicyRequest, GetWaasPolicyResponse> forWaasPolicy(
            GetWaasPolicyRequest request,
            com.oracle.bmc.waas.model.LifecycleStates... targetStates) {
        org.apache.commons.lang3.Validate.notEmpty(
                targetStates, "At least one targetState must be provided");
        org.apache.commons.lang3.Validate.noNullElements(
                targetStates, "Null targetState values are not permitted");

        return forWaasPolicy(
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
    public com.oracle.bmc.waiter.Waiter<GetWaasPolicyRequest, GetWaasPolicyResponse> forWaasPolicy(
            GetWaasPolicyRequest request,
            com.oracle.bmc.waas.model.LifecycleStates targetState,
            com.oracle.bmc.waiter.TerminationStrategy terminationStrategy,
            com.oracle.bmc.waiter.DelayStrategy delayStrategy) {
        org.apache.commons.lang3.Validate.notNull(targetState, "The targetState cannot be null");

        return forWaasPolicy(
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
    public com.oracle.bmc.waiter.Waiter<GetWaasPolicyRequest, GetWaasPolicyResponse> forWaasPolicy(
            GetWaasPolicyRequest request,
            com.oracle.bmc.waiter.TerminationStrategy terminationStrategy,
            com.oracle.bmc.waiter.DelayStrategy delayStrategy,
            com.oracle.bmc.waas.model.LifecycleStates... targetStates) {
        org.apache.commons.lang3.Validate.notEmpty(
                targetStates, "At least one targetState must be provided");
        org.apache.commons.lang3.Validate.noNullElements(
                targetStates, "Null targetState values are not permitted");

        return forWaasPolicy(
                com.oracle.bmc.waiter.Waiters.newWaiter(terminationStrategy, delayStrategy),
                request,
                targetStates);
    }

    // Helper method to create a new Waiter for WaasPolicy.
    private com.oracle.bmc.waiter.Waiter<GetWaasPolicyRequest, GetWaasPolicyResponse> forWaasPolicy(
            com.oracle.bmc.waiter.BmcGenericWaiter waiter,
            final GetWaasPolicyRequest request,
            final com.oracle.bmc.waas.model.LifecycleStates... targetStates) {
        final java.util.Set<com.oracle.bmc.waas.model.LifecycleStates> targetStatesSet =
                new java.util.HashSet<>(java.util.Arrays.asList(targetStates));

        return new com.oracle.bmc.waiter.internal.SimpleWaiterImpl<>(
                executorService,
                waiter.toCallable(
                        com.google.common.base.Suppliers.ofInstance(request),
                        new com.google.common.base.Function<
                                GetWaasPolicyRequest, GetWaasPolicyResponse>() {
                            @Override
                            public GetWaasPolicyResponse apply(GetWaasPolicyRequest request) {
                                return client.getWaasPolicy(request);
                            }
                        },
                        new com.google.common.base.Predicate<GetWaasPolicyResponse>() {
                            @Override
                            public boolean apply(GetWaasPolicyResponse response) {
                                return targetStatesSet.contains(
                                        response.getWaasPolicy().getLifecycleState());
                            }
                        },
                        targetStatesSet.contains(
                                com.oracle.bmc.waas.model.LifecycleStates.Deleted)),
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
