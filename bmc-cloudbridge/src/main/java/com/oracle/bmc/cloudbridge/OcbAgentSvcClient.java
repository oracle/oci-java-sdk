/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.cloudbridge;

import com.oracle.bmc.util.internal.Validate;
import com.oracle.bmc.cloudbridge.requests.*;
import com.oracle.bmc.cloudbridge.responses.*;
import com.oracle.bmc.circuitbreaker.CircuitBreakerConfiguration;
import com.oracle.bmc.util.CircuitBreakerUtils;

import java.util.Objects;

@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20220509")
public class OcbAgentSvcClient extends com.oracle.bmc.http.internal.BaseSyncClient
        implements OcbAgentSvc {
    /** Service instance for OcbAgentSvc. */
    public static final com.oracle.bmc.Service SERVICE =
            com.oracle.bmc.Services.serviceBuilder()
                    .serviceName("OCBAGENTSVC")
                    .serviceEndpointPrefix("")
                    .serviceEndpointTemplate("https://cloudbridge.{region}.oci.{secondLevelDomain}")
                    .build();

    private static final org.slf4j.Logger LOG =
            org.slf4j.LoggerFactory.getLogger(OcbAgentSvcClient.class);

    private final OcbAgentSvcWaiters waiters;

    private final OcbAgentSvcPaginators paginators;

    OcbAgentSvcClient(
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
                                    .nameFormat("OcbAgentSvc-waiters-%d")
                                    .build());
            threadPoolExecutor.allowCoreThreadTimeOut(true);

            executorService = threadPoolExecutor;
        }
        this.waiters = new OcbAgentSvcWaiters(executorService, this);

        this.paginators = new OcbAgentSvcPaginators(this);
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
            extends com.oracle.bmc.common.RegionalClientBuilder<Builder, OcbAgentSvcClient> {
        private java.util.concurrent.ExecutorService executorService;

        private Builder(com.oracle.bmc.Service service) {
            super(service);
            final String packageName = "cloudbridge";
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
        public OcbAgentSvcClient build(
                @jakarta.annotation.Nonnull
                        com.oracle.bmc.auth.AbstractAuthenticationDetailsProvider
                                authenticationDetailsProvider) {
            return new OcbAgentSvcClient(this, authenticationDetailsProvider, executorService);
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
    public AddAgentDependencyResponse addAgentDependency(AddAgentDependencyRequest request) {

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
                .operationUsesDefaultRetries()
                .hasBody()
                .handleBody(
                        com.oracle.bmc.cloudbridge.model.Environment.class,
                        AddAgentDependencyResponse.Builder::environment)
                .handleResponseHeaderString("etag", AddAgentDependencyResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", AddAgentDependencyResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public ChangeAgentCompartmentResponse changeAgentCompartment(
            ChangeAgentCompartmentRequest request) {

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
                .operationUsesDefaultRetries()
                .hasBody()
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        ChangeAgentCompartmentResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", ChangeAgentCompartmentResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public ChangeAgentDependencyCompartmentResponse changeAgentDependencyCompartment(
            ChangeAgentDependencyCompartmentRequest request) {

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
                .operationUsesDefaultRetries()
                .hasBody()
                .handleResponseHeaderString(
                        "opc-request-id",
                        ChangeAgentDependencyCompartmentResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public ChangeEnvironmentCompartmentResponse changeEnvironmentCompartment(
            ChangeEnvironmentCompartmentRequest request) {

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
                .operationUsesDefaultRetries()
                .hasBody()
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        ChangeEnvironmentCompartmentResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id",
                        ChangeEnvironmentCompartmentResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public CreateAgentResponse createAgent(CreateAgentRequest request) {
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
                .operationUsesDefaultRetries()
                .hasBody()
                .handleBody(
                        com.oracle.bmc.cloudbridge.model.Agent.class,
                        CreateAgentResponse.Builder::agent)
                .handleResponseHeaderString("etag", CreateAgentResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", CreateAgentResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public CreateAgentDependencyResponse createAgentDependency(
            CreateAgentDependencyRequest request) {
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
                .operationUsesDefaultRetries()
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
                .callSync();
    }

    @Override
    public CreateEnvironmentResponse createEnvironment(CreateEnvironmentRequest request) {
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
                .operationUsesDefaultRetries()
                .hasBody()
                .handleBody(
                        com.oracle.bmc.cloudbridge.model.Environment.class,
                        CreateEnvironmentResponse.Builder::environment)
                .handleResponseHeaderString("etag", CreateEnvironmentResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", CreateEnvironmentResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public DeleteAgentResponse deleteAgent(DeleteAgentRequest request) {

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
                .operationUsesDefaultRetries()
                .handleResponseHeaderString(
                        "opc-request-id", DeleteAgentResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public DeleteAgentDependencyResponse deleteAgentDependency(
            DeleteAgentDependencyRequest request) {

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
                .operationUsesDefaultRetries()
                .handleResponseHeaderString(
                        "opc-request-id", DeleteAgentDependencyResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public DeleteEnvironmentResponse deleteEnvironment(DeleteEnvironmentRequest request) {

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
                .operationUsesDefaultRetries()
                .handleResponseHeaderString(
                        "opc-request-id", DeleteEnvironmentResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public GetAgentResponse getAgent(GetAgentRequest request) {

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
                .operationUsesDefaultRetries()
                .handleBody(
                        com.oracle.bmc.cloudbridge.model.Agent.class,
                        GetAgentResponse.Builder::agent)
                .handleResponseHeaderString("etag", GetAgentResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", GetAgentResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public GetAgentDependencyResponse getAgentDependency(GetAgentDependencyRequest request) {

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
                .operationUsesDefaultRetries()
                .handleBody(
                        com.oracle.bmc.cloudbridge.model.AgentDependency.class,
                        GetAgentDependencyResponse.Builder::agentDependency)
                .handleResponseHeaderString("etag", GetAgentDependencyResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", GetAgentDependencyResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public GetEnvironmentResponse getEnvironment(GetEnvironmentRequest request) {

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
                .operationUsesDefaultRetries()
                .handleBody(
                        com.oracle.bmc.cloudbridge.model.Environment.class,
                        GetEnvironmentResponse.Builder::environment)
                .handleResponseHeaderString("etag", GetEnvironmentResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", GetEnvironmentResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public GetPluginResponse getPlugin(GetPluginRequest request) {

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
                .operationUsesDefaultRetries()
                .handleBody(
                        com.oracle.bmc.cloudbridge.model.Plugin.class,
                        GetPluginResponse.Builder::plugin)
                .handleResponseHeaderString("etag", GetPluginResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", GetPluginResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public ListAgentDependenciesResponse listAgentDependencies(
            ListAgentDependenciesRequest request) {
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
                .operationUsesDefaultRetries()
                .handleBody(
                        com.oracle.bmc.cloudbridge.model.AgentDependencyCollection.class,
                        ListAgentDependenciesResponse.Builder::agentDependencyCollection)
                .handleResponseHeaderString(
                        "opc-request-id", ListAgentDependenciesResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListAgentDependenciesResponse.Builder::opcNextPage)
                .callSync();
    }

    @Override
    public ListAgentsResponse listAgents(ListAgentsRequest request) {
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
                .operationUsesDefaultRetries()
                .handleBody(
                        com.oracle.bmc.cloudbridge.model.AgentCollection.class,
                        ListAgentsResponse.Builder::agentCollection)
                .handleResponseHeaderString(
                        "opc-request-id", ListAgentsResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListAgentsResponse.Builder::opcNextPage)
                .callSync();
    }

    @Override
    public ListApplianceImagesResponse listApplianceImages(ListApplianceImagesRequest request) {
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
                .operationUsesDefaultRetries()
                .handleBody(
                        com.oracle.bmc.cloudbridge.model.ApplianceImageCollection.class,
                        ListApplianceImagesResponse.Builder::applianceImageCollection)
                .handleResponseHeaderString(
                        "opc-request-id", ListApplianceImagesResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListApplianceImagesResponse.Builder::opcNextPage)
                .callSync();
    }

    @Override
    public ListEnvironmentsResponse listEnvironments(ListEnvironmentsRequest request) {
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
                .operationUsesDefaultRetries()
                .handleBody(
                        com.oracle.bmc.cloudbridge.model.EnvironmentCollection.class,
                        ListEnvironmentsResponse.Builder::environmentCollection)
                .handleResponseHeaderString(
                        "opc-request-id", ListEnvironmentsResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListEnvironmentsResponse.Builder::opcNextPage)
                .callSync();
    }

    @Override
    public RemoveAgentDependencyResponse removeAgentDependency(
            RemoveAgentDependencyRequest request) {

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
                .operationUsesDefaultRetries()
                .hasBody()
                .handleBody(
                        com.oracle.bmc.cloudbridge.model.Environment.class,
                        RemoveAgentDependencyResponse.Builder::environment)
                .handleResponseHeaderString("etag", RemoveAgentDependencyResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", RemoveAgentDependencyResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public UpdateAgentResponse updateAgent(UpdateAgentRequest request) {

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
                .operationUsesDefaultRetries()
                .hasBody()
                .handleBody(
                        com.oracle.bmc.cloudbridge.model.Agent.class,
                        UpdateAgentResponse.Builder::agent)
                .handleResponseHeaderString("etag", UpdateAgentResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", UpdateAgentResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public UpdateAgentDependencyResponse updateAgentDependency(
            UpdateAgentDependencyRequest request) {

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
                .operationUsesDefaultRetries()
                .hasBody()
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        UpdateAgentDependencyResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", UpdateAgentDependencyResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public UpdateEnvironmentResponse updateEnvironment(UpdateEnvironmentRequest request) {

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
                .operationUsesDefaultRetries()
                .hasBody()
                .handleBody(
                        com.oracle.bmc.cloudbridge.model.Environment.class,
                        UpdateEnvironmentResponse.Builder::environment)
                .handleResponseHeaderString("etag", UpdateEnvironmentResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", UpdateEnvironmentResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public UpdatePluginResponse updatePlugin(UpdatePluginRequest request) {

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
                .operationUsesDefaultRetries()
                .hasBody()
                .handleResponseHeaderString(
                        "opc-request-id", UpdatePluginResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-work-request-id", UpdatePluginResponse.Builder::opcWorkRequestId)
                .callSync();
    }

    @Override
    public OcbAgentSvcWaiters getWaiters() {
        return waiters;
    }

    @Override
    public OcbAgentSvcPaginators getPaginators() {
        return paginators;
    }

    /**
     * Create a new client instance.
     *
     * @param authenticationDetailsProvider The authentication details (see {@link Builder#build})
     * @deprecated Use the {@link #builder() builder} instead.
     */
    @Deprecated
    public OcbAgentSvcClient(
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
    public OcbAgentSvcClient(
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
    public OcbAgentSvcClient(
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
    public OcbAgentSvcClient(
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
    public OcbAgentSvcClient(
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
    public OcbAgentSvcClient(
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
    public OcbAgentSvcClient(
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
    public OcbAgentSvcClient(
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
