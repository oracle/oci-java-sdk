/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.fleetappsmanagement;

import com.oracle.bmc.fleetappsmanagement.requests.*;
import com.oracle.bmc.fleetappsmanagement.responses.*;

/**
 * Collection of helper methods to produce {@link com.oracle.bmc.waiter.Waiter}s for different
 * resources of FleetAppsManagement.
 * <p>
 * The default configuration used is defined by {@link com.oracle.bmc.waiter.Waiters.Waiters#DEFAULT_POLLING_WAITER}.
 */
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20230831")
public class FleetAppsManagementWaiters {
    private final java.util.concurrent.ExecutorService executorService;
    private final FleetAppsManagement client;

    public FleetAppsManagementWaiters(
            java.util.concurrent.ExecutorService executorService, FleetAppsManagement client) {
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
    public com.oracle.bmc.waiter.Waiter<GetFleetRequest, GetFleetResponse> forFleet(
            GetFleetRequest request,
            com.oracle.bmc.fleetappsmanagement.model.Fleet.LifecycleState... targetStates) {
        com.oracle.bmc.util.internal.Validate.notEmpty(
                targetStates, "At least one targetState must be provided");
        com.oracle.bmc.util.internal.Validate.noNullElements(
                targetStates, "Null targetState values are not permitted");

        return forFleet(
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
    public com.oracle.bmc.waiter.Waiter<GetFleetRequest, GetFleetResponse> forFleet(
            GetFleetRequest request,
            com.oracle.bmc.fleetappsmanagement.model.Fleet.LifecycleState targetState,
            com.oracle.bmc.waiter.TerminationStrategy terminationStrategy,
            com.oracle.bmc.waiter.DelayStrategy delayStrategy) {
        com.oracle.bmc.util.internal.Validate.notNull(
                targetState, "The targetState cannot be null");

        return forFleet(
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
    public com.oracle.bmc.waiter.Waiter<GetFleetRequest, GetFleetResponse> forFleet(
            GetFleetRequest request,
            com.oracle.bmc.waiter.TerminationStrategy terminationStrategy,
            com.oracle.bmc.waiter.DelayStrategy delayStrategy,
            com.oracle.bmc.fleetappsmanagement.model.Fleet.LifecycleState... targetStates) {
        com.oracle.bmc.util.internal.Validate.notEmpty(
                targetStates, "At least one target state must be provided");
        com.oracle.bmc.util.internal.Validate.noNullElements(
                targetStates, "Null target states are not permitted");

        return forFleet(
                com.oracle.bmc.waiter.Waiters.newWaiter(terminationStrategy, delayStrategy),
                request,
                targetStates);
    }

    // Helper method to create a new Waiter for Fleet.
    private com.oracle.bmc.waiter.Waiter<GetFleetRequest, GetFleetResponse> forFleet(
            com.oracle.bmc.waiter.BmcGenericWaiter waiter,
            final GetFleetRequest request,
            final com.oracle.bmc.fleetappsmanagement.model.Fleet.LifecycleState... targetStates) {
        final java.util.Set<com.oracle.bmc.fleetappsmanagement.model.Fleet.LifecycleState>
                targetStatesSet = new java.util.HashSet<>(java.util.Arrays.asList(targetStates));

        return new com.oracle.bmc.waiter.internal.SimpleWaiterImpl<>(
                executorService,
                waiter.toCallable(
                        () -> request,
                        new java.util.function.Function<GetFleetRequest, GetFleetResponse>() {
                            @Override
                            public GetFleetResponse apply(GetFleetRequest request) {
                                return client.getFleet(request);
                            }
                        },
                        new java.util.function.Predicate<GetFleetResponse>() {
                            @Override
                            public boolean test(GetFleetResponse response) {
                                return targetStatesSet.contains(
                                        response.getFleet().getLifecycleState());
                            }
                        },
                        targetStatesSet.contains(
                                com.oracle.bmc.fleetappsmanagement.model.Fleet.LifecycleState
                                        .Deleted)),
                request);
    }

    /**
     * Creates a new {@link com.oracle.bmc.waiter.Waiter} using the default configuration.
     *
     * @param request the request to send
     * @param targetStates the desired states to wait for. If multiple states are provided then the waiter will return once the resource reaches any of the provided states
     * @return a new {@code Waiter} instance
     */
    public com.oracle.bmc.waiter.Waiter<GetFleetCredentialRequest, GetFleetCredentialResponse>
            forFleetCredential(
                    GetFleetCredentialRequest request,
                    com.oracle.bmc.fleetappsmanagement.model.FleetCredential.LifecycleState...
                            targetStates) {
        com.oracle.bmc.util.internal.Validate.notEmpty(
                targetStates, "At least one targetState must be provided");
        com.oracle.bmc.util.internal.Validate.noNullElements(
                targetStates, "Null targetState values are not permitted");

        return forFleetCredential(
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
    public com.oracle.bmc.waiter.Waiter<GetFleetCredentialRequest, GetFleetCredentialResponse>
            forFleetCredential(
                    GetFleetCredentialRequest request,
                    com.oracle.bmc.fleetappsmanagement.model.FleetCredential.LifecycleState
                            targetState,
                    com.oracle.bmc.waiter.TerminationStrategy terminationStrategy,
                    com.oracle.bmc.waiter.DelayStrategy delayStrategy) {
        com.oracle.bmc.util.internal.Validate.notNull(
                targetState, "The targetState cannot be null");

        return forFleetCredential(
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
    public com.oracle.bmc.waiter.Waiter<GetFleetCredentialRequest, GetFleetCredentialResponse>
            forFleetCredential(
                    GetFleetCredentialRequest request,
                    com.oracle.bmc.waiter.TerminationStrategy terminationStrategy,
                    com.oracle.bmc.waiter.DelayStrategy delayStrategy,
                    com.oracle.bmc.fleetappsmanagement.model.FleetCredential.LifecycleState...
                            targetStates) {
        com.oracle.bmc.util.internal.Validate.notEmpty(
                targetStates, "At least one target state must be provided");
        com.oracle.bmc.util.internal.Validate.noNullElements(
                targetStates, "Null target states are not permitted");

        return forFleetCredential(
                com.oracle.bmc.waiter.Waiters.newWaiter(terminationStrategy, delayStrategy),
                request,
                targetStates);
    }

    // Helper method to create a new Waiter for FleetCredential.
    private com.oracle.bmc.waiter.Waiter<GetFleetCredentialRequest, GetFleetCredentialResponse>
            forFleetCredential(
                    com.oracle.bmc.waiter.BmcGenericWaiter waiter,
                    final GetFleetCredentialRequest request,
                    final com.oracle.bmc.fleetappsmanagement.model.FleetCredential.LifecycleState...
                            targetStates) {
        final java.util.Set<com.oracle.bmc.fleetappsmanagement.model.FleetCredential.LifecycleState>
                targetStatesSet = new java.util.HashSet<>(java.util.Arrays.asList(targetStates));

        return new com.oracle.bmc.waiter.internal.SimpleWaiterImpl<>(
                executorService,
                waiter.toCallable(
                        () -> request,
                        new java.util.function.Function<
                                GetFleetCredentialRequest, GetFleetCredentialResponse>() {
                            @Override
                            public GetFleetCredentialResponse apply(
                                    GetFleetCredentialRequest request) {
                                return client.getFleetCredential(request);
                            }
                        },
                        new java.util.function.Predicate<GetFleetCredentialResponse>() {
                            @Override
                            public boolean test(GetFleetCredentialResponse response) {
                                return targetStatesSet.contains(
                                        response.getFleetCredential().getLifecycleState());
                            }
                        },
                        targetStatesSet.contains(
                                com.oracle.bmc.fleetappsmanagement.model.FleetCredential
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
    public com.oracle.bmc.waiter.Waiter<GetFleetPropertyRequest, GetFleetPropertyResponse>
            forFleetProperty(
                    GetFleetPropertyRequest request,
                    com.oracle.bmc.fleetappsmanagement.model.FleetProperty.LifecycleState...
                            targetStates) {
        com.oracle.bmc.util.internal.Validate.notEmpty(
                targetStates, "At least one targetState must be provided");
        com.oracle.bmc.util.internal.Validate.noNullElements(
                targetStates, "Null targetState values are not permitted");

        return forFleetProperty(
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
    public com.oracle.bmc.waiter.Waiter<GetFleetPropertyRequest, GetFleetPropertyResponse>
            forFleetProperty(
                    GetFleetPropertyRequest request,
                    com.oracle.bmc.fleetappsmanagement.model.FleetProperty.LifecycleState
                            targetState,
                    com.oracle.bmc.waiter.TerminationStrategy terminationStrategy,
                    com.oracle.bmc.waiter.DelayStrategy delayStrategy) {
        com.oracle.bmc.util.internal.Validate.notNull(
                targetState, "The targetState cannot be null");

        return forFleetProperty(
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
    public com.oracle.bmc.waiter.Waiter<GetFleetPropertyRequest, GetFleetPropertyResponse>
            forFleetProperty(
                    GetFleetPropertyRequest request,
                    com.oracle.bmc.waiter.TerminationStrategy terminationStrategy,
                    com.oracle.bmc.waiter.DelayStrategy delayStrategy,
                    com.oracle.bmc.fleetappsmanagement.model.FleetProperty.LifecycleState...
                            targetStates) {
        com.oracle.bmc.util.internal.Validate.notEmpty(
                targetStates, "At least one target state must be provided");
        com.oracle.bmc.util.internal.Validate.noNullElements(
                targetStates, "Null target states are not permitted");

        return forFleetProperty(
                com.oracle.bmc.waiter.Waiters.newWaiter(terminationStrategy, delayStrategy),
                request,
                targetStates);
    }

    // Helper method to create a new Waiter for FleetProperty.
    private com.oracle.bmc.waiter.Waiter<GetFleetPropertyRequest, GetFleetPropertyResponse>
            forFleetProperty(
                    com.oracle.bmc.waiter.BmcGenericWaiter waiter,
                    final GetFleetPropertyRequest request,
                    final com.oracle.bmc.fleetappsmanagement.model.FleetProperty.LifecycleState...
                            targetStates) {
        final java.util.Set<com.oracle.bmc.fleetappsmanagement.model.FleetProperty.LifecycleState>
                targetStatesSet = new java.util.HashSet<>(java.util.Arrays.asList(targetStates));

        return new com.oracle.bmc.waiter.internal.SimpleWaiterImpl<>(
                executorService,
                waiter.toCallable(
                        () -> request,
                        new java.util.function.Function<
                                GetFleetPropertyRequest, GetFleetPropertyResponse>() {
                            @Override
                            public GetFleetPropertyResponse apply(GetFleetPropertyRequest request) {
                                return client.getFleetProperty(request);
                            }
                        },
                        new java.util.function.Predicate<GetFleetPropertyResponse>() {
                            @Override
                            public boolean test(GetFleetPropertyResponse response) {
                                return targetStatesSet.contains(
                                        response.getFleetProperty().getLifecycleState());
                            }
                        },
                        targetStatesSet.contains(
                                com.oracle.bmc.fleetappsmanagement.model.FleetProperty
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
    public com.oracle.bmc.waiter.Waiter<GetFleetResourceRequest, GetFleetResourceResponse>
            forFleetResource(
                    GetFleetResourceRequest request,
                    com.oracle.bmc.fleetappsmanagement.model.FleetResource.LifecycleState...
                            targetStates) {
        com.oracle.bmc.util.internal.Validate.notEmpty(
                targetStates, "At least one targetState must be provided");
        com.oracle.bmc.util.internal.Validate.noNullElements(
                targetStates, "Null targetState values are not permitted");

        return forFleetResource(
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
    public com.oracle.bmc.waiter.Waiter<GetFleetResourceRequest, GetFleetResourceResponse>
            forFleetResource(
                    GetFleetResourceRequest request,
                    com.oracle.bmc.fleetappsmanagement.model.FleetResource.LifecycleState
                            targetState,
                    com.oracle.bmc.waiter.TerminationStrategy terminationStrategy,
                    com.oracle.bmc.waiter.DelayStrategy delayStrategy) {
        com.oracle.bmc.util.internal.Validate.notNull(
                targetState, "The targetState cannot be null");

        return forFleetResource(
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
    public com.oracle.bmc.waiter.Waiter<GetFleetResourceRequest, GetFleetResourceResponse>
            forFleetResource(
                    GetFleetResourceRequest request,
                    com.oracle.bmc.waiter.TerminationStrategy terminationStrategy,
                    com.oracle.bmc.waiter.DelayStrategy delayStrategy,
                    com.oracle.bmc.fleetappsmanagement.model.FleetResource.LifecycleState...
                            targetStates) {
        com.oracle.bmc.util.internal.Validate.notEmpty(
                targetStates, "At least one target state must be provided");
        com.oracle.bmc.util.internal.Validate.noNullElements(
                targetStates, "Null target states are not permitted");

        return forFleetResource(
                com.oracle.bmc.waiter.Waiters.newWaiter(terminationStrategy, delayStrategy),
                request,
                targetStates);
    }

    // Helper method to create a new Waiter for FleetResource.
    private com.oracle.bmc.waiter.Waiter<GetFleetResourceRequest, GetFleetResourceResponse>
            forFleetResource(
                    com.oracle.bmc.waiter.BmcGenericWaiter waiter,
                    final GetFleetResourceRequest request,
                    final com.oracle.bmc.fleetappsmanagement.model.FleetResource.LifecycleState...
                            targetStates) {
        final java.util.Set<com.oracle.bmc.fleetappsmanagement.model.FleetResource.LifecycleState>
                targetStatesSet = new java.util.HashSet<>(java.util.Arrays.asList(targetStates));

        return new com.oracle.bmc.waiter.internal.SimpleWaiterImpl<>(
                executorService,
                waiter.toCallable(
                        () -> request,
                        new java.util.function.Function<
                                GetFleetResourceRequest, GetFleetResourceResponse>() {
                            @Override
                            public GetFleetResourceResponse apply(GetFleetResourceRequest request) {
                                return client.getFleetResource(request);
                            }
                        },
                        new java.util.function.Predicate<GetFleetResourceResponse>() {
                            @Override
                            public boolean test(GetFleetResourceResponse response) {
                                return targetStatesSet.contains(
                                        response.getFleetResource().getLifecycleState());
                            }
                        },
                        targetStatesSet.contains(
                                com.oracle.bmc.fleetappsmanagement.model.FleetResource
                                        .LifecycleState.Deleted)),
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
