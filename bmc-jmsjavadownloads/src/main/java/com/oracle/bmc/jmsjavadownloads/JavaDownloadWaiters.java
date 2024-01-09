/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.jmsjavadownloads;

import com.oracle.bmc.jmsjavadownloads.requests.*;
import com.oracle.bmc.jmsjavadownloads.responses.*;

/**
 * Collection of helper methods to produce {@link com.oracle.bmc.waiter.Waiter}s for different
 * resources of JavaDownload.
 *
 * <p>The default configuration used is defined by {@link
 * com.oracle.bmc.waiter.Waiters.Waiters#DEFAULT_POLLING_WAITER}.
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20230601")
public class JavaDownloadWaiters {
    private final java.util.concurrent.ExecutorService executorService;
    private final JavaDownload client;

    public JavaDownloadWaiters(
            java.util.concurrent.ExecutorService executorService, JavaDownload client) {
        this.executorService = executorService;
        this.client = client;
    }

    /**
     * Creates a new {@link com.oracle.bmc.waiter.Waiter} using the default configuration.
     *
     * @param request the request to send
     * @param targetState the desired states to wait for. If multiple states are provided then the
     *     waiter will return once the resource reaches any of the provided states
     * @return a new {@code com.oracle.bmc.waiter.Waiter} instance
     */
    public com.oracle.bmc.waiter.Waiter<GetJavaDownloadReportRequest, GetJavaDownloadReportResponse>
            forJavaDownloadReport(
                    GetJavaDownloadReportRequest request,
                    com.oracle.bmc.jmsjavadownloads.model.LifecycleState... targetStates) {
        com.oracle.bmc.util.internal.Validate.notEmpty(
                targetStates, "At least one targetState must be provided");
        com.oracle.bmc.util.internal.Validate.noNullElements(
                targetStates, "Null targetState values are not permitted");

        return forJavaDownloadReport(
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
    public com.oracle.bmc.waiter.Waiter<GetJavaDownloadReportRequest, GetJavaDownloadReportResponse>
            forJavaDownloadReport(
                    GetJavaDownloadReportRequest request,
                    com.oracle.bmc.jmsjavadownloads.model.LifecycleState targetState,
                    com.oracle.bmc.waiter.TerminationStrategy terminationStrategy,
                    com.oracle.bmc.waiter.DelayStrategy delayStrategy) {
        com.oracle.bmc.util.internal.Validate.notNull(
                targetState, "The targetState cannot be null");

        return forJavaDownloadReport(
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
     * @return a new {@code Waiter} instance
     */
    public com.oracle.bmc.waiter.Waiter<GetJavaDownloadReportRequest, GetJavaDownloadReportResponse>
            forJavaDownloadReport(
                    GetJavaDownloadReportRequest request,
                    com.oracle.bmc.waiter.TerminationStrategy terminationStrategy,
                    com.oracle.bmc.waiter.DelayStrategy delayStrategy,
                    com.oracle.bmc.jmsjavadownloads.model.LifecycleState... targetStates) {
        com.oracle.bmc.util.internal.Validate.notEmpty(
                targetStates, "At least one targetState must be provided");
        com.oracle.bmc.util.internal.Validate.noNullElements(
                targetStates, "Null targetState values are not permitted");

        return forJavaDownloadReport(
                com.oracle.bmc.waiter.Waiters.newWaiter(terminationStrategy, delayStrategy),
                request,
                targetStates);
    }

    // Helper method to create a new Waiter for JavaDownloadReport.
    private com.oracle.bmc.waiter.Waiter<
                    GetJavaDownloadReportRequest, GetJavaDownloadReportResponse>
            forJavaDownloadReport(
                    com.oracle.bmc.waiter.BmcGenericWaiter waiter,
                    final GetJavaDownloadReportRequest request,
                    final com.oracle.bmc.jmsjavadownloads.model.LifecycleState... targetStates) {
        final java.util.Set<com.oracle.bmc.jmsjavadownloads.model.LifecycleState> targetStatesSet =
                new java.util.HashSet<>(java.util.Arrays.asList(targetStates));

        return new com.oracle.bmc.waiter.internal.SimpleWaiterImpl<>(
                executorService,
                waiter.toCallable(
                        () -> request,
                        new java.util.function.Function<
                                GetJavaDownloadReportRequest, GetJavaDownloadReportResponse>() {
                            @Override
                            public GetJavaDownloadReportResponse apply(
                                    GetJavaDownloadReportRequest request) {
                                return client.getJavaDownloadReport(request);
                            }
                        },
                        new java.util.function.Predicate<GetJavaDownloadReportResponse>() {
                            @Override
                            public boolean test(GetJavaDownloadReportResponse response) {
                                return targetStatesSet.contains(
                                        response.getJavaDownloadReport().getLifecycleState());
                            }
                        },
                        targetStatesSet.contains(
                                com.oracle.bmc.jmsjavadownloads.model.LifecycleState.Deleted)),
                request);
    }

    /**
     * Creates a new {@link com.oracle.bmc.waiter.Waiter} using the default configuration.
     *
     * @param request the request to send
     * @param targetState the desired states to wait for. If multiple states are provided then the
     *     waiter will return once the resource reaches any of the provided states
     * @return a new {@code com.oracle.bmc.waiter.Waiter} instance
     */
    public com.oracle.bmc.waiter.Waiter<GetJavaDownloadTokenRequest, GetJavaDownloadTokenResponse>
            forJavaDownloadToken(
                    GetJavaDownloadTokenRequest request,
                    com.oracle.bmc.jmsjavadownloads.model.LifecycleState... targetStates) {
        com.oracle.bmc.util.internal.Validate.notEmpty(
                targetStates, "At least one targetState must be provided");
        com.oracle.bmc.util.internal.Validate.noNullElements(
                targetStates, "Null targetState values are not permitted");

        return forJavaDownloadToken(
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
    public com.oracle.bmc.waiter.Waiter<GetJavaDownloadTokenRequest, GetJavaDownloadTokenResponse>
            forJavaDownloadToken(
                    GetJavaDownloadTokenRequest request,
                    com.oracle.bmc.jmsjavadownloads.model.LifecycleState targetState,
                    com.oracle.bmc.waiter.TerminationStrategy terminationStrategy,
                    com.oracle.bmc.waiter.DelayStrategy delayStrategy) {
        com.oracle.bmc.util.internal.Validate.notNull(
                targetState, "The targetState cannot be null");

        return forJavaDownloadToken(
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
     * @return a new {@code Waiter} instance
     */
    public com.oracle.bmc.waiter.Waiter<GetJavaDownloadTokenRequest, GetJavaDownloadTokenResponse>
            forJavaDownloadToken(
                    GetJavaDownloadTokenRequest request,
                    com.oracle.bmc.waiter.TerminationStrategy terminationStrategy,
                    com.oracle.bmc.waiter.DelayStrategy delayStrategy,
                    com.oracle.bmc.jmsjavadownloads.model.LifecycleState... targetStates) {
        com.oracle.bmc.util.internal.Validate.notEmpty(
                targetStates, "At least one targetState must be provided");
        com.oracle.bmc.util.internal.Validate.noNullElements(
                targetStates, "Null targetState values are not permitted");

        return forJavaDownloadToken(
                com.oracle.bmc.waiter.Waiters.newWaiter(terminationStrategy, delayStrategy),
                request,
                targetStates);
    }

    // Helper method to create a new Waiter for JavaDownloadToken.
    private com.oracle.bmc.waiter.Waiter<GetJavaDownloadTokenRequest, GetJavaDownloadTokenResponse>
            forJavaDownloadToken(
                    com.oracle.bmc.waiter.BmcGenericWaiter waiter,
                    final GetJavaDownloadTokenRequest request,
                    final com.oracle.bmc.jmsjavadownloads.model.LifecycleState... targetStates) {
        final java.util.Set<com.oracle.bmc.jmsjavadownloads.model.LifecycleState> targetStatesSet =
                new java.util.HashSet<>(java.util.Arrays.asList(targetStates));

        return new com.oracle.bmc.waiter.internal.SimpleWaiterImpl<>(
                executorService,
                waiter.toCallable(
                        () -> request,
                        new java.util.function.Function<
                                GetJavaDownloadTokenRequest, GetJavaDownloadTokenResponse>() {
                            @Override
                            public GetJavaDownloadTokenResponse apply(
                                    GetJavaDownloadTokenRequest request) {
                                return client.getJavaDownloadToken(request);
                            }
                        },
                        new java.util.function.Predicate<GetJavaDownloadTokenResponse>() {
                            @Override
                            public boolean test(GetJavaDownloadTokenResponse response) {
                                return targetStatesSet.contains(
                                        response.getJavaDownloadToken().getLifecycleState());
                            }
                        },
                        targetStatesSet.contains(
                                com.oracle.bmc.jmsjavadownloads.model.LifecycleState.Deleted)),
                request);
    }

    /**
     * Creates a new {@link com.oracle.bmc.waiter.Waiter} using the default configuration.
     *
     * @param request the request to send
     * @param targetState the desired states to wait for. If multiple states are provided then the
     *     waiter will return once the resource reaches any of the provided states
     * @return a new {@code com.oracle.bmc.waiter.Waiter} instance
     */
    public com.oracle.bmc.waiter.Waiter<
                    GetJavaLicenseAcceptanceRecordRequest, GetJavaLicenseAcceptanceRecordResponse>
            forJavaLicenseAcceptanceRecord(
                    GetJavaLicenseAcceptanceRecordRequest request,
                    com.oracle.bmc.jmsjavadownloads.model.LifecycleState... targetStates) {
        com.oracle.bmc.util.internal.Validate.notEmpty(
                targetStates, "At least one targetState must be provided");
        com.oracle.bmc.util.internal.Validate.noNullElements(
                targetStates, "Null targetState values are not permitted");

        return forJavaLicenseAcceptanceRecord(
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
                    GetJavaLicenseAcceptanceRecordRequest, GetJavaLicenseAcceptanceRecordResponse>
            forJavaLicenseAcceptanceRecord(
                    GetJavaLicenseAcceptanceRecordRequest request,
                    com.oracle.bmc.jmsjavadownloads.model.LifecycleState targetState,
                    com.oracle.bmc.waiter.TerminationStrategy terminationStrategy,
                    com.oracle.bmc.waiter.DelayStrategy delayStrategy) {
        com.oracle.bmc.util.internal.Validate.notNull(
                targetState, "The targetState cannot be null");

        return forJavaLicenseAcceptanceRecord(
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
     * @return a new {@code Waiter} instance
     */
    public com.oracle.bmc.waiter.Waiter<
                    GetJavaLicenseAcceptanceRecordRequest, GetJavaLicenseAcceptanceRecordResponse>
            forJavaLicenseAcceptanceRecord(
                    GetJavaLicenseAcceptanceRecordRequest request,
                    com.oracle.bmc.waiter.TerminationStrategy terminationStrategy,
                    com.oracle.bmc.waiter.DelayStrategy delayStrategy,
                    com.oracle.bmc.jmsjavadownloads.model.LifecycleState... targetStates) {
        com.oracle.bmc.util.internal.Validate.notEmpty(
                targetStates, "At least one targetState must be provided");
        com.oracle.bmc.util.internal.Validate.noNullElements(
                targetStates, "Null targetState values are not permitted");

        return forJavaLicenseAcceptanceRecord(
                com.oracle.bmc.waiter.Waiters.newWaiter(terminationStrategy, delayStrategy),
                request,
                targetStates);
    }

    // Helper method to create a new Waiter for JavaLicenseAcceptanceRecord.
    private com.oracle.bmc.waiter.Waiter<
                    GetJavaLicenseAcceptanceRecordRequest, GetJavaLicenseAcceptanceRecordResponse>
            forJavaLicenseAcceptanceRecord(
                    com.oracle.bmc.waiter.BmcGenericWaiter waiter,
                    final GetJavaLicenseAcceptanceRecordRequest request,
                    final com.oracle.bmc.jmsjavadownloads.model.LifecycleState... targetStates) {
        final java.util.Set<com.oracle.bmc.jmsjavadownloads.model.LifecycleState> targetStatesSet =
                new java.util.HashSet<>(java.util.Arrays.asList(targetStates));

        return new com.oracle.bmc.waiter.internal.SimpleWaiterImpl<>(
                executorService,
                waiter.toCallable(
                        () -> request,
                        new java.util.function.Function<
                                GetJavaLicenseAcceptanceRecordRequest,
                                GetJavaLicenseAcceptanceRecordResponse>() {
                            @Override
                            public GetJavaLicenseAcceptanceRecordResponse apply(
                                    GetJavaLicenseAcceptanceRecordRequest request) {
                                return client.getJavaLicenseAcceptanceRecord(request);
                            }
                        },
                        new java.util.function.Predicate<GetJavaLicenseAcceptanceRecordResponse>() {
                            @Override
                            public boolean test(GetJavaLicenseAcceptanceRecordResponse response) {
                                return targetStatesSet.contains(
                                        response.getJavaLicenseAcceptanceRecord()
                                                .getLifecycleState());
                            }
                        },
                        targetStatesSet.contains(
                                com.oracle.bmc.jmsjavadownloads.model.LifecycleState.Deleted)),
                request);
    }

    /**
     * Creates a new {@link com.oracle.bmc.waiter.Waiter} using default configuration.
     *
     * @param request the request to send
     * @return a new {@code Waiter} instance
     */
    public com.oracle.bmc.waiter.Waiter<GetWorkRequestRequest, GetWorkRequestResponse>
            forWorkRequest(GetWorkRequestRequest request) {
        return forWorkRequest(com.oracle.bmc.waiter.Waiters.DEFAULT_POLLING_WAITER, request);
    }

    /**
     * Creates a new {@link com.oracle.bmc.waiter.Waiter} using the provided configuration.
     *
     * @param request the request to send
     * @param terminationStrategy the {@link com.oracle.bmc.waiter.TerminationStrategy} to use
     * @param delayStrategy the {@linkcom.oracle.bmc.waiter. DelayStrategy} to use
     * @return a new {@code com.oracle.bmc.waiter.Waiter} instance
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
                        () -> request,
                        new java.util.function.Function<
                                GetWorkRequestRequest, GetWorkRequestResponse>() {
                            @Override
                            public GetWorkRequestResponse apply(GetWorkRequestRequest request) {
                                return client.getWorkRequest(request);
                            }
                        },
                        new java.util.function.Predicate<GetWorkRequestResponse>() {
                            @Override
                            public boolean test(GetWorkRequestResponse response) {
                                // work requests are complete once the time finished is available
                                return response.getWorkRequest().getTimeFinished() != null;
                            }
                        },
                        false),
                request);
    }
}
