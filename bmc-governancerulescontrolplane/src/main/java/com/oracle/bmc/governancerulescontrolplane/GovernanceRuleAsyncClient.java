/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.governancerulescontrolplane;

import com.oracle.bmc.util.internal.Validate;
import com.oracle.bmc.governancerulescontrolplane.requests.*;
import com.oracle.bmc.governancerulescontrolplane.responses.*;

import java.util.Objects;

/**
 * Async client implementation for GovernanceRule service. <br>
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
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20220504")
public class GovernanceRuleAsyncClient extends com.oracle.bmc.http.internal.BaseAsyncClient
        implements GovernanceRuleAsync {
    /** Service instance for GovernanceRule. */
    public static final com.oracle.bmc.Service SERVICE =
            com.oracle.bmc.Services.serviceBuilder()
                    .serviceName("GOVERNANCERULE")
                    .serviceEndpointPrefix("")
                    .serviceEndpointTemplate(
                            "https://governance-rules.organizations.{region}.oci.{secondLevelDomain}")
                    .build();

    private static final org.slf4j.Logger LOG =
            org.slf4j.LoggerFactory.getLogger(GovernanceRuleAsyncClient.class);

    GovernanceRuleAsyncClient(
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
                    Builder, GovernanceRuleAsyncClient> {
        private Builder(com.oracle.bmc.Service service) {
            super(service);
            final String packageName = "governancerulescontrolplane";
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
        public GovernanceRuleAsyncClient build(
                @jakarta.annotation.Nonnull
                        com.oracle.bmc.auth.AbstractAuthenticationDetailsProvider
                                authenticationDetailsProvider) {
            return new GovernanceRuleAsyncClient(this, authenticationDetailsProvider);
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
    public java.util.concurrent.Future<CreateGovernanceRuleResponse> createGovernanceRule(
            CreateGovernanceRuleRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            CreateGovernanceRuleRequest, CreateGovernanceRuleResponse>
                    handler) {
        Objects.requireNonNull(
                request.getCreateGovernanceRuleDetails(),
                "createGovernanceRuleDetails is required");

        return clientCall(request, CreateGovernanceRuleResponse::builder)
                .logger(LOG, "createGovernanceRule")
                .serviceDetails("GovernanceRule", "CreateGovernanceRule", "")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(CreateGovernanceRuleRequest::builder)
                .basePath("/20220504")
                .appendPathParam("governanceRules")
                .accept("application/json")
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.governancerulescontrolplane.model.GovernanceRule.class,
                        CreateGovernanceRuleResponse.Builder::governanceRule)
                .handleResponseHeaderString("etag", CreateGovernanceRuleResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        CreateGovernanceRuleResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", CreateGovernanceRuleResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "location", CreateGovernanceRuleResponse.Builder::location)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<CreateInclusionCriterionResponse> createInclusionCriterion(
            CreateInclusionCriterionRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            CreateInclusionCriterionRequest, CreateInclusionCriterionResponse>
                    handler) {
        Objects.requireNonNull(
                request.getCreateInclusionCriterionDetails(),
                "createInclusionCriterionDetails is required");

        return clientCall(request, CreateInclusionCriterionResponse::builder)
                .logger(LOG, "createInclusionCriterion")
                .serviceDetails("GovernanceRule", "CreateInclusionCriterion", "")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(CreateInclusionCriterionRequest::builder)
                .basePath("/20220504")
                .appendPathParam("inclusionCriteria")
                .accept("application/json")
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.governancerulescontrolplane.model.InclusionCriterion.class,
                        CreateInclusionCriterionResponse.Builder::inclusionCriterion)
                .handleResponseHeaderString("etag", CreateInclusionCriterionResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        CreateInclusionCriterionResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", CreateInclusionCriterionResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "location", CreateInclusionCriterionResponse.Builder::location)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<DeleteGovernanceRuleResponse> deleteGovernanceRule(
            DeleteGovernanceRuleRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            DeleteGovernanceRuleRequest, DeleteGovernanceRuleResponse>
                    handler) {

        Validate.notBlank(request.getGovernanceRuleId(), "governanceRuleId must not be blank");

        return clientCall(request, DeleteGovernanceRuleResponse::builder)
                .logger(LOG, "deleteGovernanceRule")
                .serviceDetails("GovernanceRule", "DeleteGovernanceRule", "")
                .method(com.oracle.bmc.http.client.Method.DELETE)
                .requestBuilder(DeleteGovernanceRuleRequest::builder)
                .basePath("/20220504")
                .appendPathParam("governanceRules")
                .appendPathParam(request.getGovernanceRuleId())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        DeleteGovernanceRuleResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", DeleteGovernanceRuleResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<DeleteInclusionCriterionResponse> deleteInclusionCriterion(
            DeleteInclusionCriterionRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            DeleteInclusionCriterionRequest, DeleteInclusionCriterionResponse>
                    handler) {

        Validate.notBlank(
                request.getInclusionCriterionId(), "inclusionCriterionId must not be blank");

        return clientCall(request, DeleteInclusionCriterionResponse::builder)
                .logger(LOG, "deleteInclusionCriterion")
                .serviceDetails("GovernanceRule", "DeleteInclusionCriterion", "")
                .method(com.oracle.bmc.http.client.Method.DELETE)
                .requestBuilder(DeleteInclusionCriterionRequest::builder)
                .basePath("/20220504")
                .appendPathParam("inclusionCriteria")
                .appendPathParam(request.getInclusionCriterionId())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        DeleteInclusionCriterionResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", DeleteInclusionCriterionResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<GetEnforcedGovernanceRuleResponse> getEnforcedGovernanceRule(
            GetEnforcedGovernanceRuleRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            GetEnforcedGovernanceRuleRequest, GetEnforcedGovernanceRuleResponse>
                    handler) {

        Validate.notBlank(
                request.getEnforcedGovernanceRuleId(),
                "enforcedGovernanceRuleId must not be blank");

        return clientCall(request, GetEnforcedGovernanceRuleResponse::builder)
                .logger(LOG, "getEnforcedGovernanceRule")
                .serviceDetails("GovernanceRule", "GetEnforcedGovernanceRule", "")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetEnforcedGovernanceRuleRequest::builder)
                .basePath("/20220504")
                .appendPathParam("enforcedGovernanceRules")
                .appendPathParam(request.getEnforcedGovernanceRuleId())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.governancerulescontrolplane.model.EnforcedGovernanceRule
                                .class,
                        GetEnforcedGovernanceRuleResponse.Builder::enforcedGovernanceRule)
                .handleResponseHeaderString("etag", GetEnforcedGovernanceRuleResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", GetEnforcedGovernanceRuleResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<GetGovernanceRuleResponse> getGovernanceRule(
            GetGovernanceRuleRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            GetGovernanceRuleRequest, GetGovernanceRuleResponse>
                    handler) {

        Validate.notBlank(request.getGovernanceRuleId(), "governanceRuleId must not be blank");

        return clientCall(request, GetGovernanceRuleResponse::builder)
                .logger(LOG, "getGovernanceRule")
                .serviceDetails("GovernanceRule", "GetGovernanceRule", "")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetGovernanceRuleRequest::builder)
                .basePath("/20220504")
                .appendPathParam("governanceRules")
                .appendPathParam(request.getGovernanceRuleId())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.governancerulescontrolplane.model.GovernanceRule.class,
                        GetGovernanceRuleResponse.Builder::governanceRule)
                .handleResponseHeaderString("etag", GetGovernanceRuleResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", GetGovernanceRuleResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<GetInclusionCriterionResponse> getInclusionCriterion(
            GetInclusionCriterionRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            GetInclusionCriterionRequest, GetInclusionCriterionResponse>
                    handler) {

        Validate.notBlank(
                request.getInclusionCriterionId(), "inclusionCriterionId must not be blank");

        return clientCall(request, GetInclusionCriterionResponse::builder)
                .logger(LOG, "getInclusionCriterion")
                .serviceDetails("GovernanceRule", "GetInclusionCriterion", "")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetInclusionCriterionRequest::builder)
                .basePath("/20220504")
                .appendPathParam("inclusionCriteria")
                .appendPathParam(request.getInclusionCriterionId())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.governancerulescontrolplane.model.InclusionCriterion.class,
                        GetInclusionCriterionResponse.Builder::inclusionCriterion)
                .handleResponseHeaderString("etag", GetInclusionCriterionResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", GetInclusionCriterionResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<GetTenancyAttachmentResponse> getTenancyAttachment(
            GetTenancyAttachmentRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            GetTenancyAttachmentRequest, GetTenancyAttachmentResponse>
                    handler) {

        Validate.notBlank(
                request.getTenancyAttachmentId(), "tenancyAttachmentId must not be blank");

        return clientCall(request, GetTenancyAttachmentResponse::builder)
                .logger(LOG, "getTenancyAttachment")
                .serviceDetails("GovernanceRule", "GetTenancyAttachment", "")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetTenancyAttachmentRequest::builder)
                .basePath("/20220504")
                .appendPathParam("tenancyAttachments")
                .appendPathParam(request.getTenancyAttachmentId())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.governancerulescontrolplane.model.TenancyAttachment.class,
                        GetTenancyAttachmentResponse.Builder::tenancyAttachment)
                .handleResponseHeaderString("etag", GetTenancyAttachmentResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", GetTenancyAttachmentResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ListEnforcedGovernanceRulesResponse>
            listEnforcedGovernanceRules(
                    ListEnforcedGovernanceRulesRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    ListEnforcedGovernanceRulesRequest,
                                    ListEnforcedGovernanceRulesResponse>
                            handler) {

        return clientCall(request, ListEnforcedGovernanceRulesResponse::builder)
                .logger(LOG, "listEnforcedGovernanceRules")
                .serviceDetails("GovernanceRule", "ListEnforcedGovernanceRules", "")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListEnforcedGovernanceRulesRequest::builder)
                .basePath("/20220504")
                .appendPathParam("enforcedGovernanceRules")
                .appendQueryParam("compartmentId", request.getCompartmentId())
                .appendQueryParam("enforcedGovernanceRuleId", request.getEnforcedGovernanceRuleId())
                .appendEnumQueryParam("governanceRuleType", request.getGovernanceRuleType())
                .appendQueryParam("displayName", request.getDisplayName())
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.governancerulescontrolplane.model
                                .EnforcedGovernanceRuleCollection.class,
                        ListEnforcedGovernanceRulesResponse.Builder
                                ::enforcedGovernanceRuleCollection)
                .handleResponseHeaderString(
                        "opc-request-id", ListEnforcedGovernanceRulesResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListEnforcedGovernanceRulesResponse.Builder::opcNextPage)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ListGovernanceRulesResponse> listGovernanceRules(
            ListGovernanceRulesRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ListGovernanceRulesRequest, ListGovernanceRulesResponse>
                    handler) {

        return clientCall(request, ListGovernanceRulesResponse::builder)
                .logger(LOG, "listGovernanceRules")
                .serviceDetails("GovernanceRule", "ListGovernanceRules", "")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListGovernanceRulesRequest::builder)
                .basePath("/20220504")
                .appendPathParam("governanceRules")
                .appendQueryParam("compartmentId", request.getCompartmentId())
                .appendQueryParam("governanceRuleId", request.getGovernanceRuleId())
                .appendEnumQueryParam("lifecycleState", request.getLifecycleState())
                .appendQueryParam("displayName", request.getDisplayName())
                .appendEnumQueryParam("governanceRuleType", request.getGovernanceRuleType())
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.governancerulescontrolplane.model.GovernanceRuleCollection
                                .class,
                        ListGovernanceRulesResponse.Builder::governanceRuleCollection)
                .handleResponseHeaderString(
                        "opc-request-id", ListGovernanceRulesResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListGovernanceRulesResponse.Builder::opcNextPage)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ListInclusionCriteriaResponse> listInclusionCriteria(
            ListInclusionCriteriaRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ListInclusionCriteriaRequest, ListInclusionCriteriaResponse>
                    handler) {
        Objects.requireNonNull(request.getGovernanceRuleId(), "governanceRuleId is required");

        return clientCall(request, ListInclusionCriteriaResponse::builder)
                .logger(LOG, "listInclusionCriteria")
                .serviceDetails("GovernanceRule", "ListInclusionCriteria", "")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListInclusionCriteriaRequest::builder)
                .basePath("/20220504")
                .appendPathParam("inclusionCriteria")
                .appendQueryParam("governanceRuleId", request.getGovernanceRuleId())
                .appendQueryParam("inclusionCriterionId", request.getInclusionCriterionId())
                .appendEnumQueryParam("lifecycleState", request.getLifecycleState())
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.governancerulescontrolplane.model
                                .InclusionCriterionCollection.class,
                        ListInclusionCriteriaResponse.Builder::inclusionCriterionCollection)
                .handleResponseHeaderString(
                        "opc-request-id", ListInclusionCriteriaResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListInclusionCriteriaResponse.Builder::opcNextPage)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ListTenancyAttachmentsResponse> listTenancyAttachments(
            ListTenancyAttachmentsRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ListTenancyAttachmentsRequest, ListTenancyAttachmentsResponse>
                    handler) {

        return clientCall(request, ListTenancyAttachmentsResponse::builder)
                .logger(LOG, "listTenancyAttachments")
                .serviceDetails("GovernanceRule", "ListTenancyAttachments", "")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListTenancyAttachmentsRequest::builder)
                .basePath("/20220504")
                .appendPathParam("tenancyAttachments")
                .appendQueryParam("compartmentId", request.getCompartmentId())
                .appendQueryParam("tenancyAttachmentId", request.getTenancyAttachmentId())
                .appendQueryParam("governanceRuleId", request.getGovernanceRuleId())
                .appendEnumQueryParam("lifecycleState", request.getLifecycleState())
                .appendQueryParam("childTenancyId", request.getChildTenancyId())
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.governancerulescontrolplane.model.TenancyAttachmentCollection
                                .class,
                        ListTenancyAttachmentsResponse.Builder::tenancyAttachmentCollection)
                .handleResponseHeaderString(
                        "opc-request-id", ListTenancyAttachmentsResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListTenancyAttachmentsResponse.Builder::opcNextPage)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<RetryGovernanceRuleResponse> retryGovernanceRule(
            RetryGovernanceRuleRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            RetryGovernanceRuleRequest, RetryGovernanceRuleResponse>
                    handler) {

        Validate.notBlank(request.getGovernanceRuleId(), "governanceRuleId must not be blank");

        return clientCall(request, RetryGovernanceRuleResponse::builder)
                .logger(LOG, "retryGovernanceRule")
                .serviceDetails("GovernanceRule", "RetryGovernanceRule", "")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(RetryGovernanceRuleRequest::builder)
                .basePath("/20220504")
                .appendPathParam("governanceRules")
                .appendPathParam(request.getGovernanceRuleId())
                .appendPathParam("actions")
                .appendPathParam("retry")
                .accept("application/json")
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        RetryGovernanceRuleResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", RetryGovernanceRuleResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<RetryTenancyAttachmentResponse> retryTenancyAttachment(
            RetryTenancyAttachmentRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            RetryTenancyAttachmentRequest, RetryTenancyAttachmentResponse>
                    handler) {

        Validate.notBlank(
                request.getTenancyAttachmentId(), "tenancyAttachmentId must not be blank");

        return clientCall(request, RetryTenancyAttachmentResponse::builder)
                .logger(LOG, "retryTenancyAttachment")
                .serviceDetails("GovernanceRule", "RetryTenancyAttachment", "")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(RetryTenancyAttachmentRequest::builder)
                .basePath("/20220504")
                .appendPathParam("tenancyAttachments")
                .appendPathParam(request.getTenancyAttachmentId())
                .appendPathParam("actions")
                .appendPathParam("retry")
                .accept("application/json")
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        RetryTenancyAttachmentResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", RetryTenancyAttachmentResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<UpdateGovernanceRuleResponse> updateGovernanceRule(
            UpdateGovernanceRuleRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            UpdateGovernanceRuleRequest, UpdateGovernanceRuleResponse>
                    handler) {

        Validate.notBlank(request.getGovernanceRuleId(), "governanceRuleId must not be blank");
        Objects.requireNonNull(
                request.getUpdateGovernanceRuleDetails(),
                "updateGovernanceRuleDetails is required");

        return clientCall(request, UpdateGovernanceRuleResponse::builder)
                .logger(LOG, "updateGovernanceRule")
                .serviceDetails("GovernanceRule", "UpdateGovernanceRule", "")
                .method(com.oracle.bmc.http.client.Method.PUT)
                .requestBuilder(UpdateGovernanceRuleRequest::builder)
                .basePath("/20220504")
                .appendPathParam("governanceRules")
                .appendPathParam(request.getGovernanceRuleId())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .hasBody()
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        UpdateGovernanceRuleResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", UpdateGovernanceRuleResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    /**
     * Create a new client instance.
     *
     * @param authenticationDetailsProvider The authentication details (see {@link Builder#build})
     * @deprecated Use the {@link #builder() builder} instead.
     */
    @Deprecated
    public GovernanceRuleAsyncClient(
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
    public GovernanceRuleAsyncClient(
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
    public GovernanceRuleAsyncClient(
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
    public GovernanceRuleAsyncClient(
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
    public GovernanceRuleAsyncClient(
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
    public GovernanceRuleAsyncClient(
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
    public GovernanceRuleAsyncClient(
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
