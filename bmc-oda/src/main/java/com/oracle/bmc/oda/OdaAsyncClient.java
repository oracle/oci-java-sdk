/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.oda;

import com.oracle.bmc.util.internal.Validate;
import com.oracle.bmc.oda.requests.*;
import com.oracle.bmc.oda.responses.*;

import java.util.Objects;

/**
 * Async client implementation for Oda service. <br>
 * There are two ways to use async client: 1. Use AsyncHandler: using AsyncHandler, if the response
 * to the call is an {@link java.io.InputStream}, like getObject Api in object storage service,
 * developers need to process the stream in AsyncHandler, and not anywhere else, because the stream
 * will be closed right after the AsyncHandler is invoked. <br>
 * 2. Use Java Future: using Java Future, developers need to close the stream after they are done
 * with the Java Future.<br>
 * Accessing the result should be done in a mutually exclusive manner, either through the Future or
 * the AsyncHandler, but not both. If the Future is used, the caller should pass in null as the
 * AsyncHandler. If the AsyncHandler is used, it is still safe to use the Future to determine
 * whether or not the request was completed via Future.isDone/isCancelled.<br>
 * Please refer to
 * https://github.com/oracle/oci-java-sdk/blob/master/bmc-examples/src/main/java/ResteasyClientWithObjectStorageExample.java
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20190506")
public class OdaAsyncClient extends com.oracle.bmc.http.internal.BaseAsyncClient
        implements OdaAsync {
    /** Service instance for Oda. */
    public static final com.oracle.bmc.Service SERVICE =
            com.oracle.bmc.Services.serviceBuilder()
                    .serviceName(OdaClient.class.getName())
                    .serviceEndpointPrefix("")
                    .serviceEndpointTemplate(
                            "https://digitalassistant-api.{region}.oci.{secondLevelDomain}")
                    .build();

    private static final org.slf4j.Logger LOG =
            org.slf4j.LoggerFactory.getLogger(OdaAsyncClient.class);

    OdaAsyncClient(
            com.oracle.bmc.common.ClientBuilderBase<?, ?> builder,
            com.oracle.bmc.auth.AbstractAuthenticationDetailsProvider
                    authenticationDetailsProvider) {
        super(builder, authenticationDetailsProvider);
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
            extends com.oracle.bmc.common.RegionalClientBuilder<Builder, OdaAsyncClient> {
        private Builder(com.oracle.bmc.Service service) {
            super(service);
            final String packageName = "oda";
            com.oracle.bmc.internal.Alloy.throwDisabledServiceExceptionIfAppropriate(packageName);
            requestSignerFactory =
                    new com.oracle.bmc.http.signing.internal.DefaultRequestSignerFactory(
                            com.oracle.bmc.http.signing.SigningStrategy.STANDARD);
        }

        /**
         * Build the client.
         *
         * @param authenticationDetailsProvider authentication details provider
         * @return the client
         */
        public OdaAsyncClient build(
                @jakarta.annotation.Nonnull
                        com.oracle.bmc.auth.AbstractAuthenticationDetailsProvider
                                authenticationDetailsProvider) {
            return new OdaAsyncClient(this, authenticationDetailsProvider);
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
    public java.util.concurrent.Future<ChangeOdaInstanceCompartmentResponse>
            changeOdaInstanceCompartment(
                    ChangeOdaInstanceCompartmentRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    ChangeOdaInstanceCompartmentRequest,
                                    ChangeOdaInstanceCompartmentResponse>
                            handler) {

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
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<CreateOdaInstanceResponse> createOdaInstance(
            CreateOdaInstanceRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            CreateOdaInstanceRequest, CreateOdaInstanceResponse>
                    handler) {
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
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<CreateOdaInstanceAttachmentResponse>
            createOdaInstanceAttachment(
                    CreateOdaInstanceAttachmentRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    CreateOdaInstanceAttachmentRequest,
                                    CreateOdaInstanceAttachmentResponse>
                            handler) {

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
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<DeleteOdaInstanceResponse> deleteOdaInstance(
            DeleteOdaInstanceRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            DeleteOdaInstanceRequest, DeleteOdaInstanceResponse>
                    handler) {

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
                .appendQueryParam("retentionTime", request.getRetentionTime())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleResponseHeaderString(
                        "opc-work-request-id", DeleteOdaInstanceResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", DeleteOdaInstanceResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<DeleteOdaInstanceAttachmentResponse>
            deleteOdaInstanceAttachment(
                    DeleteOdaInstanceAttachmentRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    DeleteOdaInstanceAttachmentRequest,
                                    DeleteOdaInstanceAttachmentResponse>
                            handler) {

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
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<GetOdaInstanceResponse> getOdaInstance(
            GetOdaInstanceRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            GetOdaInstanceRequest, GetOdaInstanceResponse>
                    handler) {

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
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<GetOdaInstanceAttachmentResponse> getOdaInstanceAttachment(
            GetOdaInstanceAttachmentRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            GetOdaInstanceAttachmentRequest, GetOdaInstanceAttachmentResponse>
                    handler) {

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
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<GetWorkRequestResponse> getWorkRequest(
            GetWorkRequestRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            GetWorkRequestRequest, GetWorkRequestResponse>
                    handler) {

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
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ListOdaInstanceAttachmentsResponse>
            listOdaInstanceAttachments(
                    ListOdaInstanceAttachmentsRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    ListOdaInstanceAttachmentsRequest,
                                    ListOdaInstanceAttachmentsResponse>
                            handler) {

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
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ListOdaInstancesResponse> listOdaInstances(
            ListOdaInstancesRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ListOdaInstancesRequest, ListOdaInstancesResponse>
                    handler) {
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
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ListWorkRequestErrorsResponse> listWorkRequestErrors(
            ListWorkRequestErrorsRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ListWorkRequestErrorsRequest, ListWorkRequestErrorsResponse>
                    handler) {

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
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ListWorkRequestLogsResponse> listWorkRequestLogs(
            ListWorkRequestLogsRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ListWorkRequestLogsRequest, ListWorkRequestLogsResponse>
                    handler) {

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
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ListWorkRequestsResponse> listWorkRequests(
            ListWorkRequestsRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ListWorkRequestsRequest, ListWorkRequestsResponse>
                    handler) {
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
                .appendQueryParam("resourceId", request.getResourceId())
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
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<StartOdaInstanceResponse> startOdaInstance(
            StartOdaInstanceRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            StartOdaInstanceRequest, StartOdaInstanceResponse>
                    handler) {

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
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<StopOdaInstanceResponse> stopOdaInstance(
            StopOdaInstanceRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            StopOdaInstanceRequest, StopOdaInstanceResponse>
                    handler) {

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
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<UpdateOdaInstanceResponse> updateOdaInstance(
            UpdateOdaInstanceRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            UpdateOdaInstanceRequest, UpdateOdaInstanceResponse>
                    handler) {

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
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<UpdateOdaInstanceAttachmentResponse>
            updateOdaInstanceAttachment(
                    UpdateOdaInstanceAttachmentRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    UpdateOdaInstanceAttachmentRequest,
                                    UpdateOdaInstanceAttachmentResponse>
                            handler) {

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
                .callAsync(handler);
    }

    /**
     * Create a new client instance.
     *
     * @param authenticationDetailsProvider The authentication details (see {@link Builder#build})
     * @deprecated Use the {@link #builder() builder} instead.
     */
    @Deprecated
    public OdaAsyncClient(
            com.oracle.bmc.auth.BasicAuthenticationDetailsProvider authenticationDetailsProvider) {
        this(builder(), authenticationDetailsProvider);
    }

    /**
     * Create a new client instance.
     *
     * @param authenticationDetailsProvider The authentication details (see {@link Builder#build})
     * @param configuration {@link Builder#configuration}
     * @deprecated Use the {@link #builder() builder} instead.
     */
    @Deprecated
    public OdaAsyncClient(
            com.oracle.bmc.auth.BasicAuthenticationDetailsProvider authenticationDetailsProvider,
            com.oracle.bmc.ClientConfiguration configuration) {
        this(builder().configuration(configuration), authenticationDetailsProvider);
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
    public OdaAsyncClient(
            com.oracle.bmc.auth.BasicAuthenticationDetailsProvider authenticationDetailsProvider,
            com.oracle.bmc.ClientConfiguration configuration,
            com.oracle.bmc.http.ClientConfigurator clientConfigurator) {
        this(
                builder().configuration(configuration).clientConfigurator(clientConfigurator),
                authenticationDetailsProvider);
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
    public OdaAsyncClient(
            com.oracle.bmc.auth.AbstractAuthenticationDetailsProvider authenticationDetailsProvider,
            com.oracle.bmc.ClientConfiguration configuration,
            com.oracle.bmc.http.ClientConfigurator clientConfigurator,
            com.oracle.bmc.http.signing.RequestSignerFactory defaultRequestSignerFactory) {
        this(
                builder()
                        .configuration(configuration)
                        .clientConfigurator(clientConfigurator)
                        .requestSignerFactory(defaultRequestSignerFactory),
                authenticationDetailsProvider);
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
    public OdaAsyncClient(
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
                authenticationDetailsProvider);
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
    public OdaAsyncClient(
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
                authenticationDetailsProvider);
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
    public OdaAsyncClient(
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
                authenticationDetailsProvider);
    }
}
