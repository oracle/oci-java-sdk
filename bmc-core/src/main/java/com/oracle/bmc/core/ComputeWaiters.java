/**
 * Copyright (c) 2016, 2017, Oracle and/or its affiliates. All rights reserved.
 */
package com.oracle.bmc.core;

import com.oracle.bmc.core.requests.*;
import com.oracle.bmc.core.responses.*;

/**
 * Collection of helper methods to produce {@link Waiter}s for different
 * resources of Compute.
 * <p>
 * The default configuration used is defined by {@link Waiters#DEFAULT_POLLING_WAITER}.
 */
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20160918")
@lombok.RequiredArgsConstructor
public class ComputeWaiters {
    private final java.util.concurrent.ExecutorService executorService;
    private final Compute client;

    /**
     * Creates a new {@link Waiter} using default configuration.
     *
     * @param request The request to send.
     * @param targetState The desired state to wait for.
     * @return A new Waiter instance.
     */
    public com.oracle.bmc.waiter.Waiter<GetConsoleHistoryRequest, GetConsoleHistoryResponse>
            forConsoleHistory(
                    GetConsoleHistoryRequest request,
                    com.oracle.bmc.core.model.ConsoleHistory.LifecycleState targetState) {
        return forConsoleHistory(
                com.oracle.bmc.waiter.Waiters.DEFAULT_POLLING_WAITER, request, targetState);
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
    public com.oracle.bmc.waiter.Waiter<GetConsoleHistoryRequest, GetConsoleHistoryResponse>
            forConsoleHistory(
                    GetConsoleHistoryRequest request,
                    com.oracle.bmc.core.model.ConsoleHistory.LifecycleState targetState,
                    com.oracle.bmc.waiter.TerminationStrategy terminationStrategy,
                    com.oracle.bmc.waiter.DelayStrategy delayStrategy) {
        return forConsoleHistory(
                com.oracle.bmc.waiter.Waiters.newWaiter(terminationStrategy, delayStrategy),
                request,
                targetState);
    }

    // Helper method to create a new Waiter for ConsoleHistory.
    private com.oracle.bmc.waiter.Waiter<GetConsoleHistoryRequest, GetConsoleHistoryResponse>
            forConsoleHistory(
                    com.oracle.bmc.waiter.BmcGenericWaiter waiter,
                    final GetConsoleHistoryRequest request,
                    final com.oracle.bmc.core.model.ConsoleHistory.LifecycleState targetState) {
        return new com.oracle.bmc.waiter.internal.SimpleWaiterImpl<>(
                executorService,
                waiter.toCallable(
                        com.google.common.base.Suppliers.ofInstance(request),
                        new com.google.common.base.Function<
                                GetConsoleHistoryRequest, GetConsoleHistoryResponse>() {
                            @Override
                            public GetConsoleHistoryResponse apply(
                                    GetConsoleHistoryRequest request) {
                                return client.getConsoleHistory(request);
                            }
                        },
                        new com.google.common.base.Predicate<GetConsoleHistoryResponse>() {
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
    public com.oracle.bmc.waiter.Waiter<GetImageRequest, GetImageResponse> forImage(
            GetImageRequest request, com.oracle.bmc.core.model.Image.LifecycleState targetState) {
        return forImage(com.oracle.bmc.waiter.Waiters.DEFAULT_POLLING_WAITER, request, targetState);
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
    public com.oracle.bmc.waiter.Waiter<GetImageRequest, GetImageResponse> forImage(
            GetImageRequest request,
            com.oracle.bmc.core.model.Image.LifecycleState targetState,
            com.oracle.bmc.waiter.TerminationStrategy terminationStrategy,
            com.oracle.bmc.waiter.DelayStrategy delayStrategy) {
        return forImage(
                com.oracle.bmc.waiter.Waiters.newWaiter(terminationStrategy, delayStrategy),
                request,
                targetState);
    }

    // Helper method to create a new Waiter for Image.
    private com.oracle.bmc.waiter.Waiter<GetImageRequest, GetImageResponse> forImage(
            com.oracle.bmc.waiter.BmcGenericWaiter waiter,
            final GetImageRequest request,
            final com.oracle.bmc.core.model.Image.LifecycleState targetState) {
        return new com.oracle.bmc.waiter.internal.SimpleWaiterImpl<>(
                executorService,
                waiter.toCallable(
                        com.google.common.base.Suppliers.ofInstance(request),
                        new com.google.common.base.Function<GetImageRequest, GetImageResponse>() {
                            @Override
                            public GetImageResponse apply(GetImageRequest request) {
                                return client.getImage(request);
                            }
                        },
                        new com.google.common.base.Predicate<GetImageResponse>() {
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
    public com.oracle.bmc.waiter.Waiter<GetInstanceRequest, GetInstanceResponse> forInstance(
            GetInstanceRequest request,
            com.oracle.bmc.core.model.Instance.LifecycleState targetState) {
        return forInstance(
                com.oracle.bmc.waiter.Waiters.DEFAULT_POLLING_WAITER, request, targetState);
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
    public com.oracle.bmc.waiter.Waiter<GetInstanceRequest, GetInstanceResponse> forInstance(
            GetInstanceRequest request,
            com.oracle.bmc.core.model.Instance.LifecycleState targetState,
            com.oracle.bmc.waiter.TerminationStrategy terminationStrategy,
            com.oracle.bmc.waiter.DelayStrategy delayStrategy) {
        return forInstance(
                com.oracle.bmc.waiter.Waiters.newWaiter(terminationStrategy, delayStrategy),
                request,
                targetState);
    }

    // Helper method to create a new Waiter for Instance.
    private com.oracle.bmc.waiter.Waiter<GetInstanceRequest, GetInstanceResponse> forInstance(
            com.oracle.bmc.waiter.BmcGenericWaiter waiter,
            final GetInstanceRequest request,
            final com.oracle.bmc.core.model.Instance.LifecycleState targetState) {
        return new com.oracle.bmc.waiter.internal.SimpleWaiterImpl<>(
                executorService,
                waiter.toCallable(
                        com.google.common.base.Suppliers.ofInstance(request),
                        new com.google.common.base.Function<
                                GetInstanceRequest, GetInstanceResponse>() {
                            @Override
                            public GetInstanceResponse apply(GetInstanceRequest request) {
                                return client.getInstance(request);
                            }
                        },
                        new com.google.common.base.Predicate<GetInstanceResponse>() {
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
    public com.oracle.bmc.waiter.Waiter<GetVnicAttachmentRequest, GetVnicAttachmentResponse>
            forVnicAttachment(
                    GetVnicAttachmentRequest request,
                    com.oracle.bmc.core.model.VnicAttachment.LifecycleState targetState) {
        return forVnicAttachment(
                com.oracle.bmc.waiter.Waiters.DEFAULT_POLLING_WAITER, request, targetState);
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
    public com.oracle.bmc.waiter.Waiter<GetVnicAttachmentRequest, GetVnicAttachmentResponse>
            forVnicAttachment(
                    GetVnicAttachmentRequest request,
                    com.oracle.bmc.core.model.VnicAttachment.LifecycleState targetState,
                    com.oracle.bmc.waiter.TerminationStrategy terminationStrategy,
                    com.oracle.bmc.waiter.DelayStrategy delayStrategy) {
        return forVnicAttachment(
                com.oracle.bmc.waiter.Waiters.newWaiter(terminationStrategy, delayStrategy),
                request,
                targetState);
    }

    // Helper method to create a new Waiter for VnicAttachment.
    private com.oracle.bmc.waiter.Waiter<GetVnicAttachmentRequest, GetVnicAttachmentResponse>
            forVnicAttachment(
                    com.oracle.bmc.waiter.BmcGenericWaiter waiter,
                    final GetVnicAttachmentRequest request,
                    final com.oracle.bmc.core.model.VnicAttachment.LifecycleState targetState) {
        return new com.oracle.bmc.waiter.internal.SimpleWaiterImpl<>(
                executorService,
                waiter.toCallable(
                        com.google.common.base.Suppliers.ofInstance(request),
                        new com.google.common.base.Function<
                                GetVnicAttachmentRequest, GetVnicAttachmentResponse>() {
                            @Override
                            public GetVnicAttachmentResponse apply(
                                    GetVnicAttachmentRequest request) {
                                return client.getVnicAttachment(request);
                            }
                        },
                        new com.google.common.base.Predicate<GetVnicAttachmentResponse>() {
                            @Override
                            public boolean apply(GetVnicAttachmentResponse response) {
                                return response.getVnicAttachment().getLifecycleState()
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
    public com.oracle.bmc.waiter.Waiter<GetVolumeAttachmentRequest, GetVolumeAttachmentResponse>
            forVolumeAttachment(
                    GetVolumeAttachmentRequest request,
                    com.oracle.bmc.core.model.VolumeAttachment.LifecycleState targetState) {
        return forVolumeAttachment(
                com.oracle.bmc.waiter.Waiters.DEFAULT_POLLING_WAITER, request, targetState);
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
    public com.oracle.bmc.waiter.Waiter<GetVolumeAttachmentRequest, GetVolumeAttachmentResponse>
            forVolumeAttachment(
                    GetVolumeAttachmentRequest request,
                    com.oracle.bmc.core.model.VolumeAttachment.LifecycleState targetState,
                    com.oracle.bmc.waiter.TerminationStrategy terminationStrategy,
                    com.oracle.bmc.waiter.DelayStrategy delayStrategy) {
        return forVolumeAttachment(
                com.oracle.bmc.waiter.Waiters.newWaiter(terminationStrategy, delayStrategy),
                request,
                targetState);
    }

    // Helper method to create a new Waiter for VolumeAttachment.
    private com.oracle.bmc.waiter.Waiter<GetVolumeAttachmentRequest, GetVolumeAttachmentResponse>
            forVolumeAttachment(
                    com.oracle.bmc.waiter.BmcGenericWaiter waiter,
                    final GetVolumeAttachmentRequest request,
                    final com.oracle.bmc.core.model.VolumeAttachment.LifecycleState targetState) {
        return new com.oracle.bmc.waiter.internal.SimpleWaiterImpl<>(
                executorService,
                waiter.toCallable(
                        com.google.common.base.Suppliers.ofInstance(request),
                        new com.google.common.base.Function<
                                GetVolumeAttachmentRequest, GetVolumeAttachmentResponse>() {
                            @Override
                            public GetVolumeAttachmentResponse apply(
                                    GetVolumeAttachmentRequest request) {
                                return client.getVolumeAttachment(request);
                            }
                        },
                        new com.google.common.base.Predicate<GetVolumeAttachmentResponse>() {
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
