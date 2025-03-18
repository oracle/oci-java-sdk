/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.core;

import com.oracle.bmc.core.requests.*;
import com.oracle.bmc.core.responses.*;

/**
 * Collection of helper methods to produce {@link com.oracle.bmc.waiter.Waiter}s for different
 * resources of Compute.
 *
 * <p>The default configuration used is defined by {@link
 * com.oracle.bmc.waiter.Waiters.Waiters#DEFAULT_POLLING_WAITER}.
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20160918")
public class ComputeWaiters {
    @jakarta.annotation.Nonnull private final java.util.concurrent.ExecutorService executorService;
    @jakarta.annotation.Nonnull private final Compute client;
    private final com.oracle.bmc.workrequests.WorkRequest workRequestClient;

    @Deprecated
    public ComputeWaiters(
            @jakarta.annotation.Nonnull java.util.concurrent.ExecutorService executorService,
            @jakarta.annotation.Nonnull Compute client) {
        this(executorService, client, null);
    }

    public ComputeWaiters(
            @jakarta.annotation.Nonnull java.util.concurrent.ExecutorService executorService,
            @jakarta.annotation.Nonnull Compute client,
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
                    ChangeComputeCapacityReservationCompartmentRequest,
                    ChangeComputeCapacityReservationCompartmentResponse>
            forChangeComputeCapacityReservationCompartment(
                    ChangeComputeCapacityReservationCompartmentRequest request) {
        return forChangeComputeCapacityReservationCompartment(
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
                    ChangeComputeCapacityReservationCompartmentRequest,
                    ChangeComputeCapacityReservationCompartmentResponse>
            forChangeComputeCapacityReservationCompartment(
                    ChangeComputeCapacityReservationCompartmentRequest request,
                    com.oracle.bmc.waiter.TerminationStrategy terminationStrategy,
                    com.oracle.bmc.waiter.DelayStrategy delayStrategy) {
        if (workRequestClient == null) {
            throw new IllegalStateException(
                    "A WorkRequestClient must be supplied to this waiter for this operation");
        }

        return new com.oracle.bmc.waiter.internal.SimpleWaiterImpl<>(
                executorService,
                new java.util.concurrent.Callable<
                        ChangeComputeCapacityReservationCompartmentResponse>() {
                    @Override
                    public ChangeComputeCapacityReservationCompartmentResponse call()
                            throws Exception {
                        final ChangeComputeCapacityReservationCompartmentResponse response =
                                client.changeComputeCapacityReservationCompartment(request);

                        if (response.getOpcWorkRequestId() != null) {
                            final com.oracle.bmc.workrequests.requests.GetWorkRequestRequest
                                    getWorkRequestRequest =
                                            com.oracle.bmc.workrequests.requests
                                                    .GetWorkRequestRequest.builder()
                                                    .workRequestId(response.getOpcWorkRequestId())
                                                    .build();
                            workRequestClient
                                    .getWaiters()
                                    .forWorkRequest(
                                            getWorkRequestRequest,
                                            terminationStrategy,
                                            delayStrategy)
                                    .execute();
                        }
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
                    ChangeComputeCapacityTopologyCompartmentRequest,
                    ChangeComputeCapacityTopologyCompartmentResponse>
            forChangeComputeCapacityTopologyCompartment(
                    ChangeComputeCapacityTopologyCompartmentRequest request) {
        return forChangeComputeCapacityTopologyCompartment(
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
                    ChangeComputeCapacityTopologyCompartmentRequest,
                    ChangeComputeCapacityTopologyCompartmentResponse>
            forChangeComputeCapacityTopologyCompartment(
                    ChangeComputeCapacityTopologyCompartmentRequest request,
                    com.oracle.bmc.waiter.TerminationStrategy terminationStrategy,
                    com.oracle.bmc.waiter.DelayStrategy delayStrategy) {
        if (workRequestClient == null) {
            throw new IllegalStateException(
                    "A WorkRequestClient must be supplied to this waiter for this operation");
        }

        return new com.oracle.bmc.waiter.internal.SimpleWaiterImpl<>(
                executorService,
                new java.util.concurrent.Callable<
                        ChangeComputeCapacityTopologyCompartmentResponse>() {
                    @Override
                    public ChangeComputeCapacityTopologyCompartmentResponse call()
                            throws Exception {
                        final ChangeComputeCapacityTopologyCompartmentResponse response =
                                client.changeComputeCapacityTopologyCompartment(request);

                        if (response.getOpcWorkRequestId() != null) {
                            final com.oracle.bmc.workrequests.requests.GetWorkRequestRequest
                                    getWorkRequestRequest =
                                            com.oracle.bmc.workrequests.requests
                                                    .GetWorkRequestRequest.builder()
                                                    .workRequestId(response.getOpcWorkRequestId())
                                                    .build();
                            workRequestClient
                                    .getWaiters()
                                    .forWorkRequest(
                                            getWorkRequestRequest,
                                            terminationStrategy,
                                            delayStrategy)
                                    .execute();
                        }
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
                    ChangeDedicatedVmHostCompartmentRequest,
                    ChangeDedicatedVmHostCompartmentResponse>
            forChangeDedicatedVmHostCompartment(ChangeDedicatedVmHostCompartmentRequest request) {
        return forChangeDedicatedVmHostCompartment(
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
                    ChangeDedicatedVmHostCompartmentRequest,
                    ChangeDedicatedVmHostCompartmentResponse>
            forChangeDedicatedVmHostCompartment(
                    ChangeDedicatedVmHostCompartmentRequest request,
                    com.oracle.bmc.waiter.TerminationStrategy terminationStrategy,
                    com.oracle.bmc.waiter.DelayStrategy delayStrategy) {
        if (workRequestClient == null) {
            throw new IllegalStateException(
                    "A WorkRequestClient must be supplied to this waiter for this operation");
        }

        return new com.oracle.bmc.waiter.internal.SimpleWaiterImpl<>(
                executorService,
                new java.util.concurrent.Callable<ChangeDedicatedVmHostCompartmentResponse>() {
                    @Override
                    public ChangeDedicatedVmHostCompartmentResponse call() throws Exception {
                        final ChangeDedicatedVmHostCompartmentResponse response =
                                client.changeDedicatedVmHostCompartment(request);

                        if (response.getOpcWorkRequestId() != null) {
                            final com.oracle.bmc.workrequests.requests.GetWorkRequestRequest
                                    getWorkRequestRequest =
                                            com.oracle.bmc.workrequests.requests
                                                    .GetWorkRequestRequest.builder()
                                                    .workRequestId(response.getOpcWorkRequestId())
                                                    .build();
                            workRequestClient
                                    .getWaiters()
                                    .forWorkRequest(
                                            getWorkRequestRequest,
                                            terminationStrategy,
                                            delayStrategy)
                                    .execute();
                        }
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
                    ChangeInstanceCompartmentRequest, ChangeInstanceCompartmentResponse>
            forChangeInstanceCompartment(ChangeInstanceCompartmentRequest request) {
        return forChangeInstanceCompartment(
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
                    ChangeInstanceCompartmentRequest, ChangeInstanceCompartmentResponse>
            forChangeInstanceCompartment(
                    ChangeInstanceCompartmentRequest request,
                    com.oracle.bmc.waiter.TerminationStrategy terminationStrategy,
                    com.oracle.bmc.waiter.DelayStrategy delayStrategy) {
        if (workRequestClient == null) {
            throw new IllegalStateException(
                    "A WorkRequestClient must be supplied to this waiter for this operation");
        }

        return new com.oracle.bmc.waiter.internal.SimpleWaiterImpl<>(
                executorService,
                new java.util.concurrent.Callable<ChangeInstanceCompartmentResponse>() {
                    @Override
                    public ChangeInstanceCompartmentResponse call() throws Exception {
                        final ChangeInstanceCompartmentResponse response =
                                client.changeInstanceCompartment(request);

                        if (response.getOpcWorkRequestId() != null) {
                            final com.oracle.bmc.workrequests.requests.GetWorkRequestRequest
                                    getWorkRequestRequest =
                                            com.oracle.bmc.workrequests.requests
                                                    .GetWorkRequestRequest.builder()
                                                    .workRequestId(response.getOpcWorkRequestId())
                                                    .build();
                            workRequestClient
                                    .getWaiters()
                                    .forWorkRequest(
                                            getWorkRequestRequest,
                                            terminationStrategy,
                                            delayStrategy)
                                    .execute();
                        }
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
                    CreateComputeCapacityReservationRequest,
                    CreateComputeCapacityReservationResponse>
            forCreateComputeCapacityReservation(CreateComputeCapacityReservationRequest request) {
        return forCreateComputeCapacityReservation(
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
                    CreateComputeCapacityReservationRequest,
                    CreateComputeCapacityReservationResponse>
            forCreateComputeCapacityReservation(
                    CreateComputeCapacityReservationRequest request,
                    com.oracle.bmc.waiter.TerminationStrategy terminationStrategy,
                    com.oracle.bmc.waiter.DelayStrategy delayStrategy) {
        if (workRequestClient == null) {
            throw new IllegalStateException(
                    "A WorkRequestClient must be supplied to this waiter for this operation");
        }

        return new com.oracle.bmc.waiter.internal.SimpleWaiterImpl<>(
                executorService,
                new java.util.concurrent.Callable<CreateComputeCapacityReservationResponse>() {
                    @Override
                    public CreateComputeCapacityReservationResponse call() throws Exception {
                        final CreateComputeCapacityReservationResponse response =
                                client.createComputeCapacityReservation(request);

                        if (response.getOpcWorkRequestId() != null) {
                            final com.oracle.bmc.workrequests.requests.GetWorkRequestRequest
                                    getWorkRequestRequest =
                                            com.oracle.bmc.workrequests.requests
                                                    .GetWorkRequestRequest.builder()
                                                    .workRequestId(response.getOpcWorkRequestId())
                                                    .build();
                            workRequestClient
                                    .getWaiters()
                                    .forWorkRequest(
                                            getWorkRequestRequest,
                                            terminationStrategy,
                                            delayStrategy)
                                    .execute();
                        }
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
                    CreateComputeCapacityTopologyRequest, CreateComputeCapacityTopologyResponse>
            forCreateComputeCapacityTopology(CreateComputeCapacityTopologyRequest request) {
        return forCreateComputeCapacityTopology(
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
                    CreateComputeCapacityTopologyRequest, CreateComputeCapacityTopologyResponse>
            forCreateComputeCapacityTopology(
                    CreateComputeCapacityTopologyRequest request,
                    com.oracle.bmc.waiter.TerminationStrategy terminationStrategy,
                    com.oracle.bmc.waiter.DelayStrategy delayStrategy) {
        if (workRequestClient == null) {
            throw new IllegalStateException(
                    "A WorkRequestClient must be supplied to this waiter for this operation");
        }

        return new com.oracle.bmc.waiter.internal.SimpleWaiterImpl<>(
                executorService,
                new java.util.concurrent.Callable<CreateComputeCapacityTopologyResponse>() {
                    @Override
                    public CreateComputeCapacityTopologyResponse call() throws Exception {
                        final CreateComputeCapacityTopologyResponse response =
                                client.createComputeCapacityTopology(request);

                        if (response.getOpcWorkRequestId() != null) {
                            final com.oracle.bmc.workrequests.requests.GetWorkRequestRequest
                                    getWorkRequestRequest =
                                            com.oracle.bmc.workrequests.requests
                                                    .GetWorkRequestRequest.builder()
                                                    .workRequestId(response.getOpcWorkRequestId())
                                                    .build();
                            workRequestClient
                                    .getWaiters()
                                    .forWorkRequest(
                                            getWorkRequestRequest,
                                            terminationStrategy,
                                            delayStrategy)
                                    .execute();
                        }
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
                    CreateComputeGpuMemoryClusterRequest, CreateComputeGpuMemoryClusterResponse>
            forCreateComputeGpuMemoryCluster(CreateComputeGpuMemoryClusterRequest request) {
        return forCreateComputeGpuMemoryCluster(
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
                    CreateComputeGpuMemoryClusterRequest, CreateComputeGpuMemoryClusterResponse>
            forCreateComputeGpuMemoryCluster(
                    CreateComputeGpuMemoryClusterRequest request,
                    com.oracle.bmc.waiter.TerminationStrategy terminationStrategy,
                    com.oracle.bmc.waiter.DelayStrategy delayStrategy) {
        if (workRequestClient == null) {
            throw new IllegalStateException(
                    "A WorkRequestClient must be supplied to this waiter for this operation");
        }

        return new com.oracle.bmc.waiter.internal.SimpleWaiterImpl<>(
                executorService,
                new java.util.concurrent.Callable<CreateComputeGpuMemoryClusterResponse>() {
                    @Override
                    public CreateComputeGpuMemoryClusterResponse call() throws Exception {
                        final CreateComputeGpuMemoryClusterResponse response =
                                client.createComputeGpuMemoryCluster(request);

                        if (response.getOpcWorkRequestId() != null) {
                            final com.oracle.bmc.workrequests.requests.GetWorkRequestRequest
                                    getWorkRequestRequest =
                                            com.oracle.bmc.workrequests.requests
                                                    .GetWorkRequestRequest.builder()
                                                    .workRequestId(response.getOpcWorkRequestId())
                                                    .build();
                            workRequestClient
                                    .getWaiters()
                                    .forWorkRequest(
                                            getWorkRequestRequest,
                                            terminationStrategy,
                                            delayStrategy)
                                    .execute();
                        }
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
    public com.oracle.bmc.waiter.Waiter<CreateDedicatedVmHostRequest, CreateDedicatedVmHostResponse>
            forCreateDedicatedVmHost(CreateDedicatedVmHostRequest request) {
        return forCreateDedicatedVmHost(
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
    public com.oracle.bmc.waiter.Waiter<CreateDedicatedVmHostRequest, CreateDedicatedVmHostResponse>
            forCreateDedicatedVmHost(
                    CreateDedicatedVmHostRequest request,
                    com.oracle.bmc.waiter.TerminationStrategy terminationStrategy,
                    com.oracle.bmc.waiter.DelayStrategy delayStrategy) {
        if (workRequestClient == null) {
            throw new IllegalStateException(
                    "A WorkRequestClient must be supplied to this waiter for this operation");
        }

        return new com.oracle.bmc.waiter.internal.SimpleWaiterImpl<>(
                executorService,
                new java.util.concurrent.Callable<CreateDedicatedVmHostResponse>() {
                    @Override
                    public CreateDedicatedVmHostResponse call() throws Exception {
                        final CreateDedicatedVmHostResponse response =
                                client.createDedicatedVmHost(request);

                        if (response.getOpcWorkRequestId() != null) {
                            final com.oracle.bmc.workrequests.requests.GetWorkRequestRequest
                                    getWorkRequestRequest =
                                            com.oracle.bmc.workrequests.requests
                                                    .GetWorkRequestRequest.builder()
                                                    .workRequestId(response.getOpcWorkRequestId())
                                                    .build();
                            workRequestClient
                                    .getWaiters()
                                    .forWorkRequest(
                                            getWorkRequestRequest,
                                            terminationStrategy,
                                            delayStrategy)
                                    .execute();
                        }
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
    public com.oracle.bmc.waiter.Waiter<CreateImageRequest, CreateImageResponse> forCreateImage(
            CreateImageRequest request) {
        return forCreateImage(
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
    public com.oracle.bmc.waiter.Waiter<CreateImageRequest, CreateImageResponse> forCreateImage(
            CreateImageRequest request,
            com.oracle.bmc.waiter.TerminationStrategy terminationStrategy,
            com.oracle.bmc.waiter.DelayStrategy delayStrategy) {
        if (workRequestClient == null) {
            throw new IllegalStateException(
                    "A WorkRequestClient must be supplied to this waiter for this operation");
        }

        return new com.oracle.bmc.waiter.internal.SimpleWaiterImpl<>(
                executorService,
                new java.util.concurrent.Callable<CreateImageResponse>() {
                    @Override
                    public CreateImageResponse call() throws Exception {
                        final CreateImageResponse response = client.createImage(request);

                        if (response.getOpcWorkRequestId() != null) {
                            final com.oracle.bmc.workrequests.requests.GetWorkRequestRequest
                                    getWorkRequestRequest =
                                            com.oracle.bmc.workrequests.requests
                                                    .GetWorkRequestRequest.builder()
                                                    .workRequestId(response.getOpcWorkRequestId())
                                                    .build();
                            workRequestClient
                                    .getWaiters()
                                    .forWorkRequest(
                                            getWorkRequestRequest,
                                            terminationStrategy,
                                            delayStrategy)
                                    .execute();
                        }
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
                    DeleteComputeCapacityReservationRequest,
                    DeleteComputeCapacityReservationResponse>
            forDeleteComputeCapacityReservation(DeleteComputeCapacityReservationRequest request) {
        return forDeleteComputeCapacityReservation(
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
                    DeleteComputeCapacityReservationRequest,
                    DeleteComputeCapacityReservationResponse>
            forDeleteComputeCapacityReservation(
                    DeleteComputeCapacityReservationRequest request,
                    com.oracle.bmc.waiter.TerminationStrategy terminationStrategy,
                    com.oracle.bmc.waiter.DelayStrategy delayStrategy) {
        if (workRequestClient == null) {
            throw new IllegalStateException(
                    "A WorkRequestClient must be supplied to this waiter for this operation");
        }

        return new com.oracle.bmc.waiter.internal.SimpleWaiterImpl<>(
                executorService,
                new java.util.concurrent.Callable<DeleteComputeCapacityReservationResponse>() {
                    @Override
                    public DeleteComputeCapacityReservationResponse call() throws Exception {
                        final DeleteComputeCapacityReservationResponse response =
                                client.deleteComputeCapacityReservation(request);

                        if (response.getOpcWorkRequestId() != null) {
                            final com.oracle.bmc.workrequests.requests.GetWorkRequestRequest
                                    getWorkRequestRequest =
                                            com.oracle.bmc.workrequests.requests
                                                    .GetWorkRequestRequest.builder()
                                                    .workRequestId(response.getOpcWorkRequestId())
                                                    .build();
                            workRequestClient
                                    .getWaiters()
                                    .forWorkRequest(
                                            getWorkRequestRequest,
                                            terminationStrategy,
                                            delayStrategy)
                                    .execute();
                        }
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
                    DeleteComputeCapacityTopologyRequest, DeleteComputeCapacityTopologyResponse>
            forDeleteComputeCapacityTopology(DeleteComputeCapacityTopologyRequest request) {
        return forDeleteComputeCapacityTopology(
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
                    DeleteComputeCapacityTopologyRequest, DeleteComputeCapacityTopologyResponse>
            forDeleteComputeCapacityTopology(
                    DeleteComputeCapacityTopologyRequest request,
                    com.oracle.bmc.waiter.TerminationStrategy terminationStrategy,
                    com.oracle.bmc.waiter.DelayStrategy delayStrategy) {
        if (workRequestClient == null) {
            throw new IllegalStateException(
                    "A WorkRequestClient must be supplied to this waiter for this operation");
        }

        return new com.oracle.bmc.waiter.internal.SimpleWaiterImpl<>(
                executorService,
                new java.util.concurrent.Callable<DeleteComputeCapacityTopologyResponse>() {
                    @Override
                    public DeleteComputeCapacityTopologyResponse call() throws Exception {
                        final DeleteComputeCapacityTopologyResponse response =
                                client.deleteComputeCapacityTopology(request);

                        if (response.getOpcWorkRequestId() != null) {
                            final com.oracle.bmc.workrequests.requests.GetWorkRequestRequest
                                    getWorkRequestRequest =
                                            com.oracle.bmc.workrequests.requests
                                                    .GetWorkRequestRequest.builder()
                                                    .workRequestId(response.getOpcWorkRequestId())
                                                    .build();
                            workRequestClient
                                    .getWaiters()
                                    .forWorkRequest(
                                            getWorkRequestRequest,
                                            terminationStrategy,
                                            delayStrategy)
                                    .execute();
                        }
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
                    DeleteComputeGpuMemoryClusterRequest, DeleteComputeGpuMemoryClusterResponse>
            forDeleteComputeGpuMemoryCluster(DeleteComputeGpuMemoryClusterRequest request) {
        return forDeleteComputeGpuMemoryCluster(
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
                    DeleteComputeGpuMemoryClusterRequest, DeleteComputeGpuMemoryClusterResponse>
            forDeleteComputeGpuMemoryCluster(
                    DeleteComputeGpuMemoryClusterRequest request,
                    com.oracle.bmc.waiter.TerminationStrategy terminationStrategy,
                    com.oracle.bmc.waiter.DelayStrategy delayStrategy) {
        if (workRequestClient == null) {
            throw new IllegalStateException(
                    "A WorkRequestClient must be supplied to this waiter for this operation");
        }

        return new com.oracle.bmc.waiter.internal.SimpleWaiterImpl<>(
                executorService,
                new java.util.concurrent.Callable<DeleteComputeGpuMemoryClusterResponse>() {
                    @Override
                    public DeleteComputeGpuMemoryClusterResponse call() throws Exception {
                        final DeleteComputeGpuMemoryClusterResponse response =
                                client.deleteComputeGpuMemoryCluster(request);

                        if (response.getOpcWorkRequestId() != null) {
                            final com.oracle.bmc.workrequests.requests.GetWorkRequestRequest
                                    getWorkRequestRequest =
                                            com.oracle.bmc.workrequests.requests
                                                    .GetWorkRequestRequest.builder()
                                                    .workRequestId(response.getOpcWorkRequestId())
                                                    .build();
                            workRequestClient
                                    .getWaiters()
                                    .forWorkRequest(
                                            getWorkRequestRequest,
                                            terminationStrategy,
                                            delayStrategy)
                                    .execute();
                        }
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
    public com.oracle.bmc.waiter.Waiter<DeleteDedicatedVmHostRequest, DeleteDedicatedVmHostResponse>
            forDeleteDedicatedVmHost(DeleteDedicatedVmHostRequest request) {
        return forDeleteDedicatedVmHost(
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
    public com.oracle.bmc.waiter.Waiter<DeleteDedicatedVmHostRequest, DeleteDedicatedVmHostResponse>
            forDeleteDedicatedVmHost(
                    DeleteDedicatedVmHostRequest request,
                    com.oracle.bmc.waiter.TerminationStrategy terminationStrategy,
                    com.oracle.bmc.waiter.DelayStrategy delayStrategy) {
        if (workRequestClient == null) {
            throw new IllegalStateException(
                    "A WorkRequestClient must be supplied to this waiter for this operation");
        }

        return new com.oracle.bmc.waiter.internal.SimpleWaiterImpl<>(
                executorService,
                new java.util.concurrent.Callable<DeleteDedicatedVmHostResponse>() {
                    @Override
                    public DeleteDedicatedVmHostResponse call() throws Exception {
                        final DeleteDedicatedVmHostResponse response =
                                client.deleteDedicatedVmHost(request);

                        if (response.getOpcWorkRequestId() != null) {
                            final com.oracle.bmc.workrequests.requests.GetWorkRequestRequest
                                    getWorkRequestRequest =
                                            com.oracle.bmc.workrequests.requests
                                                    .GetWorkRequestRequest.builder()
                                                    .workRequestId(response.getOpcWorkRequestId())
                                                    .build();
                            workRequestClient
                                    .getWaiters()
                                    .forWorkRequest(
                                            getWorkRequestRequest,
                                            terminationStrategy,
                                            delayStrategy)
                                    .execute();
                        }
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
    public com.oracle.bmc.waiter.Waiter<ExportImageRequest, ExportImageResponse> forExportImage(
            ExportImageRequest request) {
        return forExportImage(
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
    public com.oracle.bmc.waiter.Waiter<ExportImageRequest, ExportImageResponse> forExportImage(
            ExportImageRequest request,
            com.oracle.bmc.waiter.TerminationStrategy terminationStrategy,
            com.oracle.bmc.waiter.DelayStrategy delayStrategy) {
        if (workRequestClient == null) {
            throw new IllegalStateException(
                    "A WorkRequestClient must be supplied to this waiter for this operation");
        }

        return new com.oracle.bmc.waiter.internal.SimpleWaiterImpl<>(
                executorService,
                new java.util.concurrent.Callable<ExportImageResponse>() {
                    @Override
                    public ExportImageResponse call() throws Exception {
                        final ExportImageResponse response = client.exportImage(request);

                        if (response.getOpcWorkRequestId() != null) {
                            final com.oracle.bmc.workrequests.requests.GetWorkRequestRequest
                                    getWorkRequestRequest =
                                            com.oracle.bmc.workrequests.requests
                                                    .GetWorkRequestRequest.builder()
                                                    .workRequestId(response.getOpcWorkRequestId())
                                                    .build();
                            workRequestClient
                                    .getWaiters()
                                    .forWorkRequest(
                                            getWorkRequestRequest,
                                            terminationStrategy,
                                            delayStrategy)
                                    .execute();
                        }
                        return response;
                    }
                },
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
                    GetBootVolumeAttachmentRequest, GetBootVolumeAttachmentResponse>
            forBootVolumeAttachment(
                    GetBootVolumeAttachmentRequest request,
                    com.oracle.bmc.core.model.BootVolumeAttachment.LifecycleState... targetStates) {
        com.oracle.bmc.util.internal.Validate.notEmpty(
                targetStates, "At least one targetState must be provided");
        com.oracle.bmc.util.internal.Validate.noNullElements(
                targetStates, "Null targetState values are not permitted");

        return forBootVolumeAttachment(
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
                    GetBootVolumeAttachmentRequest, GetBootVolumeAttachmentResponse>
            forBootVolumeAttachment(
                    GetBootVolumeAttachmentRequest request,
                    com.oracle.bmc.core.model.BootVolumeAttachment.LifecycleState targetState,
                    com.oracle.bmc.waiter.TerminationStrategy terminationStrategy,
                    com.oracle.bmc.waiter.DelayStrategy delayStrategy) {
        com.oracle.bmc.util.internal.Validate.notNull(
                targetState, "The targetState cannot be null");

        return forBootVolumeAttachment(
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
                    GetBootVolumeAttachmentRequest, GetBootVolumeAttachmentResponse>
            forBootVolumeAttachment(
                    GetBootVolumeAttachmentRequest request,
                    com.oracle.bmc.waiter.TerminationStrategy terminationStrategy,
                    com.oracle.bmc.waiter.DelayStrategy delayStrategy,
                    com.oracle.bmc.core.model.BootVolumeAttachment.LifecycleState... targetStates) {
        com.oracle.bmc.util.internal.Validate.notEmpty(
                targetStates, "At least one target state must be provided");
        com.oracle.bmc.util.internal.Validate.noNullElements(
                targetStates, "Null target states are not permitted");

        return forBootVolumeAttachment(
                com.oracle.bmc.waiter.Waiters.newWaiter(terminationStrategy, delayStrategy),
                request,
                targetStates);
    }

    // Helper method to create a new Waiter for BootVolumeAttachment.
    private com.oracle.bmc.waiter.Waiter<
                    GetBootVolumeAttachmentRequest, GetBootVolumeAttachmentResponse>
            forBootVolumeAttachment(
                    com.oracle.bmc.waiter.BmcGenericWaiter waiter,
                    final GetBootVolumeAttachmentRequest request,
                    final com.oracle.bmc.core.model.BootVolumeAttachment.LifecycleState...
                            targetStates) {
        final java.util.Set<com.oracle.bmc.core.model.BootVolumeAttachment.LifecycleState>
                targetStatesSet = new java.util.HashSet<>(java.util.Arrays.asList(targetStates));

        return new com.oracle.bmc.waiter.internal.SimpleWaiterImpl<>(
                executorService,
                waiter.toCallable(
                        () -> request,
                        new java.util.function.Function<
                                GetBootVolumeAttachmentRequest, GetBootVolumeAttachmentResponse>() {
                            @Override
                            public GetBootVolumeAttachmentResponse apply(
                                    GetBootVolumeAttachmentRequest request) {
                                return client.getBootVolumeAttachment(request);
                            }
                        },
                        new java.util.function.Predicate<GetBootVolumeAttachmentResponse>() {
                            @Override
                            public boolean test(GetBootVolumeAttachmentResponse response) {
                                return targetStatesSet.contains(
                                        response.getBootVolumeAttachment().getLifecycleState());
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
                    GetComputeCapacityReservationRequest, GetComputeCapacityReservationResponse>
            forComputeCapacityReservation(
                    GetComputeCapacityReservationRequest request,
                    com.oracle.bmc.core.model.ComputeCapacityReservation.LifecycleState...
                            targetStates) {
        com.oracle.bmc.util.internal.Validate.notEmpty(
                targetStates, "At least one targetState must be provided");
        com.oracle.bmc.util.internal.Validate.noNullElements(
                targetStates, "Null targetState values are not permitted");

        return forComputeCapacityReservation(
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
                    GetComputeCapacityReservationRequest, GetComputeCapacityReservationResponse>
            forComputeCapacityReservation(
                    GetComputeCapacityReservationRequest request,
                    com.oracle.bmc.core.model.ComputeCapacityReservation.LifecycleState targetState,
                    com.oracle.bmc.waiter.TerminationStrategy terminationStrategy,
                    com.oracle.bmc.waiter.DelayStrategy delayStrategy) {
        com.oracle.bmc.util.internal.Validate.notNull(
                targetState, "The targetState cannot be null");

        return forComputeCapacityReservation(
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
                    GetComputeCapacityReservationRequest, GetComputeCapacityReservationResponse>
            forComputeCapacityReservation(
                    GetComputeCapacityReservationRequest request,
                    com.oracle.bmc.waiter.TerminationStrategy terminationStrategy,
                    com.oracle.bmc.waiter.DelayStrategy delayStrategy,
                    com.oracle.bmc.core.model.ComputeCapacityReservation.LifecycleState...
                            targetStates) {
        com.oracle.bmc.util.internal.Validate.notEmpty(
                targetStates, "At least one target state must be provided");
        com.oracle.bmc.util.internal.Validate.noNullElements(
                targetStates, "Null target states are not permitted");

        return forComputeCapacityReservation(
                com.oracle.bmc.waiter.Waiters.newWaiter(terminationStrategy, delayStrategy),
                request,
                targetStates);
    }

    // Helper method to create a new Waiter for ComputeCapacityReservation.
    private com.oracle.bmc.waiter.Waiter<
                    GetComputeCapacityReservationRequest, GetComputeCapacityReservationResponse>
            forComputeCapacityReservation(
                    com.oracle.bmc.waiter.BmcGenericWaiter waiter,
                    final GetComputeCapacityReservationRequest request,
                    final com.oracle.bmc.core.model.ComputeCapacityReservation.LifecycleState...
                            targetStates) {
        final java.util.Set<com.oracle.bmc.core.model.ComputeCapacityReservation.LifecycleState>
                targetStatesSet = new java.util.HashSet<>(java.util.Arrays.asList(targetStates));

        return new com.oracle.bmc.waiter.internal.SimpleWaiterImpl<>(
                executorService,
                waiter.toCallable(
                        () -> request,
                        new java.util.function.Function<
                                GetComputeCapacityReservationRequest,
                                GetComputeCapacityReservationResponse>() {
                            @Override
                            public GetComputeCapacityReservationResponse apply(
                                    GetComputeCapacityReservationRequest request) {
                                return client.getComputeCapacityReservation(request);
                            }
                        },
                        new java.util.function.Predicate<GetComputeCapacityReservationResponse>() {
                            @Override
                            public boolean test(GetComputeCapacityReservationResponse response) {
                                return targetStatesSet.contains(
                                        response.getComputeCapacityReservation()
                                                .getLifecycleState());
                            }
                        },
                        targetStatesSet.contains(
                                com.oracle.bmc.core.model.ComputeCapacityReservation.LifecycleState
                                        .Deleted)),
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
                    GetComputeCapacityTopologyRequest, GetComputeCapacityTopologyResponse>
            forComputeCapacityTopology(
                    GetComputeCapacityTopologyRequest request,
                    com.oracle.bmc.core.model.ComputeCapacityTopology.LifecycleState...
                            targetStates) {
        com.oracle.bmc.util.internal.Validate.notEmpty(
                targetStates, "At least one targetState must be provided");
        com.oracle.bmc.util.internal.Validate.noNullElements(
                targetStates, "Null targetState values are not permitted");

        return forComputeCapacityTopology(
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
                    GetComputeCapacityTopologyRequest, GetComputeCapacityTopologyResponse>
            forComputeCapacityTopology(
                    GetComputeCapacityTopologyRequest request,
                    com.oracle.bmc.core.model.ComputeCapacityTopology.LifecycleState targetState,
                    com.oracle.bmc.waiter.TerminationStrategy terminationStrategy,
                    com.oracle.bmc.waiter.DelayStrategy delayStrategy) {
        com.oracle.bmc.util.internal.Validate.notNull(
                targetState, "The targetState cannot be null");

        return forComputeCapacityTopology(
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
                    GetComputeCapacityTopologyRequest, GetComputeCapacityTopologyResponse>
            forComputeCapacityTopology(
                    GetComputeCapacityTopologyRequest request,
                    com.oracle.bmc.waiter.TerminationStrategy terminationStrategy,
                    com.oracle.bmc.waiter.DelayStrategy delayStrategy,
                    com.oracle.bmc.core.model.ComputeCapacityTopology.LifecycleState...
                            targetStates) {
        com.oracle.bmc.util.internal.Validate.notEmpty(
                targetStates, "At least one target state must be provided");
        com.oracle.bmc.util.internal.Validate.noNullElements(
                targetStates, "Null target states are not permitted");

        return forComputeCapacityTopology(
                com.oracle.bmc.waiter.Waiters.newWaiter(terminationStrategy, delayStrategy),
                request,
                targetStates);
    }

    // Helper method to create a new Waiter for ComputeCapacityTopology.
    private com.oracle.bmc.waiter.Waiter<
                    GetComputeCapacityTopologyRequest, GetComputeCapacityTopologyResponse>
            forComputeCapacityTopology(
                    com.oracle.bmc.waiter.BmcGenericWaiter waiter,
                    final GetComputeCapacityTopologyRequest request,
                    final com.oracle.bmc.core.model.ComputeCapacityTopology.LifecycleState...
                            targetStates) {
        final java.util.Set<com.oracle.bmc.core.model.ComputeCapacityTopology.LifecycleState>
                targetStatesSet = new java.util.HashSet<>(java.util.Arrays.asList(targetStates));

        return new com.oracle.bmc.waiter.internal.SimpleWaiterImpl<>(
                executorService,
                waiter.toCallable(
                        () -> request,
                        new java.util.function.Function<
                                GetComputeCapacityTopologyRequest,
                                GetComputeCapacityTopologyResponse>() {
                            @Override
                            public GetComputeCapacityTopologyResponse apply(
                                    GetComputeCapacityTopologyRequest request) {
                                return client.getComputeCapacityTopology(request);
                            }
                        },
                        new java.util.function.Predicate<GetComputeCapacityTopologyResponse>() {
                            @Override
                            public boolean test(GetComputeCapacityTopologyResponse response) {
                                return targetStatesSet.contains(
                                        response.getComputeCapacityTopology().getLifecycleState());
                            }
                        },
                        targetStatesSet.contains(
                                com.oracle.bmc.core.model.ComputeCapacityTopology.LifecycleState
                                        .Deleted)),
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
    public com.oracle.bmc.waiter.Waiter<GetComputeClusterRequest, GetComputeClusterResponse>
            forComputeCluster(
                    GetComputeClusterRequest request,
                    com.oracle.bmc.core.model.ComputeCluster.LifecycleState... targetStates) {
        com.oracle.bmc.util.internal.Validate.notEmpty(
                targetStates, "At least one targetState must be provided");
        com.oracle.bmc.util.internal.Validate.noNullElements(
                targetStates, "Null targetState values are not permitted");

        return forComputeCluster(
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
    public com.oracle.bmc.waiter.Waiter<GetComputeClusterRequest, GetComputeClusterResponse>
            forComputeCluster(
                    GetComputeClusterRequest request,
                    com.oracle.bmc.core.model.ComputeCluster.LifecycleState targetState,
                    com.oracle.bmc.waiter.TerminationStrategy terminationStrategy,
                    com.oracle.bmc.waiter.DelayStrategy delayStrategy) {
        com.oracle.bmc.util.internal.Validate.notNull(
                targetState, "The targetState cannot be null");

        return forComputeCluster(
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
    public com.oracle.bmc.waiter.Waiter<GetComputeClusterRequest, GetComputeClusterResponse>
            forComputeCluster(
                    GetComputeClusterRequest request,
                    com.oracle.bmc.waiter.TerminationStrategy terminationStrategy,
                    com.oracle.bmc.waiter.DelayStrategy delayStrategy,
                    com.oracle.bmc.core.model.ComputeCluster.LifecycleState... targetStates) {
        com.oracle.bmc.util.internal.Validate.notEmpty(
                targetStates, "At least one target state must be provided");
        com.oracle.bmc.util.internal.Validate.noNullElements(
                targetStates, "Null target states are not permitted");

        return forComputeCluster(
                com.oracle.bmc.waiter.Waiters.newWaiter(terminationStrategy, delayStrategy),
                request,
                targetStates);
    }

    // Helper method to create a new Waiter for ComputeCluster.
    private com.oracle.bmc.waiter.Waiter<GetComputeClusterRequest, GetComputeClusterResponse>
            forComputeCluster(
                    com.oracle.bmc.waiter.BmcGenericWaiter waiter,
                    final GetComputeClusterRequest request,
                    final com.oracle.bmc.core.model.ComputeCluster.LifecycleState... targetStates) {
        final java.util.Set<com.oracle.bmc.core.model.ComputeCluster.LifecycleState>
                targetStatesSet = new java.util.HashSet<>(java.util.Arrays.asList(targetStates));

        return new com.oracle.bmc.waiter.internal.SimpleWaiterImpl<>(
                executorService,
                waiter.toCallable(
                        () -> request,
                        new java.util.function.Function<
                                GetComputeClusterRequest, GetComputeClusterResponse>() {
                            @Override
                            public GetComputeClusterResponse apply(
                                    GetComputeClusterRequest request) {
                                return client.getComputeCluster(request);
                            }
                        },
                        new java.util.function.Predicate<GetComputeClusterResponse>() {
                            @Override
                            public boolean test(GetComputeClusterResponse response) {
                                return targetStatesSet.contains(
                                        response.getComputeCluster().getLifecycleState());
                            }
                        },
                        targetStatesSet.contains(
                                com.oracle.bmc.core.model.ComputeCluster.LifecycleState.Deleted)),
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
                    GetComputeGpuMemoryClusterRequest, GetComputeGpuMemoryClusterResponse>
            forComputeGpuMemoryCluster(
                    GetComputeGpuMemoryClusterRequest request,
                    com.oracle.bmc.core.model.ComputeGpuMemoryCluster.LifecycleState...
                            targetStates) {
        com.oracle.bmc.util.internal.Validate.notEmpty(
                targetStates, "At least one targetState must be provided");
        com.oracle.bmc.util.internal.Validate.noNullElements(
                targetStates, "Null targetState values are not permitted");

        return forComputeGpuMemoryCluster(
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
                    GetComputeGpuMemoryClusterRequest, GetComputeGpuMemoryClusterResponse>
            forComputeGpuMemoryCluster(
                    GetComputeGpuMemoryClusterRequest request,
                    com.oracle.bmc.core.model.ComputeGpuMemoryCluster.LifecycleState targetState,
                    com.oracle.bmc.waiter.TerminationStrategy terminationStrategy,
                    com.oracle.bmc.waiter.DelayStrategy delayStrategy) {
        com.oracle.bmc.util.internal.Validate.notNull(
                targetState, "The targetState cannot be null");

        return forComputeGpuMemoryCluster(
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
                    GetComputeGpuMemoryClusterRequest, GetComputeGpuMemoryClusterResponse>
            forComputeGpuMemoryCluster(
                    GetComputeGpuMemoryClusterRequest request,
                    com.oracle.bmc.waiter.TerminationStrategy terminationStrategy,
                    com.oracle.bmc.waiter.DelayStrategy delayStrategy,
                    com.oracle.bmc.core.model.ComputeGpuMemoryCluster.LifecycleState...
                            targetStates) {
        com.oracle.bmc.util.internal.Validate.notEmpty(
                targetStates, "At least one target state must be provided");
        com.oracle.bmc.util.internal.Validate.noNullElements(
                targetStates, "Null target states are not permitted");

        return forComputeGpuMemoryCluster(
                com.oracle.bmc.waiter.Waiters.newWaiter(terminationStrategy, delayStrategy),
                request,
                targetStates);
    }

    // Helper method to create a new Waiter for ComputeGpuMemoryCluster.
    private com.oracle.bmc.waiter.Waiter<
                    GetComputeGpuMemoryClusterRequest, GetComputeGpuMemoryClusterResponse>
            forComputeGpuMemoryCluster(
                    com.oracle.bmc.waiter.BmcGenericWaiter waiter,
                    final GetComputeGpuMemoryClusterRequest request,
                    final com.oracle.bmc.core.model.ComputeGpuMemoryCluster.LifecycleState...
                            targetStates) {
        final java.util.Set<com.oracle.bmc.core.model.ComputeGpuMemoryCluster.LifecycleState>
                targetStatesSet = new java.util.HashSet<>(java.util.Arrays.asList(targetStates));

        return new com.oracle.bmc.waiter.internal.SimpleWaiterImpl<>(
                executorService,
                waiter.toCallable(
                        () -> request,
                        new java.util.function.Function<
                                GetComputeGpuMemoryClusterRequest,
                                GetComputeGpuMemoryClusterResponse>() {
                            @Override
                            public GetComputeGpuMemoryClusterResponse apply(
                                    GetComputeGpuMemoryClusterRequest request) {
                                return client.getComputeGpuMemoryCluster(request);
                            }
                        },
                        new java.util.function.Predicate<GetComputeGpuMemoryClusterResponse>() {
                            @Override
                            public boolean test(GetComputeGpuMemoryClusterResponse response) {
                                return targetStatesSet.contains(
                                        response.getComputeGpuMemoryCluster().getLifecycleState());
                            }
                        },
                        targetStatesSet.contains(
                                com.oracle.bmc.core.model.ComputeGpuMemoryCluster.LifecycleState
                                        .Deleted)),
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
                    GetComputeGpuMemoryFabricRequest, GetComputeGpuMemoryFabricResponse>
            forComputeGpuMemoryFabric(
                    GetComputeGpuMemoryFabricRequest request,
                    com.oracle.bmc.core.model.ComputeGpuMemoryFabric.LifecycleState...
                            targetStates) {
        com.oracle.bmc.util.internal.Validate.notEmpty(
                targetStates, "At least one targetState must be provided");
        com.oracle.bmc.util.internal.Validate.noNullElements(
                targetStates, "Null targetState values are not permitted");

        return forComputeGpuMemoryFabric(
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
                    GetComputeGpuMemoryFabricRequest, GetComputeGpuMemoryFabricResponse>
            forComputeGpuMemoryFabric(
                    GetComputeGpuMemoryFabricRequest request,
                    com.oracle.bmc.core.model.ComputeGpuMemoryFabric.LifecycleState targetState,
                    com.oracle.bmc.waiter.TerminationStrategy terminationStrategy,
                    com.oracle.bmc.waiter.DelayStrategy delayStrategy) {
        com.oracle.bmc.util.internal.Validate.notNull(
                targetState, "The targetState cannot be null");

        return forComputeGpuMemoryFabric(
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
                    GetComputeGpuMemoryFabricRequest, GetComputeGpuMemoryFabricResponse>
            forComputeGpuMemoryFabric(
                    GetComputeGpuMemoryFabricRequest request,
                    com.oracle.bmc.waiter.TerminationStrategy terminationStrategy,
                    com.oracle.bmc.waiter.DelayStrategy delayStrategy,
                    com.oracle.bmc.core.model.ComputeGpuMemoryFabric.LifecycleState...
                            targetStates) {
        com.oracle.bmc.util.internal.Validate.notEmpty(
                targetStates, "At least one target state must be provided");
        com.oracle.bmc.util.internal.Validate.noNullElements(
                targetStates, "Null target states are not permitted");

        return forComputeGpuMemoryFabric(
                com.oracle.bmc.waiter.Waiters.newWaiter(terminationStrategy, delayStrategy),
                request,
                targetStates);
    }

    // Helper method to create a new Waiter for ComputeGpuMemoryFabric.
    private com.oracle.bmc.waiter.Waiter<
                    GetComputeGpuMemoryFabricRequest, GetComputeGpuMemoryFabricResponse>
            forComputeGpuMemoryFabric(
                    com.oracle.bmc.waiter.BmcGenericWaiter waiter,
                    final GetComputeGpuMemoryFabricRequest request,
                    final com.oracle.bmc.core.model.ComputeGpuMemoryFabric.LifecycleState...
                            targetStates) {
        final java.util.Set<com.oracle.bmc.core.model.ComputeGpuMemoryFabric.LifecycleState>
                targetStatesSet = new java.util.HashSet<>(java.util.Arrays.asList(targetStates));

        return new com.oracle.bmc.waiter.internal.SimpleWaiterImpl<>(
                executorService,
                waiter.toCallable(
                        () -> request,
                        new java.util.function.Function<
                                GetComputeGpuMemoryFabricRequest,
                                GetComputeGpuMemoryFabricResponse>() {
                            @Override
                            public GetComputeGpuMemoryFabricResponse apply(
                                    GetComputeGpuMemoryFabricRequest request) {
                                return client.getComputeGpuMemoryFabric(request);
                            }
                        },
                        new java.util.function.Predicate<GetComputeGpuMemoryFabricResponse>() {
                            @Override
                            public boolean test(GetComputeGpuMemoryFabricResponse response) {
                                return targetStatesSet.contains(
                                        response.getComputeGpuMemoryFabric().getLifecycleState());
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
    public com.oracle.bmc.waiter.Waiter<GetConsoleHistoryRequest, GetConsoleHistoryResponse>
            forConsoleHistory(
                    GetConsoleHistoryRequest request,
                    com.oracle.bmc.core.model.ConsoleHistory.LifecycleState... targetStates) {
        com.oracle.bmc.util.internal.Validate.notEmpty(
                targetStates, "At least one targetState must be provided");
        com.oracle.bmc.util.internal.Validate.noNullElements(
                targetStates, "Null targetState values are not permitted");

        return forConsoleHistory(
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
    public com.oracle.bmc.waiter.Waiter<GetConsoleHistoryRequest, GetConsoleHistoryResponse>
            forConsoleHistory(
                    GetConsoleHistoryRequest request,
                    com.oracle.bmc.core.model.ConsoleHistory.LifecycleState targetState,
                    com.oracle.bmc.waiter.TerminationStrategy terminationStrategy,
                    com.oracle.bmc.waiter.DelayStrategy delayStrategy) {
        com.oracle.bmc.util.internal.Validate.notNull(
                targetState, "The targetState cannot be null");

        return forConsoleHistory(
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
    public com.oracle.bmc.waiter.Waiter<GetConsoleHistoryRequest, GetConsoleHistoryResponse>
            forConsoleHistory(
                    GetConsoleHistoryRequest request,
                    com.oracle.bmc.waiter.TerminationStrategy terminationStrategy,
                    com.oracle.bmc.waiter.DelayStrategy delayStrategy,
                    com.oracle.bmc.core.model.ConsoleHistory.LifecycleState... targetStates) {
        com.oracle.bmc.util.internal.Validate.notEmpty(
                targetStates, "At least one target state must be provided");
        com.oracle.bmc.util.internal.Validate.noNullElements(
                targetStates, "Null target states are not permitted");

        return forConsoleHistory(
                com.oracle.bmc.waiter.Waiters.newWaiter(terminationStrategy, delayStrategy),
                request,
                targetStates);
    }

    // Helper method to create a new Waiter for ConsoleHistory.
    private com.oracle.bmc.waiter.Waiter<GetConsoleHistoryRequest, GetConsoleHistoryResponse>
            forConsoleHistory(
                    com.oracle.bmc.waiter.BmcGenericWaiter waiter,
                    final GetConsoleHistoryRequest request,
                    final com.oracle.bmc.core.model.ConsoleHistory.LifecycleState... targetStates) {
        final java.util.Set<com.oracle.bmc.core.model.ConsoleHistory.LifecycleState>
                targetStatesSet = new java.util.HashSet<>(java.util.Arrays.asList(targetStates));

        return new com.oracle.bmc.waiter.internal.SimpleWaiterImpl<>(
                executorService,
                waiter.toCallable(
                        () -> request,
                        new java.util.function.Function<
                                GetConsoleHistoryRequest, GetConsoleHistoryResponse>() {
                            @Override
                            public GetConsoleHistoryResponse apply(
                                    GetConsoleHistoryRequest request) {
                                return client.getConsoleHistory(request);
                            }
                        },
                        new java.util.function.Predicate<GetConsoleHistoryResponse>() {
                            @Override
                            public boolean test(GetConsoleHistoryResponse response) {
                                return targetStatesSet.contains(
                                        response.getConsoleHistory().getLifecycleState());
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
    public com.oracle.bmc.waiter.Waiter<GetDedicatedVmHostRequest, GetDedicatedVmHostResponse>
            forDedicatedVmHost(
                    GetDedicatedVmHostRequest request,
                    com.oracle.bmc.core.model.DedicatedVmHost.LifecycleState... targetStates) {
        com.oracle.bmc.util.internal.Validate.notEmpty(
                targetStates, "At least one targetState must be provided");
        com.oracle.bmc.util.internal.Validate.noNullElements(
                targetStates, "Null targetState values are not permitted");

        return forDedicatedVmHost(
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
    public com.oracle.bmc.waiter.Waiter<GetDedicatedVmHostRequest, GetDedicatedVmHostResponse>
            forDedicatedVmHost(
                    GetDedicatedVmHostRequest request,
                    com.oracle.bmc.core.model.DedicatedVmHost.LifecycleState targetState,
                    com.oracle.bmc.waiter.TerminationStrategy terminationStrategy,
                    com.oracle.bmc.waiter.DelayStrategy delayStrategy) {
        com.oracle.bmc.util.internal.Validate.notNull(
                targetState, "The targetState cannot be null");

        return forDedicatedVmHost(
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
    public com.oracle.bmc.waiter.Waiter<GetDedicatedVmHostRequest, GetDedicatedVmHostResponse>
            forDedicatedVmHost(
                    GetDedicatedVmHostRequest request,
                    com.oracle.bmc.waiter.TerminationStrategy terminationStrategy,
                    com.oracle.bmc.waiter.DelayStrategy delayStrategy,
                    com.oracle.bmc.core.model.DedicatedVmHost.LifecycleState... targetStates) {
        com.oracle.bmc.util.internal.Validate.notEmpty(
                targetStates, "At least one target state must be provided");
        com.oracle.bmc.util.internal.Validate.noNullElements(
                targetStates, "Null target states are not permitted");

        return forDedicatedVmHost(
                com.oracle.bmc.waiter.Waiters.newWaiter(terminationStrategy, delayStrategy),
                request,
                targetStates);
    }

    // Helper method to create a new Waiter for DedicatedVmHost.
    private com.oracle.bmc.waiter.Waiter<GetDedicatedVmHostRequest, GetDedicatedVmHostResponse>
            forDedicatedVmHost(
                    com.oracle.bmc.waiter.BmcGenericWaiter waiter,
                    final GetDedicatedVmHostRequest request,
                    final com.oracle.bmc.core.model.DedicatedVmHost.LifecycleState...
                            targetStates) {
        final java.util.Set<com.oracle.bmc.core.model.DedicatedVmHost.LifecycleState>
                targetStatesSet = new java.util.HashSet<>(java.util.Arrays.asList(targetStates));

        return new com.oracle.bmc.waiter.internal.SimpleWaiterImpl<>(
                executorService,
                waiter.toCallable(
                        () -> request,
                        new java.util.function.Function<
                                GetDedicatedVmHostRequest, GetDedicatedVmHostResponse>() {
                            @Override
                            public GetDedicatedVmHostResponse apply(
                                    GetDedicatedVmHostRequest request) {
                                return client.getDedicatedVmHost(request);
                            }
                        },
                        new java.util.function.Predicate<GetDedicatedVmHostResponse>() {
                            @Override
                            public boolean test(GetDedicatedVmHostResponse response) {
                                return targetStatesSet.contains(
                                        response.getDedicatedVmHost().getLifecycleState());
                            }
                        },
                        targetStatesSet.contains(
                                com.oracle.bmc.core.model.DedicatedVmHost.LifecycleState.Deleted)),
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
    public com.oracle.bmc.waiter.Waiter<GetImageRequest, GetImageResponse> forImage(
            GetImageRequest request,
            com.oracle.bmc.core.model.Image.LifecycleState... targetStates) {
        com.oracle.bmc.util.internal.Validate.notEmpty(
                targetStates, "At least one targetState must be provided");
        com.oracle.bmc.util.internal.Validate.noNullElements(
                targetStates, "Null targetState values are not permitted");

        return forImage(
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
    public com.oracle.bmc.waiter.Waiter<GetImageRequest, GetImageResponse> forImage(
            GetImageRequest request,
            com.oracle.bmc.core.model.Image.LifecycleState targetState,
            com.oracle.bmc.waiter.TerminationStrategy terminationStrategy,
            com.oracle.bmc.waiter.DelayStrategy delayStrategy) {
        com.oracle.bmc.util.internal.Validate.notNull(
                targetState, "The targetState cannot be null");

        return forImage(
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
    public com.oracle.bmc.waiter.Waiter<GetImageRequest, GetImageResponse> forImage(
            GetImageRequest request,
            com.oracle.bmc.waiter.TerminationStrategy terminationStrategy,
            com.oracle.bmc.waiter.DelayStrategy delayStrategy,
            com.oracle.bmc.core.model.Image.LifecycleState... targetStates) {
        com.oracle.bmc.util.internal.Validate.notEmpty(
                targetStates, "At least one target state must be provided");
        com.oracle.bmc.util.internal.Validate.noNullElements(
                targetStates, "Null target states are not permitted");

        return forImage(
                com.oracle.bmc.waiter.Waiters.newWaiter(terminationStrategy, delayStrategy),
                request,
                targetStates);
    }

    // Helper method to create a new Waiter for Image.
    private com.oracle.bmc.waiter.Waiter<GetImageRequest, GetImageResponse> forImage(
            com.oracle.bmc.waiter.BmcGenericWaiter waiter,
            final GetImageRequest request,
            final com.oracle.bmc.core.model.Image.LifecycleState... targetStates) {
        final java.util.Set<com.oracle.bmc.core.model.Image.LifecycleState> targetStatesSet =
                new java.util.HashSet<>(java.util.Arrays.asList(targetStates));

        return new com.oracle.bmc.waiter.internal.SimpleWaiterImpl<>(
                executorService,
                waiter.toCallable(
                        () -> request,
                        new java.util.function.Function<GetImageRequest, GetImageResponse>() {
                            @Override
                            public GetImageResponse apply(GetImageRequest request) {
                                return client.getImage(request);
                            }
                        },
                        new java.util.function.Predicate<GetImageResponse>() {
                            @Override
                            public boolean test(GetImageResponse response) {
                                return targetStatesSet.contains(
                                        response.getImage().getLifecycleState());
                            }
                        },
                        targetStatesSet.contains(
                                com.oracle.bmc.core.model.Image.LifecycleState.Deleted)),
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
    public com.oracle.bmc.waiter.Waiter<GetInstanceRequest, GetInstanceResponse> forInstance(
            GetInstanceRequest request,
            com.oracle.bmc.core.model.Instance.LifecycleState... targetStates) {
        com.oracle.bmc.util.internal.Validate.notEmpty(
                targetStates, "At least one targetState must be provided");
        com.oracle.bmc.util.internal.Validate.noNullElements(
                targetStates, "Null targetState values are not permitted");

        return forInstance(
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
    public com.oracle.bmc.waiter.Waiter<GetInstanceRequest, GetInstanceResponse> forInstance(
            GetInstanceRequest request,
            com.oracle.bmc.core.model.Instance.LifecycleState targetState,
            com.oracle.bmc.waiter.TerminationStrategy terminationStrategy,
            com.oracle.bmc.waiter.DelayStrategy delayStrategy) {
        com.oracle.bmc.util.internal.Validate.notNull(
                targetState, "The targetState cannot be null");

        return forInstance(
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
    public com.oracle.bmc.waiter.Waiter<GetInstanceRequest, GetInstanceResponse> forInstance(
            GetInstanceRequest request,
            com.oracle.bmc.waiter.TerminationStrategy terminationStrategy,
            com.oracle.bmc.waiter.DelayStrategy delayStrategy,
            com.oracle.bmc.core.model.Instance.LifecycleState... targetStates) {
        com.oracle.bmc.util.internal.Validate.notEmpty(
                targetStates, "At least one target state must be provided");
        com.oracle.bmc.util.internal.Validate.noNullElements(
                targetStates, "Null target states are not permitted");

        return forInstance(
                com.oracle.bmc.waiter.Waiters.newWaiter(terminationStrategy, delayStrategy),
                request,
                targetStates);
    }

    // Helper method to create a new Waiter for Instance.
    private com.oracle.bmc.waiter.Waiter<GetInstanceRequest, GetInstanceResponse> forInstance(
            com.oracle.bmc.waiter.BmcGenericWaiter waiter,
            final GetInstanceRequest request,
            final com.oracle.bmc.core.model.Instance.LifecycleState... targetStates) {
        final java.util.Set<com.oracle.bmc.core.model.Instance.LifecycleState> targetStatesSet =
                new java.util.HashSet<>(java.util.Arrays.asList(targetStates));

        return new com.oracle.bmc.waiter.internal.SimpleWaiterImpl<>(
                executorService,
                waiter.toCallable(
                        () -> request,
                        new java.util.function.Function<GetInstanceRequest, GetInstanceResponse>() {
                            @Override
                            public GetInstanceResponse apply(GetInstanceRequest request) {
                                return client.getInstance(request);
                            }
                        },
                        new java.util.function.Predicate<GetInstanceResponse>() {
                            @Override
                            public boolean test(GetInstanceResponse response) {
                                return targetStatesSet.contains(
                                        response.getInstance().getLifecycleState());
                            }
                        },
                        targetStatesSet.contains(
                                com.oracle.bmc.core.model.Instance.LifecycleState.Terminated)),
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
                    GetInstanceConsoleConnectionRequest, GetInstanceConsoleConnectionResponse>
            forInstanceConsoleConnection(
                    GetInstanceConsoleConnectionRequest request,
                    com.oracle.bmc.core.model.InstanceConsoleConnection.LifecycleState...
                            targetStates) {
        com.oracle.bmc.util.internal.Validate.notEmpty(
                targetStates, "At least one targetState must be provided");
        com.oracle.bmc.util.internal.Validate.noNullElements(
                targetStates, "Null targetState values are not permitted");

        return forInstanceConsoleConnection(
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
                    GetInstanceConsoleConnectionRequest, GetInstanceConsoleConnectionResponse>
            forInstanceConsoleConnection(
                    GetInstanceConsoleConnectionRequest request,
                    com.oracle.bmc.core.model.InstanceConsoleConnection.LifecycleState targetState,
                    com.oracle.bmc.waiter.TerminationStrategy terminationStrategy,
                    com.oracle.bmc.waiter.DelayStrategy delayStrategy) {
        com.oracle.bmc.util.internal.Validate.notNull(
                targetState, "The targetState cannot be null");

        return forInstanceConsoleConnection(
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
                    GetInstanceConsoleConnectionRequest, GetInstanceConsoleConnectionResponse>
            forInstanceConsoleConnection(
                    GetInstanceConsoleConnectionRequest request,
                    com.oracle.bmc.waiter.TerminationStrategy terminationStrategy,
                    com.oracle.bmc.waiter.DelayStrategy delayStrategy,
                    com.oracle.bmc.core.model.InstanceConsoleConnection.LifecycleState...
                            targetStates) {
        com.oracle.bmc.util.internal.Validate.notEmpty(
                targetStates, "At least one target state must be provided");
        com.oracle.bmc.util.internal.Validate.noNullElements(
                targetStates, "Null target states are not permitted");

        return forInstanceConsoleConnection(
                com.oracle.bmc.waiter.Waiters.newWaiter(terminationStrategy, delayStrategy),
                request,
                targetStates);
    }

    // Helper method to create a new Waiter for InstanceConsoleConnection.
    private com.oracle.bmc.waiter.Waiter<
                    GetInstanceConsoleConnectionRequest, GetInstanceConsoleConnectionResponse>
            forInstanceConsoleConnection(
                    com.oracle.bmc.waiter.BmcGenericWaiter waiter,
                    final GetInstanceConsoleConnectionRequest request,
                    final com.oracle.bmc.core.model.InstanceConsoleConnection.LifecycleState...
                            targetStates) {
        final java.util.Set<com.oracle.bmc.core.model.InstanceConsoleConnection.LifecycleState>
                targetStatesSet = new java.util.HashSet<>(java.util.Arrays.asList(targetStates));

        return new com.oracle.bmc.waiter.internal.SimpleWaiterImpl<>(
                executorService,
                waiter.toCallable(
                        () -> request,
                        new java.util.function.Function<
                                GetInstanceConsoleConnectionRequest,
                                GetInstanceConsoleConnectionResponse>() {
                            @Override
                            public GetInstanceConsoleConnectionResponse apply(
                                    GetInstanceConsoleConnectionRequest request) {
                                return client.getInstanceConsoleConnection(request);
                            }
                        },
                        new java.util.function.Predicate<GetInstanceConsoleConnectionResponse>() {
                            @Override
                            public boolean test(GetInstanceConsoleConnectionResponse response) {
                                return targetStatesSet.contains(
                                        response.getInstanceConsoleConnection()
                                                .getLifecycleState());
                            }
                        },
                        targetStatesSet.contains(
                                com.oracle.bmc.core.model.InstanceConsoleConnection.LifecycleState
                                        .Deleted)),
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
                    GetInstanceMaintenanceEventRequest, GetInstanceMaintenanceEventResponse>
            forInstanceMaintenanceEvent(
                    GetInstanceMaintenanceEventRequest request,
                    com.oracle.bmc.core.model.InstanceMaintenanceEvent.LifecycleState...
                            targetStates) {
        com.oracle.bmc.util.internal.Validate.notEmpty(
                targetStates, "At least one targetState must be provided");
        com.oracle.bmc.util.internal.Validate.noNullElements(
                targetStates, "Null targetState values are not permitted");

        return forInstanceMaintenanceEvent(
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
                    GetInstanceMaintenanceEventRequest, GetInstanceMaintenanceEventResponse>
            forInstanceMaintenanceEvent(
                    GetInstanceMaintenanceEventRequest request,
                    com.oracle.bmc.core.model.InstanceMaintenanceEvent.LifecycleState targetState,
                    com.oracle.bmc.waiter.TerminationStrategy terminationStrategy,
                    com.oracle.bmc.waiter.DelayStrategy delayStrategy) {
        com.oracle.bmc.util.internal.Validate.notNull(
                targetState, "The targetState cannot be null");

        return forInstanceMaintenanceEvent(
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
                    GetInstanceMaintenanceEventRequest, GetInstanceMaintenanceEventResponse>
            forInstanceMaintenanceEvent(
                    GetInstanceMaintenanceEventRequest request,
                    com.oracle.bmc.waiter.TerminationStrategy terminationStrategy,
                    com.oracle.bmc.waiter.DelayStrategy delayStrategy,
                    com.oracle.bmc.core.model.InstanceMaintenanceEvent.LifecycleState...
                            targetStates) {
        com.oracle.bmc.util.internal.Validate.notEmpty(
                targetStates, "At least one target state must be provided");
        com.oracle.bmc.util.internal.Validate.noNullElements(
                targetStates, "Null target states are not permitted");

        return forInstanceMaintenanceEvent(
                com.oracle.bmc.waiter.Waiters.newWaiter(terminationStrategy, delayStrategy),
                request,
                targetStates);
    }

    // Helper method to create a new Waiter for InstanceMaintenanceEvent.
    private com.oracle.bmc.waiter.Waiter<
                    GetInstanceMaintenanceEventRequest, GetInstanceMaintenanceEventResponse>
            forInstanceMaintenanceEvent(
                    com.oracle.bmc.waiter.BmcGenericWaiter waiter,
                    final GetInstanceMaintenanceEventRequest request,
                    final com.oracle.bmc.core.model.InstanceMaintenanceEvent.LifecycleState...
                            targetStates) {
        final java.util.Set<com.oracle.bmc.core.model.InstanceMaintenanceEvent.LifecycleState>
                targetStatesSet = new java.util.HashSet<>(java.util.Arrays.asList(targetStates));

        return new com.oracle.bmc.waiter.internal.SimpleWaiterImpl<>(
                executorService,
                waiter.toCallable(
                        () -> request,
                        new java.util.function.Function<
                                GetInstanceMaintenanceEventRequest,
                                GetInstanceMaintenanceEventResponse>() {
                            @Override
                            public GetInstanceMaintenanceEventResponse apply(
                                    GetInstanceMaintenanceEventRequest request) {
                                return client.getInstanceMaintenanceEvent(request);
                            }
                        },
                        new java.util.function.Predicate<GetInstanceMaintenanceEventResponse>() {
                            @Override
                            public boolean test(GetInstanceMaintenanceEventResponse response) {
                                return targetStatesSet.contains(
                                        response.getInstanceMaintenanceEvent().getLifecycleState());
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
    public com.oracle.bmc.waiter.Waiter<GetVnicAttachmentRequest, GetVnicAttachmentResponse>
            forVnicAttachment(
                    GetVnicAttachmentRequest request,
                    com.oracle.bmc.core.model.VnicAttachment.LifecycleState... targetStates) {
        com.oracle.bmc.util.internal.Validate.notEmpty(
                targetStates, "At least one targetState must be provided");
        com.oracle.bmc.util.internal.Validate.noNullElements(
                targetStates, "Null targetState values are not permitted");

        return forVnicAttachment(
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
    public com.oracle.bmc.waiter.Waiter<GetVnicAttachmentRequest, GetVnicAttachmentResponse>
            forVnicAttachment(
                    GetVnicAttachmentRequest request,
                    com.oracle.bmc.core.model.VnicAttachment.LifecycleState targetState,
                    com.oracle.bmc.waiter.TerminationStrategy terminationStrategy,
                    com.oracle.bmc.waiter.DelayStrategy delayStrategy) {
        com.oracle.bmc.util.internal.Validate.notNull(
                targetState, "The targetState cannot be null");

        return forVnicAttachment(
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
    public com.oracle.bmc.waiter.Waiter<GetVnicAttachmentRequest, GetVnicAttachmentResponse>
            forVnicAttachment(
                    GetVnicAttachmentRequest request,
                    com.oracle.bmc.waiter.TerminationStrategy terminationStrategy,
                    com.oracle.bmc.waiter.DelayStrategy delayStrategy,
                    com.oracle.bmc.core.model.VnicAttachment.LifecycleState... targetStates) {
        com.oracle.bmc.util.internal.Validate.notEmpty(
                targetStates, "At least one target state must be provided");
        com.oracle.bmc.util.internal.Validate.noNullElements(
                targetStates, "Null target states are not permitted");

        return forVnicAttachment(
                com.oracle.bmc.waiter.Waiters.newWaiter(terminationStrategy, delayStrategy),
                request,
                targetStates);
    }

    // Helper method to create a new Waiter for VnicAttachment.
    private com.oracle.bmc.waiter.Waiter<GetVnicAttachmentRequest, GetVnicAttachmentResponse>
            forVnicAttachment(
                    com.oracle.bmc.waiter.BmcGenericWaiter waiter,
                    final GetVnicAttachmentRequest request,
                    final com.oracle.bmc.core.model.VnicAttachment.LifecycleState... targetStates) {
        final java.util.Set<com.oracle.bmc.core.model.VnicAttachment.LifecycleState>
                targetStatesSet = new java.util.HashSet<>(java.util.Arrays.asList(targetStates));

        return new com.oracle.bmc.waiter.internal.SimpleWaiterImpl<>(
                executorService,
                waiter.toCallable(
                        () -> request,
                        new java.util.function.Function<
                                GetVnicAttachmentRequest, GetVnicAttachmentResponse>() {
                            @Override
                            public GetVnicAttachmentResponse apply(
                                    GetVnicAttachmentRequest request) {
                                return client.getVnicAttachment(request);
                            }
                        },
                        new java.util.function.Predicate<GetVnicAttachmentResponse>() {
                            @Override
                            public boolean test(GetVnicAttachmentResponse response) {
                                return targetStatesSet.contains(
                                        response.getVnicAttachment().getLifecycleState());
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
    public com.oracle.bmc.waiter.Waiter<GetVolumeAttachmentRequest, GetVolumeAttachmentResponse>
            forVolumeAttachment(
                    GetVolumeAttachmentRequest request,
                    com.oracle.bmc.core.model.VolumeAttachment.LifecycleState... targetStates) {
        com.oracle.bmc.util.internal.Validate.notEmpty(
                targetStates, "At least one targetState must be provided");
        com.oracle.bmc.util.internal.Validate.noNullElements(
                targetStates, "Null targetState values are not permitted");

        return forVolumeAttachment(
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
    public com.oracle.bmc.waiter.Waiter<GetVolumeAttachmentRequest, GetVolumeAttachmentResponse>
            forVolumeAttachment(
                    GetVolumeAttachmentRequest request,
                    com.oracle.bmc.core.model.VolumeAttachment.LifecycleState targetState,
                    com.oracle.bmc.waiter.TerminationStrategy terminationStrategy,
                    com.oracle.bmc.waiter.DelayStrategy delayStrategy) {
        com.oracle.bmc.util.internal.Validate.notNull(
                targetState, "The targetState cannot be null");

        return forVolumeAttachment(
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
    public com.oracle.bmc.waiter.Waiter<GetVolumeAttachmentRequest, GetVolumeAttachmentResponse>
            forVolumeAttachment(
                    GetVolumeAttachmentRequest request,
                    com.oracle.bmc.waiter.TerminationStrategy terminationStrategy,
                    com.oracle.bmc.waiter.DelayStrategy delayStrategy,
                    com.oracle.bmc.core.model.VolumeAttachment.LifecycleState... targetStates) {
        com.oracle.bmc.util.internal.Validate.notEmpty(
                targetStates, "At least one target state must be provided");
        com.oracle.bmc.util.internal.Validate.noNullElements(
                targetStates, "Null target states are not permitted");

        return forVolumeAttachment(
                com.oracle.bmc.waiter.Waiters.newWaiter(terminationStrategy, delayStrategy),
                request,
                targetStates);
    }

    // Helper method to create a new Waiter for VolumeAttachment.
    private com.oracle.bmc.waiter.Waiter<GetVolumeAttachmentRequest, GetVolumeAttachmentResponse>
            forVolumeAttachment(
                    com.oracle.bmc.waiter.BmcGenericWaiter waiter,
                    final GetVolumeAttachmentRequest request,
                    final com.oracle.bmc.core.model.VolumeAttachment.LifecycleState...
                            targetStates) {
        final java.util.Set<com.oracle.bmc.core.model.VolumeAttachment.LifecycleState>
                targetStatesSet = new java.util.HashSet<>(java.util.Arrays.asList(targetStates));

        return new com.oracle.bmc.waiter.internal.SimpleWaiterImpl<>(
                executorService,
                waiter.toCallable(
                        () -> request,
                        new java.util.function.Function<
                                GetVolumeAttachmentRequest, GetVolumeAttachmentResponse>() {
                            @Override
                            public GetVolumeAttachmentResponse apply(
                                    GetVolumeAttachmentRequest request) {
                                return client.getVolumeAttachment(request);
                            }
                        },
                        new java.util.function.Predicate<GetVolumeAttachmentResponse>() {
                            @Override
                            public boolean test(GetVolumeAttachmentResponse response) {
                                return targetStatesSet.contains(
                                        response.getVolumeAttachment().getLifecycleState());
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
    public com.oracle.bmc.waiter.Waiter<LaunchInstanceRequest, LaunchInstanceResponse>
            forLaunchInstance(LaunchInstanceRequest request) {
        return forLaunchInstance(
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
    public com.oracle.bmc.waiter.Waiter<LaunchInstanceRequest, LaunchInstanceResponse>
            forLaunchInstance(
                    LaunchInstanceRequest request,
                    com.oracle.bmc.waiter.TerminationStrategy terminationStrategy,
                    com.oracle.bmc.waiter.DelayStrategy delayStrategy) {
        if (workRequestClient == null) {
            throw new IllegalStateException(
                    "A WorkRequestClient must be supplied to this waiter for this operation");
        }

        return new com.oracle.bmc.waiter.internal.SimpleWaiterImpl<>(
                executorService,
                new java.util.concurrent.Callable<LaunchInstanceResponse>() {
                    @Override
                    public LaunchInstanceResponse call() throws Exception {
                        final LaunchInstanceResponse response = client.launchInstance(request);

                        if (response.getOpcWorkRequestId() != null) {
                            final com.oracle.bmc.workrequests.requests.GetWorkRequestRequest
                                    getWorkRequestRequest =
                                            com.oracle.bmc.workrequests.requests
                                                    .GetWorkRequestRequest.builder()
                                                    .workRequestId(response.getOpcWorkRequestId())
                                                    .build();
                            workRequestClient
                                    .getWaiters()
                                    .forWorkRequest(
                                            getWorkRequestRequest,
                                            terminationStrategy,
                                            delayStrategy)
                                    .execute();
                        }
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
                    UpdateComputeCapacityReservationRequest,
                    UpdateComputeCapacityReservationResponse>
            forUpdateComputeCapacityReservation(UpdateComputeCapacityReservationRequest request) {
        return forUpdateComputeCapacityReservation(
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
                    UpdateComputeCapacityReservationRequest,
                    UpdateComputeCapacityReservationResponse>
            forUpdateComputeCapacityReservation(
                    UpdateComputeCapacityReservationRequest request,
                    com.oracle.bmc.waiter.TerminationStrategy terminationStrategy,
                    com.oracle.bmc.waiter.DelayStrategy delayStrategy) {
        if (workRequestClient == null) {
            throw new IllegalStateException(
                    "A WorkRequestClient must be supplied to this waiter for this operation");
        }

        return new com.oracle.bmc.waiter.internal.SimpleWaiterImpl<>(
                executorService,
                new java.util.concurrent.Callable<UpdateComputeCapacityReservationResponse>() {
                    @Override
                    public UpdateComputeCapacityReservationResponse call() throws Exception {
                        final UpdateComputeCapacityReservationResponse response =
                                client.updateComputeCapacityReservation(request);

                        if (response.getOpcWorkRequestId() != null) {
                            final com.oracle.bmc.workrequests.requests.GetWorkRequestRequest
                                    getWorkRequestRequest =
                                            com.oracle.bmc.workrequests.requests
                                                    .GetWorkRequestRequest.builder()
                                                    .workRequestId(response.getOpcWorkRequestId())
                                                    .build();
                            workRequestClient
                                    .getWaiters()
                                    .forWorkRequest(
                                            getWorkRequestRequest,
                                            terminationStrategy,
                                            delayStrategy)
                                    .execute();
                        }
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
                    UpdateComputeCapacityTopologyRequest, UpdateComputeCapacityTopologyResponse>
            forUpdateComputeCapacityTopology(UpdateComputeCapacityTopologyRequest request) {
        return forUpdateComputeCapacityTopology(
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
                    UpdateComputeCapacityTopologyRequest, UpdateComputeCapacityTopologyResponse>
            forUpdateComputeCapacityTopology(
                    UpdateComputeCapacityTopologyRequest request,
                    com.oracle.bmc.waiter.TerminationStrategy terminationStrategy,
                    com.oracle.bmc.waiter.DelayStrategy delayStrategy) {
        if (workRequestClient == null) {
            throw new IllegalStateException(
                    "A WorkRequestClient must be supplied to this waiter for this operation");
        }

        return new com.oracle.bmc.waiter.internal.SimpleWaiterImpl<>(
                executorService,
                new java.util.concurrent.Callable<UpdateComputeCapacityTopologyResponse>() {
                    @Override
                    public UpdateComputeCapacityTopologyResponse call() throws Exception {
                        final UpdateComputeCapacityTopologyResponse response =
                                client.updateComputeCapacityTopology(request);

                        if (response.getOpcWorkRequestId() != null) {
                            final com.oracle.bmc.workrequests.requests.GetWorkRequestRequest
                                    getWorkRequestRequest =
                                            com.oracle.bmc.workrequests.requests
                                                    .GetWorkRequestRequest.builder()
                                                    .workRequestId(response.getOpcWorkRequestId())
                                                    .build();
                            workRequestClient
                                    .getWaiters()
                                    .forWorkRequest(
                                            getWorkRequestRequest,
                                            terminationStrategy,
                                            delayStrategy)
                                    .execute();
                        }
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
                    UpdateComputeGpuMemoryClusterRequest, UpdateComputeGpuMemoryClusterResponse>
            forUpdateComputeGpuMemoryCluster(UpdateComputeGpuMemoryClusterRequest request) {
        return forUpdateComputeGpuMemoryCluster(
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
                    UpdateComputeGpuMemoryClusterRequest, UpdateComputeGpuMemoryClusterResponse>
            forUpdateComputeGpuMemoryCluster(
                    UpdateComputeGpuMemoryClusterRequest request,
                    com.oracle.bmc.waiter.TerminationStrategy terminationStrategy,
                    com.oracle.bmc.waiter.DelayStrategy delayStrategy) {
        if (workRequestClient == null) {
            throw new IllegalStateException(
                    "A WorkRequestClient must be supplied to this waiter for this operation");
        }

        return new com.oracle.bmc.waiter.internal.SimpleWaiterImpl<>(
                executorService,
                new java.util.concurrent.Callable<UpdateComputeGpuMemoryClusterResponse>() {
                    @Override
                    public UpdateComputeGpuMemoryClusterResponse call() throws Exception {
                        final UpdateComputeGpuMemoryClusterResponse response =
                                client.updateComputeGpuMemoryCluster(request);

                        if (response.getOpcWorkRequestId() != null) {
                            final com.oracle.bmc.workrequests.requests.GetWorkRequestRequest
                                    getWorkRequestRequest =
                                            com.oracle.bmc.workrequests.requests
                                                    .GetWorkRequestRequest.builder()
                                                    .workRequestId(response.getOpcWorkRequestId())
                                                    .build();
                            workRequestClient
                                    .getWaiters()
                                    .forWorkRequest(
                                            getWorkRequestRequest,
                                            terminationStrategy,
                                            delayStrategy)
                                    .execute();
                        }
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
    public com.oracle.bmc.waiter.Waiter<UpdateInstanceRequest, UpdateInstanceResponse>
            forUpdateInstance(UpdateInstanceRequest request) {
        return forUpdateInstance(
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
    public com.oracle.bmc.waiter.Waiter<UpdateInstanceRequest, UpdateInstanceResponse>
            forUpdateInstance(
                    UpdateInstanceRequest request,
                    com.oracle.bmc.waiter.TerminationStrategy terminationStrategy,
                    com.oracle.bmc.waiter.DelayStrategy delayStrategy) {
        if (workRequestClient == null) {
            throw new IllegalStateException(
                    "A WorkRequestClient must be supplied to this waiter for this operation");
        }

        return new com.oracle.bmc.waiter.internal.SimpleWaiterImpl<>(
                executorService,
                new java.util.concurrent.Callable<UpdateInstanceResponse>() {
                    @Override
                    public UpdateInstanceResponse call() throws Exception {
                        final UpdateInstanceResponse response = client.updateInstance(request);

                        if (response.getOpcWorkRequestId() != null) {
                            final com.oracle.bmc.workrequests.requests.GetWorkRequestRequest
                                    getWorkRequestRequest =
                                            com.oracle.bmc.workrequests.requests
                                                    .GetWorkRequestRequest.builder()
                                                    .workRequestId(response.getOpcWorkRequestId())
                                                    .build();
                            workRequestClient
                                    .getWaiters()
                                    .forWorkRequest(
                                            getWorkRequestRequest,
                                            terminationStrategy,
                                            delayStrategy)
                                    .execute();
                        }
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
                    UpdateInstanceMaintenanceEventRequest, UpdateInstanceMaintenanceEventResponse>
            forUpdateInstanceMaintenanceEvent(UpdateInstanceMaintenanceEventRequest request) {
        return forUpdateInstanceMaintenanceEvent(
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
                    UpdateInstanceMaintenanceEventRequest, UpdateInstanceMaintenanceEventResponse>
            forUpdateInstanceMaintenanceEvent(
                    UpdateInstanceMaintenanceEventRequest request,
                    com.oracle.bmc.waiter.TerminationStrategy terminationStrategy,
                    com.oracle.bmc.waiter.DelayStrategy delayStrategy) {
        if (workRequestClient == null) {
            throw new IllegalStateException(
                    "A WorkRequestClient must be supplied to this waiter for this operation");
        }

        return new com.oracle.bmc.waiter.internal.SimpleWaiterImpl<>(
                executorService,
                new java.util.concurrent.Callable<UpdateInstanceMaintenanceEventResponse>() {
                    @Override
                    public UpdateInstanceMaintenanceEventResponse call() throws Exception {
                        final UpdateInstanceMaintenanceEventResponse response =
                                client.updateInstanceMaintenanceEvent(request);

                        if (response.getOpcWorkRequestId() != null) {
                            final com.oracle.bmc.workrequests.requests.GetWorkRequestRequest
                                    getWorkRequestRequest =
                                            com.oracle.bmc.workrequests.requests
                                                    .GetWorkRequestRequest.builder()
                                                    .workRequestId(response.getOpcWorkRequestId())
                                                    .build();
                            workRequestClient
                                    .getWaiters()
                                    .forWorkRequest(
                                            getWorkRequestRequest,
                                            terminationStrategy,
                                            delayStrategy)
                                    .execute();
                        }
                        return response;
                    }
                },
                request);
    }
}
