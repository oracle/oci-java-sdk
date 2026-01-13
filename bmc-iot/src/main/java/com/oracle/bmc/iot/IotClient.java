/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.iot;

import com.oracle.bmc.util.internal.Validate;
import com.oracle.bmc.iot.requests.*;
import com.oracle.bmc.iot.responses.*;
import com.oracle.bmc.circuitbreaker.CircuitBreakerConfiguration;
import com.oracle.bmc.util.CircuitBreakerUtils;

import java.util.Objects;

@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20250531")
public class IotClient extends com.oracle.bmc.http.internal.BaseSyncClient implements Iot {
    /** Service instance for Iot. */
    public static final com.oracle.bmc.Service SERVICE =
            com.oracle.bmc.Services.serviceBuilder()
                    .serviceName(IotClient.class.getName())
                    .serviceEndpointPrefix("")
                    .serviceEndpointTemplate("https://iot.{region}.oci.{secondLevelDomain}")
                    .build();

    private static final org.slf4j.Logger LOG = org.slf4j.LoggerFactory.getLogger(IotClient.class);

    private final IotWaiters waiters;

    private final IotPaginators paginators;

    IotClient(
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
                                    .nameFormat("Iot-waiters-%d")
                                    .build());
            threadPoolExecutor.allowCoreThreadTimeOut(true);

            executorService = threadPoolExecutor;
        }
        this.waiters = new IotWaiters(executorService, this);

        this.paginators = new IotPaginators(this);
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
            extends com.oracle.bmc.common.RegionalClientBuilder<Builder, IotClient> {
        private java.util.concurrent.ExecutorService executorService;

        private Builder(com.oracle.bmc.Service service) {
            super(service);
            final String packageName = "iot";
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
        public IotClient build(
                @jakarta.annotation.Nonnull
                        com.oracle.bmc.auth.AbstractAuthenticationDetailsProvider
                                authenticationDetailsProvider) {
            return new IotClient(this, authenticationDetailsProvider, executorService);
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
    public ChangeIotDomainCompartmentResponse changeIotDomainCompartment(
            ChangeIotDomainCompartmentRequest request) {

        Validate.notBlank(request.getIotDomainId(), "iotDomainId must not be blank");
        Objects.requireNonNull(
                request.getChangeIotDomainCompartmentDetails(),
                "changeIotDomainCompartmentDetails is required");

        return clientCall(request, ChangeIotDomainCompartmentResponse::builder)
                .logger(LOG, "changeIotDomainCompartment")
                .serviceDetails(
                        "Iot",
                        "ChangeIotDomainCompartment",
                        "https://docs.oracle.com/iaas/api/#/en/iot/20250531/IotDomain/ChangeIotDomainCompartment")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(ChangeIotDomainCompartmentRequest::builder)
                .basePath("/20250531")
                .appendPathParam("iotDomains")
                .appendPathParam(request.getIotDomainId())
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
                        ChangeIotDomainCompartmentResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", ChangeIotDomainCompartmentResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public ChangeIotDomainDataRetentionPeriodResponse changeIotDomainDataRetentionPeriod(
            ChangeIotDomainDataRetentionPeriodRequest request) {

        Validate.notBlank(request.getIotDomainId(), "iotDomainId must not be blank");
        Objects.requireNonNull(
                request.getChangeIotDomainDataRetentionPeriodDetails(),
                "changeIotDomainDataRetentionPeriodDetails is required");

        return clientCall(request, ChangeIotDomainDataRetentionPeriodResponse::builder)
                .logger(LOG, "changeIotDomainDataRetentionPeriod")
                .serviceDetails(
                        "Iot",
                        "ChangeIotDomainDataRetentionPeriod",
                        "https://docs.oracle.com/iaas/api/#/en/iot/20250531/IotDomain/ChangeIotDomainDataRetentionPeriod")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(ChangeIotDomainDataRetentionPeriodRequest::builder)
                .basePath("/20250531")
                .appendPathParam("iotDomains")
                .appendPathParam(request.getIotDomainId())
                .appendPathParam("actions")
                .appendPathParam("changeDataRetentionPeriod")
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .operationUsesDefaultRetries()
                .hasBody()
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        ChangeIotDomainDataRetentionPeriodResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id",
                        ChangeIotDomainDataRetentionPeriodResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public ChangeIotDomainGroupCompartmentResponse changeIotDomainGroupCompartment(
            ChangeIotDomainGroupCompartmentRequest request) {

        Validate.notBlank(request.getIotDomainGroupId(), "iotDomainGroupId must not be blank");
        Objects.requireNonNull(
                request.getChangeIotDomainGroupCompartmentDetails(),
                "changeIotDomainGroupCompartmentDetails is required");

        return clientCall(request, ChangeIotDomainGroupCompartmentResponse::builder)
                .logger(LOG, "changeIotDomainGroupCompartment")
                .serviceDetails(
                        "Iot",
                        "ChangeIotDomainGroupCompartment",
                        "https://docs.oracle.com/iaas/api/#/en/iot/20250531/IotDomainGroup/ChangeIotDomainGroupCompartment")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(ChangeIotDomainGroupCompartmentRequest::builder)
                .basePath("/20250531")
                .appendPathParam("iotDomainGroups")
                .appendPathParam(request.getIotDomainGroupId())
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
                        ChangeIotDomainGroupCompartmentResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id",
                        ChangeIotDomainGroupCompartmentResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public ConfigureIotDomainDataAccessResponse configureIotDomainDataAccess(
            ConfigureIotDomainDataAccessRequest request) {

        Validate.notBlank(request.getIotDomainId(), "iotDomainId must not be blank");
        Objects.requireNonNull(
                request.getConfigureIotDomainDataAccessDetails(),
                "configureIotDomainDataAccessDetails is required");

        return clientCall(request, ConfigureIotDomainDataAccessResponse::builder)
                .logger(LOG, "configureIotDomainDataAccess")
                .serviceDetails(
                        "Iot",
                        "ConfigureIotDomainDataAccess",
                        "https://docs.oracle.com/iaas/api/#/en/iot/20250531/IotDomain/ConfigureIotDomainDataAccess")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(ConfigureIotDomainDataAccessRequest::builder)
                .basePath("/20250531")
                .appendPathParam("iotDomains")
                .appendPathParam(request.getIotDomainId())
                .appendPathParam("actions")
                .appendPathParam("configureDataAccess")
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .operationUsesDefaultRetries()
                .hasBody()
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        ConfigureIotDomainDataAccessResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id",
                        ConfigureIotDomainDataAccessResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public ConfigureIotDomainGroupDataAccessResponse configureIotDomainGroupDataAccess(
            ConfigureIotDomainGroupDataAccessRequest request) {

        Validate.notBlank(request.getIotDomainGroupId(), "iotDomainGroupId must not be blank");
        Objects.requireNonNull(
                request.getConfigureIotDomainGroupDataAccessDetails(),
                "configureIotDomainGroupDataAccessDetails is required");

        return clientCall(request, ConfigureIotDomainGroupDataAccessResponse::builder)
                .logger(LOG, "configureIotDomainGroupDataAccess")
                .serviceDetails(
                        "Iot",
                        "ConfigureIotDomainGroupDataAccess",
                        "https://docs.oracle.com/iaas/api/#/en/iot/20250531/IotDomainGroup/ConfigureIotDomainGroupDataAccess")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(ConfigureIotDomainGroupDataAccessRequest::builder)
                .basePath("/20250531")
                .appendPathParam("iotDomainGroups")
                .appendPathParam(request.getIotDomainGroupId())
                .appendPathParam("actions")
                .appendPathParam("configureDataAccess")
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .operationUsesDefaultRetries()
                .hasBody()
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        ConfigureIotDomainGroupDataAccessResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id",
                        ConfigureIotDomainGroupDataAccessResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public CreateDigitalTwinAdapterResponse createDigitalTwinAdapter(
            CreateDigitalTwinAdapterRequest request) {
        Objects.requireNonNull(
                request.getCreateDigitalTwinAdapterDetails(),
                "createDigitalTwinAdapterDetails is required");

        return clientCall(request, CreateDigitalTwinAdapterResponse::builder)
                .logger(LOG, "createDigitalTwinAdapter")
                .serviceDetails(
                        "Iot",
                        "CreateDigitalTwinAdapter",
                        "https://docs.oracle.com/iaas/api/#/en/iot/20250531/DigitalTwinAdapter/CreateDigitalTwinAdapter")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(CreateDigitalTwinAdapterRequest::builder)
                .basePath("/20250531")
                .appendPathParam("digitalTwinAdapters")
                .accept("application/json")
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .hasBody()
                .handleBody(
                        com.oracle.bmc.iot.model.DigitalTwinAdapter.class,
                        CreateDigitalTwinAdapterResponse.Builder::digitalTwinAdapter)
                .handleResponseHeaderString("etag", CreateDigitalTwinAdapterResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", CreateDigitalTwinAdapterResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public CreateDigitalTwinInstanceResponse createDigitalTwinInstance(
            CreateDigitalTwinInstanceRequest request) {
        Objects.requireNonNull(
                request.getCreateDigitalTwinInstanceDetails(),
                "createDigitalTwinInstanceDetails is required");

        return clientCall(request, CreateDigitalTwinInstanceResponse::builder)
                .logger(LOG, "createDigitalTwinInstance")
                .serviceDetails(
                        "Iot",
                        "CreateDigitalTwinInstance",
                        "https://docs.oracle.com/iaas/api/#/en/iot/20250531/DigitalTwinInstance/CreateDigitalTwinInstance")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(CreateDigitalTwinInstanceRequest::builder)
                .basePath("/20250531")
                .appendPathParam("digitalTwinInstances")
                .accept("application/json")
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .hasBody()
                .handleBody(
                        com.oracle.bmc.iot.model.DigitalTwinInstance.class,
                        CreateDigitalTwinInstanceResponse.Builder::digitalTwinInstance)
                .handleResponseHeaderString("etag", CreateDigitalTwinInstanceResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", CreateDigitalTwinInstanceResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public CreateDigitalTwinModelResponse createDigitalTwinModel(
            CreateDigitalTwinModelRequest request) {
        Objects.requireNonNull(
                request.getCreateDigitalTwinModelDetails(),
                "createDigitalTwinModelDetails is required");

        return clientCall(request, CreateDigitalTwinModelResponse::builder)
                .logger(LOG, "createDigitalTwinModel")
                .serviceDetails(
                        "Iot",
                        "CreateDigitalTwinModel",
                        "https://docs.oracle.com/iaas/api/#/en/iot/20250531/DigitalTwinModel/CreateDigitalTwinModel")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(CreateDigitalTwinModelRequest::builder)
                .basePath("/20250531")
                .appendPathParam("digitalTwinModels")
                .accept("application/json")
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .hasBody()
                .handleBody(
                        com.oracle.bmc.iot.model.DigitalTwinModel.class,
                        CreateDigitalTwinModelResponse.Builder::digitalTwinModel)
                .handleResponseHeaderString("etag", CreateDigitalTwinModelResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", CreateDigitalTwinModelResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public CreateDigitalTwinRelationshipResponse createDigitalTwinRelationship(
            CreateDigitalTwinRelationshipRequest request) {
        Objects.requireNonNull(
                request.getCreateDigitalTwinRelationshipDetails(),
                "createDigitalTwinRelationshipDetails is required");

        return clientCall(request, CreateDigitalTwinRelationshipResponse::builder)
                .logger(LOG, "createDigitalTwinRelationship")
                .serviceDetails(
                        "Iot",
                        "CreateDigitalTwinRelationship",
                        "https://docs.oracle.com/iaas/api/#/en/iot/20250531/DigitalTwinRelationship/CreateDigitalTwinRelationship")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(CreateDigitalTwinRelationshipRequest::builder)
                .basePath("/20250531")
                .appendPathParam("digitalTwinRelationships")
                .accept("application/json")
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .hasBody()
                .handleBody(
                        com.oracle.bmc.iot.model.DigitalTwinRelationship.class,
                        CreateDigitalTwinRelationshipResponse.Builder::digitalTwinRelationship)
                .handleResponseHeaderString(
                        "etag", CreateDigitalTwinRelationshipResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id",
                        CreateDigitalTwinRelationshipResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public CreateIotDomainResponse createIotDomain(CreateIotDomainRequest request) {
        Objects.requireNonNull(
                request.getCreateIotDomainDetails(), "createIotDomainDetails is required");

        return clientCall(request, CreateIotDomainResponse::builder)
                .logger(LOG, "createIotDomain")
                .serviceDetails(
                        "Iot",
                        "CreateIotDomain",
                        "https://docs.oracle.com/iaas/api/#/en/iot/20250531/IotDomain/CreateIotDomain")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(CreateIotDomainRequest::builder)
                .basePath("/20250531")
                .appendPathParam("iotDomains")
                .accept("application/json")
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .hasBody()
                .handleBody(
                        com.oracle.bmc.iot.model.IotDomain.class,
                        CreateIotDomainResponse.Builder::iotDomain)
                .handleResponseHeaderString("location", CreateIotDomainResponse.Builder::location)
                .handleResponseHeaderString(
                        "content-location", CreateIotDomainResponse.Builder::contentLocation)
                .handleResponseHeaderString("etag", CreateIotDomainResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-work-request-id", CreateIotDomainResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", CreateIotDomainResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public CreateIotDomainGroupResponse createIotDomainGroup(CreateIotDomainGroupRequest request) {
        Objects.requireNonNull(
                request.getCreateIotDomainGroupDetails(),
                "createIotDomainGroupDetails is required");

        return clientCall(request, CreateIotDomainGroupResponse::builder)
                .logger(LOG, "createIotDomainGroup")
                .serviceDetails(
                        "Iot",
                        "CreateIotDomainGroup",
                        "https://docs.oracle.com/iaas/api/#/en/iot/20250531/IotDomainGroup/CreateIotDomainGroup")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(CreateIotDomainGroupRequest::builder)
                .basePath("/20250531")
                .appendPathParam("iotDomainGroups")
                .accept("application/json")
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .hasBody()
                .handleBody(
                        com.oracle.bmc.iot.model.IotDomainGroup.class,
                        CreateIotDomainGroupResponse.Builder::iotDomainGroup)
                .handleResponseHeaderString(
                        "location", CreateIotDomainGroupResponse.Builder::location)
                .handleResponseHeaderString(
                        "content-location", CreateIotDomainGroupResponse.Builder::contentLocation)
                .handleResponseHeaderString("etag", CreateIotDomainGroupResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        CreateIotDomainGroupResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", CreateIotDomainGroupResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public DeleteDigitalTwinAdapterResponse deleteDigitalTwinAdapter(
            DeleteDigitalTwinAdapterRequest request) {

        Validate.notBlank(
                request.getDigitalTwinAdapterId(), "digitalTwinAdapterId must not be blank");

        return clientCall(request, DeleteDigitalTwinAdapterResponse::builder)
                .logger(LOG, "deleteDigitalTwinAdapter")
                .serviceDetails(
                        "Iot",
                        "DeleteDigitalTwinAdapter",
                        "https://docs.oracle.com/iaas/api/#/en/iot/20250531/DigitalTwinAdapter/DeleteDigitalTwinAdapter")
                .method(com.oracle.bmc.http.client.Method.DELETE)
                .requestBuilder(DeleteDigitalTwinAdapterRequest::builder)
                .basePath("/20250531")
                .appendPathParam("digitalTwinAdapters")
                .appendPathParam(request.getDigitalTwinAdapterId())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .handleResponseHeaderString(
                        "opc-request-id", DeleteDigitalTwinAdapterResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public DeleteDigitalTwinInstanceResponse deleteDigitalTwinInstance(
            DeleteDigitalTwinInstanceRequest request) {

        Validate.notBlank(
                request.getDigitalTwinInstanceId(), "digitalTwinInstanceId must not be blank");

        return clientCall(request, DeleteDigitalTwinInstanceResponse::builder)
                .logger(LOG, "deleteDigitalTwinInstance")
                .serviceDetails(
                        "Iot",
                        "DeleteDigitalTwinInstance",
                        "https://docs.oracle.com/iaas/api/#/en/iot/20250531/DigitalTwinInstance/DeleteDigitalTwinInstance")
                .method(com.oracle.bmc.http.client.Method.DELETE)
                .requestBuilder(DeleteDigitalTwinInstanceRequest::builder)
                .basePath("/20250531")
                .appendPathParam("digitalTwinInstances")
                .appendPathParam(request.getDigitalTwinInstanceId())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .handleResponseHeaderString(
                        "opc-request-id", DeleteDigitalTwinInstanceResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public DeleteDigitalTwinModelResponse deleteDigitalTwinModel(
            DeleteDigitalTwinModelRequest request) {

        Validate.notBlank(request.getDigitalTwinModelId(), "digitalTwinModelId must not be blank");

        return clientCall(request, DeleteDigitalTwinModelResponse::builder)
                .logger(LOG, "deleteDigitalTwinModel")
                .serviceDetails(
                        "Iot",
                        "DeleteDigitalTwinModel",
                        "https://docs.oracle.com/iaas/api/#/en/iot/20250531/DigitalTwinModel/DeleteDigitalTwinModel")
                .method(com.oracle.bmc.http.client.Method.DELETE)
                .requestBuilder(DeleteDigitalTwinModelRequest::builder)
                .basePath("/20250531")
                .appendPathParam("digitalTwinModels")
                .appendPathParam(request.getDigitalTwinModelId())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .handleResponseHeaderString(
                        "opc-request-id", DeleteDigitalTwinModelResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public DeleteDigitalTwinRelationshipResponse deleteDigitalTwinRelationship(
            DeleteDigitalTwinRelationshipRequest request) {

        Validate.notBlank(
                request.getDigitalTwinRelationshipId(),
                "digitalTwinRelationshipId must not be blank");

        return clientCall(request, DeleteDigitalTwinRelationshipResponse::builder)
                .logger(LOG, "deleteDigitalTwinRelationship")
                .serviceDetails(
                        "Iot",
                        "DeleteDigitalTwinRelationship",
                        "https://docs.oracle.com/iaas/api/#/en/iot/20250531/DigitalTwinRelationship/DeleteDigitalTwinRelationship")
                .method(com.oracle.bmc.http.client.Method.DELETE)
                .requestBuilder(DeleteDigitalTwinRelationshipRequest::builder)
                .basePath("/20250531")
                .appendPathParam("digitalTwinRelationships")
                .appendPathParam(request.getDigitalTwinRelationshipId())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .handleResponseHeaderString(
                        "opc-request-id",
                        DeleteDigitalTwinRelationshipResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public DeleteIotDomainResponse deleteIotDomain(DeleteIotDomainRequest request) {

        Validate.notBlank(request.getIotDomainId(), "iotDomainId must not be blank");

        return clientCall(request, DeleteIotDomainResponse::builder)
                .logger(LOG, "deleteIotDomain")
                .serviceDetails(
                        "Iot",
                        "DeleteIotDomain",
                        "https://docs.oracle.com/iaas/api/#/en/iot/20250531/IotDomain/DeleteIotDomain")
                .method(com.oracle.bmc.http.client.Method.DELETE)
                .requestBuilder(DeleteIotDomainRequest::builder)
                .basePath("/20250531")
                .appendPathParam("iotDomains")
                .appendPathParam(request.getIotDomainId())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .handleResponseHeaderString(
                        "opc-work-request-id", DeleteIotDomainResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", DeleteIotDomainResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public DeleteIotDomainGroupResponse deleteIotDomainGroup(DeleteIotDomainGroupRequest request) {

        Validate.notBlank(request.getIotDomainGroupId(), "iotDomainGroupId must not be blank");

        return clientCall(request, DeleteIotDomainGroupResponse::builder)
                .logger(LOG, "deleteIotDomainGroup")
                .serviceDetails(
                        "Iot",
                        "DeleteIotDomainGroup",
                        "https://docs.oracle.com/iaas/api/#/en/iot/20250531/IotDomainGroup/DeleteIotDomainGroup")
                .method(com.oracle.bmc.http.client.Method.DELETE)
                .requestBuilder(DeleteIotDomainGroupRequest::builder)
                .basePath("/20250531")
                .appendPathParam("iotDomainGroups")
                .appendPathParam(request.getIotDomainGroupId())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        DeleteIotDomainGroupResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", DeleteIotDomainGroupResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public GetDigitalTwinAdapterResponse getDigitalTwinAdapter(
            GetDigitalTwinAdapterRequest request) {

        Validate.notBlank(
                request.getDigitalTwinAdapterId(), "digitalTwinAdapterId must not be blank");

        return clientCall(request, GetDigitalTwinAdapterResponse::builder)
                .logger(LOG, "getDigitalTwinAdapter")
                .serviceDetails(
                        "Iot",
                        "GetDigitalTwinAdapter",
                        "https://docs.oracle.com/iaas/api/#/en/iot/20250531/DigitalTwinAdapter/GetDigitalTwinAdapter")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetDigitalTwinAdapterRequest::builder)
                .basePath("/20250531")
                .appendPathParam("digitalTwinAdapters")
                .appendPathParam(request.getDigitalTwinAdapterId())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .handleBody(
                        com.oracle.bmc.iot.model.DigitalTwinAdapter.class,
                        GetDigitalTwinAdapterResponse.Builder::digitalTwinAdapter)
                .handleResponseHeaderString("etag", GetDigitalTwinAdapterResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", GetDigitalTwinAdapterResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public GetDigitalTwinInstanceResponse getDigitalTwinInstance(
            GetDigitalTwinInstanceRequest request) {

        Validate.notBlank(
                request.getDigitalTwinInstanceId(), "digitalTwinInstanceId must not be blank");

        return clientCall(request, GetDigitalTwinInstanceResponse::builder)
                .logger(LOG, "getDigitalTwinInstance")
                .serviceDetails(
                        "Iot",
                        "GetDigitalTwinInstance",
                        "https://docs.oracle.com/iaas/api/#/en/iot/20250531/DigitalTwinInstance/GetDigitalTwinInstance")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetDigitalTwinInstanceRequest::builder)
                .basePath("/20250531")
                .appendPathParam("digitalTwinInstances")
                .appendPathParam(request.getDigitalTwinInstanceId())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .handleBody(
                        com.oracle.bmc.iot.model.DigitalTwinInstance.class,
                        GetDigitalTwinInstanceResponse.Builder::digitalTwinInstance)
                .handleResponseHeaderString("etag", GetDigitalTwinInstanceResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", GetDigitalTwinInstanceResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public GetDigitalTwinInstanceContentResponse getDigitalTwinInstanceContent(
            GetDigitalTwinInstanceContentRequest request) {

        Validate.notBlank(
                request.getDigitalTwinInstanceId(), "digitalTwinInstanceId must not be blank");

        return clientCall(request, GetDigitalTwinInstanceContentResponse::builder)
                .logger(LOG, "getDigitalTwinInstanceContent")
                .serviceDetails(
                        "Iot",
                        "GetDigitalTwinInstanceContent",
                        "https://docs.oracle.com/iaas/api/#/en/iot/20250531/DigitalTwinInstance/GetDigitalTwinInstanceContent")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetDigitalTwinInstanceContentRequest::builder)
                .basePath("/20250531")
                .appendPathParam("digitalTwinInstances")
                .appendPathParam(request.getDigitalTwinInstanceId())
                .appendPathParam("content")
                .appendQueryParam("shouldIncludeMetadata", request.getShouldIncludeMetadata())
                .accept("application/json, application/ld+json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .handleBody(
                        GetDigitalTwinInstanceContentResponse.ResultWrapper.class,
                        GetDigitalTwinInstanceContentResponse.Builder::resultWrapper)
                .handleResponseHeaderString(
                        "etag", GetDigitalTwinInstanceContentResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id",
                        GetDigitalTwinInstanceContentResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public GetDigitalTwinModelResponse getDigitalTwinModel(GetDigitalTwinModelRequest request) {

        Validate.notBlank(request.getDigitalTwinModelId(), "digitalTwinModelId must not be blank");

        return clientCall(request, GetDigitalTwinModelResponse::builder)
                .logger(LOG, "getDigitalTwinModel")
                .serviceDetails(
                        "Iot",
                        "GetDigitalTwinModel",
                        "https://docs.oracle.com/iaas/api/#/en/iot/20250531/DigitalTwinModel/GetDigitalTwinModel")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetDigitalTwinModelRequest::builder)
                .basePath("/20250531")
                .appendPathParam("digitalTwinModels")
                .appendPathParam(request.getDigitalTwinModelId())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .handleBody(
                        com.oracle.bmc.iot.model.DigitalTwinModel.class,
                        GetDigitalTwinModelResponse.Builder::digitalTwinModel)
                .handleResponseHeaderString("etag", GetDigitalTwinModelResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", GetDigitalTwinModelResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public GetDigitalTwinModelSpecResponse getDigitalTwinModelSpec(
            GetDigitalTwinModelSpecRequest request) {

        Validate.notBlank(request.getDigitalTwinModelId(), "digitalTwinModelId must not be blank");

        return clientCall(request, GetDigitalTwinModelSpecResponse::builder)
                .logger(LOG, "getDigitalTwinModelSpec")
                .serviceDetails(
                        "Iot",
                        "GetDigitalTwinModelSpec",
                        "https://docs.oracle.com/iaas/api/#/en/iot/20250531/DigitalTwinModel/GetDigitalTwinModelSpec")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetDigitalTwinModelSpecRequest::builder)
                .basePath("/20250531")
                .appendPathParam("digitalTwinModels")
                .appendPathParam(request.getDigitalTwinModelId())
                .appendPathParam("spec")
                .accept("application/json, application/ld+json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .handleBody(
                        GetDigitalTwinModelSpecResponse.ResultWrapper.class,
                        GetDigitalTwinModelSpecResponse.Builder::resultWrapper)
                .handleResponseHeaderString("etag", GetDigitalTwinModelSpecResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", GetDigitalTwinModelSpecResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public GetDigitalTwinRelationshipResponse getDigitalTwinRelationship(
            GetDigitalTwinRelationshipRequest request) {

        Validate.notBlank(
                request.getDigitalTwinRelationshipId(),
                "digitalTwinRelationshipId must not be blank");

        return clientCall(request, GetDigitalTwinRelationshipResponse::builder)
                .logger(LOG, "getDigitalTwinRelationship")
                .serviceDetails(
                        "Iot",
                        "GetDigitalTwinRelationship",
                        "https://docs.oracle.com/iaas/api/#/en/iot/20250531/DigitalTwinRelationship/GetDigitalTwinRelationship")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetDigitalTwinRelationshipRequest::builder)
                .basePath("/20250531")
                .appendPathParam("digitalTwinRelationships")
                .appendPathParam(request.getDigitalTwinRelationshipId())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .handleBody(
                        com.oracle.bmc.iot.model.DigitalTwinRelationship.class,
                        GetDigitalTwinRelationshipResponse.Builder::digitalTwinRelationship)
                .handleResponseHeaderString(
                        "etag", GetDigitalTwinRelationshipResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", GetDigitalTwinRelationshipResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public GetIotDomainResponse getIotDomain(GetIotDomainRequest request) {

        Validate.notBlank(request.getIotDomainId(), "iotDomainId must not be blank");

        return clientCall(request, GetIotDomainResponse::builder)
                .logger(LOG, "getIotDomain")
                .serviceDetails(
                        "Iot",
                        "GetIotDomain",
                        "https://docs.oracle.com/iaas/api/#/en/iot/20250531/IotDomain/GetIotDomain")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetIotDomainRequest::builder)
                .basePath("/20250531")
                .appendPathParam("iotDomains")
                .appendPathParam(request.getIotDomainId())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .handleBody(
                        com.oracle.bmc.iot.model.IotDomain.class,
                        GetIotDomainResponse.Builder::iotDomain)
                .handleResponseHeaderString("etag", GetIotDomainResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", GetIotDomainResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public GetIotDomainGroupResponse getIotDomainGroup(GetIotDomainGroupRequest request) {

        Validate.notBlank(request.getIotDomainGroupId(), "iotDomainGroupId must not be blank");

        return clientCall(request, GetIotDomainGroupResponse::builder)
                .logger(LOG, "getIotDomainGroup")
                .serviceDetails(
                        "Iot",
                        "GetIotDomainGroup",
                        "https://docs.oracle.com/iaas/api/#/en/iot/20250531/IotDomainGroup/GetIotDomainGroup")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetIotDomainGroupRequest::builder)
                .basePath("/20250531")
                .appendPathParam("iotDomainGroups")
                .appendPathParam(request.getIotDomainGroupId())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .handleBody(
                        com.oracle.bmc.iot.model.IotDomainGroup.class,
                        GetIotDomainGroupResponse.Builder::iotDomainGroup)
                .handleResponseHeaderString("etag", GetIotDomainGroupResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", GetIotDomainGroupResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public GetWorkRequestResponse getWorkRequest(GetWorkRequestRequest request) {

        Validate.notBlank(request.getWorkRequestId(), "workRequestId must not be blank");

        return clientCall(request, GetWorkRequestResponse::builder)
                .logger(LOG, "getWorkRequest")
                .serviceDetails(
                        "Iot",
                        "GetWorkRequest",
                        "https://docs.oracle.com/iaas/api/#/en/iot/20250531/WorkRequest/GetWorkRequest")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetWorkRequestRequest::builder)
                .basePath("/20250531")
                .appendPathParam("workRequests")
                .appendPathParam(request.getWorkRequestId())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .handleBody(
                        com.oracle.bmc.iot.model.WorkRequest.class,
                        GetWorkRequestResponse.Builder::workRequest)
                .handleResponseHeaderString("etag", GetWorkRequestResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", GetWorkRequestResponse.Builder::opcRequestId)
                .handleResponseHeaderInteger(
                        "retry-after", GetWorkRequestResponse.Builder::retryAfter)
                .callSync();
    }

    @Override
    public InvokeRawCommandResponse invokeRawCommand(InvokeRawCommandRequest request) {

        Validate.notBlank(
                request.getDigitalTwinInstanceId(), "digitalTwinInstanceId must not be blank");
        Objects.requireNonNull(
                request.getInvokeRawCommandDetails(), "invokeRawCommandDetails is required");

        return clientCall(request, InvokeRawCommandResponse::builder)
                .logger(LOG, "invokeRawCommand")
                .serviceDetails(
                        "Iot",
                        "InvokeRawCommand",
                        "https://docs.oracle.com/iaas/api/#/en/iot/20250531/DigitalTwinInstance/InvokeRawCommand")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(InvokeRawCommandRequest::builder)
                .basePath("/20250531")
                .appendPathParam("digitalTwinInstances")
                .appendPathParam(request.getDigitalTwinInstanceId())
                .appendPathParam("actions")
                .appendPathParam("invokeRawCommand")
                .accept("application/json")
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .hasBody()
                .handleResponseHeaderString(
                        "opc-request-id", InvokeRawCommandResponse.Builder::opcRequestId)
                .handleResponseHeaderString("Location", InvokeRawCommandResponse.Builder::location)
                .callSync();
    }

    @Override
    public ListDigitalTwinAdaptersResponse listDigitalTwinAdapters(
            ListDigitalTwinAdaptersRequest request) {
        Objects.requireNonNull(request.getIotDomainId(), "iotDomainId is required");

        return clientCall(request, ListDigitalTwinAdaptersResponse::builder)
                .logger(LOG, "listDigitalTwinAdapters")
                .serviceDetails(
                        "Iot",
                        "ListDigitalTwinAdapters",
                        "https://docs.oracle.com/iaas/api/#/en/iot/20250531/DigitalTwinAdapter/ListDigitalTwinAdapters")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListDigitalTwinAdaptersRequest::builder)
                .basePath("/20250531")
                .appendPathParam("digitalTwinAdapters")
                .appendQueryParam("iotDomainId", request.getIotDomainId())
                .appendQueryParam("id", request.getId())
                .appendQueryParam("digitalTwinModelSpecUri", request.getDigitalTwinModelSpecUri())
                .appendQueryParam("digitalTwinModelId", request.getDigitalTwinModelId())
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
                        com.oracle.bmc.iot.model.DigitalTwinAdapterCollection.class,
                        ListDigitalTwinAdaptersResponse.Builder::digitalTwinAdapterCollection)
                .handleResponseHeaderString(
                        "opc-request-id", ListDigitalTwinAdaptersResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListDigitalTwinAdaptersResponse.Builder::opcNextPage)
                .handleResponseHeaderString(
                        "opc-prev-page", ListDigitalTwinAdaptersResponse.Builder::opcPrevPage)
                .callSync();
    }

    @Override
    public ListDigitalTwinInstancesResponse listDigitalTwinInstances(
            ListDigitalTwinInstancesRequest request) {
        Objects.requireNonNull(request.getIotDomainId(), "iotDomainId is required");

        return clientCall(request, ListDigitalTwinInstancesResponse::builder)
                .logger(LOG, "listDigitalTwinInstances")
                .serviceDetails(
                        "Iot",
                        "ListDigitalTwinInstances",
                        "https://docs.oracle.com/iaas/api/#/en/iot/20250531/DigitalTwinInstance/ListDigitalTwinInstances")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListDigitalTwinInstancesRequest::builder)
                .basePath("/20250531")
                .appendPathParam("digitalTwinInstances")
                .appendQueryParam("displayName", request.getDisplayName())
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .appendEnumQueryParam("lifecycleState", request.getLifecycleState())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .appendQueryParam("digitalTwinModelId", request.getDigitalTwinModelId())
                .appendQueryParam("digitalTwinModelSpecUri", request.getDigitalTwinModelSpecUri())
                .appendQueryParam("iotDomainId", request.getIotDomainId())
                .appendQueryParam("id", request.getId())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .handleBody(
                        com.oracle.bmc.iot.model.DigitalTwinInstanceCollection.class,
                        ListDigitalTwinInstancesResponse.Builder::digitalTwinInstanceCollection)
                .handleResponseHeaderString(
                        "opc-request-id", ListDigitalTwinInstancesResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListDigitalTwinInstancesResponse.Builder::opcNextPage)
                .handleResponseHeaderString(
                        "opc-prev-page", ListDigitalTwinInstancesResponse.Builder::opcPrevPage)
                .callSync();
    }

    @Override
    public ListDigitalTwinModelsResponse listDigitalTwinModels(
            ListDigitalTwinModelsRequest request) {
        Objects.requireNonNull(request.getIotDomainId(), "iotDomainId is required");

        return clientCall(request, ListDigitalTwinModelsResponse::builder)
                .logger(LOG, "listDigitalTwinModels")
                .serviceDetails(
                        "Iot",
                        "ListDigitalTwinModels",
                        "https://docs.oracle.com/iaas/api/#/en/iot/20250531/DigitalTwinModel/ListDigitalTwinModels")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListDigitalTwinModelsRequest::builder)
                .basePath("/20250531")
                .appendPathParam("digitalTwinModels")
                .appendQueryParam("id", request.getId())
                .appendQueryParam("iotDomainId", request.getIotDomainId())
                .appendQueryParam("displayName", request.getDisplayName())
                .appendQueryParam("specUriStartsWith", request.getSpecUriStartsWith())
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .appendEnumQueryParam("lifecycleState", request.getLifecycleState())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .handleBody(
                        com.oracle.bmc.iot.model.DigitalTwinModelCollection.class,
                        ListDigitalTwinModelsResponse.Builder::digitalTwinModelCollection)
                .handleResponseHeaderString(
                        "opc-request-id", ListDigitalTwinModelsResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListDigitalTwinModelsResponse.Builder::opcNextPage)
                .handleResponseHeaderString(
                        "opc-prev-page", ListDigitalTwinModelsResponse.Builder::opcPrevPage)
                .callSync();
    }

    @Override
    public ListDigitalTwinRelationshipsResponse listDigitalTwinRelationships(
            ListDigitalTwinRelationshipsRequest request) {
        Objects.requireNonNull(request.getIotDomainId(), "iotDomainId is required");

        return clientCall(request, ListDigitalTwinRelationshipsResponse::builder)
                .logger(LOG, "listDigitalTwinRelationships")
                .serviceDetails(
                        "Iot",
                        "ListDigitalTwinRelationships",
                        "https://docs.oracle.com/iaas/api/#/en/iot/20250531/DigitalTwinRelationship/ListDigitalTwinRelationships")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListDigitalTwinRelationshipsRequest::builder)
                .basePath("/20250531")
                .appendPathParam("digitalTwinRelationships")
                .appendQueryParam("displayName", request.getDisplayName())
                .appendQueryParam("contentPath", request.getContentPath())
                .appendQueryParam(
                        "sourceDigitalTwinInstanceId", request.getSourceDigitalTwinInstanceId())
                .appendQueryParam(
                        "targetDigitalTwinInstanceId", request.getTargetDigitalTwinInstanceId())
                .appendEnumQueryParam("lifecycleState", request.getLifecycleState())
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .appendQueryParam("iotDomainId", request.getIotDomainId())
                .appendQueryParam("id", request.getId())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .handleBody(
                        com.oracle.bmc.iot.model.DigitalTwinRelationshipCollection.class,
                        ListDigitalTwinRelationshipsResponse.Builder
                                ::digitalTwinRelationshipCollection)
                .handleResponseHeaderString(
                        "opc-request-id",
                        ListDigitalTwinRelationshipsResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListDigitalTwinRelationshipsResponse.Builder::opcNextPage)
                .handleResponseHeaderString(
                        "opc-prev-page", ListDigitalTwinRelationshipsResponse.Builder::opcPrevPage)
                .callSync();
    }

    @Override
    public ListIotDomainGroupsResponse listIotDomainGroups(ListIotDomainGroupsRequest request) {
        Objects.requireNonNull(request.getCompartmentId(), "compartmentId is required");

        return clientCall(request, ListIotDomainGroupsResponse::builder)
                .logger(LOG, "listIotDomainGroups")
                .serviceDetails(
                        "Iot",
                        "ListIotDomainGroups",
                        "https://docs.oracle.com/iaas/api/#/en/iot/20250531/IotDomainGroup/ListIotDomainGroups")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListIotDomainGroupsRequest::builder)
                .basePath("/20250531")
                .appendPathParam("iotDomainGroups")
                .appendQueryParam("compartmentId", request.getCompartmentId())
                .appendQueryParam("id", request.getId())
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
                        com.oracle.bmc.iot.model.IotDomainGroupCollection.class,
                        ListIotDomainGroupsResponse.Builder::iotDomainGroupCollection)
                .handleResponseHeaderString(
                        "opc-request-id", ListIotDomainGroupsResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListIotDomainGroupsResponse.Builder::opcNextPage)
                .handleResponseHeaderString(
                        "opc-prev-page", ListIotDomainGroupsResponse.Builder::opcPrevPage)
                .callSync();
    }

    @Override
    public ListIotDomainsResponse listIotDomains(ListIotDomainsRequest request) {
        Objects.requireNonNull(request.getCompartmentId(), "compartmentId is required");

        return clientCall(request, ListIotDomainsResponse::builder)
                .logger(LOG, "listIotDomains")
                .serviceDetails(
                        "Iot",
                        "ListIotDomains",
                        "https://docs.oracle.com/iaas/api/#/en/iot/20250531/IotDomain/ListIotDomains")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListIotDomainsRequest::builder)
                .basePath("/20250531")
                .appendPathParam("iotDomains")
                .appendQueryParam("compartmentId", request.getCompartmentId())
                .appendQueryParam("id", request.getId())
                .appendQueryParam("iotDomainGroupId", request.getIotDomainGroupId())
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
                        com.oracle.bmc.iot.model.IotDomainCollection.class,
                        ListIotDomainsResponse.Builder::iotDomainCollection)
                .handleResponseHeaderString(
                        "opc-request-id", ListIotDomainsResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListIotDomainsResponse.Builder::opcNextPage)
                .handleResponseHeaderString(
                        "opc-prev-page", ListIotDomainsResponse.Builder::opcPrevPage)
                .callSync();
    }

    @Override
    public ListWorkRequestErrorsResponse listWorkRequestErrors(
            ListWorkRequestErrorsRequest request) {

        Validate.notBlank(request.getWorkRequestId(), "workRequestId must not be blank");

        return clientCall(request, ListWorkRequestErrorsResponse::builder)
                .logger(LOG, "listWorkRequestErrors")
                .serviceDetails(
                        "Iot",
                        "ListWorkRequestErrors",
                        "https://docs.oracle.com/iaas/api/#/en/iot/20250531/WorkRequest/ListWorkRequestErrors")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListWorkRequestErrorsRequest::builder)
                .basePath("/20250531")
                .appendPathParam("workRequests")
                .appendPathParam(request.getWorkRequestId())
                .appendPathParam("errors")
                .appendQueryParam("page", request.getPage())
                .appendQueryParam("limit", request.getLimit())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .handleBody(
                        com.oracle.bmc.iot.model.WorkRequestErrorCollection.class,
                        ListWorkRequestErrorsResponse.Builder::workRequestErrorCollection)
                .handleResponseHeaderString(
                        "opc-request-id", ListWorkRequestErrorsResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListWorkRequestErrorsResponse.Builder::opcNextPage)
                .handleResponseHeaderString(
                        "opc-prev-page", ListWorkRequestErrorsResponse.Builder::opcPrevPage)
                .callSync();
    }

    @Override
    public ListWorkRequestLogsResponse listWorkRequestLogs(ListWorkRequestLogsRequest request) {

        Validate.notBlank(request.getWorkRequestId(), "workRequestId must not be blank");

        return clientCall(request, ListWorkRequestLogsResponse::builder)
                .logger(LOG, "listWorkRequestLogs")
                .serviceDetails(
                        "Iot",
                        "ListWorkRequestLogs",
                        "https://docs.oracle.com/iaas/api/#/en/iot/20250531/WorkRequest/ListWorkRequestLogs")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListWorkRequestLogsRequest::builder)
                .basePath("/20250531")
                .appendPathParam("workRequests")
                .appendPathParam(request.getWorkRequestId())
                .appendPathParam("logs")
                .appendQueryParam("page", request.getPage())
                .appendQueryParam("limit", request.getLimit())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .handleBody(
                        com.oracle.bmc.iot.model.WorkRequestLogEntryCollection.class,
                        ListWorkRequestLogsResponse.Builder::workRequestLogEntryCollection)
                .handleResponseHeaderString(
                        "opc-request-id", ListWorkRequestLogsResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListWorkRequestLogsResponse.Builder::opcNextPage)
                .handleResponseHeaderString(
                        "opc-prev-page", ListWorkRequestLogsResponse.Builder::opcPrevPage)
                .callSync();
    }

    @Override
    public ListWorkRequestsResponse listWorkRequests(ListWorkRequestsRequest request) {
        Objects.requireNonNull(request.getCompartmentId(), "compartmentId is required");

        return clientCall(request, ListWorkRequestsResponse::builder)
                .logger(LOG, "listWorkRequests")
                .serviceDetails(
                        "Iot",
                        "ListWorkRequests",
                        "https://docs.oracle.com/iaas/api/#/en/iot/20250531/WorkRequest/ListWorkRequests")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListWorkRequestsRequest::builder)
                .basePath("/20250531")
                .appendPathParam("workRequests")
                .appendQueryParam("compartmentId", request.getCompartmentId())
                .appendQueryParam("id", request.getId())
                .appendEnumQueryParam("status", request.getStatus())
                .appendQueryParam("resourceId", request.getResourceId())
                .appendQueryParam("page", request.getPage())
                .appendQueryParam("limit", request.getLimit())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .handleBody(
                        com.oracle.bmc.iot.model.WorkRequestSummaryCollection.class,
                        ListWorkRequestsResponse.Builder::workRequestSummaryCollection)
                .handleResponseHeaderString(
                        "opc-request-id", ListWorkRequestsResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListWorkRequestsResponse.Builder::opcNextPage)
                .handleResponseHeaderString(
                        "opc-prev-page", ListWorkRequestsResponse.Builder::opcPrevPage)
                .callSync();
    }

    @Override
    public UpdateDigitalTwinAdapterResponse updateDigitalTwinAdapter(
            UpdateDigitalTwinAdapterRequest request) {

        Validate.notBlank(
                request.getDigitalTwinAdapterId(), "digitalTwinAdapterId must not be blank");
        Objects.requireNonNull(
                request.getUpdateDigitalTwinAdapterDetails(),
                "updateDigitalTwinAdapterDetails is required");

        return clientCall(request, UpdateDigitalTwinAdapterResponse::builder)
                .logger(LOG, "updateDigitalTwinAdapter")
                .serviceDetails(
                        "Iot",
                        "UpdateDigitalTwinAdapter",
                        "https://docs.oracle.com/iaas/api/#/en/iot/20250531/DigitalTwinAdapter/UpdateDigitalTwinAdapter")
                .method(com.oracle.bmc.http.client.Method.PUT)
                .requestBuilder(UpdateDigitalTwinAdapterRequest::builder)
                .basePath("/20250531")
                .appendPathParam("digitalTwinAdapters")
                .appendPathParam(request.getDigitalTwinAdapterId())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .hasBody()
                .handleBody(
                        com.oracle.bmc.iot.model.DigitalTwinAdapter.class,
                        UpdateDigitalTwinAdapterResponse.Builder::digitalTwinAdapter)
                .handleResponseHeaderString("etag", UpdateDigitalTwinAdapterResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", UpdateDigitalTwinAdapterResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public UpdateDigitalTwinInstanceResponse updateDigitalTwinInstance(
            UpdateDigitalTwinInstanceRequest request) {

        Validate.notBlank(
                request.getDigitalTwinInstanceId(), "digitalTwinInstanceId must not be blank");
        Objects.requireNonNull(
                request.getUpdateDigitalTwinInstanceDetails(),
                "updateDigitalTwinInstanceDetails is required");

        return clientCall(request, UpdateDigitalTwinInstanceResponse::builder)
                .logger(LOG, "updateDigitalTwinInstance")
                .serviceDetails(
                        "Iot",
                        "UpdateDigitalTwinInstance",
                        "https://docs.oracle.com/iaas/api/#/en/iot/20250531/DigitalTwinInstance/UpdateDigitalTwinInstance")
                .method(com.oracle.bmc.http.client.Method.PUT)
                .requestBuilder(UpdateDigitalTwinInstanceRequest::builder)
                .basePath("/20250531")
                .appendPathParam("digitalTwinInstances")
                .appendPathParam(request.getDigitalTwinInstanceId())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .hasBody()
                .handleBody(
                        com.oracle.bmc.iot.model.DigitalTwinInstance.class,
                        UpdateDigitalTwinInstanceResponse.Builder::digitalTwinInstance)
                .handleResponseHeaderString("etag", UpdateDigitalTwinInstanceResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", UpdateDigitalTwinInstanceResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public UpdateDigitalTwinModelResponse updateDigitalTwinModel(
            UpdateDigitalTwinModelRequest request) {

        Validate.notBlank(request.getDigitalTwinModelId(), "digitalTwinModelId must not be blank");
        Objects.requireNonNull(
                request.getUpdateDigitalTwinModelDetails(),
                "updateDigitalTwinModelDetails is required");

        return clientCall(request, UpdateDigitalTwinModelResponse::builder)
                .logger(LOG, "updateDigitalTwinModel")
                .serviceDetails(
                        "Iot",
                        "UpdateDigitalTwinModel",
                        "https://docs.oracle.com/iaas/api/#/en/iot/20250531/DigitalTwinModel/UpdateDigitalTwinModel")
                .method(com.oracle.bmc.http.client.Method.PUT)
                .requestBuilder(UpdateDigitalTwinModelRequest::builder)
                .basePath("/20250531")
                .appendPathParam("digitalTwinModels")
                .appendPathParam(request.getDigitalTwinModelId())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .hasBody()
                .handleBody(
                        com.oracle.bmc.iot.model.DigitalTwinModel.class,
                        UpdateDigitalTwinModelResponse.Builder::digitalTwinModel)
                .handleResponseHeaderString("etag", UpdateDigitalTwinModelResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", UpdateDigitalTwinModelResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public UpdateDigitalTwinRelationshipResponse updateDigitalTwinRelationship(
            UpdateDigitalTwinRelationshipRequest request) {

        Validate.notBlank(
                request.getDigitalTwinRelationshipId(),
                "digitalTwinRelationshipId must not be blank");
        Objects.requireNonNull(
                request.getUpdateDigitalTwinRelationshipDetails(),
                "updateDigitalTwinRelationshipDetails is required");

        return clientCall(request, UpdateDigitalTwinRelationshipResponse::builder)
                .logger(LOG, "updateDigitalTwinRelationship")
                .serviceDetails(
                        "Iot",
                        "UpdateDigitalTwinRelationship",
                        "https://docs.oracle.com/iaas/api/#/en/iot/20250531/DigitalTwinRelationship/UpdateDigitalTwinRelationship")
                .method(com.oracle.bmc.http.client.Method.PUT)
                .requestBuilder(UpdateDigitalTwinRelationshipRequest::builder)
                .basePath("/20250531")
                .appendPathParam("digitalTwinRelationships")
                .appendPathParam(request.getDigitalTwinRelationshipId())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .hasBody()
                .handleBody(
                        com.oracle.bmc.iot.model.DigitalTwinRelationship.class,
                        UpdateDigitalTwinRelationshipResponse.Builder::digitalTwinRelationship)
                .handleResponseHeaderString(
                        "etag", UpdateDigitalTwinRelationshipResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id",
                        UpdateDigitalTwinRelationshipResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public UpdateIotDomainResponse updateIotDomain(UpdateIotDomainRequest request) {

        Validate.notBlank(request.getIotDomainId(), "iotDomainId must not be blank");
        Objects.requireNonNull(
                request.getUpdateIotDomainDetails(), "updateIotDomainDetails is required");

        return clientCall(request, UpdateIotDomainResponse::builder)
                .logger(LOG, "updateIotDomain")
                .serviceDetails(
                        "Iot",
                        "UpdateIotDomain",
                        "https://docs.oracle.com/iaas/api/#/en/iot/20250531/IotDomain/UpdateIotDomain")
                .method(com.oracle.bmc.http.client.Method.PUT)
                .requestBuilder(UpdateIotDomainRequest::builder)
                .basePath("/20250531")
                .appendPathParam("iotDomains")
                .appendPathParam(request.getIotDomainId())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .hasBody()
                .handleResponseHeaderString(
                        "opc-work-request-id", UpdateIotDomainResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", UpdateIotDomainResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public UpdateIotDomainGroupResponse updateIotDomainGroup(UpdateIotDomainGroupRequest request) {

        Validate.notBlank(request.getIotDomainGroupId(), "iotDomainGroupId must not be blank");
        Objects.requireNonNull(
                request.getUpdateIotDomainGroupDetails(),
                "updateIotDomainGroupDetails is required");

        return clientCall(request, UpdateIotDomainGroupResponse::builder)
                .logger(LOG, "updateIotDomainGroup")
                .serviceDetails(
                        "Iot",
                        "UpdateIotDomainGroup",
                        "https://docs.oracle.com/iaas/api/#/en/iot/20250531/IotDomainGroup/UpdateIotDomainGroup")
                .method(com.oracle.bmc.http.client.Method.PUT)
                .requestBuilder(UpdateIotDomainGroupRequest::builder)
                .basePath("/20250531")
                .appendPathParam("iotDomainGroups")
                .appendPathParam(request.getIotDomainGroupId())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .hasBody()
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        UpdateIotDomainGroupResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", UpdateIotDomainGroupResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public IotWaiters getWaiters() {
        return waiters;
    }

    @Override
    public IotPaginators getPaginators() {
        return paginators;
    }

    /**
     * Create a new client instance.
     *
     * @param authenticationDetailsProvider The authentication details (see {@link Builder#build})
     * @deprecated Use the {@link #builder() builder} instead.
     */
    @Deprecated
    public IotClient(
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
    public IotClient(
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
    public IotClient(
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
    public IotClient(
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
    public IotClient(
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
    public IotClient(
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
    public IotClient(
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
    public IotClient(
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
