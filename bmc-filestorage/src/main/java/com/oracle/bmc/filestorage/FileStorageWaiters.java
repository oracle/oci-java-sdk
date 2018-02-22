/**
 * Copyright (c) 2016, 2018, Oracle and/or its affiliates. All rights reserved.
 */
package com.oracle.bmc.filestorage;

import com.oracle.bmc.filestorage.requests.*;
import com.oracle.bmc.filestorage.responses.*;

/**
 * Collection of helper methods to produce {@link Waiter}s for different
 * resources of FileStorage.
 * <p>
 * The default configuration used is defined by {@link Waiters#DEFAULT_POLLING_WAITER}.
 */
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20171215")
@lombok.RequiredArgsConstructor
public class FileStorageWaiters {
    private final java.util.concurrent.ExecutorService executorService;
    private final FileStorage client;

    /**
     * Creates a new {@link Waiter} using default configuration.
     *
     * @param request The request to send.
     * @param targetState The desired state to wait for.
     * @return A new Waiter instance.
     */
    public com.oracle.bmc.waiter.Waiter<GetExportRequest, GetExportResponse> forExport(
            GetExportRequest request,
            com.oracle.bmc.filestorage.model.Export.LifecycleState targetState) {
        return forExport(
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
    public com.oracle.bmc.waiter.Waiter<GetExportRequest, GetExportResponse> forExport(
            GetExportRequest request,
            com.oracle.bmc.filestorage.model.Export.LifecycleState targetState,
            com.oracle.bmc.waiter.TerminationStrategy terminationStrategy,
            com.oracle.bmc.waiter.DelayStrategy delayStrategy) {
        return forExport(
                com.oracle.bmc.waiter.Waiters.newWaiter(terminationStrategy, delayStrategy),
                request,
                targetState);
    }

    // Helper method to create a new Waiter for Export.
    private com.oracle.bmc.waiter.Waiter<GetExportRequest, GetExportResponse> forExport(
            com.oracle.bmc.waiter.BmcGenericWaiter waiter,
            final GetExportRequest request,
            final com.oracle.bmc.filestorage.model.Export.LifecycleState targetState) {
        return new com.oracle.bmc.waiter.internal.SimpleWaiterImpl<>(
                executorService,
                waiter.toCallable(
                        com.google.common.base.Suppliers.ofInstance(request),
                        new com.google.common.base.Function<GetExportRequest, GetExportResponse>() {
                            @Override
                            public GetExportResponse apply(GetExportRequest request) {
                                return client.getExport(request);
                            }
                        },
                        new com.google.common.base.Predicate<GetExportResponse>() {
                            @Override
                            public boolean apply(GetExportResponse response) {
                                return response.getExport().getLifecycleState() == targetState;
                            }
                        },
                        targetState
                                == com.oracle.bmc.filestorage.model.Export.LifecycleState.Deleted),
                request);
    }

    /**
     * Creates a new {@link Waiter} using default configuration.
     *
     * @param request The request to send.
     * @param targetState The desired state to wait for.
     * @return A new Waiter instance.
     */
    public com.oracle.bmc.waiter.Waiter<GetExportSetRequest, GetExportSetResponse> forExportSet(
            GetExportSetRequest request,
            com.oracle.bmc.filestorage.model.ExportSet.LifecycleState targetState) {
        return forExportSet(
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
    public com.oracle.bmc.waiter.Waiter<GetExportSetRequest, GetExportSetResponse> forExportSet(
            GetExportSetRequest request,
            com.oracle.bmc.filestorage.model.ExportSet.LifecycleState targetState,
            com.oracle.bmc.waiter.TerminationStrategy terminationStrategy,
            com.oracle.bmc.waiter.DelayStrategy delayStrategy) {
        return forExportSet(
                com.oracle.bmc.waiter.Waiters.newWaiter(terminationStrategy, delayStrategy),
                request,
                targetState);
    }

    // Helper method to create a new Waiter for ExportSet.
    private com.oracle.bmc.waiter.Waiter<GetExportSetRequest, GetExportSetResponse> forExportSet(
            com.oracle.bmc.waiter.BmcGenericWaiter waiter,
            final GetExportSetRequest request,
            final com.oracle.bmc.filestorage.model.ExportSet.LifecycleState targetState) {
        return new com.oracle.bmc.waiter.internal.SimpleWaiterImpl<>(
                executorService,
                waiter.toCallable(
                        com.google.common.base.Suppliers.ofInstance(request),
                        new com.google.common.base.Function<
                                GetExportSetRequest, GetExportSetResponse>() {
                            @Override
                            public GetExportSetResponse apply(GetExportSetRequest request) {
                                return client.getExportSet(request);
                            }
                        },
                        new com.google.common.base.Predicate<GetExportSetResponse>() {
                            @Override
                            public boolean apply(GetExportSetResponse response) {
                                return response.getExportSet().getLifecycleState() == targetState;
                            }
                        },
                        targetState
                                == com.oracle.bmc.filestorage.model.ExportSet.LifecycleState
                                        .Deleted),
                request);
    }

    /**
     * Creates a new {@link Waiter} using default configuration.
     *
     * @param request The request to send.
     * @param targetState The desired state to wait for.
     * @return A new Waiter instance.
     */
    public com.oracle.bmc.waiter.Waiter<GetFileSystemRequest, GetFileSystemResponse> forFileSystem(
            GetFileSystemRequest request,
            com.oracle.bmc.filestorage.model.FileSystem.LifecycleState targetState) {
        return forFileSystem(
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
    public com.oracle.bmc.waiter.Waiter<GetFileSystemRequest, GetFileSystemResponse> forFileSystem(
            GetFileSystemRequest request,
            com.oracle.bmc.filestorage.model.FileSystem.LifecycleState targetState,
            com.oracle.bmc.waiter.TerminationStrategy terminationStrategy,
            com.oracle.bmc.waiter.DelayStrategy delayStrategy) {
        return forFileSystem(
                com.oracle.bmc.waiter.Waiters.newWaiter(terminationStrategy, delayStrategy),
                request,
                targetState);
    }

    // Helper method to create a new Waiter for FileSystem.
    private com.oracle.bmc.waiter.Waiter<GetFileSystemRequest, GetFileSystemResponse> forFileSystem(
            com.oracle.bmc.waiter.BmcGenericWaiter waiter,
            final GetFileSystemRequest request,
            final com.oracle.bmc.filestorage.model.FileSystem.LifecycleState targetState) {
        return new com.oracle.bmc.waiter.internal.SimpleWaiterImpl<>(
                executorService,
                waiter.toCallable(
                        com.google.common.base.Suppliers.ofInstance(request),
                        new com.google.common.base.Function<
                                GetFileSystemRequest, GetFileSystemResponse>() {
                            @Override
                            public GetFileSystemResponse apply(GetFileSystemRequest request) {
                                return client.getFileSystem(request);
                            }
                        },
                        new com.google.common.base.Predicate<GetFileSystemResponse>() {
                            @Override
                            public boolean apply(GetFileSystemResponse response) {
                                return response.getFileSystem().getLifecycleState() == targetState;
                            }
                        },
                        targetState
                                == com.oracle.bmc.filestorage.model.FileSystem.LifecycleState
                                        .Deleted),
                request);
    }

    /**
     * Creates a new {@link Waiter} using default configuration.
     *
     * @param request The request to send.
     * @param targetState The desired state to wait for.
     * @return A new Waiter instance.
     */
    public com.oracle.bmc.waiter.Waiter<GetMountTargetRequest, GetMountTargetResponse>
            forMountTarget(
                    GetMountTargetRequest request,
                    com.oracle.bmc.filestorage.model.MountTarget.LifecycleState targetState) {
        return forMountTarget(
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
    public com.oracle.bmc.waiter.Waiter<GetMountTargetRequest, GetMountTargetResponse>
            forMountTarget(
                    GetMountTargetRequest request,
                    com.oracle.bmc.filestorage.model.MountTarget.LifecycleState targetState,
                    com.oracle.bmc.waiter.TerminationStrategy terminationStrategy,
                    com.oracle.bmc.waiter.DelayStrategy delayStrategy) {
        return forMountTarget(
                com.oracle.bmc.waiter.Waiters.newWaiter(terminationStrategy, delayStrategy),
                request,
                targetState);
    }

    // Helper method to create a new Waiter for MountTarget.
    private com.oracle.bmc.waiter.Waiter<GetMountTargetRequest, GetMountTargetResponse>
            forMountTarget(
                    com.oracle.bmc.waiter.BmcGenericWaiter waiter,
                    final GetMountTargetRequest request,
                    final com.oracle.bmc.filestorage.model.MountTarget.LifecycleState targetState) {
        return new com.oracle.bmc.waiter.internal.SimpleWaiterImpl<>(
                executorService,
                waiter.toCallable(
                        com.google.common.base.Suppliers.ofInstance(request),
                        new com.google.common.base.Function<
                                GetMountTargetRequest, GetMountTargetResponse>() {
                            @Override
                            public GetMountTargetResponse apply(GetMountTargetRequest request) {
                                return client.getMountTarget(request);
                            }
                        },
                        new com.google.common.base.Predicate<GetMountTargetResponse>() {
                            @Override
                            public boolean apply(GetMountTargetResponse response) {
                                return response.getMountTarget().getLifecycleState() == targetState;
                            }
                        },
                        targetState
                                == com.oracle.bmc.filestorage.model.MountTarget.LifecycleState
                                        .Deleted),
                request);
    }

    /**
     * Creates a new {@link Waiter} using default configuration.
     *
     * @param request The request to send.
     * @param targetState The desired state to wait for.
     * @return A new Waiter instance.
     */
    public com.oracle.bmc.waiter.Waiter<GetSnapshotRequest, GetSnapshotResponse> forSnapshot(
            GetSnapshotRequest request,
            com.oracle.bmc.filestorage.model.Snapshot.LifecycleState targetState) {
        return forSnapshot(
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
    public com.oracle.bmc.waiter.Waiter<GetSnapshotRequest, GetSnapshotResponse> forSnapshot(
            GetSnapshotRequest request,
            com.oracle.bmc.filestorage.model.Snapshot.LifecycleState targetState,
            com.oracle.bmc.waiter.TerminationStrategy terminationStrategy,
            com.oracle.bmc.waiter.DelayStrategy delayStrategy) {
        return forSnapshot(
                com.oracle.bmc.waiter.Waiters.newWaiter(terminationStrategy, delayStrategy),
                request,
                targetState);
    }

    // Helper method to create a new Waiter for Snapshot.
    private com.oracle.bmc.waiter.Waiter<GetSnapshotRequest, GetSnapshotResponse> forSnapshot(
            com.oracle.bmc.waiter.BmcGenericWaiter waiter,
            final GetSnapshotRequest request,
            final com.oracle.bmc.filestorage.model.Snapshot.LifecycleState targetState) {
        return new com.oracle.bmc.waiter.internal.SimpleWaiterImpl<>(
                executorService,
                waiter.toCallable(
                        com.google.common.base.Suppliers.ofInstance(request),
                        new com.google.common.base.Function<
                                GetSnapshotRequest, GetSnapshotResponse>() {
                            @Override
                            public GetSnapshotResponse apply(GetSnapshotRequest request) {
                                return client.getSnapshot(request);
                            }
                        },
                        new com.google.common.base.Predicate<GetSnapshotResponse>() {
                            @Override
                            public boolean apply(GetSnapshotResponse response) {
                                return response.getSnapshot().getLifecycleState() == targetState;
                            }
                        },
                        targetState
                                == com.oracle.bmc.filestorage.model.Snapshot.LifecycleState
                                        .Deleted),
                request);
    }
}
