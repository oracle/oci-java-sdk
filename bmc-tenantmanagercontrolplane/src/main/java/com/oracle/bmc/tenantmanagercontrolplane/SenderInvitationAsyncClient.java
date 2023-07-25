/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.tenantmanagercontrolplane;

import com.oracle.bmc.util.internal.Validate;
import com.oracle.bmc.tenantmanagercontrolplane.requests.*;
import com.oracle.bmc.tenantmanagercontrolplane.responses.*;

import java.util.Objects;

/**
 * Async client implementation for SenderInvitation service. <br>
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
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20230401")
public class SenderInvitationAsyncClient extends com.oracle.bmc.http.internal.BaseAsyncClient
        implements SenderInvitationAsync {
    /** Service instance for SenderInvitation. */
    public static final com.oracle.bmc.Service SERVICE =
            com.oracle.bmc.Services.serviceBuilder()
                    .serviceName("SENDERINVITATION")
                    .serviceEndpointPrefix("")
                    .serviceEndpointTemplate(
                            "https://organizations.{region}.oci.{secondLevelDomain}")
                    .build();

    private static final org.slf4j.Logger LOG =
            org.slf4j.LoggerFactory.getLogger(SenderInvitationAsyncClient.class);

    SenderInvitationAsyncClient(
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
                    Builder, SenderInvitationAsyncClient> {
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
        public SenderInvitationAsyncClient build(
                @jakarta.annotation.Nonnull
                        com.oracle.bmc.auth.AbstractAuthenticationDetailsProvider
                                authenticationDetailsProvider) {
            return new SenderInvitationAsyncClient(this, authenticationDetailsProvider);
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
    public java.util.concurrent.Future<CancelSenderInvitationResponse> cancelSenderInvitation(
            CancelSenderInvitationRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            CancelSenderInvitationRequest, CancelSenderInvitationResponse>
                    handler) {

        Validate.notBlank(request.getSenderInvitationId(), "senderInvitationId must not be blank");

        return clientCall(request, CancelSenderInvitationResponse::builder)
                .logger(LOG, "cancelSenderInvitation")
                .serviceDetails(
                        "SenderInvitation",
                        "CancelSenderInvitation",
                        "https://docs.oracle.com/iaas/api/#/en/organizations/20230401/SenderInvitation/CancelSenderInvitation")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(CancelSenderInvitationRequest::builder)
                .basePath("/20230401")
                .appendPathParam("senderInvitations")
                .appendPathParam(request.getSenderInvitationId())
                .appendPathParam("actions")
                .appendPathParam("cancel")
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleResponseHeaderString(
                        "opc-request-id", CancelSenderInvitationResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        CancelSenderInvitationResponse.Builder::opcWorkRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<CreateSenderInvitationResponse> createSenderInvitation(
            CreateSenderInvitationRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            CreateSenderInvitationRequest, CreateSenderInvitationResponse>
                    handler) {
        Objects.requireNonNull(
                request.getCreateSenderInvitationDetails(),
                "createSenderInvitationDetails is required");

        return clientCall(request, CreateSenderInvitationResponse::builder)
                .logger(LOG, "createSenderInvitation")
                .serviceDetails(
                        "SenderInvitation",
                        "CreateSenderInvitation",
                        "https://docs.oracle.com/iaas/api/#/en/organizations/20230401/SenderInvitation/CreateSenderInvitation")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(CreateSenderInvitationRequest::builder)
                .basePath("/20230401")
                .appendPathParam("senderInvitations")
                .accept("application/json")
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.tenantmanagercontrolplane.model.SenderInvitation.class,
                        CreateSenderInvitationResponse.Builder::senderInvitation)
                .handleResponseHeaderString(
                        "opc-request-id", CreateSenderInvitationResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        CreateSenderInvitationResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString("etag", CreateSenderInvitationResponse.Builder::etag)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<GetSenderInvitationResponse> getSenderInvitation(
            GetSenderInvitationRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            GetSenderInvitationRequest, GetSenderInvitationResponse>
                    handler) {

        Validate.notBlank(request.getSenderInvitationId(), "senderInvitationId must not be blank");

        return clientCall(request, GetSenderInvitationResponse::builder)
                .logger(LOG, "getSenderInvitation")
                .serviceDetails(
                        "SenderInvitation",
                        "GetSenderInvitation",
                        "https://docs.oracle.com/iaas/api/#/en/organizations/20230401/SenderInvitation/GetSenderInvitation")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetSenderInvitationRequest::builder)
                .basePath("/20230401")
                .appendPathParam("senderInvitations")
                .appendPathParam(request.getSenderInvitationId())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.tenantmanagercontrolplane.model.SenderInvitation.class,
                        GetSenderInvitationResponse.Builder::senderInvitation)
                .handleResponseHeaderString("etag", GetSenderInvitationResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", GetSenderInvitationResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ListSenderInvitationsResponse> listSenderInvitations(
            ListSenderInvitationsRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ListSenderInvitationsRequest, ListSenderInvitationsResponse>
                    handler) {
        Objects.requireNonNull(request.getCompartmentId(), "compartmentId is required");

        return clientCall(request, ListSenderInvitationsResponse::builder)
                .logger(LOG, "listSenderInvitations")
                .serviceDetails(
                        "SenderInvitation",
                        "ListSenderInvitations",
                        "https://docs.oracle.com/iaas/api/#/en/organizations/20230401/SenderInvitation/ListSenderInvitations")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListSenderInvitationsRequest::builder)
                .basePath("/20230401")
                .appendPathParam("senderInvitations")
                .appendQueryParam("compartmentId", request.getCompartmentId())
                .appendQueryParam("recipientTenancyId", request.getRecipientTenancyId())
                .appendEnumQueryParam("lifecycleState", request.getLifecycleState())
                .appendEnumQueryParam("status", request.getStatus())
                .appendQueryParam("displayName", request.getDisplayName())
                .appendQueryParam("page", request.getPage())
                .appendQueryParam("limit", request.getLimit())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.tenantmanagercontrolplane.model.SenderInvitationCollection
                                .class,
                        ListSenderInvitationsResponse.Builder::senderInvitationCollection)
                .handleResponseHeaderString(
                        "opc-next-page", ListSenderInvitationsResponse.Builder::opcNextPage)
                .handleResponseHeaderString(
                        "opc-request-id", ListSenderInvitationsResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<UpdateSenderInvitationResponse> updateSenderInvitation(
            UpdateSenderInvitationRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            UpdateSenderInvitationRequest, UpdateSenderInvitationResponse>
                    handler) {

        Validate.notBlank(request.getSenderInvitationId(), "senderInvitationId must not be blank");
        Objects.requireNonNull(
                request.getUpdateSenderInvitationDetails(),
                "updateSenderInvitationDetails is required");

        return clientCall(request, UpdateSenderInvitationResponse::builder)
                .logger(LOG, "updateSenderInvitation")
                .serviceDetails(
                        "SenderInvitation",
                        "UpdateSenderInvitation",
                        "https://docs.oracle.com/iaas/api/#/en/organizations/20230401/SenderInvitation/UpdateSenderInvitation")
                .method(com.oracle.bmc.http.client.Method.PUT)
                .requestBuilder(UpdateSenderInvitationRequest::builder)
                .basePath("/20230401")
                .appendPathParam("senderInvitations")
                .appendPathParam(request.getSenderInvitationId())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.tenantmanagercontrolplane.model.SenderInvitation.class,
                        UpdateSenderInvitationResponse.Builder::senderInvitation)
                .handleResponseHeaderString(
                        "opc-request-id", UpdateSenderInvitationResponse.Builder::opcRequestId)
                .handleResponseHeaderString("etag", UpdateSenderInvitationResponse.Builder::etag)
                .callAsync(handler);
    }

    /**
     * Create a new client instance.
     *
     * @param authenticationDetailsProvider The authentication details (see {@link Builder#build})
     * @deprecated Use the {@link #builder() builder} instead.
     */
    @Deprecated
    public SenderInvitationAsyncClient(
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
    public SenderInvitationAsyncClient(
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
    public SenderInvitationAsyncClient(
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
    public SenderInvitationAsyncClient(
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
    public SenderInvitationAsyncClient(
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
    public SenderInvitationAsyncClient(
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
    public SenderInvitationAsyncClient(
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
