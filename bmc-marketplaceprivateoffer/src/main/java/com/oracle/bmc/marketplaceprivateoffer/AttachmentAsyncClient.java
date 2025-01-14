/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.marketplaceprivateoffer;

import com.oracle.bmc.util.internal.Validate;
import com.oracle.bmc.marketplaceprivateoffer.requests.*;
import com.oracle.bmc.marketplaceprivateoffer.responses.*;

import java.util.Objects;

/**
 * Async client implementation for Attachment service. <br>
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
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20220901")
public class AttachmentAsyncClient extends com.oracle.bmc.http.internal.BaseAsyncClient
        implements AttachmentAsync {
    /** Service instance for Attachment. */
    public static final com.oracle.bmc.Service SERVICE =
            com.oracle.bmc.Services.serviceBuilder()
                    .serviceName("ATTACHMENT")
                    .serviceEndpointPrefix("")
                    .serviceEndpointTemplate(
                            "https://private-offer.{region}.oci.{secondLevelDomain}")
                    .build();

    private static final org.slf4j.Logger LOG =
            org.slf4j.LoggerFactory.getLogger(AttachmentAsyncClient.class);

    AttachmentAsyncClient(
            com.oracle.bmc.common.ClientBuilderBase<?, ?> builder,
            com.oracle.bmc.auth.AbstractAuthenticationDetailsProvider
                    authenticationDetailsProvider) {
        this(builder, authenticationDetailsProvider, true);
    }

    AttachmentAsyncClient(
            com.oracle.bmc.common.ClientBuilderBase<?, ?> builder,
            com.oracle.bmc.auth.AbstractAuthenticationDetailsProvider authenticationDetailsProvider,
            boolean isStreamWarningEnabled) {
        super(builder, authenticationDetailsProvider);

        if (isStreamWarningEnabled && com.oracle.bmc.util.StreamUtils.isExtraStreamLogsEnabled()) {
            LOG.warn(
                    com.oracle.bmc.util.StreamUtils.getStreamWarningMessage(
                            "AttachmentAsyncClient", "getAttachmentContent"));
        }
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
            extends com.oracle.bmc.common.RegionalClientBuilder<Builder, AttachmentAsyncClient> {
        private boolean isStreamWarningEnabled = true;

        private Builder(com.oracle.bmc.Service service) {
            super(service);
            final String packageName = "marketplaceprivateoffer";
            com.oracle.bmc.internal.Alloy.throwDisabledServiceExceptionIfAppropriate(packageName);
            requestSignerFactory =
                    new com.oracle.bmc.http.signing.internal.DefaultRequestSignerFactory(
                            com.oracle.bmc.http.signing.SigningStrategy.STANDARD);
        }

        /**
         * Enable/disable the stream warnings for the client
         *
         * @param isStreamWarningEnabled executorService
         * @return this builder
         */
        public Builder isStreamWarningEnabled(boolean isStreamWarningEnabled) {
            this.isStreamWarningEnabled = isStreamWarningEnabled;
            return this;
        }

        /**
         * Build the client.
         *
         * @param authenticationDetailsProvider authentication details provider
         * @return the client
         */
        public AttachmentAsyncClient build(
                @jakarta.annotation.Nonnull
                        com.oracle.bmc.auth.AbstractAuthenticationDetailsProvider
                                authenticationDetailsProvider) {
            return new AttachmentAsyncClient(
                    this, authenticationDetailsProvider, isStreamWarningEnabled);
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
    public java.util.concurrent.Future<CreateAttachmentResponse> createAttachment(
            CreateAttachmentRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            CreateAttachmentRequest, CreateAttachmentResponse>
                    handler) {
        Objects.requireNonNull(
                request.getCreateAttachmentDetails(), "createAttachmentDetails is required");

        Validate.notBlank(request.getOfferId(), "offerId must not be blank");

        return clientCall(request, CreateAttachmentResponse::builder)
                .logger(LOG, "createAttachment")
                .serviceDetails("Attachment", "CreateAttachment", "")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(CreateAttachmentRequest::builder)
                .basePath("/20220901")
                .appendPathParam("offers")
                .appendPathParam(request.getOfferId())
                .appendPathParam("attachments")
                .accept("application/json")
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.marketplaceprivateoffer.model.Attachment.class,
                        CreateAttachmentResponse.Builder::attachment)
                .handleResponseHeaderString("etag", CreateAttachmentResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", CreateAttachmentResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<DeleteAttachmentResponse> deleteAttachment(
            DeleteAttachmentRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            DeleteAttachmentRequest, DeleteAttachmentResponse>
                    handler) {

        Validate.notBlank(request.getOfferId(), "offerId must not be blank");

        Validate.notBlank(request.getAttachmentId(), "attachmentId must not be blank");

        return clientCall(request, DeleteAttachmentResponse::builder)
                .logger(LOG, "deleteAttachment")
                .serviceDetails("Attachment", "DeleteAttachment", "")
                .method(com.oracle.bmc.http.client.Method.DELETE)
                .requestBuilder(DeleteAttachmentRequest::builder)
                .basePath("/20220901")
                .appendPathParam("offers")
                .appendPathParam(request.getOfferId())
                .appendPathParam("attachments")
                .appendPathParam(request.getAttachmentId())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleResponseHeaderString(
                        "opc-work-request-id", DeleteAttachmentResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", DeleteAttachmentResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<GetAttachmentResponse> getAttachment(
            GetAttachmentRequest request,
            final com.oracle.bmc.responses.AsyncHandler<GetAttachmentRequest, GetAttachmentResponse>
                    handler) {

        Validate.notBlank(request.getOfferId(), "offerId must not be blank");

        Validate.notBlank(request.getAttachmentId(), "attachmentId must not be blank");

        return clientCall(request, GetAttachmentResponse::builder)
                .logger(LOG, "getAttachment")
                .serviceDetails("Attachment", "GetAttachment", "")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetAttachmentRequest::builder)
                .basePath("/20220901")
                .appendPathParam("offers")
                .appendPathParam(request.getOfferId())
                .appendPathParam("attachments")
                .appendPathParam(request.getAttachmentId())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.marketplaceprivateoffer.model.Attachment.class,
                        GetAttachmentResponse.Builder::attachment)
                .handleResponseHeaderString("etag", GetAttachmentResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", GetAttachmentResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<GetAttachmentContentResponse> getAttachmentContent(
            GetAttachmentContentRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            GetAttachmentContentRequest, GetAttachmentContentResponse>
                    handler) {

        Validate.notBlank(request.getOfferId(), "offerId must not be blank");

        Validate.notBlank(request.getAttachmentId(), "attachmentId must not be blank");

        return clientCall(request, GetAttachmentContentResponse::builder)
                .logger(LOG, "getAttachmentContent")
                .serviceDetails("Attachment", "GetAttachmentContent", "")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetAttachmentContentRequest::builder)
                .basePath("/20220901")
                .appendPathParam("offers")
                .appendPathParam(request.getOfferId())
                .appendPathParam("attachments")
                .appendPathParam(request.getAttachmentId())
                .appendPathParam("content")
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        java.io.InputStream.class,
                        GetAttachmentContentResponse.Builder::inputStream)
                .handleResponseHeaderString(
                        "opc-request-id", GetAttachmentContentResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ListAttachmentsResponse> listAttachments(
            ListAttachmentsRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ListAttachmentsRequest, ListAttachmentsResponse>
                    handler) {

        Validate.notBlank(request.getOfferId(), "offerId must not be blank");

        return clientCall(request, ListAttachmentsResponse::builder)
                .logger(LOG, "listAttachments")
                .serviceDetails("Attachment", "ListAttachments", "")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListAttachmentsRequest::builder)
                .basePath("/20220901")
                .appendPathParam("offers")
                .appendPathParam(request.getOfferId())
                .appendPathParam("attachments")
                .appendQueryParam("buyerCompartmentId", request.getBuyerCompartmentId())
                .appendQueryParam("sellerCompartmentId", request.getSellerCompartmentId())
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
                        com.oracle.bmc.marketplaceprivateoffer.model.AttachmentCollection.class,
                        ListAttachmentsResponse.Builder::attachmentCollection)
                .handleResponseHeaderString(
                        "opc-request-id", ListAttachmentsResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListAttachmentsResponse.Builder::opcNextPage)
                .callAsync(handler);
    }

    /**
     * Create a new client instance.
     *
     * @param authenticationDetailsProvider The authentication details (see {@link Builder#build})
     * @deprecated Use the {@link #builder() builder} instead.
     */
    @Deprecated
    public AttachmentAsyncClient(
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
    public AttachmentAsyncClient(
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
    public AttachmentAsyncClient(
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
    public AttachmentAsyncClient(
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
    public AttachmentAsyncClient(
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
    public AttachmentAsyncClient(
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
    public AttachmentAsyncClient(
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
