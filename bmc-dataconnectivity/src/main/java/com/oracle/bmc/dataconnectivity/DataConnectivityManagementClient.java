/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.dataconnectivity;

import com.oracle.bmc.util.internal.Validate;
import com.oracle.bmc.dataconnectivity.requests.*;
import com.oracle.bmc.dataconnectivity.responses.*;
import com.oracle.bmc.circuitbreaker.CircuitBreakerConfiguration;
import com.oracle.bmc.util.CircuitBreakerUtils;

import java.util.Objects;

@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20210217")
public class DataConnectivityManagementClient extends com.oracle.bmc.http.internal.BaseSyncClient
        implements DataConnectivityManagement {
    /** Service instance for DataConnectivityManagement. */
    public static final com.oracle.bmc.Service SERVICE =
            com.oracle.bmc.Services.serviceBuilder()
                    .serviceName("DATACONNECTIVITYMANAGEMENT")
                    .serviceEndpointPrefix("")
                    .serviceEndpointTemplate(
                            "https://dataconnectivity.{region}.oci.{secondLevelDomain}")
                    .build();

    private static final org.slf4j.Logger LOG =
            org.slf4j.LoggerFactory.getLogger(DataConnectivityManagementClient.class);

    private final DataConnectivityManagementWaiters waiters;

    private final DataConnectivityManagementPaginators paginators;

    private DataConnectivityManagementClient(
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
                                    .nameFormat("DataConnectivityManagement-waiters-%d")
                                    .build());
            threadPoolExecutor.allowCoreThreadTimeOut(true);

            executorService = threadPoolExecutor;
        }
        this.waiters = new DataConnectivityManagementWaiters(executorService, this);

        this.paginators = new DataConnectivityManagementPaginators(this);
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
                    Builder, DataConnectivityManagementClient> {
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
        public DataConnectivityManagementClient build(
                @jakarta.annotation.Nonnull
                        com.oracle.bmc.auth.AbstractAuthenticationDetailsProvider
                                authenticationDetailsProvider) {
            return new DataConnectivityManagementClient(
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
    public ChangeEndpointCompartmentResponse changeEndpointCompartment(
            ChangeEndpointCompartmentRequest request) {

        Validate.notBlank(request.getEndpointId(), "endpointId must not be blank");
        Objects.requireNonNull(
                request.getChangeEndpointCompartmentDetails(),
                "changeEndpointCompartmentDetails is required");

        return clientCall(request, ChangeEndpointCompartmentResponse::builder)
                .logger(LOG, "changeEndpointCompartment")
                .serviceDetails("DataConnectivityManagement", "ChangeEndpointCompartment", "")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(ChangeEndpointCompartmentRequest::builder)
                .basePath("/20210217")
                .appendPathParam("endpoints")
                .appendPathParam(request.getEndpointId())
                .appendPathParam("actions")
                .appendPathParam("changeCompartment")
                .appendQueryParam("registryId", request.getRegistryId())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .hasBody()
                .handleResponseHeaderString(
                        "opc-request-id", ChangeEndpointCompartmentResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        ChangeEndpointCompartmentResponse.Builder::opcWorkRequestId)
                .callSync();
    }

    @Override
    public ChangeRegistryCompartmentResponse changeRegistryCompartment(
            ChangeRegistryCompartmentRequest request) {

        Validate.notBlank(request.getRegistryId(), "registryId must not be blank");
        Objects.requireNonNull(
                request.getChangeRegistryCompartmentDetails(),
                "changeRegistryCompartmentDetails is required");

        return clientCall(request, ChangeRegistryCompartmentResponse::builder)
                .logger(LOG, "changeRegistryCompartment")
                .serviceDetails("DataConnectivityManagement", "ChangeRegistryCompartment", "")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(ChangeRegistryCompartmentRequest::builder)
                .basePath("/20210217")
                .appendPathParam("registries")
                .appendPathParam(request.getRegistryId())
                .appendPathParam("actions")
                .appendPathParam("changeCompartment")
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .hasBody()
                .handleResponseHeaderString(
                        "opc-request-id", ChangeRegistryCompartmentResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        ChangeRegistryCompartmentResponse.Builder::opcWorkRequestId)
                .callSync();
    }

    @Override
    public CreateAttachDataAssetResponse createAttachDataAsset(
            CreateAttachDataAssetRequest request) {

        Validate.notBlank(request.getRegistryId(), "registryId must not be blank");

        Validate.notBlank(request.getEndpointId(), "endpointId must not be blank");
        Objects.requireNonNull(
                request.getCreateAttachDataAssetDetails(),
                "createAttachDataAssetDetails is required");

        return clientCall(request, CreateAttachDataAssetResponse::builder)
                .logger(LOG, "createAttachDataAsset")
                .serviceDetails("DataConnectivityManagement", "CreateAttachDataAsset", "")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(CreateAttachDataAssetRequest::builder)
                .basePath("/20210217")
                .appendPathParam("registries")
                .appendPathParam(request.getRegistryId())
                .appendPathParam("endpoints")
                .appendPathParam(request.getEndpointId())
                .appendPathParam("actions")
                .appendPathParam("attachDataAssets")
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("if-match", request.getIfMatch())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.dataconnectivity.model.AttachDataAssetInfo.class,
                        CreateAttachDataAssetResponse.Builder::attachDataAssetInfo)
                .handleResponseHeaderString(
                        "opc-request-id", CreateAttachDataAssetResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public CreateConnectionResponse createConnection(CreateConnectionRequest request) {

        Validate.notBlank(request.getRegistryId(), "registryId must not be blank");
        Objects.requireNonNull(
                request.getCreateConnectionDetails(), "createConnectionDetails is required");

        return clientCall(request, CreateConnectionResponse::builder)
                .logger(LOG, "createConnection")
                .serviceDetails("DataConnectivityManagement", "CreateConnection", "")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(CreateConnectionRequest::builder)
                .basePath("/20210217")
                .appendPathParam("registries")
                .appendPathParam(request.getRegistryId())
                .appendPathParam("connections")
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.dataconnectivity.model.Connection.class,
                        CreateConnectionResponse.Builder::connection)
                .handleResponseHeaderString("etag", CreateConnectionResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", CreateConnectionResponse.Builder::opcRequestId)
                .operationUsesDefaultRetries()
                .callSync();
    }

    @Override
    public CreateConnectionValidationResponse createConnectionValidation(
            CreateConnectionValidationRequest request) {

        Validate.notBlank(request.getRegistryId(), "registryId must not be blank");
        Objects.requireNonNull(
                request.getCreateConnectionValidationDetails(),
                "createConnectionValidationDetails is required");

        return clientCall(request, CreateConnectionValidationResponse::builder)
                .logger(LOG, "createConnectionValidation")
                .serviceDetails("DataConnectivityManagement", "CreateConnectionValidation", "")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(CreateConnectionValidationRequest::builder)
                .basePath("/20210217")
                .appendPathParam("registries")
                .appendPathParam(request.getRegistryId())
                .appendPathParam("connectionValidations")
                .appendQueryParam("endpointId", request.getEndpointId())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.dataconnectivity.model.ConnectionValidation.class,
                        CreateConnectionValidationResponse.Builder::connectionValidation)
                .handleResponseHeaderString(
                        "etag", CreateConnectionValidationResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", CreateConnectionValidationResponse.Builder::opcRequestId)
                .operationUsesDefaultRetries()
                .callSync();
    }

    @Override
    public CreateConnectivityValidationResponse createConnectivityValidation(
            CreateConnectivityValidationRequest request) {

        Validate.notBlank(request.getRegistryId(), "registryId must not be blank");
        Objects.requireNonNull(
                request.getCreateConnectivityValidationDetails(),
                "createConnectivityValidationDetails is required");

        return clientCall(request, CreateConnectivityValidationResponse::builder)
                .logger(LOG, "createConnectivityValidation")
                .serviceDetails("DataConnectivityManagement", "CreateConnectivityValidation", "")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(CreateConnectivityValidationRequest::builder)
                .basePath("/20210217")
                .appendPathParam("registries")
                .appendPathParam(request.getRegistryId())
                .appendPathParam("actions")
                .appendPathParam("connectivityValidation")
                .appendQueryParam("endpointId", request.getEndpointId())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.dataconnectivity.model.ConnectivityValidation.class,
                        CreateConnectivityValidationResponse.Builder::connectivityValidation)
                .handleResponseHeaderString(
                        "etag", CreateConnectivityValidationResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id",
                        CreateConnectivityValidationResponse.Builder::opcRequestId)
                .operationUsesDefaultRetries()
                .callSync();
    }

    @Override
    public CreateDataAssetResponse createDataAsset(CreateDataAssetRequest request) {

        Validate.notBlank(request.getRegistryId(), "registryId must not be blank");
        Objects.requireNonNull(
                request.getCreateDataAssetDetails(), "createDataAssetDetails is required");

        return clientCall(request, CreateDataAssetResponse::builder)
                .logger(LOG, "createDataAsset")
                .serviceDetails("DataConnectivityManagement", "CreateDataAsset", "")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(CreateDataAssetRequest::builder)
                .basePath("/20210217")
                .appendPathParam("registries")
                .appendPathParam(request.getRegistryId())
                .appendPathParam("dataAssets")
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.dataconnectivity.model.DataAsset.class,
                        CreateDataAssetResponse.Builder::dataAsset)
                .handleResponseHeaderString("etag", CreateDataAssetResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", CreateDataAssetResponse.Builder::opcRequestId)
                .operationUsesDefaultRetries()
                .callSync();
    }

    @Override
    public CreateDataPreviewResponse createDataPreview(CreateDataPreviewRequest request) {

        Validate.notBlank(request.getRegistryId(), "registryId must not be blank");
        Objects.requireNonNull(
                request.getCreateDataPreviewDetails(), "createDataPreviewDetails is required");

        return clientCall(request, CreateDataPreviewResponse::builder)
                .logger(LOG, "createDataPreview")
                .serviceDetails("DataConnectivityManagement", "CreateDataPreview", "")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(CreateDataPreviewRequest::builder)
                .basePath("/20210217")
                .appendPathParam("registries")
                .appendPathParam(request.getRegistryId())
                .appendPathParam("actions")
                .appendPathParam("dataPreview")
                .appendQueryParam("endpointId", request.getEndpointId())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("if-match", request.getIfMatch())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.dataconnectivity.model.DataPreview.class,
                        CreateDataPreviewResponse.Builder::dataPreview)
                .handleResponseHeaderString(
                        "opc-request-id", CreateDataPreviewResponse.Builder::opcRequestId)
                .operationUsesDefaultRetries()
                .callSync();
    }

    @Override
    public CreateDataProfileResponse createDataProfile(CreateDataProfileRequest request) {

        Validate.notBlank(request.getRegistryId(), "registryId must not be blank");
        Objects.requireNonNull(
                request.getCreateDataProfileDetails(), "createDataProfileDetails is required");

        return clientCall(request, CreateDataProfileResponse::builder)
                .logger(LOG, "createDataProfile")
                .serviceDetails("DataConnectivityManagement", "CreateDataProfile", "")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(CreateDataProfileRequest::builder)
                .basePath("/20210217")
                .appendPathParam("registries")
                .appendPathParam(request.getRegistryId())
                .appendPathParam("actions")
                .appendPathParam("dataProfile")
                .appendQueryParam("endpointId", request.getEndpointId())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("if-match", request.getIfMatch())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.dataconnectivity.model.DataProfile.class,
                        CreateDataProfileResponse.Builder::dataProfile)
                .handleResponseHeaderString(
                        "opc-request-id", CreateDataProfileResponse.Builder::opcRequestId)
                .operationUsesDefaultRetries()
                .callSync();
    }

    @Override
    public CreateDeReferenceArtifactResponse createDeReferenceArtifact(
            CreateDeReferenceArtifactRequest request) {

        Validate.notBlank(request.getRegistryId(), "registryId must not be blank");

        Validate.notBlank(request.getDcmsArtifactId(), "dcmsArtifactId must not be blank");
        Objects.requireNonNull(
                request.getCreateDeReferenceArtifactDetails(),
                "createDeReferenceArtifactDetails is required");

        return clientCall(request, CreateDeReferenceArtifactResponse::builder)
                .logger(LOG, "createDeReferenceArtifact")
                .serviceDetails("DataConnectivityManagement", "CreateDeReferenceArtifact", "")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(CreateDeReferenceArtifactRequest::builder)
                .basePath("/20210217")
                .appendPathParam("registries")
                .appendPathParam(request.getRegistryId())
                .appendPathParam("dcmsArtifacts")
                .appendPathParam(request.getDcmsArtifactId())
                .appendPathParam("actions")
                .appendPathParam("deReferenceArtifact")
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("if-match", request.getIfMatch())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.dataconnectivity.model.DeReferenceInfo.class,
                        CreateDeReferenceArtifactResponse.Builder::deReferenceInfo)
                .handleResponseHeaderString("etag", CreateDeReferenceArtifactResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", CreateDeReferenceArtifactResponse.Builder::opcRequestId)
                .operationUsesDefaultRetries()
                .callSync();
    }

    @Override
    public CreateDetachDataAssetResponse createDetachDataAsset(
            CreateDetachDataAssetRequest request) {

        Validate.notBlank(request.getRegistryId(), "registryId must not be blank");

        Validate.notBlank(request.getEndpointId(), "endpointId must not be blank");
        Objects.requireNonNull(
                request.getCreateDetachDataAssetDetails(),
                "createDetachDataAssetDetails is required");

        return clientCall(request, CreateDetachDataAssetResponse::builder)
                .logger(LOG, "createDetachDataAsset")
                .serviceDetails("DataConnectivityManagement", "CreateDetachDataAsset", "")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(CreateDetachDataAssetRequest::builder)
                .basePath("/20210217")
                .appendPathParam("registries")
                .appendPathParam(request.getRegistryId())
                .appendPathParam("endpoints")
                .appendPathParam(request.getEndpointId())
                .appendPathParam("actions")
                .appendPathParam("detachDataAssets")
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("if-match", request.getIfMatch())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.dataconnectivity.model.DetachDataAssetInfo.class,
                        CreateDetachDataAssetResponse.Builder::detachDataAssetInfo)
                .handleResponseHeaderString(
                        "opc-request-id", CreateDetachDataAssetResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public CreateEndpointResponse createEndpoint(CreateEndpointRequest request) {
        Objects.requireNonNull(
                request.getCreateEndpointDetails(), "createEndpointDetails is required");

        return clientCall(request, CreateEndpointResponse::builder)
                .logger(LOG, "createEndpoint")
                .serviceDetails("DataConnectivityManagement", "CreateEndpoint", "")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(CreateEndpointRequest::builder)
                .basePath("/20210217")
                .appendPathParam("endpoints")
                .appendQueryParam("registryId", request.getRegistryId())
                .accept("application/json")
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .hasBody()
                .handleResponseHeaderString(
                        "opc-request-id", CreateEndpointResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-work-request-id", CreateEndpointResponse.Builder::opcWorkRequestId)
                .callSync();
    }

    @Override
    public CreateEntityShapeResponse createEntityShape(CreateEntityShapeRequest request) {

        Validate.notBlank(request.getRegistryId(), "registryId must not be blank");

        Validate.notBlank(request.getConnectionKey(), "connectionKey must not be blank");

        Validate.notBlank(request.getSchemaResourceName(), "schemaResourceName must not be blank");
        Objects.requireNonNull(
                request.getCreateEntityShapeDetails(), "createEntityShapeDetails is required");

        return clientCall(request, CreateEntityShapeResponse::builder)
                .logger(LOG, "createEntityShape")
                .serviceDetails("DataConnectivityManagement", "CreateEntityShape", "")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(CreateEntityShapeRequest::builder)
                .basePath("/20210217")
                .appendPathParam("registries")
                .appendPathParam(request.getRegistryId())
                .appendPathParam("connections")
                .appendPathParam(request.getConnectionKey())
                .appendPathParam("schemas")
                .appendPathParam(request.getSchemaResourceName())
                .appendPathParam("actions")
                .appendPathParam("entityShapes")
                .appendEnumQueryParam("authorizationMode", request.getAuthorizationMode())
                .appendQueryParam("endpointId", request.getEndpointId())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("if-match", request.getIfMatch())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.dataconnectivity.model.EntityShape.class,
                        CreateEntityShapeResponse.Builder::entityShape)
                .handleResponseHeaderString(
                        "opc-request-id", CreateEntityShapeResponse.Builder::opcRequestId)
                .operationUsesDefaultRetries()
                .callSync();
    }

    @Override
    public CreateExecuteOperationJobResponse createExecuteOperationJob(
            CreateExecuteOperationJobRequest request) {

        Validate.notBlank(request.getRegistryId(), "registryId must not be blank");

        Validate.notBlank(request.getConnectionKey(), "connectionKey must not be blank");

        Validate.notBlank(request.getSchemaResourceName(), "schemaResourceName must not be blank");
        Objects.requireNonNull(
                request.getCreateExecuteOperationJobDetails(),
                "createExecuteOperationJobDetails is required");

        return clientCall(request, CreateExecuteOperationJobResponse::builder)
                .logger(LOG, "createExecuteOperationJob")
                .serviceDetails("DataConnectivityManagement", "CreateExecuteOperationJob", "")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(CreateExecuteOperationJobRequest::builder)
                .basePath("/20210217")
                .appendPathParam("registries")
                .appendPathParam(request.getRegistryId())
                .appendPathParam("connections")
                .appendPathParam(request.getConnectionKey())
                .appendPathParam("schemas")
                .appendPathParam(request.getSchemaResourceName())
                .appendPathParam("actions")
                .appendPathParam("executeOperationJobs")
                .appendQueryParam("endpointId", request.getEndpointId())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.dataconnectivity.model.ExecuteOperationJobDetails.class,
                        CreateExecuteOperationJobResponse.Builder::executeOperationJobDetails)
                .handleResponseHeaderString("etag", CreateExecuteOperationJobResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", CreateExecuteOperationJobResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public CreateFolderResponse createFolder(CreateFolderRequest request) {

        Validate.notBlank(request.getRegistryId(), "registryId must not be blank");
        Objects.requireNonNull(request.getCreateFolderDetails(), "createFolderDetails is required");

        return clientCall(request, CreateFolderResponse::builder)
                .logger(LOG, "createFolder")
                .serviceDetails("DataConnectivityManagement", "CreateFolder", "")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(CreateFolderRequest::builder)
                .basePath("/20210217")
                .appendPathParam("registries")
                .appendPathParam(request.getRegistryId())
                .appendPathParam("folders")
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.dataconnectivity.model.Folder.class,
                        CreateFolderResponse.Builder::folder)
                .handleResponseHeaderString("etag", CreateFolderResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", CreateFolderResponse.Builder::opcRequestId)
                .operationUsesDefaultRetries()
                .callSync();
    }

    @Override
    public CreateFullPushDownTaskResponse createFullPushDownTask(
            CreateFullPushDownTaskRequest request) {

        Validate.notBlank(request.getRegistryId(), "registryId must not be blank");
        Objects.requireNonNull(
                request.getCreateFullPushDownTaskDetails(),
                "createFullPushDownTaskDetails is required");

        return clientCall(request, CreateFullPushDownTaskResponse::builder)
                .logger(LOG, "createFullPushDownTask")
                .serviceDetails("DataConnectivityManagement", "CreateFullPushDownTask", "")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(CreateFullPushDownTaskRequest::builder)
                .basePath("/20210217")
                .appendPathParam("registries")
                .appendPathParam(request.getRegistryId())
                .appendPathParam("actions")
                .appendPathParam("fullPushDownTask")
                .appendQueryParam("endpointId", request.getEndpointId())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("if-match", request.getIfMatch())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.dataconnectivity.model.FullPushDownTaskResponse.class,
                        CreateFullPushDownTaskResponse.Builder::fullPushDownTaskResponse)
                .handleResponseHeaderString("etag", CreateFullPushDownTaskResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", CreateFullPushDownTaskResponse.Builder::opcRequestId)
                .operationUsesDefaultRetries()
                .callSync();
    }

    @Override
    public CreateReferenceArtifactResponse createReferenceArtifact(
            CreateReferenceArtifactRequest request) {

        Validate.notBlank(request.getRegistryId(), "registryId must not be blank");

        Validate.notBlank(request.getDcmsArtifactId(), "dcmsArtifactId must not be blank");
        Objects.requireNonNull(
                request.getCreateReferenceArtifactDetails(),
                "createReferenceArtifactDetails is required");

        return clientCall(request, CreateReferenceArtifactResponse::builder)
                .logger(LOG, "createReferenceArtifact")
                .serviceDetails("DataConnectivityManagement", "CreateReferenceArtifact", "")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(CreateReferenceArtifactRequest::builder)
                .basePath("/20210217")
                .appendPathParam("registries")
                .appendPathParam(request.getRegistryId())
                .appendPathParam("dcmsArtifacts")
                .appendPathParam(request.getDcmsArtifactId())
                .appendPathParam("actions")
                .appendPathParam("referenceArtifact")
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("if-match", request.getIfMatch())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.dataconnectivity.model.ReferenceInfo.class,
                        CreateReferenceArtifactResponse.Builder::referenceInfo)
                .handleResponseHeaderString("etag", CreateReferenceArtifactResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", CreateReferenceArtifactResponse.Builder::opcRequestId)
                .operationUsesDefaultRetries()
                .callSync();
    }

    @Override
    public CreateRegistryResponse createRegistry(CreateRegistryRequest request) {
        Objects.requireNonNull(
                request.getCreateRegistryDetails(), "createRegistryDetails is required");

        return clientCall(request, CreateRegistryResponse::builder)
                .logger(LOG, "createRegistry")
                .serviceDetails("DataConnectivityManagement", "CreateRegistry", "")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(CreateRegistryRequest::builder)
                .basePath("/20210217")
                .appendPathParam("registries")
                .accept("application/json")
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .hasBody()
                .handleResponseHeaderString(
                        "opc-request-id", CreateRegistryResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-work-request-id", CreateRegistryResponse.Builder::opcWorkRequestId)
                .callSync();
    }

    @Override
    public CreateTestNetworkConnectivityResponse createTestNetworkConnectivity(
            CreateTestNetworkConnectivityRequest request) {

        Validate.notBlank(request.getRegistryId(), "registryId must not be blank");
        Objects.requireNonNull(
                request.getCreateTestNetworkConnectivityDetails(),
                "createTestNetworkConnectivityDetails is required");

        return clientCall(request, CreateTestNetworkConnectivityResponse::builder)
                .logger(LOG, "createTestNetworkConnectivity")
                .serviceDetails("DataConnectivityManagement", "CreateTestNetworkConnectivity", "")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(CreateTestNetworkConnectivityRequest::builder)
                .basePath("/20210217")
                .appendPathParam("registries")
                .appendPathParam(request.getRegistryId())
                .appendPathParam("actions")
                .appendPathParam("testNetworkConnectivity")
                .appendQueryParam("endpointId", request.getEndpointId())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("if-match", request.getIfMatch())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.dataconnectivity.model.TestNetworkConnectivity.class,
                        CreateTestNetworkConnectivityResponse.Builder::testNetworkConnectivity)
                .handleResponseHeaderString(
                        "etag", CreateTestNetworkConnectivityResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id",
                        CreateTestNetworkConnectivityResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public DeleteConnectionResponse deleteConnection(DeleteConnectionRequest request) {

        Validate.notBlank(request.getRegistryId(), "registryId must not be blank");

        Validate.notBlank(request.getConnectionKey(), "connectionKey must not be blank");

        return clientCall(request, DeleteConnectionResponse::builder)
                .logger(LOG, "deleteConnection")
                .serviceDetails("DataConnectivityManagement", "DeleteConnection", "")
                .method(com.oracle.bmc.http.client.Method.DELETE)
                .requestBuilder(DeleteConnectionRequest::builder)
                .basePath("/20210217")
                .appendPathParam("registries")
                .appendPathParam(request.getRegistryId())
                .appendPathParam("connections")
                .appendPathParam(request.getConnectionKey())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleResponseHeaderString(
                        "opc-request-id", DeleteConnectionResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public DeleteDataAssetResponse deleteDataAsset(DeleteDataAssetRequest request) {

        Validate.notBlank(request.getRegistryId(), "registryId must not be blank");

        Validate.notBlank(request.getDataAssetKey(), "dataAssetKey must not be blank");

        return clientCall(request, DeleteDataAssetResponse::builder)
                .logger(LOG, "deleteDataAsset")
                .serviceDetails("DataConnectivityManagement", "DeleteDataAsset", "")
                .method(com.oracle.bmc.http.client.Method.DELETE)
                .requestBuilder(DeleteDataAssetRequest::builder)
                .basePath("/20210217")
                .appendPathParam("registries")
                .appendPathParam(request.getRegistryId())
                .appendPathParam("dataAssets")
                .appendPathParam(request.getDataAssetKey())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleResponseHeaderString(
                        "opc-request-id", DeleteDataAssetResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public DeleteEndpointResponse deleteEndpoint(DeleteEndpointRequest request) {

        Validate.notBlank(request.getEndpointId(), "endpointId must not be blank");

        return clientCall(request, DeleteEndpointResponse::builder)
                .logger(LOG, "deleteEndpoint")
                .serviceDetails("DataConnectivityManagement", "DeleteEndpoint", "")
                .method(com.oracle.bmc.http.client.Method.DELETE)
                .requestBuilder(DeleteEndpointRequest::builder)
                .basePath("/20210217")
                .appendPathParam("endpoints")
                .appendPathParam(request.getEndpointId())
                .appendQueryParam("registryId", request.getRegistryId())
                .appendQueryParam("isForceOperation", request.getIsForceOperation())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleResponseHeaderString(
                        "opc-request-id", DeleteEndpointResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-work-request-id", DeleteEndpointResponse.Builder::opcWorkRequestId)
                .callSync();
    }

    @Override
    public DeleteFolderResponse deleteFolder(DeleteFolderRequest request) {

        Validate.notBlank(request.getRegistryId(), "registryId must not be blank");

        Validate.notBlank(request.getFolderKey(), "folderKey must not be blank");

        return clientCall(request, DeleteFolderResponse::builder)
                .logger(LOG, "deleteFolder")
                .serviceDetails("DataConnectivityManagement", "DeleteFolder", "")
                .method(com.oracle.bmc.http.client.Method.DELETE)
                .requestBuilder(DeleteFolderRequest::builder)
                .basePath("/20210217")
                .appendPathParam("registries")
                .appendPathParam(request.getRegistryId())
                .appendPathParam("folders")
                .appendPathParam(request.getFolderKey())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleResponseHeaderString(
                        "opc-request-id", DeleteFolderResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public DeleteNetworkConnectivityStatusResponse deleteNetworkConnectivityStatus(
            DeleteNetworkConnectivityStatusRequest request) {

        Validate.notBlank(request.getRegistryId(), "registryId must not be blank");

        Validate.notBlank(
                request.getNetworkValidationStatusKey(),
                "networkValidationStatusKey must not be blank");

        return clientCall(request, DeleteNetworkConnectivityStatusResponse::builder)
                .logger(LOG, "deleteNetworkConnectivityStatus")
                .serviceDetails("DataConnectivityManagement", "DeleteNetworkConnectivityStatus", "")
                .method(com.oracle.bmc.http.client.Method.DELETE)
                .requestBuilder(DeleteNetworkConnectivityStatusRequest::builder)
                .basePath("/20210217")
                .appendPathParam("registries")
                .appendPathParam(request.getRegistryId())
                .appendPathParam("networkConnectivityStatus")
                .appendPathParam(request.getNetworkValidationStatusKey())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("if-match", request.getIfMatch())
                .handleResponseHeaderString(
                        "opc-request-id",
                        DeleteNetworkConnectivityStatusResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public DeleteRegistryResponse deleteRegistry(DeleteRegistryRequest request) {

        Validate.notBlank(request.getRegistryId(), "registryId must not be blank");

        return clientCall(request, DeleteRegistryResponse::builder)
                .logger(LOG, "deleteRegistry")
                .serviceDetails("DataConnectivityManagement", "DeleteRegistry", "")
                .method(com.oracle.bmc.http.client.Method.DELETE)
                .requestBuilder(DeleteRegistryRequest::builder)
                .basePath("/20210217")
                .appendPathParam("registries")
                .appendPathParam(request.getRegistryId())
                .appendQueryParam("isForceOperation", request.getIsForceOperation())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleResponseHeaderString(
                        "opc-request-id", DeleteRegistryResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-work-request-id", DeleteRegistryResponse.Builder::opcWorkRequestId)
                .callSync();
    }

    @Override
    public DeriveEntitiesResponse deriveEntities(DeriveEntitiesRequest request) {

        Validate.notBlank(request.getRegistryId(), "registryId must not be blank");
        Objects.requireNonNull(
                request.getDeriveEntitiesDetails(), "deriveEntitiesDetails is required");

        return clientCall(request, DeriveEntitiesResponse::builder)
                .logger(LOG, "deriveEntities")
                .serviceDetails("DataConnectivityManagement", "DeriveEntities", "")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(DeriveEntitiesRequest::builder)
                .basePath("/20210217")
                .appendPathParam("registries")
                .appendPathParam(request.getRegistryId())
                .appendPathParam("actions")
                .appendPathParam("deriveEntities")
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.dataconnectivity.model.DeriveEntities.class,
                        DeriveEntitiesResponse.Builder::deriveEntities)
                .handleResponseHeaderString(
                        "opc-request-id", DeriveEntitiesResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public GetConnectionResponse getConnection(GetConnectionRequest request) {

        Validate.notBlank(request.getRegistryId(), "registryId must not be blank");

        Validate.notBlank(request.getConnectionKey(), "connectionKey must not be blank");

        return clientCall(request, GetConnectionResponse::builder)
                .logger(LOG, "getConnection")
                .serviceDetails("DataConnectivityManagement", "GetConnection", "")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetConnectionRequest::builder)
                .basePath("/20210217")
                .appendPathParam("registries")
                .appendPathParam(request.getRegistryId())
                .appendPathParam("connections")
                .appendPathParam(request.getConnectionKey())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.dataconnectivity.model.Connection.class,
                        GetConnectionResponse.Builder::connection)
                .handleResponseHeaderString("etag", GetConnectionResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", GetConnectionResponse.Builder::opcRequestId)
                .operationUsesDefaultRetries()
                .callSync();
    }

    @Override
    public GetDataAssetResponse getDataAsset(GetDataAssetRequest request) {

        Validate.notBlank(request.getRegistryId(), "registryId must not be blank");

        Validate.notBlank(request.getDataAssetKey(), "dataAssetKey must not be blank");

        return clientCall(request, GetDataAssetResponse::builder)
                .logger(LOG, "getDataAsset")
                .serviceDetails("DataConnectivityManagement", "GetDataAsset", "")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetDataAssetRequest::builder)
                .basePath("/20210217")
                .appendPathParam("registries")
                .appendPathParam(request.getRegistryId())
                .appendPathParam("dataAssets")
                .appendPathParam(request.getDataAssetKey())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.dataconnectivity.model.DataAsset.class,
                        GetDataAssetResponse.Builder::dataAsset)
                .handleResponseHeaderString("etag", GetDataAssetResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", GetDataAssetResponse.Builder::opcRequestId)
                .operationUsesDefaultRetries()
                .callSync();
    }

    @Override
    public GetDataEntityResponse getDataEntity(GetDataEntityRequest request) {

        Validate.notBlank(request.getRegistryId(), "registryId must not be blank");

        Validate.notBlank(request.getConnectionKey(), "connectionKey must not be blank");

        Validate.notBlank(request.getSchemaResourceName(), "schemaResourceName must not be blank");

        Validate.notBlank(request.getDataEntityKey(), "dataEntityKey must not be blank");

        return clientCall(request, GetDataEntityResponse::builder)
                .logger(LOG, "getDataEntity")
                .serviceDetails("DataConnectivityManagement", "GetDataEntity", "")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetDataEntityRequest::builder)
                .basePath("/20210217")
                .appendPathParam("registries")
                .appendPathParam(request.getRegistryId())
                .appendPathParam("connections")
                .appendPathParam(request.getConnectionKey())
                .appendPathParam("schemas")
                .appendPathParam(request.getSchemaResourceName())
                .appendPathParam("dataEntities")
                .appendPathParam(request.getDataEntityKey())
                .appendQueryParam("endpointId", request.getEndpointId())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.dataconnectivity.model.DataEntity.class,
                        GetDataEntityResponse.Builder::dataEntity)
                .handleResponseHeaderString(
                        "opc-request-id", GetDataEntityResponse.Builder::opcRequestId)
                .operationUsesDefaultRetries()
                .callSync();
    }

    @Override
    public GetEndpointResponse getEndpoint(GetEndpointRequest request) {

        Validate.notBlank(request.getEndpointId(), "endpointId must not be blank");

        return clientCall(request, GetEndpointResponse::builder)
                .logger(LOG, "getEndpoint")
                .serviceDetails("DataConnectivityManagement", "GetEndpoint", "")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetEndpointRequest::builder)
                .basePath("/20210217")
                .appendPathParam("endpoints")
                .appendPathParam(request.getEndpointId())
                .appendQueryParam("registryId", request.getRegistryId())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.dataconnectivity.model.Endpoint.class,
                        GetEndpointResponse.Builder::endpoint)
                .handleResponseHeaderString("etag", GetEndpointResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", GetEndpointResponse.Builder::opcRequestId)
                .operationUsesDefaultRetries()
                .callSync();
    }

    @Override
    public GetEngineConfigurationsResponse getEngineConfigurations(
            GetEngineConfigurationsRequest request) {

        Validate.notBlank(request.getRegistryId(), "registryId must not be blank");

        Validate.notBlank(request.getConnectionKey(), "connectionKey must not be blank");

        return clientCall(request, GetEngineConfigurationsResponse::builder)
                .logger(LOG, "getEngineConfigurations")
                .serviceDetails("DataConnectivityManagement", "GetEngineConfigurations", "")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetEngineConfigurationsRequest::builder)
                .basePath("/20210217")
                .appendPathParam("registries")
                .appendPathParam(request.getRegistryId())
                .appendPathParam("connections")
                .appendPathParam(request.getConnectionKey())
                .appendPathParam("engineConfigurations")
                .appendEnumQueryParam("engineTypeQueryParam", request.getEngineTypeQueryParam())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.dataconnectivity.model.ConfigDetails.class,
                        GetEngineConfigurationsResponse.Builder::configDetails)
                .handleResponseHeaderString(
                        "opc-request-id", GetEngineConfigurationsResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public GetExecuteOperationJobResponse getExecuteOperationJob(
            GetExecuteOperationJobRequest request) {

        Validate.notBlank(request.getRegistryId(), "registryId must not be blank");

        Validate.notBlank(request.getConnectionKey(), "connectionKey must not be blank");

        Validate.notBlank(request.getSchemaResourceName(), "schemaResourceName must not be blank");

        Validate.notBlank(
                request.getExecuteOperationJobKey(), "executeOperationJobKey must not be blank");

        return clientCall(request, GetExecuteOperationJobResponse::builder)
                .logger(LOG, "getExecuteOperationJob")
                .serviceDetails("DataConnectivityManagement", "GetExecuteOperationJob", "")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetExecuteOperationJobRequest::builder)
                .basePath("/20210217")
                .appendPathParam("registries")
                .appendPathParam(request.getRegistryId())
                .appendPathParam("connections")
                .appendPathParam(request.getConnectionKey())
                .appendPathParam("schemas")
                .appendPathParam(request.getSchemaResourceName())
                .appendPathParam("executeOperationJobs")
                .appendPathParam(request.getExecuteOperationJobKey())
                .appendQueryParam("endpointId", request.getEndpointId())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.dataconnectivity.model.ExecuteOperationJob.class,
                        GetExecuteOperationJobResponse.Builder::executeOperationJob)
                .handleResponseHeaderString(
                        "opc-request-id", GetExecuteOperationJobResponse.Builder::opcRequestId)
                .operationUsesDefaultRetries()
                .callSync();
    }

    @Override
    public GetFolderResponse getFolder(GetFolderRequest request) {

        Validate.notBlank(request.getRegistryId(), "registryId must not be blank");

        Validate.notBlank(request.getFolderKey(), "folderKey must not be blank");

        return clientCall(request, GetFolderResponse::builder)
                .logger(LOG, "getFolder")
                .serviceDetails("DataConnectivityManagement", "GetFolder", "")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetFolderRequest::builder)
                .basePath("/20210217")
                .appendPathParam("registries")
                .appendPathParam(request.getRegistryId())
                .appendPathParam("folders")
                .appendPathParam(request.getFolderKey())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.dataconnectivity.model.Folder.class,
                        GetFolderResponse.Builder::folder)
                .handleResponseHeaderString("etag", GetFolderResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", GetFolderResponse.Builder::opcRequestId)
                .operationUsesDefaultRetries()
                .callSync();
    }

    @Override
    public GetNetworkConnectivityStatusResponse getNetworkConnectivityStatus(
            GetNetworkConnectivityStatusRequest request) {

        Validate.notBlank(request.getRegistryId(), "registryId must not be blank");

        Validate.notBlank(request.getDataAssetKey(), "dataAssetKey must not be blank");

        return clientCall(request, GetNetworkConnectivityStatusResponse::builder)
                .logger(LOG, "getNetworkConnectivityStatus")
                .serviceDetails("DataConnectivityManagement", "GetNetworkConnectivityStatus", "")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetNetworkConnectivityStatusRequest::builder)
                .basePath("/20210217")
                .appendPathParam("registries")
                .appendPathParam(request.getRegistryId())
                .appendPathParam("dataAssets")
                .appendPathParam(request.getDataAssetKey())
                .appendPathParam("networkConnectivityStatus")
                .appendQueryParam("endpointId", request.getEndpointId())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("if-match", request.getIfMatch())
                .handleBody(
                        com.oracle.bmc.dataconnectivity.model.NetworkConnectivityStatus.class,
                        GetNetworkConnectivityStatusResponse.Builder::networkConnectivityStatus)
                .handleResponseHeaderString(
                        "etag", GetNetworkConnectivityStatusResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id",
                        GetNetworkConnectivityStatusResponse.Builder::opcRequestId)
                .operationUsesDefaultRetries()
                .callSync();
    }

    @Override
    public GetOperationResponse getOperation(GetOperationRequest request) {

        Validate.notBlank(request.getRegistryId(), "registryId must not be blank");

        Validate.notBlank(request.getConnectionKey(), "connectionKey must not be blank");

        Validate.notBlank(request.getSchemaResourceName(), "schemaResourceName must not be blank");

        Validate.notBlank(
                request.getOperationResourceName(), "operationResourceName must not be blank");

        return clientCall(request, GetOperationResponse::builder)
                .logger(LOG, "getOperation")
                .serviceDetails("DataConnectivityManagement", "GetOperation", "")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetOperationRequest::builder)
                .basePath("/20210217")
                .appendPathParam("registries")
                .appendPathParam(request.getRegistryId())
                .appendPathParam("connections")
                .appendPathParam(request.getConnectionKey())
                .appendPathParam("schemas")
                .appendPathParam(request.getSchemaResourceName())
                .appendPathParam("operations")
                .appendPathParam(request.getOperationResourceName())
                .appendQueryParam("endpointId", request.getEndpointId())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.dataconnectivity.model.Operation.class,
                        GetOperationResponse.Builder::operation)
                .handleResponseHeaderString(
                        "opc-request-id", GetOperationResponse.Builder::opcRequestId)
                .operationUsesDefaultRetries()
                .callSync();
    }

    @Override
    public GetRegistryResponse getRegistry(GetRegistryRequest request) {

        Validate.notBlank(request.getRegistryId(), "registryId must not be blank");

        return clientCall(request, GetRegistryResponse::builder)
                .logger(LOG, "getRegistry")
                .serviceDetails("DataConnectivityManagement", "GetRegistry", "")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetRegistryRequest::builder)
                .basePath("/20210217")
                .appendPathParam("registries")
                .appendPathParam(request.getRegistryId())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.dataconnectivity.model.Registry.class,
                        GetRegistryResponse.Builder::registry)
                .handleResponseHeaderString("etag", GetRegistryResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", GetRegistryResponse.Builder::opcRequestId)
                .operationUsesDefaultRetries()
                .callSync();
    }

    @Override
    public GetSchemaResponse getSchema(GetSchemaRequest request) {

        Validate.notBlank(request.getRegistryId(), "registryId must not be blank");

        Validate.notBlank(request.getConnectionKey(), "connectionKey must not be blank");

        Validate.notBlank(request.getSchemaResourceName(), "schemaResourceName must not be blank");

        return clientCall(request, GetSchemaResponse::builder)
                .logger(LOG, "getSchema")
                .serviceDetails("DataConnectivityManagement", "GetSchema", "")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetSchemaRequest::builder)
                .basePath("/20210217")
                .appendPathParam("registries")
                .appendPathParam(request.getRegistryId())
                .appendPathParam("connections")
                .appendPathParam(request.getConnectionKey())
                .appendPathParam("schemas")
                .appendPathParam(request.getSchemaResourceName())
                .appendQueryParam("endpointId", request.getEndpointId())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.dataconnectivity.model.Schema.class,
                        GetSchemaResponse.Builder::schema)
                .handleResponseHeaderString(
                        "opc-request-id", GetSchemaResponse.Builder::opcRequestId)
                .operationUsesDefaultRetries()
                .callSync();
    }

    @Override
    public GetTypeResponse getType(GetTypeRequest request) {

        Validate.notBlank(request.getRegistryId(), "registryId must not be blank");

        Validate.notBlank(request.getTypeKey(), "typeKey must not be blank");

        return clientCall(request, GetTypeResponse::builder)
                .logger(LOG, "getType")
                .serviceDetails("DataConnectivityManagement", "GetType", "")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetTypeRequest::builder)
                .basePath("/20210217")
                .appendPathParam("registries")
                .appendPathParam(request.getRegistryId())
                .appendPathParam("types")
                .appendPathParam(request.getTypeKey())
                .appendListQueryParam(
                        "fields",
                        request.getFields(),
                        com.oracle.bmc.util.internal.CollectionFormatType.Multi)
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.dataconnectivity.model.Type.class,
                        GetTypeResponse.Builder::type)
                .handleResponseHeaderString("etag", GetTypeResponse.Builder::etag)
                .handleResponseHeaderString("opc-request-id", GetTypeResponse.Builder::opcRequestId)
                .operationUsesDefaultRetries()
                .callSync();
    }

    @Override
    public GetWorkRequestResponse getWorkRequest(GetWorkRequestRequest request) {

        Validate.notBlank(request.getWorkRequestId(), "workRequestId must not be blank");

        return clientCall(request, GetWorkRequestResponse::builder)
                .logger(LOG, "getWorkRequest")
                .serviceDetails("DataConnectivityManagement", "GetWorkRequest", "")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetWorkRequestRequest::builder)
                .basePath("/20210217")
                .appendPathParam("workRequests")
                .appendPathParam(request.getWorkRequestId())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.dataconnectivity.model.WorkRequest.class,
                        GetWorkRequestResponse.Builder::workRequest)
                .handleResponseHeaderString("etag", GetWorkRequestResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", GetWorkRequestResponse.Builder::opcRequestId)
                .handleResponseHeaderInteger(
                        "retry-after", GetWorkRequestResponse.Builder::retryAfter)
                .operationUsesDefaultRetries()
                .callSync();
    }

    @Override
    public ListConnectionsResponse listConnections(ListConnectionsRequest request) {

        Validate.notBlank(request.getRegistryId(), "registryId must not be blank");
        Objects.requireNonNull(request.getDataAssetKey(), "dataAssetKey is required");

        return clientCall(request, ListConnectionsResponse::builder)
                .logger(LOG, "listConnections")
                .serviceDetails("DataConnectivityManagement", "ListConnections", "")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListConnectionsRequest::builder)
                .basePath("/20210217")
                .appendPathParam("registries")
                .appendPathParam(request.getRegistryId())
                .appendPathParam("connections")
                .appendQueryParam("dataAssetKey", request.getDataAssetKey())
                .appendQueryParam("name", request.getName())
                .appendQueryParam("page", request.getPage())
                .appendQueryParam("limit", request.getLimit())
                .appendListQueryParam(
                        "fields",
                        request.getFields(),
                        com.oracle.bmc.util.internal.CollectionFormatType.Multi)
                .appendQueryParam("type", request.getType())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .appendEnumQueryParam("favoritesQueryParam", request.getFavoritesQueryParam())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.dataconnectivity.model.ConnectionSummaryCollection.class,
                        ListConnectionsResponse.Builder::connectionSummaryCollection)
                .handleResponseHeaderString(
                        "opc-request-id", ListConnectionsResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListConnectionsResponse.Builder::opcNextPage)
                .handleResponseHeaderString(
                        "opc-prev-page", ListConnectionsResponse.Builder::opcPrevPage)
                .handleResponseHeaderInteger(
                        "opc-total-items", ListConnectionsResponse.Builder::opcTotalItems)
                .operationUsesDefaultRetries()
                .callSync();
    }

    @Override
    public ListDataAssetsResponse listDataAssets(ListDataAssetsRequest request) {

        Validate.notBlank(request.getRegistryId(), "registryId must not be blank");

        return clientCall(request, ListDataAssetsResponse::builder)
                .logger(LOG, "listDataAssets")
                .serviceDetails("DataConnectivityManagement", "ListDataAssets", "")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListDataAssetsRequest::builder)
                .basePath("/20210217")
                .appendPathParam("registries")
                .appendPathParam(request.getRegistryId())
                .appendPathParam("dataAssets")
                .appendQueryParam("page", request.getPage())
                .appendQueryParam("limit", request.getLimit())
                .appendListQueryParam(
                        "fields",
                        request.getFields(),
                        com.oracle.bmc.util.internal.CollectionFormatType.Multi)
                .appendListQueryParam(
                        "includeTypes",
                        request.getIncludeTypes(),
                        com.oracle.bmc.util.internal.CollectionFormatType.Multi)
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .appendQueryParam("name", request.getName())
                .appendListQueryParam(
                        "excludeTypes",
                        request.getExcludeTypes(),
                        com.oracle.bmc.util.internal.CollectionFormatType.Multi)
                .appendEnumQueryParam("favoritesQueryParam", request.getFavoritesQueryParam())
                .appendQueryParam("folderId", request.getFolderId())
                .appendListQueryParam(
                        "endpointIds",
                        request.getEndpointIds(),
                        com.oracle.bmc.util.internal.CollectionFormatType.Multi)
                .appendListQueryParam(
                        "excludeEndpointIds",
                        request.getExcludeEndpointIds(),
                        com.oracle.bmc.util.internal.CollectionFormatType.Multi)
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.dataconnectivity.model.DataAssetSummaryCollection.class,
                        ListDataAssetsResponse.Builder::dataAssetSummaryCollection)
                .handleResponseHeaderString(
                        "opc-request-id", ListDataAssetsResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListDataAssetsResponse.Builder::opcNextPage)
                .handleResponseHeaderString(
                        "opc-prev-page", ListDataAssetsResponse.Builder::opcPrevPage)
                .handleResponseHeaderInteger(
                        "opc-total-items", ListDataAssetsResponse.Builder::opcTotalItems)
                .operationUsesDefaultRetries()
                .callSync();
    }

    @Override
    public ListDataEntitiesResponse listDataEntities(ListDataEntitiesRequest request) {

        Validate.notBlank(request.getRegistryId(), "registryId must not be blank");

        Validate.notBlank(request.getConnectionKey(), "connectionKey must not be blank");

        Validate.notBlank(request.getSchemaResourceName(), "schemaResourceName must not be blank");

        return clientCall(request, ListDataEntitiesResponse::builder)
                .logger(LOG, "listDataEntities")
                .serviceDetails("DataConnectivityManagement", "ListDataEntities", "")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListDataEntitiesRequest::builder)
                .basePath("/20210217")
                .appendPathParam("registries")
                .appendPathParam(request.getRegistryId())
                .appendPathParam("connections")
                .appendPathParam(request.getConnectionKey())
                .appendPathParam("schemas")
                .appendPathParam(request.getSchemaResourceName())
                .appendPathParam("dataEntities")
                .appendQueryParam("name", request.getName())
                .appendQueryParam("page", request.getPage())
                .appendQueryParam("type", request.getType())
                .appendQueryParam("limit", request.getLimit())
                .appendListQueryParam(
                        "fields",
                        request.getFields(),
                        com.oracle.bmc.util.internal.CollectionFormatType.Multi)
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .appendEnumQueryParam("apiMode", request.getApiMode())
                .appendListQueryParam(
                        "nameList",
                        request.getNameList(),
                        com.oracle.bmc.util.internal.CollectionFormatType.Multi)
                .appendQueryParam("isPattern", request.getIsPattern())
                .appendQueryParam("endpointId", request.getEndpointId())
                .appendListQueryParam(
                        "includeTypes",
                        request.getIncludeTypes(),
                        com.oracle.bmc.util.internal.CollectionFormatType.Multi)
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.dataconnectivity.model.DataEntitySummaryCollection.class,
                        ListDataEntitiesResponse.Builder::dataEntitySummaryCollection)
                .handleResponseHeaderString(
                        "opc-request-id", ListDataEntitiesResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListDataEntitiesResponse.Builder::opcNextPage)
                .handleResponseHeaderString(
                        "opc-prev-page", ListDataEntitiesResponse.Builder::opcPrevPage)
                .handleResponseHeaderInteger(
                        "opc-total-items", ListDataEntitiesResponse.Builder::opcTotalItems)
                .operationUsesDefaultRetries()
                .callSync();
    }

    @Override
    public ListEndpointsResponse listEndpoints(ListEndpointsRequest request) {
        Objects.requireNonNull(request.getCompartmentId(), "compartmentId is required");

        return clientCall(request, ListEndpointsResponse::builder)
                .logger(LOG, "listEndpoints")
                .serviceDetails("DataConnectivityManagement", "ListEndpoints", "")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListEndpointsRequest::builder)
                .basePath("/20210217")
                .appendPathParam("endpoints")
                .appendQueryParam("compartmentId", request.getCompartmentId())
                .appendQueryParam("registryId", request.getRegistryId())
                .appendQueryParam("name", request.getName())
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .appendEnumQueryParam("lifecycleState", request.getLifecycleState())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.dataconnectivity.model.EndpointSummaryCollection.class,
                        ListEndpointsResponse.Builder::endpointSummaryCollection)
                .handleResponseHeaderString(
                        "opc-request-id", ListEndpointsResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListEndpointsResponse.Builder::opcNextPage)
                .operationUsesDefaultRetries()
                .callSync();
    }

    @Override
    public ListFoldersResponse listFolders(ListFoldersRequest request) {

        Validate.notBlank(request.getRegistryId(), "registryId must not be blank");

        return clientCall(request, ListFoldersResponse::builder)
                .logger(LOG, "listFolders")
                .serviceDetails("DataConnectivityManagement", "ListFolders", "")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListFoldersRequest::builder)
                .basePath("/20210217")
                .appendPathParam("registries")
                .appendPathParam(request.getRegistryId())
                .appendPathParam("folders")
                .appendQueryParam("name", request.getName())
                .appendQueryParam("page", request.getPage())
                .appendQueryParam("limit", request.getLimit())
                .appendListQueryParam(
                        "fields",
                        request.getFields(),
                        com.oracle.bmc.util.internal.CollectionFormatType.Multi)
                .appendQueryParam("type", request.getType())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .appendEnumQueryParam("favoritesQueryParam", request.getFavoritesQueryParam())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.dataconnectivity.model.FolderSummaryCollection.class,
                        ListFoldersResponse.Builder::folderSummaryCollection)
                .handleResponseHeaderString(
                        "opc-request-id", ListFoldersResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListFoldersResponse.Builder::opcNextPage)
                .handleResponseHeaderString(
                        "opc-prev-page", ListFoldersResponse.Builder::opcPrevPage)
                .handleResponseHeaderInteger(
                        "opc-total-items", ListFoldersResponse.Builder::opcTotalItems)
                .operationUsesDefaultRetries()
                .callSync();
    }

    @Override
    public ListOperationsResponse listOperations(ListOperationsRequest request) {

        Validate.notBlank(request.getRegistryId(), "registryId must not be blank");

        Validate.notBlank(request.getConnectionKey(), "connectionKey must not be blank");

        Validate.notBlank(request.getSchemaResourceName(), "schemaResourceName must not be blank");

        return clientCall(request, ListOperationsResponse::builder)
                .logger(LOG, "listOperations")
                .serviceDetails("DataConnectivityManagement", "ListOperations", "")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListOperationsRequest::builder)
                .basePath("/20210217")
                .appendPathParam("registries")
                .appendPathParam(request.getRegistryId())
                .appendPathParam("connections")
                .appendPathParam(request.getConnectionKey())
                .appendPathParam("schemas")
                .appendPathParam(request.getSchemaResourceName())
                .appendPathParam("operations")
                .appendQueryParam("name", request.getName())
                .appendQueryParam("page", request.getPage())
                .appendQueryParam("limit", request.getLimit())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .appendQueryParam("endpointId", request.getEndpointId())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.dataconnectivity.model.OperationSummaryCollection.class,
                        ListOperationsResponse.Builder::operationSummaryCollection)
                .handleResponseHeaderString(
                        "opc-request-id", ListOperationsResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListOperationsResponse.Builder::opcNextPage)
                .handleResponseHeaderString(
                        "opc-prev-page", ListOperationsResponse.Builder::opcPrevPage)
                .handleResponseHeaderInteger(
                        "opc-total-items", ListOperationsResponse.Builder::opcTotalItems)
                .operationUsesDefaultRetries()
                .callSync();
    }

    @Override
    public ListReferenceArtifactsResponse listReferenceArtifacts(
            ListReferenceArtifactsRequest request) {

        Validate.notBlank(request.getRegistryId(), "registryId must not be blank");

        Validate.notBlank(request.getDcmsArtifactId(), "dcmsArtifactId must not be blank");

        return clientCall(request, ListReferenceArtifactsResponse::builder)
                .logger(LOG, "listReferenceArtifacts")
                .serviceDetails("DataConnectivityManagement", "ListReferenceArtifacts", "")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListReferenceArtifactsRequest::builder)
                .basePath("/20210217")
                .appendPathParam("registries")
                .appendPathParam(request.getRegistryId())
                .appendPathParam("dcmsArtifacts")
                .appendPathParam(request.getDcmsArtifactId())
                .appendPathParam("referenceArtifacts")
                .appendQueryParam("page", request.getPage())
                .appendQueryParam("limit", request.getLimit())
                .appendListQueryParam(
                        "fields",
                        request.getFields(),
                        com.oracle.bmc.util.internal.CollectionFormatType.Multi)
                .appendQueryParam("type", request.getType())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .appendQueryParam("name", request.getName())
                .appendListQueryParam(
                        "excludeTypes",
                        request.getExcludeTypes(),
                        com.oracle.bmc.util.internal.CollectionFormatType.Multi)
                .appendEnumQueryParam("favoritesQueryParam", request.getFavoritesQueryParam())
                .appendQueryParam("serviceArtifactId", request.getServiceArtifactId())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.dataconnectivity.model.ReferenceArtifactSummaryCollection
                                .class,
                        ListReferenceArtifactsResponse.Builder::referenceArtifactSummaryCollection)
                .handleResponseHeaderString(
                        "opc-request-id", ListReferenceArtifactsResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListReferenceArtifactsResponse.Builder::opcNextPage)
                .handleResponseHeaderString(
                        "opc-prev-page", ListReferenceArtifactsResponse.Builder::opcPrevPage)
                .handleResponseHeaderInteger(
                        "opc-total-items", ListReferenceArtifactsResponse.Builder::opcTotalItems)
                .operationUsesDefaultRetries()
                .callSync();
    }

    @Override
    public ListRegistriesResponse listRegistries(ListRegistriesRequest request) {
        Objects.requireNonNull(request.getCompartmentId(), "compartmentId is required");

        return clientCall(request, ListRegistriesResponse::builder)
                .logger(LOG, "listRegistries")
                .serviceDetails("DataConnectivityManagement", "ListRegistries", "")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListRegistriesRequest::builder)
                .basePath("/20210217")
                .appendPathParam("registries")
                .appendQueryParam("compartmentId", request.getCompartmentId())
                .appendQueryParam("name", request.getName())
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .appendQueryParam("isDeepLookup", request.getIsDeepLookup())
                .appendEnumQueryParam("lifecycleState", request.getLifecycleState())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.dataconnectivity.model.RegistrySummaryCollection.class,
                        ListRegistriesResponse.Builder::registrySummaryCollection)
                .handleResponseHeaderString(
                        "opc-request-id", ListRegistriesResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListRegistriesResponse.Builder::opcNextPage)
                .operationUsesDefaultRetries()
                .callSync();
    }

    @Override
    public ListSchemasResponse listSchemas(ListSchemasRequest request) {

        Validate.notBlank(request.getRegistryId(), "registryId must not be blank");

        Validate.notBlank(request.getConnectionKey(), "connectionKey must not be blank");

        return clientCall(request, ListSchemasResponse::builder)
                .logger(LOG, "listSchemas")
                .serviceDetails("DataConnectivityManagement", "ListSchemas", "")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListSchemasRequest::builder)
                .basePath("/20210217")
                .appendPathParam("registries")
                .appendPathParam(request.getRegistryId())
                .appendPathParam("connections")
                .appendPathParam(request.getConnectionKey())
                .appendPathParam("schemas")
                .appendQueryParam("page", request.getPage())
                .appendQueryParam("limit", request.getLimit())
                .appendListQueryParam(
                        "fields",
                        request.getFields(),
                        com.oracle.bmc.util.internal.CollectionFormatType.Multi)
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .appendQueryParam("schemaResourceKey", request.getSchemaResourceKey())
                .appendQueryParam("name", request.getName())
                .appendListQueryParam(
                        "nameList",
                        request.getNameList(),
                        com.oracle.bmc.util.internal.CollectionFormatType.Multi)
                .appendQueryParam("endpointId", request.getEndpointId())
                .appendListQueryParam(
                        "includeTypes",
                        request.getIncludeTypes(),
                        com.oracle.bmc.util.internal.CollectionFormatType.Multi)
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.dataconnectivity.model.SchemaSummaryCollection.class,
                        ListSchemasResponse.Builder::schemaSummaryCollection)
                .handleResponseHeaderString(
                        "opc-request-id", ListSchemasResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListSchemasResponse.Builder::opcNextPage)
                .handleResponseHeaderString(
                        "opc-prev-page", ListSchemasResponse.Builder::opcPrevPage)
                .handleResponseHeaderInteger(
                        "opc-total-items", ListSchemasResponse.Builder::opcTotalItems)
                .operationUsesDefaultRetries()
                .callSync();
    }

    @Override
    public ListTypesResponse listTypes(ListTypesRequest request) {

        Validate.notBlank(request.getRegistryId(), "registryId must not be blank");

        return clientCall(request, ListTypesResponse::builder)
                .logger(LOG, "listTypes")
                .serviceDetails("DataConnectivityManagement", "ListTypes", "")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListTypesRequest::builder)
                .basePath("/20210217")
                .appendPathParam("registries")
                .appendPathParam(request.getRegistryId())
                .appendPathParam("types")
                .appendQueryParam("page", request.getPage())
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("type", request.getType())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .appendQueryParam("name", request.getName())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.dataconnectivity.model.TypesSummaryCollection.class,
                        ListTypesResponse.Builder::typesSummaryCollection)
                .handleResponseHeaderString(
                        "opc-request-id", ListTypesResponse.Builder::opcRequestId)
                .handleResponseHeaderString("opc-next-page", ListTypesResponse.Builder::opcNextPage)
                .handleResponseHeaderString("opc-prev-page", ListTypesResponse.Builder::opcPrevPage)
                .handleResponseHeaderInteger(
                        "opc-total-items", ListTypesResponse.Builder::opcTotalItems)
                .operationUsesDefaultRetries()
                .callSync();
    }

    @Override
    public ListWorkRequestErrorsResponse listWorkRequestErrors(
            ListWorkRequestErrorsRequest request) {

        Validate.notBlank(request.getWorkRequestId(), "workRequestId must not be blank");

        return clientCall(request, ListWorkRequestErrorsResponse::builder)
                .logger(LOG, "listWorkRequestErrors")
                .serviceDetails("DataConnectivityManagement", "ListWorkRequestErrors", "")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListWorkRequestErrorsRequest::builder)
                .basePath("/20210217")
                .appendPathParam("workRequests")
                .appendPathParam(request.getWorkRequestId())
                .appendPathParam("workRequestErrors")
                .appendQueryParam("page", request.getPage())
                .appendQueryParam("limit", request.getLimit())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.dataconnectivity.model.WorkRequestErrorCollection.class,
                        ListWorkRequestErrorsResponse.Builder::workRequestErrorCollection)
                .handleResponseHeaderString(
                        "opc-request-id", ListWorkRequestErrorsResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListWorkRequestErrorsResponse.Builder::opcNextPage)
                .operationUsesDefaultRetries()
                .callSync();
    }

    @Override
    public ListWorkRequestLogsResponse listWorkRequestLogs(ListWorkRequestLogsRequest request) {

        Validate.notBlank(request.getWorkRequestId(), "workRequestId must not be blank");

        return clientCall(request, ListWorkRequestLogsResponse::builder)
                .logger(LOG, "listWorkRequestLogs")
                .serviceDetails("DataConnectivityManagement", "ListWorkRequestLogs", "")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListWorkRequestLogsRequest::builder)
                .basePath("/20210217")
                .appendPathParam("workRequests")
                .appendPathParam(request.getWorkRequestId())
                .appendPathParam("logs")
                .appendQueryParam("page", request.getPage())
                .appendQueryParam("limit", request.getLimit())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.dataconnectivity.model.WorkRequestLogCollection.class,
                        ListWorkRequestLogsResponse.Builder::workRequestLogCollection)
                .handleResponseHeaderString(
                        "opc-request-id", ListWorkRequestLogsResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListWorkRequestLogsResponse.Builder::opcNextPage)
                .operationUsesDefaultRetries()
                .callSync();
    }

    @Override
    public ListWorkRequestsResponse listWorkRequests(ListWorkRequestsRequest request) {
        Objects.requireNonNull(request.getCompartmentId(), "compartmentId is required");

        return clientCall(request, ListWorkRequestsResponse::builder)
                .logger(LOG, "listWorkRequests")
                .serviceDetails("DataConnectivityManagement", "ListWorkRequests", "")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListWorkRequestsRequest::builder)
                .basePath("/20210217")
                .appendPathParam("workRequests")
                .appendQueryParam("compartmentId", request.getCompartmentId())
                .appendQueryParam("registryId", request.getRegistryId())
                .appendEnumQueryParam("workRequestStatus", request.getWorkRequestStatus())
                .appendQueryParam("page", request.getPage())
                .appendQueryParam("limit", request.getLimit())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.dataconnectivity.model.WorkRequestSummaryCollection.class,
                        ListWorkRequestsResponse.Builder::workRequestSummaryCollection)
                .handleResponseHeaderString(
                        "opc-request-id", ListWorkRequestsResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListWorkRequestsResponse.Builder::opcNextPage)
                .operationUsesDefaultRetries()
                .callSync();
    }

    @Override
    public UpdateConnectionResponse updateConnection(UpdateConnectionRequest request) {

        Validate.notBlank(request.getRegistryId(), "registryId must not be blank");

        Validate.notBlank(request.getConnectionKey(), "connectionKey must not be blank");
        Objects.requireNonNull(
                request.getUpdateConnectionDetails(), "updateConnectionDetails is required");

        return clientCall(request, UpdateConnectionResponse::builder)
                .logger(LOG, "updateConnection")
                .serviceDetails("DataConnectivityManagement", "UpdateConnection", "")
                .method(com.oracle.bmc.http.client.Method.PUT)
                .requestBuilder(UpdateConnectionRequest::builder)
                .basePath("/20210217")
                .appendPathParam("registries")
                .appendPathParam(request.getRegistryId())
                .appendPathParam("connections")
                .appendPathParam(request.getConnectionKey())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("if-match", request.getIfMatch())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.dataconnectivity.model.Connection.class,
                        UpdateConnectionResponse.Builder::connection)
                .handleResponseHeaderString("etag", UpdateConnectionResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", UpdateConnectionResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public UpdateDataAssetResponse updateDataAsset(UpdateDataAssetRequest request) {

        Validate.notBlank(request.getRegistryId(), "registryId must not be blank");

        Validate.notBlank(request.getDataAssetKey(), "dataAssetKey must not be blank");
        Objects.requireNonNull(
                request.getUpdateDataAssetDetails(), "updateDataAssetDetails is required");

        return clientCall(request, UpdateDataAssetResponse::builder)
                .logger(LOG, "updateDataAsset")
                .serviceDetails("DataConnectivityManagement", "UpdateDataAsset", "")
                .method(com.oracle.bmc.http.client.Method.PUT)
                .requestBuilder(UpdateDataAssetRequest::builder)
                .basePath("/20210217")
                .appendPathParam("registries")
                .appendPathParam(request.getRegistryId())
                .appendPathParam("dataAssets")
                .appendPathParam(request.getDataAssetKey())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("if-match", request.getIfMatch())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.dataconnectivity.model.DataAsset.class,
                        UpdateDataAssetResponse.Builder::dataAsset)
                .handleResponseHeaderString("etag", UpdateDataAssetResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", UpdateDataAssetResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public UpdateEndpointResponse updateEndpoint(UpdateEndpointRequest request) {

        Validate.notBlank(request.getEndpointId(), "endpointId must not be blank");
        Objects.requireNonNull(
                request.getUpdateEndpointDetails(), "updateEndpointDetails is required");

        return clientCall(request, UpdateEndpointResponse::builder)
                .logger(LOG, "updateEndpoint")
                .serviceDetails("DataConnectivityManagement", "UpdateEndpoint", "")
                .method(com.oracle.bmc.http.client.Method.PUT)
                .requestBuilder(UpdateEndpointRequest::builder)
                .basePath("/20210217")
                .appendPathParam("endpoints")
                .appendPathParam(request.getEndpointId())
                .appendQueryParam("registryId", request.getRegistryId())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.dataconnectivity.model.Endpoint.class,
                        UpdateEndpointResponse.Builder::endpoint)
                .handleResponseHeaderString("etag", UpdateEndpointResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", UpdateEndpointResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-work-request-id", UpdateEndpointResponse.Builder::opcWorkRequestId)
                .callSync();
    }

    @Override
    public UpdateFolderResponse updateFolder(UpdateFolderRequest request) {

        Validate.notBlank(request.getRegistryId(), "registryId must not be blank");

        Validate.notBlank(request.getFolderKey(), "folderKey must not be blank");
        Objects.requireNonNull(request.getUpdateFolderDetails(), "updateFolderDetails is required");

        return clientCall(request, UpdateFolderResponse::builder)
                .logger(LOG, "updateFolder")
                .serviceDetails("DataConnectivityManagement", "UpdateFolder", "")
                .method(com.oracle.bmc.http.client.Method.PUT)
                .requestBuilder(UpdateFolderRequest::builder)
                .basePath("/20210217")
                .appendPathParam("registries")
                .appendPathParam(request.getRegistryId())
                .appendPathParam("folders")
                .appendPathParam(request.getFolderKey())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("if-match", request.getIfMatch())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.dataconnectivity.model.Folder.class,
                        UpdateFolderResponse.Builder::folder)
                .handleResponseHeaderString("etag", UpdateFolderResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", UpdateFolderResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public UpdateRegistryResponse updateRegistry(UpdateRegistryRequest request) {

        Validate.notBlank(request.getRegistryId(), "registryId must not be blank");
        Objects.requireNonNull(
                request.getUpdateRegistryDetails(), "updateRegistryDetails is required");

        return clientCall(request, UpdateRegistryResponse::builder)
                .logger(LOG, "updateRegistry")
                .serviceDetails("DataConnectivityManagement", "UpdateRegistry", "")
                .method(com.oracle.bmc.http.client.Method.PUT)
                .requestBuilder(UpdateRegistryRequest::builder)
                .basePath("/20210217")
                .appendPathParam("registries")
                .appendPathParam(request.getRegistryId())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.dataconnectivity.model.Registry.class,
                        UpdateRegistryResponse.Builder::registry)
                .handleResponseHeaderString("etag", UpdateRegistryResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", UpdateRegistryResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-work-request-id", UpdateRegistryResponse.Builder::opcWorkRequestId)
                .callSync();
    }

    @Override
    public ValidateDataAssetNetworkReachablityResponse validateDataAssetNetworkReachablity(
            ValidateDataAssetNetworkReachablityRequest request) {

        Validate.notBlank(request.getEndpointId(), "endpointId must not be blank");

        return clientCall(request, ValidateDataAssetNetworkReachablityResponse::builder)
                .logger(LOG, "validateDataAssetNetworkReachablity")
                .serviceDetails(
                        "DataConnectivityManagement", "ValidateDataAssetNetworkReachablity", "")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(ValidateDataAssetNetworkReachablityRequest::builder)
                .basePath("/20210217")
                .appendPathParam("endpoints")
                .appendPathParam(request.getEndpointId())
                .appendPathParam("actions")
                .appendPathParam("validateDataAssetNetworkReachablity")
                .appendQueryParam("registryId", request.getRegistryId())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        ValidateDataAssetNetworkReachablityResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id",
                        ValidateDataAssetNetworkReachablityResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public DataConnectivityManagementWaiters getWaiters() {
        return waiters;
    }

    @Override
    public DataConnectivityManagementPaginators getPaginators() {
        return paginators;
    }

    /**
     * Create a new client instance.
     *
     * @param authenticationDetailsProvider The authentication details (see {@link Builder#build})
     * @deprecated Use the {@link #builder() builder} instead.
     */
    @Deprecated
    public DataConnectivityManagementClient(
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
    public DataConnectivityManagementClient(
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
    public DataConnectivityManagementClient(
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
    public DataConnectivityManagementClient(
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
    public DataConnectivityManagementClient(
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
    public DataConnectivityManagementClient(
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
    public DataConnectivityManagementClient(
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
    public DataConnectivityManagementClient(
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
