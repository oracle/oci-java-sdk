/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.ocvp;

import com.oracle.bmc.util.internal.Validate;
import com.oracle.bmc.ocvp.requests.*;
import com.oracle.bmc.ocvp.responses.*;

import java.util.Objects;

/**
 * Async client implementation for Sddc service. <br>
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
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200501")
public class SddcAsyncClient extends com.oracle.bmc.http.internal.BaseAsyncClient
        implements SddcAsync {
    /** Service instance for Sddc. */
    public static final com.oracle.bmc.Service SERVICE =
            com.oracle.bmc.Services.serviceBuilder()
                    .serviceName("SDDC")
                    .serviceEndpointPrefix("")
                    .serviceEndpointTemplate("https://ocvps.{region}.oci.{secondLevelDomain}")
                    .build();

    private static final org.slf4j.Logger LOG =
            org.slf4j.LoggerFactory.getLogger(SddcAsyncClient.class);

    private SddcAsyncClient(
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
            extends com.oracle.bmc.common.RegionalClientBuilder<Builder, SddcAsyncClient> {
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
        public SddcAsyncClient build(
                @jakarta.annotation.Nonnull
                        com.oracle.bmc.auth.AbstractAuthenticationDetailsProvider
                                authenticationDetailsProvider) {
            return new SddcAsyncClient(this, authenticationDetailsProvider);
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
    public java.util.concurrent.Future<CancelDowngradeHcxResponse> cancelDowngradeHcx(
            CancelDowngradeHcxRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            CancelDowngradeHcxRequest, CancelDowngradeHcxResponse>
                    handler) {

        Validate.notBlank(request.getSddcId(), "sddcId must not be blank");

        return clientCall(request, CancelDowngradeHcxResponse::builder)
                .logger(LOG, "cancelDowngradeHcx")
                .serviceDetails(
                        "Sddc",
                        "CancelDowngradeHcx",
                        "https://docs.oracle.com/iaas/api/#/en/vmware/20200501/Sddc/CancelDowngradeHcx")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(CancelDowngradeHcxRequest::builder)
                .basePath("/20200501")
                .appendPathParam("sddcs")
                .appendPathParam(request.getSddcId())
                .appendPathParam("actions")
                .appendPathParam("cancelDowngradeHcx")
                .accept("application/json")
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleResponseHeaderString(
                        "opc-work-request-id", CancelDowngradeHcxResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", CancelDowngradeHcxResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ChangeSddcCompartmentResponse> changeSddcCompartment(
            ChangeSddcCompartmentRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ChangeSddcCompartmentRequest, ChangeSddcCompartmentResponse>
                    handler) {

        Validate.notBlank(request.getSddcId(), "sddcId must not be blank");
        Objects.requireNonNull(
                request.getChangeSddcCompartmentDetails(),
                "changeSddcCompartmentDetails is required");

        return clientCall(request, ChangeSddcCompartmentResponse::builder)
                .logger(LOG, "changeSddcCompartment")
                .serviceDetails(
                        "Sddc",
                        "ChangeSddcCompartment",
                        "https://docs.oracle.com/iaas/api/#/en/vmware/20200501/Sddc/ChangeSddcCompartment")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(ChangeSddcCompartmentRequest::builder)
                .basePath("/20200501")
                .appendPathParam("sddcs")
                .appendPathParam(request.getSddcId())
                .appendPathParam("actions")
                .appendPathParam("changeCompartment")
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .hasBody()
                .handleResponseHeaderString(
                        "opc-request-id", ChangeSddcCompartmentResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<CreateSddcResponse> createSddc(
            CreateSddcRequest request,
            final com.oracle.bmc.responses.AsyncHandler<CreateSddcRequest, CreateSddcResponse>
                    handler) {
        Objects.requireNonNull(request.getCreateSddcDetails(), "createSddcDetails is required");

        return clientCall(request, CreateSddcResponse::builder)
                .logger(LOG, "createSddc")
                .serviceDetails(
                        "Sddc",
                        "CreateSddc",
                        "https://docs.oracle.com/iaas/api/#/en/vmware/20200501/Sddc/CreateSddc")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(CreateSddcRequest::builder)
                .basePath("/20200501")
                .appendPathParam("sddcs")
                .accept("application/json")
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .hasBody()
                .handleResponseHeaderString(
                        "opc-work-request-id", CreateSddcResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", CreateSddcResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<DeleteSddcResponse> deleteSddc(
            DeleteSddcRequest request,
            final com.oracle.bmc.responses.AsyncHandler<DeleteSddcRequest, DeleteSddcResponse>
                    handler) {

        Validate.notBlank(request.getSddcId(), "sddcId must not be blank");

        return clientCall(request, DeleteSddcResponse::builder)
                .logger(LOG, "deleteSddc")
                .serviceDetails(
                        "Sddc",
                        "DeleteSddc",
                        "https://docs.oracle.com/iaas/api/#/en/vmware/20200501/Sddc/DeleteSddc")
                .method(com.oracle.bmc.http.client.Method.DELETE)
                .requestBuilder(DeleteSddcRequest::builder)
                .basePath("/20200501")
                .appendPathParam("sddcs")
                .appendPathParam(request.getSddcId())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleResponseHeaderString(
                        "opc-work-request-id", DeleteSddcResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", DeleteSddcResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<DowngradeHcxResponse> downgradeHcx(
            DowngradeHcxRequest request,
            final com.oracle.bmc.responses.AsyncHandler<DowngradeHcxRequest, DowngradeHcxResponse>
                    handler) {
        Objects.requireNonNull(request.getDowngradeHcxDetails(), "downgradeHcxDetails is required");

        Validate.notBlank(request.getSddcId(), "sddcId must not be blank");

        return clientCall(request, DowngradeHcxResponse::builder)
                .logger(LOG, "downgradeHcx")
                .serviceDetails(
                        "Sddc",
                        "DowngradeHcx",
                        "https://docs.oracle.com/iaas/api/#/en/vmware/20200501/Sddc/DowngradeHcx")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(DowngradeHcxRequest::builder)
                .basePath("/20200501")
                .appendPathParam("sddcs")
                .appendPathParam(request.getSddcId())
                .appendPathParam("actions")
                .appendPathParam("downgradeHcx")
                .accept("application/json")
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .hasBody()
                .handleResponseHeaderString(
                        "opc-work-request-id", DowngradeHcxResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", DowngradeHcxResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<GetSddcResponse> getSddc(
            GetSddcRequest request,
            final com.oracle.bmc.responses.AsyncHandler<GetSddcRequest, GetSddcResponse> handler) {

        Validate.notBlank(request.getSddcId(), "sddcId must not be blank");

        return clientCall(request, GetSddcResponse::builder)
                .logger(LOG, "getSddc")
                .serviceDetails(
                        "Sddc",
                        "GetSddc",
                        "https://docs.oracle.com/iaas/api/#/en/vmware/20200501/Sddc/GetSddc")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetSddcRequest::builder)
                .basePath("/20200501")
                .appendPathParam("sddcs")
                .appendPathParam(request.getSddcId())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(com.oracle.bmc.ocvp.model.Sddc.class, GetSddcResponse.Builder::sddc)
                .handleResponseHeaderString("etag", GetSddcResponse.Builder::etag)
                .handleResponseHeaderString("opc-request-id", GetSddcResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ListSddcsResponse> listSddcs(
            ListSddcsRequest request,
            final com.oracle.bmc.responses.AsyncHandler<ListSddcsRequest, ListSddcsResponse>
                    handler) {
        Objects.requireNonNull(request.getCompartmentId(), "compartmentId is required");

        return clientCall(request, ListSddcsResponse::builder)
                .logger(LOG, "listSddcs")
                .serviceDetails(
                        "Sddc",
                        "ListSddcs",
                        "https://docs.oracle.com/iaas/api/#/en/vmware/20200501/SddcSummary/ListSddcs")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListSddcsRequest::builder)
                .basePath("/20200501")
                .appendPathParam("sddcs")
                .appendQueryParam("compartmentId", request.getCompartmentId())
                .appendQueryParam(
                        "computeAvailabilityDomain", request.getComputeAvailabilityDomain())
                .appendQueryParam("displayName", request.getDisplayName())
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .appendEnumQueryParam("lifecycleState", request.getLifecycleState())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.ocvp.model.SddcCollection.class,
                        ListSddcsResponse.Builder::sddcCollection)
                .handleResponseHeaderString(
                        "opc-request-id", ListSddcsResponse.Builder::opcRequestId)
                .handleResponseHeaderString("opc-next-page", ListSddcsResponse.Builder::opcNextPage)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ListSupportedHostShapesResponse> listSupportedHostShapes(
            ListSupportedHostShapesRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ListSupportedHostShapesRequest, ListSupportedHostShapesResponse>
                    handler) {
        Objects.requireNonNull(request.getCompartmentId(), "compartmentId is required");

        return clientCall(request, ListSupportedHostShapesResponse::builder)
                .logger(LOG, "listSupportedHostShapes")
                .serviceDetails(
                        "Sddc",
                        "ListSupportedHostShapes",
                        "https://docs.oracle.com/iaas/api/#/en/vmware/20200501/SupportedHostShapeSummary/ListSupportedHostShapes")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListSupportedHostShapesRequest::builder)
                .basePath("/20200501")
                .appendPathParam("supportedHostShapes")
                .appendQueryParam("compartmentId", request.getCompartmentId())
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .appendQueryParam("name", request.getName())
                .appendEnumQueryParam("sddcType", request.getSddcType())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.ocvp.model.SupportedHostShapeCollection.class,
                        ListSupportedHostShapesResponse.Builder::supportedHostShapeCollection)
                .handleResponseHeaderString(
                        "opc-request-id", ListSupportedHostShapesResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListSupportedHostShapesResponse.Builder::opcNextPage)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ListSupportedSkusResponse> listSupportedSkus(
            ListSupportedSkusRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ListSupportedSkusRequest, ListSupportedSkusResponse>
                    handler) {
        Objects.requireNonNull(request.getCompartmentId(), "compartmentId is required");

        return clientCall(request, ListSupportedSkusResponse::builder)
                .logger(LOG, "listSupportedSkus")
                .serviceDetails(
                        "Sddc",
                        "ListSupportedSkus",
                        "https://docs.oracle.com/iaas/api/#/en/vmware/20200501/SupportedSkuSummary/ListSupportedSkus")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListSupportedSkusRequest::builder)
                .basePath("/20200501")
                .appendPathParam("supportedSkus")
                .appendQueryParam("compartmentId", request.getCompartmentId())
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.ocvp.model.SupportedSkuSummaryCollection.class,
                        ListSupportedSkusResponse.Builder::supportedSkuSummaryCollection)
                .handleResponseHeaderString(
                        "opc-request-id", ListSupportedSkusResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListSupportedSkusResponse.Builder::opcNextPage)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ListSupportedVmwareSoftwareVersionsResponse>
            listSupportedVmwareSoftwareVersions(
                    ListSupportedVmwareSoftwareVersionsRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    ListSupportedVmwareSoftwareVersionsRequest,
                                    ListSupportedVmwareSoftwareVersionsResponse>
                            handler) {
        Objects.requireNonNull(request.getCompartmentId(), "compartmentId is required");

        return clientCall(request, ListSupportedVmwareSoftwareVersionsResponse::builder)
                .logger(LOG, "listSupportedVmwareSoftwareVersions")
                .serviceDetails(
                        "Sddc",
                        "ListSupportedVmwareSoftwareVersions",
                        "https://docs.oracle.com/iaas/api/#/en/vmware/20200501/SupportedVmwareSoftwareVersionSummary/ListSupportedVmwareSoftwareVersions")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListSupportedVmwareSoftwareVersionsRequest::builder)
                .basePath("/20200501")
                .appendPathParam("supportedVmwareSoftwareVersions")
                .appendQueryParam("compartmentId", request.getCompartmentId())
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.ocvp.model.SupportedVmwareSoftwareVersionCollection.class,
                        ListSupportedVmwareSoftwareVersionsResponse.Builder
                                ::supportedVmwareSoftwareVersionCollection)
                .handleResponseHeaderString(
                        "opc-request-id",
                        ListSupportedVmwareSoftwareVersionsResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page",
                        ListSupportedVmwareSoftwareVersionsResponse.Builder::opcNextPage)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<RefreshHcxLicenseStatusResponse> refreshHcxLicenseStatus(
            RefreshHcxLicenseStatusRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            RefreshHcxLicenseStatusRequest, RefreshHcxLicenseStatusResponse>
                    handler) {

        Validate.notBlank(request.getSddcId(), "sddcId must not be blank");

        return clientCall(request, RefreshHcxLicenseStatusResponse::builder)
                .logger(LOG, "refreshHcxLicenseStatus")
                .serviceDetails(
                        "Sddc",
                        "RefreshHcxLicenseStatus",
                        "https://docs.oracle.com/iaas/api/#/en/vmware/20200501/Sddc/RefreshHcxLicenseStatus")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(RefreshHcxLicenseStatusRequest::builder)
                .basePath("/20200501")
                .appendPathParam("sddcs")
                .appendPathParam(request.getSddcId())
                .appendPathParam("actions")
                .appendPathParam("refreshHcxLicenses")
                .accept("application/json")
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        RefreshHcxLicenseStatusResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", RefreshHcxLicenseStatusResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<UpdateSddcResponse> updateSddc(
            UpdateSddcRequest request,
            final com.oracle.bmc.responses.AsyncHandler<UpdateSddcRequest, UpdateSddcResponse>
                    handler) {

        Validate.notBlank(request.getSddcId(), "sddcId must not be blank");
        Objects.requireNonNull(request.getUpdateSddcDetails(), "updateSddcDetails is required");

        return clientCall(request, UpdateSddcResponse::builder)
                .logger(LOG, "updateSddc")
                .serviceDetails(
                        "Sddc",
                        "UpdateSddc",
                        "https://docs.oracle.com/iaas/api/#/en/vmware/20200501/Sddc/UpdateSddc")
                .method(com.oracle.bmc.http.client.Method.PUT)
                .requestBuilder(UpdateSddcRequest::builder)
                .basePath("/20200501")
                .appendPathParam("sddcs")
                .appendPathParam(request.getSddcId())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .hasBody()
                .handleBody(com.oracle.bmc.ocvp.model.Sddc.class, UpdateSddcResponse.Builder::sddc)
                .handleResponseHeaderString("etag", UpdateSddcResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", UpdateSddcResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<UpgradeHcxResponse> upgradeHcx(
            UpgradeHcxRequest request,
            final com.oracle.bmc.responses.AsyncHandler<UpgradeHcxRequest, UpgradeHcxResponse>
                    handler) {

        Validate.notBlank(request.getSddcId(), "sddcId must not be blank");

        return clientCall(request, UpgradeHcxResponse::builder)
                .logger(LOG, "upgradeHcx")
                .serviceDetails(
                        "Sddc",
                        "UpgradeHcx",
                        "https://docs.oracle.com/iaas/api/#/en/vmware/20200501/Sddc/UpgradeHcx")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(UpgradeHcxRequest::builder)
                .basePath("/20200501")
                .appendPathParam("sddcs")
                .appendPathParam(request.getSddcId())
                .appendPathParam("actions")
                .appendPathParam("upgradeHcx")
                .accept("application/json")
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleResponseHeaderString(
                        "opc-work-request-id", UpgradeHcxResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", UpgradeHcxResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    /**
     * Create a new client instance.
     *
     * @param authenticationDetailsProvider The authentication details (see {@link Builder#build})
     * @deprecated Use the {@link #builder() builder} instead.
     */
    @Deprecated
    public SddcAsyncClient(
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
    public SddcAsyncClient(
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
    public SddcAsyncClient(
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
    public SddcAsyncClient(
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
    public SddcAsyncClient(
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
    public SddcAsyncClient(
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
    public SddcAsyncClient(
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
