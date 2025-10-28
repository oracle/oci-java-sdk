/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.lustrefilestorage;

import com.oracle.bmc.util.internal.Validate;
import com.oracle.bmc.lustrefilestorage.requests.*;
import com.oracle.bmc.lustrefilestorage.responses.*;

import java.util.Objects;

/**
 * Async client implementation for LustreFileStorage service. <br>
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
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20250228")
public class LustreFileStorageAsyncClient extends com.oracle.bmc.http.internal.BaseAsyncClient
        implements LustreFileStorageAsync {
    /** Service instance for LustreFileStorage. */
    public static final com.oracle.bmc.Service SERVICE =
            com.oracle.bmc.Services.serviceBuilder()
                    .serviceName("LUSTREFILESTORAGE")
                    .serviceEndpointPrefix("")
                    .serviceEndpointTemplate(
                            "https://lustre-file-storage.{region}.oci.{secondLevelDomain}")
                    .build();

    private static final org.slf4j.Logger LOG =
            org.slf4j.LoggerFactory.getLogger(LustreFileStorageAsyncClient.class);

    LustreFileStorageAsyncClient(
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
            extends com.oracle.bmc.common.RegionalClientBuilder<
                    Builder, LustreFileStorageAsyncClient> {
        private Builder(com.oracle.bmc.Service service) {
            super(service);
            final String packageName = "lustrefilestorage";
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
        public LustreFileStorageAsyncClient build(
                @jakarta.annotation.Nonnull
                        com.oracle.bmc.auth.AbstractAuthenticationDetailsProvider
                                authenticationDetailsProvider) {
            return new LustreFileStorageAsyncClient(this, authenticationDetailsProvider);
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
    public java.util.concurrent.Future<CancelWorkRequestResponse> cancelWorkRequest(
            CancelWorkRequestRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            CancelWorkRequestRequest, CancelWorkRequestResponse>
                    handler) {

        Validate.notBlank(request.getWorkRequestId(), "workRequestId must not be blank");

        return clientCall(request, CancelWorkRequestResponse::builder)
                .logger(LOG, "cancelWorkRequest")
                .serviceDetails(
                        "LustreFileStorage",
                        "CancelWorkRequest",
                        "https://docs.oracle.com/iaas/api/#/en/lustre/20250228/WorkRequest/CancelWorkRequest")
                .method(com.oracle.bmc.http.client.Method.DELETE)
                .requestBuilder(CancelWorkRequestRequest::builder)
                .basePath("/20250228")
                .appendPathParam("workRequests")
                .appendPathParam(request.getWorkRequestId())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleResponseHeaderString(
                        "opc-request-id", CancelWorkRequestResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ChangeLustreFileSystemCompartmentResponse>
            changeLustreFileSystemCompartment(
                    ChangeLustreFileSystemCompartmentRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    ChangeLustreFileSystemCompartmentRequest,
                                    ChangeLustreFileSystemCompartmentResponse>
                            handler) {

        Validate.notBlank(request.getLustreFileSystemId(), "lustreFileSystemId must not be blank");
        Objects.requireNonNull(
                request.getChangeLustreFileSystemCompartmentDetails(),
                "changeLustreFileSystemCompartmentDetails is required");

        return clientCall(request, ChangeLustreFileSystemCompartmentResponse::builder)
                .logger(LOG, "changeLustreFileSystemCompartment")
                .serviceDetails(
                        "LustreFileStorage",
                        "ChangeLustreFileSystemCompartment",
                        "https://docs.oracle.com/iaas/api/#/en/lustre/20250228/LustreFileSystem/ChangeLustreFileSystemCompartment")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(ChangeLustreFileSystemCompartmentRequest::builder)
                .basePath("/20250228")
                .appendPathParam("lustreFileSystems")
                .appendPathParam(request.getLustreFileSystemId())
                .appendPathParam("actions")
                .appendPathParam("changeCompartment")
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .hasBody()
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        ChangeLustreFileSystemCompartmentResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id",
                        ChangeLustreFileSystemCompartmentResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ChangeObjectStorageLinkCompartmentResponse>
            changeObjectStorageLinkCompartment(
                    ChangeObjectStorageLinkCompartmentRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    ChangeObjectStorageLinkCompartmentRequest,
                                    ChangeObjectStorageLinkCompartmentResponse>
                            handler) {

        Validate.notBlank(
                request.getObjectStorageLinkId(), "objectStorageLinkId must not be blank");
        Objects.requireNonNull(
                request.getChangeObjectStorageLinkCompartmentDetails(),
                "changeObjectStorageLinkCompartmentDetails is required");

        return clientCall(request, ChangeObjectStorageLinkCompartmentResponse::builder)
                .logger(LOG, "changeObjectStorageLinkCompartment")
                .serviceDetails(
                        "LustreFileStorage",
                        "ChangeObjectStorageLinkCompartment",
                        "https://docs.oracle.com/iaas/api/#/en/lustre/20250228/ObjectStorageLink/ChangeObjectStorageLinkCompartment")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(ChangeObjectStorageLinkCompartmentRequest::builder)
                .basePath("/20250228")
                .appendPathParam("objectStorageLinks")
                .appendPathParam(request.getObjectStorageLinkId())
                .appendPathParam("actions")
                .appendPathParam("changeCompartment")
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.lustrefilestorage.model.ObjectStorageLink.class,
                        ChangeObjectStorageLinkCompartmentResponse.Builder::objectStorageLink)
                .handleResponseHeaderString(
                        "etag", ChangeObjectStorageLinkCompartmentResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id",
                        ChangeObjectStorageLinkCompartmentResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<CreateLustreFileSystemResponse> createLustreFileSystem(
            CreateLustreFileSystemRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            CreateLustreFileSystemRequest, CreateLustreFileSystemResponse>
                    handler) {
        Objects.requireNonNull(
                request.getCreateLustreFileSystemDetails(),
                "createLustreFileSystemDetails is required");

        return clientCall(request, CreateLustreFileSystemResponse::builder)
                .logger(LOG, "createLustreFileSystem")
                .serviceDetails(
                        "LustreFileStorage",
                        "CreateLustreFileSystem",
                        "https://docs.oracle.com/iaas/api/#/en/lustre/20250228/LustreFileSystem/CreateLustreFileSystem")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(CreateLustreFileSystemRequest::builder)
                .basePath("/20250228")
                .appendPathParam("lustreFileSystems")
                .accept("application/json")
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.lustrefilestorage.model.LustreFileSystem.class,
                        CreateLustreFileSystemResponse.Builder::lustreFileSystem)
                .handleResponseHeaderString(
                        "location", CreateLustreFileSystemResponse.Builder::location)
                .handleResponseHeaderString(
                        "content-location", CreateLustreFileSystemResponse.Builder::contentLocation)
                .handleResponseHeaderString("etag", CreateLustreFileSystemResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        CreateLustreFileSystemResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", CreateLustreFileSystemResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<CreateObjectStorageLinkResponse> createObjectStorageLink(
            CreateObjectStorageLinkRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            CreateObjectStorageLinkRequest, CreateObjectStorageLinkResponse>
                    handler) {
        Objects.requireNonNull(
                request.getCreateObjectStorageLinkDetails(),
                "createObjectStorageLinkDetails is required");

        return clientCall(request, CreateObjectStorageLinkResponse::builder)
                .logger(LOG, "createObjectStorageLink")
                .serviceDetails(
                        "LustreFileStorage",
                        "CreateObjectStorageLink",
                        "https://docs.oracle.com/iaas/api/#/en/lustre/20250228/ObjectStorageLink/CreateObjectStorageLink")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(CreateObjectStorageLinkRequest::builder)
                .basePath("/20250228")
                .appendPathParam("objectStorageLinks")
                .accept("application/json")
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.lustrefilestorage.model.ObjectStorageLink.class,
                        CreateObjectStorageLinkResponse.Builder::objectStorageLink)
                .handleResponseHeaderString(
                        "location", CreateObjectStorageLinkResponse.Builder::location)
                .handleResponseHeaderString(
                        "content-location",
                        CreateObjectStorageLinkResponse.Builder::contentLocation)
                .handleResponseHeaderString("etag", CreateObjectStorageLinkResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", CreateObjectStorageLinkResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<DeleteLustreFileSystemResponse> deleteLustreFileSystem(
            DeleteLustreFileSystemRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            DeleteLustreFileSystemRequest, DeleteLustreFileSystemResponse>
                    handler) {

        Validate.notBlank(request.getLustreFileSystemId(), "lustreFileSystemId must not be blank");

        return clientCall(request, DeleteLustreFileSystemResponse::builder)
                .logger(LOG, "deleteLustreFileSystem")
                .serviceDetails(
                        "LustreFileStorage",
                        "DeleteLustreFileSystem",
                        "https://docs.oracle.com/iaas/api/#/en/lustre/20250228/LustreFileSystem/DeleteLustreFileSystem")
                .method(com.oracle.bmc.http.client.Method.DELETE)
                .requestBuilder(DeleteLustreFileSystemRequest::builder)
                .basePath("/20250228")
                .appendPathParam("lustreFileSystems")
                .appendPathParam(request.getLustreFileSystemId())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        DeleteLustreFileSystemResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", DeleteLustreFileSystemResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<DeleteObjectStorageLinkResponse> deleteObjectStorageLink(
            DeleteObjectStorageLinkRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            DeleteObjectStorageLinkRequest, DeleteObjectStorageLinkResponse>
                    handler) {

        Validate.notBlank(
                request.getObjectStorageLinkId(), "objectStorageLinkId must not be blank");

        return clientCall(request, DeleteObjectStorageLinkResponse::builder)
                .logger(LOG, "deleteObjectStorageLink")
                .serviceDetails(
                        "LustreFileStorage",
                        "DeleteObjectStorageLink",
                        "https://docs.oracle.com/iaas/api/#/en/lustre/20250228/ObjectStorageLink/DeleteObjectStorageLink")
                .method(com.oracle.bmc.http.client.Method.DELETE)
                .requestBuilder(DeleteObjectStorageLinkRequest::builder)
                .basePath("/20250228")
                .appendPathParam("objectStorageLinks")
                .appendPathParam(request.getObjectStorageLinkId())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleResponseHeaderString(
                        "opc-request-id", DeleteObjectStorageLinkResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        DeleteObjectStorageLinkResponse.Builder::opcWorkRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<GetLustreFileSystemResponse> getLustreFileSystem(
            GetLustreFileSystemRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            GetLustreFileSystemRequest, GetLustreFileSystemResponse>
                    handler) {

        Validate.notBlank(request.getLustreFileSystemId(), "lustreFileSystemId must not be blank");

        return clientCall(request, GetLustreFileSystemResponse::builder)
                .logger(LOG, "getLustreFileSystem")
                .serviceDetails(
                        "LustreFileStorage",
                        "GetLustreFileSystem",
                        "https://docs.oracle.com/iaas/api/#/en/lustre/20250228/LustreFileSystem/GetLustreFileSystem")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetLustreFileSystemRequest::builder)
                .basePath("/20250228")
                .appendPathParam("lustreFileSystems")
                .appendPathParam(request.getLustreFileSystemId())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.lustrefilestorage.model.LustreFileSystem.class,
                        GetLustreFileSystemResponse.Builder::lustreFileSystem)
                .handleResponseHeaderString("etag", GetLustreFileSystemResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", GetLustreFileSystemResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<GetObjectStorageLinkResponse> getObjectStorageLink(
            GetObjectStorageLinkRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            GetObjectStorageLinkRequest, GetObjectStorageLinkResponse>
                    handler) {

        Validate.notBlank(
                request.getObjectStorageLinkId(), "objectStorageLinkId must not be blank");

        return clientCall(request, GetObjectStorageLinkResponse::builder)
                .logger(LOG, "getObjectStorageLink")
                .serviceDetails(
                        "LustreFileStorage",
                        "GetObjectStorageLink",
                        "https://docs.oracle.com/iaas/api/#/en/lustre/20250228/ObjectStorageLink/GetObjectStorageLink")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetObjectStorageLinkRequest::builder)
                .basePath("/20250228")
                .appendPathParam("objectStorageLinks")
                .appendPathParam(request.getObjectStorageLinkId())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.lustrefilestorage.model.ObjectStorageLink.class,
                        GetObjectStorageLinkResponse.Builder::objectStorageLink)
                .handleResponseHeaderString("etag", GetObjectStorageLinkResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", GetObjectStorageLinkResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<GetSyncJobResponse> getSyncJob(
            GetSyncJobRequest request,
            final com.oracle.bmc.responses.AsyncHandler<GetSyncJobRequest, GetSyncJobResponse>
                    handler) {

        Validate.notBlank(
                request.getObjectStorageLinkId(), "objectStorageLinkId must not be blank");

        Validate.notBlank(request.getSyncJobId(), "syncJobId must not be blank");

        return clientCall(request, GetSyncJobResponse::builder)
                .logger(LOG, "getSyncJob")
                .serviceDetails(
                        "LustreFileStorage",
                        "GetSyncJob",
                        "https://docs.oracle.com/iaas/api/#/en/lustre/20250228/ObjectStorageLink/GetSyncJob")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetSyncJobRequest::builder)
                .basePath("/20250228")
                .appendPathParam("objectStorageLinks")
                .appendPathParam(request.getObjectStorageLinkId())
                .appendPathParam("syncJobs")
                .appendPathParam(request.getSyncJobId())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.lustrefilestorage.model.SyncJob.class,
                        GetSyncJobResponse.Builder::syncJob)
                .handleResponseHeaderString("etag", GetSyncJobResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", GetSyncJobResponse.Builder::opcRequestId)
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
                        "LustreFileStorage",
                        "GetWorkRequest",
                        "https://docs.oracle.com/iaas/api/#/en/lustre/20250228/WorkRequest/GetWorkRequest")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetWorkRequestRequest::builder)
                .basePath("/20250228")
                .appendPathParam("workRequests")
                .appendPathParam(request.getWorkRequestId())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.lustrefilestorage.model.WorkRequest.class,
                        GetWorkRequestResponse.Builder::workRequest)
                .handleResponseHeaderString("etag", GetWorkRequestResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", GetWorkRequestResponse.Builder::opcRequestId)
                .handleResponseHeaderInteger(
                        "retry-after", GetWorkRequestResponse.Builder::retryAfter)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ListLustreFileSystemsResponse> listLustreFileSystems(
            ListLustreFileSystemsRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ListLustreFileSystemsRequest, ListLustreFileSystemsResponse>
                    handler) {

        return clientCall(request, ListLustreFileSystemsResponse::builder)
                .logger(LOG, "listLustreFileSystems")
                .serviceDetails(
                        "LustreFileStorage",
                        "ListLustreFileSystems",
                        "https://docs.oracle.com/iaas/api/#/en/lustre/20250228/LustreFileSystemCollection/ListLustreFileSystems")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListLustreFileSystemsRequest::builder)
                .basePath("/20250228")
                .appendPathParam("lustreFileSystems")
                .appendQueryParam("compartmentId", request.getCompartmentId())
                .appendQueryParam("availabilityDomain", request.getAvailabilityDomain())
                .appendEnumQueryParam("lifecycleState", request.getLifecycleState())
                .appendQueryParam("displayName", request.getDisplayName())
                .appendQueryParam("id", request.getId())
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.lustrefilestorage.model.LustreFileSystemCollection.class,
                        ListLustreFileSystemsResponse.Builder::lustreFileSystemCollection)
                .handleResponseHeaderString(
                        "opc-request-id", ListLustreFileSystemsResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListLustreFileSystemsResponse.Builder::opcNextPage)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ListObjectStorageLinksResponse> listObjectStorageLinks(
            ListObjectStorageLinksRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ListObjectStorageLinksRequest, ListObjectStorageLinksResponse>
                    handler) {

        return clientCall(request, ListObjectStorageLinksResponse::builder)
                .logger(LOG, "listObjectStorageLinks")
                .serviceDetails(
                        "LustreFileStorage",
                        "ListObjectStorageLinks",
                        "https://docs.oracle.com/iaas/api/#/en/lustre/20250228/ObjectStorageLinkCollection/ListObjectStorageLinks")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListObjectStorageLinksRequest::builder)
                .basePath("/20250228")
                .appendPathParam("objectStorageLinks")
                .appendQueryParam("compartmentId", request.getCompartmentId())
                .appendQueryParam("availabilityDomain", request.getAvailabilityDomain())
                .appendEnumQueryParam("lifecycleState", request.getLifecycleState())
                .appendQueryParam("displayName", request.getDisplayName())
                .appendQueryParam("id", request.getId())
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .appendQueryParam("lustreFileSystemId", request.getLustreFileSystemId())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.lustrefilestorage.model.ObjectStorageLinkCollection.class,
                        ListObjectStorageLinksResponse.Builder::objectStorageLinkCollection)
                .handleResponseHeaderString(
                        "opc-request-id", ListObjectStorageLinksResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListObjectStorageLinksResponse.Builder::opcNextPage)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ListSyncJobsResponse> listSyncJobs(
            ListSyncJobsRequest request,
            final com.oracle.bmc.responses.AsyncHandler<ListSyncJobsRequest, ListSyncJobsResponse>
                    handler) {

        Validate.notBlank(
                request.getObjectStorageLinkId(), "objectStorageLinkId must not be blank");

        return clientCall(request, ListSyncJobsResponse::builder)
                .logger(LOG, "listSyncJobs")
                .serviceDetails(
                        "LustreFileStorage",
                        "ListSyncJobs",
                        "https://docs.oracle.com/iaas/api/#/en/lustre/20250228/ObjectStorageLink/ListSyncJobs")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListSyncJobsRequest::builder)
                .basePath("/20250228")
                .appendPathParam("objectStorageLinks")
                .appendPathParam(request.getObjectStorageLinkId())
                .appendPathParam("syncJobs")
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .appendEnumQueryParam("lifecycleState", request.getLifecycleState())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.lustrefilestorage.model.SyncJobCollection.class,
                        ListSyncJobsResponse.Builder::syncJobCollection)
                .handleResponseHeaderString(
                        "opc-next-page", ListSyncJobsResponse.Builder::opcNextPage)
                .handleResponseHeaderString(
                        "opc-request-id", ListSyncJobsResponse.Builder::opcRequestId)
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
                        "LustreFileStorage",
                        "ListWorkRequestErrors",
                        "https://docs.oracle.com/iaas/api/#/en/lustre/20250228/WorkRequestError/ListWorkRequestErrors")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListWorkRequestErrorsRequest::builder)
                .basePath("/20250228")
                .appendPathParam("workRequests")
                .appendPathParam(request.getWorkRequestId())
                .appendPathParam("errors")
                .appendQueryParam("page", request.getPage())
                .appendQueryParam("limit", request.getLimit())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.lustrefilestorage.model.WorkRequestErrorCollection.class,
                        ListWorkRequestErrorsResponse.Builder::workRequestErrorCollection)
                .handleResponseHeaderString(
                        "opc-next-page", ListWorkRequestErrorsResponse.Builder::opcNextPage)
                .handleResponseHeaderString(
                        "opc-request-id", ListWorkRequestErrorsResponse.Builder::opcRequestId)
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
                        "LustreFileStorage",
                        "ListWorkRequestLogs",
                        "https://docs.oracle.com/iaas/api/#/en/lustre/20250228/WorkRequestLogEntry/ListWorkRequestLogs")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListWorkRequestLogsRequest::builder)
                .basePath("/20250228")
                .appendPathParam("workRequests")
                .appendPathParam(request.getWorkRequestId())
                .appendPathParam("logs")
                .appendQueryParam("page", request.getPage())
                .appendQueryParam("limit", request.getLimit())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.lustrefilestorage.model.WorkRequestLogEntryCollection.class,
                        ListWorkRequestLogsResponse.Builder::workRequestLogEntryCollection)
                .handleResponseHeaderString(
                        "opc-next-page", ListWorkRequestLogsResponse.Builder::opcNextPage)
                .handleResponseHeaderString(
                        "opc-request-id", ListWorkRequestLogsResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ListWorkRequestsResponse> listWorkRequests(
            ListWorkRequestsRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ListWorkRequestsRequest, ListWorkRequestsResponse>
                    handler) {

        return clientCall(request, ListWorkRequestsResponse::builder)
                .logger(LOG, "listWorkRequests")
                .serviceDetails(
                        "LustreFileStorage",
                        "ListWorkRequests",
                        "https://docs.oracle.com/iaas/api/#/en/lustre/20250228/WorkRequest/ListWorkRequests")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListWorkRequestsRequest::builder)
                .basePath("/20250228")
                .appendPathParam("workRequests")
                .appendQueryParam("compartmentId", request.getCompartmentId())
                .appendQueryParam("workRequestId", request.getWorkRequestId())
                .appendEnumQueryParam("status", request.getStatus())
                .appendQueryParam("resourceId", request.getResourceId())
                .appendQueryParam("page", request.getPage())
                .appendQueryParam("limit", request.getLimit())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.lustrefilestorage.model.WorkRequestSummaryCollection.class,
                        ListWorkRequestsResponse.Builder::workRequestSummaryCollection)
                .handleResponseHeaderString(
                        "opc-request-id", ListWorkRequestsResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListWorkRequestsResponse.Builder::opcNextPage)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<StartExportToObjectResponse> startExportToObject(
            StartExportToObjectRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            StartExportToObjectRequest, StartExportToObjectResponse>
                    handler) {

        Validate.notBlank(
                request.getObjectStorageLinkId(), "objectStorageLinkId must not be blank");

        return clientCall(request, StartExportToObjectResponse::builder)
                .logger(LOG, "startExportToObject")
                .serviceDetails(
                        "LustreFileStorage",
                        "StartExportToObject",
                        "https://docs.oracle.com/iaas/api/#/en/lustre/20250228/ObjectStorageLink/StartExportToObject")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(StartExportToObjectRequest::builder)
                .basePath("/20250228")
                .appendPathParam("objectStorageLinks")
                .appendPathParam(request.getObjectStorageLinkId())
                .appendPathParam("actions")
                .appendPathParam("startExportToObject")
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .handleBody(
                        com.oracle.bmc.lustrefilestorage.model.SyncJob.class,
                        StartExportToObjectResponse.Builder::syncJob)
                .handleResponseHeaderString("etag", StartExportToObjectResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", StartExportToObjectResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<StartImportFromObjectResponse> startImportFromObject(
            StartImportFromObjectRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            StartImportFromObjectRequest, StartImportFromObjectResponse>
                    handler) {

        Validate.notBlank(
                request.getObjectStorageLinkId(), "objectStorageLinkId must not be blank");

        return clientCall(request, StartImportFromObjectResponse::builder)
                .logger(LOG, "startImportFromObject")
                .serviceDetails(
                        "LustreFileStorage",
                        "StartImportFromObject",
                        "https://docs.oracle.com/iaas/api/#/en/lustre/20250228/ObjectStorageLink/StartImportFromObject")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(StartImportFromObjectRequest::builder)
                .basePath("/20250228")
                .appendPathParam("objectStorageLinks")
                .appendPathParam(request.getObjectStorageLinkId())
                .appendPathParam("actions")
                .appendPathParam("startImportFromObject")
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .handleBody(
                        com.oracle.bmc.lustrefilestorage.model.SyncJob.class,
                        StartImportFromObjectResponse.Builder::syncJob)
                .handleResponseHeaderString("etag", StartImportFromObjectResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", StartImportFromObjectResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<StopExportToObjectResponse> stopExportToObject(
            StopExportToObjectRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            StopExportToObjectRequest, StopExportToObjectResponse>
                    handler) {

        Validate.notBlank(
                request.getObjectStorageLinkId(), "objectStorageLinkId must not be blank");

        return clientCall(request, StopExportToObjectResponse::builder)
                .logger(LOG, "stopExportToObject")
                .serviceDetails(
                        "LustreFileStorage",
                        "StopExportToObject",
                        "https://docs.oracle.com/iaas/api/#/en/lustre/20250228/ObjectStorageLink/StopExportToObject")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(StopExportToObjectRequest::builder)
                .basePath("/20250228")
                .appendPathParam("objectStorageLinks")
                .appendPathParam(request.getObjectStorageLinkId())
                .appendPathParam("actions")
                .appendPathParam("stopExportToObject")
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .handleResponseHeaderString(
                        "opc-request-id", StopExportToObjectResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<StopImportFromObjectResponse> stopImportFromObject(
            StopImportFromObjectRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            StopImportFromObjectRequest, StopImportFromObjectResponse>
                    handler) {

        Validate.notBlank(
                request.getObjectStorageLinkId(), "objectStorageLinkId must not be blank");

        return clientCall(request, StopImportFromObjectResponse::builder)
                .logger(LOG, "stopImportFromObject")
                .serviceDetails(
                        "LustreFileStorage",
                        "StopImportFromObject",
                        "https://docs.oracle.com/iaas/api/#/en/lustre/20250228/ObjectStorageLink/StopImportFromObject")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(StopImportFromObjectRequest::builder)
                .basePath("/20250228")
                .appendPathParam("objectStorageLinks")
                .appendPathParam(request.getObjectStorageLinkId())
                .appendPathParam("actions")
                .appendPathParam("stopImportFromObject")
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .handleResponseHeaderString(
                        "opc-request-id", StopImportFromObjectResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<UpdateLustreFileSystemResponse> updateLustreFileSystem(
            UpdateLustreFileSystemRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            UpdateLustreFileSystemRequest, UpdateLustreFileSystemResponse>
                    handler) {

        Validate.notBlank(request.getLustreFileSystemId(), "lustreFileSystemId must not be blank");
        Objects.requireNonNull(
                request.getUpdateLustreFileSystemDetails(),
                "updateLustreFileSystemDetails is required");

        return clientCall(request, UpdateLustreFileSystemResponse::builder)
                .logger(LOG, "updateLustreFileSystem")
                .serviceDetails(
                        "LustreFileStorage",
                        "UpdateLustreFileSystem",
                        "https://docs.oracle.com/iaas/api/#/en/lustre/20250228/LustreFileSystem/UpdateLustreFileSystem")
                .method(com.oracle.bmc.http.client.Method.PUT)
                .requestBuilder(UpdateLustreFileSystemRequest::builder)
                .basePath("/20250228")
                .appendPathParam("lustreFileSystems")
                .appendPathParam(request.getLustreFileSystemId())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .hasBody()
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        UpdateLustreFileSystemResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", UpdateLustreFileSystemResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<UpdateObjectStorageLinkResponse> updateObjectStorageLink(
            UpdateObjectStorageLinkRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            UpdateObjectStorageLinkRequest, UpdateObjectStorageLinkResponse>
                    handler) {

        Validate.notBlank(
                request.getObjectStorageLinkId(), "objectStorageLinkId must not be blank");
        Objects.requireNonNull(
                request.getUpdateObjectStorageLinkDetails(),
                "updateObjectStorageLinkDetails is required");

        return clientCall(request, UpdateObjectStorageLinkResponse::builder)
                .logger(LOG, "updateObjectStorageLink")
                .serviceDetails(
                        "LustreFileStorage",
                        "UpdateObjectStorageLink",
                        "https://docs.oracle.com/iaas/api/#/en/lustre/20250228/ObjectStorageLink/UpdateObjectStorageLink")
                .method(com.oracle.bmc.http.client.Method.PUT)
                .requestBuilder(UpdateObjectStorageLinkRequest::builder)
                .basePath("/20250228")
                .appendPathParam("objectStorageLinks")
                .appendPathParam(request.getObjectStorageLinkId())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.lustrefilestorage.model.ObjectStorageLink.class,
                        UpdateObjectStorageLinkResponse.Builder::objectStorageLink)
                .handleResponseHeaderString("etag", UpdateObjectStorageLinkResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", UpdateObjectStorageLinkResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    /**
     * Create a new client instance.
     *
     * @param authenticationDetailsProvider The authentication details (see {@link Builder#build})
     * @deprecated Use the {@link #builder() builder} instead.
     */
    @Deprecated
    public LustreFileStorageAsyncClient(
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
    public LustreFileStorageAsyncClient(
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
    public LustreFileStorageAsyncClient(
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
    public LustreFileStorageAsyncClient(
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
    public LustreFileStorageAsyncClient(
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
    public LustreFileStorageAsyncClient(
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
    public LustreFileStorageAsyncClient(
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
