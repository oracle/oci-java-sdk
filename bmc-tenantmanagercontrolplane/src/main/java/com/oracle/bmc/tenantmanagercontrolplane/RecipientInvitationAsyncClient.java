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
 * Async client implementation for RecipientInvitation service. <br>
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
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200801")
public class RecipientInvitationAsyncClient extends com.oracle.bmc.http.internal.BaseAsyncClient
        implements RecipientInvitationAsync {
    /** Service instance for RecipientInvitation. */
    public static final com.oracle.bmc.Service SERVICE =
            com.oracle.bmc.Services.serviceBuilder()
                    .serviceName("RECIPIENTINVITATION")
                    .serviceEndpointPrefix("")
                    .serviceEndpointTemplate(
                            "https://organizations.{region}.oci.{secondLevelDomain}")
                    .build();

    private static final org.slf4j.Logger LOG =
            org.slf4j.LoggerFactory.getLogger(RecipientInvitationAsyncClient.class);

    private RecipientInvitationAsyncClient(
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
                    Builder, RecipientInvitationAsyncClient> {
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
        public RecipientInvitationAsyncClient build(
                @jakarta.annotation.Nonnull
                        com.oracle.bmc.auth.AbstractAuthenticationDetailsProvider
                                authenticationDetailsProvider) {
            return new RecipientInvitationAsyncClient(this, authenticationDetailsProvider);
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
    public java.util.concurrent.Future<AcceptRecipientInvitationResponse> acceptRecipientInvitation(
            AcceptRecipientInvitationRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            AcceptRecipientInvitationRequest, AcceptRecipientInvitationResponse>
                    handler) {

        Validate.notBlank(
                request.getRecipientInvitationId(), "recipientInvitationId must not be blank");

        return clientCall(request, AcceptRecipientInvitationResponse::builder)
                .logger(LOG, "acceptRecipientInvitation")
                .serviceDetails(
                        "RecipientInvitation",
                        "AcceptRecipientInvitation",
                        "https://docs.oracle.com/iaas/api/#/en/organizations/20200801/RecipientInvitation/AcceptRecipientInvitation")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(AcceptRecipientInvitationRequest::builder)
                .basePath("/20200801")
                .appendPathParam("recipientInvitations")
                .appendPathParam(request.getRecipientInvitationId())
                .appendPathParam("actions")
                .appendPathParam("accept")
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleResponseHeaderString(
                        "opc-request-id", AcceptRecipientInvitationResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        AcceptRecipientInvitationResponse.Builder::opcWorkRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<GetRecipientInvitationResponse> getRecipientInvitation(
            GetRecipientInvitationRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            GetRecipientInvitationRequest, GetRecipientInvitationResponse>
                    handler) {

        Validate.notBlank(
                request.getRecipientInvitationId(), "recipientInvitationId must not be blank");

        return clientCall(request, GetRecipientInvitationResponse::builder)
                .logger(LOG, "getRecipientInvitation")
                .serviceDetails(
                        "RecipientInvitation",
                        "GetRecipientInvitation",
                        "https://docs.oracle.com/iaas/api/#/en/organizations/20200801/RecipientInvitation/GetRecipientInvitation")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetRecipientInvitationRequest::builder)
                .basePath("/20200801")
                .appendPathParam("recipientInvitations")
                .appendPathParam(request.getRecipientInvitationId())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.tenantmanagercontrolplane.model.RecipientInvitation.class,
                        GetRecipientInvitationResponse.Builder::recipientInvitation)
                .handleResponseHeaderString(
                        "opc-request-id", GetRecipientInvitationResponse.Builder::opcRequestId)
                .handleResponseHeaderString("etag", GetRecipientInvitationResponse.Builder::etag)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<IgnoreRecipientInvitationResponse> ignoreRecipientInvitation(
            IgnoreRecipientInvitationRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            IgnoreRecipientInvitationRequest, IgnoreRecipientInvitationResponse>
                    handler) {

        Validate.notBlank(
                request.getRecipientInvitationId(), "recipientInvitationId must not be blank");

        return clientCall(request, IgnoreRecipientInvitationResponse::builder)
                .logger(LOG, "ignoreRecipientInvitation")
                .serviceDetails(
                        "RecipientInvitation",
                        "IgnoreRecipientInvitation",
                        "https://docs.oracle.com/iaas/api/#/en/organizations/20200801/RecipientInvitation/IgnoreRecipientInvitation")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(IgnoreRecipientInvitationRequest::builder)
                .basePath("/20200801")
                .appendPathParam("recipientInvitations")
                .appendPathParam(request.getRecipientInvitationId())
                .appendPathParam("actions")
                .appendPathParam("ignore")
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.tenantmanagercontrolplane.model.RecipientInvitation.class,
                        IgnoreRecipientInvitationResponse.Builder::recipientInvitation)
                .handleResponseHeaderString(
                        "opc-request-id", IgnoreRecipientInvitationResponse.Builder::opcRequestId)
                .handleResponseHeaderString("etag", IgnoreRecipientInvitationResponse.Builder::etag)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ListRecipientInvitationsResponse> listRecipientInvitations(
            ListRecipientInvitationsRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ListRecipientInvitationsRequest, ListRecipientInvitationsResponse>
                    handler) {
        Objects.requireNonNull(request.getCompartmentId(), "compartmentId is required");

        return clientCall(request, ListRecipientInvitationsResponse::builder)
                .logger(LOG, "listRecipientInvitations")
                .serviceDetails(
                        "RecipientInvitation",
                        "ListRecipientInvitations",
                        "https://docs.oracle.com/iaas/api/#/en/organizations/20200801/RecipientInvitation/ListRecipientInvitations")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListRecipientInvitationsRequest::builder)
                .basePath("/20200801")
                .appendPathParam("recipientInvitations")
                .appendQueryParam("senderTenancyId", request.getSenderTenancyId())
                .appendEnumQueryParam("lifecycleState", request.getLifecycleState())
                .appendEnumQueryParam("status", request.getStatus())
                .appendQueryParam("compartmentId", request.getCompartmentId())
                .appendQueryParam("page", request.getPage())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.tenantmanagercontrolplane.model.RecipientInvitationCollection
                                .class,
                        ListRecipientInvitationsResponse.Builder::recipientInvitationCollection)
                .handleResponseHeaderString(
                        "opc-next-page", ListRecipientInvitationsResponse.Builder::opcNextPage)
                .handleResponseHeaderString(
                        "opc-request-id", ListRecipientInvitationsResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<UpdateRecipientInvitationResponse> updateRecipientInvitation(
            UpdateRecipientInvitationRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            UpdateRecipientInvitationRequest, UpdateRecipientInvitationResponse>
                    handler) {

        Validate.notBlank(
                request.getRecipientInvitationId(), "recipientInvitationId must not be blank");
        Objects.requireNonNull(
                request.getUpdateRecipientInvitationDetails(),
                "updateRecipientInvitationDetails is required");

        return clientCall(request, UpdateRecipientInvitationResponse::builder)
                .logger(LOG, "updateRecipientInvitation")
                .serviceDetails(
                        "RecipientInvitation",
                        "UpdateRecipientInvitation",
                        "https://docs.oracle.com/iaas/api/#/en/organizations/20200801/RecipientInvitation/UpdateRecipientInvitation")
                .method(com.oracle.bmc.http.client.Method.PUT)
                .requestBuilder(UpdateRecipientInvitationRequest::builder)
                .basePath("/20200801")
                .appendPathParam("recipientInvitations")
                .appendPathParam(request.getRecipientInvitationId())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.tenantmanagercontrolplane.model.RecipientInvitation.class,
                        UpdateRecipientInvitationResponse.Builder::recipientInvitation)
                .handleResponseHeaderString(
                        "opc-request-id", UpdateRecipientInvitationResponse.Builder::opcRequestId)
                .handleResponseHeaderString("etag", UpdateRecipientInvitationResponse.Builder::etag)
                .callAsync(handler);
    }

    /**
     * Create a new client instance.
     *
     * @param authenticationDetailsProvider The authentication details (see {@link Builder#build})
     * @deprecated Use the {@link #builder() builder} instead.
     */
    @Deprecated
    public RecipientInvitationAsyncClient(
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
    public RecipientInvitationAsyncClient(
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
    public RecipientInvitationAsyncClient(
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
    public RecipientInvitationAsyncClient(
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
    public RecipientInvitationAsyncClient(
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
    public RecipientInvitationAsyncClient(
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
    public RecipientInvitationAsyncClient(
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
