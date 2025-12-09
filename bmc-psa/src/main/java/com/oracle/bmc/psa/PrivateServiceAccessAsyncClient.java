/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.psa;

import com.oracle.bmc.util.internal.Validate;
import com.oracle.bmc.psa.requests.*;
import com.oracle.bmc.psa.responses.*;

import java.util.Objects;

/**
 * Async client implementation for PrivateServiceAccess service. <br>
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
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20240301")
public class PrivateServiceAccessAsyncClient extends com.oracle.bmc.http.internal.BaseAsyncClient
        implements PrivateServiceAccessAsync {
    /** Service instance for PrivateServiceAccess. */
    public static final com.oracle.bmc.Service SERVICE =
            com.oracle.bmc.Services.serviceBuilder()
                    .serviceName(PrivateServiceAccessClient.class.getName())
                    .serviceEndpointPrefix("")
                    .serviceEndpointTemplate("https://psasvc.{region}.oci.{secondLevelDomain}")
                    .endpointServiceName("psasvc")
                    .build();

    private static final org.slf4j.Logger LOG =
            org.slf4j.LoggerFactory.getLogger(PrivateServiceAccessAsyncClient.class);

    PrivateServiceAccessAsyncClient(
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
                    Builder, PrivateServiceAccessAsyncClient> {
        private Builder(com.oracle.bmc.Service service) {
            super(service);
            final String packageName = "psa";
            com.oracle.bmc.internal.Alloy.throwDisabledServiceExceptionIfAppropriate(packageName);
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
        public PrivateServiceAccessAsyncClient build(
                @jakarta.annotation.Nonnull
                        com.oracle.bmc.auth.AbstractAuthenticationDetailsProvider
                                authenticationDetailsProvider) {
            return new PrivateServiceAccessAsyncClient(this, authenticationDetailsProvider);
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
    public java.util.concurrent.Future<CancelPsaWorkRequestResponse> cancelPsaWorkRequest(
            CancelPsaWorkRequestRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            CancelPsaWorkRequestRequest, CancelPsaWorkRequestResponse>
                    handler) {

        Validate.notBlank(request.getWorkRequestId(), "workRequestId must not be blank");

        return clientCall(request, CancelPsaWorkRequestResponse::builder)
                .logger(LOG, "cancelPsaWorkRequest")
                .serviceDetails("PrivateServiceAccess", "CancelPsaWorkRequest", "")
                .method(com.oracle.bmc.http.client.Method.DELETE)
                .requestBuilder(CancelPsaWorkRequestRequest::builder)
                .basePath("/20240301")
                .appendPathParam("psaWorkRequests")
                .appendPathParam(request.getWorkRequestId())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleResponseHeaderString(
                        "opc-request-id", CancelPsaWorkRequestResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ChangePrivateServiceAccessCompartmentResponse>
            changePrivateServiceAccessCompartment(
                    ChangePrivateServiceAccessCompartmentRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    ChangePrivateServiceAccessCompartmentRequest,
                                    ChangePrivateServiceAccessCompartmentResponse>
                            handler) {

        Validate.notBlank(
                request.getPrivateServiceAccessId(), "privateServiceAccessId must not be blank");
        Objects.requireNonNull(
                request.getChangePrivateServiceAccessCompartmentDetails(),
                "changePrivateServiceAccessCompartmentDetails is required");

        return clientCall(request, ChangePrivateServiceAccessCompartmentResponse::builder)
                .logger(LOG, "changePrivateServiceAccessCompartment")
                .serviceDetails("PrivateServiceAccess", "ChangePrivateServiceAccessCompartment", "")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(ChangePrivateServiceAccessCompartmentRequest::builder)
                .basePath("/20240301")
                .appendPathParam("privateServiceAccess")
                .appendPathParam(request.getPrivateServiceAccessId())
                .appendPathParam("actions")
                .appendPathParam("changeCompartment")
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .hasBody()
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        ChangePrivateServiceAccessCompartmentResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id",
                        ChangePrivateServiceAccessCompartmentResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<CreatePrivateServiceAccessResponse>
            createPrivateServiceAccess(
                    CreatePrivateServiceAccessRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    CreatePrivateServiceAccessRequest,
                                    CreatePrivateServiceAccessResponse>
                            handler) {
        Objects.requireNonNull(
                request.getCreatePrivateServiceAccessDetails(),
                "createPrivateServiceAccessDetails is required");

        return clientCall(request, CreatePrivateServiceAccessResponse::builder)
                .logger(LOG, "createPrivateServiceAccess")
                .serviceDetails("PrivateServiceAccess", "CreatePrivateServiceAccess", "")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(CreatePrivateServiceAccessRequest::builder)
                .basePath("/20240301")
                .appendPathParam("privateServiceAccess")
                .accept("application/json")
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.psa.model.PrivateServiceAccess.class,
                        CreatePrivateServiceAccessResponse.Builder::privateServiceAccess)
                .handleResponseHeaderString(
                        "location", CreatePrivateServiceAccessResponse.Builder::location)
                .handleResponseHeaderString(
                        "content-location",
                        CreatePrivateServiceAccessResponse.Builder::contentLocation)
                .handleResponseHeaderString(
                        "etag", CreatePrivateServiceAccessResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        CreatePrivateServiceAccessResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", CreatePrivateServiceAccessResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<DeletePrivateServiceAccessResponse>
            deletePrivateServiceAccess(
                    DeletePrivateServiceAccessRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    DeletePrivateServiceAccessRequest,
                                    DeletePrivateServiceAccessResponse>
                            handler) {

        Validate.notBlank(
                request.getPrivateServiceAccessId(), "privateServiceAccessId must not be blank");

        return clientCall(request, DeletePrivateServiceAccessResponse::builder)
                .logger(LOG, "deletePrivateServiceAccess")
                .serviceDetails("PrivateServiceAccess", "DeletePrivateServiceAccess", "")
                .method(com.oracle.bmc.http.client.Method.DELETE)
                .requestBuilder(DeletePrivateServiceAccessRequest::builder)
                .basePath("/20240301")
                .appendPathParam("privateServiceAccess")
                .appendPathParam(request.getPrivateServiceAccessId())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        DeletePrivateServiceAccessResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", DeletePrivateServiceAccessResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<GetPrivateServiceAccessResponse> getPrivateServiceAccess(
            GetPrivateServiceAccessRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            GetPrivateServiceAccessRequest, GetPrivateServiceAccessResponse>
                    handler) {

        Validate.notBlank(
                request.getPrivateServiceAccessId(), "privateServiceAccessId must not be blank");

        return clientCall(request, GetPrivateServiceAccessResponse::builder)
                .logger(LOG, "getPrivateServiceAccess")
                .serviceDetails("PrivateServiceAccess", "GetPrivateServiceAccess", "")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetPrivateServiceAccessRequest::builder)
                .basePath("/20240301")
                .appendPathParam("privateServiceAccess")
                .appendPathParam(request.getPrivateServiceAccessId())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.psa.model.PrivateServiceAccess.class,
                        GetPrivateServiceAccessResponse.Builder::privateServiceAccess)
                .handleResponseHeaderString("etag", GetPrivateServiceAccessResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", GetPrivateServiceAccessResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<GetPsaWorkRequestResponse> getPsaWorkRequest(
            GetPsaWorkRequestRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            GetPsaWorkRequestRequest, GetPsaWorkRequestResponse>
                    handler) {

        Validate.notBlank(request.getWorkRequestId(), "workRequestId must not be blank");

        return clientCall(request, GetPsaWorkRequestResponse::builder)
                .logger(LOG, "getPsaWorkRequest")
                .serviceDetails("PrivateServiceAccess", "GetPsaWorkRequest", "")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetPsaWorkRequestRequest::builder)
                .basePath("/20240301")
                .appendPathParam("psaWorkRequests")
                .appendPathParam(request.getWorkRequestId())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.psa.model.WorkRequest.class,
                        GetPsaWorkRequestResponse.Builder::workRequest)
                .handleResponseHeaderString("etag", GetPsaWorkRequestResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", GetPsaWorkRequestResponse.Builder::opcRequestId)
                .handleResponseHeaderInteger(
                        "retry-after", GetPsaWorkRequestResponse.Builder::retryAfter)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ListPrivateServiceAccessesResponse>
            listPrivateServiceAccesses(
                    ListPrivateServiceAccessesRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    ListPrivateServiceAccessesRequest,
                                    ListPrivateServiceAccessesResponse>
                            handler) {

        return clientCall(request, ListPrivateServiceAccessesResponse::builder)
                .logger(LOG, "listPrivateServiceAccesses")
                .serviceDetails("PrivateServiceAccess", "ListPrivateServiceAccesses", "")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListPrivateServiceAccessesRequest::builder)
                .basePath("/20240301")
                .appendPathParam("privateServiceAccess")
                .appendQueryParam("compartmentId", request.getCompartmentId())
                .appendEnumQueryParam("lifecycleState", request.getLifecycleState())
                .appendQueryParam("displayName", request.getDisplayName())
                .appendQueryParam("id", request.getId())
                .appendQueryParam("vcnId", request.getVcnId())
                .appendQueryParam("serviceId", request.getServiceId())
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.psa.model.PrivateServiceAccessCollection.class,
                        ListPrivateServiceAccessesResponse.Builder::privateServiceAccessCollection)
                .handleResponseHeaderString(
                        "opc-request-id", ListPrivateServiceAccessesResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListPrivateServiceAccessesResponse.Builder::opcNextPage)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ListPsaServicesResponse> listPsaServices(
            ListPsaServicesRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ListPsaServicesRequest, ListPsaServicesResponse>
                    handler) {

        return clientCall(request, ListPsaServicesResponse::builder)
                .logger(LOG, "listPsaServices")
                .serviceDetails("PrivateServiceAccess", "ListPsaServices", "")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListPsaServicesRequest::builder)
                .basePath("/20240301")
                .appendPathParam("psaServices")
                .appendQueryParam("displayName", request.getDisplayName())
                .appendQueryParam("serviceId", request.getServiceId())
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.psa.model.PsaServiceCollection.class,
                        ListPsaServicesResponse.Builder::psaServiceCollection)
                .handleResponseHeaderString(
                        "opc-request-id", ListPsaServicesResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListPsaServicesResponse.Builder::opcNextPage)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ListPsaWorkRequestErrorsResponse> listPsaWorkRequestErrors(
            ListPsaWorkRequestErrorsRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ListPsaWorkRequestErrorsRequest, ListPsaWorkRequestErrorsResponse>
                    handler) {

        Validate.notBlank(request.getWorkRequestId(), "workRequestId must not be blank");

        return clientCall(request, ListPsaWorkRequestErrorsResponse::builder)
                .logger(LOG, "listPsaWorkRequestErrors")
                .serviceDetails("PrivateServiceAccess", "ListPsaWorkRequestErrors", "")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListPsaWorkRequestErrorsRequest::builder)
                .basePath("/20240301")
                .appendPathParam("psaWorkRequests")
                .appendPathParam(request.getWorkRequestId())
                .appendPathParam("errors")
                .appendQueryParam("page", request.getPage())
                .appendQueryParam("limit", request.getLimit())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.psa.model.WorkRequestErrorCollection.class,
                        ListPsaWorkRequestErrorsResponse.Builder::workRequestErrorCollection)
                .handleResponseHeaderString(
                        "opc-next-page", ListPsaWorkRequestErrorsResponse.Builder::opcNextPage)
                .handleResponseHeaderString(
                        "opc-request-id", ListPsaWorkRequestErrorsResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ListPsaWorkRequestLogsResponse> listPsaWorkRequestLogs(
            ListPsaWorkRequestLogsRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ListPsaWorkRequestLogsRequest, ListPsaWorkRequestLogsResponse>
                    handler) {

        Validate.notBlank(request.getWorkRequestId(), "workRequestId must not be blank");

        return clientCall(request, ListPsaWorkRequestLogsResponse::builder)
                .logger(LOG, "listPsaWorkRequestLogs")
                .serviceDetails("PrivateServiceAccess", "ListPsaWorkRequestLogs", "")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListPsaWorkRequestLogsRequest::builder)
                .basePath("/20240301")
                .appendPathParam("psaWorkRequests")
                .appendPathParam(request.getWorkRequestId())
                .appendPathParam("logs")
                .appendQueryParam("page", request.getPage())
                .appendQueryParam("limit", request.getLimit())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.psa.model.WorkRequestLogEntryCollection.class,
                        ListPsaWorkRequestLogsResponse.Builder::workRequestLogEntryCollection)
                .handleResponseHeaderString(
                        "opc-next-page", ListPsaWorkRequestLogsResponse.Builder::opcNextPage)
                .handleResponseHeaderString(
                        "opc-request-id", ListPsaWorkRequestLogsResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ListPsaWorkRequestsResponse> listPsaWorkRequests(
            ListPsaWorkRequestsRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ListPsaWorkRequestsRequest, ListPsaWorkRequestsResponse>
                    handler) {

        return clientCall(request, ListPsaWorkRequestsResponse::builder)
                .logger(LOG, "listPsaWorkRequests")
                .serviceDetails("PrivateServiceAccess", "ListPsaWorkRequests", "")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListPsaWorkRequestsRequest::builder)
                .basePath("/20240301")
                .appendPathParam("psaWorkRequests")
                .appendQueryParam("compartmentId", request.getCompartmentId())
                .appendQueryParam("workRequestId", request.getWorkRequestId())
                .appendEnumQueryParam("status", request.getStatus())
                .appendQueryParam("resourceId", request.getResourceId())
                .appendQueryParam("page", request.getPage())
                .appendQueryParam("limit", request.getLimit())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.psa.model.WorkRequestSummaryCollection.class,
                        ListPsaWorkRequestsResponse.Builder::workRequestSummaryCollection)
                .handleResponseHeaderString(
                        "opc-request-id", ListPsaWorkRequestsResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListPsaWorkRequestsResponse.Builder::opcNextPage)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<UpdatePrivateServiceAccessResponse>
            updatePrivateServiceAccess(
                    UpdatePrivateServiceAccessRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    UpdatePrivateServiceAccessRequest,
                                    UpdatePrivateServiceAccessResponse>
                            handler) {

        Validate.notBlank(
                request.getPrivateServiceAccessId(), "privateServiceAccessId must not be blank");
        Objects.requireNonNull(
                request.getUpdatePrivateServiceAccessDetails(),
                "updatePrivateServiceAccessDetails is required");

        return clientCall(request, UpdatePrivateServiceAccessResponse::builder)
                .logger(LOG, "updatePrivateServiceAccess")
                .serviceDetails("PrivateServiceAccess", "UpdatePrivateServiceAccess", "")
                .method(com.oracle.bmc.http.client.Method.PUT)
                .requestBuilder(UpdatePrivateServiceAccessRequest::builder)
                .basePath("/20240301")
                .appendPathParam("privateServiceAccess")
                .appendPathParam(request.getPrivateServiceAccessId())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .hasBody()
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        UpdatePrivateServiceAccessResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", UpdatePrivateServiceAccessResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    /**
     * Create a new client instance.
     *
     * @param authenticationDetailsProvider The authentication details (see {@link Builder#build})
     * @deprecated Use the {@link #builder() builder} instead.
     */
    @Deprecated
    public PrivateServiceAccessAsyncClient(
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
    public PrivateServiceAccessAsyncClient(
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
    public PrivateServiceAccessAsyncClient(
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
    public PrivateServiceAccessAsyncClient(
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
    public PrivateServiceAccessAsyncClient(
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
    public PrivateServiceAccessAsyncClient(
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
    public PrivateServiceAccessAsyncClient(
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
