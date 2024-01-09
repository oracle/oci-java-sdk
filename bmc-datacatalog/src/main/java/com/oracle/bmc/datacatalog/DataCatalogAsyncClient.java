/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.datacatalog;

import com.oracle.bmc.util.internal.Validate;
import com.oracle.bmc.datacatalog.requests.*;
import com.oracle.bmc.datacatalog.responses.*;

import java.util.Objects;

/**
 * Async client implementation for DataCatalog service. <br>
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
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20190325")
public class DataCatalogAsyncClient extends com.oracle.bmc.http.internal.BaseAsyncClient
        implements DataCatalogAsync {
    /** Service instance for DataCatalog. */
    public static final com.oracle.bmc.Service SERVICE =
            com.oracle.bmc.Services.serviceBuilder()
                    .serviceName("DATACATALOG")
                    .serviceEndpointPrefix("")
                    .serviceEndpointTemplate("https://datacatalog.{region}.oci.{secondLevelDomain}")
                    .build();

    private static final org.slf4j.Logger LOG =
            org.slf4j.LoggerFactory.getLogger(DataCatalogAsyncClient.class);

    DataCatalogAsyncClient(
            com.oracle.bmc.common.ClientBuilderBase<?, ?> builder,
            com.oracle.bmc.auth.AbstractAuthenticationDetailsProvider
                    authenticationDetailsProvider) {
        this(builder, authenticationDetailsProvider, true);
    }

    DataCatalogAsyncClient(
            com.oracle.bmc.common.ClientBuilderBase<?, ?> builder,
            com.oracle.bmc.auth.AbstractAuthenticationDetailsProvider authenticationDetailsProvider,
            boolean isStreamWarningEnabled) {
        super(builder, authenticationDetailsProvider);

        if (isStreamWarningEnabled && com.oracle.bmc.util.StreamUtils.isExtraStreamLogsEnabled()) {
            LOG.warn(
                    com.oracle.bmc.util.StreamUtils.getStreamWarningMessage(
                            "DataCatalogAsyncClient", "synchronousExportDataAsset"));
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
            extends com.oracle.bmc.common.RegionalClientBuilder<Builder, DataCatalogAsyncClient> {
        private boolean isStreamWarningEnabled = true;

        private Builder(com.oracle.bmc.Service service) {
            super(service);
            final String packageName = "datacatalog";
            com.oracle.bmc.internal.Alloy.throwDisabledServiceExceptionIfAppropriate(packageName);
            requestSignerFactory =
                    new com.oracle.bmc.http.signing.internal.DefaultRequestSignerFactory(
                            com.oracle.bmc.http.signing.SigningStrategy.STANDARD);
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
        public DataCatalogAsyncClient build(
                @jakarta.annotation.Nonnull
                        com.oracle.bmc.auth.AbstractAuthenticationDetailsProvider
                                authenticationDetailsProvider) {
            return new DataCatalogAsyncClient(
                    this, authenticationDetailsProvider, isStreamWarningEnabled);
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
    public java.util.concurrent.Future<AddCatalogLockResponse> addCatalogLock(
            AddCatalogLockRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            AddCatalogLockRequest, AddCatalogLockResponse>
                    handler) {

        Validate.notBlank(request.getCatalogId(), "catalogId must not be blank");
        Objects.requireNonNull(
                request.getAddResourceLockDetails(), "addResourceLockDetails is required");

        return clientCall(request, AddCatalogLockResponse::builder)
                .logger(LOG, "addCatalogLock")
                .serviceDetails(
                        "DataCatalog",
                        "AddCatalogLock",
                        "https://docs.oracle.com/iaas/api/#/en/data-catalog/20190325/Catalog/AddCatalogLock")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(AddCatalogLockRequest::builder)
                .basePath("/20190325")
                .appendPathParam("catalogs")
                .appendPathParam(request.getCatalogId())
                .appendPathParam("actions")
                .appendPathParam("addLock")
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("if-match", request.getIfMatch())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.datacatalog.model.Catalog.class,
                        AddCatalogLockResponse.Builder::catalog)
                .handleResponseHeaderString(
                        "opc-request-id", AddCatalogLockResponse.Builder::opcRequestId)
                .handleResponseHeaderString("etag", AddCatalogLockResponse.Builder::etag)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<AddCatalogPrivateEndpointLockResponse>
            addCatalogPrivateEndpointLock(
                    AddCatalogPrivateEndpointLockRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    AddCatalogPrivateEndpointLockRequest,
                                    AddCatalogPrivateEndpointLockResponse>
                            handler) {

        Validate.notBlank(
                request.getCatalogPrivateEndpointId(),
                "catalogPrivateEndpointId must not be blank");
        Objects.requireNonNull(
                request.getAddResourceLockDetails(), "addResourceLockDetails is required");

        return clientCall(request, AddCatalogPrivateEndpointLockResponse::builder)
                .logger(LOG, "addCatalogPrivateEndpointLock")
                .serviceDetails(
                        "DataCatalog",
                        "AddCatalogPrivateEndpointLock",
                        "https://docs.oracle.com/iaas/api/#/en/data-catalog/20190325/CatalogPrivateEndpoint/AddCatalogPrivateEndpointLock")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(AddCatalogPrivateEndpointLockRequest::builder)
                .basePath("/20190325")
                .appendPathParam("catalogPrivateEndpoints")
                .appendPathParam(request.getCatalogPrivateEndpointId())
                .appendPathParam("actions")
                .appendPathParam("addLock")
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("if-match", request.getIfMatch())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.datacatalog.model.CatalogPrivateEndpoint.class,
                        AddCatalogPrivateEndpointLockResponse.Builder::catalogPrivateEndpoint)
                .handleResponseHeaderString(
                        "opc-request-id",
                        AddCatalogPrivateEndpointLockResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "etag", AddCatalogPrivateEndpointLockResponse.Builder::etag)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<AddDataSelectorPatternsResponse> addDataSelectorPatterns(
            AddDataSelectorPatternsRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            AddDataSelectorPatternsRequest, AddDataSelectorPatternsResponse>
                    handler) {

        Validate.notBlank(request.getCatalogId(), "catalogId must not be blank");

        Validate.notBlank(request.getDataAssetKey(), "dataAssetKey must not be blank");
        Objects.requireNonNull(
                request.getDataSelectorPatternDetails(), "dataSelectorPatternDetails is required");

        return clientCall(request, AddDataSelectorPatternsResponse::builder)
                .logger(LOG, "addDataSelectorPatterns")
                .serviceDetails(
                        "DataCatalog",
                        "AddDataSelectorPatterns",
                        "https://docs.oracle.com/iaas/api/#/en/data-catalog/20190325/DataAsset/AddDataSelectorPatterns")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(AddDataSelectorPatternsRequest::builder)
                .basePath("/20190325")
                .appendPathParam("catalogs")
                .appendPathParam(request.getCatalogId())
                .appendPathParam("dataAssets")
                .appendPathParam(request.getDataAssetKey())
                .appendPathParam("actions")
                .appendPathParam("addDataSelectorPatterns")
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.datacatalog.model.DataAsset.class,
                        AddDataSelectorPatternsResponse.Builder::dataAsset)
                .handleResponseHeaderString("etag", AddDataSelectorPatternsResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", AddDataSelectorPatternsResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<AddMetastoreLockResponse> addMetastoreLock(
            AddMetastoreLockRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            AddMetastoreLockRequest, AddMetastoreLockResponse>
                    handler) {

        Validate.notBlank(request.getMetastoreId(), "metastoreId must not be blank");
        Objects.requireNonNull(
                request.getAddResourceLockDetails(), "addResourceLockDetails is required");

        return clientCall(request, AddMetastoreLockResponse::builder)
                .logger(LOG, "addMetastoreLock")
                .serviceDetails(
                        "DataCatalog",
                        "AddMetastoreLock",
                        "https://docs.oracle.com/iaas/api/#/en/data-catalog/20190325/Metastore/AddMetastoreLock")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(AddMetastoreLockRequest::builder)
                .basePath("/20190325")
                .appendPathParam("metastores")
                .appendPathParam(request.getMetastoreId())
                .appendPathParam("actions")
                .appendPathParam("addLock")
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("if-match", request.getIfMatch())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.datacatalog.model.Metastore.class,
                        AddMetastoreLockResponse.Builder::metastore)
                .handleResponseHeaderString(
                        "opc-request-id", AddMetastoreLockResponse.Builder::opcRequestId)
                .handleResponseHeaderString("etag", AddMetastoreLockResponse.Builder::etag)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<AssociateCustomPropertyResponse> associateCustomProperty(
            AssociateCustomPropertyRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            AssociateCustomPropertyRequest, AssociateCustomPropertyResponse>
                    handler) {

        Validate.notBlank(request.getCatalogId(), "catalogId must not be blank");

        Validate.notBlank(request.getTypeKey(), "typeKey must not be blank");
        Objects.requireNonNull(
                request.getAssociateCustomPropertyDetails(),
                "associateCustomPropertyDetails is required");

        return clientCall(request, AssociateCustomPropertyResponse::builder)
                .logger(LOG, "associateCustomProperty")
                .serviceDetails(
                        "DataCatalog",
                        "AssociateCustomProperty",
                        "https://docs.oracle.com/iaas/api/#/en/data-catalog/20190325/Type/AssociateCustomProperty")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(AssociateCustomPropertyRequest::builder)
                .basePath("/20190325")
                .appendPathParam("catalogs")
                .appendPathParam(request.getCatalogId())
                .appendPathParam("types")
                .appendPathParam(request.getTypeKey())
                .appendPathParam("actions")
                .appendPathParam("associateCustomProperties")
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.datacatalog.model.Type.class,
                        AssociateCustomPropertyResponse.Builder::type)
                .handleResponseHeaderString("etag", AssociateCustomPropertyResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", AssociateCustomPropertyResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<AsynchronousExportGlossaryResponse>
            asynchronousExportGlossary(
                    AsynchronousExportGlossaryRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    AsynchronousExportGlossaryRequest,
                                    AsynchronousExportGlossaryResponse>
                            handler) {

        Validate.notBlank(request.getCatalogId(), "catalogId must not be blank");

        Validate.notBlank(request.getGlossaryKey(), "glossaryKey must not be blank");
        Objects.requireNonNull(
                request.getAsynchronousExportGlossaryDetails(),
                "asynchronousExportGlossaryDetails is required");

        return clientCall(request, AsynchronousExportGlossaryResponse::builder)
                .logger(LOG, "asynchronousExportGlossary")
                .serviceDetails(
                        "DataCatalog",
                        "AsynchronousExportGlossary",
                        "https://docs.oracle.com/iaas/api/#/en/data-catalog/20190325/Glossary/AsynchronousExportGlossary")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(AsynchronousExportGlossaryRequest::builder)
                .basePath("/20190325")
                .appendPathParam("catalogs")
                .appendPathParam(request.getCatalogId())
                .appendPathParam("glossaries")
                .appendPathParam(request.getGlossaryKey())
                .appendPathParam("actions")
                .appendPathParam("asynchronousExport")
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.datacatalog.model.AsynchronousExportGlossaryResult.class,
                        AsynchronousExportGlossaryResponse.Builder
                                ::asynchronousExportGlossaryResult)
                .handleResponseHeaderString(
                        "etag", AsynchronousExportGlossaryResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", AsynchronousExportGlossaryResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<AttachCatalogPrivateEndpointResponse>
            attachCatalogPrivateEndpoint(
                    AttachCatalogPrivateEndpointRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    AttachCatalogPrivateEndpointRequest,
                                    AttachCatalogPrivateEndpointResponse>
                            handler) {
        Objects.requireNonNull(
                request.getAttachCatalogPrivateEndpointDetails(),
                "attachCatalogPrivateEndpointDetails is required");

        Validate.notBlank(request.getCatalogId(), "catalogId must not be blank");

        return clientCall(request, AttachCatalogPrivateEndpointResponse::builder)
                .logger(LOG, "attachCatalogPrivateEndpoint")
                .serviceDetails(
                        "DataCatalog",
                        "AttachCatalogPrivateEndpoint",
                        "https://docs.oracle.com/iaas/api/#/en/data-catalog/20190325/Catalog/AttachCatalogPrivateEndpoint")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(AttachCatalogPrivateEndpointRequest::builder)
                .basePath("/20190325")
                .appendPathParam("catalogs")
                .appendPathParam(request.getCatalogId())
                .appendPathParam("actions")
                .appendPathParam("attachCatalogPrivateEndpoint")
                .appendQueryParam("isLockOverride", request.getIsLockOverride())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .hasBody()
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        AttachCatalogPrivateEndpointResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id",
                        AttachCatalogPrivateEndpointResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ChangeCatalogCompartmentResponse> changeCatalogCompartment(
            ChangeCatalogCompartmentRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ChangeCatalogCompartmentRequest, ChangeCatalogCompartmentResponse>
                    handler) {
        Objects.requireNonNull(
                request.getChangeCatalogCompartmentDetails(),
                "changeCatalogCompartmentDetails is required");

        Validate.notBlank(request.getCatalogId(), "catalogId must not be blank");

        return clientCall(request, ChangeCatalogCompartmentResponse::builder)
                .logger(LOG, "changeCatalogCompartment")
                .serviceDetails(
                        "DataCatalog",
                        "ChangeCatalogCompartment",
                        "https://docs.oracle.com/iaas/api/#/en/data-catalog/20190325/Catalog/ChangeCatalogCompartment")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(ChangeCatalogCompartmentRequest::builder)
                .basePath("/20190325")
                .appendPathParam("catalogs")
                .appendPathParam(request.getCatalogId())
                .appendPathParam("actions")
                .appendPathParam("changeCompartment")
                .appendQueryParam("isLockOverride", request.getIsLockOverride())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .hasBody()
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        ChangeCatalogCompartmentResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", ChangeCatalogCompartmentResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ChangeCatalogPrivateEndpointCompartmentResponse>
            changeCatalogPrivateEndpointCompartment(
                    ChangeCatalogPrivateEndpointCompartmentRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    ChangeCatalogPrivateEndpointCompartmentRequest,
                                    ChangeCatalogPrivateEndpointCompartmentResponse>
                            handler) {
        Objects.requireNonNull(
                request.getChangeCatalogPrivateEndpointCompartmentDetails(),
                "changeCatalogPrivateEndpointCompartmentDetails is required");

        Validate.notBlank(
                request.getCatalogPrivateEndpointId(),
                "catalogPrivateEndpointId must not be blank");

        return clientCall(request, ChangeCatalogPrivateEndpointCompartmentResponse::builder)
                .logger(LOG, "changeCatalogPrivateEndpointCompartment")
                .serviceDetails(
                        "DataCatalog",
                        "ChangeCatalogPrivateEndpointCompartment",
                        "https://docs.oracle.com/iaas/api/#/en/data-catalog/20190325/CatalogPrivateEndpoint/ChangeCatalogPrivateEndpointCompartment")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(ChangeCatalogPrivateEndpointCompartmentRequest::builder)
                .basePath("/20190325")
                .appendPathParam("catalogPrivateEndpoints")
                .appendPathParam(request.getCatalogPrivateEndpointId())
                .appendPathParam("actions")
                .appendPathParam("changeCompartment")
                .appendQueryParam("isLockOverride", request.getIsLockOverride())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .hasBody()
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        ChangeCatalogPrivateEndpointCompartmentResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id",
                        ChangeCatalogPrivateEndpointCompartmentResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ChangeMetastoreCompartmentResponse>
            changeMetastoreCompartment(
                    ChangeMetastoreCompartmentRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    ChangeMetastoreCompartmentRequest,
                                    ChangeMetastoreCompartmentResponse>
                            handler) {
        Objects.requireNonNull(
                request.getChangeMetastoreCompartmentDetails(),
                "changeMetastoreCompartmentDetails is required");

        Validate.notBlank(request.getMetastoreId(), "metastoreId must not be blank");

        return clientCall(request, ChangeMetastoreCompartmentResponse::builder)
                .logger(LOG, "changeMetastoreCompartment")
                .serviceDetails(
                        "DataCatalog",
                        "ChangeMetastoreCompartment",
                        "https://docs.oracle.com/iaas/api/#/en/data-catalog/20190325/Metastore/ChangeMetastoreCompartment")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(ChangeMetastoreCompartmentRequest::builder)
                .basePath("/20190325")
                .appendPathParam("metastores")
                .appendPathParam(request.getMetastoreId())
                .appendPathParam("actions")
                .appendPathParam("changeCompartment")
                .appendQueryParam("isLockOverride", request.getIsLockOverride())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .hasBody()
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        ChangeMetastoreCompartmentResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", ChangeMetastoreCompartmentResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<CreateAttributeResponse> createAttribute(
            CreateAttributeRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            CreateAttributeRequest, CreateAttributeResponse>
                    handler) {

        Validate.notBlank(request.getCatalogId(), "catalogId must not be blank");

        Validate.notBlank(request.getDataAssetKey(), "dataAssetKey must not be blank");

        Validate.notBlank(request.getEntityKey(), "entityKey must not be blank");
        Objects.requireNonNull(
                request.getCreateAttributeDetails(), "createAttributeDetails is required");

        return clientCall(request, CreateAttributeResponse::builder)
                .logger(LOG, "createAttribute")
                .serviceDetails(
                        "DataCatalog",
                        "CreateAttribute",
                        "https://docs.oracle.com/iaas/api/#/en/data-catalog/20190325/Attribute/CreateAttribute")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(CreateAttributeRequest::builder)
                .basePath("/20190325")
                .appendPathParam("catalogs")
                .appendPathParam(request.getCatalogId())
                .appendPathParam("dataAssets")
                .appendPathParam(request.getDataAssetKey())
                .appendPathParam("entities")
                .appendPathParam(request.getEntityKey())
                .appendPathParam("attributes")
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.datacatalog.model.Attribute.class,
                        CreateAttributeResponse.Builder::attribute)
                .handleResponseHeaderString("etag", CreateAttributeResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", CreateAttributeResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<CreateAttributeTagResponse> createAttributeTag(
            CreateAttributeTagRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            CreateAttributeTagRequest, CreateAttributeTagResponse>
                    handler) {

        Validate.notBlank(request.getCatalogId(), "catalogId must not be blank");

        Validate.notBlank(request.getDataAssetKey(), "dataAssetKey must not be blank");

        Validate.notBlank(request.getEntityKey(), "entityKey must not be blank");

        Validate.notBlank(request.getAttributeKey(), "attributeKey must not be blank");
        Objects.requireNonNull(
                request.getCreateAttributeTagDetails(), "createAttributeTagDetails is required");

        return clientCall(request, CreateAttributeTagResponse::builder)
                .logger(LOG, "createAttributeTag")
                .serviceDetails(
                        "DataCatalog",
                        "CreateAttributeTag",
                        "https://docs.oracle.com/iaas/api/#/en/data-catalog/20190325/AttributeTag/CreateAttributeTag")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(CreateAttributeTagRequest::builder)
                .basePath("/20190325")
                .appendPathParam("catalogs")
                .appendPathParam(request.getCatalogId())
                .appendPathParam("dataAssets")
                .appendPathParam(request.getDataAssetKey())
                .appendPathParam("entities")
                .appendPathParam(request.getEntityKey())
                .appendPathParam("attributes")
                .appendPathParam(request.getAttributeKey())
                .appendPathParam("tags")
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.datacatalog.model.AttributeTag.class,
                        CreateAttributeTagResponse.Builder::attributeTag)
                .handleResponseHeaderString("etag", CreateAttributeTagResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", CreateAttributeTagResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<CreateCatalogResponse> createCatalog(
            CreateCatalogRequest request,
            final com.oracle.bmc.responses.AsyncHandler<CreateCatalogRequest, CreateCatalogResponse>
                    handler) {
        Objects.requireNonNull(
                request.getCreateCatalogDetails(), "createCatalogDetails is required");

        return clientCall(request, CreateCatalogResponse::builder)
                .logger(LOG, "createCatalog")
                .serviceDetails(
                        "DataCatalog",
                        "CreateCatalog",
                        "https://docs.oracle.com/iaas/api/#/en/data-catalog/20190325/Catalog/CreateCatalog")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(CreateCatalogRequest::builder)
                .basePath("/20190325")
                .appendPathParam("catalogs")
                .accept("application/json")
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .hasBody()
                .handleResponseHeaderString(
                        "opc-work-request-id", CreateCatalogResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", CreateCatalogResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<CreateCatalogPrivateEndpointResponse>
            createCatalogPrivateEndpoint(
                    CreateCatalogPrivateEndpointRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    CreateCatalogPrivateEndpointRequest,
                                    CreateCatalogPrivateEndpointResponse>
                            handler) {
        Objects.requireNonNull(
                request.getCreateCatalogPrivateEndpointDetails(),
                "createCatalogPrivateEndpointDetails is required");

        return clientCall(request, CreateCatalogPrivateEndpointResponse::builder)
                .logger(LOG, "createCatalogPrivateEndpoint")
                .serviceDetails(
                        "DataCatalog",
                        "CreateCatalogPrivateEndpoint",
                        "https://docs.oracle.com/iaas/api/#/en/data-catalog/20190325/CatalogPrivateEndpoint/CreateCatalogPrivateEndpoint")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(CreateCatalogPrivateEndpointRequest::builder)
                .basePath("/20190325")
                .appendPathParam("catalogPrivateEndpoints")
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .hasBody()
                .handleResponseHeaderString(
                        "opc-request-id",
                        CreateCatalogPrivateEndpointResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        CreateCatalogPrivateEndpointResponse.Builder::opcWorkRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<CreateConnectionResponse> createConnection(
            CreateConnectionRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            CreateConnectionRequest, CreateConnectionResponse>
                    handler) {

        Validate.notBlank(request.getCatalogId(), "catalogId must not be blank");

        Validate.notBlank(request.getDataAssetKey(), "dataAssetKey must not be blank");
        Objects.requireNonNull(
                request.getCreateConnectionDetails(), "createConnectionDetails is required");

        return clientCall(request, CreateConnectionResponse::builder)
                .logger(LOG, "createConnection")
                .serviceDetails(
                        "DataCatalog",
                        "CreateConnection",
                        "https://docs.oracle.com/iaas/api/#/en/data-catalog/20190325/Connection/CreateConnection")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(CreateConnectionRequest::builder)
                .basePath("/20190325")
                .appendPathParam("catalogs")
                .appendPathParam(request.getCatalogId())
                .appendPathParam("dataAssets")
                .appendPathParam(request.getDataAssetKey())
                .appendPathParam("connections")
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.datacatalog.model.Connection.class,
                        CreateConnectionResponse.Builder::connection)
                .handleResponseHeaderString("etag", CreateConnectionResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", CreateConnectionResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<CreateCustomPropertyResponse> createCustomProperty(
            CreateCustomPropertyRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            CreateCustomPropertyRequest, CreateCustomPropertyResponse>
                    handler) {

        Validate.notBlank(request.getCatalogId(), "catalogId must not be blank");

        Validate.notBlank(request.getNamespaceId(), "namespaceId must not be blank");
        Objects.requireNonNull(
                request.getCreateCustomPropertyDetails(),
                "createCustomPropertyDetails is required");

        return clientCall(request, CreateCustomPropertyResponse::builder)
                .logger(LOG, "createCustomProperty")
                .serviceDetails(
                        "DataCatalog",
                        "CreateCustomProperty",
                        "https://docs.oracle.com/iaas/api/#/en/data-catalog/20190325/CustomProperty/CreateCustomProperty")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(CreateCustomPropertyRequest::builder)
                .basePath("/20190325")
                .appendPathParam("catalogs")
                .appendPathParam(request.getCatalogId())
                .appendPathParam("namespaces")
                .appendPathParam(request.getNamespaceId())
                .appendPathParam("customProperties")
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.datacatalog.model.CustomProperty.class,
                        CreateCustomPropertyResponse.Builder::customProperty)
                .handleResponseHeaderString("etag", CreateCustomPropertyResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", CreateCustomPropertyResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<CreateDataAssetResponse> createDataAsset(
            CreateDataAssetRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            CreateDataAssetRequest, CreateDataAssetResponse>
                    handler) {

        Validate.notBlank(request.getCatalogId(), "catalogId must not be blank");
        Objects.requireNonNull(
                request.getCreateDataAssetDetails(), "createDataAssetDetails is required");

        return clientCall(request, CreateDataAssetResponse::builder)
                .logger(LOG, "createDataAsset")
                .serviceDetails(
                        "DataCatalog",
                        "CreateDataAsset",
                        "https://docs.oracle.com/iaas/api/#/en/data-catalog/20190325/DataAsset/CreateDataAsset")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(CreateDataAssetRequest::builder)
                .basePath("/20190325")
                .appendPathParam("catalogs")
                .appendPathParam(request.getCatalogId())
                .appendPathParam("dataAssets")
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.datacatalog.model.DataAsset.class,
                        CreateDataAssetResponse.Builder::dataAsset)
                .handleResponseHeaderString("etag", CreateDataAssetResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", CreateDataAssetResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<CreateDataAssetTagResponse> createDataAssetTag(
            CreateDataAssetTagRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            CreateDataAssetTagRequest, CreateDataAssetTagResponse>
                    handler) {

        Validate.notBlank(request.getCatalogId(), "catalogId must not be blank");

        Validate.notBlank(request.getDataAssetKey(), "dataAssetKey must not be blank");
        Objects.requireNonNull(
                request.getCreateDataAssetTagDetails(), "createDataAssetTagDetails is required");

        return clientCall(request, CreateDataAssetTagResponse::builder)
                .logger(LOG, "createDataAssetTag")
                .serviceDetails(
                        "DataCatalog",
                        "CreateDataAssetTag",
                        "https://docs.oracle.com/iaas/api/#/en/data-catalog/20190325/DataAssetTag/CreateDataAssetTag")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(CreateDataAssetTagRequest::builder)
                .basePath("/20190325")
                .appendPathParam("catalogs")
                .appendPathParam(request.getCatalogId())
                .appendPathParam("dataAssets")
                .appendPathParam(request.getDataAssetKey())
                .appendPathParam("tags")
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.datacatalog.model.DataAssetTag.class,
                        CreateDataAssetTagResponse.Builder::dataAssetTag)
                .handleResponseHeaderString("etag", CreateDataAssetTagResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", CreateDataAssetTagResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<CreateEntityResponse> createEntity(
            CreateEntityRequest request,
            final com.oracle.bmc.responses.AsyncHandler<CreateEntityRequest, CreateEntityResponse>
                    handler) {

        Validate.notBlank(request.getCatalogId(), "catalogId must not be blank");

        Validate.notBlank(request.getDataAssetKey(), "dataAssetKey must not be blank");
        Objects.requireNonNull(request.getCreateEntityDetails(), "createEntityDetails is required");

        return clientCall(request, CreateEntityResponse::builder)
                .logger(LOG, "createEntity")
                .serviceDetails(
                        "DataCatalog",
                        "CreateEntity",
                        "https://docs.oracle.com/iaas/api/#/en/data-catalog/20190325/Entity/CreateEntity")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(CreateEntityRequest::builder)
                .basePath("/20190325")
                .appendPathParam("catalogs")
                .appendPathParam(request.getCatalogId())
                .appendPathParam("dataAssets")
                .appendPathParam(request.getDataAssetKey())
                .appendPathParam("entities")
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.datacatalog.model.Entity.class,
                        CreateEntityResponse.Builder::entity)
                .handleResponseHeaderString("etag", CreateEntityResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", CreateEntityResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<CreateEntityTagResponse> createEntityTag(
            CreateEntityTagRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            CreateEntityTagRequest, CreateEntityTagResponse>
                    handler) {

        Validate.notBlank(request.getCatalogId(), "catalogId must not be blank");

        Validate.notBlank(request.getDataAssetKey(), "dataAssetKey must not be blank");

        Validate.notBlank(request.getEntityKey(), "entityKey must not be blank");
        Objects.requireNonNull(
                request.getCreateEntityTagDetails(), "createEntityTagDetails is required");

        return clientCall(request, CreateEntityTagResponse::builder)
                .logger(LOG, "createEntityTag")
                .serviceDetails(
                        "DataCatalog",
                        "CreateEntityTag",
                        "https://docs.oracle.com/iaas/api/#/en/data-catalog/20190325/EntityTag/CreateEntityTag")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(CreateEntityTagRequest::builder)
                .basePath("/20190325")
                .appendPathParam("catalogs")
                .appendPathParam(request.getCatalogId())
                .appendPathParam("dataAssets")
                .appendPathParam(request.getDataAssetKey())
                .appendPathParam("entities")
                .appendPathParam(request.getEntityKey())
                .appendPathParam("tags")
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.datacatalog.model.EntityTag.class,
                        CreateEntityTagResponse.Builder::entityTag)
                .handleResponseHeaderString("etag", CreateEntityTagResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", CreateEntityTagResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<CreateFolderResponse> createFolder(
            CreateFolderRequest request,
            final com.oracle.bmc.responses.AsyncHandler<CreateFolderRequest, CreateFolderResponse>
                    handler) {

        Validate.notBlank(request.getCatalogId(), "catalogId must not be blank");

        Validate.notBlank(request.getDataAssetKey(), "dataAssetKey must not be blank");
        Objects.requireNonNull(request.getCreateFolderDetails(), "createFolderDetails is required");

        return clientCall(request, CreateFolderResponse::builder)
                .logger(LOG, "createFolder")
                .serviceDetails(
                        "DataCatalog",
                        "CreateFolder",
                        "https://docs.oracle.com/iaas/api/#/en/data-catalog/20190325/Folder/CreateFolder")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(CreateFolderRequest::builder)
                .basePath("/20190325")
                .appendPathParam("catalogs")
                .appendPathParam(request.getCatalogId())
                .appendPathParam("dataAssets")
                .appendPathParam(request.getDataAssetKey())
                .appendPathParam("folders")
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.datacatalog.model.Folder.class,
                        CreateFolderResponse.Builder::folder)
                .handleResponseHeaderString("etag", CreateFolderResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", CreateFolderResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<CreateFolderTagResponse> createFolderTag(
            CreateFolderTagRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            CreateFolderTagRequest, CreateFolderTagResponse>
                    handler) {

        Validate.notBlank(request.getCatalogId(), "catalogId must not be blank");

        Validate.notBlank(request.getDataAssetKey(), "dataAssetKey must not be blank");

        Validate.notBlank(request.getFolderKey(), "folderKey must not be blank");
        Objects.requireNonNull(
                request.getCreateFolderTagDetails(), "createFolderTagDetails is required");

        return clientCall(request, CreateFolderTagResponse::builder)
                .logger(LOG, "createFolderTag")
                .serviceDetails(
                        "DataCatalog",
                        "CreateFolderTag",
                        "https://docs.oracle.com/iaas/api/#/en/data-catalog/20190325/FolderTag/CreateFolderTag")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(CreateFolderTagRequest::builder)
                .basePath("/20190325")
                .appendPathParam("catalogs")
                .appendPathParam(request.getCatalogId())
                .appendPathParam("dataAssets")
                .appendPathParam(request.getDataAssetKey())
                .appendPathParam("folders")
                .appendPathParam(request.getFolderKey())
                .appendPathParam("tags")
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.datacatalog.model.FolderTag.class,
                        CreateFolderTagResponse.Builder::folderTag)
                .handleResponseHeaderString("etag", CreateFolderTagResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", CreateFolderTagResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<CreateGlossaryResponse> createGlossary(
            CreateGlossaryRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            CreateGlossaryRequest, CreateGlossaryResponse>
                    handler) {

        Validate.notBlank(request.getCatalogId(), "catalogId must not be blank");
        Objects.requireNonNull(
                request.getCreateGlossaryDetails(), "createGlossaryDetails is required");

        return clientCall(request, CreateGlossaryResponse::builder)
                .logger(LOG, "createGlossary")
                .serviceDetails(
                        "DataCatalog",
                        "CreateGlossary",
                        "https://docs.oracle.com/iaas/api/#/en/data-catalog/20190325/Glossary/CreateGlossary")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(CreateGlossaryRequest::builder)
                .basePath("/20190325")
                .appendPathParam("catalogs")
                .appendPathParam(request.getCatalogId())
                .appendPathParam("glossaries")
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.datacatalog.model.Glossary.class,
                        CreateGlossaryResponse.Builder::glossary)
                .handleResponseHeaderString("etag", CreateGlossaryResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", CreateGlossaryResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<CreateJobResponse> createJob(
            CreateJobRequest request,
            final com.oracle.bmc.responses.AsyncHandler<CreateJobRequest, CreateJobResponse>
                    handler) {

        Validate.notBlank(request.getCatalogId(), "catalogId must not be blank");
        Objects.requireNonNull(request.getCreateJobDetails(), "createJobDetails is required");

        return clientCall(request, CreateJobResponse::builder)
                .logger(LOG, "createJob")
                .serviceDetails(
                        "DataCatalog",
                        "CreateJob",
                        "https://docs.oracle.com/iaas/api/#/en/data-catalog/20190325/Job/CreateJob")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(CreateJobRequest::builder)
                .basePath("/20190325")
                .appendPathParam("catalogs")
                .appendPathParam(request.getCatalogId())
                .appendPathParam("jobs")
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.datacatalog.model.Job.class, CreateJobResponse.Builder::job)
                .handleResponseHeaderString("etag", CreateJobResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", CreateJobResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<CreateJobDefinitionResponse> createJobDefinition(
            CreateJobDefinitionRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            CreateJobDefinitionRequest, CreateJobDefinitionResponse>
                    handler) {

        Validate.notBlank(request.getCatalogId(), "catalogId must not be blank");
        Objects.requireNonNull(
                request.getCreateJobDefinitionDetails(), "createJobDefinitionDetails is required");

        return clientCall(request, CreateJobDefinitionResponse::builder)
                .logger(LOG, "createJobDefinition")
                .serviceDetails(
                        "DataCatalog",
                        "CreateJobDefinition",
                        "https://docs.oracle.com/iaas/api/#/en/data-catalog/20190325/JobDefinition/CreateJobDefinition")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(CreateJobDefinitionRequest::builder)
                .basePath("/20190325")
                .appendPathParam("catalogs")
                .appendPathParam(request.getCatalogId())
                .appendPathParam("jobDefinitions")
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.datacatalog.model.JobDefinition.class,
                        CreateJobDefinitionResponse.Builder::jobDefinition)
                .handleResponseHeaderString("etag", CreateJobDefinitionResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", CreateJobDefinitionResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<CreateJobExecutionResponse> createJobExecution(
            CreateJobExecutionRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            CreateJobExecutionRequest, CreateJobExecutionResponse>
                    handler) {

        Validate.notBlank(request.getCatalogId(), "catalogId must not be blank");

        Validate.notBlank(request.getJobKey(), "jobKey must not be blank");
        Objects.requireNonNull(
                request.getCreateJobExecutionDetails(), "createJobExecutionDetails is required");

        return clientCall(request, CreateJobExecutionResponse::builder)
                .logger(LOG, "createJobExecution")
                .serviceDetails(
                        "DataCatalog",
                        "CreateJobExecution",
                        "https://docs.oracle.com/iaas/api/#/en/data-catalog/20190325/JobExecution/CreateJobExecution")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(CreateJobExecutionRequest::builder)
                .basePath("/20190325")
                .appendPathParam("catalogs")
                .appendPathParam(request.getCatalogId())
                .appendPathParam("jobs")
                .appendPathParam(request.getJobKey())
                .appendPathParam("executions")
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.datacatalog.model.JobExecution.class,
                        CreateJobExecutionResponse.Builder::jobExecution)
                .handleResponseHeaderString("etag", CreateJobExecutionResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", CreateJobExecutionResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<CreateMetastoreResponse> createMetastore(
            CreateMetastoreRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            CreateMetastoreRequest, CreateMetastoreResponse>
                    handler) {
        Objects.requireNonNull(
                request.getCreateMetastoreDetails(), "createMetastoreDetails is required");

        return clientCall(request, CreateMetastoreResponse::builder)
                .logger(LOG, "createMetastore")
                .serviceDetails(
                        "DataCatalog",
                        "CreateMetastore",
                        "https://docs.oracle.com/iaas/api/#/en/data-catalog/20190325/Metastore/CreateMetastore")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(CreateMetastoreRequest::builder)
                .basePath("/20190325")
                .appendPathParam("metastores")
                .accept("application/json")
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .hasBody()
                .handleResponseHeaderString(
                        "opc-work-request-id", CreateMetastoreResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", CreateMetastoreResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<CreateNamespaceResponse> createNamespace(
            CreateNamespaceRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            CreateNamespaceRequest, CreateNamespaceResponse>
                    handler) {

        Validate.notBlank(request.getCatalogId(), "catalogId must not be blank");
        Objects.requireNonNull(
                request.getCreateNamespaceDetails(), "createNamespaceDetails is required");

        return clientCall(request, CreateNamespaceResponse::builder)
                .logger(LOG, "createNamespace")
                .serviceDetails(
                        "DataCatalog",
                        "CreateNamespace",
                        "https://docs.oracle.com/iaas/api/#/en/data-catalog/20190325/Namespace/CreateNamespace")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(CreateNamespaceRequest::builder)
                .basePath("/20190325")
                .appendPathParam("catalogs")
                .appendPathParam(request.getCatalogId())
                .appendPathParam("namespaces")
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.datacatalog.model.Namespace.class,
                        CreateNamespaceResponse.Builder::namespace)
                .handleResponseHeaderString("etag", CreateNamespaceResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", CreateNamespaceResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<CreatePatternResponse> createPattern(
            CreatePatternRequest request,
            final com.oracle.bmc.responses.AsyncHandler<CreatePatternRequest, CreatePatternResponse>
                    handler) {

        Validate.notBlank(request.getCatalogId(), "catalogId must not be blank");
        Objects.requireNonNull(
                request.getCreatePatternDetails(), "createPatternDetails is required");

        return clientCall(request, CreatePatternResponse::builder)
                .logger(LOG, "createPattern")
                .serviceDetails(
                        "DataCatalog",
                        "CreatePattern",
                        "https://docs.oracle.com/iaas/api/#/en/data-catalog/20190325/Pattern/CreatePattern")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(CreatePatternRequest::builder)
                .basePath("/20190325")
                .appendPathParam("catalogs")
                .appendPathParam(request.getCatalogId())
                .appendPathParam("patterns")
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.datacatalog.model.Pattern.class,
                        CreatePatternResponse.Builder::pattern)
                .handleResponseHeaderString("etag", CreatePatternResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", CreatePatternResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<CreateTermResponse> createTerm(
            CreateTermRequest request,
            final com.oracle.bmc.responses.AsyncHandler<CreateTermRequest, CreateTermResponse>
                    handler) {

        Validate.notBlank(request.getCatalogId(), "catalogId must not be blank");

        Validate.notBlank(request.getGlossaryKey(), "glossaryKey must not be blank");
        Objects.requireNonNull(request.getCreateTermDetails(), "createTermDetails is required");

        return clientCall(request, CreateTermResponse::builder)
                .logger(LOG, "createTerm")
                .serviceDetails(
                        "DataCatalog",
                        "CreateTerm",
                        "https://docs.oracle.com/iaas/api/#/en/data-catalog/20190325/Term/CreateTerm")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(CreateTermRequest::builder)
                .basePath("/20190325")
                .appendPathParam("catalogs")
                .appendPathParam(request.getCatalogId())
                .appendPathParam("glossaries")
                .appendPathParam(request.getGlossaryKey())
                .appendPathParam("terms")
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.datacatalog.model.Term.class,
                        CreateTermResponse.Builder::term)
                .handleResponseHeaderString("etag", CreateTermResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", CreateTermResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<CreateTermRelationshipResponse> createTermRelationship(
            CreateTermRelationshipRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            CreateTermRelationshipRequest, CreateTermRelationshipResponse>
                    handler) {

        Validate.notBlank(request.getCatalogId(), "catalogId must not be blank");

        Validate.notBlank(request.getGlossaryKey(), "glossaryKey must not be blank");

        Validate.notBlank(request.getTermKey(), "termKey must not be blank");
        Objects.requireNonNull(
                request.getCreateTermRelationshipDetails(),
                "createTermRelationshipDetails is required");

        return clientCall(request, CreateTermRelationshipResponse::builder)
                .logger(LOG, "createTermRelationship")
                .serviceDetails(
                        "DataCatalog",
                        "CreateTermRelationship",
                        "https://docs.oracle.com/iaas/api/#/en/data-catalog/20190325/TermRelationship/CreateTermRelationship")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(CreateTermRelationshipRequest::builder)
                .basePath("/20190325")
                .appendPathParam("catalogs")
                .appendPathParam(request.getCatalogId())
                .appendPathParam("glossaries")
                .appendPathParam(request.getGlossaryKey())
                .appendPathParam("terms")
                .appendPathParam(request.getTermKey())
                .appendPathParam("termRelationships")
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.datacatalog.model.TermRelationship.class,
                        CreateTermRelationshipResponse.Builder::termRelationship)
                .handleResponseHeaderString("etag", CreateTermRelationshipResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", CreateTermRelationshipResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<DeleteAttributeResponse> deleteAttribute(
            DeleteAttributeRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            DeleteAttributeRequest, DeleteAttributeResponse>
                    handler) {

        Validate.notBlank(request.getCatalogId(), "catalogId must not be blank");

        Validate.notBlank(request.getDataAssetKey(), "dataAssetKey must not be blank");

        Validate.notBlank(request.getEntityKey(), "entityKey must not be blank");

        Validate.notBlank(request.getAttributeKey(), "attributeKey must not be blank");

        return clientCall(request, DeleteAttributeResponse::builder)
                .logger(LOG, "deleteAttribute")
                .serviceDetails(
                        "DataCatalog",
                        "DeleteAttribute",
                        "https://docs.oracle.com/iaas/api/#/en/data-catalog/20190325/Attribute/DeleteAttribute")
                .method(com.oracle.bmc.http.client.Method.DELETE)
                .requestBuilder(DeleteAttributeRequest::builder)
                .basePath("/20190325")
                .appendPathParam("catalogs")
                .appendPathParam(request.getCatalogId())
                .appendPathParam("dataAssets")
                .appendPathParam(request.getDataAssetKey())
                .appendPathParam("entities")
                .appendPathParam(request.getEntityKey())
                .appendPathParam("attributes")
                .appendPathParam(request.getAttributeKey())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleResponseHeaderString(
                        "opc-request-id", DeleteAttributeResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<DeleteAttributeTagResponse> deleteAttributeTag(
            DeleteAttributeTagRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            DeleteAttributeTagRequest, DeleteAttributeTagResponse>
                    handler) {

        Validate.notBlank(request.getCatalogId(), "catalogId must not be blank");

        Validate.notBlank(request.getDataAssetKey(), "dataAssetKey must not be blank");

        Validate.notBlank(request.getEntityKey(), "entityKey must not be blank");

        Validate.notBlank(request.getAttributeKey(), "attributeKey must not be blank");

        Validate.notBlank(request.getTagKey(), "tagKey must not be blank");

        return clientCall(request, DeleteAttributeTagResponse::builder)
                .logger(LOG, "deleteAttributeTag")
                .serviceDetails(
                        "DataCatalog",
                        "DeleteAttributeTag",
                        "https://docs.oracle.com/iaas/api/#/en/data-catalog/20190325/AttributeTag/DeleteAttributeTag")
                .method(com.oracle.bmc.http.client.Method.DELETE)
                .requestBuilder(DeleteAttributeTagRequest::builder)
                .basePath("/20190325")
                .appendPathParam("catalogs")
                .appendPathParam(request.getCatalogId())
                .appendPathParam("dataAssets")
                .appendPathParam(request.getDataAssetKey())
                .appendPathParam("entities")
                .appendPathParam(request.getEntityKey())
                .appendPathParam("attributes")
                .appendPathParam(request.getAttributeKey())
                .appendPathParam("tags")
                .appendPathParam(request.getTagKey())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleResponseHeaderString(
                        "opc-request-id", DeleteAttributeTagResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<DeleteCatalogResponse> deleteCatalog(
            DeleteCatalogRequest request,
            final com.oracle.bmc.responses.AsyncHandler<DeleteCatalogRequest, DeleteCatalogResponse>
                    handler) {

        Validate.notBlank(request.getCatalogId(), "catalogId must not be blank");

        return clientCall(request, DeleteCatalogResponse::builder)
                .logger(LOG, "deleteCatalog")
                .serviceDetails(
                        "DataCatalog",
                        "DeleteCatalog",
                        "https://docs.oracle.com/iaas/api/#/en/data-catalog/20190325/Catalog/DeleteCatalog")
                .method(com.oracle.bmc.http.client.Method.DELETE)
                .requestBuilder(DeleteCatalogRequest::builder)
                .basePath("/20190325")
                .appendPathParam("catalogs")
                .appendPathParam(request.getCatalogId())
                .appendQueryParam("isLockOverride", request.getIsLockOverride())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleResponseHeaderString(
                        "opc-work-request-id", DeleteCatalogResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", DeleteCatalogResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<DeleteCatalogPrivateEndpointResponse>
            deleteCatalogPrivateEndpoint(
                    DeleteCatalogPrivateEndpointRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    DeleteCatalogPrivateEndpointRequest,
                                    DeleteCatalogPrivateEndpointResponse>
                            handler) {

        Validate.notBlank(
                request.getCatalogPrivateEndpointId(),
                "catalogPrivateEndpointId must not be blank");

        return clientCall(request, DeleteCatalogPrivateEndpointResponse::builder)
                .logger(LOG, "deleteCatalogPrivateEndpoint")
                .serviceDetails(
                        "DataCatalog",
                        "DeleteCatalogPrivateEndpoint",
                        "https://docs.oracle.com/iaas/api/#/en/data-catalog/20190325/CatalogPrivateEndpoint/DeleteCatalogPrivateEndpoint")
                .method(com.oracle.bmc.http.client.Method.DELETE)
                .requestBuilder(DeleteCatalogPrivateEndpointRequest::builder)
                .basePath("/20190325")
                .appendPathParam("catalogPrivateEndpoints")
                .appendPathParam(request.getCatalogPrivateEndpointId())
                .appendQueryParam("isLockOverride", request.getIsLockOverride())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        DeleteCatalogPrivateEndpointResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id",
                        DeleteCatalogPrivateEndpointResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<DeleteConnectionResponse> deleteConnection(
            DeleteConnectionRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            DeleteConnectionRequest, DeleteConnectionResponse>
                    handler) {

        Validate.notBlank(request.getCatalogId(), "catalogId must not be blank");

        Validate.notBlank(request.getDataAssetKey(), "dataAssetKey must not be blank");

        Validate.notBlank(request.getConnectionKey(), "connectionKey must not be blank");

        return clientCall(request, DeleteConnectionResponse::builder)
                .logger(LOG, "deleteConnection")
                .serviceDetails(
                        "DataCatalog",
                        "DeleteConnection",
                        "https://docs.oracle.com/iaas/api/#/en/data-catalog/20190325/Connection/DeleteConnection")
                .method(com.oracle.bmc.http.client.Method.DELETE)
                .requestBuilder(DeleteConnectionRequest::builder)
                .basePath("/20190325")
                .appendPathParam("catalogs")
                .appendPathParam(request.getCatalogId())
                .appendPathParam("dataAssets")
                .appendPathParam(request.getDataAssetKey())
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
    public java.util.concurrent.Future<DeleteCustomPropertyResponse> deleteCustomProperty(
            DeleteCustomPropertyRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            DeleteCustomPropertyRequest, DeleteCustomPropertyResponse>
                    handler) {

        Validate.notBlank(request.getCatalogId(), "catalogId must not be blank");

        Validate.notBlank(request.getNamespaceId(), "namespaceId must not be blank");

        Validate.notBlank(request.getCustomPropertyKey(), "customPropertyKey must not be blank");

        return clientCall(request, DeleteCustomPropertyResponse::builder)
                .logger(LOG, "deleteCustomProperty")
                .serviceDetails(
                        "DataCatalog",
                        "DeleteCustomProperty",
                        "https://docs.oracle.com/iaas/api/#/en/data-catalog/20190325/CustomProperty/DeleteCustomProperty")
                .method(com.oracle.bmc.http.client.Method.DELETE)
                .requestBuilder(DeleteCustomPropertyRequest::builder)
                .basePath("/20190325")
                .appendPathParam("catalogs")
                .appendPathParam(request.getCatalogId())
                .appendPathParam("namespaces")
                .appendPathParam(request.getNamespaceId())
                .appendPathParam("customProperties")
                .appendPathParam(request.getCustomPropertyKey())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleResponseHeaderString(
                        "opc-request-id", DeleteCustomPropertyResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<DeleteDataAssetResponse> deleteDataAsset(
            DeleteDataAssetRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            DeleteDataAssetRequest, DeleteDataAssetResponse>
                    handler) {

        Validate.notBlank(request.getCatalogId(), "catalogId must not be blank");

        Validate.notBlank(request.getDataAssetKey(), "dataAssetKey must not be blank");

        return clientCall(request, DeleteDataAssetResponse::builder)
                .logger(LOG, "deleteDataAsset")
                .serviceDetails(
                        "DataCatalog",
                        "DeleteDataAsset",
                        "https://docs.oracle.com/iaas/api/#/en/data-catalog/20190325/DataAsset/DeleteDataAsset")
                .method(com.oracle.bmc.http.client.Method.DELETE)
                .requestBuilder(DeleteDataAssetRequest::builder)
                .basePath("/20190325")
                .appendPathParam("catalogs")
                .appendPathParam(request.getCatalogId())
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
    public java.util.concurrent.Future<DeleteDataAssetTagResponse> deleteDataAssetTag(
            DeleteDataAssetTagRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            DeleteDataAssetTagRequest, DeleteDataAssetTagResponse>
                    handler) {

        Validate.notBlank(request.getCatalogId(), "catalogId must not be blank");

        Validate.notBlank(request.getDataAssetKey(), "dataAssetKey must not be blank");

        Validate.notBlank(request.getTagKey(), "tagKey must not be blank");

        return clientCall(request, DeleteDataAssetTagResponse::builder)
                .logger(LOG, "deleteDataAssetTag")
                .serviceDetails(
                        "DataCatalog",
                        "DeleteDataAssetTag",
                        "https://docs.oracle.com/iaas/api/#/en/data-catalog/20190325/DataAssetTag/DeleteDataAssetTag")
                .method(com.oracle.bmc.http.client.Method.DELETE)
                .requestBuilder(DeleteDataAssetTagRequest::builder)
                .basePath("/20190325")
                .appendPathParam("catalogs")
                .appendPathParam(request.getCatalogId())
                .appendPathParam("dataAssets")
                .appendPathParam(request.getDataAssetKey())
                .appendPathParam("tags")
                .appendPathParam(request.getTagKey())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleResponseHeaderString(
                        "opc-request-id", DeleteDataAssetTagResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<DeleteEntityResponse> deleteEntity(
            DeleteEntityRequest request,
            final com.oracle.bmc.responses.AsyncHandler<DeleteEntityRequest, DeleteEntityResponse>
                    handler) {

        Validate.notBlank(request.getCatalogId(), "catalogId must not be blank");

        Validate.notBlank(request.getDataAssetKey(), "dataAssetKey must not be blank");

        Validate.notBlank(request.getEntityKey(), "entityKey must not be blank");

        return clientCall(request, DeleteEntityResponse::builder)
                .logger(LOG, "deleteEntity")
                .serviceDetails(
                        "DataCatalog",
                        "DeleteEntity",
                        "https://docs.oracle.com/iaas/api/#/en/data-catalog/20190325/Entity/DeleteEntity")
                .method(com.oracle.bmc.http.client.Method.DELETE)
                .requestBuilder(DeleteEntityRequest::builder)
                .basePath("/20190325")
                .appendPathParam("catalogs")
                .appendPathParam(request.getCatalogId())
                .appendPathParam("dataAssets")
                .appendPathParam(request.getDataAssetKey())
                .appendPathParam("entities")
                .appendPathParam(request.getEntityKey())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleResponseHeaderString(
                        "opc-request-id", DeleteEntityResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<DeleteEntityTagResponse> deleteEntityTag(
            DeleteEntityTagRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            DeleteEntityTagRequest, DeleteEntityTagResponse>
                    handler) {

        Validate.notBlank(request.getCatalogId(), "catalogId must not be blank");

        Validate.notBlank(request.getDataAssetKey(), "dataAssetKey must not be blank");

        Validate.notBlank(request.getEntityKey(), "entityKey must not be blank");

        Validate.notBlank(request.getTagKey(), "tagKey must not be blank");

        return clientCall(request, DeleteEntityTagResponse::builder)
                .logger(LOG, "deleteEntityTag")
                .serviceDetails(
                        "DataCatalog",
                        "DeleteEntityTag",
                        "https://docs.oracle.com/iaas/api/#/en/data-catalog/20190325/EntityTag/DeleteEntityTag")
                .method(com.oracle.bmc.http.client.Method.DELETE)
                .requestBuilder(DeleteEntityTagRequest::builder)
                .basePath("/20190325")
                .appendPathParam("catalogs")
                .appendPathParam(request.getCatalogId())
                .appendPathParam("dataAssets")
                .appendPathParam(request.getDataAssetKey())
                .appendPathParam("entities")
                .appendPathParam(request.getEntityKey())
                .appendPathParam("tags")
                .appendPathParam(request.getTagKey())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleResponseHeaderString(
                        "opc-request-id", DeleteEntityTagResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<DeleteFolderResponse> deleteFolder(
            DeleteFolderRequest request,
            final com.oracle.bmc.responses.AsyncHandler<DeleteFolderRequest, DeleteFolderResponse>
                    handler) {

        Validate.notBlank(request.getCatalogId(), "catalogId must not be blank");

        Validate.notBlank(request.getDataAssetKey(), "dataAssetKey must not be blank");

        Validate.notBlank(request.getFolderKey(), "folderKey must not be blank");

        return clientCall(request, DeleteFolderResponse::builder)
                .logger(LOG, "deleteFolder")
                .serviceDetails(
                        "DataCatalog",
                        "DeleteFolder",
                        "https://docs.oracle.com/iaas/api/#/en/data-catalog/20190325/Folder/DeleteFolder")
                .method(com.oracle.bmc.http.client.Method.DELETE)
                .requestBuilder(DeleteFolderRequest::builder)
                .basePath("/20190325")
                .appendPathParam("catalogs")
                .appendPathParam(request.getCatalogId())
                .appendPathParam("dataAssets")
                .appendPathParam(request.getDataAssetKey())
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
    public java.util.concurrent.Future<DeleteFolderTagResponse> deleteFolderTag(
            DeleteFolderTagRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            DeleteFolderTagRequest, DeleteFolderTagResponse>
                    handler) {

        Validate.notBlank(request.getCatalogId(), "catalogId must not be blank");

        Validate.notBlank(request.getDataAssetKey(), "dataAssetKey must not be blank");

        Validate.notBlank(request.getFolderKey(), "folderKey must not be blank");

        Validate.notBlank(request.getTagKey(), "tagKey must not be blank");

        return clientCall(request, DeleteFolderTagResponse::builder)
                .logger(LOG, "deleteFolderTag")
                .serviceDetails(
                        "DataCatalog",
                        "DeleteFolderTag",
                        "https://docs.oracle.com/iaas/api/#/en/data-catalog/20190325/FolderTag/DeleteFolderTag")
                .method(com.oracle.bmc.http.client.Method.DELETE)
                .requestBuilder(DeleteFolderTagRequest::builder)
                .basePath("/20190325")
                .appendPathParam("catalogs")
                .appendPathParam(request.getCatalogId())
                .appendPathParam("dataAssets")
                .appendPathParam(request.getDataAssetKey())
                .appendPathParam("folders")
                .appendPathParam(request.getFolderKey())
                .appendPathParam("tags")
                .appendPathParam(request.getTagKey())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleResponseHeaderString(
                        "opc-request-id", DeleteFolderTagResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<DeleteGlossaryResponse> deleteGlossary(
            DeleteGlossaryRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            DeleteGlossaryRequest, DeleteGlossaryResponse>
                    handler) {

        Validate.notBlank(request.getCatalogId(), "catalogId must not be blank");

        Validate.notBlank(request.getGlossaryKey(), "glossaryKey must not be blank");

        return clientCall(request, DeleteGlossaryResponse::builder)
                .logger(LOG, "deleteGlossary")
                .serviceDetails(
                        "DataCatalog",
                        "DeleteGlossary",
                        "https://docs.oracle.com/iaas/api/#/en/data-catalog/20190325/Glossary/DeleteGlossary")
                .method(com.oracle.bmc.http.client.Method.DELETE)
                .requestBuilder(DeleteGlossaryRequest::builder)
                .basePath("/20190325")
                .appendPathParam("catalogs")
                .appendPathParam(request.getCatalogId())
                .appendPathParam("glossaries")
                .appendPathParam(request.getGlossaryKey())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleResponseHeaderString(
                        "opc-request-id", DeleteGlossaryResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<DeleteJobResponse> deleteJob(
            DeleteJobRequest request,
            final com.oracle.bmc.responses.AsyncHandler<DeleteJobRequest, DeleteJobResponse>
                    handler) {

        Validate.notBlank(request.getCatalogId(), "catalogId must not be blank");

        Validate.notBlank(request.getJobKey(), "jobKey must not be blank");

        return clientCall(request, DeleteJobResponse::builder)
                .logger(LOG, "deleteJob")
                .serviceDetails(
                        "DataCatalog",
                        "DeleteJob",
                        "https://docs.oracle.com/iaas/api/#/en/data-catalog/20190325/Job/DeleteJob")
                .method(com.oracle.bmc.http.client.Method.DELETE)
                .requestBuilder(DeleteJobRequest::builder)
                .basePath("/20190325")
                .appendPathParam("catalogs")
                .appendPathParam(request.getCatalogId())
                .appendPathParam("jobs")
                .appendPathParam(request.getJobKey())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleResponseHeaderString(
                        "opc-request-id", DeleteJobResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<DeleteJobDefinitionResponse> deleteJobDefinition(
            DeleteJobDefinitionRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            DeleteJobDefinitionRequest, DeleteJobDefinitionResponse>
                    handler) {

        Validate.notBlank(request.getCatalogId(), "catalogId must not be blank");

        Validate.notBlank(request.getJobDefinitionKey(), "jobDefinitionKey must not be blank");

        return clientCall(request, DeleteJobDefinitionResponse::builder)
                .logger(LOG, "deleteJobDefinition")
                .serviceDetails(
                        "DataCatalog",
                        "DeleteJobDefinition",
                        "https://docs.oracle.com/iaas/api/#/en/data-catalog/20190325/JobDefinition/DeleteJobDefinition")
                .method(com.oracle.bmc.http.client.Method.DELETE)
                .requestBuilder(DeleteJobDefinitionRequest::builder)
                .basePath("/20190325")
                .appendPathParam("catalogs")
                .appendPathParam(request.getCatalogId())
                .appendPathParam("jobDefinitions")
                .appendPathParam(request.getJobDefinitionKey())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleResponseHeaderString(
                        "opc-request-id", DeleteJobDefinitionResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<DeleteMetastoreResponse> deleteMetastore(
            DeleteMetastoreRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            DeleteMetastoreRequest, DeleteMetastoreResponse>
                    handler) {

        Validate.notBlank(request.getMetastoreId(), "metastoreId must not be blank");

        return clientCall(request, DeleteMetastoreResponse::builder)
                .logger(LOG, "deleteMetastore")
                .serviceDetails(
                        "DataCatalog",
                        "DeleteMetastore",
                        "https://docs.oracle.com/iaas/api/#/en/data-catalog/20190325/Metastore/DeleteMetastore")
                .method(com.oracle.bmc.http.client.Method.DELETE)
                .requestBuilder(DeleteMetastoreRequest::builder)
                .basePath("/20190325")
                .appendPathParam("metastores")
                .appendPathParam(request.getMetastoreId())
                .appendQueryParam("isLockOverride", request.getIsLockOverride())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleResponseHeaderString(
                        "opc-work-request-id", DeleteMetastoreResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", DeleteMetastoreResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<DeleteNamespaceResponse> deleteNamespace(
            DeleteNamespaceRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            DeleteNamespaceRequest, DeleteNamespaceResponse>
                    handler) {

        Validate.notBlank(request.getCatalogId(), "catalogId must not be blank");

        Validate.notBlank(request.getNamespaceId(), "namespaceId must not be blank");

        return clientCall(request, DeleteNamespaceResponse::builder)
                .logger(LOG, "deleteNamespace")
                .serviceDetails(
                        "DataCatalog",
                        "DeleteNamespace",
                        "https://docs.oracle.com/iaas/api/#/en/data-catalog/20190325/Namespace/DeleteNamespace")
                .method(com.oracle.bmc.http.client.Method.DELETE)
                .requestBuilder(DeleteNamespaceRequest::builder)
                .basePath("/20190325")
                .appendPathParam("catalogs")
                .appendPathParam(request.getCatalogId())
                .appendPathParam("namespaces")
                .appendPathParam(request.getNamespaceId())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleResponseHeaderString(
                        "opc-request-id", DeleteNamespaceResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<DeletePatternResponse> deletePattern(
            DeletePatternRequest request,
            final com.oracle.bmc.responses.AsyncHandler<DeletePatternRequest, DeletePatternResponse>
                    handler) {

        Validate.notBlank(request.getCatalogId(), "catalogId must not be blank");

        Validate.notBlank(request.getPatternKey(), "patternKey must not be blank");

        return clientCall(request, DeletePatternResponse::builder)
                .logger(LOG, "deletePattern")
                .serviceDetails(
                        "DataCatalog",
                        "DeletePattern",
                        "https://docs.oracle.com/iaas/api/#/en/data-catalog/20190325/Pattern/DeletePattern")
                .method(com.oracle.bmc.http.client.Method.DELETE)
                .requestBuilder(DeletePatternRequest::builder)
                .basePath("/20190325")
                .appendPathParam("catalogs")
                .appendPathParam(request.getCatalogId())
                .appendPathParam("patterns")
                .appendPathParam(request.getPatternKey())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleResponseHeaderString(
                        "opc-request-id", DeletePatternResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<DeleteTermResponse> deleteTerm(
            DeleteTermRequest request,
            final com.oracle.bmc.responses.AsyncHandler<DeleteTermRequest, DeleteTermResponse>
                    handler) {

        Validate.notBlank(request.getCatalogId(), "catalogId must not be blank");

        Validate.notBlank(request.getGlossaryKey(), "glossaryKey must not be blank");

        Validate.notBlank(request.getTermKey(), "termKey must not be blank");

        return clientCall(request, DeleteTermResponse::builder)
                .logger(LOG, "deleteTerm")
                .serviceDetails(
                        "DataCatalog",
                        "DeleteTerm",
                        "https://docs.oracle.com/iaas/api/#/en/data-catalog/20190325/Term/DeleteTerm")
                .method(com.oracle.bmc.http.client.Method.DELETE)
                .requestBuilder(DeleteTermRequest::builder)
                .basePath("/20190325")
                .appendPathParam("catalogs")
                .appendPathParam(request.getCatalogId())
                .appendPathParam("glossaries")
                .appendPathParam(request.getGlossaryKey())
                .appendPathParam("terms")
                .appendPathParam(request.getTermKey())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleResponseHeaderString(
                        "opc-request-id", DeleteTermResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<DeleteTermRelationshipResponse> deleteTermRelationship(
            DeleteTermRelationshipRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            DeleteTermRelationshipRequest, DeleteTermRelationshipResponse>
                    handler) {

        Validate.notBlank(request.getCatalogId(), "catalogId must not be blank");

        Validate.notBlank(request.getGlossaryKey(), "glossaryKey must not be blank");

        Validate.notBlank(request.getTermKey(), "termKey must not be blank");

        Validate.notBlank(
                request.getTermRelationshipKey(), "termRelationshipKey must not be blank");

        return clientCall(request, DeleteTermRelationshipResponse::builder)
                .logger(LOG, "deleteTermRelationship")
                .serviceDetails(
                        "DataCatalog",
                        "DeleteTermRelationship",
                        "https://docs.oracle.com/iaas/api/#/en/data-catalog/20190325/TermRelationship/DeleteTermRelationship")
                .method(com.oracle.bmc.http.client.Method.DELETE)
                .requestBuilder(DeleteTermRelationshipRequest::builder)
                .basePath("/20190325")
                .appendPathParam("catalogs")
                .appendPathParam(request.getCatalogId())
                .appendPathParam("glossaries")
                .appendPathParam(request.getGlossaryKey())
                .appendPathParam("terms")
                .appendPathParam(request.getTermKey())
                .appendPathParam("termRelationships")
                .appendPathParam(request.getTermRelationshipKey())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleResponseHeaderString(
                        "opc-request-id", DeleteTermRelationshipResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<DetachCatalogPrivateEndpointResponse>
            detachCatalogPrivateEndpoint(
                    DetachCatalogPrivateEndpointRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    DetachCatalogPrivateEndpointRequest,
                                    DetachCatalogPrivateEndpointResponse>
                            handler) {
        Objects.requireNonNull(
                request.getDetachCatalogPrivateEndpointDetails(),
                "detachCatalogPrivateEndpointDetails is required");

        Validate.notBlank(request.getCatalogId(), "catalogId must not be blank");

        return clientCall(request, DetachCatalogPrivateEndpointResponse::builder)
                .logger(LOG, "detachCatalogPrivateEndpoint")
                .serviceDetails(
                        "DataCatalog",
                        "DetachCatalogPrivateEndpoint",
                        "https://docs.oracle.com/iaas/api/#/en/data-catalog/20190325/Catalog/DetachCatalogPrivateEndpoint")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(DetachCatalogPrivateEndpointRequest::builder)
                .basePath("/20190325")
                .appendPathParam("catalogs")
                .appendPathParam(request.getCatalogId())
                .appendPathParam("actions")
                .appendPathParam("detachCatalogPrivateEndpoint")
                .appendQueryParam("isLockOverride", request.getIsLockOverride())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .hasBody()
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        DetachCatalogPrivateEndpointResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id",
                        DetachCatalogPrivateEndpointResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<DisassociateCustomPropertyResponse>
            disassociateCustomProperty(
                    DisassociateCustomPropertyRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    DisassociateCustomPropertyRequest,
                                    DisassociateCustomPropertyResponse>
                            handler) {

        Validate.notBlank(request.getCatalogId(), "catalogId must not be blank");

        Validate.notBlank(request.getTypeKey(), "typeKey must not be blank");
        Objects.requireNonNull(
                request.getDisassociateCustomPropertyDetails(),
                "disassociateCustomPropertyDetails is required");

        return clientCall(request, DisassociateCustomPropertyResponse::builder)
                .logger(LOG, "disassociateCustomProperty")
                .serviceDetails(
                        "DataCatalog",
                        "DisassociateCustomProperty",
                        "https://docs.oracle.com/iaas/api/#/en/data-catalog/20190325/Type/DisassociateCustomProperty")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(DisassociateCustomPropertyRequest::builder)
                .basePath("/20190325")
                .appendPathParam("catalogs")
                .appendPathParam(request.getCatalogId())
                .appendPathParam("types")
                .appendPathParam(request.getTypeKey())
                .appendPathParam("actions")
                .appendPathParam("disassociateCustomProperties")
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.datacatalog.model.Type.class,
                        DisassociateCustomPropertyResponse.Builder::type)
                .handleResponseHeaderString(
                        "etag", DisassociateCustomPropertyResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", DisassociateCustomPropertyResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ExpandTreeForGlossaryResponse> expandTreeForGlossary(
            ExpandTreeForGlossaryRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ExpandTreeForGlossaryRequest, ExpandTreeForGlossaryResponse>
                    handler) {

        Validate.notBlank(request.getCatalogId(), "catalogId must not be blank");

        Validate.notBlank(request.getGlossaryKey(), "glossaryKey must not be blank");

        return clientCall(request, ExpandTreeForGlossaryResponse::builder)
                .logger(LOG, "expandTreeForGlossary")
                .serviceDetails(
                        "DataCatalog",
                        "ExpandTreeForGlossary",
                        "https://docs.oracle.com/iaas/api/#/en/data-catalog/20190325/Glossary/ExpandTreeForGlossary")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(ExpandTreeForGlossaryRequest::builder)
                .basePath("/20190325")
                .appendPathParam("catalogs")
                .appendPathParam(request.getCatalogId())
                .appendPathParam("glossaries")
                .appendPathParam(request.getGlossaryKey())
                .appendPathParam("actions")
                .appendPathParam("expandTree")
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .handleBodyList(
                        com.oracle.bmc.datacatalog.model.GlossaryTreeElement.class,
                        ExpandTreeForGlossaryResponse.Builder::items)
                .handleResponseHeaderString("etag", ExpandTreeForGlossaryResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", ExpandTreeForGlossaryResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ExportGlossaryResponse> exportGlossary(
            ExportGlossaryRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ExportGlossaryRequest, ExportGlossaryResponse>
                    handler) {

        Validate.notBlank(request.getCatalogId(), "catalogId must not be blank");

        Validate.notBlank(request.getGlossaryKey(), "glossaryKey must not be blank");

        return clientCall(request, ExportGlossaryResponse::builder)
                .logger(LOG, "exportGlossary")
                .serviceDetails(
                        "DataCatalog",
                        "ExportGlossary",
                        "https://docs.oracle.com/iaas/api/#/en/data-catalog/20190325/Glossary/ExportGlossary")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(ExportGlossaryRequest::builder)
                .basePath("/20190325")
                .appendPathParam("catalogs")
                .appendPathParam(request.getCatalogId())
                .appendPathParam("glossaries")
                .appendPathParam(request.getGlossaryKey())
                .appendPathParam("actions")
                .appendPathParam("export")
                .appendQueryParam("isRelationshipExported", request.getIsRelationshipExported())
                .accept(
                        "application/json, text/csv, application/vnd.openxmlformats-officedocument.spreadsheetml.sheet")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .handleBody(String.class, ExportGlossaryResponse.Builder::value)
                .handleResponseHeaderString("etag", ExportGlossaryResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", ExportGlossaryResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<FetchEntityLineageResponse> fetchEntityLineage(
            FetchEntityLineageRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            FetchEntityLineageRequest, FetchEntityLineageResponse>
                    handler) {

        Validate.notBlank(request.getCatalogId(), "catalogId must not be blank");

        Validate.notBlank(request.getDataAssetKey(), "dataAssetKey must not be blank");

        Validate.notBlank(request.getEntityKey(), "entityKey must not be blank");
        Objects.requireNonNull(
                request.getFetchEntityLineageDetails(), "fetchEntityLineageDetails is required");

        return clientCall(request, FetchEntityLineageResponse::builder)
                .logger(LOG, "fetchEntityLineage")
                .serviceDetails(
                        "DataCatalog",
                        "FetchEntityLineage",
                        "https://docs.oracle.com/iaas/api/#/en/data-catalog/20190325/Entity/FetchEntityLineage")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(FetchEntityLineageRequest::builder)
                .basePath("/20190325")
                .appendPathParam("catalogs")
                .appendPathParam(request.getCatalogId())
                .appendPathParam("dataAssets")
                .appendPathParam(request.getDataAssetKey())
                .appendPathParam("entities")
                .appendPathParam(request.getEntityKey())
                .appendPathParam("actions")
                .appendPathParam("fetchLineage")
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("if-match", request.getIfMatch())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.datacatalog.model.EntityLineage.class,
                        FetchEntityLineageResponse.Builder::entityLineage)
                .handleResponseHeaderString(
                        "opc-request-id", FetchEntityLineageResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", FetchEntityLineageResponse.Builder::opcNextPage)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<GetAttributeResponse> getAttribute(
            GetAttributeRequest request,
            final com.oracle.bmc.responses.AsyncHandler<GetAttributeRequest, GetAttributeResponse>
                    handler) {

        Validate.notBlank(request.getCatalogId(), "catalogId must not be blank");

        Validate.notBlank(request.getDataAssetKey(), "dataAssetKey must not be blank");

        Validate.notBlank(request.getEntityKey(), "entityKey must not be blank");

        Validate.notBlank(request.getAttributeKey(), "attributeKey must not be blank");

        return clientCall(request, GetAttributeResponse::builder)
                .logger(LOG, "getAttribute")
                .serviceDetails(
                        "DataCatalog",
                        "GetAttribute",
                        "https://docs.oracle.com/iaas/api/#/en/data-catalog/20190325/Attribute/GetAttribute")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetAttributeRequest::builder)
                .basePath("/20190325")
                .appendPathParam("catalogs")
                .appendPathParam(request.getCatalogId())
                .appendPathParam("dataAssets")
                .appendPathParam(request.getDataAssetKey())
                .appendPathParam("entities")
                .appendPathParam(request.getEntityKey())
                .appendPathParam("attributes")
                .appendPathParam(request.getAttributeKey())
                .appendQueryParam(
                        "isIncludeObjectRelationships", request.getIsIncludeObjectRelationships())
                .appendListQueryParam(
                        "fields",
                        request.getFields(),
                        com.oracle.bmc.util.internal.CollectionFormatType.Multi)
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.datacatalog.model.Attribute.class,
                        GetAttributeResponse.Builder::attribute)
                .handleResponseHeaderString("etag", GetAttributeResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", GetAttributeResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<GetAttributeTagResponse> getAttributeTag(
            GetAttributeTagRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            GetAttributeTagRequest, GetAttributeTagResponse>
                    handler) {

        Validate.notBlank(request.getCatalogId(), "catalogId must not be blank");

        Validate.notBlank(request.getDataAssetKey(), "dataAssetKey must not be blank");

        Validate.notBlank(request.getEntityKey(), "entityKey must not be blank");

        Validate.notBlank(request.getAttributeKey(), "attributeKey must not be blank");

        Validate.notBlank(request.getTagKey(), "tagKey must not be blank");

        return clientCall(request, GetAttributeTagResponse::builder)
                .logger(LOG, "getAttributeTag")
                .serviceDetails(
                        "DataCatalog",
                        "GetAttributeTag",
                        "https://docs.oracle.com/iaas/api/#/en/data-catalog/20190325/AttributeTag/GetAttributeTag")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetAttributeTagRequest::builder)
                .basePath("/20190325")
                .appendPathParam("catalogs")
                .appendPathParam(request.getCatalogId())
                .appendPathParam("dataAssets")
                .appendPathParam(request.getDataAssetKey())
                .appendPathParam("entities")
                .appendPathParam(request.getEntityKey())
                .appendPathParam("attributes")
                .appendPathParam(request.getAttributeKey())
                .appendPathParam("tags")
                .appendPathParam(request.getTagKey())
                .appendListQueryParam(
                        "fields",
                        request.getFields(),
                        com.oracle.bmc.util.internal.CollectionFormatType.Multi)
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.datacatalog.model.AttributeTag.class,
                        GetAttributeTagResponse.Builder::attributeTag)
                .handleResponseHeaderString("etag", GetAttributeTagResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", GetAttributeTagResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<GetCatalogResponse> getCatalog(
            GetCatalogRequest request,
            final com.oracle.bmc.responses.AsyncHandler<GetCatalogRequest, GetCatalogResponse>
                    handler) {

        Validate.notBlank(request.getCatalogId(), "catalogId must not be blank");

        return clientCall(request, GetCatalogResponse::builder)
                .logger(LOG, "getCatalog")
                .serviceDetails(
                        "DataCatalog",
                        "GetCatalog",
                        "https://docs.oracle.com/iaas/api/#/en/data-catalog/20190325/Catalog/GetCatalog")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetCatalogRequest::builder)
                .basePath("/20190325")
                .appendPathParam("catalogs")
                .appendPathParam(request.getCatalogId())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.datacatalog.model.Catalog.class,
                        GetCatalogResponse.Builder::catalog)
                .handleResponseHeaderString("etag", GetCatalogResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", GetCatalogResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<GetCatalogPrivateEndpointResponse> getCatalogPrivateEndpoint(
            GetCatalogPrivateEndpointRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            GetCatalogPrivateEndpointRequest, GetCatalogPrivateEndpointResponse>
                    handler) {

        Validate.notBlank(
                request.getCatalogPrivateEndpointId(),
                "catalogPrivateEndpointId must not be blank");

        return clientCall(request, GetCatalogPrivateEndpointResponse::builder)
                .logger(LOG, "getCatalogPrivateEndpoint")
                .serviceDetails(
                        "DataCatalog",
                        "GetCatalogPrivateEndpoint",
                        "https://docs.oracle.com/iaas/api/#/en/data-catalog/20190325/CatalogPrivateEndpoint/GetCatalogPrivateEndpoint")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetCatalogPrivateEndpointRequest::builder)
                .basePath("/20190325")
                .appendPathParam("catalogPrivateEndpoints")
                .appendPathParam(request.getCatalogPrivateEndpointId())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.datacatalog.model.CatalogPrivateEndpoint.class,
                        GetCatalogPrivateEndpointResponse.Builder::catalogPrivateEndpoint)
                .handleResponseHeaderString(
                        "opc-request-id", GetCatalogPrivateEndpointResponse.Builder::opcRequestId)
                .handleResponseHeaderString("etag", GetCatalogPrivateEndpointResponse.Builder::etag)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<GetConnectionResponse> getConnection(
            GetConnectionRequest request,
            final com.oracle.bmc.responses.AsyncHandler<GetConnectionRequest, GetConnectionResponse>
                    handler) {

        Validate.notBlank(request.getCatalogId(), "catalogId must not be blank");

        Validate.notBlank(request.getDataAssetKey(), "dataAssetKey must not be blank");

        Validate.notBlank(request.getConnectionKey(), "connectionKey must not be blank");

        return clientCall(request, GetConnectionResponse::builder)
                .logger(LOG, "getConnection")
                .serviceDetails(
                        "DataCatalog",
                        "GetConnection",
                        "https://docs.oracle.com/iaas/api/#/en/data-catalog/20190325/Connection/GetConnection")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetConnectionRequest::builder)
                .basePath("/20190325")
                .appendPathParam("catalogs")
                .appendPathParam(request.getCatalogId())
                .appendPathParam("dataAssets")
                .appendPathParam(request.getDataAssetKey())
                .appendPathParam("connections")
                .appendPathParam(request.getConnectionKey())
                .appendListQueryParam(
                        "fields",
                        request.getFields(),
                        com.oracle.bmc.util.internal.CollectionFormatType.Multi)
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.datacatalog.model.Connection.class,
                        GetConnectionResponse.Builder::connection)
                .handleResponseHeaderString("etag", GetConnectionResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", GetConnectionResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<GetCustomPropertyResponse> getCustomProperty(
            GetCustomPropertyRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            GetCustomPropertyRequest, GetCustomPropertyResponse>
                    handler) {

        Validate.notBlank(request.getCatalogId(), "catalogId must not be blank");

        Validate.notBlank(request.getNamespaceId(), "namespaceId must not be blank");

        Validate.notBlank(request.getCustomPropertyKey(), "customPropertyKey must not be blank");

        return clientCall(request, GetCustomPropertyResponse::builder)
                .logger(LOG, "getCustomProperty")
                .serviceDetails(
                        "DataCatalog",
                        "GetCustomProperty",
                        "https://docs.oracle.com/iaas/api/#/en/data-catalog/20190325/CustomProperty/GetCustomProperty")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetCustomPropertyRequest::builder)
                .basePath("/20190325")
                .appendPathParam("catalogs")
                .appendPathParam(request.getCatalogId())
                .appendPathParam("namespaces")
                .appendPathParam(request.getNamespaceId())
                .appendPathParam("customProperties")
                .appendPathParam(request.getCustomPropertyKey())
                .appendListQueryParam(
                        "fields",
                        request.getFields(),
                        com.oracle.bmc.util.internal.CollectionFormatType.Multi)
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.datacatalog.model.CustomProperty.class,
                        GetCustomPropertyResponse.Builder::customProperty)
                .handleResponseHeaderString("etag", GetCustomPropertyResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", GetCustomPropertyResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<GetDataAssetResponse> getDataAsset(
            GetDataAssetRequest request,
            final com.oracle.bmc.responses.AsyncHandler<GetDataAssetRequest, GetDataAssetResponse>
                    handler) {

        Validate.notBlank(request.getCatalogId(), "catalogId must not be blank");

        Validate.notBlank(request.getDataAssetKey(), "dataAssetKey must not be blank");

        return clientCall(request, GetDataAssetResponse::builder)
                .logger(LOG, "getDataAsset")
                .serviceDetails(
                        "DataCatalog",
                        "GetDataAsset",
                        "https://docs.oracle.com/iaas/api/#/en/data-catalog/20190325/DataAsset/GetDataAsset")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetDataAssetRequest::builder)
                .basePath("/20190325")
                .appendPathParam("catalogs")
                .appendPathParam(request.getCatalogId())
                .appendPathParam("dataAssets")
                .appendPathParam(request.getDataAssetKey())
                .appendListQueryParam(
                        "fields",
                        request.getFields(),
                        com.oracle.bmc.util.internal.CollectionFormatType.Multi)
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.datacatalog.model.DataAsset.class,
                        GetDataAssetResponse.Builder::dataAsset)
                .handleResponseHeaderString("etag", GetDataAssetResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", GetDataAssetResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<GetDataAssetTagResponse> getDataAssetTag(
            GetDataAssetTagRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            GetDataAssetTagRequest, GetDataAssetTagResponse>
                    handler) {

        Validate.notBlank(request.getCatalogId(), "catalogId must not be blank");

        Validate.notBlank(request.getDataAssetKey(), "dataAssetKey must not be blank");

        Validate.notBlank(request.getTagKey(), "tagKey must not be blank");

        return clientCall(request, GetDataAssetTagResponse::builder)
                .logger(LOG, "getDataAssetTag")
                .serviceDetails(
                        "DataCatalog",
                        "GetDataAssetTag",
                        "https://docs.oracle.com/iaas/api/#/en/data-catalog/20190325/DataAssetTag/GetDataAssetTag")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetDataAssetTagRequest::builder)
                .basePath("/20190325")
                .appendPathParam("catalogs")
                .appendPathParam(request.getCatalogId())
                .appendPathParam("dataAssets")
                .appendPathParam(request.getDataAssetKey())
                .appendPathParam("tags")
                .appendPathParam(request.getTagKey())
                .appendListQueryParam(
                        "fields",
                        request.getFields(),
                        com.oracle.bmc.util.internal.CollectionFormatType.Multi)
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.datacatalog.model.DataAssetTag.class,
                        GetDataAssetTagResponse.Builder::dataAssetTag)
                .handleResponseHeaderString("etag", GetDataAssetTagResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", GetDataAssetTagResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<GetEntityResponse> getEntity(
            GetEntityRequest request,
            final com.oracle.bmc.responses.AsyncHandler<GetEntityRequest, GetEntityResponse>
                    handler) {

        Validate.notBlank(request.getCatalogId(), "catalogId must not be blank");

        Validate.notBlank(request.getDataAssetKey(), "dataAssetKey must not be blank");

        Validate.notBlank(request.getEntityKey(), "entityKey must not be blank");

        return clientCall(request, GetEntityResponse::builder)
                .logger(LOG, "getEntity")
                .serviceDetails(
                        "DataCatalog",
                        "GetEntity",
                        "https://docs.oracle.com/iaas/api/#/en/data-catalog/20190325/Entity/GetEntity")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetEntityRequest::builder)
                .basePath("/20190325")
                .appendPathParam("catalogs")
                .appendPathParam(request.getCatalogId())
                .appendPathParam("dataAssets")
                .appendPathParam(request.getDataAssetKey())
                .appendPathParam("entities")
                .appendPathParam(request.getEntityKey())
                .appendQueryParam(
                        "isIncludeObjectRelationships", request.getIsIncludeObjectRelationships())
                .appendListQueryParam(
                        "fields",
                        request.getFields(),
                        com.oracle.bmc.util.internal.CollectionFormatType.Multi)
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.datacatalog.model.Entity.class,
                        GetEntityResponse.Builder::entity)
                .handleResponseHeaderString("etag", GetEntityResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", GetEntityResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<GetEntityTagResponse> getEntityTag(
            GetEntityTagRequest request,
            final com.oracle.bmc.responses.AsyncHandler<GetEntityTagRequest, GetEntityTagResponse>
                    handler) {

        Validate.notBlank(request.getCatalogId(), "catalogId must not be blank");

        Validate.notBlank(request.getDataAssetKey(), "dataAssetKey must not be blank");

        Validate.notBlank(request.getEntityKey(), "entityKey must not be blank");

        Validate.notBlank(request.getTagKey(), "tagKey must not be blank");

        return clientCall(request, GetEntityTagResponse::builder)
                .logger(LOG, "getEntityTag")
                .serviceDetails(
                        "DataCatalog",
                        "GetEntityTag",
                        "https://docs.oracle.com/iaas/api/#/en/data-catalog/20190325/EntityTag/GetEntityTag")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetEntityTagRequest::builder)
                .basePath("/20190325")
                .appendPathParam("catalogs")
                .appendPathParam(request.getCatalogId())
                .appendPathParam("dataAssets")
                .appendPathParam(request.getDataAssetKey())
                .appendPathParam("entities")
                .appendPathParam(request.getEntityKey())
                .appendPathParam("tags")
                .appendPathParam(request.getTagKey())
                .appendListQueryParam(
                        "fields",
                        request.getFields(),
                        com.oracle.bmc.util.internal.CollectionFormatType.Multi)
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.datacatalog.model.EntityTag.class,
                        GetEntityTagResponse.Builder::entityTag)
                .handleResponseHeaderString("etag", GetEntityTagResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", GetEntityTagResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<GetFolderResponse> getFolder(
            GetFolderRequest request,
            final com.oracle.bmc.responses.AsyncHandler<GetFolderRequest, GetFolderResponse>
                    handler) {

        Validate.notBlank(request.getCatalogId(), "catalogId must not be blank");

        Validate.notBlank(request.getDataAssetKey(), "dataAssetKey must not be blank");

        Validate.notBlank(request.getFolderKey(), "folderKey must not be blank");

        return clientCall(request, GetFolderResponse::builder)
                .logger(LOG, "getFolder")
                .serviceDetails(
                        "DataCatalog",
                        "GetFolder",
                        "https://docs.oracle.com/iaas/api/#/en/data-catalog/20190325/Folder/GetFolder")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetFolderRequest::builder)
                .basePath("/20190325")
                .appendPathParam("catalogs")
                .appendPathParam(request.getCatalogId())
                .appendPathParam("dataAssets")
                .appendPathParam(request.getDataAssetKey())
                .appendPathParam("folders")
                .appendPathParam(request.getFolderKey())
                .appendQueryParam(
                        "isIncludeObjectRelationships", request.getIsIncludeObjectRelationships())
                .appendListQueryParam(
                        "fields",
                        request.getFields(),
                        com.oracle.bmc.util.internal.CollectionFormatType.Multi)
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.datacatalog.model.Folder.class,
                        GetFolderResponse.Builder::folder)
                .handleResponseHeaderString("etag", GetFolderResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", GetFolderResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<GetFolderTagResponse> getFolderTag(
            GetFolderTagRequest request,
            final com.oracle.bmc.responses.AsyncHandler<GetFolderTagRequest, GetFolderTagResponse>
                    handler) {

        Validate.notBlank(request.getCatalogId(), "catalogId must not be blank");

        Validate.notBlank(request.getDataAssetKey(), "dataAssetKey must not be blank");

        Validate.notBlank(request.getFolderKey(), "folderKey must not be blank");

        Validate.notBlank(request.getTagKey(), "tagKey must not be blank");

        return clientCall(request, GetFolderTagResponse::builder)
                .logger(LOG, "getFolderTag")
                .serviceDetails(
                        "DataCatalog",
                        "GetFolderTag",
                        "https://docs.oracle.com/iaas/api/#/en/data-catalog/20190325/FolderTag/GetFolderTag")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetFolderTagRequest::builder)
                .basePath("/20190325")
                .appendPathParam("catalogs")
                .appendPathParam(request.getCatalogId())
                .appendPathParam("dataAssets")
                .appendPathParam(request.getDataAssetKey())
                .appendPathParam("folders")
                .appendPathParam(request.getFolderKey())
                .appendPathParam("tags")
                .appendPathParam(request.getTagKey())
                .appendListQueryParam(
                        "fields",
                        request.getFields(),
                        com.oracle.bmc.util.internal.CollectionFormatType.Multi)
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.datacatalog.model.FolderTag.class,
                        GetFolderTagResponse.Builder::folderTag)
                .handleResponseHeaderString("etag", GetFolderTagResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", GetFolderTagResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<GetGlossaryResponse> getGlossary(
            GetGlossaryRequest request,
            final com.oracle.bmc.responses.AsyncHandler<GetGlossaryRequest, GetGlossaryResponse>
                    handler) {

        Validate.notBlank(request.getCatalogId(), "catalogId must not be blank");

        Validate.notBlank(request.getGlossaryKey(), "glossaryKey must not be blank");

        return clientCall(request, GetGlossaryResponse::builder)
                .logger(LOG, "getGlossary")
                .serviceDetails(
                        "DataCatalog",
                        "GetGlossary",
                        "https://docs.oracle.com/iaas/api/#/en/data-catalog/20190325/Glossary/GetGlossary")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetGlossaryRequest::builder)
                .basePath("/20190325")
                .appendPathParam("catalogs")
                .appendPathParam(request.getCatalogId())
                .appendPathParam("glossaries")
                .appendPathParam(request.getGlossaryKey())
                .appendListQueryParam(
                        "fields",
                        request.getFields(),
                        com.oracle.bmc.util.internal.CollectionFormatType.Multi)
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.datacatalog.model.Glossary.class,
                        GetGlossaryResponse.Builder::glossary)
                .handleResponseHeaderString("etag", GetGlossaryResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", GetGlossaryResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<GetJobResponse> getJob(
            GetJobRequest request,
            final com.oracle.bmc.responses.AsyncHandler<GetJobRequest, GetJobResponse> handler) {

        Validate.notBlank(request.getCatalogId(), "catalogId must not be blank");

        Validate.notBlank(request.getJobKey(), "jobKey must not be blank");

        return clientCall(request, GetJobResponse::builder)
                .logger(LOG, "getJob")
                .serviceDetails(
                        "DataCatalog",
                        "GetJob",
                        "https://docs.oracle.com/iaas/api/#/en/data-catalog/20190325/Job/GetJob")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetJobRequest::builder)
                .basePath("/20190325")
                .appendPathParam("catalogs")
                .appendPathParam(request.getCatalogId())
                .appendPathParam("jobs")
                .appendPathParam(request.getJobKey())
                .appendListQueryParam(
                        "fields",
                        request.getFields(),
                        com.oracle.bmc.util.internal.CollectionFormatType.Multi)
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(com.oracle.bmc.datacatalog.model.Job.class, GetJobResponse.Builder::job)
                .handleResponseHeaderString("etag", GetJobResponse.Builder::etag)
                .handleResponseHeaderString("opc-request-id", GetJobResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<GetJobDefinitionResponse> getJobDefinition(
            GetJobDefinitionRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            GetJobDefinitionRequest, GetJobDefinitionResponse>
                    handler) {

        Validate.notBlank(request.getCatalogId(), "catalogId must not be blank");

        Validate.notBlank(request.getJobDefinitionKey(), "jobDefinitionKey must not be blank");

        return clientCall(request, GetJobDefinitionResponse::builder)
                .logger(LOG, "getJobDefinition")
                .serviceDetails(
                        "DataCatalog",
                        "GetJobDefinition",
                        "https://docs.oracle.com/iaas/api/#/en/data-catalog/20190325/JobDefinition/GetJobDefinition")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetJobDefinitionRequest::builder)
                .basePath("/20190325")
                .appendPathParam("catalogs")
                .appendPathParam(request.getCatalogId())
                .appendPathParam("jobDefinitions")
                .appendPathParam(request.getJobDefinitionKey())
                .appendListQueryParam(
                        "fields",
                        request.getFields(),
                        com.oracle.bmc.util.internal.CollectionFormatType.Multi)
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.datacatalog.model.JobDefinition.class,
                        GetJobDefinitionResponse.Builder::jobDefinition)
                .handleResponseHeaderString("etag", GetJobDefinitionResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", GetJobDefinitionResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<GetJobExecutionResponse> getJobExecution(
            GetJobExecutionRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            GetJobExecutionRequest, GetJobExecutionResponse>
                    handler) {

        Validate.notBlank(request.getCatalogId(), "catalogId must not be blank");

        Validate.notBlank(request.getJobKey(), "jobKey must not be blank");

        Validate.notBlank(request.getJobExecutionKey(), "jobExecutionKey must not be blank");

        return clientCall(request, GetJobExecutionResponse::builder)
                .logger(LOG, "getJobExecution")
                .serviceDetails(
                        "DataCatalog",
                        "GetJobExecution",
                        "https://docs.oracle.com/iaas/api/#/en/data-catalog/20190325/JobExecution/GetJobExecution")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetJobExecutionRequest::builder)
                .basePath("/20190325")
                .appendPathParam("catalogs")
                .appendPathParam(request.getCatalogId())
                .appendPathParam("jobs")
                .appendPathParam(request.getJobKey())
                .appendPathParam("executions")
                .appendPathParam(request.getJobExecutionKey())
                .appendListQueryParam(
                        "fields",
                        request.getFields(),
                        com.oracle.bmc.util.internal.CollectionFormatType.Multi)
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.datacatalog.model.JobExecution.class,
                        GetJobExecutionResponse.Builder::jobExecution)
                .handleResponseHeaderString("etag", GetJobExecutionResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", GetJobExecutionResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<GetJobLogResponse> getJobLog(
            GetJobLogRequest request,
            final com.oracle.bmc.responses.AsyncHandler<GetJobLogRequest, GetJobLogResponse>
                    handler) {

        Validate.notBlank(request.getCatalogId(), "catalogId must not be blank");

        Validate.notBlank(request.getJobKey(), "jobKey must not be blank");

        Validate.notBlank(request.getJobExecutionKey(), "jobExecutionKey must not be blank");

        Validate.notBlank(request.getJobLogKey(), "jobLogKey must not be blank");

        return clientCall(request, GetJobLogResponse::builder)
                .logger(LOG, "getJobLog")
                .serviceDetails(
                        "DataCatalog",
                        "GetJobLog",
                        "https://docs.oracle.com/iaas/api/#/en/data-catalog/20190325/JobLog/GetJobLog")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetJobLogRequest::builder)
                .basePath("/20190325")
                .appendPathParam("catalogs")
                .appendPathParam(request.getCatalogId())
                .appendPathParam("jobs")
                .appendPathParam(request.getJobKey())
                .appendPathParam("executions")
                .appendPathParam(request.getJobExecutionKey())
                .appendPathParam("logs")
                .appendPathParam(request.getJobLogKey())
                .appendListQueryParam(
                        "fields",
                        request.getFields(),
                        com.oracle.bmc.util.internal.CollectionFormatType.Multi)
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.datacatalog.model.JobLog.class,
                        GetJobLogResponse.Builder::jobLog)
                .handleResponseHeaderString("etag", GetJobLogResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", GetJobLogResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<GetJobMetricsResponse> getJobMetrics(
            GetJobMetricsRequest request,
            final com.oracle.bmc.responses.AsyncHandler<GetJobMetricsRequest, GetJobMetricsResponse>
                    handler) {

        Validate.notBlank(request.getCatalogId(), "catalogId must not be blank");

        Validate.notBlank(request.getJobKey(), "jobKey must not be blank");

        Validate.notBlank(request.getJobExecutionKey(), "jobExecutionKey must not be blank");

        Validate.notBlank(request.getJobMetricsKey(), "jobMetricsKey must not be blank");

        return clientCall(request, GetJobMetricsResponse::builder)
                .logger(LOG, "getJobMetrics")
                .serviceDetails(
                        "DataCatalog",
                        "GetJobMetrics",
                        "https://docs.oracle.com/iaas/api/#/en/data-catalog/20190325/JobMetric/GetJobMetrics")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetJobMetricsRequest::builder)
                .basePath("/20190325")
                .appendPathParam("catalogs")
                .appendPathParam(request.getCatalogId())
                .appendPathParam("jobs")
                .appendPathParam(request.getJobKey())
                .appendPathParam("executions")
                .appendPathParam(request.getJobExecutionKey())
                .appendPathParam("metrics")
                .appendPathParam(request.getJobMetricsKey())
                .appendListQueryParam(
                        "fields",
                        request.getFields(),
                        com.oracle.bmc.util.internal.CollectionFormatType.Multi)
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.datacatalog.model.JobMetric.class,
                        GetJobMetricsResponse.Builder::jobMetric)
                .handleResponseHeaderString("etag", GetJobMetricsResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", GetJobMetricsResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<GetMetastoreResponse> getMetastore(
            GetMetastoreRequest request,
            final com.oracle.bmc.responses.AsyncHandler<GetMetastoreRequest, GetMetastoreResponse>
                    handler) {

        Validate.notBlank(request.getMetastoreId(), "metastoreId must not be blank");

        return clientCall(request, GetMetastoreResponse::builder)
                .logger(LOG, "getMetastore")
                .serviceDetails(
                        "DataCatalog",
                        "GetMetastore",
                        "https://docs.oracle.com/iaas/api/#/en/data-catalog/20190325/Metastore/GetMetastore")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetMetastoreRequest::builder)
                .basePath("/20190325")
                .appendPathParam("metastores")
                .appendPathParam(request.getMetastoreId())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.datacatalog.model.Metastore.class,
                        GetMetastoreResponse.Builder::metastore)
                .handleResponseHeaderString("etag", GetMetastoreResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", GetMetastoreResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<GetNamespaceResponse> getNamespace(
            GetNamespaceRequest request,
            final com.oracle.bmc.responses.AsyncHandler<GetNamespaceRequest, GetNamespaceResponse>
                    handler) {

        Validate.notBlank(request.getCatalogId(), "catalogId must not be blank");

        Validate.notBlank(request.getNamespaceId(), "namespaceId must not be blank");

        return clientCall(request, GetNamespaceResponse::builder)
                .logger(LOG, "getNamespace")
                .serviceDetails(
                        "DataCatalog",
                        "GetNamespace",
                        "https://docs.oracle.com/iaas/api/#/en/data-catalog/20190325/Namespace/GetNamespace")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetNamespaceRequest::builder)
                .basePath("/20190325")
                .appendPathParam("catalogs")
                .appendPathParam(request.getCatalogId())
                .appendPathParam("namespaces")
                .appendPathParam(request.getNamespaceId())
                .appendListQueryParam(
                        "fields",
                        request.getFields(),
                        com.oracle.bmc.util.internal.CollectionFormatType.Multi)
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.datacatalog.model.Namespace.class,
                        GetNamespaceResponse.Builder::namespace)
                .handleResponseHeaderString("etag", GetNamespaceResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", GetNamespaceResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<GetPatternResponse> getPattern(
            GetPatternRequest request,
            final com.oracle.bmc.responses.AsyncHandler<GetPatternRequest, GetPatternResponse>
                    handler) {

        Validate.notBlank(request.getCatalogId(), "catalogId must not be blank");

        Validate.notBlank(request.getPatternKey(), "patternKey must not be blank");

        return clientCall(request, GetPatternResponse::builder)
                .logger(LOG, "getPattern")
                .serviceDetails(
                        "DataCatalog",
                        "GetPattern",
                        "https://docs.oracle.com/iaas/api/#/en/data-catalog/20190325/Pattern/GetPattern")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetPatternRequest::builder)
                .basePath("/20190325")
                .appendPathParam("catalogs")
                .appendPathParam(request.getCatalogId())
                .appendPathParam("patterns")
                .appendPathParam(request.getPatternKey())
                .appendListQueryParam(
                        "fields",
                        request.getFields(),
                        com.oracle.bmc.util.internal.CollectionFormatType.Multi)
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.datacatalog.model.Pattern.class,
                        GetPatternResponse.Builder::pattern)
                .handleResponseHeaderString("etag", GetPatternResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", GetPatternResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<GetTermResponse> getTerm(
            GetTermRequest request,
            final com.oracle.bmc.responses.AsyncHandler<GetTermRequest, GetTermResponse> handler) {

        Validate.notBlank(request.getCatalogId(), "catalogId must not be blank");

        Validate.notBlank(request.getGlossaryKey(), "glossaryKey must not be blank");

        Validate.notBlank(request.getTermKey(), "termKey must not be blank");

        return clientCall(request, GetTermResponse::builder)
                .logger(LOG, "getTerm")
                .serviceDetails(
                        "DataCatalog",
                        "GetTerm",
                        "https://docs.oracle.com/iaas/api/#/en/data-catalog/20190325/Term/GetTerm")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetTermRequest::builder)
                .basePath("/20190325")
                .appendPathParam("catalogs")
                .appendPathParam(request.getCatalogId())
                .appendPathParam("glossaries")
                .appendPathParam(request.getGlossaryKey())
                .appendPathParam("terms")
                .appendPathParam(request.getTermKey())
                .appendListQueryParam(
                        "fields",
                        request.getFields(),
                        com.oracle.bmc.util.internal.CollectionFormatType.Multi)
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.datacatalog.model.Term.class, GetTermResponse.Builder::term)
                .handleResponseHeaderString("etag", GetTermResponse.Builder::etag)
                .handleResponseHeaderString("opc-request-id", GetTermResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<GetTermRelationshipResponse> getTermRelationship(
            GetTermRelationshipRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            GetTermRelationshipRequest, GetTermRelationshipResponse>
                    handler) {

        Validate.notBlank(request.getCatalogId(), "catalogId must not be blank");

        Validate.notBlank(request.getGlossaryKey(), "glossaryKey must not be blank");

        Validate.notBlank(request.getTermKey(), "termKey must not be blank");

        Validate.notBlank(
                request.getTermRelationshipKey(), "termRelationshipKey must not be blank");

        return clientCall(request, GetTermRelationshipResponse::builder)
                .logger(LOG, "getTermRelationship")
                .serviceDetails(
                        "DataCatalog",
                        "GetTermRelationship",
                        "https://docs.oracle.com/iaas/api/#/en/data-catalog/20190325/TermRelationship/GetTermRelationship")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetTermRelationshipRequest::builder)
                .basePath("/20190325")
                .appendPathParam("catalogs")
                .appendPathParam(request.getCatalogId())
                .appendPathParam("glossaries")
                .appendPathParam(request.getGlossaryKey())
                .appendPathParam("terms")
                .appendPathParam(request.getTermKey())
                .appendPathParam("termRelationships")
                .appendPathParam(request.getTermRelationshipKey())
                .appendListQueryParam(
                        "fields",
                        request.getFields(),
                        com.oracle.bmc.util.internal.CollectionFormatType.Multi)
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.datacatalog.model.TermRelationship.class,
                        GetTermRelationshipResponse.Builder::termRelationship)
                .handleResponseHeaderString("etag", GetTermRelationshipResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", GetTermRelationshipResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<GetTypeResponse> getType(
            GetTypeRequest request,
            final com.oracle.bmc.responses.AsyncHandler<GetTypeRequest, GetTypeResponse> handler) {

        Validate.notBlank(request.getCatalogId(), "catalogId must not be blank");

        Validate.notBlank(request.getTypeKey(), "typeKey must not be blank");

        return clientCall(request, GetTypeResponse::builder)
                .logger(LOG, "getType")
                .serviceDetails(
                        "DataCatalog",
                        "GetType",
                        "https://docs.oracle.com/iaas/api/#/en/data-catalog/20190325/Type/GetType")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetTypeRequest::builder)
                .basePath("/20190325")
                .appendPathParam("catalogs")
                .appendPathParam(request.getCatalogId())
                .appendPathParam("types")
                .appendPathParam(request.getTypeKey())
                .appendListQueryParam(
                        "fields",
                        request.getFields(),
                        com.oracle.bmc.util.internal.CollectionFormatType.Multi)
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.datacatalog.model.Type.class, GetTypeResponse.Builder::type)
                .handleResponseHeaderString("etag", GetTypeResponse.Builder::etag)
                .handleResponseHeaderString("opc-request-id", GetTypeResponse.Builder::opcRequestId)
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
                        "DataCatalog",
                        "GetWorkRequest",
                        "https://docs.oracle.com/iaas/api/#/en/data-catalog/20190325/WorkRequest/GetWorkRequest")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetWorkRequestRequest::builder)
                .basePath("/20190325")
                .appendPathParam("workRequests")
                .appendPathParam(request.getWorkRequestId())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.datacatalog.model.WorkRequest.class,
                        GetWorkRequestResponse.Builder::workRequest)
                .handleResponseHeaderString("etag", GetWorkRequestResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", GetWorkRequestResponse.Builder::opcRequestId)
                .handleResponseHeaderInteger(
                        "retry-after", GetWorkRequestResponse.Builder::retryAfter)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ImportConnectionResponse> importConnection(
            ImportConnectionRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ImportConnectionRequest, ImportConnectionResponse>
                    handler) {

        Validate.notBlank(request.getCatalogId(), "catalogId must not be blank");

        Validate.notBlank(request.getDataAssetKey(), "dataAssetKey must not be blank");
        Objects.requireNonNull(
                request.getImportConnectionDetails(), "importConnectionDetails is required");

        return clientCall(request, ImportConnectionResponse::builder)
                .logger(LOG, "importConnection")
                .serviceDetails(
                        "DataCatalog",
                        "ImportConnection",
                        "https://docs.oracle.com/iaas/api/#/en/data-catalog/20190325/DataAsset/ImportConnection")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(ImportConnectionRequest::builder)
                .basePath("/20190325")
                .appendPathParam("catalogs")
                .appendPathParam(request.getCatalogId())
                .appendPathParam("dataAssets")
                .appendPathParam(request.getDataAssetKey())
                .appendPathParam("actions")
                .appendPathParam("importConnection")
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.datacatalog.model.Connection.class,
                        ImportConnectionResponse.Builder::connection)
                .handleResponseHeaderString("etag", ImportConnectionResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", ImportConnectionResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ImportDataAssetResponse> importDataAsset(
            ImportDataAssetRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ImportDataAssetRequest, ImportDataAssetResponse>
                    handler) {

        Validate.notBlank(request.getCatalogId(), "catalogId must not be blank");

        Validate.notBlank(request.getDataAssetKey(), "dataAssetKey must not be blank");
        Objects.requireNonNull(
                request.getImportDataAssetDetails(), "importDataAssetDetails is required");

        Objects.requireNonNull(request.getImportType(), "importType is required");

        return clientCall(request, ImportDataAssetResponse::builder)
                .logger(LOG, "importDataAsset")
                .serviceDetails(
                        "DataCatalog",
                        "ImportDataAsset",
                        "https://docs.oracle.com/iaas/api/#/en/data-catalog/20190325/DataAsset/ImportDataAsset")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(ImportDataAssetRequest::builder)
                .basePath("/20190325")
                .appendPathParam("catalogs")
                .appendPathParam(request.getCatalogId())
                .appendPathParam("dataAssets")
                .appendPathParam(request.getDataAssetKey())
                .appendPathParam("actions")
                .appendPathParam("import")
                .appendListQueryParam(
                        "importType",
                        request.getImportType(),
                        com.oracle.bmc.util.internal.CollectionFormatType.Multi)
                .appendQueryParam("isMissingValueIgnored", request.getIsMissingValueIgnored())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.datacatalog.model.ImportDataAssetJobResult.class,
                        ImportDataAssetResponse.Builder::importDataAssetJobResult)
                .handleResponseHeaderString(
                        "opc-request-id", ImportDataAssetResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ImportGlossaryResponse> importGlossary(
            ImportGlossaryRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ImportGlossaryRequest, ImportGlossaryResponse>
                    handler) {

        Validate.notBlank(request.getCatalogId(), "catalogId must not be blank");

        Validate.notBlank(request.getGlossaryKey(), "glossaryKey must not be blank");
        Objects.requireNonNull(
                request.getImportGlossaryDetails(), "importGlossaryDetails is required");

        return clientCall(request, ImportGlossaryResponse::builder)
                .logger(LOG, "importGlossary")
                .serviceDetails(
                        "DataCatalog",
                        "ImportGlossary",
                        "https://docs.oracle.com/iaas/api/#/en/data-catalog/20190325/Glossary/ImportGlossary")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(ImportGlossaryRequest::builder)
                .basePath("/20190325")
                .appendPathParam("catalogs")
                .appendPathParam(request.getCatalogId())
                .appendPathParam("glossaries")
                .appendPathParam(request.getGlossaryKey())
                .appendPathParam("actions")
                .appendPathParam("import")
                .appendQueryParam("isRelationshipImported", request.getIsRelationshipImported())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .hasBody()
                .handleResponseHeaderString("etag", ImportGlossaryResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", ImportGlossaryResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ListAggregatedPhysicalEntitiesResponse>
            listAggregatedPhysicalEntities(
                    ListAggregatedPhysicalEntitiesRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    ListAggregatedPhysicalEntitiesRequest,
                                    ListAggregatedPhysicalEntitiesResponse>
                            handler) {

        Validate.notBlank(request.getCatalogId(), "catalogId must not be blank");

        Validate.notBlank(request.getDataAssetKey(), "dataAssetKey must not be blank");

        Validate.notBlank(request.getEntityKey(), "entityKey must not be blank");

        return clientCall(request, ListAggregatedPhysicalEntitiesResponse::builder)
                .logger(LOG, "listAggregatedPhysicalEntities")
                .serviceDetails(
                        "DataCatalog",
                        "ListAggregatedPhysicalEntities",
                        "https://docs.oracle.com/iaas/api/#/en/data-catalog/20190325/Entity/ListAggregatedPhysicalEntities")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(ListAggregatedPhysicalEntitiesRequest::builder)
                .basePath("/20190325")
                .appendPathParam("catalogs")
                .appendPathParam(request.getCatalogId())
                .appendPathParam("dataAssets")
                .appendPathParam(request.getDataAssetKey())
                .appendPathParam("entities")
                .appendPathParam(request.getEntityKey())
                .appendPathParam("actions")
                .appendPathParam("listAggregatedPhysicalEntities")
                .appendListQueryParam(
                        "fields",
                        request.getFields(),
                        com.oracle.bmc.util.internal.CollectionFormatType.Multi)
                .appendQueryParam("displayNameContains", request.getDisplayNameContains())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .appendQueryParam("isIncludeProperties", request.getIsIncludeProperties())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.datacatalog.model.EntityCollection.class,
                        ListAggregatedPhysicalEntitiesResponse.Builder::entityCollection)
                .handleResponseHeaderString(
                        "opc-request-id",
                        ListAggregatedPhysicalEntitiesResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ListAttributeTagsResponse> listAttributeTags(
            ListAttributeTagsRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ListAttributeTagsRequest, ListAttributeTagsResponse>
                    handler) {

        Validate.notBlank(request.getCatalogId(), "catalogId must not be blank");

        Validate.notBlank(request.getDataAssetKey(), "dataAssetKey must not be blank");

        Validate.notBlank(request.getEntityKey(), "entityKey must not be blank");

        Validate.notBlank(request.getAttributeKey(), "attributeKey must not be blank");

        return clientCall(request, ListAttributeTagsResponse::builder)
                .logger(LOG, "listAttributeTags")
                .serviceDetails(
                        "DataCatalog",
                        "ListAttributeTags",
                        "https://docs.oracle.com/iaas/api/#/en/data-catalog/20190325/AttributeTagCollection/ListAttributeTags")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListAttributeTagsRequest::builder)
                .basePath("/20190325")
                .appendPathParam("catalogs")
                .appendPathParam(request.getCatalogId())
                .appendPathParam("dataAssets")
                .appendPathParam(request.getDataAssetKey())
                .appendPathParam("entities")
                .appendPathParam(request.getEntityKey())
                .appendPathParam("attributes")
                .appendPathParam(request.getAttributeKey())
                .appendPathParam("tags")
                .appendQueryParam("name", request.getName())
                .appendEnumQueryParam("lifecycleState", request.getLifecycleState())
                .appendQueryParam("termKey", request.getTermKey())
                .appendQueryParam("termPath", request.getTermPath())
                .appendQueryParam("timeCreated", request.getTimeCreated())
                .appendQueryParam("createdById", request.getCreatedById())
                .appendListQueryParam(
                        "fields",
                        request.getFields(),
                        com.oracle.bmc.util.internal.CollectionFormatType.Multi)
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.datacatalog.model.AttributeTagCollection.class,
                        ListAttributeTagsResponse.Builder::attributeTagCollection)
                .handleResponseHeaderString(
                        "opc-request-id", ListAttributeTagsResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListAttributeTagsResponse.Builder::opcNextPage)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ListAttributesResponse> listAttributes(
            ListAttributesRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ListAttributesRequest, ListAttributesResponse>
                    handler) {

        Validate.notBlank(request.getCatalogId(), "catalogId must not be blank");

        Validate.notBlank(request.getDataAssetKey(), "dataAssetKey must not be blank");

        Validate.notBlank(request.getEntityKey(), "entityKey must not be blank");

        return clientCall(request, ListAttributesResponse::builder)
                .logger(LOG, "listAttributes")
                .serviceDetails(
                        "DataCatalog",
                        "ListAttributes",
                        "https://docs.oracle.com/iaas/api/#/en/data-catalog/20190325/AttributeCollection/ListAttributes")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListAttributesRequest::builder)
                .basePath("/20190325")
                .appendPathParam("catalogs")
                .appendPathParam(request.getCatalogId())
                .appendPathParam("dataAssets")
                .appendPathParam(request.getDataAssetKey())
                .appendPathParam("entities")
                .appendPathParam(request.getEntityKey())
                .appendPathParam("attributes")
                .appendQueryParam("displayName", request.getDisplayName())
                .appendQueryParam("businessName", request.getBusinessName())
                .appendQueryParam(
                        "displayOrBusinessNameContains", request.getDisplayOrBusinessNameContains())
                .appendQueryParam("displayNameContains", request.getDisplayNameContains())
                .appendEnumQueryParam("lifecycleState", request.getLifecycleState())
                .appendQueryParam("timeCreated", request.getTimeCreated())
                .appendQueryParam("timeUpdated", request.getTimeUpdated())
                .appendQueryParam("createdById", request.getCreatedById())
                .appendQueryParam("updatedById", request.getUpdatedById())
                .appendQueryParam("externalKey", request.getExternalKey())
                .appendQueryParam("timeExternal", request.getTimeExternal())
                .appendQueryParam("externalTypeName", request.getExternalTypeName())
                .appendQueryParam("isIncrementalData", request.getIsIncrementalData())
                .appendQueryParam("isNullable", request.getIsNullable())
                .appendQueryParam("length", request.getLength())
                .appendQueryParam("position", request.getPosition())
                .appendQueryParam("precision", request.getPrecision())
                .appendQueryParam("scale", request.getScale())
                .appendListQueryParam(
                        "fields",
                        request.getFields(),
                        com.oracle.bmc.util.internal.CollectionFormatType.Multi)
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.datacatalog.model.AttributeCollection.class,
                        ListAttributesResponse.Builder::attributeCollection)
                .handleResponseHeaderString(
                        "opc-request-id", ListAttributesResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListAttributesResponse.Builder::opcNextPage)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ListCatalogPrivateEndpointsResponse>
            listCatalogPrivateEndpoints(
                    ListCatalogPrivateEndpointsRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    ListCatalogPrivateEndpointsRequest,
                                    ListCatalogPrivateEndpointsResponse>
                            handler) {
        Objects.requireNonNull(request.getCompartmentId(), "compartmentId is required");

        return clientCall(request, ListCatalogPrivateEndpointsResponse::builder)
                .logger(LOG, "listCatalogPrivateEndpoints")
                .serviceDetails(
                        "DataCatalog",
                        "ListCatalogPrivateEndpoints",
                        "https://docs.oracle.com/iaas/api/#/en/data-catalog/20190325/CatalogPrivateEndpointSummary/ListCatalogPrivateEndpoints")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListCatalogPrivateEndpointsRequest::builder)
                .basePath("/20190325")
                .appendPathParam("catalogPrivateEndpoints")
                .appendQueryParam("compartmentId", request.getCompartmentId())
                .appendQueryParam("displayName", request.getDisplayName())
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .appendEnumQueryParam("lifecycleState", request.getLifecycleState())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBodyList(
                        com.oracle.bmc.datacatalog.model.CatalogPrivateEndpointSummary.class,
                        ListCatalogPrivateEndpointsResponse.Builder::items)
                .handleResponseHeaderString(
                        "opc-request-id", ListCatalogPrivateEndpointsResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListCatalogPrivateEndpointsResponse.Builder::opcNextPage)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ListCatalogsResponse> listCatalogs(
            ListCatalogsRequest request,
            final com.oracle.bmc.responses.AsyncHandler<ListCatalogsRequest, ListCatalogsResponse>
                    handler) {
        Objects.requireNonNull(request.getCompartmentId(), "compartmentId is required");

        return clientCall(request, ListCatalogsResponse::builder)
                .logger(LOG, "listCatalogs")
                .serviceDetails(
                        "DataCatalog",
                        "ListCatalogs",
                        "https://docs.oracle.com/iaas/api/#/en/data-catalog/20190325/CatalogSummary/ListCatalogs")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListCatalogsRequest::builder)
                .basePath("/20190325")
                .appendPathParam("catalogs")
                .appendQueryParam("compartmentId", request.getCompartmentId())
                .appendQueryParam("displayName", request.getDisplayName())
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .appendEnumQueryParam("lifecycleState", request.getLifecycleState())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBodyList(
                        com.oracle.bmc.datacatalog.model.CatalogSummary.class,
                        ListCatalogsResponse.Builder::items)
                .handleResponseHeaderString(
                        "opc-request-id", ListCatalogsResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListCatalogsResponse.Builder::opcNextPage)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ListConnectionsResponse> listConnections(
            ListConnectionsRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ListConnectionsRequest, ListConnectionsResponse>
                    handler) {

        Validate.notBlank(request.getCatalogId(), "catalogId must not be blank");

        Validate.notBlank(request.getDataAssetKey(), "dataAssetKey must not be blank");

        return clientCall(request, ListConnectionsResponse::builder)
                .logger(LOG, "listConnections")
                .serviceDetails(
                        "DataCatalog",
                        "ListConnections",
                        "https://docs.oracle.com/iaas/api/#/en/data-catalog/20190325/ConnectionCollection/ListConnections")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListConnectionsRequest::builder)
                .basePath("/20190325")
                .appendPathParam("catalogs")
                .appendPathParam(request.getCatalogId())
                .appendPathParam("dataAssets")
                .appendPathParam(request.getDataAssetKey())
                .appendPathParam("connections")
                .appendQueryParam("displayName", request.getDisplayName())
                .appendQueryParam("displayNameContains", request.getDisplayNameContains())
                .appendEnumQueryParam("lifecycleState", request.getLifecycleState())
                .appendQueryParam("timeCreated", request.getTimeCreated())
                .appendQueryParam("timeUpdated", request.getTimeUpdated())
                .appendQueryParam("createdById", request.getCreatedById())
                .appendQueryParam("updatedById", request.getUpdatedById())
                .appendQueryParam("externalKey", request.getExternalKey())
                .appendQueryParam("timeStatusUpdated", request.getTimeStatusUpdated())
                .appendQueryParam("isDefault", request.getIsDefault())
                .appendListQueryParam(
                        "fields",
                        request.getFields(),
                        com.oracle.bmc.util.internal.CollectionFormatType.Multi)
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.datacatalog.model.ConnectionCollection.class,
                        ListConnectionsResponse.Builder::connectionCollection)
                .handleResponseHeaderString(
                        "opc-request-id", ListConnectionsResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListConnectionsResponse.Builder::opcNextPage)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ListCustomPropertiesResponse> listCustomProperties(
            ListCustomPropertiesRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ListCustomPropertiesRequest, ListCustomPropertiesResponse>
                    handler) {

        Validate.notBlank(request.getCatalogId(), "catalogId must not be blank");

        Validate.notBlank(request.getNamespaceId(), "namespaceId must not be blank");

        return clientCall(request, ListCustomPropertiesResponse::builder)
                .logger(LOG, "listCustomProperties")
                .serviceDetails(
                        "DataCatalog",
                        "ListCustomProperties",
                        "https://docs.oracle.com/iaas/api/#/en/data-catalog/20190325/CustomProperty/ListCustomProperties")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListCustomPropertiesRequest::builder)
                .basePath("/20190325")
                .appendPathParam("catalogs")
                .appendPathParam(request.getCatalogId())
                .appendPathParam("namespaces")
                .appendPathParam(request.getNamespaceId())
                .appendPathParam("customProperties")
                .appendQueryParam("displayName", request.getDisplayName())
                .appendQueryParam("displayNameContains", request.getDisplayNameContains())
                .appendListQueryParam(
                        "dataTypes",
                        request.getDataTypes(),
                        com.oracle.bmc.util.internal.CollectionFormatType.Multi)
                .appendListQueryParam(
                        "typeName",
                        request.getTypeName(),
                        com.oracle.bmc.util.internal.CollectionFormatType.Multi)
                .appendEnumQueryParam("lifecycleState", request.getLifecycleState())
                .appendQueryParam("timeCreated", request.getTimeCreated())
                .appendQueryParam("timeUpdated", request.getTimeUpdated())
                .appendQueryParam("createdById", request.getCreatedById())
                .appendQueryParam("updatedById", request.getUpdatedById())
                .appendListQueryParam(
                        "fields",
                        request.getFields(),
                        com.oracle.bmc.util.internal.CollectionFormatType.Multi)
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.datacatalog.model.CustomPropertyCollection.class,
                        ListCustomPropertiesResponse.Builder::customPropertyCollection)
                .handleResponseHeaderString(
                        "opc-request-id", ListCustomPropertiesResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListCustomPropertiesResponse.Builder::opcNextPage)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ListDataAssetTagsResponse> listDataAssetTags(
            ListDataAssetTagsRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ListDataAssetTagsRequest, ListDataAssetTagsResponse>
                    handler) {

        Validate.notBlank(request.getCatalogId(), "catalogId must not be blank");

        Validate.notBlank(request.getDataAssetKey(), "dataAssetKey must not be blank");

        return clientCall(request, ListDataAssetTagsResponse::builder)
                .logger(LOG, "listDataAssetTags")
                .serviceDetails(
                        "DataCatalog",
                        "ListDataAssetTags",
                        "https://docs.oracle.com/iaas/api/#/en/data-catalog/20190325/DataAssetTagCollection/ListDataAssetTags")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListDataAssetTagsRequest::builder)
                .basePath("/20190325")
                .appendPathParam("catalogs")
                .appendPathParam(request.getCatalogId())
                .appendPathParam("dataAssets")
                .appendPathParam(request.getDataAssetKey())
                .appendPathParam("tags")
                .appendQueryParam("name", request.getName())
                .appendEnumQueryParam("lifecycleState", request.getLifecycleState())
                .appendQueryParam("termKey", request.getTermKey())
                .appendQueryParam("termPath", request.getTermPath())
                .appendQueryParam("timeCreated", request.getTimeCreated())
                .appendQueryParam("createdById", request.getCreatedById())
                .appendListQueryParam(
                        "fields",
                        request.getFields(),
                        com.oracle.bmc.util.internal.CollectionFormatType.Multi)
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.datacatalog.model.DataAssetTagCollection.class,
                        ListDataAssetTagsResponse.Builder::dataAssetTagCollection)
                .handleResponseHeaderString(
                        "opc-request-id", ListDataAssetTagsResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListDataAssetTagsResponse.Builder::opcNextPage)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ListDataAssetsResponse> listDataAssets(
            ListDataAssetsRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ListDataAssetsRequest, ListDataAssetsResponse>
                    handler) {

        Validate.notBlank(request.getCatalogId(), "catalogId must not be blank");

        return clientCall(request, ListDataAssetsResponse::builder)
                .logger(LOG, "listDataAssets")
                .serviceDetails(
                        "DataCatalog",
                        "ListDataAssets",
                        "https://docs.oracle.com/iaas/api/#/en/data-catalog/20190325/DataAssetCollection/ListDataAssets")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListDataAssetsRequest::builder)
                .basePath("/20190325")
                .appendPathParam("catalogs")
                .appendPathParam(request.getCatalogId())
                .appendPathParam("dataAssets")
                .appendQueryParam("displayName", request.getDisplayName())
                .appendQueryParam("displayNameContains", request.getDisplayNameContains())
                .appendEnumQueryParam("lifecycleState", request.getLifecycleState())
                .appendQueryParam("timeCreated", request.getTimeCreated())
                .appendQueryParam("timeUpdated", request.getTimeUpdated())
                .appendQueryParam("createdById", request.getCreatedById())
                .appendQueryParam("updatedById", request.getUpdatedById())
                .appendQueryParam("externalKey", request.getExternalKey())
                .appendQueryParam("typeKey", request.getTypeKey())
                .appendListQueryParam(
                        "fields",
                        request.getFields(),
                        com.oracle.bmc.util.internal.CollectionFormatType.Multi)
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.datacatalog.model.DataAssetCollection.class,
                        ListDataAssetsResponse.Builder::dataAssetCollection)
                .handleResponseHeaderString(
                        "opc-request-id", ListDataAssetsResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListDataAssetsResponse.Builder::opcNextPage)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ListDerivedLogicalEntitiesResponse>
            listDerivedLogicalEntities(
                    ListDerivedLogicalEntitiesRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    ListDerivedLogicalEntitiesRequest,
                                    ListDerivedLogicalEntitiesResponse>
                            handler) {

        Validate.notBlank(request.getCatalogId(), "catalogId must not be blank");

        Validate.notBlank(request.getPatternKey(), "patternKey must not be blank");

        return clientCall(request, ListDerivedLogicalEntitiesResponse::builder)
                .logger(LOG, "listDerivedLogicalEntities")
                .serviceDetails(
                        "DataCatalog",
                        "ListDerivedLogicalEntities",
                        "https://docs.oracle.com/iaas/api/#/en/data-catalog/20190325/Pattern/ListDerivedLogicalEntities")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(ListDerivedLogicalEntitiesRequest::builder)
                .basePath("/20190325")
                .appendPathParam("catalogs")
                .appendPathParam(request.getCatalogId())
                .appendPathParam("patterns")
                .appendPathParam(request.getPatternKey())
                .appendPathParam("actions")
                .appendPathParam("listDerivedLogicalEntities")
                .appendQueryParam("displayNameContains", request.getDisplayNameContains())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .handleBody(
                        com.oracle.bmc.datacatalog.model.EntityCollection.class,
                        ListDerivedLogicalEntitiesResponse.Builder::entityCollection)
                .handleResponseHeaderString(
                        "opc-request-id", ListDerivedLogicalEntitiesResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ListEntitiesResponse> listEntities(
            ListEntitiesRequest request,
            final com.oracle.bmc.responses.AsyncHandler<ListEntitiesRequest, ListEntitiesResponse>
                    handler) {

        Validate.notBlank(request.getCatalogId(), "catalogId must not be blank");

        Validate.notBlank(request.getDataAssetKey(), "dataAssetKey must not be blank");

        return clientCall(request, ListEntitiesResponse::builder)
                .logger(LOG, "listEntities")
                .serviceDetails(
                        "DataCatalog",
                        "ListEntities",
                        "https://docs.oracle.com/iaas/api/#/en/data-catalog/20190325/Entity/ListEntities")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListEntitiesRequest::builder)
                .basePath("/20190325")
                .appendPathParam("catalogs")
                .appendPathParam(request.getCatalogId())
                .appendPathParam("dataAssets")
                .appendPathParam(request.getDataAssetKey())
                .appendPathParam("entities")
                .appendQueryParam("displayName", request.getDisplayName())
                .appendQueryParam("businessName", request.getBusinessName())
                .appendQueryParam(
                        "displayOrBusinessNameContains", request.getDisplayOrBusinessNameContains())
                .appendQueryParam("typeKey", request.getTypeKey())
                .appendQueryParam("displayNameContains", request.getDisplayNameContains())
                .appendEnumQueryParam("lifecycleState", request.getLifecycleState())
                .appendQueryParam("timeCreated", request.getTimeCreated())
                .appendQueryParam("timeUpdated", request.getTimeUpdated())
                .appendQueryParam("createdById", request.getCreatedById())
                .appendQueryParam("updatedById", request.getUpdatedById())
                .appendQueryParam("externalKey", request.getExternalKey())
                .appendQueryParam("patternKey", request.getPatternKey())
                .appendQueryParam("timeExternal", request.getTimeExternal())
                .appendQueryParam("timeStatusUpdated", request.getTimeStatusUpdated())
                .appendQueryParam("isLogical", request.getIsLogical())
                .appendQueryParam("isPartition", request.getIsPartition())
                .appendQueryParam("folderKey", request.getFolderKey())
                .appendQueryParam("path", request.getPath())
                .appendEnumQueryParam("harvestStatus", request.getHarvestStatus())
                .appendQueryParam("lastJobKey", request.getLastJobKey())
                .appendListQueryParam(
                        "fields",
                        request.getFields(),
                        com.oracle.bmc.util.internal.CollectionFormatType.Multi)
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.datacatalog.model.EntityCollection.class,
                        ListEntitiesResponse.Builder::entityCollection)
                .handleResponseHeaderString(
                        "opc-request-id", ListEntitiesResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListEntitiesResponse.Builder::opcNextPage)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ListEntityTagsResponse> listEntityTags(
            ListEntityTagsRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ListEntityTagsRequest, ListEntityTagsResponse>
                    handler) {

        Validate.notBlank(request.getCatalogId(), "catalogId must not be blank");

        Validate.notBlank(request.getDataAssetKey(), "dataAssetKey must not be blank");

        Validate.notBlank(request.getEntityKey(), "entityKey must not be blank");

        return clientCall(request, ListEntityTagsResponse::builder)
                .logger(LOG, "listEntityTags")
                .serviceDetails(
                        "DataCatalog",
                        "ListEntityTags",
                        "https://docs.oracle.com/iaas/api/#/en/data-catalog/20190325/EntityTagCollection/ListEntityTags")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListEntityTagsRequest::builder)
                .basePath("/20190325")
                .appendPathParam("catalogs")
                .appendPathParam(request.getCatalogId())
                .appendPathParam("dataAssets")
                .appendPathParam(request.getDataAssetKey())
                .appendPathParam("entities")
                .appendPathParam(request.getEntityKey())
                .appendPathParam("tags")
                .appendQueryParam("name", request.getName())
                .appendEnumQueryParam("lifecycleState", request.getLifecycleState())
                .appendQueryParam("termKey", request.getTermKey())
                .appendQueryParam("termPath", request.getTermPath())
                .appendQueryParam("timeCreated", request.getTimeCreated())
                .appendQueryParam("createdById", request.getCreatedById())
                .appendListQueryParam(
                        "fields",
                        request.getFields(),
                        com.oracle.bmc.util.internal.CollectionFormatType.Multi)
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.datacatalog.model.EntityTagCollection.class,
                        ListEntityTagsResponse.Builder::entityTagCollection)
                .handleResponseHeaderString(
                        "opc-request-id", ListEntityTagsResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListEntityTagsResponse.Builder::opcNextPage)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ListFolderTagsResponse> listFolderTags(
            ListFolderTagsRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ListFolderTagsRequest, ListFolderTagsResponse>
                    handler) {

        Validate.notBlank(request.getCatalogId(), "catalogId must not be blank");

        Validate.notBlank(request.getDataAssetKey(), "dataAssetKey must not be blank");

        Validate.notBlank(request.getFolderKey(), "folderKey must not be blank");

        return clientCall(request, ListFolderTagsResponse::builder)
                .logger(LOG, "listFolderTags")
                .serviceDetails(
                        "DataCatalog",
                        "ListFolderTags",
                        "https://docs.oracle.com/iaas/api/#/en/data-catalog/20190325/FolderTagCollection/ListFolderTags")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListFolderTagsRequest::builder)
                .basePath("/20190325")
                .appendPathParam("catalogs")
                .appendPathParam(request.getCatalogId())
                .appendPathParam("dataAssets")
                .appendPathParam(request.getDataAssetKey())
                .appendPathParam("folders")
                .appendPathParam(request.getFolderKey())
                .appendPathParam("tags")
                .appendQueryParam("name", request.getName())
                .appendEnumQueryParam("lifecycleState", request.getLifecycleState())
                .appendQueryParam("termKey", request.getTermKey())
                .appendQueryParam("termPath", request.getTermPath())
                .appendQueryParam("timeCreated", request.getTimeCreated())
                .appendQueryParam("createdById", request.getCreatedById())
                .appendListQueryParam(
                        "fields",
                        request.getFields(),
                        com.oracle.bmc.util.internal.CollectionFormatType.Multi)
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.datacatalog.model.FolderTagCollection.class,
                        ListFolderTagsResponse.Builder::folderTagCollection)
                .handleResponseHeaderString(
                        "opc-request-id", ListFolderTagsResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListFolderTagsResponse.Builder::opcNextPage)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ListFoldersResponse> listFolders(
            ListFoldersRequest request,
            final com.oracle.bmc.responses.AsyncHandler<ListFoldersRequest, ListFoldersResponse>
                    handler) {

        Validate.notBlank(request.getCatalogId(), "catalogId must not be blank");

        Validate.notBlank(request.getDataAssetKey(), "dataAssetKey must not be blank");

        return clientCall(request, ListFoldersResponse::builder)
                .logger(LOG, "listFolders")
                .serviceDetails(
                        "DataCatalog",
                        "ListFolders",
                        "https://docs.oracle.com/iaas/api/#/en/data-catalog/20190325/FolderCollection/ListFolders")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListFoldersRequest::builder)
                .basePath("/20190325")
                .appendPathParam("catalogs")
                .appendPathParam(request.getCatalogId())
                .appendPathParam("dataAssets")
                .appendPathParam(request.getDataAssetKey())
                .appendPathParam("folders")
                .appendQueryParam("displayName", request.getDisplayName())
                .appendQueryParam("businessName", request.getBusinessName())
                .appendQueryParam(
                        "displayOrBusinessNameContains", request.getDisplayOrBusinessNameContains())
                .appendQueryParam("displayNameContains", request.getDisplayNameContains())
                .appendEnumQueryParam("lifecycleState", request.getLifecycleState())
                .appendQueryParam("parentFolderKey", request.getParentFolderKey())
                .appendQueryParam("path", request.getPath())
                .appendQueryParam("externalKey", request.getExternalKey())
                .appendQueryParam("timeCreated", request.getTimeCreated())
                .appendQueryParam("timeUpdated", request.getTimeUpdated())
                .appendQueryParam("createdById", request.getCreatedById())
                .appendQueryParam("updatedById", request.getUpdatedById())
                .appendEnumQueryParam("harvestStatus", request.getHarvestStatus())
                .appendQueryParam("lastJobKey", request.getLastJobKey())
                .appendListQueryParam(
                        "fields",
                        request.getFields(),
                        com.oracle.bmc.util.internal.CollectionFormatType.Multi)
                .appendQueryParam("typeKey", request.getTypeKey())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.datacatalog.model.FolderCollection.class,
                        ListFoldersResponse.Builder::folderCollection)
                .handleResponseHeaderString(
                        "opc-request-id", ListFoldersResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListFoldersResponse.Builder::opcNextPage)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ListGlossariesResponse> listGlossaries(
            ListGlossariesRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ListGlossariesRequest, ListGlossariesResponse>
                    handler) {

        Validate.notBlank(request.getCatalogId(), "catalogId must not be blank");

        return clientCall(request, ListGlossariesResponse::builder)
                .logger(LOG, "listGlossaries")
                .serviceDetails(
                        "DataCatalog",
                        "ListGlossaries",
                        "https://docs.oracle.com/iaas/api/#/en/data-catalog/20190325/Glossary/ListGlossaries")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListGlossariesRequest::builder)
                .basePath("/20190325")
                .appendPathParam("catalogs")
                .appendPathParam(request.getCatalogId())
                .appendPathParam("glossaries")
                .appendQueryParam("displayName", request.getDisplayName())
                .appendQueryParam("displayNameContains", request.getDisplayNameContains())
                .appendEnumQueryParam("lifecycleState", request.getLifecycleState())
                .appendQueryParam("timeCreated", request.getTimeCreated())
                .appendQueryParam("timeUpdated", request.getTimeUpdated())
                .appendQueryParam("createdById", request.getCreatedById())
                .appendQueryParam("updatedById", request.getUpdatedById())
                .appendListQueryParam(
                        "fields",
                        request.getFields(),
                        com.oracle.bmc.util.internal.CollectionFormatType.Multi)
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.datacatalog.model.GlossaryCollection.class,
                        ListGlossariesResponse.Builder::glossaryCollection)
                .handleResponseHeaderString(
                        "opc-request-id", ListGlossariesResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListGlossariesResponse.Builder::opcNextPage)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ListJobDefinitionsResponse> listJobDefinitions(
            ListJobDefinitionsRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ListJobDefinitionsRequest, ListJobDefinitionsResponse>
                    handler) {

        Validate.notBlank(request.getCatalogId(), "catalogId must not be blank");

        return clientCall(request, ListJobDefinitionsResponse::builder)
                .logger(LOG, "listJobDefinitions")
                .serviceDetails(
                        "DataCatalog",
                        "ListJobDefinitions",
                        "https://docs.oracle.com/iaas/api/#/en/data-catalog/20190325/JobDefinitionCollection/ListJobDefinitions")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListJobDefinitionsRequest::builder)
                .basePath("/20190325")
                .appendPathParam("catalogs")
                .appendPathParam(request.getCatalogId())
                .appendPathParam("jobDefinitions")
                .appendQueryParam("displayName", request.getDisplayName())
                .appendQueryParam("displayNameContains", request.getDisplayNameContains())
                .appendEnumQueryParam("jobExecutionState", request.getJobExecutionState())
                .appendEnumQueryParam("lifecycleState", request.getLifecycleState())
                .appendEnumQueryParam("jobType", request.getJobType())
                .appendQueryParam("isIncremental", request.getIsIncremental())
                .appendQueryParam("dataAssetKey", request.getDataAssetKey())
                .appendQueryParam("glossaryKey", request.getGlossaryKey())
                .appendQueryParam("connectionKey", request.getConnectionKey())
                .appendQueryParam("timeCreated", request.getTimeCreated())
                .appendQueryParam("timeUpdated", request.getTimeUpdated())
                .appendQueryParam("createdById", request.getCreatedById())
                .appendQueryParam("updatedById", request.getUpdatedById())
                .appendQueryParam("sampleDataSizeInMBs", request.getSampleDataSizeInMBs())
                .appendListQueryParam(
                        "fields",
                        request.getFields(),
                        com.oracle.bmc.util.internal.CollectionFormatType.Multi)
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.datacatalog.model.JobDefinitionCollection.class,
                        ListJobDefinitionsResponse.Builder::jobDefinitionCollection)
                .handleResponseHeaderString(
                        "opc-request-id", ListJobDefinitionsResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListJobDefinitionsResponse.Builder::opcNextPage)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ListJobExecutionsResponse> listJobExecutions(
            ListJobExecutionsRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ListJobExecutionsRequest, ListJobExecutionsResponse>
                    handler) {

        Validate.notBlank(request.getCatalogId(), "catalogId must not be blank");

        Validate.notBlank(request.getJobKey(), "jobKey must not be blank");

        return clientCall(request, ListJobExecutionsResponse::builder)
                .logger(LOG, "listJobExecutions")
                .serviceDetails(
                        "DataCatalog",
                        "ListJobExecutions",
                        "https://docs.oracle.com/iaas/api/#/en/data-catalog/20190325/JobExecutionCollection/ListJobExecutions")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListJobExecutionsRequest::builder)
                .basePath("/20190325")
                .appendPathParam("catalogs")
                .appendPathParam(request.getCatalogId())
                .appendPathParam("jobs")
                .appendPathParam(request.getJobKey())
                .appendPathParam("executions")
                .appendEnumQueryParam("lifecycleState", request.getLifecycleState())
                .appendQueryParam("timeCreated", request.getTimeCreated())
                .appendQueryParam("timeUpdated", request.getTimeUpdated())
                .appendQueryParam("createdById", request.getCreatedById())
                .appendQueryParam("updatedById", request.getUpdatedById())
                .appendEnumQueryParam("jobType", request.getJobType())
                .appendQueryParam("subType", request.getSubType())
                .appendQueryParam("parentKey", request.getParentKey())
                .appendQueryParam("timeStart", request.getTimeStart())
                .appendQueryParam("timeEnd", request.getTimeEnd())
                .appendQueryParam("errorCode", request.getErrorCode())
                .appendQueryParam("errorMessage", request.getErrorMessage())
                .appendQueryParam("processKey", request.getProcessKey())
                .appendQueryParam("externalUrl", request.getExternalUrl())
                .appendQueryParam("eventKey", request.getEventKey())
                .appendQueryParam("dataEntityKey", request.getDataEntityKey())
                .appendListQueryParam(
                        "fields",
                        request.getFields(),
                        com.oracle.bmc.util.internal.CollectionFormatType.Multi)
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.datacatalog.model.JobExecutionCollection.class,
                        ListJobExecutionsResponse.Builder::jobExecutionCollection)
                .handleResponseHeaderString(
                        "opc-request-id", ListJobExecutionsResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListJobExecutionsResponse.Builder::opcNextPage)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ListJobLogsResponse> listJobLogs(
            ListJobLogsRequest request,
            final com.oracle.bmc.responses.AsyncHandler<ListJobLogsRequest, ListJobLogsResponse>
                    handler) {

        Validate.notBlank(request.getCatalogId(), "catalogId must not be blank");

        Validate.notBlank(request.getJobKey(), "jobKey must not be blank");

        Validate.notBlank(request.getJobExecutionKey(), "jobExecutionKey must not be blank");

        return clientCall(request, ListJobLogsResponse::builder)
                .logger(LOG, "listJobLogs")
                .serviceDetails(
                        "DataCatalog",
                        "ListJobLogs",
                        "https://docs.oracle.com/iaas/api/#/en/data-catalog/20190325/JobLogCollection/ListJobLogs")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListJobLogsRequest::builder)
                .basePath("/20190325")
                .appendPathParam("catalogs")
                .appendPathParam(request.getCatalogId())
                .appendPathParam("jobs")
                .appendPathParam(request.getJobKey())
                .appendPathParam("executions")
                .appendPathParam(request.getJobExecutionKey())
                .appendPathParam("logs")
                .appendEnumQueryParam("lifecycleState", request.getLifecycleState())
                .appendQueryParam("severity", request.getSeverity())
                .appendQueryParam("timeCreated", request.getTimeCreated())
                .appendQueryParam("timeUpdated", request.getTimeUpdated())
                .appendQueryParam("createdById", request.getCreatedById())
                .appendQueryParam("updatedById", request.getUpdatedById())
                .appendListQueryParam(
                        "fields",
                        request.getFields(),
                        com.oracle.bmc.util.internal.CollectionFormatType.Multi)
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.datacatalog.model.JobLogCollection.class,
                        ListJobLogsResponse.Builder::jobLogCollection)
                .handleResponseHeaderString(
                        "opc-request-id", ListJobLogsResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListJobLogsResponse.Builder::opcNextPage)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ListJobMetricsResponse> listJobMetrics(
            ListJobMetricsRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ListJobMetricsRequest, ListJobMetricsResponse>
                    handler) {

        Validate.notBlank(request.getCatalogId(), "catalogId must not be blank");

        Validate.notBlank(request.getJobKey(), "jobKey must not be blank");

        Validate.notBlank(request.getJobExecutionKey(), "jobExecutionKey must not be blank");

        return clientCall(request, ListJobMetricsResponse::builder)
                .logger(LOG, "listJobMetrics")
                .serviceDetails(
                        "DataCatalog",
                        "ListJobMetrics",
                        "https://docs.oracle.com/iaas/api/#/en/data-catalog/20190325/JobMetricCollection/ListJobMetrics")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListJobMetricsRequest::builder)
                .basePath("/20190325")
                .appendPathParam("catalogs")
                .appendPathParam(request.getCatalogId())
                .appendPathParam("jobs")
                .appendPathParam(request.getJobKey())
                .appendPathParam("executions")
                .appendPathParam(request.getJobExecutionKey())
                .appendPathParam("metrics")
                .appendQueryParam("displayName", request.getDisplayName())
                .appendQueryParam("displayNameContains", request.getDisplayNameContains())
                .appendQueryParam("category", request.getCategory())
                .appendQueryParam("subCategory", request.getSubCategory())
                .appendQueryParam("unit", request.getUnit())
                .appendQueryParam("value", request.getValue())
                .appendQueryParam("batchKey", request.getBatchKey())
                .appendQueryParam("timeCreated", request.getTimeCreated())
                .appendQueryParam("timeUpdated", request.getTimeUpdated())
                .appendQueryParam("timeInserted", request.getTimeInserted())
                .appendQueryParam("createdById", request.getCreatedById())
                .appendQueryParam("updatedById", request.getUpdatedById())
                .appendListQueryParam(
                        "fields",
                        request.getFields(),
                        com.oracle.bmc.util.internal.CollectionFormatType.Multi)
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.datacatalog.model.JobMetricCollection.class,
                        ListJobMetricsResponse.Builder::jobMetricCollection)
                .handleResponseHeaderString(
                        "opc-request-id", ListJobMetricsResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListJobMetricsResponse.Builder::opcNextPage)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ListJobsResponse> listJobs(
            ListJobsRequest request,
            final com.oracle.bmc.responses.AsyncHandler<ListJobsRequest, ListJobsResponse>
                    handler) {

        Validate.notBlank(request.getCatalogId(), "catalogId must not be blank");

        return clientCall(request, ListJobsResponse::builder)
                .logger(LOG, "listJobs")
                .serviceDetails(
                        "DataCatalog",
                        "ListJobs",
                        "https://docs.oracle.com/iaas/api/#/en/data-catalog/20190325/JobCollection/ListJobs")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListJobsRequest::builder)
                .basePath("/20190325")
                .appendPathParam("catalogs")
                .appendPathParam(request.getCatalogId())
                .appendPathParam("jobs")
                .appendQueryParam("displayName", request.getDisplayName())
                .appendQueryParam("displayNameContains", request.getDisplayNameContains())
                .appendEnumQueryParam("lifecycleState", request.getLifecycleState())
                .appendQueryParam("timeCreated", request.getTimeCreated())
                .appendQueryParam("timeUpdated", request.getTimeUpdated())
                .appendQueryParam("createdById", request.getCreatedById())
                .appendQueryParam("updatedById", request.getUpdatedById())
                .appendEnumQueryParam("jobType", request.getJobType())
                .appendQueryParam("jobDefinitionKey", request.getJobDefinitionKey())
                .appendQueryParam("dataAssetKey", request.getDataAssetKey())
                .appendQueryParam("glossaryKey", request.getGlossaryKey())
                .appendQueryParam("scheduleCronExpression", request.getScheduleCronExpression())
                .appendQueryParam("timeScheduleBegin", request.getTimeScheduleBegin())
                .appendQueryParam("timeScheduleEnd", request.getTimeScheduleEnd())
                .appendEnumQueryParam("scheduleType", request.getScheduleType())
                .appendQueryParam("connectionKey", request.getConnectionKey())
                .appendListQueryParam(
                        "fields",
                        request.getFields(),
                        com.oracle.bmc.util.internal.CollectionFormatType.Multi)
                .appendQueryParam("executionCount", request.getExecutionCount())
                .appendQueryParam("timeOfLatestExecution", request.getTimeOfLatestExecution())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.datacatalog.model.JobCollection.class,
                        ListJobsResponse.Builder::jobCollection)
                .handleResponseHeaderString(
                        "opc-request-id", ListJobsResponse.Builder::opcRequestId)
                .handleResponseHeaderString("opc-next-page", ListJobsResponse.Builder::opcNextPage)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ListMetastoresResponse> listMetastores(
            ListMetastoresRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ListMetastoresRequest, ListMetastoresResponse>
                    handler) {
        Objects.requireNonNull(request.getCompartmentId(), "compartmentId is required");

        return clientCall(request, ListMetastoresResponse::builder)
                .logger(LOG, "listMetastores")
                .serviceDetails(
                        "DataCatalog",
                        "ListMetastores",
                        "https://docs.oracle.com/iaas/api/#/en/data-catalog/20190325/MetastoreSummary/ListMetastores")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListMetastoresRequest::builder)
                .basePath("/20190325")
                .appendPathParam("metastores")
                .appendQueryParam("compartmentId", request.getCompartmentId())
                .appendQueryParam("displayName", request.getDisplayName())
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .appendEnumQueryParam("lifecycleState", request.getLifecycleState())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBodyList(
                        com.oracle.bmc.datacatalog.model.MetastoreSummary.class,
                        ListMetastoresResponse.Builder::items)
                .handleResponseHeaderString(
                        "opc-request-id", ListMetastoresResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListMetastoresResponse.Builder::opcNextPage)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ListNamespacesResponse> listNamespaces(
            ListNamespacesRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ListNamespacesRequest, ListNamespacesResponse>
                    handler) {

        Validate.notBlank(request.getCatalogId(), "catalogId must not be blank");

        return clientCall(request, ListNamespacesResponse::builder)
                .logger(LOG, "listNamespaces")
                .serviceDetails(
                        "DataCatalog",
                        "ListNamespaces",
                        "https://docs.oracle.com/iaas/api/#/en/data-catalog/20190325/Namespace/ListNamespaces")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListNamespacesRequest::builder)
                .basePath("/20190325")
                .appendPathParam("catalogs")
                .appendPathParam(request.getCatalogId())
                .appendPathParam("namespaces")
                .appendQueryParam("displayName", request.getDisplayName())
                .appendQueryParam("displayNameContains", request.getDisplayNameContains())
                .appendEnumQueryParam("lifecycleState", request.getLifecycleState())
                .appendQueryParam("timeCreated", request.getTimeCreated())
                .appendQueryParam("timeUpdated", request.getTimeUpdated())
                .appendQueryParam("createdById", request.getCreatedById())
                .appendQueryParam("updatedById", request.getUpdatedById())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .appendListQueryParam(
                        "fields",
                        request.getFields(),
                        com.oracle.bmc.util.internal.CollectionFormatType.Multi)
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.datacatalog.model.NamespaceCollection.class,
                        ListNamespacesResponse.Builder::namespaceCollection)
                .handleResponseHeaderString(
                        "opc-request-id", ListNamespacesResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListNamespacesResponse.Builder::opcNextPage)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ListPatternsResponse> listPatterns(
            ListPatternsRequest request,
            final com.oracle.bmc.responses.AsyncHandler<ListPatternsRequest, ListPatternsResponse>
                    handler) {

        Validate.notBlank(request.getCatalogId(), "catalogId must not be blank");

        return clientCall(request, ListPatternsResponse::builder)
                .logger(LOG, "listPatterns")
                .serviceDetails(
                        "DataCatalog",
                        "ListPatterns",
                        "https://docs.oracle.com/iaas/api/#/en/data-catalog/20190325/Pattern/ListPatterns")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListPatternsRequest::builder)
                .basePath("/20190325")
                .appendPathParam("catalogs")
                .appendPathParam(request.getCatalogId())
                .appendPathParam("patterns")
                .appendQueryParam("displayName", request.getDisplayName())
                .appendQueryParam("displayNameContains", request.getDisplayNameContains())
                .appendEnumQueryParam("lifecycleState", request.getLifecycleState())
                .appendQueryParam("timeCreated", request.getTimeCreated())
                .appendQueryParam("timeUpdated", request.getTimeUpdated())
                .appendQueryParam("createdById", request.getCreatedById())
                .appendQueryParam("updatedById", request.getUpdatedById())
                .appendListQueryParam(
                        "fields",
                        request.getFields(),
                        com.oracle.bmc.util.internal.CollectionFormatType.Multi)
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.datacatalog.model.PatternCollection.class,
                        ListPatternsResponse.Builder::patternCollection)
                .handleResponseHeaderString(
                        "opc-request-id", ListPatternsResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListPatternsResponse.Builder::opcNextPage)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ListRulesResponse> listRules(
            ListRulesRequest request,
            final com.oracle.bmc.responses.AsyncHandler<ListRulesRequest, ListRulesResponse>
                    handler) {

        Validate.notBlank(request.getCatalogId(), "catalogId must not be blank");

        Validate.notBlank(request.getDataAssetKey(), "dataAssetKey must not be blank");

        Validate.notBlank(request.getEntityKey(), "entityKey must not be blank");

        return clientCall(request, ListRulesResponse::builder)
                .logger(LOG, "listRules")
                .serviceDetails(
                        "DataCatalog",
                        "ListRules",
                        "https://docs.oracle.com/iaas/api/#/en/data-catalog/20190325/RuleSummary/ListRules")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListRulesRequest::builder)
                .basePath("/20190325")
                .appendPathParam("catalogs")
                .appendPathParam(request.getCatalogId())
                .appendPathParam("dataAssets")
                .appendPathParam(request.getDataAssetKey())
                .appendPathParam("entities")
                .appendPathParam(request.getEntityKey())
                .appendPathParam("rules")
                .appendQueryParam("displayName", request.getDisplayName())
                .appendQueryParam("displayNameContains", request.getDisplayNameContains())
                .appendEnumQueryParam("ruleType", request.getRuleType())
                .appendEnumQueryParam("lifecycleState", request.getLifecycleState())
                .appendEnumQueryParam("originType", request.getOriginType())
                .appendQueryParam("externalKey", request.getExternalKey())
                .appendQueryParam("timeCreated", request.getTimeCreated())
                .appendQueryParam("timeUpdated", request.getTimeUpdated())
                .appendQueryParam("createdById", request.getCreatedById())
                .appendQueryParam("updatedById", request.getUpdatedById())
                .appendListQueryParam(
                        "fields",
                        request.getFields(),
                        com.oracle.bmc.util.internal.CollectionFormatType.Multi)
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.datacatalog.model.RuleCollection.class,
                        ListRulesResponse.Builder::ruleCollection)
                .handleResponseHeaderString(
                        "opc-request-id", ListRulesResponse.Builder::opcRequestId)
                .handleResponseHeaderString("opc-next-page", ListRulesResponse.Builder::opcNextPage)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ListTagsResponse> listTags(
            ListTagsRequest request,
            final com.oracle.bmc.responses.AsyncHandler<ListTagsRequest, ListTagsResponse>
                    handler) {

        Validate.notBlank(request.getCatalogId(), "catalogId must not be blank");

        return clientCall(request, ListTagsResponse::builder)
                .logger(LOG, "listTags")
                .serviceDetails(
                        "DataCatalog",
                        "ListTags",
                        "https://docs.oracle.com/iaas/api/#/en/data-catalog/20190325/Term/ListTags")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListTagsRequest::builder)
                .basePath("/20190325")
                .appendPathParam("catalogs")
                .appendPathParam(request.getCatalogId())
                .appendPathParam("tags")
                .appendQueryParam("displayName", request.getDisplayName())
                .appendQueryParam("displayNameContains", request.getDisplayNameContains())
                .appendEnumQueryParam("lifecycleState", request.getLifecycleState())
                .appendListQueryParam(
                        "fields",
                        request.getFields(),
                        com.oracle.bmc.util.internal.CollectionFormatType.Multi)
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.datacatalog.model.TermCollection.class,
                        ListTagsResponse.Builder::termCollection)
                .handleResponseHeaderString(
                        "opc-request-id", ListTagsResponse.Builder::opcRequestId)
                .handleResponseHeaderString("opc-next-page", ListTagsResponse.Builder::opcNextPage)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ListTermRelationshipsResponse> listTermRelationships(
            ListTermRelationshipsRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ListTermRelationshipsRequest, ListTermRelationshipsResponse>
                    handler) {

        Validate.notBlank(request.getCatalogId(), "catalogId must not be blank");

        Validate.notBlank(request.getGlossaryKey(), "glossaryKey must not be blank");

        Validate.notBlank(request.getTermKey(), "termKey must not be blank");

        return clientCall(request, ListTermRelationshipsResponse::builder)
                .logger(LOG, "listTermRelationships")
                .serviceDetails(
                        "DataCatalog",
                        "ListTermRelationships",
                        "https://docs.oracle.com/iaas/api/#/en/data-catalog/20190325/TermRelationship/ListTermRelationships")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListTermRelationshipsRequest::builder)
                .basePath("/20190325")
                .appendPathParam("catalogs")
                .appendPathParam(request.getCatalogId())
                .appendPathParam("glossaries")
                .appendPathParam(request.getGlossaryKey())
                .appendPathParam("terms")
                .appendPathParam(request.getTermKey())
                .appendPathParam("termRelationships")
                .appendQueryParam("displayName", request.getDisplayName())
                .appendQueryParam("displayNameContains", request.getDisplayNameContains())
                .appendEnumQueryParam("lifecycleState", request.getLifecycleState())
                .appendListQueryParam(
                        "fields",
                        request.getFields(),
                        com.oracle.bmc.util.internal.CollectionFormatType.Multi)
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.datacatalog.model.TermRelationshipCollection.class,
                        ListTermRelationshipsResponse.Builder::termRelationshipCollection)
                .handleResponseHeaderString(
                        "opc-request-id", ListTermRelationshipsResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListTermRelationshipsResponse.Builder::opcNextPage)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ListTermsResponse> listTerms(
            ListTermsRequest request,
            final com.oracle.bmc.responses.AsyncHandler<ListTermsRequest, ListTermsResponse>
                    handler) {

        Validate.notBlank(request.getCatalogId(), "catalogId must not be blank");

        Validate.notBlank(request.getGlossaryKey(), "glossaryKey must not be blank");

        return clientCall(request, ListTermsResponse::builder)
                .logger(LOG, "listTerms")
                .serviceDetails(
                        "DataCatalog",
                        "ListTerms",
                        "https://docs.oracle.com/iaas/api/#/en/data-catalog/20190325/Term/ListTerms")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListTermsRequest::builder)
                .basePath("/20190325")
                .appendPathParam("catalogs")
                .appendPathParam(request.getCatalogId())
                .appendPathParam("glossaries")
                .appendPathParam(request.getGlossaryKey())
                .appendPathParam("terms")
                .appendQueryParam("displayName", request.getDisplayName())
                .appendQueryParam("displayNameContains", request.getDisplayNameContains())
                .appendEnumQueryParam("lifecycleState", request.getLifecycleState())
                .appendQueryParam("parentTermKey", request.getParentTermKey())
                .appendQueryParam(
                        "isAllowedToHaveChildTerms", request.getIsAllowedToHaveChildTerms())
                .appendEnumQueryParam("workflowStatus", request.getWorkflowStatus())
                .appendQueryParam("path", request.getPath())
                .appendListQueryParam(
                        "fields",
                        request.getFields(),
                        com.oracle.bmc.util.internal.CollectionFormatType.Multi)
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.datacatalog.model.TermCollection.class,
                        ListTermsResponse.Builder::termCollection)
                .handleResponseHeaderString(
                        "opc-request-id", ListTermsResponse.Builder::opcRequestId)
                .handleResponseHeaderString("opc-next-page", ListTermsResponse.Builder::opcNextPage)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ListTypesResponse> listTypes(
            ListTypesRequest request,
            final com.oracle.bmc.responses.AsyncHandler<ListTypesRequest, ListTypesResponse>
                    handler) {

        Validate.notBlank(request.getCatalogId(), "catalogId must not be blank");

        return clientCall(request, ListTypesResponse::builder)
                .logger(LOG, "listTypes")
                .serviceDetails(
                        "DataCatalog",
                        "ListTypes",
                        "https://docs.oracle.com/iaas/api/#/en/data-catalog/20190325/TypeCollection/ListTypes")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListTypesRequest::builder)
                .basePath("/20190325")
                .appendPathParam("catalogs")
                .appendPathParam(request.getCatalogId())
                .appendPathParam("types")
                .appendQueryParam("name", request.getName())
                .appendEnumQueryParam("lifecycleState", request.getLifecycleState())
                .appendQueryParam("isInternal", request.getIsInternal())
                .appendQueryParam("isTag", request.getIsTag())
                .appendQueryParam("isApproved", request.getIsApproved())
                .appendQueryParam("externalTypeName", request.getExternalTypeName())
                .appendQueryParam("typeCategory", request.getTypeCategory())
                .appendListQueryParam(
                        "fields",
                        request.getFields(),
                        com.oracle.bmc.util.internal.CollectionFormatType.Multi)
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.datacatalog.model.TypeCollection.class,
                        ListTypesResponse.Builder::typeCollection)
                .handleResponseHeaderString(
                        "opc-request-id", ListTypesResponse.Builder::opcRequestId)
                .handleResponseHeaderString("opc-next-page", ListTypesResponse.Builder::opcNextPage)
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
                        "DataCatalog",
                        "ListWorkRequestErrors",
                        "https://docs.oracle.com/iaas/api/#/en/data-catalog/20190325/WorkRequestError/ListWorkRequestErrors")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListWorkRequestErrorsRequest::builder)
                .basePath("/20190325")
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
                        com.oracle.bmc.datacatalog.model.WorkRequestError.class,
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
                        "DataCatalog",
                        "ListWorkRequestLogs",
                        "https://docs.oracle.com/iaas/api/#/en/data-catalog/20190325/WorkRequestLog/ListWorkRequestLogs")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListWorkRequestLogsRequest::builder)
                .basePath("/20190325")
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
                        com.oracle.bmc.datacatalog.model.WorkRequestLog.class,
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
                        "DataCatalog",
                        "ListWorkRequests",
                        "https://docs.oracle.com/iaas/api/#/en/data-catalog/20190325/WorkRequest/ListWorkRequests")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListWorkRequestsRequest::builder)
                .basePath("/20190325")
                .appendPathParam("workRequests")
                .appendQueryParam("compartmentId", request.getCompartmentId())
                .appendQueryParam("page", request.getPage())
                .appendQueryParam("limit", request.getLimit())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBodyList(
                        com.oracle.bmc.datacatalog.model.WorkRequest.class,
                        ListWorkRequestsResponse.Builder::items)
                .handleResponseHeaderString(
                        "opc-request-id", ListWorkRequestsResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListWorkRequestsResponse.Builder::opcNextPage)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ObjectStatsResponse> objectStats(
            ObjectStatsRequest request,
            final com.oracle.bmc.responses.AsyncHandler<ObjectStatsRequest, ObjectStatsResponse>
                    handler) {

        Validate.notBlank(request.getCatalogId(), "catalogId must not be blank");

        return clientCall(request, ObjectStatsResponse::builder)
                .logger(LOG, "objectStats")
                .serviceDetails(
                        "DataCatalog",
                        "ObjectStats",
                        "https://docs.oracle.com/iaas/api/#/en/data-catalog/20190325/Catalog/ObjectStats")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(ObjectStatsRequest::builder)
                .basePath("/20190325")
                .appendPathParam("catalogs")
                .appendPathParam(request.getCatalogId())
                .appendPathParam("actions")
                .appendPathParam("objectStats")
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(String.class, ObjectStatsResponse.Builder::value)
                .handleResponseHeaderString(
                        "opc-request-id", ObjectStatsResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ObjectStatsResponse.Builder::opcNextPage)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ParseConnectionResponse> parseConnection(
            ParseConnectionRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ParseConnectionRequest, ParseConnectionResponse>
                    handler) {

        Validate.notBlank(request.getCatalogId(), "catalogId must not be blank");

        Validate.notBlank(request.getDataAssetKey(), "dataAssetKey must not be blank");
        Objects.requireNonNull(
                request.getParseConnectionDetails(), "parseConnectionDetails is required");

        return clientCall(request, ParseConnectionResponse::builder)
                .logger(LOG, "parseConnection")
                .serviceDetails(
                        "DataCatalog",
                        "ParseConnection",
                        "https://docs.oracle.com/iaas/api/#/en/data-catalog/20190325/DataAsset/ParseConnection")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(ParseConnectionRequest::builder)
                .basePath("/20190325")
                .appendPathParam("catalogs")
                .appendPathParam(request.getCatalogId())
                .appendPathParam("dataAssets")
                .appendPathParam(request.getDataAssetKey())
                .appendPathParam("actions")
                .appendPathParam("parseConnection")
                .appendQueryParam("connectionKey", request.getConnectionKey())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .hasBody()
                .handleBodyList(
                        com.oracle.bmc.datacatalog.model.ConnectionAliasSummary.class,
                        ParseConnectionResponse.Builder::items)
                .handleResponseHeaderString("etag", ParseConnectionResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", ParseConnectionResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ProcessRecommendationResponse> processRecommendation(
            ProcessRecommendationRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ProcessRecommendationRequest, ProcessRecommendationResponse>
                    handler) {

        Validate.notBlank(request.getCatalogId(), "catalogId must not be blank");
        Objects.requireNonNull(
                request.getProcessRecommendationDetails(),
                "processRecommendationDetails is required");

        return clientCall(request, ProcessRecommendationResponse::builder)
                .logger(LOG, "processRecommendation")
                .serviceDetails(
                        "DataCatalog",
                        "ProcessRecommendation",
                        "https://docs.oracle.com/iaas/api/#/en/data-catalog/20190325/Catalog/ProcessRecommendation")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(ProcessRecommendationRequest::builder)
                .basePath("/20190325")
                .appendPathParam("catalogs")
                .appendPathParam(request.getCatalogId())
                .appendPathParam("actions")
                .appendPathParam("processRecommendation")
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.datacatalog.model.ProcessRecommendationDetails.class,
                        ProcessRecommendationResponse.Builder::processRecommendationDetails)
                .handleResponseHeaderString("etag", ProcessRecommendationResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", ProcessRecommendationResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<RecommendationsResponse> recommendations(
            RecommendationsRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            RecommendationsRequest, RecommendationsResponse>
                    handler) {

        Validate.notBlank(request.getCatalogId(), "catalogId must not be blank");
        Objects.requireNonNull(request.getRecommendationType(), "recommendationType is required");

        Objects.requireNonNull(request.getSourceObjectKey(), "sourceObjectKey is required");

        Objects.requireNonNull(request.getSourceObjectType(), "sourceObjectType is required");

        return clientCall(request, RecommendationsResponse::builder)
                .logger(LOG, "recommendations")
                .serviceDetails(
                        "DataCatalog",
                        "Recommendations",
                        "https://docs.oracle.com/iaas/api/#/en/data-catalog/20190325/Catalog/Recommendations")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(RecommendationsRequest::builder)
                .basePath("/20190325")
                .appendPathParam("catalogs")
                .appendPathParam(request.getCatalogId())
                .appendPathParam("actions")
                .appendPathParam("getRecommendations")
                .appendListQueryParam(
                        "recommendationType",
                        request.getRecommendationType(),
                        com.oracle.bmc.util.internal.CollectionFormatType.Multi)
                .appendQueryParam("sourceObjectKey", request.getSourceObjectKey())
                .appendEnumQueryParam("sourceObjectType", request.getSourceObjectType())
                .appendEnumQueryParam("recommendationStatus", request.getRecommendationStatus())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.datacatalog.model.RecommendationCollection.class,
                        RecommendationsResponse.Builder::recommendationCollection)
                .handleResponseHeaderString(
                        "opc-request-id", RecommendationsResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<RemoveCatalogLockResponse> removeCatalogLock(
            RemoveCatalogLockRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            RemoveCatalogLockRequest, RemoveCatalogLockResponse>
                    handler) {

        Validate.notBlank(request.getCatalogId(), "catalogId must not be blank");
        Objects.requireNonNull(
                request.getRemoveResourceLockDetails(), "removeResourceLockDetails is required");

        return clientCall(request, RemoveCatalogLockResponse::builder)
                .logger(LOG, "removeCatalogLock")
                .serviceDetails(
                        "DataCatalog",
                        "RemoveCatalogLock",
                        "https://docs.oracle.com/iaas/api/#/en/data-catalog/20190325/Catalog/RemoveCatalogLock")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(RemoveCatalogLockRequest::builder)
                .basePath("/20190325")
                .appendPathParam("catalogs")
                .appendPathParam(request.getCatalogId())
                .appendPathParam("actions")
                .appendPathParam("removeLock")
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("if-match", request.getIfMatch())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.datacatalog.model.Catalog.class,
                        RemoveCatalogLockResponse.Builder::catalog)
                .handleResponseHeaderString(
                        "opc-request-id", RemoveCatalogLockResponse.Builder::opcRequestId)
                .handleResponseHeaderString("etag", RemoveCatalogLockResponse.Builder::etag)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<RemoveCatalogPrivateEndpointLockResponse>
            removeCatalogPrivateEndpointLock(
                    RemoveCatalogPrivateEndpointLockRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    RemoveCatalogPrivateEndpointLockRequest,
                                    RemoveCatalogPrivateEndpointLockResponse>
                            handler) {

        Validate.notBlank(
                request.getCatalogPrivateEndpointId(),
                "catalogPrivateEndpointId must not be blank");
        Objects.requireNonNull(
                request.getRemoveResourceLockDetails(), "removeResourceLockDetails is required");

        return clientCall(request, RemoveCatalogPrivateEndpointLockResponse::builder)
                .logger(LOG, "removeCatalogPrivateEndpointLock")
                .serviceDetails(
                        "DataCatalog",
                        "RemoveCatalogPrivateEndpointLock",
                        "https://docs.oracle.com/iaas/api/#/en/data-catalog/20190325/CatalogPrivateEndpoint/RemoveCatalogPrivateEndpointLock")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(RemoveCatalogPrivateEndpointLockRequest::builder)
                .basePath("/20190325")
                .appendPathParam("catalogPrivateEndpoints")
                .appendPathParam(request.getCatalogPrivateEndpointId())
                .appendPathParam("actions")
                .appendPathParam("removeLock")
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("if-match", request.getIfMatch())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.datacatalog.model.CatalogPrivateEndpoint.class,
                        RemoveCatalogPrivateEndpointLockResponse.Builder::catalogPrivateEndpoint)
                .handleResponseHeaderString(
                        "opc-request-id",
                        RemoveCatalogPrivateEndpointLockResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "etag", RemoveCatalogPrivateEndpointLockResponse.Builder::etag)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<RemoveDataSelectorPatternsResponse>
            removeDataSelectorPatterns(
                    RemoveDataSelectorPatternsRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    RemoveDataSelectorPatternsRequest,
                                    RemoveDataSelectorPatternsResponse>
                            handler) {

        Validate.notBlank(request.getCatalogId(), "catalogId must not be blank");

        Validate.notBlank(request.getDataAssetKey(), "dataAssetKey must not be blank");
        Objects.requireNonNull(
                request.getDataSelectorPatternDetails(), "dataSelectorPatternDetails is required");

        return clientCall(request, RemoveDataSelectorPatternsResponse::builder)
                .logger(LOG, "removeDataSelectorPatterns")
                .serviceDetails(
                        "DataCatalog",
                        "RemoveDataSelectorPatterns",
                        "https://docs.oracle.com/iaas/api/#/en/data-catalog/20190325/DataAsset/RemoveDataSelectorPatterns")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(RemoveDataSelectorPatternsRequest::builder)
                .basePath("/20190325")
                .appendPathParam("catalogs")
                .appendPathParam(request.getCatalogId())
                .appendPathParam("dataAssets")
                .appendPathParam(request.getDataAssetKey())
                .appendPathParam("actions")
                .appendPathParam("removeDataSelectorPatterns")
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.datacatalog.model.DataAsset.class,
                        RemoveDataSelectorPatternsResponse.Builder::dataAsset)
                .handleResponseHeaderString(
                        "etag", RemoveDataSelectorPatternsResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", RemoveDataSelectorPatternsResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<RemoveMetastoreLockResponse> removeMetastoreLock(
            RemoveMetastoreLockRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            RemoveMetastoreLockRequest, RemoveMetastoreLockResponse>
                    handler) {

        Validate.notBlank(request.getMetastoreId(), "metastoreId must not be blank");
        Objects.requireNonNull(
                request.getRemoveResourceLockDetails(), "removeResourceLockDetails is required");

        return clientCall(request, RemoveMetastoreLockResponse::builder)
                .logger(LOG, "removeMetastoreLock")
                .serviceDetails(
                        "DataCatalog",
                        "RemoveMetastoreLock",
                        "https://docs.oracle.com/iaas/api/#/en/data-catalog/20190325/Metastore/RemoveMetastoreLock")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(RemoveMetastoreLockRequest::builder)
                .basePath("/20190325")
                .appendPathParam("metastores")
                .appendPathParam(request.getMetastoreId())
                .appendPathParam("actions")
                .appendPathParam("removeLock")
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("if-match", request.getIfMatch())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.datacatalog.model.Metastore.class,
                        RemoveMetastoreLockResponse.Builder::metastore)
                .handleResponseHeaderString(
                        "opc-request-id", RemoveMetastoreLockResponse.Builder::opcRequestId)
                .handleResponseHeaderString("etag", RemoveMetastoreLockResponse.Builder::etag)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<SearchCriteriaResponse> searchCriteria(
            SearchCriteriaRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            SearchCriteriaRequest, SearchCriteriaResponse>
                    handler) {

        Validate.notBlank(request.getCatalogId(), "catalogId must not be blank");

        return clientCall(request, SearchCriteriaResponse::builder)
                .logger(LOG, "searchCriteria")
                .serviceDetails(
                        "DataCatalog",
                        "SearchCriteria",
                        "https://docs.oracle.com/iaas/api/#/en/data-catalog/20190325/SearchResult/SearchCriteria")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(SearchCriteriaRequest::builder)
                .basePath("/20190325")
                .appendPathParam("catalogs")
                .appendPathParam(request.getCatalogId())
                .appendPathParam("search")
                .appendQueryParam("displayName", request.getDisplayName())
                .appendQueryParam("name", request.getName())
                .appendEnumQueryParam("lifecycleState", request.getLifecycleState())
                .appendQueryParam("timeout", request.getTimeout())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.datacatalog.model.SearchResultCollection.class,
                        SearchCriteriaResponse.Builder::searchResultCollection)
                .handleResponseHeaderString(
                        "opc-request-id", SearchCriteriaResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", SearchCriteriaResponse.Builder::opcNextPage)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<SuggestMatchesResponse> suggestMatches(
            SuggestMatchesRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            SuggestMatchesRequest, SuggestMatchesResponse>
                    handler) {

        Validate.notBlank(request.getCatalogId(), "catalogId must not be blank");
        Objects.requireNonNull(request.getInputText(), "inputText is required");

        return clientCall(request, SuggestMatchesResponse::builder)
                .logger(LOG, "suggestMatches")
                .serviceDetails(
                        "DataCatalog",
                        "SuggestMatches",
                        "https://docs.oracle.com/iaas/api/#/en/data-catalog/20190325/SuggestResults/SuggestMatches")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(SuggestMatchesRequest::builder)
                .basePath("/20190325")
                .appendPathParam("catalogs")
                .appendPathParam(request.getCatalogId())
                .appendPathParam("actions")
                .appendPathParam("suggest")
                .appendQueryParam("timeout", request.getTimeout())
                .appendQueryParam("inputText", request.getInputText())
                .appendQueryParam("limit", request.getLimit())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.datacatalog.model.SuggestResults.class,
                        SuggestMatchesResponse.Builder::suggestResults)
                .handleResponseHeaderString(
                        "opc-request-id", SuggestMatchesResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<SynchronousExportDataAssetResponse>
            synchronousExportDataAsset(
                    SynchronousExportDataAssetRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    SynchronousExportDataAssetRequest,
                                    SynchronousExportDataAssetResponse>
                            handler) {

        Validate.notBlank(request.getCatalogId(), "catalogId must not be blank");

        Validate.notBlank(request.getDataAssetKey(), "dataAssetKey must not be blank");
        Objects.requireNonNull(
                request.getSynchronousExportDataAssetDetails(),
                "synchronousExportDataAssetDetails is required");

        Objects.requireNonNull(request.getExportType(), "exportType is required");

        return clientCall(request, SynchronousExportDataAssetResponse::builder)
                .logger(LOG, "synchronousExportDataAsset")
                .serviceDetails(
                        "DataCatalog",
                        "SynchronousExportDataAsset",
                        "https://docs.oracle.com/iaas/api/#/en/data-catalog/20190325/DataAsset/SynchronousExportDataAsset")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(SynchronousExportDataAssetRequest::builder)
                .basePath("/20190325")
                .appendPathParam("catalogs")
                .appendPathParam(request.getCatalogId())
                .appendPathParam("dataAssets")
                .appendPathParam(request.getDataAssetKey())
                .appendPathParam("actions")
                .appendPathParam("synchronousExport")
                .appendListQueryParam(
                        "exportType",
                        request.getExportType(),
                        com.oracle.bmc.util.internal.CollectionFormatType.Multi)
                .accept("application/vnd.openxmlformats-officedocument.spreadsheetml.sheet")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .hasBody()
                .handleBody(
                        java.io.InputStream.class,
                        SynchronousExportDataAssetResponse.Builder::inputStream)
                .handleResponseHeaderString(
                        "opc-request-id", SynchronousExportDataAssetResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<TestConnectionResponse> testConnection(
            TestConnectionRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            TestConnectionRequest, TestConnectionResponse>
                    handler) {

        Validate.notBlank(request.getCatalogId(), "catalogId must not be blank");

        Validate.notBlank(request.getDataAssetKey(), "dataAssetKey must not be blank");

        Validate.notBlank(request.getConnectionKey(), "connectionKey must not be blank");

        return clientCall(request, TestConnectionResponse::builder)
                .logger(LOG, "testConnection")
                .serviceDetails(
                        "DataCatalog",
                        "TestConnection",
                        "https://docs.oracle.com/iaas/api/#/en/data-catalog/20190325/Connection/TestConnection")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(TestConnectionRequest::builder)
                .basePath("/20190325")
                .appendPathParam("catalogs")
                .appendPathParam(request.getCatalogId())
                .appendPathParam("dataAssets")
                .appendPathParam(request.getDataAssetKey())
                .appendPathParam("connections")
                .appendPathParam(request.getConnectionKey())
                .appendPathParam("actions")
                .appendPathParam("test")
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .handleBody(
                        com.oracle.bmc.datacatalog.model.ValidateConnectionResult.class,
                        TestConnectionResponse.Builder::validateConnectionResult)
                .handleResponseHeaderString("etag", TestConnectionResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", TestConnectionResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<UpdateAttributeResponse> updateAttribute(
            UpdateAttributeRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            UpdateAttributeRequest, UpdateAttributeResponse>
                    handler) {

        Validate.notBlank(request.getCatalogId(), "catalogId must not be blank");

        Validate.notBlank(request.getDataAssetKey(), "dataAssetKey must not be blank");

        Validate.notBlank(request.getEntityKey(), "entityKey must not be blank");

        Validate.notBlank(request.getAttributeKey(), "attributeKey must not be blank");
        Objects.requireNonNull(
                request.getUpdateAttributeDetails(), "updateAttributeDetails is required");

        return clientCall(request, UpdateAttributeResponse::builder)
                .logger(LOG, "updateAttribute")
                .serviceDetails(
                        "DataCatalog",
                        "UpdateAttribute",
                        "https://docs.oracle.com/iaas/api/#/en/data-catalog/20190325/Attribute/UpdateAttribute")
                .method(com.oracle.bmc.http.client.Method.PUT)
                .requestBuilder(UpdateAttributeRequest::builder)
                .basePath("/20190325")
                .appendPathParam("catalogs")
                .appendPathParam(request.getCatalogId())
                .appendPathParam("dataAssets")
                .appendPathParam(request.getDataAssetKey())
                .appendPathParam("entities")
                .appendPathParam(request.getEntityKey())
                .appendPathParam("attributes")
                .appendPathParam(request.getAttributeKey())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.datacatalog.model.Attribute.class,
                        UpdateAttributeResponse.Builder::attribute)
                .handleResponseHeaderString("etag", UpdateAttributeResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", UpdateAttributeResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<UpdateCatalogResponse> updateCatalog(
            UpdateCatalogRequest request,
            final com.oracle.bmc.responses.AsyncHandler<UpdateCatalogRequest, UpdateCatalogResponse>
                    handler) {

        Validate.notBlank(request.getCatalogId(), "catalogId must not be blank");
        Objects.requireNonNull(
                request.getUpdateCatalogDetails(), "updateCatalogDetails is required");

        return clientCall(request, UpdateCatalogResponse::builder)
                .logger(LOG, "updateCatalog")
                .serviceDetails(
                        "DataCatalog",
                        "UpdateCatalog",
                        "https://docs.oracle.com/iaas/api/#/en/data-catalog/20190325/Catalog/UpdateCatalog")
                .method(com.oracle.bmc.http.client.Method.PUT)
                .requestBuilder(UpdateCatalogRequest::builder)
                .basePath("/20190325")
                .appendPathParam("catalogs")
                .appendPathParam(request.getCatalogId())
                .appendQueryParam("isLockOverride", request.getIsLockOverride())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.datacatalog.model.Catalog.class,
                        UpdateCatalogResponse.Builder::catalog)
                .handleResponseHeaderString("etag", UpdateCatalogResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", UpdateCatalogResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<UpdateCatalogPrivateEndpointResponse>
            updateCatalogPrivateEndpoint(
                    UpdateCatalogPrivateEndpointRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    UpdateCatalogPrivateEndpointRequest,
                                    UpdateCatalogPrivateEndpointResponse>
                            handler) {

        Validate.notBlank(
                request.getCatalogPrivateEndpointId(),
                "catalogPrivateEndpointId must not be blank");
        Objects.requireNonNull(
                request.getUpdateCatalogPrivateEndpointDetails(),
                "updateCatalogPrivateEndpointDetails is required");

        return clientCall(request, UpdateCatalogPrivateEndpointResponse::builder)
                .logger(LOG, "updateCatalogPrivateEndpoint")
                .serviceDetails(
                        "DataCatalog",
                        "UpdateCatalogPrivateEndpoint",
                        "https://docs.oracle.com/iaas/api/#/en/data-catalog/20190325/CatalogPrivateEndpoint/UpdateCatalogPrivateEndpoint")
                .method(com.oracle.bmc.http.client.Method.PUT)
                .requestBuilder(UpdateCatalogPrivateEndpointRequest::builder)
                .basePath("/20190325")
                .appendPathParam("catalogPrivateEndpoints")
                .appendPathParam(request.getCatalogPrivateEndpointId())
                .appendQueryParam("isLockOverride", request.getIsLockOverride())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .hasBody()
                .handleResponseHeaderString(
                        "opc-request-id",
                        UpdateCatalogPrivateEndpointResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        UpdateCatalogPrivateEndpointResponse.Builder::opcWorkRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<UpdateConnectionResponse> updateConnection(
            UpdateConnectionRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            UpdateConnectionRequest, UpdateConnectionResponse>
                    handler) {

        Validate.notBlank(request.getCatalogId(), "catalogId must not be blank");

        Validate.notBlank(request.getDataAssetKey(), "dataAssetKey must not be blank");

        Validate.notBlank(request.getConnectionKey(), "connectionKey must not be blank");
        Objects.requireNonNull(
                request.getUpdateConnectionDetails(), "updateConnectionDetails is required");

        return clientCall(request, UpdateConnectionResponse::builder)
                .logger(LOG, "updateConnection")
                .serviceDetails(
                        "DataCatalog",
                        "UpdateConnection",
                        "https://docs.oracle.com/iaas/api/#/en/data-catalog/20190325/Connection/UpdateConnection")
                .method(com.oracle.bmc.http.client.Method.PUT)
                .requestBuilder(UpdateConnectionRequest::builder)
                .basePath("/20190325")
                .appendPathParam("catalogs")
                .appendPathParam(request.getCatalogId())
                .appendPathParam("dataAssets")
                .appendPathParam(request.getDataAssetKey())
                .appendPathParam("connections")
                .appendPathParam(request.getConnectionKey())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.datacatalog.model.Connection.class,
                        UpdateConnectionResponse.Builder::connection)
                .handleResponseHeaderString("etag", UpdateConnectionResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", UpdateConnectionResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<UpdateCustomPropertyResponse> updateCustomProperty(
            UpdateCustomPropertyRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            UpdateCustomPropertyRequest, UpdateCustomPropertyResponse>
                    handler) {

        Validate.notBlank(request.getCatalogId(), "catalogId must not be blank");

        Validate.notBlank(request.getNamespaceId(), "namespaceId must not be blank");

        Validate.notBlank(request.getCustomPropertyKey(), "customPropertyKey must not be blank");
        Objects.requireNonNull(
                request.getUpdateCustomPropertyDetails(),
                "updateCustomPropertyDetails is required");

        return clientCall(request, UpdateCustomPropertyResponse::builder)
                .logger(LOG, "updateCustomProperty")
                .serviceDetails(
                        "DataCatalog",
                        "UpdateCustomProperty",
                        "https://docs.oracle.com/iaas/api/#/en/data-catalog/20190325/CustomProperty/UpdateCustomProperty")
                .method(com.oracle.bmc.http.client.Method.PUT)
                .requestBuilder(UpdateCustomPropertyRequest::builder)
                .basePath("/20190325")
                .appendPathParam("catalogs")
                .appendPathParam(request.getCatalogId())
                .appendPathParam("namespaces")
                .appendPathParam(request.getNamespaceId())
                .appendPathParam("customProperties")
                .appendPathParam(request.getCustomPropertyKey())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.datacatalog.model.CustomProperty.class,
                        UpdateCustomPropertyResponse.Builder::customProperty)
                .handleResponseHeaderString("etag", UpdateCustomPropertyResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", UpdateCustomPropertyResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<UpdateDataAssetResponse> updateDataAsset(
            UpdateDataAssetRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            UpdateDataAssetRequest, UpdateDataAssetResponse>
                    handler) {

        Validate.notBlank(request.getCatalogId(), "catalogId must not be blank");

        Validate.notBlank(request.getDataAssetKey(), "dataAssetKey must not be blank");
        Objects.requireNonNull(
                request.getUpdateDataAssetDetails(), "updateDataAssetDetails is required");

        return clientCall(request, UpdateDataAssetResponse::builder)
                .logger(LOG, "updateDataAsset")
                .serviceDetails(
                        "DataCatalog",
                        "UpdateDataAsset",
                        "https://docs.oracle.com/iaas/api/#/en/data-catalog/20190325/DataAsset/UpdateDataAsset")
                .method(com.oracle.bmc.http.client.Method.PUT)
                .requestBuilder(UpdateDataAssetRequest::builder)
                .basePath("/20190325")
                .appendPathParam("catalogs")
                .appendPathParam(request.getCatalogId())
                .appendPathParam("dataAssets")
                .appendPathParam(request.getDataAssetKey())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.datacatalog.model.DataAsset.class,
                        UpdateDataAssetResponse.Builder::dataAsset)
                .handleResponseHeaderString("etag", UpdateDataAssetResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", UpdateDataAssetResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<UpdateEntityResponse> updateEntity(
            UpdateEntityRequest request,
            final com.oracle.bmc.responses.AsyncHandler<UpdateEntityRequest, UpdateEntityResponse>
                    handler) {

        Validate.notBlank(request.getCatalogId(), "catalogId must not be blank");

        Validate.notBlank(request.getDataAssetKey(), "dataAssetKey must not be blank");

        Validate.notBlank(request.getEntityKey(), "entityKey must not be blank");
        Objects.requireNonNull(request.getUpdateEntityDetails(), "updateEntityDetails is required");

        return clientCall(request, UpdateEntityResponse::builder)
                .logger(LOG, "updateEntity")
                .serviceDetails(
                        "DataCatalog",
                        "UpdateEntity",
                        "https://docs.oracle.com/iaas/api/#/en/data-catalog/20190325/Entity/UpdateEntity")
                .method(com.oracle.bmc.http.client.Method.PUT)
                .requestBuilder(UpdateEntityRequest::builder)
                .basePath("/20190325")
                .appendPathParam("catalogs")
                .appendPathParam(request.getCatalogId())
                .appendPathParam("dataAssets")
                .appendPathParam(request.getDataAssetKey())
                .appendPathParam("entities")
                .appendPathParam(request.getEntityKey())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.datacatalog.model.Entity.class,
                        UpdateEntityResponse.Builder::entity)
                .handleResponseHeaderString("etag", UpdateEntityResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", UpdateEntityResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<UpdateFolderResponse> updateFolder(
            UpdateFolderRequest request,
            final com.oracle.bmc.responses.AsyncHandler<UpdateFolderRequest, UpdateFolderResponse>
                    handler) {

        Validate.notBlank(request.getCatalogId(), "catalogId must not be blank");

        Validate.notBlank(request.getDataAssetKey(), "dataAssetKey must not be blank");

        Validate.notBlank(request.getFolderKey(), "folderKey must not be blank");
        Objects.requireNonNull(request.getUpdateFolderDetails(), "updateFolderDetails is required");

        return clientCall(request, UpdateFolderResponse::builder)
                .logger(LOG, "updateFolder")
                .serviceDetails(
                        "DataCatalog",
                        "UpdateFolder",
                        "https://docs.oracle.com/iaas/api/#/en/data-catalog/20190325/Folder/UpdateFolder")
                .method(com.oracle.bmc.http.client.Method.PUT)
                .requestBuilder(UpdateFolderRequest::builder)
                .basePath("/20190325")
                .appendPathParam("catalogs")
                .appendPathParam(request.getCatalogId())
                .appendPathParam("dataAssets")
                .appendPathParam(request.getDataAssetKey())
                .appendPathParam("folders")
                .appendPathParam(request.getFolderKey())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.datacatalog.model.Folder.class,
                        UpdateFolderResponse.Builder::folder)
                .handleResponseHeaderString("etag", UpdateFolderResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", UpdateFolderResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<UpdateGlossaryResponse> updateGlossary(
            UpdateGlossaryRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            UpdateGlossaryRequest, UpdateGlossaryResponse>
                    handler) {

        Validate.notBlank(request.getCatalogId(), "catalogId must not be blank");

        Validate.notBlank(request.getGlossaryKey(), "glossaryKey must not be blank");
        Objects.requireNonNull(
                request.getUpdateGlossaryDetails(), "updateGlossaryDetails is required");

        return clientCall(request, UpdateGlossaryResponse::builder)
                .logger(LOG, "updateGlossary")
                .serviceDetails(
                        "DataCatalog",
                        "UpdateGlossary",
                        "https://docs.oracle.com/iaas/api/#/en/data-catalog/20190325/Glossary/UpdateGlossary")
                .method(com.oracle.bmc.http.client.Method.PUT)
                .requestBuilder(UpdateGlossaryRequest::builder)
                .basePath("/20190325")
                .appendPathParam("catalogs")
                .appendPathParam(request.getCatalogId())
                .appendPathParam("glossaries")
                .appendPathParam(request.getGlossaryKey())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.datacatalog.model.Glossary.class,
                        UpdateGlossaryResponse.Builder::glossary)
                .handleResponseHeaderString("etag", UpdateGlossaryResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", UpdateGlossaryResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<UpdateJobResponse> updateJob(
            UpdateJobRequest request,
            final com.oracle.bmc.responses.AsyncHandler<UpdateJobRequest, UpdateJobResponse>
                    handler) {

        Validate.notBlank(request.getCatalogId(), "catalogId must not be blank");

        Validate.notBlank(request.getJobKey(), "jobKey must not be blank");
        Objects.requireNonNull(request.getUpdateJobDetails(), "updateJobDetails is required");

        return clientCall(request, UpdateJobResponse::builder)
                .logger(LOG, "updateJob")
                .serviceDetails(
                        "DataCatalog",
                        "UpdateJob",
                        "https://docs.oracle.com/iaas/api/#/en/data-catalog/20190325/Job/UpdateJob")
                .method(com.oracle.bmc.http.client.Method.PUT)
                .requestBuilder(UpdateJobRequest::builder)
                .basePath("/20190325")
                .appendPathParam("catalogs")
                .appendPathParam(request.getCatalogId())
                .appendPathParam("jobs")
                .appendPathParam(request.getJobKey())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.datacatalog.model.Job.class, UpdateJobResponse.Builder::job)
                .handleResponseHeaderString("etag", UpdateJobResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", UpdateJobResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<UpdateJobDefinitionResponse> updateJobDefinition(
            UpdateJobDefinitionRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            UpdateJobDefinitionRequest, UpdateJobDefinitionResponse>
                    handler) {

        Validate.notBlank(request.getCatalogId(), "catalogId must not be blank");

        Validate.notBlank(request.getJobDefinitionKey(), "jobDefinitionKey must not be blank");
        Objects.requireNonNull(
                request.getUpdateJobDefinitionDetails(), "updateJobDefinitionDetails is required");

        return clientCall(request, UpdateJobDefinitionResponse::builder)
                .logger(LOG, "updateJobDefinition")
                .serviceDetails(
                        "DataCatalog",
                        "UpdateJobDefinition",
                        "https://docs.oracle.com/iaas/api/#/en/data-catalog/20190325/JobDefinition/UpdateJobDefinition")
                .method(com.oracle.bmc.http.client.Method.PUT)
                .requestBuilder(UpdateJobDefinitionRequest::builder)
                .basePath("/20190325")
                .appendPathParam("catalogs")
                .appendPathParam(request.getCatalogId())
                .appendPathParam("jobDefinitions")
                .appendPathParam(request.getJobDefinitionKey())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.datacatalog.model.JobDefinition.class,
                        UpdateJobDefinitionResponse.Builder::jobDefinition)
                .handleResponseHeaderString("etag", UpdateJobDefinitionResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", UpdateJobDefinitionResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<UpdateMetastoreResponse> updateMetastore(
            UpdateMetastoreRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            UpdateMetastoreRequest, UpdateMetastoreResponse>
                    handler) {

        Validate.notBlank(request.getMetastoreId(), "metastoreId must not be blank");
        Objects.requireNonNull(
                request.getUpdateMetastoreDetails(), "updateMetastoreDetails is required");

        return clientCall(request, UpdateMetastoreResponse::builder)
                .logger(LOG, "updateMetastore")
                .serviceDetails(
                        "DataCatalog",
                        "UpdateMetastore",
                        "https://docs.oracle.com/iaas/api/#/en/data-catalog/20190325/Metastore/UpdateMetastore")
                .method(com.oracle.bmc.http.client.Method.PUT)
                .requestBuilder(UpdateMetastoreRequest::builder)
                .basePath("/20190325")
                .appendPathParam("metastores")
                .appendPathParam(request.getMetastoreId())
                .appendQueryParam("isLockOverride", request.getIsLockOverride())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.datacatalog.model.Metastore.class,
                        UpdateMetastoreResponse.Builder::metastore)
                .handleResponseHeaderString("etag", UpdateMetastoreResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", UpdateMetastoreResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<UpdateNamespaceResponse> updateNamespace(
            UpdateNamespaceRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            UpdateNamespaceRequest, UpdateNamespaceResponse>
                    handler) {

        Validate.notBlank(request.getCatalogId(), "catalogId must not be blank");

        Validate.notBlank(request.getNamespaceId(), "namespaceId must not be blank");
        Objects.requireNonNull(
                request.getUpdateNamespaceDetails(), "updateNamespaceDetails is required");

        return clientCall(request, UpdateNamespaceResponse::builder)
                .logger(LOG, "updateNamespace")
                .serviceDetails(
                        "DataCatalog",
                        "UpdateNamespace",
                        "https://docs.oracle.com/iaas/api/#/en/data-catalog/20190325/Namespace/UpdateNamespace")
                .method(com.oracle.bmc.http.client.Method.PUT)
                .requestBuilder(UpdateNamespaceRequest::builder)
                .basePath("/20190325")
                .appendPathParam("catalogs")
                .appendPathParam(request.getCatalogId())
                .appendPathParam("namespaces")
                .appendPathParam(request.getNamespaceId())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.datacatalog.model.Namespace.class,
                        UpdateNamespaceResponse.Builder::namespace)
                .handleResponseHeaderString("etag", UpdateNamespaceResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", UpdateNamespaceResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<UpdatePatternResponse> updatePattern(
            UpdatePatternRequest request,
            final com.oracle.bmc.responses.AsyncHandler<UpdatePatternRequest, UpdatePatternResponse>
                    handler) {

        Validate.notBlank(request.getCatalogId(), "catalogId must not be blank");

        Validate.notBlank(request.getPatternKey(), "patternKey must not be blank");
        Objects.requireNonNull(
                request.getUpdatePatternDetails(), "updatePatternDetails is required");

        return clientCall(request, UpdatePatternResponse::builder)
                .logger(LOG, "updatePattern")
                .serviceDetails(
                        "DataCatalog",
                        "UpdatePattern",
                        "https://docs.oracle.com/iaas/api/#/en/data-catalog/20190325/Pattern/UpdatePattern")
                .method(com.oracle.bmc.http.client.Method.PUT)
                .requestBuilder(UpdatePatternRequest::builder)
                .basePath("/20190325")
                .appendPathParam("catalogs")
                .appendPathParam(request.getCatalogId())
                .appendPathParam("patterns")
                .appendPathParam(request.getPatternKey())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.datacatalog.model.Pattern.class,
                        UpdatePatternResponse.Builder::pattern)
                .handleResponseHeaderString("etag", UpdatePatternResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", UpdatePatternResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<UpdateTermResponse> updateTerm(
            UpdateTermRequest request,
            final com.oracle.bmc.responses.AsyncHandler<UpdateTermRequest, UpdateTermResponse>
                    handler) {

        Validate.notBlank(request.getCatalogId(), "catalogId must not be blank");

        Validate.notBlank(request.getGlossaryKey(), "glossaryKey must not be blank");

        Validate.notBlank(request.getTermKey(), "termKey must not be blank");
        Objects.requireNonNull(request.getUpdateTermDetails(), "updateTermDetails is required");

        return clientCall(request, UpdateTermResponse::builder)
                .logger(LOG, "updateTerm")
                .serviceDetails(
                        "DataCatalog",
                        "UpdateTerm",
                        "https://docs.oracle.com/iaas/api/#/en/data-catalog/20190325/Term/UpdateTerm")
                .method(com.oracle.bmc.http.client.Method.PUT)
                .requestBuilder(UpdateTermRequest::builder)
                .basePath("/20190325")
                .appendPathParam("catalogs")
                .appendPathParam(request.getCatalogId())
                .appendPathParam("glossaries")
                .appendPathParam(request.getGlossaryKey())
                .appendPathParam("terms")
                .appendPathParam(request.getTermKey())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.datacatalog.model.Term.class,
                        UpdateTermResponse.Builder::term)
                .handleResponseHeaderString("etag", UpdateTermResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", UpdateTermResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<UpdateTermRelationshipResponse> updateTermRelationship(
            UpdateTermRelationshipRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            UpdateTermRelationshipRequest, UpdateTermRelationshipResponse>
                    handler) {

        Validate.notBlank(request.getCatalogId(), "catalogId must not be blank");

        Validate.notBlank(request.getGlossaryKey(), "glossaryKey must not be blank");

        Validate.notBlank(request.getTermKey(), "termKey must not be blank");

        Validate.notBlank(
                request.getTermRelationshipKey(), "termRelationshipKey must not be blank");
        Objects.requireNonNull(
                request.getUpdateTermRelationshipDetails(),
                "updateTermRelationshipDetails is required");

        return clientCall(request, UpdateTermRelationshipResponse::builder)
                .logger(LOG, "updateTermRelationship")
                .serviceDetails(
                        "DataCatalog",
                        "UpdateTermRelationship",
                        "https://docs.oracle.com/iaas/api/#/en/data-catalog/20190325/TermRelationship/UpdateTermRelationship")
                .method(com.oracle.bmc.http.client.Method.PUT)
                .requestBuilder(UpdateTermRelationshipRequest::builder)
                .basePath("/20190325")
                .appendPathParam("catalogs")
                .appendPathParam(request.getCatalogId())
                .appendPathParam("glossaries")
                .appendPathParam(request.getGlossaryKey())
                .appendPathParam("terms")
                .appendPathParam(request.getTermKey())
                .appendPathParam("termRelationships")
                .appendPathParam(request.getTermRelationshipKey())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.datacatalog.model.TermRelationship.class,
                        UpdateTermRelationshipResponse.Builder::termRelationship)
                .handleResponseHeaderString("etag", UpdateTermRelationshipResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", UpdateTermRelationshipResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<UploadCredentialsResponse> uploadCredentials(
            UploadCredentialsRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            UploadCredentialsRequest, UploadCredentialsResponse>
                    handler) {

        Validate.notBlank(request.getCatalogId(), "catalogId must not be blank");

        Validate.notBlank(request.getDataAssetKey(), "dataAssetKey must not be blank");

        Validate.notBlank(request.getConnectionKey(), "connectionKey must not be blank");
        Objects.requireNonNull(
                request.getUploadCredentialsDetails(), "uploadCredentialsDetails is required");

        return clientCall(request, UploadCredentialsResponse::builder)
                .logger(LOG, "uploadCredentials")
                .serviceDetails(
                        "DataCatalog",
                        "UploadCredentials",
                        "https://docs.oracle.com/iaas/api/#/en/data-catalog/20190325/Connection/UploadCredentials")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(UploadCredentialsRequest::builder)
                .basePath("/20190325")
                .appendPathParam("catalogs")
                .appendPathParam(request.getCatalogId())
                .appendPathParam("dataAssets")
                .appendPathParam(request.getDataAssetKey())
                .appendPathParam("connections")
                .appendPathParam(request.getConnectionKey())
                .appendPathParam("actions")
                .appendPathParam("uploadCredentials")
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.datacatalog.model.Connection.class,
                        UploadCredentialsResponse.Builder::connection)
                .handleResponseHeaderString("etag", UploadCredentialsResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", UploadCredentialsResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<UsersResponse> users(
            UsersRequest request,
            final com.oracle.bmc.responses.AsyncHandler<UsersRequest, UsersResponse> handler) {

        Validate.notBlank(request.getCatalogId(), "catalogId must not be blank");

        return clientCall(request, UsersResponse::builder)
                .logger(LOG, "users")
                .serviceDetails(
                        "DataCatalog",
                        "Users",
                        "https://docs.oracle.com/iaas/api/#/en/data-catalog/20190325/Catalog/Users")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(UsersRequest::builder)
                .basePath("/20190325")
                .appendPathParam("catalogs")
                .appendPathParam(request.getCatalogId())
                .appendPathParam("actions")
                .appendPathParam("users")
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(String.class, UsersResponse.Builder::value)
                .handleResponseHeaderString("opc-request-id", UsersResponse.Builder::opcRequestId)
                .handleResponseHeaderString("opc-next-page", UsersResponse.Builder::opcNextPage)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ValidateConnectionResponse> validateConnection(
            ValidateConnectionRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ValidateConnectionRequest, ValidateConnectionResponse>
                    handler) {

        Validate.notBlank(request.getCatalogId(), "catalogId must not be blank");

        Validate.notBlank(request.getDataAssetKey(), "dataAssetKey must not be blank");
        Objects.requireNonNull(
                request.getValidateConnectionDetails(), "validateConnectionDetails is required");

        return clientCall(request, ValidateConnectionResponse::builder)
                .logger(LOG, "validateConnection")
                .serviceDetails(
                        "DataCatalog",
                        "ValidateConnection",
                        "https://docs.oracle.com/iaas/api/#/en/data-catalog/20190325/DataAsset/ValidateConnection")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(ValidateConnectionRequest::builder)
                .basePath("/20190325")
                .appendPathParam("catalogs")
                .appendPathParam(request.getCatalogId())
                .appendPathParam("dataAssets")
                .appendPathParam(request.getDataAssetKey())
                .appendPathParam("actions")
                .appendPathParam("validateConnection")
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.datacatalog.model.ValidateConnectionResult.class,
                        ValidateConnectionResponse.Builder::validateConnectionResult)
                .handleResponseHeaderString("etag", ValidateConnectionResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", ValidateConnectionResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ValidatePatternResponse> validatePattern(
            ValidatePatternRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ValidatePatternRequest, ValidatePatternResponse>
                    handler) {

        Validate.notBlank(request.getCatalogId(), "catalogId must not be blank");

        Validate.notBlank(request.getPatternKey(), "patternKey must not be blank");
        Objects.requireNonNull(
                request.getValidatePatternDetails(), "validatePatternDetails is required");

        return clientCall(request, ValidatePatternResponse::builder)
                .logger(LOG, "validatePattern")
                .serviceDetails(
                        "DataCatalog",
                        "ValidatePattern",
                        "https://docs.oracle.com/iaas/api/#/en/data-catalog/20190325/Pattern/ValidatePattern")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(ValidatePatternRequest::builder)
                .basePath("/20190325")
                .appendPathParam("catalogs")
                .appendPathParam(request.getCatalogId())
                .appendPathParam("patterns")
                .appendPathParam(request.getPatternKey())
                .appendPathParam("actions")
                .appendPathParam("validate")
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.datacatalog.model.ValidatePatternResult.class,
                        ValidatePatternResponse.Builder::validatePatternResult)
                .handleResponseHeaderString(
                        "opc-request-id", ValidatePatternResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    /**
     * Create a new client instance.
     *
     * @param authenticationDetailsProvider The authentication details (see {@link Builder#build})
     * @deprecated Use the {@link #builder() builder} instead.
     */
    @Deprecated
    public DataCatalogAsyncClient(
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
    public DataCatalogAsyncClient(
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
    public DataCatalogAsyncClient(
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
    public DataCatalogAsyncClient(
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
    public DataCatalogAsyncClient(
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
    public DataCatalogAsyncClient(
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
    public DataCatalogAsyncClient(
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
