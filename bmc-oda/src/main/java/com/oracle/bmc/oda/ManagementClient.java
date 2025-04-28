/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.oda;

import com.oracle.bmc.util.internal.Validate;
import com.oracle.bmc.oda.requests.*;
import com.oracle.bmc.oda.responses.*;
import com.oracle.bmc.circuitbreaker.CircuitBreakerConfiguration;
import com.oracle.bmc.util.CircuitBreakerUtils;

import java.util.Objects;

@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20190506")
public class ManagementClient extends com.oracle.bmc.http.internal.BaseSyncClient
        implements Management {
    /** Service instance for Management. */
    public static final com.oracle.bmc.Service SERVICE =
            com.oracle.bmc.Services.serviceBuilder()
                    .serviceName("MANAGEMENT")
                    .serviceEndpointPrefix("")
                    .serviceEndpointTemplate(
                            "https://digitalassistant-api.{region}.oci.{secondLevelDomain}")
                    .build();

    private static final org.slf4j.Logger LOG =
            org.slf4j.LoggerFactory.getLogger(ManagementClient.class);

    private final ManagementWaiters waiters;

    private final ManagementPaginators paginators;

    ManagementClient(
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
                                    .nameFormat("Management-waiters-%d")
                                    .build());
            threadPoolExecutor.allowCoreThreadTimeOut(true);

            executorService = threadPoolExecutor;
        }
        this.waiters = new ManagementWaiters(executorService, this);

        this.paginators = new ManagementPaginators(this);
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
            extends com.oracle.bmc.common.RegionalClientBuilder<Builder, ManagementClient> {
        private java.util.concurrent.ExecutorService executorService;

        private Builder(com.oracle.bmc.Service service) {
            super(service);
            final String packageName = "oda";
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
        public ManagementClient build(
                @jakarta.annotation.Nonnull
                        com.oracle.bmc.auth.AbstractAuthenticationDetailsProvider
                                authenticationDetailsProvider) {
            return new ManagementClient(this, authenticationDetailsProvider, executorService);
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
    public BulkCreateSkillEntitiesResponse bulkCreateSkillEntities(
            BulkCreateSkillEntitiesRequest request) {

        Validate.notBlank(request.getOdaInstanceId(), "odaInstanceId must not be blank");

        Validate.notBlank(request.getSkillId(), "skillId must not be blank");
        Objects.requireNonNull(
                request.getBulkCreateSkillEntitiesDetails(),
                "bulkCreateSkillEntitiesDetails is required");

        return clientCall(request, BulkCreateSkillEntitiesResponse::builder)
                .logger(LOG, "bulkCreateSkillEntities")
                .serviceDetails(
                        "Management",
                        "BulkCreateSkillEntities",
                        "https://docs.oracle.com/iaas/api/#/en/digital-assistant/20190506/Skill/BulkCreateSkillEntities")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(BulkCreateSkillEntitiesRequest::builder)
                .basePath("/20190506")
                .appendPathParam("odaInstances")
                .appendPathParam(request.getOdaInstanceId())
                .appendPathParam("skills")
                .appendPathParam(request.getSkillId())
                .appendPathParam("actions")
                .appendPathParam("bulkCreateEntities")
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .operationUsesDefaultRetries()
                .hasBody()
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        BulkCreateSkillEntitiesResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", BulkCreateSkillEntitiesResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public CascadingDeleteSkillCustomEntitiesResponse cascadingDeleteSkillCustomEntities(
            CascadingDeleteSkillCustomEntitiesRequest request) {

        Validate.notBlank(request.getOdaInstanceId(), "odaInstanceId must not be blank");

        Validate.notBlank(request.getSkillId(), "skillId must not be blank");

        return clientCall(request, CascadingDeleteSkillCustomEntitiesResponse::builder)
                .logger(LOG, "cascadingDeleteSkillCustomEntities")
                .serviceDetails(
                        "Management",
                        "CascadingDeleteSkillCustomEntities",
                        "https://docs.oracle.com/iaas/api/#/en/digital-assistant/20190506/Skill/CascadingDeleteSkillCustomEntities")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(CascadingDeleteSkillCustomEntitiesRequest::builder)
                .basePath("/20190506")
                .appendPathParam("odaInstances")
                .appendPathParam(request.getOdaInstanceId())
                .appendPathParam("skills")
                .appendPathParam(request.getSkillId())
                .appendPathParam("actions")
                .appendPathParam("cascadingDeleteCustomEntities")
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .operationUsesDefaultRetries()
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        CascadingDeleteSkillCustomEntitiesResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id",
                        CascadingDeleteSkillCustomEntitiesResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public ChangeOdaPrivateEndpointCompartmentResponse changeOdaPrivateEndpointCompartment(
            ChangeOdaPrivateEndpointCompartmentRequest request) {

        Validate.notBlank(
                request.getOdaPrivateEndpointId(), "odaPrivateEndpointId must not be blank");
        Objects.requireNonNull(
                request.getChangeOdaPrivateEndpointCompartmentDetails(),
                "changeOdaPrivateEndpointCompartmentDetails is required");

        return clientCall(request, ChangeOdaPrivateEndpointCompartmentResponse::builder)
                .logger(LOG, "changeOdaPrivateEndpointCompartment")
                .serviceDetails(
                        "Management",
                        "ChangeOdaPrivateEndpointCompartment",
                        "https://docs.oracle.com/iaas/api/#/en/digital-assistant/20190506/OdaPrivateEndpoint/ChangeOdaPrivateEndpointCompartment")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(ChangeOdaPrivateEndpointCompartmentRequest::builder)
                .basePath("/20190506")
                .appendPathParam("odaPrivateEndpoints")
                .appendPathParam(request.getOdaPrivateEndpointId())
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
                        ChangeOdaPrivateEndpointCompartmentResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id",
                        ChangeOdaPrivateEndpointCompartmentResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public ConfigureDigitalAssistantParametersResponse configureDigitalAssistantParameters(
            ConfigureDigitalAssistantParametersRequest request) {

        Validate.notBlank(request.getOdaInstanceId(), "odaInstanceId must not be blank");
        Objects.requireNonNull(
                request.getConfigureDigitalAssistantParametersDetails(),
                "configureDigitalAssistantParametersDetails is required");

        return clientCall(request, ConfigureDigitalAssistantParametersResponse::builder)
                .logger(LOG, "configureDigitalAssistantParameters")
                .serviceDetails(
                        "Management",
                        "ConfigureDigitalAssistantParameters",
                        "https://docs.oracle.com/iaas/api/#/en/digital-assistant/20190506/DigitalAssistantParameter/ConfigureDigitalAssistantParameters")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(ConfigureDigitalAssistantParametersRequest::builder)
                .basePath("/20190506")
                .appendPathParam("odaInstances")
                .appendPathParam(request.getOdaInstanceId())
                .appendPathParam("actions")
                .appendPathParam("configureDigitalAssistantParameters")
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .hasBody()
                .handleResponseHeaderString(
                        "opc-request-id",
                        ConfigureDigitalAssistantParametersResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public CreateAuthenticationProviderResponse createAuthenticationProvider(
            CreateAuthenticationProviderRequest request) {

        Validate.notBlank(request.getOdaInstanceId(), "odaInstanceId must not be blank");
        Objects.requireNonNull(
                request.getCreateAuthenticationProviderDetails(),
                "createAuthenticationProviderDetails is required");

        return clientCall(request, CreateAuthenticationProviderResponse::builder)
                .logger(LOG, "createAuthenticationProvider")
                .serviceDetails(
                        "Management",
                        "CreateAuthenticationProvider",
                        "https://docs.oracle.com/iaas/api/#/en/digital-assistant/20190506/AuthenticationProvider/CreateAuthenticationProvider")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(CreateAuthenticationProviderRequest::builder)
                .basePath("/20190506")
                .appendPathParam("odaInstances")
                .appendPathParam(request.getOdaInstanceId())
                .appendPathParam("authenticationProviders")
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .operationUsesDefaultRetries()
                .hasBody()
                .handleBody(
                        com.oracle.bmc.oda.model.AuthenticationProvider.class,
                        CreateAuthenticationProviderResponse.Builder::authenticationProvider)
                .handleResponseHeaderString(
                        "Location", CreateAuthenticationProviderResponse.Builder::location)
                .handleResponseHeaderString(
                        "etag", CreateAuthenticationProviderResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id",
                        CreateAuthenticationProviderResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public CreateChannelResponse createChannel(CreateChannelRequest request) {

        Validate.notBlank(request.getOdaInstanceId(), "odaInstanceId must not be blank");
        Objects.requireNonNull(
                request.getCreateChannelDetails(), "createChannelDetails is required");

        return clientCall(request, CreateChannelResponse::builder)
                .logger(LOG, "createChannel")
                .serviceDetails(
                        "Management",
                        "CreateChannel",
                        "https://docs.oracle.com/iaas/api/#/en/digital-assistant/20190506/Channel/CreateChannel")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(CreateChannelRequest::builder)
                .basePath("/20190506")
                .appendPathParam("odaInstances")
                .appendPathParam(request.getOdaInstanceId())
                .appendPathParam("channels")
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .operationUsesDefaultRetries()
                .hasBody()
                .handleBody(
                        com.oracle.bmc.oda.model.CreateChannelResult.class,
                        CreateChannelResponse.Builder::createChannelResult)
                .handleResponseHeaderString("Location", CreateChannelResponse.Builder::location)
                .handleResponseHeaderString("etag", CreateChannelResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", CreateChannelResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public CreateDigitalAssistantResponse createDigitalAssistant(
            CreateDigitalAssistantRequest request) {

        Validate.notBlank(request.getOdaInstanceId(), "odaInstanceId must not be blank");
        Objects.requireNonNull(
                request.getCreateDigitalAssistantDetails(),
                "createDigitalAssistantDetails is required");

        return clientCall(request, CreateDigitalAssistantResponse::builder)
                .logger(LOG, "createDigitalAssistant")
                .serviceDetails(
                        "Management",
                        "CreateDigitalAssistant",
                        "https://docs.oracle.com/iaas/api/#/en/digital-assistant/20190506/DigitalAssistant/CreateDigitalAssistant")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(CreateDigitalAssistantRequest::builder)
                .basePath("/20190506")
                .appendPathParam("odaInstances")
                .appendPathParam(request.getOdaInstanceId())
                .appendPathParam("digitalAssistants")
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .operationUsesDefaultRetries()
                .hasBody()
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        CreateDigitalAssistantResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", CreateDigitalAssistantResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public CreateOdaPrivateEndpointResponse createOdaPrivateEndpoint(
            CreateOdaPrivateEndpointRequest request) {
        Objects.requireNonNull(
                request.getCreateOdaPrivateEndpointDetails(),
                "createOdaPrivateEndpointDetails is required");

        return clientCall(request, CreateOdaPrivateEndpointResponse::builder)
                .logger(LOG, "createOdaPrivateEndpoint")
                .serviceDetails("Management", "CreateOdaPrivateEndpoint", "")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(CreateOdaPrivateEndpointRequest::builder)
                .basePath("/20190506")
                .appendPathParam("odaPrivateEndpoints")
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .operationUsesDefaultRetries()
                .hasBody()
                .handleBody(
                        com.oracle.bmc.oda.model.OdaPrivateEndpoint.class,
                        CreateOdaPrivateEndpointResponse.Builder::odaPrivateEndpoint)
                .handleResponseHeaderString(
                        "Location", CreateOdaPrivateEndpointResponse.Builder::location)
                .handleResponseHeaderString("etag", CreateOdaPrivateEndpointResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", CreateOdaPrivateEndpointResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        CreateOdaPrivateEndpointResponse.Builder::opcWorkRequestId)
                .callSync();
    }

    @Override
    public CreateOdaPrivateEndpointAttachmentResponse createOdaPrivateEndpointAttachment(
            CreateOdaPrivateEndpointAttachmentRequest request) {
        Objects.requireNonNull(
                request.getCreateOdaPrivateEndpointAttachmentDetails(),
                "createOdaPrivateEndpointAttachmentDetails is required");

        return clientCall(request, CreateOdaPrivateEndpointAttachmentResponse::builder)
                .logger(LOG, "createOdaPrivateEndpointAttachment")
                .serviceDetails("Management", "CreateOdaPrivateEndpointAttachment", "")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(CreateOdaPrivateEndpointAttachmentRequest::builder)
                .basePath("/20190506")
                .appendPathParam("odaPrivateEndpointAttachments")
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .operationUsesDefaultRetries()
                .hasBody()
                .handleBody(
                        com.oracle.bmc.oda.model.OdaPrivateEndpointAttachment.class,
                        CreateOdaPrivateEndpointAttachmentResponse.Builder
                                ::odaPrivateEndpointAttachment)
                .handleResponseHeaderString(
                        "Location", CreateOdaPrivateEndpointAttachmentResponse.Builder::location)
                .handleResponseHeaderString(
                        "etag", CreateOdaPrivateEndpointAttachmentResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id",
                        CreateOdaPrivateEndpointAttachmentResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        CreateOdaPrivateEndpointAttachmentResponse.Builder::opcWorkRequestId)
                .callSync();
    }

    @Override
    public CreateOdaPrivateEndpointScanProxyResponse createOdaPrivateEndpointScanProxy(
            CreateOdaPrivateEndpointScanProxyRequest request) {
        Objects.requireNonNull(
                request.getCreateOdaPrivateEndpointScanProxyDetails(),
                "createOdaPrivateEndpointScanProxyDetails is required");

        Validate.notBlank(
                request.getOdaPrivateEndpointId(), "odaPrivateEndpointId must not be blank");

        return clientCall(request, CreateOdaPrivateEndpointScanProxyResponse::builder)
                .logger(LOG, "createOdaPrivateEndpointScanProxy")
                .serviceDetails("Management", "CreateOdaPrivateEndpointScanProxy", "")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(CreateOdaPrivateEndpointScanProxyRequest::builder)
                .basePath("/20190506")
                .appendPathParam("odaPrivateEndpoints")
                .appendPathParam(request.getOdaPrivateEndpointId())
                .appendPathParam("odaPrivateEndpointScanProxies")
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .operationUsesDefaultRetries()
                .hasBody()
                .handleBody(
                        com.oracle.bmc.oda.model.OdaPrivateEndpointScanProxy.class,
                        CreateOdaPrivateEndpointScanProxyResponse.Builder
                                ::odaPrivateEndpointScanProxy)
                .handleResponseHeaderString(
                        "Location", CreateOdaPrivateEndpointScanProxyResponse.Builder::location)
                .handleResponseHeaderString(
                        "etag", CreateOdaPrivateEndpointScanProxyResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        CreateOdaPrivateEndpointScanProxyResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id",
                        CreateOdaPrivateEndpointScanProxyResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public CreateSkillResponse createSkill(CreateSkillRequest request) {

        Validate.notBlank(request.getOdaInstanceId(), "odaInstanceId must not be blank");
        Objects.requireNonNull(request.getCreateSkillDetails(), "createSkillDetails is required");

        return clientCall(request, CreateSkillResponse::builder)
                .logger(LOG, "createSkill")
                .serviceDetails(
                        "Management",
                        "CreateSkill",
                        "https://docs.oracle.com/iaas/api/#/en/digital-assistant/20190506/Skill/CreateSkill")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(CreateSkillRequest::builder)
                .basePath("/20190506")
                .appendPathParam("odaInstances")
                .appendPathParam(request.getOdaInstanceId())
                .appendPathParam("skills")
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .operationUsesDefaultRetries()
                .hasBody()
                .handleResponseHeaderString(
                        "opc-work-request-id", CreateSkillResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", CreateSkillResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public CreateSkillParameterResponse createSkillParameter(CreateSkillParameterRequest request) {

        Validate.notBlank(request.getOdaInstanceId(), "odaInstanceId must not be blank");

        Validate.notBlank(request.getSkillId(), "skillId must not be blank");
        Objects.requireNonNull(
                request.getCreateSkillParameterDetails(),
                "createSkillParameterDetails is required");

        return clientCall(request, CreateSkillParameterResponse::builder)
                .logger(LOG, "createSkillParameter")
                .serviceDetails(
                        "Management",
                        "CreateSkillParameter",
                        "https://docs.oracle.com/iaas/api/#/en/digital-assistant/20190506/SkillParameter/CreateSkillParameter")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(CreateSkillParameterRequest::builder)
                .basePath("/20190506")
                .appendPathParam("odaInstances")
                .appendPathParam(request.getOdaInstanceId())
                .appendPathParam("skills")
                .appendPathParam(request.getSkillId())
                .appendPathParam("parameters")
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .operationUsesDefaultRetries()
                .hasBody()
                .handleBody(
                        com.oracle.bmc.oda.model.SkillParameter.class,
                        CreateSkillParameterResponse.Builder::skillParameter)
                .handleResponseHeaderString(
                        "Location", CreateSkillParameterResponse.Builder::location)
                .handleResponseHeaderString(
                        "opc-request-id", CreateSkillParameterResponse.Builder::opcRequestId)
                .handleResponseHeaderString("etag", CreateSkillParameterResponse.Builder::etag)
                .callSync();
    }

    @Override
    public CreateTranslatorResponse createTranslator(CreateTranslatorRequest request) {

        Validate.notBlank(request.getOdaInstanceId(), "odaInstanceId must not be blank");
        Objects.requireNonNull(
                request.getCreateTranslatorDetails(), "createTranslatorDetails is required");

        return clientCall(request, CreateTranslatorResponse::builder)
                .logger(LOG, "createTranslator")
                .serviceDetails(
                        "Management",
                        "CreateTranslator",
                        "https://docs.oracle.com/iaas/api/#/en/digital-assistant/20190506/Translator/CreateTranslator")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(CreateTranslatorRequest::builder)
                .basePath("/20190506")
                .appendPathParam("odaInstances")
                .appendPathParam(request.getOdaInstanceId())
                .appendPathParam("translators")
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .operationUsesDefaultRetries()
                .hasBody()
                .handleBody(
                        com.oracle.bmc.oda.model.Translator.class,
                        CreateTranslatorResponse.Builder::translator)
                .handleResponseHeaderString("Location", CreateTranslatorResponse.Builder::location)
                .handleResponseHeaderString("etag", CreateTranslatorResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", CreateTranslatorResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public DeleteAuthenticationProviderResponse deleteAuthenticationProvider(
            DeleteAuthenticationProviderRequest request) {

        Validate.notBlank(request.getOdaInstanceId(), "odaInstanceId must not be blank");

        Validate.notBlank(
                request.getAuthenticationProviderId(),
                "authenticationProviderId must not be blank");

        return clientCall(request, DeleteAuthenticationProviderResponse::builder)
                .logger(LOG, "deleteAuthenticationProvider")
                .serviceDetails(
                        "Management",
                        "DeleteAuthenticationProvider",
                        "https://docs.oracle.com/iaas/api/#/en/digital-assistant/20190506/AuthenticationProvider/DeleteAuthenticationProvider")
                .method(com.oracle.bmc.http.client.Method.DELETE)
                .requestBuilder(DeleteAuthenticationProviderRequest::builder)
                .basePath("/20190506")
                .appendPathParam("odaInstances")
                .appendPathParam(request.getOdaInstanceId())
                .appendPathParam("authenticationProviders")
                .appendPathParam(request.getAuthenticationProviderId())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .handleResponseHeaderString(
                        "opc-request-id",
                        DeleteAuthenticationProviderResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public DeleteChannelResponse deleteChannel(DeleteChannelRequest request) {

        Validate.notBlank(request.getOdaInstanceId(), "odaInstanceId must not be blank");

        Validate.notBlank(request.getChannelId(), "channelId must not be blank");

        return clientCall(request, DeleteChannelResponse::builder)
                .logger(LOG, "deleteChannel")
                .serviceDetails(
                        "Management",
                        "DeleteChannel",
                        "https://docs.oracle.com/iaas/api/#/en/digital-assistant/20190506/Channel/DeleteChannel")
                .method(com.oracle.bmc.http.client.Method.DELETE)
                .requestBuilder(DeleteChannelRequest::builder)
                .basePath("/20190506")
                .appendPathParam("odaInstances")
                .appendPathParam(request.getOdaInstanceId())
                .appendPathParam("channels")
                .appendPathParam(request.getChannelId())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .handleResponseHeaderString(
                        "opc-request-id", DeleteChannelResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public DeleteDigitalAssistantResponse deleteDigitalAssistant(
            DeleteDigitalAssistantRequest request) {

        Validate.notBlank(request.getOdaInstanceId(), "odaInstanceId must not be blank");

        Validate.notBlank(request.getDigitalAssistantId(), "digitalAssistantId must not be blank");

        return clientCall(request, DeleteDigitalAssistantResponse::builder)
                .logger(LOG, "deleteDigitalAssistant")
                .serviceDetails(
                        "Management",
                        "DeleteDigitalAssistant",
                        "https://docs.oracle.com/iaas/api/#/en/digital-assistant/20190506/DigitalAssistant/DeleteDigitalAssistant")
                .method(com.oracle.bmc.http.client.Method.DELETE)
                .requestBuilder(DeleteDigitalAssistantRequest::builder)
                .basePath("/20190506")
                .appendPathParam("odaInstances")
                .appendPathParam(request.getOdaInstanceId())
                .appendPathParam("digitalAssistants")
                .appendPathParam(request.getDigitalAssistantId())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .handleResponseHeaderString(
                        "opc-request-id", DeleteDigitalAssistantResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public DeleteOdaPrivateEndpointResponse deleteOdaPrivateEndpoint(
            DeleteOdaPrivateEndpointRequest request) {

        Validate.notBlank(
                request.getOdaPrivateEndpointId(), "odaPrivateEndpointId must not be blank");

        return clientCall(request, DeleteOdaPrivateEndpointResponse::builder)
                .logger(LOG, "deleteOdaPrivateEndpoint")
                .serviceDetails(
                        "Management",
                        "DeleteOdaPrivateEndpoint",
                        "https://docs.oracle.com/iaas/api/#/en/digital-assistant/20190506/OdaPrivateEndpoint/DeleteOdaPrivateEndpoint")
                .method(com.oracle.bmc.http.client.Method.DELETE)
                .requestBuilder(DeleteOdaPrivateEndpointRequest::builder)
                .basePath("/20190506")
                .appendPathParam("odaPrivateEndpoints")
                .appendPathParam(request.getOdaPrivateEndpointId())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        DeleteOdaPrivateEndpointResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", DeleteOdaPrivateEndpointResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public DeleteOdaPrivateEndpointAttachmentResponse deleteOdaPrivateEndpointAttachment(
            DeleteOdaPrivateEndpointAttachmentRequest request) {

        Validate.notBlank(
                request.getOdaPrivateEndpointAttachmentId(),
                "odaPrivateEndpointAttachmentId must not be blank");

        return clientCall(request, DeleteOdaPrivateEndpointAttachmentResponse::builder)
                .logger(LOG, "deleteOdaPrivateEndpointAttachment")
                .serviceDetails(
                        "Management",
                        "DeleteOdaPrivateEndpointAttachment",
                        "https://docs.oracle.com/iaas/api/#/en/digital-assistant/20190506/OdaPrivateEndpointAttachment/DeleteOdaPrivateEndpointAttachment")
                .method(com.oracle.bmc.http.client.Method.DELETE)
                .requestBuilder(DeleteOdaPrivateEndpointAttachmentRequest::builder)
                .basePath("/20190506")
                .appendPathParam("odaPrivateEndpointAttachments")
                .appendPathParam(request.getOdaPrivateEndpointAttachmentId())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        DeleteOdaPrivateEndpointAttachmentResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id",
                        DeleteOdaPrivateEndpointAttachmentResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public DeleteOdaPrivateEndpointScanProxyResponse deleteOdaPrivateEndpointScanProxy(
            DeleteOdaPrivateEndpointScanProxyRequest request) {

        Validate.notBlank(
                request.getOdaPrivateEndpointScanProxyId(),
                "odaPrivateEndpointScanProxyId must not be blank");

        Validate.notBlank(
                request.getOdaPrivateEndpointId(), "odaPrivateEndpointId must not be blank");

        return clientCall(request, DeleteOdaPrivateEndpointScanProxyResponse::builder)
                .logger(LOG, "deleteOdaPrivateEndpointScanProxy")
                .serviceDetails(
                        "Management",
                        "DeleteOdaPrivateEndpointScanProxy",
                        "https://docs.oracle.com/iaas/api/#/en/digital-assistant/20190506/OdaPrivateEndpointScanProxy/DeleteOdaPrivateEndpointScanProxy")
                .method(com.oracle.bmc.http.client.Method.DELETE)
                .requestBuilder(DeleteOdaPrivateEndpointScanProxyRequest::builder)
                .basePath("/20190506")
                .appendPathParam("odaPrivateEndpoints")
                .appendPathParam(request.getOdaPrivateEndpointId())
                .appendPathParam("odaPrivateEndpointScanProxies")
                .appendPathParam(request.getOdaPrivateEndpointScanProxyId())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        DeleteOdaPrivateEndpointScanProxyResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id",
                        DeleteOdaPrivateEndpointScanProxyResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public DeleteSkillResponse deleteSkill(DeleteSkillRequest request) {

        Validate.notBlank(request.getOdaInstanceId(), "odaInstanceId must not be blank");

        Validate.notBlank(request.getSkillId(), "skillId must not be blank");

        return clientCall(request, DeleteSkillResponse::builder)
                .logger(LOG, "deleteSkill")
                .serviceDetails(
                        "Management",
                        "DeleteSkill",
                        "https://docs.oracle.com/iaas/api/#/en/digital-assistant/20190506/Skill/DeleteSkill")
                .method(com.oracle.bmc.http.client.Method.DELETE)
                .requestBuilder(DeleteSkillRequest::builder)
                .basePath("/20190506")
                .appendPathParam("odaInstances")
                .appendPathParam(request.getOdaInstanceId())
                .appendPathParam("skills")
                .appendPathParam(request.getSkillId())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .handleResponseHeaderString(
                        "opc-request-id", DeleteSkillResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public DeleteSkillParameterResponse deleteSkillParameter(DeleteSkillParameterRequest request) {

        Validate.notBlank(request.getOdaInstanceId(), "odaInstanceId must not be blank");

        Validate.notBlank(request.getSkillId(), "skillId must not be blank");

        Validate.notBlank(request.getParameterName(), "parameterName must not be blank");

        return clientCall(request, DeleteSkillParameterResponse::builder)
                .logger(LOG, "deleteSkillParameter")
                .serviceDetails(
                        "Management",
                        "DeleteSkillParameter",
                        "https://docs.oracle.com/iaas/api/#/en/digital-assistant/20190506/SkillParameter/DeleteSkillParameter")
                .method(com.oracle.bmc.http.client.Method.DELETE)
                .requestBuilder(DeleteSkillParameterRequest::builder)
                .basePath("/20190506")
                .appendPathParam("odaInstances")
                .appendPathParam(request.getOdaInstanceId())
                .appendPathParam("skills")
                .appendPathParam(request.getSkillId())
                .appendPathParam("parameters")
                .appendPathParam(request.getParameterName())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .handleResponseHeaderString(
                        "opc-request-id", DeleteSkillParameterResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public DeleteTranslatorResponse deleteTranslator(DeleteTranslatorRequest request) {

        Validate.notBlank(request.getOdaInstanceId(), "odaInstanceId must not be blank");

        Validate.notBlank(request.getTranslatorId(), "translatorId must not be blank");

        return clientCall(request, DeleteTranslatorResponse::builder)
                .logger(LOG, "deleteTranslator")
                .serviceDetails(
                        "Management",
                        "DeleteTranslator",
                        "https://docs.oracle.com/iaas/api/#/en/digital-assistant/20190506/Translator/DeleteTranslator")
                .method(com.oracle.bmc.http.client.Method.DELETE)
                .requestBuilder(DeleteTranslatorRequest::builder)
                .basePath("/20190506")
                .appendPathParam("odaInstances")
                .appendPathParam(request.getOdaInstanceId())
                .appendPathParam("translators")
                .appendPathParam(request.getTranslatorId())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .handleResponseHeaderString(
                        "opc-request-id", DeleteTranslatorResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public ExportDigitalAssistantResponse exportDigitalAssistant(
            ExportDigitalAssistantRequest request) {

        Validate.notBlank(request.getOdaInstanceId(), "odaInstanceId must not be blank");

        Validate.notBlank(request.getDigitalAssistantId(), "digitalAssistantId must not be blank");
        Objects.requireNonNull(
                request.getExportDigitalAssistantDetails(),
                "exportDigitalAssistantDetails is required");

        return clientCall(request, ExportDigitalAssistantResponse::builder)
                .logger(LOG, "exportDigitalAssistant")
                .serviceDetails(
                        "Management",
                        "ExportDigitalAssistant",
                        "https://docs.oracle.com/iaas/api/#/en/digital-assistant/20190506/Skill/ExportDigitalAssistant")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(ExportDigitalAssistantRequest::builder)
                .basePath("/20190506")
                .appendPathParam("odaInstances")
                .appendPathParam(request.getOdaInstanceId())
                .appendPathParam("digitalAssistants")
                .appendPathParam(request.getDigitalAssistantId())
                .appendPathParam("actions")
                .appendPathParam("export")
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .hasBody()
                .handleResponseHeaderString(
                        "opc-request-id", ExportDigitalAssistantResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        ExportDigitalAssistantResponse.Builder::opcWorkRequestId)
                .callSync();
    }

    @Override
    public ExportSkillResponse exportSkill(ExportSkillRequest request) {

        Validate.notBlank(request.getOdaInstanceId(), "odaInstanceId must not be blank");

        Validate.notBlank(request.getSkillId(), "skillId must not be blank");
        Objects.requireNonNull(request.getExportSkillDetails(), "exportSkillDetails is required");

        return clientCall(request, ExportSkillResponse::builder)
                .logger(LOG, "exportSkill")
                .serviceDetails(
                        "Management",
                        "ExportSkill",
                        "https://docs.oracle.com/iaas/api/#/en/digital-assistant/20190506/Skill/ExportSkill")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(ExportSkillRequest::builder)
                .basePath("/20190506")
                .appendPathParam("odaInstances")
                .appendPathParam(request.getOdaInstanceId())
                .appendPathParam("skills")
                .appendPathParam(request.getSkillId())
                .appendPathParam("actions")
                .appendPathParam("export")
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .hasBody()
                .handleResponseHeaderString(
                        "opc-request-id", ExportSkillResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-work-request-id", ExportSkillResponse.Builder::opcWorkRequestId)
                .callSync();
    }

    @Override
    public GetAuthenticationProviderResponse getAuthenticationProvider(
            GetAuthenticationProviderRequest request) {

        Validate.notBlank(request.getOdaInstanceId(), "odaInstanceId must not be blank");

        Validate.notBlank(
                request.getAuthenticationProviderId(),
                "authenticationProviderId must not be blank");

        return clientCall(request, GetAuthenticationProviderResponse::builder)
                .logger(LOG, "getAuthenticationProvider")
                .serviceDetails(
                        "Management",
                        "GetAuthenticationProvider",
                        "https://docs.oracle.com/iaas/api/#/en/digital-assistant/20190506/AuthenticationProvider/GetAuthenticationProvider")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetAuthenticationProviderRequest::builder)
                .basePath("/20190506")
                .appendPathParam("odaInstances")
                .appendPathParam(request.getOdaInstanceId())
                .appendPathParam("authenticationProviders")
                .appendPathParam(request.getAuthenticationProviderId())
                .accept("application/json")
                .appendHeader("if-none-match", request.getIfNoneMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .handleBody(
                        com.oracle.bmc.oda.model.AuthenticationProvider.class,
                        GetAuthenticationProviderResponse.Builder::authenticationProvider)
                .handleResponseHeaderString("etag", GetAuthenticationProviderResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", GetAuthenticationProviderResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public GetChannelResponse getChannel(GetChannelRequest request) {

        Validate.notBlank(request.getOdaInstanceId(), "odaInstanceId must not be blank");

        Validate.notBlank(request.getChannelId(), "channelId must not be blank");

        return clientCall(request, GetChannelResponse::builder)
                .logger(LOG, "getChannel")
                .serviceDetails(
                        "Management",
                        "GetChannel",
                        "https://docs.oracle.com/iaas/api/#/en/digital-assistant/20190506/Channel/GetChannel")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetChannelRequest::builder)
                .basePath("/20190506")
                .appendPathParam("odaInstances")
                .appendPathParam(request.getOdaInstanceId())
                .appendPathParam("channels")
                .appendPathParam(request.getChannelId())
                .accept("application/json")
                .appendHeader("if-none-match", request.getIfNoneMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .handleBody(
                        com.oracle.bmc.oda.model.Channel.class, GetChannelResponse.Builder::channel)
                .handleResponseHeaderString("etag", GetChannelResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", GetChannelResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public GetDigitalAssistantResponse getDigitalAssistant(GetDigitalAssistantRequest request) {

        Validate.notBlank(request.getOdaInstanceId(), "odaInstanceId must not be blank");

        Validate.notBlank(request.getDigitalAssistantId(), "digitalAssistantId must not be blank");

        return clientCall(request, GetDigitalAssistantResponse::builder)
                .logger(LOG, "getDigitalAssistant")
                .serviceDetails(
                        "Management",
                        "GetDigitalAssistant",
                        "https://docs.oracle.com/iaas/api/#/en/digital-assistant/20190506/DigitalAssistant/GetDigitalAssistant")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetDigitalAssistantRequest::builder)
                .basePath("/20190506")
                .appendPathParam("odaInstances")
                .appendPathParam(request.getOdaInstanceId())
                .appendPathParam("digitalAssistants")
                .appendPathParam(request.getDigitalAssistantId())
                .accept("application/json")
                .appendHeader("if-none-match", request.getIfNoneMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .handleBody(
                        com.oracle.bmc.oda.model.DigitalAssistant.class,
                        GetDigitalAssistantResponse.Builder::digitalAssistant)
                .handleResponseHeaderString("etag", GetDigitalAssistantResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", GetDigitalAssistantResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public GetDigitalAssistantParameterResponse getDigitalAssistantParameter(
            GetDigitalAssistantParameterRequest request) {

        Validate.notBlank(request.getOdaInstanceId(), "odaInstanceId must not be blank");

        Validate.notBlank(request.getDigitalAssistantId(), "digitalAssistantId must not be blank");

        Validate.notBlank(request.getParameterName(), "parameterName must not be blank");

        return clientCall(request, GetDigitalAssistantParameterResponse::builder)
                .logger(LOG, "getDigitalAssistantParameter")
                .serviceDetails(
                        "Management",
                        "GetDigitalAssistantParameter",
                        "https://docs.oracle.com/iaas/api/#/en/digital-assistant/20190506/DigitalAssistantParameter/GetDigitalAssistantParameter")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetDigitalAssistantParameterRequest::builder)
                .basePath("/20190506")
                .appendPathParam("odaInstances")
                .appendPathParam(request.getOdaInstanceId())
                .appendPathParam("digitalAssistants")
                .appendPathParam(request.getDigitalAssistantId())
                .appendPathParam("parameters")
                .appendPathParam(request.getParameterName())
                .accept("application/json")
                .appendHeader("if-none-match", request.getIfNoneMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .handleBody(
                        com.oracle.bmc.oda.model.DigitalAssistantParameter.class,
                        GetDigitalAssistantParameterResponse.Builder::digitalAssistantParameter)
                .handleResponseHeaderString(
                        "etag", GetDigitalAssistantParameterResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id",
                        GetDigitalAssistantParameterResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public GetOdaPrivateEndpointResponse getOdaPrivateEndpoint(
            GetOdaPrivateEndpointRequest request) {

        Validate.notBlank(
                request.getOdaPrivateEndpointId(), "odaPrivateEndpointId must not be blank");

        return clientCall(request, GetOdaPrivateEndpointResponse::builder)
                .logger(LOG, "getOdaPrivateEndpoint")
                .serviceDetails(
                        "Management",
                        "GetOdaPrivateEndpoint",
                        "https://docs.oracle.com/iaas/api/#/en/digital-assistant/20190506/OdaPrivateEndpoint/GetOdaPrivateEndpoint")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetOdaPrivateEndpointRequest::builder)
                .basePath("/20190506")
                .appendPathParam("odaPrivateEndpoints")
                .appendPathParam(request.getOdaPrivateEndpointId())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .handleBody(
                        com.oracle.bmc.oda.model.OdaPrivateEndpoint.class,
                        GetOdaPrivateEndpointResponse.Builder::odaPrivateEndpoint)
                .handleResponseHeaderString("etag", GetOdaPrivateEndpointResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", GetOdaPrivateEndpointResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public GetOdaPrivateEndpointAttachmentResponse getOdaPrivateEndpointAttachment(
            GetOdaPrivateEndpointAttachmentRequest request) {

        Validate.notBlank(
                request.getOdaPrivateEndpointAttachmentId(),
                "odaPrivateEndpointAttachmentId must not be blank");

        return clientCall(request, GetOdaPrivateEndpointAttachmentResponse::builder)
                .logger(LOG, "getOdaPrivateEndpointAttachment")
                .serviceDetails(
                        "Management",
                        "GetOdaPrivateEndpointAttachment",
                        "https://docs.oracle.com/iaas/api/#/en/digital-assistant/20190506/OdaPrivateEndpointAttachment/GetOdaPrivateEndpointAttachment")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetOdaPrivateEndpointAttachmentRequest::builder)
                .basePath("/20190506")
                .appendPathParam("odaPrivateEndpointAttachments")
                .appendPathParam(request.getOdaPrivateEndpointAttachmentId())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .handleBody(
                        com.oracle.bmc.oda.model.OdaPrivateEndpointAttachment.class,
                        GetOdaPrivateEndpointAttachmentResponse.Builder
                                ::odaPrivateEndpointAttachment)
                .handleResponseHeaderString(
                        "etag", GetOdaPrivateEndpointAttachmentResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id",
                        GetOdaPrivateEndpointAttachmentResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public GetOdaPrivateEndpointScanProxyResponse getOdaPrivateEndpointScanProxy(
            GetOdaPrivateEndpointScanProxyRequest request) {

        Validate.notBlank(
                request.getOdaPrivateEndpointScanProxyId(),
                "odaPrivateEndpointScanProxyId must not be blank");

        Validate.notBlank(
                request.getOdaPrivateEndpointId(), "odaPrivateEndpointId must not be blank");

        return clientCall(request, GetOdaPrivateEndpointScanProxyResponse::builder)
                .logger(LOG, "getOdaPrivateEndpointScanProxy")
                .serviceDetails(
                        "Management",
                        "GetOdaPrivateEndpointScanProxy",
                        "https://docs.oracle.com/iaas/api/#/en/digital-assistant/20190506/OdaPrivateEndpointScanProxy/GetOdaPrivateEndpointScanProxy")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetOdaPrivateEndpointScanProxyRequest::builder)
                .basePath("/20190506")
                .appendPathParam("odaPrivateEndpoints")
                .appendPathParam(request.getOdaPrivateEndpointId())
                .appendPathParam("odaPrivateEndpointScanProxies")
                .appendPathParam(request.getOdaPrivateEndpointScanProxyId())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .handleBody(
                        com.oracle.bmc.oda.model.OdaPrivateEndpointScanProxy.class,
                        GetOdaPrivateEndpointScanProxyResponse.Builder::odaPrivateEndpointScanProxy)
                .handleResponseHeaderString(
                        "etag", GetOdaPrivateEndpointScanProxyResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id",
                        GetOdaPrivateEndpointScanProxyResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public GetSkillResponse getSkill(GetSkillRequest request) {

        Validate.notBlank(request.getOdaInstanceId(), "odaInstanceId must not be blank");

        Validate.notBlank(request.getSkillId(), "skillId must not be blank");

        return clientCall(request, GetSkillResponse::builder)
                .logger(LOG, "getSkill")
                .serviceDetails(
                        "Management",
                        "GetSkill",
                        "https://docs.oracle.com/iaas/api/#/en/digital-assistant/20190506/Skill/GetSkill")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetSkillRequest::builder)
                .basePath("/20190506")
                .appendPathParam("odaInstances")
                .appendPathParam(request.getOdaInstanceId())
                .appendPathParam("skills")
                .appendPathParam(request.getSkillId())
                .accept("application/json")
                .appendHeader("if-none-match", request.getIfNoneMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .handleBody(com.oracle.bmc.oda.model.Skill.class, GetSkillResponse.Builder::skill)
                .handleResponseHeaderString("etag", GetSkillResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", GetSkillResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public GetSkillParameterResponse getSkillParameter(GetSkillParameterRequest request) {

        Validate.notBlank(request.getOdaInstanceId(), "odaInstanceId must not be blank");

        Validate.notBlank(request.getSkillId(), "skillId must not be blank");

        Validate.notBlank(request.getParameterName(), "parameterName must not be blank");

        return clientCall(request, GetSkillParameterResponse::builder)
                .logger(LOG, "getSkillParameter")
                .serviceDetails(
                        "Management",
                        "GetSkillParameter",
                        "https://docs.oracle.com/iaas/api/#/en/digital-assistant/20190506/SkillParameter/GetSkillParameter")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetSkillParameterRequest::builder)
                .basePath("/20190506")
                .appendPathParam("odaInstances")
                .appendPathParam(request.getOdaInstanceId())
                .appendPathParam("skills")
                .appendPathParam(request.getSkillId())
                .appendPathParam("parameters")
                .appendPathParam(request.getParameterName())
                .accept("application/json")
                .appendHeader("if-none-match", request.getIfNoneMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .handleBody(
                        com.oracle.bmc.oda.model.SkillParameter.class,
                        GetSkillParameterResponse.Builder::skillParameter)
                .handleResponseHeaderString("etag", GetSkillParameterResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", GetSkillParameterResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public GetTranslatorResponse getTranslator(GetTranslatorRequest request) {

        Validate.notBlank(request.getOdaInstanceId(), "odaInstanceId must not be blank");

        Validate.notBlank(request.getTranslatorId(), "translatorId must not be blank");

        return clientCall(request, GetTranslatorResponse::builder)
                .logger(LOG, "getTranslator")
                .serviceDetails(
                        "Management",
                        "GetTranslator",
                        "https://docs.oracle.com/iaas/api/#/en/digital-assistant/20190506/Translator/GetTranslator")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetTranslatorRequest::builder)
                .basePath("/20190506")
                .appendPathParam("odaInstances")
                .appendPathParam(request.getOdaInstanceId())
                .appendPathParam("translators")
                .appendPathParam(request.getTranslatorId())
                .accept("application/json")
                .appendHeader("if-none-match", request.getIfNoneMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .handleBody(
                        com.oracle.bmc.oda.model.Translator.class,
                        GetTranslatorResponse.Builder::translator)
                .handleResponseHeaderString("etag", GetTranslatorResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", GetTranslatorResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public ImportBotResponse importBot(ImportBotRequest request) {

        Validate.notBlank(request.getOdaInstanceId(), "odaInstanceId must not be blank");
        Objects.requireNonNull(request.getImportBotDetails(), "importBotDetails is required");

        return clientCall(request, ImportBotResponse::builder)
                .logger(LOG, "importBot")
                .serviceDetails(
                        "Management",
                        "ImportBot",
                        "https://docs.oracle.com/iaas/api/#/en/digital-assistant/20190506/Bot/ImportBot")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(ImportBotRequest::builder)
                .basePath("/20190506")
                .appendPathParam("odaInstances")
                .appendPathParam(request.getOdaInstanceId())
                .appendPathParam("actions")
                .appendPathParam("importBot")
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .operationUsesDefaultRetries()
                .hasBody()
                .handleResponseHeaderString(
                        "opc-work-request-id", ImportBotResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", ImportBotResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public ListAuthenticationProvidersResponse listAuthenticationProviders(
            ListAuthenticationProvidersRequest request) {

        Validate.notBlank(request.getOdaInstanceId(), "odaInstanceId must not be blank");

        return clientCall(request, ListAuthenticationProvidersResponse::builder)
                .logger(LOG, "listAuthenticationProviders")
                .serviceDetails(
                        "Management",
                        "ListAuthenticationProviders",
                        "https://docs.oracle.com/iaas/api/#/en/digital-assistant/20190506/AuthenticationProvider/ListAuthenticationProviders")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListAuthenticationProvidersRequest::builder)
                .basePath("/20190506")
                .appendPathParam("odaInstances")
                .appendPathParam(request.getOdaInstanceId())
                .appendPathParam("authenticationProviders")
                .appendQueryParam("id", request.getId())
                .appendEnumQueryParam("identityProvider", request.getIdentityProvider())
                .appendQueryParam("name", request.getName())
                .appendEnumQueryParam("lifecycleState", request.getLifecycleState())
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .handleBody(
                        com.oracle.bmc.oda.model.AuthenticationProviderCollection.class,
                        ListAuthenticationProvidersResponse.Builder
                                ::authenticationProviderCollection)
                .handleResponseHeaderString(
                        "opc-request-id", ListAuthenticationProvidersResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListAuthenticationProvidersResponse.Builder::opcNextPage)
                .handleResponseHeaderInteger(
                        "opc-total-items",
                        ListAuthenticationProvidersResponse.Builder::opcTotalItems)
                .callSync();
    }

    @Override
    public ListChannelsResponse listChannels(ListChannelsRequest request) {

        Validate.notBlank(request.getOdaInstanceId(), "odaInstanceId must not be blank");

        return clientCall(request, ListChannelsResponse::builder)
                .logger(LOG, "listChannels")
                .serviceDetails(
                        "Management",
                        "ListChannels",
                        "https://docs.oracle.com/iaas/api/#/en/digital-assistant/20190506/Channel/ListChannels")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListChannelsRequest::builder)
                .basePath("/20190506")
                .appendPathParam("odaInstances")
                .appendPathParam(request.getOdaInstanceId())
                .appendPathParam("channels")
                .appendQueryParam("id", request.getId())
                .appendQueryParam("name", request.getName())
                .appendEnumQueryParam("category", request.getCategory())
                .appendEnumQueryParam("type", request.getType())
                .appendEnumQueryParam("lifecycleState", request.getLifecycleState())
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .handleBody(
                        com.oracle.bmc.oda.model.ChannelCollection.class,
                        ListChannelsResponse.Builder::channelCollection)
                .handleResponseHeaderString(
                        "opc-request-id", ListChannelsResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListChannelsResponse.Builder::opcNextPage)
                .handleResponseHeaderInteger(
                        "opc-total-items", ListChannelsResponse.Builder::opcTotalItems)
                .callSync();
    }

    @Override
    public ListDigitalAssistantParametersResponse listDigitalAssistantParameters(
            ListDigitalAssistantParametersRequest request) {

        Validate.notBlank(request.getOdaInstanceId(), "odaInstanceId must not be blank");

        Validate.notBlank(request.getDigitalAssistantId(), "digitalAssistantId must not be blank");

        return clientCall(request, ListDigitalAssistantParametersResponse::builder)
                .logger(LOG, "listDigitalAssistantParameters")
                .serviceDetails(
                        "Management",
                        "ListDigitalAssistantParameters",
                        "https://docs.oracle.com/iaas/api/#/en/digital-assistant/20190506/DigitalAssistantParameter/ListDigitalAssistantParameters")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListDigitalAssistantParametersRequest::builder)
                .basePath("/20190506")
                .appendPathParam("odaInstances")
                .appendPathParam(request.getOdaInstanceId())
                .appendPathParam("digitalAssistants")
                .appendPathParam(request.getDigitalAssistantId())
                .appendPathParam("parameters")
                .appendQueryParam("name", request.getName())
                .appendEnumQueryParam("lifecycleState", request.getLifecycleState())
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .handleBody(
                        com.oracle.bmc.oda.model.DigitalAssistantParameterCollection.class,
                        ListDigitalAssistantParametersResponse.Builder
                                ::digitalAssistantParameterCollection)
                .handleResponseHeaderString(
                        "opc-request-id",
                        ListDigitalAssistantParametersResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page",
                        ListDigitalAssistantParametersResponse.Builder::opcNextPage)
                .handleResponseHeaderInteger(
                        "opc-total-items",
                        ListDigitalAssistantParametersResponse.Builder::opcTotalItems)
                .callSync();
    }

    @Override
    public ListDigitalAssistantsResponse listDigitalAssistants(
            ListDigitalAssistantsRequest request) {

        Validate.notBlank(request.getOdaInstanceId(), "odaInstanceId must not be blank");

        return clientCall(request, ListDigitalAssistantsResponse::builder)
                .logger(LOG, "listDigitalAssistants")
                .serviceDetails(
                        "Management",
                        "ListDigitalAssistants",
                        "https://docs.oracle.com/iaas/api/#/en/digital-assistant/20190506/DigitalAssistant/ListDigitalAssistants")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListDigitalAssistantsRequest::builder)
                .basePath("/20190506")
                .appendPathParam("odaInstances")
                .appendPathParam(request.getOdaInstanceId())
                .appendPathParam("digitalAssistants")
                .appendQueryParam("id", request.getId())
                .appendQueryParam("category", request.getCategory())
                .appendQueryParam("name", request.getName())
                .appendQueryParam("version", request.getVersion())
                .appendQueryParam("namespace", request.getNamespace())
                .appendQueryParam("platformVersion", request.getPlatformVersion())
                .appendEnumQueryParam("lifecycleState", request.getLifecycleState())
                .appendQueryParam("lifecycleDetails", request.getLifecycleDetails())
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .handleBody(
                        com.oracle.bmc.oda.model.DigitalAssistantCollection.class,
                        ListDigitalAssistantsResponse.Builder::digitalAssistantCollection)
                .handleResponseHeaderString(
                        "opc-request-id", ListDigitalAssistantsResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListDigitalAssistantsResponse.Builder::opcNextPage)
                .handleResponseHeaderInteger(
                        "opc-total-items", ListDigitalAssistantsResponse.Builder::opcTotalItems)
                .callSync();
    }

    @Override
    public ListOdaPrivateEndpointAttachmentsResponse listOdaPrivateEndpointAttachments(
            ListOdaPrivateEndpointAttachmentsRequest request) {
        Objects.requireNonNull(
                request.getOdaPrivateEndpointId(), "odaPrivateEndpointId is required");

        Objects.requireNonNull(request.getCompartmentId(), "compartmentId is required");

        return clientCall(request, ListOdaPrivateEndpointAttachmentsResponse::builder)
                .logger(LOG, "listOdaPrivateEndpointAttachments")
                .serviceDetails(
                        "Management",
                        "ListOdaPrivateEndpointAttachments",
                        "https://docs.oracle.com/iaas/api/#/en/digital-assistant/20190506/OdaPrivateEndpointAttachment/ListOdaPrivateEndpointAttachments")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListOdaPrivateEndpointAttachmentsRequest::builder)
                .basePath("/20190506")
                .appendPathParam("odaPrivateEndpointAttachments")
                .appendQueryParam("odaPrivateEndpointId", request.getOdaPrivateEndpointId())
                .appendQueryParam("compartmentId", request.getCompartmentId())
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .appendEnumQueryParam("lifecycleState", request.getLifecycleState())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .handleBody(
                        com.oracle.bmc.oda.model.OdaPrivateEndpointAttachmentCollection.class,
                        ListOdaPrivateEndpointAttachmentsResponse.Builder
                                ::odaPrivateEndpointAttachmentCollection)
                .handleResponseHeaderString(
                        "opc-request-id",
                        ListOdaPrivateEndpointAttachmentsResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page",
                        ListOdaPrivateEndpointAttachmentsResponse.Builder::opcNextPage)
                .handleResponseHeaderInteger(
                        "opc-total-items",
                        ListOdaPrivateEndpointAttachmentsResponse.Builder::opcTotalItems)
                .callSync();
    }

    @Override
    public ListOdaPrivateEndpointScanProxiesResponse listOdaPrivateEndpointScanProxies(
            ListOdaPrivateEndpointScanProxiesRequest request) {

        Validate.notBlank(
                request.getOdaPrivateEndpointId(), "odaPrivateEndpointId must not be blank");

        return clientCall(request, ListOdaPrivateEndpointScanProxiesResponse::builder)
                .logger(LOG, "listOdaPrivateEndpointScanProxies")
                .serviceDetails(
                        "Management",
                        "ListOdaPrivateEndpointScanProxies",
                        "https://docs.oracle.com/iaas/api/#/en/digital-assistant/20190506/OdaPrivateEndpointScanProxy/ListOdaPrivateEndpointScanProxies")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListOdaPrivateEndpointScanProxiesRequest::builder)
                .basePath("/20190506")
                .appendPathParam("odaPrivateEndpoints")
                .appendPathParam(request.getOdaPrivateEndpointId())
                .appendPathParam("odaPrivateEndpointScanProxies")
                .appendEnumQueryParam("lifecycleState", request.getLifecycleState())
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .handleBody(
                        com.oracle.bmc.oda.model.OdaPrivateEndpointScanProxyCollection.class,
                        ListOdaPrivateEndpointScanProxiesResponse.Builder
                                ::odaPrivateEndpointScanProxyCollection)
                .handleResponseHeaderString(
                        "opc-request-id",
                        ListOdaPrivateEndpointScanProxiesResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page",
                        ListOdaPrivateEndpointScanProxiesResponse.Builder::opcNextPage)
                .handleResponseHeaderInteger(
                        "opc-total-items",
                        ListOdaPrivateEndpointScanProxiesResponse.Builder::opcTotalItems)
                .callSync();
    }

    @Override
    public ListOdaPrivateEndpointsResponse listOdaPrivateEndpoints(
            ListOdaPrivateEndpointsRequest request) {
        Objects.requireNonNull(request.getCompartmentId(), "compartmentId is required");

        return clientCall(request, ListOdaPrivateEndpointsResponse::builder)
                .logger(LOG, "listOdaPrivateEndpoints")
                .serviceDetails(
                        "Management",
                        "ListOdaPrivateEndpoints",
                        "https://docs.oracle.com/iaas/api/#/en/digital-assistant/20190506/OdaPrivateEndpoint/ListOdaPrivateEndpoints")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListOdaPrivateEndpointsRequest::builder)
                .basePath("/20190506")
                .appendPathParam("odaPrivateEndpoints")
                .appendQueryParam("compartmentId", request.getCompartmentId())
                .appendQueryParam("displayName", request.getDisplayName())
                .appendEnumQueryParam("lifecycleState", request.getLifecycleState())
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .handleBody(
                        com.oracle.bmc.oda.model.OdaPrivateEndpointCollection.class,
                        ListOdaPrivateEndpointsResponse.Builder::odaPrivateEndpointCollection)
                .handleResponseHeaderString(
                        "opc-request-id", ListOdaPrivateEndpointsResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListOdaPrivateEndpointsResponse.Builder::opcNextPage)
                .handleResponseHeaderInteger(
                        "opc-total-items", ListOdaPrivateEndpointsResponse.Builder::opcTotalItems)
                .callSync();
    }

    @Override
    public ListSkillParametersResponse listSkillParameters(ListSkillParametersRequest request) {

        Validate.notBlank(request.getOdaInstanceId(), "odaInstanceId must not be blank");

        Validate.notBlank(request.getSkillId(), "skillId must not be blank");

        return clientCall(request, ListSkillParametersResponse::builder)
                .logger(LOG, "listSkillParameters")
                .serviceDetails(
                        "Management",
                        "ListSkillParameters",
                        "https://docs.oracle.com/iaas/api/#/en/digital-assistant/20190506/SkillParameter/ListSkillParameters")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListSkillParametersRequest::builder)
                .basePath("/20190506")
                .appendPathParam("odaInstances")
                .appendPathParam(request.getOdaInstanceId())
                .appendPathParam("skills")
                .appendPathParam(request.getSkillId())
                .appendPathParam("parameters")
                .appendQueryParam("name", request.getName())
                .appendEnumQueryParam("lifecycleState", request.getLifecycleState())
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .handleBody(
                        com.oracle.bmc.oda.model.SkillParameterCollection.class,
                        ListSkillParametersResponse.Builder::skillParameterCollection)
                .handleResponseHeaderString(
                        "opc-request-id", ListSkillParametersResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListSkillParametersResponse.Builder::opcNextPage)
                .handleResponseHeaderInteger(
                        "opc-total-items", ListSkillParametersResponse.Builder::opcTotalItems)
                .callSync();
    }

    @Override
    public ListSkillsResponse listSkills(ListSkillsRequest request) {

        Validate.notBlank(request.getOdaInstanceId(), "odaInstanceId must not be blank");

        return clientCall(request, ListSkillsResponse::builder)
                .logger(LOG, "listSkills")
                .serviceDetails(
                        "Management",
                        "ListSkills",
                        "https://docs.oracle.com/iaas/api/#/en/digital-assistant/20190506/Skill/ListSkills")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListSkillsRequest::builder)
                .basePath("/20190506")
                .appendPathParam("odaInstances")
                .appendPathParam(request.getOdaInstanceId())
                .appendPathParam("skills")
                .appendQueryParam("id", request.getId())
                .appendQueryParam("category", request.getCategory())
                .appendQueryParam("name", request.getName())
                .appendQueryParam("version", request.getVersion())
                .appendQueryParam("namespace", request.getNamespace())
                .appendQueryParam("platformVersion", request.getPlatformVersion())
                .appendEnumQueryParam("lifecycleState", request.getLifecycleState())
                .appendQueryParam("lifecycleDetails", request.getLifecycleDetails())
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .handleBody(
                        com.oracle.bmc.oda.model.SkillCollection.class,
                        ListSkillsResponse.Builder::skillCollection)
                .handleResponseHeaderString(
                        "opc-request-id", ListSkillsResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListSkillsResponse.Builder::opcNextPage)
                .handleResponseHeaderInteger(
                        "opc-total-items", ListSkillsResponse.Builder::opcTotalItems)
                .callSync();
    }

    @Override
    public ListTranslatorsResponse listTranslators(ListTranslatorsRequest request) {

        Validate.notBlank(request.getOdaInstanceId(), "odaInstanceId must not be blank");

        return clientCall(request, ListTranslatorsResponse::builder)
                .logger(LOG, "listTranslators")
                .serviceDetails(
                        "Management",
                        "ListTranslators",
                        "https://docs.oracle.com/iaas/api/#/en/digital-assistant/20190506/Translator/ListTranslators")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListTranslatorsRequest::builder)
                .basePath("/20190506")
                .appendPathParam("odaInstances")
                .appendPathParam(request.getOdaInstanceId())
                .appendPathParam("translators")
                .appendQueryParam("id", request.getId())
                .appendEnumQueryParam("type", request.getType())
                .appendQueryParam("name", request.getName())
                .appendEnumQueryParam("lifecycleState", request.getLifecycleState())
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .handleBody(
                        com.oracle.bmc.oda.model.TranslatorCollection.class,
                        ListTranslatorsResponse.Builder::translatorCollection)
                .handleResponseHeaderString(
                        "opc-request-id", ListTranslatorsResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListTranslatorsResponse.Builder::opcNextPage)
                .handleResponseHeaderInteger(
                        "opc-total-items", ListTranslatorsResponse.Builder::opcTotalItems)
                .callSync();
    }

    @Override
    public PublishDigitalAssistantResponse publishDigitalAssistant(
            PublishDigitalAssistantRequest request) {

        Validate.notBlank(request.getOdaInstanceId(), "odaInstanceId must not be blank");

        Validate.notBlank(request.getDigitalAssistantId(), "digitalAssistantId must not be blank");

        return clientCall(request, PublishDigitalAssistantResponse::builder)
                .logger(LOG, "publishDigitalAssistant")
                .serviceDetails(
                        "Management",
                        "PublishDigitalAssistant",
                        "https://docs.oracle.com/iaas/api/#/en/digital-assistant/20190506/DigitalAssistant/PublishDigitalAssistant")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(PublishDigitalAssistantRequest::builder)
                .basePath("/20190506")
                .appendPathParam("odaInstances")
                .appendPathParam(request.getOdaInstanceId())
                .appendPathParam("digitalAssistants")
                .appendPathParam(request.getDigitalAssistantId())
                .appendPathParam("actions")
                .appendPathParam("publish")
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .handleBody(
                        com.oracle.bmc.oda.model.DigitalAssistant.class,
                        PublishDigitalAssistantResponse.Builder::digitalAssistant)
                .handleResponseHeaderString("etag", PublishDigitalAssistantResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", PublishDigitalAssistantResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public PublishSkillResponse publishSkill(PublishSkillRequest request) {

        Validate.notBlank(request.getOdaInstanceId(), "odaInstanceId must not be blank");

        Validate.notBlank(request.getSkillId(), "skillId must not be blank");

        return clientCall(request, PublishSkillResponse::builder)
                .logger(LOG, "publishSkill")
                .serviceDetails(
                        "Management",
                        "PublishSkill",
                        "https://docs.oracle.com/iaas/api/#/en/digital-assistant/20190506/Skill/PublishSkill")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(PublishSkillRequest::builder)
                .basePath("/20190506")
                .appendPathParam("odaInstances")
                .appendPathParam(request.getOdaInstanceId())
                .appendPathParam("skills")
                .appendPathParam(request.getSkillId())
                .appendPathParam("actions")
                .appendPathParam("publish")
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .handleBody(
                        com.oracle.bmc.oda.model.Skill.class, PublishSkillResponse.Builder::skill)
                .handleResponseHeaderString("etag", PublishSkillResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", PublishSkillResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public RotateChannelKeysResponse rotateChannelKeys(RotateChannelKeysRequest request) {

        Validate.notBlank(request.getOdaInstanceId(), "odaInstanceId must not be blank");

        Validate.notBlank(request.getChannelId(), "channelId must not be blank");

        return clientCall(request, RotateChannelKeysResponse::builder)
                .logger(LOG, "rotateChannelKeys")
                .serviceDetails(
                        "Management",
                        "RotateChannelKeys",
                        "https://docs.oracle.com/iaas/api/#/en/digital-assistant/20190506/Channel/RotateChannelKeys")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(RotateChannelKeysRequest::builder)
                .basePath("/20190506")
                .appendPathParam("odaInstances")
                .appendPathParam(request.getOdaInstanceId())
                .appendPathParam("channels")
                .appendPathParam(request.getChannelId())
                .appendPathParam("actions")
                .appendPathParam("rotateKeys")
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("if-match", request.getIfMatch())
                .operationUsesDefaultRetries()
                .handleBody(
                        com.oracle.bmc.oda.model.CreateChannelResult.class,
                        RotateChannelKeysResponse.Builder::createChannelResult)
                .handleResponseHeaderString("etag", RotateChannelKeysResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", RotateChannelKeysResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public StartChannelResponse startChannel(StartChannelRequest request) {

        Validate.notBlank(request.getOdaInstanceId(), "odaInstanceId must not be blank");

        Validate.notBlank(request.getChannelId(), "channelId must not be blank");

        return clientCall(request, StartChannelResponse::builder)
                .logger(LOG, "startChannel")
                .serviceDetails(
                        "Management",
                        "StartChannel",
                        "https://docs.oracle.com/iaas/api/#/en/digital-assistant/20190506/Channel/StartChannel")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(StartChannelRequest::builder)
                .basePath("/20190506")
                .appendPathParam("odaInstances")
                .appendPathParam(request.getOdaInstanceId())
                .appendPathParam("channels")
                .appendPathParam(request.getChannelId())
                .appendPathParam("actions")
                .appendPathParam("start")
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("if-match", request.getIfMatch())
                .operationUsesDefaultRetries()
                .handleBody(
                        com.oracle.bmc.oda.model.Channel.class,
                        StartChannelResponse.Builder::channel)
                .handleResponseHeaderString("etag", StartChannelResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", StartChannelResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public StopChannelResponse stopChannel(StopChannelRequest request) {

        Validate.notBlank(request.getOdaInstanceId(), "odaInstanceId must not be blank");

        Validate.notBlank(request.getChannelId(), "channelId must not be blank");

        return clientCall(request, StopChannelResponse::builder)
                .logger(LOG, "stopChannel")
                .serviceDetails(
                        "Management",
                        "StopChannel",
                        "https://docs.oracle.com/iaas/api/#/en/digital-assistant/20190506/Channel/StopChannel")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(StopChannelRequest::builder)
                .basePath("/20190506")
                .appendPathParam("odaInstances")
                .appendPathParam(request.getOdaInstanceId())
                .appendPathParam("channels")
                .appendPathParam(request.getChannelId())
                .appendPathParam("actions")
                .appendPathParam("stop")
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("if-match", request.getIfMatch())
                .operationUsesDefaultRetries()
                .handleBody(
                        com.oracle.bmc.oda.model.Channel.class,
                        StopChannelResponse.Builder::channel)
                .handleResponseHeaderString("etag", StopChannelResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", StopChannelResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public TrainSkillResponse trainSkill(TrainSkillRequest request) {

        Validate.notBlank(request.getOdaInstanceId(), "odaInstanceId must not be blank");

        Validate.notBlank(request.getSkillId(), "skillId must not be blank");
        Objects.requireNonNull(request.getTrainSkillDetails(), "trainSkillDetails is required");

        return clientCall(request, TrainSkillResponse::builder)
                .logger(LOG, "trainSkill")
                .serviceDetails(
                        "Management",
                        "TrainSkill",
                        "https://docs.oracle.com/iaas/api/#/en/digital-assistant/20190506/Skill/TrainSkill")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(TrainSkillRequest::builder)
                .basePath("/20190506")
                .appendPathParam("odaInstances")
                .appendPathParam(request.getOdaInstanceId())
                .appendPathParam("skills")
                .appendPathParam(request.getSkillId())
                .appendPathParam("actions")
                .appendPathParam("train")
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .operationUsesDefaultRetries()
                .hasBody()
                .handleResponseHeaderString(
                        "opc-request-id", TrainSkillResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-work-request-id", TrainSkillResponse.Builder::opcWorkRequestId)
                .callSync();
    }

    @Override
    public UpdateAuthenticationProviderResponse updateAuthenticationProvider(
            UpdateAuthenticationProviderRequest request) {

        Validate.notBlank(request.getOdaInstanceId(), "odaInstanceId must not be blank");

        Validate.notBlank(
                request.getAuthenticationProviderId(),
                "authenticationProviderId must not be blank");
        Objects.requireNonNull(
                request.getUpdateAuthenticationProviderDetails(),
                "updateAuthenticationProviderDetails is required");

        return clientCall(request, UpdateAuthenticationProviderResponse::builder)
                .logger(LOG, "updateAuthenticationProvider")
                .serviceDetails(
                        "Management",
                        "UpdateAuthenticationProvider",
                        "https://docs.oracle.com/iaas/api/#/en/digital-assistant/20190506/AuthenticationProvider/UpdateAuthenticationProvider")
                .method(com.oracle.bmc.http.client.Method.PUT)
                .requestBuilder(UpdateAuthenticationProviderRequest::builder)
                .basePath("/20190506")
                .appendPathParam("odaInstances")
                .appendPathParam(request.getOdaInstanceId())
                .appendPathParam("authenticationProviders")
                .appendPathParam(request.getAuthenticationProviderId())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .hasBody()
                .handleBody(
                        com.oracle.bmc.oda.model.AuthenticationProvider.class,
                        UpdateAuthenticationProviderResponse.Builder::authenticationProvider)
                .handleResponseHeaderString(
                        "etag", UpdateAuthenticationProviderResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id",
                        UpdateAuthenticationProviderResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public UpdateChannelResponse updateChannel(UpdateChannelRequest request) {

        Validate.notBlank(request.getOdaInstanceId(), "odaInstanceId must not be blank");

        Validate.notBlank(request.getChannelId(), "channelId must not be blank");
        Objects.requireNonNull(
                request.getUpdateChannelDetails(), "updateChannelDetails is required");

        return clientCall(request, UpdateChannelResponse::builder)
                .logger(LOG, "updateChannel")
                .serviceDetails(
                        "Management",
                        "UpdateChannel",
                        "https://docs.oracle.com/iaas/api/#/en/digital-assistant/20190506/Channel/UpdateChannel")
                .method(com.oracle.bmc.http.client.Method.PUT)
                .requestBuilder(UpdateChannelRequest::builder)
                .basePath("/20190506")
                .appendPathParam("odaInstances")
                .appendPathParam(request.getOdaInstanceId())
                .appendPathParam("channels")
                .appendPathParam(request.getChannelId())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .hasBody()
                .handleBody(
                        com.oracle.bmc.oda.model.Channel.class,
                        UpdateChannelResponse.Builder::channel)
                .handleResponseHeaderString("etag", UpdateChannelResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", UpdateChannelResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public UpdateDigitalAssistantResponse updateDigitalAssistant(
            UpdateDigitalAssistantRequest request) {

        Validate.notBlank(request.getOdaInstanceId(), "odaInstanceId must not be blank");

        Validate.notBlank(request.getDigitalAssistantId(), "digitalAssistantId must not be blank");
        Objects.requireNonNull(
                request.getUpdateDigitalAssistantDetails(),
                "updateDigitalAssistantDetails is required");

        return clientCall(request, UpdateDigitalAssistantResponse::builder)
                .logger(LOG, "updateDigitalAssistant")
                .serviceDetails(
                        "Management",
                        "UpdateDigitalAssistant",
                        "https://docs.oracle.com/iaas/api/#/en/digital-assistant/20190506/DigitalAssistant/UpdateDigitalAssistant")
                .method(com.oracle.bmc.http.client.Method.PUT)
                .requestBuilder(UpdateDigitalAssistantRequest::builder)
                .basePath("/20190506")
                .appendPathParam("odaInstances")
                .appendPathParam(request.getOdaInstanceId())
                .appendPathParam("digitalAssistants")
                .appendPathParam(request.getDigitalAssistantId())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .hasBody()
                .handleBody(
                        com.oracle.bmc.oda.model.DigitalAssistant.class,
                        UpdateDigitalAssistantResponse.Builder::digitalAssistant)
                .handleResponseHeaderString("etag", UpdateDigitalAssistantResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", UpdateDigitalAssistantResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public UpdateDigitalAssistantParameterResponse updateDigitalAssistantParameter(
            UpdateDigitalAssistantParameterRequest request) {

        Validate.notBlank(request.getOdaInstanceId(), "odaInstanceId must not be blank");

        Validate.notBlank(request.getDigitalAssistantId(), "digitalAssistantId must not be blank");

        Validate.notBlank(request.getParameterName(), "parameterName must not be blank");
        Objects.requireNonNull(
                request.getUpdateDigitalAssistantParameterDetails(),
                "updateDigitalAssistantParameterDetails is required");

        return clientCall(request, UpdateDigitalAssistantParameterResponse::builder)
                .logger(LOG, "updateDigitalAssistantParameter")
                .serviceDetails(
                        "Management",
                        "UpdateDigitalAssistantParameter",
                        "https://docs.oracle.com/iaas/api/#/en/digital-assistant/20190506/DigitalAssistantParameter/UpdateDigitalAssistantParameter")
                .method(com.oracle.bmc.http.client.Method.PUT)
                .requestBuilder(UpdateDigitalAssistantParameterRequest::builder)
                .basePath("/20190506")
                .appendPathParam("odaInstances")
                .appendPathParam(request.getOdaInstanceId())
                .appendPathParam("digitalAssistants")
                .appendPathParam(request.getDigitalAssistantId())
                .appendPathParam("parameters")
                .appendPathParam(request.getParameterName())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .hasBody()
                .handleBody(
                        com.oracle.bmc.oda.model.DigitalAssistantParameter.class,
                        UpdateDigitalAssistantParameterResponse.Builder::digitalAssistantParameter)
                .handleResponseHeaderString(
                        "etag", UpdateDigitalAssistantParameterResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id",
                        UpdateDigitalAssistantParameterResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public UpdateOdaPrivateEndpointResponse updateOdaPrivateEndpoint(
            UpdateOdaPrivateEndpointRequest request) {

        Validate.notBlank(
                request.getOdaPrivateEndpointId(), "odaPrivateEndpointId must not be blank");
        Objects.requireNonNull(
                request.getUpdateOdaPrivateEndpointDetails(),
                "updateOdaPrivateEndpointDetails is required");

        return clientCall(request, UpdateOdaPrivateEndpointResponse::builder)
                .logger(LOG, "updateOdaPrivateEndpoint")
                .serviceDetails(
                        "Management",
                        "UpdateOdaPrivateEndpoint",
                        "https://docs.oracle.com/iaas/api/#/en/digital-assistant/20190506/OdaPrivateEndpoint/UpdateOdaPrivateEndpoint")
                .method(com.oracle.bmc.http.client.Method.PUT)
                .requestBuilder(UpdateOdaPrivateEndpointRequest::builder)
                .basePath("/20190506")
                .appendPathParam("odaPrivateEndpoints")
                .appendPathParam(request.getOdaPrivateEndpointId())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .hasBody()
                .handleResponseHeaderString(
                        "opc-request-id", UpdateOdaPrivateEndpointResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        UpdateOdaPrivateEndpointResponse.Builder::opcWorkRequestId)
                .callSync();
    }

    @Override
    public UpdateSkillResponse updateSkill(UpdateSkillRequest request) {

        Validate.notBlank(request.getOdaInstanceId(), "odaInstanceId must not be blank");

        Validate.notBlank(request.getSkillId(), "skillId must not be blank");
        Objects.requireNonNull(request.getUpdateSkillDetails(), "updateSkillDetails is required");

        return clientCall(request, UpdateSkillResponse::builder)
                .logger(LOG, "updateSkill")
                .serviceDetails(
                        "Management",
                        "UpdateSkill",
                        "https://docs.oracle.com/iaas/api/#/en/digital-assistant/20190506/Skill/UpdateSkill")
                .method(com.oracle.bmc.http.client.Method.PUT)
                .requestBuilder(UpdateSkillRequest::builder)
                .basePath("/20190506")
                .appendPathParam("odaInstances")
                .appendPathParam(request.getOdaInstanceId())
                .appendPathParam("skills")
                .appendPathParam(request.getSkillId())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .hasBody()
                .handleBody(
                        com.oracle.bmc.oda.model.Skill.class, UpdateSkillResponse.Builder::skill)
                .handleResponseHeaderString("etag", UpdateSkillResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", UpdateSkillResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public UpdateSkillParameterResponse updateSkillParameter(UpdateSkillParameterRequest request) {

        Validate.notBlank(request.getOdaInstanceId(), "odaInstanceId must not be blank");

        Validate.notBlank(request.getSkillId(), "skillId must not be blank");

        Validate.notBlank(request.getParameterName(), "parameterName must not be blank");
        Objects.requireNonNull(
                request.getUpdateSkillParameterDetails(),
                "updateSkillParameterDetails is required");

        return clientCall(request, UpdateSkillParameterResponse::builder)
                .logger(LOG, "updateSkillParameter")
                .serviceDetails(
                        "Management",
                        "UpdateSkillParameter",
                        "https://docs.oracle.com/iaas/api/#/en/digital-assistant/20190506/SkillParameter/UpdateSkillParameter")
                .method(com.oracle.bmc.http.client.Method.PUT)
                .requestBuilder(UpdateSkillParameterRequest::builder)
                .basePath("/20190506")
                .appendPathParam("odaInstances")
                .appendPathParam(request.getOdaInstanceId())
                .appendPathParam("skills")
                .appendPathParam(request.getSkillId())
                .appendPathParam("parameters")
                .appendPathParam(request.getParameterName())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .hasBody()
                .handleBody(
                        com.oracle.bmc.oda.model.SkillParameter.class,
                        UpdateSkillParameterResponse.Builder::skillParameter)
                .handleResponseHeaderString("etag", UpdateSkillParameterResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", UpdateSkillParameterResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public UpdateTranslatorResponse updateTranslator(UpdateTranslatorRequest request) {

        Validate.notBlank(request.getOdaInstanceId(), "odaInstanceId must not be blank");

        Validate.notBlank(request.getTranslatorId(), "translatorId must not be blank");
        Objects.requireNonNull(
                request.getUpdateTranslatorDetails(), "updateTranslatorDetails is required");

        return clientCall(request, UpdateTranslatorResponse::builder)
                .logger(LOG, "updateTranslator")
                .serviceDetails(
                        "Management",
                        "UpdateTranslator",
                        "https://docs.oracle.com/iaas/api/#/en/digital-assistant/20190506/Translator/UpdateTranslator")
                .method(com.oracle.bmc.http.client.Method.PUT)
                .requestBuilder(UpdateTranslatorRequest::builder)
                .basePath("/20190506")
                .appendPathParam("odaInstances")
                .appendPathParam(request.getOdaInstanceId())
                .appendPathParam("translators")
                .appendPathParam(request.getTranslatorId())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .hasBody()
                .handleBody(
                        com.oracle.bmc.oda.model.Translator.class,
                        UpdateTranslatorResponse.Builder::translator)
                .handleResponseHeaderString("etag", UpdateTranslatorResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", UpdateTranslatorResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public ManagementWaiters getWaiters() {
        return waiters;
    }

    @Override
    public ManagementPaginators getPaginators() {
        return paginators;
    }

    /**
     * Create a new client instance.
     *
     * @param authenticationDetailsProvider The authentication details (see {@link Builder#build})
     * @deprecated Use the {@link #builder() builder} instead.
     */
    @Deprecated
    public ManagementClient(
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
    public ManagementClient(
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
    public ManagementClient(
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
    public ManagementClient(
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
    public ManagementClient(
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
    public ManagementClient(
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
    public ManagementClient(
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
    public ManagementClient(
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
