/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.dataintegration;

import com.oracle.bmc.util.internal.Validate;
import com.oracle.bmc.dataintegration.requests.*;
import com.oracle.bmc.dataintegration.responses.*;

import java.util.Objects;

/**
 * Async client implementation for DataIntegration service. <br>
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
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200430")
public class DataIntegrationAsyncClient extends com.oracle.bmc.http.internal.BaseAsyncClient
        implements DataIntegrationAsync {
    /** Service instance for DataIntegration. */
    public static final com.oracle.bmc.Service SERVICE =
            com.oracle.bmc.Services.serviceBuilder()
                    .serviceName("DATAINTEGRATION")
                    .serviceEndpointPrefix("")
                    .serviceEndpointTemplate(
                            "https://dataintegration.{region}.oci.{secondLevelDomain}")
                    .build();

    private static final org.slf4j.Logger LOG =
            org.slf4j.LoggerFactory.getLogger(DataIntegrationAsyncClient.class);

    DataIntegrationAsyncClient(
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
                    Builder, DataIntegrationAsyncClient> {
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
        public DataIntegrationAsyncClient build(
                @jakarta.annotation.Nonnull
                        com.oracle.bmc.auth.AbstractAuthenticationDetailsProvider
                                authenticationDetailsProvider) {
            return new DataIntegrationAsyncClient(this, authenticationDetailsProvider);
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
    public java.util.concurrent.Future<ChangeCompartmentResponse> changeCompartment(
            ChangeCompartmentRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ChangeCompartmentRequest, ChangeCompartmentResponse>
                    handler) {

        Validate.notBlank(request.getWorkspaceId(), "workspaceId must not be blank");
        Objects.requireNonNull(
                request.getChangeCompartmentDetails(), "changeCompartmentDetails is required");

        return clientCall(request, ChangeCompartmentResponse::builder)
                .logger(LOG, "changeCompartment")
                .serviceDetails(
                        "DataIntegration",
                        "ChangeCompartment",
                        "https://docs.oracle.com/iaas/api/#/en/data-integration/20200430/Workspace/ChangeCompartment")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(ChangeCompartmentRequest::builder)
                .basePath("/20200430")
                .appendPathParam("workspaces")
                .appendPathParam(request.getWorkspaceId())
                .appendPathParam("actions")
                .appendPathParam("changeCompartment")
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .hasBody()
                .handleResponseHeaderString(
                        "opc-request-id", ChangeCompartmentResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-work-request-id", ChangeCompartmentResponse.Builder::opcWorkRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ChangeDisApplicationCompartmentResponse>
            changeDisApplicationCompartment(
                    ChangeDisApplicationCompartmentRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    ChangeDisApplicationCompartmentRequest,
                                    ChangeDisApplicationCompartmentResponse>
                            handler) {

        Validate.notBlank(request.getWorkspaceId(), "workspaceId must not be blank");

        Validate.notBlank(request.getDisApplicationId(), "disApplicationId must not be blank");
        Objects.requireNonNull(
                request.getChangeDisApplicationCompartmentDetails(),
                "changeDisApplicationCompartmentDetails is required");

        return clientCall(request, ChangeDisApplicationCompartmentResponse::builder)
                .logger(LOG, "changeDisApplicationCompartment")
                .serviceDetails(
                        "DataIntegration",
                        "ChangeDisApplicationCompartment",
                        "https://docs.oracle.com/iaas/api/#/en/data-integration/20200430/DisApplication/ChangeDisApplicationCompartment")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(ChangeDisApplicationCompartmentRequest::builder)
                .basePath("/20200430")
                .appendPathParam("workspaces")
                .appendPathParam(request.getWorkspaceId())
                .appendPathParam("disApplications")
                .appendPathParam(request.getDisApplicationId())
                .appendPathParam("actions")
                .appendPathParam("changeCompartment")
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .hasBody()
                .handleResponseHeaderString(
                        "opc-request-id",
                        ChangeDisApplicationCompartmentResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        ChangeDisApplicationCompartmentResponse.Builder::opcWorkRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<CreateApplicationResponse> createApplication(
            CreateApplicationRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            CreateApplicationRequest, CreateApplicationResponse>
                    handler) {

        Validate.notBlank(request.getWorkspaceId(), "workspaceId must not be blank");
        Objects.requireNonNull(
                request.getCreateApplicationDetails(), "createApplicationDetails is required");

        return clientCall(request, CreateApplicationResponse::builder)
                .logger(LOG, "createApplication")
                .serviceDetails(
                        "DataIntegration",
                        "CreateApplication",
                        "https://docs.oracle.com/iaas/api/#/en/data-integration/20200430/Application/CreateApplication")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(CreateApplicationRequest::builder)
                .basePath("/20200430")
                .appendPathParam("workspaces")
                .appendPathParam(request.getWorkspaceId())
                .appendPathParam("applications")
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.dataintegration.model.Application.class,
                        CreateApplicationResponse.Builder::application)
                .handleResponseHeaderString("etag", CreateApplicationResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", CreateApplicationResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<CreateApplicationDetailedDescriptionResponse>
            createApplicationDetailedDescription(
                    CreateApplicationDetailedDescriptionRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    CreateApplicationDetailedDescriptionRequest,
                                    CreateApplicationDetailedDescriptionResponse>
                            handler) {

        Validate.notBlank(request.getWorkspaceId(), "workspaceId must not be blank");

        Validate.notBlank(request.getApplicationKey(), "applicationKey must not be blank");
        Objects.requireNonNull(
                request.getCreateApplicationDetailedDescriptionDetails(),
                "createApplicationDetailedDescriptionDetails is required");

        return clientCall(request, CreateApplicationDetailedDescriptionResponse::builder)
                .logger(LOG, "createApplicationDetailedDescription")
                .serviceDetails(
                        "DataIntegration",
                        "CreateApplicationDetailedDescription",
                        "https://docs.oracle.com/iaas/api/#/en/data-integration/20200430/DetailedDescription/CreateApplicationDetailedDescription")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(CreateApplicationDetailedDescriptionRequest::builder)
                .basePath("/20200430")
                .appendPathParam("workspaces")
                .appendPathParam(request.getWorkspaceId())
                .appendPathParam("applications")
                .appendPathParam(request.getApplicationKey())
                .appendPathParam("detailedDescription")
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.dataintegration.model.DetailedDescription.class,
                        CreateApplicationDetailedDescriptionResponse.Builder::detailedDescription)
                .handleResponseHeaderString(
                        "etag", CreateApplicationDetailedDescriptionResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id",
                        CreateApplicationDetailedDescriptionResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<CreateConnectionResponse> createConnection(
            CreateConnectionRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            CreateConnectionRequest, CreateConnectionResponse>
                    handler) {

        Validate.notBlank(request.getWorkspaceId(), "workspaceId must not be blank");
        Objects.requireNonNull(
                request.getCreateConnectionDetails(), "createConnectionDetails is required");

        return clientCall(request, CreateConnectionResponse::builder)
                .logger(LOG, "createConnection")
                .serviceDetails(
                        "DataIntegration",
                        "CreateConnection",
                        "https://docs.oracle.com/iaas/api/#/en/data-integration/20200430/Connection/CreateConnection")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(CreateConnectionRequest::builder)
                .basePath("/20200430")
                .appendPathParam("workspaces")
                .appendPathParam(request.getWorkspaceId())
                .appendPathParam("connections")
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.dataintegration.model.Connection.class,
                        CreateConnectionResponse.Builder::connection)
                .handleResponseHeaderString("etag", CreateConnectionResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", CreateConnectionResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<CreateConnectionValidationResponse>
            createConnectionValidation(
                    CreateConnectionValidationRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    CreateConnectionValidationRequest,
                                    CreateConnectionValidationResponse>
                            handler) {

        Validate.notBlank(request.getWorkspaceId(), "workspaceId must not be blank");
        Objects.requireNonNull(
                request.getCreateConnectionValidationDetails(),
                "createConnectionValidationDetails is required");

        return clientCall(request, CreateConnectionValidationResponse::builder)
                .logger(LOG, "createConnectionValidation")
                .serviceDetails(
                        "DataIntegration",
                        "CreateConnectionValidation",
                        "https://docs.oracle.com/iaas/api/#/en/data-integration/20200430/ConnectionValidation/CreateConnectionValidation")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(CreateConnectionValidationRequest::builder)
                .basePath("/20200430")
                .appendPathParam("workspaces")
                .appendPathParam(request.getWorkspaceId())
                .appendPathParam("connectionValidations")
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.dataintegration.model.ConnectionValidation.class,
                        CreateConnectionValidationResponse.Builder::connectionValidation)
                .handleResponseHeaderString(
                        "etag", CreateConnectionValidationResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", CreateConnectionValidationResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<CreateCopyObjectRequestResponse> createCopyObjectRequest(
            CreateCopyObjectRequestRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            CreateCopyObjectRequestRequest, CreateCopyObjectRequestResponse>
                    handler) {

        Validate.notBlank(request.getWorkspaceId(), "workspaceId must not be blank");
        Objects.requireNonNull(
                request.getCreateCopyObjectRequestDetails(),
                "createCopyObjectRequestDetails is required");

        return clientCall(request, CreateCopyObjectRequestResponse::builder)
                .logger(LOG, "createCopyObjectRequest")
                .serviceDetails("DataIntegration", "CreateCopyObjectRequest", "")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(CreateCopyObjectRequestRequest::builder)
                .basePath("/20200430")
                .appendPathParam("workspaces")
                .appendPathParam(request.getWorkspaceId())
                .appendPathParam("copyObjectRequests")
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.dataintegration.model.CopyObjectRequest.class,
                        CreateCopyObjectRequestResponse.Builder::copyObjectRequest)
                .handleResponseHeaderString("etag", CreateCopyObjectRequestResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", CreateCopyObjectRequestResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        CreateCopyObjectRequestResponse.Builder::opcWorkRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<CreateDataAssetResponse> createDataAsset(
            CreateDataAssetRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            CreateDataAssetRequest, CreateDataAssetResponse>
                    handler) {

        Validate.notBlank(request.getWorkspaceId(), "workspaceId must not be blank");
        Objects.requireNonNull(
                request.getCreateDataAssetDetails(), "createDataAssetDetails is required");

        return clientCall(request, CreateDataAssetResponse::builder)
                .logger(LOG, "createDataAsset")
                .serviceDetails(
                        "DataIntegration",
                        "CreateDataAsset",
                        "https://docs.oracle.com/iaas/api/#/en/data-integration/20200430/DataAsset/CreateDataAsset")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(CreateDataAssetRequest::builder)
                .basePath("/20200430")
                .appendPathParam("workspaces")
                .appendPathParam(request.getWorkspaceId())
                .appendPathParam("dataAssets")
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.dataintegration.model.DataAsset.class,
                        CreateDataAssetResponse.Builder::dataAsset)
                .handleResponseHeaderString("etag", CreateDataAssetResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", CreateDataAssetResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<CreateDataFlowResponse> createDataFlow(
            CreateDataFlowRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            CreateDataFlowRequest, CreateDataFlowResponse>
                    handler) {

        Validate.notBlank(request.getWorkspaceId(), "workspaceId must not be blank");
        Objects.requireNonNull(
                request.getCreateDataFlowDetails(), "createDataFlowDetails is required");

        return clientCall(request, CreateDataFlowResponse::builder)
                .logger(LOG, "createDataFlow")
                .serviceDetails(
                        "DataIntegration",
                        "CreateDataFlow",
                        "https://docs.oracle.com/iaas/api/#/en/data-integration/20200430/DataFlow/CreateDataFlow")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(CreateDataFlowRequest::builder)
                .basePath("/20200430")
                .appendPathParam("workspaces")
                .appendPathParam(request.getWorkspaceId())
                .appendPathParam("dataFlows")
                .accept("application/json")
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.dataintegration.model.DataFlow.class,
                        CreateDataFlowResponse.Builder::dataFlow)
                .handleResponseHeaderString("etag", CreateDataFlowResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", CreateDataFlowResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<CreateDataFlowValidationResponse> createDataFlowValidation(
            CreateDataFlowValidationRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            CreateDataFlowValidationRequest, CreateDataFlowValidationResponse>
                    handler) {

        Validate.notBlank(request.getWorkspaceId(), "workspaceId must not be blank");
        Objects.requireNonNull(
                request.getCreateDataFlowValidationDetails(),
                "createDataFlowValidationDetails is required");

        return clientCall(request, CreateDataFlowValidationResponse::builder)
                .logger(LOG, "createDataFlowValidation")
                .serviceDetails(
                        "DataIntegration",
                        "CreateDataFlowValidation",
                        "https://docs.oracle.com/iaas/api/#/en/data-integration/20200430/DataFlowValidation/CreateDataFlowValidation")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(CreateDataFlowValidationRequest::builder)
                .basePath("/20200430")
                .appendPathParam("workspaces")
                .appendPathParam(request.getWorkspaceId())
                .appendPathParam("dataFlowValidations")
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.dataintegration.model.DataFlowValidation.class,
                        CreateDataFlowValidationResponse.Builder::dataFlowValidation)
                .handleResponseHeaderString("etag", CreateDataFlowValidationResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", CreateDataFlowValidationResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<CreateDisApplicationResponse> createDisApplication(
            CreateDisApplicationRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            CreateDisApplicationRequest, CreateDisApplicationResponse>
                    handler) {

        Validate.notBlank(request.getWorkspaceId(), "workspaceId must not be blank");
        Objects.requireNonNull(
                request.getCreateDisApplicationDetails(),
                "createDisApplicationDetails is required");

        return clientCall(request, CreateDisApplicationResponse::builder)
                .logger(LOG, "createDisApplication")
                .serviceDetails(
                        "DataIntegration",
                        "CreateDisApplication",
                        "https://docs.oracle.com/iaas/api/#/en/data-integration/20200430/DisApplication/CreateDisApplication")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(CreateDisApplicationRequest::builder)
                .basePath("/20200430")
                .appendPathParam("workspaces")
                .appendPathParam(request.getWorkspaceId())
                .appendPathParam("disApplications")
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.dataintegration.model.DisApplication.class,
                        CreateDisApplicationResponse.Builder::disApplication)
                .handleResponseHeaderString("etag", CreateDisApplicationResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", CreateDisApplicationResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<CreateDisApplicationDetailedDescriptionResponse>
            createDisApplicationDetailedDescription(
                    CreateDisApplicationDetailedDescriptionRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    CreateDisApplicationDetailedDescriptionRequest,
                                    CreateDisApplicationDetailedDescriptionResponse>
                            handler) {

        Validate.notBlank(request.getWorkspaceId(), "workspaceId must not be blank");

        Validate.notBlank(request.getApplicationKey(), "applicationKey must not be blank");
        Objects.requireNonNull(
                request.getCreateDisApplicationDetailedDescriptionDetails(),
                "createDisApplicationDetailedDescriptionDetails is required");

        return clientCall(request, CreateDisApplicationDetailedDescriptionResponse::builder)
                .logger(LOG, "createDisApplicationDetailedDescription")
                .serviceDetails(
                        "DataIntegration",
                        "CreateDisApplicationDetailedDescription",
                        "https://docs.oracle.com/iaas/api/#/en/data-integration/20200430/DetailedDescription/CreateDisApplicationDetailedDescription")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(CreateDisApplicationDetailedDescriptionRequest::builder)
                .basePath("/20200430")
                .appendPathParam("workspaces")
                .appendPathParam(request.getWorkspaceId())
                .appendPathParam("disApplications")
                .appendPathParam(request.getApplicationKey())
                .appendPathParam("detailedDescription")
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.dataintegration.model.DetailedDescription.class,
                        CreateDisApplicationDetailedDescriptionResponse.Builder
                                ::detailedDescription)
                .handleResponseHeaderString(
                        "etag", CreateDisApplicationDetailedDescriptionResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id",
                        CreateDisApplicationDetailedDescriptionResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<CreateEntityShapeResponse> createEntityShape(
            CreateEntityShapeRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            CreateEntityShapeRequest, CreateEntityShapeResponse>
                    handler) {

        Validate.notBlank(request.getWorkspaceId(), "workspaceId must not be blank");

        Validate.notBlank(request.getConnectionKey(), "connectionKey must not be blank");

        Validate.notBlank(request.getSchemaResourceName(), "schemaResourceName must not be blank");
        Objects.requireNonNull(
                request.getCreateEntityShapeDetails(), "createEntityShapeDetails is required");

        return clientCall(request, CreateEntityShapeResponse::builder)
                .logger(LOG, "createEntityShape")
                .serviceDetails(
                        "DataIntegration",
                        "CreateEntityShape",
                        "https://docs.oracle.com/iaas/api/#/en/data-integration/20200430/DataEntity/CreateEntityShape")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(CreateEntityShapeRequest::builder)
                .basePath("/20200430")
                .appendPathParam("workspaces")
                .appendPathParam(request.getWorkspaceId())
                .appendPathParam("connections")
                .appendPathParam(request.getConnectionKey())
                .appendPathParam("schemas")
                .appendPathParam(request.getSchemaResourceName())
                .appendPathParam("entityShapes")
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("if-match", request.getIfMatch())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.dataintegration.model.EntityShape.class,
                        CreateEntityShapeResponse.Builder::entityShape)
                .handleResponseHeaderString(
                        "opc-request-id", CreateEntityShapeResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<CreateExportRequestResponse> createExportRequest(
            CreateExportRequestRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            CreateExportRequestRequest, CreateExportRequestResponse>
                    handler) {

        Validate.notBlank(request.getWorkspaceId(), "workspaceId must not be blank");
        Objects.requireNonNull(
                request.getCreateExportRequestDetails(), "createExportRequestDetails is required");

        return clientCall(request, CreateExportRequestResponse::builder)
                .logger(LOG, "createExportRequest")
                .serviceDetails("DataIntegration", "CreateExportRequest", "")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(CreateExportRequestRequest::builder)
                .basePath("/20200430")
                .appendPathParam("workspaces")
                .appendPathParam(request.getWorkspaceId())
                .appendPathParam("exportRequests")
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.dataintegration.model.ExportRequest.class,
                        CreateExportRequestResponse.Builder::exportRequest)
                .handleResponseHeaderString("etag", CreateExportRequestResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", CreateExportRequestResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        CreateExportRequestResponse.Builder::opcWorkRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<CreateExternalPublicationResponse> createExternalPublication(
            CreateExternalPublicationRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            CreateExternalPublicationRequest, CreateExternalPublicationResponse>
                    handler) {

        Validate.notBlank(request.getWorkspaceId(), "workspaceId must not be blank");

        Validate.notBlank(request.getTaskKey(), "taskKey must not be blank");
        Objects.requireNonNull(
                request.getCreateExternalPublicationDetails(),
                "createExternalPublicationDetails is required");

        return clientCall(request, CreateExternalPublicationResponse::builder)
                .logger(LOG, "createExternalPublication")
                .serviceDetails(
                        "DataIntegration",
                        "CreateExternalPublication",
                        "https://docs.oracle.com/iaas/api/#/en/data-integration/20200430/ExternalPublication/CreateExternalPublication")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(CreateExternalPublicationRequest::builder)
                .basePath("/20200430")
                .appendPathParam("workspaces")
                .appendPathParam(request.getWorkspaceId())
                .appendPathParam("tasks")
                .appendPathParam(request.getTaskKey())
                .appendPathParam("externalPublications")
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.dataintegration.model.ExternalPublication.class,
                        CreateExternalPublicationResponse.Builder::externalPublication)
                .handleResponseHeaderString("etag", CreateExternalPublicationResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", CreateExternalPublicationResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<CreateExternalPublicationValidationResponse>
            createExternalPublicationValidation(
                    CreateExternalPublicationValidationRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    CreateExternalPublicationValidationRequest,
                                    CreateExternalPublicationValidationResponse>
                            handler) {

        Validate.notBlank(request.getWorkspaceId(), "workspaceId must not be blank");

        Validate.notBlank(request.getTaskKey(), "taskKey must not be blank");
        Objects.requireNonNull(
                request.getCreateExternalPublicationValidationDetails(),
                "createExternalPublicationValidationDetails is required");

        return clientCall(request, CreateExternalPublicationValidationResponse::builder)
                .logger(LOG, "createExternalPublicationValidation")
                .serviceDetails(
                        "DataIntegration",
                        "CreateExternalPublicationValidation",
                        "https://docs.oracle.com/iaas/api/#/en/data-integration/20200430/ExternalPublicationValidation/CreateExternalPublicationValidation")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(CreateExternalPublicationValidationRequest::builder)
                .basePath("/20200430")
                .appendPathParam("workspaces")
                .appendPathParam(request.getWorkspaceId())
                .appendPathParam("tasks")
                .appendPathParam(request.getTaskKey())
                .appendPathParam("externalPublicationValidations")
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.dataintegration.model.ExternalPublicationValidation.class,
                        CreateExternalPublicationValidationResponse.Builder
                                ::externalPublicationValidation)
                .handleResponseHeaderString(
                        "etag", CreateExternalPublicationValidationResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id",
                        CreateExternalPublicationValidationResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<CreateFolderResponse> createFolder(
            CreateFolderRequest request,
            final com.oracle.bmc.responses.AsyncHandler<CreateFolderRequest, CreateFolderResponse>
                    handler) {

        Validate.notBlank(request.getWorkspaceId(), "workspaceId must not be blank");
        Objects.requireNonNull(request.getCreateFolderDetails(), "createFolderDetails is required");

        return clientCall(request, CreateFolderResponse::builder)
                .logger(LOG, "createFolder")
                .serviceDetails(
                        "DataIntegration",
                        "CreateFolder",
                        "https://docs.oracle.com/iaas/api/#/en/data-integration/20200430/Folder/CreateFolder")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(CreateFolderRequest::builder)
                .basePath("/20200430")
                .appendPathParam("workspaces")
                .appendPathParam(request.getWorkspaceId())
                .appendPathParam("folders")
                .accept("application/json")
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.dataintegration.model.Folder.class,
                        CreateFolderResponse.Builder::folder)
                .handleResponseHeaderString("etag", CreateFolderResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", CreateFolderResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<CreateFunctionLibraryResponse> createFunctionLibrary(
            CreateFunctionLibraryRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            CreateFunctionLibraryRequest, CreateFunctionLibraryResponse>
                    handler) {

        Validate.notBlank(request.getWorkspaceId(), "workspaceId must not be blank");
        Objects.requireNonNull(
                request.getCreateFunctionLibraryDetails(),
                "createFunctionLibraryDetails is required");

        return clientCall(request, CreateFunctionLibraryResponse::builder)
                .logger(LOG, "createFunctionLibrary")
                .serviceDetails(
                        "DataIntegration",
                        "CreateFunctionLibrary",
                        "https://docs.oracle.com/iaas/api/#/en/data-integration/20200430/FunctionLibrary/CreateFunctionLibrary")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(CreateFunctionLibraryRequest::builder)
                .basePath("/20200430")
                .appendPathParam("workspaces")
                .appendPathParam(request.getWorkspaceId())
                .appendPathParam("functionLibraries")
                .accept("application/json")
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.dataintegration.model.FunctionLibrary.class,
                        CreateFunctionLibraryResponse.Builder::functionLibrary)
                .handleResponseHeaderString("etag", CreateFunctionLibraryResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", CreateFunctionLibraryResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<CreateImportRequestResponse> createImportRequest(
            CreateImportRequestRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            CreateImportRequestRequest, CreateImportRequestResponse>
                    handler) {

        Validate.notBlank(request.getWorkspaceId(), "workspaceId must not be blank");
        Objects.requireNonNull(
                request.getCreateImportRequestDetails(), "createImportRequestDetails is required");

        return clientCall(request, CreateImportRequestResponse::builder)
                .logger(LOG, "createImportRequest")
                .serviceDetails("DataIntegration", "CreateImportRequest", "")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(CreateImportRequestRequest::builder)
                .basePath("/20200430")
                .appendPathParam("workspaces")
                .appendPathParam(request.getWorkspaceId())
                .appendPathParam("importRequests")
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.dataintegration.model.ImportRequest.class,
                        CreateImportRequestResponse.Builder::importRequest)
                .handleResponseHeaderString("etag", CreateImportRequestResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", CreateImportRequestResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        CreateImportRequestResponse.Builder::opcWorkRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<CreatePatchResponse> createPatch(
            CreatePatchRequest request,
            final com.oracle.bmc.responses.AsyncHandler<CreatePatchRequest, CreatePatchResponse>
                    handler) {

        Validate.notBlank(request.getWorkspaceId(), "workspaceId must not be blank");

        Validate.notBlank(request.getApplicationKey(), "applicationKey must not be blank");
        Objects.requireNonNull(request.getCreatePatchDetails(), "createPatchDetails is required");

        return clientCall(request, CreatePatchResponse::builder)
                .logger(LOG, "createPatch")
                .serviceDetails(
                        "DataIntegration",
                        "CreatePatch",
                        "https://docs.oracle.com/iaas/api/#/en/data-integration/20200430/Application/CreatePatch")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(CreatePatchRequest::builder)
                .basePath("/20200430")
                .appendPathParam("workspaces")
                .appendPathParam(request.getWorkspaceId())
                .appendPathParam("applications")
                .appendPathParam(request.getApplicationKey())
                .appendPathParam("patches")
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.dataintegration.model.Patch.class,
                        CreatePatchResponse.Builder::patch)
                .handleResponseHeaderString("etag", CreatePatchResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", CreatePatchResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<CreatePipelineResponse> createPipeline(
            CreatePipelineRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            CreatePipelineRequest, CreatePipelineResponse>
                    handler) {

        Validate.notBlank(request.getWorkspaceId(), "workspaceId must not be blank");
        Objects.requireNonNull(
                request.getCreatePipelineDetails(), "createPipelineDetails is required");

        return clientCall(request, CreatePipelineResponse::builder)
                .logger(LOG, "createPipeline")
                .serviceDetails(
                        "DataIntegration",
                        "CreatePipeline",
                        "https://docs.oracle.com/iaas/api/#/en/data-integration/20200430/Pipeline/CreatePipeline")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(CreatePipelineRequest::builder)
                .basePath("/20200430")
                .appendPathParam("workspaces")
                .appendPathParam(request.getWorkspaceId())
                .appendPathParam("pipelines")
                .accept("application/json")
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.dataintegration.model.Pipeline.class,
                        CreatePipelineResponse.Builder::pipeline)
                .handleResponseHeaderString("etag", CreatePipelineResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", CreatePipelineResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<CreatePipelineValidationResponse> createPipelineValidation(
            CreatePipelineValidationRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            CreatePipelineValidationRequest, CreatePipelineValidationResponse>
                    handler) {

        Validate.notBlank(request.getWorkspaceId(), "workspaceId must not be blank");
        Objects.requireNonNull(
                request.getCreatePipelineValidationDetails(),
                "createPipelineValidationDetails is required");

        return clientCall(request, CreatePipelineValidationResponse::builder)
                .logger(LOG, "createPipelineValidation")
                .serviceDetails(
                        "DataIntegration",
                        "CreatePipelineValidation",
                        "https://docs.oracle.com/iaas/api/#/en/data-integration/20200430/PipelineValidation/CreatePipelineValidation")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(CreatePipelineValidationRequest::builder)
                .basePath("/20200430")
                .appendPathParam("workspaces")
                .appendPathParam(request.getWorkspaceId())
                .appendPathParam("pipelineValidations")
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.dataintegration.model.PipelineValidation.class,
                        CreatePipelineValidationResponse.Builder::pipelineValidation)
                .handleResponseHeaderString("etag", CreatePipelineValidationResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", CreatePipelineValidationResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<CreateProjectResponse> createProject(
            CreateProjectRequest request,
            final com.oracle.bmc.responses.AsyncHandler<CreateProjectRequest, CreateProjectResponse>
                    handler) {

        Validate.notBlank(request.getWorkspaceId(), "workspaceId must not be blank");
        Objects.requireNonNull(
                request.getCreateProjectDetails(), "createProjectDetails is required");

        return clientCall(request, CreateProjectResponse::builder)
                .logger(LOG, "createProject")
                .serviceDetails(
                        "DataIntegration",
                        "CreateProject",
                        "https://docs.oracle.com/iaas/api/#/en/data-integration/20200430/Project/CreateProject")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(CreateProjectRequest::builder)
                .basePath("/20200430")
                .appendPathParam("workspaces")
                .appendPathParam(request.getWorkspaceId())
                .appendPathParam("projects")
                .accept("application/json")
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.dataintegration.model.Project.class,
                        CreateProjectResponse.Builder::project)
                .handleResponseHeaderString("etag", CreateProjectResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", CreateProjectResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<CreateScheduleResponse> createSchedule(
            CreateScheduleRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            CreateScheduleRequest, CreateScheduleResponse>
                    handler) {

        Validate.notBlank(request.getWorkspaceId(), "workspaceId must not be blank");

        Validate.notBlank(request.getApplicationKey(), "applicationKey must not be blank");
        Objects.requireNonNull(
                request.getCreateScheduleDetails(), "createScheduleDetails is required");

        return clientCall(request, CreateScheduleResponse::builder)
                .logger(LOG, "createSchedule")
                .serviceDetails(
                        "DataIntegration",
                        "CreateSchedule",
                        "https://docs.oracle.com/iaas/api/#/en/data-integration/20200430/Schedule/CreateSchedule")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(CreateScheduleRequest::builder)
                .basePath("/20200430")
                .appendPathParam("workspaces")
                .appendPathParam(request.getWorkspaceId())
                .appendPathParam("applications")
                .appendPathParam(request.getApplicationKey())
                .appendPathParam("schedules")
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.dataintegration.model.Schedule.class,
                        CreateScheduleResponse.Builder::schedule)
                .handleResponseHeaderString(
                        "opc-request-id", CreateScheduleResponse.Builder::opcRequestId)
                .handleResponseHeaderString("etag", CreateScheduleResponse.Builder::etag)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<CreateTaskResponse> createTask(
            CreateTaskRequest request,
            final com.oracle.bmc.responses.AsyncHandler<CreateTaskRequest, CreateTaskResponse>
                    handler) {

        Validate.notBlank(request.getWorkspaceId(), "workspaceId must not be blank");
        Objects.requireNonNull(request.getCreateTaskDetails(), "createTaskDetails is required");

        return clientCall(request, CreateTaskResponse::builder)
                .logger(LOG, "createTask")
                .serviceDetails(
                        "DataIntegration",
                        "CreateTask",
                        "https://docs.oracle.com/iaas/api/#/en/data-integration/20200430/Task/CreateTask")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(CreateTaskRequest::builder)
                .basePath("/20200430")
                .appendPathParam("workspaces")
                .appendPathParam(request.getWorkspaceId())
                .appendPathParam("tasks")
                .accept("application/json")
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.dataintegration.model.Task.class,
                        CreateTaskResponse.Builder::task)
                .handleResponseHeaderString("etag", CreateTaskResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", CreateTaskResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<CreateTaskRunResponse> createTaskRun(
            CreateTaskRunRequest request,
            final com.oracle.bmc.responses.AsyncHandler<CreateTaskRunRequest, CreateTaskRunResponse>
                    handler) {

        Validate.notBlank(request.getWorkspaceId(), "workspaceId must not be blank");

        Validate.notBlank(request.getApplicationKey(), "applicationKey must not be blank");
        Objects.requireNonNull(
                request.getCreateTaskRunDetails(), "createTaskRunDetails is required");

        return clientCall(request, CreateTaskRunResponse::builder)
                .logger(LOG, "createTaskRun")
                .serviceDetails(
                        "DataIntegration",
                        "CreateTaskRun",
                        "https://docs.oracle.com/iaas/api/#/en/data-integration/20200430/TaskRun/CreateTaskRun")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(CreateTaskRunRequest::builder)
                .basePath("/20200430")
                .appendPathParam("workspaces")
                .appendPathParam(request.getWorkspaceId())
                .appendPathParam("applications")
                .appendPathParam(request.getApplicationKey())
                .appendPathParam("taskRuns")
                .accept("application/json")
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.dataintegration.model.TaskRun.class,
                        CreateTaskRunResponse.Builder::taskRun)
                .handleResponseHeaderString("etag", CreateTaskRunResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", CreateTaskRunResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<CreateTaskScheduleResponse> createTaskSchedule(
            CreateTaskScheduleRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            CreateTaskScheduleRequest, CreateTaskScheduleResponse>
                    handler) {

        Validate.notBlank(request.getWorkspaceId(), "workspaceId must not be blank");

        Validate.notBlank(request.getApplicationKey(), "applicationKey must not be blank");
        Objects.requireNonNull(
                request.getCreateTaskScheduleDetails(), "createTaskScheduleDetails is required");

        return clientCall(request, CreateTaskScheduleResponse::builder)
                .logger(LOG, "createTaskSchedule")
                .serviceDetails(
                        "DataIntegration",
                        "CreateTaskSchedule",
                        "https://docs.oracle.com/iaas/api/#/en/data-integration/20200430/TaskSchedule/CreateTaskSchedule")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(CreateTaskScheduleRequest::builder)
                .basePath("/20200430")
                .appendPathParam("workspaces")
                .appendPathParam(request.getWorkspaceId())
                .appendPathParam("applications")
                .appendPathParam(request.getApplicationKey())
                .appendPathParam("taskSchedules")
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.dataintegration.model.TaskSchedule.class,
                        CreateTaskScheduleResponse.Builder::taskSchedule)
                .handleResponseHeaderString(
                        "opc-request-id", CreateTaskScheduleResponse.Builder::opcRequestId)
                .handleResponseHeaderString("etag", CreateTaskScheduleResponse.Builder::etag)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<CreateTaskValidationResponse> createTaskValidation(
            CreateTaskValidationRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            CreateTaskValidationRequest, CreateTaskValidationResponse>
                    handler) {

        Validate.notBlank(request.getWorkspaceId(), "workspaceId must not be blank");
        Objects.requireNonNull(
                request.getCreateTaskValidationDetails(),
                "createTaskValidationDetails is required");

        return clientCall(request, CreateTaskValidationResponse::builder)
                .logger(LOG, "createTaskValidation")
                .serviceDetails(
                        "DataIntegration",
                        "CreateTaskValidation",
                        "https://docs.oracle.com/iaas/api/#/en/data-integration/20200430/TaskValidation/CreateTaskValidation")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(CreateTaskValidationRequest::builder)
                .basePath("/20200430")
                .appendPathParam("workspaces")
                .appendPathParam(request.getWorkspaceId())
                .appendPathParam("taskValidations")
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.dataintegration.model.TaskValidation.class,
                        CreateTaskValidationResponse.Builder::taskValidation)
                .handleResponseHeaderString("etag", CreateTaskValidationResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", CreateTaskValidationResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<CreateUserDefinedFunctionResponse> createUserDefinedFunction(
            CreateUserDefinedFunctionRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            CreateUserDefinedFunctionRequest, CreateUserDefinedFunctionResponse>
                    handler) {

        Validate.notBlank(request.getWorkspaceId(), "workspaceId must not be blank");
        Objects.requireNonNull(
                request.getCreateUserDefinedFunctionDetails(),
                "createUserDefinedFunctionDetails is required");

        return clientCall(request, CreateUserDefinedFunctionResponse::builder)
                .logger(LOG, "createUserDefinedFunction")
                .serviceDetails(
                        "DataIntegration",
                        "CreateUserDefinedFunction",
                        "https://docs.oracle.com/iaas/api/#/en/data-integration/20200430/UserDefinedFunction/CreateUserDefinedFunction")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(CreateUserDefinedFunctionRequest::builder)
                .basePath("/20200430")
                .appendPathParam("workspaces")
                .appendPathParam(request.getWorkspaceId())
                .appendPathParam("userDefinedFunctions")
                .accept("application/json")
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.dataintegration.model.UserDefinedFunction.class,
                        CreateUserDefinedFunctionResponse.Builder::userDefinedFunction)
                .handleResponseHeaderString("etag", CreateUserDefinedFunctionResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", CreateUserDefinedFunctionResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<CreateUserDefinedFunctionValidationResponse>
            createUserDefinedFunctionValidation(
                    CreateUserDefinedFunctionValidationRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    CreateUserDefinedFunctionValidationRequest,
                                    CreateUserDefinedFunctionValidationResponse>
                            handler) {

        Validate.notBlank(request.getWorkspaceId(), "workspaceId must not be blank");
        Objects.requireNonNull(
                request.getCreateUserDefinedFunctionValidationDetails(),
                "createUserDefinedFunctionValidationDetails is required");

        return clientCall(request, CreateUserDefinedFunctionValidationResponse::builder)
                .logger(LOG, "createUserDefinedFunctionValidation")
                .serviceDetails(
                        "DataIntegration",
                        "CreateUserDefinedFunctionValidation",
                        "https://docs.oracle.com/iaas/api/#/en/data-integration/20200430/UserDefinedFunctionValidation/CreateUserDefinedFunctionValidation")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(CreateUserDefinedFunctionValidationRequest::builder)
                .basePath("/20200430")
                .appendPathParam("workspaces")
                .appendPathParam(request.getWorkspaceId())
                .appendPathParam("userDefinedFunctionValidations")
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.dataintegration.model.UserDefinedFunctionValidation.class,
                        CreateUserDefinedFunctionValidationResponse.Builder
                                ::userDefinedFunctionValidation)
                .handleResponseHeaderString(
                        "etag", CreateUserDefinedFunctionValidationResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id",
                        CreateUserDefinedFunctionValidationResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<CreateWorkspaceResponse> createWorkspace(
            CreateWorkspaceRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            CreateWorkspaceRequest, CreateWorkspaceResponse>
                    handler) {
        Objects.requireNonNull(
                request.getCreateWorkspaceDetails(), "createWorkspaceDetails is required");

        return clientCall(request, CreateWorkspaceResponse::builder)
                .logger(LOG, "createWorkspace")
                .serviceDetails(
                        "DataIntegration",
                        "CreateWorkspace",
                        "https://docs.oracle.com/iaas/api/#/en/data-integration/20200430/Workspace/CreateWorkspace")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(CreateWorkspaceRequest::builder)
                .basePath("/20200430")
                .appendPathParam("workspaces")
                .accept("application/json")
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .hasBody()
                .handleResponseHeaderString(
                        "opc-request-id", CreateWorkspaceResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-work-request-id", CreateWorkspaceResponse.Builder::opcWorkRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<DeleteApplicationResponse> deleteApplication(
            DeleteApplicationRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            DeleteApplicationRequest, DeleteApplicationResponse>
                    handler) {

        Validate.notBlank(request.getWorkspaceId(), "workspaceId must not be blank");

        Validate.notBlank(request.getApplicationKey(), "applicationKey must not be blank");

        return clientCall(request, DeleteApplicationResponse::builder)
                .logger(LOG, "deleteApplication")
                .serviceDetails(
                        "DataIntegration",
                        "DeleteApplication",
                        "https://docs.oracle.com/iaas/api/#/en/data-integration/20200430/Application/DeleteApplication")
                .method(com.oracle.bmc.http.client.Method.DELETE)
                .requestBuilder(DeleteApplicationRequest::builder)
                .basePath("/20200430")
                .appendPathParam("workspaces")
                .appendPathParam(request.getWorkspaceId())
                .appendPathParam("applications")
                .appendPathParam(request.getApplicationKey())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleResponseHeaderString(
                        "opc-request-id", DeleteApplicationResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<DeleteApplicationDetailedDescriptionResponse>
            deleteApplicationDetailedDescription(
                    DeleteApplicationDetailedDescriptionRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    DeleteApplicationDetailedDescriptionRequest,
                                    DeleteApplicationDetailedDescriptionResponse>
                            handler) {

        Validate.notBlank(request.getWorkspaceId(), "workspaceId must not be blank");

        Validate.notBlank(request.getApplicationKey(), "applicationKey must not be blank");

        return clientCall(request, DeleteApplicationDetailedDescriptionResponse::builder)
                .logger(LOG, "deleteApplicationDetailedDescription")
                .serviceDetails(
                        "DataIntegration",
                        "DeleteApplicationDetailedDescription",
                        "https://docs.oracle.com/iaas/api/#/en/data-integration/20200430/DetailedDescription/DeleteApplicationDetailedDescription")
                .method(com.oracle.bmc.http.client.Method.DELETE)
                .requestBuilder(DeleteApplicationDetailedDescriptionRequest::builder)
                .basePath("/20200430")
                .appendPathParam("workspaces")
                .appendPathParam(request.getWorkspaceId())
                .appendPathParam("applications")
                .appendPathParam(request.getApplicationKey())
                .appendPathParam("detailedDescription")
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleResponseHeaderString(
                        "opc-request-id",
                        DeleteApplicationDetailedDescriptionResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<DeleteConnectionResponse> deleteConnection(
            DeleteConnectionRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            DeleteConnectionRequest, DeleteConnectionResponse>
                    handler) {

        Validate.notBlank(request.getWorkspaceId(), "workspaceId must not be blank");

        Validate.notBlank(request.getConnectionKey(), "connectionKey must not be blank");

        return clientCall(request, DeleteConnectionResponse::builder)
                .logger(LOG, "deleteConnection")
                .serviceDetails(
                        "DataIntegration",
                        "DeleteConnection",
                        "https://docs.oracle.com/iaas/api/#/en/data-integration/20200430/Connection/DeleteConnection")
                .method(com.oracle.bmc.http.client.Method.DELETE)
                .requestBuilder(DeleteConnectionRequest::builder)
                .basePath("/20200430")
                .appendPathParam("workspaces")
                .appendPathParam(request.getWorkspaceId())
                .appendPathParam("connections")
                .appendPathParam(request.getConnectionKey())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleResponseHeaderString(
                        "opc-request-id", DeleteConnectionResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<DeleteConnectionValidationResponse>
            deleteConnectionValidation(
                    DeleteConnectionValidationRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    DeleteConnectionValidationRequest,
                                    DeleteConnectionValidationResponse>
                            handler) {

        Validate.notBlank(request.getWorkspaceId(), "workspaceId must not be blank");

        Validate.notBlank(
                request.getConnectionValidationKey(), "connectionValidationKey must not be blank");

        return clientCall(request, DeleteConnectionValidationResponse::builder)
                .logger(LOG, "deleteConnectionValidation")
                .serviceDetails(
                        "DataIntegration",
                        "DeleteConnectionValidation",
                        "https://docs.oracle.com/iaas/api/#/en/data-integration/20200430/ConnectionValidation/DeleteConnectionValidation")
                .method(com.oracle.bmc.http.client.Method.DELETE)
                .requestBuilder(DeleteConnectionValidationRequest::builder)
                .basePath("/20200430")
                .appendPathParam("workspaces")
                .appendPathParam(request.getWorkspaceId())
                .appendPathParam("connectionValidations")
                .appendPathParam(request.getConnectionValidationKey())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleResponseHeaderString(
                        "opc-request-id", DeleteConnectionValidationResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<DeleteCopyObjectRequestResponse> deleteCopyObjectRequest(
            DeleteCopyObjectRequestRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            DeleteCopyObjectRequestRequest, DeleteCopyObjectRequestResponse>
                    handler) {

        Validate.notBlank(request.getWorkspaceId(), "workspaceId must not be blank");

        Validate.notBlank(
                request.getCopyObjectRequestKey(), "copyObjectRequestKey must not be blank");

        return clientCall(request, DeleteCopyObjectRequestResponse::builder)
                .logger(LOG, "deleteCopyObjectRequest")
                .serviceDetails(
                        "DataIntegration",
                        "DeleteCopyObjectRequest",
                        "https://docs.oracle.com/iaas/api/#/en/data-integration/20200430/Workspace/DeleteCopyObjectRequest")
                .method(com.oracle.bmc.http.client.Method.DELETE)
                .requestBuilder(DeleteCopyObjectRequestRequest::builder)
                .basePath("/20200430")
                .appendPathParam("workspaces")
                .appendPathParam(request.getWorkspaceId())
                .appendPathParam("copyObjectRequests")
                .appendPathParam(request.getCopyObjectRequestKey())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("if-match", request.getIfMatch())
                .handleResponseHeaderString(
                        "opc-request-id", DeleteCopyObjectRequestResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<DeleteDataAssetResponse> deleteDataAsset(
            DeleteDataAssetRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            DeleteDataAssetRequest, DeleteDataAssetResponse>
                    handler) {

        Validate.notBlank(request.getWorkspaceId(), "workspaceId must not be blank");

        Validate.notBlank(request.getDataAssetKey(), "dataAssetKey must not be blank");

        return clientCall(request, DeleteDataAssetResponse::builder)
                .logger(LOG, "deleteDataAsset")
                .serviceDetails(
                        "DataIntegration",
                        "DeleteDataAsset",
                        "https://docs.oracle.com/iaas/api/#/en/data-integration/20200430/DataAsset/DeleteDataAsset")
                .method(com.oracle.bmc.http.client.Method.DELETE)
                .requestBuilder(DeleteDataAssetRequest::builder)
                .basePath("/20200430")
                .appendPathParam("workspaces")
                .appendPathParam(request.getWorkspaceId())
                .appendPathParam("dataAssets")
                .appendPathParam(request.getDataAssetKey())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleResponseHeaderString(
                        "opc-request-id", DeleteDataAssetResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<DeleteDataFlowResponse> deleteDataFlow(
            DeleteDataFlowRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            DeleteDataFlowRequest, DeleteDataFlowResponse>
                    handler) {

        Validate.notBlank(request.getWorkspaceId(), "workspaceId must not be blank");

        Validate.notBlank(request.getDataFlowKey(), "dataFlowKey must not be blank");

        return clientCall(request, DeleteDataFlowResponse::builder)
                .logger(LOG, "deleteDataFlow")
                .serviceDetails(
                        "DataIntegration",
                        "DeleteDataFlow",
                        "https://docs.oracle.com/iaas/api/#/en/data-integration/20200430/DataFlow/DeleteDataFlow")
                .method(com.oracle.bmc.http.client.Method.DELETE)
                .requestBuilder(DeleteDataFlowRequest::builder)
                .basePath("/20200430")
                .appendPathParam("workspaces")
                .appendPathParam(request.getWorkspaceId())
                .appendPathParam("dataFlows")
                .appendPathParam(request.getDataFlowKey())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleResponseHeaderString(
                        "opc-request-id", DeleteDataFlowResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<DeleteDataFlowValidationResponse> deleteDataFlowValidation(
            DeleteDataFlowValidationRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            DeleteDataFlowValidationRequest, DeleteDataFlowValidationResponse>
                    handler) {

        Validate.notBlank(request.getWorkspaceId(), "workspaceId must not be blank");

        Validate.notBlank(
                request.getDataFlowValidationKey(), "dataFlowValidationKey must not be blank");

        return clientCall(request, DeleteDataFlowValidationResponse::builder)
                .logger(LOG, "deleteDataFlowValidation")
                .serviceDetails(
                        "DataIntegration",
                        "DeleteDataFlowValidation",
                        "https://docs.oracle.com/iaas/api/#/en/data-integration/20200430/DataFlowValidation/DeleteDataFlowValidation")
                .method(com.oracle.bmc.http.client.Method.DELETE)
                .requestBuilder(DeleteDataFlowValidationRequest::builder)
                .basePath("/20200430")
                .appendPathParam("workspaces")
                .appendPathParam(request.getWorkspaceId())
                .appendPathParam("dataFlowValidations")
                .appendPathParam(request.getDataFlowValidationKey())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleResponseHeaderString(
                        "opc-request-id", DeleteDataFlowValidationResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<DeleteDisApplicationResponse> deleteDisApplication(
            DeleteDisApplicationRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            DeleteDisApplicationRequest, DeleteDisApplicationResponse>
                    handler) {

        Validate.notBlank(request.getWorkspaceId(), "workspaceId must not be blank");

        Validate.notBlank(request.getDisApplicationId(), "disApplicationId must not be blank");

        return clientCall(request, DeleteDisApplicationResponse::builder)
                .logger(LOG, "deleteDisApplication")
                .serviceDetails(
                        "DataIntegration",
                        "DeleteDisApplication",
                        "https://docs.oracle.com/iaas/api/#/en/data-integration/20200430/DisApplication/DeleteDisApplication")
                .method(com.oracle.bmc.http.client.Method.DELETE)
                .requestBuilder(DeleteDisApplicationRequest::builder)
                .basePath("/20200430")
                .appendPathParam("workspaces")
                .appendPathParam(request.getWorkspaceId())
                .appendPathParam("disApplications")
                .appendPathParam(request.getDisApplicationId())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleResponseHeaderString(
                        "opc-request-id", DeleteDisApplicationResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<DeleteDisApplicationDetailedDescriptionResponse>
            deleteDisApplicationDetailedDescription(
                    DeleteDisApplicationDetailedDescriptionRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    DeleteDisApplicationDetailedDescriptionRequest,
                                    DeleteDisApplicationDetailedDescriptionResponse>
                            handler) {

        Validate.notBlank(request.getWorkspaceId(), "workspaceId must not be blank");

        Validate.notBlank(request.getApplicationKey(), "applicationKey must not be blank");

        return clientCall(request, DeleteDisApplicationDetailedDescriptionResponse::builder)
                .logger(LOG, "deleteDisApplicationDetailedDescription")
                .serviceDetails(
                        "DataIntegration",
                        "DeleteDisApplicationDetailedDescription",
                        "https://docs.oracle.com/iaas/api/#/en/data-integration/20200430/DetailedDescription/DeleteDisApplicationDetailedDescription")
                .method(com.oracle.bmc.http.client.Method.DELETE)
                .requestBuilder(DeleteDisApplicationDetailedDescriptionRequest::builder)
                .basePath("/20200430")
                .appendPathParam("workspaces")
                .appendPathParam(request.getWorkspaceId())
                .appendPathParam("disApplications")
                .appendPathParam(request.getApplicationKey())
                .appendPathParam("detailedDescription")
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleResponseHeaderString(
                        "opc-request-id",
                        DeleteDisApplicationDetailedDescriptionResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<DeleteExportRequestResponse> deleteExportRequest(
            DeleteExportRequestRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            DeleteExportRequestRequest, DeleteExportRequestResponse>
                    handler) {

        Validate.notBlank(request.getWorkspaceId(), "workspaceId must not be blank");

        Validate.notBlank(request.getExportRequestKey(), "exportRequestKey must not be blank");

        return clientCall(request, DeleteExportRequestResponse::builder)
                .logger(LOG, "deleteExportRequest")
                .serviceDetails(
                        "DataIntegration",
                        "DeleteExportRequest",
                        "https://docs.oracle.com/iaas/api/#/en/data-integration/20200430/Workspace/DeleteExportRequest")
                .method(com.oracle.bmc.http.client.Method.DELETE)
                .requestBuilder(DeleteExportRequestRequest::builder)
                .basePath("/20200430")
                .appendPathParam("workspaces")
                .appendPathParam(request.getWorkspaceId())
                .appendPathParam("exportRequests")
                .appendPathParam(request.getExportRequestKey())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("if-match", request.getIfMatch())
                .handleResponseHeaderString(
                        "opc-request-id", DeleteExportRequestResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<DeleteExternalPublicationResponse> deleteExternalPublication(
            DeleteExternalPublicationRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            DeleteExternalPublicationRequest, DeleteExternalPublicationResponse>
                    handler) {

        Validate.notBlank(request.getWorkspaceId(), "workspaceId must not be blank");

        Validate.notBlank(request.getTaskKey(), "taskKey must not be blank");

        Validate.notBlank(
                request.getExternalPublicationsKey(), "externalPublicationsKey must not be blank");

        return clientCall(request, DeleteExternalPublicationResponse::builder)
                .logger(LOG, "deleteExternalPublication")
                .serviceDetails(
                        "DataIntegration",
                        "DeleteExternalPublication",
                        "https://docs.oracle.com/iaas/api/#/en/data-integration/20200430/ExternalPublication/DeleteExternalPublication")
                .method(com.oracle.bmc.http.client.Method.DELETE)
                .requestBuilder(DeleteExternalPublicationRequest::builder)
                .basePath("/20200430")
                .appendPathParam("workspaces")
                .appendPathParam(request.getWorkspaceId())
                .appendPathParam("tasks")
                .appendPathParam(request.getTaskKey())
                .appendPathParam("externalPublications")
                .appendPathParam(request.getExternalPublicationsKey())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleResponseHeaderString(
                        "opc-request-id", DeleteExternalPublicationResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<DeleteExternalPublicationValidationResponse>
            deleteExternalPublicationValidation(
                    DeleteExternalPublicationValidationRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    DeleteExternalPublicationValidationRequest,
                                    DeleteExternalPublicationValidationResponse>
                            handler) {

        Validate.notBlank(request.getWorkspaceId(), "workspaceId must not be blank");

        Validate.notBlank(request.getTaskKey(), "taskKey must not be blank");

        Validate.notBlank(
                request.getExternalPublicationValidationKey(),
                "externalPublicationValidationKey must not be blank");

        return clientCall(request, DeleteExternalPublicationValidationResponse::builder)
                .logger(LOG, "deleteExternalPublicationValidation")
                .serviceDetails(
                        "DataIntegration",
                        "DeleteExternalPublicationValidation",
                        "https://docs.oracle.com/iaas/api/#/en/data-integration/20200430/ExternalPublicationValidation/DeleteExternalPublicationValidation")
                .method(com.oracle.bmc.http.client.Method.DELETE)
                .requestBuilder(DeleteExternalPublicationValidationRequest::builder)
                .basePath("/20200430")
                .appendPathParam("workspaces")
                .appendPathParam(request.getWorkspaceId())
                .appendPathParam("tasks")
                .appendPathParam(request.getTaskKey())
                .appendPathParam("externalPublicationValidations")
                .appendPathParam(request.getExternalPublicationValidationKey())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleResponseHeaderString(
                        "opc-request-id",
                        DeleteExternalPublicationValidationResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<DeleteFolderResponse> deleteFolder(
            DeleteFolderRequest request,
            final com.oracle.bmc.responses.AsyncHandler<DeleteFolderRequest, DeleteFolderResponse>
                    handler) {

        Validate.notBlank(request.getWorkspaceId(), "workspaceId must not be blank");

        Validate.notBlank(request.getFolderKey(), "folderKey must not be blank");

        return clientCall(request, DeleteFolderResponse::builder)
                .logger(LOG, "deleteFolder")
                .serviceDetails(
                        "DataIntegration",
                        "DeleteFolder",
                        "https://docs.oracle.com/iaas/api/#/en/data-integration/20200430/Folder/DeleteFolder")
                .method(com.oracle.bmc.http.client.Method.DELETE)
                .requestBuilder(DeleteFolderRequest::builder)
                .basePath("/20200430")
                .appendPathParam("workspaces")
                .appendPathParam(request.getWorkspaceId())
                .appendPathParam("folders")
                .appendPathParam(request.getFolderKey())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleResponseHeaderString(
                        "opc-request-id", DeleteFolderResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<DeleteFunctionLibraryResponse> deleteFunctionLibrary(
            DeleteFunctionLibraryRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            DeleteFunctionLibraryRequest, DeleteFunctionLibraryResponse>
                    handler) {

        Validate.notBlank(request.getWorkspaceId(), "workspaceId must not be blank");

        Validate.notBlank(request.getFunctionLibraryKey(), "functionLibraryKey must not be blank");

        return clientCall(request, DeleteFunctionLibraryResponse::builder)
                .logger(LOG, "deleteFunctionLibrary")
                .serviceDetails(
                        "DataIntegration",
                        "DeleteFunctionLibrary",
                        "https://docs.oracle.com/iaas/api/#/en/data-integration/20200430/FunctionLibrary/DeleteFunctionLibrary")
                .method(com.oracle.bmc.http.client.Method.DELETE)
                .requestBuilder(DeleteFunctionLibraryRequest::builder)
                .basePath("/20200430")
                .appendPathParam("workspaces")
                .appendPathParam(request.getWorkspaceId())
                .appendPathParam("functionLibraries")
                .appendPathParam(request.getFunctionLibraryKey())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleResponseHeaderString(
                        "opc-request-id", DeleteFunctionLibraryResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<DeleteImportRequestResponse> deleteImportRequest(
            DeleteImportRequestRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            DeleteImportRequestRequest, DeleteImportRequestResponse>
                    handler) {

        Validate.notBlank(request.getImportRequestKey(), "importRequestKey must not be blank");

        Validate.notBlank(request.getWorkspaceId(), "workspaceId must not be blank");

        return clientCall(request, DeleteImportRequestResponse::builder)
                .logger(LOG, "deleteImportRequest")
                .serviceDetails(
                        "DataIntegration",
                        "DeleteImportRequest",
                        "https://docs.oracle.com/iaas/api/#/en/data-integration/20200430/Workspace/DeleteImportRequest")
                .method(com.oracle.bmc.http.client.Method.DELETE)
                .requestBuilder(DeleteImportRequestRequest::builder)
                .basePath("/20200430")
                .appendPathParam("workspaces")
                .appendPathParam(request.getWorkspaceId())
                .appendPathParam("importRequests")
                .appendPathParam(request.getImportRequestKey())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("if-match", request.getIfMatch())
                .handleResponseHeaderString(
                        "opc-request-id", DeleteImportRequestResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<DeletePatchResponse> deletePatch(
            DeletePatchRequest request,
            final com.oracle.bmc.responses.AsyncHandler<DeletePatchRequest, DeletePatchResponse>
                    handler) {

        Validate.notBlank(request.getWorkspaceId(), "workspaceId must not be blank");

        Validate.notBlank(request.getApplicationKey(), "applicationKey must not be blank");

        Validate.notBlank(request.getPatchKey(), "patchKey must not be blank");

        return clientCall(request, DeletePatchResponse::builder)
                .logger(LOG, "deletePatch")
                .serviceDetails(
                        "DataIntegration",
                        "DeletePatch",
                        "https://docs.oracle.com/iaas/api/#/en/data-integration/20200430/Application/DeletePatch")
                .method(com.oracle.bmc.http.client.Method.DELETE)
                .requestBuilder(DeletePatchRequest::builder)
                .basePath("/20200430")
                .appendPathParam("workspaces")
                .appendPathParam(request.getWorkspaceId())
                .appendPathParam("applications")
                .appendPathParam(request.getApplicationKey())
                .appendPathParam("patches")
                .appendPathParam(request.getPatchKey())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleResponseHeaderString(
                        "opc-request-id", DeletePatchResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<DeletePipelineResponse> deletePipeline(
            DeletePipelineRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            DeletePipelineRequest, DeletePipelineResponse>
                    handler) {

        Validate.notBlank(request.getWorkspaceId(), "workspaceId must not be blank");

        Validate.notBlank(request.getPipelineKey(), "pipelineKey must not be blank");

        return clientCall(request, DeletePipelineResponse::builder)
                .logger(LOG, "deletePipeline")
                .serviceDetails(
                        "DataIntegration",
                        "DeletePipeline",
                        "https://docs.oracle.com/iaas/api/#/en/data-integration/20200430/Pipeline/DeletePipeline")
                .method(com.oracle.bmc.http.client.Method.DELETE)
                .requestBuilder(DeletePipelineRequest::builder)
                .basePath("/20200430")
                .appendPathParam("workspaces")
                .appendPathParam(request.getWorkspaceId())
                .appendPathParam("pipelines")
                .appendPathParam(request.getPipelineKey())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleResponseHeaderString(
                        "opc-request-id", DeletePipelineResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<DeletePipelineValidationResponse> deletePipelineValidation(
            DeletePipelineValidationRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            DeletePipelineValidationRequest, DeletePipelineValidationResponse>
                    handler) {

        Validate.notBlank(request.getWorkspaceId(), "workspaceId must not be blank");

        Validate.notBlank(
                request.getPipelineValidationKey(), "pipelineValidationKey must not be blank");

        return clientCall(request, DeletePipelineValidationResponse::builder)
                .logger(LOG, "deletePipelineValidation")
                .serviceDetails(
                        "DataIntegration",
                        "DeletePipelineValidation",
                        "https://docs.oracle.com/iaas/api/#/en/data-integration/20200430/PipelineValidation/DeletePipelineValidation")
                .method(com.oracle.bmc.http.client.Method.DELETE)
                .requestBuilder(DeletePipelineValidationRequest::builder)
                .basePath("/20200430")
                .appendPathParam("workspaces")
                .appendPathParam(request.getWorkspaceId())
                .appendPathParam("pipelineValidations")
                .appendPathParam(request.getPipelineValidationKey())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleResponseHeaderString(
                        "opc-request-id", DeletePipelineValidationResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<DeleteProjectResponse> deleteProject(
            DeleteProjectRequest request,
            final com.oracle.bmc.responses.AsyncHandler<DeleteProjectRequest, DeleteProjectResponse>
                    handler) {

        Validate.notBlank(request.getWorkspaceId(), "workspaceId must not be blank");

        Validate.notBlank(request.getProjectKey(), "projectKey must not be blank");

        return clientCall(request, DeleteProjectResponse::builder)
                .logger(LOG, "deleteProject")
                .serviceDetails(
                        "DataIntegration",
                        "DeleteProject",
                        "https://docs.oracle.com/iaas/api/#/en/data-integration/20200430/Project/DeleteProject")
                .method(com.oracle.bmc.http.client.Method.DELETE)
                .requestBuilder(DeleteProjectRequest::builder)
                .basePath("/20200430")
                .appendPathParam("workspaces")
                .appendPathParam(request.getWorkspaceId())
                .appendPathParam("projects")
                .appendPathParam(request.getProjectKey())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleResponseHeaderString(
                        "opc-request-id", DeleteProjectResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<DeleteScheduleResponse> deleteSchedule(
            DeleteScheduleRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            DeleteScheduleRequest, DeleteScheduleResponse>
                    handler) {

        Validate.notBlank(request.getWorkspaceId(), "workspaceId must not be blank");

        Validate.notBlank(request.getApplicationKey(), "applicationKey must not be blank");

        Validate.notBlank(request.getScheduleKey(), "scheduleKey must not be blank");

        return clientCall(request, DeleteScheduleResponse::builder)
                .logger(LOG, "deleteSchedule")
                .serviceDetails(
                        "DataIntegration",
                        "DeleteSchedule",
                        "https://docs.oracle.com/iaas/api/#/en/data-integration/20200430/Schedule/DeleteSchedule")
                .method(com.oracle.bmc.http.client.Method.DELETE)
                .requestBuilder(DeleteScheduleRequest::builder)
                .basePath("/20200430")
                .appendPathParam("workspaces")
                .appendPathParam(request.getWorkspaceId())
                .appendPathParam("applications")
                .appendPathParam(request.getApplicationKey())
                .appendPathParam("schedules")
                .appendPathParam(request.getScheduleKey())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleResponseHeaderString(
                        "opc-request-id", DeleteScheduleResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<DeleteTaskResponse> deleteTask(
            DeleteTaskRequest request,
            final com.oracle.bmc.responses.AsyncHandler<DeleteTaskRequest, DeleteTaskResponse>
                    handler) {

        Validate.notBlank(request.getWorkspaceId(), "workspaceId must not be blank");

        Validate.notBlank(request.getTaskKey(), "taskKey must not be blank");

        return clientCall(request, DeleteTaskResponse::builder)
                .logger(LOG, "deleteTask")
                .serviceDetails(
                        "DataIntegration",
                        "DeleteTask",
                        "https://docs.oracle.com/iaas/api/#/en/data-integration/20200430/Task/DeleteTask")
                .method(com.oracle.bmc.http.client.Method.DELETE)
                .requestBuilder(DeleteTaskRequest::builder)
                .basePath("/20200430")
                .appendPathParam("workspaces")
                .appendPathParam(request.getWorkspaceId())
                .appendPathParam("tasks")
                .appendPathParam(request.getTaskKey())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleResponseHeaderString(
                        "opc-request-id", DeleteTaskResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<DeleteTaskRunResponse> deleteTaskRun(
            DeleteTaskRunRequest request,
            final com.oracle.bmc.responses.AsyncHandler<DeleteTaskRunRequest, DeleteTaskRunResponse>
                    handler) {

        Validate.notBlank(request.getWorkspaceId(), "workspaceId must not be blank");

        Validate.notBlank(request.getApplicationKey(), "applicationKey must not be blank");

        Validate.notBlank(request.getTaskRunKey(), "taskRunKey must not be blank");

        return clientCall(request, DeleteTaskRunResponse::builder)
                .logger(LOG, "deleteTaskRun")
                .serviceDetails(
                        "DataIntegration",
                        "DeleteTaskRun",
                        "https://docs.oracle.com/iaas/api/#/en/data-integration/20200430/TaskRun/DeleteTaskRun")
                .method(com.oracle.bmc.http.client.Method.DELETE)
                .requestBuilder(DeleteTaskRunRequest::builder)
                .basePath("/20200430")
                .appendPathParam("workspaces")
                .appendPathParam(request.getWorkspaceId())
                .appendPathParam("applications")
                .appendPathParam(request.getApplicationKey())
                .appendPathParam("taskRuns")
                .appendPathParam(request.getTaskRunKey())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleResponseHeaderString(
                        "opc-request-id", DeleteTaskRunResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<DeleteTaskScheduleResponse> deleteTaskSchedule(
            DeleteTaskScheduleRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            DeleteTaskScheduleRequest, DeleteTaskScheduleResponse>
                    handler) {

        Validate.notBlank(request.getWorkspaceId(), "workspaceId must not be blank");

        Validate.notBlank(request.getApplicationKey(), "applicationKey must not be blank");

        Validate.notBlank(request.getTaskScheduleKey(), "taskScheduleKey must not be blank");

        return clientCall(request, DeleteTaskScheduleResponse::builder)
                .logger(LOG, "deleteTaskSchedule")
                .serviceDetails(
                        "DataIntegration",
                        "DeleteTaskSchedule",
                        "https://docs.oracle.com/iaas/api/#/en/data-integration/20200430/TaskSchedule/DeleteTaskSchedule")
                .method(com.oracle.bmc.http.client.Method.DELETE)
                .requestBuilder(DeleteTaskScheduleRequest::builder)
                .basePath("/20200430")
                .appendPathParam("workspaces")
                .appendPathParam(request.getWorkspaceId())
                .appendPathParam("applications")
                .appendPathParam(request.getApplicationKey())
                .appendPathParam("taskSchedules")
                .appendPathParam(request.getTaskScheduleKey())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleResponseHeaderString(
                        "opc-request-id", DeleteTaskScheduleResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<DeleteTaskValidationResponse> deleteTaskValidation(
            DeleteTaskValidationRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            DeleteTaskValidationRequest, DeleteTaskValidationResponse>
                    handler) {

        Validate.notBlank(request.getWorkspaceId(), "workspaceId must not be blank");

        Validate.notBlank(request.getTaskValidationKey(), "taskValidationKey must not be blank");

        return clientCall(request, DeleteTaskValidationResponse::builder)
                .logger(LOG, "deleteTaskValidation")
                .serviceDetails(
                        "DataIntegration",
                        "DeleteTaskValidation",
                        "https://docs.oracle.com/iaas/api/#/en/data-integration/20200430/TaskValidation/DeleteTaskValidation")
                .method(com.oracle.bmc.http.client.Method.DELETE)
                .requestBuilder(DeleteTaskValidationRequest::builder)
                .basePath("/20200430")
                .appendPathParam("workspaces")
                .appendPathParam(request.getWorkspaceId())
                .appendPathParam("taskValidations")
                .appendPathParam(request.getTaskValidationKey())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleResponseHeaderString(
                        "opc-request-id", DeleteTaskValidationResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<DeleteUserDefinedFunctionResponse> deleteUserDefinedFunction(
            DeleteUserDefinedFunctionRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            DeleteUserDefinedFunctionRequest, DeleteUserDefinedFunctionResponse>
                    handler) {

        Validate.notBlank(request.getWorkspaceId(), "workspaceId must not be blank");

        Validate.notBlank(
                request.getUserDefinedFunctionKey(), "userDefinedFunctionKey must not be blank");

        return clientCall(request, DeleteUserDefinedFunctionResponse::builder)
                .logger(LOG, "deleteUserDefinedFunction")
                .serviceDetails(
                        "DataIntegration",
                        "DeleteUserDefinedFunction",
                        "https://docs.oracle.com/iaas/api/#/en/data-integration/20200430/UserDefinedFunction/DeleteUserDefinedFunction")
                .method(com.oracle.bmc.http.client.Method.DELETE)
                .requestBuilder(DeleteUserDefinedFunctionRequest::builder)
                .basePath("/20200430")
                .appendPathParam("workspaces")
                .appendPathParam(request.getWorkspaceId())
                .appendPathParam("userDefinedFunctions")
                .appendPathParam(request.getUserDefinedFunctionKey())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleResponseHeaderString(
                        "opc-request-id", DeleteUserDefinedFunctionResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<DeleteUserDefinedFunctionValidationResponse>
            deleteUserDefinedFunctionValidation(
                    DeleteUserDefinedFunctionValidationRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    DeleteUserDefinedFunctionValidationRequest,
                                    DeleteUserDefinedFunctionValidationResponse>
                            handler) {

        Validate.notBlank(request.getWorkspaceId(), "workspaceId must not be blank");

        Validate.notBlank(
                request.getUserDefinedFunctionValidationKey(),
                "userDefinedFunctionValidationKey must not be blank");

        return clientCall(request, DeleteUserDefinedFunctionValidationResponse::builder)
                .logger(LOG, "deleteUserDefinedFunctionValidation")
                .serviceDetails(
                        "DataIntegration",
                        "DeleteUserDefinedFunctionValidation",
                        "https://docs.oracle.com/iaas/api/#/en/data-integration/20200430/UserDefinedFunctionValidation/DeleteUserDefinedFunctionValidation")
                .method(com.oracle.bmc.http.client.Method.DELETE)
                .requestBuilder(DeleteUserDefinedFunctionValidationRequest::builder)
                .basePath("/20200430")
                .appendPathParam("workspaces")
                .appendPathParam(request.getWorkspaceId())
                .appendPathParam("userDefinedFunctionValidations")
                .appendPathParam(request.getUserDefinedFunctionValidationKey())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleResponseHeaderString(
                        "opc-request-id",
                        DeleteUserDefinedFunctionValidationResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<DeleteWorkspaceResponse> deleteWorkspace(
            DeleteWorkspaceRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            DeleteWorkspaceRequest, DeleteWorkspaceResponse>
                    handler) {

        Validate.notBlank(request.getWorkspaceId(), "workspaceId must not be blank");

        return clientCall(request, DeleteWorkspaceResponse::builder)
                .logger(LOG, "deleteWorkspace")
                .serviceDetails(
                        "DataIntegration",
                        "DeleteWorkspace",
                        "https://docs.oracle.com/iaas/api/#/en/data-integration/20200430/Workspace/DeleteWorkspace")
                .method(com.oracle.bmc.http.client.Method.DELETE)
                .requestBuilder(DeleteWorkspaceRequest::builder)
                .basePath("/20200430")
                .appendPathParam("workspaces")
                .appendPathParam(request.getWorkspaceId())
                .appendQueryParam("quiesceTimeout", request.getQuiesceTimeout())
                .appendQueryParam("isForceOperation", request.getIsForceOperation())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleResponseHeaderString(
                        "opc-request-id", DeleteWorkspaceResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-work-request-id", DeleteWorkspaceResponse.Builder::opcWorkRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<GetApplicationResponse> getApplication(
            GetApplicationRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            GetApplicationRequest, GetApplicationResponse>
                    handler) {

        Validate.notBlank(request.getWorkspaceId(), "workspaceId must not be blank");

        Validate.notBlank(request.getApplicationKey(), "applicationKey must not be blank");

        return clientCall(request, GetApplicationResponse::builder)
                .logger(LOG, "getApplication")
                .serviceDetails(
                        "DataIntegration",
                        "GetApplication",
                        "https://docs.oracle.com/iaas/api/#/en/data-integration/20200430/Application/GetApplication")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetApplicationRequest::builder)
                .basePath("/20200430")
                .appendPathParam("workspaces")
                .appendPathParam(request.getWorkspaceId())
                .appendPathParam("applications")
                .appendPathParam(request.getApplicationKey())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.dataintegration.model.Application.class,
                        GetApplicationResponse.Builder::application)
                .handleResponseHeaderString("etag", GetApplicationResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", GetApplicationResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<GetApplicationDetailedDescriptionResponse>
            getApplicationDetailedDescription(
                    GetApplicationDetailedDescriptionRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    GetApplicationDetailedDescriptionRequest,
                                    GetApplicationDetailedDescriptionResponse>
                            handler) {

        Validate.notBlank(request.getWorkspaceId(), "workspaceId must not be blank");

        Validate.notBlank(request.getApplicationKey(), "applicationKey must not be blank");

        return clientCall(request, GetApplicationDetailedDescriptionResponse::builder)
                .logger(LOG, "getApplicationDetailedDescription")
                .serviceDetails(
                        "DataIntegration",
                        "GetApplicationDetailedDescription",
                        "https://docs.oracle.com/iaas/api/#/en/data-integration/20200430/DetailedDescription/GetApplicationDetailedDescription")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetApplicationDetailedDescriptionRequest::builder)
                .basePath("/20200430")
                .appendPathParam("workspaces")
                .appendPathParam(request.getWorkspaceId())
                .appendPathParam("applications")
                .appendPathParam(request.getApplicationKey())
                .appendPathParam("detailedDescription")
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.dataintegration.model.DetailedDescription.class,
                        GetApplicationDetailedDescriptionResponse.Builder::detailedDescription)
                .handleResponseHeaderString(
                        "etag", GetApplicationDetailedDescriptionResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id",
                        GetApplicationDetailedDescriptionResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<GetCompositeStateResponse> getCompositeState(
            GetCompositeStateRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            GetCompositeStateRequest, GetCompositeStateResponse>
                    handler) {

        Validate.notBlank(request.getWorkspaceId(), "workspaceId must not be blank");

        Validate.notBlank(request.getApplicationKey(), "applicationKey must not be blank");
        Objects.requireNonNull(request.getAggregatorKey(), "aggregatorKey is required");

        return clientCall(request, GetCompositeStateResponse::builder)
                .logger(LOG, "getCompositeState")
                .serviceDetails(
                        "DataIntegration",
                        "GetCompositeState",
                        "https://docs.oracle.com/iaas/api/#/en/data-integration/20200430/CompositeState/GetCompositeState")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetCompositeStateRequest::builder)
                .basePath("/20200430")
                .appendPathParam("workspaces")
                .appendPathParam(request.getWorkspaceId())
                .appendPathParam("applications")
                .appendPathParam(request.getApplicationKey())
                .appendPathParam("compositeState")
                .appendQueryParam("aggregatorKey", request.getAggregatorKey())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.dataintegration.model.CompositeState.class,
                        GetCompositeStateResponse.Builder::compositeState)
                .handleResponseHeaderString(
                        "opc-request-id", GetCompositeStateResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<GetConnectionResponse> getConnection(
            GetConnectionRequest request,
            final com.oracle.bmc.responses.AsyncHandler<GetConnectionRequest, GetConnectionResponse>
                    handler) {

        Validate.notBlank(request.getWorkspaceId(), "workspaceId must not be blank");

        Validate.notBlank(request.getConnectionKey(), "connectionKey must not be blank");

        return clientCall(request, GetConnectionResponse::builder)
                .logger(LOG, "getConnection")
                .serviceDetails(
                        "DataIntegration",
                        "GetConnection",
                        "https://docs.oracle.com/iaas/api/#/en/data-integration/20200430/Connection/GetConnection")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetConnectionRequest::builder)
                .basePath("/20200430")
                .appendPathParam("workspaces")
                .appendPathParam(request.getWorkspaceId())
                .appendPathParam("connections")
                .appendPathParam(request.getConnectionKey())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.dataintegration.model.Connection.class,
                        GetConnectionResponse.Builder::connection)
                .handleResponseHeaderString("etag", GetConnectionResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", GetConnectionResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<GetConnectionValidationResponse> getConnectionValidation(
            GetConnectionValidationRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            GetConnectionValidationRequest, GetConnectionValidationResponse>
                    handler) {

        Validate.notBlank(request.getWorkspaceId(), "workspaceId must not be blank");

        Validate.notBlank(
                request.getConnectionValidationKey(), "connectionValidationKey must not be blank");

        return clientCall(request, GetConnectionValidationResponse::builder)
                .logger(LOG, "getConnectionValidation")
                .serviceDetails(
                        "DataIntegration",
                        "GetConnectionValidation",
                        "https://docs.oracle.com/iaas/api/#/en/data-integration/20200430/ConnectionValidation/GetConnectionValidation")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetConnectionValidationRequest::builder)
                .basePath("/20200430")
                .appendPathParam("workspaces")
                .appendPathParam(request.getWorkspaceId())
                .appendPathParam("connectionValidations")
                .appendPathParam(request.getConnectionValidationKey())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.dataintegration.model.ConnectionValidation.class,
                        GetConnectionValidationResponse.Builder::connectionValidation)
                .handleResponseHeaderString("etag", GetConnectionValidationResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", GetConnectionValidationResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<GetCopyObjectRequestResponse> getCopyObjectRequest(
            GetCopyObjectRequestRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            GetCopyObjectRequestRequest, GetCopyObjectRequestResponse>
                    handler) {

        Validate.notBlank(request.getWorkspaceId(), "workspaceId must not be blank");

        Validate.notBlank(
                request.getCopyObjectRequestKey(), "copyObjectRequestKey must not be blank");

        return clientCall(request, GetCopyObjectRequestResponse::builder)
                .logger(LOG, "getCopyObjectRequest")
                .serviceDetails(
                        "DataIntegration",
                        "GetCopyObjectRequest",
                        "https://docs.oracle.com/iaas/api/#/en/data-integration/20200430/CopyObjectRequest/GetCopyObjectRequest")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetCopyObjectRequestRequest::builder)
                .basePath("/20200430")
                .appendPathParam("workspaces")
                .appendPathParam(request.getWorkspaceId())
                .appendPathParam("copyObjectRequests")
                .appendPathParam(request.getCopyObjectRequestKey())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.dataintegration.model.CopyObjectRequest.class,
                        GetCopyObjectRequestResponse.Builder::copyObjectRequest)
                .handleResponseHeaderString(
                        "opc-request-id", GetCopyObjectRequestResponse.Builder::opcRequestId)
                .handleResponseHeaderString("etag", GetCopyObjectRequestResponse.Builder::etag)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<GetCountStatisticResponse> getCountStatistic(
            GetCountStatisticRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            GetCountStatisticRequest, GetCountStatisticResponse>
                    handler) {

        Validate.notBlank(request.getWorkspaceId(), "workspaceId must not be blank");

        Validate.notBlank(request.getCountStatisticKey(), "countStatisticKey must not be blank");

        return clientCall(request, GetCountStatisticResponse::builder)
                .logger(LOG, "getCountStatistic")
                .serviceDetails(
                        "DataIntegration",
                        "GetCountStatistic",
                        "https://docs.oracle.com/iaas/api/#/en/data-integration/20200430/Project/GetCountStatistic")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetCountStatisticRequest::builder)
                .basePath("/20200430")
                .appendPathParam("workspaces")
                .appendPathParam(request.getWorkspaceId())
                .appendPathParam("countStatistics")
                .appendPathParam(request.getCountStatisticKey())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.dataintegration.model.CountStatistic.class,
                        GetCountStatisticResponse.Builder::countStatistic)
                .handleResponseHeaderString(
                        "opc-request-id", GetCountStatisticResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", GetCountStatisticResponse.Builder::opcNextPage)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<GetDataAssetResponse> getDataAsset(
            GetDataAssetRequest request,
            final com.oracle.bmc.responses.AsyncHandler<GetDataAssetRequest, GetDataAssetResponse>
                    handler) {

        Validate.notBlank(request.getWorkspaceId(), "workspaceId must not be blank");

        Validate.notBlank(request.getDataAssetKey(), "dataAssetKey must not be blank");

        return clientCall(request, GetDataAssetResponse::builder)
                .logger(LOG, "getDataAsset")
                .serviceDetails(
                        "DataIntegration",
                        "GetDataAsset",
                        "https://docs.oracle.com/iaas/api/#/en/data-integration/20200430/DataAsset/GetDataAsset")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetDataAssetRequest::builder)
                .basePath("/20200430")
                .appendPathParam("workspaces")
                .appendPathParam(request.getWorkspaceId())
                .appendPathParam("dataAssets")
                .appendPathParam(request.getDataAssetKey())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.dataintegration.model.DataAsset.class,
                        GetDataAssetResponse.Builder::dataAsset)
                .handleResponseHeaderString("etag", GetDataAssetResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", GetDataAssetResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<GetDataEntityResponse> getDataEntity(
            GetDataEntityRequest request,
            final com.oracle.bmc.responses.AsyncHandler<GetDataEntityRequest, GetDataEntityResponse>
                    handler) {

        Validate.notBlank(request.getWorkspaceId(), "workspaceId must not be blank");

        Validate.notBlank(request.getConnectionKey(), "connectionKey must not be blank");

        Validate.notBlank(request.getSchemaResourceName(), "schemaResourceName must not be blank");

        Validate.notBlank(request.getDataEntityKey(), "dataEntityKey must not be blank");

        return clientCall(request, GetDataEntityResponse::builder)
                .logger(LOG, "getDataEntity")
                .serviceDetails(
                        "DataIntegration",
                        "GetDataEntity",
                        "https://docs.oracle.com/iaas/api/#/en/data-integration/20200430/DataEntity/GetDataEntity")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetDataEntityRequest::builder)
                .basePath("/20200430")
                .appendPathParam("workspaces")
                .appendPathParam(request.getWorkspaceId())
                .appendPathParam("connections")
                .appendPathParam(request.getConnectionKey())
                .appendPathParam("schemas")
                .appendPathParam(request.getSchemaResourceName())
                .appendPathParam("dataEntities")
                .appendPathParam(request.getDataEntityKey())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.dataintegration.model.DataEntity.class,
                        GetDataEntityResponse.Builder::dataEntity)
                .handleResponseHeaderString(
                        "opc-request-id", GetDataEntityResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<GetDataFlowResponse> getDataFlow(
            GetDataFlowRequest request,
            final com.oracle.bmc.responses.AsyncHandler<GetDataFlowRequest, GetDataFlowResponse>
                    handler) {

        Validate.notBlank(request.getWorkspaceId(), "workspaceId must not be blank");

        Validate.notBlank(request.getDataFlowKey(), "dataFlowKey must not be blank");

        return clientCall(request, GetDataFlowResponse::builder)
                .logger(LOG, "getDataFlow")
                .serviceDetails(
                        "DataIntegration",
                        "GetDataFlow",
                        "https://docs.oracle.com/iaas/api/#/en/data-integration/20200430/DataFlow/GetDataFlow")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetDataFlowRequest::builder)
                .basePath("/20200430")
                .appendPathParam("workspaces")
                .appendPathParam(request.getWorkspaceId())
                .appendPathParam("dataFlows")
                .appendPathParam(request.getDataFlowKey())
                .appendQueryParam("expandReferences", request.getExpandReferences())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.dataintegration.model.DataFlow.class,
                        GetDataFlowResponse.Builder::dataFlow)
                .handleResponseHeaderString("etag", GetDataFlowResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", GetDataFlowResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<GetDataFlowValidationResponse> getDataFlowValidation(
            GetDataFlowValidationRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            GetDataFlowValidationRequest, GetDataFlowValidationResponse>
                    handler) {

        Validate.notBlank(request.getWorkspaceId(), "workspaceId must not be blank");

        Validate.notBlank(
                request.getDataFlowValidationKey(), "dataFlowValidationKey must not be blank");

        return clientCall(request, GetDataFlowValidationResponse::builder)
                .logger(LOG, "getDataFlowValidation")
                .serviceDetails(
                        "DataIntegration",
                        "GetDataFlowValidation",
                        "https://docs.oracle.com/iaas/api/#/en/data-integration/20200430/DataFlowValidation/GetDataFlowValidation")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetDataFlowValidationRequest::builder)
                .basePath("/20200430")
                .appendPathParam("workspaces")
                .appendPathParam(request.getWorkspaceId())
                .appendPathParam("dataFlowValidations")
                .appendPathParam(request.getDataFlowValidationKey())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.dataintegration.model.DataFlowValidation.class,
                        GetDataFlowValidationResponse.Builder::dataFlowValidation)
                .handleResponseHeaderString("etag", GetDataFlowValidationResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", GetDataFlowValidationResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<GetDependentObjectResponse> getDependentObject(
            GetDependentObjectRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            GetDependentObjectRequest, GetDependentObjectResponse>
                    handler) {

        Validate.notBlank(request.getWorkspaceId(), "workspaceId must not be blank");

        Validate.notBlank(request.getApplicationKey(), "applicationKey must not be blank");

        Validate.notBlank(request.getDependentObjectKey(), "dependentObjectKey must not be blank");

        return clientCall(request, GetDependentObjectResponse::builder)
                .logger(LOG, "getDependentObject")
                .serviceDetails(
                        "DataIntegration",
                        "GetDependentObject",
                        "https://docs.oracle.com/iaas/api/#/en/data-integration/20200430/Application/GetDependentObject")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetDependentObjectRequest::builder)
                .basePath("/20200430")
                .appendPathParam("workspaces")
                .appendPathParam(request.getWorkspaceId())
                .appendPathParam("applications")
                .appendPathParam(request.getApplicationKey())
                .appendPathParam("dependentObjects")
                .appendPathParam(request.getDependentObjectKey())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.dataintegration.model.DependentObject.class,
                        GetDependentObjectResponse.Builder::dependentObject)
                .handleResponseHeaderString("etag", GetDependentObjectResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", GetDependentObjectResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<GetDisApplicationResponse> getDisApplication(
            GetDisApplicationRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            GetDisApplicationRequest, GetDisApplicationResponse>
                    handler) {

        Validate.notBlank(request.getWorkspaceId(), "workspaceId must not be blank");

        Validate.notBlank(request.getDisApplicationId(), "disApplicationId must not be blank");

        return clientCall(request, GetDisApplicationResponse::builder)
                .logger(LOG, "getDisApplication")
                .serviceDetails(
                        "DataIntegration",
                        "GetDisApplication",
                        "https://docs.oracle.com/iaas/api/#/en/data-integration/20200430/DisApplication/GetDisApplication")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetDisApplicationRequest::builder)
                .basePath("/20200430")
                .appendPathParam("workspaces")
                .appendPathParam(request.getWorkspaceId())
                .appendPathParam("disApplications")
                .appendPathParam(request.getDisApplicationId())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.dataintegration.model.DisApplication.class,
                        GetDisApplicationResponse.Builder::disApplication)
                .handleResponseHeaderString("etag", GetDisApplicationResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", GetDisApplicationResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<GetDisApplicationDetailedDescriptionResponse>
            getDisApplicationDetailedDescription(
                    GetDisApplicationDetailedDescriptionRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    GetDisApplicationDetailedDescriptionRequest,
                                    GetDisApplicationDetailedDescriptionResponse>
                            handler) {

        Validate.notBlank(request.getWorkspaceId(), "workspaceId must not be blank");

        Validate.notBlank(request.getApplicationKey(), "applicationKey must not be blank");

        return clientCall(request, GetDisApplicationDetailedDescriptionResponse::builder)
                .logger(LOG, "getDisApplicationDetailedDescription")
                .serviceDetails(
                        "DataIntegration",
                        "GetDisApplicationDetailedDescription",
                        "https://docs.oracle.com/iaas/api/#/en/data-integration/20200430/DetailedDescription/GetDisApplicationDetailedDescription")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetDisApplicationDetailedDescriptionRequest::builder)
                .basePath("/20200430")
                .appendPathParam("workspaces")
                .appendPathParam(request.getWorkspaceId())
                .appendPathParam("disApplications")
                .appendPathParam(request.getApplicationKey())
                .appendPathParam("detailedDescription")
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.dataintegration.model.DetailedDescription.class,
                        GetDisApplicationDetailedDescriptionResponse.Builder::detailedDescription)
                .handleResponseHeaderString(
                        "etag", GetDisApplicationDetailedDescriptionResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id",
                        GetDisApplicationDetailedDescriptionResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<GetExportRequestResponse> getExportRequest(
            GetExportRequestRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            GetExportRequestRequest, GetExportRequestResponse>
                    handler) {

        Validate.notBlank(request.getWorkspaceId(), "workspaceId must not be blank");

        Validate.notBlank(request.getExportRequestKey(), "exportRequestKey must not be blank");

        return clientCall(request, GetExportRequestResponse::builder)
                .logger(LOG, "getExportRequest")
                .serviceDetails(
                        "DataIntegration",
                        "GetExportRequest",
                        "https://docs.oracle.com/iaas/api/#/en/data-integration/20200430/ExportRequest/GetExportRequest")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetExportRequestRequest::builder)
                .basePath("/20200430")
                .appendPathParam("workspaces")
                .appendPathParam(request.getWorkspaceId())
                .appendPathParam("exportRequests")
                .appendPathParam(request.getExportRequestKey())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.dataintegration.model.ExportRequest.class,
                        GetExportRequestResponse.Builder::exportRequest)
                .handleResponseHeaderString(
                        "opc-request-id", GetExportRequestResponse.Builder::opcRequestId)
                .handleResponseHeaderString("etag", GetExportRequestResponse.Builder::etag)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<GetExternalPublicationResponse> getExternalPublication(
            GetExternalPublicationRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            GetExternalPublicationRequest, GetExternalPublicationResponse>
                    handler) {

        Validate.notBlank(request.getWorkspaceId(), "workspaceId must not be blank");

        Validate.notBlank(request.getTaskKey(), "taskKey must not be blank");

        Validate.notBlank(
                request.getExternalPublicationsKey(), "externalPublicationsKey must not be blank");

        return clientCall(request, GetExternalPublicationResponse::builder)
                .logger(LOG, "getExternalPublication")
                .serviceDetails(
                        "DataIntegration",
                        "GetExternalPublication",
                        "https://docs.oracle.com/iaas/api/#/en/data-integration/20200430/ExternalPublication/GetExternalPublication")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetExternalPublicationRequest::builder)
                .basePath("/20200430")
                .appendPathParam("workspaces")
                .appendPathParam(request.getWorkspaceId())
                .appendPathParam("tasks")
                .appendPathParam(request.getTaskKey())
                .appendPathParam("externalPublications")
                .appendPathParam(request.getExternalPublicationsKey())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.dataintegration.model.ExternalPublication.class,
                        GetExternalPublicationResponse.Builder::externalPublication)
                .handleResponseHeaderString("etag", GetExternalPublicationResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", GetExternalPublicationResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<GetExternalPublicationValidationResponse>
            getExternalPublicationValidation(
                    GetExternalPublicationValidationRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    GetExternalPublicationValidationRequest,
                                    GetExternalPublicationValidationResponse>
                            handler) {

        Validate.notBlank(request.getWorkspaceId(), "workspaceId must not be blank");

        Validate.notBlank(request.getTaskKey(), "taskKey must not be blank");

        Validate.notBlank(
                request.getExternalPublicationValidationKey(),
                "externalPublicationValidationKey must not be blank");

        return clientCall(request, GetExternalPublicationValidationResponse::builder)
                .logger(LOG, "getExternalPublicationValidation")
                .serviceDetails(
                        "DataIntegration",
                        "GetExternalPublicationValidation",
                        "https://docs.oracle.com/iaas/api/#/en/data-integration/20200430/ExternalPublicationValidation/GetExternalPublicationValidation")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetExternalPublicationValidationRequest::builder)
                .basePath("/20200430")
                .appendPathParam("workspaces")
                .appendPathParam(request.getWorkspaceId())
                .appendPathParam("tasks")
                .appendPathParam(request.getTaskKey())
                .appendPathParam("externalPublicationValidations")
                .appendPathParam(request.getExternalPublicationValidationKey())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.dataintegration.model.ExternalPublicationValidation.class,
                        GetExternalPublicationValidationResponse.Builder
                                ::externalPublicationValidation)
                .handleResponseHeaderString(
                        "etag", GetExternalPublicationValidationResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id",
                        GetExternalPublicationValidationResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<GetFolderResponse> getFolder(
            GetFolderRequest request,
            final com.oracle.bmc.responses.AsyncHandler<GetFolderRequest, GetFolderResponse>
                    handler) {

        Validate.notBlank(request.getWorkspaceId(), "workspaceId must not be blank");

        Validate.notBlank(request.getFolderKey(), "folderKey must not be blank");

        return clientCall(request, GetFolderResponse::builder)
                .logger(LOG, "getFolder")
                .serviceDetails(
                        "DataIntegration",
                        "GetFolder",
                        "https://docs.oracle.com/iaas/api/#/en/data-integration/20200430/Folder/GetFolder")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetFolderRequest::builder)
                .basePath("/20200430")
                .appendPathParam("workspaces")
                .appendPathParam(request.getWorkspaceId())
                .appendPathParam("folders")
                .appendPathParam(request.getFolderKey())
                .appendListQueryParam(
                        "projection",
                        request.getProjection(),
                        com.oracle.bmc.util.internal.CollectionFormatType.Multi)
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.dataintegration.model.Folder.class,
                        GetFolderResponse.Builder::folder)
                .handleResponseHeaderString("etag", GetFolderResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", GetFolderResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<GetFunctionLibraryResponse> getFunctionLibrary(
            GetFunctionLibraryRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            GetFunctionLibraryRequest, GetFunctionLibraryResponse>
                    handler) {

        Validate.notBlank(request.getWorkspaceId(), "workspaceId must not be blank");

        Validate.notBlank(request.getFunctionLibraryKey(), "functionLibraryKey must not be blank");

        return clientCall(request, GetFunctionLibraryResponse::builder)
                .logger(LOG, "getFunctionLibrary")
                .serviceDetails(
                        "DataIntegration",
                        "GetFunctionLibrary",
                        "https://docs.oracle.com/iaas/api/#/en/data-integration/20200430/FunctionLibrary/GetFunctionLibrary")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetFunctionLibraryRequest::builder)
                .basePath("/20200430")
                .appendPathParam("workspaces")
                .appendPathParam(request.getWorkspaceId())
                .appendPathParam("functionLibraries")
                .appendPathParam(request.getFunctionLibraryKey())
                .appendListQueryParam(
                        "projection",
                        request.getProjection(),
                        com.oracle.bmc.util.internal.CollectionFormatType.Multi)
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.dataintegration.model.FunctionLibrary.class,
                        GetFunctionLibraryResponse.Builder::functionLibrary)
                .handleResponseHeaderString("etag", GetFunctionLibraryResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", GetFunctionLibraryResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<GetImportRequestResponse> getImportRequest(
            GetImportRequestRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            GetImportRequestRequest, GetImportRequestResponse>
                    handler) {

        Validate.notBlank(request.getWorkspaceId(), "workspaceId must not be blank");

        Validate.notBlank(request.getImportRequestKey(), "importRequestKey must not be blank");

        return clientCall(request, GetImportRequestResponse::builder)
                .logger(LOG, "getImportRequest")
                .serviceDetails(
                        "DataIntegration",
                        "GetImportRequest",
                        "https://docs.oracle.com/iaas/api/#/en/data-integration/20200430/ImportRequest/GetImportRequest")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetImportRequestRequest::builder)
                .basePath("/20200430")
                .appendPathParam("workspaces")
                .appendPathParam(request.getWorkspaceId())
                .appendPathParam("importRequests")
                .appendPathParam(request.getImportRequestKey())
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.dataintegration.model.ImportRequest.class,
                        GetImportRequestResponse.Builder::importRequest)
                .handleResponseHeaderString(
                        "opc-request-id", GetImportRequestResponse.Builder::opcRequestId)
                .handleResponseHeaderString("etag", GetImportRequestResponse.Builder::etag)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<GetPatchResponse> getPatch(
            GetPatchRequest request,
            final com.oracle.bmc.responses.AsyncHandler<GetPatchRequest, GetPatchResponse>
                    handler) {

        Validate.notBlank(request.getWorkspaceId(), "workspaceId must not be blank");

        Validate.notBlank(request.getApplicationKey(), "applicationKey must not be blank");

        Validate.notBlank(request.getPatchKey(), "patchKey must not be blank");

        return clientCall(request, GetPatchResponse::builder)
                .logger(LOG, "getPatch")
                .serviceDetails(
                        "DataIntegration",
                        "GetPatch",
                        "https://docs.oracle.com/iaas/api/#/en/data-integration/20200430/Application/GetPatch")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetPatchRequest::builder)
                .basePath("/20200430")
                .appendPathParam("workspaces")
                .appendPathParam(request.getWorkspaceId())
                .appendPathParam("applications")
                .appendPathParam(request.getApplicationKey())
                .appendPathParam("patches")
                .appendPathParam(request.getPatchKey())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.dataintegration.model.Patch.class,
                        GetPatchResponse.Builder::patch)
                .handleResponseHeaderString("etag", GetPatchResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", GetPatchResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<GetPipelineResponse> getPipeline(
            GetPipelineRequest request,
            final com.oracle.bmc.responses.AsyncHandler<GetPipelineRequest, GetPipelineResponse>
                    handler) {

        Validate.notBlank(request.getWorkspaceId(), "workspaceId must not be blank");

        Validate.notBlank(request.getPipelineKey(), "pipelineKey must not be blank");

        return clientCall(request, GetPipelineResponse::builder)
                .logger(LOG, "getPipeline")
                .serviceDetails(
                        "DataIntegration",
                        "GetPipeline",
                        "https://docs.oracle.com/iaas/api/#/en/data-integration/20200430/Pipeline/GetPipeline")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetPipelineRequest::builder)
                .basePath("/20200430")
                .appendPathParam("workspaces")
                .appendPathParam(request.getWorkspaceId())
                .appendPathParam("pipelines")
                .appendPathParam(request.getPipelineKey())
                .appendQueryParam("expandReferences", request.getExpandReferences())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.dataintegration.model.Pipeline.class,
                        GetPipelineResponse.Builder::pipeline)
                .handleResponseHeaderString("etag", GetPipelineResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", GetPipelineResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<GetPipelineValidationResponse> getPipelineValidation(
            GetPipelineValidationRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            GetPipelineValidationRequest, GetPipelineValidationResponse>
                    handler) {

        Validate.notBlank(request.getWorkspaceId(), "workspaceId must not be blank");

        Validate.notBlank(
                request.getPipelineValidationKey(), "pipelineValidationKey must not be blank");

        return clientCall(request, GetPipelineValidationResponse::builder)
                .logger(LOG, "getPipelineValidation")
                .serviceDetails(
                        "DataIntegration",
                        "GetPipelineValidation",
                        "https://docs.oracle.com/iaas/api/#/en/data-integration/20200430/PipelineValidation/GetPipelineValidation")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetPipelineValidationRequest::builder)
                .basePath("/20200430")
                .appendPathParam("workspaces")
                .appendPathParam(request.getWorkspaceId())
                .appendPathParam("pipelineValidations")
                .appendPathParam(request.getPipelineValidationKey())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.dataintegration.model.PipelineValidation.class,
                        GetPipelineValidationResponse.Builder::pipelineValidation)
                .handleResponseHeaderString("etag", GetPipelineValidationResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", GetPipelineValidationResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<GetProjectResponse> getProject(
            GetProjectRequest request,
            final com.oracle.bmc.responses.AsyncHandler<GetProjectRequest, GetProjectResponse>
                    handler) {

        Validate.notBlank(request.getWorkspaceId(), "workspaceId must not be blank");

        Validate.notBlank(request.getProjectKey(), "projectKey must not be blank");

        return clientCall(request, GetProjectResponse::builder)
                .logger(LOG, "getProject")
                .serviceDetails(
                        "DataIntegration",
                        "GetProject",
                        "https://docs.oracle.com/iaas/api/#/en/data-integration/20200430/Project/GetProject")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetProjectRequest::builder)
                .basePath("/20200430")
                .appendPathParam("workspaces")
                .appendPathParam(request.getWorkspaceId())
                .appendPathParam("projects")
                .appendPathParam(request.getProjectKey())
                .appendListQueryParam(
                        "projection",
                        request.getProjection(),
                        com.oracle.bmc.util.internal.CollectionFormatType.Multi)
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.dataintegration.model.Project.class,
                        GetProjectResponse.Builder::project)
                .handleResponseHeaderString("etag", GetProjectResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", GetProjectResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<GetPublishedObjectResponse> getPublishedObject(
            GetPublishedObjectRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            GetPublishedObjectRequest, GetPublishedObjectResponse>
                    handler) {

        Validate.notBlank(request.getWorkspaceId(), "workspaceId must not be blank");

        Validate.notBlank(request.getApplicationKey(), "applicationKey must not be blank");

        Validate.notBlank(request.getPublishedObjectKey(), "publishedObjectKey must not be blank");

        return clientCall(request, GetPublishedObjectResponse::builder)
                .logger(LOG, "getPublishedObject")
                .serviceDetails(
                        "DataIntegration",
                        "GetPublishedObject",
                        "https://docs.oracle.com/iaas/api/#/en/data-integration/20200430/Application/GetPublishedObject")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetPublishedObjectRequest::builder)
                .basePath("/20200430")
                .appendPathParam("workspaces")
                .appendPathParam(request.getWorkspaceId())
                .appendPathParam("applications")
                .appendPathParam(request.getApplicationKey())
                .appendPathParam("publishedObjects")
                .appendPathParam(request.getPublishedObjectKey())
                .appendQueryParam("expandReferences", request.getExpandReferences())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.dataintegration.model.PublishedObject.class,
                        GetPublishedObjectResponse.Builder::publishedObject)
                .handleResponseHeaderString("etag", GetPublishedObjectResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", GetPublishedObjectResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<GetReferenceResponse> getReference(
            GetReferenceRequest request,
            final com.oracle.bmc.responses.AsyncHandler<GetReferenceRequest, GetReferenceResponse>
                    handler) {

        Validate.notBlank(request.getWorkspaceId(), "workspaceId must not be blank");

        Validate.notBlank(request.getApplicationKey(), "applicationKey must not be blank");

        Validate.notBlank(request.getReferenceKey(), "referenceKey must not be blank");

        return clientCall(request, GetReferenceResponse::builder)
                .logger(LOG, "getReference")
                .serviceDetails(
                        "DataIntegration",
                        "GetReference",
                        "https://docs.oracle.com/iaas/api/#/en/data-integration/20200430/Reference/GetReference")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetReferenceRequest::builder)
                .basePath("/20200430")
                .appendPathParam("workspaces")
                .appendPathParam(request.getWorkspaceId())
                .appendPathParam("applications")
                .appendPathParam(request.getApplicationKey())
                .appendPathParam("references")
                .appendPathParam(request.getReferenceKey())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.dataintegration.model.Reference.class,
                        GetReferenceResponse.Builder::reference)
                .handleResponseHeaderString("etag", GetReferenceResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", GetReferenceResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<GetRuntimeOperatorResponse> getRuntimeOperator(
            GetRuntimeOperatorRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            GetRuntimeOperatorRequest, GetRuntimeOperatorResponse>
                    handler) {

        Validate.notBlank(request.getWorkspaceId(), "workspaceId must not be blank");

        Validate.notBlank(request.getApplicationKey(), "applicationKey must not be blank");

        Validate.notBlank(request.getRuntimePipelineKey(), "runtimePipelineKey must not be blank");

        Validate.notBlank(request.getRuntimeOperatorKey(), "runtimeOperatorKey must not be blank");

        return clientCall(request, GetRuntimeOperatorResponse::builder)
                .logger(LOG, "getRuntimeOperator")
                .serviceDetails(
                        "DataIntegration",
                        "GetRuntimeOperator",
                        "https://docs.oracle.com/iaas/api/#/en/data-integration/20200430/RuntimeOperator/GetRuntimeOperator")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetRuntimeOperatorRequest::builder)
                .basePath("/20200430")
                .appendPathParam("workspaces")
                .appendPathParam(request.getWorkspaceId())
                .appendPathParam("applications")
                .appendPathParam(request.getApplicationKey())
                .appendPathParam("runtimePipelines")
                .appendPathParam(request.getRuntimePipelineKey())
                .appendPathParam("runtimeOperators")
                .appendPathParam(request.getRuntimeOperatorKey())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.dataintegration.model.RuntimeOperator.class,
                        GetRuntimeOperatorResponse.Builder::runtimeOperator)
                .handleResponseHeaderString("etag", GetRuntimeOperatorResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", GetRuntimeOperatorResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<GetRuntimePipelineResponse> getRuntimePipeline(
            GetRuntimePipelineRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            GetRuntimePipelineRequest, GetRuntimePipelineResponse>
                    handler) {

        Validate.notBlank(request.getWorkspaceId(), "workspaceId must not be blank");

        Validate.notBlank(request.getApplicationKey(), "applicationKey must not be blank");

        Validate.notBlank(request.getRuntimePipelineKey(), "runtimePipelineKey must not be blank");

        return clientCall(request, GetRuntimePipelineResponse::builder)
                .logger(LOG, "getRuntimePipeline")
                .serviceDetails(
                        "DataIntegration",
                        "GetRuntimePipeline",
                        "https://docs.oracle.com/iaas/api/#/en/data-integration/20200430/RuntimePipeline/GetRuntimePipeline")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetRuntimePipelineRequest::builder)
                .basePath("/20200430")
                .appendPathParam("workspaces")
                .appendPathParam(request.getWorkspaceId())
                .appendPathParam("applications")
                .appendPathParam(request.getApplicationKey())
                .appendPathParam("runtimePipelines")
                .appendPathParam(request.getRuntimePipelineKey())
                .appendQueryParam("expandReferences", request.getExpandReferences())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.dataintegration.model.RuntimePipeline.class,
                        GetRuntimePipelineResponse.Builder::runtimePipeline)
                .handleResponseHeaderString("etag", GetRuntimePipelineResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", GetRuntimePipelineResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<GetScheduleResponse> getSchedule(
            GetScheduleRequest request,
            final com.oracle.bmc.responses.AsyncHandler<GetScheduleRequest, GetScheduleResponse>
                    handler) {

        Validate.notBlank(request.getWorkspaceId(), "workspaceId must not be blank");

        Validate.notBlank(request.getApplicationKey(), "applicationKey must not be blank");

        Validate.notBlank(request.getScheduleKey(), "scheduleKey must not be blank");

        return clientCall(request, GetScheduleResponse::builder)
                .logger(LOG, "getSchedule")
                .serviceDetails(
                        "DataIntegration",
                        "GetSchedule",
                        "https://docs.oracle.com/iaas/api/#/en/data-integration/20200430/Schedule/GetSchedule")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetScheduleRequest::builder)
                .basePath("/20200430")
                .appendPathParam("workspaces")
                .appendPathParam(request.getWorkspaceId())
                .appendPathParam("applications")
                .appendPathParam(request.getApplicationKey())
                .appendPathParam("schedules")
                .appendPathParam(request.getScheduleKey())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.dataintegration.model.Schedule.class,
                        GetScheduleResponse.Builder::schedule)
                .handleResponseHeaderString("etag", GetScheduleResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", GetScheduleResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<GetSchemaResponse> getSchema(
            GetSchemaRequest request,
            final com.oracle.bmc.responses.AsyncHandler<GetSchemaRequest, GetSchemaResponse>
                    handler) {

        Validate.notBlank(request.getWorkspaceId(), "workspaceId must not be blank");

        Validate.notBlank(request.getConnectionKey(), "connectionKey must not be blank");

        Validate.notBlank(request.getSchemaResourceName(), "schemaResourceName must not be blank");

        return clientCall(request, GetSchemaResponse::builder)
                .logger(LOG, "getSchema")
                .serviceDetails(
                        "DataIntegration",
                        "GetSchema",
                        "https://docs.oracle.com/iaas/api/#/en/data-integration/20200430/Schema/GetSchema")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetSchemaRequest::builder)
                .basePath("/20200430")
                .appendPathParam("workspaces")
                .appendPathParam(request.getWorkspaceId())
                .appendPathParam("connections")
                .appendPathParam(request.getConnectionKey())
                .appendPathParam("schemas")
                .appendPathParam(request.getSchemaResourceName())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.dataintegration.model.Schema.class,
                        GetSchemaResponse.Builder::schema)
                .handleResponseHeaderString(
                        "opc-request-id", GetSchemaResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<GetTaskResponse> getTask(
            GetTaskRequest request,
            final com.oracle.bmc.responses.AsyncHandler<GetTaskRequest, GetTaskResponse> handler) {

        Validate.notBlank(request.getWorkspaceId(), "workspaceId must not be blank");

        Validate.notBlank(request.getTaskKey(), "taskKey must not be blank");

        return clientCall(request, GetTaskResponse::builder)
                .logger(LOG, "getTask")
                .serviceDetails(
                        "DataIntegration",
                        "GetTask",
                        "https://docs.oracle.com/iaas/api/#/en/data-integration/20200430/Task/GetTask")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetTaskRequest::builder)
                .basePath("/20200430")
                .appendPathParam("workspaces")
                .appendPathParam(request.getWorkspaceId())
                .appendPathParam("tasks")
                .appendPathParam(request.getTaskKey())
                .appendQueryParam("expandReferences", request.getExpandReferences())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.dataintegration.model.Task.class,
                        GetTaskResponse.Builder::task)
                .handleResponseHeaderString("etag", GetTaskResponse.Builder::etag)
                .handleResponseHeaderString("opc-request-id", GetTaskResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<GetTaskRunResponse> getTaskRun(
            GetTaskRunRequest request,
            final com.oracle.bmc.responses.AsyncHandler<GetTaskRunRequest, GetTaskRunResponse>
                    handler) {

        Validate.notBlank(request.getWorkspaceId(), "workspaceId must not be blank");

        Validate.notBlank(request.getApplicationKey(), "applicationKey must not be blank");

        Validate.notBlank(request.getTaskRunKey(), "taskRunKey must not be blank");

        return clientCall(request, GetTaskRunResponse::builder)
                .logger(LOG, "getTaskRun")
                .serviceDetails(
                        "DataIntegration",
                        "GetTaskRun",
                        "https://docs.oracle.com/iaas/api/#/en/data-integration/20200430/TaskRun/GetTaskRun")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetTaskRunRequest::builder)
                .basePath("/20200430")
                .appendPathParam("workspaces")
                .appendPathParam(request.getWorkspaceId())
                .appendPathParam("applications")
                .appendPathParam(request.getApplicationKey())
                .appendPathParam("taskRuns")
                .appendPathParam(request.getTaskRunKey())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.dataintegration.model.TaskRun.class,
                        GetTaskRunResponse.Builder::taskRun)
                .handleResponseHeaderString("etag", GetTaskRunResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", GetTaskRunResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<GetTaskScheduleResponse> getTaskSchedule(
            GetTaskScheduleRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            GetTaskScheduleRequest, GetTaskScheduleResponse>
                    handler) {

        Validate.notBlank(request.getWorkspaceId(), "workspaceId must not be blank");

        Validate.notBlank(request.getApplicationKey(), "applicationKey must not be blank");

        Validate.notBlank(request.getTaskScheduleKey(), "taskScheduleKey must not be blank");

        return clientCall(request, GetTaskScheduleResponse::builder)
                .logger(LOG, "getTaskSchedule")
                .serviceDetails(
                        "DataIntegration",
                        "GetTaskSchedule",
                        "https://docs.oracle.com/iaas/api/#/en/data-integration/20200430/TaskSchedule/GetTaskSchedule")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetTaskScheduleRequest::builder)
                .basePath("/20200430")
                .appendPathParam("workspaces")
                .appendPathParam(request.getWorkspaceId())
                .appendPathParam("applications")
                .appendPathParam(request.getApplicationKey())
                .appendPathParam("taskSchedules")
                .appendPathParam(request.getTaskScheduleKey())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.dataintegration.model.TaskSchedule.class,
                        GetTaskScheduleResponse.Builder::taskSchedule)
                .handleResponseHeaderString("etag", GetTaskScheduleResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", GetTaskScheduleResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<GetTaskValidationResponse> getTaskValidation(
            GetTaskValidationRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            GetTaskValidationRequest, GetTaskValidationResponse>
                    handler) {

        Validate.notBlank(request.getWorkspaceId(), "workspaceId must not be blank");

        Validate.notBlank(request.getTaskValidationKey(), "taskValidationKey must not be blank");

        return clientCall(request, GetTaskValidationResponse::builder)
                .logger(LOG, "getTaskValidation")
                .serviceDetails(
                        "DataIntegration",
                        "GetTaskValidation",
                        "https://docs.oracle.com/iaas/api/#/en/data-integration/20200430/TaskValidation/GetTaskValidation")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetTaskValidationRequest::builder)
                .basePath("/20200430")
                .appendPathParam("workspaces")
                .appendPathParam(request.getWorkspaceId())
                .appendPathParam("taskValidations")
                .appendPathParam(request.getTaskValidationKey())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.dataintegration.model.TaskValidation.class,
                        GetTaskValidationResponse.Builder::taskValidation)
                .handleResponseHeaderString("etag", GetTaskValidationResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", GetTaskValidationResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<GetTemplateResponse> getTemplate(
            GetTemplateRequest request,
            final com.oracle.bmc.responses.AsyncHandler<GetTemplateRequest, GetTemplateResponse>
                    handler) {

        Validate.notBlank(request.getWorkspaceId(), "workspaceId must not be blank");

        Validate.notBlank(request.getTemplateId(), "templateId must not be blank");

        return clientCall(request, GetTemplateResponse::builder)
                .logger(LOG, "getTemplate")
                .serviceDetails(
                        "DataIntegration",
                        "GetTemplate",
                        "https://docs.oracle.com/iaas/api/#/en/data-integration/20200430/Template/GetTemplate")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetTemplateRequest::builder)
                .basePath("/20200430")
                .appendPathParam("workspaces")
                .appendPathParam(request.getWorkspaceId())
                .appendPathParam("templates")
                .appendPathParam(request.getTemplateId())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.dataintegration.model.Template.class,
                        GetTemplateResponse.Builder::template)
                .handleResponseHeaderString(
                        "opc-request-id", GetTemplateResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<GetUserDefinedFunctionResponse> getUserDefinedFunction(
            GetUserDefinedFunctionRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            GetUserDefinedFunctionRequest, GetUserDefinedFunctionResponse>
                    handler) {

        Validate.notBlank(request.getWorkspaceId(), "workspaceId must not be blank");

        Validate.notBlank(
                request.getUserDefinedFunctionKey(), "userDefinedFunctionKey must not be blank");

        return clientCall(request, GetUserDefinedFunctionResponse::builder)
                .logger(LOG, "getUserDefinedFunction")
                .serviceDetails(
                        "DataIntegration",
                        "GetUserDefinedFunction",
                        "https://docs.oracle.com/iaas/api/#/en/data-integration/20200430/UserDefinedFunction/GetUserDefinedFunction")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetUserDefinedFunctionRequest::builder)
                .basePath("/20200430")
                .appendPathParam("workspaces")
                .appendPathParam(request.getWorkspaceId())
                .appendPathParam("userDefinedFunctions")
                .appendPathParam(request.getUserDefinedFunctionKey())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.dataintegration.model.UserDefinedFunction.class,
                        GetUserDefinedFunctionResponse.Builder::userDefinedFunction)
                .handleResponseHeaderString("etag", GetUserDefinedFunctionResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", GetUserDefinedFunctionResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<GetUserDefinedFunctionValidationResponse>
            getUserDefinedFunctionValidation(
                    GetUserDefinedFunctionValidationRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    GetUserDefinedFunctionValidationRequest,
                                    GetUserDefinedFunctionValidationResponse>
                            handler) {

        Validate.notBlank(request.getWorkspaceId(), "workspaceId must not be blank");

        Validate.notBlank(
                request.getUserDefinedFunctionValidationKey(),
                "userDefinedFunctionValidationKey must not be blank");

        return clientCall(request, GetUserDefinedFunctionValidationResponse::builder)
                .logger(LOG, "getUserDefinedFunctionValidation")
                .serviceDetails(
                        "DataIntegration",
                        "GetUserDefinedFunctionValidation",
                        "https://docs.oracle.com/iaas/api/#/en/data-integration/20200430/UserDefinedFunctionValidation/GetUserDefinedFunctionValidation")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetUserDefinedFunctionValidationRequest::builder)
                .basePath("/20200430")
                .appendPathParam("workspaces")
                .appendPathParam(request.getWorkspaceId())
                .appendPathParam("userDefinedFunctionValidations")
                .appendPathParam(request.getUserDefinedFunctionValidationKey())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.dataintegration.model.UserDefinedFunctionValidation.class,
                        GetUserDefinedFunctionValidationResponse.Builder
                                ::userDefinedFunctionValidation)
                .handleResponseHeaderString(
                        "etag", GetUserDefinedFunctionValidationResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id",
                        GetUserDefinedFunctionValidationResponse.Builder::opcRequestId)
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
                        "DataIntegration",
                        "GetWorkRequest",
                        "https://docs.oracle.com/iaas/api/#/en/data-integration/20200430/WorkRequest/GetWorkRequest")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetWorkRequestRequest::builder)
                .basePath("/20200430")
                .appendPathParam("workRequests")
                .appendPathParam(request.getWorkRequestId())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.dataintegration.model.WorkRequest.class,
                        GetWorkRequestResponse.Builder::workRequest)
                .handleResponseHeaderString("etag", GetWorkRequestResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", GetWorkRequestResponse.Builder::opcRequestId)
                .handleResponseHeaderInteger(
                        "retry-after", GetWorkRequestResponse.Builder::retryAfter)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<GetWorkspaceResponse> getWorkspace(
            GetWorkspaceRequest request,
            final com.oracle.bmc.responses.AsyncHandler<GetWorkspaceRequest, GetWorkspaceResponse>
                    handler) {

        Validate.notBlank(request.getWorkspaceId(), "workspaceId must not be blank");

        return clientCall(request, GetWorkspaceResponse::builder)
                .logger(LOG, "getWorkspace")
                .serviceDetails(
                        "DataIntegration",
                        "GetWorkspace",
                        "https://docs.oracle.com/iaas/api/#/en/data-integration/20200430/Workspace/GetWorkspace")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetWorkspaceRequest::builder)
                .basePath("/20200430")
                .appendPathParam("workspaces")
                .appendPathParam(request.getWorkspaceId())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.dataintegration.model.Workspace.class,
                        GetWorkspaceResponse.Builder::workspace)
                .handleResponseHeaderString("etag", GetWorkspaceResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", GetWorkspaceResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ListApplicationsResponse> listApplications(
            ListApplicationsRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ListApplicationsRequest, ListApplicationsResponse>
                    handler) {

        Validate.notBlank(request.getWorkspaceId(), "workspaceId must not be blank");

        return clientCall(request, ListApplicationsResponse::builder)
                .logger(LOG, "listApplications")
                .serviceDetails(
                        "DataIntegration",
                        "ListApplications",
                        "https://docs.oracle.com/iaas/api/#/en/data-integration/20200430/Application/ListApplications")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListApplicationsRequest::builder)
                .basePath("/20200430")
                .appendPathParam("workspaces")
                .appendPathParam(request.getWorkspaceId())
                .appendPathParam("applications")
                .appendQueryParam("name", request.getName())
                .appendQueryParam("nameContains", request.getNameContains())
                .appendListQueryParam(
                        "identifier",
                        request.getIdentifier(),
                        com.oracle.bmc.util.internal.CollectionFormatType.Multi)
                .appendListQueryParam(
                        "fields",
                        request.getFields(),
                        com.oracle.bmc.util.internal.CollectionFormatType.Multi)
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.dataintegration.model.ApplicationSummaryCollection.class,
                        ListApplicationsResponse.Builder::applicationSummaryCollection)
                .handleResponseHeaderString(
                        "opc-request-id", ListApplicationsResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListApplicationsResponse.Builder::opcNextPage)
                .handleResponseHeaderString(
                        "opc-prev-page", ListApplicationsResponse.Builder::opcPrevPage)
                .handleResponseHeaderInteger(
                        "opc-total-items", ListApplicationsResponse.Builder::opcTotalItems)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ListConnectionValidationsResponse> listConnectionValidations(
            ListConnectionValidationsRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ListConnectionValidationsRequest, ListConnectionValidationsResponse>
                    handler) {

        Validate.notBlank(request.getWorkspaceId(), "workspaceId must not be blank");

        return clientCall(request, ListConnectionValidationsResponse::builder)
                .logger(LOG, "listConnectionValidations")
                .serviceDetails(
                        "DataIntegration",
                        "ListConnectionValidations",
                        "https://docs.oracle.com/iaas/api/#/en/data-integration/20200430/ConnectionValidation/ListConnectionValidations")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListConnectionValidationsRequest::builder)
                .basePath("/20200430")
                .appendPathParam("workspaces")
                .appendPathParam(request.getWorkspaceId())
                .appendPathParam("connectionValidations")
                .appendQueryParam("key", request.getKey())
                .appendQueryParam("name", request.getName())
                .appendQueryParam("identifier", request.getIdentifier())
                .appendListQueryParam(
                        "fields",
                        request.getFields(),
                        com.oracle.bmc.util.internal.CollectionFormatType.Multi)
                .appendQueryParam("page", request.getPage())
                .appendQueryParam("limit", request.getLimit())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.dataintegration.model.ConnectionValidationSummaryCollection
                                .class,
                        ListConnectionValidationsResponse.Builder
                                ::connectionValidationSummaryCollection)
                .handleResponseHeaderString(
                        "opc-request-id", ListConnectionValidationsResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListConnectionValidationsResponse.Builder::opcNextPage)
                .handleResponseHeaderString(
                        "opc-prev-page", ListConnectionValidationsResponse.Builder::opcPrevPage)
                .handleResponseHeaderInteger(
                        "opc-total-items", ListConnectionValidationsResponse.Builder::opcTotalItems)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ListConnectionsResponse> listConnections(
            ListConnectionsRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ListConnectionsRequest, ListConnectionsResponse>
                    handler) {

        Validate.notBlank(request.getWorkspaceId(), "workspaceId must not be blank");
        Objects.requireNonNull(request.getDataAssetKey(), "dataAssetKey is required");

        return clientCall(request, ListConnectionsResponse::builder)
                .logger(LOG, "listConnections")
                .serviceDetails(
                        "DataIntegration",
                        "ListConnections",
                        "https://docs.oracle.com/iaas/api/#/en/data-integration/20200430/Connection/ListConnections")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListConnectionsRequest::builder)
                .basePath("/20200430")
                .appendPathParam("workspaces")
                .appendPathParam(request.getWorkspaceId())
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
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.dataintegration.model.ConnectionSummaryCollection.class,
                        ListConnectionsResponse.Builder::connectionSummaryCollection)
                .handleResponseHeaderString(
                        "opc-request-id", ListConnectionsResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListConnectionsResponse.Builder::opcNextPage)
                .handleResponseHeaderString(
                        "opc-prev-page", ListConnectionsResponse.Builder::opcPrevPage)
                .handleResponseHeaderInteger(
                        "opc-total-items", ListConnectionsResponse.Builder::opcTotalItems)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ListCopyObjectRequestsResponse> listCopyObjectRequests(
            ListCopyObjectRequestsRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ListCopyObjectRequestsRequest, ListCopyObjectRequestsResponse>
                    handler) {

        Validate.notBlank(request.getWorkspaceId(), "workspaceId must not be blank");

        return clientCall(request, ListCopyObjectRequestsResponse::builder)
                .logger(LOG, "listCopyObjectRequests")
                .serviceDetails(
                        "DataIntegration",
                        "ListCopyObjectRequests",
                        "https://docs.oracle.com/iaas/api/#/en/data-integration/20200430/CopyObjectRequestSummaryCollection/ListCopyObjectRequests")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListCopyObjectRequestsRequest::builder)
                .basePath("/20200430")
                .appendPathParam("workspaces")
                .appendPathParam(request.getWorkspaceId())
                .appendPathParam("copyObjectRequests")
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .appendQueryParam("name", request.getName())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .appendEnumQueryParam("copyStatus", request.getCopyStatus())
                .appendEnumQueryParam("projection", request.getProjection())
                .appendQueryParam("timeStartedInMillis", request.getTimeStartedInMillis())
                .appendQueryParam("timeEndedInMillis", request.getTimeEndedInMillis())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.dataintegration.model.CopyObjectRequestSummaryCollection
                                .class,
                        ListCopyObjectRequestsResponse.Builder::copyObjectRequestSummaryCollection)
                .handleResponseHeaderString(
                        "opc-request-id", ListCopyObjectRequestsResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListCopyObjectRequestsResponse.Builder::opcNextPage)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ListDataAssetsResponse> listDataAssets(
            ListDataAssetsRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ListDataAssetsRequest, ListDataAssetsResponse>
                    handler) {

        Validate.notBlank(request.getWorkspaceId(), "workspaceId must not be blank");

        return clientCall(request, ListDataAssetsResponse::builder)
                .logger(LOG, "listDataAssets")
                .serviceDetails(
                        "DataIntegration",
                        "ListDataAssets",
                        "https://docs.oracle.com/iaas/api/#/en/data-integration/20200430/DataAsset/ListDataAssets")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListDataAssetsRequest::builder)
                .basePath("/20200430")
                .appendPathParam("workspaces")
                .appendPathParam(request.getWorkspaceId())
                .appendPathParam("dataAssets")
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
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.dataintegration.model.DataAssetSummaryCollection.class,
                        ListDataAssetsResponse.Builder::dataAssetSummaryCollection)
                .handleResponseHeaderString(
                        "opc-request-id", ListDataAssetsResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListDataAssetsResponse.Builder::opcNextPage)
                .handleResponseHeaderString(
                        "opc-prev-page", ListDataAssetsResponse.Builder::opcPrevPage)
                .handleResponseHeaderInteger(
                        "opc-total-items", ListDataAssetsResponse.Builder::opcTotalItems)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ListDataEntitiesResponse> listDataEntities(
            ListDataEntitiesRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ListDataEntitiesRequest, ListDataEntitiesResponse>
                    handler) {

        Validate.notBlank(request.getWorkspaceId(), "workspaceId must not be blank");

        Validate.notBlank(request.getConnectionKey(), "connectionKey must not be blank");

        Validate.notBlank(request.getSchemaResourceName(), "schemaResourceName must not be blank");

        return clientCall(request, ListDataEntitiesResponse::builder)
                .logger(LOG, "listDataEntities")
                .serviceDetails(
                        "DataIntegration",
                        "ListDataEntities",
                        "https://docs.oracle.com/iaas/api/#/en/data-integration/20200430/DataEntity/ListDataEntities")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListDataEntitiesRequest::builder)
                .basePath("/20200430")
                .appendPathParam("workspaces")
                .appendPathParam(request.getWorkspaceId())
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
                .appendListQueryParam(
                        "nameList",
                        request.getNameList(),
                        com.oracle.bmc.util.internal.CollectionFormatType.Multi)
                .appendQueryParam("isPattern", request.getIsPattern())
                .appendListQueryParam(
                        "includeTypes",
                        request.getIncludeTypes(),
                        com.oracle.bmc.util.internal.CollectionFormatType.Multi)
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.dataintegration.model.DataEntitySummaryCollection.class,
                        ListDataEntitiesResponse.Builder::dataEntitySummaryCollection)
                .handleResponseHeaderString(
                        "opc-request-id", ListDataEntitiesResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListDataEntitiesResponse.Builder::opcNextPage)
                .handleResponseHeaderString(
                        "opc-prev-page", ListDataEntitiesResponse.Builder::opcPrevPage)
                .handleResponseHeaderInteger(
                        "opc-total-items", ListDataEntitiesResponse.Builder::opcTotalItems)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ListDataFlowValidationsResponse> listDataFlowValidations(
            ListDataFlowValidationsRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ListDataFlowValidationsRequest, ListDataFlowValidationsResponse>
                    handler) {

        Validate.notBlank(request.getWorkspaceId(), "workspaceId must not be blank");

        return clientCall(request, ListDataFlowValidationsResponse::builder)
                .logger(LOG, "listDataFlowValidations")
                .serviceDetails(
                        "DataIntegration",
                        "ListDataFlowValidations",
                        "https://docs.oracle.com/iaas/api/#/en/data-integration/20200430/DataFlowValidation/ListDataFlowValidations")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListDataFlowValidationsRequest::builder)
                .basePath("/20200430")
                .appendPathParam("workspaces")
                .appendPathParam(request.getWorkspaceId())
                .appendPathParam("dataFlowValidations")
                .appendQueryParam("key", request.getKey())
                .appendQueryParam("name", request.getName())
                .appendQueryParam("identifier", request.getIdentifier())
                .appendListQueryParam(
                        "fields",
                        request.getFields(),
                        com.oracle.bmc.util.internal.CollectionFormatType.Multi)
                .appendQueryParam("page", request.getPage())
                .appendQueryParam("limit", request.getLimit())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.dataintegration.model.DataFlowValidationSummaryCollection
                                .class,
                        ListDataFlowValidationsResponse.Builder
                                ::dataFlowValidationSummaryCollection)
                .handleResponseHeaderString(
                        "opc-request-id", ListDataFlowValidationsResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListDataFlowValidationsResponse.Builder::opcNextPage)
                .handleResponseHeaderString(
                        "opc-prev-page", ListDataFlowValidationsResponse.Builder::opcPrevPage)
                .handleResponseHeaderInteger(
                        "opc-total-items", ListDataFlowValidationsResponse.Builder::opcTotalItems)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ListDataFlowsResponse> listDataFlows(
            ListDataFlowsRequest request,
            final com.oracle.bmc.responses.AsyncHandler<ListDataFlowsRequest, ListDataFlowsResponse>
                    handler) {

        Validate.notBlank(request.getWorkspaceId(), "workspaceId must not be blank");

        return clientCall(request, ListDataFlowsResponse::builder)
                .logger(LOG, "listDataFlows")
                .serviceDetails(
                        "DataIntegration",
                        "ListDataFlows",
                        "https://docs.oracle.com/iaas/api/#/en/data-integration/20200430/DataFlow/ListDataFlows")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListDataFlowsRequest::builder)
                .basePath("/20200430")
                .appendPathParam("workspaces")
                .appendPathParam(request.getWorkspaceId())
                .appendPathParam("dataFlows")
                .appendQueryParam("folderId", request.getFolderId())
                .appendListQueryParam(
                        "fields",
                        request.getFields(),
                        com.oracle.bmc.util.internal.CollectionFormatType.Multi)
                .appendQueryParam("name", request.getName())
                .appendListQueryParam(
                        "identifier",
                        request.getIdentifier(),
                        com.oracle.bmc.util.internal.CollectionFormatType.Multi)
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.dataintegration.model.DataFlowSummaryCollection.class,
                        ListDataFlowsResponse.Builder::dataFlowSummaryCollection)
                .handleResponseHeaderString(
                        "opc-request-id", ListDataFlowsResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListDataFlowsResponse.Builder::opcNextPage)
                .handleResponseHeaderString(
                        "opc-prev-page", ListDataFlowsResponse.Builder::opcPrevPage)
                .handleResponseHeaderInteger(
                        "opc-total-items", ListDataFlowsResponse.Builder::opcTotalItems)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ListDependentObjectsResponse> listDependentObjects(
            ListDependentObjectsRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ListDependentObjectsRequest, ListDependentObjectsResponse>
                    handler) {

        Validate.notBlank(request.getWorkspaceId(), "workspaceId must not be blank");

        Validate.notBlank(request.getApplicationKey(), "applicationKey must not be blank");

        return clientCall(request, ListDependentObjectsResponse::builder)
                .logger(LOG, "listDependentObjects")
                .serviceDetails(
                        "DataIntegration",
                        "ListDependentObjects",
                        "https://docs.oracle.com/iaas/api/#/en/data-integration/20200430/Application/ListDependentObjects")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListDependentObjectsRequest::builder)
                .basePath("/20200430")
                .appendPathParam("workspaces")
                .appendPathParam(request.getWorkspaceId())
                .appendPathParam("applications")
                .appendPathParam(request.getApplicationKey())
                .appendPathParam("dependentObjects")
                .appendListQueryParam(
                        "fields",
                        request.getFields(),
                        com.oracle.bmc.util.internal.CollectionFormatType.Multi)
                .appendQueryParam("name", request.getName())
                .appendQueryParam("nameContains", request.getNameContains())
                .appendListQueryParam(
                        "identifier",
                        request.getIdentifier(),
                        com.oracle.bmc.util.internal.CollectionFormatType.Multi)
                .appendListQueryParam(
                        "type",
                        request.getType(),
                        com.oracle.bmc.util.internal.CollectionFormatType.Multi)
                .appendQueryParam("typeInSubtree", request.getTypeInSubtree())
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.dataintegration.model.DependentObjectSummaryCollection.class,
                        ListDependentObjectsResponse.Builder::dependentObjectSummaryCollection)
                .handleResponseHeaderString(
                        "opc-request-id", ListDependentObjectsResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListDependentObjectsResponse.Builder::opcNextPage)
                .handleResponseHeaderString(
                        "opc-prev-page", ListDependentObjectsResponse.Builder::opcPrevPage)
                .handleResponseHeaderInteger(
                        "opc-total-items", ListDependentObjectsResponse.Builder::opcTotalItems)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ListDisApplicationTaskRunLineagesResponse>
            listDisApplicationTaskRunLineages(
                    ListDisApplicationTaskRunLineagesRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    ListDisApplicationTaskRunLineagesRequest,
                                    ListDisApplicationTaskRunLineagesResponse>
                            handler) {

        Validate.notBlank(request.getWorkspaceId(), "workspaceId must not be blank");

        Validate.notBlank(request.getDisApplicationId(), "disApplicationId must not be blank");

        return clientCall(request, ListDisApplicationTaskRunLineagesResponse::builder)
                .logger(LOG, "listDisApplicationTaskRunLineages")
                .serviceDetails(
                        "DataIntegration",
                        "ListDisApplicationTaskRunLineages",
                        "https://docs.oracle.com/iaas/api/#/en/data-integration/20200430/TaskRunLineageSummaryCollection/ListDisApplicationTaskRunLineages")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListDisApplicationTaskRunLineagesRequest::builder)
                .basePath("/20200430")
                .appendPathParam("workspaces")
                .appendPathParam(request.getWorkspaceId())
                .appendPathParam("disApplications")
                .appendPathParam(request.getDisApplicationId())
                .appendPathParam("taskRunLineages")
                .appendListQueryParam(
                        "fields",
                        request.getFields(),
                        com.oracle.bmc.util.internal.CollectionFormatType.Multi)
                .appendQueryParam("page", request.getPage())
                .appendQueryParam("limit", request.getLimit())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .appendListQueryParam(
                        "filter",
                        request.getFilter(),
                        com.oracle.bmc.util.internal.CollectionFormatType.Multi)
                .appendQueryParam("timeUpdatedGreaterThan", request.getTimeUpdatedGreaterThan())
                .appendQueryParam(
                        "timeUpdatedGreaterThanOrEqualTo",
                        request.getTimeUpdatedGreaterThanOrEqualTo())
                .appendQueryParam("timeUpatedLessThan", request.getTimeUpatedLessThan())
                .appendQueryParam(
                        "timeUpatedLessThanOrEqualTo", request.getTimeUpatedLessThanOrEqualTo())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.dataintegration.model.TaskRunLineageSummaryCollection.class,
                        ListDisApplicationTaskRunLineagesResponse.Builder
                                ::taskRunLineageSummaryCollection)
                .handleResponseHeaderString(
                        "opc-request-id",
                        ListDisApplicationTaskRunLineagesResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page",
                        ListDisApplicationTaskRunLineagesResponse.Builder::opcNextPage)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ListDisApplicationsResponse> listDisApplications(
            ListDisApplicationsRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ListDisApplicationsRequest, ListDisApplicationsResponse>
                    handler) {

        Validate.notBlank(request.getWorkspaceId(), "workspaceId must not be blank");
        Objects.requireNonNull(request.getCompartmentId(), "compartmentId is required");

        return clientCall(request, ListDisApplicationsResponse::builder)
                .logger(LOG, "listDisApplications")
                .serviceDetails(
                        "DataIntegration",
                        "ListDisApplications",
                        "https://docs.oracle.com/iaas/api/#/en/data-integration/20200430/DisApplication/ListDisApplications")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListDisApplicationsRequest::builder)
                .basePath("/20200430")
                .appendPathParam("workspaces")
                .appendPathParam(request.getWorkspaceId())
                .appendPathParam("disApplications")
                .appendQueryParam("name", request.getName())
                .appendQueryParam("nameContains", request.getNameContains())
                .appendListQueryParam(
                        "identifier",
                        request.getIdentifier(),
                        com.oracle.bmc.util.internal.CollectionFormatType.Multi)
                .appendListQueryParam(
                        "fields",
                        request.getFields(),
                        com.oracle.bmc.util.internal.CollectionFormatType.Multi)
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .appendQueryParam("compartmentId", request.getCompartmentId())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.dataintegration.model.DisApplicationSummaryCollection.class,
                        ListDisApplicationsResponse.Builder::disApplicationSummaryCollection)
                .handleResponseHeaderString(
                        "opc-request-id", ListDisApplicationsResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListDisApplicationsResponse.Builder::opcNextPage)
                .handleResponseHeaderString(
                        "opc-prev-page", ListDisApplicationsResponse.Builder::opcPrevPage)
                .handleResponseHeaderInteger(
                        "opc-total-items", ListDisApplicationsResponse.Builder::opcTotalItems)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ListExportRequestsResponse> listExportRequests(
            ListExportRequestsRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ListExportRequestsRequest, ListExportRequestsResponse>
                    handler) {

        Validate.notBlank(request.getWorkspaceId(), "workspaceId must not be blank");

        return clientCall(request, ListExportRequestsResponse::builder)
                .logger(LOG, "listExportRequests")
                .serviceDetails(
                        "DataIntegration",
                        "ListExportRequests",
                        "https://docs.oracle.com/iaas/api/#/en/data-integration/20200430/ExportRequestSummaryCollection/ListExportRequests")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListExportRequestsRequest::builder)
                .basePath("/20200430")
                .appendPathParam("workspaces")
                .appendPathParam(request.getWorkspaceId())
                .appendPathParam("exportRequests")
                .appendQueryParam("page", request.getPage())
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("name", request.getName())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .appendEnumQueryParam("exportStatus", request.getExportStatus())
                .appendEnumQueryParam("projection", request.getProjection())
                .appendQueryParam("timeStartedInMillis", request.getTimeStartedInMillis())
                .appendQueryParam("timeEndedInMillis", request.getTimeEndedInMillis())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.dataintegration.model.ExportRequestSummaryCollection.class,
                        ListExportRequestsResponse.Builder::exportRequestSummaryCollection)
                .handleResponseHeaderString(
                        "opc-request-id", ListExportRequestsResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListExportRequestsResponse.Builder::opcNextPage)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ListExternalPublicationValidationsResponse>
            listExternalPublicationValidations(
                    ListExternalPublicationValidationsRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    ListExternalPublicationValidationsRequest,
                                    ListExternalPublicationValidationsResponse>
                            handler) {

        Validate.notBlank(request.getWorkspaceId(), "workspaceId must not be blank");

        Validate.notBlank(request.getTaskKey(), "taskKey must not be blank");

        return clientCall(request, ListExternalPublicationValidationsResponse::builder)
                .logger(LOG, "listExternalPublicationValidations")
                .serviceDetails(
                        "DataIntegration",
                        "ListExternalPublicationValidations",
                        "https://docs.oracle.com/iaas/api/#/en/data-integration/20200430/ExternalPublicationValidation/ListExternalPublicationValidations")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListExternalPublicationValidationsRequest::builder)
                .basePath("/20200430")
                .appendPathParam("workspaces")
                .appendPathParam(request.getWorkspaceId())
                .appendPathParam("tasks")
                .appendPathParam(request.getTaskKey())
                .appendPathParam("externalPublicationValidations")
                .appendListQueryParam(
                        "fields",
                        request.getFields(),
                        com.oracle.bmc.util.internal.CollectionFormatType.Multi)
                .appendQueryParam("name", request.getName())
                .appendListQueryParam(
                        "identifier",
                        request.getIdentifier(),
                        com.oracle.bmc.util.internal.CollectionFormatType.Multi)
                .appendQueryParam("page", request.getPage())
                .appendQueryParam("limit", request.getLimit())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.dataintegration.model
                                .ExternalPublicationValidationSummaryCollection.class,
                        ListExternalPublicationValidationsResponse.Builder
                                ::externalPublicationValidationSummaryCollection)
                .handleResponseHeaderString(
                        "opc-request-id",
                        ListExternalPublicationValidationsResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page",
                        ListExternalPublicationValidationsResponse.Builder::opcNextPage)
                .handleResponseHeaderString(
                        "opc-prev-page",
                        ListExternalPublicationValidationsResponse.Builder::opcPrevPage)
                .handleResponseHeaderInteger(
                        "opc-total-items",
                        ListExternalPublicationValidationsResponse.Builder::opcTotalItems)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ListExternalPublicationsResponse> listExternalPublications(
            ListExternalPublicationsRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ListExternalPublicationsRequest, ListExternalPublicationsResponse>
                    handler) {

        Validate.notBlank(request.getWorkspaceId(), "workspaceId must not be blank");

        Validate.notBlank(request.getTaskKey(), "taskKey must not be blank");

        return clientCall(request, ListExternalPublicationsResponse::builder)
                .logger(LOG, "listExternalPublications")
                .serviceDetails(
                        "DataIntegration",
                        "ListExternalPublications",
                        "https://docs.oracle.com/iaas/api/#/en/data-integration/20200430/ExternalPublication/ListExternalPublications")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListExternalPublicationsRequest::builder)
                .basePath("/20200430")
                .appendPathParam("workspaces")
                .appendPathParam(request.getWorkspaceId())
                .appendPathParam("tasks")
                .appendPathParam(request.getTaskKey())
                .appendPathParam("externalPublications")
                .appendListQueryParam(
                        "fields",
                        request.getFields(),
                        com.oracle.bmc.util.internal.CollectionFormatType.Multi)
                .appendQueryParam("name", request.getName())
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.dataintegration.model.ExternalPublicationSummaryCollection
                                .class,
                        ListExternalPublicationsResponse.Builder
                                ::externalPublicationSummaryCollection)
                .handleResponseHeaderString(
                        "opc-request-id", ListExternalPublicationsResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListExternalPublicationsResponse.Builder::opcNextPage)
                .handleResponseHeaderString(
                        "opc-prev-page", ListExternalPublicationsResponse.Builder::opcPrevPage)
                .handleResponseHeaderInteger(
                        "opc-total-items", ListExternalPublicationsResponse.Builder::opcTotalItems)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ListFoldersResponse> listFolders(
            ListFoldersRequest request,
            final com.oracle.bmc.responses.AsyncHandler<ListFoldersRequest, ListFoldersResponse>
                    handler) {

        Validate.notBlank(request.getWorkspaceId(), "workspaceId must not be blank");

        return clientCall(request, ListFoldersResponse::builder)
                .logger(LOG, "listFolders")
                .serviceDetails(
                        "DataIntegration",
                        "ListFolders",
                        "https://docs.oracle.com/iaas/api/#/en/data-integration/20200430/Folder/ListFolders")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListFoldersRequest::builder)
                .basePath("/20200430")
                .appendPathParam("workspaces")
                .appendPathParam(request.getWorkspaceId())
                .appendPathParam("folders")
                .appendQueryParam("aggregatorKey", request.getAggregatorKey())
                .appendListQueryParam(
                        "fields",
                        request.getFields(),
                        com.oracle.bmc.util.internal.CollectionFormatType.Multi)
                .appendQueryParam("name", request.getName())
                .appendQueryParam("nameContains", request.getNameContains())
                .appendListQueryParam(
                        "identifier",
                        request.getIdentifier(),
                        com.oracle.bmc.util.internal.CollectionFormatType.Multi)
                .appendQueryParam("page", request.getPage())
                .appendQueryParam("limit", request.getLimit())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.dataintegration.model.FolderSummaryCollection.class,
                        ListFoldersResponse.Builder::folderSummaryCollection)
                .handleResponseHeaderString(
                        "opc-request-id", ListFoldersResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListFoldersResponse.Builder::opcNextPage)
                .handleResponseHeaderString(
                        "opc-prev-page", ListFoldersResponse.Builder::opcPrevPage)
                .handleResponseHeaderInteger(
                        "opc-total-items", ListFoldersResponse.Builder::opcTotalItems)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ListFunctionLibrariesResponse> listFunctionLibraries(
            ListFunctionLibrariesRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ListFunctionLibrariesRequest, ListFunctionLibrariesResponse>
                    handler) {

        Validate.notBlank(request.getWorkspaceId(), "workspaceId must not be blank");

        return clientCall(request, ListFunctionLibrariesResponse::builder)
                .logger(LOG, "listFunctionLibraries")
                .serviceDetails(
                        "DataIntegration",
                        "ListFunctionLibraries",
                        "https://docs.oracle.com/iaas/api/#/en/data-integration/20200430/FunctionLibrary/ListFunctionLibraries")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListFunctionLibrariesRequest::builder)
                .basePath("/20200430")
                .appendPathParam("workspaces")
                .appendPathParam(request.getWorkspaceId())
                .appendPathParam("functionLibraries")
                .appendQueryParam("aggregatorKey", request.getAggregatorKey())
                .appendListQueryParam(
                        "fields",
                        request.getFields(),
                        com.oracle.bmc.util.internal.CollectionFormatType.Multi)
                .appendQueryParam("name", request.getName())
                .appendListQueryParam(
                        "identifier",
                        request.getIdentifier(),
                        com.oracle.bmc.util.internal.CollectionFormatType.Multi)
                .appendQueryParam("page", request.getPage())
                .appendQueryParam("limit", request.getLimit())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.dataintegration.model.FunctionLibrarySummaryCollection.class,
                        ListFunctionLibrariesResponse.Builder::functionLibrarySummaryCollection)
                .handleResponseHeaderString(
                        "opc-request-id", ListFunctionLibrariesResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListFunctionLibrariesResponse.Builder::opcNextPage)
                .handleResponseHeaderString(
                        "opc-prev-page", ListFunctionLibrariesResponse.Builder::opcPrevPage)
                .handleResponseHeaderInteger(
                        "opc-total-items", ListFunctionLibrariesResponse.Builder::opcTotalItems)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ListImportRequestsResponse> listImportRequests(
            ListImportRequestsRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ListImportRequestsRequest, ListImportRequestsResponse>
                    handler) {

        Validate.notBlank(request.getWorkspaceId(), "workspaceId must not be blank");

        return clientCall(request, ListImportRequestsResponse::builder)
                .logger(LOG, "listImportRequests")
                .serviceDetails(
                        "DataIntegration",
                        "ListImportRequests",
                        "https://docs.oracle.com/iaas/api/#/en/data-integration/20200430/ImportRequestSummaryCollection/ListImportRequests")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListImportRequestsRequest::builder)
                .basePath("/20200430")
                .appendPathParam("workspaces")
                .appendPathParam(request.getWorkspaceId())
                .appendPathParam("importRequests")
                .appendQueryParam("page", request.getPage())
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("name", request.getName())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .appendEnumQueryParam("importStatus", request.getImportStatus())
                .appendEnumQueryParam("projection", request.getProjection())
                .appendQueryParam("timeStartedInMillis", request.getTimeStartedInMillis())
                .appendQueryParam("timeEndedInMillis", request.getTimeEndedInMillis())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.dataintegration.model.ImportRequestSummaryCollection.class,
                        ListImportRequestsResponse.Builder::importRequestSummaryCollection)
                .handleResponseHeaderString(
                        "opc-request-id", ListImportRequestsResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListImportRequestsResponse.Builder::opcNextPage)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ListPatchChangesResponse> listPatchChanges(
            ListPatchChangesRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ListPatchChangesRequest, ListPatchChangesResponse>
                    handler) {

        Validate.notBlank(request.getWorkspaceId(), "workspaceId must not be blank");

        Validate.notBlank(request.getApplicationKey(), "applicationKey must not be blank");

        return clientCall(request, ListPatchChangesResponse::builder)
                .logger(LOG, "listPatchChanges")
                .serviceDetails(
                        "DataIntegration",
                        "ListPatchChanges",
                        "https://docs.oracle.com/iaas/api/#/en/data-integration/20200430/Application/ListPatchChanges")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListPatchChangesRequest::builder)
                .basePath("/20200430")
                .appendPathParam("workspaces")
                .appendPathParam(request.getWorkspaceId())
                .appendPathParam("applications")
                .appendPathParam(request.getApplicationKey())
                .appendPathParam("patchChanges")
                .appendQueryParam("name", request.getName())
                .appendQueryParam("sincePatch", request.getSincePatch())
                .appendQueryParam("toPatch", request.getToPatch())
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.dataintegration.model.PatchChangeSummaryCollection.class,
                        ListPatchChangesResponse.Builder::patchChangeSummaryCollection)
                .handleResponseHeaderString(
                        "opc-request-id", ListPatchChangesResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListPatchChangesResponse.Builder::opcNextPage)
                .handleResponseHeaderString(
                        "opc-prev-page", ListPatchChangesResponse.Builder::opcPrevPage)
                .handleResponseHeaderInteger(
                        "opc-total-items", ListPatchChangesResponse.Builder::opcTotalItems)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ListPatchesResponse> listPatches(
            ListPatchesRequest request,
            final com.oracle.bmc.responses.AsyncHandler<ListPatchesRequest, ListPatchesResponse>
                    handler) {

        Validate.notBlank(request.getWorkspaceId(), "workspaceId must not be blank");

        Validate.notBlank(request.getApplicationKey(), "applicationKey must not be blank");

        return clientCall(request, ListPatchesResponse::builder)
                .logger(LOG, "listPatches")
                .serviceDetails(
                        "DataIntegration",
                        "ListPatches",
                        "https://docs.oracle.com/iaas/api/#/en/data-integration/20200430/Application/ListPatches")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListPatchesRequest::builder)
                .basePath("/20200430")
                .appendPathParam("workspaces")
                .appendPathParam(request.getWorkspaceId())
                .appendPathParam("applications")
                .appendPathParam(request.getApplicationKey())
                .appendPathParam("patches")
                .appendQueryParam("name", request.getName())
                .appendListQueryParam(
                        "identifier",
                        request.getIdentifier(),
                        com.oracle.bmc.util.internal.CollectionFormatType.Multi)
                .appendListQueryParam(
                        "fields",
                        request.getFields(),
                        com.oracle.bmc.util.internal.CollectionFormatType.Multi)
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.dataintegration.model.PatchSummaryCollection.class,
                        ListPatchesResponse.Builder::patchSummaryCollection)
                .handleResponseHeaderString(
                        "opc-request-id", ListPatchesResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListPatchesResponse.Builder::opcNextPage)
                .handleResponseHeaderString(
                        "opc-prev-page", ListPatchesResponse.Builder::opcPrevPage)
                .handleResponseHeaderInteger(
                        "opc-total-items", ListPatchesResponse.Builder::opcTotalItems)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ListPipelineValidationsResponse> listPipelineValidations(
            ListPipelineValidationsRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ListPipelineValidationsRequest, ListPipelineValidationsResponse>
                    handler) {

        Validate.notBlank(request.getWorkspaceId(), "workspaceId must not be blank");

        return clientCall(request, ListPipelineValidationsResponse::builder)
                .logger(LOG, "listPipelineValidations")
                .serviceDetails(
                        "DataIntegration",
                        "ListPipelineValidations",
                        "https://docs.oracle.com/iaas/api/#/en/data-integration/20200430/PipelineValidation/ListPipelineValidations")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListPipelineValidationsRequest::builder)
                .basePath("/20200430")
                .appendPathParam("workspaces")
                .appendPathParam(request.getWorkspaceId())
                .appendPathParam("pipelineValidations")
                .appendQueryParam("key", request.getKey())
                .appendQueryParam("name", request.getName())
                .appendQueryParam("identifier", request.getIdentifier())
                .appendListQueryParam(
                        "fields",
                        request.getFields(),
                        com.oracle.bmc.util.internal.CollectionFormatType.Multi)
                .appendQueryParam("page", request.getPage())
                .appendQueryParam("limit", request.getLimit())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.dataintegration.model.PipelineValidationSummaryCollection
                                .class,
                        ListPipelineValidationsResponse.Builder
                                ::pipelineValidationSummaryCollection)
                .handleResponseHeaderString(
                        "opc-request-id", ListPipelineValidationsResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListPipelineValidationsResponse.Builder::opcNextPage)
                .handleResponseHeaderString(
                        "opc-prev-page", ListPipelineValidationsResponse.Builder::opcPrevPage)
                .handleResponseHeaderInteger(
                        "opc-total-items", ListPipelineValidationsResponse.Builder::opcTotalItems)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ListPipelinesResponse> listPipelines(
            ListPipelinesRequest request,
            final com.oracle.bmc.responses.AsyncHandler<ListPipelinesRequest, ListPipelinesResponse>
                    handler) {

        Validate.notBlank(request.getWorkspaceId(), "workspaceId must not be blank");

        return clientCall(request, ListPipelinesResponse::builder)
                .logger(LOG, "listPipelines")
                .serviceDetails(
                        "DataIntegration",
                        "ListPipelines",
                        "https://docs.oracle.com/iaas/api/#/en/data-integration/20200430/Pipeline/ListPipelines")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListPipelinesRequest::builder)
                .basePath("/20200430")
                .appendPathParam("workspaces")
                .appendPathParam(request.getWorkspaceId())
                .appendPathParam("pipelines")
                .appendQueryParam("aggregatorKey", request.getAggregatorKey())
                .appendListQueryParam(
                        "fields",
                        request.getFields(),
                        com.oracle.bmc.util.internal.CollectionFormatType.Multi)
                .appendQueryParam("name", request.getName())
                .appendListQueryParam(
                        "identifier",
                        request.getIdentifier(),
                        com.oracle.bmc.util.internal.CollectionFormatType.Multi)
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.dataintegration.model.PipelineSummaryCollection.class,
                        ListPipelinesResponse.Builder::pipelineSummaryCollection)
                .handleResponseHeaderString(
                        "opc-request-id", ListPipelinesResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListPipelinesResponse.Builder::opcNextPage)
                .handleResponseHeaderString(
                        "opc-prev-page", ListPipelinesResponse.Builder::opcPrevPage)
                .handleResponseHeaderInteger(
                        "opc-total-items", ListPipelinesResponse.Builder::opcTotalItems)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ListProjectsResponse> listProjects(
            ListProjectsRequest request,
            final com.oracle.bmc.responses.AsyncHandler<ListProjectsRequest, ListProjectsResponse>
                    handler) {

        Validate.notBlank(request.getWorkspaceId(), "workspaceId must not be blank");

        return clientCall(request, ListProjectsResponse::builder)
                .logger(LOG, "listProjects")
                .serviceDetails(
                        "DataIntegration",
                        "ListProjects",
                        "https://docs.oracle.com/iaas/api/#/en/data-integration/20200430/Project/ListProjects")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListProjectsRequest::builder)
                .basePath("/20200430")
                .appendPathParam("workspaces")
                .appendPathParam(request.getWorkspaceId())
                .appendPathParam("projects")
                .appendListQueryParam(
                        "fields",
                        request.getFields(),
                        com.oracle.bmc.util.internal.CollectionFormatType.Multi)
                .appendQueryParam("name", request.getName())
                .appendQueryParam("nameContains", request.getNameContains())
                .appendListQueryParam(
                        "identifier",
                        request.getIdentifier(),
                        com.oracle.bmc.util.internal.CollectionFormatType.Multi)
                .appendQueryParam("page", request.getPage())
                .appendQueryParam("limit", request.getLimit())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.dataintegration.model.ProjectSummaryCollection.class,
                        ListProjectsResponse.Builder::projectSummaryCollection)
                .handleResponseHeaderString(
                        "opc-request-id", ListProjectsResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListProjectsResponse.Builder::opcNextPage)
                .handleResponseHeaderString(
                        "opc-prev-page", ListProjectsResponse.Builder::opcPrevPage)
                .handleResponseHeaderInteger(
                        "opc-total-items", ListProjectsResponse.Builder::opcTotalItems)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ListPublishedObjectsResponse> listPublishedObjects(
            ListPublishedObjectsRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ListPublishedObjectsRequest, ListPublishedObjectsResponse>
                    handler) {

        Validate.notBlank(request.getWorkspaceId(), "workspaceId must not be blank");

        Validate.notBlank(request.getApplicationKey(), "applicationKey must not be blank");

        return clientCall(request, ListPublishedObjectsResponse::builder)
                .logger(LOG, "listPublishedObjects")
                .serviceDetails(
                        "DataIntegration",
                        "ListPublishedObjects",
                        "https://docs.oracle.com/iaas/api/#/en/data-integration/20200430/Application/ListPublishedObjects")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListPublishedObjectsRequest::builder)
                .basePath("/20200430")
                .appendPathParam("workspaces")
                .appendPathParam(request.getWorkspaceId())
                .appendPathParam("applications")
                .appendPathParam(request.getApplicationKey())
                .appendPathParam("publishedObjects")
                .appendListQueryParam(
                        "fields",
                        request.getFields(),
                        com.oracle.bmc.util.internal.CollectionFormatType.Multi)
                .appendQueryParam("name", request.getName())
                .appendQueryParam("nameStartsWith", request.getNameStartsWith())
                .appendQueryParam("nameContains", request.getNameContains())
                .appendListQueryParam(
                        "identifier",
                        request.getIdentifier(),
                        com.oracle.bmc.util.internal.CollectionFormatType.Multi)
                .appendListQueryParam(
                        "type",
                        request.getType(),
                        com.oracle.bmc.util.internal.CollectionFormatType.Multi)
                .appendQueryParam("typeInSubtree", request.getTypeInSubtree())
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.dataintegration.model.PublishedObjectSummaryCollection.class,
                        ListPublishedObjectsResponse.Builder::publishedObjectSummaryCollection)
                .handleResponseHeaderString(
                        "opc-request-id", ListPublishedObjectsResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListPublishedObjectsResponse.Builder::opcNextPage)
                .handleResponseHeaderString(
                        "opc-prev-page", ListPublishedObjectsResponse.Builder::opcPrevPage)
                .handleResponseHeaderInteger(
                        "opc-total-items", ListPublishedObjectsResponse.Builder::opcTotalItems)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ListReferencesResponse> listReferences(
            ListReferencesRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ListReferencesRequest, ListReferencesResponse>
                    handler) {

        Validate.notBlank(request.getWorkspaceId(), "workspaceId must not be blank");

        Validate.notBlank(request.getApplicationKey(), "applicationKey must not be blank");

        return clientCall(request, ListReferencesResponse::builder)
                .logger(LOG, "listReferences")
                .serviceDetails(
                        "DataIntegration",
                        "ListReferences",
                        "https://docs.oracle.com/iaas/api/#/en/data-integration/20200430/Reference/ListReferences")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListReferencesRequest::builder)
                .basePath("/20200430")
                .appendPathParam("workspaces")
                .appendPathParam(request.getWorkspaceId())
                .appendPathParam("applications")
                .appendPathParam(request.getApplicationKey())
                .appendPathParam("references")
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .appendQueryParam("name", request.getName())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.dataintegration.model.ReferenceSummaryCollection.class,
                        ListReferencesResponse.Builder::referenceSummaryCollection)
                .handleResponseHeaderString("etag", ListReferencesResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", ListReferencesResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListReferencesResponse.Builder::opcNextPage)
                .handleResponseHeaderString(
                        "opc-prev-page", ListReferencesResponse.Builder::opcPrevPage)
                .handleResponseHeaderInteger(
                        "opc-total-items", ListReferencesResponse.Builder::opcTotalItems)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ListRuntimeOperatorsResponse> listRuntimeOperators(
            ListRuntimeOperatorsRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ListRuntimeOperatorsRequest, ListRuntimeOperatorsResponse>
                    handler) {

        Validate.notBlank(request.getWorkspaceId(), "workspaceId must not be blank");

        Validate.notBlank(request.getApplicationKey(), "applicationKey must not be blank");

        Validate.notBlank(request.getRuntimePipelineKey(), "runtimePipelineKey must not be blank");

        return clientCall(request, ListRuntimeOperatorsResponse::builder)
                .logger(LOG, "listRuntimeOperators")
                .serviceDetails(
                        "DataIntegration",
                        "ListRuntimeOperators",
                        "https://docs.oracle.com/iaas/api/#/en/data-integration/20200430/RuntimeOperatorSummaryCollection/ListRuntimeOperators")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListRuntimeOperatorsRequest::builder)
                .basePath("/20200430")
                .appendPathParam("workspaces")
                .appendPathParam(request.getWorkspaceId())
                .appendPathParam("applications")
                .appendPathParam(request.getApplicationKey())
                .appendPathParam("runtimePipelines")
                .appendPathParam(request.getRuntimePipelineKey())
                .appendPathParam("runtimeOperators")
                .appendListQueryParam(
                        "key",
                        request.getKey(),
                        com.oracle.bmc.util.internal.CollectionFormatType.Multi)
                .appendListQueryParam(
                        "fields",
                        request.getFields(),
                        com.oracle.bmc.util.internal.CollectionFormatType.Multi)
                .appendQueryParam("name", request.getName())
                .appendListQueryParam(
                        "identifier",
                        request.getIdentifier(),
                        com.oracle.bmc.util.internal.CollectionFormatType.Multi)
                .appendQueryParam("page", request.getPage())
                .appendQueryParam("limit", request.getLimit())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .appendListQueryParam(
                        "aggregatorType",
                        request.getAggregatorType(),
                        com.oracle.bmc.util.internal.CollectionFormatType.Multi)
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.dataintegration.model.RuntimeOperatorSummaryCollection.class,
                        ListRuntimeOperatorsResponse.Builder::runtimeOperatorSummaryCollection)
                .handleResponseHeaderString(
                        "opc-request-id", ListRuntimeOperatorsResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListRuntimeOperatorsResponse.Builder::opcNextPage)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ListRuntimePipelinesResponse> listRuntimePipelines(
            ListRuntimePipelinesRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ListRuntimePipelinesRequest, ListRuntimePipelinesResponse>
                    handler) {

        Validate.notBlank(request.getWorkspaceId(), "workspaceId must not be blank");

        Validate.notBlank(request.getApplicationKey(), "applicationKey must not be blank");

        return clientCall(request, ListRuntimePipelinesResponse::builder)
                .logger(LOG, "listRuntimePipelines")
                .serviceDetails(
                        "DataIntegration",
                        "ListRuntimePipelines",
                        "https://docs.oracle.com/iaas/api/#/en/data-integration/20200430/RuntimePipelineSummaryCollection/ListRuntimePipelines")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListRuntimePipelinesRequest::builder)
                .basePath("/20200430")
                .appendPathParam("workspaces")
                .appendPathParam(request.getWorkspaceId())
                .appendPathParam("applications")
                .appendPathParam(request.getApplicationKey())
                .appendPathParam("runtimePipelines")
                .appendListQueryParam(
                        "key",
                        request.getKey(),
                        com.oracle.bmc.util.internal.CollectionFormatType.Multi)
                .appendQueryParam("aggregatorKey", request.getAggregatorKey())
                .appendListQueryParam(
                        "fields",
                        request.getFields(),
                        com.oracle.bmc.util.internal.CollectionFormatType.Multi)
                .appendQueryParam("name", request.getName())
                .appendListQueryParam(
                        "identifier",
                        request.getIdentifier(),
                        com.oracle.bmc.util.internal.CollectionFormatType.Multi)
                .appendQueryParam("page", request.getPage())
                .appendQueryParam("limit", request.getLimit())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .appendListQueryParam(
                        "aggregatorType",
                        request.getAggregatorType(),
                        com.oracle.bmc.util.internal.CollectionFormatType.Multi)
                .appendListQueryParam(
                        "filter",
                        request.getFilter(),
                        com.oracle.bmc.util.internal.CollectionFormatType.Multi)
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.dataintegration.model.RuntimePipelineSummaryCollection.class,
                        ListRuntimePipelinesResponse.Builder::runtimePipelineSummaryCollection)
                .handleResponseHeaderString(
                        "opc-request-id", ListRuntimePipelinesResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListRuntimePipelinesResponse.Builder::opcNextPage)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ListSchedulesResponse> listSchedules(
            ListSchedulesRequest request,
            final com.oracle.bmc.responses.AsyncHandler<ListSchedulesRequest, ListSchedulesResponse>
                    handler) {

        Validate.notBlank(request.getWorkspaceId(), "workspaceId must not be blank");

        Validate.notBlank(request.getApplicationKey(), "applicationKey must not be blank");

        return clientCall(request, ListSchedulesResponse::builder)
                .logger(LOG, "listSchedules")
                .serviceDetails(
                        "DataIntegration",
                        "ListSchedules",
                        "https://docs.oracle.com/iaas/api/#/en/data-integration/20200430/Schedule/ListSchedules")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListSchedulesRequest::builder)
                .basePath("/20200430")
                .appendPathParam("workspaces")
                .appendPathParam(request.getWorkspaceId())
                .appendPathParam("applications")
                .appendPathParam(request.getApplicationKey())
                .appendPathParam("schedules")
                .appendListQueryParam(
                        "key",
                        request.getKey(),
                        com.oracle.bmc.util.internal.CollectionFormatType.Multi)
                .appendQueryParam("name", request.getName())
                .appendListQueryParam(
                        "identifier",
                        request.getIdentifier(),
                        com.oracle.bmc.util.internal.CollectionFormatType.Multi)
                .appendListQueryParam(
                        "type",
                        request.getType(),
                        com.oracle.bmc.util.internal.CollectionFormatType.Multi)
                .appendQueryParam("page", request.getPage())
                .appendQueryParam("limit", request.getLimit())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.dataintegration.model.ScheduleSummaryCollection.class,
                        ListSchedulesResponse.Builder::scheduleSummaryCollection)
                .handleResponseHeaderString(
                        "opc-request-id", ListSchedulesResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListSchedulesResponse.Builder::opcNextPage)
                .handleResponseHeaderString(
                        "opc-prev-page", ListSchedulesResponse.Builder::opcPrevPage)
                .handleResponseHeaderInteger(
                        "opc-total-items", ListSchedulesResponse.Builder::opcTotalItems)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ListSchemasResponse> listSchemas(
            ListSchemasRequest request,
            final com.oracle.bmc.responses.AsyncHandler<ListSchemasRequest, ListSchemasResponse>
                    handler) {

        Validate.notBlank(request.getWorkspaceId(), "workspaceId must not be blank");

        Validate.notBlank(request.getConnectionKey(), "connectionKey must not be blank");
        Objects.requireNonNull(request.getSchemaResourceName(), "schemaResourceName is required");

        return clientCall(request, ListSchemasResponse::builder)
                .logger(LOG, "listSchemas")
                .serviceDetails(
                        "DataIntegration",
                        "ListSchemas",
                        "https://docs.oracle.com/iaas/api/#/en/data-integration/20200430/Schema/ListSchemas")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListSchemasRequest::builder)
                .basePath("/20200430")
                .appendPathParam("workspaces")
                .appendPathParam(request.getWorkspaceId())
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
                .appendQueryParam("schemaResourceName", request.getSchemaResourceName())
                .appendQueryParam("name", request.getName())
                .appendListQueryParam(
                        "nameList",
                        request.getNameList(),
                        com.oracle.bmc.util.internal.CollectionFormatType.Multi)
                .appendListQueryParam(
                        "includeTypes",
                        request.getIncludeTypes(),
                        com.oracle.bmc.util.internal.CollectionFormatType.Multi)
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.dataintegration.model.SchemaSummaryCollection.class,
                        ListSchemasResponse.Builder::schemaSummaryCollection)
                .handleResponseHeaderString(
                        "opc-request-id", ListSchemasResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListSchemasResponse.Builder::opcNextPage)
                .handleResponseHeaderString(
                        "opc-prev-page", ListSchemasResponse.Builder::opcPrevPage)
                .handleResponseHeaderInteger(
                        "opc-total-items", ListSchemasResponse.Builder::opcTotalItems)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ListTaskRunLineagesResponse> listTaskRunLineages(
            ListTaskRunLineagesRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ListTaskRunLineagesRequest, ListTaskRunLineagesResponse>
                    handler) {

        Validate.notBlank(request.getWorkspaceId(), "workspaceId must not be blank");

        Validate.notBlank(request.getApplicationKey(), "applicationKey must not be blank");

        return clientCall(request, ListTaskRunLineagesResponse::builder)
                .logger(LOG, "listTaskRunLineages")
                .serviceDetails(
                        "DataIntegration",
                        "ListTaskRunLineages",
                        "https://docs.oracle.com/iaas/api/#/en/data-integration/20200430/TaskRunLineageSummaryCollection/ListTaskRunLineages")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListTaskRunLineagesRequest::builder)
                .basePath("/20200430")
                .appendPathParam("workspaces")
                .appendPathParam(request.getWorkspaceId())
                .appendPathParam("applications")
                .appendPathParam(request.getApplicationKey())
                .appendPathParam("taskRunLineages")
                .appendListQueryParam(
                        "fields",
                        request.getFields(),
                        com.oracle.bmc.util.internal.CollectionFormatType.Multi)
                .appendQueryParam("page", request.getPage())
                .appendQueryParam("limit", request.getLimit())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .appendListQueryParam(
                        "filter",
                        request.getFilter(),
                        com.oracle.bmc.util.internal.CollectionFormatType.Multi)
                .appendQueryParam("timeUpdatedGreaterThan", request.getTimeUpdatedGreaterThan())
                .appendQueryParam(
                        "timeUpdatedGreaterThanOrEqualTo",
                        request.getTimeUpdatedGreaterThanOrEqualTo())
                .appendQueryParam("timeUpatedLessThan", request.getTimeUpatedLessThan())
                .appendQueryParam(
                        "timeUpatedLessThanOrEqualTo", request.getTimeUpatedLessThanOrEqualTo())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.dataintegration.model.TaskRunLineageSummaryCollection.class,
                        ListTaskRunLineagesResponse.Builder::taskRunLineageSummaryCollection)
                .handleResponseHeaderString(
                        "opc-request-id", ListTaskRunLineagesResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListTaskRunLineagesResponse.Builder::opcNextPage)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ListTaskRunLogsResponse> listTaskRunLogs(
            ListTaskRunLogsRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ListTaskRunLogsRequest, ListTaskRunLogsResponse>
                    handler) {

        Validate.notBlank(request.getWorkspaceId(), "workspaceId must not be blank");

        Validate.notBlank(request.getApplicationKey(), "applicationKey must not be blank");

        Validate.notBlank(request.getTaskRunKey(), "taskRunKey must not be blank");

        return clientCall(request, ListTaskRunLogsResponse::builder)
                .logger(LOG, "listTaskRunLogs")
                .serviceDetails(
                        "DataIntegration",
                        "ListTaskRunLogs",
                        "https://docs.oracle.com/iaas/api/#/en/data-integration/20200430/TaskRunLogSummary/ListTaskRunLogs")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListTaskRunLogsRequest::builder)
                .basePath("/20200430")
                .appendPathParam("workspaces")
                .appendPathParam(request.getWorkspaceId())
                .appendPathParam("applications")
                .appendPathParam(request.getApplicationKey())
                .appendPathParam("taskRuns")
                .appendPathParam(request.getTaskRunKey())
                .appendPathParam("logs")
                .appendQueryParam("page", request.getPage())
                .appendQueryParam("limit", request.getLimit())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBodyList(
                        com.oracle.bmc.dataintegration.model.TaskRunLogSummary.class,
                        ListTaskRunLogsResponse.Builder::items)
                .handleResponseHeaderString(
                        "opc-request-id", ListTaskRunLogsResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListTaskRunLogsResponse.Builder::opcNextPage)
                .handleResponseHeaderString(
                        "opc-prev-page", ListTaskRunLogsResponse.Builder::opcPrevPage)
                .handleResponseHeaderInteger(
                        "opc-total-items", ListTaskRunLogsResponse.Builder::opcTotalItems)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ListTaskRunsResponse> listTaskRuns(
            ListTaskRunsRequest request,
            final com.oracle.bmc.responses.AsyncHandler<ListTaskRunsRequest, ListTaskRunsResponse>
                    handler) {

        Validate.notBlank(request.getWorkspaceId(), "workspaceId must not be blank");

        Validate.notBlank(request.getApplicationKey(), "applicationKey must not be blank");

        return clientCall(request, ListTaskRunsResponse::builder)
                .logger(LOG, "listTaskRuns")
                .serviceDetails(
                        "DataIntegration",
                        "ListTaskRuns",
                        "https://docs.oracle.com/iaas/api/#/en/data-integration/20200430/TaskRun/ListTaskRuns")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListTaskRunsRequest::builder)
                .basePath("/20200430")
                .appendPathParam("workspaces")
                .appendPathParam(request.getWorkspaceId())
                .appendPathParam("applications")
                .appendPathParam(request.getApplicationKey())
                .appendPathParam("taskRuns")
                .appendListQueryParam(
                        "key",
                        request.getKey(),
                        com.oracle.bmc.util.internal.CollectionFormatType.Multi)
                .appendQueryParam("aggregatorKey", request.getAggregatorKey())
                .appendListQueryParam(
                        "fields",
                        request.getFields(),
                        com.oracle.bmc.util.internal.CollectionFormatType.Multi)
                .appendQueryParam("name", request.getName())
                .appendListQueryParam(
                        "identifier",
                        request.getIdentifier(),
                        com.oracle.bmc.util.internal.CollectionFormatType.Multi)
                .appendQueryParam("page", request.getPage())
                .appendQueryParam("limit", request.getLimit())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .appendListQueryParam(
                        "filter",
                        request.getFilter(),
                        com.oracle.bmc.util.internal.CollectionFormatType.Multi)
                .appendQueryParam("nameStartsWith", request.getNameStartsWith())
                .appendQueryParam("nameContains", request.getNameContains())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.dataintegration.model.TaskRunSummaryCollection.class,
                        ListTaskRunsResponse.Builder::taskRunSummaryCollection)
                .handleResponseHeaderString(
                        "opc-request-id", ListTaskRunsResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListTaskRunsResponse.Builder::opcNextPage)
                .handleResponseHeaderString(
                        "opc-prev-page", ListTaskRunsResponse.Builder::opcPrevPage)
                .handleResponseHeaderInteger(
                        "opc-total-items", ListTaskRunsResponse.Builder::opcTotalItems)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ListTaskSchedulesResponse> listTaskSchedules(
            ListTaskSchedulesRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ListTaskSchedulesRequest, ListTaskSchedulesResponse>
                    handler) {

        Validate.notBlank(request.getWorkspaceId(), "workspaceId must not be blank");

        Validate.notBlank(request.getApplicationKey(), "applicationKey must not be blank");

        return clientCall(request, ListTaskSchedulesResponse::builder)
                .logger(LOG, "listTaskSchedules")
                .serviceDetails(
                        "DataIntegration",
                        "ListTaskSchedules",
                        "https://docs.oracle.com/iaas/api/#/en/data-integration/20200430/TaskSchedule/ListTaskSchedules")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListTaskSchedulesRequest::builder)
                .basePath("/20200430")
                .appendPathParam("workspaces")
                .appendPathParam(request.getWorkspaceId())
                .appendPathParam("applications")
                .appendPathParam(request.getApplicationKey())
                .appendPathParam("taskSchedules")
                .appendListQueryParam(
                        "key",
                        request.getKey(),
                        com.oracle.bmc.util.internal.CollectionFormatType.Multi)
                .appendQueryParam("name", request.getName())
                .appendListQueryParam(
                        "identifier",
                        request.getIdentifier(),
                        com.oracle.bmc.util.internal.CollectionFormatType.Multi)
                .appendListQueryParam(
                        "type",
                        request.getType(),
                        com.oracle.bmc.util.internal.CollectionFormatType.Multi)
                .appendQueryParam("page", request.getPage())
                .appendQueryParam("limit", request.getLimit())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .appendQueryParam("isEnabled", request.getIsEnabled())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.dataintegration.model.TaskScheduleSummaryCollection.class,
                        ListTaskSchedulesResponse.Builder::taskScheduleSummaryCollection)
                .handleResponseHeaderString(
                        "opc-request-id", ListTaskSchedulesResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListTaskSchedulesResponse.Builder::opcNextPage)
                .handleResponseHeaderString(
                        "opc-prev-page", ListTaskSchedulesResponse.Builder::opcPrevPage)
                .handleResponseHeaderInteger(
                        "opc-total-items", ListTaskSchedulesResponse.Builder::opcTotalItems)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ListTaskValidationsResponse> listTaskValidations(
            ListTaskValidationsRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ListTaskValidationsRequest, ListTaskValidationsResponse>
                    handler) {

        Validate.notBlank(request.getWorkspaceId(), "workspaceId must not be blank");

        return clientCall(request, ListTaskValidationsResponse::builder)
                .logger(LOG, "listTaskValidations")
                .serviceDetails(
                        "DataIntegration",
                        "ListTaskValidations",
                        "https://docs.oracle.com/iaas/api/#/en/data-integration/20200430/TaskValidation/ListTaskValidations")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListTaskValidationsRequest::builder)
                .basePath("/20200430")
                .appendPathParam("workspaces")
                .appendPathParam(request.getWorkspaceId())
                .appendPathParam("taskValidations")
                .appendQueryParam("key", request.getKey())
                .appendQueryParam("name", request.getName())
                .appendQueryParam("identifier", request.getIdentifier())
                .appendListQueryParam(
                        "fields",
                        request.getFields(),
                        com.oracle.bmc.util.internal.CollectionFormatType.Multi)
                .appendQueryParam("page", request.getPage())
                .appendQueryParam("limit", request.getLimit())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.dataintegration.model.TaskValidationSummaryCollection.class,
                        ListTaskValidationsResponse.Builder::taskValidationSummaryCollection)
                .handleResponseHeaderString(
                        "opc-request-id", ListTaskValidationsResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListTaskValidationsResponse.Builder::opcNextPage)
                .handleResponseHeaderString(
                        "opc-prev-page", ListTaskValidationsResponse.Builder::opcPrevPage)
                .handleResponseHeaderInteger(
                        "opc-total-items", ListTaskValidationsResponse.Builder::opcTotalItems)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ListTasksResponse> listTasks(
            ListTasksRequest request,
            final com.oracle.bmc.responses.AsyncHandler<ListTasksRequest, ListTasksResponse>
                    handler) {

        Validate.notBlank(request.getWorkspaceId(), "workspaceId must not be blank");

        return clientCall(request, ListTasksResponse::builder)
                .logger(LOG, "listTasks")
                .serviceDetails(
                        "DataIntegration",
                        "ListTasks",
                        "https://docs.oracle.com/iaas/api/#/en/data-integration/20200430/Task/ListTasks")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListTasksRequest::builder)
                .basePath("/20200430")
                .appendPathParam("workspaces")
                .appendPathParam(request.getWorkspaceId())
                .appendPathParam("tasks")
                .appendQueryParam("folderId", request.getFolderId())
                .appendListQueryParam(
                        "fields",
                        request.getFields(),
                        com.oracle.bmc.util.internal.CollectionFormatType.Multi)
                .appendQueryParam("name", request.getName())
                .appendListQueryParam(
                        "key",
                        request.getKey(),
                        com.oracle.bmc.util.internal.CollectionFormatType.Multi)
                .appendListQueryParam(
                        "identifier",
                        request.getIdentifier(),
                        com.oracle.bmc.util.internal.CollectionFormatType.Multi)
                .appendListQueryParam(
                        "type",
                        request.getType(),
                        com.oracle.bmc.util.internal.CollectionFormatType.Multi)
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.dataintegration.model.TaskSummaryCollection.class,
                        ListTasksResponse.Builder::taskSummaryCollection)
                .handleResponseHeaderString(
                        "opc-request-id", ListTasksResponse.Builder::opcRequestId)
                .handleResponseHeaderString("opc-next-page", ListTasksResponse.Builder::opcNextPage)
                .handleResponseHeaderString("opc-prev-page", ListTasksResponse.Builder::opcPrevPage)
                .handleResponseHeaderInteger(
                        "opc-total-items", ListTasksResponse.Builder::opcTotalItems)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ListTemplatesResponse> listTemplates(
            ListTemplatesRequest request,
            final com.oracle.bmc.responses.AsyncHandler<ListTemplatesRequest, ListTemplatesResponse>
                    handler) {

        Validate.notBlank(request.getWorkspaceId(), "workspaceId must not be blank");

        return clientCall(request, ListTemplatesResponse::builder)
                .logger(LOG, "listTemplates")
                .serviceDetails(
                        "DataIntegration",
                        "ListTemplates",
                        "https://docs.oracle.com/iaas/api/#/en/data-integration/20200430/Template/ListTemplates")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListTemplatesRequest::builder)
                .basePath("/20200430")
                .appendPathParam("workspaces")
                .appendPathParam(request.getWorkspaceId())
                .appendPathParam("templates")
                .appendQueryParam("name", request.getName())
                .appendListQueryParam(
                        "identifier",
                        request.getIdentifier(),
                        com.oracle.bmc.util.internal.CollectionFormatType.Multi)
                .appendListQueryParam(
                        "fields",
                        request.getFields(),
                        com.oracle.bmc.util.internal.CollectionFormatType.Multi)
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.dataintegration.model.TemplateSummaryCollection.class,
                        ListTemplatesResponse.Builder::templateSummaryCollection)
                .handleResponseHeaderString(
                        "opc-request-id", ListTemplatesResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListTemplatesResponse.Builder::opcNextPage)
                .handleResponseHeaderString(
                        "opc-prev-page", ListTemplatesResponse.Builder::opcPrevPage)
                .handleResponseHeaderInteger(
                        "opc-total-items", ListTemplatesResponse.Builder::opcTotalItems)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ListUserDefinedFunctionValidationsResponse>
            listUserDefinedFunctionValidations(
                    ListUserDefinedFunctionValidationsRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    ListUserDefinedFunctionValidationsRequest,
                                    ListUserDefinedFunctionValidationsResponse>
                            handler) {

        Validate.notBlank(request.getWorkspaceId(), "workspaceId must not be blank");

        return clientCall(request, ListUserDefinedFunctionValidationsResponse::builder)
                .logger(LOG, "listUserDefinedFunctionValidations")
                .serviceDetails(
                        "DataIntegration",
                        "ListUserDefinedFunctionValidations",
                        "https://docs.oracle.com/iaas/api/#/en/data-integration/20200430/UserDefinedFunctionValidation/ListUserDefinedFunctionValidations")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListUserDefinedFunctionValidationsRequest::builder)
                .basePath("/20200430")
                .appendPathParam("workspaces")
                .appendPathParam(request.getWorkspaceId())
                .appendPathParam("userDefinedFunctionValidations")
                .appendQueryParam("key", request.getKey())
                .appendQueryParam("name", request.getName())
                .appendQueryParam("identifier", request.getIdentifier())
                .appendListQueryParam(
                        "fields",
                        request.getFields(),
                        com.oracle.bmc.util.internal.CollectionFormatType.Multi)
                .appendQueryParam("page", request.getPage())
                .appendQueryParam("limit", request.getLimit())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.dataintegration.model
                                .UserDefinedFunctionValidationSummaryCollection.class,
                        ListUserDefinedFunctionValidationsResponse.Builder
                                ::userDefinedFunctionValidationSummaryCollection)
                .handleResponseHeaderString(
                        "opc-request-id",
                        ListUserDefinedFunctionValidationsResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page",
                        ListUserDefinedFunctionValidationsResponse.Builder::opcNextPage)
                .handleResponseHeaderString(
                        "opc-prev-page",
                        ListUserDefinedFunctionValidationsResponse.Builder::opcPrevPage)
                .handleResponseHeaderInteger(
                        "opc-total-items",
                        ListUserDefinedFunctionValidationsResponse.Builder::opcTotalItems)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ListUserDefinedFunctionsResponse> listUserDefinedFunctions(
            ListUserDefinedFunctionsRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ListUserDefinedFunctionsRequest, ListUserDefinedFunctionsResponse>
                    handler) {

        Validate.notBlank(request.getWorkspaceId(), "workspaceId must not be blank");

        return clientCall(request, ListUserDefinedFunctionsResponse::builder)
                .logger(LOG, "listUserDefinedFunctions")
                .serviceDetails(
                        "DataIntegration",
                        "ListUserDefinedFunctions",
                        "https://docs.oracle.com/iaas/api/#/en/data-integration/20200430/UserDefinedFunction/ListUserDefinedFunctions")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListUserDefinedFunctionsRequest::builder)
                .basePath("/20200430")
                .appendPathParam("workspaces")
                .appendPathParam(request.getWorkspaceId())
                .appendPathParam("userDefinedFunctions")
                .appendQueryParam("functionLibraryKey", request.getFunctionLibraryKey())
                .appendListQueryParam(
                        "fields",
                        request.getFields(),
                        com.oracle.bmc.util.internal.CollectionFormatType.Multi)
                .appendQueryParam("name", request.getName())
                .appendListQueryParam(
                        "identifier",
                        request.getIdentifier(),
                        com.oracle.bmc.util.internal.CollectionFormatType.Multi)
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.dataintegration.model.UserDefinedFunctionSummaryCollection
                                .class,
                        ListUserDefinedFunctionsResponse.Builder
                                ::userDefinedFunctionSummaryCollection)
                .handleResponseHeaderString(
                        "opc-request-id", ListUserDefinedFunctionsResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListUserDefinedFunctionsResponse.Builder::opcNextPage)
                .handleResponseHeaderString(
                        "opc-prev-page", ListUserDefinedFunctionsResponse.Builder::opcPrevPage)
                .handleResponseHeaderInteger(
                        "opc-total-items", ListUserDefinedFunctionsResponse.Builder::opcTotalItems)
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
                        "DataIntegration",
                        "ListWorkRequestErrors",
                        "https://docs.oracle.com/iaas/api/#/en/data-integration/20200430/WorkRequest/ListWorkRequestErrors")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListWorkRequestErrorsRequest::builder)
                .basePath("/20200430")
                .appendPathParam("workRequests")
                .appendPathParam(request.getWorkRequestId())
                .appendPathParam("workRequestErrors")
                .appendQueryParam("page", request.getPage())
                .appendQueryParam("limit", request.getLimit())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBodyList(
                        com.oracle.bmc.dataintegration.model.WorkRequestError.class,
                        ListWorkRequestErrorsResponse.Builder::items)
                .handleResponseHeaderString(
                        "opc-request-id", ListWorkRequestErrorsResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListWorkRequestErrorsResponse.Builder::opcNextPage)
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
                        "DataIntegration",
                        "ListWorkRequestLogs",
                        "https://docs.oracle.com/iaas/api/#/en/data-integration/20200430/WorkRequest/ListWorkRequestLogs")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListWorkRequestLogsRequest::builder)
                .basePath("/20200430")
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
                        com.oracle.bmc.dataintegration.model.WorkRequestLogEntry.class,
                        ListWorkRequestLogsResponse.Builder::items)
                .handleResponseHeaderString(
                        "opc-request-id", ListWorkRequestLogsResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListWorkRequestLogsResponse.Builder::opcNextPage)
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
                        "DataIntegration",
                        "ListWorkRequests",
                        "https://docs.oracle.com/iaas/api/#/en/data-integration/20200430/WorkRequest/ListWorkRequests")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListWorkRequestsRequest::builder)
                .basePath("/20200430")
                .appendPathParam("workRequests")
                .appendQueryParam("compartmentId", request.getCompartmentId())
                .appendQueryParam("workspaceId", request.getWorkspaceId())
                .appendEnumQueryParam("workRequestStatus", request.getWorkRequestStatus())
                .appendQueryParam("page", request.getPage())
                .appendQueryParam("limit", request.getLimit())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBodyList(
                        com.oracle.bmc.dataintegration.model.WorkRequestSummary.class,
                        ListWorkRequestsResponse.Builder::items)
                .handleResponseHeaderString(
                        "opc-request-id", ListWorkRequestsResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListWorkRequestsResponse.Builder::opcNextPage)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ListWorkspacesResponse> listWorkspaces(
            ListWorkspacesRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ListWorkspacesRequest, ListWorkspacesResponse>
                    handler) {
        Objects.requireNonNull(request.getCompartmentId(), "compartmentId is required");

        return clientCall(request, ListWorkspacesResponse::builder)
                .logger(LOG, "listWorkspaces")
                .serviceDetails(
                        "DataIntegration",
                        "ListWorkspaces",
                        "https://docs.oracle.com/iaas/api/#/en/data-integration/20200430/Workspace/ListWorkspaces")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListWorkspacesRequest::builder)
                .basePath("/20200430")
                .appendPathParam("workspaces")
                .appendQueryParam("compartmentId", request.getCompartmentId())
                .appendQueryParam("name", request.getName())
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .appendEnumQueryParam("lifecycleState", request.getLifecycleState())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBodyList(
                        com.oracle.bmc.dataintegration.model.WorkspaceSummary.class,
                        ListWorkspacesResponse.Builder::items)
                .handleResponseHeaderString(
                        "opc-request-id", ListWorkspacesResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListWorkspacesResponse.Builder::opcNextPage)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<StartWorkspaceResponse> startWorkspace(
            StartWorkspaceRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            StartWorkspaceRequest, StartWorkspaceResponse>
                    handler) {

        Validate.notBlank(request.getWorkspaceId(), "workspaceId must not be blank");

        return clientCall(request, StartWorkspaceResponse::builder)
                .logger(LOG, "startWorkspace")
                .serviceDetails(
                        "DataIntegration",
                        "StartWorkspace",
                        "https://docs.oracle.com/iaas/api/#/en/data-integration/20200430/Workspace/StartWorkspace")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(StartWorkspaceRequest::builder)
                .basePath("/20200430")
                .appendPathParam("workspaces")
                .appendPathParam(request.getWorkspaceId())
                .appendPathParam("actions")
                .appendPathParam("start")
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .handleResponseHeaderString(
                        "opc-request-id", StartWorkspaceResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-work-request-id", StartWorkspaceResponse.Builder::opcWorkRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<StopWorkspaceResponse> stopWorkspace(
            StopWorkspaceRequest request,
            final com.oracle.bmc.responses.AsyncHandler<StopWorkspaceRequest, StopWorkspaceResponse>
                    handler) {

        Validate.notBlank(request.getWorkspaceId(), "workspaceId must not be blank");

        return clientCall(request, StopWorkspaceResponse::builder)
                .logger(LOG, "stopWorkspace")
                .serviceDetails(
                        "DataIntegration",
                        "StopWorkspace",
                        "https://docs.oracle.com/iaas/api/#/en/data-integration/20200430/Workspace/StopWorkspace")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(StopWorkspaceRequest::builder)
                .basePath("/20200430")
                .appendPathParam("workspaces")
                .appendPathParam(request.getWorkspaceId())
                .appendPathParam("actions")
                .appendPathParam("stop")
                .appendQueryParam("quiesceTimeout", request.getQuiesceTimeout())
                .appendQueryParam("isForceOperation", request.getIsForceOperation())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .handleResponseHeaderString(
                        "opc-request-id", StopWorkspaceResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-work-request-id", StopWorkspaceResponse.Builder::opcWorkRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<UpdateApplicationResponse> updateApplication(
            UpdateApplicationRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            UpdateApplicationRequest, UpdateApplicationResponse>
                    handler) {

        Validate.notBlank(request.getWorkspaceId(), "workspaceId must not be blank");

        Validate.notBlank(request.getApplicationKey(), "applicationKey must not be blank");
        Objects.requireNonNull(
                request.getUpdateApplicationDetails(), "updateApplicationDetails is required");

        return clientCall(request, UpdateApplicationResponse::builder)
                .logger(LOG, "updateApplication")
                .serviceDetails(
                        "DataIntegration",
                        "UpdateApplication",
                        "https://docs.oracle.com/iaas/api/#/en/data-integration/20200430/Application/UpdateApplication")
                .method(com.oracle.bmc.http.client.Method.PUT)
                .requestBuilder(UpdateApplicationRequest::builder)
                .basePath("/20200430")
                .appendPathParam("workspaces")
                .appendPathParam(request.getWorkspaceId())
                .appendPathParam("applications")
                .appendPathParam(request.getApplicationKey())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.dataintegration.model.Application.class,
                        UpdateApplicationResponse.Builder::application)
                .handleResponseHeaderString("etag", UpdateApplicationResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", UpdateApplicationResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<UpdateApplicationDetailedDescriptionResponse>
            updateApplicationDetailedDescription(
                    UpdateApplicationDetailedDescriptionRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    UpdateApplicationDetailedDescriptionRequest,
                                    UpdateApplicationDetailedDescriptionResponse>
                            handler) {

        Validate.notBlank(request.getWorkspaceId(), "workspaceId must not be blank");

        Validate.notBlank(request.getApplicationKey(), "applicationKey must not be blank");
        Objects.requireNonNull(
                request.getUpdateApplicationDetailedDescriptionDetails(),
                "updateApplicationDetailedDescriptionDetails is required");

        return clientCall(request, UpdateApplicationDetailedDescriptionResponse::builder)
                .logger(LOG, "updateApplicationDetailedDescription")
                .serviceDetails(
                        "DataIntegration",
                        "UpdateApplicationDetailedDescription",
                        "https://docs.oracle.com/iaas/api/#/en/data-integration/20200430/DetailedDescription/UpdateApplicationDetailedDescription")
                .method(com.oracle.bmc.http.client.Method.PUT)
                .requestBuilder(UpdateApplicationDetailedDescriptionRequest::builder)
                .basePath("/20200430")
                .appendPathParam("workspaces")
                .appendPathParam(request.getWorkspaceId())
                .appendPathParam("applications")
                .appendPathParam(request.getApplicationKey())
                .appendPathParam("detailedDescription")
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("if-match", request.getIfMatch())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.dataintegration.model.DetailedDescription.class,
                        UpdateApplicationDetailedDescriptionResponse.Builder::detailedDescription)
                .handleResponseHeaderString(
                        "etag", UpdateApplicationDetailedDescriptionResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id",
                        UpdateApplicationDetailedDescriptionResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<UpdateConnectionResponse> updateConnection(
            UpdateConnectionRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            UpdateConnectionRequest, UpdateConnectionResponse>
                    handler) {

        Validate.notBlank(request.getWorkspaceId(), "workspaceId must not be blank");

        Validate.notBlank(request.getConnectionKey(), "connectionKey must not be blank");
        Objects.requireNonNull(
                request.getUpdateConnectionDetails(), "updateConnectionDetails is required");

        return clientCall(request, UpdateConnectionResponse::builder)
                .logger(LOG, "updateConnection")
                .serviceDetails(
                        "DataIntegration",
                        "UpdateConnection",
                        "https://docs.oracle.com/iaas/api/#/en/data-integration/20200430/Connection/UpdateConnection")
                .method(com.oracle.bmc.http.client.Method.PUT)
                .requestBuilder(UpdateConnectionRequest::builder)
                .basePath("/20200430")
                .appendPathParam("workspaces")
                .appendPathParam(request.getWorkspaceId())
                .appendPathParam("connections")
                .appendPathParam(request.getConnectionKey())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("if-match", request.getIfMatch())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.dataintegration.model.Connection.class,
                        UpdateConnectionResponse.Builder::connection)
                .handleResponseHeaderString("etag", UpdateConnectionResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", UpdateConnectionResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<UpdateCopyObjectRequestResponse> updateCopyObjectRequest(
            UpdateCopyObjectRequestRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            UpdateCopyObjectRequestRequest, UpdateCopyObjectRequestResponse>
                    handler) {

        Validate.notBlank(request.getWorkspaceId(), "workspaceId must not be blank");

        Validate.notBlank(
                request.getCopyObjectRequestKey(), "copyObjectRequestKey must not be blank");
        Objects.requireNonNull(
                request.getUpdateCopyObjectRequestDetails(),
                "updateCopyObjectRequestDetails is required");

        return clientCall(request, UpdateCopyObjectRequestResponse::builder)
                .logger(LOG, "updateCopyObjectRequest")
                .serviceDetails(
                        "DataIntegration",
                        "UpdateCopyObjectRequest",
                        "https://docs.oracle.com/iaas/api/#/en/data-integration/20200430/Workspace/UpdateCopyObjectRequest")
                .method(com.oracle.bmc.http.client.Method.PUT)
                .requestBuilder(UpdateCopyObjectRequestRequest::builder)
                .basePath("/20200430")
                .appendPathParam("workspaces")
                .appendPathParam(request.getWorkspaceId())
                .appendPathParam("copyObjectRequests")
                .appendPathParam(request.getCopyObjectRequestKey())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("if-match", request.getIfMatch())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.dataintegration.model.CopyObjectRequest.class,
                        UpdateCopyObjectRequestResponse.Builder::copyObjectRequest)
                .handleResponseHeaderString("etag", UpdateCopyObjectRequestResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", UpdateCopyObjectRequestResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<UpdateDataAssetResponse> updateDataAsset(
            UpdateDataAssetRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            UpdateDataAssetRequest, UpdateDataAssetResponse>
                    handler) {

        Validate.notBlank(request.getWorkspaceId(), "workspaceId must not be blank");

        Validate.notBlank(request.getDataAssetKey(), "dataAssetKey must not be blank");
        Objects.requireNonNull(
                request.getUpdateDataAssetDetails(), "updateDataAssetDetails is required");

        return clientCall(request, UpdateDataAssetResponse::builder)
                .logger(LOG, "updateDataAsset")
                .serviceDetails(
                        "DataIntegration",
                        "UpdateDataAsset",
                        "https://docs.oracle.com/iaas/api/#/en/data-integration/20200430/DataAsset/UpdateDataAsset")
                .method(com.oracle.bmc.http.client.Method.PUT)
                .requestBuilder(UpdateDataAssetRequest::builder)
                .basePath("/20200430")
                .appendPathParam("workspaces")
                .appendPathParam(request.getWorkspaceId())
                .appendPathParam("dataAssets")
                .appendPathParam(request.getDataAssetKey())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("if-match", request.getIfMatch())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.dataintegration.model.DataAsset.class,
                        UpdateDataAssetResponse.Builder::dataAsset)
                .handleResponseHeaderString("etag", UpdateDataAssetResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", UpdateDataAssetResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<UpdateDataFlowResponse> updateDataFlow(
            UpdateDataFlowRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            UpdateDataFlowRequest, UpdateDataFlowResponse>
                    handler) {

        Validate.notBlank(request.getWorkspaceId(), "workspaceId must not be blank");

        Validate.notBlank(request.getDataFlowKey(), "dataFlowKey must not be blank");
        Objects.requireNonNull(
                request.getUpdateDataFlowDetails(), "updateDataFlowDetails is required");

        return clientCall(request, UpdateDataFlowResponse::builder)
                .logger(LOG, "updateDataFlow")
                .serviceDetails(
                        "DataIntegration",
                        "UpdateDataFlow",
                        "https://docs.oracle.com/iaas/api/#/en/data-integration/20200430/DataFlow/UpdateDataFlow")
                .method(com.oracle.bmc.http.client.Method.PUT)
                .requestBuilder(UpdateDataFlowRequest::builder)
                .basePath("/20200430")
                .appendPathParam("workspaces")
                .appendPathParam(request.getWorkspaceId())
                .appendPathParam("dataFlows")
                .appendPathParam(request.getDataFlowKey())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("if-match", request.getIfMatch())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.dataintegration.model.DataFlow.class,
                        UpdateDataFlowResponse.Builder::dataFlow)
                .handleResponseHeaderString("etag", UpdateDataFlowResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", UpdateDataFlowResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<UpdateDisApplicationResponse> updateDisApplication(
            UpdateDisApplicationRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            UpdateDisApplicationRequest, UpdateDisApplicationResponse>
                    handler) {

        Validate.notBlank(request.getWorkspaceId(), "workspaceId must not be blank");

        Validate.notBlank(request.getDisApplicationId(), "disApplicationId must not be blank");
        Objects.requireNonNull(
                request.getUpdateDisApplicationDetails(),
                "updateDisApplicationDetails is required");

        return clientCall(request, UpdateDisApplicationResponse::builder)
                .logger(LOG, "updateDisApplication")
                .serviceDetails(
                        "DataIntegration",
                        "UpdateDisApplication",
                        "https://docs.oracle.com/iaas/api/#/en/data-integration/20200430/DisApplication/UpdateDisApplication")
                .method(com.oracle.bmc.http.client.Method.PUT)
                .requestBuilder(UpdateDisApplicationRequest::builder)
                .basePath("/20200430")
                .appendPathParam("workspaces")
                .appendPathParam(request.getWorkspaceId())
                .appendPathParam("disApplications")
                .appendPathParam(request.getDisApplicationId())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.dataintegration.model.DisApplication.class,
                        UpdateDisApplicationResponse.Builder::disApplication)
                .handleResponseHeaderString("etag", UpdateDisApplicationResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", UpdateDisApplicationResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<UpdateDisApplicationDetailedDescriptionResponse>
            updateDisApplicationDetailedDescription(
                    UpdateDisApplicationDetailedDescriptionRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    UpdateDisApplicationDetailedDescriptionRequest,
                                    UpdateDisApplicationDetailedDescriptionResponse>
                            handler) {

        Validate.notBlank(request.getWorkspaceId(), "workspaceId must not be blank");

        Validate.notBlank(request.getApplicationKey(), "applicationKey must not be blank");
        Objects.requireNonNull(
                request.getUpdateDisApplicationDetailedDescriptionDetails(),
                "updateDisApplicationDetailedDescriptionDetails is required");

        return clientCall(request, UpdateDisApplicationDetailedDescriptionResponse::builder)
                .logger(LOG, "updateDisApplicationDetailedDescription")
                .serviceDetails(
                        "DataIntegration",
                        "UpdateDisApplicationDetailedDescription",
                        "https://docs.oracle.com/iaas/api/#/en/data-integration/20200430/DetailedDescription/UpdateDisApplicationDetailedDescription")
                .method(com.oracle.bmc.http.client.Method.PUT)
                .requestBuilder(UpdateDisApplicationDetailedDescriptionRequest::builder)
                .basePath("/20200430")
                .appendPathParam("workspaces")
                .appendPathParam(request.getWorkspaceId())
                .appendPathParam("disApplications")
                .appendPathParam(request.getApplicationKey())
                .appendPathParam("detailedDescription")
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("if-match", request.getIfMatch())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.dataintegration.model.DetailedDescription.class,
                        UpdateDisApplicationDetailedDescriptionResponse.Builder
                                ::detailedDescription)
                .handleResponseHeaderString(
                        "etag", UpdateDisApplicationDetailedDescriptionResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id",
                        UpdateDisApplicationDetailedDescriptionResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<UpdateExportRequestResponse> updateExportRequest(
            UpdateExportRequestRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            UpdateExportRequestRequest, UpdateExportRequestResponse>
                    handler) {

        Validate.notBlank(request.getWorkspaceId(), "workspaceId must not be blank");

        Validate.notBlank(request.getExportRequestKey(), "exportRequestKey must not be blank");
        Objects.requireNonNull(
                request.getUpdateExportRequestDetails(), "updateExportRequestDetails is required");

        return clientCall(request, UpdateExportRequestResponse::builder)
                .logger(LOG, "updateExportRequest")
                .serviceDetails(
                        "DataIntegration",
                        "UpdateExportRequest",
                        "https://docs.oracle.com/iaas/api/#/en/data-integration/20200430/Workspace/UpdateExportRequest")
                .method(com.oracle.bmc.http.client.Method.PUT)
                .requestBuilder(UpdateExportRequestRequest::builder)
                .basePath("/20200430")
                .appendPathParam("workspaces")
                .appendPathParam(request.getWorkspaceId())
                .appendPathParam("exportRequests")
                .appendPathParam(request.getExportRequestKey())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("if-match", request.getIfMatch())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.dataintegration.model.ExportRequest.class,
                        UpdateExportRequestResponse.Builder::exportRequest)
                .handleResponseHeaderString("etag", UpdateExportRequestResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", UpdateExportRequestResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<UpdateExternalPublicationResponse> updateExternalPublication(
            UpdateExternalPublicationRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            UpdateExternalPublicationRequest, UpdateExternalPublicationResponse>
                    handler) {

        Validate.notBlank(request.getWorkspaceId(), "workspaceId must not be blank");

        Validate.notBlank(request.getTaskKey(), "taskKey must not be blank");

        Validate.notBlank(
                request.getExternalPublicationsKey(), "externalPublicationsKey must not be blank");
        Objects.requireNonNull(
                request.getUpdateExternalPublicationDetails(),
                "updateExternalPublicationDetails is required");

        return clientCall(request, UpdateExternalPublicationResponse::builder)
                .logger(LOG, "updateExternalPublication")
                .serviceDetails(
                        "DataIntegration",
                        "UpdateExternalPublication",
                        "https://docs.oracle.com/iaas/api/#/en/data-integration/20200430/ExternalPublication/UpdateExternalPublication")
                .method(com.oracle.bmc.http.client.Method.PUT)
                .requestBuilder(UpdateExternalPublicationRequest::builder)
                .basePath("/20200430")
                .appendPathParam("workspaces")
                .appendPathParam(request.getWorkspaceId())
                .appendPathParam("tasks")
                .appendPathParam(request.getTaskKey())
                .appendPathParam("externalPublications")
                .appendPathParam(request.getExternalPublicationsKey())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("if-match", request.getIfMatch())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.dataintegration.model.ExternalPublication.class,
                        UpdateExternalPublicationResponse.Builder::externalPublication)
                .handleResponseHeaderString("etag", UpdateExternalPublicationResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", UpdateExternalPublicationResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<UpdateFolderResponse> updateFolder(
            UpdateFolderRequest request,
            final com.oracle.bmc.responses.AsyncHandler<UpdateFolderRequest, UpdateFolderResponse>
                    handler) {

        Validate.notBlank(request.getWorkspaceId(), "workspaceId must not be blank");

        Validate.notBlank(request.getFolderKey(), "folderKey must not be blank");
        Objects.requireNonNull(request.getUpdateFolderDetails(), "updateFolderDetails is required");

        return clientCall(request, UpdateFolderResponse::builder)
                .logger(LOG, "updateFolder")
                .serviceDetails(
                        "DataIntegration",
                        "UpdateFolder",
                        "https://docs.oracle.com/iaas/api/#/en/data-integration/20200430/Folder/UpdateFolder")
                .method(com.oracle.bmc.http.client.Method.PUT)
                .requestBuilder(UpdateFolderRequest::builder)
                .basePath("/20200430")
                .appendPathParam("workspaces")
                .appendPathParam(request.getWorkspaceId())
                .appendPathParam("folders")
                .appendPathParam(request.getFolderKey())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("if-match", request.getIfMatch())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.dataintegration.model.Folder.class,
                        UpdateFolderResponse.Builder::folder)
                .handleResponseHeaderString("etag", UpdateFolderResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", UpdateFolderResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<UpdateFunctionLibraryResponse> updateFunctionLibrary(
            UpdateFunctionLibraryRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            UpdateFunctionLibraryRequest, UpdateFunctionLibraryResponse>
                    handler) {

        Validate.notBlank(request.getWorkspaceId(), "workspaceId must not be blank");

        Validate.notBlank(request.getFunctionLibraryKey(), "functionLibraryKey must not be blank");
        Objects.requireNonNull(
                request.getUpdateFunctionLibraryDetails(),
                "updateFunctionLibraryDetails is required");

        return clientCall(request, UpdateFunctionLibraryResponse::builder)
                .logger(LOG, "updateFunctionLibrary")
                .serviceDetails(
                        "DataIntegration",
                        "UpdateFunctionLibrary",
                        "https://docs.oracle.com/iaas/api/#/en/data-integration/20200430/FunctionLibrary/UpdateFunctionLibrary")
                .method(com.oracle.bmc.http.client.Method.PUT)
                .requestBuilder(UpdateFunctionLibraryRequest::builder)
                .basePath("/20200430")
                .appendPathParam("workspaces")
                .appendPathParam(request.getWorkspaceId())
                .appendPathParam("functionLibraries")
                .appendPathParam(request.getFunctionLibraryKey())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("if-match", request.getIfMatch())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.dataintegration.model.FunctionLibrary.class,
                        UpdateFunctionLibraryResponse.Builder::functionLibrary)
                .handleResponseHeaderString("etag", UpdateFunctionLibraryResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", UpdateFunctionLibraryResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<UpdateImportRequestResponse> updateImportRequest(
            UpdateImportRequestRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            UpdateImportRequestRequest, UpdateImportRequestResponse>
                    handler) {

        Validate.notBlank(request.getWorkspaceId(), "workspaceId must not be blank");

        Validate.notBlank(request.getImportRequestKey(), "importRequestKey must not be blank");
        Objects.requireNonNull(
                request.getUpdateImportRequestDetails(), "updateImportRequestDetails is required");

        return clientCall(request, UpdateImportRequestResponse::builder)
                .logger(LOG, "updateImportRequest")
                .serviceDetails(
                        "DataIntegration",
                        "UpdateImportRequest",
                        "https://docs.oracle.com/iaas/api/#/en/data-integration/20200430/Workspace/UpdateImportRequest")
                .method(com.oracle.bmc.http.client.Method.PUT)
                .requestBuilder(UpdateImportRequestRequest::builder)
                .basePath("/20200430")
                .appendPathParam("workspaces")
                .appendPathParam(request.getWorkspaceId())
                .appendPathParam("importRequests")
                .appendPathParam(request.getImportRequestKey())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("if-match", request.getIfMatch())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.dataintegration.model.ImportRequest.class,
                        UpdateImportRequestResponse.Builder::importRequest)
                .handleResponseHeaderString("etag", UpdateImportRequestResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", UpdateImportRequestResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<UpdatePipelineResponse> updatePipeline(
            UpdatePipelineRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            UpdatePipelineRequest, UpdatePipelineResponse>
                    handler) {

        Validate.notBlank(request.getWorkspaceId(), "workspaceId must not be blank");

        Validate.notBlank(request.getPipelineKey(), "pipelineKey must not be blank");
        Objects.requireNonNull(
                request.getUpdatePipelineDetails(), "updatePipelineDetails is required");

        return clientCall(request, UpdatePipelineResponse::builder)
                .logger(LOG, "updatePipeline")
                .serviceDetails(
                        "DataIntegration",
                        "UpdatePipeline",
                        "https://docs.oracle.com/iaas/api/#/en/data-integration/20200430/Pipeline/UpdatePipeline")
                .method(com.oracle.bmc.http.client.Method.PUT)
                .requestBuilder(UpdatePipelineRequest::builder)
                .basePath("/20200430")
                .appendPathParam("workspaces")
                .appendPathParam(request.getWorkspaceId())
                .appendPathParam("pipelines")
                .appendPathParam(request.getPipelineKey())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("if-match", request.getIfMatch())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.dataintegration.model.Pipeline.class,
                        UpdatePipelineResponse.Builder::pipeline)
                .handleResponseHeaderString("etag", UpdatePipelineResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", UpdatePipelineResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<UpdateProjectResponse> updateProject(
            UpdateProjectRequest request,
            final com.oracle.bmc.responses.AsyncHandler<UpdateProjectRequest, UpdateProjectResponse>
                    handler) {

        Validate.notBlank(request.getWorkspaceId(), "workspaceId must not be blank");

        Validate.notBlank(request.getProjectKey(), "projectKey must not be blank");
        Objects.requireNonNull(
                request.getUpdateProjectDetails(), "updateProjectDetails is required");

        return clientCall(request, UpdateProjectResponse::builder)
                .logger(LOG, "updateProject")
                .serviceDetails(
                        "DataIntegration",
                        "UpdateProject",
                        "https://docs.oracle.com/iaas/api/#/en/data-integration/20200430/Project/UpdateProject")
                .method(com.oracle.bmc.http.client.Method.PUT)
                .requestBuilder(UpdateProjectRequest::builder)
                .basePath("/20200430")
                .appendPathParam("workspaces")
                .appendPathParam(request.getWorkspaceId())
                .appendPathParam("projects")
                .appendPathParam(request.getProjectKey())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("if-match", request.getIfMatch())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.dataintegration.model.Project.class,
                        UpdateProjectResponse.Builder::project)
                .handleResponseHeaderString("etag", UpdateProjectResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", UpdateProjectResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<UpdateReferenceResponse> updateReference(
            UpdateReferenceRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            UpdateReferenceRequest, UpdateReferenceResponse>
                    handler) {

        Validate.notBlank(request.getWorkspaceId(), "workspaceId must not be blank");

        Validate.notBlank(request.getApplicationKey(), "applicationKey must not be blank");

        Validate.notBlank(request.getReferenceKey(), "referenceKey must not be blank");
        Objects.requireNonNull(
                request.getUpdateReferenceDetails(), "updateReferenceDetails is required");

        return clientCall(request, UpdateReferenceResponse::builder)
                .logger(LOG, "updateReference")
                .serviceDetails(
                        "DataIntegration",
                        "UpdateReference",
                        "https://docs.oracle.com/iaas/api/#/en/data-integration/20200430/Reference/UpdateReference")
                .method(com.oracle.bmc.http.client.Method.PUT)
                .requestBuilder(UpdateReferenceRequest::builder)
                .basePath("/20200430")
                .appendPathParam("workspaces")
                .appendPathParam(request.getWorkspaceId())
                .appendPathParam("applications")
                .appendPathParam(request.getApplicationKey())
                .appendPathParam("references")
                .appendPathParam(request.getReferenceKey())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.dataintegration.model.Reference.class,
                        UpdateReferenceResponse.Builder::reference)
                .handleResponseHeaderString("etag", UpdateReferenceResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", UpdateReferenceResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<UpdateScheduleResponse> updateSchedule(
            UpdateScheduleRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            UpdateScheduleRequest, UpdateScheduleResponse>
                    handler) {

        Validate.notBlank(request.getWorkspaceId(), "workspaceId must not be blank");

        Validate.notBlank(request.getApplicationKey(), "applicationKey must not be blank");

        Validate.notBlank(request.getScheduleKey(), "scheduleKey must not be blank");
        Objects.requireNonNull(
                request.getUpdateScheduleDetails(), "updateScheduleDetails is required");

        return clientCall(request, UpdateScheduleResponse::builder)
                .logger(LOG, "updateSchedule")
                .serviceDetails(
                        "DataIntegration",
                        "UpdateSchedule",
                        "https://docs.oracle.com/iaas/api/#/en/data-integration/20200430/Schedule/UpdateSchedule")
                .method(com.oracle.bmc.http.client.Method.PUT)
                .requestBuilder(UpdateScheduleRequest::builder)
                .basePath("/20200430")
                .appendPathParam("workspaces")
                .appendPathParam(request.getWorkspaceId())
                .appendPathParam("applications")
                .appendPathParam(request.getApplicationKey())
                .appendPathParam("schedules")
                .appendPathParam(request.getScheduleKey())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.dataintegration.model.Schedule.class,
                        UpdateScheduleResponse.Builder::schedule)
                .handleResponseHeaderString(
                        "opc-request-id", UpdateScheduleResponse.Builder::opcRequestId)
                .handleResponseHeaderString("etag", UpdateScheduleResponse.Builder::etag)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<UpdateTaskResponse> updateTask(
            UpdateTaskRequest request,
            final com.oracle.bmc.responses.AsyncHandler<UpdateTaskRequest, UpdateTaskResponse>
                    handler) {

        Validate.notBlank(request.getWorkspaceId(), "workspaceId must not be blank");

        Validate.notBlank(request.getTaskKey(), "taskKey must not be blank");
        Objects.requireNonNull(request.getUpdateTaskDetails(), "updateTaskDetails is required");

        return clientCall(request, UpdateTaskResponse::builder)
                .logger(LOG, "updateTask")
                .serviceDetails(
                        "DataIntegration",
                        "UpdateTask",
                        "https://docs.oracle.com/iaas/api/#/en/data-integration/20200430/Task/UpdateTask")
                .method(com.oracle.bmc.http.client.Method.PUT)
                .requestBuilder(UpdateTaskRequest::builder)
                .basePath("/20200430")
                .appendPathParam("workspaces")
                .appendPathParam(request.getWorkspaceId())
                .appendPathParam("tasks")
                .appendPathParam(request.getTaskKey())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("if-match", request.getIfMatch())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.dataintegration.model.Task.class,
                        UpdateTaskResponse.Builder::task)
                .handleResponseHeaderString("etag", UpdateTaskResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", UpdateTaskResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<UpdateTaskRunResponse> updateTaskRun(
            UpdateTaskRunRequest request,
            final com.oracle.bmc.responses.AsyncHandler<UpdateTaskRunRequest, UpdateTaskRunResponse>
                    handler) {

        Validate.notBlank(request.getWorkspaceId(), "workspaceId must not be blank");

        Validate.notBlank(request.getApplicationKey(), "applicationKey must not be blank");

        Validate.notBlank(request.getTaskRunKey(), "taskRunKey must not be blank");
        Objects.requireNonNull(
                request.getUpdateTaskRunDetails(), "updateTaskRunDetails is required");

        return clientCall(request, UpdateTaskRunResponse::builder)
                .logger(LOG, "updateTaskRun")
                .serviceDetails(
                        "DataIntegration",
                        "UpdateTaskRun",
                        "https://docs.oracle.com/iaas/api/#/en/data-integration/20200430/TaskRun/UpdateTaskRun")
                .method(com.oracle.bmc.http.client.Method.PUT)
                .requestBuilder(UpdateTaskRunRequest::builder)
                .basePath("/20200430")
                .appendPathParam("workspaces")
                .appendPathParam(request.getWorkspaceId())
                .appendPathParam("applications")
                .appendPathParam(request.getApplicationKey())
                .appendPathParam("taskRuns")
                .appendPathParam(request.getTaskRunKey())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("if-match", request.getIfMatch())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.dataintegration.model.TaskRunDetails.class,
                        UpdateTaskRunResponse.Builder::taskRunDetails)
                .handleResponseHeaderString("etag", UpdateTaskRunResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", UpdateTaskRunResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<UpdateTaskScheduleResponse> updateTaskSchedule(
            UpdateTaskScheduleRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            UpdateTaskScheduleRequest, UpdateTaskScheduleResponse>
                    handler) {

        Validate.notBlank(request.getWorkspaceId(), "workspaceId must not be blank");

        Validate.notBlank(request.getApplicationKey(), "applicationKey must not be blank");

        Validate.notBlank(request.getTaskScheduleKey(), "taskScheduleKey must not be blank");
        Objects.requireNonNull(
                request.getUpdateTaskScheduleDetails(), "updateTaskScheduleDetails is required");

        return clientCall(request, UpdateTaskScheduleResponse::builder)
                .logger(LOG, "updateTaskSchedule")
                .serviceDetails(
                        "DataIntegration",
                        "UpdateTaskSchedule",
                        "https://docs.oracle.com/iaas/api/#/en/data-integration/20200430/TaskSchedule/UpdateTaskSchedule")
                .method(com.oracle.bmc.http.client.Method.PUT)
                .requestBuilder(UpdateTaskScheduleRequest::builder)
                .basePath("/20200430")
                .appendPathParam("workspaces")
                .appendPathParam(request.getWorkspaceId())
                .appendPathParam("applications")
                .appendPathParam(request.getApplicationKey())
                .appendPathParam("taskSchedules")
                .appendPathParam(request.getTaskScheduleKey())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.dataintegration.model.TaskSchedule.class,
                        UpdateTaskScheduleResponse.Builder::taskSchedule)
                .handleResponseHeaderString(
                        "opc-request-id", UpdateTaskScheduleResponse.Builder::opcRequestId)
                .handleResponseHeaderString("etag", UpdateTaskScheduleResponse.Builder::etag)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<UpdateUserDefinedFunctionResponse> updateUserDefinedFunction(
            UpdateUserDefinedFunctionRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            UpdateUserDefinedFunctionRequest, UpdateUserDefinedFunctionResponse>
                    handler) {

        Validate.notBlank(request.getWorkspaceId(), "workspaceId must not be blank");

        Validate.notBlank(
                request.getUserDefinedFunctionKey(), "userDefinedFunctionKey must not be blank");
        Objects.requireNonNull(
                request.getUpdateUserDefinedFunctionDetails(),
                "updateUserDefinedFunctionDetails is required");

        return clientCall(request, UpdateUserDefinedFunctionResponse::builder)
                .logger(LOG, "updateUserDefinedFunction")
                .serviceDetails(
                        "DataIntegration",
                        "UpdateUserDefinedFunction",
                        "https://docs.oracle.com/iaas/api/#/en/data-integration/20200430/UserDefinedFunction/UpdateUserDefinedFunction")
                .method(com.oracle.bmc.http.client.Method.PUT)
                .requestBuilder(UpdateUserDefinedFunctionRequest::builder)
                .basePath("/20200430")
                .appendPathParam("workspaces")
                .appendPathParam(request.getWorkspaceId())
                .appendPathParam("userDefinedFunctions")
                .appendPathParam(request.getUserDefinedFunctionKey())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("if-match", request.getIfMatch())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.dataintegration.model.UserDefinedFunction.class,
                        UpdateUserDefinedFunctionResponse.Builder::userDefinedFunction)
                .handleResponseHeaderString("etag", UpdateUserDefinedFunctionResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", UpdateUserDefinedFunctionResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<UpdateWorkspaceResponse> updateWorkspace(
            UpdateWorkspaceRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            UpdateWorkspaceRequest, UpdateWorkspaceResponse>
                    handler) {

        Validate.notBlank(request.getWorkspaceId(), "workspaceId must not be blank");
        Objects.requireNonNull(
                request.getUpdateWorkspaceDetails(), "updateWorkspaceDetails is required");

        return clientCall(request, UpdateWorkspaceResponse::builder)
                .logger(LOG, "updateWorkspace")
                .serviceDetails(
                        "DataIntegration",
                        "UpdateWorkspace",
                        "https://docs.oracle.com/iaas/api/#/en/data-integration/20200430/Workspace/UpdateWorkspace")
                .method(com.oracle.bmc.http.client.Method.PUT)
                .requestBuilder(UpdateWorkspaceRequest::builder)
                .basePath("/20200430")
                .appendPathParam("workspaces")
                .appendPathParam(request.getWorkspaceId())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.dataintegration.model.Workspace.class,
                        UpdateWorkspaceResponse.Builder::workspace)
                .handleResponseHeaderString("etag", UpdateWorkspaceResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", UpdateWorkspaceResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-work-request-id", UpdateWorkspaceResponse.Builder::opcWorkRequestId)
                .callAsync(handler);
    }

    /**
     * Create a new client instance.
     *
     * @param authenticationDetailsProvider The authentication details (see {@link Builder#build})
     * @deprecated Use the {@link #builder() builder} instead.
     */
    @Deprecated
    public DataIntegrationAsyncClient(
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
    public DataIntegrationAsyncClient(
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
    public DataIntegrationAsyncClient(
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
    public DataIntegrationAsyncClient(
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
    public DataIntegrationAsyncClient(
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
    public DataIntegrationAsyncClient(
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
    public DataIntegrationAsyncClient(
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
