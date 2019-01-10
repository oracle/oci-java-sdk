/**
 * Copyright (c) 2016, 2019, Oracle and/or its affiliates. All rights reserved.
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
     * @param request the request to send
     * @param targetStates the desired states to wait for. If multiple states are provided then the waiter will return once the resource reaches any of the provided states
     * @return a new {@code Waiter} instance
     */
    public com.oracle.bmc.waiter.Waiter<GetExportRequest, GetExportResponse> forExport(
            GetExportRequest request,
            com.oracle.bmc.filestorage.model.Export.LifecycleState... targetStates) {
        org.apache.commons.lang3.Validate.notEmpty(
                targetStates, "At least one targetState must be provided");
        org.apache.commons.lang3.Validate.noNullElements(
                targetStates, "Null targetState values are not permitted");

        return forExport(
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
    public com.oracle.bmc.waiter.Waiter<GetExportRequest, GetExportResponse> forExport(
            GetExportRequest request,
            com.oracle.bmc.filestorage.model.Export.LifecycleState targetState,
            com.oracle.bmc.waiter.TerminationStrategy terminationStrategy,
            com.oracle.bmc.waiter.DelayStrategy delayStrategy) {
        org.apache.commons.lang3.Validate.notNull(targetState, "The targetState cannot be null");

        return forExport(
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
    public com.oracle.bmc.waiter.Waiter<GetExportRequest, GetExportResponse> forExport(
            GetExportRequest request,
            com.oracle.bmc.waiter.TerminationStrategy terminationStrategy,
            com.oracle.bmc.waiter.DelayStrategy delayStrategy,
            com.oracle.bmc.filestorage.model.Export.LifecycleState... targetStates) {
        org.apache.commons.lang3.Validate.notEmpty(
                targetStates, "At least one target state must be provided");
        org.apache.commons.lang3.Validate.noNullElements(
                targetStates, "Null target states are not permitted");

        return forExport(
                com.oracle.bmc.waiter.Waiters.newWaiter(terminationStrategy, delayStrategy),
                request,
                targetStates);
    }

    // Helper method to create a new Waiter for Export.
    private com.oracle.bmc.waiter.Waiter<GetExportRequest, GetExportResponse> forExport(
            com.oracle.bmc.waiter.BmcGenericWaiter waiter,
            final GetExportRequest request,
            final com.oracle.bmc.filestorage.model.Export.LifecycleState... targetStates) {
        final java.util.Set<com.oracle.bmc.filestorage.model.Export.LifecycleState>
                targetStatesSet = new java.util.HashSet<>(java.util.Arrays.asList(targetStates));

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
                                return targetStatesSet.contains(
                                        response.getExport().getLifecycleState());
                            }
                        },
                        targetStatesSet.contains(
                                com.oracle.bmc.filestorage.model.Export.LifecycleState.Deleted)),
                request);
    }

    /**
     * Creates a new {@link Waiter} using default configuration.
     *
     * @param request the request to send
     * @param targetStates the desired states to wait for. If multiple states are provided then the waiter will return once the resource reaches any of the provided states
     * @return a new {@code Waiter} instance
     */
    public com.oracle.bmc.waiter.Waiter<GetExportSetRequest, GetExportSetResponse> forExportSet(
            GetExportSetRequest request,
            com.oracle.bmc.filestorage.model.ExportSet.LifecycleState... targetStates) {
        org.apache.commons.lang3.Validate.notEmpty(
                targetStates, "At least one targetState must be provided");
        org.apache.commons.lang3.Validate.noNullElements(
                targetStates, "Null targetState values are not permitted");

        return forExportSet(
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
    public com.oracle.bmc.waiter.Waiter<GetExportSetRequest, GetExportSetResponse> forExportSet(
            GetExportSetRequest request,
            com.oracle.bmc.filestorage.model.ExportSet.LifecycleState targetState,
            com.oracle.bmc.waiter.TerminationStrategy terminationStrategy,
            com.oracle.bmc.waiter.DelayStrategy delayStrategy) {
        org.apache.commons.lang3.Validate.notNull(targetState, "The targetState cannot be null");

        return forExportSet(
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
    public com.oracle.bmc.waiter.Waiter<GetExportSetRequest, GetExportSetResponse> forExportSet(
            GetExportSetRequest request,
            com.oracle.bmc.waiter.TerminationStrategy terminationStrategy,
            com.oracle.bmc.waiter.DelayStrategy delayStrategy,
            com.oracle.bmc.filestorage.model.ExportSet.LifecycleState... targetStates) {
        org.apache.commons.lang3.Validate.notEmpty(
                targetStates, "At least one target state must be provided");
        org.apache.commons.lang3.Validate.noNullElements(
                targetStates, "Null target states are not permitted");

        return forExportSet(
                com.oracle.bmc.waiter.Waiters.newWaiter(terminationStrategy, delayStrategy),
                request,
                targetStates);
    }

    // Helper method to create a new Waiter for ExportSet.
    private com.oracle.bmc.waiter.Waiter<GetExportSetRequest, GetExportSetResponse> forExportSet(
            com.oracle.bmc.waiter.BmcGenericWaiter waiter,
            final GetExportSetRequest request,
            final com.oracle.bmc.filestorage.model.ExportSet.LifecycleState... targetStates) {
        final java.util.Set<com.oracle.bmc.filestorage.model.ExportSet.LifecycleState>
                targetStatesSet = new java.util.HashSet<>(java.util.Arrays.asList(targetStates));

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
                                return targetStatesSet.contains(
                                        response.getExportSet().getLifecycleState());
                            }
                        },
                        targetStatesSet.contains(
                                com.oracle.bmc.filestorage.model.ExportSet.LifecycleState.Deleted)),
                request);
    }

    /**
     * Creates a new {@link Waiter} using default configuration.
     *
     * @param request the request to send
     * @param targetStates the desired states to wait for. If multiple states are provided then the waiter will return once the resource reaches any of the provided states
     * @return a new {@code Waiter} instance
     */
    public com.oracle.bmc.waiter.Waiter<GetFileSystemRequest, GetFileSystemResponse> forFileSystem(
            GetFileSystemRequest request,
            com.oracle.bmc.filestorage.model.FileSystem.LifecycleState... targetStates) {
        org.apache.commons.lang3.Validate.notEmpty(
                targetStates, "At least one targetState must be provided");
        org.apache.commons.lang3.Validate.noNullElements(
                targetStates, "Null targetState values are not permitted");

        return forFileSystem(
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
    public com.oracle.bmc.waiter.Waiter<GetFileSystemRequest, GetFileSystemResponse> forFileSystem(
            GetFileSystemRequest request,
            com.oracle.bmc.filestorage.model.FileSystem.LifecycleState targetState,
            com.oracle.bmc.waiter.TerminationStrategy terminationStrategy,
            com.oracle.bmc.waiter.DelayStrategy delayStrategy) {
        org.apache.commons.lang3.Validate.notNull(targetState, "The targetState cannot be null");

        return forFileSystem(
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
    public com.oracle.bmc.waiter.Waiter<GetFileSystemRequest, GetFileSystemResponse> forFileSystem(
            GetFileSystemRequest request,
            com.oracle.bmc.waiter.TerminationStrategy terminationStrategy,
            com.oracle.bmc.waiter.DelayStrategy delayStrategy,
            com.oracle.bmc.filestorage.model.FileSystem.LifecycleState... targetStates) {
        org.apache.commons.lang3.Validate.notEmpty(
                targetStates, "At least one target state must be provided");
        org.apache.commons.lang3.Validate.noNullElements(
                targetStates, "Null target states are not permitted");

        return forFileSystem(
                com.oracle.bmc.waiter.Waiters.newWaiter(terminationStrategy, delayStrategy),
                request,
                targetStates);
    }

    // Helper method to create a new Waiter for FileSystem.
    private com.oracle.bmc.waiter.Waiter<GetFileSystemRequest, GetFileSystemResponse> forFileSystem(
            com.oracle.bmc.waiter.BmcGenericWaiter waiter,
            final GetFileSystemRequest request,
            final com.oracle.bmc.filestorage.model.FileSystem.LifecycleState... targetStates) {
        final java.util.Set<com.oracle.bmc.filestorage.model.FileSystem.LifecycleState>
                targetStatesSet = new java.util.HashSet<>(java.util.Arrays.asList(targetStates));

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
                                return targetStatesSet.contains(
                                        response.getFileSystem().getLifecycleState());
                            }
                        },
                        targetStatesSet.contains(
                                com.oracle.bmc.filestorage.model.FileSystem.LifecycleState
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
    public com.oracle.bmc.waiter.Waiter<GetMountTargetRequest, GetMountTargetResponse>
            forMountTarget(
                    GetMountTargetRequest request,
                    com.oracle.bmc.filestorage.model.MountTarget.LifecycleState... targetStates) {
        org.apache.commons.lang3.Validate.notEmpty(
                targetStates, "At least one targetState must be provided");
        org.apache.commons.lang3.Validate.noNullElements(
                targetStates, "Null targetState values are not permitted");

        return forMountTarget(
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
    public com.oracle.bmc.waiter.Waiter<GetMountTargetRequest, GetMountTargetResponse>
            forMountTarget(
                    GetMountTargetRequest request,
                    com.oracle.bmc.filestorage.model.MountTarget.LifecycleState targetState,
                    com.oracle.bmc.waiter.TerminationStrategy terminationStrategy,
                    com.oracle.bmc.waiter.DelayStrategy delayStrategy) {
        org.apache.commons.lang3.Validate.notNull(targetState, "The targetState cannot be null");

        return forMountTarget(
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
    public com.oracle.bmc.waiter.Waiter<GetMountTargetRequest, GetMountTargetResponse>
            forMountTarget(
                    GetMountTargetRequest request,
                    com.oracle.bmc.waiter.TerminationStrategy terminationStrategy,
                    com.oracle.bmc.waiter.DelayStrategy delayStrategy,
                    com.oracle.bmc.filestorage.model.MountTarget.LifecycleState... targetStates) {
        org.apache.commons.lang3.Validate.notEmpty(
                targetStates, "At least one target state must be provided");
        org.apache.commons.lang3.Validate.noNullElements(
                targetStates, "Null target states are not permitted");

        return forMountTarget(
                com.oracle.bmc.waiter.Waiters.newWaiter(terminationStrategy, delayStrategy),
                request,
                targetStates);
    }

    // Helper method to create a new Waiter for MountTarget.
    private com.oracle.bmc.waiter.Waiter<GetMountTargetRequest, GetMountTargetResponse>
            forMountTarget(
                    com.oracle.bmc.waiter.BmcGenericWaiter waiter,
                    final GetMountTargetRequest request,
                    final com.oracle.bmc.filestorage.model.MountTarget.LifecycleState...
                            targetStates) {
        final java.util.Set<com.oracle.bmc.filestorage.model.MountTarget.LifecycleState>
                targetStatesSet = new java.util.HashSet<>(java.util.Arrays.asList(targetStates));

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
                                return targetStatesSet.contains(
                                        response.getMountTarget().getLifecycleState());
                            }
                        },
                        targetStatesSet.contains(
                                com.oracle.bmc.filestorage.model.MountTarget.LifecycleState
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
    public com.oracle.bmc.waiter.Waiter<GetSnapshotRequest, GetSnapshotResponse> forSnapshot(
            GetSnapshotRequest request,
            com.oracle.bmc.filestorage.model.Snapshot.LifecycleState... targetStates) {
        org.apache.commons.lang3.Validate.notEmpty(
                targetStates, "At least one targetState must be provided");
        org.apache.commons.lang3.Validate.noNullElements(
                targetStates, "Null targetState values are not permitted");

        return forSnapshot(
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
    public com.oracle.bmc.waiter.Waiter<GetSnapshotRequest, GetSnapshotResponse> forSnapshot(
            GetSnapshotRequest request,
            com.oracle.bmc.filestorage.model.Snapshot.LifecycleState targetState,
            com.oracle.bmc.waiter.TerminationStrategy terminationStrategy,
            com.oracle.bmc.waiter.DelayStrategy delayStrategy) {
        org.apache.commons.lang3.Validate.notNull(targetState, "The targetState cannot be null");

        return forSnapshot(
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
    public com.oracle.bmc.waiter.Waiter<GetSnapshotRequest, GetSnapshotResponse> forSnapshot(
            GetSnapshotRequest request,
            com.oracle.bmc.waiter.TerminationStrategy terminationStrategy,
            com.oracle.bmc.waiter.DelayStrategy delayStrategy,
            com.oracle.bmc.filestorage.model.Snapshot.LifecycleState... targetStates) {
        org.apache.commons.lang3.Validate.notEmpty(
                targetStates, "At least one target state must be provided");
        org.apache.commons.lang3.Validate.noNullElements(
                targetStates, "Null target states are not permitted");

        return forSnapshot(
                com.oracle.bmc.waiter.Waiters.newWaiter(terminationStrategy, delayStrategy),
                request,
                targetStates);
    }

    // Helper method to create a new Waiter for Snapshot.
    private com.oracle.bmc.waiter.Waiter<GetSnapshotRequest, GetSnapshotResponse> forSnapshot(
            com.oracle.bmc.waiter.BmcGenericWaiter waiter,
            final GetSnapshotRequest request,
            final com.oracle.bmc.filestorage.model.Snapshot.LifecycleState... targetStates) {
        final java.util.Set<com.oracle.bmc.filestorage.model.Snapshot.LifecycleState>
                targetStatesSet = new java.util.HashSet<>(java.util.Arrays.asList(targetStates));

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
                                return targetStatesSet.contains(
                                        response.getSnapshot().getLifecycleState());
                            }
                        },
                        targetStatesSet.contains(
                                com.oracle.bmc.filestorage.model.Snapshot.LifecycleState.Deleted)),
                request);
    }
}
