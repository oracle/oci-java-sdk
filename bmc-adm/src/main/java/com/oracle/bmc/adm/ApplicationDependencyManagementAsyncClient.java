/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.adm;

import com.oracle.bmc.util.internal.Validate;
import com.oracle.bmc.adm.requests.*;
import com.oracle.bmc.adm.responses.*;

import java.util.Objects;

/**
 * Async client implementation for ApplicationDependencyManagement service. <br>
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
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20220421")
public class ApplicationDependencyManagementAsyncClient
        extends com.oracle.bmc.http.internal.BaseAsyncClient
        implements ApplicationDependencyManagementAsync {
    /** Service instance for ApplicationDependencyManagement. */
    public static final com.oracle.bmc.Service SERVICE =
            com.oracle.bmc.Services.serviceBuilder()
                    .serviceName("APPLICATIONDEPENDENCYMANAGEMENT")
                    .serviceEndpointPrefix("")
                    .serviceEndpointTemplate("https://adm.{region}.oci.{secondLevelDomain}")
                    .build();

    private static final org.slf4j.Logger LOG =
            org.slf4j.LoggerFactory.getLogger(ApplicationDependencyManagementAsyncClient.class);

    ApplicationDependencyManagementAsyncClient(
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
                    Builder, ApplicationDependencyManagementAsyncClient> {
        private Builder(com.oracle.bmc.Service service) {
            super(service);
            final String packageName = "adm";
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
        public ApplicationDependencyManagementAsyncClient build(
                @jakarta.annotation.Nonnull
                        com.oracle.bmc.auth.AbstractAuthenticationDetailsProvider
                                authenticationDetailsProvider) {
            return new ApplicationDependencyManagementAsyncClient(
                    this, authenticationDetailsProvider);
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
    public java.util.concurrent.Future<ActivateRemediationRecipeResponse> activateRemediationRecipe(
            ActivateRemediationRecipeRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ActivateRemediationRecipeRequest, ActivateRemediationRecipeResponse>
                    handler) {

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
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        ActivateRemediationRecipeResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", ActivateRemediationRecipeResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<CancelRemediationRunResponse> cancelRemediationRun(
            CancelRemediationRunRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            CancelRemediationRunRequest, CancelRemediationRunResponse>
                    handler) {

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
                .handleBody(
                        com.oracle.bmc.adm.model.RemediationRun.class,
                        CancelRemediationRunResponse.Builder::remediationRun)
                .handleResponseHeaderString(
                        "opc-request-id", CancelRemediationRunResponse.Builder::opcRequestId)
                .handleResponseHeaderString("etag", CancelRemediationRunResponse.Builder::etag)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<CancelWorkRequestResponse> cancelWorkRequest(
            CancelWorkRequestRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            CancelWorkRequestRequest, CancelWorkRequestResponse>
                    handler) {

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
                .handleResponseHeaderString(
                        "opc-request-id", CancelWorkRequestResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ChangeKnowledgeBaseCompartmentResponse>
            changeKnowledgeBaseCompartment(
                    ChangeKnowledgeBaseCompartmentRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    ChangeKnowledgeBaseCompartmentRequest,
                                    ChangeKnowledgeBaseCompartmentResponse>
                            handler) {

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
                .hasBody()
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        ChangeKnowledgeBaseCompartmentResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id",
                        ChangeKnowledgeBaseCompartmentResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ChangeRemediationRecipeCompartmentResponse>
            changeRemediationRecipeCompartment(
                    ChangeRemediationRecipeCompartmentRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    ChangeRemediationRecipeCompartmentRequest,
                                    ChangeRemediationRecipeCompartmentResponse>
                            handler) {

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
                .hasBody()
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        ChangeRemediationRecipeCompartmentResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id",
                        ChangeRemediationRecipeCompartmentResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ChangeRemediationRunCompartmentResponse>
            changeRemediationRunCompartment(
                    ChangeRemediationRunCompartmentRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    ChangeRemediationRunCompartmentRequest,
                                    ChangeRemediationRunCompartmentResponse>
                            handler) {

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
                .hasBody()
                .handleResponseHeaderString(
                        "opc-request-id",
                        ChangeRemediationRunCompartmentResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ChangeVulnerabilityAuditCompartmentResponse>
            changeVulnerabilityAuditCompartment(
                    ChangeVulnerabilityAuditCompartmentRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    ChangeVulnerabilityAuditCompartmentRequest,
                                    ChangeVulnerabilityAuditCompartmentResponse>
                            handler) {

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
                .hasBody()
                .handleResponseHeaderString(
                        "opc-request-id",
                        ChangeVulnerabilityAuditCompartmentResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<CreateKnowledgeBaseResponse> createKnowledgeBase(
            CreateKnowledgeBaseRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            CreateKnowledgeBaseRequest, CreateKnowledgeBaseResponse>
                    handler) {
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
                .hasBody()
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        CreateKnowledgeBaseResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", CreateKnowledgeBaseResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<CreateRemediationRecipeResponse> createRemediationRecipe(
            CreateRemediationRecipeRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            CreateRemediationRecipeRequest, CreateRemediationRecipeResponse>
                    handler) {
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
                .hasBody()
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        CreateRemediationRecipeResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", CreateRemediationRecipeResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<CreateRemediationRunResponse> createRemediationRun(
            CreateRemediationRunRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            CreateRemediationRunRequest, CreateRemediationRunResponse>
                    handler) {
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
                .hasBody()
                .handleBody(
                        com.oracle.bmc.adm.model.RemediationRun.class,
                        CreateRemediationRunResponse.Builder::remediationRun)
                .handleResponseHeaderString("etag", CreateRemediationRunResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", CreateRemediationRunResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<CreateVulnerabilityAuditResponse> createVulnerabilityAudit(
            CreateVulnerabilityAuditRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            CreateVulnerabilityAuditRequest, CreateVulnerabilityAuditResponse>
                    handler) {
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
                .hasBody()
                .handleBody(
                        com.oracle.bmc.adm.model.VulnerabilityAudit.class,
                        CreateVulnerabilityAuditResponse.Builder::vulnerabilityAudit)
                .handleResponseHeaderString("etag", CreateVulnerabilityAuditResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        CreateVulnerabilityAuditResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", CreateVulnerabilityAuditResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<DeactivateRemediationRecipeResponse>
            deactivateRemediationRecipe(
                    DeactivateRemediationRecipeRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    DeactivateRemediationRecipeRequest,
                                    DeactivateRemediationRecipeResponse>
                            handler) {

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
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        DeactivateRemediationRecipeResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", DeactivateRemediationRecipeResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<DeleteKnowledgeBaseResponse> deleteKnowledgeBase(
            DeleteKnowledgeBaseRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            DeleteKnowledgeBaseRequest, DeleteKnowledgeBaseResponse>
                    handler) {

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
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        DeleteKnowledgeBaseResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", DeleteKnowledgeBaseResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<DeleteRemediationRecipeResponse> deleteRemediationRecipe(
            DeleteRemediationRecipeRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            DeleteRemediationRecipeRequest, DeleteRemediationRecipeResponse>
                    handler) {

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
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        DeleteRemediationRecipeResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", DeleteRemediationRecipeResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<DeleteRemediationRunResponse> deleteRemediationRun(
            DeleteRemediationRunRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            DeleteRemediationRunRequest, DeleteRemediationRunResponse>
                    handler) {

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
                .handleResponseHeaderString(
                        "opc-request-id", DeleteRemediationRunResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<DeleteVulnerabilityAuditResponse> deleteVulnerabilityAudit(
            DeleteVulnerabilityAuditRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            DeleteVulnerabilityAuditRequest, DeleteVulnerabilityAuditResponse>
                    handler) {

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
                .handleResponseHeaderString(
                        "opc-request-id", DeleteVulnerabilityAuditResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<GetKnowledgeBaseResponse> getKnowledgeBase(
            GetKnowledgeBaseRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            GetKnowledgeBaseRequest, GetKnowledgeBaseResponse>
                    handler) {

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
                .handleBody(
                        com.oracle.bmc.adm.model.KnowledgeBase.class,
                        GetKnowledgeBaseResponse.Builder::knowledgeBase)
                .handleResponseHeaderString(
                        "opc-request-id", GetKnowledgeBaseResponse.Builder::opcRequestId)
                .handleResponseHeaderString("etag", GetKnowledgeBaseResponse.Builder::etag)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<GetRemediationRecipeResponse> getRemediationRecipe(
            GetRemediationRecipeRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            GetRemediationRecipeRequest, GetRemediationRecipeResponse>
                    handler) {

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
                .handleBody(
                        com.oracle.bmc.adm.model.RemediationRecipe.class,
                        GetRemediationRecipeResponse.Builder::remediationRecipe)
                .handleResponseHeaderString(
                        "opc-request-id", GetRemediationRecipeResponse.Builder::opcRequestId)
                .handleResponseHeaderString("etag", GetRemediationRecipeResponse.Builder::etag)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<GetRemediationRunResponse> getRemediationRun(
            GetRemediationRunRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            GetRemediationRunRequest, GetRemediationRunResponse>
                    handler) {

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
                .handleBody(
                        com.oracle.bmc.adm.model.RemediationRun.class,
                        GetRemediationRunResponse.Builder::remediationRun)
                .handleResponseHeaderString(
                        "opc-request-id", GetRemediationRunResponse.Builder::opcRequestId)
                .handleResponseHeaderString("etag", GetRemediationRunResponse.Builder::etag)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<GetStageResponse> getStage(
            GetStageRequest request,
            final com.oracle.bmc.responses.AsyncHandler<GetStageRequest, GetStageResponse>
                    handler) {

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
                .handleBody(
                        com.oracle.bmc.adm.model.RemediationRunStage.class,
                        GetStageResponse.Builder::remediationRunStage)
                .handleResponseHeaderString(
                        "opc-request-id", GetStageResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<GetVulnerabilityAuditResponse> getVulnerabilityAudit(
            GetVulnerabilityAuditRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            GetVulnerabilityAuditRequest, GetVulnerabilityAuditResponse>
                    handler) {

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
                .handleBody(
                        com.oracle.bmc.adm.model.VulnerabilityAudit.class,
                        GetVulnerabilityAuditResponse.Builder::vulnerabilityAudit)
                .handleResponseHeaderString("etag", GetVulnerabilityAuditResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", GetVulnerabilityAuditResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<GetWorkRequestResponse> getWorkRequest(
            GetWorkRequestRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            GetWorkRequestRequest, GetWorkRequestResponse>
                    handler) {

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
                .handleBody(
                        com.oracle.bmc.adm.model.WorkRequest.class,
                        GetWorkRequestResponse.Builder::workRequest)
                .handleResponseHeaderString("etag", GetWorkRequestResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", GetWorkRequestResponse.Builder::opcRequestId)
                .handleResponseHeaderInteger(
                        "retry-after", GetWorkRequestResponse.Builder::retryAfter)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ListApplicationDependencyRecommendationsResponse>
            listApplicationDependencyRecommendations(
                    ListApplicationDependencyRecommendationsRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    ListApplicationDependencyRecommendationsRequest,
                                    ListApplicationDependencyRecommendationsResponse>
                            handler) {

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
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
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
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ListApplicationDependencyVulnerabilitiesResponse>
            listApplicationDependencyVulnerabilities(
                    ListApplicationDependencyVulnerabilitiesRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    ListApplicationDependencyVulnerabilitiesRequest,
                                    ListApplicationDependencyVulnerabilitiesResponse>
                            handler) {

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
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .appendQueryParam("rootNodeId", request.getRootNodeId())
                .appendQueryParam("depth", request.getDepth())
                .appendQueryParam("gav", request.getGav())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
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
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ListKnowledgeBasesResponse> listKnowledgeBases(
            ListKnowledgeBasesRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ListKnowledgeBasesRequest, ListKnowledgeBasesResponse>
                    handler) {

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
                .handleBody(
                        com.oracle.bmc.adm.model.KnowledgeBaseCollection.class,
                        ListKnowledgeBasesResponse.Builder::knowledgeBaseCollection)
                .handleResponseHeaderString(
                        "opc-request-id", ListKnowledgeBasesResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListKnowledgeBasesResponse.Builder::opcNextPage)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ListRemediationRecipesResponse> listRemediationRecipes(
            ListRemediationRecipesRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ListRemediationRecipesRequest, ListRemediationRecipesResponse>
                    handler) {

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
                .handleBody(
                        com.oracle.bmc.adm.model.RemediationRecipeCollection.class,
                        ListRemediationRecipesResponse.Builder::remediationRecipeCollection)
                .handleResponseHeaderString(
                        "opc-request-id", ListRemediationRecipesResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListRemediationRecipesResponse.Builder::opcNextPage)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ListRemediationRunsResponse> listRemediationRuns(
            ListRemediationRunsRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ListRemediationRunsRequest, ListRemediationRunsResponse>
                    handler) {

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
                .handleBody(
                        com.oracle.bmc.adm.model.RemediationRunCollection.class,
                        ListRemediationRunsResponse.Builder::remediationRunCollection)
                .handleResponseHeaderString(
                        "opc-request-id", ListRemediationRunsResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListRemediationRunsResponse.Builder::opcNextPage)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ListStagesResponse> listStages(
            ListStagesRequest request,
            final com.oracle.bmc.responses.AsyncHandler<ListStagesRequest, ListStagesResponse>
                    handler) {

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
                .handleBody(
                        com.oracle.bmc.adm.model.RemediationRunStageCollection.class,
                        ListStagesResponse.Builder::remediationRunStageCollection)
                .handleResponseHeaderString(
                        "opc-request-id", ListStagesResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListStagesResponse.Builder::opcNextPage)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ListVulnerabilityAuditsResponse> listVulnerabilityAudits(
            ListVulnerabilityAuditsRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ListVulnerabilityAuditsRequest, ListVulnerabilityAuditsResponse>
                    handler) {

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
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.adm.model.VulnerabilityAuditCollection.class,
                        ListVulnerabilityAuditsResponse.Builder::vulnerabilityAuditCollection)
                .handleResponseHeaderString(
                        "opc-request-id", ListVulnerabilityAuditsResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListVulnerabilityAuditsResponse.Builder::opcNextPage)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ListWorkRequestErrorsResponse> listWorkRequestErrors(
            ListWorkRequestErrorsRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ListWorkRequestErrorsRequest, ListWorkRequestErrorsResponse>
                    handler) {

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
                .handleBody(
                        com.oracle.bmc.adm.model.WorkRequestErrorCollection.class,
                        ListWorkRequestErrorsResponse.Builder::workRequestErrorCollection)
                .handleResponseHeaderString(
                        "opc-next-page", ListWorkRequestErrorsResponse.Builder::opcNextPage)
                .handleResponseHeaderString(
                        "opc-request-id", ListWorkRequestErrorsResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ListWorkRequestLogsResponse> listWorkRequestLogs(
            ListWorkRequestLogsRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ListWorkRequestLogsRequest, ListWorkRequestLogsResponse>
                    handler) {

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
                .handleBody(
                        com.oracle.bmc.adm.model.WorkRequestLogEntryCollection.class,
                        ListWorkRequestLogsResponse.Builder::workRequestLogEntryCollection)
                .handleResponseHeaderString(
                        "opc-next-page", ListWorkRequestLogsResponse.Builder::opcNextPage)
                .handleResponseHeaderString(
                        "opc-request-id", ListWorkRequestLogsResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ListWorkRequestsResponse> listWorkRequests(
            ListWorkRequestsRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ListWorkRequestsRequest, ListWorkRequestsResponse>
                    handler) {

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
                .handleBody(
                        com.oracle.bmc.adm.model.WorkRequestSummaryCollection.class,
                        ListWorkRequestsResponse.Builder::workRequestSummaryCollection)
                .handleResponseHeaderString(
                        "opc-request-id", ListWorkRequestsResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListWorkRequestsResponse.Builder::opcNextPage)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<UpdateKnowledgeBaseResponse> updateKnowledgeBase(
            UpdateKnowledgeBaseRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            UpdateKnowledgeBaseRequest, UpdateKnowledgeBaseResponse>
                    handler) {

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
                .hasBody()
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        UpdateKnowledgeBaseResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", UpdateKnowledgeBaseResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<UpdateRemediationRecipeResponse> updateRemediationRecipe(
            UpdateRemediationRecipeRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            UpdateRemediationRecipeRequest, UpdateRemediationRecipeResponse>
                    handler) {

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
                .hasBody()
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        UpdateRemediationRecipeResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", UpdateRemediationRecipeResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<UpdateRemediationRunResponse> updateRemediationRun(
            UpdateRemediationRunRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            UpdateRemediationRunRequest, UpdateRemediationRunResponse>
                    handler) {

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
                .hasBody()
                .handleBody(
                        com.oracle.bmc.adm.model.RemediationRun.class,
                        UpdateRemediationRunResponse.Builder::remediationRun)
                .handleResponseHeaderString("etag", UpdateRemediationRunResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", UpdateRemediationRunResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<UpdateVulnerabilityAuditResponse> updateVulnerabilityAudit(
            UpdateVulnerabilityAuditRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            UpdateVulnerabilityAuditRequest, UpdateVulnerabilityAuditResponse>
                    handler) {

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
                .hasBody()
                .handleBody(
                        com.oracle.bmc.adm.model.VulnerabilityAudit.class,
                        UpdateVulnerabilityAuditResponse.Builder::vulnerabilityAudit)
                .handleResponseHeaderString("etag", UpdateVulnerabilityAuditResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", UpdateVulnerabilityAuditResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    /**
     * Create a new client instance.
     *
     * @param authenticationDetailsProvider The authentication details (see {@link Builder#build})
     * @deprecated Use the {@link #builder() builder} instead.
     */
    @Deprecated
    public ApplicationDependencyManagementAsyncClient(
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
    public ApplicationDependencyManagementAsyncClient(
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
    public ApplicationDependencyManagementAsyncClient(
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
    public ApplicationDependencyManagementAsyncClient(
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
    public ApplicationDependencyManagementAsyncClient(
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
    public ApplicationDependencyManagementAsyncClient(
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
    public ApplicationDependencyManagementAsyncClient(
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
