/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.tenantmanagercontrolplane;

import com.oracle.bmc.util.internal.Validate;
import com.oracle.bmc.tenantmanagercontrolplane.requests.*;
import com.oracle.bmc.tenantmanagercontrolplane.responses.*;
import com.oracle.bmc.circuitbreaker.CircuitBreakerConfiguration;
import com.oracle.bmc.util.CircuitBreakerUtils;

import java.util.Objects;

@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20230401")
public class OrganizationClient extends com.oracle.bmc.http.internal.BaseSyncClient
        implements Organization {
    /** Service instance for Organization. */
    public static final com.oracle.bmc.Service SERVICE =
            com.oracle.bmc.Services.serviceBuilder()
                    .serviceName("ORGANIZATION")
                    .serviceEndpointPrefix("")
                    .serviceEndpointTemplate(
                            "https://organizations.{region}.oci.{secondLevelDomain}")
                    .build();

    private static final org.slf4j.Logger LOG =
            org.slf4j.LoggerFactory.getLogger(OrganizationClient.class);

    private final OrganizationWaiters waiters;

    private final OrganizationPaginators paginators;

    OrganizationClient(
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
                                    .nameFormat("Organization-waiters-%d")
                                    .build());
            threadPoolExecutor.allowCoreThreadTimeOut(true);

            executorService = threadPoolExecutor;
        }
        this.waiters = new OrganizationWaiters(executorService, this);

        this.paginators = new OrganizationPaginators(this);
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
            extends com.oracle.bmc.common.RegionalClientBuilder<Builder, OrganizationClient> {
        private java.util.concurrent.ExecutorService executorService;

        private Builder(com.oracle.bmc.Service service) {
            super(service);
            final String packageName = "tenantmanagercontrolplane";
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
        public OrganizationClient build(
                @jakarta.annotation.Nonnull
                        com.oracle.bmc.auth.AbstractAuthenticationDetailsProvider
                                authenticationDetailsProvider) {
            return new OrganizationClient(this, authenticationDetailsProvider, executorService);
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
    public ApproveOrganizationTenancyForTransferResponse approveOrganizationTenancyForTransfer(
            ApproveOrganizationTenancyForTransferRequest request) {
        Objects.requireNonNull(request.getCompartmentId(), "compartmentId is required");

        Validate.notBlank(
                request.getOrganizationTenancyId(), "organizationTenancyId must not be blank");

        return clientCall(request, ApproveOrganizationTenancyForTransferResponse::builder)
                .logger(LOG, "approveOrganizationTenancyForTransfer")
                .serviceDetails(
                        "Organization",
                        "ApproveOrganizationTenancyForTransfer",
                        "https://docs.oracle.com/iaas/api/#/en/organizations/20230401/OrganizationTenancy/ApproveOrganizationTenancyForTransfer")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(ApproveOrganizationTenancyForTransferRequest::builder)
                .basePath("/20230401")
                .appendPathParam("organizationTenancies")
                .appendPathParam(request.getOrganizationTenancyId())
                .appendPathParam("actions")
                .appendPathParam("approveForTransfer")
                .appendQueryParam("compartmentId", request.getCompartmentId())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.tenantmanagercontrolplane.model.OrganizationTenancy.class,
                        ApproveOrganizationTenancyForTransferResponse.Builder::organizationTenancy)
                .handleResponseHeaderString(
                        "opc-request-id",
                        ApproveOrganizationTenancyForTransferResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "etag", ApproveOrganizationTenancyForTransferResponse.Builder::etag)
                .callSync();
    }

    @Override
    public CreateChildTenancyResponse createChildTenancy(CreateChildTenancyRequest request) {
        Objects.requireNonNull(
                request.getCreateChildTenancyDetails(), "createChildTenancyDetails is required");

        return clientCall(request, CreateChildTenancyResponse::builder)
                .logger(LOG, "createChildTenancy")
                .serviceDetails("Organization", "CreateChildTenancy", "")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(CreateChildTenancyRequest::builder)
                .basePath("/20230401")
                .appendPathParam("childTenancies")
                .accept("application/json")
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .hasBody()
                .handleResponseHeaderString(
                        "opc-request-id", CreateChildTenancyResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-work-request-id", CreateChildTenancyResponse.Builder::opcWorkRequestId)
                .callSync();
    }

    @Override
    public DeleteOrganizationTenancyResponse deleteOrganizationTenancy(
            DeleteOrganizationTenancyRequest request) {

        Validate.notBlank(
                request.getOrganizationTenancyId(), "organizationTenancyId must not be blank");

        return clientCall(request, DeleteOrganizationTenancyResponse::builder)
                .logger(LOG, "deleteOrganizationTenancy")
                .serviceDetails(
                        "Organization",
                        "DeleteOrganizationTenancy",
                        "https://docs.oracle.com/iaas/api/#/en/organizations/20230401/OrganizationTenancy/DeleteOrganizationTenancy")
                .method(com.oracle.bmc.http.client.Method.DELETE)
                .requestBuilder(DeleteOrganizationTenancyRequest::builder)
                .basePath("/20230401")
                .appendPathParam("organizationTenancies")
                .appendPathParam(request.getOrganizationTenancyId())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .handleResponseHeaderString(
                        "opc-request-id", DeleteOrganizationTenancyResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        DeleteOrganizationTenancyResponse.Builder::opcWorkRequestId)
                .callSync();
    }

    @Override
    public GetOrganizationResponse getOrganization(GetOrganizationRequest request) {

        Validate.notBlank(request.getOrganizationId(), "organizationId must not be blank");

        return clientCall(request, GetOrganizationResponse::builder)
                .logger(LOG, "getOrganization")
                .serviceDetails(
                        "Organization",
                        "GetOrganization",
                        "https://docs.oracle.com/iaas/api/#/en/organizations/20230401/Organization/GetOrganization")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetOrganizationRequest::builder)
                .basePath("/20230401")
                .appendPathParam("organizations")
                .appendPathParam(request.getOrganizationId())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.tenantmanagercontrolplane.model.Organization.class,
                        GetOrganizationResponse.Builder::organization)
                .handleResponseHeaderString("etag", GetOrganizationResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", GetOrganizationResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public GetOrganizationTenancyResponse getOrganizationTenancy(
            GetOrganizationTenancyRequest request) {

        Validate.notBlank(request.getOrganizationId(), "organizationId must not be blank");

        Validate.notBlank(request.getTenancyId(), "tenancyId must not be blank");

        return clientCall(request, GetOrganizationTenancyResponse::builder)
                .logger(LOG, "getOrganizationTenancy")
                .serviceDetails(
                        "Organization",
                        "GetOrganizationTenancy",
                        "https://docs.oracle.com/iaas/api/#/en/organizations/20230401/OrganizationTenancy/GetOrganizationTenancy")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetOrganizationTenancyRequest::builder)
                .basePath("/20230401")
                .appendPathParam("organizations")
                .appendPathParam(request.getOrganizationId())
                .appendPathParam("tenancies")
                .appendPathParam(request.getTenancyId())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.tenantmanagercontrolplane.model.OrganizationTenancy.class,
                        GetOrganizationTenancyResponse.Builder::organizationTenancy)
                .handleResponseHeaderString("etag", GetOrganizationTenancyResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", GetOrganizationTenancyResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public ListOrganizationTenanciesResponse listOrganizationTenancies(
            ListOrganizationTenanciesRequest request) {

        Validate.notBlank(request.getOrganizationId(), "organizationId must not be blank");

        return clientCall(request, ListOrganizationTenanciesResponse::builder)
                .logger(LOG, "listOrganizationTenancies")
                .serviceDetails(
                        "Organization",
                        "ListOrganizationTenancies",
                        "https://docs.oracle.com/iaas/api/#/en/organizations/20230401/Organization/ListOrganizationTenancies")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListOrganizationTenanciesRequest::builder)
                .basePath("/20230401")
                .appendPathParam("organizations")
                .appendPathParam(request.getOrganizationId())
                .appendPathParam("tenancies")
                .appendQueryParam("page", request.getPage())
                .appendQueryParam("limit", request.getLimit())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.tenantmanagercontrolplane.model.OrganizationTenancyCollection
                                .class,
                        ListOrganizationTenanciesResponse.Builder::organizationTenancyCollection)
                .handleResponseHeaderString(
                        "opc-next-page", ListOrganizationTenanciesResponse.Builder::opcNextPage)
                .handleResponseHeaderString(
                        "opc-request-id", ListOrganizationTenanciesResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public ListOrganizationsResponse listOrganizations(ListOrganizationsRequest request) {
        Objects.requireNonNull(request.getCompartmentId(), "compartmentId is required");

        return clientCall(request, ListOrganizationsResponse::builder)
                .logger(LOG, "listOrganizations")
                .serviceDetails(
                        "Organization",
                        "ListOrganizations",
                        "https://docs.oracle.com/iaas/api/#/en/organizations/20230401/Organization/ListOrganizations")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListOrganizationsRequest::builder)
                .basePath("/20230401")
                .appendPathParam("organizations")
                .appendQueryParam("compartmentId", request.getCompartmentId())
                .appendQueryParam("page", request.getPage())
                .appendQueryParam("limit", request.getLimit())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.tenantmanagercontrolplane.model.OrganizationCollection.class,
                        ListOrganizationsResponse.Builder::organizationCollection)
                .handleResponseHeaderString(
                        "opc-next-page", ListOrganizationsResponse.Builder::opcNextPage)
                .handleResponseHeaderString(
                        "opc-request-id", ListOrganizationsResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public RestoreOrganizationTenancyResponse restoreOrganizationTenancy(
            RestoreOrganizationTenancyRequest request) {

        Validate.notBlank(
                request.getOrganizationTenancyId(), "organizationTenancyId must not be blank");

        return clientCall(request, RestoreOrganizationTenancyResponse::builder)
                .logger(LOG, "restoreOrganizationTenancy")
                .serviceDetails(
                        "Organization",
                        "RestoreOrganizationTenancy",
                        "https://docs.oracle.com/iaas/api/#/en/organizations/20230401/OrganizationTenancy/RestoreOrganizationTenancy")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(RestoreOrganizationTenancyRequest::builder)
                .basePath("/20230401")
                .appendPathParam("organizationTenancies")
                .appendPathParam(request.getOrganizationTenancyId())
                .appendPathParam("actions")
                .appendPathParam("restore")
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleResponseHeaderString(
                        "opc-request-id", RestoreOrganizationTenancyResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        RestoreOrganizationTenancyResponse.Builder::opcWorkRequestId)
                .callSync();
    }

    @Override
    public UnapproveOrganizationTenancyForTransferResponse unapproveOrganizationTenancyForTransfer(
            UnapproveOrganizationTenancyForTransferRequest request) {
        Objects.requireNonNull(request.getCompartmentId(), "compartmentId is required");

        Validate.notBlank(
                request.getOrganizationTenancyId(), "organizationTenancyId must not be blank");

        return clientCall(request, UnapproveOrganizationTenancyForTransferResponse::builder)
                .logger(LOG, "unapproveOrganizationTenancyForTransfer")
                .serviceDetails(
                        "Organization",
                        "UnapproveOrganizationTenancyForTransfer",
                        "https://docs.oracle.com/iaas/api/#/en/organizations/20230401/OrganizationTenancy/UnapproveOrganizationTenancyForTransfer")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(UnapproveOrganizationTenancyForTransferRequest::builder)
                .basePath("/20230401")
                .appendPathParam("organizationTenancies")
                .appendPathParam(request.getOrganizationTenancyId())
                .appendPathParam("actions")
                .appendPathParam("unapproveForTransfer")
                .appendQueryParam("compartmentId", request.getCompartmentId())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.tenantmanagercontrolplane.model.OrganizationTenancy.class,
                        UnapproveOrganizationTenancyForTransferResponse.Builder
                                ::organizationTenancy)
                .handleResponseHeaderString(
                        "opc-request-id",
                        UnapproveOrganizationTenancyForTransferResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "etag", UnapproveOrganizationTenancyForTransferResponse.Builder::etag)
                .callSync();
    }

    @Override
    public UpdateOrganizationResponse updateOrganization(UpdateOrganizationRequest request) {

        Validate.notBlank(request.getOrganizationId(), "organizationId must not be blank");
        Objects.requireNonNull(
                request.getUpdateOrganizationDetails(), "updateOrganizationDetails is required");

        return clientCall(request, UpdateOrganizationResponse::builder)
                .logger(LOG, "updateOrganization")
                .serviceDetails(
                        "Organization",
                        "UpdateOrganization",
                        "https://docs.oracle.com/iaas/api/#/en/organizations/20230401/Organization/UpdateOrganization")
                .method(com.oracle.bmc.http.client.Method.PUT)
                .requestBuilder(UpdateOrganizationRequest::builder)
                .basePath("/20230401")
                .appendPathParam("organizations")
                .appendPathParam(request.getOrganizationId())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .hasBody()
                .handleResponseHeaderString(
                        "opc-request-id", UpdateOrganizationResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-work-request-id", UpdateOrganizationResponse.Builder::opcWorkRequestId)
                .callSync();
    }

    @Override
    public OrganizationWaiters getWaiters() {
        return waiters;
    }

    @Override
    public OrganizationPaginators getPaginators() {
        return paginators;
    }

    /**
     * Create a new client instance.
     *
     * @param authenticationDetailsProvider The authentication details (see {@link Builder#build})
     * @deprecated Use the {@link #builder() builder} instead.
     */
    @Deprecated
    public OrganizationClient(
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
    public OrganizationClient(
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
    public OrganizationClient(
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
    public OrganizationClient(
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
    public OrganizationClient(
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
    public OrganizationClient(
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
    public OrganizationClient(
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
    public OrganizationClient(
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
