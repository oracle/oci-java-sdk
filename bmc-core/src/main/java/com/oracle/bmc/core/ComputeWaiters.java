/**
 * Copyright (c) 2016, 2017, Oracle and/or its affiliates. All rights reserved.
 */
package com.oracle.bmc.core;

import com.oracle.bmc.core.requests.*;
import com.oracle.bmc.core.responses.*;

import com.oracle.bmc.waiter.*;
import com.oracle.bmc.waiter.internal.SimpleWaiterImpl;

import java.util.concurrent.ExecutorService;

import com.google.common.base.Function;
import com.google.common.base.Predicate;
import com.google.common.base.Suppliers;

import lombok.RequiredArgsConstructor;

/**
 * Collection of helper methods to produce {@link Waiter}s for different
 * resources of Compute.
 * <p>
 * The default configuration used is defined by {@link Waiters#DEFAULT_POLLING_WAITER}.
 */
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20160918")
@RequiredArgsConstructor
public class ComputeWaiters {
    private final ExecutorService executorService;
    private final Compute client;

    /**
     * Creates a new {@link Waiter} using default configuration.
     *
     * @param request The request to send.
     * @param targetState The desired state to wait for.
     * @return A new Waiter instance.
     */
    public Waiter<GetConsoleHistoryRequest, GetConsoleHistoryResponse> forConsoleHistory(
            GetConsoleHistoryRequest request,
            com.oracle.bmc.core.model.ConsoleHistory.LifecycleState targetState) {
        return forConsoleHistory(Waiters.DEFAULT_POLLING_WAITER, request, targetState);
    }

    /**
     * Creates a new {@link Waiter} using the provided configuration.
     *
     * @param request The request to send.
     * @param targetState The desired state to wait for.
     * @param terminationStrategy The {@link TerminationStrategy} to use.
     * @param delayStrategy The {@link DelayStrategy} to use.
     * @return A new Waiter instance.
     */
    public Waiter<GetConsoleHistoryRequest, GetConsoleHistoryResponse> forConsoleHistory(
            GetConsoleHistoryRequest request,
            com.oracle.bmc.core.model.ConsoleHistory.LifecycleState targetState,
            TerminationStrategy terminationStrategy,
            DelayStrategy delayStrategy) {
        return forConsoleHistory(
                Waiters.newWaiter(terminationStrategy, delayStrategy), request, targetState);
    }

    // Helper method to create a new Waiter for ConsoleHistory.
    private Waiter<GetConsoleHistoryRequest, GetConsoleHistoryResponse> forConsoleHistory(
            BmcGenericWaiter waiter,
            final GetConsoleHistoryRequest request,
            final com.oracle.bmc.core.model.ConsoleHistory.LifecycleState targetState) {
        return new SimpleWaiterImpl<>(
                executorService,
                waiter.toCallable(
                        Suppliers.ofInstance(request),
                        new Function<GetConsoleHistoryRequest, GetConsoleHistoryResponse>() {
                            @Override
                            public GetConsoleHistoryResponse apply(
                                    GetConsoleHistoryRequest request) {
                                return client.getConsoleHistory(request);
                            }
                        },
                        new Predicate<GetConsoleHistoryResponse>() {
                            @Override
                            public boolean apply(GetConsoleHistoryResponse response) {
                                return response.getConsoleHistory().getLifecycleState()
                                        == targetState;
                            }
                        },
                        false),
                request);
    }

    /**
     * Creates a new {@link Waiter} using default configuration.
     *
     * @param request The request to send.
     * @param targetState The desired state to wait for.
     * @return A new Waiter instance.
     */
    public Waiter<GetImageRequest, GetImageResponse> forImage(
            GetImageRequest request, com.oracle.bmc.core.model.Image.LifecycleState targetState) {
        return forImage(Waiters.DEFAULT_POLLING_WAITER, request, targetState);
    }

    /**
     * Creates a new {@link Waiter} using the provided configuration.
     *
     * @param request The request to send.
     * @param targetState The desired state to wait for.
     * @param terminationStrategy The {@link TerminationStrategy} to use.
     * @param delayStrategy The {@link DelayStrategy} to use.
     * @return A new Waiter instance.
     */
    public Waiter<GetImageRequest, GetImageResponse> forImage(
            GetImageRequest request,
            com.oracle.bmc.core.model.Image.LifecycleState targetState,
            TerminationStrategy terminationStrategy,
            DelayStrategy delayStrategy) {
        return forImage(
                Waiters.newWaiter(terminationStrategy, delayStrategy), request, targetState);
    }

    // Helper method to create a new Waiter for Image.
    private Waiter<GetImageRequest, GetImageResponse> forImage(
            BmcGenericWaiter waiter,
            final GetImageRequest request,
            final com.oracle.bmc.core.model.Image.LifecycleState targetState) {
        return new SimpleWaiterImpl<>(
                executorService,
                waiter.toCallable(
                        Suppliers.ofInstance(request),
                        new Function<GetImageRequest, GetImageResponse>() {
                            @Override
                            public GetImageResponse apply(GetImageRequest request) {
                                return client.getImage(request);
                            }
                        },
                        new Predicate<GetImageResponse>() {
                            @Override
                            public boolean apply(GetImageResponse response) {
                                return response.getImage().getLifecycleState() == targetState;
                            }
                        },
                        targetState == com.oracle.bmc.core.model.Image.LifecycleState.Deleted),
                request);
    }

    /**
     * Creates a new {@link Waiter} using default configuration.
     *
     * @param request The request to send.
     * @param targetState The desired state to wait for.
     * @return A new Waiter instance.
     */
    public Waiter<GetInstanceRequest, GetInstanceResponse> forInstance(
            GetInstanceRequest request,
            com.oracle.bmc.core.model.Instance.LifecycleState targetState) {
        return forInstance(Waiters.DEFAULT_POLLING_WAITER, request, targetState);
    }

    /**
     * Creates a new {@link Waiter} using the provided configuration.
     *
     * @param request The request to send.
     * @param targetState The desired state to wait for.
     * @param terminationStrategy The {@link TerminationStrategy} to use.
     * @param delayStrategy The {@link DelayStrategy} to use.
     * @return A new Waiter instance.
     */
    public Waiter<GetInstanceRequest, GetInstanceResponse> forInstance(
            GetInstanceRequest request,
            com.oracle.bmc.core.model.Instance.LifecycleState targetState,
            TerminationStrategy terminationStrategy,
            DelayStrategy delayStrategy) {
        return forInstance(
                Waiters.newWaiter(terminationStrategy, delayStrategy), request, targetState);
    }

    // Helper method to create a new Waiter for Instance.
    private Waiter<GetInstanceRequest, GetInstanceResponse> forInstance(
            BmcGenericWaiter waiter,
            final GetInstanceRequest request,
            final com.oracle.bmc.core.model.Instance.LifecycleState targetState) {
        return new SimpleWaiterImpl<>(
                executorService,
                waiter.toCallable(
                        Suppliers.ofInstance(request),
                        new Function<GetInstanceRequest, GetInstanceResponse>() {
                            @Override
                            public GetInstanceResponse apply(GetInstanceRequest request) {
                                return client.getInstance(request);
                            }
                        },
                        new Predicate<GetInstanceResponse>() {
                            @Override
                            public boolean apply(GetInstanceResponse response) {
                                return response.getInstance().getLifecycleState() == targetState;
                            }
                        },
                        targetState
                                == com.oracle.bmc.core.model.Instance.LifecycleState.Terminated),
                request);
    }

    /**
     * Creates a new {@link Waiter} using default configuration.
     *
     * @param request The request to send.
     * @param targetState The desired state to wait for.
     * @return A new Waiter instance.
     */
    public Waiter<GetVolumeAttachmentRequest, GetVolumeAttachmentResponse> forVolumeAttachment(
            GetVolumeAttachmentRequest request,
            com.oracle.bmc.core.model.VolumeAttachment.LifecycleState targetState) {
        return forVolumeAttachment(Waiters.DEFAULT_POLLING_WAITER, request, targetState);
    }

    /**
     * Creates a new {@link Waiter} using the provided configuration.
     *
     * @param request The request to send.
     * @param targetState The desired state to wait for.
     * @param terminationStrategy The {@link TerminationStrategy} to use.
     * @param delayStrategy The {@link DelayStrategy} to use.
     * @return A new Waiter instance.
     */
    public Waiter<GetVolumeAttachmentRequest, GetVolumeAttachmentResponse> forVolumeAttachment(
            GetVolumeAttachmentRequest request,
            com.oracle.bmc.core.model.VolumeAttachment.LifecycleState targetState,
            TerminationStrategy terminationStrategy,
            DelayStrategy delayStrategy) {
        return forVolumeAttachment(
                Waiters.newWaiter(terminationStrategy, delayStrategy), request, targetState);
    }

    // Helper method to create a new Waiter for VolumeAttachment.
    private Waiter<GetVolumeAttachmentRequest, GetVolumeAttachmentResponse> forVolumeAttachment(
            BmcGenericWaiter waiter,
            final GetVolumeAttachmentRequest request,
            final com.oracle.bmc.core.model.VolumeAttachment.LifecycleState targetState) {
        return new SimpleWaiterImpl<>(
                executorService,
                waiter.toCallable(
                        Suppliers.ofInstance(request),
                        new Function<GetVolumeAttachmentRequest, GetVolumeAttachmentResponse>() {
                            @Override
                            public GetVolumeAttachmentResponse apply(
                                    GetVolumeAttachmentRequest request) {
                                return client.getVolumeAttachment(request);
                            }
                        },
                        new Predicate<GetVolumeAttachmentResponse>() {
                            @Override
                            public boolean apply(GetVolumeAttachmentResponse response) {
                                return response.getVolumeAttachment().getLifecycleState()
                                        == targetState;
                            }
                        },
                        false),
                request);
    }
}
