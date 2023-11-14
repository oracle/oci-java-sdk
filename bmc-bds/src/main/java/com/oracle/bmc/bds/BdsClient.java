/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.bds;

import com.oracle.bmc.util.internal.Validate;
import com.oracle.bmc.bds.requests.*;
import com.oracle.bmc.bds.responses.*;
import com.oracle.bmc.circuitbreaker.CircuitBreakerConfiguration;
import com.oracle.bmc.util.CircuitBreakerUtils;

import java.util.Objects;

@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20190531")
public class BdsClient extends com.oracle.bmc.http.internal.BaseSyncClient implements Bds {
    /** Service instance for Bds. */
    public static final com.oracle.bmc.Service SERVICE =
            com.oracle.bmc.Services.serviceBuilder()
                    .serviceName("BDS")
                    .serviceEndpointPrefix("")
                    .serviceEndpointTemplate(
                            "https://bigdataservice.{region}.oci.{secondLevelDomain}")
                    .build();

    private static final org.slf4j.Logger LOG = org.slf4j.LoggerFactory.getLogger(BdsClient.class);

    private final BdsWaiters waiters;

    private final BdsPaginators paginators;

    BdsClient(
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
                                    .nameFormat("Bds-waiters-%d")
                                    .build());
            threadPoolExecutor.allowCoreThreadTimeOut(true);

            executorService = threadPoolExecutor;
        }
        this.waiters = new BdsWaiters(executorService, this);

        this.paginators = new BdsPaginators(this);
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
            extends com.oracle.bmc.common.RegionalClientBuilder<Builder, BdsClient> {
        private java.util.concurrent.ExecutorService executorService;

        private Builder(com.oracle.bmc.Service service) {
            super(service);
            final String packageName = "bds";
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
        public BdsClient build(
                @jakarta.annotation.Nonnull
                        com.oracle.bmc.auth.AbstractAuthenticationDetailsProvider
                                authenticationDetailsProvider) {
            return new BdsClient(this, authenticationDetailsProvider, executorService);
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
    public ActivateBdsMetastoreConfigurationResponse activateBdsMetastoreConfiguration(
            ActivateBdsMetastoreConfigurationRequest request) {

        Validate.notBlank(request.getBdsInstanceId(), "bdsInstanceId must not be blank");

        Validate.notBlank(request.getMetastoreConfigId(), "metastoreConfigId must not be blank");
        Objects.requireNonNull(
                request.getActivateBdsMetastoreConfigurationDetails(),
                "activateBdsMetastoreConfigurationDetails is required");

        return clientCall(request, ActivateBdsMetastoreConfigurationResponse::builder)
                .logger(LOG, "activateBdsMetastoreConfiguration")
                .serviceDetails(
                        "Bds",
                        "ActivateBdsMetastoreConfiguration",
                        "https://docs.oracle.com/iaas/api/#/en/bigdata/20190531/BdsMetastoreConfiguration/ActivateBdsMetastoreConfiguration")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(ActivateBdsMetastoreConfigurationRequest::builder)
                .basePath("/20190531")
                .appendPathParam("bdsInstances")
                .appendPathParam(request.getBdsInstanceId())
                .appendPathParam("metastoreConfigs")
                .appendPathParam(request.getMetastoreConfigId())
                .appendPathParam("actions")
                .appendPathParam("activate")
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("if-match", request.getIfMatch())
                .hasBody()
                .handleResponseHeaderString(
                        "opc-request-id",
                        ActivateBdsMetastoreConfigurationResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        ActivateBdsMetastoreConfigurationResponse.Builder::opcWorkRequestId)
                .callSync();
    }

    @Override
    public AddAutoScalingConfigurationResponse addAutoScalingConfiguration(
            AddAutoScalingConfigurationRequest request) {

        Validate.notBlank(request.getBdsInstanceId(), "bdsInstanceId must not be blank");
        Objects.requireNonNull(
                request.getAddAutoScalingConfigurationDetails(),
                "addAutoScalingConfigurationDetails is required");

        return clientCall(request, AddAutoScalingConfigurationResponse::builder)
                .logger(LOG, "addAutoScalingConfiguration")
                .serviceDetails(
                        "Bds",
                        "AddAutoScalingConfiguration",
                        "https://docs.oracle.com/iaas/api/#/en/bigdata/20190531/BdsInstance/AddAutoScalingConfiguration")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(AddAutoScalingConfigurationRequest::builder)
                .basePath("/20190531")
                .appendPathParam("bdsInstances")
                .appendPathParam(request.getBdsInstanceId())
                .appendPathParam("autoScalingConfiguration")
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .hasBody()
                .handleResponseHeaderString(
                        "opc-request-id", AddAutoScalingConfigurationResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        AddAutoScalingConfigurationResponse.Builder::opcWorkRequestId)
                .callSync();
    }

    @Override
    public AddBlockStorageResponse addBlockStorage(AddBlockStorageRequest request) {

        Validate.notBlank(request.getBdsInstanceId(), "bdsInstanceId must not be blank");
        Objects.requireNonNull(
                request.getAddBlockStorageDetails(), "addBlockStorageDetails is required");

        return clientCall(request, AddBlockStorageResponse::builder)
                .logger(LOG, "addBlockStorage")
                .serviceDetails(
                        "Bds",
                        "AddBlockStorage",
                        "https://docs.oracle.com/iaas/api/#/en/bigdata/20190531/BdsInstance/AddBlockStorage")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(AddBlockStorageRequest::builder)
                .basePath("/20190531")
                .appendPathParam("bdsInstances")
                .appendPathParam(request.getBdsInstanceId())
                .appendPathParam("actions")
                .appendPathParam("addBlockStorage")
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .hasBody()
                .handleResponseHeaderString(
                        "opc-request-id", AddBlockStorageResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-work-request-id", AddBlockStorageResponse.Builder::opcWorkRequestId)
                .callSync();
    }

    @Override
    public AddCloudSqlResponse addCloudSql(AddCloudSqlRequest request) {

        Validate.notBlank(request.getBdsInstanceId(), "bdsInstanceId must not be blank");
        Objects.requireNonNull(request.getAddCloudSqlDetails(), "addCloudSqlDetails is required");

        return clientCall(request, AddCloudSqlResponse::builder)
                .logger(LOG, "addCloudSql")
                .serviceDetails(
                        "Bds",
                        "AddCloudSql",
                        "https://docs.oracle.com/iaas/api/#/en/bigdata/20190531/BdsInstance/AddCloudSql")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(AddCloudSqlRequest::builder)
                .basePath("/20190531")
                .appendPathParam("bdsInstances")
                .appendPathParam(request.getBdsInstanceId())
                .appendPathParam("actions")
                .appendPathParam("addCloudSql")
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .hasBody()
                .handleResponseHeaderString(
                        "opc-request-id", AddCloudSqlResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-work-request-id", AddCloudSqlResponse.Builder::opcWorkRequestId)
                .callSync();
    }

    @Override
    public AddKafkaResponse addKafka(AddKafkaRequest request) {

        Validate.notBlank(request.getBdsInstanceId(), "bdsInstanceId must not be blank");
        Objects.requireNonNull(request.getAddKafkaDetails(), "addKafkaDetails is required");

        return clientCall(request, AddKafkaResponse::builder)
                .logger(LOG, "addKafka")
                .serviceDetails(
                        "Bds",
                        "AddKafka",
                        "https://docs.oracle.com/iaas/api/#/en/bigdata/20190531/BdsInstance/AddKafka")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(AddKafkaRequest::builder)
                .basePath("/20190531")
                .appendPathParam("bdsInstances")
                .appendPathParam(request.getBdsInstanceId())
                .appendPathParam("actions")
                .appendPathParam("addKafka")
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .hasBody()
                .handleResponseHeaderString(
                        "opc-request-id", AddKafkaResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-work-request-id", AddKafkaResponse.Builder::opcWorkRequestId)
                .callSync();
    }

    @Override
    public AddMasterNodesResponse addMasterNodes(AddMasterNodesRequest request) {

        Validate.notBlank(request.getBdsInstanceId(), "bdsInstanceId must not be blank");
        Objects.requireNonNull(
                request.getAddMasterNodesDetails(), "addMasterNodesDetails is required");

        return clientCall(request, AddMasterNodesResponse::builder)
                .logger(LOG, "addMasterNodes")
                .serviceDetails(
                        "Bds",
                        "AddMasterNodes",
                        "https://docs.oracle.com/iaas/api/#/en/bigdata/20190531/BdsInstance/AddMasterNodes")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(AddMasterNodesRequest::builder)
                .basePath("/20190531")
                .appendPathParam("bdsInstances")
                .appendPathParam(request.getBdsInstanceId())
                .appendPathParam("actions")
                .appendPathParam("addMasterNodes")
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .hasBody()
                .handleResponseHeaderString(
                        "opc-request-id", AddMasterNodesResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-work-request-id", AddMasterNodesResponse.Builder::opcWorkRequestId)
                .callSync();
    }

    @Override
    public AddUtilityNodesResponse addUtilityNodes(AddUtilityNodesRequest request) {

        Validate.notBlank(request.getBdsInstanceId(), "bdsInstanceId must not be blank");
        Objects.requireNonNull(
                request.getAddUtilityNodesDetails(), "addUtilityNodesDetails is required");

        return clientCall(request, AddUtilityNodesResponse::builder)
                .logger(LOG, "addUtilityNodes")
                .serviceDetails(
                        "Bds",
                        "AddUtilityNodes",
                        "https://docs.oracle.com/iaas/api/#/en/bigdata/20190531/BdsInstance/AddUtilityNodes")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(AddUtilityNodesRequest::builder)
                .basePath("/20190531")
                .appendPathParam("bdsInstances")
                .appendPathParam(request.getBdsInstanceId())
                .appendPathParam("actions")
                .appendPathParam("addUtilityNodes")
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .hasBody()
                .handleResponseHeaderString(
                        "opc-request-id", AddUtilityNodesResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-work-request-id", AddUtilityNodesResponse.Builder::opcWorkRequestId)
                .callSync();
    }

    @Override
    public AddWorkerNodesResponse addWorkerNodes(AddWorkerNodesRequest request) {

        Validate.notBlank(request.getBdsInstanceId(), "bdsInstanceId must not be blank");
        Objects.requireNonNull(
                request.getAddWorkerNodesDetails(), "addWorkerNodesDetails is required");

        return clientCall(request, AddWorkerNodesResponse::builder)
                .logger(LOG, "addWorkerNodes")
                .serviceDetails(
                        "Bds",
                        "AddWorkerNodes",
                        "https://docs.oracle.com/iaas/api/#/en/bigdata/20190531/BdsInstance/AddWorkerNodes")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(AddWorkerNodesRequest::builder)
                .basePath("/20190531")
                .appendPathParam("bdsInstances")
                .appendPathParam(request.getBdsInstanceId())
                .appendPathParam("actions")
                .appendPathParam("addWorkerNodes")
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .hasBody()
                .handleResponseHeaderString(
                        "opc-request-id", AddWorkerNodesResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-work-request-id", AddWorkerNodesResponse.Builder::opcWorkRequestId)
                .callSync();
    }

    @Override
    public CertificateServiceInfoResponse certificateServiceInfo(
            CertificateServiceInfoRequest request) {

        Validate.notBlank(request.getBdsInstanceId(), "bdsInstanceId must not be blank");
        Objects.requireNonNull(
                request.getCertificateServiceInfoDetails(),
                "certificateServiceInfoDetails is required");

        return clientCall(request, CertificateServiceInfoResponse::builder)
                .logger(LOG, "certificateServiceInfo")
                .serviceDetails(
                        "Bds",
                        "CertificateServiceInfo",
                        "https://docs.oracle.com/iaas/api/#/en/bigdata/20190531/BdsInstance/CertificateServiceInfo")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(CertificateServiceInfoRequest::builder)
                .basePath("/20190531")
                .appendPathParam("bdsInstances")
                .appendPathParam(request.getBdsInstanceId())
                .appendPathParam("actions")
                .appendPathParam("fetchOdhServiceCertificate")
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .hasBody()
                .handleBodyList(
                        com.oracle.bmc.bds.model.CertificateServiceInfoSummary.class,
                        CertificateServiceInfoResponse.Builder::items)
                .handleResponseHeaderString(
                        "opc-request-id", CertificateServiceInfoResponse.Builder::opcRequestId)
                .handleResponseHeaderString("etag", CertificateServiceInfoResponse.Builder::etag)
                .callSync();
    }

    @Override
    public ChangeBdsInstanceCompartmentResponse changeBdsInstanceCompartment(
            ChangeBdsInstanceCompartmentRequest request) {

        Validate.notBlank(request.getBdsInstanceId(), "bdsInstanceId must not be blank");
        Objects.requireNonNull(
                request.getChangeBdsInstanceCompartmentDetails(),
                "changeBdsInstanceCompartmentDetails is required");

        return clientCall(request, ChangeBdsInstanceCompartmentResponse::builder)
                .logger(LOG, "changeBdsInstanceCompartment")
                .serviceDetails(
                        "Bds",
                        "ChangeBdsInstanceCompartment",
                        "https://docs.oracle.com/iaas/api/#/en/bigdata/20190531/BdsInstance/ChangeBdsInstanceCompartment")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(ChangeBdsInstanceCompartmentRequest::builder)
                .basePath("/20190531")
                .appendPathParam("bdsInstances")
                .appendPathParam(request.getBdsInstanceId())
                .appendPathParam("actions")
                .appendPathParam("changeCompartment")
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .hasBody()
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        ChangeBdsInstanceCompartmentResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id",
                        ChangeBdsInstanceCompartmentResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public ChangeShapeResponse changeShape(ChangeShapeRequest request) {

        Validate.notBlank(request.getBdsInstanceId(), "bdsInstanceId must not be blank");
        Objects.requireNonNull(request.getChangeShapeDetails(), "changeShapeDetails is required");

        return clientCall(request, ChangeShapeResponse::builder)
                .logger(LOG, "changeShape")
                .serviceDetails(
                        "Bds",
                        "ChangeShape",
                        "https://docs.oracle.com/iaas/api/#/en/bigdata/20190531/BdsInstance/ChangeShape")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(ChangeShapeRequest::builder)
                .basePath("/20190531")
                .appendPathParam("bdsInstances")
                .appendPathParam(request.getBdsInstanceId())
                .appendPathParam("actions")
                .appendPathParam("changeShape")
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .hasBody()
                .handleResponseHeaderString(
                        "opc-request-id", ChangeShapeResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-work-request-id", ChangeShapeResponse.Builder::opcWorkRequestId)
                .callSync();
    }

    @Override
    public CreateBdsApiKeyResponse createBdsApiKey(CreateBdsApiKeyRequest request) {

        Validate.notBlank(request.getBdsInstanceId(), "bdsInstanceId must not be blank");
        Objects.requireNonNull(
                request.getCreateBdsApiKeyDetails(), "createBdsApiKeyDetails is required");

        return clientCall(request, CreateBdsApiKeyResponse::builder)
                .logger(LOG, "createBdsApiKey")
                .serviceDetails(
                        "Bds",
                        "CreateBdsApiKey",
                        "https://docs.oracle.com/iaas/api/#/en/bigdata/20190531/BdsApiKey/CreateBdsApiKey")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(CreateBdsApiKeyRequest::builder)
                .basePath("/20190531")
                .appendPathParam("bdsInstances")
                .appendPathParam(request.getBdsInstanceId())
                .appendPathParam("apiKeys")
                .accept("application/json")
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .hasBody()
                .handleResponseHeaderString(
                        "opc-request-id", CreateBdsApiKeyResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-work-request-id", CreateBdsApiKeyResponse.Builder::opcWorkRequestId)
                .callSync();
    }

    @Override
    public CreateBdsInstanceResponse createBdsInstance(CreateBdsInstanceRequest request) {
        Objects.requireNonNull(
                request.getCreateBdsInstanceDetails(), "createBdsInstanceDetails is required");

        return clientCall(request, CreateBdsInstanceResponse::builder)
                .logger(LOG, "createBdsInstance")
                .serviceDetails(
                        "Bds",
                        "CreateBdsInstance",
                        "https://docs.oracle.com/iaas/api/#/en/bigdata/20190531/BdsInstance/CreateBdsInstance")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(CreateBdsInstanceRequest::builder)
                .basePath("/20190531")
                .appendPathParam("bdsInstances")
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .hasBody()
                .handleResponseHeaderString(
                        "opc-request-id", CreateBdsInstanceResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-work-request-id", CreateBdsInstanceResponse.Builder::opcWorkRequestId)
                .callSync();
    }

    @Override
    public CreateBdsMetastoreConfigurationResponse createBdsMetastoreConfiguration(
            CreateBdsMetastoreConfigurationRequest request) {

        Validate.notBlank(request.getBdsInstanceId(), "bdsInstanceId must not be blank");
        Objects.requireNonNull(
                request.getCreateBdsMetastoreConfigurationDetails(),
                "createBdsMetastoreConfigurationDetails is required");

        return clientCall(request, CreateBdsMetastoreConfigurationResponse::builder)
                .logger(LOG, "createBdsMetastoreConfiguration")
                .serviceDetails(
                        "Bds",
                        "CreateBdsMetastoreConfiguration",
                        "https://docs.oracle.com/iaas/api/#/en/bigdata/20190531/BdsMetastoreConfiguration/CreateBdsMetastoreConfiguration")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(CreateBdsMetastoreConfigurationRequest::builder)
                .basePath("/20190531")
                .appendPathParam("bdsInstances")
                .appendPathParam(request.getBdsInstanceId())
                .appendPathParam("metastoreConfigs")
                .accept("application/json")
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .hasBody()
                .handleResponseHeaderString(
                        "opc-request-id",
                        CreateBdsMetastoreConfigurationResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        CreateBdsMetastoreConfigurationResponse.Builder::opcWorkRequestId)
                .callSync();
    }

    @Override
    public DeleteBdsApiKeyResponse deleteBdsApiKey(DeleteBdsApiKeyRequest request) {

        Validate.notBlank(request.getBdsInstanceId(), "bdsInstanceId must not be blank");

        Validate.notBlank(request.getApiKeyId(), "apiKeyId must not be blank");

        return clientCall(request, DeleteBdsApiKeyResponse::builder)
                .logger(LOG, "deleteBdsApiKey")
                .serviceDetails(
                        "Bds",
                        "DeleteBdsApiKey",
                        "https://docs.oracle.com/iaas/api/#/en/bigdata/20190531/BdsApiKey/DeleteBdsApiKey")
                .method(com.oracle.bmc.http.client.Method.DELETE)
                .requestBuilder(DeleteBdsApiKeyRequest::builder)
                .basePath("/20190531")
                .appendPathParam("bdsInstances")
                .appendPathParam(request.getBdsInstanceId())
                .appendPathParam("apiKeys")
                .appendPathParam(request.getApiKeyId())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("if-match", request.getIfMatch())
                .handleResponseHeaderString(
                        "opc-request-id", DeleteBdsApiKeyResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-work-request-id", DeleteBdsApiKeyResponse.Builder::opcWorkRequestId)
                .callSync();
    }

    @Override
    public DeleteBdsInstanceResponse deleteBdsInstance(DeleteBdsInstanceRequest request) {

        Validate.notBlank(request.getBdsInstanceId(), "bdsInstanceId must not be blank");

        return clientCall(request, DeleteBdsInstanceResponse::builder)
                .logger(LOG, "deleteBdsInstance")
                .serviceDetails(
                        "Bds",
                        "DeleteBdsInstance",
                        "https://docs.oracle.com/iaas/api/#/en/bigdata/20190531/BdsInstance/DeleteBdsInstance")
                .method(com.oracle.bmc.http.client.Method.DELETE)
                .requestBuilder(DeleteBdsInstanceRequest::builder)
                .basePath("/20190531")
                .appendPathParam("bdsInstances")
                .appendPathParam(request.getBdsInstanceId())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("if-match", request.getIfMatch())
                .handleResponseHeaderString(
                        "opc-request-id", DeleteBdsInstanceResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-work-request-id", DeleteBdsInstanceResponse.Builder::opcWorkRequestId)
                .callSync();
    }

    @Override
    public DeleteBdsMetastoreConfigurationResponse deleteBdsMetastoreConfiguration(
            DeleteBdsMetastoreConfigurationRequest request) {

        Validate.notBlank(request.getBdsInstanceId(), "bdsInstanceId must not be blank");

        Validate.notBlank(request.getMetastoreConfigId(), "metastoreConfigId must not be blank");

        return clientCall(request, DeleteBdsMetastoreConfigurationResponse::builder)
                .logger(LOG, "deleteBdsMetastoreConfiguration")
                .serviceDetails(
                        "Bds",
                        "DeleteBdsMetastoreConfiguration",
                        "https://docs.oracle.com/iaas/api/#/en/bigdata/20190531/BdsMetastoreConfiguration/DeleteBdsMetastoreConfiguration")
                .method(com.oracle.bmc.http.client.Method.DELETE)
                .requestBuilder(DeleteBdsMetastoreConfigurationRequest::builder)
                .basePath("/20190531")
                .appendPathParam("bdsInstances")
                .appendPathParam(request.getBdsInstanceId())
                .appendPathParam("metastoreConfigs")
                .appendPathParam(request.getMetastoreConfigId())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("if-match", request.getIfMatch())
                .handleResponseHeaderString(
                        "opc-request-id",
                        DeleteBdsMetastoreConfigurationResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        DeleteBdsMetastoreConfigurationResponse.Builder::opcWorkRequestId)
                .callSync();
    }

    @Override
    public DisableCertificateResponse disableCertificate(DisableCertificateRequest request) {

        Validate.notBlank(request.getBdsInstanceId(), "bdsInstanceId must not be blank");
        Objects.requireNonNull(
                request.getDisableCertificateDetails(), "disableCertificateDetails is required");

        return clientCall(request, DisableCertificateResponse::builder)
                .logger(LOG, "disableCertificate")
                .serviceDetails(
                        "Bds",
                        "DisableCertificate",
                        "https://docs.oracle.com/iaas/api/#/en/bigdata/20190531/BdsInstance/DisableCertificate")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(DisableCertificateRequest::builder)
                .basePath("/20190531")
                .appendPathParam("bdsInstances")
                .appendPathParam(request.getBdsInstanceId())
                .appendPathParam("actions")
                .appendPathParam("disableOdhServiceCertificate")
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .hasBody()
                .handleResponseHeaderString(
                        "opc-request-id", DisableCertificateResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-work-request-id", DisableCertificateResponse.Builder::opcWorkRequestId)
                .callSync();
    }

    @Override
    public EnableCertificateResponse enableCertificate(EnableCertificateRequest request) {

        Validate.notBlank(request.getBdsInstanceId(), "bdsInstanceId must not be blank");
        Objects.requireNonNull(
                request.getEnableCertificateDetails(), "enableCertificateDetails is required");

        return clientCall(request, EnableCertificateResponse::builder)
                .logger(LOG, "enableCertificate")
                .serviceDetails(
                        "Bds",
                        "EnableCertificate",
                        "https://docs.oracle.com/iaas/api/#/en/bigdata/20190531/BdsInstance/EnableCertificate")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(EnableCertificateRequest::builder)
                .basePath("/20190531")
                .appendPathParam("bdsInstances")
                .appendPathParam(request.getBdsInstanceId())
                .appendPathParam("actions")
                .appendPathParam("enableOdhServiceCertificate")
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .hasBody()
                .handleResponseHeaderString(
                        "opc-request-id", EnableCertificateResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-work-request-id", EnableCertificateResponse.Builder::opcWorkRequestId)
                .callSync();
    }

    @Override
    public ExecuteBootstrapScriptResponse executeBootstrapScript(
            ExecuteBootstrapScriptRequest request) {

        Validate.notBlank(request.getBdsInstanceId(), "bdsInstanceId must not be blank");
        Objects.requireNonNull(
                request.getExecuteBootstrapScriptDetails(),
                "executeBootstrapScriptDetails is required");

        return clientCall(request, ExecuteBootstrapScriptResponse::builder)
                .logger(LOG, "executeBootstrapScript")
                .serviceDetails(
                        "Bds",
                        "ExecuteBootstrapScript",
                        "https://docs.oracle.com/iaas/api/#/en/bigdata/20190531/BdsInstance/ExecuteBootstrapScript")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(ExecuteBootstrapScriptRequest::builder)
                .basePath("/20190531")
                .appendPathParam("bdsInstances")
                .appendPathParam(request.getBdsInstanceId())
                .appendPathParam("actions")
                .appendPathParam("executeBootstrapScript")
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .hasBody()
                .handleResponseHeaderString(
                        "opc-request-id", ExecuteBootstrapScriptResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        ExecuteBootstrapScriptResponse.Builder::opcWorkRequestId)
                .callSync();
    }

    @Override
    public GetAutoScalingConfigurationResponse getAutoScalingConfiguration(
            GetAutoScalingConfigurationRequest request) {

        Validate.notBlank(request.getBdsInstanceId(), "bdsInstanceId must not be blank");

        Validate.notBlank(
                request.getAutoScalingConfigurationId(),
                "autoScalingConfigurationId must not be blank");

        return clientCall(request, GetAutoScalingConfigurationResponse::builder)
                .logger(LOG, "getAutoScalingConfiguration")
                .serviceDetails(
                        "Bds",
                        "GetAutoScalingConfiguration",
                        "https://docs.oracle.com/iaas/api/#/en/bigdata/20190531/BdsInstance/GetAutoScalingConfiguration")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetAutoScalingConfigurationRequest::builder)
                .basePath("/20190531")
                .appendPathParam("bdsInstances")
                .appendPathParam(request.getBdsInstanceId())
                .appendPathParam("autoScalingConfiguration")
                .appendPathParam(request.getAutoScalingConfigurationId())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.bds.model.AutoScalingConfiguration.class,
                        GetAutoScalingConfigurationResponse.Builder::autoScalingConfiguration)
                .handleResponseHeaderString(
                        "opc-request-id", GetAutoScalingConfigurationResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "etag", GetAutoScalingConfigurationResponse.Builder::etag)
                .callSync();
    }

    @Override
    public GetBdsApiKeyResponse getBdsApiKey(GetBdsApiKeyRequest request) {

        Validate.notBlank(request.getBdsInstanceId(), "bdsInstanceId must not be blank");

        Validate.notBlank(request.getApiKeyId(), "apiKeyId must not be blank");

        return clientCall(request, GetBdsApiKeyResponse::builder)
                .logger(LOG, "getBdsApiKey")
                .serviceDetails(
                        "Bds",
                        "GetBdsApiKey",
                        "https://docs.oracle.com/iaas/api/#/en/bigdata/20190531/BdsApiKey/GetBdsApiKey")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetBdsApiKeyRequest::builder)
                .basePath("/20190531")
                .appendPathParam("bdsInstances")
                .appendPathParam(request.getBdsInstanceId())
                .appendPathParam("apiKeys")
                .appendPathParam(request.getApiKeyId())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.bds.model.BdsApiKey.class,
                        GetBdsApiKeyResponse.Builder::bdsApiKey)
                .handleResponseHeaderString(
                        "opc-request-id", GetBdsApiKeyResponse.Builder::opcRequestId)
                .handleResponseHeaderString("etag", GetBdsApiKeyResponse.Builder::etag)
                .callSync();
    }

    @Override
    public GetBdsInstanceResponse getBdsInstance(GetBdsInstanceRequest request) {

        Validate.notBlank(request.getBdsInstanceId(), "bdsInstanceId must not be blank");

        return clientCall(request, GetBdsInstanceResponse::builder)
                .logger(LOG, "getBdsInstance")
                .serviceDetails(
                        "Bds",
                        "GetBdsInstance",
                        "https://docs.oracle.com/iaas/api/#/en/bigdata/20190531/BdsInstance/GetBdsInstance")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetBdsInstanceRequest::builder)
                .basePath("/20190531")
                .appendPathParam("bdsInstances")
                .appendPathParam(request.getBdsInstanceId())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.bds.model.BdsInstance.class,
                        GetBdsInstanceResponse.Builder::bdsInstance)
                .handleResponseHeaderString(
                        "opc-request-id", GetBdsInstanceResponse.Builder::opcRequestId)
                .handleResponseHeaderString("etag", GetBdsInstanceResponse.Builder::etag)
                .callSync();
    }

    @Override
    public GetBdsMetastoreConfigurationResponse getBdsMetastoreConfiguration(
            GetBdsMetastoreConfigurationRequest request) {

        Validate.notBlank(request.getBdsInstanceId(), "bdsInstanceId must not be blank");

        Validate.notBlank(request.getMetastoreConfigId(), "metastoreConfigId must not be blank");

        return clientCall(request, GetBdsMetastoreConfigurationResponse::builder)
                .logger(LOG, "getBdsMetastoreConfiguration")
                .serviceDetails(
                        "Bds",
                        "GetBdsMetastoreConfiguration",
                        "https://docs.oracle.com/iaas/api/#/en/bigdata/20190531/BdsMetastoreConfiguration/GetBdsMetastoreConfiguration")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetBdsMetastoreConfigurationRequest::builder)
                .basePath("/20190531")
                .appendPathParam("bdsInstances")
                .appendPathParam(request.getBdsInstanceId())
                .appendPathParam("metastoreConfigs")
                .appendPathParam(request.getMetastoreConfigId())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.bds.model.BdsMetastoreConfiguration.class,
                        GetBdsMetastoreConfigurationResponse.Builder::bdsMetastoreConfiguration)
                .handleResponseHeaderString(
                        "opc-request-id",
                        GetBdsMetastoreConfigurationResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "etag", GetBdsMetastoreConfigurationResponse.Builder::etag)
                .callSync();
    }

    @Override
    public GetOsPatchDetailsResponse getOsPatchDetails(GetOsPatchDetailsRequest request) {

        Validate.notBlank(request.getBdsInstanceId(), "bdsInstanceId must not be blank");
        Objects.requireNonNull(request.getOsPatchVersion(), "osPatchVersion is required");

        return clientCall(request, GetOsPatchDetailsResponse::builder)
                .logger(LOG, "getOsPatchDetails")
                .serviceDetails(
                        "Bds",
                        "GetOsPatchDetails",
                        "https://docs.oracle.com/iaas/api/#/en/bigdata/20190531/BdsInstance/GetOsPatchDetails")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(GetOsPatchDetailsRequest::builder)
                .basePath("/20190531")
                .appendPathParam("bdsInstances")
                .appendPathParam(request.getBdsInstanceId())
                .appendPathParam("actions")
                .appendPathParam("getOsPatch")
                .appendQueryParam("osPatchVersion", request.getOsPatchVersion())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .handleBody(
                        com.oracle.bmc.bds.model.OsPatchDetails.class,
                        GetOsPatchDetailsResponse.Builder::osPatchDetails)
                .handleResponseHeaderString(
                        "opc-request-id", GetOsPatchDetailsResponse.Builder::opcRequestId)
                .handleResponseHeaderString("etag", GetOsPatchDetailsResponse.Builder::etag)
                .callSync();
    }

    @Override
    public GetWorkRequestResponse getWorkRequest(GetWorkRequestRequest request) {

        Validate.notBlank(request.getWorkRequestId(), "workRequestId must not be blank");

        return clientCall(request, GetWorkRequestResponse::builder)
                .logger(LOG, "getWorkRequest")
                .serviceDetails(
                        "Bds",
                        "GetWorkRequest",
                        "https://docs.oracle.com/iaas/api/#/en/bigdata/20190531/WorkRequest/GetWorkRequest")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetWorkRequestRequest::builder)
                .basePath("/20190531")
                .appendPathParam("workRequests")
                .appendPathParam(request.getWorkRequestId())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.bds.model.WorkRequest.class,
                        GetWorkRequestResponse.Builder::workRequest)
                .handleResponseHeaderString(
                        "opc-request-id", GetWorkRequestResponse.Builder::opcRequestId)
                .handleResponseHeaderBigDecimal(
                        "retry-after", GetWorkRequestResponse.Builder::retryAfter)
                .callSync();
    }

    @Override
    public InstallOsPatchResponse installOsPatch(InstallOsPatchRequest request) {

        Validate.notBlank(request.getBdsInstanceId(), "bdsInstanceId must not be blank");
        Objects.requireNonNull(
                request.getInstallOsPatchDetails(), "installOsPatchDetails is required");

        return clientCall(request, InstallOsPatchResponse::builder)
                .logger(LOG, "installOsPatch")
                .serviceDetails(
                        "Bds",
                        "InstallOsPatch",
                        "https://docs.oracle.com/iaas/api/#/en/bigdata/20190531/BdsInstance/InstallOsPatch")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(InstallOsPatchRequest::builder)
                .basePath("/20190531")
                .appendPathParam("bdsInstances")
                .appendPathParam(request.getBdsInstanceId())
                .appendPathParam("actions")
                .appendPathParam("installOsPatch")
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .hasBody()
                .handleResponseHeaderString(
                        "opc-request-id", InstallOsPatchResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-work-request-id", InstallOsPatchResponse.Builder::opcWorkRequestId)
                .callSync();
    }

    @Override
    public InstallPatchResponse installPatch(InstallPatchRequest request) {

        Validate.notBlank(request.getBdsInstanceId(), "bdsInstanceId must not be blank");
        Objects.requireNonNull(request.getInstallPatchDetails(), "installPatchDetails is required");

        return clientCall(request, InstallPatchResponse::builder)
                .logger(LOG, "installPatch")
                .serviceDetails(
                        "Bds",
                        "InstallPatch",
                        "https://docs.oracle.com/iaas/api/#/en/bigdata/20190531/BdsInstance/InstallPatch")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(InstallPatchRequest::builder)
                .basePath("/20190531")
                .appendPathParam("bdsInstances")
                .appendPathParam(request.getBdsInstanceId())
                .appendPathParam("actions")
                .appendPathParam("installPatch")
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .hasBody()
                .handleResponseHeaderString(
                        "opc-request-id", InstallPatchResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-work-request-id", InstallPatchResponse.Builder::opcWorkRequestId)
                .callSync();
    }

    @Override
    public ListAutoScalingConfigurationsResponse listAutoScalingConfigurations(
            ListAutoScalingConfigurationsRequest request) {
        Objects.requireNonNull(request.getCompartmentId(), "compartmentId is required");

        Validate.notBlank(request.getBdsInstanceId(), "bdsInstanceId must not be blank");

        return clientCall(request, ListAutoScalingConfigurationsResponse::builder)
                .logger(LOG, "listAutoScalingConfigurations")
                .serviceDetails(
                        "Bds",
                        "ListAutoScalingConfigurations",
                        "https://docs.oracle.com/iaas/api/#/en/bigdata/20190531/BdsInstance/ListAutoScalingConfigurations")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListAutoScalingConfigurationsRequest::builder)
                .basePath("/20190531")
                .appendPathParam("bdsInstances")
                .appendPathParam(request.getBdsInstanceId())
                .appendPathParam("autoScalingConfiguration")
                .appendQueryParam("compartmentId", request.getCompartmentId())
                .appendQueryParam("page", request.getPage())
                .appendQueryParam("limit", request.getLimit())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .appendQueryParam("displayName", request.getDisplayName())
                .appendEnumQueryParam("lifecycleState", request.getLifecycleState())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBodyList(
                        com.oracle.bmc.bds.model.AutoScalingConfigurationSummary.class,
                        ListAutoScalingConfigurationsResponse.Builder::items)
                .handleResponseHeaderString(
                        "opc-request-id",
                        ListAutoScalingConfigurationsResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListAutoScalingConfigurationsResponse.Builder::opcNextPage)
                .callSync();
    }

    @Override
    public ListBdsApiKeysResponse listBdsApiKeys(ListBdsApiKeysRequest request) {

        Validate.notBlank(request.getBdsInstanceId(), "bdsInstanceId must not be blank");

        return clientCall(request, ListBdsApiKeysResponse::builder)
                .logger(LOG, "listBdsApiKeys")
                .serviceDetails(
                        "Bds",
                        "ListBdsApiKeys",
                        "https://docs.oracle.com/iaas/api/#/en/bigdata/20190531/BdsApiKey/ListBdsApiKeys")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListBdsApiKeysRequest::builder)
                .basePath("/20190531")
                .appendPathParam("bdsInstances")
                .appendPathParam(request.getBdsInstanceId())
                .appendPathParam("apiKeys")
                .appendEnumQueryParam("lifecycleState", request.getLifecycleState())
                .appendQueryParam("userId", request.getUserId())
                .appendQueryParam("page", request.getPage())
                .appendQueryParam("limit", request.getLimit())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .appendQueryParam("displayName", request.getDisplayName())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBodyList(
                        com.oracle.bmc.bds.model.BdsApiKeySummary.class,
                        ListBdsApiKeysResponse.Builder::items)
                .handleResponseHeaderString(
                        "opc-request-id", ListBdsApiKeysResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListBdsApiKeysResponse.Builder::opcNextPage)
                .callSync();
    }

    @Override
    public ListBdsInstancesResponse listBdsInstances(ListBdsInstancesRequest request) {
        Objects.requireNonNull(request.getCompartmentId(), "compartmentId is required");

        return clientCall(request, ListBdsInstancesResponse::builder)
                .logger(LOG, "listBdsInstances")
                .serviceDetails(
                        "Bds",
                        "ListBdsInstances",
                        "https://docs.oracle.com/iaas/api/#/en/bigdata/20190531/BdsInstanceSummary/ListBdsInstances")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListBdsInstancesRequest::builder)
                .basePath("/20190531")
                .appendPathParam("bdsInstances")
                .appendQueryParam("compartmentId", request.getCompartmentId())
                .appendEnumQueryParam("lifecycleState", request.getLifecycleState())
                .appendQueryParam("page", request.getPage())
                .appendQueryParam("limit", request.getLimit())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .appendQueryParam("displayName", request.getDisplayName())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBodyList(
                        com.oracle.bmc.bds.model.BdsInstanceSummary.class,
                        ListBdsInstancesResponse.Builder::items)
                .handleResponseHeaderString(
                        "opc-request-id", ListBdsInstancesResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListBdsInstancesResponse.Builder::opcNextPage)
                .callSync();
    }

    @Override
    public ListBdsMetastoreConfigurationsResponse listBdsMetastoreConfigurations(
            ListBdsMetastoreConfigurationsRequest request) {

        Validate.notBlank(request.getBdsInstanceId(), "bdsInstanceId must not be blank");

        return clientCall(request, ListBdsMetastoreConfigurationsResponse::builder)
                .logger(LOG, "listBdsMetastoreConfigurations")
                .serviceDetails(
                        "Bds",
                        "ListBdsMetastoreConfigurations",
                        "https://docs.oracle.com/iaas/api/#/en/bigdata/20190531/BdsMetastoreConfiguration/ListBdsMetastoreConfigurations")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListBdsMetastoreConfigurationsRequest::builder)
                .basePath("/20190531")
                .appendPathParam("bdsInstances")
                .appendPathParam(request.getBdsInstanceId())
                .appendPathParam("metastoreConfigs")
                .appendEnumQueryParam("metastoreType", request.getMetastoreType())
                .appendQueryParam("metastoreId", request.getMetastoreId())
                .appendEnumQueryParam("lifecycleState", request.getLifecycleState())
                .appendQueryParam("bdsApiKeyId", request.getBdsApiKeyId())
                .appendQueryParam("page", request.getPage())
                .appendQueryParam("limit", request.getLimit())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .appendQueryParam("displayName", request.getDisplayName())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBodyList(
                        com.oracle.bmc.bds.model.BdsMetastoreConfigurationSummary.class,
                        ListBdsMetastoreConfigurationsResponse.Builder::items)
                .handleResponseHeaderString(
                        "opc-request-id",
                        ListBdsMetastoreConfigurationsResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page",
                        ListBdsMetastoreConfigurationsResponse.Builder::opcNextPage)
                .callSync();
    }

    @Override
    public ListOsPatchesResponse listOsPatches(ListOsPatchesRequest request) {

        Validate.notBlank(request.getBdsInstanceId(), "bdsInstanceId must not be blank");

        return clientCall(request, ListOsPatchesResponse::builder)
                .logger(LOG, "listOsPatches")
                .serviceDetails(
                        "Bds",
                        "ListOsPatches",
                        "https://docs.oracle.com/iaas/api/#/en/bigdata/20190531/BdsInstance/ListOsPatches")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(ListOsPatchesRequest::builder)
                .basePath("/20190531")
                .appendPathParam("bdsInstances")
                .appendPathParam(request.getBdsInstanceId())
                .appendPathParam("actions")
                .appendPathParam("listOsPatches")
                .appendQueryParam("page", request.getPage())
                .appendQueryParam("limit", request.getLimit())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .handleBodyList(
                        com.oracle.bmc.bds.model.OsPatchSummary.class,
                        ListOsPatchesResponse.Builder::items)
                .handleResponseHeaderString(
                        "opc-next-page", ListOsPatchesResponse.Builder::opcNextPage)
                .handleResponseHeaderString(
                        "opc-request-id", ListOsPatchesResponse.Builder::opcRequestId)
                .handleResponseHeaderString("etag", ListOsPatchesResponse.Builder::etag)
                .callSync();
    }

    @Override
    public ListPatchHistoriesResponse listPatchHistories(ListPatchHistoriesRequest request) {

        Validate.notBlank(request.getBdsInstanceId(), "bdsInstanceId must not be blank");

        return clientCall(request, ListPatchHistoriesResponse::builder)
                .logger(LOG, "listPatchHistories")
                .serviceDetails(
                        "Bds",
                        "ListPatchHistories",
                        "https://docs.oracle.com/iaas/api/#/en/bigdata/20190531/BdsInstance/ListPatchHistories")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListPatchHistoriesRequest::builder)
                .basePath("/20190531")
                .appendPathParam("bdsInstances")
                .appendPathParam(request.getBdsInstanceId())
                .appendPathParam("patchHistory")
                .appendEnumQueryParam("lifecycleState", request.getLifecycleState())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .appendQueryParam("patchVersion", request.getPatchVersion())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .appendQueryParam("page", request.getPage())
                .appendQueryParam("limit", request.getLimit())
                .appendEnumQueryParam("patchType", request.getPatchType())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBodyList(
                        com.oracle.bmc.bds.model.PatchHistorySummary.class,
                        ListPatchHistoriesResponse.Builder::items)
                .handleResponseHeaderString(
                        "opc-next-page", ListPatchHistoriesResponse.Builder::opcNextPage)
                .handleResponseHeaderString(
                        "opc-request-id", ListPatchHistoriesResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public ListPatchesResponse listPatches(ListPatchesRequest request) {

        Validate.notBlank(request.getBdsInstanceId(), "bdsInstanceId must not be blank");

        return clientCall(request, ListPatchesResponse::builder)
                .logger(LOG, "listPatches")
                .serviceDetails(
                        "Bds",
                        "ListPatches",
                        "https://docs.oracle.com/iaas/api/#/en/bigdata/20190531/BdsInstance/ListPatches")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListPatchesRequest::builder)
                .basePath("/20190531")
                .appendPathParam("bdsInstances")
                .appendPathParam(request.getBdsInstanceId())
                .appendPathParam("patches")
                .appendQueryParam("page", request.getPage())
                .appendQueryParam("limit", request.getLimit())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBodyList(
                        com.oracle.bmc.bds.model.PatchSummary.class,
                        ListPatchesResponse.Builder::items)
                .handleResponseHeaderString(
                        "opc-next-page", ListPatchesResponse.Builder::opcNextPage)
                .handleResponseHeaderString(
                        "opc-request-id", ListPatchesResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public ListWorkRequestErrorsResponse listWorkRequestErrors(
            ListWorkRequestErrorsRequest request) {

        Validate.notBlank(request.getWorkRequestId(), "workRequestId must not be blank");

        return clientCall(request, ListWorkRequestErrorsResponse::builder)
                .logger(LOG, "listWorkRequestErrors")
                .serviceDetails(
                        "Bds",
                        "ListWorkRequestErrors",
                        "https://docs.oracle.com/iaas/api/#/en/bigdata/20190531/WorkRequestError/ListWorkRequestErrors")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListWorkRequestErrorsRequest::builder)
                .basePath("/20190531")
                .appendPathParam("workRequests")
                .appendPathParam(request.getWorkRequestId())
                .appendPathParam("errors")
                .appendQueryParam("page", request.getPage())
                .appendQueryParam("limit", request.getLimit())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBodyList(
                        com.oracle.bmc.bds.model.WorkRequestError.class,
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
                        "Bds",
                        "ListWorkRequestLogs",
                        "https://docs.oracle.com/iaas/api/#/en/bigdata/20190531/WorkRequestLogEntry/ListWorkRequestLogs")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListWorkRequestLogsRequest::builder)
                .basePath("/20190531")
                .appendPathParam("workRequests")
                .appendPathParam(request.getWorkRequestId())
                .appendPathParam("logs")
                .appendQueryParam("page", request.getPage())
                .appendQueryParam("limit", request.getLimit())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBodyList(
                        com.oracle.bmc.bds.model.WorkRequestLogEntry.class,
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
                        "Bds",
                        "ListWorkRequests",
                        "https://docs.oracle.com/iaas/api/#/en/bigdata/20190531/WorkRequest/ListWorkRequests")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListWorkRequestsRequest::builder)
                .basePath("/20190531")
                .appendPathParam("workRequests")
                .appendQueryParam("compartmentId", request.getCompartmentId())
                .appendQueryParam("resourceId", request.getResourceId())
                .appendQueryParam("page", request.getPage())
                .appendQueryParam("limit", request.getLimit())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBodyList(
                        com.oracle.bmc.bds.model.WorkRequest.class,
                        ListWorkRequestsResponse.Builder::items)
                .handleResponseHeaderString(
                        "opc-request-id", ListWorkRequestsResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListWorkRequestsResponse.Builder::opcNextPage)
                .callSync();
    }

    @Override
    public RemoveAutoScalingConfigurationResponse removeAutoScalingConfiguration(
            RemoveAutoScalingConfigurationRequest request) {

        Validate.notBlank(request.getBdsInstanceId(), "bdsInstanceId must not be blank");

        Validate.notBlank(
                request.getAutoScalingConfigurationId(),
                "autoScalingConfigurationId must not be blank");
        Objects.requireNonNull(
                request.getRemoveAutoScalingConfigurationDetails(),
                "removeAutoScalingConfigurationDetails is required");

        return clientCall(request, RemoveAutoScalingConfigurationResponse::builder)
                .logger(LOG, "removeAutoScalingConfiguration")
                .serviceDetails(
                        "Bds",
                        "RemoveAutoScalingConfiguration",
                        "https://docs.oracle.com/iaas/api/#/en/bigdata/20190531/BdsInstance/RemoveAutoScalingConfiguration")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(RemoveAutoScalingConfigurationRequest::builder)
                .basePath("/20190531")
                .appendPathParam("bdsInstances")
                .appendPathParam(request.getBdsInstanceId())
                .appendPathParam("autoScalingConfiguration")
                .appendPathParam(request.getAutoScalingConfigurationId())
                .appendPathParam("actions")
                .appendPathParam("remove")
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .hasBody()
                .handleResponseHeaderString(
                        "opc-request-id",
                        RemoveAutoScalingConfigurationResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        RemoveAutoScalingConfigurationResponse.Builder::opcWorkRequestId)
                .callSync();
    }

    @Override
    public RemoveCloudSqlResponse removeCloudSql(RemoveCloudSqlRequest request) {

        Validate.notBlank(request.getBdsInstanceId(), "bdsInstanceId must not be blank");
        Objects.requireNonNull(
                request.getRemoveCloudSqlDetails(), "removeCloudSqlDetails is required");

        return clientCall(request, RemoveCloudSqlResponse::builder)
                .logger(LOG, "removeCloudSql")
                .serviceDetails(
                        "Bds",
                        "RemoveCloudSql",
                        "https://docs.oracle.com/iaas/api/#/en/bigdata/20190531/BdsInstance/RemoveCloudSql")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(RemoveCloudSqlRequest::builder)
                .basePath("/20190531")
                .appendPathParam("bdsInstances")
                .appendPathParam(request.getBdsInstanceId())
                .appendPathParam("actions")
                .appendPathParam("removeCloudSql")
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .hasBody()
                .handleResponseHeaderString(
                        "opc-request-id", RemoveCloudSqlResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-work-request-id", RemoveCloudSqlResponse.Builder::opcWorkRequestId)
                .callSync();
    }

    @Override
    public RemoveKafkaResponse removeKafka(RemoveKafkaRequest request) {

        Validate.notBlank(request.getBdsInstanceId(), "bdsInstanceId must not be blank");
        Objects.requireNonNull(request.getRemoveKafkaDetails(), "removeKafkaDetails is required");

        return clientCall(request, RemoveKafkaResponse::builder)
                .logger(LOG, "removeKafka")
                .serviceDetails(
                        "Bds",
                        "RemoveKafka",
                        "https://docs.oracle.com/iaas/api/#/en/bigdata/20190531/BdsInstance/RemoveKafka")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(RemoveKafkaRequest::builder)
                .basePath("/20190531")
                .appendPathParam("bdsInstances")
                .appendPathParam(request.getBdsInstanceId())
                .appendPathParam("actions")
                .appendPathParam("removeKafka")
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .hasBody()
                .handleResponseHeaderString(
                        "opc-request-id", RemoveKafkaResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-work-request-id", RemoveKafkaResponse.Builder::opcWorkRequestId)
                .callSync();
    }

    @Override
    public RemoveNodeResponse removeNode(RemoveNodeRequest request) {

        Validate.notBlank(request.getBdsInstanceId(), "bdsInstanceId must not be blank");
        Objects.requireNonNull(request.getRemoveNodeDetails(), "removeNodeDetails is required");

        return clientCall(request, RemoveNodeResponse::builder)
                .logger(LOG, "removeNode")
                .serviceDetails(
                        "Bds",
                        "RemoveNode",
                        "https://docs.oracle.com/iaas/api/#/en/bigdata/20190531/BdsInstance/RemoveNode")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(RemoveNodeRequest::builder)
                .basePath("/20190531")
                .appendPathParam("bdsInstances")
                .appendPathParam(request.getBdsInstanceId())
                .appendPathParam("actions")
                .appendPathParam("removeNode")
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("if-match", request.getIfMatch())
                .hasBody()
                .handleResponseHeaderString(
                        "opc-request-id", RemoveNodeResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-work-request-id", RemoveNodeResponse.Builder::opcWorkRequestId)
                .callSync();
    }

    @Override
    public RenewCertificateResponse renewCertificate(RenewCertificateRequest request) {

        Validate.notBlank(request.getBdsInstanceId(), "bdsInstanceId must not be blank");
        Objects.requireNonNull(
                request.getRenewCertificateDetails(), "renewCertificateDetails is required");

        return clientCall(request, RenewCertificateResponse::builder)
                .logger(LOG, "renewCertificate")
                .serviceDetails(
                        "Bds",
                        "RenewCertificate",
                        "https://docs.oracle.com/iaas/api/#/en/bigdata/20190531/BdsInstance/RenewCertificate")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(RenewCertificateRequest::builder)
                .basePath("/20190531")
                .appendPathParam("bdsInstances")
                .appendPathParam(request.getBdsInstanceId())
                .appendPathParam("actions")
                .appendPathParam("renewOdhServiceCertificate")
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .hasBody()
                .handleResponseHeaderString(
                        "opc-request-id", RenewCertificateResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-work-request-id", RenewCertificateResponse.Builder::opcWorkRequestId)
                .callSync();
    }

    @Override
    public RestartNodeResponse restartNode(RestartNodeRequest request) {

        Validate.notBlank(request.getBdsInstanceId(), "bdsInstanceId must not be blank");
        Objects.requireNonNull(request.getRestartNodeDetails(), "restartNodeDetails is required");

        return clientCall(request, RestartNodeResponse::builder)
                .logger(LOG, "restartNode")
                .serviceDetails(
                        "Bds",
                        "RestartNode",
                        "https://docs.oracle.com/iaas/api/#/en/bigdata/20190531/BdsInstance/RestartNode")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(RestartNodeRequest::builder)
                .basePath("/20190531")
                .appendPathParam("bdsInstances")
                .appendPathParam(request.getBdsInstanceId())
                .appendPathParam("actions")
                .appendPathParam("restartNode")
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .hasBody()
                .handleResponseHeaderString(
                        "opc-request-id", RestartNodeResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-work-request-id", RestartNodeResponse.Builder::opcWorkRequestId)
                .callSync();
    }

    @Override
    public StartBdsInstanceResponse startBdsInstance(StartBdsInstanceRequest request) {

        Validate.notBlank(request.getBdsInstanceId(), "bdsInstanceId must not be blank");
        Objects.requireNonNull(
                request.getStartBdsInstanceDetails(), "startBdsInstanceDetails is required");

        return clientCall(request, StartBdsInstanceResponse::builder)
                .logger(LOG, "startBdsInstance")
                .serviceDetails(
                        "Bds",
                        "StartBdsInstance",
                        "https://docs.oracle.com/iaas/api/#/en/bigdata/20190531/BdsInstance/StartBdsInstance")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(StartBdsInstanceRequest::builder)
                .basePath("/20190531")
                .appendPathParam("bdsInstances")
                .appendPathParam(request.getBdsInstanceId())
                .appendPathParam("actions")
                .appendPathParam("start")
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("if-match", request.getIfMatch())
                .hasBody()
                .handleResponseHeaderString(
                        "opc-request-id", StartBdsInstanceResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-work-request-id", StartBdsInstanceResponse.Builder::opcWorkRequestId)
                .callSync();
    }

    @Override
    public StopBdsInstanceResponse stopBdsInstance(StopBdsInstanceRequest request) {

        Validate.notBlank(request.getBdsInstanceId(), "bdsInstanceId must not be blank");
        Objects.requireNonNull(
                request.getStopBdsInstanceDetails(), "stopBdsInstanceDetails is required");

        return clientCall(request, StopBdsInstanceResponse::builder)
                .logger(LOG, "stopBdsInstance")
                .serviceDetails(
                        "Bds",
                        "StopBdsInstance",
                        "https://docs.oracle.com/iaas/api/#/en/bigdata/20190531/BdsInstance/StopBdsInstance")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(StopBdsInstanceRequest::builder)
                .basePath("/20190531")
                .appendPathParam("bdsInstances")
                .appendPathParam(request.getBdsInstanceId())
                .appendPathParam("actions")
                .appendPathParam("stop")
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("if-match", request.getIfMatch())
                .hasBody()
                .handleResponseHeaderString(
                        "opc-request-id", StopBdsInstanceResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-work-request-id", StopBdsInstanceResponse.Builder::opcWorkRequestId)
                .callSync();
    }

    @Override
    public TestBdsMetastoreConfigurationResponse testBdsMetastoreConfiguration(
            TestBdsMetastoreConfigurationRequest request) {

        Validate.notBlank(request.getBdsInstanceId(), "bdsInstanceId must not be blank");

        Validate.notBlank(request.getMetastoreConfigId(), "metastoreConfigId must not be blank");
        Objects.requireNonNull(
                request.getTestBdsMetastoreConfigurationDetails(),
                "testBdsMetastoreConfigurationDetails is required");

        return clientCall(request, TestBdsMetastoreConfigurationResponse::builder)
                .logger(LOG, "testBdsMetastoreConfiguration")
                .serviceDetails(
                        "Bds",
                        "TestBdsMetastoreConfiguration",
                        "https://docs.oracle.com/iaas/api/#/en/bigdata/20190531/BdsMetastoreConfiguration/TestBdsMetastoreConfiguration")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(TestBdsMetastoreConfigurationRequest::builder)
                .basePath("/20190531")
                .appendPathParam("bdsInstances")
                .appendPathParam(request.getBdsInstanceId())
                .appendPathParam("metastoreConfigs")
                .appendPathParam(request.getMetastoreConfigId())
                .appendPathParam("actions")
                .appendPathParam("test")
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("if-match", request.getIfMatch())
                .hasBody()
                .handleResponseHeaderString(
                        "opc-request-id",
                        TestBdsMetastoreConfigurationResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        TestBdsMetastoreConfigurationResponse.Builder::opcWorkRequestId)
                .callSync();
    }

    @Override
    public TestBdsObjectStorageConnectionResponse testBdsObjectStorageConnection(
            TestBdsObjectStorageConnectionRequest request) {

        Validate.notBlank(request.getBdsInstanceId(), "bdsInstanceId must not be blank");

        Validate.notBlank(request.getApiKeyId(), "apiKeyId must not be blank");
        Objects.requireNonNull(
                request.getTestBdsObjectStorageConnectionDetails(),
                "testBdsObjectStorageConnectionDetails is required");

        return clientCall(request, TestBdsObjectStorageConnectionResponse::builder)
                .logger(LOG, "testBdsObjectStorageConnection")
                .serviceDetails(
                        "Bds",
                        "TestBdsObjectStorageConnection",
                        "https://docs.oracle.com/iaas/api/#/en/bigdata/20190531/BdsApiKey/TestBdsObjectStorageConnection")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(TestBdsObjectStorageConnectionRequest::builder)
                .basePath("/20190531")
                .appendPathParam("bdsInstances")
                .appendPathParam(request.getBdsInstanceId())
                .appendPathParam("apiKeys")
                .appendPathParam(request.getApiKeyId())
                .appendPathParam("actions")
                .appendPathParam("testObjectStorageConnection")
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .hasBody()
                .handleResponseHeaderString(
                        "opc-request-id",
                        TestBdsObjectStorageConnectionResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        TestBdsObjectStorageConnectionResponse.Builder::opcWorkRequestId)
                .callSync();
    }

    @Override
    public UpdateAutoScalingConfigurationResponse updateAutoScalingConfiguration(
            UpdateAutoScalingConfigurationRequest request) {

        Validate.notBlank(request.getBdsInstanceId(), "bdsInstanceId must not be blank");

        Validate.notBlank(
                request.getAutoScalingConfigurationId(),
                "autoScalingConfigurationId must not be blank");
        Objects.requireNonNull(
                request.getUpdateAutoScalingConfigurationDetails(),
                "updateAutoScalingConfigurationDetails is required");

        return clientCall(request, UpdateAutoScalingConfigurationResponse::builder)
                .logger(LOG, "updateAutoScalingConfiguration")
                .serviceDetails(
                        "Bds",
                        "UpdateAutoScalingConfiguration",
                        "https://docs.oracle.com/iaas/api/#/en/bigdata/20190531/BdsInstance/UpdateAutoScalingConfiguration")
                .method(com.oracle.bmc.http.client.Method.PUT)
                .requestBuilder(UpdateAutoScalingConfigurationRequest::builder)
                .basePath("/20190531")
                .appendPathParam("bdsInstances")
                .appendPathParam(request.getBdsInstanceId())
                .appendPathParam("autoScalingConfiguration")
                .appendPathParam(request.getAutoScalingConfigurationId())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .hasBody()
                .handleResponseHeaderString(
                        "opc-request-id",
                        UpdateAutoScalingConfigurationResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        UpdateAutoScalingConfigurationResponse.Builder::opcWorkRequestId)
                .callSync();
    }

    @Override
    public UpdateBdsInstanceResponse updateBdsInstance(UpdateBdsInstanceRequest request) {

        Validate.notBlank(request.getBdsInstanceId(), "bdsInstanceId must not be blank");
        Objects.requireNonNull(
                request.getUpdateBdsInstanceDetails(), "updateBdsInstanceDetails is required");

        return clientCall(request, UpdateBdsInstanceResponse::builder)
                .logger(LOG, "updateBdsInstance")
                .serviceDetails(
                        "Bds",
                        "UpdateBdsInstance",
                        "https://docs.oracle.com/iaas/api/#/en/bigdata/20190531/BdsInstance/UpdateBdsInstance")
                .method(com.oracle.bmc.http.client.Method.PUT)
                .requestBuilder(UpdateBdsInstanceRequest::builder)
                .basePath("/20190531")
                .appendPathParam("bdsInstances")
                .appendPathParam(request.getBdsInstanceId())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .hasBody()
                .handleResponseHeaderString(
                        "opc-work-request-id", UpdateBdsInstanceResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", UpdateBdsInstanceResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public UpdateBdsMetastoreConfigurationResponse updateBdsMetastoreConfiguration(
            UpdateBdsMetastoreConfigurationRequest request) {

        Validate.notBlank(request.getBdsInstanceId(), "bdsInstanceId must not be blank");

        Validate.notBlank(request.getMetastoreConfigId(), "metastoreConfigId must not be blank");
        Objects.requireNonNull(
                request.getUpdateBdsMetastoreConfigurationDetails(),
                "updateBdsMetastoreConfigurationDetails is required");

        return clientCall(request, UpdateBdsMetastoreConfigurationResponse::builder)
                .logger(LOG, "updateBdsMetastoreConfiguration")
                .serviceDetails(
                        "Bds",
                        "UpdateBdsMetastoreConfiguration",
                        "https://docs.oracle.com/iaas/api/#/en/bigdata/20190531/BdsMetastoreConfiguration/UpdateBdsMetastoreConfiguration")
                .method(com.oracle.bmc.http.client.Method.PUT)
                .requestBuilder(UpdateBdsMetastoreConfigurationRequest::builder)
                .basePath("/20190531")
                .appendPathParam("bdsInstances")
                .appendPathParam(request.getBdsInstanceId())
                .appendPathParam("metastoreConfigs")
                .appendPathParam(request.getMetastoreConfigId())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("if-match", request.getIfMatch())
                .hasBody()
                .handleResponseHeaderString(
                        "opc-request-id",
                        UpdateBdsMetastoreConfigurationResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        UpdateBdsMetastoreConfigurationResponse.Builder::opcWorkRequestId)
                .callSync();
    }

    @Override
    public BdsWaiters getWaiters() {
        return waiters;
    }

    @Override
    public BdsPaginators getPaginators() {
        return paginators;
    }

    /**
     * Create a new client instance.
     *
     * @param authenticationDetailsProvider The authentication details (see {@link Builder#build})
     * @deprecated Use the {@link #builder() builder} instead.
     */
    @Deprecated
    public BdsClient(
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
    public BdsClient(
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
    public BdsClient(
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
    public BdsClient(
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
    public BdsClient(
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
    public BdsClient(
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
    public BdsClient(
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
    public BdsClient(
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
