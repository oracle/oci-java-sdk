/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.vault;

import com.oracle.bmc.util.internal.Validate;
import com.oracle.bmc.vault.requests.*;
import com.oracle.bmc.vault.responses.*;

import java.util.Objects;

/**
 * Async client implementation for Vaults service. <br>
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
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20180608")
public class VaultsAsyncClient extends com.oracle.bmc.http.internal.BaseAsyncClient
        implements VaultsAsync {
    /** Service instance for Vaults. */
    public static final com.oracle.bmc.Service SERVICE =
            com.oracle.bmc.Services.serviceBuilder()
                    .serviceName("VAULTS")
                    .serviceEndpointPrefix("")
                    .serviceEndpointTemplate("https://vaults.{region}.oci.{secondLevelDomain}")
                    .build();

    private static final org.slf4j.Logger LOG =
            org.slf4j.LoggerFactory.getLogger(VaultsAsyncClient.class);

    VaultsAsyncClient(
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
            extends com.oracle.bmc.common.RegionalClientBuilder<Builder, VaultsAsyncClient> {
        private Builder(com.oracle.bmc.Service service) {
            super(service);
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
        public VaultsAsyncClient build(
                @jakarta.annotation.Nonnull
                        com.oracle.bmc.auth.AbstractAuthenticationDetailsProvider
                                authenticationDetailsProvider) {
            return new VaultsAsyncClient(this, authenticationDetailsProvider);
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
    public java.util.concurrent.Future<CancelSecretDeletionResponse> cancelSecretDeletion(
            CancelSecretDeletionRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            CancelSecretDeletionRequest, CancelSecretDeletionResponse>
                    handler) {

        Validate.notBlank(request.getSecretId(), "secretId must not be blank");

        return clientCall(request, CancelSecretDeletionResponse::builder)
                .logger(LOG, "cancelSecretDeletion")
                .serviceDetails(
                        "Vaults",
                        "CancelSecretDeletion",
                        "https://docs.oracle.com/iaas/api/#/en/secretmgmt/20180608/Secret/CancelSecretDeletion")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(CancelSecretDeletionRequest::builder)
                .basePath("/20180608")
                .appendPathParam("secrets")
                .appendPathParam(request.getSecretId())
                .appendPathParam("actions")
                .appendPathParam("cancelDeletion")
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleResponseHeaderString("etag", CancelSecretDeletionResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", CancelSecretDeletionResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<CancelSecretVersionDeletionResponse>
            cancelSecretVersionDeletion(
                    CancelSecretVersionDeletionRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    CancelSecretVersionDeletionRequest,
                                    CancelSecretVersionDeletionResponse>
                            handler) {

        Validate.notBlank(request.getSecretId(), "secretId must not be blank");

        return clientCall(request, CancelSecretVersionDeletionResponse::builder)
                .logger(LOG, "cancelSecretVersionDeletion")
                .serviceDetails(
                        "Vaults",
                        "CancelSecretVersionDeletion",
                        "https://docs.oracle.com/iaas/api/#/en/secretmgmt/20180608/SecretVersion/CancelSecretVersionDeletion")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(CancelSecretVersionDeletionRequest::builder)
                .basePath("/20180608")
                .appendPathParam("secrets")
                .appendPathParam(request.getSecretId())
                .appendPathParam("version")
                .appendPathParam(request.getSecretVersionNumber())
                .appendPathParam("actions")
                .appendPathParam("cancelDeletion")
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleResponseHeaderString(
                        "etag", CancelSecretVersionDeletionResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", CancelSecretVersionDeletionResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ChangeSecretCompartmentResponse> changeSecretCompartment(
            ChangeSecretCompartmentRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ChangeSecretCompartmentRequest, ChangeSecretCompartmentResponse>
                    handler) {

        Validate.notBlank(request.getSecretId(), "secretId must not be blank");
        Objects.requireNonNull(
                request.getChangeSecretCompartmentDetails(),
                "changeSecretCompartmentDetails is required");

        return clientCall(request, ChangeSecretCompartmentResponse::builder)
                .logger(LOG, "changeSecretCompartment")
                .serviceDetails(
                        "Vaults",
                        "ChangeSecretCompartment",
                        "https://docs.oracle.com/iaas/api/#/en/secretmgmt/20180608/Secret/ChangeSecretCompartment")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(ChangeSecretCompartmentRequest::builder)
                .basePath("/20180608")
                .appendPathParam("secrets")
                .appendPathParam(request.getSecretId())
                .appendPathParam("actions")
                .appendPathParam("changeCompartment")
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .hasBody()
                .handleResponseHeaderString("etag", ChangeSecretCompartmentResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", ChangeSecretCompartmentResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<CreateSecretResponse> createSecret(
            CreateSecretRequest request,
            final com.oracle.bmc.responses.AsyncHandler<CreateSecretRequest, CreateSecretResponse>
                    handler) {
        Objects.requireNonNull(request.getCreateSecretDetails(), "createSecretDetails is required");

        return clientCall(request, CreateSecretResponse::builder)
                .logger(LOG, "createSecret")
                .serviceDetails(
                        "Vaults",
                        "CreateSecret",
                        "https://docs.oracle.com/iaas/api/#/en/secretmgmt/20180608/Secret/CreateSecret")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(CreateSecretRequest::builder)
                .basePath("/20180608")
                .appendPathParam("secrets")
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.vault.model.Secret.class,
                        CreateSecretResponse.Builder::secret)
                .handleResponseHeaderString("etag", CreateSecretResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", CreateSecretResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<GetSecretResponse> getSecret(
            GetSecretRequest request,
            final com.oracle.bmc.responses.AsyncHandler<GetSecretRequest, GetSecretResponse>
                    handler) {

        Validate.notBlank(request.getSecretId(), "secretId must not be blank");

        return clientCall(request, GetSecretResponse::builder)
                .logger(LOG, "getSecret")
                .serviceDetails(
                        "Vaults",
                        "GetSecret",
                        "https://docs.oracle.com/iaas/api/#/en/secretmgmt/20180608/Secret/GetSecret")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetSecretRequest::builder)
                .basePath("/20180608")
                .appendPathParam("secrets")
                .appendPathParam(request.getSecretId())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.vault.model.Secret.class, GetSecretResponse.Builder::secret)
                .handleResponseHeaderString("etag", GetSecretResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", GetSecretResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<GetSecretVersionResponse> getSecretVersion(
            GetSecretVersionRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            GetSecretVersionRequest, GetSecretVersionResponse>
                    handler) {

        Validate.notBlank(request.getSecretId(), "secretId must not be blank");

        return clientCall(request, GetSecretVersionResponse::builder)
                .logger(LOG, "getSecretVersion")
                .serviceDetails(
                        "Vaults",
                        "GetSecretVersion",
                        "https://docs.oracle.com/iaas/api/#/en/secretmgmt/20180608/SecretVersion/GetSecretVersion")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetSecretVersionRequest::builder)
                .basePath("/20180608")
                .appendPathParam("secrets")
                .appendPathParam(request.getSecretId())
                .appendPathParam("version")
                .appendPathParam(request.getSecretVersionNumber())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.vault.model.SecretVersion.class,
                        GetSecretVersionResponse.Builder::secretVersion)
                .handleResponseHeaderString("etag", GetSecretVersionResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", GetSecretVersionResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ListSecretVersionsResponse> listSecretVersions(
            ListSecretVersionsRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ListSecretVersionsRequest, ListSecretVersionsResponse>
                    handler) {

        Validate.notBlank(request.getSecretId(), "secretId must not be blank");

        return clientCall(request, ListSecretVersionsResponse::builder)
                .logger(LOG, "listSecretVersions")
                .serviceDetails(
                        "Vaults",
                        "ListSecretVersions",
                        "https://docs.oracle.com/iaas/api/#/en/secretmgmt/20180608/SecretVersionSummary/ListSecretVersions")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListSecretVersionsRequest::builder)
                .basePath("/20180608")
                .appendPathParam("secrets")
                .appendPathParam(request.getSecretId())
                .appendPathParam("versions")
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBodyList(
                        com.oracle.bmc.vault.model.SecretVersionSummary.class,
                        ListSecretVersionsResponse.Builder::items)
                .handleResponseHeaderString(
                        "opc-next-page", ListSecretVersionsResponse.Builder::opcNextPage)
                .handleResponseHeaderString(
                        "opc-request-id", ListSecretVersionsResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ListSecretsResponse> listSecrets(
            ListSecretsRequest request,
            final com.oracle.bmc.responses.AsyncHandler<ListSecretsRequest, ListSecretsResponse>
                    handler) {
        Objects.requireNonNull(request.getCompartmentId(), "compartmentId is required");

        return clientCall(request, ListSecretsResponse::builder)
                .logger(LOG, "listSecrets")
                .serviceDetails(
                        "Vaults",
                        "ListSecrets",
                        "https://docs.oracle.com/iaas/api/#/en/secretmgmt/20180608/SecretSummary/ListSecrets")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListSecretsRequest::builder)
                .basePath("/20180608")
                .appendPathParam("secrets")
                .appendQueryParam("compartmentId", request.getCompartmentId())
                .appendQueryParam("name", request.getName())
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .appendQueryParam("vaultId", request.getVaultId())
                .appendEnumQueryParam("lifecycleState", request.getLifecycleState())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBodyList(
                        com.oracle.bmc.vault.model.SecretSummary.class,
                        ListSecretsResponse.Builder::items)
                .handleResponseHeaderString(
                        "opc-next-page", ListSecretsResponse.Builder::opcNextPage)
                .handleResponseHeaderString(
                        "opc-request-id", ListSecretsResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ScheduleSecretDeletionResponse> scheduleSecretDeletion(
            ScheduleSecretDeletionRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ScheduleSecretDeletionRequest, ScheduleSecretDeletionResponse>
                    handler) {

        Validate.notBlank(request.getSecretId(), "secretId must not be blank");
        Objects.requireNonNull(
                request.getScheduleSecretDeletionDetails(),
                "scheduleSecretDeletionDetails is required");

        return clientCall(request, ScheduleSecretDeletionResponse::builder)
                .logger(LOG, "scheduleSecretDeletion")
                .serviceDetails(
                        "Vaults",
                        "ScheduleSecretDeletion",
                        "https://docs.oracle.com/iaas/api/#/en/secretmgmt/20180608/Secret/ScheduleSecretDeletion")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(ScheduleSecretDeletionRequest::builder)
                .basePath("/20180608")
                .appendPathParam("secrets")
                .appendPathParam(request.getSecretId())
                .appendPathParam("actions")
                .appendPathParam("scheduleDeletion")
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .hasBody()
                .handleResponseHeaderString("etag", ScheduleSecretDeletionResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", ScheduleSecretDeletionResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ScheduleSecretVersionDeletionResponse>
            scheduleSecretVersionDeletion(
                    ScheduleSecretVersionDeletionRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    ScheduleSecretVersionDeletionRequest,
                                    ScheduleSecretVersionDeletionResponse>
                            handler) {

        Validate.notBlank(request.getSecretId(), "secretId must not be blank");

        Objects.requireNonNull(
                request.getScheduleSecretVersionDeletionDetails(),
                "scheduleSecretVersionDeletionDetails is required");

        return clientCall(request, ScheduleSecretVersionDeletionResponse::builder)
                .logger(LOG, "scheduleSecretVersionDeletion")
                .serviceDetails(
                        "Vaults",
                        "ScheduleSecretVersionDeletion",
                        "https://docs.oracle.com/iaas/api/#/en/secretmgmt/20180608/SecretVersion/ScheduleSecretVersionDeletion")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(ScheduleSecretVersionDeletionRequest::builder)
                .basePath("/20180608")
                .appendPathParam("secrets")
                .appendPathParam(request.getSecretId())
                .appendPathParam("version")
                .appendPathParam(request.getSecretVersionNumber())
                .appendPathParam("actions")
                .appendPathParam("scheduleDeletion")
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .hasBody()
                .handleResponseHeaderString(
                        "etag", ScheduleSecretVersionDeletionResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id",
                        ScheduleSecretVersionDeletionResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<UpdateSecretResponse> updateSecret(
            UpdateSecretRequest request,
            final com.oracle.bmc.responses.AsyncHandler<UpdateSecretRequest, UpdateSecretResponse>
                    handler) {

        Validate.notBlank(request.getSecretId(), "secretId must not be blank");
        Objects.requireNonNull(request.getUpdateSecretDetails(), "updateSecretDetails is required");

        return clientCall(request, UpdateSecretResponse::builder)
                .logger(LOG, "updateSecret")
                .serviceDetails(
                        "Vaults",
                        "UpdateSecret",
                        "https://docs.oracle.com/iaas/api/#/en/secretmgmt/20180608/Secret/UpdateSecret")
                .method(com.oracle.bmc.http.client.Method.PUT)
                .requestBuilder(UpdateSecretRequest::builder)
                .basePath("/20180608")
                .appendPathParam("secrets")
                .appendPathParam(request.getSecretId())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.vault.model.Secret.class,
                        UpdateSecretResponse.Builder::secret)
                .handleResponseHeaderString("etag", UpdateSecretResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", UpdateSecretResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    /**
     * Create a new client instance.
     *
     * @param authenticationDetailsProvider The authentication details (see {@link Builder#build})
     * @deprecated Use the {@link #builder() builder} instead.
     */
    @Deprecated
    public VaultsAsyncClient(
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
    public VaultsAsyncClient(
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
    public VaultsAsyncClient(
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
    public VaultsAsyncClient(
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
    public VaultsAsyncClient(
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
    public VaultsAsyncClient(
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
    public VaultsAsyncClient(
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
