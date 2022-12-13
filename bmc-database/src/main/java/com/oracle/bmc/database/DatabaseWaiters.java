/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
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
    @javax.annotation.Nonnull private final java.util.concurrent.ExecutorService executorService;
    @javax.annotation.Nonnull private final Database client;
    private final com.oracle.bmc.workrequests.WorkRequest workRequestClient;

    @Deprecated
    public DatabaseWaiters(
            @javax.annotation.Nonnull java.util.concurrent.ExecutorService executorService,
            @javax.annotation.Nonnull Database client) {
        this(executorService, client, null);
    }

    public DatabaseWaiters(
            @javax.annotation.Nonnull java.util.concurrent.ExecutorService executorService,
            @javax.annotation.Nonnull Database client,
            com.oracle.bmc.workrequests.WorkRequest workRequestClient) {
        if (executorService == null) {
            throw new NullPointerException("executorService is marked non-null but is null");
        }
        if (client == null) {
            throw new NullPointerException("client is marked non-null but is null");
        }
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
                    ActivateExadataInfrastructureRequest, ActivateExadataInfrastructureResponse>
            forActivateExadataInfrastructure(ActivateExadataInfrastructureRequest request) {
        return forActivateExadataInfrastructure(
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
                    ActivateExadataInfrastructureRequest, ActivateExadataInfrastructureResponse>
            forActivateExadataInfrastructure(
                    ActivateExadataInfrastructureRequest request,
                    com.oracle.bmc.waiter.TerminationStrategy terminationStrategy,
                    com.oracle.bmc.waiter.DelayStrategy delayStrategy) {
        if (workRequestClient == null) {
            throw new IllegalStateException(
                    "A WorkRequestClient must be supplied to this waiter for this operation");
        }

        return new com.oracle.bmc.waiter.internal.SimpleWaiterImpl<>(
                executorService,
                new java.util.concurrent.Callable<ActivateExadataInfrastructureResponse>() {
                    @Override
                    public ActivateExadataInfrastructureResponse call() throws Exception {
                        final ActivateExadataInfrastructureResponse response =
                                client.activateExadataInfrastructure(request);

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
                    AddStorageCapacityCloudExadataInfrastructureRequest,
                    AddStorageCapacityCloudExadataInfrastructureResponse>
            forAddStorageCapacityCloudExadataInfrastructure(
                    AddStorageCapacityCloudExadataInfrastructureRequest request) {
        return forAddStorageCapacityCloudExadataInfrastructure(
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
                    AddStorageCapacityCloudExadataInfrastructureRequest,
                    AddStorageCapacityCloudExadataInfrastructureResponse>
            forAddStorageCapacityCloudExadataInfrastructure(
                    AddStorageCapacityCloudExadataInfrastructureRequest request,
                    com.oracle.bmc.waiter.TerminationStrategy terminationStrategy,
                    com.oracle.bmc.waiter.DelayStrategy delayStrategy) {
        if (workRequestClient == null) {
            throw new IllegalStateException(
                    "A WorkRequestClient must be supplied to this waiter for this operation");
        }

        return new com.oracle.bmc.waiter.internal.SimpleWaiterImpl<>(
                executorService,
                new java.util.concurrent.Callable<
                        AddStorageCapacityCloudExadataInfrastructureResponse>() {
                    @Override
                    public AddStorageCapacityCloudExadataInfrastructureResponse call()
                            throws Exception {
                        final AddStorageCapacityCloudExadataInfrastructureResponse response =
                                client.addStorageCapacityCloudExadataInfrastructure(request);

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
                    AddStorageCapacityExadataInfrastructureRequest,
                    AddStorageCapacityExadataInfrastructureResponse>
            forAddStorageCapacityExadataInfrastructure(
                    AddStorageCapacityExadataInfrastructureRequest request) {
        return forAddStorageCapacityExadataInfrastructure(
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
                    AddStorageCapacityExadataInfrastructureRequest,
                    AddStorageCapacityExadataInfrastructureResponse>
            forAddStorageCapacityExadataInfrastructure(
                    AddStorageCapacityExadataInfrastructureRequest request,
                    com.oracle.bmc.waiter.TerminationStrategy terminationStrategy,
                    com.oracle.bmc.waiter.DelayStrategy delayStrategy) {
        if (workRequestClient == null) {
            throw new IllegalStateException(
                    "A WorkRequestClient must be supplied to this waiter for this operation");
        }

        return new com.oracle.bmc.waiter.internal.SimpleWaiterImpl<>(
                executorService,
                new java.util.concurrent.Callable<
                        AddStorageCapacityExadataInfrastructureResponse>() {
                    @Override
                    public AddStorageCapacityExadataInfrastructureResponse call() throws Exception {
                        final AddStorageCapacityExadataInfrastructureResponse response =
                                client.addStorageCapacityExadataInfrastructure(request);

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
                    AddVirtualMachineToCloudVmClusterRequest,
                    AddVirtualMachineToCloudVmClusterResponse>
            forAddVirtualMachineToCloudVmCluster(AddVirtualMachineToCloudVmClusterRequest request) {
        return forAddVirtualMachineToCloudVmCluster(
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
                    AddVirtualMachineToCloudVmClusterRequest,
                    AddVirtualMachineToCloudVmClusterResponse>
            forAddVirtualMachineToCloudVmCluster(
                    AddVirtualMachineToCloudVmClusterRequest request,
                    com.oracle.bmc.waiter.TerminationStrategy terminationStrategy,
                    com.oracle.bmc.waiter.DelayStrategy delayStrategy) {
        if (workRequestClient == null) {
            throw new IllegalStateException(
                    "A WorkRequestClient must be supplied to this waiter for this operation");
        }

        return new com.oracle.bmc.waiter.internal.SimpleWaiterImpl<>(
                executorService,
                new java.util.concurrent.Callable<AddVirtualMachineToCloudVmClusterResponse>() {
                    @Override
                    public AddVirtualMachineToCloudVmClusterResponse call() throws Exception {
                        final AddVirtualMachineToCloudVmClusterResponse response =
                                client.addVirtualMachineToCloudVmCluster(request);

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
                    AddVirtualMachineToVmClusterRequest, AddVirtualMachineToVmClusterResponse>
            forAddVirtualMachineToVmCluster(AddVirtualMachineToVmClusterRequest request) {
        return forAddVirtualMachineToVmCluster(
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
                    AddVirtualMachineToVmClusterRequest, AddVirtualMachineToVmClusterResponse>
            forAddVirtualMachineToVmCluster(
                    AddVirtualMachineToVmClusterRequest request,
                    com.oracle.bmc.waiter.TerminationStrategy terminationStrategy,
                    com.oracle.bmc.waiter.DelayStrategy delayStrategy) {
        if (workRequestClient == null) {
            throw new IllegalStateException(
                    "A WorkRequestClient must be supplied to this waiter for this operation");
        }

        return new com.oracle.bmc.waiter.internal.SimpleWaiterImpl<>(
                executorService,
                new java.util.concurrent.Callable<AddVirtualMachineToVmClusterResponse>() {
                    @Override
                    public AddVirtualMachineToVmClusterResponse call() throws Exception {
                        final AddVirtualMachineToVmClusterResponse response =
                                client.addVirtualMachineToVmCluster(request);

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
                    AutonomousDatabaseManualRefreshRequest, AutonomousDatabaseManualRefreshResponse>
            forAutonomousDatabaseManualRefresh(AutonomousDatabaseManualRefreshRequest request) {
        return forAutonomousDatabaseManualRefresh(
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
                    AutonomousDatabaseManualRefreshRequest, AutonomousDatabaseManualRefreshResponse>
            forAutonomousDatabaseManualRefresh(
                    AutonomousDatabaseManualRefreshRequest request,
                    com.oracle.bmc.waiter.TerminationStrategy terminationStrategy,
                    com.oracle.bmc.waiter.DelayStrategy delayStrategy) {
        if (workRequestClient == null) {
            throw new IllegalStateException(
                    "A WorkRequestClient must be supplied to this waiter for this operation");
        }

        return new com.oracle.bmc.waiter.internal.SimpleWaiterImpl<>(
                executorService,
                new java.util.concurrent.Callable<AutonomousDatabaseManualRefreshResponse>() {
                    @Override
                    public AutonomousDatabaseManualRefreshResponse call() throws Exception {
                        final AutonomousDatabaseManualRefreshResponse response =
                                client.autonomousDatabaseManualRefresh(request);

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
                    ChangeAutonomousVmClusterCompartmentRequest,
                    ChangeAutonomousVmClusterCompartmentResponse>
            forChangeAutonomousVmClusterCompartment(
                    ChangeAutonomousVmClusterCompartmentRequest request) {
        return forChangeAutonomousVmClusterCompartment(
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
                    ChangeAutonomousVmClusterCompartmentRequest,
                    ChangeAutonomousVmClusterCompartmentResponse>
            forChangeAutonomousVmClusterCompartment(
                    ChangeAutonomousVmClusterCompartmentRequest request,
                    com.oracle.bmc.waiter.TerminationStrategy terminationStrategy,
                    com.oracle.bmc.waiter.DelayStrategy delayStrategy) {
        if (workRequestClient == null) {
            throw new IllegalStateException(
                    "A WorkRequestClient must be supplied to this waiter for this operation");
        }

        return new com.oracle.bmc.waiter.internal.SimpleWaiterImpl<>(
                executorService,
                new java.util.concurrent.Callable<ChangeAutonomousVmClusterCompartmentResponse>() {
                    @Override
                    public ChangeAutonomousVmClusterCompartmentResponse call() throws Exception {
                        final ChangeAutonomousVmClusterCompartmentResponse response =
                                client.changeAutonomousVmClusterCompartment(request);

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
                    ChangeBackupDestinationCompartmentRequest,
                    ChangeBackupDestinationCompartmentResponse>
            forChangeBackupDestinationCompartment(
                    ChangeBackupDestinationCompartmentRequest request) {
        return forChangeBackupDestinationCompartment(
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
                    ChangeBackupDestinationCompartmentRequest,
                    ChangeBackupDestinationCompartmentResponse>
            forChangeBackupDestinationCompartment(
                    ChangeBackupDestinationCompartmentRequest request,
                    com.oracle.bmc.waiter.TerminationStrategy terminationStrategy,
                    com.oracle.bmc.waiter.DelayStrategy delayStrategy) {
        if (workRequestClient == null) {
            throw new IllegalStateException(
                    "A WorkRequestClient must be supplied to this waiter for this operation");
        }

        return new com.oracle.bmc.waiter.internal.SimpleWaiterImpl<>(
                executorService,
                new java.util.concurrent.Callable<ChangeBackupDestinationCompartmentResponse>() {
                    @Override
                    public ChangeBackupDestinationCompartmentResponse call() throws Exception {
                        final ChangeBackupDestinationCompartmentResponse response =
                                client.changeBackupDestinationCompartment(request);

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
                    ChangeCloudAutonomousVmClusterCompartmentRequest,
                    ChangeCloudAutonomousVmClusterCompartmentResponse>
            forChangeCloudAutonomousVmClusterCompartment(
                    ChangeCloudAutonomousVmClusterCompartmentRequest request) {
        return forChangeCloudAutonomousVmClusterCompartment(
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
                    ChangeCloudAutonomousVmClusterCompartmentRequest,
                    ChangeCloudAutonomousVmClusterCompartmentResponse>
            forChangeCloudAutonomousVmClusterCompartment(
                    ChangeCloudAutonomousVmClusterCompartmentRequest request,
                    com.oracle.bmc.waiter.TerminationStrategy terminationStrategy,
                    com.oracle.bmc.waiter.DelayStrategy delayStrategy) {
        if (workRequestClient == null) {
            throw new IllegalStateException(
                    "A WorkRequestClient must be supplied to this waiter for this operation");
        }

        return new com.oracle.bmc.waiter.internal.SimpleWaiterImpl<>(
                executorService,
                new java.util.concurrent.Callable<
                        ChangeCloudAutonomousVmClusterCompartmentResponse>() {
                    @Override
                    public ChangeCloudAutonomousVmClusterCompartmentResponse call()
                            throws Exception {
                        final ChangeCloudAutonomousVmClusterCompartmentResponse response =
                                client.changeCloudAutonomousVmClusterCompartment(request);

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
                    ChangeCloudExadataInfrastructureCompartmentRequest,
                    ChangeCloudExadataInfrastructureCompartmentResponse>
            forChangeCloudExadataInfrastructureCompartment(
                    ChangeCloudExadataInfrastructureCompartmentRequest request) {
        return forChangeCloudExadataInfrastructureCompartment(
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
                    ChangeCloudExadataInfrastructureCompartmentRequest,
                    ChangeCloudExadataInfrastructureCompartmentResponse>
            forChangeCloudExadataInfrastructureCompartment(
                    ChangeCloudExadataInfrastructureCompartmentRequest request,
                    com.oracle.bmc.waiter.TerminationStrategy terminationStrategy,
                    com.oracle.bmc.waiter.DelayStrategy delayStrategy) {
        if (workRequestClient == null) {
            throw new IllegalStateException(
                    "A WorkRequestClient must be supplied to this waiter for this operation");
        }

        return new com.oracle.bmc.waiter.internal.SimpleWaiterImpl<>(
                executorService,
                new java.util.concurrent.Callable<
                        ChangeCloudExadataInfrastructureCompartmentResponse>() {
                    @Override
                    public ChangeCloudExadataInfrastructureCompartmentResponse call()
                            throws Exception {
                        final ChangeCloudExadataInfrastructureCompartmentResponse response =
                                client.changeCloudExadataInfrastructureCompartment(request);

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
                    ChangeCloudVmClusterCompartmentRequest, ChangeCloudVmClusterCompartmentResponse>
            forChangeCloudVmClusterCompartment(ChangeCloudVmClusterCompartmentRequest request) {
        return forChangeCloudVmClusterCompartment(
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
                    ChangeCloudVmClusterCompartmentRequest, ChangeCloudVmClusterCompartmentResponse>
            forChangeCloudVmClusterCompartment(
                    ChangeCloudVmClusterCompartmentRequest request,
                    com.oracle.bmc.waiter.TerminationStrategy terminationStrategy,
                    com.oracle.bmc.waiter.DelayStrategy delayStrategy) {
        if (workRequestClient == null) {
            throw new IllegalStateException(
                    "A WorkRequestClient must be supplied to this waiter for this operation");
        }

        return new com.oracle.bmc.waiter.internal.SimpleWaiterImpl<>(
                executorService,
                new java.util.concurrent.Callable<ChangeCloudVmClusterCompartmentResponse>() {
                    @Override
                    public ChangeCloudVmClusterCompartmentResponse call() throws Exception {
                        final ChangeCloudVmClusterCompartmentResponse response =
                                client.changeCloudVmClusterCompartment(request);

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
                    ChangeDatabaseSoftwareImageCompartmentRequest,
                    ChangeDatabaseSoftwareImageCompartmentResponse>
            forChangeDatabaseSoftwareImageCompartment(
                    ChangeDatabaseSoftwareImageCompartmentRequest request) {
        return forChangeDatabaseSoftwareImageCompartment(
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
                    ChangeDatabaseSoftwareImageCompartmentRequest,
                    ChangeDatabaseSoftwareImageCompartmentResponse>
            forChangeDatabaseSoftwareImageCompartment(
                    ChangeDatabaseSoftwareImageCompartmentRequest request,
                    com.oracle.bmc.waiter.TerminationStrategy terminationStrategy,
                    com.oracle.bmc.waiter.DelayStrategy delayStrategy) {
        if (workRequestClient == null) {
            throw new IllegalStateException(
                    "A WorkRequestClient must be supplied to this waiter for this operation");
        }

        return new com.oracle.bmc.waiter.internal.SimpleWaiterImpl<>(
                executorService,
                new java.util.concurrent.Callable<
                        ChangeDatabaseSoftwareImageCompartmentResponse>() {
                    @Override
                    public ChangeDatabaseSoftwareImageCompartmentResponse call() throws Exception {
                        final ChangeDatabaseSoftwareImageCompartmentResponse response =
                                client.changeDatabaseSoftwareImageCompartment(request);

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
                    ChangeExadataInfrastructureCompartmentRequest,
                    ChangeExadataInfrastructureCompartmentResponse>
            forChangeExadataInfrastructureCompartment(
                    ChangeExadataInfrastructureCompartmentRequest request) {
        return forChangeExadataInfrastructureCompartment(
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
                    ChangeExadataInfrastructureCompartmentRequest,
                    ChangeExadataInfrastructureCompartmentResponse>
            forChangeExadataInfrastructureCompartment(
                    ChangeExadataInfrastructureCompartmentRequest request,
                    com.oracle.bmc.waiter.TerminationStrategy terminationStrategy,
                    com.oracle.bmc.waiter.DelayStrategy delayStrategy) {
        if (workRequestClient == null) {
            throw new IllegalStateException(
                    "A WorkRequestClient must be supplied to this waiter for this operation");
        }

        return new com.oracle.bmc.waiter.internal.SimpleWaiterImpl<>(
                executorService,
                new java.util.concurrent.Callable<
                        ChangeExadataInfrastructureCompartmentResponse>() {
                    @Override
                    public ChangeExadataInfrastructureCompartmentResponse call() throws Exception {
                        final ChangeExadataInfrastructureCompartmentResponse response =
                                client.changeExadataInfrastructureCompartment(request);

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
                    ChangeExternalContainerDatabaseCompartmentRequest,
                    ChangeExternalContainerDatabaseCompartmentResponse>
            forChangeExternalContainerDatabaseCompartment(
                    ChangeExternalContainerDatabaseCompartmentRequest request) {
        return forChangeExternalContainerDatabaseCompartment(
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
                    ChangeExternalContainerDatabaseCompartmentRequest,
                    ChangeExternalContainerDatabaseCompartmentResponse>
            forChangeExternalContainerDatabaseCompartment(
                    ChangeExternalContainerDatabaseCompartmentRequest request,
                    com.oracle.bmc.waiter.TerminationStrategy terminationStrategy,
                    com.oracle.bmc.waiter.DelayStrategy delayStrategy) {
        if (workRequestClient == null) {
            throw new IllegalStateException(
                    "A WorkRequestClient must be supplied to this waiter for this operation");
        }

        return new com.oracle.bmc.waiter.internal.SimpleWaiterImpl<>(
                executorService,
                new java.util.concurrent.Callable<
                        ChangeExternalContainerDatabaseCompartmentResponse>() {
                    @Override
                    public ChangeExternalContainerDatabaseCompartmentResponse call()
                            throws Exception {
                        final ChangeExternalContainerDatabaseCompartmentResponse response =
                                client.changeExternalContainerDatabaseCompartment(request);

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
                    ChangeExternalNonContainerDatabaseCompartmentRequest,
                    ChangeExternalNonContainerDatabaseCompartmentResponse>
            forChangeExternalNonContainerDatabaseCompartment(
                    ChangeExternalNonContainerDatabaseCompartmentRequest request) {
        return forChangeExternalNonContainerDatabaseCompartment(
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
                    ChangeExternalNonContainerDatabaseCompartmentRequest,
                    ChangeExternalNonContainerDatabaseCompartmentResponse>
            forChangeExternalNonContainerDatabaseCompartment(
                    ChangeExternalNonContainerDatabaseCompartmentRequest request,
                    com.oracle.bmc.waiter.TerminationStrategy terminationStrategy,
                    com.oracle.bmc.waiter.DelayStrategy delayStrategy) {
        if (workRequestClient == null) {
            throw new IllegalStateException(
                    "A WorkRequestClient must be supplied to this waiter for this operation");
        }

        return new com.oracle.bmc.waiter.internal.SimpleWaiterImpl<>(
                executorService,
                new java.util.concurrent.Callable<
                        ChangeExternalNonContainerDatabaseCompartmentResponse>() {
                    @Override
                    public ChangeExternalNonContainerDatabaseCompartmentResponse call()
                            throws Exception {
                        final ChangeExternalNonContainerDatabaseCompartmentResponse response =
                                client.changeExternalNonContainerDatabaseCompartment(request);

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
                    ChangeExternalPluggableDatabaseCompartmentRequest,
                    ChangeExternalPluggableDatabaseCompartmentResponse>
            forChangeExternalPluggableDatabaseCompartment(
                    ChangeExternalPluggableDatabaseCompartmentRequest request) {
        return forChangeExternalPluggableDatabaseCompartment(
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
                    ChangeExternalPluggableDatabaseCompartmentRequest,
                    ChangeExternalPluggableDatabaseCompartmentResponse>
            forChangeExternalPluggableDatabaseCompartment(
                    ChangeExternalPluggableDatabaseCompartmentRequest request,
                    com.oracle.bmc.waiter.TerminationStrategy terminationStrategy,
                    com.oracle.bmc.waiter.DelayStrategy delayStrategy) {
        if (workRequestClient == null) {
            throw new IllegalStateException(
                    "A WorkRequestClient must be supplied to this waiter for this operation");
        }

        return new com.oracle.bmc.waiter.internal.SimpleWaiterImpl<>(
                executorService,
                new java.util.concurrent.Callable<
                        ChangeExternalPluggableDatabaseCompartmentResponse>() {
                    @Override
                    public ChangeExternalPluggableDatabaseCompartmentResponse call()
                            throws Exception {
                        final ChangeExternalPluggableDatabaseCompartmentResponse response =
                                client.changeExternalPluggableDatabaseCompartment(request);

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
                    ChangeKeyStoreCompartmentRequest, ChangeKeyStoreCompartmentResponse>
            forChangeKeyStoreCompartment(ChangeKeyStoreCompartmentRequest request) {
        return forChangeKeyStoreCompartment(
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
                    ChangeKeyStoreCompartmentRequest, ChangeKeyStoreCompartmentResponse>
            forChangeKeyStoreCompartment(
                    ChangeKeyStoreCompartmentRequest request,
                    com.oracle.bmc.waiter.TerminationStrategy terminationStrategy,
                    com.oracle.bmc.waiter.DelayStrategy delayStrategy) {
        if (workRequestClient == null) {
            throw new IllegalStateException(
                    "A WorkRequestClient must be supplied to this waiter for this operation");
        }

        return new com.oracle.bmc.waiter.internal.SimpleWaiterImpl<>(
                executorService,
                new java.util.concurrent.Callable<ChangeKeyStoreCompartmentResponse>() {
                    @Override
                    public ChangeKeyStoreCompartmentResponse call() throws Exception {
                        final ChangeKeyStoreCompartmentResponse response =
                                client.changeKeyStoreCompartment(request);

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
                    ChangeVmClusterCompartmentRequest, ChangeVmClusterCompartmentResponse>
            forChangeVmClusterCompartment(ChangeVmClusterCompartmentRequest request) {
        return forChangeVmClusterCompartment(
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
                    ChangeVmClusterCompartmentRequest, ChangeVmClusterCompartmentResponse>
            forChangeVmClusterCompartment(
                    ChangeVmClusterCompartmentRequest request,
                    com.oracle.bmc.waiter.TerminationStrategy terminationStrategy,
                    com.oracle.bmc.waiter.DelayStrategy delayStrategy) {
        if (workRequestClient == null) {
            throw new IllegalStateException(
                    "A WorkRequestClient must be supplied to this waiter for this operation");
        }

        return new com.oracle.bmc.waiter.internal.SimpleWaiterImpl<>(
                executorService,
                new java.util.concurrent.Callable<ChangeVmClusterCompartmentResponse>() {
                    @Override
                    public ChangeVmClusterCompartmentResponse call() throws Exception {
                        final ChangeVmClusterCompartmentResponse response =
                                client.changeVmClusterCompartment(request);

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
                    CheckExternalDatabaseConnectorConnectionStatusRequest,
                    CheckExternalDatabaseConnectorConnectionStatusResponse>
            forCheckExternalDatabaseConnectorConnectionStatus(
                    CheckExternalDatabaseConnectorConnectionStatusRequest request) {
        return forCheckExternalDatabaseConnectorConnectionStatus(
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
                    CheckExternalDatabaseConnectorConnectionStatusRequest,
                    CheckExternalDatabaseConnectorConnectionStatusResponse>
            forCheckExternalDatabaseConnectorConnectionStatus(
                    CheckExternalDatabaseConnectorConnectionStatusRequest request,
                    com.oracle.bmc.waiter.TerminationStrategy terminationStrategy,
                    com.oracle.bmc.waiter.DelayStrategy delayStrategy) {
        if (workRequestClient == null) {
            throw new IllegalStateException(
                    "A WorkRequestClient must be supplied to this waiter for this operation");
        }

        return new com.oracle.bmc.waiter.internal.SimpleWaiterImpl<>(
                executorService,
                new java.util.concurrent.Callable<
                        CheckExternalDatabaseConnectorConnectionStatusResponse>() {
                    @Override
                    public CheckExternalDatabaseConnectorConnectionStatusResponse call()
                            throws Exception {
                        final CheckExternalDatabaseConnectorConnectionStatusResponse response =
                                client.checkExternalDatabaseConnectorConnectionStatus(request);

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
                    CompleteExternalBackupJobRequest, CompleteExternalBackupJobResponse>
            forCompleteExternalBackupJob(CompleteExternalBackupJobRequest request) {
        return forCompleteExternalBackupJob(
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
                    CompleteExternalBackupJobRequest, CompleteExternalBackupJobResponse>
            forCompleteExternalBackupJob(
                    CompleteExternalBackupJobRequest request,
                    com.oracle.bmc.waiter.TerminationStrategy terminationStrategy,
                    com.oracle.bmc.waiter.DelayStrategy delayStrategy) {
        if (workRequestClient == null) {
            throw new IllegalStateException(
                    "A WorkRequestClient must be supplied to this waiter for this operation");
        }

        return new com.oracle.bmc.waiter.internal.SimpleWaiterImpl<>(
                executorService,
                new java.util.concurrent.Callable<CompleteExternalBackupJobResponse>() {
                    @Override
                    public CompleteExternalBackupJobResponse call() throws Exception {
                        final CompleteExternalBackupJobResponse response =
                                client.completeExternalBackupJob(request);

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
                    ConfigureAutonomousDatabaseVaultKeyRequest,
                    ConfigureAutonomousDatabaseVaultKeyResponse>
            forConfigureAutonomousDatabaseVaultKey(
                    ConfigureAutonomousDatabaseVaultKeyRequest request) {
        return forConfigureAutonomousDatabaseVaultKey(
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
                    ConfigureAutonomousDatabaseVaultKeyRequest,
                    ConfigureAutonomousDatabaseVaultKeyResponse>
            forConfigureAutonomousDatabaseVaultKey(
                    ConfigureAutonomousDatabaseVaultKeyRequest request,
                    com.oracle.bmc.waiter.TerminationStrategy terminationStrategy,
                    com.oracle.bmc.waiter.DelayStrategy delayStrategy) {
        if (workRequestClient == null) {
            throw new IllegalStateException(
                    "A WorkRequestClient must be supplied to this waiter for this operation");
        }

        return new com.oracle.bmc.waiter.internal.SimpleWaiterImpl<>(
                executorService,
                new java.util.concurrent.Callable<ConfigureAutonomousDatabaseVaultKeyResponse>() {
                    @Override
                    public ConfigureAutonomousDatabaseVaultKeyResponse call() throws Exception {
                        final ConfigureAutonomousDatabaseVaultKeyResponse response =
                                client.configureAutonomousDatabaseVaultKey(request);

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
    public com.oracle.bmc.waiter.Waiter<ConvertToPdbRequest, ConvertToPdbResponse> forConvertToPdb(
            ConvertToPdbRequest request) {
        return forConvertToPdb(
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
    public com.oracle.bmc.waiter.Waiter<ConvertToPdbRequest, ConvertToPdbResponse> forConvertToPdb(
            ConvertToPdbRequest request,
            com.oracle.bmc.waiter.TerminationStrategy terminationStrategy,
            com.oracle.bmc.waiter.DelayStrategy delayStrategy) {
        if (workRequestClient == null) {
            throw new IllegalStateException(
                    "A WorkRequestClient must be supplied to this waiter for this operation");
        }

        return new com.oracle.bmc.waiter.internal.SimpleWaiterImpl<>(
                executorService,
                new java.util.concurrent.Callable<ConvertToPdbResponse>() {
                    @Override
                    public ConvertToPdbResponse call() throws Exception {
                        final ConvertToPdbResponse response = client.convertToPdb(request);

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
                    CreateAutonomousVmClusterRequest, CreateAutonomousVmClusterResponse>
            forCreateAutonomousVmCluster(CreateAutonomousVmClusterRequest request) {
        return forCreateAutonomousVmCluster(
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
                    CreateAutonomousVmClusterRequest, CreateAutonomousVmClusterResponse>
            forCreateAutonomousVmCluster(
                    CreateAutonomousVmClusterRequest request,
                    com.oracle.bmc.waiter.TerminationStrategy terminationStrategy,
                    com.oracle.bmc.waiter.DelayStrategy delayStrategy) {
        if (workRequestClient == null) {
            throw new IllegalStateException(
                    "A WorkRequestClient must be supplied to this waiter for this operation");
        }

        return new com.oracle.bmc.waiter.internal.SimpleWaiterImpl<>(
                executorService,
                new java.util.concurrent.Callable<CreateAutonomousVmClusterResponse>() {
                    @Override
                    public CreateAutonomousVmClusterResponse call() throws Exception {
                        final CreateAutonomousVmClusterResponse response =
                                client.createAutonomousVmCluster(request);

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
    public com.oracle.bmc.waiter.Waiter<CreateBackupRequest, CreateBackupResponse> forCreateBackup(
            CreateBackupRequest request) {
        return forCreateBackup(
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
    public com.oracle.bmc.waiter.Waiter<CreateBackupRequest, CreateBackupResponse> forCreateBackup(
            CreateBackupRequest request,
            com.oracle.bmc.waiter.TerminationStrategy terminationStrategy,
            com.oracle.bmc.waiter.DelayStrategy delayStrategy) {
        if (workRequestClient == null) {
            throw new IllegalStateException(
                    "A WorkRequestClient must be supplied to this waiter for this operation");
        }

        return new com.oracle.bmc.waiter.internal.SimpleWaiterImpl<>(
                executorService,
                new java.util.concurrent.Callable<CreateBackupResponse>() {
                    @Override
                    public CreateBackupResponse call() throws Exception {
                        final CreateBackupResponse response = client.createBackup(request);

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
                    CreateCloudAutonomousVmClusterRequest, CreateCloudAutonomousVmClusterResponse>
            forCreateCloudAutonomousVmCluster(CreateCloudAutonomousVmClusterRequest request) {
        return forCreateCloudAutonomousVmCluster(
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
                    CreateCloudAutonomousVmClusterRequest, CreateCloudAutonomousVmClusterResponse>
            forCreateCloudAutonomousVmCluster(
                    CreateCloudAutonomousVmClusterRequest request,
                    com.oracle.bmc.waiter.TerminationStrategy terminationStrategy,
                    com.oracle.bmc.waiter.DelayStrategy delayStrategy) {
        if (workRequestClient == null) {
            throw new IllegalStateException(
                    "A WorkRequestClient must be supplied to this waiter for this operation");
        }

        return new com.oracle.bmc.waiter.internal.SimpleWaiterImpl<>(
                executorService,
                new java.util.concurrent.Callable<CreateCloudAutonomousVmClusterResponse>() {
                    @Override
                    public CreateCloudAutonomousVmClusterResponse call() throws Exception {
                        final CreateCloudAutonomousVmClusterResponse response =
                                client.createCloudAutonomousVmCluster(request);

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
                    CreateCloudExadataInfrastructureRequest,
                    CreateCloudExadataInfrastructureResponse>
            forCreateCloudExadataInfrastructure(CreateCloudExadataInfrastructureRequest request) {
        return forCreateCloudExadataInfrastructure(
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
                    CreateCloudExadataInfrastructureRequest,
                    CreateCloudExadataInfrastructureResponse>
            forCreateCloudExadataInfrastructure(
                    CreateCloudExadataInfrastructureRequest request,
                    com.oracle.bmc.waiter.TerminationStrategy terminationStrategy,
                    com.oracle.bmc.waiter.DelayStrategy delayStrategy) {
        if (workRequestClient == null) {
            throw new IllegalStateException(
                    "A WorkRequestClient must be supplied to this waiter for this operation");
        }

        return new com.oracle.bmc.waiter.internal.SimpleWaiterImpl<>(
                executorService,
                new java.util.concurrent.Callable<CreateCloudExadataInfrastructureResponse>() {
                    @Override
                    public CreateCloudExadataInfrastructureResponse call() throws Exception {
                        final CreateCloudExadataInfrastructureResponse response =
                                client.createCloudExadataInfrastructure(request);

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
    public com.oracle.bmc.waiter.Waiter<CreateCloudVmClusterRequest, CreateCloudVmClusterResponse>
            forCreateCloudVmCluster(CreateCloudVmClusterRequest request) {
        return forCreateCloudVmCluster(
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
    public com.oracle.bmc.waiter.Waiter<CreateCloudVmClusterRequest, CreateCloudVmClusterResponse>
            forCreateCloudVmCluster(
                    CreateCloudVmClusterRequest request,
                    com.oracle.bmc.waiter.TerminationStrategy terminationStrategy,
                    com.oracle.bmc.waiter.DelayStrategy delayStrategy) {
        if (workRequestClient == null) {
            throw new IllegalStateException(
                    "A WorkRequestClient must be supplied to this waiter for this operation");
        }

        return new com.oracle.bmc.waiter.internal.SimpleWaiterImpl<>(
                executorService,
                new java.util.concurrent.Callable<CreateCloudVmClusterResponse>() {
                    @Override
                    public CreateCloudVmClusterResponse call() throws Exception {
                        final CreateCloudVmClusterResponse response =
                                client.createCloudVmCluster(request);

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
                    CreateDataGuardAssociationRequest, CreateDataGuardAssociationResponse>
            forCreateDataGuardAssociation(CreateDataGuardAssociationRequest request) {
        return forCreateDataGuardAssociation(
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
                    CreateDataGuardAssociationRequest, CreateDataGuardAssociationResponse>
            forCreateDataGuardAssociation(
                    CreateDataGuardAssociationRequest request,
                    com.oracle.bmc.waiter.TerminationStrategy terminationStrategy,
                    com.oracle.bmc.waiter.DelayStrategy delayStrategy) {
        if (workRequestClient == null) {
            throw new IllegalStateException(
                    "A WorkRequestClient must be supplied to this waiter for this operation");
        }

        return new com.oracle.bmc.waiter.internal.SimpleWaiterImpl<>(
                executorService,
                new java.util.concurrent.Callable<CreateDataGuardAssociationResponse>() {
                    @Override
                    public CreateDataGuardAssociationResponse call() throws Exception {
                        final CreateDataGuardAssociationResponse response =
                                client.createDataGuardAssociation(request);

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
    public com.oracle.bmc.waiter.Waiter<CreateDatabaseRequest, CreateDatabaseResponse>
            forCreateDatabase(CreateDatabaseRequest request) {
        return forCreateDatabase(
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
    public com.oracle.bmc.waiter.Waiter<CreateDatabaseRequest, CreateDatabaseResponse>
            forCreateDatabase(
                    CreateDatabaseRequest request,
                    com.oracle.bmc.waiter.TerminationStrategy terminationStrategy,
                    com.oracle.bmc.waiter.DelayStrategy delayStrategy) {
        if (workRequestClient == null) {
            throw new IllegalStateException(
                    "A WorkRequestClient must be supplied to this waiter for this operation");
        }

        return new com.oracle.bmc.waiter.internal.SimpleWaiterImpl<>(
                executorService,
                new java.util.concurrent.Callable<CreateDatabaseResponse>() {
                    @Override
                    public CreateDatabaseResponse call() throws Exception {
                        final CreateDatabaseResponse response = client.createDatabase(request);

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
                    CreateDatabaseSoftwareImageRequest, CreateDatabaseSoftwareImageResponse>
            forCreateDatabaseSoftwareImage(CreateDatabaseSoftwareImageRequest request) {
        return forCreateDatabaseSoftwareImage(
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
                    CreateDatabaseSoftwareImageRequest, CreateDatabaseSoftwareImageResponse>
            forCreateDatabaseSoftwareImage(
                    CreateDatabaseSoftwareImageRequest request,
                    com.oracle.bmc.waiter.TerminationStrategy terminationStrategy,
                    com.oracle.bmc.waiter.DelayStrategy delayStrategy) {
        if (workRequestClient == null) {
            throw new IllegalStateException(
                    "A WorkRequestClient must be supplied to this waiter for this operation");
        }

        return new com.oracle.bmc.waiter.internal.SimpleWaiterImpl<>(
                executorService,
                new java.util.concurrent.Callable<CreateDatabaseSoftwareImageResponse>() {
                    @Override
                    public CreateDatabaseSoftwareImageResponse call() throws Exception {
                        final CreateDatabaseSoftwareImageResponse response =
                                client.createDatabaseSoftwareImage(request);

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
    public com.oracle.bmc.waiter.Waiter<CreateDbHomeRequest, CreateDbHomeResponse> forCreateDbHome(
            CreateDbHomeRequest request) {
        return forCreateDbHome(
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
    public com.oracle.bmc.waiter.Waiter<CreateDbHomeRequest, CreateDbHomeResponse> forCreateDbHome(
            CreateDbHomeRequest request,
            com.oracle.bmc.waiter.TerminationStrategy terminationStrategy,
            com.oracle.bmc.waiter.DelayStrategy delayStrategy) {
        if (workRequestClient == null) {
            throw new IllegalStateException(
                    "A WorkRequestClient must be supplied to this waiter for this operation");
        }

        return new com.oracle.bmc.waiter.internal.SimpleWaiterImpl<>(
                executorService,
                new java.util.concurrent.Callable<CreateDbHomeResponse>() {
                    @Override
                    public CreateDbHomeResponse call() throws Exception {
                        final CreateDbHomeResponse response = client.createDbHome(request);

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
                    CreateExadataInfrastructureRequest, CreateExadataInfrastructureResponse>
            forCreateExadataInfrastructure(CreateExadataInfrastructureRequest request) {
        return forCreateExadataInfrastructure(
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
                    CreateExadataInfrastructureRequest, CreateExadataInfrastructureResponse>
            forCreateExadataInfrastructure(
                    CreateExadataInfrastructureRequest request,
                    com.oracle.bmc.waiter.TerminationStrategy terminationStrategy,
                    com.oracle.bmc.waiter.DelayStrategy delayStrategy) {
        if (workRequestClient == null) {
            throw new IllegalStateException(
                    "A WorkRequestClient must be supplied to this waiter for this operation");
        }

        return new com.oracle.bmc.waiter.internal.SimpleWaiterImpl<>(
                executorService,
                new java.util.concurrent.Callable<CreateExadataInfrastructureResponse>() {
                    @Override
                    public CreateExadataInfrastructureResponse call() throws Exception {
                        final CreateExadataInfrastructureResponse response =
                                client.createExadataInfrastructure(request);

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
                    CreateExternalBackupJobRequest, CreateExternalBackupJobResponse>
            forCreateExternalBackupJob(CreateExternalBackupJobRequest request) {
        return forCreateExternalBackupJob(
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
                    CreateExternalBackupJobRequest, CreateExternalBackupJobResponse>
            forCreateExternalBackupJob(
                    CreateExternalBackupJobRequest request,
                    com.oracle.bmc.waiter.TerminationStrategy terminationStrategy,
                    com.oracle.bmc.waiter.DelayStrategy delayStrategy) {
        if (workRequestClient == null) {
            throw new IllegalStateException(
                    "A WorkRequestClient must be supplied to this waiter for this operation");
        }

        return new com.oracle.bmc.waiter.internal.SimpleWaiterImpl<>(
                executorService,
                new java.util.concurrent.Callable<CreateExternalBackupJobResponse>() {
                    @Override
                    public CreateExternalBackupJobResponse call() throws Exception {
                        final CreateExternalBackupJobResponse response =
                                client.createExternalBackupJob(request);

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
                    CreateExternalContainerDatabaseRequest, CreateExternalContainerDatabaseResponse>
            forCreateExternalContainerDatabase(CreateExternalContainerDatabaseRequest request) {
        return forCreateExternalContainerDatabase(
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
                    CreateExternalContainerDatabaseRequest, CreateExternalContainerDatabaseResponse>
            forCreateExternalContainerDatabase(
                    CreateExternalContainerDatabaseRequest request,
                    com.oracle.bmc.waiter.TerminationStrategy terminationStrategy,
                    com.oracle.bmc.waiter.DelayStrategy delayStrategy) {
        if (workRequestClient == null) {
            throw new IllegalStateException(
                    "A WorkRequestClient must be supplied to this waiter for this operation");
        }

        return new com.oracle.bmc.waiter.internal.SimpleWaiterImpl<>(
                executorService,
                new java.util.concurrent.Callable<CreateExternalContainerDatabaseResponse>() {
                    @Override
                    public CreateExternalContainerDatabaseResponse call() throws Exception {
                        final CreateExternalContainerDatabaseResponse response =
                                client.createExternalContainerDatabase(request);

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
                    CreateExternalDatabaseConnectorRequest, CreateExternalDatabaseConnectorResponse>
            forCreateExternalDatabaseConnector(CreateExternalDatabaseConnectorRequest request) {
        return forCreateExternalDatabaseConnector(
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
                    CreateExternalDatabaseConnectorRequest, CreateExternalDatabaseConnectorResponse>
            forCreateExternalDatabaseConnector(
                    CreateExternalDatabaseConnectorRequest request,
                    com.oracle.bmc.waiter.TerminationStrategy terminationStrategy,
                    com.oracle.bmc.waiter.DelayStrategy delayStrategy) {
        if (workRequestClient == null) {
            throw new IllegalStateException(
                    "A WorkRequestClient must be supplied to this waiter for this operation");
        }

        return new com.oracle.bmc.waiter.internal.SimpleWaiterImpl<>(
                executorService,
                new java.util.concurrent.Callable<CreateExternalDatabaseConnectorResponse>() {
                    @Override
                    public CreateExternalDatabaseConnectorResponse call() throws Exception {
                        final CreateExternalDatabaseConnectorResponse response =
                                client.createExternalDatabaseConnector(request);

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
                    CreateExternalNonContainerDatabaseRequest,
                    CreateExternalNonContainerDatabaseResponse>
            forCreateExternalNonContainerDatabase(
                    CreateExternalNonContainerDatabaseRequest request) {
        return forCreateExternalNonContainerDatabase(
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
                    CreateExternalNonContainerDatabaseRequest,
                    CreateExternalNonContainerDatabaseResponse>
            forCreateExternalNonContainerDatabase(
                    CreateExternalNonContainerDatabaseRequest request,
                    com.oracle.bmc.waiter.TerminationStrategy terminationStrategy,
                    com.oracle.bmc.waiter.DelayStrategy delayStrategy) {
        if (workRequestClient == null) {
            throw new IllegalStateException(
                    "A WorkRequestClient must be supplied to this waiter for this operation");
        }

        return new com.oracle.bmc.waiter.internal.SimpleWaiterImpl<>(
                executorService,
                new java.util.concurrent.Callable<CreateExternalNonContainerDatabaseResponse>() {
                    @Override
                    public CreateExternalNonContainerDatabaseResponse call() throws Exception {
                        final CreateExternalNonContainerDatabaseResponse response =
                                client.createExternalNonContainerDatabase(request);

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
                    CreateExternalPluggableDatabaseRequest, CreateExternalPluggableDatabaseResponse>
            forCreateExternalPluggableDatabase(CreateExternalPluggableDatabaseRequest request) {
        return forCreateExternalPluggableDatabase(
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
                    CreateExternalPluggableDatabaseRequest, CreateExternalPluggableDatabaseResponse>
            forCreateExternalPluggableDatabase(
                    CreateExternalPluggableDatabaseRequest request,
                    com.oracle.bmc.waiter.TerminationStrategy terminationStrategy,
                    com.oracle.bmc.waiter.DelayStrategy delayStrategy) {
        if (workRequestClient == null) {
            throw new IllegalStateException(
                    "A WorkRequestClient must be supplied to this waiter for this operation");
        }

        return new com.oracle.bmc.waiter.internal.SimpleWaiterImpl<>(
                executorService,
                new java.util.concurrent.Callable<CreateExternalPluggableDatabaseResponse>() {
                    @Override
                    public CreateExternalPluggableDatabaseResponse call() throws Exception {
                        final CreateExternalPluggableDatabaseResponse response =
                                client.createExternalPluggableDatabase(request);

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
                    CreatePluggableDatabaseRequest, CreatePluggableDatabaseResponse>
            forCreatePluggableDatabase(CreatePluggableDatabaseRequest request) {
        return forCreatePluggableDatabase(
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
                    CreatePluggableDatabaseRequest, CreatePluggableDatabaseResponse>
            forCreatePluggableDatabase(
                    CreatePluggableDatabaseRequest request,
                    com.oracle.bmc.waiter.TerminationStrategy terminationStrategy,
                    com.oracle.bmc.waiter.DelayStrategy delayStrategy) {
        if (workRequestClient == null) {
            throw new IllegalStateException(
                    "A WorkRequestClient must be supplied to this waiter for this operation");
        }

        return new com.oracle.bmc.waiter.internal.SimpleWaiterImpl<>(
                executorService,
                new java.util.concurrent.Callable<CreatePluggableDatabaseResponse>() {
                    @Override
                    public CreatePluggableDatabaseResponse call() throws Exception {
                        final CreatePluggableDatabaseResponse response =
                                client.createPluggableDatabase(request);

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
    public com.oracle.bmc.waiter.Waiter<CreateVmClusterRequest, CreateVmClusterResponse>
            forCreateVmCluster(CreateVmClusterRequest request) {
        return forCreateVmCluster(
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
    public com.oracle.bmc.waiter.Waiter<CreateVmClusterRequest, CreateVmClusterResponse>
            forCreateVmCluster(
                    CreateVmClusterRequest request,
                    com.oracle.bmc.waiter.TerminationStrategy terminationStrategy,
                    com.oracle.bmc.waiter.DelayStrategy delayStrategy) {
        if (workRequestClient == null) {
            throw new IllegalStateException(
                    "A WorkRequestClient must be supplied to this waiter for this operation");
        }

        return new com.oracle.bmc.waiter.internal.SimpleWaiterImpl<>(
                executorService,
                new java.util.concurrent.Callable<CreateVmClusterResponse>() {
                    @Override
                    public CreateVmClusterResponse call() throws Exception {
                        final CreateVmClusterResponse response = client.createVmCluster(request);

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
                    CreateVmClusterNetworkRequest, CreateVmClusterNetworkResponse>
            forCreateVmClusterNetwork(CreateVmClusterNetworkRequest request) {
        return forCreateVmClusterNetwork(
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
                    CreateVmClusterNetworkRequest, CreateVmClusterNetworkResponse>
            forCreateVmClusterNetwork(
                    CreateVmClusterNetworkRequest request,
                    com.oracle.bmc.waiter.TerminationStrategy terminationStrategy,
                    com.oracle.bmc.waiter.DelayStrategy delayStrategy) {
        if (workRequestClient == null) {
            throw new IllegalStateException(
                    "A WorkRequestClient must be supplied to this waiter for this operation");
        }

        return new com.oracle.bmc.waiter.internal.SimpleWaiterImpl<>(
                executorService,
                new java.util.concurrent.Callable<CreateVmClusterNetworkResponse>() {
                    @Override
                    public CreateVmClusterNetworkResponse call() throws Exception {
                        final CreateVmClusterNetworkResponse response =
                                client.createVmClusterNetwork(request);

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
    public com.oracle.bmc.waiter.Waiter<DbNodeActionRequest, DbNodeActionResponse> forDbNodeAction(
            DbNodeActionRequest request) {
        return forDbNodeAction(
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
    public com.oracle.bmc.waiter.Waiter<DbNodeActionRequest, DbNodeActionResponse> forDbNodeAction(
            DbNodeActionRequest request,
            com.oracle.bmc.waiter.TerminationStrategy terminationStrategy,
            com.oracle.bmc.waiter.DelayStrategy delayStrategy) {
        if (workRequestClient == null) {
            throw new IllegalStateException(
                    "A WorkRequestClient must be supplied to this waiter for this operation");
        }

        return new com.oracle.bmc.waiter.internal.SimpleWaiterImpl<>(
                executorService,
                new java.util.concurrent.Callable<DbNodeActionResponse>() {
                    @Override
                    public DbNodeActionResponse call() throws Exception {
                        final DbNodeActionResponse response = client.dbNodeAction(request);

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
     * @return a new {@link com.oracle.bmc.waiter.Waiter} instance
     */
    public com.oracle.bmc.waiter.Waiter<
                    DeleteAutonomousVmClusterRequest, DeleteAutonomousVmClusterResponse>
            forDeleteAutonomousVmCluster(DeleteAutonomousVmClusterRequest request) {
        return forDeleteAutonomousVmCluster(
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
                    DeleteAutonomousVmClusterRequest, DeleteAutonomousVmClusterResponse>
            forDeleteAutonomousVmCluster(
                    DeleteAutonomousVmClusterRequest request,
                    com.oracle.bmc.waiter.TerminationStrategy terminationStrategy,
                    com.oracle.bmc.waiter.DelayStrategy delayStrategy) {
        if (workRequestClient == null) {
            throw new IllegalStateException(
                    "A WorkRequestClient must be supplied to this waiter for this operation");
        }

        return new com.oracle.bmc.waiter.internal.SimpleWaiterImpl<>(
                executorService,
                new java.util.concurrent.Callable<DeleteAutonomousVmClusterResponse>() {
                    @Override
                    public DeleteAutonomousVmClusterResponse call() throws Exception {
                        final DeleteAutonomousVmClusterResponse response =
                                client.deleteAutonomousVmCluster(request);

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
    public com.oracle.bmc.waiter.Waiter<DeleteBackupRequest, DeleteBackupResponse> forDeleteBackup(
            DeleteBackupRequest request) {
        return forDeleteBackup(
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
    public com.oracle.bmc.waiter.Waiter<DeleteBackupRequest, DeleteBackupResponse> forDeleteBackup(
            DeleteBackupRequest request,
            com.oracle.bmc.waiter.TerminationStrategy terminationStrategy,
            com.oracle.bmc.waiter.DelayStrategy delayStrategy) {
        if (workRequestClient == null) {
            throw new IllegalStateException(
                    "A WorkRequestClient must be supplied to this waiter for this operation");
        }

        return new com.oracle.bmc.waiter.internal.SimpleWaiterImpl<>(
                executorService,
                new java.util.concurrent.Callable<DeleteBackupResponse>() {
                    @Override
                    public DeleteBackupResponse call() throws Exception {
                        final DeleteBackupResponse response = client.deleteBackup(request);

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
                    DeleteCloudAutonomousVmClusterRequest, DeleteCloudAutonomousVmClusterResponse>
            forDeleteCloudAutonomousVmCluster(DeleteCloudAutonomousVmClusterRequest request) {
        return forDeleteCloudAutonomousVmCluster(
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
                    DeleteCloudAutonomousVmClusterRequest, DeleteCloudAutonomousVmClusterResponse>
            forDeleteCloudAutonomousVmCluster(
                    DeleteCloudAutonomousVmClusterRequest request,
                    com.oracle.bmc.waiter.TerminationStrategy terminationStrategy,
                    com.oracle.bmc.waiter.DelayStrategy delayStrategy) {
        if (workRequestClient == null) {
            throw new IllegalStateException(
                    "A WorkRequestClient must be supplied to this waiter for this operation");
        }

        return new com.oracle.bmc.waiter.internal.SimpleWaiterImpl<>(
                executorService,
                new java.util.concurrent.Callable<DeleteCloudAutonomousVmClusterResponse>() {
                    @Override
                    public DeleteCloudAutonomousVmClusterResponse call() throws Exception {
                        final DeleteCloudAutonomousVmClusterResponse response =
                                client.deleteCloudAutonomousVmCluster(request);

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
                    DeleteCloudExadataInfrastructureRequest,
                    DeleteCloudExadataInfrastructureResponse>
            forDeleteCloudExadataInfrastructure(DeleteCloudExadataInfrastructureRequest request) {
        return forDeleteCloudExadataInfrastructure(
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
                    DeleteCloudExadataInfrastructureRequest,
                    DeleteCloudExadataInfrastructureResponse>
            forDeleteCloudExadataInfrastructure(
                    DeleteCloudExadataInfrastructureRequest request,
                    com.oracle.bmc.waiter.TerminationStrategy terminationStrategy,
                    com.oracle.bmc.waiter.DelayStrategy delayStrategy) {
        if (workRequestClient == null) {
            throw new IllegalStateException(
                    "A WorkRequestClient must be supplied to this waiter for this operation");
        }

        return new com.oracle.bmc.waiter.internal.SimpleWaiterImpl<>(
                executorService,
                new java.util.concurrent.Callable<DeleteCloudExadataInfrastructureResponse>() {
                    @Override
                    public DeleteCloudExadataInfrastructureResponse call() throws Exception {
                        final DeleteCloudExadataInfrastructureResponse response =
                                client.deleteCloudExadataInfrastructure(request);

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
    public com.oracle.bmc.waiter.Waiter<DeleteCloudVmClusterRequest, DeleteCloudVmClusterResponse>
            forDeleteCloudVmCluster(DeleteCloudVmClusterRequest request) {
        return forDeleteCloudVmCluster(
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
    public com.oracle.bmc.waiter.Waiter<DeleteCloudVmClusterRequest, DeleteCloudVmClusterResponse>
            forDeleteCloudVmCluster(
                    DeleteCloudVmClusterRequest request,
                    com.oracle.bmc.waiter.TerminationStrategy terminationStrategy,
                    com.oracle.bmc.waiter.DelayStrategy delayStrategy) {
        if (workRequestClient == null) {
            throw new IllegalStateException(
                    "A WorkRequestClient must be supplied to this waiter for this operation");
        }

        return new com.oracle.bmc.waiter.internal.SimpleWaiterImpl<>(
                executorService,
                new java.util.concurrent.Callable<DeleteCloudVmClusterResponse>() {
                    @Override
                    public DeleteCloudVmClusterResponse call() throws Exception {
                        final DeleteCloudVmClusterResponse response =
                                client.deleteCloudVmCluster(request);

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
    public com.oracle.bmc.waiter.Waiter<DeleteDatabaseRequest, DeleteDatabaseResponse>
            forDeleteDatabase(DeleteDatabaseRequest request) {
        return forDeleteDatabase(
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
    public com.oracle.bmc.waiter.Waiter<DeleteDatabaseRequest, DeleteDatabaseResponse>
            forDeleteDatabase(
                    DeleteDatabaseRequest request,
                    com.oracle.bmc.waiter.TerminationStrategy terminationStrategy,
                    com.oracle.bmc.waiter.DelayStrategy delayStrategy) {
        if (workRequestClient == null) {
            throw new IllegalStateException(
                    "A WorkRequestClient must be supplied to this waiter for this operation");
        }

        return new com.oracle.bmc.waiter.internal.SimpleWaiterImpl<>(
                executorService,
                new java.util.concurrent.Callable<DeleteDatabaseResponse>() {
                    @Override
                    public DeleteDatabaseResponse call() throws Exception {
                        final DeleteDatabaseResponse response = client.deleteDatabase(request);

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
                    DeleteDatabaseSoftwareImageRequest, DeleteDatabaseSoftwareImageResponse>
            forDeleteDatabaseSoftwareImage(DeleteDatabaseSoftwareImageRequest request) {
        return forDeleteDatabaseSoftwareImage(
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
                    DeleteDatabaseSoftwareImageRequest, DeleteDatabaseSoftwareImageResponse>
            forDeleteDatabaseSoftwareImage(
                    DeleteDatabaseSoftwareImageRequest request,
                    com.oracle.bmc.waiter.TerminationStrategy terminationStrategy,
                    com.oracle.bmc.waiter.DelayStrategy delayStrategy) {
        if (workRequestClient == null) {
            throw new IllegalStateException(
                    "A WorkRequestClient must be supplied to this waiter for this operation");
        }

        return new com.oracle.bmc.waiter.internal.SimpleWaiterImpl<>(
                executorService,
                new java.util.concurrent.Callable<DeleteDatabaseSoftwareImageResponse>() {
                    @Override
                    public DeleteDatabaseSoftwareImageResponse call() throws Exception {
                        final DeleteDatabaseSoftwareImageResponse response =
                                client.deleteDatabaseSoftwareImage(request);

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
    public com.oracle.bmc.waiter.Waiter<DeleteDbHomeRequest, DeleteDbHomeResponse> forDeleteDbHome(
            DeleteDbHomeRequest request) {
        return forDeleteDbHome(
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
    public com.oracle.bmc.waiter.Waiter<DeleteDbHomeRequest, DeleteDbHomeResponse> forDeleteDbHome(
            DeleteDbHomeRequest request,
            com.oracle.bmc.waiter.TerminationStrategy terminationStrategy,
            com.oracle.bmc.waiter.DelayStrategy delayStrategy) {
        if (workRequestClient == null) {
            throw new IllegalStateException(
                    "A WorkRequestClient must be supplied to this waiter for this operation");
        }

        return new com.oracle.bmc.waiter.internal.SimpleWaiterImpl<>(
                executorService,
                new java.util.concurrent.Callable<DeleteDbHomeResponse>() {
                    @Override
                    public DeleteDbHomeResponse call() throws Exception {
                        final DeleteDbHomeResponse response = client.deleteDbHome(request);

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
                    DeleteExadataInfrastructureRequest, DeleteExadataInfrastructureResponse>
            forDeleteExadataInfrastructure(DeleteExadataInfrastructureRequest request) {
        return forDeleteExadataInfrastructure(
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
                    DeleteExadataInfrastructureRequest, DeleteExadataInfrastructureResponse>
            forDeleteExadataInfrastructure(
                    DeleteExadataInfrastructureRequest request,
                    com.oracle.bmc.waiter.TerminationStrategy terminationStrategy,
                    com.oracle.bmc.waiter.DelayStrategy delayStrategy) {
        if (workRequestClient == null) {
            throw new IllegalStateException(
                    "A WorkRequestClient must be supplied to this waiter for this operation");
        }

        return new com.oracle.bmc.waiter.internal.SimpleWaiterImpl<>(
                executorService,
                new java.util.concurrent.Callable<DeleteExadataInfrastructureResponse>() {
                    @Override
                    public DeleteExadataInfrastructureResponse call() throws Exception {
                        final DeleteExadataInfrastructureResponse response =
                                client.deleteExadataInfrastructure(request);

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
                    DeleteExternalContainerDatabaseRequest, DeleteExternalContainerDatabaseResponse>
            forDeleteExternalContainerDatabase(DeleteExternalContainerDatabaseRequest request) {
        return forDeleteExternalContainerDatabase(
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
                    DeleteExternalContainerDatabaseRequest, DeleteExternalContainerDatabaseResponse>
            forDeleteExternalContainerDatabase(
                    DeleteExternalContainerDatabaseRequest request,
                    com.oracle.bmc.waiter.TerminationStrategy terminationStrategy,
                    com.oracle.bmc.waiter.DelayStrategy delayStrategy) {
        if (workRequestClient == null) {
            throw new IllegalStateException(
                    "A WorkRequestClient must be supplied to this waiter for this operation");
        }

        return new com.oracle.bmc.waiter.internal.SimpleWaiterImpl<>(
                executorService,
                new java.util.concurrent.Callable<DeleteExternalContainerDatabaseResponse>() {
                    @Override
                    public DeleteExternalContainerDatabaseResponse call() throws Exception {
                        final DeleteExternalContainerDatabaseResponse response =
                                client.deleteExternalContainerDatabase(request);

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
                    DeleteExternalDatabaseConnectorRequest, DeleteExternalDatabaseConnectorResponse>
            forDeleteExternalDatabaseConnector(DeleteExternalDatabaseConnectorRequest request) {
        return forDeleteExternalDatabaseConnector(
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
                    DeleteExternalDatabaseConnectorRequest, DeleteExternalDatabaseConnectorResponse>
            forDeleteExternalDatabaseConnector(
                    DeleteExternalDatabaseConnectorRequest request,
                    com.oracle.bmc.waiter.TerminationStrategy terminationStrategy,
                    com.oracle.bmc.waiter.DelayStrategy delayStrategy) {
        if (workRequestClient == null) {
            throw new IllegalStateException(
                    "A WorkRequestClient must be supplied to this waiter for this operation");
        }

        return new com.oracle.bmc.waiter.internal.SimpleWaiterImpl<>(
                executorService,
                new java.util.concurrent.Callable<DeleteExternalDatabaseConnectorResponse>() {
                    @Override
                    public DeleteExternalDatabaseConnectorResponse call() throws Exception {
                        final DeleteExternalDatabaseConnectorResponse response =
                                client.deleteExternalDatabaseConnector(request);

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
                    DeleteExternalNonContainerDatabaseRequest,
                    DeleteExternalNonContainerDatabaseResponse>
            forDeleteExternalNonContainerDatabase(
                    DeleteExternalNonContainerDatabaseRequest request) {
        return forDeleteExternalNonContainerDatabase(
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
                    DeleteExternalNonContainerDatabaseRequest,
                    DeleteExternalNonContainerDatabaseResponse>
            forDeleteExternalNonContainerDatabase(
                    DeleteExternalNonContainerDatabaseRequest request,
                    com.oracle.bmc.waiter.TerminationStrategy terminationStrategy,
                    com.oracle.bmc.waiter.DelayStrategy delayStrategy) {
        if (workRequestClient == null) {
            throw new IllegalStateException(
                    "A WorkRequestClient must be supplied to this waiter for this operation");
        }

        return new com.oracle.bmc.waiter.internal.SimpleWaiterImpl<>(
                executorService,
                new java.util.concurrent.Callable<DeleteExternalNonContainerDatabaseResponse>() {
                    @Override
                    public DeleteExternalNonContainerDatabaseResponse call() throws Exception {
                        final DeleteExternalNonContainerDatabaseResponse response =
                                client.deleteExternalNonContainerDatabase(request);

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
                    DeleteExternalPluggableDatabaseRequest, DeleteExternalPluggableDatabaseResponse>
            forDeleteExternalPluggableDatabase(DeleteExternalPluggableDatabaseRequest request) {
        return forDeleteExternalPluggableDatabase(
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
                    DeleteExternalPluggableDatabaseRequest, DeleteExternalPluggableDatabaseResponse>
            forDeleteExternalPluggableDatabase(
                    DeleteExternalPluggableDatabaseRequest request,
                    com.oracle.bmc.waiter.TerminationStrategy terminationStrategy,
                    com.oracle.bmc.waiter.DelayStrategy delayStrategy) {
        if (workRequestClient == null) {
            throw new IllegalStateException(
                    "A WorkRequestClient must be supplied to this waiter for this operation");
        }

        return new com.oracle.bmc.waiter.internal.SimpleWaiterImpl<>(
                executorService,
                new java.util.concurrent.Callable<DeleteExternalPluggableDatabaseResponse>() {
                    @Override
                    public DeleteExternalPluggableDatabaseResponse call() throws Exception {
                        final DeleteExternalPluggableDatabaseResponse response =
                                client.deleteExternalPluggableDatabase(request);

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
                    DeletePluggableDatabaseRequest, DeletePluggableDatabaseResponse>
            forDeletePluggableDatabase(DeletePluggableDatabaseRequest request) {
        return forDeletePluggableDatabase(
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
                    DeletePluggableDatabaseRequest, DeletePluggableDatabaseResponse>
            forDeletePluggableDatabase(
                    DeletePluggableDatabaseRequest request,
                    com.oracle.bmc.waiter.TerminationStrategy terminationStrategy,
                    com.oracle.bmc.waiter.DelayStrategy delayStrategy) {
        if (workRequestClient == null) {
            throw new IllegalStateException(
                    "A WorkRequestClient must be supplied to this waiter for this operation");
        }

        return new com.oracle.bmc.waiter.internal.SimpleWaiterImpl<>(
                executorService,
                new java.util.concurrent.Callable<DeletePluggableDatabaseResponse>() {
                    @Override
                    public DeletePluggableDatabaseResponse call() throws Exception {
                        final DeletePluggableDatabaseResponse response =
                                client.deletePluggableDatabase(request);

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
    public com.oracle.bmc.waiter.Waiter<DeleteVmClusterRequest, DeleteVmClusterResponse>
            forDeleteVmCluster(DeleteVmClusterRequest request) {
        return forDeleteVmCluster(
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
    public com.oracle.bmc.waiter.Waiter<DeleteVmClusterRequest, DeleteVmClusterResponse>
            forDeleteVmCluster(
                    DeleteVmClusterRequest request,
                    com.oracle.bmc.waiter.TerminationStrategy terminationStrategy,
                    com.oracle.bmc.waiter.DelayStrategy delayStrategy) {
        if (workRequestClient == null) {
            throw new IllegalStateException(
                    "A WorkRequestClient must be supplied to this waiter for this operation");
        }

        return new com.oracle.bmc.waiter.internal.SimpleWaiterImpl<>(
                executorService,
                new java.util.concurrent.Callable<DeleteVmClusterResponse>() {
                    @Override
                    public DeleteVmClusterResponse call() throws Exception {
                        final DeleteVmClusterResponse response = client.deleteVmCluster(request);

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
                    DeleteVmClusterNetworkRequest, DeleteVmClusterNetworkResponse>
            forDeleteVmClusterNetwork(DeleteVmClusterNetworkRequest request) {
        return forDeleteVmClusterNetwork(
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
                    DeleteVmClusterNetworkRequest, DeleteVmClusterNetworkResponse>
            forDeleteVmClusterNetwork(
                    DeleteVmClusterNetworkRequest request,
                    com.oracle.bmc.waiter.TerminationStrategy terminationStrategy,
                    com.oracle.bmc.waiter.DelayStrategy delayStrategy) {
        if (workRequestClient == null) {
            throw new IllegalStateException(
                    "A WorkRequestClient must be supplied to this waiter for this operation");
        }

        return new com.oracle.bmc.waiter.internal.SimpleWaiterImpl<>(
                executorService,
                new java.util.concurrent.Callable<DeleteVmClusterNetworkResponse>() {
                    @Override
                    public DeleteVmClusterNetworkResponse call() throws Exception {
                        final DeleteVmClusterNetworkResponse response =
                                client.deleteVmClusterNetwork(request);

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
                    DeregisterAutonomousDatabaseDataSafeRequest,
                    DeregisterAutonomousDatabaseDataSafeResponse>
            forDeregisterAutonomousDatabaseDataSafe(
                    DeregisterAutonomousDatabaseDataSafeRequest request) {
        return forDeregisterAutonomousDatabaseDataSafe(
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
                    DeregisterAutonomousDatabaseDataSafeRequest,
                    DeregisterAutonomousDatabaseDataSafeResponse>
            forDeregisterAutonomousDatabaseDataSafe(
                    DeregisterAutonomousDatabaseDataSafeRequest request,
                    com.oracle.bmc.waiter.TerminationStrategy terminationStrategy,
                    com.oracle.bmc.waiter.DelayStrategy delayStrategy) {
        if (workRequestClient == null) {
            throw new IllegalStateException(
                    "A WorkRequestClient must be supplied to this waiter for this operation");
        }

        return new com.oracle.bmc.waiter.internal.SimpleWaiterImpl<>(
                executorService,
                new java.util.concurrent.Callable<DeregisterAutonomousDatabaseDataSafeResponse>() {
                    @Override
                    public DeregisterAutonomousDatabaseDataSafeResponse call() throws Exception {
                        final DeregisterAutonomousDatabaseDataSafeResponse response =
                                client.deregisterAutonomousDatabaseDataSafe(request);

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
                    DisableAutonomousDatabaseManagementRequest,
                    DisableAutonomousDatabaseManagementResponse>
            forDisableAutonomousDatabaseManagement(
                    DisableAutonomousDatabaseManagementRequest request) {
        return forDisableAutonomousDatabaseManagement(
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
                    DisableAutonomousDatabaseManagementRequest,
                    DisableAutonomousDatabaseManagementResponse>
            forDisableAutonomousDatabaseManagement(
                    DisableAutonomousDatabaseManagementRequest request,
                    com.oracle.bmc.waiter.TerminationStrategy terminationStrategy,
                    com.oracle.bmc.waiter.DelayStrategy delayStrategy) {
        if (workRequestClient == null) {
            throw new IllegalStateException(
                    "A WorkRequestClient must be supplied to this waiter for this operation");
        }

        return new com.oracle.bmc.waiter.internal.SimpleWaiterImpl<>(
                executorService,
                new java.util.concurrent.Callable<DisableAutonomousDatabaseManagementResponse>() {
                    @Override
                    public DisableAutonomousDatabaseManagementResponse call() throws Exception {
                        final DisableAutonomousDatabaseManagementResponse response =
                                client.disableAutonomousDatabaseManagement(request);

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
                    DisableAutonomousDatabaseOperationsInsightsRequest,
                    DisableAutonomousDatabaseOperationsInsightsResponse>
            forDisableAutonomousDatabaseOperationsInsights(
                    DisableAutonomousDatabaseOperationsInsightsRequest request) {
        return forDisableAutonomousDatabaseOperationsInsights(
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
                    DisableAutonomousDatabaseOperationsInsightsRequest,
                    DisableAutonomousDatabaseOperationsInsightsResponse>
            forDisableAutonomousDatabaseOperationsInsights(
                    DisableAutonomousDatabaseOperationsInsightsRequest request,
                    com.oracle.bmc.waiter.TerminationStrategy terminationStrategy,
                    com.oracle.bmc.waiter.DelayStrategy delayStrategy) {
        if (workRequestClient == null) {
            throw new IllegalStateException(
                    "A WorkRequestClient must be supplied to this waiter for this operation");
        }

        return new com.oracle.bmc.waiter.internal.SimpleWaiterImpl<>(
                executorService,
                new java.util.concurrent.Callable<
                        DisableAutonomousDatabaseOperationsInsightsResponse>() {
                    @Override
                    public DisableAutonomousDatabaseOperationsInsightsResponse call()
                            throws Exception {
                        final DisableAutonomousDatabaseOperationsInsightsResponse response =
                                client.disableAutonomousDatabaseOperationsInsights(request);

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
                    DisableDatabaseManagementRequest, DisableDatabaseManagementResponse>
            forDisableDatabaseManagement(DisableDatabaseManagementRequest request) {
        return forDisableDatabaseManagement(
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
                    DisableDatabaseManagementRequest, DisableDatabaseManagementResponse>
            forDisableDatabaseManagement(
                    DisableDatabaseManagementRequest request,
                    com.oracle.bmc.waiter.TerminationStrategy terminationStrategy,
                    com.oracle.bmc.waiter.DelayStrategy delayStrategy) {
        if (workRequestClient == null) {
            throw new IllegalStateException(
                    "A WorkRequestClient must be supplied to this waiter for this operation");
        }

        return new com.oracle.bmc.waiter.internal.SimpleWaiterImpl<>(
                executorService,
                new java.util.concurrent.Callable<DisableDatabaseManagementResponse>() {
                    @Override
                    public DisableDatabaseManagementResponse call() throws Exception {
                        final DisableDatabaseManagementResponse response =
                                client.disableDatabaseManagement(request);

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
                    DisableExternalContainerDatabaseDatabaseManagementRequest,
                    DisableExternalContainerDatabaseDatabaseManagementResponse>
            forDisableExternalContainerDatabaseDatabaseManagement(
                    DisableExternalContainerDatabaseDatabaseManagementRequest request) {
        return forDisableExternalContainerDatabaseDatabaseManagement(
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
                    DisableExternalContainerDatabaseDatabaseManagementRequest,
                    DisableExternalContainerDatabaseDatabaseManagementResponse>
            forDisableExternalContainerDatabaseDatabaseManagement(
                    DisableExternalContainerDatabaseDatabaseManagementRequest request,
                    com.oracle.bmc.waiter.TerminationStrategy terminationStrategy,
                    com.oracle.bmc.waiter.DelayStrategy delayStrategy) {
        if (workRequestClient == null) {
            throw new IllegalStateException(
                    "A WorkRequestClient must be supplied to this waiter for this operation");
        }

        return new com.oracle.bmc.waiter.internal.SimpleWaiterImpl<>(
                executorService,
                new java.util.concurrent.Callable<
                        DisableExternalContainerDatabaseDatabaseManagementResponse>() {
                    @Override
                    public DisableExternalContainerDatabaseDatabaseManagementResponse call()
                            throws Exception {
                        final DisableExternalContainerDatabaseDatabaseManagementResponse response =
                                client.disableExternalContainerDatabaseDatabaseManagement(request);

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
                    DisableExternalContainerDatabaseStackMonitoringRequest,
                    DisableExternalContainerDatabaseStackMonitoringResponse>
            forDisableExternalContainerDatabaseStackMonitoring(
                    DisableExternalContainerDatabaseStackMonitoringRequest request) {
        return forDisableExternalContainerDatabaseStackMonitoring(
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
                    DisableExternalContainerDatabaseStackMonitoringRequest,
                    DisableExternalContainerDatabaseStackMonitoringResponse>
            forDisableExternalContainerDatabaseStackMonitoring(
                    DisableExternalContainerDatabaseStackMonitoringRequest request,
                    com.oracle.bmc.waiter.TerminationStrategy terminationStrategy,
                    com.oracle.bmc.waiter.DelayStrategy delayStrategy) {
        if (workRequestClient == null) {
            throw new IllegalStateException(
                    "A WorkRequestClient must be supplied to this waiter for this operation");
        }

        return new com.oracle.bmc.waiter.internal.SimpleWaiterImpl<>(
                executorService,
                new java.util.concurrent.Callable<
                        DisableExternalContainerDatabaseStackMonitoringResponse>() {
                    @Override
                    public DisableExternalContainerDatabaseStackMonitoringResponse call()
                            throws Exception {
                        final DisableExternalContainerDatabaseStackMonitoringResponse response =
                                client.disableExternalContainerDatabaseStackMonitoring(request);

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
                    DisableExternalNonContainerDatabaseDatabaseManagementRequest,
                    DisableExternalNonContainerDatabaseDatabaseManagementResponse>
            forDisableExternalNonContainerDatabaseDatabaseManagement(
                    DisableExternalNonContainerDatabaseDatabaseManagementRequest request) {
        return forDisableExternalNonContainerDatabaseDatabaseManagement(
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
                    DisableExternalNonContainerDatabaseDatabaseManagementRequest,
                    DisableExternalNonContainerDatabaseDatabaseManagementResponse>
            forDisableExternalNonContainerDatabaseDatabaseManagement(
                    DisableExternalNonContainerDatabaseDatabaseManagementRequest request,
                    com.oracle.bmc.waiter.TerminationStrategy terminationStrategy,
                    com.oracle.bmc.waiter.DelayStrategy delayStrategy) {
        if (workRequestClient == null) {
            throw new IllegalStateException(
                    "A WorkRequestClient must be supplied to this waiter for this operation");
        }

        return new com.oracle.bmc.waiter.internal.SimpleWaiterImpl<>(
                executorService,
                new java.util.concurrent.Callable<
                        DisableExternalNonContainerDatabaseDatabaseManagementResponse>() {
                    @Override
                    public DisableExternalNonContainerDatabaseDatabaseManagementResponse call()
                            throws Exception {
                        final DisableExternalNonContainerDatabaseDatabaseManagementResponse
                                response =
                                        client
                                                .disableExternalNonContainerDatabaseDatabaseManagement(
                                                        request);

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
                    DisableExternalNonContainerDatabaseOperationsInsightsRequest,
                    DisableExternalNonContainerDatabaseOperationsInsightsResponse>
            forDisableExternalNonContainerDatabaseOperationsInsights(
                    DisableExternalNonContainerDatabaseOperationsInsightsRequest request) {
        return forDisableExternalNonContainerDatabaseOperationsInsights(
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
                    DisableExternalNonContainerDatabaseOperationsInsightsRequest,
                    DisableExternalNonContainerDatabaseOperationsInsightsResponse>
            forDisableExternalNonContainerDatabaseOperationsInsights(
                    DisableExternalNonContainerDatabaseOperationsInsightsRequest request,
                    com.oracle.bmc.waiter.TerminationStrategy terminationStrategy,
                    com.oracle.bmc.waiter.DelayStrategy delayStrategy) {
        if (workRequestClient == null) {
            throw new IllegalStateException(
                    "A WorkRequestClient must be supplied to this waiter for this operation");
        }

        return new com.oracle.bmc.waiter.internal.SimpleWaiterImpl<>(
                executorService,
                new java.util.concurrent.Callable<
                        DisableExternalNonContainerDatabaseOperationsInsightsResponse>() {
                    @Override
                    public DisableExternalNonContainerDatabaseOperationsInsightsResponse call()
                            throws Exception {
                        final DisableExternalNonContainerDatabaseOperationsInsightsResponse
                                response =
                                        client
                                                .disableExternalNonContainerDatabaseOperationsInsights(
                                                        request);

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
                    DisableExternalNonContainerDatabaseStackMonitoringRequest,
                    DisableExternalNonContainerDatabaseStackMonitoringResponse>
            forDisableExternalNonContainerDatabaseStackMonitoring(
                    DisableExternalNonContainerDatabaseStackMonitoringRequest request) {
        return forDisableExternalNonContainerDatabaseStackMonitoring(
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
                    DisableExternalNonContainerDatabaseStackMonitoringRequest,
                    DisableExternalNonContainerDatabaseStackMonitoringResponse>
            forDisableExternalNonContainerDatabaseStackMonitoring(
                    DisableExternalNonContainerDatabaseStackMonitoringRequest request,
                    com.oracle.bmc.waiter.TerminationStrategy terminationStrategy,
                    com.oracle.bmc.waiter.DelayStrategy delayStrategy) {
        if (workRequestClient == null) {
            throw new IllegalStateException(
                    "A WorkRequestClient must be supplied to this waiter for this operation");
        }

        return new com.oracle.bmc.waiter.internal.SimpleWaiterImpl<>(
                executorService,
                new java.util.concurrent.Callable<
                        DisableExternalNonContainerDatabaseStackMonitoringResponse>() {
                    @Override
                    public DisableExternalNonContainerDatabaseStackMonitoringResponse call()
                            throws Exception {
                        final DisableExternalNonContainerDatabaseStackMonitoringResponse response =
                                client.disableExternalNonContainerDatabaseStackMonitoring(request);

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
                    DisableExternalPluggableDatabaseDatabaseManagementRequest,
                    DisableExternalPluggableDatabaseDatabaseManagementResponse>
            forDisableExternalPluggableDatabaseDatabaseManagement(
                    DisableExternalPluggableDatabaseDatabaseManagementRequest request) {
        return forDisableExternalPluggableDatabaseDatabaseManagement(
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
                    DisableExternalPluggableDatabaseDatabaseManagementRequest,
                    DisableExternalPluggableDatabaseDatabaseManagementResponse>
            forDisableExternalPluggableDatabaseDatabaseManagement(
                    DisableExternalPluggableDatabaseDatabaseManagementRequest request,
                    com.oracle.bmc.waiter.TerminationStrategy terminationStrategy,
                    com.oracle.bmc.waiter.DelayStrategy delayStrategy) {
        if (workRequestClient == null) {
            throw new IllegalStateException(
                    "A WorkRequestClient must be supplied to this waiter for this operation");
        }

        return new com.oracle.bmc.waiter.internal.SimpleWaiterImpl<>(
                executorService,
                new java.util.concurrent.Callable<
                        DisableExternalPluggableDatabaseDatabaseManagementResponse>() {
                    @Override
                    public DisableExternalPluggableDatabaseDatabaseManagementResponse call()
                            throws Exception {
                        final DisableExternalPluggableDatabaseDatabaseManagementResponse response =
                                client.disableExternalPluggableDatabaseDatabaseManagement(request);

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
                    DisableExternalPluggableDatabaseOperationsInsightsRequest,
                    DisableExternalPluggableDatabaseOperationsInsightsResponse>
            forDisableExternalPluggableDatabaseOperationsInsights(
                    DisableExternalPluggableDatabaseOperationsInsightsRequest request) {
        return forDisableExternalPluggableDatabaseOperationsInsights(
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
                    DisableExternalPluggableDatabaseOperationsInsightsRequest,
                    DisableExternalPluggableDatabaseOperationsInsightsResponse>
            forDisableExternalPluggableDatabaseOperationsInsights(
                    DisableExternalPluggableDatabaseOperationsInsightsRequest request,
                    com.oracle.bmc.waiter.TerminationStrategy terminationStrategy,
                    com.oracle.bmc.waiter.DelayStrategy delayStrategy) {
        if (workRequestClient == null) {
            throw new IllegalStateException(
                    "A WorkRequestClient must be supplied to this waiter for this operation");
        }

        return new com.oracle.bmc.waiter.internal.SimpleWaiterImpl<>(
                executorService,
                new java.util.concurrent.Callable<
                        DisableExternalPluggableDatabaseOperationsInsightsResponse>() {
                    @Override
                    public DisableExternalPluggableDatabaseOperationsInsightsResponse call()
                            throws Exception {
                        final DisableExternalPluggableDatabaseOperationsInsightsResponse response =
                                client.disableExternalPluggableDatabaseOperationsInsights(request);

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
                    DisableExternalPluggableDatabaseStackMonitoringRequest,
                    DisableExternalPluggableDatabaseStackMonitoringResponse>
            forDisableExternalPluggableDatabaseStackMonitoring(
                    DisableExternalPluggableDatabaseStackMonitoringRequest request) {
        return forDisableExternalPluggableDatabaseStackMonitoring(
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
                    DisableExternalPluggableDatabaseStackMonitoringRequest,
                    DisableExternalPluggableDatabaseStackMonitoringResponse>
            forDisableExternalPluggableDatabaseStackMonitoring(
                    DisableExternalPluggableDatabaseStackMonitoringRequest request,
                    com.oracle.bmc.waiter.TerminationStrategy terminationStrategy,
                    com.oracle.bmc.waiter.DelayStrategy delayStrategy) {
        if (workRequestClient == null) {
            throw new IllegalStateException(
                    "A WorkRequestClient must be supplied to this waiter for this operation");
        }

        return new com.oracle.bmc.waiter.internal.SimpleWaiterImpl<>(
                executorService,
                new java.util.concurrent.Callable<
                        DisableExternalPluggableDatabaseStackMonitoringResponse>() {
                    @Override
                    public DisableExternalPluggableDatabaseStackMonitoringResponse call()
                            throws Exception {
                        final DisableExternalPluggableDatabaseStackMonitoringResponse response =
                                client.disableExternalPluggableDatabaseStackMonitoring(request);

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
                    DisablePluggableDatabaseManagementRequest,
                    DisablePluggableDatabaseManagementResponse>
            forDisablePluggableDatabaseManagement(
                    DisablePluggableDatabaseManagementRequest request) {
        return forDisablePluggableDatabaseManagement(
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
                    DisablePluggableDatabaseManagementRequest,
                    DisablePluggableDatabaseManagementResponse>
            forDisablePluggableDatabaseManagement(
                    DisablePluggableDatabaseManagementRequest request,
                    com.oracle.bmc.waiter.TerminationStrategy terminationStrategy,
                    com.oracle.bmc.waiter.DelayStrategy delayStrategy) {
        if (workRequestClient == null) {
            throw new IllegalStateException(
                    "A WorkRequestClient must be supplied to this waiter for this operation");
        }

        return new com.oracle.bmc.waiter.internal.SimpleWaiterImpl<>(
                executorService,
                new java.util.concurrent.Callable<DisablePluggableDatabaseManagementResponse>() {
                    @Override
                    public DisablePluggableDatabaseManagementResponse call() throws Exception {
                        final DisablePluggableDatabaseManagementResponse response =
                                client.disablePluggableDatabaseManagement(request);

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
                    EnableAutonomousDatabaseManagementRequest,
                    EnableAutonomousDatabaseManagementResponse>
            forEnableAutonomousDatabaseManagement(
                    EnableAutonomousDatabaseManagementRequest request) {
        return forEnableAutonomousDatabaseManagement(
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
                    EnableAutonomousDatabaseManagementRequest,
                    EnableAutonomousDatabaseManagementResponse>
            forEnableAutonomousDatabaseManagement(
                    EnableAutonomousDatabaseManagementRequest request,
                    com.oracle.bmc.waiter.TerminationStrategy terminationStrategy,
                    com.oracle.bmc.waiter.DelayStrategy delayStrategy) {
        if (workRequestClient == null) {
            throw new IllegalStateException(
                    "A WorkRequestClient must be supplied to this waiter for this operation");
        }

        return new com.oracle.bmc.waiter.internal.SimpleWaiterImpl<>(
                executorService,
                new java.util.concurrent.Callable<EnableAutonomousDatabaseManagementResponse>() {
                    @Override
                    public EnableAutonomousDatabaseManagementResponse call() throws Exception {
                        final EnableAutonomousDatabaseManagementResponse response =
                                client.enableAutonomousDatabaseManagement(request);

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
                    EnableAutonomousDatabaseOperationsInsightsRequest,
                    EnableAutonomousDatabaseOperationsInsightsResponse>
            forEnableAutonomousDatabaseOperationsInsights(
                    EnableAutonomousDatabaseOperationsInsightsRequest request) {
        return forEnableAutonomousDatabaseOperationsInsights(
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
                    EnableAutonomousDatabaseOperationsInsightsRequest,
                    EnableAutonomousDatabaseOperationsInsightsResponse>
            forEnableAutonomousDatabaseOperationsInsights(
                    EnableAutonomousDatabaseOperationsInsightsRequest request,
                    com.oracle.bmc.waiter.TerminationStrategy terminationStrategy,
                    com.oracle.bmc.waiter.DelayStrategy delayStrategy) {
        if (workRequestClient == null) {
            throw new IllegalStateException(
                    "A WorkRequestClient must be supplied to this waiter for this operation");
        }

        return new com.oracle.bmc.waiter.internal.SimpleWaiterImpl<>(
                executorService,
                new java.util.concurrent.Callable<
                        EnableAutonomousDatabaseOperationsInsightsResponse>() {
                    @Override
                    public EnableAutonomousDatabaseOperationsInsightsResponse call()
                            throws Exception {
                        final EnableAutonomousDatabaseOperationsInsightsResponse response =
                                client.enableAutonomousDatabaseOperationsInsights(request);

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
                    EnableDatabaseManagementRequest, EnableDatabaseManagementResponse>
            forEnableDatabaseManagement(EnableDatabaseManagementRequest request) {
        return forEnableDatabaseManagement(
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
                    EnableDatabaseManagementRequest, EnableDatabaseManagementResponse>
            forEnableDatabaseManagement(
                    EnableDatabaseManagementRequest request,
                    com.oracle.bmc.waiter.TerminationStrategy terminationStrategy,
                    com.oracle.bmc.waiter.DelayStrategy delayStrategy) {
        if (workRequestClient == null) {
            throw new IllegalStateException(
                    "A WorkRequestClient must be supplied to this waiter for this operation");
        }

        return new com.oracle.bmc.waiter.internal.SimpleWaiterImpl<>(
                executorService,
                new java.util.concurrent.Callable<EnableDatabaseManagementResponse>() {
                    @Override
                    public EnableDatabaseManagementResponse call() throws Exception {
                        final EnableDatabaseManagementResponse response =
                                client.enableDatabaseManagement(request);

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
                    EnableExternalContainerDatabaseDatabaseManagementRequest,
                    EnableExternalContainerDatabaseDatabaseManagementResponse>
            forEnableExternalContainerDatabaseDatabaseManagement(
                    EnableExternalContainerDatabaseDatabaseManagementRequest request) {
        return forEnableExternalContainerDatabaseDatabaseManagement(
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
                    EnableExternalContainerDatabaseDatabaseManagementRequest,
                    EnableExternalContainerDatabaseDatabaseManagementResponse>
            forEnableExternalContainerDatabaseDatabaseManagement(
                    EnableExternalContainerDatabaseDatabaseManagementRequest request,
                    com.oracle.bmc.waiter.TerminationStrategy terminationStrategy,
                    com.oracle.bmc.waiter.DelayStrategy delayStrategy) {
        if (workRequestClient == null) {
            throw new IllegalStateException(
                    "A WorkRequestClient must be supplied to this waiter for this operation");
        }

        return new com.oracle.bmc.waiter.internal.SimpleWaiterImpl<>(
                executorService,
                new java.util.concurrent.Callable<
                        EnableExternalContainerDatabaseDatabaseManagementResponse>() {
                    @Override
                    public EnableExternalContainerDatabaseDatabaseManagementResponse call()
                            throws Exception {
                        final EnableExternalContainerDatabaseDatabaseManagementResponse response =
                                client.enableExternalContainerDatabaseDatabaseManagement(request);

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
                    EnableExternalContainerDatabaseStackMonitoringRequest,
                    EnableExternalContainerDatabaseStackMonitoringResponse>
            forEnableExternalContainerDatabaseStackMonitoring(
                    EnableExternalContainerDatabaseStackMonitoringRequest request) {
        return forEnableExternalContainerDatabaseStackMonitoring(
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
                    EnableExternalContainerDatabaseStackMonitoringRequest,
                    EnableExternalContainerDatabaseStackMonitoringResponse>
            forEnableExternalContainerDatabaseStackMonitoring(
                    EnableExternalContainerDatabaseStackMonitoringRequest request,
                    com.oracle.bmc.waiter.TerminationStrategy terminationStrategy,
                    com.oracle.bmc.waiter.DelayStrategy delayStrategy) {
        if (workRequestClient == null) {
            throw new IllegalStateException(
                    "A WorkRequestClient must be supplied to this waiter for this operation");
        }

        return new com.oracle.bmc.waiter.internal.SimpleWaiterImpl<>(
                executorService,
                new java.util.concurrent.Callable<
                        EnableExternalContainerDatabaseStackMonitoringResponse>() {
                    @Override
                    public EnableExternalContainerDatabaseStackMonitoringResponse call()
                            throws Exception {
                        final EnableExternalContainerDatabaseStackMonitoringResponse response =
                                client.enableExternalContainerDatabaseStackMonitoring(request);

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
                    EnableExternalNonContainerDatabaseDatabaseManagementRequest,
                    EnableExternalNonContainerDatabaseDatabaseManagementResponse>
            forEnableExternalNonContainerDatabaseDatabaseManagement(
                    EnableExternalNonContainerDatabaseDatabaseManagementRequest request) {
        return forEnableExternalNonContainerDatabaseDatabaseManagement(
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
                    EnableExternalNonContainerDatabaseDatabaseManagementRequest,
                    EnableExternalNonContainerDatabaseDatabaseManagementResponse>
            forEnableExternalNonContainerDatabaseDatabaseManagement(
                    EnableExternalNonContainerDatabaseDatabaseManagementRequest request,
                    com.oracle.bmc.waiter.TerminationStrategy terminationStrategy,
                    com.oracle.bmc.waiter.DelayStrategy delayStrategy) {
        if (workRequestClient == null) {
            throw new IllegalStateException(
                    "A WorkRequestClient must be supplied to this waiter for this operation");
        }

        return new com.oracle.bmc.waiter.internal.SimpleWaiterImpl<>(
                executorService,
                new java.util.concurrent.Callable<
                        EnableExternalNonContainerDatabaseDatabaseManagementResponse>() {
                    @Override
                    public EnableExternalNonContainerDatabaseDatabaseManagementResponse call()
                            throws Exception {
                        final EnableExternalNonContainerDatabaseDatabaseManagementResponse
                                response =
                                        client.enableExternalNonContainerDatabaseDatabaseManagement(
                                                request);

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
                    EnableExternalNonContainerDatabaseOperationsInsightsRequest,
                    EnableExternalNonContainerDatabaseOperationsInsightsResponse>
            forEnableExternalNonContainerDatabaseOperationsInsights(
                    EnableExternalNonContainerDatabaseOperationsInsightsRequest request) {
        return forEnableExternalNonContainerDatabaseOperationsInsights(
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
                    EnableExternalNonContainerDatabaseOperationsInsightsRequest,
                    EnableExternalNonContainerDatabaseOperationsInsightsResponse>
            forEnableExternalNonContainerDatabaseOperationsInsights(
                    EnableExternalNonContainerDatabaseOperationsInsightsRequest request,
                    com.oracle.bmc.waiter.TerminationStrategy terminationStrategy,
                    com.oracle.bmc.waiter.DelayStrategy delayStrategy) {
        if (workRequestClient == null) {
            throw new IllegalStateException(
                    "A WorkRequestClient must be supplied to this waiter for this operation");
        }

        return new com.oracle.bmc.waiter.internal.SimpleWaiterImpl<>(
                executorService,
                new java.util.concurrent.Callable<
                        EnableExternalNonContainerDatabaseOperationsInsightsResponse>() {
                    @Override
                    public EnableExternalNonContainerDatabaseOperationsInsightsResponse call()
                            throws Exception {
                        final EnableExternalNonContainerDatabaseOperationsInsightsResponse
                                response =
                                        client.enableExternalNonContainerDatabaseOperationsInsights(
                                                request);

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
                    EnableExternalNonContainerDatabaseStackMonitoringRequest,
                    EnableExternalNonContainerDatabaseStackMonitoringResponse>
            forEnableExternalNonContainerDatabaseStackMonitoring(
                    EnableExternalNonContainerDatabaseStackMonitoringRequest request) {
        return forEnableExternalNonContainerDatabaseStackMonitoring(
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
                    EnableExternalNonContainerDatabaseStackMonitoringRequest,
                    EnableExternalNonContainerDatabaseStackMonitoringResponse>
            forEnableExternalNonContainerDatabaseStackMonitoring(
                    EnableExternalNonContainerDatabaseStackMonitoringRequest request,
                    com.oracle.bmc.waiter.TerminationStrategy terminationStrategy,
                    com.oracle.bmc.waiter.DelayStrategy delayStrategy) {
        if (workRequestClient == null) {
            throw new IllegalStateException(
                    "A WorkRequestClient must be supplied to this waiter for this operation");
        }

        return new com.oracle.bmc.waiter.internal.SimpleWaiterImpl<>(
                executorService,
                new java.util.concurrent.Callable<
                        EnableExternalNonContainerDatabaseStackMonitoringResponse>() {
                    @Override
                    public EnableExternalNonContainerDatabaseStackMonitoringResponse call()
                            throws Exception {
                        final EnableExternalNonContainerDatabaseStackMonitoringResponse response =
                                client.enableExternalNonContainerDatabaseStackMonitoring(request);

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
                    EnableExternalPluggableDatabaseDatabaseManagementRequest,
                    EnableExternalPluggableDatabaseDatabaseManagementResponse>
            forEnableExternalPluggableDatabaseDatabaseManagement(
                    EnableExternalPluggableDatabaseDatabaseManagementRequest request) {
        return forEnableExternalPluggableDatabaseDatabaseManagement(
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
                    EnableExternalPluggableDatabaseDatabaseManagementRequest,
                    EnableExternalPluggableDatabaseDatabaseManagementResponse>
            forEnableExternalPluggableDatabaseDatabaseManagement(
                    EnableExternalPluggableDatabaseDatabaseManagementRequest request,
                    com.oracle.bmc.waiter.TerminationStrategy terminationStrategy,
                    com.oracle.bmc.waiter.DelayStrategy delayStrategy) {
        if (workRequestClient == null) {
            throw new IllegalStateException(
                    "A WorkRequestClient must be supplied to this waiter for this operation");
        }

        return new com.oracle.bmc.waiter.internal.SimpleWaiterImpl<>(
                executorService,
                new java.util.concurrent.Callable<
                        EnableExternalPluggableDatabaseDatabaseManagementResponse>() {
                    @Override
                    public EnableExternalPluggableDatabaseDatabaseManagementResponse call()
                            throws Exception {
                        final EnableExternalPluggableDatabaseDatabaseManagementResponse response =
                                client.enableExternalPluggableDatabaseDatabaseManagement(request);

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
                    EnableExternalPluggableDatabaseOperationsInsightsRequest,
                    EnableExternalPluggableDatabaseOperationsInsightsResponse>
            forEnableExternalPluggableDatabaseOperationsInsights(
                    EnableExternalPluggableDatabaseOperationsInsightsRequest request) {
        return forEnableExternalPluggableDatabaseOperationsInsights(
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
                    EnableExternalPluggableDatabaseOperationsInsightsRequest,
                    EnableExternalPluggableDatabaseOperationsInsightsResponse>
            forEnableExternalPluggableDatabaseOperationsInsights(
                    EnableExternalPluggableDatabaseOperationsInsightsRequest request,
                    com.oracle.bmc.waiter.TerminationStrategy terminationStrategy,
                    com.oracle.bmc.waiter.DelayStrategy delayStrategy) {
        if (workRequestClient == null) {
            throw new IllegalStateException(
                    "A WorkRequestClient must be supplied to this waiter for this operation");
        }

        return new com.oracle.bmc.waiter.internal.SimpleWaiterImpl<>(
                executorService,
                new java.util.concurrent.Callable<
                        EnableExternalPluggableDatabaseOperationsInsightsResponse>() {
                    @Override
                    public EnableExternalPluggableDatabaseOperationsInsightsResponse call()
                            throws Exception {
                        final EnableExternalPluggableDatabaseOperationsInsightsResponse response =
                                client.enableExternalPluggableDatabaseOperationsInsights(request);

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
                    EnableExternalPluggableDatabaseStackMonitoringRequest,
                    EnableExternalPluggableDatabaseStackMonitoringResponse>
            forEnableExternalPluggableDatabaseStackMonitoring(
                    EnableExternalPluggableDatabaseStackMonitoringRequest request) {
        return forEnableExternalPluggableDatabaseStackMonitoring(
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
                    EnableExternalPluggableDatabaseStackMonitoringRequest,
                    EnableExternalPluggableDatabaseStackMonitoringResponse>
            forEnableExternalPluggableDatabaseStackMonitoring(
                    EnableExternalPluggableDatabaseStackMonitoringRequest request,
                    com.oracle.bmc.waiter.TerminationStrategy terminationStrategy,
                    com.oracle.bmc.waiter.DelayStrategy delayStrategy) {
        if (workRequestClient == null) {
            throw new IllegalStateException(
                    "A WorkRequestClient must be supplied to this waiter for this operation");
        }

        return new com.oracle.bmc.waiter.internal.SimpleWaiterImpl<>(
                executorService,
                new java.util.concurrent.Callable<
                        EnableExternalPluggableDatabaseStackMonitoringResponse>() {
                    @Override
                    public EnableExternalPluggableDatabaseStackMonitoringResponse call()
                            throws Exception {
                        final EnableExternalPluggableDatabaseStackMonitoringResponse response =
                                client.enableExternalPluggableDatabaseStackMonitoring(request);

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
                    EnablePluggableDatabaseManagementRequest,
                    EnablePluggableDatabaseManagementResponse>
            forEnablePluggableDatabaseManagement(EnablePluggableDatabaseManagementRequest request) {
        return forEnablePluggableDatabaseManagement(
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
                    EnablePluggableDatabaseManagementRequest,
                    EnablePluggableDatabaseManagementResponse>
            forEnablePluggableDatabaseManagement(
                    EnablePluggableDatabaseManagementRequest request,
                    com.oracle.bmc.waiter.TerminationStrategy terminationStrategy,
                    com.oracle.bmc.waiter.DelayStrategy delayStrategy) {
        if (workRequestClient == null) {
            throw new IllegalStateException(
                    "A WorkRequestClient must be supplied to this waiter for this operation");
        }

        return new com.oracle.bmc.waiter.internal.SimpleWaiterImpl<>(
                executorService,
                new java.util.concurrent.Callable<EnablePluggableDatabaseManagementResponse>() {
                    @Override
                    public EnablePluggableDatabaseManagementResponse call() throws Exception {
                        final EnablePluggableDatabaseManagementResponse response =
                                client.enablePluggableDatabaseManagement(request);

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
                    FailOverAutonomousDatabaseRequest, FailOverAutonomousDatabaseResponse>
            forFailOverAutonomousDatabase(FailOverAutonomousDatabaseRequest request) {
        return forFailOverAutonomousDatabase(
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
                    FailOverAutonomousDatabaseRequest, FailOverAutonomousDatabaseResponse>
            forFailOverAutonomousDatabase(
                    FailOverAutonomousDatabaseRequest request,
                    com.oracle.bmc.waiter.TerminationStrategy terminationStrategy,
                    com.oracle.bmc.waiter.DelayStrategy delayStrategy) {
        if (workRequestClient == null) {
            throw new IllegalStateException(
                    "A WorkRequestClient must be supplied to this waiter for this operation");
        }

        return new com.oracle.bmc.waiter.internal.SimpleWaiterImpl<>(
                executorService,
                new java.util.concurrent.Callable<FailOverAutonomousDatabaseResponse>() {
                    @Override
                    public FailOverAutonomousDatabaseResponse call() throws Exception {
                        final FailOverAutonomousDatabaseResponse response =
                                client.failOverAutonomousDatabase(request);

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
                    FailoverAutonomousContainerDatabaseDataguardAssociationRequest,
                    FailoverAutonomousContainerDatabaseDataguardAssociationResponse>
            forFailoverAutonomousContainerDatabaseDataguardAssociation(
                    FailoverAutonomousContainerDatabaseDataguardAssociationRequest request) {
        return forFailoverAutonomousContainerDatabaseDataguardAssociation(
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
                    FailoverAutonomousContainerDatabaseDataguardAssociationRequest,
                    FailoverAutonomousContainerDatabaseDataguardAssociationResponse>
            forFailoverAutonomousContainerDatabaseDataguardAssociation(
                    FailoverAutonomousContainerDatabaseDataguardAssociationRequest request,
                    com.oracle.bmc.waiter.TerminationStrategy terminationStrategy,
                    com.oracle.bmc.waiter.DelayStrategy delayStrategy) {
        if (workRequestClient == null) {
            throw new IllegalStateException(
                    "A WorkRequestClient must be supplied to this waiter for this operation");
        }

        return new com.oracle.bmc.waiter.internal.SimpleWaiterImpl<>(
                executorService,
                new java.util.concurrent.Callable<
                        FailoverAutonomousContainerDatabaseDataguardAssociationResponse>() {
                    @Override
                    public FailoverAutonomousContainerDatabaseDataguardAssociationResponse call()
                            throws Exception {
                        final FailoverAutonomousContainerDatabaseDataguardAssociationResponse
                                response =
                                        client
                                                .failoverAutonomousContainerDatabaseDataguardAssociation(
                                                        request);

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
                    FailoverDataGuardAssociationRequest, FailoverDataGuardAssociationResponse>
            forFailoverDataGuardAssociation(FailoverDataGuardAssociationRequest request) {
        return forFailoverDataGuardAssociation(
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
                    FailoverDataGuardAssociationRequest, FailoverDataGuardAssociationResponse>
            forFailoverDataGuardAssociation(
                    FailoverDataGuardAssociationRequest request,
                    com.oracle.bmc.waiter.TerminationStrategy terminationStrategy,
                    com.oracle.bmc.waiter.DelayStrategy delayStrategy) {
        if (workRequestClient == null) {
            throw new IllegalStateException(
                    "A WorkRequestClient must be supplied to this waiter for this operation");
        }

        return new com.oracle.bmc.waiter.internal.SimpleWaiterImpl<>(
                executorService,
                new java.util.concurrent.Callable<FailoverDataGuardAssociationResponse>() {
                    @Override
                    public FailoverDataGuardAssociationResponse call() throws Exception {
                        final FailoverDataGuardAssociationResponse response =
                                client.failoverDataGuardAssociation(request);

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
        com.oracle.bmc.util.internal.Validate.notEmpty(
                targetStates, "At least one targetState must be provided");
        com.oracle.bmc.util.internal.Validate.noNullElements(
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
        com.oracle.bmc.util.internal.Validate.notNull(
                targetState, "The targetState cannot be null");

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
        com.oracle.bmc.util.internal.Validate.notEmpty(
                targetStates, "At least one target state must be provided");
        com.oracle.bmc.util.internal.Validate.noNullElements(
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
                        () -> request,
                        new java.util.function.Function<
                                GetAutonomousContainerDatabaseRequest,
                                GetAutonomousContainerDatabaseResponse>() {
                            @Override
                            public GetAutonomousContainerDatabaseResponse apply(
                                    GetAutonomousContainerDatabaseRequest request) {
                                return client.getAutonomousContainerDatabase(request);
                            }
                        },
                        new java.util.function.Predicate<GetAutonomousContainerDatabaseResponse>() {
                            @Override
                            public boolean test(GetAutonomousContainerDatabaseResponse response) {
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
                    GetAutonomousContainerDatabaseDataguardAssociationRequest,
                    GetAutonomousContainerDatabaseDataguardAssociationResponse>
            forAutonomousContainerDatabaseDataguardAssociation(
                    GetAutonomousContainerDatabaseDataguardAssociationRequest request,
                    com.oracle.bmc.database.model.AutonomousContainerDatabaseDataguardAssociation
                                    .LifecycleState...
                            targetStates) {
        com.oracle.bmc.util.internal.Validate.notEmpty(
                targetStates, "At least one targetState must be provided");
        com.oracle.bmc.util.internal.Validate.noNullElements(
                targetStates, "Null targetState values are not permitted");

        return forAutonomousContainerDatabaseDataguardAssociation(
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
                    GetAutonomousContainerDatabaseDataguardAssociationRequest,
                    GetAutonomousContainerDatabaseDataguardAssociationResponse>
            forAutonomousContainerDatabaseDataguardAssociation(
                    GetAutonomousContainerDatabaseDataguardAssociationRequest request,
                    com.oracle.bmc.database.model.AutonomousContainerDatabaseDataguardAssociation
                                    .LifecycleState
                            targetState,
                    com.oracle.bmc.waiter.TerminationStrategy terminationStrategy,
                    com.oracle.bmc.waiter.DelayStrategy delayStrategy) {
        com.oracle.bmc.util.internal.Validate.notNull(
                targetState, "The targetState cannot be null");

        return forAutonomousContainerDatabaseDataguardAssociation(
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
                    GetAutonomousContainerDatabaseDataguardAssociationRequest,
                    GetAutonomousContainerDatabaseDataguardAssociationResponse>
            forAutonomousContainerDatabaseDataguardAssociation(
                    GetAutonomousContainerDatabaseDataguardAssociationRequest request,
                    com.oracle.bmc.waiter.TerminationStrategy terminationStrategy,
                    com.oracle.bmc.waiter.DelayStrategy delayStrategy,
                    com.oracle.bmc.database.model.AutonomousContainerDatabaseDataguardAssociation
                                    .LifecycleState...
                            targetStates) {
        com.oracle.bmc.util.internal.Validate.notEmpty(
                targetStates, "At least one target state must be provided");
        com.oracle.bmc.util.internal.Validate.noNullElements(
                targetStates, "Null target states are not permitted");

        return forAutonomousContainerDatabaseDataguardAssociation(
                com.oracle.bmc.waiter.Waiters.newWaiter(terminationStrategy, delayStrategy),
                request,
                targetStates);
    }

    // Helper method to create a new Waiter for AutonomousContainerDatabaseDataguardAssociation.
    private com.oracle.bmc.waiter.Waiter<
                    GetAutonomousContainerDatabaseDataguardAssociationRequest,
                    GetAutonomousContainerDatabaseDataguardAssociationResponse>
            forAutonomousContainerDatabaseDataguardAssociation(
                    com.oracle.bmc.waiter.BmcGenericWaiter waiter,
                    final GetAutonomousContainerDatabaseDataguardAssociationRequest request,
                    final com.oracle.bmc.database.model
                                    .AutonomousContainerDatabaseDataguardAssociation
                                    .LifecycleState...
                            targetStates) {
        final java.util.Set<
                        com.oracle.bmc.database.model
                                .AutonomousContainerDatabaseDataguardAssociation.LifecycleState>
                targetStatesSet = new java.util.HashSet<>(java.util.Arrays.asList(targetStates));

        return new com.oracle.bmc.waiter.internal.SimpleWaiterImpl<>(
                executorService,
                waiter.toCallable(
                        () -> request,
                        new java.util.function.Function<
                                GetAutonomousContainerDatabaseDataguardAssociationRequest,
                                GetAutonomousContainerDatabaseDataguardAssociationResponse>() {
                            @Override
                            public GetAutonomousContainerDatabaseDataguardAssociationResponse apply(
                                    GetAutonomousContainerDatabaseDataguardAssociationRequest
                                            request) {
                                return client.getAutonomousContainerDatabaseDataguardAssociation(
                                        request);
                            }
                        },
                        new java.util.function.Predicate<
                                GetAutonomousContainerDatabaseDataguardAssociationResponse>() {
                            @Override
                            public boolean test(
                                    GetAutonomousContainerDatabaseDataguardAssociationResponse
                                            response) {
                                return targetStatesSet.contains(
                                        response.getAutonomousContainerDatabaseDataguardAssociation()
                                                .getLifecycleState());
                            }
                        },
                        targetStatesSet.contains(
                                com.oracle.bmc.database.model
                                        .AutonomousContainerDatabaseDataguardAssociation
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
    public com.oracle.bmc.waiter.Waiter<GetAutonomousDatabaseRequest, GetAutonomousDatabaseResponse>
            forAutonomousDatabase(
                    GetAutonomousDatabaseRequest request,
                    com.oracle.bmc.database.model.AutonomousDatabase.LifecycleState...
                            targetStates) {
        com.oracle.bmc.util.internal.Validate.notEmpty(
                targetStates, "At least one targetState must be provided");
        com.oracle.bmc.util.internal.Validate.noNullElements(
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
        com.oracle.bmc.util.internal.Validate.notNull(
                targetState, "The targetState cannot be null");

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
        com.oracle.bmc.util.internal.Validate.notEmpty(
                targetStates, "At least one target state must be provided");
        com.oracle.bmc.util.internal.Validate.noNullElements(
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
                        () -> request,
                        new java.util.function.Function<
                                GetAutonomousDatabaseRequest, GetAutonomousDatabaseResponse>() {
                            @Override
                            public GetAutonomousDatabaseResponse apply(
                                    GetAutonomousDatabaseRequest request) {
                                return client.getAutonomousDatabase(request);
                            }
                        },
                        new java.util.function.Predicate<GetAutonomousDatabaseResponse>() {
                            @Override
                            public boolean test(GetAutonomousDatabaseResponse response) {
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
        com.oracle.bmc.util.internal.Validate.notEmpty(
                targetStates, "At least one targetState must be provided");
        com.oracle.bmc.util.internal.Validate.noNullElements(
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
        com.oracle.bmc.util.internal.Validate.notNull(
                targetState, "The targetState cannot be null");

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
        com.oracle.bmc.util.internal.Validate.notEmpty(
                targetStates, "At least one target state must be provided");
        com.oracle.bmc.util.internal.Validate.noNullElements(
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
                        () -> request,
                        new java.util.function.Function<
                                GetAutonomousDatabaseBackupRequest,
                                GetAutonomousDatabaseBackupResponse>() {
                            @Override
                            public GetAutonomousDatabaseBackupResponse apply(
                                    GetAutonomousDatabaseBackupRequest request) {
                                return client.getAutonomousDatabaseBackup(request);
                            }
                        },
                        new java.util.function.Predicate<GetAutonomousDatabaseBackupResponse>() {
                            @Override
                            public boolean test(GetAutonomousDatabaseBackupResponse response) {
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
                    GetAutonomousDatabaseDataguardAssociationRequest,
                    GetAutonomousDatabaseDataguardAssociationResponse>
            forAutonomousDatabaseDataguardAssociation(
                    GetAutonomousDatabaseDataguardAssociationRequest request,
                    com.oracle.bmc.database.model.AutonomousDatabaseDataguardAssociation
                                    .LifecycleState...
                            targetStates) {
        com.oracle.bmc.util.internal.Validate.notEmpty(
                targetStates, "At least one targetState must be provided");
        com.oracle.bmc.util.internal.Validate.noNullElements(
                targetStates, "Null targetState values are not permitted");

        return forAutonomousDatabaseDataguardAssociation(
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
                    GetAutonomousDatabaseDataguardAssociationRequest,
                    GetAutonomousDatabaseDataguardAssociationResponse>
            forAutonomousDatabaseDataguardAssociation(
                    GetAutonomousDatabaseDataguardAssociationRequest request,
                    com.oracle.bmc.database.model.AutonomousDatabaseDataguardAssociation
                                    .LifecycleState
                            targetState,
                    com.oracle.bmc.waiter.TerminationStrategy terminationStrategy,
                    com.oracle.bmc.waiter.DelayStrategy delayStrategy) {
        com.oracle.bmc.util.internal.Validate.notNull(
                targetState, "The targetState cannot be null");

        return forAutonomousDatabaseDataguardAssociation(
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
                    GetAutonomousDatabaseDataguardAssociationRequest,
                    GetAutonomousDatabaseDataguardAssociationResponse>
            forAutonomousDatabaseDataguardAssociation(
                    GetAutonomousDatabaseDataguardAssociationRequest request,
                    com.oracle.bmc.waiter.TerminationStrategy terminationStrategy,
                    com.oracle.bmc.waiter.DelayStrategy delayStrategy,
                    com.oracle.bmc.database.model.AutonomousDatabaseDataguardAssociation
                                    .LifecycleState...
                            targetStates) {
        com.oracle.bmc.util.internal.Validate.notEmpty(
                targetStates, "At least one target state must be provided");
        com.oracle.bmc.util.internal.Validate.noNullElements(
                targetStates, "Null target states are not permitted");

        return forAutonomousDatabaseDataguardAssociation(
                com.oracle.bmc.waiter.Waiters.newWaiter(terminationStrategy, delayStrategy),
                request,
                targetStates);
    }

    // Helper method to create a new Waiter for AutonomousDatabaseDataguardAssociation.
    private com.oracle.bmc.waiter.Waiter<
                    GetAutonomousDatabaseDataguardAssociationRequest,
                    GetAutonomousDatabaseDataguardAssociationResponse>
            forAutonomousDatabaseDataguardAssociation(
                    com.oracle.bmc.waiter.BmcGenericWaiter waiter,
                    final GetAutonomousDatabaseDataguardAssociationRequest request,
                    final com.oracle.bmc.database.model.AutonomousDatabaseDataguardAssociation
                                    .LifecycleState...
                            targetStates) {
        final java.util.Set<
                        com.oracle.bmc.database.model.AutonomousDatabaseDataguardAssociation
                                .LifecycleState>
                targetStatesSet = new java.util.HashSet<>(java.util.Arrays.asList(targetStates));

        return new com.oracle.bmc.waiter.internal.SimpleWaiterImpl<>(
                executorService,
                waiter.toCallable(
                        () -> request,
                        new java.util.function.Function<
                                GetAutonomousDatabaseDataguardAssociationRequest,
                                GetAutonomousDatabaseDataguardAssociationResponse>() {
                            @Override
                            public GetAutonomousDatabaseDataguardAssociationResponse apply(
                                    GetAutonomousDatabaseDataguardAssociationRequest request) {
                                return client.getAutonomousDatabaseDataguardAssociation(request);
                            }
                        },
                        new java.util.function.Predicate<
                                GetAutonomousDatabaseDataguardAssociationResponse>() {
                            @Override
                            public boolean test(
                                    GetAutonomousDatabaseDataguardAssociationResponse response) {
                                return targetStatesSet.contains(
                                        response.getAutonomousDatabaseDataguardAssociation()
                                                .getLifecycleState());
                            }
                        },
                        targetStatesSet.contains(
                                com.oracle.bmc.database.model.AutonomousDatabaseDataguardAssociation
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
                    GetAutonomousDatabaseWalletRequest, GetAutonomousDatabaseWalletResponse>
            forAutonomousDatabaseWallet(
                    GetAutonomousDatabaseWalletRequest request,
                    com.oracle.bmc.database.model.AutonomousDatabaseWallet.LifecycleState...
                            targetStates) {
        com.oracle.bmc.util.internal.Validate.notEmpty(
                targetStates, "At least one targetState must be provided");
        com.oracle.bmc.util.internal.Validate.noNullElements(
                targetStates, "Null targetState values are not permitted");

        return forAutonomousDatabaseWallet(
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
                    GetAutonomousDatabaseWalletRequest, GetAutonomousDatabaseWalletResponse>
            forAutonomousDatabaseWallet(
                    GetAutonomousDatabaseWalletRequest request,
                    com.oracle.bmc.database.model.AutonomousDatabaseWallet.LifecycleState
                            targetState,
                    com.oracle.bmc.waiter.TerminationStrategy terminationStrategy,
                    com.oracle.bmc.waiter.DelayStrategy delayStrategy) {
        com.oracle.bmc.util.internal.Validate.notNull(
                targetState, "The targetState cannot be null");

        return forAutonomousDatabaseWallet(
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
                    GetAutonomousDatabaseWalletRequest, GetAutonomousDatabaseWalletResponse>
            forAutonomousDatabaseWallet(
                    GetAutonomousDatabaseWalletRequest request,
                    com.oracle.bmc.waiter.TerminationStrategy terminationStrategy,
                    com.oracle.bmc.waiter.DelayStrategy delayStrategy,
                    com.oracle.bmc.database.model.AutonomousDatabaseWallet.LifecycleState...
                            targetStates) {
        com.oracle.bmc.util.internal.Validate.notEmpty(
                targetStates, "At least one target state must be provided");
        com.oracle.bmc.util.internal.Validate.noNullElements(
                targetStates, "Null target states are not permitted");

        return forAutonomousDatabaseWallet(
                com.oracle.bmc.waiter.Waiters.newWaiter(terminationStrategy, delayStrategy),
                request,
                targetStates);
    }

    // Helper method to create a new Waiter for AutonomousDatabaseWallet.
    private com.oracle.bmc.waiter.Waiter<
                    GetAutonomousDatabaseWalletRequest, GetAutonomousDatabaseWalletResponse>
            forAutonomousDatabaseWallet(
                    com.oracle.bmc.waiter.BmcGenericWaiter waiter,
                    final GetAutonomousDatabaseWalletRequest request,
                    final com.oracle.bmc.database.model.AutonomousDatabaseWallet.LifecycleState...
                            targetStates) {
        final java.util.Set<com.oracle.bmc.database.model.AutonomousDatabaseWallet.LifecycleState>
                targetStatesSet = new java.util.HashSet<>(java.util.Arrays.asList(targetStates));

        return new com.oracle.bmc.waiter.internal.SimpleWaiterImpl<>(
                executorService,
                waiter.toCallable(
                        () -> request,
                        new java.util.function.Function<
                                GetAutonomousDatabaseWalletRequest,
                                GetAutonomousDatabaseWalletResponse>() {
                            @Override
                            public GetAutonomousDatabaseWalletResponse apply(
                                    GetAutonomousDatabaseWalletRequest request) {
                                return client.getAutonomousDatabaseWallet(request);
                            }
                        },
                        new java.util.function.Predicate<GetAutonomousDatabaseWalletResponse>() {
                            @Override
                            public boolean test(GetAutonomousDatabaseWalletResponse response) {
                                return targetStatesSet.contains(
                                        response.getAutonomousDatabaseWallet().getLifecycleState());
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
    public com.oracle.bmc.waiter.Waiter<
                    GetAutonomousExadataInfrastructureRequest,
                    GetAutonomousExadataInfrastructureResponse>
            forAutonomousExadataInfrastructure(
                    GetAutonomousExadataInfrastructureRequest request,
                    com.oracle.bmc.database.model.AutonomousExadataInfrastructure.LifecycleState...
                            targetStates) {
        com.oracle.bmc.util.internal.Validate.notEmpty(
                targetStates, "At least one targetState must be provided");
        com.oracle.bmc.util.internal.Validate.noNullElements(
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
        com.oracle.bmc.util.internal.Validate.notNull(
                targetState, "The targetState cannot be null");

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
        com.oracle.bmc.util.internal.Validate.notEmpty(
                targetStates, "At least one target state must be provided");
        com.oracle.bmc.util.internal.Validate.noNullElements(
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
                        () -> request,
                        new java.util.function.Function<
                                GetAutonomousExadataInfrastructureRequest,
                                GetAutonomousExadataInfrastructureResponse>() {
                            @Override
                            public GetAutonomousExadataInfrastructureResponse apply(
                                    GetAutonomousExadataInfrastructureRequest request) {
                                return client.getAutonomousExadataInfrastructure(request);
                            }
                        },
                        new java.util.function.Predicate<
                                GetAutonomousExadataInfrastructureResponse>() {
                            @Override
                            public boolean test(
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
    public com.oracle.bmc.waiter.Waiter<GetAutonomousPatchRequest, GetAutonomousPatchResponse>
            forAutonomousPatch(
                    GetAutonomousPatchRequest request,
                    com.oracle.bmc.database.model.AutonomousPatch.LifecycleState... targetStates) {
        com.oracle.bmc.util.internal.Validate.notEmpty(
                targetStates, "At least one targetState must be provided");
        com.oracle.bmc.util.internal.Validate.noNullElements(
                targetStates, "Null targetState values are not permitted");

        return forAutonomousPatch(
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
    public com.oracle.bmc.waiter.Waiter<GetAutonomousPatchRequest, GetAutonomousPatchResponse>
            forAutonomousPatch(
                    GetAutonomousPatchRequest request,
                    com.oracle.bmc.database.model.AutonomousPatch.LifecycleState targetState,
                    com.oracle.bmc.waiter.TerminationStrategy terminationStrategy,
                    com.oracle.bmc.waiter.DelayStrategy delayStrategy) {
        com.oracle.bmc.util.internal.Validate.notNull(
                targetState, "The targetState cannot be null");

        return forAutonomousPatch(
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
    public com.oracle.bmc.waiter.Waiter<GetAutonomousPatchRequest, GetAutonomousPatchResponse>
            forAutonomousPatch(
                    GetAutonomousPatchRequest request,
                    com.oracle.bmc.waiter.TerminationStrategy terminationStrategy,
                    com.oracle.bmc.waiter.DelayStrategy delayStrategy,
                    com.oracle.bmc.database.model.AutonomousPatch.LifecycleState... targetStates) {
        com.oracle.bmc.util.internal.Validate.notEmpty(
                targetStates, "At least one target state must be provided");
        com.oracle.bmc.util.internal.Validate.noNullElements(
                targetStates, "Null target states are not permitted");

        return forAutonomousPatch(
                com.oracle.bmc.waiter.Waiters.newWaiter(terminationStrategy, delayStrategy),
                request,
                targetStates);
    }

    // Helper method to create a new Waiter for AutonomousPatch.
    private com.oracle.bmc.waiter.Waiter<GetAutonomousPatchRequest, GetAutonomousPatchResponse>
            forAutonomousPatch(
                    com.oracle.bmc.waiter.BmcGenericWaiter waiter,
                    final GetAutonomousPatchRequest request,
                    final com.oracle.bmc.database.model.AutonomousPatch.LifecycleState...
                            targetStates) {
        final java.util.Set<com.oracle.bmc.database.model.AutonomousPatch.LifecycleState>
                targetStatesSet = new java.util.HashSet<>(java.util.Arrays.asList(targetStates));

        return new com.oracle.bmc.waiter.internal.SimpleWaiterImpl<>(
                executorService,
                waiter.toCallable(
                        () -> request,
                        new java.util.function.Function<
                                GetAutonomousPatchRequest, GetAutonomousPatchResponse>() {
                            @Override
                            public GetAutonomousPatchResponse apply(
                                    GetAutonomousPatchRequest request) {
                                return client.getAutonomousPatch(request);
                            }
                        },
                        new java.util.function.Predicate<GetAutonomousPatchResponse>() {
                            @Override
                            public boolean test(GetAutonomousPatchResponse response) {
                                return targetStatesSet.contains(
                                        response.getAutonomousPatch().getLifecycleState());
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
    public com.oracle.bmc.waiter.Waiter<
                    GetAutonomousVmClusterRequest, GetAutonomousVmClusterResponse>
            forAutonomousVmCluster(
                    GetAutonomousVmClusterRequest request,
                    com.oracle.bmc.database.model.AutonomousVmCluster.LifecycleState...
                            targetStates) {
        com.oracle.bmc.util.internal.Validate.notEmpty(
                targetStates, "At least one targetState must be provided");
        com.oracle.bmc.util.internal.Validate.noNullElements(
                targetStates, "Null targetState values are not permitted");

        return forAutonomousVmCluster(
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
                    GetAutonomousVmClusterRequest, GetAutonomousVmClusterResponse>
            forAutonomousVmCluster(
                    GetAutonomousVmClusterRequest request,
                    com.oracle.bmc.database.model.AutonomousVmCluster.LifecycleState targetState,
                    com.oracle.bmc.waiter.TerminationStrategy terminationStrategy,
                    com.oracle.bmc.waiter.DelayStrategy delayStrategy) {
        com.oracle.bmc.util.internal.Validate.notNull(
                targetState, "The targetState cannot be null");

        return forAutonomousVmCluster(
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
                    GetAutonomousVmClusterRequest, GetAutonomousVmClusterResponse>
            forAutonomousVmCluster(
                    GetAutonomousVmClusterRequest request,
                    com.oracle.bmc.waiter.TerminationStrategy terminationStrategy,
                    com.oracle.bmc.waiter.DelayStrategy delayStrategy,
                    com.oracle.bmc.database.model.AutonomousVmCluster.LifecycleState...
                            targetStates) {
        com.oracle.bmc.util.internal.Validate.notEmpty(
                targetStates, "At least one target state must be provided");
        com.oracle.bmc.util.internal.Validate.noNullElements(
                targetStates, "Null target states are not permitted");

        return forAutonomousVmCluster(
                com.oracle.bmc.waiter.Waiters.newWaiter(terminationStrategy, delayStrategy),
                request,
                targetStates);
    }

    // Helper method to create a new Waiter for AutonomousVmCluster.
    private com.oracle.bmc.waiter.Waiter<
                    GetAutonomousVmClusterRequest, GetAutonomousVmClusterResponse>
            forAutonomousVmCluster(
                    com.oracle.bmc.waiter.BmcGenericWaiter waiter,
                    final GetAutonomousVmClusterRequest request,
                    final com.oracle.bmc.database.model.AutonomousVmCluster.LifecycleState...
                            targetStates) {
        final java.util.Set<com.oracle.bmc.database.model.AutonomousVmCluster.LifecycleState>
                targetStatesSet = new java.util.HashSet<>(java.util.Arrays.asList(targetStates));

        return new com.oracle.bmc.waiter.internal.SimpleWaiterImpl<>(
                executorService,
                waiter.toCallable(
                        () -> request,
                        new java.util.function.Function<
                                GetAutonomousVmClusterRequest, GetAutonomousVmClusterResponse>() {
                            @Override
                            public GetAutonomousVmClusterResponse apply(
                                    GetAutonomousVmClusterRequest request) {
                                return client.getAutonomousVmCluster(request);
                            }
                        },
                        new java.util.function.Predicate<GetAutonomousVmClusterResponse>() {
                            @Override
                            public boolean test(GetAutonomousVmClusterResponse response) {
                                return targetStatesSet.contains(
                                        response.getAutonomousVmCluster().getLifecycleState());
                            }
                        },
                        targetStatesSet.contains(
                                com.oracle.bmc.database.model.AutonomousVmCluster.LifecycleState
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
    public com.oracle.bmc.waiter.Waiter<GetBackupRequest, GetBackupResponse> forBackup(
            GetBackupRequest request,
            com.oracle.bmc.database.model.Backup.LifecycleState... targetStates) {
        com.oracle.bmc.util.internal.Validate.notEmpty(
                targetStates, "At least one targetState must be provided");
        com.oracle.bmc.util.internal.Validate.noNullElements(
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
        com.oracle.bmc.util.internal.Validate.notNull(
                targetState, "The targetState cannot be null");

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
        com.oracle.bmc.util.internal.Validate.notEmpty(
                targetStates, "At least one target state must be provided");
        com.oracle.bmc.util.internal.Validate.noNullElements(
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
                        () -> request,
                        new java.util.function.Function<GetBackupRequest, GetBackupResponse>() {
                            @Override
                            public GetBackupResponse apply(GetBackupRequest request) {
                                return client.getBackup(request);
                            }
                        },
                        new java.util.function.Predicate<GetBackupResponse>() {
                            @Override
                            public boolean test(GetBackupResponse response) {
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
    public com.oracle.bmc.waiter.Waiter<GetBackupDestinationRequest, GetBackupDestinationResponse>
            forBackupDestination(
                    GetBackupDestinationRequest request,
                    com.oracle.bmc.database.model.BackupDestination.LifecycleState...
                            targetStates) {
        com.oracle.bmc.util.internal.Validate.notEmpty(
                targetStates, "At least one targetState must be provided");
        com.oracle.bmc.util.internal.Validate.noNullElements(
                targetStates, "Null targetState values are not permitted");

        return forBackupDestination(
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
    public com.oracle.bmc.waiter.Waiter<GetBackupDestinationRequest, GetBackupDestinationResponse>
            forBackupDestination(
                    GetBackupDestinationRequest request,
                    com.oracle.bmc.database.model.BackupDestination.LifecycleState targetState,
                    com.oracle.bmc.waiter.TerminationStrategy terminationStrategy,
                    com.oracle.bmc.waiter.DelayStrategy delayStrategy) {
        com.oracle.bmc.util.internal.Validate.notNull(
                targetState, "The targetState cannot be null");

        return forBackupDestination(
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
    public com.oracle.bmc.waiter.Waiter<GetBackupDestinationRequest, GetBackupDestinationResponse>
            forBackupDestination(
                    GetBackupDestinationRequest request,
                    com.oracle.bmc.waiter.TerminationStrategy terminationStrategy,
                    com.oracle.bmc.waiter.DelayStrategy delayStrategy,
                    com.oracle.bmc.database.model.BackupDestination.LifecycleState...
                            targetStates) {
        com.oracle.bmc.util.internal.Validate.notEmpty(
                targetStates, "At least one target state must be provided");
        com.oracle.bmc.util.internal.Validate.noNullElements(
                targetStates, "Null target states are not permitted");

        return forBackupDestination(
                com.oracle.bmc.waiter.Waiters.newWaiter(terminationStrategy, delayStrategy),
                request,
                targetStates);
    }

    // Helper method to create a new Waiter for BackupDestination.
    private com.oracle.bmc.waiter.Waiter<GetBackupDestinationRequest, GetBackupDestinationResponse>
            forBackupDestination(
                    com.oracle.bmc.waiter.BmcGenericWaiter waiter,
                    final GetBackupDestinationRequest request,
                    final com.oracle.bmc.database.model.BackupDestination.LifecycleState...
                            targetStates) {
        final java.util.Set<com.oracle.bmc.database.model.BackupDestination.LifecycleState>
                targetStatesSet = new java.util.HashSet<>(java.util.Arrays.asList(targetStates));

        return new com.oracle.bmc.waiter.internal.SimpleWaiterImpl<>(
                executorService,
                waiter.toCallable(
                        () -> request,
                        new java.util.function.Function<
                                GetBackupDestinationRequest, GetBackupDestinationResponse>() {
                            @Override
                            public GetBackupDestinationResponse apply(
                                    GetBackupDestinationRequest request) {
                                return client.getBackupDestination(request);
                            }
                        },
                        new java.util.function.Predicate<GetBackupDestinationResponse>() {
                            @Override
                            public boolean test(GetBackupDestinationResponse response) {
                                return targetStatesSet.contains(
                                        response.getBackupDestination().getLifecycleState());
                            }
                        },
                        targetStatesSet.contains(
                                com.oracle.bmc.database.model.BackupDestination.LifecycleState
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
    public com.oracle.bmc.waiter.Waiter<
                    GetCloudAutonomousVmClusterRequest, GetCloudAutonomousVmClusterResponse>
            forCloudAutonomousVmCluster(
                    GetCloudAutonomousVmClusterRequest request,
                    com.oracle.bmc.database.model.CloudAutonomousVmCluster.LifecycleState...
                            targetStates) {
        com.oracle.bmc.util.internal.Validate.notEmpty(
                targetStates, "At least one targetState must be provided");
        com.oracle.bmc.util.internal.Validate.noNullElements(
                targetStates, "Null targetState values are not permitted");

        return forCloudAutonomousVmCluster(
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
                    GetCloudAutonomousVmClusterRequest, GetCloudAutonomousVmClusterResponse>
            forCloudAutonomousVmCluster(
                    GetCloudAutonomousVmClusterRequest request,
                    com.oracle.bmc.database.model.CloudAutonomousVmCluster.LifecycleState
                            targetState,
                    com.oracle.bmc.waiter.TerminationStrategy terminationStrategy,
                    com.oracle.bmc.waiter.DelayStrategy delayStrategy) {
        com.oracle.bmc.util.internal.Validate.notNull(
                targetState, "The targetState cannot be null");

        return forCloudAutonomousVmCluster(
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
                    GetCloudAutonomousVmClusterRequest, GetCloudAutonomousVmClusterResponse>
            forCloudAutonomousVmCluster(
                    GetCloudAutonomousVmClusterRequest request,
                    com.oracle.bmc.waiter.TerminationStrategy terminationStrategy,
                    com.oracle.bmc.waiter.DelayStrategy delayStrategy,
                    com.oracle.bmc.database.model.CloudAutonomousVmCluster.LifecycleState...
                            targetStates) {
        com.oracle.bmc.util.internal.Validate.notEmpty(
                targetStates, "At least one target state must be provided");
        com.oracle.bmc.util.internal.Validate.noNullElements(
                targetStates, "Null target states are not permitted");

        return forCloudAutonomousVmCluster(
                com.oracle.bmc.waiter.Waiters.newWaiter(terminationStrategy, delayStrategy),
                request,
                targetStates);
    }

    // Helper method to create a new Waiter for CloudAutonomousVmCluster.
    private com.oracle.bmc.waiter.Waiter<
                    GetCloudAutonomousVmClusterRequest, GetCloudAutonomousVmClusterResponse>
            forCloudAutonomousVmCluster(
                    com.oracle.bmc.waiter.BmcGenericWaiter waiter,
                    final GetCloudAutonomousVmClusterRequest request,
                    final com.oracle.bmc.database.model.CloudAutonomousVmCluster.LifecycleState...
                            targetStates) {
        final java.util.Set<com.oracle.bmc.database.model.CloudAutonomousVmCluster.LifecycleState>
                targetStatesSet = new java.util.HashSet<>(java.util.Arrays.asList(targetStates));

        return new com.oracle.bmc.waiter.internal.SimpleWaiterImpl<>(
                executorService,
                waiter.toCallable(
                        () -> request,
                        new java.util.function.Function<
                                GetCloudAutonomousVmClusterRequest,
                                GetCloudAutonomousVmClusterResponse>() {
                            @Override
                            public GetCloudAutonomousVmClusterResponse apply(
                                    GetCloudAutonomousVmClusterRequest request) {
                                return client.getCloudAutonomousVmCluster(request);
                            }
                        },
                        new java.util.function.Predicate<GetCloudAutonomousVmClusterResponse>() {
                            @Override
                            public boolean test(GetCloudAutonomousVmClusterResponse response) {
                                return targetStatesSet.contains(
                                        response.getCloudAutonomousVmCluster().getLifecycleState());
                            }
                        },
                        targetStatesSet.contains(
                                com.oracle.bmc.database.model.CloudAutonomousVmCluster
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
                    GetCloudExadataInfrastructureRequest, GetCloudExadataInfrastructureResponse>
            forCloudExadataInfrastructure(
                    GetCloudExadataInfrastructureRequest request,
                    com.oracle.bmc.database.model.CloudExadataInfrastructure.LifecycleState...
                            targetStates) {
        com.oracle.bmc.util.internal.Validate.notEmpty(
                targetStates, "At least one targetState must be provided");
        com.oracle.bmc.util.internal.Validate.noNullElements(
                targetStates, "Null targetState values are not permitted");

        return forCloudExadataInfrastructure(
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
                    GetCloudExadataInfrastructureRequest, GetCloudExadataInfrastructureResponse>
            forCloudExadataInfrastructure(
                    GetCloudExadataInfrastructureRequest request,
                    com.oracle.bmc.database.model.CloudExadataInfrastructure.LifecycleState
                            targetState,
                    com.oracle.bmc.waiter.TerminationStrategy terminationStrategy,
                    com.oracle.bmc.waiter.DelayStrategy delayStrategy) {
        com.oracle.bmc.util.internal.Validate.notNull(
                targetState, "The targetState cannot be null");

        return forCloudExadataInfrastructure(
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
                    GetCloudExadataInfrastructureRequest, GetCloudExadataInfrastructureResponse>
            forCloudExadataInfrastructure(
                    GetCloudExadataInfrastructureRequest request,
                    com.oracle.bmc.waiter.TerminationStrategy terminationStrategy,
                    com.oracle.bmc.waiter.DelayStrategy delayStrategy,
                    com.oracle.bmc.database.model.CloudExadataInfrastructure.LifecycleState...
                            targetStates) {
        com.oracle.bmc.util.internal.Validate.notEmpty(
                targetStates, "At least one target state must be provided");
        com.oracle.bmc.util.internal.Validate.noNullElements(
                targetStates, "Null target states are not permitted");

        return forCloudExadataInfrastructure(
                com.oracle.bmc.waiter.Waiters.newWaiter(terminationStrategy, delayStrategy),
                request,
                targetStates);
    }

    // Helper method to create a new Waiter for CloudExadataInfrastructure.
    private com.oracle.bmc.waiter.Waiter<
                    GetCloudExadataInfrastructureRequest, GetCloudExadataInfrastructureResponse>
            forCloudExadataInfrastructure(
                    com.oracle.bmc.waiter.BmcGenericWaiter waiter,
                    final GetCloudExadataInfrastructureRequest request,
                    final com.oracle.bmc.database.model.CloudExadataInfrastructure.LifecycleState...
                            targetStates) {
        final java.util.Set<com.oracle.bmc.database.model.CloudExadataInfrastructure.LifecycleState>
                targetStatesSet = new java.util.HashSet<>(java.util.Arrays.asList(targetStates));

        return new com.oracle.bmc.waiter.internal.SimpleWaiterImpl<>(
                executorService,
                waiter.toCallable(
                        () -> request,
                        new java.util.function.Function<
                                GetCloudExadataInfrastructureRequest,
                                GetCloudExadataInfrastructureResponse>() {
                            @Override
                            public GetCloudExadataInfrastructureResponse apply(
                                    GetCloudExadataInfrastructureRequest request) {
                                return client.getCloudExadataInfrastructure(request);
                            }
                        },
                        new java.util.function.Predicate<GetCloudExadataInfrastructureResponse>() {
                            @Override
                            public boolean test(GetCloudExadataInfrastructureResponse response) {
                                return targetStatesSet.contains(
                                        response.getCloudExadataInfrastructure()
                                                .getLifecycleState());
                            }
                        },
                        targetStatesSet.contains(
                                com.oracle.bmc.database.model.CloudExadataInfrastructure
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
    public com.oracle.bmc.waiter.Waiter<GetCloudVmClusterRequest, GetCloudVmClusterResponse>
            forCloudVmCluster(
                    GetCloudVmClusterRequest request,
                    com.oracle.bmc.database.model.CloudVmCluster.LifecycleState... targetStates) {
        com.oracle.bmc.util.internal.Validate.notEmpty(
                targetStates, "At least one targetState must be provided");
        com.oracle.bmc.util.internal.Validate.noNullElements(
                targetStates, "Null targetState values are not permitted");

        return forCloudVmCluster(
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
    public com.oracle.bmc.waiter.Waiter<GetCloudVmClusterRequest, GetCloudVmClusterResponse>
            forCloudVmCluster(
                    GetCloudVmClusterRequest request,
                    com.oracle.bmc.database.model.CloudVmCluster.LifecycleState targetState,
                    com.oracle.bmc.waiter.TerminationStrategy terminationStrategy,
                    com.oracle.bmc.waiter.DelayStrategy delayStrategy) {
        com.oracle.bmc.util.internal.Validate.notNull(
                targetState, "The targetState cannot be null");

        return forCloudVmCluster(
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
    public com.oracle.bmc.waiter.Waiter<GetCloudVmClusterRequest, GetCloudVmClusterResponse>
            forCloudVmCluster(
                    GetCloudVmClusterRequest request,
                    com.oracle.bmc.waiter.TerminationStrategy terminationStrategy,
                    com.oracle.bmc.waiter.DelayStrategy delayStrategy,
                    com.oracle.bmc.database.model.CloudVmCluster.LifecycleState... targetStates) {
        com.oracle.bmc.util.internal.Validate.notEmpty(
                targetStates, "At least one target state must be provided");
        com.oracle.bmc.util.internal.Validate.noNullElements(
                targetStates, "Null target states are not permitted");

        return forCloudVmCluster(
                com.oracle.bmc.waiter.Waiters.newWaiter(terminationStrategy, delayStrategy),
                request,
                targetStates);
    }

    // Helper method to create a new Waiter for CloudVmCluster.
    private com.oracle.bmc.waiter.Waiter<GetCloudVmClusterRequest, GetCloudVmClusterResponse>
            forCloudVmCluster(
                    com.oracle.bmc.waiter.BmcGenericWaiter waiter,
                    final GetCloudVmClusterRequest request,
                    final com.oracle.bmc.database.model.CloudVmCluster.LifecycleState...
                            targetStates) {
        final java.util.Set<com.oracle.bmc.database.model.CloudVmCluster.LifecycleState>
                targetStatesSet = new java.util.HashSet<>(java.util.Arrays.asList(targetStates));

        return new com.oracle.bmc.waiter.internal.SimpleWaiterImpl<>(
                executorService,
                waiter.toCallable(
                        () -> request,
                        new java.util.function.Function<
                                GetCloudVmClusterRequest, GetCloudVmClusterResponse>() {
                            @Override
                            public GetCloudVmClusterResponse apply(
                                    GetCloudVmClusterRequest request) {
                                return client.getCloudVmCluster(request);
                            }
                        },
                        new java.util.function.Predicate<GetCloudVmClusterResponse>() {
                            @Override
                            public boolean test(GetCloudVmClusterResponse response) {
                                return targetStatesSet.contains(
                                        response.getCloudVmCluster().getLifecycleState());
                            }
                        },
                        targetStatesSet.contains(
                                com.oracle.bmc.database.model.CloudVmCluster.LifecycleState
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
    public com.oracle.bmc.waiter.Waiter<GetConsoleConnectionRequest, GetConsoleConnectionResponse>
            forConsoleConnection(
                    GetConsoleConnectionRequest request,
                    com.oracle.bmc.database.model.ConsoleConnection.LifecycleState...
                            targetStates) {
        com.oracle.bmc.util.internal.Validate.notEmpty(
                targetStates, "At least one targetState must be provided");
        com.oracle.bmc.util.internal.Validate.noNullElements(
                targetStates, "Null targetState values are not permitted");

        return forConsoleConnection(
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
    public com.oracle.bmc.waiter.Waiter<GetConsoleConnectionRequest, GetConsoleConnectionResponse>
            forConsoleConnection(
                    GetConsoleConnectionRequest request,
                    com.oracle.bmc.database.model.ConsoleConnection.LifecycleState targetState,
                    com.oracle.bmc.waiter.TerminationStrategy terminationStrategy,
                    com.oracle.bmc.waiter.DelayStrategy delayStrategy) {
        com.oracle.bmc.util.internal.Validate.notNull(
                targetState, "The targetState cannot be null");

        return forConsoleConnection(
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
    public com.oracle.bmc.waiter.Waiter<GetConsoleConnectionRequest, GetConsoleConnectionResponse>
            forConsoleConnection(
                    GetConsoleConnectionRequest request,
                    com.oracle.bmc.waiter.TerminationStrategy terminationStrategy,
                    com.oracle.bmc.waiter.DelayStrategy delayStrategy,
                    com.oracle.bmc.database.model.ConsoleConnection.LifecycleState...
                            targetStates) {
        com.oracle.bmc.util.internal.Validate.notEmpty(
                targetStates, "At least one target state must be provided");
        com.oracle.bmc.util.internal.Validate.noNullElements(
                targetStates, "Null target states are not permitted");

        return forConsoleConnection(
                com.oracle.bmc.waiter.Waiters.newWaiter(terminationStrategy, delayStrategy),
                request,
                targetStates);
    }

    // Helper method to create a new Waiter for ConsoleConnection.
    private com.oracle.bmc.waiter.Waiter<GetConsoleConnectionRequest, GetConsoleConnectionResponse>
            forConsoleConnection(
                    com.oracle.bmc.waiter.BmcGenericWaiter waiter,
                    final GetConsoleConnectionRequest request,
                    final com.oracle.bmc.database.model.ConsoleConnection.LifecycleState...
                            targetStates) {
        final java.util.Set<com.oracle.bmc.database.model.ConsoleConnection.LifecycleState>
                targetStatesSet = new java.util.HashSet<>(java.util.Arrays.asList(targetStates));

        return new com.oracle.bmc.waiter.internal.SimpleWaiterImpl<>(
                executorService,
                waiter.toCallable(
                        () -> request,
                        new java.util.function.Function<
                                GetConsoleConnectionRequest, GetConsoleConnectionResponse>() {
                            @Override
                            public GetConsoleConnectionResponse apply(
                                    GetConsoleConnectionRequest request) {
                                return client.getConsoleConnection(request);
                            }
                        },
                        new java.util.function.Predicate<GetConsoleConnectionResponse>() {
                            @Override
                            public boolean test(GetConsoleConnectionResponse response) {
                                return targetStatesSet.contains(
                                        response.getConsoleConnection().getLifecycleState());
                            }
                        },
                        targetStatesSet.contains(
                                com.oracle.bmc.database.model.ConsoleConnection.LifecycleState
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
    public com.oracle.bmc.waiter.Waiter<
                    GetDataGuardAssociationRequest, GetDataGuardAssociationResponse>
            forDataGuardAssociation(
                    GetDataGuardAssociationRequest request,
                    com.oracle.bmc.database.model.DataGuardAssociation.LifecycleState...
                            targetStates) {
        com.oracle.bmc.util.internal.Validate.notEmpty(
                targetStates, "At least one targetState must be provided");
        com.oracle.bmc.util.internal.Validate.noNullElements(
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
        com.oracle.bmc.util.internal.Validate.notNull(
                targetState, "The targetState cannot be null");

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
        com.oracle.bmc.util.internal.Validate.notEmpty(
                targetStates, "At least one target state must be provided");
        com.oracle.bmc.util.internal.Validate.noNullElements(
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
                        () -> request,
                        new java.util.function.Function<
                                GetDataGuardAssociationRequest, GetDataGuardAssociationResponse>() {
                            @Override
                            public GetDataGuardAssociationResponse apply(
                                    GetDataGuardAssociationRequest request) {
                                return client.getDataGuardAssociation(request);
                            }
                        },
                        new java.util.function.Predicate<GetDataGuardAssociationResponse>() {
                            @Override
                            public boolean test(GetDataGuardAssociationResponse response) {
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
        com.oracle.bmc.util.internal.Validate.notEmpty(
                targetStates, "At least one targetState must be provided");
        com.oracle.bmc.util.internal.Validate.noNullElements(
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
        com.oracle.bmc.util.internal.Validate.notNull(
                targetState, "The targetState cannot be null");

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
        com.oracle.bmc.util.internal.Validate.notEmpty(
                targetStates, "At least one target state must be provided");
        com.oracle.bmc.util.internal.Validate.noNullElements(
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
                        () -> request,
                        new java.util.function.Function<GetDatabaseRequest, GetDatabaseResponse>() {
                            @Override
                            public GetDatabaseResponse apply(GetDatabaseRequest request) {
                                return client.getDatabase(request);
                            }
                        },
                        new java.util.function.Predicate<GetDatabaseResponse>() {
                            @Override
                            public boolean test(GetDatabaseResponse response) {
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
    public com.oracle.bmc.waiter.Waiter<
                    GetDatabaseSoftwareImageRequest, GetDatabaseSoftwareImageResponse>
            forDatabaseSoftwareImage(
                    GetDatabaseSoftwareImageRequest request,
                    com.oracle.bmc.database.model.DatabaseSoftwareImage.LifecycleState...
                            targetStates) {
        com.oracle.bmc.util.internal.Validate.notEmpty(
                targetStates, "At least one targetState must be provided");
        com.oracle.bmc.util.internal.Validate.noNullElements(
                targetStates, "Null targetState values are not permitted");

        return forDatabaseSoftwareImage(
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
                    GetDatabaseSoftwareImageRequest, GetDatabaseSoftwareImageResponse>
            forDatabaseSoftwareImage(
                    GetDatabaseSoftwareImageRequest request,
                    com.oracle.bmc.database.model.DatabaseSoftwareImage.LifecycleState targetState,
                    com.oracle.bmc.waiter.TerminationStrategy terminationStrategy,
                    com.oracle.bmc.waiter.DelayStrategy delayStrategy) {
        com.oracle.bmc.util.internal.Validate.notNull(
                targetState, "The targetState cannot be null");

        return forDatabaseSoftwareImage(
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
                    GetDatabaseSoftwareImageRequest, GetDatabaseSoftwareImageResponse>
            forDatabaseSoftwareImage(
                    GetDatabaseSoftwareImageRequest request,
                    com.oracle.bmc.waiter.TerminationStrategy terminationStrategy,
                    com.oracle.bmc.waiter.DelayStrategy delayStrategy,
                    com.oracle.bmc.database.model.DatabaseSoftwareImage.LifecycleState...
                            targetStates) {
        com.oracle.bmc.util.internal.Validate.notEmpty(
                targetStates, "At least one target state must be provided");
        com.oracle.bmc.util.internal.Validate.noNullElements(
                targetStates, "Null target states are not permitted");

        return forDatabaseSoftwareImage(
                com.oracle.bmc.waiter.Waiters.newWaiter(terminationStrategy, delayStrategy),
                request,
                targetStates);
    }

    // Helper method to create a new Waiter for DatabaseSoftwareImage.
    private com.oracle.bmc.waiter.Waiter<
                    GetDatabaseSoftwareImageRequest, GetDatabaseSoftwareImageResponse>
            forDatabaseSoftwareImage(
                    com.oracle.bmc.waiter.BmcGenericWaiter waiter,
                    final GetDatabaseSoftwareImageRequest request,
                    final com.oracle.bmc.database.model.DatabaseSoftwareImage.LifecycleState...
                            targetStates) {
        final java.util.Set<com.oracle.bmc.database.model.DatabaseSoftwareImage.LifecycleState>
                targetStatesSet = new java.util.HashSet<>(java.util.Arrays.asList(targetStates));

        return new com.oracle.bmc.waiter.internal.SimpleWaiterImpl<>(
                executorService,
                waiter.toCallable(
                        () -> request,
                        new java.util.function.Function<
                                GetDatabaseSoftwareImageRequest,
                                GetDatabaseSoftwareImageResponse>() {
                            @Override
                            public GetDatabaseSoftwareImageResponse apply(
                                    GetDatabaseSoftwareImageRequest request) {
                                return client.getDatabaseSoftwareImage(request);
                            }
                        },
                        new java.util.function.Predicate<GetDatabaseSoftwareImageResponse>() {
                            @Override
                            public boolean test(GetDatabaseSoftwareImageResponse response) {
                                return targetStatesSet.contains(
                                        response.getDatabaseSoftwareImage().getLifecycleState());
                            }
                        },
                        targetStatesSet.contains(
                                com.oracle.bmc.database.model.DatabaseSoftwareImage.LifecycleState
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
                    GetDatabaseUpgradeHistoryEntryRequest, GetDatabaseUpgradeHistoryEntryResponse>
            forDatabaseUpgradeHistoryEntry(
                    GetDatabaseUpgradeHistoryEntryRequest request,
                    com.oracle.bmc.database.model.DatabaseUpgradeHistoryEntry.LifecycleState...
                            targetStates) {
        com.oracle.bmc.util.internal.Validate.notEmpty(
                targetStates, "At least one targetState must be provided");
        com.oracle.bmc.util.internal.Validate.noNullElements(
                targetStates, "Null targetState values are not permitted");

        return forDatabaseUpgradeHistoryEntry(
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
                    GetDatabaseUpgradeHistoryEntryRequest, GetDatabaseUpgradeHistoryEntryResponse>
            forDatabaseUpgradeHistoryEntry(
                    GetDatabaseUpgradeHistoryEntryRequest request,
                    com.oracle.bmc.database.model.DatabaseUpgradeHistoryEntry.LifecycleState
                            targetState,
                    com.oracle.bmc.waiter.TerminationStrategy terminationStrategy,
                    com.oracle.bmc.waiter.DelayStrategy delayStrategy) {
        com.oracle.bmc.util.internal.Validate.notNull(
                targetState, "The targetState cannot be null");

        return forDatabaseUpgradeHistoryEntry(
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
                    GetDatabaseUpgradeHistoryEntryRequest, GetDatabaseUpgradeHistoryEntryResponse>
            forDatabaseUpgradeHistoryEntry(
                    GetDatabaseUpgradeHistoryEntryRequest request,
                    com.oracle.bmc.waiter.TerminationStrategy terminationStrategy,
                    com.oracle.bmc.waiter.DelayStrategy delayStrategy,
                    com.oracle.bmc.database.model.DatabaseUpgradeHistoryEntry.LifecycleState...
                            targetStates) {
        com.oracle.bmc.util.internal.Validate.notEmpty(
                targetStates, "At least one target state must be provided");
        com.oracle.bmc.util.internal.Validate.noNullElements(
                targetStates, "Null target states are not permitted");

        return forDatabaseUpgradeHistoryEntry(
                com.oracle.bmc.waiter.Waiters.newWaiter(terminationStrategy, delayStrategy),
                request,
                targetStates);
    }

    // Helper method to create a new Waiter for DatabaseUpgradeHistoryEntry.
    private com.oracle.bmc.waiter.Waiter<
                    GetDatabaseUpgradeHistoryEntryRequest, GetDatabaseUpgradeHistoryEntryResponse>
            forDatabaseUpgradeHistoryEntry(
                    com.oracle.bmc.waiter.BmcGenericWaiter waiter,
                    final GetDatabaseUpgradeHistoryEntryRequest request,
                    final com.oracle.bmc.database.model.DatabaseUpgradeHistoryEntry
                                    .LifecycleState...
                            targetStates) {
        final java.util.Set<
                        com.oracle.bmc.database.model.DatabaseUpgradeHistoryEntry.LifecycleState>
                targetStatesSet = new java.util.HashSet<>(java.util.Arrays.asList(targetStates));

        return new com.oracle.bmc.waiter.internal.SimpleWaiterImpl<>(
                executorService,
                waiter.toCallable(
                        () -> request,
                        new java.util.function.Function<
                                GetDatabaseUpgradeHistoryEntryRequest,
                                GetDatabaseUpgradeHistoryEntryResponse>() {
                            @Override
                            public GetDatabaseUpgradeHistoryEntryResponse apply(
                                    GetDatabaseUpgradeHistoryEntryRequest request) {
                                return client.getDatabaseUpgradeHistoryEntry(request);
                            }
                        },
                        new java.util.function.Predicate<GetDatabaseUpgradeHistoryEntryResponse>() {
                            @Override
                            public boolean test(GetDatabaseUpgradeHistoryEntryResponse response) {
                                return targetStatesSet.contains(
                                        response.getDatabaseUpgradeHistoryEntry()
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
     * @param targetStates the desired states to wait for. If multiple states are provided then the waiter will return once the resource reaches any of the provided states
     * @return a new {@code Waiter} instance
     */
    public com.oracle.bmc.waiter.Waiter<GetDbHomeRequest, GetDbHomeResponse> forDbHome(
            GetDbHomeRequest request,
            com.oracle.bmc.database.model.DbHome.LifecycleState... targetStates) {
        com.oracle.bmc.util.internal.Validate.notEmpty(
                targetStates, "At least one targetState must be provided");
        com.oracle.bmc.util.internal.Validate.noNullElements(
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
        com.oracle.bmc.util.internal.Validate.notNull(
                targetState, "The targetState cannot be null");

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
        com.oracle.bmc.util.internal.Validate.notEmpty(
                targetStates, "At least one target state must be provided");
        com.oracle.bmc.util.internal.Validate.noNullElements(
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
                        () -> request,
                        new java.util.function.Function<GetDbHomeRequest, GetDbHomeResponse>() {
                            @Override
                            public GetDbHomeResponse apply(GetDbHomeRequest request) {
                                return client.getDbHome(request);
                            }
                        },
                        new java.util.function.Predicate<GetDbHomeResponse>() {
                            @Override
                            public boolean test(GetDbHomeResponse response) {
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
        com.oracle.bmc.util.internal.Validate.notEmpty(
                targetStates, "At least one targetState must be provided");
        com.oracle.bmc.util.internal.Validate.noNullElements(
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
        com.oracle.bmc.util.internal.Validate.notNull(
                targetState, "The targetState cannot be null");

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
        com.oracle.bmc.util.internal.Validate.notEmpty(
                targetStates, "At least one target state must be provided");
        com.oracle.bmc.util.internal.Validate.noNullElements(
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
                        () -> request,
                        new java.util.function.Function<GetDbNodeRequest, GetDbNodeResponse>() {
                            @Override
                            public GetDbNodeResponse apply(GetDbNodeRequest request) {
                                return client.getDbNode(request);
                            }
                        },
                        new java.util.function.Predicate<GetDbNodeResponse>() {
                            @Override
                            public boolean test(GetDbNodeResponse response) {
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
    public com.oracle.bmc.waiter.Waiter<GetDbServerRequest, GetDbServerResponse> forDbServer(
            GetDbServerRequest request,
            com.oracle.bmc.database.model.DbServer.LifecycleState... targetStates) {
        com.oracle.bmc.util.internal.Validate.notEmpty(
                targetStates, "At least one targetState must be provided");
        com.oracle.bmc.util.internal.Validate.noNullElements(
                targetStates, "Null targetState values are not permitted");

        return forDbServer(
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
    public com.oracle.bmc.waiter.Waiter<GetDbServerRequest, GetDbServerResponse> forDbServer(
            GetDbServerRequest request,
            com.oracle.bmc.database.model.DbServer.LifecycleState targetState,
            com.oracle.bmc.waiter.TerminationStrategy terminationStrategy,
            com.oracle.bmc.waiter.DelayStrategy delayStrategy) {
        com.oracle.bmc.util.internal.Validate.notNull(
                targetState, "The targetState cannot be null");

        return forDbServer(
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
    public com.oracle.bmc.waiter.Waiter<GetDbServerRequest, GetDbServerResponse> forDbServer(
            GetDbServerRequest request,
            com.oracle.bmc.waiter.TerminationStrategy terminationStrategy,
            com.oracle.bmc.waiter.DelayStrategy delayStrategy,
            com.oracle.bmc.database.model.DbServer.LifecycleState... targetStates) {
        com.oracle.bmc.util.internal.Validate.notEmpty(
                targetStates, "At least one target state must be provided");
        com.oracle.bmc.util.internal.Validate.noNullElements(
                targetStates, "Null target states are not permitted");

        return forDbServer(
                com.oracle.bmc.waiter.Waiters.newWaiter(terminationStrategy, delayStrategy),
                request,
                targetStates);
    }

    // Helper method to create a new Waiter for DbServer.
    private com.oracle.bmc.waiter.Waiter<GetDbServerRequest, GetDbServerResponse> forDbServer(
            com.oracle.bmc.waiter.BmcGenericWaiter waiter,
            final GetDbServerRequest request,
            final com.oracle.bmc.database.model.DbServer.LifecycleState... targetStates) {
        final java.util.Set<com.oracle.bmc.database.model.DbServer.LifecycleState> targetStatesSet =
                new java.util.HashSet<>(java.util.Arrays.asList(targetStates));

        return new com.oracle.bmc.waiter.internal.SimpleWaiterImpl<>(
                executorService,
                waiter.toCallable(
                        () -> request,
                        new java.util.function.Function<GetDbServerRequest, GetDbServerResponse>() {
                            @Override
                            public GetDbServerResponse apply(GetDbServerRequest request) {
                                return client.getDbServer(request);
                            }
                        },
                        new java.util.function.Predicate<GetDbServerResponse>() {
                            @Override
                            public boolean test(GetDbServerResponse response) {
                                return targetStatesSet.contains(
                                        response.getDbServer().getLifecycleState());
                            }
                        },
                        targetStatesSet.contains(
                                com.oracle.bmc.database.model.DbServer.LifecycleState.Deleted)),
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
        com.oracle.bmc.util.internal.Validate.notEmpty(
                targetStates, "At least one targetState must be provided");
        com.oracle.bmc.util.internal.Validate.noNullElements(
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
        com.oracle.bmc.util.internal.Validate.notNull(
                targetState, "The targetState cannot be null");

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
        com.oracle.bmc.util.internal.Validate.notEmpty(
                targetStates, "At least one target state must be provided");
        com.oracle.bmc.util.internal.Validate.noNullElements(
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
                        () -> request,
                        new java.util.function.Function<GetDbSystemRequest, GetDbSystemResponse>() {
                            @Override
                            public GetDbSystemResponse apply(GetDbSystemRequest request) {
                                return client.getDbSystem(request);
                            }
                        },
                        new java.util.function.Predicate<GetDbSystemResponse>() {
                            @Override
                            public boolean test(GetDbSystemResponse response) {
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
    public com.oracle.bmc.waiter.Waiter<
                    GetDbSystemUpgradeHistoryEntryRequest, GetDbSystemUpgradeHistoryEntryResponse>
            forDbSystemUpgradeHistoryEntry(
                    GetDbSystemUpgradeHistoryEntryRequest request,
                    com.oracle.bmc.database.model.DbSystemUpgradeHistoryEntry.LifecycleState...
                            targetStates) {
        com.oracle.bmc.util.internal.Validate.notEmpty(
                targetStates, "At least one targetState must be provided");
        com.oracle.bmc.util.internal.Validate.noNullElements(
                targetStates, "Null targetState values are not permitted");

        return forDbSystemUpgradeHistoryEntry(
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
                    GetDbSystemUpgradeHistoryEntryRequest, GetDbSystemUpgradeHistoryEntryResponse>
            forDbSystemUpgradeHistoryEntry(
                    GetDbSystemUpgradeHistoryEntryRequest request,
                    com.oracle.bmc.database.model.DbSystemUpgradeHistoryEntry.LifecycleState
                            targetState,
                    com.oracle.bmc.waiter.TerminationStrategy terminationStrategy,
                    com.oracle.bmc.waiter.DelayStrategy delayStrategy) {
        com.oracle.bmc.util.internal.Validate.notNull(
                targetState, "The targetState cannot be null");

        return forDbSystemUpgradeHistoryEntry(
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
                    GetDbSystemUpgradeHistoryEntryRequest, GetDbSystemUpgradeHistoryEntryResponse>
            forDbSystemUpgradeHistoryEntry(
                    GetDbSystemUpgradeHistoryEntryRequest request,
                    com.oracle.bmc.waiter.TerminationStrategy terminationStrategy,
                    com.oracle.bmc.waiter.DelayStrategy delayStrategy,
                    com.oracle.bmc.database.model.DbSystemUpgradeHistoryEntry.LifecycleState...
                            targetStates) {
        com.oracle.bmc.util.internal.Validate.notEmpty(
                targetStates, "At least one target state must be provided");
        com.oracle.bmc.util.internal.Validate.noNullElements(
                targetStates, "Null target states are not permitted");

        return forDbSystemUpgradeHistoryEntry(
                com.oracle.bmc.waiter.Waiters.newWaiter(terminationStrategy, delayStrategy),
                request,
                targetStates);
    }

    // Helper method to create a new Waiter for DbSystemUpgradeHistoryEntry.
    private com.oracle.bmc.waiter.Waiter<
                    GetDbSystemUpgradeHistoryEntryRequest, GetDbSystemUpgradeHistoryEntryResponse>
            forDbSystemUpgradeHistoryEntry(
                    com.oracle.bmc.waiter.BmcGenericWaiter waiter,
                    final GetDbSystemUpgradeHistoryEntryRequest request,
                    final com.oracle.bmc.database.model.DbSystemUpgradeHistoryEntry
                                    .LifecycleState...
                            targetStates) {
        final java.util.Set<
                        com.oracle.bmc.database.model.DbSystemUpgradeHistoryEntry.LifecycleState>
                targetStatesSet = new java.util.HashSet<>(java.util.Arrays.asList(targetStates));

        return new com.oracle.bmc.waiter.internal.SimpleWaiterImpl<>(
                executorService,
                waiter.toCallable(
                        () -> request,
                        new java.util.function.Function<
                                GetDbSystemUpgradeHistoryEntryRequest,
                                GetDbSystemUpgradeHistoryEntryResponse>() {
                            @Override
                            public GetDbSystemUpgradeHistoryEntryResponse apply(
                                    GetDbSystemUpgradeHistoryEntryRequest request) {
                                return client.getDbSystemUpgradeHistoryEntry(request);
                            }
                        },
                        new java.util.function.Predicate<GetDbSystemUpgradeHistoryEntryResponse>() {
                            @Override
                            public boolean test(GetDbSystemUpgradeHistoryEntryResponse response) {
                                return targetStatesSet.contains(
                                        response.getDbSystemUpgradeHistoryEntry()
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
     * @param targetStates the desired states to wait for. If multiple states are provided then the waiter will return once the resource reaches any of the provided states
     * @return a new {@code Waiter} instance
     */
    public com.oracle.bmc.waiter.Waiter<
                    GetExadataInfrastructureRequest, GetExadataInfrastructureResponse>
            forExadataInfrastructure(
                    GetExadataInfrastructureRequest request,
                    com.oracle.bmc.database.model.ExadataInfrastructure.LifecycleState...
                            targetStates) {
        com.oracle.bmc.util.internal.Validate.notEmpty(
                targetStates, "At least one targetState must be provided");
        com.oracle.bmc.util.internal.Validate.noNullElements(
                targetStates, "Null targetState values are not permitted");

        return forExadataInfrastructure(
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
                    GetExadataInfrastructureRequest, GetExadataInfrastructureResponse>
            forExadataInfrastructure(
                    GetExadataInfrastructureRequest request,
                    com.oracle.bmc.database.model.ExadataInfrastructure.LifecycleState targetState,
                    com.oracle.bmc.waiter.TerminationStrategy terminationStrategy,
                    com.oracle.bmc.waiter.DelayStrategy delayStrategy) {
        com.oracle.bmc.util.internal.Validate.notNull(
                targetState, "The targetState cannot be null");

        return forExadataInfrastructure(
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
                    GetExadataInfrastructureRequest, GetExadataInfrastructureResponse>
            forExadataInfrastructure(
                    GetExadataInfrastructureRequest request,
                    com.oracle.bmc.waiter.TerminationStrategy terminationStrategy,
                    com.oracle.bmc.waiter.DelayStrategy delayStrategy,
                    com.oracle.bmc.database.model.ExadataInfrastructure.LifecycleState...
                            targetStates) {
        com.oracle.bmc.util.internal.Validate.notEmpty(
                targetStates, "At least one target state must be provided");
        com.oracle.bmc.util.internal.Validate.noNullElements(
                targetStates, "Null target states are not permitted");

        return forExadataInfrastructure(
                com.oracle.bmc.waiter.Waiters.newWaiter(terminationStrategy, delayStrategy),
                request,
                targetStates);
    }

    // Helper method to create a new Waiter for ExadataInfrastructure.
    private com.oracle.bmc.waiter.Waiter<
                    GetExadataInfrastructureRequest, GetExadataInfrastructureResponse>
            forExadataInfrastructure(
                    com.oracle.bmc.waiter.BmcGenericWaiter waiter,
                    final GetExadataInfrastructureRequest request,
                    final com.oracle.bmc.database.model.ExadataInfrastructure.LifecycleState...
                            targetStates) {
        final java.util.Set<com.oracle.bmc.database.model.ExadataInfrastructure.LifecycleState>
                targetStatesSet = new java.util.HashSet<>(java.util.Arrays.asList(targetStates));

        return new com.oracle.bmc.waiter.internal.SimpleWaiterImpl<>(
                executorService,
                waiter.toCallable(
                        () -> request,
                        new java.util.function.Function<
                                GetExadataInfrastructureRequest,
                                GetExadataInfrastructureResponse>() {
                            @Override
                            public GetExadataInfrastructureResponse apply(
                                    GetExadataInfrastructureRequest request) {
                                return client.getExadataInfrastructure(request);
                            }
                        },
                        new java.util.function.Predicate<GetExadataInfrastructureResponse>() {
                            @Override
                            public boolean test(GetExadataInfrastructureResponse response) {
                                return targetStatesSet.contains(
                                        response.getExadataInfrastructure().getLifecycleState());
                            }
                        },
                        targetStatesSet.contains(
                                com.oracle.bmc.database.model.ExadataInfrastructure.LifecycleState
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
    public com.oracle.bmc.waiter.Waiter<GetExadataIormConfigRequest, GetExadataIormConfigResponse>
            forExadataIormConfig(
                    GetExadataIormConfigRequest request,
                    com.oracle.bmc.database.model.ExadataIormConfig.LifecycleState...
                            targetStates) {
        com.oracle.bmc.util.internal.Validate.notEmpty(
                targetStates, "At least one targetState must be provided");
        com.oracle.bmc.util.internal.Validate.noNullElements(
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
        com.oracle.bmc.util.internal.Validate.notNull(
                targetState, "The targetState cannot be null");

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
        com.oracle.bmc.util.internal.Validate.notEmpty(
                targetStates, "At least one target state must be provided");
        com.oracle.bmc.util.internal.Validate.noNullElements(
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
                        () -> request,
                        new java.util.function.Function<
                                GetExadataIormConfigRequest, GetExadataIormConfigResponse>() {
                            @Override
                            public GetExadataIormConfigResponse apply(
                                    GetExadataIormConfigRequest request) {
                                return client.getExadataIormConfig(request);
                            }
                        },
                        new java.util.function.Predicate<GetExadataIormConfigResponse>() {
                            @Override
                            public boolean test(GetExadataIormConfigResponse response) {
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
    public com.oracle.bmc.waiter.Waiter<
                    GetExternalContainerDatabaseRequest, GetExternalContainerDatabaseResponse>
            forExternalContainerDatabase(
                    GetExternalContainerDatabaseRequest request,
                    com.oracle.bmc.database.model.ExternalContainerDatabase.LifecycleState...
                            targetStates) {
        com.oracle.bmc.util.internal.Validate.notEmpty(
                targetStates, "At least one targetState must be provided");
        com.oracle.bmc.util.internal.Validate.noNullElements(
                targetStates, "Null targetState values are not permitted");

        return forExternalContainerDatabase(
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
                    GetExternalContainerDatabaseRequest, GetExternalContainerDatabaseResponse>
            forExternalContainerDatabase(
                    GetExternalContainerDatabaseRequest request,
                    com.oracle.bmc.database.model.ExternalContainerDatabase.LifecycleState
                            targetState,
                    com.oracle.bmc.waiter.TerminationStrategy terminationStrategy,
                    com.oracle.bmc.waiter.DelayStrategy delayStrategy) {
        com.oracle.bmc.util.internal.Validate.notNull(
                targetState, "The targetState cannot be null");

        return forExternalContainerDatabase(
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
                    GetExternalContainerDatabaseRequest, GetExternalContainerDatabaseResponse>
            forExternalContainerDatabase(
                    GetExternalContainerDatabaseRequest request,
                    com.oracle.bmc.waiter.TerminationStrategy terminationStrategy,
                    com.oracle.bmc.waiter.DelayStrategy delayStrategy,
                    com.oracle.bmc.database.model.ExternalContainerDatabase.LifecycleState...
                            targetStates) {
        com.oracle.bmc.util.internal.Validate.notEmpty(
                targetStates, "At least one target state must be provided");
        com.oracle.bmc.util.internal.Validate.noNullElements(
                targetStates, "Null target states are not permitted");

        return forExternalContainerDatabase(
                com.oracle.bmc.waiter.Waiters.newWaiter(terminationStrategy, delayStrategy),
                request,
                targetStates);
    }

    // Helper method to create a new Waiter for ExternalContainerDatabase.
    private com.oracle.bmc.waiter.Waiter<
                    GetExternalContainerDatabaseRequest, GetExternalContainerDatabaseResponse>
            forExternalContainerDatabase(
                    com.oracle.bmc.waiter.BmcGenericWaiter waiter,
                    final GetExternalContainerDatabaseRequest request,
                    final com.oracle.bmc.database.model.ExternalContainerDatabase.LifecycleState...
                            targetStates) {
        final java.util.Set<com.oracle.bmc.database.model.ExternalContainerDatabase.LifecycleState>
                targetStatesSet = new java.util.HashSet<>(java.util.Arrays.asList(targetStates));

        return new com.oracle.bmc.waiter.internal.SimpleWaiterImpl<>(
                executorService,
                waiter.toCallable(
                        () -> request,
                        new java.util.function.Function<
                                GetExternalContainerDatabaseRequest,
                                GetExternalContainerDatabaseResponse>() {
                            @Override
                            public GetExternalContainerDatabaseResponse apply(
                                    GetExternalContainerDatabaseRequest request) {
                                return client.getExternalContainerDatabase(request);
                            }
                        },
                        new java.util.function.Predicate<GetExternalContainerDatabaseResponse>() {
                            @Override
                            public boolean test(GetExternalContainerDatabaseResponse response) {
                                return targetStatesSet.contains(
                                        response.getExternalContainerDatabase()
                                                .getLifecycleState());
                            }
                        },
                        targetStatesSet.contains(
                                com.oracle.bmc.database.model.ExternalContainerDatabase
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
                    GetExternalDatabaseConnectorRequest, GetExternalDatabaseConnectorResponse>
            forExternalDatabaseConnector(
                    GetExternalDatabaseConnectorRequest request,
                    com.oracle.bmc.database.model.ExternalDatabaseConnector.LifecycleState...
                            targetStates) {
        com.oracle.bmc.util.internal.Validate.notEmpty(
                targetStates, "At least one targetState must be provided");
        com.oracle.bmc.util.internal.Validate.noNullElements(
                targetStates, "Null targetState values are not permitted");

        return forExternalDatabaseConnector(
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
                    GetExternalDatabaseConnectorRequest, GetExternalDatabaseConnectorResponse>
            forExternalDatabaseConnector(
                    GetExternalDatabaseConnectorRequest request,
                    com.oracle.bmc.database.model.ExternalDatabaseConnector.LifecycleState
                            targetState,
                    com.oracle.bmc.waiter.TerminationStrategy terminationStrategy,
                    com.oracle.bmc.waiter.DelayStrategy delayStrategy) {
        com.oracle.bmc.util.internal.Validate.notNull(
                targetState, "The targetState cannot be null");

        return forExternalDatabaseConnector(
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
                    GetExternalDatabaseConnectorRequest, GetExternalDatabaseConnectorResponse>
            forExternalDatabaseConnector(
                    GetExternalDatabaseConnectorRequest request,
                    com.oracle.bmc.waiter.TerminationStrategy terminationStrategy,
                    com.oracle.bmc.waiter.DelayStrategy delayStrategy,
                    com.oracle.bmc.database.model.ExternalDatabaseConnector.LifecycleState...
                            targetStates) {
        com.oracle.bmc.util.internal.Validate.notEmpty(
                targetStates, "At least one target state must be provided");
        com.oracle.bmc.util.internal.Validate.noNullElements(
                targetStates, "Null target states are not permitted");

        return forExternalDatabaseConnector(
                com.oracle.bmc.waiter.Waiters.newWaiter(terminationStrategy, delayStrategy),
                request,
                targetStates);
    }

    // Helper method to create a new Waiter for ExternalDatabaseConnector.
    private com.oracle.bmc.waiter.Waiter<
                    GetExternalDatabaseConnectorRequest, GetExternalDatabaseConnectorResponse>
            forExternalDatabaseConnector(
                    com.oracle.bmc.waiter.BmcGenericWaiter waiter,
                    final GetExternalDatabaseConnectorRequest request,
                    final com.oracle.bmc.database.model.ExternalDatabaseConnector.LifecycleState...
                            targetStates) {
        final java.util.Set<com.oracle.bmc.database.model.ExternalDatabaseConnector.LifecycleState>
                targetStatesSet = new java.util.HashSet<>(java.util.Arrays.asList(targetStates));

        return new com.oracle.bmc.waiter.internal.SimpleWaiterImpl<>(
                executorService,
                waiter.toCallable(
                        () -> request,
                        new java.util.function.Function<
                                GetExternalDatabaseConnectorRequest,
                                GetExternalDatabaseConnectorResponse>() {
                            @Override
                            public GetExternalDatabaseConnectorResponse apply(
                                    GetExternalDatabaseConnectorRequest request) {
                                return client.getExternalDatabaseConnector(request);
                            }
                        },
                        new java.util.function.Predicate<GetExternalDatabaseConnectorResponse>() {
                            @Override
                            public boolean test(GetExternalDatabaseConnectorResponse response) {
                                return targetStatesSet.contains(
                                        response.getExternalDatabaseConnector()
                                                .getLifecycleState());
                            }
                        },
                        targetStatesSet.contains(
                                com.oracle.bmc.database.model.ExternalDatabaseConnector
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
                    GetExternalNonContainerDatabaseRequest, GetExternalNonContainerDatabaseResponse>
            forExternalNonContainerDatabase(
                    GetExternalNonContainerDatabaseRequest request,
                    com.oracle.bmc.database.model.ExternalNonContainerDatabase.LifecycleState...
                            targetStates) {
        com.oracle.bmc.util.internal.Validate.notEmpty(
                targetStates, "At least one targetState must be provided");
        com.oracle.bmc.util.internal.Validate.noNullElements(
                targetStates, "Null targetState values are not permitted");

        return forExternalNonContainerDatabase(
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
                    GetExternalNonContainerDatabaseRequest, GetExternalNonContainerDatabaseResponse>
            forExternalNonContainerDatabase(
                    GetExternalNonContainerDatabaseRequest request,
                    com.oracle.bmc.database.model.ExternalNonContainerDatabase.LifecycleState
                            targetState,
                    com.oracle.bmc.waiter.TerminationStrategy terminationStrategy,
                    com.oracle.bmc.waiter.DelayStrategy delayStrategy) {
        com.oracle.bmc.util.internal.Validate.notNull(
                targetState, "The targetState cannot be null");

        return forExternalNonContainerDatabase(
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
                    GetExternalNonContainerDatabaseRequest, GetExternalNonContainerDatabaseResponse>
            forExternalNonContainerDatabase(
                    GetExternalNonContainerDatabaseRequest request,
                    com.oracle.bmc.waiter.TerminationStrategy terminationStrategy,
                    com.oracle.bmc.waiter.DelayStrategy delayStrategy,
                    com.oracle.bmc.database.model.ExternalNonContainerDatabase.LifecycleState...
                            targetStates) {
        com.oracle.bmc.util.internal.Validate.notEmpty(
                targetStates, "At least one target state must be provided");
        com.oracle.bmc.util.internal.Validate.noNullElements(
                targetStates, "Null target states are not permitted");

        return forExternalNonContainerDatabase(
                com.oracle.bmc.waiter.Waiters.newWaiter(terminationStrategy, delayStrategy),
                request,
                targetStates);
    }

    // Helper method to create a new Waiter for ExternalNonContainerDatabase.
    private com.oracle.bmc.waiter.Waiter<
                    GetExternalNonContainerDatabaseRequest, GetExternalNonContainerDatabaseResponse>
            forExternalNonContainerDatabase(
                    com.oracle.bmc.waiter.BmcGenericWaiter waiter,
                    final GetExternalNonContainerDatabaseRequest request,
                    final com.oracle.bmc.database.model.ExternalNonContainerDatabase
                                    .LifecycleState...
                            targetStates) {
        final java.util.Set<
                        com.oracle.bmc.database.model.ExternalNonContainerDatabase.LifecycleState>
                targetStatesSet = new java.util.HashSet<>(java.util.Arrays.asList(targetStates));

        return new com.oracle.bmc.waiter.internal.SimpleWaiterImpl<>(
                executorService,
                waiter.toCallable(
                        () -> request,
                        new java.util.function.Function<
                                GetExternalNonContainerDatabaseRequest,
                                GetExternalNonContainerDatabaseResponse>() {
                            @Override
                            public GetExternalNonContainerDatabaseResponse apply(
                                    GetExternalNonContainerDatabaseRequest request) {
                                return client.getExternalNonContainerDatabase(request);
                            }
                        },
                        new java.util.function.Predicate<
                                GetExternalNonContainerDatabaseResponse>() {
                            @Override
                            public boolean test(GetExternalNonContainerDatabaseResponse response) {
                                return targetStatesSet.contains(
                                        response.getExternalNonContainerDatabase()
                                                .getLifecycleState());
                            }
                        },
                        targetStatesSet.contains(
                                com.oracle.bmc.database.model.ExternalNonContainerDatabase
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
                    GetExternalPluggableDatabaseRequest, GetExternalPluggableDatabaseResponse>
            forExternalPluggableDatabase(
                    GetExternalPluggableDatabaseRequest request,
                    com.oracle.bmc.database.model.ExternalPluggableDatabase.LifecycleState...
                            targetStates) {
        com.oracle.bmc.util.internal.Validate.notEmpty(
                targetStates, "At least one targetState must be provided");
        com.oracle.bmc.util.internal.Validate.noNullElements(
                targetStates, "Null targetState values are not permitted");

        return forExternalPluggableDatabase(
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
                    GetExternalPluggableDatabaseRequest, GetExternalPluggableDatabaseResponse>
            forExternalPluggableDatabase(
                    GetExternalPluggableDatabaseRequest request,
                    com.oracle.bmc.database.model.ExternalPluggableDatabase.LifecycleState
                            targetState,
                    com.oracle.bmc.waiter.TerminationStrategy terminationStrategy,
                    com.oracle.bmc.waiter.DelayStrategy delayStrategy) {
        com.oracle.bmc.util.internal.Validate.notNull(
                targetState, "The targetState cannot be null");

        return forExternalPluggableDatabase(
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
                    GetExternalPluggableDatabaseRequest, GetExternalPluggableDatabaseResponse>
            forExternalPluggableDatabase(
                    GetExternalPluggableDatabaseRequest request,
                    com.oracle.bmc.waiter.TerminationStrategy terminationStrategy,
                    com.oracle.bmc.waiter.DelayStrategy delayStrategy,
                    com.oracle.bmc.database.model.ExternalPluggableDatabase.LifecycleState...
                            targetStates) {
        com.oracle.bmc.util.internal.Validate.notEmpty(
                targetStates, "At least one target state must be provided");
        com.oracle.bmc.util.internal.Validate.noNullElements(
                targetStates, "Null target states are not permitted");

        return forExternalPluggableDatabase(
                com.oracle.bmc.waiter.Waiters.newWaiter(terminationStrategy, delayStrategy),
                request,
                targetStates);
    }

    // Helper method to create a new Waiter for ExternalPluggableDatabase.
    private com.oracle.bmc.waiter.Waiter<
                    GetExternalPluggableDatabaseRequest, GetExternalPluggableDatabaseResponse>
            forExternalPluggableDatabase(
                    com.oracle.bmc.waiter.BmcGenericWaiter waiter,
                    final GetExternalPluggableDatabaseRequest request,
                    final com.oracle.bmc.database.model.ExternalPluggableDatabase.LifecycleState...
                            targetStates) {
        final java.util.Set<com.oracle.bmc.database.model.ExternalPluggableDatabase.LifecycleState>
                targetStatesSet = new java.util.HashSet<>(java.util.Arrays.asList(targetStates));

        return new com.oracle.bmc.waiter.internal.SimpleWaiterImpl<>(
                executorService,
                waiter.toCallable(
                        () -> request,
                        new java.util.function.Function<
                                GetExternalPluggableDatabaseRequest,
                                GetExternalPluggableDatabaseResponse>() {
                            @Override
                            public GetExternalPluggableDatabaseResponse apply(
                                    GetExternalPluggableDatabaseRequest request) {
                                return client.getExternalPluggableDatabase(request);
                            }
                        },
                        new java.util.function.Predicate<GetExternalPluggableDatabaseResponse>() {
                            @Override
                            public boolean test(GetExternalPluggableDatabaseResponse response) {
                                return targetStatesSet.contains(
                                        response.getExternalPluggableDatabase()
                                                .getLifecycleState());
                            }
                        },
                        targetStatesSet.contains(
                                com.oracle.bmc.database.model.ExternalPluggableDatabase
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
    public com.oracle.bmc.waiter.Waiter<GetKeyStoreRequest, GetKeyStoreResponse> forKeyStore(
            GetKeyStoreRequest request,
            com.oracle.bmc.database.model.KeyStore.LifecycleState... targetStates) {
        com.oracle.bmc.util.internal.Validate.notEmpty(
                targetStates, "At least one targetState must be provided");
        com.oracle.bmc.util.internal.Validate.noNullElements(
                targetStates, "Null targetState values are not permitted");

        return forKeyStore(
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
    public com.oracle.bmc.waiter.Waiter<GetKeyStoreRequest, GetKeyStoreResponse> forKeyStore(
            GetKeyStoreRequest request,
            com.oracle.bmc.database.model.KeyStore.LifecycleState targetState,
            com.oracle.bmc.waiter.TerminationStrategy terminationStrategy,
            com.oracle.bmc.waiter.DelayStrategy delayStrategy) {
        com.oracle.bmc.util.internal.Validate.notNull(
                targetState, "The targetState cannot be null");

        return forKeyStore(
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
    public com.oracle.bmc.waiter.Waiter<GetKeyStoreRequest, GetKeyStoreResponse> forKeyStore(
            GetKeyStoreRequest request,
            com.oracle.bmc.waiter.TerminationStrategy terminationStrategy,
            com.oracle.bmc.waiter.DelayStrategy delayStrategy,
            com.oracle.bmc.database.model.KeyStore.LifecycleState... targetStates) {
        com.oracle.bmc.util.internal.Validate.notEmpty(
                targetStates, "At least one target state must be provided");
        com.oracle.bmc.util.internal.Validate.noNullElements(
                targetStates, "Null target states are not permitted");

        return forKeyStore(
                com.oracle.bmc.waiter.Waiters.newWaiter(terminationStrategy, delayStrategy),
                request,
                targetStates);
    }

    // Helper method to create a new Waiter for KeyStore.
    private com.oracle.bmc.waiter.Waiter<GetKeyStoreRequest, GetKeyStoreResponse> forKeyStore(
            com.oracle.bmc.waiter.BmcGenericWaiter waiter,
            final GetKeyStoreRequest request,
            final com.oracle.bmc.database.model.KeyStore.LifecycleState... targetStates) {
        final java.util.Set<com.oracle.bmc.database.model.KeyStore.LifecycleState> targetStatesSet =
                new java.util.HashSet<>(java.util.Arrays.asList(targetStates));

        return new com.oracle.bmc.waiter.internal.SimpleWaiterImpl<>(
                executorService,
                waiter.toCallable(
                        () -> request,
                        new java.util.function.Function<GetKeyStoreRequest, GetKeyStoreResponse>() {
                            @Override
                            public GetKeyStoreResponse apply(GetKeyStoreRequest request) {
                                return client.getKeyStore(request);
                            }
                        },
                        new java.util.function.Predicate<GetKeyStoreResponse>() {
                            @Override
                            public boolean test(GetKeyStoreResponse response) {
                                return targetStatesSet.contains(
                                        response.getKeyStore().getLifecycleState());
                            }
                        },
                        targetStatesSet.contains(
                                com.oracle.bmc.database.model.KeyStore.LifecycleState.Deleted)),
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
        com.oracle.bmc.util.internal.Validate.notEmpty(
                targetStates, "At least one targetState must be provided");
        com.oracle.bmc.util.internal.Validate.noNullElements(
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
        com.oracle.bmc.util.internal.Validate.notNull(
                targetState, "The targetState cannot be null");

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
        com.oracle.bmc.util.internal.Validate.notEmpty(
                targetStates, "At least one target state must be provided");
        com.oracle.bmc.util.internal.Validate.noNullElements(
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
                        () -> request,
                        new java.util.function.Function<
                                GetMaintenanceRunRequest, GetMaintenanceRunResponse>() {
                            @Override
                            public GetMaintenanceRunResponse apply(
                                    GetMaintenanceRunRequest request) {
                                return client.getMaintenanceRun(request);
                            }
                        },
                        new java.util.function.Predicate<GetMaintenanceRunResponse>() {
                            @Override
                            public boolean test(GetMaintenanceRunResponse response) {
                                return targetStatesSet.contains(
                                        response.getMaintenanceRun().getLifecycleState());
                            }
                        },
                        targetStatesSet.contains(
                                com.oracle.bmc.database.model.MaintenanceRun.LifecycleState
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
    public com.oracle.bmc.waiter.Waiter<
                    GetPdbConversionHistoryEntryRequest, GetPdbConversionHistoryEntryResponse>
            forPdbConversionHistoryEntry(
                    GetPdbConversionHistoryEntryRequest request,
                    com.oracle.bmc.database.model.PdbConversionHistoryEntry.LifecycleState...
                            targetStates) {
        com.oracle.bmc.util.internal.Validate.notEmpty(
                targetStates, "At least one targetState must be provided");
        com.oracle.bmc.util.internal.Validate.noNullElements(
                targetStates, "Null targetState values are not permitted");

        return forPdbConversionHistoryEntry(
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
                    GetPdbConversionHistoryEntryRequest, GetPdbConversionHistoryEntryResponse>
            forPdbConversionHistoryEntry(
                    GetPdbConversionHistoryEntryRequest request,
                    com.oracle.bmc.database.model.PdbConversionHistoryEntry.LifecycleState
                            targetState,
                    com.oracle.bmc.waiter.TerminationStrategy terminationStrategy,
                    com.oracle.bmc.waiter.DelayStrategy delayStrategy) {
        com.oracle.bmc.util.internal.Validate.notNull(
                targetState, "The targetState cannot be null");

        return forPdbConversionHistoryEntry(
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
                    GetPdbConversionHistoryEntryRequest, GetPdbConversionHistoryEntryResponse>
            forPdbConversionHistoryEntry(
                    GetPdbConversionHistoryEntryRequest request,
                    com.oracle.bmc.waiter.TerminationStrategy terminationStrategy,
                    com.oracle.bmc.waiter.DelayStrategy delayStrategy,
                    com.oracle.bmc.database.model.PdbConversionHistoryEntry.LifecycleState...
                            targetStates) {
        com.oracle.bmc.util.internal.Validate.notEmpty(
                targetStates, "At least one target state must be provided");
        com.oracle.bmc.util.internal.Validate.noNullElements(
                targetStates, "Null target states are not permitted");

        return forPdbConversionHistoryEntry(
                com.oracle.bmc.waiter.Waiters.newWaiter(terminationStrategy, delayStrategy),
                request,
                targetStates);
    }

    // Helper method to create a new Waiter for PdbConversionHistoryEntry.
    private com.oracle.bmc.waiter.Waiter<
                    GetPdbConversionHistoryEntryRequest, GetPdbConversionHistoryEntryResponse>
            forPdbConversionHistoryEntry(
                    com.oracle.bmc.waiter.BmcGenericWaiter waiter,
                    final GetPdbConversionHistoryEntryRequest request,
                    final com.oracle.bmc.database.model.PdbConversionHistoryEntry.LifecycleState...
                            targetStates) {
        final java.util.Set<com.oracle.bmc.database.model.PdbConversionHistoryEntry.LifecycleState>
                targetStatesSet = new java.util.HashSet<>(java.util.Arrays.asList(targetStates));

        return new com.oracle.bmc.waiter.internal.SimpleWaiterImpl<>(
                executorService,
                waiter.toCallable(
                        () -> request,
                        new java.util.function.Function<
                                GetPdbConversionHistoryEntryRequest,
                                GetPdbConversionHistoryEntryResponse>() {
                            @Override
                            public GetPdbConversionHistoryEntryResponse apply(
                                    GetPdbConversionHistoryEntryRequest request) {
                                return client.getPdbConversionHistoryEntry(request);
                            }
                        },
                        new java.util.function.Predicate<GetPdbConversionHistoryEntryResponse>() {
                            @Override
                            public boolean test(GetPdbConversionHistoryEntryResponse response) {
                                return targetStatesSet.contains(
                                        response.getPdbConversionHistoryEntry()
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
     * @param targetStates the desired states to wait for. If multiple states are provided then the waiter will return once the resource reaches any of the provided states
     * @return a new {@code Waiter} instance
     */
    public com.oracle.bmc.waiter.Waiter<GetPluggableDatabaseRequest, GetPluggableDatabaseResponse>
            forPluggableDatabase(
                    GetPluggableDatabaseRequest request,
                    com.oracle.bmc.database.model.PluggableDatabase.LifecycleState...
                            targetStates) {
        com.oracle.bmc.util.internal.Validate.notEmpty(
                targetStates, "At least one targetState must be provided");
        com.oracle.bmc.util.internal.Validate.noNullElements(
                targetStates, "Null targetState values are not permitted");

        return forPluggableDatabase(
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
    public com.oracle.bmc.waiter.Waiter<GetPluggableDatabaseRequest, GetPluggableDatabaseResponse>
            forPluggableDatabase(
                    GetPluggableDatabaseRequest request,
                    com.oracle.bmc.database.model.PluggableDatabase.LifecycleState targetState,
                    com.oracle.bmc.waiter.TerminationStrategy terminationStrategy,
                    com.oracle.bmc.waiter.DelayStrategy delayStrategy) {
        com.oracle.bmc.util.internal.Validate.notNull(
                targetState, "The targetState cannot be null");

        return forPluggableDatabase(
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
    public com.oracle.bmc.waiter.Waiter<GetPluggableDatabaseRequest, GetPluggableDatabaseResponse>
            forPluggableDatabase(
                    GetPluggableDatabaseRequest request,
                    com.oracle.bmc.waiter.TerminationStrategy terminationStrategy,
                    com.oracle.bmc.waiter.DelayStrategy delayStrategy,
                    com.oracle.bmc.database.model.PluggableDatabase.LifecycleState...
                            targetStates) {
        com.oracle.bmc.util.internal.Validate.notEmpty(
                targetStates, "At least one target state must be provided");
        com.oracle.bmc.util.internal.Validate.noNullElements(
                targetStates, "Null target states are not permitted");

        return forPluggableDatabase(
                com.oracle.bmc.waiter.Waiters.newWaiter(terminationStrategy, delayStrategy),
                request,
                targetStates);
    }

    // Helper method to create a new Waiter for PluggableDatabase.
    private com.oracle.bmc.waiter.Waiter<GetPluggableDatabaseRequest, GetPluggableDatabaseResponse>
            forPluggableDatabase(
                    com.oracle.bmc.waiter.BmcGenericWaiter waiter,
                    final GetPluggableDatabaseRequest request,
                    final com.oracle.bmc.database.model.PluggableDatabase.LifecycleState...
                            targetStates) {
        final java.util.Set<com.oracle.bmc.database.model.PluggableDatabase.LifecycleState>
                targetStatesSet = new java.util.HashSet<>(java.util.Arrays.asList(targetStates));

        return new com.oracle.bmc.waiter.internal.SimpleWaiterImpl<>(
                executorService,
                waiter.toCallable(
                        () -> request,
                        new java.util.function.Function<
                                GetPluggableDatabaseRequest, GetPluggableDatabaseResponse>() {
                            @Override
                            public GetPluggableDatabaseResponse apply(
                                    GetPluggableDatabaseRequest request) {
                                return client.getPluggableDatabase(request);
                            }
                        },
                        new java.util.function.Predicate<GetPluggableDatabaseResponse>() {
                            @Override
                            public boolean test(GetPluggableDatabaseResponse response) {
                                return targetStatesSet.contains(
                                        response.getPluggableDatabase().getLifecycleState());
                            }
                        },
                        targetStatesSet.contains(
                                com.oracle.bmc.database.model.PluggableDatabase.LifecycleState
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
    public com.oracle.bmc.waiter.Waiter<GetVmClusterRequest, GetVmClusterResponse> forVmCluster(
            GetVmClusterRequest request,
            com.oracle.bmc.database.model.VmCluster.LifecycleState... targetStates) {
        com.oracle.bmc.util.internal.Validate.notEmpty(
                targetStates, "At least one targetState must be provided");
        com.oracle.bmc.util.internal.Validate.noNullElements(
                targetStates, "Null targetState values are not permitted");

        return forVmCluster(
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
    public com.oracle.bmc.waiter.Waiter<GetVmClusterRequest, GetVmClusterResponse> forVmCluster(
            GetVmClusterRequest request,
            com.oracle.bmc.database.model.VmCluster.LifecycleState targetState,
            com.oracle.bmc.waiter.TerminationStrategy terminationStrategy,
            com.oracle.bmc.waiter.DelayStrategy delayStrategy) {
        com.oracle.bmc.util.internal.Validate.notNull(
                targetState, "The targetState cannot be null");

        return forVmCluster(
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
    public com.oracle.bmc.waiter.Waiter<GetVmClusterRequest, GetVmClusterResponse> forVmCluster(
            GetVmClusterRequest request,
            com.oracle.bmc.waiter.TerminationStrategy terminationStrategy,
            com.oracle.bmc.waiter.DelayStrategy delayStrategy,
            com.oracle.bmc.database.model.VmCluster.LifecycleState... targetStates) {
        com.oracle.bmc.util.internal.Validate.notEmpty(
                targetStates, "At least one target state must be provided");
        com.oracle.bmc.util.internal.Validate.noNullElements(
                targetStates, "Null target states are not permitted");

        return forVmCluster(
                com.oracle.bmc.waiter.Waiters.newWaiter(terminationStrategy, delayStrategy),
                request,
                targetStates);
    }

    // Helper method to create a new Waiter for VmCluster.
    private com.oracle.bmc.waiter.Waiter<GetVmClusterRequest, GetVmClusterResponse> forVmCluster(
            com.oracle.bmc.waiter.BmcGenericWaiter waiter,
            final GetVmClusterRequest request,
            final com.oracle.bmc.database.model.VmCluster.LifecycleState... targetStates) {
        final java.util.Set<com.oracle.bmc.database.model.VmCluster.LifecycleState>
                targetStatesSet = new java.util.HashSet<>(java.util.Arrays.asList(targetStates));

        return new com.oracle.bmc.waiter.internal.SimpleWaiterImpl<>(
                executorService,
                waiter.toCallable(
                        () -> request,
                        new java.util.function.Function<
                                GetVmClusterRequest, GetVmClusterResponse>() {
                            @Override
                            public GetVmClusterResponse apply(GetVmClusterRequest request) {
                                return client.getVmCluster(request);
                            }
                        },
                        new java.util.function.Predicate<GetVmClusterResponse>() {
                            @Override
                            public boolean test(GetVmClusterResponse response) {
                                return targetStatesSet.contains(
                                        response.getVmCluster().getLifecycleState());
                            }
                        },
                        targetStatesSet.contains(
                                com.oracle.bmc.database.model.VmCluster.LifecycleState.Terminated)),
                request);
    }

    /**
     * Creates a new {@link com.oracle.bmc.waiter.Waiter} using the default configuration.
     *
     * @param request the request to send
     * @param targetStates the desired states to wait for. If multiple states are provided then the waiter will return once the resource reaches any of the provided states
     * @return a new {@code Waiter} instance
     */
    public com.oracle.bmc.waiter.Waiter<GetVmClusterNetworkRequest, GetVmClusterNetworkResponse>
            forVmClusterNetwork(
                    GetVmClusterNetworkRequest request,
                    com.oracle.bmc.database.model.VmClusterNetwork.LifecycleState... targetStates) {
        com.oracle.bmc.util.internal.Validate.notEmpty(
                targetStates, "At least one targetState must be provided");
        com.oracle.bmc.util.internal.Validate.noNullElements(
                targetStates, "Null targetState values are not permitted");

        return forVmClusterNetwork(
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
    public com.oracle.bmc.waiter.Waiter<GetVmClusterNetworkRequest, GetVmClusterNetworkResponse>
            forVmClusterNetwork(
                    GetVmClusterNetworkRequest request,
                    com.oracle.bmc.database.model.VmClusterNetwork.LifecycleState targetState,
                    com.oracle.bmc.waiter.TerminationStrategy terminationStrategy,
                    com.oracle.bmc.waiter.DelayStrategy delayStrategy) {
        com.oracle.bmc.util.internal.Validate.notNull(
                targetState, "The targetState cannot be null");

        return forVmClusterNetwork(
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
    public com.oracle.bmc.waiter.Waiter<GetVmClusterNetworkRequest, GetVmClusterNetworkResponse>
            forVmClusterNetwork(
                    GetVmClusterNetworkRequest request,
                    com.oracle.bmc.waiter.TerminationStrategy terminationStrategy,
                    com.oracle.bmc.waiter.DelayStrategy delayStrategy,
                    com.oracle.bmc.database.model.VmClusterNetwork.LifecycleState... targetStates) {
        com.oracle.bmc.util.internal.Validate.notEmpty(
                targetStates, "At least one target state must be provided");
        com.oracle.bmc.util.internal.Validate.noNullElements(
                targetStates, "Null target states are not permitted");

        return forVmClusterNetwork(
                com.oracle.bmc.waiter.Waiters.newWaiter(terminationStrategy, delayStrategy),
                request,
                targetStates);
    }

    // Helper method to create a new Waiter for VmClusterNetwork.
    private com.oracle.bmc.waiter.Waiter<GetVmClusterNetworkRequest, GetVmClusterNetworkResponse>
            forVmClusterNetwork(
                    com.oracle.bmc.waiter.BmcGenericWaiter waiter,
                    final GetVmClusterNetworkRequest request,
                    final com.oracle.bmc.database.model.VmClusterNetwork.LifecycleState...
                            targetStates) {
        final java.util.Set<com.oracle.bmc.database.model.VmClusterNetwork.LifecycleState>
                targetStatesSet = new java.util.HashSet<>(java.util.Arrays.asList(targetStates));

        return new com.oracle.bmc.waiter.internal.SimpleWaiterImpl<>(
                executorService,
                waiter.toCallable(
                        () -> request,
                        new java.util.function.Function<
                                GetVmClusterNetworkRequest, GetVmClusterNetworkResponse>() {
                            @Override
                            public GetVmClusterNetworkResponse apply(
                                    GetVmClusterNetworkRequest request) {
                                return client.getVmClusterNetwork(request);
                            }
                        },
                        new java.util.function.Predicate<GetVmClusterNetworkResponse>() {
                            @Override
                            public boolean test(GetVmClusterNetworkResponse response) {
                                return targetStatesSet.contains(
                                        response.getVmClusterNetwork().getLifecycleState());
                            }
                        },
                        targetStatesSet.contains(
                                com.oracle.bmc.database.model.VmClusterNetwork.LifecycleState
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
    public com.oracle.bmc.waiter.Waiter<GetVmClusterUpdateRequest, GetVmClusterUpdateResponse>
            forVmClusterUpdate(
                    GetVmClusterUpdateRequest request,
                    com.oracle.bmc.database.model.VmClusterUpdate.LifecycleState... targetStates) {
        com.oracle.bmc.util.internal.Validate.notEmpty(
                targetStates, "At least one targetState must be provided");
        com.oracle.bmc.util.internal.Validate.noNullElements(
                targetStates, "Null targetState values are not permitted");

        return forVmClusterUpdate(
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
    public com.oracle.bmc.waiter.Waiter<GetVmClusterUpdateRequest, GetVmClusterUpdateResponse>
            forVmClusterUpdate(
                    GetVmClusterUpdateRequest request,
                    com.oracle.bmc.database.model.VmClusterUpdate.LifecycleState targetState,
                    com.oracle.bmc.waiter.TerminationStrategy terminationStrategy,
                    com.oracle.bmc.waiter.DelayStrategy delayStrategy) {
        com.oracle.bmc.util.internal.Validate.notNull(
                targetState, "The targetState cannot be null");

        return forVmClusterUpdate(
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
    public com.oracle.bmc.waiter.Waiter<GetVmClusterUpdateRequest, GetVmClusterUpdateResponse>
            forVmClusterUpdate(
                    GetVmClusterUpdateRequest request,
                    com.oracle.bmc.waiter.TerminationStrategy terminationStrategy,
                    com.oracle.bmc.waiter.DelayStrategy delayStrategy,
                    com.oracle.bmc.database.model.VmClusterUpdate.LifecycleState... targetStates) {
        com.oracle.bmc.util.internal.Validate.notEmpty(
                targetStates, "At least one target state must be provided");
        com.oracle.bmc.util.internal.Validate.noNullElements(
                targetStates, "Null target states are not permitted");

        return forVmClusterUpdate(
                com.oracle.bmc.waiter.Waiters.newWaiter(terminationStrategy, delayStrategy),
                request,
                targetStates);
    }

    // Helper method to create a new Waiter for VmClusterUpdate.
    private com.oracle.bmc.waiter.Waiter<GetVmClusterUpdateRequest, GetVmClusterUpdateResponse>
            forVmClusterUpdate(
                    com.oracle.bmc.waiter.BmcGenericWaiter waiter,
                    final GetVmClusterUpdateRequest request,
                    final com.oracle.bmc.database.model.VmClusterUpdate.LifecycleState...
                            targetStates) {
        final java.util.Set<com.oracle.bmc.database.model.VmClusterUpdate.LifecycleState>
                targetStatesSet = new java.util.HashSet<>(java.util.Arrays.asList(targetStates));

        return new com.oracle.bmc.waiter.internal.SimpleWaiterImpl<>(
                executorService,
                waiter.toCallable(
                        () -> request,
                        new java.util.function.Function<
                                GetVmClusterUpdateRequest, GetVmClusterUpdateResponse>() {
                            @Override
                            public GetVmClusterUpdateResponse apply(
                                    GetVmClusterUpdateRequest request) {
                                return client.getVmClusterUpdate(request);
                            }
                        },
                        new java.util.function.Predicate<GetVmClusterUpdateResponse>() {
                            @Override
                            public boolean test(GetVmClusterUpdateResponse response) {
                                return targetStatesSet.contains(
                                        response.getVmClusterUpdate().getLifecycleState());
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
    public com.oracle.bmc.waiter.Waiter<
                    GetVmClusterUpdateHistoryEntryRequest, GetVmClusterUpdateHistoryEntryResponse>
            forVmClusterUpdateHistoryEntry(
                    GetVmClusterUpdateHistoryEntryRequest request,
                    com.oracle.bmc.database.model.VmClusterUpdateHistoryEntry.LifecycleState...
                            targetStates) {
        com.oracle.bmc.util.internal.Validate.notEmpty(
                targetStates, "At least one targetState must be provided");
        com.oracle.bmc.util.internal.Validate.noNullElements(
                targetStates, "Null targetState values are not permitted");

        return forVmClusterUpdateHistoryEntry(
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
                    GetVmClusterUpdateHistoryEntryRequest, GetVmClusterUpdateHistoryEntryResponse>
            forVmClusterUpdateHistoryEntry(
                    GetVmClusterUpdateHistoryEntryRequest request,
                    com.oracle.bmc.database.model.VmClusterUpdateHistoryEntry.LifecycleState
                            targetState,
                    com.oracle.bmc.waiter.TerminationStrategy terminationStrategy,
                    com.oracle.bmc.waiter.DelayStrategy delayStrategy) {
        com.oracle.bmc.util.internal.Validate.notNull(
                targetState, "The targetState cannot be null");

        return forVmClusterUpdateHistoryEntry(
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
                    GetVmClusterUpdateHistoryEntryRequest, GetVmClusterUpdateHistoryEntryResponse>
            forVmClusterUpdateHistoryEntry(
                    GetVmClusterUpdateHistoryEntryRequest request,
                    com.oracle.bmc.waiter.TerminationStrategy terminationStrategy,
                    com.oracle.bmc.waiter.DelayStrategy delayStrategy,
                    com.oracle.bmc.database.model.VmClusterUpdateHistoryEntry.LifecycleState...
                            targetStates) {
        com.oracle.bmc.util.internal.Validate.notEmpty(
                targetStates, "At least one target state must be provided");
        com.oracle.bmc.util.internal.Validate.noNullElements(
                targetStates, "Null target states are not permitted");

        return forVmClusterUpdateHistoryEntry(
                com.oracle.bmc.waiter.Waiters.newWaiter(terminationStrategy, delayStrategy),
                request,
                targetStates);
    }

    // Helper method to create a new Waiter for VmClusterUpdateHistoryEntry.
    private com.oracle.bmc.waiter.Waiter<
                    GetVmClusterUpdateHistoryEntryRequest, GetVmClusterUpdateHistoryEntryResponse>
            forVmClusterUpdateHistoryEntry(
                    com.oracle.bmc.waiter.BmcGenericWaiter waiter,
                    final GetVmClusterUpdateHistoryEntryRequest request,
                    final com.oracle.bmc.database.model.VmClusterUpdateHistoryEntry
                                    .LifecycleState...
                            targetStates) {
        final java.util.Set<
                        com.oracle.bmc.database.model.VmClusterUpdateHistoryEntry.LifecycleState>
                targetStatesSet = new java.util.HashSet<>(java.util.Arrays.asList(targetStates));

        return new com.oracle.bmc.waiter.internal.SimpleWaiterImpl<>(
                executorService,
                waiter.toCallable(
                        () -> request,
                        new java.util.function.Function<
                                GetVmClusterUpdateHistoryEntryRequest,
                                GetVmClusterUpdateHistoryEntryResponse>() {
                            @Override
                            public GetVmClusterUpdateHistoryEntryResponse apply(
                                    GetVmClusterUpdateHistoryEntryRequest request) {
                                return client.getVmClusterUpdateHistoryEntry(request);
                            }
                        },
                        new java.util.function.Predicate<GetVmClusterUpdateHistoryEntryResponse>() {
                            @Override
                            public boolean test(GetVmClusterUpdateHistoryEntryResponse response) {
                                return targetStatesSet.contains(
                                        response.getVmClusterUpdateHistoryEntry()
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
    public com.oracle.bmc.waiter.Waiter<LaunchDbSystemRequest, LaunchDbSystemResponse>
            forLaunchDbSystem(LaunchDbSystemRequest request) {
        return forLaunchDbSystem(
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
    public com.oracle.bmc.waiter.Waiter<LaunchDbSystemRequest, LaunchDbSystemResponse>
            forLaunchDbSystem(
                    LaunchDbSystemRequest request,
                    com.oracle.bmc.waiter.TerminationStrategy terminationStrategy,
                    com.oracle.bmc.waiter.DelayStrategy delayStrategy) {
        if (workRequestClient == null) {
            throw new IllegalStateException(
                    "A WorkRequestClient must be supplied to this waiter for this operation");
        }

        return new com.oracle.bmc.waiter.internal.SimpleWaiterImpl<>(
                executorService,
                new java.util.concurrent.Callable<LaunchDbSystemResponse>() {
                    @Override
                    public LaunchDbSystemResponse call() throws Exception {
                        final LaunchDbSystemResponse response = client.launchDbSystem(request);

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
                    LocalClonePluggableDatabaseRequest, LocalClonePluggableDatabaseResponse>
            forLocalClonePluggableDatabase(LocalClonePluggableDatabaseRequest request) {
        return forLocalClonePluggableDatabase(
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
                    LocalClonePluggableDatabaseRequest, LocalClonePluggableDatabaseResponse>
            forLocalClonePluggableDatabase(
                    LocalClonePluggableDatabaseRequest request,
                    com.oracle.bmc.waiter.TerminationStrategy terminationStrategy,
                    com.oracle.bmc.waiter.DelayStrategy delayStrategy) {
        if (workRequestClient == null) {
            throw new IllegalStateException(
                    "A WorkRequestClient must be supplied to this waiter for this operation");
        }

        return new com.oracle.bmc.waiter.internal.SimpleWaiterImpl<>(
                executorService,
                new java.util.concurrent.Callable<LocalClonePluggableDatabaseResponse>() {
                    @Override
                    public LocalClonePluggableDatabaseResponse call() throws Exception {
                        final LocalClonePluggableDatabaseResponse response =
                                client.localClonePluggableDatabase(request);

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
                    MigrateExadataDbSystemResourceModelRequest,
                    MigrateExadataDbSystemResourceModelResponse>
            forMigrateExadataDbSystemResourceModel(
                    MigrateExadataDbSystemResourceModelRequest request) {
        return forMigrateExadataDbSystemResourceModel(
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
                    MigrateExadataDbSystemResourceModelRequest,
                    MigrateExadataDbSystemResourceModelResponse>
            forMigrateExadataDbSystemResourceModel(
                    MigrateExadataDbSystemResourceModelRequest request,
                    com.oracle.bmc.waiter.TerminationStrategy terminationStrategy,
                    com.oracle.bmc.waiter.DelayStrategy delayStrategy) {
        if (workRequestClient == null) {
            throw new IllegalStateException(
                    "A WorkRequestClient must be supplied to this waiter for this operation");
        }

        return new com.oracle.bmc.waiter.internal.SimpleWaiterImpl<>(
                executorService,
                new java.util.concurrent.Callable<MigrateExadataDbSystemResourceModelResponse>() {
                    @Override
                    public MigrateExadataDbSystemResourceModelResponse call() throws Exception {
                        final MigrateExadataDbSystemResourceModelResponse response =
                                client.migrateExadataDbSystemResourceModel(request);

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
    public com.oracle.bmc.waiter.Waiter<MigrateVaultKeyRequest, MigrateVaultKeyResponse>
            forMigrateVaultKey(MigrateVaultKeyRequest request) {
        return forMigrateVaultKey(
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
    public com.oracle.bmc.waiter.Waiter<MigrateVaultKeyRequest, MigrateVaultKeyResponse>
            forMigrateVaultKey(
                    MigrateVaultKeyRequest request,
                    com.oracle.bmc.waiter.TerminationStrategy terminationStrategy,
                    com.oracle.bmc.waiter.DelayStrategy delayStrategy) {
        if (workRequestClient == null) {
            throw new IllegalStateException(
                    "A WorkRequestClient must be supplied to this waiter for this operation");
        }

        return new com.oracle.bmc.waiter.internal.SimpleWaiterImpl<>(
                executorService,
                new java.util.concurrent.Callable<MigrateVaultKeyResponse>() {
                    @Override
                    public MigrateVaultKeyResponse call() throws Exception {
                        final MigrateVaultKeyResponse response = client.migrateVaultKey(request);

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
                    ModifyDatabaseManagementRequest, ModifyDatabaseManagementResponse>
            forModifyDatabaseManagement(ModifyDatabaseManagementRequest request) {
        return forModifyDatabaseManagement(
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
                    ModifyDatabaseManagementRequest, ModifyDatabaseManagementResponse>
            forModifyDatabaseManagement(
                    ModifyDatabaseManagementRequest request,
                    com.oracle.bmc.waiter.TerminationStrategy terminationStrategy,
                    com.oracle.bmc.waiter.DelayStrategy delayStrategy) {
        if (workRequestClient == null) {
            throw new IllegalStateException(
                    "A WorkRequestClient must be supplied to this waiter for this operation");
        }

        return new com.oracle.bmc.waiter.internal.SimpleWaiterImpl<>(
                executorService,
                new java.util.concurrent.Callable<ModifyDatabaseManagementResponse>() {
                    @Override
                    public ModifyDatabaseManagementResponse call() throws Exception {
                        final ModifyDatabaseManagementResponse response =
                                client.modifyDatabaseManagement(request);

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
                    ModifyPluggableDatabaseManagementRequest,
                    ModifyPluggableDatabaseManagementResponse>
            forModifyPluggableDatabaseManagement(ModifyPluggableDatabaseManagementRequest request) {
        return forModifyPluggableDatabaseManagement(
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
                    ModifyPluggableDatabaseManagementRequest,
                    ModifyPluggableDatabaseManagementResponse>
            forModifyPluggableDatabaseManagement(
                    ModifyPluggableDatabaseManagementRequest request,
                    com.oracle.bmc.waiter.TerminationStrategy terminationStrategy,
                    com.oracle.bmc.waiter.DelayStrategy delayStrategy) {
        if (workRequestClient == null) {
            throw new IllegalStateException(
                    "A WorkRequestClient must be supplied to this waiter for this operation");
        }

        return new com.oracle.bmc.waiter.internal.SimpleWaiterImpl<>(
                executorService,
                new java.util.concurrent.Callable<ModifyPluggableDatabaseManagementResponse>() {
                    @Override
                    public ModifyPluggableDatabaseManagementResponse call() throws Exception {
                        final ModifyPluggableDatabaseManagementResponse response =
                                client.modifyPluggableDatabaseManagement(request);

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
                    RegisterAutonomousDatabaseDataSafeRequest,
                    RegisterAutonomousDatabaseDataSafeResponse>
            forRegisterAutonomousDatabaseDataSafe(
                    RegisterAutonomousDatabaseDataSafeRequest request) {
        return forRegisterAutonomousDatabaseDataSafe(
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
                    RegisterAutonomousDatabaseDataSafeRequest,
                    RegisterAutonomousDatabaseDataSafeResponse>
            forRegisterAutonomousDatabaseDataSafe(
                    RegisterAutonomousDatabaseDataSafeRequest request,
                    com.oracle.bmc.waiter.TerminationStrategy terminationStrategy,
                    com.oracle.bmc.waiter.DelayStrategy delayStrategy) {
        if (workRequestClient == null) {
            throw new IllegalStateException(
                    "A WorkRequestClient must be supplied to this waiter for this operation");
        }

        return new com.oracle.bmc.waiter.internal.SimpleWaiterImpl<>(
                executorService,
                new java.util.concurrent.Callable<RegisterAutonomousDatabaseDataSafeResponse>() {
                    @Override
                    public RegisterAutonomousDatabaseDataSafeResponse call() throws Exception {
                        final RegisterAutonomousDatabaseDataSafeResponse response =
                                client.registerAutonomousDatabaseDataSafe(request);

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
                    ReinstateAutonomousContainerDatabaseDataguardAssociationRequest,
                    ReinstateAutonomousContainerDatabaseDataguardAssociationResponse>
            forReinstateAutonomousContainerDatabaseDataguardAssociation(
                    ReinstateAutonomousContainerDatabaseDataguardAssociationRequest request) {
        return forReinstateAutonomousContainerDatabaseDataguardAssociation(
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
                    ReinstateAutonomousContainerDatabaseDataguardAssociationRequest,
                    ReinstateAutonomousContainerDatabaseDataguardAssociationResponse>
            forReinstateAutonomousContainerDatabaseDataguardAssociation(
                    ReinstateAutonomousContainerDatabaseDataguardAssociationRequest request,
                    com.oracle.bmc.waiter.TerminationStrategy terminationStrategy,
                    com.oracle.bmc.waiter.DelayStrategy delayStrategy) {
        if (workRequestClient == null) {
            throw new IllegalStateException(
                    "A WorkRequestClient must be supplied to this waiter for this operation");
        }

        return new com.oracle.bmc.waiter.internal.SimpleWaiterImpl<>(
                executorService,
                new java.util.concurrent.Callable<
                        ReinstateAutonomousContainerDatabaseDataguardAssociationResponse>() {
                    @Override
                    public ReinstateAutonomousContainerDatabaseDataguardAssociationResponse call()
                            throws Exception {
                        final ReinstateAutonomousContainerDatabaseDataguardAssociationResponse
                                response =
                                        client
                                                .reinstateAutonomousContainerDatabaseDataguardAssociation(
                                                        request);

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
                    ReinstateDataGuardAssociationRequest, ReinstateDataGuardAssociationResponse>
            forReinstateDataGuardAssociation(ReinstateDataGuardAssociationRequest request) {
        return forReinstateDataGuardAssociation(
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
                    ReinstateDataGuardAssociationRequest, ReinstateDataGuardAssociationResponse>
            forReinstateDataGuardAssociation(
                    ReinstateDataGuardAssociationRequest request,
                    com.oracle.bmc.waiter.TerminationStrategy terminationStrategy,
                    com.oracle.bmc.waiter.DelayStrategy delayStrategy) {
        if (workRequestClient == null) {
            throw new IllegalStateException(
                    "A WorkRequestClient must be supplied to this waiter for this operation");
        }

        return new com.oracle.bmc.waiter.internal.SimpleWaiterImpl<>(
                executorService,
                new java.util.concurrent.Callable<ReinstateDataGuardAssociationResponse>() {
                    @Override
                    public ReinstateDataGuardAssociationResponse call() throws Exception {
                        final ReinstateDataGuardAssociationResponse response =
                                client.reinstateDataGuardAssociation(request);

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
                    RemoteClonePluggableDatabaseRequest, RemoteClonePluggableDatabaseResponse>
            forRemoteClonePluggableDatabase(RemoteClonePluggableDatabaseRequest request) {
        return forRemoteClonePluggableDatabase(
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
                    RemoteClonePluggableDatabaseRequest, RemoteClonePluggableDatabaseResponse>
            forRemoteClonePluggableDatabase(
                    RemoteClonePluggableDatabaseRequest request,
                    com.oracle.bmc.waiter.TerminationStrategy terminationStrategy,
                    com.oracle.bmc.waiter.DelayStrategy delayStrategy) {
        if (workRequestClient == null) {
            throw new IllegalStateException(
                    "A WorkRequestClient must be supplied to this waiter for this operation");
        }

        return new com.oracle.bmc.waiter.internal.SimpleWaiterImpl<>(
                executorService,
                new java.util.concurrent.Callable<RemoteClonePluggableDatabaseResponse>() {
                    @Override
                    public RemoteClonePluggableDatabaseResponse call() throws Exception {
                        final RemoteClonePluggableDatabaseResponse response =
                                client.remoteClonePluggableDatabase(request);

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
                    RemoveVirtualMachineFromCloudVmClusterRequest,
                    RemoveVirtualMachineFromCloudVmClusterResponse>
            forRemoveVirtualMachineFromCloudVmCluster(
                    RemoveVirtualMachineFromCloudVmClusterRequest request) {
        return forRemoveVirtualMachineFromCloudVmCluster(
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
                    RemoveVirtualMachineFromCloudVmClusterRequest,
                    RemoveVirtualMachineFromCloudVmClusterResponse>
            forRemoveVirtualMachineFromCloudVmCluster(
                    RemoveVirtualMachineFromCloudVmClusterRequest request,
                    com.oracle.bmc.waiter.TerminationStrategy terminationStrategy,
                    com.oracle.bmc.waiter.DelayStrategy delayStrategy) {
        if (workRequestClient == null) {
            throw new IllegalStateException(
                    "A WorkRequestClient must be supplied to this waiter for this operation");
        }

        return new com.oracle.bmc.waiter.internal.SimpleWaiterImpl<>(
                executorService,
                new java.util.concurrent.Callable<
                        RemoveVirtualMachineFromCloudVmClusterResponse>() {
                    @Override
                    public RemoveVirtualMachineFromCloudVmClusterResponse call() throws Exception {
                        final RemoveVirtualMachineFromCloudVmClusterResponse response =
                                client.removeVirtualMachineFromCloudVmCluster(request);

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
                    RemoveVirtualMachineFromVmClusterRequest,
                    RemoveVirtualMachineFromVmClusterResponse>
            forRemoveVirtualMachineFromVmCluster(RemoveVirtualMachineFromVmClusterRequest request) {
        return forRemoveVirtualMachineFromVmCluster(
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
                    RemoveVirtualMachineFromVmClusterRequest,
                    RemoveVirtualMachineFromVmClusterResponse>
            forRemoveVirtualMachineFromVmCluster(
                    RemoveVirtualMachineFromVmClusterRequest request,
                    com.oracle.bmc.waiter.TerminationStrategy terminationStrategy,
                    com.oracle.bmc.waiter.DelayStrategy delayStrategy) {
        if (workRequestClient == null) {
            throw new IllegalStateException(
                    "A WorkRequestClient must be supplied to this waiter for this operation");
        }

        return new com.oracle.bmc.waiter.internal.SimpleWaiterImpl<>(
                executorService,
                new java.util.concurrent.Callable<RemoveVirtualMachineFromVmClusterResponse>() {
                    @Override
                    public RemoveVirtualMachineFromVmClusterResponse call() throws Exception {
                        final RemoveVirtualMachineFromVmClusterResponse response =
                                client.removeVirtualMachineFromVmCluster(request);

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
                    ResizeVmClusterNetworkRequest, ResizeVmClusterNetworkResponse>
            forResizeVmClusterNetwork(ResizeVmClusterNetworkRequest request) {
        return forResizeVmClusterNetwork(
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
                    ResizeVmClusterNetworkRequest, ResizeVmClusterNetworkResponse>
            forResizeVmClusterNetwork(
                    ResizeVmClusterNetworkRequest request,
                    com.oracle.bmc.waiter.TerminationStrategy terminationStrategy,
                    com.oracle.bmc.waiter.DelayStrategy delayStrategy) {
        if (workRequestClient == null) {
            throw new IllegalStateException(
                    "A WorkRequestClient must be supplied to this waiter for this operation");
        }

        return new com.oracle.bmc.waiter.internal.SimpleWaiterImpl<>(
                executorService,
                new java.util.concurrent.Callable<ResizeVmClusterNetworkResponse>() {
                    @Override
                    public ResizeVmClusterNetworkResponse call() throws Exception {
                        final ResizeVmClusterNetworkResponse response =
                                client.resizeVmClusterNetwork(request);

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
                    RestartAutonomousDatabaseRequest, RestartAutonomousDatabaseResponse>
            forRestartAutonomousDatabase(RestartAutonomousDatabaseRequest request) {
        return forRestartAutonomousDatabase(
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
                    RestartAutonomousDatabaseRequest, RestartAutonomousDatabaseResponse>
            forRestartAutonomousDatabase(
                    RestartAutonomousDatabaseRequest request,
                    com.oracle.bmc.waiter.TerminationStrategy terminationStrategy,
                    com.oracle.bmc.waiter.DelayStrategy delayStrategy) {
        if (workRequestClient == null) {
            throw new IllegalStateException(
                    "A WorkRequestClient must be supplied to this waiter for this operation");
        }

        return new com.oracle.bmc.waiter.internal.SimpleWaiterImpl<>(
                executorService,
                new java.util.concurrent.Callable<RestartAutonomousDatabaseResponse>() {
                    @Override
                    public RestartAutonomousDatabaseResponse call() throws Exception {
                        final RestartAutonomousDatabaseResponse response =
                                client.restartAutonomousDatabase(request);

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
    public com.oracle.bmc.waiter.Waiter<RestoreDatabaseRequest, RestoreDatabaseResponse>
            forRestoreDatabase(RestoreDatabaseRequest request) {
        return forRestoreDatabase(
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
    public com.oracle.bmc.waiter.Waiter<RestoreDatabaseRequest, RestoreDatabaseResponse>
            forRestoreDatabase(
                    RestoreDatabaseRequest request,
                    com.oracle.bmc.waiter.TerminationStrategy terminationStrategy,
                    com.oracle.bmc.waiter.DelayStrategy delayStrategy) {
        if (workRequestClient == null) {
            throw new IllegalStateException(
                    "A WorkRequestClient must be supplied to this waiter for this operation");
        }

        return new com.oracle.bmc.waiter.internal.SimpleWaiterImpl<>(
                executorService,
                new java.util.concurrent.Callable<RestoreDatabaseResponse>() {
                    @Override
                    public RestoreDatabaseResponse call() throws Exception {
                        final RestoreDatabaseResponse response = client.restoreDatabase(request);

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
                    RotateAutonomousContainerDatabaseEncryptionKeyRequest,
                    RotateAutonomousContainerDatabaseEncryptionKeyResponse>
            forRotateAutonomousContainerDatabaseEncryptionKey(
                    RotateAutonomousContainerDatabaseEncryptionKeyRequest request) {
        return forRotateAutonomousContainerDatabaseEncryptionKey(
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
                    RotateAutonomousContainerDatabaseEncryptionKeyRequest,
                    RotateAutonomousContainerDatabaseEncryptionKeyResponse>
            forRotateAutonomousContainerDatabaseEncryptionKey(
                    RotateAutonomousContainerDatabaseEncryptionKeyRequest request,
                    com.oracle.bmc.waiter.TerminationStrategy terminationStrategy,
                    com.oracle.bmc.waiter.DelayStrategy delayStrategy) {
        if (workRequestClient == null) {
            throw new IllegalStateException(
                    "A WorkRequestClient must be supplied to this waiter for this operation");
        }

        return new com.oracle.bmc.waiter.internal.SimpleWaiterImpl<>(
                executorService,
                new java.util.concurrent.Callable<
                        RotateAutonomousContainerDatabaseEncryptionKeyResponse>() {
                    @Override
                    public RotateAutonomousContainerDatabaseEncryptionKeyResponse call()
                            throws Exception {
                        final RotateAutonomousContainerDatabaseEncryptionKeyResponse response =
                                client.rotateAutonomousContainerDatabaseEncryptionKey(request);

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
                    RotateAutonomousDatabaseEncryptionKeyRequest,
                    RotateAutonomousDatabaseEncryptionKeyResponse>
            forRotateAutonomousDatabaseEncryptionKey(
                    RotateAutonomousDatabaseEncryptionKeyRequest request) {
        return forRotateAutonomousDatabaseEncryptionKey(
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
                    RotateAutonomousDatabaseEncryptionKeyRequest,
                    RotateAutonomousDatabaseEncryptionKeyResponse>
            forRotateAutonomousDatabaseEncryptionKey(
                    RotateAutonomousDatabaseEncryptionKeyRequest request,
                    com.oracle.bmc.waiter.TerminationStrategy terminationStrategy,
                    com.oracle.bmc.waiter.DelayStrategy delayStrategy) {
        if (workRequestClient == null) {
            throw new IllegalStateException(
                    "A WorkRequestClient must be supplied to this waiter for this operation");
        }

        return new com.oracle.bmc.waiter.internal.SimpleWaiterImpl<>(
                executorService,
                new java.util.concurrent.Callable<RotateAutonomousDatabaseEncryptionKeyResponse>() {
                    @Override
                    public RotateAutonomousDatabaseEncryptionKeyResponse call() throws Exception {
                        final RotateAutonomousDatabaseEncryptionKeyResponse response =
                                client.rotateAutonomousDatabaseEncryptionKey(request);

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
                    RotateCloudAutonomousVmClusterOrdsCertsRequest,
                    RotateCloudAutonomousVmClusterOrdsCertsResponse>
            forRotateCloudAutonomousVmClusterOrdsCerts(
                    RotateCloudAutonomousVmClusterOrdsCertsRequest request) {
        return forRotateCloudAutonomousVmClusterOrdsCerts(
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
                    RotateCloudAutonomousVmClusterOrdsCertsRequest,
                    RotateCloudAutonomousVmClusterOrdsCertsResponse>
            forRotateCloudAutonomousVmClusterOrdsCerts(
                    RotateCloudAutonomousVmClusterOrdsCertsRequest request,
                    com.oracle.bmc.waiter.TerminationStrategy terminationStrategy,
                    com.oracle.bmc.waiter.DelayStrategy delayStrategy) {
        if (workRequestClient == null) {
            throw new IllegalStateException(
                    "A WorkRequestClient must be supplied to this waiter for this operation");
        }

        return new com.oracle.bmc.waiter.internal.SimpleWaiterImpl<>(
                executorService,
                new java.util.concurrent.Callable<
                        RotateCloudAutonomousVmClusterOrdsCertsResponse>() {
                    @Override
                    public RotateCloudAutonomousVmClusterOrdsCertsResponse call() throws Exception {
                        final RotateCloudAutonomousVmClusterOrdsCertsResponse response =
                                client.rotateCloudAutonomousVmClusterOrdsCerts(request);

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
                    RotateCloudAutonomousVmClusterSslCertsRequest,
                    RotateCloudAutonomousVmClusterSslCertsResponse>
            forRotateCloudAutonomousVmClusterSslCerts(
                    RotateCloudAutonomousVmClusterSslCertsRequest request) {
        return forRotateCloudAutonomousVmClusterSslCerts(
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
                    RotateCloudAutonomousVmClusterSslCertsRequest,
                    RotateCloudAutonomousVmClusterSslCertsResponse>
            forRotateCloudAutonomousVmClusterSslCerts(
                    RotateCloudAutonomousVmClusterSslCertsRequest request,
                    com.oracle.bmc.waiter.TerminationStrategy terminationStrategy,
                    com.oracle.bmc.waiter.DelayStrategy delayStrategy) {
        if (workRequestClient == null) {
            throw new IllegalStateException(
                    "A WorkRequestClient must be supplied to this waiter for this operation");
        }

        return new com.oracle.bmc.waiter.internal.SimpleWaiterImpl<>(
                executorService,
                new java.util.concurrent.Callable<
                        RotateCloudAutonomousVmClusterSslCertsResponse>() {
                    @Override
                    public RotateCloudAutonomousVmClusterSslCertsResponse call() throws Exception {
                        final RotateCloudAutonomousVmClusterSslCertsResponse response =
                                client.rotateCloudAutonomousVmClusterSslCerts(request);

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
    public com.oracle.bmc.waiter.Waiter<RotateOrdsCertsRequest, RotateOrdsCertsResponse>
            forRotateOrdsCerts(RotateOrdsCertsRequest request) {
        return forRotateOrdsCerts(
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
    public com.oracle.bmc.waiter.Waiter<RotateOrdsCertsRequest, RotateOrdsCertsResponse>
            forRotateOrdsCerts(
                    RotateOrdsCertsRequest request,
                    com.oracle.bmc.waiter.TerminationStrategy terminationStrategy,
                    com.oracle.bmc.waiter.DelayStrategy delayStrategy) {
        if (workRequestClient == null) {
            throw new IllegalStateException(
                    "A WorkRequestClient must be supplied to this waiter for this operation");
        }

        return new com.oracle.bmc.waiter.internal.SimpleWaiterImpl<>(
                executorService,
                new java.util.concurrent.Callable<RotateOrdsCertsResponse>() {
                    @Override
                    public RotateOrdsCertsResponse call() throws Exception {
                        final RotateOrdsCertsResponse response = client.rotateOrdsCerts(request);

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
    public com.oracle.bmc.waiter.Waiter<RotateSslCertsRequest, RotateSslCertsResponse>
            forRotateSslCerts(RotateSslCertsRequest request) {
        return forRotateSslCerts(
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
    public com.oracle.bmc.waiter.Waiter<RotateSslCertsRequest, RotateSslCertsResponse>
            forRotateSslCerts(
                    RotateSslCertsRequest request,
                    com.oracle.bmc.waiter.TerminationStrategy terminationStrategy,
                    com.oracle.bmc.waiter.DelayStrategy delayStrategy) {
        if (workRequestClient == null) {
            throw new IllegalStateException(
                    "A WorkRequestClient must be supplied to this waiter for this operation");
        }

        return new com.oracle.bmc.waiter.internal.SimpleWaiterImpl<>(
                executorService,
                new java.util.concurrent.Callable<RotateSslCertsResponse>() {
                    @Override
                    public RotateSslCertsResponse call() throws Exception {
                        final RotateSslCertsResponse response = client.rotateSslCerts(request);

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
    public com.oracle.bmc.waiter.Waiter<RotateVaultKeyRequest, RotateVaultKeyResponse>
            forRotateVaultKey(RotateVaultKeyRequest request) {
        return forRotateVaultKey(
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
    public com.oracle.bmc.waiter.Waiter<RotateVaultKeyRequest, RotateVaultKeyResponse>
            forRotateVaultKey(
                    RotateVaultKeyRequest request,
                    com.oracle.bmc.waiter.TerminationStrategy terminationStrategy,
                    com.oracle.bmc.waiter.DelayStrategy delayStrategy) {
        if (workRequestClient == null) {
            throw new IllegalStateException(
                    "A WorkRequestClient must be supplied to this waiter for this operation");
        }

        return new com.oracle.bmc.waiter.internal.SimpleWaiterImpl<>(
                executorService,
                new java.util.concurrent.Callable<RotateVaultKeyResponse>() {
                    @Override
                    public RotateVaultKeyResponse call() throws Exception {
                        final RotateVaultKeyResponse response = client.rotateVaultKey(request);

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
                    ScanExternalContainerDatabasePluggableDatabasesRequest,
                    ScanExternalContainerDatabasePluggableDatabasesResponse>
            forScanExternalContainerDatabasePluggableDatabases(
                    ScanExternalContainerDatabasePluggableDatabasesRequest request) {
        return forScanExternalContainerDatabasePluggableDatabases(
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
                    ScanExternalContainerDatabasePluggableDatabasesRequest,
                    ScanExternalContainerDatabasePluggableDatabasesResponse>
            forScanExternalContainerDatabasePluggableDatabases(
                    ScanExternalContainerDatabasePluggableDatabasesRequest request,
                    com.oracle.bmc.waiter.TerminationStrategy terminationStrategy,
                    com.oracle.bmc.waiter.DelayStrategy delayStrategy) {
        if (workRequestClient == null) {
            throw new IllegalStateException(
                    "A WorkRequestClient must be supplied to this waiter for this operation");
        }

        return new com.oracle.bmc.waiter.internal.SimpleWaiterImpl<>(
                executorService,
                new java.util.concurrent.Callable<
                        ScanExternalContainerDatabasePluggableDatabasesResponse>() {
                    @Override
                    public ScanExternalContainerDatabasePluggableDatabasesResponse call()
                            throws Exception {
                        final ScanExternalContainerDatabasePluggableDatabasesResponse response =
                                client.scanExternalContainerDatabasePluggableDatabases(request);

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
                    ShrinkAutonomousDatabaseRequest, ShrinkAutonomousDatabaseResponse>
            forShrinkAutonomousDatabase(ShrinkAutonomousDatabaseRequest request) {
        return forShrinkAutonomousDatabase(
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
                    ShrinkAutonomousDatabaseRequest, ShrinkAutonomousDatabaseResponse>
            forShrinkAutonomousDatabase(
                    ShrinkAutonomousDatabaseRequest request,
                    com.oracle.bmc.waiter.TerminationStrategy terminationStrategy,
                    com.oracle.bmc.waiter.DelayStrategy delayStrategy) {
        if (workRequestClient == null) {
            throw new IllegalStateException(
                    "A WorkRequestClient must be supplied to this waiter for this operation");
        }

        return new com.oracle.bmc.waiter.internal.SimpleWaiterImpl<>(
                executorService,
                new java.util.concurrent.Callable<ShrinkAutonomousDatabaseResponse>() {
                    @Override
                    public ShrinkAutonomousDatabaseResponse call() throws Exception {
                        final ShrinkAutonomousDatabaseResponse response =
                                client.shrinkAutonomousDatabase(request);

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
                    StartPluggableDatabaseRequest, StartPluggableDatabaseResponse>
            forStartPluggableDatabase(StartPluggableDatabaseRequest request) {
        return forStartPluggableDatabase(
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
                    StartPluggableDatabaseRequest, StartPluggableDatabaseResponse>
            forStartPluggableDatabase(
                    StartPluggableDatabaseRequest request,
                    com.oracle.bmc.waiter.TerminationStrategy terminationStrategy,
                    com.oracle.bmc.waiter.DelayStrategy delayStrategy) {
        if (workRequestClient == null) {
            throw new IllegalStateException(
                    "A WorkRequestClient must be supplied to this waiter for this operation");
        }

        return new com.oracle.bmc.waiter.internal.SimpleWaiterImpl<>(
                executorService,
                new java.util.concurrent.Callable<StartPluggableDatabaseResponse>() {
                    @Override
                    public StartPluggableDatabaseResponse call() throws Exception {
                        final StartPluggableDatabaseResponse response =
                                client.startPluggableDatabase(request);

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
    public com.oracle.bmc.waiter.Waiter<StopPluggableDatabaseRequest, StopPluggableDatabaseResponse>
            forStopPluggableDatabase(StopPluggableDatabaseRequest request) {
        return forStopPluggableDatabase(
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
    public com.oracle.bmc.waiter.Waiter<StopPluggableDatabaseRequest, StopPluggableDatabaseResponse>
            forStopPluggableDatabase(
                    StopPluggableDatabaseRequest request,
                    com.oracle.bmc.waiter.TerminationStrategy terminationStrategy,
                    com.oracle.bmc.waiter.DelayStrategy delayStrategy) {
        if (workRequestClient == null) {
            throw new IllegalStateException(
                    "A WorkRequestClient must be supplied to this waiter for this operation");
        }

        return new com.oracle.bmc.waiter.internal.SimpleWaiterImpl<>(
                executorService,
                new java.util.concurrent.Callable<StopPluggableDatabaseResponse>() {
                    @Override
                    public StopPluggableDatabaseResponse call() throws Exception {
                        final StopPluggableDatabaseResponse response =
                                client.stopPluggableDatabase(request);

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
                    SwitchoverAutonomousContainerDatabaseDataguardAssociationRequest,
                    SwitchoverAutonomousContainerDatabaseDataguardAssociationResponse>
            forSwitchoverAutonomousContainerDatabaseDataguardAssociation(
                    SwitchoverAutonomousContainerDatabaseDataguardAssociationRequest request) {
        return forSwitchoverAutonomousContainerDatabaseDataguardAssociation(
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
                    SwitchoverAutonomousContainerDatabaseDataguardAssociationRequest,
                    SwitchoverAutonomousContainerDatabaseDataguardAssociationResponse>
            forSwitchoverAutonomousContainerDatabaseDataguardAssociation(
                    SwitchoverAutonomousContainerDatabaseDataguardAssociationRequest request,
                    com.oracle.bmc.waiter.TerminationStrategy terminationStrategy,
                    com.oracle.bmc.waiter.DelayStrategy delayStrategy) {
        if (workRequestClient == null) {
            throw new IllegalStateException(
                    "A WorkRequestClient must be supplied to this waiter for this operation");
        }

        return new com.oracle.bmc.waiter.internal.SimpleWaiterImpl<>(
                executorService,
                new java.util.concurrent.Callable<
                        SwitchoverAutonomousContainerDatabaseDataguardAssociationResponse>() {
                    @Override
                    public SwitchoverAutonomousContainerDatabaseDataguardAssociationResponse call()
                            throws Exception {
                        final SwitchoverAutonomousContainerDatabaseDataguardAssociationResponse
                                response =
                                        client
                                                .switchoverAutonomousContainerDatabaseDataguardAssociation(
                                                        request);

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
                    SwitchoverAutonomousDatabaseRequest, SwitchoverAutonomousDatabaseResponse>
            forSwitchoverAutonomousDatabase(SwitchoverAutonomousDatabaseRequest request) {
        return forSwitchoverAutonomousDatabase(
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
                    SwitchoverAutonomousDatabaseRequest, SwitchoverAutonomousDatabaseResponse>
            forSwitchoverAutonomousDatabase(
                    SwitchoverAutonomousDatabaseRequest request,
                    com.oracle.bmc.waiter.TerminationStrategy terminationStrategy,
                    com.oracle.bmc.waiter.DelayStrategy delayStrategy) {
        if (workRequestClient == null) {
            throw new IllegalStateException(
                    "A WorkRequestClient must be supplied to this waiter for this operation");
        }

        return new com.oracle.bmc.waiter.internal.SimpleWaiterImpl<>(
                executorService,
                new java.util.concurrent.Callable<SwitchoverAutonomousDatabaseResponse>() {
                    @Override
                    public SwitchoverAutonomousDatabaseResponse call() throws Exception {
                        final SwitchoverAutonomousDatabaseResponse response =
                                client.switchoverAutonomousDatabase(request);

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
                    SwitchoverDataGuardAssociationRequest, SwitchoverDataGuardAssociationResponse>
            forSwitchoverDataGuardAssociation(SwitchoverDataGuardAssociationRequest request) {
        return forSwitchoverDataGuardAssociation(
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
                    SwitchoverDataGuardAssociationRequest, SwitchoverDataGuardAssociationResponse>
            forSwitchoverDataGuardAssociation(
                    SwitchoverDataGuardAssociationRequest request,
                    com.oracle.bmc.waiter.TerminationStrategy terminationStrategy,
                    com.oracle.bmc.waiter.DelayStrategy delayStrategy) {
        if (workRequestClient == null) {
            throw new IllegalStateException(
                    "A WorkRequestClient must be supplied to this waiter for this operation");
        }

        return new com.oracle.bmc.waiter.internal.SimpleWaiterImpl<>(
                executorService,
                new java.util.concurrent.Callable<SwitchoverDataGuardAssociationResponse>() {
                    @Override
                    public SwitchoverDataGuardAssociationResponse call() throws Exception {
                        final SwitchoverDataGuardAssociationResponse response =
                                client.switchoverDataGuardAssociation(request);

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
    public com.oracle.bmc.waiter.Waiter<TerminateDbSystemRequest, TerminateDbSystemResponse>
            forTerminateDbSystem(TerminateDbSystemRequest request) {
        return forTerminateDbSystem(
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
    public com.oracle.bmc.waiter.Waiter<TerminateDbSystemRequest, TerminateDbSystemResponse>
            forTerminateDbSystem(
                    TerminateDbSystemRequest request,
                    com.oracle.bmc.waiter.TerminationStrategy terminationStrategy,
                    com.oracle.bmc.waiter.DelayStrategy delayStrategy) {
        if (workRequestClient == null) {
            throw new IllegalStateException(
                    "A WorkRequestClient must be supplied to this waiter for this operation");
        }

        return new com.oracle.bmc.waiter.internal.SimpleWaiterImpl<>(
                executorService,
                new java.util.concurrent.Callable<TerminateDbSystemResponse>() {
                    @Override
                    public TerminateDbSystemResponse call() throws Exception {
                        final TerminateDbSystemResponse response =
                                client.terminateDbSystem(request);

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
                    UpdateAutonomousContainerDatabaseDataguardAssociationRequest,
                    UpdateAutonomousContainerDatabaseDataguardAssociationResponse>
            forUpdateAutonomousContainerDatabaseDataguardAssociation(
                    UpdateAutonomousContainerDatabaseDataguardAssociationRequest request) {
        return forUpdateAutonomousContainerDatabaseDataguardAssociation(
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
                    UpdateAutonomousContainerDatabaseDataguardAssociationRequest,
                    UpdateAutonomousContainerDatabaseDataguardAssociationResponse>
            forUpdateAutonomousContainerDatabaseDataguardAssociation(
                    UpdateAutonomousContainerDatabaseDataguardAssociationRequest request,
                    com.oracle.bmc.waiter.TerminationStrategy terminationStrategy,
                    com.oracle.bmc.waiter.DelayStrategy delayStrategy) {
        if (workRequestClient == null) {
            throw new IllegalStateException(
                    "A WorkRequestClient must be supplied to this waiter for this operation");
        }

        return new com.oracle.bmc.waiter.internal.SimpleWaiterImpl<>(
                executorService,
                new java.util.concurrent.Callable<
                        UpdateAutonomousContainerDatabaseDataguardAssociationResponse>() {
                    @Override
                    public UpdateAutonomousContainerDatabaseDataguardAssociationResponse call()
                            throws Exception {
                        final UpdateAutonomousContainerDatabaseDataguardAssociationResponse
                                response =
                                        client
                                                .updateAutonomousContainerDatabaseDataguardAssociation(
                                                        request);

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
                    UpdateAutonomousDatabaseRegionalWalletRequest,
                    UpdateAutonomousDatabaseRegionalWalletResponse>
            forUpdateAutonomousDatabaseRegionalWallet(
                    UpdateAutonomousDatabaseRegionalWalletRequest request) {
        return forUpdateAutonomousDatabaseRegionalWallet(
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
                    UpdateAutonomousDatabaseRegionalWalletRequest,
                    UpdateAutonomousDatabaseRegionalWalletResponse>
            forUpdateAutonomousDatabaseRegionalWallet(
                    UpdateAutonomousDatabaseRegionalWalletRequest request,
                    com.oracle.bmc.waiter.TerminationStrategy terminationStrategy,
                    com.oracle.bmc.waiter.DelayStrategy delayStrategy) {
        if (workRequestClient == null) {
            throw new IllegalStateException(
                    "A WorkRequestClient must be supplied to this waiter for this operation");
        }

        return new com.oracle.bmc.waiter.internal.SimpleWaiterImpl<>(
                executorService,
                new java.util.concurrent.Callable<
                        UpdateAutonomousDatabaseRegionalWalletResponse>() {
                    @Override
                    public UpdateAutonomousDatabaseRegionalWalletResponse call() throws Exception {
                        final UpdateAutonomousDatabaseRegionalWalletResponse response =
                                client.updateAutonomousDatabaseRegionalWallet(request);

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
                    UpdateAutonomousDatabaseWalletRequest, UpdateAutonomousDatabaseWalletResponse>
            forUpdateAutonomousDatabaseWallet(UpdateAutonomousDatabaseWalletRequest request) {
        return forUpdateAutonomousDatabaseWallet(
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
                    UpdateAutonomousDatabaseWalletRequest, UpdateAutonomousDatabaseWalletResponse>
            forUpdateAutonomousDatabaseWallet(
                    UpdateAutonomousDatabaseWalletRequest request,
                    com.oracle.bmc.waiter.TerminationStrategy terminationStrategy,
                    com.oracle.bmc.waiter.DelayStrategy delayStrategy) {
        if (workRequestClient == null) {
            throw new IllegalStateException(
                    "A WorkRequestClient must be supplied to this waiter for this operation");
        }

        return new com.oracle.bmc.waiter.internal.SimpleWaiterImpl<>(
                executorService,
                new java.util.concurrent.Callable<UpdateAutonomousDatabaseWalletResponse>() {
                    @Override
                    public UpdateAutonomousDatabaseWalletResponse call() throws Exception {
                        final UpdateAutonomousDatabaseWalletResponse response =
                                client.updateAutonomousDatabaseWallet(request);

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

    /**
     * Creates a new {@link com.oracle.bmc.waiter.Waiter} using the default configuration.
     *
     * @param request the request to send
     * @return a new {@link com.oracle.bmc.waiter.Waiter} instance
     */
    public com.oracle.bmc.waiter.Waiter<
                    UpdateAutonomousVmClusterRequest, UpdateAutonomousVmClusterResponse>
            forUpdateAutonomousVmCluster(UpdateAutonomousVmClusterRequest request) {
        return forUpdateAutonomousVmCluster(
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
                    UpdateAutonomousVmClusterRequest, UpdateAutonomousVmClusterResponse>
            forUpdateAutonomousVmCluster(
                    UpdateAutonomousVmClusterRequest request,
                    com.oracle.bmc.waiter.TerminationStrategy terminationStrategy,
                    com.oracle.bmc.waiter.DelayStrategy delayStrategy) {
        if (workRequestClient == null) {
            throw new IllegalStateException(
                    "A WorkRequestClient must be supplied to this waiter for this operation");
        }

        return new com.oracle.bmc.waiter.internal.SimpleWaiterImpl<>(
                executorService,
                new java.util.concurrent.Callable<UpdateAutonomousVmClusterResponse>() {
                    @Override
                    public UpdateAutonomousVmClusterResponse call() throws Exception {
                        final UpdateAutonomousVmClusterResponse response =
                                client.updateAutonomousVmCluster(request);

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
                    UpdateCloudAutonomousVmClusterRequest, UpdateCloudAutonomousVmClusterResponse>
            forUpdateCloudAutonomousVmCluster(UpdateCloudAutonomousVmClusterRequest request) {
        return forUpdateCloudAutonomousVmCluster(
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
                    UpdateCloudAutonomousVmClusterRequest, UpdateCloudAutonomousVmClusterResponse>
            forUpdateCloudAutonomousVmCluster(
                    UpdateCloudAutonomousVmClusterRequest request,
                    com.oracle.bmc.waiter.TerminationStrategy terminationStrategy,
                    com.oracle.bmc.waiter.DelayStrategy delayStrategy) {
        if (workRequestClient == null) {
            throw new IllegalStateException(
                    "A WorkRequestClient must be supplied to this waiter for this operation");
        }

        return new com.oracle.bmc.waiter.internal.SimpleWaiterImpl<>(
                executorService,
                new java.util.concurrent.Callable<UpdateCloudAutonomousVmClusterResponse>() {
                    @Override
                    public UpdateCloudAutonomousVmClusterResponse call() throws Exception {
                        final UpdateCloudAutonomousVmClusterResponse response =
                                client.updateCloudAutonomousVmCluster(request);

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
                    UpdateCloudExadataInfrastructureRequest,
                    UpdateCloudExadataInfrastructureResponse>
            forUpdateCloudExadataInfrastructure(UpdateCloudExadataInfrastructureRequest request) {
        return forUpdateCloudExadataInfrastructure(
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
                    UpdateCloudExadataInfrastructureRequest,
                    UpdateCloudExadataInfrastructureResponse>
            forUpdateCloudExadataInfrastructure(
                    UpdateCloudExadataInfrastructureRequest request,
                    com.oracle.bmc.waiter.TerminationStrategy terminationStrategy,
                    com.oracle.bmc.waiter.DelayStrategy delayStrategy) {
        if (workRequestClient == null) {
            throw new IllegalStateException(
                    "A WorkRequestClient must be supplied to this waiter for this operation");
        }

        return new com.oracle.bmc.waiter.internal.SimpleWaiterImpl<>(
                executorService,
                new java.util.concurrent.Callable<UpdateCloudExadataInfrastructureResponse>() {
                    @Override
                    public UpdateCloudExadataInfrastructureResponse call() throws Exception {
                        final UpdateCloudExadataInfrastructureResponse response =
                                client.updateCloudExadataInfrastructure(request);

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
    public com.oracle.bmc.waiter.Waiter<UpdateCloudVmClusterRequest, UpdateCloudVmClusterResponse>
            forUpdateCloudVmCluster(UpdateCloudVmClusterRequest request) {
        return forUpdateCloudVmCluster(
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
    public com.oracle.bmc.waiter.Waiter<UpdateCloudVmClusterRequest, UpdateCloudVmClusterResponse>
            forUpdateCloudVmCluster(
                    UpdateCloudVmClusterRequest request,
                    com.oracle.bmc.waiter.TerminationStrategy terminationStrategy,
                    com.oracle.bmc.waiter.DelayStrategy delayStrategy) {
        if (workRequestClient == null) {
            throw new IllegalStateException(
                    "A WorkRequestClient must be supplied to this waiter for this operation");
        }

        return new com.oracle.bmc.waiter.internal.SimpleWaiterImpl<>(
                executorService,
                new java.util.concurrent.Callable<UpdateCloudVmClusterResponse>() {
                    @Override
                    public UpdateCloudVmClusterResponse call() throws Exception {
                        final UpdateCloudVmClusterResponse response =
                                client.updateCloudVmCluster(request);

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
                    UpdateCloudVmClusterIormConfigRequest, UpdateCloudVmClusterIormConfigResponse>
            forUpdateCloudVmClusterIormConfig(UpdateCloudVmClusterIormConfigRequest request) {
        return forUpdateCloudVmClusterIormConfig(
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
                    UpdateCloudVmClusterIormConfigRequest, UpdateCloudVmClusterIormConfigResponse>
            forUpdateCloudVmClusterIormConfig(
                    UpdateCloudVmClusterIormConfigRequest request,
                    com.oracle.bmc.waiter.TerminationStrategy terminationStrategy,
                    com.oracle.bmc.waiter.DelayStrategy delayStrategy) {
        if (workRequestClient == null) {
            throw new IllegalStateException(
                    "A WorkRequestClient must be supplied to this waiter for this operation");
        }

        return new com.oracle.bmc.waiter.internal.SimpleWaiterImpl<>(
                executorService,
                new java.util.concurrent.Callable<UpdateCloudVmClusterIormConfigResponse>() {
                    @Override
                    public UpdateCloudVmClusterIormConfigResponse call() throws Exception {
                        final UpdateCloudVmClusterIormConfigResponse response =
                                client.updateCloudVmClusterIormConfig(request);

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
                    UpdateDataGuardAssociationRequest, UpdateDataGuardAssociationResponse>
            forUpdateDataGuardAssociation(UpdateDataGuardAssociationRequest request) {
        return forUpdateDataGuardAssociation(
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
                    UpdateDataGuardAssociationRequest, UpdateDataGuardAssociationResponse>
            forUpdateDataGuardAssociation(
                    UpdateDataGuardAssociationRequest request,
                    com.oracle.bmc.waiter.TerminationStrategy terminationStrategy,
                    com.oracle.bmc.waiter.DelayStrategy delayStrategy) {
        if (workRequestClient == null) {
            throw new IllegalStateException(
                    "A WorkRequestClient must be supplied to this waiter for this operation");
        }

        return new com.oracle.bmc.waiter.internal.SimpleWaiterImpl<>(
                executorService,
                new java.util.concurrent.Callable<UpdateDataGuardAssociationResponse>() {
                    @Override
                    public UpdateDataGuardAssociationResponse call() throws Exception {
                        final UpdateDataGuardAssociationResponse response =
                                client.updateDataGuardAssociation(request);

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
    public com.oracle.bmc.waiter.Waiter<UpdateDatabaseRequest, UpdateDatabaseResponse>
            forUpdateDatabase(UpdateDatabaseRequest request) {
        return forUpdateDatabase(
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
    public com.oracle.bmc.waiter.Waiter<UpdateDatabaseRequest, UpdateDatabaseResponse>
            forUpdateDatabase(
                    UpdateDatabaseRequest request,
                    com.oracle.bmc.waiter.TerminationStrategy terminationStrategy,
                    com.oracle.bmc.waiter.DelayStrategy delayStrategy) {
        if (workRequestClient == null) {
            throw new IllegalStateException(
                    "A WorkRequestClient must be supplied to this waiter for this operation");
        }

        return new com.oracle.bmc.waiter.internal.SimpleWaiterImpl<>(
                executorService,
                new java.util.concurrent.Callable<UpdateDatabaseResponse>() {
                    @Override
                    public UpdateDatabaseResponse call() throws Exception {
                        final UpdateDatabaseResponse response = client.updateDatabase(request);

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
    public com.oracle.bmc.waiter.Waiter<UpdateDbHomeRequest, UpdateDbHomeResponse> forUpdateDbHome(
            UpdateDbHomeRequest request) {
        return forUpdateDbHome(
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
    public com.oracle.bmc.waiter.Waiter<UpdateDbHomeRequest, UpdateDbHomeResponse> forUpdateDbHome(
            UpdateDbHomeRequest request,
            com.oracle.bmc.waiter.TerminationStrategy terminationStrategy,
            com.oracle.bmc.waiter.DelayStrategy delayStrategy) {
        if (workRequestClient == null) {
            throw new IllegalStateException(
                    "A WorkRequestClient must be supplied to this waiter for this operation");
        }

        return new com.oracle.bmc.waiter.internal.SimpleWaiterImpl<>(
                executorService,
                new java.util.concurrent.Callable<UpdateDbHomeResponse>() {
                    @Override
                    public UpdateDbHomeResponse call() throws Exception {
                        final UpdateDbHomeResponse response = client.updateDbHome(request);

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
    public com.oracle.bmc.waiter.Waiter<UpdateDbSystemRequest, UpdateDbSystemResponse>
            forUpdateDbSystem(UpdateDbSystemRequest request) {
        return forUpdateDbSystem(
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
    public com.oracle.bmc.waiter.Waiter<UpdateDbSystemRequest, UpdateDbSystemResponse>
            forUpdateDbSystem(
                    UpdateDbSystemRequest request,
                    com.oracle.bmc.waiter.TerminationStrategy terminationStrategy,
                    com.oracle.bmc.waiter.DelayStrategy delayStrategy) {
        if (workRequestClient == null) {
            throw new IllegalStateException(
                    "A WorkRequestClient must be supplied to this waiter for this operation");
        }

        return new com.oracle.bmc.waiter.internal.SimpleWaiterImpl<>(
                executorService,
                new java.util.concurrent.Callable<UpdateDbSystemResponse>() {
                    @Override
                    public UpdateDbSystemResponse call() throws Exception {
                        final UpdateDbSystemResponse response = client.updateDbSystem(request);

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
                    UpdateExadataInfrastructureRequest, UpdateExadataInfrastructureResponse>
            forUpdateExadataInfrastructure(UpdateExadataInfrastructureRequest request) {
        return forUpdateExadataInfrastructure(
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
                    UpdateExadataInfrastructureRequest, UpdateExadataInfrastructureResponse>
            forUpdateExadataInfrastructure(
                    UpdateExadataInfrastructureRequest request,
                    com.oracle.bmc.waiter.TerminationStrategy terminationStrategy,
                    com.oracle.bmc.waiter.DelayStrategy delayStrategy) {
        if (workRequestClient == null) {
            throw new IllegalStateException(
                    "A WorkRequestClient must be supplied to this waiter for this operation");
        }

        return new com.oracle.bmc.waiter.internal.SimpleWaiterImpl<>(
                executorService,
                new java.util.concurrent.Callable<UpdateExadataInfrastructureResponse>() {
                    @Override
                    public UpdateExadataInfrastructureResponse call() throws Exception {
                        final UpdateExadataInfrastructureResponse response =
                                client.updateExadataInfrastructure(request);

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
                    UpdateExadataIormConfigRequest, UpdateExadataIormConfigResponse>
            forUpdateExadataIormConfig(UpdateExadataIormConfigRequest request) {
        return forUpdateExadataIormConfig(
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
                    UpdateExadataIormConfigRequest, UpdateExadataIormConfigResponse>
            forUpdateExadataIormConfig(
                    UpdateExadataIormConfigRequest request,
                    com.oracle.bmc.waiter.TerminationStrategy terminationStrategy,
                    com.oracle.bmc.waiter.DelayStrategy delayStrategy) {
        if (workRequestClient == null) {
            throw new IllegalStateException(
                    "A WorkRequestClient must be supplied to this waiter for this operation");
        }

        return new com.oracle.bmc.waiter.internal.SimpleWaiterImpl<>(
                executorService,
                new java.util.concurrent.Callable<UpdateExadataIormConfigResponse>() {
                    @Override
                    public UpdateExadataIormConfigResponse call() throws Exception {
                        final UpdateExadataIormConfigResponse response =
                                client.updateExadataIormConfig(request);

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
                    UpdateExternalContainerDatabaseRequest, UpdateExternalContainerDatabaseResponse>
            forUpdateExternalContainerDatabase(UpdateExternalContainerDatabaseRequest request) {
        return forUpdateExternalContainerDatabase(
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
                    UpdateExternalContainerDatabaseRequest, UpdateExternalContainerDatabaseResponse>
            forUpdateExternalContainerDatabase(
                    UpdateExternalContainerDatabaseRequest request,
                    com.oracle.bmc.waiter.TerminationStrategy terminationStrategy,
                    com.oracle.bmc.waiter.DelayStrategy delayStrategy) {
        if (workRequestClient == null) {
            throw new IllegalStateException(
                    "A WorkRequestClient must be supplied to this waiter for this operation");
        }

        return new com.oracle.bmc.waiter.internal.SimpleWaiterImpl<>(
                executorService,
                new java.util.concurrent.Callable<UpdateExternalContainerDatabaseResponse>() {
                    @Override
                    public UpdateExternalContainerDatabaseResponse call() throws Exception {
                        final UpdateExternalContainerDatabaseResponse response =
                                client.updateExternalContainerDatabase(request);

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
                    UpdateExternalDatabaseConnectorRequest, UpdateExternalDatabaseConnectorResponse>
            forUpdateExternalDatabaseConnector(UpdateExternalDatabaseConnectorRequest request) {
        return forUpdateExternalDatabaseConnector(
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
                    UpdateExternalDatabaseConnectorRequest, UpdateExternalDatabaseConnectorResponse>
            forUpdateExternalDatabaseConnector(
                    UpdateExternalDatabaseConnectorRequest request,
                    com.oracle.bmc.waiter.TerminationStrategy terminationStrategy,
                    com.oracle.bmc.waiter.DelayStrategy delayStrategy) {
        if (workRequestClient == null) {
            throw new IllegalStateException(
                    "A WorkRequestClient must be supplied to this waiter for this operation");
        }

        return new com.oracle.bmc.waiter.internal.SimpleWaiterImpl<>(
                executorService,
                new java.util.concurrent.Callable<UpdateExternalDatabaseConnectorResponse>() {
                    @Override
                    public UpdateExternalDatabaseConnectorResponse call() throws Exception {
                        final UpdateExternalDatabaseConnectorResponse response =
                                client.updateExternalDatabaseConnector(request);

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
                    UpdateExternalNonContainerDatabaseRequest,
                    UpdateExternalNonContainerDatabaseResponse>
            forUpdateExternalNonContainerDatabase(
                    UpdateExternalNonContainerDatabaseRequest request) {
        return forUpdateExternalNonContainerDatabase(
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
                    UpdateExternalNonContainerDatabaseRequest,
                    UpdateExternalNonContainerDatabaseResponse>
            forUpdateExternalNonContainerDatabase(
                    UpdateExternalNonContainerDatabaseRequest request,
                    com.oracle.bmc.waiter.TerminationStrategy terminationStrategy,
                    com.oracle.bmc.waiter.DelayStrategy delayStrategy) {
        if (workRequestClient == null) {
            throw new IllegalStateException(
                    "A WorkRequestClient must be supplied to this waiter for this operation");
        }

        return new com.oracle.bmc.waiter.internal.SimpleWaiterImpl<>(
                executorService,
                new java.util.concurrent.Callable<UpdateExternalNonContainerDatabaseResponse>() {
                    @Override
                    public UpdateExternalNonContainerDatabaseResponse call() throws Exception {
                        final UpdateExternalNonContainerDatabaseResponse response =
                                client.updateExternalNonContainerDatabase(request);

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
                    UpdateExternalPluggableDatabaseRequest, UpdateExternalPluggableDatabaseResponse>
            forUpdateExternalPluggableDatabase(UpdateExternalPluggableDatabaseRequest request) {
        return forUpdateExternalPluggableDatabase(
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
                    UpdateExternalPluggableDatabaseRequest, UpdateExternalPluggableDatabaseResponse>
            forUpdateExternalPluggableDatabase(
                    UpdateExternalPluggableDatabaseRequest request,
                    com.oracle.bmc.waiter.TerminationStrategy terminationStrategy,
                    com.oracle.bmc.waiter.DelayStrategy delayStrategy) {
        if (workRequestClient == null) {
            throw new IllegalStateException(
                    "A WorkRequestClient must be supplied to this waiter for this operation");
        }

        return new com.oracle.bmc.waiter.internal.SimpleWaiterImpl<>(
                executorService,
                new java.util.concurrent.Callable<UpdateExternalPluggableDatabaseResponse>() {
                    @Override
                    public UpdateExternalPluggableDatabaseResponse call() throws Exception {
                        final UpdateExternalPluggableDatabaseResponse response =
                                client.updateExternalPluggableDatabase(request);

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
                    UpdatePluggableDatabaseRequest, UpdatePluggableDatabaseResponse>
            forUpdatePluggableDatabase(UpdatePluggableDatabaseRequest request) {
        return forUpdatePluggableDatabase(
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
                    UpdatePluggableDatabaseRequest, UpdatePluggableDatabaseResponse>
            forUpdatePluggableDatabase(
                    UpdatePluggableDatabaseRequest request,
                    com.oracle.bmc.waiter.TerminationStrategy terminationStrategy,
                    com.oracle.bmc.waiter.DelayStrategy delayStrategy) {
        if (workRequestClient == null) {
            throw new IllegalStateException(
                    "A WorkRequestClient must be supplied to this waiter for this operation");
        }

        return new com.oracle.bmc.waiter.internal.SimpleWaiterImpl<>(
                executorService,
                new java.util.concurrent.Callable<UpdatePluggableDatabaseResponse>() {
                    @Override
                    public UpdatePluggableDatabaseResponse call() throws Exception {
                        final UpdatePluggableDatabaseResponse response =
                                client.updatePluggableDatabase(request);

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
    public com.oracle.bmc.waiter.Waiter<UpdateVmClusterRequest, UpdateVmClusterResponse>
            forUpdateVmCluster(UpdateVmClusterRequest request) {
        return forUpdateVmCluster(
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
    public com.oracle.bmc.waiter.Waiter<UpdateVmClusterRequest, UpdateVmClusterResponse>
            forUpdateVmCluster(
                    UpdateVmClusterRequest request,
                    com.oracle.bmc.waiter.TerminationStrategy terminationStrategy,
                    com.oracle.bmc.waiter.DelayStrategy delayStrategy) {
        if (workRequestClient == null) {
            throw new IllegalStateException(
                    "A WorkRequestClient must be supplied to this waiter for this operation");
        }

        return new com.oracle.bmc.waiter.internal.SimpleWaiterImpl<>(
                executorService,
                new java.util.concurrent.Callable<UpdateVmClusterResponse>() {
                    @Override
                    public UpdateVmClusterResponse call() throws Exception {
                        final UpdateVmClusterResponse response = client.updateVmCluster(request);

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
                    UpdateVmClusterNetworkRequest, UpdateVmClusterNetworkResponse>
            forUpdateVmClusterNetwork(UpdateVmClusterNetworkRequest request) {
        return forUpdateVmClusterNetwork(
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
                    UpdateVmClusterNetworkRequest, UpdateVmClusterNetworkResponse>
            forUpdateVmClusterNetwork(
                    UpdateVmClusterNetworkRequest request,
                    com.oracle.bmc.waiter.TerminationStrategy terminationStrategy,
                    com.oracle.bmc.waiter.DelayStrategy delayStrategy) {
        if (workRequestClient == null) {
            throw new IllegalStateException(
                    "A WorkRequestClient must be supplied to this waiter for this operation");
        }

        return new com.oracle.bmc.waiter.internal.SimpleWaiterImpl<>(
                executorService,
                new java.util.concurrent.Callable<UpdateVmClusterNetworkResponse>() {
                    @Override
                    public UpdateVmClusterNetworkResponse call() throws Exception {
                        final UpdateVmClusterNetworkResponse response =
                                client.updateVmClusterNetwork(request);

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
    public com.oracle.bmc.waiter.Waiter<UpgradeDatabaseRequest, UpgradeDatabaseResponse>
            forUpgradeDatabase(UpgradeDatabaseRequest request) {
        return forUpgradeDatabase(
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
    public com.oracle.bmc.waiter.Waiter<UpgradeDatabaseRequest, UpgradeDatabaseResponse>
            forUpgradeDatabase(
                    UpgradeDatabaseRequest request,
                    com.oracle.bmc.waiter.TerminationStrategy terminationStrategy,
                    com.oracle.bmc.waiter.DelayStrategy delayStrategy) {
        if (workRequestClient == null) {
            throw new IllegalStateException(
                    "A WorkRequestClient must be supplied to this waiter for this operation");
        }

        return new com.oracle.bmc.waiter.internal.SimpleWaiterImpl<>(
                executorService,
                new java.util.concurrent.Callable<UpgradeDatabaseResponse>() {
                    @Override
                    public UpgradeDatabaseResponse call() throws Exception {
                        final UpgradeDatabaseResponse response = client.upgradeDatabase(request);

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
    public com.oracle.bmc.waiter.Waiter<UpgradeDbSystemRequest, UpgradeDbSystemResponse>
            forUpgradeDbSystem(UpgradeDbSystemRequest request) {
        return forUpgradeDbSystem(
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
    public com.oracle.bmc.waiter.Waiter<UpgradeDbSystemRequest, UpgradeDbSystemResponse>
            forUpgradeDbSystem(
                    UpgradeDbSystemRequest request,
                    com.oracle.bmc.waiter.TerminationStrategy terminationStrategy,
                    com.oracle.bmc.waiter.DelayStrategy delayStrategy) {
        if (workRequestClient == null) {
            throw new IllegalStateException(
                    "A WorkRequestClient must be supplied to this waiter for this operation");
        }

        return new com.oracle.bmc.waiter.internal.SimpleWaiterImpl<>(
                executorService,
                new java.util.concurrent.Callable<UpgradeDbSystemResponse>() {
                    @Override
                    public UpgradeDbSystemResponse call() throws Exception {
                        final UpgradeDbSystemResponse response = client.upgradeDbSystem(request);

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
                    ValidateVmClusterNetworkRequest, ValidateVmClusterNetworkResponse>
            forValidateVmClusterNetwork(ValidateVmClusterNetworkRequest request) {
        return forValidateVmClusterNetwork(
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
                    ValidateVmClusterNetworkRequest, ValidateVmClusterNetworkResponse>
            forValidateVmClusterNetwork(
                    ValidateVmClusterNetworkRequest request,
                    com.oracle.bmc.waiter.TerminationStrategy terminationStrategy,
                    com.oracle.bmc.waiter.DelayStrategy delayStrategy) {
        if (workRequestClient == null) {
            throw new IllegalStateException(
                    "A WorkRequestClient must be supplied to this waiter for this operation");
        }

        return new com.oracle.bmc.waiter.internal.SimpleWaiterImpl<>(
                executorService,
                new java.util.concurrent.Callable<ValidateVmClusterNetworkResponse>() {
                    @Override
                    public ValidateVmClusterNetworkResponse call() throws Exception {
                        final ValidateVmClusterNetworkResponse response =
                                client.validateVmClusterNetwork(request);

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
