/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
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
