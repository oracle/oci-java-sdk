/**
 * Copyright (c) 2016, 2018, Oracle and/or its affiliates. All rights reserved.
 */
package com.oracle.bmc.database;

import com.oracle.bmc.database.requests.*;
import com.oracle.bmc.database.responses.*;

/**
 * Collection of helper methods to produce {@link Waiter}s for different
 * resources of Database.
 * <p>
 * The default configuration used is defined by {@link Waiters#DEFAULT_POLLING_WAITER}.
 */
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20160918")
@lombok.RequiredArgsConstructor
public class DatabaseWaiters {
    private final java.util.concurrent.ExecutorService executorService;
    private final Database client;

    /**
     * Creates a new {@link Waiter} using default configuration.
     *
     * @param request the request to send
     * @param targetState the desired state to wait for
     * @return a new {@code Waiter} instance
     */
    public com.oracle.bmc.waiter.Waiter<GetBackupRequest, GetBackupResponse> forBackup(
            GetBackupRequest request,
            com.oracle.bmc.database.model.Backup.LifecycleState targetState) {
        return forBackup(
                com.oracle.bmc.waiter.Waiters.DEFAULT_POLLING_WAITER, request, targetState);
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
    public com.oracle.bmc.waiter.Waiter<GetBackupRequest, GetBackupResponse> forBackup(
            GetBackupRequest request,
            com.oracle.bmc.database.model.Backup.LifecycleState targetState,
            com.oracle.bmc.waiter.TerminationStrategy terminationStrategy,
            com.oracle.bmc.waiter.DelayStrategy delayStrategy) {
        return forBackup(
                com.oracle.bmc.waiter.Waiters.newWaiter(terminationStrategy, delayStrategy),
                request,
                targetState);
    }

    // Helper method to create a new Waiter for Backup.
    private com.oracle.bmc.waiter.Waiter<GetBackupRequest, GetBackupResponse> forBackup(
            com.oracle.bmc.waiter.BmcGenericWaiter waiter,
            final GetBackupRequest request,
            final com.oracle.bmc.database.model.Backup.LifecycleState targetState) {
        return new com.oracle.bmc.waiter.internal.SimpleWaiterImpl<>(
                executorService,
                waiter.toCallable(
                        com.google.common.base.Suppliers.ofInstance(request),
                        new com.google.common.base.Function<GetBackupRequest, GetBackupResponse>() {
                            @Override
                            public GetBackupResponse apply(GetBackupRequest request) {
                                return client.getBackup(request);
                            }
                        },
                        new com.google.common.base.Predicate<GetBackupResponse>() {
                            @Override
                            public boolean apply(GetBackupResponse response) {
                                return response.getBackup().getLifecycleState() == targetState;
                            }
                        },
                        targetState == com.oracle.bmc.database.model.Backup.LifecycleState.Deleted),
                request);
    }

    /**
     * Creates a new {@link Waiter} using default configuration.
     *
     * @param request the request to send
     * @param targetState the desired state to wait for
     * @return a new {@code Waiter} instance
     */
    public com.oracle.bmc.waiter.Waiter<
                    GetDataGuardAssociationRequest, GetDataGuardAssociationResponse>
            forDataGuardAssociation(
                    GetDataGuardAssociationRequest request,
                    com.oracle.bmc.database.model.DataGuardAssociation.LifecycleState targetState) {
        return forDataGuardAssociation(
                com.oracle.bmc.waiter.Waiters.DEFAULT_POLLING_WAITER, request, targetState);
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
                    GetDataGuardAssociationRequest, GetDataGuardAssociationResponse>
            forDataGuardAssociation(
                    GetDataGuardAssociationRequest request,
                    com.oracle.bmc.database.model.DataGuardAssociation.LifecycleState targetState,
                    com.oracle.bmc.waiter.TerminationStrategy terminationStrategy,
                    com.oracle.bmc.waiter.DelayStrategy delayStrategy) {
        return forDataGuardAssociation(
                com.oracle.bmc.waiter.Waiters.newWaiter(terminationStrategy, delayStrategy),
                request,
                targetState);
    }

    // Helper method to create a new Waiter for DataGuardAssociation.
    private com.oracle.bmc.waiter.Waiter<
                    GetDataGuardAssociationRequest, GetDataGuardAssociationResponse>
            forDataGuardAssociation(
                    com.oracle.bmc.waiter.BmcGenericWaiter waiter,
                    final GetDataGuardAssociationRequest request,
                    final com.oracle.bmc.database.model.DataGuardAssociation.LifecycleState
                            targetState) {
        return new com.oracle.bmc.waiter.internal.SimpleWaiterImpl<>(
                executorService,
                waiter.toCallable(
                        com.google.common.base.Suppliers.ofInstance(request),
                        new com.google.common.base.Function<
                                GetDataGuardAssociationRequest, GetDataGuardAssociationResponse>() {
                            @Override
                            public GetDataGuardAssociationResponse apply(
                                    GetDataGuardAssociationRequest request) {
                                return client.getDataGuardAssociation(request);
                            }
                        },
                        new com.google.common.base.Predicate<GetDataGuardAssociationResponse>() {
                            @Override
                            public boolean apply(GetDataGuardAssociationResponse response) {
                                return response.getDataGuardAssociation().getLifecycleState()
                                        == targetState;
                            }
                        },
                        targetState
                                == com.oracle.bmc.database.model.DataGuardAssociation.LifecycleState
                                        .Terminated),
                request);
    }

    /**
     * Creates a new {@link Waiter} using default configuration.
     *
     * @param request the request to send
     * @param targetState the desired state to wait for
     * @return a new {@code Waiter} instance
     */
    public com.oracle.bmc.waiter.Waiter<GetDatabaseRequest, GetDatabaseResponse> forDatabase(
            GetDatabaseRequest request,
            com.oracle.bmc.database.model.Database.LifecycleState targetState) {
        return forDatabase(
                com.oracle.bmc.waiter.Waiters.DEFAULT_POLLING_WAITER, request, targetState);
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
    public com.oracle.bmc.waiter.Waiter<GetDatabaseRequest, GetDatabaseResponse> forDatabase(
            GetDatabaseRequest request,
            com.oracle.bmc.database.model.Database.LifecycleState targetState,
            com.oracle.bmc.waiter.TerminationStrategy terminationStrategy,
            com.oracle.bmc.waiter.DelayStrategy delayStrategy) {
        return forDatabase(
                com.oracle.bmc.waiter.Waiters.newWaiter(terminationStrategy, delayStrategy),
                request,
                targetState);
    }

    // Helper method to create a new Waiter for Database.
    private com.oracle.bmc.waiter.Waiter<GetDatabaseRequest, GetDatabaseResponse> forDatabase(
            com.oracle.bmc.waiter.BmcGenericWaiter waiter,
            final GetDatabaseRequest request,
            final com.oracle.bmc.database.model.Database.LifecycleState targetState) {
        return new com.oracle.bmc.waiter.internal.SimpleWaiterImpl<>(
                executorService,
                waiter.toCallable(
                        com.google.common.base.Suppliers.ofInstance(request),
                        new com.google.common.base.Function<
                                GetDatabaseRequest, GetDatabaseResponse>() {
                            @Override
                            public GetDatabaseResponse apply(GetDatabaseRequest request) {
                                return client.getDatabase(request);
                            }
                        },
                        new com.google.common.base.Predicate<GetDatabaseResponse>() {
                            @Override
                            public boolean apply(GetDatabaseResponse response) {
                                return response.getDatabase().getLifecycleState() == targetState;
                            }
                        },
                        targetState
                                == com.oracle.bmc.database.model.Database.LifecycleState
                                        .Terminated),
                request);
    }

    /**
     * Creates a new {@link Waiter} using default configuration.
     *
     * @param request the request to send
     * @param targetState the desired state to wait for
     * @return a new {@code Waiter} instance
     */
    public com.oracle.bmc.waiter.Waiter<GetDbHomeRequest, GetDbHomeResponse> forDbHome(
            GetDbHomeRequest request,
            com.oracle.bmc.database.model.DbHome.LifecycleState targetState) {
        return forDbHome(
                com.oracle.bmc.waiter.Waiters.DEFAULT_POLLING_WAITER, request, targetState);
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
    public com.oracle.bmc.waiter.Waiter<GetDbHomeRequest, GetDbHomeResponse> forDbHome(
            GetDbHomeRequest request,
            com.oracle.bmc.database.model.DbHome.LifecycleState targetState,
            com.oracle.bmc.waiter.TerminationStrategy terminationStrategy,
            com.oracle.bmc.waiter.DelayStrategy delayStrategy) {
        return forDbHome(
                com.oracle.bmc.waiter.Waiters.newWaiter(terminationStrategy, delayStrategy),
                request,
                targetState);
    }

    // Helper method to create a new Waiter for DbHome.
    private com.oracle.bmc.waiter.Waiter<GetDbHomeRequest, GetDbHomeResponse> forDbHome(
            com.oracle.bmc.waiter.BmcGenericWaiter waiter,
            final GetDbHomeRequest request,
            final com.oracle.bmc.database.model.DbHome.LifecycleState targetState) {
        return new com.oracle.bmc.waiter.internal.SimpleWaiterImpl<>(
                executorService,
                waiter.toCallable(
                        com.google.common.base.Suppliers.ofInstance(request),
                        new com.google.common.base.Function<GetDbHomeRequest, GetDbHomeResponse>() {
                            @Override
                            public GetDbHomeResponse apply(GetDbHomeRequest request) {
                                return client.getDbHome(request);
                            }
                        },
                        new com.google.common.base.Predicate<GetDbHomeResponse>() {
                            @Override
                            public boolean apply(GetDbHomeResponse response) {
                                return response.getDbHome().getLifecycleState() == targetState;
                            }
                        },
                        targetState
                                == com.oracle.bmc.database.model.DbHome.LifecycleState.Terminated),
                request);
    }

    /**
     * Creates a new {@link Waiter} using default configuration.
     *
     * @param request the request to send
     * @param targetState the desired state to wait for
     * @return a new {@code Waiter} instance
     */
    public com.oracle.bmc.waiter.Waiter<GetDbNodeRequest, GetDbNodeResponse> forDbNode(
            GetDbNodeRequest request,
            com.oracle.bmc.database.model.DbNode.LifecycleState targetState) {
        return forDbNode(
                com.oracle.bmc.waiter.Waiters.DEFAULT_POLLING_WAITER, request, targetState);
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
    public com.oracle.bmc.waiter.Waiter<GetDbNodeRequest, GetDbNodeResponse> forDbNode(
            GetDbNodeRequest request,
            com.oracle.bmc.database.model.DbNode.LifecycleState targetState,
            com.oracle.bmc.waiter.TerminationStrategy terminationStrategy,
            com.oracle.bmc.waiter.DelayStrategy delayStrategy) {
        return forDbNode(
                com.oracle.bmc.waiter.Waiters.newWaiter(terminationStrategy, delayStrategy),
                request,
                targetState);
    }

    // Helper method to create a new Waiter for DbNode.
    private com.oracle.bmc.waiter.Waiter<GetDbNodeRequest, GetDbNodeResponse> forDbNode(
            com.oracle.bmc.waiter.BmcGenericWaiter waiter,
            final GetDbNodeRequest request,
            final com.oracle.bmc.database.model.DbNode.LifecycleState targetState) {
        return new com.oracle.bmc.waiter.internal.SimpleWaiterImpl<>(
                executorService,
                waiter.toCallable(
                        com.google.common.base.Suppliers.ofInstance(request),
                        new com.google.common.base.Function<GetDbNodeRequest, GetDbNodeResponse>() {
                            @Override
                            public GetDbNodeResponse apply(GetDbNodeRequest request) {
                                return client.getDbNode(request);
                            }
                        },
                        new com.google.common.base.Predicate<GetDbNodeResponse>() {
                            @Override
                            public boolean apply(GetDbNodeResponse response) {
                                return response.getDbNode().getLifecycleState() == targetState;
                            }
                        },
                        targetState
                                == com.oracle.bmc.database.model.DbNode.LifecycleState.Terminated),
                request);
    }

    /**
     * Creates a new {@link Waiter} using default configuration.
     *
     * @param request the request to send
     * @param targetState the desired state to wait for
     * @return a new {@code Waiter} instance
     */
    public com.oracle.bmc.waiter.Waiter<GetDbSystemRequest, GetDbSystemResponse> forDbSystem(
            GetDbSystemRequest request,
            com.oracle.bmc.database.model.DbSystem.LifecycleState targetState) {
        return forDbSystem(
                com.oracle.bmc.waiter.Waiters.DEFAULT_POLLING_WAITER, request, targetState);
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
    public com.oracle.bmc.waiter.Waiter<GetDbSystemRequest, GetDbSystemResponse> forDbSystem(
            GetDbSystemRequest request,
            com.oracle.bmc.database.model.DbSystem.LifecycleState targetState,
            com.oracle.bmc.waiter.TerminationStrategy terminationStrategy,
            com.oracle.bmc.waiter.DelayStrategy delayStrategy) {
        return forDbSystem(
                com.oracle.bmc.waiter.Waiters.newWaiter(terminationStrategy, delayStrategy),
                request,
                targetState);
    }

    // Helper method to create a new Waiter for DbSystem.
    private com.oracle.bmc.waiter.Waiter<GetDbSystemRequest, GetDbSystemResponse> forDbSystem(
            com.oracle.bmc.waiter.BmcGenericWaiter waiter,
            final GetDbSystemRequest request,
            final com.oracle.bmc.database.model.DbSystem.LifecycleState targetState) {
        return new com.oracle.bmc.waiter.internal.SimpleWaiterImpl<>(
                executorService,
                waiter.toCallable(
                        com.google.common.base.Suppliers.ofInstance(request),
                        new com.google.common.base.Function<
                                GetDbSystemRequest, GetDbSystemResponse>() {
                            @Override
                            public GetDbSystemResponse apply(GetDbSystemRequest request) {
                                return client.getDbSystem(request);
                            }
                        },
                        new com.google.common.base.Predicate<GetDbSystemResponse>() {
                            @Override
                            public boolean apply(GetDbSystemResponse response) {
                                return response.getDbSystem().getLifecycleState() == targetState;
                            }
                        },
                        targetState
                                == com.oracle.bmc.database.model.DbSystem.LifecycleState
                                        .Terminated),
                request);
    }
}
