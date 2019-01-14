/**
 * Copyright (c) 2016, 2019, Oracle and/or its affiliates. All rights reserved.
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
     * @param request the request to send
     * @param targetStates the desired states to wait for. If multiple states are provided then the waiter will return once the resource reaches any of the provided states
     * @return a new {@code Waiter} instance
     */
    public com.oracle.bmc.waiter.Waiter<
                    GetBootVolumeAttachmentRequest, GetBootVolumeAttachmentResponse>
            forBootVolumeAttachment(
                    GetBootVolumeAttachmentRequest request,
                    com.oracle.bmc.core.model.BootVolumeAttachment.LifecycleState... targetStates) {
        org.apache.commons.lang3.Validate.notEmpty(
                targetStates, "At least one targetState must be provided");
        org.apache.commons.lang3.Validate.noNullElements(
                targetStates, "Null targetState values are not permitted");

        return forBootVolumeAttachment(
                com.oracle.bmc.waiter.Waiters.DEFAULT_POLLING_WAITER, request, targetStates);
    }

    /**
     * Creates a new {@link Waiter} using the provided configuration.
     *
     * @param request the request to send
     * @param targetState the desired state to wait for
     * @param terminationStrategy the {@link TerminationStrategy} to use
     * @param delayStrategy the {@link DelayStrategy} to use
     * @return a new {@code Waiter} instance
     */
    public com.oracle.bmc.waiter.Waiter<
                    GetBootVolumeAttachmentRequest, GetBootVolumeAttachmentResponse>
            forBootVolumeAttachment(
                    GetBootVolumeAttachmentRequest request,
                    com.oracle.bmc.core.model.BootVolumeAttachment.LifecycleState targetState,
                    com.oracle.bmc.waiter.TerminationStrategy terminationStrategy,
                    com.oracle.bmc.waiter.DelayStrategy delayStrategy) {
        org.apache.commons.lang3.Validate.notNull(targetState, "The targetState cannot be null");

        return forBootVolumeAttachment(
                com.oracle.bmc.waiter.Waiters.newWaiter(terminationStrategy, delayStrategy),
                request,
                targetState);
    }

    /**
     * Creates a new {@link Waiter} using the provided configuration.
     *
     * @param request the request to send
     * @param terminationStrategy the {@link TerminationStrategy} to use
     * @param delayStrategy the {@link DelayStrategy} to use
     * @param targetStates the desired states to wait for. The waiter will return once the resource reaches any of the provided states
     * @return a new {@code Waiter} instance
     */
    public com.oracle.bmc.waiter.Waiter<
                    GetBootVolumeAttachmentRequest, GetBootVolumeAttachmentResponse>
            forBootVolumeAttachment(
                    GetBootVolumeAttachmentRequest request,
                    com.oracle.bmc.waiter.TerminationStrategy terminationStrategy,
                    com.oracle.bmc.waiter.DelayStrategy delayStrategy,
                    com.oracle.bmc.core.model.BootVolumeAttachment.LifecycleState... targetStates) {
        org.apache.commons.lang3.Validate.notEmpty(
                targetStates, "At least one target state must be provided");
        org.apache.commons.lang3.Validate.noNullElements(
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
                        com.google.common.base.Suppliers.ofInstance(request),
                        new com.google.common.base.Function<
                                GetBootVolumeAttachmentRequest, GetBootVolumeAttachmentResponse>() {
                            @Override
                            public GetBootVolumeAttachmentResponse apply(
                                    GetBootVolumeAttachmentRequest request) {
                                return client.getBootVolumeAttachment(request);
                            }
                        },
                        new com.google.common.base.Predicate<GetBootVolumeAttachmentResponse>() {
                            @Override
                            public boolean apply(GetBootVolumeAttachmentResponse response) {
                                return targetStatesSet.contains(
                                        response.getBootVolumeAttachment().getLifecycleState());
                            }
                        },
                        false),
                request);
    }

    /**
     * Creates a new {@link Waiter} using default configuration.
     *
     * @param request the request to send
     * @param targetStates the desired states to wait for. If multiple states are provided then the waiter will return once the resource reaches any of the provided states
     * @return a new {@code Waiter} instance
     */
    public com.oracle.bmc.waiter.Waiter<GetConsoleHistoryRequest, GetConsoleHistoryResponse>
            forConsoleHistory(
                    GetConsoleHistoryRequest request,
                    com.oracle.bmc.core.model.ConsoleHistory.LifecycleState... targetStates) {
        org.apache.commons.lang3.Validate.notEmpty(
                targetStates, "At least one targetState must be provided");
        org.apache.commons.lang3.Validate.noNullElements(
                targetStates, "Null targetState values are not permitted");

        return forConsoleHistory(
                com.oracle.bmc.waiter.Waiters.DEFAULT_POLLING_WAITER, request, targetStates);
    }

    /**
     * Creates a new {@link Waiter} using the provided configuration.
     *
     * @param request the request to send
     * @param targetState the desired state to wait for
     * @param terminationStrategy the {@link TerminationStrategy} to use
     * @param delayStrategy the {@link DelayStrategy} to use
     * @return a new {@code Waiter} instance
     */
    public com.oracle.bmc.waiter.Waiter<GetConsoleHistoryRequest, GetConsoleHistoryResponse>
            forConsoleHistory(
                    GetConsoleHistoryRequest request,
                    com.oracle.bmc.core.model.ConsoleHistory.LifecycleState targetState,
                    com.oracle.bmc.waiter.TerminationStrategy terminationStrategy,
                    com.oracle.bmc.waiter.DelayStrategy delayStrategy) {
        org.apache.commons.lang3.Validate.notNull(targetState, "The targetState cannot be null");

        return forConsoleHistory(
                com.oracle.bmc.waiter.Waiters.newWaiter(terminationStrategy, delayStrategy),
                request,
                targetState);
    }

    /**
     * Creates a new {@link Waiter} using the provided configuration.
     *
     * @param request the request to send
     * @param terminationStrategy the {@link TerminationStrategy} to use
     * @param delayStrategy the {@link DelayStrategy} to use
     * @param targetStates the desired states to wait for. The waiter will return once the resource reaches any of the provided states
     * @return a new {@code Waiter} instance
     */
    public com.oracle.bmc.waiter.Waiter<GetConsoleHistoryRequest, GetConsoleHistoryResponse>
            forConsoleHistory(
                    GetConsoleHistoryRequest request,
                    com.oracle.bmc.waiter.TerminationStrategy terminationStrategy,
                    com.oracle.bmc.waiter.DelayStrategy delayStrategy,
                    com.oracle.bmc.core.model.ConsoleHistory.LifecycleState... targetStates) {
        org.apache.commons.lang3.Validate.notEmpty(
                targetStates, "At least one target state must be provided");
        org.apache.commons.lang3.Validate.noNullElements(
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
                                return targetStatesSet.contains(
                                        response.getConsoleHistory().getLifecycleState());
                            }
                        },
                        false),
                request);
    }

    /**
     * Creates a new {@link Waiter} using default configuration.
     *
     * @param request the request to send
     * @param targetStates the desired states to wait for. If multiple states are provided then the waiter will return once the resource reaches any of the provided states
     * @return a new {@code Waiter} instance
     */
    public com.oracle.bmc.waiter.Waiter<GetImageRequest, GetImageResponse> forImage(
            GetImageRequest request,
            com.oracle.bmc.core.model.Image.LifecycleState... targetStates) {
        org.apache.commons.lang3.Validate.notEmpty(
                targetStates, "At least one targetState must be provided");
        org.apache.commons.lang3.Validate.noNullElements(
                targetStates, "Null targetState values are not permitted");

        return forImage(
                com.oracle.bmc.waiter.Waiters.DEFAULT_POLLING_WAITER, request, targetStates);
    }

    /**
     * Creates a new {@link Waiter} using the provided configuration.
     *
     * @param request the request to send
     * @param targetState the desired state to wait for
     * @param terminationStrategy the {@link TerminationStrategy} to use
     * @param delayStrategy the {@link DelayStrategy} to use
     * @return a new {@code Waiter} instance
     */
    public com.oracle.bmc.waiter.Waiter<GetImageRequest, GetImageResponse> forImage(
            GetImageRequest request,
            com.oracle.bmc.core.model.Image.LifecycleState targetState,
            com.oracle.bmc.waiter.TerminationStrategy terminationStrategy,
            com.oracle.bmc.waiter.DelayStrategy delayStrategy) {
        org.apache.commons.lang3.Validate.notNull(targetState, "The targetState cannot be null");

        return forImage(
                com.oracle.bmc.waiter.Waiters.newWaiter(terminationStrategy, delayStrategy),
                request,
                targetState);
    }

    /**
     * Creates a new {@link Waiter} using the provided configuration.
     *
     * @param request the request to send
     * @param terminationStrategy the {@link TerminationStrategy} to use
     * @param delayStrategy the {@link DelayStrategy} to use
     * @param targetStates the desired states to wait for. The waiter will return once the resource reaches any of the provided states
     * @return a new {@code Waiter} instance
     */
    public com.oracle.bmc.waiter.Waiter<GetImageRequest, GetImageResponse> forImage(
            GetImageRequest request,
            com.oracle.bmc.waiter.TerminationStrategy terminationStrategy,
            com.oracle.bmc.waiter.DelayStrategy delayStrategy,
            com.oracle.bmc.core.model.Image.LifecycleState... targetStates) {
        org.apache.commons.lang3.Validate.notEmpty(
                targetStates, "At least one target state must be provided");
        org.apache.commons.lang3.Validate.noNullElements(
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
                                return targetStatesSet.contains(
                                        response.getImage().getLifecycleState());
                            }
                        },
                        targetStatesSet.contains(
                                com.oracle.bmc.core.model.Image.LifecycleState.Deleted)),
                request);
    }

    /**
     * Creates a new {@link Waiter} using default configuration.
     *
     * @param request the request to send
     * @param targetStates the desired states to wait for. If multiple states are provided then the waiter will return once the resource reaches any of the provided states
     * @return a new {@code Waiter} instance
     */
    public com.oracle.bmc.waiter.Waiter<GetInstanceRequest, GetInstanceResponse> forInstance(
            GetInstanceRequest request,
            com.oracle.bmc.core.model.Instance.LifecycleState... targetStates) {
        org.apache.commons.lang3.Validate.notEmpty(
                targetStates, "At least one targetState must be provided");
        org.apache.commons.lang3.Validate.noNullElements(
                targetStates, "Null targetState values are not permitted");

        return forInstance(
                com.oracle.bmc.waiter.Waiters.DEFAULT_POLLING_WAITER, request, targetStates);
    }

    /**
     * Creates a new {@link Waiter} using the provided configuration.
     *
     * @param request the request to send
     * @param targetState the desired state to wait for
     * @param terminationStrategy the {@link TerminationStrategy} to use
     * @param delayStrategy the {@link DelayStrategy} to use
     * @return a new {@code Waiter} instance
     */
    public com.oracle.bmc.waiter.Waiter<GetInstanceRequest, GetInstanceResponse> forInstance(
            GetInstanceRequest request,
            com.oracle.bmc.core.model.Instance.LifecycleState targetState,
            com.oracle.bmc.waiter.TerminationStrategy terminationStrategy,
            com.oracle.bmc.waiter.DelayStrategy delayStrategy) {
        org.apache.commons.lang3.Validate.notNull(targetState, "The targetState cannot be null");

        return forInstance(
                com.oracle.bmc.waiter.Waiters.newWaiter(terminationStrategy, delayStrategy),
                request,
                targetState);
    }

    /**
     * Creates a new {@link Waiter} using the provided configuration.
     *
     * @param request the request to send
     * @param terminationStrategy the {@link TerminationStrategy} to use
     * @param delayStrategy the {@link DelayStrategy} to use
     * @param targetStates the desired states to wait for. The waiter will return once the resource reaches any of the provided states
     * @return a new {@code Waiter} instance
     */
    public com.oracle.bmc.waiter.Waiter<GetInstanceRequest, GetInstanceResponse> forInstance(
            GetInstanceRequest request,
            com.oracle.bmc.waiter.TerminationStrategy terminationStrategy,
            com.oracle.bmc.waiter.DelayStrategy delayStrategy,
            com.oracle.bmc.core.model.Instance.LifecycleState... targetStates) {
        org.apache.commons.lang3.Validate.notEmpty(
                targetStates, "At least one target state must be provided");
        org.apache.commons.lang3.Validate.noNullElements(
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
                                return targetStatesSet.contains(
                                        response.getInstance().getLifecycleState());
                            }
                        },
                        targetStatesSet.contains(
                                com.oracle.bmc.core.model.Instance.LifecycleState.Terminated)),
                request);
    }

    /**
     * Creates a new {@link Waiter} using default configuration.
     *
     * @param request the request to send
     * @param targetStates the desired states to wait for. If multiple states are provided then the waiter will return once the resource reaches any of the provided states
     * @return a new {@code Waiter} instance
     */
    public com.oracle.bmc.waiter.Waiter<
                    GetInstanceConsoleConnectionRequest, GetInstanceConsoleConnectionResponse>
            forInstanceConsoleConnection(
                    GetInstanceConsoleConnectionRequest request,
                    com.oracle.bmc.core.model.InstanceConsoleConnection.LifecycleState...
                            targetStates) {
        org.apache.commons.lang3.Validate.notEmpty(
                targetStates, "At least one targetState must be provided");
        org.apache.commons.lang3.Validate.noNullElements(
                targetStates, "Null targetState values are not permitted");

        return forInstanceConsoleConnection(
                com.oracle.bmc.waiter.Waiters.DEFAULT_POLLING_WAITER, request, targetStates);
    }

    /**
     * Creates a new {@link Waiter} using the provided configuration.
     *
     * @param request the request to send
     * @param targetState the desired state to wait for
     * @param terminationStrategy the {@link TerminationStrategy} to use
     * @param delayStrategy the {@link DelayStrategy} to use
     * @return a new {@code Waiter} instance
     */
    public com.oracle.bmc.waiter.Waiter<
                    GetInstanceConsoleConnectionRequest, GetInstanceConsoleConnectionResponse>
            forInstanceConsoleConnection(
                    GetInstanceConsoleConnectionRequest request,
                    com.oracle.bmc.core.model.InstanceConsoleConnection.LifecycleState targetState,
                    com.oracle.bmc.waiter.TerminationStrategy terminationStrategy,
                    com.oracle.bmc.waiter.DelayStrategy delayStrategy) {
        org.apache.commons.lang3.Validate.notNull(targetState, "The targetState cannot be null");

        return forInstanceConsoleConnection(
                com.oracle.bmc.waiter.Waiters.newWaiter(terminationStrategy, delayStrategy),
                request,
                targetState);
    }

    /**
     * Creates a new {@link Waiter} using the provided configuration.
     *
     * @param request the request to send
     * @param terminationStrategy the {@link TerminationStrategy} to use
     * @param delayStrategy the {@link DelayStrategy} to use
     * @param targetStates the desired states to wait for. The waiter will return once the resource reaches any of the provided states
     * @return a new {@code Waiter} instance
     */
    public com.oracle.bmc.waiter.Waiter<
                    GetInstanceConsoleConnectionRequest, GetInstanceConsoleConnectionResponse>
            forInstanceConsoleConnection(
                    GetInstanceConsoleConnectionRequest request,
                    com.oracle.bmc.waiter.TerminationStrategy terminationStrategy,
                    com.oracle.bmc.waiter.DelayStrategy delayStrategy,
                    com.oracle.bmc.core.model.InstanceConsoleConnection.LifecycleState...
                            targetStates) {
        org.apache.commons.lang3.Validate.notEmpty(
                targetStates, "At least one target state must be provided");
        org.apache.commons.lang3.Validate.noNullElements(
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
                        com.google.common.base.Suppliers.ofInstance(request),
                        new com.google.common.base.Function<
                                GetInstanceConsoleConnectionRequest,
                                GetInstanceConsoleConnectionResponse>() {
                            @Override
                            public GetInstanceConsoleConnectionResponse apply(
                                    GetInstanceConsoleConnectionRequest request) {
                                return client.getInstanceConsoleConnection(request);
                            }
                        },
                        new com.google.common.base.Predicate<
                                GetInstanceConsoleConnectionResponse>() {
                            @Override
                            public boolean apply(GetInstanceConsoleConnectionResponse response) {
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
     * Creates a new {@link Waiter} using default configuration.
     *
     * @param request the request to send
     * @param targetStates the desired states to wait for. If multiple states are provided then the waiter will return once the resource reaches any of the provided states
     * @return a new {@code Waiter} instance
     */
    public com.oracle.bmc.waiter.Waiter<GetVnicAttachmentRequest, GetVnicAttachmentResponse>
            forVnicAttachment(
                    GetVnicAttachmentRequest request,
                    com.oracle.bmc.core.model.VnicAttachment.LifecycleState... targetStates) {
        org.apache.commons.lang3.Validate.notEmpty(
                targetStates, "At least one targetState must be provided");
        org.apache.commons.lang3.Validate.noNullElements(
                targetStates, "Null targetState values are not permitted");

        return forVnicAttachment(
                com.oracle.bmc.waiter.Waiters.DEFAULT_POLLING_WAITER, request, targetStates);
    }

    /**
     * Creates a new {@link Waiter} using the provided configuration.
     *
     * @param request the request to send
     * @param targetState the desired state to wait for
     * @param terminationStrategy the {@link TerminationStrategy} to use
     * @param delayStrategy the {@link DelayStrategy} to use
     * @return a new {@code Waiter} instance
     */
    public com.oracle.bmc.waiter.Waiter<GetVnicAttachmentRequest, GetVnicAttachmentResponse>
            forVnicAttachment(
                    GetVnicAttachmentRequest request,
                    com.oracle.bmc.core.model.VnicAttachment.LifecycleState targetState,
                    com.oracle.bmc.waiter.TerminationStrategy terminationStrategy,
                    com.oracle.bmc.waiter.DelayStrategy delayStrategy) {
        org.apache.commons.lang3.Validate.notNull(targetState, "The targetState cannot be null");

        return forVnicAttachment(
                com.oracle.bmc.waiter.Waiters.newWaiter(terminationStrategy, delayStrategy),
                request,
                targetState);
    }

    /**
     * Creates a new {@link Waiter} using the provided configuration.
     *
     * @param request the request to send
     * @param terminationStrategy the {@link TerminationStrategy} to use
     * @param delayStrategy the {@link DelayStrategy} to use
     * @param targetStates the desired states to wait for. The waiter will return once the resource reaches any of the provided states
     * @return a new {@code Waiter} instance
     */
    public com.oracle.bmc.waiter.Waiter<GetVnicAttachmentRequest, GetVnicAttachmentResponse>
            forVnicAttachment(
                    GetVnicAttachmentRequest request,
                    com.oracle.bmc.waiter.TerminationStrategy terminationStrategy,
                    com.oracle.bmc.waiter.DelayStrategy delayStrategy,
                    com.oracle.bmc.core.model.VnicAttachment.LifecycleState... targetStates) {
        org.apache.commons.lang3.Validate.notEmpty(
                targetStates, "At least one target state must be provided");
        org.apache.commons.lang3.Validate.noNullElements(
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
                                return targetStatesSet.contains(
                                        response.getVnicAttachment().getLifecycleState());
                            }
                        },
                        false),
                request);
    }

    /**
     * Creates a new {@link Waiter} using default configuration.
     *
     * @param request the request to send
     * @param targetStates the desired states to wait for. If multiple states are provided then the waiter will return once the resource reaches any of the provided states
     * @return a new {@code Waiter} instance
     */
    public com.oracle.bmc.waiter.Waiter<GetVolumeAttachmentRequest, GetVolumeAttachmentResponse>
            forVolumeAttachment(
                    GetVolumeAttachmentRequest request,
                    com.oracle.bmc.core.model.VolumeAttachment.LifecycleState... targetStates) {
        org.apache.commons.lang3.Validate.notEmpty(
                targetStates, "At least one targetState must be provided");
        org.apache.commons.lang3.Validate.noNullElements(
                targetStates, "Null targetState values are not permitted");

        return forVolumeAttachment(
                com.oracle.bmc.waiter.Waiters.DEFAULT_POLLING_WAITER, request, targetStates);
    }

    /**
     * Creates a new {@link Waiter} using the provided configuration.
     *
     * @param request the request to send
     * @param targetState the desired state to wait for
     * @param terminationStrategy the {@link TerminationStrategy} to use
     * @param delayStrategy the {@link DelayStrategy} to use
     * @return a new {@code Waiter} instance
     */
    public com.oracle.bmc.waiter.Waiter<GetVolumeAttachmentRequest, GetVolumeAttachmentResponse>
            forVolumeAttachment(
                    GetVolumeAttachmentRequest request,
                    com.oracle.bmc.core.model.VolumeAttachment.LifecycleState targetState,
                    com.oracle.bmc.waiter.TerminationStrategy terminationStrategy,
                    com.oracle.bmc.waiter.DelayStrategy delayStrategy) {
        org.apache.commons.lang3.Validate.notNull(targetState, "The targetState cannot be null");

        return forVolumeAttachment(
                com.oracle.bmc.waiter.Waiters.newWaiter(terminationStrategy, delayStrategy),
                request,
                targetState);
    }

    /**
     * Creates a new {@link Waiter} using the provided configuration.
     *
     * @param request the request to send
     * @param terminationStrategy the {@link TerminationStrategy} to use
     * @param delayStrategy the {@link DelayStrategy} to use
     * @param targetStates the desired states to wait for. The waiter will return once the resource reaches any of the provided states
     * @return a new {@code Waiter} instance
     */
    public com.oracle.bmc.waiter.Waiter<GetVolumeAttachmentRequest, GetVolumeAttachmentResponse>
            forVolumeAttachment(
                    GetVolumeAttachmentRequest request,
                    com.oracle.bmc.waiter.TerminationStrategy terminationStrategy,
                    com.oracle.bmc.waiter.DelayStrategy delayStrategy,
                    com.oracle.bmc.core.model.VolumeAttachment.LifecycleState... targetStates) {
        org.apache.commons.lang3.Validate.notEmpty(
                targetStates, "At least one target state must be provided");
        org.apache.commons.lang3.Validate.noNullElements(
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
                                return targetStatesSet.contains(
                                        response.getVolumeAttachment().getLifecycleState());
                            }
                        },
                        false),
                request);
    }
}
