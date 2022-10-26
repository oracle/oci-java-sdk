/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.announcementsservice;

import com.oracle.bmc.util.internal.Validate;
import com.oracle.bmc.announcementsservice.requests.*;
import com.oracle.bmc.announcementsservice.responses.*;

import java.util.Objects;

/**
 * Async client implementation for AnnouncementsPreferences service. <br>
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
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 0.0.1")
public class AnnouncementsPreferencesAsyncClient
        extends com.oracle.bmc.http.internal.BaseAsyncClient
        implements AnnouncementsPreferencesAsync {
    /** Service instance for AnnouncementsPreferences. */
    public static final com.oracle.bmc.Service SERVICE =
            com.oracle.bmc.Services.serviceBuilder()
                    .serviceName("ANNOUNCEMENTSPREFERENCES")
                    .serviceEndpointPrefix("announcements")
                    .serviceEndpointTemplate(
                            "https://announcements.{region}.oci.{secondLevelDomain}")
                    .build();

    private static final org.slf4j.Logger LOG =
            org.slf4j.LoggerFactory.getLogger(AnnouncementsPreferencesAsyncClient.class);

    private AnnouncementsPreferencesAsyncClient(
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
                    Builder, AnnouncementsPreferencesAsyncClient> {
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
        public AnnouncementsPreferencesAsyncClient build(
                @javax.annotation.Nonnull
                        com.oracle.bmc.auth.AbstractAuthenticationDetailsProvider
                                authenticationDetailsProvider) {
            return new AnnouncementsPreferencesAsyncClient(this, authenticationDetailsProvider);
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
    public java.util.concurrent.Future<CreateAnnouncementsPreferenceResponse>
            createAnnouncementsPreference(
                    CreateAnnouncementsPreferenceRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    CreateAnnouncementsPreferenceRequest,
                                    CreateAnnouncementsPreferenceResponse>
                            handler) {
        Objects.requireNonNull(
                request.getAnnouncementsPreferenceDetails(),
                "announcementsPreferenceDetails is required");

        return clientCall(request, CreateAnnouncementsPreferenceResponse::builder)
                .logger(LOG, "createAnnouncementsPreference")
                .serviceDetails(
                        "AnnouncementsPreferences",
                        "CreateAnnouncementsPreference",
                        "https://docs.oracle.com/iaas/api/#/en/announcements/0.0.1/AnnouncementsPreferencesSummary/CreateAnnouncementsPreference")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(CreateAnnouncementsPreferenceRequest::builder)
                .basePath("/20180904")
                .appendPathParam("announcementsPreferences")
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.announcementsservice.model.AnnouncementsPreferencesSummary
                                .class,
                        CreateAnnouncementsPreferenceResponse.Builder
                                ::announcementsPreferencesSummary)
                .handleResponseHeaderString(
                        "opc-request-id",
                        CreateAnnouncementsPreferenceResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "etag", CreateAnnouncementsPreferenceResponse.Builder::etag)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<GetAnnouncementsPreferenceResponse>
            getAnnouncementsPreference(
                    GetAnnouncementsPreferenceRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    GetAnnouncementsPreferenceRequest,
                                    GetAnnouncementsPreferenceResponse>
                            handler) {

        Validate.notBlank(request.getPreferenceId(), "preferenceId must not be blank");

        return clientCall(request, GetAnnouncementsPreferenceResponse::builder)
                .logger(LOG, "getAnnouncementsPreference")
                .serviceDetails(
                        "AnnouncementsPreferences",
                        "GetAnnouncementsPreference",
                        "https://docs.oracle.com/iaas/api/#/en/announcements/0.0.1/AnnouncementsPreferences/GetAnnouncementsPreference")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetAnnouncementsPreferenceRequest::builder)
                .basePath("/20180904")
                .appendPathParam("announcementsPreferences")
                .appendPathParam(request.getPreferenceId())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.announcementsservice.model.AnnouncementsPreferences.class,
                        GetAnnouncementsPreferenceResponse.Builder::announcementsPreferences)
                .handleResponseHeaderString(
                        "opc-request-id", GetAnnouncementsPreferenceResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "etag", GetAnnouncementsPreferenceResponse.Builder::etag)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ListAnnouncementsPreferencesResponse>
            listAnnouncementsPreferences(
                    ListAnnouncementsPreferencesRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    ListAnnouncementsPreferencesRequest,
                                    ListAnnouncementsPreferencesResponse>
                            handler) {
        Objects.requireNonNull(request.getCompartmentId(), "compartmentId is required");

        return clientCall(request, ListAnnouncementsPreferencesResponse::builder)
                .logger(LOG, "listAnnouncementsPreferences")
                .serviceDetails(
                        "AnnouncementsPreferences",
                        "ListAnnouncementsPreferences",
                        "https://docs.oracle.com/iaas/api/#/en/announcements/0.0.1/AnnouncementsPreferencesSummary/ListAnnouncementsPreferences")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListAnnouncementsPreferencesRequest::builder)
                .basePath("/20180904")
                .appendPathParam("announcementsPreferences")
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .appendQueryParam("compartmentId", request.getCompartmentId())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBodyList(
                        com.oracle.bmc.announcementsservice.model.AnnouncementsPreferencesSummary
                                .class,
                        ListAnnouncementsPreferencesResponse.Builder::items)
                .handleResponseHeaderString(
                        "opc-next-page", ListAnnouncementsPreferencesResponse.Builder::opcNextPage)
                .handleResponseHeaderString(
                        "opc-request-id",
                        ListAnnouncementsPreferencesResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<UpdateAnnouncementsPreferenceResponse>
            updateAnnouncementsPreference(
                    UpdateAnnouncementsPreferenceRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    UpdateAnnouncementsPreferenceRequest,
                                    UpdateAnnouncementsPreferenceResponse>
                            handler) {

        Validate.notBlank(request.getPreferenceId(), "preferenceId must not be blank");
        Objects.requireNonNull(
                request.getAnnouncementsPreferenceDetails(),
                "announcementsPreferenceDetails is required");

        return clientCall(request, UpdateAnnouncementsPreferenceResponse::builder)
                .logger(LOG, "updateAnnouncementsPreference")
                .serviceDetails(
                        "AnnouncementsPreferences",
                        "UpdateAnnouncementsPreference",
                        "https://docs.oracle.com/iaas/api/#/en/announcements/0.0.1/AnnouncementsPreferencesSummary/UpdateAnnouncementsPreference")
                .method(com.oracle.bmc.http.client.Method.PUT)
                .requestBuilder(UpdateAnnouncementsPreferenceRequest::builder)
                .basePath("/20180904")
                .appendPathParam("announcementsPreferences")
                .appendPathParam(request.getPreferenceId())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("if-match", request.getIfMatch())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.announcementsservice.model.AnnouncementsPreferencesSummary
                                .class,
                        UpdateAnnouncementsPreferenceResponse.Builder
                                ::announcementsPreferencesSummary)
                .handleResponseHeaderString(
                        "opc-request-id",
                        UpdateAnnouncementsPreferenceResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "etag", UpdateAnnouncementsPreferenceResponse.Builder::etag)
                .callAsync(handler);
    }

    /**
     * Create a new client instance.
     *
     * @param authenticationDetailsProvider The authentication details (see {@link Builder#build})
     * @deprecated Use the {@link #builder() builder} instead.
     */
    @Deprecated
    public AnnouncementsPreferencesAsyncClient(
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
    public AnnouncementsPreferencesAsyncClient(
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
    public AnnouncementsPreferencesAsyncClient(
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
    public AnnouncementsPreferencesAsyncClient(
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
    public AnnouncementsPreferencesAsyncClient(
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
    public AnnouncementsPreferencesAsyncClient(
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
    public AnnouncementsPreferencesAsyncClient(
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
