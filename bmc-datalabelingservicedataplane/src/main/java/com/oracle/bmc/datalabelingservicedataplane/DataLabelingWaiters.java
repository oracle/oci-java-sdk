/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.datalabelingservicedataplane;

import com.oracle.bmc.datalabelingservicedataplane.requests.*;
import com.oracle.bmc.datalabelingservicedataplane.responses.*;

/**
 * Collection of helper methods to produce {@link com.oracle.bmc.waiter.Waiter}s for different
 * resources of DataLabeling.
 * <p>
 * The default configuration used is defined by {@link com.oracle.bmc.waiter.Waiters.Waiters#DEFAULT_POLLING_WAITER}.
 */
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20211001")
public class DataLabelingWaiters {
    private final java.util.concurrent.ExecutorService executorService;
    private final DataLabeling client;

    public DataLabelingWaiters(
            java.util.concurrent.ExecutorService executorService, DataLabeling client) {
        this.executorService = executorService;
        this.client = client;
    }

    /**
     * Creates a new {@link com.oracle.bmc.waiter.Waiter} using the default configuration.
     *
     * @param request the request to send
     * @param targetStates the desired states to wait for. If multiple states are provided then the waiter will return once the resource reaches any of the provided states
     * @return a new {@code Waiter} instance
     */
    public com.oracle.bmc.waiter.Waiter<GetAnnotationRequest, GetAnnotationResponse> forAnnotation(
            GetAnnotationRequest request,
            com.oracle.bmc.datalabelingservicedataplane.model.Annotation.LifecycleState...
                    targetStates) {
        com.oracle.bmc.util.internal.Validate.notEmpty(
                targetStates, "At least one targetState must be provided");
        com.oracle.bmc.util.internal.Validate.noNullElements(
                targetStates, "Null targetState values are not permitted");

        return forAnnotation(
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
    public com.oracle.bmc.waiter.Waiter<GetAnnotationRequest, GetAnnotationResponse> forAnnotation(
            GetAnnotationRequest request,
            com.oracle.bmc.datalabelingservicedataplane.model.Annotation.LifecycleState targetState,
            com.oracle.bmc.waiter.TerminationStrategy terminationStrategy,
            com.oracle.bmc.waiter.DelayStrategy delayStrategy) {
        com.oracle.bmc.util.internal.Validate.notNull(
                targetState, "The targetState cannot be null");

        return forAnnotation(
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
    public com.oracle.bmc.waiter.Waiter<GetAnnotationRequest, GetAnnotationResponse> forAnnotation(
            GetAnnotationRequest request,
            com.oracle.bmc.waiter.TerminationStrategy terminationStrategy,
            com.oracle.bmc.waiter.DelayStrategy delayStrategy,
            com.oracle.bmc.datalabelingservicedataplane.model.Annotation.LifecycleState...
                    targetStates) {
        com.oracle.bmc.util.internal.Validate.notEmpty(
                targetStates, "At least one target state must be provided");
        com.oracle.bmc.util.internal.Validate.noNullElements(
                targetStates, "Null target states are not permitted");

        return forAnnotation(
                com.oracle.bmc.waiter.Waiters.newWaiter(terminationStrategy, delayStrategy),
                request,
                targetStates);
    }

    // Helper method to create a new Waiter for Annotation.
    private com.oracle.bmc.waiter.Waiter<GetAnnotationRequest, GetAnnotationResponse> forAnnotation(
            com.oracle.bmc.waiter.BmcGenericWaiter waiter,
            final GetAnnotationRequest request,
            final com.oracle.bmc.datalabelingservicedataplane.model.Annotation.LifecycleState...
                    targetStates) {
        final java.util.Set<
                        com.oracle.bmc.datalabelingservicedataplane.model.Annotation.LifecycleState>
                targetStatesSet = new java.util.HashSet<>(java.util.Arrays.asList(targetStates));

        return new com.oracle.bmc.waiter.internal.SimpleWaiterImpl<>(
                executorService,
                waiter.toCallable(
                        () -> request,
                        new java.util.function.Function<
                                GetAnnotationRequest, GetAnnotationResponse>() {
                            @Override
                            public GetAnnotationResponse apply(GetAnnotationRequest request) {
                                return client.getAnnotation(request);
                            }
                        },
                        new java.util.function.Predicate<GetAnnotationResponse>() {
                            @Override
                            public boolean test(GetAnnotationResponse response) {
                                return targetStatesSet.contains(
                                        response.getAnnotation().getLifecycleState());
                            }
                        },
                        targetStatesSet.contains(
                                com.oracle.bmc.datalabelingservicedataplane.model.Annotation
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
    public com.oracle.bmc.waiter.Waiter<GetDatasetRequest, GetDatasetResponse> forDataset(
            GetDatasetRequest request,
            com.oracle.bmc.datalabelingservicedataplane.model.Dataset.LifecycleState...
                    targetStates) {
        com.oracle.bmc.util.internal.Validate.notEmpty(
                targetStates, "At least one targetState must be provided");
        com.oracle.bmc.util.internal.Validate.noNullElements(
                targetStates, "Null targetState values are not permitted");

        return forDataset(
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
    public com.oracle.bmc.waiter.Waiter<GetDatasetRequest, GetDatasetResponse> forDataset(
            GetDatasetRequest request,
            com.oracle.bmc.datalabelingservicedataplane.model.Dataset.LifecycleState targetState,
            com.oracle.bmc.waiter.TerminationStrategy terminationStrategy,
            com.oracle.bmc.waiter.DelayStrategy delayStrategy) {
        com.oracle.bmc.util.internal.Validate.notNull(
                targetState, "The targetState cannot be null");

        return forDataset(
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
    public com.oracle.bmc.waiter.Waiter<GetDatasetRequest, GetDatasetResponse> forDataset(
            GetDatasetRequest request,
            com.oracle.bmc.waiter.TerminationStrategy terminationStrategy,
            com.oracle.bmc.waiter.DelayStrategy delayStrategy,
            com.oracle.bmc.datalabelingservicedataplane.model.Dataset.LifecycleState...
                    targetStates) {
        com.oracle.bmc.util.internal.Validate.notEmpty(
                targetStates, "At least one target state must be provided");
        com.oracle.bmc.util.internal.Validate.noNullElements(
                targetStates, "Null target states are not permitted");

        return forDataset(
                com.oracle.bmc.waiter.Waiters.newWaiter(terminationStrategy, delayStrategy),
                request,
                targetStates);
    }

    // Helper method to create a new Waiter for Dataset.
    private com.oracle.bmc.waiter.Waiter<GetDatasetRequest, GetDatasetResponse> forDataset(
            com.oracle.bmc.waiter.BmcGenericWaiter waiter,
            final GetDatasetRequest request,
            final com.oracle.bmc.datalabelingservicedataplane.model.Dataset.LifecycleState...
                    targetStates) {
        final java.util.Set<
                        com.oracle.bmc.datalabelingservicedataplane.model.Dataset.LifecycleState>
                targetStatesSet = new java.util.HashSet<>(java.util.Arrays.asList(targetStates));

        return new com.oracle.bmc.waiter.internal.SimpleWaiterImpl<>(
                executorService,
                waiter.toCallable(
                        () -> request,
                        new java.util.function.Function<GetDatasetRequest, GetDatasetResponse>() {
                            @Override
                            public GetDatasetResponse apply(GetDatasetRequest request) {
                                return client.getDataset(request);
                            }
                        },
                        new java.util.function.Predicate<GetDatasetResponse>() {
                            @Override
                            public boolean test(GetDatasetResponse response) {
                                return targetStatesSet.contains(
                                        response.getDataset().getLifecycleState());
                            }
                        },
                        targetStatesSet.contains(
                                com.oracle.bmc.datalabelingservicedataplane.model.Dataset
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
    public com.oracle.bmc.waiter.Waiter<GetRecordRequest, GetRecordResponse> forRecord(
            GetRecordRequest request,
            com.oracle.bmc.datalabelingservicedataplane.model.Record.LifecycleState...
                    targetStates) {
        com.oracle.bmc.util.internal.Validate.notEmpty(
                targetStates, "At least one targetState must be provided");
        com.oracle.bmc.util.internal.Validate.noNullElements(
                targetStates, "Null targetState values are not permitted");

        return forRecord(
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
    public com.oracle.bmc.waiter.Waiter<GetRecordRequest, GetRecordResponse> forRecord(
            GetRecordRequest request,
            com.oracle.bmc.datalabelingservicedataplane.model.Record.LifecycleState targetState,
            com.oracle.bmc.waiter.TerminationStrategy terminationStrategy,
            com.oracle.bmc.waiter.DelayStrategy delayStrategy) {
        com.oracle.bmc.util.internal.Validate.notNull(
                targetState, "The targetState cannot be null");

        return forRecord(
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
    public com.oracle.bmc.waiter.Waiter<GetRecordRequest, GetRecordResponse> forRecord(
            GetRecordRequest request,
            com.oracle.bmc.waiter.TerminationStrategy terminationStrategy,
            com.oracle.bmc.waiter.DelayStrategy delayStrategy,
            com.oracle.bmc.datalabelingservicedataplane.model.Record.LifecycleState...
                    targetStates) {
        com.oracle.bmc.util.internal.Validate.notEmpty(
                targetStates, "At least one target state must be provided");
        com.oracle.bmc.util.internal.Validate.noNullElements(
                targetStates, "Null target states are not permitted");

        return forRecord(
                com.oracle.bmc.waiter.Waiters.newWaiter(terminationStrategy, delayStrategy),
                request,
                targetStates);
    }

    // Helper method to create a new Waiter for Record.
    private com.oracle.bmc.waiter.Waiter<GetRecordRequest, GetRecordResponse> forRecord(
            com.oracle.bmc.waiter.BmcGenericWaiter waiter,
            final GetRecordRequest request,
            final com.oracle.bmc.datalabelingservicedataplane.model.Record.LifecycleState...
                    targetStates) {
        final java.util.Set<com.oracle.bmc.datalabelingservicedataplane.model.Record.LifecycleState>
                targetStatesSet = new java.util.HashSet<>(java.util.Arrays.asList(targetStates));

        return new com.oracle.bmc.waiter.internal.SimpleWaiterImpl<>(
                executorService,
                waiter.toCallable(
                        () -> request,
                        new java.util.function.Function<GetRecordRequest, GetRecordResponse>() {
                            @Override
                            public GetRecordResponse apply(GetRecordRequest request) {
                                return client.getRecord(request);
                            }
                        },
                        new java.util.function.Predicate<GetRecordResponse>() {
                            @Override
                            public boolean test(GetRecordResponse response) {
                                return targetStatesSet.contains(
                                        response.getRecord().getLifecycleState());
                            }
                        },
                        targetStatesSet.contains(
                                com.oracle.bmc.datalabelingservicedataplane.model.Record
                                        .LifecycleState.Deleted)),
                request);
    }
}
