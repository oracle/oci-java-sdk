/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.bds;

import com.oracle.bmc.util.internal.Validate;
import com.oracle.bmc.bds.requests.*;
import com.oracle.bmc.bds.responses.*;

import java.util.Objects;

/**
 * Async client implementation for Bds service. <br>
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
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20190531")
public class BdsAsyncClient extends com.oracle.bmc.http.internal.BaseAsyncClient
        implements BdsAsync {
    /** Service instance for Bds. */
    public static final com.oracle.bmc.Service SERVICE =
            com.oracle.bmc.Services.serviceBuilder()
                    .serviceName("BDS")
                    .serviceEndpointPrefix("")
                    .serviceEndpointTemplate(
                            "https://bigdataservice.{region}.oci.{secondLevelDomain}")
                    .build();

    private static final org.slf4j.Logger LOG =
            org.slf4j.LoggerFactory.getLogger(BdsAsyncClient.class);

    BdsAsyncClient(
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
            extends com.oracle.bmc.common.RegionalClientBuilder<Builder, BdsAsyncClient> {
        private Builder(com.oracle.bmc.Service service) {
            super(service);
            final String packageName = "bds";
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
        public BdsAsyncClient build(
                @jakarta.annotation.Nonnull
                        com.oracle.bmc.auth.AbstractAuthenticationDetailsProvider
                                authenticationDetailsProvider) {
            return new BdsAsyncClient(this, authenticationDetailsProvider);
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
    public java.util.concurrent.Future<ActivateBdsMetastoreConfigurationResponse>
            activateBdsMetastoreConfiguration(
                    ActivateBdsMetastoreConfigurationRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    ActivateBdsMetastoreConfigurationRequest,
                                    ActivateBdsMetastoreConfigurationResponse>
                            handler) {

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
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ActivateIamUserSyncConfigurationResponse>
            activateIamUserSyncConfiguration(
                    ActivateIamUserSyncConfigurationRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    ActivateIamUserSyncConfigurationRequest,
                                    ActivateIamUserSyncConfigurationResponse>
                            handler) {

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
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ActivateUpstConfigurationResponse> activateUpstConfiguration(
            ActivateUpstConfigurationRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ActivateUpstConfigurationRequest, ActivateUpstConfigurationResponse>
                    handler) {

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
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<AddAutoScalingConfigurationResponse>
            addAutoScalingConfiguration(
                    AddAutoScalingConfigurationRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    AddAutoScalingConfigurationRequest,
                                    AddAutoScalingConfigurationResponse>
                            handler) {

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
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<AddBlockStorageResponse> addBlockStorage(
            AddBlockStorageRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            AddBlockStorageRequest, AddBlockStorageResponse>
                    handler) {

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
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<AddCloudSqlResponse> addCloudSql(
            AddCloudSqlRequest request,
            final com.oracle.bmc.responses.AsyncHandler<AddCloudSqlRequest, AddCloudSqlResponse>
                    handler) {

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
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<AddKafkaResponse> addKafka(
            AddKafkaRequest request,
            final com.oracle.bmc.responses.AsyncHandler<AddKafkaRequest, AddKafkaResponse>
                    handler) {

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
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<AddMasterNodesResponse> addMasterNodes(
            AddMasterNodesRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            AddMasterNodesRequest, AddMasterNodesResponse>
                    handler) {

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
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<AddUtilityNodesResponse> addUtilityNodes(
            AddUtilityNodesRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            AddUtilityNodesRequest, AddUtilityNodesResponse>
                    handler) {

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
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<AddWorkerNodesResponse> addWorkerNodes(
            AddWorkerNodesRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            AddWorkerNodesRequest, AddWorkerNodesResponse>
                    handler) {

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
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<BackupNodeResponse> backupNode(
            BackupNodeRequest request,
            final com.oracle.bmc.responses.AsyncHandler<BackupNodeRequest, BackupNodeResponse>
                    handler) {

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
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<CertificateServiceInfoResponse> certificateServiceInfo(
            CertificateServiceInfoRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            CertificateServiceInfoRequest, CertificateServiceInfoResponse>
                    handler) {

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
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ChangeBdsInstanceCompartmentResponse>
            changeBdsInstanceCompartment(
                    ChangeBdsInstanceCompartmentRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    ChangeBdsInstanceCompartmentRequest,
                                    ChangeBdsInstanceCompartmentResponse>
                            handler) {

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
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ChangeShapeResponse> changeShape(
            ChangeShapeRequest request,
            final com.oracle.bmc.responses.AsyncHandler<ChangeShapeRequest, ChangeShapeResponse>
                    handler) {

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
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<CreateBdsApiKeyResponse> createBdsApiKey(
            CreateBdsApiKeyRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            CreateBdsApiKeyRequest, CreateBdsApiKeyResponse>
                    handler) {

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
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<CreateBdsInstanceResponse> createBdsInstance(
            CreateBdsInstanceRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            CreateBdsInstanceRequest, CreateBdsInstanceResponse>
                    handler) {
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
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<CreateBdsMetastoreConfigurationResponse>
            createBdsMetastoreConfiguration(
                    CreateBdsMetastoreConfigurationRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    CreateBdsMetastoreConfigurationRequest,
                                    CreateBdsMetastoreConfigurationResponse>
                            handler) {

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
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<CreateIdentityConfigurationResponse>
            createIdentityConfiguration(
                    CreateIdentityConfigurationRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    CreateIdentityConfigurationRequest,
                                    CreateIdentityConfigurationResponse>
                            handler) {

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
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<CreateNodeBackupConfigurationResponse>
            createNodeBackupConfiguration(
                    CreateNodeBackupConfigurationRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    CreateNodeBackupConfigurationRequest,
                                    CreateNodeBackupConfigurationResponse>
                            handler) {

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
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<CreateNodeReplaceConfigurationResponse>
            createNodeReplaceConfiguration(
                    CreateNodeReplaceConfigurationRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    CreateNodeReplaceConfigurationRequest,
                                    CreateNodeReplaceConfigurationResponse>
                            handler) {

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
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<CreateResourcePrincipalConfigurationResponse>
            createResourcePrincipalConfiguration(
                    CreateResourcePrincipalConfigurationRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    CreateResourcePrincipalConfigurationRequest,
                                    CreateResourcePrincipalConfigurationResponse>
                            handler) {

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
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<DeactivateIamUserSyncConfigurationResponse>
            deactivateIamUserSyncConfiguration(
                    DeactivateIamUserSyncConfigurationRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    DeactivateIamUserSyncConfigurationRequest,
                                    DeactivateIamUserSyncConfigurationResponse>
                            handler) {

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
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<DeactivateUpstConfigurationResponse>
            deactivateUpstConfiguration(
                    DeactivateUpstConfigurationRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    DeactivateUpstConfigurationRequest,
                                    DeactivateUpstConfigurationResponse>
                            handler) {

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
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<DeleteBdsApiKeyResponse> deleteBdsApiKey(
            DeleteBdsApiKeyRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            DeleteBdsApiKeyRequest, DeleteBdsApiKeyResponse>
                    handler) {

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
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<DeleteBdsInstanceResponse> deleteBdsInstance(
            DeleteBdsInstanceRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            DeleteBdsInstanceRequest, DeleteBdsInstanceResponse>
                    handler) {

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
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<DeleteBdsMetastoreConfigurationResponse>
            deleteBdsMetastoreConfiguration(
                    DeleteBdsMetastoreConfigurationRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    DeleteBdsMetastoreConfigurationRequest,
                                    DeleteBdsMetastoreConfigurationResponse>
                            handler) {

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
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<DeleteIdentityConfigurationResponse>
            deleteIdentityConfiguration(
                    DeleteIdentityConfigurationRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    DeleteIdentityConfigurationRequest,
                                    DeleteIdentityConfigurationResponse>
                            handler) {

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
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<DeleteNodeBackupResponse> deleteNodeBackup(
            DeleteNodeBackupRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            DeleteNodeBackupRequest, DeleteNodeBackupResponse>
                    handler) {

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
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<DeleteNodeBackupConfigurationResponse>
            deleteNodeBackupConfiguration(
                    DeleteNodeBackupConfigurationRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    DeleteNodeBackupConfigurationRequest,
                                    DeleteNodeBackupConfigurationResponse>
                            handler) {

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
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<DisableCertificateResponse> disableCertificate(
            DisableCertificateRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            DisableCertificateRequest, DisableCertificateResponse>
                    handler) {

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
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<EnableCertificateResponse> enableCertificate(
            EnableCertificateRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            EnableCertificateRequest, EnableCertificateResponse>
                    handler) {

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
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ExecuteBootstrapScriptResponse> executeBootstrapScript(
            ExecuteBootstrapScriptRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ExecuteBootstrapScriptRequest, ExecuteBootstrapScriptResponse>
                    handler) {

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
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ForceRefreshResourcePrincipalResponse>
            forceRefreshResourcePrincipal(
                    ForceRefreshResourcePrincipalRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    ForceRefreshResourcePrincipalRequest,
                                    ForceRefreshResourcePrincipalResponse>
                            handler) {

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
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<GetAutoScalingConfigurationResponse>
            getAutoScalingConfiguration(
                    GetAutoScalingConfigurationRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    GetAutoScalingConfigurationRequest,
                                    GetAutoScalingConfigurationResponse>
                            handler) {

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
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<GetBdsApiKeyResponse> getBdsApiKey(
            GetBdsApiKeyRequest request,
            final com.oracle.bmc.responses.AsyncHandler<GetBdsApiKeyRequest, GetBdsApiKeyResponse>
                    handler) {

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
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<GetBdsInstanceResponse> getBdsInstance(
            GetBdsInstanceRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            GetBdsInstanceRequest, GetBdsInstanceResponse>
                    handler) {

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
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<GetBdsMetastoreConfigurationResponse>
            getBdsMetastoreConfiguration(
                    GetBdsMetastoreConfigurationRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    GetBdsMetastoreConfigurationRequest,
                                    GetBdsMetastoreConfigurationResponse>
                            handler) {

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
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<GetIdentityConfigurationResponse> getIdentityConfiguration(
            GetIdentityConfigurationRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            GetIdentityConfigurationRequest, GetIdentityConfigurationResponse>
                    handler) {

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
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<GetNodeBackupResponse> getNodeBackup(
            GetNodeBackupRequest request,
            final com.oracle.bmc.responses.AsyncHandler<GetNodeBackupRequest, GetNodeBackupResponse>
                    handler) {

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
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<GetNodeBackupConfigurationResponse>
            getNodeBackupConfiguration(
                    GetNodeBackupConfigurationRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    GetNodeBackupConfigurationRequest,
                                    GetNodeBackupConfigurationResponse>
                            handler) {

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
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<GetNodeReplaceConfigurationResponse>
            getNodeReplaceConfiguration(
                    GetNodeReplaceConfigurationRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    GetNodeReplaceConfigurationRequest,
                                    GetNodeReplaceConfigurationResponse>
                            handler) {

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
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<GetOsPatchDetailsResponse> getOsPatchDetails(
            GetOsPatchDetailsRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            GetOsPatchDetailsRequest, GetOsPatchDetailsResponse>
                    handler) {

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
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<GetResourcePrincipalConfigurationResponse>
            getResourcePrincipalConfiguration(
                    GetResourcePrincipalConfigurationRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    GetResourcePrincipalConfigurationRequest,
                                    GetResourcePrincipalConfigurationResponse>
                            handler) {

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
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<InstallOsPatchResponse> installOsPatch(
            InstallOsPatchRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            InstallOsPatchRequest, InstallOsPatchResponse>
                    handler) {

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
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<InstallPatchResponse> installPatch(
            InstallPatchRequest request,
            final com.oracle.bmc.responses.AsyncHandler<InstallPatchRequest, InstallPatchResponse>
                    handler) {

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
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ListAutoScalingConfigurationsResponse>
            listAutoScalingConfigurations(
                    ListAutoScalingConfigurationsRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    ListAutoScalingConfigurationsRequest,
                                    ListAutoScalingConfigurationsResponse>
                            handler) {
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
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ListBdsApiKeysResponse> listBdsApiKeys(
            ListBdsApiKeysRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ListBdsApiKeysRequest, ListBdsApiKeysResponse>
                    handler) {

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
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ListBdsClusterVersionsResponse> listBdsClusterVersions(
            ListBdsClusterVersionsRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ListBdsClusterVersionsRequest, ListBdsClusterVersionsResponse>
                    handler) {

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
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ListBdsInstancesResponse> listBdsInstances(
            ListBdsInstancesRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ListBdsInstancesRequest, ListBdsInstancesResponse>
                    handler) {
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
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ListBdsMetastoreConfigurationsResponse>
            listBdsMetastoreConfigurations(
                    ListBdsMetastoreConfigurationsRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    ListBdsMetastoreConfigurationsRequest,
                                    ListBdsMetastoreConfigurationsResponse>
                            handler) {

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
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ListIdentityConfigurationsResponse>
            listIdentityConfigurations(
                    ListIdentityConfigurationsRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    ListIdentityConfigurationsRequest,
                                    ListIdentityConfigurationsResponse>
                            handler) {

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
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ListNodeBackupConfigurationsResponse>
            listNodeBackupConfigurations(
                    ListNodeBackupConfigurationsRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    ListNodeBackupConfigurationsRequest,
                                    ListNodeBackupConfigurationsResponse>
                            handler) {

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
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ListNodeBackupsResponse> listNodeBackups(
            ListNodeBackupsRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ListNodeBackupsRequest, ListNodeBackupsResponse>
                    handler) {

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
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ListNodeReplaceConfigurationsResponse>
            listNodeReplaceConfigurations(
                    ListNodeReplaceConfigurationsRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    ListNodeReplaceConfigurationsRequest,
                                    ListNodeReplaceConfigurationsResponse>
                            handler) {

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
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ListOsPatchesResponse> listOsPatches(
            ListOsPatchesRequest request,
            final com.oracle.bmc.responses.AsyncHandler<ListOsPatchesRequest, ListOsPatchesResponse>
                    handler) {

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
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ListPatchHistoriesResponse> listPatchHistories(
            ListPatchHistoriesRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ListPatchHistoriesRequest, ListPatchHistoriesResponse>
                    handler) {

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
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ListPatchesResponse> listPatches(
            ListPatchesRequest request,
            final com.oracle.bmc.responses.AsyncHandler<ListPatchesRequest, ListPatchesResponse>
                    handler) {

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
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ListResourcePrincipalConfigurationsResponse>
            listResourcePrincipalConfigurations(
                    ListResourcePrincipalConfigurationsRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    ListResourcePrincipalConfigurationsRequest,
                                    ListResourcePrincipalConfigurationsResponse>
                            handler) {

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
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<RefreshConfidentialApplicationResponse>
            refreshConfidentialApplication(
                    RefreshConfidentialApplicationRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    RefreshConfidentialApplicationRequest,
                                    RefreshConfidentialApplicationResponse>
                            handler) {

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
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<RefreshUpstTokenExchangeKeytabResponse>
            refreshUpstTokenExchangeKeytab(
                    RefreshUpstTokenExchangeKeytabRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    RefreshUpstTokenExchangeKeytabRequest,
                                    RefreshUpstTokenExchangeKeytabResponse>
                            handler) {

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
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<RemoveAutoScalingConfigurationResponse>
            removeAutoScalingConfiguration(
                    RemoveAutoScalingConfigurationRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    RemoveAutoScalingConfigurationRequest,
                                    RemoveAutoScalingConfigurationResponse>
                            handler) {

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
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<RemoveCloudSqlResponse> removeCloudSql(
            RemoveCloudSqlRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            RemoveCloudSqlRequest, RemoveCloudSqlResponse>
                    handler) {

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
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<RemoveKafkaResponse> removeKafka(
            RemoveKafkaRequest request,
            final com.oracle.bmc.responses.AsyncHandler<RemoveKafkaRequest, RemoveKafkaResponse>
                    handler) {

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
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<RemoveNodeResponse> removeNode(
            RemoveNodeRequest request,
            final com.oracle.bmc.responses.AsyncHandler<RemoveNodeRequest, RemoveNodeResponse>
                    handler) {

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
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<RemoveNodeReplaceConfigurationResponse>
            removeNodeReplaceConfiguration(
                    RemoveNodeReplaceConfigurationRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    RemoveNodeReplaceConfigurationRequest,
                                    RemoveNodeReplaceConfigurationResponse>
                            handler) {

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
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<RemoveResourcePrincipalConfigurationResponse>
            removeResourcePrincipalConfiguration(
                    RemoveResourcePrincipalConfigurationRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    RemoveResourcePrincipalConfigurationRequest,
                                    RemoveResourcePrincipalConfigurationResponse>
                            handler) {

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
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<RenewCertificateResponse> renewCertificate(
            RenewCertificateRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            RenewCertificateRequest, RenewCertificateResponse>
                    handler) {

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
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ReplaceNodeResponse> replaceNode(
            ReplaceNodeRequest request,
            final com.oracle.bmc.responses.AsyncHandler<ReplaceNodeRequest, ReplaceNodeResponse>
                    handler) {

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
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<RestartNodeResponse> restartNode(
            RestartNodeRequest request,
            final com.oracle.bmc.responses.AsyncHandler<RestartNodeRequest, RestartNodeResponse>
                    handler) {

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
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<StartBdsInstanceResponse> startBdsInstance(
            StartBdsInstanceRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            StartBdsInstanceRequest, StartBdsInstanceResponse>
                    handler) {

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
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<StopBdsInstanceResponse> stopBdsInstance(
            StopBdsInstanceRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            StopBdsInstanceRequest, StopBdsInstanceResponse>
                    handler) {

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
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<TestBdsMetastoreConfigurationResponse>
            testBdsMetastoreConfiguration(
                    TestBdsMetastoreConfigurationRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    TestBdsMetastoreConfigurationRequest,
                                    TestBdsMetastoreConfigurationResponse>
                            handler) {

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
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<TestBdsObjectStorageConnectionResponse>
            testBdsObjectStorageConnection(
                    TestBdsObjectStorageConnectionRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    TestBdsObjectStorageConnectionRequest,
                                    TestBdsObjectStorageConnectionResponse>
                            handler) {

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
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<UpdateAutoScalingConfigurationResponse>
            updateAutoScalingConfiguration(
                    UpdateAutoScalingConfigurationRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    UpdateAutoScalingConfigurationRequest,
                                    UpdateAutoScalingConfigurationResponse>
                            handler) {

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
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<UpdateBdsInstanceResponse> updateBdsInstance(
            UpdateBdsInstanceRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            UpdateBdsInstanceRequest, UpdateBdsInstanceResponse>
                    handler) {

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
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<UpdateBdsMetastoreConfigurationResponse>
            updateBdsMetastoreConfiguration(
                    UpdateBdsMetastoreConfigurationRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    UpdateBdsMetastoreConfigurationRequest,
                                    UpdateBdsMetastoreConfigurationResponse>
                            handler) {

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
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<UpdateIdentityConfigurationResponse>
            updateIdentityConfiguration(
                    UpdateIdentityConfigurationRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    UpdateIdentityConfigurationRequest,
                                    UpdateIdentityConfigurationResponse>
                            handler) {

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
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<UpdateNodeBackupConfigurationResponse>
            updateNodeBackupConfiguration(
                    UpdateNodeBackupConfigurationRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    UpdateNodeBackupConfigurationRequest,
                                    UpdateNodeBackupConfigurationResponse>
                            handler) {

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
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<UpdateNodeReplaceConfigurationResponse>
            updateNodeReplaceConfiguration(
                    UpdateNodeReplaceConfigurationRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    UpdateNodeReplaceConfigurationRequest,
                                    UpdateNodeReplaceConfigurationResponse>
                            handler) {

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
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<UpdateResourcePrincipalConfigurationResponse>
            updateResourcePrincipalConfiguration(
                    UpdateResourcePrincipalConfigurationRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    UpdateResourcePrincipalConfigurationRequest,
                                    UpdateResourcePrincipalConfigurationResponse>
                            handler) {

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
                .callAsync(handler);
    }

    /**
     * Create a new client instance.
     *
     * @param authenticationDetailsProvider The authentication details (see {@link Builder#build})
     * @deprecated Use the {@link #builder() builder} instead.
     */
    @Deprecated
    public BdsAsyncClient(
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
    public BdsAsyncClient(
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
    public BdsAsyncClient(
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
    public BdsAsyncClient(
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
    public BdsAsyncClient(
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
    public BdsAsyncClient(
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
    public BdsAsyncClient(
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
