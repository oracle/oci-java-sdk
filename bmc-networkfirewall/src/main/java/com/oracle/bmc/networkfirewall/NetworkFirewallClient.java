/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.networkfirewall;

import com.oracle.bmc.util.internal.Validate;
import com.oracle.bmc.networkfirewall.requests.*;
import com.oracle.bmc.networkfirewall.responses.*;
import com.oracle.bmc.circuitbreaker.CircuitBreakerConfiguration;
import com.oracle.bmc.util.CircuitBreakerUtils;

import java.util.Objects;

@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20230501")
public class NetworkFirewallClient extends com.oracle.bmc.http.internal.BaseSyncClient
        implements NetworkFirewall {
    /** Service instance for NetworkFirewall. */
    public static final com.oracle.bmc.Service SERVICE =
            com.oracle.bmc.Services.serviceBuilder()
                    .serviceName("NETWORKFIREWALL")
                    .serviceEndpointPrefix("")
                    .serviceEndpointTemplate(
                            "https://network-firewall.{region}.ocs.{secondLevelDomain}")
                    .build();

    private static final org.slf4j.Logger LOG =
            org.slf4j.LoggerFactory.getLogger(NetworkFirewallClient.class);

    private final NetworkFirewallWaiters waiters;

    private final NetworkFirewallPaginators paginators;

    NetworkFirewallClient(
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
                                    .nameFormat("NetworkFirewall-waiters-%d")
                                    .build());
            threadPoolExecutor.allowCoreThreadTimeOut(true);

            executorService = threadPoolExecutor;
        }
        this.waiters = new NetworkFirewallWaiters(executorService, this);

        this.paginators = new NetworkFirewallPaginators(this);
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
            extends com.oracle.bmc.common.RegionalClientBuilder<Builder, NetworkFirewallClient> {
        private java.util.concurrent.ExecutorService executorService;

        private Builder(com.oracle.bmc.Service service) {
            super(service);
            final String packageName = "networkfirewall";
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
        public NetworkFirewallClient build(
                @jakarta.annotation.Nonnull
                        com.oracle.bmc.auth.AbstractAuthenticationDetailsProvider
                                authenticationDetailsProvider) {
            return new NetworkFirewallClient(this, authenticationDetailsProvider, executorService);
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
    public ApplyNetworkFirewallPolicyResponse applyNetworkFirewallPolicy(
            ApplyNetworkFirewallPolicyRequest request) {

        Validate.notBlank(
                request.getNetworkFirewallPolicyId(), "networkFirewallPolicyId must not be blank");
        Objects.requireNonNull(
                request.getApplyNetworkFirewallPolicyDetails(),
                "applyNetworkFirewallPolicyDetails is required");

        return clientCall(request, ApplyNetworkFirewallPolicyResponse::builder)
                .logger(LOG, "applyNetworkFirewallPolicy")
                .serviceDetails(
                        "NetworkFirewall",
                        "ApplyNetworkFirewallPolicy",
                        "https://docs.oracle.com/iaas/api/#/en/network-firewall/20230501/NetworkFirewallPolicy/ApplyNetworkFirewallPolicy")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(ApplyNetworkFirewallPolicyRequest::builder)
                .basePath("/20230501")
                .appendPathParam("networkFirewallPolicies")
                .appendPathParam(request.getNetworkFirewallPolicyId())
                .appendPathParam("actions")
                .appendPathParam("applyPolicy")
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.networkfirewall.model.NetworkFirewallPolicy.class,
                        ApplyNetworkFirewallPolicyResponse.Builder::networkFirewallPolicy)
                .handleResponseHeaderString(
                        "etag", ApplyNetworkFirewallPolicyResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        ApplyNetworkFirewallPolicyResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", ApplyNetworkFirewallPolicyResponse.Builder::opcRequestId)
                .operationUsesDefaultRetries()
                .callSync();
    }

    @Override
    public BulkUploadAddressListsResponse bulkUploadAddressLists(
            BulkUploadAddressListsRequest request) {

        Validate.notBlank(
                request.getNetworkFirewallPolicyId(), "networkFirewallPolicyId must not be blank");
        Objects.requireNonNull(
                request.getBulkUploadAddressListsDetails(),
                "bulkUploadAddressListsDetails is required");

        return clientCall(request, BulkUploadAddressListsResponse::builder)
                .logger(LOG, "bulkUploadAddressLists")
                .serviceDetails(
                        "NetworkFirewall",
                        "BulkUploadAddressLists",
                        "https://docs.oracle.com/iaas/api/#/en/network-firewall/20230501/AddressList/BulkUploadAddressLists")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(BulkUploadAddressListsRequest::builder)
                .basePath("/20230501")
                .appendPathParam("networkFirewallPolicies")
                .appendPathParam(request.getNetworkFirewallPolicyId())
                .appendPathParam("addressLists")
                .appendPathParam("actions")
                .appendPathParam("bulkUpload")
                .accept("application/json")
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("if-match", request.getIfMatch())
                .hasBinaryRequestBody()
                .hasBody()
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        BulkUploadAddressListsResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", BulkUploadAddressListsResponse.Builder::opcRequestId)
                .operationUsesDefaultRetries()
                .callSync();
    }

    @Override
    public BulkUploadApplicationGroupsResponse bulkUploadApplicationGroups(
            BulkUploadApplicationGroupsRequest request) {

        Validate.notBlank(
                request.getNetworkFirewallPolicyId(), "networkFirewallPolicyId must not be blank");
        Objects.requireNonNull(
                request.getBulkUploadApplicationGroupsDetails(),
                "bulkUploadApplicationGroupsDetails is required");

        return clientCall(request, BulkUploadApplicationGroupsResponse::builder)
                .logger(LOG, "bulkUploadApplicationGroups")
                .serviceDetails(
                        "NetworkFirewall",
                        "BulkUploadApplicationGroups",
                        "https://docs.oracle.com/iaas/api/#/en/network-firewall/20230501/ApplicationGroup/BulkUploadApplicationGroups")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(BulkUploadApplicationGroupsRequest::builder)
                .basePath("/20230501")
                .appendPathParam("networkFirewallPolicies")
                .appendPathParam(request.getNetworkFirewallPolicyId())
                .appendPathParam("applicationGroups")
                .appendPathParam("actions")
                .appendPathParam("bulkUpload")
                .accept("application/json")
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("if-match", request.getIfMatch())
                .hasBinaryRequestBody()
                .hasBody()
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        BulkUploadApplicationGroupsResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", BulkUploadApplicationGroupsResponse.Builder::opcRequestId)
                .operationUsesDefaultRetries()
                .callSync();
    }

    @Override
    public BulkUploadApplicationsResponse bulkUploadApplications(
            BulkUploadApplicationsRequest request) {

        Validate.notBlank(
                request.getNetworkFirewallPolicyId(), "networkFirewallPolicyId must not be blank");
        Objects.requireNonNull(
                request.getBulkUploadApplicationsDetails(),
                "bulkUploadApplicationsDetails is required");

        return clientCall(request, BulkUploadApplicationsResponse::builder)
                .logger(LOG, "bulkUploadApplications")
                .serviceDetails(
                        "NetworkFirewall",
                        "BulkUploadApplications",
                        "https://docs.oracle.com/iaas/api/#/en/network-firewall/20230501/Application/BulkUploadApplications")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(BulkUploadApplicationsRequest::builder)
                .basePath("/20230501")
                .appendPathParam("networkFirewallPolicies")
                .appendPathParam(request.getNetworkFirewallPolicyId())
                .appendPathParam("applications")
                .appendPathParam("actions")
                .appendPathParam("bulkUpload")
                .accept("application/json")
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("if-match", request.getIfMatch())
                .hasBinaryRequestBody()
                .hasBody()
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        BulkUploadApplicationsResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", BulkUploadApplicationsResponse.Builder::opcRequestId)
                .operationUsesDefaultRetries()
                .callSync();
    }

    @Override
    public BulkUploadDecryptionProfilesResponse bulkUploadDecryptionProfiles(
            BulkUploadDecryptionProfilesRequest request) {

        Validate.notBlank(
                request.getNetworkFirewallPolicyId(), "networkFirewallPolicyId must not be blank");
        Objects.requireNonNull(
                request.getBulkUploadDecryptionProfilesDetails(),
                "bulkUploadDecryptionProfilesDetails is required");

        return clientCall(request, BulkUploadDecryptionProfilesResponse::builder)
                .logger(LOG, "bulkUploadDecryptionProfiles")
                .serviceDetails(
                        "NetworkFirewall",
                        "BulkUploadDecryptionProfiles",
                        "https://docs.oracle.com/iaas/api/#/en/network-firewall/20230501/DecryptionProfile/BulkUploadDecryptionProfiles")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(BulkUploadDecryptionProfilesRequest::builder)
                .basePath("/20230501")
                .appendPathParam("networkFirewallPolicies")
                .appendPathParam(request.getNetworkFirewallPolicyId())
                .appendPathParam("decryptionProfiles")
                .appendPathParam("actions")
                .appendPathParam("bulkUpload")
                .accept("application/json")
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("if-match", request.getIfMatch())
                .hasBinaryRequestBody()
                .hasBody()
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        BulkUploadDecryptionProfilesResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id",
                        BulkUploadDecryptionProfilesResponse.Builder::opcRequestId)
                .operationUsesDefaultRetries()
                .callSync();
    }

    @Override
    public BulkUploadDecryptionRulesResponse bulkUploadDecryptionRules(
            BulkUploadDecryptionRulesRequest request) {

        Validate.notBlank(
                request.getNetworkFirewallPolicyId(), "networkFirewallPolicyId must not be blank");
        Objects.requireNonNull(
                request.getBulkUploadDecryptionRulesDetails(),
                "bulkUploadDecryptionRulesDetails is required");

        return clientCall(request, BulkUploadDecryptionRulesResponse::builder)
                .logger(LOG, "bulkUploadDecryptionRules")
                .serviceDetails(
                        "NetworkFirewall",
                        "BulkUploadDecryptionRules",
                        "https://docs.oracle.com/iaas/api/#/en/network-firewall/20230501/DecryptionRule/BulkUploadDecryptionRules")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(BulkUploadDecryptionRulesRequest::builder)
                .basePath("/20230501")
                .appendPathParam("networkFirewallPolicies")
                .appendPathParam(request.getNetworkFirewallPolicyId())
                .appendPathParam("decryptionRules")
                .appendPathParam("actions")
                .appendPathParam("bulkUpload")
                .accept("application/json")
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("if-match", request.getIfMatch())
                .hasBinaryRequestBody()
                .hasBody()
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        BulkUploadDecryptionRulesResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", BulkUploadDecryptionRulesResponse.Builder::opcRequestId)
                .operationUsesDefaultRetries()
                .callSync();
    }

    @Override
    public BulkUploadMappedSecretsResponse bulkUploadMappedSecrets(
            BulkUploadMappedSecretsRequest request) {

        Validate.notBlank(
                request.getNetworkFirewallPolicyId(), "networkFirewallPolicyId must not be blank");
        Objects.requireNonNull(
                request.getBulkUploadMappedSecretsDetails(),
                "bulkUploadMappedSecretsDetails is required");

        return clientCall(request, BulkUploadMappedSecretsResponse::builder)
                .logger(LOG, "bulkUploadMappedSecrets")
                .serviceDetails(
                        "NetworkFirewall",
                        "BulkUploadMappedSecrets",
                        "https://docs.oracle.com/iaas/api/#/en/network-firewall/20230501/MappedSecret/BulkUploadMappedSecrets")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(BulkUploadMappedSecretsRequest::builder)
                .basePath("/20230501")
                .appendPathParam("networkFirewallPolicies")
                .appendPathParam(request.getNetworkFirewallPolicyId())
                .appendPathParam("mappedSecrets")
                .appendPathParam("actions")
                .appendPathParam("bulkUpload")
                .accept("application/json")
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("if-match", request.getIfMatch())
                .hasBinaryRequestBody()
                .hasBody()
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        BulkUploadMappedSecretsResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", BulkUploadMappedSecretsResponse.Builder::opcRequestId)
                .operationUsesDefaultRetries()
                .callSync();
    }

    @Override
    public BulkUploadSecurityRulesResponse bulkUploadSecurityRules(
            BulkUploadSecurityRulesRequest request) {

        Validate.notBlank(
                request.getNetworkFirewallPolicyId(), "networkFirewallPolicyId must not be blank");
        Objects.requireNonNull(
                request.getBulkUploadSecurityRulesDetails(),
                "bulkUploadSecurityRulesDetails is required");

        return clientCall(request, BulkUploadSecurityRulesResponse::builder)
                .logger(LOG, "bulkUploadSecurityRules")
                .serviceDetails(
                        "NetworkFirewall",
                        "BulkUploadSecurityRules",
                        "https://docs.oracle.com/iaas/api/#/en/network-firewall/20230501/SecurityRule/BulkUploadSecurityRules")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(BulkUploadSecurityRulesRequest::builder)
                .basePath("/20230501")
                .appendPathParam("networkFirewallPolicies")
                .appendPathParam(request.getNetworkFirewallPolicyId())
                .appendPathParam("securityRules")
                .appendPathParam("actions")
                .appendPathParam("bulkUpload")
                .accept("application/json")
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("if-match", request.getIfMatch())
                .hasBinaryRequestBody()
                .hasBody()
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        BulkUploadSecurityRulesResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", BulkUploadSecurityRulesResponse.Builder::opcRequestId)
                .operationUsesDefaultRetries()
                .callSync();
    }

    @Override
    public BulkUploadServiceListsResponse bulkUploadServiceLists(
            BulkUploadServiceListsRequest request) {

        Validate.notBlank(
                request.getNetworkFirewallPolicyId(), "networkFirewallPolicyId must not be blank");
        Objects.requireNonNull(
                request.getBulkUploadServiceListsDetails(),
                "bulkUploadServiceListsDetails is required");

        return clientCall(request, BulkUploadServiceListsResponse::builder)
                .logger(LOG, "bulkUploadServiceLists")
                .serviceDetails(
                        "NetworkFirewall",
                        "BulkUploadServiceLists",
                        "https://docs.oracle.com/iaas/api/#/en/network-firewall/20230501/ServiceList/BulkUploadServiceLists")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(BulkUploadServiceListsRequest::builder)
                .basePath("/20230501")
                .appendPathParam("networkFirewallPolicies")
                .appendPathParam(request.getNetworkFirewallPolicyId())
                .appendPathParam("serviceLists")
                .appendPathParam("actions")
                .appendPathParam("bulkUpload")
                .accept("application/json")
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("if-match", request.getIfMatch())
                .hasBinaryRequestBody()
                .hasBody()
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        BulkUploadServiceListsResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", BulkUploadServiceListsResponse.Builder::opcRequestId)
                .operationUsesDefaultRetries()
                .callSync();
    }

    @Override
    public BulkUploadServicesResponse bulkUploadServices(BulkUploadServicesRequest request) {

        Validate.notBlank(
                request.getNetworkFirewallPolicyId(), "networkFirewallPolicyId must not be blank");
        Objects.requireNonNull(
                request.getBulkUploadServicesDetails(), "bulkUploadServicesDetails is required");

        return clientCall(request, BulkUploadServicesResponse::builder)
                .logger(LOG, "bulkUploadServices")
                .serviceDetails(
                        "NetworkFirewall",
                        "BulkUploadServices",
                        "https://docs.oracle.com/iaas/api/#/en/network-firewall/20230501/Service/BulkUploadServices")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(BulkUploadServicesRequest::builder)
                .basePath("/20230501")
                .appendPathParam("networkFirewallPolicies")
                .appendPathParam(request.getNetworkFirewallPolicyId())
                .appendPathParam("services")
                .appendPathParam("actions")
                .appendPathParam("bulkUpload")
                .accept("application/json")
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("if-match", request.getIfMatch())
                .hasBinaryRequestBody()
                .hasBody()
                .handleResponseHeaderString(
                        "opc-work-request-id", BulkUploadServicesResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", BulkUploadServicesResponse.Builder::opcRequestId)
                .operationUsesDefaultRetries()
                .callSync();
    }

    @Override
    public BulkUploadUrlListsResponse bulkUploadUrlLists(BulkUploadUrlListsRequest request) {

        Validate.notBlank(
                request.getNetworkFirewallPolicyId(), "networkFirewallPolicyId must not be blank");
        Objects.requireNonNull(
                request.getBulkUploadUrlListsDetails(), "bulkUploadUrlListsDetails is required");

        return clientCall(request, BulkUploadUrlListsResponse::builder)
                .logger(LOG, "bulkUploadUrlLists")
                .serviceDetails(
                        "NetworkFirewall",
                        "BulkUploadUrlLists",
                        "https://docs.oracle.com/iaas/api/#/en/network-firewall/20230501/UrlList/BulkUploadUrlLists")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(BulkUploadUrlListsRequest::builder)
                .basePath("/20230501")
                .appendPathParam("networkFirewallPolicies")
                .appendPathParam(request.getNetworkFirewallPolicyId())
                .appendPathParam("urlLists")
                .appendPathParam("actions")
                .appendPathParam("bulkUpload")
                .accept("application/json")
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("if-match", request.getIfMatch())
                .hasBinaryRequestBody()
                .hasBody()
                .handleResponseHeaderString(
                        "opc-work-request-id", BulkUploadUrlListsResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", BulkUploadUrlListsResponse.Builder::opcRequestId)
                .operationUsesDefaultRetries()
                .callSync();
    }

    @Override
    public CancelWorkRequestResponse cancelWorkRequest(CancelWorkRequestRequest request) {

        Validate.notBlank(request.getWorkRequestId(), "workRequestId must not be blank");

        return clientCall(request, CancelWorkRequestResponse::builder)
                .logger(LOG, "cancelWorkRequest")
                .serviceDetails(
                        "NetworkFirewall",
                        "CancelWorkRequest",
                        "https://docs.oracle.com/iaas/api/#/en/network-firewall/20230501/WorkRequest/CancelWorkRequest")
                .method(com.oracle.bmc.http.client.Method.DELETE)
                .requestBuilder(CancelWorkRequestRequest::builder)
                .basePath("/20230501")
                .appendPathParam("workRequests")
                .appendPathParam(request.getWorkRequestId())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleResponseHeaderString(
                        "opc-request-id", CancelWorkRequestResponse.Builder::opcRequestId)
                .operationUsesDefaultRetries()
                .callSync();
    }

    @Override
    public ChangeNetworkFirewallCompartmentResponse changeNetworkFirewallCompartment(
            ChangeNetworkFirewallCompartmentRequest request) {

        Validate.notBlank(request.getNetworkFirewallId(), "networkFirewallId must not be blank");
        Objects.requireNonNull(
                request.getChangeNetworkFirewallCompartmentDetails(),
                "changeNetworkFirewallCompartmentDetails is required");

        return clientCall(request, ChangeNetworkFirewallCompartmentResponse::builder)
                .logger(LOG, "changeNetworkFirewallCompartment")
                .serviceDetails(
                        "NetworkFirewall",
                        "ChangeNetworkFirewallCompartment",
                        "https://docs.oracle.com/iaas/api/#/en/network-firewall/20230501/NetworkFirewall/ChangeNetworkFirewallCompartment")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(ChangeNetworkFirewallCompartmentRequest::builder)
                .basePath("/20230501")
                .appendPathParam("networkFirewalls")
                .appendPathParam(request.getNetworkFirewallId())
                .appendPathParam("actions")
                .appendPathParam("changeCompartment")
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .hasBody()
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        ChangeNetworkFirewallCompartmentResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id",
                        ChangeNetworkFirewallCompartmentResponse.Builder::opcRequestId)
                .operationUsesDefaultRetries()
                .callSync();
    }

    @Override
    public ChangeNetworkFirewallPolicyCompartmentResponse changeNetworkFirewallPolicyCompartment(
            ChangeNetworkFirewallPolicyCompartmentRequest request) {

        Validate.notBlank(
                request.getNetworkFirewallPolicyId(), "networkFirewallPolicyId must not be blank");
        Objects.requireNonNull(
                request.getChangeNetworkFirewallPolicyCompartmentDetails(),
                "changeNetworkFirewallPolicyCompartmentDetails is required");

        return clientCall(request, ChangeNetworkFirewallPolicyCompartmentResponse::builder)
                .logger(LOG, "changeNetworkFirewallPolicyCompartment")
                .serviceDetails(
                        "NetworkFirewall",
                        "ChangeNetworkFirewallPolicyCompartment",
                        "https://docs.oracle.com/iaas/api/#/en/network-firewall/20230501/NetworkFirewallPolicy/ChangeNetworkFirewallPolicyCompartment")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(ChangeNetworkFirewallPolicyCompartmentRequest::builder)
                .basePath("/20230501")
                .appendPathParam("networkFirewallPolicies")
                .appendPathParam(request.getNetworkFirewallPolicyId())
                .appendPathParam("actions")
                .appendPathParam("changeCompartment")
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .hasBody()
                .handleResponseHeaderString(
                        "opc-request-id",
                        ChangeNetworkFirewallPolicyCompartmentResponse.Builder::opcRequestId)
                .operationUsesDefaultRetries()
                .callSync();
    }

    @Override
    public CloneNetworkFirewallPolicyResponse cloneNetworkFirewallPolicy(
            CloneNetworkFirewallPolicyRequest request) {

        Validate.notBlank(
                request.getNetworkFirewallPolicyId(), "networkFirewallPolicyId must not be blank");
        Objects.requireNonNull(
                request.getCloneNetworkFirewallPolicyDetails(),
                "cloneNetworkFirewallPolicyDetails is required");

        return clientCall(request, CloneNetworkFirewallPolicyResponse::builder)
                .logger(LOG, "cloneNetworkFirewallPolicy")
                .serviceDetails(
                        "NetworkFirewall",
                        "CloneNetworkFirewallPolicy",
                        "https://docs.oracle.com/iaas/api/#/en/network-firewall/20230501/NetworkFirewallPolicy/CloneNetworkFirewallPolicy")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(CloneNetworkFirewallPolicyRequest::builder)
                .basePath("/20230501")
                .appendPathParam("networkFirewallPolicies")
                .appendPathParam(request.getNetworkFirewallPolicyId())
                .appendPathParam("actions")
                .appendPathParam("clonePolicy")
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.networkfirewall.model.NetworkFirewallPolicy.class,
                        CloneNetworkFirewallPolicyResponse.Builder::networkFirewallPolicy)
                .handleResponseHeaderString(
                        "etag", CloneNetworkFirewallPolicyResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        CloneNetworkFirewallPolicyResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", CloneNetworkFirewallPolicyResponse.Builder::opcRequestId)
                .operationUsesDefaultRetries()
                .callSync();
    }

    @Override
    public CreateAddressListResponse createAddressList(CreateAddressListRequest request) {

        Validate.notBlank(
                request.getNetworkFirewallPolicyId(), "networkFirewallPolicyId must not be blank");
        Objects.requireNonNull(
                request.getCreateAddressListDetails(), "createAddressListDetails is required");

        return clientCall(request, CreateAddressListResponse::builder)
                .logger(LOG, "createAddressList")
                .serviceDetails(
                        "NetworkFirewall",
                        "CreateAddressList",
                        "https://docs.oracle.com/iaas/api/#/en/network-firewall/20230501/AddressList/CreateAddressList")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(CreateAddressListRequest::builder)
                .basePath("/20230501")
                .appendPathParam("networkFirewallPolicies")
                .appendPathParam(request.getNetworkFirewallPolicyId())
                .appendPathParam("addressLists")
                .accept("application/json")
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.networkfirewall.model.AddressList.class,
                        CreateAddressListResponse.Builder::addressList)
                .handleResponseHeaderString("etag", CreateAddressListResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", CreateAddressListResponse.Builder::opcRequestId)
                .operationUsesDefaultRetries()
                .callSync();
    }

    @Override
    public CreateApplicationResponse createApplication(CreateApplicationRequest request) {

        Validate.notBlank(
                request.getNetworkFirewallPolicyId(), "networkFirewallPolicyId must not be blank");
        Objects.requireNonNull(
                request.getCreateApplicationDetails(), "createApplicationDetails is required");

        return clientCall(request, CreateApplicationResponse::builder)
                .logger(LOG, "createApplication")
                .serviceDetails(
                        "NetworkFirewall",
                        "CreateApplication",
                        "https://docs.oracle.com/iaas/api/#/en/network-firewall/20230501/Application/CreateApplication")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(CreateApplicationRequest::builder)
                .basePath("/20230501")
                .appendPathParam("networkFirewallPolicies")
                .appendPathParam(request.getNetworkFirewallPolicyId())
                .appendPathParam("applications")
                .accept("application/json")
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.networkfirewall.model.Application.class,
                        CreateApplicationResponse.Builder::application)
                .handleResponseHeaderString("etag", CreateApplicationResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", CreateApplicationResponse.Builder::opcRequestId)
                .operationUsesDefaultRetries()
                .callSync();
    }

    @Override
    public CreateApplicationGroupResponse createApplicationGroup(
            CreateApplicationGroupRequest request) {

        Validate.notBlank(
                request.getNetworkFirewallPolicyId(), "networkFirewallPolicyId must not be blank");
        Objects.requireNonNull(
                request.getCreateApplicationGroupDetails(),
                "createApplicationGroupDetails is required");

        return clientCall(request, CreateApplicationGroupResponse::builder)
                .logger(LOG, "createApplicationGroup")
                .serviceDetails(
                        "NetworkFirewall",
                        "CreateApplicationGroup",
                        "https://docs.oracle.com/iaas/api/#/en/network-firewall/20230501/ApplicationGroup/CreateApplicationGroup")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(CreateApplicationGroupRequest::builder)
                .basePath("/20230501")
                .appendPathParam("networkFirewallPolicies")
                .appendPathParam(request.getNetworkFirewallPolicyId())
                .appendPathParam("applicationGroups")
                .accept("application/json")
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.networkfirewall.model.ApplicationGroup.class,
                        CreateApplicationGroupResponse.Builder::applicationGroup)
                .handleResponseHeaderString("etag", CreateApplicationGroupResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", CreateApplicationGroupResponse.Builder::opcRequestId)
                .operationUsesDefaultRetries()
                .callSync();
    }

    @Override
    public CreateDecryptionProfileResponse createDecryptionProfile(
            CreateDecryptionProfileRequest request) {

        Validate.notBlank(
                request.getNetworkFirewallPolicyId(), "networkFirewallPolicyId must not be blank");
        Objects.requireNonNull(
                request.getCreateDecryptionProfileDetails(),
                "createDecryptionProfileDetails is required");

        return clientCall(request, CreateDecryptionProfileResponse::builder)
                .logger(LOG, "createDecryptionProfile")
                .serviceDetails(
                        "NetworkFirewall",
                        "CreateDecryptionProfile",
                        "https://docs.oracle.com/iaas/api/#/en/network-firewall/20230501/DecryptionProfile/CreateDecryptionProfile")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(CreateDecryptionProfileRequest::builder)
                .basePath("/20230501")
                .appendPathParam("networkFirewallPolicies")
                .appendPathParam(request.getNetworkFirewallPolicyId())
                .appendPathParam("decryptionProfiles")
                .accept("application/json")
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.networkfirewall.model.DecryptionProfile.class,
                        CreateDecryptionProfileResponse.Builder::decryptionProfile)
                .handleResponseHeaderString("etag", CreateDecryptionProfileResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", CreateDecryptionProfileResponse.Builder::opcRequestId)
                .operationUsesDefaultRetries()
                .callSync();
    }

    @Override
    public CreateDecryptionRuleResponse createDecryptionRule(CreateDecryptionRuleRequest request) {

        Validate.notBlank(
                request.getNetworkFirewallPolicyId(), "networkFirewallPolicyId must not be blank");
        Objects.requireNonNull(
                request.getCreateDecryptionRuleDetails(),
                "createDecryptionRuleDetails is required");

        return clientCall(request, CreateDecryptionRuleResponse::builder)
                .logger(LOG, "createDecryptionRule")
                .serviceDetails(
                        "NetworkFirewall",
                        "CreateDecryptionRule",
                        "https://docs.oracle.com/iaas/api/#/en/network-firewall/20230501/DecryptionRule/CreateDecryptionRule")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(CreateDecryptionRuleRequest::builder)
                .basePath("/20230501")
                .appendPathParam("networkFirewallPolicies")
                .appendPathParam(request.getNetworkFirewallPolicyId())
                .appendPathParam("decryptionRules")
                .accept("application/json")
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.networkfirewall.model.DecryptionRule.class,
                        CreateDecryptionRuleResponse.Builder::decryptionRule)
                .handleResponseHeaderString("etag", CreateDecryptionRuleResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", CreateDecryptionRuleResponse.Builder::opcRequestId)
                .operationUsesDefaultRetries()
                .callSync();
    }

    @Override
    public CreateMappedSecretResponse createMappedSecret(CreateMappedSecretRequest request) {

        Validate.notBlank(
                request.getNetworkFirewallPolicyId(), "networkFirewallPolicyId must not be blank");
        Objects.requireNonNull(
                request.getCreateMappedSecretDetails(), "createMappedSecretDetails is required");

        return clientCall(request, CreateMappedSecretResponse::builder)
                .logger(LOG, "createMappedSecret")
                .serviceDetails(
                        "NetworkFirewall",
                        "CreateMappedSecret",
                        "https://docs.oracle.com/iaas/api/#/en/network-firewall/20230501/MappedSecret/CreateMappedSecret")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(CreateMappedSecretRequest::builder)
                .basePath("/20230501")
                .appendPathParam("networkFirewallPolicies")
                .appendPathParam(request.getNetworkFirewallPolicyId())
                .appendPathParam("mappedSecrets")
                .accept("application/json")
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.networkfirewall.model.MappedSecret.class,
                        CreateMappedSecretResponse.Builder::mappedSecret)
                .handleResponseHeaderString("etag", CreateMappedSecretResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", CreateMappedSecretResponse.Builder::opcRequestId)
                .operationUsesDefaultRetries()
                .callSync();
    }

    @Override
    public CreateNetworkFirewallResponse createNetworkFirewall(
            CreateNetworkFirewallRequest request) {
        Objects.requireNonNull(
                request.getCreateNetworkFirewallDetails(),
                "createNetworkFirewallDetails is required");

        return clientCall(request, CreateNetworkFirewallResponse::builder)
                .logger(LOG, "createNetworkFirewall")
                .serviceDetails(
                        "NetworkFirewall",
                        "CreateNetworkFirewall",
                        "https://docs.oracle.com/iaas/api/#/en/network-firewall/20230501/NetworkFirewall/CreateNetworkFirewall")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(CreateNetworkFirewallRequest::builder)
                .basePath("/20230501")
                .appendPathParam("networkFirewalls")
                .accept("application/json")
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.networkfirewall.model.NetworkFirewall.class,
                        CreateNetworkFirewallResponse.Builder::networkFirewall)
                .handleResponseHeaderString("etag", CreateNetworkFirewallResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        CreateNetworkFirewallResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", CreateNetworkFirewallResponse.Builder::opcRequestId)
                .operationUsesDefaultRetries()
                .callSync();
    }

    @Override
    public CreateNetworkFirewallPolicyResponse createNetworkFirewallPolicy(
            CreateNetworkFirewallPolicyRequest request) {
        Objects.requireNonNull(
                request.getCreateNetworkFirewallPolicyDetails(),
                "createNetworkFirewallPolicyDetails is required");

        return clientCall(request, CreateNetworkFirewallPolicyResponse::builder)
                .logger(LOG, "createNetworkFirewallPolicy")
                .serviceDetails(
                        "NetworkFirewall",
                        "CreateNetworkFirewallPolicy",
                        "https://docs.oracle.com/iaas/api/#/en/network-firewall/20230501/NetworkFirewallPolicy/CreateNetworkFirewallPolicy")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(CreateNetworkFirewallPolicyRequest::builder)
                .basePath("/20230501")
                .appendPathParam("networkFirewallPolicies")
                .accept("application/json")
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.networkfirewall.model.NetworkFirewallPolicy.class,
                        CreateNetworkFirewallPolicyResponse.Builder::networkFirewallPolicy)
                .handleResponseHeaderString(
                        "etag", CreateNetworkFirewallPolicyResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        CreateNetworkFirewallPolicyResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", CreateNetworkFirewallPolicyResponse.Builder::opcRequestId)
                .operationUsesDefaultRetries()
                .callSync();
    }

    @Override
    public CreateSecurityRuleResponse createSecurityRule(CreateSecurityRuleRequest request) {

        Validate.notBlank(
                request.getNetworkFirewallPolicyId(), "networkFirewallPolicyId must not be blank");
        Objects.requireNonNull(
                request.getCreateSecurityRuleDetails(), "createSecurityRuleDetails is required");

        return clientCall(request, CreateSecurityRuleResponse::builder)
                .logger(LOG, "createSecurityRule")
                .serviceDetails(
                        "NetworkFirewall",
                        "CreateSecurityRule",
                        "https://docs.oracle.com/iaas/api/#/en/network-firewall/20230501/SecurityRule/CreateSecurityRule")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(CreateSecurityRuleRequest::builder)
                .basePath("/20230501")
                .appendPathParam("networkFirewallPolicies")
                .appendPathParam(request.getNetworkFirewallPolicyId())
                .appendPathParam("securityRules")
                .accept("application/json")
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.networkfirewall.model.SecurityRule.class,
                        CreateSecurityRuleResponse.Builder::securityRule)
                .handleResponseHeaderString("etag", CreateSecurityRuleResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", CreateSecurityRuleResponse.Builder::opcRequestId)
                .operationUsesDefaultRetries()
                .callSync();
    }

    @Override
    public CreateServiceResponse createService(CreateServiceRequest request) {

        Validate.notBlank(
                request.getNetworkFirewallPolicyId(), "networkFirewallPolicyId must not be blank");
        Objects.requireNonNull(
                request.getCreateServiceDetails(), "createServiceDetails is required");

        return clientCall(request, CreateServiceResponse::builder)
                .logger(LOG, "createService")
                .serviceDetails(
                        "NetworkFirewall",
                        "CreateService",
                        "https://docs.oracle.com/iaas/api/#/en/network-firewall/20230501/Service/CreateService")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(CreateServiceRequest::builder)
                .basePath("/20230501")
                .appendPathParam("networkFirewallPolicies")
                .appendPathParam(request.getNetworkFirewallPolicyId())
                .appendPathParam("services")
                .accept("application/json")
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.networkfirewall.model.Service.class,
                        CreateServiceResponse.Builder::service)
                .handleResponseHeaderString("etag", CreateServiceResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", CreateServiceResponse.Builder::opcRequestId)
                .operationUsesDefaultRetries()
                .callSync();
    }

    @Override
    public CreateServiceListResponse createServiceList(CreateServiceListRequest request) {

        Validate.notBlank(
                request.getNetworkFirewallPolicyId(), "networkFirewallPolicyId must not be blank");
        Objects.requireNonNull(
                request.getCreateServiceListDetails(), "createServiceListDetails is required");

        return clientCall(request, CreateServiceListResponse::builder)
                .logger(LOG, "createServiceList")
                .serviceDetails(
                        "NetworkFirewall",
                        "CreateServiceList",
                        "https://docs.oracle.com/iaas/api/#/en/network-firewall/20230501/ServiceList/CreateServiceList")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(CreateServiceListRequest::builder)
                .basePath("/20230501")
                .appendPathParam("networkFirewallPolicies")
                .appendPathParam(request.getNetworkFirewallPolicyId())
                .appendPathParam("serviceLists")
                .accept("application/json")
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.networkfirewall.model.ServiceList.class,
                        CreateServiceListResponse.Builder::serviceList)
                .handleResponseHeaderString("etag", CreateServiceListResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", CreateServiceListResponse.Builder::opcRequestId)
                .operationUsesDefaultRetries()
                .callSync();
    }

    @Override
    public CreateUrlListResponse createUrlList(CreateUrlListRequest request) {

        Validate.notBlank(
                request.getNetworkFirewallPolicyId(), "networkFirewallPolicyId must not be blank");
        Objects.requireNonNull(
                request.getCreateUrlListDetails(), "createUrlListDetails is required");

        return clientCall(request, CreateUrlListResponse::builder)
                .logger(LOG, "createUrlList")
                .serviceDetails(
                        "NetworkFirewall",
                        "CreateUrlList",
                        "https://docs.oracle.com/iaas/api/#/en/network-firewall/20230501/UrlList/CreateUrlList")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(CreateUrlListRequest::builder)
                .basePath("/20230501")
                .appendPathParam("networkFirewallPolicies")
                .appendPathParam(request.getNetworkFirewallPolicyId())
                .appendPathParam("urlLists")
                .accept("application/json")
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.networkfirewall.model.UrlList.class,
                        CreateUrlListResponse.Builder::urlList)
                .handleResponseHeaderString("etag", CreateUrlListResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", CreateUrlListResponse.Builder::opcRequestId)
                .operationUsesDefaultRetries()
                .callSync();
    }

    @Override
    public DeleteAddressListResponse deleteAddressList(DeleteAddressListRequest request) {

        Validate.notBlank(
                request.getNetworkFirewallPolicyId(), "networkFirewallPolicyId must not be blank");

        Validate.notBlank(request.getAddressListName(), "addressListName must not be blank");

        return clientCall(request, DeleteAddressListResponse::builder)
                .logger(LOG, "deleteAddressList")
                .serviceDetails(
                        "NetworkFirewall",
                        "DeleteAddressList",
                        "https://docs.oracle.com/iaas/api/#/en/network-firewall/20230501/AddressList/DeleteAddressList")
                .method(com.oracle.bmc.http.client.Method.DELETE)
                .requestBuilder(DeleteAddressListRequest::builder)
                .basePath("/20230501")
                .appendPathParam("networkFirewallPolicies")
                .appendPathParam(request.getNetworkFirewallPolicyId())
                .appendPathParam("addressLists")
                .appendPathParam(request.getAddressListName())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleResponseHeaderString(
                        "opc-request-id", DeleteAddressListResponse.Builder::opcRequestId)
                .operationUsesDefaultRetries()
                .callSync();
    }

    @Override
    public DeleteApplicationResponse deleteApplication(DeleteApplicationRequest request) {

        Validate.notBlank(
                request.getNetworkFirewallPolicyId(), "networkFirewallPolicyId must not be blank");

        Validate.notBlank(request.getApplicationName(), "applicationName must not be blank");

        return clientCall(request, DeleteApplicationResponse::builder)
                .logger(LOG, "deleteApplication")
                .serviceDetails(
                        "NetworkFirewall",
                        "DeleteApplication",
                        "https://docs.oracle.com/iaas/api/#/en/network-firewall/20230501/Application/DeleteApplication")
                .method(com.oracle.bmc.http.client.Method.DELETE)
                .requestBuilder(DeleteApplicationRequest::builder)
                .basePath("/20230501")
                .appendPathParam("networkFirewallPolicies")
                .appendPathParam(request.getNetworkFirewallPolicyId())
                .appendPathParam("applications")
                .appendPathParam(request.getApplicationName())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleResponseHeaderString(
                        "opc-request-id", DeleteApplicationResponse.Builder::opcRequestId)
                .operationUsesDefaultRetries()
                .callSync();
    }

    @Override
    public DeleteApplicationGroupResponse deleteApplicationGroup(
            DeleteApplicationGroupRequest request) {

        Validate.notBlank(
                request.getNetworkFirewallPolicyId(), "networkFirewallPolicyId must not be blank");

        Validate.notBlank(
                request.getApplicationGroupName(), "applicationGroupName must not be blank");

        return clientCall(request, DeleteApplicationGroupResponse::builder)
                .logger(LOG, "deleteApplicationGroup")
                .serviceDetails(
                        "NetworkFirewall",
                        "DeleteApplicationGroup",
                        "https://docs.oracle.com/iaas/api/#/en/network-firewall/20230501/ApplicationGroup/DeleteApplicationGroup")
                .method(com.oracle.bmc.http.client.Method.DELETE)
                .requestBuilder(DeleteApplicationGroupRequest::builder)
                .basePath("/20230501")
                .appendPathParam("networkFirewallPolicies")
                .appendPathParam(request.getNetworkFirewallPolicyId())
                .appendPathParam("applicationGroups")
                .appendPathParam(request.getApplicationGroupName())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleResponseHeaderString(
                        "opc-request-id", DeleteApplicationGroupResponse.Builder::opcRequestId)
                .operationUsesDefaultRetries()
                .callSync();
    }

    @Override
    public DeleteDecryptionProfileResponse deleteDecryptionProfile(
            DeleteDecryptionProfileRequest request) {

        Validate.notBlank(
                request.getNetworkFirewallPolicyId(), "networkFirewallPolicyId must not be blank");

        Validate.notBlank(
                request.getDecryptionProfileName(), "decryptionProfileName must not be blank");

        return clientCall(request, DeleteDecryptionProfileResponse::builder)
                .logger(LOG, "deleteDecryptionProfile")
                .serviceDetails(
                        "NetworkFirewall",
                        "DeleteDecryptionProfile",
                        "https://docs.oracle.com/iaas/api/#/en/network-firewall/20230501/DecryptionProfile/DeleteDecryptionProfile")
                .method(com.oracle.bmc.http.client.Method.DELETE)
                .requestBuilder(DeleteDecryptionProfileRequest::builder)
                .basePath("/20230501")
                .appendPathParam("networkFirewallPolicies")
                .appendPathParam(request.getNetworkFirewallPolicyId())
                .appendPathParam("decryptionProfiles")
                .appendPathParam(request.getDecryptionProfileName())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleResponseHeaderString(
                        "opc-request-id", DeleteDecryptionProfileResponse.Builder::opcRequestId)
                .operationUsesDefaultRetries()
                .callSync();
    }

    @Override
    public DeleteDecryptionRuleResponse deleteDecryptionRule(DeleteDecryptionRuleRequest request) {

        Validate.notBlank(
                request.getNetworkFirewallPolicyId(), "networkFirewallPolicyId must not be blank");

        Validate.notBlank(request.getDecryptionRuleName(), "decryptionRuleName must not be blank");

        return clientCall(request, DeleteDecryptionRuleResponse::builder)
                .logger(LOG, "deleteDecryptionRule")
                .serviceDetails(
                        "NetworkFirewall",
                        "DeleteDecryptionRule",
                        "https://docs.oracle.com/iaas/api/#/en/network-firewall/20230501/DecryptionRule/DeleteDecryptionRule")
                .method(com.oracle.bmc.http.client.Method.DELETE)
                .requestBuilder(DeleteDecryptionRuleRequest::builder)
                .basePath("/20230501")
                .appendPathParam("networkFirewallPolicies")
                .appendPathParam(request.getNetworkFirewallPolicyId())
                .appendPathParam("decryptionRules")
                .appendPathParam(request.getDecryptionRuleName())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleResponseHeaderString(
                        "opc-request-id", DeleteDecryptionRuleResponse.Builder::opcRequestId)
                .operationUsesDefaultRetries()
                .callSync();
    }

    @Override
    public DeleteMappedSecretResponse deleteMappedSecret(DeleteMappedSecretRequest request) {

        Validate.notBlank(
                request.getNetworkFirewallPolicyId(), "networkFirewallPolicyId must not be blank");

        Validate.notBlank(request.getMappedSecretName(), "mappedSecretName must not be blank");

        return clientCall(request, DeleteMappedSecretResponse::builder)
                .logger(LOG, "deleteMappedSecret")
                .serviceDetails(
                        "NetworkFirewall",
                        "DeleteMappedSecret",
                        "https://docs.oracle.com/iaas/api/#/en/network-firewall/20230501/MappedSecret/DeleteMappedSecret")
                .method(com.oracle.bmc.http.client.Method.DELETE)
                .requestBuilder(DeleteMappedSecretRequest::builder)
                .basePath("/20230501")
                .appendPathParam("networkFirewallPolicies")
                .appendPathParam(request.getNetworkFirewallPolicyId())
                .appendPathParam("mappedSecrets")
                .appendPathParam(request.getMappedSecretName())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleResponseHeaderString(
                        "opc-request-id", DeleteMappedSecretResponse.Builder::opcRequestId)
                .operationUsesDefaultRetries()
                .callSync();
    }

    @Override
    public DeleteNetworkFirewallResponse deleteNetworkFirewall(
            DeleteNetworkFirewallRequest request) {

        Validate.notBlank(request.getNetworkFirewallId(), "networkFirewallId must not be blank");

        return clientCall(request, DeleteNetworkFirewallResponse::builder)
                .logger(LOG, "deleteNetworkFirewall")
                .serviceDetails(
                        "NetworkFirewall",
                        "DeleteNetworkFirewall",
                        "https://docs.oracle.com/iaas/api/#/en/network-firewall/20230501/NetworkFirewall/DeleteNetworkFirewall")
                .method(com.oracle.bmc.http.client.Method.DELETE)
                .requestBuilder(DeleteNetworkFirewallRequest::builder)
                .basePath("/20230501")
                .appendPathParam("networkFirewalls")
                .appendPathParam(request.getNetworkFirewallId())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        DeleteNetworkFirewallResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", DeleteNetworkFirewallResponse.Builder::opcRequestId)
                .operationUsesDefaultRetries()
                .callSync();
    }

    @Override
    public DeleteNetworkFirewallPolicyResponse deleteNetworkFirewallPolicy(
            DeleteNetworkFirewallPolicyRequest request) {

        Validate.notBlank(
                request.getNetworkFirewallPolicyId(), "networkFirewallPolicyId must not be blank");

        return clientCall(request, DeleteNetworkFirewallPolicyResponse::builder)
                .logger(LOG, "deleteNetworkFirewallPolicy")
                .serviceDetails(
                        "NetworkFirewall",
                        "DeleteNetworkFirewallPolicy",
                        "https://docs.oracle.com/iaas/api/#/en/network-firewall/20230501/NetworkFirewallPolicy/DeleteNetworkFirewallPolicy")
                .method(com.oracle.bmc.http.client.Method.DELETE)
                .requestBuilder(DeleteNetworkFirewallPolicyRequest::builder)
                .basePath("/20230501")
                .appendPathParam("networkFirewallPolicies")
                .appendPathParam(request.getNetworkFirewallPolicyId())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        DeleteNetworkFirewallPolicyResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", DeleteNetworkFirewallPolicyResponse.Builder::opcRequestId)
                .operationUsesDefaultRetries()
                .callSync();
    }

    @Override
    public DeleteSecurityRuleResponse deleteSecurityRule(DeleteSecurityRuleRequest request) {

        Validate.notBlank(
                request.getNetworkFirewallPolicyId(), "networkFirewallPolicyId must not be blank");

        Validate.notBlank(request.getSecurityRuleName(), "securityRuleName must not be blank");

        return clientCall(request, DeleteSecurityRuleResponse::builder)
                .logger(LOG, "deleteSecurityRule")
                .serviceDetails(
                        "NetworkFirewall",
                        "DeleteSecurityRule",
                        "https://docs.oracle.com/iaas/api/#/en/network-firewall/20230501/SecurityRule/DeleteSecurityRule")
                .method(com.oracle.bmc.http.client.Method.DELETE)
                .requestBuilder(DeleteSecurityRuleRequest::builder)
                .basePath("/20230501")
                .appendPathParam("networkFirewallPolicies")
                .appendPathParam(request.getNetworkFirewallPolicyId())
                .appendPathParam("securityRules")
                .appendPathParam(request.getSecurityRuleName())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleResponseHeaderString(
                        "opc-request-id", DeleteSecurityRuleResponse.Builder::opcRequestId)
                .operationUsesDefaultRetries()
                .callSync();
    }

    @Override
    public DeleteServiceResponse deleteService(DeleteServiceRequest request) {

        Validate.notBlank(
                request.getNetworkFirewallPolicyId(), "networkFirewallPolicyId must not be blank");

        Validate.notBlank(request.getServiceName(), "serviceName must not be blank");

        return clientCall(request, DeleteServiceResponse::builder)
                .logger(LOG, "deleteService")
                .serviceDetails(
                        "NetworkFirewall",
                        "DeleteService",
                        "https://docs.oracle.com/iaas/api/#/en/network-firewall/20230501/Service/DeleteService")
                .method(com.oracle.bmc.http.client.Method.DELETE)
                .requestBuilder(DeleteServiceRequest::builder)
                .basePath("/20230501")
                .appendPathParam("networkFirewallPolicies")
                .appendPathParam(request.getNetworkFirewallPolicyId())
                .appendPathParam("services")
                .appendPathParam(request.getServiceName())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleResponseHeaderString(
                        "opc-request-id", DeleteServiceResponse.Builder::opcRequestId)
                .operationUsesDefaultRetries()
                .callSync();
    }

    @Override
    public DeleteServiceListResponse deleteServiceList(DeleteServiceListRequest request) {

        Validate.notBlank(
                request.getNetworkFirewallPolicyId(), "networkFirewallPolicyId must not be blank");

        Validate.notBlank(request.getServiceListName(), "serviceListName must not be blank");

        return clientCall(request, DeleteServiceListResponse::builder)
                .logger(LOG, "deleteServiceList")
                .serviceDetails(
                        "NetworkFirewall",
                        "DeleteServiceList",
                        "https://docs.oracle.com/iaas/api/#/en/network-firewall/20230501/ServiceList/DeleteServiceList")
                .method(com.oracle.bmc.http.client.Method.DELETE)
                .requestBuilder(DeleteServiceListRequest::builder)
                .basePath("/20230501")
                .appendPathParam("networkFirewallPolicies")
                .appendPathParam(request.getNetworkFirewallPolicyId())
                .appendPathParam("serviceLists")
                .appendPathParam(request.getServiceListName())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleResponseHeaderString(
                        "opc-request-id", DeleteServiceListResponse.Builder::opcRequestId)
                .operationUsesDefaultRetries()
                .callSync();
    }

    @Override
    public DeleteUrlListResponse deleteUrlList(DeleteUrlListRequest request) {

        Validate.notBlank(
                request.getNetworkFirewallPolicyId(), "networkFirewallPolicyId must not be blank");

        Validate.notBlank(request.getUrlListName(), "urlListName must not be blank");

        return clientCall(request, DeleteUrlListResponse::builder)
                .logger(LOG, "deleteUrlList")
                .serviceDetails(
                        "NetworkFirewall",
                        "DeleteUrlList",
                        "https://docs.oracle.com/iaas/api/#/en/network-firewall/20230501/UrlList/DeleteUrlList")
                .method(com.oracle.bmc.http.client.Method.DELETE)
                .requestBuilder(DeleteUrlListRequest::builder)
                .basePath("/20230501")
                .appendPathParam("networkFirewallPolicies")
                .appendPathParam(request.getNetworkFirewallPolicyId())
                .appendPathParam("urlLists")
                .appendPathParam(request.getUrlListName())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleResponseHeaderString(
                        "opc-request-id", DeleteUrlListResponse.Builder::opcRequestId)
                .operationUsesDefaultRetries()
                .callSync();
    }

    @Override
    public GetAddressListResponse getAddressList(GetAddressListRequest request) {

        Validate.notBlank(
                request.getNetworkFirewallPolicyId(), "networkFirewallPolicyId must not be blank");

        Validate.notBlank(request.getAddressListName(), "addressListName must not be blank");

        return clientCall(request, GetAddressListResponse::builder)
                .logger(LOG, "getAddressList")
                .serviceDetails(
                        "NetworkFirewall",
                        "GetAddressList",
                        "https://docs.oracle.com/iaas/api/#/en/network-firewall/20230501/AddressList/GetAddressList")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetAddressListRequest::builder)
                .basePath("/20230501")
                .appendPathParam("networkFirewallPolicies")
                .appendPathParam(request.getNetworkFirewallPolicyId())
                .appendPathParam("addressLists")
                .appendPathParam(request.getAddressListName())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.networkfirewall.model.AddressList.class,
                        GetAddressListResponse.Builder::addressList)
                .handleResponseHeaderString("etag", GetAddressListResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", GetAddressListResponse.Builder::opcRequestId)
                .operationUsesDefaultRetries()
                .callSync();
    }

    @Override
    public GetApplicationResponse getApplication(GetApplicationRequest request) {

        Validate.notBlank(
                request.getNetworkFirewallPolicyId(), "networkFirewallPolicyId must not be blank");

        Validate.notBlank(request.getApplicationName(), "applicationName must not be blank");

        return clientCall(request, GetApplicationResponse::builder)
                .logger(LOG, "getApplication")
                .serviceDetails(
                        "NetworkFirewall",
                        "GetApplication",
                        "https://docs.oracle.com/iaas/api/#/en/network-firewall/20230501/Application/GetApplication")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetApplicationRequest::builder)
                .basePath("/20230501")
                .appendPathParam("networkFirewallPolicies")
                .appendPathParam(request.getNetworkFirewallPolicyId())
                .appendPathParam("applications")
                .appendPathParam(request.getApplicationName())
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.networkfirewall.model.Application.class,
                        GetApplicationResponse.Builder::application)
                .handleResponseHeaderString("etag", GetApplicationResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", GetApplicationResponse.Builder::opcRequestId)
                .operationUsesDefaultRetries()
                .callSync();
    }

    @Override
    public GetApplicationGroupResponse getApplicationGroup(GetApplicationGroupRequest request) {

        Validate.notBlank(
                request.getNetworkFirewallPolicyId(), "networkFirewallPolicyId must not be blank");

        Validate.notBlank(
                request.getApplicationGroupName(), "applicationGroupName must not be blank");

        return clientCall(request, GetApplicationGroupResponse::builder)
                .logger(LOG, "getApplicationGroup")
                .serviceDetails(
                        "NetworkFirewall",
                        "GetApplicationGroup",
                        "https://docs.oracle.com/iaas/api/#/en/network-firewall/20230501/ApplicationGroup/GetApplicationGroup")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetApplicationGroupRequest::builder)
                .basePath("/20230501")
                .appendPathParam("networkFirewallPolicies")
                .appendPathParam(request.getNetworkFirewallPolicyId())
                .appendPathParam("applicationGroups")
                .appendPathParam(request.getApplicationGroupName())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.networkfirewall.model.ApplicationGroup.class,
                        GetApplicationGroupResponse.Builder::applicationGroup)
                .handleResponseHeaderString("etag", GetApplicationGroupResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", GetApplicationGroupResponse.Builder::opcRequestId)
                .operationUsesDefaultRetries()
                .callSync();
    }

    @Override
    public GetDecryptionProfileResponse getDecryptionProfile(GetDecryptionProfileRequest request) {

        Validate.notBlank(
                request.getNetworkFirewallPolicyId(), "networkFirewallPolicyId must not be blank");

        Validate.notBlank(
                request.getDecryptionProfileName(), "decryptionProfileName must not be blank");

        return clientCall(request, GetDecryptionProfileResponse::builder)
                .logger(LOG, "getDecryptionProfile")
                .serviceDetails(
                        "NetworkFirewall",
                        "GetDecryptionProfile",
                        "https://docs.oracle.com/iaas/api/#/en/network-firewall/20230501/DecryptionProfile/GetDecryptionProfile")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetDecryptionProfileRequest::builder)
                .basePath("/20230501")
                .appendPathParam("networkFirewallPolicies")
                .appendPathParam(request.getNetworkFirewallPolicyId())
                .appendPathParam("decryptionProfiles")
                .appendPathParam(request.getDecryptionProfileName())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.networkfirewall.model.DecryptionProfile.class,
                        GetDecryptionProfileResponse.Builder::decryptionProfile)
                .handleResponseHeaderString("etag", GetDecryptionProfileResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", GetDecryptionProfileResponse.Builder::opcRequestId)
                .operationUsesDefaultRetries()
                .callSync();
    }

    @Override
    public GetDecryptionRuleResponse getDecryptionRule(GetDecryptionRuleRequest request) {

        Validate.notBlank(
                request.getNetworkFirewallPolicyId(), "networkFirewallPolicyId must not be blank");

        Validate.notBlank(request.getDecryptionRuleName(), "decryptionRuleName must not be blank");

        return clientCall(request, GetDecryptionRuleResponse::builder)
                .logger(LOG, "getDecryptionRule")
                .serviceDetails(
                        "NetworkFirewall",
                        "GetDecryptionRule",
                        "https://docs.oracle.com/iaas/api/#/en/network-firewall/20230501/DecryptionRule/GetDecryptionRule")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetDecryptionRuleRequest::builder)
                .basePath("/20230501")
                .appendPathParam("networkFirewallPolicies")
                .appendPathParam(request.getNetworkFirewallPolicyId())
                .appendPathParam("decryptionRules")
                .appendPathParam(request.getDecryptionRuleName())
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.networkfirewall.model.DecryptionRule.class,
                        GetDecryptionRuleResponse.Builder::decryptionRule)
                .handleResponseHeaderString("etag", GetDecryptionRuleResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", GetDecryptionRuleResponse.Builder::opcRequestId)
                .operationUsesDefaultRetries()
                .callSync();
    }

    @Override
    public GetMappedSecretResponse getMappedSecret(GetMappedSecretRequest request) {

        Validate.notBlank(
                request.getNetworkFirewallPolicyId(), "networkFirewallPolicyId must not be blank");

        Validate.notBlank(request.getMappedSecretName(), "mappedSecretName must not be blank");

        return clientCall(request, GetMappedSecretResponse::builder)
                .logger(LOG, "getMappedSecret")
                .serviceDetails(
                        "NetworkFirewall",
                        "GetMappedSecret",
                        "https://docs.oracle.com/iaas/api/#/en/network-firewall/20230501/MappedSecret/GetMappedSecret")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetMappedSecretRequest::builder)
                .basePath("/20230501")
                .appendPathParam("networkFirewallPolicies")
                .appendPathParam(request.getNetworkFirewallPolicyId())
                .appendPathParam("mappedSecrets")
                .appendPathParam(request.getMappedSecretName())
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.networkfirewall.model.MappedSecret.class,
                        GetMappedSecretResponse.Builder::mappedSecret)
                .handleResponseHeaderString("etag", GetMappedSecretResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", GetMappedSecretResponse.Builder::opcRequestId)
                .operationUsesDefaultRetries()
                .callSync();
    }

    @Override
    public GetNetworkFirewallResponse getNetworkFirewall(GetNetworkFirewallRequest request) {

        Validate.notBlank(request.getNetworkFirewallId(), "networkFirewallId must not be blank");

        return clientCall(request, GetNetworkFirewallResponse::builder)
                .logger(LOG, "getNetworkFirewall")
                .serviceDetails(
                        "NetworkFirewall",
                        "GetNetworkFirewall",
                        "https://docs.oracle.com/iaas/api/#/en/network-firewall/20230501/NetworkFirewall/GetNetworkFirewall")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetNetworkFirewallRequest::builder)
                .basePath("/20230501")
                .appendPathParam("networkFirewalls")
                .appendPathParam(request.getNetworkFirewallId())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.networkfirewall.model.NetworkFirewall.class,
                        GetNetworkFirewallResponse.Builder::networkFirewall)
                .handleResponseHeaderString("etag", GetNetworkFirewallResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", GetNetworkFirewallResponse.Builder::opcRequestId)
                .operationUsesDefaultRetries()
                .callSync();
    }

    @Override
    public GetNetworkFirewallPolicyResponse getNetworkFirewallPolicy(
            GetNetworkFirewallPolicyRequest request) {

        Validate.notBlank(
                request.getNetworkFirewallPolicyId(), "networkFirewallPolicyId must not be blank");

        return clientCall(request, GetNetworkFirewallPolicyResponse::builder)
                .logger(LOG, "getNetworkFirewallPolicy")
                .serviceDetails(
                        "NetworkFirewall",
                        "GetNetworkFirewallPolicy",
                        "https://docs.oracle.com/iaas/api/#/en/network-firewall/20230501/NetworkFirewallPolicy/GetNetworkFirewallPolicy")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetNetworkFirewallPolicyRequest::builder)
                .basePath("/20230501")
                .appendPathParam("networkFirewallPolicies")
                .appendPathParam(request.getNetworkFirewallPolicyId())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.networkfirewall.model.NetworkFirewallPolicy.class,
                        GetNetworkFirewallPolicyResponse.Builder::networkFirewallPolicy)
                .handleResponseHeaderString("etag", GetNetworkFirewallPolicyResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", GetNetworkFirewallPolicyResponse.Builder::opcRequestId)
                .operationUsesDefaultRetries()
                .callSync();
    }

    @Override
    public GetSecurityRuleResponse getSecurityRule(GetSecurityRuleRequest request) {

        Validate.notBlank(
                request.getNetworkFirewallPolicyId(), "networkFirewallPolicyId must not be blank");

        Validate.notBlank(request.getSecurityRuleName(), "securityRuleName must not be blank");

        return clientCall(request, GetSecurityRuleResponse::builder)
                .logger(LOG, "getSecurityRule")
                .serviceDetails(
                        "NetworkFirewall",
                        "GetSecurityRule",
                        "https://docs.oracle.com/iaas/api/#/en/network-firewall/20230501/SecurityRule/GetSecurityRule")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetSecurityRuleRequest::builder)
                .basePath("/20230501")
                .appendPathParam("networkFirewallPolicies")
                .appendPathParam(request.getNetworkFirewallPolicyId())
                .appendPathParam("securityRules")
                .appendPathParam(request.getSecurityRuleName())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.networkfirewall.model.SecurityRule.class,
                        GetSecurityRuleResponse.Builder::securityRule)
                .handleResponseHeaderString("etag", GetSecurityRuleResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", GetSecurityRuleResponse.Builder::opcRequestId)
                .operationUsesDefaultRetries()
                .callSync();
    }

    @Override
    public GetServiceResponse getService(GetServiceRequest request) {

        Validate.notBlank(
                request.getNetworkFirewallPolicyId(), "networkFirewallPolicyId must not be blank");

        Validate.notBlank(request.getServiceName(), "serviceName must not be blank");

        return clientCall(request, GetServiceResponse::builder)
                .logger(LOG, "getService")
                .serviceDetails(
                        "NetworkFirewall",
                        "GetService",
                        "https://docs.oracle.com/iaas/api/#/en/network-firewall/20230501/Service/GetService")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetServiceRequest::builder)
                .basePath("/20230501")
                .appendPathParam("networkFirewallPolicies")
                .appendPathParam(request.getNetworkFirewallPolicyId())
                .appendPathParam("services")
                .appendPathParam(request.getServiceName())
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.networkfirewall.model.Service.class,
                        GetServiceResponse.Builder::service)
                .handleResponseHeaderString("etag", GetServiceResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", GetServiceResponse.Builder::opcRequestId)
                .operationUsesDefaultRetries()
                .callSync();
    }

    @Override
    public GetServiceListResponse getServiceList(GetServiceListRequest request) {

        Validate.notBlank(
                request.getNetworkFirewallPolicyId(), "networkFirewallPolicyId must not be blank");

        Validate.notBlank(request.getServiceListName(), "serviceListName must not be blank");

        return clientCall(request, GetServiceListResponse::builder)
                .logger(LOG, "getServiceList")
                .serviceDetails(
                        "NetworkFirewall",
                        "GetServiceList",
                        "https://docs.oracle.com/iaas/api/#/en/network-firewall/20230501/ServiceList/GetServiceList")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetServiceListRequest::builder)
                .basePath("/20230501")
                .appendPathParam("networkFirewallPolicies")
                .appendPathParam(request.getNetworkFirewallPolicyId())
                .appendPathParam("serviceLists")
                .appendPathParam(request.getServiceListName())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.networkfirewall.model.ServiceList.class,
                        GetServiceListResponse.Builder::serviceList)
                .handleResponseHeaderString("etag", GetServiceListResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", GetServiceListResponse.Builder::opcRequestId)
                .operationUsesDefaultRetries()
                .callSync();
    }

    @Override
    public GetUrlListResponse getUrlList(GetUrlListRequest request) {

        Validate.notBlank(
                request.getNetworkFirewallPolicyId(), "networkFirewallPolicyId must not be blank");

        Validate.notBlank(request.getUrlListName(), "urlListName must not be blank");

        return clientCall(request, GetUrlListResponse::builder)
                .logger(LOG, "getUrlList")
                .serviceDetails(
                        "NetworkFirewall",
                        "GetUrlList",
                        "https://docs.oracle.com/iaas/api/#/en/network-firewall/20230501/UrlList/GetUrlList")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetUrlListRequest::builder)
                .basePath("/20230501")
                .appendPathParam("networkFirewallPolicies")
                .appendPathParam(request.getNetworkFirewallPolicyId())
                .appendPathParam("urlLists")
                .appendPathParam(request.getUrlListName())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.networkfirewall.model.UrlList.class,
                        GetUrlListResponse.Builder::urlList)
                .handleResponseHeaderString("etag", GetUrlListResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", GetUrlListResponse.Builder::opcRequestId)
                .operationUsesDefaultRetries()
                .callSync();
    }

    @Override
    public GetWorkRequestResponse getWorkRequest(GetWorkRequestRequest request) {

        Validate.notBlank(request.getWorkRequestId(), "workRequestId must not be blank");

        return clientCall(request, GetWorkRequestResponse::builder)
                .logger(LOG, "getWorkRequest")
                .serviceDetails(
                        "NetworkFirewall",
                        "GetWorkRequest",
                        "https://docs.oracle.com/iaas/api/#/en/network-firewall/20230501/WorkRequest/GetWorkRequest")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetWorkRequestRequest::builder)
                .basePath("/20230501")
                .appendPathParam("workRequests")
                .appendPathParam(request.getWorkRequestId())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.networkfirewall.model.WorkRequest.class,
                        GetWorkRequestResponse.Builder::workRequest)
                .handleResponseHeaderString("etag", GetWorkRequestResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", GetWorkRequestResponse.Builder::opcRequestId)
                .handleResponseHeaderInteger(
                        "retry-after", GetWorkRequestResponse.Builder::retryAfter)
                .operationUsesDefaultRetries()
                .callSync();
    }

    @Override
    public ListAddressListsResponse listAddressLists(ListAddressListsRequest request) {

        Validate.notBlank(
                request.getNetworkFirewallPolicyId(), "networkFirewallPolicyId must not be blank");

        return clientCall(request, ListAddressListsResponse::builder)
                .logger(LOG, "listAddressLists")
                .serviceDetails(
                        "NetworkFirewall",
                        "ListAddressLists",
                        "https://docs.oracle.com/iaas/api/#/en/network-firewall/20230501/AddressList/ListAddressLists")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListAddressListsRequest::builder)
                .basePath("/20230501")
                .appendPathParam("networkFirewallPolicies")
                .appendPathParam(request.getNetworkFirewallPolicyId())
                .appendPathParam("addressLists")
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .appendQueryParam("displayName", request.getDisplayName())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.networkfirewall.model.AddressListSummaryCollection.class,
                        ListAddressListsResponse.Builder::addressListSummaryCollection)
                .handleResponseHeaderString(
                        "opc-request-id", ListAddressListsResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListAddressListsResponse.Builder::opcNextPage)
                .handleResponseHeaderString(
                        "opc-prev-page", ListAddressListsResponse.Builder::opcPrevPage)
                .handleResponseHeaderString(
                        "opc-page-count", ListAddressListsResponse.Builder::opcPageCount)
                .handleResponseHeaderInteger(
                        "opc-total-items", ListAddressListsResponse.Builder::opcTotalItems)
                .operationUsesDefaultRetries()
                .callSync();
    }

    @Override
    public ListApplicationGroupsResponse listApplicationGroups(
            ListApplicationGroupsRequest request) {

        Validate.notBlank(
                request.getNetworkFirewallPolicyId(), "networkFirewallPolicyId must not be blank");

        return clientCall(request, ListApplicationGroupsResponse::builder)
                .logger(LOG, "listApplicationGroups")
                .serviceDetails(
                        "NetworkFirewall",
                        "ListApplicationGroups",
                        "https://docs.oracle.com/iaas/api/#/en/network-firewall/20230501/ApplicationGroup/ListApplicationGroups")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListApplicationGroupsRequest::builder)
                .basePath("/20230501")
                .appendPathParam("networkFirewallPolicies")
                .appendPathParam(request.getNetworkFirewallPolicyId())
                .appendPathParam("applicationGroups")
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .appendQueryParam("displayName", request.getDisplayName())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.networkfirewall.model.ApplicationGroupSummaryCollection
                                .class,
                        ListApplicationGroupsResponse.Builder::applicationGroupSummaryCollection)
                .handleResponseHeaderString(
                        "opc-request-id", ListApplicationGroupsResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListApplicationGroupsResponse.Builder::opcNextPage)
                .handleResponseHeaderString(
                        "opc-prev-page", ListApplicationGroupsResponse.Builder::opcPrevPage)
                .handleResponseHeaderString(
                        "opc-page-count", ListApplicationGroupsResponse.Builder::opcPageCount)
                .handleResponseHeaderInteger(
                        "opc-total-items", ListApplicationGroupsResponse.Builder::opcTotalItems)
                .operationUsesDefaultRetries()
                .callSync();
    }

    @Override
    public ListApplicationsResponse listApplications(ListApplicationsRequest request) {

        Validate.notBlank(
                request.getNetworkFirewallPolicyId(), "networkFirewallPolicyId must not be blank");

        return clientCall(request, ListApplicationsResponse::builder)
                .logger(LOG, "listApplications")
                .serviceDetails(
                        "NetworkFirewall",
                        "ListApplications",
                        "https://docs.oracle.com/iaas/api/#/en/network-firewall/20230501/Application/ListApplications")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListApplicationsRequest::builder)
                .basePath("/20230501")
                .appendPathParam("networkFirewallPolicies")
                .appendPathParam(request.getNetworkFirewallPolicyId())
                .appendPathParam("applications")
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .appendQueryParam("displayName", request.getDisplayName())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.networkfirewall.model.ApplicationSummaryCollection.class,
                        ListApplicationsResponse.Builder::applicationSummaryCollection)
                .handleResponseHeaderString(
                        "opc-request-id", ListApplicationsResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListApplicationsResponse.Builder::opcNextPage)
                .handleResponseHeaderString(
                        "opc-prev-page", ListApplicationsResponse.Builder::opcPrevPage)
                .handleResponseHeaderString(
                        "opc-page-count", ListApplicationsResponse.Builder::opcPageCount)
                .handleResponseHeaderInteger(
                        "opc-total-items", ListApplicationsResponse.Builder::opcTotalItems)
                .operationUsesDefaultRetries()
                .callSync();
    }

    @Override
    public ListDecryptionProfilesResponse listDecryptionProfiles(
            ListDecryptionProfilesRequest request) {

        Validate.notBlank(
                request.getNetworkFirewallPolicyId(), "networkFirewallPolicyId must not be blank");

        return clientCall(request, ListDecryptionProfilesResponse::builder)
                .logger(LOG, "listDecryptionProfiles")
                .serviceDetails(
                        "NetworkFirewall",
                        "ListDecryptionProfiles",
                        "https://docs.oracle.com/iaas/api/#/en/network-firewall/20230501/DecryptionProfile/ListDecryptionProfiles")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListDecryptionProfilesRequest::builder)
                .basePath("/20230501")
                .appendPathParam("networkFirewallPolicies")
                .appendPathParam(request.getNetworkFirewallPolicyId())
                .appendPathParam("decryptionProfiles")
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .appendQueryParam("displayName", request.getDisplayName())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.networkfirewall.model.DecryptionProfileSummaryCollection
                                .class,
                        ListDecryptionProfilesResponse.Builder::decryptionProfileSummaryCollection)
                .handleResponseHeaderString(
                        "opc-request-id", ListDecryptionProfilesResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListDecryptionProfilesResponse.Builder::opcNextPage)
                .handleResponseHeaderString(
                        "opc-prev-page", ListDecryptionProfilesResponse.Builder::opcPrevPage)
                .handleResponseHeaderString(
                        "opc-page-count", ListDecryptionProfilesResponse.Builder::opcPageCount)
                .handleResponseHeaderInteger(
                        "opc-total-items", ListDecryptionProfilesResponse.Builder::opcTotalItems)
                .operationUsesDefaultRetries()
                .callSync();
    }

    @Override
    public ListDecryptionRulesResponse listDecryptionRules(ListDecryptionRulesRequest request) {

        Validate.notBlank(
                request.getNetworkFirewallPolicyId(), "networkFirewallPolicyId must not be blank");

        return clientCall(request, ListDecryptionRulesResponse::builder)
                .logger(LOG, "listDecryptionRules")
                .serviceDetails(
                        "NetworkFirewall",
                        "ListDecryptionRules",
                        "https://docs.oracle.com/iaas/api/#/en/network-firewall/20230501/DecryptionRule/ListDecryptionRules")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListDecryptionRulesRequest::builder)
                .basePath("/20230501")
                .appendPathParam("networkFirewallPolicies")
                .appendPathParam(request.getNetworkFirewallPolicyId())
                .appendPathParam("decryptionRules")
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .appendQueryParam("displayName", request.getDisplayName())
                .appendQueryParam(
                        "decryptionRulePriorityOrder", request.getDecryptionRulePriorityOrder())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.networkfirewall.model.DecryptionRuleSummaryCollection.class,
                        ListDecryptionRulesResponse.Builder::decryptionRuleSummaryCollection)
                .handleResponseHeaderString(
                        "opc-request-id", ListDecryptionRulesResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListDecryptionRulesResponse.Builder::opcNextPage)
                .handleResponseHeaderString(
                        "opc-prev-page", ListDecryptionRulesResponse.Builder::opcPrevPage)
                .handleResponseHeaderString(
                        "opc-page-count", ListDecryptionRulesResponse.Builder::opcPageCount)
                .handleResponseHeaderInteger(
                        "opc-total-items", ListDecryptionRulesResponse.Builder::opcTotalItems)
                .operationUsesDefaultRetries()
                .callSync();
    }

    @Override
    public ListMappedSecretsResponse listMappedSecrets(ListMappedSecretsRequest request) {

        Validate.notBlank(
                request.getNetworkFirewallPolicyId(), "networkFirewallPolicyId must not be blank");

        return clientCall(request, ListMappedSecretsResponse::builder)
                .logger(LOG, "listMappedSecrets")
                .serviceDetails(
                        "NetworkFirewall",
                        "ListMappedSecrets",
                        "https://docs.oracle.com/iaas/api/#/en/network-firewall/20230501/MappedSecret/ListMappedSecrets")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListMappedSecretsRequest::builder)
                .basePath("/20230501")
                .appendPathParam("networkFirewallPolicies")
                .appendPathParam(request.getNetworkFirewallPolicyId())
                .appendPathParam("mappedSecrets")
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .appendQueryParam("displayName", request.getDisplayName())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.networkfirewall.model.MappedSecretSummaryCollection.class,
                        ListMappedSecretsResponse.Builder::mappedSecretSummaryCollection)
                .handleResponseHeaderString(
                        "opc-request-id", ListMappedSecretsResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListMappedSecretsResponse.Builder::opcNextPage)
                .handleResponseHeaderString(
                        "opc-prev-page", ListMappedSecretsResponse.Builder::opcPrevPage)
                .handleResponseHeaderString(
                        "opc-page-count", ListMappedSecretsResponse.Builder::opcPageCount)
                .handleResponseHeaderInteger(
                        "opc-total-items", ListMappedSecretsResponse.Builder::opcTotalItems)
                .operationUsesDefaultRetries()
                .callSync();
    }

    @Override
    public ListNetworkFirewallPoliciesResponse listNetworkFirewallPolicies(
            ListNetworkFirewallPoliciesRequest request) {
        Objects.requireNonNull(request.getCompartmentId(), "compartmentId is required");

        return clientCall(request, ListNetworkFirewallPoliciesResponse::builder)
                .logger(LOG, "listNetworkFirewallPolicies")
                .serviceDetails(
                        "NetworkFirewall",
                        "ListNetworkFirewallPolicies",
                        "https://docs.oracle.com/iaas/api/#/en/network-firewall/20230501/NetworkFirewallPolicy/ListNetworkFirewallPolicies")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListNetworkFirewallPoliciesRequest::builder)
                .basePath("/20230501")
                .appendPathParam("networkFirewallPolicies")
                .appendQueryParam("compartmentId", request.getCompartmentId())
                .appendQueryParam("displayName", request.getDisplayName())
                .appendQueryParam("id", request.getId())
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .appendEnumQueryParam("lifecycleState", request.getLifecycleState())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.networkfirewall.model.NetworkFirewallPolicySummaryCollection
                                .class,
                        ListNetworkFirewallPoliciesResponse.Builder
                                ::networkFirewallPolicySummaryCollection)
                .handleResponseHeaderString(
                        "opc-request-id", ListNetworkFirewallPoliciesResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListNetworkFirewallPoliciesResponse.Builder::opcNextPage)
                .handleResponseHeaderString(
                        "opc-prev-page", ListNetworkFirewallPoliciesResponse.Builder::opcPrevPage)
                .handleResponseHeaderString(
                        "opc-page-count", ListNetworkFirewallPoliciesResponse.Builder::opcPageCount)
                .handleResponseHeaderInteger(
                        "opc-total-items",
                        ListNetworkFirewallPoliciesResponse.Builder::opcTotalItems)
                .operationUsesDefaultRetries()
                .callSync();
    }

    @Override
    public ListNetworkFirewallsResponse listNetworkFirewalls(ListNetworkFirewallsRequest request) {
        Objects.requireNonNull(request.getCompartmentId(), "compartmentId is required");

        return clientCall(request, ListNetworkFirewallsResponse::builder)
                .logger(LOG, "listNetworkFirewalls")
                .serviceDetails(
                        "NetworkFirewall",
                        "ListNetworkFirewalls",
                        "https://docs.oracle.com/iaas/api/#/en/network-firewall/20230501/NetworkFirewall/ListNetworkFirewalls")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListNetworkFirewallsRequest::builder)
                .basePath("/20230501")
                .appendPathParam("networkFirewalls")
                .appendQueryParam("compartmentId", request.getCompartmentId())
                .appendQueryParam("displayName", request.getDisplayName())
                .appendQueryParam("networkFirewallPolicyId", request.getNetworkFirewallPolicyId())
                .appendQueryParam("id", request.getId())
                .appendQueryParam("availabilityDomain", request.getAvailabilityDomain())
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .appendEnumQueryParam("lifecycleState", request.getLifecycleState())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.networkfirewall.model.NetworkFirewallCollection.class,
                        ListNetworkFirewallsResponse.Builder::networkFirewallCollection)
                .handleResponseHeaderString(
                        "opc-request-id", ListNetworkFirewallsResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListNetworkFirewallsResponse.Builder::opcNextPage)
                .handleResponseHeaderString(
                        "opc-prev-page", ListNetworkFirewallsResponse.Builder::opcPrevPage)
                .handleResponseHeaderString(
                        "opc-page-count", ListNetworkFirewallsResponse.Builder::opcPageCount)
                .handleResponseHeaderInteger(
                        "opc-total-items", ListNetworkFirewallsResponse.Builder::opcTotalItems)
                .operationUsesDefaultRetries()
                .callSync();
    }

    @Override
    public ListSecurityRulesResponse listSecurityRules(ListSecurityRulesRequest request) {

        Validate.notBlank(
                request.getNetworkFirewallPolicyId(), "networkFirewallPolicyId must not be blank");

        return clientCall(request, ListSecurityRulesResponse::builder)
                .logger(LOG, "listSecurityRules")
                .serviceDetails(
                        "NetworkFirewall",
                        "ListSecurityRules",
                        "https://docs.oracle.com/iaas/api/#/en/network-firewall/20230501/SecurityRule/ListSecurityRules")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListSecurityRulesRequest::builder)
                .basePath("/20230501")
                .appendPathParam("networkFirewallPolicies")
                .appendPathParam(request.getNetworkFirewallPolicyId())
                .appendPathParam("securityRules")
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .appendQueryParam("displayName", request.getDisplayName())
                .appendQueryParam(
                        "securityRulePriorityOrder", request.getSecurityRulePriorityOrder())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.networkfirewall.model.SecurityRuleSummaryCollection.class,
                        ListSecurityRulesResponse.Builder::securityRuleSummaryCollection)
                .handleResponseHeaderString(
                        "opc-request-id", ListSecurityRulesResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListSecurityRulesResponse.Builder::opcNextPage)
                .handleResponseHeaderString(
                        "opc-prev-page", ListSecurityRulesResponse.Builder::opcPrevPage)
                .handleResponseHeaderString(
                        "opc-page-count", ListSecurityRulesResponse.Builder::opcPageCount)
                .handleResponseHeaderInteger(
                        "opc-total-items", ListSecurityRulesResponse.Builder::opcTotalItems)
                .operationUsesDefaultRetries()
                .callSync();
    }

    @Override
    public ListServiceListsResponse listServiceLists(ListServiceListsRequest request) {

        Validate.notBlank(
                request.getNetworkFirewallPolicyId(), "networkFirewallPolicyId must not be blank");

        return clientCall(request, ListServiceListsResponse::builder)
                .logger(LOG, "listServiceLists")
                .serviceDetails(
                        "NetworkFirewall",
                        "ListServiceLists",
                        "https://docs.oracle.com/iaas/api/#/en/network-firewall/20230501/ServiceList/ListServiceLists")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListServiceListsRequest::builder)
                .basePath("/20230501")
                .appendPathParam("networkFirewallPolicies")
                .appendPathParam(request.getNetworkFirewallPolicyId())
                .appendPathParam("serviceLists")
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .appendQueryParam("displayName", request.getDisplayName())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.networkfirewall.model.ServiceListSummaryCollection.class,
                        ListServiceListsResponse.Builder::serviceListSummaryCollection)
                .handleResponseHeaderString(
                        "opc-request-id", ListServiceListsResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListServiceListsResponse.Builder::opcNextPage)
                .handleResponseHeaderString(
                        "opc-prev-page", ListServiceListsResponse.Builder::opcPrevPage)
                .handleResponseHeaderString(
                        "opc-page-count", ListServiceListsResponse.Builder::opcPageCount)
                .handleResponseHeaderInteger(
                        "opc-total-items", ListServiceListsResponse.Builder::opcTotalItems)
                .operationUsesDefaultRetries()
                .callSync();
    }

    @Override
    public ListServicesResponse listServices(ListServicesRequest request) {

        Validate.notBlank(
                request.getNetworkFirewallPolicyId(), "networkFirewallPolicyId must not be blank");

        return clientCall(request, ListServicesResponse::builder)
                .logger(LOG, "listServices")
                .serviceDetails(
                        "NetworkFirewall",
                        "ListServices",
                        "https://docs.oracle.com/iaas/api/#/en/network-firewall/20230501/Service/ListServices")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListServicesRequest::builder)
                .basePath("/20230501")
                .appendPathParam("networkFirewallPolicies")
                .appendPathParam(request.getNetworkFirewallPolicyId())
                .appendPathParam("services")
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .appendQueryParam("displayName", request.getDisplayName())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.networkfirewall.model.ServiceSummaryCollection.class,
                        ListServicesResponse.Builder::serviceSummaryCollection)
                .handleResponseHeaderString(
                        "opc-request-id", ListServicesResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListServicesResponse.Builder::opcNextPage)
                .handleResponseHeaderString(
                        "opc-prev-page", ListServicesResponse.Builder::opcPrevPage)
                .handleResponseHeaderString(
                        "opc-page-count", ListServicesResponse.Builder::opcPageCount)
                .handleResponseHeaderInteger(
                        "opc-total-items", ListServicesResponse.Builder::opcTotalItems)
                .operationUsesDefaultRetries()
                .callSync();
    }

    @Override
    public ListUrlListsResponse listUrlLists(ListUrlListsRequest request) {

        Validate.notBlank(
                request.getNetworkFirewallPolicyId(), "networkFirewallPolicyId must not be blank");

        return clientCall(request, ListUrlListsResponse::builder)
                .logger(LOG, "listUrlLists")
                .serviceDetails(
                        "NetworkFirewall",
                        "ListUrlLists",
                        "https://docs.oracle.com/iaas/api/#/en/network-firewall/20230501/UrlList/ListUrlLists")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListUrlListsRequest::builder)
                .basePath("/20230501")
                .appendPathParam("networkFirewallPolicies")
                .appendPathParam(request.getNetworkFirewallPolicyId())
                .appendPathParam("urlLists")
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .appendQueryParam("displayName", request.getDisplayName())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.networkfirewall.model.UrlListSummaryCollection.class,
                        ListUrlListsResponse.Builder::urlListSummaryCollection)
                .handleResponseHeaderString(
                        "opc-request-id", ListUrlListsResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListUrlListsResponse.Builder::opcNextPage)
                .handleResponseHeaderString(
                        "opc-prev-page", ListUrlListsResponse.Builder::opcPrevPage)
                .handleResponseHeaderString(
                        "opc-page-count", ListUrlListsResponse.Builder::opcPageCount)
                .handleResponseHeaderInteger(
                        "opc-total-items", ListUrlListsResponse.Builder::opcTotalItems)
                .operationUsesDefaultRetries()
                .callSync();
    }

    @Override
    public ListWorkRequestErrorsResponse listWorkRequestErrors(
            ListWorkRequestErrorsRequest request) {

        Validate.notBlank(request.getWorkRequestId(), "workRequestId must not be blank");

        return clientCall(request, ListWorkRequestErrorsResponse::builder)
                .logger(LOG, "listWorkRequestErrors")
                .serviceDetails(
                        "NetworkFirewall",
                        "ListWorkRequestErrors",
                        "https://docs.oracle.com/iaas/api/#/en/network-firewall/20230501/WorkRequestError/ListWorkRequestErrors")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListWorkRequestErrorsRequest::builder)
                .basePath("/20230501")
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
                        com.oracle.bmc.networkfirewall.model.WorkRequestErrorCollection.class,
                        ListWorkRequestErrorsResponse.Builder::workRequestErrorCollection)
                .handleResponseHeaderString(
                        "opc-next-page", ListWorkRequestErrorsResponse.Builder::opcNextPage)
                .handleResponseHeaderString(
                        "opc-request-id", ListWorkRequestErrorsResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-prev-page", ListWorkRequestErrorsResponse.Builder::opcPrevPage)
                .operationUsesDefaultRetries()
                .callSync();
    }

    @Override
    public ListWorkRequestLogsResponse listWorkRequestLogs(ListWorkRequestLogsRequest request) {

        Validate.notBlank(request.getWorkRequestId(), "workRequestId must not be blank");

        return clientCall(request, ListWorkRequestLogsResponse::builder)
                .logger(LOG, "listWorkRequestLogs")
                .serviceDetails(
                        "NetworkFirewall",
                        "ListWorkRequestLogs",
                        "https://docs.oracle.com/iaas/api/#/en/network-firewall/20230501/WorkRequestLogEntry/ListWorkRequestLogs")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListWorkRequestLogsRequest::builder)
                .basePath("/20230501")
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
                        com.oracle.bmc.networkfirewall.model.WorkRequestLogEntryCollection.class,
                        ListWorkRequestLogsResponse.Builder::workRequestLogEntryCollection)
                .handleResponseHeaderString(
                        "opc-next-page", ListWorkRequestLogsResponse.Builder::opcNextPage)
                .handleResponseHeaderString(
                        "opc-request-id", ListWorkRequestLogsResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-prev-page", ListWorkRequestLogsResponse.Builder::opcPrevPage)
                .operationUsesDefaultRetries()
                .callSync();
    }

    @Override
    public ListWorkRequestsResponse listWorkRequests(ListWorkRequestsRequest request) {
        Objects.requireNonNull(request.getCompartmentId(), "compartmentId is required");

        return clientCall(request, ListWorkRequestsResponse::builder)
                .logger(LOG, "listWorkRequests")
                .serviceDetails(
                        "NetworkFirewall",
                        "ListWorkRequests",
                        "https://docs.oracle.com/iaas/api/#/en/network-firewall/20230501/WorkRequest/ListWorkRequests")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListWorkRequestsRequest::builder)
                .basePath("/20230501")
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
                        com.oracle.bmc.networkfirewall.model.WorkRequestSummaryCollection.class,
                        ListWorkRequestsResponse.Builder::workRequestSummaryCollection)
                .handleResponseHeaderString(
                        "opc-request-id", ListWorkRequestsResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListWorkRequestsResponse.Builder::opcNextPage)
                .handleResponseHeaderString(
                        "opc-prev-page", ListWorkRequestsResponse.Builder::opcPrevPage)
                .operationUsesDefaultRetries()
                .callSync();
    }

    @Override
    public MigrateNetworkFirewallPolicyResponse migrateNetworkFirewallPolicy(
            MigrateNetworkFirewallPolicyRequest request) {

        Validate.notBlank(
                request.getNetworkFirewallPolicyId(), "networkFirewallPolicyId must not be blank");

        return clientCall(request, MigrateNetworkFirewallPolicyResponse::builder)
                .logger(LOG, "migrateNetworkFirewallPolicy")
                .serviceDetails(
                        "NetworkFirewall",
                        "MigrateNetworkFirewallPolicy",
                        "https://docs.oracle.com/iaas/api/#/en/network-firewall/20230501/NetworkFirewallPolicy/MigrateNetworkFirewallPolicy")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(MigrateNetworkFirewallPolicyRequest::builder)
                .basePath("/20230501")
                .appendPathParam("networkFirewallPolicies")
                .appendPathParam(request.getNetworkFirewallPolicyId())
                .appendPathParam("actions")
                .appendPathParam("migrate")
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        MigrateNetworkFirewallPolicyResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id",
                        MigrateNetworkFirewallPolicyResponse.Builder::opcRequestId)
                .operationUsesDefaultRetries()
                .callSync();
    }

    @Override
    public UpdateAddressListResponse updateAddressList(UpdateAddressListRequest request) {

        Validate.notBlank(
                request.getNetworkFirewallPolicyId(), "networkFirewallPolicyId must not be blank");

        Validate.notBlank(request.getAddressListName(), "addressListName must not be blank");
        Objects.requireNonNull(
                request.getUpdateAddressListDetails(), "updateAddressListDetails is required");

        return clientCall(request, UpdateAddressListResponse::builder)
                .logger(LOG, "updateAddressList")
                .serviceDetails(
                        "NetworkFirewall",
                        "UpdateAddressList",
                        "https://docs.oracle.com/iaas/api/#/en/network-firewall/20230501/AddressList/UpdateAddressList")
                .method(com.oracle.bmc.http.client.Method.PUT)
                .requestBuilder(UpdateAddressListRequest::builder)
                .basePath("/20230501")
                .appendPathParam("networkFirewallPolicies")
                .appendPathParam(request.getNetworkFirewallPolicyId())
                .appendPathParam("addressLists")
                .appendPathParam(request.getAddressListName())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.networkfirewall.model.AddressList.class,
                        UpdateAddressListResponse.Builder::addressList)
                .handleResponseHeaderString(
                        "opc-page-count", UpdateAddressListResponse.Builder::opcPageCount)
                .handleResponseHeaderInteger(
                        "opc-total-items", UpdateAddressListResponse.Builder::opcTotalItems)
                .handleResponseHeaderString("etag", UpdateAddressListResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", UpdateAddressListResponse.Builder::opcRequestId)
                .operationUsesDefaultRetries()
                .callSync();
    }

    @Override
    public UpdateApplicationResponse updateApplication(UpdateApplicationRequest request) {

        Validate.notBlank(
                request.getNetworkFirewallPolicyId(), "networkFirewallPolicyId must not be blank");

        Validate.notBlank(request.getApplicationName(), "applicationName must not be blank");
        Objects.requireNonNull(
                request.getUpdateApplicationDetails(), "updateApplicationDetails is required");

        return clientCall(request, UpdateApplicationResponse::builder)
                .logger(LOG, "updateApplication")
                .serviceDetails(
                        "NetworkFirewall",
                        "UpdateApplication",
                        "https://docs.oracle.com/iaas/api/#/en/network-firewall/20230501/Application/UpdateApplication")
                .method(com.oracle.bmc.http.client.Method.PUT)
                .requestBuilder(UpdateApplicationRequest::builder)
                .basePath("/20230501")
                .appendPathParam("networkFirewallPolicies")
                .appendPathParam(request.getNetworkFirewallPolicyId())
                .appendPathParam("applications")
                .appendPathParam(request.getApplicationName())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.networkfirewall.model.Application.class,
                        UpdateApplicationResponse.Builder::application)
                .handleResponseHeaderString(
                        "opc-page-count", UpdateApplicationResponse.Builder::opcPageCount)
                .handleResponseHeaderInteger(
                        "opc-total-items", UpdateApplicationResponse.Builder::opcTotalItems)
                .handleResponseHeaderString("etag", UpdateApplicationResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", UpdateApplicationResponse.Builder::opcRequestId)
                .operationUsesDefaultRetries()
                .callSync();
    }

    @Override
    public UpdateApplicationGroupResponse updateApplicationGroup(
            UpdateApplicationGroupRequest request) {

        Validate.notBlank(
                request.getNetworkFirewallPolicyId(), "networkFirewallPolicyId must not be blank");

        Validate.notBlank(
                request.getApplicationGroupName(), "applicationGroupName must not be blank");
        Objects.requireNonNull(
                request.getUpdateApplicationGroupDetails(),
                "updateApplicationGroupDetails is required");

        return clientCall(request, UpdateApplicationGroupResponse::builder)
                .logger(LOG, "updateApplicationGroup")
                .serviceDetails(
                        "NetworkFirewall",
                        "UpdateApplicationGroup",
                        "https://docs.oracle.com/iaas/api/#/en/network-firewall/20230501/ApplicationGroup/UpdateApplicationGroup")
                .method(com.oracle.bmc.http.client.Method.PUT)
                .requestBuilder(UpdateApplicationGroupRequest::builder)
                .basePath("/20230501")
                .appendPathParam("networkFirewallPolicies")
                .appendPathParam(request.getNetworkFirewallPolicyId())
                .appendPathParam("applicationGroups")
                .appendPathParam(request.getApplicationGroupName())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.networkfirewall.model.ApplicationGroup.class,
                        UpdateApplicationGroupResponse.Builder::applicationGroup)
                .handleResponseHeaderString(
                        "opc-page-count", UpdateApplicationGroupResponse.Builder::opcPageCount)
                .handleResponseHeaderInteger(
                        "opc-total-items", UpdateApplicationGroupResponse.Builder::opcTotalItems)
                .handleResponseHeaderString("etag", UpdateApplicationGroupResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", UpdateApplicationGroupResponse.Builder::opcRequestId)
                .operationUsesDefaultRetries()
                .callSync();
    }

    @Override
    public UpdateDecryptionProfileResponse updateDecryptionProfile(
            UpdateDecryptionProfileRequest request) {

        Validate.notBlank(
                request.getNetworkFirewallPolicyId(), "networkFirewallPolicyId must not be blank");

        Validate.notBlank(
                request.getDecryptionProfileName(), "decryptionProfileName must not be blank");
        Objects.requireNonNull(
                request.getUpdateDecryptionProfileDetails(),
                "updateDecryptionProfileDetails is required");

        return clientCall(request, UpdateDecryptionProfileResponse::builder)
                .logger(LOG, "updateDecryptionProfile")
                .serviceDetails(
                        "NetworkFirewall",
                        "UpdateDecryptionProfile",
                        "https://docs.oracle.com/iaas/api/#/en/network-firewall/20230501/DecryptionProfile/UpdateDecryptionProfile")
                .method(com.oracle.bmc.http.client.Method.PUT)
                .requestBuilder(UpdateDecryptionProfileRequest::builder)
                .basePath("/20230501")
                .appendPathParam("networkFirewallPolicies")
                .appendPathParam(request.getNetworkFirewallPolicyId())
                .appendPathParam("decryptionProfiles")
                .appendPathParam(request.getDecryptionProfileName())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.networkfirewall.model.DecryptionProfile.class,
                        UpdateDecryptionProfileResponse.Builder::decryptionProfile)
                .handleResponseHeaderString("etag", UpdateDecryptionProfileResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", UpdateDecryptionProfileResponse.Builder::opcRequestId)
                .operationUsesDefaultRetries()
                .callSync();
    }

    @Override
    public UpdateDecryptionRuleResponse updateDecryptionRule(UpdateDecryptionRuleRequest request) {

        Validate.notBlank(
                request.getNetworkFirewallPolicyId(), "networkFirewallPolicyId must not be blank");

        Validate.notBlank(request.getDecryptionRuleName(), "decryptionRuleName must not be blank");
        Objects.requireNonNull(
                request.getUpdateDecryptionRuleDetails(),
                "updateDecryptionRuleDetails is required");

        return clientCall(request, UpdateDecryptionRuleResponse::builder)
                .logger(LOG, "updateDecryptionRule")
                .serviceDetails(
                        "NetworkFirewall",
                        "UpdateDecryptionRule",
                        "https://docs.oracle.com/iaas/api/#/en/network-firewall/20230501/DecryptionRule/UpdateDecryptionRule")
                .method(com.oracle.bmc.http.client.Method.PUT)
                .requestBuilder(UpdateDecryptionRuleRequest::builder)
                .basePath("/20230501")
                .appendPathParam("networkFirewallPolicies")
                .appendPathParam(request.getNetworkFirewallPolicyId())
                .appendPathParam("decryptionRules")
                .appendPathParam(request.getDecryptionRuleName())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.networkfirewall.model.DecryptionRule.class,
                        UpdateDecryptionRuleResponse.Builder::decryptionRule)
                .handleResponseHeaderString("etag", UpdateDecryptionRuleResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", UpdateDecryptionRuleResponse.Builder::opcRequestId)
                .operationUsesDefaultRetries()
                .callSync();
    }

    @Override
    public UpdateMappedSecretResponse updateMappedSecret(UpdateMappedSecretRequest request) {

        Validate.notBlank(
                request.getNetworkFirewallPolicyId(), "networkFirewallPolicyId must not be blank");

        Validate.notBlank(request.getMappedSecretName(), "mappedSecretName must not be blank");
        Objects.requireNonNull(
                request.getUpdateMappedSecretDetails(), "updateMappedSecretDetails is required");

        return clientCall(request, UpdateMappedSecretResponse::builder)
                .logger(LOG, "updateMappedSecret")
                .serviceDetails(
                        "NetworkFirewall",
                        "UpdateMappedSecret",
                        "https://docs.oracle.com/iaas/api/#/en/network-firewall/20230501/MappedSecret/UpdateMappedSecret")
                .method(com.oracle.bmc.http.client.Method.PUT)
                .requestBuilder(UpdateMappedSecretRequest::builder)
                .basePath("/20230501")
                .appendPathParam("networkFirewallPolicies")
                .appendPathParam(request.getNetworkFirewallPolicyId())
                .appendPathParam("mappedSecrets")
                .appendPathParam(request.getMappedSecretName())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.networkfirewall.model.MappedSecret.class,
                        UpdateMappedSecretResponse.Builder::mappedSecret)
                .handleResponseHeaderString(
                        "opc-page-count", UpdateMappedSecretResponse.Builder::opcPageCount)
                .handleResponseHeaderInteger(
                        "opc-total-items", UpdateMappedSecretResponse.Builder::opcTotalItems)
                .handleResponseHeaderString("etag", UpdateMappedSecretResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", UpdateMappedSecretResponse.Builder::opcRequestId)
                .operationUsesDefaultRetries()
                .callSync();
    }

    @Override
    public UpdateNetworkFirewallResponse updateNetworkFirewall(
            UpdateNetworkFirewallRequest request) {

        Validate.notBlank(request.getNetworkFirewallId(), "networkFirewallId must not be blank");
        Objects.requireNonNull(
                request.getUpdateNetworkFirewallDetails(),
                "updateNetworkFirewallDetails is required");

        return clientCall(request, UpdateNetworkFirewallResponse::builder)
                .logger(LOG, "updateNetworkFirewall")
                .serviceDetails(
                        "NetworkFirewall",
                        "UpdateNetworkFirewall",
                        "https://docs.oracle.com/iaas/api/#/en/network-firewall/20230501/NetworkFirewall/UpdateNetworkFirewall")
                .method(com.oracle.bmc.http.client.Method.PUT)
                .requestBuilder(UpdateNetworkFirewallRequest::builder)
                .basePath("/20230501")
                .appendPathParam("networkFirewalls")
                .appendPathParam(request.getNetworkFirewallId())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .hasBody()
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        UpdateNetworkFirewallResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", UpdateNetworkFirewallResponse.Builder::opcRequestId)
                .operationUsesDefaultRetries()
                .callSync();
    }

    @Override
    public UpdateNetworkFirewallPolicyResponse updateNetworkFirewallPolicy(
            UpdateNetworkFirewallPolicyRequest request) {

        Validate.notBlank(
                request.getNetworkFirewallPolicyId(), "networkFirewallPolicyId must not be blank");
        Objects.requireNonNull(
                request.getUpdateNetworkFirewallPolicyDetails(),
                "updateNetworkFirewallPolicyDetails is required");

        return clientCall(request, UpdateNetworkFirewallPolicyResponse::builder)
                .logger(LOG, "updateNetworkFirewallPolicy")
                .serviceDetails(
                        "NetworkFirewall",
                        "UpdateNetworkFirewallPolicy",
                        "https://docs.oracle.com/iaas/api/#/en/network-firewall/20230501/NetworkFirewallPolicy/UpdateNetworkFirewallPolicy")
                .method(com.oracle.bmc.http.client.Method.PUT)
                .requestBuilder(UpdateNetworkFirewallPolicyRequest::builder)
                .basePath("/20230501")
                .appendPathParam("networkFirewallPolicies")
                .appendPathParam(request.getNetworkFirewallPolicyId())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .hasBody()
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        UpdateNetworkFirewallPolicyResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", UpdateNetworkFirewallPolicyResponse.Builder::opcRequestId)
                .operationUsesDefaultRetries()
                .callSync();
    }

    @Override
    public UpdateSecurityRuleResponse updateSecurityRule(UpdateSecurityRuleRequest request) {

        Validate.notBlank(
                request.getNetworkFirewallPolicyId(), "networkFirewallPolicyId must not be blank");

        Validate.notBlank(request.getSecurityRuleName(), "securityRuleName must not be blank");
        Objects.requireNonNull(
                request.getUpdateSecurityRuleDetails(), "updateSecurityRuleDetails is required");

        return clientCall(request, UpdateSecurityRuleResponse::builder)
                .logger(LOG, "updateSecurityRule")
                .serviceDetails(
                        "NetworkFirewall",
                        "UpdateSecurityRule",
                        "https://docs.oracle.com/iaas/api/#/en/network-firewall/20230501/SecurityRule/UpdateSecurityRule")
                .method(com.oracle.bmc.http.client.Method.PUT)
                .requestBuilder(UpdateSecurityRuleRequest::builder)
                .basePath("/20230501")
                .appendPathParam("networkFirewallPolicies")
                .appendPathParam(request.getNetworkFirewallPolicyId())
                .appendPathParam("securityRules")
                .appendPathParam(request.getSecurityRuleName())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.networkfirewall.model.SecurityRule.class,
                        UpdateSecurityRuleResponse.Builder::securityRule)
                .handleResponseHeaderString("etag", UpdateSecurityRuleResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", UpdateSecurityRuleResponse.Builder::opcRequestId)
                .operationUsesDefaultRetries()
                .callSync();
    }

    @Override
    public UpdateServiceResponse updateService(UpdateServiceRequest request) {

        Validate.notBlank(
                request.getNetworkFirewallPolicyId(), "networkFirewallPolicyId must not be blank");

        Validate.notBlank(request.getServiceName(), "serviceName must not be blank");
        Objects.requireNonNull(
                request.getUpdateServiceDetails(), "updateServiceDetails is required");

        return clientCall(request, UpdateServiceResponse::builder)
                .logger(LOG, "updateService")
                .serviceDetails(
                        "NetworkFirewall",
                        "UpdateService",
                        "https://docs.oracle.com/iaas/api/#/en/network-firewall/20230501/Service/UpdateService")
                .method(com.oracle.bmc.http.client.Method.PUT)
                .requestBuilder(UpdateServiceRequest::builder)
                .basePath("/20230501")
                .appendPathParam("networkFirewallPolicies")
                .appendPathParam(request.getNetworkFirewallPolicyId())
                .appendPathParam("services")
                .appendPathParam(request.getServiceName())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.networkfirewall.model.Service.class,
                        UpdateServiceResponse.Builder::service)
                .handleResponseHeaderString(
                        "opc-page-count", UpdateServiceResponse.Builder::opcPageCount)
                .handleResponseHeaderInteger(
                        "opc-total-items", UpdateServiceResponse.Builder::opcTotalItems)
                .handleResponseHeaderString("etag", UpdateServiceResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", UpdateServiceResponse.Builder::opcRequestId)
                .operationUsesDefaultRetries()
                .callSync();
    }

    @Override
    public UpdateServiceListResponse updateServiceList(UpdateServiceListRequest request) {

        Validate.notBlank(
                request.getNetworkFirewallPolicyId(), "networkFirewallPolicyId must not be blank");

        Validate.notBlank(request.getServiceListName(), "serviceListName must not be blank");
        Objects.requireNonNull(
                request.getUpdateServiceListDetails(), "updateServiceListDetails is required");

        return clientCall(request, UpdateServiceListResponse::builder)
                .logger(LOG, "updateServiceList")
                .serviceDetails(
                        "NetworkFirewall",
                        "UpdateServiceList",
                        "https://docs.oracle.com/iaas/api/#/en/network-firewall/20230501/ServiceList/UpdateServiceList")
                .method(com.oracle.bmc.http.client.Method.PUT)
                .requestBuilder(UpdateServiceListRequest::builder)
                .basePath("/20230501")
                .appendPathParam("networkFirewallPolicies")
                .appendPathParam(request.getNetworkFirewallPolicyId())
                .appendPathParam("serviceLists")
                .appendPathParam(request.getServiceListName())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.networkfirewall.model.ServiceList.class,
                        UpdateServiceListResponse.Builder::serviceList)
                .handleResponseHeaderString("etag", UpdateServiceListResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", UpdateServiceListResponse.Builder::opcRequestId)
                .operationUsesDefaultRetries()
                .callSync();
    }

    @Override
    public UpdateUrlListResponse updateUrlList(UpdateUrlListRequest request) {

        Validate.notBlank(
                request.getNetworkFirewallPolicyId(), "networkFirewallPolicyId must not be blank");

        Validate.notBlank(request.getUrlListName(), "urlListName must not be blank");
        Objects.requireNonNull(
                request.getUpdateUrlListDetails(), "updateUrlListDetails is required");

        return clientCall(request, UpdateUrlListResponse::builder)
                .logger(LOG, "updateUrlList")
                .serviceDetails(
                        "NetworkFirewall",
                        "UpdateUrlList",
                        "https://docs.oracle.com/iaas/api/#/en/network-firewall/20230501/UrlList/UpdateUrlList")
                .method(com.oracle.bmc.http.client.Method.PUT)
                .requestBuilder(UpdateUrlListRequest::builder)
                .basePath("/20230501")
                .appendPathParam("networkFirewallPolicies")
                .appendPathParam(request.getNetworkFirewallPolicyId())
                .appendPathParam("urlLists")
                .appendPathParam(request.getUrlListName())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.networkfirewall.model.UrlList.class,
                        UpdateUrlListResponse.Builder::urlList)
                .handleResponseHeaderString("etag", UpdateUrlListResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", UpdateUrlListResponse.Builder::opcRequestId)
                .operationUsesDefaultRetries()
                .callSync();
    }

    @Override
    public NetworkFirewallWaiters getWaiters() {
        return waiters;
    }

    @Override
    public NetworkFirewallPaginators getPaginators() {
        return paginators;
    }

    /**
     * Create a new client instance.
     *
     * @param authenticationDetailsProvider The authentication details (see {@link Builder#build})
     * @deprecated Use the {@link #builder() builder} instead.
     */
    @Deprecated
    public NetworkFirewallClient(
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
    public NetworkFirewallClient(
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
    public NetworkFirewallClient(
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
    public NetworkFirewallClient(
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
    public NetworkFirewallClient(
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
    public NetworkFirewallClient(
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
    public NetworkFirewallClient(
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
    public NetworkFirewallClient(
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
