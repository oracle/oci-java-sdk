/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.apmsynthetics;

import com.oracle.bmc.util.internal.Validate;
import com.oracle.bmc.apmsynthetics.requests.*;
import com.oracle.bmc.apmsynthetics.responses.*;
import com.oracle.bmc.circuitbreaker.CircuitBreakerConfiguration;
import com.oracle.bmc.util.CircuitBreakerUtils;

import java.util.Objects;

@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200630")
public class ApmSyntheticClient extends com.oracle.bmc.http.internal.BaseSyncClient
        implements ApmSynthetic {
    /** Service instance for ApmSynthetic. */
    public static final com.oracle.bmc.Service SERVICE =
            com.oracle.bmc.Services.serviceBuilder()
                    .serviceName("APMSYNTHETIC")
                    .serviceEndpointPrefix("")
                    .serviceEndpointTemplate(
                            "https://apm-synthetic.{region}.oci.{secondLevelDomain}")
                    .build();

    private static final org.slf4j.Logger LOG =
            org.slf4j.LoggerFactory.getLogger(ApmSyntheticClient.class);

    private final ApmSyntheticPaginators paginators;

    ApmSyntheticClient(
            com.oracle.bmc.common.ClientBuilderBase<?, ?> builder,
            com.oracle.bmc.auth.AbstractAuthenticationDetailsProvider
                    authenticationDetailsProvider) {
        super(
                builder,
                authenticationDetailsProvider,
                CircuitBreakerUtils.DEFAULT_CIRCUIT_BREAKER_CONFIGURATION);

        this.paginators = new ApmSyntheticPaginators(this);
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
            extends com.oracle.bmc.common.RegionalClientBuilder<Builder, ApmSyntheticClient> {
        private Builder(com.oracle.bmc.Service service) {
            super(service);
            final String packageName = "apmsynthetics";
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
        public ApmSyntheticClient build(
                @jakarta.annotation.Nonnull
                        com.oracle.bmc.auth.AbstractAuthenticationDetailsProvider
                                authenticationDetailsProvider) {
            return new ApmSyntheticClient(this, authenticationDetailsProvider);
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
    public AggregateNetworkDataResponse aggregateNetworkData(AggregateNetworkDataRequest request) {
        Objects.requireNonNull(request.getApmDomainId(), "apmDomainId is required");

        Validate.notBlank(request.getMonitorId(), "monitorId must not be blank");
        Objects.requireNonNull(
                request.getAggregateNetworkDataDetails(),
                "aggregateNetworkDataDetails is required");

        return clientCall(request, AggregateNetworkDataResponse::builder)
                .logger(LOG, "aggregateNetworkData")
                .serviceDetails("ApmSynthetic", "AggregateNetworkData", "")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(AggregateNetworkDataRequest::builder)
                .basePath("/20200630")
                .appendPathParam("monitors")
                .appendPathParam(request.getMonitorId())
                .appendPathParam("actions")
                .appendPathParam("aggregateNetworkData")
                .appendQueryParam("apmDomainId", request.getApmDomainId())
                .accept("application/json")
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .hasBody()
                .handleBody(
                        com.oracle.bmc.apmsynthetics.model.AggregatedNetworkDataResult.class,
                        AggregateNetworkDataResponse.Builder::aggregatedNetworkDataResult)
                .handleResponseHeaderString("etag", AggregateNetworkDataResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", AggregateNetworkDataResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public CreateDedicatedVantagePointResponse createDedicatedVantagePoint(
            CreateDedicatedVantagePointRequest request) {
        Objects.requireNonNull(request.getApmDomainId(), "apmDomainId is required");

        Objects.requireNonNull(
                request.getCreateDedicatedVantagePointDetails(),
                "createDedicatedVantagePointDetails is required");

        return clientCall(request, CreateDedicatedVantagePointResponse::builder)
                .logger(LOG, "createDedicatedVantagePoint")
                .serviceDetails("ApmSynthetic", "CreateDedicatedVantagePoint", "")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(CreateDedicatedVantagePointRequest::builder)
                .basePath("/20200630")
                .appendPathParam("dedicatedVantagePoints")
                .appendQueryParam("apmDomainId", request.getApmDomainId())
                .accept("application/json")
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .hasBody()
                .handleBody(
                        com.oracle.bmc.apmsynthetics.model.DedicatedVantagePoint.class,
                        CreateDedicatedVantagePointResponse.Builder::dedicatedVantagePoint)
                .handleResponseHeaderString(
                        "etag", CreateDedicatedVantagePointResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", CreateDedicatedVantagePointResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public CreateMonitorResponse createMonitor(CreateMonitorRequest request) {
        Objects.requireNonNull(request.getApmDomainId(), "apmDomainId is required");

        Objects.requireNonNull(
                request.getCreateMonitorDetails(), "createMonitorDetails is required");

        return clientCall(request, CreateMonitorResponse::builder)
                .logger(LOG, "createMonitor")
                .serviceDetails("ApmSynthetic", "CreateMonitor", "")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(CreateMonitorRequest::builder)
                .basePath("/20200630")
                .appendPathParam("monitors")
                .appendQueryParam("apmDomainId", request.getApmDomainId())
                .accept("application/json")
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .hasBody()
                .handleBody(
                        com.oracle.bmc.apmsynthetics.model.Monitor.class,
                        CreateMonitorResponse.Builder::monitor)
                .handleResponseHeaderString("etag", CreateMonitorResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", CreateMonitorResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public CreateOnPremiseVantagePointResponse createOnPremiseVantagePoint(
            CreateOnPremiseVantagePointRequest request) {
        Objects.requireNonNull(request.getApmDomainId(), "apmDomainId is required");

        Objects.requireNonNull(
                request.getCreateOnPremiseVantagePointDetails(),
                "createOnPremiseVantagePointDetails is required");

        return clientCall(request, CreateOnPremiseVantagePointResponse::builder)
                .logger(LOG, "createOnPremiseVantagePoint")
                .serviceDetails("ApmSynthetic", "CreateOnPremiseVantagePoint", "")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(CreateOnPremiseVantagePointRequest::builder)
                .basePath("/20200630")
                .appendPathParam("onPremiseVantagePoints")
                .appendQueryParam("apmDomainId", request.getApmDomainId())
                .accept("application/json")
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .hasBody()
                .handleBody(
                        com.oracle.bmc.apmsynthetics.model.OnPremiseVantagePoint.class,
                        CreateOnPremiseVantagePointResponse.Builder::onPremiseVantagePoint)
                .handleResponseHeaderString(
                        "etag", CreateOnPremiseVantagePointResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", CreateOnPremiseVantagePointResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public CreateScriptResponse createScript(CreateScriptRequest request) {
        Objects.requireNonNull(request.getApmDomainId(), "apmDomainId is required");

        Objects.requireNonNull(request.getCreateScriptDetails(), "createScriptDetails is required");

        return clientCall(request, CreateScriptResponse::builder)
                .logger(LOG, "createScript")
                .serviceDetails("ApmSynthetic", "CreateScript", "")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(CreateScriptRequest::builder)
                .basePath("/20200630")
                .appendPathParam("scripts")
                .appendQueryParam("apmDomainId", request.getApmDomainId())
                .accept("application/json")
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .hasBody()
                .handleBody(
                        com.oracle.bmc.apmsynthetics.model.Script.class,
                        CreateScriptResponse.Builder::script)
                .handleResponseHeaderString("etag", CreateScriptResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", CreateScriptResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public CreateWorkerResponse createWorker(CreateWorkerRequest request) {
        Objects.requireNonNull(request.getApmDomainId(), "apmDomainId is required");

        Validate.notBlank(
                request.getOnPremiseVantagePointId(), "onPremiseVantagePointId must not be blank");
        Objects.requireNonNull(request.getCreateWorkerDetails(), "createWorkerDetails is required");

        return clientCall(request, CreateWorkerResponse::builder)
                .logger(LOG, "createWorker")
                .serviceDetails("ApmSynthetic", "CreateWorker", "")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(CreateWorkerRequest::builder)
                .basePath("/20200630")
                .appendPathParam("onPremiseVantagePoints")
                .appendPathParam(request.getOnPremiseVantagePointId())
                .appendPathParam("workers")
                .appendQueryParam("apmDomainId", request.getApmDomainId())
                .accept("application/json")
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .hasBody()
                .handleBody(
                        com.oracle.bmc.apmsynthetics.model.Worker.class,
                        CreateWorkerResponse.Builder::worker)
                .handleResponseHeaderString("etag", CreateWorkerResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", CreateWorkerResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public DeleteDedicatedVantagePointResponse deleteDedicatedVantagePoint(
            DeleteDedicatedVantagePointRequest request) {
        Objects.requireNonNull(request.getApmDomainId(), "apmDomainId is required");

        Validate.notBlank(
                request.getDedicatedVantagePointId(), "dedicatedVantagePointId must not be blank");

        return clientCall(request, DeleteDedicatedVantagePointResponse::builder)
                .logger(LOG, "deleteDedicatedVantagePoint")
                .serviceDetails("ApmSynthetic", "DeleteDedicatedVantagePoint", "")
                .method(com.oracle.bmc.http.client.Method.DELETE)
                .requestBuilder(DeleteDedicatedVantagePointRequest::builder)
                .basePath("/20200630")
                .appendPathParam("dedicatedVantagePoints")
                .appendPathParam(request.getDedicatedVantagePointId())
                .appendQueryParam("apmDomainId", request.getApmDomainId())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .handleResponseHeaderString(
                        "opc-request-id", DeleteDedicatedVantagePointResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public DeleteMonitorResponse deleteMonitor(DeleteMonitorRequest request) {
        Objects.requireNonNull(request.getApmDomainId(), "apmDomainId is required");

        Validate.notBlank(request.getMonitorId(), "monitorId must not be blank");

        return clientCall(request, DeleteMonitorResponse::builder)
                .logger(LOG, "deleteMonitor")
                .serviceDetails("ApmSynthetic", "DeleteMonitor", "")
                .method(com.oracle.bmc.http.client.Method.DELETE)
                .requestBuilder(DeleteMonitorRequest::builder)
                .basePath("/20200630")
                .appendPathParam("monitors")
                .appendPathParam(request.getMonitorId())
                .appendQueryParam("apmDomainId", request.getApmDomainId())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .handleResponseHeaderString(
                        "opc-request-id", DeleteMonitorResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public DeleteOnPremiseVantagePointResponse deleteOnPremiseVantagePoint(
            DeleteOnPremiseVantagePointRequest request) {
        Objects.requireNonNull(request.getApmDomainId(), "apmDomainId is required");

        Validate.notBlank(
                request.getOnPremiseVantagePointId(), "onPremiseVantagePointId must not be blank");

        return clientCall(request, DeleteOnPremiseVantagePointResponse::builder)
                .logger(LOG, "deleteOnPremiseVantagePoint")
                .serviceDetails("ApmSynthetic", "DeleteOnPremiseVantagePoint", "")
                .method(com.oracle.bmc.http.client.Method.DELETE)
                .requestBuilder(DeleteOnPremiseVantagePointRequest::builder)
                .basePath("/20200630")
                .appendPathParam("onPremiseVantagePoints")
                .appendPathParam(request.getOnPremiseVantagePointId())
                .appendQueryParam("apmDomainId", request.getApmDomainId())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .handleResponseHeaderString(
                        "opc-request-id", DeleteOnPremiseVantagePointResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public DeleteScriptResponse deleteScript(DeleteScriptRequest request) {
        Objects.requireNonNull(request.getApmDomainId(), "apmDomainId is required");

        Validate.notBlank(request.getScriptId(), "scriptId must not be blank");

        return clientCall(request, DeleteScriptResponse::builder)
                .logger(LOG, "deleteScript")
                .serviceDetails("ApmSynthetic", "DeleteScript", "")
                .method(com.oracle.bmc.http.client.Method.DELETE)
                .requestBuilder(DeleteScriptRequest::builder)
                .basePath("/20200630")
                .appendPathParam("scripts")
                .appendPathParam(request.getScriptId())
                .appendQueryParam("apmDomainId", request.getApmDomainId())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .handleResponseHeaderString(
                        "opc-request-id", DeleteScriptResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public DeleteWorkerResponse deleteWorker(DeleteWorkerRequest request) {
        Objects.requireNonNull(request.getApmDomainId(), "apmDomainId is required");

        Validate.notBlank(
                request.getOnPremiseVantagePointId(), "onPremiseVantagePointId must not be blank");

        Validate.notBlank(request.getWorkerId(), "workerId must not be blank");

        return clientCall(request, DeleteWorkerResponse::builder)
                .logger(LOG, "deleteWorker")
                .serviceDetails("ApmSynthetic", "DeleteWorker", "")
                .method(com.oracle.bmc.http.client.Method.DELETE)
                .requestBuilder(DeleteWorkerRequest::builder)
                .basePath("/20200630")
                .appendPathParam("onPremiseVantagePoints")
                .appendPathParam(request.getOnPremiseVantagePointId())
                .appendPathParam("workers")
                .appendPathParam(request.getWorkerId())
                .appendQueryParam("apmDomainId", request.getApmDomainId())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .handleResponseHeaderString(
                        "opc-request-id", DeleteWorkerResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public GetDedicatedVantagePointResponse getDedicatedVantagePoint(
            GetDedicatedVantagePointRequest request) {
        Objects.requireNonNull(request.getApmDomainId(), "apmDomainId is required");

        Validate.notBlank(
                request.getDedicatedVantagePointId(), "dedicatedVantagePointId must not be blank");

        return clientCall(request, GetDedicatedVantagePointResponse::builder)
                .logger(LOG, "getDedicatedVantagePoint")
                .serviceDetails("ApmSynthetic", "GetDedicatedVantagePoint", "")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetDedicatedVantagePointRequest::builder)
                .basePath("/20200630")
                .appendPathParam("dedicatedVantagePoints")
                .appendPathParam(request.getDedicatedVantagePointId())
                .appendQueryParam("apmDomainId", request.getApmDomainId())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .handleBody(
                        com.oracle.bmc.apmsynthetics.model.DedicatedVantagePoint.class,
                        GetDedicatedVantagePointResponse.Builder::dedicatedVantagePoint)
                .handleResponseHeaderString("etag", GetDedicatedVantagePointResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", GetDedicatedVantagePointResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public GetMonitorResponse getMonitor(GetMonitorRequest request) {
        Objects.requireNonNull(request.getApmDomainId(), "apmDomainId is required");

        Validate.notBlank(request.getMonitorId(), "monitorId must not be blank");

        return clientCall(request, GetMonitorResponse::builder)
                .logger(LOG, "getMonitor")
                .serviceDetails("ApmSynthetic", "GetMonitor", "")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetMonitorRequest::builder)
                .basePath("/20200630")
                .appendPathParam("monitors")
                .appendPathParam(request.getMonitorId())
                .appendQueryParam("apmDomainId", request.getApmDomainId())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .handleBody(
                        com.oracle.bmc.apmsynthetics.model.Monitor.class,
                        GetMonitorResponse.Builder::monitor)
                .handleResponseHeaderString("etag", GetMonitorResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", GetMonitorResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public GetMonitorResultResponse getMonitorResult(GetMonitorResultRequest request) {
        Objects.requireNonNull(request.getApmDomainId(), "apmDomainId is required");

        Validate.notBlank(request.getMonitorId(), "monitorId must not be blank");
        Objects.requireNonNull(request.getVantagePoint(), "vantagePoint is required");

        Objects.requireNonNull(request.getResultType(), "resultType is required");

        Objects.requireNonNull(request.getResultContentType(), "resultContentType is required");

        Validate.notBlank(request.getExecutionTime(), "executionTime must not be blank");

        return clientCall(request, GetMonitorResultResponse::builder)
                .logger(LOG, "getMonitorResult")
                .serviceDetails("ApmSynthetic", "GetMonitorResult", "")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetMonitorResultRequest::builder)
                .basePath("/20200630")
                .appendPathParam("monitors")
                .appendPathParam(request.getMonitorId())
                .appendPathParam("results")
                .appendPathParam(request.getExecutionTime())
                .appendQueryParam("apmDomainId", request.getApmDomainId())
                .appendQueryParam("vantagePoint", request.getVantagePoint())
                .appendQueryParam("resultType", request.getResultType())
                .appendQueryParam("resultContentType", request.getResultContentType())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .handleBody(
                        com.oracle.bmc.apmsynthetics.model.MonitorResult.class,
                        GetMonitorResultResponse.Builder::monitorResult)
                .handleResponseHeaderString(
                        "opc-request-id", GetMonitorResultResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public GetOnPremiseVantagePointResponse getOnPremiseVantagePoint(
            GetOnPremiseVantagePointRequest request) {
        Objects.requireNonNull(request.getApmDomainId(), "apmDomainId is required");

        Validate.notBlank(
                request.getOnPremiseVantagePointId(), "onPremiseVantagePointId must not be blank");

        return clientCall(request, GetOnPremiseVantagePointResponse::builder)
                .logger(LOG, "getOnPremiseVantagePoint")
                .serviceDetails("ApmSynthetic", "GetOnPremiseVantagePoint", "")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetOnPremiseVantagePointRequest::builder)
                .basePath("/20200630")
                .appendPathParam("onPremiseVantagePoints")
                .appendPathParam(request.getOnPremiseVantagePointId())
                .appendQueryParam("apmDomainId", request.getApmDomainId())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .handleBody(
                        com.oracle.bmc.apmsynthetics.model.OnPremiseVantagePoint.class,
                        GetOnPremiseVantagePointResponse.Builder::onPremiseVantagePoint)
                .handleResponseHeaderString("etag", GetOnPremiseVantagePointResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", GetOnPremiseVantagePointResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public GetScriptResponse getScript(GetScriptRequest request) {
        Objects.requireNonNull(request.getApmDomainId(), "apmDomainId is required");

        Validate.notBlank(request.getScriptId(), "scriptId must not be blank");

        return clientCall(request, GetScriptResponse::builder)
                .logger(LOG, "getScript")
                .serviceDetails("ApmSynthetic", "GetScript", "")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetScriptRequest::builder)
                .basePath("/20200630")
                .appendPathParam("scripts")
                .appendPathParam(request.getScriptId())
                .appendQueryParam("apmDomainId", request.getApmDomainId())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .handleBody(
                        com.oracle.bmc.apmsynthetics.model.Script.class,
                        GetScriptResponse.Builder::script)
                .handleResponseHeaderString("etag", GetScriptResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", GetScriptResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public GetWorkerResponse getWorker(GetWorkerRequest request) {
        Objects.requireNonNull(request.getApmDomainId(), "apmDomainId is required");

        Validate.notBlank(
                request.getOnPremiseVantagePointId(), "onPremiseVantagePointId must not be blank");

        Validate.notBlank(request.getWorkerId(), "workerId must not be blank");

        return clientCall(request, GetWorkerResponse::builder)
                .logger(LOG, "getWorker")
                .serviceDetails("ApmSynthetic", "GetWorker", "")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetWorkerRequest::builder)
                .basePath("/20200630")
                .appendPathParam("onPremiseVantagePoints")
                .appendPathParam(request.getOnPremiseVantagePointId())
                .appendPathParam("workers")
                .appendPathParam(request.getWorkerId())
                .appendQueryParam("apmDomainId", request.getApmDomainId())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .handleBody(
                        com.oracle.bmc.apmsynthetics.model.Worker.class,
                        GetWorkerResponse.Builder::worker)
                .handleResponseHeaderString("etag", GetWorkerResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", GetWorkerResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public ListDedicatedVantagePointsResponse listDedicatedVantagePoints(
            ListDedicatedVantagePointsRequest request) {
        Objects.requireNonNull(request.getApmDomainId(), "apmDomainId is required");

        return clientCall(request, ListDedicatedVantagePointsResponse::builder)
                .logger(LOG, "listDedicatedVantagePoints")
                .serviceDetails("ApmSynthetic", "ListDedicatedVantagePoints", "")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListDedicatedVantagePointsRequest::builder)
                .basePath("/20200630")
                .appendPathParam("dedicatedVantagePoints")
                .appendQueryParam("apmDomainId", request.getApmDomainId())
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .appendQueryParam("displayName", request.getDisplayName())
                .appendQueryParam("name", request.getName())
                .appendEnumQueryParam("status", request.getStatus())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .handleBody(
                        com.oracle.bmc.apmsynthetics.model.DedicatedVantagePointCollection.class,
                        ListDedicatedVantagePointsResponse.Builder::dedicatedVantagePointCollection)
                .handleResponseHeaderString(
                        "opc-request-id", ListDedicatedVantagePointsResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListDedicatedVantagePointsResponse.Builder::opcNextPage)
                .callSync();
    }

    @Override
    public ListMonitorsResponse listMonitors(ListMonitorsRequest request) {
        Objects.requireNonNull(request.getApmDomainId(), "apmDomainId is required");

        return clientCall(request, ListMonitorsResponse::builder)
                .logger(LOG, "listMonitors")
                .serviceDetails("ApmSynthetic", "ListMonitors", "")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListMonitorsRequest::builder)
                .basePath("/20200630")
                .appendPathParam("monitors")
                .appendQueryParam("apmDomainId", request.getApmDomainId())
                .appendQueryParam("displayName", request.getDisplayName())
                .appendQueryParam("scriptId", request.getScriptId())
                .appendQueryParam("vantagePoint", request.getVantagePoint())
                .appendQueryParam("monitorType", request.getMonitorType())
                .appendEnumQueryParam("status", request.getStatus())
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .appendQueryParam(
                        "isMaintenanceWindowActive", request.getIsMaintenanceWindowActive())
                .appendQueryParam("isMaintenanceWindowSet", request.getIsMaintenanceWindowSet())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .handleBody(
                        com.oracle.bmc.apmsynthetics.model.MonitorCollection.class,
                        ListMonitorsResponse.Builder::monitorCollection)
                .handleResponseHeaderString(
                        "opc-request-id", ListMonitorsResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListMonitorsResponse.Builder::opcNextPage)
                .callSync();
    }

    @Override
    public ListOnPremiseVantagePointsResponse listOnPremiseVantagePoints(
            ListOnPremiseVantagePointsRequest request) {
        Objects.requireNonNull(request.getApmDomainId(), "apmDomainId is required");

        return clientCall(request, ListOnPremiseVantagePointsResponse::builder)
                .logger(LOG, "listOnPremiseVantagePoints")
                .serviceDetails("ApmSynthetic", "ListOnPremiseVantagePoints", "")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListOnPremiseVantagePointsRequest::builder)
                .basePath("/20200630")
                .appendPathParam("onPremiseVantagePoints")
                .appendQueryParam("apmDomainId", request.getApmDomainId())
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .appendQueryParam("displayName", request.getDisplayName())
                .appendQueryParam("name", request.getName())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .handleBody(
                        com.oracle.bmc.apmsynthetics.model.OnPremiseVantagePointCollection.class,
                        ListOnPremiseVantagePointsResponse.Builder::onPremiseVantagePointCollection)
                .handleResponseHeaderString(
                        "opc-request-id", ListOnPremiseVantagePointsResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListOnPremiseVantagePointsResponse.Builder::opcNextPage)
                .callSync();
    }

    @Override
    public ListPublicVantagePointsResponse listPublicVantagePoints(
            ListPublicVantagePointsRequest request) {
        Objects.requireNonNull(request.getApmDomainId(), "apmDomainId is required");

        return clientCall(request, ListPublicVantagePointsResponse::builder)
                .logger(LOG, "listPublicVantagePoints")
                .serviceDetails("ApmSynthetic", "ListPublicVantagePoints", "")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListPublicVantagePointsRequest::builder)
                .basePath("/20200630")
                .appendPathParam("publicVantagePoints")
                .appendQueryParam("apmDomainId", request.getApmDomainId())
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .appendQueryParam("displayName", request.getDisplayName())
                .appendQueryParam("name", request.getName())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .handleBody(
                        com.oracle.bmc.apmsynthetics.model.PublicVantagePointCollection.class,
                        ListPublicVantagePointsResponse.Builder::publicVantagePointCollection)
                .handleResponseHeaderString(
                        "opc-request-id", ListPublicVantagePointsResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListPublicVantagePointsResponse.Builder::opcNextPage)
                .callSync();
    }

    @Override
    public ListScriptsResponse listScripts(ListScriptsRequest request) {
        Objects.requireNonNull(request.getApmDomainId(), "apmDomainId is required");

        return clientCall(request, ListScriptsResponse::builder)
                .logger(LOG, "listScripts")
                .serviceDetails("ApmSynthetic", "ListScripts", "")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListScriptsRequest::builder)
                .basePath("/20200630")
                .appendPathParam("scripts")
                .appendQueryParam("apmDomainId", request.getApmDomainId())
                .appendQueryParam("displayName", request.getDisplayName())
                .appendQueryParam("contentType", request.getContentType())
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .handleBody(
                        com.oracle.bmc.apmsynthetics.model.ScriptCollection.class,
                        ListScriptsResponse.Builder::scriptCollection)
                .handleResponseHeaderString(
                        "opc-request-id", ListScriptsResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListScriptsResponse.Builder::opcNextPage)
                .callSync();
    }

    @Override
    public ListWorkersResponse listWorkers(ListWorkersRequest request) {
        Objects.requireNonNull(request.getApmDomainId(), "apmDomainId is required");

        Validate.notBlank(
                request.getOnPremiseVantagePointId(), "onPremiseVantagePointId must not be blank");

        return clientCall(request, ListWorkersResponse::builder)
                .logger(LOG, "listWorkers")
                .serviceDetails("ApmSynthetic", "ListWorkers", "")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListWorkersRequest::builder)
                .basePath("/20200630")
                .appendPathParam("onPremiseVantagePoints")
                .appendPathParam(request.getOnPremiseVantagePointId())
                .appendPathParam("workers")
                .appendQueryParam("apmDomainId", request.getApmDomainId())
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .appendEnumQueryParam("status", request.getStatus())
                .appendQueryParam("capability", request.getCapability())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .appendQueryParam("displayName", request.getDisplayName())
                .appendQueryParam("name", request.getName())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .handleBody(
                        com.oracle.bmc.apmsynthetics.model.WorkerCollection.class,
                        ListWorkersResponse.Builder::workerCollection)
                .handleResponseHeaderString(
                        "opc-request-id", ListWorkersResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListWorkersResponse.Builder::opcNextPage)
                .callSync();
    }

    @Override
    public UpdateDedicatedVantagePointResponse updateDedicatedVantagePoint(
            UpdateDedicatedVantagePointRequest request) {
        Objects.requireNonNull(request.getApmDomainId(), "apmDomainId is required");

        Validate.notBlank(
                request.getDedicatedVantagePointId(), "dedicatedVantagePointId must not be blank");
        Objects.requireNonNull(
                request.getUpdateDedicatedVantagePointDetails(),
                "updateDedicatedVantagePointDetails is required");

        return clientCall(request, UpdateDedicatedVantagePointResponse::builder)
                .logger(LOG, "updateDedicatedVantagePoint")
                .serviceDetails("ApmSynthetic", "UpdateDedicatedVantagePoint", "")
                .method(com.oracle.bmc.http.client.Method.PUT)
                .requestBuilder(UpdateDedicatedVantagePointRequest::builder)
                .basePath("/20200630")
                .appendPathParam("dedicatedVantagePoints")
                .appendPathParam(request.getDedicatedVantagePointId())
                .appendQueryParam("apmDomainId", request.getApmDomainId())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .hasBody()
                .handleBody(
                        com.oracle.bmc.apmsynthetics.model.DedicatedVantagePoint.class,
                        UpdateDedicatedVantagePointResponse.Builder::dedicatedVantagePoint)
                .handleResponseHeaderString(
                        "etag", UpdateDedicatedVantagePointResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", UpdateDedicatedVantagePointResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public UpdateMonitorResponse updateMonitor(UpdateMonitorRequest request) {
        Objects.requireNonNull(request.getApmDomainId(), "apmDomainId is required");

        Validate.notBlank(request.getMonitorId(), "monitorId must not be blank");
        Objects.requireNonNull(
                request.getUpdateMonitorDetails(), "updateMonitorDetails is required");

        return clientCall(request, UpdateMonitorResponse::builder)
                .logger(LOG, "updateMonitor")
                .serviceDetails("ApmSynthetic", "UpdateMonitor", "")
                .method(com.oracle.bmc.http.client.Method.PUT)
                .requestBuilder(UpdateMonitorRequest::builder)
                .basePath("/20200630")
                .appendPathParam("monitors")
                .appendPathParam(request.getMonitorId())
                .appendQueryParam("apmDomainId", request.getApmDomainId())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .hasBody()
                .handleBody(
                        com.oracle.bmc.apmsynthetics.model.Monitor.class,
                        UpdateMonitorResponse.Builder::monitor)
                .handleResponseHeaderString("etag", UpdateMonitorResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", UpdateMonitorResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public UpdateOnPremiseVantagePointResponse updateOnPremiseVantagePoint(
            UpdateOnPremiseVantagePointRequest request) {
        Objects.requireNonNull(request.getApmDomainId(), "apmDomainId is required");

        Validate.notBlank(
                request.getOnPremiseVantagePointId(), "onPremiseVantagePointId must not be blank");
        Objects.requireNonNull(
                request.getUpdateOnPremiseVantagePointDetails(),
                "updateOnPremiseVantagePointDetails is required");

        return clientCall(request, UpdateOnPremiseVantagePointResponse::builder)
                .logger(LOG, "updateOnPremiseVantagePoint")
                .serviceDetails("ApmSynthetic", "UpdateOnPremiseVantagePoint", "")
                .method(com.oracle.bmc.http.client.Method.PUT)
                .requestBuilder(UpdateOnPremiseVantagePointRequest::builder)
                .basePath("/20200630")
                .appendPathParam("onPremiseVantagePoints")
                .appendPathParam(request.getOnPremiseVantagePointId())
                .appendQueryParam("apmDomainId", request.getApmDomainId())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .hasBody()
                .handleBody(
                        com.oracle.bmc.apmsynthetics.model.OnPremiseVantagePoint.class,
                        UpdateOnPremiseVantagePointResponse.Builder::onPremiseVantagePoint)
                .handleResponseHeaderString(
                        "etag", UpdateOnPremiseVantagePointResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", UpdateOnPremiseVantagePointResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public UpdateScriptResponse updateScript(UpdateScriptRequest request) {
        Objects.requireNonNull(request.getApmDomainId(), "apmDomainId is required");

        Validate.notBlank(request.getScriptId(), "scriptId must not be blank");
        Objects.requireNonNull(request.getUpdateScriptDetails(), "updateScriptDetails is required");

        return clientCall(request, UpdateScriptResponse::builder)
                .logger(LOG, "updateScript")
                .serviceDetails("ApmSynthetic", "UpdateScript", "")
                .method(com.oracle.bmc.http.client.Method.PUT)
                .requestBuilder(UpdateScriptRequest::builder)
                .basePath("/20200630")
                .appendPathParam("scripts")
                .appendPathParam(request.getScriptId())
                .appendQueryParam("apmDomainId", request.getApmDomainId())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .hasBody()
                .handleBody(
                        com.oracle.bmc.apmsynthetics.model.Script.class,
                        UpdateScriptResponse.Builder::script)
                .handleResponseHeaderString("etag", UpdateScriptResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", UpdateScriptResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public UpdateWorkerResponse updateWorker(UpdateWorkerRequest request) {
        Objects.requireNonNull(request.getApmDomainId(), "apmDomainId is required");

        Validate.notBlank(
                request.getOnPremiseVantagePointId(), "onPremiseVantagePointId must not be blank");

        Validate.notBlank(request.getWorkerId(), "workerId must not be blank");
        Objects.requireNonNull(request.getUpdateWorkerDetails(), "updateWorkerDetails is required");

        return clientCall(request, UpdateWorkerResponse::builder)
                .logger(LOG, "updateWorker")
                .serviceDetails("ApmSynthetic", "UpdateWorker", "")
                .method(com.oracle.bmc.http.client.Method.PUT)
                .requestBuilder(UpdateWorkerRequest::builder)
                .basePath("/20200630")
                .appendPathParam("onPremiseVantagePoints")
                .appendPathParam(request.getOnPremiseVantagePointId())
                .appendPathParam("workers")
                .appendPathParam(request.getWorkerId())
                .appendQueryParam("apmDomainId", request.getApmDomainId())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .hasBody()
                .handleBody(
                        com.oracle.bmc.apmsynthetics.model.Worker.class,
                        UpdateWorkerResponse.Builder::worker)
                .handleResponseHeaderString("etag", UpdateWorkerResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", UpdateWorkerResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public ApmSyntheticPaginators getPaginators() {
        return paginators;
    }

    /**
     * Create a new client instance.
     *
     * @param authenticationDetailsProvider The authentication details (see {@link Builder#build})
     * @deprecated Use the {@link #builder() builder} instead.
     */
    @Deprecated
    public ApmSyntheticClient(
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
    public ApmSyntheticClient(
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
    public ApmSyntheticClient(
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
    public ApmSyntheticClient(
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
    public ApmSyntheticClient(
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
    public ApmSyntheticClient(
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
    public ApmSyntheticClient(
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
