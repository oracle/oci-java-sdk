/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.healthchecks;

import com.oracle.bmc.util.internal.Validate;
import com.oracle.bmc.healthchecks.requests.*;
import com.oracle.bmc.healthchecks.responses.*;
import com.oracle.bmc.circuitbreaker.CircuitBreakerConfiguration;
import com.oracle.bmc.util.CircuitBreakerUtils;

import java.util.Objects;

@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20180501")
public class HealthChecksClient extends com.oracle.bmc.http.internal.BaseSyncClient
        implements HealthChecks {
    /** Service instance for HealthChecks. */
    public static final com.oracle.bmc.Service SERVICE =
            com.oracle.bmc.Services.serviceBuilder()
                    .serviceName(HealthChecksClient.class.getName())
                    .serviceEndpointPrefix("healthchecks")
                    .serviceEndpointTemplate(
                            "https://healthchecks.{region}.oci.{secondLevelDomain}")
                    .build();

    private static final org.slf4j.Logger LOG =
            org.slf4j.LoggerFactory.getLogger(HealthChecksClient.class);

    private final HealthChecksPaginators paginators;

    HealthChecksClient(
            com.oracle.bmc.common.ClientBuilderBase<?, ?> builder,
            com.oracle.bmc.auth.AbstractAuthenticationDetailsProvider
                    authenticationDetailsProvider) {
        super(
                builder,
                authenticationDetailsProvider,
                CircuitBreakerUtils.DEFAULT_CIRCUIT_BREAKER_CONFIGURATION);

        this.paginators = new HealthChecksPaginators(this);
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
            extends com.oracle.bmc.common.RegionalClientBuilder<Builder, HealthChecksClient> {
        private Builder(com.oracle.bmc.Service service) {
            super(service);
            final String packageName = "healthchecks";
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
        public HealthChecksClient build(
                @jakarta.annotation.Nonnull
                        com.oracle.bmc.auth.AbstractAuthenticationDetailsProvider
                                authenticationDetailsProvider) {
            return new HealthChecksClient(this, authenticationDetailsProvider);
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
    public ChangeHttpMonitorCompartmentResponse changeHttpMonitorCompartment(
            ChangeHttpMonitorCompartmentRequest request) {

        Validate.notBlank(request.getMonitorId(), "monitorId must not be blank");
        Objects.requireNonNull(
                request.getChangeHttpMonitorCompartmentDetails(),
                "changeHttpMonitorCompartmentDetails is required");

        return clientCall(request, ChangeHttpMonitorCompartmentResponse::builder)
                .logger(LOG, "changeHttpMonitorCompartment")
                .serviceDetails(
                        "HealthChecks",
                        "ChangeHttpMonitorCompartment",
                        "https://docs.oracle.com/iaas/api/#/en/healthchecks/20180501/HttpMonitor/ChangeHttpMonitorCompartment")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(ChangeHttpMonitorCompartmentRequest::builder)
                .basePath("/20180501")
                .appendPathParam("httpMonitors")
                .appendPathParam(request.getMonitorId())
                .appendPathParam("actions")
                .appendPathParam("changeCompartment")
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .hasBody()
                .handleResponseHeaderString(
                        "opc-request-id",
                        ChangeHttpMonitorCompartmentResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public ChangePingMonitorCompartmentResponse changePingMonitorCompartment(
            ChangePingMonitorCompartmentRequest request) {

        Validate.notBlank(request.getMonitorId(), "monitorId must not be blank");
        Objects.requireNonNull(
                request.getChangePingMonitorCompartmentDetails(),
                "changePingMonitorCompartmentDetails is required");

        return clientCall(request, ChangePingMonitorCompartmentResponse::builder)
                .logger(LOG, "changePingMonitorCompartment")
                .serviceDetails(
                        "HealthChecks",
                        "ChangePingMonitorCompartment",
                        "https://docs.oracle.com/iaas/api/#/en/healthchecks/20180501/PingMonitor/ChangePingMonitorCompartment")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(ChangePingMonitorCompartmentRequest::builder)
                .basePath("/20180501")
                .appendPathParam("pingMonitors")
                .appendPathParam(request.getMonitorId())
                .appendPathParam("actions")
                .appendPathParam("changeCompartment")
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .hasBody()
                .handleResponseHeaderString(
                        "opc-request-id",
                        ChangePingMonitorCompartmentResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public CreateHttpMonitorResponse createHttpMonitor(CreateHttpMonitorRequest request) {
        Objects.requireNonNull(
                request.getCreateHttpMonitorDetails(), "createHttpMonitorDetails is required");

        return clientCall(request, CreateHttpMonitorResponse::builder)
                .logger(LOG, "createHttpMonitor")
                .serviceDetails(
                        "HealthChecks",
                        "CreateHttpMonitor",
                        "https://docs.oracle.com/iaas/api/#/en/healthchecks/20180501/HttpMonitor/CreateHttpMonitor")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(CreateHttpMonitorRequest::builder)
                .basePath("/20180501")
                .appendPathParam("httpMonitors")
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.healthchecks.model.HttpMonitor.class,
                        CreateHttpMonitorResponse.Builder::httpMonitor)
                .handleResponseHeaderString(
                        "opc-request-id", CreateHttpMonitorResponse.Builder::opcRequestId)
                .handleResponseHeaderString("location", CreateHttpMonitorResponse.Builder::location)
                .handleResponseHeaderString("etag", CreateHttpMonitorResponse.Builder::etag)
                .callSync();
    }

    @Override
    public CreateOnDemandHttpProbeResponse createOnDemandHttpProbe(
            CreateOnDemandHttpProbeRequest request) {
        Objects.requireNonNull(
                request.getCreateOnDemandHttpProbeDetails(),
                "createOnDemandHttpProbeDetails is required");

        return clientCall(request, CreateOnDemandHttpProbeResponse::builder)
                .logger(LOG, "createOnDemandHttpProbe")
                .serviceDetails(
                        "HealthChecks",
                        "CreateOnDemandHttpProbe",
                        "https://docs.oracle.com/iaas/api/#/en/healthchecks/20180501/HttpProbe/CreateOnDemandHttpProbe")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(CreateOnDemandHttpProbeRequest::builder)
                .basePath("/20180501")
                .appendPathParam("httpProbeResults")
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.healthchecks.model.HttpProbe.class,
                        CreateOnDemandHttpProbeResponse.Builder::httpProbe)
                .handleResponseHeaderString(
                        "opc-request-id", CreateOnDemandHttpProbeResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "location", CreateOnDemandHttpProbeResponse.Builder::location)
                .callSync();
    }

    @Override
    public CreateOnDemandPingProbeResponse createOnDemandPingProbe(
            CreateOnDemandPingProbeRequest request) {
        Objects.requireNonNull(
                request.getCreateOnDemandPingProbeDetails(),
                "createOnDemandPingProbeDetails is required");

        return clientCall(request, CreateOnDemandPingProbeResponse::builder)
                .logger(LOG, "createOnDemandPingProbe")
                .serviceDetails(
                        "HealthChecks",
                        "CreateOnDemandPingProbe",
                        "https://docs.oracle.com/iaas/api/#/en/healthchecks/20180501/PingProbe/CreateOnDemandPingProbe")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(CreateOnDemandPingProbeRequest::builder)
                .basePath("/20180501")
                .appendPathParam("pingProbeResults")
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.healthchecks.model.PingProbe.class,
                        CreateOnDemandPingProbeResponse.Builder::pingProbe)
                .handleResponseHeaderString(
                        "opc-request-id", CreateOnDemandPingProbeResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "location", CreateOnDemandPingProbeResponse.Builder::location)
                .callSync();
    }

    @Override
    public CreatePingMonitorResponse createPingMonitor(CreatePingMonitorRequest request) {
        Objects.requireNonNull(
                request.getCreatePingMonitorDetails(), "createPingMonitorDetails is required");

        return clientCall(request, CreatePingMonitorResponse::builder)
                .logger(LOG, "createPingMonitor")
                .serviceDetails(
                        "HealthChecks",
                        "CreatePingMonitor",
                        "https://docs.oracle.com/iaas/api/#/en/healthchecks/20180501/PingMonitor/CreatePingMonitor")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(CreatePingMonitorRequest::builder)
                .basePath("/20180501")
                .appendPathParam("pingMonitors")
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.healthchecks.model.PingMonitor.class,
                        CreatePingMonitorResponse.Builder::pingMonitor)
                .handleResponseHeaderString(
                        "opc-request-id", CreatePingMonitorResponse.Builder::opcRequestId)
                .handleResponseHeaderString("location", CreatePingMonitorResponse.Builder::location)
                .handleResponseHeaderString("etag", CreatePingMonitorResponse.Builder::etag)
                .callSync();
    }

    @Override
    public DeleteHttpMonitorResponse deleteHttpMonitor(DeleteHttpMonitorRequest request) {

        Validate.notBlank(request.getMonitorId(), "monitorId must not be blank");

        return clientCall(request, DeleteHttpMonitorResponse::builder)
                .logger(LOG, "deleteHttpMonitor")
                .serviceDetails(
                        "HealthChecks",
                        "DeleteHttpMonitor",
                        "https://docs.oracle.com/iaas/api/#/en/healthchecks/20180501/HttpMonitor/DeleteHttpMonitor")
                .method(com.oracle.bmc.http.client.Method.DELETE)
                .requestBuilder(DeleteHttpMonitorRequest::builder)
                .basePath("/20180501")
                .appendPathParam("httpMonitors")
                .appendPathParam(request.getMonitorId())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("if-match", request.getIfMatch())
                .handleResponseHeaderString(
                        "opc-request-id", DeleteHttpMonitorResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public DeletePingMonitorResponse deletePingMonitor(DeletePingMonitorRequest request) {

        Validate.notBlank(request.getMonitorId(), "monitorId must not be blank");

        return clientCall(request, DeletePingMonitorResponse::builder)
                .logger(LOG, "deletePingMonitor")
                .serviceDetails(
                        "HealthChecks",
                        "DeletePingMonitor",
                        "https://docs.oracle.com/iaas/api/#/en/healthchecks/20180501/PingMonitor/DeletePingMonitor")
                .method(com.oracle.bmc.http.client.Method.DELETE)
                .requestBuilder(DeletePingMonitorRequest::builder)
                .basePath("/20180501")
                .appendPathParam("pingMonitors")
                .appendPathParam(request.getMonitorId())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("if-match", request.getIfMatch())
                .handleResponseHeaderString(
                        "opc-request-id", DeletePingMonitorResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public GetHttpMonitorResponse getHttpMonitor(GetHttpMonitorRequest request) {

        Validate.notBlank(request.getMonitorId(), "monitorId must not be blank");

        return clientCall(request, GetHttpMonitorResponse::builder)
                .logger(LOG, "getHttpMonitor")
                .serviceDetails(
                        "HealthChecks",
                        "GetHttpMonitor",
                        "https://docs.oracle.com/iaas/api/#/en/healthchecks/20180501/HttpMonitor/GetHttpMonitor")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetHttpMonitorRequest::builder)
                .basePath("/20180501")
                .appendPathParam("httpMonitors")
                .appendPathParam(request.getMonitorId())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("if-none-match", request.getIfNoneMatch())
                .handleBody(
                        com.oracle.bmc.healthchecks.model.HttpMonitor.class,
                        GetHttpMonitorResponse.Builder::httpMonitor)
                .handleResponseHeaderString(
                        "opc-request-id", GetHttpMonitorResponse.Builder::opcRequestId)
                .handleResponseHeaderString("etag", GetHttpMonitorResponse.Builder::etag)
                .callSync();
    }

    @Override
    public GetPingMonitorResponse getPingMonitor(GetPingMonitorRequest request) {

        Validate.notBlank(request.getMonitorId(), "monitorId must not be blank");

        return clientCall(request, GetPingMonitorResponse::builder)
                .logger(LOG, "getPingMonitor")
                .serviceDetails(
                        "HealthChecks",
                        "GetPingMonitor",
                        "https://docs.oracle.com/iaas/api/#/en/healthchecks/20180501/PingMonitor/GetPingMonitor")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetPingMonitorRequest::builder)
                .basePath("/20180501")
                .appendPathParam("pingMonitors")
                .appendPathParam(request.getMonitorId())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("if-none-match", request.getIfNoneMatch())
                .handleBody(
                        com.oracle.bmc.healthchecks.model.PingMonitor.class,
                        GetPingMonitorResponse.Builder::pingMonitor)
                .handleResponseHeaderString(
                        "opc-request-id", GetPingMonitorResponse.Builder::opcRequestId)
                .handleResponseHeaderString("etag", GetPingMonitorResponse.Builder::etag)
                .callSync();
    }

    @Override
    public ListHealthChecksVantagePointsResponse listHealthChecksVantagePoints(
            ListHealthChecksVantagePointsRequest request) {

        return clientCall(request, ListHealthChecksVantagePointsResponse::builder)
                .logger(LOG, "listHealthChecksVantagePoints")
                .serviceDetails(
                        "HealthChecks",
                        "ListHealthChecksVantagePoints",
                        "https://docs.oracle.com/iaas/api/#/en/healthchecks/20180501/HealthChecksVantagePointSummary/ListHealthChecksVantagePoints")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListHealthChecksVantagePointsRequest::builder)
                .basePath("/20180501")
                .appendPathParam("vantagePoints")
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .appendQueryParam("name", request.getName())
                .appendQueryParam("displayName", request.getDisplayName())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBodyList(
                        com.oracle.bmc.healthchecks.model.HealthChecksVantagePointSummary.class,
                        ListHealthChecksVantagePointsResponse.Builder::items)
                .handleResponseHeaderString(
                        "opc-request-id",
                        ListHealthChecksVantagePointsResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListHealthChecksVantagePointsResponse.Builder::opcNextPage)
                .callSync();
    }

    @Override
    public ListHttpMonitorsResponse listHttpMonitors(ListHttpMonitorsRequest request) {
        Objects.requireNonNull(request.getCompartmentId(), "compartmentId is required");

        return clientCall(request, ListHttpMonitorsResponse::builder)
                .logger(LOG, "listHttpMonitors")
                .serviceDetails(
                        "HealthChecks",
                        "ListHttpMonitors",
                        "https://docs.oracle.com/iaas/api/#/en/healthchecks/20180501/HttpMonitorSummary/ListHttpMonitors")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListHttpMonitorsRequest::builder)
                .basePath("/20180501")
                .appendPathParam("httpMonitors")
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .appendQueryParam("compartmentId", request.getCompartmentId())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .appendQueryParam("displayName", request.getDisplayName())
                .appendQueryParam("homeRegion", request.getHomeRegion())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBodyList(
                        com.oracle.bmc.healthchecks.model.HttpMonitorSummary.class,
                        ListHttpMonitorsResponse.Builder::items)
                .handleResponseHeaderString(
                        "opc-request-id", ListHttpMonitorsResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListHttpMonitorsResponse.Builder::opcNextPage)
                .callSync();
    }

    @Override
    public ListHttpProbeResultsResponse listHttpProbeResults(ListHttpProbeResultsRequest request) {

        Validate.notBlank(
                request.getProbeConfigurationId(), "probeConfigurationId must not be blank");

        return clientCall(request, ListHttpProbeResultsResponse::builder)
                .logger(LOG, "listHttpProbeResults")
                .serviceDetails(
                        "HealthChecks",
                        "ListHttpProbeResults",
                        "https://docs.oracle.com/iaas/api/#/en/healthchecks/20180501/HttpProbeResultSummary/ListHttpProbeResults")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListHttpProbeResultsRequest::builder)
                .basePath("/20180501")
                .appendPathParam("httpProbeResults")
                .appendPathParam(request.getProbeConfigurationId())
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .appendQueryParam(
                        "startTimeGreaterThanOrEqualTo", request.getStartTimeGreaterThanOrEqualTo())
                .appendQueryParam(
                        "startTimeLessThanOrEqualTo", request.getStartTimeLessThanOrEqualTo())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .appendQueryParam("target", request.getTarget())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBodyList(
                        com.oracle.bmc.healthchecks.model.HttpProbeResultSummary.class,
                        ListHttpProbeResultsResponse.Builder::items)
                .handleResponseHeaderString(
                        "opc-request-id", ListHttpProbeResultsResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListHttpProbeResultsResponse.Builder::opcNextPage)
                .callSync();
    }

    @Override
    public ListPingMonitorsResponse listPingMonitors(ListPingMonitorsRequest request) {
        Objects.requireNonNull(request.getCompartmentId(), "compartmentId is required");

        return clientCall(request, ListPingMonitorsResponse::builder)
                .logger(LOG, "listPingMonitors")
                .serviceDetails(
                        "HealthChecks",
                        "ListPingMonitors",
                        "https://docs.oracle.com/iaas/api/#/en/healthchecks/20180501/PingMonitorSummary/ListPingMonitors")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListPingMonitorsRequest::builder)
                .basePath("/20180501")
                .appendPathParam("pingMonitors")
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .appendQueryParam("compartmentId", request.getCompartmentId())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .appendQueryParam("displayName", request.getDisplayName())
                .appendQueryParam("homeRegion", request.getHomeRegion())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBodyList(
                        com.oracle.bmc.healthchecks.model.PingMonitorSummary.class,
                        ListPingMonitorsResponse.Builder::items)
                .handleResponseHeaderString(
                        "opc-request-id", ListPingMonitorsResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListPingMonitorsResponse.Builder::opcNextPage)
                .callSync();
    }

    @Override
    public ListPingProbeResultsResponse listPingProbeResults(ListPingProbeResultsRequest request) {

        Validate.notBlank(
                request.getProbeConfigurationId(), "probeConfigurationId must not be blank");

        return clientCall(request, ListPingProbeResultsResponse::builder)
                .logger(LOG, "listPingProbeResults")
                .serviceDetails(
                        "HealthChecks",
                        "ListPingProbeResults",
                        "https://docs.oracle.com/iaas/api/#/en/healthchecks/20180501/PingProbeResultSummary/ListPingProbeResults")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListPingProbeResultsRequest::builder)
                .basePath("/20180501")
                .appendPathParam("pingProbeResults")
                .appendPathParam(request.getProbeConfigurationId())
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .appendQueryParam(
                        "startTimeGreaterThanOrEqualTo", request.getStartTimeGreaterThanOrEqualTo())
                .appendQueryParam(
                        "startTimeLessThanOrEqualTo", request.getStartTimeLessThanOrEqualTo())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .appendQueryParam("target", request.getTarget())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBodyList(
                        com.oracle.bmc.healthchecks.model.PingProbeResultSummary.class,
                        ListPingProbeResultsResponse.Builder::items)
                .handleResponseHeaderString(
                        "opc-request-id", ListPingProbeResultsResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListPingProbeResultsResponse.Builder::opcNextPage)
                .callSync();
    }

    @Override
    public UpdateHttpMonitorResponse updateHttpMonitor(UpdateHttpMonitorRequest request) {

        Validate.notBlank(request.getMonitorId(), "monitorId must not be blank");
        Objects.requireNonNull(
                request.getUpdateHttpMonitorDetails(), "updateHttpMonitorDetails is required");

        return clientCall(request, UpdateHttpMonitorResponse::builder)
                .logger(LOG, "updateHttpMonitor")
                .serviceDetails(
                        "HealthChecks",
                        "UpdateHttpMonitor",
                        "https://docs.oracle.com/iaas/api/#/en/healthchecks/20180501/HttpMonitor/UpdateHttpMonitor")
                .method(com.oracle.bmc.http.client.Method.PUT)
                .requestBuilder(UpdateHttpMonitorRequest::builder)
                .basePath("/20180501")
                .appendPathParam("httpMonitors")
                .appendPathParam(request.getMonitorId())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("if-match", request.getIfMatch())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.healthchecks.model.HttpMonitor.class,
                        UpdateHttpMonitorResponse.Builder::httpMonitor)
                .handleResponseHeaderString(
                        "opc-request-id", UpdateHttpMonitorResponse.Builder::opcRequestId)
                .handleResponseHeaderString("etag", UpdateHttpMonitorResponse.Builder::etag)
                .callSync();
    }

    @Override
    public UpdatePingMonitorResponse updatePingMonitor(UpdatePingMonitorRequest request) {

        Validate.notBlank(request.getMonitorId(), "monitorId must not be blank");
        Objects.requireNonNull(
                request.getUpdatePingMonitorDetails(), "updatePingMonitorDetails is required");

        return clientCall(request, UpdatePingMonitorResponse::builder)
                .logger(LOG, "updatePingMonitor")
                .serviceDetails(
                        "HealthChecks",
                        "UpdatePingMonitor",
                        "https://docs.oracle.com/iaas/api/#/en/healthchecks/20180501/PingMonitor/UpdatePingMonitor")
                .method(com.oracle.bmc.http.client.Method.PUT)
                .requestBuilder(UpdatePingMonitorRequest::builder)
                .basePath("/20180501")
                .appendPathParam("pingMonitors")
                .appendPathParam(request.getMonitorId())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("if-match", request.getIfMatch())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.healthchecks.model.PingMonitor.class,
                        UpdatePingMonitorResponse.Builder::pingMonitor)
                .handleResponseHeaderString(
                        "opc-request-id", UpdatePingMonitorResponse.Builder::opcRequestId)
                .handleResponseHeaderString("etag", UpdatePingMonitorResponse.Builder::etag)
                .callSync();
    }

    @Override
    public HealthChecksPaginators getPaginators() {
        return paginators;
    }

    /**
     * Create a new client instance.
     *
     * @param authenticationDetailsProvider The authentication details (see {@link Builder#build})
     * @deprecated Use the {@link #builder() builder} instead.
     */
    @Deprecated
    public HealthChecksClient(
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
    public HealthChecksClient(
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
    public HealthChecksClient(
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
    public HealthChecksClient(
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
    public HealthChecksClient(
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
    public HealthChecksClient(
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
    public HealthChecksClient(
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
