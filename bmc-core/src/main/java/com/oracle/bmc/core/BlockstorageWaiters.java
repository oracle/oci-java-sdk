/**
 * Copyright (c) 2016 Oracle and/or its affiliates. All rights reserved.
 */
package com.oracle.bmc.core;

import com.oracle.bmc.core.model.*;
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
 * resources of Blockstorage.
 * <p>
 * The default configuration used is defined by {@link Waiters#DEFAULT_POLLING_WAITER}.
 */
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20160918")
@RequiredArgsConstructor
public class BlockstorageWaiters {
    private final ExecutorService executorService;
    private final Blockstorage client;

    /**
     * Creates a new {@link Waiter} using default configuration.
     *
     * @param request The request to send.
     * @param targetState The desired state to wait for.
     * @return A new Waiter instance.
     */
    public Waiter<GetVolumeRequest, GetVolumeResponse> forVolume(
            GetVolumeRequest request, Volume.LifecycleState targetState) {
        return forVolume(Waiters.DEFAULT_POLLING_WAITER, request, targetState);
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
    public Waiter<GetVolumeRequest, GetVolumeResponse> forVolume(
            GetVolumeRequest request,
            Volume.LifecycleState targetState,
            TerminationStrategy terminationStrategy,
            DelayStrategy delayStrategy) {
        return forVolume(
                Waiters.newWaiter(terminationStrategy, delayStrategy), request, targetState);
    }

    // Helper method to create a new Waiter for Volume.
    private Waiter<GetVolumeRequest, GetVolumeResponse> forVolume(
            BmcGenericWaiter waiter,
            final GetVolumeRequest request,
            final Volume.LifecycleState targetState) {
        return new SimpleWaiterImpl<>(
                executorService,
                waiter.toCallable(
                        Suppliers.ofInstance(request),
                        new Function<GetVolumeRequest, GetVolumeResponse>() {
                            @Override
                            public GetVolumeResponse apply(GetVolumeRequest request) {
                                return client.getVolume(request);
                            }
                        },
                        new Predicate<GetVolumeResponse>() {
                            @Override
                            public boolean apply(GetVolumeResponse response) {
                                return response.getVolume().getLifecycleState() == targetState;
                            }
                        },
                        targetState == Volume.LifecycleState.Terminated),
                request);
    }

    /**
     * Creates a new {@link Waiter} using default configuration.
     *
     * @param request The request to send.
     * @param targetState The desired state to wait for.
     * @return A new Waiter instance.
     */
    public Waiter<GetVolumeBackupRequest, GetVolumeBackupResponse> forVolumeBackup(
            GetVolumeBackupRequest request, VolumeBackup.LifecycleState targetState) {
        return forVolumeBackup(Waiters.DEFAULT_POLLING_WAITER, request, targetState);
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
    public Waiter<GetVolumeBackupRequest, GetVolumeBackupResponse> forVolumeBackup(
            GetVolumeBackupRequest request,
            VolumeBackup.LifecycleState targetState,
            TerminationStrategy terminationStrategy,
            DelayStrategy delayStrategy) {
        return forVolumeBackup(
                Waiters.newWaiter(terminationStrategy, delayStrategy), request, targetState);
    }

    // Helper method to create a new Waiter for VolumeBackup.
    private Waiter<GetVolumeBackupRequest, GetVolumeBackupResponse> forVolumeBackup(
            BmcGenericWaiter waiter,
            final GetVolumeBackupRequest request,
            final VolumeBackup.LifecycleState targetState) {
        return new SimpleWaiterImpl<>(
                executorService,
                waiter.toCallable(
                        Suppliers.ofInstance(request),
                        new Function<GetVolumeBackupRequest, GetVolumeBackupResponse>() {
                            @Override
                            public GetVolumeBackupResponse apply(GetVolumeBackupRequest request) {
                                return client.getVolumeBackup(request);
                            }
                        },
                        new Predicate<GetVolumeBackupResponse>() {
                            @Override
                            public boolean apply(GetVolumeBackupResponse response) {
                                return response.getVolumeBackup().getLifecycleState()
                                        == targetState;
                            }
                        },
                        targetState == VolumeBackup.LifecycleState.Terminated),
                request);
    }
}
