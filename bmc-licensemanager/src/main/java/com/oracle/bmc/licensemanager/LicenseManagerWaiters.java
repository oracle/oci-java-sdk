/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.licensemanager;

import com.oracle.bmc.licensemanager.requests.*;
import com.oracle.bmc.licensemanager.responses.*;
import javax.annotation.Nonnull;

/**
 * Collection of helper methods to produce {@link com.oracle.bmc.waiter.Waiter}s for different
 * resources of LicenseManager.
 * <p>
 * The default configuration used is defined by {@link com.oracle.bmc.waiter.Waiters.Waiters#DEFAULT_POLLING_WAITER}.
 */
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20220430")
public class LicenseManagerWaiters {
    private final java.util.concurrent.ExecutorService executorService;
    private final LicenseManager client;

    public LicenseManagerWaiters(
            java.util.concurrent.ExecutorService executorService, LicenseManager client) {
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
    public com.oracle.bmc.waiter.Waiter<GetLicenseRecordRequest, GetLicenseRecordResponse>
            forLicenseRecord(
                    GetLicenseRecordRequest request,
                    com.oracle.bmc.licensemanager.model.LifeCycleState... targetStates) {
        org.apache.commons.lang3.Validate.notEmpty(
                targetStates, "At least one targetState must be provided");
        org.apache.commons.lang3.Validate.noNullElements(
                targetStates, "Null targetState values are not permitted");

        return forLicenseRecord(
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
    public com.oracle.bmc.waiter.Waiter<GetLicenseRecordRequest, GetLicenseRecordResponse>
            forLicenseRecord(
                    GetLicenseRecordRequest request,
                    com.oracle.bmc.licensemanager.model.LifeCycleState targetState,
                    com.oracle.bmc.waiter.TerminationStrategy terminationStrategy,
                    com.oracle.bmc.waiter.DelayStrategy delayStrategy) {
        org.apache.commons.lang3.Validate.notNull(targetState, "The targetState cannot be null");

        return forLicenseRecord(
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
    public com.oracle.bmc.waiter.Waiter<GetLicenseRecordRequest, GetLicenseRecordResponse>
            forLicenseRecord(
                    GetLicenseRecordRequest request,
                    com.oracle.bmc.waiter.TerminationStrategy terminationStrategy,
                    com.oracle.bmc.waiter.DelayStrategy delayStrategy,
                    com.oracle.bmc.licensemanager.model.LifeCycleState... targetStates) {
        org.apache.commons.lang3.Validate.notEmpty(
                targetStates, "At least one targetState must be provided");
        org.apache.commons.lang3.Validate.noNullElements(
                targetStates, "Null targetState values are not permitted");

        return forLicenseRecord(
                com.oracle.bmc.waiter.Waiters.newWaiter(terminationStrategy, delayStrategy),
                request,
                targetStates);
    }

    // Helper method to create a new Waiter for LicenseRecord.
    private com.oracle.bmc.waiter.Waiter<GetLicenseRecordRequest, GetLicenseRecordResponse>
            forLicenseRecord(
                    com.oracle.bmc.waiter.BmcGenericWaiter waiter,
                    final GetLicenseRecordRequest request,
                    final com.oracle.bmc.licensemanager.model.LifeCycleState... targetStates) {
        final java.util.Set<com.oracle.bmc.licensemanager.model.LifeCycleState> targetStatesSet =
                new java.util.HashSet<>(java.util.Arrays.asList(targetStates));

        return new com.oracle.bmc.waiter.internal.SimpleWaiterImpl<>(
                executorService,
                waiter.toCallable(
                        com.google.common.base.Suppliers.ofInstance(request),
                        new com.google.common.base.Function<
                                GetLicenseRecordRequest, GetLicenseRecordResponse>() {
                            @Override
                            public GetLicenseRecordResponse apply(GetLicenseRecordRequest request) {
                                return client.getLicenseRecord(request);
                            }
                        },
                        new com.google.common.base.Predicate<GetLicenseRecordResponse>() {
                            @Override
                            public boolean apply(GetLicenseRecordResponse response) {
                                return targetStatesSet.contains(
                                        response.getLicenseRecord().getLifecycleState());
                            }
                        },
                        targetStatesSet.contains(
                                com.oracle.bmc.licensemanager.model.LifeCycleState.Deleted)),
                request);
    }

    /**
     * Creates a new {@link com.oracle.bmc.waiter.Waiter} using the default configuration.
     *
     * @param request the request to send
     * @param targetState the desired states to wait for. If multiple states are provided then the waiter will return once the resource reaches any of the provided states
     * @return a new {@code com.oracle.bmc.waiter.Waiter} instance
     */
    public com.oracle.bmc.waiter.Waiter<GetProductLicenseRequest, GetProductLicenseResponse>
            forProductLicense(
                    GetProductLicenseRequest request,
                    com.oracle.bmc.licensemanager.model.LifeCycleState... targetStates) {
        org.apache.commons.lang3.Validate.notEmpty(
                targetStates, "At least one targetState must be provided");
        org.apache.commons.lang3.Validate.noNullElements(
                targetStates, "Null targetState values are not permitted");

        return forProductLicense(
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
    public com.oracle.bmc.waiter.Waiter<GetProductLicenseRequest, GetProductLicenseResponse>
            forProductLicense(
                    GetProductLicenseRequest request,
                    com.oracle.bmc.licensemanager.model.LifeCycleState targetState,
                    com.oracle.bmc.waiter.TerminationStrategy terminationStrategy,
                    com.oracle.bmc.waiter.DelayStrategy delayStrategy) {
        org.apache.commons.lang3.Validate.notNull(targetState, "The targetState cannot be null");

        return forProductLicense(
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
    public com.oracle.bmc.waiter.Waiter<GetProductLicenseRequest, GetProductLicenseResponse>
            forProductLicense(
                    GetProductLicenseRequest request,
                    com.oracle.bmc.waiter.TerminationStrategy terminationStrategy,
                    com.oracle.bmc.waiter.DelayStrategy delayStrategy,
                    com.oracle.bmc.licensemanager.model.LifeCycleState... targetStates) {
        org.apache.commons.lang3.Validate.notEmpty(
                targetStates, "At least one targetState must be provided");
        org.apache.commons.lang3.Validate.noNullElements(
                targetStates, "Null targetState values are not permitted");

        return forProductLicense(
                com.oracle.bmc.waiter.Waiters.newWaiter(terminationStrategy, delayStrategy),
                request,
                targetStates);
    }

    // Helper method to create a new Waiter for ProductLicense.
    private com.oracle.bmc.waiter.Waiter<GetProductLicenseRequest, GetProductLicenseResponse>
            forProductLicense(
                    com.oracle.bmc.waiter.BmcGenericWaiter waiter,
                    final GetProductLicenseRequest request,
                    final com.oracle.bmc.licensemanager.model.LifeCycleState... targetStates) {
        final java.util.Set<com.oracle.bmc.licensemanager.model.LifeCycleState> targetStatesSet =
                new java.util.HashSet<>(java.util.Arrays.asList(targetStates));

        return new com.oracle.bmc.waiter.internal.SimpleWaiterImpl<>(
                executorService,
                waiter.toCallable(
                        com.google.common.base.Suppliers.ofInstance(request),
                        new com.google.common.base.Function<
                                GetProductLicenseRequest, GetProductLicenseResponse>() {
                            @Override
                            public GetProductLicenseResponse apply(
                                    GetProductLicenseRequest request) {
                                return client.getProductLicense(request);
                            }
                        },
                        new com.google.common.base.Predicate<GetProductLicenseResponse>() {
                            @Override
                            public boolean apply(GetProductLicenseResponse response) {
                                return targetStatesSet.contains(
                                        response.getProductLicense().getLifecycleState());
                            }
                        },
                        targetStatesSet.contains(
                                com.oracle.bmc.licensemanager.model.LifeCycleState.Deleted)),
                request);
    }
}
