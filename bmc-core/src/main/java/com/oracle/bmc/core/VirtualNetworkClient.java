/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.core;

import com.oracle.bmc.util.internal.Validate;
import com.oracle.bmc.core.requests.*;
import com.oracle.bmc.core.responses.*;
import com.oracle.bmc.circuitbreaker.CircuitBreakerConfiguration;
import com.oracle.bmc.util.CircuitBreakerUtils;

import java.util.Objects;

@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20160918")
public class VirtualNetworkClient extends com.oracle.bmc.http.internal.BaseSyncClient
        implements VirtualNetwork {
    /** Service instance for VirtualNetwork. */
    public static final com.oracle.bmc.Service SERVICE =
            com.oracle.bmc.Services.serviceBuilder()
                    .serviceName("VIRTUALNETWORK")
                    .serviceEndpointPrefix("iaas")
                    .serviceEndpointTemplate("https://iaas.{region}.{secondLevelDomain}")
                    .build();

    private static final org.slf4j.Logger LOG =
            org.slf4j.LoggerFactory.getLogger(VirtualNetworkClient.class);

    protected final java.util.concurrent.ExecutorService executorService;
    private final VirtualNetworkWaiters waiters;

    private final VirtualNetworkPaginators paginators;

    VirtualNetworkClient(
            com.oracle.bmc.common.ClientBuilderBase<?, ?> builder,
            com.oracle.bmc.auth.AbstractAuthenticationDetailsProvider authenticationDetailsProvider,
            java.util.concurrent.ExecutorService executorService) {
        this(builder, authenticationDetailsProvider, executorService, true);
    }

    VirtualNetworkClient(
            com.oracle.bmc.common.ClientBuilderBase<?, ?> builder,
            com.oracle.bmc.auth.AbstractAuthenticationDetailsProvider authenticationDetailsProvider,
            java.util.concurrent.ExecutorService executorService,
            boolean isStreamWarningEnabled) {
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
                                    .nameFormat("VirtualNetwork-waiters-%d")
                                    .build());
            threadPoolExecutor.allowCoreThreadTimeOut(true);

            executorService = threadPoolExecutor;
        }
        this.executorService = executorService;
        this.waiters = new VirtualNetworkWaiters(executorService, this);

        this.paginators = new VirtualNetworkPaginators(this);
        if (isStreamWarningEnabled && com.oracle.bmc.util.StreamUtils.isExtraStreamLogsEnabled()) {
            LOG.warn(
                    com.oracle.bmc.util.StreamUtils.getStreamWarningMessage(
                            "VirtualNetworkClient",
                            "getCpeDeviceConfigContent,getIpsecCpeDeviceConfigContent,getTunnelCpeDeviceConfigContent"));
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
            extends com.oracle.bmc.common.RegionalClientBuilder<Builder, VirtualNetworkClient> {
        private boolean isStreamWarningEnabled = true;
        private java.util.concurrent.ExecutorService executorService;

        private Builder(com.oracle.bmc.Service service) {
            super(service);
            final String packageName = "core";
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
        public VirtualNetworkClient build(
                @jakarta.annotation.Nonnull
                        com.oracle.bmc.auth.AbstractAuthenticationDetailsProvider
                                authenticationDetailsProvider) {
            return new VirtualNetworkClient(
                    this, authenticationDetailsProvider, executorService, isStreamWarningEnabled);
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
    public AddDrgRouteDistributionStatementsResponse addDrgRouteDistributionStatements(
            AddDrgRouteDistributionStatementsRequest request) {

        Validate.notBlank(
                request.getDrgRouteDistributionId(), "drgRouteDistributionId must not be blank");
        Objects.requireNonNull(
                request.getAddDrgRouteDistributionStatementsDetails(),
                "addDrgRouteDistributionStatementsDetails is required");

        return clientCall(request, AddDrgRouteDistributionStatementsResponse::builder)
                .logger(LOG, "addDrgRouteDistributionStatements")
                .serviceDetails(
                        "VirtualNetwork",
                        "AddDrgRouteDistributionStatements",
                        "https://docs.oracle.com/iaas/api/#/en/iaas/20160918/DrgRouteDistributionStatement/AddDrgRouteDistributionStatements")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(AddDrgRouteDistributionStatementsRequest::builder)
                .basePath("/20160918")
                .appendPathParam("drgRouteDistributions")
                .appendPathParam(request.getDrgRouteDistributionId())
                .appendPathParam("actions")
                .appendPathParam("addDrgRouteDistributionStatements")
                .accept("application/json")
                .hasBody()
                .handleBodyList(
                        com.oracle.bmc.core.model.DrgRouteDistributionStatement.class,
                        AddDrgRouteDistributionStatementsResponse.Builder::items)
                .handleResponseHeaderString(
                        "opc-request-id",
                        AddDrgRouteDistributionStatementsResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public AddDrgRouteRulesResponse addDrgRouteRules(AddDrgRouteRulesRequest request) {

        Validate.notBlank(request.getDrgRouteTableId(), "drgRouteTableId must not be blank");
        Objects.requireNonNull(
                request.getAddDrgRouteRulesDetails(), "addDrgRouteRulesDetails is required");

        return clientCall(request, AddDrgRouteRulesResponse::builder)
                .logger(LOG, "addDrgRouteRules")
                .serviceDetails(
                        "VirtualNetwork",
                        "AddDrgRouteRules",
                        "https://docs.oracle.com/iaas/api/#/en/iaas/20160918/DrgRouteRule/AddDrgRouteRules")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(AddDrgRouteRulesRequest::builder)
                .basePath("/20160918")
                .appendPathParam("drgRouteTables")
                .appendPathParam(request.getDrgRouteTableId())
                .appendPathParam("actions")
                .appendPathParam("addDrgRouteRules")
                .accept("application/json")
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .hasBody()
                .handleBodyList(
                        com.oracle.bmc.core.model.DrgRouteRule.class,
                        AddDrgRouteRulesResponse.Builder::items)
                .handleResponseHeaderString(
                        "opc-request-id", AddDrgRouteRulesResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public AddIpv6SubnetCidrResponse addIpv6SubnetCidr(AddIpv6SubnetCidrRequest request) {

        Validate.notBlank(request.getSubnetId(), "subnetId must not be blank");
        Objects.requireNonNull(
                request.getAddSubnetIpv6CidrDetails(), "addSubnetIpv6CidrDetails is required");

        return clientCall(request, AddIpv6SubnetCidrResponse::builder)
                .logger(LOG, "addIpv6SubnetCidr")
                .serviceDetails(
                        "VirtualNetwork",
                        "AddIpv6SubnetCidr",
                        "https://docs.oracle.com/iaas/api/#/en/iaas/20160918/Subnet/AddIpv6SubnetCidr")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(AddIpv6SubnetCidrRequest::builder)
                .basePath("/20160918")
                .appendPathParam("subnets")
                .appendPathParam(request.getSubnetId())
                .appendPathParam("actions")
                .appendPathParam("addIpv6Cidr")
                .accept("application/json")
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .hasBody()
                .handleResponseHeaderString("etag", AddIpv6SubnetCidrResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", AddIpv6SubnetCidrResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-work-request-id", AddIpv6SubnetCidrResponse.Builder::opcWorkRequestId)
                .callSync();
    }

    @Override
    public AddIpv6VcnCidrResponse addIpv6VcnCidr(AddIpv6VcnCidrRequest request) {

        Validate.notBlank(request.getVcnId(), "vcnId must not be blank");

        return clientCall(request, AddIpv6VcnCidrResponse::builder)
                .logger(LOG, "addIpv6VcnCidr")
                .serviceDetails(
                        "VirtualNetwork",
                        "AddIpv6VcnCidr",
                        "https://docs.oracle.com/iaas/api/#/en/iaas/20160918/Vcn/AddIpv6VcnCidr")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(AddIpv6VcnCidrRequest::builder)
                .basePath("/20160918")
                .appendPathParam("vcns")
                .appendPathParam(request.getVcnId())
                .appendPathParam("actions")
                .appendPathParam("addIpv6Cidr")
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("if-match", request.getIfMatch())
                .hasBody()
                .handleResponseHeaderString(
                        "opc-request-id", AddIpv6VcnCidrResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-work-request-id", AddIpv6VcnCidrResponse.Builder::opcWorkRequestId)
                .callSync();
    }

    @Override
    public AddNetworkSecurityGroupSecurityRulesResponse addNetworkSecurityGroupSecurityRules(
            AddNetworkSecurityGroupSecurityRulesRequest request) {

        Validate.notBlank(
                request.getNetworkSecurityGroupId(), "networkSecurityGroupId must not be blank");
        Objects.requireNonNull(
                request.getAddNetworkSecurityGroupSecurityRulesDetails(),
                "addNetworkSecurityGroupSecurityRulesDetails is required");

        return clientCall(request, AddNetworkSecurityGroupSecurityRulesResponse::builder)
                .logger(LOG, "addNetworkSecurityGroupSecurityRules")
                .serviceDetails(
                        "VirtualNetwork",
                        "AddNetworkSecurityGroupSecurityRules",
                        "https://docs.oracle.com/iaas/api/#/en/iaas/20160918/SecurityRule/AddNetworkSecurityGroupSecurityRules")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(AddNetworkSecurityGroupSecurityRulesRequest::builder)
                .basePath("/20160918")
                .appendPathParam("networkSecurityGroups")
                .appendPathParam(request.getNetworkSecurityGroupId())
                .appendPathParam("actions")
                .appendPathParam("addSecurityRules")
                .accept("application/json")
                .hasBody()
                .handleBody(
                        com.oracle.bmc.core.model.AddedNetworkSecurityGroupSecurityRules.class,
                        AddNetworkSecurityGroupSecurityRulesResponse.Builder
                                ::addedNetworkSecurityGroupSecurityRules)
                .handleResponseHeaderString(
                        "opc-request-id",
                        AddNetworkSecurityGroupSecurityRulesResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public AddPublicIpPoolCapacityResponse addPublicIpPoolCapacity(
            AddPublicIpPoolCapacityRequest request) {

        Validate.notBlank(request.getPublicIpPoolId(), "publicIpPoolId must not be blank");
        Objects.requireNonNull(
                request.getAddPublicIpPoolCapacityDetails(),
                "addPublicIpPoolCapacityDetails is required");

        return clientCall(request, AddPublicIpPoolCapacityResponse::builder)
                .logger(LOG, "addPublicIpPoolCapacity")
                .serviceDetails(
                        "VirtualNetwork",
                        "AddPublicIpPoolCapacity",
                        "https://docs.oracle.com/iaas/api/#/en/iaas/20160918/PublicIpPool/AddPublicIpPoolCapacity")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(AddPublicIpPoolCapacityRequest::builder)
                .basePath("/20160918")
                .appendPathParam("publicIpPools")
                .appendPathParam(request.getPublicIpPoolId())
                .appendPathParam("actions")
                .appendPathParam("addCapacity")
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.core.model.PublicIpPool.class,
                        AddPublicIpPoolCapacityResponse.Builder::publicIpPool)
                .handleResponseHeaderString("etag", AddPublicIpPoolCapacityResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", AddPublicIpPoolCapacityResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public AddVcnCidrResponse addVcnCidr(AddVcnCidrRequest request) {

        Validate.notBlank(request.getVcnId(), "vcnId must not be blank");
        Objects.requireNonNull(request.getAddVcnCidrDetails(), "addVcnCidrDetails is required");

        return clientCall(request, AddVcnCidrResponse::builder)
                .logger(LOG, "addVcnCidr")
                .serviceDetails(
                        "VirtualNetwork",
                        "AddVcnCidr",
                        "https://docs.oracle.com/iaas/api/#/en/iaas/20160918/Vcn/AddVcnCidr")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(AddVcnCidrRequest::builder)
                .basePath("/20160918")
                .appendPathParam("vcns")
                .appendPathParam(request.getVcnId())
                .appendPathParam("actions")
                .appendPathParam("addCidr")
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("if-match", request.getIfMatch())
                .hasBody()
                .handleResponseHeaderString(
                        "opc-request-id", AddVcnCidrResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-work-request-id", AddVcnCidrResponse.Builder::opcWorkRequestId)
                .callSync();
    }

    @Override
    public AdvertiseByoipRangeResponse advertiseByoipRange(AdvertiseByoipRangeRequest request) {

        Validate.notBlank(request.getByoipRangeId(), "byoipRangeId must not be blank");

        return clientCall(request, AdvertiseByoipRangeResponse::builder)
                .logger(LOG, "advertiseByoipRange")
                .serviceDetails(
                        "VirtualNetwork",
                        "AdvertiseByoipRange",
                        "https://docs.oracle.com/iaas/api/#/en/iaas/20160918/ByoipRange/AdvertiseByoipRange")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(AdvertiseByoipRangeRequest::builder)
                .basePath("/20160918")
                .appendPathParam("byoipRanges")
                .appendPathParam(request.getByoipRangeId())
                .appendPathParam("actions")
                .appendPathParam("advertise")
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleResponseHeaderString(
                        "opc-request-id", AdvertiseByoipRangeResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public AttachServiceIdResponse attachServiceId(AttachServiceIdRequest request) {

        Validate.notBlank(request.getServiceGatewayId(), "serviceGatewayId must not be blank");
        Objects.requireNonNull(
                request.getAttachServiceDetails(), "attachServiceDetails is required");

        return clientCall(request, AttachServiceIdResponse::builder)
                .logger(LOG, "attachServiceId")
                .serviceDetails(
                        "VirtualNetwork",
                        "AttachServiceId",
                        "https://docs.oracle.com/iaas/api/#/en/iaas/20160918/ServiceGateway/AttachServiceId")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(AttachServiceIdRequest::builder)
                .basePath("/20160918")
                .appendPathParam("serviceGateways")
                .appendPathParam(request.getServiceGatewayId())
                .appendPathParam("actions")
                .appendPathParam("attachService")
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.core.model.ServiceGateway.class,
                        AttachServiceIdResponse.Builder::serviceGateway)
                .handleResponseHeaderString(
                        "opc-request-id", AttachServiceIdResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public BulkAddVirtualCircuitPublicPrefixesResponse bulkAddVirtualCircuitPublicPrefixes(
            BulkAddVirtualCircuitPublicPrefixesRequest request) {

        Validate.notBlank(request.getVirtualCircuitId(), "virtualCircuitId must not be blank");
        Objects.requireNonNull(
                request.getBulkAddVirtualCircuitPublicPrefixesDetails(),
                "bulkAddVirtualCircuitPublicPrefixesDetails is required");

        return clientCall(request, BulkAddVirtualCircuitPublicPrefixesResponse::builder)
                .logger(LOG, "bulkAddVirtualCircuitPublicPrefixes")
                .serviceDetails(
                        "VirtualNetwork",
                        "BulkAddVirtualCircuitPublicPrefixes",
                        "https://docs.oracle.com/iaas/api/#/en/iaas/20160918/VirtualCircuitPublicPrefix/BulkAddVirtualCircuitPublicPrefixes")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(BulkAddVirtualCircuitPublicPrefixesRequest::builder)
                .basePath("/20160918")
                .appendPathParam("virtualCircuits")
                .appendPathParam(request.getVirtualCircuitId())
                .appendPathParam("actions")
                .appendPathParam("bulkAddPublicPrefixes")
                .accept("application/json")
                .hasBody()
                .operationUsesDefaultRetries()
                .callSync();
    }

    @Override
    public BulkDeleteVirtualCircuitPublicPrefixesResponse bulkDeleteVirtualCircuitPublicPrefixes(
            BulkDeleteVirtualCircuitPublicPrefixesRequest request) {

        Validate.notBlank(request.getVirtualCircuitId(), "virtualCircuitId must not be blank");
        Objects.requireNonNull(
                request.getBulkDeleteVirtualCircuitPublicPrefixesDetails(),
                "bulkDeleteVirtualCircuitPublicPrefixesDetails is required");

        return clientCall(request, BulkDeleteVirtualCircuitPublicPrefixesResponse::builder)
                .logger(LOG, "bulkDeleteVirtualCircuitPublicPrefixes")
                .serviceDetails(
                        "VirtualNetwork",
                        "BulkDeleteVirtualCircuitPublicPrefixes",
                        "https://docs.oracle.com/iaas/api/#/en/iaas/20160918/VirtualCircuitPublicPrefix/BulkDeleteVirtualCircuitPublicPrefixes")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(BulkDeleteVirtualCircuitPublicPrefixesRequest::builder)
                .basePath("/20160918")
                .appendPathParam("virtualCircuits")
                .appendPathParam(request.getVirtualCircuitId())
                .appendPathParam("actions")
                .appendPathParam("bulkDeletePublicPrefixes")
                .accept("application/json")
                .hasBody()
                .operationUsesDefaultRetries()
                .callSync();
    }

    @Override
    public ChangeByoipRangeCompartmentResponse changeByoipRangeCompartment(
            ChangeByoipRangeCompartmentRequest request) {

        Validate.notBlank(request.getByoipRangeId(), "byoipRangeId must not be blank");
        Objects.requireNonNull(
                request.getChangeByoipRangeCompartmentDetails(),
                "changeByoipRangeCompartmentDetails is required");

        return clientCall(request, ChangeByoipRangeCompartmentResponse::builder)
                .logger(LOG, "changeByoipRangeCompartment")
                .serviceDetails(
                        "VirtualNetwork",
                        "ChangeByoipRangeCompartment",
                        "https://docs.oracle.com/iaas/api/#/en/iaas/20160918/ByoipRange/ChangeByoipRangeCompartment")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(ChangeByoipRangeCompartmentRequest::builder)
                .basePath("/20160918")
                .appendPathParam("byoipRanges")
                .appendPathParam(request.getByoipRangeId())
                .appendPathParam("actions")
                .appendPathParam("changeCompartment")
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .hasBody()
                .handleResponseHeaderString(
                        "opc-request-id", ChangeByoipRangeCompartmentResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public ChangeCaptureFilterCompartmentResponse changeCaptureFilterCompartment(
            ChangeCaptureFilterCompartmentRequest request) {

        Validate.notBlank(request.getCaptureFilterId(), "captureFilterId must not be blank");
        Objects.requireNonNull(
                request.getChangeCaptureFilterCompartmentDetails(),
                "changeCaptureFilterCompartmentDetails is required");

        return clientCall(request, ChangeCaptureFilterCompartmentResponse::builder)
                .logger(LOG, "changeCaptureFilterCompartment")
                .serviceDetails(
                        "VirtualNetwork",
                        "ChangeCaptureFilterCompartment",
                        "https://docs.oracle.com/iaas/api/#/en/iaas/20160918/CaptureFilter/ChangeCaptureFilterCompartment")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(ChangeCaptureFilterCompartmentRequest::builder)
                .basePath("/20160918")
                .appendPathParam("captureFilters")
                .appendPathParam(request.getCaptureFilterId())
                .appendPathParam("actions")
                .appendPathParam("changeCompartment")
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .hasBody()
                .handleResponseHeaderString(
                        "etag", ChangeCaptureFilterCompartmentResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id",
                        ChangeCaptureFilterCompartmentResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        ChangeCaptureFilterCompartmentResponse.Builder::opcWorkRequestId)
                .callSync();
    }

    @Override
    public ChangeCpeCompartmentResponse changeCpeCompartment(ChangeCpeCompartmentRequest request) {

        Validate.notBlank(request.getCpeId(), "cpeId must not be blank");
        Objects.requireNonNull(
                request.getChangeCpeCompartmentDetails(),
                "changeCpeCompartmentDetails is required");

        return clientCall(request, ChangeCpeCompartmentResponse::builder)
                .logger(LOG, "changeCpeCompartment")
                .serviceDetails(
                        "VirtualNetwork",
                        "ChangeCpeCompartment",
                        "https://docs.oracle.com/iaas/api/#/en/iaas/20160918/Cpe/ChangeCpeCompartment")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(ChangeCpeCompartmentRequest::builder)
                .basePath("/20160918")
                .appendPathParam("cpes")
                .appendPathParam(request.getCpeId())
                .appendPathParam("actions")
                .appendPathParam("changeCompartment")
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .hasBody()
                .handleResponseHeaderString("etag", ChangeCpeCompartmentResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", ChangeCpeCompartmentResponse.Builder::opcRequestId)
                .operationUsesDefaultRetries()
                .callSync();
    }

    @Override
    public ChangeCrossConnectCompartmentResponse changeCrossConnectCompartment(
            ChangeCrossConnectCompartmentRequest request) {

        Validate.notBlank(request.getCrossConnectId(), "crossConnectId must not be blank");
        Objects.requireNonNull(
                request.getChangeCrossConnectCompartmentDetails(),
                "changeCrossConnectCompartmentDetails is required");

        return clientCall(request, ChangeCrossConnectCompartmentResponse::builder)
                .logger(LOG, "changeCrossConnectCompartment")
                .serviceDetails(
                        "VirtualNetwork",
                        "ChangeCrossConnectCompartment",
                        "https://docs.oracle.com/iaas/api/#/en/iaas/20160918/CrossConnect/ChangeCrossConnectCompartment")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(ChangeCrossConnectCompartmentRequest::builder)
                .basePath("/20160918")
                .appendPathParam("crossConnects")
                .appendPathParam(request.getCrossConnectId())
                .appendPathParam("actions")
                .appendPathParam("changeCompartment")
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .hasBody()
                .handleResponseHeaderString(
                        "etag", ChangeCrossConnectCompartmentResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id",
                        ChangeCrossConnectCompartmentResponse.Builder::opcRequestId)
                .operationUsesDefaultRetries()
                .callSync();
    }

    @Override
    public ChangeCrossConnectGroupCompartmentResponse changeCrossConnectGroupCompartment(
            ChangeCrossConnectGroupCompartmentRequest request) {

        Validate.notBlank(
                request.getCrossConnectGroupId(), "crossConnectGroupId must not be blank");
        Objects.requireNonNull(
                request.getChangeCrossConnectGroupCompartmentDetails(),
                "changeCrossConnectGroupCompartmentDetails is required");

        return clientCall(request, ChangeCrossConnectGroupCompartmentResponse::builder)
                .logger(LOG, "changeCrossConnectGroupCompartment")
                .serviceDetails(
                        "VirtualNetwork",
                        "ChangeCrossConnectGroupCompartment",
                        "https://docs.oracle.com/iaas/api/#/en/iaas/20160918/CrossConnectGroup/ChangeCrossConnectGroupCompartment")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(ChangeCrossConnectGroupCompartmentRequest::builder)
                .basePath("/20160918")
                .appendPathParam("crossConnectGroups")
                .appendPathParam(request.getCrossConnectGroupId())
                .appendPathParam("actions")
                .appendPathParam("changeCompartment")
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .hasBody()
                .handleResponseHeaderString(
                        "etag", ChangeCrossConnectGroupCompartmentResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id",
                        ChangeCrossConnectGroupCompartmentResponse.Builder::opcRequestId)
                .operationUsesDefaultRetries()
                .callSync();
    }

    @Override
    public ChangeDhcpOptionsCompartmentResponse changeDhcpOptionsCompartment(
            ChangeDhcpOptionsCompartmentRequest request) {

        Validate.notBlank(request.getDhcpId(), "dhcpId must not be blank");
        Objects.requireNonNull(
                request.getChangeDhcpOptionsCompartmentDetails(),
                "changeDhcpOptionsCompartmentDetails is required");

        return clientCall(request, ChangeDhcpOptionsCompartmentResponse::builder)
                .logger(LOG, "changeDhcpOptionsCompartment")
                .serviceDetails(
                        "VirtualNetwork",
                        "ChangeDhcpOptionsCompartment",
                        "https://docs.oracle.com/iaas/api/#/en/iaas/20160918/DhcpOptions/ChangeDhcpOptionsCompartment")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(ChangeDhcpOptionsCompartmentRequest::builder)
                .basePath("/20160918")
                .appendPathParam("dhcps")
                .appendPathParam(request.getDhcpId())
                .appendPathParam("actions")
                .appendPathParam("changeCompartment")
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .hasBody()
                .handleResponseHeaderString(
                        "etag", ChangeDhcpOptionsCompartmentResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id",
                        ChangeDhcpOptionsCompartmentResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public ChangeDrgCompartmentResponse changeDrgCompartment(ChangeDrgCompartmentRequest request) {

        Validate.notBlank(request.getDrgId(), "drgId must not be blank");
        Objects.requireNonNull(
                request.getChangeDrgCompartmentDetails(),
                "changeDrgCompartmentDetails is required");

        return clientCall(request, ChangeDrgCompartmentResponse::builder)
                .logger(LOG, "changeDrgCompartment")
                .serviceDetails(
                        "VirtualNetwork",
                        "ChangeDrgCompartment",
                        "https://docs.oracle.com/iaas/api/#/en/iaas/20160918/Drg/ChangeDrgCompartment")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(ChangeDrgCompartmentRequest::builder)
                .basePath("/20160918")
                .appendPathParam("drgs")
                .appendPathParam(request.getDrgId())
                .appendPathParam("actions")
                .appendPathParam("changeCompartment")
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .hasBody()
                .handleResponseHeaderString("etag", ChangeDrgCompartmentResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", ChangeDrgCompartmentResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        ChangeDrgCompartmentResponse.Builder::opcWorkRequestId)
                .callSync();
    }

    @Override
    public ChangeIPSecConnectionCompartmentResponse changeIPSecConnectionCompartment(
            ChangeIPSecConnectionCompartmentRequest request) {

        Validate.notBlank(request.getIpscId(), "ipscId must not be blank");
        Objects.requireNonNull(
                request.getChangeIPSecConnectionCompartmentDetails(),
                "changeIPSecConnectionCompartmentDetails is required");

        return clientCall(request, ChangeIPSecConnectionCompartmentResponse::builder)
                .logger(LOG, "changeIPSecConnectionCompartment")
                .serviceDetails(
                        "VirtualNetwork",
                        "ChangeIPSecConnectionCompartment",
                        "https://docs.oracle.com/iaas/api/#/en/iaas/20160918/IPSecConnection/ChangeIPSecConnectionCompartment")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(ChangeIPSecConnectionCompartmentRequest::builder)
                .basePath("/20160918")
                .appendPathParam("ipsecConnections")
                .appendPathParam(request.getIpscId())
                .appendPathParam("actions")
                .appendPathParam("changeCompartment")
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .hasBody()
                .handleResponseHeaderString(
                        "etag", ChangeIPSecConnectionCompartmentResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id",
                        ChangeIPSecConnectionCompartmentResponse.Builder::opcRequestId)
                .operationUsesDefaultRetries()
                .callSync();
    }

    @Override
    public ChangeInternetGatewayCompartmentResponse changeInternetGatewayCompartment(
            ChangeInternetGatewayCompartmentRequest request) {

        Validate.notBlank(request.getIgId(), "igId must not be blank");
        Objects.requireNonNull(
                request.getChangeInternetGatewayCompartmentDetails(),
                "changeInternetGatewayCompartmentDetails is required");

        return clientCall(request, ChangeInternetGatewayCompartmentResponse::builder)
                .logger(LOG, "changeInternetGatewayCompartment")
                .serviceDetails(
                        "VirtualNetwork",
                        "ChangeInternetGatewayCompartment",
                        "https://docs.oracle.com/iaas/api/#/en/iaas/20160918/InternetGateway/ChangeInternetGatewayCompartment")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(ChangeInternetGatewayCompartmentRequest::builder)
                .basePath("/20160918")
                .appendPathParam("internetGateways")
                .appendPathParam(request.getIgId())
                .appendPathParam("actions")
                .appendPathParam("changeCompartment")
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .hasBody()
                .handleResponseHeaderString(
                        "etag", ChangeInternetGatewayCompartmentResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id",
                        ChangeInternetGatewayCompartmentResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public ChangeLocalPeeringGatewayCompartmentResponse changeLocalPeeringGatewayCompartment(
            ChangeLocalPeeringGatewayCompartmentRequest request) {

        Validate.notBlank(
                request.getLocalPeeringGatewayId(), "localPeeringGatewayId must not be blank");
        Objects.requireNonNull(
                request.getChangeLocalPeeringGatewayCompartmentDetails(),
                "changeLocalPeeringGatewayCompartmentDetails is required");

        return clientCall(request, ChangeLocalPeeringGatewayCompartmentResponse::builder)
                .logger(LOG, "changeLocalPeeringGatewayCompartment")
                .serviceDetails(
                        "VirtualNetwork",
                        "ChangeLocalPeeringGatewayCompartment",
                        "https://docs.oracle.com/iaas/api/#/en/iaas/20160918/LocalPeeringGateway/ChangeLocalPeeringGatewayCompartment")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(ChangeLocalPeeringGatewayCompartmentRequest::builder)
                .basePath("/20160918")
                .appendPathParam("localPeeringGateways")
                .appendPathParam(request.getLocalPeeringGatewayId())
                .appendPathParam("actions")
                .appendPathParam("changeCompartment")
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .hasBody()
                .handleResponseHeaderString(
                        "etag", ChangeLocalPeeringGatewayCompartmentResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id",
                        ChangeLocalPeeringGatewayCompartmentResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public ChangeNatGatewayCompartmentResponse changeNatGatewayCompartment(
            ChangeNatGatewayCompartmentRequest request) {

        Validate.notBlank(request.getNatGatewayId(), "natGatewayId must not be blank");
        Objects.requireNonNull(
                request.getChangeNatGatewayCompartmentDetails(),
                "changeNatGatewayCompartmentDetails is required");

        return clientCall(request, ChangeNatGatewayCompartmentResponse::builder)
                .logger(LOG, "changeNatGatewayCompartment")
                .serviceDetails(
                        "VirtualNetwork",
                        "ChangeNatGatewayCompartment",
                        "https://docs.oracle.com/iaas/api/#/en/iaas/20160918/NatGateway/ChangeNatGatewayCompartment")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(ChangeNatGatewayCompartmentRequest::builder)
                .basePath("/20160918")
                .appendPathParam("natGateways")
                .appendPathParam(request.getNatGatewayId())
                .appendPathParam("actions")
                .appendPathParam("changeCompartment")
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .hasBody()
                .handleResponseHeaderString(
                        "etag", ChangeNatGatewayCompartmentResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", ChangeNatGatewayCompartmentResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public ChangeNetworkSecurityGroupCompartmentResponse changeNetworkSecurityGroupCompartment(
            ChangeNetworkSecurityGroupCompartmentRequest request) {

        Validate.notBlank(
                request.getNetworkSecurityGroupId(), "networkSecurityGroupId must not be blank");
        Objects.requireNonNull(
                request.getChangeNetworkSecurityGroupCompartmentDetails(),
                "changeNetworkSecurityGroupCompartmentDetails is required");

        return clientCall(request, ChangeNetworkSecurityGroupCompartmentResponse::builder)
                .logger(LOG, "changeNetworkSecurityGroupCompartment")
                .serviceDetails(
                        "VirtualNetwork",
                        "ChangeNetworkSecurityGroupCompartment",
                        "https://docs.oracle.com/iaas/api/#/en/iaas/20160918/NetworkSecurityGroup/ChangeNetworkSecurityGroupCompartment")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(ChangeNetworkSecurityGroupCompartmentRequest::builder)
                .basePath("/20160918")
                .appendPathParam("networkSecurityGroups")
                .appendPathParam(request.getNetworkSecurityGroupId())
                .appendPathParam("actions")
                .appendPathParam("changeCompartment")
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .hasBody()
                .handleResponseHeaderString(
                        "etag", ChangeNetworkSecurityGroupCompartmentResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id",
                        ChangeNetworkSecurityGroupCompartmentResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public ChangePublicIpCompartmentResponse changePublicIpCompartment(
            ChangePublicIpCompartmentRequest request) {

        Validate.notBlank(request.getPublicIpId(), "publicIpId must not be blank");
        Objects.requireNonNull(
                request.getChangePublicIpCompartmentDetails(),
                "changePublicIpCompartmentDetails is required");

        return clientCall(request, ChangePublicIpCompartmentResponse::builder)
                .logger(LOG, "changePublicIpCompartment")
                .serviceDetails(
                        "VirtualNetwork",
                        "ChangePublicIpCompartment",
                        "https://docs.oracle.com/iaas/api/#/en/iaas/20160918/PublicIp/ChangePublicIpCompartment")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(ChangePublicIpCompartmentRequest::builder)
                .basePath("/20160918")
                .appendPathParam("publicIps")
                .appendPathParam(request.getPublicIpId())
                .appendPathParam("actions")
                .appendPathParam("changeCompartment")
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .hasBody()
                .handleResponseHeaderString("etag", ChangePublicIpCompartmentResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", ChangePublicIpCompartmentResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public ChangePublicIpPoolCompartmentResponse changePublicIpPoolCompartment(
            ChangePublicIpPoolCompartmentRequest request) {

        Validate.notBlank(request.getPublicIpPoolId(), "publicIpPoolId must not be blank");
        Objects.requireNonNull(
                request.getChangePublicIpPoolCompartmentDetails(),
                "changePublicIpPoolCompartmentDetails is required");

        return clientCall(request, ChangePublicIpPoolCompartmentResponse::builder)
                .logger(LOG, "changePublicIpPoolCompartment")
                .serviceDetails(
                        "VirtualNetwork",
                        "ChangePublicIpPoolCompartment",
                        "https://docs.oracle.com/iaas/api/#/en/iaas/20160918/PublicIpPool/ChangePublicIpPoolCompartment")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(ChangePublicIpPoolCompartmentRequest::builder)
                .basePath("/20160918")
                .appendPathParam("publicIpPools")
                .appendPathParam(request.getPublicIpPoolId())
                .appendPathParam("actions")
                .appendPathParam("changeCompartment")
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .hasBody()
                .handleResponseHeaderString(
                        "opc-request-id",
                        ChangePublicIpPoolCompartmentResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public ChangeRemotePeeringConnectionCompartmentResponse
            changeRemotePeeringConnectionCompartment(
                    ChangeRemotePeeringConnectionCompartmentRequest request) {

        Validate.notBlank(
                request.getRemotePeeringConnectionId(),
                "remotePeeringConnectionId must not be blank");
        Objects.requireNonNull(
                request.getChangeRemotePeeringConnectionCompartmentDetails(),
                "changeRemotePeeringConnectionCompartmentDetails is required");

        return clientCall(request, ChangeRemotePeeringConnectionCompartmentResponse::builder)
                .logger(LOG, "changeRemotePeeringConnectionCompartment")
                .serviceDetails(
                        "VirtualNetwork",
                        "ChangeRemotePeeringConnectionCompartment",
                        "https://docs.oracle.com/iaas/api/#/en/iaas/20160918/RemotePeeringConnection/ChangeRemotePeeringConnectionCompartment")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(ChangeRemotePeeringConnectionCompartmentRequest::builder)
                .basePath("/20160918")
                .appendPathParam("remotePeeringConnections")
                .appendPathParam(request.getRemotePeeringConnectionId())
                .appendPathParam("actions")
                .appendPathParam("changeCompartment")
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .hasBody()
                .handleResponseHeaderString(
                        "etag", ChangeRemotePeeringConnectionCompartmentResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id",
                        ChangeRemotePeeringConnectionCompartmentResponse.Builder::opcRequestId)
                .operationUsesDefaultRetries()
                .callSync();
    }

    @Override
    public ChangeRouteTableCompartmentResponse changeRouteTableCompartment(
            ChangeRouteTableCompartmentRequest request) {

        Validate.notBlank(request.getRtId(), "rtId must not be blank");
        Objects.requireNonNull(
                request.getChangeRouteTableCompartmentDetails(),
                "changeRouteTableCompartmentDetails is required");

        return clientCall(request, ChangeRouteTableCompartmentResponse::builder)
                .logger(LOG, "changeRouteTableCompartment")
                .serviceDetails(
                        "VirtualNetwork",
                        "ChangeRouteTableCompartment",
                        "https://docs.oracle.com/iaas/api/#/en/iaas/20160918/RouteTable/ChangeRouteTableCompartment")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(ChangeRouteTableCompartmentRequest::builder)
                .basePath("/20160918")
                .appendPathParam("routeTables")
                .appendPathParam(request.getRtId())
                .appendPathParam("actions")
                .appendPathParam("changeCompartment")
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .hasBody()
                .handleResponseHeaderString(
                        "etag", ChangeRouteTableCompartmentResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", ChangeRouteTableCompartmentResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public ChangeSecurityListCompartmentResponse changeSecurityListCompartment(
            ChangeSecurityListCompartmentRequest request) {

        Validate.notBlank(request.getSecurityListId(), "securityListId must not be blank");
        Objects.requireNonNull(
                request.getChangeSecurityListCompartmentDetails(),
                "changeSecurityListCompartmentDetails is required");

        return clientCall(request, ChangeSecurityListCompartmentResponse::builder)
                .logger(LOG, "changeSecurityListCompartment")
                .serviceDetails(
                        "VirtualNetwork",
                        "ChangeSecurityListCompartment",
                        "https://docs.oracle.com/iaas/api/#/en/iaas/20160918/SecurityList/ChangeSecurityListCompartment")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(ChangeSecurityListCompartmentRequest::builder)
                .basePath("/20160918")
                .appendPathParam("securityLists")
                .appendPathParam(request.getSecurityListId())
                .appendPathParam("actions")
                .appendPathParam("changeCompartment")
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .hasBody()
                .handleResponseHeaderString(
                        "etag", ChangeSecurityListCompartmentResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id",
                        ChangeSecurityListCompartmentResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public ChangeServiceGatewayCompartmentResponse changeServiceGatewayCompartment(
            ChangeServiceGatewayCompartmentRequest request) {

        Validate.notBlank(request.getServiceGatewayId(), "serviceGatewayId must not be blank");
        Objects.requireNonNull(
                request.getChangeServiceGatewayCompartmentDetails(),
                "changeServiceGatewayCompartmentDetails is required");

        return clientCall(request, ChangeServiceGatewayCompartmentResponse::builder)
                .logger(LOG, "changeServiceGatewayCompartment")
                .serviceDetails(
                        "VirtualNetwork",
                        "ChangeServiceGatewayCompartment",
                        "https://docs.oracle.com/iaas/api/#/en/iaas/20160918/ServiceGateway/ChangeServiceGatewayCompartment")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(ChangeServiceGatewayCompartmentRequest::builder)
                .basePath("/20160918")
                .appendPathParam("serviceGateways")
                .appendPathParam(request.getServiceGatewayId())
                .appendPathParam("actions")
                .appendPathParam("changeCompartment")
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .hasBody()
                .handleResponseHeaderString(
                        "etag", ChangeServiceGatewayCompartmentResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id",
                        ChangeServiceGatewayCompartmentResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public ChangeSubnetCompartmentResponse changeSubnetCompartment(
            ChangeSubnetCompartmentRequest request) {

        Validate.notBlank(request.getSubnetId(), "subnetId must not be blank");
        Objects.requireNonNull(
                request.getChangeSubnetCompartmentDetails(),
                "changeSubnetCompartmentDetails is required");

        return clientCall(request, ChangeSubnetCompartmentResponse::builder)
                .logger(LOG, "changeSubnetCompartment")
                .serviceDetails(
                        "VirtualNetwork",
                        "ChangeSubnetCompartment",
                        "https://docs.oracle.com/iaas/api/#/en/iaas/20160918/Subnet/ChangeSubnetCompartment")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(ChangeSubnetCompartmentRequest::builder)
                .basePath("/20160918")
                .appendPathParam("subnets")
                .appendPathParam(request.getSubnetId())
                .appendPathParam("actions")
                .appendPathParam("changeCompartment")
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .hasBody()
                .handleResponseHeaderString("etag", ChangeSubnetCompartmentResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", ChangeSubnetCompartmentResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        ChangeSubnetCompartmentResponse.Builder::opcWorkRequestId)
                .callSync();
    }

    @Override
    public ChangeVcnCompartmentResponse changeVcnCompartment(ChangeVcnCompartmentRequest request) {

        Validate.notBlank(request.getVcnId(), "vcnId must not be blank");
        Objects.requireNonNull(
                request.getChangeVcnCompartmentDetails(),
                "changeVcnCompartmentDetails is required");

        return clientCall(request, ChangeVcnCompartmentResponse::builder)
                .logger(LOG, "changeVcnCompartment")
                .serviceDetails(
                        "VirtualNetwork",
                        "ChangeVcnCompartment",
                        "https://docs.oracle.com/iaas/api/#/en/iaas/20160918/Vcn/ChangeVcnCompartment")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(ChangeVcnCompartmentRequest::builder)
                .basePath("/20160918")
                .appendPathParam("vcns")
                .appendPathParam(request.getVcnId())
                .appendPathParam("actions")
                .appendPathParam("changeCompartment")
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .hasBody()
                .handleResponseHeaderString("etag", ChangeVcnCompartmentResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", ChangeVcnCompartmentResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        ChangeVcnCompartmentResponse.Builder::opcWorkRequestId)
                .callSync();
    }

    @Override
    public ChangeVirtualCircuitCompartmentResponse changeVirtualCircuitCompartment(
            ChangeVirtualCircuitCompartmentRequest request) {

        Validate.notBlank(request.getVirtualCircuitId(), "virtualCircuitId must not be blank");
        Objects.requireNonNull(
                request.getChangeVirtualCircuitCompartmentDetails(),
                "changeVirtualCircuitCompartmentDetails is required");

        return clientCall(request, ChangeVirtualCircuitCompartmentResponse::builder)
                .logger(LOG, "changeVirtualCircuitCompartment")
                .serviceDetails(
                        "VirtualNetwork",
                        "ChangeVirtualCircuitCompartment",
                        "https://docs.oracle.com/iaas/api/#/en/iaas/20160918/VirtualCircuit/ChangeVirtualCircuitCompartment")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(ChangeVirtualCircuitCompartmentRequest::builder)
                .basePath("/20160918")
                .appendPathParam("virtualCircuits")
                .appendPathParam(request.getVirtualCircuitId())
                .appendPathParam("actions")
                .appendPathParam("changeCompartment")
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .hasBody()
                .handleResponseHeaderString(
                        "etag", ChangeVirtualCircuitCompartmentResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id",
                        ChangeVirtualCircuitCompartmentResponse.Builder::opcRequestId)
                .operationUsesDefaultRetries()
                .callSync();
    }

    @Override
    public ChangeVlanCompartmentResponse changeVlanCompartment(
            ChangeVlanCompartmentRequest request) {

        Validate.notBlank(request.getVlanId(), "vlanId must not be blank");
        Objects.requireNonNull(
                request.getChangeVlanCompartmentDetails(),
                "changeVlanCompartmentDetails is required");

        return clientCall(request, ChangeVlanCompartmentResponse::builder)
                .logger(LOG, "changeVlanCompartment")
                .serviceDetails(
                        "VirtualNetwork",
                        "ChangeVlanCompartment",
                        "https://docs.oracle.com/iaas/api/#/en/iaas/20160918/Vlan/ChangeVlanCompartment")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(ChangeVlanCompartmentRequest::builder)
                .basePath("/20160918")
                .appendPathParam("vlans")
                .appendPathParam(request.getVlanId())
                .appendPathParam("actions")
                .appendPathParam("changeCompartment")
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .hasBody()
                .handleResponseHeaderString(
                        "opc-request-id", ChangeVlanCompartmentResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        ChangeVlanCompartmentResponse.Builder::opcWorkRequestId)
                .callSync();
    }

    @Override
    public ChangeVtapCompartmentResponse changeVtapCompartment(
            ChangeVtapCompartmentRequest request) {

        Validate.notBlank(request.getVtapId(), "vtapId must not be blank");
        Objects.requireNonNull(
                request.getChangeVtapCompartmentDetails(),
                "changeVtapCompartmentDetails is required");

        return clientCall(request, ChangeVtapCompartmentResponse::builder)
                .logger(LOG, "changeVtapCompartment")
                .serviceDetails(
                        "VirtualNetwork",
                        "ChangeVtapCompartment",
                        "https://docs.oracle.com/iaas/api/#/en/iaas/20160918/Vtap/ChangeVtapCompartment")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(ChangeVtapCompartmentRequest::builder)
                .basePath("/20160918")
                .appendPathParam("vtaps")
                .appendPathParam(request.getVtapId())
                .appendPathParam("actions")
                .appendPathParam("changeCompartment")
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .hasBody()
                .handleResponseHeaderString("etag", ChangeVtapCompartmentResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", ChangeVtapCompartmentResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        ChangeVtapCompartmentResponse.Builder::opcWorkRequestId)
                .callSync();
    }

    @Override
    public ConnectLocalPeeringGatewaysResponse connectLocalPeeringGateways(
            ConnectLocalPeeringGatewaysRequest request) {

        Validate.notBlank(
                request.getLocalPeeringGatewayId(), "localPeeringGatewayId must not be blank");
        Objects.requireNonNull(
                request.getConnectLocalPeeringGatewaysDetails(),
                "connectLocalPeeringGatewaysDetails is required");

        return clientCall(request, ConnectLocalPeeringGatewaysResponse::builder)
                .logger(LOG, "connectLocalPeeringGateways")
                .serviceDetails(
                        "VirtualNetwork",
                        "ConnectLocalPeeringGateways",
                        "https://docs.oracle.com/iaas/api/#/en/iaas/20160918/LocalPeeringGateway/ConnectLocalPeeringGateways")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(ConnectLocalPeeringGatewaysRequest::builder)
                .basePath("/20160918")
                .appendPathParam("localPeeringGateways")
                .appendPathParam(request.getLocalPeeringGatewayId())
                .appendPathParam("actions")
                .appendPathParam("connect")
                .accept("application/json")
                .hasBody()
                .handleResponseHeaderString(
                        "opc-request-id", ConnectLocalPeeringGatewaysResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public ConnectRemotePeeringConnectionsResponse connectRemotePeeringConnections(
            ConnectRemotePeeringConnectionsRequest request) {

        Validate.notBlank(
                request.getRemotePeeringConnectionId(),
                "remotePeeringConnectionId must not be blank");
        Objects.requireNonNull(
                request.getConnectRemotePeeringConnectionsDetails(),
                "connectRemotePeeringConnectionsDetails is required");

        return clientCall(request, ConnectRemotePeeringConnectionsResponse::builder)
                .logger(LOG, "connectRemotePeeringConnections")
                .serviceDetails(
                        "VirtualNetwork",
                        "ConnectRemotePeeringConnections",
                        "https://docs.oracle.com/iaas/api/#/en/iaas/20160918/RemotePeeringConnection/ConnectRemotePeeringConnections")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(ConnectRemotePeeringConnectionsRequest::builder)
                .basePath("/20160918")
                .appendPathParam("remotePeeringConnections")
                .appendPathParam(request.getRemotePeeringConnectionId())
                .appendPathParam("actions")
                .appendPathParam("connect")
                .accept("application/json")
                .hasBody()
                .handleResponseHeaderString(
                        "opc-request-id",
                        ConnectRemotePeeringConnectionsResponse.Builder::opcRequestId)
                .operationUsesDefaultRetries()
                .callSync();
    }

    @Override
    public CreateByoipRangeResponse createByoipRange(CreateByoipRangeRequest request) {
        Objects.requireNonNull(
                request.getCreateByoipRangeDetails(), "createByoipRangeDetails is required");

        return clientCall(request, CreateByoipRangeResponse::builder)
                .logger(LOG, "createByoipRange")
                .serviceDetails(
                        "VirtualNetwork",
                        "CreateByoipRange",
                        "https://docs.oracle.com/iaas/api/#/en/iaas/20160918/ByoipRange/CreateByoipRange")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(CreateByoipRangeRequest::builder)
                .basePath("/20160918")
                .appendPathParam("byoipRanges")
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.core.model.ByoipRange.class,
                        CreateByoipRangeResponse.Builder::byoipRange)
                .handleResponseHeaderString("etag", CreateByoipRangeResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", CreateByoipRangeResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public CreateCaptureFilterResponse createCaptureFilter(CreateCaptureFilterRequest request) {
        Objects.requireNonNull(
                request.getCreateCaptureFilterDetails(), "createCaptureFilterDetails is required");

        return clientCall(request, CreateCaptureFilterResponse::builder)
                .logger(LOG, "createCaptureFilter")
                .serviceDetails(
                        "VirtualNetwork",
                        "CreateCaptureFilter",
                        "https://docs.oracle.com/iaas/api/#/en/iaas/20160918/CaptureFilter/CreateCaptureFilter")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(CreateCaptureFilterRequest::builder)
                .basePath("/20160918")
                .appendPathParam("captureFilters")
                .accept("application/json")
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.core.model.CaptureFilter.class,
                        CreateCaptureFilterResponse.Builder::captureFilter)
                .handleResponseHeaderString("etag", CreateCaptureFilterResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", CreateCaptureFilterResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public CreateCpeResponse createCpe(CreateCpeRequest request) {
        Objects.requireNonNull(request.getCreateCpeDetails(), "createCpeDetails is required");

        return clientCall(request, CreateCpeResponse::builder)
                .logger(LOG, "createCpe")
                .serviceDetails(
                        "VirtualNetwork",
                        "CreateCpe",
                        "https://docs.oracle.com/iaas/api/#/en/iaas/20160918/Cpe/CreateCpe")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(CreateCpeRequest::builder)
                .basePath("/20160918")
                .appendPathParam("cpes")
                .accept("application/json")
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .hasBody()
                .handleBody(com.oracle.bmc.core.model.Cpe.class, CreateCpeResponse.Builder::cpe)
                .handleResponseHeaderString("etag", CreateCpeResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", CreateCpeResponse.Builder::opcRequestId)
                .operationUsesDefaultRetries()
                .callSync();
    }

    @Override
    public CreateCrossConnectResponse createCrossConnect(CreateCrossConnectRequest request) {
        Objects.requireNonNull(
                request.getCreateCrossConnectDetails(), "createCrossConnectDetails is required");

        return clientCall(request, CreateCrossConnectResponse::builder)
                .logger(LOG, "createCrossConnect")
                .serviceDetails(
                        "VirtualNetwork",
                        "CreateCrossConnect",
                        "https://docs.oracle.com/iaas/api/#/en/iaas/20160918/CrossConnect/CreateCrossConnect")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(CreateCrossConnectRequest::builder)
                .basePath("/20160918")
                .appendPathParam("crossConnects")
                .accept("application/json")
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.core.model.CrossConnect.class,
                        CreateCrossConnectResponse.Builder::crossConnect)
                .handleResponseHeaderString("etag", CreateCrossConnectResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", CreateCrossConnectResponse.Builder::opcRequestId)
                .operationUsesDefaultRetries()
                .callSync();
    }

    @Override
    public CreateCrossConnectGroupResponse createCrossConnectGroup(
            CreateCrossConnectGroupRequest request) {
        Objects.requireNonNull(
                request.getCreateCrossConnectGroupDetails(),
                "createCrossConnectGroupDetails is required");

        return clientCall(request, CreateCrossConnectGroupResponse::builder)
                .logger(LOG, "createCrossConnectGroup")
                .serviceDetails(
                        "VirtualNetwork",
                        "CreateCrossConnectGroup",
                        "https://docs.oracle.com/iaas/api/#/en/iaas/20160918/CrossConnectGroup/CreateCrossConnectGroup")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(CreateCrossConnectGroupRequest::builder)
                .basePath("/20160918")
                .appendPathParam("crossConnectGroups")
                .accept("application/json")
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.core.model.CrossConnectGroup.class,
                        CreateCrossConnectGroupResponse.Builder::crossConnectGroup)
                .handleResponseHeaderString("etag", CreateCrossConnectGroupResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", CreateCrossConnectGroupResponse.Builder::opcRequestId)
                .operationUsesDefaultRetries()
                .callSync();
    }

    @Override
    public CreateDhcpOptionsResponse createDhcpOptions(CreateDhcpOptionsRequest request) {
        Objects.requireNonNull(request.getCreateDhcpDetails(), "createDhcpDetails is required");

        return clientCall(request, CreateDhcpOptionsResponse::builder)
                .logger(LOG, "createDhcpOptions")
                .serviceDetails(
                        "VirtualNetwork",
                        "CreateDhcpOptions",
                        "https://docs.oracle.com/iaas/api/#/en/iaas/20160918/DhcpOptions/CreateDhcpOptions")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(CreateDhcpOptionsRequest::builder)
                .basePath("/20160918")
                .appendPathParam("dhcps")
                .accept("application/json")
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.core.model.DhcpOptions.class,
                        CreateDhcpOptionsResponse.Builder::dhcpOptions)
                .handleResponseHeaderString("etag", CreateDhcpOptionsResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", CreateDhcpOptionsResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public CreateDrgResponse createDrg(CreateDrgRequest request) {
        Objects.requireNonNull(request.getCreateDrgDetails(), "createDrgDetails is required");

        return clientCall(request, CreateDrgResponse::builder)
                .logger(LOG, "createDrg")
                .serviceDetails(
                        "VirtualNetwork",
                        "CreateDrg",
                        "https://docs.oracle.com/iaas/api/#/en/iaas/20160918/Drg/CreateDrg")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(CreateDrgRequest::builder)
                .basePath("/20160918")
                .appendPathParam("drgs")
                .accept("application/json")
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .hasBody()
                .handleBody(com.oracle.bmc.core.model.Drg.class, CreateDrgResponse.Builder::drg)
                .handleResponseHeaderString("etag", CreateDrgResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", CreateDrgResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public CreateDrgAttachmentResponse createDrgAttachment(CreateDrgAttachmentRequest request) {
        Objects.requireNonNull(
                request.getCreateDrgAttachmentDetails(), "createDrgAttachmentDetails is required");

        return clientCall(request, CreateDrgAttachmentResponse::builder)
                .logger(LOG, "createDrgAttachment")
                .serviceDetails(
                        "VirtualNetwork",
                        "CreateDrgAttachment",
                        "https://docs.oracle.com/iaas/api/#/en/iaas/20160918/DrgAttachment/CreateDrgAttachment")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(CreateDrgAttachmentRequest::builder)
                .basePath("/20160918")
                .appendPathParam("drgAttachments")
                .accept("application/json")
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.core.model.DrgAttachment.class,
                        CreateDrgAttachmentResponse.Builder::drgAttachment)
                .handleResponseHeaderString("etag", CreateDrgAttachmentResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", CreateDrgAttachmentResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public CreateDrgRouteDistributionResponse createDrgRouteDistribution(
            CreateDrgRouteDistributionRequest request) {
        Objects.requireNonNull(
                request.getCreateDrgRouteDistributionDetails(),
                "createDrgRouteDistributionDetails is required");

        return clientCall(request, CreateDrgRouteDistributionResponse::builder)
                .logger(LOG, "createDrgRouteDistribution")
                .serviceDetails(
                        "VirtualNetwork",
                        "CreateDrgRouteDistribution",
                        "https://docs.oracle.com/iaas/api/#/en/iaas/20160918/DrgRouteDistribution/CreateDrgRouteDistribution")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(CreateDrgRouteDistributionRequest::builder)
                .basePath("/20160918")
                .appendPathParam("drgRouteDistributions")
                .accept("application/json")
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.core.model.DrgRouteDistribution.class,
                        CreateDrgRouteDistributionResponse.Builder::drgRouteDistribution)
                .handleResponseHeaderString(
                        "etag", CreateDrgRouteDistributionResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", CreateDrgRouteDistributionResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public CreateDrgRouteTableResponse createDrgRouteTable(CreateDrgRouteTableRequest request) {
        Objects.requireNonNull(
                request.getCreateDrgRouteTableDetails(), "createDrgRouteTableDetails is required");

        return clientCall(request, CreateDrgRouteTableResponse::builder)
                .logger(LOG, "createDrgRouteTable")
                .serviceDetails(
                        "VirtualNetwork",
                        "CreateDrgRouteTable",
                        "https://docs.oracle.com/iaas/api/#/en/iaas/20160918/DrgRouteTable/CreateDrgRouteTable")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(CreateDrgRouteTableRequest::builder)
                .basePath("/20160918")
                .appendPathParam("drgRouteTables")
                .accept("application/json")
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.core.model.DrgRouteTable.class,
                        CreateDrgRouteTableResponse.Builder::drgRouteTable)
                .handleResponseHeaderString("etag", CreateDrgRouteTableResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", CreateDrgRouteTableResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public CreateIPSecConnectionResponse createIPSecConnection(
            CreateIPSecConnectionRequest request) {
        Objects.requireNonNull(
                request.getCreateIPSecConnectionDetails(),
                "createIPSecConnectionDetails is required");

        return clientCall(request, CreateIPSecConnectionResponse::builder)
                .logger(LOG, "createIPSecConnection")
                .serviceDetails(
                        "VirtualNetwork",
                        "CreateIPSecConnection",
                        "https://docs.oracle.com/iaas/api/#/en/iaas/20160918/IPSecConnection/CreateIPSecConnection")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(CreateIPSecConnectionRequest::builder)
                .basePath("/20160918")
                .appendPathParam("ipsecConnections")
                .accept("application/json")
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.core.model.IPSecConnection.class,
                        CreateIPSecConnectionResponse.Builder::iPSecConnection)
                .handleResponseHeaderString("etag", CreateIPSecConnectionResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", CreateIPSecConnectionResponse.Builder::opcRequestId)
                .operationUsesDefaultRetries()
                .callSync();
    }

    @Override
    public CreateInternetGatewayResponse createInternetGateway(
            CreateInternetGatewayRequest request) {
        Objects.requireNonNull(
                request.getCreateInternetGatewayDetails(),
                "createInternetGatewayDetails is required");

        return clientCall(request, CreateInternetGatewayResponse::builder)
                .logger(LOG, "createInternetGateway")
                .serviceDetails(
                        "VirtualNetwork",
                        "CreateInternetGateway",
                        "https://docs.oracle.com/iaas/api/#/en/iaas/20160918/InternetGateway/CreateInternetGateway")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(CreateInternetGatewayRequest::builder)
                .basePath("/20160918")
                .appendPathParam("internetGateways")
                .accept("application/json")
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.core.model.InternetGateway.class,
                        CreateInternetGatewayResponse.Builder::internetGateway)
                .handleResponseHeaderString("etag", CreateInternetGatewayResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", CreateInternetGatewayResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public CreateIpv6Response createIpv6(CreateIpv6Request request) {
        Objects.requireNonNull(request.getCreateIpv6Details(), "createIpv6Details is required");

        return clientCall(request, CreateIpv6Response::builder)
                .logger(LOG, "createIpv6")
                .serviceDetails(
                        "VirtualNetwork",
                        "CreateIpv6",
                        "https://docs.oracle.com/iaas/api/#/en/iaas/20160918/Ipv6/CreateIpv6")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(CreateIpv6Request::builder)
                .basePath("/20160918")
                .appendPathParam("ipv6")
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .hasBody()
                .handleBody(com.oracle.bmc.core.model.Ipv6.class, CreateIpv6Response.Builder::ipv6)
                .handleResponseHeaderString("etag", CreateIpv6Response.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", CreateIpv6Response.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public CreateLocalPeeringGatewayResponse createLocalPeeringGateway(
            CreateLocalPeeringGatewayRequest request) {
        Objects.requireNonNull(
                request.getCreateLocalPeeringGatewayDetails(),
                "createLocalPeeringGatewayDetails is required");

        return clientCall(request, CreateLocalPeeringGatewayResponse::builder)
                .logger(LOG, "createLocalPeeringGateway")
                .serviceDetails(
                        "VirtualNetwork",
                        "CreateLocalPeeringGateway",
                        "https://docs.oracle.com/iaas/api/#/en/iaas/20160918/LocalPeeringGateway/CreateLocalPeeringGateway")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(CreateLocalPeeringGatewayRequest::builder)
                .basePath("/20160918")
                .appendPathParam("localPeeringGateways")
                .accept("application/json")
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.core.model.LocalPeeringGateway.class,
                        CreateLocalPeeringGatewayResponse.Builder::localPeeringGateway)
                .handleResponseHeaderString("etag", CreateLocalPeeringGatewayResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", CreateLocalPeeringGatewayResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public CreateNatGatewayResponse createNatGateway(CreateNatGatewayRequest request) {
        Objects.requireNonNull(
                request.getCreateNatGatewayDetails(), "createNatGatewayDetails is required");

        return clientCall(request, CreateNatGatewayResponse::builder)
                .logger(LOG, "createNatGateway")
                .serviceDetails(
                        "VirtualNetwork",
                        "CreateNatGateway",
                        "https://docs.oracle.com/iaas/api/#/en/iaas/20160918/NatGateway/CreateNatGateway")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(CreateNatGatewayRequest::builder)
                .basePath("/20160918")
                .appendPathParam("natGateways")
                .accept("application/json")
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.core.model.NatGateway.class,
                        CreateNatGatewayResponse.Builder::natGateway)
                .handleResponseHeaderString("etag", CreateNatGatewayResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", CreateNatGatewayResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public CreateNetworkSecurityGroupResponse createNetworkSecurityGroup(
            CreateNetworkSecurityGroupRequest request) {
        Objects.requireNonNull(
                request.getCreateNetworkSecurityGroupDetails(),
                "createNetworkSecurityGroupDetails is required");

        return clientCall(request, CreateNetworkSecurityGroupResponse::builder)
                .logger(LOG, "createNetworkSecurityGroup")
                .serviceDetails(
                        "VirtualNetwork",
                        "CreateNetworkSecurityGroup",
                        "https://docs.oracle.com/iaas/api/#/en/iaas/20160918/NetworkSecurityGroup/CreateNetworkSecurityGroup")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(CreateNetworkSecurityGroupRequest::builder)
                .basePath("/20160918")
                .appendPathParam("networkSecurityGroups")
                .accept("application/json")
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.core.model.NetworkSecurityGroup.class,
                        CreateNetworkSecurityGroupResponse.Builder::networkSecurityGroup)
                .handleResponseHeaderString(
                        "etag", CreateNetworkSecurityGroupResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", CreateNetworkSecurityGroupResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public CreatePrivateIpResponse createPrivateIp(CreatePrivateIpRequest request) {
        Objects.requireNonNull(
                request.getCreatePrivateIpDetails(), "createPrivateIpDetails is required");

        return clientCall(request, CreatePrivateIpResponse::builder)
                .logger(LOG, "createPrivateIp")
                .serviceDetails(
                        "VirtualNetwork",
                        "CreatePrivateIp",
                        "https://docs.oracle.com/iaas/api/#/en/iaas/20160918/PrivateIp/CreatePrivateIp")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(CreatePrivateIpRequest::builder)
                .basePath("/20160918")
                .appendPathParam("privateIps")
                .accept("application/json")
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.core.model.PrivateIp.class,
                        CreatePrivateIpResponse.Builder::privateIp)
                .handleResponseHeaderString("etag", CreatePrivateIpResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", CreatePrivateIpResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public CreatePublicIpResponse createPublicIp(CreatePublicIpRequest request) {
        Objects.requireNonNull(
                request.getCreatePublicIpDetails(), "createPublicIpDetails is required");

        return clientCall(request, CreatePublicIpResponse::builder)
                .logger(LOG, "createPublicIp")
                .serviceDetails(
                        "VirtualNetwork",
                        "CreatePublicIp",
                        "https://docs.oracle.com/iaas/api/#/en/iaas/20160918/PublicIp/CreatePublicIp")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(CreatePublicIpRequest::builder)
                .basePath("/20160918")
                .appendPathParam("publicIps")
                .accept("application/json")
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.core.model.PublicIp.class,
                        CreatePublicIpResponse.Builder::publicIp)
                .handleResponseHeaderString("etag", CreatePublicIpResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", CreatePublicIpResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public CreatePublicIpPoolResponse createPublicIpPool(CreatePublicIpPoolRequest request) {
        Objects.requireNonNull(
                request.getCreatePublicIpPoolDetails(), "createPublicIpPoolDetails is required");

        return clientCall(request, CreatePublicIpPoolResponse::builder)
                .logger(LOG, "createPublicIpPool")
                .serviceDetails(
                        "VirtualNetwork",
                        "CreatePublicIpPool",
                        "https://docs.oracle.com/iaas/api/#/en/iaas/20160918/PublicIpPool/CreatePublicIpPool")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(CreatePublicIpPoolRequest::builder)
                .basePath("/20160918")
                .appendPathParam("publicIpPools")
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.core.model.PublicIpPool.class,
                        CreatePublicIpPoolResponse.Builder::publicIpPool)
                .handleResponseHeaderString("etag", CreatePublicIpPoolResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", CreatePublicIpPoolResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public CreateRemotePeeringConnectionResponse createRemotePeeringConnection(
            CreateRemotePeeringConnectionRequest request) {
        Objects.requireNonNull(
                request.getCreateRemotePeeringConnectionDetails(),
                "createRemotePeeringConnectionDetails is required");

        return clientCall(request, CreateRemotePeeringConnectionResponse::builder)
                .logger(LOG, "createRemotePeeringConnection")
                .serviceDetails(
                        "VirtualNetwork",
                        "CreateRemotePeeringConnection",
                        "https://docs.oracle.com/iaas/api/#/en/iaas/20160918/RemotePeeringConnection/CreateRemotePeeringConnection")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(CreateRemotePeeringConnectionRequest::builder)
                .basePath("/20160918")
                .appendPathParam("remotePeeringConnections")
                .accept("application/json")
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.core.model.RemotePeeringConnection.class,
                        CreateRemotePeeringConnectionResponse.Builder::remotePeeringConnection)
                .handleResponseHeaderString(
                        "etag", CreateRemotePeeringConnectionResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id",
                        CreateRemotePeeringConnectionResponse.Builder::opcRequestId)
                .operationUsesDefaultRetries()
                .callSync();
    }

    @Override
    public CreateRouteTableResponse createRouteTable(CreateRouteTableRequest request) {
        Objects.requireNonNull(
                request.getCreateRouteTableDetails(), "createRouteTableDetails is required");

        return clientCall(request, CreateRouteTableResponse::builder)
                .logger(LOG, "createRouteTable")
                .serviceDetails(
                        "VirtualNetwork",
                        "CreateRouteTable",
                        "https://docs.oracle.com/iaas/api/#/en/iaas/20160918/RouteTable/CreateRouteTable")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(CreateRouteTableRequest::builder)
                .basePath("/20160918")
                .appendPathParam("routeTables")
                .accept("application/json")
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.core.model.RouteTable.class,
                        CreateRouteTableResponse.Builder::routeTable)
                .handleResponseHeaderString("etag", CreateRouteTableResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", CreateRouteTableResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public CreateSecurityListResponse createSecurityList(CreateSecurityListRequest request) {
        Objects.requireNonNull(
                request.getCreateSecurityListDetails(), "createSecurityListDetails is required");

        return clientCall(request, CreateSecurityListResponse::builder)
                .logger(LOG, "createSecurityList")
                .serviceDetails(
                        "VirtualNetwork",
                        "CreateSecurityList",
                        "https://docs.oracle.com/iaas/api/#/en/iaas/20160918/SecurityList/CreateSecurityList")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(CreateSecurityListRequest::builder)
                .basePath("/20160918")
                .appendPathParam("securityLists")
                .accept("application/json")
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.core.model.SecurityList.class,
                        CreateSecurityListResponse.Builder::securityList)
                .handleResponseHeaderString("etag", CreateSecurityListResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", CreateSecurityListResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public CreateServiceGatewayResponse createServiceGateway(CreateServiceGatewayRequest request) {
        Objects.requireNonNull(
                request.getCreateServiceGatewayDetails(),
                "createServiceGatewayDetails is required");

        return clientCall(request, CreateServiceGatewayResponse::builder)
                .logger(LOG, "createServiceGateway")
                .serviceDetails(
                        "VirtualNetwork",
                        "CreateServiceGateway",
                        "https://docs.oracle.com/iaas/api/#/en/iaas/20160918/ServiceGateway/CreateServiceGateway")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(CreateServiceGatewayRequest::builder)
                .basePath("/20160918")
                .appendPathParam("serviceGateways")
                .accept("application/json")
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.core.model.ServiceGateway.class,
                        CreateServiceGatewayResponse.Builder::serviceGateway)
                .handleResponseHeaderString(
                        "opc-request-id", CreateServiceGatewayResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public CreateSubnetResponse createSubnet(CreateSubnetRequest request) {
        Objects.requireNonNull(request.getCreateSubnetDetails(), "createSubnetDetails is required");

        return clientCall(request, CreateSubnetResponse::builder)
                .logger(LOG, "createSubnet")
                .serviceDetails(
                        "VirtualNetwork",
                        "CreateSubnet",
                        "https://docs.oracle.com/iaas/api/#/en/iaas/20160918/Subnet/CreateSubnet")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(CreateSubnetRequest::builder)
                .basePath("/20160918")
                .appendPathParam("subnets")
                .accept("application/json")
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.core.model.Subnet.class,
                        CreateSubnetResponse.Builder::subnet)
                .handleResponseHeaderString("etag", CreateSubnetResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", CreateSubnetResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public CreateVcnResponse createVcn(CreateVcnRequest request) {
        Objects.requireNonNull(request.getCreateVcnDetails(), "createVcnDetails is required");

        return clientCall(request, CreateVcnResponse::builder)
                .logger(LOG, "createVcn")
                .serviceDetails(
                        "VirtualNetwork",
                        "CreateVcn",
                        "https://docs.oracle.com/iaas/api/#/en/iaas/20160918/Vcn/CreateVcn")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(CreateVcnRequest::builder)
                .basePath("/20160918")
                .appendPathParam("vcns")
                .accept("application/json")
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .hasBody()
                .handleBody(com.oracle.bmc.core.model.Vcn.class, CreateVcnResponse.Builder::vcn)
                .handleResponseHeaderString("etag", CreateVcnResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", CreateVcnResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public CreateVirtualCircuitResponse createVirtualCircuit(CreateVirtualCircuitRequest request) {
        Objects.requireNonNull(
                request.getCreateVirtualCircuitDetails(),
                "createVirtualCircuitDetails is required");

        return clientCall(request, CreateVirtualCircuitResponse::builder)
                .logger(LOG, "createVirtualCircuit")
                .serviceDetails(
                        "VirtualNetwork",
                        "CreateVirtualCircuit",
                        "https://docs.oracle.com/iaas/api/#/en/iaas/20160918/VirtualCircuit/CreateVirtualCircuit")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(CreateVirtualCircuitRequest::builder)
                .basePath("/20160918")
                .appendPathParam("virtualCircuits")
                .accept("application/json")
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.core.model.VirtualCircuit.class,
                        CreateVirtualCircuitResponse.Builder::virtualCircuit)
                .handleResponseHeaderString("etag", CreateVirtualCircuitResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", CreateVirtualCircuitResponse.Builder::opcRequestId)
                .operationUsesDefaultRetries()
                .callSync();
    }

    @Override
    public CreateVlanResponse createVlan(CreateVlanRequest request) {
        Objects.requireNonNull(request.getCreateVlanDetails(), "createVlanDetails is required");

        return clientCall(request, CreateVlanResponse::builder)
                .logger(LOG, "createVlan")
                .serviceDetails(
                        "VirtualNetwork",
                        "CreateVlan",
                        "https://docs.oracle.com/iaas/api/#/en/iaas/20160918/Vlan/CreateVlan")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(CreateVlanRequest::builder)
                .basePath("/20160918")
                .appendPathParam("vlans")
                .accept("application/json")
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .hasBody()
                .handleBody(com.oracle.bmc.core.model.Vlan.class, CreateVlanResponse.Builder::vlan)
                .handleResponseHeaderString("etag", CreateVlanResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", CreateVlanResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public CreateVtapResponse createVtap(CreateVtapRequest request) {
        Objects.requireNonNull(request.getCreateVtapDetails(), "createVtapDetails is required");

        return clientCall(request, CreateVtapResponse::builder)
                .logger(LOG, "createVtap")
                .serviceDetails(
                        "VirtualNetwork",
                        "CreateVtap",
                        "https://docs.oracle.com/iaas/api/#/en/iaas/20160918/Vtap/CreateVtap")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(CreateVtapRequest::builder)
                .basePath("/20160918")
                .appendPathParam("vtaps")
                .accept("application/json")
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .hasBody()
                .handleBody(com.oracle.bmc.core.model.Vtap.class, CreateVtapResponse.Builder::vtap)
                .handleResponseHeaderString("etag", CreateVtapResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", CreateVtapResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public DeleteByoipRangeResponse deleteByoipRange(DeleteByoipRangeRequest request) {

        Validate.notBlank(request.getByoipRangeId(), "byoipRangeId must not be blank");

        return clientCall(request, DeleteByoipRangeResponse::builder)
                .logger(LOG, "deleteByoipRange")
                .serviceDetails(
                        "VirtualNetwork",
                        "DeleteByoipRange",
                        "https://docs.oracle.com/iaas/api/#/en/iaas/20160918/ByoipRange/DeleteByoipRange")
                .method(com.oracle.bmc.http.client.Method.DELETE)
                .requestBuilder(DeleteByoipRangeRequest::builder)
                .basePath("/20160918")
                .appendPathParam("byoipRanges")
                .appendPathParam(request.getByoipRangeId())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("if-match", request.getIfMatch())
                .handleResponseHeaderString(
                        "opc-request-id", DeleteByoipRangeResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-work-request-id", DeleteByoipRangeResponse.Builder::opcWorkRequestId)
                .callSync();
    }

    @Override
    public DeleteCaptureFilterResponse deleteCaptureFilter(DeleteCaptureFilterRequest request) {

        Validate.notBlank(request.getCaptureFilterId(), "captureFilterId must not be blank");

        return clientCall(request, DeleteCaptureFilterResponse::builder)
                .logger(LOG, "deleteCaptureFilter")
                .serviceDetails(
                        "VirtualNetwork",
                        "DeleteCaptureFilter",
                        "https://docs.oracle.com/iaas/api/#/en/iaas/20160918/CaptureFilter/DeleteCaptureFilter")
                .method(com.oracle.bmc.http.client.Method.DELETE)
                .requestBuilder(DeleteCaptureFilterRequest::builder)
                .basePath("/20160918")
                .appendPathParam("captureFilters")
                .appendPathParam(request.getCaptureFilterId())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleResponseHeaderString(
                        "opc-request-id", DeleteCaptureFilterResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public DeleteCpeResponse deleteCpe(DeleteCpeRequest request) {

        Validate.notBlank(request.getCpeId(), "cpeId must not be blank");

        return clientCall(request, DeleteCpeResponse::builder)
                .logger(LOG, "deleteCpe")
                .serviceDetails("VirtualNetwork", "DeleteCpe", "")
                .method(com.oracle.bmc.http.client.Method.DELETE)
                .requestBuilder(DeleteCpeRequest::builder)
                .basePath("/20160918")
                .appendPathParam("cpes")
                .appendPathParam(request.getCpeId())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .handleResponseHeaderString(
                        "opc-request-id", DeleteCpeResponse.Builder::opcRequestId)
                .operationUsesDefaultRetries()
                .callSync();
    }

    @Override
    public DeleteCrossConnectResponse deleteCrossConnect(DeleteCrossConnectRequest request) {

        Validate.notBlank(request.getCrossConnectId(), "crossConnectId must not be blank");

        return clientCall(request, DeleteCrossConnectResponse::builder)
                .logger(LOG, "deleteCrossConnect")
                .serviceDetails("VirtualNetwork", "DeleteCrossConnect", "")
                .method(com.oracle.bmc.http.client.Method.DELETE)
                .requestBuilder(DeleteCrossConnectRequest::builder)
                .basePath("/20160918")
                .appendPathParam("crossConnects")
                .appendPathParam(request.getCrossConnectId())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .handleResponseHeaderString(
                        "opc-request-id", DeleteCrossConnectResponse.Builder::opcRequestId)
                .operationUsesDefaultRetries()
                .callSync();
    }

    @Override
    public DeleteCrossConnectGroupResponse deleteCrossConnectGroup(
            DeleteCrossConnectGroupRequest request) {

        Validate.notBlank(
                request.getCrossConnectGroupId(), "crossConnectGroupId must not be blank");

        return clientCall(request, DeleteCrossConnectGroupResponse::builder)
                .logger(LOG, "deleteCrossConnectGroup")
                .serviceDetails("VirtualNetwork", "DeleteCrossConnectGroup", "")
                .method(com.oracle.bmc.http.client.Method.DELETE)
                .requestBuilder(DeleteCrossConnectGroupRequest::builder)
                .basePath("/20160918")
                .appendPathParam("crossConnectGroups")
                .appendPathParam(request.getCrossConnectGroupId())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .handleResponseHeaderString(
                        "opc-request-id", DeleteCrossConnectGroupResponse.Builder::opcRequestId)
                .operationUsesDefaultRetries()
                .callSync();
    }

    @Override
    public DeleteDhcpOptionsResponse deleteDhcpOptions(DeleteDhcpOptionsRequest request) {

        Validate.notBlank(request.getDhcpId(), "dhcpId must not be blank");

        return clientCall(request, DeleteDhcpOptionsResponse::builder)
                .logger(LOG, "deleteDhcpOptions")
                .serviceDetails("VirtualNetwork", "DeleteDhcpOptions", "")
                .method(com.oracle.bmc.http.client.Method.DELETE)
                .requestBuilder(DeleteDhcpOptionsRequest::builder)
                .basePath("/20160918")
                .appendPathParam("dhcps")
                .appendPathParam(request.getDhcpId())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .handleResponseHeaderString(
                        "opc-request-id", DeleteDhcpOptionsResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public DeleteDrgResponse deleteDrg(DeleteDrgRequest request) {

        Validate.notBlank(request.getDrgId(), "drgId must not be blank");

        return clientCall(request, DeleteDrgResponse::builder)
                .logger(LOG, "deleteDrg")
                .serviceDetails("VirtualNetwork", "DeleteDrg", "")
                .method(com.oracle.bmc.http.client.Method.DELETE)
                .requestBuilder(DeleteDrgRequest::builder)
                .basePath("/20160918")
                .appendPathParam("drgs")
                .appendPathParam(request.getDrgId())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .handleResponseHeaderString(
                        "opc-request-id", DeleteDrgResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public DeleteDrgAttachmentResponse deleteDrgAttachment(DeleteDrgAttachmentRequest request) {

        Validate.notBlank(request.getDrgAttachmentId(), "drgAttachmentId must not be blank");

        return clientCall(request, DeleteDrgAttachmentResponse::builder)
                .logger(LOG, "deleteDrgAttachment")
                .serviceDetails("VirtualNetwork", "DeleteDrgAttachment", "")
                .method(com.oracle.bmc.http.client.Method.DELETE)
                .requestBuilder(DeleteDrgAttachmentRequest::builder)
                .basePath("/20160918")
                .appendPathParam("drgAttachments")
                .appendPathParam(request.getDrgAttachmentId())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .handleResponseHeaderString(
                        "opc-request-id", DeleteDrgAttachmentResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public DeleteDrgRouteDistributionResponse deleteDrgRouteDistribution(
            DeleteDrgRouteDistributionRequest request) {

        Validate.notBlank(
                request.getDrgRouteDistributionId(), "drgRouteDistributionId must not be blank");

        return clientCall(request, DeleteDrgRouteDistributionResponse::builder)
                .logger(LOG, "deleteDrgRouteDistribution")
                .serviceDetails(
                        "VirtualNetwork",
                        "DeleteDrgRouteDistribution",
                        "https://docs.oracle.com/iaas/api/#/en/iaas/20160918/DrgRouteDistributionStatement/DeleteDrgRouteDistribution")
                .method(com.oracle.bmc.http.client.Method.DELETE)
                .requestBuilder(DeleteDrgRouteDistributionRequest::builder)
                .basePath("/20160918")
                .appendPathParam("drgRouteDistributions")
                .appendPathParam(request.getDrgRouteDistributionId())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .handleResponseHeaderString(
                        "opc-request-id", DeleteDrgRouteDistributionResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public DeleteDrgRouteTableResponse deleteDrgRouteTable(DeleteDrgRouteTableRequest request) {

        Validate.notBlank(request.getDrgRouteTableId(), "drgRouteTableId must not be blank");

        return clientCall(request, DeleteDrgRouteTableResponse::builder)
                .logger(LOG, "deleteDrgRouteTable")
                .serviceDetails(
                        "VirtualNetwork",
                        "DeleteDrgRouteTable",
                        "https://docs.oracle.com/iaas/api/#/en/iaas/20160918/InternalPublicIp/DeleteDrgRouteTable")
                .method(com.oracle.bmc.http.client.Method.DELETE)
                .requestBuilder(DeleteDrgRouteTableRequest::builder)
                .basePath("/20160918")
                .appendPathParam("drgRouteTables")
                .appendPathParam(request.getDrgRouteTableId())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .handleResponseHeaderString(
                        "opc-request-id", DeleteDrgRouteTableResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public DeleteIPSecConnectionResponse deleteIPSecConnection(
            DeleteIPSecConnectionRequest request) {

        Validate.notBlank(request.getIpscId(), "ipscId must not be blank");

        return clientCall(request, DeleteIPSecConnectionResponse::builder)
                .logger(LOG, "deleteIPSecConnection")
                .serviceDetails("VirtualNetwork", "DeleteIPSecConnection", "")
                .method(com.oracle.bmc.http.client.Method.DELETE)
                .requestBuilder(DeleteIPSecConnectionRequest::builder)
                .basePath("/20160918")
                .appendPathParam("ipsecConnections")
                .appendPathParam(request.getIpscId())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .handleResponseHeaderString(
                        "opc-request-id", DeleteIPSecConnectionResponse.Builder::opcRequestId)
                .operationUsesDefaultRetries()
                .callSync();
    }

    @Override
    public DeleteInternetGatewayResponse deleteInternetGateway(
            DeleteInternetGatewayRequest request) {

        Validate.notBlank(request.getIgId(), "igId must not be blank");

        return clientCall(request, DeleteInternetGatewayResponse::builder)
                .logger(LOG, "deleteInternetGateway")
                .serviceDetails("VirtualNetwork", "DeleteInternetGateway", "")
                .method(com.oracle.bmc.http.client.Method.DELETE)
                .requestBuilder(DeleteInternetGatewayRequest::builder)
                .basePath("/20160918")
                .appendPathParam("internetGateways")
                .appendPathParam(request.getIgId())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .handleResponseHeaderString(
                        "opc-request-id", DeleteInternetGatewayResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public DeleteIpv6Response deleteIpv6(DeleteIpv6Request request) {

        Validate.notBlank(request.getIpv6Id(), "ipv6Id must not be blank");

        return clientCall(request, DeleteIpv6Response::builder)
                .logger(LOG, "deleteIpv6")
                .serviceDetails("VirtualNetwork", "DeleteIpv6", "")
                .method(com.oracle.bmc.http.client.Method.DELETE)
                .requestBuilder(DeleteIpv6Request::builder)
                .basePath("/20160918")
                .appendPathParam("ipv6")
                .appendPathParam(request.getIpv6Id())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleResponseHeaderString(
                        "opc-request-id", DeleteIpv6Response.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public DeleteLocalPeeringGatewayResponse deleteLocalPeeringGateway(
            DeleteLocalPeeringGatewayRequest request) {

        Validate.notBlank(
                request.getLocalPeeringGatewayId(), "localPeeringGatewayId must not be blank");

        return clientCall(request, DeleteLocalPeeringGatewayResponse::builder)
                .logger(LOG, "deleteLocalPeeringGateway")
                .serviceDetails("VirtualNetwork", "DeleteLocalPeeringGateway", "")
                .method(com.oracle.bmc.http.client.Method.DELETE)
                .requestBuilder(DeleteLocalPeeringGatewayRequest::builder)
                .basePath("/20160918")
                .appendPathParam("localPeeringGateways")
                .appendPathParam(request.getLocalPeeringGatewayId())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .handleResponseHeaderString(
                        "opc-request-id", DeleteLocalPeeringGatewayResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public DeleteNatGatewayResponse deleteNatGateway(DeleteNatGatewayRequest request) {

        Validate.notBlank(request.getNatGatewayId(), "natGatewayId must not be blank");

        return clientCall(request, DeleteNatGatewayResponse::builder)
                .logger(LOG, "deleteNatGateway")
                .serviceDetails("VirtualNetwork", "DeleteNatGateway", "")
                .method(com.oracle.bmc.http.client.Method.DELETE)
                .requestBuilder(DeleteNatGatewayRequest::builder)
                .basePath("/20160918")
                .appendPathParam("natGateways")
                .appendPathParam(request.getNatGatewayId())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .handleResponseHeaderString(
                        "opc-request-id", DeleteNatGatewayResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public DeleteNetworkSecurityGroupResponse deleteNetworkSecurityGroup(
            DeleteNetworkSecurityGroupRequest request) {

        Validate.notBlank(
                request.getNetworkSecurityGroupId(), "networkSecurityGroupId must not be blank");

        return clientCall(request, DeleteNetworkSecurityGroupResponse::builder)
                .logger(LOG, "deleteNetworkSecurityGroup")
                .serviceDetails(
                        "VirtualNetwork",
                        "DeleteNetworkSecurityGroup",
                        "https://docs.oracle.com/iaas/api/#/en/iaas/20160918/NetworkSecurityGroup/DeleteNetworkSecurityGroup")
                .method(com.oracle.bmc.http.client.Method.DELETE)
                .requestBuilder(DeleteNetworkSecurityGroupRequest::builder)
                .basePath("/20160918")
                .appendPathParam("networkSecurityGroups")
                .appendPathParam(request.getNetworkSecurityGroupId())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .handleResponseHeaderString(
                        "opc-request-id", DeleteNetworkSecurityGroupResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public DeletePrivateIpResponse deletePrivateIp(DeletePrivateIpRequest request) {

        Validate.notBlank(request.getPrivateIpId(), "privateIpId must not be blank");

        return clientCall(request, DeletePrivateIpResponse::builder)
                .logger(LOG, "deletePrivateIp")
                .serviceDetails("VirtualNetwork", "DeletePrivateIp", "")
                .method(com.oracle.bmc.http.client.Method.DELETE)
                .requestBuilder(DeletePrivateIpRequest::builder)
                .basePath("/20160918")
                .appendPathParam("privateIps")
                .appendPathParam(request.getPrivateIpId())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .handleResponseHeaderString(
                        "opc-request-id", DeletePrivateIpResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public DeletePublicIpResponse deletePublicIp(DeletePublicIpRequest request) {

        Validate.notBlank(request.getPublicIpId(), "publicIpId must not be blank");

        return clientCall(request, DeletePublicIpResponse::builder)
                .logger(LOG, "deletePublicIp")
                .serviceDetails("VirtualNetwork", "DeletePublicIp", "")
                .method(com.oracle.bmc.http.client.Method.DELETE)
                .requestBuilder(DeletePublicIpRequest::builder)
                .basePath("/20160918")
                .appendPathParam("publicIps")
                .appendPathParam(request.getPublicIpId())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .handleResponseHeaderString(
                        "opc-request-id", DeletePublicIpResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public DeletePublicIpPoolResponse deletePublicIpPool(DeletePublicIpPoolRequest request) {

        Validate.notBlank(request.getPublicIpPoolId(), "publicIpPoolId must not be blank");

        return clientCall(request, DeletePublicIpPoolResponse::builder)
                .logger(LOG, "deletePublicIpPool")
                .serviceDetails(
                        "VirtualNetwork",
                        "DeletePublicIpPool",
                        "https://docs.oracle.com/iaas/api/#/en/iaas/20160918/PublicIpPool/DeletePublicIpPool")
                .method(com.oracle.bmc.http.client.Method.DELETE)
                .requestBuilder(DeletePublicIpPoolRequest::builder)
                .basePath("/20160918")
                .appendPathParam("publicIpPools")
                .appendPathParam(request.getPublicIpPoolId())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("if-match", request.getIfMatch())
                .handleResponseHeaderString(
                        "opc-request-id", DeletePublicIpPoolResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public DeleteRemotePeeringConnectionResponse deleteRemotePeeringConnection(
            DeleteRemotePeeringConnectionRequest request) {

        Validate.notBlank(
                request.getRemotePeeringConnectionId(),
                "remotePeeringConnectionId must not be blank");

        return clientCall(request, DeleteRemotePeeringConnectionResponse::builder)
                .logger(LOG, "deleteRemotePeeringConnection")
                .serviceDetails("VirtualNetwork", "DeleteRemotePeeringConnection", "")
                .method(com.oracle.bmc.http.client.Method.DELETE)
                .requestBuilder(DeleteRemotePeeringConnectionRequest::builder)
                .basePath("/20160918")
                .appendPathParam("remotePeeringConnections")
                .appendPathParam(request.getRemotePeeringConnectionId())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .handleResponseHeaderString(
                        "opc-request-id",
                        DeleteRemotePeeringConnectionResponse.Builder::opcRequestId)
                .operationUsesDefaultRetries()
                .callSync();
    }

    @Override
    public DeleteRouteTableResponse deleteRouteTable(DeleteRouteTableRequest request) {

        Validate.notBlank(request.getRtId(), "rtId must not be blank");

        return clientCall(request, DeleteRouteTableResponse::builder)
                .logger(LOG, "deleteRouteTable")
                .serviceDetails("VirtualNetwork", "DeleteRouteTable", "")
                .method(com.oracle.bmc.http.client.Method.DELETE)
                .requestBuilder(DeleteRouteTableRequest::builder)
                .basePath("/20160918")
                .appendPathParam("routeTables")
                .appendPathParam(request.getRtId())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .handleResponseHeaderString(
                        "opc-request-id", DeleteRouteTableResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public DeleteSecurityListResponse deleteSecurityList(DeleteSecurityListRequest request) {

        Validate.notBlank(request.getSecurityListId(), "securityListId must not be blank");

        return clientCall(request, DeleteSecurityListResponse::builder)
                .logger(LOG, "deleteSecurityList")
                .serviceDetails("VirtualNetwork", "DeleteSecurityList", "")
                .method(com.oracle.bmc.http.client.Method.DELETE)
                .requestBuilder(DeleteSecurityListRequest::builder)
                .basePath("/20160918")
                .appendPathParam("securityLists")
                .appendPathParam(request.getSecurityListId())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .handleResponseHeaderString(
                        "opc-request-id", DeleteSecurityListResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public DeleteServiceGatewayResponse deleteServiceGateway(DeleteServiceGatewayRequest request) {

        Validate.notBlank(request.getServiceGatewayId(), "serviceGatewayId must not be blank");

        return clientCall(request, DeleteServiceGatewayResponse::builder)
                .logger(LOG, "deleteServiceGateway")
                .serviceDetails("VirtualNetwork", "DeleteServiceGateway", "")
                .method(com.oracle.bmc.http.client.Method.DELETE)
                .requestBuilder(DeleteServiceGatewayRequest::builder)
                .basePath("/20160918")
                .appendPathParam("serviceGateways")
                .appendPathParam(request.getServiceGatewayId())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .handleResponseHeaderString(
                        "opc-request-id", DeleteServiceGatewayResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public DeleteSubnetResponse deleteSubnet(DeleteSubnetRequest request) {

        Validate.notBlank(request.getSubnetId(), "subnetId must not be blank");

        return clientCall(request, DeleteSubnetResponse::builder)
                .logger(LOG, "deleteSubnet")
                .serviceDetails("VirtualNetwork", "DeleteSubnet", "")
                .method(com.oracle.bmc.http.client.Method.DELETE)
                .requestBuilder(DeleteSubnetRequest::builder)
                .basePath("/20160918")
                .appendPathParam("subnets")
                .appendPathParam(request.getSubnetId())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .handleResponseHeaderString(
                        "opc-request-id", DeleteSubnetResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public DeleteVcnResponse deleteVcn(DeleteVcnRequest request) {

        Validate.notBlank(request.getVcnId(), "vcnId must not be blank");

        return clientCall(request, DeleteVcnResponse::builder)
                .logger(LOG, "deleteVcn")
                .serviceDetails("VirtualNetwork", "DeleteVcn", "")
                .method(com.oracle.bmc.http.client.Method.DELETE)
                .requestBuilder(DeleteVcnRequest::builder)
                .basePath("/20160918")
                .appendPathParam("vcns")
                .appendPathParam(request.getVcnId())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .handleResponseHeaderString(
                        "opc-request-id", DeleteVcnResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public DeleteVirtualCircuitResponse deleteVirtualCircuit(DeleteVirtualCircuitRequest request) {

        Validate.notBlank(request.getVirtualCircuitId(), "virtualCircuitId must not be blank");

        return clientCall(request, DeleteVirtualCircuitResponse::builder)
                .logger(LOG, "deleteVirtualCircuit")
                .serviceDetails("VirtualNetwork", "DeleteVirtualCircuit", "")
                .method(com.oracle.bmc.http.client.Method.DELETE)
                .requestBuilder(DeleteVirtualCircuitRequest::builder)
                .basePath("/20160918")
                .appendPathParam("virtualCircuits")
                .appendPathParam(request.getVirtualCircuitId())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .handleResponseHeaderString(
                        "opc-request-id", DeleteVirtualCircuitResponse.Builder::opcRequestId)
                .operationUsesDefaultRetries()
                .callSync();
    }

    @Override
    public DeleteVlanResponse deleteVlan(DeleteVlanRequest request) {

        Validate.notBlank(request.getVlanId(), "vlanId must not be blank");

        return clientCall(request, DeleteVlanResponse::builder)
                .logger(LOG, "deleteVlan")
                .serviceDetails(
                        "VirtualNetwork",
                        "DeleteVlan",
                        "https://docs.oracle.com/iaas/api/#/en/iaas/20160918/Vlan/DeleteVlan")
                .method(com.oracle.bmc.http.client.Method.DELETE)
                .requestBuilder(DeleteVlanRequest::builder)
                .basePath("/20160918")
                .appendPathParam("vlans")
                .appendPathParam(request.getVlanId())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleResponseHeaderString(
                        "opc-request-id", DeleteVlanResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public DeleteVtapResponse deleteVtap(DeleteVtapRequest request) {

        Validate.notBlank(request.getVtapId(), "vtapId must not be blank");

        return clientCall(request, DeleteVtapResponse::builder)
                .logger(LOG, "deleteVtap")
                .serviceDetails(
                        "VirtualNetwork",
                        "DeleteVtap",
                        "https://docs.oracle.com/iaas/api/#/en/iaas/20160918/Vtap/DeleteVtap")
                .method(com.oracle.bmc.http.client.Method.DELETE)
                .requestBuilder(DeleteVtapRequest::builder)
                .basePath("/20160918")
                .appendPathParam("vtaps")
                .appendPathParam(request.getVtapId())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleResponseHeaderString(
                        "opc-request-id", DeleteVtapResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-work-request-id", DeleteVtapResponse.Builder::opcWorkRequestId)
                .callSync();
    }

    @Override
    public DetachServiceIdResponse detachServiceId(DetachServiceIdRequest request) {

        Validate.notBlank(request.getServiceGatewayId(), "serviceGatewayId must not be blank");
        Objects.requireNonNull(
                request.getDetachServiceDetails(), "detachServiceDetails is required");

        return clientCall(request, DetachServiceIdResponse::builder)
                .logger(LOG, "detachServiceId")
                .serviceDetails(
                        "VirtualNetwork",
                        "DetachServiceId",
                        "https://docs.oracle.com/iaas/api/#/en/iaas/20160918/ServiceGateway/DetachServiceId")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(DetachServiceIdRequest::builder)
                .basePath("/20160918")
                .appendPathParam("serviceGateways")
                .appendPathParam(request.getServiceGatewayId())
                .appendPathParam("actions")
                .appendPathParam("detachService")
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.core.model.ServiceGateway.class,
                        DetachServiceIdResponse.Builder::serviceGateway)
                .handleResponseHeaderString(
                        "opc-request-id", DetachServiceIdResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public GetAllDrgAttachmentsResponse getAllDrgAttachments(GetAllDrgAttachmentsRequest request) {

        Validate.notBlank(request.getDrgId(), "drgId must not be blank");

        return clientCall(request, GetAllDrgAttachmentsResponse::builder)
                .logger(LOG, "getAllDrgAttachments")
                .serviceDetails(
                        "VirtualNetwork",
                        "GetAllDrgAttachments",
                        "https://docs.oracle.com/iaas/api/#/en/iaas/20160918/Drg/GetAllDrgAttachments")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(GetAllDrgAttachmentsRequest::builder)
                .basePath("/20160918")
                .appendPathParam("drgs")
                .appendPathParam(request.getDrgId())
                .appendPathParam("actions")
                .appendPathParam("getAllDrgAttachments")
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .appendEnumQueryParam("attachmentType", request.getAttachmentType())
                .appendQueryParam("isCrossTenancy", request.getIsCrossTenancy())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBodyList(
                        com.oracle.bmc.core.model.DrgAttachmentInfo.class,
                        GetAllDrgAttachmentsResponse.Builder::items)
                .handleResponseHeaderString(
                        "opc-next-page", GetAllDrgAttachmentsResponse.Builder::opcNextPage)
                .handleResponseHeaderString(
                        "opc-request-id", GetAllDrgAttachmentsResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public GetAllowedIkeIPSecParametersResponse getAllowedIkeIPSecParameters(
            GetAllowedIkeIPSecParametersRequest request) {

        return clientCall(request, GetAllowedIkeIPSecParametersResponse::builder)
                .logger(LOG, "getAllowedIkeIPSecParameters")
                .serviceDetails(
                        "VirtualNetwork",
                        "GetAllowedIkeIPSecParameters",
                        "https://docs.oracle.com/iaas/api/#/en/iaas/20160918/AllowedIkeIPSecParameters/GetAllowedIkeIPSecParameters")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetAllowedIkeIPSecParametersRequest::builder)
                .basePath("/20160918")
                .appendPathParam("ipsecAlgorithms")
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.core.model.AllowedIkeIPSecParameters.class,
                        GetAllowedIkeIPSecParametersResponse.Builder::allowedIkeIPSecParameters)
                .handleResponseHeaderString(
                        "opc-request-id",
                        GetAllowedIkeIPSecParametersResponse.Builder::opcRequestId)
                .operationUsesDefaultRetries()
                .callSync();
    }

    @Override
    public GetByoipRangeResponse getByoipRange(GetByoipRangeRequest request) {

        Validate.notBlank(request.getByoipRangeId(), "byoipRangeId must not be blank");

        return clientCall(request, GetByoipRangeResponse::builder)
                .logger(LOG, "getByoipRange")
                .serviceDetails(
                        "VirtualNetwork",
                        "GetByoipRange",
                        "https://docs.oracle.com/iaas/api/#/en/iaas/20160918/ByoipRange/GetByoipRange")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetByoipRangeRequest::builder)
                .basePath("/20160918")
                .appendPathParam("byoipRanges")
                .appendPathParam(request.getByoipRangeId())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.core.model.ByoipRange.class,
                        GetByoipRangeResponse.Builder::byoipRange)
                .handleResponseHeaderString("etag", GetByoipRangeResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", GetByoipRangeResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public GetCaptureFilterResponse getCaptureFilter(GetCaptureFilterRequest request) {

        Validate.notBlank(request.getCaptureFilterId(), "captureFilterId must not be blank");

        return clientCall(request, GetCaptureFilterResponse::builder)
                .logger(LOG, "getCaptureFilter")
                .serviceDetails(
                        "VirtualNetwork",
                        "GetCaptureFilter",
                        "https://docs.oracle.com/iaas/api/#/en/iaas/20160918/CaptureFilter/GetCaptureFilter")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetCaptureFilterRequest::builder)
                .basePath("/20160918")
                .appendPathParam("captureFilters")
                .appendPathParam(request.getCaptureFilterId())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.core.model.CaptureFilter.class,
                        GetCaptureFilterResponse.Builder::captureFilter)
                .handleResponseHeaderString("etag", GetCaptureFilterResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", GetCaptureFilterResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public GetCpeResponse getCpe(GetCpeRequest request) {

        Validate.notBlank(request.getCpeId(), "cpeId must not be blank");

        return clientCall(request, GetCpeResponse::builder)
                .logger(LOG, "getCpe")
                .serviceDetails(
                        "VirtualNetwork",
                        "GetCpe",
                        "https://docs.oracle.com/iaas/api/#/en/iaas/20160918/Cpe/GetCpe")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetCpeRequest::builder)
                .basePath("/20160918")
                .appendPathParam("cpes")
                .appendPathParam(request.getCpeId())
                .accept("application/json")
                .handleBody(com.oracle.bmc.core.model.Cpe.class, GetCpeResponse.Builder::cpe)
                .handleResponseHeaderString("etag", GetCpeResponse.Builder::etag)
                .handleResponseHeaderString("opc-request-id", GetCpeResponse.Builder::opcRequestId)
                .operationUsesDefaultRetries()
                .callSync();
    }

    @Override
    public GetCpeDeviceConfigContentResponse getCpeDeviceConfigContent(
            GetCpeDeviceConfigContentRequest request) {

        Validate.notBlank(request.getCpeId(), "cpeId must not be blank");

        return clientCall(request, GetCpeDeviceConfigContentResponse::builder)
                .logger(LOG, "getCpeDeviceConfigContent")
                .serviceDetails(
                        "VirtualNetwork",
                        "GetCpeDeviceConfigContent",
                        "https://docs.oracle.com/iaas/api/#/en/iaas/20160918/Cpe/GetCpeDeviceConfigContent")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetCpeDeviceConfigContentRequest::builder)
                .basePath("/20160918")
                .appendPathParam("cpes")
                .appendPathParam(request.getCpeId())
                .appendPathParam("cpeConfigContent")
                .accept("text/plain; charset=utf-8")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        java.io.InputStream.class,
                        GetCpeDeviceConfigContentResponse.Builder::inputStream)
                .handleResponseHeaderString(
                        "opc-request-id", GetCpeDeviceConfigContentResponse.Builder::opcRequestId)
                .operationUsesDefaultRetries()
                .callSync();
    }

    @Override
    public GetCpeDeviceShapeResponse getCpeDeviceShape(GetCpeDeviceShapeRequest request) {

        Validate.notBlank(request.getCpeDeviceShapeId(), "cpeDeviceShapeId must not be blank");

        return clientCall(request, GetCpeDeviceShapeResponse::builder)
                .logger(LOG, "getCpeDeviceShape")
                .serviceDetails(
                        "VirtualNetwork",
                        "GetCpeDeviceShape",
                        "https://docs.oracle.com/iaas/api/#/en/iaas/20160918/CpeDeviceShapeDetail/GetCpeDeviceShape")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetCpeDeviceShapeRequest::builder)
                .basePath("/20160918")
                .appendPathParam("cpeDeviceShapes")
                .appendPathParam(request.getCpeDeviceShapeId())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.core.model.CpeDeviceShapeDetail.class,
                        GetCpeDeviceShapeResponse.Builder::cpeDeviceShapeDetail)
                .handleResponseHeaderString(
                        "opc-request-id", GetCpeDeviceShapeResponse.Builder::opcRequestId)
                .operationUsesDefaultRetries()
                .callSync();
    }

    @Override
    public GetCrossConnectResponse getCrossConnect(GetCrossConnectRequest request) {

        Validate.notBlank(request.getCrossConnectId(), "crossConnectId must not be blank");

        return clientCall(request, GetCrossConnectResponse::builder)
                .logger(LOG, "getCrossConnect")
                .serviceDetails(
                        "VirtualNetwork",
                        "GetCrossConnect",
                        "https://docs.oracle.com/iaas/api/#/en/iaas/20160918/CrossConnect/GetCrossConnect")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetCrossConnectRequest::builder)
                .basePath("/20160918")
                .appendPathParam("crossConnects")
                .appendPathParam(request.getCrossConnectId())
                .accept("application/json")
                .handleBody(
                        com.oracle.bmc.core.model.CrossConnect.class,
                        GetCrossConnectResponse.Builder::crossConnect)
                .handleResponseHeaderString("etag", GetCrossConnectResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", GetCrossConnectResponse.Builder::opcRequestId)
                .operationUsesDefaultRetries()
                .callSync();
    }

    @Override
    public GetCrossConnectGroupResponse getCrossConnectGroup(GetCrossConnectGroupRequest request) {

        Validate.notBlank(
                request.getCrossConnectGroupId(), "crossConnectGroupId must not be blank");

        return clientCall(request, GetCrossConnectGroupResponse::builder)
                .logger(LOG, "getCrossConnectGroup")
                .serviceDetails(
                        "VirtualNetwork",
                        "GetCrossConnectGroup",
                        "https://docs.oracle.com/iaas/api/#/en/iaas/20160918/CrossConnectGroup/GetCrossConnectGroup")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetCrossConnectGroupRequest::builder)
                .basePath("/20160918")
                .appendPathParam("crossConnectGroups")
                .appendPathParam(request.getCrossConnectGroupId())
                .accept("application/json")
                .handleBody(
                        com.oracle.bmc.core.model.CrossConnectGroup.class,
                        GetCrossConnectGroupResponse.Builder::crossConnectGroup)
                .handleResponseHeaderString("etag", GetCrossConnectGroupResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", GetCrossConnectGroupResponse.Builder::opcRequestId)
                .operationUsesDefaultRetries()
                .callSync();
    }

    @Override
    public GetCrossConnectLetterOfAuthorityResponse getCrossConnectLetterOfAuthority(
            GetCrossConnectLetterOfAuthorityRequest request) {

        Validate.notBlank(request.getCrossConnectId(), "crossConnectId must not be blank");

        return clientCall(request, GetCrossConnectLetterOfAuthorityResponse::builder)
                .logger(LOG, "getCrossConnectLetterOfAuthority")
                .serviceDetails(
                        "VirtualNetwork",
                        "GetCrossConnectLetterOfAuthority",
                        "https://docs.oracle.com/iaas/api/#/en/iaas/20160918/LetterOfAuthority/GetCrossConnectLetterOfAuthority")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetCrossConnectLetterOfAuthorityRequest::builder)
                .basePath("/20160918")
                .appendPathParam("crossConnects")
                .appendPathParam(request.getCrossConnectId())
                .appendPathParam("letterOfAuthority")
                .accept("application/json, text/html")
                .handleBody(
                        com.oracle.bmc.core.model.LetterOfAuthority.class,
                        GetCrossConnectLetterOfAuthorityResponse.Builder::letterOfAuthority)
                .handleResponseHeaderString(
                        "opc-request-id",
                        GetCrossConnectLetterOfAuthorityResponse.Builder::opcRequestId)
                .operationUsesDefaultRetries()
                .callSync();
    }

    @Override
    public GetCrossConnectStatusResponse getCrossConnectStatus(
            GetCrossConnectStatusRequest request) {

        Validate.notBlank(request.getCrossConnectId(), "crossConnectId must not be blank");

        return clientCall(request, GetCrossConnectStatusResponse::builder)
                .logger(LOG, "getCrossConnectStatus")
                .serviceDetails(
                        "VirtualNetwork",
                        "GetCrossConnectStatus",
                        "https://docs.oracle.com/iaas/api/#/en/iaas/20160918/CrossConnectStatus/GetCrossConnectStatus")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetCrossConnectStatusRequest::builder)
                .basePath("/20160918")
                .appendPathParam("crossConnects")
                .appendPathParam(request.getCrossConnectId())
                .appendPathParam("status")
                .accept("application/json")
                .handleBody(
                        com.oracle.bmc.core.model.CrossConnectStatus.class,
                        GetCrossConnectStatusResponse.Builder::crossConnectStatus)
                .handleResponseHeaderString(
                        "opc-request-id", GetCrossConnectStatusResponse.Builder::opcRequestId)
                .operationUsesDefaultRetries()
                .callSync();
    }

    @Override
    public GetDhcpOptionsResponse getDhcpOptions(GetDhcpOptionsRequest request) {

        Validate.notBlank(request.getDhcpId(), "dhcpId must not be blank");

        return clientCall(request, GetDhcpOptionsResponse::builder)
                .logger(LOG, "getDhcpOptions")
                .serviceDetails(
                        "VirtualNetwork",
                        "GetDhcpOptions",
                        "https://docs.oracle.com/iaas/api/#/en/iaas/20160918/DhcpOptions/GetDhcpOptions")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetDhcpOptionsRequest::builder)
                .basePath("/20160918")
                .appendPathParam("dhcps")
                .appendPathParam(request.getDhcpId())
                .accept("application/json")
                .handleBody(
                        com.oracle.bmc.core.model.DhcpOptions.class,
                        GetDhcpOptionsResponse.Builder::dhcpOptions)
                .handleResponseHeaderString("etag", GetDhcpOptionsResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", GetDhcpOptionsResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public GetDrgResponse getDrg(GetDrgRequest request) {

        Validate.notBlank(request.getDrgId(), "drgId must not be blank");

        return clientCall(request, GetDrgResponse::builder)
                .logger(LOG, "getDrg")
                .serviceDetails(
                        "VirtualNetwork",
                        "GetDrg",
                        "https://docs.oracle.com/iaas/api/#/en/iaas/20160918/Drg/GetDrg")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetDrgRequest::builder)
                .basePath("/20160918")
                .appendPathParam("drgs")
                .appendPathParam(request.getDrgId())
                .accept("application/json")
                .handleBody(com.oracle.bmc.core.model.Drg.class, GetDrgResponse.Builder::drg)
                .handleResponseHeaderString("etag", GetDrgResponse.Builder::etag)
                .handleResponseHeaderString("opc-request-id", GetDrgResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public GetDrgAttachmentResponse getDrgAttachment(GetDrgAttachmentRequest request) {

        Validate.notBlank(request.getDrgAttachmentId(), "drgAttachmentId must not be blank");

        return clientCall(request, GetDrgAttachmentResponse::builder)
                .logger(LOG, "getDrgAttachment")
                .serviceDetails(
                        "VirtualNetwork",
                        "GetDrgAttachment",
                        "https://docs.oracle.com/iaas/api/#/en/iaas/20160918/DrgAttachment/GetDrgAttachment")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetDrgAttachmentRequest::builder)
                .basePath("/20160918")
                .appendPathParam("drgAttachments")
                .appendPathParam(request.getDrgAttachmentId())
                .accept("application/json")
                .handleBody(
                        com.oracle.bmc.core.model.DrgAttachment.class,
                        GetDrgAttachmentResponse.Builder::drgAttachment)
                .handleResponseHeaderString("etag", GetDrgAttachmentResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", GetDrgAttachmentResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public GetDrgRedundancyStatusResponse getDrgRedundancyStatus(
            GetDrgRedundancyStatusRequest request) {

        Validate.notBlank(request.getDrgId(), "drgId must not be blank");

        return clientCall(request, GetDrgRedundancyStatusResponse::builder)
                .logger(LOG, "getDrgRedundancyStatus")
                .serviceDetails(
                        "VirtualNetwork",
                        "GetDrgRedundancyStatus",
                        "https://docs.oracle.com/iaas/api/#/en/iaas/20160918/DrgRedundancyStatus/GetDrgRedundancyStatus")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetDrgRedundancyStatusRequest::builder)
                .basePath("/20160918")
                .appendPathParam("drgs")
                .appendPathParam(request.getDrgId())
                .appendPathParam("redundancyStatus")
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.core.model.DrgRedundancyStatus.class,
                        GetDrgRedundancyStatusResponse.Builder::drgRedundancyStatus)
                .handleResponseHeaderString(
                        "opc-request-id", GetDrgRedundancyStatusResponse.Builder::opcRequestId)
                .operationUsesDefaultRetries()
                .callSync();
    }

    @Override
    public GetDrgRouteDistributionResponse getDrgRouteDistribution(
            GetDrgRouteDistributionRequest request) {

        Validate.notBlank(
                request.getDrgRouteDistributionId(), "drgRouteDistributionId must not be blank");

        return clientCall(request, GetDrgRouteDistributionResponse::builder)
                .logger(LOG, "getDrgRouteDistribution")
                .serviceDetails(
                        "VirtualNetwork",
                        "GetDrgRouteDistribution",
                        "https://docs.oracle.com/iaas/api/#/en/iaas/20160918/DrgRouteDistribution/GetDrgRouteDistribution")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetDrgRouteDistributionRequest::builder)
                .basePath("/20160918")
                .appendPathParam("drgRouteDistributions")
                .appendPathParam(request.getDrgRouteDistributionId())
                .accept("application/json")
                .handleBody(
                        com.oracle.bmc.core.model.DrgRouteDistribution.class,
                        GetDrgRouteDistributionResponse.Builder::drgRouteDistribution)
                .handleResponseHeaderString("etag", GetDrgRouteDistributionResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", GetDrgRouteDistributionResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public GetDrgRouteTableResponse getDrgRouteTable(GetDrgRouteTableRequest request) {

        Validate.notBlank(request.getDrgRouteTableId(), "drgRouteTableId must not be blank");

        return clientCall(request, GetDrgRouteTableResponse::builder)
                .logger(LOG, "getDrgRouteTable")
                .serviceDetails(
                        "VirtualNetwork",
                        "GetDrgRouteTable",
                        "https://docs.oracle.com/iaas/api/#/en/iaas/20160918/DrgRouteTable/GetDrgRouteTable")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetDrgRouteTableRequest::builder)
                .basePath("/20160918")
                .appendPathParam("drgRouteTables")
                .appendPathParam(request.getDrgRouteTableId())
                .accept("application/json")
                .handleBody(
                        com.oracle.bmc.core.model.DrgRouteTable.class,
                        GetDrgRouteTableResponse.Builder::drgRouteTable)
                .handleResponseHeaderString("etag", GetDrgRouteTableResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", GetDrgRouteTableResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public GetFastConnectProviderServiceResponse getFastConnectProviderService(
            GetFastConnectProviderServiceRequest request) {

        Validate.notBlank(request.getProviderServiceId(), "providerServiceId must not be blank");

        return clientCall(request, GetFastConnectProviderServiceResponse::builder)
                .logger(LOG, "getFastConnectProviderService")
                .serviceDetails(
                        "VirtualNetwork",
                        "GetFastConnectProviderService",
                        "https://docs.oracle.com/iaas/api/#/en/iaas/20160918/FastConnectProviderService/GetFastConnectProviderService")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetFastConnectProviderServiceRequest::builder)
                .basePath("/20160918")
                .appendPathParam("fastConnectProviderServices")
                .appendPathParam(request.getProviderServiceId())
                .accept("application/json")
                .handleBody(
                        com.oracle.bmc.core.model.FastConnectProviderService.class,
                        GetFastConnectProviderServiceResponse.Builder::fastConnectProviderService)
                .handleResponseHeaderString(
                        "opc-request-id",
                        GetFastConnectProviderServiceResponse.Builder::opcRequestId)
                .operationUsesDefaultRetries()
                .callSync();
    }

    @Override
    public GetFastConnectProviderServiceKeyResponse getFastConnectProviderServiceKey(
            GetFastConnectProviderServiceKeyRequest request) {

        Validate.notBlank(request.getProviderServiceId(), "providerServiceId must not be blank");

        Validate.notBlank(
                request.getProviderServiceKeyName(), "providerServiceKeyName must not be blank");

        return clientCall(request, GetFastConnectProviderServiceKeyResponse::builder)
                .logger(LOG, "getFastConnectProviderServiceKey")
                .serviceDetails(
                        "VirtualNetwork",
                        "GetFastConnectProviderServiceKey",
                        "https://docs.oracle.com/iaas/api/#/en/iaas/20160918/FastConnectProviderServiceKey/GetFastConnectProviderServiceKey")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetFastConnectProviderServiceKeyRequest::builder)
                .basePath("/20160918")
                .appendPathParam("fastConnectProviderServices")
                .appendPathParam(request.getProviderServiceId())
                .appendPathParam("providerServiceKeys")
                .appendPathParam(request.getProviderServiceKeyName())
                .accept("application/json")
                .handleBody(
                        com.oracle.bmc.core.model.FastConnectProviderServiceKey.class,
                        GetFastConnectProviderServiceKeyResponse.Builder
                                ::fastConnectProviderServiceKey)
                .handleResponseHeaderString(
                        "opc-request-id",
                        GetFastConnectProviderServiceKeyResponse.Builder::opcRequestId)
                .operationUsesDefaultRetries()
                .callSync();
    }

    @Override
    public GetIPSecConnectionResponse getIPSecConnection(GetIPSecConnectionRequest request) {

        Validate.notBlank(request.getIpscId(), "ipscId must not be blank");

        return clientCall(request, GetIPSecConnectionResponse::builder)
                .logger(LOG, "getIPSecConnection")
                .serviceDetails(
                        "VirtualNetwork",
                        "GetIPSecConnection",
                        "https://docs.oracle.com/iaas/api/#/en/iaas/20160918/IPSecConnection/GetIPSecConnection")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetIPSecConnectionRequest::builder)
                .basePath("/20160918")
                .appendPathParam("ipsecConnections")
                .appendPathParam(request.getIpscId())
                .accept("application/json")
                .handleBody(
                        com.oracle.bmc.core.model.IPSecConnection.class,
                        GetIPSecConnectionResponse.Builder::iPSecConnection)
                .handleResponseHeaderString("etag", GetIPSecConnectionResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", GetIPSecConnectionResponse.Builder::opcRequestId)
                .operationUsesDefaultRetries()
                .callSync();
    }

    @Override
    public GetIPSecConnectionDeviceConfigResponse getIPSecConnectionDeviceConfig(
            GetIPSecConnectionDeviceConfigRequest request) {

        Validate.notBlank(request.getIpscId(), "ipscId must not be blank");

        return clientCall(request, GetIPSecConnectionDeviceConfigResponse::builder)
                .logger(LOG, "getIPSecConnectionDeviceConfig")
                .serviceDetails(
                        "VirtualNetwork",
                        "GetIPSecConnectionDeviceConfig",
                        "https://docs.oracle.com/iaas/api/#/en/iaas/20160918/IPSecConnectionDeviceConfig/GetIPSecConnectionDeviceConfig")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetIPSecConnectionDeviceConfigRequest::builder)
                .basePath("/20160918")
                .appendPathParam("ipsecConnections")
                .appendPathParam(request.getIpscId())
                .appendPathParam("deviceConfig")
                .accept("application/json")
                .handleBody(
                        com.oracle.bmc.core.model.IPSecConnectionDeviceConfig.class,
                        GetIPSecConnectionDeviceConfigResponse.Builder::iPSecConnectionDeviceConfig)
                .handleResponseHeaderString(
                        "etag", GetIPSecConnectionDeviceConfigResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id",
                        GetIPSecConnectionDeviceConfigResponse.Builder::opcRequestId)
                .operationUsesDefaultRetries()
                .callSync();
    }

    @Override
    public GetIPSecConnectionDeviceStatusResponse getIPSecConnectionDeviceStatus(
            GetIPSecConnectionDeviceStatusRequest request) {

        Validate.notBlank(request.getIpscId(), "ipscId must not be blank");

        return clientCall(request, GetIPSecConnectionDeviceStatusResponse::builder)
                .logger(LOG, "getIPSecConnectionDeviceStatus")
                .serviceDetails(
                        "VirtualNetwork",
                        "GetIPSecConnectionDeviceStatus",
                        "https://docs.oracle.com/iaas/api/#/en/iaas/20160918/IPSecConnectionDeviceStatus/GetIPSecConnectionDeviceStatus")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetIPSecConnectionDeviceStatusRequest::builder)
                .basePath("/20160918")
                .appendPathParam("ipsecConnections")
                .appendPathParam(request.getIpscId())
                .appendPathParam("deviceStatus")
                .accept("application/json")
                .handleBody(
                        com.oracle.bmc.core.model.IPSecConnectionDeviceStatus.class,
                        GetIPSecConnectionDeviceStatusResponse.Builder::iPSecConnectionDeviceStatus)
                .handleResponseHeaderString(
                        "etag", GetIPSecConnectionDeviceStatusResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id",
                        GetIPSecConnectionDeviceStatusResponse.Builder::opcRequestId)
                .operationUsesDefaultRetries()
                .callSync();
    }

    @Override
    public GetIPSecConnectionTunnelResponse getIPSecConnectionTunnel(
            GetIPSecConnectionTunnelRequest request) {

        Validate.notBlank(request.getIpscId(), "ipscId must not be blank");

        Validate.notBlank(request.getTunnelId(), "tunnelId must not be blank");

        return clientCall(request, GetIPSecConnectionTunnelResponse::builder)
                .logger(LOG, "getIPSecConnectionTunnel")
                .serviceDetails(
                        "VirtualNetwork",
                        "GetIPSecConnectionTunnel",
                        "https://docs.oracle.com/iaas/api/#/en/iaas/20160918/IPSecConnectionTunnel/GetIPSecConnectionTunnel")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetIPSecConnectionTunnelRequest::builder)
                .basePath("/20160918")
                .appendPathParam("ipsecConnections")
                .appendPathParam(request.getIpscId())
                .appendPathParam("tunnels")
                .appendPathParam(request.getTunnelId())
                .accept("application/json")
                .handleBody(
                        com.oracle.bmc.core.model.IPSecConnectionTunnel.class,
                        GetIPSecConnectionTunnelResponse.Builder::iPSecConnectionTunnel)
                .handleResponseHeaderString("etag", GetIPSecConnectionTunnelResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", GetIPSecConnectionTunnelResponse.Builder::opcRequestId)
                .operationUsesDefaultRetries()
                .callSync();
    }

    @Override
    public GetIPSecConnectionTunnelErrorResponse getIPSecConnectionTunnelError(
            GetIPSecConnectionTunnelErrorRequest request) {

        Validate.notBlank(request.getIpscId(), "ipscId must not be blank");

        Validate.notBlank(request.getTunnelId(), "tunnelId must not be blank");

        return clientCall(request, GetIPSecConnectionTunnelErrorResponse::builder)
                .logger(LOG, "getIPSecConnectionTunnelError")
                .serviceDetails(
                        "VirtualNetwork",
                        "GetIPSecConnectionTunnelError",
                        "https://docs.oracle.com/iaas/api/#/en/iaas/20160918/IPSecConnectionTunnelErrorDetails/GetIPSecConnectionTunnelError")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetIPSecConnectionTunnelErrorRequest::builder)
                .basePath("/20160918")
                .appendPathParam("ipsecConnections")
                .appendPathParam(request.getIpscId())
                .appendPathParam("tunnels")
                .appendPathParam(request.getTunnelId())
                .appendPathParam("error")
                .accept("application/json")
                .handleBody(
                        com.oracle.bmc.core.model.IPSecConnectionTunnelErrorDetails.class,
                        GetIPSecConnectionTunnelErrorResponse.Builder
                                ::iPSecConnectionTunnelErrorDetails)
                .handleResponseHeaderString(
                        "opc-request-id",
                        GetIPSecConnectionTunnelErrorResponse.Builder::opcRequestId)
                .operationUsesDefaultRetries()
                .callSync();
    }

    @Override
    public GetIPSecConnectionTunnelSharedSecretResponse getIPSecConnectionTunnelSharedSecret(
            GetIPSecConnectionTunnelSharedSecretRequest request) {

        Validate.notBlank(request.getIpscId(), "ipscId must not be blank");

        Validate.notBlank(request.getTunnelId(), "tunnelId must not be blank");

        return clientCall(request, GetIPSecConnectionTunnelSharedSecretResponse::builder)
                .logger(LOG, "getIPSecConnectionTunnelSharedSecret")
                .serviceDetails(
                        "VirtualNetwork",
                        "GetIPSecConnectionTunnelSharedSecret",
                        "https://docs.oracle.com/iaas/api/#/en/iaas/20160918/IPSecConnectionTunnelSharedSecret/GetIPSecConnectionTunnelSharedSecret")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetIPSecConnectionTunnelSharedSecretRequest::builder)
                .basePath("/20160918")
                .appendPathParam("ipsecConnections")
                .appendPathParam(request.getIpscId())
                .appendPathParam("tunnels")
                .appendPathParam(request.getTunnelId())
                .appendPathParam("sharedSecret")
                .accept("application/json")
                .handleBody(
                        com.oracle.bmc.core.model.IPSecConnectionTunnelSharedSecret.class,
                        GetIPSecConnectionTunnelSharedSecretResponse.Builder
                                ::iPSecConnectionTunnelSharedSecret)
                .handleResponseHeaderString(
                        "etag", GetIPSecConnectionTunnelSharedSecretResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id",
                        GetIPSecConnectionTunnelSharedSecretResponse.Builder::opcRequestId)
                .operationUsesDefaultRetries()
                .callSync();
    }

    @Override
    public GetInternetGatewayResponse getInternetGateway(GetInternetGatewayRequest request) {

        Validate.notBlank(request.getIgId(), "igId must not be blank");

        return clientCall(request, GetInternetGatewayResponse::builder)
                .logger(LOG, "getInternetGateway")
                .serviceDetails(
                        "VirtualNetwork",
                        "GetInternetGateway",
                        "https://docs.oracle.com/iaas/api/#/en/iaas/20160918/InternetGateway/GetInternetGateway")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetInternetGatewayRequest::builder)
                .basePath("/20160918")
                .appendPathParam("internetGateways")
                .appendPathParam(request.getIgId())
                .accept("application/json")
                .handleBody(
                        com.oracle.bmc.core.model.InternetGateway.class,
                        GetInternetGatewayResponse.Builder::internetGateway)
                .handleResponseHeaderString("etag", GetInternetGatewayResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", GetInternetGatewayResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public GetIpsecCpeDeviceConfigContentResponse getIpsecCpeDeviceConfigContent(
            GetIpsecCpeDeviceConfigContentRequest request) {

        Validate.notBlank(request.getIpscId(), "ipscId must not be blank");

        return clientCall(request, GetIpsecCpeDeviceConfigContentResponse::builder)
                .logger(LOG, "getIpsecCpeDeviceConfigContent")
                .serviceDetails(
                        "VirtualNetwork",
                        "GetIpsecCpeDeviceConfigContent",
                        "https://docs.oracle.com/iaas/api/#/en/iaas/20160918/IPSecConnection/GetIpsecCpeDeviceConfigContent")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetIpsecCpeDeviceConfigContentRequest::builder)
                .basePath("/20160918")
                .appendPathParam("ipsecConnections")
                .appendPathParam(request.getIpscId())
                .appendPathParam("cpeConfigContent")
                .accept("text/plain; charset=utf-8")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        java.io.InputStream.class,
                        GetIpsecCpeDeviceConfigContentResponse.Builder::inputStream)
                .handleResponseHeaderString(
                        "opc-request-id",
                        GetIpsecCpeDeviceConfigContentResponse.Builder::opcRequestId)
                .operationUsesDefaultRetries()
                .callSync();
    }

    @Override
    public GetIpv6Response getIpv6(GetIpv6Request request) {

        Validate.notBlank(request.getIpv6Id(), "ipv6Id must not be blank");

        return clientCall(request, GetIpv6Response::builder)
                .logger(LOG, "getIpv6")
                .serviceDetails(
                        "VirtualNetwork",
                        "GetIpv6",
                        "https://docs.oracle.com/iaas/api/#/en/iaas/20160918/Ipv6/GetIpv6")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetIpv6Request::builder)
                .basePath("/20160918")
                .appendPathParam("ipv6")
                .appendPathParam(request.getIpv6Id())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(com.oracle.bmc.core.model.Ipv6.class, GetIpv6Response.Builder::ipv6)
                .handleResponseHeaderString("etag", GetIpv6Response.Builder::etag)
                .handleResponseHeaderString("opc-request-id", GetIpv6Response.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public GetLocalPeeringGatewayResponse getLocalPeeringGateway(
            GetLocalPeeringGatewayRequest request) {

        Validate.notBlank(
                request.getLocalPeeringGatewayId(), "localPeeringGatewayId must not be blank");

        return clientCall(request, GetLocalPeeringGatewayResponse::builder)
                .logger(LOG, "getLocalPeeringGateway")
                .serviceDetails(
                        "VirtualNetwork",
                        "GetLocalPeeringGateway",
                        "https://docs.oracle.com/iaas/api/#/en/iaas/20160918/LocalPeeringGateway/GetLocalPeeringGateway")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetLocalPeeringGatewayRequest::builder)
                .basePath("/20160918")
                .appendPathParam("localPeeringGateways")
                .appendPathParam(request.getLocalPeeringGatewayId())
                .accept("application/json")
                .handleBody(
                        com.oracle.bmc.core.model.LocalPeeringGateway.class,
                        GetLocalPeeringGatewayResponse.Builder::localPeeringGateway)
                .handleResponseHeaderString("etag", GetLocalPeeringGatewayResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", GetLocalPeeringGatewayResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public GetNatGatewayResponse getNatGateway(GetNatGatewayRequest request) {

        Validate.notBlank(request.getNatGatewayId(), "natGatewayId must not be blank");

        return clientCall(request, GetNatGatewayResponse::builder)
                .logger(LOG, "getNatGateway")
                .serviceDetails(
                        "VirtualNetwork",
                        "GetNatGateway",
                        "https://docs.oracle.com/iaas/api/#/en/iaas/20160918/NatGateway/GetNatGateway")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetNatGatewayRequest::builder)
                .basePath("/20160918")
                .appendPathParam("natGateways")
                .appendPathParam(request.getNatGatewayId())
                .accept("application/json")
                .handleBody(
                        com.oracle.bmc.core.model.NatGateway.class,
                        GetNatGatewayResponse.Builder::natGateway)
                .handleResponseHeaderString("etag", GetNatGatewayResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", GetNatGatewayResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public GetNetworkSecurityGroupResponse getNetworkSecurityGroup(
            GetNetworkSecurityGroupRequest request) {

        Validate.notBlank(
                request.getNetworkSecurityGroupId(), "networkSecurityGroupId must not be blank");

        return clientCall(request, GetNetworkSecurityGroupResponse::builder)
                .logger(LOG, "getNetworkSecurityGroup")
                .serviceDetails(
                        "VirtualNetwork",
                        "GetNetworkSecurityGroup",
                        "https://docs.oracle.com/iaas/api/#/en/iaas/20160918/NetworkSecurityGroup/GetNetworkSecurityGroup")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetNetworkSecurityGroupRequest::builder)
                .basePath("/20160918")
                .appendPathParam("networkSecurityGroups")
                .appendPathParam(request.getNetworkSecurityGroupId())
                .accept("application/json")
                .handleBody(
                        com.oracle.bmc.core.model.NetworkSecurityGroup.class,
                        GetNetworkSecurityGroupResponse.Builder::networkSecurityGroup)
                .handleResponseHeaderString("etag", GetNetworkSecurityGroupResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", GetNetworkSecurityGroupResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public GetNetworkingTopologyResponse getNetworkingTopology(
            GetNetworkingTopologyRequest request) {
        Objects.requireNonNull(request.getCompartmentId(), "compartmentId is required");

        return clientCall(request, GetNetworkingTopologyResponse::builder)
                .logger(LOG, "getNetworkingTopology")
                .serviceDetails(
                        "VirtualNetwork",
                        "GetNetworkingTopology",
                        "https://docs.oracle.com/iaas/api/#/en/iaas/20160918/NetworkingTopology/GetNetworkingTopology")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetNetworkingTopologyRequest::builder)
                .basePath("/20160918")
                .appendPathParam("networkingTopology")
                .appendQueryParam("compartmentId", request.getCompartmentId())
                .appendEnumQueryParam("accessLevel", request.getAccessLevel())
                .appendQueryParam("queryCompartmentSubtree", request.getQueryCompartmentSubtree())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("if-none-match", request.getIfNoneMatch())
                .appendHeader("cache-control", request.getCacheControl())
                .handleBody(
                        com.oracle.bmc.core.model.NetworkingTopology.class,
                        GetNetworkingTopologyResponse.Builder::networkingTopology)
                .handleResponseHeaderString("etag", GetNetworkingTopologyResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", GetNetworkingTopologyResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public GetPrivateIpResponse getPrivateIp(GetPrivateIpRequest request) {

        Validate.notBlank(request.getPrivateIpId(), "privateIpId must not be blank");

        return clientCall(request, GetPrivateIpResponse::builder)
                .logger(LOG, "getPrivateIp")
                .serviceDetails(
                        "VirtualNetwork",
                        "GetPrivateIp",
                        "https://docs.oracle.com/iaas/api/#/en/iaas/20160918/PrivateIp/GetPrivateIp")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetPrivateIpRequest::builder)
                .basePath("/20160918")
                .appendPathParam("privateIps")
                .appendPathParam(request.getPrivateIpId())
                .accept("application/json")
                .handleBody(
                        com.oracle.bmc.core.model.PrivateIp.class,
                        GetPrivateIpResponse.Builder::privateIp)
                .handleResponseHeaderString("etag", GetPrivateIpResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", GetPrivateIpResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public GetPublicIpResponse getPublicIp(GetPublicIpRequest request) {

        Validate.notBlank(request.getPublicIpId(), "publicIpId must not be blank");

        return clientCall(request, GetPublicIpResponse::builder)
                .logger(LOG, "getPublicIp")
                .serviceDetails(
                        "VirtualNetwork",
                        "GetPublicIp",
                        "https://docs.oracle.com/iaas/api/#/en/iaas/20160918/PublicIp/GetPublicIp")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetPublicIpRequest::builder)
                .basePath("/20160918")
                .appendPathParam("publicIps")
                .appendPathParam(request.getPublicIpId())
                .accept("application/json")
                .handleBody(
                        com.oracle.bmc.core.model.PublicIp.class,
                        GetPublicIpResponse.Builder::publicIp)
                .handleResponseHeaderString("etag", GetPublicIpResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", GetPublicIpResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public GetPublicIpByIpAddressResponse getPublicIpByIpAddress(
            GetPublicIpByIpAddressRequest request) {
        Objects.requireNonNull(
                request.getGetPublicIpByIpAddressDetails(),
                "getPublicIpByIpAddressDetails is required");

        return clientCall(request, GetPublicIpByIpAddressResponse::builder)
                .logger(LOG, "getPublicIpByIpAddress")
                .serviceDetails(
                        "VirtualNetwork",
                        "GetPublicIpByIpAddress",
                        "https://docs.oracle.com/iaas/api/#/en/iaas/20160918/PublicIp/GetPublicIpByIpAddress")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(GetPublicIpByIpAddressRequest::builder)
                .basePath("/20160918")
                .appendPathParam("publicIps")
                .appendPathParam("actions")
                .appendPathParam("getByIpAddress")
                .accept("application/json")
                .hasBody()
                .handleBody(
                        com.oracle.bmc.core.model.PublicIp.class,
                        GetPublicIpByIpAddressResponse.Builder::publicIp)
                .handleResponseHeaderString("etag", GetPublicIpByIpAddressResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", GetPublicIpByIpAddressResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public GetPublicIpByPrivateIpIdResponse getPublicIpByPrivateIpId(
            GetPublicIpByPrivateIpIdRequest request) {
        Objects.requireNonNull(
                request.getGetPublicIpByPrivateIpIdDetails(),
                "getPublicIpByPrivateIpIdDetails is required");

        return clientCall(request, GetPublicIpByPrivateIpIdResponse::builder)
                .logger(LOG, "getPublicIpByPrivateIpId")
                .serviceDetails(
                        "VirtualNetwork",
                        "GetPublicIpByPrivateIpId",
                        "https://docs.oracle.com/iaas/api/#/en/iaas/20160918/PublicIp/GetPublicIpByPrivateIpId")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(GetPublicIpByPrivateIpIdRequest::builder)
                .basePath("/20160918")
                .appendPathParam("publicIps")
                .appendPathParam("actions")
                .appendPathParam("getByPrivateIpId")
                .accept("application/json")
                .hasBody()
                .handleBody(
                        com.oracle.bmc.core.model.PublicIp.class,
                        GetPublicIpByPrivateIpIdResponse.Builder::publicIp)
                .handleResponseHeaderString("etag", GetPublicIpByPrivateIpIdResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", GetPublicIpByPrivateIpIdResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public GetPublicIpPoolResponse getPublicIpPool(GetPublicIpPoolRequest request) {

        Validate.notBlank(request.getPublicIpPoolId(), "publicIpPoolId must not be blank");

        return clientCall(request, GetPublicIpPoolResponse::builder)
                .logger(LOG, "getPublicIpPool")
                .serviceDetails(
                        "VirtualNetwork",
                        "GetPublicIpPool",
                        "https://docs.oracle.com/iaas/api/#/en/iaas/20160918/PublicIpPool/GetPublicIpPool")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetPublicIpPoolRequest::builder)
                .basePath("/20160918")
                .appendPathParam("publicIpPools")
                .appendPathParam(request.getPublicIpPoolId())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.core.model.PublicIpPool.class,
                        GetPublicIpPoolResponse.Builder::publicIpPool)
                .handleResponseHeaderString("etag", GetPublicIpPoolResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", GetPublicIpPoolResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public GetRemotePeeringConnectionResponse getRemotePeeringConnection(
            GetRemotePeeringConnectionRequest request) {

        Validate.notBlank(
                request.getRemotePeeringConnectionId(),
                "remotePeeringConnectionId must not be blank");

        return clientCall(request, GetRemotePeeringConnectionResponse::builder)
                .logger(LOG, "getRemotePeeringConnection")
                .serviceDetails(
                        "VirtualNetwork",
                        "GetRemotePeeringConnection",
                        "https://docs.oracle.com/iaas/api/#/en/iaas/20160918/RemotePeeringConnection/GetRemotePeeringConnection")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetRemotePeeringConnectionRequest::builder)
                .basePath("/20160918")
                .appendPathParam("remotePeeringConnections")
                .appendPathParam(request.getRemotePeeringConnectionId())
                .accept("application/json")
                .handleBody(
                        com.oracle.bmc.core.model.RemotePeeringConnection.class,
                        GetRemotePeeringConnectionResponse.Builder::remotePeeringConnection)
                .handleResponseHeaderString(
                        "etag", GetRemotePeeringConnectionResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", GetRemotePeeringConnectionResponse.Builder::opcRequestId)
                .operationUsesDefaultRetries()
                .callSync();
    }

    @Override
    public GetRouteTableResponse getRouteTable(GetRouteTableRequest request) {

        Validate.notBlank(request.getRtId(), "rtId must not be blank");

        return clientCall(request, GetRouteTableResponse::builder)
                .logger(LOG, "getRouteTable")
                .serviceDetails(
                        "VirtualNetwork",
                        "GetRouteTable",
                        "https://docs.oracle.com/iaas/api/#/en/iaas/20160918/RouteTable/GetRouteTable")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetRouteTableRequest::builder)
                .basePath("/20160918")
                .appendPathParam("routeTables")
                .appendPathParam(request.getRtId())
                .accept("application/json")
                .handleBody(
                        com.oracle.bmc.core.model.RouteTable.class,
                        GetRouteTableResponse.Builder::routeTable)
                .handleResponseHeaderString("etag", GetRouteTableResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", GetRouteTableResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public GetSecurityListResponse getSecurityList(GetSecurityListRequest request) {

        Validate.notBlank(request.getSecurityListId(), "securityListId must not be blank");

        return clientCall(request, GetSecurityListResponse::builder)
                .logger(LOG, "getSecurityList")
                .serviceDetails(
                        "VirtualNetwork",
                        "GetSecurityList",
                        "https://docs.oracle.com/iaas/api/#/en/iaas/20160918/SecurityList/GetSecurityList")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetSecurityListRequest::builder)
                .basePath("/20160918")
                .appendPathParam("securityLists")
                .appendPathParam(request.getSecurityListId())
                .accept("application/json")
                .handleBody(
                        com.oracle.bmc.core.model.SecurityList.class,
                        GetSecurityListResponse.Builder::securityList)
                .handleResponseHeaderString("etag", GetSecurityListResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", GetSecurityListResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public GetServiceResponse getService(GetServiceRequest request) {

        Validate.notBlank(request.getServiceId(), "serviceId must not be blank");

        return clientCall(request, GetServiceResponse::builder)
                .logger(LOG, "getService")
                .serviceDetails(
                        "VirtualNetwork",
                        "GetService",
                        "https://docs.oracle.com/iaas/api/#/en/iaas/20160918/Service/GetService")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetServiceRequest::builder)
                .basePath("/20160918")
                .appendPathParam("services")
                .appendPathParam(request.getServiceId())
                .accept("application/json")
                .handleBody(
                        com.oracle.bmc.core.model.Service.class,
                        GetServiceResponse.Builder::service)
                .handleResponseHeaderString("etag", GetServiceResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", GetServiceResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public GetServiceGatewayResponse getServiceGateway(GetServiceGatewayRequest request) {

        Validate.notBlank(request.getServiceGatewayId(), "serviceGatewayId must not be blank");

        return clientCall(request, GetServiceGatewayResponse::builder)
                .logger(LOG, "getServiceGateway")
                .serviceDetails(
                        "VirtualNetwork",
                        "GetServiceGateway",
                        "https://docs.oracle.com/iaas/api/#/en/iaas/20160918/ServiceGateway/GetServiceGateway")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetServiceGatewayRequest::builder)
                .basePath("/20160918")
                .appendPathParam("serviceGateways")
                .appendPathParam(request.getServiceGatewayId())
                .accept("application/json")
                .handleBody(
                        com.oracle.bmc.core.model.ServiceGateway.class,
                        GetServiceGatewayResponse.Builder::serviceGateway)
                .handleResponseHeaderString("etag", GetServiceGatewayResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", GetServiceGatewayResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public GetSubnetResponse getSubnet(GetSubnetRequest request) {

        Validate.notBlank(request.getSubnetId(), "subnetId must not be blank");

        return clientCall(request, GetSubnetResponse::builder)
                .logger(LOG, "getSubnet")
                .serviceDetails(
                        "VirtualNetwork",
                        "GetSubnet",
                        "https://docs.oracle.com/iaas/api/#/en/iaas/20160918/Subnet/GetSubnet")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetSubnetRequest::builder)
                .basePath("/20160918")
                .appendPathParam("subnets")
                .appendPathParam(request.getSubnetId())
                .accept("application/json")
                .handleBody(
                        com.oracle.bmc.core.model.Subnet.class, GetSubnetResponse.Builder::subnet)
                .handleResponseHeaderString("etag", GetSubnetResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", GetSubnetResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public GetSubnetTopologyResponse getSubnetTopology(GetSubnetTopologyRequest request) {
        Objects.requireNonNull(request.getCompartmentId(), "compartmentId is required");

        Objects.requireNonNull(request.getSubnetId(), "subnetId is required");

        return clientCall(request, GetSubnetTopologyResponse::builder)
                .logger(LOG, "getSubnetTopology")
                .serviceDetails(
                        "VirtualNetwork",
                        "GetSubnetTopology",
                        "https://docs.oracle.com/iaas/api/#/en/iaas/20160918/SubnetTopology/GetSubnetTopology")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetSubnetTopologyRequest::builder)
                .basePath("/20160918")
                .appendPathParam("subnetTopology")
                .appendQueryParam("compartmentId", request.getCompartmentId())
                .appendEnumQueryParam("accessLevel", request.getAccessLevel())
                .appendQueryParam("queryCompartmentSubtree", request.getQueryCompartmentSubtree())
                .appendQueryParam("subnetId", request.getSubnetId())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("if-none-match", request.getIfNoneMatch())
                .appendHeader("cache-control", request.getCacheControl())
                .handleBody(
                        com.oracle.bmc.core.model.SubnetTopology.class,
                        GetSubnetTopologyResponse.Builder::subnetTopology)
                .handleResponseHeaderString("etag", GetSubnetTopologyResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", GetSubnetTopologyResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public GetTunnelCpeDeviceConfigResponse getTunnelCpeDeviceConfig(
            GetTunnelCpeDeviceConfigRequest request) {

        Validate.notBlank(request.getIpscId(), "ipscId must not be blank");

        Validate.notBlank(request.getTunnelId(), "tunnelId must not be blank");

        return clientCall(request, GetTunnelCpeDeviceConfigResponse::builder)
                .logger(LOG, "getTunnelCpeDeviceConfig")
                .serviceDetails(
                        "VirtualNetwork",
                        "GetTunnelCpeDeviceConfig",
                        "https://docs.oracle.com/iaas/api/#/en/iaas/20160918/TunnelCpeDeviceConfig/GetTunnelCpeDeviceConfig")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetTunnelCpeDeviceConfigRequest::builder)
                .basePath("/20160918")
                .appendPathParam("ipsecConnections")
                .appendPathParam(request.getIpscId())
                .appendPathParam("tunnels")
                .appendPathParam(request.getTunnelId())
                .appendPathParam("tunnelDeviceConfig")
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.core.model.TunnelCpeDeviceConfig.class,
                        GetTunnelCpeDeviceConfigResponse.Builder::tunnelCpeDeviceConfig)
                .handleResponseHeaderString("etag", GetTunnelCpeDeviceConfigResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", GetTunnelCpeDeviceConfigResponse.Builder::opcRequestId)
                .operationUsesDefaultRetries()
                .callSync();
    }

    @Override
    public GetTunnelCpeDeviceConfigContentResponse getTunnelCpeDeviceConfigContent(
            GetTunnelCpeDeviceConfigContentRequest request) {

        Validate.notBlank(request.getIpscId(), "ipscId must not be blank");

        Validate.notBlank(request.getTunnelId(), "tunnelId must not be blank");

        return clientCall(request, GetTunnelCpeDeviceConfigContentResponse::builder)
                .logger(LOG, "getTunnelCpeDeviceConfigContent")
                .serviceDetails(
                        "VirtualNetwork",
                        "GetTunnelCpeDeviceConfigContent",
                        "https://docs.oracle.com/iaas/api/#/en/iaas/20160918/TunnelCpeDeviceConfig/GetTunnelCpeDeviceConfigContent")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetTunnelCpeDeviceConfigContentRequest::builder)
                .basePath("/20160918")
                .appendPathParam("ipsecConnections")
                .appendPathParam(request.getIpscId())
                .appendPathParam("tunnels")
                .appendPathParam(request.getTunnelId())
                .appendPathParam("tunnelDeviceConfig")
                .appendPathParam("content")
                .accept("text/plain; charset=utf-8")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        java.io.InputStream.class,
                        GetTunnelCpeDeviceConfigContentResponse.Builder::inputStream)
                .handleResponseHeaderString(
                        "opc-request-id",
                        GetTunnelCpeDeviceConfigContentResponse.Builder::opcRequestId)
                .operationUsesDefaultRetries()
                .callSync();
    }

    @Override
    public GetUpgradeStatusResponse getUpgradeStatus(GetUpgradeStatusRequest request) {

        Validate.notBlank(request.getDrgId(), "drgId must not be blank");

        return clientCall(request, GetUpgradeStatusResponse::builder)
                .logger(LOG, "getUpgradeStatus")
                .serviceDetails(
                        "VirtualNetwork",
                        "GetUpgradeStatus",
                        "https://docs.oracle.com/iaas/api/#/en/iaas/20160918/Drg/GetUpgradeStatus")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetUpgradeStatusRequest::builder)
                .basePath("/20160918")
                .appendPathParam("drgs")
                .appendPathParam(request.getDrgId())
                .appendPathParam("actions")
                .appendPathParam("upgradeStatus")
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.core.model.UpgradeStatus.class,
                        GetUpgradeStatusResponse.Builder::upgradeStatus)
                .handleResponseHeaderString(
                        "opc-request-id", GetUpgradeStatusResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public GetVcnResponse getVcn(GetVcnRequest request) {

        Validate.notBlank(request.getVcnId(), "vcnId must not be blank");

        return clientCall(request, GetVcnResponse::builder)
                .logger(LOG, "getVcn")
                .serviceDetails(
                        "VirtualNetwork",
                        "GetVcn",
                        "https://docs.oracle.com/iaas/api/#/en/iaas/20160918/Vcn/GetVcn")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetVcnRequest::builder)
                .basePath("/20160918")
                .appendPathParam("vcns")
                .appendPathParam(request.getVcnId())
                .accept("application/json")
                .handleBody(com.oracle.bmc.core.model.Vcn.class, GetVcnResponse.Builder::vcn)
                .handleResponseHeaderString("etag", GetVcnResponse.Builder::etag)
                .handleResponseHeaderString("opc-request-id", GetVcnResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public GetVcnDnsResolverAssociationResponse getVcnDnsResolverAssociation(
            GetVcnDnsResolverAssociationRequest request) {

        Validate.notBlank(request.getVcnId(), "vcnId must not be blank");

        return clientCall(request, GetVcnDnsResolverAssociationResponse::builder)
                .logger(LOG, "getVcnDnsResolverAssociation")
                .serviceDetails(
                        "VirtualNetwork",
                        "GetVcnDnsResolverAssociation",
                        "https://docs.oracle.com/iaas/api/#/en/iaas/20160918/VcnDnsResolverAssociation/GetVcnDnsResolverAssociation")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetVcnDnsResolverAssociationRequest::builder)
                .basePath("/20160918")
                .appendPathParam("vcns")
                .appendPathParam(request.getVcnId())
                .appendPathParam("dnsResolverAssociation")
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.core.model.VcnDnsResolverAssociation.class,
                        GetVcnDnsResolverAssociationResponse.Builder::vcnDnsResolverAssociation)
                .handleResponseHeaderString(
                        "etag", GetVcnDnsResolverAssociationResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id",
                        GetVcnDnsResolverAssociationResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public GetVcnTopologyResponse getVcnTopology(GetVcnTopologyRequest request) {
        Objects.requireNonNull(request.getCompartmentId(), "compartmentId is required");

        Objects.requireNonNull(request.getVcnId(), "vcnId is required");

        return clientCall(request, GetVcnTopologyResponse::builder)
                .logger(LOG, "getVcnTopology")
                .serviceDetails(
                        "VirtualNetwork",
                        "GetVcnTopology",
                        "https://docs.oracle.com/iaas/api/#/en/iaas/20160918/VcnTopology/GetVcnTopology")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetVcnTopologyRequest::builder)
                .basePath("/20160918")
                .appendPathParam("vcnTopology")
                .appendQueryParam("compartmentId", request.getCompartmentId())
                .appendEnumQueryParam("accessLevel", request.getAccessLevel())
                .appendQueryParam("queryCompartmentSubtree", request.getQueryCompartmentSubtree())
                .appendQueryParam("vcnId", request.getVcnId())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("if-none-match", request.getIfNoneMatch())
                .appendHeader("cache-control", request.getCacheControl())
                .handleBody(
                        com.oracle.bmc.core.model.VcnTopology.class,
                        GetVcnTopologyResponse.Builder::vcnTopology)
                .handleResponseHeaderString("etag", GetVcnTopologyResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", GetVcnTopologyResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public GetVirtualCircuitResponse getVirtualCircuit(GetVirtualCircuitRequest request) {

        Validate.notBlank(request.getVirtualCircuitId(), "virtualCircuitId must not be blank");

        return clientCall(request, GetVirtualCircuitResponse::builder)
                .logger(LOG, "getVirtualCircuit")
                .serviceDetails(
                        "VirtualNetwork",
                        "GetVirtualCircuit",
                        "https://docs.oracle.com/iaas/api/#/en/iaas/20160918/VirtualCircuit/GetVirtualCircuit")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetVirtualCircuitRequest::builder)
                .basePath("/20160918")
                .appendPathParam("virtualCircuits")
                .appendPathParam(request.getVirtualCircuitId())
                .accept("application/json")
                .handleBody(
                        com.oracle.bmc.core.model.VirtualCircuit.class,
                        GetVirtualCircuitResponse.Builder::virtualCircuit)
                .handleResponseHeaderString("etag", GetVirtualCircuitResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", GetVirtualCircuitResponse.Builder::opcRequestId)
                .operationUsesDefaultRetries()
                .callSync();
    }

    @Override
    public GetVlanResponse getVlan(GetVlanRequest request) {

        Validate.notBlank(request.getVlanId(), "vlanId must not be blank");

        return clientCall(request, GetVlanResponse::builder)
                .logger(LOG, "getVlan")
                .serviceDetails(
                        "VirtualNetwork",
                        "GetVlan",
                        "https://docs.oracle.com/iaas/api/#/en/iaas/20160918/Vlan/GetVlan")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetVlanRequest::builder)
                .basePath("/20160918")
                .appendPathParam("vlans")
                .appendPathParam(request.getVlanId())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(com.oracle.bmc.core.model.Vlan.class, GetVlanResponse.Builder::vlan)
                .handleResponseHeaderString("etag", GetVlanResponse.Builder::etag)
                .handleResponseHeaderString("opc-request-id", GetVlanResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public GetVnicResponse getVnic(GetVnicRequest request) {

        Validate.notBlank(request.getVnicId(), "vnicId must not be blank");

        return clientCall(request, GetVnicResponse::builder)
                .logger(LOG, "getVnic")
                .serviceDetails(
                        "VirtualNetwork",
                        "GetVnic",
                        "https://docs.oracle.com/iaas/api/#/en/iaas/20160918/Vnic/GetVnic")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetVnicRequest::builder)
                .basePath("/20160918")
                .appendPathParam("vnics")
                .appendPathParam(request.getVnicId())
                .accept("application/json")
                .handleBody(com.oracle.bmc.core.model.Vnic.class, GetVnicResponse.Builder::vnic)
                .handleResponseHeaderString("etag", GetVnicResponse.Builder::etag)
                .handleResponseHeaderString("opc-request-id", GetVnicResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public GetVtapResponse getVtap(GetVtapRequest request) {

        Validate.notBlank(request.getVtapId(), "vtapId must not be blank");

        return clientCall(request, GetVtapResponse::builder)
                .logger(LOG, "getVtap")
                .serviceDetails(
                        "VirtualNetwork",
                        "GetVtap",
                        "https://docs.oracle.com/iaas/api/#/en/iaas/20160918/Vtap/GetVtap")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetVtapRequest::builder)
                .basePath("/20160918")
                .appendPathParam("vtaps")
                .appendPathParam(request.getVtapId())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(com.oracle.bmc.core.model.Vtap.class, GetVtapResponse.Builder::vtap)
                .handleResponseHeaderString("etag", GetVtapResponse.Builder::etag)
                .handleResponseHeaderString("opc-request-id", GetVtapResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public ListAllowedPeerRegionsForRemotePeeringResponse listAllowedPeerRegionsForRemotePeering(
            ListAllowedPeerRegionsForRemotePeeringRequest request) {

        return clientCall(request, ListAllowedPeerRegionsForRemotePeeringResponse::builder)
                .logger(LOG, "listAllowedPeerRegionsForRemotePeering")
                .serviceDetails(
                        "VirtualNetwork",
                        "ListAllowedPeerRegionsForRemotePeering",
                        "https://docs.oracle.com/iaas/api/#/en/iaas/20160918/PeerRegionForRemotePeering/ListAllowedPeerRegionsForRemotePeering")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListAllowedPeerRegionsForRemotePeeringRequest::builder)
                .basePath("/20160918")
                .appendPathParam("allowedPeerRegionsForRemotePeering")
                .accept("application/json")
                .handleBodyList(
                        com.oracle.bmc.core.model.PeerRegionForRemotePeering.class,
                        ListAllowedPeerRegionsForRemotePeeringResponse.Builder::items)
                .handleResponseHeaderString(
                        "opc-request-id",
                        ListAllowedPeerRegionsForRemotePeeringResponse.Builder::opcRequestId)
                .operationUsesDefaultRetries()
                .callSync();
    }

    @Override
    public ListByoipAllocatedRangesResponse listByoipAllocatedRanges(
            ListByoipAllocatedRangesRequest request) {

        Validate.notBlank(request.getByoipRangeId(), "byoipRangeId must not be blank");

        return clientCall(request, ListByoipAllocatedRangesResponse::builder)
                .logger(LOG, "listByoipAllocatedRanges")
                .serviceDetails(
                        "VirtualNetwork",
                        "ListByoipAllocatedRanges",
                        "https://docs.oracle.com/iaas/api/#/en/iaas/20160918/ByoipAllocatedRangeSummary/ListByoipAllocatedRanges")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListByoipAllocatedRangesRequest::builder)
                .basePath("/20160918")
                .appendPathParam("byoipRanges")
                .appendPathParam(request.getByoipRangeId())
                .appendPathParam("byoipAllocatedRanges")
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.core.model.ByoipAllocatedRangeCollection.class,
                        ListByoipAllocatedRangesResponse.Builder::byoipAllocatedRangeCollection)
                .handleResponseHeaderString(
                        "opc-next-page", ListByoipAllocatedRangesResponse.Builder::opcNextPage)
                .handleResponseHeaderString(
                        "opc-request-id", ListByoipAllocatedRangesResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public ListByoipRangesResponse listByoipRanges(ListByoipRangesRequest request) {
        Objects.requireNonNull(request.getCompartmentId(), "compartmentId is required");

        return clientCall(request, ListByoipRangesResponse::builder)
                .logger(LOG, "listByoipRanges")
                .serviceDetails(
                        "VirtualNetwork",
                        "ListByoipRanges",
                        "https://docs.oracle.com/iaas/api/#/en/iaas/20160918/ByoipRange/ListByoipRanges")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListByoipRangesRequest::builder)
                .basePath("/20160918")
                .appendPathParam("byoipRanges")
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .appendQueryParam("displayName", request.getDisplayName())
                .appendQueryParam("lifecycleState", request.getLifecycleState())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .appendQueryParam("compartmentId", request.getCompartmentId())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.core.model.ByoipRangeCollection.class,
                        ListByoipRangesResponse.Builder::byoipRangeCollection)
                .handleResponseHeaderString(
                        "opc-next-page", ListByoipRangesResponse.Builder::opcNextPage)
                .handleResponseHeaderString(
                        "opc-request-id", ListByoipRangesResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public ListCaptureFiltersResponse listCaptureFilters(ListCaptureFiltersRequest request) {
        Objects.requireNonNull(request.getCompartmentId(), "compartmentId is required");

        return clientCall(request, ListCaptureFiltersResponse::builder)
                .logger(LOG, "listCaptureFilters")
                .serviceDetails(
                        "VirtualNetwork",
                        "ListCaptureFilters",
                        "https://docs.oracle.com/iaas/api/#/en/iaas/20160918/CaptureFilter/ListCaptureFilters")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListCaptureFiltersRequest::builder)
                .basePath("/20160918")
                .appendPathParam("captureFilters")
                .appendQueryParam("compartmentId", request.getCompartmentId())
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .appendQueryParam("displayName", request.getDisplayName())
                .appendEnumQueryParam("lifecycleState", request.getLifecycleState())
                .appendEnumQueryParam("filterType", request.getFilterType())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBodyList(
                        com.oracle.bmc.core.model.CaptureFilter.class,
                        ListCaptureFiltersResponse.Builder::items)
                .handleResponseHeaderString(
                        "opc-next-page", ListCaptureFiltersResponse.Builder::opcNextPage)
                .handleResponseHeaderString(
                        "opc-request-id", ListCaptureFiltersResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public ListCpeDeviceShapesResponse listCpeDeviceShapes(ListCpeDeviceShapesRequest request) {

        return clientCall(request, ListCpeDeviceShapesResponse::builder)
                .logger(LOG, "listCpeDeviceShapes")
                .serviceDetails(
                        "VirtualNetwork",
                        "ListCpeDeviceShapes",
                        "https://docs.oracle.com/iaas/api/#/en/iaas/20160918/CpeDeviceShapeSummary/ListCpeDeviceShapes")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListCpeDeviceShapesRequest::builder)
                .basePath("/20160918")
                .appendPathParam("cpeDeviceShapes")
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBodyList(
                        com.oracle.bmc.core.model.CpeDeviceShapeSummary.class,
                        ListCpeDeviceShapesResponse.Builder::items)
                .handleResponseHeaderString(
                        "opc-next-page", ListCpeDeviceShapesResponse.Builder::opcNextPage)
                .handleResponseHeaderString(
                        "opc-request-id", ListCpeDeviceShapesResponse.Builder::opcRequestId)
                .operationUsesDefaultRetries()
                .callSync();
    }

    @Override
    public ListCpesResponse listCpes(ListCpesRequest request) {
        Objects.requireNonNull(request.getCompartmentId(), "compartmentId is required");

        return clientCall(request, ListCpesResponse::builder)
                .logger(LOG, "listCpes")
                .serviceDetails(
                        "VirtualNetwork",
                        "ListCpes",
                        "https://docs.oracle.com/iaas/api/#/en/iaas/20160918/Cpe/ListCpes")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListCpesRequest::builder)
                .basePath("/20160918")
                .appendPathParam("cpes")
                .appendQueryParam("compartmentId", request.getCompartmentId())
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .accept("application/json")
                .handleBodyList(
                        com.oracle.bmc.core.model.Cpe.class, ListCpesResponse.Builder::items)
                .handleResponseHeaderString("opc-next-page", ListCpesResponse.Builder::opcNextPage)
                .handleResponseHeaderString(
                        "opc-request-id", ListCpesResponse.Builder::opcRequestId)
                .operationUsesDefaultRetries()
                .callSync();
    }

    @Override
    public ListCrossConnectGroupsResponse listCrossConnectGroups(
            ListCrossConnectGroupsRequest request) {
        Objects.requireNonNull(request.getCompartmentId(), "compartmentId is required");

        return clientCall(request, ListCrossConnectGroupsResponse::builder)
                .logger(LOG, "listCrossConnectGroups")
                .serviceDetails(
                        "VirtualNetwork",
                        "ListCrossConnectGroups",
                        "https://docs.oracle.com/iaas/api/#/en/iaas/20160918/CrossConnectGroup/ListCrossConnectGroups")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListCrossConnectGroupsRequest::builder)
                .basePath("/20160918")
                .appendPathParam("crossConnectGroups")
                .appendQueryParam("compartmentId", request.getCompartmentId())
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .appendQueryParam("displayName", request.getDisplayName())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .appendEnumQueryParam("lifecycleState", request.getLifecycleState())
                .accept("application/json")
                .handleBodyList(
                        com.oracle.bmc.core.model.CrossConnectGroup.class,
                        ListCrossConnectGroupsResponse.Builder::items)
                .handleResponseHeaderString(
                        "opc-next-page", ListCrossConnectGroupsResponse.Builder::opcNextPage)
                .handleResponseHeaderString(
                        "opc-request-id", ListCrossConnectGroupsResponse.Builder::opcRequestId)
                .operationUsesDefaultRetries()
                .callSync();
    }

    @Override
    public ListCrossConnectLocationsResponse listCrossConnectLocations(
            ListCrossConnectLocationsRequest request) {
        Objects.requireNonNull(request.getCompartmentId(), "compartmentId is required");

        return clientCall(request, ListCrossConnectLocationsResponse::builder)
                .logger(LOG, "listCrossConnectLocations")
                .serviceDetails(
                        "VirtualNetwork",
                        "ListCrossConnectLocations",
                        "https://docs.oracle.com/iaas/api/#/en/iaas/20160918/CrossConnectLocation/ListCrossConnectLocations")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListCrossConnectLocationsRequest::builder)
                .basePath("/20160918")
                .appendPathParam("crossConnectLocations")
                .appendQueryParam("compartmentId", request.getCompartmentId())
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .accept("application/json")
                .handleBodyList(
                        com.oracle.bmc.core.model.CrossConnectLocation.class,
                        ListCrossConnectLocationsResponse.Builder::items)
                .handleResponseHeaderString(
                        "opc-next-page", ListCrossConnectLocationsResponse.Builder::opcNextPage)
                .handleResponseHeaderString(
                        "opc-request-id", ListCrossConnectLocationsResponse.Builder::opcRequestId)
                .operationUsesDefaultRetries()
                .callSync();
    }

    @Override
    public ListCrossConnectMappingsResponse listCrossConnectMappings(
            ListCrossConnectMappingsRequest request) {

        Validate.notBlank(request.getVirtualCircuitId(), "virtualCircuitId must not be blank");

        return clientCall(request, ListCrossConnectMappingsResponse::builder)
                .logger(LOG, "listCrossConnectMappings")
                .serviceDetails(
                        "VirtualNetwork",
                        "ListCrossConnectMappings",
                        "https://docs.oracle.com/iaas/api/#/en/iaas/20160918/CrossConnectMappingDetailsCollection/ListCrossConnectMappings")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListCrossConnectMappingsRequest::builder)
                .basePath("/20160918")
                .appendPathParam("virtualCircuits")
                .appendPathParam(request.getVirtualCircuitId())
                .appendPathParam("crossConnectMappings")
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.core.model.CrossConnectMappingDetailsCollection.class,
                        ListCrossConnectMappingsResponse.Builder
                                ::crossConnectMappingDetailsCollection)
                .handleResponseHeaderString(
                        "opc-request-id", ListCrossConnectMappingsResponse.Builder::opcRequestId)
                .operationUsesDefaultRetries()
                .callSync();
    }

    @Override
    public ListCrossConnectsResponse listCrossConnects(ListCrossConnectsRequest request) {
        Objects.requireNonNull(request.getCompartmentId(), "compartmentId is required");

        return clientCall(request, ListCrossConnectsResponse::builder)
                .logger(LOG, "listCrossConnects")
                .serviceDetails(
                        "VirtualNetwork",
                        "ListCrossConnects",
                        "https://docs.oracle.com/iaas/api/#/en/iaas/20160918/CrossConnect/ListCrossConnects")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListCrossConnectsRequest::builder)
                .basePath("/20160918")
                .appendPathParam("crossConnects")
                .appendQueryParam("compartmentId", request.getCompartmentId())
                .appendQueryParam("crossConnectGroupId", request.getCrossConnectGroupId())
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .appendQueryParam("displayName", request.getDisplayName())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .appendEnumQueryParam("lifecycleState", request.getLifecycleState())
                .accept("application/json")
                .handleBodyList(
                        com.oracle.bmc.core.model.CrossConnect.class,
                        ListCrossConnectsResponse.Builder::items)
                .handleResponseHeaderString(
                        "opc-next-page", ListCrossConnectsResponse.Builder::opcNextPage)
                .handleResponseHeaderString(
                        "opc-request-id", ListCrossConnectsResponse.Builder::opcRequestId)
                .operationUsesDefaultRetries()
                .callSync();
    }

    @Override
    public ListCrossconnectPortSpeedShapesResponse listCrossconnectPortSpeedShapes(
            ListCrossconnectPortSpeedShapesRequest request) {
        Objects.requireNonNull(request.getCompartmentId(), "compartmentId is required");

        return clientCall(request, ListCrossconnectPortSpeedShapesResponse::builder)
                .logger(LOG, "listCrossconnectPortSpeedShapes")
                .serviceDetails(
                        "VirtualNetwork",
                        "ListCrossconnectPortSpeedShapes",
                        "https://docs.oracle.com/iaas/api/#/en/iaas/20160918/CrossConnectPortSpeedShape/ListCrossconnectPortSpeedShapes")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListCrossconnectPortSpeedShapesRequest::builder)
                .basePath("/20160918")
                .appendPathParam("crossConnectPortSpeedShapes")
                .appendQueryParam("compartmentId", request.getCompartmentId())
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .accept("application/json")
                .handleBodyList(
                        com.oracle.bmc.core.model.CrossConnectPortSpeedShape.class,
                        ListCrossconnectPortSpeedShapesResponse.Builder::items)
                .handleResponseHeaderString(
                        "opc-next-page",
                        ListCrossconnectPortSpeedShapesResponse.Builder::opcNextPage)
                .handleResponseHeaderString(
                        "opc-request-id",
                        ListCrossconnectPortSpeedShapesResponse.Builder::opcRequestId)
                .operationUsesDefaultRetries()
                .callSync();
    }

    @Override
    public ListDhcpOptionsResponse listDhcpOptions(ListDhcpOptionsRequest request) {
        Objects.requireNonNull(request.getCompartmentId(), "compartmentId is required");

        return clientCall(request, ListDhcpOptionsResponse::builder)
                .logger(LOG, "listDhcpOptions")
                .serviceDetails(
                        "VirtualNetwork",
                        "ListDhcpOptions",
                        "https://docs.oracle.com/iaas/api/#/en/iaas/20160918/DhcpOptions/ListDhcpOptions")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListDhcpOptionsRequest::builder)
                .basePath("/20160918")
                .appendPathParam("dhcps")
                .appendQueryParam("compartmentId", request.getCompartmentId())
                .appendQueryParam("vcnId", request.getVcnId())
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .appendQueryParam("displayName", request.getDisplayName())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .appendEnumQueryParam("lifecycleState", request.getLifecycleState())
                .accept("application/json")
                .handleBodyList(
                        com.oracle.bmc.core.model.DhcpOptions.class,
                        ListDhcpOptionsResponse.Builder::items)
                .handleResponseHeaderString(
                        "opc-next-page", ListDhcpOptionsResponse.Builder::opcNextPage)
                .handleResponseHeaderString(
                        "opc-request-id", ListDhcpOptionsResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public ListDrgAttachmentsResponse listDrgAttachments(ListDrgAttachmentsRequest request) {
        Objects.requireNonNull(request.getCompartmentId(), "compartmentId is required");

        return clientCall(request, ListDrgAttachmentsResponse::builder)
                .logger(LOG, "listDrgAttachments")
                .serviceDetails(
                        "VirtualNetwork",
                        "ListDrgAttachments",
                        "https://docs.oracle.com/iaas/api/#/en/iaas/20160918/DrgAttachment/ListDrgAttachments")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListDrgAttachmentsRequest::builder)
                .basePath("/20160918")
                .appendPathParam("drgAttachments")
                .appendQueryParam("compartmentId", request.getCompartmentId())
                .appendQueryParam("vcnId", request.getVcnId())
                .appendQueryParam("drgId", request.getDrgId())
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .appendQueryParam("networkId", request.getNetworkId())
                .appendEnumQueryParam("attachmentType", request.getAttachmentType())
                .appendQueryParam("drgRouteTableId", request.getDrgRouteTableId())
                .appendQueryParam("displayName", request.getDisplayName())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .appendEnumQueryParam("lifecycleState", request.getLifecycleState())
                .accept("application/json")
                .handleBodyList(
                        com.oracle.bmc.core.model.DrgAttachment.class,
                        ListDrgAttachmentsResponse.Builder::items)
                .handleResponseHeaderString(
                        "opc-next-page", ListDrgAttachmentsResponse.Builder::opcNextPage)
                .handleResponseHeaderString(
                        "opc-request-id", ListDrgAttachmentsResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public ListDrgRouteDistributionStatementsResponse listDrgRouteDistributionStatements(
            ListDrgRouteDistributionStatementsRequest request) {

        Validate.notBlank(
                request.getDrgRouteDistributionId(), "drgRouteDistributionId must not be blank");

        return clientCall(request, ListDrgRouteDistributionStatementsResponse::builder)
                .logger(LOG, "listDrgRouteDistributionStatements")
                .serviceDetails(
                        "VirtualNetwork",
                        "ListDrgRouteDistributionStatements",
                        "https://docs.oracle.com/iaas/api/#/en/iaas/20160918/DrgRouteDistributionStatement/ListDrgRouteDistributionStatements")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListDrgRouteDistributionStatementsRequest::builder)
                .basePath("/20160918")
                .appendPathParam("drgRouteDistributions")
                .appendPathParam(request.getDrgRouteDistributionId())
                .appendPathParam("drgRouteDistributionStatements")
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .accept("application/json")
                .handleBodyList(
                        com.oracle.bmc.core.model.DrgRouteDistributionStatement.class,
                        ListDrgRouteDistributionStatementsResponse.Builder::items)
                .handleResponseHeaderString(
                        "opc-next-page",
                        ListDrgRouteDistributionStatementsResponse.Builder::opcNextPage)
                .handleResponseHeaderString(
                        "opc-request-id",
                        ListDrgRouteDistributionStatementsResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public ListDrgRouteDistributionsResponse listDrgRouteDistributions(
            ListDrgRouteDistributionsRequest request) {
        Objects.requireNonNull(request.getDrgId(), "drgId is required");

        return clientCall(request, ListDrgRouteDistributionsResponse::builder)
                .logger(LOG, "listDrgRouteDistributions")
                .serviceDetails(
                        "VirtualNetwork",
                        "ListDrgRouteDistributions",
                        "https://docs.oracle.com/iaas/api/#/en/iaas/20160918/DrgRouteDistribution/ListDrgRouteDistributions")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListDrgRouteDistributionsRequest::builder)
                .basePath("/20160918")
                .appendPathParam("drgRouteDistributions")
                .appendQueryParam("drgId", request.getDrgId())
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .appendQueryParam("displayName", request.getDisplayName())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .appendEnumQueryParam("lifecycleState", request.getLifecycleState())
                .accept("application/json")
                .handleBodyList(
                        com.oracle.bmc.core.model.DrgRouteDistribution.class,
                        ListDrgRouteDistributionsResponse.Builder::items)
                .handleResponseHeaderString(
                        "opc-next-page", ListDrgRouteDistributionsResponse.Builder::opcNextPage)
                .handleResponseHeaderString(
                        "opc-request-id", ListDrgRouteDistributionsResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public ListDrgRouteRulesResponse listDrgRouteRules(ListDrgRouteRulesRequest request) {

        Validate.notBlank(request.getDrgRouteTableId(), "drgRouteTableId must not be blank");

        return clientCall(request, ListDrgRouteRulesResponse::builder)
                .logger(LOG, "listDrgRouteRules")
                .serviceDetails(
                        "VirtualNetwork",
                        "ListDrgRouteRules",
                        "https://docs.oracle.com/iaas/api/#/en/iaas/20160918/DrgRouteRule/ListDrgRouteRules")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListDrgRouteRulesRequest::builder)
                .basePath("/20160918")
                .appendPathParam("drgRouteTables")
                .appendPathParam(request.getDrgRouteTableId())
                .appendPathParam("drgRouteRules")
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .appendEnumQueryParam("routeType", request.getRouteType())
                .accept("application/json")
                .handleBodyList(
                        com.oracle.bmc.core.model.DrgRouteRule.class,
                        ListDrgRouteRulesResponse.Builder::items)
                .handleResponseHeaderString(
                        "opc-next-page", ListDrgRouteRulesResponse.Builder::opcNextPage)
                .handleResponseHeaderString(
                        "opc-request-id", ListDrgRouteRulesResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public ListDrgRouteTablesResponse listDrgRouteTables(ListDrgRouteTablesRequest request) {
        Objects.requireNonNull(request.getDrgId(), "drgId is required");

        return clientCall(request, ListDrgRouteTablesResponse::builder)
                .logger(LOG, "listDrgRouteTables")
                .serviceDetails(
                        "VirtualNetwork",
                        "ListDrgRouteTables",
                        "https://docs.oracle.com/iaas/api/#/en/iaas/20160918/DrgRouteTable/ListDrgRouteTables")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListDrgRouteTablesRequest::builder)
                .basePath("/20160918")
                .appendPathParam("drgRouteTables")
                .appendQueryParam("drgId", request.getDrgId())
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .appendQueryParam("displayName", request.getDisplayName())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .appendQueryParam(
                        "importDrgRouteDistributionId", request.getImportDrgRouteDistributionId())
                .appendEnumQueryParam("lifecycleState", request.getLifecycleState())
                .accept("application/json")
                .handleBodyList(
                        com.oracle.bmc.core.model.DrgRouteTable.class,
                        ListDrgRouteTablesResponse.Builder::items)
                .handleResponseHeaderString(
                        "opc-next-page", ListDrgRouteTablesResponse.Builder::opcNextPage)
                .handleResponseHeaderString(
                        "opc-request-id", ListDrgRouteTablesResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public ListDrgsResponse listDrgs(ListDrgsRequest request) {
        Objects.requireNonNull(request.getCompartmentId(), "compartmentId is required");

        return clientCall(request, ListDrgsResponse::builder)
                .logger(LOG, "listDrgs")
                .serviceDetails(
                        "VirtualNetwork",
                        "ListDrgs",
                        "https://docs.oracle.com/iaas/api/#/en/iaas/20160918/Drg/ListDrgs")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListDrgsRequest::builder)
                .basePath("/20160918")
                .appendPathParam("drgs")
                .appendQueryParam("compartmentId", request.getCompartmentId())
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .accept("application/json")
                .handleBodyList(
                        com.oracle.bmc.core.model.Drg.class, ListDrgsResponse.Builder::items)
                .handleResponseHeaderString("opc-next-page", ListDrgsResponse.Builder::opcNextPage)
                .handleResponseHeaderString(
                        "opc-request-id", ListDrgsResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public ListFastConnectProviderServicesResponse listFastConnectProviderServices(
            ListFastConnectProviderServicesRequest request) {
        Objects.requireNonNull(request.getCompartmentId(), "compartmentId is required");

        return clientCall(request, ListFastConnectProviderServicesResponse::builder)
                .logger(LOG, "listFastConnectProviderServices")
                .serviceDetails(
                        "VirtualNetwork",
                        "ListFastConnectProviderServices",
                        "https://docs.oracle.com/iaas/api/#/en/iaas/20160918/FastConnectProviderService/ListFastConnectProviderServices")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListFastConnectProviderServicesRequest::builder)
                .basePath("/20160918")
                .appendPathParam("fastConnectProviderServices")
                .appendQueryParam("compartmentId", request.getCompartmentId())
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .accept("application/json")
                .handleBodyList(
                        com.oracle.bmc.core.model.FastConnectProviderService.class,
                        ListFastConnectProviderServicesResponse.Builder::items)
                .handleResponseHeaderString(
                        "opc-next-page",
                        ListFastConnectProviderServicesResponse.Builder::opcNextPage)
                .handleResponseHeaderString(
                        "opc-request-id",
                        ListFastConnectProviderServicesResponse.Builder::opcRequestId)
                .operationUsesDefaultRetries()
                .callSync();
    }

    @Override
    public ListFastConnectProviderVirtualCircuitBandwidthShapesResponse
            listFastConnectProviderVirtualCircuitBandwidthShapes(
                    ListFastConnectProviderVirtualCircuitBandwidthShapesRequest request) {

        Validate.notBlank(request.getProviderServiceId(), "providerServiceId must not be blank");

        return clientCall(
                        request,
                        ListFastConnectProviderVirtualCircuitBandwidthShapesResponse::builder)
                .logger(LOG, "listFastConnectProviderVirtualCircuitBandwidthShapes")
                .serviceDetails(
                        "VirtualNetwork",
                        "ListFastConnectProviderVirtualCircuitBandwidthShapes",
                        "https://docs.oracle.com/iaas/api/#/en/iaas/20160918/FastConnectProviderService/ListFastConnectProviderVirtualCircuitBandwidthShapes")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(
                        ListFastConnectProviderVirtualCircuitBandwidthShapesRequest::builder)
                .basePath("/20160918")
                .appendPathParam("fastConnectProviderServices")
                .appendPathParam(request.getProviderServiceId())
                .appendPathParam("virtualCircuitBandwidthShapes")
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .accept("application/json")
                .handleBodyList(
                        com.oracle.bmc.core.model.VirtualCircuitBandwidthShape.class,
                        ListFastConnectProviderVirtualCircuitBandwidthShapesResponse.Builder::items)
                .handleResponseHeaderString(
                        "opc-next-page",
                        ListFastConnectProviderVirtualCircuitBandwidthShapesResponse.Builder
                                ::opcNextPage)
                .handleResponseHeaderString(
                        "opc-request-id",
                        ListFastConnectProviderVirtualCircuitBandwidthShapesResponse.Builder
                                ::opcRequestId)
                .operationUsesDefaultRetries()
                .callSync();
    }

    @Override
    public ListIPSecConnectionTunnelRoutesResponse listIPSecConnectionTunnelRoutes(
            ListIPSecConnectionTunnelRoutesRequest request) {

        Validate.notBlank(request.getIpscId(), "ipscId must not be blank");

        Validate.notBlank(request.getTunnelId(), "tunnelId must not be blank");

        return clientCall(request, ListIPSecConnectionTunnelRoutesResponse::builder)
                .logger(LOG, "listIPSecConnectionTunnelRoutes")
                .serviceDetails(
                        "VirtualNetwork",
                        "ListIPSecConnectionTunnelRoutes",
                        "https://docs.oracle.com/iaas/api/#/en/iaas/20160918/TunnelRouteSummary/ListIPSecConnectionTunnelRoutes")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListIPSecConnectionTunnelRoutesRequest::builder)
                .basePath("/20160918")
                .appendPathParam("ipsecConnections")
                .appendPathParam(request.getIpscId())
                .appendPathParam("tunnels")
                .appendPathParam(request.getTunnelId())
                .appendPathParam("routes")
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .appendEnumQueryParam("advertiser", request.getAdvertiser())
                .accept("application/json")
                .handleBodyList(
                        com.oracle.bmc.core.model.TunnelRouteSummary.class,
                        ListIPSecConnectionTunnelRoutesResponse.Builder::items)
                .handleResponseHeaderString(
                        "opc-next-page",
                        ListIPSecConnectionTunnelRoutesResponse.Builder::opcNextPage)
                .handleResponseHeaderString(
                        "opc-request-id",
                        ListIPSecConnectionTunnelRoutesResponse.Builder::opcRequestId)
                .handleResponseHeaderInteger(
                        "opc-total-items",
                        ListIPSecConnectionTunnelRoutesResponse.Builder::opcTotalItems)
                .operationUsesDefaultRetries()
                .callSync();
    }

    @Override
    public ListIPSecConnectionTunnelSecurityAssociationsResponse
            listIPSecConnectionTunnelSecurityAssociations(
                    ListIPSecConnectionTunnelSecurityAssociationsRequest request) {

        Validate.notBlank(request.getIpscId(), "ipscId must not be blank");

        Validate.notBlank(request.getTunnelId(), "tunnelId must not be blank");

        return clientCall(request, ListIPSecConnectionTunnelSecurityAssociationsResponse::builder)
                .logger(LOG, "listIPSecConnectionTunnelSecurityAssociations")
                .serviceDetails(
                        "VirtualNetwork",
                        "ListIPSecConnectionTunnelSecurityAssociations",
                        "https://docs.oracle.com/iaas/api/#/en/iaas/20160918/TunnelSecurityAssociationSummary/ListIPSecConnectionTunnelSecurityAssociations")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListIPSecConnectionTunnelSecurityAssociationsRequest::builder)
                .basePath("/20160918")
                .appendPathParam("ipsecConnections")
                .appendPathParam(request.getIpscId())
                .appendPathParam("tunnels")
                .appendPathParam(request.getTunnelId())
                .appendPathParam("tunnelSecurityAssociations")
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .accept("application/json")
                .handleBodyList(
                        com.oracle.bmc.core.model.TunnelSecurityAssociationSummary.class,
                        ListIPSecConnectionTunnelSecurityAssociationsResponse.Builder::items)
                .handleResponseHeaderString(
                        "opc-next-page",
                        ListIPSecConnectionTunnelSecurityAssociationsResponse.Builder::opcNextPage)
                .handleResponseHeaderString(
                        "opc-request-id",
                        ListIPSecConnectionTunnelSecurityAssociationsResponse.Builder::opcRequestId)
                .handleResponseHeaderInteger(
                        "opc-total-items",
                        ListIPSecConnectionTunnelSecurityAssociationsResponse.Builder
                                ::opcTotalItems)
                .operationUsesDefaultRetries()
                .callSync();
    }

    @Override
    public ListIPSecConnectionTunnelsResponse listIPSecConnectionTunnels(
            ListIPSecConnectionTunnelsRequest request) {

        Validate.notBlank(request.getIpscId(), "ipscId must not be blank");

        return clientCall(request, ListIPSecConnectionTunnelsResponse::builder)
                .logger(LOG, "listIPSecConnectionTunnels")
                .serviceDetails(
                        "VirtualNetwork",
                        "ListIPSecConnectionTunnels",
                        "https://docs.oracle.com/iaas/api/#/en/iaas/20160918/IPSecConnectionTunnel/ListIPSecConnectionTunnels")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListIPSecConnectionTunnelsRequest::builder)
                .basePath("/20160918")
                .appendPathParam("ipsecConnections")
                .appendPathParam(request.getIpscId())
                .appendPathParam("tunnels")
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .accept("application/json")
                .handleBodyList(
                        com.oracle.bmc.core.model.IPSecConnectionTunnel.class,
                        ListIPSecConnectionTunnelsResponse.Builder::items)
                .handleResponseHeaderString(
                        "opc-next-page", ListIPSecConnectionTunnelsResponse.Builder::opcNextPage)
                .handleResponseHeaderString(
                        "opc-request-id", ListIPSecConnectionTunnelsResponse.Builder::opcRequestId)
                .operationUsesDefaultRetries()
                .callSync();
    }

    @Override
    public ListIPSecConnectionsResponse listIPSecConnections(ListIPSecConnectionsRequest request) {
        Objects.requireNonNull(request.getCompartmentId(), "compartmentId is required");

        return clientCall(request, ListIPSecConnectionsResponse::builder)
                .logger(LOG, "listIPSecConnections")
                .serviceDetails(
                        "VirtualNetwork",
                        "ListIPSecConnections",
                        "https://docs.oracle.com/iaas/api/#/en/iaas/20160918/IPSecConnection/ListIPSecConnections")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListIPSecConnectionsRequest::builder)
                .basePath("/20160918")
                .appendPathParam("ipsecConnections")
                .appendQueryParam("compartmentId", request.getCompartmentId())
                .appendQueryParam("drgId", request.getDrgId())
                .appendQueryParam("cpeId", request.getCpeId())
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .accept("application/json")
                .handleBodyList(
                        com.oracle.bmc.core.model.IPSecConnection.class,
                        ListIPSecConnectionsResponse.Builder::items)
                .handleResponseHeaderString(
                        "opc-next-page", ListIPSecConnectionsResponse.Builder::opcNextPage)
                .handleResponseHeaderString(
                        "opc-request-id", ListIPSecConnectionsResponse.Builder::opcRequestId)
                .operationUsesDefaultRetries()
                .callSync();
    }

    @Override
    public ListInternetGatewaysResponse listInternetGateways(ListInternetGatewaysRequest request) {
        Objects.requireNonNull(request.getCompartmentId(), "compartmentId is required");

        return clientCall(request, ListInternetGatewaysResponse::builder)
                .logger(LOG, "listInternetGateways")
                .serviceDetails(
                        "VirtualNetwork",
                        "ListInternetGateways",
                        "https://docs.oracle.com/iaas/api/#/en/iaas/20160918/InternetGateway/ListInternetGateways")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListInternetGatewaysRequest::builder)
                .basePath("/20160918")
                .appendPathParam("internetGateways")
                .appendQueryParam("compartmentId", request.getCompartmentId())
                .appendQueryParam("vcnId", request.getVcnId())
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .appendQueryParam("displayName", request.getDisplayName())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .appendEnumQueryParam("lifecycleState", request.getLifecycleState())
                .accept("application/json")
                .handleBodyList(
                        com.oracle.bmc.core.model.InternetGateway.class,
                        ListInternetGatewaysResponse.Builder::items)
                .handleResponseHeaderString(
                        "opc-next-page", ListInternetGatewaysResponse.Builder::opcNextPage)
                .handleResponseHeaderString(
                        "opc-request-id", ListInternetGatewaysResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public ListIpv6sResponse listIpv6s(ListIpv6sRequest request) {

        return clientCall(request, ListIpv6sResponse::builder)
                .logger(LOG, "listIpv6s")
                .serviceDetails(
                        "VirtualNetwork",
                        "ListIpv6s",
                        "https://docs.oracle.com/iaas/api/#/en/iaas/20160918/Ipv6/ListIpv6s")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListIpv6sRequest::builder)
                .basePath("/20160918")
                .appendPathParam("ipv6")
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .appendQueryParam("ipAddress", request.getIpAddress())
                .appendQueryParam("subnetId", request.getSubnetId())
                .appendQueryParam("vnicId", request.getVnicId())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBodyList(
                        com.oracle.bmc.core.model.Ipv6.class, ListIpv6sResponse.Builder::items)
                .handleResponseHeaderString("opc-next-page", ListIpv6sResponse.Builder::opcNextPage)
                .handleResponseHeaderString(
                        "opc-request-id", ListIpv6sResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public ListLocalPeeringGatewaysResponse listLocalPeeringGateways(
            ListLocalPeeringGatewaysRequest request) {
        Objects.requireNonNull(request.getCompartmentId(), "compartmentId is required");

        return clientCall(request, ListLocalPeeringGatewaysResponse::builder)
                .logger(LOG, "listLocalPeeringGateways")
                .serviceDetails(
                        "VirtualNetwork",
                        "ListLocalPeeringGateways",
                        "https://docs.oracle.com/iaas/api/#/en/iaas/20160918/LocalPeeringGateway/ListLocalPeeringGateways")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListLocalPeeringGatewaysRequest::builder)
                .basePath("/20160918")
                .appendPathParam("localPeeringGateways")
                .appendQueryParam("compartmentId", request.getCompartmentId())
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .appendQueryParam("vcnId", request.getVcnId())
                .accept("application/json")
                .handleBodyList(
                        com.oracle.bmc.core.model.LocalPeeringGateway.class,
                        ListLocalPeeringGatewaysResponse.Builder::items)
                .handleResponseHeaderString(
                        "opc-next-page", ListLocalPeeringGatewaysResponse.Builder::opcNextPage)
                .handleResponseHeaderString(
                        "opc-request-id", ListLocalPeeringGatewaysResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public ListNatGatewaysResponse listNatGateways(ListNatGatewaysRequest request) {
        Objects.requireNonNull(request.getCompartmentId(), "compartmentId is required");

        return clientCall(request, ListNatGatewaysResponse::builder)
                .logger(LOG, "listNatGateways")
                .serviceDetails(
                        "VirtualNetwork",
                        "ListNatGateways",
                        "https://docs.oracle.com/iaas/api/#/en/iaas/20160918/NatGateway/ListNatGateways")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListNatGatewaysRequest::builder)
                .basePath("/20160918")
                .appendPathParam("natGateways")
                .appendQueryParam("compartmentId", request.getCompartmentId())
                .appendQueryParam("vcnId", request.getVcnId())
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .appendQueryParam("displayName", request.getDisplayName())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .appendEnumQueryParam("lifecycleState", request.getLifecycleState())
                .accept("application/json")
                .handleBodyList(
                        com.oracle.bmc.core.model.NatGateway.class,
                        ListNatGatewaysResponse.Builder::items)
                .handleResponseHeaderString(
                        "opc-next-page", ListNatGatewaysResponse.Builder::opcNextPage)
                .handleResponseHeaderString(
                        "opc-request-id", ListNatGatewaysResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public ListNetworkSecurityGroupSecurityRulesResponse listNetworkSecurityGroupSecurityRules(
            ListNetworkSecurityGroupSecurityRulesRequest request) {

        Validate.notBlank(
                request.getNetworkSecurityGroupId(), "networkSecurityGroupId must not be blank");

        return clientCall(request, ListNetworkSecurityGroupSecurityRulesResponse::builder)
                .logger(LOG, "listNetworkSecurityGroupSecurityRules")
                .serviceDetails(
                        "VirtualNetwork",
                        "ListNetworkSecurityGroupSecurityRules",
                        "https://docs.oracle.com/iaas/api/#/en/iaas/20160918/SecurityRule/ListNetworkSecurityGroupSecurityRules")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListNetworkSecurityGroupSecurityRulesRequest::builder)
                .basePath("/20160918")
                .appendPathParam("networkSecurityGroups")
                .appendPathParam(request.getNetworkSecurityGroupId())
                .appendPathParam("securityRules")
                .appendEnumQueryParam("direction", request.getDirection())
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .accept("application/json")
                .handleBodyList(
                        com.oracle.bmc.core.model.SecurityRule.class,
                        ListNetworkSecurityGroupSecurityRulesResponse.Builder::items)
                .handleResponseHeaderString(
                        "opc-next-page",
                        ListNetworkSecurityGroupSecurityRulesResponse.Builder::opcNextPage)
                .handleResponseHeaderString(
                        "opc-request-id",
                        ListNetworkSecurityGroupSecurityRulesResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public ListNetworkSecurityGroupVnicsResponse listNetworkSecurityGroupVnics(
            ListNetworkSecurityGroupVnicsRequest request) {

        Validate.notBlank(
                request.getNetworkSecurityGroupId(), "networkSecurityGroupId must not be blank");

        return clientCall(request, ListNetworkSecurityGroupVnicsResponse::builder)
                .logger(LOG, "listNetworkSecurityGroupVnics")
                .serviceDetails(
                        "VirtualNetwork",
                        "ListNetworkSecurityGroupVnics",
                        "https://docs.oracle.com/iaas/api/#/en/iaas/20160918/NetworkSecurityGroupVnic/ListNetworkSecurityGroupVnics")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListNetworkSecurityGroupVnicsRequest::builder)
                .basePath("/20160918")
                .appendPathParam("networkSecurityGroups")
                .appendPathParam(request.getNetworkSecurityGroupId())
                .appendPathParam("vnics")
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .accept("application/json")
                .handleBodyList(
                        com.oracle.bmc.core.model.NetworkSecurityGroupVnic.class,
                        ListNetworkSecurityGroupVnicsResponse.Builder::items)
                .handleResponseHeaderString(
                        "opc-next-page", ListNetworkSecurityGroupVnicsResponse.Builder::opcNextPage)
                .handleResponseHeaderString(
                        "opc-request-id",
                        ListNetworkSecurityGroupVnicsResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public ListNetworkSecurityGroupsResponse listNetworkSecurityGroups(
            ListNetworkSecurityGroupsRequest request) {

        return clientCall(request, ListNetworkSecurityGroupsResponse::builder)
                .logger(LOG, "listNetworkSecurityGroups")
                .serviceDetails(
                        "VirtualNetwork",
                        "ListNetworkSecurityGroups",
                        "https://docs.oracle.com/iaas/api/#/en/iaas/20160918/NetworkSecurityGroup/ListNetworkSecurityGroups")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListNetworkSecurityGroupsRequest::builder)
                .basePath("/20160918")
                .appendPathParam("networkSecurityGroups")
                .appendQueryParam("compartmentId", request.getCompartmentId())
                .appendQueryParam("vlanId", request.getVlanId())
                .appendQueryParam("vcnId", request.getVcnId())
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .appendQueryParam("displayName", request.getDisplayName())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .appendEnumQueryParam("lifecycleState", request.getLifecycleState())
                .accept("application/json")
                .handleBodyList(
                        com.oracle.bmc.core.model.NetworkSecurityGroup.class,
                        ListNetworkSecurityGroupsResponse.Builder::items)
                .handleResponseHeaderString(
                        "opc-next-page", ListNetworkSecurityGroupsResponse.Builder::opcNextPage)
                .handleResponseHeaderString(
                        "opc-request-id", ListNetworkSecurityGroupsResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public ListPrivateIpsResponse listPrivateIps(ListPrivateIpsRequest request) {

        return clientCall(request, ListPrivateIpsResponse::builder)
                .logger(LOG, "listPrivateIps")
                .serviceDetails(
                        "VirtualNetwork",
                        "ListPrivateIps",
                        "https://docs.oracle.com/iaas/api/#/en/iaas/20160918/PrivateIp/ListPrivateIps")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListPrivateIpsRequest::builder)
                .basePath("/20160918")
                .appendPathParam("privateIps")
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .appendQueryParam("ipAddress", request.getIpAddress())
                .appendQueryParam("subnetId", request.getSubnetId())
                .appendQueryParam("vnicId", request.getVnicId())
                .appendQueryParam("vlanId", request.getVlanId())
                .accept("application/json")
                .handleBodyList(
                        com.oracle.bmc.core.model.PrivateIp.class,
                        ListPrivateIpsResponse.Builder::items)
                .handleResponseHeaderString(
                        "opc-next-page", ListPrivateIpsResponse.Builder::opcNextPage)
                .handleResponseHeaderString(
                        "opc-request-id", ListPrivateIpsResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public ListPublicIpPoolsResponse listPublicIpPools(ListPublicIpPoolsRequest request) {
        Objects.requireNonNull(request.getCompartmentId(), "compartmentId is required");

        return clientCall(request, ListPublicIpPoolsResponse::builder)
                .logger(LOG, "listPublicIpPools")
                .serviceDetails(
                        "VirtualNetwork",
                        "ListPublicIpPools",
                        "https://docs.oracle.com/iaas/api/#/en/iaas/20160918/PublicIpPool/ListPublicIpPools")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListPublicIpPoolsRequest::builder)
                .basePath("/20160918")
                .appendPathParam("publicIpPools")
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .appendQueryParam("displayName", request.getDisplayName())
                .appendQueryParam("byoipRangeId", request.getByoipRangeId())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .appendQueryParam("compartmentId", request.getCompartmentId())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.core.model.PublicIpPoolCollection.class,
                        ListPublicIpPoolsResponse.Builder::publicIpPoolCollection)
                .handleResponseHeaderString(
                        "opc-next-page", ListPublicIpPoolsResponse.Builder::opcNextPage)
                .handleResponseHeaderString(
                        "opc-request-id", ListPublicIpPoolsResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public ListPublicIpsResponse listPublicIps(ListPublicIpsRequest request) {
        Objects.requireNonNull(request.getScope(), "scope is required");

        Objects.requireNonNull(request.getCompartmentId(), "compartmentId is required");

        return clientCall(request, ListPublicIpsResponse::builder)
                .logger(LOG, "listPublicIps")
                .serviceDetails(
                        "VirtualNetwork",
                        "ListPublicIps",
                        "https://docs.oracle.com/iaas/api/#/en/iaas/20160918/PublicIp/ListPublicIps")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListPublicIpsRequest::builder)
                .basePath("/20160918")
                .appendPathParam("publicIps")
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .appendEnumQueryParam("scope", request.getScope())
                .appendQueryParam("availabilityDomain", request.getAvailabilityDomain())
                .appendEnumQueryParam("lifetime", request.getLifetime())
                .appendQueryParam("compartmentId", request.getCompartmentId())
                .appendQueryParam("publicIpPoolId", request.getPublicIpPoolId())
                .accept("application/json")
                .handleBodyList(
                        com.oracle.bmc.core.model.PublicIp.class,
                        ListPublicIpsResponse.Builder::items)
                .handleResponseHeaderString(
                        "opc-next-page", ListPublicIpsResponse.Builder::opcNextPage)
                .handleResponseHeaderString(
                        "opc-request-id", ListPublicIpsResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public ListRemotePeeringConnectionsResponse listRemotePeeringConnections(
            ListRemotePeeringConnectionsRequest request) {
        Objects.requireNonNull(request.getCompartmentId(), "compartmentId is required");

        return clientCall(request, ListRemotePeeringConnectionsResponse::builder)
                .logger(LOG, "listRemotePeeringConnections")
                .serviceDetails(
                        "VirtualNetwork",
                        "ListRemotePeeringConnections",
                        "https://docs.oracle.com/iaas/api/#/en/iaas/20160918/RemotePeeringConnection/ListRemotePeeringConnections")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListRemotePeeringConnectionsRequest::builder)
                .basePath("/20160918")
                .appendPathParam("remotePeeringConnections")
                .appendQueryParam("compartmentId", request.getCompartmentId())
                .appendQueryParam("drgId", request.getDrgId())
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .accept("application/json")
                .handleBodyList(
                        com.oracle.bmc.core.model.RemotePeeringConnection.class,
                        ListRemotePeeringConnectionsResponse.Builder::items)
                .handleResponseHeaderString(
                        "opc-next-page", ListRemotePeeringConnectionsResponse.Builder::opcNextPage)
                .handleResponseHeaderString(
                        "opc-request-id",
                        ListRemotePeeringConnectionsResponse.Builder::opcRequestId)
                .operationUsesDefaultRetries()
                .callSync();
    }

    @Override
    public ListRouteTablesResponse listRouteTables(ListRouteTablesRequest request) {
        Objects.requireNonNull(request.getCompartmentId(), "compartmentId is required");

        return clientCall(request, ListRouteTablesResponse::builder)
                .logger(LOG, "listRouteTables")
                .serviceDetails(
                        "VirtualNetwork",
                        "ListRouteTables",
                        "https://docs.oracle.com/iaas/api/#/en/iaas/20160918/RouteTable/ListRouteTables")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListRouteTablesRequest::builder)
                .basePath("/20160918")
                .appendPathParam("routeTables")
                .appendQueryParam("compartmentId", request.getCompartmentId())
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .appendQueryParam("vcnId", request.getVcnId())
                .appendQueryParam("displayName", request.getDisplayName())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .appendEnumQueryParam("lifecycleState", request.getLifecycleState())
                .accept("application/json")
                .handleBodyList(
                        com.oracle.bmc.core.model.RouteTable.class,
                        ListRouteTablesResponse.Builder::items)
                .handleResponseHeaderString(
                        "opc-next-page", ListRouteTablesResponse.Builder::opcNextPage)
                .handleResponseHeaderString(
                        "opc-request-id", ListRouteTablesResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public ListSecurityListsResponse listSecurityLists(ListSecurityListsRequest request) {
        Objects.requireNonNull(request.getCompartmentId(), "compartmentId is required");

        return clientCall(request, ListSecurityListsResponse::builder)
                .logger(LOG, "listSecurityLists")
                .serviceDetails(
                        "VirtualNetwork",
                        "ListSecurityLists",
                        "https://docs.oracle.com/iaas/api/#/en/iaas/20160918/SecurityList/ListSecurityLists")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListSecurityListsRequest::builder)
                .basePath("/20160918")
                .appendPathParam("securityLists")
                .appendQueryParam("compartmentId", request.getCompartmentId())
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .appendQueryParam("vcnId", request.getVcnId())
                .appendQueryParam("displayName", request.getDisplayName())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .appendEnumQueryParam("lifecycleState", request.getLifecycleState())
                .accept("application/json")
                .handleBodyList(
                        com.oracle.bmc.core.model.SecurityList.class,
                        ListSecurityListsResponse.Builder::items)
                .handleResponseHeaderString(
                        "opc-next-page", ListSecurityListsResponse.Builder::opcNextPage)
                .handleResponseHeaderString(
                        "opc-request-id", ListSecurityListsResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public ListServiceGatewaysResponse listServiceGateways(ListServiceGatewaysRequest request) {
        Objects.requireNonNull(request.getCompartmentId(), "compartmentId is required");

        return clientCall(request, ListServiceGatewaysResponse::builder)
                .logger(LOG, "listServiceGateways")
                .serviceDetails(
                        "VirtualNetwork",
                        "ListServiceGateways",
                        "https://docs.oracle.com/iaas/api/#/en/iaas/20160918/ServiceGateway/ListServiceGateways")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListServiceGatewaysRequest::builder)
                .basePath("/20160918")
                .appendPathParam("serviceGateways")
                .appendQueryParam("compartmentId", request.getCompartmentId())
                .appendQueryParam("vcnId", request.getVcnId())
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .appendEnumQueryParam("lifecycleState", request.getLifecycleState())
                .accept("application/json")
                .handleBodyList(
                        com.oracle.bmc.core.model.ServiceGateway.class,
                        ListServiceGatewaysResponse.Builder::items)
                .handleResponseHeaderString(
                        "opc-next-page", ListServiceGatewaysResponse.Builder::opcNextPage)
                .handleResponseHeaderString(
                        "opc-request-id", ListServiceGatewaysResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public ListServicesResponse listServices(ListServicesRequest request) {

        return clientCall(request, ListServicesResponse::builder)
                .logger(LOG, "listServices")
                .serviceDetails(
                        "VirtualNetwork",
                        "ListServices",
                        "https://docs.oracle.com/iaas/api/#/en/iaas/20160918/Service/ListServices")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListServicesRequest::builder)
                .basePath("/20160918")
                .appendPathParam("services")
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .accept("application/json")
                .handleBodyList(
                        com.oracle.bmc.core.model.Service.class,
                        ListServicesResponse.Builder::items)
                .handleResponseHeaderString(
                        "opc-next-page", ListServicesResponse.Builder::opcNextPage)
                .handleResponseHeaderString(
                        "opc-request-id", ListServicesResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public ListSubnetsResponse listSubnets(ListSubnetsRequest request) {
        Objects.requireNonNull(request.getCompartmentId(), "compartmentId is required");

        return clientCall(request, ListSubnetsResponse::builder)
                .logger(LOG, "listSubnets")
                .serviceDetails(
                        "VirtualNetwork",
                        "ListSubnets",
                        "https://docs.oracle.com/iaas/api/#/en/iaas/20160918/Subnet/ListSubnets")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListSubnetsRequest::builder)
                .basePath("/20160918")
                .appendPathParam("subnets")
                .appendQueryParam("compartmentId", request.getCompartmentId())
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .appendQueryParam("vcnId", request.getVcnId())
                .appendQueryParam("displayName", request.getDisplayName())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .appendEnumQueryParam("lifecycleState", request.getLifecycleState())
                .accept("application/json")
                .handleBodyList(
                        com.oracle.bmc.core.model.Subnet.class, ListSubnetsResponse.Builder::items)
                .handleResponseHeaderString(
                        "opc-next-page", ListSubnetsResponse.Builder::opcNextPage)
                .handleResponseHeaderString(
                        "opc-request-id", ListSubnetsResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public ListVcnsResponse listVcns(ListVcnsRequest request) {
        Objects.requireNonNull(request.getCompartmentId(), "compartmentId is required");

        return clientCall(request, ListVcnsResponse::builder)
                .logger(LOG, "listVcns")
                .serviceDetails(
                        "VirtualNetwork",
                        "ListVcns",
                        "https://docs.oracle.com/iaas/api/#/en/iaas/20160918/Vcn/ListVcns")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListVcnsRequest::builder)
                .basePath("/20160918")
                .appendPathParam("vcns")
                .appendQueryParam("compartmentId", request.getCompartmentId())
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .appendQueryParam("displayName", request.getDisplayName())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .appendEnumQueryParam("lifecycleState", request.getLifecycleState())
                .accept("application/json")
                .handleBodyList(
                        com.oracle.bmc.core.model.Vcn.class, ListVcnsResponse.Builder::items)
                .handleResponseHeaderString("opc-next-page", ListVcnsResponse.Builder::opcNextPage)
                .handleResponseHeaderString(
                        "opc-request-id", ListVcnsResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public ListVirtualCircuitAssociatedTunnelsResponse listVirtualCircuitAssociatedTunnels(
            ListVirtualCircuitAssociatedTunnelsRequest request) {

        Validate.notBlank(request.getVirtualCircuitId(), "virtualCircuitId must not be blank");

        return clientCall(request, ListVirtualCircuitAssociatedTunnelsResponse::builder)
                .logger(LOG, "listVirtualCircuitAssociatedTunnels")
                .serviceDetails(
                        "VirtualNetwork",
                        "ListVirtualCircuitAssociatedTunnels",
                        "https://docs.oracle.com/iaas/api/#/en/iaas/20160918/VirtualCircuitAssociatedTunnelDetails/ListVirtualCircuitAssociatedTunnels")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListVirtualCircuitAssociatedTunnelsRequest::builder)
                .basePath("/20160918")
                .appendPathParam("virtualCircuits")
                .appendPathParam(request.getVirtualCircuitId())
                .appendPathParam("associatedTunnels")
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .accept("application/json")
                .handleBodyList(
                        com.oracle.bmc.core.model.VirtualCircuitAssociatedTunnelDetails.class,
                        ListVirtualCircuitAssociatedTunnelsResponse.Builder::items)
                .handleResponseHeaderString(
                        "etag", ListVirtualCircuitAssociatedTunnelsResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id",
                        ListVirtualCircuitAssociatedTunnelsResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page",
                        ListVirtualCircuitAssociatedTunnelsResponse.Builder::opcNextPage)
                .operationUsesDefaultRetries()
                .callSync();
    }

    @Override
    public ListVirtualCircuitBandwidthShapesResponse listVirtualCircuitBandwidthShapes(
            ListVirtualCircuitBandwidthShapesRequest request) {
        Objects.requireNonNull(request.getCompartmentId(), "compartmentId is required");

        return clientCall(request, ListVirtualCircuitBandwidthShapesResponse::builder)
                .logger(LOG, "listVirtualCircuitBandwidthShapes")
                .serviceDetails(
                        "VirtualNetwork",
                        "ListVirtualCircuitBandwidthShapes",
                        "https://docs.oracle.com/iaas/api/#/en/iaas/20160918/VirtualCircuitBandwidthShape/ListVirtualCircuitBandwidthShapes")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListVirtualCircuitBandwidthShapesRequest::builder)
                .basePath("/20160918")
                .appendPathParam("virtualCircuitBandwidthShapes")
                .appendQueryParam("compartmentId", request.getCompartmentId())
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .accept("application/json")
                .handleBodyList(
                        com.oracle.bmc.core.model.VirtualCircuitBandwidthShape.class,
                        ListVirtualCircuitBandwidthShapesResponse.Builder::items)
                .handleResponseHeaderString(
                        "opc-next-page",
                        ListVirtualCircuitBandwidthShapesResponse.Builder::opcNextPage)
                .handleResponseHeaderString(
                        "opc-request-id",
                        ListVirtualCircuitBandwidthShapesResponse.Builder::opcRequestId)
                .operationUsesDefaultRetries()
                .callSync();
    }

    @Override
    public ListVirtualCircuitPublicPrefixesResponse listVirtualCircuitPublicPrefixes(
            ListVirtualCircuitPublicPrefixesRequest request) {

        Validate.notBlank(request.getVirtualCircuitId(), "virtualCircuitId must not be blank");

        return clientCall(request, ListVirtualCircuitPublicPrefixesResponse::builder)
                .logger(LOG, "listVirtualCircuitPublicPrefixes")
                .serviceDetails(
                        "VirtualNetwork",
                        "ListVirtualCircuitPublicPrefixes",
                        "https://docs.oracle.com/iaas/api/#/en/iaas/20160918/VirtualCircuitPublicPrefix/ListVirtualCircuitPublicPrefixes")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListVirtualCircuitPublicPrefixesRequest::builder)
                .basePath("/20160918")
                .appendPathParam("virtualCircuits")
                .appendPathParam(request.getVirtualCircuitId())
                .appendPathParam("publicPrefixes")
                .appendEnumQueryParam("verificationState", request.getVerificationState())
                .accept("application/json")
                .handleBodyList(
                        com.oracle.bmc.core.model.VirtualCircuitPublicPrefix.class,
                        ListVirtualCircuitPublicPrefixesResponse.Builder::items)
                .handleResponseHeaderString(
                        "opc-request-id",
                        ListVirtualCircuitPublicPrefixesResponse.Builder::opcRequestId)
                .operationUsesDefaultRetries()
                .callSync();
    }

    @Override
    public ListVirtualCircuitsResponse listVirtualCircuits(ListVirtualCircuitsRequest request) {
        Objects.requireNonNull(request.getCompartmentId(), "compartmentId is required");

        return clientCall(request, ListVirtualCircuitsResponse::builder)
                .logger(LOG, "listVirtualCircuits")
                .serviceDetails(
                        "VirtualNetwork",
                        "ListVirtualCircuits",
                        "https://docs.oracle.com/iaas/api/#/en/iaas/20160918/VirtualCircuit/ListVirtualCircuits")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListVirtualCircuitsRequest::builder)
                .basePath("/20160918")
                .appendPathParam("virtualCircuits")
                .appendQueryParam("compartmentId", request.getCompartmentId())
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .appendQueryParam("displayName", request.getDisplayName())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .appendEnumQueryParam("lifecycleState", request.getLifecycleState())
                .accept("application/json")
                .handleBodyList(
                        com.oracle.bmc.core.model.VirtualCircuit.class,
                        ListVirtualCircuitsResponse.Builder::items)
                .handleResponseHeaderString(
                        "opc-next-page", ListVirtualCircuitsResponse.Builder::opcNextPage)
                .handleResponseHeaderString(
                        "opc-request-id", ListVirtualCircuitsResponse.Builder::opcRequestId)
                .operationUsesDefaultRetries()
                .callSync();
    }

    @Override
    public ListVlansResponse listVlans(ListVlansRequest request) {
        Objects.requireNonNull(request.getCompartmentId(), "compartmentId is required");

        return clientCall(request, ListVlansResponse::builder)
                .logger(LOG, "listVlans")
                .serviceDetails(
                        "VirtualNetwork",
                        "ListVlans",
                        "https://docs.oracle.com/iaas/api/#/en/iaas/20160918/Vlan/ListVlans")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListVlansRequest::builder)
                .basePath("/20160918")
                .appendPathParam("vlans")
                .appendQueryParam("compartmentId", request.getCompartmentId())
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .appendQueryParam("vcnId", request.getVcnId())
                .appendQueryParam("displayName", request.getDisplayName())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .appendEnumQueryParam("lifecycleState", request.getLifecycleState())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBodyList(
                        com.oracle.bmc.core.model.Vlan.class, ListVlansResponse.Builder::items)
                .handleResponseHeaderString("opc-next-page", ListVlansResponse.Builder::opcNextPage)
                .handleResponseHeaderString(
                        "opc-request-id", ListVlansResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public ListVtapsResponse listVtaps(ListVtapsRequest request) {
        Objects.requireNonNull(request.getCompartmentId(), "compartmentId is required");

        return clientCall(request, ListVtapsResponse::builder)
                .logger(LOG, "listVtaps")
                .serviceDetails(
                        "VirtualNetwork",
                        "ListVtaps",
                        "https://docs.oracle.com/iaas/api/#/en/iaas/20160918/Vtap/ListVtaps")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListVtapsRequest::builder)
                .basePath("/20160918")
                .appendPathParam("vtaps")
                .appendQueryParam("compartmentId", request.getCompartmentId())
                .appendQueryParam("vcnId", request.getVcnId())
                .appendQueryParam("source", request.getSource())
                .appendQueryParam("targetId", request.getTargetId())
                .appendQueryParam("targetIp", request.getTargetIp())
                .appendQueryParam("isVtapEnabled", request.getIsVtapEnabled())
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .appendQueryParam("displayName", request.getDisplayName())
                .appendEnumQueryParam("lifecycleState", request.getLifecycleState())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBodyList(
                        com.oracle.bmc.core.model.Vtap.class, ListVtapsResponse.Builder::items)
                .handleResponseHeaderString("opc-next-page", ListVtapsResponse.Builder::opcNextPage)
                .handleResponseHeaderString(
                        "opc-request-id", ListVtapsResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public ModifyVcnCidrResponse modifyVcnCidr(ModifyVcnCidrRequest request) {

        Validate.notBlank(request.getVcnId(), "vcnId must not be blank");
        Objects.requireNonNull(
                request.getModifyVcnCidrDetails(), "modifyVcnCidrDetails is required");

        return clientCall(request, ModifyVcnCidrResponse::builder)
                .logger(LOG, "modifyVcnCidr")
                .serviceDetails(
                        "VirtualNetwork",
                        "ModifyVcnCidr",
                        "https://docs.oracle.com/iaas/api/#/en/iaas/20160918/Vcn/ModifyVcnCidr")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(ModifyVcnCidrRequest::builder)
                .basePath("/20160918")
                .appendPathParam("vcns")
                .appendPathParam(request.getVcnId())
                .appendPathParam("actions")
                .appendPathParam("modifyCidr")
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("if-match", request.getIfMatch())
                .hasBody()
                .handleResponseHeaderString(
                        "opc-request-id", ModifyVcnCidrResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-work-request-id", ModifyVcnCidrResponse.Builder::opcWorkRequestId)
                .callSync();
    }

    @Override
    public RemoveDrgRouteDistributionStatementsResponse removeDrgRouteDistributionStatements(
            RemoveDrgRouteDistributionStatementsRequest request) {

        Validate.notBlank(
                request.getDrgRouteDistributionId(), "drgRouteDistributionId must not be blank");
        Objects.requireNonNull(
                request.getRemoveDrgRouteDistributionStatementsDetails(),
                "removeDrgRouteDistributionStatementsDetails is required");

        return clientCall(request, RemoveDrgRouteDistributionStatementsResponse::builder)
                .logger(LOG, "removeDrgRouteDistributionStatements")
                .serviceDetails(
                        "VirtualNetwork",
                        "RemoveDrgRouteDistributionStatements",
                        "https://docs.oracle.com/iaas/api/#/en/iaas/20160918/DrgRouteDistributionStatement/RemoveDrgRouteDistributionStatements")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(RemoveDrgRouteDistributionStatementsRequest::builder)
                .basePath("/20160918")
                .appendPathParam("drgRouteDistributions")
                .appendPathParam(request.getDrgRouteDistributionId())
                .appendPathParam("actions")
                .appendPathParam("removeDrgRouteDistributionStatements")
                .accept("application/json")
                .hasBody()
                .handleResponseHeaderString(
                        "opc-request-id",
                        RemoveDrgRouteDistributionStatementsResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public RemoveDrgRouteRulesResponse removeDrgRouteRules(RemoveDrgRouteRulesRequest request) {

        Validate.notBlank(request.getDrgRouteTableId(), "drgRouteTableId must not be blank");
        Objects.requireNonNull(
                request.getRemoveDrgRouteRulesDetails(), "removeDrgRouteRulesDetails is required");

        return clientCall(request, RemoveDrgRouteRulesResponse::builder)
                .logger(LOG, "removeDrgRouteRules")
                .serviceDetails(
                        "VirtualNetwork",
                        "RemoveDrgRouteRules",
                        "https://docs.oracle.com/iaas/api/#/en/iaas/20160918/DrgRouteRule/RemoveDrgRouteRules")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(RemoveDrgRouteRulesRequest::builder)
                .basePath("/20160918")
                .appendPathParam("drgRouteTables")
                .appendPathParam(request.getDrgRouteTableId())
                .appendPathParam("actions")
                .appendPathParam("removeDrgRouteRules")
                .accept("application/json")
                .hasBody()
                .handleResponseHeaderString(
                        "opc-request-id", RemoveDrgRouteRulesResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public RemoveExportDrgRouteDistributionResponse removeExportDrgRouteDistribution(
            RemoveExportDrgRouteDistributionRequest request) {

        Validate.notBlank(request.getDrgAttachmentId(), "drgAttachmentId must not be blank");

        return clientCall(request, RemoveExportDrgRouteDistributionResponse::builder)
                .logger(LOG, "removeExportDrgRouteDistribution")
                .serviceDetails(
                        "VirtualNetwork",
                        "RemoveExportDrgRouteDistribution",
                        "https://docs.oracle.com/iaas/api/#/en/iaas/20160918/DrgAttachment/RemoveExportDrgRouteDistribution")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(RemoveExportDrgRouteDistributionRequest::builder)
                .basePath("/20160918")
                .appendPathParam("drgAttachments")
                .appendPathParam(request.getDrgAttachmentId())
                .appendPathParam("actions")
                .appendPathParam("removeExportDrgRouteDistribution")
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("if-match", request.getIfMatch())
                .handleBody(
                        com.oracle.bmc.core.model.DrgAttachment.class,
                        RemoveExportDrgRouteDistributionResponse.Builder::drgAttachment)
                .handleResponseHeaderString(
                        "etag", RemoveExportDrgRouteDistributionResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id",
                        RemoveExportDrgRouteDistributionResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public RemoveImportDrgRouteDistributionResponse removeImportDrgRouteDistribution(
            RemoveImportDrgRouteDistributionRequest request) {

        Validate.notBlank(request.getDrgRouteTableId(), "drgRouteTableId must not be blank");

        return clientCall(request, RemoveImportDrgRouteDistributionResponse::builder)
                .logger(LOG, "removeImportDrgRouteDistribution")
                .serviceDetails(
                        "VirtualNetwork",
                        "RemoveImportDrgRouteDistribution",
                        "https://docs.oracle.com/iaas/api/#/en/iaas/20160918/DrgRouteTable/RemoveImportDrgRouteDistribution")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(RemoveImportDrgRouteDistributionRequest::builder)
                .basePath("/20160918")
                .appendPathParam("drgRouteTables")
                .appendPathParam(request.getDrgRouteTableId())
                .appendPathParam("actions")
                .appendPathParam("removeImportDrgRouteDistribution")
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("if-match", request.getIfMatch())
                .handleBody(
                        com.oracle.bmc.core.model.DrgRouteTable.class,
                        RemoveImportDrgRouteDistributionResponse.Builder::drgRouteTable)
                .handleResponseHeaderString(
                        "etag", RemoveImportDrgRouteDistributionResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id",
                        RemoveImportDrgRouteDistributionResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public RemoveIpv6SubnetCidrResponse removeIpv6SubnetCidr(RemoveIpv6SubnetCidrRequest request) {

        Validate.notBlank(request.getSubnetId(), "subnetId must not be blank");
        Objects.requireNonNull(
                request.getRemoveSubnetIpv6CidrDetails(),
                "removeSubnetIpv6CidrDetails is required");

        return clientCall(request, RemoveIpv6SubnetCidrResponse::builder)
                .logger(LOG, "removeIpv6SubnetCidr")
                .serviceDetails(
                        "VirtualNetwork",
                        "RemoveIpv6SubnetCidr",
                        "https://docs.oracle.com/iaas/api/#/en/iaas/20160918/Subnet/RemoveIpv6SubnetCidr")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(RemoveIpv6SubnetCidrRequest::builder)
                .basePath("/20160918")
                .appendPathParam("subnets")
                .appendPathParam(request.getSubnetId())
                .appendPathParam("actions")
                .appendPathParam("removeIpv6Cidr")
                .accept("application/json")
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .hasBody()
                .handleResponseHeaderString("etag", RemoveIpv6SubnetCidrResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", RemoveIpv6SubnetCidrResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        RemoveIpv6SubnetCidrResponse.Builder::opcWorkRequestId)
                .callSync();
    }

    @Override
    public RemoveIpv6VcnCidrResponse removeIpv6VcnCidr(RemoveIpv6VcnCidrRequest request) {

        Validate.notBlank(request.getVcnId(), "vcnId must not be blank");

        return clientCall(request, RemoveIpv6VcnCidrResponse::builder)
                .logger(LOG, "removeIpv6VcnCidr")
                .serviceDetails(
                        "VirtualNetwork",
                        "RemoveIpv6VcnCidr",
                        "https://docs.oracle.com/iaas/api/#/en/iaas/20160918/Vcn/RemoveIpv6VcnCidr")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(RemoveIpv6VcnCidrRequest::builder)
                .basePath("/20160918")
                .appendPathParam("vcns")
                .appendPathParam(request.getVcnId())
                .appendPathParam("actions")
                .appendPathParam("removeIpv6Cidr")
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("if-match", request.getIfMatch())
                .hasBody()
                .handleResponseHeaderString("etag", RemoveIpv6VcnCidrResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", RemoveIpv6VcnCidrResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-work-request-id", RemoveIpv6VcnCidrResponse.Builder::opcWorkRequestId)
                .callSync();
    }

    @Override
    public RemoveNetworkSecurityGroupSecurityRulesResponse removeNetworkSecurityGroupSecurityRules(
            RemoveNetworkSecurityGroupSecurityRulesRequest request) {

        Validate.notBlank(
                request.getNetworkSecurityGroupId(), "networkSecurityGroupId must not be blank");
        Objects.requireNonNull(
                request.getRemoveNetworkSecurityGroupSecurityRulesDetails(),
                "removeNetworkSecurityGroupSecurityRulesDetails is required");

        return clientCall(request, RemoveNetworkSecurityGroupSecurityRulesResponse::builder)
                .logger(LOG, "removeNetworkSecurityGroupSecurityRules")
                .serviceDetails(
                        "VirtualNetwork",
                        "RemoveNetworkSecurityGroupSecurityRules",
                        "https://docs.oracle.com/iaas/api/#/en/iaas/20160918/SecurityRule/RemoveNetworkSecurityGroupSecurityRules")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(RemoveNetworkSecurityGroupSecurityRulesRequest::builder)
                .basePath("/20160918")
                .appendPathParam("networkSecurityGroups")
                .appendPathParam(request.getNetworkSecurityGroupId())
                .appendPathParam("actions")
                .appendPathParam("removeSecurityRules")
                .accept("application/json")
                .hasBody()
                .handleResponseHeaderString(
                        "opc-request-id",
                        RemoveNetworkSecurityGroupSecurityRulesResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public RemovePublicIpPoolCapacityResponse removePublicIpPoolCapacity(
            RemovePublicIpPoolCapacityRequest request) {

        Validate.notBlank(request.getPublicIpPoolId(), "publicIpPoolId must not be blank");
        Objects.requireNonNull(
                request.getRemovePublicIpPoolCapacityDetails(),
                "removePublicIpPoolCapacityDetails is required");

        return clientCall(request, RemovePublicIpPoolCapacityResponse::builder)
                .logger(LOG, "removePublicIpPoolCapacity")
                .serviceDetails(
                        "VirtualNetwork",
                        "RemovePublicIpPoolCapacity",
                        "https://docs.oracle.com/iaas/api/#/en/iaas/20160918/PublicIpPool/RemovePublicIpPoolCapacity")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(RemovePublicIpPoolCapacityRequest::builder)
                .basePath("/20160918")
                .appendPathParam("publicIpPools")
                .appendPathParam(request.getPublicIpPoolId())
                .appendPathParam("actions")
                .appendPathParam("removeCapacity")
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.core.model.PublicIpPool.class,
                        RemovePublicIpPoolCapacityResponse.Builder::publicIpPool)
                .handleResponseHeaderString(
                        "etag", RemovePublicIpPoolCapacityResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", RemovePublicIpPoolCapacityResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public RemoveVcnCidrResponse removeVcnCidr(RemoveVcnCidrRequest request) {

        Validate.notBlank(request.getVcnId(), "vcnId must not be blank");
        Objects.requireNonNull(
                request.getRemoveVcnCidrDetails(), "removeVcnCidrDetails is required");

        return clientCall(request, RemoveVcnCidrResponse::builder)
                .logger(LOG, "removeVcnCidr")
                .serviceDetails(
                        "VirtualNetwork",
                        "RemoveVcnCidr",
                        "https://docs.oracle.com/iaas/api/#/en/iaas/20160918/Vcn/RemoveVcnCidr")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(RemoveVcnCidrRequest::builder)
                .basePath("/20160918")
                .appendPathParam("vcns")
                .appendPathParam(request.getVcnId())
                .appendPathParam("actions")
                .appendPathParam("removeCidr")
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("if-match", request.getIfMatch())
                .hasBody()
                .handleResponseHeaderString(
                        "opc-request-id", RemoveVcnCidrResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-work-request-id", RemoveVcnCidrResponse.Builder::opcWorkRequestId)
                .callSync();
    }

    @Override
    public UpdateByoipRangeResponse updateByoipRange(UpdateByoipRangeRequest request) {

        Validate.notBlank(request.getByoipRangeId(), "byoipRangeId must not be blank");
        Objects.requireNonNull(
                request.getUpdateByoipRangeDetails(), "updateByoipRangeDetails is required");

        return clientCall(request, UpdateByoipRangeResponse::builder)
                .logger(LOG, "updateByoipRange")
                .serviceDetails(
                        "VirtualNetwork",
                        "UpdateByoipRange",
                        "https://docs.oracle.com/iaas/api/#/en/iaas/20160918/ByoipRange/UpdateByoipRange")
                .method(com.oracle.bmc.http.client.Method.PUT)
                .requestBuilder(UpdateByoipRangeRequest::builder)
                .basePath("/20160918")
                .appendPathParam("byoipRanges")
                .appendPathParam(request.getByoipRangeId())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("if-match", request.getIfMatch())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.core.model.ByoipRange.class,
                        UpdateByoipRangeResponse.Builder::byoipRange)
                .handleResponseHeaderString("etag", UpdateByoipRangeResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", UpdateByoipRangeResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public UpdateCaptureFilterResponse updateCaptureFilter(UpdateCaptureFilterRequest request) {

        Validate.notBlank(request.getCaptureFilterId(), "captureFilterId must not be blank");
        Objects.requireNonNull(
                request.getUpdateCaptureFilterDetails(), "updateCaptureFilterDetails is required");

        return clientCall(request, UpdateCaptureFilterResponse::builder)
                .logger(LOG, "updateCaptureFilter")
                .serviceDetails(
                        "VirtualNetwork",
                        "UpdateCaptureFilter",
                        "https://docs.oracle.com/iaas/api/#/en/iaas/20160918/CaptureFilter/UpdateCaptureFilter")
                .method(com.oracle.bmc.http.client.Method.PUT)
                .requestBuilder(UpdateCaptureFilterRequest::builder)
                .basePath("/20160918")
                .appendPathParam("captureFilters")
                .appendPathParam(request.getCaptureFilterId())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.core.model.CaptureFilter.class,
                        UpdateCaptureFilterResponse.Builder::captureFilter)
                .handleResponseHeaderString("etag", UpdateCaptureFilterResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", UpdateCaptureFilterResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public UpdateCpeResponse updateCpe(UpdateCpeRequest request) {

        Validate.notBlank(request.getCpeId(), "cpeId must not be blank");
        Objects.requireNonNull(request.getUpdateCpeDetails(), "updateCpeDetails is required");

        return clientCall(request, UpdateCpeResponse::builder)
                .logger(LOG, "updateCpe")
                .serviceDetails(
                        "VirtualNetwork",
                        "UpdateCpe",
                        "https://docs.oracle.com/iaas/api/#/en/iaas/20160918/Cpe/UpdateCpe")
                .method(com.oracle.bmc.http.client.Method.PUT)
                .requestBuilder(UpdateCpeRequest::builder)
                .basePath("/20160918")
                .appendPathParam("cpes")
                .appendPathParam(request.getCpeId())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .hasBody()
                .handleBody(com.oracle.bmc.core.model.Cpe.class, UpdateCpeResponse.Builder::cpe)
                .handleResponseHeaderString("etag", UpdateCpeResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", UpdateCpeResponse.Builder::opcRequestId)
                .operationUsesDefaultRetries()
                .callSync();
    }

    @Override
    public UpdateCrossConnectResponse updateCrossConnect(UpdateCrossConnectRequest request) {

        Validate.notBlank(request.getCrossConnectId(), "crossConnectId must not be blank");
        Objects.requireNonNull(
                request.getUpdateCrossConnectDetails(), "updateCrossConnectDetails is required");

        return clientCall(request, UpdateCrossConnectResponse::builder)
                .logger(LOG, "updateCrossConnect")
                .serviceDetails(
                        "VirtualNetwork",
                        "UpdateCrossConnect",
                        "https://docs.oracle.com/iaas/api/#/en/iaas/20160918/CrossConnect/UpdateCrossConnect")
                .method(com.oracle.bmc.http.client.Method.PUT)
                .requestBuilder(UpdateCrossConnectRequest::builder)
                .basePath("/20160918")
                .appendPathParam("crossConnects")
                .appendPathParam(request.getCrossConnectId())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.core.model.CrossConnect.class,
                        UpdateCrossConnectResponse.Builder::crossConnect)
                .handleResponseHeaderString("etag", UpdateCrossConnectResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", UpdateCrossConnectResponse.Builder::opcRequestId)
                .operationUsesDefaultRetries()
                .callSync();
    }

    @Override
    public UpdateCrossConnectGroupResponse updateCrossConnectGroup(
            UpdateCrossConnectGroupRequest request) {

        Validate.notBlank(
                request.getCrossConnectGroupId(), "crossConnectGroupId must not be blank");
        Objects.requireNonNull(
                request.getUpdateCrossConnectGroupDetails(),
                "updateCrossConnectGroupDetails is required");

        return clientCall(request, UpdateCrossConnectGroupResponse::builder)
                .logger(LOG, "updateCrossConnectGroup")
                .serviceDetails(
                        "VirtualNetwork",
                        "UpdateCrossConnectGroup",
                        "https://docs.oracle.com/iaas/api/#/en/iaas/20160918/CrossConnectGroup/UpdateCrossConnectGroup")
                .method(com.oracle.bmc.http.client.Method.PUT)
                .requestBuilder(UpdateCrossConnectGroupRequest::builder)
                .basePath("/20160918")
                .appendPathParam("crossConnectGroups")
                .appendPathParam(request.getCrossConnectGroupId())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.core.model.CrossConnectGroup.class,
                        UpdateCrossConnectGroupResponse.Builder::crossConnectGroup)
                .handleResponseHeaderString("etag", UpdateCrossConnectGroupResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", UpdateCrossConnectGroupResponse.Builder::opcRequestId)
                .operationUsesDefaultRetries()
                .callSync();
    }

    @Override
    public UpdateDhcpOptionsResponse updateDhcpOptions(UpdateDhcpOptionsRequest request) {

        Validate.notBlank(request.getDhcpId(), "dhcpId must not be blank");
        Objects.requireNonNull(request.getUpdateDhcpDetails(), "updateDhcpDetails is required");

        return clientCall(request, UpdateDhcpOptionsResponse::builder)
                .logger(LOG, "updateDhcpOptions")
                .serviceDetails(
                        "VirtualNetwork",
                        "UpdateDhcpOptions",
                        "https://docs.oracle.com/iaas/api/#/en/iaas/20160918/DhcpOptions/UpdateDhcpOptions")
                .method(com.oracle.bmc.http.client.Method.PUT)
                .requestBuilder(UpdateDhcpOptionsRequest::builder)
                .basePath("/20160918")
                .appendPathParam("dhcps")
                .appendPathParam(request.getDhcpId())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.core.model.DhcpOptions.class,
                        UpdateDhcpOptionsResponse.Builder::dhcpOptions)
                .handleResponseHeaderString("etag", UpdateDhcpOptionsResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", UpdateDhcpOptionsResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public UpdateDrgResponse updateDrg(UpdateDrgRequest request) {

        Validate.notBlank(request.getDrgId(), "drgId must not be blank");
        Objects.requireNonNull(request.getUpdateDrgDetails(), "updateDrgDetails is required");

        return clientCall(request, UpdateDrgResponse::builder)
                .logger(LOG, "updateDrg")
                .serviceDetails(
                        "VirtualNetwork",
                        "UpdateDrg",
                        "https://docs.oracle.com/iaas/api/#/en/iaas/20160918/Drg/UpdateDrg")
                .method(com.oracle.bmc.http.client.Method.PUT)
                .requestBuilder(UpdateDrgRequest::builder)
                .basePath("/20160918")
                .appendPathParam("drgs")
                .appendPathParam(request.getDrgId())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .hasBody()
                .handleBody(com.oracle.bmc.core.model.Drg.class, UpdateDrgResponse.Builder::drg)
                .handleResponseHeaderString("etag", UpdateDrgResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", UpdateDrgResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public UpdateDrgAttachmentResponse updateDrgAttachment(UpdateDrgAttachmentRequest request) {

        Validate.notBlank(request.getDrgAttachmentId(), "drgAttachmentId must not be blank");
        Objects.requireNonNull(
                request.getUpdateDrgAttachmentDetails(), "updateDrgAttachmentDetails is required");

        return clientCall(request, UpdateDrgAttachmentResponse::builder)
                .logger(LOG, "updateDrgAttachment")
                .serviceDetails(
                        "VirtualNetwork",
                        "UpdateDrgAttachment",
                        "https://docs.oracle.com/iaas/api/#/en/iaas/20160918/DrgAttachment/UpdateDrgAttachment")
                .method(com.oracle.bmc.http.client.Method.PUT)
                .requestBuilder(UpdateDrgAttachmentRequest::builder)
                .basePath("/20160918")
                .appendPathParam("drgAttachments")
                .appendPathParam(request.getDrgAttachmentId())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.core.model.DrgAttachment.class,
                        UpdateDrgAttachmentResponse.Builder::drgAttachment)
                .handleResponseHeaderString("etag", UpdateDrgAttachmentResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", UpdateDrgAttachmentResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public UpdateDrgRouteDistributionResponse updateDrgRouteDistribution(
            UpdateDrgRouteDistributionRequest request) {

        Validate.notBlank(
                request.getDrgRouteDistributionId(), "drgRouteDistributionId must not be blank");
        Objects.requireNonNull(
                request.getUpdateDrgRouteDistributionDetails(),
                "updateDrgRouteDistributionDetails is required");

        return clientCall(request, UpdateDrgRouteDistributionResponse::builder)
                .logger(LOG, "updateDrgRouteDistribution")
                .serviceDetails(
                        "VirtualNetwork",
                        "UpdateDrgRouteDistribution",
                        "https://docs.oracle.com/iaas/api/#/en/iaas/20160918/DrgRouteDistribution/UpdateDrgRouteDistribution")
                .method(com.oracle.bmc.http.client.Method.PUT)
                .requestBuilder(UpdateDrgRouteDistributionRequest::builder)
                .basePath("/20160918")
                .appendPathParam("drgRouteDistributions")
                .appendPathParam(request.getDrgRouteDistributionId())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.core.model.DrgRouteDistribution.class,
                        UpdateDrgRouteDistributionResponse.Builder::drgRouteDistribution)
                .handleResponseHeaderString(
                        "etag", UpdateDrgRouteDistributionResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", UpdateDrgRouteDistributionResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public UpdateDrgRouteDistributionStatementsResponse updateDrgRouteDistributionStatements(
            UpdateDrgRouteDistributionStatementsRequest request) {

        Validate.notBlank(
                request.getDrgRouteDistributionId(), "drgRouteDistributionId must not be blank");
        Objects.requireNonNull(
                request.getUpdateDrgRouteDistributionStatementsDetails(),
                "updateDrgRouteDistributionStatementsDetails is required");

        return clientCall(request, UpdateDrgRouteDistributionStatementsResponse::builder)
                .logger(LOG, "updateDrgRouteDistributionStatements")
                .serviceDetails(
                        "VirtualNetwork",
                        "UpdateDrgRouteDistributionStatements",
                        "https://docs.oracle.com/iaas/api/#/en/iaas/20160918/DrgRouteDistributionStatement/UpdateDrgRouteDistributionStatements")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(UpdateDrgRouteDistributionStatementsRequest::builder)
                .basePath("/20160918")
                .appendPathParam("drgRouteDistributions")
                .appendPathParam(request.getDrgRouteDistributionId())
                .appendPathParam("actions")
                .appendPathParam("updateDrgRouteDistributionStatements")
                .accept("application/json")
                .hasBody()
                .handleBodyList(
                        com.oracle.bmc.core.model.DrgRouteDistributionStatement.class,
                        UpdateDrgRouteDistributionStatementsResponse.Builder::items)
                .handleResponseHeaderString(
                        "opc-request-id",
                        UpdateDrgRouteDistributionStatementsResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public UpdateDrgRouteRulesResponse updateDrgRouteRules(UpdateDrgRouteRulesRequest request) {

        Validate.notBlank(request.getDrgRouteTableId(), "drgRouteTableId must not be blank");
        Objects.requireNonNull(
                request.getUpdateDrgRouteRulesDetails(), "updateDrgRouteRulesDetails is required");

        return clientCall(request, UpdateDrgRouteRulesResponse::builder)
                .logger(LOG, "updateDrgRouteRules")
                .serviceDetails(
                        "VirtualNetwork",
                        "UpdateDrgRouteRules",
                        "https://docs.oracle.com/iaas/api/#/en/iaas/20160918/DrgRouteRule/UpdateDrgRouteRules")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(UpdateDrgRouteRulesRequest::builder)
                .basePath("/20160918")
                .appendPathParam("drgRouteTables")
                .appendPathParam(request.getDrgRouteTableId())
                .appendPathParam("actions")
                .appendPathParam("updateDrgRouteRules")
                .accept("application/json")
                .hasBody()
                .handleBodyList(
                        com.oracle.bmc.core.model.DrgRouteRule.class,
                        UpdateDrgRouteRulesResponse.Builder::items)
                .handleResponseHeaderString(
                        "opc-request-id", UpdateDrgRouteRulesResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public UpdateDrgRouteTableResponse updateDrgRouteTable(UpdateDrgRouteTableRequest request) {

        Validate.notBlank(request.getDrgRouteTableId(), "drgRouteTableId must not be blank");
        Objects.requireNonNull(
                request.getUpdateDrgRouteTableDetails(), "updateDrgRouteTableDetails is required");

        return clientCall(request, UpdateDrgRouteTableResponse::builder)
                .logger(LOG, "updateDrgRouteTable")
                .serviceDetails(
                        "VirtualNetwork",
                        "UpdateDrgRouteTable",
                        "https://docs.oracle.com/iaas/api/#/en/iaas/20160918/DrgRouteTable/UpdateDrgRouteTable")
                .method(com.oracle.bmc.http.client.Method.PUT)
                .requestBuilder(UpdateDrgRouteTableRequest::builder)
                .basePath("/20160918")
                .appendPathParam("drgRouteTables")
                .appendPathParam(request.getDrgRouteTableId())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.core.model.DrgRouteTable.class,
                        UpdateDrgRouteTableResponse.Builder::drgRouteTable)
                .handleResponseHeaderString("etag", UpdateDrgRouteTableResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", UpdateDrgRouteTableResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public UpdateIPSecConnectionResponse updateIPSecConnection(
            UpdateIPSecConnectionRequest request) {

        Validate.notBlank(request.getIpscId(), "ipscId must not be blank");
        Objects.requireNonNull(
                request.getUpdateIPSecConnectionDetails(),
                "updateIPSecConnectionDetails is required");

        return clientCall(request, UpdateIPSecConnectionResponse::builder)
                .logger(LOG, "updateIPSecConnection")
                .serviceDetails(
                        "VirtualNetwork",
                        "UpdateIPSecConnection",
                        "https://docs.oracle.com/iaas/api/#/en/iaas/20160918/IPSecConnection/UpdateIPSecConnection")
                .method(com.oracle.bmc.http.client.Method.PUT)
                .requestBuilder(UpdateIPSecConnectionRequest::builder)
                .basePath("/20160918")
                .appendPathParam("ipsecConnections")
                .appendPathParam(request.getIpscId())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.core.model.IPSecConnection.class,
                        UpdateIPSecConnectionResponse.Builder::iPSecConnection)
                .handleResponseHeaderString("etag", UpdateIPSecConnectionResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", UpdateIPSecConnectionResponse.Builder::opcRequestId)
                .operationUsesDefaultRetries()
                .callSync();
    }

    @Override
    public UpdateIPSecConnectionTunnelResponse updateIPSecConnectionTunnel(
            UpdateIPSecConnectionTunnelRequest request) {

        Validate.notBlank(request.getIpscId(), "ipscId must not be blank");

        Validate.notBlank(request.getTunnelId(), "tunnelId must not be blank");
        Objects.requireNonNull(
                request.getUpdateIPSecConnectionTunnelDetails(),
                "updateIPSecConnectionTunnelDetails is required");

        return clientCall(request, UpdateIPSecConnectionTunnelResponse::builder)
                .logger(LOG, "updateIPSecConnectionTunnel")
                .serviceDetails(
                        "VirtualNetwork",
                        "UpdateIPSecConnectionTunnel",
                        "https://docs.oracle.com/iaas/api/#/en/iaas/20160918/IPSecConnectionTunnel/UpdateIPSecConnectionTunnel")
                .method(com.oracle.bmc.http.client.Method.PUT)
                .requestBuilder(UpdateIPSecConnectionTunnelRequest::builder)
                .basePath("/20160918")
                .appendPathParam("ipsecConnections")
                .appendPathParam(request.getIpscId())
                .appendPathParam("tunnels")
                .appendPathParam(request.getTunnelId())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.core.model.IPSecConnectionTunnel.class,
                        UpdateIPSecConnectionTunnelResponse.Builder::iPSecConnectionTunnel)
                .handleResponseHeaderString(
                        "etag", UpdateIPSecConnectionTunnelResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", UpdateIPSecConnectionTunnelResponse.Builder::opcRequestId)
                .operationUsesDefaultRetries()
                .callSync();
    }

    @Override
    public UpdateIPSecConnectionTunnelSharedSecretResponse updateIPSecConnectionTunnelSharedSecret(
            UpdateIPSecConnectionTunnelSharedSecretRequest request) {

        Validate.notBlank(request.getIpscId(), "ipscId must not be blank");

        Validate.notBlank(request.getTunnelId(), "tunnelId must not be blank");
        Objects.requireNonNull(
                request.getUpdateIPSecConnectionTunnelSharedSecretDetails(),
                "updateIPSecConnectionTunnelSharedSecretDetails is required");

        return clientCall(request, UpdateIPSecConnectionTunnelSharedSecretResponse::builder)
                .logger(LOG, "updateIPSecConnectionTunnelSharedSecret")
                .serviceDetails(
                        "VirtualNetwork",
                        "UpdateIPSecConnectionTunnelSharedSecret",
                        "https://docs.oracle.com/iaas/api/#/en/iaas/20160918/IPSecConnectionTunnelSharedSecret/UpdateIPSecConnectionTunnelSharedSecret")
                .method(com.oracle.bmc.http.client.Method.PUT)
                .requestBuilder(UpdateIPSecConnectionTunnelSharedSecretRequest::builder)
                .basePath("/20160918")
                .appendPathParam("ipsecConnections")
                .appendPathParam(request.getIpscId())
                .appendPathParam("tunnels")
                .appendPathParam(request.getTunnelId())
                .appendPathParam("sharedSecret")
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.core.model.IPSecConnectionTunnelSharedSecret.class,
                        UpdateIPSecConnectionTunnelSharedSecretResponse.Builder
                                ::iPSecConnectionTunnelSharedSecret)
                .handleResponseHeaderString(
                        "etag", UpdateIPSecConnectionTunnelSharedSecretResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id",
                        UpdateIPSecConnectionTunnelSharedSecretResponse.Builder::opcRequestId)
                .operationUsesDefaultRetries()
                .callSync();
    }

    @Override
    public UpdateInternetGatewayResponse updateInternetGateway(
            UpdateInternetGatewayRequest request) {

        Validate.notBlank(request.getIgId(), "igId must not be blank");
        Objects.requireNonNull(
                request.getUpdateInternetGatewayDetails(),
                "updateInternetGatewayDetails is required");

        return clientCall(request, UpdateInternetGatewayResponse::builder)
                .logger(LOG, "updateInternetGateway")
                .serviceDetails(
                        "VirtualNetwork",
                        "UpdateInternetGateway",
                        "https://docs.oracle.com/iaas/api/#/en/iaas/20160918/InternetGateway/UpdateInternetGateway")
                .method(com.oracle.bmc.http.client.Method.PUT)
                .requestBuilder(UpdateInternetGatewayRequest::builder)
                .basePath("/20160918")
                .appendPathParam("internetGateways")
                .appendPathParam(request.getIgId())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.core.model.InternetGateway.class,
                        UpdateInternetGatewayResponse.Builder::internetGateway)
                .handleResponseHeaderString("etag", UpdateInternetGatewayResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", UpdateInternetGatewayResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public UpdateIpv6Response updateIpv6(UpdateIpv6Request request) {

        Validate.notBlank(request.getIpv6Id(), "ipv6Id must not be blank");
        Objects.requireNonNull(request.getUpdateIpv6Details(), "updateIpv6Details is required");

        return clientCall(request, UpdateIpv6Response::builder)
                .logger(LOG, "updateIpv6")
                .serviceDetails(
                        "VirtualNetwork",
                        "UpdateIpv6",
                        "https://docs.oracle.com/iaas/api/#/en/iaas/20160918/Ipv6/UpdateIpv6")
                .method(com.oracle.bmc.http.client.Method.PUT)
                .requestBuilder(UpdateIpv6Request::builder)
                .basePath("/20160918")
                .appendPathParam("ipv6")
                .appendPathParam(request.getIpv6Id())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .hasBody()
                .handleBody(com.oracle.bmc.core.model.Ipv6.class, UpdateIpv6Response.Builder::ipv6)
                .handleResponseHeaderString("etag", UpdateIpv6Response.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", UpdateIpv6Response.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public UpdateLocalPeeringGatewayResponse updateLocalPeeringGateway(
            UpdateLocalPeeringGatewayRequest request) {

        Validate.notBlank(
                request.getLocalPeeringGatewayId(), "localPeeringGatewayId must not be blank");
        Objects.requireNonNull(
                request.getUpdateLocalPeeringGatewayDetails(),
                "updateLocalPeeringGatewayDetails is required");

        return clientCall(request, UpdateLocalPeeringGatewayResponse::builder)
                .logger(LOG, "updateLocalPeeringGateway")
                .serviceDetails(
                        "VirtualNetwork",
                        "UpdateLocalPeeringGateway",
                        "https://docs.oracle.com/iaas/api/#/en/iaas/20160918/LocalPeeringGateway/UpdateLocalPeeringGateway")
                .method(com.oracle.bmc.http.client.Method.PUT)
                .requestBuilder(UpdateLocalPeeringGatewayRequest::builder)
                .basePath("/20160918")
                .appendPathParam("localPeeringGateways")
                .appendPathParam(request.getLocalPeeringGatewayId())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.core.model.LocalPeeringGateway.class,
                        UpdateLocalPeeringGatewayResponse.Builder::localPeeringGateway)
                .handleResponseHeaderString("etag", UpdateLocalPeeringGatewayResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", UpdateLocalPeeringGatewayResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public UpdateNatGatewayResponse updateNatGateway(UpdateNatGatewayRequest request) {

        Validate.notBlank(request.getNatGatewayId(), "natGatewayId must not be blank");
        Objects.requireNonNull(
                request.getUpdateNatGatewayDetails(), "updateNatGatewayDetails is required");

        return clientCall(request, UpdateNatGatewayResponse::builder)
                .logger(LOG, "updateNatGateway")
                .serviceDetails(
                        "VirtualNetwork",
                        "UpdateNatGateway",
                        "https://docs.oracle.com/iaas/api/#/en/iaas/20160918/NatGateway/UpdateNatGateway")
                .method(com.oracle.bmc.http.client.Method.PUT)
                .requestBuilder(UpdateNatGatewayRequest::builder)
                .basePath("/20160918")
                .appendPathParam("natGateways")
                .appendPathParam(request.getNatGatewayId())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.core.model.NatGateway.class,
                        UpdateNatGatewayResponse.Builder::natGateway)
                .handleResponseHeaderString("etag", UpdateNatGatewayResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", UpdateNatGatewayResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public UpdateNetworkSecurityGroupResponse updateNetworkSecurityGroup(
            UpdateNetworkSecurityGroupRequest request) {

        Validate.notBlank(
                request.getNetworkSecurityGroupId(), "networkSecurityGroupId must not be blank");
        Objects.requireNonNull(
                request.getUpdateNetworkSecurityGroupDetails(),
                "updateNetworkSecurityGroupDetails is required");

        return clientCall(request, UpdateNetworkSecurityGroupResponse::builder)
                .logger(LOG, "updateNetworkSecurityGroup")
                .serviceDetails(
                        "VirtualNetwork",
                        "UpdateNetworkSecurityGroup",
                        "https://docs.oracle.com/iaas/api/#/en/iaas/20160918/NetworkSecurityGroup/UpdateNetworkSecurityGroup")
                .method(com.oracle.bmc.http.client.Method.PUT)
                .requestBuilder(UpdateNetworkSecurityGroupRequest::builder)
                .basePath("/20160918")
                .appendPathParam("networkSecurityGroups")
                .appendPathParam(request.getNetworkSecurityGroupId())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.core.model.NetworkSecurityGroup.class,
                        UpdateNetworkSecurityGroupResponse.Builder::networkSecurityGroup)
                .handleResponseHeaderString(
                        "etag", UpdateNetworkSecurityGroupResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", UpdateNetworkSecurityGroupResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public UpdateNetworkSecurityGroupSecurityRulesResponse updateNetworkSecurityGroupSecurityRules(
            UpdateNetworkSecurityGroupSecurityRulesRequest request) {

        Validate.notBlank(
                request.getNetworkSecurityGroupId(), "networkSecurityGroupId must not be blank");
        Objects.requireNonNull(
                request.getUpdateNetworkSecurityGroupSecurityRulesDetails(),
                "updateNetworkSecurityGroupSecurityRulesDetails is required");

        return clientCall(request, UpdateNetworkSecurityGroupSecurityRulesResponse::builder)
                .logger(LOG, "updateNetworkSecurityGroupSecurityRules")
                .serviceDetails(
                        "VirtualNetwork",
                        "UpdateNetworkSecurityGroupSecurityRules",
                        "https://docs.oracle.com/iaas/api/#/en/iaas/20160918/SecurityRule/UpdateNetworkSecurityGroupSecurityRules")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(UpdateNetworkSecurityGroupSecurityRulesRequest::builder)
                .basePath("/20160918")
                .appendPathParam("networkSecurityGroups")
                .appendPathParam(request.getNetworkSecurityGroupId())
                .appendPathParam("actions")
                .appendPathParam("updateSecurityRules")
                .accept("application/json")
                .hasBody()
                .handleBody(
                        com.oracle.bmc.core.model.UpdatedNetworkSecurityGroupSecurityRules.class,
                        UpdateNetworkSecurityGroupSecurityRulesResponse.Builder
                                ::updatedNetworkSecurityGroupSecurityRules)
                .handleResponseHeaderString(
                        "opc-request-id",
                        UpdateNetworkSecurityGroupSecurityRulesResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public UpdatePrivateIpResponse updatePrivateIp(UpdatePrivateIpRequest request) {

        Validate.notBlank(request.getPrivateIpId(), "privateIpId must not be blank");
        Objects.requireNonNull(
                request.getUpdatePrivateIpDetails(), "updatePrivateIpDetails is required");

        return clientCall(request, UpdatePrivateIpResponse::builder)
                .logger(LOG, "updatePrivateIp")
                .serviceDetails(
                        "VirtualNetwork",
                        "UpdatePrivateIp",
                        "https://docs.oracle.com/iaas/api/#/en/iaas/20160918/PrivateIp/UpdatePrivateIp")
                .method(com.oracle.bmc.http.client.Method.PUT)
                .requestBuilder(UpdatePrivateIpRequest::builder)
                .basePath("/20160918")
                .appendPathParam("privateIps")
                .appendPathParam(request.getPrivateIpId())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.core.model.PrivateIp.class,
                        UpdatePrivateIpResponse.Builder::privateIp)
                .handleResponseHeaderString("etag", UpdatePrivateIpResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", UpdatePrivateIpResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public UpdatePublicIpResponse updatePublicIp(UpdatePublicIpRequest request) {

        Validate.notBlank(request.getPublicIpId(), "publicIpId must not be blank");
        Objects.requireNonNull(
                request.getUpdatePublicIpDetails(), "updatePublicIpDetails is required");

        return clientCall(request, UpdatePublicIpResponse::builder)
                .logger(LOG, "updatePublicIp")
                .serviceDetails(
                        "VirtualNetwork",
                        "UpdatePublicIp",
                        "https://docs.oracle.com/iaas/api/#/en/iaas/20160918/PublicIp/UpdatePublicIp")
                .method(com.oracle.bmc.http.client.Method.PUT)
                .requestBuilder(UpdatePublicIpRequest::builder)
                .basePath("/20160918")
                .appendPathParam("publicIps")
                .appendPathParam(request.getPublicIpId())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.core.model.PublicIp.class,
                        UpdatePublicIpResponse.Builder::publicIp)
                .handleResponseHeaderString("etag", UpdatePublicIpResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", UpdatePublicIpResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public UpdatePublicIpPoolResponse updatePublicIpPool(UpdatePublicIpPoolRequest request) {

        Validate.notBlank(request.getPublicIpPoolId(), "publicIpPoolId must not be blank");
        Objects.requireNonNull(
                request.getUpdatePublicIpPoolDetails(), "updatePublicIpPoolDetails is required");

        return clientCall(request, UpdatePublicIpPoolResponse::builder)
                .logger(LOG, "updatePublicIpPool")
                .serviceDetails(
                        "VirtualNetwork",
                        "UpdatePublicIpPool",
                        "https://docs.oracle.com/iaas/api/#/en/iaas/20160918/PublicIpPool/UpdatePublicIpPool")
                .method(com.oracle.bmc.http.client.Method.PUT)
                .requestBuilder(UpdatePublicIpPoolRequest::builder)
                .basePath("/20160918")
                .appendPathParam("publicIpPools")
                .appendPathParam(request.getPublicIpPoolId())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("if-match", request.getIfMatch())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.core.model.PublicIpPool.class,
                        UpdatePublicIpPoolResponse.Builder::publicIpPool)
                .handleResponseHeaderString("etag", UpdatePublicIpPoolResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", UpdatePublicIpPoolResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public UpdateRemotePeeringConnectionResponse updateRemotePeeringConnection(
            UpdateRemotePeeringConnectionRequest request) {

        Validate.notBlank(
                request.getRemotePeeringConnectionId(),
                "remotePeeringConnectionId must not be blank");
        Objects.requireNonNull(
                request.getUpdateRemotePeeringConnectionDetails(),
                "updateRemotePeeringConnectionDetails is required");

        return clientCall(request, UpdateRemotePeeringConnectionResponse::builder)
                .logger(LOG, "updateRemotePeeringConnection")
                .serviceDetails(
                        "VirtualNetwork",
                        "UpdateRemotePeeringConnection",
                        "https://docs.oracle.com/iaas/api/#/en/iaas/20160918/RemotePeeringConnection/UpdateRemotePeeringConnection")
                .method(com.oracle.bmc.http.client.Method.PUT)
                .requestBuilder(UpdateRemotePeeringConnectionRequest::builder)
                .basePath("/20160918")
                .appendPathParam("remotePeeringConnections")
                .appendPathParam(request.getRemotePeeringConnectionId())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.core.model.RemotePeeringConnection.class,
                        UpdateRemotePeeringConnectionResponse.Builder::remotePeeringConnection)
                .handleResponseHeaderString(
                        "etag", UpdateRemotePeeringConnectionResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id",
                        UpdateRemotePeeringConnectionResponse.Builder::opcRequestId)
                .operationUsesDefaultRetries()
                .callSync();
    }

    @Override
    public UpdateRouteTableResponse updateRouteTable(UpdateRouteTableRequest request) {

        Validate.notBlank(request.getRtId(), "rtId must not be blank");
        Objects.requireNonNull(
                request.getUpdateRouteTableDetails(), "updateRouteTableDetails is required");

        return clientCall(request, UpdateRouteTableResponse::builder)
                .logger(LOG, "updateRouteTable")
                .serviceDetails(
                        "VirtualNetwork",
                        "UpdateRouteTable",
                        "https://docs.oracle.com/iaas/api/#/en/iaas/20160918/RouteTable/UpdateRouteTable")
                .method(com.oracle.bmc.http.client.Method.PUT)
                .requestBuilder(UpdateRouteTableRequest::builder)
                .basePath("/20160918")
                .appendPathParam("routeTables")
                .appendPathParam(request.getRtId())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.core.model.RouteTable.class,
                        UpdateRouteTableResponse.Builder::routeTable)
                .handleResponseHeaderString("etag", UpdateRouteTableResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", UpdateRouteTableResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public UpdateSecurityListResponse updateSecurityList(UpdateSecurityListRequest request) {

        Validate.notBlank(request.getSecurityListId(), "securityListId must not be blank");
        Objects.requireNonNull(
                request.getUpdateSecurityListDetails(), "updateSecurityListDetails is required");

        return clientCall(request, UpdateSecurityListResponse::builder)
                .logger(LOG, "updateSecurityList")
                .serviceDetails(
                        "VirtualNetwork",
                        "UpdateSecurityList",
                        "https://docs.oracle.com/iaas/api/#/en/iaas/20160918/SecurityList/UpdateSecurityList")
                .method(com.oracle.bmc.http.client.Method.PUT)
                .requestBuilder(UpdateSecurityListRequest::builder)
                .basePath("/20160918")
                .appendPathParam("securityLists")
                .appendPathParam(request.getSecurityListId())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.core.model.SecurityList.class,
                        UpdateSecurityListResponse.Builder::securityList)
                .handleResponseHeaderString("etag", UpdateSecurityListResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", UpdateSecurityListResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public UpdateServiceGatewayResponse updateServiceGateway(UpdateServiceGatewayRequest request) {

        Validate.notBlank(request.getServiceGatewayId(), "serviceGatewayId must not be blank");
        Objects.requireNonNull(
                request.getUpdateServiceGatewayDetails(),
                "updateServiceGatewayDetails is required");

        return clientCall(request, UpdateServiceGatewayResponse::builder)
                .logger(LOG, "updateServiceGateway")
                .serviceDetails(
                        "VirtualNetwork",
                        "UpdateServiceGateway",
                        "https://docs.oracle.com/iaas/api/#/en/iaas/20160918/ServiceGateway/UpdateServiceGateway")
                .method(com.oracle.bmc.http.client.Method.PUT)
                .requestBuilder(UpdateServiceGatewayRequest::builder)
                .basePath("/20160918")
                .appendPathParam("serviceGateways")
                .appendPathParam(request.getServiceGatewayId())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.core.model.ServiceGateway.class,
                        UpdateServiceGatewayResponse.Builder::serviceGateway)
                .handleResponseHeaderString("etag", UpdateServiceGatewayResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", UpdateServiceGatewayResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public UpdateSubnetResponse updateSubnet(UpdateSubnetRequest request) {

        Validate.notBlank(request.getSubnetId(), "subnetId must not be blank");
        Objects.requireNonNull(request.getUpdateSubnetDetails(), "updateSubnetDetails is required");

        return clientCall(request, UpdateSubnetResponse::builder)
                .logger(LOG, "updateSubnet")
                .serviceDetails(
                        "VirtualNetwork",
                        "UpdateSubnet",
                        "https://docs.oracle.com/iaas/api/#/en/iaas/20160918/Subnet/UpdateSubnet")
                .method(com.oracle.bmc.http.client.Method.PUT)
                .requestBuilder(UpdateSubnetRequest::builder)
                .basePath("/20160918")
                .appendPathParam("subnets")
                .appendPathParam(request.getSubnetId())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.core.model.Subnet.class,
                        UpdateSubnetResponse.Builder::subnet)
                .handleResponseHeaderString("etag", UpdateSubnetResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", UpdateSubnetResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public UpdateTunnelCpeDeviceConfigResponse updateTunnelCpeDeviceConfig(
            UpdateTunnelCpeDeviceConfigRequest request) {

        Validate.notBlank(request.getIpscId(), "ipscId must not be blank");

        Validate.notBlank(request.getTunnelId(), "tunnelId must not be blank");
        Objects.requireNonNull(
                request.getUpdateTunnelCpeDeviceConfigDetails(),
                "updateTunnelCpeDeviceConfigDetails is required");

        return clientCall(request, UpdateTunnelCpeDeviceConfigResponse::builder)
                .logger(LOG, "updateTunnelCpeDeviceConfig")
                .serviceDetails(
                        "VirtualNetwork",
                        "UpdateTunnelCpeDeviceConfig",
                        "https://docs.oracle.com/iaas/api/#/en/iaas/20160918/TunnelCpeDeviceConfig/UpdateTunnelCpeDeviceConfig")
                .method(com.oracle.bmc.http.client.Method.PUT)
                .requestBuilder(UpdateTunnelCpeDeviceConfigRequest::builder)
                .basePath("/20160918")
                .appendPathParam("ipsecConnections")
                .appendPathParam(request.getIpscId())
                .appendPathParam("tunnels")
                .appendPathParam(request.getTunnelId())
                .appendPathParam("tunnelDeviceConfig")
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.core.model.TunnelCpeDeviceConfig.class,
                        UpdateTunnelCpeDeviceConfigResponse.Builder::tunnelCpeDeviceConfig)
                .handleResponseHeaderString(
                        "etag", UpdateTunnelCpeDeviceConfigResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", UpdateTunnelCpeDeviceConfigResponse.Builder::opcRequestId)
                .operationUsesDefaultRetries()
                .callSync();
    }

    @Override
    public UpdateVcnResponse updateVcn(UpdateVcnRequest request) {

        Validate.notBlank(request.getVcnId(), "vcnId must not be blank");
        Objects.requireNonNull(request.getUpdateVcnDetails(), "updateVcnDetails is required");

        return clientCall(request, UpdateVcnResponse::builder)
                .logger(LOG, "updateVcn")
                .serviceDetails(
                        "VirtualNetwork",
                        "UpdateVcn",
                        "https://docs.oracle.com/iaas/api/#/en/iaas/20160918/Vcn/UpdateVcn")
                .method(com.oracle.bmc.http.client.Method.PUT)
                .requestBuilder(UpdateVcnRequest::builder)
                .basePath("/20160918")
                .appendPathParam("vcns")
                .appendPathParam(request.getVcnId())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .hasBody()
                .handleBody(com.oracle.bmc.core.model.Vcn.class, UpdateVcnResponse.Builder::vcn)
                .handleResponseHeaderString("etag", UpdateVcnResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", UpdateVcnResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public UpdateVirtualCircuitResponse updateVirtualCircuit(UpdateVirtualCircuitRequest request) {

        Validate.notBlank(request.getVirtualCircuitId(), "virtualCircuitId must not be blank");
        Objects.requireNonNull(
                request.getUpdateVirtualCircuitDetails(),
                "updateVirtualCircuitDetails is required");

        return clientCall(request, UpdateVirtualCircuitResponse::builder)
                .logger(LOG, "updateVirtualCircuit")
                .serviceDetails(
                        "VirtualNetwork",
                        "UpdateVirtualCircuit",
                        "https://docs.oracle.com/iaas/api/#/en/iaas/20160918/VirtualCircuit/UpdateVirtualCircuit")
                .method(com.oracle.bmc.http.client.Method.PUT)
                .requestBuilder(UpdateVirtualCircuitRequest::builder)
                .basePath("/20160918")
                .appendPathParam("virtualCircuits")
                .appendPathParam(request.getVirtualCircuitId())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.core.model.VirtualCircuit.class,
                        UpdateVirtualCircuitResponse.Builder::virtualCircuit)
                .handleResponseHeaderString("etag", UpdateVirtualCircuitResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", UpdateVirtualCircuitResponse.Builder::opcRequestId)
                .operationUsesDefaultRetries()
                .callSync();
    }

    @Override
    public UpdateVlanResponse updateVlan(UpdateVlanRequest request) {

        Validate.notBlank(request.getVlanId(), "vlanId must not be blank");
        Objects.requireNonNull(request.getUpdateVlanDetails(), "updateVlanDetails is required");

        return clientCall(request, UpdateVlanResponse::builder)
                .logger(LOG, "updateVlan")
                .serviceDetails(
                        "VirtualNetwork",
                        "UpdateVlan",
                        "https://docs.oracle.com/iaas/api/#/en/iaas/20160918/Vlan/UpdateVlan")
                .method(com.oracle.bmc.http.client.Method.PUT)
                .requestBuilder(UpdateVlanRequest::builder)
                .basePath("/20160918")
                .appendPathParam("vlans")
                .appendPathParam(request.getVlanId())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .hasBody()
                .handleBody(com.oracle.bmc.core.model.Vlan.class, UpdateVlanResponse.Builder::vlan)
                .handleResponseHeaderString("etag", UpdateVlanResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", UpdateVlanResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public UpdateVnicResponse updateVnic(UpdateVnicRequest request) {

        Validate.notBlank(request.getVnicId(), "vnicId must not be blank");
        Objects.requireNonNull(request.getUpdateVnicDetails(), "updateVnicDetails is required");

        return clientCall(request, UpdateVnicResponse::builder)
                .logger(LOG, "updateVnic")
                .serviceDetails(
                        "VirtualNetwork",
                        "UpdateVnic",
                        "https://docs.oracle.com/iaas/api/#/en/iaas/20160918/Vnic/UpdateVnic")
                .method(com.oracle.bmc.http.client.Method.PUT)
                .requestBuilder(UpdateVnicRequest::builder)
                .basePath("/20160918")
                .appendPathParam("vnics")
                .appendPathParam(request.getVnicId())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .hasBody()
                .handleBody(com.oracle.bmc.core.model.Vnic.class, UpdateVnicResponse.Builder::vnic)
                .handleResponseHeaderString("etag", UpdateVnicResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", UpdateVnicResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public UpdateVtapResponse updateVtap(UpdateVtapRequest request) {

        Validate.notBlank(request.getVtapId(), "vtapId must not be blank");
        Objects.requireNonNull(request.getUpdateVtapDetails(), "updateVtapDetails is required");

        return clientCall(request, UpdateVtapResponse::builder)
                .logger(LOG, "updateVtap")
                .serviceDetails("VirtualNetwork", "UpdateVtap", "")
                .method(com.oracle.bmc.http.client.Method.PUT)
                .requestBuilder(UpdateVtapRequest::builder)
                .basePath("/20160918")
                .appendPathParam("vtaps")
                .appendPathParam(request.getVtapId())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .hasBody()
                .handleBody(com.oracle.bmc.core.model.Vtap.class, UpdateVtapResponse.Builder::vtap)
                .handleResponseHeaderString("etag", UpdateVtapResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", UpdateVtapResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-work-request-id", UpdateVtapResponse.Builder::opcWorkRequestId)
                .callSync();
    }

    @Override
    public UpgradeDrgResponse upgradeDrg(UpgradeDrgRequest request) {

        Validate.notBlank(request.getDrgId(), "drgId must not be blank");

        return clientCall(request, UpgradeDrgResponse::builder)
                .logger(LOG, "upgradeDrg")
                .serviceDetails(
                        "VirtualNetwork",
                        "UpgradeDrg",
                        "https://docs.oracle.com/iaas/api/#/en/iaas/20160918/Drg/UpgradeDrg")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(UpgradeDrgRequest::builder)
                .basePath("/20160918")
                .appendPathParam("drgs")
                .appendPathParam(request.getDrgId())
                .appendPathParam("actions")
                .appendPathParam("upgrade")
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .handleResponseHeaderString(
                        "opc-request-id", UpgradeDrgResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-work-request-id", UpgradeDrgResponse.Builder::opcWorkRequestId)
                .callSync();
    }

    @Override
    public ValidateByoipRangeResponse validateByoipRange(ValidateByoipRangeRequest request) {

        Validate.notBlank(request.getByoipRangeId(), "byoipRangeId must not be blank");

        return clientCall(request, ValidateByoipRangeResponse::builder)
                .logger(LOG, "validateByoipRange")
                .serviceDetails(
                        "VirtualNetwork",
                        "ValidateByoipRange",
                        "https://docs.oracle.com/iaas/api/#/en/iaas/20160918/ByoipRange/ValidateByoipRange")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(ValidateByoipRangeRequest::builder)
                .basePath("/20160918")
                .appendPathParam("byoipRanges")
                .appendPathParam(request.getByoipRangeId())
                .appendPathParam("actions")
                .appendPathParam("validate")
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleResponseHeaderString(
                        "opc-request-id", ValidateByoipRangeResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-work-request-id", ValidateByoipRangeResponse.Builder::opcWorkRequestId)
                .callSync();
    }

    @Override
    public WithdrawByoipRangeResponse withdrawByoipRange(WithdrawByoipRangeRequest request) {

        Validate.notBlank(request.getByoipRangeId(), "byoipRangeId must not be blank");

        return clientCall(request, WithdrawByoipRangeResponse::builder)
                .logger(LOG, "withdrawByoipRange")
                .serviceDetails(
                        "VirtualNetwork",
                        "WithdrawByoipRange",
                        "https://docs.oracle.com/iaas/api/#/en/iaas/20160918/ByoipRange/WithdrawByoipRange")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(WithdrawByoipRangeRequest::builder)
                .basePath("/20160918")
                .appendPathParam("byoipRanges")
                .appendPathParam(request.getByoipRangeId())
                .appendPathParam("actions")
                .appendPathParam("withdraw")
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleResponseHeaderString(
                        "opc-request-id", WithdrawByoipRangeResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public VirtualNetworkWaiters getWaiters() {
        return waiters;
    }

    @Override
    public VirtualNetworkWaiters newWaiters(
            com.oracle.bmc.workrequests.WorkRequest workRequestClient) {
        return new VirtualNetworkWaiters(executorService, this, workRequestClient);
    }

    @Override
    public VirtualNetworkPaginators getPaginators() {
        return paginators;
    }

    /**
     * Create a new client instance.
     *
     * @param authenticationDetailsProvider The authentication details (see {@link Builder#build})
     * @deprecated Use the {@link #builder() builder} instead.
     */
    @Deprecated
    public VirtualNetworkClient(
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
    public VirtualNetworkClient(
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
    public VirtualNetworkClient(
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
    public VirtualNetworkClient(
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
    public VirtualNetworkClient(
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
    public VirtualNetworkClient(
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
    public VirtualNetworkClient(
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
    public VirtualNetworkClient(
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
