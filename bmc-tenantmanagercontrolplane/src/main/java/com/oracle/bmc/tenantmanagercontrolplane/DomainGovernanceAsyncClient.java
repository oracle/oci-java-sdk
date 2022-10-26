/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.tenantmanagercontrolplane;

import com.oracle.bmc.util.internal.Validate;
import com.oracle.bmc.tenantmanagercontrolplane.requests.*;
import com.oracle.bmc.tenantmanagercontrolplane.responses.*;

import java.util.Objects;

/**
 * Async client implementation for DomainGovernance service. <br>
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
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200801")
public class DomainGovernanceAsyncClient extends com.oracle.bmc.http.internal.BaseAsyncClient
        implements DomainGovernanceAsync {
    /** Service instance for DomainGovernance. */
    public static final com.oracle.bmc.Service SERVICE =
            com.oracle.bmc.Services.serviceBuilder()
                    .serviceName("DOMAINGOVERNANCE")
                    .serviceEndpointPrefix("")
                    .serviceEndpointTemplate(
                            "https://organizations.{region}.oci.{secondLevelDomain}")
                    .build();

    private static final org.slf4j.Logger LOG =
            org.slf4j.LoggerFactory.getLogger(DomainGovernanceAsyncClient.class);

    private DomainGovernanceAsyncClient(
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
                    Builder, DomainGovernanceAsyncClient> {
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
        public DomainGovernanceAsyncClient build(
                @javax.annotation.Nonnull
                        com.oracle.bmc.auth.AbstractAuthenticationDetailsProvider
                                authenticationDetailsProvider) {
            return new DomainGovernanceAsyncClient(this, authenticationDetailsProvider);
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
    public java.util.concurrent.Future<CreateDomainGovernanceResponse> createDomainGovernance(
            CreateDomainGovernanceRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            CreateDomainGovernanceRequest, CreateDomainGovernanceResponse>
                    handler) {
        Objects.requireNonNull(
                request.getCreateDomainGovernanceDetails(),
                "createDomainGovernanceDetails is required");

        return clientCall(request, CreateDomainGovernanceResponse::builder)
                .logger(LOG, "createDomainGovernance")
                .serviceDetails(
                        "DomainGovernance",
                        "CreateDomainGovernance",
                        "https://docs.oracle.com/iaas/api/#/en/organizations/20200801/DomainGovernance/CreateDomainGovernance")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(CreateDomainGovernanceRequest::builder)
                .basePath("/20200801")
                .appendPathParam("domainGovernances")
                .accept("application/json")
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.tenantmanagercontrolplane.model.DomainGovernance.class,
                        CreateDomainGovernanceResponse.Builder::domainGovernance)
                .handleResponseHeaderString(
                        "opc-request-id", CreateDomainGovernanceResponse.Builder::opcRequestId)
                .handleResponseHeaderString("etag", CreateDomainGovernanceResponse.Builder::etag)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<DeleteDomainGovernanceResponse> deleteDomainGovernance(
            DeleteDomainGovernanceRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            DeleteDomainGovernanceRequest, DeleteDomainGovernanceResponse>
                    handler) {

        Validate.notBlank(request.getDomainGovernanceId(), "domainGovernanceId must not be blank");

        return clientCall(request, DeleteDomainGovernanceResponse::builder)
                .logger(LOG, "deleteDomainGovernance")
                .serviceDetails(
                        "DomainGovernance",
                        "DeleteDomainGovernance",
                        "https://docs.oracle.com/iaas/api/#/en/organizations/20200801/DomainGovernance/DeleteDomainGovernance")
                .method(com.oracle.bmc.http.client.Method.DELETE)
                .requestBuilder(DeleteDomainGovernanceRequest::builder)
                .basePath("/20200801")
                .appendPathParam("domainGovernances")
                .appendPathParam(request.getDomainGovernanceId())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleResponseHeaderString(
                        "opc-request-id", DeleteDomainGovernanceResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<GetDomainGovernanceResponse> getDomainGovernance(
            GetDomainGovernanceRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            GetDomainGovernanceRequest, GetDomainGovernanceResponse>
                    handler) {

        Validate.notBlank(request.getDomainGovernanceId(), "domainGovernanceId must not be blank");

        return clientCall(request, GetDomainGovernanceResponse::builder)
                .logger(LOG, "getDomainGovernance")
                .serviceDetails(
                        "DomainGovernance",
                        "GetDomainGovernance",
                        "https://docs.oracle.com/iaas/api/#/en/organizations/20200801/DomainGovernance/GetDomainGovernance")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetDomainGovernanceRequest::builder)
                .basePath("/20200801")
                .appendPathParam("domainGovernances")
                .appendPathParam(request.getDomainGovernanceId())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.tenantmanagercontrolplane.model.DomainGovernance.class,
                        GetDomainGovernanceResponse.Builder::domainGovernance)
                .handleResponseHeaderString("etag", GetDomainGovernanceResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", GetDomainGovernanceResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ListDomainGovernancesResponse> listDomainGovernances(
            ListDomainGovernancesRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ListDomainGovernancesRequest, ListDomainGovernancesResponse>
                    handler) {
        Objects.requireNonNull(request.getCompartmentId(), "compartmentId is required");

        return clientCall(request, ListDomainGovernancesResponse::builder)
                .logger(LOG, "listDomainGovernances")
                .serviceDetails(
                        "DomainGovernance",
                        "ListDomainGovernances",
                        "https://docs.oracle.com/iaas/api/#/en/organizations/20200801/DomainGovernance/ListDomainGovernances")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListDomainGovernancesRequest::builder)
                .basePath("/20200801")
                .appendPathParam("domainGovernances")
                .appendQueryParam("compartmentId", request.getCompartmentId())
                .appendQueryParam("domainId", request.getDomainId())
                .appendQueryParam("domainGovernanceId", request.getDomainGovernanceId())
                .appendEnumQueryParam("lifecycleState", request.getLifecycleState())
                .appendQueryParam("name", request.getName())
                .appendQueryParam("page", request.getPage())
                .appendQueryParam("limit", request.getLimit())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.tenantmanagercontrolplane.model.DomainGovernanceCollection
                                .class,
                        ListDomainGovernancesResponse.Builder::domainGovernanceCollection)
                .handleResponseHeaderString(
                        "opc-next-page", ListDomainGovernancesResponse.Builder::opcNextPage)
                .handleResponseHeaderString(
                        "opc-request-id", ListDomainGovernancesResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<UpdateDomainGovernanceResponse> updateDomainGovernance(
            UpdateDomainGovernanceRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            UpdateDomainGovernanceRequest, UpdateDomainGovernanceResponse>
                    handler) {

        Validate.notBlank(request.getDomainGovernanceId(), "domainGovernanceId must not be blank");
        Objects.requireNonNull(
                request.getUpdateDomainGovernanceDetails(),
                "updateDomainGovernanceDetails is required");

        return clientCall(request, UpdateDomainGovernanceResponse::builder)
                .logger(LOG, "updateDomainGovernance")
                .serviceDetails(
                        "DomainGovernance",
                        "UpdateDomainGovernance",
                        "https://docs.oracle.com/iaas/api/#/en/organizations/20200801/DomainGovernance/UpdateDomainGovernance")
                .method(com.oracle.bmc.http.client.Method.PUT)
                .requestBuilder(UpdateDomainGovernanceRequest::builder)
                .basePath("/20200801")
                .appendPathParam("domainGovernances")
                .appendPathParam(request.getDomainGovernanceId())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.tenantmanagercontrolplane.model.DomainGovernance.class,
                        UpdateDomainGovernanceResponse.Builder::domainGovernance)
                .handleResponseHeaderString(
                        "opc-request-id", UpdateDomainGovernanceResponse.Builder::opcRequestId)
                .handleResponseHeaderString("etag", UpdateDomainGovernanceResponse.Builder::etag)
                .callAsync(handler);
    }

    /**
     * Create a new client instance.
     *
     * @param authenticationDetailsProvider The authentication details (see {@link Builder#build})
     * @deprecated Use the {@link #builder() builder} instead.
     */
    @Deprecated
    public DomainGovernanceAsyncClient(
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
    public DomainGovernanceAsyncClient(
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
    public DomainGovernanceAsyncClient(
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
    public DomainGovernanceAsyncClient(
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
    public DomainGovernanceAsyncClient(
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
    public DomainGovernanceAsyncClient(
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
    public DomainGovernanceAsyncClient(
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
