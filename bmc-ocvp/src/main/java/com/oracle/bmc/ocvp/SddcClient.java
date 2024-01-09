/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.ocvp;

import com.oracle.bmc.util.internal.Validate;
import com.oracle.bmc.ocvp.requests.*;
import com.oracle.bmc.ocvp.responses.*;
import com.oracle.bmc.circuitbreaker.CircuitBreakerConfiguration;
import com.oracle.bmc.util.CircuitBreakerUtils;

import java.util.Objects;

@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20230701")
public class SddcClient extends com.oracle.bmc.http.internal.BaseSyncClient implements Sddc {
    /** Service instance for Sddc. */
    public static final com.oracle.bmc.Service SERVICE =
            com.oracle.bmc.Services.serviceBuilder()
                    .serviceName("SDDC")
                    .serviceEndpointPrefix("")
                    .serviceEndpointTemplate("https://ocvps.{region}.oci.{secondLevelDomain}")
                    .build();

    private static final org.slf4j.Logger LOG = org.slf4j.LoggerFactory.getLogger(SddcClient.class);

    private final SddcWaiters waiters;

    private final SddcPaginators paginators;

    SddcClient(
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
                                    .nameFormat("Sddc-waiters-%d")
                                    .build());
            threadPoolExecutor.allowCoreThreadTimeOut(true);

            executorService = threadPoolExecutor;
        }
        this.waiters = new SddcWaiters(executorService, this);

        this.paginators = new SddcPaginators(this);
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
            extends com.oracle.bmc.common.RegionalClientBuilder<Builder, SddcClient> {
        private java.util.concurrent.ExecutorService executorService;

        private Builder(com.oracle.bmc.Service service) {
            super(service);
            final String packageName = "ocvp";
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
        public SddcClient build(
                @jakarta.annotation.Nonnull
                        com.oracle.bmc.auth.AbstractAuthenticationDetailsProvider
                                authenticationDetailsProvider) {
            return new SddcClient(this, authenticationDetailsProvider, executorService);
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
    public CancelDowngradeHcxResponse cancelDowngradeHcx(CancelDowngradeHcxRequest request) {

        Validate.notBlank(request.getSddcId(), "sddcId must not be blank");

        return clientCall(request, CancelDowngradeHcxResponse::builder)
                .logger(LOG, "cancelDowngradeHcx")
                .serviceDetails(
                        "Sddc",
                        "CancelDowngradeHcx",
                        "https://docs.oracle.com/iaas/api/#/en/vmware/20230701/Sddc/CancelDowngradeHcx")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(CancelDowngradeHcxRequest::builder)
                .basePath("/20230701")
                .appendPathParam("sddcs")
                .appendPathParam(request.getSddcId())
                .appendPathParam("actions")
                .appendPathParam("cancelDowngradeHcx")
                .accept("application/json")
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .handleResponseHeaderString(
                        "opc-work-request-id", CancelDowngradeHcxResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", CancelDowngradeHcxResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public ChangeSddcCompartmentResponse changeSddcCompartment(
            ChangeSddcCompartmentRequest request) {

        Validate.notBlank(request.getSddcId(), "sddcId must not be blank");
        Objects.requireNonNull(
                request.getChangeSddcCompartmentDetails(),
                "changeSddcCompartmentDetails is required");

        return clientCall(request, ChangeSddcCompartmentResponse::builder)
                .logger(LOG, "changeSddcCompartment")
                .serviceDetails(
                        "Sddc",
                        "ChangeSddcCompartment",
                        "https://docs.oracle.com/iaas/api/#/en/vmware/20230701/Sddc/ChangeSddcCompartment")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(ChangeSddcCompartmentRequest::builder)
                .basePath("/20230701")
                .appendPathParam("sddcs")
                .appendPathParam(request.getSddcId())
                .appendPathParam("actions")
                .appendPathParam("changeCompartment")
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .operationUsesDefaultRetries()
                .hasBody()
                .handleResponseHeaderString(
                        "opc-request-id", ChangeSddcCompartmentResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public CreateSddcResponse createSddc(CreateSddcRequest request) {
        Objects.requireNonNull(request.getCreateSddcDetails(), "createSddcDetails is required");

        return clientCall(request, CreateSddcResponse::builder)
                .logger(LOG, "createSddc")
                .serviceDetails(
                        "Sddc",
                        "CreateSddc",
                        "https://docs.oracle.com/iaas/api/#/en/vmware/20230701/Sddc/CreateSddc")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(CreateSddcRequest::builder)
                .basePath("/20230701")
                .appendPathParam("sddcs")
                .accept("application/json")
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .hasBody()
                .handleResponseHeaderString(
                        "opc-work-request-id", CreateSddcResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", CreateSddcResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public DeleteSddcResponse deleteSddc(DeleteSddcRequest request) {

        Validate.notBlank(request.getSddcId(), "sddcId must not be blank");

        return clientCall(request, DeleteSddcResponse::builder)
                .logger(LOG, "deleteSddc")
                .serviceDetails(
                        "Sddc",
                        "DeleteSddc",
                        "https://docs.oracle.com/iaas/api/#/en/vmware/20230701/Sddc/DeleteSddc")
                .method(com.oracle.bmc.http.client.Method.DELETE)
                .requestBuilder(DeleteSddcRequest::builder)
                .basePath("/20230701")
                .appendPathParam("sddcs")
                .appendPathParam(request.getSddcId())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .handleResponseHeaderString(
                        "opc-work-request-id", DeleteSddcResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", DeleteSddcResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public DowngradeHcxResponse downgradeHcx(DowngradeHcxRequest request) {
        Objects.requireNonNull(request.getDowngradeHcxDetails(), "downgradeHcxDetails is required");

        Validate.notBlank(request.getSddcId(), "sddcId must not be blank");

        return clientCall(request, DowngradeHcxResponse::builder)
                .logger(LOG, "downgradeHcx")
                .serviceDetails(
                        "Sddc",
                        "DowngradeHcx",
                        "https://docs.oracle.com/iaas/api/#/en/vmware/20230701/Sddc/DowngradeHcx")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(DowngradeHcxRequest::builder)
                .basePath("/20230701")
                .appendPathParam("sddcs")
                .appendPathParam(request.getSddcId())
                .appendPathParam("actions")
                .appendPathParam("downgradeHcx")
                .accept("application/json")
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .hasBody()
                .handleResponseHeaderString(
                        "opc-work-request-id", DowngradeHcxResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", DowngradeHcxResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public GetSddcResponse getSddc(GetSddcRequest request) {

        Validate.notBlank(request.getSddcId(), "sddcId must not be blank");

        return clientCall(request, GetSddcResponse::builder)
                .logger(LOG, "getSddc")
                .serviceDetails(
                        "Sddc",
                        "GetSddc",
                        "https://docs.oracle.com/iaas/api/#/en/vmware/20230701/Sddc/GetSddc")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetSddcRequest::builder)
                .basePath("/20230701")
                .appendPathParam("sddcs")
                .appendPathParam(request.getSddcId())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .handleBody(com.oracle.bmc.ocvp.model.Sddc.class, GetSddcResponse.Builder::sddc)
                .handleResponseHeaderString("etag", GetSddcResponse.Builder::etag)
                .handleResponseHeaderString("opc-request-id", GetSddcResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public ListSddcsResponse listSddcs(ListSddcsRequest request) {
        Objects.requireNonNull(request.getCompartmentId(), "compartmentId is required");

        return clientCall(request, ListSddcsResponse::builder)
                .logger(LOG, "listSddcs")
                .serviceDetails(
                        "Sddc",
                        "ListSddcs",
                        "https://docs.oracle.com/iaas/api/#/en/vmware/20230701/SddcSummary/ListSddcs")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListSddcsRequest::builder)
                .basePath("/20230701")
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
                .operationUsesDefaultRetries()
                .handleBody(
                        com.oracle.bmc.ocvp.model.SddcCollection.class,
                        ListSddcsResponse.Builder::sddcCollection)
                .handleResponseHeaderString(
                        "opc-request-id", ListSddcsResponse.Builder::opcRequestId)
                .handleResponseHeaderString("opc-next-page", ListSddcsResponse.Builder::opcNextPage)
                .callSync();
    }

    @Override
    public ListSupportedCommitmentsResponse listSupportedCommitments(
            ListSupportedCommitmentsRequest request) {
        Objects.requireNonNull(request.getCompartmentId(), "compartmentId is required");

        return clientCall(request, ListSupportedCommitmentsResponse::builder)
                .logger(LOG, "listSupportedCommitments")
                .serviceDetails(
                        "Sddc",
                        "ListSupportedCommitments",
                        "https://docs.oracle.com/iaas/api/#/en/vmware/20230701/SupportedCommitmentSummary/ListSupportedCommitments")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListSupportedCommitmentsRequest::builder)
                .basePath("/20230701")
                .appendPathParam("supportedCommitments")
                .appendQueryParam("compartmentId", request.getCompartmentId())
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .appendQueryParam("hostShapeName", request.getHostShapeName())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .handleBody(
                        com.oracle.bmc.ocvp.model.SupportedCommitmentSummaryCollection.class,
                        ListSupportedCommitmentsResponse.Builder
                                ::supportedCommitmentSummaryCollection)
                .handleResponseHeaderString(
                        "opc-request-id", ListSupportedCommitmentsResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListSupportedCommitmentsResponse.Builder::opcNextPage)
                .callSync();
    }

    @Override
    public ListSupportedHostShapesResponse listSupportedHostShapes(
            ListSupportedHostShapesRequest request) {
        Objects.requireNonNull(request.getCompartmentId(), "compartmentId is required");

        return clientCall(request, ListSupportedHostShapesResponse::builder)
                .logger(LOG, "listSupportedHostShapes")
                .serviceDetails(
                        "Sddc",
                        "ListSupportedHostShapes",
                        "https://docs.oracle.com/iaas/api/#/en/vmware/20230701/SupportedHostShapeSummary/ListSupportedHostShapes")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListSupportedHostShapesRequest::builder)
                .basePath("/20230701")
                .appendPathParam("supportedHostShapes")
                .appendQueryParam("compartmentId", request.getCompartmentId())
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .appendQueryParam("name", request.getName())
                .appendQueryParam(
                        "isSingleHostSddcSupported", request.getIsSingleHostSddcSupported())
                .appendQueryParam("initialHostShapeName", request.getInitialHostShapeName())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .handleBody(
                        com.oracle.bmc.ocvp.model.SupportedHostShapeCollection.class,
                        ListSupportedHostShapesResponse.Builder::supportedHostShapeCollection)
                .handleResponseHeaderString(
                        "opc-request-id", ListSupportedHostShapesResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListSupportedHostShapesResponse.Builder::opcNextPage)
                .callSync();
    }

    @Override
    public ListSupportedVmwareSoftwareVersionsResponse listSupportedVmwareSoftwareVersions(
            ListSupportedVmwareSoftwareVersionsRequest request) {
        Objects.requireNonNull(request.getCompartmentId(), "compartmentId is required");

        return clientCall(request, ListSupportedVmwareSoftwareVersionsResponse::builder)
                .logger(LOG, "listSupportedVmwareSoftwareVersions")
                .serviceDetails(
                        "Sddc",
                        "ListSupportedVmwareSoftwareVersions",
                        "https://docs.oracle.com/iaas/api/#/en/vmware/20230701/SupportedVmwareSoftwareVersionSummary/ListSupportedVmwareSoftwareVersions")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListSupportedVmwareSoftwareVersionsRequest::builder)
                .basePath("/20230701")
                .appendPathParam("supportedVmwareSoftwareVersions")
                .appendQueryParam("compartmentId", request.getCompartmentId())
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .appendQueryParam("version", request.getVersion())
                .appendQueryParam("hostShapeName", request.getHostShapeName())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
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
                .callSync();
    }

    @Override
    public RefreshHcxLicenseStatusResponse refreshHcxLicenseStatus(
            RefreshHcxLicenseStatusRequest request) {

        Validate.notBlank(request.getSddcId(), "sddcId must not be blank");

        return clientCall(request, RefreshHcxLicenseStatusResponse::builder)
                .logger(LOG, "refreshHcxLicenseStatus")
                .serviceDetails(
                        "Sddc",
                        "RefreshHcxLicenseStatus",
                        "https://docs.oracle.com/iaas/api/#/en/vmware/20230701/Sddc/RefreshHcxLicenseStatus")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(RefreshHcxLicenseStatusRequest::builder)
                .basePath("/20230701")
                .appendPathParam("sddcs")
                .appendPathParam(request.getSddcId())
                .appendPathParam("actions")
                .appendPathParam("refreshHcxLicenses")
                .accept("application/json")
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        RefreshHcxLicenseStatusResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", RefreshHcxLicenseStatusResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public RetrievePasswordResponse retrievePassword(RetrievePasswordRequest request) {

        Validate.notBlank(request.getSddcId(), "sddcId must not be blank");
        Objects.requireNonNull(request.getType(), "type is required");

        return clientCall(request, RetrievePasswordResponse::builder)
                .logger(LOG, "retrievePassword")
                .serviceDetails(
                        "Sddc",
                        "RetrievePassword",
                        "https://docs.oracle.com/iaas/api/#/en/vmware/20230701/Sddc/RetrievePassword")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(RetrievePasswordRequest::builder)
                .basePath("/20230701")
                .appendPathParam("sddcs")
                .appendPathParam(request.getSddcId())
                .appendPathParam("actions")
                .appendPathParam("retrievePassword")
                .appendEnumQueryParam("type", request.getType())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .operationUsesDefaultRetries()
                .handleBody(
                        com.oracle.bmc.ocvp.model.SddcPassword.class,
                        RetrievePasswordResponse.Builder::sddcPassword)
                .handleResponseHeaderString("etag", RetrievePasswordResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", RetrievePasswordResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public UpdateSddcResponse updateSddc(UpdateSddcRequest request) {

        Validate.notBlank(request.getSddcId(), "sddcId must not be blank");
        Objects.requireNonNull(request.getUpdateSddcDetails(), "updateSddcDetails is required");

        return clientCall(request, UpdateSddcResponse::builder)
                .logger(LOG, "updateSddc")
                .serviceDetails(
                        "Sddc",
                        "UpdateSddc",
                        "https://docs.oracle.com/iaas/api/#/en/vmware/20230701/Sddc/UpdateSddc")
                .method(com.oracle.bmc.http.client.Method.PUT)
                .requestBuilder(UpdateSddcRequest::builder)
                .basePath("/20230701")
                .appendPathParam("sddcs")
                .appendPathParam(request.getSddcId())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .hasBody()
                .handleBody(com.oracle.bmc.ocvp.model.Sddc.class, UpdateSddcResponse.Builder::sddc)
                .handleResponseHeaderString("etag", UpdateSddcResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", UpdateSddcResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public UpgradeHcxResponse upgradeHcx(UpgradeHcxRequest request) {

        Validate.notBlank(request.getSddcId(), "sddcId must not be blank");

        return clientCall(request, UpgradeHcxResponse::builder)
                .logger(LOG, "upgradeHcx")
                .serviceDetails(
                        "Sddc",
                        "UpgradeHcx",
                        "https://docs.oracle.com/iaas/api/#/en/vmware/20230701/Sddc/UpgradeHcx")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(UpgradeHcxRequest::builder)
                .basePath("/20230701")
                .appendPathParam("sddcs")
                .appendPathParam(request.getSddcId())
                .appendPathParam("actions")
                .appendPathParam("upgradeHcx")
                .accept("application/json")
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .handleResponseHeaderString(
                        "opc-work-request-id", UpgradeHcxResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", UpgradeHcxResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public SddcWaiters getWaiters() {
        return waiters;
    }

    @Override
    public SddcPaginators getPaginators() {
        return paginators;
    }

    /**
     * Create a new client instance.
     *
     * @param authenticationDetailsProvider The authentication details (see {@link Builder#build})
     * @deprecated Use the {@link #builder() builder} instead.
     */
    @Deprecated
    public SddcClient(
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
    public SddcClient(
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
    public SddcClient(
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
    public SddcClient(
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
    public SddcClient(
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
    public SddcClient(
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
    public SddcClient(
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
    public SddcClient(
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
