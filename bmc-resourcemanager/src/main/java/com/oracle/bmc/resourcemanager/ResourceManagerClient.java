/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.resourcemanager;

import com.oracle.bmc.util.internal.Validate;
import com.oracle.bmc.resourcemanager.requests.*;
import com.oracle.bmc.resourcemanager.responses.*;
import com.oracle.bmc.circuitbreaker.CircuitBreakerConfiguration;
import com.oracle.bmc.util.CircuitBreakerUtils;

import java.util.Objects;

@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20180917")
public class ResourceManagerClient extends com.oracle.bmc.http.internal.BaseSyncClient
        implements ResourceManager {
    /** Service instance for ResourceManager. */
    public static final com.oracle.bmc.Service SERVICE =
            com.oracle.bmc.Services.serviceBuilder()
                    .serviceName("RESOURCEMANAGER")
                    .serviceEndpointPrefix("resourcemanager")
                    .serviceEndpointTemplate("https://resourcemanager.{region}.{secondLevelDomain}")
                    .build();

    private static final org.slf4j.Logger LOG =
            org.slf4j.LoggerFactory.getLogger(ResourceManagerClient.class);

    private final ResourceManagerWaiters waiters;

    private final ResourceManagerPaginators paginators;

    ResourceManagerClient(
            com.oracle.bmc.common.ClientBuilderBase<?, ?> builder,
            com.oracle.bmc.auth.AbstractAuthenticationDetailsProvider authenticationDetailsProvider,
            java.util.concurrent.ExecutorService executorService) {
        this(builder, authenticationDetailsProvider, executorService, true);
    }

    ResourceManagerClient(
            com.oracle.bmc.common.ClientBuilderBase<?, ?> builder,
            com.oracle.bmc.auth.AbstractAuthenticationDetailsProvider authenticationDetailsProvider,
            java.util.concurrent.ExecutorService executorService,
            boolean isStreamWarningEnabled) {
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
                                    .nameFormat("ResourceManager-waiters-%d")
                                    .build());
            threadPoolExecutor.allowCoreThreadTimeOut(true);

            executorService = threadPoolExecutor;
        }
        this.waiters = new ResourceManagerWaiters(executorService, this);

        this.paginators = new ResourceManagerPaginators(this);
        if (isStreamWarningEnabled && com.oracle.bmc.util.StreamUtils.isExtraStreamLogsEnabled()) {
            LOG.warn(
                    com.oracle.bmc.util.StreamUtils.getStreamWarningMessage(
                            "ResourceManagerClient",
                            "getJobTfConfig,getJobTfPlan,getJobTfState,getStackTfConfig,getStackTfState,getTemplateLogo,getTemplateTfConfig"));
        }
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
            extends com.oracle.bmc.common.RegionalClientBuilder<Builder, ResourceManagerClient> {
        private boolean isStreamWarningEnabled = true;
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
         * Enable/disable the stream warnings for the client
         *
         * @param isStreamWarningEnabled executorService
         * @return this builder
         */
        public Builder isStreamWarningEnabled(boolean isStreamWarningEnabled) {
            this.isStreamWarningEnabled = isStreamWarningEnabled;
            return this;
        }

        /**
         * Build the client.
         *
         * @param authenticationDetailsProvider authentication details provider
         * @return the client
         */
        public ResourceManagerClient build(
                @jakarta.annotation.Nonnull
                        com.oracle.bmc.auth.AbstractAuthenticationDetailsProvider
                                authenticationDetailsProvider) {
            return new ResourceManagerClient(
                    this, authenticationDetailsProvider, executorService, isStreamWarningEnabled);
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
    public CancelJobResponse cancelJob(CancelJobRequest request) {

        Validate.notBlank(request.getJobId(), "jobId must not be blank");

        return clientCall(request, CancelJobResponse::builder)
                .logger(LOG, "cancelJob")
                .serviceDetails(
                        "ResourceManager",
                        "CancelJob",
                        "https://docs.oracle.com/iaas/api/#/en/resourcemanager/20180917/Job/CancelJob")
                .method(com.oracle.bmc.http.client.Method.DELETE)
                .requestBuilder(CancelJobRequest::builder)
                .basePath("/20180917")
                .appendPathParam("jobs")
                .appendPathParam(request.getJobId())
                .appendQueryParam("isForced", request.getIsForced())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("if-match", request.getIfMatch())
                .handleResponseHeaderString(
                        "opc-request-id", CancelJobResponse.Builder::opcRequestId)
                .operationUsesDefaultRetries()
                .callSync();
    }

    @Override
    public ChangeConfigurationSourceProviderCompartmentResponse
            changeConfigurationSourceProviderCompartment(
                    ChangeConfigurationSourceProviderCompartmentRequest request) {

        Validate.notBlank(
                request.getConfigurationSourceProviderId(),
                "configurationSourceProviderId must not be blank");
        Objects.requireNonNull(
                request.getChangeConfigurationSourceProviderCompartmentDetails(),
                "changeConfigurationSourceProviderCompartmentDetails is required");

        return clientCall(request, ChangeConfigurationSourceProviderCompartmentResponse::builder)
                .logger(LOG, "changeConfigurationSourceProviderCompartment")
                .serviceDetails(
                        "ResourceManager",
                        "ChangeConfigurationSourceProviderCompartment",
                        "https://docs.oracle.com/iaas/api/#/en/resourcemanager/20180917/ConfigurationSourceProvider/ChangeConfigurationSourceProviderCompartment")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(ChangeConfigurationSourceProviderCompartmentRequest::builder)
                .basePath("/20180917")
                .appendPathParam("configurationSourceProviders")
                .appendPathParam(request.getConfigurationSourceProviderId())
                .appendPathParam("actions")
                .appendPathParam("changeCompartment")
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .hasBody()
                .handleResponseHeaderString(
                        "opc-request-id",
                        ChangeConfigurationSourceProviderCompartmentResponse.Builder::opcRequestId)
                .operationUsesDefaultRetries()
                .callSync();
    }

    @Override
    public ChangePrivateEndpointCompartmentResponse changePrivateEndpointCompartment(
            ChangePrivateEndpointCompartmentRequest request) {

        Validate.notBlank(request.getPrivateEndpointId(), "privateEndpointId must not be blank");
        Objects.requireNonNull(
                request.getChangePrivateEndpointCompartmentDetails(),
                "changePrivateEndpointCompartmentDetails is required");

        return clientCall(request, ChangePrivateEndpointCompartmentResponse::builder)
                .logger(LOG, "changePrivateEndpointCompartment")
                .serviceDetails(
                        "ResourceManager",
                        "ChangePrivateEndpointCompartment",
                        "https://docs.oracle.com/iaas/api/#/en/resourcemanager/20180917/PrivateEndpoint/ChangePrivateEndpointCompartment")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(ChangePrivateEndpointCompartmentRequest::builder)
                .basePath("/20180917")
                .appendPathParam("privateEndpoints")
                .appendPathParam(request.getPrivateEndpointId())
                .appendPathParam("actions")
                .appendPathParam("changeCompartment")
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .hasBody()
                .handleResponseHeaderString(
                        "opc-request-id",
                        ChangePrivateEndpointCompartmentResponse.Builder::opcRequestId)
                .operationUsesDefaultRetries()
                .callSync();
    }

    @Override
    public ChangeStackCompartmentResponse changeStackCompartment(
            ChangeStackCompartmentRequest request) {

        Validate.notBlank(request.getStackId(), "stackId must not be blank");
        Objects.requireNonNull(
                request.getChangeStackCompartmentDetails(),
                "changeStackCompartmentDetails is required");

        return clientCall(request, ChangeStackCompartmentResponse::builder)
                .logger(LOG, "changeStackCompartment")
                .serviceDetails(
                        "ResourceManager",
                        "ChangeStackCompartment",
                        "https://docs.oracle.com/iaas/api/#/en/resourcemanager/20180917/Stack/ChangeStackCompartment")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(ChangeStackCompartmentRequest::builder)
                .basePath("/20180917")
                .appendPathParam("stacks")
                .appendPathParam(request.getStackId())
                .appendPathParam("actions")
                .appendPathParam("changeCompartment")
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .hasBody()
                .handleResponseHeaderString(
                        "opc-request-id", ChangeStackCompartmentResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        ChangeStackCompartmentResponse.Builder::opcWorkRequestId)
                .operationUsesDefaultRetries()
                .callSync();
    }

    @Override
    public ChangeTemplateCompartmentResponse changeTemplateCompartment(
            ChangeTemplateCompartmentRequest request) {

        Validate.notBlank(request.getTemplateId(), "templateId must not be blank");
        Objects.requireNonNull(
                request.getChangeTemplateCompartmentDetails(),
                "changeTemplateCompartmentDetails is required");

        return clientCall(request, ChangeTemplateCompartmentResponse::builder)
                .logger(LOG, "changeTemplateCompartment")
                .serviceDetails(
                        "ResourceManager",
                        "ChangeTemplateCompartment",
                        "https://docs.oracle.com/iaas/api/#/en/resourcemanager/20180917/Template/ChangeTemplateCompartment")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(ChangeTemplateCompartmentRequest::builder)
                .basePath("/20180917")
                .appendPathParam("templates")
                .appendPathParam(request.getTemplateId())
                .appendPathParam("actions")
                .appendPathParam("changeCompartment")
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .hasBody()
                .handleResponseHeaderString(
                        "opc-request-id", ChangeTemplateCompartmentResponse.Builder::opcRequestId)
                .operationUsesDefaultRetries()
                .callSync();
    }

    @Override
    public CreateConfigurationSourceProviderResponse createConfigurationSourceProvider(
            CreateConfigurationSourceProviderRequest request) {
        Objects.requireNonNull(
                request.getCreateConfigurationSourceProviderDetails(),
                "createConfigurationSourceProviderDetails is required");

        return clientCall(request, CreateConfigurationSourceProviderResponse::builder)
                .logger(LOG, "createConfigurationSourceProvider")
                .serviceDetails(
                        "ResourceManager",
                        "CreateConfigurationSourceProvider",
                        "https://docs.oracle.com/iaas/api/#/en/resourcemanager/20180917/ConfigurationSourceProvider/CreateConfigurationSourceProvider")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(CreateConfigurationSourceProviderRequest::builder)
                .basePath("/20180917")
                .appendPathParam("configurationSourceProviders")
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.resourcemanager.model.ConfigurationSourceProvider.class,
                        CreateConfigurationSourceProviderResponse.Builder
                                ::configurationSourceProvider)
                .handleResponseHeaderString(
                        "opc-request-id",
                        CreateConfigurationSourceProviderResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "etag", CreateConfigurationSourceProviderResponse.Builder::etag)
                .operationUsesDefaultRetries()
                .callSync();
    }

    @Override
    public CreateJobResponse createJob(CreateJobRequest request) {
        Objects.requireNonNull(request.getCreateJobDetails(), "createJobDetails is required");

        return clientCall(request, CreateJobResponse::builder)
                .logger(LOG, "createJob")
                .serviceDetails(
                        "ResourceManager",
                        "CreateJob",
                        "https://docs.oracle.com/iaas/api/#/en/resourcemanager/20180917/Job/CreateJob")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(CreateJobRequest::builder)
                .basePath("/20180917")
                .appendPathParam("jobs")
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.resourcemanager.model.Job.class,
                        CreateJobResponse.Builder::job)
                .handleResponseHeaderString(
                        "opc-request-id", CreateJobResponse.Builder::opcRequestId)
                .handleResponseHeaderString("etag", CreateJobResponse.Builder::etag)
                .operationUsesDefaultRetries()
                .callSync();
    }

    @Override
    public CreatePrivateEndpointResponse createPrivateEndpoint(
            CreatePrivateEndpointRequest request) {
        Objects.requireNonNull(
                request.getCreatePrivateEndpointDetails(),
                "createPrivateEndpointDetails is required");

        return clientCall(request, CreatePrivateEndpointResponse::builder)
                .logger(LOG, "createPrivateEndpoint")
                .serviceDetails(
                        "ResourceManager",
                        "CreatePrivateEndpoint",
                        "https://docs.oracle.com/iaas/api/#/en/resourcemanager/20180917/PrivateEndpoint/CreatePrivateEndpoint")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(CreatePrivateEndpointRequest::builder)
                .basePath("/20180917")
                .appendPathParam("privateEndpoints")
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.resourcemanager.model.PrivateEndpoint.class,
                        CreatePrivateEndpointResponse.Builder::privateEndpoint)
                .handleResponseHeaderString(
                        "opc-request-id", CreatePrivateEndpointResponse.Builder::opcRequestId)
                .handleResponseHeaderString("etag", CreatePrivateEndpointResponse.Builder::etag)
                .operationUsesDefaultRetries()
                .callSync();
    }

    @Override
    public CreateStackResponse createStack(CreateStackRequest request) {
        Objects.requireNonNull(request.getCreateStackDetails(), "createStackDetails is required");

        return clientCall(request, CreateStackResponse::builder)
                .logger(LOG, "createStack")
                .serviceDetails(
                        "ResourceManager",
                        "CreateStack",
                        "https://docs.oracle.com/iaas/api/#/en/resourcemanager/20180917/Stack/CreateStack")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(CreateStackRequest::builder)
                .basePath("/20180917")
                .appendPathParam("stacks")
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.resourcemanager.model.Stack.class,
                        CreateStackResponse.Builder::stack)
                .handleResponseHeaderString(
                        "opc-request-id", CreateStackResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-work-request-id", CreateStackResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString("etag", CreateStackResponse.Builder::etag)
                .operationUsesDefaultRetries()
                .callSync();
    }

    @Override
    public CreateTemplateResponse createTemplate(CreateTemplateRequest request) {
        Objects.requireNonNull(
                request.getCreateTemplateDetails(), "createTemplateDetails is required");

        return clientCall(request, CreateTemplateResponse::builder)
                .logger(LOG, "createTemplate")
                .serviceDetails(
                        "ResourceManager",
                        "CreateTemplate",
                        "https://docs.oracle.com/iaas/api/#/en/resourcemanager/20180917/Template/CreateTemplate")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(CreateTemplateRequest::builder)
                .basePath("/20180917")
                .appendPathParam("templates")
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.resourcemanager.model.Template.class,
                        CreateTemplateResponse.Builder::template)
                .handleResponseHeaderString(
                        "opc-request-id", CreateTemplateResponse.Builder::opcRequestId)
                .handleResponseHeaderString("etag", CreateTemplateResponse.Builder::etag)
                .operationUsesDefaultRetries()
                .callSync();
    }

    @Override
    public DeleteConfigurationSourceProviderResponse deleteConfigurationSourceProvider(
            DeleteConfigurationSourceProviderRequest request) {

        Validate.notBlank(
                request.getConfigurationSourceProviderId(),
                "configurationSourceProviderId must not be blank");

        return clientCall(request, DeleteConfigurationSourceProviderResponse::builder)
                .logger(LOG, "deleteConfigurationSourceProvider")
                .serviceDetails(
                        "ResourceManager",
                        "DeleteConfigurationSourceProvider",
                        "https://docs.oracle.com/iaas/api/#/en/resourcemanager/20180917/ConfigurationSourceProvider/DeleteConfigurationSourceProvider")
                .method(com.oracle.bmc.http.client.Method.DELETE)
                .requestBuilder(DeleteConfigurationSourceProviderRequest::builder)
                .basePath("/20180917")
                .appendPathParam("configurationSourceProviders")
                .appendPathParam(request.getConfigurationSourceProviderId())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("if-match", request.getIfMatch())
                .handleResponseHeaderString(
                        "opc-request-id",
                        DeleteConfigurationSourceProviderResponse.Builder::opcRequestId)
                .operationUsesDefaultRetries()
                .callSync();
    }

    @Override
    public DeletePrivateEndpointResponse deletePrivateEndpoint(
            DeletePrivateEndpointRequest request) {

        Validate.notBlank(request.getPrivateEndpointId(), "privateEndpointId must not be blank");

        return clientCall(request, DeletePrivateEndpointResponse::builder)
                .logger(LOG, "deletePrivateEndpoint")
                .serviceDetails(
                        "ResourceManager",
                        "DeletePrivateEndpoint",
                        "https://docs.oracle.com/iaas/api/#/en/resourcemanager/20180917/PrivateEndpoint/DeletePrivateEndpoint")
                .method(com.oracle.bmc.http.client.Method.DELETE)
                .requestBuilder(DeletePrivateEndpointRequest::builder)
                .basePath("/20180917")
                .appendPathParam("privateEndpoints")
                .appendPathParam(request.getPrivateEndpointId())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("if-match", request.getIfMatch())
                .handleResponseHeaderString(
                        "opc-request-id", DeletePrivateEndpointResponse.Builder::opcRequestId)
                .operationUsesDefaultRetries()
                .callSync();
    }

    @Override
    public DeleteStackResponse deleteStack(DeleteStackRequest request) {

        Validate.notBlank(request.getStackId(), "stackId must not be blank");

        return clientCall(request, DeleteStackResponse::builder)
                .logger(LOG, "deleteStack")
                .serviceDetails(
                        "ResourceManager",
                        "DeleteStack",
                        "https://docs.oracle.com/iaas/api/#/en/resourcemanager/20180917/Stack/DeleteStack")
                .method(com.oracle.bmc.http.client.Method.DELETE)
                .requestBuilder(DeleteStackRequest::builder)
                .basePath("/20180917")
                .appendPathParam("stacks")
                .appendPathParam(request.getStackId())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("if-match", request.getIfMatch())
                .handleResponseHeaderString(
                        "opc-request-id", DeleteStackResponse.Builder::opcRequestId)
                .operationUsesDefaultRetries()
                .callSync();
    }

    @Override
    public DeleteTemplateResponse deleteTemplate(DeleteTemplateRequest request) {

        Validate.notBlank(request.getTemplateId(), "templateId must not be blank");

        return clientCall(request, DeleteTemplateResponse::builder)
                .logger(LOG, "deleteTemplate")
                .serviceDetails(
                        "ResourceManager",
                        "DeleteTemplate",
                        "https://docs.oracle.com/iaas/api/#/en/resourcemanager/20180917/Template/DeleteTemplate")
                .method(com.oracle.bmc.http.client.Method.DELETE)
                .requestBuilder(DeleteTemplateRequest::builder)
                .basePath("/20180917")
                .appendPathParam("templates")
                .appendPathParam(request.getTemplateId())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("if-match", request.getIfMatch())
                .handleResponseHeaderString(
                        "opc-request-id", DeleteTemplateResponse.Builder::opcRequestId)
                .operationUsesDefaultRetries()
                .callSync();
    }

    @Override
    public DetectStackDriftResponse detectStackDrift(DetectStackDriftRequest request) {

        Validate.notBlank(request.getStackId(), "stackId must not be blank");

        return clientCall(request, DetectStackDriftResponse::builder)
                .logger(LOG, "detectStackDrift")
                .serviceDetails(
                        "ResourceManager",
                        "DetectStackDrift",
                        "https://docs.oracle.com/iaas/api/#/en/resourcemanager/20180917/Stack/DetectStackDrift")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(DetectStackDriftRequest::builder)
                .basePath("/20180917")
                .appendPathParam("stacks")
                .appendPathParam(request.getStackId())
                .appendPathParam("actions")
                .appendPathParam("detectDrift")
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .hasBody()
                .handleResponseHeaderString(
                        "opc-request-id", DetectStackDriftResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-work-request-id", DetectStackDriftResponse.Builder::opcWorkRequestId)
                .operationUsesDefaultRetries()
                .callSync();
    }

    @Override
    public GetConfigurationSourceProviderResponse getConfigurationSourceProvider(
            GetConfigurationSourceProviderRequest request) {

        Validate.notBlank(
                request.getConfigurationSourceProviderId(),
                "configurationSourceProviderId must not be blank");

        return clientCall(request, GetConfigurationSourceProviderResponse::builder)
                .logger(LOG, "getConfigurationSourceProvider")
                .serviceDetails(
                        "ResourceManager",
                        "GetConfigurationSourceProvider",
                        "https://docs.oracle.com/iaas/api/#/en/resourcemanager/20180917/ConfigurationSourceProvider/GetConfigurationSourceProvider")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetConfigurationSourceProviderRequest::builder)
                .basePath("/20180917")
                .appendPathParam("configurationSourceProviders")
                .appendPathParam(request.getConfigurationSourceProviderId())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.resourcemanager.model.ConfigurationSourceProvider.class,
                        GetConfigurationSourceProviderResponse.Builder::configurationSourceProvider)
                .handleResponseHeaderString(
                        "opc-request-id",
                        GetConfigurationSourceProviderResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "etag", GetConfigurationSourceProviderResponse.Builder::etag)
                .operationUsesDefaultRetries()
                .callSync();
    }

    @Override
    public GetJobResponse getJob(GetJobRequest request) {

        Validate.notBlank(request.getJobId(), "jobId must not be blank");

        return clientCall(request, GetJobResponse::builder)
                .logger(LOG, "getJob")
                .serviceDetails(
                        "ResourceManager",
                        "GetJob",
                        "https://docs.oracle.com/iaas/api/#/en/resourcemanager/20180917/Job/GetJob")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetJobRequest::builder)
                .basePath("/20180917")
                .appendPathParam("jobs")
                .appendPathParam(request.getJobId())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.resourcemanager.model.Job.class, GetJobResponse.Builder::job)
                .handleResponseHeaderString("opc-request-id", GetJobResponse.Builder::opcRequestId)
                .handleResponseHeaderString("etag", GetJobResponse.Builder::etag)
                .operationUsesDefaultRetries()
                .callSync();
    }

    @Override
    public GetJobDetailedLogContentResponse getJobDetailedLogContent(
            GetJobDetailedLogContentRequest request) {

        Validate.notBlank(request.getJobId(), "jobId must not be blank");

        return clientCall(request, GetJobDetailedLogContentResponse::builder)
                .logger(LOG, "getJobDetailedLogContent")
                .serviceDetails(
                        "ResourceManager",
                        "GetJobDetailedLogContent",
                        "https://docs.oracle.com/iaas/api/#/en/resourcemanager/20180917/Job/GetJobDetailedLogContent")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetJobDetailedLogContentRequest::builder)
                .basePath("/20180917")
                .appendPathParam("jobs")
                .appendPathParam(request.getJobId())
                .appendPathParam("detailedLogContent")
                .accept("text/plain; charset=utf-8")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(String.class, GetJobDetailedLogContentResponse.Builder::value)
                .handleResponseHeaderString(
                        "opc-request-id", GetJobDetailedLogContentResponse.Builder::opcRequestId)
                .operationUsesDefaultRetries()
                .callSync();
    }

    @Override
    public GetJobLogsResponse getJobLogs(GetJobLogsRequest request) {

        Validate.notBlank(request.getJobId(), "jobId must not be blank");

        return clientCall(request, GetJobLogsResponse::builder)
                .logger(LOG, "getJobLogs")
                .serviceDetails(
                        "ResourceManager",
                        "GetJobLogs",
                        "https://docs.oracle.com/iaas/api/#/en/resourcemanager/20180917/Job/GetJobLogs")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetJobLogsRequest::builder)
                .basePath("/20180917")
                .appendPathParam("jobs")
                .appendPathParam(request.getJobId())
                .appendPathParam("logs")
                .appendListQueryParam(
                        "type",
                        request.getType(),
                        com.oracle.bmc.util.internal.CollectionFormatType.Multi)
                .appendEnumQueryParam(
                        "levelGreaterThanOrEqualTo", request.getLevelGreaterThanOrEqualTo())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .appendQueryParam(
                        "timestampGreaterThanOrEqualTo", request.getTimestampGreaterThanOrEqualTo())
                .appendQueryParam(
                        "timestampLessThanOrEqualTo", request.getTimestampLessThanOrEqualTo())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBodyList(
                        com.oracle.bmc.resourcemanager.model.LogEntry.class,
                        GetJobLogsResponse.Builder::items)
                .handleResponseHeaderString(
                        "opc-request-id", GetJobLogsResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", GetJobLogsResponse.Builder::opcNextPage)
                .operationUsesDefaultRetries()
                .callSync();
    }

    @Override
    public GetJobLogsContentResponse getJobLogsContent(GetJobLogsContentRequest request) {

        Validate.notBlank(request.getJobId(), "jobId must not be blank");

        return clientCall(request, GetJobLogsContentResponse::builder)
                .logger(LOG, "getJobLogsContent")
                .serviceDetails(
                        "ResourceManager",
                        "GetJobLogsContent",
                        "https://docs.oracle.com/iaas/api/#/en/resourcemanager/20180917/Job/GetJobLogsContent")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetJobLogsContentRequest::builder)
                .basePath("/20180917")
                .appendPathParam("jobs")
                .appendPathParam(request.getJobId())
                .appendPathParam("logs")
                .appendPathParam("content")
                .accept("text/plain; charset=utf-8")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(String.class, GetJobLogsContentResponse.Builder::value)
                .handleResponseHeaderString(
                        "opc-request-id", GetJobLogsContentResponse.Builder::opcRequestId)
                .operationUsesDefaultRetries()
                .callSync();
    }

    @Override
    public GetJobTfConfigResponse getJobTfConfig(GetJobTfConfigRequest request) {

        Validate.notBlank(request.getJobId(), "jobId must not be blank");

        return clientCall(request, GetJobTfConfigResponse::builder)
                .logger(LOG, "getJobTfConfig")
                .serviceDetails(
                        "ResourceManager",
                        "GetJobTfConfig",
                        "https://docs.oracle.com/iaas/api/#/en/resourcemanager/20180917/Job/GetJobTfConfig")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetJobTfConfigRequest::builder)
                .basePath("/20180917")
                .appendPathParam("jobs")
                .appendPathParam(request.getJobId())
                .appendPathParam("tfConfig")
                .accept("application/zip")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(java.io.InputStream.class, GetJobTfConfigResponse.Builder::inputStream)
                .handleResponseHeaderString(
                        "opc-request-id", GetJobTfConfigResponse.Builder::opcRequestId)
                .operationUsesDefaultRetries()
                .callSync();
    }

    @Override
    public GetJobTfPlanResponse getJobTfPlan(GetJobTfPlanRequest request) {

        Validate.notBlank(request.getJobId(), "jobId must not be blank");

        return clientCall(request, GetJobTfPlanResponse::builder)
                .logger(LOG, "getJobTfPlan")
                .serviceDetails(
                        "ResourceManager",
                        "GetJobTfPlan",
                        "https://docs.oracle.com/iaas/api/#/en/resourcemanager/20180917/Job/GetJobTfPlan")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetJobTfPlanRequest::builder)
                .basePath("/20180917")
                .appendPathParam("jobs")
                .appendPathParam(request.getJobId())
                .appendPathParam("tfPlan")
                .appendEnumQueryParam("tfPlanFormat", request.getTfPlanFormat())
                .accept("application/octet-stream")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(java.io.InputStream.class, GetJobTfPlanResponse.Builder::inputStream)
                .handleResponseHeaderString(
                        "opc-request-id", GetJobTfPlanResponse.Builder::opcRequestId)
                .operationUsesDefaultRetries()
                .callSync();
    }

    @Override
    public GetJobTfStateResponse getJobTfState(GetJobTfStateRequest request) {

        Validate.notBlank(request.getJobId(), "jobId must not be blank");

        return clientCall(request, GetJobTfStateResponse::builder)
                .logger(LOG, "getJobTfState")
                .serviceDetails(
                        "ResourceManager",
                        "GetJobTfState",
                        "https://docs.oracle.com/iaas/api/#/en/resourcemanager/20180917/Job/GetJobTfState")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetJobTfStateRequest::builder)
                .basePath("/20180917")
                .appendPathParam("jobs")
                .appendPathParam(request.getJobId())
                .appendPathParam("tfState")
                .accept("application/octet-stream")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(java.io.InputStream.class, GetJobTfStateResponse.Builder::inputStream)
                .handleResponseHeaderString(
                        "opc-request-id", GetJobTfStateResponse.Builder::opcRequestId)
                .operationUsesDefaultRetries()
                .callSync();
    }

    @Override
    public GetPrivateEndpointResponse getPrivateEndpoint(GetPrivateEndpointRequest request) {

        Validate.notBlank(request.getPrivateEndpointId(), "privateEndpointId must not be blank");

        return clientCall(request, GetPrivateEndpointResponse::builder)
                .logger(LOG, "getPrivateEndpoint")
                .serviceDetails(
                        "ResourceManager",
                        "GetPrivateEndpoint",
                        "https://docs.oracle.com/iaas/api/#/en/resourcemanager/20180917/PrivateEndpoint/GetPrivateEndpoint")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetPrivateEndpointRequest::builder)
                .basePath("/20180917")
                .appendPathParam("privateEndpoints")
                .appendPathParam(request.getPrivateEndpointId())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.resourcemanager.model.PrivateEndpoint.class,
                        GetPrivateEndpointResponse.Builder::privateEndpoint)
                .handleResponseHeaderString(
                        "opc-request-id", GetPrivateEndpointResponse.Builder::opcRequestId)
                .handleResponseHeaderString("etag", GetPrivateEndpointResponse.Builder::etag)
                .operationUsesDefaultRetries()
                .callSync();
    }

    @Override
    public GetReachableIpResponse getReachableIp(GetReachableIpRequest request) {
        Objects.requireNonNull(request.getPrivateIp(), "privateIp is required");

        Validate.notBlank(request.getPrivateEndpointId(), "privateEndpointId must not be blank");

        return clientCall(request, GetReachableIpResponse::builder)
                .logger(LOG, "getReachableIp")
                .serviceDetails(
                        "ResourceManager",
                        "GetReachableIp",
                        "https://docs.oracle.com/iaas/api/#/en/resourcemanager/20180917/ReachableIp/GetReachableIp")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetReachableIpRequest::builder)
                .basePath("/20180917")
                .appendPathParam("privateEndpoints")
                .appendPathParam(request.getPrivateEndpointId())
                .appendPathParam("reachableIp")
                .appendQueryParam("privateIp", request.getPrivateIp())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .handleBody(
                        com.oracle.bmc.resourcemanager.model.ReachableIp.class,
                        GetReachableIpResponse.Builder::reachableIp)
                .handleResponseHeaderString(
                        "opc-request-id", GetReachableIpResponse.Builder::opcRequestId)
                .operationUsesDefaultRetries()
                .callSync();
    }

    @Override
    public GetStackResponse getStack(GetStackRequest request) {

        Validate.notBlank(request.getStackId(), "stackId must not be blank");

        return clientCall(request, GetStackResponse::builder)
                .logger(LOG, "getStack")
                .serviceDetails(
                        "ResourceManager",
                        "GetStack",
                        "https://docs.oracle.com/iaas/api/#/en/resourcemanager/20180917/Stack/GetStack")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetStackRequest::builder)
                .basePath("/20180917")
                .appendPathParam("stacks")
                .appendPathParam(request.getStackId())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.resourcemanager.model.Stack.class,
                        GetStackResponse.Builder::stack)
                .handleResponseHeaderString(
                        "opc-request-id", GetStackResponse.Builder::opcRequestId)
                .handleResponseHeaderString("etag", GetStackResponse.Builder::etag)
                .operationUsesDefaultRetries()
                .callSync();
    }

    @Override
    public GetStackTfConfigResponse getStackTfConfig(GetStackTfConfigRequest request) {

        Validate.notBlank(request.getStackId(), "stackId must not be blank");

        return clientCall(request, GetStackTfConfigResponse::builder)
                .logger(LOG, "getStackTfConfig")
                .serviceDetails(
                        "ResourceManager",
                        "GetStackTfConfig",
                        "https://docs.oracle.com/iaas/api/#/en/resourcemanager/20180917/Stack/GetStackTfConfig")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetStackTfConfigRequest::builder)
                .basePath("/20180917")
                .appendPathParam("stacks")
                .appendPathParam(request.getStackId())
                .appendPathParam("tfConfig")
                .accept("application/zip")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        java.io.InputStream.class, GetStackTfConfigResponse.Builder::inputStream)
                .handleResponseHeaderString(
                        "opc-request-id", GetStackTfConfigResponse.Builder::opcRequestId)
                .operationUsesDefaultRetries()
                .callSync();
    }

    @Override
    public GetStackTfStateResponse getStackTfState(GetStackTfStateRequest request) {

        Validate.notBlank(request.getStackId(), "stackId must not be blank");

        return clientCall(request, GetStackTfStateResponse::builder)
                .logger(LOG, "getStackTfState")
                .serviceDetails(
                        "ResourceManager",
                        "GetStackTfState",
                        "https://docs.oracle.com/iaas/api/#/en/resourcemanager/20180917/Stack/GetStackTfState")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetStackTfStateRequest::builder)
                .basePath("/20180917")
                .appendPathParam("stacks")
                .appendPathParam(request.getStackId())
                .appendPathParam("tfState")
                .accept("application/octet-stream")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(java.io.InputStream.class, GetStackTfStateResponse.Builder::inputStream)
                .handleResponseHeaderString(
                        "opc-request-id", GetStackTfStateResponse.Builder::opcRequestId)
                .operationUsesDefaultRetries()
                .callSync();
    }

    @Override
    public GetTemplateResponse getTemplate(GetTemplateRequest request) {

        Validate.notBlank(request.getTemplateId(), "templateId must not be blank");

        return clientCall(request, GetTemplateResponse::builder)
                .logger(LOG, "getTemplate")
                .serviceDetails(
                        "ResourceManager",
                        "GetTemplate",
                        "https://docs.oracle.com/iaas/api/#/en/resourcemanager/20180917/Template/GetTemplate")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetTemplateRequest::builder)
                .basePath("/20180917")
                .appendPathParam("templates")
                .appendPathParam(request.getTemplateId())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.resourcemanager.model.Template.class,
                        GetTemplateResponse.Builder::template)
                .handleResponseHeaderString(
                        "opc-request-id", GetTemplateResponse.Builder::opcRequestId)
                .handleResponseHeaderString("etag", GetTemplateResponse.Builder::etag)
                .operationUsesDefaultRetries()
                .callSync();
    }

    @Override
    public GetTemplateLogoResponse getTemplateLogo(GetTemplateLogoRequest request) {

        Validate.notBlank(request.getTemplateId(), "templateId must not be blank");

        return clientCall(request, GetTemplateLogoResponse::builder)
                .logger(LOG, "getTemplateLogo")
                .serviceDetails(
                        "ResourceManager",
                        "GetTemplateLogo",
                        "https://docs.oracle.com/iaas/api/#/en/resourcemanager/20180917/Template/GetTemplateLogo")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetTemplateLogoRequest::builder)
                .basePath("/20180917")
                .appendPathParam("templates")
                .appendPathParam(request.getTemplateId())
                .appendPathParam("logo")
                .accept("image/png")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(java.io.InputStream.class, GetTemplateLogoResponse.Builder::inputStream)
                .handleResponseHeaderString(
                        "opc-request-id", GetTemplateLogoResponse.Builder::opcRequestId)
                .operationUsesDefaultRetries()
                .callSync();
    }

    @Override
    public GetTemplateTfConfigResponse getTemplateTfConfig(GetTemplateTfConfigRequest request) {

        Validate.notBlank(request.getTemplateId(), "templateId must not be blank");

        return clientCall(request, GetTemplateTfConfigResponse::builder)
                .logger(LOG, "getTemplateTfConfig")
                .serviceDetails(
                        "ResourceManager",
                        "GetTemplateTfConfig",
                        "https://docs.oracle.com/iaas/api/#/en/resourcemanager/20180917/Template/GetTemplateTfConfig")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetTemplateTfConfigRequest::builder)
                .basePath("/20180917")
                .appendPathParam("templates")
                .appendPathParam(request.getTemplateId())
                .appendPathParam("tfConfig")
                .accept("application/zip")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        java.io.InputStream.class, GetTemplateTfConfigResponse.Builder::inputStream)
                .handleResponseHeaderString(
                        "opc-request-id", GetTemplateTfConfigResponse.Builder::opcRequestId)
                .operationUsesDefaultRetries()
                .callSync();
    }

    @Override
    public GetWorkRequestResponse getWorkRequest(GetWorkRequestRequest request) {

        Validate.notBlank(request.getWorkRequestId(), "workRequestId must not be blank");

        return clientCall(request, GetWorkRequestResponse::builder)
                .logger(LOG, "getWorkRequest")
                .serviceDetails(
                        "ResourceManager",
                        "GetWorkRequest",
                        "https://docs.oracle.com/iaas/api/#/en/resourcemanager/20180917/WorkRequest/GetWorkRequest")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetWorkRequestRequest::builder)
                .basePath("/20180917")
                .appendPathParam("workRequests")
                .appendPathParam(request.getWorkRequestId())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.resourcemanager.model.WorkRequest.class,
                        GetWorkRequestResponse.Builder::workRequest)
                .handleResponseHeaderString(
                        "opc-request-id", GetWorkRequestResponse.Builder::opcRequestId)
                .operationUsesDefaultRetries()
                .callSync();
    }

    @Override
    public ListConfigurationSourceProvidersResponse listConfigurationSourceProviders(
            ListConfigurationSourceProvidersRequest request) {

        return clientCall(request, ListConfigurationSourceProvidersResponse::builder)
                .logger(LOG, "listConfigurationSourceProviders")
                .serviceDetails(
                        "ResourceManager",
                        "ListConfigurationSourceProviders",
                        "https://docs.oracle.com/iaas/api/#/en/resourcemanager/20180917/ConfigurationSourceProviderSummary/ListConfigurationSourceProviders")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListConfigurationSourceProvidersRequest::builder)
                .basePath("/20180917")
                .appendPathParam("configurationSourceProviders")
                .appendQueryParam("compartmentId", request.getCompartmentId())
                .appendQueryParam(
                        "configurationSourceProviderId", request.getConfigurationSourceProviderId())
                .appendQueryParam("displayName", request.getDisplayName())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .appendQueryParam("configSourceProviderType", request.getConfigSourceProviderType())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.resourcemanager.model.ConfigurationSourceProviderCollection
                                .class,
                        ListConfigurationSourceProvidersResponse.Builder
                                ::configurationSourceProviderCollection)
                .handleResponseHeaderString(
                        "opc-request-id",
                        ListConfigurationSourceProvidersResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page",
                        ListConfigurationSourceProvidersResponse.Builder::opcNextPage)
                .operationUsesDefaultRetries()
                .callSync();
    }

    @Override
    public ListJobAssociatedResourcesResponse listJobAssociatedResources(
            ListJobAssociatedResourcesRequest request) {

        Validate.notBlank(request.getJobId(), "jobId must not be blank");

        return clientCall(request, ListJobAssociatedResourcesResponse::builder)
                .logger(LOG, "listJobAssociatedResources")
                .serviceDetails(
                        "ResourceManager",
                        "ListJobAssociatedResources",
                        "https://docs.oracle.com/iaas/api/#/en/resourcemanager/20180917/AssociatedResourceSummary/ListJobAssociatedResources")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListJobAssociatedResourcesRequest::builder)
                .basePath("/20180917")
                .appendPathParam("jobs")
                .appendPathParam(request.getJobId())
                .appendPathParam("associatedResources")
                .appendQueryParam("compartmentId", request.getCompartmentId())
                .appendQueryParam("terraformResourceType", request.getTerraformResourceType())
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.resourcemanager.model.AssociatedResourcesCollection.class,
                        ListJobAssociatedResourcesResponse.Builder::associatedResourcesCollection)
                .handleResponseHeaderString(
                        "opc-request-id", ListJobAssociatedResourcesResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListJobAssociatedResourcesResponse.Builder::opcNextPage)
                .operationUsesDefaultRetries()
                .callSync();
    }

    @Override
    public ListJobOutputsResponse listJobOutputs(ListJobOutputsRequest request) {

        Validate.notBlank(request.getJobId(), "jobId must not be blank");

        return clientCall(request, ListJobOutputsResponse::builder)
                .logger(LOG, "listJobOutputs")
                .serviceDetails(
                        "ResourceManager",
                        "ListJobOutputs",
                        "https://docs.oracle.com/iaas/api/#/en/resourcemanager/20180917/JobOutputSummary/ListJobOutputs")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListJobOutputsRequest::builder)
                .basePath("/20180917")
                .appendPathParam("jobs")
                .appendPathParam(request.getJobId())
                .appendPathParam("outputs")
                .appendQueryParam("compartmentId", request.getCompartmentId())
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.resourcemanager.model.JobOutputsCollection.class,
                        ListJobOutputsResponse.Builder::jobOutputsCollection)
                .handleResponseHeaderString(
                        "opc-request-id", ListJobOutputsResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListJobOutputsResponse.Builder::opcNextPage)
                .operationUsesDefaultRetries()
                .callSync();
    }

    @Override
    public ListJobsResponse listJobs(ListJobsRequest request) {

        return clientCall(request, ListJobsResponse::builder)
                .logger(LOG, "listJobs")
                .serviceDetails(
                        "ResourceManager",
                        "ListJobs",
                        "https://docs.oracle.com/iaas/api/#/en/resourcemanager/20180917/JobSummary/ListJobs")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListJobsRequest::builder)
                .basePath("/20180917")
                .appendPathParam("jobs")
                .appendQueryParam("compartmentId", request.getCompartmentId())
                .appendQueryParam("stackId", request.getStackId())
                .appendQueryParam("id", request.getId())
                .appendEnumQueryParam("lifecycleState", request.getLifecycleState())
                .appendQueryParam("displayName", request.getDisplayName())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBodyList(
                        com.oracle.bmc.resourcemanager.model.JobSummary.class,
                        ListJobsResponse.Builder::items)
                .handleResponseHeaderString(
                        "opc-request-id", ListJobsResponse.Builder::opcRequestId)
                .handleResponseHeaderString("opc-next-page", ListJobsResponse.Builder::opcNextPage)
                .operationUsesDefaultRetries()
                .callSync();
    }

    @Override
    public ListPrivateEndpointsResponse listPrivateEndpoints(ListPrivateEndpointsRequest request) {

        return clientCall(request, ListPrivateEndpointsResponse::builder)
                .logger(LOG, "listPrivateEndpoints")
                .serviceDetails(
                        "ResourceManager",
                        "ListPrivateEndpoints",
                        "https://docs.oracle.com/iaas/api/#/en/resourcemanager/20180917/PrivateEndpointSummary/ListPrivateEndpoints")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListPrivateEndpointsRequest::builder)
                .basePath("/20180917")
                .appendPathParam("privateEndpoints")
                .appendQueryParam("compartmentId", request.getCompartmentId())
                .appendQueryParam("privateEndpointId", request.getPrivateEndpointId())
                .appendQueryParam("displayName", request.getDisplayName())
                .appendQueryParam("vcnId", request.getVcnId())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.resourcemanager.model.PrivateEndpointCollection.class,
                        ListPrivateEndpointsResponse.Builder::privateEndpointCollection)
                .handleResponseHeaderString(
                        "opc-request-id", ListPrivateEndpointsResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListPrivateEndpointsResponse.Builder::opcNextPage)
                .operationUsesDefaultRetries()
                .callSync();
    }

    @Override
    public ListResourceDiscoveryServicesResponse listResourceDiscoveryServices(
            ListResourceDiscoveryServicesRequest request) {

        return clientCall(request, ListResourceDiscoveryServicesResponse::builder)
                .logger(LOG, "listResourceDiscoveryServices")
                .serviceDetails(
                        "ResourceManager",
                        "ListResourceDiscoveryServices",
                        "https://docs.oracle.com/iaas/api/#/en/resourcemanager/20180917/Stack/ListResourceDiscoveryServices")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListResourceDiscoveryServicesRequest::builder)
                .basePath("/20180917")
                .appendPathParam("resourceDiscoveryServices")
                .appendQueryParam("compartmentId", request.getCompartmentId())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.resourcemanager.model.ResourceDiscoveryServiceCollection
                                .class,
                        ListResourceDiscoveryServicesResponse.Builder
                                ::resourceDiscoveryServiceCollection)
                .handleResponseHeaderString(
                        "opc-request-id",
                        ListResourceDiscoveryServicesResponse.Builder::opcRequestId)
                .operationUsesDefaultRetries()
                .callSync();
    }

    @Override
    public ListStackAssociatedResourcesResponse listStackAssociatedResources(
            ListStackAssociatedResourcesRequest request) {

        Validate.notBlank(request.getStackId(), "stackId must not be blank");

        return clientCall(request, ListStackAssociatedResourcesResponse::builder)
                .logger(LOG, "listStackAssociatedResources")
                .serviceDetails(
                        "ResourceManager",
                        "ListStackAssociatedResources",
                        "https://docs.oracle.com/iaas/api/#/en/resourcemanager/20180917/AssociatedResourceSummary/ListStackAssociatedResources")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListStackAssociatedResourcesRequest::builder)
                .basePath("/20180917")
                .appendPathParam("stacks")
                .appendPathParam(request.getStackId())
                .appendPathParam("associatedResources")
                .appendQueryParam("terraformResourceType", request.getTerraformResourceType())
                .appendQueryParam("compartmentId", request.getCompartmentId())
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.resourcemanager.model.AssociatedResourcesCollection.class,
                        ListStackAssociatedResourcesResponse.Builder::associatedResourcesCollection)
                .handleResponseHeaderString(
                        "opc-request-id",
                        ListStackAssociatedResourcesResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListStackAssociatedResourcesResponse.Builder::opcNextPage)
                .operationUsesDefaultRetries()
                .callSync();
    }

    @Override
    public ListStackResourceDriftDetailsResponse listStackResourceDriftDetails(
            ListStackResourceDriftDetailsRequest request) {

        Validate.notBlank(request.getStackId(), "stackId must not be blank");

        return clientCall(request, ListStackResourceDriftDetailsResponse::builder)
                .logger(LOG, "listStackResourceDriftDetails")
                .serviceDetails(
                        "ResourceManager",
                        "ListStackResourceDriftDetails",
                        "https://docs.oracle.com/iaas/api/#/en/resourcemanager/20180917/StackResourceDriftSummary/ListStackResourceDriftDetails")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(ListStackResourceDriftDetailsRequest::builder)
                .basePath("/20180917")
                .appendPathParam("stacks")
                .appendPathParam(request.getStackId())
                .appendPathParam("actions")
                .appendPathParam("listResourceDriftDetails")
                .appendQueryParam("workRequestId", request.getWorkRequestId())
                .appendListQueryParam(
                        "resourceDriftStatus",
                        request.getResourceDriftStatus(),
                        com.oracle.bmc.util.internal.CollectionFormatType.Multi)
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.resourcemanager.model.StackResourceDriftCollection.class,
                        ListStackResourceDriftDetailsResponse.Builder::stackResourceDriftCollection)
                .handleResponseHeaderString(
                        "opc-request-id",
                        ListStackResourceDriftDetailsResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListStackResourceDriftDetailsResponse.Builder::opcNextPage)
                .operationUsesDefaultRetries()
                .callSync();
    }

    @Override
    public ListStacksResponse listStacks(ListStacksRequest request) {

        return clientCall(request, ListStacksResponse::builder)
                .logger(LOG, "listStacks")
                .serviceDetails(
                        "ResourceManager",
                        "ListStacks",
                        "https://docs.oracle.com/iaas/api/#/en/resourcemanager/20180917/StackSummary/ListStacks")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListStacksRequest::builder)
                .basePath("/20180917")
                .appendPathParam("stacks")
                .appendQueryParam("compartmentId", request.getCompartmentId())
                .appendQueryParam("id", request.getId())
                .appendEnumQueryParam("lifecycleState", request.getLifecycleState())
                .appendQueryParam("displayName", request.getDisplayName())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBodyList(
                        com.oracle.bmc.resourcemanager.model.StackSummary.class,
                        ListStacksResponse.Builder::items)
                .handleResponseHeaderString(
                        "opc-request-id", ListStacksResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListStacksResponse.Builder::opcNextPage)
                .operationUsesDefaultRetries()
                .callSync();
    }

    @Override
    public ListTemplateCategoriesResponse listTemplateCategories(
            ListTemplateCategoriesRequest request) {

        return clientCall(request, ListTemplateCategoriesResponse::builder)
                .logger(LOG, "listTemplateCategories")
                .serviceDetails(
                        "ResourceManager",
                        "ListTemplateCategories",
                        "https://docs.oracle.com/iaas/api/#/en/resourcemanager/20180917/TemplateCategorySummary/ListTemplateCategories")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListTemplateCategoriesRequest::builder)
                .basePath("/20180917")
                .appendPathParam("templateCategories")
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.resourcemanager.model.TemplateCategorySummaryCollection
                                .class,
                        ListTemplateCategoriesResponse.Builder::templateCategorySummaryCollection)
                .handleResponseHeaderString(
                        "opc-request-id", ListTemplateCategoriesResponse.Builder::opcRequestId)
                .operationUsesDefaultRetries()
                .callSync();
    }

    @Override
    public ListTemplatesResponse listTemplates(ListTemplatesRequest request) {

        return clientCall(request, ListTemplatesResponse::builder)
                .logger(LOG, "listTemplates")
                .serviceDetails(
                        "ResourceManager",
                        "ListTemplates",
                        "https://docs.oracle.com/iaas/api/#/en/resourcemanager/20180917/Template/ListTemplates")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListTemplatesRequest::builder)
                .basePath("/20180917")
                .appendPathParam("templates")
                .appendQueryParam("compartmentId", request.getCompartmentId())
                .appendQueryParam("templateCategoryId", request.getTemplateCategoryId())
                .appendQueryParam("templateId", request.getTemplateId())
                .appendQueryParam("displayName", request.getDisplayName())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.resourcemanager.model.TemplateSummaryCollection.class,
                        ListTemplatesResponse.Builder::templateSummaryCollection)
                .handleResponseHeaderString(
                        "opc-request-id", ListTemplatesResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListTemplatesResponse.Builder::opcNextPage)
                .operationUsesDefaultRetries()
                .callSync();
    }

    @Override
    public ListTerraformVersionsResponse listTerraformVersions(
            ListTerraformVersionsRequest request) {

        return clientCall(request, ListTerraformVersionsResponse::builder)
                .logger(LOG, "listTerraformVersions")
                .serviceDetails(
                        "ResourceManager",
                        "ListTerraformVersions",
                        "https://docs.oracle.com/iaas/api/#/en/resourcemanager/20180917/Stack/ListTerraformVersions")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListTerraformVersionsRequest::builder)
                .basePath("/20180917")
                .appendPathParam("terraformVersions")
                .appendQueryParam("compartmentId", request.getCompartmentId())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.resourcemanager.model.TerraformVersionCollection.class,
                        ListTerraformVersionsResponse.Builder::terraformVersionCollection)
                .handleResponseHeaderString(
                        "opc-request-id", ListTerraformVersionsResponse.Builder::opcRequestId)
                .operationUsesDefaultRetries()
                .callSync();
    }

    @Override
    public ListWorkRequestErrorsResponse listWorkRequestErrors(
            ListWorkRequestErrorsRequest request) {

        Validate.notBlank(request.getWorkRequestId(), "workRequestId must not be blank");

        return clientCall(request, ListWorkRequestErrorsResponse::builder)
                .logger(LOG, "listWorkRequestErrors")
                .serviceDetails(
                        "ResourceManager",
                        "ListWorkRequestErrors",
                        "https://docs.oracle.com/iaas/api/#/en/resourcemanager/20180917/WorkRequest/ListWorkRequestErrors")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListWorkRequestErrorsRequest::builder)
                .basePath("/20180917")
                .appendPathParam("workRequests")
                .appendPathParam(request.getWorkRequestId())
                .appendPathParam("errors")
                .appendQueryParam("compartmentId", request.getCompartmentId())
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBodyList(
                        com.oracle.bmc.resourcemanager.model.WorkRequestError.class,
                        ListWorkRequestErrorsResponse.Builder::items)
                .handleResponseHeaderString(
                        "opc-next-page", ListWorkRequestErrorsResponse.Builder::opcNextPage)
                .handleResponseHeaderString(
                        "opc-request-id", ListWorkRequestErrorsResponse.Builder::opcRequestId)
                .operationUsesDefaultRetries()
                .callSync();
    }

    @Override
    public ListWorkRequestLogsResponse listWorkRequestLogs(ListWorkRequestLogsRequest request) {

        Validate.notBlank(request.getWorkRequestId(), "workRequestId must not be blank");

        return clientCall(request, ListWorkRequestLogsResponse::builder)
                .logger(LOG, "listWorkRequestLogs")
                .serviceDetails(
                        "ResourceManager",
                        "ListWorkRequestLogs",
                        "https://docs.oracle.com/iaas/api/#/en/resourcemanager/20180917/WorkRequest/ListWorkRequestLogs")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListWorkRequestLogsRequest::builder)
                .basePath("/20180917")
                .appendPathParam("workRequests")
                .appendPathParam(request.getWorkRequestId())
                .appendPathParam("logs")
                .appendQueryParam("compartmentId", request.getCompartmentId())
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBodyList(
                        com.oracle.bmc.resourcemanager.model.WorkRequestLogEntry.class,
                        ListWorkRequestLogsResponse.Builder::items)
                .handleResponseHeaderString(
                        "opc-next-page", ListWorkRequestLogsResponse.Builder::opcNextPage)
                .handleResponseHeaderString(
                        "opc-request-id", ListWorkRequestLogsResponse.Builder::opcRequestId)
                .operationUsesDefaultRetries()
                .callSync();
    }

    @Override
    public ListWorkRequestsResponse listWorkRequests(ListWorkRequestsRequest request) {
        Objects.requireNonNull(request.getCompartmentId(), "compartmentId is required");

        return clientCall(request, ListWorkRequestsResponse::builder)
                .logger(LOG, "listWorkRequests")
                .serviceDetails(
                        "ResourceManager",
                        "ListWorkRequests",
                        "https://docs.oracle.com/iaas/api/#/en/resourcemanager/20180917/WorkRequest/ListWorkRequests")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListWorkRequestsRequest::builder)
                .basePath("/20180917")
                .appendPathParam("workRequests")
                .appendQueryParam("compartmentId", request.getCompartmentId())
                .appendQueryParam("resourceId", request.getResourceId())
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBodyList(
                        com.oracle.bmc.resourcemanager.model.WorkRequestSummary.class,
                        ListWorkRequestsResponse.Builder::items)
                .handleResponseHeaderString(
                        "opc-next-page", ListWorkRequestsResponse.Builder::opcNextPage)
                .handleResponseHeaderString(
                        "opc-request-id", ListWorkRequestsResponse.Builder::opcRequestId)
                .operationUsesDefaultRetries()
                .callSync();
    }

    @Override
    public UpdateConfigurationSourceProviderResponse updateConfigurationSourceProvider(
            UpdateConfigurationSourceProviderRequest request) {

        Validate.notBlank(
                request.getConfigurationSourceProviderId(),
                "configurationSourceProviderId must not be blank");
        Objects.requireNonNull(
                request.getUpdateConfigurationSourceProviderDetails(),
                "updateConfigurationSourceProviderDetails is required");

        return clientCall(request, UpdateConfigurationSourceProviderResponse::builder)
                .logger(LOG, "updateConfigurationSourceProvider")
                .serviceDetails(
                        "ResourceManager",
                        "UpdateConfigurationSourceProvider",
                        "https://docs.oracle.com/iaas/api/#/en/resourcemanager/20180917/ConfigurationSourceProvider/UpdateConfigurationSourceProvider")
                .method(com.oracle.bmc.http.client.Method.PUT)
                .requestBuilder(UpdateConfigurationSourceProviderRequest::builder)
                .basePath("/20180917")
                .appendPathParam("configurationSourceProviders")
                .appendPathParam(request.getConfigurationSourceProviderId())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("if-match", request.getIfMatch())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.resourcemanager.model.ConfigurationSourceProvider.class,
                        UpdateConfigurationSourceProviderResponse.Builder
                                ::configurationSourceProvider)
                .handleResponseHeaderString(
                        "opc-request-id",
                        UpdateConfigurationSourceProviderResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "etag", UpdateConfigurationSourceProviderResponse.Builder::etag)
                .operationUsesDefaultRetries()
                .callSync();
    }

    @Override
    public UpdateJobResponse updateJob(UpdateJobRequest request) {

        Validate.notBlank(request.getJobId(), "jobId must not be blank");
        Objects.requireNonNull(request.getUpdateJobDetails(), "updateJobDetails is required");

        return clientCall(request, UpdateJobResponse::builder)
                .logger(LOG, "updateJob")
                .serviceDetails(
                        "ResourceManager",
                        "UpdateJob",
                        "https://docs.oracle.com/iaas/api/#/en/resourcemanager/20180917/Job/UpdateJob")
                .method(com.oracle.bmc.http.client.Method.PUT)
                .requestBuilder(UpdateJobRequest::builder)
                .basePath("/20180917")
                .appendPathParam("jobs")
                .appendPathParam(request.getJobId())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("if-match", request.getIfMatch())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.resourcemanager.model.Job.class,
                        UpdateJobResponse.Builder::job)
                .handleResponseHeaderString(
                        "opc-request-id", UpdateJobResponse.Builder::opcRequestId)
                .handleResponseHeaderString("etag", UpdateJobResponse.Builder::etag)
                .operationUsesDefaultRetries()
                .callSync();
    }

    @Override
    public UpdatePrivateEndpointResponse updatePrivateEndpoint(
            UpdatePrivateEndpointRequest request) {

        Validate.notBlank(request.getPrivateEndpointId(), "privateEndpointId must not be blank");
        Objects.requireNonNull(
                request.getUpdatePrivateEndpointDetails(),
                "updatePrivateEndpointDetails is required");

        return clientCall(request, UpdatePrivateEndpointResponse::builder)
                .logger(LOG, "updatePrivateEndpoint")
                .serviceDetails(
                        "ResourceManager",
                        "UpdatePrivateEndpoint",
                        "https://docs.oracle.com/iaas/api/#/en/resourcemanager/20180917/PrivateEndpoint/UpdatePrivateEndpoint")
                .method(com.oracle.bmc.http.client.Method.PUT)
                .requestBuilder(UpdatePrivateEndpointRequest::builder)
                .basePath("/20180917")
                .appendPathParam("privateEndpoints")
                .appendPathParam(request.getPrivateEndpointId())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("if-match", request.getIfMatch())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.resourcemanager.model.PrivateEndpoint.class,
                        UpdatePrivateEndpointResponse.Builder::privateEndpoint)
                .handleResponseHeaderString(
                        "opc-request-id", UpdatePrivateEndpointResponse.Builder::opcRequestId)
                .handleResponseHeaderString("etag", UpdatePrivateEndpointResponse.Builder::etag)
                .operationUsesDefaultRetries()
                .callSync();
    }

    @Override
    public UpdateStackResponse updateStack(UpdateStackRequest request) {

        Validate.notBlank(request.getStackId(), "stackId must not be blank");
        Objects.requireNonNull(request.getUpdateStackDetails(), "updateStackDetails is required");

        return clientCall(request, UpdateStackResponse::builder)
                .logger(LOG, "updateStack")
                .serviceDetails(
                        "ResourceManager",
                        "UpdateStack",
                        "https://docs.oracle.com/iaas/api/#/en/resourcemanager/20180917/Stack/UpdateStack")
                .method(com.oracle.bmc.http.client.Method.PUT)
                .requestBuilder(UpdateStackRequest::builder)
                .basePath("/20180917")
                .appendPathParam("stacks")
                .appendPathParam(request.getStackId())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("if-match", request.getIfMatch())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.resourcemanager.model.Stack.class,
                        UpdateStackResponse.Builder::stack)
                .handleResponseHeaderString(
                        "opc-request-id", UpdateStackResponse.Builder::opcRequestId)
                .handleResponseHeaderString("etag", UpdateStackResponse.Builder::etag)
                .operationUsesDefaultRetries()
                .callSync();
    }

    @Override
    public UpdateTemplateResponse updateTemplate(UpdateTemplateRequest request) {

        Validate.notBlank(request.getTemplateId(), "templateId must not be blank");
        Objects.requireNonNull(
                request.getUpdateTemplateDetails(), "updateTemplateDetails is required");

        return clientCall(request, UpdateTemplateResponse::builder)
                .logger(LOG, "updateTemplate")
                .serviceDetails(
                        "ResourceManager",
                        "UpdateTemplate",
                        "https://docs.oracle.com/iaas/api/#/en/resourcemanager/20180917/Template/UpdateTemplate")
                .method(com.oracle.bmc.http.client.Method.PUT)
                .requestBuilder(UpdateTemplateRequest::builder)
                .basePath("/20180917")
                .appendPathParam("templates")
                .appendPathParam(request.getTemplateId())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("if-match", request.getIfMatch())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.resourcemanager.model.Template.class,
                        UpdateTemplateResponse.Builder::template)
                .handleResponseHeaderString(
                        "opc-request-id", UpdateTemplateResponse.Builder::opcRequestId)
                .handleResponseHeaderString("etag", UpdateTemplateResponse.Builder::etag)
                .operationUsesDefaultRetries()
                .callSync();
    }

    @Override
    public ResourceManagerWaiters getWaiters() {
        return waiters;
    }

    @Override
    public ResourceManagerPaginators getPaginators() {
        return paginators;
    }

    /**
     * Create a new client instance.
     *
     * @param authenticationDetailsProvider The authentication details (see {@link Builder#build})
     * @deprecated Use the {@link #builder() builder} instead.
     */
    @Deprecated
    public ResourceManagerClient(
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
    public ResourceManagerClient(
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
    public ResourceManagerClient(
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
    public ResourceManagerClient(
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
    public ResourceManagerClient(
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
    public ResourceManagerClient(
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
    public ResourceManagerClient(
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
    public ResourceManagerClient(
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
