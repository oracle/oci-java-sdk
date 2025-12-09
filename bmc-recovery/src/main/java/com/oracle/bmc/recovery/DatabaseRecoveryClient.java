/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.recovery;

import com.oracle.bmc.util.internal.Validate;
import com.oracle.bmc.recovery.requests.*;
import com.oracle.bmc.recovery.responses.*;
import com.oracle.bmc.circuitbreaker.CircuitBreakerConfiguration;
import com.oracle.bmc.util.CircuitBreakerUtils;

import java.util.Objects;

@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20210216")
public class DatabaseRecoveryClient extends com.oracle.bmc.http.internal.BaseSyncClient
        implements DatabaseRecovery {
    /** Service instance for DatabaseRecovery. */
    public static final com.oracle.bmc.Service SERVICE =
            com.oracle.bmc.Services.serviceBuilder()
                    .serviceName(DatabaseRecoveryClient.class.getName())
                    .serviceEndpointPrefix("")
                    .serviceEndpointTemplate("https://recovery.{region}.oci.{secondLevelDomain}")
                    .build();

    private static final org.slf4j.Logger LOG =
            org.slf4j.LoggerFactory.getLogger(DatabaseRecoveryClient.class);

    private final DatabaseRecoveryWaiters waiters;

    private final DatabaseRecoveryPaginators paginators;

    DatabaseRecoveryClient(
            com.oracle.bmc.common.ClientBuilderBase<?, ?> builder,
            com.oracle.bmc.auth.AbstractAuthenticationDetailsProvider authenticationDetailsProvider,
            java.util.concurrent.ExecutorService executorService) {
        this(builder, authenticationDetailsProvider, executorService, true);
    }

    DatabaseRecoveryClient(
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
                                    .nameFormat("DatabaseRecovery-waiters-%d")
                                    .build());
            threadPoolExecutor.allowCoreThreadTimeOut(true);

            executorService = threadPoolExecutor;
        }
        this.waiters = new DatabaseRecoveryWaiters(executorService, this);

        this.paginators = new DatabaseRecoveryPaginators(this);
        if (isStreamWarningEnabled && com.oracle.bmc.util.StreamUtils.isExtraStreamLogsEnabled()) {
            LOG.warn(
                    com.oracle.bmc.util.StreamUtils.getStreamWarningMessage(
                            "DatabaseRecoveryClient", "fetchProtectedDatabaseConfiguration"));
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
            extends com.oracle.bmc.common.RegionalClientBuilder<Builder, DatabaseRecoveryClient> {
        private boolean isStreamWarningEnabled = true;
        private java.util.concurrent.ExecutorService executorService;

        private Builder(com.oracle.bmc.Service service) {
            super(service);
            final String packageName = "recovery";
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
        public DatabaseRecoveryClient build(
                @jakarta.annotation.Nonnull
                        com.oracle.bmc.auth.AbstractAuthenticationDetailsProvider
                                authenticationDetailsProvider) {
            return new DatabaseRecoveryClient(
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
    public CancelProtectedDatabaseDeletionResponse cancelProtectedDatabaseDeletion(
            CancelProtectedDatabaseDeletionRequest request) {

        Validate.notBlank(
                request.getProtectedDatabaseId(), "protectedDatabaseId must not be blank");

        return clientCall(request, CancelProtectedDatabaseDeletionResponse::builder)
                .logger(LOG, "cancelProtectedDatabaseDeletion")
                .serviceDetails(
                        "DatabaseRecovery",
                        "CancelProtectedDatabaseDeletion",
                        "https://docs.oracle.com/iaas/api/#/en/recovery-service/20210216/ProtectedDatabase/CancelProtectedDatabaseDeletion")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(CancelProtectedDatabaseDeletionRequest::builder)
                .basePath("/20210216")
                .appendPathParam("protectedDatabases")
                .appendPathParam(request.getProtectedDatabaseId())
                .appendPathParam("actions")
                .appendPathParam("cancelDeletion")
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .handleResponseHeaderString(
                        "opc-request-id",
                        CancelProtectedDatabaseDeletionResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public ChangeProtectedDatabaseCompartmentResponse changeProtectedDatabaseCompartment(
            ChangeProtectedDatabaseCompartmentRequest request) {

        Validate.notBlank(
                request.getProtectedDatabaseId(), "protectedDatabaseId must not be blank");
        Objects.requireNonNull(
                request.getChangeProtectedDatabaseCompartmentDetails(),
                "changeProtectedDatabaseCompartmentDetails is required");

        return clientCall(request, ChangeProtectedDatabaseCompartmentResponse::builder)
                .logger(LOG, "changeProtectedDatabaseCompartment")
                .serviceDetails(
                        "DatabaseRecovery",
                        "ChangeProtectedDatabaseCompartment",
                        "https://docs.oracle.com/iaas/api/#/en/recovery-service/20210216/ProtectedDatabase/ChangeProtectedDatabaseCompartment")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(ChangeProtectedDatabaseCompartmentRequest::builder)
                .basePath("/20210216")
                .appendPathParam("protectedDatabases")
                .appendPathParam(request.getProtectedDatabaseId())
                .appendPathParam("actions")
                .appendPathParam("changeCompartment")
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .hasBody()
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        ChangeProtectedDatabaseCompartmentResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id",
                        ChangeProtectedDatabaseCompartmentResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public ChangeProtectedDatabaseSubscriptionResponse changeProtectedDatabaseSubscription(
            ChangeProtectedDatabaseSubscriptionRequest request) {

        Validate.notBlank(
                request.getProtectedDatabaseId(), "protectedDatabaseId must not be blank");
        Objects.requireNonNull(
                request.getChangeProtectedDatabaseSubscriptionDetails(),
                "changeProtectedDatabaseSubscriptionDetails is required");

        return clientCall(request, ChangeProtectedDatabaseSubscriptionResponse::builder)
                .logger(LOG, "changeProtectedDatabaseSubscription")
                .serviceDetails(
                        "DatabaseRecovery",
                        "ChangeProtectedDatabaseSubscription",
                        "https://docs.oracle.com/iaas/api/#/en/recovery-service/20210216/ProtectedDatabase/ChangeProtectedDatabaseSubscription")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(ChangeProtectedDatabaseSubscriptionRequest::builder)
                .basePath("/20210216")
                .appendPathParam("protectedDatabases")
                .appendPathParam(request.getProtectedDatabaseId())
                .appendPathParam("actions")
                .appendPathParam("changeSubscription")
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("if-match", request.getIfMatch())
                .operationUsesDefaultRetries()
                .hasBody()
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        ChangeProtectedDatabaseSubscriptionResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id",
                        ChangeProtectedDatabaseSubscriptionResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public ChangeProtectionPolicyCompartmentResponse changeProtectionPolicyCompartment(
            ChangeProtectionPolicyCompartmentRequest request) {

        Validate.notBlank(request.getProtectionPolicyId(), "protectionPolicyId must not be blank");
        Objects.requireNonNull(
                request.getChangeProtectionPolicyCompartmentDetails(),
                "changeProtectionPolicyCompartmentDetails is required");

        return clientCall(request, ChangeProtectionPolicyCompartmentResponse::builder)
                .logger(LOG, "changeProtectionPolicyCompartment")
                .serviceDetails(
                        "DatabaseRecovery",
                        "ChangeProtectionPolicyCompartment",
                        "https://docs.oracle.com/iaas/api/#/en/recovery-service/20210216/ProtectionPolicy/ChangeProtectionPolicyCompartment")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(ChangeProtectionPolicyCompartmentRequest::builder)
                .basePath("/20210216")
                .appendPathParam("protectionPolicies")
                .appendPathParam(request.getProtectionPolicyId())
                .appendPathParam("actions")
                .appendPathParam("changeCompartment")
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .hasBody()
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        ChangeProtectionPolicyCompartmentResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id",
                        ChangeProtectionPolicyCompartmentResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public ChangeRecoveryServiceSubnetCompartmentResponse changeRecoveryServiceSubnetCompartment(
            ChangeRecoveryServiceSubnetCompartmentRequest request) {

        Validate.notBlank(
                request.getRecoveryServiceSubnetId(), "recoveryServiceSubnetId must not be blank");
        Objects.requireNonNull(
                request.getChangeRecoveryServiceSubnetCompartmentDetails(),
                "changeRecoveryServiceSubnetCompartmentDetails is required");

        return clientCall(request, ChangeRecoveryServiceSubnetCompartmentResponse::builder)
                .logger(LOG, "changeRecoveryServiceSubnetCompartment")
                .serviceDetails(
                        "DatabaseRecovery",
                        "ChangeRecoveryServiceSubnetCompartment",
                        "https://docs.oracle.com/iaas/api/#/en/recovery-service/20210216/RecoveryServiceSubnet/ChangeRecoveryServiceSubnetCompartment")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(ChangeRecoveryServiceSubnetCompartmentRequest::builder)
                .basePath("/20210216")
                .appendPathParam("recoveryServiceSubnets")
                .appendPathParam(request.getRecoveryServiceSubnetId())
                .appendPathParam("actions")
                .appendPathParam("changeCompartment")
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .hasBody()
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        ChangeRecoveryServiceSubnetCompartmentResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id",
                        ChangeRecoveryServiceSubnetCompartmentResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public CreateProtectedDatabaseResponse createProtectedDatabase(
            CreateProtectedDatabaseRequest request) {
        Objects.requireNonNull(
                request.getCreateProtectedDatabaseDetails(),
                "createProtectedDatabaseDetails is required");

        return clientCall(request, CreateProtectedDatabaseResponse::builder)
                .logger(LOG, "createProtectedDatabase")
                .serviceDetails(
                        "DatabaseRecovery",
                        "CreateProtectedDatabase",
                        "https://docs.oracle.com/iaas/api/#/en/recovery-service/20210216/ProtectedDatabase/CreateProtectedDatabase")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(CreateProtectedDatabaseRequest::builder)
                .basePath("/20210216")
                .appendPathParam("protectedDatabases")
                .accept("application/json")
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("opc-dry-run", request.getOpcDryRun())
                .operationUsesDefaultRetries()
                .hasBody()
                .handleBody(
                        com.oracle.bmc.recovery.model.ProtectedDatabase.class,
                        CreateProtectedDatabaseResponse.Builder::protectedDatabase)
                .handleResponseHeaderString(
                        "location", CreateProtectedDatabaseResponse.Builder::location)
                .handleResponseHeaderString("etag", CreateProtectedDatabaseResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        CreateProtectedDatabaseResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", CreateProtectedDatabaseResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public CreateProtectionPolicyResponse createProtectionPolicy(
            CreateProtectionPolicyRequest request) {
        Objects.requireNonNull(
                request.getCreateProtectionPolicyDetails(),
                "createProtectionPolicyDetails is required");

        return clientCall(request, CreateProtectionPolicyResponse::builder)
                .logger(LOG, "createProtectionPolicy")
                .serviceDetails(
                        "DatabaseRecovery",
                        "CreateProtectionPolicy",
                        "https://docs.oracle.com/iaas/api/#/en/recovery-service/20210216/ProtectionPolicy/CreateProtectionPolicy")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(CreateProtectionPolicyRequest::builder)
                .basePath("/20210216")
                .appendPathParam("protectionPolicies")
                .accept("application/json")
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .hasBody()
                .handleBody(
                        com.oracle.bmc.recovery.model.ProtectionPolicy.class,
                        CreateProtectionPolicyResponse.Builder::protectionPolicy)
                .handleResponseHeaderString(
                        "location", CreateProtectionPolicyResponse.Builder::location)
                .handleResponseHeaderString("etag", CreateProtectionPolicyResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        CreateProtectionPolicyResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", CreateProtectionPolicyResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public CreateRecoveryServiceSubnetResponse createRecoveryServiceSubnet(
            CreateRecoveryServiceSubnetRequest request) {
        Objects.requireNonNull(
                request.getCreateRecoveryServiceSubnetDetails(),
                "createRecoveryServiceSubnetDetails is required");

        return clientCall(request, CreateRecoveryServiceSubnetResponse::builder)
                .logger(LOG, "createRecoveryServiceSubnet")
                .serviceDetails(
                        "DatabaseRecovery",
                        "CreateRecoveryServiceSubnet",
                        "https://docs.oracle.com/iaas/api/#/en/recovery-service/20210216/RecoveryServiceSubnet/CreateRecoveryServiceSubnet")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(CreateRecoveryServiceSubnetRequest::builder)
                .basePath("/20210216")
                .appendPathParam("recoveryServiceSubnets")
                .accept("application/json")
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .hasBody()
                .handleBody(
                        com.oracle.bmc.recovery.model.RecoveryServiceSubnet.class,
                        CreateRecoveryServiceSubnetResponse.Builder::recoveryServiceSubnet)
                .handleResponseHeaderString(
                        "location", CreateRecoveryServiceSubnetResponse.Builder::location)
                .handleResponseHeaderString(
                        "etag", CreateRecoveryServiceSubnetResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        CreateRecoveryServiceSubnetResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", CreateRecoveryServiceSubnetResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public DeleteProtectedDatabaseResponse deleteProtectedDatabase(
            DeleteProtectedDatabaseRequest request) {

        Validate.notBlank(
                request.getProtectedDatabaseId(), "protectedDatabaseId must not be blank");

        return clientCall(request, DeleteProtectedDatabaseResponse::builder)
                .logger(LOG, "deleteProtectedDatabase")
                .serviceDetails(
                        "DatabaseRecovery",
                        "DeleteProtectedDatabase",
                        "https://docs.oracle.com/iaas/api/#/en/recovery-service/20210216/ProtectedDatabase/DeleteProtectedDatabase")
                .method(com.oracle.bmc.http.client.Method.DELETE)
                .requestBuilder(DeleteProtectedDatabaseRequest::builder)
                .basePath("/20210216")
                .appendPathParam("protectedDatabases")
                .appendPathParam(request.getProtectedDatabaseId())
                .appendEnumQueryParam("deletionSchedule", request.getDeletionSchedule())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        DeleteProtectedDatabaseResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", DeleteProtectedDatabaseResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public DeleteProtectionPolicyResponse deleteProtectionPolicy(
            DeleteProtectionPolicyRequest request) {

        Validate.notBlank(request.getProtectionPolicyId(), "protectionPolicyId must not be blank");

        return clientCall(request, DeleteProtectionPolicyResponse::builder)
                .logger(LOG, "deleteProtectionPolicy")
                .serviceDetails(
                        "DatabaseRecovery",
                        "DeleteProtectionPolicy",
                        "https://docs.oracle.com/iaas/api/#/en/recovery-service/20210216/ProtectionPolicy/DeleteProtectionPolicy")
                .method(com.oracle.bmc.http.client.Method.DELETE)
                .requestBuilder(DeleteProtectionPolicyRequest::builder)
                .basePath("/20210216")
                .appendPathParam("protectionPolicies")
                .appendPathParam(request.getProtectionPolicyId())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        DeleteProtectionPolicyResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", DeleteProtectionPolicyResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public DeleteRecoveryServiceSubnetResponse deleteRecoveryServiceSubnet(
            DeleteRecoveryServiceSubnetRequest request) {

        Validate.notBlank(
                request.getRecoveryServiceSubnetId(), "recoveryServiceSubnetId must not be blank");

        return clientCall(request, DeleteRecoveryServiceSubnetResponse::builder)
                .logger(LOG, "deleteRecoveryServiceSubnet")
                .serviceDetails(
                        "DatabaseRecovery",
                        "DeleteRecoveryServiceSubnet",
                        "https://docs.oracle.com/iaas/api/#/en/recovery-service/20210216/RecoveryServiceSubnet/DeleteRecoveryServiceSubnet")
                .method(com.oracle.bmc.http.client.Method.DELETE)
                .requestBuilder(DeleteRecoveryServiceSubnetRequest::builder)
                .basePath("/20210216")
                .appendPathParam("recoveryServiceSubnets")
                .appendPathParam(request.getRecoveryServiceSubnetId())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        DeleteRecoveryServiceSubnetResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", DeleteRecoveryServiceSubnetResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public FetchProtectedDatabaseConfigurationResponse fetchProtectedDatabaseConfiguration(
            FetchProtectedDatabaseConfigurationRequest request) {

        Validate.notBlank(
                request.getProtectedDatabaseId(), "protectedDatabaseId must not be blank");

        return clientCall(request, FetchProtectedDatabaseConfigurationResponse::builder)
                .logger(LOG, "fetchProtectedDatabaseConfiguration")
                .serviceDetails(
                        "DatabaseRecovery",
                        "FetchProtectedDatabaseConfiguration",
                        "https://docs.oracle.com/iaas/api/#/en/recovery-service/20210216/ProtectedDatabase/FetchProtectedDatabaseConfiguration")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(FetchProtectedDatabaseConfigurationRequest::builder)
                .basePath("/20210216")
                .appendPathParam("protectedDatabases")
                .appendPathParam(request.getProtectedDatabaseId())
                .appendPathParam("actions")
                .appendPathParam("getConfiguration")
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("if-match", request.getIfMatch())
                .operationUsesDefaultRetries()
                .hasBody()
                .handleBody(
                        java.io.InputStream.class,
                        FetchProtectedDatabaseConfigurationResponse.Builder::inputStream)
                .handleResponseHeaderString(
                        "etag", FetchProtectedDatabaseConfigurationResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id",
                        FetchProtectedDatabaseConfigurationResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-filename",
                        FetchProtectedDatabaseConfigurationResponse.Builder::opcFilename)
                .handleResponseHeaderString(
                        "opc-checksum",
                        FetchProtectedDatabaseConfigurationResponse.Builder::opcChecksum)
                .callSync();
    }

    @Override
    public GetProtectedDatabaseResponse getProtectedDatabase(GetProtectedDatabaseRequest request) {

        Validate.notBlank(
                request.getProtectedDatabaseId(), "protectedDatabaseId must not be blank");

        return clientCall(request, GetProtectedDatabaseResponse::builder)
                .logger(LOG, "getProtectedDatabase")
                .serviceDetails(
                        "DatabaseRecovery",
                        "GetProtectedDatabase",
                        "https://docs.oracle.com/iaas/api/#/en/recovery-service/20210216/ProtectedDatabase/GetProtectedDatabase")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetProtectedDatabaseRequest::builder)
                .basePath("/20210216")
                .appendPathParam("protectedDatabases")
                .appendPathParam(request.getProtectedDatabaseId())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .handleBody(
                        com.oracle.bmc.recovery.model.ProtectedDatabase.class,
                        GetProtectedDatabaseResponse.Builder::protectedDatabase)
                .handleResponseHeaderString("etag", GetProtectedDatabaseResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", GetProtectedDatabaseResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public GetProtectionPolicyResponse getProtectionPolicy(GetProtectionPolicyRequest request) {

        Validate.notBlank(request.getProtectionPolicyId(), "protectionPolicyId must not be blank");

        return clientCall(request, GetProtectionPolicyResponse::builder)
                .logger(LOG, "getProtectionPolicy")
                .serviceDetails(
                        "DatabaseRecovery",
                        "GetProtectionPolicy",
                        "https://docs.oracle.com/iaas/api/#/en/recovery-service/20210216/ProtectionPolicy/GetProtectionPolicy")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetProtectionPolicyRequest::builder)
                .basePath("/20210216")
                .appendPathParam("protectionPolicies")
                .appendPathParam(request.getProtectionPolicyId())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .handleBody(
                        com.oracle.bmc.recovery.model.ProtectionPolicy.class,
                        GetProtectionPolicyResponse.Builder::protectionPolicy)
                .handleResponseHeaderString("etag", GetProtectionPolicyResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", GetProtectionPolicyResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public GetRecoveryServiceSubnetResponse getRecoveryServiceSubnet(
            GetRecoveryServiceSubnetRequest request) {

        Validate.notBlank(
                request.getRecoveryServiceSubnetId(), "recoveryServiceSubnetId must not be blank");

        return clientCall(request, GetRecoveryServiceSubnetResponse::builder)
                .logger(LOG, "getRecoveryServiceSubnet")
                .serviceDetails(
                        "DatabaseRecovery",
                        "GetRecoveryServiceSubnet",
                        "https://docs.oracle.com/iaas/api/#/en/recovery-service/20210216/RecoveryServiceSubnet/GetRecoveryServiceSubnet")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetRecoveryServiceSubnetRequest::builder)
                .basePath("/20210216")
                .appendPathParam("recoveryServiceSubnets")
                .appendPathParam(request.getRecoveryServiceSubnetId())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .handleBody(
                        com.oracle.bmc.recovery.model.RecoveryServiceSubnet.class,
                        GetRecoveryServiceSubnetResponse.Builder::recoveryServiceSubnet)
                .handleResponseHeaderString("etag", GetRecoveryServiceSubnetResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", GetRecoveryServiceSubnetResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public GetWorkRequestResponse getWorkRequest(GetWorkRequestRequest request) {

        Validate.notBlank(request.getWorkRequestId(), "workRequestId must not be blank");

        return clientCall(request, GetWorkRequestResponse::builder)
                .logger(LOG, "getWorkRequest")
                .serviceDetails(
                        "DatabaseRecovery",
                        "GetWorkRequest",
                        "https://docs.oracle.com/iaas/api/#/en/recovery-service/20210216/WorkRequest/GetWorkRequest")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetWorkRequestRequest::builder)
                .basePath("/20210216")
                .appendPathParam("workRequests")
                .appendPathParam(request.getWorkRequestId())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .handleBody(
                        com.oracle.bmc.recovery.model.WorkRequest.class,
                        GetWorkRequestResponse.Builder::workRequest)
                .handleResponseHeaderString(
                        "opc-request-id", GetWorkRequestResponse.Builder::opcRequestId)
                .handleResponseHeaderInteger(
                        "retry-after", GetWorkRequestResponse.Builder::retryAfter)
                .callSync();
    }

    @Override
    public ListProtectedDatabasesResponse listProtectedDatabases(
            ListProtectedDatabasesRequest request) {
        Objects.requireNonNull(request.getCompartmentId(), "compartmentId is required");

        return clientCall(request, ListProtectedDatabasesResponse::builder)
                .logger(LOG, "listProtectedDatabases")
                .serviceDetails(
                        "DatabaseRecovery",
                        "ListProtectedDatabases",
                        "https://docs.oracle.com/iaas/api/#/en/recovery-service/20210216/ProtectedDatabaseCollection/ListProtectedDatabases")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListProtectedDatabasesRequest::builder)
                .basePath("/20210216")
                .appendPathParam("protectedDatabases")
                .appendQueryParam("compartmentId", request.getCompartmentId())
                .appendEnumQueryParam("lifecycleState", request.getLifecycleState())
                .appendQueryParam("displayName", request.getDisplayName())
                .appendQueryParam("id", request.getId())
                .appendQueryParam("protectionPolicyId", request.getProtectionPolicyId())
                .appendQueryParam("recoveryServiceSubnetId", request.getRecoveryServiceSubnetId())
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .handleBody(
                        com.oracle.bmc.recovery.model.ProtectedDatabaseCollection.class,
                        ListProtectedDatabasesResponse.Builder::protectedDatabaseCollection)
                .handleResponseHeaderString(
                        "opc-request-id", ListProtectedDatabasesResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListProtectedDatabasesResponse.Builder::opcNextPage)
                .callSync();
    }

    @Override
    public ListProtectionPoliciesResponse listProtectionPolicies(
            ListProtectionPoliciesRequest request) {
        Objects.requireNonNull(request.getCompartmentId(), "compartmentId is required");

        return clientCall(request, ListProtectionPoliciesResponse::builder)
                .logger(LOG, "listProtectionPolicies")
                .serviceDetails(
                        "DatabaseRecovery",
                        "ListProtectionPolicies",
                        "https://docs.oracle.com/iaas/api/#/en/recovery-service/20210216/ProtectionPolicyCollection/ListProtectionPolicies")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListProtectionPoliciesRequest::builder)
                .basePath("/20210216")
                .appendPathParam("protectionPolicies")
                .appendQueryParam("compartmentId", request.getCompartmentId())
                .appendEnumQueryParam("lifecycleState", request.getLifecycleState())
                .appendQueryParam("displayName", request.getDisplayName())
                .appendQueryParam("protectionPolicyId", request.getProtectionPolicyId())
                .appendEnumQueryParam("owner", request.getOwner())
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .handleBody(
                        com.oracle.bmc.recovery.model.ProtectionPolicyCollection.class,
                        ListProtectionPoliciesResponse.Builder::protectionPolicyCollection)
                .handleResponseHeaderString(
                        "opc-request-id", ListProtectionPoliciesResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListProtectionPoliciesResponse.Builder::opcNextPage)
                .callSync();
    }

    @Override
    public ListRecoveryServiceSubnetsResponse listRecoveryServiceSubnets(
            ListRecoveryServiceSubnetsRequest request) {
        Objects.requireNonNull(request.getCompartmentId(), "compartmentId is required");

        return clientCall(request, ListRecoveryServiceSubnetsResponse::builder)
                .logger(LOG, "listRecoveryServiceSubnets")
                .serviceDetails(
                        "DatabaseRecovery",
                        "ListRecoveryServiceSubnets",
                        "https://docs.oracle.com/iaas/api/#/en/recovery-service/20210216/RecoveryServiceSubnetCollection/ListRecoveryServiceSubnets")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListRecoveryServiceSubnetsRequest::builder)
                .basePath("/20210216")
                .appendPathParam("recoveryServiceSubnets")
                .appendQueryParam("compartmentId", request.getCompartmentId())
                .appendEnumQueryParam("lifecycleState", request.getLifecycleState())
                .appendQueryParam("displayName", request.getDisplayName())
                .appendQueryParam("id", request.getId())
                .appendQueryParam("vcnId", request.getVcnId())
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .handleBody(
                        com.oracle.bmc.recovery.model.RecoveryServiceSubnetCollection.class,
                        ListRecoveryServiceSubnetsResponse.Builder::recoveryServiceSubnetCollection)
                .handleResponseHeaderString(
                        "opc-request-id", ListRecoveryServiceSubnetsResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListRecoveryServiceSubnetsResponse.Builder::opcNextPage)
                .callSync();
    }

    @Override
    public ListWorkRequestErrorsResponse listWorkRequestErrors(
            ListWorkRequestErrorsRequest request) {

        Validate.notBlank(request.getWorkRequestId(), "workRequestId must not be blank");

        return clientCall(request, ListWorkRequestErrorsResponse::builder)
                .logger(LOG, "listWorkRequestErrors")
                .serviceDetails(
                        "DatabaseRecovery",
                        "ListWorkRequestErrors",
                        "https://docs.oracle.com/iaas/api/#/en/recovery-service/20210216/WorkRequestErrorCollection/ListWorkRequestErrors")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListWorkRequestErrorsRequest::builder)
                .basePath("/20210216")
                .appendPathParam("workRequests")
                .appendPathParam(request.getWorkRequestId())
                .appendPathParam("errors")
                .appendQueryParam("page", request.getPage())
                .appendQueryParam("limit", request.getLimit())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .handleBody(
                        com.oracle.bmc.recovery.model.WorkRequestErrorCollection.class,
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
                        "DatabaseRecovery",
                        "ListWorkRequestLogs",
                        "https://docs.oracle.com/iaas/api/#/en/recovery-service/20210216/WorkRequestLogEntryCollection/ListWorkRequestLogs")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListWorkRequestLogsRequest::builder)
                .basePath("/20210216")
                .appendPathParam("workRequests")
                .appendPathParam(request.getWorkRequestId())
                .appendPathParam("logs")
                .appendQueryParam("page", request.getPage())
                .appendQueryParam("limit", request.getLimit())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .handleBody(
                        com.oracle.bmc.recovery.model.WorkRequestLogEntryCollection.class,
                        ListWorkRequestLogsResponse.Builder::workRequestLogEntryCollection)
                .handleResponseHeaderString(
                        "opc-next-page", ListWorkRequestLogsResponse.Builder::opcNextPage)
                .handleResponseHeaderString(
                        "opc-request-id", ListWorkRequestLogsResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public ListWorkRequestsResponse listWorkRequests(ListWorkRequestsRequest request) {
        Objects.requireNonNull(request.getCompartmentId(), "compartmentId is required");

        return clientCall(request, ListWorkRequestsResponse::builder)
                .logger(LOG, "listWorkRequests")
                .serviceDetails(
                        "DatabaseRecovery",
                        "ListWorkRequests",
                        "https://docs.oracle.com/iaas/api/#/en/recovery-service/20210216/WorkRequestSummaryCollection/ListWorkRequests")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListWorkRequestsRequest::builder)
                .basePath("/20210216")
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
                .operationUsesDefaultRetries()
                .handleBody(
                        com.oracle.bmc.recovery.model.WorkRequestSummaryCollection.class,
                        ListWorkRequestsResponse.Builder::workRequestSummaryCollection)
                .handleResponseHeaderString(
                        "opc-request-id", ListWorkRequestsResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListWorkRequestsResponse.Builder::opcNextPage)
                .callSync();
    }

    @Override
    public ScheduleProtectedDatabaseDeletionResponse scheduleProtectedDatabaseDeletion(
            ScheduleProtectedDatabaseDeletionRequest request) {

        Validate.notBlank(
                request.getProtectedDatabaseId(), "protectedDatabaseId must not be blank");

        return clientCall(request, ScheduleProtectedDatabaseDeletionResponse::builder)
                .logger(LOG, "scheduleProtectedDatabaseDeletion")
                .serviceDetails(
                        "DatabaseRecovery",
                        "ScheduleProtectedDatabaseDeletion",
                        "https://docs.oracle.com/iaas/api/#/en/recovery-service/20210216/ProtectedDatabase/ScheduleProtectedDatabaseDeletion")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(ScheduleProtectedDatabaseDeletionRequest::builder)
                .basePath("/20210216")
                .appendPathParam("protectedDatabases")
                .appendPathParam(request.getProtectedDatabaseId())
                .appendPathParam("actions")
                .appendPathParam("scheduleDeletion")
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .hasBody()
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        ScheduleProtectedDatabaseDeletionResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id",
                        ScheduleProtectedDatabaseDeletionResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public UpdateProtectedDatabaseResponse updateProtectedDatabase(
            UpdateProtectedDatabaseRequest request) {

        Validate.notBlank(
                request.getProtectedDatabaseId(), "protectedDatabaseId must not be blank");
        Objects.requireNonNull(
                request.getUpdateProtectedDatabaseDetails(),
                "updateProtectedDatabaseDetails is required");

        return clientCall(request, UpdateProtectedDatabaseResponse::builder)
                .logger(LOG, "updateProtectedDatabase")
                .serviceDetails(
                        "DatabaseRecovery",
                        "UpdateProtectedDatabase",
                        "https://docs.oracle.com/iaas/api/#/en/recovery-service/20210216/ProtectedDatabase/UpdateProtectedDatabase")
                .method(com.oracle.bmc.http.client.Method.PUT)
                .requestBuilder(UpdateProtectedDatabaseRequest::builder)
                .basePath("/20210216")
                .appendPathParam("protectedDatabases")
                .appendPathParam(request.getProtectedDatabaseId())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .hasBody()
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        UpdateProtectedDatabaseResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", UpdateProtectedDatabaseResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public UpdateProtectionPolicyResponse updateProtectionPolicy(
            UpdateProtectionPolicyRequest request) {

        Validate.notBlank(request.getProtectionPolicyId(), "protectionPolicyId must not be blank");
        Objects.requireNonNull(
                request.getUpdateProtectionPolicyDetails(),
                "updateProtectionPolicyDetails is required");

        return clientCall(request, UpdateProtectionPolicyResponse::builder)
                .logger(LOG, "updateProtectionPolicy")
                .serviceDetails(
                        "DatabaseRecovery",
                        "UpdateProtectionPolicy",
                        "https://docs.oracle.com/iaas/api/#/en/recovery-service/20210216/ProtectionPolicy/UpdateProtectionPolicy")
                .method(com.oracle.bmc.http.client.Method.PUT)
                .requestBuilder(UpdateProtectionPolicyRequest::builder)
                .basePath("/20210216")
                .appendPathParam("protectionPolicies")
                .appendPathParam(request.getProtectionPolicyId())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .hasBody()
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        UpdateProtectionPolicyResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", UpdateProtectionPolicyResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public UpdateRecoveryServiceSubnetResponse updateRecoveryServiceSubnet(
            UpdateRecoveryServiceSubnetRequest request) {

        Validate.notBlank(
                request.getRecoveryServiceSubnetId(), "recoveryServiceSubnetId must not be blank");
        Objects.requireNonNull(
                request.getUpdateRecoveryServiceSubnetDetails(),
                "updateRecoveryServiceSubnetDetails is required");

        return clientCall(request, UpdateRecoveryServiceSubnetResponse::builder)
                .logger(LOG, "updateRecoveryServiceSubnet")
                .serviceDetails(
                        "DatabaseRecovery",
                        "UpdateRecoveryServiceSubnet",
                        "https://docs.oracle.com/iaas/api/#/en/recovery-service/20210216/RecoveryServiceSubnet/UpdateRecoveryServiceSubnet")
                .method(com.oracle.bmc.http.client.Method.PUT)
                .requestBuilder(UpdateRecoveryServiceSubnetRequest::builder)
                .basePath("/20210216")
                .appendPathParam("recoveryServiceSubnets")
                .appendPathParam(request.getRecoveryServiceSubnetId())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .hasBody()
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        UpdateRecoveryServiceSubnetResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", UpdateRecoveryServiceSubnetResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public DatabaseRecoveryWaiters getWaiters() {
        return waiters;
    }

    @Override
    public DatabaseRecoveryPaginators getPaginators() {
        return paginators;
    }

    /**
     * Create a new client instance.
     *
     * @param authenticationDetailsProvider The authentication details (see {@link Builder#build})
     * @deprecated Use the {@link #builder() builder} instead.
     */
    @Deprecated
    public DatabaseRecoveryClient(
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
    public DatabaseRecoveryClient(
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
    public DatabaseRecoveryClient(
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
    public DatabaseRecoveryClient(
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
    public DatabaseRecoveryClient(
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
    public DatabaseRecoveryClient(
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
    public DatabaseRecoveryClient(
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
    public DatabaseRecoveryClient(
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
