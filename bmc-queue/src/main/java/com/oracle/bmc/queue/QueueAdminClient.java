/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.queue;

import com.oracle.bmc.util.internal.Validate;
import com.oracle.bmc.queue.requests.*;
import com.oracle.bmc.queue.responses.*;
import com.oracle.bmc.circuitbreaker.CircuitBreakerConfiguration;
import com.oracle.bmc.util.CircuitBreakerUtils;

import java.util.Objects;

@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20210201")
public class QueueAdminClient extends com.oracle.bmc.http.internal.BaseSyncClient
        implements QueueAdmin {
    /** Service instance for QueueAdmin. */
    public static final com.oracle.bmc.Service SERVICE =
            com.oracle.bmc.Services.serviceBuilder()
                    .serviceName(QueueAdminClient.class.getName())
                    .serviceEndpointPrefix("")
                    .serviceEndpointTemplate("https://messaging.{region}.oci.{secondLevelDomain}")
                    .build();

    private static final org.slf4j.Logger LOG =
            org.slf4j.LoggerFactory.getLogger(QueueAdminClient.class);

    private final QueueAdminWaiters waiters;

    private final QueueAdminPaginators paginators;

    QueueAdminClient(
            com.oracle.bmc.common.ClientBuilderBase<?, ?> builder,
            com.oracle.bmc.auth.AbstractAuthenticationDetailsProvider authenticationDetailsProvider,
            java.util.concurrent.ExecutorService executorService) {
        super(
                builder,
                authenticationDetailsProvider,
                CircuitBreakerUtils.DEFAULT_CIRCUIT_BREAKER_CONFIGURATION);

        if (executorService == null) {
            // up to 50 (core) threads, time out after 60s idle, all daemon
            java.util.concurrent.ThreadPoolExecutor threadPoolExecutor =
                    new java.util.concurrent.ThreadPoolExecutor(
                            50,
                            50,
                            60L,
                            java.util.concurrent.TimeUnit.SECONDS,
                            new java.util.concurrent.LinkedBlockingQueue<Runnable>(),
                            com.oracle.bmc.internal.ClientThreadFactory.builder()
                                    .isDaemon(true)
                                    .nameFormat("QueueAdmin-waiters-%d")
                                    .build());
            threadPoolExecutor.allowCoreThreadTimeOut(true);

            executorService = threadPoolExecutor;
        }
        this.waiters = new QueueAdminWaiters(executorService, this);

        this.paginators = new QueueAdminPaginators(this);
    }

    /**
     * Create a builder for this client.
     *
     * @return builder
     */
    public static Builder builder() {
        return new Builder(SERVICE);
    }

    /**
     * Builder class for this client. The "authenticationDetailsProvider" is required and must be
     * passed to the {@link #build(AbstractAuthenticationDetailsProvider)} method.
     */
    public static class Builder
            extends com.oracle.bmc.common.RegionalClientBuilder<Builder, QueueAdminClient> {
        private java.util.concurrent.ExecutorService executorService;

        private Builder(com.oracle.bmc.Service service) {
            super(service);
            final String packageName = "queue";
            com.oracle.bmc.internal.Alloy.throwDisabledServiceExceptionIfAppropriate(packageName);
            requestSignerFactory =
                    new com.oracle.bmc.http.signing.internal.DefaultRequestSignerFactory(
                            com.oracle.bmc.http.signing.SigningStrategy.STANDARD);
        }

        /**
         * Set the ExecutorService for the client to be created.
         *
         * @param executorService executorService
         * @return this builder
         */
        public Builder executorService(java.util.concurrent.ExecutorService executorService) {
            this.executorService = executorService;
            return this;
        }

        /**
         * Build the client.
         *
         * @param authenticationDetailsProvider authentication details provider
         * @return the client
         */
        public QueueAdminClient build(
                @jakarta.annotation.Nonnull
                        com.oracle.bmc.auth.AbstractAuthenticationDetailsProvider
                                authenticationDetailsProvider) {
            return new QueueAdminClient(this, authenticationDetailsProvider, executorService);
        }
    }

    @Override
    public void setRegion(com.oracle.bmc.Region region) {
        super.setRegion(region);
    }

    @Override
    public void setRegion(String regionId) {
        super.setRegion(regionId);
    }

    @Override
    public ChangeQueueCompartmentResponse changeQueueCompartment(
            ChangeQueueCompartmentRequest request) {

        Validate.notBlank(request.getQueueId(), "queueId must not be blank");
        Objects.requireNonNull(
                request.getChangeQueueCompartmentDetails(),
                "changeQueueCompartmentDetails is required");

        return clientCall(request, ChangeQueueCompartmentResponse::builder)
                .logger(LOG, "changeQueueCompartment")
                .serviceDetails(
                        "QueueAdmin",
                        "ChangeQueueCompartment",
                        "https://docs.oracle.com/iaas/api/#/en/queue/20210201/Queue/ChangeQueueCompartment")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(ChangeQueueCompartmentRequest::builder)
                .basePath("/20210201")
                .appendPathParam("queues")
                .appendPathParam(request.getQueueId())
                .appendPathParam("actions")
                .appendPathParam("changeCompartment")
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .hasBody()
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        ChangeQueueCompartmentResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", ChangeQueueCompartmentResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public CreateConsumerGroupResponse createConsumerGroup(CreateConsumerGroupRequest request) {
        Objects.requireNonNull(
                request.getCreateConsumerGroupDetails(), "createConsumerGroupDetails is required");

        return clientCall(request, CreateConsumerGroupResponse::builder)
                .logger(LOG, "createConsumerGroup")
                .serviceDetails(
                        "QueueAdmin",
                        "CreateConsumerGroup",
                        "https://docs.oracle.com/iaas/api/#/en/queue/20210201/ConsumerGroup/CreateConsumerGroup")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(CreateConsumerGroupRequest::builder)
                .basePath("/20210201")
                .appendPathParam("consumerGroups")
                .accept("application/json")
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .hasBody()
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        CreateConsumerGroupResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", CreateConsumerGroupResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public CreateQueueResponse createQueue(CreateQueueRequest request) {
        Objects.requireNonNull(request.getCreateQueueDetails(), "createQueueDetails is required");

        return clientCall(request, CreateQueueResponse::builder)
                .logger(LOG, "createQueue")
                .serviceDetails(
                        "QueueAdmin",
                        "CreateQueue",
                        "https://docs.oracle.com/iaas/api/#/en/queue/20210201/Queue/CreateQueue")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(CreateQueueRequest::builder)
                .basePath("/20210201")
                .appendPathParam("queues")
                .accept("application/json")
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .hasBody()
                .handleResponseHeaderString(
                        "opc-work-request-id", CreateQueueResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", CreateQueueResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public DeleteConsumerGroupResponse deleteConsumerGroup(DeleteConsumerGroupRequest request) {

        Validate.notBlank(request.getConsumerGroupId(), "consumerGroupId must not be blank");

        return clientCall(request, DeleteConsumerGroupResponse::builder)
                .logger(LOG, "deleteConsumerGroup")
                .serviceDetails(
                        "QueueAdmin",
                        "DeleteConsumerGroup",
                        "https://docs.oracle.com/iaas/api/#/en/queue/20210201/ConsumerGroup/DeleteConsumerGroup")
                .method(com.oracle.bmc.http.client.Method.DELETE)
                .requestBuilder(DeleteConsumerGroupRequest::builder)
                .basePath("/20210201")
                .appendPathParam("consumerGroups")
                .appendPathParam(request.getConsumerGroupId())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        DeleteConsumerGroupResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", DeleteConsumerGroupResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public DeleteQueueResponse deleteQueue(DeleteQueueRequest request) {

        Validate.notBlank(request.getQueueId(), "queueId must not be blank");

        return clientCall(request, DeleteQueueResponse::builder)
                .logger(LOG, "deleteQueue")
                .serviceDetails(
                        "QueueAdmin",
                        "DeleteQueue",
                        "https://docs.oracle.com/iaas/api/#/en/queue/20210201/Queue/DeleteQueue")
                .method(com.oracle.bmc.http.client.Method.DELETE)
                .requestBuilder(DeleteQueueRequest::builder)
                .basePath("/20210201")
                .appendPathParam("queues")
                .appendPathParam(request.getQueueId())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .handleResponseHeaderString(
                        "opc-work-request-id", DeleteQueueResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", DeleteQueueResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public GetConsumerGroupResponse getConsumerGroup(GetConsumerGroupRequest request) {

        Validate.notBlank(request.getConsumerGroupId(), "consumerGroupId must not be blank");

        return clientCall(request, GetConsumerGroupResponse::builder)
                .logger(LOG, "getConsumerGroup")
                .serviceDetails(
                        "QueueAdmin",
                        "GetConsumerGroup",
                        "https://docs.oracle.com/iaas/api/#/en/queue/20210201/ConsumerGroup/GetConsumerGroup")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetConsumerGroupRequest::builder)
                .basePath("/20210201")
                .appendPathParam("consumerGroups")
                .appendPathParam(request.getConsumerGroupId())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .handleBody(
                        com.oracle.bmc.queue.model.ConsumerGroup.class,
                        GetConsumerGroupResponse.Builder::consumerGroup)
                .handleResponseHeaderString("etag", GetConsumerGroupResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", GetConsumerGroupResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public GetQueueResponse getQueue(GetQueueRequest request) {

        Validate.notBlank(request.getQueueId(), "queueId must not be blank");

        return clientCall(request, GetQueueResponse::builder)
                .logger(LOG, "getQueue")
                .serviceDetails(
                        "QueueAdmin",
                        "GetQueue",
                        "https://docs.oracle.com/iaas/api/#/en/queue/20210201/Queue/GetQueue")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetQueueRequest::builder)
                .basePath("/20210201")
                .appendPathParam("queues")
                .appendPathParam(request.getQueueId())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .handleBody(com.oracle.bmc.queue.model.Queue.class, GetQueueResponse.Builder::queue)
                .handleResponseHeaderString("etag", GetQueueResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", GetQueueResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public GetWorkRequestResponse getWorkRequest(GetWorkRequestRequest request) {

        Validate.notBlank(request.getWorkRequestId(), "workRequestId must not be blank");

        return clientCall(request, GetWorkRequestResponse::builder)
                .logger(LOG, "getWorkRequest")
                .serviceDetails(
                        "QueueAdmin",
                        "GetWorkRequest",
                        "https://docs.oracle.com/iaas/api/#/en/queue/20210201/WorkRequest/GetWorkRequest")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetWorkRequestRequest::builder)
                .basePath("/20210201")
                .appendPathParam("workRequests")
                .appendPathParam(request.getWorkRequestId())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .handleBody(
                        com.oracle.bmc.queue.model.WorkRequest.class,
                        GetWorkRequestResponse.Builder::workRequest)
                .handleResponseHeaderString(
                        "opc-request-id", GetWorkRequestResponse.Builder::opcRequestId)
                .handleResponseHeaderInteger(
                        "retry-after", GetWorkRequestResponse.Builder::retryAfter)
                .callSync();
    }

    @Override
    public ListConsumerGroupsResponse listConsumerGroups(ListConsumerGroupsRequest request) {

        return clientCall(request, ListConsumerGroupsResponse::builder)
                .logger(LOG, "listConsumerGroups")
                .serviceDetails(
                        "QueueAdmin",
                        "ListConsumerGroups",
                        "https://docs.oracle.com/iaas/api/#/en/queue/20210201/ConsumerGroupCollection/ListConsumerGroups")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListConsumerGroupsRequest::builder)
                .basePath("/20210201")
                .appendPathParam("consumerGroups")
                .appendEnumQueryParam("lifecycleState", request.getLifecycleState())
                .appendQueryParam("displayName", request.getDisplayName())
                .appendQueryParam("id", request.getId())
                .appendQueryParam("queueId", request.getQueueId())
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .handleBody(
                        com.oracle.bmc.queue.model.ConsumerGroupCollection.class,
                        ListConsumerGroupsResponse.Builder::consumerGroupCollection)
                .handleResponseHeaderString(
                        "opc-request-id", ListConsumerGroupsResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListConsumerGroupsResponse.Builder::opcNextPage)
                .callSync();
    }

    @Override
    public ListQueuesResponse listQueues(ListQueuesRequest request) {

        return clientCall(request, ListQueuesResponse::builder)
                .logger(LOG, "listQueues")
                .serviceDetails(
                        "QueueAdmin",
                        "ListQueues",
                        "https://docs.oracle.com/iaas/api/#/en/queue/20210201/QueueCollection/ListQueues")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListQueuesRequest::builder)
                .basePath("/20210201")
                .appendPathParam("queues")
                .appendQueryParam("compartmentId", request.getCompartmentId())
                .appendEnumQueryParam("lifecycleState", request.getLifecycleState())
                .appendQueryParam("displayName", request.getDisplayName())
                .appendQueryParam("id", request.getId())
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .handleBody(
                        com.oracle.bmc.queue.model.QueueCollection.class,
                        ListQueuesResponse.Builder::queueCollection)
                .handleResponseHeaderString(
                        "opc-request-id", ListQueuesResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListQueuesResponse.Builder::opcNextPage)
                .callSync();
    }

    @Override
    public ListWorkRequestErrorsResponse listWorkRequestErrors(
            ListWorkRequestErrorsRequest request) {

        Validate.notBlank(request.getWorkRequestId(), "workRequestId must not be blank");

        return clientCall(request, ListWorkRequestErrorsResponse::builder)
                .logger(LOG, "listWorkRequestErrors")
                .serviceDetails(
                        "QueueAdmin",
                        "ListWorkRequestErrors",
                        "https://docs.oracle.com/iaas/api/#/en/queue/20210201/WorkRequestErrorCollection/ListWorkRequestErrors")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListWorkRequestErrorsRequest::builder)
                .basePath("/20210201")
                .appendPathParam("workRequests")
                .appendPathParam(request.getWorkRequestId())
                .appendPathParam("errors")
                .appendQueryParam("page", request.getPage())
                .appendQueryParam("limit", request.getLimit())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .handleBody(
                        com.oracle.bmc.queue.model.WorkRequestErrorCollection.class,
                        ListWorkRequestErrorsResponse.Builder::workRequestErrorCollection)
                .handleResponseHeaderString(
                        "opc-next-page", ListWorkRequestErrorsResponse.Builder::opcNextPage)
                .handleResponseHeaderString(
                        "opc-request-id", ListWorkRequestErrorsResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public ListWorkRequestLogsResponse listWorkRequestLogs(ListWorkRequestLogsRequest request) {

        Validate.notBlank(request.getWorkRequestId(), "workRequestId must not be blank");

        return clientCall(request, ListWorkRequestLogsResponse::builder)
                .logger(LOG, "listWorkRequestLogs")
                .serviceDetails(
                        "QueueAdmin",
                        "ListWorkRequestLogs",
                        "https://docs.oracle.com/iaas/api/#/en/queue/20210201/WorkRequestLogEntryCollection/ListWorkRequestLogs")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListWorkRequestLogsRequest::builder)
                .basePath("/20210201")
                .appendPathParam("workRequests")
                .appendPathParam(request.getWorkRequestId())
                .appendPathParam("logs")
                .appendQueryParam("page", request.getPage())
                .appendQueryParam("limit", request.getLimit())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .handleBody(
                        com.oracle.bmc.queue.model.WorkRequestLogEntryCollection.class,
                        ListWorkRequestLogsResponse.Builder::workRequestLogEntryCollection)
                .handleResponseHeaderString(
                        "opc-next-page", ListWorkRequestLogsResponse.Builder::opcNextPage)
                .handleResponseHeaderString(
                        "opc-request-id", ListWorkRequestLogsResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public ListWorkRequestsResponse listWorkRequests(ListWorkRequestsRequest request) {

        return clientCall(request, ListWorkRequestsResponse::builder)
                .logger(LOG, "listWorkRequests")
                .serviceDetails(
                        "QueueAdmin",
                        "ListWorkRequests",
                        "https://docs.oracle.com/iaas/api/#/en/queue/20210201/WorkRequestSummaryCollection/ListWorkRequests")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListWorkRequestsRequest::builder)
                .basePath("/20210201")
                .appendPathParam("workRequests")
                .appendQueryParam("compartmentId", request.getCompartmentId())
                .appendQueryParam("workRequestId", request.getWorkRequestId())
                .appendQueryParam("page", request.getPage())
                .appendQueryParam("limit", request.getLimit())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .handleBody(
                        com.oracle.bmc.queue.model.WorkRequestSummaryCollection.class,
                        ListWorkRequestsResponse.Builder::workRequestSummaryCollection)
                .handleResponseHeaderString(
                        "opc-request-id", ListWorkRequestsResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListWorkRequestsResponse.Builder::opcNextPage)
                .callSync();
    }

    @Override
    public PurgeQueueResponse purgeQueue(PurgeQueueRequest request) {

        Validate.notBlank(request.getQueueId(), "queueId must not be blank");
        Objects.requireNonNull(request.getPurgeQueueDetails(), "purgeQueueDetails is required");

        return clientCall(request, PurgeQueueResponse::builder)
                .logger(LOG, "purgeQueue")
                .serviceDetails(
                        "QueueAdmin",
                        "PurgeQueue",
                        "https://docs.oracle.com/iaas/api/#/en/queue/20210201/Queue/PurgeQueue")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(PurgeQueueRequest::builder)
                .basePath("/20210201")
                .appendPathParam("queues")
                .appendPathParam(request.getQueueId())
                .appendPathParam("actions")
                .appendPathParam("purge")
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .hasBody()
                .handleResponseHeaderString(
                        "opc-work-request-id", PurgeQueueResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", PurgeQueueResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public UpdateConsumerGroupResponse updateConsumerGroup(UpdateConsumerGroupRequest request) {

        Validate.notBlank(request.getConsumerGroupId(), "consumerGroupId must not be blank");
        Objects.requireNonNull(
                request.getUpdateConsumerGroupDetails(), "updateConsumerGroupDetails is required");

        return clientCall(request, UpdateConsumerGroupResponse::builder)
                .logger(LOG, "updateConsumerGroup")
                .serviceDetails(
                        "QueueAdmin",
                        "UpdateConsumerGroup",
                        "https://docs.oracle.com/iaas/api/#/en/queue/20210201/ConsumerGroup/UpdateConsumerGroup")
                .method(com.oracle.bmc.http.client.Method.PUT)
                .requestBuilder(UpdateConsumerGroupRequest::builder)
                .basePath("/20210201")
                .appendPathParam("consumerGroups")
                .appendPathParam(request.getConsumerGroupId())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .hasBody()
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        UpdateConsumerGroupResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", UpdateConsumerGroupResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public UpdateQueueResponse updateQueue(UpdateQueueRequest request) {

        Validate.notBlank(request.getQueueId(), "queueId must not be blank");
        Objects.requireNonNull(request.getUpdateQueueDetails(), "updateQueueDetails is required");

        return clientCall(request, UpdateQueueResponse::builder)
                .logger(LOG, "updateQueue")
                .serviceDetails(
                        "QueueAdmin",
                        "UpdateQueue",
                        "https://docs.oracle.com/iaas/api/#/en/queue/20210201/Queue/UpdateQueue")
                .method(com.oracle.bmc.http.client.Method.PUT)
                .requestBuilder(UpdateQueueRequest::builder)
                .basePath("/20210201")
                .appendPathParam("queues")
                .appendPathParam(request.getQueueId())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .hasBody()
                .handleResponseHeaderString(
                        "opc-work-request-id", UpdateQueueResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", UpdateQueueResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public QueueAdminWaiters getWaiters() {
        return waiters;
    }

    @Override
    public QueueAdminPaginators getPaginators() {
        return paginators;
    }

    /**
     * Create a new client instance.
     *
     * @param authenticationDetailsProvider The authentication details (see {@link Builder#build})
     * @deprecated Use the {@link #builder() builder} instead.
     */
    @Deprecated
    public QueueAdminClient(
            com.oracle.bmc.auth.BasicAuthenticationDetailsProvider authenticationDetailsProvider) {
        this(builder(), authenticationDetailsProvider, null);
    }

    /**
     * Create a new client instance.
     *
     * @param authenticationDetailsProvider The authentication details (see {@link Builder#build})
     * @param configuration {@link Builder#configuration}
     * @deprecated Use the {@link #builder() builder} instead.
     */
    @Deprecated
    public QueueAdminClient(
            com.oracle.bmc.auth.BasicAuthenticationDetailsProvider authenticationDetailsProvider,
            com.oracle.bmc.ClientConfiguration configuration) {
        this(builder().configuration(configuration), authenticationDetailsProvider, null);
    }

    /**
     * Create a new client instance.
     *
     * @param authenticationDetailsProvider The authentication details (see {@link Builder#build})
     * @param configuration {@link Builder#configuration}
     * @param clientConfigurator {@link Builder#clientConfigurator}
     * @deprecated Use the {@link #builder() builder} instead.
     */
    @Deprecated
    public QueueAdminClient(
            com.oracle.bmc.auth.BasicAuthenticationDetailsProvider authenticationDetailsProvider,
            com.oracle.bmc.ClientConfiguration configuration,
            com.oracle.bmc.http.ClientConfigurator clientConfigurator) {
        this(
                builder().configuration(configuration).clientConfigurator(clientConfigurator),
                authenticationDetailsProvider,
                null);
    }

    /**
     * Create a new client instance.
     *
     * @param authenticationDetailsProvider The authentication details (see {@link Builder#build})
     * @param configuration {@link Builder#configuration}
     * @param clientConfigurator {@link Builder#clientConfigurator}
     * @param defaultRequestSignerFactory {@link Builder#requestSignerFactory}
     * @deprecated Use the {@link #builder() builder} instead.
     */
    @Deprecated
    public QueueAdminClient(
            com.oracle.bmc.auth.AbstractAuthenticationDetailsProvider authenticationDetailsProvider,
            com.oracle.bmc.ClientConfiguration configuration,
            com.oracle.bmc.http.ClientConfigurator clientConfigurator,
            com.oracle.bmc.http.signing.RequestSignerFactory defaultRequestSignerFactory) {
        this(
                builder()
                        .configuration(configuration)
                        .clientConfigurator(clientConfigurator)
                        .requestSignerFactory(defaultRequestSignerFactory),
                authenticationDetailsProvider,
                null);
    }

    /**
     * Create a new client instance.
     *
     * @param authenticationDetailsProvider The authentication details (see {@link Builder#build})
     * @param configuration {@link Builder#configuration}
     * @param clientConfigurator {@link Builder#clientConfigurator}
     * @param defaultRequestSignerFactory {@link Builder#requestSignerFactory}
     * @param additionalClientConfigurators {@link Builder#additionalClientConfigurators}
     * @deprecated Use the {@link #builder() builder} instead.
     */
    @Deprecated
    public QueueAdminClient(
            com.oracle.bmc.auth.AbstractAuthenticationDetailsProvider authenticationDetailsProvider,
            com.oracle.bmc.ClientConfiguration configuration,
            com.oracle.bmc.http.ClientConfigurator clientConfigurator,
            com.oracle.bmc.http.signing.RequestSignerFactory defaultRequestSignerFactory,
            java.util.List<com.oracle.bmc.http.ClientConfigurator> additionalClientConfigurators) {
        this(
                builder()
                        .configuration(configuration)
                        .clientConfigurator(clientConfigurator)
                        .requestSignerFactory(defaultRequestSignerFactory)
                        .additionalClientConfigurators(additionalClientConfigurators),
                authenticationDetailsProvider,
                null);
    }

    /**
     * Create a new client instance.
     *
     * @param authenticationDetailsProvider The authentication details (see {@link Builder#build})
     * @param configuration {@link Builder#configuration}
     * @param clientConfigurator {@link Builder#clientConfigurator}
     * @param defaultRequestSignerFactory {@link Builder#requestSignerFactory}
     * @param additionalClientConfigurators {@link Builder#additionalClientConfigurators}
     * @param endpoint {@link Builder#endpoint}
     * @deprecated Use the {@link #builder() builder} instead.
     */
    @Deprecated
    public QueueAdminClient(
            com.oracle.bmc.auth.AbstractAuthenticationDetailsProvider authenticationDetailsProvider,
            com.oracle.bmc.ClientConfiguration configuration,
            com.oracle.bmc.http.ClientConfigurator clientConfigurator,
            com.oracle.bmc.http.signing.RequestSignerFactory defaultRequestSignerFactory,
            java.util.List<com.oracle.bmc.http.ClientConfigurator> additionalClientConfigurators,
            String endpoint) {
        this(
                builder()
                        .configuration(configuration)
                        .clientConfigurator(clientConfigurator)
                        .requestSignerFactory(defaultRequestSignerFactory)
                        .additionalClientConfigurators(additionalClientConfigurators)
                        .endpoint(endpoint),
                authenticationDetailsProvider,
                null);
    }

    /**
     * Create a new client instance.
     *
     * @param authenticationDetailsProvider The authentication details (see {@link Builder#build})
     * @param configuration {@link Builder#configuration}
     * @param clientConfigurator {@link Builder#clientConfigurator}
     * @param defaultRequestSignerFactory {@link Builder#requestSignerFactory}
     * @param additionalClientConfigurators {@link Builder#additionalClientConfigurators}
     * @param endpoint {@link Builder#endpoint}
     * @param signingStrategyRequestSignerFactories {@link
     *     Builder#signingStrategyRequestSignerFactories}
     * @deprecated Use the {@link #builder() builder} instead.
     */
    @Deprecated
    public QueueAdminClient(
            com.oracle.bmc.auth.AbstractAuthenticationDetailsProvider authenticationDetailsProvider,
            com.oracle.bmc.ClientConfiguration configuration,
            com.oracle.bmc.http.ClientConfigurator clientConfigurator,
            com.oracle.bmc.http.signing.RequestSignerFactory defaultRequestSignerFactory,
            java.util.Map<
                            com.oracle.bmc.http.signing.SigningStrategy,
                            com.oracle.bmc.http.signing.RequestSignerFactory>
                    signingStrategyRequestSignerFactories,
            java.util.List<com.oracle.bmc.http.ClientConfigurator> additionalClientConfigurators,
            String endpoint) {
        this(
                builder()
                        .configuration(configuration)
                        .clientConfigurator(clientConfigurator)
                        .requestSignerFactory(defaultRequestSignerFactory)
                        .additionalClientConfigurators(additionalClientConfigurators)
                        .endpoint(endpoint)
                        .signingStrategyRequestSignerFactories(
                                signingStrategyRequestSignerFactories),
                authenticationDetailsProvider,
                null);
    }

    /**
     * Create a new client instance.
     *
     * @param authenticationDetailsProvider The authentication details (see {@link Builder#build})
     * @param configuration {@link Builder#configuration}
     * @param clientConfigurator {@link Builder#clientConfigurator}
     * @param defaultRequestSignerFactory {@link Builder#requestSignerFactory}
     * @param additionalClientConfigurators {@link Builder#additionalClientConfigurators}
     * @param endpoint {@link Builder#endpoint}
     * @param signingStrategyRequestSignerFactories {@link
     *     Builder#signingStrategyRequestSignerFactories}
     * @param executorService {@link Builder#executorService}
     * @deprecated Use the {@link #builder() builder} instead.
     */
    @Deprecated
    public QueueAdminClient(
            com.oracle.bmc.auth.AbstractAuthenticationDetailsProvider authenticationDetailsProvider,
            com.oracle.bmc.ClientConfiguration configuration,
            com.oracle.bmc.http.ClientConfigurator clientConfigurator,
            com.oracle.bmc.http.signing.RequestSignerFactory defaultRequestSignerFactory,
            java.util.Map<
                            com.oracle.bmc.http.signing.SigningStrategy,
                            com.oracle.bmc.http.signing.RequestSignerFactory>
                    signingStrategyRequestSignerFactories,
            java.util.List<com.oracle.bmc.http.ClientConfigurator> additionalClientConfigurators,
            String endpoint,
            java.util.concurrent.ExecutorService executorService) {
        this(
                builder()
                        .configuration(configuration)
                        .clientConfigurator(clientConfigurator)
                        .requestSignerFactory(defaultRequestSignerFactory)
                        .additionalClientConfigurators(additionalClientConfigurators)
                        .endpoint(endpoint)
                        .signingStrategyRequestSignerFactories(
                                signingStrategyRequestSignerFactories),
                authenticationDetailsProvider,
                executorService);
    }
}
