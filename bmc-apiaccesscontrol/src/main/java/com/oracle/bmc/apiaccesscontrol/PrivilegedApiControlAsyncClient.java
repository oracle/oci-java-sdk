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
 * Async client implementation for PrivilegedApiControl service. <br>
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
public class PrivilegedApiControlAsyncClient extends com.oracle.bmc.http.internal.BaseAsyncClient
        implements PrivilegedApiControlAsync {
    /** Service instance for PrivilegedApiControl. */
    public static final com.oracle.bmc.Service SERVICE =
            com.oracle.bmc.Services.serviceBuilder()
                    .serviceName("PRIVILEGEDAPICONTROL")
                    .serviceEndpointPrefix("")
                    .serviceEndpointTemplate("https://pactl.{region}.oci.{secondLevelDomain}")
                    .build();

    private static final org.slf4j.Logger LOG =
            org.slf4j.LoggerFactory.getLogger(PrivilegedApiControlAsyncClient.class);

    PrivilegedApiControlAsyncClient(
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
                    Builder, PrivilegedApiControlAsyncClient> {
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
        public PrivilegedApiControlAsyncClient build(
                @jakarta.annotation.Nonnull
                        com.oracle.bmc.auth.AbstractAuthenticationDetailsProvider
                                authenticationDetailsProvider) {
            return new PrivilegedApiControlAsyncClient(this, authenticationDetailsProvider);
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
    public java.util.concurrent.Future<ChangePrivilegedApiControlCompartmentResponse>
            changePrivilegedApiControlCompartment(
                    ChangePrivilegedApiControlCompartmentRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    ChangePrivilegedApiControlCompartmentRequest,
                                    ChangePrivilegedApiControlCompartmentResponse>
                            handler) {

        Validate.notBlank(
                request.getPrivilegedApiControlId(), "privilegedApiControlId must not be blank");
        Objects.requireNonNull(
                request.getChangePrivilegedApiControlCompartmentDetails(),
                "changePrivilegedApiControlCompartmentDetails is required");

        return clientCall(request, ChangePrivilegedApiControlCompartmentResponse::builder)
                .logger(LOG, "changePrivilegedApiControlCompartment")
                .serviceDetails("PrivilegedApiControl", "ChangePrivilegedApiControlCompartment", "")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(ChangePrivilegedApiControlCompartmentRequest::builder)
                .basePath("/20241130")
                .appendPathParam("privilegedApiControls")
                .appendPathParam(request.getPrivilegedApiControlId())
                .appendPathParam("actions")
                .appendPathParam("changeCompartment")
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .hasBody()
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        ChangePrivilegedApiControlCompartmentResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id",
                        ChangePrivilegedApiControlCompartmentResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<CreatePrivilegedApiControlResponse>
            createPrivilegedApiControl(
                    CreatePrivilegedApiControlRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    CreatePrivilegedApiControlRequest,
                                    CreatePrivilegedApiControlResponse>
                            handler) {
        Objects.requireNonNull(
                request.getCreatePrivilegedApiControlDetails(),
                "createPrivilegedApiControlDetails is required");

        return clientCall(request, CreatePrivilegedApiControlResponse::builder)
                .logger(LOG, "createPrivilegedApiControl")
                .serviceDetails("PrivilegedApiControl", "CreatePrivilegedApiControl", "")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(CreatePrivilegedApiControlRequest::builder)
                .basePath("/20241130")
                .appendPathParam("privilegedApiControls")
                .accept("application/json")
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.apiaccesscontrol.model.PrivilegedApiControl.class,
                        CreatePrivilegedApiControlResponse.Builder::privilegedApiControl)
                .handleResponseHeaderString(
                        "location", CreatePrivilegedApiControlResponse.Builder::location)
                .handleResponseHeaderString(
                        "content-location",
                        CreatePrivilegedApiControlResponse.Builder::contentLocation)
                .handleResponseHeaderString(
                        "etag", CreatePrivilegedApiControlResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        CreatePrivilegedApiControlResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", CreatePrivilegedApiControlResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<DeletePrivilegedApiControlResponse>
            deletePrivilegedApiControl(
                    DeletePrivilegedApiControlRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    DeletePrivilegedApiControlRequest,
                                    DeletePrivilegedApiControlResponse>
                            handler) {

        Validate.notBlank(
                request.getPrivilegedApiControlId(), "privilegedApiControlId must not be blank");

        return clientCall(request, DeletePrivilegedApiControlResponse::builder)
                .logger(LOG, "deletePrivilegedApiControl")
                .serviceDetails("PrivilegedApiControl", "DeletePrivilegedApiControl", "")
                .method(com.oracle.bmc.http.client.Method.DELETE)
                .requestBuilder(DeletePrivilegedApiControlRequest::builder)
                .basePath("/20241130")
                .appendPathParam("privilegedApiControls")
                .appendPathParam(request.getPrivilegedApiControlId())
                .appendQueryParam("description", request.getDescription())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        DeletePrivilegedApiControlResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", DeletePrivilegedApiControlResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<GetPrivilegedApiControlResponse> getPrivilegedApiControl(
            GetPrivilegedApiControlRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            GetPrivilegedApiControlRequest, GetPrivilegedApiControlResponse>
                    handler) {

        Validate.notBlank(
                request.getPrivilegedApiControlId(), "privilegedApiControlId must not be blank");

        return clientCall(request, GetPrivilegedApiControlResponse::builder)
                .logger(LOG, "getPrivilegedApiControl")
                .serviceDetails("PrivilegedApiControl", "GetPrivilegedApiControl", "")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetPrivilegedApiControlRequest::builder)
                .basePath("/20241130")
                .appendPathParam("privilegedApiControls")
                .appendPathParam(request.getPrivilegedApiControlId())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.apiaccesscontrol.model.PrivilegedApiControl.class,
                        GetPrivilegedApiControlResponse.Builder::privilegedApiControl)
                .handleResponseHeaderString("etag", GetPrivilegedApiControlResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", GetPrivilegedApiControlResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ListPrivilegedApiControlsResponse> listPrivilegedApiControls(
            ListPrivilegedApiControlsRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ListPrivilegedApiControlsRequest, ListPrivilegedApiControlsResponse>
                    handler) {

        return clientCall(request, ListPrivilegedApiControlsResponse::builder)
                .logger(LOG, "listPrivilegedApiControls")
                .serviceDetails("PrivilegedApiControl", "ListPrivilegedApiControls", "")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListPrivilegedApiControlsRequest::builder)
                .basePath("/20241130")
                .appendPathParam("privilegedApiControls")
                .appendQueryParam("compartmentId", request.getCompartmentId())
                .appendQueryParam("id", request.getId())
                .appendEnumQueryParam("lifecycleState", request.getLifecycleState())
                .appendQueryParam("displayName", request.getDisplayName())
                .appendQueryParam("resourceType", request.getResourceType())
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.apiaccesscontrol.model.PrivilegedApiControlCollection.class,
                        ListPrivilegedApiControlsResponse.Builder::privilegedApiControlCollection)
                .handleResponseHeaderString(
                        "opc-request-id", ListPrivilegedApiControlsResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListPrivilegedApiControlsResponse.Builder::opcNextPage)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<UpdatePrivilegedApiControlResponse>
            updatePrivilegedApiControl(
                    UpdatePrivilegedApiControlRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    UpdatePrivilegedApiControlRequest,
                                    UpdatePrivilegedApiControlResponse>
                            handler) {

        Validate.notBlank(
                request.getPrivilegedApiControlId(), "privilegedApiControlId must not be blank");
        Objects.requireNonNull(
                request.getUpdatePrivilegedApiControlDetails(),
                "updatePrivilegedApiControlDetails is required");

        return clientCall(request, UpdatePrivilegedApiControlResponse::builder)
                .logger(LOG, "updatePrivilegedApiControl")
                .serviceDetails("PrivilegedApiControl", "UpdatePrivilegedApiControl", "")
                .method(com.oracle.bmc.http.client.Method.PUT)
                .requestBuilder(UpdatePrivilegedApiControlRequest::builder)
                .basePath("/20241130")
                .appendPathParam("privilegedApiControls")
                .appendPathParam(request.getPrivilegedApiControlId())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .hasBody()
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        UpdatePrivilegedApiControlResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", UpdatePrivilegedApiControlResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    /**
     * Create a new client instance.
     *
     * @param authenticationDetailsProvider The authentication details (see {@link Builder#build})
     * @deprecated Use the {@link #builder() builder} instead.
     */
    @Deprecated
    public PrivilegedApiControlAsyncClient(
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
    public PrivilegedApiControlAsyncClient(
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
    public PrivilegedApiControlAsyncClient(
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
    public PrivilegedApiControlAsyncClient(
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
    public PrivilegedApiControlAsyncClient(
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
    public PrivilegedApiControlAsyncClient(
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
    public PrivilegedApiControlAsyncClient(
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
