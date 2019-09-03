/**
 * Copyright (c) 2016, 2019, Oracle and/or its affiliates. All rights reserved.
 */
package com.oracle.bmc.database;

import com.oracle.bmc.database.requests.*;
import com.oracle.bmc.database.responses.*;

/**
 * Collection of helper methods to produce {@link com.oracle.bmc.waiter.Waiter}s for different
 * resources of Database.
 * <p>
 * The default configuration used is defined by {@link com.oracle.bmc.waiter.Waiters.Waiters#DEFAULT_POLLING_WAITER}.
 */
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20160918")
public class DatabaseWaiters {
    @lombok.NonNull private final java.util.concurrent.ExecutorService executorService;
    @lombok.NonNull private final Database client;
    private final com.oracle.bmc.workrequests.WorkRequest workRequestClient;

    @Deprecated
    public DatabaseWaiters(
            @lombok.NonNull java.util.concurrent.ExecutorService executorService,
            @lombok.NonNull Database client) {
        this(executorService, client, null);
    }

    public DatabaseWaiters(
            @lombok.NonNull java.util.concurrent.ExecutorService executorService,
            @lombok.NonNull Database client,
            com.oracle.bmc.workrequests.WorkRequest workRequestClient) {
        this.executorService = executorService;
        this.client = client;
        this.workRequestClient = workRequestClient;
    }

    /**
     * Creates a new {@link com.oracle.bmc.waiter.Waiter} using the default configuration.
     *
     * @param request the request to send
     * @return a new {@link com.oracle.bmc.waiter.Waiter} instance
     */
    public com.oracle.bmc.waiter.Waiter<
                    ChangeAutonomousContainerDatabaseCompartmentRequest,
                    ChangeAutonomousContainerDatabaseCompartmentResponse>
            forChangeAutonomousContainerDatabaseCompartment(
                    ChangeAutonomousContainerDatabaseCompartmentRequest request) {
        return forChangeAutonomousContainerDatabaseCompartment(
                request,
                com.oracle.bmc.waiter.Waiters.DEFAULT_POLLING_TERMINATION_STRATEGY,
                com.oracle.bmc.waiter.Waiters.DEFAULT_POLLING_DELAY_STRATEGY);
    }

    /**
     * Creates a new {@link com.oracle.bmc.waiter.Waiter} using the provided configuration.
     *
     * @param request the request to send
     * @param terminationStrategy the {@link com.oracle.bmc.waiter.TerminationStrategy} to use
     * @param delayStrategy the {@link com.oracle.bmc.waiter.DelayStrategy} to use
     * @return a new {@link com.oracle.bmc.waiter.Waiter} instance
     */
    public com.oracle.bmc.waiter.Waiter<
                    ChangeAutonomousContainerDatabaseCompartmentRequest,
                    ChangeAutonomousContainerDatabaseCompartmentResponse>
            forChangeAutonomousContainerDatabaseCompartment(
                    ChangeAutonomousContainerDatabaseCompartmentRequest request,
                    com.oracle.bmc.waiter.TerminationStrategy terminationStrategy,
                    com.oracle.bmc.waiter.DelayStrategy delayStrategy) {
        if (workRequestClient == null) {
            throw new IllegalStateException(
                    "A WorkRequestClient must be supplied to this waiter for this operation");
        }

        return new com.oracle.bmc.waiter.internal.SimpleWaiterImpl<>(
                executorService,
                new java.util.concurrent.Callable<
                        ChangeAutonomousContainerDatabaseCompartmentResponse>() {
                    @Override
                    public ChangeAutonomousContainerDatabaseCompartmentResponse call()
                            throws Exception {
                        final ChangeAutonomousContainerDatabaseCompartmentResponse response =
                                client.changeAutonomousContainerDatabaseCompartment(request);

                        final com.oracle.bmc.workrequests.requests.GetWorkRequestRequest
                                getWorkRequestRequest =
                                        com.oracle.bmc.workrequests.requests.GetWorkRequestRequest
                                                .builder()
                                                .workRequestId(response.getOpcWorkRequestId())
                                                .build();
                        workRequestClient
                                .getWaiters()
                                .forWorkRequest(
                                        getWorkRequestRequest, terminationStrategy, delayStrategy)
                                .execute();
                        return response;
                    }
                },
                request);
    }

    /**
     * Creates a new {@link com.oracle.bmc.waiter.Waiter} using the default configuration.
     *
     * @param request the request to send
     * @return a new {@link com.oracle.bmc.waiter.Waiter} instance
     */
    public com.oracle.bmc.waiter.Waiter<
                    ChangeAutonomousDatabaseCompartmentRequest,
                    ChangeAutonomousDatabaseCompartmentResponse>
            forChangeAutonomousDatabaseCompartment(
                    ChangeAutonomousDatabaseCompartmentRequest request) {
        return forChangeAutonomousDatabaseCompartment(
                request,
                com.oracle.bmc.waiter.Waiters.DEFAULT_POLLING_TERMINATION_STRATEGY,
                com.oracle.bmc.waiter.Waiters.DEFAULT_POLLING_DELAY_STRATEGY);
    }

    /**
     * Creates a new {@link com.oracle.bmc.waiter.Waiter} using the provided configuration.
     *
     * @param request the request to send
     * @param terminationStrategy the {@link com.oracle.bmc.waiter.TerminationStrategy} to use
     * @param delayStrategy the {@link com.oracle.bmc.waiter.DelayStrategy} to use
     * @return a new {@link com.oracle.bmc.waiter.Waiter} instance
     */
    public com.oracle.bmc.waiter.Waiter<
                    ChangeAutonomousDatabaseCompartmentRequest,
                    ChangeAutonomousDatabaseCompartmentResponse>
            forChangeAutonomousDatabaseCompartment(
                    ChangeAutonomousDatabaseCompartmentRequest request,
                    com.oracle.bmc.waiter.TerminationStrategy terminationStrategy,
                    com.oracle.bmc.waiter.DelayStrategy delayStrategy) {
        if (workRequestClient == null) {
            throw new IllegalStateException(
                    "A WorkRequestClient must be supplied to this waiter for this operation");
        }

        return new com.oracle.bmc.waiter.internal.SimpleWaiterImpl<>(
                executorService,
                new java.util.concurrent.Callable<ChangeAutonomousDatabaseCompartmentResponse>() {
                    @Override
                    public ChangeAutonomousDatabaseCompartmentResponse call() throws Exception {
                        final ChangeAutonomousDatabaseCompartmentResponse response =
                                client.changeAutonomousDatabaseCompartment(request);

                        final com.oracle.bmc.workrequests.requests.GetWorkRequestRequest
                                getWorkRequestRequest =
                                        com.oracle.bmc.workrequests.requests.GetWorkRequestRequest
                                                .builder()
                                                .workRequestId(response.getOpcWorkRequestId())
                                                .build();
                        workRequestClient
                                .getWaiters()
                                .forWorkRequest(
                                        getWorkRequestRequest, terminationStrategy, delayStrategy)
                                .execute();
                        return response;
                    }
                },
                request);
    }

    /**
     * Creates a new {@link com.oracle.bmc.waiter.Waiter} using the default configuration.
     *
     * @param request the request to send
     * @return a new {@link com.oracle.bmc.waiter.Waiter} instance
     */
    public com.oracle.bmc.waiter.Waiter<
                    ChangeAutonomousExadataInfrastructureCompartmentRequest,
                    ChangeAutonomousExadataInfrastructureCompartmentResponse>
            forChangeAutonomousExadataInfrastructureCompartment(
                    ChangeAutonomousExadataInfrastructureCompartmentRequest request) {
        return forChangeAutonomousExadataInfrastructureCompartment(
                request,
                com.oracle.bmc.waiter.Waiters.DEFAULT_POLLING_TERMINATION_STRATEGY,
                com.oracle.bmc.waiter.Waiters.DEFAULT_POLLING_DELAY_STRATEGY);
    }

    /**
     * Creates a new {@link com.oracle.bmc.waiter.Waiter} using the provided configuration.
     *
     * @param request the request to send
     * @param terminationStrategy the {@link com.oracle.bmc.waiter.TerminationStrategy} to use
     * @param delayStrategy the {@link com.oracle.bmc.waiter.DelayStrategy} to use
     * @return a new {@link com.oracle.bmc.waiter.Waiter} instance
     */
    public com.oracle.bmc.waiter.Waiter<
                    ChangeAutonomousExadataInfrastructureCompartmentRequest,
                    ChangeAutonomousExadataInfrastructureCompartmentResponse>
            forChangeAutonomousExadataInfrastructureCompartment(
                    ChangeAutonomousExadataInfrastructureCompartmentRequest request,
                    com.oracle.bmc.waiter.TerminationStrategy terminationStrategy,
                    com.oracle.bmc.waiter.DelayStrategy delayStrategy) {
        if (workRequestClient == null) {
            throw new IllegalStateException(
                    "A WorkRequestClient must be supplied to this waiter for this operation");
        }

        return new com.oracle.bmc.waiter.internal.SimpleWaiterImpl<>(
                executorService,
                new java.util.concurrent.Callable<
                        ChangeAutonomousExadataInfrastructureCompartmentResponse>() {
                    @Override
                    public ChangeAutonomousExadataInfrastructureCompartmentResponse call()
                            throws Exception {
                        final ChangeAutonomousExadataInfrastructureCompartmentResponse response =
                                client.changeAutonomousExadataInfrastructureCompartment(request);

                        final com.oracle.bmc.workrequests.requests.GetWorkRequestRequest
                                getWorkRequestRequest =
                                        com.oracle.bmc.workrequests.requests.GetWorkRequestRequest
                                                .builder()
                                                .workRequestId(response.getOpcWorkRequestId())
                                                .build();
                        workRequestClient
                                .getWaiters()
                                .forWorkRequest(
                                        getWorkRequestRequest, terminationStrategy, delayStrategy)
                                .execute();
                        return response;
                    }
                },
                request);
    }

    /**
     * Creates a new {@link com.oracle.bmc.waiter.Waiter} using the default configuration.
     *
     * @param request the request to send
     * @return a new {@link com.oracle.bmc.waiter.Waiter} instance
     */
    public com.oracle.bmc.waiter.Waiter<
                    ChangeDbSystemCompartmentRequest, ChangeDbSystemCompartmentResponse>
            forChangeDbSystemCompartment(ChangeDbSystemCompartmentRequest request) {
        return forChangeDbSystemCompartment(
                request,
                com.oracle.bmc.waiter.Waiters.DEFAULT_POLLING_TERMINATION_STRATEGY,
                com.oracle.bmc.waiter.Waiters.DEFAULT_POLLING_DELAY_STRATEGY);
    }

    /**
     * Creates a new {@link com.oracle.bmc.waiter.Waiter} using the provided configuration.
     *
     * @param request the request to send
     * @param terminationStrategy the {@link com.oracle.bmc.waiter.TerminationStrategy} to use
     * @param delayStrategy the {@link com.oracle.bmc.waiter.DelayStrategy} to use
     * @return a new {@link com.oracle.bmc.waiter.Waiter} instance
     */
    public com.oracle.bmc.waiter.Waiter<
                    ChangeDbSystemCompartmentRequest, ChangeDbSystemCompartmentResponse>
            forChangeDbSystemCompartment(
                    ChangeDbSystemCompartmentRequest request,
                    com.oracle.bmc.waiter.TerminationStrategy terminationStrategy,
                    com.oracle.bmc.waiter.DelayStrategy delayStrategy) {
        if (workRequestClient == null) {
            throw new IllegalStateException(
                    "A WorkRequestClient must be supplied to this waiter for this operation");
        }

        return new com.oracle.bmc.waiter.internal.SimpleWaiterImpl<>(
                executorService,
                new java.util.concurrent.Callable<ChangeDbSystemCompartmentResponse>() {
                    @Override
                    public ChangeDbSystemCompartmentResponse call() throws Exception {
                        final ChangeDbSystemCompartmentResponse response =
                                client.changeDbSystemCompartment(request);

                        final com.oracle.bmc.workrequests.requests.GetWorkRequestRequest
                                getWorkRequestRequest =
                                        com.oracle.bmc.workrequests.requests.GetWorkRequestRequest
                                                .builder()
                                                .workRequestId(response.getOpcWorkRequestId())
                                                .build();
                        workRequestClient
                                .getWaiters()
                                .forWorkRequest(
                                        getWorkRequestRequest, terminationStrategy, delayStrategy)
                                .execute();
                        return response;
                    }
                },
                request);
    }

    /**
     * Creates a new {@link com.oracle.bmc.waiter.Waiter} using the default configuration.
     *
     * @param request the request to send
     * @return a new {@link com.oracle.bmc.waiter.Waiter} instance
     */
    public com.oracle.bmc.waiter.Waiter<
                    CreateAutonomousContainerDatabaseRequest,
                    CreateAutonomousContainerDatabaseResponse>
            forCreateAutonomousContainerDatabase(CreateAutonomousContainerDatabaseRequest request) {
        return forCreateAutonomousContainerDatabase(
                request,
                com.oracle.bmc.waiter.Waiters.DEFAULT_POLLING_TERMINATION_STRATEGY,
                com.oracle.bmc.waiter.Waiters.DEFAULT_POLLING_DELAY_STRATEGY);
    }

    /**
     * Creates a new {@link com.oracle.bmc.waiter.Waiter} using the provided configuration.
     *
     * @param request the request to send
     * @param terminationStrategy the {@link com.oracle.bmc.waiter.TerminationStrategy} to use
     * @param delayStrategy the {@link com.oracle.bmc.waiter.DelayStrategy} to use
     * @return a new {@link com.oracle.bmc.waiter.Waiter} instance
     */
    public com.oracle.bmc.waiter.Waiter<
                    CreateAutonomousContainerDatabaseRequest,
                    CreateAutonomousContainerDatabaseResponse>
            forCreateAutonomousContainerDatabase(
                    CreateAutonomousContainerDatabaseRequest request,
                    com.oracle.bmc.waiter.TerminationStrategy terminationStrategy,
                    com.oracle.bmc.waiter.DelayStrategy delayStrategy) {
        if (workRequestClient == null) {
            throw new IllegalStateException(
                    "A WorkRequestClient must be supplied to this waiter for this operation");
        }

        return new com.oracle.bmc.waiter.internal.SimpleWaiterImpl<>(
                executorService,
                new java.util.concurrent.Callable<CreateAutonomousContainerDatabaseResponse>() {
                    @Override
                    public CreateAutonomousContainerDatabaseResponse call() throws Exception {
                        final CreateAutonomousContainerDatabaseResponse response =
                                client.createAutonomousContainerDatabase(request);

                        final com.oracle.bmc.workrequests.requests.GetWorkRequestRequest
                                getWorkRequestRequest =
                                        com.oracle.bmc.workrequests.requests.GetWorkRequestRequest
                                                .builder()
                                                .workRequestId(response.getOpcWorkRequestId())
                                                .build();
                        workRequestClient
                                .getWaiters()
                                .forWorkRequest(
                                        getWorkRequestRequest, terminationStrategy, delayStrategy)
                                .execute();
                        return response;
                    }
                },
                request);
    }

    /**
     * Creates a new {@link com.oracle.bmc.waiter.Waiter} using the default configuration.
     *
     * @param request the request to send
     * @return a new {@link com.oracle.bmc.waiter.Waiter} instance
     */
    public com.oracle.bmc.waiter.Waiter<
                    CreateAutonomousDatabaseRequest, CreateAutonomousDatabaseResponse>
            forCreateAutonomousDatabase(CreateAutonomousDatabaseRequest request) {
        return forCreateAutonomousDatabase(
                request,
                com.oracle.bmc.waiter.Waiters.DEFAULT_POLLING_TERMINATION_STRATEGY,
                com.oracle.bmc.waiter.Waiters.DEFAULT_POLLING_DELAY_STRATEGY);
    }

    /**
     * Creates a new {@link com.oracle.bmc.waiter.Waiter} using the provided configuration.
     *
     * @param request the request to send
     * @param terminationStrategy the {@link com.oracle.bmc.waiter.TerminationStrategy} to use
     * @param delayStrategy the {@link com.oracle.bmc.waiter.DelayStrategy} to use
     * @return a new {@link com.oracle.bmc.waiter.Waiter} instance
     */
    public com.oracle.bmc.waiter.Waiter<
                    CreateAutonomousDatabaseRequest, CreateAutonomousDatabaseResponse>
            forCreateAutonomousDatabase(
                    CreateAutonomousDatabaseRequest request,
                    com.oracle.bmc.waiter.TerminationStrategy terminationStrategy,
                    com.oracle.bmc.waiter.DelayStrategy delayStrategy) {
        if (workRequestClient == null) {
            throw new IllegalStateException(
                    "A WorkRequestClient must be supplied to this waiter for this operation");
        }

        return new com.oracle.bmc.waiter.internal.SimpleWaiterImpl<>(
                executorService,
                new java.util.concurrent.Callable<CreateAutonomousDatabaseResponse>() {
                    @Override
                    public CreateAutonomousDatabaseResponse call() throws Exception {
                        final CreateAutonomousDatabaseResponse response =
                                client.createAutonomousDatabase(request);

                        final com.oracle.bmc.workrequests.requests.GetWorkRequestRequest
                                getWorkRequestRequest =
                                        com.oracle.bmc.workrequests.requests.GetWorkRequestRequest
                                                .builder()
                                                .workRequestId(response.getOpcWorkRequestId())
                                                .build();
                        workRequestClient
                                .getWaiters()
                                .forWorkRequest(
                                        getWorkRequestRequest, terminationStrategy, delayStrategy)
                                .execute();
                        return response;
                    }
                },
                request);
    }

    /**
     * Creates a new {@link com.oracle.bmc.waiter.Waiter} using the default configuration.
     *
     * @param request the request to send
     * @return a new {@link com.oracle.bmc.waiter.Waiter} instance
     */
    public com.oracle.bmc.waiter.Waiter<
                    CreateAutonomousDatabaseBackupRequest, CreateAutonomousDatabaseBackupResponse>
            forCreateAutonomousDatabaseBackup(CreateAutonomousDatabaseBackupRequest request) {
        return forCreateAutonomousDatabaseBackup(
                request,
                com.oracle.bmc.waiter.Waiters.DEFAULT_POLLING_TERMINATION_STRATEGY,
                com.oracle.bmc.waiter.Waiters.DEFAULT_POLLING_DELAY_STRATEGY);
    }

    /**
     * Creates a new {@link com.oracle.bmc.waiter.Waiter} using the provided configuration.
     *
     * @param request the request to send
     * @param terminationStrategy the {@link com.oracle.bmc.waiter.TerminationStrategy} to use
     * @param delayStrategy the {@link com.oracle.bmc.waiter.DelayStrategy} to use
     * @return a new {@link com.oracle.bmc.waiter.Waiter} instance
     */
    public com.oracle.bmc.waiter.Waiter<
                    CreateAutonomousDatabaseBackupRequest, CreateAutonomousDatabaseBackupResponse>
            forCreateAutonomousDatabaseBackup(
                    CreateAutonomousDatabaseBackupRequest request,
                    com.oracle.bmc.waiter.TerminationStrategy terminationStrategy,
                    com.oracle.bmc.waiter.DelayStrategy delayStrategy) {
        if (workRequestClient == null) {
            throw new IllegalStateException(
                    "A WorkRequestClient must be supplied to this waiter for this operation");
        }

        return new com.oracle.bmc.waiter.internal.SimpleWaiterImpl<>(
                executorService,
                new java.util.concurrent.Callable<CreateAutonomousDatabaseBackupResponse>() {
                    @Override
                    public CreateAutonomousDatabaseBackupResponse call() throws Exception {
                        final CreateAutonomousDatabaseBackupResponse response =
                                client.createAutonomousDatabaseBackup(request);

                        final com.oracle.bmc.workrequests.requests.GetWorkRequestRequest
                                getWorkRequestRequest =
                                        com.oracle.bmc.workrequests.requests.GetWorkRequestRequest
                                                .builder()
                                                .workRequestId(response.getOpcWorkRequestId())
                                                .build();
                        workRequestClient
                                .getWaiters()
                                .forWorkRequest(
                                        getWorkRequestRequest, terminationStrategy, delayStrategy)
                                .execute();
                        return response;
                    }
                },
                request);
    }

    /**
     * Creates a new {@link com.oracle.bmc.waiter.Waiter} using the default configuration.
     *
     * @param request the request to send
     * @return a new {@link com.oracle.bmc.waiter.Waiter} instance
     */
    public com.oracle.bmc.waiter.Waiter<
                    DeleteAutonomousDatabaseRequest, DeleteAutonomousDatabaseResponse>
            forDeleteAutonomousDatabase(DeleteAutonomousDatabaseRequest request) {
        return forDeleteAutonomousDatabase(
                request,
                com.oracle.bmc.waiter.Waiters.DEFAULT_POLLING_TERMINATION_STRATEGY,
                com.oracle.bmc.waiter.Waiters.DEFAULT_POLLING_DELAY_STRATEGY);
    }

    /**
     * Creates a new {@link com.oracle.bmc.waiter.Waiter} using the provided configuration.
     *
     * @param request the request to send
     * @param terminationStrategy the {@link com.oracle.bmc.waiter.TerminationStrategy} to use
     * @param delayStrategy the {@link com.oracle.bmc.waiter.DelayStrategy} to use
     * @return a new {@link com.oracle.bmc.waiter.Waiter} instance
     */
    public com.oracle.bmc.waiter.Waiter<
                    DeleteAutonomousDatabaseRequest, DeleteAutonomousDatabaseResponse>
            forDeleteAutonomousDatabase(
                    DeleteAutonomousDatabaseRequest request,
                    com.oracle.bmc.waiter.TerminationStrategy terminationStrategy,
                    com.oracle.bmc.waiter.DelayStrategy delayStrategy) {
        if (workRequestClient == null) {
            throw new IllegalStateException(
                    "A WorkRequestClient must be supplied to this waiter for this operation");
        }

        return new com.oracle.bmc.waiter.internal.SimpleWaiterImpl<>(
                executorService,
                new java.util.concurrent.Callable<DeleteAutonomousDatabaseResponse>() {
                    @Override
                    public DeleteAutonomousDatabaseResponse call() throws Exception {
                        final DeleteAutonomousDatabaseResponse response =
                                client.deleteAutonomousDatabase(request);

                        final com.oracle.bmc.workrequests.requests.GetWorkRequestRequest
                                getWorkRequestRequest =
                                        com.oracle.bmc.workrequests.requests.GetWorkRequestRequest
                                                .builder()
                                                .workRequestId(response.getOpcWorkRequestId())
                                                .build();
                        workRequestClient
                                .getWaiters()
                                .forWorkRequest(
                                        getWorkRequestRequest, terminationStrategy, delayStrategy)
                                .execute();
                        return response;
                    }
                },
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
                    GetAutonomousContainerDatabaseRequest, GetAutonomousContainerDatabaseResponse>
            forAutonomousContainerDatabase(
                    GetAutonomousContainerDatabaseRequest request,
                    com.oracle.bmc.database.model.AutonomousContainerDatabase.LifecycleState...
                            targetStates) {
        org.apache.commons.lang3.Validate.notEmpty(
                targetStates, "At least one targetState must be provided");
        org.apache.commons.lang3.Validate.noNullElements(
                targetStates, "Null targetState values are not permitted");

        return forAutonomousContainerDatabase(
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
                    GetAutonomousContainerDatabaseRequest, GetAutonomousContainerDatabaseResponse>
            forAutonomousContainerDatabase(
                    GetAutonomousContainerDatabaseRequest request,
                    com.oracle.bmc.database.model.AutonomousContainerDatabase.LifecycleState
                            targetState,
                    com.oracle.bmc.waiter.TerminationStrategy terminationStrategy,
                    com.oracle.bmc.waiter.DelayStrategy delayStrategy) {
        org.apache.commons.lang3.Validate.notNull(targetState, "The targetState cannot be null");

        return forAutonomousContainerDatabase(
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
                    GetAutonomousContainerDatabaseRequest, GetAutonomousContainerDatabaseResponse>
            forAutonomousContainerDatabase(
                    GetAutonomousContainerDatabaseRequest request,
                    com.oracle.bmc.waiter.TerminationStrategy terminationStrategy,
                    com.oracle.bmc.waiter.DelayStrategy delayStrategy,
                    com.oracle.bmc.database.model.AutonomousContainerDatabase.LifecycleState...
                            targetStates) {
        org.apache.commons.lang3.Validate.notEmpty(
                targetStates, "At least one target state must be provided");
        org.apache.commons.lang3.Validate.noNullElements(
                targetStates, "Null target states are not permitted");

        return forAutonomousContainerDatabase(
                com.oracle.bmc.waiter.Waiters.newWaiter(terminationStrategy, delayStrategy),
                request,
                targetStates);
    }

    // Helper method to create a new Waiter for AutonomousContainerDatabase.
    private com.oracle.bmc.waiter.Waiter<
                    GetAutonomousContainerDatabaseRequest, GetAutonomousContainerDatabaseResponse>
            forAutonomousContainerDatabase(
                    com.oracle.bmc.waiter.BmcGenericWaiter waiter,
                    final GetAutonomousContainerDatabaseRequest request,
                    final com.oracle.bmc.database.model.AutonomousContainerDatabase
                                    .LifecycleState...
                            targetStates) {
        final java.util.Set<
                        com.oracle.bmc.database.model.AutonomousContainerDatabase.LifecycleState>
                targetStatesSet = new java.util.HashSet<>(java.util.Arrays.asList(targetStates));

        return new com.oracle.bmc.waiter.internal.SimpleWaiterImpl<>(
                executorService,
                waiter.toCallable(
                        com.google.common.base.Suppliers.ofInstance(request),
                        new com.google.common.base.Function<
                                GetAutonomousContainerDatabaseRequest,
                                GetAutonomousContainerDatabaseResponse>() {
                            @Override
                            public GetAutonomousContainerDatabaseResponse apply(
                                    GetAutonomousContainerDatabaseRequest request) {
                                return client.getAutonomousContainerDatabase(request);
                            }
                        },
                        new com.google.common.base.Predicate<
                                GetAutonomousContainerDatabaseResponse>() {
                            @Override
                            public boolean apply(GetAutonomousContainerDatabaseResponse response) {
                                return targetStatesSet.contains(
                                        response.getAutonomousContainerDatabase()
                                                .getLifecycleState());
                            }
                        },
                        targetStatesSet.contains(
                                com.oracle.bmc.database.model.AutonomousContainerDatabase
                                        .LifecycleState.Terminated)),
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
                    GetAutonomousDataWarehouseRequest, GetAutonomousDataWarehouseResponse>
            forAutonomousDataWarehouse(
                    GetAutonomousDataWarehouseRequest request,
                    com.oracle.bmc.database.model.AutonomousDataWarehouse.LifecycleState...
                            targetStates) {
        org.apache.commons.lang3.Validate.notEmpty(
                targetStates, "At least one targetState must be provided");
        org.apache.commons.lang3.Validate.noNullElements(
                targetStates, "Null targetState values are not permitted");

        return forAutonomousDataWarehouse(
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
                    GetAutonomousDataWarehouseRequest, GetAutonomousDataWarehouseResponse>
            forAutonomousDataWarehouse(
                    GetAutonomousDataWarehouseRequest request,
                    com.oracle.bmc.database.model.AutonomousDataWarehouse.LifecycleState
                            targetState,
                    com.oracle.bmc.waiter.TerminationStrategy terminationStrategy,
                    com.oracle.bmc.waiter.DelayStrategy delayStrategy) {
        org.apache.commons.lang3.Validate.notNull(targetState, "The targetState cannot be null");

        return forAutonomousDataWarehouse(
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
                    GetAutonomousDataWarehouseRequest, GetAutonomousDataWarehouseResponse>
            forAutonomousDataWarehouse(
                    GetAutonomousDataWarehouseRequest request,
                    com.oracle.bmc.waiter.TerminationStrategy terminationStrategy,
                    com.oracle.bmc.waiter.DelayStrategy delayStrategy,
                    com.oracle.bmc.database.model.AutonomousDataWarehouse.LifecycleState...
                            targetStates) {
        org.apache.commons.lang3.Validate.notEmpty(
                targetStates, "At least one target state must be provided");
        org.apache.commons.lang3.Validate.noNullElements(
                targetStates, "Null target states are not permitted");

        return forAutonomousDataWarehouse(
                com.oracle.bmc.waiter.Waiters.newWaiter(terminationStrategy, delayStrategy),
                request,
                targetStates);
    }

    // Helper method to create a new Waiter for AutonomousDataWarehouse.
    private com.oracle.bmc.waiter.Waiter<
                    GetAutonomousDataWarehouseRequest, GetAutonomousDataWarehouseResponse>
            forAutonomousDataWarehouse(
                    com.oracle.bmc.waiter.BmcGenericWaiter waiter,
                    final GetAutonomousDataWarehouseRequest request,
                    final com.oracle.bmc.database.model.AutonomousDataWarehouse.LifecycleState...
                            targetStates) {
        final java.util.Set<com.oracle.bmc.database.model.AutonomousDataWarehouse.LifecycleState>
                targetStatesSet = new java.util.HashSet<>(java.util.Arrays.asList(targetStates));

        return new com.oracle.bmc.waiter.internal.SimpleWaiterImpl<>(
                executorService,
                waiter.toCallable(
                        com.google.common.base.Suppliers.ofInstance(request),
                        new com.google.common.base.Function<
                                GetAutonomousDataWarehouseRequest,
                                GetAutonomousDataWarehouseResponse>() {
                            @Override
                            public GetAutonomousDataWarehouseResponse apply(
                                    GetAutonomousDataWarehouseRequest request) {
                                return client.getAutonomousDataWarehouse(request);
                            }
                        },
                        new com.google.common.base.Predicate<GetAutonomousDataWarehouseResponse>() {
                            @Override
                            public boolean apply(GetAutonomousDataWarehouseResponse response) {
                                return targetStatesSet.contains(
                                        response.getAutonomousDataWarehouse().getLifecycleState());
                            }
                        },
                        targetStatesSet.contains(
                                com.oracle.bmc.database.model.AutonomousDataWarehouse.LifecycleState
                                        .Terminated)),
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
                    GetAutonomousDataWarehouseBackupRequest,
                    GetAutonomousDataWarehouseBackupResponse>
            forAutonomousDataWarehouseBackup(
                    GetAutonomousDataWarehouseBackupRequest request,
                    com.oracle.bmc.database.model.AutonomousDataWarehouseBackup.LifecycleState...
                            targetStates) {
        org.apache.commons.lang3.Validate.notEmpty(
                targetStates, "At least one targetState must be provided");
        org.apache.commons.lang3.Validate.noNullElements(
                targetStates, "Null targetState values are not permitted");

        return forAutonomousDataWarehouseBackup(
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
                    GetAutonomousDataWarehouseBackupRequest,
                    GetAutonomousDataWarehouseBackupResponse>
            forAutonomousDataWarehouseBackup(
                    GetAutonomousDataWarehouseBackupRequest request,
                    com.oracle.bmc.database.model.AutonomousDataWarehouseBackup.LifecycleState
                            targetState,
                    com.oracle.bmc.waiter.TerminationStrategy terminationStrategy,
                    com.oracle.bmc.waiter.DelayStrategy delayStrategy) {
        org.apache.commons.lang3.Validate.notNull(targetState, "The targetState cannot be null");

        return forAutonomousDataWarehouseBackup(
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
                    GetAutonomousDataWarehouseBackupRequest,
                    GetAutonomousDataWarehouseBackupResponse>
            forAutonomousDataWarehouseBackup(
                    GetAutonomousDataWarehouseBackupRequest request,
                    com.oracle.bmc.waiter.TerminationStrategy terminationStrategy,
                    com.oracle.bmc.waiter.DelayStrategy delayStrategy,
                    com.oracle.bmc.database.model.AutonomousDataWarehouseBackup.LifecycleState...
                            targetStates) {
        org.apache.commons.lang3.Validate.notEmpty(
                targetStates, "At least one target state must be provided");
        org.apache.commons.lang3.Validate.noNullElements(
                targetStates, "Null target states are not permitted");

        return forAutonomousDataWarehouseBackup(
                com.oracle.bmc.waiter.Waiters.newWaiter(terminationStrategy, delayStrategy),
                request,
                targetStates);
    }

    // Helper method to create a new Waiter for AutonomousDataWarehouseBackup.
    private com.oracle.bmc.waiter.Waiter<
                    GetAutonomousDataWarehouseBackupRequest,
                    GetAutonomousDataWarehouseBackupResponse>
            forAutonomousDataWarehouseBackup(
                    com.oracle.bmc.waiter.BmcGenericWaiter waiter,
                    final GetAutonomousDataWarehouseBackupRequest request,
                    final com.oracle.bmc.database.model.AutonomousDataWarehouseBackup
                                    .LifecycleState...
                            targetStates) {
        final java.util.Set<
                        com.oracle.bmc.database.model.AutonomousDataWarehouseBackup.LifecycleState>
                targetStatesSet = new java.util.HashSet<>(java.util.Arrays.asList(targetStates));

        return new com.oracle.bmc.waiter.internal.SimpleWaiterImpl<>(
                executorService,
                waiter.toCallable(
                        com.google.common.base.Suppliers.ofInstance(request),
                        new com.google.common.base.Function<
                                GetAutonomousDataWarehouseBackupRequest,
                                GetAutonomousDataWarehouseBackupResponse>() {
                            @Override
                            public GetAutonomousDataWarehouseBackupResponse apply(
                                    GetAutonomousDataWarehouseBackupRequest request) {
                                return client.getAutonomousDataWarehouseBackup(request);
                            }
                        },
                        new com.google.common.base.Predicate<
                                GetAutonomousDataWarehouseBackupResponse>() {
                            @Override
                            public boolean apply(
                                    GetAutonomousDataWarehouseBackupResponse response) {
                                return targetStatesSet.contains(
                                        response.getAutonomousDataWarehouseBackup()
                                                .getLifecycleState());
                            }
                        },
                        targetStatesSet.contains(
                                com.oracle.bmc.database.model.AutonomousDataWarehouseBackup
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
    public com.oracle.bmc.waiter.Waiter<GetAutonomousDatabaseRequest, GetAutonomousDatabaseResponse>
            forAutonomousDatabase(
                    GetAutonomousDatabaseRequest request,
                    com.oracle.bmc.database.model.AutonomousDatabase.LifecycleState...
                            targetStates) {
        org.apache.commons.lang3.Validate.notEmpty(
                targetStates, "At least one targetState must be provided");
        org.apache.commons.lang3.Validate.noNullElements(
                targetStates, "Null targetState values are not permitted");

        return forAutonomousDatabase(
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
    public com.oracle.bmc.waiter.Waiter<GetAutonomousDatabaseRequest, GetAutonomousDatabaseResponse>
            forAutonomousDatabase(
                    GetAutonomousDatabaseRequest request,
                    com.oracle.bmc.database.model.AutonomousDatabase.LifecycleState targetState,
                    com.oracle.bmc.waiter.TerminationStrategy terminationStrategy,
                    com.oracle.bmc.waiter.DelayStrategy delayStrategy) {
        org.apache.commons.lang3.Validate.notNull(targetState, "The targetState cannot be null");

        return forAutonomousDatabase(
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
    public com.oracle.bmc.waiter.Waiter<GetAutonomousDatabaseRequest, GetAutonomousDatabaseResponse>
            forAutonomousDatabase(
                    GetAutonomousDatabaseRequest request,
                    com.oracle.bmc.waiter.TerminationStrategy terminationStrategy,
                    com.oracle.bmc.waiter.DelayStrategy delayStrategy,
                    com.oracle.bmc.database.model.AutonomousDatabase.LifecycleState...
                            targetStates) {
        org.apache.commons.lang3.Validate.notEmpty(
                targetStates, "At least one target state must be provided");
        org.apache.commons.lang3.Validate.noNullElements(
                targetStates, "Null target states are not permitted");

        return forAutonomousDatabase(
                com.oracle.bmc.waiter.Waiters.newWaiter(terminationStrategy, delayStrategy),
                request,
                targetStates);
    }

    // Helper method to create a new Waiter for AutonomousDatabase.
    private com.oracle.bmc.waiter.Waiter<
                    GetAutonomousDatabaseRequest, GetAutonomousDatabaseResponse>
            forAutonomousDatabase(
                    com.oracle.bmc.waiter.BmcGenericWaiter waiter,
                    final GetAutonomousDatabaseRequest request,
                    final com.oracle.bmc.database.model.AutonomousDatabase.LifecycleState...
                            targetStates) {
        final java.util.Set<com.oracle.bmc.database.model.AutonomousDatabase.LifecycleState>
                targetStatesSet = new java.util.HashSet<>(java.util.Arrays.asList(targetStates));

        return new com.oracle.bmc.waiter.internal.SimpleWaiterImpl<>(
                executorService,
                waiter.toCallable(
                        com.google.common.base.Suppliers.ofInstance(request),
                        new com.google.common.base.Function<
                                GetAutonomousDatabaseRequest, GetAutonomousDatabaseResponse>() {
                            @Override
                            public GetAutonomousDatabaseResponse apply(
                                    GetAutonomousDatabaseRequest request) {
                                return client.getAutonomousDatabase(request);
                            }
                        },
                        new com.google.common.base.Predicate<GetAutonomousDatabaseResponse>() {
                            @Override
                            public boolean apply(GetAutonomousDatabaseResponse response) {
                                return targetStatesSet.contains(
                                        response.getAutonomousDatabase().getLifecycleState());
                            }
                        },
                        targetStatesSet.contains(
                                com.oracle.bmc.database.model.AutonomousDatabase.LifecycleState
                                        .Terminated)),
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
                    GetAutonomousDatabaseBackupRequest, GetAutonomousDatabaseBackupResponse>
            forAutonomousDatabaseBackup(
                    GetAutonomousDatabaseBackupRequest request,
                    com.oracle.bmc.database.model.AutonomousDatabaseBackup.LifecycleState...
                            targetStates) {
        org.apache.commons.lang3.Validate.notEmpty(
                targetStates, "At least one targetState must be provided");
        org.apache.commons.lang3.Validate.noNullElements(
                targetStates, "Null targetState values are not permitted");

        return forAutonomousDatabaseBackup(
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
                    GetAutonomousDatabaseBackupRequest, GetAutonomousDatabaseBackupResponse>
            forAutonomousDatabaseBackup(
                    GetAutonomousDatabaseBackupRequest request,
                    com.oracle.bmc.database.model.AutonomousDatabaseBackup.LifecycleState
                            targetState,
                    com.oracle.bmc.waiter.TerminationStrategy terminationStrategy,
                    com.oracle.bmc.waiter.DelayStrategy delayStrategy) {
        org.apache.commons.lang3.Validate.notNull(targetState, "The targetState cannot be null");

        return forAutonomousDatabaseBackup(
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
                    GetAutonomousDatabaseBackupRequest, GetAutonomousDatabaseBackupResponse>
            forAutonomousDatabaseBackup(
                    GetAutonomousDatabaseBackupRequest request,
                    com.oracle.bmc.waiter.TerminationStrategy terminationStrategy,
                    com.oracle.bmc.waiter.DelayStrategy delayStrategy,
                    com.oracle.bmc.database.model.AutonomousDatabaseBackup.LifecycleState...
                            targetStates) {
        org.apache.commons.lang3.Validate.notEmpty(
                targetStates, "At least one target state must be provided");
        org.apache.commons.lang3.Validate.noNullElements(
                targetStates, "Null target states are not permitted");

        return forAutonomousDatabaseBackup(
                com.oracle.bmc.waiter.Waiters.newWaiter(terminationStrategy, delayStrategy),
                request,
                targetStates);
    }

    // Helper method to create a new Waiter for AutonomousDatabaseBackup.
    private com.oracle.bmc.waiter.Waiter<
                    GetAutonomousDatabaseBackupRequest, GetAutonomousDatabaseBackupResponse>
            forAutonomousDatabaseBackup(
                    com.oracle.bmc.waiter.BmcGenericWaiter waiter,
                    final GetAutonomousDatabaseBackupRequest request,
                    final com.oracle.bmc.database.model.AutonomousDatabaseBackup.LifecycleState...
                            targetStates) {
        final java.util.Set<com.oracle.bmc.database.model.AutonomousDatabaseBackup.LifecycleState>
                targetStatesSet = new java.util.HashSet<>(java.util.Arrays.asList(targetStates));

        return new com.oracle.bmc.waiter.internal.SimpleWaiterImpl<>(
                executorService,
                waiter.toCallable(
                        com.google.common.base.Suppliers.ofInstance(request),
                        new com.google.common.base.Function<
                                GetAutonomousDatabaseBackupRequest,
                                GetAutonomousDatabaseBackupResponse>() {
                            @Override
                            public GetAutonomousDatabaseBackupResponse apply(
                                    GetAutonomousDatabaseBackupRequest request) {
                                return client.getAutonomousDatabaseBackup(request);
                            }
                        },
                        new com.google.common.base.Predicate<
                                GetAutonomousDatabaseBackupResponse>() {
                            @Override
                            public boolean apply(GetAutonomousDatabaseBackupResponse response) {
                                return targetStatesSet.contains(
                                        response.getAutonomousDatabaseBackup().getLifecycleState());
                            }
                        },
                        targetStatesSet.contains(
                                com.oracle.bmc.database.model.AutonomousDatabaseBackup
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
    public com.oracle.bmc.waiter.Waiter<
                    GetAutonomousExadataInfrastructureRequest,
                    GetAutonomousExadataInfrastructureResponse>
            forAutonomousExadataInfrastructure(
                    GetAutonomousExadataInfrastructureRequest request,
                    com.oracle.bmc.database.model.AutonomousExadataInfrastructure.LifecycleState...
                            targetStates) {
        org.apache.commons.lang3.Validate.notEmpty(
                targetStates, "At least one targetState must be provided");
        org.apache.commons.lang3.Validate.noNullElements(
                targetStates, "Null targetState values are not permitted");

        return forAutonomousExadataInfrastructure(
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
                    GetAutonomousExadataInfrastructureRequest,
                    GetAutonomousExadataInfrastructureResponse>
            forAutonomousExadataInfrastructure(
                    GetAutonomousExadataInfrastructureRequest request,
                    com.oracle.bmc.database.model.AutonomousExadataInfrastructure.LifecycleState
                            targetState,
                    com.oracle.bmc.waiter.TerminationStrategy terminationStrategy,
                    com.oracle.bmc.waiter.DelayStrategy delayStrategy) {
        org.apache.commons.lang3.Validate.notNull(targetState, "The targetState cannot be null");

        return forAutonomousExadataInfrastructure(
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
                    GetAutonomousExadataInfrastructureRequest,
                    GetAutonomousExadataInfrastructureResponse>
            forAutonomousExadataInfrastructure(
                    GetAutonomousExadataInfrastructureRequest request,
                    com.oracle.bmc.waiter.TerminationStrategy terminationStrategy,
                    com.oracle.bmc.waiter.DelayStrategy delayStrategy,
                    com.oracle.bmc.database.model.AutonomousExadataInfrastructure.LifecycleState...
                            targetStates) {
        org.apache.commons.lang3.Validate.notEmpty(
                targetStates, "At least one target state must be provided");
        org.apache.commons.lang3.Validate.noNullElements(
                targetStates, "Null target states are not permitted");

        return forAutonomousExadataInfrastructure(
                com.oracle.bmc.waiter.Waiters.newWaiter(terminationStrategy, delayStrategy),
                request,
                targetStates);
    }

    // Helper method to create a new Waiter for AutonomousExadataInfrastructure.
    private com.oracle.bmc.waiter.Waiter<
                    GetAutonomousExadataInfrastructureRequest,
                    GetAutonomousExadataInfrastructureResponse>
            forAutonomousExadataInfrastructure(
                    com.oracle.bmc.waiter.BmcGenericWaiter waiter,
                    final GetAutonomousExadataInfrastructureRequest request,
                    final com.oracle.bmc.database.model.AutonomousExadataInfrastructure
                                    .LifecycleState...
                            targetStates) {
        final java.util.Set<
                        com.oracle.bmc.database.model.AutonomousExadataInfrastructure
                                .LifecycleState>
                targetStatesSet = new java.util.HashSet<>(java.util.Arrays.asList(targetStates));

        return new com.oracle.bmc.waiter.internal.SimpleWaiterImpl<>(
                executorService,
                waiter.toCallable(
                        com.google.common.base.Suppliers.ofInstance(request),
                        new com.google.common.base.Function<
                                GetAutonomousExadataInfrastructureRequest,
                                GetAutonomousExadataInfrastructureResponse>() {
                            @Override
                            public GetAutonomousExadataInfrastructureResponse apply(
                                    GetAutonomousExadataInfrastructureRequest request) {
                                return client.getAutonomousExadataInfrastructure(request);
                            }
                        },
                        new com.google.common.base.Predicate<
                                GetAutonomousExadataInfrastructureResponse>() {
                            @Override
                            public boolean apply(
                                    GetAutonomousExadataInfrastructureResponse response) {
                                return targetStatesSet.contains(
                                        response.getAutonomousExadataInfrastructure()
                                                .getLifecycleState());
                            }
                        },
                        targetStatesSet.contains(
                                com.oracle.bmc.database.model.AutonomousExadataInfrastructure
                                        .LifecycleState.Terminated)),
                request);
    }

    /**
     * Creates a new {@link com.oracle.bmc.waiter.Waiter} using the default configuration.
     *
     * @param request the request to send
     * @param targetStates the desired states to wait for. If multiple states are provided then the waiter will return once the resource reaches any of the provided states
     * @return a new {@code Waiter} instance
     */
    public com.oracle.bmc.waiter.Waiter<GetBackupRequest, GetBackupResponse> forBackup(
            GetBackupRequest request,
            com.oracle.bmc.database.model.Backup.LifecycleState... targetStates) {
        org.apache.commons.lang3.Validate.notEmpty(
                targetStates, "At least one targetState must be provided");
        org.apache.commons.lang3.Validate.noNullElements(
                targetStates, "Null targetState values are not permitted");

        return forBackup(
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
    public com.oracle.bmc.waiter.Waiter<GetBackupRequest, GetBackupResponse> forBackup(
            GetBackupRequest request,
            com.oracle.bmc.database.model.Backup.LifecycleState targetState,
            com.oracle.bmc.waiter.TerminationStrategy terminationStrategy,
            com.oracle.bmc.waiter.DelayStrategy delayStrategy) {
        org.apache.commons.lang3.Validate.notNull(targetState, "The targetState cannot be null");

        return forBackup(
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
    public com.oracle.bmc.waiter.Waiter<GetBackupRequest, GetBackupResponse> forBackup(
            GetBackupRequest request,
            com.oracle.bmc.waiter.TerminationStrategy terminationStrategy,
            com.oracle.bmc.waiter.DelayStrategy delayStrategy,
            com.oracle.bmc.database.model.Backup.LifecycleState... targetStates) {
        org.apache.commons.lang3.Validate.notEmpty(
                targetStates, "At least one target state must be provided");
        org.apache.commons.lang3.Validate.noNullElements(
                targetStates, "Null target states are not permitted");

        return forBackup(
                com.oracle.bmc.waiter.Waiters.newWaiter(terminationStrategy, delayStrategy),
                request,
                targetStates);
    }

    // Helper method to create a new Waiter for Backup.
    private com.oracle.bmc.waiter.Waiter<GetBackupRequest, GetBackupResponse> forBackup(
            com.oracle.bmc.waiter.BmcGenericWaiter waiter,
            final GetBackupRequest request,
            final com.oracle.bmc.database.model.Backup.LifecycleState... targetStates) {
        final java.util.Set<com.oracle.bmc.database.model.Backup.LifecycleState> targetStatesSet =
                new java.util.HashSet<>(java.util.Arrays.asList(targetStates));

        return new com.oracle.bmc.waiter.internal.SimpleWaiterImpl<>(
                executorService,
                waiter.toCallable(
                        com.google.common.base.Suppliers.ofInstance(request),
                        new com.google.common.base.Function<GetBackupRequest, GetBackupResponse>() {
                            @Override
                            public GetBackupResponse apply(GetBackupRequest request) {
                                return client.getBackup(request);
                            }
                        },
                        new com.google.common.base.Predicate<GetBackupResponse>() {
                            @Override
                            public boolean apply(GetBackupResponse response) {
                                return targetStatesSet.contains(
                                        response.getBackup().getLifecycleState());
                            }
                        },
                        targetStatesSet.contains(
                                com.oracle.bmc.database.model.Backup.LifecycleState.Deleted)),
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
                    GetDataGuardAssociationRequest, GetDataGuardAssociationResponse>
            forDataGuardAssociation(
                    GetDataGuardAssociationRequest request,
                    com.oracle.bmc.database.model.DataGuardAssociation.LifecycleState...
                            targetStates) {
        org.apache.commons.lang3.Validate.notEmpty(
                targetStates, "At least one targetState must be provided");
        org.apache.commons.lang3.Validate.noNullElements(
                targetStates, "Null targetState values are not permitted");

        return forDataGuardAssociation(
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
                    GetDataGuardAssociationRequest, GetDataGuardAssociationResponse>
            forDataGuardAssociation(
                    GetDataGuardAssociationRequest request,
                    com.oracle.bmc.database.model.DataGuardAssociation.LifecycleState targetState,
                    com.oracle.bmc.waiter.TerminationStrategy terminationStrategy,
                    com.oracle.bmc.waiter.DelayStrategy delayStrategy) {
        org.apache.commons.lang3.Validate.notNull(targetState, "The targetState cannot be null");

        return forDataGuardAssociation(
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
                    GetDataGuardAssociationRequest, GetDataGuardAssociationResponse>
            forDataGuardAssociation(
                    GetDataGuardAssociationRequest request,
                    com.oracle.bmc.waiter.TerminationStrategy terminationStrategy,
                    com.oracle.bmc.waiter.DelayStrategy delayStrategy,
                    com.oracle.bmc.database.model.DataGuardAssociation.LifecycleState...
                            targetStates) {
        org.apache.commons.lang3.Validate.notEmpty(
                targetStates, "At least one target state must be provided");
        org.apache.commons.lang3.Validate.noNullElements(
                targetStates, "Null target states are not permitted");

        return forDataGuardAssociation(
                com.oracle.bmc.waiter.Waiters.newWaiter(terminationStrategy, delayStrategy),
                request,
                targetStates);
    }

    // Helper method to create a new Waiter for DataGuardAssociation.
    private com.oracle.bmc.waiter.Waiter<
                    GetDataGuardAssociationRequest, GetDataGuardAssociationResponse>
            forDataGuardAssociation(
                    com.oracle.bmc.waiter.BmcGenericWaiter waiter,
                    final GetDataGuardAssociationRequest request,
                    final com.oracle.bmc.database.model.DataGuardAssociation.LifecycleState...
                            targetStates) {
        final java.util.Set<com.oracle.bmc.database.model.DataGuardAssociation.LifecycleState>
                targetStatesSet = new java.util.HashSet<>(java.util.Arrays.asList(targetStates));

        return new com.oracle.bmc.waiter.internal.SimpleWaiterImpl<>(
                executorService,
                waiter.toCallable(
                        com.google.common.base.Suppliers.ofInstance(request),
                        new com.google.common.base.Function<
                                GetDataGuardAssociationRequest, GetDataGuardAssociationResponse>() {
                            @Override
                            public GetDataGuardAssociationResponse apply(
                                    GetDataGuardAssociationRequest request) {
                                return client.getDataGuardAssociation(request);
                            }
                        },
                        new com.google.common.base.Predicate<GetDataGuardAssociationResponse>() {
                            @Override
                            public boolean apply(GetDataGuardAssociationResponse response) {
                                return targetStatesSet.contains(
                                        response.getDataGuardAssociation().getLifecycleState());
                            }
                        },
                        targetStatesSet.contains(
                                com.oracle.bmc.database.model.DataGuardAssociation.LifecycleState
                                        .Terminated)),
                request);
    }

    /**
     * Creates a new {@link com.oracle.bmc.waiter.Waiter} using the default configuration.
     *
     * @param request the request to send
     * @param targetStates the desired states to wait for. If multiple states are provided then the waiter will return once the resource reaches any of the provided states
     * @return a new {@code Waiter} instance
     */
    public com.oracle.bmc.waiter.Waiter<GetDatabaseRequest, GetDatabaseResponse> forDatabase(
            GetDatabaseRequest request,
            com.oracle.bmc.database.model.Database.LifecycleState... targetStates) {
        org.apache.commons.lang3.Validate.notEmpty(
                targetStates, "At least one targetState must be provided");
        org.apache.commons.lang3.Validate.noNullElements(
                targetStates, "Null targetState values are not permitted");

        return forDatabase(
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
    public com.oracle.bmc.waiter.Waiter<GetDatabaseRequest, GetDatabaseResponse> forDatabase(
            GetDatabaseRequest request,
            com.oracle.bmc.database.model.Database.LifecycleState targetState,
            com.oracle.bmc.waiter.TerminationStrategy terminationStrategy,
            com.oracle.bmc.waiter.DelayStrategy delayStrategy) {
        org.apache.commons.lang3.Validate.notNull(targetState, "The targetState cannot be null");

        return forDatabase(
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
    public com.oracle.bmc.waiter.Waiter<GetDatabaseRequest, GetDatabaseResponse> forDatabase(
            GetDatabaseRequest request,
            com.oracle.bmc.waiter.TerminationStrategy terminationStrategy,
            com.oracle.bmc.waiter.DelayStrategy delayStrategy,
            com.oracle.bmc.database.model.Database.LifecycleState... targetStates) {
        org.apache.commons.lang3.Validate.notEmpty(
                targetStates, "At least one target state must be provided");
        org.apache.commons.lang3.Validate.noNullElements(
                targetStates, "Null target states are not permitted");

        return forDatabase(
                com.oracle.bmc.waiter.Waiters.newWaiter(terminationStrategy, delayStrategy),
                request,
                targetStates);
    }

    // Helper method to create a new Waiter for Database.
    private com.oracle.bmc.waiter.Waiter<GetDatabaseRequest, GetDatabaseResponse> forDatabase(
            com.oracle.bmc.waiter.BmcGenericWaiter waiter,
            final GetDatabaseRequest request,
            final com.oracle.bmc.database.model.Database.LifecycleState... targetStates) {
        final java.util.Set<com.oracle.bmc.database.model.Database.LifecycleState> targetStatesSet =
                new java.util.HashSet<>(java.util.Arrays.asList(targetStates));

        return new com.oracle.bmc.waiter.internal.SimpleWaiterImpl<>(
                executorService,
                waiter.toCallable(
                        com.google.common.base.Suppliers.ofInstance(request),
                        new com.google.common.base.Function<
                                GetDatabaseRequest, GetDatabaseResponse>() {
                            @Override
                            public GetDatabaseResponse apply(GetDatabaseRequest request) {
                                return client.getDatabase(request);
                            }
                        },
                        new com.google.common.base.Predicate<GetDatabaseResponse>() {
                            @Override
                            public boolean apply(GetDatabaseResponse response) {
                                return targetStatesSet.contains(
                                        response.getDatabase().getLifecycleState());
                            }
                        },
                        targetStatesSet.contains(
                                com.oracle.bmc.database.model.Database.LifecycleState.Terminated)),
                request);
    }

    /**
     * Creates a new {@link com.oracle.bmc.waiter.Waiter} using the default configuration.
     *
     * @param request the request to send
     * @param targetStates the desired states to wait for. If multiple states are provided then the waiter will return once the resource reaches any of the provided states
     * @return a new {@code Waiter} instance
     */
    public com.oracle.bmc.waiter.Waiter<GetDbHomeRequest, GetDbHomeResponse> forDbHome(
            GetDbHomeRequest request,
            com.oracle.bmc.database.model.DbHome.LifecycleState... targetStates) {
        org.apache.commons.lang3.Validate.notEmpty(
                targetStates, "At least one targetState must be provided");
        org.apache.commons.lang3.Validate.noNullElements(
                targetStates, "Null targetState values are not permitted");

        return forDbHome(
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
    public com.oracle.bmc.waiter.Waiter<GetDbHomeRequest, GetDbHomeResponse> forDbHome(
            GetDbHomeRequest request,
            com.oracle.bmc.database.model.DbHome.LifecycleState targetState,
            com.oracle.bmc.waiter.TerminationStrategy terminationStrategy,
            com.oracle.bmc.waiter.DelayStrategy delayStrategy) {
        org.apache.commons.lang3.Validate.notNull(targetState, "The targetState cannot be null");

        return forDbHome(
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
    public com.oracle.bmc.waiter.Waiter<GetDbHomeRequest, GetDbHomeResponse> forDbHome(
            GetDbHomeRequest request,
            com.oracle.bmc.waiter.TerminationStrategy terminationStrategy,
            com.oracle.bmc.waiter.DelayStrategy delayStrategy,
            com.oracle.bmc.database.model.DbHome.LifecycleState... targetStates) {
        org.apache.commons.lang3.Validate.notEmpty(
                targetStates, "At least one target state must be provided");
        org.apache.commons.lang3.Validate.noNullElements(
                targetStates, "Null target states are not permitted");

        return forDbHome(
                com.oracle.bmc.waiter.Waiters.newWaiter(terminationStrategy, delayStrategy),
                request,
                targetStates);
    }

    // Helper method to create a new Waiter for DbHome.
    private com.oracle.bmc.waiter.Waiter<GetDbHomeRequest, GetDbHomeResponse> forDbHome(
            com.oracle.bmc.waiter.BmcGenericWaiter waiter,
            final GetDbHomeRequest request,
            final com.oracle.bmc.database.model.DbHome.LifecycleState... targetStates) {
        final java.util.Set<com.oracle.bmc.database.model.DbHome.LifecycleState> targetStatesSet =
                new java.util.HashSet<>(java.util.Arrays.asList(targetStates));

        return new com.oracle.bmc.waiter.internal.SimpleWaiterImpl<>(
                executorService,
                waiter.toCallable(
                        com.google.common.base.Suppliers.ofInstance(request),
                        new com.google.common.base.Function<GetDbHomeRequest, GetDbHomeResponse>() {
                            @Override
                            public GetDbHomeResponse apply(GetDbHomeRequest request) {
                                return client.getDbHome(request);
                            }
                        },
                        new com.google.common.base.Predicate<GetDbHomeResponse>() {
                            @Override
                            public boolean apply(GetDbHomeResponse response) {
                                return targetStatesSet.contains(
                                        response.getDbHome().getLifecycleState());
                            }
                        },
                        targetStatesSet.contains(
                                com.oracle.bmc.database.model.DbHome.LifecycleState.Terminated)),
                request);
    }

    /**
     * Creates a new {@link com.oracle.bmc.waiter.Waiter} using the default configuration.
     *
     * @param request the request to send
     * @param targetStates the desired states to wait for. If multiple states are provided then the waiter will return once the resource reaches any of the provided states
     * @return a new {@code Waiter} instance
     */
    public com.oracle.bmc.waiter.Waiter<GetDbNodeRequest, GetDbNodeResponse> forDbNode(
            GetDbNodeRequest request,
            com.oracle.bmc.database.model.DbNode.LifecycleState... targetStates) {
        org.apache.commons.lang3.Validate.notEmpty(
                targetStates, "At least one targetState must be provided");
        org.apache.commons.lang3.Validate.noNullElements(
                targetStates, "Null targetState values are not permitted");

        return forDbNode(
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
    public com.oracle.bmc.waiter.Waiter<GetDbNodeRequest, GetDbNodeResponse> forDbNode(
            GetDbNodeRequest request,
            com.oracle.bmc.database.model.DbNode.LifecycleState targetState,
            com.oracle.bmc.waiter.TerminationStrategy terminationStrategy,
            com.oracle.bmc.waiter.DelayStrategy delayStrategy) {
        org.apache.commons.lang3.Validate.notNull(targetState, "The targetState cannot be null");

        return forDbNode(
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
    public com.oracle.bmc.waiter.Waiter<GetDbNodeRequest, GetDbNodeResponse> forDbNode(
            GetDbNodeRequest request,
            com.oracle.bmc.waiter.TerminationStrategy terminationStrategy,
            com.oracle.bmc.waiter.DelayStrategy delayStrategy,
            com.oracle.bmc.database.model.DbNode.LifecycleState... targetStates) {
        org.apache.commons.lang3.Validate.notEmpty(
                targetStates, "At least one target state must be provided");
        org.apache.commons.lang3.Validate.noNullElements(
                targetStates, "Null target states are not permitted");

        return forDbNode(
                com.oracle.bmc.waiter.Waiters.newWaiter(terminationStrategy, delayStrategy),
                request,
                targetStates);
    }

    // Helper method to create a new Waiter for DbNode.
    private com.oracle.bmc.waiter.Waiter<GetDbNodeRequest, GetDbNodeResponse> forDbNode(
            com.oracle.bmc.waiter.BmcGenericWaiter waiter,
            final GetDbNodeRequest request,
            final com.oracle.bmc.database.model.DbNode.LifecycleState... targetStates) {
        final java.util.Set<com.oracle.bmc.database.model.DbNode.LifecycleState> targetStatesSet =
                new java.util.HashSet<>(java.util.Arrays.asList(targetStates));

        return new com.oracle.bmc.waiter.internal.SimpleWaiterImpl<>(
                executorService,
                waiter.toCallable(
                        com.google.common.base.Suppliers.ofInstance(request),
                        new com.google.common.base.Function<GetDbNodeRequest, GetDbNodeResponse>() {
                            @Override
                            public GetDbNodeResponse apply(GetDbNodeRequest request) {
                                return client.getDbNode(request);
                            }
                        },
                        new com.google.common.base.Predicate<GetDbNodeResponse>() {
                            @Override
                            public boolean apply(GetDbNodeResponse response) {
                                return targetStatesSet.contains(
                                        response.getDbNode().getLifecycleState());
                            }
                        },
                        targetStatesSet.contains(
                                com.oracle.bmc.database.model.DbNode.LifecycleState.Terminated)),
                request);
    }

    /**
     * Creates a new {@link com.oracle.bmc.waiter.Waiter} using the default configuration.
     *
     * @param request the request to send
     * @param targetStates the desired states to wait for. If multiple states are provided then the waiter will return once the resource reaches any of the provided states
     * @return a new {@code Waiter} instance
     */
    public com.oracle.bmc.waiter.Waiter<GetDbSystemRequest, GetDbSystemResponse> forDbSystem(
            GetDbSystemRequest request,
            com.oracle.bmc.database.model.DbSystem.LifecycleState... targetStates) {
        org.apache.commons.lang3.Validate.notEmpty(
                targetStates, "At least one targetState must be provided");
        org.apache.commons.lang3.Validate.noNullElements(
                targetStates, "Null targetState values are not permitted");

        return forDbSystem(
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
    public com.oracle.bmc.waiter.Waiter<GetDbSystemRequest, GetDbSystemResponse> forDbSystem(
            GetDbSystemRequest request,
            com.oracle.bmc.database.model.DbSystem.LifecycleState targetState,
            com.oracle.bmc.waiter.TerminationStrategy terminationStrategy,
            com.oracle.bmc.waiter.DelayStrategy delayStrategy) {
        org.apache.commons.lang3.Validate.notNull(targetState, "The targetState cannot be null");

        return forDbSystem(
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
    public com.oracle.bmc.waiter.Waiter<GetDbSystemRequest, GetDbSystemResponse> forDbSystem(
            GetDbSystemRequest request,
            com.oracle.bmc.waiter.TerminationStrategy terminationStrategy,
            com.oracle.bmc.waiter.DelayStrategy delayStrategy,
            com.oracle.bmc.database.model.DbSystem.LifecycleState... targetStates) {
        org.apache.commons.lang3.Validate.notEmpty(
                targetStates, "At least one target state must be provided");
        org.apache.commons.lang3.Validate.noNullElements(
                targetStates, "Null target states are not permitted");

        return forDbSystem(
                com.oracle.bmc.waiter.Waiters.newWaiter(terminationStrategy, delayStrategy),
                request,
                targetStates);
    }

    // Helper method to create a new Waiter for DbSystem.
    private com.oracle.bmc.waiter.Waiter<GetDbSystemRequest, GetDbSystemResponse> forDbSystem(
            com.oracle.bmc.waiter.BmcGenericWaiter waiter,
            final GetDbSystemRequest request,
            final com.oracle.bmc.database.model.DbSystem.LifecycleState... targetStates) {
        final java.util.Set<com.oracle.bmc.database.model.DbSystem.LifecycleState> targetStatesSet =
                new java.util.HashSet<>(java.util.Arrays.asList(targetStates));

        return new com.oracle.bmc.waiter.internal.SimpleWaiterImpl<>(
                executorService,
                waiter.toCallable(
                        com.google.common.base.Suppliers.ofInstance(request),
                        new com.google.common.base.Function<
                                GetDbSystemRequest, GetDbSystemResponse>() {
                            @Override
                            public GetDbSystemResponse apply(GetDbSystemRequest request) {
                                return client.getDbSystem(request);
                            }
                        },
                        new com.google.common.base.Predicate<GetDbSystemResponse>() {
                            @Override
                            public boolean apply(GetDbSystemResponse response) {
                                return targetStatesSet.contains(
                                        response.getDbSystem().getLifecycleState());
                            }
                        },
                        targetStatesSet.contains(
                                com.oracle.bmc.database.model.DbSystem.LifecycleState.Terminated)),
                request);
    }

    /**
     * Creates a new {@link com.oracle.bmc.waiter.Waiter} using the default configuration.
     *
     * @param request the request to send
     * @param targetStates the desired states to wait for. If multiple states are provided then the waiter will return once the resource reaches any of the provided states
     * @return a new {@code Waiter} instance
     */
    public com.oracle.bmc.waiter.Waiter<GetExadataIormConfigRequest, GetExadataIormConfigResponse>
            forExadataIormConfig(
                    GetExadataIormConfigRequest request,
                    com.oracle.bmc.database.model.ExadataIormConfig.LifecycleState...
                            targetStates) {
        org.apache.commons.lang3.Validate.notEmpty(
                targetStates, "At least one targetState must be provided");
        org.apache.commons.lang3.Validate.noNullElements(
                targetStates, "Null targetState values are not permitted");

        return forExadataIormConfig(
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
    public com.oracle.bmc.waiter.Waiter<GetExadataIormConfigRequest, GetExadataIormConfigResponse>
            forExadataIormConfig(
                    GetExadataIormConfigRequest request,
                    com.oracle.bmc.database.model.ExadataIormConfig.LifecycleState targetState,
                    com.oracle.bmc.waiter.TerminationStrategy terminationStrategy,
                    com.oracle.bmc.waiter.DelayStrategy delayStrategy) {
        org.apache.commons.lang3.Validate.notNull(targetState, "The targetState cannot be null");

        return forExadataIormConfig(
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
    public com.oracle.bmc.waiter.Waiter<GetExadataIormConfigRequest, GetExadataIormConfigResponse>
            forExadataIormConfig(
                    GetExadataIormConfigRequest request,
                    com.oracle.bmc.waiter.TerminationStrategy terminationStrategy,
                    com.oracle.bmc.waiter.DelayStrategy delayStrategy,
                    com.oracle.bmc.database.model.ExadataIormConfig.LifecycleState...
                            targetStates) {
        org.apache.commons.lang3.Validate.notEmpty(
                targetStates, "At least one target state must be provided");
        org.apache.commons.lang3.Validate.noNullElements(
                targetStates, "Null target states are not permitted");

        return forExadataIormConfig(
                com.oracle.bmc.waiter.Waiters.newWaiter(terminationStrategy, delayStrategy),
                request,
                targetStates);
    }

    // Helper method to create a new Waiter for ExadataIormConfig.
    private com.oracle.bmc.waiter.Waiter<GetExadataIormConfigRequest, GetExadataIormConfigResponse>
            forExadataIormConfig(
                    com.oracle.bmc.waiter.BmcGenericWaiter waiter,
                    final GetExadataIormConfigRequest request,
                    final com.oracle.bmc.database.model.ExadataIormConfig.LifecycleState...
                            targetStates) {
        final java.util.Set<com.oracle.bmc.database.model.ExadataIormConfig.LifecycleState>
                targetStatesSet = new java.util.HashSet<>(java.util.Arrays.asList(targetStates));

        return new com.oracle.bmc.waiter.internal.SimpleWaiterImpl<>(
                executorService,
                waiter.toCallable(
                        com.google.common.base.Suppliers.ofInstance(request),
                        new com.google.common.base.Function<
                                GetExadataIormConfigRequest, GetExadataIormConfigResponse>() {
                            @Override
                            public GetExadataIormConfigResponse apply(
                                    GetExadataIormConfigRequest request) {
                                return client.getExadataIormConfig(request);
                            }
                        },
                        new com.google.common.base.Predicate<GetExadataIormConfigResponse>() {
                            @Override
                            public boolean apply(GetExadataIormConfigResponse response) {
                                return targetStatesSet.contains(
                                        response.getExadataIormConfig().getLifecycleState());
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
    public com.oracle.bmc.waiter.Waiter<GetMaintenanceRunRequest, GetMaintenanceRunResponse>
            forMaintenanceRun(
                    GetMaintenanceRunRequest request,
                    com.oracle.bmc.database.model.MaintenanceRun.LifecycleState... targetStates) {
        org.apache.commons.lang3.Validate.notEmpty(
                targetStates, "At least one targetState must be provided");
        org.apache.commons.lang3.Validate.noNullElements(
                targetStates, "Null targetState values are not permitted");

        return forMaintenanceRun(
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
    public com.oracle.bmc.waiter.Waiter<GetMaintenanceRunRequest, GetMaintenanceRunResponse>
            forMaintenanceRun(
                    GetMaintenanceRunRequest request,
                    com.oracle.bmc.database.model.MaintenanceRun.LifecycleState targetState,
                    com.oracle.bmc.waiter.TerminationStrategy terminationStrategy,
                    com.oracle.bmc.waiter.DelayStrategy delayStrategy) {
        org.apache.commons.lang3.Validate.notNull(targetState, "The targetState cannot be null");

        return forMaintenanceRun(
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
    public com.oracle.bmc.waiter.Waiter<GetMaintenanceRunRequest, GetMaintenanceRunResponse>
            forMaintenanceRun(
                    GetMaintenanceRunRequest request,
                    com.oracle.bmc.waiter.TerminationStrategy terminationStrategy,
                    com.oracle.bmc.waiter.DelayStrategy delayStrategy,
                    com.oracle.bmc.database.model.MaintenanceRun.LifecycleState... targetStates) {
        org.apache.commons.lang3.Validate.notEmpty(
                targetStates, "At least one target state must be provided");
        org.apache.commons.lang3.Validate.noNullElements(
                targetStates, "Null target states are not permitted");

        return forMaintenanceRun(
                com.oracle.bmc.waiter.Waiters.newWaiter(terminationStrategy, delayStrategy),
                request,
                targetStates);
    }

    // Helper method to create a new Waiter for MaintenanceRun.
    private com.oracle.bmc.waiter.Waiter<GetMaintenanceRunRequest, GetMaintenanceRunResponse>
            forMaintenanceRun(
                    com.oracle.bmc.waiter.BmcGenericWaiter waiter,
                    final GetMaintenanceRunRequest request,
                    final com.oracle.bmc.database.model.MaintenanceRun.LifecycleState...
                            targetStates) {
        final java.util.Set<com.oracle.bmc.database.model.MaintenanceRun.LifecycleState>
                targetStatesSet = new java.util.HashSet<>(java.util.Arrays.asList(targetStates));

        return new com.oracle.bmc.waiter.internal.SimpleWaiterImpl<>(
                executorService,
                waiter.toCallable(
                        com.google.common.base.Suppliers.ofInstance(request),
                        new com.google.common.base.Function<
                                GetMaintenanceRunRequest, GetMaintenanceRunResponse>() {
                            @Override
                            public GetMaintenanceRunResponse apply(
                                    GetMaintenanceRunRequest request) {
                                return client.getMaintenanceRun(request);
                            }
                        },
                        new com.google.common.base.Predicate<GetMaintenanceRunResponse>() {
                            @Override
                            public boolean apply(GetMaintenanceRunResponse response) {
                                return targetStatesSet.contains(
                                        response.getMaintenanceRun().getLifecycleState());
                            }
                        },
                        false),
                request);
    }

    /**
     * Creates a new {@link com.oracle.bmc.waiter.Waiter} using the default configuration.
     *
     * @param request the request to send
     * @return a new {@link com.oracle.bmc.waiter.Waiter} instance
     */
    public com.oracle.bmc.waiter.Waiter<
                    LaunchAutonomousExadataInfrastructureRequest,
                    LaunchAutonomousExadataInfrastructureResponse>
            forLaunchAutonomousExadataInfrastructure(
                    LaunchAutonomousExadataInfrastructureRequest request) {
        return forLaunchAutonomousExadataInfrastructure(
                request,
                com.oracle.bmc.waiter.Waiters.DEFAULT_POLLING_TERMINATION_STRATEGY,
                com.oracle.bmc.waiter.Waiters.DEFAULT_POLLING_DELAY_STRATEGY);
    }

    /**
     * Creates a new {@link com.oracle.bmc.waiter.Waiter} using the provided configuration.
     *
     * @param request the request to send
     * @param terminationStrategy the {@link com.oracle.bmc.waiter.TerminationStrategy} to use
     * @param delayStrategy the {@link com.oracle.bmc.waiter.DelayStrategy} to use
     * @return a new {@link com.oracle.bmc.waiter.Waiter} instance
     */
    public com.oracle.bmc.waiter.Waiter<
                    LaunchAutonomousExadataInfrastructureRequest,
                    LaunchAutonomousExadataInfrastructureResponse>
            forLaunchAutonomousExadataInfrastructure(
                    LaunchAutonomousExadataInfrastructureRequest request,
                    com.oracle.bmc.waiter.TerminationStrategy terminationStrategy,
                    com.oracle.bmc.waiter.DelayStrategy delayStrategy) {
        if (workRequestClient == null) {
            throw new IllegalStateException(
                    "A WorkRequestClient must be supplied to this waiter for this operation");
        }

        return new com.oracle.bmc.waiter.internal.SimpleWaiterImpl<>(
                executorService,
                new java.util.concurrent.Callable<LaunchAutonomousExadataInfrastructureResponse>() {
                    @Override
                    public LaunchAutonomousExadataInfrastructureResponse call() throws Exception {
                        final LaunchAutonomousExadataInfrastructureResponse response =
                                client.launchAutonomousExadataInfrastructure(request);

                        final com.oracle.bmc.workrequests.requests.GetWorkRequestRequest
                                getWorkRequestRequest =
                                        com.oracle.bmc.workrequests.requests.GetWorkRequestRequest
                                                .builder()
                                                .workRequestId(response.getOpcWorkRequestId())
                                                .build();
                        workRequestClient
                                .getWaiters()
                                .forWorkRequest(
                                        getWorkRequestRequest, terminationStrategy, delayStrategy)
                                .execute();
                        return response;
                    }
                },
                request);
    }

    /**
     * Creates a new {@link com.oracle.bmc.waiter.Waiter} using the default configuration.
     *
     * @param request the request to send
     * @return a new {@link com.oracle.bmc.waiter.Waiter} instance
     */
    public com.oracle.bmc.waiter.Waiter<
                    RestartAutonomousContainerDatabaseRequest,
                    RestartAutonomousContainerDatabaseResponse>
            forRestartAutonomousContainerDatabase(
                    RestartAutonomousContainerDatabaseRequest request) {
        return forRestartAutonomousContainerDatabase(
                request,
                com.oracle.bmc.waiter.Waiters.DEFAULT_POLLING_TERMINATION_STRATEGY,
                com.oracle.bmc.waiter.Waiters.DEFAULT_POLLING_DELAY_STRATEGY);
    }

    /**
     * Creates a new {@link com.oracle.bmc.waiter.Waiter} using the provided configuration.
     *
     * @param request the request to send
     * @param terminationStrategy the {@link com.oracle.bmc.waiter.TerminationStrategy} to use
     * @param delayStrategy the {@link com.oracle.bmc.waiter.DelayStrategy} to use
     * @return a new {@link com.oracle.bmc.waiter.Waiter} instance
     */
    public com.oracle.bmc.waiter.Waiter<
                    RestartAutonomousContainerDatabaseRequest,
                    RestartAutonomousContainerDatabaseResponse>
            forRestartAutonomousContainerDatabase(
                    RestartAutonomousContainerDatabaseRequest request,
                    com.oracle.bmc.waiter.TerminationStrategy terminationStrategy,
                    com.oracle.bmc.waiter.DelayStrategy delayStrategy) {
        if (workRequestClient == null) {
            throw new IllegalStateException(
                    "A WorkRequestClient must be supplied to this waiter for this operation");
        }

        return new com.oracle.bmc.waiter.internal.SimpleWaiterImpl<>(
                executorService,
                new java.util.concurrent.Callable<RestartAutonomousContainerDatabaseResponse>() {
                    @Override
                    public RestartAutonomousContainerDatabaseResponse call() throws Exception {
                        final RestartAutonomousContainerDatabaseResponse response =
                                client.restartAutonomousContainerDatabase(request);

                        final com.oracle.bmc.workrequests.requests.GetWorkRequestRequest
                                getWorkRequestRequest =
                                        com.oracle.bmc.workrequests.requests.GetWorkRequestRequest
                                                .builder()
                                                .workRequestId(response.getOpcWorkRequestId())
                                                .build();
                        workRequestClient
                                .getWaiters()
                                .forWorkRequest(
                                        getWorkRequestRequest, terminationStrategy, delayStrategy)
                                .execute();
                        return response;
                    }
                },
                request);
    }

    /**
     * Creates a new {@link com.oracle.bmc.waiter.Waiter} using the default configuration.
     *
     * @param request the request to send
     * @return a new {@link com.oracle.bmc.waiter.Waiter} instance
     */
    public com.oracle.bmc.waiter.Waiter<
                    RestoreAutonomousDatabaseRequest, RestoreAutonomousDatabaseResponse>
            forRestoreAutonomousDatabase(RestoreAutonomousDatabaseRequest request) {
        return forRestoreAutonomousDatabase(
                request,
                com.oracle.bmc.waiter.Waiters.DEFAULT_POLLING_TERMINATION_STRATEGY,
                com.oracle.bmc.waiter.Waiters.DEFAULT_POLLING_DELAY_STRATEGY);
    }

    /**
     * Creates a new {@link com.oracle.bmc.waiter.Waiter} using the provided configuration.
     *
     * @param request the request to send
     * @param terminationStrategy the {@link com.oracle.bmc.waiter.TerminationStrategy} to use
     * @param delayStrategy the {@link com.oracle.bmc.waiter.DelayStrategy} to use
     * @return a new {@link com.oracle.bmc.waiter.Waiter} instance
     */
    public com.oracle.bmc.waiter.Waiter<
                    RestoreAutonomousDatabaseRequest, RestoreAutonomousDatabaseResponse>
            forRestoreAutonomousDatabase(
                    RestoreAutonomousDatabaseRequest request,
                    com.oracle.bmc.waiter.TerminationStrategy terminationStrategy,
                    com.oracle.bmc.waiter.DelayStrategy delayStrategy) {
        if (workRequestClient == null) {
            throw new IllegalStateException(
                    "A WorkRequestClient must be supplied to this waiter for this operation");
        }

        return new com.oracle.bmc.waiter.internal.SimpleWaiterImpl<>(
                executorService,
                new java.util.concurrent.Callable<RestoreAutonomousDatabaseResponse>() {
                    @Override
                    public RestoreAutonomousDatabaseResponse call() throws Exception {
                        final RestoreAutonomousDatabaseResponse response =
                                client.restoreAutonomousDatabase(request);

                        final com.oracle.bmc.workrequests.requests.GetWorkRequestRequest
                                getWorkRequestRequest =
                                        com.oracle.bmc.workrequests.requests.GetWorkRequestRequest
                                                .builder()
                                                .workRequestId(response.getOpcWorkRequestId())
                                                .build();
                        workRequestClient
                                .getWaiters()
                                .forWorkRequest(
                                        getWorkRequestRequest, terminationStrategy, delayStrategy)
                                .execute();
                        return response;
                    }
                },
                request);
    }

    /**
     * Creates a new {@link com.oracle.bmc.waiter.Waiter} using the default configuration.
     *
     * @param request the request to send
     * @return a new {@link com.oracle.bmc.waiter.Waiter} instance
     */
    public com.oracle.bmc.waiter.Waiter<
                    StartAutonomousDatabaseRequest, StartAutonomousDatabaseResponse>
            forStartAutonomousDatabase(StartAutonomousDatabaseRequest request) {
        return forStartAutonomousDatabase(
                request,
                com.oracle.bmc.waiter.Waiters.DEFAULT_POLLING_TERMINATION_STRATEGY,
                com.oracle.bmc.waiter.Waiters.DEFAULT_POLLING_DELAY_STRATEGY);
    }

    /**
     * Creates a new {@link com.oracle.bmc.waiter.Waiter} using the provided configuration.
     *
     * @param request the request to send
     * @param terminationStrategy the {@link com.oracle.bmc.waiter.TerminationStrategy} to use
     * @param delayStrategy the {@link com.oracle.bmc.waiter.DelayStrategy} to use
     * @return a new {@link com.oracle.bmc.waiter.Waiter} instance
     */
    public com.oracle.bmc.waiter.Waiter<
                    StartAutonomousDatabaseRequest, StartAutonomousDatabaseResponse>
            forStartAutonomousDatabase(
                    StartAutonomousDatabaseRequest request,
                    com.oracle.bmc.waiter.TerminationStrategy terminationStrategy,
                    com.oracle.bmc.waiter.DelayStrategy delayStrategy) {
        if (workRequestClient == null) {
            throw new IllegalStateException(
                    "A WorkRequestClient must be supplied to this waiter for this operation");
        }

        return new com.oracle.bmc.waiter.internal.SimpleWaiterImpl<>(
                executorService,
                new java.util.concurrent.Callable<StartAutonomousDatabaseResponse>() {
                    @Override
                    public StartAutonomousDatabaseResponse call() throws Exception {
                        final StartAutonomousDatabaseResponse response =
                                client.startAutonomousDatabase(request);

                        final com.oracle.bmc.workrequests.requests.GetWorkRequestRequest
                                getWorkRequestRequest =
                                        com.oracle.bmc.workrequests.requests.GetWorkRequestRequest
                                                .builder()
                                                .workRequestId(response.getOpcWorkRequestId())
                                                .build();
                        workRequestClient
                                .getWaiters()
                                .forWorkRequest(
                                        getWorkRequestRequest, terminationStrategy, delayStrategy)
                                .execute();
                        return response;
                    }
                },
                request);
    }

    /**
     * Creates a new {@link com.oracle.bmc.waiter.Waiter} using the default configuration.
     *
     * @param request the request to send
     * @return a new {@link com.oracle.bmc.waiter.Waiter} instance
     */
    public com.oracle.bmc.waiter.Waiter<
                    StopAutonomousDatabaseRequest, StopAutonomousDatabaseResponse>
            forStopAutonomousDatabase(StopAutonomousDatabaseRequest request) {
        return forStopAutonomousDatabase(
                request,
                com.oracle.bmc.waiter.Waiters.DEFAULT_POLLING_TERMINATION_STRATEGY,
                com.oracle.bmc.waiter.Waiters.DEFAULT_POLLING_DELAY_STRATEGY);
    }

    /**
     * Creates a new {@link com.oracle.bmc.waiter.Waiter} using the provided configuration.
     *
     * @param request the request to send
     * @param terminationStrategy the {@link com.oracle.bmc.waiter.TerminationStrategy} to use
     * @param delayStrategy the {@link com.oracle.bmc.waiter.DelayStrategy} to use
     * @return a new {@link com.oracle.bmc.waiter.Waiter} instance
     */
    public com.oracle.bmc.waiter.Waiter<
                    StopAutonomousDatabaseRequest, StopAutonomousDatabaseResponse>
            forStopAutonomousDatabase(
                    StopAutonomousDatabaseRequest request,
                    com.oracle.bmc.waiter.TerminationStrategy terminationStrategy,
                    com.oracle.bmc.waiter.DelayStrategy delayStrategy) {
        if (workRequestClient == null) {
            throw new IllegalStateException(
                    "A WorkRequestClient must be supplied to this waiter for this operation");
        }

        return new com.oracle.bmc.waiter.internal.SimpleWaiterImpl<>(
                executorService,
                new java.util.concurrent.Callable<StopAutonomousDatabaseResponse>() {
                    @Override
                    public StopAutonomousDatabaseResponse call() throws Exception {
                        final StopAutonomousDatabaseResponse response =
                                client.stopAutonomousDatabase(request);

                        final com.oracle.bmc.workrequests.requests.GetWorkRequestRequest
                                getWorkRequestRequest =
                                        com.oracle.bmc.workrequests.requests.GetWorkRequestRequest
                                                .builder()
                                                .workRequestId(response.getOpcWorkRequestId())
                                                .build();
                        workRequestClient
                                .getWaiters()
                                .forWorkRequest(
                                        getWorkRequestRequest, terminationStrategy, delayStrategy)
                                .execute();
                        return response;
                    }
                },
                request);
    }

    /**
     * Creates a new {@link com.oracle.bmc.waiter.Waiter} using the default configuration.
     *
     * @param request the request to send
     * @return a new {@link com.oracle.bmc.waiter.Waiter} instance
     */
    public com.oracle.bmc.waiter.Waiter<
                    TerminateAutonomousContainerDatabaseRequest,
                    TerminateAutonomousContainerDatabaseResponse>
            forTerminateAutonomousContainerDatabase(
                    TerminateAutonomousContainerDatabaseRequest request) {
        return forTerminateAutonomousContainerDatabase(
                request,
                com.oracle.bmc.waiter.Waiters.DEFAULT_POLLING_TERMINATION_STRATEGY,
                com.oracle.bmc.waiter.Waiters.DEFAULT_POLLING_DELAY_STRATEGY);
    }

    /**
     * Creates a new {@link com.oracle.bmc.waiter.Waiter} using the provided configuration.
     *
     * @param request the request to send
     * @param terminationStrategy the {@link com.oracle.bmc.waiter.TerminationStrategy} to use
     * @param delayStrategy the {@link com.oracle.bmc.waiter.DelayStrategy} to use
     * @return a new {@link com.oracle.bmc.waiter.Waiter} instance
     */
    public com.oracle.bmc.waiter.Waiter<
                    TerminateAutonomousContainerDatabaseRequest,
                    TerminateAutonomousContainerDatabaseResponse>
            forTerminateAutonomousContainerDatabase(
                    TerminateAutonomousContainerDatabaseRequest request,
                    com.oracle.bmc.waiter.TerminationStrategy terminationStrategy,
                    com.oracle.bmc.waiter.DelayStrategy delayStrategy) {
        if (workRequestClient == null) {
            throw new IllegalStateException(
                    "A WorkRequestClient must be supplied to this waiter for this operation");
        }

        return new com.oracle.bmc.waiter.internal.SimpleWaiterImpl<>(
                executorService,
                new java.util.concurrent.Callable<TerminateAutonomousContainerDatabaseResponse>() {
                    @Override
                    public TerminateAutonomousContainerDatabaseResponse call() throws Exception {
                        final TerminateAutonomousContainerDatabaseResponse response =
                                client.terminateAutonomousContainerDatabase(request);

                        final com.oracle.bmc.workrequests.requests.GetWorkRequestRequest
                                getWorkRequestRequest =
                                        com.oracle.bmc.workrequests.requests.GetWorkRequestRequest
                                                .builder()
                                                .workRequestId(response.getOpcWorkRequestId())
                                                .build();
                        workRequestClient
                                .getWaiters()
                                .forWorkRequest(
                                        getWorkRequestRequest, terminationStrategy, delayStrategy)
                                .execute();
                        return response;
                    }
                },
                request);
    }

    /**
     * Creates a new {@link com.oracle.bmc.waiter.Waiter} using the default configuration.
     *
     * @param request the request to send
     * @return a new {@link com.oracle.bmc.waiter.Waiter} instance
     */
    public com.oracle.bmc.waiter.Waiter<
                    TerminateAutonomousExadataInfrastructureRequest,
                    TerminateAutonomousExadataInfrastructureResponse>
            forTerminateAutonomousExadataInfrastructure(
                    TerminateAutonomousExadataInfrastructureRequest request) {
        return forTerminateAutonomousExadataInfrastructure(
                request,
                com.oracle.bmc.waiter.Waiters.DEFAULT_POLLING_TERMINATION_STRATEGY,
                com.oracle.bmc.waiter.Waiters.DEFAULT_POLLING_DELAY_STRATEGY);
    }

    /**
     * Creates a new {@link com.oracle.bmc.waiter.Waiter} using the provided configuration.
     *
     * @param request the request to send
     * @param terminationStrategy the {@link com.oracle.bmc.waiter.TerminationStrategy} to use
     * @param delayStrategy the {@link com.oracle.bmc.waiter.DelayStrategy} to use
     * @return a new {@link com.oracle.bmc.waiter.Waiter} instance
     */
    public com.oracle.bmc.waiter.Waiter<
                    TerminateAutonomousExadataInfrastructureRequest,
                    TerminateAutonomousExadataInfrastructureResponse>
            forTerminateAutonomousExadataInfrastructure(
                    TerminateAutonomousExadataInfrastructureRequest request,
                    com.oracle.bmc.waiter.TerminationStrategy terminationStrategy,
                    com.oracle.bmc.waiter.DelayStrategy delayStrategy) {
        if (workRequestClient == null) {
            throw new IllegalStateException(
                    "A WorkRequestClient must be supplied to this waiter for this operation");
        }

        return new com.oracle.bmc.waiter.internal.SimpleWaiterImpl<>(
                executorService,
                new java.util.concurrent.Callable<
                        TerminateAutonomousExadataInfrastructureResponse>() {
                    @Override
                    public TerminateAutonomousExadataInfrastructureResponse call()
                            throws Exception {
                        final TerminateAutonomousExadataInfrastructureResponse response =
                                client.terminateAutonomousExadataInfrastructure(request);

                        final com.oracle.bmc.workrequests.requests.GetWorkRequestRequest
                                getWorkRequestRequest =
                                        com.oracle.bmc.workrequests.requests.GetWorkRequestRequest
                                                .builder()
                                                .workRequestId(response.getOpcWorkRequestId())
                                                .build();
                        workRequestClient
                                .getWaiters()
                                .forWorkRequest(
                                        getWorkRequestRequest, terminationStrategy, delayStrategy)
                                .execute();
                        return response;
                    }
                },
                request);
    }

    /**
     * Creates a new {@link com.oracle.bmc.waiter.Waiter} using the default configuration.
     *
     * @param request the request to send
     * @return a new {@link com.oracle.bmc.waiter.Waiter} instance
     */
    public com.oracle.bmc.waiter.Waiter<
                    UpdateAutonomousContainerDatabaseRequest,
                    UpdateAutonomousContainerDatabaseResponse>
            forUpdateAutonomousContainerDatabase(UpdateAutonomousContainerDatabaseRequest request) {
        return forUpdateAutonomousContainerDatabase(
                request,
                com.oracle.bmc.waiter.Waiters.DEFAULT_POLLING_TERMINATION_STRATEGY,
                com.oracle.bmc.waiter.Waiters.DEFAULT_POLLING_DELAY_STRATEGY);
    }

    /**
     * Creates a new {@link com.oracle.bmc.waiter.Waiter} using the provided configuration.
     *
     * @param request the request to send
     * @param terminationStrategy the {@link com.oracle.bmc.waiter.TerminationStrategy} to use
     * @param delayStrategy the {@link com.oracle.bmc.waiter.DelayStrategy} to use
     * @return a new {@link com.oracle.bmc.waiter.Waiter} instance
     */
    public com.oracle.bmc.waiter.Waiter<
                    UpdateAutonomousContainerDatabaseRequest,
                    UpdateAutonomousContainerDatabaseResponse>
            forUpdateAutonomousContainerDatabase(
                    UpdateAutonomousContainerDatabaseRequest request,
                    com.oracle.bmc.waiter.TerminationStrategy terminationStrategy,
                    com.oracle.bmc.waiter.DelayStrategy delayStrategy) {
        if (workRequestClient == null) {
            throw new IllegalStateException(
                    "A WorkRequestClient must be supplied to this waiter for this operation");
        }

        return new com.oracle.bmc.waiter.internal.SimpleWaiterImpl<>(
                executorService,
                new java.util.concurrent.Callable<UpdateAutonomousContainerDatabaseResponse>() {
                    @Override
                    public UpdateAutonomousContainerDatabaseResponse call() throws Exception {
                        final UpdateAutonomousContainerDatabaseResponse response =
                                client.updateAutonomousContainerDatabase(request);

                        final com.oracle.bmc.workrequests.requests.GetWorkRequestRequest
                                getWorkRequestRequest =
                                        com.oracle.bmc.workrequests.requests.GetWorkRequestRequest
                                                .builder()
                                                .workRequestId(response.getOpcWorkRequestId())
                                                .build();
                        workRequestClient
                                .getWaiters()
                                .forWorkRequest(
                                        getWorkRequestRequest, terminationStrategy, delayStrategy)
                                .execute();
                        return response;
                    }
                },
                request);
    }

    /**
     * Creates a new {@link com.oracle.bmc.waiter.Waiter} using the default configuration.
     *
     * @param request the request to send
     * @return a new {@link com.oracle.bmc.waiter.Waiter} instance
     */
    public com.oracle.bmc.waiter.Waiter<
                    UpdateAutonomousDatabaseRequest, UpdateAutonomousDatabaseResponse>
            forUpdateAutonomousDatabase(UpdateAutonomousDatabaseRequest request) {
        return forUpdateAutonomousDatabase(
                request,
                com.oracle.bmc.waiter.Waiters.DEFAULT_POLLING_TERMINATION_STRATEGY,
                com.oracle.bmc.waiter.Waiters.DEFAULT_POLLING_DELAY_STRATEGY);
    }

    /**
     * Creates a new {@link com.oracle.bmc.waiter.Waiter} using the provided configuration.
     *
     * @param request the request to send
     * @param terminationStrategy the {@link com.oracle.bmc.waiter.TerminationStrategy} to use
     * @param delayStrategy the {@link com.oracle.bmc.waiter.DelayStrategy} to use
     * @return a new {@link com.oracle.bmc.waiter.Waiter} instance
     */
    public com.oracle.bmc.waiter.Waiter<
                    UpdateAutonomousDatabaseRequest, UpdateAutonomousDatabaseResponse>
            forUpdateAutonomousDatabase(
                    UpdateAutonomousDatabaseRequest request,
                    com.oracle.bmc.waiter.TerminationStrategy terminationStrategy,
                    com.oracle.bmc.waiter.DelayStrategy delayStrategy) {
        if (workRequestClient == null) {
            throw new IllegalStateException(
                    "A WorkRequestClient must be supplied to this waiter for this operation");
        }

        return new com.oracle.bmc.waiter.internal.SimpleWaiterImpl<>(
                executorService,
                new java.util.concurrent.Callable<UpdateAutonomousDatabaseResponse>() {
                    @Override
                    public UpdateAutonomousDatabaseResponse call() throws Exception {
                        final UpdateAutonomousDatabaseResponse response =
                                client.updateAutonomousDatabase(request);

                        final com.oracle.bmc.workrequests.requests.GetWorkRequestRequest
                                getWorkRequestRequest =
                                        com.oracle.bmc.workrequests.requests.GetWorkRequestRequest
                                                .builder()
                                                .workRequestId(response.getOpcWorkRequestId())
                                                .build();
                        workRequestClient
                                .getWaiters()
                                .forWorkRequest(
                                        getWorkRequestRequest, terminationStrategy, delayStrategy)
                                .execute();
                        return response;
                    }
                },
                request);
    }

    /**
     * Creates a new {@link com.oracle.bmc.waiter.Waiter} using the default configuration.
     *
     * @param request the request to send
     * @return a new {@link com.oracle.bmc.waiter.Waiter} instance
     */
    public com.oracle.bmc.waiter.Waiter<
                    UpdateAutonomousExadataInfrastructureRequest,
                    UpdateAutonomousExadataInfrastructureResponse>
            forUpdateAutonomousExadataInfrastructure(
                    UpdateAutonomousExadataInfrastructureRequest request) {
        return forUpdateAutonomousExadataInfrastructure(
                request,
                com.oracle.bmc.waiter.Waiters.DEFAULT_POLLING_TERMINATION_STRATEGY,
                com.oracle.bmc.waiter.Waiters.DEFAULT_POLLING_DELAY_STRATEGY);
    }

    /**
     * Creates a new {@link com.oracle.bmc.waiter.Waiter} using the provided configuration.
     *
     * @param request the request to send
     * @param terminationStrategy the {@link com.oracle.bmc.waiter.TerminationStrategy} to use
     * @param delayStrategy the {@link com.oracle.bmc.waiter.DelayStrategy} to use
     * @return a new {@link com.oracle.bmc.waiter.Waiter} instance
     */
    public com.oracle.bmc.waiter.Waiter<
                    UpdateAutonomousExadataInfrastructureRequest,
                    UpdateAutonomousExadataInfrastructureResponse>
            forUpdateAutonomousExadataInfrastructure(
                    UpdateAutonomousExadataInfrastructureRequest request,
                    com.oracle.bmc.waiter.TerminationStrategy terminationStrategy,
                    com.oracle.bmc.waiter.DelayStrategy delayStrategy) {
        if (workRequestClient == null) {
            throw new IllegalStateException(
                    "A WorkRequestClient must be supplied to this waiter for this operation");
        }

        return new com.oracle.bmc.waiter.internal.SimpleWaiterImpl<>(
                executorService,
                new java.util.concurrent.Callable<UpdateAutonomousExadataInfrastructureResponse>() {
                    @Override
                    public UpdateAutonomousExadataInfrastructureResponse call() throws Exception {
                        final UpdateAutonomousExadataInfrastructureResponse response =
                                client.updateAutonomousExadataInfrastructure(request);

                        final com.oracle.bmc.workrequests.requests.GetWorkRequestRequest
                                getWorkRequestRequest =
                                        com.oracle.bmc.workrequests.requests.GetWorkRequestRequest
                                                .builder()
                                                .workRequestId(response.getOpcWorkRequestId())
                                                .build();
                        workRequestClient
                                .getWaiters()
                                .forWorkRequest(
                                        getWorkRequestRequest, terminationStrategy, delayStrategy)
                                .execute();
                        return response;
                    }
                },
                request);
    }
}
