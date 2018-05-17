/**
 * Copyright (c) 2016, 2018, Oracle and/or its affiliates. All rights reserved.
 */
package com.oracle.bmc.core;

import com.oracle.bmc.core.requests.*;
import com.oracle.bmc.core.responses.*;

/**
 * Collection of helper methods to produce {@link Waiter}s for different
 * resources of Blockstorage.
 * <p>
 * The default configuration used is defined by {@link Waiters#DEFAULT_POLLING_WAITER}.
 */
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20160918")
@lombok.RequiredArgsConstructor
public class BlockstorageWaiters {
    private final java.util.concurrent.ExecutorService executorService;
    private final Blockstorage client;

    /**
     * Creates a new {@link Waiter} using default configuration.
     *
     * @param request the request to send
     * @param targetStates the desired states to wait for. If multiple states are provided then the waiter will return once the resource reaches any of the provided states
     * @return a new {@code Waiter} instance
     */
    public com.oracle.bmc.waiter.Waiter<GetBootVolumeRequest, GetBootVolumeResponse> forBootVolume(
            GetBootVolumeRequest request,
            com.oracle.bmc.core.model.BootVolume.LifecycleState... targetStates) {
        org.apache.commons.lang3.Validate.notEmpty(
                targetStates, "At least one targetState must be provided");
        org.apache.commons.lang3.Validate.noNullElements(
                targetStates, "Null targetState values are not permitted");

        return forBootVolume(
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
    public com.oracle.bmc.waiter.Waiter<GetBootVolumeRequest, GetBootVolumeResponse> forBootVolume(
            GetBootVolumeRequest request,
            com.oracle.bmc.core.model.BootVolume.LifecycleState targetState,
            com.oracle.bmc.waiter.TerminationStrategy terminationStrategy,
            com.oracle.bmc.waiter.DelayStrategy delayStrategy) {
        org.apache.commons.lang3.Validate.notNull(targetState, "The targetState cannot be null");

        return forBootVolume(
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
    public com.oracle.bmc.waiter.Waiter<GetBootVolumeRequest, GetBootVolumeResponse> forBootVolume(
            GetBootVolumeRequest request,
            com.oracle.bmc.waiter.TerminationStrategy terminationStrategy,
            com.oracle.bmc.waiter.DelayStrategy delayStrategy,
            com.oracle.bmc.core.model.BootVolume.LifecycleState... targetStates) {
        org.apache.commons.lang3.Validate.notEmpty(
                targetStates, "At least one target state must be provided");
        org.apache.commons.lang3.Validate.noNullElements(
                targetStates, "Null target states are not permitted");

        return forBootVolume(
                com.oracle.bmc.waiter.Waiters.newWaiter(terminationStrategy, delayStrategy),
                request,
                targetStates);
    }

    // Helper method to create a new Waiter for BootVolume.
    private com.oracle.bmc.waiter.Waiter<GetBootVolumeRequest, GetBootVolumeResponse> forBootVolume(
            com.oracle.bmc.waiter.BmcGenericWaiter waiter,
            final GetBootVolumeRequest request,
            final com.oracle.bmc.core.model.BootVolume.LifecycleState... targetStates) {
        final java.util.Set<com.oracle.bmc.core.model.BootVolume.LifecycleState> targetStatesSet =
                new java.util.HashSet<>(java.util.Arrays.asList(targetStates));

        return new com.oracle.bmc.waiter.internal.SimpleWaiterImpl<>(
                executorService,
                waiter.toCallable(
                        com.google.common.base.Suppliers.ofInstance(request),
                        new com.google.common.base.Function<
                                GetBootVolumeRequest, GetBootVolumeResponse>() {
                            @Override
                            public GetBootVolumeResponse apply(GetBootVolumeRequest request) {
                                return client.getBootVolume(request);
                            }
                        },
                        new com.google.common.base.Predicate<GetBootVolumeResponse>() {
                            @Override
                            public boolean apply(GetBootVolumeResponse response) {
                                return targetStatesSet.contains(
                                        response.getBootVolume().getLifecycleState());
                            }
                        },
                        targetStatesSet.contains(
                                com.oracle.bmc.core.model.BootVolume.LifecycleState.Terminated)),
                request);
    }

    /**
     * Creates a new {@link Waiter} using default configuration.
     *
     * @param request the request to send
     * @param targetStates the desired states to wait for. If multiple states are provided then the waiter will return once the resource reaches any of the provided states
     * @return a new {@code Waiter} instance
     */
    public com.oracle.bmc.waiter.Waiter<GetVolumeRequest, GetVolumeResponse> forVolume(
            GetVolumeRequest request,
            com.oracle.bmc.core.model.Volume.LifecycleState... targetStates) {
        org.apache.commons.lang3.Validate.notEmpty(
                targetStates, "At least one targetState must be provided");
        org.apache.commons.lang3.Validate.noNullElements(
                targetStates, "Null targetState values are not permitted");

        return forVolume(
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
    public com.oracle.bmc.waiter.Waiter<GetVolumeRequest, GetVolumeResponse> forVolume(
            GetVolumeRequest request,
            com.oracle.bmc.core.model.Volume.LifecycleState targetState,
            com.oracle.bmc.waiter.TerminationStrategy terminationStrategy,
            com.oracle.bmc.waiter.DelayStrategy delayStrategy) {
        org.apache.commons.lang3.Validate.notNull(targetState, "The targetState cannot be null");

        return forVolume(
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
    public com.oracle.bmc.waiter.Waiter<GetVolumeRequest, GetVolumeResponse> forVolume(
            GetVolumeRequest request,
            com.oracle.bmc.waiter.TerminationStrategy terminationStrategy,
            com.oracle.bmc.waiter.DelayStrategy delayStrategy,
            com.oracle.bmc.core.model.Volume.LifecycleState... targetStates) {
        org.apache.commons.lang3.Validate.notEmpty(
                targetStates, "At least one target state must be provided");
        org.apache.commons.lang3.Validate.noNullElements(
                targetStates, "Null target states are not permitted");

        return forVolume(
                com.oracle.bmc.waiter.Waiters.newWaiter(terminationStrategy, delayStrategy),
                request,
                targetStates);
    }

    // Helper method to create a new Waiter for Volume.
    private com.oracle.bmc.waiter.Waiter<GetVolumeRequest, GetVolumeResponse> forVolume(
            com.oracle.bmc.waiter.BmcGenericWaiter waiter,
            final GetVolumeRequest request,
            final com.oracle.bmc.core.model.Volume.LifecycleState... targetStates) {
        final java.util.Set<com.oracle.bmc.core.model.Volume.LifecycleState> targetStatesSet =
                new java.util.HashSet<>(java.util.Arrays.asList(targetStates));

        return new com.oracle.bmc.waiter.internal.SimpleWaiterImpl<>(
                executorService,
                waiter.toCallable(
                        com.google.common.base.Suppliers.ofInstance(request),
                        new com.google.common.base.Function<GetVolumeRequest, GetVolumeResponse>() {
                            @Override
                            public GetVolumeResponse apply(GetVolumeRequest request) {
                                return client.getVolume(request);
                            }
                        },
                        new com.google.common.base.Predicate<GetVolumeResponse>() {
                            @Override
                            public boolean apply(GetVolumeResponse response) {
                                return targetStatesSet.contains(
                                        response.getVolume().getLifecycleState());
                            }
                        },
                        targetStatesSet.contains(
                                com.oracle.bmc.core.model.Volume.LifecycleState.Terminated)),
                request);
    }

    /**
     * Creates a new {@link Waiter} using default configuration.
     *
     * @param request the request to send
     * @param targetStates the desired states to wait for. If multiple states are provided then the waiter will return once the resource reaches any of the provided states
     * @return a new {@code Waiter} instance
     */
    public com.oracle.bmc.waiter.Waiter<GetVolumeBackupRequest, GetVolumeBackupResponse>
            forVolumeBackup(
                    GetVolumeBackupRequest request,
                    com.oracle.bmc.core.model.VolumeBackup.LifecycleState... targetStates) {
        org.apache.commons.lang3.Validate.notEmpty(
                targetStates, "At least one targetState must be provided");
        org.apache.commons.lang3.Validate.noNullElements(
                targetStates, "Null targetState values are not permitted");

        return forVolumeBackup(
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
    public com.oracle.bmc.waiter.Waiter<GetVolumeBackupRequest, GetVolumeBackupResponse>
            forVolumeBackup(
                    GetVolumeBackupRequest request,
                    com.oracle.bmc.core.model.VolumeBackup.LifecycleState targetState,
                    com.oracle.bmc.waiter.TerminationStrategy terminationStrategy,
                    com.oracle.bmc.waiter.DelayStrategy delayStrategy) {
        org.apache.commons.lang3.Validate.notNull(targetState, "The targetState cannot be null");

        return forVolumeBackup(
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
    public com.oracle.bmc.waiter.Waiter<GetVolumeBackupRequest, GetVolumeBackupResponse>
            forVolumeBackup(
                    GetVolumeBackupRequest request,
                    com.oracle.bmc.waiter.TerminationStrategy terminationStrategy,
                    com.oracle.bmc.waiter.DelayStrategy delayStrategy,
                    com.oracle.bmc.core.model.VolumeBackup.LifecycleState... targetStates) {
        org.apache.commons.lang3.Validate.notEmpty(
                targetStates, "At least one target state must be provided");
        org.apache.commons.lang3.Validate.noNullElements(
                targetStates, "Null target states are not permitted");

        return forVolumeBackup(
                com.oracle.bmc.waiter.Waiters.newWaiter(terminationStrategy, delayStrategy),
                request,
                targetStates);
    }

    // Helper method to create a new Waiter for VolumeBackup.
    private com.oracle.bmc.waiter.Waiter<GetVolumeBackupRequest, GetVolumeBackupResponse>
            forVolumeBackup(
                    com.oracle.bmc.waiter.BmcGenericWaiter waiter,
                    final GetVolumeBackupRequest request,
                    final com.oracle.bmc.core.model.VolumeBackup.LifecycleState... targetStates) {
        final java.util.Set<com.oracle.bmc.core.model.VolumeBackup.LifecycleState> targetStatesSet =
                new java.util.HashSet<>(java.util.Arrays.asList(targetStates));

        return new com.oracle.bmc.waiter.internal.SimpleWaiterImpl<>(
                executorService,
                waiter.toCallable(
                        com.google.common.base.Suppliers.ofInstance(request),
                        new com.google.common.base.Function<
                                GetVolumeBackupRequest, GetVolumeBackupResponse>() {
                            @Override
                            public GetVolumeBackupResponse apply(GetVolumeBackupRequest request) {
                                return client.getVolumeBackup(request);
                            }
                        },
                        new com.google.common.base.Predicate<GetVolumeBackupResponse>() {
                            @Override
                            public boolean apply(GetVolumeBackupResponse response) {
                                return targetStatesSet.contains(
                                        response.getVolumeBackup().getLifecycleState());
                            }
                        },
                        targetStatesSet.contains(
                                com.oracle.bmc.core.model.VolumeBackup.LifecycleState.Terminated)),
                request);
    }

    /**
     * Creates a new {@link Waiter} using default configuration.
     *
     * @param request the request to send
     * @param targetStates the desired states to wait for. If multiple states are provided then the waiter will return once the resource reaches any of the provided states
     * @return a new {@code Waiter} instance
     */
    public com.oracle.bmc.waiter.Waiter<GetVolumeGroupRequest, GetVolumeGroupResponse>
            forVolumeGroup(
                    GetVolumeGroupRequest request,
                    com.oracle.bmc.core.model.VolumeGroup.LifecycleState... targetStates) {
        org.apache.commons.lang3.Validate.notEmpty(
                targetStates, "At least one targetState must be provided");
        org.apache.commons.lang3.Validate.noNullElements(
                targetStates, "Null targetState values are not permitted");

        return forVolumeGroup(
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
    public com.oracle.bmc.waiter.Waiter<GetVolumeGroupRequest, GetVolumeGroupResponse>
            forVolumeGroup(
                    GetVolumeGroupRequest request,
                    com.oracle.bmc.core.model.VolumeGroup.LifecycleState targetState,
                    com.oracle.bmc.waiter.TerminationStrategy terminationStrategy,
                    com.oracle.bmc.waiter.DelayStrategy delayStrategy) {
        org.apache.commons.lang3.Validate.notNull(targetState, "The targetState cannot be null");

        return forVolumeGroup(
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
    public com.oracle.bmc.waiter.Waiter<GetVolumeGroupRequest, GetVolumeGroupResponse>
            forVolumeGroup(
                    GetVolumeGroupRequest request,
                    com.oracle.bmc.waiter.TerminationStrategy terminationStrategy,
                    com.oracle.bmc.waiter.DelayStrategy delayStrategy,
                    com.oracle.bmc.core.model.VolumeGroup.LifecycleState... targetStates) {
        org.apache.commons.lang3.Validate.notEmpty(
                targetStates, "At least one target state must be provided");
        org.apache.commons.lang3.Validate.noNullElements(
                targetStates, "Null target states are not permitted");

        return forVolumeGroup(
                com.oracle.bmc.waiter.Waiters.newWaiter(terminationStrategy, delayStrategy),
                request,
                targetStates);
    }

    // Helper method to create a new Waiter for VolumeGroup.
    private com.oracle.bmc.waiter.Waiter<GetVolumeGroupRequest, GetVolumeGroupResponse>
            forVolumeGroup(
                    com.oracle.bmc.waiter.BmcGenericWaiter waiter,
                    final GetVolumeGroupRequest request,
                    final com.oracle.bmc.core.model.VolumeGroup.LifecycleState... targetStates) {
        final java.util.Set<com.oracle.bmc.core.model.VolumeGroup.LifecycleState> targetStatesSet =
                new java.util.HashSet<>(java.util.Arrays.asList(targetStates));

        return new com.oracle.bmc.waiter.internal.SimpleWaiterImpl<>(
                executorService,
                waiter.toCallable(
                        com.google.common.base.Suppliers.ofInstance(request),
                        new com.google.common.base.Function<
                                GetVolumeGroupRequest, GetVolumeGroupResponse>() {
                            @Override
                            public GetVolumeGroupResponse apply(GetVolumeGroupRequest request) {
                                return client.getVolumeGroup(request);
                            }
                        },
                        new com.google.common.base.Predicate<GetVolumeGroupResponse>() {
                            @Override
                            public boolean apply(GetVolumeGroupResponse response) {
                                return targetStatesSet.contains(
                                        response.getVolumeGroup().getLifecycleState());
                            }
                        },
                        targetStatesSet.contains(
                                com.oracle.bmc.core.model.VolumeGroup.LifecycleState.Terminated)),
                request);
    }

    /**
     * Creates a new {@link Waiter} using default configuration.
     *
     * @param request the request to send
     * @param targetStates the desired states to wait for. If multiple states are provided then the waiter will return once the resource reaches any of the provided states
     * @return a new {@code Waiter} instance
     */
    public com.oracle.bmc.waiter.Waiter<GetVolumeGroupBackupRequest, GetVolumeGroupBackupResponse>
            forVolumeGroupBackup(
                    GetVolumeGroupBackupRequest request,
                    com.oracle.bmc.core.model.VolumeGroupBackup.LifecycleState... targetStates) {
        org.apache.commons.lang3.Validate.notEmpty(
                targetStates, "At least one targetState must be provided");
        org.apache.commons.lang3.Validate.noNullElements(
                targetStates, "Null targetState values are not permitted");

        return forVolumeGroupBackup(
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
    public com.oracle.bmc.waiter.Waiter<GetVolumeGroupBackupRequest, GetVolumeGroupBackupResponse>
            forVolumeGroupBackup(
                    GetVolumeGroupBackupRequest request,
                    com.oracle.bmc.core.model.VolumeGroupBackup.LifecycleState targetState,
                    com.oracle.bmc.waiter.TerminationStrategy terminationStrategy,
                    com.oracle.bmc.waiter.DelayStrategy delayStrategy) {
        org.apache.commons.lang3.Validate.notNull(targetState, "The targetState cannot be null");

        return forVolumeGroupBackup(
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
    public com.oracle.bmc.waiter.Waiter<GetVolumeGroupBackupRequest, GetVolumeGroupBackupResponse>
            forVolumeGroupBackup(
                    GetVolumeGroupBackupRequest request,
                    com.oracle.bmc.waiter.TerminationStrategy terminationStrategy,
                    com.oracle.bmc.waiter.DelayStrategy delayStrategy,
                    com.oracle.bmc.core.model.VolumeGroupBackup.LifecycleState... targetStates) {
        org.apache.commons.lang3.Validate.notEmpty(
                targetStates, "At least one target state must be provided");
        org.apache.commons.lang3.Validate.noNullElements(
                targetStates, "Null target states are not permitted");

        return forVolumeGroupBackup(
                com.oracle.bmc.waiter.Waiters.newWaiter(terminationStrategy, delayStrategy),
                request,
                targetStates);
    }

    // Helper method to create a new Waiter for VolumeGroupBackup.
    private com.oracle.bmc.waiter.Waiter<GetVolumeGroupBackupRequest, GetVolumeGroupBackupResponse>
            forVolumeGroupBackup(
                    com.oracle.bmc.waiter.BmcGenericWaiter waiter,
                    final GetVolumeGroupBackupRequest request,
                    final com.oracle.bmc.core.model.VolumeGroupBackup.LifecycleState...
                            targetStates) {
        final java.util.Set<com.oracle.bmc.core.model.VolumeGroupBackup.LifecycleState>
                targetStatesSet = new java.util.HashSet<>(java.util.Arrays.asList(targetStates));

        return new com.oracle.bmc.waiter.internal.SimpleWaiterImpl<>(
                executorService,
                waiter.toCallable(
                        com.google.common.base.Suppliers.ofInstance(request),
                        new com.google.common.base.Function<
                                GetVolumeGroupBackupRequest, GetVolumeGroupBackupResponse>() {
                            @Override
                            public GetVolumeGroupBackupResponse apply(
                                    GetVolumeGroupBackupRequest request) {
                                return client.getVolumeGroupBackup(request);
                            }
                        },
                        new com.google.common.base.Predicate<GetVolumeGroupBackupResponse>() {
                            @Override
                            public boolean apply(GetVolumeGroupBackupResponse response) {
                                return targetStatesSet.contains(
                                        response.getVolumeGroupBackup().getLifecycleState());
                            }
                        },
                        targetStatesSet.contains(
                                com.oracle.bmc.core.model.VolumeGroupBackup.LifecycleState
                                        .Terminated)),
                request);
    }
}
