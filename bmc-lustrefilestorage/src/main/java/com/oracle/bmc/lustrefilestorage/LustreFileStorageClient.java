/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.lustrefilestorage;

import com.oracle.bmc.util.internal.Validate;
import com.oracle.bmc.lustrefilestorage.requests.*;
import com.oracle.bmc.lustrefilestorage.responses.*;
import com.oracle.bmc.circuitbreaker.CircuitBreakerConfiguration;
import com.oracle.bmc.util.CircuitBreakerUtils;

import java.util.Objects;

@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20250228")
public class LustreFileStorageClient extends com.oracle.bmc.http.internal.BaseSyncClient
        implements LustreFileStorage {
    /** Service instance for LustreFileStorage. */
    public static final com.oracle.bmc.Service SERVICE =
            com.oracle.bmc.Services.serviceBuilder()
                    .serviceName(LustreFileStorageClient.class.getName())
                    .serviceEndpointPrefix("")
                    .serviceEndpointTemplate(
                            "https://lustre-file-storage.{region}.oci.{secondLevelDomain}")
                    .build();

    private static final org.slf4j.Logger LOG =
            org.slf4j.LoggerFactory.getLogger(LustreFileStorageClient.class);

    private final LustreFileStorageWaiters waiters;

    private final LustreFileStoragePaginators paginators;

    LustreFileStorageClient(
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
                                    .nameFormat("LustreFileStorage-waiters-%d")
                                    .build());
            threadPoolExecutor.allowCoreThreadTimeOut(true);

            executorService = threadPoolExecutor;
        }
        this.waiters = new LustreFileStorageWaiters(executorService, this);

        this.paginators = new LustreFileStoragePaginators(this);
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
            extends com.oracle.bmc.common.RegionalClientBuilder<Builder, LustreFileStorageClient> {
        private java.util.concurrent.ExecutorService executorService;

        private Builder(com.oracle.bmc.Service service) {
            super(service);
            final String packageName = "lustrefilestorage";
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
        public LustreFileStorageClient build(
                @jakarta.annotation.Nonnull
                        com.oracle.bmc.auth.AbstractAuthenticationDetailsProvider
                                authenticationDetailsProvider) {
            return new LustreFileStorageClient(
                    this, authenticationDetailsProvider, executorService);
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
    public CancelWorkRequestResponse cancelWorkRequest(CancelWorkRequestRequest request) {

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
                .operationUsesDefaultRetries()
                .handleResponseHeaderString(
                        "opc-request-id", CancelWorkRequestResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public ChangeLustreFileSystemCompartmentResponse changeLustreFileSystemCompartment(
            ChangeLustreFileSystemCompartmentRequest request) {

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
                .operationUsesDefaultRetries()
                .hasBody()
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        ChangeLustreFileSystemCompartmentResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id",
                        ChangeLustreFileSystemCompartmentResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public ChangeObjectStorageLinkCompartmentResponse changeObjectStorageLinkCompartment(
            ChangeObjectStorageLinkCompartmentRequest request) {

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
                .operationUsesDefaultRetries()
                .hasBody()
                .handleBody(
                        com.oracle.bmc.lustrefilestorage.model.ObjectStorageLink.class,
                        ChangeObjectStorageLinkCompartmentResponse.Builder::objectStorageLink)
                .handleResponseHeaderString(
                        "etag", ChangeObjectStorageLinkCompartmentResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id",
                        ChangeObjectStorageLinkCompartmentResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public CreateLustreFileSystemResponse createLustreFileSystem(
            CreateLustreFileSystemRequest request) {
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
                .operationUsesDefaultRetries()
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
                .callSync();
    }

    @Override
    public CreateObjectStorageLinkResponse createObjectStorageLink(
            CreateObjectStorageLinkRequest request) {
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
                .operationUsesDefaultRetries()
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
                .callSync();
    }

    @Override
    public DeleteLustreFileSystemResponse deleteLustreFileSystem(
            DeleteLustreFileSystemRequest request) {

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
                .operationUsesDefaultRetries()
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        DeleteLustreFileSystemResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", DeleteLustreFileSystemResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public DeleteObjectStorageLinkResponse deleteObjectStorageLink(
            DeleteObjectStorageLinkRequest request) {

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
                .operationUsesDefaultRetries()
                .handleResponseHeaderString(
                        "opc-request-id", DeleteObjectStorageLinkResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        DeleteObjectStorageLinkResponse.Builder::opcWorkRequestId)
                .callSync();
    }

    @Override
    public GetLustreFileSystemResponse getLustreFileSystem(GetLustreFileSystemRequest request) {

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
                .operationUsesDefaultRetries()
                .handleBody(
                        com.oracle.bmc.lustrefilestorage.model.LustreFileSystem.class,
                        GetLustreFileSystemResponse.Builder::lustreFileSystem)
                .handleResponseHeaderString("etag", GetLustreFileSystemResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", GetLustreFileSystemResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public GetObjectStorageLinkResponse getObjectStorageLink(GetObjectStorageLinkRequest request) {

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
                .operationUsesDefaultRetries()
                .handleBody(
                        com.oracle.bmc.lustrefilestorage.model.ObjectStorageLink.class,
                        GetObjectStorageLinkResponse.Builder::objectStorageLink)
                .handleResponseHeaderString("etag", GetObjectStorageLinkResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", GetObjectStorageLinkResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public GetSyncJobResponse getSyncJob(GetSyncJobRequest request) {

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
                .operationUsesDefaultRetries()
                .handleBody(
                        com.oracle.bmc.lustrefilestorage.model.SyncJob.class,
                        GetSyncJobResponse.Builder::syncJob)
                .handleResponseHeaderString("etag", GetSyncJobResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", GetSyncJobResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public GetWorkRequestResponse getWorkRequest(GetWorkRequestRequest request) {

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
                .operationUsesDefaultRetries()
                .handleBody(
                        com.oracle.bmc.lustrefilestorage.model.WorkRequest.class,
                        GetWorkRequestResponse.Builder::workRequest)
                .handleResponseHeaderString("etag", GetWorkRequestResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", GetWorkRequestResponse.Builder::opcRequestId)
                .handleResponseHeaderInteger(
                        "retry-after", GetWorkRequestResponse.Builder::retryAfter)
                .callSync();
    }

    @Override
    public ListLustreFileSystemsResponse listLustreFileSystems(
            ListLustreFileSystemsRequest request) {

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
                .operationUsesDefaultRetries()
                .handleBody(
                        com.oracle.bmc.lustrefilestorage.model.LustreFileSystemCollection.class,
                        ListLustreFileSystemsResponse.Builder::lustreFileSystemCollection)
                .handleResponseHeaderString(
                        "opc-request-id", ListLustreFileSystemsResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListLustreFileSystemsResponse.Builder::opcNextPage)
                .callSync();
    }

    @Override
    public ListObjectStorageLinksResponse listObjectStorageLinks(
            ListObjectStorageLinksRequest request) {

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
                .operationUsesDefaultRetries()
                .handleBody(
                        com.oracle.bmc.lustrefilestorage.model.ObjectStorageLinkCollection.class,
                        ListObjectStorageLinksResponse.Builder::objectStorageLinkCollection)
                .handleResponseHeaderString(
                        "opc-request-id", ListObjectStorageLinksResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListObjectStorageLinksResponse.Builder::opcNextPage)
                .callSync();
    }

    @Override
    public ListSyncJobsResponse listSyncJobs(ListSyncJobsRequest request) {

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
                .operationUsesDefaultRetries()
                .handleBody(
                        com.oracle.bmc.lustrefilestorage.model.SyncJobCollection.class,
                        ListSyncJobsResponse.Builder::syncJobCollection)
                .handleResponseHeaderString(
                        "opc-next-page", ListSyncJobsResponse.Builder::opcNextPage)
                .handleResponseHeaderString(
                        "opc-request-id", ListSyncJobsResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public ListWorkRequestErrorsResponse listWorkRequestErrors(
            ListWorkRequestErrorsRequest request) {

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
                .operationUsesDefaultRetries()
                .handleBody(
                        com.oracle.bmc.lustrefilestorage.model.WorkRequestErrorCollection.class,
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
                .operationUsesDefaultRetries()
                .handleBody(
                        com.oracle.bmc.lustrefilestorage.model.WorkRequestLogEntryCollection.class,
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
                .operationUsesDefaultRetries()
                .handleBody(
                        com.oracle.bmc.lustrefilestorage.model.WorkRequestSummaryCollection.class,
                        ListWorkRequestsResponse.Builder::workRequestSummaryCollection)
                .handleResponseHeaderString(
                        "opc-request-id", ListWorkRequestsResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListWorkRequestsResponse.Builder::opcNextPage)
                .callSync();
    }

    @Override
    public StartExportToObjectResponse startExportToObject(StartExportToObjectRequest request) {

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
                .operationUsesDefaultRetries()
                .handleBody(
                        com.oracle.bmc.lustrefilestorage.model.SyncJob.class,
                        StartExportToObjectResponse.Builder::syncJob)
                .handleResponseHeaderString("etag", StartExportToObjectResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", StartExportToObjectResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public StartImportFromObjectResponse startImportFromObject(
            StartImportFromObjectRequest request) {

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
                .operationUsesDefaultRetries()
                .handleBody(
                        com.oracle.bmc.lustrefilestorage.model.SyncJob.class,
                        StartImportFromObjectResponse.Builder::syncJob)
                .handleResponseHeaderString("etag", StartImportFromObjectResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", StartImportFromObjectResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public StopExportToObjectResponse stopExportToObject(StopExportToObjectRequest request) {

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
                .operationUsesDefaultRetries()
                .handleResponseHeaderString(
                        "opc-request-id", StopExportToObjectResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public StopImportFromObjectResponse stopImportFromObject(StopImportFromObjectRequest request) {

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
                .operationUsesDefaultRetries()
                .handleResponseHeaderString(
                        "opc-request-id", StopImportFromObjectResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public UpdateLustreFileSystemResponse updateLustreFileSystem(
            UpdateLustreFileSystemRequest request) {

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
                .operationUsesDefaultRetries()
                .hasBody()
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        UpdateLustreFileSystemResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", UpdateLustreFileSystemResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public UpdateObjectStorageLinkResponse updateObjectStorageLink(
            UpdateObjectStorageLinkRequest request) {

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
                .operationUsesDefaultRetries()
                .hasBody()
                .handleBody(
                        com.oracle.bmc.lustrefilestorage.model.ObjectStorageLink.class,
                        UpdateObjectStorageLinkResponse.Builder::objectStorageLink)
                .handleResponseHeaderString("etag", UpdateObjectStorageLinkResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", UpdateObjectStorageLinkResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public LustreFileStorageWaiters getWaiters() {
        return waiters;
    }

    @Override
    public LustreFileStoragePaginators getPaginators() {
        return paginators;
    }

    /**
     * Create a new client instance.
     *
     * @param authenticationDetailsProvider The authentication details (see {@link Builder#build})
     * @deprecated Use the {@link #builder() builder} instead.
     */
    @Deprecated
    public LustreFileStorageClient(
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
    public LustreFileStorageClient(
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
    public LustreFileStorageClient(
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
    public LustreFileStorageClient(
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
    public LustreFileStorageClient(
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
    public LustreFileStorageClient(
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
    public LustreFileStorageClient(
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
    public LustreFileStorageClient(
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
