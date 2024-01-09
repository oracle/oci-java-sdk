/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.core;

import com.oracle.bmc.core.requests.*;
import com.oracle.bmc.core.responses.*;

/**
 * Collection of helper methods to produce {@link com.oracle.bmc.waiter.Waiter}s for different
 * resources of VirtualNetwork.
 *
 * <p>The default configuration used is defined by {@link
 * com.oracle.bmc.waiter.Waiters.Waiters#DEFAULT_POLLING_WAITER}.
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20160918")
public class VirtualNetworkWaiters {
    @jakarta.annotation.Nonnull private final java.util.concurrent.ExecutorService executorService;
    @jakarta.annotation.Nonnull private final VirtualNetwork client;
    private final com.oracle.bmc.workrequests.WorkRequest workRequestClient;

    @Deprecated
    public VirtualNetworkWaiters(
            @jakarta.annotation.Nonnull java.util.concurrent.ExecutorService executorService,
            @jakarta.annotation.Nonnull VirtualNetwork client) {
        this(executorService, client, null);
    }

    public VirtualNetworkWaiters(
            @jakarta.annotation.Nonnull java.util.concurrent.ExecutorService executorService,
            @jakarta.annotation.Nonnull VirtualNetwork client,
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
    public com.oracle.bmc.waiter.Waiter<AddIpv6SubnetCidrRequest, AddIpv6SubnetCidrResponse>
            forAddIpv6SubnetCidr(AddIpv6SubnetCidrRequest request) {
        return forAddIpv6SubnetCidr(
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
    public com.oracle.bmc.waiter.Waiter<AddIpv6SubnetCidrRequest, AddIpv6SubnetCidrResponse>
            forAddIpv6SubnetCidr(
                    AddIpv6SubnetCidrRequest request,
                    com.oracle.bmc.waiter.TerminationStrategy terminationStrategy,
                    com.oracle.bmc.waiter.DelayStrategy delayStrategy) {
        if (workRequestClient == null) {
            throw new IllegalStateException(
                    "A WorkRequestClient must be supplied to this waiter for this operation");
        }

        return new com.oracle.bmc.waiter.internal.SimpleWaiterImpl<>(
                executorService,
                new java.util.concurrent.Callable<AddIpv6SubnetCidrResponse>() {
                    @Override
                    public AddIpv6SubnetCidrResponse call() throws Exception {
                        final AddIpv6SubnetCidrResponse response =
                                client.addIpv6SubnetCidr(request);

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
    public com.oracle.bmc.waiter.Waiter<AddIpv6VcnCidrRequest, AddIpv6VcnCidrResponse>
            forAddIpv6VcnCidr(AddIpv6VcnCidrRequest request) {
        return forAddIpv6VcnCidr(
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
    public com.oracle.bmc.waiter.Waiter<AddIpv6VcnCidrRequest, AddIpv6VcnCidrResponse>
            forAddIpv6VcnCidr(
                    AddIpv6VcnCidrRequest request,
                    com.oracle.bmc.waiter.TerminationStrategy terminationStrategy,
                    com.oracle.bmc.waiter.DelayStrategy delayStrategy) {
        if (workRequestClient == null) {
            throw new IllegalStateException(
                    "A WorkRequestClient must be supplied to this waiter for this operation");
        }

        return new com.oracle.bmc.waiter.internal.SimpleWaiterImpl<>(
                executorService,
                new java.util.concurrent.Callable<AddIpv6VcnCidrResponse>() {
                    @Override
                    public AddIpv6VcnCidrResponse call() throws Exception {
                        final AddIpv6VcnCidrResponse response = client.addIpv6VcnCidr(request);

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
    public com.oracle.bmc.waiter.Waiter<AddVcnCidrRequest, AddVcnCidrResponse> forAddVcnCidr(
            AddVcnCidrRequest request) {
        return forAddVcnCidr(
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
    public com.oracle.bmc.waiter.Waiter<AddVcnCidrRequest, AddVcnCidrResponse> forAddVcnCidr(
            AddVcnCidrRequest request,
            com.oracle.bmc.waiter.TerminationStrategy terminationStrategy,
            com.oracle.bmc.waiter.DelayStrategy delayStrategy) {
        if (workRequestClient == null) {
            throw new IllegalStateException(
                    "A WorkRequestClient must be supplied to this waiter for this operation");
        }

        return new com.oracle.bmc.waiter.internal.SimpleWaiterImpl<>(
                executorService,
                new java.util.concurrent.Callable<AddVcnCidrResponse>() {
                    @Override
                    public AddVcnCidrResponse call() throws Exception {
                        final AddVcnCidrResponse response = client.addVcnCidr(request);

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
                    ChangeCaptureFilterCompartmentRequest, ChangeCaptureFilterCompartmentResponse>
            forChangeCaptureFilterCompartment(ChangeCaptureFilterCompartmentRequest request) {
        return forChangeCaptureFilterCompartment(
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
                    ChangeCaptureFilterCompartmentRequest, ChangeCaptureFilterCompartmentResponse>
            forChangeCaptureFilterCompartment(
                    ChangeCaptureFilterCompartmentRequest request,
                    com.oracle.bmc.waiter.TerminationStrategy terminationStrategy,
                    com.oracle.bmc.waiter.DelayStrategy delayStrategy) {
        if (workRequestClient == null) {
            throw new IllegalStateException(
                    "A WorkRequestClient must be supplied to this waiter for this operation");
        }

        return new com.oracle.bmc.waiter.internal.SimpleWaiterImpl<>(
                executorService,
                new java.util.concurrent.Callable<ChangeCaptureFilterCompartmentResponse>() {
                    @Override
                    public ChangeCaptureFilterCompartmentResponse call() throws Exception {
                        final ChangeCaptureFilterCompartmentResponse response =
                                client.changeCaptureFilterCompartment(request);

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
    public com.oracle.bmc.waiter.Waiter<ChangeDrgCompartmentRequest, ChangeDrgCompartmentResponse>
            forChangeDrgCompartment(ChangeDrgCompartmentRequest request) {
        return forChangeDrgCompartment(
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
    public com.oracle.bmc.waiter.Waiter<ChangeDrgCompartmentRequest, ChangeDrgCompartmentResponse>
            forChangeDrgCompartment(
                    ChangeDrgCompartmentRequest request,
                    com.oracle.bmc.waiter.TerminationStrategy terminationStrategy,
                    com.oracle.bmc.waiter.DelayStrategy delayStrategy) {
        if (workRequestClient == null) {
            throw new IllegalStateException(
                    "A WorkRequestClient must be supplied to this waiter for this operation");
        }

        return new com.oracle.bmc.waiter.internal.SimpleWaiterImpl<>(
                executorService,
                new java.util.concurrent.Callable<ChangeDrgCompartmentResponse>() {
                    @Override
                    public ChangeDrgCompartmentResponse call() throws Exception {
                        final ChangeDrgCompartmentResponse response =
                                client.changeDrgCompartment(request);

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
                    ChangeSubnetCompartmentRequest, ChangeSubnetCompartmentResponse>
            forChangeSubnetCompartment(ChangeSubnetCompartmentRequest request) {
        return forChangeSubnetCompartment(
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
                    ChangeSubnetCompartmentRequest, ChangeSubnetCompartmentResponse>
            forChangeSubnetCompartment(
                    ChangeSubnetCompartmentRequest request,
                    com.oracle.bmc.waiter.TerminationStrategy terminationStrategy,
                    com.oracle.bmc.waiter.DelayStrategy delayStrategy) {
        if (workRequestClient == null) {
            throw new IllegalStateException(
                    "A WorkRequestClient must be supplied to this waiter for this operation");
        }

        return new com.oracle.bmc.waiter.internal.SimpleWaiterImpl<>(
                executorService,
                new java.util.concurrent.Callable<ChangeSubnetCompartmentResponse>() {
                    @Override
                    public ChangeSubnetCompartmentResponse call() throws Exception {
                        final ChangeSubnetCompartmentResponse response =
                                client.changeSubnetCompartment(request);

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
    public com.oracle.bmc.waiter.Waiter<ChangeVcnCompartmentRequest, ChangeVcnCompartmentResponse>
            forChangeVcnCompartment(ChangeVcnCompartmentRequest request) {
        return forChangeVcnCompartment(
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
    public com.oracle.bmc.waiter.Waiter<ChangeVcnCompartmentRequest, ChangeVcnCompartmentResponse>
            forChangeVcnCompartment(
                    ChangeVcnCompartmentRequest request,
                    com.oracle.bmc.waiter.TerminationStrategy terminationStrategy,
                    com.oracle.bmc.waiter.DelayStrategy delayStrategy) {
        if (workRequestClient == null) {
            throw new IllegalStateException(
                    "A WorkRequestClient must be supplied to this waiter for this operation");
        }

        return new com.oracle.bmc.waiter.internal.SimpleWaiterImpl<>(
                executorService,
                new java.util.concurrent.Callable<ChangeVcnCompartmentResponse>() {
                    @Override
                    public ChangeVcnCompartmentResponse call() throws Exception {
                        final ChangeVcnCompartmentResponse response =
                                client.changeVcnCompartment(request);

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
    public com.oracle.bmc.waiter.Waiter<ChangeVlanCompartmentRequest, ChangeVlanCompartmentResponse>
            forChangeVlanCompartment(ChangeVlanCompartmentRequest request) {
        return forChangeVlanCompartment(
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
    public com.oracle.bmc.waiter.Waiter<ChangeVlanCompartmentRequest, ChangeVlanCompartmentResponse>
            forChangeVlanCompartment(
                    ChangeVlanCompartmentRequest request,
                    com.oracle.bmc.waiter.TerminationStrategy terminationStrategy,
                    com.oracle.bmc.waiter.DelayStrategy delayStrategy) {
        if (workRequestClient == null) {
            throw new IllegalStateException(
                    "A WorkRequestClient must be supplied to this waiter for this operation");
        }

        return new com.oracle.bmc.waiter.internal.SimpleWaiterImpl<>(
                executorService,
                new java.util.concurrent.Callable<ChangeVlanCompartmentResponse>() {
                    @Override
                    public ChangeVlanCompartmentResponse call() throws Exception {
                        final ChangeVlanCompartmentResponse response =
                                client.changeVlanCompartment(request);

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
    public com.oracle.bmc.waiter.Waiter<ChangeVtapCompartmentRequest, ChangeVtapCompartmentResponse>
            forChangeVtapCompartment(ChangeVtapCompartmentRequest request) {
        return forChangeVtapCompartment(
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
    public com.oracle.bmc.waiter.Waiter<ChangeVtapCompartmentRequest, ChangeVtapCompartmentResponse>
            forChangeVtapCompartment(
                    ChangeVtapCompartmentRequest request,
                    com.oracle.bmc.waiter.TerminationStrategy terminationStrategy,
                    com.oracle.bmc.waiter.DelayStrategy delayStrategy) {
        if (workRequestClient == null) {
            throw new IllegalStateException(
                    "A WorkRequestClient must be supplied to this waiter for this operation");
        }

        return new com.oracle.bmc.waiter.internal.SimpleWaiterImpl<>(
                executorService,
                new java.util.concurrent.Callable<ChangeVtapCompartmentResponse>() {
                    @Override
                    public ChangeVtapCompartmentResponse call() throws Exception {
                        final ChangeVtapCompartmentResponse response =
                                client.changeVtapCompartment(request);

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
    public com.oracle.bmc.waiter.Waiter<DeleteByoipRangeRequest, DeleteByoipRangeResponse>
            forDeleteByoipRange(DeleteByoipRangeRequest request) {
        return forDeleteByoipRange(
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
    public com.oracle.bmc.waiter.Waiter<DeleteByoipRangeRequest, DeleteByoipRangeResponse>
            forDeleteByoipRange(
                    DeleteByoipRangeRequest request,
                    com.oracle.bmc.waiter.TerminationStrategy terminationStrategy,
                    com.oracle.bmc.waiter.DelayStrategy delayStrategy) {
        if (workRequestClient == null) {
            throw new IllegalStateException(
                    "A WorkRequestClient must be supplied to this waiter for this operation");
        }

        return new com.oracle.bmc.waiter.internal.SimpleWaiterImpl<>(
                executorService,
                new java.util.concurrent.Callable<DeleteByoipRangeResponse>() {
                    @Override
                    public DeleteByoipRangeResponse call() throws Exception {
                        final DeleteByoipRangeResponse response = client.deleteByoipRange(request);

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
    public com.oracle.bmc.waiter.Waiter<DeleteVtapRequest, DeleteVtapResponse> forDeleteVtap(
            DeleteVtapRequest request) {
        return forDeleteVtap(
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
    public com.oracle.bmc.waiter.Waiter<DeleteVtapRequest, DeleteVtapResponse> forDeleteVtap(
            DeleteVtapRequest request,
            com.oracle.bmc.waiter.TerminationStrategy terminationStrategy,
            com.oracle.bmc.waiter.DelayStrategy delayStrategy) {
        if (workRequestClient == null) {
            throw new IllegalStateException(
                    "A WorkRequestClient must be supplied to this waiter for this operation");
        }

        return new com.oracle.bmc.waiter.internal.SimpleWaiterImpl<>(
                executorService,
                new java.util.concurrent.Callable<DeleteVtapResponse>() {
                    @Override
                    public DeleteVtapResponse call() throws Exception {
                        final DeleteVtapResponse response = client.deleteVtap(request);

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
    public com.oracle.bmc.waiter.Waiter<GetByoipRangeRequest, GetByoipRangeResponse> forByoipRange(
            GetByoipRangeRequest request,
            com.oracle.bmc.core.model.ByoipRange.LifecycleState... targetStates) {
        com.oracle.bmc.util.internal.Validate.notEmpty(
                targetStates, "At least one targetState must be provided");
        com.oracle.bmc.util.internal.Validate.noNullElements(
                targetStates, "Null targetState values are not permitted");

        return forByoipRange(
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
    public com.oracle.bmc.waiter.Waiter<GetByoipRangeRequest, GetByoipRangeResponse> forByoipRange(
            GetByoipRangeRequest request,
            com.oracle.bmc.core.model.ByoipRange.LifecycleState targetState,
            com.oracle.bmc.waiter.TerminationStrategy terminationStrategy,
            com.oracle.bmc.waiter.DelayStrategy delayStrategy) {
        com.oracle.bmc.util.internal.Validate.notNull(
                targetState, "The targetState cannot be null");

        return forByoipRange(
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
    public com.oracle.bmc.waiter.Waiter<GetByoipRangeRequest, GetByoipRangeResponse> forByoipRange(
            GetByoipRangeRequest request,
            com.oracle.bmc.waiter.TerminationStrategy terminationStrategy,
            com.oracle.bmc.waiter.DelayStrategy delayStrategy,
            com.oracle.bmc.core.model.ByoipRange.LifecycleState... targetStates) {
        com.oracle.bmc.util.internal.Validate.notEmpty(
                targetStates, "At least one target state must be provided");
        com.oracle.bmc.util.internal.Validate.noNullElements(
                targetStates, "Null target states are not permitted");

        return forByoipRange(
                com.oracle.bmc.waiter.Waiters.newWaiter(terminationStrategy, delayStrategy),
                request,
                targetStates);
    }

    // Helper method to create a new Waiter for ByoipRange.
    private com.oracle.bmc.waiter.Waiter<GetByoipRangeRequest, GetByoipRangeResponse> forByoipRange(
            com.oracle.bmc.waiter.BmcGenericWaiter waiter,
            final GetByoipRangeRequest request,
            final com.oracle.bmc.core.model.ByoipRange.LifecycleState... targetStates) {
        final java.util.Set<com.oracle.bmc.core.model.ByoipRange.LifecycleState> targetStatesSet =
                new java.util.HashSet<>(java.util.Arrays.asList(targetStates));

        return new com.oracle.bmc.waiter.internal.SimpleWaiterImpl<>(
                executorService,
                waiter.toCallable(
                        () -> request,
                        new java.util.function.Function<
                                GetByoipRangeRequest, GetByoipRangeResponse>() {
                            @Override
                            public GetByoipRangeResponse apply(GetByoipRangeRequest request) {
                                return client.getByoipRange(request);
                            }
                        },
                        new java.util.function.Predicate<GetByoipRangeResponse>() {
                            @Override
                            public boolean test(GetByoipRangeResponse response) {
                                return targetStatesSet.contains(
                                        response.getByoipRange().getLifecycleState());
                            }
                        },
                        targetStatesSet.contains(
                                com.oracle.bmc.core.model.ByoipRange.LifecycleState.Deleted)),
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
    public com.oracle.bmc.waiter.Waiter<GetCaptureFilterRequest, GetCaptureFilterResponse>
            forCaptureFilter(
                    GetCaptureFilterRequest request,
                    com.oracle.bmc.core.model.CaptureFilter.LifecycleState... targetStates) {
        com.oracle.bmc.util.internal.Validate.notEmpty(
                targetStates, "At least one targetState must be provided");
        com.oracle.bmc.util.internal.Validate.noNullElements(
                targetStates, "Null targetState values are not permitted");

        return forCaptureFilter(
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
    public com.oracle.bmc.waiter.Waiter<GetCaptureFilterRequest, GetCaptureFilterResponse>
            forCaptureFilter(
                    GetCaptureFilterRequest request,
                    com.oracle.bmc.core.model.CaptureFilter.LifecycleState targetState,
                    com.oracle.bmc.waiter.TerminationStrategy terminationStrategy,
                    com.oracle.bmc.waiter.DelayStrategy delayStrategy) {
        com.oracle.bmc.util.internal.Validate.notNull(
                targetState, "The targetState cannot be null");

        return forCaptureFilter(
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
    public com.oracle.bmc.waiter.Waiter<GetCaptureFilterRequest, GetCaptureFilterResponse>
            forCaptureFilter(
                    GetCaptureFilterRequest request,
                    com.oracle.bmc.waiter.TerminationStrategy terminationStrategy,
                    com.oracle.bmc.waiter.DelayStrategy delayStrategy,
                    com.oracle.bmc.core.model.CaptureFilter.LifecycleState... targetStates) {
        com.oracle.bmc.util.internal.Validate.notEmpty(
                targetStates, "At least one target state must be provided");
        com.oracle.bmc.util.internal.Validate.noNullElements(
                targetStates, "Null target states are not permitted");

        return forCaptureFilter(
                com.oracle.bmc.waiter.Waiters.newWaiter(terminationStrategy, delayStrategy),
                request,
                targetStates);
    }

    // Helper method to create a new Waiter for CaptureFilter.
    private com.oracle.bmc.waiter.Waiter<GetCaptureFilterRequest, GetCaptureFilterResponse>
            forCaptureFilter(
                    com.oracle.bmc.waiter.BmcGenericWaiter waiter,
                    final GetCaptureFilterRequest request,
                    final com.oracle.bmc.core.model.CaptureFilter.LifecycleState... targetStates) {
        final java.util.Set<com.oracle.bmc.core.model.CaptureFilter.LifecycleState>
                targetStatesSet = new java.util.HashSet<>(java.util.Arrays.asList(targetStates));

        return new com.oracle.bmc.waiter.internal.SimpleWaiterImpl<>(
                executorService,
                waiter.toCallable(
                        () -> request,
                        new java.util.function.Function<
                                GetCaptureFilterRequest, GetCaptureFilterResponse>() {
                            @Override
                            public GetCaptureFilterResponse apply(GetCaptureFilterRequest request) {
                                return client.getCaptureFilter(request);
                            }
                        },
                        new java.util.function.Predicate<GetCaptureFilterResponse>() {
                            @Override
                            public boolean test(GetCaptureFilterResponse response) {
                                return targetStatesSet.contains(
                                        response.getCaptureFilter().getLifecycleState());
                            }
                        },
                        targetStatesSet.contains(
                                com.oracle.bmc.core.model.CaptureFilter.LifecycleState.Terminated)),
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
    public com.oracle.bmc.waiter.Waiter<GetCrossConnectRequest, GetCrossConnectResponse>
            forCrossConnect(
                    GetCrossConnectRequest request,
                    com.oracle.bmc.core.model.CrossConnect.LifecycleState... targetStates) {
        com.oracle.bmc.util.internal.Validate.notEmpty(
                targetStates, "At least one targetState must be provided");
        com.oracle.bmc.util.internal.Validate.noNullElements(
                targetStates, "Null targetState values are not permitted");

        return forCrossConnect(
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
    public com.oracle.bmc.waiter.Waiter<GetCrossConnectRequest, GetCrossConnectResponse>
            forCrossConnect(
                    GetCrossConnectRequest request,
                    com.oracle.bmc.core.model.CrossConnect.LifecycleState targetState,
                    com.oracle.bmc.waiter.TerminationStrategy terminationStrategy,
                    com.oracle.bmc.waiter.DelayStrategy delayStrategy) {
        com.oracle.bmc.util.internal.Validate.notNull(
                targetState, "The targetState cannot be null");

        return forCrossConnect(
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
    public com.oracle.bmc.waiter.Waiter<GetCrossConnectRequest, GetCrossConnectResponse>
            forCrossConnect(
                    GetCrossConnectRequest request,
                    com.oracle.bmc.waiter.TerminationStrategy terminationStrategy,
                    com.oracle.bmc.waiter.DelayStrategy delayStrategy,
                    com.oracle.bmc.core.model.CrossConnect.LifecycleState... targetStates) {
        com.oracle.bmc.util.internal.Validate.notEmpty(
                targetStates, "At least one target state must be provided");
        com.oracle.bmc.util.internal.Validate.noNullElements(
                targetStates, "Null target states are not permitted");

        return forCrossConnect(
                com.oracle.bmc.waiter.Waiters.newWaiter(terminationStrategy, delayStrategy),
                request,
                targetStates);
    }

    // Helper method to create a new Waiter for CrossConnect.
    private com.oracle.bmc.waiter.Waiter<GetCrossConnectRequest, GetCrossConnectResponse>
            forCrossConnect(
                    com.oracle.bmc.waiter.BmcGenericWaiter waiter,
                    final GetCrossConnectRequest request,
                    final com.oracle.bmc.core.model.CrossConnect.LifecycleState... targetStates) {
        final java.util.Set<com.oracle.bmc.core.model.CrossConnect.LifecycleState> targetStatesSet =
                new java.util.HashSet<>(java.util.Arrays.asList(targetStates));

        return new com.oracle.bmc.waiter.internal.SimpleWaiterImpl<>(
                executorService,
                waiter.toCallable(
                        () -> request,
                        new java.util.function.Function<
                                GetCrossConnectRequest, GetCrossConnectResponse>() {
                            @Override
                            public GetCrossConnectResponse apply(GetCrossConnectRequest request) {
                                return client.getCrossConnect(request);
                            }
                        },
                        new java.util.function.Predicate<GetCrossConnectResponse>() {
                            @Override
                            public boolean test(GetCrossConnectResponse response) {
                                return targetStatesSet.contains(
                                        response.getCrossConnect().getLifecycleState());
                            }
                        },
                        targetStatesSet.contains(
                                com.oracle.bmc.core.model.CrossConnect.LifecycleState.Terminated)),
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
    public com.oracle.bmc.waiter.Waiter<GetCrossConnectGroupRequest, GetCrossConnectGroupResponse>
            forCrossConnectGroup(
                    GetCrossConnectGroupRequest request,
                    com.oracle.bmc.core.model.CrossConnectGroup.LifecycleState... targetStates) {
        com.oracle.bmc.util.internal.Validate.notEmpty(
                targetStates, "At least one targetState must be provided");
        com.oracle.bmc.util.internal.Validate.noNullElements(
                targetStates, "Null targetState values are not permitted");

        return forCrossConnectGroup(
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
    public com.oracle.bmc.waiter.Waiter<GetCrossConnectGroupRequest, GetCrossConnectGroupResponse>
            forCrossConnectGroup(
                    GetCrossConnectGroupRequest request,
                    com.oracle.bmc.core.model.CrossConnectGroup.LifecycleState targetState,
                    com.oracle.bmc.waiter.TerminationStrategy terminationStrategy,
                    com.oracle.bmc.waiter.DelayStrategy delayStrategy) {
        com.oracle.bmc.util.internal.Validate.notNull(
                targetState, "The targetState cannot be null");

        return forCrossConnectGroup(
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
    public com.oracle.bmc.waiter.Waiter<GetCrossConnectGroupRequest, GetCrossConnectGroupResponse>
            forCrossConnectGroup(
                    GetCrossConnectGroupRequest request,
                    com.oracle.bmc.waiter.TerminationStrategy terminationStrategy,
                    com.oracle.bmc.waiter.DelayStrategy delayStrategy,
                    com.oracle.bmc.core.model.CrossConnectGroup.LifecycleState... targetStates) {
        com.oracle.bmc.util.internal.Validate.notEmpty(
                targetStates, "At least one target state must be provided");
        com.oracle.bmc.util.internal.Validate.noNullElements(
                targetStates, "Null target states are not permitted");

        return forCrossConnectGroup(
                com.oracle.bmc.waiter.Waiters.newWaiter(terminationStrategy, delayStrategy),
                request,
                targetStates);
    }

    // Helper method to create a new Waiter for CrossConnectGroup.
    private com.oracle.bmc.waiter.Waiter<GetCrossConnectGroupRequest, GetCrossConnectGroupResponse>
            forCrossConnectGroup(
                    com.oracle.bmc.waiter.BmcGenericWaiter waiter,
                    final GetCrossConnectGroupRequest request,
                    final com.oracle.bmc.core.model.CrossConnectGroup.LifecycleState...
                            targetStates) {
        final java.util.Set<com.oracle.bmc.core.model.CrossConnectGroup.LifecycleState>
                targetStatesSet = new java.util.HashSet<>(java.util.Arrays.asList(targetStates));

        return new com.oracle.bmc.waiter.internal.SimpleWaiterImpl<>(
                executorService,
                waiter.toCallable(
                        () -> request,
                        new java.util.function.Function<
                                GetCrossConnectGroupRequest, GetCrossConnectGroupResponse>() {
                            @Override
                            public GetCrossConnectGroupResponse apply(
                                    GetCrossConnectGroupRequest request) {
                                return client.getCrossConnectGroup(request);
                            }
                        },
                        new java.util.function.Predicate<GetCrossConnectGroupResponse>() {
                            @Override
                            public boolean test(GetCrossConnectGroupResponse response) {
                                return targetStatesSet.contains(
                                        response.getCrossConnectGroup().getLifecycleState());
                            }
                        },
                        targetStatesSet.contains(
                                com.oracle.bmc.core.model.CrossConnectGroup.LifecycleState
                                        .Terminated)),
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
    public com.oracle.bmc.waiter.Waiter<GetDhcpOptionsRequest, GetDhcpOptionsResponse>
            forDhcpOptions(
                    GetDhcpOptionsRequest request,
                    com.oracle.bmc.core.model.DhcpOptions.LifecycleState... targetStates) {
        com.oracle.bmc.util.internal.Validate.notEmpty(
                targetStates, "At least one targetState must be provided");
        com.oracle.bmc.util.internal.Validate.noNullElements(
                targetStates, "Null targetState values are not permitted");

        return forDhcpOptions(
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
    public com.oracle.bmc.waiter.Waiter<GetDhcpOptionsRequest, GetDhcpOptionsResponse>
            forDhcpOptions(
                    GetDhcpOptionsRequest request,
                    com.oracle.bmc.core.model.DhcpOptions.LifecycleState targetState,
                    com.oracle.bmc.waiter.TerminationStrategy terminationStrategy,
                    com.oracle.bmc.waiter.DelayStrategy delayStrategy) {
        com.oracle.bmc.util.internal.Validate.notNull(
                targetState, "The targetState cannot be null");

        return forDhcpOptions(
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
    public com.oracle.bmc.waiter.Waiter<GetDhcpOptionsRequest, GetDhcpOptionsResponse>
            forDhcpOptions(
                    GetDhcpOptionsRequest request,
                    com.oracle.bmc.waiter.TerminationStrategy terminationStrategy,
                    com.oracle.bmc.waiter.DelayStrategy delayStrategy,
                    com.oracle.bmc.core.model.DhcpOptions.LifecycleState... targetStates) {
        com.oracle.bmc.util.internal.Validate.notEmpty(
                targetStates, "At least one target state must be provided");
        com.oracle.bmc.util.internal.Validate.noNullElements(
                targetStates, "Null target states are not permitted");

        return forDhcpOptions(
                com.oracle.bmc.waiter.Waiters.newWaiter(terminationStrategy, delayStrategy),
                request,
                targetStates);
    }

    // Helper method to create a new Waiter for DhcpOptions.
    private com.oracle.bmc.waiter.Waiter<GetDhcpOptionsRequest, GetDhcpOptionsResponse>
            forDhcpOptions(
                    com.oracle.bmc.waiter.BmcGenericWaiter waiter,
                    final GetDhcpOptionsRequest request,
                    final com.oracle.bmc.core.model.DhcpOptions.LifecycleState... targetStates) {
        final java.util.Set<com.oracle.bmc.core.model.DhcpOptions.LifecycleState> targetStatesSet =
                new java.util.HashSet<>(java.util.Arrays.asList(targetStates));

        return new com.oracle.bmc.waiter.internal.SimpleWaiterImpl<>(
                executorService,
                waiter.toCallable(
                        () -> request,
                        new java.util.function.Function<
                                GetDhcpOptionsRequest, GetDhcpOptionsResponse>() {
                            @Override
                            public GetDhcpOptionsResponse apply(GetDhcpOptionsRequest request) {
                                return client.getDhcpOptions(request);
                            }
                        },
                        new java.util.function.Predicate<GetDhcpOptionsResponse>() {
                            @Override
                            public boolean test(GetDhcpOptionsResponse response) {
                                return targetStatesSet.contains(
                                        response.getDhcpOptions().getLifecycleState());
                            }
                        },
                        targetStatesSet.contains(
                                com.oracle.bmc.core.model.DhcpOptions.LifecycleState.Terminated)),
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
    public com.oracle.bmc.waiter.Waiter<GetDrgRequest, GetDrgResponse> forDrg(
            GetDrgRequest request, com.oracle.bmc.core.model.Drg.LifecycleState... targetStates) {
        com.oracle.bmc.util.internal.Validate.notEmpty(
                targetStates, "At least one targetState must be provided");
        com.oracle.bmc.util.internal.Validate.noNullElements(
                targetStates, "Null targetState values are not permitted");

        return forDrg(com.oracle.bmc.waiter.Waiters.DEFAULT_POLLING_WAITER, request, targetStates);
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
    public com.oracle.bmc.waiter.Waiter<GetDrgRequest, GetDrgResponse> forDrg(
            GetDrgRequest request,
            com.oracle.bmc.core.model.Drg.LifecycleState targetState,
            com.oracle.bmc.waiter.TerminationStrategy terminationStrategy,
            com.oracle.bmc.waiter.DelayStrategy delayStrategy) {
        com.oracle.bmc.util.internal.Validate.notNull(
                targetState, "The targetState cannot be null");

        return forDrg(
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
    public com.oracle.bmc.waiter.Waiter<GetDrgRequest, GetDrgResponse> forDrg(
            GetDrgRequest request,
            com.oracle.bmc.waiter.TerminationStrategy terminationStrategy,
            com.oracle.bmc.waiter.DelayStrategy delayStrategy,
            com.oracle.bmc.core.model.Drg.LifecycleState... targetStates) {
        com.oracle.bmc.util.internal.Validate.notEmpty(
                targetStates, "At least one target state must be provided");
        com.oracle.bmc.util.internal.Validate.noNullElements(
                targetStates, "Null target states are not permitted");

        return forDrg(
                com.oracle.bmc.waiter.Waiters.newWaiter(terminationStrategy, delayStrategy),
                request,
                targetStates);
    }

    // Helper method to create a new Waiter for Drg.
    private com.oracle.bmc.waiter.Waiter<GetDrgRequest, GetDrgResponse> forDrg(
            com.oracle.bmc.waiter.BmcGenericWaiter waiter,
            final GetDrgRequest request,
            final com.oracle.bmc.core.model.Drg.LifecycleState... targetStates) {
        final java.util.Set<com.oracle.bmc.core.model.Drg.LifecycleState> targetStatesSet =
                new java.util.HashSet<>(java.util.Arrays.asList(targetStates));

        return new com.oracle.bmc.waiter.internal.SimpleWaiterImpl<>(
                executorService,
                waiter.toCallable(
                        () -> request,
                        new java.util.function.Function<GetDrgRequest, GetDrgResponse>() {
                            @Override
                            public GetDrgResponse apply(GetDrgRequest request) {
                                return client.getDrg(request);
                            }
                        },
                        new java.util.function.Predicate<GetDrgResponse>() {
                            @Override
                            public boolean test(GetDrgResponse response) {
                                return targetStatesSet.contains(
                                        response.getDrg().getLifecycleState());
                            }
                        },
                        targetStatesSet.contains(
                                com.oracle.bmc.core.model.Drg.LifecycleState.Terminated)),
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
    public com.oracle.bmc.waiter.Waiter<GetDrgAttachmentRequest, GetDrgAttachmentResponse>
            forDrgAttachment(
                    GetDrgAttachmentRequest request,
                    com.oracle.bmc.core.model.DrgAttachment.LifecycleState... targetStates) {
        com.oracle.bmc.util.internal.Validate.notEmpty(
                targetStates, "At least one targetState must be provided");
        com.oracle.bmc.util.internal.Validate.noNullElements(
                targetStates, "Null targetState values are not permitted");

        return forDrgAttachment(
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
    public com.oracle.bmc.waiter.Waiter<GetDrgAttachmentRequest, GetDrgAttachmentResponse>
            forDrgAttachment(
                    GetDrgAttachmentRequest request,
                    com.oracle.bmc.core.model.DrgAttachment.LifecycleState targetState,
                    com.oracle.bmc.waiter.TerminationStrategy terminationStrategy,
                    com.oracle.bmc.waiter.DelayStrategy delayStrategy) {
        com.oracle.bmc.util.internal.Validate.notNull(
                targetState, "The targetState cannot be null");

        return forDrgAttachment(
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
    public com.oracle.bmc.waiter.Waiter<GetDrgAttachmentRequest, GetDrgAttachmentResponse>
            forDrgAttachment(
                    GetDrgAttachmentRequest request,
                    com.oracle.bmc.waiter.TerminationStrategy terminationStrategy,
                    com.oracle.bmc.waiter.DelayStrategy delayStrategy,
                    com.oracle.bmc.core.model.DrgAttachment.LifecycleState... targetStates) {
        com.oracle.bmc.util.internal.Validate.notEmpty(
                targetStates, "At least one target state must be provided");
        com.oracle.bmc.util.internal.Validate.noNullElements(
                targetStates, "Null target states are not permitted");

        return forDrgAttachment(
                com.oracle.bmc.waiter.Waiters.newWaiter(terminationStrategy, delayStrategy),
                request,
                targetStates);
    }

    // Helper method to create a new Waiter for DrgAttachment.
    private com.oracle.bmc.waiter.Waiter<GetDrgAttachmentRequest, GetDrgAttachmentResponse>
            forDrgAttachment(
                    com.oracle.bmc.waiter.BmcGenericWaiter waiter,
                    final GetDrgAttachmentRequest request,
                    final com.oracle.bmc.core.model.DrgAttachment.LifecycleState... targetStates) {
        final java.util.Set<com.oracle.bmc.core.model.DrgAttachment.LifecycleState>
                targetStatesSet = new java.util.HashSet<>(java.util.Arrays.asList(targetStates));

        return new com.oracle.bmc.waiter.internal.SimpleWaiterImpl<>(
                executorService,
                waiter.toCallable(
                        () -> request,
                        new java.util.function.Function<
                                GetDrgAttachmentRequest, GetDrgAttachmentResponse>() {
                            @Override
                            public GetDrgAttachmentResponse apply(GetDrgAttachmentRequest request) {
                                return client.getDrgAttachment(request);
                            }
                        },
                        new java.util.function.Predicate<GetDrgAttachmentResponse>() {
                            @Override
                            public boolean test(GetDrgAttachmentResponse response) {
                                return targetStatesSet.contains(
                                        response.getDrgAttachment().getLifecycleState());
                            }
                        },
                        targetStatesSet.contains(
                                com.oracle.bmc.core.model.DrgAttachment.LifecycleState.Detached)),
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
                    GetDrgRouteDistributionRequest, GetDrgRouteDistributionResponse>
            forDrgRouteDistribution(
                    GetDrgRouteDistributionRequest request,
                    com.oracle.bmc.core.model.DrgRouteDistribution.LifecycleState... targetStates) {
        com.oracle.bmc.util.internal.Validate.notEmpty(
                targetStates, "At least one targetState must be provided");
        com.oracle.bmc.util.internal.Validate.noNullElements(
                targetStates, "Null targetState values are not permitted");

        return forDrgRouteDistribution(
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
                    GetDrgRouteDistributionRequest, GetDrgRouteDistributionResponse>
            forDrgRouteDistribution(
                    GetDrgRouteDistributionRequest request,
                    com.oracle.bmc.core.model.DrgRouteDistribution.LifecycleState targetState,
                    com.oracle.bmc.waiter.TerminationStrategy terminationStrategy,
                    com.oracle.bmc.waiter.DelayStrategy delayStrategy) {
        com.oracle.bmc.util.internal.Validate.notNull(
                targetState, "The targetState cannot be null");

        return forDrgRouteDistribution(
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
                    GetDrgRouteDistributionRequest, GetDrgRouteDistributionResponse>
            forDrgRouteDistribution(
                    GetDrgRouteDistributionRequest request,
                    com.oracle.bmc.waiter.TerminationStrategy terminationStrategy,
                    com.oracle.bmc.waiter.DelayStrategy delayStrategy,
                    com.oracle.bmc.core.model.DrgRouteDistribution.LifecycleState... targetStates) {
        com.oracle.bmc.util.internal.Validate.notEmpty(
                targetStates, "At least one target state must be provided");
        com.oracle.bmc.util.internal.Validate.noNullElements(
                targetStates, "Null target states are not permitted");

        return forDrgRouteDistribution(
                com.oracle.bmc.waiter.Waiters.newWaiter(terminationStrategy, delayStrategy),
                request,
                targetStates);
    }

    // Helper method to create a new Waiter for DrgRouteDistribution.
    private com.oracle.bmc.waiter.Waiter<
                    GetDrgRouteDistributionRequest, GetDrgRouteDistributionResponse>
            forDrgRouteDistribution(
                    com.oracle.bmc.waiter.BmcGenericWaiter waiter,
                    final GetDrgRouteDistributionRequest request,
                    final com.oracle.bmc.core.model.DrgRouteDistribution.LifecycleState...
                            targetStates) {
        final java.util.Set<com.oracle.bmc.core.model.DrgRouteDistribution.LifecycleState>
                targetStatesSet = new java.util.HashSet<>(java.util.Arrays.asList(targetStates));

        return new com.oracle.bmc.waiter.internal.SimpleWaiterImpl<>(
                executorService,
                waiter.toCallable(
                        () -> request,
                        new java.util.function.Function<
                                GetDrgRouteDistributionRequest, GetDrgRouteDistributionResponse>() {
                            @Override
                            public GetDrgRouteDistributionResponse apply(
                                    GetDrgRouteDistributionRequest request) {
                                return client.getDrgRouteDistribution(request);
                            }
                        },
                        new java.util.function.Predicate<GetDrgRouteDistributionResponse>() {
                            @Override
                            public boolean test(GetDrgRouteDistributionResponse response) {
                                return targetStatesSet.contains(
                                        response.getDrgRouteDistribution().getLifecycleState());
                            }
                        },
                        targetStatesSet.contains(
                                com.oracle.bmc.core.model.DrgRouteDistribution.LifecycleState
                                        .Terminated)),
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
    public com.oracle.bmc.waiter.Waiter<GetDrgRouteTableRequest, GetDrgRouteTableResponse>
            forDrgRouteTable(
                    GetDrgRouteTableRequest request,
                    com.oracle.bmc.core.model.DrgRouteTable.LifecycleState... targetStates) {
        com.oracle.bmc.util.internal.Validate.notEmpty(
                targetStates, "At least one targetState must be provided");
        com.oracle.bmc.util.internal.Validate.noNullElements(
                targetStates, "Null targetState values are not permitted");

        return forDrgRouteTable(
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
    public com.oracle.bmc.waiter.Waiter<GetDrgRouteTableRequest, GetDrgRouteTableResponse>
            forDrgRouteTable(
                    GetDrgRouteTableRequest request,
                    com.oracle.bmc.core.model.DrgRouteTable.LifecycleState targetState,
                    com.oracle.bmc.waiter.TerminationStrategy terminationStrategy,
                    com.oracle.bmc.waiter.DelayStrategy delayStrategy) {
        com.oracle.bmc.util.internal.Validate.notNull(
                targetState, "The targetState cannot be null");

        return forDrgRouteTable(
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
    public com.oracle.bmc.waiter.Waiter<GetDrgRouteTableRequest, GetDrgRouteTableResponse>
            forDrgRouteTable(
                    GetDrgRouteTableRequest request,
                    com.oracle.bmc.waiter.TerminationStrategy terminationStrategy,
                    com.oracle.bmc.waiter.DelayStrategy delayStrategy,
                    com.oracle.bmc.core.model.DrgRouteTable.LifecycleState... targetStates) {
        com.oracle.bmc.util.internal.Validate.notEmpty(
                targetStates, "At least one target state must be provided");
        com.oracle.bmc.util.internal.Validate.noNullElements(
                targetStates, "Null target states are not permitted");

        return forDrgRouteTable(
                com.oracle.bmc.waiter.Waiters.newWaiter(terminationStrategy, delayStrategy),
                request,
                targetStates);
    }

    // Helper method to create a new Waiter for DrgRouteTable.
    private com.oracle.bmc.waiter.Waiter<GetDrgRouteTableRequest, GetDrgRouteTableResponse>
            forDrgRouteTable(
                    com.oracle.bmc.waiter.BmcGenericWaiter waiter,
                    final GetDrgRouteTableRequest request,
                    final com.oracle.bmc.core.model.DrgRouteTable.LifecycleState... targetStates) {
        final java.util.Set<com.oracle.bmc.core.model.DrgRouteTable.LifecycleState>
                targetStatesSet = new java.util.HashSet<>(java.util.Arrays.asList(targetStates));

        return new com.oracle.bmc.waiter.internal.SimpleWaiterImpl<>(
                executorService,
                waiter.toCallable(
                        () -> request,
                        new java.util.function.Function<
                                GetDrgRouteTableRequest, GetDrgRouteTableResponse>() {
                            @Override
                            public GetDrgRouteTableResponse apply(GetDrgRouteTableRequest request) {
                                return client.getDrgRouteTable(request);
                            }
                        },
                        new java.util.function.Predicate<GetDrgRouteTableResponse>() {
                            @Override
                            public boolean test(GetDrgRouteTableResponse response) {
                                return targetStatesSet.contains(
                                        response.getDrgRouteTable().getLifecycleState());
                            }
                        },
                        targetStatesSet.contains(
                                com.oracle.bmc.core.model.DrgRouteTable.LifecycleState.Terminated)),
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
    public com.oracle.bmc.waiter.Waiter<GetIPSecConnectionRequest, GetIPSecConnectionResponse>
            forIPSecConnection(
                    GetIPSecConnectionRequest request,
                    com.oracle.bmc.core.model.IPSecConnection.LifecycleState... targetStates) {
        com.oracle.bmc.util.internal.Validate.notEmpty(
                targetStates, "At least one targetState must be provided");
        com.oracle.bmc.util.internal.Validate.noNullElements(
                targetStates, "Null targetState values are not permitted");

        return forIPSecConnection(
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
    public com.oracle.bmc.waiter.Waiter<GetIPSecConnectionRequest, GetIPSecConnectionResponse>
            forIPSecConnection(
                    GetIPSecConnectionRequest request,
                    com.oracle.bmc.core.model.IPSecConnection.LifecycleState targetState,
                    com.oracle.bmc.waiter.TerminationStrategy terminationStrategy,
                    com.oracle.bmc.waiter.DelayStrategy delayStrategy) {
        com.oracle.bmc.util.internal.Validate.notNull(
                targetState, "The targetState cannot be null");

        return forIPSecConnection(
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
    public com.oracle.bmc.waiter.Waiter<GetIPSecConnectionRequest, GetIPSecConnectionResponse>
            forIPSecConnection(
                    GetIPSecConnectionRequest request,
                    com.oracle.bmc.waiter.TerminationStrategy terminationStrategy,
                    com.oracle.bmc.waiter.DelayStrategy delayStrategy,
                    com.oracle.bmc.core.model.IPSecConnection.LifecycleState... targetStates) {
        com.oracle.bmc.util.internal.Validate.notEmpty(
                targetStates, "At least one target state must be provided");
        com.oracle.bmc.util.internal.Validate.noNullElements(
                targetStates, "Null target states are not permitted");

        return forIPSecConnection(
                com.oracle.bmc.waiter.Waiters.newWaiter(terminationStrategy, delayStrategy),
                request,
                targetStates);
    }

    // Helper method to create a new Waiter for IPSecConnection.
    private com.oracle.bmc.waiter.Waiter<GetIPSecConnectionRequest, GetIPSecConnectionResponse>
            forIPSecConnection(
                    com.oracle.bmc.waiter.BmcGenericWaiter waiter,
                    final GetIPSecConnectionRequest request,
                    final com.oracle.bmc.core.model.IPSecConnection.LifecycleState...
                            targetStates) {
        final java.util.Set<com.oracle.bmc.core.model.IPSecConnection.LifecycleState>
                targetStatesSet = new java.util.HashSet<>(java.util.Arrays.asList(targetStates));

        return new com.oracle.bmc.waiter.internal.SimpleWaiterImpl<>(
                executorService,
                waiter.toCallable(
                        () -> request,
                        new java.util.function.Function<
                                GetIPSecConnectionRequest, GetIPSecConnectionResponse>() {
                            @Override
                            public GetIPSecConnectionResponse apply(
                                    GetIPSecConnectionRequest request) {
                                return client.getIPSecConnection(request);
                            }
                        },
                        new java.util.function.Predicate<GetIPSecConnectionResponse>() {
                            @Override
                            public boolean test(GetIPSecConnectionResponse response) {
                                return targetStatesSet.contains(
                                        response.getIPSecConnection().getLifecycleState());
                            }
                        },
                        targetStatesSet.contains(
                                com.oracle.bmc.core.model.IPSecConnection.LifecycleState
                                        .Terminated)),
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
                    GetIPSecConnectionTunnelRequest, GetIPSecConnectionTunnelResponse>
            forIPSecConnectionTunnel(
                    GetIPSecConnectionTunnelRequest request,
                    com.oracle.bmc.core.model.IPSecConnectionTunnel.LifecycleState...
                            targetStates) {
        com.oracle.bmc.util.internal.Validate.notEmpty(
                targetStates, "At least one targetState must be provided");
        com.oracle.bmc.util.internal.Validate.noNullElements(
                targetStates, "Null targetState values are not permitted");

        return forIPSecConnectionTunnel(
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
                    GetIPSecConnectionTunnelRequest, GetIPSecConnectionTunnelResponse>
            forIPSecConnectionTunnel(
                    GetIPSecConnectionTunnelRequest request,
                    com.oracle.bmc.core.model.IPSecConnectionTunnel.LifecycleState targetState,
                    com.oracle.bmc.waiter.TerminationStrategy terminationStrategy,
                    com.oracle.bmc.waiter.DelayStrategy delayStrategy) {
        com.oracle.bmc.util.internal.Validate.notNull(
                targetState, "The targetState cannot be null");

        return forIPSecConnectionTunnel(
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
                    GetIPSecConnectionTunnelRequest, GetIPSecConnectionTunnelResponse>
            forIPSecConnectionTunnel(
                    GetIPSecConnectionTunnelRequest request,
                    com.oracle.bmc.waiter.TerminationStrategy terminationStrategy,
                    com.oracle.bmc.waiter.DelayStrategy delayStrategy,
                    com.oracle.bmc.core.model.IPSecConnectionTunnel.LifecycleState...
                            targetStates) {
        com.oracle.bmc.util.internal.Validate.notEmpty(
                targetStates, "At least one target state must be provided");
        com.oracle.bmc.util.internal.Validate.noNullElements(
                targetStates, "Null target states are not permitted");

        return forIPSecConnectionTunnel(
                com.oracle.bmc.waiter.Waiters.newWaiter(terminationStrategy, delayStrategy),
                request,
                targetStates);
    }

    // Helper method to create a new Waiter for IPSecConnectionTunnel.
    private com.oracle.bmc.waiter.Waiter<
                    GetIPSecConnectionTunnelRequest, GetIPSecConnectionTunnelResponse>
            forIPSecConnectionTunnel(
                    com.oracle.bmc.waiter.BmcGenericWaiter waiter,
                    final GetIPSecConnectionTunnelRequest request,
                    final com.oracle.bmc.core.model.IPSecConnectionTunnel.LifecycleState...
                            targetStates) {
        final java.util.Set<com.oracle.bmc.core.model.IPSecConnectionTunnel.LifecycleState>
                targetStatesSet = new java.util.HashSet<>(java.util.Arrays.asList(targetStates));

        return new com.oracle.bmc.waiter.internal.SimpleWaiterImpl<>(
                executorService,
                waiter.toCallable(
                        () -> request,
                        new java.util.function.Function<
                                GetIPSecConnectionTunnelRequest,
                                GetIPSecConnectionTunnelResponse>() {
                            @Override
                            public GetIPSecConnectionTunnelResponse apply(
                                    GetIPSecConnectionTunnelRequest request) {
                                return client.getIPSecConnectionTunnel(request);
                            }
                        },
                        new java.util.function.Predicate<GetIPSecConnectionTunnelResponse>() {
                            @Override
                            public boolean test(GetIPSecConnectionTunnelResponse response) {
                                return targetStatesSet.contains(
                                        response.getIPSecConnectionTunnel().getLifecycleState());
                            }
                        },
                        targetStatesSet.contains(
                                com.oracle.bmc.core.model.IPSecConnectionTunnel.LifecycleState
                                        .Terminated)),
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
    public com.oracle.bmc.waiter.Waiter<GetInternetGatewayRequest, GetInternetGatewayResponse>
            forInternetGateway(
                    GetInternetGatewayRequest request,
                    com.oracle.bmc.core.model.InternetGateway.LifecycleState... targetStates) {
        com.oracle.bmc.util.internal.Validate.notEmpty(
                targetStates, "At least one targetState must be provided");
        com.oracle.bmc.util.internal.Validate.noNullElements(
                targetStates, "Null targetState values are not permitted");

        return forInternetGateway(
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
    public com.oracle.bmc.waiter.Waiter<GetInternetGatewayRequest, GetInternetGatewayResponse>
            forInternetGateway(
                    GetInternetGatewayRequest request,
                    com.oracle.bmc.core.model.InternetGateway.LifecycleState targetState,
                    com.oracle.bmc.waiter.TerminationStrategy terminationStrategy,
                    com.oracle.bmc.waiter.DelayStrategy delayStrategy) {
        com.oracle.bmc.util.internal.Validate.notNull(
                targetState, "The targetState cannot be null");

        return forInternetGateway(
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
    public com.oracle.bmc.waiter.Waiter<GetInternetGatewayRequest, GetInternetGatewayResponse>
            forInternetGateway(
                    GetInternetGatewayRequest request,
                    com.oracle.bmc.waiter.TerminationStrategy terminationStrategy,
                    com.oracle.bmc.waiter.DelayStrategy delayStrategy,
                    com.oracle.bmc.core.model.InternetGateway.LifecycleState... targetStates) {
        com.oracle.bmc.util.internal.Validate.notEmpty(
                targetStates, "At least one target state must be provided");
        com.oracle.bmc.util.internal.Validate.noNullElements(
                targetStates, "Null target states are not permitted");

        return forInternetGateway(
                com.oracle.bmc.waiter.Waiters.newWaiter(terminationStrategy, delayStrategy),
                request,
                targetStates);
    }

    // Helper method to create a new Waiter for InternetGateway.
    private com.oracle.bmc.waiter.Waiter<GetInternetGatewayRequest, GetInternetGatewayResponse>
            forInternetGateway(
                    com.oracle.bmc.waiter.BmcGenericWaiter waiter,
                    final GetInternetGatewayRequest request,
                    final com.oracle.bmc.core.model.InternetGateway.LifecycleState...
                            targetStates) {
        final java.util.Set<com.oracle.bmc.core.model.InternetGateway.LifecycleState>
                targetStatesSet = new java.util.HashSet<>(java.util.Arrays.asList(targetStates));

        return new com.oracle.bmc.waiter.internal.SimpleWaiterImpl<>(
                executorService,
                waiter.toCallable(
                        () -> request,
                        new java.util.function.Function<
                                GetInternetGatewayRequest, GetInternetGatewayResponse>() {
                            @Override
                            public GetInternetGatewayResponse apply(
                                    GetInternetGatewayRequest request) {
                                return client.getInternetGateway(request);
                            }
                        },
                        new java.util.function.Predicate<GetInternetGatewayResponse>() {
                            @Override
                            public boolean test(GetInternetGatewayResponse response) {
                                return targetStatesSet.contains(
                                        response.getInternetGateway().getLifecycleState());
                            }
                        },
                        targetStatesSet.contains(
                                com.oracle.bmc.core.model.InternetGateway.LifecycleState
                                        .Terminated)),
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
    public com.oracle.bmc.waiter.Waiter<GetIpv6Request, GetIpv6Response> forIpv6(
            GetIpv6Request request, com.oracle.bmc.core.model.Ipv6.LifecycleState... targetStates) {
        com.oracle.bmc.util.internal.Validate.notEmpty(
                targetStates, "At least one targetState must be provided");
        com.oracle.bmc.util.internal.Validate.noNullElements(
                targetStates, "Null targetState values are not permitted");

        return forIpv6(com.oracle.bmc.waiter.Waiters.DEFAULT_POLLING_WAITER, request, targetStates);
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
    public com.oracle.bmc.waiter.Waiter<GetIpv6Request, GetIpv6Response> forIpv6(
            GetIpv6Request request,
            com.oracle.bmc.core.model.Ipv6.LifecycleState targetState,
            com.oracle.bmc.waiter.TerminationStrategy terminationStrategy,
            com.oracle.bmc.waiter.DelayStrategy delayStrategy) {
        com.oracle.bmc.util.internal.Validate.notNull(
                targetState, "The targetState cannot be null");

        return forIpv6(
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
    public com.oracle.bmc.waiter.Waiter<GetIpv6Request, GetIpv6Response> forIpv6(
            GetIpv6Request request,
            com.oracle.bmc.waiter.TerminationStrategy terminationStrategy,
            com.oracle.bmc.waiter.DelayStrategy delayStrategy,
            com.oracle.bmc.core.model.Ipv6.LifecycleState... targetStates) {
        com.oracle.bmc.util.internal.Validate.notEmpty(
                targetStates, "At least one target state must be provided");
        com.oracle.bmc.util.internal.Validate.noNullElements(
                targetStates, "Null target states are not permitted");

        return forIpv6(
                com.oracle.bmc.waiter.Waiters.newWaiter(terminationStrategy, delayStrategy),
                request,
                targetStates);
    }

    // Helper method to create a new Waiter for Ipv6.
    private com.oracle.bmc.waiter.Waiter<GetIpv6Request, GetIpv6Response> forIpv6(
            com.oracle.bmc.waiter.BmcGenericWaiter waiter,
            final GetIpv6Request request,
            final com.oracle.bmc.core.model.Ipv6.LifecycleState... targetStates) {
        final java.util.Set<com.oracle.bmc.core.model.Ipv6.LifecycleState> targetStatesSet =
                new java.util.HashSet<>(java.util.Arrays.asList(targetStates));

        return new com.oracle.bmc.waiter.internal.SimpleWaiterImpl<>(
                executorService,
                waiter.toCallable(
                        () -> request,
                        new java.util.function.Function<GetIpv6Request, GetIpv6Response>() {
                            @Override
                            public GetIpv6Response apply(GetIpv6Request request) {
                                return client.getIpv6(request);
                            }
                        },
                        new java.util.function.Predicate<GetIpv6Response>() {
                            @Override
                            public boolean test(GetIpv6Response response) {
                                return targetStatesSet.contains(
                                        response.getIpv6().getLifecycleState());
                            }
                        },
                        targetStatesSet.contains(
                                com.oracle.bmc.core.model.Ipv6.LifecycleState.Terminated)),
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
                    GetLocalPeeringGatewayRequest, GetLocalPeeringGatewayResponse>
            forLocalPeeringGateway(
                    GetLocalPeeringGatewayRequest request,
                    com.oracle.bmc.core.model.LocalPeeringGateway.LifecycleState... targetStates) {
        com.oracle.bmc.util.internal.Validate.notEmpty(
                targetStates, "At least one targetState must be provided");
        com.oracle.bmc.util.internal.Validate.noNullElements(
                targetStates, "Null targetState values are not permitted");

        return forLocalPeeringGateway(
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
                    GetLocalPeeringGatewayRequest, GetLocalPeeringGatewayResponse>
            forLocalPeeringGateway(
                    GetLocalPeeringGatewayRequest request,
                    com.oracle.bmc.core.model.LocalPeeringGateway.LifecycleState targetState,
                    com.oracle.bmc.waiter.TerminationStrategy terminationStrategy,
                    com.oracle.bmc.waiter.DelayStrategy delayStrategy) {
        com.oracle.bmc.util.internal.Validate.notNull(
                targetState, "The targetState cannot be null");

        return forLocalPeeringGateway(
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
                    GetLocalPeeringGatewayRequest, GetLocalPeeringGatewayResponse>
            forLocalPeeringGateway(
                    GetLocalPeeringGatewayRequest request,
                    com.oracle.bmc.waiter.TerminationStrategy terminationStrategy,
                    com.oracle.bmc.waiter.DelayStrategy delayStrategy,
                    com.oracle.bmc.core.model.LocalPeeringGateway.LifecycleState... targetStates) {
        com.oracle.bmc.util.internal.Validate.notEmpty(
                targetStates, "At least one target state must be provided");
        com.oracle.bmc.util.internal.Validate.noNullElements(
                targetStates, "Null target states are not permitted");

        return forLocalPeeringGateway(
                com.oracle.bmc.waiter.Waiters.newWaiter(terminationStrategy, delayStrategy),
                request,
                targetStates);
    }

    // Helper method to create a new Waiter for LocalPeeringGateway.
    private com.oracle.bmc.waiter.Waiter<
                    GetLocalPeeringGatewayRequest, GetLocalPeeringGatewayResponse>
            forLocalPeeringGateway(
                    com.oracle.bmc.waiter.BmcGenericWaiter waiter,
                    final GetLocalPeeringGatewayRequest request,
                    final com.oracle.bmc.core.model.LocalPeeringGateway.LifecycleState...
                            targetStates) {
        final java.util.Set<com.oracle.bmc.core.model.LocalPeeringGateway.LifecycleState>
                targetStatesSet = new java.util.HashSet<>(java.util.Arrays.asList(targetStates));

        return new com.oracle.bmc.waiter.internal.SimpleWaiterImpl<>(
                executorService,
                waiter.toCallable(
                        () -> request,
                        new java.util.function.Function<
                                GetLocalPeeringGatewayRequest, GetLocalPeeringGatewayResponse>() {
                            @Override
                            public GetLocalPeeringGatewayResponse apply(
                                    GetLocalPeeringGatewayRequest request) {
                                return client.getLocalPeeringGateway(request);
                            }
                        },
                        new java.util.function.Predicate<GetLocalPeeringGatewayResponse>() {
                            @Override
                            public boolean test(GetLocalPeeringGatewayResponse response) {
                                return targetStatesSet.contains(
                                        response.getLocalPeeringGateway().getLifecycleState());
                            }
                        },
                        targetStatesSet.contains(
                                com.oracle.bmc.core.model.LocalPeeringGateway.LifecycleState
                                        .Terminated)),
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
                    GetLocalPeeringGatewayRequest, GetLocalPeeringGatewayResponse>
            forLocalPeeringGateway(
                    GetLocalPeeringGatewayRequest request,
                    com.oracle.bmc.core.model.LocalPeeringGateway.PeeringStatus... targetStates) {
        com.oracle.bmc.util.internal.Validate.notEmpty(
                targetStates, "At least one targetState must be provided");
        com.oracle.bmc.util.internal.Validate.noNullElements(
                targetStates, "Null targetState values are not permitted");

        return forLocalPeeringGateway(
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
                    GetLocalPeeringGatewayRequest, GetLocalPeeringGatewayResponse>
            forLocalPeeringGateway(
                    GetLocalPeeringGatewayRequest request,
                    com.oracle.bmc.core.model.LocalPeeringGateway.PeeringStatus targetState,
                    com.oracle.bmc.waiter.TerminationStrategy terminationStrategy,
                    com.oracle.bmc.waiter.DelayStrategy delayStrategy) {
        com.oracle.bmc.util.internal.Validate.notNull(
                targetState, "The targetState cannot be null");

        return forLocalPeeringGateway(
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
                    GetLocalPeeringGatewayRequest, GetLocalPeeringGatewayResponse>
            forLocalPeeringGateway(
                    GetLocalPeeringGatewayRequest request,
                    com.oracle.bmc.waiter.TerminationStrategy terminationStrategy,
                    com.oracle.bmc.waiter.DelayStrategy delayStrategy,
                    com.oracle.bmc.core.model.LocalPeeringGateway.PeeringStatus... targetStates) {
        com.oracle.bmc.util.internal.Validate.notEmpty(
                targetStates, "At least one target state must be provided");
        com.oracle.bmc.util.internal.Validate.noNullElements(
                targetStates, "Null target states are not permitted");

        return forLocalPeeringGateway(
                com.oracle.bmc.waiter.Waiters.newWaiter(terminationStrategy, delayStrategy),
                request,
                targetStates);
    }

    // Helper method to create a new Waiter for LocalPeeringGateway.
    private com.oracle.bmc.waiter.Waiter<
                    GetLocalPeeringGatewayRequest, GetLocalPeeringGatewayResponse>
            forLocalPeeringGateway(
                    com.oracle.bmc.waiter.BmcGenericWaiter waiter,
                    final GetLocalPeeringGatewayRequest request,
                    final com.oracle.bmc.core.model.LocalPeeringGateway.PeeringStatus...
                            targetStates) {
        final java.util.Set<com.oracle.bmc.core.model.LocalPeeringGateway.PeeringStatus>
                targetStatesSet = new java.util.HashSet<>(java.util.Arrays.asList(targetStates));

        return new com.oracle.bmc.waiter.internal.SimpleWaiterImpl<>(
                executorService,
                waiter.toCallable(
                        () -> request,
                        new java.util.function.Function<
                                GetLocalPeeringGatewayRequest, GetLocalPeeringGatewayResponse>() {
                            @Override
                            public GetLocalPeeringGatewayResponse apply(
                                    GetLocalPeeringGatewayRequest request) {
                                return client.getLocalPeeringGateway(request);
                            }
                        },
                        new java.util.function.Predicate<GetLocalPeeringGatewayResponse>() {
                            @Override
                            public boolean test(GetLocalPeeringGatewayResponse response) {
                                return targetStatesSet.contains(
                                        response.getLocalPeeringGateway().getPeeringStatus());
                            }
                        },
                        targetStatesSet.contains(
                                com.oracle.bmc.core.model.LocalPeeringGateway.PeeringStatus
                                        .Revoked)),
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
    public com.oracle.bmc.waiter.Waiter<GetNatGatewayRequest, GetNatGatewayResponse> forNatGateway(
            GetNatGatewayRequest request,
            com.oracle.bmc.core.model.NatGateway.LifecycleState... targetStates) {
        com.oracle.bmc.util.internal.Validate.notEmpty(
                targetStates, "At least one targetState must be provided");
        com.oracle.bmc.util.internal.Validate.noNullElements(
                targetStates, "Null targetState values are not permitted");

        return forNatGateway(
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
    public com.oracle.bmc.waiter.Waiter<GetNatGatewayRequest, GetNatGatewayResponse> forNatGateway(
            GetNatGatewayRequest request,
            com.oracle.bmc.core.model.NatGateway.LifecycleState targetState,
            com.oracle.bmc.waiter.TerminationStrategy terminationStrategy,
            com.oracle.bmc.waiter.DelayStrategy delayStrategy) {
        com.oracle.bmc.util.internal.Validate.notNull(
                targetState, "The targetState cannot be null");

        return forNatGateway(
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
    public com.oracle.bmc.waiter.Waiter<GetNatGatewayRequest, GetNatGatewayResponse> forNatGateway(
            GetNatGatewayRequest request,
            com.oracle.bmc.waiter.TerminationStrategy terminationStrategy,
            com.oracle.bmc.waiter.DelayStrategy delayStrategy,
            com.oracle.bmc.core.model.NatGateway.LifecycleState... targetStates) {
        com.oracle.bmc.util.internal.Validate.notEmpty(
                targetStates, "At least one target state must be provided");
        com.oracle.bmc.util.internal.Validate.noNullElements(
                targetStates, "Null target states are not permitted");

        return forNatGateway(
                com.oracle.bmc.waiter.Waiters.newWaiter(terminationStrategy, delayStrategy),
                request,
                targetStates);
    }

    // Helper method to create a new Waiter for NatGateway.
    private com.oracle.bmc.waiter.Waiter<GetNatGatewayRequest, GetNatGatewayResponse> forNatGateway(
            com.oracle.bmc.waiter.BmcGenericWaiter waiter,
            final GetNatGatewayRequest request,
            final com.oracle.bmc.core.model.NatGateway.LifecycleState... targetStates) {
        final java.util.Set<com.oracle.bmc.core.model.NatGateway.LifecycleState> targetStatesSet =
                new java.util.HashSet<>(java.util.Arrays.asList(targetStates));

        return new com.oracle.bmc.waiter.internal.SimpleWaiterImpl<>(
                executorService,
                waiter.toCallable(
                        () -> request,
                        new java.util.function.Function<
                                GetNatGatewayRequest, GetNatGatewayResponse>() {
                            @Override
                            public GetNatGatewayResponse apply(GetNatGatewayRequest request) {
                                return client.getNatGateway(request);
                            }
                        },
                        new java.util.function.Predicate<GetNatGatewayResponse>() {
                            @Override
                            public boolean test(GetNatGatewayResponse response) {
                                return targetStatesSet.contains(
                                        response.getNatGateway().getLifecycleState());
                            }
                        },
                        targetStatesSet.contains(
                                com.oracle.bmc.core.model.NatGateway.LifecycleState.Terminated)),
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
                    GetNetworkSecurityGroupRequest, GetNetworkSecurityGroupResponse>
            forNetworkSecurityGroup(
                    GetNetworkSecurityGroupRequest request,
                    com.oracle.bmc.core.model.NetworkSecurityGroup.LifecycleState... targetStates) {
        com.oracle.bmc.util.internal.Validate.notEmpty(
                targetStates, "At least one targetState must be provided");
        com.oracle.bmc.util.internal.Validate.noNullElements(
                targetStates, "Null targetState values are not permitted");

        return forNetworkSecurityGroup(
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
                    GetNetworkSecurityGroupRequest, GetNetworkSecurityGroupResponse>
            forNetworkSecurityGroup(
                    GetNetworkSecurityGroupRequest request,
                    com.oracle.bmc.core.model.NetworkSecurityGroup.LifecycleState targetState,
                    com.oracle.bmc.waiter.TerminationStrategy terminationStrategy,
                    com.oracle.bmc.waiter.DelayStrategy delayStrategy) {
        com.oracle.bmc.util.internal.Validate.notNull(
                targetState, "The targetState cannot be null");

        return forNetworkSecurityGroup(
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
                    GetNetworkSecurityGroupRequest, GetNetworkSecurityGroupResponse>
            forNetworkSecurityGroup(
                    GetNetworkSecurityGroupRequest request,
                    com.oracle.bmc.waiter.TerminationStrategy terminationStrategy,
                    com.oracle.bmc.waiter.DelayStrategy delayStrategy,
                    com.oracle.bmc.core.model.NetworkSecurityGroup.LifecycleState... targetStates) {
        com.oracle.bmc.util.internal.Validate.notEmpty(
                targetStates, "At least one target state must be provided");
        com.oracle.bmc.util.internal.Validate.noNullElements(
                targetStates, "Null target states are not permitted");

        return forNetworkSecurityGroup(
                com.oracle.bmc.waiter.Waiters.newWaiter(terminationStrategy, delayStrategy),
                request,
                targetStates);
    }

    // Helper method to create a new Waiter for NetworkSecurityGroup.
    private com.oracle.bmc.waiter.Waiter<
                    GetNetworkSecurityGroupRequest, GetNetworkSecurityGroupResponse>
            forNetworkSecurityGroup(
                    com.oracle.bmc.waiter.BmcGenericWaiter waiter,
                    final GetNetworkSecurityGroupRequest request,
                    final com.oracle.bmc.core.model.NetworkSecurityGroup.LifecycleState...
                            targetStates) {
        final java.util.Set<com.oracle.bmc.core.model.NetworkSecurityGroup.LifecycleState>
                targetStatesSet = new java.util.HashSet<>(java.util.Arrays.asList(targetStates));

        return new com.oracle.bmc.waiter.internal.SimpleWaiterImpl<>(
                executorService,
                waiter.toCallable(
                        () -> request,
                        new java.util.function.Function<
                                GetNetworkSecurityGroupRequest, GetNetworkSecurityGroupResponse>() {
                            @Override
                            public GetNetworkSecurityGroupResponse apply(
                                    GetNetworkSecurityGroupRequest request) {
                                return client.getNetworkSecurityGroup(request);
                            }
                        },
                        new java.util.function.Predicate<GetNetworkSecurityGroupResponse>() {
                            @Override
                            public boolean test(GetNetworkSecurityGroupResponse response) {
                                return targetStatesSet.contains(
                                        response.getNetworkSecurityGroup().getLifecycleState());
                            }
                        },
                        targetStatesSet.contains(
                                com.oracle.bmc.core.model.NetworkSecurityGroup.LifecycleState
                                        .Terminated)),
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
    public com.oracle.bmc.waiter.Waiter<GetPublicIpRequest, GetPublicIpResponse> forPublicIp(
            GetPublicIpRequest request,
            com.oracle.bmc.core.model.PublicIp.LifecycleState... targetStates) {
        com.oracle.bmc.util.internal.Validate.notEmpty(
                targetStates, "At least one targetState must be provided");
        com.oracle.bmc.util.internal.Validate.noNullElements(
                targetStates, "Null targetState values are not permitted");

        return forPublicIp(
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
    public com.oracle.bmc.waiter.Waiter<GetPublicIpRequest, GetPublicIpResponse> forPublicIp(
            GetPublicIpRequest request,
            com.oracle.bmc.core.model.PublicIp.LifecycleState targetState,
            com.oracle.bmc.waiter.TerminationStrategy terminationStrategy,
            com.oracle.bmc.waiter.DelayStrategy delayStrategy) {
        com.oracle.bmc.util.internal.Validate.notNull(
                targetState, "The targetState cannot be null");

        return forPublicIp(
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
    public com.oracle.bmc.waiter.Waiter<GetPublicIpRequest, GetPublicIpResponse> forPublicIp(
            GetPublicIpRequest request,
            com.oracle.bmc.waiter.TerminationStrategy terminationStrategy,
            com.oracle.bmc.waiter.DelayStrategy delayStrategy,
            com.oracle.bmc.core.model.PublicIp.LifecycleState... targetStates) {
        com.oracle.bmc.util.internal.Validate.notEmpty(
                targetStates, "At least one target state must be provided");
        com.oracle.bmc.util.internal.Validate.noNullElements(
                targetStates, "Null target states are not permitted");

        return forPublicIp(
                com.oracle.bmc.waiter.Waiters.newWaiter(terminationStrategy, delayStrategy),
                request,
                targetStates);
    }

    // Helper method to create a new Waiter for PublicIp.
    private com.oracle.bmc.waiter.Waiter<GetPublicIpRequest, GetPublicIpResponse> forPublicIp(
            com.oracle.bmc.waiter.BmcGenericWaiter waiter,
            final GetPublicIpRequest request,
            final com.oracle.bmc.core.model.PublicIp.LifecycleState... targetStates) {
        final java.util.Set<com.oracle.bmc.core.model.PublicIp.LifecycleState> targetStatesSet =
                new java.util.HashSet<>(java.util.Arrays.asList(targetStates));

        return new com.oracle.bmc.waiter.internal.SimpleWaiterImpl<>(
                executorService,
                waiter.toCallable(
                        () -> request,
                        new java.util.function.Function<GetPublicIpRequest, GetPublicIpResponse>() {
                            @Override
                            public GetPublicIpResponse apply(GetPublicIpRequest request) {
                                return client.getPublicIp(request);
                            }
                        },
                        new java.util.function.Predicate<GetPublicIpResponse>() {
                            @Override
                            public boolean test(GetPublicIpResponse response) {
                                return targetStatesSet.contains(
                                        response.getPublicIp().getLifecycleState());
                            }
                        },
                        targetStatesSet.contains(
                                com.oracle.bmc.core.model.PublicIp.LifecycleState.Terminated)),
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
    public com.oracle.bmc.waiter.Waiter<GetPublicIpPoolRequest, GetPublicIpPoolResponse>
            forPublicIpPool(
                    GetPublicIpPoolRequest request,
                    com.oracle.bmc.core.model.PublicIpPool.LifecycleState... targetStates) {
        com.oracle.bmc.util.internal.Validate.notEmpty(
                targetStates, "At least one targetState must be provided");
        com.oracle.bmc.util.internal.Validate.noNullElements(
                targetStates, "Null targetState values are not permitted");

        return forPublicIpPool(
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
    public com.oracle.bmc.waiter.Waiter<GetPublicIpPoolRequest, GetPublicIpPoolResponse>
            forPublicIpPool(
                    GetPublicIpPoolRequest request,
                    com.oracle.bmc.core.model.PublicIpPool.LifecycleState targetState,
                    com.oracle.bmc.waiter.TerminationStrategy terminationStrategy,
                    com.oracle.bmc.waiter.DelayStrategy delayStrategy) {
        com.oracle.bmc.util.internal.Validate.notNull(
                targetState, "The targetState cannot be null");

        return forPublicIpPool(
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
    public com.oracle.bmc.waiter.Waiter<GetPublicIpPoolRequest, GetPublicIpPoolResponse>
            forPublicIpPool(
                    GetPublicIpPoolRequest request,
                    com.oracle.bmc.waiter.TerminationStrategy terminationStrategy,
                    com.oracle.bmc.waiter.DelayStrategy delayStrategy,
                    com.oracle.bmc.core.model.PublicIpPool.LifecycleState... targetStates) {
        com.oracle.bmc.util.internal.Validate.notEmpty(
                targetStates, "At least one target state must be provided");
        com.oracle.bmc.util.internal.Validate.noNullElements(
                targetStates, "Null target states are not permitted");

        return forPublicIpPool(
                com.oracle.bmc.waiter.Waiters.newWaiter(terminationStrategy, delayStrategy),
                request,
                targetStates);
    }

    // Helper method to create a new Waiter for PublicIpPool.
    private com.oracle.bmc.waiter.Waiter<GetPublicIpPoolRequest, GetPublicIpPoolResponse>
            forPublicIpPool(
                    com.oracle.bmc.waiter.BmcGenericWaiter waiter,
                    final GetPublicIpPoolRequest request,
                    final com.oracle.bmc.core.model.PublicIpPool.LifecycleState... targetStates) {
        final java.util.Set<com.oracle.bmc.core.model.PublicIpPool.LifecycleState> targetStatesSet =
                new java.util.HashSet<>(java.util.Arrays.asList(targetStates));

        return new com.oracle.bmc.waiter.internal.SimpleWaiterImpl<>(
                executorService,
                waiter.toCallable(
                        () -> request,
                        new java.util.function.Function<
                                GetPublicIpPoolRequest, GetPublicIpPoolResponse>() {
                            @Override
                            public GetPublicIpPoolResponse apply(GetPublicIpPoolRequest request) {
                                return client.getPublicIpPool(request);
                            }
                        },
                        new java.util.function.Predicate<GetPublicIpPoolResponse>() {
                            @Override
                            public boolean test(GetPublicIpPoolResponse response) {
                                return targetStatesSet.contains(
                                        response.getPublicIpPool().getLifecycleState());
                            }
                        },
                        targetStatesSet.contains(
                                com.oracle.bmc.core.model.PublicIpPool.LifecycleState.Deleted)),
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
                    GetRemotePeeringConnectionRequest, GetRemotePeeringConnectionResponse>
            forRemotePeeringConnection(
                    GetRemotePeeringConnectionRequest request,
                    com.oracle.bmc.core.model.RemotePeeringConnection.LifecycleState...
                            targetStates) {
        com.oracle.bmc.util.internal.Validate.notEmpty(
                targetStates, "At least one targetState must be provided");
        com.oracle.bmc.util.internal.Validate.noNullElements(
                targetStates, "Null targetState values are not permitted");

        return forRemotePeeringConnection(
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
                    GetRemotePeeringConnectionRequest, GetRemotePeeringConnectionResponse>
            forRemotePeeringConnection(
                    GetRemotePeeringConnectionRequest request,
                    com.oracle.bmc.core.model.RemotePeeringConnection.LifecycleState targetState,
                    com.oracle.bmc.waiter.TerminationStrategy terminationStrategy,
                    com.oracle.bmc.waiter.DelayStrategy delayStrategy) {
        com.oracle.bmc.util.internal.Validate.notNull(
                targetState, "The targetState cannot be null");

        return forRemotePeeringConnection(
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
                    GetRemotePeeringConnectionRequest, GetRemotePeeringConnectionResponse>
            forRemotePeeringConnection(
                    GetRemotePeeringConnectionRequest request,
                    com.oracle.bmc.waiter.TerminationStrategy terminationStrategy,
                    com.oracle.bmc.waiter.DelayStrategy delayStrategy,
                    com.oracle.bmc.core.model.RemotePeeringConnection.LifecycleState...
                            targetStates) {
        com.oracle.bmc.util.internal.Validate.notEmpty(
                targetStates, "At least one target state must be provided");
        com.oracle.bmc.util.internal.Validate.noNullElements(
                targetStates, "Null target states are not permitted");

        return forRemotePeeringConnection(
                com.oracle.bmc.waiter.Waiters.newWaiter(terminationStrategy, delayStrategy),
                request,
                targetStates);
    }

    // Helper method to create a new Waiter for RemotePeeringConnection.
    private com.oracle.bmc.waiter.Waiter<
                    GetRemotePeeringConnectionRequest, GetRemotePeeringConnectionResponse>
            forRemotePeeringConnection(
                    com.oracle.bmc.waiter.BmcGenericWaiter waiter,
                    final GetRemotePeeringConnectionRequest request,
                    final com.oracle.bmc.core.model.RemotePeeringConnection.LifecycleState...
                            targetStates) {
        final java.util.Set<com.oracle.bmc.core.model.RemotePeeringConnection.LifecycleState>
                targetStatesSet = new java.util.HashSet<>(java.util.Arrays.asList(targetStates));

        return new com.oracle.bmc.waiter.internal.SimpleWaiterImpl<>(
                executorService,
                waiter.toCallable(
                        () -> request,
                        new java.util.function.Function<
                                GetRemotePeeringConnectionRequest,
                                GetRemotePeeringConnectionResponse>() {
                            @Override
                            public GetRemotePeeringConnectionResponse apply(
                                    GetRemotePeeringConnectionRequest request) {
                                return client.getRemotePeeringConnection(request);
                            }
                        },
                        new java.util.function.Predicate<GetRemotePeeringConnectionResponse>() {
                            @Override
                            public boolean test(GetRemotePeeringConnectionResponse response) {
                                return targetStatesSet.contains(
                                        response.getRemotePeeringConnection().getLifecycleState());
                            }
                        },
                        targetStatesSet.contains(
                                com.oracle.bmc.core.model.RemotePeeringConnection.LifecycleState
                                        .Terminated)),
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
                    GetRemotePeeringConnectionRequest, GetRemotePeeringConnectionResponse>
            forRemotePeeringConnection(
                    GetRemotePeeringConnectionRequest request,
                    com.oracle.bmc.core.model.RemotePeeringConnection.PeeringStatus...
                            targetStates) {
        com.oracle.bmc.util.internal.Validate.notEmpty(
                targetStates, "At least one targetState must be provided");
        com.oracle.bmc.util.internal.Validate.noNullElements(
                targetStates, "Null targetState values are not permitted");

        return forRemotePeeringConnection(
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
                    GetRemotePeeringConnectionRequest, GetRemotePeeringConnectionResponse>
            forRemotePeeringConnection(
                    GetRemotePeeringConnectionRequest request,
                    com.oracle.bmc.core.model.RemotePeeringConnection.PeeringStatus targetState,
                    com.oracle.bmc.waiter.TerminationStrategy terminationStrategy,
                    com.oracle.bmc.waiter.DelayStrategy delayStrategy) {
        com.oracle.bmc.util.internal.Validate.notNull(
                targetState, "The targetState cannot be null");

        return forRemotePeeringConnection(
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
                    GetRemotePeeringConnectionRequest, GetRemotePeeringConnectionResponse>
            forRemotePeeringConnection(
                    GetRemotePeeringConnectionRequest request,
                    com.oracle.bmc.waiter.TerminationStrategy terminationStrategy,
                    com.oracle.bmc.waiter.DelayStrategy delayStrategy,
                    com.oracle.bmc.core.model.RemotePeeringConnection.PeeringStatus...
                            targetStates) {
        com.oracle.bmc.util.internal.Validate.notEmpty(
                targetStates, "At least one target state must be provided");
        com.oracle.bmc.util.internal.Validate.noNullElements(
                targetStates, "Null target states are not permitted");

        return forRemotePeeringConnection(
                com.oracle.bmc.waiter.Waiters.newWaiter(terminationStrategy, delayStrategy),
                request,
                targetStates);
    }

    // Helper method to create a new Waiter for RemotePeeringConnection.
    private com.oracle.bmc.waiter.Waiter<
                    GetRemotePeeringConnectionRequest, GetRemotePeeringConnectionResponse>
            forRemotePeeringConnection(
                    com.oracle.bmc.waiter.BmcGenericWaiter waiter,
                    final GetRemotePeeringConnectionRequest request,
                    final com.oracle.bmc.core.model.RemotePeeringConnection.PeeringStatus...
                            targetStates) {
        final java.util.Set<com.oracle.bmc.core.model.RemotePeeringConnection.PeeringStatus>
                targetStatesSet = new java.util.HashSet<>(java.util.Arrays.asList(targetStates));

        return new com.oracle.bmc.waiter.internal.SimpleWaiterImpl<>(
                executorService,
                waiter.toCallable(
                        () -> request,
                        new java.util.function.Function<
                                GetRemotePeeringConnectionRequest,
                                GetRemotePeeringConnectionResponse>() {
                            @Override
                            public GetRemotePeeringConnectionResponse apply(
                                    GetRemotePeeringConnectionRequest request) {
                                return client.getRemotePeeringConnection(request);
                            }
                        },
                        new java.util.function.Predicate<GetRemotePeeringConnectionResponse>() {
                            @Override
                            public boolean test(GetRemotePeeringConnectionResponse response) {
                                return targetStatesSet.contains(
                                        response.getRemotePeeringConnection().getPeeringStatus());
                            }
                        },
                        targetStatesSet.contains(
                                com.oracle.bmc.core.model.RemotePeeringConnection.PeeringStatus
                                        .Revoked)),
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
    public com.oracle.bmc.waiter.Waiter<GetRouteTableRequest, GetRouteTableResponse> forRouteTable(
            GetRouteTableRequest request,
            com.oracle.bmc.core.model.RouteTable.LifecycleState... targetStates) {
        com.oracle.bmc.util.internal.Validate.notEmpty(
                targetStates, "At least one targetState must be provided");
        com.oracle.bmc.util.internal.Validate.noNullElements(
                targetStates, "Null targetState values are not permitted");

        return forRouteTable(
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
    public com.oracle.bmc.waiter.Waiter<GetRouteTableRequest, GetRouteTableResponse> forRouteTable(
            GetRouteTableRequest request,
            com.oracle.bmc.core.model.RouteTable.LifecycleState targetState,
            com.oracle.bmc.waiter.TerminationStrategy terminationStrategy,
            com.oracle.bmc.waiter.DelayStrategy delayStrategy) {
        com.oracle.bmc.util.internal.Validate.notNull(
                targetState, "The targetState cannot be null");

        return forRouteTable(
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
    public com.oracle.bmc.waiter.Waiter<GetRouteTableRequest, GetRouteTableResponse> forRouteTable(
            GetRouteTableRequest request,
            com.oracle.bmc.waiter.TerminationStrategy terminationStrategy,
            com.oracle.bmc.waiter.DelayStrategy delayStrategy,
            com.oracle.bmc.core.model.RouteTable.LifecycleState... targetStates) {
        com.oracle.bmc.util.internal.Validate.notEmpty(
                targetStates, "At least one target state must be provided");
        com.oracle.bmc.util.internal.Validate.noNullElements(
                targetStates, "Null target states are not permitted");

        return forRouteTable(
                com.oracle.bmc.waiter.Waiters.newWaiter(terminationStrategy, delayStrategy),
                request,
                targetStates);
    }

    // Helper method to create a new Waiter for RouteTable.
    private com.oracle.bmc.waiter.Waiter<GetRouteTableRequest, GetRouteTableResponse> forRouteTable(
            com.oracle.bmc.waiter.BmcGenericWaiter waiter,
            final GetRouteTableRequest request,
            final com.oracle.bmc.core.model.RouteTable.LifecycleState... targetStates) {
        final java.util.Set<com.oracle.bmc.core.model.RouteTable.LifecycleState> targetStatesSet =
                new java.util.HashSet<>(java.util.Arrays.asList(targetStates));

        return new com.oracle.bmc.waiter.internal.SimpleWaiterImpl<>(
                executorService,
                waiter.toCallable(
                        () -> request,
                        new java.util.function.Function<
                                GetRouteTableRequest, GetRouteTableResponse>() {
                            @Override
                            public GetRouteTableResponse apply(GetRouteTableRequest request) {
                                return client.getRouteTable(request);
                            }
                        },
                        new java.util.function.Predicate<GetRouteTableResponse>() {
                            @Override
                            public boolean test(GetRouteTableResponse response) {
                                return targetStatesSet.contains(
                                        response.getRouteTable().getLifecycleState());
                            }
                        },
                        targetStatesSet.contains(
                                com.oracle.bmc.core.model.RouteTable.LifecycleState.Terminated)),
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
    public com.oracle.bmc.waiter.Waiter<GetSecurityListRequest, GetSecurityListResponse>
            forSecurityList(
                    GetSecurityListRequest request,
                    com.oracle.bmc.core.model.SecurityList.LifecycleState... targetStates) {
        com.oracle.bmc.util.internal.Validate.notEmpty(
                targetStates, "At least one targetState must be provided");
        com.oracle.bmc.util.internal.Validate.noNullElements(
                targetStates, "Null targetState values are not permitted");

        return forSecurityList(
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
    public com.oracle.bmc.waiter.Waiter<GetSecurityListRequest, GetSecurityListResponse>
            forSecurityList(
                    GetSecurityListRequest request,
                    com.oracle.bmc.core.model.SecurityList.LifecycleState targetState,
                    com.oracle.bmc.waiter.TerminationStrategy terminationStrategy,
                    com.oracle.bmc.waiter.DelayStrategy delayStrategy) {
        com.oracle.bmc.util.internal.Validate.notNull(
                targetState, "The targetState cannot be null");

        return forSecurityList(
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
    public com.oracle.bmc.waiter.Waiter<GetSecurityListRequest, GetSecurityListResponse>
            forSecurityList(
                    GetSecurityListRequest request,
                    com.oracle.bmc.waiter.TerminationStrategy terminationStrategy,
                    com.oracle.bmc.waiter.DelayStrategy delayStrategy,
                    com.oracle.bmc.core.model.SecurityList.LifecycleState... targetStates) {
        com.oracle.bmc.util.internal.Validate.notEmpty(
                targetStates, "At least one target state must be provided");
        com.oracle.bmc.util.internal.Validate.noNullElements(
                targetStates, "Null target states are not permitted");

        return forSecurityList(
                com.oracle.bmc.waiter.Waiters.newWaiter(terminationStrategy, delayStrategy),
                request,
                targetStates);
    }

    // Helper method to create a new Waiter for SecurityList.
    private com.oracle.bmc.waiter.Waiter<GetSecurityListRequest, GetSecurityListResponse>
            forSecurityList(
                    com.oracle.bmc.waiter.BmcGenericWaiter waiter,
                    final GetSecurityListRequest request,
                    final com.oracle.bmc.core.model.SecurityList.LifecycleState... targetStates) {
        final java.util.Set<com.oracle.bmc.core.model.SecurityList.LifecycleState> targetStatesSet =
                new java.util.HashSet<>(java.util.Arrays.asList(targetStates));

        return new com.oracle.bmc.waiter.internal.SimpleWaiterImpl<>(
                executorService,
                waiter.toCallable(
                        () -> request,
                        new java.util.function.Function<
                                GetSecurityListRequest, GetSecurityListResponse>() {
                            @Override
                            public GetSecurityListResponse apply(GetSecurityListRequest request) {
                                return client.getSecurityList(request);
                            }
                        },
                        new java.util.function.Predicate<GetSecurityListResponse>() {
                            @Override
                            public boolean test(GetSecurityListResponse response) {
                                return targetStatesSet.contains(
                                        response.getSecurityList().getLifecycleState());
                            }
                        },
                        targetStatesSet.contains(
                                com.oracle.bmc.core.model.SecurityList.LifecycleState.Terminated)),
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
    public com.oracle.bmc.waiter.Waiter<GetServiceGatewayRequest, GetServiceGatewayResponse>
            forServiceGateway(
                    GetServiceGatewayRequest request,
                    com.oracle.bmc.core.model.ServiceGateway.LifecycleState... targetStates) {
        com.oracle.bmc.util.internal.Validate.notEmpty(
                targetStates, "At least one targetState must be provided");
        com.oracle.bmc.util.internal.Validate.noNullElements(
                targetStates, "Null targetState values are not permitted");

        return forServiceGateway(
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
    public com.oracle.bmc.waiter.Waiter<GetServiceGatewayRequest, GetServiceGatewayResponse>
            forServiceGateway(
                    GetServiceGatewayRequest request,
                    com.oracle.bmc.core.model.ServiceGateway.LifecycleState targetState,
                    com.oracle.bmc.waiter.TerminationStrategy terminationStrategy,
                    com.oracle.bmc.waiter.DelayStrategy delayStrategy) {
        com.oracle.bmc.util.internal.Validate.notNull(
                targetState, "The targetState cannot be null");

        return forServiceGateway(
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
    public com.oracle.bmc.waiter.Waiter<GetServiceGatewayRequest, GetServiceGatewayResponse>
            forServiceGateway(
                    GetServiceGatewayRequest request,
                    com.oracle.bmc.waiter.TerminationStrategy terminationStrategy,
                    com.oracle.bmc.waiter.DelayStrategy delayStrategy,
                    com.oracle.bmc.core.model.ServiceGateway.LifecycleState... targetStates) {
        com.oracle.bmc.util.internal.Validate.notEmpty(
                targetStates, "At least one target state must be provided");
        com.oracle.bmc.util.internal.Validate.noNullElements(
                targetStates, "Null target states are not permitted");

        return forServiceGateway(
                com.oracle.bmc.waiter.Waiters.newWaiter(terminationStrategy, delayStrategy),
                request,
                targetStates);
    }

    // Helper method to create a new Waiter for ServiceGateway.
    private com.oracle.bmc.waiter.Waiter<GetServiceGatewayRequest, GetServiceGatewayResponse>
            forServiceGateway(
                    com.oracle.bmc.waiter.BmcGenericWaiter waiter,
                    final GetServiceGatewayRequest request,
                    final com.oracle.bmc.core.model.ServiceGateway.LifecycleState... targetStates) {
        final java.util.Set<com.oracle.bmc.core.model.ServiceGateway.LifecycleState>
                targetStatesSet = new java.util.HashSet<>(java.util.Arrays.asList(targetStates));

        return new com.oracle.bmc.waiter.internal.SimpleWaiterImpl<>(
                executorService,
                waiter.toCallable(
                        () -> request,
                        new java.util.function.Function<
                                GetServiceGatewayRequest, GetServiceGatewayResponse>() {
                            @Override
                            public GetServiceGatewayResponse apply(
                                    GetServiceGatewayRequest request) {
                                return client.getServiceGateway(request);
                            }
                        },
                        new java.util.function.Predicate<GetServiceGatewayResponse>() {
                            @Override
                            public boolean test(GetServiceGatewayResponse response) {
                                return targetStatesSet.contains(
                                        response.getServiceGateway().getLifecycleState());
                            }
                        },
                        targetStatesSet.contains(
                                com.oracle.bmc.core.model.ServiceGateway.LifecycleState
                                        .Terminated)),
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
    public com.oracle.bmc.waiter.Waiter<GetSubnetRequest, GetSubnetResponse> forSubnet(
            GetSubnetRequest request,
            com.oracle.bmc.core.model.Subnet.LifecycleState... targetStates) {
        com.oracle.bmc.util.internal.Validate.notEmpty(
                targetStates, "At least one targetState must be provided");
        com.oracle.bmc.util.internal.Validate.noNullElements(
                targetStates, "Null targetState values are not permitted");

        return forSubnet(
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
    public com.oracle.bmc.waiter.Waiter<GetSubnetRequest, GetSubnetResponse> forSubnet(
            GetSubnetRequest request,
            com.oracle.bmc.core.model.Subnet.LifecycleState targetState,
            com.oracle.bmc.waiter.TerminationStrategy terminationStrategy,
            com.oracle.bmc.waiter.DelayStrategy delayStrategy) {
        com.oracle.bmc.util.internal.Validate.notNull(
                targetState, "The targetState cannot be null");

        return forSubnet(
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
    public com.oracle.bmc.waiter.Waiter<GetSubnetRequest, GetSubnetResponse> forSubnet(
            GetSubnetRequest request,
            com.oracle.bmc.waiter.TerminationStrategy terminationStrategy,
            com.oracle.bmc.waiter.DelayStrategy delayStrategy,
            com.oracle.bmc.core.model.Subnet.LifecycleState... targetStates) {
        com.oracle.bmc.util.internal.Validate.notEmpty(
                targetStates, "At least one target state must be provided");
        com.oracle.bmc.util.internal.Validate.noNullElements(
                targetStates, "Null target states are not permitted");

        return forSubnet(
                com.oracle.bmc.waiter.Waiters.newWaiter(terminationStrategy, delayStrategy),
                request,
                targetStates);
    }

    // Helper method to create a new Waiter for Subnet.
    private com.oracle.bmc.waiter.Waiter<GetSubnetRequest, GetSubnetResponse> forSubnet(
            com.oracle.bmc.waiter.BmcGenericWaiter waiter,
            final GetSubnetRequest request,
            final com.oracle.bmc.core.model.Subnet.LifecycleState... targetStates) {
        final java.util.Set<com.oracle.bmc.core.model.Subnet.LifecycleState> targetStatesSet =
                new java.util.HashSet<>(java.util.Arrays.asList(targetStates));

        return new com.oracle.bmc.waiter.internal.SimpleWaiterImpl<>(
                executorService,
                waiter.toCallable(
                        () -> request,
                        new java.util.function.Function<GetSubnetRequest, GetSubnetResponse>() {
                            @Override
                            public GetSubnetResponse apply(GetSubnetRequest request) {
                                return client.getSubnet(request);
                            }
                        },
                        new java.util.function.Predicate<GetSubnetResponse>() {
                            @Override
                            public boolean test(GetSubnetResponse response) {
                                return targetStatesSet.contains(
                                        response.getSubnet().getLifecycleState());
                            }
                        },
                        targetStatesSet.contains(
                                com.oracle.bmc.core.model.Subnet.LifecycleState.Terminated)),
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
    public com.oracle.bmc.waiter.Waiter<GetVcnRequest, GetVcnResponse> forVcn(
            GetVcnRequest request, com.oracle.bmc.core.model.Vcn.LifecycleState... targetStates) {
        com.oracle.bmc.util.internal.Validate.notEmpty(
                targetStates, "At least one targetState must be provided");
        com.oracle.bmc.util.internal.Validate.noNullElements(
                targetStates, "Null targetState values are not permitted");

        return forVcn(com.oracle.bmc.waiter.Waiters.DEFAULT_POLLING_WAITER, request, targetStates);
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
    public com.oracle.bmc.waiter.Waiter<GetVcnRequest, GetVcnResponse> forVcn(
            GetVcnRequest request,
            com.oracle.bmc.core.model.Vcn.LifecycleState targetState,
            com.oracle.bmc.waiter.TerminationStrategy terminationStrategy,
            com.oracle.bmc.waiter.DelayStrategy delayStrategy) {
        com.oracle.bmc.util.internal.Validate.notNull(
                targetState, "The targetState cannot be null");

        return forVcn(
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
    public com.oracle.bmc.waiter.Waiter<GetVcnRequest, GetVcnResponse> forVcn(
            GetVcnRequest request,
            com.oracle.bmc.waiter.TerminationStrategy terminationStrategy,
            com.oracle.bmc.waiter.DelayStrategy delayStrategy,
            com.oracle.bmc.core.model.Vcn.LifecycleState... targetStates) {
        com.oracle.bmc.util.internal.Validate.notEmpty(
                targetStates, "At least one target state must be provided");
        com.oracle.bmc.util.internal.Validate.noNullElements(
                targetStates, "Null target states are not permitted");

        return forVcn(
                com.oracle.bmc.waiter.Waiters.newWaiter(terminationStrategy, delayStrategy),
                request,
                targetStates);
    }

    // Helper method to create a new Waiter for Vcn.
    private com.oracle.bmc.waiter.Waiter<GetVcnRequest, GetVcnResponse> forVcn(
            com.oracle.bmc.waiter.BmcGenericWaiter waiter,
            final GetVcnRequest request,
            final com.oracle.bmc.core.model.Vcn.LifecycleState... targetStates) {
        final java.util.Set<com.oracle.bmc.core.model.Vcn.LifecycleState> targetStatesSet =
                new java.util.HashSet<>(java.util.Arrays.asList(targetStates));

        return new com.oracle.bmc.waiter.internal.SimpleWaiterImpl<>(
                executorService,
                waiter.toCallable(
                        () -> request,
                        new java.util.function.Function<GetVcnRequest, GetVcnResponse>() {
                            @Override
                            public GetVcnResponse apply(GetVcnRequest request) {
                                return client.getVcn(request);
                            }
                        },
                        new java.util.function.Predicate<GetVcnResponse>() {
                            @Override
                            public boolean test(GetVcnResponse response) {
                                return targetStatesSet.contains(
                                        response.getVcn().getLifecycleState());
                            }
                        },
                        targetStatesSet.contains(
                                com.oracle.bmc.core.model.Vcn.LifecycleState.Terminated)),
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
                    GetVcnDnsResolverAssociationRequest, GetVcnDnsResolverAssociationResponse>
            forVcnDnsResolverAssociation(
                    GetVcnDnsResolverAssociationRequest request,
                    com.oracle.bmc.core.model.VcnDnsResolverAssociation.LifecycleState...
                            targetStates) {
        com.oracle.bmc.util.internal.Validate.notEmpty(
                targetStates, "At least one targetState must be provided");
        com.oracle.bmc.util.internal.Validate.noNullElements(
                targetStates, "Null targetState values are not permitted");

        return forVcnDnsResolverAssociation(
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
                    GetVcnDnsResolverAssociationRequest, GetVcnDnsResolverAssociationResponse>
            forVcnDnsResolverAssociation(
                    GetVcnDnsResolverAssociationRequest request,
                    com.oracle.bmc.core.model.VcnDnsResolverAssociation.LifecycleState targetState,
                    com.oracle.bmc.waiter.TerminationStrategy terminationStrategy,
                    com.oracle.bmc.waiter.DelayStrategy delayStrategy) {
        com.oracle.bmc.util.internal.Validate.notNull(
                targetState, "The targetState cannot be null");

        return forVcnDnsResolverAssociation(
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
                    GetVcnDnsResolverAssociationRequest, GetVcnDnsResolverAssociationResponse>
            forVcnDnsResolverAssociation(
                    GetVcnDnsResolverAssociationRequest request,
                    com.oracle.bmc.waiter.TerminationStrategy terminationStrategy,
                    com.oracle.bmc.waiter.DelayStrategy delayStrategy,
                    com.oracle.bmc.core.model.VcnDnsResolverAssociation.LifecycleState...
                            targetStates) {
        com.oracle.bmc.util.internal.Validate.notEmpty(
                targetStates, "At least one target state must be provided");
        com.oracle.bmc.util.internal.Validate.noNullElements(
                targetStates, "Null target states are not permitted");

        return forVcnDnsResolverAssociation(
                com.oracle.bmc.waiter.Waiters.newWaiter(terminationStrategy, delayStrategy),
                request,
                targetStates);
    }

    // Helper method to create a new Waiter for VcnDnsResolverAssociation.
    private com.oracle.bmc.waiter.Waiter<
                    GetVcnDnsResolverAssociationRequest, GetVcnDnsResolverAssociationResponse>
            forVcnDnsResolverAssociation(
                    com.oracle.bmc.waiter.BmcGenericWaiter waiter,
                    final GetVcnDnsResolverAssociationRequest request,
                    final com.oracle.bmc.core.model.VcnDnsResolverAssociation.LifecycleState...
                            targetStates) {
        final java.util.Set<com.oracle.bmc.core.model.VcnDnsResolverAssociation.LifecycleState>
                targetStatesSet = new java.util.HashSet<>(java.util.Arrays.asList(targetStates));

        return new com.oracle.bmc.waiter.internal.SimpleWaiterImpl<>(
                executorService,
                waiter.toCallable(
                        () -> request,
                        new java.util.function.Function<
                                GetVcnDnsResolverAssociationRequest,
                                GetVcnDnsResolverAssociationResponse>() {
                            @Override
                            public GetVcnDnsResolverAssociationResponse apply(
                                    GetVcnDnsResolverAssociationRequest request) {
                                return client.getVcnDnsResolverAssociation(request);
                            }
                        },
                        new java.util.function.Predicate<GetVcnDnsResolverAssociationResponse>() {
                            @Override
                            public boolean test(GetVcnDnsResolverAssociationResponse response) {
                                return targetStatesSet.contains(
                                        response.getVcnDnsResolverAssociation()
                                                .getLifecycleState());
                            }
                        },
                        targetStatesSet.contains(
                                com.oracle.bmc.core.model.VcnDnsResolverAssociation.LifecycleState
                                        .Terminated)),
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
    public com.oracle.bmc.waiter.Waiter<GetVirtualCircuitRequest, GetVirtualCircuitResponse>
            forVirtualCircuit(
                    GetVirtualCircuitRequest request,
                    com.oracle.bmc.core.model.VirtualCircuit.LifecycleState... targetStates) {
        com.oracle.bmc.util.internal.Validate.notEmpty(
                targetStates, "At least one targetState must be provided");
        com.oracle.bmc.util.internal.Validate.noNullElements(
                targetStates, "Null targetState values are not permitted");

        return forVirtualCircuit(
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
    public com.oracle.bmc.waiter.Waiter<GetVirtualCircuitRequest, GetVirtualCircuitResponse>
            forVirtualCircuit(
                    GetVirtualCircuitRequest request,
                    com.oracle.bmc.core.model.VirtualCircuit.LifecycleState targetState,
                    com.oracle.bmc.waiter.TerminationStrategy terminationStrategy,
                    com.oracle.bmc.waiter.DelayStrategy delayStrategy) {
        com.oracle.bmc.util.internal.Validate.notNull(
                targetState, "The targetState cannot be null");

        return forVirtualCircuit(
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
    public com.oracle.bmc.waiter.Waiter<GetVirtualCircuitRequest, GetVirtualCircuitResponse>
            forVirtualCircuit(
                    GetVirtualCircuitRequest request,
                    com.oracle.bmc.waiter.TerminationStrategy terminationStrategy,
                    com.oracle.bmc.waiter.DelayStrategy delayStrategy,
                    com.oracle.bmc.core.model.VirtualCircuit.LifecycleState... targetStates) {
        com.oracle.bmc.util.internal.Validate.notEmpty(
                targetStates, "At least one target state must be provided");
        com.oracle.bmc.util.internal.Validate.noNullElements(
                targetStates, "Null target states are not permitted");

        return forVirtualCircuit(
                com.oracle.bmc.waiter.Waiters.newWaiter(terminationStrategy, delayStrategy),
                request,
                targetStates);
    }

    // Helper method to create a new Waiter for VirtualCircuit.
    private com.oracle.bmc.waiter.Waiter<GetVirtualCircuitRequest, GetVirtualCircuitResponse>
            forVirtualCircuit(
                    com.oracle.bmc.waiter.BmcGenericWaiter waiter,
                    final GetVirtualCircuitRequest request,
                    final com.oracle.bmc.core.model.VirtualCircuit.LifecycleState... targetStates) {
        final java.util.Set<com.oracle.bmc.core.model.VirtualCircuit.LifecycleState>
                targetStatesSet = new java.util.HashSet<>(java.util.Arrays.asList(targetStates));

        return new com.oracle.bmc.waiter.internal.SimpleWaiterImpl<>(
                executorService,
                waiter.toCallable(
                        () -> request,
                        new java.util.function.Function<
                                GetVirtualCircuitRequest, GetVirtualCircuitResponse>() {
                            @Override
                            public GetVirtualCircuitResponse apply(
                                    GetVirtualCircuitRequest request) {
                                return client.getVirtualCircuit(request);
                            }
                        },
                        new java.util.function.Predicate<GetVirtualCircuitResponse>() {
                            @Override
                            public boolean test(GetVirtualCircuitResponse response) {
                                return targetStatesSet.contains(
                                        response.getVirtualCircuit().getLifecycleState());
                            }
                        },
                        targetStatesSet.contains(
                                com.oracle.bmc.core.model.VirtualCircuit.LifecycleState
                                        .Terminated)),
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
    public com.oracle.bmc.waiter.Waiter<GetVlanRequest, GetVlanResponse> forVlan(
            GetVlanRequest request, com.oracle.bmc.core.model.Vlan.LifecycleState... targetStates) {
        com.oracle.bmc.util.internal.Validate.notEmpty(
                targetStates, "At least one targetState must be provided");
        com.oracle.bmc.util.internal.Validate.noNullElements(
                targetStates, "Null targetState values are not permitted");

        return forVlan(com.oracle.bmc.waiter.Waiters.DEFAULT_POLLING_WAITER, request, targetStates);
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
    public com.oracle.bmc.waiter.Waiter<GetVlanRequest, GetVlanResponse> forVlan(
            GetVlanRequest request,
            com.oracle.bmc.core.model.Vlan.LifecycleState targetState,
            com.oracle.bmc.waiter.TerminationStrategy terminationStrategy,
            com.oracle.bmc.waiter.DelayStrategy delayStrategy) {
        com.oracle.bmc.util.internal.Validate.notNull(
                targetState, "The targetState cannot be null");

        return forVlan(
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
    public com.oracle.bmc.waiter.Waiter<GetVlanRequest, GetVlanResponse> forVlan(
            GetVlanRequest request,
            com.oracle.bmc.waiter.TerminationStrategy terminationStrategy,
            com.oracle.bmc.waiter.DelayStrategy delayStrategy,
            com.oracle.bmc.core.model.Vlan.LifecycleState... targetStates) {
        com.oracle.bmc.util.internal.Validate.notEmpty(
                targetStates, "At least one target state must be provided");
        com.oracle.bmc.util.internal.Validate.noNullElements(
                targetStates, "Null target states are not permitted");

        return forVlan(
                com.oracle.bmc.waiter.Waiters.newWaiter(terminationStrategy, delayStrategy),
                request,
                targetStates);
    }

    // Helper method to create a new Waiter for Vlan.
    private com.oracle.bmc.waiter.Waiter<GetVlanRequest, GetVlanResponse> forVlan(
            com.oracle.bmc.waiter.BmcGenericWaiter waiter,
            final GetVlanRequest request,
            final com.oracle.bmc.core.model.Vlan.LifecycleState... targetStates) {
        final java.util.Set<com.oracle.bmc.core.model.Vlan.LifecycleState> targetStatesSet =
                new java.util.HashSet<>(java.util.Arrays.asList(targetStates));

        return new com.oracle.bmc.waiter.internal.SimpleWaiterImpl<>(
                executorService,
                waiter.toCallable(
                        () -> request,
                        new java.util.function.Function<GetVlanRequest, GetVlanResponse>() {
                            @Override
                            public GetVlanResponse apply(GetVlanRequest request) {
                                return client.getVlan(request);
                            }
                        },
                        new java.util.function.Predicate<GetVlanResponse>() {
                            @Override
                            public boolean test(GetVlanResponse response) {
                                return targetStatesSet.contains(
                                        response.getVlan().getLifecycleState());
                            }
                        },
                        targetStatesSet.contains(
                                com.oracle.bmc.core.model.Vlan.LifecycleState.Terminated)),
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
    public com.oracle.bmc.waiter.Waiter<GetVnicRequest, GetVnicResponse> forVnic(
            GetVnicRequest request, com.oracle.bmc.core.model.Vnic.LifecycleState... targetStates) {
        com.oracle.bmc.util.internal.Validate.notEmpty(
                targetStates, "At least one targetState must be provided");
        com.oracle.bmc.util.internal.Validate.noNullElements(
                targetStates, "Null targetState values are not permitted");

        return forVnic(com.oracle.bmc.waiter.Waiters.DEFAULT_POLLING_WAITER, request, targetStates);
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
    public com.oracle.bmc.waiter.Waiter<GetVnicRequest, GetVnicResponse> forVnic(
            GetVnicRequest request,
            com.oracle.bmc.core.model.Vnic.LifecycleState targetState,
            com.oracle.bmc.waiter.TerminationStrategy terminationStrategy,
            com.oracle.bmc.waiter.DelayStrategy delayStrategy) {
        com.oracle.bmc.util.internal.Validate.notNull(
                targetState, "The targetState cannot be null");

        return forVnic(
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
    public com.oracle.bmc.waiter.Waiter<GetVnicRequest, GetVnicResponse> forVnic(
            GetVnicRequest request,
            com.oracle.bmc.waiter.TerminationStrategy terminationStrategy,
            com.oracle.bmc.waiter.DelayStrategy delayStrategy,
            com.oracle.bmc.core.model.Vnic.LifecycleState... targetStates) {
        com.oracle.bmc.util.internal.Validate.notEmpty(
                targetStates, "At least one target state must be provided");
        com.oracle.bmc.util.internal.Validate.noNullElements(
                targetStates, "Null target states are not permitted");

        return forVnic(
                com.oracle.bmc.waiter.Waiters.newWaiter(terminationStrategy, delayStrategy),
                request,
                targetStates);
    }

    // Helper method to create a new Waiter for Vnic.
    private com.oracle.bmc.waiter.Waiter<GetVnicRequest, GetVnicResponse> forVnic(
            com.oracle.bmc.waiter.BmcGenericWaiter waiter,
            final GetVnicRequest request,
            final com.oracle.bmc.core.model.Vnic.LifecycleState... targetStates) {
        final java.util.Set<com.oracle.bmc.core.model.Vnic.LifecycleState> targetStatesSet =
                new java.util.HashSet<>(java.util.Arrays.asList(targetStates));

        return new com.oracle.bmc.waiter.internal.SimpleWaiterImpl<>(
                executorService,
                waiter.toCallable(
                        () -> request,
                        new java.util.function.Function<GetVnicRequest, GetVnicResponse>() {
                            @Override
                            public GetVnicResponse apply(GetVnicRequest request) {
                                return client.getVnic(request);
                            }
                        },
                        new java.util.function.Predicate<GetVnicResponse>() {
                            @Override
                            public boolean test(GetVnicResponse response) {
                                return targetStatesSet.contains(
                                        response.getVnic().getLifecycleState());
                            }
                        },
                        targetStatesSet.contains(
                                com.oracle.bmc.core.model.Vnic.LifecycleState.Terminated)),
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
    public com.oracle.bmc.waiter.Waiter<GetVtapRequest, GetVtapResponse> forVtap(
            GetVtapRequest request, com.oracle.bmc.core.model.Vtap.LifecycleState... targetStates) {
        com.oracle.bmc.util.internal.Validate.notEmpty(
                targetStates, "At least one targetState must be provided");
        com.oracle.bmc.util.internal.Validate.noNullElements(
                targetStates, "Null targetState values are not permitted");

        return forVtap(com.oracle.bmc.waiter.Waiters.DEFAULT_POLLING_WAITER, request, targetStates);
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
    public com.oracle.bmc.waiter.Waiter<GetVtapRequest, GetVtapResponse> forVtap(
            GetVtapRequest request,
            com.oracle.bmc.core.model.Vtap.LifecycleState targetState,
            com.oracle.bmc.waiter.TerminationStrategy terminationStrategy,
            com.oracle.bmc.waiter.DelayStrategy delayStrategy) {
        com.oracle.bmc.util.internal.Validate.notNull(
                targetState, "The targetState cannot be null");

        return forVtap(
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
    public com.oracle.bmc.waiter.Waiter<GetVtapRequest, GetVtapResponse> forVtap(
            GetVtapRequest request,
            com.oracle.bmc.waiter.TerminationStrategy terminationStrategy,
            com.oracle.bmc.waiter.DelayStrategy delayStrategy,
            com.oracle.bmc.core.model.Vtap.LifecycleState... targetStates) {
        com.oracle.bmc.util.internal.Validate.notEmpty(
                targetStates, "At least one target state must be provided");
        com.oracle.bmc.util.internal.Validate.noNullElements(
                targetStates, "Null target states are not permitted");

        return forVtap(
                com.oracle.bmc.waiter.Waiters.newWaiter(terminationStrategy, delayStrategy),
                request,
                targetStates);
    }

    // Helper method to create a new Waiter for Vtap.
    private com.oracle.bmc.waiter.Waiter<GetVtapRequest, GetVtapResponse> forVtap(
            com.oracle.bmc.waiter.BmcGenericWaiter waiter,
            final GetVtapRequest request,
            final com.oracle.bmc.core.model.Vtap.LifecycleState... targetStates) {
        final java.util.Set<com.oracle.bmc.core.model.Vtap.LifecycleState> targetStatesSet =
                new java.util.HashSet<>(java.util.Arrays.asList(targetStates));

        return new com.oracle.bmc.waiter.internal.SimpleWaiterImpl<>(
                executorService,
                waiter.toCallable(
                        () -> request,
                        new java.util.function.Function<GetVtapRequest, GetVtapResponse>() {
                            @Override
                            public GetVtapResponse apply(GetVtapRequest request) {
                                return client.getVtap(request);
                            }
                        },
                        new java.util.function.Predicate<GetVtapResponse>() {
                            @Override
                            public boolean test(GetVtapResponse response) {
                                return targetStatesSet.contains(
                                        response.getVtap().getLifecycleState());
                            }
                        },
                        targetStatesSet.contains(
                                com.oracle.bmc.core.model.Vtap.LifecycleState.Terminated)),
                request);
    }

    /**
     * Creates a new {@link com.oracle.bmc.waiter.Waiter} using the default configuration.
     *
     * @param request the request to send
     * @return a new {@link com.oracle.bmc.waiter.Waiter} instance
     */
    public com.oracle.bmc.waiter.Waiter<ModifyVcnCidrRequest, ModifyVcnCidrResponse>
            forModifyVcnCidr(ModifyVcnCidrRequest request) {
        return forModifyVcnCidr(
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
    public com.oracle.bmc.waiter.Waiter<ModifyVcnCidrRequest, ModifyVcnCidrResponse>
            forModifyVcnCidr(
                    ModifyVcnCidrRequest request,
                    com.oracle.bmc.waiter.TerminationStrategy terminationStrategy,
                    com.oracle.bmc.waiter.DelayStrategy delayStrategy) {
        if (workRequestClient == null) {
            throw new IllegalStateException(
                    "A WorkRequestClient must be supplied to this waiter for this operation");
        }

        return new com.oracle.bmc.waiter.internal.SimpleWaiterImpl<>(
                executorService,
                new java.util.concurrent.Callable<ModifyVcnCidrResponse>() {
                    @Override
                    public ModifyVcnCidrResponse call() throws Exception {
                        final ModifyVcnCidrResponse response = client.modifyVcnCidr(request);

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
    public com.oracle.bmc.waiter.Waiter<RemoveIpv6SubnetCidrRequest, RemoveIpv6SubnetCidrResponse>
            forRemoveIpv6SubnetCidr(RemoveIpv6SubnetCidrRequest request) {
        return forRemoveIpv6SubnetCidr(
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
    public com.oracle.bmc.waiter.Waiter<RemoveIpv6SubnetCidrRequest, RemoveIpv6SubnetCidrResponse>
            forRemoveIpv6SubnetCidr(
                    RemoveIpv6SubnetCidrRequest request,
                    com.oracle.bmc.waiter.TerminationStrategy terminationStrategy,
                    com.oracle.bmc.waiter.DelayStrategy delayStrategy) {
        if (workRequestClient == null) {
            throw new IllegalStateException(
                    "A WorkRequestClient must be supplied to this waiter for this operation");
        }

        return new com.oracle.bmc.waiter.internal.SimpleWaiterImpl<>(
                executorService,
                new java.util.concurrent.Callable<RemoveIpv6SubnetCidrResponse>() {
                    @Override
                    public RemoveIpv6SubnetCidrResponse call() throws Exception {
                        final RemoveIpv6SubnetCidrResponse response =
                                client.removeIpv6SubnetCidr(request);

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
    public com.oracle.bmc.waiter.Waiter<RemoveIpv6VcnCidrRequest, RemoveIpv6VcnCidrResponse>
            forRemoveIpv6VcnCidr(RemoveIpv6VcnCidrRequest request) {
        return forRemoveIpv6VcnCidr(
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
    public com.oracle.bmc.waiter.Waiter<RemoveIpv6VcnCidrRequest, RemoveIpv6VcnCidrResponse>
            forRemoveIpv6VcnCidr(
                    RemoveIpv6VcnCidrRequest request,
                    com.oracle.bmc.waiter.TerminationStrategy terminationStrategy,
                    com.oracle.bmc.waiter.DelayStrategy delayStrategy) {
        if (workRequestClient == null) {
            throw new IllegalStateException(
                    "A WorkRequestClient must be supplied to this waiter for this operation");
        }

        return new com.oracle.bmc.waiter.internal.SimpleWaiterImpl<>(
                executorService,
                new java.util.concurrent.Callable<RemoveIpv6VcnCidrResponse>() {
                    @Override
                    public RemoveIpv6VcnCidrResponse call() throws Exception {
                        final RemoveIpv6VcnCidrResponse response =
                                client.removeIpv6VcnCidr(request);

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
    public com.oracle.bmc.waiter.Waiter<RemoveVcnCidrRequest, RemoveVcnCidrResponse>
            forRemoveVcnCidr(RemoveVcnCidrRequest request) {
        return forRemoveVcnCidr(
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
    public com.oracle.bmc.waiter.Waiter<RemoveVcnCidrRequest, RemoveVcnCidrResponse>
            forRemoveVcnCidr(
                    RemoveVcnCidrRequest request,
                    com.oracle.bmc.waiter.TerminationStrategy terminationStrategy,
                    com.oracle.bmc.waiter.DelayStrategy delayStrategy) {
        if (workRequestClient == null) {
            throw new IllegalStateException(
                    "A WorkRequestClient must be supplied to this waiter for this operation");
        }

        return new com.oracle.bmc.waiter.internal.SimpleWaiterImpl<>(
                executorService,
                new java.util.concurrent.Callable<RemoveVcnCidrResponse>() {
                    @Override
                    public RemoveVcnCidrResponse call() throws Exception {
                        final RemoveVcnCidrResponse response = client.removeVcnCidr(request);

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
    public com.oracle.bmc.waiter.Waiter<UpdateVtapRequest, UpdateVtapResponse> forUpdateVtap(
            UpdateVtapRequest request) {
        return forUpdateVtap(
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
    public com.oracle.bmc.waiter.Waiter<UpdateVtapRequest, UpdateVtapResponse> forUpdateVtap(
            UpdateVtapRequest request,
            com.oracle.bmc.waiter.TerminationStrategy terminationStrategy,
            com.oracle.bmc.waiter.DelayStrategy delayStrategy) {
        if (workRequestClient == null) {
            throw new IllegalStateException(
                    "A WorkRequestClient must be supplied to this waiter for this operation");
        }

        return new com.oracle.bmc.waiter.internal.SimpleWaiterImpl<>(
                executorService,
                new java.util.concurrent.Callable<UpdateVtapResponse>() {
                    @Override
                    public UpdateVtapResponse call() throws Exception {
                        final UpdateVtapResponse response = client.updateVtap(request);

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
    public com.oracle.bmc.waiter.Waiter<UpgradeDrgRequest, UpgradeDrgResponse> forUpgradeDrg(
            UpgradeDrgRequest request) {
        return forUpgradeDrg(
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
    public com.oracle.bmc.waiter.Waiter<UpgradeDrgRequest, UpgradeDrgResponse> forUpgradeDrg(
            UpgradeDrgRequest request,
            com.oracle.bmc.waiter.TerminationStrategy terminationStrategy,
            com.oracle.bmc.waiter.DelayStrategy delayStrategy) {
        if (workRequestClient == null) {
            throw new IllegalStateException(
                    "A WorkRequestClient must be supplied to this waiter for this operation");
        }

        return new com.oracle.bmc.waiter.internal.SimpleWaiterImpl<>(
                executorService,
                new java.util.concurrent.Callable<UpgradeDrgResponse>() {
                    @Override
                    public UpgradeDrgResponse call() throws Exception {
                        final UpgradeDrgResponse response = client.upgradeDrg(request);

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
    public com.oracle.bmc.waiter.Waiter<ValidateByoipRangeRequest, ValidateByoipRangeResponse>
            forValidateByoipRange(ValidateByoipRangeRequest request) {
        return forValidateByoipRange(
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
    public com.oracle.bmc.waiter.Waiter<ValidateByoipRangeRequest, ValidateByoipRangeResponse>
            forValidateByoipRange(
                    ValidateByoipRangeRequest request,
                    com.oracle.bmc.waiter.TerminationStrategy terminationStrategy,
                    com.oracle.bmc.waiter.DelayStrategy delayStrategy) {
        if (workRequestClient == null) {
            throw new IllegalStateException(
                    "A WorkRequestClient must be supplied to this waiter for this operation");
        }

        return new com.oracle.bmc.waiter.internal.SimpleWaiterImpl<>(
                executorService,
                new java.util.concurrent.Callable<ValidateByoipRangeResponse>() {
                    @Override
                    public ValidateByoipRangeResponse call() throws Exception {
                        final ValidateByoipRangeResponse response =
                                client.validateByoipRange(request);

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
