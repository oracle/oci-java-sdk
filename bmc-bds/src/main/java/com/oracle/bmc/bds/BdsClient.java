/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
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
    public ActivateIamUserSyncConfigurationResponse activateIamUserSyncConfiguration(
            ActivateIamUserSyncConfigurationRequest request) {

        Validate.notBlank(request.getBdsInstanceId(), "bdsInstanceId must not be blank");

        Validate.notBlank(
                request.getIdentityConfigurationId(), "identityConfigurationId must not be blank");
        Objects.requireNonNull(
                request.getActivateIamUserSyncConfigurationDetails(),
                "activateIamUserSyncConfigurationDetails is required");

        return clientCall(request, ActivateIamUserSyncConfigurationResponse::builder)
                .logger(LOG, "activateIamUserSyncConfiguration")
                .serviceDetails(
                        "Bds",
                        "ActivateIamUserSyncConfiguration",
                        "https://docs.oracle.com/iaas/api/#/en/bigdata/20190531/IdentityConfiguration/ActivateIamUserSyncConfiguration")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(ActivateIamUserSyncConfigurationRequest::builder)
                .basePath("/20190531")
                .appendPathParam("bdsInstances")
                .appendPathParam(request.getBdsInstanceId())
                .appendPathParam("identityConfigurations")
                .appendPathParam(request.getIdentityConfigurationId())
                .appendPathParam("actions")
                .appendPathParam("activateIamUserSyncConfiguration")
                .accept("application/json")
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .hasBody()
                .handleResponseHeaderString(
                        "opc-request-id",
                        ActivateIamUserSyncConfigurationResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        ActivateIamUserSyncConfigurationResponse.Builder::opcWorkRequestId)
                .callSync();
    }

    @Override
    public ActivateUpstConfigurationResponse activateUpstConfiguration(
            ActivateUpstConfigurationRequest request) {

        Validate.notBlank(request.getBdsInstanceId(), "bdsInstanceId must not be blank");

        Validate.notBlank(
                request.getIdentityConfigurationId(), "identityConfigurationId must not be blank");
        Objects.requireNonNull(
                request.getActivateUpstConfigurationDetails(),
                "activateUpstConfigurationDetails is required");

        return clientCall(request, ActivateUpstConfigurationResponse::builder)
                .logger(LOG, "activateUpstConfiguration")
                .serviceDetails(
                        "Bds",
                        "ActivateUpstConfiguration",
                        "https://docs.oracle.com/iaas/api/#/en/bigdata/20190531/IdentityConfiguration/ActivateUpstConfiguration")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(ActivateUpstConfigurationRequest::builder)
                .basePath("/20190531")
                .appendPathParam("bdsInstances")
                .appendPathParam(request.getBdsInstanceId())
                .appendPathParam("identityConfigurations")
                .appendPathParam(request.getIdentityConfigurationId())
                .appendPathParam("actions")
                .appendPathParam("activateUpstConfiguration")
                .accept("application/json")
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .hasBody()
                .handleResponseHeaderString(
                        "opc-request-id", ActivateUpstConfigurationResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        ActivateUpstConfigurationResponse.Builder::opcWorkRequestId)
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
    public BackupNodeResponse backupNode(BackupNodeRequest request) {

        Validate.notBlank(request.getBdsInstanceId(), "bdsInstanceId must not be blank");
        Objects.requireNonNull(request.getBackupNodeDetails(), "backupNodeDetails is required");

        return clientCall(request, BackupNodeResponse::builder)
                .logger(LOG, "backupNode")
                .serviceDetails(
                        "Bds",
                        "BackupNode",
                        "https://docs.oracle.com/iaas/api/#/en/bigdata/20190531/BdsInstance/BackupNode")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(BackupNodeRequest::builder)
                .basePath("/20190531")
                .appendPathParam("bdsInstances")
                .appendPathParam(request.getBdsInstanceId())
                .appendPathParam("actions")
                .appendPathParam("backupNodes")
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .hasBody()
                .handleResponseHeaderString(
                        "opc-request-id", BackupNodeResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-work-request-id", BackupNodeResponse.Builder::opcWorkRequestId)
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
    public CreateBdsCapacityReportResponse createBdsCapacityReport(
            CreateBdsCapacityReportRequest request) {
        Objects.requireNonNull(
                request.getCreateBdsCapacityReportDetails(),
                "createBdsCapacityReportDetails is required");

        return clientCall(request, CreateBdsCapacityReportResponse::builder)
                .logger(LOG, "createBdsCapacityReport")
                .serviceDetails(
                        "Bds",
                        "CreateBdsCapacityReport",
                        "https://docs.oracle.com/iaas/api/#/en/bigdata/20190531/BdsCapacityReport/CreateBdsCapacityReport")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(CreateBdsCapacityReportRequest::builder)
                .basePath("/20190531")
                .appendPathParam("bdsCapacityReports")
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.bds.model.BdsCapacityReport.class,
                        CreateBdsCapacityReportResponse.Builder::bdsCapacityReport)
                .handleResponseHeaderString(
                        "opc-request-id", CreateBdsCapacityReportResponse.Builder::opcRequestId)
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
    public CreateIdentityConfigurationResponse createIdentityConfiguration(
            CreateIdentityConfigurationRequest request) {

        Validate.notBlank(request.getBdsInstanceId(), "bdsInstanceId must not be blank");
        Objects.requireNonNull(
                request.getCreateIdentityConfigurationDetails(),
                "createIdentityConfigurationDetails is required");

        return clientCall(request, CreateIdentityConfigurationResponse::builder)
                .logger(LOG, "createIdentityConfiguration")
                .serviceDetails(
                        "Bds",
                        "CreateIdentityConfiguration",
                        "https://docs.oracle.com/iaas/api/#/en/bigdata/20190531/IdentityConfiguration/CreateIdentityConfiguration")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(CreateIdentityConfigurationRequest::builder)
                .basePath("/20190531")
                .appendPathParam("bdsInstances")
                .appendPathParam(request.getBdsInstanceId())
                .appendPathParam("identityConfigurations")
                .accept("application/json")
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .hasBody()
                .handleResponseHeaderString(
                        "opc-request-id", CreateIdentityConfigurationResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        CreateIdentityConfigurationResponse.Builder::opcWorkRequestId)
                .callSync();
    }

    @Override
    public CreateNodeBackupConfigurationResponse createNodeBackupConfiguration(
            CreateNodeBackupConfigurationRequest request) {

        Validate.notBlank(request.getBdsInstanceId(), "bdsInstanceId must not be blank");
        Objects.requireNonNull(
                request.getCreateNodeBackupConfigurationDetails(),
                "createNodeBackupConfigurationDetails is required");

        return clientCall(request, CreateNodeBackupConfigurationResponse::builder)
                .logger(LOG, "createNodeBackupConfiguration")
                .serviceDetails(
                        "Bds",
                        "CreateNodeBackupConfiguration",
                        "https://docs.oracle.com/iaas/api/#/en/bigdata/20190531/BdsInstance/CreateNodeBackupConfiguration")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(CreateNodeBackupConfigurationRequest::builder)
                .basePath("/20190531")
                .appendPathParam("bdsInstances")
                .appendPathParam(request.getBdsInstanceId())
                .appendPathParam("nodeBackupConfigurations")
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .hasBody()
                .handleResponseHeaderString(
                        "opc-request-id",
                        CreateNodeBackupConfigurationResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        CreateNodeBackupConfigurationResponse.Builder::opcWorkRequestId)
                .callSync();
    }

    @Override
    public CreateNodeReplaceConfigurationResponse createNodeReplaceConfiguration(
            CreateNodeReplaceConfigurationRequest request) {

        Validate.notBlank(request.getBdsInstanceId(), "bdsInstanceId must not be blank");
        Objects.requireNonNull(
                request.getCreateNodeReplaceConfigurationDetails(),
                "createNodeReplaceConfigurationDetails is required");

        return clientCall(request, CreateNodeReplaceConfigurationResponse::builder)
                .logger(LOG, "createNodeReplaceConfiguration")
                .serviceDetails(
                        "Bds",
                        "CreateNodeReplaceConfiguration",
                        "https://docs.oracle.com/iaas/api/#/en/bigdata/20190531/BdsInstance/CreateNodeReplaceConfiguration")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(CreateNodeReplaceConfigurationRequest::builder)
                .basePath("/20190531")
                .appendPathParam("bdsInstances")
                .appendPathParam(request.getBdsInstanceId())
                .appendPathParam("nodeReplaceConfigurations")
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .hasBody()
                .handleResponseHeaderString(
                        "opc-request-id",
                        CreateNodeReplaceConfigurationResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        CreateNodeReplaceConfigurationResponse.Builder::opcWorkRequestId)
                .callSync();
    }

    @Override
    public CreateResourcePrincipalConfigurationResponse createResourcePrincipalConfiguration(
            CreateResourcePrincipalConfigurationRequest request) {

        Validate.notBlank(request.getBdsInstanceId(), "bdsInstanceId must not be blank");
        Objects.requireNonNull(
                request.getCreateResourcePrincipalConfigurationDetails(),
                "createResourcePrincipalConfigurationDetails is required");

        return clientCall(request, CreateResourcePrincipalConfigurationResponse::builder)
                .logger(LOG, "createResourcePrincipalConfiguration")
                .serviceDetails(
                        "Bds",
                        "CreateResourcePrincipalConfiguration",
                        "https://docs.oracle.com/iaas/api/#/en/bigdata/20190531/BdsInstance/CreateResourcePrincipalConfiguration")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(CreateResourcePrincipalConfigurationRequest::builder)
                .basePath("/20190531")
                .appendPathParam("bdsInstances")
                .appendPathParam(request.getBdsInstanceId())
                .appendPathParam("resourcePrincipalConfigurations")
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .hasBody()
                .handleResponseHeaderString(
                        "opc-request-id",
                        CreateResourcePrincipalConfigurationResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        CreateResourcePrincipalConfigurationResponse.Builder::opcWorkRequestId)
                .callSync();
    }

    @Override
    public DeactivateIamUserSyncConfigurationResponse deactivateIamUserSyncConfiguration(
            DeactivateIamUserSyncConfigurationRequest request) {

        Validate.notBlank(request.getBdsInstanceId(), "bdsInstanceId must not be blank");

        Validate.notBlank(
                request.getIdentityConfigurationId(), "identityConfigurationId must not be blank");
        Objects.requireNonNull(
                request.getDeactivateIamUserSyncConfigurationDetails(),
                "deactivateIamUserSyncConfigurationDetails is required");

        return clientCall(request, DeactivateIamUserSyncConfigurationResponse::builder)
                .logger(LOG, "deactivateIamUserSyncConfiguration")
                .serviceDetails(
                        "Bds",
                        "DeactivateIamUserSyncConfiguration",
                        "https://docs.oracle.com/iaas/api/#/en/bigdata/20190531/IdentityConfiguration/DeactivateIamUserSyncConfiguration")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(DeactivateIamUserSyncConfigurationRequest::builder)
                .basePath("/20190531")
                .appendPathParam("bdsInstances")
                .appendPathParam(request.getBdsInstanceId())
                .appendPathParam("identityConfigurations")
                .appendPathParam(request.getIdentityConfigurationId())
                .appendPathParam("actions")
                .appendPathParam("deactivateIamUserSyncConfiguration")
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .hasBody()
                .handleResponseHeaderString(
                        "opc-request-id",
                        DeactivateIamUserSyncConfigurationResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        DeactivateIamUserSyncConfigurationResponse.Builder::opcWorkRequestId)
                .callSync();
    }

    @Override
    public DeactivateUpstConfigurationResponse deactivateUpstConfiguration(
            DeactivateUpstConfigurationRequest request) {

        Validate.notBlank(request.getBdsInstanceId(), "bdsInstanceId must not be blank");

        Validate.notBlank(
                request.getIdentityConfigurationId(), "identityConfigurationId must not be blank");
        Objects.requireNonNull(
                request.getDeactivateUpstConfigurationDetails(),
                "deactivateUpstConfigurationDetails is required");

        return clientCall(request, DeactivateUpstConfigurationResponse::builder)
                .logger(LOG, "deactivateUpstConfiguration")
                .serviceDetails(
                        "Bds",
                        "DeactivateUpstConfiguration",
                        "https://docs.oracle.com/iaas/api/#/en/bigdata/20190531/IdentityConfiguration/DeactivateUpstConfiguration")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(DeactivateUpstConfigurationRequest::builder)
                .basePath("/20190531")
                .appendPathParam("bdsInstances")
                .appendPathParam(request.getBdsInstanceId())
                .appendPathParam("identityConfigurations")
                .appendPathParam(request.getIdentityConfigurationId())
                .appendPathParam("actions")
                .appendPathParam("deactivateUpstConfiguration")
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("if-match", request.getIfMatch())
                .hasBody()
                .handleResponseHeaderString(
                        "opc-request-id", DeactivateUpstConfigurationResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        DeactivateUpstConfigurationResponse.Builder::opcWorkRequestId)
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
    public DeleteIdentityConfigurationResponse deleteIdentityConfiguration(
            DeleteIdentityConfigurationRequest request) {

        Validate.notBlank(request.getBdsInstanceId(), "bdsInstanceId must not be blank");

        Validate.notBlank(
                request.getIdentityConfigurationId(), "identityConfigurationId must not be blank");

        return clientCall(request, DeleteIdentityConfigurationResponse::builder)
                .logger(LOG, "deleteIdentityConfiguration")
                .serviceDetails(
                        "Bds",
                        "DeleteIdentityConfiguration",
                        "https://docs.oracle.com/iaas/api/#/en/bigdata/20190531/IdentityConfiguration/DeleteIdentityConfiguration")
                .method(com.oracle.bmc.http.client.Method.DELETE)
                .requestBuilder(DeleteIdentityConfigurationRequest::builder)
                .basePath("/20190531")
                .appendPathParam("bdsInstances")
                .appendPathParam(request.getBdsInstanceId())
                .appendPathParam("identityConfigurations")
                .appendPathParam(request.getIdentityConfigurationId())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("if-match", request.getIfMatch())
                .handleResponseHeaderString(
                        "opc-request-id", DeleteIdentityConfigurationResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        DeleteIdentityConfigurationResponse.Builder::opcWorkRequestId)
                .callSync();
    }

    @Override
    public DeleteNodeBackupResponse deleteNodeBackup(DeleteNodeBackupRequest request) {

        Validate.notBlank(request.getBdsInstanceId(), "bdsInstanceId must not be blank");

        Validate.notBlank(request.getNodeBackupId(), "nodeBackupId must not be blank");

        return clientCall(request, DeleteNodeBackupResponse::builder)
                .logger(LOG, "deleteNodeBackup")
                .serviceDetails(
                        "Bds",
                        "DeleteNodeBackup",
                        "https://docs.oracle.com/iaas/api/#/en/bigdata/20190531/NodeBackup/DeleteNodeBackup")
                .method(com.oracle.bmc.http.client.Method.DELETE)
                .requestBuilder(DeleteNodeBackupRequest::builder)
                .basePath("/20190531")
                .appendPathParam("bdsInstances")
                .appendPathParam(request.getBdsInstanceId())
                .appendPathParam("nodeBackups")
                .appendPathParam(request.getNodeBackupId())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("if-match", request.getIfMatch())
                .handleResponseHeaderString(
                        "opc-request-id", DeleteNodeBackupResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-work-request-id", DeleteNodeBackupResponse.Builder::opcWorkRequestId)
                .callSync();
    }

    @Override
    public DeleteNodeBackupConfigurationResponse deleteNodeBackupConfiguration(
            DeleteNodeBackupConfigurationRequest request) {

        Validate.notBlank(request.getBdsInstanceId(), "bdsInstanceId must not be blank");

        Validate.notBlank(
                request.getNodeBackupConfigurationId(),
                "nodeBackupConfigurationId must not be blank");

        return clientCall(request, DeleteNodeBackupConfigurationResponse::builder)
                .logger(LOG, "deleteNodeBackupConfiguration")
                .serviceDetails(
                        "Bds",
                        "DeleteNodeBackupConfiguration",
                        "https://docs.oracle.com/iaas/api/#/en/bigdata/20190531/NodeBackupConfiguration/DeleteNodeBackupConfiguration")
                .method(com.oracle.bmc.http.client.Method.DELETE)
                .requestBuilder(DeleteNodeBackupConfigurationRequest::builder)
                .basePath("/20190531")
                .appendPathParam("bdsInstances")
                .appendPathParam(request.getBdsInstanceId())
                .appendPathParam("nodeBackupConfigurations")
                .appendPathParam(request.getNodeBackupConfigurationId())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("if-match", request.getIfMatch())
                .handleResponseHeaderString(
                        "opc-request-id",
                        DeleteNodeBackupConfigurationResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        DeleteNodeBackupConfigurationResponse.Builder::opcWorkRequestId)
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
    public ForceRefreshResourcePrincipalResponse forceRefreshResourcePrincipal(
            ForceRefreshResourcePrincipalRequest request) {

        Validate.notBlank(request.getBdsInstanceId(), "bdsInstanceId must not be blank");

        Validate.notBlank(
                request.getResourcePrincipalConfigurationId(),
                "resourcePrincipalConfigurationId must not be blank");
        Objects.requireNonNull(
                request.getForceRefreshResourcePrincipalDetails(),
                "forceRefreshResourcePrincipalDetails is required");

        return clientCall(request, ForceRefreshResourcePrincipalResponse::builder)
                .logger(LOG, "forceRefreshResourcePrincipal")
                .serviceDetails(
                        "Bds",
                        "ForceRefreshResourcePrincipal",
                        "https://docs.oracle.com/iaas/api/#/en/bigdata/20190531/BdsInstance/ForceRefreshResourcePrincipal")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(ForceRefreshResourcePrincipalRequest::builder)
                .basePath("/20190531")
                .appendPathParam("bdsInstances")
                .appendPathParam(request.getBdsInstanceId())
                .appendPathParam("resourcePrincipalConfigurations")
                .appendPathParam(request.getResourcePrincipalConfigurationId())
                .appendPathParam("actions")
                .appendPathParam("forceRefreshResourcePrincipal")
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .hasBody()
                .handleResponseHeaderString(
                        "opc-request-id",
                        ForceRefreshResourcePrincipalResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        ForceRefreshResourcePrincipalResponse.Builder::opcWorkRequestId)
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
    public GetIdentityConfigurationResponse getIdentityConfiguration(
            GetIdentityConfigurationRequest request) {

        Validate.notBlank(request.getBdsInstanceId(), "bdsInstanceId must not be blank");

        Validate.notBlank(
                request.getIdentityConfigurationId(), "identityConfigurationId must not be blank");

        return clientCall(request, GetIdentityConfigurationResponse::builder)
                .logger(LOG, "getIdentityConfiguration")
                .serviceDetails(
                        "Bds",
                        "GetIdentityConfiguration",
                        "https://docs.oracle.com/iaas/api/#/en/bigdata/20190531/IdentityConfiguration/GetIdentityConfiguration")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetIdentityConfigurationRequest::builder)
                .basePath("/20190531")
                .appendPathParam("bdsInstances")
                .appendPathParam(request.getBdsInstanceId())
                .appendPathParam("identityConfigurations")
                .appendPathParam(request.getIdentityConfigurationId())
                .appendQueryParam("page", request.getPage())
                .appendQueryParam("limit", request.getLimit())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.bds.model.IdentityConfiguration.class,
                        GetIdentityConfigurationResponse.Builder::identityConfiguration)
                .handleResponseHeaderString(
                        "opc-request-id", GetIdentityConfigurationResponse.Builder::opcRequestId)
                .handleResponseHeaderString("etag", GetIdentityConfigurationResponse.Builder::etag)
                .callSync();
    }

    @Override
    public GetNodeBackupResponse getNodeBackup(GetNodeBackupRequest request) {

        Validate.notBlank(request.getBdsInstanceId(), "bdsInstanceId must not be blank");

        Validate.notBlank(request.getNodeBackupId(), "nodeBackupId must not be blank");

        return clientCall(request, GetNodeBackupResponse::builder)
                .logger(LOG, "getNodeBackup")
                .serviceDetails(
                        "Bds",
                        "GetNodeBackup",
                        "https://docs.oracle.com/iaas/api/#/en/bigdata/20190531/BdsInstance/GetNodeBackup")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetNodeBackupRequest::builder)
                .basePath("/20190531")
                .appendPathParam("bdsInstances")
                .appendPathParam(request.getBdsInstanceId())
                .appendPathParam("nodeBackups")
                .appendPathParam(request.getNodeBackupId())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.bds.model.NodeBackup.class,
                        GetNodeBackupResponse.Builder::nodeBackup)
                .handleResponseHeaderString(
                        "opc-request-id", GetNodeBackupResponse.Builder::opcRequestId)
                .handleResponseHeaderString("etag", GetNodeBackupResponse.Builder::etag)
                .callSync();
    }

    @Override
    public GetNodeBackupConfigurationResponse getNodeBackupConfiguration(
            GetNodeBackupConfigurationRequest request) {

        Validate.notBlank(request.getBdsInstanceId(), "bdsInstanceId must not be blank");

        Validate.notBlank(
                request.getNodeBackupConfigurationId(),
                "nodeBackupConfigurationId must not be blank");

        return clientCall(request, GetNodeBackupConfigurationResponse::builder)
                .logger(LOG, "getNodeBackupConfiguration")
                .serviceDetails(
                        "Bds",
                        "GetNodeBackupConfiguration",
                        "https://docs.oracle.com/iaas/api/#/en/bigdata/20190531/BdsInstance/GetNodeBackupConfiguration")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetNodeBackupConfigurationRequest::builder)
                .basePath("/20190531")
                .appendPathParam("bdsInstances")
                .appendPathParam(request.getBdsInstanceId())
                .appendPathParam("nodeBackupConfigurations")
                .appendPathParam(request.getNodeBackupConfigurationId())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.bds.model.NodeBackupConfiguration.class,
                        GetNodeBackupConfigurationResponse.Builder::nodeBackupConfiguration)
                .handleResponseHeaderString(
                        "opc-request-id", GetNodeBackupConfigurationResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "etag", GetNodeBackupConfigurationResponse.Builder::etag)
                .callSync();
    }

    @Override
    public GetNodeReplaceConfigurationResponse getNodeReplaceConfiguration(
            GetNodeReplaceConfigurationRequest request) {

        Validate.notBlank(request.getBdsInstanceId(), "bdsInstanceId must not be blank");

        Validate.notBlank(
                request.getNodeReplaceConfigurationId(),
                "nodeReplaceConfigurationId must not be blank");

        return clientCall(request, GetNodeReplaceConfigurationResponse::builder)
                .logger(LOG, "getNodeReplaceConfiguration")
                .serviceDetails(
                        "Bds",
                        "GetNodeReplaceConfiguration",
                        "https://docs.oracle.com/iaas/api/#/en/bigdata/20190531/BdsInstance/GetNodeReplaceConfiguration")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetNodeReplaceConfigurationRequest::builder)
                .basePath("/20190531")
                .appendPathParam("bdsInstances")
                .appendPathParam(request.getBdsInstanceId())
                .appendPathParam("nodeReplaceConfigurations")
                .appendPathParam(request.getNodeReplaceConfigurationId())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.bds.model.NodeReplaceConfiguration.class,
                        GetNodeReplaceConfigurationResponse.Builder::nodeReplaceConfiguration)
                .handleResponseHeaderString(
                        "opc-request-id", GetNodeReplaceConfigurationResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "etag", GetNodeReplaceConfigurationResponse.Builder::etag)
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
    public GetResourcePrincipalConfigurationResponse getResourcePrincipalConfiguration(
            GetResourcePrincipalConfigurationRequest request) {

        Validate.notBlank(request.getBdsInstanceId(), "bdsInstanceId must not be blank");

        Validate.notBlank(
                request.getResourcePrincipalConfigurationId(),
                "resourcePrincipalConfigurationId must not be blank");

        return clientCall(request, GetResourcePrincipalConfigurationResponse::builder)
                .logger(LOG, "getResourcePrincipalConfiguration")
                .serviceDetails(
                        "Bds",
                        "GetResourcePrincipalConfiguration",
                        "https://docs.oracle.com/iaas/api/#/en/bigdata/20190531/BdsInstance/GetResourcePrincipalConfiguration")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetResourcePrincipalConfigurationRequest::builder)
                .basePath("/20190531")
                .appendPathParam("bdsInstances")
                .appendPathParam(request.getBdsInstanceId())
                .appendPathParam("resourcePrincipalConfigurations")
                .appendPathParam(request.getResourcePrincipalConfigurationId())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.bds.model.ResourcePrincipalConfiguration.class,
                        GetResourcePrincipalConfigurationResponse.Builder
                                ::resourcePrincipalConfiguration)
                .handleResponseHeaderString(
                        "opc-request-id",
                        GetResourcePrincipalConfigurationResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "etag", GetResourcePrincipalConfigurationResponse.Builder::etag)
                .callSync();
    }

    @Override
    public GetSoftwareUpdateResponse getSoftwareUpdate(GetSoftwareUpdateRequest request) {

        Validate.notBlank(request.getBdsInstanceId(), "bdsInstanceId must not be blank");

        Validate.notBlank(request.getSoftwareUpdateKey(), "softwareUpdateKey must not be blank");

        return clientCall(request, GetSoftwareUpdateResponse::builder)
                .logger(LOG, "getSoftwareUpdate")
                .serviceDetails(
                        "Bds",
                        "GetSoftwareUpdate",
                        "https://docs.oracle.com/iaas/api/#/en/bigdata/20190531/BdsInstance/GetSoftwareUpdate")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetSoftwareUpdateRequest::builder)
                .basePath("/20190531")
                .appendPathParam("bdsInstances")
                .appendPathParam(request.getBdsInstanceId())
                .appendPathParam("softwareUpdates")
                .appendPathParam(request.getSoftwareUpdateKey())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .handleBody(
                        com.oracle.bmc.bds.model.SoftwareUpdate.class,
                        GetSoftwareUpdateResponse.Builder::softwareUpdate)
                .handleResponseHeaderString(
                        "opc-request-id", GetSoftwareUpdateResponse.Builder::opcRequestId)
                .handleResponseHeaderString("etag", GetSoftwareUpdateResponse.Builder::etag)
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
    public InstallSoftwareUpdatesResponse installSoftwareUpdates(
            InstallSoftwareUpdatesRequest request) {

        Validate.notBlank(request.getBdsInstanceId(), "bdsInstanceId must not be blank");
        Objects.requireNonNull(
                request.getInstallSoftwareUpdatesDetails(),
                "installSoftwareUpdatesDetails is required");

        return clientCall(request, InstallSoftwareUpdatesResponse::builder)
                .logger(LOG, "installSoftwareUpdates")
                .serviceDetails(
                        "Bds",
                        "InstallSoftwareUpdates",
                        "https://docs.oracle.com/iaas/api/#/en/bigdata/20190531/BdsInstance/InstallSoftwareUpdates")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(InstallSoftwareUpdatesRequest::builder)
                .basePath("/20190531")
                .appendPathParam("bdsInstances")
                .appendPathParam(request.getBdsInstanceId())
                .appendPathParam("actions")
                .appendPathParam("installSoftwareUpdates")
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .hasBody()
                .handleResponseHeaderString(
                        "opc-request-id", InstallSoftwareUpdatesResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        InstallSoftwareUpdatesResponse.Builder::opcWorkRequestId)
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
    public ListBdsClusterVersionsResponse listBdsClusterVersions(
            ListBdsClusterVersionsRequest request) {

        return clientCall(request, ListBdsClusterVersionsResponse::builder)
                .logger(LOG, "listBdsClusterVersions")
                .serviceDetails(
                        "Bds",
                        "ListBdsClusterVersions",
                        "https://docs.oracle.com/iaas/api/#/en/bigdata/20190531/BdsClusterVersionSummary/ListBdsClusterVersions")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListBdsClusterVersionsRequest::builder)
                .basePath("/20190531")
                .appendPathParam("bdsClusterVersions")
                .appendQueryParam("page", request.getPage())
                .appendQueryParam("limit", request.getLimit())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBodyList(
                        com.oracle.bmc.bds.model.BdsClusterVersionSummary.class,
                        ListBdsClusterVersionsResponse.Builder::items)
                .handleResponseHeaderString(
                        "opc-request-id", ListBdsClusterVersionsResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListBdsClusterVersionsResponse.Builder::opcNextPage)
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
    public ListIdentityConfigurationsResponse listIdentityConfigurations(
            ListIdentityConfigurationsRequest request) {

        Validate.notBlank(request.getBdsInstanceId(), "bdsInstanceId must not be blank");
        Objects.requireNonNull(request.getCompartmentId(), "compartmentId is required");

        return clientCall(request, ListIdentityConfigurationsResponse::builder)
                .logger(LOG, "listIdentityConfigurations")
                .serviceDetails(
                        "Bds",
                        "ListIdentityConfigurations",
                        "https://docs.oracle.com/iaas/api/#/en/bigdata/20190531/IdentityConfiguration/ListIdentityConfigurations")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListIdentityConfigurationsRequest::builder)
                .basePath("/20190531")
                .appendPathParam("bdsInstances")
                .appendPathParam(request.getBdsInstanceId())
                .appendPathParam("identityConfigurations")
                .appendQueryParam("page", request.getPage())
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("compartmentId", request.getCompartmentId())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .appendEnumQueryParam("lifecycleState", request.getLifecycleState())
                .appendQueryParam("displayName", request.getDisplayName())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBodyList(
                        com.oracle.bmc.bds.model.IdentityConfigurationSummary.class,
                        ListIdentityConfigurationsResponse.Builder::items)
                .handleResponseHeaderString(
                        "opc-request-id", ListIdentityConfigurationsResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListIdentityConfigurationsResponse.Builder::opcNextPage)
                .callSync();
    }

    @Override
    public ListNodeBackupConfigurationsResponse listNodeBackupConfigurations(
            ListNodeBackupConfigurationsRequest request) {

        Validate.notBlank(request.getBdsInstanceId(), "bdsInstanceId must not be blank");

        return clientCall(request, ListNodeBackupConfigurationsResponse::builder)
                .logger(LOG, "listNodeBackupConfigurations")
                .serviceDetails(
                        "Bds",
                        "ListNodeBackupConfigurations",
                        "https://docs.oracle.com/iaas/api/#/en/bigdata/20190531/BdsInstance/ListNodeBackupConfigurations")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListNodeBackupConfigurationsRequest::builder)
                .basePath("/20190531")
                .appendPathParam("bdsInstances")
                .appendPathParam(request.getBdsInstanceId())
                .appendPathParam("nodeBackupConfigurations")
                .appendQueryParam("page", request.getPage())
                .appendQueryParam("limit", request.getLimit())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .appendQueryParam("displayName", request.getDisplayName())
                .appendEnumQueryParam("lifecycleState", request.getLifecycleState())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBodyList(
                        com.oracle.bmc.bds.model.NodeBackupConfigurationSummary.class,
                        ListNodeBackupConfigurationsResponse.Builder::items)
                .handleResponseHeaderString(
                        "opc-request-id",
                        ListNodeBackupConfigurationsResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListNodeBackupConfigurationsResponse.Builder::opcNextPage)
                .callSync();
    }

    @Override
    public ListNodeBackupsResponse listNodeBackups(ListNodeBackupsRequest request) {

        Validate.notBlank(request.getBdsInstanceId(), "bdsInstanceId must not be blank");

        return clientCall(request, ListNodeBackupsResponse::builder)
                .logger(LOG, "listNodeBackups")
                .serviceDetails(
                        "Bds",
                        "ListNodeBackups",
                        "https://docs.oracle.com/iaas/api/#/en/bigdata/20190531/BdsInstance/ListNodeBackups")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListNodeBackupsRequest::builder)
                .basePath("/20190531")
                .appendPathParam("bdsInstances")
                .appendPathParam(request.getBdsInstanceId())
                .appendPathParam("nodeBackups")
                .appendQueryParam("page", request.getPage())
                .appendQueryParam("limit", request.getLimit())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .appendQueryParam("nodeHostName", request.getNodeHostName())
                .appendEnumQueryParam("lifecycleState", request.getLifecycleState())
                .appendQueryParam("displayName", request.getDisplayName())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBodyList(
                        com.oracle.bmc.bds.model.NodeBackupSummary.class,
                        ListNodeBackupsResponse.Builder::items)
                .handleResponseHeaderString(
                        "opc-request-id", ListNodeBackupsResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListNodeBackupsResponse.Builder::opcNextPage)
                .callSync();
    }

    @Override
    public ListNodeReplaceConfigurationsResponse listNodeReplaceConfigurations(
            ListNodeReplaceConfigurationsRequest request) {

        Validate.notBlank(request.getBdsInstanceId(), "bdsInstanceId must not be blank");

        return clientCall(request, ListNodeReplaceConfigurationsResponse::builder)
                .logger(LOG, "listNodeReplaceConfigurations")
                .serviceDetails(
                        "Bds",
                        "ListNodeReplaceConfigurations",
                        "https://docs.oracle.com/iaas/api/#/en/bigdata/20190531/BdsInstance/ListNodeReplaceConfigurations")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListNodeReplaceConfigurationsRequest::builder)
                .basePath("/20190531")
                .appendPathParam("bdsInstances")
                .appendPathParam(request.getBdsInstanceId())
                .appendPathParam("nodeReplaceConfigurations")
                .appendQueryParam("page", request.getPage())
                .appendQueryParam("limit", request.getLimit())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .appendQueryParam("displayName", request.getDisplayName())
                .appendEnumQueryParam("lifecycleState", request.getLifecycleState())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBodyList(
                        com.oracle.bmc.bds.model.NodeReplaceConfigurationSummary.class,
                        ListNodeReplaceConfigurationsResponse.Builder::items)
                .handleResponseHeaderString(
                        "opc-request-id",
                        ListNodeReplaceConfigurationsResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListNodeReplaceConfigurationsResponse.Builder::opcNextPage)
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
                .appendQueryParam("patchVersion", request.getPatchVersion())
                .appendEnumQueryParam("sortBy", request.getSortBy())
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
    public ListResourcePrincipalConfigurationsResponse listResourcePrincipalConfigurations(
            ListResourcePrincipalConfigurationsRequest request) {

        Validate.notBlank(request.getBdsInstanceId(), "bdsInstanceId must not be blank");

        return clientCall(request, ListResourcePrincipalConfigurationsResponse::builder)
                .logger(LOG, "listResourcePrincipalConfigurations")
                .serviceDetails(
                        "Bds",
                        "ListResourcePrincipalConfigurations",
                        "https://docs.oracle.com/iaas/api/#/en/bigdata/20190531/BdsInstance/ListResourcePrincipalConfigurations")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListResourcePrincipalConfigurationsRequest::builder)
                .basePath("/20190531")
                .appendPathParam("bdsInstances")
                .appendPathParam(request.getBdsInstanceId())
                .appendPathParam("resourcePrincipalConfigurations")
                .appendQueryParam("page", request.getPage())
                .appendQueryParam("limit", request.getLimit())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .appendQueryParam("displayName", request.getDisplayName())
                .appendEnumQueryParam("lifecycleState", request.getLifecycleState())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBodyList(
                        com.oracle.bmc.bds.model.ResourcePrincipalConfigurationSummary.class,
                        ListResourcePrincipalConfigurationsResponse.Builder::items)
                .handleResponseHeaderString(
                        "opc-request-id",
                        ListResourcePrincipalConfigurationsResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page",
                        ListResourcePrincipalConfigurationsResponse.Builder::opcNextPage)
                .callSync();
    }

    @Override
    public ListSoftwareUpdatesResponse listSoftwareUpdates(ListSoftwareUpdatesRequest request) {

        Validate.notBlank(request.getBdsInstanceId(), "bdsInstanceId must not be blank");

        return clientCall(request, ListSoftwareUpdatesResponse::builder)
                .logger(LOG, "listSoftwareUpdates")
                .serviceDetails(
                        "Bds",
                        "ListSoftwareUpdates",
                        "https://docs.oracle.com/iaas/api/#/en/bigdata/20190531/BdsInstance/ListSoftwareUpdates")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListSoftwareUpdatesRequest::builder)
                .basePath("/20190531")
                .appendPathParam("bdsInstances")
                .appendPathParam(request.getBdsInstanceId())
                .appendPathParam("softwareUpdates")
                .appendQueryParam("page", request.getPage())
                .appendQueryParam("limit", request.getLimit())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .handleBody(
                        com.oracle.bmc.bds.model.SoftwareUpdateCollection.class,
                        ListSoftwareUpdatesResponse.Builder::softwareUpdateCollection)
                .handleResponseHeaderString(
                        "opc-next-page", ListSoftwareUpdatesResponse.Builder::opcNextPage)
                .handleResponseHeaderString(
                        "opc-request-id", ListSoftwareUpdatesResponse.Builder::opcRequestId)
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
    public RefreshConfidentialApplicationResponse refreshConfidentialApplication(
            RefreshConfidentialApplicationRequest request) {

        Validate.notBlank(request.getBdsInstanceId(), "bdsInstanceId must not be blank");

        Validate.notBlank(
                request.getIdentityConfigurationId(), "identityConfigurationId must not be blank");
        Objects.requireNonNull(
                request.getRefreshConfidentialApplicationDetails(),
                "refreshConfidentialApplicationDetails is required");

        return clientCall(request, RefreshConfidentialApplicationResponse::builder)
                .logger(LOG, "refreshConfidentialApplication")
                .serviceDetails(
                        "Bds",
                        "RefreshConfidentialApplication",
                        "https://docs.oracle.com/iaas/api/#/en/bigdata/20190531/IdentityConfiguration/RefreshConfidentialApplication")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(RefreshConfidentialApplicationRequest::builder)
                .basePath("/20190531")
                .appendPathParam("bdsInstances")
                .appendPathParam(request.getBdsInstanceId())
                .appendPathParam("identityConfigurations")
                .appendPathParam(request.getIdentityConfigurationId())
                .appendPathParam("actions")
                .appendPathParam("refreshConfidentialApplication")
                .accept("application/json")
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .hasBody()
                .handleResponseHeaderString(
                        "opc-request-id",
                        RefreshConfidentialApplicationResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        RefreshConfidentialApplicationResponse.Builder::opcWorkRequestId)
                .callSync();
    }

    @Override
    public RefreshUpstTokenExchangeKeytabResponse refreshUpstTokenExchangeKeytab(
            RefreshUpstTokenExchangeKeytabRequest request) {

        Validate.notBlank(request.getBdsInstanceId(), "bdsInstanceId must not be blank");

        Validate.notBlank(
                request.getIdentityConfigurationId(), "identityConfigurationId must not be blank");
        Objects.requireNonNull(
                request.getRefreshUpstTokenExchangeKeytabDetails(),
                "refreshUpstTokenExchangeKeytabDetails is required");

        return clientCall(request, RefreshUpstTokenExchangeKeytabResponse::builder)
                .logger(LOG, "refreshUpstTokenExchangeKeytab")
                .serviceDetails(
                        "Bds",
                        "RefreshUpstTokenExchangeKeytab",
                        "https://docs.oracle.com/iaas/api/#/en/bigdata/20190531/IdentityConfiguration/RefreshUpstTokenExchangeKeytab")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(RefreshUpstTokenExchangeKeytabRequest::builder)
                .basePath("/20190531")
                .appendPathParam("bdsInstances")
                .appendPathParam(request.getBdsInstanceId())
                .appendPathParam("identityConfigurations")
                .appendPathParam(request.getIdentityConfigurationId())
                .appendPathParam("actions")
                .appendPathParam("refreshUpstTokenExchangeKeytab")
                .accept("application/json")
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("if-match", request.getIfMatch())
                .hasBody()
                .handleResponseHeaderString(
                        "opc-request-id",
                        RefreshUpstTokenExchangeKeytabResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        RefreshUpstTokenExchangeKeytabResponse.Builder::opcWorkRequestId)
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
    public RemoveNodeReplaceConfigurationResponse removeNodeReplaceConfiguration(
            RemoveNodeReplaceConfigurationRequest request) {

        Validate.notBlank(request.getBdsInstanceId(), "bdsInstanceId must not be blank");

        Validate.notBlank(
                request.getNodeReplaceConfigurationId(),
                "nodeReplaceConfigurationId must not be blank");
        Objects.requireNonNull(
                request.getRemoveNodeReplaceConfigurationDetails(),
                "removeNodeReplaceConfigurationDetails is required");

        return clientCall(request, RemoveNodeReplaceConfigurationResponse::builder)
                .logger(LOG, "removeNodeReplaceConfiguration")
                .serviceDetails(
                        "Bds",
                        "RemoveNodeReplaceConfiguration",
                        "https://docs.oracle.com/iaas/api/#/en/bigdata/20190531/NodeReplaceConfiguration/RemoveNodeReplaceConfiguration")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(RemoveNodeReplaceConfigurationRequest::builder)
                .basePath("/20190531")
                .appendPathParam("bdsInstances")
                .appendPathParam(request.getBdsInstanceId())
                .appendPathParam("nodeReplaceConfigurations")
                .appendPathParam(request.getNodeReplaceConfigurationId())
                .appendPathParam("actions")
                .appendPathParam("remove")
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .hasBody()
                .handleResponseHeaderString(
                        "opc-request-id",
                        RemoveNodeReplaceConfigurationResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        RemoveNodeReplaceConfigurationResponse.Builder::opcWorkRequestId)
                .callSync();
    }

    @Override
    public RemoveResourcePrincipalConfigurationResponse removeResourcePrincipalConfiguration(
            RemoveResourcePrincipalConfigurationRequest request) {

        Validate.notBlank(request.getBdsInstanceId(), "bdsInstanceId must not be blank");

        Validate.notBlank(
                request.getResourcePrincipalConfigurationId(),
                "resourcePrincipalConfigurationId must not be blank");
        Objects.requireNonNull(
                request.getRemoveResourcePrincipalConfigurationDetails(),
                "removeResourcePrincipalConfigurationDetails is required");

        return clientCall(request, RemoveResourcePrincipalConfigurationResponse::builder)
                .logger(LOG, "removeResourcePrincipalConfiguration")
                .serviceDetails(
                        "Bds",
                        "RemoveResourcePrincipalConfiguration",
                        "https://docs.oracle.com/iaas/api/#/en/bigdata/20190531/ResourcePrincipalConfiguration/RemoveResourcePrincipalConfiguration")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(RemoveResourcePrincipalConfigurationRequest::builder)
                .basePath("/20190531")
                .appendPathParam("bdsInstances")
                .appendPathParam(request.getBdsInstanceId())
                .appendPathParam("resourcePrincipalConfigurations")
                .appendPathParam(request.getResourcePrincipalConfigurationId())
                .appendPathParam("actions")
                .appendPathParam("remove")
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("if-match", request.getIfMatch())
                .hasBody()
                .handleResponseHeaderString(
                        "opc-request-id",
                        RemoveResourcePrincipalConfigurationResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        RemoveResourcePrincipalConfigurationResponse.Builder::opcWorkRequestId)
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
    public ReplaceNodeResponse replaceNode(ReplaceNodeRequest request) {

        Validate.notBlank(request.getBdsInstanceId(), "bdsInstanceId must not be blank");
        Objects.requireNonNull(request.getReplaceNodeDetails(), "replaceNodeDetails is required");

        return clientCall(request, ReplaceNodeResponse::builder)
                .logger(LOG, "replaceNode")
                .serviceDetails(
                        "Bds",
                        "ReplaceNode",
                        "https://docs.oracle.com/iaas/api/#/en/bigdata/20190531/BdsInstance/ReplaceNode")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(ReplaceNodeRequest::builder)
                .basePath("/20190531")
                .appendPathParam("bdsInstances")
                .appendPathParam(request.getBdsInstanceId())
                .appendPathParam("actions")
                .appendPathParam("replaceNode")
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .hasBody()
                .handleResponseHeaderString(
                        "opc-request-id", ReplaceNodeResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-work-request-id", ReplaceNodeResponse.Builder::opcWorkRequestId)
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
    public UpdateIdentityConfigurationResponse updateIdentityConfiguration(
            UpdateIdentityConfigurationRequest request) {

        Validate.notBlank(request.getBdsInstanceId(), "bdsInstanceId must not be blank");

        Validate.notBlank(
                request.getIdentityConfigurationId(), "identityConfigurationId must not be blank");
        Objects.requireNonNull(
                request.getUpdateIdentityConfigurationDetails(),
                "updateIdentityConfigurationDetails is required");

        return clientCall(request, UpdateIdentityConfigurationResponse::builder)
                .logger(LOG, "updateIdentityConfiguration")
                .serviceDetails(
                        "Bds",
                        "UpdateIdentityConfiguration",
                        "https://docs.oracle.com/iaas/api/#/en/bigdata/20190531/IdentityConfiguration/UpdateIdentityConfiguration")
                .method(com.oracle.bmc.http.client.Method.PUT)
                .requestBuilder(UpdateIdentityConfigurationRequest::builder)
                .basePath("/20190531")
                .appendPathParam("bdsInstances")
                .appendPathParam(request.getBdsInstanceId())
                .appendPathParam("identityConfigurations")
                .appendPathParam(request.getIdentityConfigurationId())
                .accept("application/json")
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .hasBody()
                .handleResponseHeaderString(
                        "opc-request-id", UpdateIdentityConfigurationResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        UpdateIdentityConfigurationResponse.Builder::opcWorkRequestId)
                .callSync();
    }

    @Override
    public UpdateNodeBackupConfigurationResponse updateNodeBackupConfiguration(
            UpdateNodeBackupConfigurationRequest request) {

        Validate.notBlank(request.getBdsInstanceId(), "bdsInstanceId must not be blank");

        Validate.notBlank(
                request.getNodeBackupConfigurationId(),
                "nodeBackupConfigurationId must not be blank");
        Objects.requireNonNull(
                request.getUpdateNodeBackupConfigurationDetails(),
                "updateNodeBackupConfigurationDetails is required");

        return clientCall(request, UpdateNodeBackupConfigurationResponse::builder)
                .logger(LOG, "updateNodeBackupConfiguration")
                .serviceDetails(
                        "Bds",
                        "UpdateNodeBackupConfiguration",
                        "https://docs.oracle.com/iaas/api/#/en/bigdata/20190531/BdsInstance/UpdateNodeBackupConfiguration")
                .method(com.oracle.bmc.http.client.Method.PUT)
                .requestBuilder(UpdateNodeBackupConfigurationRequest::builder)
                .basePath("/20190531")
                .appendPathParam("bdsInstances")
                .appendPathParam(request.getBdsInstanceId())
                .appendPathParam("nodeBackupConfigurations")
                .appendPathParam(request.getNodeBackupConfigurationId())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .hasBody()
                .handleResponseHeaderString(
                        "opc-request-id",
                        UpdateNodeBackupConfigurationResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        UpdateNodeBackupConfigurationResponse.Builder::opcWorkRequestId)
                .callSync();
    }

    @Override
    public UpdateNodeReplaceConfigurationResponse updateNodeReplaceConfiguration(
            UpdateNodeReplaceConfigurationRequest request) {

        Validate.notBlank(request.getBdsInstanceId(), "bdsInstanceId must not be blank");

        Validate.notBlank(
                request.getNodeReplaceConfigurationId(),
                "nodeReplaceConfigurationId must not be blank");
        Objects.requireNonNull(
                request.getUpdateNodeReplaceConfigurationDetails(),
                "updateNodeReplaceConfigurationDetails is required");

        return clientCall(request, UpdateNodeReplaceConfigurationResponse::builder)
                .logger(LOG, "updateNodeReplaceConfiguration")
                .serviceDetails(
                        "Bds",
                        "UpdateNodeReplaceConfiguration",
                        "https://docs.oracle.com/iaas/api/#/en/bigdata/20190531/BdsInstance/UpdateNodeReplaceConfiguration")
                .method(com.oracle.bmc.http.client.Method.PUT)
                .requestBuilder(UpdateNodeReplaceConfigurationRequest::builder)
                .basePath("/20190531")
                .appendPathParam("bdsInstances")
                .appendPathParam(request.getBdsInstanceId())
                .appendPathParam("nodeReplaceConfigurations")
                .appendPathParam(request.getNodeReplaceConfigurationId())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .hasBody()
                .handleResponseHeaderString(
                        "opc-request-id",
                        UpdateNodeReplaceConfigurationResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        UpdateNodeReplaceConfigurationResponse.Builder::opcWorkRequestId)
                .callSync();
    }

    @Override
    public UpdateResourcePrincipalConfigurationResponse updateResourcePrincipalConfiguration(
            UpdateResourcePrincipalConfigurationRequest request) {

        Validate.notBlank(request.getBdsInstanceId(), "bdsInstanceId must not be blank");

        Validate.notBlank(
                request.getResourcePrincipalConfigurationId(),
                "resourcePrincipalConfigurationId must not be blank");
        Objects.requireNonNull(
                request.getUpdateResourcePrincipalConfigurationDetails(),
                "updateResourcePrincipalConfigurationDetails is required");

        return clientCall(request, UpdateResourcePrincipalConfigurationResponse::builder)
                .logger(LOG, "updateResourcePrincipalConfiguration")
                .serviceDetails(
                        "Bds",
                        "UpdateResourcePrincipalConfiguration",
                        "https://docs.oracle.com/iaas/api/#/en/bigdata/20190531/BdsInstance/UpdateResourcePrincipalConfiguration")
                .method(com.oracle.bmc.http.client.Method.PUT)
                .requestBuilder(UpdateResourcePrincipalConfigurationRequest::builder)
                .basePath("/20190531")
                .appendPathParam("bdsInstances")
                .appendPathParam(request.getBdsInstanceId())
                .appendPathParam("resourcePrincipalConfigurations")
                .appendPathParam(request.getResourcePrincipalConfigurationId())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .hasBody()
                .handleResponseHeaderString(
                        "opc-request-id",
                        UpdateResourcePrincipalConfigurationResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        UpdateResourcePrincipalConfigurationResponse.Builder::opcWorkRequestId)
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
