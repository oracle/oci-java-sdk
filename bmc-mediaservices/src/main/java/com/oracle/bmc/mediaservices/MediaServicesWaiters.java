/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.mediaservices;

import com.oracle.bmc.mediaservices.requests.*;
import com.oracle.bmc.mediaservices.responses.*;

/**
 * Collection of helper methods to produce {@link com.oracle.bmc.waiter.Waiter}s for different
 * resources of MediaServices.
 * <p>
 * The default configuration used is defined by {@link com.oracle.bmc.waiter.Waiters.Waiters#DEFAULT_POLLING_WAITER}.
 */
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20211101")
public class MediaServicesWaiters {
    private final java.util.concurrent.ExecutorService executorService;
    private final MediaServices client;

    public MediaServicesWaiters(
            java.util.concurrent.ExecutorService executorService, MediaServices client) {
        this.executorService = executorService;
        this.client = client;
    }

    /**
     * Creates a new {@link com.oracle.bmc.waiter.Waiter} using the default configuration.
     *
     * @param request the request to send
     * @param targetState the desired states to wait for. If multiple states are provided then the waiter will return once the resource reaches any of the provided states
     * @return a new {@code com.oracle.bmc.waiter.Waiter} instance
     */
    public com.oracle.bmc.waiter.Waiter<GetMediaAssetRequest, GetMediaAssetResponse> forMediaAsset(
            GetMediaAssetRequest request,
            com.oracle.bmc.mediaservices.model.LifecycleState... targetStates) {
        com.oracle.bmc.util.internal.Validate.notEmpty(
                targetStates, "At least one targetState must be provided");
        com.oracle.bmc.util.internal.Validate.noNullElements(
                targetStates, "Null targetState values are not permitted");

        return forMediaAsset(
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
    public com.oracle.bmc.waiter.Waiter<GetMediaAssetRequest, GetMediaAssetResponse> forMediaAsset(
            GetMediaAssetRequest request,
            com.oracle.bmc.mediaservices.model.LifecycleState targetState,
            com.oracle.bmc.waiter.TerminationStrategy terminationStrategy,
            com.oracle.bmc.waiter.DelayStrategy delayStrategy) {
        com.oracle.bmc.util.internal.Validate.notNull(
                targetState, "The targetState cannot be null");

        return forMediaAsset(
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
     * @return a new {@code Waiter} instance
     */
    public com.oracle.bmc.waiter.Waiter<GetMediaAssetRequest, GetMediaAssetResponse> forMediaAsset(
            GetMediaAssetRequest request,
            com.oracle.bmc.waiter.TerminationStrategy terminationStrategy,
            com.oracle.bmc.waiter.DelayStrategy delayStrategy,
            com.oracle.bmc.mediaservices.model.LifecycleState... targetStates) {
        com.oracle.bmc.util.internal.Validate.notEmpty(
                targetStates, "At least one targetState must be provided");
        com.oracle.bmc.util.internal.Validate.noNullElements(
                targetStates, "Null targetState values are not permitted");

        return forMediaAsset(
                com.oracle.bmc.waiter.Waiters.newWaiter(terminationStrategy, delayStrategy),
                request,
                targetStates);
    }

    // Helper method to create a new Waiter for MediaAsset.
    private com.oracle.bmc.waiter.Waiter<GetMediaAssetRequest, GetMediaAssetResponse> forMediaAsset(
            com.oracle.bmc.waiter.BmcGenericWaiter waiter,
            final GetMediaAssetRequest request,
            final com.oracle.bmc.mediaservices.model.LifecycleState... targetStates) {
        final java.util.Set<com.oracle.bmc.mediaservices.model.LifecycleState> targetStatesSet =
                new java.util.HashSet<>(java.util.Arrays.asList(targetStates));

        return new com.oracle.bmc.waiter.internal.SimpleWaiterImpl<>(
                executorService,
                waiter.toCallable(
                        () -> request,
                        new java.util.function.Function<
                                GetMediaAssetRequest, GetMediaAssetResponse>() {
                            @Override
                            public GetMediaAssetResponse apply(GetMediaAssetRequest request) {
                                return client.getMediaAsset(request);
                            }
                        },
                        new java.util.function.Predicate<GetMediaAssetResponse>() {
                            @Override
                            public boolean test(GetMediaAssetResponse response) {
                                return targetStatesSet.contains(
                                        response.getMediaAsset().getLifecycleState());
                            }
                        },
                        targetStatesSet.contains(
                                com.oracle.bmc.mediaservices.model.LifecycleState.Deleted)),
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
                    GetMediaAssetDistributionChannelAttachmentRequest,
                    GetMediaAssetDistributionChannelAttachmentResponse>
            forMediaAssetDistributionChannelAttachment(
                    GetMediaAssetDistributionChannelAttachmentRequest request,
                    com.oracle.bmc.mediaservices.model.MediaAssetDistributionChannelAttachment
                                    .LifecycleState...
                            targetStates) {
        com.oracle.bmc.util.internal.Validate.notEmpty(
                targetStates, "At least one targetState must be provided");
        com.oracle.bmc.util.internal.Validate.noNullElements(
                targetStates, "Null targetState values are not permitted");

        return forMediaAssetDistributionChannelAttachment(
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
                    GetMediaAssetDistributionChannelAttachmentRequest,
                    GetMediaAssetDistributionChannelAttachmentResponse>
            forMediaAssetDistributionChannelAttachment(
                    GetMediaAssetDistributionChannelAttachmentRequest request,
                    com.oracle.bmc.mediaservices.model.MediaAssetDistributionChannelAttachment
                                    .LifecycleState
                            targetState,
                    com.oracle.bmc.waiter.TerminationStrategy terminationStrategy,
                    com.oracle.bmc.waiter.DelayStrategy delayStrategy) {
        com.oracle.bmc.util.internal.Validate.notNull(
                targetState, "The targetState cannot be null");

        return forMediaAssetDistributionChannelAttachment(
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
                    GetMediaAssetDistributionChannelAttachmentRequest,
                    GetMediaAssetDistributionChannelAttachmentResponse>
            forMediaAssetDistributionChannelAttachment(
                    GetMediaAssetDistributionChannelAttachmentRequest request,
                    com.oracle.bmc.waiter.TerminationStrategy terminationStrategy,
                    com.oracle.bmc.waiter.DelayStrategy delayStrategy,
                    com.oracle.bmc.mediaservices.model.MediaAssetDistributionChannelAttachment
                                    .LifecycleState...
                            targetStates) {
        com.oracle.bmc.util.internal.Validate.notEmpty(
                targetStates, "At least one target state must be provided");
        com.oracle.bmc.util.internal.Validate.noNullElements(
                targetStates, "Null target states are not permitted");

        return forMediaAssetDistributionChannelAttachment(
                com.oracle.bmc.waiter.Waiters.newWaiter(terminationStrategy, delayStrategy),
                request,
                targetStates);
    }

    // Helper method to create a new Waiter for MediaAssetDistributionChannelAttachment.
    private com.oracle.bmc.waiter.Waiter<
                    GetMediaAssetDistributionChannelAttachmentRequest,
                    GetMediaAssetDistributionChannelAttachmentResponse>
            forMediaAssetDistributionChannelAttachment(
                    com.oracle.bmc.waiter.BmcGenericWaiter waiter,
                    final GetMediaAssetDistributionChannelAttachmentRequest request,
                    final com.oracle.bmc.mediaservices.model.MediaAssetDistributionChannelAttachment
                                    .LifecycleState...
                            targetStates) {
        final java.util.Set<
                        com.oracle.bmc.mediaservices.model.MediaAssetDistributionChannelAttachment
                                .LifecycleState>
                targetStatesSet = new java.util.HashSet<>(java.util.Arrays.asList(targetStates));

        return new com.oracle.bmc.waiter.internal.SimpleWaiterImpl<>(
                executorService,
                waiter.toCallable(
                        () -> request,
                        new java.util.function.Function<
                                GetMediaAssetDistributionChannelAttachmentRequest,
                                GetMediaAssetDistributionChannelAttachmentResponse>() {
                            @Override
                            public GetMediaAssetDistributionChannelAttachmentResponse apply(
                                    GetMediaAssetDistributionChannelAttachmentRequest request) {
                                return client.getMediaAssetDistributionChannelAttachment(request);
                            }
                        },
                        new java.util.function.Predicate<
                                GetMediaAssetDistributionChannelAttachmentResponse>() {
                            @Override
                            public boolean test(
                                    GetMediaAssetDistributionChannelAttachmentResponse response) {
                                return targetStatesSet.contains(
                                        response.getMediaAssetDistributionChannelAttachment()
                                                .getLifecycleState());
                            }
                        },
                        false),
                request);
    }

    /**
     * Creates a new {@link com.oracle.bmc.waiter.Waiter} using the default configuration.
     *
     * @param request the request to send
     * @param targetStates the desired states to wait for. If multiple states are provided then the waiter will return once the resource reaches any of the provided states
     * @return a new {@code Waiter} instance
     */
    public com.oracle.bmc.waiter.Waiter<GetMediaWorkflowRequest, GetMediaWorkflowResponse>
            forMediaWorkflow(
                    GetMediaWorkflowRequest request,
                    com.oracle.bmc.mediaservices.model.MediaWorkflow.LifecycleState...
                            targetStates) {
        com.oracle.bmc.util.internal.Validate.notEmpty(
                targetStates, "At least one targetState must be provided");
        com.oracle.bmc.util.internal.Validate.noNullElements(
                targetStates, "Null targetState values are not permitted");

        return forMediaWorkflow(
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
    public com.oracle.bmc.waiter.Waiter<GetMediaWorkflowRequest, GetMediaWorkflowResponse>
            forMediaWorkflow(
                    GetMediaWorkflowRequest request,
                    com.oracle.bmc.mediaservices.model.MediaWorkflow.LifecycleState targetState,
                    com.oracle.bmc.waiter.TerminationStrategy terminationStrategy,
                    com.oracle.bmc.waiter.DelayStrategy delayStrategy) {
        com.oracle.bmc.util.internal.Validate.notNull(
                targetState, "The targetState cannot be null");

        return forMediaWorkflow(
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
    public com.oracle.bmc.waiter.Waiter<GetMediaWorkflowRequest, GetMediaWorkflowResponse>
            forMediaWorkflow(
                    GetMediaWorkflowRequest request,
                    com.oracle.bmc.waiter.TerminationStrategy terminationStrategy,
                    com.oracle.bmc.waiter.DelayStrategy delayStrategy,
                    com.oracle.bmc.mediaservices.model.MediaWorkflow.LifecycleState...
                            targetStates) {
        com.oracle.bmc.util.internal.Validate.notEmpty(
                targetStates, "At least one target state must be provided");
        com.oracle.bmc.util.internal.Validate.noNullElements(
                targetStates, "Null target states are not permitted");

        return forMediaWorkflow(
                com.oracle.bmc.waiter.Waiters.newWaiter(terminationStrategy, delayStrategy),
                request,
                targetStates);
    }

    // Helper method to create a new Waiter for MediaWorkflow.
    private com.oracle.bmc.waiter.Waiter<GetMediaWorkflowRequest, GetMediaWorkflowResponse>
            forMediaWorkflow(
                    com.oracle.bmc.waiter.BmcGenericWaiter waiter,
                    final GetMediaWorkflowRequest request,
                    final com.oracle.bmc.mediaservices.model.MediaWorkflow.LifecycleState...
                            targetStates) {
        final java.util.Set<com.oracle.bmc.mediaservices.model.MediaWorkflow.LifecycleState>
                targetStatesSet = new java.util.HashSet<>(java.util.Arrays.asList(targetStates));

        return new com.oracle.bmc.waiter.internal.SimpleWaiterImpl<>(
                executorService,
                waiter.toCallable(
                        () -> request,
                        new java.util.function.Function<
                                GetMediaWorkflowRequest, GetMediaWorkflowResponse>() {
                            @Override
                            public GetMediaWorkflowResponse apply(GetMediaWorkflowRequest request) {
                                return client.getMediaWorkflow(request);
                            }
                        },
                        new java.util.function.Predicate<GetMediaWorkflowResponse>() {
                            @Override
                            public boolean test(GetMediaWorkflowResponse response) {
                                return targetStatesSet.contains(
                                        response.getMediaWorkflow().getLifecycleState());
                            }
                        },
                        targetStatesSet.contains(
                                com.oracle.bmc.mediaservices.model.MediaWorkflow.LifecycleState
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
                    GetMediaWorkflowConfigurationRequest, GetMediaWorkflowConfigurationResponse>
            forMediaWorkflowConfiguration(
                    GetMediaWorkflowConfigurationRequest request,
                    com.oracle.bmc.mediaservices.model.MediaWorkflowConfiguration.LifecycleState...
                            targetStates) {
        com.oracle.bmc.util.internal.Validate.notEmpty(
                targetStates, "At least one targetState must be provided");
        com.oracle.bmc.util.internal.Validate.noNullElements(
                targetStates, "Null targetState values are not permitted");

        return forMediaWorkflowConfiguration(
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
                    GetMediaWorkflowConfigurationRequest, GetMediaWorkflowConfigurationResponse>
            forMediaWorkflowConfiguration(
                    GetMediaWorkflowConfigurationRequest request,
                    com.oracle.bmc.mediaservices.model.MediaWorkflowConfiguration.LifecycleState
                            targetState,
                    com.oracle.bmc.waiter.TerminationStrategy terminationStrategy,
                    com.oracle.bmc.waiter.DelayStrategy delayStrategy) {
        com.oracle.bmc.util.internal.Validate.notNull(
                targetState, "The targetState cannot be null");

        return forMediaWorkflowConfiguration(
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
                    GetMediaWorkflowConfigurationRequest, GetMediaWorkflowConfigurationResponse>
            forMediaWorkflowConfiguration(
                    GetMediaWorkflowConfigurationRequest request,
                    com.oracle.bmc.waiter.TerminationStrategy terminationStrategy,
                    com.oracle.bmc.waiter.DelayStrategy delayStrategy,
                    com.oracle.bmc.mediaservices.model.MediaWorkflowConfiguration.LifecycleState...
                            targetStates) {
        com.oracle.bmc.util.internal.Validate.notEmpty(
                targetStates, "At least one target state must be provided");
        com.oracle.bmc.util.internal.Validate.noNullElements(
                targetStates, "Null target states are not permitted");

        return forMediaWorkflowConfiguration(
                com.oracle.bmc.waiter.Waiters.newWaiter(terminationStrategy, delayStrategy),
                request,
                targetStates);
    }

    // Helper method to create a new Waiter for MediaWorkflowConfiguration.
    private com.oracle.bmc.waiter.Waiter<
                    GetMediaWorkflowConfigurationRequest, GetMediaWorkflowConfigurationResponse>
            forMediaWorkflowConfiguration(
                    com.oracle.bmc.waiter.BmcGenericWaiter waiter,
                    final GetMediaWorkflowConfigurationRequest request,
                    final com.oracle.bmc.mediaservices.model.MediaWorkflowConfiguration
                                    .LifecycleState...
                            targetStates) {
        final java.util.Set<
                        com.oracle.bmc.mediaservices.model.MediaWorkflowConfiguration
                                .LifecycleState>
                targetStatesSet = new java.util.HashSet<>(java.util.Arrays.asList(targetStates));

        return new com.oracle.bmc.waiter.internal.SimpleWaiterImpl<>(
                executorService,
                waiter.toCallable(
                        () -> request,
                        new java.util.function.Function<
                                GetMediaWorkflowConfigurationRequest,
                                GetMediaWorkflowConfigurationResponse>() {
                            @Override
                            public GetMediaWorkflowConfigurationResponse apply(
                                    GetMediaWorkflowConfigurationRequest request) {
                                return client.getMediaWorkflowConfiguration(request);
                            }
                        },
                        new java.util.function.Predicate<GetMediaWorkflowConfigurationResponse>() {
                            @Override
                            public boolean test(GetMediaWorkflowConfigurationResponse response) {
                                return targetStatesSet.contains(
                                        response.getMediaWorkflowConfiguration()
                                                .getLifecycleState());
                            }
                        },
                        targetStatesSet.contains(
                                com.oracle.bmc.mediaservices.model.MediaWorkflowConfiguration
                                        .LifecycleState.Deleted)),
                request);
    }

    /**
     * Creates a new {@link com.oracle.bmc.waiter.Waiter} using the default configuration.
     *
     * @param request the request to send
     * @param targetStates the desired states to wait for. If multiple states are provided then the waiter will return once the resource reaches any of the provided states
     * @return a new {@code Waiter} instance
     */
    public com.oracle.bmc.waiter.Waiter<GetMediaWorkflowJobRequest, GetMediaWorkflowJobResponse>
            forMediaWorkflowJob(
                    GetMediaWorkflowJobRequest request,
                    com.oracle.bmc.mediaservices.model.MediaWorkflowJob.LifecycleState...
                            targetStates) {
        com.oracle.bmc.util.internal.Validate.notEmpty(
                targetStates, "At least one targetState must be provided");
        com.oracle.bmc.util.internal.Validate.noNullElements(
                targetStates, "Null targetState values are not permitted");

        return forMediaWorkflowJob(
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
    public com.oracle.bmc.waiter.Waiter<GetMediaWorkflowJobRequest, GetMediaWorkflowJobResponse>
            forMediaWorkflowJob(
                    GetMediaWorkflowJobRequest request,
                    com.oracle.bmc.mediaservices.model.MediaWorkflowJob.LifecycleState targetState,
                    com.oracle.bmc.waiter.TerminationStrategy terminationStrategy,
                    com.oracle.bmc.waiter.DelayStrategy delayStrategy) {
        com.oracle.bmc.util.internal.Validate.notNull(
                targetState, "The targetState cannot be null");

        return forMediaWorkflowJob(
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
    public com.oracle.bmc.waiter.Waiter<GetMediaWorkflowJobRequest, GetMediaWorkflowJobResponse>
            forMediaWorkflowJob(
                    GetMediaWorkflowJobRequest request,
                    com.oracle.bmc.waiter.TerminationStrategy terminationStrategy,
                    com.oracle.bmc.waiter.DelayStrategy delayStrategy,
                    com.oracle.bmc.mediaservices.model.MediaWorkflowJob.LifecycleState...
                            targetStates) {
        com.oracle.bmc.util.internal.Validate.notEmpty(
                targetStates, "At least one target state must be provided");
        com.oracle.bmc.util.internal.Validate.noNullElements(
                targetStates, "Null target states are not permitted");

        return forMediaWorkflowJob(
                com.oracle.bmc.waiter.Waiters.newWaiter(terminationStrategy, delayStrategy),
                request,
                targetStates);
    }

    // Helper method to create a new Waiter for MediaWorkflowJob.
    private com.oracle.bmc.waiter.Waiter<GetMediaWorkflowJobRequest, GetMediaWorkflowJobResponse>
            forMediaWorkflowJob(
                    com.oracle.bmc.waiter.BmcGenericWaiter waiter,
                    final GetMediaWorkflowJobRequest request,
                    final com.oracle.bmc.mediaservices.model.MediaWorkflowJob.LifecycleState...
                            targetStates) {
        final java.util.Set<com.oracle.bmc.mediaservices.model.MediaWorkflowJob.LifecycleState>
                targetStatesSet = new java.util.HashSet<>(java.util.Arrays.asList(targetStates));

        return new com.oracle.bmc.waiter.internal.SimpleWaiterImpl<>(
                executorService,
                waiter.toCallable(
                        () -> request,
                        new java.util.function.Function<
                                GetMediaWorkflowJobRequest, GetMediaWorkflowJobResponse>() {
                            @Override
                            public GetMediaWorkflowJobResponse apply(
                                    GetMediaWorkflowJobRequest request) {
                                return client.getMediaWorkflowJob(request);
                            }
                        },
                        new java.util.function.Predicate<GetMediaWorkflowJobResponse>() {
                            @Override
                            public boolean test(GetMediaWorkflowJobResponse response) {
                                return targetStatesSet.contains(
                                        response.getMediaWorkflowJob().getLifecycleState());
                            }
                        },
                        false),
                request);
    }

    /**
     * Creates a new {@link com.oracle.bmc.waiter.Waiter} using the default configuration.
     *
     * @param request the request to send
     * @param targetStates the desired states to wait for. If multiple states are provided then the waiter will return once the resource reaches any of the provided states
     * @return a new {@code Waiter} instance
     */
    public com.oracle.bmc.waiter.Waiter<GetStreamCdnConfigRequest, GetStreamCdnConfigResponse>
            forStreamCdnConfig(
                    GetStreamCdnConfigRequest request,
                    com.oracle.bmc.mediaservices.model.StreamCdnConfig.LifecycleState...
                            targetStates) {
        com.oracle.bmc.util.internal.Validate.notEmpty(
                targetStates, "At least one targetState must be provided");
        com.oracle.bmc.util.internal.Validate.noNullElements(
                targetStates, "Null targetState values are not permitted");

        return forStreamCdnConfig(
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
    public com.oracle.bmc.waiter.Waiter<GetStreamCdnConfigRequest, GetStreamCdnConfigResponse>
            forStreamCdnConfig(
                    GetStreamCdnConfigRequest request,
                    com.oracle.bmc.mediaservices.model.StreamCdnConfig.LifecycleState targetState,
                    com.oracle.bmc.waiter.TerminationStrategy terminationStrategy,
                    com.oracle.bmc.waiter.DelayStrategy delayStrategy) {
        com.oracle.bmc.util.internal.Validate.notNull(
                targetState, "The targetState cannot be null");

        return forStreamCdnConfig(
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
    public com.oracle.bmc.waiter.Waiter<GetStreamCdnConfigRequest, GetStreamCdnConfigResponse>
            forStreamCdnConfig(
                    GetStreamCdnConfigRequest request,
                    com.oracle.bmc.waiter.TerminationStrategy terminationStrategy,
                    com.oracle.bmc.waiter.DelayStrategy delayStrategy,
                    com.oracle.bmc.mediaservices.model.StreamCdnConfig.LifecycleState...
                            targetStates) {
        com.oracle.bmc.util.internal.Validate.notEmpty(
                targetStates, "At least one target state must be provided");
        com.oracle.bmc.util.internal.Validate.noNullElements(
                targetStates, "Null target states are not permitted");

        return forStreamCdnConfig(
                com.oracle.bmc.waiter.Waiters.newWaiter(terminationStrategy, delayStrategy),
                request,
                targetStates);
    }

    // Helper method to create a new Waiter for StreamCdnConfig.
    private com.oracle.bmc.waiter.Waiter<GetStreamCdnConfigRequest, GetStreamCdnConfigResponse>
            forStreamCdnConfig(
                    com.oracle.bmc.waiter.BmcGenericWaiter waiter,
                    final GetStreamCdnConfigRequest request,
                    final com.oracle.bmc.mediaservices.model.StreamCdnConfig.LifecycleState...
                            targetStates) {
        final java.util.Set<com.oracle.bmc.mediaservices.model.StreamCdnConfig.LifecycleState>
                targetStatesSet = new java.util.HashSet<>(java.util.Arrays.asList(targetStates));

        return new com.oracle.bmc.waiter.internal.SimpleWaiterImpl<>(
                executorService,
                waiter.toCallable(
                        () -> request,
                        new java.util.function.Function<
                                GetStreamCdnConfigRequest, GetStreamCdnConfigResponse>() {
                            @Override
                            public GetStreamCdnConfigResponse apply(
                                    GetStreamCdnConfigRequest request) {
                                return client.getStreamCdnConfig(request);
                            }
                        },
                        new java.util.function.Predicate<GetStreamCdnConfigResponse>() {
                            @Override
                            public boolean test(GetStreamCdnConfigResponse response) {
                                return targetStatesSet.contains(
                                        response.getStreamCdnConfig().getLifecycleState());
                            }
                        },
                        targetStatesSet.contains(
                                com.oracle.bmc.mediaservices.model.StreamCdnConfig.LifecycleState
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
                    GetStreamDistributionChannelRequest, GetStreamDistributionChannelResponse>
            forStreamDistributionChannel(
                    GetStreamDistributionChannelRequest request,
                    com.oracle.bmc.mediaservices.model.StreamDistributionChannel.LifecycleState...
                            targetStates) {
        com.oracle.bmc.util.internal.Validate.notEmpty(
                targetStates, "At least one targetState must be provided");
        com.oracle.bmc.util.internal.Validate.noNullElements(
                targetStates, "Null targetState values are not permitted");

        return forStreamDistributionChannel(
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
                    GetStreamDistributionChannelRequest, GetStreamDistributionChannelResponse>
            forStreamDistributionChannel(
                    GetStreamDistributionChannelRequest request,
                    com.oracle.bmc.mediaservices.model.StreamDistributionChannel.LifecycleState
                            targetState,
                    com.oracle.bmc.waiter.TerminationStrategy terminationStrategy,
                    com.oracle.bmc.waiter.DelayStrategy delayStrategy) {
        com.oracle.bmc.util.internal.Validate.notNull(
                targetState, "The targetState cannot be null");

        return forStreamDistributionChannel(
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
                    GetStreamDistributionChannelRequest, GetStreamDistributionChannelResponse>
            forStreamDistributionChannel(
                    GetStreamDistributionChannelRequest request,
                    com.oracle.bmc.waiter.TerminationStrategy terminationStrategy,
                    com.oracle.bmc.waiter.DelayStrategy delayStrategy,
                    com.oracle.bmc.mediaservices.model.StreamDistributionChannel.LifecycleState...
                            targetStates) {
        com.oracle.bmc.util.internal.Validate.notEmpty(
                targetStates, "At least one target state must be provided");
        com.oracle.bmc.util.internal.Validate.noNullElements(
                targetStates, "Null target states are not permitted");

        return forStreamDistributionChannel(
                com.oracle.bmc.waiter.Waiters.newWaiter(terminationStrategy, delayStrategy),
                request,
                targetStates);
    }

    // Helper method to create a new Waiter for StreamDistributionChannel.
    private com.oracle.bmc.waiter.Waiter<
                    GetStreamDistributionChannelRequest, GetStreamDistributionChannelResponse>
            forStreamDistributionChannel(
                    com.oracle.bmc.waiter.BmcGenericWaiter waiter,
                    final GetStreamDistributionChannelRequest request,
                    final com.oracle.bmc.mediaservices.model.StreamDistributionChannel
                                    .LifecycleState...
                            targetStates) {
        final java.util.Set<
                        com.oracle.bmc.mediaservices.model.StreamDistributionChannel.LifecycleState>
                targetStatesSet = new java.util.HashSet<>(java.util.Arrays.asList(targetStates));

        return new com.oracle.bmc.waiter.internal.SimpleWaiterImpl<>(
                executorService,
                waiter.toCallable(
                        () -> request,
                        new java.util.function.Function<
                                GetStreamDistributionChannelRequest,
                                GetStreamDistributionChannelResponse>() {
                            @Override
                            public GetStreamDistributionChannelResponse apply(
                                    GetStreamDistributionChannelRequest request) {
                                return client.getStreamDistributionChannel(request);
                            }
                        },
                        new java.util.function.Predicate<GetStreamDistributionChannelResponse>() {
                            @Override
                            public boolean test(GetStreamDistributionChannelResponse response) {
                                return targetStatesSet.contains(
                                        response.getStreamDistributionChannel()
                                                .getLifecycleState());
                            }
                        },
                        targetStatesSet.contains(
                                com.oracle.bmc.mediaservices.model.StreamDistributionChannel
                                        .LifecycleState.Deleted)),
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
                    GetStreamPackagingConfigRequest, GetStreamPackagingConfigResponse>
            forStreamPackagingConfig(
                    GetStreamPackagingConfigRequest request,
                    com.oracle.bmc.mediaservices.model.StreamPackagingConfig.LifecycleState...
                            targetStates) {
        com.oracle.bmc.util.internal.Validate.notEmpty(
                targetStates, "At least one targetState must be provided");
        com.oracle.bmc.util.internal.Validate.noNullElements(
                targetStates, "Null targetState values are not permitted");

        return forStreamPackagingConfig(
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
                    GetStreamPackagingConfigRequest, GetStreamPackagingConfigResponse>
            forStreamPackagingConfig(
                    GetStreamPackagingConfigRequest request,
                    com.oracle.bmc.mediaservices.model.StreamPackagingConfig.LifecycleState
                            targetState,
                    com.oracle.bmc.waiter.TerminationStrategy terminationStrategy,
                    com.oracle.bmc.waiter.DelayStrategy delayStrategy) {
        com.oracle.bmc.util.internal.Validate.notNull(
                targetState, "The targetState cannot be null");

        return forStreamPackagingConfig(
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
                    GetStreamPackagingConfigRequest, GetStreamPackagingConfigResponse>
            forStreamPackagingConfig(
                    GetStreamPackagingConfigRequest request,
                    com.oracle.bmc.waiter.TerminationStrategy terminationStrategy,
                    com.oracle.bmc.waiter.DelayStrategy delayStrategy,
                    com.oracle.bmc.mediaservices.model.StreamPackagingConfig.LifecycleState...
                            targetStates) {
        com.oracle.bmc.util.internal.Validate.notEmpty(
                targetStates, "At least one target state must be provided");
        com.oracle.bmc.util.internal.Validate.noNullElements(
                targetStates, "Null target states are not permitted");

        return forStreamPackagingConfig(
                com.oracle.bmc.waiter.Waiters.newWaiter(terminationStrategy, delayStrategy),
                request,
                targetStates);
    }

    // Helper method to create a new Waiter for StreamPackagingConfig.
    private com.oracle.bmc.waiter.Waiter<
                    GetStreamPackagingConfigRequest, GetStreamPackagingConfigResponse>
            forStreamPackagingConfig(
                    com.oracle.bmc.waiter.BmcGenericWaiter waiter,
                    final GetStreamPackagingConfigRequest request,
                    final com.oracle.bmc.mediaservices.model.StreamPackagingConfig.LifecycleState...
                            targetStates) {
        final java.util.Set<com.oracle.bmc.mediaservices.model.StreamPackagingConfig.LifecycleState>
                targetStatesSet = new java.util.HashSet<>(java.util.Arrays.asList(targetStates));

        return new com.oracle.bmc.waiter.internal.SimpleWaiterImpl<>(
                executorService,
                waiter.toCallable(
                        () -> request,
                        new java.util.function.Function<
                                GetStreamPackagingConfigRequest,
                                GetStreamPackagingConfigResponse>() {
                            @Override
                            public GetStreamPackagingConfigResponse apply(
                                    GetStreamPackagingConfigRequest request) {
                                return client.getStreamPackagingConfig(request);
                            }
                        },
                        new java.util.function.Predicate<GetStreamPackagingConfigResponse>() {
                            @Override
                            public boolean test(GetStreamPackagingConfigResponse response) {
                                return targetStatesSet.contains(
                                        response.getStreamPackagingConfig().getLifecycleState());
                            }
                        },
                        targetStatesSet.contains(
                                com.oracle.bmc.mediaservices.model.StreamPackagingConfig
                                        .LifecycleState.Deleted)),
                request);
    }
}
