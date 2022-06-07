/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.core;

import com.oracle.bmc.core.requests.*;
import com.oracle.bmc.core.responses.*;
import javax.annotation.Nonnull;

/**
 * Collection of helper methods to produce {@link com.oracle.bmc.waiter.Waiter}s for different
 * resources of Blockstorage.
 * <p>
 * The default configuration used is defined by {@link com.oracle.bmc.waiter.Waiters.Waiters#DEFAULT_POLLING_WAITER}.
 */
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20160918")
public class BlockstorageWaiters {
    @Nonnull private final java.util.concurrent.ExecutorService executorService;
    @Nonnull private final Blockstorage client;
    private final com.oracle.bmc.workrequests.WorkRequest workRequestClient;

    @Deprecated
    public BlockstorageWaiters(
            @Nonnull java.util.concurrent.ExecutorService executorService,
            @Nonnull Blockstorage client) {
        this(executorService, client, null);
    }

    public BlockstorageWaiters(
            @Nonnull java.util.concurrent.ExecutorService executorService,
            @Nonnull Blockstorage client,
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
    public com.oracle.bmc.waiter.Waiter<CopyBootVolumeBackupRequest, CopyBootVolumeBackupResponse>
            forCopyBootVolumeBackup(CopyBootVolumeBackupRequest request) {
        return forCopyBootVolumeBackup(
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
    public com.oracle.bmc.waiter.Waiter<CopyBootVolumeBackupRequest, CopyBootVolumeBackupResponse>
            forCopyBootVolumeBackup(
                    CopyBootVolumeBackupRequest request,
                    com.oracle.bmc.waiter.TerminationStrategy terminationStrategy,
                    com.oracle.bmc.waiter.DelayStrategy delayStrategy) {
        if (workRequestClient == null) {
            throw new IllegalStateException(
                    "A WorkRequestClient must be supplied to this waiter for this operation");
        }

        return new com.oracle.bmc.waiter.internal.SimpleWaiterImpl<>(
                executorService,
                new java.util.concurrent.Callable<CopyBootVolumeBackupResponse>() {
                    @Override
                    public CopyBootVolumeBackupResponse call() throws Exception {
                        final CopyBootVolumeBackupResponse response =
                                client.copyBootVolumeBackup(request);

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
    public com.oracle.bmc.waiter.Waiter<CopyVolumeBackupRequest, CopyVolumeBackupResponse>
            forCopyVolumeBackup(CopyVolumeBackupRequest request) {
        return forCopyVolumeBackup(
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
    public com.oracle.bmc.waiter.Waiter<CopyVolumeBackupRequest, CopyVolumeBackupResponse>
            forCopyVolumeBackup(
                    CopyVolumeBackupRequest request,
                    com.oracle.bmc.waiter.TerminationStrategy terminationStrategy,
                    com.oracle.bmc.waiter.DelayStrategy delayStrategy) {
        if (workRequestClient == null) {
            throw new IllegalStateException(
                    "A WorkRequestClient must be supplied to this waiter for this operation");
        }

        return new com.oracle.bmc.waiter.internal.SimpleWaiterImpl<>(
                executorService,
                new java.util.concurrent.Callable<CopyVolumeBackupResponse>() {
                    @Override
                    public CopyVolumeBackupResponse call() throws Exception {
                        final CopyVolumeBackupResponse response = client.copyVolumeBackup(request);

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
    public com.oracle.bmc.waiter.Waiter<GetBlockVolumeReplicaRequest, GetBlockVolumeReplicaResponse>
            forBlockVolumeReplica(
                    GetBlockVolumeReplicaRequest request,
                    com.oracle.bmc.core.model.BlockVolumeReplica.LifecycleState... targetStates) {
        org.apache.commons.lang3.Validate.notEmpty(
                targetStates, "At least one targetState must be provided");
        org.apache.commons.lang3.Validate.noNullElements(
                targetStates, "Null targetState values are not permitted");

        return forBlockVolumeReplica(
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
    public com.oracle.bmc.waiter.Waiter<GetBlockVolumeReplicaRequest, GetBlockVolumeReplicaResponse>
            forBlockVolumeReplica(
                    GetBlockVolumeReplicaRequest request,
                    com.oracle.bmc.core.model.BlockVolumeReplica.LifecycleState targetState,
                    com.oracle.bmc.waiter.TerminationStrategy terminationStrategy,
                    com.oracle.bmc.waiter.DelayStrategy delayStrategy) {
        org.apache.commons.lang3.Validate.notNull(targetState, "The targetState cannot be null");

        return forBlockVolumeReplica(
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
    public com.oracle.bmc.waiter.Waiter<GetBlockVolumeReplicaRequest, GetBlockVolumeReplicaResponse>
            forBlockVolumeReplica(
                    GetBlockVolumeReplicaRequest request,
                    com.oracle.bmc.waiter.TerminationStrategy terminationStrategy,
                    com.oracle.bmc.waiter.DelayStrategy delayStrategy,
                    com.oracle.bmc.core.model.BlockVolumeReplica.LifecycleState... targetStates) {
        org.apache.commons.lang3.Validate.notEmpty(
                targetStates, "At least one target state must be provided");
        org.apache.commons.lang3.Validate.noNullElements(
                targetStates, "Null target states are not permitted");

        return forBlockVolumeReplica(
                com.oracle.bmc.waiter.Waiters.newWaiter(terminationStrategy, delayStrategy),
                request,
                targetStates);
    }

    // Helper method to create a new Waiter for BlockVolumeReplica.
    private com.oracle.bmc.waiter.Waiter<
                    GetBlockVolumeReplicaRequest, GetBlockVolumeReplicaResponse>
            forBlockVolumeReplica(
                    com.oracle.bmc.waiter.BmcGenericWaiter waiter,
                    final GetBlockVolumeReplicaRequest request,
                    final com.oracle.bmc.core.model.BlockVolumeReplica.LifecycleState...
                            targetStates) {
        final java.util.Set<com.oracle.bmc.core.model.BlockVolumeReplica.LifecycleState>
                targetStatesSet = new java.util.HashSet<>(java.util.Arrays.asList(targetStates));

        return new com.oracle.bmc.waiter.internal.SimpleWaiterImpl<>(
                executorService,
                waiter.toCallable(
                        com.google.common.base.Suppliers.ofInstance(request),
                        new com.google.common.base.Function<
                                GetBlockVolumeReplicaRequest, GetBlockVolumeReplicaResponse>() {
                            @Override
                            public GetBlockVolumeReplicaResponse apply(
                                    GetBlockVolumeReplicaRequest request) {
                                return client.getBlockVolumeReplica(request);
                            }
                        },
                        new com.google.common.base.Predicate<GetBlockVolumeReplicaResponse>() {
                            @Override
                            public boolean apply(GetBlockVolumeReplicaResponse response) {
                                return targetStatesSet.contains(
                                        response.getBlockVolumeReplica().getLifecycleState());
                            }
                        },
                        targetStatesSet.contains(
                                com.oracle.bmc.core.model.BlockVolumeReplica.LifecycleState
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
     * Creates a new {@link com.oracle.bmc.waiter.Waiter} using the provided configuration.
     *
     * @param request the request to send
     * @param targetState the desired state to wait for
     * @param terminationStrategy the {@link com.oracle.bmc.waiter.TerminationStrategy} to use
     * @param delayStrategy the {@link com.oracle.bmc.waiter.DelayStrategy} to use
     * @return a new {@code com.oracle.bmc.waiter.Waiter} instance
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
     * Creates a new {@link com.oracle.bmc.waiter.Waiter} using the provided configuration.
     *
     * @param request the request to send
     * @param terminationStrategy the {@link com.oracle.bmc.waiter.TerminationStrategy} to use
     * @param delayStrategy the {@link com.oracle.bmc.waiter.DelayStrategy} to use
     * @param targetStates the desired states to wait for. The waiter will return once the resource reaches any of the provided states
     * @return a new {@code com.oracle.bmc.waiter.Waiter} instance
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
     * Creates a new {@link com.oracle.bmc.waiter.Waiter} using the default configuration.
     *
     * @param request the request to send
     * @param targetStates the desired states to wait for. If multiple states are provided then the waiter will return once the resource reaches any of the provided states
     * @return a new {@code Waiter} instance
     */
    public com.oracle.bmc.waiter.Waiter<GetBootVolumeBackupRequest, GetBootVolumeBackupResponse>
            forBootVolumeBackup(
                    GetBootVolumeBackupRequest request,
                    com.oracle.bmc.core.model.BootVolumeBackup.LifecycleState... targetStates) {
        org.apache.commons.lang3.Validate.notEmpty(
                targetStates, "At least one targetState must be provided");
        org.apache.commons.lang3.Validate.noNullElements(
                targetStates, "Null targetState values are not permitted");

        return forBootVolumeBackup(
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
    public com.oracle.bmc.waiter.Waiter<GetBootVolumeBackupRequest, GetBootVolumeBackupResponse>
            forBootVolumeBackup(
                    GetBootVolumeBackupRequest request,
                    com.oracle.bmc.core.model.BootVolumeBackup.LifecycleState targetState,
                    com.oracle.bmc.waiter.TerminationStrategy terminationStrategy,
                    com.oracle.bmc.waiter.DelayStrategy delayStrategy) {
        org.apache.commons.lang3.Validate.notNull(targetState, "The targetState cannot be null");

        return forBootVolumeBackup(
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
    public com.oracle.bmc.waiter.Waiter<GetBootVolumeBackupRequest, GetBootVolumeBackupResponse>
            forBootVolumeBackup(
                    GetBootVolumeBackupRequest request,
                    com.oracle.bmc.waiter.TerminationStrategy terminationStrategy,
                    com.oracle.bmc.waiter.DelayStrategy delayStrategy,
                    com.oracle.bmc.core.model.BootVolumeBackup.LifecycleState... targetStates) {
        org.apache.commons.lang3.Validate.notEmpty(
                targetStates, "At least one target state must be provided");
        org.apache.commons.lang3.Validate.noNullElements(
                targetStates, "Null target states are not permitted");

        return forBootVolumeBackup(
                com.oracle.bmc.waiter.Waiters.newWaiter(terminationStrategy, delayStrategy),
                request,
                targetStates);
    }

    // Helper method to create a new Waiter for BootVolumeBackup.
    private com.oracle.bmc.waiter.Waiter<GetBootVolumeBackupRequest, GetBootVolumeBackupResponse>
            forBootVolumeBackup(
                    com.oracle.bmc.waiter.BmcGenericWaiter waiter,
                    final GetBootVolumeBackupRequest request,
                    final com.oracle.bmc.core.model.BootVolumeBackup.LifecycleState...
                            targetStates) {
        final java.util.Set<com.oracle.bmc.core.model.BootVolumeBackup.LifecycleState>
                targetStatesSet = new java.util.HashSet<>(java.util.Arrays.asList(targetStates));

        return new com.oracle.bmc.waiter.internal.SimpleWaiterImpl<>(
                executorService,
                waiter.toCallable(
                        com.google.common.base.Suppliers.ofInstance(request),
                        new com.google.common.base.Function<
                                GetBootVolumeBackupRequest, GetBootVolumeBackupResponse>() {
                            @Override
                            public GetBootVolumeBackupResponse apply(
                                    GetBootVolumeBackupRequest request) {
                                return client.getBootVolumeBackup(request);
                            }
                        },
                        new com.google.common.base.Predicate<GetBootVolumeBackupResponse>() {
                            @Override
                            public boolean apply(GetBootVolumeBackupResponse response) {
                                return targetStatesSet.contains(
                                        response.getBootVolumeBackup().getLifecycleState());
                            }
                        },
                        targetStatesSet.contains(
                                com.oracle.bmc.core.model.BootVolumeBackup.LifecycleState
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
    public com.oracle.bmc.waiter.Waiter<GetBootVolumeReplicaRequest, GetBootVolumeReplicaResponse>
            forBootVolumeReplica(
                    GetBootVolumeReplicaRequest request,
                    com.oracle.bmc.core.model.BootVolumeReplica.LifecycleState... targetStates) {
        org.apache.commons.lang3.Validate.notEmpty(
                targetStates, "At least one targetState must be provided");
        org.apache.commons.lang3.Validate.noNullElements(
                targetStates, "Null targetState values are not permitted");

        return forBootVolumeReplica(
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
    public com.oracle.bmc.waiter.Waiter<GetBootVolumeReplicaRequest, GetBootVolumeReplicaResponse>
            forBootVolumeReplica(
                    GetBootVolumeReplicaRequest request,
                    com.oracle.bmc.core.model.BootVolumeReplica.LifecycleState targetState,
                    com.oracle.bmc.waiter.TerminationStrategy terminationStrategy,
                    com.oracle.bmc.waiter.DelayStrategy delayStrategy) {
        org.apache.commons.lang3.Validate.notNull(targetState, "The targetState cannot be null");

        return forBootVolumeReplica(
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
    public com.oracle.bmc.waiter.Waiter<GetBootVolumeReplicaRequest, GetBootVolumeReplicaResponse>
            forBootVolumeReplica(
                    GetBootVolumeReplicaRequest request,
                    com.oracle.bmc.waiter.TerminationStrategy terminationStrategy,
                    com.oracle.bmc.waiter.DelayStrategy delayStrategy,
                    com.oracle.bmc.core.model.BootVolumeReplica.LifecycleState... targetStates) {
        org.apache.commons.lang3.Validate.notEmpty(
                targetStates, "At least one target state must be provided");
        org.apache.commons.lang3.Validate.noNullElements(
                targetStates, "Null target states are not permitted");

        return forBootVolumeReplica(
                com.oracle.bmc.waiter.Waiters.newWaiter(terminationStrategy, delayStrategy),
                request,
                targetStates);
    }

    // Helper method to create a new Waiter for BootVolumeReplica.
    private com.oracle.bmc.waiter.Waiter<GetBootVolumeReplicaRequest, GetBootVolumeReplicaResponse>
            forBootVolumeReplica(
                    com.oracle.bmc.waiter.BmcGenericWaiter waiter,
                    final GetBootVolumeReplicaRequest request,
                    final com.oracle.bmc.core.model.BootVolumeReplica.LifecycleState...
                            targetStates) {
        final java.util.Set<com.oracle.bmc.core.model.BootVolumeReplica.LifecycleState>
                targetStatesSet = new java.util.HashSet<>(java.util.Arrays.asList(targetStates));

        return new com.oracle.bmc.waiter.internal.SimpleWaiterImpl<>(
                executorService,
                waiter.toCallable(
                        com.google.common.base.Suppliers.ofInstance(request),
                        new com.google.common.base.Function<
                                GetBootVolumeReplicaRequest, GetBootVolumeReplicaResponse>() {
                            @Override
                            public GetBootVolumeReplicaResponse apply(
                                    GetBootVolumeReplicaRequest request) {
                                return client.getBootVolumeReplica(request);
                            }
                        },
                        new com.google.common.base.Predicate<GetBootVolumeReplicaResponse>() {
                            @Override
                            public boolean apply(GetBootVolumeReplicaResponse response) {
                                return targetStatesSet.contains(
                                        response.getBootVolumeReplica().getLifecycleState());
                            }
                        },
                        targetStatesSet.contains(
                                com.oracle.bmc.core.model.BootVolumeReplica.LifecycleState
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
     * Creates a new {@link com.oracle.bmc.waiter.Waiter} using the provided configuration.
     *
     * @param request the request to send
     * @param targetState the desired state to wait for
     * @param terminationStrategy the {@link com.oracle.bmc.waiter.TerminationStrategy} to use
     * @param delayStrategy the {@link com.oracle.bmc.waiter.DelayStrategy} to use
     * @return a new {@code com.oracle.bmc.waiter.Waiter} instance
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
     * Creates a new {@link com.oracle.bmc.waiter.Waiter} using the provided configuration.
     *
     * @param request the request to send
     * @param terminationStrategy the {@link com.oracle.bmc.waiter.TerminationStrategy} to use
     * @param delayStrategy the {@link com.oracle.bmc.waiter.DelayStrategy} to use
     * @param targetStates the desired states to wait for. The waiter will return once the resource reaches any of the provided states
     * @return a new {@code com.oracle.bmc.waiter.Waiter} instance
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
     * Creates a new {@link com.oracle.bmc.waiter.Waiter} using the default configuration.
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
     * Creates a new {@link com.oracle.bmc.waiter.Waiter} using the provided configuration.
     *
     * @param request the request to send
     * @param targetState the desired state to wait for
     * @param terminationStrategy the {@link com.oracle.bmc.waiter.TerminationStrategy} to use
     * @param delayStrategy the {@link com.oracle.bmc.waiter.DelayStrategy} to use
     * @return a new {@code com.oracle.bmc.waiter.Waiter} instance
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
     * Creates a new {@link com.oracle.bmc.waiter.Waiter} using the provided configuration.
     *
     * @param request the request to send
     * @param terminationStrategy the {@link com.oracle.bmc.waiter.TerminationStrategy} to use
     * @param delayStrategy the {@link com.oracle.bmc.waiter.DelayStrategy} to use
     * @param targetStates the desired states to wait for. The waiter will return once the resource reaches any of the provided states
     * @return a new {@code com.oracle.bmc.waiter.Waiter} instance
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
     * Creates a new {@link com.oracle.bmc.waiter.Waiter} using the default configuration.
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
     * Creates a new {@link com.oracle.bmc.waiter.Waiter} using the provided configuration.
     *
     * @param request the request to send
     * @param targetState the desired state to wait for
     * @param terminationStrategy the {@link com.oracle.bmc.waiter.TerminationStrategy} to use
     * @param delayStrategy the {@link com.oracle.bmc.waiter.DelayStrategy} to use
     * @return a new {@code com.oracle.bmc.waiter.Waiter} instance
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
     * Creates a new {@link com.oracle.bmc.waiter.Waiter} using the provided configuration.
     *
     * @param request the request to send
     * @param terminationStrategy the {@link com.oracle.bmc.waiter.TerminationStrategy} to use
     * @param delayStrategy the {@link com.oracle.bmc.waiter.DelayStrategy} to use
     * @param targetStates the desired states to wait for. The waiter will return once the resource reaches any of the provided states
     * @return a new {@code com.oracle.bmc.waiter.Waiter} instance
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
     * Creates a new {@link com.oracle.bmc.waiter.Waiter} using the default configuration.
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
     * Creates a new {@link com.oracle.bmc.waiter.Waiter} using the provided configuration.
     *
     * @param request the request to send
     * @param targetState the desired state to wait for
     * @param terminationStrategy the {@link com.oracle.bmc.waiter.TerminationStrategy} to use
     * @param delayStrategy the {@link com.oracle.bmc.waiter.DelayStrategy} to use
     * @return a new {@code com.oracle.bmc.waiter.Waiter} instance
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
     * Creates a new {@link com.oracle.bmc.waiter.Waiter} using the provided configuration.
     *
     * @param request the request to send
     * @param terminationStrategy the {@link com.oracle.bmc.waiter.TerminationStrategy} to use
     * @param delayStrategy the {@link com.oracle.bmc.waiter.DelayStrategy} to use
     * @param targetStates the desired states to wait for. The waiter will return once the resource reaches any of the provided states
     * @return a new {@code com.oracle.bmc.waiter.Waiter} instance
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

    /**
     * Creates a new {@link com.oracle.bmc.waiter.Waiter} using the default configuration.
     *
     * @param request the request to send
     * @param targetStates the desired states to wait for. If multiple states are provided then the waiter will return once the resource reaches any of the provided states
     * @return a new {@code Waiter} instance
     */
    public com.oracle.bmc.waiter.Waiter<GetVolumeGroupReplicaRequest, GetVolumeGroupReplicaResponse>
            forVolumeGroupReplica(
                    GetVolumeGroupReplicaRequest request,
                    com.oracle.bmc.core.model.VolumeGroupReplica.LifecycleState... targetStates) {
        org.apache.commons.lang3.Validate.notEmpty(
                targetStates, "At least one targetState must be provided");
        org.apache.commons.lang3.Validate.noNullElements(
                targetStates, "Null targetState values are not permitted");

        return forVolumeGroupReplica(
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
    public com.oracle.bmc.waiter.Waiter<GetVolumeGroupReplicaRequest, GetVolumeGroupReplicaResponse>
            forVolumeGroupReplica(
                    GetVolumeGroupReplicaRequest request,
                    com.oracle.bmc.core.model.VolumeGroupReplica.LifecycleState targetState,
                    com.oracle.bmc.waiter.TerminationStrategy terminationStrategy,
                    com.oracle.bmc.waiter.DelayStrategy delayStrategy) {
        org.apache.commons.lang3.Validate.notNull(targetState, "The targetState cannot be null");

        return forVolumeGroupReplica(
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
    public com.oracle.bmc.waiter.Waiter<GetVolumeGroupReplicaRequest, GetVolumeGroupReplicaResponse>
            forVolumeGroupReplica(
                    GetVolumeGroupReplicaRequest request,
                    com.oracle.bmc.waiter.TerminationStrategy terminationStrategy,
                    com.oracle.bmc.waiter.DelayStrategy delayStrategy,
                    com.oracle.bmc.core.model.VolumeGroupReplica.LifecycleState... targetStates) {
        org.apache.commons.lang3.Validate.notEmpty(
                targetStates, "At least one target state must be provided");
        org.apache.commons.lang3.Validate.noNullElements(
                targetStates, "Null target states are not permitted");

        return forVolumeGroupReplica(
                com.oracle.bmc.waiter.Waiters.newWaiter(terminationStrategy, delayStrategy),
                request,
                targetStates);
    }

    // Helper method to create a new Waiter for VolumeGroupReplica.
    private com.oracle.bmc.waiter.Waiter<
                    GetVolumeGroupReplicaRequest, GetVolumeGroupReplicaResponse>
            forVolumeGroupReplica(
                    com.oracle.bmc.waiter.BmcGenericWaiter waiter,
                    final GetVolumeGroupReplicaRequest request,
                    final com.oracle.bmc.core.model.VolumeGroupReplica.LifecycleState...
                            targetStates) {
        final java.util.Set<com.oracle.bmc.core.model.VolumeGroupReplica.LifecycleState>
                targetStatesSet = new java.util.HashSet<>(java.util.Arrays.asList(targetStates));

        return new com.oracle.bmc.waiter.internal.SimpleWaiterImpl<>(
                executorService,
                waiter.toCallable(
                        com.google.common.base.Suppliers.ofInstance(request),
                        new com.google.common.base.Function<
                                GetVolumeGroupReplicaRequest, GetVolumeGroupReplicaResponse>() {
                            @Override
                            public GetVolumeGroupReplicaResponse apply(
                                    GetVolumeGroupReplicaRequest request) {
                                return client.getVolumeGroupReplica(request);
                            }
                        },
                        new com.google.common.base.Predicate<GetVolumeGroupReplicaResponse>() {
                            @Override
                            public boolean apply(GetVolumeGroupReplicaResponse response) {
                                return targetStatesSet.contains(
                                        response.getVolumeGroupReplica().getLifecycleState());
                            }
                        },
                        targetStatesSet.contains(
                                com.oracle.bmc.core.model.VolumeGroupReplica.LifecycleState
                                        .Terminated)),
                request);
    }
}
