/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.dbmulticloud;

import com.oracle.bmc.util.internal.Validate;
import com.oracle.bmc.dbmulticloud.requests.*;
import com.oracle.bmc.dbmulticloud.responses.*;
import com.oracle.bmc.circuitbreaker.CircuitBreakerConfiguration;
import com.oracle.bmc.util.CircuitBreakerUtils;

import java.util.Objects;

@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20240501")
public class DbMulticloudGCPProviderClient extends com.oracle.bmc.http.internal.BaseSyncClient
        implements DbMulticloudGCPProvider {
    /** Service instance for DbMulticloudGCPProvider. */
    public static final com.oracle.bmc.Service SERVICE =
            com.oracle.bmc.Services.serviceBuilder()
                    .serviceName(DbMulticloudGCPProviderClient.class.getName())
                    .serviceEndpointPrefix("")
                    .serviceEndpointTemplate(
                            "https://dbmulticloud.{region}.oci.{secondLevelDomain}")
                    .build();

    private static final org.slf4j.Logger LOG =
            org.slf4j.LoggerFactory.getLogger(DbMulticloudGCPProviderClient.class);

    private final DbMulticloudGCPProviderWaiters waiters;

    private final DbMulticloudGCPProviderPaginators paginators;

    DbMulticloudGCPProviderClient(
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
                                    .nameFormat("DbMulticloudGCPProvider-waiters-%d")
                                    .build());
            threadPoolExecutor.allowCoreThreadTimeOut(true);

            executorService = threadPoolExecutor;
        }
        this.waiters = new DbMulticloudGCPProviderWaiters(executorService, this);

        this.paginators = new DbMulticloudGCPProviderPaginators(this);
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
                    Builder, DbMulticloudGCPProviderClient> {
        private java.util.concurrent.ExecutorService executorService;

        private Builder(com.oracle.bmc.Service service) {
            super(service);
            final String packageName = "dbmulticloud";
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
        public DbMulticloudGCPProviderClient build(
                @jakarta.annotation.Nonnull
                        com.oracle.bmc.auth.AbstractAuthenticationDetailsProvider
                                authenticationDetailsProvider) {
            return new DbMulticloudGCPProviderClient(
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
    public ChangeOracleDbGcpIdentityConnectorCompartmentResponse
            changeOracleDbGcpIdentityConnectorCompartment(
                    ChangeOracleDbGcpIdentityConnectorCompartmentRequest request) {

        Validate.notBlank(
                request.getOracleDbGcpIdentityConnectorId(),
                "oracleDbGcpIdentityConnectorId must not be blank");
        Objects.requireNonNull(
                request.getChangeOracleDbGcpIdentityConnectorCompartmentDetails(),
                "changeOracleDbGcpIdentityConnectorCompartmentDetails is required");

        return clientCall(request, ChangeOracleDbGcpIdentityConnectorCompartmentResponse::builder)
                .logger(LOG, "changeOracleDbGcpIdentityConnectorCompartment")
                .serviceDetails(
                        "DbMulticloudGCPProvider",
                        "ChangeOracleDbGcpIdentityConnectorCompartment",
                        "https://docs.oracle.com/iaas/api/#/en/database-multicloud-integrations/20240501/OracleDbGcpIdentityConnector/ChangeOracleDbGcpIdentityConnectorCompartment")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(ChangeOracleDbGcpIdentityConnectorCompartmentRequest::builder)
                .basePath("/20240501")
                .appendPathParam("oracleDbGcpIdentityConnector")
                .appendPathParam(request.getOracleDbGcpIdentityConnectorId())
                .appendPathParam("actions")
                .appendPathParam("changeCompartment")
                .accept("application/json")
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .hasBody()
                .handleResponseHeaderString(
                        "opc-request-id",
                        ChangeOracleDbGcpIdentityConnectorCompartmentResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        ChangeOracleDbGcpIdentityConnectorCompartmentResponse.Builder
                                ::opcWorkRequestId)
                .callSync();
    }

    @Override
    public ChangeOracleDbGcpKeyRingCompartmentResponse changeOracleDbGcpKeyRingCompartment(
            ChangeOracleDbGcpKeyRingCompartmentRequest request) {

        Validate.notBlank(
                request.getOracleDbGcpKeyRingId(), "oracleDbGcpKeyRingId must not be blank");
        Objects.requireNonNull(
                request.getChangeOracleDbGcpKeyRingCompartmentDetails(),
                "changeOracleDbGcpKeyRingCompartmentDetails is required");

        return clientCall(request, ChangeOracleDbGcpKeyRingCompartmentResponse::builder)
                .logger(LOG, "changeOracleDbGcpKeyRingCompartment")
                .serviceDetails(
                        "DbMulticloudGCPProvider",
                        "ChangeOracleDbGcpKeyRingCompartment",
                        "https://docs.oracle.com/iaas/api/#/en/database-multicloud-integrations/20240501/OracleDbGcpKeyRing/ChangeOracleDbGcpKeyRingCompartment")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(ChangeOracleDbGcpKeyRingCompartmentRequest::builder)
                .basePath("/20240501")
                .appendPathParam("oracleDbGcpKeyRing")
                .appendPathParam(request.getOracleDbGcpKeyRingId())
                .appendPathParam("actions")
                .appendPathParam("changeCompartment")
                .accept("application/json")
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .hasBody()
                .handleResponseHeaderString(
                        "opc-request-id",
                        ChangeOracleDbGcpKeyRingCompartmentResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        ChangeOracleDbGcpKeyRingCompartmentResponse.Builder::opcWorkRequestId)
                .callSync();
    }

    @Override
    public CreateOracleDbGcpIdentityConnectorResponse createOracleDbGcpIdentityConnector(
            CreateOracleDbGcpIdentityConnectorRequest request) {
        Objects.requireNonNull(
                request.getCreateOracleDbGcpIdentityConnectorDetails(),
                "createOracleDbGcpIdentityConnectorDetails is required");

        return clientCall(request, CreateOracleDbGcpIdentityConnectorResponse::builder)
                .logger(LOG, "createOracleDbGcpIdentityConnector")
                .serviceDetails(
                        "DbMulticloudGCPProvider",
                        "CreateOracleDbGcpIdentityConnector",
                        "https://docs.oracle.com/iaas/api/#/en/database-multicloud-integrations/20240501/OracleDbGcpIdentityConnector/CreateOracleDbGcpIdentityConnector")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(CreateOracleDbGcpIdentityConnectorRequest::builder)
                .basePath("/20240501")
                .appendPathParam("oracleDbGcpIdentityConnector")
                .accept("application/json")
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .hasBody()
                .handleBody(
                        com.oracle.bmc.dbmulticloud.model.OracleDbGcpIdentityConnector.class,
                        CreateOracleDbGcpIdentityConnectorResponse.Builder
                                ::oracleDbGcpIdentityConnector)
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        CreateOracleDbGcpIdentityConnectorResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id",
                        CreateOracleDbGcpIdentityConnectorResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "location", CreateOracleDbGcpIdentityConnectorResponse.Builder::location)
                .handleResponseHeaderString(
                        "content-location",
                        CreateOracleDbGcpIdentityConnectorResponse.Builder::contentLocation)
                .handleResponseHeaderString(
                        "etag", CreateOracleDbGcpIdentityConnectorResponse.Builder::etag)
                .callSync();
    }

    @Override
    public CreateOracleDbGcpKeyRingResponse createOracleDbGcpKeyRing(
            CreateOracleDbGcpKeyRingRequest request) {
        Objects.requireNonNull(
                request.getCreateOracleDbGcpKeyRingDetails(),
                "createOracleDbGcpKeyRingDetails is required");

        return clientCall(request, CreateOracleDbGcpKeyRingResponse::builder)
                .logger(LOG, "createOracleDbGcpKeyRing")
                .serviceDetails(
                        "DbMulticloudGCPProvider",
                        "CreateOracleDbGcpKeyRing",
                        "https://docs.oracle.com/iaas/api/#/en/database-multicloud-integrations/20240501/OracleDbGcpKeyRing/CreateOracleDbGcpKeyRing")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(CreateOracleDbGcpKeyRingRequest::builder)
                .basePath("/20240501")
                .appendPathParam("oracleDbGcpKeyRing")
                .accept("application/json")
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .hasBody()
                .handleBody(
                        com.oracle.bmc.dbmulticloud.model.OracleDbGcpKeyRing.class,
                        CreateOracleDbGcpKeyRingResponse.Builder::oracleDbGcpKeyRing)
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        CreateOracleDbGcpKeyRingResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", CreateOracleDbGcpKeyRingResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "location", CreateOracleDbGcpKeyRingResponse.Builder::location)
                .handleResponseHeaderString(
                        "content-location",
                        CreateOracleDbGcpKeyRingResponse.Builder::contentLocation)
                .handleResponseHeaderString("etag", CreateOracleDbGcpKeyRingResponse.Builder::etag)
                .callSync();
    }

    @Override
    public DeleteOracleDbGcpIdentityConnectorResponse deleteOracleDbGcpIdentityConnector(
            DeleteOracleDbGcpIdentityConnectorRequest request) {

        Validate.notBlank(
                request.getOracleDbGcpIdentityConnectorId(),
                "oracleDbGcpIdentityConnectorId must not be blank");

        return clientCall(request, DeleteOracleDbGcpIdentityConnectorResponse::builder)
                .logger(LOG, "deleteOracleDbGcpIdentityConnector")
                .serviceDetails(
                        "DbMulticloudGCPProvider",
                        "DeleteOracleDbGcpIdentityConnector",
                        "https://docs.oracle.com/iaas/api/#/en/database-multicloud-integrations/20240501/OracleDbGcpIdentityConnector/DeleteOracleDbGcpIdentityConnector")
                .method(com.oracle.bmc.http.client.Method.DELETE)
                .requestBuilder(DeleteOracleDbGcpIdentityConnectorRequest::builder)
                .basePath("/20240501")
                .appendPathParam("oracleDbGcpIdentityConnector")
                .appendPathParam(request.getOracleDbGcpIdentityConnectorId())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .handleResponseHeaderString(
                        "opc-request-id",
                        DeleteOracleDbGcpIdentityConnectorResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        DeleteOracleDbGcpIdentityConnectorResponse.Builder::opcWorkRequestId)
                .callSync();
    }

    @Override
    public DeleteOracleDbGcpKeyRingResponse deleteOracleDbGcpKeyRing(
            DeleteOracleDbGcpKeyRingRequest request) {

        Validate.notBlank(
                request.getOracleDbGcpKeyRingId(), "oracleDbGcpKeyRingId must not be blank");

        return clientCall(request, DeleteOracleDbGcpKeyRingResponse::builder)
                .logger(LOG, "deleteOracleDbGcpKeyRing")
                .serviceDetails(
                        "DbMulticloudGCPProvider",
                        "DeleteOracleDbGcpKeyRing",
                        "https://docs.oracle.com/iaas/api/#/en/database-multicloud-integrations/20240501/OracleDbGcpKeyRing/DeleteOracleDbGcpKeyRing")
                .method(com.oracle.bmc.http.client.Method.DELETE)
                .requestBuilder(DeleteOracleDbGcpKeyRingRequest::builder)
                .basePath("/20240501")
                .appendPathParam("oracleDbGcpKeyRing")
                .appendPathParam(request.getOracleDbGcpKeyRingId())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .handleResponseHeaderString(
                        "opc-request-id", DeleteOracleDbGcpKeyRingResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        DeleteOracleDbGcpKeyRingResponse.Builder::opcWorkRequestId)
                .callSync();
    }

    @Override
    public GetOracleDbGcpIdentityConnectorResponse getOracleDbGcpIdentityConnector(
            GetOracleDbGcpIdentityConnectorRequest request) {

        Validate.notBlank(
                request.getOracleDbGcpIdentityConnectorId(),
                "oracleDbGcpIdentityConnectorId must not be blank");

        return clientCall(request, GetOracleDbGcpIdentityConnectorResponse::builder)
                .logger(LOG, "getOracleDbGcpIdentityConnector")
                .serviceDetails(
                        "DbMulticloudGCPProvider",
                        "GetOracleDbGcpIdentityConnector",
                        "https://docs.oracle.com/iaas/api/#/en/database-multicloud-integrations/20240501/OracleDbGcpIdentityConnector/GetOracleDbGcpIdentityConnector")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetOracleDbGcpIdentityConnectorRequest::builder)
                .basePath("/20240501")
                .appendPathParam("oracleDbGcpIdentityConnector")
                .appendPathParam(request.getOracleDbGcpIdentityConnectorId())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .handleBody(
                        com.oracle.bmc.dbmulticloud.model.OracleDbGcpIdentityConnector.class,
                        GetOracleDbGcpIdentityConnectorResponse.Builder
                                ::oracleDbGcpIdentityConnector)
                .handleResponseHeaderString(
                        "etag", GetOracleDbGcpIdentityConnectorResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id",
                        GetOracleDbGcpIdentityConnectorResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public GetOracleDbGcpKeyResponse getOracleDbGcpKey(GetOracleDbGcpKeyRequest request) {

        Validate.notBlank(request.getOracleDbGcpKeyId(), "oracleDbGcpKeyId must not be blank");

        return clientCall(request, GetOracleDbGcpKeyResponse::builder)
                .logger(LOG, "getOracleDbGcpKey")
                .serviceDetails(
                        "DbMulticloudGCPProvider",
                        "GetOracleDbGcpKey",
                        "https://docs.oracle.com/iaas/api/#/en/database-multicloud-integrations/20240501/OracleDbGcpKey/GetOracleDbGcpKey")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetOracleDbGcpKeyRequest::builder)
                .basePath("/20240501")
                .appendPathParam("oracleDbGcpKey")
                .appendPathParam(request.getOracleDbGcpKeyId())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .handleBody(
                        com.oracle.bmc.dbmulticloud.model.OracleDbGcpKey.class,
                        GetOracleDbGcpKeyResponse.Builder::oracleDbGcpKey)
                .handleResponseHeaderString("etag", GetOracleDbGcpKeyResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", GetOracleDbGcpKeyResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public GetOracleDbGcpKeyRingResponse getOracleDbGcpKeyRing(
            GetOracleDbGcpKeyRingRequest request) {

        Validate.notBlank(
                request.getOracleDbGcpKeyRingId(), "oracleDbGcpKeyRingId must not be blank");

        return clientCall(request, GetOracleDbGcpKeyRingResponse::builder)
                .logger(LOG, "getOracleDbGcpKeyRing")
                .serviceDetails(
                        "DbMulticloudGCPProvider",
                        "GetOracleDbGcpKeyRing",
                        "https://docs.oracle.com/iaas/api/#/en/database-multicloud-integrations/20240501/OracleDbGcpKeyRing/GetOracleDbGcpKeyRing")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetOracleDbGcpKeyRingRequest::builder)
                .basePath("/20240501")
                .appendPathParam("oracleDbGcpKeyRing")
                .appendPathParam(request.getOracleDbGcpKeyRingId())
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .handleBody(
                        com.oracle.bmc.dbmulticloud.model.OracleDbGcpKeyRing.class,
                        GetOracleDbGcpKeyRingResponse.Builder::oracleDbGcpKeyRing)
                .handleResponseHeaderString("etag", GetOracleDbGcpKeyRingResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", GetOracleDbGcpKeyRingResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public ListOracleDbGcpIdentityConnectorsResponse listOracleDbGcpIdentityConnectors(
            ListOracleDbGcpIdentityConnectorsRequest request) {
        Objects.requireNonNull(request.getCompartmentId(), "compartmentId is required");

        return clientCall(request, ListOracleDbGcpIdentityConnectorsResponse::builder)
                .logger(LOG, "listOracleDbGcpIdentityConnectors")
                .serviceDetails(
                        "DbMulticloudGCPProvider",
                        "ListOracleDbGcpIdentityConnectors",
                        "https://docs.oracle.com/iaas/api/#/en/database-multicloud-integrations/20240501/OracleDbGcpIdentityConnector/ListOracleDbGcpIdentityConnectors")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListOracleDbGcpIdentityConnectorsRequest::builder)
                .basePath("/20240501")
                .appendPathParam("oracleDbGcpIdentityConnector")
                .appendQueryParam("compartmentId", request.getCompartmentId())
                .appendQueryParam("displayName", request.getDisplayName())
                .appendQueryParam("resourceId", request.getResourceId())
                .appendEnumQueryParam("lifecycleState", request.getLifecycleState())
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .handleBody(
                        com.oracle.bmc.dbmulticloud.model
                                .OracleDbGcpIdentityConnectorSummaryCollection.class,
                        ListOracleDbGcpIdentityConnectorsResponse.Builder
                                ::oracleDbGcpIdentityConnectorSummaryCollection)
                .handleResponseHeaderString(
                        "opc-request-id",
                        ListOracleDbGcpIdentityConnectorsResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page",
                        ListOracleDbGcpIdentityConnectorsResponse.Builder::opcNextPage)
                .callSync();
    }

    @Override
    public ListOracleDbGcpKeyRingsResponse listOracleDbGcpKeyRings(
            ListOracleDbGcpKeyRingsRequest request) {
        Objects.requireNonNull(request.getCompartmentId(), "compartmentId is required");

        return clientCall(request, ListOracleDbGcpKeyRingsResponse::builder)
                .logger(LOG, "listOracleDbGcpKeyRings")
                .serviceDetails(
                        "DbMulticloudGCPProvider",
                        "ListOracleDbGcpKeyRings",
                        "https://docs.oracle.com/iaas/api/#/en/database-multicloud-integrations/20240501/OracleDbGcpKeyRing/ListOracleDbGcpKeyRings")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListOracleDbGcpKeyRingsRequest::builder)
                .basePath("/20240501")
                .appendPathParam("oracleDbGcpKeyRing")
                .appendQueryParam("compartmentId", request.getCompartmentId())
                .appendQueryParam("displayName", request.getDisplayName())
                .appendQueryParam("oracleDbGcpKeyRingId", request.getOracleDbGcpKeyRingId())
                .appendEnumQueryParam("lifecycleState", request.getLifecycleState())
                .appendQueryParam("oracleDbGcpConnectorId", request.getOracleDbGcpConnectorId())
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .handleBody(
                        com.oracle.bmc.dbmulticloud.model.OracleDbGcpKeyRingSummaryCollection.class,
                        ListOracleDbGcpKeyRingsResponse.Builder
                                ::oracleDbGcpKeyRingSummaryCollection)
                .handleResponseHeaderString(
                        "opc-request-id", ListOracleDbGcpKeyRingsResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListOracleDbGcpKeyRingsResponse.Builder::opcNextPage)
                .callSync();
    }

    @Override
    public ListOracleDbGcpKeysResponse listOracleDbGcpKeys(ListOracleDbGcpKeysRequest request) {
        Objects.requireNonNull(request.getCompartmentId(), "compartmentId is required");

        return clientCall(request, ListOracleDbGcpKeysResponse::builder)
                .logger(LOG, "listOracleDbGcpKeys")
                .serviceDetails(
                        "DbMulticloudGCPProvider",
                        "ListOracleDbGcpKeys",
                        "https://docs.oracle.com/iaas/api/#/en/database-multicloud-integrations/20240501/OracleDbGcpKey/ListOracleDbGcpKeys")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListOracleDbGcpKeysRequest::builder)
                .basePath("/20240501")
                .appendPathParam("oracleDbGcpKey")
                .appendQueryParam("compartmentId", request.getCompartmentId())
                .appendQueryParam("displayName", request.getDisplayName())
                .appendQueryParam("oracleDbGcpKeyRingId", request.getOracleDbGcpKeyRingId())
                .appendQueryParam("oracleDbGcpKeyId", request.getOracleDbGcpKeyId())
                .appendEnumQueryParam("lifecycleState", request.getLifecycleState())
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .handleBody(
                        com.oracle.bmc.dbmulticloud.model.OracleDbGcpKeySummaryCollection.class,
                        ListOracleDbGcpKeysResponse.Builder::oracleDbGcpKeySummaryCollection)
                .handleResponseHeaderString(
                        "opc-request-id", ListOracleDbGcpKeysResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListOracleDbGcpKeysResponse.Builder::opcNextPage)
                .callSync();
    }

    @Override
    public RefreshOracleDbGcpIdentityConnectorResponse refreshOracleDbGcpIdentityConnector(
            RefreshOracleDbGcpIdentityConnectorRequest request) {

        Validate.notBlank(
                request.getOracleDbGcpIdentityConnectorId(),
                "oracleDbGcpIdentityConnectorId must not be blank");

        return clientCall(request, RefreshOracleDbGcpIdentityConnectorResponse::builder)
                .logger(LOG, "refreshOracleDbGcpIdentityConnector")
                .serviceDetails(
                        "DbMulticloudGCPProvider",
                        "RefreshOracleDbGcpIdentityConnector",
                        "https://docs.oracle.com/iaas/api/#/en/database-multicloud-integrations/20240501/OracleDbGcpIdentityConnector/RefreshOracleDbGcpIdentityConnector")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(RefreshOracleDbGcpIdentityConnectorRequest::builder)
                .basePath("/20240501")
                .appendPathParam("oracleDbGcpIdentityConnector")
                .appendPathParam(request.getOracleDbGcpIdentityConnectorId())
                .appendPathParam("actions")
                .appendPathParam("refresh")
                .accept("application/json")
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .handleResponseHeaderString(
                        "opc-request-id",
                        RefreshOracleDbGcpIdentityConnectorResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        RefreshOracleDbGcpIdentityConnectorResponse.Builder::opcWorkRequestId)
                .callSync();
    }

    @Override
    public RefreshOracleDbGcpKeyRingResponse refreshOracleDbGcpKeyRing(
            RefreshOracleDbGcpKeyRingRequest request) {

        Validate.notBlank(
                request.getOracleDbGcpKeyRingId(), "oracleDbGcpKeyRingId must not be blank");
        Objects.requireNonNull(
                request.getRefreshOracleDbGcpKeyRingDetails(),
                "refreshOracleDbGcpKeyRingDetails is required");

        return clientCall(request, RefreshOracleDbGcpKeyRingResponse::builder)
                .logger(LOG, "refreshOracleDbGcpKeyRing")
                .serviceDetails(
                        "DbMulticloudGCPProvider",
                        "RefreshOracleDbGcpKeyRing",
                        "https://docs.oracle.com/iaas/api/#/en/database-multicloud-integrations/20240501/OracleDbGcpKeyRing/RefreshOracleDbGcpKeyRing")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(RefreshOracleDbGcpKeyRingRequest::builder)
                .basePath("/20240501")
                .appendPathParam("oracleDbGcpKeyRing")
                .appendPathParam(request.getOracleDbGcpKeyRingId())
                .appendPathParam("actions")
                .appendPathParam("refresh")
                .accept("application/json")
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .hasBody()
                .handleResponseHeaderString(
                        "opc-request-id", RefreshOracleDbGcpKeyRingResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        RefreshOracleDbGcpKeyRingResponse.Builder::opcWorkRequestId)
                .callSync();
    }

    @Override
    public UpdateOracleDbGcpIdentityConnectorResponse updateOracleDbGcpIdentityConnector(
            UpdateOracleDbGcpIdentityConnectorRequest request) {

        Validate.notBlank(
                request.getOracleDbGcpIdentityConnectorId(),
                "oracleDbGcpIdentityConnectorId must not be blank");
        Objects.requireNonNull(
                request.getUpdateOracleDbGcpIdentityConnectorDetails(),
                "updateOracleDbGcpIdentityConnectorDetails is required");

        return clientCall(request, UpdateOracleDbGcpIdentityConnectorResponse::builder)
                .logger(LOG, "updateOracleDbGcpIdentityConnector")
                .serviceDetails(
                        "DbMulticloudGCPProvider",
                        "UpdateOracleDbGcpIdentityConnector",
                        "https://docs.oracle.com/iaas/api/#/en/database-multicloud-integrations/20240501/OracleDbGcpIdentityConnector/UpdateOracleDbGcpIdentityConnector")
                .method(com.oracle.bmc.http.client.Method.PUT)
                .requestBuilder(UpdateOracleDbGcpIdentityConnectorRequest::builder)
                .basePath("/20240501")
                .appendPathParam("oracleDbGcpIdentityConnector")
                .appendPathParam(request.getOracleDbGcpIdentityConnectorId())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .hasBody()
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        UpdateOracleDbGcpIdentityConnectorResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id",
                        UpdateOracleDbGcpIdentityConnectorResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public UpdateOracleDbGcpKeyRingResponse updateOracleDbGcpKeyRing(
            UpdateOracleDbGcpKeyRingRequest request) {

        Validate.notBlank(
                request.getOracleDbGcpKeyRingId(), "oracleDbGcpKeyRingId must not be blank");
        Objects.requireNonNull(
                request.getUpdateOracleDbGcpKeyRingDetails(),
                "updateOracleDbGcpKeyRingDetails is required");

        return clientCall(request, UpdateOracleDbGcpKeyRingResponse::builder)
                .logger(LOG, "updateOracleDbGcpKeyRing")
                .serviceDetails(
                        "DbMulticloudGCPProvider",
                        "UpdateOracleDbGcpKeyRing",
                        "https://docs.oracle.com/iaas/api/#/en/database-multicloud-integrations/20240501/OracleDbGcpKeyRing/UpdateOracleDbGcpKeyRing")
                .method(com.oracle.bmc.http.client.Method.PUT)
                .requestBuilder(UpdateOracleDbGcpKeyRingRequest::builder)
                .basePath("/20240501")
                .appendPathParam("oracleDbGcpKeyRing")
                .appendPathParam(request.getOracleDbGcpKeyRingId())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .hasBody()
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        UpdateOracleDbGcpKeyRingResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", UpdateOracleDbGcpKeyRingResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public DbMulticloudGCPProviderWaiters getWaiters() {
        return waiters;
    }

    @Override
    public DbMulticloudGCPProviderPaginators getPaginators() {
        return paginators;
    }

    /**
     * Create a new client instance.
     *
     * @param authenticationDetailsProvider The authentication details (see {@link Builder#build})
     * @deprecated Use the {@link #builder() builder} instead.
     */
    @Deprecated
    public DbMulticloudGCPProviderClient(
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
    public DbMulticloudGCPProviderClient(
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
    public DbMulticloudGCPProviderClient(
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
    public DbMulticloudGCPProviderClient(
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
    public DbMulticloudGCPProviderClient(
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
    public DbMulticloudGCPProviderClient(
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
    public DbMulticloudGCPProviderClient(
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
    public DbMulticloudGCPProviderClient(
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
