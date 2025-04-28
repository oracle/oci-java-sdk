/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.cims;

import com.oracle.bmc.util.internal.Validate;
import com.oracle.bmc.cims.requests.*;
import com.oracle.bmc.cims.responses.*;

import java.util.Objects;

/**
 * Async client implementation for Incident service. <br>
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
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20181231")
public class IncidentAsyncClient extends com.oracle.bmc.http.internal.BaseAsyncClient
        implements IncidentAsync {
    /** Service instance for Incident. */
    public static final com.oracle.bmc.Service SERVICE =
            com.oracle.bmc.Services.serviceBuilder()
                    .serviceName("INCIDENT")
                    .serviceEndpointPrefix("")
                    .serviceEndpointTemplate(
                            "https://incidentmanagement.{region}.oci.{secondLevelDomain}")
                    .build();

    private static final org.slf4j.Logger LOG =
            org.slf4j.LoggerFactory.getLogger(IncidentAsyncClient.class);

    IncidentAsyncClient(
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
            extends com.oracle.bmc.common.RegionalClientBuilder<Builder, IncidentAsyncClient> {
        private Builder(com.oracle.bmc.Service service) {
            super(service);
            final String packageName = "cims";
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
        public IncidentAsyncClient build(
                @jakarta.annotation.Nonnull
                        com.oracle.bmc.auth.AbstractAuthenticationDetailsProvider
                                authenticationDetailsProvider) {
            return new IncidentAsyncClient(this, authenticationDetailsProvider);
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
    public java.util.concurrent.Future<CreateIncidentResponse> createIncident(
            CreateIncidentRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            CreateIncidentRequest, CreateIncidentResponse>
                    handler) {
        Objects.requireNonNull(
                request.getCreateIncidentDetails(), "createIncidentDetails is required");

        return clientCall(request, CreateIncidentResponse::builder)
                .logger(LOG, "createIncident")
                .serviceDetails(
                        "Incident",
                        "CreateIncident",
                        "https://docs.oracle.com/iaas/api/#/en/incidentmanagement/20181231/Incident/CreateIncident")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(CreateIncidentRequest::builder)
                .basePath("/20181231")
                .appendPathParam("v2")
                .appendPathParam("incidents")
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("ocid", request.getOcid())
                .appendHeader("homeregion", request.getHomeregion())
                .appendHeader("bearertokentype", request.getBearertokentype())
                .appendHeader("bearertoken", request.getBearertoken())
                .appendHeader("idtoken", request.getIdtoken())
                .appendHeader("domainid", request.getDomainid())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.cims.model.Incident.class,
                        CreateIncidentResponse.Builder::incident)
                .handleResponseHeaderString(
                        "opc-request-id", CreateIncidentResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<GetIncidentResponse> getIncident(
            GetIncidentRequest request,
            final com.oracle.bmc.responses.AsyncHandler<GetIncidentRequest, GetIncidentResponse>
                    handler) {

        Validate.notBlank(request.getIncidentKey(), "incidentKey must not be blank");
        Objects.requireNonNull(request.getCompartmentId(), "compartmentId is required");

        return clientCall(request, GetIncidentResponse::builder)
                .logger(LOG, "getIncident")
                .serviceDetails(
                        "Incident",
                        "GetIncident",
                        "https://docs.oracle.com/iaas/api/#/en/incidentmanagement/20181231/Incident/GetIncident")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetIncidentRequest::builder)
                .basePath("/20181231")
                .appendPathParam("v2")
                .appendPathParam("incidents")
                .appendPathParam(request.getIncidentKey())
                .appendQueryParam("compartmentId", request.getCompartmentId())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("csi", request.getCsi())
                .appendHeader("ocid", request.getOcid())
                .appendHeader("homeregion", request.getHomeregion())
                .appendHeader("problemtype", request.getProblemtype())
                .appendHeader("bearertokentype", request.getBearertokentype())
                .appendHeader("bearertoken", request.getBearertoken())
                .appendHeader("idtoken", request.getIdtoken())
                .appendHeader("domainid", request.getDomainid())
                .handleBody(
                        com.oracle.bmc.cims.model.Incident.class,
                        GetIncidentResponse.Builder::incident)
                .handleResponseHeaderString(
                        "opc-request-id", GetIncidentResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ListIncidentResourceTypesResponse> listIncidentResourceTypes(
            ListIncidentResourceTypesRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ListIncidentResourceTypesRequest, ListIncidentResourceTypesResponse>
                    handler) {
        Objects.requireNonNull(request.getProblemType(), "problemType is required");

        Objects.requireNonNull(request.getCompartmentId(), "compartmentId is required");

        return clientCall(request, ListIncidentResourceTypesResponse::builder)
                .logger(LOG, "listIncidentResourceTypes")
                .serviceDetails(
                        "Incident",
                        "ListIncidentResourceTypes",
                        "https://docs.oracle.com/iaas/api/#/en/incidentmanagement/20181231/IncidentResourceType/ListIncidentResourceTypes")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListIncidentResourceTypesRequest::builder)
                .basePath("/20181231")
                .appendPathParam("v2")
                .appendPathParam("incidents")
                .appendPathParam("incidentResourceTypes")
                .appendQueryParam("problemType", request.getProblemType())
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .appendQueryParam("compartmentId", request.getCompartmentId())
                .appendQueryParam("name", request.getName())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("csi", request.getCsi())
                .appendHeader("ocid", request.getOcid())
                .appendHeader("homeregion", request.getHomeregion())
                .appendHeader("domainid", request.getDomainid())
                .handleBodyList(
                        com.oracle.bmc.cims.model.IncidentResourceType.class,
                        ListIncidentResourceTypesResponse.Builder::items)
                .handleResponseHeaderString(
                        "opc-request-id", ListIncidentResourceTypesResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListIncidentResourceTypesResponse.Builder::opcNextPage)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ListIncidentsResponse> listIncidents(
            ListIncidentsRequest request,
            final com.oracle.bmc.responses.AsyncHandler<ListIncidentsRequest, ListIncidentsResponse>
                    handler) {
        Objects.requireNonNull(request.getCompartmentId(), "compartmentId is required");

        return clientCall(request, ListIncidentsResponse::builder)
                .logger(LOG, "listIncidents")
                .serviceDetails(
                        "Incident",
                        "ListIncidents",
                        "https://docs.oracle.com/iaas/api/#/en/incidentmanagement/20181231/IncidentSummary/ListIncidents")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListIncidentsRequest::builder)
                .basePath("/20181231")
                .appendPathParam("v2")
                .appendPathParam("incidents")
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("compartmentId", request.getCompartmentId())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .appendEnumQueryParam("lifecycleState", request.getLifecycleState())
                .appendQueryParam("page", request.getPage())
                .appendQueryParam("problemType", request.getProblemType())
                .accept("application/json")
                .appendHeader("csi", request.getCsi())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("ocid", request.getOcid())
                .appendHeader("homeregion", request.getHomeregion())
                .appendHeader("bearertokentype", request.getBearertokentype())
                .appendHeader("bearertoken", request.getBearertoken())
                .appendHeader("idtoken", request.getIdtoken())
                .appendHeader("domainid", request.getDomainid())
                .handleBodyList(
                        com.oracle.bmc.cims.model.IncidentSummary.class,
                        ListIncidentsResponse.Builder::items)
                .handleResponseHeaderString(
                        "opc-request-id", ListIncidentsResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListIncidentsResponse.Builder::opcNextPage)
                .handleResponseHeaderString(
                        "opc-prev-page", ListIncidentsResponse.Builder::opcPrevPage)
                .handleResponseHeaderString("as-of-time", ListIncidentsResponse.Builder::asOfTime)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<UpdateIncidentResponse> updateIncident(
            UpdateIncidentRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            UpdateIncidentRequest, UpdateIncidentResponse>
                    handler) {

        Validate.notBlank(request.getIncidentKey(), "incidentKey must not be blank");
        Objects.requireNonNull(
                request.getUpdateIncidentDetails(), "updateIncidentDetails is required");

        Objects.requireNonNull(request.getCompartmentId(), "compartmentId is required");

        return clientCall(request, UpdateIncidentResponse::builder)
                .logger(LOG, "updateIncident")
                .serviceDetails(
                        "Incident",
                        "UpdateIncident",
                        "https://docs.oracle.com/iaas/api/#/en/incidentmanagement/20181231/UpdateIncident/UpdateIncident")
                .method(com.oracle.bmc.http.client.Method.PUT)
                .requestBuilder(UpdateIncidentRequest::builder)
                .basePath("/20181231")
                .appendPathParam("v2")
                .appendPathParam("incidents")
                .appendPathParam(request.getIncidentKey())
                .appendQueryParam("compartmentId", request.getCompartmentId())
                .accept("application/json")
                .appendHeader("csi", request.getCsi())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("ocid", request.getOcid())
                .appendHeader("homeregion", request.getHomeregion())
                .appendHeader("bearertokentype", request.getBearertokentype())
                .appendHeader("bearertoken", request.getBearertoken())
                .appendHeader("idtoken", request.getIdtoken())
                .appendHeader("domainid", request.getDomainid())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.cims.model.Incident.class,
                        UpdateIncidentResponse.Builder::incident)
                .handleResponseHeaderString(
                        "opc-request-id", UpdateIncidentResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ValidateUserResponse> validateUser(
            ValidateUserRequest request,
            final com.oracle.bmc.responses.AsyncHandler<ValidateUserRequest, ValidateUserResponse>
                    handler) {

        return clientCall(request, ValidateUserResponse::builder)
                .logger(LOG, "validateUser")
                .serviceDetails(
                        "Incident",
                        "ValidateUser",
                        "https://docs.oracle.com/iaas/api/#/en/incidentmanagement/20181231/ValidationResponse/ValidateUser")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ValidateUserRequest::builder)
                .basePath("/20181231")
                .appendPathParam("v2")
                .appendPathParam("incidents")
                .appendPathParam("user")
                .appendPathParam("validate")
                .appendEnumQueryParam("problemType", request.getProblemType())
                .accept("application/json")
                .appendHeader("csi", request.getCsi())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("ocid", request.getOcid())
                .appendHeader("homeregion", request.getHomeregion())
                .appendHeader("bearertokentype", request.getBearertokentype())
                .appendHeader("bearertoken", request.getBearertoken())
                .appendHeader("idtoken", request.getIdtoken())
                .appendHeader("domainid", request.getDomainid())
                .handleBody(
                        com.oracle.bmc.cims.model.ValidationResponse.class,
                        ValidateUserResponse.Builder::validationResponse)
                .handleResponseHeaderString(
                        "opc-request-id", ValidateUserResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    /**
     * Create a new client instance.
     *
     * @param authenticationDetailsProvider The authentication details (see {@link Builder#build})
     * @deprecated Use the {@link #builder() builder} instead.
     */
    @Deprecated
    public IncidentAsyncClient(
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
    public IncidentAsyncClient(
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
    public IncidentAsyncClient(
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
    public IncidentAsyncClient(
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
    public IncidentAsyncClient(
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
    public IncidentAsyncClient(
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
    public IncidentAsyncClient(
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
