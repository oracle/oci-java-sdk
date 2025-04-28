/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.servicecatalog;

import com.oracle.bmc.util.internal.Validate;
import com.oracle.bmc.servicecatalog.requests.*;
import com.oracle.bmc.servicecatalog.responses.*;

import java.util.Objects;

/**
 * Async client implementation for ServiceCatalog service. <br>
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
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20210527")
public class ServiceCatalogAsyncClient extends com.oracle.bmc.http.internal.BaseAsyncClient
        implements ServiceCatalogAsync {
    /** Service instance for ServiceCatalog. */
    public static final com.oracle.bmc.Service SERVICE =
            com.oracle.bmc.Services.serviceBuilder()
                    .serviceName("SERVICECATALOG")
                    .serviceEndpointPrefix("")
                    .serviceEndpointTemplate(
                            "https://service-catalog.{region}.oci.{secondLevelDomain}")
                    .build();

    private static final org.slf4j.Logger LOG =
            org.slf4j.LoggerFactory.getLogger(ServiceCatalogAsyncClient.class);

    ServiceCatalogAsyncClient(
            com.oracle.bmc.common.ClientBuilderBase<?, ?> builder,
            com.oracle.bmc.auth.AbstractAuthenticationDetailsProvider
                    authenticationDetailsProvider) {
        this(builder, authenticationDetailsProvider, true);
    }

    ServiceCatalogAsyncClient(
            com.oracle.bmc.common.ClientBuilderBase<?, ?> builder,
            com.oracle.bmc.auth.AbstractAuthenticationDetailsProvider authenticationDetailsProvider,
            boolean isStreamWarningEnabled) {
        super(builder, authenticationDetailsProvider);

        if (isStreamWarningEnabled && com.oracle.bmc.util.StreamUtils.isExtraStreamLogsEnabled()) {
            LOG.warn(
                    com.oracle.bmc.util.StreamUtils.getStreamWarningMessage(
                            "ServiceCatalogAsyncClient",
                            "getPrivateApplicationActionDownloadLogo,getPrivateApplicationPackageActionDownloadConfig"));
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
            extends com.oracle.bmc.common.RegionalClientBuilder<
                    Builder, ServiceCatalogAsyncClient> {
        private boolean isStreamWarningEnabled = true;

        private Builder(com.oracle.bmc.Service service) {
            super(service);
            final String packageName = "servicecatalog";
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
        public ServiceCatalogAsyncClient build(
                @jakarta.annotation.Nonnull
                        com.oracle.bmc.auth.AbstractAuthenticationDetailsProvider
                                authenticationDetailsProvider) {
            return new ServiceCatalogAsyncClient(
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
    public java.util.concurrent.Future<BulkReplaceServiceCatalogAssociationsResponse>
            bulkReplaceServiceCatalogAssociations(
                    BulkReplaceServiceCatalogAssociationsRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    BulkReplaceServiceCatalogAssociationsRequest,
                                    BulkReplaceServiceCatalogAssociationsResponse>
                            handler) {

        Validate.notBlank(request.getServiceCatalogId(), "serviceCatalogId must not be blank");
        Objects.requireNonNull(
                request.getBulkReplaceServiceCatalogAssociationsDetails(),
                "bulkReplaceServiceCatalogAssociationsDetails is required");

        return clientCall(request, BulkReplaceServiceCatalogAssociationsResponse::builder)
                .logger(LOG, "bulkReplaceServiceCatalogAssociations")
                .serviceDetails(
                        "ServiceCatalog",
                        "BulkReplaceServiceCatalogAssociations",
                        "https://docs.oracle.com/iaas/api/#/en/service-catalog/20210527/ServiceCatalogAssociation/BulkReplaceServiceCatalogAssociations")
                .method(com.oracle.bmc.http.client.Method.PUT)
                .requestBuilder(BulkReplaceServiceCatalogAssociationsRequest::builder)
                .basePath("/20210527")
                .appendPathParam("serviceCatalogs")
                .appendPathParam(request.getServiceCatalogId())
                .appendPathParam("actions")
                .appendPathParam("bulkReplaceAssociations")
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .hasBody()
                .handleResponseHeaderString(
                        "opc-request-id",
                        BulkReplaceServiceCatalogAssociationsResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ChangePrivateApplicationCompartmentResponse>
            changePrivateApplicationCompartment(
                    ChangePrivateApplicationCompartmentRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    ChangePrivateApplicationCompartmentRequest,
                                    ChangePrivateApplicationCompartmentResponse>
                            handler) {

        Validate.notBlank(
                request.getPrivateApplicationId(), "privateApplicationId must not be blank");
        Objects.requireNonNull(
                request.getChangePrivateApplicationCompartmentDetails(),
                "changePrivateApplicationCompartmentDetails is required");

        return clientCall(request, ChangePrivateApplicationCompartmentResponse::builder)
                .logger(LOG, "changePrivateApplicationCompartment")
                .serviceDetails(
                        "ServiceCatalog",
                        "ChangePrivateApplicationCompartment",
                        "https://docs.oracle.com/iaas/api/#/en/service-catalog/20210527/PrivateApplication/ChangePrivateApplicationCompartment")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(ChangePrivateApplicationCompartmentRequest::builder)
                .basePath("/20210527")
                .appendPathParam("privateApplications")
                .appendPathParam(request.getPrivateApplicationId())
                .appendPathParam("actions")
                .appendPathParam("changeCompartment")
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("if-match", request.getIfMatch())
                .hasBody()
                .handleResponseHeaderString(
                        "opc-request-id",
                        ChangePrivateApplicationCompartmentResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        ChangePrivateApplicationCompartmentResponse.Builder::opcWorkRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ChangeServiceCatalogCompartmentResponse>
            changeServiceCatalogCompartment(
                    ChangeServiceCatalogCompartmentRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    ChangeServiceCatalogCompartmentRequest,
                                    ChangeServiceCatalogCompartmentResponse>
                            handler) {

        Validate.notBlank(request.getServiceCatalogId(), "serviceCatalogId must not be blank");
        Objects.requireNonNull(
                request.getChangeServiceCatalogCompartmentDetails(),
                "changeServiceCatalogCompartmentDetails is required");

        return clientCall(request, ChangeServiceCatalogCompartmentResponse::builder)
                .logger(LOG, "changeServiceCatalogCompartment")
                .serviceDetails(
                        "ServiceCatalog",
                        "ChangeServiceCatalogCompartment",
                        "https://docs.oracle.com/iaas/api/#/en/service-catalog/20210527/ServiceCatalog/ChangeServiceCatalogCompartment")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(ChangeServiceCatalogCompartmentRequest::builder)
                .basePath("/20210527")
                .appendPathParam("serviceCatalogs")
                .appendPathParam(request.getServiceCatalogId())
                .appendPathParam("actions")
                .appendPathParam("changeCompartment")
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("if-match", request.getIfMatch())
                .hasBody()
                .handleResponseHeaderString(
                        "opc-request-id",
                        ChangeServiceCatalogCompartmentResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<CreatePrivateApplicationResponse> createPrivateApplication(
            CreatePrivateApplicationRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            CreatePrivateApplicationRequest, CreatePrivateApplicationResponse>
                    handler) {
        Objects.requireNonNull(
                request.getCreatePrivateApplicationDetails(),
                "createPrivateApplicationDetails is required");

        return clientCall(request, CreatePrivateApplicationResponse::builder)
                .logger(LOG, "createPrivateApplication")
                .serviceDetails(
                        "ServiceCatalog",
                        "CreatePrivateApplication",
                        "https://docs.oracle.com/iaas/api/#/en/service-catalog/20210527/PrivateApplication/CreatePrivateApplication")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(CreatePrivateApplicationRequest::builder)
                .basePath("/20210527")
                .appendPathParam("privateApplications")
                .accept("application/json")
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.servicecatalog.model.PrivateApplication.class,
                        CreatePrivateApplicationResponse.Builder::privateApplication)
                .handleResponseHeaderString(
                        "opc-request-id", CreatePrivateApplicationResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        CreatePrivateApplicationResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString("etag", CreatePrivateApplicationResponse.Builder::etag)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<CreateServiceCatalogResponse> createServiceCatalog(
            CreateServiceCatalogRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            CreateServiceCatalogRequest, CreateServiceCatalogResponse>
                    handler) {
        Objects.requireNonNull(
                request.getCreateServiceCatalogDetails(),
                "createServiceCatalogDetails is required");

        return clientCall(request, CreateServiceCatalogResponse::builder)
                .logger(LOG, "createServiceCatalog")
                .serviceDetails(
                        "ServiceCatalog",
                        "CreateServiceCatalog",
                        "https://docs.oracle.com/iaas/api/#/en/service-catalog/20210527/ServiceCatalog/CreateServiceCatalog")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(CreateServiceCatalogRequest::builder)
                .basePath("/20210527")
                .appendPathParam("serviceCatalogs")
                .accept("application/json")
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.servicecatalog.model.ServiceCatalog.class,
                        CreateServiceCatalogResponse.Builder::serviceCatalog)
                .handleResponseHeaderString(
                        "opc-request-id", CreateServiceCatalogResponse.Builder::opcRequestId)
                .handleResponseHeaderString("etag", CreateServiceCatalogResponse.Builder::etag)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<CreateServiceCatalogAssociationResponse>
            createServiceCatalogAssociation(
                    CreateServiceCatalogAssociationRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    CreateServiceCatalogAssociationRequest,
                                    CreateServiceCatalogAssociationResponse>
                            handler) {
        Objects.requireNonNull(
                request.getCreateServiceCatalogAssociationDetails(),
                "createServiceCatalogAssociationDetails is required");

        return clientCall(request, CreateServiceCatalogAssociationResponse::builder)
                .logger(LOG, "createServiceCatalogAssociation")
                .serviceDetails(
                        "ServiceCatalog",
                        "CreateServiceCatalogAssociation",
                        "https://docs.oracle.com/iaas/api/#/en/service-catalog/20210527/ServiceCatalogAssociation/CreateServiceCatalogAssociation")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(CreateServiceCatalogAssociationRequest::builder)
                .basePath("/20210527")
                .appendPathParam("serviceCatalogAssociations")
                .accept("application/json")
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.servicecatalog.model.ServiceCatalogAssociation.class,
                        CreateServiceCatalogAssociationResponse.Builder::serviceCatalogAssociation)
                .handleResponseHeaderString(
                        "opc-request-id",
                        CreateServiceCatalogAssociationResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "etag", CreateServiceCatalogAssociationResponse.Builder::etag)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<DeletePrivateApplicationResponse> deletePrivateApplication(
            DeletePrivateApplicationRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            DeletePrivateApplicationRequest, DeletePrivateApplicationResponse>
                    handler) {

        Validate.notBlank(
                request.getPrivateApplicationId(), "privateApplicationId must not be blank");

        return clientCall(request, DeletePrivateApplicationResponse::builder)
                .logger(LOG, "deletePrivateApplication")
                .serviceDetails(
                        "ServiceCatalog",
                        "DeletePrivateApplication",
                        "https://docs.oracle.com/iaas/api/#/en/service-catalog/20210527/PrivateApplication/DeletePrivateApplication")
                .method(com.oracle.bmc.http.client.Method.DELETE)
                .requestBuilder(DeletePrivateApplicationRequest::builder)
                .basePath("/20210527")
                .appendPathParam("privateApplications")
                .appendPathParam(request.getPrivateApplicationId())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleResponseHeaderString(
                        "opc-request-id", DeletePrivateApplicationResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        DeletePrivateApplicationResponse.Builder::opcWorkRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<DeleteServiceCatalogResponse> deleteServiceCatalog(
            DeleteServiceCatalogRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            DeleteServiceCatalogRequest, DeleteServiceCatalogResponse>
                    handler) {

        Validate.notBlank(request.getServiceCatalogId(), "serviceCatalogId must not be blank");

        return clientCall(request, DeleteServiceCatalogResponse::builder)
                .logger(LOG, "deleteServiceCatalog")
                .serviceDetails(
                        "ServiceCatalog",
                        "DeleteServiceCatalog",
                        "https://docs.oracle.com/iaas/api/#/en/service-catalog/20210527/ServiceCatalog/DeleteServiceCatalog")
                .method(com.oracle.bmc.http.client.Method.DELETE)
                .requestBuilder(DeleteServiceCatalogRequest::builder)
                .basePath("/20210527")
                .appendPathParam("serviceCatalogs")
                .appendPathParam(request.getServiceCatalogId())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleResponseHeaderString(
                        "opc-request-id", DeleteServiceCatalogResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<DeleteServiceCatalogAssociationResponse>
            deleteServiceCatalogAssociation(
                    DeleteServiceCatalogAssociationRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    DeleteServiceCatalogAssociationRequest,
                                    DeleteServiceCatalogAssociationResponse>
                            handler) {

        Validate.notBlank(
                request.getServiceCatalogAssociationId(),
                "serviceCatalogAssociationId must not be blank");

        return clientCall(request, DeleteServiceCatalogAssociationResponse::builder)
                .logger(LOG, "deleteServiceCatalogAssociation")
                .serviceDetails(
                        "ServiceCatalog",
                        "DeleteServiceCatalogAssociation",
                        "https://docs.oracle.com/iaas/api/#/en/service-catalog/20210527/ServiceCatalogAssociation/DeleteServiceCatalogAssociation")
                .method(com.oracle.bmc.http.client.Method.DELETE)
                .requestBuilder(DeleteServiceCatalogAssociationRequest::builder)
                .basePath("/20210527")
                .appendPathParam("serviceCatalogAssociations")
                .appendPathParam(request.getServiceCatalogAssociationId())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleResponseHeaderString(
                        "opc-request-id",
                        DeleteServiceCatalogAssociationResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<GetPrivateApplicationResponse> getPrivateApplication(
            GetPrivateApplicationRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            GetPrivateApplicationRequest, GetPrivateApplicationResponse>
                    handler) {

        Validate.notBlank(
                request.getPrivateApplicationId(), "privateApplicationId must not be blank");

        return clientCall(request, GetPrivateApplicationResponse::builder)
                .logger(LOG, "getPrivateApplication")
                .serviceDetails(
                        "ServiceCatalog",
                        "GetPrivateApplication",
                        "https://docs.oracle.com/iaas/api/#/en/service-catalog/20210527/PrivateApplication/GetPrivateApplication")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetPrivateApplicationRequest::builder)
                .basePath("/20210527")
                .appendPathParam("privateApplications")
                .appendPathParam(request.getPrivateApplicationId())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.servicecatalog.model.PrivateApplication.class,
                        GetPrivateApplicationResponse.Builder::privateApplication)
                .handleResponseHeaderString("etag", GetPrivateApplicationResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", GetPrivateApplicationResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<GetPrivateApplicationActionDownloadLogoResponse>
            getPrivateApplicationActionDownloadLogo(
                    GetPrivateApplicationActionDownloadLogoRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    GetPrivateApplicationActionDownloadLogoRequest,
                                    GetPrivateApplicationActionDownloadLogoResponse>
                            handler) {

        Validate.notBlank(
                request.getPrivateApplicationId(), "privateApplicationId must not be blank");

        return clientCall(request, GetPrivateApplicationActionDownloadLogoResponse::builder)
                .logger(LOG, "getPrivateApplicationActionDownloadLogo")
                .serviceDetails(
                        "ServiceCatalog",
                        "GetPrivateApplicationActionDownloadLogo",
                        "https://docs.oracle.com/iaas/api/#/en/service-catalog/20210527/PrivateApplication/GetPrivateApplicationActionDownloadLogo")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetPrivateApplicationActionDownloadLogoRequest::builder)
                .basePath("/20210527")
                .appendPathParam("privateApplications")
                .appendPathParam(request.getPrivateApplicationId())
                .appendPathParam("actions")
                .appendPathParam("downloadLogo")
                .accept("image/bmp", "image/gif", "image/jpeg", "image/png", "image/tiff")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        java.io.InputStream.class,
                        GetPrivateApplicationActionDownloadLogoResponse.Builder::inputStream)
                .handleResponseHeaderString(
                        "opc-request-id",
                        GetPrivateApplicationActionDownloadLogoResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<GetPrivateApplicationPackageResponse>
            getPrivateApplicationPackage(
                    GetPrivateApplicationPackageRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    GetPrivateApplicationPackageRequest,
                                    GetPrivateApplicationPackageResponse>
                            handler) {

        Validate.notBlank(
                request.getPrivateApplicationPackageId(),
                "privateApplicationPackageId must not be blank");

        return clientCall(request, GetPrivateApplicationPackageResponse::builder)
                .logger(LOG, "getPrivateApplicationPackage")
                .serviceDetails(
                        "ServiceCatalog",
                        "GetPrivateApplicationPackage",
                        "https://docs.oracle.com/iaas/api/#/en/service-catalog/20210527/PrivateApplicationPackage/GetPrivateApplicationPackage")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetPrivateApplicationPackageRequest::builder)
                .basePath("/20210527")
                .appendPathParam("privateApplicationPackages")
                .appendPathParam(request.getPrivateApplicationPackageId())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.servicecatalog.model.PrivateApplicationPackage.class,
                        GetPrivateApplicationPackageResponse.Builder::privateApplicationPackage)
                .handleResponseHeaderString(
                        "etag", GetPrivateApplicationPackageResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id",
                        GetPrivateApplicationPackageResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<GetPrivateApplicationPackageActionDownloadConfigResponse>
            getPrivateApplicationPackageActionDownloadConfig(
                    GetPrivateApplicationPackageActionDownloadConfigRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    GetPrivateApplicationPackageActionDownloadConfigRequest,
                                    GetPrivateApplicationPackageActionDownloadConfigResponse>
                            handler) {

        Validate.notBlank(
                request.getPrivateApplicationPackageId(),
                "privateApplicationPackageId must not be blank");

        return clientCall(
                        request, GetPrivateApplicationPackageActionDownloadConfigResponse::builder)
                .logger(LOG, "getPrivateApplicationPackageActionDownloadConfig")
                .serviceDetails(
                        "ServiceCatalog",
                        "GetPrivateApplicationPackageActionDownloadConfig",
                        "https://docs.oracle.com/iaas/api/#/en/service-catalog/20210527/PrivateApplicationPackage/GetPrivateApplicationPackageActionDownloadConfig")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetPrivateApplicationPackageActionDownloadConfigRequest::builder)
                .basePath("/20210527")
                .appendPathParam("privateApplicationPackages")
                .appendPathParam(request.getPrivateApplicationPackageId())
                .appendPathParam("actions")
                .appendPathParam("downloadConfig")
                .accept("application/zip")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        java.io.InputStream.class,
                        GetPrivateApplicationPackageActionDownloadConfigResponse.Builder
                                ::inputStream)
                .handleResponseHeaderString(
                        "opc-request-id",
                        GetPrivateApplicationPackageActionDownloadConfigResponse.Builder
                                ::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<GetServiceCatalogResponse> getServiceCatalog(
            GetServiceCatalogRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            GetServiceCatalogRequest, GetServiceCatalogResponse>
                    handler) {

        Validate.notBlank(request.getServiceCatalogId(), "serviceCatalogId must not be blank");

        return clientCall(request, GetServiceCatalogResponse::builder)
                .logger(LOG, "getServiceCatalog")
                .serviceDetails(
                        "ServiceCatalog",
                        "GetServiceCatalog",
                        "https://docs.oracle.com/iaas/api/#/en/service-catalog/20210527/ServiceCatalog/GetServiceCatalog")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetServiceCatalogRequest::builder)
                .basePath("/20210527")
                .appendPathParam("serviceCatalogs")
                .appendPathParam(request.getServiceCatalogId())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.servicecatalog.model.ServiceCatalog.class,
                        GetServiceCatalogResponse.Builder::serviceCatalog)
                .handleResponseHeaderString(
                        "opc-request-id", GetServiceCatalogResponse.Builder::opcRequestId)
                .handleResponseHeaderString("etag", GetServiceCatalogResponse.Builder::etag)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<GetServiceCatalogAssociationResponse>
            getServiceCatalogAssociation(
                    GetServiceCatalogAssociationRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    GetServiceCatalogAssociationRequest,
                                    GetServiceCatalogAssociationResponse>
                            handler) {

        Validate.notBlank(
                request.getServiceCatalogAssociationId(),
                "serviceCatalogAssociationId must not be blank");

        return clientCall(request, GetServiceCatalogAssociationResponse::builder)
                .logger(LOG, "getServiceCatalogAssociation")
                .serviceDetails(
                        "ServiceCatalog",
                        "GetServiceCatalogAssociation",
                        "https://docs.oracle.com/iaas/api/#/en/service-catalog/20210527/ServiceCatalogAssociation/GetServiceCatalogAssociation")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetServiceCatalogAssociationRequest::builder)
                .basePath("/20210527")
                .appendPathParam("serviceCatalogAssociations")
                .appendPathParam(request.getServiceCatalogAssociationId())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.servicecatalog.model.ServiceCatalogAssociation.class,
                        GetServiceCatalogAssociationResponse.Builder::serviceCatalogAssociation)
                .handleResponseHeaderString(
                        "opc-request-id",
                        GetServiceCatalogAssociationResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "etag", GetServiceCatalogAssociationResponse.Builder::etag)
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
                        "ServiceCatalog",
                        "GetWorkRequest",
                        "https://docs.oracle.com/iaas/api/#/en/service-catalog/20210527/WorkRequest/GetWorkRequest")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetWorkRequestRequest::builder)
                .basePath("/20210527")
                .appendPathParam("workRequests")
                .appendPathParam(request.getWorkRequestId())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.servicecatalog.model.WorkRequest.class,
                        GetWorkRequestResponse.Builder::workRequest)
                .handleResponseHeaderString("etag", GetWorkRequestResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", GetWorkRequestResponse.Builder::opcRequestId)
                .handleResponseHeaderInteger(
                        "retry-after", GetWorkRequestResponse.Builder::retryAfter)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ListApplicationsResponse> listApplications(
            ListApplicationsRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ListApplicationsRequest, ListApplicationsResponse>
                    handler) {

        return clientCall(request, ListApplicationsResponse::builder)
                .logger(LOG, "listApplications")
                .serviceDetails(
                        "ServiceCatalog",
                        "ListApplications",
                        "https://docs.oracle.com/iaas/api/#/en/service-catalog/20210527/ApplicationSummary/ListApplications")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListApplicationsRequest::builder)
                .basePath("/20210527")
                .appendPathParam("applications")
                .appendQueryParam("compartmentId", request.getCompartmentId())
                .appendQueryParam("serviceCatalogId", request.getServiceCatalogId())
                .appendQueryParam("entityType", request.getEntityType())
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .appendQueryParam("displayName", request.getDisplayName())
                .appendQueryParam("entityId", request.getEntityId())
                .appendListQueryParam(
                        "publisherId",
                        request.getPublisherId(),
                        com.oracle.bmc.util.internal.CollectionFormatType.Multi)
                .appendListQueryParam(
                        "packageType",
                        request.getPackageType(),
                        com.oracle.bmc.util.internal.CollectionFormatType.Multi)
                .appendListQueryParam(
                        "pricing",
                        request.getPricing(),
                        com.oracle.bmc.util.internal.CollectionFormatType.Multi)
                .appendQueryParam("isFeatured", request.getIsFeatured())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.servicecatalog.model.ApplicationCollection.class,
                        ListApplicationsResponse.Builder::applicationCollection)
                .handleResponseHeaderString(
                        "opc-request-id", ListApplicationsResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListApplicationsResponse.Builder::opcNextPage)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ListPrivateApplicationPackagesResponse>
            listPrivateApplicationPackages(
                    ListPrivateApplicationPackagesRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    ListPrivateApplicationPackagesRequest,
                                    ListPrivateApplicationPackagesResponse>
                            handler) {
        Objects.requireNonNull(
                request.getPrivateApplicationId(), "privateApplicationId is required");

        return clientCall(request, ListPrivateApplicationPackagesResponse::builder)
                .logger(LOG, "listPrivateApplicationPackages")
                .serviceDetails(
                        "ServiceCatalog",
                        "ListPrivateApplicationPackages",
                        "https://docs.oracle.com/iaas/api/#/en/service-catalog/20210527/PrivateApplicationPackage/ListPrivateApplicationPackages")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListPrivateApplicationPackagesRequest::builder)
                .basePath("/20210527")
                .appendPathParam("privateApplicationPackages")
                .appendQueryParam("privateApplicationId", request.getPrivateApplicationId())
                .appendQueryParam(
                        "privateApplicationPackageId", request.getPrivateApplicationPackageId())
                .appendListQueryParam(
                        "packageType",
                        request.getPackageType(),
                        com.oracle.bmc.util.internal.CollectionFormatType.Multi)
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .appendQueryParam("displayName", request.getDisplayName())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.servicecatalog.model.PrivateApplicationPackageCollection
                                .class,
                        ListPrivateApplicationPackagesResponse.Builder
                                ::privateApplicationPackageCollection)
                .handleResponseHeaderString(
                        "opc-request-id",
                        ListPrivateApplicationPackagesResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page",
                        ListPrivateApplicationPackagesResponse.Builder::opcNextPage)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ListPrivateApplicationsResponse> listPrivateApplications(
            ListPrivateApplicationsRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ListPrivateApplicationsRequest, ListPrivateApplicationsResponse>
                    handler) {
        Objects.requireNonNull(request.getCompartmentId(), "compartmentId is required");

        return clientCall(request, ListPrivateApplicationsResponse::builder)
                .logger(LOG, "listPrivateApplications")
                .serviceDetails(
                        "ServiceCatalog",
                        "ListPrivateApplications",
                        "https://docs.oracle.com/iaas/api/#/en/service-catalog/20210527/PrivateApplication/ListPrivateApplications")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListPrivateApplicationsRequest::builder)
                .basePath("/20210527")
                .appendPathParam("privateApplications")
                .appendQueryParam("compartmentId", request.getCompartmentId())
                .appendQueryParam("privateApplicationId", request.getPrivateApplicationId())
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .appendQueryParam("displayName", request.getDisplayName())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.servicecatalog.model.PrivateApplicationCollection.class,
                        ListPrivateApplicationsResponse.Builder::privateApplicationCollection)
                .handleResponseHeaderString(
                        "opc-request-id", ListPrivateApplicationsResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListPrivateApplicationsResponse.Builder::opcNextPage)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ListServiceCatalogAssociationsResponse>
            listServiceCatalogAssociations(
                    ListServiceCatalogAssociationsRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    ListServiceCatalogAssociationsRequest,
                                    ListServiceCatalogAssociationsResponse>
                            handler) {

        return clientCall(request, ListServiceCatalogAssociationsResponse::builder)
                .logger(LOG, "listServiceCatalogAssociations")
                .serviceDetails(
                        "ServiceCatalog",
                        "ListServiceCatalogAssociations",
                        "https://docs.oracle.com/iaas/api/#/en/service-catalog/20210527/ServiceCatalogAssociation/ListServiceCatalogAssociations")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListServiceCatalogAssociationsRequest::builder)
                .basePath("/20210527")
                .appendPathParam("serviceCatalogAssociations")
                .appendQueryParam(
                        "serviceCatalogAssociationId", request.getServiceCatalogAssociationId())
                .appendQueryParam("serviceCatalogId", request.getServiceCatalogId())
                .appendQueryParam("entityId", request.getEntityId())
                .appendQueryParam("entityType", request.getEntityType())
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.servicecatalog.model.ServiceCatalogAssociationCollection
                                .class,
                        ListServiceCatalogAssociationsResponse.Builder
                                ::serviceCatalogAssociationCollection)
                .handleResponseHeaderString(
                        "opc-request-id",
                        ListServiceCatalogAssociationsResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page",
                        ListServiceCatalogAssociationsResponse.Builder::opcNextPage)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ListServiceCatalogsResponse> listServiceCatalogs(
            ListServiceCatalogsRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ListServiceCatalogsRequest, ListServiceCatalogsResponse>
                    handler) {
        Objects.requireNonNull(request.getCompartmentId(), "compartmentId is required");

        return clientCall(request, ListServiceCatalogsResponse::builder)
                .logger(LOG, "listServiceCatalogs")
                .serviceDetails(
                        "ServiceCatalog",
                        "ListServiceCatalogs",
                        "https://docs.oracle.com/iaas/api/#/en/service-catalog/20210527/ServiceCatalog/ListServiceCatalogs")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListServiceCatalogsRequest::builder)
                .basePath("/20210527")
                .appendPathParam("serviceCatalogs")
                .appendQueryParam("compartmentId", request.getCompartmentId())
                .appendQueryParam("serviceCatalogId", request.getServiceCatalogId())
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .appendQueryParam("displayName", request.getDisplayName())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.servicecatalog.model.ServiceCatalogCollection.class,
                        ListServiceCatalogsResponse.Builder::serviceCatalogCollection)
                .handleResponseHeaderString(
                        "opc-request-id", ListServiceCatalogsResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListServiceCatalogsResponse.Builder::opcNextPage)
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
                        "ServiceCatalog",
                        "ListWorkRequestErrors",
                        "https://docs.oracle.com/iaas/api/#/en/service-catalog/20210527/WorkRequestError/ListWorkRequestErrors")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListWorkRequestErrorsRequest::builder)
                .basePath("/20210527")
                .appendPathParam("workRequests")
                .appendPathParam(request.getWorkRequestId())
                .appendPathParam("errors")
                .appendQueryParam("page", request.getPage())
                .appendQueryParam("limit", request.getLimit())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.servicecatalog.model.WorkRequestErrorCollection.class,
                        ListWorkRequestErrorsResponse.Builder::workRequestErrorCollection)
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
                        "ServiceCatalog",
                        "ListWorkRequestLogs",
                        "https://docs.oracle.com/iaas/api/#/en/service-catalog/20210527/WorkRequestLogEntry/ListWorkRequestLogs")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListWorkRequestLogsRequest::builder)
                .basePath("/20210527")
                .appendPathParam("workRequests")
                .appendPathParam(request.getWorkRequestId())
                .appendPathParam("logs")
                .appendQueryParam("page", request.getPage())
                .appendQueryParam("limit", request.getLimit())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.servicecatalog.model.WorkRequestLogEntryCollection.class,
                        ListWorkRequestLogsResponse.Builder::workRequestLogEntryCollection)
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

        return clientCall(request, ListWorkRequestsResponse::builder)
                .logger(LOG, "listWorkRequests")
                .serviceDetails(
                        "ServiceCatalog",
                        "ListWorkRequests",
                        "https://docs.oracle.com/iaas/api/#/en/service-catalog/20210527/WorkRequest/ListWorkRequests")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListWorkRequestsRequest::builder)
                .basePath("/20210527")
                .appendPathParam("workRequests")
                .appendQueryParam("compartmentId", request.getCompartmentId())
                .appendQueryParam("workRequestId", request.getWorkRequestId())
                .appendEnumQueryParam("status", request.getStatus())
                .appendQueryParam("resourceId", request.getResourceId())
                .appendQueryParam("page", request.getPage())
                .appendQueryParam("limit", request.getLimit())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.servicecatalog.model.WorkRequestSummaryCollection.class,
                        ListWorkRequestsResponse.Builder::workRequestSummaryCollection)
                .handleResponseHeaderString(
                        "opc-request-id", ListWorkRequestsResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListWorkRequestsResponse.Builder::opcNextPage)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<UpdatePrivateApplicationResponse> updatePrivateApplication(
            UpdatePrivateApplicationRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            UpdatePrivateApplicationRequest, UpdatePrivateApplicationResponse>
                    handler) {

        Validate.notBlank(
                request.getPrivateApplicationId(), "privateApplicationId must not be blank");
        Objects.requireNonNull(
                request.getUpdatePrivateApplicationDetails(),
                "updatePrivateApplicationDetails is required");

        return clientCall(request, UpdatePrivateApplicationResponse::builder)
                .logger(LOG, "updatePrivateApplication")
                .serviceDetails(
                        "ServiceCatalog",
                        "UpdatePrivateApplication",
                        "https://docs.oracle.com/iaas/api/#/en/service-catalog/20210527/PrivateApplication/UpdatePrivateApplication")
                .method(com.oracle.bmc.http.client.Method.PUT)
                .requestBuilder(UpdatePrivateApplicationRequest::builder)
                .basePath("/20210527")
                .appendPathParam("privateApplications")
                .appendPathParam(request.getPrivateApplicationId())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("if-match", request.getIfMatch())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.servicecatalog.model.PrivateApplication.class,
                        UpdatePrivateApplicationResponse.Builder::privateApplication)
                .handleResponseHeaderString(
                        "opc-request-id", UpdatePrivateApplicationResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        UpdatePrivateApplicationResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString("etag", UpdatePrivateApplicationResponse.Builder::etag)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<UpdateServiceCatalogResponse> updateServiceCatalog(
            UpdateServiceCatalogRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            UpdateServiceCatalogRequest, UpdateServiceCatalogResponse>
                    handler) {

        Validate.notBlank(request.getServiceCatalogId(), "serviceCatalogId must not be blank");
        Objects.requireNonNull(
                request.getUpdateServiceCatalogDetails(),
                "updateServiceCatalogDetails is required");

        return clientCall(request, UpdateServiceCatalogResponse::builder)
                .logger(LOG, "updateServiceCatalog")
                .serviceDetails(
                        "ServiceCatalog",
                        "UpdateServiceCatalog",
                        "https://docs.oracle.com/iaas/api/#/en/service-catalog/20210527/ServiceCatalog/UpdateServiceCatalog")
                .method(com.oracle.bmc.http.client.Method.PUT)
                .requestBuilder(UpdateServiceCatalogRequest::builder)
                .basePath("/20210527")
                .appendPathParam("serviceCatalogs")
                .appendPathParam(request.getServiceCatalogId())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("if-match", request.getIfMatch())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.servicecatalog.model.ServiceCatalog.class,
                        UpdateServiceCatalogResponse.Builder::serviceCatalog)
                .handleResponseHeaderString(
                        "opc-request-id", UpdateServiceCatalogResponse.Builder::opcRequestId)
                .handleResponseHeaderString("etag", UpdateServiceCatalogResponse.Builder::etag)
                .callAsync(handler);
    }

    /**
     * Create a new client instance.
     *
     * @param authenticationDetailsProvider The authentication details (see {@link Builder#build})
     * @deprecated Use the {@link #builder() builder} instead.
     */
    @Deprecated
    public ServiceCatalogAsyncClient(
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
    public ServiceCatalogAsyncClient(
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
    public ServiceCatalogAsyncClient(
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
    public ServiceCatalogAsyncClient(
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
    public ServiceCatalogAsyncClient(
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
    public ServiceCatalogAsyncClient(
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
    public ServiceCatalogAsyncClient(
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
