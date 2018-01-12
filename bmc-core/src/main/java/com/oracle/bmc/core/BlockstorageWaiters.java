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
     * @param request The request to send.
     * @param targetState The desired state to wait for.
     * @return A new Waiter instance.
     */
    public com.oracle.bmc.waiter.Waiter<GetBootVolumeRequest, GetBootVolumeResponse> forBootVolume(
            GetBootVolumeRequest request,
            com.oracle.bmc.core.model.BootVolume.LifecycleState targetState) {
        return forBootVolume(
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
    public com.oracle.bmc.waiter.Waiter<GetBootVolumeRequest, GetBootVolumeResponse> forBootVolume(
            GetBootVolumeRequest request,
            com.oracle.bmc.core.model.BootVolume.LifecycleState targetState,
            com.oracle.bmc.waiter.TerminationStrategy terminationStrategy,
            com.oracle.bmc.waiter.DelayStrategy delayStrategy) {
        return forBootVolume(
                com.oracle.bmc.waiter.Waiters.newWaiter(terminationStrategy, delayStrategy),
                request,
                targetState);
    }

    // Helper method to create a new Waiter for BootVolume.
    private com.oracle.bmc.waiter.Waiter<GetBootVolumeRequest, GetBootVolumeResponse> forBootVolume(
            com.oracle.bmc.waiter.BmcGenericWaiter waiter,
            final GetBootVolumeRequest request,
            final com.oracle.bmc.core.model.BootVolume.LifecycleState targetState) {
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
                                return response.getBootVolume().getLifecycleState() == targetState;
                            }
                        },
                        targetState
                                == com.oracle.bmc.core.model.BootVolume.LifecycleState.Terminated),
                request);
    }

    /**
     * Creates a new {@link Waiter} using default configuration.
     *
     * @param request The request to send.
     * @param targetState The desired state to wait for.
     * @return A new Waiter instance.
     */
    public com.oracle.bmc.waiter.Waiter<GetVolumeRequest, GetVolumeResponse> forVolume(
            GetVolumeRequest request, com.oracle.bmc.core.model.Volume.LifecycleState targetState) {
        return forVolume(
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
    public com.oracle.bmc.waiter.Waiter<GetVolumeRequest, GetVolumeResponse> forVolume(
            GetVolumeRequest request,
            com.oracle.bmc.core.model.Volume.LifecycleState targetState,
            com.oracle.bmc.waiter.TerminationStrategy terminationStrategy,
            com.oracle.bmc.waiter.DelayStrategy delayStrategy) {
        return forVolume(
                com.oracle.bmc.waiter.Waiters.newWaiter(terminationStrategy, delayStrategy),
                request,
                targetState);
    }

    // Helper method to create a new Waiter for Volume.
    private com.oracle.bmc.waiter.Waiter<GetVolumeRequest, GetVolumeResponse> forVolume(
            com.oracle.bmc.waiter.BmcGenericWaiter waiter,
            final GetVolumeRequest request,
            final com.oracle.bmc.core.model.Volume.LifecycleState targetState) {
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
                                return response.getVolume().getLifecycleState() == targetState;
                            }
                        },
                        targetState == com.oracle.bmc.core.model.Volume.LifecycleState.Terminated),
                request);
    }

    /**
     * Creates a new {@link Waiter} using default configuration.
     *
     * @param request The request to send.
     * @param targetState The desired state to wait for.
     * @return A new Waiter instance.
     */
    public com.oracle.bmc.waiter.Waiter<GetVolumeBackupRequest, GetVolumeBackupResponse>
            forVolumeBackup(
                    GetVolumeBackupRequest request,
                    com.oracle.bmc.core.model.VolumeBackup.LifecycleState targetState) {
        return forVolumeBackup(
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
    public com.oracle.bmc.waiter.Waiter<GetVolumeBackupRequest, GetVolumeBackupResponse>
            forVolumeBackup(
                    GetVolumeBackupRequest request,
                    com.oracle.bmc.core.model.VolumeBackup.LifecycleState targetState,
                    com.oracle.bmc.waiter.TerminationStrategy terminationStrategy,
                    com.oracle.bmc.waiter.DelayStrategy delayStrategy) {
        return forVolumeBackup(
                com.oracle.bmc.waiter.Waiters.newWaiter(terminationStrategy, delayStrategy),
                request,
                targetState);
    }

    // Helper method to create a new Waiter for VolumeBackup.
    private com.oracle.bmc.waiter.Waiter<GetVolumeBackupRequest, GetVolumeBackupResponse>
            forVolumeBackup(
                    com.oracle.bmc.waiter.BmcGenericWaiter waiter,
                    final GetVolumeBackupRequest request,
                    final com.oracle.bmc.core.model.VolumeBackup.LifecycleState targetState) {
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
                                return response.getVolumeBackup().getLifecycleState()
                                        == targetState;
                            }
                        },
                        targetState
                                == com.oracle.bmc.core.model.VolumeBackup.LifecycleState
                                        .Terminated),
                request);
    }
}
