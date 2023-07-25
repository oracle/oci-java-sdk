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
 * Async client implementation for Organization service. <br>
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
public class OrganizationAsyncClient extends com.oracle.bmc.http.internal.BaseAsyncClient
        implements OrganizationAsync {
    /** Service instance for Organization. */
    public static final com.oracle.bmc.Service SERVICE =
            com.oracle.bmc.Services.serviceBuilder()
                    .serviceName("ORGANIZATION")
                    .serviceEndpointPrefix("")
                    .serviceEndpointTemplate(
                            "https://organizations.{region}.oci.{secondLevelDomain}")
                    .build();

    private static final org.slf4j.Logger LOG =
            org.slf4j.LoggerFactory.getLogger(OrganizationAsyncClient.class);

    OrganizationAsyncClient(
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
            extends com.oracle.bmc.common.RegionalClientBuilder<Builder, OrganizationAsyncClient> {
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
        public OrganizationAsyncClient build(
                @jakarta.annotation.Nonnull
                        com.oracle.bmc.auth.AbstractAuthenticationDetailsProvider
                                authenticationDetailsProvider) {
            return new OrganizationAsyncClient(this, authenticationDetailsProvider);
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
    public java.util.concurrent.Future<ApproveOrganizationTenancyForTransferResponse>
            approveOrganizationTenancyForTransfer(
                    ApproveOrganizationTenancyForTransferRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    ApproveOrganizationTenancyForTransferRequest,
                                    ApproveOrganizationTenancyForTransferResponse>
                            handler) {
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
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<CreateChildTenancyResponse> createChildTenancy(
            CreateChildTenancyRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            CreateChildTenancyRequest, CreateChildTenancyResponse>
                    handler) {
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
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<DeleteOrganizationTenancyResponse> deleteOrganizationTenancy(
            DeleteOrganizationTenancyRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            DeleteOrganizationTenancyRequest, DeleteOrganizationTenancyResponse>
                    handler) {

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
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<GetOrganizationResponse> getOrganization(
            GetOrganizationRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            GetOrganizationRequest, GetOrganizationResponse>
                    handler) {

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
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<GetOrganizationTenancyResponse> getOrganizationTenancy(
            GetOrganizationTenancyRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            GetOrganizationTenancyRequest, GetOrganizationTenancyResponse>
                    handler) {

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
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ListOrganizationTenanciesResponse> listOrganizationTenancies(
            ListOrganizationTenanciesRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ListOrganizationTenanciesRequest, ListOrganizationTenanciesResponse>
                    handler) {

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
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ListOrganizationsResponse> listOrganizations(
            ListOrganizationsRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ListOrganizationsRequest, ListOrganizationsResponse>
                    handler) {
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
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<RestoreOrganizationTenancyResponse>
            restoreOrganizationTenancy(
                    RestoreOrganizationTenancyRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    RestoreOrganizationTenancyRequest,
                                    RestoreOrganizationTenancyResponse>
                            handler) {

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
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<UnapproveOrganizationTenancyForTransferResponse>
            unapproveOrganizationTenancyForTransfer(
                    UnapproveOrganizationTenancyForTransferRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    UnapproveOrganizationTenancyForTransferRequest,
                                    UnapproveOrganizationTenancyForTransferResponse>
                            handler) {
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
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<UpdateOrganizationResponse> updateOrganization(
            UpdateOrganizationRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            UpdateOrganizationRequest, UpdateOrganizationResponse>
                    handler) {

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
                .callAsync(handler);
    }

    /**
     * Create a new client instance.
     *
     * @param authenticationDetailsProvider The authentication details (see {@link Builder#build})
     * @deprecated Use the {@link #builder() builder} instead.
     */
    @Deprecated
    public OrganizationAsyncClient(
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
    public OrganizationAsyncClient(
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
    public OrganizationAsyncClient(
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
    public OrganizationAsyncClient(
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
    public OrganizationAsyncClient(
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
    public OrganizationAsyncClient(
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
    public OrganizationAsyncClient(
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
