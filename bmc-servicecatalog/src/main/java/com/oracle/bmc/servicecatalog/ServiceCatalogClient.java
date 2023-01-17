/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.servicecatalog;

import com.oracle.bmc.util.internal.Validate;
import com.oracle.bmc.servicecatalog.requests.*;
import com.oracle.bmc.servicecatalog.responses.*;
import com.oracle.bmc.circuitbreaker.CircuitBreakerConfiguration;
import com.oracle.bmc.util.CircuitBreakerUtils;

import java.util.Objects;

@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20210527")
public class ServiceCatalogClient extends com.oracle.bmc.http.internal.BaseSyncClient
        implements ServiceCatalog {
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

    private final ServiceCatalogWaiters waiters;

    private final ServiceCatalogPaginators paginators;

    private ServiceCatalogClient(
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
                                    .nameFormat("ServiceCatalog-waiters-%d")
                                    .build());
            threadPoolExecutor.allowCoreThreadTimeOut(true);

            executorService = threadPoolExecutor;
        }
        this.waiters = new ServiceCatalogWaiters(executorService, this);

        this.paginators = new ServiceCatalogPaginators(this);
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
            extends com.oracle.bmc.common.RegionalClientBuilder<Builder, ServiceCatalogClient> {
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
        public ServiceCatalogClient build(
                @javax.annotation.Nonnull
                        com.oracle.bmc.auth.AbstractAuthenticationDetailsProvider
                                authenticationDetailsProvider) {
            return new ServiceCatalogClient(this, authenticationDetailsProvider, executorService);
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
    public BulkReplaceServiceCatalogAssociationsResponse bulkReplaceServiceCatalogAssociations(
            BulkReplaceServiceCatalogAssociationsRequest request) {

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
                .callSync();
    }

    @Override
    public ChangePrivateApplicationCompartmentResponse changePrivateApplicationCompartment(
            ChangePrivateApplicationCompartmentRequest request) {

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
                .callSync();
    }

    @Override
    public ChangeServiceCatalogCompartmentResponse changeServiceCatalogCompartment(
            ChangeServiceCatalogCompartmentRequest request) {

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
                .callSync();
    }

    @Override
    public CreatePrivateApplicationResponse createPrivateApplication(
            CreatePrivateApplicationRequest request) {
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
                .callSync();
    }

    @Override
    public CreateServiceCatalogResponse createServiceCatalog(CreateServiceCatalogRequest request) {
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
                .callSync();
    }

    @Override
    public CreateServiceCatalogAssociationResponse createServiceCatalogAssociation(
            CreateServiceCatalogAssociationRequest request) {
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
                .callSync();
    }

    @Override
    public DeletePrivateApplicationResponse deletePrivateApplication(
            DeletePrivateApplicationRequest request) {

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
                .callSync();
    }

    @Override
    public DeleteServiceCatalogResponse deleteServiceCatalog(DeleteServiceCatalogRequest request) {

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
                .callSync();
    }

    @Override
    public DeleteServiceCatalogAssociationResponse deleteServiceCatalogAssociation(
            DeleteServiceCatalogAssociationRequest request) {

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
                .callSync();
    }

    @Override
    public GetPrivateApplicationResponse getPrivateApplication(
            GetPrivateApplicationRequest request) {

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
                .callSync();
    }

    @Override
    public GetPrivateApplicationActionDownloadLogoResponse getPrivateApplicationActionDownloadLogo(
            GetPrivateApplicationActionDownloadLogoRequest request) {

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
                .callSync();
    }

    @Override
    public GetPrivateApplicationPackageResponse getPrivateApplicationPackage(
            GetPrivateApplicationPackageRequest request) {

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
                .callSync();
    }

    @Override
    public GetPrivateApplicationPackageActionDownloadConfigResponse
            getPrivateApplicationPackageActionDownloadConfig(
                    GetPrivateApplicationPackageActionDownloadConfigRequest request) {

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
                .callSync();
    }

    @Override
    public GetServiceCatalogResponse getServiceCatalog(GetServiceCatalogRequest request) {

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
                .callSync();
    }

    @Override
    public GetServiceCatalogAssociationResponse getServiceCatalogAssociation(
            GetServiceCatalogAssociationRequest request) {

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
                .callSync();
    }

    @Override
    public GetWorkRequestResponse getWorkRequest(GetWorkRequestRequest request) {

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
                .callSync();
    }

    @Override
    public ListApplicationsResponse listApplications(ListApplicationsRequest request) {

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
                .callSync();
    }

    @Override
    public ListPrivateApplicationPackagesResponse listPrivateApplicationPackages(
            ListPrivateApplicationPackagesRequest request) {
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
                .callSync();
    }

    @Override
    public ListPrivateApplicationsResponse listPrivateApplications(
            ListPrivateApplicationsRequest request) {
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
                .callSync();
    }

    @Override
    public ListServiceCatalogAssociationsResponse listServiceCatalogAssociations(
            ListServiceCatalogAssociationsRequest request) {

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
                .callSync();
    }

    @Override
    public ListServiceCatalogsResponse listServiceCatalogs(ListServiceCatalogsRequest request) {
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
                .callSync();
    }

    @Override
    public ListWorkRequestErrorsResponse listWorkRequestErrors(
            ListWorkRequestErrorsRequest request) {

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
                .callSync();
    }

    @Override
    public ListWorkRequestLogsResponse listWorkRequestLogs(ListWorkRequestLogsRequest request) {

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
                .callSync();
    }

    @Override
    public ListWorkRequestsResponse listWorkRequests(ListWorkRequestsRequest request) {

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
                .callSync();
    }

    @Override
    public UpdatePrivateApplicationResponse updatePrivateApplication(
            UpdatePrivateApplicationRequest request) {

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
                .callSync();
    }

    @Override
    public UpdateServiceCatalogResponse updateServiceCatalog(UpdateServiceCatalogRequest request) {

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
                .callSync();
    }

    @Override
    public ServiceCatalogWaiters getWaiters() {
        return waiters;
    }

    @Override
    public ServiceCatalogPaginators getPaginators() {
        return paginators;
    }

    /**
     * Create a new client instance.
     *
     * @param authenticationDetailsProvider The authentication details (see {@link Builder#build})
     * @deprecated Use the {@link #builder() builder} instead.
     */
    @Deprecated
    public ServiceCatalogClient(
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
    public ServiceCatalogClient(
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
    public ServiceCatalogClient(
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
    public ServiceCatalogClient(
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
    public ServiceCatalogClient(
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
    public ServiceCatalogClient(
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
    public ServiceCatalogClient(
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
    public ServiceCatalogClient(
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
