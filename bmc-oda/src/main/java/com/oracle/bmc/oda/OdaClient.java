/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.oda;

import com.oracle.bmc.util.internal.Validate;
import com.oracle.bmc.oda.requests.*;
import com.oracle.bmc.oda.responses.*;
import com.oracle.bmc.circuitbreaker.CircuitBreakerConfiguration;
import com.oracle.bmc.util.CircuitBreakerUtils;

import java.util.Objects;

@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20190506")
public class OdaClient extends com.oracle.bmc.http.internal.BaseSyncClient implements Oda {
    /** Service instance for Oda. */
    public static final com.oracle.bmc.Service SERVICE =
            com.oracle.bmc.Services.serviceBuilder()
                    .serviceName("ODA")
                    .serviceEndpointPrefix("")
                    .serviceEndpointTemplate(
                            "https://digitalassistant-api.{region}.oci.{secondLevelDomain}")
                    .build();

    private static final org.slf4j.Logger LOG = org.slf4j.LoggerFactory.getLogger(OdaClient.class);

    private final OdaWaiters waiters;

    private final OdaPaginators paginators;

    private OdaClient(
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
                                    .nameFormat("Oda-waiters-%d")
                                    .build());
            threadPoolExecutor.allowCoreThreadTimeOut(true);

            executorService = threadPoolExecutor;
        }
        this.waiters = new OdaWaiters(executorService, this);

        this.paginators = new OdaPaginators(this);
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
            extends com.oracle.bmc.common.RegionalClientBuilder<Builder, OdaClient> {
        private java.util.concurrent.ExecutorService executorService;

        private Builder(com.oracle.bmc.Service service) {
            super(service);
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
        public OdaClient build(
                @jakarta.annotation.Nonnull
                        com.oracle.bmc.auth.AbstractAuthenticationDetailsProvider
                                authenticationDetailsProvider) {
            return new OdaClient(this, authenticationDetailsProvider, executorService);
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
    public ChangeOdaInstanceCompartmentResponse changeOdaInstanceCompartment(
            ChangeOdaInstanceCompartmentRequest request) {

        Validate.notBlank(request.getOdaInstanceId(), "odaInstanceId must not be blank");
        Objects.requireNonNull(
                request.getChangeOdaInstanceCompartmentDetails(),
                "changeOdaInstanceCompartmentDetails is required");

        return clientCall(request, ChangeOdaInstanceCompartmentResponse::builder)
                .logger(LOG, "changeOdaInstanceCompartment")
                .serviceDetails(
                        "Oda",
                        "ChangeOdaInstanceCompartment",
                        "https://docs.oracle.com/iaas/api/#/en/digital-assistant/20190506/OdaInstance/ChangeOdaInstanceCompartment")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(ChangeOdaInstanceCompartmentRequest::builder)
                .basePath("/20190506")
                .appendPathParam("odaInstances")
                .appendPathParam(request.getOdaInstanceId())
                .appendPathParam("actions")
                .appendPathParam("changeCompartment")
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .hasBody()
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        ChangeOdaInstanceCompartmentResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id",
                        ChangeOdaInstanceCompartmentResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public CreateOdaInstanceResponse createOdaInstance(CreateOdaInstanceRequest request) {
        Objects.requireNonNull(
                request.getCreateOdaInstanceDetails(), "createOdaInstanceDetails is required");

        return clientCall(request, CreateOdaInstanceResponse::builder)
                .logger(LOG, "createOdaInstance")
                .serviceDetails("Oda", "CreateOdaInstance", "")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(CreateOdaInstanceRequest::builder)
                .basePath("/20190506")
                .appendPathParam("odaInstances")
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.oda.model.OdaInstance.class,
                        CreateOdaInstanceResponse.Builder::odaInstance)
                .handleResponseHeaderString("Location", CreateOdaInstanceResponse.Builder::location)
                .handleResponseHeaderString("etag", CreateOdaInstanceResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-work-request-id", CreateOdaInstanceResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", CreateOdaInstanceResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public CreateOdaInstanceAttachmentResponse createOdaInstanceAttachment(
            CreateOdaInstanceAttachmentRequest request) {

        Validate.notBlank(request.getOdaInstanceId(), "odaInstanceId must not be blank");
        Objects.requireNonNull(
                request.getCreateOdaInstanceAttachmentDetails(),
                "createOdaInstanceAttachmentDetails is required");

        return clientCall(request, CreateOdaInstanceAttachmentResponse::builder)
                .logger(LOG, "createOdaInstanceAttachment")
                .serviceDetails(
                        "Oda",
                        "CreateOdaInstanceAttachment",
                        "https://docs.oracle.com/iaas/api/#/en/digital-assistant/20190506/OdaInstanceAttachment/CreateOdaInstanceAttachment")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(CreateOdaInstanceAttachmentRequest::builder)
                .basePath("/20190506")
                .appendPathParam("odaInstances")
                .appendPathParam(request.getOdaInstanceId())
                .appendPathParam("attachments")
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .hasBody()
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        CreateOdaInstanceAttachmentResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", CreateOdaInstanceAttachmentResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public DeleteOdaInstanceResponse deleteOdaInstance(DeleteOdaInstanceRequest request) {

        Validate.notBlank(request.getOdaInstanceId(), "odaInstanceId must not be blank");

        return clientCall(request, DeleteOdaInstanceResponse::builder)
                .logger(LOG, "deleteOdaInstance")
                .serviceDetails(
                        "Oda",
                        "DeleteOdaInstance",
                        "https://docs.oracle.com/iaas/api/#/en/digital-assistant/20190506/OdaInstance/DeleteOdaInstance")
                .method(com.oracle.bmc.http.client.Method.DELETE)
                .requestBuilder(DeleteOdaInstanceRequest::builder)
                .basePath("/20190506")
                .appendPathParam("odaInstances")
                .appendPathParam(request.getOdaInstanceId())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleResponseHeaderString(
                        "opc-work-request-id", DeleteOdaInstanceResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", DeleteOdaInstanceResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public DeleteOdaInstanceAttachmentResponse deleteOdaInstanceAttachment(
            DeleteOdaInstanceAttachmentRequest request) {

        Validate.notBlank(request.getOdaInstanceId(), "odaInstanceId must not be blank");

        Validate.notBlank(request.getAttachmentId(), "attachmentId must not be blank");

        return clientCall(request, DeleteOdaInstanceAttachmentResponse::builder)
                .logger(LOG, "deleteOdaInstanceAttachment")
                .serviceDetails(
                        "Oda",
                        "DeleteOdaInstanceAttachment",
                        "https://docs.oracle.com/iaas/api/#/en/digital-assistant/20190506/OdaInstanceAttachment/DeleteOdaInstanceAttachment")
                .method(com.oracle.bmc.http.client.Method.DELETE)
                .requestBuilder(DeleteOdaInstanceAttachmentRequest::builder)
                .basePath("/20190506")
                .appendPathParam("odaInstances")
                .appendPathParam(request.getOdaInstanceId())
                .appendPathParam("attachments")
                .appendPathParam(request.getAttachmentId())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        DeleteOdaInstanceAttachmentResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", DeleteOdaInstanceAttachmentResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public GetOdaInstanceResponse getOdaInstance(GetOdaInstanceRequest request) {

        Validate.notBlank(request.getOdaInstanceId(), "odaInstanceId must not be blank");

        return clientCall(request, GetOdaInstanceResponse::builder)
                .logger(LOG, "getOdaInstance")
                .serviceDetails(
                        "Oda",
                        "GetOdaInstance",
                        "https://docs.oracle.com/iaas/api/#/en/digital-assistant/20190506/OdaInstance/GetOdaInstance")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetOdaInstanceRequest::builder)
                .basePath("/20190506")
                .appendPathParam("odaInstances")
                .appendPathParam(request.getOdaInstanceId())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.oda.model.OdaInstance.class,
                        GetOdaInstanceResponse.Builder::odaInstance)
                .handleResponseHeaderString("etag", GetOdaInstanceResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", GetOdaInstanceResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public GetOdaInstanceAttachmentResponse getOdaInstanceAttachment(
            GetOdaInstanceAttachmentRequest request) {

        Validate.notBlank(request.getOdaInstanceId(), "odaInstanceId must not be blank");

        Validate.notBlank(request.getAttachmentId(), "attachmentId must not be blank");

        return clientCall(request, GetOdaInstanceAttachmentResponse::builder)
                .logger(LOG, "getOdaInstanceAttachment")
                .serviceDetails(
                        "Oda",
                        "GetOdaInstanceAttachment",
                        "https://docs.oracle.com/iaas/api/#/en/digital-assistant/20190506/OdaInstanceAttachment/GetOdaInstanceAttachment")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetOdaInstanceAttachmentRequest::builder)
                .basePath("/20190506")
                .appendPathParam("odaInstances")
                .appendPathParam(request.getOdaInstanceId())
                .appendPathParam("attachments")
                .appendPathParam(request.getAttachmentId())
                .appendQueryParam("includeOwnerMetadata", request.getIncludeOwnerMetadata())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.oda.model.OdaInstanceAttachment.class,
                        GetOdaInstanceAttachmentResponse.Builder::odaInstanceAttachment)
                .handleResponseHeaderString("etag", GetOdaInstanceAttachmentResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", GetOdaInstanceAttachmentResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public GetWorkRequestResponse getWorkRequest(GetWorkRequestRequest request) {

        Validate.notBlank(request.getWorkRequestId(), "workRequestId must not be blank");

        return clientCall(request, GetWorkRequestResponse::builder)
                .logger(LOG, "getWorkRequest")
                .serviceDetails(
                        "Oda",
                        "GetWorkRequest",
                        "https://docs.oracle.com/iaas/api/#/en/digital-assistant/20190506/WorkRequest/GetWorkRequest")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetWorkRequestRequest::builder)
                .basePath("/20190506")
                .appendPathParam("workRequests")
                .appendPathParam(request.getWorkRequestId())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.oda.model.WorkRequest.class,
                        GetWorkRequestResponse.Builder::workRequest)
                .handleResponseHeaderString(
                        "opc-request-id", GetWorkRequestResponse.Builder::opcRequestId)
                .handleResponseHeaderInteger(
                        "retry-after", GetWorkRequestResponse.Builder::retryAfter)
                .callSync();
    }

    @Override
    public ListOdaInstanceAttachmentsResponse listOdaInstanceAttachments(
            ListOdaInstanceAttachmentsRequest request) {

        Validate.notBlank(request.getOdaInstanceId(), "odaInstanceId must not be blank");

        return clientCall(request, ListOdaInstanceAttachmentsResponse::builder)
                .logger(LOG, "listOdaInstanceAttachments")
                .serviceDetails(
                        "Oda",
                        "ListOdaInstanceAttachments",
                        "https://docs.oracle.com/iaas/api/#/en/digital-assistant/20190506/OdaInstanceAttachmentCollection/ListOdaInstanceAttachments")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListOdaInstanceAttachmentsRequest::builder)
                .basePath("/20190506")
                .appendPathParam("odaInstances")
                .appendPathParam(request.getOdaInstanceId())
                .appendPathParam("attachments")
                .appendQueryParam("includeOwnerMetadata", request.getIncludeOwnerMetadata())
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .appendEnumQueryParam("lifecycleState", request.getLifecycleState())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.oda.model.OdaInstanceAttachmentCollection.class,
                        ListOdaInstanceAttachmentsResponse.Builder::odaInstanceAttachmentCollection)
                .handleResponseHeaderString(
                        "opc-request-id", ListOdaInstanceAttachmentsResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListOdaInstanceAttachmentsResponse.Builder::opcNextPage)
                .handleResponseHeaderInteger(
                        "opc-total-items",
                        ListOdaInstanceAttachmentsResponse.Builder::opcTotalItems)
                .callSync();
    }

    @Override
    public ListOdaInstancesResponse listOdaInstances(ListOdaInstancesRequest request) {
        Objects.requireNonNull(request.getCompartmentId(), "compartmentId is required");

        return clientCall(request, ListOdaInstancesResponse::builder)
                .logger(LOG, "listOdaInstances")
                .serviceDetails(
                        "Oda",
                        "ListOdaInstances",
                        "https://docs.oracle.com/iaas/api/#/en/digital-assistant/20190506/OdaInstanceSummary/ListOdaInstances")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListOdaInstancesRequest::builder)
                .basePath("/20190506")
                .appendPathParam("odaInstances")
                .appendQueryParam("compartmentId", request.getCompartmentId())
                .appendQueryParam("displayName", request.getDisplayName())
                .appendEnumQueryParam("lifecycleState", request.getLifecycleState())
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBodyList(
                        com.oracle.bmc.oda.model.OdaInstanceSummary.class,
                        ListOdaInstancesResponse.Builder::items)
                .handleResponseHeaderString(
                        "opc-request-id", ListOdaInstancesResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListOdaInstancesResponse.Builder::opcNextPage)
                .handleResponseHeaderInteger(
                        "opc-total-items", ListOdaInstancesResponse.Builder::opcTotalItems)
                .callSync();
    }

    @Override
    public ListWorkRequestErrorsResponse listWorkRequestErrors(
            ListWorkRequestErrorsRequest request) {

        Validate.notBlank(request.getWorkRequestId(), "workRequestId must not be blank");

        return clientCall(request, ListWorkRequestErrorsResponse::builder)
                .logger(LOG, "listWorkRequestErrors")
                .serviceDetails(
                        "Oda",
                        "ListWorkRequestErrors",
                        "https://docs.oracle.com/iaas/api/#/en/digital-assistant/20190506/WorkRequestError/ListWorkRequestErrors")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListWorkRequestErrorsRequest::builder)
                .basePath("/20190506")
                .appendPathParam("workRequests")
                .appendPathParam(request.getWorkRequestId())
                .appendPathParam("errors")
                .appendQueryParam("page", request.getPage())
                .appendQueryParam("limit", request.getLimit())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBodyList(
                        com.oracle.bmc.oda.model.WorkRequestError.class,
                        ListWorkRequestErrorsResponse.Builder::items)
                .handleResponseHeaderString(
                        "opc-request-id", ListWorkRequestErrorsResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListWorkRequestErrorsResponse.Builder::opcNextPage)
                .handleResponseHeaderInteger(
                        "opc-total-items", ListWorkRequestErrorsResponse.Builder::opcTotalItems)
                .callSync();
    }

    @Override
    public ListWorkRequestLogsResponse listWorkRequestLogs(ListWorkRequestLogsRequest request) {

        Validate.notBlank(request.getWorkRequestId(), "workRequestId must not be blank");

        return clientCall(request, ListWorkRequestLogsResponse::builder)
                .logger(LOG, "listWorkRequestLogs")
                .serviceDetails(
                        "Oda",
                        "ListWorkRequestLogs",
                        "https://docs.oracle.com/iaas/api/#/en/digital-assistant/20190506/WorkRequestLogEntry/ListWorkRequestLogs")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListWorkRequestLogsRequest::builder)
                .basePath("/20190506")
                .appendPathParam("workRequests")
                .appendPathParam(request.getWorkRequestId())
                .appendPathParam("logs")
                .appendQueryParam("page", request.getPage())
                .appendQueryParam("limit", request.getLimit())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBodyList(
                        com.oracle.bmc.oda.model.WorkRequestLogEntry.class,
                        ListWorkRequestLogsResponse.Builder::items)
                .handleResponseHeaderString(
                        "opc-request-id", ListWorkRequestLogsResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListWorkRequestLogsResponse.Builder::opcNextPage)
                .handleResponseHeaderInteger(
                        "opc-total-items", ListWorkRequestLogsResponse.Builder::opcTotalItems)
                .callSync();
    }

    @Override
    public ListWorkRequestsResponse listWorkRequests(ListWorkRequestsRequest request) {
        Objects.requireNonNull(request.getCompartmentId(), "compartmentId is required");

        return clientCall(request, ListWorkRequestsResponse::builder)
                .logger(LOG, "listWorkRequests")
                .serviceDetails(
                        "Oda",
                        "ListWorkRequests",
                        "https://docs.oracle.com/iaas/api/#/en/digital-assistant/20190506/WorkRequest/ListWorkRequests")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListWorkRequestsRequest::builder)
                .basePath("/20190506")
                .appendPathParam("workRequests")
                .appendQueryParam("compartmentId", request.getCompartmentId())
                .appendQueryParam("odaInstanceId", request.getOdaInstanceId())
                .appendQueryParam("page", request.getPage())
                .appendQueryParam("limit", request.getLimit())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBodyList(
                        com.oracle.bmc.oda.model.WorkRequestSummary.class,
                        ListWorkRequestsResponse.Builder::items)
                .handleResponseHeaderString(
                        "opc-request-id", ListWorkRequestsResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListWorkRequestsResponse.Builder::opcNextPage)
                .handleResponseHeaderInteger(
                        "opc-total-items", ListWorkRequestsResponse.Builder::opcTotalItems)
                .callSync();
    }

    @Override
    public StartOdaInstanceResponse startOdaInstance(StartOdaInstanceRequest request) {

        Validate.notBlank(request.getOdaInstanceId(), "odaInstanceId must not be blank");

        return clientCall(request, StartOdaInstanceResponse::builder)
                .logger(LOG, "startOdaInstance")
                .serviceDetails(
                        "Oda",
                        "StartOdaInstance",
                        "https://docs.oracle.com/iaas/api/#/en/digital-assistant/20190506/OdaInstance/StartOdaInstance")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(StartOdaInstanceRequest::builder)
                .basePath("/20190506")
                .appendPathParam("odaInstances")
                .appendPathParam(request.getOdaInstanceId())
                .appendPathParam("actions")
                .appendPathParam("start")
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .handleResponseHeaderString(
                        "opc-work-request-id", StartOdaInstanceResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", StartOdaInstanceResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public StopOdaInstanceResponse stopOdaInstance(StopOdaInstanceRequest request) {

        Validate.notBlank(request.getOdaInstanceId(), "odaInstanceId must not be blank");

        return clientCall(request, StopOdaInstanceResponse::builder)
                .logger(LOG, "stopOdaInstance")
                .serviceDetails(
                        "Oda",
                        "StopOdaInstance",
                        "https://docs.oracle.com/iaas/api/#/en/digital-assistant/20190506/OdaInstance/StopOdaInstance")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(StopOdaInstanceRequest::builder)
                .basePath("/20190506")
                .appendPathParam("odaInstances")
                .appendPathParam(request.getOdaInstanceId())
                .appendPathParam("actions")
                .appendPathParam("stop")
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .handleResponseHeaderString(
                        "opc-work-request-id", StopOdaInstanceResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", StopOdaInstanceResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public UpdateOdaInstanceResponse updateOdaInstance(UpdateOdaInstanceRequest request) {

        Validate.notBlank(request.getOdaInstanceId(), "odaInstanceId must not be blank");
        Objects.requireNonNull(
                request.getUpdateOdaInstanceDetails(), "updateOdaInstanceDetails is required");

        return clientCall(request, UpdateOdaInstanceResponse::builder)
                .logger(LOG, "updateOdaInstance")
                .serviceDetails(
                        "Oda",
                        "UpdateOdaInstance",
                        "https://docs.oracle.com/iaas/api/#/en/digital-assistant/20190506/OdaInstance/UpdateOdaInstance")
                .method(com.oracle.bmc.http.client.Method.PUT)
                .requestBuilder(UpdateOdaInstanceRequest::builder)
                .basePath("/20190506")
                .appendPathParam("odaInstances")
                .appendPathParam(request.getOdaInstanceId())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.oda.model.OdaInstance.class,
                        UpdateOdaInstanceResponse.Builder::odaInstance)
                .handleResponseHeaderString("etag", UpdateOdaInstanceResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", UpdateOdaInstanceResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public UpdateOdaInstanceAttachmentResponse updateOdaInstanceAttachment(
            UpdateOdaInstanceAttachmentRequest request) {

        Validate.notBlank(request.getOdaInstanceId(), "odaInstanceId must not be blank");

        Validate.notBlank(request.getAttachmentId(), "attachmentId must not be blank");
        Objects.requireNonNull(
                request.getUpdateOdaInstanceAttachmentDetails(),
                "updateOdaInstanceAttachmentDetails is required");

        return clientCall(request, UpdateOdaInstanceAttachmentResponse::builder)
                .logger(LOG, "updateOdaInstanceAttachment")
                .serviceDetails(
                        "Oda",
                        "UpdateOdaInstanceAttachment",
                        "https://docs.oracle.com/iaas/api/#/en/digital-assistant/20190506/OdaInstanceAttachment/UpdateOdaInstanceAttachment")
                .method(com.oracle.bmc.http.client.Method.PUT)
                .requestBuilder(UpdateOdaInstanceAttachmentRequest::builder)
                .basePath("/20190506")
                .appendPathParam("odaInstances")
                .appendPathParam(request.getOdaInstanceId())
                .appendPathParam("attachments")
                .appendPathParam(request.getAttachmentId())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .hasBody()
                .handleResponseHeaderString(
                        "opc-request-id", UpdateOdaInstanceAttachmentResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        UpdateOdaInstanceAttachmentResponse.Builder::opcWorkRequestId)
                .callSync();
    }

    @Override
    public OdaWaiters getWaiters() {
        return waiters;
    }

    @Override
    public OdaPaginators getPaginators() {
        return paginators;
    }

    /**
     * Create a new client instance.
     *
     * @param authenticationDetailsProvider The authentication details (see {@link Builder#build})
     * @deprecated Use the {@link #builder() builder} instead.
     */
    @Deprecated
    public OdaClient(
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
    public OdaClient(
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
    public OdaClient(
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
    public OdaClient(
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
    public OdaClient(
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
    public OdaClient(
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
    public OdaClient(
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
    public OdaClient(
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
