/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.datascience;

import com.oracle.bmc.datascience.requests.*;
import com.oracle.bmc.datascience.responses.*;

/**
 * Collection of helper methods to produce {@link com.oracle.bmc.waiter.Waiter}s for different
 * resources of DataScience.
 *
 * <p>The default configuration used is defined by {@link
 * com.oracle.bmc.waiter.Waiters.Waiters#DEFAULT_POLLING_WAITER}.
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20190101")
public class DataScienceWaiters {
    private final java.util.concurrent.ExecutorService executorService;
    private final DataScience client;

    public DataScienceWaiters(
            java.util.concurrent.ExecutorService executorService, DataScience client) {
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
    public com.oracle.bmc.waiter.Waiter<
                    GetDataSciencePrivateEndpointRequest, GetDataSciencePrivateEndpointResponse>
            forDataSciencePrivateEndpoint(
                    GetDataSciencePrivateEndpointRequest request,
                    com.oracle.bmc.datascience.model.DataSciencePrivateEndpointLifecycleState...
                            targetStates) {
        com.oracle.bmc.util.internal.Validate.notEmpty(
                targetStates, "At least one targetState must be provided");
        com.oracle.bmc.util.internal.Validate.noNullElements(
                targetStates, "Null targetState values are not permitted");

        return forDataSciencePrivateEndpoint(
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
                    GetDataSciencePrivateEndpointRequest, GetDataSciencePrivateEndpointResponse>
            forDataSciencePrivateEndpoint(
                    GetDataSciencePrivateEndpointRequest request,
                    com.oracle.bmc.datascience.model.DataSciencePrivateEndpointLifecycleState
                            targetState,
                    com.oracle.bmc.waiter.TerminationStrategy terminationStrategy,
                    com.oracle.bmc.waiter.DelayStrategy delayStrategy) {
        com.oracle.bmc.util.internal.Validate.notNull(
                targetState, "The targetState cannot be null");

        return forDataSciencePrivateEndpoint(
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
                    GetDataSciencePrivateEndpointRequest, GetDataSciencePrivateEndpointResponse>
            forDataSciencePrivateEndpoint(
                    GetDataSciencePrivateEndpointRequest request,
                    com.oracle.bmc.waiter.TerminationStrategy terminationStrategy,
                    com.oracle.bmc.waiter.DelayStrategy delayStrategy,
                    com.oracle.bmc.datascience.model.DataSciencePrivateEndpointLifecycleState...
                            targetStates) {
        com.oracle.bmc.util.internal.Validate.notEmpty(
                targetStates, "At least one targetState must be provided");
        com.oracle.bmc.util.internal.Validate.noNullElements(
                targetStates, "Null targetState values are not permitted");

        return forDataSciencePrivateEndpoint(
                com.oracle.bmc.waiter.Waiters.newWaiter(terminationStrategy, delayStrategy),
                request,
                targetStates);
    }

    // Helper method to create a new Waiter for DataSciencePrivateEndpoint.
    private com.oracle.bmc.waiter.Waiter<
                    GetDataSciencePrivateEndpointRequest, GetDataSciencePrivateEndpointResponse>
            forDataSciencePrivateEndpoint(
                    com.oracle.bmc.waiter.BmcGenericWaiter waiter,
                    final GetDataSciencePrivateEndpointRequest request,
                    final com.oracle.bmc.datascience.model.DataSciencePrivateEndpointLifecycleState
                                    ...
                            targetStates) {
        final java.util.Set<
                        com.oracle.bmc.datascience.model.DataSciencePrivateEndpointLifecycleState>
                targetStatesSet = new java.util.HashSet<>(java.util.Arrays.asList(targetStates));

        return new com.oracle.bmc.waiter.internal.SimpleWaiterImpl<>(
                executorService,
                waiter.toCallable(
                        () -> request,
                        new java.util.function.Function<
                                GetDataSciencePrivateEndpointRequest,
                                GetDataSciencePrivateEndpointResponse>() {
                            @Override
                            public GetDataSciencePrivateEndpointResponse apply(
                                    GetDataSciencePrivateEndpointRequest request) {
                                return client.getDataSciencePrivateEndpoint(request);
                            }
                        },
                        new java.util.function.Predicate<GetDataSciencePrivateEndpointResponse>() {
                            @Override
                            public boolean test(GetDataSciencePrivateEndpointResponse response) {
                                return targetStatesSet.contains(
                                        response.getDataSciencePrivateEndpoint()
                                                .getLifecycleState());
                            }
                        },
                        targetStatesSet.contains(
                                com.oracle.bmc.datascience.model
                                        .DataSciencePrivateEndpointLifecycleState.Deleted)),
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
    public com.oracle.bmc.waiter.Waiter<GetJobRequest, GetJobResponse> forJob(
            GetJobRequest request,
            com.oracle.bmc.datascience.model.JobLifecycleState... targetStates) {
        com.oracle.bmc.util.internal.Validate.notEmpty(
                targetStates, "At least one targetState must be provided");
        com.oracle.bmc.util.internal.Validate.noNullElements(
                targetStates, "Null targetState values are not permitted");

        return forJob(com.oracle.bmc.waiter.Waiters.DEFAULT_POLLING_WAITER, request, targetStates);
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
    public com.oracle.bmc.waiter.Waiter<GetJobRequest, GetJobResponse> forJob(
            GetJobRequest request,
            com.oracle.bmc.datascience.model.JobLifecycleState targetState,
            com.oracle.bmc.waiter.TerminationStrategy terminationStrategy,
            com.oracle.bmc.waiter.DelayStrategy delayStrategy) {
        com.oracle.bmc.util.internal.Validate.notNull(
                targetState, "The targetState cannot be null");

        return forJob(
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
    public com.oracle.bmc.waiter.Waiter<GetJobRequest, GetJobResponse> forJob(
            GetJobRequest request,
            com.oracle.bmc.waiter.TerminationStrategy terminationStrategy,
            com.oracle.bmc.waiter.DelayStrategy delayStrategy,
            com.oracle.bmc.datascience.model.JobLifecycleState... targetStates) {
        com.oracle.bmc.util.internal.Validate.notEmpty(
                targetStates, "At least one targetState must be provided");
        com.oracle.bmc.util.internal.Validate.noNullElements(
                targetStates, "Null targetState values are not permitted");

        return forJob(
                com.oracle.bmc.waiter.Waiters.newWaiter(terminationStrategy, delayStrategy),
                request,
                targetStates);
    }

    // Helper method to create a new Waiter for Job.
    private com.oracle.bmc.waiter.Waiter<GetJobRequest, GetJobResponse> forJob(
            com.oracle.bmc.waiter.BmcGenericWaiter waiter,
            final GetJobRequest request,
            final com.oracle.bmc.datascience.model.JobLifecycleState... targetStates) {
        final java.util.Set<com.oracle.bmc.datascience.model.JobLifecycleState> targetStatesSet =
                new java.util.HashSet<>(java.util.Arrays.asList(targetStates));

        return new com.oracle.bmc.waiter.internal.SimpleWaiterImpl<>(
                executorService,
                waiter.toCallable(
                        () -> request,
                        new java.util.function.Function<GetJobRequest, GetJobResponse>() {
                            @Override
                            public GetJobResponse apply(GetJobRequest request) {
                                return client.getJob(request);
                            }
                        },
                        new java.util.function.Predicate<GetJobResponse>() {
                            @Override
                            public boolean test(GetJobResponse response) {
                                return targetStatesSet.contains(
                                        response.getJob().getLifecycleState());
                            }
                        },
                        targetStatesSet.contains(
                                com.oracle.bmc.datascience.model.JobLifecycleState.Deleted)),
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
    public com.oracle.bmc.waiter.Waiter<GetJobRunRequest, GetJobRunResponse> forJobRun(
            GetJobRunRequest request,
            com.oracle.bmc.datascience.model.JobRunLifecycleState... targetStates) {
        com.oracle.bmc.util.internal.Validate.notEmpty(
                targetStates, "At least one targetState must be provided");
        com.oracle.bmc.util.internal.Validate.noNullElements(
                targetStates, "Null targetState values are not permitted");

        return forJobRun(
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
    public com.oracle.bmc.waiter.Waiter<GetJobRunRequest, GetJobRunResponse> forJobRun(
            GetJobRunRequest request,
            com.oracle.bmc.datascience.model.JobRunLifecycleState targetState,
            com.oracle.bmc.waiter.TerminationStrategy terminationStrategy,
            com.oracle.bmc.waiter.DelayStrategy delayStrategy) {
        com.oracle.bmc.util.internal.Validate.notNull(
                targetState, "The targetState cannot be null");

        return forJobRun(
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
    public com.oracle.bmc.waiter.Waiter<GetJobRunRequest, GetJobRunResponse> forJobRun(
            GetJobRunRequest request,
            com.oracle.bmc.waiter.TerminationStrategy terminationStrategy,
            com.oracle.bmc.waiter.DelayStrategy delayStrategy,
            com.oracle.bmc.datascience.model.JobRunLifecycleState... targetStates) {
        com.oracle.bmc.util.internal.Validate.notEmpty(
                targetStates, "At least one targetState must be provided");
        com.oracle.bmc.util.internal.Validate.noNullElements(
                targetStates, "Null targetState values are not permitted");

        return forJobRun(
                com.oracle.bmc.waiter.Waiters.newWaiter(terminationStrategy, delayStrategy),
                request,
                targetStates);
    }

    // Helper method to create a new Waiter for JobRun.
    private com.oracle.bmc.waiter.Waiter<GetJobRunRequest, GetJobRunResponse> forJobRun(
            com.oracle.bmc.waiter.BmcGenericWaiter waiter,
            final GetJobRunRequest request,
            final com.oracle.bmc.datascience.model.JobRunLifecycleState... targetStates) {
        final java.util.Set<com.oracle.bmc.datascience.model.JobRunLifecycleState> targetStatesSet =
                new java.util.HashSet<>(java.util.Arrays.asList(targetStates));

        return new com.oracle.bmc.waiter.internal.SimpleWaiterImpl<>(
                executorService,
                waiter.toCallable(
                        () -> request,
                        new java.util.function.Function<GetJobRunRequest, GetJobRunResponse>() {
                            @Override
                            public GetJobRunResponse apply(GetJobRunRequest request) {
                                return client.getJobRun(request);
                            }
                        },
                        new java.util.function.Predicate<GetJobRunResponse>() {
                            @Override
                            public boolean test(GetJobRunResponse response) {
                                return targetStatesSet.contains(
                                        response.getJobRun().getLifecycleState());
                            }
                        },
                        targetStatesSet.contains(
                                com.oracle.bmc.datascience.model.JobRunLifecycleState.Deleted)),
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
    public com.oracle.bmc.waiter.Waiter<GetMlApplicationRequest, GetMlApplicationResponse>
            forMlApplication(
                    GetMlApplicationRequest request,
                    com.oracle.bmc.datascience.model.MlApplication.LifecycleState... targetStates) {
        com.oracle.bmc.util.internal.Validate.notEmpty(
                targetStates, "At least one targetState must be provided");
        com.oracle.bmc.util.internal.Validate.noNullElements(
                targetStates, "Null targetState values are not permitted");

        return forMlApplication(
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
    public com.oracle.bmc.waiter.Waiter<GetMlApplicationRequest, GetMlApplicationResponse>
            forMlApplication(
                    GetMlApplicationRequest request,
                    com.oracle.bmc.datascience.model.MlApplication.LifecycleState targetState,
                    com.oracle.bmc.waiter.TerminationStrategy terminationStrategy,
                    com.oracle.bmc.waiter.DelayStrategy delayStrategy) {
        com.oracle.bmc.util.internal.Validate.notNull(
                targetState, "The targetState cannot be null");

        return forMlApplication(
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
    public com.oracle.bmc.waiter.Waiter<GetMlApplicationRequest, GetMlApplicationResponse>
            forMlApplication(
                    GetMlApplicationRequest request,
                    com.oracle.bmc.waiter.TerminationStrategy terminationStrategy,
                    com.oracle.bmc.waiter.DelayStrategy delayStrategy,
                    com.oracle.bmc.datascience.model.MlApplication.LifecycleState... targetStates) {
        com.oracle.bmc.util.internal.Validate.notEmpty(
                targetStates, "At least one target state must be provided");
        com.oracle.bmc.util.internal.Validate.noNullElements(
                targetStates, "Null target states are not permitted");

        return forMlApplication(
                com.oracle.bmc.waiter.Waiters.newWaiter(terminationStrategy, delayStrategy),
                request,
                targetStates);
    }

    // Helper method to create a new Waiter for MlApplication.
    private com.oracle.bmc.waiter.Waiter<GetMlApplicationRequest, GetMlApplicationResponse>
            forMlApplication(
                    com.oracle.bmc.waiter.BmcGenericWaiter waiter,
                    final GetMlApplicationRequest request,
                    final com.oracle.bmc.datascience.model.MlApplication.LifecycleState...
                            targetStates) {
        final java.util.Set<com.oracle.bmc.datascience.model.MlApplication.LifecycleState>
                targetStatesSet = new java.util.HashSet<>(java.util.Arrays.asList(targetStates));

        return new com.oracle.bmc.waiter.internal.SimpleWaiterImpl<>(
                executorService,
                waiter.toCallable(
                        () -> request,
                        new java.util.function.Function<
                                GetMlApplicationRequest, GetMlApplicationResponse>() {
                            @Override
                            public GetMlApplicationResponse apply(GetMlApplicationRequest request) {
                                return client.getMlApplication(request);
                            }
                        },
                        new java.util.function.Predicate<GetMlApplicationResponse>() {
                            @Override
                            public boolean test(GetMlApplicationResponse response) {
                                return targetStatesSet.contains(
                                        response.getMlApplication().getLifecycleState());
                            }
                        },
                        false),
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
                    GetMlApplicationImplementationRequest, GetMlApplicationImplementationResponse>
            forMlApplicationImplementation(
                    GetMlApplicationImplementationRequest request,
                    com.oracle.bmc.datascience.model.MlApplicationImplementation.LifecycleState...
                            targetStates) {
        com.oracle.bmc.util.internal.Validate.notEmpty(
                targetStates, "At least one targetState must be provided");
        com.oracle.bmc.util.internal.Validate.noNullElements(
                targetStates, "Null targetState values are not permitted");

        return forMlApplicationImplementation(
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
                    GetMlApplicationImplementationRequest, GetMlApplicationImplementationResponse>
            forMlApplicationImplementation(
                    GetMlApplicationImplementationRequest request,
                    com.oracle.bmc.datascience.model.MlApplicationImplementation.LifecycleState
                            targetState,
                    com.oracle.bmc.waiter.TerminationStrategy terminationStrategy,
                    com.oracle.bmc.waiter.DelayStrategy delayStrategy) {
        com.oracle.bmc.util.internal.Validate.notNull(
                targetState, "The targetState cannot be null");

        return forMlApplicationImplementation(
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
                    GetMlApplicationImplementationRequest, GetMlApplicationImplementationResponse>
            forMlApplicationImplementation(
                    GetMlApplicationImplementationRequest request,
                    com.oracle.bmc.waiter.TerminationStrategy terminationStrategy,
                    com.oracle.bmc.waiter.DelayStrategy delayStrategy,
                    com.oracle.bmc.datascience.model.MlApplicationImplementation.LifecycleState...
                            targetStates) {
        com.oracle.bmc.util.internal.Validate.notEmpty(
                targetStates, "At least one target state must be provided");
        com.oracle.bmc.util.internal.Validate.noNullElements(
                targetStates, "Null target states are not permitted");

        return forMlApplicationImplementation(
                com.oracle.bmc.waiter.Waiters.newWaiter(terminationStrategy, delayStrategy),
                request,
                targetStates);
    }

    // Helper method to create a new Waiter for MlApplicationImplementation.
    private com.oracle.bmc.waiter.Waiter<
                    GetMlApplicationImplementationRequest, GetMlApplicationImplementationResponse>
            forMlApplicationImplementation(
                    com.oracle.bmc.waiter.BmcGenericWaiter waiter,
                    final GetMlApplicationImplementationRequest request,
                    final com.oracle.bmc.datascience.model.MlApplicationImplementation
                                            .LifecycleState
                                    ...
                            targetStates) {
        final java.util.Set<
                        com.oracle.bmc.datascience.model.MlApplicationImplementation.LifecycleState>
                targetStatesSet = new java.util.HashSet<>(java.util.Arrays.asList(targetStates));

        return new com.oracle.bmc.waiter.internal.SimpleWaiterImpl<>(
                executorService,
                waiter.toCallable(
                        () -> request,
                        new java.util.function.Function<
                                GetMlApplicationImplementationRequest,
                                GetMlApplicationImplementationResponse>() {
                            @Override
                            public GetMlApplicationImplementationResponse apply(
                                    GetMlApplicationImplementationRequest request) {
                                return client.getMlApplicationImplementation(request);
                            }
                        },
                        new java.util.function.Predicate<GetMlApplicationImplementationResponse>() {
                            @Override
                            public boolean test(GetMlApplicationImplementationResponse response) {
                                return targetStatesSet.contains(
                                        response.getMlApplicationImplementation()
                                                .getLifecycleState());
                            }
                        },
                        false),
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
                    GetMlApplicationImplementationVersionRequest,
                    GetMlApplicationImplementationVersionResponse>
            forMlApplicationImplementationVersion(
                    GetMlApplicationImplementationVersionRequest request,
                    com.oracle.bmc.datascience.model.MlApplicationImplementationVersion
                                            .LifecycleState
                                    ...
                            targetStates) {
        com.oracle.bmc.util.internal.Validate.notEmpty(
                targetStates, "At least one targetState must be provided");
        com.oracle.bmc.util.internal.Validate.noNullElements(
                targetStates, "Null targetState values are not permitted");

        return forMlApplicationImplementationVersion(
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
                    GetMlApplicationImplementationVersionRequest,
                    GetMlApplicationImplementationVersionResponse>
            forMlApplicationImplementationVersion(
                    GetMlApplicationImplementationVersionRequest request,
                    com.oracle.bmc.datascience.model.MlApplicationImplementationVersion
                                    .LifecycleState
                            targetState,
                    com.oracle.bmc.waiter.TerminationStrategy terminationStrategy,
                    com.oracle.bmc.waiter.DelayStrategy delayStrategy) {
        com.oracle.bmc.util.internal.Validate.notNull(
                targetState, "The targetState cannot be null");

        return forMlApplicationImplementationVersion(
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
                    GetMlApplicationImplementationVersionRequest,
                    GetMlApplicationImplementationVersionResponse>
            forMlApplicationImplementationVersion(
                    GetMlApplicationImplementationVersionRequest request,
                    com.oracle.bmc.waiter.TerminationStrategy terminationStrategy,
                    com.oracle.bmc.waiter.DelayStrategy delayStrategy,
                    com.oracle.bmc.datascience.model.MlApplicationImplementationVersion
                                            .LifecycleState
                                    ...
                            targetStates) {
        com.oracle.bmc.util.internal.Validate.notEmpty(
                targetStates, "At least one target state must be provided");
        com.oracle.bmc.util.internal.Validate.noNullElements(
                targetStates, "Null target states are not permitted");

        return forMlApplicationImplementationVersion(
                com.oracle.bmc.waiter.Waiters.newWaiter(terminationStrategy, delayStrategy),
                request,
                targetStates);
    }

    // Helper method to create a new Waiter for MlApplicationImplementationVersion.
    private com.oracle.bmc.waiter.Waiter<
                    GetMlApplicationImplementationVersionRequest,
                    GetMlApplicationImplementationVersionResponse>
            forMlApplicationImplementationVersion(
                    com.oracle.bmc.waiter.BmcGenericWaiter waiter,
                    final GetMlApplicationImplementationVersionRequest request,
                    final com.oracle.bmc.datascience.model.MlApplicationImplementationVersion
                                            .LifecycleState
                                    ...
                            targetStates) {
        final java.util.Set<
                        com.oracle.bmc.datascience.model.MlApplicationImplementationVersion
                                .LifecycleState>
                targetStatesSet = new java.util.HashSet<>(java.util.Arrays.asList(targetStates));

        return new com.oracle.bmc.waiter.internal.SimpleWaiterImpl<>(
                executorService,
                waiter.toCallable(
                        () -> request,
                        new java.util.function.Function<
                                GetMlApplicationImplementationVersionRequest,
                                GetMlApplicationImplementationVersionResponse>() {
                            @Override
                            public GetMlApplicationImplementationVersionResponse apply(
                                    GetMlApplicationImplementationVersionRequest request) {
                                return client.getMlApplicationImplementationVersion(request);
                            }
                        },
                        new java.util.function.Predicate<
                                GetMlApplicationImplementationVersionResponse>() {
                            @Override
                            public boolean test(
                                    GetMlApplicationImplementationVersionResponse response) {
                                return targetStatesSet.contains(
                                        response.getMlApplicationImplementationVersion()
                                                .getLifecycleState());
                            }
                        },
                        false),
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
                    GetMlApplicationInstanceRequest, GetMlApplicationInstanceResponse>
            forMlApplicationInstance(
                    GetMlApplicationInstanceRequest request,
                    com.oracle.bmc.datascience.model.MlApplicationInstance.LifecycleState...
                            targetStates) {
        com.oracle.bmc.util.internal.Validate.notEmpty(
                targetStates, "At least one targetState must be provided");
        com.oracle.bmc.util.internal.Validate.noNullElements(
                targetStates, "Null targetState values are not permitted");

        return forMlApplicationInstance(
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
                    GetMlApplicationInstanceRequest, GetMlApplicationInstanceResponse>
            forMlApplicationInstance(
                    GetMlApplicationInstanceRequest request,
                    com.oracle.bmc.datascience.model.MlApplicationInstance.LifecycleState
                            targetState,
                    com.oracle.bmc.waiter.TerminationStrategy terminationStrategy,
                    com.oracle.bmc.waiter.DelayStrategy delayStrategy) {
        com.oracle.bmc.util.internal.Validate.notNull(
                targetState, "The targetState cannot be null");

        return forMlApplicationInstance(
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
                    GetMlApplicationInstanceRequest, GetMlApplicationInstanceResponse>
            forMlApplicationInstance(
                    GetMlApplicationInstanceRequest request,
                    com.oracle.bmc.waiter.TerminationStrategy terminationStrategy,
                    com.oracle.bmc.waiter.DelayStrategy delayStrategy,
                    com.oracle.bmc.datascience.model.MlApplicationInstance.LifecycleState...
                            targetStates) {
        com.oracle.bmc.util.internal.Validate.notEmpty(
                targetStates, "At least one target state must be provided");
        com.oracle.bmc.util.internal.Validate.noNullElements(
                targetStates, "Null target states are not permitted");

        return forMlApplicationInstance(
                com.oracle.bmc.waiter.Waiters.newWaiter(terminationStrategy, delayStrategy),
                request,
                targetStates);
    }

    // Helper method to create a new Waiter for MlApplicationInstance.
    private com.oracle.bmc.waiter.Waiter<
                    GetMlApplicationInstanceRequest, GetMlApplicationInstanceResponse>
            forMlApplicationInstance(
                    com.oracle.bmc.waiter.BmcGenericWaiter waiter,
                    final GetMlApplicationInstanceRequest request,
                    final com.oracle.bmc.datascience.model.MlApplicationInstance.LifecycleState...
                            targetStates) {
        final java.util.Set<com.oracle.bmc.datascience.model.MlApplicationInstance.LifecycleState>
                targetStatesSet = new java.util.HashSet<>(java.util.Arrays.asList(targetStates));

        return new com.oracle.bmc.waiter.internal.SimpleWaiterImpl<>(
                executorService,
                waiter.toCallable(
                        () -> request,
                        new java.util.function.Function<
                                GetMlApplicationInstanceRequest,
                                GetMlApplicationInstanceResponse>() {
                            @Override
                            public GetMlApplicationInstanceResponse apply(
                                    GetMlApplicationInstanceRequest request) {
                                return client.getMlApplicationInstance(request);
                            }
                        },
                        new java.util.function.Predicate<GetMlApplicationInstanceResponse>() {
                            @Override
                            public boolean test(GetMlApplicationInstanceResponse response) {
                                return targetStatesSet.contains(
                                        response.getMlApplicationInstance().getLifecycleState());
                            }
                        },
                        targetStatesSet.contains(
                                com.oracle.bmc.datascience.model.MlApplicationInstance
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
                    GetMlApplicationInstanceViewRequest, GetMlApplicationInstanceViewResponse>
            forMlApplicationInstanceView(
                    GetMlApplicationInstanceViewRequest request,
                    com.oracle.bmc.datascience.model.MlApplicationInstanceView.LifecycleState...
                            targetStates) {
        com.oracle.bmc.util.internal.Validate.notEmpty(
                targetStates, "At least one targetState must be provided");
        com.oracle.bmc.util.internal.Validate.noNullElements(
                targetStates, "Null targetState values are not permitted");

        return forMlApplicationInstanceView(
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
                    GetMlApplicationInstanceViewRequest, GetMlApplicationInstanceViewResponse>
            forMlApplicationInstanceView(
                    GetMlApplicationInstanceViewRequest request,
                    com.oracle.bmc.datascience.model.MlApplicationInstanceView.LifecycleState
                            targetState,
                    com.oracle.bmc.waiter.TerminationStrategy terminationStrategy,
                    com.oracle.bmc.waiter.DelayStrategy delayStrategy) {
        com.oracle.bmc.util.internal.Validate.notNull(
                targetState, "The targetState cannot be null");

        return forMlApplicationInstanceView(
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
                    GetMlApplicationInstanceViewRequest, GetMlApplicationInstanceViewResponse>
            forMlApplicationInstanceView(
                    GetMlApplicationInstanceViewRequest request,
                    com.oracle.bmc.waiter.TerminationStrategy terminationStrategy,
                    com.oracle.bmc.waiter.DelayStrategy delayStrategy,
                    com.oracle.bmc.datascience.model.MlApplicationInstanceView.LifecycleState...
                            targetStates) {
        com.oracle.bmc.util.internal.Validate.notEmpty(
                targetStates, "At least one target state must be provided");
        com.oracle.bmc.util.internal.Validate.noNullElements(
                targetStates, "Null target states are not permitted");

        return forMlApplicationInstanceView(
                com.oracle.bmc.waiter.Waiters.newWaiter(terminationStrategy, delayStrategy),
                request,
                targetStates);
    }

    // Helper method to create a new Waiter for MlApplicationInstanceView.
    private com.oracle.bmc.waiter.Waiter<
                    GetMlApplicationInstanceViewRequest, GetMlApplicationInstanceViewResponse>
            forMlApplicationInstanceView(
                    com.oracle.bmc.waiter.BmcGenericWaiter waiter,
                    final GetMlApplicationInstanceViewRequest request,
                    final com.oracle.bmc.datascience.model.MlApplicationInstanceView.LifecycleState
                                    ...
                            targetStates) {
        final java.util.Set<
                        com.oracle.bmc.datascience.model.MlApplicationInstanceView.LifecycleState>
                targetStatesSet = new java.util.HashSet<>(java.util.Arrays.asList(targetStates));

        return new com.oracle.bmc.waiter.internal.SimpleWaiterImpl<>(
                executorService,
                waiter.toCallable(
                        () -> request,
                        new java.util.function.Function<
                                GetMlApplicationInstanceViewRequest,
                                GetMlApplicationInstanceViewResponse>() {
                            @Override
                            public GetMlApplicationInstanceViewResponse apply(
                                    GetMlApplicationInstanceViewRequest request) {
                                return client.getMlApplicationInstanceView(request);
                            }
                        },
                        new java.util.function.Predicate<GetMlApplicationInstanceViewResponse>() {
                            @Override
                            public boolean test(GetMlApplicationInstanceViewResponse response) {
                                return targetStatesSet.contains(
                                        response.getMlApplicationInstanceView()
                                                .getLifecycleState());
                            }
                        },
                        targetStatesSet.contains(
                                com.oracle.bmc.datascience.model.MlApplicationInstanceView
                                        .LifecycleState.Deleted)),
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
    public com.oracle.bmc.waiter.Waiter<GetModelRequest, GetModelResponse> forModel(
            GetModelRequest request,
            com.oracle.bmc.datascience.model.ModelLifecycleState... targetStates) {
        com.oracle.bmc.util.internal.Validate.notEmpty(
                targetStates, "At least one targetState must be provided");
        com.oracle.bmc.util.internal.Validate.noNullElements(
                targetStates, "Null targetState values are not permitted");

        return forModel(
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
    public com.oracle.bmc.waiter.Waiter<GetModelRequest, GetModelResponse> forModel(
            GetModelRequest request,
            com.oracle.bmc.datascience.model.ModelLifecycleState targetState,
            com.oracle.bmc.waiter.TerminationStrategy terminationStrategy,
            com.oracle.bmc.waiter.DelayStrategy delayStrategy) {
        com.oracle.bmc.util.internal.Validate.notNull(
                targetState, "The targetState cannot be null");

        return forModel(
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
    public com.oracle.bmc.waiter.Waiter<GetModelRequest, GetModelResponse> forModel(
            GetModelRequest request,
            com.oracle.bmc.waiter.TerminationStrategy terminationStrategy,
            com.oracle.bmc.waiter.DelayStrategy delayStrategy,
            com.oracle.bmc.datascience.model.ModelLifecycleState... targetStates) {
        com.oracle.bmc.util.internal.Validate.notEmpty(
                targetStates, "At least one targetState must be provided");
        com.oracle.bmc.util.internal.Validate.noNullElements(
                targetStates, "Null targetState values are not permitted");

        return forModel(
                com.oracle.bmc.waiter.Waiters.newWaiter(terminationStrategy, delayStrategy),
                request,
                targetStates);
    }

    // Helper method to create a new Waiter for Model.
    private com.oracle.bmc.waiter.Waiter<GetModelRequest, GetModelResponse> forModel(
            com.oracle.bmc.waiter.BmcGenericWaiter waiter,
            final GetModelRequest request,
            final com.oracle.bmc.datascience.model.ModelLifecycleState... targetStates) {
        final java.util.Set<com.oracle.bmc.datascience.model.ModelLifecycleState> targetStatesSet =
                new java.util.HashSet<>(java.util.Arrays.asList(targetStates));

        return new com.oracle.bmc.waiter.internal.SimpleWaiterImpl<>(
                executorService,
                waiter.toCallable(
                        () -> request,
                        new java.util.function.Function<GetModelRequest, GetModelResponse>() {
                            @Override
                            public GetModelResponse apply(GetModelRequest request) {
                                return client.getModel(request);
                            }
                        },
                        new java.util.function.Predicate<GetModelResponse>() {
                            @Override
                            public boolean test(GetModelResponse response) {
                                return targetStatesSet.contains(
                                        response.getModel().getLifecycleState());
                            }
                        },
                        targetStatesSet.contains(
                                com.oracle.bmc.datascience.model.ModelLifecycleState.Deleted)),
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
    public com.oracle.bmc.waiter.Waiter<GetModelDeploymentRequest, GetModelDeploymentResponse>
            forModelDeployment(
                    GetModelDeploymentRequest request,
                    com.oracle.bmc.datascience.model.ModelDeploymentLifecycleState...
                            targetStates) {
        com.oracle.bmc.util.internal.Validate.notEmpty(
                targetStates, "At least one targetState must be provided");
        com.oracle.bmc.util.internal.Validate.noNullElements(
                targetStates, "Null targetState values are not permitted");

        return forModelDeployment(
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
    public com.oracle.bmc.waiter.Waiter<GetModelDeploymentRequest, GetModelDeploymentResponse>
            forModelDeployment(
                    GetModelDeploymentRequest request,
                    com.oracle.bmc.datascience.model.ModelDeploymentLifecycleState targetState,
                    com.oracle.bmc.waiter.TerminationStrategy terminationStrategy,
                    com.oracle.bmc.waiter.DelayStrategy delayStrategy) {
        com.oracle.bmc.util.internal.Validate.notNull(
                targetState, "The targetState cannot be null");

        return forModelDeployment(
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
    public com.oracle.bmc.waiter.Waiter<GetModelDeploymentRequest, GetModelDeploymentResponse>
            forModelDeployment(
                    GetModelDeploymentRequest request,
                    com.oracle.bmc.waiter.TerminationStrategy terminationStrategy,
                    com.oracle.bmc.waiter.DelayStrategy delayStrategy,
                    com.oracle.bmc.datascience.model.ModelDeploymentLifecycleState...
                            targetStates) {
        com.oracle.bmc.util.internal.Validate.notEmpty(
                targetStates, "At least one targetState must be provided");
        com.oracle.bmc.util.internal.Validate.noNullElements(
                targetStates, "Null targetState values are not permitted");

        return forModelDeployment(
                com.oracle.bmc.waiter.Waiters.newWaiter(terminationStrategy, delayStrategy),
                request,
                targetStates);
    }

    // Helper method to create a new Waiter for ModelDeployment.
    private com.oracle.bmc.waiter.Waiter<GetModelDeploymentRequest, GetModelDeploymentResponse>
            forModelDeployment(
                    com.oracle.bmc.waiter.BmcGenericWaiter waiter,
                    final GetModelDeploymentRequest request,
                    final com.oracle.bmc.datascience.model.ModelDeploymentLifecycleState...
                            targetStates) {
        final java.util.Set<com.oracle.bmc.datascience.model.ModelDeploymentLifecycleState>
                targetStatesSet = new java.util.HashSet<>(java.util.Arrays.asList(targetStates));

        return new com.oracle.bmc.waiter.internal.SimpleWaiterImpl<>(
                executorService,
                waiter.toCallable(
                        () -> request,
                        new java.util.function.Function<
                                GetModelDeploymentRequest, GetModelDeploymentResponse>() {
                            @Override
                            public GetModelDeploymentResponse apply(
                                    GetModelDeploymentRequest request) {
                                return client.getModelDeployment(request);
                            }
                        },
                        new java.util.function.Predicate<GetModelDeploymentResponse>() {
                            @Override
                            public boolean test(GetModelDeploymentResponse response) {
                                return targetStatesSet.contains(
                                        response.getModelDeployment().getLifecycleState());
                            }
                        },
                        targetStatesSet.contains(
                                com.oracle.bmc.datascience.model.ModelDeploymentLifecycleState
                                        .Deleted)),
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
    public com.oracle.bmc.waiter.Waiter<GetModelGroupRequest, GetModelGroupResponse> forModelGroup(
            GetModelGroupRequest request,
            com.oracle.bmc.datascience.model.ModelGroupLifecycleState... targetStates) {
        com.oracle.bmc.util.internal.Validate.notEmpty(
                targetStates, "At least one targetState must be provided");
        com.oracle.bmc.util.internal.Validate.noNullElements(
                targetStates, "Null targetState values are not permitted");

        return forModelGroup(
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
    public com.oracle.bmc.waiter.Waiter<GetModelGroupRequest, GetModelGroupResponse> forModelGroup(
            GetModelGroupRequest request,
            com.oracle.bmc.datascience.model.ModelGroupLifecycleState targetState,
            com.oracle.bmc.waiter.TerminationStrategy terminationStrategy,
            com.oracle.bmc.waiter.DelayStrategy delayStrategy) {
        com.oracle.bmc.util.internal.Validate.notNull(
                targetState, "The targetState cannot be null");

        return forModelGroup(
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
    public com.oracle.bmc.waiter.Waiter<GetModelGroupRequest, GetModelGroupResponse> forModelGroup(
            GetModelGroupRequest request,
            com.oracle.bmc.waiter.TerminationStrategy terminationStrategy,
            com.oracle.bmc.waiter.DelayStrategy delayStrategy,
            com.oracle.bmc.datascience.model.ModelGroupLifecycleState... targetStates) {
        com.oracle.bmc.util.internal.Validate.notEmpty(
                targetStates, "At least one targetState must be provided");
        com.oracle.bmc.util.internal.Validate.noNullElements(
                targetStates, "Null targetState values are not permitted");

        return forModelGroup(
                com.oracle.bmc.waiter.Waiters.newWaiter(terminationStrategy, delayStrategy),
                request,
                targetStates);
    }

    // Helper method to create a new Waiter for ModelGroup.
    private com.oracle.bmc.waiter.Waiter<GetModelGroupRequest, GetModelGroupResponse> forModelGroup(
            com.oracle.bmc.waiter.BmcGenericWaiter waiter,
            final GetModelGroupRequest request,
            final com.oracle.bmc.datascience.model.ModelGroupLifecycleState... targetStates) {
        final java.util.Set<com.oracle.bmc.datascience.model.ModelGroupLifecycleState>
                targetStatesSet = new java.util.HashSet<>(java.util.Arrays.asList(targetStates));

        return new com.oracle.bmc.waiter.internal.SimpleWaiterImpl<>(
                executorService,
                waiter.toCallable(
                        () -> request,
                        new java.util.function.Function<
                                GetModelGroupRequest, GetModelGroupResponse>() {
                            @Override
                            public GetModelGroupResponse apply(GetModelGroupRequest request) {
                                return client.getModelGroup(request);
                            }
                        },
                        new java.util.function.Predicate<GetModelGroupResponse>() {
                            @Override
                            public boolean test(GetModelGroupResponse response) {
                                return targetStatesSet.contains(
                                        response.getModelGroup().getLifecycleState());
                            }
                        },
                        targetStatesSet.contains(
                                com.oracle.bmc.datascience.model.ModelGroupLifecycleState.Deleted)),
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
                    GetModelGroupVersionHistoryRequest, GetModelGroupVersionHistoryResponse>
            forModelGroupVersionHistory(
                    GetModelGroupVersionHistoryRequest request,
                    com.oracle.bmc.datascience.model.ModelGroupVersionHistoryLifecycleState...
                            targetStates) {
        com.oracle.bmc.util.internal.Validate.notEmpty(
                targetStates, "At least one targetState must be provided");
        com.oracle.bmc.util.internal.Validate.noNullElements(
                targetStates, "Null targetState values are not permitted");

        return forModelGroupVersionHistory(
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
                    GetModelGroupVersionHistoryRequest, GetModelGroupVersionHistoryResponse>
            forModelGroupVersionHistory(
                    GetModelGroupVersionHistoryRequest request,
                    com.oracle.bmc.datascience.model.ModelGroupVersionHistoryLifecycleState
                            targetState,
                    com.oracle.bmc.waiter.TerminationStrategy terminationStrategy,
                    com.oracle.bmc.waiter.DelayStrategy delayStrategy) {
        com.oracle.bmc.util.internal.Validate.notNull(
                targetState, "The targetState cannot be null");

        return forModelGroupVersionHistory(
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
                    GetModelGroupVersionHistoryRequest, GetModelGroupVersionHistoryResponse>
            forModelGroupVersionHistory(
                    GetModelGroupVersionHistoryRequest request,
                    com.oracle.bmc.waiter.TerminationStrategy terminationStrategy,
                    com.oracle.bmc.waiter.DelayStrategy delayStrategy,
                    com.oracle.bmc.datascience.model.ModelGroupVersionHistoryLifecycleState...
                            targetStates) {
        com.oracle.bmc.util.internal.Validate.notEmpty(
                targetStates, "At least one targetState must be provided");
        com.oracle.bmc.util.internal.Validate.noNullElements(
                targetStates, "Null targetState values are not permitted");

        return forModelGroupVersionHistory(
                com.oracle.bmc.waiter.Waiters.newWaiter(terminationStrategy, delayStrategy),
                request,
                targetStates);
    }

    // Helper method to create a new Waiter for ModelGroupVersionHistory.
    private com.oracle.bmc.waiter.Waiter<
                    GetModelGroupVersionHistoryRequest, GetModelGroupVersionHistoryResponse>
            forModelGroupVersionHistory(
                    com.oracle.bmc.waiter.BmcGenericWaiter waiter,
                    final GetModelGroupVersionHistoryRequest request,
                    final com.oracle.bmc.datascience.model.ModelGroupVersionHistoryLifecycleState...
                            targetStates) {
        final java.util.Set<com.oracle.bmc.datascience.model.ModelGroupVersionHistoryLifecycleState>
                targetStatesSet = new java.util.HashSet<>(java.util.Arrays.asList(targetStates));

        return new com.oracle.bmc.waiter.internal.SimpleWaiterImpl<>(
                executorService,
                waiter.toCallable(
                        () -> request,
                        new java.util.function.Function<
                                GetModelGroupVersionHistoryRequest,
                                GetModelGroupVersionHistoryResponse>() {
                            @Override
                            public GetModelGroupVersionHistoryResponse apply(
                                    GetModelGroupVersionHistoryRequest request) {
                                return client.getModelGroupVersionHistory(request);
                            }
                        },
                        new java.util.function.Predicate<GetModelGroupVersionHistoryResponse>() {
                            @Override
                            public boolean test(GetModelGroupVersionHistoryResponse response) {
                                return targetStatesSet.contains(
                                        response.getModelGroupVersionHistory().getLifecycleState());
                            }
                        },
                        targetStatesSet.contains(
                                com.oracle.bmc.datascience.model
                                        .ModelGroupVersionHistoryLifecycleState.Deleted)),
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
    public com.oracle.bmc.waiter.Waiter<GetModelVersionSetRequest, GetModelVersionSetResponse>
            forModelVersionSet(
                    GetModelVersionSetRequest request,
                    com.oracle.bmc.datascience.model.ModelVersionSetLifecycleState...
                            targetStates) {
        com.oracle.bmc.util.internal.Validate.notEmpty(
                targetStates, "At least one targetState must be provided");
        com.oracle.bmc.util.internal.Validate.noNullElements(
                targetStates, "Null targetState values are not permitted");

        return forModelVersionSet(
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
    public com.oracle.bmc.waiter.Waiter<GetModelVersionSetRequest, GetModelVersionSetResponse>
            forModelVersionSet(
                    GetModelVersionSetRequest request,
                    com.oracle.bmc.datascience.model.ModelVersionSetLifecycleState targetState,
                    com.oracle.bmc.waiter.TerminationStrategy terminationStrategy,
                    com.oracle.bmc.waiter.DelayStrategy delayStrategy) {
        com.oracle.bmc.util.internal.Validate.notNull(
                targetState, "The targetState cannot be null");

        return forModelVersionSet(
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
    public com.oracle.bmc.waiter.Waiter<GetModelVersionSetRequest, GetModelVersionSetResponse>
            forModelVersionSet(
                    GetModelVersionSetRequest request,
                    com.oracle.bmc.waiter.TerminationStrategy terminationStrategy,
                    com.oracle.bmc.waiter.DelayStrategy delayStrategy,
                    com.oracle.bmc.datascience.model.ModelVersionSetLifecycleState...
                            targetStates) {
        com.oracle.bmc.util.internal.Validate.notEmpty(
                targetStates, "At least one targetState must be provided");
        com.oracle.bmc.util.internal.Validate.noNullElements(
                targetStates, "Null targetState values are not permitted");

        return forModelVersionSet(
                com.oracle.bmc.waiter.Waiters.newWaiter(terminationStrategy, delayStrategy),
                request,
                targetStates);
    }

    // Helper method to create a new Waiter for ModelVersionSet.
    private com.oracle.bmc.waiter.Waiter<GetModelVersionSetRequest, GetModelVersionSetResponse>
            forModelVersionSet(
                    com.oracle.bmc.waiter.BmcGenericWaiter waiter,
                    final GetModelVersionSetRequest request,
                    final com.oracle.bmc.datascience.model.ModelVersionSetLifecycleState...
                            targetStates) {
        final java.util.Set<com.oracle.bmc.datascience.model.ModelVersionSetLifecycleState>
                targetStatesSet = new java.util.HashSet<>(java.util.Arrays.asList(targetStates));

        return new com.oracle.bmc.waiter.internal.SimpleWaiterImpl<>(
                executorService,
                waiter.toCallable(
                        () -> request,
                        new java.util.function.Function<
                                GetModelVersionSetRequest, GetModelVersionSetResponse>() {
                            @Override
                            public GetModelVersionSetResponse apply(
                                    GetModelVersionSetRequest request) {
                                return client.getModelVersionSet(request);
                            }
                        },
                        new java.util.function.Predicate<GetModelVersionSetResponse>() {
                            @Override
                            public boolean test(GetModelVersionSetResponse response) {
                                return targetStatesSet.contains(
                                        response.getModelVersionSet().getLifecycleState());
                            }
                        },
                        targetStatesSet.contains(
                                com.oracle.bmc.datascience.model.ModelVersionSetLifecycleState
                                        .Deleted)),
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
    public com.oracle.bmc.waiter.Waiter<GetNotebookSessionRequest, GetNotebookSessionResponse>
            forNotebookSession(
                    GetNotebookSessionRequest request,
                    com.oracle.bmc.datascience.model.NotebookSessionLifecycleState...
                            targetStates) {
        com.oracle.bmc.util.internal.Validate.notEmpty(
                targetStates, "At least one targetState must be provided");
        com.oracle.bmc.util.internal.Validate.noNullElements(
                targetStates, "Null targetState values are not permitted");

        return forNotebookSession(
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
    public com.oracle.bmc.waiter.Waiter<GetNotebookSessionRequest, GetNotebookSessionResponse>
            forNotebookSession(
                    GetNotebookSessionRequest request,
                    com.oracle.bmc.datascience.model.NotebookSessionLifecycleState targetState,
                    com.oracle.bmc.waiter.TerminationStrategy terminationStrategy,
                    com.oracle.bmc.waiter.DelayStrategy delayStrategy) {
        com.oracle.bmc.util.internal.Validate.notNull(
                targetState, "The targetState cannot be null");

        return forNotebookSession(
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
    public com.oracle.bmc.waiter.Waiter<GetNotebookSessionRequest, GetNotebookSessionResponse>
            forNotebookSession(
                    GetNotebookSessionRequest request,
                    com.oracle.bmc.waiter.TerminationStrategy terminationStrategy,
                    com.oracle.bmc.waiter.DelayStrategy delayStrategy,
                    com.oracle.bmc.datascience.model.NotebookSessionLifecycleState...
                            targetStates) {
        com.oracle.bmc.util.internal.Validate.notEmpty(
                targetStates, "At least one targetState must be provided");
        com.oracle.bmc.util.internal.Validate.noNullElements(
                targetStates, "Null targetState values are not permitted");

        return forNotebookSession(
                com.oracle.bmc.waiter.Waiters.newWaiter(terminationStrategy, delayStrategy),
                request,
                targetStates);
    }

    // Helper method to create a new Waiter for NotebookSession.
    private com.oracle.bmc.waiter.Waiter<GetNotebookSessionRequest, GetNotebookSessionResponse>
            forNotebookSession(
                    com.oracle.bmc.waiter.BmcGenericWaiter waiter,
                    final GetNotebookSessionRequest request,
                    final com.oracle.bmc.datascience.model.NotebookSessionLifecycleState...
                            targetStates) {
        final java.util.Set<com.oracle.bmc.datascience.model.NotebookSessionLifecycleState>
                targetStatesSet = new java.util.HashSet<>(java.util.Arrays.asList(targetStates));

        return new com.oracle.bmc.waiter.internal.SimpleWaiterImpl<>(
                executorService,
                waiter.toCallable(
                        () -> request,
                        new java.util.function.Function<
                                GetNotebookSessionRequest, GetNotebookSessionResponse>() {
                            @Override
                            public GetNotebookSessionResponse apply(
                                    GetNotebookSessionRequest request) {
                                return client.getNotebookSession(request);
                            }
                        },
                        new java.util.function.Predicate<GetNotebookSessionResponse>() {
                            @Override
                            public boolean test(GetNotebookSessionResponse response) {
                                return targetStatesSet.contains(
                                        response.getNotebookSession().getLifecycleState());
                            }
                        },
                        targetStatesSet.contains(
                                com.oracle.bmc.datascience.model.NotebookSessionLifecycleState
                                        .Deleted)),
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
    public com.oracle.bmc.waiter.Waiter<GetPipelineRequest, GetPipelineResponse> forPipeline(
            GetPipelineRequest request,
            com.oracle.bmc.datascience.model.PipelineLifecycleState... targetStates) {
        com.oracle.bmc.util.internal.Validate.notEmpty(
                targetStates, "At least one targetState must be provided");
        com.oracle.bmc.util.internal.Validate.noNullElements(
                targetStates, "Null targetState values are not permitted");

        return forPipeline(
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
    public com.oracle.bmc.waiter.Waiter<GetPipelineRequest, GetPipelineResponse> forPipeline(
            GetPipelineRequest request,
            com.oracle.bmc.datascience.model.PipelineLifecycleState targetState,
            com.oracle.bmc.waiter.TerminationStrategy terminationStrategy,
            com.oracle.bmc.waiter.DelayStrategy delayStrategy) {
        com.oracle.bmc.util.internal.Validate.notNull(
                targetState, "The targetState cannot be null");

        return forPipeline(
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
    public com.oracle.bmc.waiter.Waiter<GetPipelineRequest, GetPipelineResponse> forPipeline(
            GetPipelineRequest request,
            com.oracle.bmc.waiter.TerminationStrategy terminationStrategy,
            com.oracle.bmc.waiter.DelayStrategy delayStrategy,
            com.oracle.bmc.datascience.model.PipelineLifecycleState... targetStates) {
        com.oracle.bmc.util.internal.Validate.notEmpty(
                targetStates, "At least one targetState must be provided");
        com.oracle.bmc.util.internal.Validate.noNullElements(
                targetStates, "Null targetState values are not permitted");

        return forPipeline(
                com.oracle.bmc.waiter.Waiters.newWaiter(terminationStrategy, delayStrategy),
                request,
                targetStates);
    }

    // Helper method to create a new Waiter for Pipeline.
    private com.oracle.bmc.waiter.Waiter<GetPipelineRequest, GetPipelineResponse> forPipeline(
            com.oracle.bmc.waiter.BmcGenericWaiter waiter,
            final GetPipelineRequest request,
            final com.oracle.bmc.datascience.model.PipelineLifecycleState... targetStates) {
        final java.util.Set<com.oracle.bmc.datascience.model.PipelineLifecycleState>
                targetStatesSet = new java.util.HashSet<>(java.util.Arrays.asList(targetStates));

        return new com.oracle.bmc.waiter.internal.SimpleWaiterImpl<>(
                executorService,
                waiter.toCallable(
                        () -> request,
                        new java.util.function.Function<GetPipelineRequest, GetPipelineResponse>() {
                            @Override
                            public GetPipelineResponse apply(GetPipelineRequest request) {
                                return client.getPipeline(request);
                            }
                        },
                        new java.util.function.Predicate<GetPipelineResponse>() {
                            @Override
                            public boolean test(GetPipelineResponse response) {
                                return targetStatesSet.contains(
                                        response.getPipeline().getLifecycleState());
                            }
                        },
                        targetStatesSet.contains(
                                com.oracle.bmc.datascience.model.PipelineLifecycleState.Deleted)),
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
    public com.oracle.bmc.waiter.Waiter<GetPipelineRunRequest, GetPipelineRunResponse>
            forPipelineRun(
                    GetPipelineRunRequest request,
                    com.oracle.bmc.datascience.model.PipelineRunLifecycleState... targetStates) {
        com.oracle.bmc.util.internal.Validate.notEmpty(
                targetStates, "At least one targetState must be provided");
        com.oracle.bmc.util.internal.Validate.noNullElements(
                targetStates, "Null targetState values are not permitted");

        return forPipelineRun(
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
    public com.oracle.bmc.waiter.Waiter<GetPipelineRunRequest, GetPipelineRunResponse>
            forPipelineRun(
                    GetPipelineRunRequest request,
                    com.oracle.bmc.datascience.model.PipelineRunLifecycleState targetState,
                    com.oracle.bmc.waiter.TerminationStrategy terminationStrategy,
                    com.oracle.bmc.waiter.DelayStrategy delayStrategy) {
        com.oracle.bmc.util.internal.Validate.notNull(
                targetState, "The targetState cannot be null");

        return forPipelineRun(
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
    public com.oracle.bmc.waiter.Waiter<GetPipelineRunRequest, GetPipelineRunResponse>
            forPipelineRun(
                    GetPipelineRunRequest request,
                    com.oracle.bmc.waiter.TerminationStrategy terminationStrategy,
                    com.oracle.bmc.waiter.DelayStrategy delayStrategy,
                    com.oracle.bmc.datascience.model.PipelineRunLifecycleState... targetStates) {
        com.oracle.bmc.util.internal.Validate.notEmpty(
                targetStates, "At least one targetState must be provided");
        com.oracle.bmc.util.internal.Validate.noNullElements(
                targetStates, "Null targetState values are not permitted");

        return forPipelineRun(
                com.oracle.bmc.waiter.Waiters.newWaiter(terminationStrategy, delayStrategy),
                request,
                targetStates);
    }

    // Helper method to create a new Waiter for PipelineRun.
    private com.oracle.bmc.waiter.Waiter<GetPipelineRunRequest, GetPipelineRunResponse>
            forPipelineRun(
                    com.oracle.bmc.waiter.BmcGenericWaiter waiter,
                    final GetPipelineRunRequest request,
                    final com.oracle.bmc.datascience.model.PipelineRunLifecycleState...
                            targetStates) {
        final java.util.Set<com.oracle.bmc.datascience.model.PipelineRunLifecycleState>
                targetStatesSet = new java.util.HashSet<>(java.util.Arrays.asList(targetStates));

        return new com.oracle.bmc.waiter.internal.SimpleWaiterImpl<>(
                executorService,
                waiter.toCallable(
                        () -> request,
                        new java.util.function.Function<
                                GetPipelineRunRequest, GetPipelineRunResponse>() {
                            @Override
                            public GetPipelineRunResponse apply(GetPipelineRunRequest request) {
                                return client.getPipelineRun(request);
                            }
                        },
                        new java.util.function.Predicate<GetPipelineRunResponse>() {
                            @Override
                            public boolean test(GetPipelineRunResponse response) {
                                return targetStatesSet.contains(
                                        response.getPipelineRun().getLifecycleState());
                            }
                        },
                        targetStatesSet.contains(
                                com.oracle.bmc.datascience.model.PipelineRunLifecycleState
                                        .Deleted)),
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
    public com.oracle.bmc.waiter.Waiter<GetProjectRequest, GetProjectResponse> forProject(
            GetProjectRequest request,
            com.oracle.bmc.datascience.model.ProjectLifecycleState... targetStates) {
        com.oracle.bmc.util.internal.Validate.notEmpty(
                targetStates, "At least one targetState must be provided");
        com.oracle.bmc.util.internal.Validate.noNullElements(
                targetStates, "Null targetState values are not permitted");

        return forProject(
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
    public com.oracle.bmc.waiter.Waiter<GetProjectRequest, GetProjectResponse> forProject(
            GetProjectRequest request,
            com.oracle.bmc.datascience.model.ProjectLifecycleState targetState,
            com.oracle.bmc.waiter.TerminationStrategy terminationStrategy,
            com.oracle.bmc.waiter.DelayStrategy delayStrategy) {
        com.oracle.bmc.util.internal.Validate.notNull(
                targetState, "The targetState cannot be null");

        return forProject(
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
    public com.oracle.bmc.waiter.Waiter<GetProjectRequest, GetProjectResponse> forProject(
            GetProjectRequest request,
            com.oracle.bmc.waiter.TerminationStrategy terminationStrategy,
            com.oracle.bmc.waiter.DelayStrategy delayStrategy,
            com.oracle.bmc.datascience.model.ProjectLifecycleState... targetStates) {
        com.oracle.bmc.util.internal.Validate.notEmpty(
                targetStates, "At least one targetState must be provided");
        com.oracle.bmc.util.internal.Validate.noNullElements(
                targetStates, "Null targetState values are not permitted");

        return forProject(
                com.oracle.bmc.waiter.Waiters.newWaiter(terminationStrategy, delayStrategy),
                request,
                targetStates);
    }

    // Helper method to create a new Waiter for Project.
    private com.oracle.bmc.waiter.Waiter<GetProjectRequest, GetProjectResponse> forProject(
            com.oracle.bmc.waiter.BmcGenericWaiter waiter,
            final GetProjectRequest request,
            final com.oracle.bmc.datascience.model.ProjectLifecycleState... targetStates) {
        final java.util.Set<com.oracle.bmc.datascience.model.ProjectLifecycleState>
                targetStatesSet = new java.util.HashSet<>(java.util.Arrays.asList(targetStates));

        return new com.oracle.bmc.waiter.internal.SimpleWaiterImpl<>(
                executorService,
                waiter.toCallable(
                        () -> request,
                        new java.util.function.Function<GetProjectRequest, GetProjectResponse>() {
                            @Override
                            public GetProjectResponse apply(GetProjectRequest request) {
                                return client.getProject(request);
                            }
                        },
                        new java.util.function.Predicate<GetProjectResponse>() {
                            @Override
                            public boolean test(GetProjectResponse response) {
                                return targetStatesSet.contains(
                                        response.getProject().getLifecycleState());
                            }
                        },
                        targetStatesSet.contains(
                                com.oracle.bmc.datascience.model.ProjectLifecycleState.Deleted)),
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
    public com.oracle.bmc.waiter.Waiter<GetScheduleRequest, GetScheduleResponse> forSchedule(
            GetScheduleRequest request,
            com.oracle.bmc.datascience.model.ScheduleLifecycleState... targetStates) {
        com.oracle.bmc.util.internal.Validate.notEmpty(
                targetStates, "At least one targetState must be provided");
        com.oracle.bmc.util.internal.Validate.noNullElements(
                targetStates, "Null targetState values are not permitted");

        return forSchedule(
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
    public com.oracle.bmc.waiter.Waiter<GetScheduleRequest, GetScheduleResponse> forSchedule(
            GetScheduleRequest request,
            com.oracle.bmc.datascience.model.ScheduleLifecycleState targetState,
            com.oracle.bmc.waiter.TerminationStrategy terminationStrategy,
            com.oracle.bmc.waiter.DelayStrategy delayStrategy) {
        com.oracle.bmc.util.internal.Validate.notNull(
                targetState, "The targetState cannot be null");

        return forSchedule(
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
    public com.oracle.bmc.waiter.Waiter<GetScheduleRequest, GetScheduleResponse> forSchedule(
            GetScheduleRequest request,
            com.oracle.bmc.waiter.TerminationStrategy terminationStrategy,
            com.oracle.bmc.waiter.DelayStrategy delayStrategy,
            com.oracle.bmc.datascience.model.ScheduleLifecycleState... targetStates) {
        com.oracle.bmc.util.internal.Validate.notEmpty(
                targetStates, "At least one targetState must be provided");
        com.oracle.bmc.util.internal.Validate.noNullElements(
                targetStates, "Null targetState values are not permitted");

        return forSchedule(
                com.oracle.bmc.waiter.Waiters.newWaiter(terminationStrategy, delayStrategy),
                request,
                targetStates);
    }

    // Helper method to create a new Waiter for Schedule.
    private com.oracle.bmc.waiter.Waiter<GetScheduleRequest, GetScheduleResponse> forSchedule(
            com.oracle.bmc.waiter.BmcGenericWaiter waiter,
            final GetScheduleRequest request,
            final com.oracle.bmc.datascience.model.ScheduleLifecycleState... targetStates) {
        final java.util.Set<com.oracle.bmc.datascience.model.ScheduleLifecycleState>
                targetStatesSet = new java.util.HashSet<>(java.util.Arrays.asList(targetStates));

        return new com.oracle.bmc.waiter.internal.SimpleWaiterImpl<>(
                executorService,
                waiter.toCallable(
                        () -> request,
                        new java.util.function.Function<GetScheduleRequest, GetScheduleResponse>() {
                            @Override
                            public GetScheduleResponse apply(GetScheduleRequest request) {
                                return client.getSchedule(request);
                            }
                        },
                        new java.util.function.Predicate<GetScheduleResponse>() {
                            @Override
                            public boolean test(GetScheduleResponse response) {
                                return targetStatesSet.contains(
                                        response.getSchedule().getLifecycleState());
                            }
                        },
                        targetStatesSet.contains(
                                com.oracle.bmc.datascience.model.ScheduleLifecycleState.Deleted)),
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
