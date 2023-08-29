/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.licensemanager;

import com.oracle.bmc.util.internal.Validate;
import com.oracle.bmc.licensemanager.requests.*;
import com.oracle.bmc.licensemanager.responses.*;

import java.util.Objects;

/**
 * Async client implementation for LicenseManager service. <br>
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
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20220430")
public class LicenseManagerAsyncClient extends com.oracle.bmc.http.internal.BaseAsyncClient
        implements LicenseManagerAsync {
    /** Service instance for LicenseManager. */
    public static final com.oracle.bmc.Service SERVICE =
            com.oracle.bmc.Services.serviceBuilder()
                    .serviceName("LICENSEMANAGER")
                    .serviceEndpointPrefix("")
                    .serviceEndpointTemplate(
                            "https://licensemanager.{region}.oci.{secondLevelDomain}")
                    .build();

    private static final org.slf4j.Logger LOG =
            org.slf4j.LoggerFactory.getLogger(LicenseManagerAsyncClient.class);

    LicenseManagerAsyncClient(
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
                    Builder, LicenseManagerAsyncClient> {
        private Builder(com.oracle.bmc.Service service) {
            super(service);
            final String packageName = "licensemanager";
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
        public LicenseManagerAsyncClient build(
                @jakarta.annotation.Nonnull
                        com.oracle.bmc.auth.AbstractAuthenticationDetailsProvider
                                authenticationDetailsProvider) {
            return new LicenseManagerAsyncClient(this, authenticationDetailsProvider);
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
    public java.util.concurrent.Future<BulkUploadLicenseRecordsResponse> bulkUploadLicenseRecords(
            BulkUploadLicenseRecordsRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            BulkUploadLicenseRecordsRequest, BulkUploadLicenseRecordsResponse>
                    handler) {
        Objects.requireNonNull(
                request.getBulkUploadLicenseRecordsDetails(),
                "bulkUploadLicenseRecordsDetails is required");

        return clientCall(request, BulkUploadLicenseRecordsResponse::builder)
                .logger(LOG, "bulkUploadLicenseRecords")
                .serviceDetails(
                        "LicenseManager",
                        "BulkUploadLicenseRecords",
                        "https://docs.oracle.com/iaas/api/#/en/licensemanager/20220430/BulkUploadLicenseRecordsDetails/BulkUploadLicenseRecords")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(BulkUploadLicenseRecordsRequest::builder)
                .basePath("/20220430")
                .appendPathParam("licenses")
                .appendPathParam("actions")
                .appendPathParam("bulkUpload")
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.licensemanager.model.BulkUploadResponse.class,
                        BulkUploadLicenseRecordsResponse.Builder::bulkUploadResponse)
                .handleResponseHeaderString(
                        "opc-request-id", BulkUploadLicenseRecordsResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<CreateLicenseRecordResponse> createLicenseRecord(
            CreateLicenseRecordRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            CreateLicenseRecordRequest, CreateLicenseRecordResponse>
                    handler) {
        Objects.requireNonNull(
                request.getCreateLicenseRecordDetails(), "createLicenseRecordDetails is required");

        Objects.requireNonNull(request.getProductLicenseId(), "productLicenseId is required");

        return clientCall(request, CreateLicenseRecordResponse::builder)
                .logger(LOG, "createLicenseRecord")
                .serviceDetails(
                        "LicenseManager",
                        "CreateLicenseRecord",
                        "https://docs.oracle.com/iaas/api/#/en/licensemanager/20220430/LicenseRecord/CreateLicenseRecord")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(CreateLicenseRecordRequest::builder)
                .basePath("/20220430")
                .appendPathParam("licenseRecords")
                .appendQueryParam("productLicenseId", request.getProductLicenseId())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.licensemanager.model.LicenseRecord.class,
                        CreateLicenseRecordResponse.Builder::licenseRecord)
                .handleResponseHeaderString("etag", CreateLicenseRecordResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        CreateLicenseRecordResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", CreateLicenseRecordResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "location", CreateLicenseRecordResponse.Builder::location)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<CreateProductLicenseResponse> createProductLicense(
            CreateProductLicenseRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            CreateProductLicenseRequest, CreateProductLicenseResponse>
                    handler) {
        Objects.requireNonNull(
                request.getCreateProductLicenseDetails(),
                "createProductLicenseDetails is required");

        return clientCall(request, CreateProductLicenseResponse::builder)
                .logger(LOG, "createProductLicense")
                .serviceDetails(
                        "LicenseManager",
                        "CreateProductLicense",
                        "https://docs.oracle.com/iaas/api/#/en/licensemanager/20220430/ProductLicense/CreateProductLicense")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(CreateProductLicenseRequest::builder)
                .basePath("/20220430")
                .appendPathParam("productLicenses")
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.licensemanager.model.ProductLicense.class,
                        CreateProductLicenseResponse.Builder::productLicense)
                .handleResponseHeaderString("etag", CreateProductLicenseResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        CreateProductLicenseResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", CreateProductLicenseResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "location", CreateProductLicenseResponse.Builder::location)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<DeleteLicenseRecordResponse> deleteLicenseRecord(
            DeleteLicenseRecordRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            DeleteLicenseRecordRequest, DeleteLicenseRecordResponse>
                    handler) {

        Validate.notBlank(request.getLicenseRecordId(), "licenseRecordId must not be blank");

        return clientCall(request, DeleteLicenseRecordResponse::builder)
                .logger(LOG, "deleteLicenseRecord")
                .serviceDetails(
                        "LicenseManager",
                        "DeleteLicenseRecord",
                        "https://docs.oracle.com/iaas/api/#/en/licensemanager/20220430/LicenseRecord/DeleteLicenseRecord")
                .method(com.oracle.bmc.http.client.Method.DELETE)
                .requestBuilder(DeleteLicenseRecordRequest::builder)
                .basePath("/20220430")
                .appendPathParam("licenseRecords")
                .appendPathParam(request.getLicenseRecordId())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("if-match", request.getIfMatch())
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        DeleteLicenseRecordResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", DeleteLicenseRecordResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "location", DeleteLicenseRecordResponse.Builder::location)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<DeleteProductLicenseResponse> deleteProductLicense(
            DeleteProductLicenseRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            DeleteProductLicenseRequest, DeleteProductLicenseResponse>
                    handler) {

        Validate.notBlank(request.getProductLicenseId(), "productLicenseId must not be blank");

        return clientCall(request, DeleteProductLicenseResponse::builder)
                .logger(LOG, "deleteProductLicense")
                .serviceDetails(
                        "LicenseManager",
                        "DeleteProductLicense",
                        "https://docs.oracle.com/iaas/api/#/en/licensemanager/20220430/ProductLicense/DeleteProductLicense")
                .method(com.oracle.bmc.http.client.Method.DELETE)
                .requestBuilder(DeleteProductLicenseRequest::builder)
                .basePath("/20220430")
                .appendPathParam("productLicenses")
                .appendPathParam(request.getProductLicenseId())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("if-match", request.getIfMatch())
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        DeleteProductLicenseResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", DeleteProductLicenseResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "location", DeleteProductLicenseResponse.Builder::location)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<GetBulkUploadTemplateResponse> getBulkUploadTemplate(
            GetBulkUploadTemplateRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            GetBulkUploadTemplateRequest, GetBulkUploadTemplateResponse>
                    handler) {

        return clientCall(request, GetBulkUploadTemplateResponse::builder)
                .logger(LOG, "getBulkUploadTemplate")
                .serviceDetails(
                        "LicenseManager",
                        "GetBulkUploadTemplate",
                        "https://docs.oracle.com/iaas/api/#/en/licensemanager/20220430/BulkUploadTemplate/GetBulkUploadTemplate")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetBulkUploadTemplateRequest::builder)
                .basePath("/20220430")
                .appendPathParam("licenses")
                .appendPathParam("actions")
                .appendPathParam("bulkUploadTemplate")
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.licensemanager.model.BulkUploadTemplate.class,
                        GetBulkUploadTemplateResponse.Builder::bulkUploadTemplate)
                .handleResponseHeaderString(
                        "opc-request-id", GetBulkUploadTemplateResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", GetBulkUploadTemplateResponse.Builder::opcNextPage)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<GetConfigurationResponse> getConfiguration(
            GetConfigurationRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            GetConfigurationRequest, GetConfigurationResponse>
                    handler) {
        Objects.requireNonNull(request.getCompartmentId(), "compartmentId is required");

        return clientCall(request, GetConfigurationResponse::builder)
                .logger(LOG, "getConfiguration")
                .serviceDetails(
                        "LicenseManager",
                        "GetConfiguration",
                        "https://docs.oracle.com/iaas/api/#/en/licensemanager/20220430/Configuration/GetConfiguration")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetConfigurationRequest::builder)
                .basePath("/20220430")
                .appendPathParam("configuration")
                .appendQueryParam("compartmentId", request.getCompartmentId())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.licensemanager.model.Configuration.class,
                        GetConfigurationResponse.Builder::configuration)
                .handleResponseHeaderString("etag", GetConfigurationResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", GetConfigurationResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<GetLicenseMetricResponse> getLicenseMetric(
            GetLicenseMetricRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            GetLicenseMetricRequest, GetLicenseMetricResponse>
                    handler) {
        Objects.requireNonNull(request.getCompartmentId(), "compartmentId is required");

        return clientCall(request, GetLicenseMetricResponse::builder)
                .logger(LOG, "getLicenseMetric")
                .serviceDetails(
                        "LicenseManager",
                        "GetLicenseMetric",
                        "https://docs.oracle.com/iaas/api/#/en/licensemanager/20220430/LicenseMetric/GetLicenseMetric")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetLicenseMetricRequest::builder)
                .basePath("/20220430")
                .appendPathParam("licenseMetrics")
                .appendQueryParam("compartmentId", request.getCompartmentId())
                .appendQueryParam("isCompartmentIdInSubtree", request.getIsCompartmentIdInSubtree())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.licensemanager.model.LicenseMetric.class,
                        GetLicenseMetricResponse.Builder::licenseMetric)
                .handleResponseHeaderString("etag", GetLicenseMetricResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", GetLicenseMetricResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<GetLicenseRecordResponse> getLicenseRecord(
            GetLicenseRecordRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            GetLicenseRecordRequest, GetLicenseRecordResponse>
                    handler) {

        Validate.notBlank(request.getLicenseRecordId(), "licenseRecordId must not be blank");

        return clientCall(request, GetLicenseRecordResponse::builder)
                .logger(LOG, "getLicenseRecord")
                .serviceDetails(
                        "LicenseManager",
                        "GetLicenseRecord",
                        "https://docs.oracle.com/iaas/api/#/en/licensemanager/20220430/LicenseRecord/GetLicenseRecord")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetLicenseRecordRequest::builder)
                .basePath("/20220430")
                .appendPathParam("licenseRecords")
                .appendPathParam(request.getLicenseRecordId())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.licensemanager.model.LicenseRecord.class,
                        GetLicenseRecordResponse.Builder::licenseRecord)
                .handleResponseHeaderString("etag", GetLicenseRecordResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", GetLicenseRecordResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<GetProductLicenseResponse> getProductLicense(
            GetProductLicenseRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            GetProductLicenseRequest, GetProductLicenseResponse>
                    handler) {

        Validate.notBlank(request.getProductLicenseId(), "productLicenseId must not be blank");

        return clientCall(request, GetProductLicenseResponse::builder)
                .logger(LOG, "getProductLicense")
                .serviceDetails(
                        "LicenseManager",
                        "GetProductLicense",
                        "https://docs.oracle.com/iaas/api/#/en/licensemanager/20220430/ProductLicense/GetProductLicense")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetProductLicenseRequest::builder)
                .basePath("/20220430")
                .appendPathParam("productLicenses")
                .appendPathParam(request.getProductLicenseId())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.licensemanager.model.ProductLicense.class,
                        GetProductLicenseResponse.Builder::productLicense)
                .handleResponseHeaderString("etag", GetProductLicenseResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", GetProductLicenseResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ListLicenseRecordsResponse> listLicenseRecords(
            ListLicenseRecordsRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ListLicenseRecordsRequest, ListLicenseRecordsResponse>
                    handler) {
        Objects.requireNonNull(request.getProductLicenseId(), "productLicenseId is required");

        return clientCall(request, ListLicenseRecordsResponse::builder)
                .logger(LOG, "listLicenseRecords")
                .serviceDetails(
                        "LicenseManager",
                        "ListLicenseRecords",
                        "https://docs.oracle.com/iaas/api/#/en/licensemanager/20220430/LicenseRecordCollection/ListLicenseRecords")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListLicenseRecordsRequest::builder)
                .basePath("/20220430")
                .appendPathParam("licenseRecords")
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .appendQueryParam("productLicenseId", request.getProductLicenseId())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.licensemanager.model.LicenseRecordCollection.class,
                        ListLicenseRecordsResponse.Builder::licenseRecordCollection)
                .handleResponseHeaderString(
                        "opc-request-id", ListLicenseRecordsResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListLicenseRecordsResponse.Builder::opcNextPage)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ListProductLicenseConsumersResponse>
            listProductLicenseConsumers(
                    ListProductLicenseConsumersRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    ListProductLicenseConsumersRequest,
                                    ListProductLicenseConsumersResponse>
                            handler) {
        Objects.requireNonNull(request.getProductLicenseId(), "productLicenseId is required");

        Objects.requireNonNull(request.getCompartmentId(), "compartmentId is required");

        return clientCall(request, ListProductLicenseConsumersResponse::builder)
                .logger(LOG, "listProductLicenseConsumers")
                .serviceDetails(
                        "LicenseManager",
                        "ListProductLicenseConsumers",
                        "https://docs.oracle.com/iaas/api/#/en/licensemanager/20220430/ProductLicenseConsumerCollection/ListProductLicenseConsumers")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListProductLicenseConsumersRequest::builder)
                .basePath("/20220430")
                .appendPathParam("productLicenseConsumers")
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .appendQueryParam("productLicenseId", request.getProductLicenseId())
                .appendQueryParam("compartmentId", request.getCompartmentId())
                .appendQueryParam("isCompartmentIdInSubtree", request.getIsCompartmentIdInSubtree())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.licensemanager.model.ProductLicenseConsumerCollection.class,
                        ListProductLicenseConsumersResponse.Builder
                                ::productLicenseConsumerCollection)
                .handleResponseHeaderString(
                        "opc-request-id", ListProductLicenseConsumersResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListProductLicenseConsumersResponse.Builder::opcNextPage)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ListProductLicensesResponse> listProductLicenses(
            ListProductLicensesRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ListProductLicensesRequest, ListProductLicensesResponse>
                    handler) {
        Objects.requireNonNull(request.getCompartmentId(), "compartmentId is required");

        return clientCall(request, ListProductLicensesResponse::builder)
                .logger(LOG, "listProductLicenses")
                .serviceDetails(
                        "LicenseManager",
                        "ListProductLicenses",
                        "https://docs.oracle.com/iaas/api/#/en/licensemanager/20220430/ProductLicenseCollection/ListProductLicenses")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListProductLicensesRequest::builder)
                .basePath("/20220430")
                .appendPathParam("productLicenses")
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .appendQueryParam("compartmentId", request.getCompartmentId())
                .appendQueryParam("isCompartmentIdInSubtree", request.getIsCompartmentIdInSubtree())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.licensemanager.model.ProductLicenseCollection.class,
                        ListProductLicensesResponse.Builder::productLicenseCollection)
                .handleResponseHeaderString(
                        "opc-request-id", ListProductLicensesResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListProductLicensesResponse.Builder::opcNextPage)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ListTopUtilizedProductLicensesResponse>
            listTopUtilizedProductLicenses(
                    ListTopUtilizedProductLicensesRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    ListTopUtilizedProductLicensesRequest,
                                    ListTopUtilizedProductLicensesResponse>
                            handler) {
        Objects.requireNonNull(request.getCompartmentId(), "compartmentId is required");

        return clientCall(request, ListTopUtilizedProductLicensesResponse::builder)
                .logger(LOG, "listTopUtilizedProductLicenses")
                .serviceDetails(
                        "LicenseManager",
                        "ListTopUtilizedProductLicenses",
                        "https://docs.oracle.com/iaas/api/#/en/licensemanager/20220430/TopUtilizedProductLicenseCollection/ListTopUtilizedProductLicenses")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListTopUtilizedProductLicensesRequest::builder)
                .basePath("/20220430")
                .appendPathParam("topUtilizedProductLicenses")
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .appendQueryParam("compartmentId", request.getCompartmentId())
                .appendQueryParam("isCompartmentIdInSubtree", request.getIsCompartmentIdInSubtree())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.licensemanager.model.TopUtilizedProductLicenseCollection
                                .class,
                        ListTopUtilizedProductLicensesResponse.Builder
                                ::topUtilizedProductLicenseCollection)
                .handleResponseHeaderString(
                        "opc-request-id",
                        ListTopUtilizedProductLicensesResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page",
                        ListTopUtilizedProductLicensesResponse.Builder::opcNextPage)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ListTopUtilizedResourcesResponse> listTopUtilizedResources(
            ListTopUtilizedResourcesRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ListTopUtilizedResourcesRequest, ListTopUtilizedResourcesResponse>
                    handler) {
        Objects.requireNonNull(request.getCompartmentId(), "compartmentId is required");

        return clientCall(request, ListTopUtilizedResourcesResponse::builder)
                .logger(LOG, "listTopUtilizedResources")
                .serviceDetails(
                        "LicenseManager",
                        "ListTopUtilizedResources",
                        "https://docs.oracle.com/iaas/api/#/en/licensemanager/20220430/TopUtilizedResourceCollection/ListTopUtilizedResources")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListTopUtilizedResourcesRequest::builder)
                .basePath("/20220430")
                .appendPathParam("topUtilizedResources")
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .appendQueryParam("compartmentId", request.getCompartmentId())
                .appendQueryParam("isCompartmentIdInSubtree", request.getIsCompartmentIdInSubtree())
                .appendEnumQueryParam("resourceUnitType", request.getResourceUnitType())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.licensemanager.model.TopUtilizedResourceCollection.class,
                        ListTopUtilizedResourcesResponse.Builder::topUtilizedResourceCollection)
                .handleResponseHeaderString(
                        "opc-request-id", ListTopUtilizedResourcesResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListTopUtilizedResourcesResponse.Builder::opcNextPage)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<UpdateConfigurationResponse> updateConfiguration(
            UpdateConfigurationRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            UpdateConfigurationRequest, UpdateConfigurationResponse>
                    handler) {
        Objects.requireNonNull(request.getCompartmentId(), "compartmentId is required");

        Objects.requireNonNull(
                request.getUpdateConfigurationDetails(), "updateConfigurationDetails is required");

        return clientCall(request, UpdateConfigurationResponse::builder)
                .logger(LOG, "updateConfiguration")
                .serviceDetails(
                        "LicenseManager",
                        "UpdateConfiguration",
                        "https://docs.oracle.com/iaas/api/#/en/licensemanager/20220430/Configuration/UpdateConfiguration")
                .method(com.oracle.bmc.http.client.Method.PUT)
                .requestBuilder(UpdateConfigurationRequest::builder)
                .basePath("/20220430")
                .appendPathParam("configuration")
                .appendQueryParam("compartmentId", request.getCompartmentId())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.licensemanager.model.Configuration.class,
                        UpdateConfigurationResponse.Builder::configuration)
                .handleResponseHeaderString("etag", UpdateConfigurationResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", UpdateConfigurationResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<UpdateLicenseRecordResponse> updateLicenseRecord(
            UpdateLicenseRecordRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            UpdateLicenseRecordRequest, UpdateLicenseRecordResponse>
                    handler) {

        Validate.notBlank(request.getLicenseRecordId(), "licenseRecordId must not be blank");
        Objects.requireNonNull(
                request.getUpdateLicenseRecordDetails(), "updateLicenseRecordDetails is required");

        return clientCall(request, UpdateLicenseRecordResponse::builder)
                .logger(LOG, "updateLicenseRecord")
                .serviceDetails(
                        "LicenseManager",
                        "UpdateLicenseRecord",
                        "https://docs.oracle.com/iaas/api/#/en/licensemanager/20220430/LicenseRecord/UpdateLicenseRecord")
                .method(com.oracle.bmc.http.client.Method.PUT)
                .requestBuilder(UpdateLicenseRecordRequest::builder)
                .basePath("/20220430")
                .appendPathParam("licenseRecords")
                .appendPathParam(request.getLicenseRecordId())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.licensemanager.model.LicenseRecord.class,
                        UpdateLicenseRecordResponse.Builder::licenseRecord)
                .handleResponseHeaderString("etag", UpdateLicenseRecordResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", UpdateLicenseRecordResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<UpdateProductLicenseResponse> updateProductLicense(
            UpdateProductLicenseRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            UpdateProductLicenseRequest, UpdateProductLicenseResponse>
                    handler) {

        Validate.notBlank(request.getProductLicenseId(), "productLicenseId must not be blank");
        Objects.requireNonNull(
                request.getUpdateProductLicenseDetails(),
                "updateProductLicenseDetails is required");

        return clientCall(request, UpdateProductLicenseResponse::builder)
                .logger(LOG, "updateProductLicense")
                .serviceDetails(
                        "LicenseManager",
                        "UpdateProductLicense",
                        "https://docs.oracle.com/iaas/api/#/en/licensemanager/20220430/ProductLicense/UpdateProductLicense")
                .method(com.oracle.bmc.http.client.Method.PUT)
                .requestBuilder(UpdateProductLicenseRequest::builder)
                .basePath("/20220430")
                .appendPathParam("productLicenses")
                .appendPathParam(request.getProductLicenseId())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.licensemanager.model.ProductLicense.class,
                        UpdateProductLicenseResponse.Builder::productLicense)
                .handleResponseHeaderString("etag", UpdateProductLicenseResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", UpdateProductLicenseResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    /**
     * Create a new client instance.
     *
     * @param authenticationDetailsProvider The authentication details (see {@link Builder#build})
     * @deprecated Use the {@link #builder() builder} instead.
     */
    @Deprecated
    public LicenseManagerAsyncClient(
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
    public LicenseManagerAsyncClient(
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
    public LicenseManagerAsyncClient(
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
    public LicenseManagerAsyncClient(
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
    public LicenseManagerAsyncClient(
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
    public LicenseManagerAsyncClient(
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
    public LicenseManagerAsyncClient(
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
