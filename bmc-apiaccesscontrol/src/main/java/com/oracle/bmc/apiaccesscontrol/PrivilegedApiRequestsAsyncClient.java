/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.apiaccesscontrol;

import com.oracle.bmc.util.internal.Validate;
import com.oracle.bmc.apiaccesscontrol.requests.*;
import com.oracle.bmc.apiaccesscontrol.responses.*;

import java.util.Objects;

/**
 * Async client implementation for PrivilegedApiRequests service. <br>
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
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20241130")
public class PrivilegedApiRequestsAsyncClient extends com.oracle.bmc.http.internal.BaseAsyncClient
        implements PrivilegedApiRequestsAsync {
    /** Service instance for PrivilegedApiRequests. */
    public static final com.oracle.bmc.Service SERVICE =
            com.oracle.bmc.Services.serviceBuilder()
                    .serviceName("PRIVILEGEDAPIREQUESTS")
                    .serviceEndpointPrefix("")
                    .serviceEndpointTemplate("https://pactl.{region}.oci.{secondLevelDomain}")
                    .build();

    private static final org.slf4j.Logger LOG =
            org.slf4j.LoggerFactory.getLogger(PrivilegedApiRequestsAsyncClient.class);

    PrivilegedApiRequestsAsyncClient(
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
                    Builder, PrivilegedApiRequestsAsyncClient> {
        private Builder(com.oracle.bmc.Service service) {
            super(service);
            final String packageName = "apiaccesscontrol";
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
        public PrivilegedApiRequestsAsyncClient build(
                @jakarta.annotation.Nonnull
                        com.oracle.bmc.auth.AbstractAuthenticationDetailsProvider
                                authenticationDetailsProvider) {
            return new PrivilegedApiRequestsAsyncClient(this, authenticationDetailsProvider);
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
    public java.util.concurrent.Future<ApprovePrivilegedApiRequestResponse>
            approvePrivilegedApiRequest(
                    ApprovePrivilegedApiRequestRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    ApprovePrivilegedApiRequestRequest,
                                    ApprovePrivilegedApiRequestResponse>
                            handler) {

        Validate.notBlank(
                request.getPrivilegedApiRequestId(), "privilegedApiRequestId must not be blank");
        Objects.requireNonNull(
                request.getApprovePrivilegedApiRequestDetails(),
                "approvePrivilegedApiRequestDetails is required");

        return clientCall(request, ApprovePrivilegedApiRequestResponse::builder)
                .logger(LOG, "approvePrivilegedApiRequest")
                .serviceDetails(
                        "PrivilegedApiRequests",
                        "ApprovePrivilegedApiRequest",
                        "https://docs.oracle.com/iaas/api/#/en/oracle-api-access-control/20241130/PrivilegedApiRequest/ApprovePrivilegedApiRequest")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(ApprovePrivilegedApiRequestRequest::builder)
                .basePath("/20241130")
                .appendPathParam("privilegedApiRequests")
                .appendPathParam(request.getPrivilegedApiRequestId())
                .appendPathParam("actions")
                .appendPathParam("approve")
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .hasBody()
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        ApprovePrivilegedApiRequestResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", ApprovePrivilegedApiRequestResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ClosePrivilegedApiRequestResponse> closePrivilegedApiRequest(
            ClosePrivilegedApiRequestRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ClosePrivilegedApiRequestRequest, ClosePrivilegedApiRequestResponse>
                    handler) {

        Validate.notBlank(
                request.getPrivilegedApiRequestId(), "privilegedApiRequestId must not be blank");
        Objects.requireNonNull(
                request.getClosePrivilegedApiRequestDetails(),
                "closePrivilegedApiRequestDetails is required");

        return clientCall(request, ClosePrivilegedApiRequestResponse::builder)
                .logger(LOG, "closePrivilegedApiRequest")
                .serviceDetails(
                        "PrivilegedApiRequests",
                        "ClosePrivilegedApiRequest",
                        "https://docs.oracle.com/iaas/api/#/en/oracle-api-access-control/20241130/PrivilegedApiRequest/ClosePrivilegedApiRequest")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(ClosePrivilegedApiRequestRequest::builder)
                .basePath("/20241130")
                .appendPathParam("privilegedApiRequests")
                .appendPathParam(request.getPrivilegedApiRequestId())
                .appendPathParam("actions")
                .appendPathParam("close")
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .hasBody()
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        ClosePrivilegedApiRequestResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", ClosePrivilegedApiRequestResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<CreatePrivilegedApiRequestResponse>
            createPrivilegedApiRequest(
                    CreatePrivilegedApiRequestRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    CreatePrivilegedApiRequestRequest,
                                    CreatePrivilegedApiRequestResponse>
                            handler) {
        Objects.requireNonNull(
                request.getCreatePrivilegedApiRequestDetails(),
                "createPrivilegedApiRequestDetails is required");

        return clientCall(request, CreatePrivilegedApiRequestResponse::builder)
                .logger(LOG, "createPrivilegedApiRequest")
                .serviceDetails(
                        "PrivilegedApiRequests",
                        "CreatePrivilegedApiRequest",
                        "https://docs.oracle.com/iaas/api/#/en/oracle-api-access-control/20241130/PrivilegedApiRequest/CreatePrivilegedApiRequest")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(CreatePrivilegedApiRequestRequest::builder)
                .basePath("/20241130")
                .appendPathParam("privilegedApiRequests")
                .accept("application/json")
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.apiaccesscontrol.model.PrivilegedApiRequest.class,
                        CreatePrivilegedApiRequestResponse.Builder::privilegedApiRequest)
                .handleResponseHeaderString(
                        "location", CreatePrivilegedApiRequestResponse.Builder::location)
                .handleResponseHeaderString(
                        "content-location",
                        CreatePrivilegedApiRequestResponse.Builder::contentLocation)
                .handleResponseHeaderString(
                        "etag", CreatePrivilegedApiRequestResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        CreatePrivilegedApiRequestResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", CreatePrivilegedApiRequestResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<GetPrivilegedApiRequestResponse> getPrivilegedApiRequest(
            GetPrivilegedApiRequestRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            GetPrivilegedApiRequestRequest, GetPrivilegedApiRequestResponse>
                    handler) {

        Validate.notBlank(
                request.getPrivilegedApiRequestId(), "privilegedApiRequestId must not be blank");

        return clientCall(request, GetPrivilegedApiRequestResponse::builder)
                .logger(LOG, "getPrivilegedApiRequest")
                .serviceDetails(
                        "PrivilegedApiRequests",
                        "GetPrivilegedApiRequest",
                        "https://docs.oracle.com/iaas/api/#/en/oracle-api-access-control/20241130/PrivilegedApiRequest/GetPrivilegedApiRequest")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetPrivilegedApiRequestRequest::builder)
                .basePath("/20241130")
                .appendPathParam("privilegedApiRequests")
                .appendPathParam(request.getPrivilegedApiRequestId())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.apiaccesscontrol.model.PrivilegedApiRequest.class,
                        GetPrivilegedApiRequestResponse.Builder::privilegedApiRequest)
                .handleResponseHeaderString("etag", GetPrivilegedApiRequestResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", GetPrivilegedApiRequestResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ListPrivilegedApiRequestsResponse> listPrivilegedApiRequests(
            ListPrivilegedApiRequestsRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ListPrivilegedApiRequestsRequest, ListPrivilegedApiRequestsResponse>
                    handler) {

        return clientCall(request, ListPrivilegedApiRequestsResponse::builder)
                .logger(LOG, "listPrivilegedApiRequests")
                .serviceDetails(
                        "PrivilegedApiRequests",
                        "ListPrivilegedApiRequests",
                        "https://docs.oracle.com/iaas/api/#/en/oracle-api-access-control/20241130/PrivilegedApiRequestCollection/ListPrivilegedApiRequests")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListPrivilegedApiRequestsRequest::builder)
                .basePath("/20241130")
                .appendPathParam("privilegedApiRequests")
                .appendQueryParam("compartmentId", request.getCompartmentId())
                .appendQueryParam("id", request.getId())
                .appendQueryParam("displayName", request.getDisplayName())
                .appendQueryParam("resourceId", request.getResourceId())
                .appendQueryParam("resourceType", request.getResourceType())
                .appendEnumQueryParam("lifecycleState", request.getLifecycleState())
                .appendEnumQueryParam("state", request.getState())
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.apiaccesscontrol.model.PrivilegedApiRequestCollection.class,
                        ListPrivilegedApiRequestsResponse.Builder::privilegedApiRequestCollection)
                .handleResponseHeaderString(
                        "opc-request-id", ListPrivilegedApiRequestsResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListPrivilegedApiRequestsResponse.Builder::opcNextPage)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<RejectPrivilegedApiRequestResponse>
            rejectPrivilegedApiRequest(
                    RejectPrivilegedApiRequestRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    RejectPrivilegedApiRequestRequest,
                                    RejectPrivilegedApiRequestResponse>
                            handler) {

        Validate.notBlank(
                request.getPrivilegedApiRequestId(), "privilegedApiRequestId must not be blank");
        Objects.requireNonNull(
                request.getRejectPrivilegedApiRequestDetails(),
                "rejectPrivilegedApiRequestDetails is required");

        return clientCall(request, RejectPrivilegedApiRequestResponse::builder)
                .logger(LOG, "rejectPrivilegedApiRequest")
                .serviceDetails(
                        "PrivilegedApiRequests",
                        "RejectPrivilegedApiRequest",
                        "https://docs.oracle.com/iaas/api/#/en/oracle-api-access-control/20241130/PrivilegedApiRequest/RejectPrivilegedApiRequest")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(RejectPrivilegedApiRequestRequest::builder)
                .basePath("/20241130")
                .appendPathParam("privilegedApiRequests")
                .appendPathParam(request.getPrivilegedApiRequestId())
                .appendPathParam("actions")
                .appendPathParam("reject")
                .accept("application/json")
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .hasBody()
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        RejectPrivilegedApiRequestResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", RejectPrivilegedApiRequestResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<RevokePrivilegedApiRequestResponse>
            revokePrivilegedApiRequest(
                    RevokePrivilegedApiRequestRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    RevokePrivilegedApiRequestRequest,
                                    RevokePrivilegedApiRequestResponse>
                            handler) {

        Validate.notBlank(
                request.getPrivilegedApiRequestId(), "privilegedApiRequestId must not be blank");
        Objects.requireNonNull(
                request.getRevokePrivilegedApiRequestDetails(),
                "revokePrivilegedApiRequestDetails is required");

        return clientCall(request, RevokePrivilegedApiRequestResponse::builder)
                .logger(LOG, "revokePrivilegedApiRequest")
                .serviceDetails(
                        "PrivilegedApiRequests",
                        "RevokePrivilegedApiRequest",
                        "https://docs.oracle.com/iaas/api/#/en/oracle-api-access-control/20241130/PrivilegedApiRequest/RevokePrivilegedApiRequest")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(RevokePrivilegedApiRequestRequest::builder)
                .basePath("/20241130")
                .appendPathParam("privilegedApiRequests")
                .appendPathParam(request.getPrivilegedApiRequestId())
                .appendPathParam("actions")
                .appendPathParam("revoke")
                .accept("application/json")
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .hasBody()
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        RevokePrivilegedApiRequestResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", RevokePrivilegedApiRequestResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    /**
     * Create a new client instance.
     *
     * @param authenticationDetailsProvider The authentication details (see {@link Builder#build})
     * @deprecated Use the {@link #builder() builder} instead.
     */
    @Deprecated
    public PrivilegedApiRequestsAsyncClient(
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
    public PrivilegedApiRequestsAsyncClient(
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
    public PrivilegedApiRequestsAsyncClient(
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
    public PrivilegedApiRequestsAsyncClient(
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
    public PrivilegedApiRequestsAsyncClient(
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
    public PrivilegedApiRequestsAsyncClient(
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
    public PrivilegedApiRequestsAsyncClient(
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
