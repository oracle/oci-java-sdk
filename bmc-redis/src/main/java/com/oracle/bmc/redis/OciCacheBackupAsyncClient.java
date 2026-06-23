/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.redis;

import com.oracle.bmc.util.internal.Validate;
import com.oracle.bmc.redis.requests.*;
import com.oracle.bmc.redis.responses.*;

import java.util.Objects;

/**
 * Async client implementation for OciCacheBackup service. <br>
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
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20220315")
public class OciCacheBackupAsyncClient extends com.oracle.bmc.http.internal.BaseAsyncClient
        implements OciCacheBackupAsync {
    /** Service instance for OciCacheBackup. */
    public static final com.oracle.bmc.Service SERVICE =
            com.oracle.bmc.Services.serviceBuilder()
                    .serviceName(OciCacheBackupClient.class.getName())
                    .serviceEndpointPrefix("")
                    .serviceEndpointTemplate("https://redis.{region}.oci.{secondLevelDomain}")
                    .build();

    private static final org.slf4j.Logger LOG =
            org.slf4j.LoggerFactory.getLogger(OciCacheBackupAsyncClient.class);

    OciCacheBackupAsyncClient(
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
                    Builder, OciCacheBackupAsyncClient> {
        private Builder(com.oracle.bmc.Service service) {
            super(service);
            final String packageName = "redis";
            com.oracle.bmc.internal.DeveloperToolConfiguration
                    .throwDisabledServiceExceptionIfAppropriate(packageName);
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
        public OciCacheBackupAsyncClient build(
                @jakarta.annotation.Nonnull
                        com.oracle.bmc.auth.AbstractAuthenticationDetailsProvider
                                authenticationDetailsProvider) {
            return new OciCacheBackupAsyncClient(this, authenticationDetailsProvider);
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
    public java.util.concurrent.Future<ChangeOciCacheBackupCompartmentResponse>
            changeOciCacheBackupCompartment(
                    ChangeOciCacheBackupCompartmentRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    ChangeOciCacheBackupCompartmentRequest,
                                    ChangeOciCacheBackupCompartmentResponse>
                            handler) {

        Validate.notBlank(request.getOciCacheBackupId(), "ociCacheBackupId must not be blank");
        Objects.requireNonNull(
                request.getChangeOciCacheBackupCompartmentDetails(),
                "changeOciCacheBackupCompartmentDetails is required");

        return clientCall(request, ChangeOciCacheBackupCompartmentResponse::builder)
                .logger(LOG, "changeOciCacheBackupCompartment")
                .serviceDetails(
                        "OciCacheBackup",
                        "ChangeOciCacheBackupCompartment",
                        "https://docs.oracle.com/iaas/api/#/en/ocicache/20220315/OciCacheBackup/ChangeOciCacheBackupCompartment")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(ChangeOciCacheBackupCompartmentRequest::builder)
                .basePath("/20220315")
                .appendPathParam("ociCacheBackups")
                .appendPathParam(request.getOciCacheBackupId())
                .appendPathParam("actions")
                .appendPathParam("changeCompartment")
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .hasBody()
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        ChangeOciCacheBackupCompartmentResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id",
                        ChangeOciCacheBackupCompartmentResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<CreateOciCacheBackupResponse> createOciCacheBackup(
            CreateOciCacheBackupRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            CreateOciCacheBackupRequest, CreateOciCacheBackupResponse>
                    handler) {
        Objects.requireNonNull(
                request.getCreateOciCacheBackupDetails(),
                "createOciCacheBackupDetails is required");

        return clientCall(request, CreateOciCacheBackupResponse::builder)
                .logger(LOG, "createOciCacheBackup")
                .serviceDetails(
                        "OciCacheBackup",
                        "CreateOciCacheBackup",
                        "https://docs.oracle.com/iaas/api/#/en/ocicache/20220315/OciCacheBackup/CreateOciCacheBackup")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(CreateOciCacheBackupRequest::builder)
                .basePath("/20220315")
                .appendPathParam("ociCacheBackups")
                .accept("application/json")
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.redis.model.OciCacheBackup.class,
                        CreateOciCacheBackupResponse.Builder::ociCacheBackup)
                .handleResponseHeaderString("etag", CreateOciCacheBackupResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        CreateOciCacheBackupResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", CreateOciCacheBackupResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<DeleteOciCacheBackupResponse> deleteOciCacheBackup(
            DeleteOciCacheBackupRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            DeleteOciCacheBackupRequest, DeleteOciCacheBackupResponse>
                    handler) {

        Validate.notBlank(request.getOciCacheBackupId(), "ociCacheBackupId must not be blank");

        return clientCall(request, DeleteOciCacheBackupResponse::builder)
                .logger(LOG, "deleteOciCacheBackup")
                .serviceDetails(
                        "OciCacheBackup",
                        "DeleteOciCacheBackup",
                        "https://docs.oracle.com/iaas/api/#/en/ocicache/20220315/OciCacheBackup/DeleteOciCacheBackup")
                .method(com.oracle.bmc.http.client.Method.DELETE)
                .requestBuilder(DeleteOciCacheBackupRequest::builder)
                .basePath("/20220315")
                .appendPathParam("ociCacheBackups")
                .appendPathParam(request.getOciCacheBackupId())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        DeleteOciCacheBackupResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", DeleteOciCacheBackupResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ExportOciCacheBackupToObjectStorageResponse>
            exportOciCacheBackupToObjectStorage(
                    ExportOciCacheBackupToObjectStorageRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    ExportOciCacheBackupToObjectStorageRequest,
                                    ExportOciCacheBackupToObjectStorageResponse>
                            handler) {

        Validate.notBlank(request.getOciCacheBackupId(), "ociCacheBackupId must not be blank");
        Objects.requireNonNull(
                request.getExportOciCacheBackupToObjectStorageDetails(),
                "exportOciCacheBackupToObjectStorageDetails is required");

        return clientCall(request, ExportOciCacheBackupToObjectStorageResponse::builder)
                .logger(LOG, "exportOciCacheBackupToObjectStorage")
                .serviceDetails(
                        "OciCacheBackup",
                        "ExportOciCacheBackupToObjectStorage",
                        "https://docs.oracle.com/iaas/api/#/en/ocicache/20220315/OciCacheBackup/ExportOciCacheBackupToObjectStorage")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(ExportOciCacheBackupToObjectStorageRequest::builder)
                .basePath("/20220315")
                .appendPathParam("ociCacheBackups")
                .appendPathParam(request.getOciCacheBackupId())
                .appendPathParam("actions")
                .appendPathParam("exportToObjectStorage")
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .hasBody()
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        ExportOciCacheBackupToObjectStorageResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id",
                        ExportOciCacheBackupToObjectStorageResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<GetOciCacheBackupResponse> getOciCacheBackup(
            GetOciCacheBackupRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            GetOciCacheBackupRequest, GetOciCacheBackupResponse>
                    handler) {

        Validate.notBlank(request.getOciCacheBackupId(), "ociCacheBackupId must not be blank");

        return clientCall(request, GetOciCacheBackupResponse::builder)
                .logger(LOG, "getOciCacheBackup")
                .serviceDetails(
                        "OciCacheBackup",
                        "GetOciCacheBackup",
                        "https://docs.oracle.com/iaas/api/#/en/ocicache/20220315/OciCacheBackup/GetOciCacheBackup")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetOciCacheBackupRequest::builder)
                .basePath("/20220315")
                .appendPathParam("ociCacheBackups")
                .appendPathParam(request.getOciCacheBackupId())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.redis.model.OciCacheBackup.class,
                        GetOciCacheBackupResponse.Builder::ociCacheBackup)
                .handleResponseHeaderString("etag", GetOciCacheBackupResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", GetOciCacheBackupResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ListOciCacheBackupsResponse> listOciCacheBackups(
            ListOciCacheBackupsRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ListOciCacheBackupsRequest, ListOciCacheBackupsResponse>
                    handler) {

        return clientCall(request, ListOciCacheBackupsResponse::builder)
                .logger(LOG, "listOciCacheBackups")
                .serviceDetails(
                        "OciCacheBackup",
                        "ListOciCacheBackups",
                        "https://docs.oracle.com/iaas/api/#/en/ocicache/20220315/OciCacheBackupSummary/ListOciCacheBackups")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListOciCacheBackupsRequest::builder)
                .basePath("/20220315")
                .appendPathParam("ociCacheBackups")
                .appendQueryParam("compartmentId", request.getCompartmentId())
                .appendEnumQueryParam("lifecycleState", request.getLifecycleState())
                .appendQueryParam("displayName", request.getDisplayName())
                .appendQueryParam("ociCacheBackupId", request.getOciCacheBackupId())
                .appendQueryParam("sourceClusterId", request.getSourceClusterId())
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.redis.model.OciCacheBackupCollection.class,
                        ListOciCacheBackupsResponse.Builder::ociCacheBackupCollection)
                .handleResponseHeaderString(
                        "opc-request-id", ListOciCacheBackupsResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListOciCacheBackupsResponse.Builder::opcNextPage)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<UpdateOciCacheBackupResponse> updateOciCacheBackup(
            UpdateOciCacheBackupRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            UpdateOciCacheBackupRequest, UpdateOciCacheBackupResponse>
                    handler) {

        Validate.notBlank(request.getOciCacheBackupId(), "ociCacheBackupId must not be blank");
        Objects.requireNonNull(
                request.getUpdateOciCacheBackupDetails(),
                "updateOciCacheBackupDetails is required");

        return clientCall(request, UpdateOciCacheBackupResponse::builder)
                .logger(LOG, "updateOciCacheBackup")
                .serviceDetails(
                        "OciCacheBackup",
                        "UpdateOciCacheBackup",
                        "https://docs.oracle.com/iaas/api/#/en/ocicache/20220315/OciCacheBackup/UpdateOciCacheBackup")
                .method(com.oracle.bmc.http.client.Method.PUT)
                .requestBuilder(UpdateOciCacheBackupRequest::builder)
                .basePath("/20220315")
                .appendPathParam("ociCacheBackups")
                .appendPathParam(request.getOciCacheBackupId())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.redis.model.OciCacheBackup.class,
                        UpdateOciCacheBackupResponse.Builder::ociCacheBackup)
                .handleResponseHeaderString("etag", UpdateOciCacheBackupResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        UpdateOciCacheBackupResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", UpdateOciCacheBackupResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    /**
     * Create a new client instance.
     *
     * @param authenticationDetailsProvider The authentication details (see {@link Builder#build})
     * @deprecated Use the {@link #builder() builder} instead.
     */
    @Deprecated
    public OciCacheBackupAsyncClient(
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
    public OciCacheBackupAsyncClient(
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
    public OciCacheBackupAsyncClient(
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
    public OciCacheBackupAsyncClient(
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
    public OciCacheBackupAsyncClient(
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
    public OciCacheBackupAsyncClient(
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
    public OciCacheBackupAsyncClient(
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
