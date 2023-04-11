/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.managementagent;

import com.oracle.bmc.util.internal.Validate;
import com.oracle.bmc.managementagent.requests.*;
import com.oracle.bmc.managementagent.responses.*;

import java.util.Objects;

/**
 * Async client implementation for ManagementAgent service. <br>
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
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200202")
public class ManagementAgentAsyncClient extends com.oracle.bmc.http.internal.BaseAsyncClient
        implements ManagementAgentAsync {
    /** Service instance for ManagementAgent. */
    public static final com.oracle.bmc.Service SERVICE =
            com.oracle.bmc.Services.serviceBuilder()
                    .serviceName("MANAGEMENTAGENT")
                    .serviceEndpointPrefix("")
                    .serviceEndpointTemplate(
                            "https://management-agent.{region}.oci.{secondLevelDomain}")
                    .build();

    private static final org.slf4j.Logger LOG =
            org.slf4j.LoggerFactory.getLogger(ManagementAgentAsyncClient.class);

    ManagementAgentAsyncClient(
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
                    Builder, ManagementAgentAsyncClient> {
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
        public ManagementAgentAsyncClient build(
                @jakarta.annotation.Nonnull
                        com.oracle.bmc.auth.AbstractAuthenticationDetailsProvider
                                authenticationDetailsProvider) {
            return new ManagementAgentAsyncClient(this, authenticationDetailsProvider);
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
    public java.util.concurrent.Future<CreateManagementAgentInstallKeyResponse>
            createManagementAgentInstallKey(
                    CreateManagementAgentInstallKeyRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    CreateManagementAgentInstallKeyRequest,
                                    CreateManagementAgentInstallKeyResponse>
                            handler) {
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
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<DeleteManagementAgentResponse> deleteManagementAgent(
            DeleteManagementAgentRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            DeleteManagementAgentRequest, DeleteManagementAgentResponse>
                    handler) {

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
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<DeleteManagementAgentInstallKeyResponse>
            deleteManagementAgentInstallKey(
                    DeleteManagementAgentInstallKeyRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    DeleteManagementAgentInstallKeyRequest,
                                    DeleteManagementAgentInstallKeyResponse>
                            handler) {

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
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<DeleteWorkRequestResponse> deleteWorkRequest(
            DeleteWorkRequestRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            DeleteWorkRequestRequest, DeleteWorkRequestResponse>
                    handler) {

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
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<DeployPluginsResponse> deployPlugins(
            DeployPluginsRequest request,
            final com.oracle.bmc.responses.AsyncHandler<DeployPluginsRequest, DeployPluginsResponse>
                    handler) {
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
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<GetAutoUpgradableConfigResponse> getAutoUpgradableConfig(
            GetAutoUpgradableConfigRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            GetAutoUpgradableConfigRequest, GetAutoUpgradableConfigResponse>
                    handler) {
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
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<GetManagementAgentResponse> getManagementAgent(
            GetManagementAgentRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            GetManagementAgentRequest, GetManagementAgentResponse>
                    handler) {

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
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<GetManagementAgentInstallKeyResponse>
            getManagementAgentInstallKey(
                    GetManagementAgentInstallKeyRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    GetManagementAgentInstallKeyRequest,
                                    GetManagementAgentInstallKeyResponse>
                            handler) {

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
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<GetManagementAgentInstallKeyContentResponse>
            getManagementAgentInstallKeyContent(
                    GetManagementAgentInstallKeyContentRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    GetManagementAgentInstallKeyContentRequest,
                                    GetManagementAgentInstallKeyContentResponse>
                            handler) {

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
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<GetWorkRequestResponse> getWorkRequest(
            GetWorkRequestRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            GetWorkRequestRequest, GetWorkRequestResponse>
                    handler) {

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
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ListAvailabilityHistoriesResponse> listAvailabilityHistories(
            ListAvailabilityHistoriesRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ListAvailabilityHistoriesRequest, ListAvailabilityHistoriesResponse>
                    handler) {

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
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ListManagementAgentImagesResponse> listManagementAgentImages(
            ListManagementAgentImagesRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ListManagementAgentImagesRequest, ListManagementAgentImagesResponse>
                    handler) {
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
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ListManagementAgentInstallKeysResponse>
            listManagementAgentInstallKeys(
                    ListManagementAgentInstallKeysRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    ListManagementAgentInstallKeysRequest,
                                    ListManagementAgentInstallKeysResponse>
                            handler) {
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
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ListManagementAgentPluginsResponse>
            listManagementAgentPlugins(
                    ListManagementAgentPluginsRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    ListManagementAgentPluginsRequest,
                                    ListManagementAgentPluginsResponse>
                            handler) {
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
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ListManagementAgentsResponse> listManagementAgents(
            ListManagementAgentsRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ListManagementAgentsRequest, ListManagementAgentsResponse>
                    handler) {
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
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ListWorkRequestErrorsResponse> listWorkRequestErrors(
            ListWorkRequestErrorsRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ListWorkRequestErrorsRequest, ListWorkRequestErrorsResponse>
                    handler) {

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
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ListWorkRequestLogsResponse> listWorkRequestLogs(
            ListWorkRequestLogsRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ListWorkRequestLogsRequest, ListWorkRequestLogsResponse>
                    handler) {

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
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ListWorkRequestsResponse> listWorkRequests(
            ListWorkRequestsRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ListWorkRequestsRequest, ListWorkRequestsResponse>
                    handler) {
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
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<SetAutoUpgradableConfigResponse> setAutoUpgradableConfig(
            SetAutoUpgradableConfigRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            SetAutoUpgradableConfigRequest, SetAutoUpgradableConfigResponse>
                    handler) {
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
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<SummarizeManagementAgentCountsResponse>
            summarizeManagementAgentCounts(
                    SummarizeManagementAgentCountsRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    SummarizeManagementAgentCountsRequest,
                                    SummarizeManagementAgentCountsResponse>
                            handler) {
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
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<SummarizeManagementAgentPluginCountsResponse>
            summarizeManagementAgentPluginCounts(
                    SummarizeManagementAgentPluginCountsRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    SummarizeManagementAgentPluginCountsRequest,
                                    SummarizeManagementAgentPluginCountsResponse>
                            handler) {
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
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<UpdateManagementAgentResponse> updateManagementAgent(
            UpdateManagementAgentRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            UpdateManagementAgentRequest, UpdateManagementAgentResponse>
                    handler) {

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
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<UpdateManagementAgentInstallKeyResponse>
            updateManagementAgentInstallKey(
                    UpdateManagementAgentInstallKeyRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    UpdateManagementAgentInstallKeyRequest,
                                    UpdateManagementAgentInstallKeyResponse>
                            handler) {

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
                .callAsync(handler);
    }

    /**
     * Create a new client instance.
     *
     * @param authenticationDetailsProvider The authentication details (see {@link Builder#build})
     * @deprecated Use the {@link #builder() builder} instead.
     */
    @Deprecated
    public ManagementAgentAsyncClient(
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
    public ManagementAgentAsyncClient(
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
    public ManagementAgentAsyncClient(
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
    public ManagementAgentAsyncClient(
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
    public ManagementAgentAsyncClient(
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
    public ManagementAgentAsyncClient(
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
    public ManagementAgentAsyncClient(
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
