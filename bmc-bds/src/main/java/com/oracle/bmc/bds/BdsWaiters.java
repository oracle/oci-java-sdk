/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.bds;

import com.oracle.bmc.bds.requests.*;
import com.oracle.bmc.bds.responses.*;

/**
 * Collection of helper methods to produce {@link com.oracle.bmc.waiter.Waiter}s for different
 * resources of Bds.
 * <p>
 * The default configuration used is defined by {@link com.oracle.bmc.waiter.Waiters.Waiters#DEFAULT_POLLING_WAITER}.
 */
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20190531")
public class BdsWaiters {
    private final java.util.concurrent.ExecutorService executorService;
    private final Bds client;

    public BdsWaiters(java.util.concurrent.ExecutorService executorService, Bds client) {
        this.executorService = executorService;
        this.client = client;
    }

    /**
     * Creates a new {@link com.oracle.bmc.waiter.Waiter} using the default configuration.
     *
     * @param request the request to send
     * @param targetStates the desired states to wait for. If multiple states are provided then the waiter will return once the resource reaches any of the provided states
     * @return a new {@code Waiter} instance
     */
    public com.oracle.bmc.waiter.Waiter<
                    GetAutoScalingConfigurationRequest, GetAutoScalingConfigurationResponse>
            forAutoScalingConfiguration(
                    GetAutoScalingConfigurationRequest request,
                    com.oracle.bmc.bds.model.AutoScalingConfiguration.LifecycleState...
                            targetStates) {
        com.oracle.bmc.util.internal.Validate.notEmpty(
                targetStates, "At least one targetState must be provided");
        com.oracle.bmc.util.internal.Validate.noNullElements(
                targetStates, "Null targetState values are not permitted");

        return forAutoScalingConfiguration(
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
    public com.oracle.bmc.waiter.Waiter<
                    GetAutoScalingConfigurationRequest, GetAutoScalingConfigurationResponse>
            forAutoScalingConfiguration(
                    GetAutoScalingConfigurationRequest request,
                    com.oracle.bmc.bds.model.AutoScalingConfiguration.LifecycleState targetState,
                    com.oracle.bmc.waiter.TerminationStrategy terminationStrategy,
                    com.oracle.bmc.waiter.DelayStrategy delayStrategy) {
        com.oracle.bmc.util.internal.Validate.notNull(
                targetState, "The targetState cannot be null");

        return forAutoScalingConfiguration(
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
    public com.oracle.bmc.waiter.Waiter<
                    GetAutoScalingConfigurationRequest, GetAutoScalingConfigurationResponse>
            forAutoScalingConfiguration(
                    GetAutoScalingConfigurationRequest request,
                    com.oracle.bmc.waiter.TerminationStrategy terminationStrategy,
                    com.oracle.bmc.waiter.DelayStrategy delayStrategy,
                    com.oracle.bmc.bds.model.AutoScalingConfiguration.LifecycleState...
                            targetStates) {
        com.oracle.bmc.util.internal.Validate.notEmpty(
                targetStates, "At least one target state must be provided");
        com.oracle.bmc.util.internal.Validate.noNullElements(
                targetStates, "Null target states are not permitted");

        return forAutoScalingConfiguration(
                com.oracle.bmc.waiter.Waiters.newWaiter(terminationStrategy, delayStrategy),
                request,
                targetStates);
    }

    // Helper method to create a new Waiter for AutoScalingConfiguration.
    private com.oracle.bmc.waiter.Waiter<
                    GetAutoScalingConfigurationRequest, GetAutoScalingConfigurationResponse>
            forAutoScalingConfiguration(
                    com.oracle.bmc.waiter.BmcGenericWaiter waiter,
                    final GetAutoScalingConfigurationRequest request,
                    final com.oracle.bmc.bds.model.AutoScalingConfiguration.LifecycleState...
                            targetStates) {
        final java.util.Set<com.oracle.bmc.bds.model.AutoScalingConfiguration.LifecycleState>
                targetStatesSet = new java.util.HashSet<>(java.util.Arrays.asList(targetStates));

        return new com.oracle.bmc.waiter.internal.SimpleWaiterImpl<>(
                executorService,
                waiter.toCallable(
                        () -> request,
                        new java.util.function.Function<
                                GetAutoScalingConfigurationRequest,
                                GetAutoScalingConfigurationResponse>() {
                            @Override
                            public GetAutoScalingConfigurationResponse apply(
                                    GetAutoScalingConfigurationRequest request) {
                                return client.getAutoScalingConfiguration(request);
                            }
                        },
                        new java.util.function.Predicate<GetAutoScalingConfigurationResponse>() {
                            @Override
                            public boolean test(GetAutoScalingConfigurationResponse response) {
                                return targetStatesSet.contains(
                                        response.getAutoScalingConfiguration().getLifecycleState());
                            }
                        },
                        targetStatesSet.contains(
                                com.oracle.bmc.bds.model.AutoScalingConfiguration.LifecycleState
                                        .Deleted)),
                request);
    }

    /**
     * Creates a new {@link com.oracle.bmc.waiter.Waiter} using the default configuration.
     *
     * @param request the request to send
     * @param targetStates the desired states to wait for. If multiple states are provided then the waiter will return once the resource reaches any of the provided states
     * @return a new {@code Waiter} instance
     */
    public com.oracle.bmc.waiter.Waiter<GetBdsApiKeyRequest, GetBdsApiKeyResponse> forBdsApiKey(
            GetBdsApiKeyRequest request,
            com.oracle.bmc.bds.model.BdsApiKey.LifecycleState... targetStates) {
        com.oracle.bmc.util.internal.Validate.notEmpty(
                targetStates, "At least one targetState must be provided");
        com.oracle.bmc.util.internal.Validate.noNullElements(
                targetStates, "Null targetState values are not permitted");

        return forBdsApiKey(
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
    public com.oracle.bmc.waiter.Waiter<GetBdsApiKeyRequest, GetBdsApiKeyResponse> forBdsApiKey(
            GetBdsApiKeyRequest request,
            com.oracle.bmc.bds.model.BdsApiKey.LifecycleState targetState,
            com.oracle.bmc.waiter.TerminationStrategy terminationStrategy,
            com.oracle.bmc.waiter.DelayStrategy delayStrategy) {
        com.oracle.bmc.util.internal.Validate.notNull(
                targetState, "The targetState cannot be null");

        return forBdsApiKey(
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
    public com.oracle.bmc.waiter.Waiter<GetBdsApiKeyRequest, GetBdsApiKeyResponse> forBdsApiKey(
            GetBdsApiKeyRequest request,
            com.oracle.bmc.waiter.TerminationStrategy terminationStrategy,
            com.oracle.bmc.waiter.DelayStrategy delayStrategy,
            com.oracle.bmc.bds.model.BdsApiKey.LifecycleState... targetStates) {
        com.oracle.bmc.util.internal.Validate.notEmpty(
                targetStates, "At least one target state must be provided");
        com.oracle.bmc.util.internal.Validate.noNullElements(
                targetStates, "Null target states are not permitted");

        return forBdsApiKey(
                com.oracle.bmc.waiter.Waiters.newWaiter(terminationStrategy, delayStrategy),
                request,
                targetStates);
    }

    // Helper method to create a new Waiter for BdsApiKey.
    private com.oracle.bmc.waiter.Waiter<GetBdsApiKeyRequest, GetBdsApiKeyResponse> forBdsApiKey(
            com.oracle.bmc.waiter.BmcGenericWaiter waiter,
            final GetBdsApiKeyRequest request,
            final com.oracle.bmc.bds.model.BdsApiKey.LifecycleState... targetStates) {
        final java.util.Set<com.oracle.bmc.bds.model.BdsApiKey.LifecycleState> targetStatesSet =
                new java.util.HashSet<>(java.util.Arrays.asList(targetStates));

        return new com.oracle.bmc.waiter.internal.SimpleWaiterImpl<>(
                executorService,
                waiter.toCallable(
                        () -> request,
                        new java.util.function.Function<
                                GetBdsApiKeyRequest, GetBdsApiKeyResponse>() {
                            @Override
                            public GetBdsApiKeyResponse apply(GetBdsApiKeyRequest request) {
                                return client.getBdsApiKey(request);
                            }
                        },
                        new java.util.function.Predicate<GetBdsApiKeyResponse>() {
                            @Override
                            public boolean test(GetBdsApiKeyResponse response) {
                                return targetStatesSet.contains(
                                        response.getBdsApiKey().getLifecycleState());
                            }
                        },
                        targetStatesSet.contains(
                                com.oracle.bmc.bds.model.BdsApiKey.LifecycleState.Deleted)),
                request);
    }

    /**
     * Creates a new {@link com.oracle.bmc.waiter.Waiter} using the default configuration.
     *
     * @param request the request to send
     * @param targetStates the desired states to wait for. If multiple states are provided then the waiter will return once the resource reaches any of the provided states
     * @return a new {@code Waiter} instance
     */
    public com.oracle.bmc.waiter.Waiter<GetBdsInstanceRequest, GetBdsInstanceResponse>
            forBdsInstance(
                    GetBdsInstanceRequest request,
                    com.oracle.bmc.bds.model.BdsInstance.LifecycleState... targetStates) {
        com.oracle.bmc.util.internal.Validate.notEmpty(
                targetStates, "At least one targetState must be provided");
        com.oracle.bmc.util.internal.Validate.noNullElements(
                targetStates, "Null targetState values are not permitted");

        return forBdsInstance(
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
    public com.oracle.bmc.waiter.Waiter<GetBdsInstanceRequest, GetBdsInstanceResponse>
            forBdsInstance(
                    GetBdsInstanceRequest request,
                    com.oracle.bmc.bds.model.BdsInstance.LifecycleState targetState,
                    com.oracle.bmc.waiter.TerminationStrategy terminationStrategy,
                    com.oracle.bmc.waiter.DelayStrategy delayStrategy) {
        com.oracle.bmc.util.internal.Validate.notNull(
                targetState, "The targetState cannot be null");

        return forBdsInstance(
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
    public com.oracle.bmc.waiter.Waiter<GetBdsInstanceRequest, GetBdsInstanceResponse>
            forBdsInstance(
                    GetBdsInstanceRequest request,
                    com.oracle.bmc.waiter.TerminationStrategy terminationStrategy,
                    com.oracle.bmc.waiter.DelayStrategy delayStrategy,
                    com.oracle.bmc.bds.model.BdsInstance.LifecycleState... targetStates) {
        com.oracle.bmc.util.internal.Validate.notEmpty(
                targetStates, "At least one target state must be provided");
        com.oracle.bmc.util.internal.Validate.noNullElements(
                targetStates, "Null target states are not permitted");

        return forBdsInstance(
                com.oracle.bmc.waiter.Waiters.newWaiter(terminationStrategy, delayStrategy),
                request,
                targetStates);
    }

    // Helper method to create a new Waiter for BdsInstance.
    private com.oracle.bmc.waiter.Waiter<GetBdsInstanceRequest, GetBdsInstanceResponse>
            forBdsInstance(
                    com.oracle.bmc.waiter.BmcGenericWaiter waiter,
                    final GetBdsInstanceRequest request,
                    final com.oracle.bmc.bds.model.BdsInstance.LifecycleState... targetStates) {
        final java.util.Set<com.oracle.bmc.bds.model.BdsInstance.LifecycleState> targetStatesSet =
                new java.util.HashSet<>(java.util.Arrays.asList(targetStates));

        return new com.oracle.bmc.waiter.internal.SimpleWaiterImpl<>(
                executorService,
                waiter.toCallable(
                        () -> request,
                        new java.util.function.Function<
                                GetBdsInstanceRequest, GetBdsInstanceResponse>() {
                            @Override
                            public GetBdsInstanceResponse apply(GetBdsInstanceRequest request) {
                                return client.getBdsInstance(request);
                            }
                        },
                        new java.util.function.Predicate<GetBdsInstanceResponse>() {
                            @Override
                            public boolean test(GetBdsInstanceResponse response) {
                                return targetStatesSet.contains(
                                        response.getBdsInstance().getLifecycleState());
                            }
                        },
                        targetStatesSet.contains(
                                com.oracle.bmc.bds.model.BdsInstance.LifecycleState.Deleted)),
                request);
    }

    /**
     * Creates a new {@link com.oracle.bmc.waiter.Waiter} using the default configuration.
     *
     * @param request the request to send
     * @param targetStates the desired states to wait for. If multiple states are provided then the waiter will return once the resource reaches any of the provided states
     * @return a new {@code Waiter} instance
     */
    public com.oracle.bmc.waiter.Waiter<
                    GetBdsMetastoreConfigurationRequest, GetBdsMetastoreConfigurationResponse>
            forBdsMetastoreConfiguration(
                    GetBdsMetastoreConfigurationRequest request,
                    com.oracle.bmc.bds.model.BdsMetastoreConfiguration.LifecycleState...
                            targetStates) {
        com.oracle.bmc.util.internal.Validate.notEmpty(
                targetStates, "At least one targetState must be provided");
        com.oracle.bmc.util.internal.Validate.noNullElements(
                targetStates, "Null targetState values are not permitted");

        return forBdsMetastoreConfiguration(
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
    public com.oracle.bmc.waiter.Waiter<
                    GetBdsMetastoreConfigurationRequest, GetBdsMetastoreConfigurationResponse>
            forBdsMetastoreConfiguration(
                    GetBdsMetastoreConfigurationRequest request,
                    com.oracle.bmc.bds.model.BdsMetastoreConfiguration.LifecycleState targetState,
                    com.oracle.bmc.waiter.TerminationStrategy terminationStrategy,
                    com.oracle.bmc.waiter.DelayStrategy delayStrategy) {
        com.oracle.bmc.util.internal.Validate.notNull(
                targetState, "The targetState cannot be null");

        return forBdsMetastoreConfiguration(
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
    public com.oracle.bmc.waiter.Waiter<
                    GetBdsMetastoreConfigurationRequest, GetBdsMetastoreConfigurationResponse>
            forBdsMetastoreConfiguration(
                    GetBdsMetastoreConfigurationRequest request,
                    com.oracle.bmc.waiter.TerminationStrategy terminationStrategy,
                    com.oracle.bmc.waiter.DelayStrategy delayStrategy,
                    com.oracle.bmc.bds.model.BdsMetastoreConfiguration.LifecycleState...
                            targetStates) {
        com.oracle.bmc.util.internal.Validate.notEmpty(
                targetStates, "At least one target state must be provided");
        com.oracle.bmc.util.internal.Validate.noNullElements(
                targetStates, "Null target states are not permitted");

        return forBdsMetastoreConfiguration(
                com.oracle.bmc.waiter.Waiters.newWaiter(terminationStrategy, delayStrategy),
                request,
                targetStates);
    }

    // Helper method to create a new Waiter for BdsMetastoreConfiguration.
    private com.oracle.bmc.waiter.Waiter<
                    GetBdsMetastoreConfigurationRequest, GetBdsMetastoreConfigurationResponse>
            forBdsMetastoreConfiguration(
                    com.oracle.bmc.waiter.BmcGenericWaiter waiter,
                    final GetBdsMetastoreConfigurationRequest request,
                    final com.oracle.bmc.bds.model.BdsMetastoreConfiguration.LifecycleState...
                            targetStates) {
        final java.util.Set<com.oracle.bmc.bds.model.BdsMetastoreConfiguration.LifecycleState>
                targetStatesSet = new java.util.HashSet<>(java.util.Arrays.asList(targetStates));

        return new com.oracle.bmc.waiter.internal.SimpleWaiterImpl<>(
                executorService,
                waiter.toCallable(
                        () -> request,
                        new java.util.function.Function<
                                GetBdsMetastoreConfigurationRequest,
                                GetBdsMetastoreConfigurationResponse>() {
                            @Override
                            public GetBdsMetastoreConfigurationResponse apply(
                                    GetBdsMetastoreConfigurationRequest request) {
                                return client.getBdsMetastoreConfiguration(request);
                            }
                        },
                        new java.util.function.Predicate<GetBdsMetastoreConfigurationResponse>() {
                            @Override
                            public boolean test(GetBdsMetastoreConfigurationResponse response) {
                                return targetStatesSet.contains(
                                        response.getBdsMetastoreConfiguration()
                                                .getLifecycleState());
                            }
                        },
                        targetStatesSet.contains(
                                com.oracle.bmc.bds.model.BdsMetastoreConfiguration.LifecycleState
                                        .Deleted)),
                request);
    }

    /**
     * Creates a new {@link com.oracle.bmc.waiter.Waiter} using the default configuration.
     *
     * @param request the request to send
     * @param targetStates the desired states to wait for. If multiple states are provided then the waiter will return once the resource reaches any of the provided states
     * @return a new {@code Waiter} instance
     */
    public com.oracle.bmc.waiter.Waiter<
                    GetIdentityConfigurationRequest, GetIdentityConfigurationResponse>
            forIdentityConfiguration(
                    GetIdentityConfigurationRequest request,
                    com.oracle.bmc.bds.model.IdentityConfiguration.LifecycleState... targetStates) {
        com.oracle.bmc.util.internal.Validate.notEmpty(
                targetStates, "At least one targetState must be provided");
        com.oracle.bmc.util.internal.Validate.noNullElements(
                targetStates, "Null targetState values are not permitted");

        return forIdentityConfiguration(
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
    public com.oracle.bmc.waiter.Waiter<
                    GetIdentityConfigurationRequest, GetIdentityConfigurationResponse>
            forIdentityConfiguration(
                    GetIdentityConfigurationRequest request,
                    com.oracle.bmc.bds.model.IdentityConfiguration.LifecycleState targetState,
                    com.oracle.bmc.waiter.TerminationStrategy terminationStrategy,
                    com.oracle.bmc.waiter.DelayStrategy delayStrategy) {
        com.oracle.bmc.util.internal.Validate.notNull(
                targetState, "The targetState cannot be null");

        return forIdentityConfiguration(
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
    public com.oracle.bmc.waiter.Waiter<
                    GetIdentityConfigurationRequest, GetIdentityConfigurationResponse>
            forIdentityConfiguration(
                    GetIdentityConfigurationRequest request,
                    com.oracle.bmc.waiter.TerminationStrategy terminationStrategy,
                    com.oracle.bmc.waiter.DelayStrategy delayStrategy,
                    com.oracle.bmc.bds.model.IdentityConfiguration.LifecycleState... targetStates) {
        com.oracle.bmc.util.internal.Validate.notEmpty(
                targetStates, "At least one target state must be provided");
        com.oracle.bmc.util.internal.Validate.noNullElements(
                targetStates, "Null target states are not permitted");

        return forIdentityConfiguration(
                com.oracle.bmc.waiter.Waiters.newWaiter(terminationStrategy, delayStrategy),
                request,
                targetStates);
    }

    // Helper method to create a new Waiter for IdentityConfiguration.
    private com.oracle.bmc.waiter.Waiter<
                    GetIdentityConfigurationRequest, GetIdentityConfigurationResponse>
            forIdentityConfiguration(
                    com.oracle.bmc.waiter.BmcGenericWaiter waiter,
                    final GetIdentityConfigurationRequest request,
                    final com.oracle.bmc.bds.model.IdentityConfiguration.LifecycleState...
                            targetStates) {
        final java.util.Set<com.oracle.bmc.bds.model.IdentityConfiguration.LifecycleState>
                targetStatesSet = new java.util.HashSet<>(java.util.Arrays.asList(targetStates));

        return new com.oracle.bmc.waiter.internal.SimpleWaiterImpl<>(
                executorService,
                waiter.toCallable(
                        () -> request,
                        new java.util.function.Function<
                                GetIdentityConfigurationRequest,
                                GetIdentityConfigurationResponse>() {
                            @Override
                            public GetIdentityConfigurationResponse apply(
                                    GetIdentityConfigurationRequest request) {
                                return client.getIdentityConfiguration(request);
                            }
                        },
                        new java.util.function.Predicate<GetIdentityConfigurationResponse>() {
                            @Override
                            public boolean test(GetIdentityConfigurationResponse response) {
                                return targetStatesSet.contains(
                                        response.getIdentityConfiguration().getLifecycleState());
                            }
                        },
                        targetStatesSet.contains(
                                com.oracle.bmc.bds.model.IdentityConfiguration.LifecycleState
                                        .Deleted)),
                request);
    }

    /**
     * Creates a new {@link com.oracle.bmc.waiter.Waiter} using the default configuration.
     *
     * @param request the request to send
     * @param targetStates the desired states to wait for. If multiple states are provided then the waiter will return once the resource reaches any of the provided states
     * @return a new {@code Waiter} instance
     */
    public com.oracle.bmc.waiter.Waiter<GetNodeBackupRequest, GetNodeBackupResponse> forNodeBackup(
            GetNodeBackupRequest request,
            com.oracle.bmc.bds.model.NodeBackup.LifecycleState... targetStates) {
        com.oracle.bmc.util.internal.Validate.notEmpty(
                targetStates, "At least one targetState must be provided");
        com.oracle.bmc.util.internal.Validate.noNullElements(
                targetStates, "Null targetState values are not permitted");

        return forNodeBackup(
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
    public com.oracle.bmc.waiter.Waiter<GetNodeBackupRequest, GetNodeBackupResponse> forNodeBackup(
            GetNodeBackupRequest request,
            com.oracle.bmc.bds.model.NodeBackup.LifecycleState targetState,
            com.oracle.bmc.waiter.TerminationStrategy terminationStrategy,
            com.oracle.bmc.waiter.DelayStrategy delayStrategy) {
        com.oracle.bmc.util.internal.Validate.notNull(
                targetState, "The targetState cannot be null");

        return forNodeBackup(
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
    public com.oracle.bmc.waiter.Waiter<GetNodeBackupRequest, GetNodeBackupResponse> forNodeBackup(
            GetNodeBackupRequest request,
            com.oracle.bmc.waiter.TerminationStrategy terminationStrategy,
            com.oracle.bmc.waiter.DelayStrategy delayStrategy,
            com.oracle.bmc.bds.model.NodeBackup.LifecycleState... targetStates) {
        com.oracle.bmc.util.internal.Validate.notEmpty(
                targetStates, "At least one target state must be provided");
        com.oracle.bmc.util.internal.Validate.noNullElements(
                targetStates, "Null target states are not permitted");

        return forNodeBackup(
                com.oracle.bmc.waiter.Waiters.newWaiter(terminationStrategy, delayStrategy),
                request,
                targetStates);
    }

    // Helper method to create a new Waiter for NodeBackup.
    private com.oracle.bmc.waiter.Waiter<GetNodeBackupRequest, GetNodeBackupResponse> forNodeBackup(
            com.oracle.bmc.waiter.BmcGenericWaiter waiter,
            final GetNodeBackupRequest request,
            final com.oracle.bmc.bds.model.NodeBackup.LifecycleState... targetStates) {
        final java.util.Set<com.oracle.bmc.bds.model.NodeBackup.LifecycleState> targetStatesSet =
                new java.util.HashSet<>(java.util.Arrays.asList(targetStates));

        return new com.oracle.bmc.waiter.internal.SimpleWaiterImpl<>(
                executorService,
                waiter.toCallable(
                        () -> request,
                        new java.util.function.Function<
                                GetNodeBackupRequest, GetNodeBackupResponse>() {
                            @Override
                            public GetNodeBackupResponse apply(GetNodeBackupRequest request) {
                                return client.getNodeBackup(request);
                            }
                        },
                        new java.util.function.Predicate<GetNodeBackupResponse>() {
                            @Override
                            public boolean test(GetNodeBackupResponse response) {
                                return targetStatesSet.contains(
                                        response.getNodeBackup().getLifecycleState());
                            }
                        },
                        targetStatesSet.contains(
                                com.oracle.bmc.bds.model.NodeBackup.LifecycleState.Deleted)),
                request);
    }

    /**
     * Creates a new {@link com.oracle.bmc.waiter.Waiter} using the default configuration.
     *
     * @param request the request to send
     * @param targetStates the desired states to wait for. If multiple states are provided then the waiter will return once the resource reaches any of the provided states
     * @return a new {@code Waiter} instance
     */
    public com.oracle.bmc.waiter.Waiter<
                    GetNodeBackupConfigurationRequest, GetNodeBackupConfigurationResponse>
            forNodeBackupConfiguration(
                    GetNodeBackupConfigurationRequest request,
                    com.oracle.bmc.bds.model.NodeBackupConfiguration.LifecycleState...
                            targetStates) {
        com.oracle.bmc.util.internal.Validate.notEmpty(
                targetStates, "At least one targetState must be provided");
        com.oracle.bmc.util.internal.Validate.noNullElements(
                targetStates, "Null targetState values are not permitted");

        return forNodeBackupConfiguration(
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
    public com.oracle.bmc.waiter.Waiter<
                    GetNodeBackupConfigurationRequest, GetNodeBackupConfigurationResponse>
            forNodeBackupConfiguration(
                    GetNodeBackupConfigurationRequest request,
                    com.oracle.bmc.bds.model.NodeBackupConfiguration.LifecycleState targetState,
                    com.oracle.bmc.waiter.TerminationStrategy terminationStrategy,
                    com.oracle.bmc.waiter.DelayStrategy delayStrategy) {
        com.oracle.bmc.util.internal.Validate.notNull(
                targetState, "The targetState cannot be null");

        return forNodeBackupConfiguration(
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
    public com.oracle.bmc.waiter.Waiter<
                    GetNodeBackupConfigurationRequest, GetNodeBackupConfigurationResponse>
            forNodeBackupConfiguration(
                    GetNodeBackupConfigurationRequest request,
                    com.oracle.bmc.waiter.TerminationStrategy terminationStrategy,
                    com.oracle.bmc.waiter.DelayStrategy delayStrategy,
                    com.oracle.bmc.bds.model.NodeBackupConfiguration.LifecycleState...
                            targetStates) {
        com.oracle.bmc.util.internal.Validate.notEmpty(
                targetStates, "At least one target state must be provided");
        com.oracle.bmc.util.internal.Validate.noNullElements(
                targetStates, "Null target states are not permitted");

        return forNodeBackupConfiguration(
                com.oracle.bmc.waiter.Waiters.newWaiter(terminationStrategy, delayStrategy),
                request,
                targetStates);
    }

    // Helper method to create a new Waiter for NodeBackupConfiguration.
    private com.oracle.bmc.waiter.Waiter<
                    GetNodeBackupConfigurationRequest, GetNodeBackupConfigurationResponse>
            forNodeBackupConfiguration(
                    com.oracle.bmc.waiter.BmcGenericWaiter waiter,
                    final GetNodeBackupConfigurationRequest request,
                    final com.oracle.bmc.bds.model.NodeBackupConfiguration.LifecycleState...
                            targetStates) {
        final java.util.Set<com.oracle.bmc.bds.model.NodeBackupConfiguration.LifecycleState>
                targetStatesSet = new java.util.HashSet<>(java.util.Arrays.asList(targetStates));

        return new com.oracle.bmc.waiter.internal.SimpleWaiterImpl<>(
                executorService,
                waiter.toCallable(
                        () -> request,
                        new java.util.function.Function<
                                GetNodeBackupConfigurationRequest,
                                GetNodeBackupConfigurationResponse>() {
                            @Override
                            public GetNodeBackupConfigurationResponse apply(
                                    GetNodeBackupConfigurationRequest request) {
                                return client.getNodeBackupConfiguration(request);
                            }
                        },
                        new java.util.function.Predicate<GetNodeBackupConfigurationResponse>() {
                            @Override
                            public boolean test(GetNodeBackupConfigurationResponse response) {
                                return targetStatesSet.contains(
                                        response.getNodeBackupConfiguration().getLifecycleState());
                            }
                        },
                        targetStatesSet.contains(
                                com.oracle.bmc.bds.model.NodeBackupConfiguration.LifecycleState
                                        .Deleted)),
                request);
    }

    /**
     * Creates a new {@link com.oracle.bmc.waiter.Waiter} using the default configuration.
     *
     * @param request the request to send
     * @param targetStates the desired states to wait for. If multiple states are provided then the waiter will return once the resource reaches any of the provided states
     * @return a new {@code Waiter} instance
     */
    public com.oracle.bmc.waiter.Waiter<
                    GetNodeReplaceConfigurationRequest, GetNodeReplaceConfigurationResponse>
            forNodeReplaceConfiguration(
                    GetNodeReplaceConfigurationRequest request,
                    com.oracle.bmc.bds.model.NodeReplaceConfiguration.LifecycleState...
                            targetStates) {
        com.oracle.bmc.util.internal.Validate.notEmpty(
                targetStates, "At least one targetState must be provided");
        com.oracle.bmc.util.internal.Validate.noNullElements(
                targetStates, "Null targetState values are not permitted");

        return forNodeReplaceConfiguration(
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
    public com.oracle.bmc.waiter.Waiter<
                    GetNodeReplaceConfigurationRequest, GetNodeReplaceConfigurationResponse>
            forNodeReplaceConfiguration(
                    GetNodeReplaceConfigurationRequest request,
                    com.oracle.bmc.bds.model.NodeReplaceConfiguration.LifecycleState targetState,
                    com.oracle.bmc.waiter.TerminationStrategy terminationStrategy,
                    com.oracle.bmc.waiter.DelayStrategy delayStrategy) {
        com.oracle.bmc.util.internal.Validate.notNull(
                targetState, "The targetState cannot be null");

        return forNodeReplaceConfiguration(
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
    public com.oracle.bmc.waiter.Waiter<
                    GetNodeReplaceConfigurationRequest, GetNodeReplaceConfigurationResponse>
            forNodeReplaceConfiguration(
                    GetNodeReplaceConfigurationRequest request,
                    com.oracle.bmc.waiter.TerminationStrategy terminationStrategy,
                    com.oracle.bmc.waiter.DelayStrategy delayStrategy,
                    com.oracle.bmc.bds.model.NodeReplaceConfiguration.LifecycleState...
                            targetStates) {
        com.oracle.bmc.util.internal.Validate.notEmpty(
                targetStates, "At least one target state must be provided");
        com.oracle.bmc.util.internal.Validate.noNullElements(
                targetStates, "Null target states are not permitted");

        return forNodeReplaceConfiguration(
                com.oracle.bmc.waiter.Waiters.newWaiter(terminationStrategy, delayStrategy),
                request,
                targetStates);
    }

    // Helper method to create a new Waiter for NodeReplaceConfiguration.
    private com.oracle.bmc.waiter.Waiter<
                    GetNodeReplaceConfigurationRequest, GetNodeReplaceConfigurationResponse>
            forNodeReplaceConfiguration(
                    com.oracle.bmc.waiter.BmcGenericWaiter waiter,
                    final GetNodeReplaceConfigurationRequest request,
                    final com.oracle.bmc.bds.model.NodeReplaceConfiguration.LifecycleState...
                            targetStates) {
        final java.util.Set<com.oracle.bmc.bds.model.NodeReplaceConfiguration.LifecycleState>
                targetStatesSet = new java.util.HashSet<>(java.util.Arrays.asList(targetStates));

        return new com.oracle.bmc.waiter.internal.SimpleWaiterImpl<>(
                executorService,
                waiter.toCallable(
                        () -> request,
                        new java.util.function.Function<
                                GetNodeReplaceConfigurationRequest,
                                GetNodeReplaceConfigurationResponse>() {
                            @Override
                            public GetNodeReplaceConfigurationResponse apply(
                                    GetNodeReplaceConfigurationRequest request) {
                                return client.getNodeReplaceConfiguration(request);
                            }
                        },
                        new java.util.function.Predicate<GetNodeReplaceConfigurationResponse>() {
                            @Override
                            public boolean test(GetNodeReplaceConfigurationResponse response) {
                                return targetStatesSet.contains(
                                        response.getNodeReplaceConfiguration().getLifecycleState());
                            }
                        },
                        targetStatesSet.contains(
                                com.oracle.bmc.bds.model.NodeReplaceConfiguration.LifecycleState
                                        .Deleted)),
                request);
    }

    /**
     * Creates a new {@link com.oracle.bmc.waiter.Waiter} using the default configuration.
     *
     * @param request the request to send
     * @param targetStates the desired states to wait for. If multiple states are provided then the waiter will return once the resource reaches any of the provided states
     * @return a new {@code Waiter} instance
     */
    public com.oracle.bmc.waiter.Waiter<
                    GetResourcePrincipalConfigurationRequest,
                    GetResourcePrincipalConfigurationResponse>
            forResourcePrincipalConfiguration(
                    GetResourcePrincipalConfigurationRequest request,
                    com.oracle.bmc.bds.model.ResourcePrincipalConfiguration.LifecycleState...
                            targetStates) {
        com.oracle.bmc.util.internal.Validate.notEmpty(
                targetStates, "At least one targetState must be provided");
        com.oracle.bmc.util.internal.Validate.noNullElements(
                targetStates, "Null targetState values are not permitted");

        return forResourcePrincipalConfiguration(
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
    public com.oracle.bmc.waiter.Waiter<
                    GetResourcePrincipalConfigurationRequest,
                    GetResourcePrincipalConfigurationResponse>
            forResourcePrincipalConfiguration(
                    GetResourcePrincipalConfigurationRequest request,
                    com.oracle.bmc.bds.model.ResourcePrincipalConfiguration.LifecycleState
                            targetState,
                    com.oracle.bmc.waiter.TerminationStrategy terminationStrategy,
                    com.oracle.bmc.waiter.DelayStrategy delayStrategy) {
        com.oracle.bmc.util.internal.Validate.notNull(
                targetState, "The targetState cannot be null");

        return forResourcePrincipalConfiguration(
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
    public com.oracle.bmc.waiter.Waiter<
                    GetResourcePrincipalConfigurationRequest,
                    GetResourcePrincipalConfigurationResponse>
            forResourcePrincipalConfiguration(
                    GetResourcePrincipalConfigurationRequest request,
                    com.oracle.bmc.waiter.TerminationStrategy terminationStrategy,
                    com.oracle.bmc.waiter.DelayStrategy delayStrategy,
                    com.oracle.bmc.bds.model.ResourcePrincipalConfiguration.LifecycleState...
                            targetStates) {
        com.oracle.bmc.util.internal.Validate.notEmpty(
                targetStates, "At least one target state must be provided");
        com.oracle.bmc.util.internal.Validate.noNullElements(
                targetStates, "Null target states are not permitted");

        return forResourcePrincipalConfiguration(
                com.oracle.bmc.waiter.Waiters.newWaiter(terminationStrategy, delayStrategy),
                request,
                targetStates);
    }

    // Helper method to create a new Waiter for ResourcePrincipalConfiguration.
    private com.oracle.bmc.waiter.Waiter<
                    GetResourcePrincipalConfigurationRequest,
                    GetResourcePrincipalConfigurationResponse>
            forResourcePrincipalConfiguration(
                    com.oracle.bmc.waiter.BmcGenericWaiter waiter,
                    final GetResourcePrincipalConfigurationRequest request,
                    final com.oracle.bmc.bds.model.ResourcePrincipalConfiguration.LifecycleState...
                            targetStates) {
        final java.util.Set<com.oracle.bmc.bds.model.ResourcePrincipalConfiguration.LifecycleState>
                targetStatesSet = new java.util.HashSet<>(java.util.Arrays.asList(targetStates));

        return new com.oracle.bmc.waiter.internal.SimpleWaiterImpl<>(
                executorService,
                waiter.toCallable(
                        () -> request,
                        new java.util.function.Function<
                                GetResourcePrincipalConfigurationRequest,
                                GetResourcePrincipalConfigurationResponse>() {
                            @Override
                            public GetResourcePrincipalConfigurationResponse apply(
                                    GetResourcePrincipalConfigurationRequest request) {
                                return client.getResourcePrincipalConfiguration(request);
                            }
                        },
                        new java.util.function.Predicate<
                                GetResourcePrincipalConfigurationResponse>() {
                            @Override
                            public boolean test(
                                    GetResourcePrincipalConfigurationResponse response) {
                                return targetStatesSet.contains(
                                        response.getResourcePrincipalConfiguration()
                                                .getLifecycleState());
                            }
                        },
                        targetStatesSet.contains(
                                com.oracle.bmc.bds.model.ResourcePrincipalConfiguration
                                        .LifecycleState.Deleted)),
                request);
    }

    /**
     * Creates a new {@link com.oracle.bmc.waiter.Waiter} using default configuration.
     *
     * @param request the request to send
     * @return a new {@code Waiter} instance
     */
    public com.oracle.bmc.waiter.Waiter<GetWorkRequestRequest, GetWorkRequestResponse>
            forWorkRequest(GetWorkRequestRequest request) {
        return forWorkRequest(com.oracle.bmc.waiter.Waiters.DEFAULT_POLLING_WAITER, request);
    }

    /**
     * Creates a new {@link com.oracle.bmc.waiter.Waiter} using the provided configuration.
     *
     * @param request the request to send
     * @param terminationStrategy the {@link com.oracle.bmc.waiter.TerminationStrategy} to use
     * @param delayStrategy the {@linkcom.oracle.bmc.waiter. DelayStrategy} to use
     * @return a new {@code com.oracle.bmc.waiter.Waiter} instance
     */
    public com.oracle.bmc.waiter.Waiter<GetWorkRequestRequest, GetWorkRequestResponse>
            forWorkRequest(
                    GetWorkRequestRequest request,
                    com.oracle.bmc.waiter.TerminationStrategy terminationStrategy,
                    com.oracle.bmc.waiter.DelayStrategy delayStrategy) {
        return forWorkRequest(
                com.oracle.bmc.waiter.Waiters.newWaiter(terminationStrategy, delayStrategy),
                request);
    }

    // Helper method to create a new Waiter for WorkRequest.
    private com.oracle.bmc.waiter.Waiter<GetWorkRequestRequest, GetWorkRequestResponse>
            forWorkRequest(
                    com.oracle.bmc.waiter.BmcGenericWaiter waiter,
                    final GetWorkRequestRequest request) {
        return new com.oracle.bmc.waiter.internal.SimpleWaiterImpl<>(
                executorService,
                waiter.toCallable(
                        () -> request,
                        new java.util.function.Function<
                                GetWorkRequestRequest, GetWorkRequestResponse>() {
                            @Override
                            public GetWorkRequestResponse apply(GetWorkRequestRequest request) {
                                return client.getWorkRequest(request);
                            }
                        },
                        new java.util.function.Predicate<GetWorkRequestResponse>() {
                            @Override
                            public boolean test(GetWorkRequestResponse response) {
                                // work requests are complete once the time finished is available
                                return response.getWorkRequest().getTimeFinished() != null;
                            }
                        },
                        false),
                request);
    }
}
