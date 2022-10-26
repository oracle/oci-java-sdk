/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.logging;

import com.oracle.bmc.util.internal.Validate;
import com.oracle.bmc.logging.requests.*;
import com.oracle.bmc.logging.responses.*;
import com.oracle.bmc.circuitbreaker.CircuitBreakerConfiguration;
import com.oracle.bmc.util.CircuitBreakerUtils;

import java.util.Objects;

@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200531")
public class LoggingManagementClient extends com.oracle.bmc.http.internal.BaseSyncClient
        implements LoggingManagement {
    /** Service instance for LoggingManagement. */
    public static final com.oracle.bmc.Service SERVICE =
            com.oracle.bmc.Services.serviceBuilder()
                    .serviceName("LOGGINGMANAGEMENT")
                    .serviceEndpointPrefix("")
                    .serviceEndpointTemplate("https://logging.{region}.oci.{secondLevelDomain}")
                    .build();

    private static final org.slf4j.Logger LOG =
            org.slf4j.LoggerFactory.getLogger(LoggingManagementAsyncClient.class);

    private final LoggingManagementWaiters waiters;

    private final LoggingManagementPaginators paginators;

    private LoggingManagementClient(
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
                                    .nameFormat("LoggingManagement-waiters-%d")
                                    .build());
            threadPoolExecutor.allowCoreThreadTimeOut(true);

            executorService = threadPoolExecutor;
        }
        this.waiters = new LoggingManagementWaiters(executorService, this);

        this.paginators = new LoggingManagementPaginators(this);
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
            extends com.oracle.bmc.common.RegionalClientBuilder<Builder, LoggingManagementClient> {
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
        public LoggingManagementClient build(
                @javax.annotation.Nonnull
                        com.oracle.bmc.auth.AbstractAuthenticationDetailsProvider
                                authenticationDetailsProvider) {
            return new LoggingManagementClient(
                    this, authenticationDetailsProvider, executorService);
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
    public ChangeLogGroupCompartmentResponse changeLogGroupCompartment(
            ChangeLogGroupCompartmentRequest request) {

        Validate.notBlank(request.getLogGroupId(), "logGroupId must not be blank");
        Objects.requireNonNull(
                request.getChangeLogGroupCompartmentDetails(),
                "changeLogGroupCompartmentDetails is required");

        return clientCall(request, ChangeLogGroupCompartmentResponse::builder)
                .logger(LOG, "changeLogGroupCompartment")
                .serviceDetails(
                        "LoggingManagement",
                        "ChangeLogGroupCompartment",
                        "https://docs.oracle.com/iaas/api/#/en/logging-management/20200531/LogGroup/ChangeLogGroupCompartment")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(ChangeLogGroupCompartmentRequest::builder)
                .basePath("/20200531")
                .appendPathParam("logGroups")
                .appendPathParam(request.getLogGroupId())
                .appendPathParam("actions")
                .appendPathParam("changeCompartment")
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .hasBody()
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        ChangeLogGroupCompartmentResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", ChangeLogGroupCompartmentResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public ChangeLogLogGroupResponse changeLogLogGroup(ChangeLogLogGroupRequest request) {

        Validate.notBlank(request.getLogGroupId(), "logGroupId must not be blank");

        Validate.notBlank(request.getLogId(), "logId must not be blank");
        Objects.requireNonNull(
                request.getChangeLogLogGroupDetails(), "changeLogLogGroupDetails is required");

        return clientCall(request, ChangeLogLogGroupResponse::builder)
                .logger(LOG, "changeLogLogGroup")
                .serviceDetails(
                        "LoggingManagement",
                        "ChangeLogLogGroup",
                        "https://docs.oracle.com/iaas/api/#/en/logging-management/20200531/Log/ChangeLogLogGroup")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(ChangeLogLogGroupRequest::builder)
                .basePath("/20200531")
                .appendPathParam("logGroups")
                .appendPathParam(request.getLogGroupId())
                .appendPathParam("logs")
                .appendPathParam(request.getLogId())
                .appendPathParam("actions")
                .appendPathParam("changeLogGroup")
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .hasBody()
                .handleResponseHeaderString(
                        "opc-work-request-id", ChangeLogLogGroupResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", ChangeLogLogGroupResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public ChangeLogSavedSearchCompartmentResponse changeLogSavedSearchCompartment(
            ChangeLogSavedSearchCompartmentRequest request) {

        Validate.notBlank(request.getLogSavedSearchId(), "logSavedSearchId must not be blank");
        Objects.requireNonNull(
                request.getChangeLogSavedSearchCompartmentDetails(),
                "changeLogSavedSearchCompartmentDetails is required");

        return clientCall(request, ChangeLogSavedSearchCompartmentResponse::builder)
                .logger(LOG, "changeLogSavedSearchCompartment")
                .serviceDetails(
                        "LoggingManagement",
                        "ChangeLogSavedSearchCompartment",
                        "https://docs.oracle.com/iaas/api/#/en/logging-management/20200531/LogSavedSearch/ChangeLogSavedSearchCompartment")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(ChangeLogSavedSearchCompartmentRequest::builder)
                .basePath("/20200531")
                .appendPathParam("logSavedSearches")
                .appendPathParam(request.getLogSavedSearchId())
                .appendPathParam("actions")
                .appendPathParam("changeCompartment")
                .accept("application/json")
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .hasBody()
                .handleResponseHeaderString(
                        "opc-request-id",
                        ChangeLogSavedSearchCompartmentResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public ChangeUnifiedAgentConfigurationCompartmentResponse
            changeUnifiedAgentConfigurationCompartment(
                    ChangeUnifiedAgentConfigurationCompartmentRequest request) {

        Validate.notBlank(
                request.getUnifiedAgentConfigurationId(),
                "unifiedAgentConfigurationId must not be blank");
        Objects.requireNonNull(
                request.getChangeUnifiedAgentConfigurationCompartmentDetails(),
                "changeUnifiedAgentConfigurationCompartmentDetails is required");

        return clientCall(request, ChangeUnifiedAgentConfigurationCompartmentResponse::builder)
                .logger(LOG, "changeUnifiedAgentConfigurationCompartment")
                .serviceDetails(
                        "LoggingManagement",
                        "ChangeUnifiedAgentConfigurationCompartment",
                        "https://docs.oracle.com/iaas/api/#/en/logging-management/20200531/UnifiedAgentConfiguration/ChangeUnifiedAgentConfigurationCompartment")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(ChangeUnifiedAgentConfigurationCompartmentRequest::builder)
                .basePath("/20200531")
                .appendPathParam("unifiedAgentConfigurations")
                .appendPathParam(request.getUnifiedAgentConfigurationId())
                .appendPathParam("actions")
                .appendPathParam("changeCompartment")
                .accept("application/json")
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .hasBody()
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        ChangeUnifiedAgentConfigurationCompartmentResponse.Builder
                                ::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id",
                        ChangeUnifiedAgentConfigurationCompartmentResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public CreateLogResponse createLog(CreateLogRequest request) {

        Validate.notBlank(request.getLogGroupId(), "logGroupId must not be blank");
        Objects.requireNonNull(request.getCreateLogDetails(), "createLogDetails is required");

        return clientCall(request, CreateLogResponse::builder)
                .logger(LOG, "createLog")
                .serviceDetails(
                        "LoggingManagement",
                        "CreateLog",
                        "https://docs.oracle.com/iaas/api/#/en/logging-management/20200531/Log/CreateLog")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(CreateLogRequest::builder)
                .basePath("/20200531")
                .appendPathParam("logGroups")
                .appendPathParam(request.getLogGroupId())
                .appendPathParam("logs")
                .accept("application/json")
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .hasBody()
                .handleResponseHeaderString(
                        "opc-work-request-id", CreateLogResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", CreateLogResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public CreateLogGroupResponse createLogGroup(CreateLogGroupRequest request) {
        Objects.requireNonNull(
                request.getCreateLogGroupDetails(), "createLogGroupDetails is required");

        return clientCall(request, CreateLogGroupResponse::builder)
                .logger(LOG, "createLogGroup")
                .serviceDetails(
                        "LoggingManagement",
                        "CreateLogGroup",
                        "https://docs.oracle.com/iaas/api/#/en/logging-management/20200531/LogGroup/CreateLogGroup")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(CreateLogGroupRequest::builder)
                .basePath("/20200531")
                .appendPathParam("logGroups")
                .accept("application/json")
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .hasBody()
                .handleResponseHeaderString(
                        "opc-work-request-id", CreateLogGroupResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", CreateLogGroupResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public CreateLogSavedSearchResponse createLogSavedSearch(CreateLogSavedSearchRequest request) {
        Objects.requireNonNull(
                request.getCreateLogSavedSearchDetails(),
                "createLogSavedSearchDetails is required");

        return clientCall(request, CreateLogSavedSearchResponse::builder)
                .logger(LOG, "createLogSavedSearch")
                .serviceDetails(
                        "LoggingManagement",
                        "CreateLogSavedSearch",
                        "https://docs.oracle.com/iaas/api/#/en/logging-management/20200531/LogSavedSearch/CreateLogSavedSearch")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(CreateLogSavedSearchRequest::builder)
                .basePath("/20200531")
                .appendPathParam("logSavedSearches")
                .accept("application/json")
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.logging.model.LogSavedSearch.class,
                        CreateLogSavedSearchResponse.Builder::logSavedSearch)
                .handleResponseHeaderString(
                        "opc-request-id", CreateLogSavedSearchResponse.Builder::opcRequestId)
                .handleResponseHeaderString("etag", CreateLogSavedSearchResponse.Builder::etag)
                .callSync();
    }

    @Override
    public CreateUnifiedAgentConfigurationResponse createUnifiedAgentConfiguration(
            CreateUnifiedAgentConfigurationRequest request) {
        Objects.requireNonNull(
                request.getCreateUnifiedAgentConfigurationDetails(),
                "createUnifiedAgentConfigurationDetails is required");

        return clientCall(request, CreateUnifiedAgentConfigurationResponse::builder)
                .logger(LOG, "createUnifiedAgentConfiguration")
                .serviceDetails(
                        "LoggingManagement",
                        "CreateUnifiedAgentConfiguration",
                        "https://docs.oracle.com/iaas/api/#/en/logging-management/20200531/UnifiedAgentConfiguration/CreateUnifiedAgentConfiguration")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(CreateUnifiedAgentConfigurationRequest::builder)
                .basePath("/20200531")
                .appendPathParam("unifiedAgentConfigurations")
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .hasBody()
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        CreateUnifiedAgentConfigurationResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id",
                        CreateUnifiedAgentConfigurationResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public DeleteLogResponse deleteLog(DeleteLogRequest request) {

        Validate.notBlank(request.getLogGroupId(), "logGroupId must not be blank");

        Validate.notBlank(request.getLogId(), "logId must not be blank");

        return clientCall(request, DeleteLogResponse::builder)
                .logger(LOG, "deleteLog")
                .serviceDetails(
                        "LoggingManagement",
                        "DeleteLog",
                        "https://docs.oracle.com/iaas/api/#/en/logging-management/20200531/Log/DeleteLog")
                .method(com.oracle.bmc.http.client.Method.DELETE)
                .requestBuilder(DeleteLogRequest::builder)
                .basePath("/20200531")
                .appendPathParam("logGroups")
                .appendPathParam(request.getLogGroupId())
                .appendPathParam("logs")
                .appendPathParam(request.getLogId())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleResponseHeaderString(
                        "opc-work-request-id", DeleteLogResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", DeleteLogResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public DeleteLogGroupResponse deleteLogGroup(DeleteLogGroupRequest request) {

        Validate.notBlank(request.getLogGroupId(), "logGroupId must not be blank");

        return clientCall(request, DeleteLogGroupResponse::builder)
                .logger(LOG, "deleteLogGroup")
                .serviceDetails(
                        "LoggingManagement",
                        "DeleteLogGroup",
                        "https://docs.oracle.com/iaas/api/#/en/logging-management/20200531/LogGroup/DeleteLogGroup")
                .method(com.oracle.bmc.http.client.Method.DELETE)
                .requestBuilder(DeleteLogGroupRequest::builder)
                .basePath("/20200531")
                .appendPathParam("logGroups")
                .appendPathParam(request.getLogGroupId())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleResponseHeaderString(
                        "opc-work-request-id", DeleteLogGroupResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", DeleteLogGroupResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public DeleteLogSavedSearchResponse deleteLogSavedSearch(DeleteLogSavedSearchRequest request) {

        Validate.notBlank(request.getLogSavedSearchId(), "logSavedSearchId must not be blank");

        return clientCall(request, DeleteLogSavedSearchResponse::builder)
                .logger(LOG, "deleteLogSavedSearch")
                .serviceDetails(
                        "LoggingManagement",
                        "DeleteLogSavedSearch",
                        "https://docs.oracle.com/iaas/api/#/en/logging-management/20200531/LogSavedSearch/DeleteLogSavedSearch")
                .method(com.oracle.bmc.http.client.Method.DELETE)
                .requestBuilder(DeleteLogSavedSearchRequest::builder)
                .basePath("/20200531")
                .appendPathParam("logSavedSearches")
                .appendPathParam(request.getLogSavedSearchId())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleResponseHeaderString(
                        "opc-request-id", DeleteLogSavedSearchResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public DeleteUnifiedAgentConfigurationResponse deleteUnifiedAgentConfiguration(
            DeleteUnifiedAgentConfigurationRequest request) {

        Validate.notBlank(
                request.getUnifiedAgentConfigurationId(),
                "unifiedAgentConfigurationId must not be blank");

        return clientCall(request, DeleteUnifiedAgentConfigurationResponse::builder)
                .logger(LOG, "deleteUnifiedAgentConfiguration")
                .serviceDetails(
                        "LoggingManagement",
                        "DeleteUnifiedAgentConfiguration",
                        "https://docs.oracle.com/iaas/api/#/en/logging-management/20200531/UnifiedAgentConfiguration/DeleteUnifiedAgentConfiguration")
                .method(com.oracle.bmc.http.client.Method.DELETE)
                .requestBuilder(DeleteUnifiedAgentConfigurationRequest::builder)
                .basePath("/20200531")
                .appendPathParam("unifiedAgentConfigurations")
                .appendPathParam(request.getUnifiedAgentConfigurationId())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("if-match", request.getIfMatch())
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        DeleteUnifiedAgentConfigurationResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id",
                        DeleteUnifiedAgentConfigurationResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public DeleteWorkRequestResponse deleteWorkRequest(DeleteWorkRequestRequest request) {

        Validate.notBlank(request.getWorkRequestId(), "workRequestId must not be blank");

        return clientCall(request, DeleteWorkRequestResponse::builder)
                .logger(LOG, "deleteWorkRequest")
                .serviceDetails(
                        "LoggingManagement",
                        "DeleteWorkRequest",
                        "https://docs.oracle.com/iaas/api/#/en/logging-management/20200531/WorkRequest/DeleteWorkRequest")
                .method(com.oracle.bmc.http.client.Method.DELETE)
                .requestBuilder(DeleteWorkRequestRequest::builder)
                .basePath("/20200531")
                .appendPathParam("workRequests")
                .appendPathParam(request.getWorkRequestId())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleResponseHeaderString(
                        "opc-work-request-id", DeleteWorkRequestResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", DeleteWorkRequestResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public GetLogResponse getLog(GetLogRequest request) {

        Validate.notBlank(request.getLogGroupId(), "logGroupId must not be blank");

        Validate.notBlank(request.getLogId(), "logId must not be blank");

        return clientCall(request, GetLogResponse::builder)
                .logger(LOG, "getLog")
                .serviceDetails(
                        "LoggingManagement",
                        "GetLog",
                        "https://docs.oracle.com/iaas/api/#/en/logging-management/20200531/Log/GetLog")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetLogRequest::builder)
                .basePath("/20200531")
                .appendPathParam("logGroups")
                .appendPathParam(request.getLogGroupId())
                .appendPathParam("logs")
                .appendPathParam(request.getLogId())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(com.oracle.bmc.logging.model.Log.class, GetLogResponse.Builder::log)
                .handleResponseHeaderString("opc-request-id", GetLogResponse.Builder::opcRequestId)
                .handleResponseHeaderString("etag", GetLogResponse.Builder::etag)
                .callSync();
    }

    @Override
    public GetLogGroupResponse getLogGroup(GetLogGroupRequest request) {

        Validate.notBlank(request.getLogGroupId(), "logGroupId must not be blank");

        return clientCall(request, GetLogGroupResponse::builder)
                .logger(LOG, "getLogGroup")
                .serviceDetails(
                        "LoggingManagement",
                        "GetLogGroup",
                        "https://docs.oracle.com/iaas/api/#/en/logging-management/20200531/LogGroup/GetLogGroup")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetLogGroupRequest::builder)
                .basePath("/20200531")
                .appendPathParam("logGroups")
                .appendPathParam(request.getLogGroupId())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.logging.model.LogGroup.class,
                        GetLogGroupResponse.Builder::logGroup)
                .handleResponseHeaderString(
                        "opc-request-id", GetLogGroupResponse.Builder::opcRequestId)
                .handleResponseHeaderString("etag", GetLogGroupResponse.Builder::etag)
                .callSync();
    }

    @Override
    public GetLogIncludedSearchResponse getLogIncludedSearch(GetLogIncludedSearchRequest request) {
        Objects.requireNonNull(request.getCompartmentId(), "compartmentId is required");

        Validate.notBlank(
                request.getLogIncludedSearchId(), "logIncludedSearchId must not be blank");

        return clientCall(request, GetLogIncludedSearchResponse::builder)
                .logger(LOG, "getLogIncludedSearch")
                .serviceDetails(
                        "LoggingManagement",
                        "GetLogIncludedSearch",
                        "https://docs.oracle.com/iaas/api/#/en/logging-management/20200531/LogIncludedSearch/GetLogIncludedSearch")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetLogIncludedSearchRequest::builder)
                .basePath("/20200531")
                .appendPathParam("logIncludedSearch")
                .appendPathParam(request.getLogIncludedSearchId())
                .appendQueryParam("compartmentId", request.getCompartmentId())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.logging.model.LogIncludedSearch.class,
                        GetLogIncludedSearchResponse.Builder::logIncludedSearch)
                .handleResponseHeaderString(
                        "opc-request-id", GetLogIncludedSearchResponse.Builder::opcRequestId)
                .handleResponseHeaderString("etag", GetLogIncludedSearchResponse.Builder::etag)
                .callSync();
    }

    @Override
    public GetLogSavedSearchResponse getLogSavedSearch(GetLogSavedSearchRequest request) {

        Validate.notBlank(request.getLogSavedSearchId(), "logSavedSearchId must not be blank");

        return clientCall(request, GetLogSavedSearchResponse::builder)
                .logger(LOG, "getLogSavedSearch")
                .serviceDetails(
                        "LoggingManagement",
                        "GetLogSavedSearch",
                        "https://docs.oracle.com/iaas/api/#/en/logging-management/20200531/LogSavedSearch/GetLogSavedSearch")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetLogSavedSearchRequest::builder)
                .basePath("/20200531")
                .appendPathParam("logSavedSearches")
                .appendPathParam(request.getLogSavedSearchId())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.logging.model.LogSavedSearch.class,
                        GetLogSavedSearchResponse.Builder::logSavedSearch)
                .handleResponseHeaderString(
                        "opc-request-id", GetLogSavedSearchResponse.Builder::opcRequestId)
                .handleResponseHeaderString("etag", GetLogSavedSearchResponse.Builder::etag)
                .callSync();
    }

    @Override
    public GetUnifiedAgentConfigurationResponse getUnifiedAgentConfiguration(
            GetUnifiedAgentConfigurationRequest request) {

        Validate.notBlank(
                request.getUnifiedAgentConfigurationId(),
                "unifiedAgentConfigurationId must not be blank");

        return clientCall(request, GetUnifiedAgentConfigurationResponse::builder)
                .logger(LOG, "getUnifiedAgentConfiguration")
                .serviceDetails(
                        "LoggingManagement",
                        "GetUnifiedAgentConfiguration",
                        "https://docs.oracle.com/iaas/api/#/en/logging-management/20200531/UnifiedAgentConfiguration/GetUnifiedAgentConfiguration")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetUnifiedAgentConfigurationRequest::builder)
                .basePath("/20200531")
                .appendPathParam("unifiedAgentConfigurations")
                .appendPathParam(request.getUnifiedAgentConfigurationId())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.logging.model.UnifiedAgentConfiguration.class,
                        GetUnifiedAgentConfigurationResponse.Builder::unifiedAgentConfiguration)
                .handleResponseHeaderString(
                        "opc-request-id",
                        GetUnifiedAgentConfigurationResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "etag", GetUnifiedAgentConfigurationResponse.Builder::etag)
                .callSync();
    }

    @Override
    public GetWorkRequestResponse getWorkRequest(GetWorkRequestRequest request) {

        Validate.notBlank(request.getWorkRequestId(), "workRequestId must not be blank");

        return clientCall(request, GetWorkRequestResponse::builder)
                .logger(LOG, "getWorkRequest")
                .serviceDetails(
                        "LoggingManagement",
                        "GetWorkRequest",
                        "https://docs.oracle.com/iaas/api/#/en/logging-management/20200531/WorkRequest/GetWorkRequest")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetWorkRequestRequest::builder)
                .basePath("/20200531")
                .appendPathParam("workRequests")
                .appendPathParam(request.getWorkRequestId())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.logging.model.WorkRequest.class,
                        GetWorkRequestResponse.Builder::workRequest)
                .handleResponseHeaderString("etag", GetWorkRequestResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", GetWorkRequestResponse.Builder::opcRequestId)
                .handleResponseHeaderBigDecimal(
                        "retry-after", GetWorkRequestResponse.Builder::retryAfter)
                .callSync();
    }

    @Override
    public ListLogGroupsResponse listLogGroups(ListLogGroupsRequest request) {
        Objects.requireNonNull(request.getCompartmentId(), "compartmentId is required");

        return clientCall(request, ListLogGroupsResponse::builder)
                .logger(LOG, "listLogGroups")
                .serviceDetails(
                        "LoggingManagement",
                        "ListLogGroups",
                        "https://docs.oracle.com/iaas/api/#/en/logging-management/20200531/LogGroupSummary/ListLogGroups")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListLogGroupsRequest::builder)
                .basePath("/20200531")
                .appendPathParam("logGroups")
                .appendQueryParam("compartmentId", request.getCompartmentId())
                .appendQueryParam("isCompartmentIdInSubtree", request.getIsCompartmentIdInSubtree())
                .appendQueryParam("displayName", request.getDisplayName())
                .appendQueryParam("page", request.getPage())
                .appendQueryParam("limit", request.getLimit())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBodyList(
                        com.oracle.bmc.logging.model.LogGroupSummary.class,
                        ListLogGroupsResponse.Builder::items)
                .handleResponseHeaderString(
                        "opc-next-page", ListLogGroupsResponse.Builder::opcNextPage)
                .handleResponseHeaderString(
                        "opc-previous-page", ListLogGroupsResponse.Builder::opcPreviousPage)
                .handleResponseHeaderString(
                        "opc-request-id", ListLogGroupsResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public ListLogIncludedSearchesResponse listLogIncludedSearches(
            ListLogIncludedSearchesRequest request) {
        Objects.requireNonNull(request.getCompartmentId(), "compartmentId is required");

        return clientCall(request, ListLogIncludedSearchesResponse::builder)
                .logger(LOG, "listLogIncludedSearches")
                .serviceDetails(
                        "LoggingManagement",
                        "ListLogIncludedSearches",
                        "https://docs.oracle.com/iaas/api/#/en/logging-management/20200531/LogIncludedSearch/ListLogIncludedSearches")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListLogIncludedSearchesRequest::builder)
                .basePath("/20200531")
                .appendPathParam("logIncludedSearches")
                .appendQueryParam("compartmentId", request.getCompartmentId())
                .appendQueryParam("logIncludedSearchId", request.getLogIncludedSearchId())
                .appendQueryParam("displayName", request.getDisplayName())
                .appendQueryParam("page", request.getPage())
                .appendQueryParam("limit", request.getLimit())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.logging.model.LogIncludedSearchSummaryCollection.class,
                        ListLogIncludedSearchesResponse.Builder::logIncludedSearchSummaryCollection)
                .handleResponseHeaderString(
                        "opc-next-page", ListLogIncludedSearchesResponse.Builder::opcNextPage)
                .handleResponseHeaderString(
                        "opc-previous-page",
                        ListLogIncludedSearchesResponse.Builder::opcPreviousPage)
                .handleResponseHeaderString(
                        "opc-request-id", ListLogIncludedSearchesResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public ListLogSavedSearchesResponse listLogSavedSearches(ListLogSavedSearchesRequest request) {
        Objects.requireNonNull(request.getCompartmentId(), "compartmentId is required");

        return clientCall(request, ListLogSavedSearchesResponse::builder)
                .logger(LOG, "listLogSavedSearches")
                .serviceDetails(
                        "LoggingManagement",
                        "ListLogSavedSearches",
                        "https://docs.oracle.com/iaas/api/#/en/logging-management/20200531/LogSavedSearch/ListLogSavedSearches")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListLogSavedSearchesRequest::builder)
                .basePath("/20200531")
                .appendPathParam("logSavedSearches")
                .appendQueryParam("compartmentId", request.getCompartmentId())
                .appendQueryParam("logSavedSearchId", request.getLogSavedSearchId())
                .appendQueryParam("name", request.getName())
                .appendQueryParam("page", request.getPage())
                .appendQueryParam("limit", request.getLimit())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.logging.model.LogSavedSearchSummaryCollection.class,
                        ListLogSavedSearchesResponse.Builder::logSavedSearchSummaryCollection)
                .handleResponseHeaderString(
                        "opc-next-page", ListLogSavedSearchesResponse.Builder::opcNextPage)
                .handleResponseHeaderString(
                        "opc-previous-page", ListLogSavedSearchesResponse.Builder::opcPreviousPage)
                .handleResponseHeaderString(
                        "opc-request-id", ListLogSavedSearchesResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public ListLogsResponse listLogs(ListLogsRequest request) {

        Validate.notBlank(request.getLogGroupId(), "logGroupId must not be blank");

        return clientCall(request, ListLogsResponse::builder)
                .logger(LOG, "listLogs")
                .serviceDetails(
                        "LoggingManagement",
                        "ListLogs",
                        "https://docs.oracle.com/iaas/api/#/en/logging-management/20200531/LogSummary/ListLogs")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListLogsRequest::builder)
                .basePath("/20200531")
                .appendPathParam("logGroups")
                .appendPathParam(request.getLogGroupId())
                .appendPathParam("logs")
                .appendEnumQueryParam("logType", request.getLogType())
                .appendQueryParam("sourceService", request.getSourceService())
                .appendQueryParam("sourceResource", request.getSourceResource())
                .appendQueryParam("displayName", request.getDisplayName())
                .appendEnumQueryParam("lifecycleState", request.getLifecycleState())
                .appendQueryParam("page", request.getPage())
                .appendQueryParam("limit", request.getLimit())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBodyList(
                        com.oracle.bmc.logging.model.LogSummary.class,
                        ListLogsResponse.Builder::items)
                .handleResponseHeaderString("opc-next-page", ListLogsResponse.Builder::opcNextPage)
                .handleResponseHeaderString(
                        "opc-previous-page", ListLogsResponse.Builder::opcPreviousPage)
                .handleResponseHeaderString(
                        "opc-request-id", ListLogsResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public ListServicesResponse listServices(ListServicesRequest request) {

        return clientCall(request, ListServicesResponse::builder)
                .logger(LOG, "listServices")
                .serviceDetails(
                        "LoggingManagement",
                        "ListServices",
                        "https://docs.oracle.com/iaas/api/#/en/logging-management/20200531/ServiceSummary/ListServices")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListServicesRequest::builder)
                .basePath("/20200531")
                .appendPathParam("v2")
                .appendPathParam("registry")
                .appendPathParam("services")
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBodyList(
                        com.oracle.bmc.logging.model.ServiceSummary.class,
                        ListServicesResponse.Builder::items)
                .handleResponseHeaderString(
                        "opc-request-id", ListServicesResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListServicesResponse.Builder::opcNextPage)
                .handleResponseHeaderString(
                        "opc-previous-page", ListServicesResponse.Builder::opcPreviousPage)
                .callSync();
    }

    @Override
    public ListUnifiedAgentConfigurationsResponse listUnifiedAgentConfigurations(
            ListUnifiedAgentConfigurationsRequest request) {
        Objects.requireNonNull(request.getCompartmentId(), "compartmentId is required");

        return clientCall(request, ListUnifiedAgentConfigurationsResponse::builder)
                .logger(LOG, "listUnifiedAgentConfigurations")
                .serviceDetails(
                        "LoggingManagement",
                        "ListUnifiedAgentConfigurations",
                        "https://docs.oracle.com/iaas/api/#/en/logging-management/20200531/UnifiedAgentConfiguration/ListUnifiedAgentConfigurations")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListUnifiedAgentConfigurationsRequest::builder)
                .basePath("/20200531")
                .appendPathParam("unifiedAgentConfigurations")
                .appendQueryParam("compartmentId", request.getCompartmentId())
                .appendQueryParam("logId", request.getLogId())
                .appendQueryParam("isCompartmentIdInSubtree", request.getIsCompartmentIdInSubtree())
                .appendQueryParam("groupId", request.getGroupId())
                .appendQueryParam("displayName", request.getDisplayName())
                .appendEnumQueryParam("lifecycleState", request.getLifecycleState())
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.logging.model.UnifiedAgentConfigurationCollection.class,
                        ListUnifiedAgentConfigurationsResponse.Builder
                                ::unifiedAgentConfigurationCollection)
                .handleResponseHeaderString(
                        "opc-next-page",
                        ListUnifiedAgentConfigurationsResponse.Builder::opcNextPage)
                .handleResponseHeaderString(
                        "opc-previous-page",
                        ListUnifiedAgentConfigurationsResponse.Builder::opcPreviousPage)
                .handleResponseHeaderString(
                        "opc-request-id",
                        ListUnifiedAgentConfigurationsResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public ListWorkRequestErrorsResponse listWorkRequestErrors(
            ListWorkRequestErrorsRequest request) {

        Validate.notBlank(request.getWorkRequestId(), "workRequestId must not be blank");

        return clientCall(request, ListWorkRequestErrorsResponse::builder)
                .logger(LOG, "listWorkRequestErrors")
                .serviceDetails(
                        "LoggingManagement",
                        "ListWorkRequestErrors",
                        "https://docs.oracle.com/iaas/api/#/en/logging-management/20200531/WorkRequestError/ListWorkRequestErrors")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListWorkRequestErrorsRequest::builder)
                .basePath("/20200531")
                .appendPathParam("workRequests")
                .appendPathParam(request.getWorkRequestId())
                .appendPathParam("errors")
                .appendQueryParam("page", request.getPage())
                .appendQueryParam("limit", request.getLimit())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBodyList(
                        com.oracle.bmc.logging.model.WorkRequestError.class,
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
                        "LoggingManagement",
                        "ListWorkRequestLogs",
                        "https://docs.oracle.com/iaas/api/#/en/logging-management/20200531/WorkRequestLog/ListWorkRequestLogs")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListWorkRequestLogsRequest::builder)
                .basePath("/20200531")
                .appendPathParam("workRequests")
                .appendPathParam(request.getWorkRequestId())
                .appendPathParam("logs")
                .appendQueryParam("page", request.getPage())
                .appendQueryParam("limit", request.getLimit())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBodyList(
                        com.oracle.bmc.logging.model.WorkRequestLog.class,
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
                        "LoggingManagement",
                        "ListWorkRequests",
                        "https://docs.oracle.com/iaas/api/#/en/logging-management/20200531/WorkRequest/ListWorkRequests")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListWorkRequestsRequest::builder)
                .basePath("/20200531")
                .appendPathParam("workRequests")
                .appendQueryParam("compartmentId", request.getCompartmentId())
                .appendEnumQueryParam("status", request.getStatus())
                .appendQueryParam("id", request.getId())
                .appendQueryParam("page", request.getPage())
                .appendQueryParam("limit", request.getLimit())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBodyList(
                        com.oracle.bmc.logging.model.WorkRequestSummary.class,
                        ListWorkRequestsResponse.Builder::items)
                .handleResponseHeaderString(
                        "opc-next-page", ListWorkRequestsResponse.Builder::opcNextPage)
                .handleResponseHeaderString(
                        "opc-previous-page", ListWorkRequestsResponse.Builder::opcPreviousPage)
                .handleResponseHeaderString(
                        "opc-request-id", ListWorkRequestsResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public UpdateLogResponse updateLog(UpdateLogRequest request) {

        Validate.notBlank(request.getLogGroupId(), "logGroupId must not be blank");

        Validate.notBlank(request.getLogId(), "logId must not be blank");
        Objects.requireNonNull(request.getUpdateLogDetails(), "updateLogDetails is required");

        return clientCall(request, UpdateLogResponse::builder)
                .logger(LOG, "updateLog")
                .serviceDetails(
                        "LoggingManagement",
                        "UpdateLog",
                        "https://docs.oracle.com/iaas/api/#/en/logging-management/20200531/Log/UpdateLog")
                .method(com.oracle.bmc.http.client.Method.PUT)
                .requestBuilder(UpdateLogRequest::builder)
                .basePath("/20200531")
                .appendPathParam("logGroups")
                .appendPathParam(request.getLogGroupId())
                .appendPathParam("logs")
                .appendPathParam(request.getLogId())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .hasBody()
                .handleResponseHeaderString(
                        "opc-work-request-id", UpdateLogResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", UpdateLogResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public UpdateLogGroupResponse updateLogGroup(UpdateLogGroupRequest request) {

        Validate.notBlank(request.getLogGroupId(), "logGroupId must not be blank");
        Objects.requireNonNull(
                request.getUpdateLogGroupDetails(), "updateLogGroupDetails is required");

        return clientCall(request, UpdateLogGroupResponse::builder)
                .logger(LOG, "updateLogGroup")
                .serviceDetails(
                        "LoggingManagement",
                        "UpdateLogGroup",
                        "https://docs.oracle.com/iaas/api/#/en/logging-management/20200531/LogGroup/UpdateLogGroup")
                .method(com.oracle.bmc.http.client.Method.PUT)
                .requestBuilder(UpdateLogGroupRequest::builder)
                .basePath("/20200531")
                .appendPathParam("logGroups")
                .appendPathParam(request.getLogGroupId())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .hasBody()
                .handleResponseHeaderString(
                        "opc-work-request-id", UpdateLogGroupResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", UpdateLogGroupResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public UpdateLogSavedSearchResponse updateLogSavedSearch(UpdateLogSavedSearchRequest request) {

        Validate.notBlank(request.getLogSavedSearchId(), "logSavedSearchId must not be blank");
        Objects.requireNonNull(
                request.getUpdateLogSavedSearchDetails(),
                "updateLogSavedSearchDetails is required");

        return clientCall(request, UpdateLogSavedSearchResponse::builder)
                .logger(LOG, "updateLogSavedSearch")
                .serviceDetails(
                        "LoggingManagement",
                        "UpdateLogSavedSearch",
                        "https://docs.oracle.com/iaas/api/#/en/logging-management/20200531/LogSavedSearch/UpdateLogSavedSearch")
                .method(com.oracle.bmc.http.client.Method.PUT)
                .requestBuilder(UpdateLogSavedSearchRequest::builder)
                .basePath("/20200531")
                .appendPathParam("logSavedSearches")
                .appendPathParam(request.getLogSavedSearchId())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.logging.model.LogSavedSearch.class,
                        UpdateLogSavedSearchResponse.Builder::logSavedSearch)
                .handleResponseHeaderString(
                        "opc-request-id", UpdateLogSavedSearchResponse.Builder::opcRequestId)
                .handleResponseHeaderString("etag", UpdateLogSavedSearchResponse.Builder::etag)
                .callSync();
    }

    @Override
    public UpdateUnifiedAgentConfigurationResponse updateUnifiedAgentConfiguration(
            UpdateUnifiedAgentConfigurationRequest request) {

        Validate.notBlank(
                request.getUnifiedAgentConfigurationId(),
                "unifiedAgentConfigurationId must not be blank");
        Objects.requireNonNull(
                request.getUpdateUnifiedAgentConfigurationDetails(),
                "updateUnifiedAgentConfigurationDetails is required");

        return clientCall(request, UpdateUnifiedAgentConfigurationResponse::builder)
                .logger(LOG, "updateUnifiedAgentConfiguration")
                .serviceDetails(
                        "LoggingManagement",
                        "UpdateUnifiedAgentConfiguration",
                        "https://docs.oracle.com/iaas/api/#/en/logging-management/20200531/UnifiedAgentConfiguration/UpdateUnifiedAgentConfiguration")
                .method(com.oracle.bmc.http.client.Method.PUT)
                .requestBuilder(UpdateUnifiedAgentConfigurationRequest::builder)
                .basePath("/20200531")
                .appendPathParam("unifiedAgentConfigurations")
                .appendPathParam(request.getUnifiedAgentConfigurationId())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .hasBody()
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        UpdateUnifiedAgentConfigurationResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id",
                        UpdateUnifiedAgentConfigurationResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public LoggingManagementWaiters getWaiters() {
        return waiters;
    }

    @Override
    public LoggingManagementPaginators getPaginators() {
        return paginators;
    }

    /**
     * Create a new client instance.
     *
     * @param authenticationDetailsProvider The authentication details (see {@link Builder#build})
     * @deprecated Use the {@link #builder() builder} instead.
     */
    @Deprecated
    public LoggingManagementClient(
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
    public LoggingManagementClient(
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
    public LoggingManagementClient(
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
    public LoggingManagementClient(
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
    public LoggingManagementClient(
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
    public LoggingManagementClient(
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
    public LoggingManagementClient(
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
    public LoggingManagementClient(
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
