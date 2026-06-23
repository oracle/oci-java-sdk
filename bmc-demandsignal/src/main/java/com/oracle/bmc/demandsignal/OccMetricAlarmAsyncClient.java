/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.demandsignal;

import com.oracle.bmc.util.internal.Validate;
import com.oracle.bmc.demandsignal.requests.*;
import com.oracle.bmc.demandsignal.responses.*;

import java.util.Objects;

/**
 * Async client implementation for OccMetricAlarm service. <br>
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
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20240430")
public class OccMetricAlarmAsyncClient extends com.oracle.bmc.http.internal.BaseAsyncClient
        implements OccMetricAlarmAsync {
    /** Service instance for OccMetricAlarm. */
    public static final com.oracle.bmc.Service SERVICE =
            com.oracle.bmc.Services.serviceBuilder()
                    .serviceName(OccMetricAlarmClient.class.getName())
                    .serviceEndpointPrefix("")
                    .serviceEndpointTemplate(
                            "https://control-center-ds.{region}.oci.{secondLevelDomain}")
                    .endpointServiceName("control-center-ds")
                    .build();

    private static final org.slf4j.Logger LOG =
            org.slf4j.LoggerFactory.getLogger(OccMetricAlarmAsyncClient.class);

    OccMetricAlarmAsyncClient(
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
                    Builder, OccMetricAlarmAsyncClient> {
        private Builder(com.oracle.bmc.Service service) {
            super(service);
            final String packageName = "demandsignal";
            com.oracle.bmc.internal.DeveloperToolConfiguration
                    .throwDisabledServiceExceptionIfAppropriate(packageName);
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
        public OccMetricAlarmAsyncClient build(
                @jakarta.annotation.Nonnull
                        com.oracle.bmc.auth.AbstractAuthenticationDetailsProvider
                                authenticationDetailsProvider) {
            return new OccMetricAlarmAsyncClient(this, authenticationDetailsProvider);
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
    public java.util.concurrent.Future<CreateOccMetricAlarmResponse> createOccMetricAlarm(
            CreateOccMetricAlarmRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            CreateOccMetricAlarmRequest, CreateOccMetricAlarmResponse>
                    handler) {
        Objects.requireNonNull(
                request.getCreateOccMetricAlarmDetails(),
                "createOccMetricAlarmDetails is required");

        return clientCall(request, CreateOccMetricAlarmResponse::builder)
                .logger(LOG, "createOccMetricAlarm")
                .serviceDetails(
                        "OccMetricAlarm",
                        "CreateOccMetricAlarm",
                        "https://docs.oracle.com/iaas/api/#/en/occds/20240430/OccMetricAlarm/CreateOccMetricAlarm")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(CreateOccMetricAlarmRequest::builder)
                .basePath("/20240430")
                .appendPathParam("occMetricAlarms")
                .accept("application/json")
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.demandsignal.model.OccMetricAlarm.class,
                        CreateOccMetricAlarmResponse.Builder::occMetricAlarm)
                .handleResponseHeaderString(
                        "opc-request-id", CreateOccMetricAlarmResponse.Builder::opcRequestId)
                .handleResponseHeaderString("etag", CreateOccMetricAlarmResponse.Builder::etag)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<DeleteOccMetricAlarmResponse> deleteOccMetricAlarm(
            DeleteOccMetricAlarmRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            DeleteOccMetricAlarmRequest, DeleteOccMetricAlarmResponse>
                    handler) {

        Validate.notBlank(request.getOccMetricAlarmId(), "occMetricAlarmId must not be blank");

        return clientCall(request, DeleteOccMetricAlarmResponse::builder)
                .logger(LOG, "deleteOccMetricAlarm")
                .serviceDetails(
                        "OccMetricAlarm",
                        "DeleteOccMetricAlarm",
                        "https://docs.oracle.com/iaas/api/#/en/occds/20240430/OccMetricAlarm/DeleteOccMetricAlarm")
                .method(com.oracle.bmc.http.client.Method.DELETE)
                .requestBuilder(DeleteOccMetricAlarmRequest::builder)
                .basePath("/20240430")
                .appendPathParam("occMetricAlarms")
                .appendPathParam(request.getOccMetricAlarmId())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleResponseHeaderString(
                        "opc-request-id", DeleteOccMetricAlarmResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<GetOccMetricAlarmResponse> getOccMetricAlarm(
            GetOccMetricAlarmRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            GetOccMetricAlarmRequest, GetOccMetricAlarmResponse>
                    handler) {

        Validate.notBlank(request.getOccMetricAlarmId(), "occMetricAlarmId must not be blank");

        return clientCall(request, GetOccMetricAlarmResponse::builder)
                .logger(LOG, "getOccMetricAlarm")
                .serviceDetails(
                        "OccMetricAlarm",
                        "GetOccMetricAlarm",
                        "https://docs.oracle.com/iaas/api/#/en/occds/20240430/OccMetricAlarm/GetOccMetricAlarm")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetOccMetricAlarmRequest::builder)
                .basePath("/20240430")
                .appendPathParam("occMetricAlarms")
                .appendPathParam(request.getOccMetricAlarmId())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.demandsignal.model.OccMetricAlarm.class,
                        GetOccMetricAlarmResponse.Builder::occMetricAlarm)
                .handleResponseHeaderString(
                        "opc-request-id", GetOccMetricAlarmResponse.Builder::opcRequestId)
                .handleResponseHeaderString("etag", GetOccMetricAlarmResponse.Builder::etag)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ListOccMetricAlarmsResponse> listOccMetricAlarms(
            ListOccMetricAlarmsRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ListOccMetricAlarmsRequest, ListOccMetricAlarmsResponse>
                    handler) {

        return clientCall(request, ListOccMetricAlarmsResponse::builder)
                .logger(LOG, "listOccMetricAlarms")
                .serviceDetails(
                        "OccMetricAlarm",
                        "ListOccMetricAlarms",
                        "https://docs.oracle.com/iaas/api/#/en/occds/20240430/OccMetricAlarmCollection/ListOccMetricAlarms")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListOccMetricAlarmsRequest::builder)
                .basePath("/20240430")
                .appendPathParam("occMetricAlarms")
                .appendQueryParam("compartmentId", request.getCompartmentId())
                .appendQueryParam("displayName", request.getDisplayName())
                .appendQueryParam("isActive", request.getIsActive())
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.demandsignal.model.OccMetricAlarmCollection.class,
                        ListOccMetricAlarmsResponse.Builder::occMetricAlarmCollection)
                .handleResponseHeaderString(
                        "opc-request-id", ListOccMetricAlarmsResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListOccMetricAlarmsResponse.Builder::opcNextPage)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<UpdateOccMetricAlarmResponse> updateOccMetricAlarm(
            UpdateOccMetricAlarmRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            UpdateOccMetricAlarmRequest, UpdateOccMetricAlarmResponse>
                    handler) {

        Validate.notBlank(request.getOccMetricAlarmId(), "occMetricAlarmId must not be blank");
        Objects.requireNonNull(
                request.getUpdateOccMetricAlarmDetails(),
                "updateOccMetricAlarmDetails is required");

        return clientCall(request, UpdateOccMetricAlarmResponse::builder)
                .logger(LOG, "updateOccMetricAlarm")
                .serviceDetails(
                        "OccMetricAlarm",
                        "UpdateOccMetricAlarm",
                        "https://docs.oracle.com/iaas/api/#/en/occds/20240430/OccMetricAlarm/UpdateOccMetricAlarm")
                .method(com.oracle.bmc.http.client.Method.PUT)
                .requestBuilder(UpdateOccMetricAlarmRequest::builder)
                .basePath("/20240430")
                .appendPathParam("occMetricAlarms")
                .appendPathParam(request.getOccMetricAlarmId())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.demandsignal.model.OccMetricAlarm.class,
                        UpdateOccMetricAlarmResponse.Builder::occMetricAlarm)
                .handleResponseHeaderString(
                        "opc-request-id", UpdateOccMetricAlarmResponse.Builder::opcRequestId)
                .handleResponseHeaderString("etag", UpdateOccMetricAlarmResponse.Builder::etag)
                .callAsync(handler);
    }

    /**
     * Create a new client instance.
     *
     * @param authenticationDetailsProvider The authentication details (see {@link Builder#build})
     * @deprecated Use the {@link #builder() builder} instead.
     */
    @Deprecated
    public OccMetricAlarmAsyncClient(
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
    public OccMetricAlarmAsyncClient(
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
    public OccMetricAlarmAsyncClient(
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
    public OccMetricAlarmAsyncClient(
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
    public OccMetricAlarmAsyncClient(
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
    public OccMetricAlarmAsyncClient(
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
    public OccMetricAlarmAsyncClient(
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
