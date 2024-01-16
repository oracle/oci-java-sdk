/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.adm;

import com.oracle.bmc.util.internal.Validate;
import com.oracle.bmc.adm.requests.*;
import com.oracle.bmc.adm.responses.*;
import com.oracle.bmc.circuitbreaker.CircuitBreakerConfiguration;
import com.oracle.bmc.util.CircuitBreakerUtils;

import java.util.Objects;

@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20220421")
public class ApplicationDependencyManagementClient
        extends com.oracle.bmc.http.internal.BaseSyncClient
        implements ApplicationDependencyManagement {
    /** Service instance for ApplicationDependencyManagement. */
    public static final com.oracle.bmc.Service SERVICE =
            com.oracle.bmc.Services.serviceBuilder()
                    .serviceName("APPLICATIONDEPENDENCYMANAGEMENT")
                    .serviceEndpointPrefix("")
                    .serviceEndpointTemplate("https://adm.{region}.oci.{secondLevelDomain}")
                    .build();

    private static final org.slf4j.Logger LOG =
            org.slf4j.LoggerFactory.getLogger(ApplicationDependencyManagementClient.class);

    private final ApplicationDependencyManagementWaiters waiters;

    private final ApplicationDependencyManagementPaginators paginators;

    ApplicationDependencyManagementClient(
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
                                    .nameFormat("ApplicationDependencyManagement-waiters-%d")
                                    .build());
            threadPoolExecutor.allowCoreThreadTimeOut(true);

            executorService = threadPoolExecutor;
        }
        this.waiters = new ApplicationDependencyManagementWaiters(executorService, this);

        this.paginators = new ApplicationDependencyManagementPaginators(this);
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
                    Builder, ApplicationDependencyManagementClient> {
        private java.util.concurrent.ExecutorService executorService;

        private Builder(com.oracle.bmc.Service service) {
            super(service);
            final String packageName = "adm";
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
        public ApplicationDependencyManagementClient build(
                @jakarta.annotation.Nonnull
                        com.oracle.bmc.auth.AbstractAuthenticationDetailsProvider
                                authenticationDetailsProvider) {
            return new ApplicationDependencyManagementClient(
                    this, authenticationDetailsProvider, executorService);
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
    public ActivateRemediationRecipeResponse activateRemediationRecipe(
            ActivateRemediationRecipeRequest request) {

        Validate.notBlank(
                request.getRemediationRecipeId(), "remediationRecipeId must not be blank");

        return clientCall(request, ActivateRemediationRecipeResponse::builder)
                .logger(LOG, "activateRemediationRecipe")
                .serviceDetails(
                        "ApplicationDependencyManagement",
                        "ActivateRemediationRecipe",
                        "https://docs.oracle.com/iaas/api/#/en/adm/20220421/RemediationRecipe/ActivateRemediationRecipe")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(ActivateRemediationRecipeRequest::builder)
                .basePath("/20220421")
                .appendPathParam("remediationRecipes")
                .appendPathParam(request.getRemediationRecipeId())
                .appendPathParam("actions")
                .appendPathParam("activate")
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        ActivateRemediationRecipeResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", ActivateRemediationRecipeResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public CancelRemediationRunResponse cancelRemediationRun(CancelRemediationRunRequest request) {

        Validate.notBlank(request.getRemediationRunId(), "remediationRunId must not be blank");

        return clientCall(request, CancelRemediationRunResponse::builder)
                .logger(LOG, "cancelRemediationRun")
                .serviceDetails(
                        "ApplicationDependencyManagement",
                        "CancelRemediationRun",
                        "https://docs.oracle.com/iaas/api/#/en/adm/20220421/RemediationRun/CancelRemediationRun")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(CancelRemediationRunRequest::builder)
                .basePath("/20220421")
                .appendPathParam("remediationRuns")
                .appendPathParam(request.getRemediationRunId())
                .appendPathParam("actions")
                .appendPathParam("cancel")
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .operationUsesDefaultRetries()
                .handleBody(
                        com.oracle.bmc.adm.model.RemediationRun.class,
                        CancelRemediationRunResponse.Builder::remediationRun)
                .handleResponseHeaderString(
                        "opc-request-id", CancelRemediationRunResponse.Builder::opcRequestId)
                .handleResponseHeaderString("etag", CancelRemediationRunResponse.Builder::etag)
                .callSync();
    }

    @Override
    public CancelWorkRequestResponse cancelWorkRequest(CancelWorkRequestRequest request) {

        Validate.notBlank(request.getWorkRequestId(), "workRequestId must not be blank");

        return clientCall(request, CancelWorkRequestResponse::builder)
                .logger(LOG, "cancelWorkRequest")
                .serviceDetails(
                        "ApplicationDependencyManagement",
                        "CancelWorkRequest",
                        "https://docs.oracle.com/iaas/api/#/en/adm/20220421/WorkRequest/CancelWorkRequest")
                .method(com.oracle.bmc.http.client.Method.DELETE)
                .requestBuilder(CancelWorkRequestRequest::builder)
                .basePath("/20220421")
                .appendPathParam("workRequests")
                .appendPathParam(request.getWorkRequestId())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .handleResponseHeaderString(
                        "opc-request-id", CancelWorkRequestResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public ChangeKnowledgeBaseCompartmentResponse changeKnowledgeBaseCompartment(
            ChangeKnowledgeBaseCompartmentRequest request) {

        Validate.notBlank(request.getKnowledgeBaseId(), "knowledgeBaseId must not be blank");
        Objects.requireNonNull(
                request.getChangeKnowledgeBaseCompartmentDetails(),
                "changeKnowledgeBaseCompartmentDetails is required");

        return clientCall(request, ChangeKnowledgeBaseCompartmentResponse::builder)
                .logger(LOG, "changeKnowledgeBaseCompartment")
                .serviceDetails(
                        "ApplicationDependencyManagement",
                        "ChangeKnowledgeBaseCompartment",
                        "https://docs.oracle.com/iaas/api/#/en/adm/20220421/KnowledgeBase/ChangeKnowledgeBaseCompartment")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(ChangeKnowledgeBaseCompartmentRequest::builder)
                .basePath("/20220421")
                .appendPathParam("knowledgeBases")
                .appendPathParam(request.getKnowledgeBaseId())
                .appendPathParam("actions")
                .appendPathParam("changeCompartment")
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .operationUsesDefaultRetries()
                .hasBody()
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        ChangeKnowledgeBaseCompartmentResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id",
                        ChangeKnowledgeBaseCompartmentResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public ChangeRemediationRecipeCompartmentResponse changeRemediationRecipeCompartment(
            ChangeRemediationRecipeCompartmentRequest request) {

        Validate.notBlank(
                request.getRemediationRecipeId(), "remediationRecipeId must not be blank");
        Objects.requireNonNull(
                request.getChangeRemediationRecipeCompartmentDetails(),
                "changeRemediationRecipeCompartmentDetails is required");

        return clientCall(request, ChangeRemediationRecipeCompartmentResponse::builder)
                .logger(LOG, "changeRemediationRecipeCompartment")
                .serviceDetails(
                        "ApplicationDependencyManagement",
                        "ChangeRemediationRecipeCompartment",
                        "https://docs.oracle.com/iaas/api/#/en/adm/20220421/RemediationRecipe/ChangeRemediationRecipeCompartment")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(ChangeRemediationRecipeCompartmentRequest::builder)
                .basePath("/20220421")
                .appendPathParam("remediationRecipes")
                .appendPathParam(request.getRemediationRecipeId())
                .appendPathParam("actions")
                .appendPathParam("changeCompartment")
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .operationUsesDefaultRetries()
                .hasBody()
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        ChangeRemediationRecipeCompartmentResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id",
                        ChangeRemediationRecipeCompartmentResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public ChangeRemediationRunCompartmentResponse changeRemediationRunCompartment(
            ChangeRemediationRunCompartmentRequest request) {

        Validate.notBlank(request.getRemediationRunId(), "remediationRunId must not be blank");
        Objects.requireNonNull(
                request.getChangeRemediationRunCompartmentDetails(),
                "changeRemediationRunCompartmentDetails is required");

        return clientCall(request, ChangeRemediationRunCompartmentResponse::builder)
                .logger(LOG, "changeRemediationRunCompartment")
                .serviceDetails(
                        "ApplicationDependencyManagement",
                        "ChangeRemediationRunCompartment",
                        "https://docs.oracle.com/iaas/api/#/en/adm/20220421/RemediationRun/ChangeRemediationRunCompartment")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(ChangeRemediationRunCompartmentRequest::builder)
                .basePath("/20220421")
                .appendPathParam("remediationRuns")
                .appendPathParam(request.getRemediationRunId())
                .appendPathParam("actions")
                .appendPathParam("changeCompartment")
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .operationUsesDefaultRetries()
                .hasBody()
                .handleResponseHeaderString(
                        "opc-request-id",
                        ChangeRemediationRunCompartmentResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public ChangeVulnerabilityAuditCompartmentResponse changeVulnerabilityAuditCompartment(
            ChangeVulnerabilityAuditCompartmentRequest request) {

        Validate.notBlank(
                request.getVulnerabilityAuditId(), "vulnerabilityAuditId must not be blank");
        Objects.requireNonNull(
                request.getChangeVulnerabilityAuditCompartmentDetails(),
                "changeVulnerabilityAuditCompartmentDetails is required");

        return clientCall(request, ChangeVulnerabilityAuditCompartmentResponse::builder)
                .logger(LOG, "changeVulnerabilityAuditCompartment")
                .serviceDetails(
                        "ApplicationDependencyManagement",
                        "ChangeVulnerabilityAuditCompartment",
                        "https://docs.oracle.com/iaas/api/#/en/adm/20220421/VulnerabilityAudit/ChangeVulnerabilityAuditCompartment")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(ChangeVulnerabilityAuditCompartmentRequest::builder)
                .basePath("/20220421")
                .appendPathParam("vulnerabilityAudits")
                .appendPathParam(request.getVulnerabilityAuditId())
                .appendPathParam("actions")
                .appendPathParam("changeCompartment")
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .operationUsesDefaultRetries()
                .hasBody()
                .handleResponseHeaderString(
                        "opc-request-id",
                        ChangeVulnerabilityAuditCompartmentResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public CreateKnowledgeBaseResponse createKnowledgeBase(CreateKnowledgeBaseRequest request) {
        Objects.requireNonNull(
                request.getCreateKnowledgeBaseDetails(), "createKnowledgeBaseDetails is required");

        return clientCall(request, CreateKnowledgeBaseResponse::builder)
                .logger(LOG, "createKnowledgeBase")
                .serviceDetails(
                        "ApplicationDependencyManagement",
                        "CreateKnowledgeBase",
                        "https://docs.oracle.com/iaas/api/#/en/adm/20220421/KnowledgeBase/CreateKnowledgeBase")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(CreateKnowledgeBaseRequest::builder)
                .basePath("/20220421")
                .appendPathParam("knowledgeBases")
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .operationUsesDefaultRetries()
                .hasBody()
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        CreateKnowledgeBaseResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", CreateKnowledgeBaseResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public CreateRemediationRecipeResponse createRemediationRecipe(
            CreateRemediationRecipeRequest request) {
        Objects.requireNonNull(
                request.getCreateRemediationRecipeDetails(),
                "createRemediationRecipeDetails is required");

        return clientCall(request, CreateRemediationRecipeResponse::builder)
                .logger(LOG, "createRemediationRecipe")
                .serviceDetails(
                        "ApplicationDependencyManagement",
                        "CreateRemediationRecipe",
                        "https://docs.oracle.com/iaas/api/#/en/adm/20220421/RemediationRecipe/CreateRemediationRecipe")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(CreateRemediationRecipeRequest::builder)
                .basePath("/20220421")
                .appendPathParam("remediationRecipes")
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .operationUsesDefaultRetries()
                .hasBody()
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        CreateRemediationRecipeResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", CreateRemediationRecipeResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public CreateRemediationRunResponse createRemediationRun(CreateRemediationRunRequest request) {
        Objects.requireNonNull(
                request.getCreateRemediationRunDetails(),
                "createRemediationRunDetails is required");

        return clientCall(request, CreateRemediationRunResponse::builder)
                .logger(LOG, "createRemediationRun")
                .serviceDetails(
                        "ApplicationDependencyManagement",
                        "CreateRemediationRun",
                        "https://docs.oracle.com/iaas/api/#/en/adm/20220421/RemediationRun/CreateRemediationRun")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(CreateRemediationRunRequest::builder)
                .basePath("/20220421")
                .appendPathParam("remediationRuns")
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .operationUsesDefaultRetries()
                .hasBody()
                .handleBody(
                        com.oracle.bmc.adm.model.RemediationRun.class,
                        CreateRemediationRunResponse.Builder::remediationRun)
                .handleResponseHeaderString("etag", CreateRemediationRunResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", CreateRemediationRunResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public CreateVulnerabilityAuditResponse createVulnerabilityAudit(
            CreateVulnerabilityAuditRequest request) {
        Objects.requireNonNull(
                request.getCreateVulnerabilityAuditDetails(),
                "createVulnerabilityAuditDetails is required");

        return clientCall(request, CreateVulnerabilityAuditResponse::builder)
                .logger(LOG, "createVulnerabilityAudit")
                .serviceDetails(
                        "ApplicationDependencyManagement",
                        "CreateVulnerabilityAudit",
                        "https://docs.oracle.com/iaas/api/#/en/adm/20220421/VulnerabilityAudit/CreateVulnerabilityAudit")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(CreateVulnerabilityAuditRequest::builder)
                .basePath("/20220421")
                .appendPathParam("vulnerabilityAudits")
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("if-match", request.getIfMatch())
                .operationUsesDefaultRetries()
                .hasBody()
                .handleBody(
                        com.oracle.bmc.adm.model.VulnerabilityAudit.class,
                        CreateVulnerabilityAuditResponse.Builder::vulnerabilityAudit)
                .handleResponseHeaderString("etag", CreateVulnerabilityAuditResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", CreateVulnerabilityAuditResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public DeactivateRemediationRecipeResponse deactivateRemediationRecipe(
            DeactivateRemediationRecipeRequest request) {

        Validate.notBlank(
                request.getRemediationRecipeId(), "remediationRecipeId must not be blank");

        return clientCall(request, DeactivateRemediationRecipeResponse::builder)
                .logger(LOG, "deactivateRemediationRecipe")
                .serviceDetails(
                        "ApplicationDependencyManagement",
                        "DeactivateRemediationRecipe",
                        "https://docs.oracle.com/iaas/api/#/en/adm/20220421/RemediationRecipe/DeactivateRemediationRecipe")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(DeactivateRemediationRecipeRequest::builder)
                .basePath("/20220421")
                .appendPathParam("remediationRecipes")
                .appendPathParam(request.getRemediationRecipeId())
                .appendPathParam("actions")
                .appendPathParam("deactivate")
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        DeactivateRemediationRecipeResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", DeactivateRemediationRecipeResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public DeleteKnowledgeBaseResponse deleteKnowledgeBase(DeleteKnowledgeBaseRequest request) {

        Validate.notBlank(request.getKnowledgeBaseId(), "knowledgeBaseId must not be blank");

        return clientCall(request, DeleteKnowledgeBaseResponse::builder)
                .logger(LOG, "deleteKnowledgeBase")
                .serviceDetails(
                        "ApplicationDependencyManagement",
                        "DeleteKnowledgeBase",
                        "https://docs.oracle.com/iaas/api/#/en/adm/20220421/KnowledgeBase/DeleteKnowledgeBase")
                .method(com.oracle.bmc.http.client.Method.DELETE)
                .requestBuilder(DeleteKnowledgeBaseRequest::builder)
                .basePath("/20220421")
                .appendPathParam("knowledgeBases")
                .appendPathParam(request.getKnowledgeBaseId())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        DeleteKnowledgeBaseResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", DeleteKnowledgeBaseResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public DeleteRemediationRecipeResponse deleteRemediationRecipe(
            DeleteRemediationRecipeRequest request) {

        Validate.notBlank(
                request.getRemediationRecipeId(), "remediationRecipeId must not be blank");

        return clientCall(request, DeleteRemediationRecipeResponse::builder)
                .logger(LOG, "deleteRemediationRecipe")
                .serviceDetails(
                        "ApplicationDependencyManagement",
                        "DeleteRemediationRecipe",
                        "https://docs.oracle.com/iaas/api/#/en/adm/20220421/RemediationRecipe/DeleteRemediationRecipe")
                .method(com.oracle.bmc.http.client.Method.DELETE)
                .requestBuilder(DeleteRemediationRecipeRequest::builder)
                .basePath("/20220421")
                .appendPathParam("remediationRecipes")
                .appendPathParam(request.getRemediationRecipeId())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        DeleteRemediationRecipeResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", DeleteRemediationRecipeResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public DeleteRemediationRunResponse deleteRemediationRun(DeleteRemediationRunRequest request) {

        Validate.notBlank(request.getRemediationRunId(), "remediationRunId must not be blank");

        return clientCall(request, DeleteRemediationRunResponse::builder)
                .logger(LOG, "deleteRemediationRun")
                .serviceDetails(
                        "ApplicationDependencyManagement",
                        "DeleteRemediationRun",
                        "https://docs.oracle.com/iaas/api/#/en/adm/20220421/RemediationRun/DeleteRemediationRun")
                .method(com.oracle.bmc.http.client.Method.DELETE)
                .requestBuilder(DeleteRemediationRunRequest::builder)
                .basePath("/20220421")
                .appendPathParam("remediationRuns")
                .appendPathParam(request.getRemediationRunId())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .handleResponseHeaderString(
                        "opc-request-id", DeleteRemediationRunResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public DeleteVulnerabilityAuditResponse deleteVulnerabilityAudit(
            DeleteVulnerabilityAuditRequest request) {

        Validate.notBlank(
                request.getVulnerabilityAuditId(), "vulnerabilityAuditId must not be blank");

        return clientCall(request, DeleteVulnerabilityAuditResponse::builder)
                .logger(LOG, "deleteVulnerabilityAudit")
                .serviceDetails(
                        "ApplicationDependencyManagement",
                        "DeleteVulnerabilityAudit",
                        "https://docs.oracle.com/iaas/api/#/en/adm/20220421/VulnerabilityAudit/DeleteVulnerabilityAudit")
                .method(com.oracle.bmc.http.client.Method.DELETE)
                .requestBuilder(DeleteVulnerabilityAuditRequest::builder)
                .basePath("/20220421")
                .appendPathParam("vulnerabilityAudits")
                .appendPathParam(request.getVulnerabilityAuditId())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .handleResponseHeaderString(
                        "opc-request-id", DeleteVulnerabilityAuditResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public GetKnowledgeBaseResponse getKnowledgeBase(GetKnowledgeBaseRequest request) {

        Validate.notBlank(request.getKnowledgeBaseId(), "knowledgeBaseId must not be blank");

        return clientCall(request, GetKnowledgeBaseResponse::builder)
                .logger(LOG, "getKnowledgeBase")
                .serviceDetails(
                        "ApplicationDependencyManagement",
                        "GetKnowledgeBase",
                        "https://docs.oracle.com/iaas/api/#/en/adm/20220421/KnowledgeBase/GetKnowledgeBase")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetKnowledgeBaseRequest::builder)
                .basePath("/20220421")
                .appendPathParam("knowledgeBases")
                .appendPathParam(request.getKnowledgeBaseId())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .handleBody(
                        com.oracle.bmc.adm.model.KnowledgeBase.class,
                        GetKnowledgeBaseResponse.Builder::knowledgeBase)
                .handleResponseHeaderString(
                        "opc-request-id", GetKnowledgeBaseResponse.Builder::opcRequestId)
                .handleResponseHeaderString("etag", GetKnowledgeBaseResponse.Builder::etag)
                .callSync();
    }

    @Override
    public GetRemediationRecipeResponse getRemediationRecipe(GetRemediationRecipeRequest request) {

        Validate.notBlank(
                request.getRemediationRecipeId(), "remediationRecipeId must not be blank");

        return clientCall(request, GetRemediationRecipeResponse::builder)
                .logger(LOG, "getRemediationRecipe")
                .serviceDetails(
                        "ApplicationDependencyManagement",
                        "GetRemediationRecipe",
                        "https://docs.oracle.com/iaas/api/#/en/adm/20220421/RemediationRecipe/GetRemediationRecipe")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetRemediationRecipeRequest::builder)
                .basePath("/20220421")
                .appendPathParam("remediationRecipes")
                .appendPathParam(request.getRemediationRecipeId())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .handleBody(
                        com.oracle.bmc.adm.model.RemediationRecipe.class,
                        GetRemediationRecipeResponse.Builder::remediationRecipe)
                .handleResponseHeaderString(
                        "opc-request-id", GetRemediationRecipeResponse.Builder::opcRequestId)
                .handleResponseHeaderString("etag", GetRemediationRecipeResponse.Builder::etag)
                .callSync();
    }

    @Override
    public GetRemediationRunResponse getRemediationRun(GetRemediationRunRequest request) {

        Validate.notBlank(request.getRemediationRunId(), "remediationRunId must not be blank");

        return clientCall(request, GetRemediationRunResponse::builder)
                .logger(LOG, "getRemediationRun")
                .serviceDetails(
                        "ApplicationDependencyManagement",
                        "GetRemediationRun",
                        "https://docs.oracle.com/iaas/api/#/en/adm/20220421/RemediationRun/GetRemediationRun")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetRemediationRunRequest::builder)
                .basePath("/20220421")
                .appendPathParam("remediationRuns")
                .appendPathParam(request.getRemediationRunId())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .handleBody(
                        com.oracle.bmc.adm.model.RemediationRun.class,
                        GetRemediationRunResponse.Builder::remediationRun)
                .handleResponseHeaderString(
                        "opc-request-id", GetRemediationRunResponse.Builder::opcRequestId)
                .handleResponseHeaderString("etag", GetRemediationRunResponse.Builder::etag)
                .callSync();
    }

    @Override
    public GetStageResponse getStage(GetStageRequest request) {

        Validate.notBlank(request.getRemediationRunId(), "remediationRunId must not be blank");

        Validate.notBlank(request.getStageType().getValue(), "stageType must not be blank");

        return clientCall(request, GetStageResponse::builder)
                .logger(LOG, "getStage")
                .serviceDetails(
                        "ApplicationDependencyManagement",
                        "GetStage",
                        "https://docs.oracle.com/iaas/api/#/en/adm/20220421/RemediationRunStage/GetStage")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetStageRequest::builder)
                .basePath("/20220421")
                .appendPathParam("remediationRuns")
                .appendPathParam(request.getRemediationRunId())
                .appendPathParam("stages")
                .appendPathParam(request.getStageType().getValue())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .handleBody(
                        com.oracle.bmc.adm.model.RemediationRunStage.class,
                        GetStageResponse.Builder::remediationRunStage)
                .handleResponseHeaderString(
                        "opc-request-id", GetStageResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public GetVulnerabilityAuditResponse getVulnerabilityAudit(
            GetVulnerabilityAuditRequest request) {

        Validate.notBlank(
                request.getVulnerabilityAuditId(), "vulnerabilityAuditId must not be blank");

        return clientCall(request, GetVulnerabilityAuditResponse::builder)
                .logger(LOG, "getVulnerabilityAudit")
                .serviceDetails(
                        "ApplicationDependencyManagement",
                        "GetVulnerabilityAudit",
                        "https://docs.oracle.com/iaas/api/#/en/adm/20220421/VulnerabilityAudit/GetVulnerabilityAudit")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetVulnerabilityAuditRequest::builder)
                .basePath("/20220421")
                .appendPathParam("vulnerabilityAudits")
                .appendPathParam(request.getVulnerabilityAuditId())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .handleBody(
                        com.oracle.bmc.adm.model.VulnerabilityAudit.class,
                        GetVulnerabilityAuditResponse.Builder::vulnerabilityAudit)
                .handleResponseHeaderString("etag", GetVulnerabilityAuditResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", GetVulnerabilityAuditResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public GetWorkRequestResponse getWorkRequest(GetWorkRequestRequest request) {

        Validate.notBlank(request.getWorkRequestId(), "workRequestId must not be blank");

        return clientCall(request, GetWorkRequestResponse::builder)
                .logger(LOG, "getWorkRequest")
                .serviceDetails(
                        "ApplicationDependencyManagement",
                        "GetWorkRequest",
                        "https://docs.oracle.com/iaas/api/#/en/adm/20220421/WorkRequest/GetWorkRequest")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetWorkRequestRequest::builder)
                .basePath("/20220421")
                .appendPathParam("workRequests")
                .appendPathParam(request.getWorkRequestId())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .handleBody(
                        com.oracle.bmc.adm.model.WorkRequest.class,
                        GetWorkRequestResponse.Builder::workRequest)
                .handleResponseHeaderString("etag", GetWorkRequestResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", GetWorkRequestResponse.Builder::opcRequestId)
                .handleResponseHeaderInteger(
                        "retry-after", GetWorkRequestResponse.Builder::retryAfter)
                .callSync();
    }

    @Override
    public ListApplicationDependencyRecommendationsResponse
            listApplicationDependencyRecommendations(
                    ListApplicationDependencyRecommendationsRequest request) {

        Validate.notBlank(request.getRemediationRunId(), "remediationRunId must not be blank");

        return clientCall(request, ListApplicationDependencyRecommendationsResponse::builder)
                .logger(LOG, "listApplicationDependencyRecommendations")
                .serviceDetails(
                        "ApplicationDependencyManagement",
                        "ListApplicationDependencyRecommendations",
                        "https://docs.oracle.com/iaas/api/#/en/adm/20220421/RemediationRun/ListApplicationDependencyRecommendations")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListApplicationDependencyRecommendationsRequest::builder)
                .basePath("/20220421")
                .appendPathParam("remediationRuns")
                .appendPathParam(request.getRemediationRunId())
                .appendPathParam("applicationDependencyRecommendations")
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .appendQueryParam("gav", request.getGav())
                .appendQueryParam("purl", request.getPurl())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .handleBody(
                        com.oracle.bmc.adm.model.ApplicationDependencyRecommendationCollection
                                .class,
                        ListApplicationDependencyRecommendationsResponse.Builder
                                ::applicationDependencyRecommendationCollection)
                .handleResponseHeaderString(
                        "opc-request-id",
                        ListApplicationDependencyRecommendationsResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page",
                        ListApplicationDependencyRecommendationsResponse.Builder::opcNextPage)
                .callSync();
    }

    @Override
    public ListApplicationDependencyVulnerabilitiesResponse
            listApplicationDependencyVulnerabilities(
                    ListApplicationDependencyVulnerabilitiesRequest request) {

        Validate.notBlank(
                request.getVulnerabilityAuditId(), "vulnerabilityAuditId must not be blank");

        return clientCall(request, ListApplicationDependencyVulnerabilitiesResponse::builder)
                .logger(LOG, "listApplicationDependencyVulnerabilities")
                .serviceDetails(
                        "ApplicationDependencyManagement",
                        "ListApplicationDependencyVulnerabilities",
                        "https://docs.oracle.com/iaas/api/#/en/adm/20220421/VulnerabilityAudit/ListApplicationDependencyVulnerabilities")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListApplicationDependencyVulnerabilitiesRequest::builder)
                .basePath("/20220421")
                .appendPathParam("vulnerabilityAudits")
                .appendPathParam(request.getVulnerabilityAuditId())
                .appendPathParam("applicationDependencyVulnerabilities")
                .appendQueryParam("vulnerabilityId", request.getVulnerabilityId())
                .appendQueryParam("cvssV3GreaterThanOrEqual", request.getCvssV3GreaterThanOrEqual())
                .appendQueryParam("cvssV2GreaterThanOrEqual", request.getCvssV2GreaterThanOrEqual())
                .appendEnumQueryParam(
                        "severityGreaterThanOrEqual", request.getSeverityGreaterThanOrEqual())
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .appendQueryParam("rootNodeId", request.getRootNodeId())
                .appendQueryParam("depth", request.getDepth())
                .appendQueryParam("gav", request.getGav())
                .appendQueryParam("purl", request.getPurl())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .handleBody(
                        com.oracle.bmc.adm.model.ApplicationDependencyVulnerabilityCollection.class,
                        ListApplicationDependencyVulnerabilitiesResponse.Builder
                                ::applicationDependencyVulnerabilityCollection)
                .handleResponseHeaderString(
                        "opc-request-id",
                        ListApplicationDependencyVulnerabilitiesResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page",
                        ListApplicationDependencyVulnerabilitiesResponse.Builder::opcNextPage)
                .callSync();
    }

    @Override
    public ListKnowledgeBasesResponse listKnowledgeBases(ListKnowledgeBasesRequest request) {

        return clientCall(request, ListKnowledgeBasesResponse::builder)
                .logger(LOG, "listKnowledgeBases")
                .serviceDetails(
                        "ApplicationDependencyManagement",
                        "ListKnowledgeBases",
                        "https://docs.oracle.com/iaas/api/#/en/adm/20220421/KnowledgeBase/ListKnowledgeBases")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListKnowledgeBasesRequest::builder)
                .basePath("/20220421")
                .appendPathParam("knowledgeBases")
                .appendQueryParam("id", request.getId())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .appendEnumQueryParam("lifecycleState", request.getLifecycleState())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .appendQueryParam("displayName", request.getDisplayName())
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .appendQueryParam("compartmentId", request.getCompartmentId())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .handleBody(
                        com.oracle.bmc.adm.model.KnowledgeBaseCollection.class,
                        ListKnowledgeBasesResponse.Builder::knowledgeBaseCollection)
                .handleResponseHeaderString(
                        "opc-request-id", ListKnowledgeBasesResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListKnowledgeBasesResponse.Builder::opcNextPage)
                .callSync();
    }

    @Override
    public ListRemediationRecipesResponse listRemediationRecipes(
            ListRemediationRecipesRequest request) {

        return clientCall(request, ListRemediationRecipesResponse::builder)
                .logger(LOG, "listRemediationRecipes")
                .serviceDetails(
                        "ApplicationDependencyManagement",
                        "ListRemediationRecipes",
                        "https://docs.oracle.com/iaas/api/#/en/adm/20220421/RemediationRecipe/ListRemediationRecipes")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListRemediationRecipesRequest::builder)
                .basePath("/20220421")
                .appendPathParam("remediationRecipes")
                .appendQueryParam("id", request.getId())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .appendEnumQueryParam("lifecycleState", request.getLifecycleState())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .appendQueryParam("displayName", request.getDisplayName())
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .appendQueryParam("compartmentId", request.getCompartmentId())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .handleBody(
                        com.oracle.bmc.adm.model.RemediationRecipeCollection.class,
                        ListRemediationRecipesResponse.Builder::remediationRecipeCollection)
                .handleResponseHeaderString(
                        "opc-request-id", ListRemediationRecipesResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListRemediationRecipesResponse.Builder::opcNextPage)
                .callSync();
    }

    @Override
    public ListRemediationRunsResponse listRemediationRuns(ListRemediationRunsRequest request) {

        return clientCall(request, ListRemediationRunsResponse::builder)
                .logger(LOG, "listRemediationRuns")
                .serviceDetails(
                        "ApplicationDependencyManagement",
                        "ListRemediationRuns",
                        "https://docs.oracle.com/iaas/api/#/en/adm/20220421/RemediationRun/ListRemediationRuns")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListRemediationRunsRequest::builder)
                .basePath("/20220421")
                .appendPathParam("remediationRuns")
                .appendQueryParam("id", request.getId())
                .appendQueryParam("remediationRecipeId", request.getRemediationRecipeId())
                .appendEnumQueryParam("lifecycleState", request.getLifecycleState())
                .appendQueryParam("displayName", request.getDisplayName())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .appendQueryParam("compartmentId", request.getCompartmentId())
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .handleBody(
                        com.oracle.bmc.adm.model.RemediationRunCollection.class,
                        ListRemediationRunsResponse.Builder::remediationRunCollection)
                .handleResponseHeaderString(
                        "opc-request-id", ListRemediationRunsResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListRemediationRunsResponse.Builder::opcNextPage)
                .callSync();
    }

    @Override
    public ListStagesResponse listStages(ListStagesRequest request) {

        Validate.notBlank(request.getRemediationRunId(), "remediationRunId must not be blank");

        return clientCall(request, ListStagesResponse::builder)
                .logger(LOG, "listStages")
                .serviceDetails(
                        "ApplicationDependencyManagement",
                        "ListStages",
                        "https://docs.oracle.com/iaas/api/#/en/adm/20220421/RemediationRunStage/ListStages")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListStagesRequest::builder)
                .basePath("/20220421")
                .appendPathParam("remediationRuns")
                .appendPathParam(request.getRemediationRunId())
                .appendPathParam("stages")
                .appendEnumQueryParam("type", request.getType())
                .appendEnumQueryParam("status", request.getStatus())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .handleBody(
                        com.oracle.bmc.adm.model.RemediationRunStageCollection.class,
                        ListStagesResponse.Builder::remediationRunStageCollection)
                .handleResponseHeaderString(
                        "opc-request-id", ListStagesResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListStagesResponse.Builder::opcNextPage)
                .callSync();
    }

    @Override
    public ListVulnerabilityAuditsResponse listVulnerabilityAudits(
            ListVulnerabilityAuditsRequest request) {

        return clientCall(request, ListVulnerabilityAuditsResponse::builder)
                .logger(LOG, "listVulnerabilityAudits")
                .serviceDetails(
                        "ApplicationDependencyManagement",
                        "ListVulnerabilityAudits",
                        "https://docs.oracle.com/iaas/api/#/en/adm/20220421/VulnerabilityAudit/ListVulnerabilityAudits")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListVulnerabilityAuditsRequest::builder)
                .basePath("/20220421")
                .appendPathParam("vulnerabilityAudits")
                .appendQueryParam("id", request.getId())
                .appendQueryParam("compartmentId", request.getCompartmentId())
                .appendQueryParam("knowledgeBaseId", request.getKnowledgeBaseId())
                .appendQueryParam("isSuccess", request.getIsSuccess())
                .appendEnumQueryParam("lifecycleState", request.getLifecycleState())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .appendQueryParam("displayName", request.getDisplayName())
                .appendQueryParam(
                        "timeCreatedGreaterThanOrEqualTo",
                        request.getTimeCreatedGreaterThanOrEqualTo())
                .appendQueryParam(
                        "timeCreatedLessThanOrEqualTo", request.getTimeCreatedLessThanOrEqualTo())
                .appendEnumQueryParam(
                        "maxObservedSeverityGreaterThanOrEqualTo",
                        request.getMaxObservedSeverityGreaterThanOrEqualTo())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .handleBody(
                        com.oracle.bmc.adm.model.VulnerabilityAuditCollection.class,
                        ListVulnerabilityAuditsResponse.Builder::vulnerabilityAuditCollection)
                .handleResponseHeaderString(
                        "opc-request-id", ListVulnerabilityAuditsResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListVulnerabilityAuditsResponse.Builder::opcNextPage)
                .callSync();
    }

    @Override
    public ListWorkRequestErrorsResponse listWorkRequestErrors(
            ListWorkRequestErrorsRequest request) {

        Validate.notBlank(request.getWorkRequestId(), "workRequestId must not be blank");

        return clientCall(request, ListWorkRequestErrorsResponse::builder)
                .logger(LOG, "listWorkRequestErrors")
                .serviceDetails(
                        "ApplicationDependencyManagement",
                        "ListWorkRequestErrors",
                        "https://docs.oracle.com/iaas/api/#/en/adm/20220421/WorkRequestError/ListWorkRequestErrors")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListWorkRequestErrorsRequest::builder)
                .basePath("/20220421")
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
                        com.oracle.bmc.adm.model.WorkRequestErrorCollection.class,
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
                        "ApplicationDependencyManagement",
                        "ListWorkRequestLogs",
                        "https://docs.oracle.com/iaas/api/#/en/adm/20220421/WorkRequestLogEntry/ListWorkRequestLogs")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListWorkRequestLogsRequest::builder)
                .basePath("/20220421")
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
                        com.oracle.bmc.adm.model.WorkRequestLogEntryCollection.class,
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
                        "ApplicationDependencyManagement",
                        "ListWorkRequests",
                        "https://docs.oracle.com/iaas/api/#/en/adm/20220421/WorkRequest/ListWorkRequests")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListWorkRequestsRequest::builder)
                .basePath("/20220421")
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
                        com.oracle.bmc.adm.model.WorkRequestSummaryCollection.class,
                        ListWorkRequestsResponse.Builder::workRequestSummaryCollection)
                .handleResponseHeaderString(
                        "opc-request-id", ListWorkRequestsResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListWorkRequestsResponse.Builder::opcNextPage)
                .callSync();
    }

    @Override
    public UpdateKnowledgeBaseResponse updateKnowledgeBase(UpdateKnowledgeBaseRequest request) {

        Validate.notBlank(request.getKnowledgeBaseId(), "knowledgeBaseId must not be blank");
        Objects.requireNonNull(
                request.getUpdateKnowledgeBaseDetails(), "updateKnowledgeBaseDetails is required");

        return clientCall(request, UpdateKnowledgeBaseResponse::builder)
                .logger(LOG, "updateKnowledgeBase")
                .serviceDetails(
                        "ApplicationDependencyManagement",
                        "UpdateKnowledgeBase",
                        "https://docs.oracle.com/iaas/api/#/en/adm/20220421/KnowledgeBase/UpdateKnowledgeBase")
                .method(com.oracle.bmc.http.client.Method.PUT)
                .requestBuilder(UpdateKnowledgeBaseRequest::builder)
                .basePath("/20220421")
                .appendPathParam("knowledgeBases")
                .appendPathParam(request.getKnowledgeBaseId())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .hasBody()
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        UpdateKnowledgeBaseResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", UpdateKnowledgeBaseResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public UpdateRemediationRecipeResponse updateRemediationRecipe(
            UpdateRemediationRecipeRequest request) {

        Validate.notBlank(
                request.getRemediationRecipeId(), "remediationRecipeId must not be blank");
        Objects.requireNonNull(
                request.getUpdateRemediationRecipeDetails(),
                "updateRemediationRecipeDetails is required");

        return clientCall(request, UpdateRemediationRecipeResponse::builder)
                .logger(LOG, "updateRemediationRecipe")
                .serviceDetails(
                        "ApplicationDependencyManagement",
                        "UpdateRemediationRecipe",
                        "https://docs.oracle.com/iaas/api/#/en/adm/20220421/RemediationRecipe/UpdateRemediationRecipe")
                .method(com.oracle.bmc.http.client.Method.PUT)
                .requestBuilder(UpdateRemediationRecipeRequest::builder)
                .basePath("/20220421")
                .appendPathParam("remediationRecipes")
                .appendPathParam(request.getRemediationRecipeId())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .hasBody()
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        UpdateRemediationRecipeResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", UpdateRemediationRecipeResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public UpdateRemediationRunResponse updateRemediationRun(UpdateRemediationRunRequest request) {

        Validate.notBlank(request.getRemediationRunId(), "remediationRunId must not be blank");
        Objects.requireNonNull(
                request.getUpdateRemediationRunDetails(),
                "updateRemediationRunDetails is required");

        return clientCall(request, UpdateRemediationRunResponse::builder)
                .logger(LOG, "updateRemediationRun")
                .serviceDetails(
                        "ApplicationDependencyManagement",
                        "UpdateRemediationRun",
                        "https://docs.oracle.com/iaas/api/#/en/adm/20220421/RemediationRun/UpdateRemediationRun")
                .method(com.oracle.bmc.http.client.Method.PUT)
                .requestBuilder(UpdateRemediationRunRequest::builder)
                .basePath("/20220421")
                .appendPathParam("remediationRuns")
                .appendPathParam(request.getRemediationRunId())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .hasBody()
                .handleBody(
                        com.oracle.bmc.adm.model.RemediationRun.class,
                        UpdateRemediationRunResponse.Builder::remediationRun)
                .handleResponseHeaderString("etag", UpdateRemediationRunResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", UpdateRemediationRunResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public UpdateVulnerabilityAuditResponse updateVulnerabilityAudit(
            UpdateVulnerabilityAuditRequest request) {

        Validate.notBlank(
                request.getVulnerabilityAuditId(), "vulnerabilityAuditId must not be blank");
        Objects.requireNonNull(
                request.getUpdateVulnerabilityAuditDetails(),
                "updateVulnerabilityAuditDetails is required");

        return clientCall(request, UpdateVulnerabilityAuditResponse::builder)
                .logger(LOG, "updateVulnerabilityAudit")
                .serviceDetails(
                        "ApplicationDependencyManagement",
                        "UpdateVulnerabilityAudit",
                        "https://docs.oracle.com/iaas/api/#/en/adm/20220421/VulnerabilityAudit/UpdateVulnerabilityAudit")
                .method(com.oracle.bmc.http.client.Method.PUT)
                .requestBuilder(UpdateVulnerabilityAuditRequest::builder)
                .basePath("/20220421")
                .appendPathParam("vulnerabilityAudits")
                .appendPathParam(request.getVulnerabilityAuditId())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .hasBody()
                .handleBody(
                        com.oracle.bmc.adm.model.VulnerabilityAudit.class,
                        UpdateVulnerabilityAuditResponse.Builder::vulnerabilityAudit)
                .handleResponseHeaderString("etag", UpdateVulnerabilityAuditResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", UpdateVulnerabilityAuditResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public ApplicationDependencyManagementWaiters getWaiters() {
        return waiters;
    }

    @Override
    public ApplicationDependencyManagementPaginators getPaginators() {
        return paginators;
    }

    /**
     * Create a new client instance.
     *
     * @param authenticationDetailsProvider The authentication details (see {@link Builder#build})
     * @deprecated Use the {@link #builder() builder} instead.
     */
    @Deprecated
    public ApplicationDependencyManagementClient(
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
    public ApplicationDependencyManagementClient(
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
    public ApplicationDependencyManagementClient(
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
    public ApplicationDependencyManagementClient(
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
    public ApplicationDependencyManagementClient(
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
    public ApplicationDependencyManagementClient(
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
    public ApplicationDependencyManagementClient(
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
    public ApplicationDependencyManagementClient(
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
