/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.artifacts;

import com.oracle.bmc.artifacts.requests.*;
import com.oracle.bmc.artifacts.responses.*;

/**
 * Collection of helper methods to produce {@link com.oracle.bmc.waiter.Waiter}s for different
 * resources of Artifacts.
 *
 * <p>The default configuration used is defined by {@link
 * com.oracle.bmc.waiter.Waiters.Waiters#DEFAULT_POLLING_WAITER}.
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20160918")
public class ArtifactsWaiters {
    private final java.util.concurrent.ExecutorService executorService;
    private final Artifacts client;

    public ArtifactsWaiters(
            java.util.concurrent.ExecutorService executorService, Artifacts client) {
        this.executorService = executorService;
        this.client = client;
    }

    /**
     * Creates a new {@link com.oracle.bmc.waiter.Waiter} using the default configuration.
     *
     * @param request the request to send
     * @param targetStates the desired states to wait for. If multiple states are provided then the
     *     waiter will return once the resource reaches any of the provided states
     * @return a new {@code Waiter} instance
     */
    public com.oracle.bmc.waiter.Waiter<GetContainerImageRequest, GetContainerImageResponse>
            forContainerImage(
                    GetContainerImageRequest request,
                    com.oracle.bmc.artifacts.model.ContainerImage.LifecycleState... targetStates) {
        com.oracle.bmc.util.internal.Validate.notEmpty(
                targetStates, "At least one targetState must be provided");
        com.oracle.bmc.util.internal.Validate.noNullElements(
                targetStates, "Null targetState values are not permitted");

        return forContainerImage(
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
    public com.oracle.bmc.waiter.Waiter<GetContainerImageRequest, GetContainerImageResponse>
            forContainerImage(
                    GetContainerImageRequest request,
                    com.oracle.bmc.artifacts.model.ContainerImage.LifecycleState targetState,
                    com.oracle.bmc.waiter.TerminationStrategy terminationStrategy,
                    com.oracle.bmc.waiter.DelayStrategy delayStrategy) {
        com.oracle.bmc.util.internal.Validate.notNull(
                targetState, "The targetState cannot be null");

        return forContainerImage(
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
     * @param targetStates the desired states to wait for. The waiter will return once the resource
     *     reaches any of the provided states
     * @return a new {@code com.oracle.bmc.waiter.Waiter} instance
     */
    public com.oracle.bmc.waiter.Waiter<GetContainerImageRequest, GetContainerImageResponse>
            forContainerImage(
                    GetContainerImageRequest request,
                    com.oracle.bmc.waiter.TerminationStrategy terminationStrategy,
                    com.oracle.bmc.waiter.DelayStrategy delayStrategy,
                    com.oracle.bmc.artifacts.model.ContainerImage.LifecycleState... targetStates) {
        com.oracle.bmc.util.internal.Validate.notEmpty(
                targetStates, "At least one target state must be provided");
        com.oracle.bmc.util.internal.Validate.noNullElements(
                targetStates, "Null target states are not permitted");

        return forContainerImage(
                com.oracle.bmc.waiter.Waiters.newWaiter(terminationStrategy, delayStrategy),
                request,
                targetStates);
    }

    // Helper method to create a new Waiter for ContainerImage.
    private com.oracle.bmc.waiter.Waiter<GetContainerImageRequest, GetContainerImageResponse>
            forContainerImage(
                    com.oracle.bmc.waiter.BmcGenericWaiter waiter,
                    final GetContainerImageRequest request,
                    final com.oracle.bmc.artifacts.model.ContainerImage.LifecycleState...
                            targetStates) {
        final java.util.Set<com.oracle.bmc.artifacts.model.ContainerImage.LifecycleState>
                targetStatesSet = new java.util.HashSet<>(java.util.Arrays.asList(targetStates));

        return new com.oracle.bmc.waiter.internal.SimpleWaiterImpl<>(
                executorService,
                waiter.toCallable(
                        () -> request,
                        new java.util.function.Function<
                                GetContainerImageRequest, GetContainerImageResponse>() {
                            @Override
                            public GetContainerImageResponse apply(
                                    GetContainerImageRequest request) {
                                return client.getContainerImage(request);
                            }
                        },
                        new java.util.function.Predicate<GetContainerImageResponse>() {
                            @Override
                            public boolean test(GetContainerImageResponse response) {
                                return targetStatesSet.contains(
                                        response.getContainerImage().getLifecycleState());
                            }
                        },
                        targetStatesSet.contains(
                                com.oracle.bmc.artifacts.model.ContainerImage.LifecycleState
                                        .Deleted)),
                request);
    }

    /**
     * Creates a new {@link com.oracle.bmc.waiter.Waiter} using the default configuration.
     *
     * @param request the request to send
     * @param targetStates the desired states to wait for. If multiple states are provided then the
     *     waiter will return once the resource reaches any of the provided states
     * @return a new {@code Waiter} instance
     */
    public com.oracle.bmc.waiter.Waiter<
                    GetContainerImageSignatureRequest, GetContainerImageSignatureResponse>
            forContainerImageSignature(
                    GetContainerImageSignatureRequest request,
                    com.oracle.bmc.artifacts.model.ContainerImageSignature.LifecycleState...
                            targetStates) {
        com.oracle.bmc.util.internal.Validate.notEmpty(
                targetStates, "At least one targetState must be provided");
        com.oracle.bmc.util.internal.Validate.noNullElements(
                targetStates, "Null targetState values are not permitted");

        return forContainerImageSignature(
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
                    GetContainerImageSignatureRequest, GetContainerImageSignatureResponse>
            forContainerImageSignature(
                    GetContainerImageSignatureRequest request,
                    com.oracle.bmc.artifacts.model.ContainerImageSignature.LifecycleState
                            targetState,
                    com.oracle.bmc.waiter.TerminationStrategy terminationStrategy,
                    com.oracle.bmc.waiter.DelayStrategy delayStrategy) {
        com.oracle.bmc.util.internal.Validate.notNull(
                targetState, "The targetState cannot be null");

        return forContainerImageSignature(
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
     * @param targetStates the desired states to wait for. The waiter will return once the resource
     *     reaches any of the provided states
     * @return a new {@code com.oracle.bmc.waiter.Waiter} instance
     */
    public com.oracle.bmc.waiter.Waiter<
                    GetContainerImageSignatureRequest, GetContainerImageSignatureResponse>
            forContainerImageSignature(
                    GetContainerImageSignatureRequest request,
                    com.oracle.bmc.waiter.TerminationStrategy terminationStrategy,
                    com.oracle.bmc.waiter.DelayStrategy delayStrategy,
                    com.oracle.bmc.artifacts.model.ContainerImageSignature.LifecycleState...
                            targetStates) {
        com.oracle.bmc.util.internal.Validate.notEmpty(
                targetStates, "At least one target state must be provided");
        com.oracle.bmc.util.internal.Validate.noNullElements(
                targetStates, "Null target states are not permitted");

        return forContainerImageSignature(
                com.oracle.bmc.waiter.Waiters.newWaiter(terminationStrategy, delayStrategy),
                request,
                targetStates);
    }

    // Helper method to create a new Waiter for ContainerImageSignature.
    private com.oracle.bmc.waiter.Waiter<
                    GetContainerImageSignatureRequest, GetContainerImageSignatureResponse>
            forContainerImageSignature(
                    com.oracle.bmc.waiter.BmcGenericWaiter waiter,
                    final GetContainerImageSignatureRequest request,
                    final com.oracle.bmc.artifacts.model.ContainerImageSignature.LifecycleState...
                            targetStates) {
        final java.util.Set<com.oracle.bmc.artifacts.model.ContainerImageSignature.LifecycleState>
                targetStatesSet = new java.util.HashSet<>(java.util.Arrays.asList(targetStates));

        return new com.oracle.bmc.waiter.internal.SimpleWaiterImpl<>(
                executorService,
                waiter.toCallable(
                        () -> request,
                        new java.util.function.Function<
                                GetContainerImageSignatureRequest,
                                GetContainerImageSignatureResponse>() {
                            @Override
                            public GetContainerImageSignatureResponse apply(
                                    GetContainerImageSignatureRequest request) {
                                return client.getContainerImageSignature(request);
                            }
                        },
                        new java.util.function.Predicate<GetContainerImageSignatureResponse>() {
                            @Override
                            public boolean test(GetContainerImageSignatureResponse response) {
                                return targetStatesSet.contains(
                                        response.getContainerImageSignature().getLifecycleState());
                            }
                        },
                        targetStatesSet.contains(
                                com.oracle.bmc.artifacts.model.ContainerImageSignature
                                        .LifecycleState.Deleted)),
                request);
    }

    /**
     * Creates a new {@link com.oracle.bmc.waiter.Waiter} using the default configuration.
     *
     * @param request the request to send
     * @param targetStates the desired states to wait for. If multiple states are provided then the
     *     waiter will return once the resource reaches any of the provided states
     * @return a new {@code Waiter} instance
     */
    public com.oracle.bmc.waiter.Waiter<
                    GetContainerRepositoryRequest, GetContainerRepositoryResponse>
            forContainerRepository(
                    GetContainerRepositoryRequest request,
                    com.oracle.bmc.artifacts.model.ContainerRepository.LifecycleState...
                            targetStates) {
        com.oracle.bmc.util.internal.Validate.notEmpty(
                targetStates, "At least one targetState must be provided");
        com.oracle.bmc.util.internal.Validate.noNullElements(
                targetStates, "Null targetState values are not permitted");

        return forContainerRepository(
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
                    GetContainerRepositoryRequest, GetContainerRepositoryResponse>
            forContainerRepository(
                    GetContainerRepositoryRequest request,
                    com.oracle.bmc.artifacts.model.ContainerRepository.LifecycleState targetState,
                    com.oracle.bmc.waiter.TerminationStrategy terminationStrategy,
                    com.oracle.bmc.waiter.DelayStrategy delayStrategy) {
        com.oracle.bmc.util.internal.Validate.notNull(
                targetState, "The targetState cannot be null");

        return forContainerRepository(
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
     * @param targetStates the desired states to wait for. The waiter will return once the resource
     *     reaches any of the provided states
     * @return a new {@code com.oracle.bmc.waiter.Waiter} instance
     */
    public com.oracle.bmc.waiter.Waiter<
                    GetContainerRepositoryRequest, GetContainerRepositoryResponse>
            forContainerRepository(
                    GetContainerRepositoryRequest request,
                    com.oracle.bmc.waiter.TerminationStrategy terminationStrategy,
                    com.oracle.bmc.waiter.DelayStrategy delayStrategy,
                    com.oracle.bmc.artifacts.model.ContainerRepository.LifecycleState...
                            targetStates) {
        com.oracle.bmc.util.internal.Validate.notEmpty(
                targetStates, "At least one target state must be provided");
        com.oracle.bmc.util.internal.Validate.noNullElements(
                targetStates, "Null target states are not permitted");

        return forContainerRepository(
                com.oracle.bmc.waiter.Waiters.newWaiter(terminationStrategy, delayStrategy),
                request,
                targetStates);
    }

    // Helper method to create a new Waiter for ContainerRepository.
    private com.oracle.bmc.waiter.Waiter<
                    GetContainerRepositoryRequest, GetContainerRepositoryResponse>
            forContainerRepository(
                    com.oracle.bmc.waiter.BmcGenericWaiter waiter,
                    final GetContainerRepositoryRequest request,
                    final com.oracle.bmc.artifacts.model.ContainerRepository.LifecycleState...
                            targetStates) {
        final java.util.Set<com.oracle.bmc.artifacts.model.ContainerRepository.LifecycleState>
                targetStatesSet = new java.util.HashSet<>(java.util.Arrays.asList(targetStates));

        return new com.oracle.bmc.waiter.internal.SimpleWaiterImpl<>(
                executorService,
                waiter.toCallable(
                        () -> request,
                        new java.util.function.Function<
                                GetContainerRepositoryRequest, GetContainerRepositoryResponse>() {
                            @Override
                            public GetContainerRepositoryResponse apply(
                                    GetContainerRepositoryRequest request) {
                                return client.getContainerRepository(request);
                            }
                        },
                        new java.util.function.Predicate<GetContainerRepositoryResponse>() {
                            @Override
                            public boolean test(GetContainerRepositoryResponse response) {
                                return targetStatesSet.contains(
                                        response.getContainerRepository().getLifecycleState());
                            }
                        },
                        targetStatesSet.contains(
                                com.oracle.bmc.artifacts.model.ContainerRepository.LifecycleState
                                        .Deleted)),
                request);
    }

    /**
     * Creates a new {@link com.oracle.bmc.waiter.Waiter} using the default configuration.
     *
     * @param request the request to send
     * @param targetStates the desired states to wait for. If multiple states are provided then the
     *     waiter will return once the resource reaches any of the provided states
     * @return a new {@code Waiter} instance
     */
    public com.oracle.bmc.waiter.Waiter<GetGenericArtifactRequest, GetGenericArtifactResponse>
            forGenericArtifact(
                    GetGenericArtifactRequest request,
                    com.oracle.bmc.artifacts.model.GenericArtifact.LifecycleState... targetStates) {
        com.oracle.bmc.util.internal.Validate.notEmpty(
                targetStates, "At least one targetState must be provided");
        com.oracle.bmc.util.internal.Validate.noNullElements(
                targetStates, "Null targetState values are not permitted");

        return forGenericArtifact(
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
    public com.oracle.bmc.waiter.Waiter<GetGenericArtifactRequest, GetGenericArtifactResponse>
            forGenericArtifact(
                    GetGenericArtifactRequest request,
                    com.oracle.bmc.artifacts.model.GenericArtifact.LifecycleState targetState,
                    com.oracle.bmc.waiter.TerminationStrategy terminationStrategy,
                    com.oracle.bmc.waiter.DelayStrategy delayStrategy) {
        com.oracle.bmc.util.internal.Validate.notNull(
                targetState, "The targetState cannot be null");

        return forGenericArtifact(
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
     * @param targetStates the desired states to wait for. The waiter will return once the resource
     *     reaches any of the provided states
     * @return a new {@code com.oracle.bmc.waiter.Waiter} instance
     */
    public com.oracle.bmc.waiter.Waiter<GetGenericArtifactRequest, GetGenericArtifactResponse>
            forGenericArtifact(
                    GetGenericArtifactRequest request,
                    com.oracle.bmc.waiter.TerminationStrategy terminationStrategy,
                    com.oracle.bmc.waiter.DelayStrategy delayStrategy,
                    com.oracle.bmc.artifacts.model.GenericArtifact.LifecycleState... targetStates) {
        com.oracle.bmc.util.internal.Validate.notEmpty(
                targetStates, "At least one target state must be provided");
        com.oracle.bmc.util.internal.Validate.noNullElements(
                targetStates, "Null target states are not permitted");

        return forGenericArtifact(
                com.oracle.bmc.waiter.Waiters.newWaiter(terminationStrategy, delayStrategy),
                request,
                targetStates);
    }

    // Helper method to create a new Waiter for GenericArtifact.
    private com.oracle.bmc.waiter.Waiter<GetGenericArtifactRequest, GetGenericArtifactResponse>
            forGenericArtifact(
                    com.oracle.bmc.waiter.BmcGenericWaiter waiter,
                    final GetGenericArtifactRequest request,
                    final com.oracle.bmc.artifacts.model.GenericArtifact.LifecycleState...
                            targetStates) {
        final java.util.Set<com.oracle.bmc.artifacts.model.GenericArtifact.LifecycleState>
                targetStatesSet = new java.util.HashSet<>(java.util.Arrays.asList(targetStates));

        return new com.oracle.bmc.waiter.internal.SimpleWaiterImpl<>(
                executorService,
                waiter.toCallable(
                        () -> request,
                        new java.util.function.Function<
                                GetGenericArtifactRequest, GetGenericArtifactResponse>() {
                            @Override
                            public GetGenericArtifactResponse apply(
                                    GetGenericArtifactRequest request) {
                                return client.getGenericArtifact(request);
                            }
                        },
                        new java.util.function.Predicate<GetGenericArtifactResponse>() {
                            @Override
                            public boolean test(GetGenericArtifactResponse response) {
                                return targetStatesSet.contains(
                                        response.getGenericArtifact().getLifecycleState());
                            }
                        },
                        targetStatesSet.contains(
                                com.oracle.bmc.artifacts.model.GenericArtifact.LifecycleState
                                        .Deleted)),
                request);
    }

    /**
     * Creates a new {@link com.oracle.bmc.waiter.Waiter} using the default configuration.
     *
     * @param request the request to send
     * @param targetStates the desired states to wait for. If multiple states are provided then the
     *     waiter will return once the resource reaches any of the provided states
     * @return a new {@code Waiter} instance
     */
    public com.oracle.bmc.waiter.Waiter<GetRepositoryRequest, GetRepositoryResponse> forRepository(
            GetRepositoryRequest request,
            com.oracle.bmc.artifacts.model.Repository.LifecycleState... targetStates) {
        com.oracle.bmc.util.internal.Validate.notEmpty(
                targetStates, "At least one targetState must be provided");
        com.oracle.bmc.util.internal.Validate.noNullElements(
                targetStates, "Null targetState values are not permitted");

        return forRepository(
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
    public com.oracle.bmc.waiter.Waiter<GetRepositoryRequest, GetRepositoryResponse> forRepository(
            GetRepositoryRequest request,
            com.oracle.bmc.artifacts.model.Repository.LifecycleState targetState,
            com.oracle.bmc.waiter.TerminationStrategy terminationStrategy,
            com.oracle.bmc.waiter.DelayStrategy delayStrategy) {
        com.oracle.bmc.util.internal.Validate.notNull(
                targetState, "The targetState cannot be null");

        return forRepository(
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
     * @param targetStates the desired states to wait for. The waiter will return once the resource
     *     reaches any of the provided states
     * @return a new {@code com.oracle.bmc.waiter.Waiter} instance
     */
    public com.oracle.bmc.waiter.Waiter<GetRepositoryRequest, GetRepositoryResponse> forRepository(
            GetRepositoryRequest request,
            com.oracle.bmc.waiter.TerminationStrategy terminationStrategy,
            com.oracle.bmc.waiter.DelayStrategy delayStrategy,
            com.oracle.bmc.artifacts.model.Repository.LifecycleState... targetStates) {
        com.oracle.bmc.util.internal.Validate.notEmpty(
                targetStates, "At least one target state must be provided");
        com.oracle.bmc.util.internal.Validate.noNullElements(
                targetStates, "Null target states are not permitted");

        return forRepository(
                com.oracle.bmc.waiter.Waiters.newWaiter(terminationStrategy, delayStrategy),
                request,
                targetStates);
    }

    // Helper method to create a new Waiter for Repository.
    private com.oracle.bmc.waiter.Waiter<GetRepositoryRequest, GetRepositoryResponse> forRepository(
            com.oracle.bmc.waiter.BmcGenericWaiter waiter,
            final GetRepositoryRequest request,
            final com.oracle.bmc.artifacts.model.Repository.LifecycleState... targetStates) {
        final java.util.Set<com.oracle.bmc.artifacts.model.Repository.LifecycleState>
                targetStatesSet = new java.util.HashSet<>(java.util.Arrays.asList(targetStates));

        return new com.oracle.bmc.waiter.internal.SimpleWaiterImpl<>(
                executorService,
                waiter.toCallable(
                        () -> request,
                        new java.util.function.Function<
                                GetRepositoryRequest, GetRepositoryResponse>() {
                            @Override
                            public GetRepositoryResponse apply(GetRepositoryRequest request) {
                                return client.getRepository(request);
                            }
                        },
                        new java.util.function.Predicate<GetRepositoryResponse>() {
                            @Override
                            public boolean test(GetRepositoryResponse response) {
                                return targetStatesSet.contains(
                                        response.getRepository().getLifecycleState());
                            }
                        },
                        targetStatesSet.contains(
                                com.oracle.bmc.artifacts.model.Repository.LifecycleState.Deleted)),
                request);
    }
}
