/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.managementagent;

import com.oracle.bmc.util.internal.Validate;
import com.oracle.bmc.managementagent.requests.*;
import com.oracle.bmc.managementagent.responses.*;
import com.oracle.bmc.circuitbreaker.CircuitBreakerConfiguration;
import com.oracle.bmc.util.CircuitBreakerUtils;

import java.util.Objects;

@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200202")
public class ManagementAgentClient extends com.oracle.bmc.http.internal.BaseSyncClient
        implements ManagementAgent {
    /** Service instance for ManagementAgent. */
    public static final com.oracle.bmc.Service SERVICE =
            com.oracle.bmc.Services.serviceBuilder()
                    .serviceName("MANAGEMENTAGENT")
                    .serviceEndpointPrefix("")
                    .serviceEndpointTemplate(
                            "https://management-agent.{region}.oci.{secondLevelDomain}")
                    .build();

    private static final org.slf4j.Logger LOG =
            org.slf4j.LoggerFactory.getLogger(ManagementAgentClient.class);

    private final ManagementAgentWaiters waiters;

    private final ManagementAgentPaginators paginators;

    ManagementAgentClient(
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
                                    .nameFormat("ManagementAgent-waiters-%d")
                                    .build());
            threadPoolExecutor.allowCoreThreadTimeOut(true);

            executorService = threadPoolExecutor;
        }
        this.waiters = new ManagementAgentWaiters(executorService, this);

        this.paginators = new ManagementAgentPaginators(this);
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
            extends com.oracle.bmc.common.RegionalClientBuilder<Builder, ManagementAgentClient> {
        private java.util.concurrent.ExecutorService executorService;

        private Builder(com.oracle.bmc.Service service) {
            super(service);
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
        public ManagementAgentClient build(
                @jakarta.annotation.Nonnull
                        com.oracle.bmc.auth.AbstractAuthenticationDetailsProvider
                                authenticationDetailsProvider) {
            return new ManagementAgentClient(this, authenticationDetailsProvider, executorService);
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
    public CreateManagementAgentInstallKeyResponse createManagementAgentInstallKey(
            CreateManagementAgentInstallKeyRequest request) {
        Objects.requireNonNull(
                request.getCreateManagementAgentInstallKeyDetails(),
                "createManagementAgentInstallKeyDetails is required");

        return clientCall(request, CreateManagementAgentInstallKeyResponse::builder)
                .logger(LOG, "createManagementAgentInstallKey")
                .serviceDetails(
                        "ManagementAgent",
                        "CreateManagementAgentInstallKey",
                        "https://docs.oracle.com/iaas/api/#/en/management-agent/20200202/ManagementAgentInstallKey/CreateManagementAgentInstallKey")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(CreateManagementAgentInstallKeyRequest::builder)
                .basePath("/20200202")
                .appendPathParam("managementAgentInstallKeys")
                .accept("application/json")
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.managementagent.model.ManagementAgentInstallKey.class,
                        CreateManagementAgentInstallKeyResponse.Builder::managementAgentInstallKey)
                .handleResponseHeaderString(
                        "opc-request-id",
                        CreateManagementAgentInstallKeyResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "etag", CreateManagementAgentInstallKeyResponse.Builder::etag)
                .callSync();
    }

    @Override
    public DeleteManagementAgentResponse deleteManagementAgent(
            DeleteManagementAgentRequest request) {

        Validate.notBlank(request.getManagementAgentId(), "managementAgentId must not be blank");

        return clientCall(request, DeleteManagementAgentResponse::builder)
                .logger(LOG, "deleteManagementAgent")
                .serviceDetails(
                        "ManagementAgent",
                        "DeleteManagementAgent",
                        "https://docs.oracle.com/iaas/api/#/en/management-agent/20200202/ManagementAgent/DeleteManagementAgent")
                .method(com.oracle.bmc.http.client.Method.DELETE)
                .requestBuilder(DeleteManagementAgentRequest::builder)
                .basePath("/20200202")
                .appendPathParam("managementAgents")
                .appendPathParam(request.getManagementAgentId())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleResponseHeaderString(
                        "opc-request-id", DeleteManagementAgentResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public DeleteManagementAgentInstallKeyResponse deleteManagementAgentInstallKey(
            DeleteManagementAgentInstallKeyRequest request) {

        Validate.notBlank(
                request.getManagementAgentInstallKeyId(),
                "managementAgentInstallKeyId must not be blank");

        return clientCall(request, DeleteManagementAgentInstallKeyResponse::builder)
                .logger(LOG, "deleteManagementAgentInstallKey")
                .serviceDetails(
                        "ManagementAgent",
                        "DeleteManagementAgentInstallKey",
                        "https://docs.oracle.com/iaas/api/#/en/management-agent/20200202/ManagementAgentInstallKey/DeleteManagementAgentInstallKey")
                .method(com.oracle.bmc.http.client.Method.DELETE)
                .requestBuilder(DeleteManagementAgentInstallKeyRequest::builder)
                .basePath("/20200202")
                .appendPathParam("managementAgentInstallKeys")
                .appendPathParam(request.getManagementAgentInstallKeyId())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleResponseHeaderString(
                        "opc-request-id",
                        DeleteManagementAgentInstallKeyResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public DeleteWorkRequestResponse deleteWorkRequest(DeleteWorkRequestRequest request) {

        Validate.notBlank(request.getWorkRequestId(), "workRequestId must not be blank");

        return clientCall(request, DeleteWorkRequestResponse::builder)
                .logger(LOG, "deleteWorkRequest")
                .serviceDetails(
                        "ManagementAgent",
                        "DeleteWorkRequest",
                        "https://docs.oracle.com/iaas/api/#/en/management-agent/20200202/WorkRequest/DeleteWorkRequest")
                .method(com.oracle.bmc.http.client.Method.DELETE)
                .requestBuilder(DeleteWorkRequestRequest::builder)
                .basePath("/20200202")
                .appendPathParam("workRequests")
                .appendPathParam(request.getWorkRequestId())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("if-match", request.getIfMatch())
                .handleResponseHeaderString(
                        "opc-request-id", DeleteWorkRequestResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public DeployPluginsResponse deployPlugins(DeployPluginsRequest request) {
        Objects.requireNonNull(
                request.getDeployPluginsDetails(), "deployPluginsDetails is required");

        return clientCall(request, DeployPluginsResponse::builder)
                .logger(LOG, "deployPlugins")
                .serviceDetails(
                        "ManagementAgent",
                        "DeployPlugins",
                        "https://docs.oracle.com/iaas/api/#/en/management-agent/20200202/ManagementAgent/DeployPlugins")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(DeployPluginsRequest::builder)
                .basePath("/20200202")
                .appendPathParam("managementAgents")
                .appendPathParam("actions")
                .appendPathParam("deployPlugins")
                .accept("application/json")
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .hasBody()
                .handleResponseHeaderString(
                        "opc-work-request-id", DeployPluginsResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", DeployPluginsResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public GetAutoUpgradableConfigResponse getAutoUpgradableConfig(
            GetAutoUpgradableConfigRequest request) {
        Objects.requireNonNull(request.getCompartmentId(), "compartmentId is required");

        return clientCall(request, GetAutoUpgradableConfigResponse::builder)
                .logger(LOG, "getAutoUpgradableConfig")
                .serviceDetails(
                        "ManagementAgent",
                        "GetAutoUpgradableConfig",
                        "https://docs.oracle.com/iaas/api/#/en/management-agent/20200202/ManagementAgent/GetAutoUpgradableConfig")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetAutoUpgradableConfigRequest::builder)
                .basePath("/20200202")
                .appendPathParam("managementAgents")
                .appendPathParam("actions")
                .appendPathParam("getAutoUpgradableConfig")
                .appendQueryParam("compartmentId", request.getCompartmentId())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.managementagent.model.AutoUpgradableConfig.class,
                        GetAutoUpgradableConfigResponse.Builder::autoUpgradableConfig)
                .handleResponseHeaderString(
                        "opc-request-id", GetAutoUpgradableConfigResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public GetManagementAgentResponse getManagementAgent(GetManagementAgentRequest request) {

        Validate.notBlank(request.getManagementAgentId(), "managementAgentId must not be blank");

        return clientCall(request, GetManagementAgentResponse::builder)
                .logger(LOG, "getManagementAgent")
                .serviceDetails(
                        "ManagementAgent",
                        "GetManagementAgent",
                        "https://docs.oracle.com/iaas/api/#/en/management-agent/20200202/ManagementAgent/GetManagementAgent")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetManagementAgentRequest::builder)
                .basePath("/20200202")
                .appendPathParam("managementAgents")
                .appendPathParam(request.getManagementAgentId())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.managementagent.model.ManagementAgent.class,
                        GetManagementAgentResponse.Builder::managementAgent)
                .handleResponseHeaderString("etag", GetManagementAgentResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", GetManagementAgentResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public GetManagementAgentInstallKeyResponse getManagementAgentInstallKey(
            GetManagementAgentInstallKeyRequest request) {

        Validate.notBlank(
                request.getManagementAgentInstallKeyId(),
                "managementAgentInstallKeyId must not be blank");

        return clientCall(request, GetManagementAgentInstallKeyResponse::builder)
                .logger(LOG, "getManagementAgentInstallKey")
                .serviceDetails(
                        "ManagementAgent",
                        "GetManagementAgentInstallKey",
                        "https://docs.oracle.com/iaas/api/#/en/management-agent/20200202/ManagementAgentInstallKey/GetManagementAgentInstallKey")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetManagementAgentInstallKeyRequest::builder)
                .basePath("/20200202")
                .appendPathParam("managementAgentInstallKeys")
                .appendPathParam(request.getManagementAgentInstallKeyId())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.managementagent.model.ManagementAgentInstallKey.class,
                        GetManagementAgentInstallKeyResponse.Builder::managementAgentInstallKey)
                .handleResponseHeaderString(
                        "etag", GetManagementAgentInstallKeyResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id",
                        GetManagementAgentInstallKeyResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public GetManagementAgentInstallKeyContentResponse getManagementAgentInstallKeyContent(
            GetManagementAgentInstallKeyContentRequest request) {

        Validate.notBlank(
                request.getManagementAgentInstallKeyId(),
                "managementAgentInstallKeyId must not be blank");

        return clientCall(request, GetManagementAgentInstallKeyContentResponse::builder)
                .logger(LOG, "getManagementAgentInstallKeyContent")
                .serviceDetails(
                        "ManagementAgent",
                        "GetManagementAgentInstallKeyContent",
                        "https://docs.oracle.com/iaas/api/#/en/management-agent/20200202/ManagementAgentInstallKey/GetManagementAgentInstallKeyContent")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetManagementAgentInstallKeyContentRequest::builder)
                .basePath("/20200202")
                .appendPathParam("managementAgentInstallKeys")
                .appendPathParam(request.getManagementAgentInstallKeyId())
                .appendPathParam("content")
                .appendListQueryParam(
                        "pluginName",
                        request.getPluginName(),
                        com.oracle.bmc.util.internal.CollectionFormatType.Multi)
                .accept("application/octet-stream")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        java.io.InputStream.class,
                        GetManagementAgentInstallKeyContentResponse.Builder::inputStream)
                .handleResponseHeaderString(
                        "opc-request-id",
                        GetManagementAgentInstallKeyContentResponse.Builder::opcRequestId)
                .handleResponseHeaderLong(
                        "content-length",
                        GetManagementAgentInstallKeyContentResponse.Builder::contentLength)
                .handleResponseHeaderString(
                        "content-type",
                        GetManagementAgentInstallKeyContentResponse.Builder::contentType)
                .callSync();
    }

    @Override
    public GetWorkRequestResponse getWorkRequest(GetWorkRequestRequest request) {

        Validate.notBlank(request.getWorkRequestId(), "workRequestId must not be blank");

        return clientCall(request, GetWorkRequestResponse::builder)
                .logger(LOG, "getWorkRequest")
                .serviceDetails(
                        "ManagementAgent",
                        "GetWorkRequest",
                        "https://docs.oracle.com/iaas/api/#/en/management-agent/20200202/WorkRequest/GetWorkRequest")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetWorkRequestRequest::builder)
                .basePath("/20200202")
                .appendPathParam("workRequests")
                .appendPathParam(request.getWorkRequestId())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.managementagent.model.WorkRequest.class,
                        GetWorkRequestResponse.Builder::workRequest)
                .handleResponseHeaderString(
                        "opc-request-id", GetWorkRequestResponse.Builder::opcRequestId)
                .handleResponseHeaderBigDecimal(
                        "retry-after", GetWorkRequestResponse.Builder::retryAfter)
                .handleResponseHeaderString("etag", GetWorkRequestResponse.Builder::etag)
                .callSync();
    }

    @Override
    public ListAvailabilityHistoriesResponse listAvailabilityHistories(
            ListAvailabilityHistoriesRequest request) {

        Validate.notBlank(request.getManagementAgentId(), "managementAgentId must not be blank");

        return clientCall(request, ListAvailabilityHistoriesResponse::builder)
                .logger(LOG, "listAvailabilityHistories")
                .serviceDetails(
                        "ManagementAgent",
                        "ListAvailabilityHistories",
                        "https://docs.oracle.com/iaas/api/#/en/management-agent/20200202/ManagementAgent/ListAvailabilityHistories")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListAvailabilityHistoriesRequest::builder)
                .basePath("/20200202")
                .appendPathParam("managementAgents")
                .appendPathParam(request.getManagementAgentId())
                .appendPathParam("availabilityHistories")
                .appendQueryParam(
                        "timeAvailabilityStatusEndedGreaterThan",
                        request.getTimeAvailabilityStatusEndedGreaterThan())
                .appendQueryParam(
                        "timeAvailabilityStatusStartedLessThan",
                        request.getTimeAvailabilityStatusStartedLessThan())
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBodyList(
                        com.oracle.bmc.managementagent.model.AvailabilityHistorySummary.class,
                        ListAvailabilityHistoriesResponse.Builder::items)
                .handleResponseHeaderString(
                        "opc-request-id", ListAvailabilityHistoriesResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListAvailabilityHistoriesResponse.Builder::opcNextPage)
                .callSync();
    }

    @Override
    public ListManagementAgentImagesResponse listManagementAgentImages(
            ListManagementAgentImagesRequest request) {
        Objects.requireNonNull(request.getCompartmentId(), "compartmentId is required");

        return clientCall(request, ListManagementAgentImagesResponse::builder)
                .logger(LOG, "listManagementAgentImages")
                .serviceDetails(
                        "ManagementAgent",
                        "ListManagementAgentImages",
                        "https://docs.oracle.com/iaas/api/#/en/management-agent/20200202/ManagementAgentImage/ListManagementAgentImages")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListManagementAgentImagesRequest::builder)
                .basePath("/20200202")
                .appendPathParam("managementAgentImages")
                .appendQueryParam("compartmentId", request.getCompartmentId())
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .appendQueryParam("name", request.getName())
                .appendEnumQueryParam("lifecycleState", request.getLifecycleState())
                .appendEnumQueryParam("installType", request.getInstallType())
                .accept("application/json")
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBodyList(
                        com.oracle.bmc.managementagent.model.ManagementAgentImageSummary.class,
                        ListManagementAgentImagesResponse.Builder::items)
                .handleResponseHeaderString(
                        "opc-request-id", ListManagementAgentImagesResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListManagementAgentImagesResponse.Builder::opcNextPage)
                .callSync();
    }

    @Override
    public ListManagementAgentInstallKeysResponse listManagementAgentInstallKeys(
            ListManagementAgentInstallKeysRequest request) {
        Objects.requireNonNull(request.getCompartmentId(), "compartmentId is required");

        return clientCall(request, ListManagementAgentInstallKeysResponse::builder)
                .logger(LOG, "listManagementAgentInstallKeys")
                .serviceDetails(
                        "ManagementAgent",
                        "ListManagementAgentInstallKeys",
                        "https://docs.oracle.com/iaas/api/#/en/management-agent/20200202/ManagementAgentInstallKey/ListManagementAgentInstallKeys")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListManagementAgentInstallKeysRequest::builder)
                .basePath("/20200202")
                .appendPathParam("managementAgentInstallKeys")
                .appendQueryParam("compartmentId", request.getCompartmentId())
                .appendQueryParam("compartmentIdInSubtree", request.getCompartmentIdInSubtree())
                .appendQueryParam("accessLevel", request.getAccessLevel())
                .appendEnumQueryParam("lifecycleState", request.getLifecycleState())
                .appendQueryParam("displayName", request.getDisplayName())
                .appendQueryParam("page", request.getPage())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBodyList(
                        com.oracle.bmc.managementagent.model.ManagementAgentInstallKeySummary.class,
                        ListManagementAgentInstallKeysResponse.Builder::items)
                .handleResponseHeaderString(
                        "opc-next-page",
                        ListManagementAgentInstallKeysResponse.Builder::opcNextPage)
                .handleResponseHeaderString(
                        "opc-request-id",
                        ListManagementAgentInstallKeysResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public ListManagementAgentPluginsResponse listManagementAgentPlugins(
            ListManagementAgentPluginsRequest request) {
        Objects.requireNonNull(request.getCompartmentId(), "compartmentId is required");

        return clientCall(request, ListManagementAgentPluginsResponse::builder)
                .logger(LOG, "listManagementAgentPlugins")
                .serviceDetails(
                        "ManagementAgent",
                        "ListManagementAgentPlugins",
                        "https://docs.oracle.com/iaas/api/#/en/management-agent/20200202/ManagementAgentPlugin/ListManagementAgentPlugins")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListManagementAgentPluginsRequest::builder)
                .basePath("/20200202")
                .appendPathParam("managementAgentPlugins")
                .appendQueryParam("compartmentId", request.getCompartmentId())
                .appendQueryParam("displayName", request.getDisplayName())
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .appendEnumQueryParam("lifecycleState", request.getLifecycleState())
                .appendListQueryParam(
                        "platformType",
                        request.getPlatformType(),
                        com.oracle.bmc.util.internal.CollectionFormatType.Multi)
                .appendQueryParam("agentId", request.getAgentId())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBodyList(
                        com.oracle.bmc.managementagent.model.ManagementAgentPluginSummary.class,
                        ListManagementAgentPluginsResponse.Builder::items)
                .handleResponseHeaderString(
                        "opc-request-id", ListManagementAgentPluginsResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListManagementAgentPluginsResponse.Builder::opcNextPage)
                .callSync();
    }

    @Override
    public ListManagementAgentsResponse listManagementAgents(ListManagementAgentsRequest request) {
        Objects.requireNonNull(request.getCompartmentId(), "compartmentId is required");

        return clientCall(request, ListManagementAgentsResponse::builder)
                .logger(LOG, "listManagementAgents")
                .serviceDetails(
                        "ManagementAgent",
                        "ListManagementAgents",
                        "https://docs.oracle.com/iaas/api/#/en/management-agent/20200202/ManagementAgent/ListManagementAgents")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListManagementAgentsRequest::builder)
                .basePath("/20200202")
                .appendPathParam("managementAgents")
                .appendQueryParam("compartmentId", request.getCompartmentId())
                .appendListQueryParam(
                        "pluginName",
                        request.getPluginName(),
                        com.oracle.bmc.util.internal.CollectionFormatType.Multi)
                .appendListQueryParam(
                        "version",
                        request.getVersion(),
                        com.oracle.bmc.util.internal.CollectionFormatType.Multi)
                .appendQueryParam("displayName", request.getDisplayName())
                .appendEnumQueryParam("lifecycleState", request.getLifecycleState())
                .appendEnumQueryParam("availabilityStatus", request.getAvailabilityStatus())
                .appendQueryParam("hostId", request.getHostId())
                .appendListQueryParam(
                        "platformType",
                        request.getPlatformType(),
                        com.oracle.bmc.util.internal.CollectionFormatType.Multi)
                .appendQueryParam("isCustomerDeployed", request.getIsCustomerDeployed())
                .appendEnumQueryParam("installType", request.getInstallType())
                .appendListQueryParam(
                        "gatewayId",
                        request.getGatewayId(),
                        com.oracle.bmc.util.internal.CollectionFormatType.Multi)
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .appendQueryParam("compartmentIdInSubtree", request.getCompartmentIdInSubtree())
                .appendQueryParam("accessLevel", request.getAccessLevel())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBodyList(
                        com.oracle.bmc.managementagent.model.ManagementAgentSummary.class,
                        ListManagementAgentsResponse.Builder::items)
                .handleResponseHeaderString(
                        "opc-request-id", ListManagementAgentsResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListManagementAgentsResponse.Builder::opcNextPage)
                .callSync();
    }

    @Override
    public ListWorkRequestErrorsResponse listWorkRequestErrors(
            ListWorkRequestErrorsRequest request) {

        Validate.notBlank(request.getWorkRequestId(), "workRequestId must not be blank");

        return clientCall(request, ListWorkRequestErrorsResponse::builder)
                .logger(LOG, "listWorkRequestErrors")
                .serviceDetails(
                        "ManagementAgent",
                        "ListWorkRequestErrors",
                        "https://docs.oracle.com/iaas/api/#/en/management-agent/20200202/WorkRequestError/ListWorkRequestErrors")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListWorkRequestErrorsRequest::builder)
                .basePath("/20200202")
                .appendPathParam("workRequests")
                .appendPathParam(request.getWorkRequestId())
                .appendPathParam("errors")
                .appendQueryParam("page", request.getPage())
                .appendQueryParam("limit", request.getLimit())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBodyList(
                        com.oracle.bmc.managementagent.model.WorkRequestError.class,
                        ListWorkRequestErrorsResponse.Builder::items)
                .handleResponseHeaderString(
                        "opc-next-page", ListWorkRequestErrorsResponse.Builder::opcNextPage)
                .handleResponseHeaderString(
                        "opc-request-id", ListWorkRequestErrorsResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public ListWorkRequestLogsResponse listWorkRequestLogs(ListWorkRequestLogsRequest request) {

        Validate.notBlank(request.getWorkRequestId(), "workRequestId must not be blank");

        return clientCall(request, ListWorkRequestLogsResponse::builder)
                .logger(LOG, "listWorkRequestLogs")
                .serviceDetails(
                        "ManagementAgent",
                        "ListWorkRequestLogs",
                        "https://docs.oracle.com/iaas/api/#/en/management-agent/20200202/WorkRequestLogEntry/ListWorkRequestLogs")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListWorkRequestLogsRequest::builder)
                .basePath("/20200202")
                .appendPathParam("workRequests")
                .appendPathParam(request.getWorkRequestId())
                .appendPathParam("logs")
                .appendQueryParam("page", request.getPage())
                .appendQueryParam("limit", request.getLimit())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBodyList(
                        com.oracle.bmc.managementagent.model.WorkRequestLogEntry.class,
                        ListWorkRequestLogsResponse.Builder::items)
                .handleResponseHeaderString(
                        "opc-next-page", ListWorkRequestLogsResponse.Builder::opcNextPage)
                .handleResponseHeaderString(
                        "opc-request-id", ListWorkRequestLogsResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public ListWorkRequestsResponse listWorkRequests(ListWorkRequestsRequest request) {
        Objects.requireNonNull(request.getCompartmentId(), "compartmentId is required");

        return clientCall(request, ListWorkRequestsResponse::builder)
                .logger(LOG, "listWorkRequests")
                .serviceDetails(
                        "ManagementAgent",
                        "ListWorkRequests",
                        "https://docs.oracle.com/iaas/api/#/en/management-agent/20200202/WorkRequest/ListWorkRequests")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListWorkRequestsRequest::builder)
                .basePath("/20200202")
                .appendPathParam("workRequests")
                .appendQueryParam("compartmentId", request.getCompartmentId())
                .appendQueryParam("agentId", request.getAgentId())
                .appendQueryParam("page", request.getPage())
                .appendQueryParam("limit", request.getLimit())
                .appendEnumQueryParam("status", request.getStatus())
                .appendEnumQueryParam("type", request.getType())
                .appendQueryParam(
                        "timeCreatedGreaterThanOrEqualTo",
                        request.getTimeCreatedGreaterThanOrEqualTo())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBodyList(
                        com.oracle.bmc.managementagent.model.WorkRequestSummary.class,
                        ListWorkRequestsResponse.Builder::items)
                .handleResponseHeaderString(
                        "opc-request-id", ListWorkRequestsResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListWorkRequestsResponse.Builder::opcNextPage)
                .callSync();
    }

    @Override
    public SetAutoUpgradableConfigResponse setAutoUpgradableConfig(
            SetAutoUpgradableConfigRequest request) {
        Objects.requireNonNull(
                request.getSetAutoUpgradableConfigDetails(),
                "setAutoUpgradableConfigDetails is required");

        return clientCall(request, SetAutoUpgradableConfigResponse::builder)
                .logger(LOG, "setAutoUpgradableConfig")
                .serviceDetails(
                        "ManagementAgent",
                        "SetAutoUpgradableConfig",
                        "https://docs.oracle.com/iaas/api/#/en/management-agent/20200202/ManagementAgent/SetAutoUpgradableConfig")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(SetAutoUpgradableConfigRequest::builder)
                .basePath("/20200202")
                .appendPathParam("managementAgents")
                .appendPathParam("actions")
                .appendPathParam("setAutoUpgradableConfig")
                .accept("application/json")
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.managementagent.model.AutoUpgradableConfig.class,
                        SetAutoUpgradableConfigResponse.Builder::autoUpgradableConfig)
                .handleResponseHeaderString(
                        "opc-request-id", SetAutoUpgradableConfigResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public SummarizeManagementAgentCountsResponse summarizeManagementAgentCounts(
            SummarizeManagementAgentCountsRequest request) {
        Objects.requireNonNull(request.getCompartmentId(), "compartmentId is required");

        Objects.requireNonNull(request.getGroupBy(), "groupBy is required");

        return clientCall(request, SummarizeManagementAgentCountsResponse::builder)
                .logger(LOG, "summarizeManagementAgentCounts")
                .serviceDetails(
                        "ManagementAgent",
                        "SummarizeManagementAgentCounts",
                        "https://docs.oracle.com/iaas/api/#/en/management-agent/20200202/ManagementAgent/SummarizeManagementAgentCounts")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(SummarizeManagementAgentCountsRequest::builder)
                .basePath("/20200202")
                .appendPathParam("managementAgentCounts")
                .appendQueryParam("compartmentId", request.getCompartmentId())
                .appendListQueryParam(
                        "groupBy",
                        request.getGroupBy(),
                        com.oracle.bmc.util.internal.CollectionFormatType.Multi)
                .appendQueryParam("hasPlugins", request.getHasPlugins())
                .appendEnumQueryParam("installType", request.getInstallType())
                .appendQueryParam("compartmentIdInSubtree", request.getCompartmentIdInSubtree())
                .appendQueryParam("page", request.getPage())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.managementagent.model.ManagementAgentAggregationCollection
                                .class,
                        SummarizeManagementAgentCountsResponse.Builder
                                ::managementAgentAggregationCollection)
                .handleResponseHeaderString(
                        "opc-request-id",
                        SummarizeManagementAgentCountsResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page",
                        SummarizeManagementAgentCountsResponse.Builder::opcNextPage)
                .callSync();
    }

    @Override
    public SummarizeManagementAgentPluginCountsResponse summarizeManagementAgentPluginCounts(
            SummarizeManagementAgentPluginCountsRequest request) {
        Objects.requireNonNull(request.getCompartmentId(), "compartmentId is required");

        Objects.requireNonNull(request.getGroupBy(), "groupBy is required");

        return clientCall(request, SummarizeManagementAgentPluginCountsResponse::builder)
                .logger(LOG, "summarizeManagementAgentPluginCounts")
                .serviceDetails(
                        "ManagementAgent",
                        "SummarizeManagementAgentPluginCounts",
                        "https://docs.oracle.com/iaas/api/#/en/management-agent/20200202/ManagementAgent/SummarizeManagementAgentPluginCounts")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(SummarizeManagementAgentPluginCountsRequest::builder)
                .basePath("/20200202")
                .appendPathParam("managementAgentPluginCounts")
                .appendQueryParam("compartmentId", request.getCompartmentId())
                .appendEnumQueryParam("groupBy", request.getGroupBy())
                .appendQueryParam("compartmentIdInSubtree", request.getCompartmentIdInSubtree())
                .appendQueryParam("page", request.getPage())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.managementagent.model
                                .ManagementAgentPluginAggregationCollection.class,
                        SummarizeManagementAgentPluginCountsResponse.Builder
                                ::managementAgentPluginAggregationCollection)
                .handleResponseHeaderString(
                        "opc-request-id",
                        SummarizeManagementAgentPluginCountsResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page",
                        SummarizeManagementAgentPluginCountsResponse.Builder::opcNextPage)
                .callSync();
    }

    @Override
    public UpdateManagementAgentResponse updateManagementAgent(
            UpdateManagementAgentRequest request) {

        Validate.notBlank(request.getManagementAgentId(), "managementAgentId must not be blank");
        Objects.requireNonNull(
                request.getUpdateManagementAgentDetails(),
                "updateManagementAgentDetails is required");

        return clientCall(request, UpdateManagementAgentResponse::builder)
                .logger(LOG, "updateManagementAgent")
                .serviceDetails(
                        "ManagementAgent",
                        "UpdateManagementAgent",
                        "https://docs.oracle.com/iaas/api/#/en/management-agent/20200202/ManagementAgent/UpdateManagementAgent")
                .method(com.oracle.bmc.http.client.Method.PUT)
                .requestBuilder(UpdateManagementAgentRequest::builder)
                .basePath("/20200202")
                .appendPathParam("managementAgents")
                .appendPathParam(request.getManagementAgentId())
                .accept("application/json")
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("if-match", request.getIfMatch())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.managementagent.model.ManagementAgent.class,
                        UpdateManagementAgentResponse.Builder::managementAgent)
                .handleResponseHeaderString("etag", UpdateManagementAgentResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", UpdateManagementAgentResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public UpdateManagementAgentInstallKeyResponse updateManagementAgentInstallKey(
            UpdateManagementAgentInstallKeyRequest request) {

        Validate.notBlank(
                request.getManagementAgentInstallKeyId(),
                "managementAgentInstallKeyId must not be blank");
        Objects.requireNonNull(
                request.getUpdateManagementAgentInstallKeyDetails(),
                "updateManagementAgentInstallKeyDetails is required");

        return clientCall(request, UpdateManagementAgentInstallKeyResponse::builder)
                .logger(LOG, "updateManagementAgentInstallKey")
                .serviceDetails(
                        "ManagementAgent",
                        "UpdateManagementAgentInstallKey",
                        "https://docs.oracle.com/iaas/api/#/en/management-agent/20200202/ManagementAgentInstallKey/UpdateManagementAgentInstallKey")
                .method(com.oracle.bmc.http.client.Method.PUT)
                .requestBuilder(UpdateManagementAgentInstallKeyRequest::builder)
                .basePath("/20200202")
                .appendPathParam("managementAgentInstallKeys")
                .appendPathParam(request.getManagementAgentInstallKeyId())
                .accept("application/json")
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("if-match", request.getIfMatch())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.managementagent.model.ManagementAgentInstallKey.class,
                        UpdateManagementAgentInstallKeyResponse.Builder::managementAgentInstallKey)
                .handleResponseHeaderString(
                        "etag", UpdateManagementAgentInstallKeyResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id",
                        UpdateManagementAgentInstallKeyResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public ManagementAgentWaiters getWaiters() {
        return waiters;
    }

    @Override
    public ManagementAgentPaginators getPaginators() {
        return paginators;
    }

    /**
     * Create a new client instance.
     *
     * @param authenticationDetailsProvider The authentication details (see {@link Builder#build})
     * @deprecated Use the {@link #builder() builder} instead.
     */
    @Deprecated
    public ManagementAgentClient(
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
    public ManagementAgentClient(
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
    public ManagementAgentClient(
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
    public ManagementAgentClient(
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
    public ManagementAgentClient(
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
    public ManagementAgentClient(
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
    public ManagementAgentClient(
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
    public ManagementAgentClient(
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
