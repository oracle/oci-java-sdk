/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.operatoraccesscontrol;

import com.oracle.bmc.util.internal.Validate;
import com.oracle.bmc.operatoraccesscontrol.requests.*;
import com.oracle.bmc.operatoraccesscontrol.responses.*;

import java.util.Objects;

/**
 * Async client implementation for OperatorControlAssignment service. <br>
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
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200630")
public class OperatorControlAssignmentAsyncClient
        extends com.oracle.bmc.http.internal.BaseAsyncClient
        implements OperatorControlAssignmentAsync {
    /** Service instance for OperatorControlAssignment. */
    public static final com.oracle.bmc.Service SERVICE =
            com.oracle.bmc.Services.serviceBuilder()
                    .serviceName("OPERATORCONTROLASSIGNMENT")
                    .serviceEndpointPrefix("")
                    .serviceEndpointTemplate(
                            "https://operator-access-control.{region}.oci.{secondLevelDomain}")
                    .build();

    private static final org.slf4j.Logger LOG =
            org.slf4j.LoggerFactory.getLogger(OperatorControlAssignmentAsyncClient.class);

    OperatorControlAssignmentAsyncClient(
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
                    Builder, OperatorControlAssignmentAsyncClient> {
        private Builder(com.oracle.bmc.Service service) {
            super(service);
            final String packageName = "operatoraccesscontrol";
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
        public OperatorControlAssignmentAsyncClient build(
                @jakarta.annotation.Nonnull
                        com.oracle.bmc.auth.AbstractAuthenticationDetailsProvider
                                authenticationDetailsProvider) {
            return new OperatorControlAssignmentAsyncClient(this, authenticationDetailsProvider);
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
    public java.util.concurrent.Future<ChangeOperatorControlAssignmentCompartmentResponse>
            changeOperatorControlAssignmentCompartment(
                    ChangeOperatorControlAssignmentCompartmentRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    ChangeOperatorControlAssignmentCompartmentRequest,
                                    ChangeOperatorControlAssignmentCompartmentResponse>
                            handler) {

        Validate.notBlank(
                request.getOperatorControlAssignmentId(),
                "operatorControlAssignmentId must not be blank");
        Objects.requireNonNull(
                request.getChangeOperatorControlAssignmentCompartmentDetails(),
                "changeOperatorControlAssignmentCompartmentDetails is required");

        return clientCall(request, ChangeOperatorControlAssignmentCompartmentResponse::builder)
                .logger(LOG, "changeOperatorControlAssignmentCompartment")
                .serviceDetails(
                        "OperatorControlAssignment",
                        "ChangeOperatorControlAssignmentCompartment",
                        "")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(ChangeOperatorControlAssignmentCompartmentRequest::builder)
                .basePath("/20200630")
                .appendPathParam("operatorControlAssignments")
                .appendPathParam(request.getOperatorControlAssignmentId())
                .appendPathParam("actions")
                .appendPathParam("changeCompartment")
                .accept("application/json")
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .hasBody()
                .handleResponseHeaderString(
                        "opc-request-id",
                        ChangeOperatorControlAssignmentCompartmentResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<CreateOperatorControlAssignmentResponse>
            createOperatorControlAssignment(
                    CreateOperatorControlAssignmentRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    CreateOperatorControlAssignmentRequest,
                                    CreateOperatorControlAssignmentResponse>
                            handler) {
        Objects.requireNonNull(
                request.getCreateOperatorControlAssignmentDetails(),
                "createOperatorControlAssignmentDetails is required");

        return clientCall(request, CreateOperatorControlAssignmentResponse::builder)
                .logger(LOG, "createOperatorControlAssignment")
                .serviceDetails("OperatorControlAssignment", "CreateOperatorControlAssignment", "")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(CreateOperatorControlAssignmentRequest::builder)
                .basePath("/20200630")
                .appendPathParam("operatorControlAssignments")
                .accept("application/json")
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.operatoraccesscontrol.model.OperatorControlAssignment.class,
                        CreateOperatorControlAssignmentResponse.Builder::operatorControlAssignment)
                .handleResponseHeaderString(
                        "etag", CreateOperatorControlAssignmentResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        CreateOperatorControlAssignmentResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id",
                        CreateOperatorControlAssignmentResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<DeleteOperatorControlAssignmentResponse>
            deleteOperatorControlAssignment(
                    DeleteOperatorControlAssignmentRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    DeleteOperatorControlAssignmentRequest,
                                    DeleteOperatorControlAssignmentResponse>
                            handler) {

        Validate.notBlank(
                request.getOperatorControlAssignmentId(),
                "operatorControlAssignmentId must not be blank");

        return clientCall(request, DeleteOperatorControlAssignmentResponse::builder)
                .logger(LOG, "deleteOperatorControlAssignment")
                .serviceDetails("OperatorControlAssignment", "DeleteOperatorControlAssignment", "")
                .method(com.oracle.bmc.http.client.Method.DELETE)
                .requestBuilder(DeleteOperatorControlAssignmentRequest::builder)
                .basePath("/20200630")
                .appendPathParam("operatorControlAssignments")
                .appendPathParam(request.getOperatorControlAssignmentId())
                .appendQueryParam("description", request.getDescription())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleResponseHeaderString(
                        "opc-request-id",
                        DeleteOperatorControlAssignmentResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<GetAssignmentValidationStatusResponse>
            getAssignmentValidationStatus(
                    GetAssignmentValidationStatusRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    GetAssignmentValidationStatusRequest,
                                    GetAssignmentValidationStatusResponse>
                            handler) {

        Validate.notBlank(
                request.getOperatorControlAssignmentId(),
                "operatorControlAssignmentId must not be blank");

        return clientCall(request, GetAssignmentValidationStatusResponse::builder)
                .logger(LOG, "getAssignmentValidationStatus")
                .serviceDetails("OperatorControlAssignment", "GetAssignmentValidationStatus", "")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetAssignmentValidationStatusRequest::builder)
                .basePath("/20200630")
                .appendPathParam("operatorControlAssignments")
                .appendPathParam(request.getOperatorControlAssignmentId())
                .appendPathParam("actions")
                .appendPathParam("getAssignmentValidationStatus")
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.operatoraccesscontrol.model.AssignmentValidationStatus.class,
                        GetAssignmentValidationStatusResponse.Builder::assignmentValidationStatus)
                .handleResponseHeaderString(
                        "opc-request-id",
                        GetAssignmentValidationStatusResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", GetAssignmentValidationStatusResponse.Builder::opcNextPage)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<GetOperatorControlAssignmentResponse>
            getOperatorControlAssignment(
                    GetOperatorControlAssignmentRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    GetOperatorControlAssignmentRequest,
                                    GetOperatorControlAssignmentResponse>
                            handler) {

        Validate.notBlank(
                request.getOperatorControlAssignmentId(),
                "operatorControlAssignmentId must not be blank");

        return clientCall(request, GetOperatorControlAssignmentResponse::builder)
                .logger(LOG, "getOperatorControlAssignment")
                .serviceDetails("OperatorControlAssignment", "GetOperatorControlAssignment", "")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetOperatorControlAssignmentRequest::builder)
                .basePath("/20200630")
                .appendPathParam("operatorControlAssignments")
                .appendPathParam(request.getOperatorControlAssignmentId())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.operatoraccesscontrol.model.OperatorControlAssignment.class,
                        GetOperatorControlAssignmentResponse.Builder::operatorControlAssignment)
                .handleResponseHeaderString(
                        "etag", GetOperatorControlAssignmentResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id",
                        GetOperatorControlAssignmentResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ListOperatorControlAssignmentsResponse>
            listOperatorControlAssignments(
                    ListOperatorControlAssignmentsRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    ListOperatorControlAssignmentsRequest,
                                    ListOperatorControlAssignmentsResponse>
                            handler) {
        Objects.requireNonNull(request.getCompartmentId(), "compartmentId is required");

        return clientCall(request, ListOperatorControlAssignmentsResponse::builder)
                .logger(LOG, "listOperatorControlAssignments")
                .serviceDetails("OperatorControlAssignment", "ListOperatorControlAssignments", "")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListOperatorControlAssignmentsRequest::builder)
                .basePath("/20200630")
                .appendPathParam("operatorControlAssignments")
                .appendQueryParam("operatorControlName", request.getOperatorControlName())
                .appendQueryParam("resourceName", request.getResourceName())
                .appendQueryParam("compartmentId", request.getCompartmentId())
                .appendQueryParam("resourceType", request.getResourceType())
                .appendEnumQueryParam("lifecycleState", request.getLifecycleState())
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.operatoraccesscontrol.model
                                .OperatorControlAssignmentCollection.class,
                        ListOperatorControlAssignmentsResponse.Builder
                                ::operatorControlAssignmentCollection)
                .handleResponseHeaderString(
                        "opc-request-id",
                        ListOperatorControlAssignmentsResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page",
                        ListOperatorControlAssignmentsResponse.Builder::opcNextPage)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<UpdateOperatorControlAssignmentResponse>
            updateOperatorControlAssignment(
                    UpdateOperatorControlAssignmentRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    UpdateOperatorControlAssignmentRequest,
                                    UpdateOperatorControlAssignmentResponse>
                            handler) {

        Validate.notBlank(
                request.getOperatorControlAssignmentId(),
                "operatorControlAssignmentId must not be blank");
        Objects.requireNonNull(
                request.getUpdateOperatorControlAssignmentDetails(),
                "updateOperatorControlAssignmentDetails is required");

        return clientCall(request, UpdateOperatorControlAssignmentResponse::builder)
                .logger(LOG, "updateOperatorControlAssignment")
                .serviceDetails("OperatorControlAssignment", "UpdateOperatorControlAssignment", "")
                .method(com.oracle.bmc.http.client.Method.PUT)
                .requestBuilder(UpdateOperatorControlAssignmentRequest::builder)
                .basePath("/20200630")
                .appendPathParam("operatorControlAssignments")
                .appendPathParam(request.getOperatorControlAssignmentId())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.operatoraccesscontrol.model.OperatorControlAssignment.class,
                        UpdateOperatorControlAssignmentResponse.Builder::operatorControlAssignment)
                .handleResponseHeaderString(
                        "etag", UpdateOperatorControlAssignmentResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id",
                        UpdateOperatorControlAssignmentResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ValidateOperatorAssignmentResponse>
            validateOperatorAssignment(
                    ValidateOperatorAssignmentRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    ValidateOperatorAssignmentRequest,
                                    ValidateOperatorAssignmentResponse>
                            handler) {

        Validate.notBlank(
                request.getOperatorControlAssignmentId(),
                "operatorControlAssignmentId must not be blank");
        Objects.requireNonNull(
                request.getValidateOperatorAssignmentDetails(),
                "validateOperatorAssignmentDetails is required");

        return clientCall(request, ValidateOperatorAssignmentResponse::builder)
                .logger(LOG, "validateOperatorAssignment")
                .serviceDetails("OperatorControlAssignment", "ValidateOperatorAssignment", "")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(ValidateOperatorAssignmentRequest::builder)
                .basePath("/20200630")
                .appendPathParam("operatorControlAssignments")
                .appendPathParam(request.getOperatorControlAssignmentId())
                .appendPathParam("actions")
                .appendPathParam("validateAssignment")
                .accept("application/json")
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .hasBody()
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        ValidateOperatorAssignmentResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", ValidateOperatorAssignmentResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    /**
     * Create a new client instance.
     *
     * @param authenticationDetailsProvider The authentication details (see {@link Builder#build})
     * @deprecated Use the {@link #builder() builder} instead.
     */
    @Deprecated
    public OperatorControlAssignmentAsyncClient(
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
    public OperatorControlAssignmentAsyncClient(
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
    public OperatorControlAssignmentAsyncClient(
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
    public OperatorControlAssignmentAsyncClient(
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
    public OperatorControlAssignmentAsyncClient(
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
    public OperatorControlAssignmentAsyncClient(
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
    public OperatorControlAssignmentAsyncClient(
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
