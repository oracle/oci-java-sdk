/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.announcementsservice;

import com.oracle.bmc.util.internal.Validate;
import com.oracle.bmc.announcementsservice.requests.*;
import com.oracle.bmc.announcementsservice.responses.*;
import com.oracle.bmc.circuitbreaker.CircuitBreakerConfiguration;
import com.oracle.bmc.util.CircuitBreakerUtils;

import java.util.Objects;

@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 0.0.1")
public class AnnouncementClient extends com.oracle.bmc.http.internal.BaseSyncClient
        implements Announcement {
    /** Service instance for Announcement. */
    public static final com.oracle.bmc.Service SERVICE =
            com.oracle.bmc.Services.serviceBuilder()
                    .serviceName("ANNOUNCEMENT")
                    .serviceEndpointPrefix("announcements")
                    .serviceEndpointTemplate("https://announcements.{region}.{secondLevelDomain}")
                    .build();

    private static final org.slf4j.Logger LOG =
            org.slf4j.LoggerFactory.getLogger(AnnouncementClient.class);

    private final AnnouncementPaginators paginators;

    AnnouncementClient(
            com.oracle.bmc.common.ClientBuilderBase<?, ?> builder,
            com.oracle.bmc.auth.AbstractAuthenticationDetailsProvider
                    authenticationDetailsProvider) {
        super(
                builder,
                authenticationDetailsProvider,
                CircuitBreakerUtils.DEFAULT_CIRCUIT_BREAKER_CONFIGURATION);

        this.paginators = new AnnouncementPaginators(this);
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
            extends com.oracle.bmc.common.RegionalClientBuilder<Builder, AnnouncementClient> {
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
        public AnnouncementClient build(
                @jakarta.annotation.Nonnull
                        com.oracle.bmc.auth.AbstractAuthenticationDetailsProvider
                                authenticationDetailsProvider) {
            return new AnnouncementClient(this, authenticationDetailsProvider);
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
    public GetAnnouncementResponse getAnnouncement(GetAnnouncementRequest request) {

        Validate.notBlank(request.getAnnouncementId(), "announcementId must not be blank");

        return clientCall(request, GetAnnouncementResponse::builder)
                .logger(LOG, "getAnnouncement")
                .serviceDetails(
                        "Announcement",
                        "GetAnnouncement",
                        "https://docs.oracle.com/iaas/api/#/en/announcements/0.0.1/Announcement/GetAnnouncement")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetAnnouncementRequest::builder)
                .basePath("/20180904")
                .appendPathParam("announcements")
                .appendPathParam(request.getAnnouncementId())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.announcementsservice.model.Announcement.class,
                        GetAnnouncementResponse.Builder::announcement)
                .handleResponseHeaderString(
                        "opc-request-id", GetAnnouncementResponse.Builder::opcRequestId)
                .handleResponseHeaderString("etag", GetAnnouncementResponse.Builder::etag)
                .callSync();
    }

    @Override
    public GetAnnouncementUserStatusResponse getAnnouncementUserStatus(
            GetAnnouncementUserStatusRequest request) {

        Validate.notBlank(request.getAnnouncementId(), "announcementId must not be blank");

        return clientCall(request, GetAnnouncementUserStatusResponse::builder)
                .logger(LOG, "getAnnouncementUserStatus")
                .serviceDetails(
                        "Announcement",
                        "GetAnnouncementUserStatus",
                        "https://docs.oracle.com/iaas/api/#/en/announcements/0.0.1/AnnouncementUserStatusDetails/GetAnnouncementUserStatus")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetAnnouncementUserStatusRequest::builder)
                .basePath("/20180904")
                .appendPathParam("announcements")
                .appendPathParam(request.getAnnouncementId())
                .appendPathParam("userStatus")
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.announcementsservice.model.AnnouncementUserStatusDetails
                                .class,
                        GetAnnouncementUserStatusResponse.Builder::announcementUserStatusDetails)
                .handleResponseHeaderString(
                        "opc-request-id", GetAnnouncementUserStatusResponse.Builder::opcRequestId)
                .handleResponseHeaderString("etag", GetAnnouncementUserStatusResponse.Builder::etag)
                .callSync();
    }

    @Override
    public ListAnnouncementsResponse listAnnouncements(ListAnnouncementsRequest request) {
        Objects.requireNonNull(request.getCompartmentId(), "compartmentId is required");

        return clientCall(request, ListAnnouncementsResponse::builder)
                .logger(LOG, "listAnnouncements")
                .serviceDetails(
                        "Announcement",
                        "ListAnnouncements",
                        "https://docs.oracle.com/iaas/api/#/en/announcements/0.0.1/AnnouncementsCollection/ListAnnouncements")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListAnnouncementsRequest::builder)
                .basePath("/20180904")
                .appendPathParam("announcements")
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .appendQueryParam("compartmentId", request.getCompartmentId())
                .appendQueryParam("announcementType", request.getAnnouncementType())
                .appendEnumQueryParam("lifecycleState", request.getLifecycleState())
                .appendQueryParam("isBanner", request.getIsBanner())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .appendQueryParam("timeOneEarliestTime", request.getTimeOneEarliestTime())
                .appendQueryParam("timeOneLatestTime", request.getTimeOneLatestTime())
                .appendQueryParam("environmentName", request.getEnvironmentName())
                .appendQueryParam("service", request.getService())
                .appendEnumQueryParam("platformType", request.getPlatformType())
                .appendListQueryParam(
                        "excludeAnnouncementTypes",
                        request.getExcludeAnnouncementTypes(),
                        com.oracle.bmc.util.internal.CollectionFormatType.Multi)
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.announcementsservice.model.AnnouncementsCollection.class,
                        ListAnnouncementsResponse.Builder::announcementsCollection)
                .handleResponseHeaderString(
                        "opc-next-page", ListAnnouncementsResponse.Builder::opcNextPage)
                .handleResponseHeaderString(
                        "opc-previous-page", ListAnnouncementsResponse.Builder::opcPreviousPage)
                .handleResponseHeaderString(
                        "opc-request-id", ListAnnouncementsResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public UpdateAnnouncementUserStatusResponse updateAnnouncementUserStatus(
            UpdateAnnouncementUserStatusRequest request) {

        Validate.notBlank(request.getAnnouncementId(), "announcementId must not be blank");
        Objects.requireNonNull(request.getStatusDetails(), "statusDetails is required");

        return clientCall(request, UpdateAnnouncementUserStatusResponse::builder)
                .logger(LOG, "updateAnnouncementUserStatus")
                .serviceDetails(
                        "Announcement",
                        "UpdateAnnouncementUserStatus",
                        "https://docs.oracle.com/iaas/api/#/en/announcements/0.0.1/AnnouncementUserStatusDetails/UpdateAnnouncementUserStatus")
                .method(com.oracle.bmc.http.client.Method.PUT)
                .requestBuilder(UpdateAnnouncementUserStatusRequest::builder)
                .basePath("/20180904")
                .appendPathParam("announcements")
                .appendPathParam(request.getAnnouncementId())
                .appendPathParam("userStatus")
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.announcementsservice.model.AnnouncementUserStatusDetails
                                .class,
                        UpdateAnnouncementUserStatusResponse.Builder::announcementUserStatusDetails)
                .handleResponseHeaderString(
                        "opc-request-id",
                        UpdateAnnouncementUserStatusResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "etag", UpdateAnnouncementUserStatusResponse.Builder::etag)
                .callSync();
    }

    @Override
    public AnnouncementPaginators getPaginators() {
        return paginators;
    }

    /**
     * Create a new client instance.
     *
     * @param authenticationDetailsProvider The authentication details (see {@link Builder#build})
     * @deprecated Use the {@link #builder() builder} instead.
     */
    @Deprecated
    public AnnouncementClient(
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
    public AnnouncementClient(
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
    public AnnouncementClient(
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
    public AnnouncementClient(
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
    public AnnouncementClient(
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
    public AnnouncementClient(
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
    public AnnouncementClient(
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
