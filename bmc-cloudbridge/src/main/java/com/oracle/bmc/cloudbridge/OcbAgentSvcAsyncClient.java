/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.cloudbridge;

import com.oracle.bmc.util.internal.Validate;
import com.oracle.bmc.cloudbridge.requests.*;
import com.oracle.bmc.cloudbridge.responses.*;

import java.util.Objects;

/**
 * Async client implementation for OcbAgentSvc service. <br>
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
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20220509")
public class OcbAgentSvcAsyncClient extends com.oracle.bmc.http.internal.BaseAsyncClient
        implements OcbAgentSvcAsync {
    /** Service instance for OcbAgentSvc. */
    public static final com.oracle.bmc.Service SERVICE =
            com.oracle.bmc.Services.serviceBuilder()
                    .serviceName(OcbAgentSvcClient.class.getName())
                    .serviceEndpointPrefix("")
                    .serviceEndpointTemplate("https://cloudbridge.{region}.oci.{secondLevelDomain}")
                    .build();

    private static final org.slf4j.Logger LOG =
            org.slf4j.LoggerFactory.getLogger(OcbAgentSvcAsyncClient.class);

    OcbAgentSvcAsyncClient(
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
            extends com.oracle.bmc.common.RegionalClientBuilder<Builder, OcbAgentSvcAsyncClient> {
        private Builder(com.oracle.bmc.Service service) {
            super(service);
            final String packageName = "cloudbridge";
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
        public OcbAgentSvcAsyncClient build(
                @jakarta.annotation.Nonnull
                        com.oracle.bmc.auth.AbstractAuthenticationDetailsProvider
                                authenticationDetailsProvider) {
            return new OcbAgentSvcAsyncClient(this, authenticationDetailsProvider);
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
    public java.util.concurrent.Future<AddAgentDependencyResponse> addAgentDependency(
            AddAgentDependencyRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            AddAgentDependencyRequest, AddAgentDependencyResponse>
                    handler) {

        Validate.notBlank(request.getEnvironmentId(), "environmentId must not be blank");
        Objects.requireNonNull(
                request.getAddAgentDependencyDetails(), "addAgentDependencyDetails is required");

        return clientCall(request, AddAgentDependencyResponse::builder)
                .logger(LOG, "addAgentDependency")
                .serviceDetails(
                        "OcbAgentSvc",
                        "AddAgentDependency",
                        "https://docs.oracle.com/iaas/api/#/en/OCB/20220509/Environment/AddAgentDependency")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(AddAgentDependencyRequest::builder)
                .basePath("/20220509")
                .appendPathParam("environments")
                .appendPathParam(request.getEnvironmentId())
                .appendPathParam("actions")
                .appendPathParam("addAgentDependency")
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.cloudbridge.model.Environment.class,
                        AddAgentDependencyResponse.Builder::environment)
                .handleResponseHeaderString("etag", AddAgentDependencyResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", AddAgentDependencyResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ChangeAgentCompartmentResponse> changeAgentCompartment(
            ChangeAgentCompartmentRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ChangeAgentCompartmentRequest, ChangeAgentCompartmentResponse>
                    handler) {

        Validate.notBlank(request.getAgentId(), "agentId must not be blank");
        Objects.requireNonNull(
                request.getChangeAgentCompartmentDetails(),
                "changeAgentCompartmentDetails is required");

        return clientCall(request, ChangeAgentCompartmentResponse::builder)
                .logger(LOG, "changeAgentCompartment")
                .serviceDetails(
                        "OcbAgentSvc",
                        "ChangeAgentCompartment",
                        "https://docs.oracle.com/iaas/api/#/en/OCB/20220509/Agent/ChangeAgentCompartment")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(ChangeAgentCompartmentRequest::builder)
                .basePath("/20220509")
                .appendPathParam("agents")
                .appendPathParam(request.getAgentId())
                .appendPathParam("actions")
                .appendPathParam("changeCompartment")
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .hasBody()
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        ChangeAgentCompartmentResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", ChangeAgentCompartmentResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ChangeAgentDependencyCompartmentResponse>
            changeAgentDependencyCompartment(
                    ChangeAgentDependencyCompartmentRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    ChangeAgentDependencyCompartmentRequest,
                                    ChangeAgentDependencyCompartmentResponse>
                            handler) {

        Validate.notBlank(request.getAgentDependencyId(), "agentDependencyId must not be blank");
        Objects.requireNonNull(
                request.getChangeAgentDependencyCompartmentDetails(),
                "changeAgentDependencyCompartmentDetails is required");

        return clientCall(request, ChangeAgentDependencyCompartmentResponse::builder)
                .logger(LOG, "changeAgentDependencyCompartment")
                .serviceDetails(
                        "OcbAgentSvc",
                        "ChangeAgentDependencyCompartment",
                        "https://docs.oracle.com/iaas/api/#/en/OCB/20220509/AgentDependency/ChangeAgentDependencyCompartment")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(ChangeAgentDependencyCompartmentRequest::builder)
                .basePath("/20220509")
                .appendPathParam("agentDependencies")
                .appendPathParam(request.getAgentDependencyId())
                .appendPathParam("actions")
                .appendPathParam("changeCompartment")
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .hasBody()
                .handleResponseHeaderString(
                        "opc-request-id",
                        ChangeAgentDependencyCompartmentResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ChangeEnvironmentCompartmentResponse>
            changeEnvironmentCompartment(
                    ChangeEnvironmentCompartmentRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    ChangeEnvironmentCompartmentRequest,
                                    ChangeEnvironmentCompartmentResponse>
                            handler) {

        Validate.notBlank(request.getEnvironmentId(), "environmentId must not be blank");
        Objects.requireNonNull(
                request.getChangeEnvironmentCompartmentDetails(),
                "changeEnvironmentCompartmentDetails is required");

        return clientCall(request, ChangeEnvironmentCompartmentResponse::builder)
                .logger(LOG, "changeEnvironmentCompartment")
                .serviceDetails(
                        "OcbAgentSvc",
                        "ChangeEnvironmentCompartment",
                        "https://docs.oracle.com/iaas/api/#/en/OCB/20220509/Environment/ChangeEnvironmentCompartment")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(ChangeEnvironmentCompartmentRequest::builder)
                .basePath("/20220509")
                .appendPathParam("environments")
                .appendPathParam(request.getEnvironmentId())
                .appendPathParam("actions")
                .appendPathParam("changeCompartment")
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .hasBody()
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        ChangeEnvironmentCompartmentResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id",
                        ChangeEnvironmentCompartmentResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<CreateAgentResponse> createAgent(
            CreateAgentRequest request,
            final com.oracle.bmc.responses.AsyncHandler<CreateAgentRequest, CreateAgentResponse>
                    handler) {
        Objects.requireNonNull(request.getCreateAgentDetails(), "createAgentDetails is required");

        return clientCall(request, CreateAgentResponse::builder)
                .logger(LOG, "createAgent")
                .serviceDetails(
                        "OcbAgentSvc",
                        "CreateAgent",
                        "https://docs.oracle.com/iaas/api/#/en/OCB/20220509/Agent/CreateAgent")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(CreateAgentRequest::builder)
                .basePath("/20220509")
                .appendPathParam("agents")
                .accept("application/json")
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.cloudbridge.model.Agent.class,
                        CreateAgentResponse.Builder::agent)
                .handleResponseHeaderString("etag", CreateAgentResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", CreateAgentResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<CreateAgentDependencyResponse> createAgentDependency(
            CreateAgentDependencyRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            CreateAgentDependencyRequest, CreateAgentDependencyResponse>
                    handler) {
        Objects.requireNonNull(
                request.getCreateAgentDependencyDetails(),
                "createAgentDependencyDetails is required");

        return clientCall(request, CreateAgentDependencyResponse::builder)
                .logger(LOG, "createAgentDependency")
                .serviceDetails(
                        "OcbAgentSvc",
                        "CreateAgentDependency",
                        "https://docs.oracle.com/iaas/api/#/en/OCB/20220509/AgentDependency/CreateAgentDependency")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(CreateAgentDependencyRequest::builder)
                .basePath("/20220509")
                .appendPathParam("agentDependencies")
                .accept("application/json")
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.cloudbridge.model.AgentDependency.class,
                        CreateAgentDependencyResponse.Builder::agentDependency)
                .handleResponseHeaderString("etag", CreateAgentDependencyResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", CreateAgentDependencyResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        CreateAgentDependencyResponse.Builder::opcWorkRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<CreateEnvironmentResponse> createEnvironment(
            CreateEnvironmentRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            CreateEnvironmentRequest, CreateEnvironmentResponse>
                    handler) {
        Objects.requireNonNull(
                request.getCreateEnvironmentDetails(), "createEnvironmentDetails is required");

        return clientCall(request, CreateEnvironmentResponse::builder)
                .logger(LOG, "createEnvironment")
                .serviceDetails(
                        "OcbAgentSvc",
                        "CreateEnvironment",
                        "https://docs.oracle.com/iaas/api/#/en/OCB/20220509/Environment/CreateEnvironment")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(CreateEnvironmentRequest::builder)
                .basePath("/20220509")
                .appendPathParam("environments")
                .accept("application/json")
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.cloudbridge.model.Environment.class,
                        CreateEnvironmentResponse.Builder::environment)
                .handleResponseHeaderString("etag", CreateEnvironmentResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", CreateEnvironmentResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<DeleteAgentResponse> deleteAgent(
            DeleteAgentRequest request,
            final com.oracle.bmc.responses.AsyncHandler<DeleteAgentRequest, DeleteAgentResponse>
                    handler) {

        Validate.notBlank(request.getAgentId(), "agentId must not be blank");

        return clientCall(request, DeleteAgentResponse::builder)
                .logger(LOG, "deleteAgent")
                .serviceDetails(
                        "OcbAgentSvc",
                        "DeleteAgent",
                        "https://docs.oracle.com/iaas/api/#/en/OCB/20220509/Agent/DeleteAgent")
                .method(com.oracle.bmc.http.client.Method.DELETE)
                .requestBuilder(DeleteAgentRequest::builder)
                .basePath("/20220509")
                .appendPathParam("agents")
                .appendPathParam(request.getAgentId())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .handleResponseHeaderString(
                        "opc-request-id", DeleteAgentResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<DeleteAgentDependencyResponse> deleteAgentDependency(
            DeleteAgentDependencyRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            DeleteAgentDependencyRequest, DeleteAgentDependencyResponse>
                    handler) {

        Validate.notBlank(request.getAgentDependencyId(), "agentDependencyId must not be blank");

        return clientCall(request, DeleteAgentDependencyResponse::builder)
                .logger(LOG, "deleteAgentDependency")
                .serviceDetails(
                        "OcbAgentSvc",
                        "DeleteAgentDependency",
                        "https://docs.oracle.com/iaas/api/#/en/OCB/20220509/AgentDependency/DeleteAgentDependency")
                .method(com.oracle.bmc.http.client.Method.DELETE)
                .requestBuilder(DeleteAgentDependencyRequest::builder)
                .basePath("/20220509")
                .appendPathParam("agentDependencies")
                .appendPathParam(request.getAgentDependencyId())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleResponseHeaderString(
                        "opc-request-id", DeleteAgentDependencyResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<DeleteEnvironmentResponse> deleteEnvironment(
            DeleteEnvironmentRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            DeleteEnvironmentRequest, DeleteEnvironmentResponse>
                    handler) {

        Validate.notBlank(request.getEnvironmentId(), "environmentId must not be blank");

        return clientCall(request, DeleteEnvironmentResponse::builder)
                .logger(LOG, "deleteEnvironment")
                .serviceDetails(
                        "OcbAgentSvc",
                        "DeleteEnvironment",
                        "https://docs.oracle.com/iaas/api/#/en/OCB/20220509/Environment/DeleteEnvironment")
                .method(com.oracle.bmc.http.client.Method.DELETE)
                .requestBuilder(DeleteEnvironmentRequest::builder)
                .basePath("/20220509")
                .appendPathParam("environments")
                .appendPathParam(request.getEnvironmentId())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleResponseHeaderString(
                        "opc-request-id", DeleteEnvironmentResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<GetAgentResponse> getAgent(
            GetAgentRequest request,
            final com.oracle.bmc.responses.AsyncHandler<GetAgentRequest, GetAgentResponse>
                    handler) {

        Validate.notBlank(request.getAgentId(), "agentId must not be blank");

        return clientCall(request, GetAgentResponse::builder)
                .logger(LOG, "getAgent")
                .serviceDetails(
                        "OcbAgentSvc",
                        "GetAgent",
                        "https://docs.oracle.com/iaas/api/#/en/OCB/20220509/Agent/GetAgent")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetAgentRequest::builder)
                .basePath("/20220509")
                .appendPathParam("agents")
                .appendPathParam(request.getAgentId())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.cloudbridge.model.Agent.class,
                        GetAgentResponse.Builder::agent)
                .handleResponseHeaderString("etag", GetAgentResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", GetAgentResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<GetAgentDependencyResponse> getAgentDependency(
            GetAgentDependencyRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            GetAgentDependencyRequest, GetAgentDependencyResponse>
                    handler) {

        Validate.notBlank(request.getAgentDependencyId(), "agentDependencyId must not be blank");

        return clientCall(request, GetAgentDependencyResponse::builder)
                .logger(LOG, "getAgentDependency")
                .serviceDetails(
                        "OcbAgentSvc",
                        "GetAgentDependency",
                        "https://docs.oracle.com/iaas/api/#/en/OCB/20220509/AgentDependency/GetAgentDependency")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetAgentDependencyRequest::builder)
                .basePath("/20220509")
                .appendPathParam("agentDependencies")
                .appendPathParam(request.getAgentDependencyId())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.cloudbridge.model.AgentDependency.class,
                        GetAgentDependencyResponse.Builder::agentDependency)
                .handleResponseHeaderString("etag", GetAgentDependencyResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", GetAgentDependencyResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<GetEnvironmentResponse> getEnvironment(
            GetEnvironmentRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            GetEnvironmentRequest, GetEnvironmentResponse>
                    handler) {

        Validate.notBlank(request.getEnvironmentId(), "environmentId must not be blank");

        return clientCall(request, GetEnvironmentResponse::builder)
                .logger(LOG, "getEnvironment")
                .serviceDetails(
                        "OcbAgentSvc",
                        "GetEnvironment",
                        "https://docs.oracle.com/iaas/api/#/en/OCB/20220509/Environment/GetEnvironment")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetEnvironmentRequest::builder)
                .basePath("/20220509")
                .appendPathParam("environments")
                .appendPathParam(request.getEnvironmentId())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.cloudbridge.model.Environment.class,
                        GetEnvironmentResponse.Builder::environment)
                .handleResponseHeaderString("etag", GetEnvironmentResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", GetEnvironmentResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<GetPluginResponse> getPlugin(
            GetPluginRequest request,
            final com.oracle.bmc.responses.AsyncHandler<GetPluginRequest, GetPluginResponse>
                    handler) {

        Validate.notBlank(request.getAgentId(), "agentId must not be blank");

        Validate.notBlank(request.getPluginName(), "pluginName must not be blank");

        return clientCall(request, GetPluginResponse::builder)
                .logger(LOG, "getPlugin")
                .serviceDetails(
                        "OcbAgentSvc",
                        "GetPlugin",
                        "https://docs.oracle.com/iaas/api/#/en/OCB/20220509/Plugin/GetPlugin")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetPluginRequest::builder)
                .basePath("/20220509")
                .appendPathParam("agents")
                .appendPathParam(request.getAgentId())
                .appendPathParam("plugins")
                .appendPathParam(request.getPluginName())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.cloudbridge.model.Plugin.class,
                        GetPluginResponse.Builder::plugin)
                .handleResponseHeaderString("etag", GetPluginResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", GetPluginResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ListAgentDependenciesResponse> listAgentDependencies(
            ListAgentDependenciesRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ListAgentDependenciesRequest, ListAgentDependenciesResponse>
                    handler) {
        Objects.requireNonNull(request.getCompartmentId(), "compartmentId is required");

        return clientCall(request, ListAgentDependenciesResponse::builder)
                .logger(LOG, "listAgentDependencies")
                .serviceDetails(
                        "OcbAgentSvc",
                        "ListAgentDependencies",
                        "https://docs.oracle.com/iaas/api/#/en/OCB/20220509/AgentDependencyCollection/ListAgentDependencies")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListAgentDependenciesRequest::builder)
                .basePath("/20220509")
                .appendPathParam("agentDependencies")
                .appendQueryParam("compartmentId", request.getCompartmentId())
                .appendQueryParam("agentId", request.getAgentId())
                .appendQueryParam("environmentId", request.getEnvironmentId())
                .appendEnumQueryParam("lifecycleState", request.getLifecycleState())
                .appendQueryParam("displayName", request.getDisplayName())
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.cloudbridge.model.AgentDependencyCollection.class,
                        ListAgentDependenciesResponse.Builder::agentDependencyCollection)
                .handleResponseHeaderString(
                        "opc-request-id", ListAgentDependenciesResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListAgentDependenciesResponse.Builder::opcNextPage)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ListAgentsResponse> listAgents(
            ListAgentsRequest request,
            final com.oracle.bmc.responses.AsyncHandler<ListAgentsRequest, ListAgentsResponse>
                    handler) {
        Objects.requireNonNull(request.getCompartmentId(), "compartmentId is required");

        return clientCall(request, ListAgentsResponse::builder)
                .logger(LOG, "listAgents")
                .serviceDetails(
                        "OcbAgentSvc",
                        "ListAgents",
                        "https://docs.oracle.com/iaas/api/#/en/OCB/20220509/AgentCollection/ListAgents")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListAgentsRequest::builder)
                .basePath("/20220509")
                .appendPathParam("agents")
                .appendQueryParam("compartmentId", request.getCompartmentId())
                .appendQueryParam("environmentId", request.getEnvironmentId())
                .appendEnumQueryParam("lifecycleState", request.getLifecycleState())
                .appendQueryParam("displayName", request.getDisplayName())
                .appendQueryParam("agentId", request.getAgentId())
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.cloudbridge.model.AgentCollection.class,
                        ListAgentsResponse.Builder::agentCollection)
                .handleResponseHeaderString(
                        "opc-request-id", ListAgentsResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListAgentsResponse.Builder::opcNextPage)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ListApplianceImagesResponse> listApplianceImages(
            ListApplianceImagesRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ListApplianceImagesRequest, ListApplianceImagesResponse>
                    handler) {
        Objects.requireNonNull(request.getCompartmentId(), "compartmentId is required");

        return clientCall(request, ListApplianceImagesResponse::builder)
                .logger(LOG, "listApplianceImages")
                .serviceDetails(
                        "OcbAgentSvc",
                        "ListApplianceImages",
                        "https://docs.oracle.com/iaas/api/#/en/OCB/20220509/ApplianceImageCollection/ListApplianceImages")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListApplianceImagesRequest::builder)
                .basePath("/20220509")
                .appendPathParam("applianceImages")
                .appendQueryParam("compartmentId", request.getCompartmentId())
                .appendQueryParam("displayName", request.getDisplayName())
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.cloudbridge.model.ApplianceImageCollection.class,
                        ListApplianceImagesResponse.Builder::applianceImageCollection)
                .handleResponseHeaderString(
                        "opc-request-id", ListApplianceImagesResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListApplianceImagesResponse.Builder::opcNextPage)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ListEnvironmentsResponse> listEnvironments(
            ListEnvironmentsRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ListEnvironmentsRequest, ListEnvironmentsResponse>
                    handler) {
        Objects.requireNonNull(request.getCompartmentId(), "compartmentId is required");

        return clientCall(request, ListEnvironmentsResponse::builder)
                .logger(LOG, "listEnvironments")
                .serviceDetails(
                        "OcbAgentSvc",
                        "ListEnvironments",
                        "https://docs.oracle.com/iaas/api/#/en/OCB/20220509/EnvironmentCollection/ListEnvironments")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListEnvironmentsRequest::builder)
                .basePath("/20220509")
                .appendPathParam("environments")
                .appendQueryParam("compartmentId", request.getCompartmentId())
                .appendEnumQueryParam("lifecycleState", request.getLifecycleState())
                .appendQueryParam("displayName", request.getDisplayName())
                .appendQueryParam("environmentId", request.getEnvironmentId())
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.cloudbridge.model.EnvironmentCollection.class,
                        ListEnvironmentsResponse.Builder::environmentCollection)
                .handleResponseHeaderString(
                        "opc-request-id", ListEnvironmentsResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListEnvironmentsResponse.Builder::opcNextPage)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<RemoveAgentDependencyResponse> removeAgentDependency(
            RemoveAgentDependencyRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            RemoveAgentDependencyRequest, RemoveAgentDependencyResponse>
                    handler) {

        Validate.notBlank(request.getEnvironmentId(), "environmentId must not be blank");
        Objects.requireNonNull(
                request.getRemoveAgentDependencyDetails(),
                "removeAgentDependencyDetails is required");

        return clientCall(request, RemoveAgentDependencyResponse::builder)
                .logger(LOG, "removeAgentDependency")
                .serviceDetails(
                        "OcbAgentSvc",
                        "RemoveAgentDependency",
                        "https://docs.oracle.com/iaas/api/#/en/OCB/20220509/Environment/RemoveAgentDependency")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(RemoveAgentDependencyRequest::builder)
                .basePath("/20220509")
                .appendPathParam("environments")
                .appendPathParam(request.getEnvironmentId())
                .appendPathParam("actions")
                .appendPathParam("removeAgentDependency")
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.cloudbridge.model.Environment.class,
                        RemoveAgentDependencyResponse.Builder::environment)
                .handleResponseHeaderString("etag", RemoveAgentDependencyResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", RemoveAgentDependencyResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<UpdateAgentResponse> updateAgent(
            UpdateAgentRequest request,
            final com.oracle.bmc.responses.AsyncHandler<UpdateAgentRequest, UpdateAgentResponse>
                    handler) {

        Validate.notBlank(request.getAgentId(), "agentId must not be blank");
        Objects.requireNonNull(request.getUpdateAgentDetails(), "updateAgentDetails is required");

        return clientCall(request, UpdateAgentResponse::builder)
                .logger(LOG, "updateAgent")
                .serviceDetails(
                        "OcbAgentSvc",
                        "UpdateAgent",
                        "https://docs.oracle.com/iaas/api/#/en/OCB/20220509/Agent/UpdateAgent")
                .method(com.oracle.bmc.http.client.Method.PUT)
                .requestBuilder(UpdateAgentRequest::builder)
                .basePath("/20220509")
                .appendPathParam("agents")
                .appendPathParam(request.getAgentId())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.cloudbridge.model.Agent.class,
                        UpdateAgentResponse.Builder::agent)
                .handleResponseHeaderString("etag", UpdateAgentResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", UpdateAgentResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<UpdateAgentDependencyResponse> updateAgentDependency(
            UpdateAgentDependencyRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            UpdateAgentDependencyRequest, UpdateAgentDependencyResponse>
                    handler) {

        Validate.notBlank(request.getAgentDependencyId(), "agentDependencyId must not be blank");
        Objects.requireNonNull(
                request.getUpdateAgentDependencyDetails(),
                "updateAgentDependencyDetails is required");

        return clientCall(request, UpdateAgentDependencyResponse::builder)
                .logger(LOG, "updateAgentDependency")
                .serviceDetails(
                        "OcbAgentSvc",
                        "UpdateAgentDependency",
                        "https://docs.oracle.com/iaas/api/#/en/OCB/20220509/AgentDependency/UpdateAgentDependency")
                .method(com.oracle.bmc.http.client.Method.PUT)
                .requestBuilder(UpdateAgentDependencyRequest::builder)
                .basePath("/20220509")
                .appendPathParam("agentDependencies")
                .appendPathParam(request.getAgentDependencyId())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .hasBody()
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        UpdateAgentDependencyResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", UpdateAgentDependencyResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<UpdateEnvironmentResponse> updateEnvironment(
            UpdateEnvironmentRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            UpdateEnvironmentRequest, UpdateEnvironmentResponse>
                    handler) {

        Validate.notBlank(request.getEnvironmentId(), "environmentId must not be blank");
        Objects.requireNonNull(
                request.getUpdateEnvironmentDetails(), "updateEnvironmentDetails is required");

        return clientCall(request, UpdateEnvironmentResponse::builder)
                .logger(LOG, "updateEnvironment")
                .serviceDetails(
                        "OcbAgentSvc",
                        "UpdateEnvironment",
                        "https://docs.oracle.com/iaas/api/#/en/OCB/20220509/Environment/UpdateEnvironment")
                .method(com.oracle.bmc.http.client.Method.PUT)
                .requestBuilder(UpdateEnvironmentRequest::builder)
                .basePath("/20220509")
                .appendPathParam("environments")
                .appendPathParam(request.getEnvironmentId())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.cloudbridge.model.Environment.class,
                        UpdateEnvironmentResponse.Builder::environment)
                .handleResponseHeaderString("etag", UpdateEnvironmentResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", UpdateEnvironmentResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<UpdatePluginResponse> updatePlugin(
            UpdatePluginRequest request,
            final com.oracle.bmc.responses.AsyncHandler<UpdatePluginRequest, UpdatePluginResponse>
                    handler) {

        Validate.notBlank(request.getAgentId(), "agentId must not be blank");

        Validate.notBlank(request.getPluginName(), "pluginName must not be blank");
        Objects.requireNonNull(request.getUpdatePluginDetails(), "updatePluginDetails is required");

        return clientCall(request, UpdatePluginResponse::builder)
                .logger(LOG, "updatePlugin")
                .serviceDetails(
                        "OcbAgentSvc",
                        "UpdatePlugin",
                        "https://docs.oracle.com/iaas/api/#/en/OCB/20220509/Plugin/UpdatePlugin")
                .method(com.oracle.bmc.http.client.Method.PUT)
                .requestBuilder(UpdatePluginRequest::builder)
                .basePath("/20220509")
                .appendPathParam("agents")
                .appendPathParam(request.getAgentId())
                .appendPathParam("plugins")
                .appendPathParam(request.getPluginName())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .hasBody()
                .handleResponseHeaderString(
                        "opc-request-id", UpdatePluginResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-work-request-id", UpdatePluginResponse.Builder::opcWorkRequestId)
                .callAsync(handler);
    }

    /**
     * Create a new client instance.
     *
     * @param authenticationDetailsProvider The authentication details (see {@link Builder#build})
     * @deprecated Use the {@link #builder() builder} instead.
     */
    @Deprecated
    public OcbAgentSvcAsyncClient(
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
    public OcbAgentSvcAsyncClient(
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
    public OcbAgentSvcAsyncClient(
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
    public OcbAgentSvcAsyncClient(
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
    public OcbAgentSvcAsyncClient(
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
    public OcbAgentSvcAsyncClient(
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
    public OcbAgentSvcAsyncClient(
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
