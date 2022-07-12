/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.certificatesmanagement;

import com.oracle.bmc.certificatesmanagement.requests.*;
import com.oracle.bmc.certificatesmanagement.responses.*;

/**
 * Collection of helper methods to produce {@link com.oracle.bmc.waiter.Waiter}s for different
 * resources of CertificatesManagement.
 * <p>
 * The default configuration used is defined by {@link com.oracle.bmc.waiter.Waiters.Waiters#DEFAULT_POLLING_WAITER}.
 */
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20210224")
public class CertificatesManagementWaiters {
    private final java.util.concurrent.ExecutorService executorService;
    private final CertificatesManagement client;

    public CertificatesManagementWaiters(
            java.util.concurrent.ExecutorService executorService, CertificatesManagement client) {
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
    public com.oracle.bmc.waiter.Waiter<GetAssociationRequest, GetAssociationResponse>
            forAssociation(
                    GetAssociationRequest request,
                    com.oracle.bmc.certificatesmanagement.model.AssociationLifecycleState...
                            targetStates) {
        com.oracle.bmc.util.internal.Validate.notEmpty(
                targetStates, "At least one targetState must be provided");
        com.oracle.bmc.util.internal.Validate.noNullElements(
                targetStates, "Null targetState values are not permitted");

        return forAssociation(
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
    public com.oracle.bmc.waiter.Waiter<GetAssociationRequest, GetAssociationResponse>
            forAssociation(
                    GetAssociationRequest request,
                    com.oracle.bmc.certificatesmanagement.model.AssociationLifecycleState
                            targetState,
                    com.oracle.bmc.waiter.TerminationStrategy terminationStrategy,
                    com.oracle.bmc.waiter.DelayStrategy delayStrategy) {
        com.oracle.bmc.util.internal.Validate.notNull(
                targetState, "The targetState cannot be null");

        return forAssociation(
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
    public com.oracle.bmc.waiter.Waiter<GetAssociationRequest, GetAssociationResponse>
            forAssociation(
                    GetAssociationRequest request,
                    com.oracle.bmc.waiter.TerminationStrategy terminationStrategy,
                    com.oracle.bmc.waiter.DelayStrategy delayStrategy,
                    com.oracle.bmc.certificatesmanagement.model.AssociationLifecycleState...
                            targetStates) {
        com.oracle.bmc.util.internal.Validate.notEmpty(
                targetStates, "At least one targetState must be provided");
        com.oracle.bmc.util.internal.Validate.noNullElements(
                targetStates, "Null targetState values are not permitted");

        return forAssociation(
                com.oracle.bmc.waiter.Waiters.newWaiter(terminationStrategy, delayStrategy),
                request,
                targetStates);
    }

    // Helper method to create a new Waiter for Association.
    private com.oracle.bmc.waiter.Waiter<GetAssociationRequest, GetAssociationResponse>
            forAssociation(
                    com.oracle.bmc.waiter.BmcGenericWaiter waiter,
                    final GetAssociationRequest request,
                    final com.oracle.bmc.certificatesmanagement.model.AssociationLifecycleState...
                            targetStates) {
        final java.util.Set<com.oracle.bmc.certificatesmanagement.model.AssociationLifecycleState>
                targetStatesSet = new java.util.HashSet<>(java.util.Arrays.asList(targetStates));

        return new com.oracle.bmc.waiter.internal.SimpleWaiterImpl<>(
                executorService,
                waiter.toCallable(
                        () -> request,
                        new java.util.function.Function<
                                GetAssociationRequest, GetAssociationResponse>() {
                            @Override
                            public GetAssociationResponse apply(GetAssociationRequest request) {
                                return client.getAssociation(request);
                            }
                        },
                        new java.util.function.Predicate<GetAssociationResponse>() {
                            @Override
                            public boolean test(GetAssociationResponse response) {
                                return targetStatesSet.contains(
                                        response.getAssociation().getLifecycleState());
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
    public com.oracle.bmc.waiter.Waiter<GetCaBundleRequest, GetCaBundleResponse> forCaBundle(
            GetCaBundleRequest request,
            com.oracle.bmc.certificatesmanagement.model.CaBundleLifecycleState... targetStates) {
        com.oracle.bmc.util.internal.Validate.notEmpty(
                targetStates, "At least one targetState must be provided");
        com.oracle.bmc.util.internal.Validate.noNullElements(
                targetStates, "Null targetState values are not permitted");

        return forCaBundle(
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
    public com.oracle.bmc.waiter.Waiter<GetCaBundleRequest, GetCaBundleResponse> forCaBundle(
            GetCaBundleRequest request,
            com.oracle.bmc.certificatesmanagement.model.CaBundleLifecycleState targetState,
            com.oracle.bmc.waiter.TerminationStrategy terminationStrategy,
            com.oracle.bmc.waiter.DelayStrategy delayStrategy) {
        com.oracle.bmc.util.internal.Validate.notNull(
                targetState, "The targetState cannot be null");

        return forCaBundle(
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
    public com.oracle.bmc.waiter.Waiter<GetCaBundleRequest, GetCaBundleResponse> forCaBundle(
            GetCaBundleRequest request,
            com.oracle.bmc.waiter.TerminationStrategy terminationStrategy,
            com.oracle.bmc.waiter.DelayStrategy delayStrategy,
            com.oracle.bmc.certificatesmanagement.model.CaBundleLifecycleState... targetStates) {
        com.oracle.bmc.util.internal.Validate.notEmpty(
                targetStates, "At least one targetState must be provided");
        com.oracle.bmc.util.internal.Validate.noNullElements(
                targetStates, "Null targetState values are not permitted");

        return forCaBundle(
                com.oracle.bmc.waiter.Waiters.newWaiter(terminationStrategy, delayStrategy),
                request,
                targetStates);
    }

    // Helper method to create a new Waiter for CaBundle.
    private com.oracle.bmc.waiter.Waiter<GetCaBundleRequest, GetCaBundleResponse> forCaBundle(
            com.oracle.bmc.waiter.BmcGenericWaiter waiter,
            final GetCaBundleRequest request,
            final com.oracle.bmc.certificatesmanagement.model.CaBundleLifecycleState...
                    targetStates) {
        final java.util.Set<com.oracle.bmc.certificatesmanagement.model.CaBundleLifecycleState>
                targetStatesSet = new java.util.HashSet<>(java.util.Arrays.asList(targetStates));

        return new com.oracle.bmc.waiter.internal.SimpleWaiterImpl<>(
                executorService,
                waiter.toCallable(
                        () -> request,
                        new java.util.function.Function<GetCaBundleRequest, GetCaBundleResponse>() {
                            @Override
                            public GetCaBundleResponse apply(GetCaBundleRequest request) {
                                return client.getCaBundle(request);
                            }
                        },
                        new java.util.function.Predicate<GetCaBundleResponse>() {
                            @Override
                            public boolean test(GetCaBundleResponse response) {
                                return targetStatesSet.contains(
                                        response.getCaBundle().getLifecycleState());
                            }
                        },
                        targetStatesSet.contains(
                                com.oracle.bmc.certificatesmanagement.model.CaBundleLifecycleState
                                        .Deleted)),
                request);
    }

    /**
     * Creates a new {@link com.oracle.bmc.waiter.Waiter} using the default configuration.
     *
     * @param request the request to send
     * @param targetState the desired states to wait for. If multiple states are provided then the waiter will return once the resource reaches any of the provided states
     * @return a new {@code com.oracle.bmc.waiter.Waiter} instance
     */
    public com.oracle.bmc.waiter.Waiter<GetCertificateRequest, GetCertificateResponse>
            forCertificate(
                    GetCertificateRequest request,
                    com.oracle.bmc.certificatesmanagement.model.CertificateLifecycleState...
                            targetStates) {
        com.oracle.bmc.util.internal.Validate.notEmpty(
                targetStates, "At least one targetState must be provided");
        com.oracle.bmc.util.internal.Validate.noNullElements(
                targetStates, "Null targetState values are not permitted");

        return forCertificate(
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
    public com.oracle.bmc.waiter.Waiter<GetCertificateRequest, GetCertificateResponse>
            forCertificate(
                    GetCertificateRequest request,
                    com.oracle.bmc.certificatesmanagement.model.CertificateLifecycleState
                            targetState,
                    com.oracle.bmc.waiter.TerminationStrategy terminationStrategy,
                    com.oracle.bmc.waiter.DelayStrategy delayStrategy) {
        com.oracle.bmc.util.internal.Validate.notNull(
                targetState, "The targetState cannot be null");

        return forCertificate(
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
    public com.oracle.bmc.waiter.Waiter<GetCertificateRequest, GetCertificateResponse>
            forCertificate(
                    GetCertificateRequest request,
                    com.oracle.bmc.waiter.TerminationStrategy terminationStrategy,
                    com.oracle.bmc.waiter.DelayStrategy delayStrategy,
                    com.oracle.bmc.certificatesmanagement.model.CertificateLifecycleState...
                            targetStates) {
        com.oracle.bmc.util.internal.Validate.notEmpty(
                targetStates, "At least one targetState must be provided");
        com.oracle.bmc.util.internal.Validate.noNullElements(
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
                    final com.oracle.bmc.certificatesmanagement.model.CertificateLifecycleState...
                            targetStates) {
        final java.util.Set<com.oracle.bmc.certificatesmanagement.model.CertificateLifecycleState>
                targetStatesSet = new java.util.HashSet<>(java.util.Arrays.asList(targetStates));

        return new com.oracle.bmc.waiter.internal.SimpleWaiterImpl<>(
                executorService,
                waiter.toCallable(
                        () -> request,
                        new java.util.function.Function<
                                GetCertificateRequest, GetCertificateResponse>() {
                            @Override
                            public GetCertificateResponse apply(GetCertificateRequest request) {
                                return client.getCertificate(request);
                            }
                        },
                        new java.util.function.Predicate<GetCertificateResponse>() {
                            @Override
                            public boolean test(GetCertificateResponse response) {
                                return targetStatesSet.contains(
                                        response.getCertificate().getLifecycleState());
                            }
                        },
                        targetStatesSet.contains(
                                com.oracle.bmc.certificatesmanagement.model
                                        .CertificateLifecycleState.Deleted)),
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
                    GetCertificateAuthorityRequest, GetCertificateAuthorityResponse>
            forCertificateAuthority(
                    GetCertificateAuthorityRequest request,
                    com.oracle.bmc.certificatesmanagement.model
                                    .CertificateAuthorityLifecycleState...
                            targetStates) {
        com.oracle.bmc.util.internal.Validate.notEmpty(
                targetStates, "At least one targetState must be provided");
        com.oracle.bmc.util.internal.Validate.noNullElements(
                targetStates, "Null targetState values are not permitted");

        return forCertificateAuthority(
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
                    GetCertificateAuthorityRequest, GetCertificateAuthorityResponse>
            forCertificateAuthority(
                    GetCertificateAuthorityRequest request,
                    com.oracle.bmc.certificatesmanagement.model.CertificateAuthorityLifecycleState
                            targetState,
                    com.oracle.bmc.waiter.TerminationStrategy terminationStrategy,
                    com.oracle.bmc.waiter.DelayStrategy delayStrategy) {
        com.oracle.bmc.util.internal.Validate.notNull(
                targetState, "The targetState cannot be null");

        return forCertificateAuthority(
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
                    GetCertificateAuthorityRequest, GetCertificateAuthorityResponse>
            forCertificateAuthority(
                    GetCertificateAuthorityRequest request,
                    com.oracle.bmc.waiter.TerminationStrategy terminationStrategy,
                    com.oracle.bmc.waiter.DelayStrategy delayStrategy,
                    com.oracle.bmc.certificatesmanagement.model
                                    .CertificateAuthorityLifecycleState...
                            targetStates) {
        com.oracle.bmc.util.internal.Validate.notEmpty(
                targetStates, "At least one targetState must be provided");
        com.oracle.bmc.util.internal.Validate.noNullElements(
                targetStates, "Null targetState values are not permitted");

        return forCertificateAuthority(
                com.oracle.bmc.waiter.Waiters.newWaiter(terminationStrategy, delayStrategy),
                request,
                targetStates);
    }

    // Helper method to create a new Waiter for CertificateAuthority.
    private com.oracle.bmc.waiter.Waiter<
                    GetCertificateAuthorityRequest, GetCertificateAuthorityResponse>
            forCertificateAuthority(
                    com.oracle.bmc.waiter.BmcGenericWaiter waiter,
                    final GetCertificateAuthorityRequest request,
                    final com.oracle.bmc.certificatesmanagement.model
                                    .CertificateAuthorityLifecycleState...
                            targetStates) {
        final java.util.Set<
                        com.oracle.bmc.certificatesmanagement.model
                                .CertificateAuthorityLifecycleState>
                targetStatesSet = new java.util.HashSet<>(java.util.Arrays.asList(targetStates));

        return new com.oracle.bmc.waiter.internal.SimpleWaiterImpl<>(
                executorService,
                waiter.toCallable(
                        () -> request,
                        new java.util.function.Function<
                                GetCertificateAuthorityRequest, GetCertificateAuthorityResponse>() {
                            @Override
                            public GetCertificateAuthorityResponse apply(
                                    GetCertificateAuthorityRequest request) {
                                return client.getCertificateAuthority(request);
                            }
                        },
                        new java.util.function.Predicate<GetCertificateAuthorityResponse>() {
                            @Override
                            public boolean test(GetCertificateAuthorityResponse response) {
                                return targetStatesSet.contains(
                                        response.getCertificateAuthority().getLifecycleState());
                            }
                        },
                        targetStatesSet.contains(
                                com.oracle.bmc.certificatesmanagement.model
                                        .CertificateAuthorityLifecycleState.Deleted)),
                request);
    }
}
