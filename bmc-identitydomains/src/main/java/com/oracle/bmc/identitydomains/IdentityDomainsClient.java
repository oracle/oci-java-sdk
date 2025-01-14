/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.identitydomains;

import com.oracle.bmc.util.internal.Validate;
import com.oracle.bmc.identitydomains.requests.*;
import com.oracle.bmc.identitydomains.responses.*;
import com.oracle.bmc.circuitbreaker.CircuitBreakerConfiguration;
import com.oracle.bmc.util.CircuitBreakerUtils;

import java.util.Objects;

@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: v1")
public class IdentityDomainsClient extends com.oracle.bmc.http.internal.BaseSyncClient
        implements IdentityDomains {
    /** Service instance for IdentityDomains. */
    public static final com.oracle.bmc.Service SERVICE =
            com.oracle.bmc.Services.serviceBuilder()
                    .serviceName("IDENTITYDOMAINS")
                    .serviceEndpointPrefix("")
                    .serviceEndpointTemplate("https://idcs-guid.identity.oraclecloud.com")
                    .build();

    private static final org.slf4j.Logger LOG =
            org.slf4j.LoggerFactory.getLogger(IdentityDomainsClient.class);

    IdentityDomainsClient(
            com.oracle.bmc.common.ClientBuilderBase<?, ?> builder,
            com.oracle.bmc.auth.AbstractAuthenticationDetailsProvider
                    authenticationDetailsProvider) {
        super(
                builder,
                authenticationDetailsProvider,
                CircuitBreakerUtils.DEFAULT_CIRCUIT_BREAKER_CONFIGURATION);
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
            extends com.oracle.bmc.common.ClientBuilderBase<Builder, IdentityDomainsClient> {
        private Builder(com.oracle.bmc.Service service) {
            super(service);
            final String packageName = "identitydomains";
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
        public IdentityDomainsClient build(
                @jakarta.annotation.Nonnull
                        com.oracle.bmc.auth.AbstractAuthenticationDetailsProvider
                                authenticationDetailsProvider) {
            return new IdentityDomainsClient(this, authenticationDetailsProvider);
        }
    }

    @Override
    public CreateApiKeyResponse createApiKey(CreateApiKeyRequest request) {

        return clientCall(request, CreateApiKeyResponse::builder)
                .logger(LOG, "createApiKey")
                .serviceDetails("IdentityDomains", "CreateApiKey", "")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(CreateApiKeyRequest::builder)
                .basePath("")
                .appendPathParam("admin")
                .appendPathParam("v1")
                .appendPathParam("ApiKeys")
                .appendQueryParam("attributes", request.getAttributes())
                .appendListQueryParam(
                        "attributeSets",
                        request.getAttributeSets(),
                        com.oracle.bmc.util.internal.CollectionFormatType.Multi)
                .accept("application/json, application/scim+json")
                .appendHeader("authorization", request.getAuthorization())
                .appendHeader(
                        "resource_type_schema_version", request.getResourceTypeSchemaVersion())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.identitydomains.model.ApiKey.class,
                        CreateApiKeyResponse.Builder::apiKey)
                .handleResponseHeaderString(
                        "opc-request-id", CreateApiKeyResponse.Builder::opcRequestId)
                .handleResponseHeaderString("etag", CreateApiKeyResponse.Builder::etag)
                .callSync();
    }

    @Override
    public CreateAppResponse createApp(CreateAppRequest request) {

        return clientCall(request, CreateAppResponse::builder)
                .logger(LOG, "createApp")
                .serviceDetails("IdentityDomains", "CreateApp", "")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(CreateAppRequest::builder)
                .basePath("")
                .appendPathParam("admin")
                .appendPathParam("v1")
                .appendPathParam("Apps")
                .appendQueryParam("attributes", request.getAttributes())
                .appendListQueryParam(
                        "attributeSets",
                        request.getAttributeSets(),
                        com.oracle.bmc.util.internal.CollectionFormatType.Multi)
                .accept("application/json, application/scim+json")
                .appendHeader("authorization", request.getAuthorization())
                .appendHeader(
                        "resource_type_schema_version", request.getResourceTypeSchemaVersion())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.identitydomains.model.App.class,
                        CreateAppResponse.Builder::app)
                .handleResponseHeaderString(
                        "opc-request-id", CreateAppResponse.Builder::opcRequestId)
                .handleResponseHeaderString("etag", CreateAppResponse.Builder::etag)
                .callSync();
    }

    @Override
    public CreateAppRoleResponse createAppRole(CreateAppRoleRequest request) {

        return clientCall(request, CreateAppRoleResponse::builder)
                .logger(LOG, "createAppRole")
                .serviceDetails("IdentityDomains", "CreateAppRole", "")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(CreateAppRoleRequest::builder)
                .basePath("")
                .appendPathParam("admin")
                .appendPathParam("v1")
                .appendPathParam("AppRoles")
                .appendQueryParam("attributes", request.getAttributes())
                .appendListQueryParam(
                        "attributeSets",
                        request.getAttributeSets(),
                        com.oracle.bmc.util.internal.CollectionFormatType.Multi)
                .accept("application/json, application/scim+json")
                .appendHeader("authorization", request.getAuthorization())
                .appendHeader(
                        "resource_type_schema_version", request.getResourceTypeSchemaVersion())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.identitydomains.model.AppRole.class,
                        CreateAppRoleResponse.Builder::appRole)
                .handleResponseHeaderString(
                        "opc-request-id", CreateAppRoleResponse.Builder::opcRequestId)
                .handleResponseHeaderString("etag", CreateAppRoleResponse.Builder::etag)
                .callSync();
    }

    @Override
    public CreateApprovalWorkflowResponse createApprovalWorkflow(
            CreateApprovalWorkflowRequest request) {

        return clientCall(request, CreateApprovalWorkflowResponse::builder)
                .logger(LOG, "createApprovalWorkflow")
                .serviceDetails("IdentityDomains", "CreateApprovalWorkflow", "")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(CreateApprovalWorkflowRequest::builder)
                .basePath("")
                .appendPathParam("admin")
                .appendPathParam("v1")
                .appendPathParam("ApprovalWorkflows")
                .appendQueryParam("attributes", request.getAttributes())
                .appendListQueryParam(
                        "attributeSets",
                        request.getAttributeSets(),
                        com.oracle.bmc.util.internal.CollectionFormatType.Multi)
                .accept("application/json, application/scim+json")
                .appendHeader("authorization", request.getAuthorization())
                .appendHeader(
                        "resource_type_schema_version", request.getResourceTypeSchemaVersion())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.identitydomains.model.ApprovalWorkflow.class,
                        CreateApprovalWorkflowResponse.Builder::approvalWorkflow)
                .handleResponseHeaderString(
                        "opc-request-id", CreateApprovalWorkflowResponse.Builder::opcRequestId)
                .handleResponseHeaderString("etag", CreateApprovalWorkflowResponse.Builder::etag)
                .callSync();
    }

    @Override
    public CreateApprovalWorkflowAssignmentResponse createApprovalWorkflowAssignment(
            CreateApprovalWorkflowAssignmentRequest request) {

        return clientCall(request, CreateApprovalWorkflowAssignmentResponse::builder)
                .logger(LOG, "createApprovalWorkflowAssignment")
                .serviceDetails("IdentityDomains", "CreateApprovalWorkflowAssignment", "")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(CreateApprovalWorkflowAssignmentRequest::builder)
                .basePath("")
                .appendPathParam("admin")
                .appendPathParam("v1")
                .appendPathParam("ApprovalWorkflowAssignments")
                .appendQueryParam("attributes", request.getAttributes())
                .appendListQueryParam(
                        "attributeSets",
                        request.getAttributeSets(),
                        com.oracle.bmc.util.internal.CollectionFormatType.Multi)
                .accept("application/json, application/scim+json")
                .appendHeader("authorization", request.getAuthorization())
                .appendHeader(
                        "resource_type_schema_version", request.getResourceTypeSchemaVersion())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.identitydomains.model.ApprovalWorkflowAssignment.class,
                        CreateApprovalWorkflowAssignmentResponse.Builder
                                ::approvalWorkflowAssignment)
                .handleResponseHeaderString(
                        "opc-request-id",
                        CreateApprovalWorkflowAssignmentResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "etag", CreateApprovalWorkflowAssignmentResponse.Builder::etag)
                .callSync();
    }

    @Override
    public CreateApprovalWorkflowStepResponse createApprovalWorkflowStep(
            CreateApprovalWorkflowStepRequest request) {

        return clientCall(request, CreateApprovalWorkflowStepResponse::builder)
                .logger(LOG, "createApprovalWorkflowStep")
                .serviceDetails("IdentityDomains", "CreateApprovalWorkflowStep", "")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(CreateApprovalWorkflowStepRequest::builder)
                .basePath("")
                .appendPathParam("admin")
                .appendPathParam("v1")
                .appendPathParam("ApprovalWorkflowSteps")
                .appendQueryParam("attributes", request.getAttributes())
                .appendListQueryParam(
                        "attributeSets",
                        request.getAttributeSets(),
                        com.oracle.bmc.util.internal.CollectionFormatType.Multi)
                .accept("application/json, application/scim+json")
                .appendHeader("authorization", request.getAuthorization())
                .appendHeader(
                        "resource_type_schema_version", request.getResourceTypeSchemaVersion())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.identitydomains.model.ApprovalWorkflowStep.class,
                        CreateApprovalWorkflowStepResponse.Builder::approvalWorkflowStep)
                .handleResponseHeaderString(
                        "opc-request-id", CreateApprovalWorkflowStepResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "etag", CreateApprovalWorkflowStepResponse.Builder::etag)
                .callSync();
    }

    @Override
    public CreateAuthTokenResponse createAuthToken(CreateAuthTokenRequest request) {

        return clientCall(request, CreateAuthTokenResponse::builder)
                .logger(LOG, "createAuthToken")
                .serviceDetails("IdentityDomains", "CreateAuthToken", "")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(CreateAuthTokenRequest::builder)
                .basePath("")
                .appendPathParam("admin")
                .appendPathParam("v1")
                .appendPathParam("AuthTokens")
                .appendQueryParam("attributes", request.getAttributes())
                .appendListQueryParam(
                        "attributeSets",
                        request.getAttributeSets(),
                        com.oracle.bmc.util.internal.CollectionFormatType.Multi)
                .accept("application/json, application/scim+json")
                .appendHeader("authorization", request.getAuthorization())
                .appendHeader(
                        "resource_type_schema_version", request.getResourceTypeSchemaVersion())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.identitydomains.model.AuthToken.class,
                        CreateAuthTokenResponse.Builder::authToken)
                .handleResponseHeaderString(
                        "opc-request-id", CreateAuthTokenResponse.Builder::opcRequestId)
                .handleResponseHeaderString("etag", CreateAuthTokenResponse.Builder::etag)
                .callSync();
    }

    @Override
    public CreateAuthenticationFactorsRemoverResponse createAuthenticationFactorsRemover(
            CreateAuthenticationFactorsRemoverRequest request) {

        return clientCall(request, CreateAuthenticationFactorsRemoverResponse::builder)
                .logger(LOG, "createAuthenticationFactorsRemover")
                .serviceDetails("IdentityDomains", "CreateAuthenticationFactorsRemover", "")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(CreateAuthenticationFactorsRemoverRequest::builder)
                .basePath("")
                .appendPathParam("admin")
                .appendPathParam("v1")
                .appendPathParam("AuthenticationFactorsRemover")
                .accept("application/json, application/scim+json")
                .appendHeader("authorization", request.getAuthorization())
                .appendHeader(
                        "resource_type_schema_version", request.getResourceTypeSchemaVersion())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.identitydomains.model.AuthenticationFactorsRemover.class,
                        CreateAuthenticationFactorsRemoverResponse.Builder
                                ::authenticationFactorsRemover)
                .handleResponseHeaderString(
                        "opc-request-id",
                        CreateAuthenticationFactorsRemoverResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "etag", CreateAuthenticationFactorsRemoverResponse.Builder::etag)
                .callSync();
    }

    @Override
    public CreateCloudGateResponse createCloudGate(CreateCloudGateRequest request) {

        return clientCall(request, CreateCloudGateResponse::builder)
                .logger(LOG, "createCloudGate")
                .serviceDetails("IdentityDomains", "CreateCloudGate", "")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(CreateCloudGateRequest::builder)
                .basePath("")
                .appendPathParam("admin")
                .appendPathParam("v1")
                .appendPathParam("CloudGates")
                .appendQueryParam("attributes", request.getAttributes())
                .appendListQueryParam(
                        "attributeSets",
                        request.getAttributeSets(),
                        com.oracle.bmc.util.internal.CollectionFormatType.Multi)
                .accept("application/json, application/scim+json")
                .appendHeader("authorization", request.getAuthorization())
                .appendHeader(
                        "resource_type_schema_version", request.getResourceTypeSchemaVersion())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.identitydomains.model.CloudGate.class,
                        CreateCloudGateResponse.Builder::cloudGate)
                .handleResponseHeaderString(
                        "opc-request-id", CreateCloudGateResponse.Builder::opcRequestId)
                .handleResponseHeaderString("etag", CreateCloudGateResponse.Builder::etag)
                .callSync();
    }

    @Override
    public CreateCloudGateMappingResponse createCloudGateMapping(
            CreateCloudGateMappingRequest request) {

        return clientCall(request, CreateCloudGateMappingResponse::builder)
                .logger(LOG, "createCloudGateMapping")
                .serviceDetails("IdentityDomains", "CreateCloudGateMapping", "")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(CreateCloudGateMappingRequest::builder)
                .basePath("")
                .appendPathParam("admin")
                .appendPathParam("v1")
                .appendPathParam("CloudGateMappings")
                .appendQueryParam("attributes", request.getAttributes())
                .appendListQueryParam(
                        "attributeSets",
                        request.getAttributeSets(),
                        com.oracle.bmc.util.internal.CollectionFormatType.Multi)
                .accept("application/json, application/scim+json")
                .appendHeader("authorization", request.getAuthorization())
                .appendHeader(
                        "resource_type_schema_version", request.getResourceTypeSchemaVersion())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.identitydomains.model.CloudGateMapping.class,
                        CreateCloudGateMappingResponse.Builder::cloudGateMapping)
                .handleResponseHeaderString(
                        "opc-request-id", CreateCloudGateMappingResponse.Builder::opcRequestId)
                .handleResponseHeaderString("etag", CreateCloudGateMappingResponse.Builder::etag)
                .callSync();
    }

    @Override
    public CreateCloudGateServerResponse createCloudGateServer(
            CreateCloudGateServerRequest request) {

        return clientCall(request, CreateCloudGateServerResponse::builder)
                .logger(LOG, "createCloudGateServer")
                .serviceDetails("IdentityDomains", "CreateCloudGateServer", "")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(CreateCloudGateServerRequest::builder)
                .basePath("")
                .appendPathParam("admin")
                .appendPathParam("v1")
                .appendPathParam("CloudGateServers")
                .appendQueryParam("attributes", request.getAttributes())
                .appendListQueryParam(
                        "attributeSets",
                        request.getAttributeSets(),
                        com.oracle.bmc.util.internal.CollectionFormatType.Multi)
                .accept("application/json, application/scim+json")
                .appendHeader("authorization", request.getAuthorization())
                .appendHeader(
                        "resource_type_schema_version", request.getResourceTypeSchemaVersion())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.identitydomains.model.CloudGateServer.class,
                        CreateCloudGateServerResponse.Builder::cloudGateServer)
                .handleResponseHeaderString(
                        "opc-request-id", CreateCloudGateServerResponse.Builder::opcRequestId)
                .handleResponseHeaderString("etag", CreateCloudGateServerResponse.Builder::etag)
                .callSync();
    }

    @Override
    public CreateConditionResponse createCondition(CreateConditionRequest request) {

        return clientCall(request, CreateConditionResponse::builder)
                .logger(LOG, "createCondition")
                .serviceDetails("IdentityDomains", "CreateCondition", "")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(CreateConditionRequest::builder)
                .basePath("")
                .appendPathParam("admin")
                .appendPathParam("v1")
                .appendPathParam("Conditions")
                .appendQueryParam("attributes", request.getAttributes())
                .appendListQueryParam(
                        "attributeSets",
                        request.getAttributeSets(),
                        com.oracle.bmc.util.internal.CollectionFormatType.Multi)
                .accept("application/json, application/scim+json")
                .appendHeader("authorization", request.getAuthorization())
                .appendHeader(
                        "resource_type_schema_version", request.getResourceTypeSchemaVersion())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.identitydomains.model.Condition.class,
                        CreateConditionResponse.Builder::condition)
                .handleResponseHeaderString(
                        "opc-request-id", CreateConditionResponse.Builder::opcRequestId)
                .handleResponseHeaderString("etag", CreateConditionResponse.Builder::etag)
                .callSync();
    }

    @Override
    public CreateCustomerSecretKeyResponse createCustomerSecretKey(
            CreateCustomerSecretKeyRequest request) {

        return clientCall(request, CreateCustomerSecretKeyResponse::builder)
                .logger(LOG, "createCustomerSecretKey")
                .serviceDetails("IdentityDomains", "CreateCustomerSecretKey", "")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(CreateCustomerSecretKeyRequest::builder)
                .basePath("")
                .appendPathParam("admin")
                .appendPathParam("v1")
                .appendPathParam("CustomerSecretKeys")
                .appendQueryParam("attributes", request.getAttributes())
                .appendListQueryParam(
                        "attributeSets",
                        request.getAttributeSets(),
                        com.oracle.bmc.util.internal.CollectionFormatType.Multi)
                .accept("application/json, application/scim+json")
                .appendHeader("authorization", request.getAuthorization())
                .appendHeader(
                        "resource_type_schema_version", request.getResourceTypeSchemaVersion())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.identitydomains.model.CustomerSecretKey.class,
                        CreateCustomerSecretKeyResponse.Builder::customerSecretKey)
                .handleResponseHeaderString(
                        "opc-request-id", CreateCustomerSecretKeyResponse.Builder::opcRequestId)
                .handleResponseHeaderString("etag", CreateCustomerSecretKeyResponse.Builder::etag)
                .callSync();
    }

    @Override
    public CreateDynamicResourceGroupResponse createDynamicResourceGroup(
            CreateDynamicResourceGroupRequest request) {

        return clientCall(request, CreateDynamicResourceGroupResponse::builder)
                .logger(LOG, "createDynamicResourceGroup")
                .serviceDetails("IdentityDomains", "CreateDynamicResourceGroup", "")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(CreateDynamicResourceGroupRequest::builder)
                .basePath("")
                .appendPathParam("admin")
                .appendPathParam("v1")
                .appendPathParam("DynamicResourceGroups")
                .appendQueryParam("attributes", request.getAttributes())
                .appendListQueryParam(
                        "attributeSets",
                        request.getAttributeSets(),
                        com.oracle.bmc.util.internal.CollectionFormatType.Multi)
                .accept("application/json, application/scim+json")
                .appendHeader("authorization", request.getAuthorization())
                .appendHeader(
                        "resource_type_schema_version", request.getResourceTypeSchemaVersion())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.identitydomains.model.DynamicResourceGroup.class,
                        CreateDynamicResourceGroupResponse.Builder::dynamicResourceGroup)
                .handleResponseHeaderString(
                        "opc-request-id", CreateDynamicResourceGroupResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "etag", CreateDynamicResourceGroupResponse.Builder::etag)
                .callSync();
    }

    @Override
    public CreateGrantResponse createGrant(CreateGrantRequest request) {

        return clientCall(request, CreateGrantResponse::builder)
                .logger(LOG, "createGrant")
                .serviceDetails("IdentityDomains", "CreateGrant", "")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(CreateGrantRequest::builder)
                .basePath("")
                .appendPathParam("admin")
                .appendPathParam("v1")
                .appendPathParam("Grants")
                .appendQueryParam("attributes", request.getAttributes())
                .appendListQueryParam(
                        "attributeSets",
                        request.getAttributeSets(),
                        com.oracle.bmc.util.internal.CollectionFormatType.Multi)
                .accept("application/json, application/scim+json")
                .appendHeader("authorization", request.getAuthorization())
                .appendHeader(
                        "resource_type_schema_version", request.getResourceTypeSchemaVersion())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.identitydomains.model.Grant.class,
                        CreateGrantResponse.Builder::grant)
                .handleResponseHeaderString(
                        "opc-request-id", CreateGrantResponse.Builder::opcRequestId)
                .handleResponseHeaderString("etag", CreateGrantResponse.Builder::etag)
                .callSync();
    }

    @Override
    public CreateGroupResponse createGroup(CreateGroupRequest request) {

        return clientCall(request, CreateGroupResponse::builder)
                .logger(LOG, "createGroup")
                .serviceDetails("IdentityDomains", "CreateGroup", "")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(CreateGroupRequest::builder)
                .basePath("")
                .appendPathParam("admin")
                .appendPathParam("v1")
                .appendPathParam("Groups")
                .appendQueryParam("attributes", request.getAttributes())
                .appendListQueryParam(
                        "attributeSets",
                        request.getAttributeSets(),
                        com.oracle.bmc.util.internal.CollectionFormatType.Multi)
                .accept("application/json, application/scim+json")
                .appendHeader("authorization", request.getAuthorization())
                .appendHeader(
                        "resource_type_schema_version", request.getResourceTypeSchemaVersion())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.identitydomains.model.Group.class,
                        CreateGroupResponse.Builder::group)
                .handleResponseHeaderString(
                        "opc-request-id", CreateGroupResponse.Builder::opcRequestId)
                .handleResponseHeaderString("etag", CreateGroupResponse.Builder::etag)
                .callSync();
    }

    @Override
    public CreateIdentityPropagationTrustResponse createIdentityPropagationTrust(
            CreateIdentityPropagationTrustRequest request) {

        return clientCall(request, CreateIdentityPropagationTrustResponse::builder)
                .logger(LOG, "createIdentityPropagationTrust")
                .serviceDetails("IdentityDomains", "CreateIdentityPropagationTrust", "")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(CreateIdentityPropagationTrustRequest::builder)
                .basePath("")
                .appendPathParam("admin")
                .appendPathParam("v1")
                .appendPathParam("IdentityPropagationTrusts")
                .appendQueryParam("attributes", request.getAttributes())
                .appendListQueryParam(
                        "attributeSets",
                        request.getAttributeSets(),
                        com.oracle.bmc.util.internal.CollectionFormatType.Multi)
                .accept("application/json, application/scim+json")
                .appendHeader("authorization", request.getAuthorization())
                .appendHeader(
                        "resource_type_schema_version", request.getResourceTypeSchemaVersion())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.identitydomains.model.IdentityPropagationTrust.class,
                        CreateIdentityPropagationTrustResponse.Builder::identityPropagationTrust)
                .handleResponseHeaderString(
                        "opc-request-id",
                        CreateIdentityPropagationTrustResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "etag", CreateIdentityPropagationTrustResponse.Builder::etag)
                .callSync();
    }

    @Override
    public CreateIdentityProviderResponse createIdentityProvider(
            CreateIdentityProviderRequest request) {

        return clientCall(request, CreateIdentityProviderResponse::builder)
                .logger(LOG, "createIdentityProvider")
                .serviceDetails("IdentityDomains", "CreateIdentityProvider", "")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(CreateIdentityProviderRequest::builder)
                .basePath("")
                .appendPathParam("admin")
                .appendPathParam("v1")
                .appendPathParam("IdentityProviders")
                .appendQueryParam("attributes", request.getAttributes())
                .appendListQueryParam(
                        "attributeSets",
                        request.getAttributeSets(),
                        com.oracle.bmc.util.internal.CollectionFormatType.Multi)
                .accept("application/json, application/scim+json")
                .appendHeader("authorization", request.getAuthorization())
                .appendHeader(
                        "resource_type_schema_version", request.getResourceTypeSchemaVersion())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.identitydomains.model.IdentityProvider.class,
                        CreateIdentityProviderResponse.Builder::identityProvider)
                .handleResponseHeaderString(
                        "opc-request-id", CreateIdentityProviderResponse.Builder::opcRequestId)
                .handleResponseHeaderString("etag", CreateIdentityProviderResponse.Builder::etag)
                .callSync();
    }

    @Override
    public CreateMeResponse createMe(CreateMeRequest request) {

        return clientCall(request, CreateMeResponse::builder)
                .logger(LOG, "createMe")
                .serviceDetails("IdentityDomains", "CreateMe", "")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(CreateMeRequest::builder)
                .basePath("")
                .appendPathParam("admin")
                .appendPathParam("v1")
                .appendPathParam("Me")
                .appendQueryParam("attributes", request.getAttributes())
                .appendListQueryParam(
                        "attributeSets",
                        request.getAttributeSets(),
                        com.oracle.bmc.util.internal.CollectionFormatType.Multi)
                .accept("application/json, application/scim+json")
                .appendHeader("authorization", request.getAuthorization())
                .appendHeader(
                        "resource_type_schema_version", request.getResourceTypeSchemaVersion())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.identitydomains.model.Me.class, CreateMeResponse.Builder::me)
                .handleResponseHeaderString(
                        "opc-request-id", CreateMeResponse.Builder::opcRequestId)
                .handleResponseHeaderString("etag", CreateMeResponse.Builder::etag)
                .callSync();
    }

    @Override
    public CreateMyApiKeyResponse createMyApiKey(CreateMyApiKeyRequest request) {

        return clientCall(request, CreateMyApiKeyResponse::builder)
                .logger(LOG, "createMyApiKey")
                .serviceDetails("IdentityDomains", "CreateMyApiKey", "")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(CreateMyApiKeyRequest::builder)
                .basePath("")
                .appendPathParam("admin")
                .appendPathParam("v1")
                .appendPathParam("MyApiKeys")
                .accept("application/json, application/scim+json")
                .appendHeader("authorization", request.getAuthorization())
                .appendHeader(
                        "resource_type_schema_version", request.getResourceTypeSchemaVersion())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.identitydomains.model.MyApiKey.class,
                        CreateMyApiKeyResponse.Builder::myApiKey)
                .handleResponseHeaderString(
                        "opc-request-id", CreateMyApiKeyResponse.Builder::opcRequestId)
                .handleResponseHeaderString("etag", CreateMyApiKeyResponse.Builder::etag)
                .callSync();
    }

    @Override
    public CreateMyAuthTokenResponse createMyAuthToken(CreateMyAuthTokenRequest request) {

        return clientCall(request, CreateMyAuthTokenResponse::builder)
                .logger(LOG, "createMyAuthToken")
                .serviceDetails("IdentityDomains", "CreateMyAuthToken", "")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(CreateMyAuthTokenRequest::builder)
                .basePath("")
                .appendPathParam("admin")
                .appendPathParam("v1")
                .appendPathParam("MyAuthTokens")
                .accept("application/json, application/scim+json")
                .appendHeader("authorization", request.getAuthorization())
                .appendHeader(
                        "resource_type_schema_version", request.getResourceTypeSchemaVersion())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.identitydomains.model.MyAuthToken.class,
                        CreateMyAuthTokenResponse.Builder::myAuthToken)
                .handleResponseHeaderString(
                        "opc-request-id", CreateMyAuthTokenResponse.Builder::opcRequestId)
                .handleResponseHeaderString("etag", CreateMyAuthTokenResponse.Builder::etag)
                .callSync();
    }

    @Override
    public CreateMyAuthenticationFactorInitiatorResponse createMyAuthenticationFactorInitiator(
            CreateMyAuthenticationFactorInitiatorRequest request) {

        return clientCall(request, CreateMyAuthenticationFactorInitiatorResponse::builder)
                .logger(LOG, "createMyAuthenticationFactorInitiator")
                .serviceDetails("IdentityDomains", "CreateMyAuthenticationFactorInitiator", "")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(CreateMyAuthenticationFactorInitiatorRequest::builder)
                .basePath("")
                .appendPathParam("admin")
                .appendPathParam("v1")
                .appendPathParam("MyAuthenticationFactorInitiator")
                .accept("application/json, application/scim+json")
                .appendHeader("authorization", request.getAuthorization())
                .appendHeader(
                        "resource_type_schema_version", request.getResourceTypeSchemaVersion())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.identitydomains.model.MyAuthenticationFactorInitiator.class,
                        CreateMyAuthenticationFactorInitiatorResponse.Builder
                                ::myAuthenticationFactorInitiator)
                .handleResponseHeaderString(
                        "opc-request-id",
                        CreateMyAuthenticationFactorInitiatorResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "etag", CreateMyAuthenticationFactorInitiatorResponse.Builder::etag)
                .callSync();
    }

    @Override
    public CreateMyAuthenticationFactorValidatorResponse createMyAuthenticationFactorValidator(
            CreateMyAuthenticationFactorValidatorRequest request) {

        return clientCall(request, CreateMyAuthenticationFactorValidatorResponse::builder)
                .logger(LOG, "createMyAuthenticationFactorValidator")
                .serviceDetails("IdentityDomains", "CreateMyAuthenticationFactorValidator", "")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(CreateMyAuthenticationFactorValidatorRequest::builder)
                .basePath("")
                .appendPathParam("admin")
                .appendPathParam("v1")
                .appendPathParam("MyAuthenticationFactorValidator")
                .accept("application/json, application/scim+json")
                .appendHeader("authorization", request.getAuthorization())
                .appendHeader(
                        "resource_type_schema_version", request.getResourceTypeSchemaVersion())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.identitydomains.model.MyAuthenticationFactorValidator.class,
                        CreateMyAuthenticationFactorValidatorResponse.Builder
                                ::myAuthenticationFactorValidator)
                .handleResponseHeaderString(
                        "opc-request-id",
                        CreateMyAuthenticationFactorValidatorResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "etag", CreateMyAuthenticationFactorValidatorResponse.Builder::etag)
                .callSync();
    }

    @Override
    public CreateMyAuthenticationFactorsRemoverResponse createMyAuthenticationFactorsRemover(
            CreateMyAuthenticationFactorsRemoverRequest request) {

        return clientCall(request, CreateMyAuthenticationFactorsRemoverResponse::builder)
                .logger(LOG, "createMyAuthenticationFactorsRemover")
                .serviceDetails("IdentityDomains", "CreateMyAuthenticationFactorsRemover", "")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(CreateMyAuthenticationFactorsRemoverRequest::builder)
                .basePath("")
                .appendPathParam("admin")
                .appendPathParam("v1")
                .appendPathParam("MyAuthenticationFactorsRemover")
                .accept("application/json, application/scim+json")
                .appendHeader("authorization", request.getAuthorization())
                .appendHeader(
                        "resource_type_schema_version", request.getResourceTypeSchemaVersion())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.identitydomains.model.MyAuthenticationFactorsRemover.class,
                        CreateMyAuthenticationFactorsRemoverResponse.Builder
                                ::myAuthenticationFactorsRemover)
                .handleResponseHeaderString(
                        "opc-request-id",
                        CreateMyAuthenticationFactorsRemoverResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "etag", CreateMyAuthenticationFactorsRemoverResponse.Builder::etag)
                .callSync();
    }

    @Override
    public CreateMyCustomerSecretKeyResponse createMyCustomerSecretKey(
            CreateMyCustomerSecretKeyRequest request) {

        return clientCall(request, CreateMyCustomerSecretKeyResponse::builder)
                .logger(LOG, "createMyCustomerSecretKey")
                .serviceDetails("IdentityDomains", "CreateMyCustomerSecretKey", "")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(CreateMyCustomerSecretKeyRequest::builder)
                .basePath("")
                .appendPathParam("admin")
                .appendPathParam("v1")
                .appendPathParam("MyCustomerSecretKeys")
                .accept("application/json, application/scim+json")
                .appendHeader("authorization", request.getAuthorization())
                .appendHeader(
                        "resource_type_schema_version", request.getResourceTypeSchemaVersion())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.identitydomains.model.MyCustomerSecretKey.class,
                        CreateMyCustomerSecretKeyResponse.Builder::myCustomerSecretKey)
                .handleResponseHeaderString(
                        "opc-request-id", CreateMyCustomerSecretKeyResponse.Builder::opcRequestId)
                .handleResponseHeaderString("etag", CreateMyCustomerSecretKeyResponse.Builder::etag)
                .callSync();
    }

    @Override
    public CreateMyOAuth2ClientCredentialResponse createMyOAuth2ClientCredential(
            CreateMyOAuth2ClientCredentialRequest request) {

        return clientCall(request, CreateMyOAuth2ClientCredentialResponse::builder)
                .logger(LOG, "createMyOAuth2ClientCredential")
                .serviceDetails("IdentityDomains", "CreateMyOAuth2ClientCredential", "")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(CreateMyOAuth2ClientCredentialRequest::builder)
                .basePath("")
                .appendPathParam("admin")
                .appendPathParam("v1")
                .appendPathParam("MyOAuth2ClientCredentials")
                .accept("application/json, application/scim+json")
                .appendHeader("authorization", request.getAuthorization())
                .appendHeader(
                        "resource_type_schema_version", request.getResourceTypeSchemaVersion())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.identitydomains.model.MyOAuth2ClientCredential.class,
                        CreateMyOAuth2ClientCredentialResponse.Builder::myOAuth2ClientCredential)
                .handleResponseHeaderString(
                        "opc-request-id",
                        CreateMyOAuth2ClientCredentialResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "etag", CreateMyOAuth2ClientCredentialResponse.Builder::etag)
                .callSync();
    }

    @Override
    public CreateMyRequestResponse createMyRequest(CreateMyRequestRequest request) {

        return clientCall(request, CreateMyRequestResponse::builder)
                .logger(LOG, "createMyRequest")
                .serviceDetails("IdentityDomains", "CreateMyRequest", "")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(CreateMyRequestRequest::builder)
                .basePath("")
                .appendPathParam("admin")
                .appendPathParam("v1")
                .appendPathParam("MyRequests")
                .appendQueryParam("attributes", request.getAttributes())
                .appendListQueryParam(
                        "attributeSets",
                        request.getAttributeSets(),
                        com.oracle.bmc.util.internal.CollectionFormatType.Multi)
                .accept("application/json, application/scim+json")
                .appendHeader("authorization", request.getAuthorization())
                .appendHeader(
                        "resource_type_schema_version", request.getResourceTypeSchemaVersion())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.identitydomains.model.MyRequest.class,
                        CreateMyRequestResponse.Builder::myRequest)
                .handleResponseHeaderString(
                        "opc-request-id", CreateMyRequestResponse.Builder::opcRequestId)
                .handleResponseHeaderString("etag", CreateMyRequestResponse.Builder::etag)
                .callSync();
    }

    @Override
    public CreateMySmtpCredentialResponse createMySmtpCredential(
            CreateMySmtpCredentialRequest request) {

        return clientCall(request, CreateMySmtpCredentialResponse::builder)
                .logger(LOG, "createMySmtpCredential")
                .serviceDetails("IdentityDomains", "CreateMySmtpCredential", "")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(CreateMySmtpCredentialRequest::builder)
                .basePath("")
                .appendPathParam("admin")
                .appendPathParam("v1")
                .appendPathParam("MySmtpCredentials")
                .accept("application/json, application/scim+json")
                .appendHeader("authorization", request.getAuthorization())
                .appendHeader(
                        "resource_type_schema_version", request.getResourceTypeSchemaVersion())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.identitydomains.model.MySmtpCredential.class,
                        CreateMySmtpCredentialResponse.Builder::mySmtpCredential)
                .handleResponseHeaderString(
                        "opc-request-id", CreateMySmtpCredentialResponse.Builder::opcRequestId)
                .handleResponseHeaderString("etag", CreateMySmtpCredentialResponse.Builder::etag)
                .callSync();
    }

    @Override
    public CreateMySupportAccountResponse createMySupportAccount(
            CreateMySupportAccountRequest request) {

        return clientCall(request, CreateMySupportAccountResponse::builder)
                .logger(LOG, "createMySupportAccount")
                .serviceDetails("IdentityDomains", "CreateMySupportAccount", "")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(CreateMySupportAccountRequest::builder)
                .basePath("")
                .appendPathParam("admin")
                .appendPathParam("v1")
                .appendPathParam("MySupportAccounts")
                .accept("application/json, application/scim+json")
                .appendHeader("authorization", request.getAuthorization())
                .appendHeader(
                        "resource_type_schema_version", request.getResourceTypeSchemaVersion())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.identitydomains.model.MySupportAccount.class,
                        CreateMySupportAccountResponse.Builder::mySupportAccount)
                .handleResponseHeaderString(
                        "opc-request-id", CreateMySupportAccountResponse.Builder::opcRequestId)
                .handleResponseHeaderString("etag", CreateMySupportAccountResponse.Builder::etag)
                .callSync();
    }

    @Override
    public CreateMyUserDbCredentialResponse createMyUserDbCredential(
            CreateMyUserDbCredentialRequest request) {

        return clientCall(request, CreateMyUserDbCredentialResponse::builder)
                .logger(LOG, "createMyUserDbCredential")
                .serviceDetails("IdentityDomains", "CreateMyUserDbCredential", "")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(CreateMyUserDbCredentialRequest::builder)
                .basePath("")
                .appendPathParam("admin")
                .appendPathParam("v1")
                .appendPathParam("MyUserDbCredentials")
                .accept("application/json, application/scim+json")
                .appendHeader("authorization", request.getAuthorization())
                .appendHeader(
                        "resource_type_schema_version", request.getResourceTypeSchemaVersion())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.identitydomains.model.MyUserDbCredential.class,
                        CreateMyUserDbCredentialResponse.Builder::myUserDbCredential)
                .handleResponseHeaderString(
                        "opc-request-id", CreateMyUserDbCredentialResponse.Builder::opcRequestId)
                .handleResponseHeaderString("etag", CreateMyUserDbCredentialResponse.Builder::etag)
                .callSync();
    }

    @Override
    public CreateNetworkPerimeterResponse createNetworkPerimeter(
            CreateNetworkPerimeterRequest request) {

        return clientCall(request, CreateNetworkPerimeterResponse::builder)
                .logger(LOG, "createNetworkPerimeter")
                .serviceDetails("IdentityDomains", "CreateNetworkPerimeter", "")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(CreateNetworkPerimeterRequest::builder)
                .basePath("")
                .appendPathParam("admin")
                .appendPathParam("v1")
                .appendPathParam("NetworkPerimeters")
                .appendQueryParam("attributes", request.getAttributes())
                .appendListQueryParam(
                        "attributeSets",
                        request.getAttributeSets(),
                        com.oracle.bmc.util.internal.CollectionFormatType.Multi)
                .accept("application/json, application/scim+json")
                .appendHeader("authorization", request.getAuthorization())
                .appendHeader(
                        "resource_type_schema_version", request.getResourceTypeSchemaVersion())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.identitydomains.model.NetworkPerimeter.class,
                        CreateNetworkPerimeterResponse.Builder::networkPerimeter)
                .handleResponseHeaderString(
                        "opc-request-id", CreateNetworkPerimeterResponse.Builder::opcRequestId)
                .handleResponseHeaderString("etag", CreateNetworkPerimeterResponse.Builder::etag)
                .callSync();
    }

    @Override
    public CreateOAuth2ClientCredentialResponse createOAuth2ClientCredential(
            CreateOAuth2ClientCredentialRequest request) {

        return clientCall(request, CreateOAuth2ClientCredentialResponse::builder)
                .logger(LOG, "createOAuth2ClientCredential")
                .serviceDetails("IdentityDomains", "CreateOAuth2ClientCredential", "")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(CreateOAuth2ClientCredentialRequest::builder)
                .basePath("")
                .appendPathParam("admin")
                .appendPathParam("v1")
                .appendPathParam("OAuth2ClientCredentials")
                .appendQueryParam("attributes", request.getAttributes())
                .appendListQueryParam(
                        "attributeSets",
                        request.getAttributeSets(),
                        com.oracle.bmc.util.internal.CollectionFormatType.Multi)
                .accept("application/json, application/scim+json")
                .appendHeader("authorization", request.getAuthorization())
                .appendHeader(
                        "resource_type_schema_version", request.getResourceTypeSchemaVersion())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.identitydomains.model.OAuth2ClientCredential.class,
                        CreateOAuth2ClientCredentialResponse.Builder::oAuth2ClientCredential)
                .handleResponseHeaderString(
                        "opc-request-id",
                        CreateOAuth2ClientCredentialResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "etag", CreateOAuth2ClientCredentialResponse.Builder::etag)
                .callSync();
    }

    @Override
    public CreateOAuthClientCertificateResponse createOAuthClientCertificate(
            CreateOAuthClientCertificateRequest request) {

        return clientCall(request, CreateOAuthClientCertificateResponse::builder)
                .logger(LOG, "createOAuthClientCertificate")
                .serviceDetails("IdentityDomains", "CreateOAuthClientCertificate", "")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(CreateOAuthClientCertificateRequest::builder)
                .basePath("")
                .appendPathParam("admin")
                .appendPathParam("v1")
                .appendPathParam("OAuthClientCertificates")
                .accept("application/json, application/scim+json")
                .appendHeader("authorization", request.getAuthorization())
                .appendHeader(
                        "resource_type_schema_version", request.getResourceTypeSchemaVersion())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.identitydomains.model.OAuthClientCertificate.class,
                        CreateOAuthClientCertificateResponse.Builder::oAuthClientCertificate)
                .handleResponseHeaderString(
                        "opc-request-id",
                        CreateOAuthClientCertificateResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "etag", CreateOAuthClientCertificateResponse.Builder::etag)
                .callSync();
    }

    @Override
    public CreateOAuthPartnerCertificateResponse createOAuthPartnerCertificate(
            CreateOAuthPartnerCertificateRequest request) {

        return clientCall(request, CreateOAuthPartnerCertificateResponse::builder)
                .logger(LOG, "createOAuthPartnerCertificate")
                .serviceDetails("IdentityDomains", "CreateOAuthPartnerCertificate", "")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(CreateOAuthPartnerCertificateRequest::builder)
                .basePath("")
                .appendPathParam("admin")
                .appendPathParam("v1")
                .appendPathParam("OAuthPartnerCertificates")
                .accept("application/json, application/scim+json")
                .appendHeader("authorization", request.getAuthorization())
                .appendHeader(
                        "resource_type_schema_version", request.getResourceTypeSchemaVersion())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.identitydomains.model.OAuthPartnerCertificate.class,
                        CreateOAuthPartnerCertificateResponse.Builder::oAuthPartnerCertificate)
                .handleResponseHeaderString(
                        "opc-request-id",
                        CreateOAuthPartnerCertificateResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "etag", CreateOAuthPartnerCertificateResponse.Builder::etag)
                .callSync();
    }

    @Override
    public CreatePasswordPolicyResponse createPasswordPolicy(CreatePasswordPolicyRequest request) {

        return clientCall(request, CreatePasswordPolicyResponse::builder)
                .logger(LOG, "createPasswordPolicy")
                .serviceDetails("IdentityDomains", "CreatePasswordPolicy", "")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(CreatePasswordPolicyRequest::builder)
                .basePath("")
                .appendPathParam("admin")
                .appendPathParam("v1")
                .appendPathParam("PasswordPolicies")
                .appendQueryParam("attributes", request.getAttributes())
                .appendListQueryParam(
                        "attributeSets",
                        request.getAttributeSets(),
                        com.oracle.bmc.util.internal.CollectionFormatType.Multi)
                .accept("application/json, application/scim+json")
                .appendHeader("authorization", request.getAuthorization())
                .appendHeader(
                        "resource_type_schema_version", request.getResourceTypeSchemaVersion())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.identitydomains.model.PasswordPolicy.class,
                        CreatePasswordPolicyResponse.Builder::passwordPolicy)
                .handleResponseHeaderString(
                        "opc-request-id", CreatePasswordPolicyResponse.Builder::opcRequestId)
                .handleResponseHeaderString("etag", CreatePasswordPolicyResponse.Builder::etag)
                .callSync();
    }

    @Override
    public CreatePolicyResponse createPolicy(CreatePolicyRequest request) {

        return clientCall(request, CreatePolicyResponse::builder)
                .logger(LOG, "createPolicy")
                .serviceDetails("IdentityDomains", "CreatePolicy", "")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(CreatePolicyRequest::builder)
                .basePath("")
                .appendPathParam("admin")
                .appendPathParam("v1")
                .appendPathParam("Policies")
                .appendQueryParam("attributes", request.getAttributes())
                .appendListQueryParam(
                        "attributeSets",
                        request.getAttributeSets(),
                        com.oracle.bmc.util.internal.CollectionFormatType.Multi)
                .accept("application/json, application/scim+json")
                .appendHeader("authorization", request.getAuthorization())
                .appendHeader(
                        "resource_type_schema_version", request.getResourceTypeSchemaVersion())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.identitydomains.model.Policy.class,
                        CreatePolicyResponse.Builder::policy)
                .handleResponseHeaderString(
                        "opc-request-id", CreatePolicyResponse.Builder::opcRequestId)
                .handleResponseHeaderString("etag", CreatePolicyResponse.Builder::etag)
                .callSync();
    }

    @Override
    public CreateRestoreOciConsolePolicyResponse createRestoreOciConsolePolicy(
            CreateRestoreOciConsolePolicyRequest request) {

        return clientCall(request, CreateRestoreOciConsolePolicyResponse::builder)
                .logger(LOG, "createRestoreOciConsolePolicy")
                .serviceDetails("IdentityDomains", "CreateRestoreOciConsolePolicy", "")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(CreateRestoreOciConsolePolicyRequest::builder)
                .basePath("")
                .appendPathParam("admin")
                .appendPathParam("v1")
                .appendPathParam("RestoreOciConsolePolicy")
                .accept("application/json, application/scim+json")
                .appendHeader("authorization", request.getAuthorization())
                .appendHeader(
                        "resource_type_schema_version", request.getResourceTypeSchemaVersion())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.identitydomains.model.RestoreOciConsolePolicy.class,
                        CreateRestoreOciConsolePolicyResponse.Builder::restoreOciConsolePolicy)
                .handleResponseHeaderString(
                        "opc-request-id",
                        CreateRestoreOciConsolePolicyResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "etag", CreateRestoreOciConsolePolicyResponse.Builder::etag)
                .callSync();
    }

    @Override
    public CreateRuleResponse createRule(CreateRuleRequest request) {

        return clientCall(request, CreateRuleResponse::builder)
                .logger(LOG, "createRule")
                .serviceDetails("IdentityDomains", "CreateRule", "")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(CreateRuleRequest::builder)
                .basePath("")
                .appendPathParam("admin")
                .appendPathParam("v1")
                .appendPathParam("Rules")
                .appendQueryParam("attributes", request.getAttributes())
                .appendListQueryParam(
                        "attributeSets",
                        request.getAttributeSets(),
                        com.oracle.bmc.util.internal.CollectionFormatType.Multi)
                .accept("application/json, application/scim+json")
                .appendHeader("authorization", request.getAuthorization())
                .appendHeader(
                        "resource_type_schema_version", request.getResourceTypeSchemaVersion())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.identitydomains.model.Rule.class,
                        CreateRuleResponse.Builder::rule)
                .handleResponseHeaderString(
                        "opc-request-id", CreateRuleResponse.Builder::opcRequestId)
                .handleResponseHeaderString("etag", CreateRuleResponse.Builder::etag)
                .callSync();
    }

    @Override
    public CreateSecurityQuestionResponse createSecurityQuestion(
            CreateSecurityQuestionRequest request) {

        return clientCall(request, CreateSecurityQuestionResponse::builder)
                .logger(LOG, "createSecurityQuestion")
                .serviceDetails("IdentityDomains", "CreateSecurityQuestion", "")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(CreateSecurityQuestionRequest::builder)
                .basePath("")
                .appendPathParam("admin")
                .appendPathParam("v1")
                .appendPathParam("SecurityQuestions")
                .appendQueryParam("attributes", request.getAttributes())
                .appendListQueryParam(
                        "attributeSets",
                        request.getAttributeSets(),
                        com.oracle.bmc.util.internal.CollectionFormatType.Multi)
                .accept("application/json, application/scim+json")
                .appendHeader("authorization", request.getAuthorization())
                .appendHeader(
                        "resource_type_schema_version", request.getResourceTypeSchemaVersion())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.identitydomains.model.SecurityQuestion.class,
                        CreateSecurityQuestionResponse.Builder::securityQuestion)
                .handleResponseHeaderString(
                        "opc-request-id", CreateSecurityQuestionResponse.Builder::opcRequestId)
                .handleResponseHeaderString("etag", CreateSecurityQuestionResponse.Builder::etag)
                .callSync();
    }

    @Override
    public CreateSelfRegistrationProfileResponse createSelfRegistrationProfile(
            CreateSelfRegistrationProfileRequest request) {

        return clientCall(request, CreateSelfRegistrationProfileResponse::builder)
                .logger(LOG, "createSelfRegistrationProfile")
                .serviceDetails("IdentityDomains", "CreateSelfRegistrationProfile", "")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(CreateSelfRegistrationProfileRequest::builder)
                .basePath("")
                .appendPathParam("admin")
                .appendPathParam("v1")
                .appendPathParam("SelfRegistrationProfiles")
                .appendQueryParam("attributes", request.getAttributes())
                .appendListQueryParam(
                        "attributeSets",
                        request.getAttributeSets(),
                        com.oracle.bmc.util.internal.CollectionFormatType.Multi)
                .accept("application/json, application/scim+json")
                .appendHeader("authorization", request.getAuthorization())
                .appendHeader(
                        "resource_type_schema_version", request.getResourceTypeSchemaVersion())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.identitydomains.model.SelfRegistrationProfile.class,
                        CreateSelfRegistrationProfileResponse.Builder::selfRegistrationProfile)
                .handleResponseHeaderString(
                        "opc-request-id",
                        CreateSelfRegistrationProfileResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "etag", CreateSelfRegistrationProfileResponse.Builder::etag)
                .callSync();
    }

    @Override
    public CreateSmtpCredentialResponse createSmtpCredential(CreateSmtpCredentialRequest request) {

        return clientCall(request, CreateSmtpCredentialResponse::builder)
                .logger(LOG, "createSmtpCredential")
                .serviceDetails("IdentityDomains", "CreateSmtpCredential", "")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(CreateSmtpCredentialRequest::builder)
                .basePath("")
                .appendPathParam("admin")
                .appendPathParam("v1")
                .appendPathParam("SmtpCredentials")
                .appendQueryParam("attributes", request.getAttributes())
                .appendListQueryParam(
                        "attributeSets",
                        request.getAttributeSets(),
                        com.oracle.bmc.util.internal.CollectionFormatType.Multi)
                .accept("application/json, application/scim+json")
                .appendHeader("authorization", request.getAuthorization())
                .appendHeader(
                        "resource_type_schema_version", request.getResourceTypeSchemaVersion())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.identitydomains.model.SmtpCredential.class,
                        CreateSmtpCredentialResponse.Builder::smtpCredential)
                .handleResponseHeaderString(
                        "opc-request-id", CreateSmtpCredentialResponse.Builder::opcRequestId)
                .handleResponseHeaderString("etag", CreateSmtpCredentialResponse.Builder::etag)
                .callSync();
    }

    @Override
    public CreateSocialIdentityProviderResponse createSocialIdentityProvider(
            CreateSocialIdentityProviderRequest request) {

        return clientCall(request, CreateSocialIdentityProviderResponse::builder)
                .logger(LOG, "createSocialIdentityProvider")
                .serviceDetails("IdentityDomains", "CreateSocialIdentityProvider", "")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(CreateSocialIdentityProviderRequest::builder)
                .basePath("")
                .appendPathParam("admin")
                .appendPathParam("v1")
                .appendPathParam("SocialIdentityProviders")
                .accept("application/json, application/scim+json")
                .appendHeader("authorization", request.getAuthorization())
                .appendHeader(
                        "resource_type_schema_version", request.getResourceTypeSchemaVersion())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.identitydomains.model.SocialIdentityProvider.class,
                        CreateSocialIdentityProviderResponse.Builder::socialIdentityProvider)
                .handleResponseHeaderString(
                        "opc-request-id",
                        CreateSocialIdentityProviderResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "etag", CreateSocialIdentityProviderResponse.Builder::etag)
                .callSync();
    }

    @Override
    public CreateUserResponse createUser(CreateUserRequest request) {

        return clientCall(request, CreateUserResponse::builder)
                .logger(LOG, "createUser")
                .serviceDetails("IdentityDomains", "CreateUser", "")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(CreateUserRequest::builder)
                .basePath("")
                .appendPathParam("admin")
                .appendPathParam("v1")
                .appendPathParam("Users")
                .appendQueryParam("attributes", request.getAttributes())
                .appendListQueryParam(
                        "attributeSets",
                        request.getAttributeSets(),
                        com.oracle.bmc.util.internal.CollectionFormatType.Multi)
                .accept("application/json, application/scim+json")
                .appendHeader("authorization", request.getAuthorization())
                .appendHeader(
                        "resource_type_schema_version", request.getResourceTypeSchemaVersion())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.identitydomains.model.User.class,
                        CreateUserResponse.Builder::user)
                .handleResponseHeaderString(
                        "opc-request-id", CreateUserResponse.Builder::opcRequestId)
                .handleResponseHeaderString("etag", CreateUserResponse.Builder::etag)
                .callSync();
    }

    @Override
    public CreateUserDbCredentialResponse createUserDbCredential(
            CreateUserDbCredentialRequest request) {

        return clientCall(request, CreateUserDbCredentialResponse::builder)
                .logger(LOG, "createUserDbCredential")
                .serviceDetails("IdentityDomains", "CreateUserDbCredential", "")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(CreateUserDbCredentialRequest::builder)
                .basePath("")
                .appendPathParam("admin")
                .appendPathParam("v1")
                .appendPathParam("UserDbCredentials")
                .appendQueryParam("attributes", request.getAttributes())
                .appendListQueryParam(
                        "attributeSets",
                        request.getAttributeSets(),
                        com.oracle.bmc.util.internal.CollectionFormatType.Multi)
                .accept("application/json, application/scim+json")
                .appendHeader("authorization", request.getAuthorization())
                .appendHeader(
                        "resource_type_schema_version", request.getResourceTypeSchemaVersion())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.identitydomains.model.UserDbCredential.class,
                        CreateUserDbCredentialResponse.Builder::userDbCredential)
                .handleResponseHeaderString(
                        "opc-request-id", CreateUserDbCredentialResponse.Builder::opcRequestId)
                .handleResponseHeaderString("etag", CreateUserDbCredentialResponse.Builder::etag)
                .callSync();
    }

    @Override
    public DeleteApiKeyResponse deleteApiKey(DeleteApiKeyRequest request) {

        Validate.notBlank(request.getApiKeyId(), "apiKeyId must not be blank");

        return clientCall(request, DeleteApiKeyResponse::builder)
                .logger(LOG, "deleteApiKey")
                .serviceDetails(
                        "IdentityDomains",
                        "DeleteApiKey",
                        "https://docs.oracle.com/iaas/api/#/en/identity-domains/v1/ApiKey/DeleteApiKey")
                .method(com.oracle.bmc.http.client.Method.DELETE)
                .requestBuilder(DeleteApiKeyRequest::builder)
                .basePath("")
                .appendPathParam("admin")
                .appendPathParam("v1")
                .appendPathParam("ApiKeys")
                .appendPathParam(request.getApiKeyId())
                .appendQueryParam("forceDelete", request.getForceDelete())
                .accept("application/json, application/scim+json")
                .appendHeader("authorization", request.getAuthorization())
                .appendHeader(
                        "resource_type_schema_version", request.getResourceTypeSchemaVersion())
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .handleResponseHeaderString(
                        "opc-request-id", DeleteApiKeyResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public DeleteAppResponse deleteApp(DeleteAppRequest request) {

        Validate.notBlank(request.getAppId(), "appId must not be blank");

        return clientCall(request, DeleteAppResponse::builder)
                .logger(LOG, "deleteApp")
                .serviceDetails(
                        "IdentityDomains",
                        "DeleteApp",
                        "https://docs.oracle.com/iaas/api/#/en/identity-domains/v1/App/DeleteApp")
                .method(com.oracle.bmc.http.client.Method.DELETE)
                .requestBuilder(DeleteAppRequest::builder)
                .basePath("")
                .appendPathParam("admin")
                .appendPathParam("v1")
                .appendPathParam("Apps")
                .appendPathParam(request.getAppId())
                .appendQueryParam("forceDelete", request.getForceDelete())
                .accept("application/json, application/scim+json")
                .appendHeader("authorization", request.getAuthorization())
                .appendHeader(
                        "resource_type_schema_version", request.getResourceTypeSchemaVersion())
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .handleResponseHeaderString(
                        "opc-request-id", DeleteAppResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public DeleteAppRoleResponse deleteAppRole(DeleteAppRoleRequest request) {

        Validate.notBlank(request.getAppRoleId(), "appRoleId must not be blank");

        return clientCall(request, DeleteAppRoleResponse::builder)
                .logger(LOG, "deleteAppRole")
                .serviceDetails(
                        "IdentityDomains",
                        "DeleteAppRole",
                        "https://docs.oracle.com/iaas/api/#/en/identity-domains/v1/AppRole/DeleteAppRole")
                .method(com.oracle.bmc.http.client.Method.DELETE)
                .requestBuilder(DeleteAppRoleRequest::builder)
                .basePath("")
                .appendPathParam("admin")
                .appendPathParam("v1")
                .appendPathParam("AppRoles")
                .appendPathParam(request.getAppRoleId())
                .appendQueryParam("forceDelete", request.getForceDelete())
                .accept("application/json, application/scim+json")
                .appendHeader("authorization", request.getAuthorization())
                .appendHeader(
                        "resource_type_schema_version", request.getResourceTypeSchemaVersion())
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .handleResponseHeaderString(
                        "opc-request-id", DeleteAppRoleResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public DeleteApprovalWorkflowResponse deleteApprovalWorkflow(
            DeleteApprovalWorkflowRequest request) {

        Validate.notBlank(request.getApprovalWorkflowId(), "approvalWorkflowId must not be blank");

        return clientCall(request, DeleteApprovalWorkflowResponse::builder)
                .logger(LOG, "deleteApprovalWorkflow")
                .serviceDetails(
                        "IdentityDomains",
                        "DeleteApprovalWorkflow",
                        "https://docs.oracle.com/iaas/api/#/en/identity-domains/v1/ApprovalWorkflow/DeleteApprovalWorkflow")
                .method(com.oracle.bmc.http.client.Method.DELETE)
                .requestBuilder(DeleteApprovalWorkflowRequest::builder)
                .basePath("")
                .appendPathParam("admin")
                .appendPathParam("v1")
                .appendPathParam("ApprovalWorkflows")
                .appendPathParam(request.getApprovalWorkflowId())
                .appendQueryParam("forceDelete", request.getForceDelete())
                .accept("application/json, application/scim+json")
                .appendHeader("authorization", request.getAuthorization())
                .appendHeader(
                        "resource_type_schema_version", request.getResourceTypeSchemaVersion())
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .handleResponseHeaderString(
                        "opc-request-id", DeleteApprovalWorkflowResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public DeleteApprovalWorkflowAssignmentResponse deleteApprovalWorkflowAssignment(
            DeleteApprovalWorkflowAssignmentRequest request) {

        Validate.notBlank(
                request.getApprovalWorkflowAssignmentId(),
                "approvalWorkflowAssignmentId must not be blank");

        return clientCall(request, DeleteApprovalWorkflowAssignmentResponse::builder)
                .logger(LOG, "deleteApprovalWorkflowAssignment")
                .serviceDetails(
                        "IdentityDomains",
                        "DeleteApprovalWorkflowAssignment",
                        "https://docs.oracle.com/iaas/api/#/en/identity-domains/v1/ApprovalWorkflowAssignment/DeleteApprovalWorkflowAssignment")
                .method(com.oracle.bmc.http.client.Method.DELETE)
                .requestBuilder(DeleteApprovalWorkflowAssignmentRequest::builder)
                .basePath("")
                .appendPathParam("admin")
                .appendPathParam("v1")
                .appendPathParam("ApprovalWorkflowAssignments")
                .appendPathParam(request.getApprovalWorkflowAssignmentId())
                .appendQueryParam("forceDelete", request.getForceDelete())
                .accept("application/json, application/scim+json")
                .appendHeader("authorization", request.getAuthorization())
                .appendHeader(
                        "resource_type_schema_version", request.getResourceTypeSchemaVersion())
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .handleResponseHeaderString(
                        "opc-request-id",
                        DeleteApprovalWorkflowAssignmentResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public DeleteApprovalWorkflowStepResponse deleteApprovalWorkflowStep(
            DeleteApprovalWorkflowStepRequest request) {

        Validate.notBlank(
                request.getApprovalWorkflowStepId(), "approvalWorkflowStepId must not be blank");

        return clientCall(request, DeleteApprovalWorkflowStepResponse::builder)
                .logger(LOG, "deleteApprovalWorkflowStep")
                .serviceDetails(
                        "IdentityDomains",
                        "DeleteApprovalWorkflowStep",
                        "https://docs.oracle.com/iaas/api/#/en/identity-domains/v1/ApprovalWorkflowStep/DeleteApprovalWorkflowStep")
                .method(com.oracle.bmc.http.client.Method.DELETE)
                .requestBuilder(DeleteApprovalWorkflowStepRequest::builder)
                .basePath("")
                .appendPathParam("admin")
                .appendPathParam("v1")
                .appendPathParam("ApprovalWorkflowSteps")
                .appendPathParam(request.getApprovalWorkflowStepId())
                .appendQueryParam("forceDelete", request.getForceDelete())
                .accept("application/json, application/scim+json")
                .appendHeader("authorization", request.getAuthorization())
                .appendHeader(
                        "resource_type_schema_version", request.getResourceTypeSchemaVersion())
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .handleResponseHeaderString(
                        "opc-request-id", DeleteApprovalWorkflowStepResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public DeleteAuthTokenResponse deleteAuthToken(DeleteAuthTokenRequest request) {

        Validate.notBlank(request.getAuthTokenId(), "authTokenId must not be blank");

        return clientCall(request, DeleteAuthTokenResponse::builder)
                .logger(LOG, "deleteAuthToken")
                .serviceDetails(
                        "IdentityDomains",
                        "DeleteAuthToken",
                        "https://docs.oracle.com/iaas/api/#/en/identity-domains/v1/AuthToken/DeleteAuthToken")
                .method(com.oracle.bmc.http.client.Method.DELETE)
                .requestBuilder(DeleteAuthTokenRequest::builder)
                .basePath("")
                .appendPathParam("admin")
                .appendPathParam("v1")
                .appendPathParam("AuthTokens")
                .appendPathParam(request.getAuthTokenId())
                .appendQueryParam("forceDelete", request.getForceDelete())
                .accept("application/json, application/scim+json")
                .appendHeader("authorization", request.getAuthorization())
                .appendHeader(
                        "resource_type_schema_version", request.getResourceTypeSchemaVersion())
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .handleResponseHeaderString(
                        "opc-request-id", DeleteAuthTokenResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public DeleteCloudGateResponse deleteCloudGate(DeleteCloudGateRequest request) {

        Validate.notBlank(request.getCloudGateId(), "cloudGateId must not be blank");

        return clientCall(request, DeleteCloudGateResponse::builder)
                .logger(LOG, "deleteCloudGate")
                .serviceDetails(
                        "IdentityDomains",
                        "DeleteCloudGate",
                        "https://docs.oracle.com/iaas/api/#/en/identity-domains/v1/CloudGate/DeleteCloudGate")
                .method(com.oracle.bmc.http.client.Method.DELETE)
                .requestBuilder(DeleteCloudGateRequest::builder)
                .basePath("")
                .appendPathParam("admin")
                .appendPathParam("v1")
                .appendPathParam("CloudGates")
                .appendPathParam(request.getCloudGateId())
                .appendQueryParam("forceDelete", request.getForceDelete())
                .accept("application/json, application/scim+json")
                .appendHeader("authorization", request.getAuthorization())
                .appendHeader(
                        "resource_type_schema_version", request.getResourceTypeSchemaVersion())
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .handleResponseHeaderString(
                        "opc-request-id", DeleteCloudGateResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public DeleteCloudGateMappingResponse deleteCloudGateMapping(
            DeleteCloudGateMappingRequest request) {

        Validate.notBlank(request.getCloudGateMappingId(), "cloudGateMappingId must not be blank");

        return clientCall(request, DeleteCloudGateMappingResponse::builder)
                .logger(LOG, "deleteCloudGateMapping")
                .serviceDetails(
                        "IdentityDomains",
                        "DeleteCloudGateMapping",
                        "https://docs.oracle.com/iaas/api/#/en/identity-domains/v1/CloudGateMapping/DeleteCloudGateMapping")
                .method(com.oracle.bmc.http.client.Method.DELETE)
                .requestBuilder(DeleteCloudGateMappingRequest::builder)
                .basePath("")
                .appendPathParam("admin")
                .appendPathParam("v1")
                .appendPathParam("CloudGateMappings")
                .appendPathParam(request.getCloudGateMappingId())
                .appendQueryParam("forceDelete", request.getForceDelete())
                .accept("application/json, application/scim+json")
                .appendHeader("authorization", request.getAuthorization())
                .appendHeader(
                        "resource_type_schema_version", request.getResourceTypeSchemaVersion())
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .handleResponseHeaderString(
                        "opc-request-id", DeleteCloudGateMappingResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public DeleteCloudGateServerResponse deleteCloudGateServer(
            DeleteCloudGateServerRequest request) {

        Validate.notBlank(request.getCloudGateServerId(), "cloudGateServerId must not be blank");

        return clientCall(request, DeleteCloudGateServerResponse::builder)
                .logger(LOG, "deleteCloudGateServer")
                .serviceDetails(
                        "IdentityDomains",
                        "DeleteCloudGateServer",
                        "https://docs.oracle.com/iaas/api/#/en/identity-domains/v1/CloudGateServer/DeleteCloudGateServer")
                .method(com.oracle.bmc.http.client.Method.DELETE)
                .requestBuilder(DeleteCloudGateServerRequest::builder)
                .basePath("")
                .appendPathParam("admin")
                .appendPathParam("v1")
                .appendPathParam("CloudGateServers")
                .appendPathParam(request.getCloudGateServerId())
                .appendQueryParam("forceDelete", request.getForceDelete())
                .accept("application/json, application/scim+json")
                .appendHeader("authorization", request.getAuthorization())
                .appendHeader(
                        "resource_type_schema_version", request.getResourceTypeSchemaVersion())
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .handleResponseHeaderString(
                        "opc-request-id", DeleteCloudGateServerResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public DeleteConditionResponse deleteCondition(DeleteConditionRequest request) {

        Validate.notBlank(request.getConditionId(), "conditionId must not be blank");

        return clientCall(request, DeleteConditionResponse::builder)
                .logger(LOG, "deleteCondition")
                .serviceDetails(
                        "IdentityDomains",
                        "DeleteCondition",
                        "https://docs.oracle.com/iaas/api/#/en/identity-domains/v1/Condition/DeleteCondition")
                .method(com.oracle.bmc.http.client.Method.DELETE)
                .requestBuilder(DeleteConditionRequest::builder)
                .basePath("")
                .appendPathParam("admin")
                .appendPathParam("v1")
                .appendPathParam("Conditions")
                .appendPathParam(request.getConditionId())
                .appendQueryParam("forceDelete", request.getForceDelete())
                .accept("application/json, application/scim+json")
                .appendHeader("authorization", request.getAuthorization())
                .appendHeader(
                        "resource_type_schema_version", request.getResourceTypeSchemaVersion())
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .handleResponseHeaderString(
                        "opc-request-id", DeleteConditionResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public DeleteCustomerSecretKeyResponse deleteCustomerSecretKey(
            DeleteCustomerSecretKeyRequest request) {

        Validate.notBlank(
                request.getCustomerSecretKeyId(), "customerSecretKeyId must not be blank");

        return clientCall(request, DeleteCustomerSecretKeyResponse::builder)
                .logger(LOG, "deleteCustomerSecretKey")
                .serviceDetails(
                        "IdentityDomains",
                        "DeleteCustomerSecretKey",
                        "https://docs.oracle.com/iaas/api/#/en/identity-domains/v1/CustomerSecretKey/DeleteCustomerSecretKey")
                .method(com.oracle.bmc.http.client.Method.DELETE)
                .requestBuilder(DeleteCustomerSecretKeyRequest::builder)
                .basePath("")
                .appendPathParam("admin")
                .appendPathParam("v1")
                .appendPathParam("CustomerSecretKeys")
                .appendPathParam(request.getCustomerSecretKeyId())
                .appendQueryParam("forceDelete", request.getForceDelete())
                .accept("application/json, application/scim+json")
                .appendHeader("authorization", request.getAuthorization())
                .appendHeader(
                        "resource_type_schema_version", request.getResourceTypeSchemaVersion())
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .handleResponseHeaderString(
                        "opc-request-id", DeleteCustomerSecretKeyResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public DeleteDynamicResourceGroupResponse deleteDynamicResourceGroup(
            DeleteDynamicResourceGroupRequest request) {

        Validate.notBlank(
                request.getDynamicResourceGroupId(), "dynamicResourceGroupId must not be blank");

        return clientCall(request, DeleteDynamicResourceGroupResponse::builder)
                .logger(LOG, "deleteDynamicResourceGroup")
                .serviceDetails(
                        "IdentityDomains",
                        "DeleteDynamicResourceGroup",
                        "https://docs.oracle.com/iaas/api/#/en/identity-domains/v1/DynamicResourceGroup/DeleteDynamicResourceGroup")
                .method(com.oracle.bmc.http.client.Method.DELETE)
                .requestBuilder(DeleteDynamicResourceGroupRequest::builder)
                .basePath("")
                .appendPathParam("admin")
                .appendPathParam("v1")
                .appendPathParam("DynamicResourceGroups")
                .appendPathParam(request.getDynamicResourceGroupId())
                .appendQueryParam("forceDelete", request.getForceDelete())
                .accept("application/json, application/scim+json")
                .appendHeader("authorization", request.getAuthorization())
                .appendHeader(
                        "resource_type_schema_version", request.getResourceTypeSchemaVersion())
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .handleResponseHeaderString(
                        "opc-request-id", DeleteDynamicResourceGroupResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public DeleteGrantResponse deleteGrant(DeleteGrantRequest request) {

        Validate.notBlank(request.getGrantId(), "grantId must not be blank");

        return clientCall(request, DeleteGrantResponse::builder)
                .logger(LOG, "deleteGrant")
                .serviceDetails(
                        "IdentityDomains",
                        "DeleteGrant",
                        "https://docs.oracle.com/iaas/api/#/en/identity-domains/v1/Grant/DeleteGrant")
                .method(com.oracle.bmc.http.client.Method.DELETE)
                .requestBuilder(DeleteGrantRequest::builder)
                .basePath("")
                .appendPathParam("admin")
                .appendPathParam("v1")
                .appendPathParam("Grants")
                .appendPathParam(request.getGrantId())
                .appendQueryParam("forceDelete", request.getForceDelete())
                .accept("application/json, application/scim+json")
                .appendHeader("authorization", request.getAuthorization())
                .appendHeader(
                        "resource_type_schema_version", request.getResourceTypeSchemaVersion())
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .handleResponseHeaderString(
                        "opc-request-id", DeleteGrantResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public DeleteGroupResponse deleteGroup(DeleteGroupRequest request) {

        Validate.notBlank(request.getGroupId(), "groupId must not be blank");

        return clientCall(request, DeleteGroupResponse::builder)
                .logger(LOG, "deleteGroup")
                .serviceDetails(
                        "IdentityDomains",
                        "DeleteGroup",
                        "https://docs.oracle.com/iaas/api/#/en/identity-domains/v1/Group/DeleteGroup")
                .method(com.oracle.bmc.http.client.Method.DELETE)
                .requestBuilder(DeleteGroupRequest::builder)
                .basePath("")
                .appendPathParam("admin")
                .appendPathParam("v1")
                .appendPathParam("Groups")
                .appendPathParam(request.getGroupId())
                .appendQueryParam("forceDelete", request.getForceDelete())
                .accept("application/json, application/scim+json")
                .appendHeader("authorization", request.getAuthorization())
                .appendHeader(
                        "resource_type_schema_version", request.getResourceTypeSchemaVersion())
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .handleResponseHeaderString(
                        "opc-request-id", DeleteGroupResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public DeleteIdentityPropagationTrustResponse deleteIdentityPropagationTrust(
            DeleteIdentityPropagationTrustRequest request) {

        Validate.notBlank(
                request.getIdentityPropagationTrustId(),
                "identityPropagationTrustId must not be blank");

        return clientCall(request, DeleteIdentityPropagationTrustResponse::builder)
                .logger(LOG, "deleteIdentityPropagationTrust")
                .serviceDetails(
                        "IdentityDomains",
                        "DeleteIdentityPropagationTrust",
                        "https://docs.oracle.com/iaas/api/#/en/identity-domains/v1/IdentityPropagationTrust/DeleteIdentityPropagationTrust")
                .method(com.oracle.bmc.http.client.Method.DELETE)
                .requestBuilder(DeleteIdentityPropagationTrustRequest::builder)
                .basePath("")
                .appendPathParam("admin")
                .appendPathParam("v1")
                .appendPathParam("IdentityPropagationTrusts")
                .appendPathParam(request.getIdentityPropagationTrustId())
                .appendQueryParam("forceDelete", request.getForceDelete())
                .accept("application/json, application/scim+json")
                .appendHeader("authorization", request.getAuthorization())
                .appendHeader(
                        "resource_type_schema_version", request.getResourceTypeSchemaVersion())
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .handleResponseHeaderString(
                        "opc-request-id",
                        DeleteIdentityPropagationTrustResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public DeleteIdentityProviderResponse deleteIdentityProvider(
            DeleteIdentityProviderRequest request) {

        Validate.notBlank(request.getIdentityProviderId(), "identityProviderId must not be blank");

        return clientCall(request, DeleteIdentityProviderResponse::builder)
                .logger(LOG, "deleteIdentityProvider")
                .serviceDetails(
                        "IdentityDomains",
                        "DeleteIdentityProvider",
                        "https://docs.oracle.com/iaas/api/#/en/identity-domains/v1/IdentityProvider/DeleteIdentityProvider")
                .method(com.oracle.bmc.http.client.Method.DELETE)
                .requestBuilder(DeleteIdentityProviderRequest::builder)
                .basePath("")
                .appendPathParam("admin")
                .appendPathParam("v1")
                .appendPathParam("IdentityProviders")
                .appendPathParam(request.getIdentityProviderId())
                .appendQueryParam("forceDelete", request.getForceDelete())
                .accept("application/json, application/scim+json")
                .appendHeader("authorization", request.getAuthorization())
                .appendHeader(
                        "resource_type_schema_version", request.getResourceTypeSchemaVersion())
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .handleResponseHeaderString(
                        "opc-request-id", DeleteIdentityProviderResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public DeleteMyApiKeyResponse deleteMyApiKey(DeleteMyApiKeyRequest request) {

        Validate.notBlank(request.getMyApiKeyId(), "myApiKeyId must not be blank");

        return clientCall(request, DeleteMyApiKeyResponse::builder)
                .logger(LOG, "deleteMyApiKey")
                .serviceDetails(
                        "IdentityDomains",
                        "DeleteMyApiKey",
                        "https://docs.oracle.com/iaas/api/#/en/identity-domains/v1/MyApiKey/DeleteMyApiKey")
                .method(com.oracle.bmc.http.client.Method.DELETE)
                .requestBuilder(DeleteMyApiKeyRequest::builder)
                .basePath("")
                .appendPathParam("admin")
                .appendPathParam("v1")
                .appendPathParam("MyApiKeys")
                .appendPathParam(request.getMyApiKeyId())
                .appendQueryParam("forceDelete", request.getForceDelete())
                .accept("application/json, application/scim+json")
                .appendHeader("authorization", request.getAuthorization())
                .appendHeader(
                        "resource_type_schema_version", request.getResourceTypeSchemaVersion())
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .handleResponseHeaderString(
                        "opc-request-id", DeleteMyApiKeyResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public DeleteMyAuthTokenResponse deleteMyAuthToken(DeleteMyAuthTokenRequest request) {

        Validate.notBlank(request.getMyAuthTokenId(), "myAuthTokenId must not be blank");

        return clientCall(request, DeleteMyAuthTokenResponse::builder)
                .logger(LOG, "deleteMyAuthToken")
                .serviceDetails(
                        "IdentityDomains",
                        "DeleteMyAuthToken",
                        "https://docs.oracle.com/iaas/api/#/en/identity-domains/v1/MyAuthToken/DeleteMyAuthToken")
                .method(com.oracle.bmc.http.client.Method.DELETE)
                .requestBuilder(DeleteMyAuthTokenRequest::builder)
                .basePath("")
                .appendPathParam("admin")
                .appendPathParam("v1")
                .appendPathParam("MyAuthTokens")
                .appendPathParam(request.getMyAuthTokenId())
                .appendQueryParam("forceDelete", request.getForceDelete())
                .accept("application/json, application/scim+json")
                .appendHeader("authorization", request.getAuthorization())
                .appendHeader(
                        "resource_type_schema_version", request.getResourceTypeSchemaVersion())
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .handleResponseHeaderString(
                        "opc-request-id", DeleteMyAuthTokenResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public DeleteMyCustomerSecretKeyResponse deleteMyCustomerSecretKey(
            DeleteMyCustomerSecretKeyRequest request) {

        Validate.notBlank(
                request.getMyCustomerSecretKeyId(), "myCustomerSecretKeyId must not be blank");

        return clientCall(request, DeleteMyCustomerSecretKeyResponse::builder)
                .logger(LOG, "deleteMyCustomerSecretKey")
                .serviceDetails(
                        "IdentityDomains",
                        "DeleteMyCustomerSecretKey",
                        "https://docs.oracle.com/iaas/api/#/en/identity-domains/v1/MyCustomerSecretKey/DeleteMyCustomerSecretKey")
                .method(com.oracle.bmc.http.client.Method.DELETE)
                .requestBuilder(DeleteMyCustomerSecretKeyRequest::builder)
                .basePath("")
                .appendPathParam("admin")
                .appendPathParam("v1")
                .appendPathParam("MyCustomerSecretKeys")
                .appendPathParam(request.getMyCustomerSecretKeyId())
                .appendQueryParam("forceDelete", request.getForceDelete())
                .accept("application/json, application/scim+json")
                .appendHeader("authorization", request.getAuthorization())
                .appendHeader(
                        "resource_type_schema_version", request.getResourceTypeSchemaVersion())
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .handleResponseHeaderString(
                        "opc-request-id", DeleteMyCustomerSecretKeyResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public DeleteMyDeviceResponse deleteMyDevice(DeleteMyDeviceRequest request) {

        Validate.notBlank(request.getMyDeviceId(), "myDeviceId must not be blank");

        return clientCall(request, DeleteMyDeviceResponse::builder)
                .logger(LOG, "deleteMyDevice")
                .serviceDetails(
                        "IdentityDomains",
                        "DeleteMyDevice",
                        "https://docs.oracle.com/iaas/api/#/en/identity-domains/v1/MyDevice/DeleteMyDevice")
                .method(com.oracle.bmc.http.client.Method.DELETE)
                .requestBuilder(DeleteMyDeviceRequest::builder)
                .basePath("")
                .appendPathParam("admin")
                .appendPathParam("v1")
                .appendPathParam("MyDevices")
                .appendPathParam(request.getMyDeviceId())
                .appendQueryParam("forceDelete", request.getForceDelete())
                .accept("application/json, application/scim+json")
                .appendHeader("authorization", request.getAuthorization())
                .appendHeader(
                        "resource_type_schema_version", request.getResourceTypeSchemaVersion())
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .handleResponseHeaderString(
                        "opc-request-id", DeleteMyDeviceResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public DeleteMyOAuth2ClientCredentialResponse deleteMyOAuth2ClientCredential(
            DeleteMyOAuth2ClientCredentialRequest request) {

        Validate.notBlank(
                request.getMyOAuth2ClientCredentialId(),
                "myOAuth2ClientCredentialId must not be blank");

        return clientCall(request, DeleteMyOAuth2ClientCredentialResponse::builder)
                .logger(LOG, "deleteMyOAuth2ClientCredential")
                .serviceDetails(
                        "IdentityDomains",
                        "DeleteMyOAuth2ClientCredential",
                        "https://docs.oracle.com/iaas/api/#/en/identity-domains/v1/MyOAuth2ClientCredential/DeleteMyOAuth2ClientCredential")
                .method(com.oracle.bmc.http.client.Method.DELETE)
                .requestBuilder(DeleteMyOAuth2ClientCredentialRequest::builder)
                .basePath("")
                .appendPathParam("admin")
                .appendPathParam("v1")
                .appendPathParam("MyOAuth2ClientCredentials")
                .appendPathParam(request.getMyOAuth2ClientCredentialId())
                .appendQueryParam("forceDelete", request.getForceDelete())
                .accept("application/json, application/scim+json")
                .appendHeader("authorization", request.getAuthorization())
                .appendHeader(
                        "resource_type_schema_version", request.getResourceTypeSchemaVersion())
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .handleResponseHeaderString(
                        "opc-request-id",
                        DeleteMyOAuth2ClientCredentialResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public DeleteMySmtpCredentialResponse deleteMySmtpCredential(
            DeleteMySmtpCredentialRequest request) {

        Validate.notBlank(request.getMySmtpCredentialId(), "mySmtpCredentialId must not be blank");

        return clientCall(request, DeleteMySmtpCredentialResponse::builder)
                .logger(LOG, "deleteMySmtpCredential")
                .serviceDetails(
                        "IdentityDomains",
                        "DeleteMySmtpCredential",
                        "https://docs.oracle.com/iaas/api/#/en/identity-domains/v1/MySmtpCredential/DeleteMySmtpCredential")
                .method(com.oracle.bmc.http.client.Method.DELETE)
                .requestBuilder(DeleteMySmtpCredentialRequest::builder)
                .basePath("")
                .appendPathParam("admin")
                .appendPathParam("v1")
                .appendPathParam("MySmtpCredentials")
                .appendPathParam(request.getMySmtpCredentialId())
                .appendQueryParam("forceDelete", request.getForceDelete())
                .accept("application/json, application/scim+json")
                .appendHeader("authorization", request.getAuthorization())
                .appendHeader(
                        "resource_type_schema_version", request.getResourceTypeSchemaVersion())
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .handleResponseHeaderString(
                        "opc-request-id", DeleteMySmtpCredentialResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public DeleteMySupportAccountResponse deleteMySupportAccount(
            DeleteMySupportAccountRequest request) {

        Validate.notBlank(request.getMySupportAccountId(), "mySupportAccountId must not be blank");

        return clientCall(request, DeleteMySupportAccountResponse::builder)
                .logger(LOG, "deleteMySupportAccount")
                .serviceDetails(
                        "IdentityDomains",
                        "DeleteMySupportAccount",
                        "https://docs.oracle.com/iaas/api/#/en/identity-domains/v1/MySupportAccount/DeleteMySupportAccount")
                .method(com.oracle.bmc.http.client.Method.DELETE)
                .requestBuilder(DeleteMySupportAccountRequest::builder)
                .basePath("")
                .appendPathParam("admin")
                .appendPathParam("v1")
                .appendPathParam("MySupportAccounts")
                .appendPathParam(request.getMySupportAccountId())
                .appendQueryParam("forceDelete", request.getForceDelete())
                .accept("application/json, application/scim+json")
                .appendHeader("authorization", request.getAuthorization())
                .appendHeader(
                        "resource_type_schema_version", request.getResourceTypeSchemaVersion())
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .handleResponseHeaderString(
                        "opc-request-id", DeleteMySupportAccountResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public DeleteMyTrustedUserAgentResponse deleteMyTrustedUserAgent(
            DeleteMyTrustedUserAgentRequest request) {

        Validate.notBlank(
                request.getMyTrustedUserAgentId(), "myTrustedUserAgentId must not be blank");

        return clientCall(request, DeleteMyTrustedUserAgentResponse::builder)
                .logger(LOG, "deleteMyTrustedUserAgent")
                .serviceDetails(
                        "IdentityDomains",
                        "DeleteMyTrustedUserAgent",
                        "https://docs.oracle.com/iaas/api/#/en/identity-domains/v1/MyTrustedUserAgent/DeleteMyTrustedUserAgent")
                .method(com.oracle.bmc.http.client.Method.DELETE)
                .requestBuilder(DeleteMyTrustedUserAgentRequest::builder)
                .basePath("")
                .appendPathParam("admin")
                .appendPathParam("v1")
                .appendPathParam("MyTrustedUserAgents")
                .appendPathParam(request.getMyTrustedUserAgentId())
                .appendQueryParam("forceDelete", request.getForceDelete())
                .accept("application/json, application/scim+json")
                .appendHeader("authorization", request.getAuthorization())
                .appendHeader(
                        "resource_type_schema_version", request.getResourceTypeSchemaVersion())
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .handleResponseHeaderString(
                        "opc-request-id", DeleteMyTrustedUserAgentResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public DeleteMyUserDbCredentialResponse deleteMyUserDbCredential(
            DeleteMyUserDbCredentialRequest request) {

        Validate.notBlank(
                request.getMyUserDbCredentialId(), "myUserDbCredentialId must not be blank");

        return clientCall(request, DeleteMyUserDbCredentialResponse::builder)
                .logger(LOG, "deleteMyUserDbCredential")
                .serviceDetails(
                        "IdentityDomains",
                        "DeleteMyUserDbCredential",
                        "https://docs.oracle.com/iaas/api/#/en/identity-domains/v1/MyUserDbCredential/DeleteMyUserDbCredential")
                .method(com.oracle.bmc.http.client.Method.DELETE)
                .requestBuilder(DeleteMyUserDbCredentialRequest::builder)
                .basePath("")
                .appendPathParam("admin")
                .appendPathParam("v1")
                .appendPathParam("MyUserDbCredentials")
                .appendPathParam(request.getMyUserDbCredentialId())
                .appendQueryParam("forceDelete", request.getForceDelete())
                .accept("application/json, application/scim+json")
                .appendHeader("authorization", request.getAuthorization())
                .appendHeader(
                        "resource_type_schema_version", request.getResourceTypeSchemaVersion())
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .handleResponseHeaderString(
                        "opc-request-id", DeleteMyUserDbCredentialResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public DeleteNetworkPerimeterResponse deleteNetworkPerimeter(
            DeleteNetworkPerimeterRequest request) {

        Validate.notBlank(request.getNetworkPerimeterId(), "networkPerimeterId must not be blank");

        return clientCall(request, DeleteNetworkPerimeterResponse::builder)
                .logger(LOG, "deleteNetworkPerimeter")
                .serviceDetails(
                        "IdentityDomains",
                        "DeleteNetworkPerimeter",
                        "https://docs.oracle.com/iaas/api/#/en/identity-domains/v1/NetworkPerimeter/DeleteNetworkPerimeter")
                .method(com.oracle.bmc.http.client.Method.DELETE)
                .requestBuilder(DeleteNetworkPerimeterRequest::builder)
                .basePath("")
                .appendPathParam("admin")
                .appendPathParam("v1")
                .appendPathParam("NetworkPerimeters")
                .appendPathParam(request.getNetworkPerimeterId())
                .appendQueryParam("forceDelete", request.getForceDelete())
                .accept("application/json, application/scim+json")
                .appendHeader("authorization", request.getAuthorization())
                .appendHeader(
                        "resource_type_schema_version", request.getResourceTypeSchemaVersion())
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .handleResponseHeaderString(
                        "opc-request-id", DeleteNetworkPerimeterResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public DeleteOAuth2ClientCredentialResponse deleteOAuth2ClientCredential(
            DeleteOAuth2ClientCredentialRequest request) {

        Validate.notBlank(
                request.getOAuth2ClientCredentialId(),
                "oAuth2ClientCredentialId must not be blank");

        return clientCall(request, DeleteOAuth2ClientCredentialResponse::builder)
                .logger(LOG, "deleteOAuth2ClientCredential")
                .serviceDetails(
                        "IdentityDomains",
                        "DeleteOAuth2ClientCredential",
                        "https://docs.oracle.com/iaas/api/#/en/identity-domains/v1/OAuth2ClientCredential/DeleteOAuth2ClientCredential")
                .method(com.oracle.bmc.http.client.Method.DELETE)
                .requestBuilder(DeleteOAuth2ClientCredentialRequest::builder)
                .basePath("")
                .appendPathParam("admin")
                .appendPathParam("v1")
                .appendPathParam("OAuth2ClientCredentials")
                .appendPathParam(request.getOAuth2ClientCredentialId())
                .appendQueryParam("forceDelete", request.getForceDelete())
                .accept("application/json, application/scim+json")
                .appendHeader("authorization", request.getAuthorization())
                .appendHeader(
                        "resource_type_schema_version", request.getResourceTypeSchemaVersion())
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .handleResponseHeaderString(
                        "opc-request-id",
                        DeleteOAuth2ClientCredentialResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public DeleteOAuthClientCertificateResponse deleteOAuthClientCertificate(
            DeleteOAuthClientCertificateRequest request) {

        Validate.notBlank(
                request.getOAuthClientCertificateId(),
                "oAuthClientCertificateId must not be blank");

        return clientCall(request, DeleteOAuthClientCertificateResponse::builder)
                .logger(LOG, "deleteOAuthClientCertificate")
                .serviceDetails(
                        "IdentityDomains",
                        "DeleteOAuthClientCertificate",
                        "https://docs.oracle.com/iaas/api/#/en/identity-domains/v1/OAuthClientCertificate/DeleteOAuthClientCertificate")
                .method(com.oracle.bmc.http.client.Method.DELETE)
                .requestBuilder(DeleteOAuthClientCertificateRequest::builder)
                .basePath("")
                .appendPathParam("admin")
                .appendPathParam("v1")
                .appendPathParam("OAuthClientCertificates")
                .appendPathParam(request.getOAuthClientCertificateId())
                .appendQueryParam("forceDelete", request.getForceDelete())
                .accept("application/json, application/scim+json")
                .appendHeader("authorization", request.getAuthorization())
                .appendHeader(
                        "resource_type_schema_version", request.getResourceTypeSchemaVersion())
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .handleResponseHeaderString(
                        "opc-request-id",
                        DeleteOAuthClientCertificateResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public DeleteOAuthPartnerCertificateResponse deleteOAuthPartnerCertificate(
            DeleteOAuthPartnerCertificateRequest request) {

        Validate.notBlank(
                request.getOAuthPartnerCertificateId(),
                "oAuthPartnerCertificateId must not be blank");

        return clientCall(request, DeleteOAuthPartnerCertificateResponse::builder)
                .logger(LOG, "deleteOAuthPartnerCertificate")
                .serviceDetails(
                        "IdentityDomains",
                        "DeleteOAuthPartnerCertificate",
                        "https://docs.oracle.com/iaas/api/#/en/identity-domains/v1/OAuthPartnerCertificate/DeleteOAuthPartnerCertificate")
                .method(com.oracle.bmc.http.client.Method.DELETE)
                .requestBuilder(DeleteOAuthPartnerCertificateRequest::builder)
                .basePath("")
                .appendPathParam("admin")
                .appendPathParam("v1")
                .appendPathParam("OAuthPartnerCertificates")
                .appendPathParam(request.getOAuthPartnerCertificateId())
                .appendQueryParam("forceDelete", request.getForceDelete())
                .accept("application/json, application/scim+json")
                .appendHeader("authorization", request.getAuthorization())
                .appendHeader(
                        "resource_type_schema_version", request.getResourceTypeSchemaVersion())
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .handleResponseHeaderString(
                        "opc-request-id",
                        DeleteOAuthPartnerCertificateResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public DeletePasswordPolicyResponse deletePasswordPolicy(DeletePasswordPolicyRequest request) {

        Validate.notBlank(request.getPasswordPolicyId(), "passwordPolicyId must not be blank");

        return clientCall(request, DeletePasswordPolicyResponse::builder)
                .logger(LOG, "deletePasswordPolicy")
                .serviceDetails(
                        "IdentityDomains",
                        "DeletePasswordPolicy",
                        "https://docs.oracle.com/iaas/api/#/en/identity-domains/v1/PasswordPolicy/DeletePasswordPolicy")
                .method(com.oracle.bmc.http.client.Method.DELETE)
                .requestBuilder(DeletePasswordPolicyRequest::builder)
                .basePath("")
                .appendPathParam("admin")
                .appendPathParam("v1")
                .appendPathParam("PasswordPolicies")
                .appendPathParam(request.getPasswordPolicyId())
                .appendQueryParam("forceDelete", request.getForceDelete())
                .accept("application/json, application/scim+json")
                .appendHeader("authorization", request.getAuthorization())
                .appendHeader(
                        "resource_type_schema_version", request.getResourceTypeSchemaVersion())
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .handleResponseHeaderString(
                        "opc-request-id", DeletePasswordPolicyResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public DeletePolicyResponse deletePolicy(DeletePolicyRequest request) {

        Validate.notBlank(request.getPolicyId(), "policyId must not be blank");

        return clientCall(request, DeletePolicyResponse::builder)
                .logger(LOG, "deletePolicy")
                .serviceDetails(
                        "IdentityDomains",
                        "DeletePolicy",
                        "https://docs.oracle.com/iaas/api/#/en/identity-domains/v1/Policy/DeletePolicy")
                .method(com.oracle.bmc.http.client.Method.DELETE)
                .requestBuilder(DeletePolicyRequest::builder)
                .basePath("")
                .appendPathParam("admin")
                .appendPathParam("v1")
                .appendPathParam("Policies")
                .appendPathParam(request.getPolicyId())
                .appendQueryParam("forceDelete", request.getForceDelete())
                .accept("application/json, application/scim+json")
                .appendHeader("authorization", request.getAuthorization())
                .appendHeader(
                        "resource_type_schema_version", request.getResourceTypeSchemaVersion())
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .handleResponseHeaderString(
                        "opc-request-id", DeletePolicyResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public DeleteRuleResponse deleteRule(DeleteRuleRequest request) {

        Validate.notBlank(request.getRuleId(), "ruleId must not be blank");

        return clientCall(request, DeleteRuleResponse::builder)
                .logger(LOG, "deleteRule")
                .serviceDetails(
                        "IdentityDomains",
                        "DeleteRule",
                        "https://docs.oracle.com/iaas/api/#/en/identity-domains/v1/Rule/DeleteRule")
                .method(com.oracle.bmc.http.client.Method.DELETE)
                .requestBuilder(DeleteRuleRequest::builder)
                .basePath("")
                .appendPathParam("admin")
                .appendPathParam("v1")
                .appendPathParam("Rules")
                .appendPathParam(request.getRuleId())
                .appendQueryParam("forceDelete", request.getForceDelete())
                .accept("application/json, application/scim+json")
                .appendHeader("authorization", request.getAuthorization())
                .appendHeader(
                        "resource_type_schema_version", request.getResourceTypeSchemaVersion())
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .handleResponseHeaderString(
                        "opc-request-id", DeleteRuleResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public DeleteSecurityQuestionResponse deleteSecurityQuestion(
            DeleteSecurityQuestionRequest request) {

        Validate.notBlank(request.getSecurityQuestionId(), "securityQuestionId must not be blank");

        return clientCall(request, DeleteSecurityQuestionResponse::builder)
                .logger(LOG, "deleteSecurityQuestion")
                .serviceDetails(
                        "IdentityDomains",
                        "DeleteSecurityQuestion",
                        "https://docs.oracle.com/iaas/api/#/en/identity-domains/v1/SecurityQuestion/DeleteSecurityQuestion")
                .method(com.oracle.bmc.http.client.Method.DELETE)
                .requestBuilder(DeleteSecurityQuestionRequest::builder)
                .basePath("")
                .appendPathParam("admin")
                .appendPathParam("v1")
                .appendPathParam("SecurityQuestions")
                .appendPathParam(request.getSecurityQuestionId())
                .appendQueryParam("forceDelete", request.getForceDelete())
                .accept("application/json, application/scim+json")
                .appendHeader("authorization", request.getAuthorization())
                .appendHeader(
                        "resource_type_schema_version", request.getResourceTypeSchemaVersion())
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .handleResponseHeaderString(
                        "opc-request-id", DeleteSecurityQuestionResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public DeleteSelfRegistrationProfileResponse deleteSelfRegistrationProfile(
            DeleteSelfRegistrationProfileRequest request) {

        Validate.notBlank(
                request.getSelfRegistrationProfileId(),
                "selfRegistrationProfileId must not be blank");

        return clientCall(request, DeleteSelfRegistrationProfileResponse::builder)
                .logger(LOG, "deleteSelfRegistrationProfile")
                .serviceDetails(
                        "IdentityDomains",
                        "DeleteSelfRegistrationProfile",
                        "https://docs.oracle.com/iaas/api/#/en/identity-domains/v1/SelfRegistrationProfile/DeleteSelfRegistrationProfile")
                .method(com.oracle.bmc.http.client.Method.DELETE)
                .requestBuilder(DeleteSelfRegistrationProfileRequest::builder)
                .basePath("")
                .appendPathParam("admin")
                .appendPathParam("v1")
                .appendPathParam("SelfRegistrationProfiles")
                .appendPathParam(request.getSelfRegistrationProfileId())
                .appendQueryParam("forceDelete", request.getForceDelete())
                .accept("application/json, application/scim+json")
                .appendHeader("authorization", request.getAuthorization())
                .appendHeader(
                        "resource_type_schema_version", request.getResourceTypeSchemaVersion())
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .handleResponseHeaderString(
                        "opc-request-id",
                        DeleteSelfRegistrationProfileResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public DeleteSmtpCredentialResponse deleteSmtpCredential(DeleteSmtpCredentialRequest request) {

        Validate.notBlank(request.getSmtpCredentialId(), "smtpCredentialId must not be blank");

        return clientCall(request, DeleteSmtpCredentialResponse::builder)
                .logger(LOG, "deleteSmtpCredential")
                .serviceDetails(
                        "IdentityDomains",
                        "DeleteSmtpCredential",
                        "https://docs.oracle.com/iaas/api/#/en/identity-domains/v1/SmtpCredential/DeleteSmtpCredential")
                .method(com.oracle.bmc.http.client.Method.DELETE)
                .requestBuilder(DeleteSmtpCredentialRequest::builder)
                .basePath("")
                .appendPathParam("admin")
                .appendPathParam("v1")
                .appendPathParam("SmtpCredentials")
                .appendPathParam(request.getSmtpCredentialId())
                .appendQueryParam("forceDelete", request.getForceDelete())
                .accept("application/json, application/scim+json")
                .appendHeader("authorization", request.getAuthorization())
                .appendHeader(
                        "resource_type_schema_version", request.getResourceTypeSchemaVersion())
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .handleResponseHeaderString(
                        "opc-request-id", DeleteSmtpCredentialResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public DeleteSocialIdentityProviderResponse deleteSocialIdentityProvider(
            DeleteSocialIdentityProviderRequest request) {

        Validate.notBlank(
                request.getSocialIdentityProviderId(),
                "socialIdentityProviderId must not be blank");

        return clientCall(request, DeleteSocialIdentityProviderResponse::builder)
                .logger(LOG, "deleteSocialIdentityProvider")
                .serviceDetails(
                        "IdentityDomains",
                        "DeleteSocialIdentityProvider",
                        "https://docs.oracle.com/iaas/api/#/en/identity-domains/v1/SocialIdentityProvider/DeleteSocialIdentityProvider")
                .method(com.oracle.bmc.http.client.Method.DELETE)
                .requestBuilder(DeleteSocialIdentityProviderRequest::builder)
                .basePath("")
                .appendPathParam("admin")
                .appendPathParam("v1")
                .appendPathParam("SocialIdentityProviders")
                .appendPathParam(request.getSocialIdentityProviderId())
                .appendQueryParam("forceDelete", request.getForceDelete())
                .accept("application/json, application/scim+json")
                .appendHeader("authorization", request.getAuthorization())
                .appendHeader(
                        "resource_type_schema_version", request.getResourceTypeSchemaVersion())
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .handleResponseHeaderString(
                        "opc-request-id",
                        DeleteSocialIdentityProviderResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public DeleteUserResponse deleteUser(DeleteUserRequest request) {

        Validate.notBlank(request.getUserId(), "userId must not be blank");

        return clientCall(request, DeleteUserResponse::builder)
                .logger(LOG, "deleteUser")
                .serviceDetails(
                        "IdentityDomains",
                        "DeleteUser",
                        "https://docs.oracle.com/iaas/api/#/en/identity-domains/v1/User/DeleteUser")
                .method(com.oracle.bmc.http.client.Method.DELETE)
                .requestBuilder(DeleteUserRequest::builder)
                .basePath("")
                .appendPathParam("admin")
                .appendPathParam("v1")
                .appendPathParam("Users")
                .appendPathParam(request.getUserId())
                .appendQueryParam("forceDelete", request.getForceDelete())
                .accept("application/json, application/scim+json")
                .appendHeader("authorization", request.getAuthorization())
                .appendHeader(
                        "resource_type_schema_version", request.getResourceTypeSchemaVersion())
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .handleResponseHeaderString(
                        "opc-request-id", DeleteUserResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public DeleteUserDbCredentialResponse deleteUserDbCredential(
            DeleteUserDbCredentialRequest request) {

        Validate.notBlank(request.getUserDbCredentialId(), "userDbCredentialId must not be blank");

        return clientCall(request, DeleteUserDbCredentialResponse::builder)
                .logger(LOG, "deleteUserDbCredential")
                .serviceDetails(
                        "IdentityDomains",
                        "DeleteUserDbCredential",
                        "https://docs.oracle.com/iaas/api/#/en/identity-domains/v1/UserDbCredential/DeleteUserDbCredential")
                .method(com.oracle.bmc.http.client.Method.DELETE)
                .requestBuilder(DeleteUserDbCredentialRequest::builder)
                .basePath("")
                .appendPathParam("admin")
                .appendPathParam("v1")
                .appendPathParam("UserDbCredentials")
                .appendPathParam(request.getUserDbCredentialId())
                .appendQueryParam("forceDelete", request.getForceDelete())
                .accept("application/json, application/scim+json")
                .appendHeader("authorization", request.getAuthorization())
                .appendHeader(
                        "resource_type_schema_version", request.getResourceTypeSchemaVersion())
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .handleResponseHeaderString(
                        "opc-request-id", DeleteUserDbCredentialResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public GetAccountMgmtInfoResponse getAccountMgmtInfo(GetAccountMgmtInfoRequest request) {

        Validate.notBlank(request.getAccountMgmtInfoId(), "accountMgmtInfoId must not be blank");

        return clientCall(request, GetAccountMgmtInfoResponse::builder)
                .logger(LOG, "getAccountMgmtInfo")
                .serviceDetails(
                        "IdentityDomains",
                        "GetAccountMgmtInfo",
                        "https://docs.oracle.com/iaas/api/#/en/identity-domains/v1/AccountMgmtInfo/GetAccountMgmtInfo")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetAccountMgmtInfoRequest::builder)
                .basePath("")
                .appendPathParam("admin")
                .appendPathParam("v1")
                .appendPathParam("AccountMgmtInfos")
                .appendPathParam(request.getAccountMgmtInfoId())
                .appendQueryParam("attributes", request.getAttributes())
                .appendListQueryParam(
                        "attributeSets",
                        request.getAttributeSets(),
                        com.oracle.bmc.util.internal.CollectionFormatType.Multi)
                .accept("application/json, application/scim+json")
                .appendHeader("authorization", request.getAuthorization())
                .appendHeader(
                        "resource_type_schema_version", request.getResourceTypeSchemaVersion())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .handleBody(
                        com.oracle.bmc.identitydomains.model.AccountMgmtInfo.class,
                        GetAccountMgmtInfoResponse.Builder::accountMgmtInfo)
                .handleResponseHeaderString(
                        "opc-request-id", GetAccountMgmtInfoResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public GetAccountRecoverySettingResponse getAccountRecoverySetting(
            GetAccountRecoverySettingRequest request) {

        Validate.notBlank(
                request.getAccountRecoverySettingId(),
                "accountRecoverySettingId must not be blank");

        return clientCall(request, GetAccountRecoverySettingResponse::builder)
                .logger(LOG, "getAccountRecoverySetting")
                .serviceDetails(
                        "IdentityDomains",
                        "GetAccountRecoverySetting",
                        "https://docs.oracle.com/iaas/api/#/en/identity-domains/v1/AccountRecoverySetting/GetAccountRecoverySetting")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetAccountRecoverySettingRequest::builder)
                .basePath("")
                .appendPathParam("admin")
                .appendPathParam("v1")
                .appendPathParam("AccountRecoverySettings")
                .appendPathParam(request.getAccountRecoverySettingId())
                .appendQueryParam("attributes", request.getAttributes())
                .appendListQueryParam(
                        "attributeSets",
                        request.getAttributeSets(),
                        com.oracle.bmc.util.internal.CollectionFormatType.Multi)
                .accept("application/json, application/scim+json")
                .appendHeader("authorization", request.getAuthorization())
                .appendHeader(
                        "resource_type_schema_version", request.getResourceTypeSchemaVersion())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .handleBody(
                        com.oracle.bmc.identitydomains.model.AccountRecoverySetting.class,
                        GetAccountRecoverySettingResponse.Builder::accountRecoverySetting)
                .handleResponseHeaderString(
                        "opc-request-id", GetAccountRecoverySettingResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public GetApiKeyResponse getApiKey(GetApiKeyRequest request) {

        Validate.notBlank(request.getApiKeyId(), "apiKeyId must not be blank");

        return clientCall(request, GetApiKeyResponse::builder)
                .logger(LOG, "getApiKey")
                .serviceDetails(
                        "IdentityDomains",
                        "GetApiKey",
                        "https://docs.oracle.com/iaas/api/#/en/identity-domains/v1/ApiKey/GetApiKey")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetApiKeyRequest::builder)
                .basePath("")
                .appendPathParam("admin")
                .appendPathParam("v1")
                .appendPathParam("ApiKeys")
                .appendPathParam(request.getApiKeyId())
                .appendQueryParam("attributes", request.getAttributes())
                .appendListQueryParam(
                        "attributeSets",
                        request.getAttributeSets(),
                        com.oracle.bmc.util.internal.CollectionFormatType.Multi)
                .accept("application/json, application/scim+json")
                .appendHeader("authorization", request.getAuthorization())
                .appendHeader(
                        "resource_type_schema_version", request.getResourceTypeSchemaVersion())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .handleBody(
                        com.oracle.bmc.identitydomains.model.ApiKey.class,
                        GetApiKeyResponse.Builder::apiKey)
                .handleResponseHeaderString(
                        "opc-request-id", GetApiKeyResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public GetAppResponse getApp(GetAppRequest request) {

        Validate.notBlank(request.getAppId(), "appId must not be blank");

        return clientCall(request, GetAppResponse::builder)
                .logger(LOG, "getApp")
                .serviceDetails(
                        "IdentityDomains",
                        "GetApp",
                        "https://docs.oracle.com/iaas/api/#/en/identity-domains/v1/App/GetApp")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetAppRequest::builder)
                .basePath("")
                .appendPathParam("admin")
                .appendPathParam("v1")
                .appendPathParam("Apps")
                .appendPathParam(request.getAppId())
                .appendQueryParam("attributes", request.getAttributes())
                .appendListQueryParam(
                        "attributeSets",
                        request.getAttributeSets(),
                        com.oracle.bmc.util.internal.CollectionFormatType.Multi)
                .accept("application/json, application/scim+json")
                .appendHeader("authorization", request.getAuthorization())
                .appendHeader(
                        "resource_type_schema_version", request.getResourceTypeSchemaVersion())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .handleBody(
                        com.oracle.bmc.identitydomains.model.App.class, GetAppResponse.Builder::app)
                .handleResponseHeaderString("opc-request-id", GetAppResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public GetAppRoleResponse getAppRole(GetAppRoleRequest request) {

        Validate.notBlank(request.getAppRoleId(), "appRoleId must not be blank");

        return clientCall(request, GetAppRoleResponse::builder)
                .logger(LOG, "getAppRole")
                .serviceDetails(
                        "IdentityDomains",
                        "GetAppRole",
                        "https://docs.oracle.com/iaas/api/#/en/identity-domains/v1/AppRole/GetAppRole")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetAppRoleRequest::builder)
                .basePath("")
                .appendPathParam("admin")
                .appendPathParam("v1")
                .appendPathParam("AppRoles")
                .appendPathParam(request.getAppRoleId())
                .appendQueryParam("attributes", request.getAttributes())
                .appendListQueryParam(
                        "attributeSets",
                        request.getAttributeSets(),
                        com.oracle.bmc.util.internal.CollectionFormatType.Multi)
                .accept("application/json, application/scim+json")
                .appendHeader("authorization", request.getAuthorization())
                .appendHeader(
                        "resource_type_schema_version", request.getResourceTypeSchemaVersion())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .handleBody(
                        com.oracle.bmc.identitydomains.model.AppRole.class,
                        GetAppRoleResponse.Builder::appRole)
                .handleResponseHeaderString(
                        "opc-request-id", GetAppRoleResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public GetApprovalWorkflowResponse getApprovalWorkflow(GetApprovalWorkflowRequest request) {

        Validate.notBlank(request.getApprovalWorkflowId(), "approvalWorkflowId must not be blank");

        return clientCall(request, GetApprovalWorkflowResponse::builder)
                .logger(LOG, "getApprovalWorkflow")
                .serviceDetails(
                        "IdentityDomains",
                        "GetApprovalWorkflow",
                        "https://docs.oracle.com/iaas/api/#/en/identity-domains/v1/ApprovalWorkflow/GetApprovalWorkflow")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetApprovalWorkflowRequest::builder)
                .basePath("")
                .appendPathParam("admin")
                .appendPathParam("v1")
                .appendPathParam("ApprovalWorkflows")
                .appendPathParam(request.getApprovalWorkflowId())
                .appendQueryParam("attributes", request.getAttributes())
                .appendListQueryParam(
                        "attributeSets",
                        request.getAttributeSets(),
                        com.oracle.bmc.util.internal.CollectionFormatType.Multi)
                .accept("application/json, application/scim+json")
                .appendHeader("authorization", request.getAuthorization())
                .appendHeader(
                        "resource_type_schema_version", request.getResourceTypeSchemaVersion())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .handleBody(
                        com.oracle.bmc.identitydomains.model.ApprovalWorkflow.class,
                        GetApprovalWorkflowResponse.Builder::approvalWorkflow)
                .handleResponseHeaderString(
                        "opc-request-id", GetApprovalWorkflowResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public GetApprovalWorkflowAssignmentResponse getApprovalWorkflowAssignment(
            GetApprovalWorkflowAssignmentRequest request) {

        Validate.notBlank(
                request.getApprovalWorkflowAssignmentId(),
                "approvalWorkflowAssignmentId must not be blank");

        return clientCall(request, GetApprovalWorkflowAssignmentResponse::builder)
                .logger(LOG, "getApprovalWorkflowAssignment")
                .serviceDetails(
                        "IdentityDomains",
                        "GetApprovalWorkflowAssignment",
                        "https://docs.oracle.com/iaas/api/#/en/identity-domains/v1/ApprovalWorkflowAssignment/GetApprovalWorkflowAssignment")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetApprovalWorkflowAssignmentRequest::builder)
                .basePath("")
                .appendPathParam("admin")
                .appendPathParam("v1")
                .appendPathParam("ApprovalWorkflowAssignments")
                .appendPathParam(request.getApprovalWorkflowAssignmentId())
                .appendQueryParam("attributes", request.getAttributes())
                .appendListQueryParam(
                        "attributeSets",
                        request.getAttributeSets(),
                        com.oracle.bmc.util.internal.CollectionFormatType.Multi)
                .accept("application/json, application/scim+json")
                .appendHeader("authorization", request.getAuthorization())
                .appendHeader(
                        "resource_type_schema_version", request.getResourceTypeSchemaVersion())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .handleBody(
                        com.oracle.bmc.identitydomains.model.ApprovalWorkflowAssignment.class,
                        GetApprovalWorkflowAssignmentResponse.Builder::approvalWorkflowAssignment)
                .handleResponseHeaderString(
                        "opc-request-id",
                        GetApprovalWorkflowAssignmentResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public GetApprovalWorkflowStepResponse getApprovalWorkflowStep(
            GetApprovalWorkflowStepRequest request) {

        Validate.notBlank(
                request.getApprovalWorkflowStepId(), "approvalWorkflowStepId must not be blank");

        return clientCall(request, GetApprovalWorkflowStepResponse::builder)
                .logger(LOG, "getApprovalWorkflowStep")
                .serviceDetails(
                        "IdentityDomains",
                        "GetApprovalWorkflowStep",
                        "https://docs.oracle.com/iaas/api/#/en/identity-domains/v1/ApprovalWorkflowStep/GetApprovalWorkflowStep")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetApprovalWorkflowStepRequest::builder)
                .basePath("")
                .appendPathParam("admin")
                .appendPathParam("v1")
                .appendPathParam("ApprovalWorkflowSteps")
                .appendPathParam(request.getApprovalWorkflowStepId())
                .appendQueryParam("attributes", request.getAttributes())
                .appendListQueryParam(
                        "attributeSets",
                        request.getAttributeSets(),
                        com.oracle.bmc.util.internal.CollectionFormatType.Multi)
                .accept("application/json, application/scim+json")
                .appendHeader("authorization", request.getAuthorization())
                .appendHeader(
                        "resource_type_schema_version", request.getResourceTypeSchemaVersion())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .handleBody(
                        com.oracle.bmc.identitydomains.model.ApprovalWorkflowStep.class,
                        GetApprovalWorkflowStepResponse.Builder::approvalWorkflowStep)
                .handleResponseHeaderString(
                        "opc-request-id", GetApprovalWorkflowStepResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public GetAuthTokenResponse getAuthToken(GetAuthTokenRequest request) {

        Validate.notBlank(request.getAuthTokenId(), "authTokenId must not be blank");

        return clientCall(request, GetAuthTokenResponse::builder)
                .logger(LOG, "getAuthToken")
                .serviceDetails(
                        "IdentityDomains",
                        "GetAuthToken",
                        "https://docs.oracle.com/iaas/api/#/en/identity-domains/v1/AuthToken/GetAuthToken")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetAuthTokenRequest::builder)
                .basePath("")
                .appendPathParam("admin")
                .appendPathParam("v1")
                .appendPathParam("AuthTokens")
                .appendPathParam(request.getAuthTokenId())
                .appendQueryParam("attributes", request.getAttributes())
                .appendListQueryParam(
                        "attributeSets",
                        request.getAttributeSets(),
                        com.oracle.bmc.util.internal.CollectionFormatType.Multi)
                .accept("application/json, application/scim+json")
                .appendHeader("authorization", request.getAuthorization())
                .appendHeader(
                        "resource_type_schema_version", request.getResourceTypeSchemaVersion())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .handleBody(
                        com.oracle.bmc.identitydomains.model.AuthToken.class,
                        GetAuthTokenResponse.Builder::authToken)
                .handleResponseHeaderString(
                        "opc-request-id", GetAuthTokenResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public GetAuthenticationFactorSettingResponse getAuthenticationFactorSetting(
            GetAuthenticationFactorSettingRequest request) {

        Validate.notBlank(
                request.getAuthenticationFactorSettingId(),
                "authenticationFactorSettingId must not be blank");

        return clientCall(request, GetAuthenticationFactorSettingResponse::builder)
                .logger(LOG, "getAuthenticationFactorSetting")
                .serviceDetails(
                        "IdentityDomains",
                        "GetAuthenticationFactorSetting",
                        "https://docs.oracle.com/iaas/api/#/en/identity-domains/v1/AuthenticationFactorSetting/GetAuthenticationFactorSetting")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetAuthenticationFactorSettingRequest::builder)
                .basePath("")
                .appendPathParam("admin")
                .appendPathParam("v1")
                .appendPathParam("AuthenticationFactorSettings")
                .appendPathParam(request.getAuthenticationFactorSettingId())
                .appendQueryParam("attributes", request.getAttributes())
                .appendListQueryParam(
                        "attributeSets",
                        request.getAttributeSets(),
                        com.oracle.bmc.util.internal.CollectionFormatType.Multi)
                .accept("application/json, application/scim+json")
                .appendHeader("authorization", request.getAuthorization())
                .appendHeader(
                        "resource_type_schema_version", request.getResourceTypeSchemaVersion())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .handleBody(
                        com.oracle.bmc.identitydomains.model.AuthenticationFactorSetting.class,
                        GetAuthenticationFactorSettingResponse.Builder::authenticationFactorSetting)
                .handleResponseHeaderString(
                        "opc-request-id",
                        GetAuthenticationFactorSettingResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public GetBrandingSettingResponse getBrandingSetting(GetBrandingSettingRequest request) {

        Validate.notBlank(request.getBrandingSettingId(), "brandingSettingId must not be blank");

        return clientCall(request, GetBrandingSettingResponse::builder)
                .logger(LOG, "getBrandingSetting")
                .serviceDetails(
                        "IdentityDomains",
                        "GetBrandingSetting",
                        "https://docs.oracle.com/iaas/api/#/en/identity-domains/v1/BrandingSetting/GetBrandingSetting")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetBrandingSettingRequest::builder)
                .basePath("")
                .appendPathParam("admin")
                .appendPathParam("v1")
                .appendPathParam("BrandingSettings")
                .appendPathParam(request.getBrandingSettingId())
                .appendQueryParam("attributes", request.getAttributes())
                .appendListQueryParam(
                        "attributeSets",
                        request.getAttributeSets(),
                        com.oracle.bmc.util.internal.CollectionFormatType.Multi)
                .accept("application/json, application/scim+json")
                .appendHeader("authorization", request.getAuthorization())
                .appendHeader(
                        "resource_type_schema_version", request.getResourceTypeSchemaVersion())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .handleBody(
                        com.oracle.bmc.identitydomains.model.BrandingSetting.class,
                        GetBrandingSettingResponse.Builder::brandingSetting)
                .handleResponseHeaderString(
                        "opc-request-id", GetBrandingSettingResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public GetCloudGateResponse getCloudGate(GetCloudGateRequest request) {

        Validate.notBlank(request.getCloudGateId(), "cloudGateId must not be blank");

        return clientCall(request, GetCloudGateResponse::builder)
                .logger(LOG, "getCloudGate")
                .serviceDetails(
                        "IdentityDomains",
                        "GetCloudGate",
                        "https://docs.oracle.com/iaas/api/#/en/identity-domains/v1/CloudGate/GetCloudGate")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetCloudGateRequest::builder)
                .basePath("")
                .appendPathParam("admin")
                .appendPathParam("v1")
                .appendPathParam("CloudGates")
                .appendPathParam(request.getCloudGateId())
                .appendQueryParam("attributes", request.getAttributes())
                .appendListQueryParam(
                        "attributeSets",
                        request.getAttributeSets(),
                        com.oracle.bmc.util.internal.CollectionFormatType.Multi)
                .accept("application/json, application/scim+json")
                .appendHeader("authorization", request.getAuthorization())
                .appendHeader(
                        "resource_type_schema_version", request.getResourceTypeSchemaVersion())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .handleBody(
                        com.oracle.bmc.identitydomains.model.CloudGate.class,
                        GetCloudGateResponse.Builder::cloudGate)
                .handleResponseHeaderString(
                        "opc-request-id", GetCloudGateResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public GetCloudGateMappingResponse getCloudGateMapping(GetCloudGateMappingRequest request) {

        Validate.notBlank(request.getCloudGateMappingId(), "cloudGateMappingId must not be blank");

        return clientCall(request, GetCloudGateMappingResponse::builder)
                .logger(LOG, "getCloudGateMapping")
                .serviceDetails(
                        "IdentityDomains",
                        "GetCloudGateMapping",
                        "https://docs.oracle.com/iaas/api/#/en/identity-domains/v1/CloudGateMapping/GetCloudGateMapping")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetCloudGateMappingRequest::builder)
                .basePath("")
                .appendPathParam("admin")
                .appendPathParam("v1")
                .appendPathParam("CloudGateMappings")
                .appendPathParam(request.getCloudGateMappingId())
                .appendQueryParam("attributes", request.getAttributes())
                .appendListQueryParam(
                        "attributeSets",
                        request.getAttributeSets(),
                        com.oracle.bmc.util.internal.CollectionFormatType.Multi)
                .accept("application/json, application/scim+json")
                .appendHeader("authorization", request.getAuthorization())
                .appendHeader(
                        "resource_type_schema_version", request.getResourceTypeSchemaVersion())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .handleBody(
                        com.oracle.bmc.identitydomains.model.CloudGateMapping.class,
                        GetCloudGateMappingResponse.Builder::cloudGateMapping)
                .handleResponseHeaderString(
                        "opc-request-id", GetCloudGateMappingResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public GetCloudGateServerResponse getCloudGateServer(GetCloudGateServerRequest request) {

        Validate.notBlank(request.getCloudGateServerId(), "cloudGateServerId must not be blank");

        return clientCall(request, GetCloudGateServerResponse::builder)
                .logger(LOG, "getCloudGateServer")
                .serviceDetails(
                        "IdentityDomains",
                        "GetCloudGateServer",
                        "https://docs.oracle.com/iaas/api/#/en/identity-domains/v1/CloudGateServer/GetCloudGateServer")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetCloudGateServerRequest::builder)
                .basePath("")
                .appendPathParam("admin")
                .appendPathParam("v1")
                .appendPathParam("CloudGateServers")
                .appendPathParam(request.getCloudGateServerId())
                .appendQueryParam("attributes", request.getAttributes())
                .appendListQueryParam(
                        "attributeSets",
                        request.getAttributeSets(),
                        com.oracle.bmc.util.internal.CollectionFormatType.Multi)
                .accept("application/json, application/scim+json")
                .appendHeader("authorization", request.getAuthorization())
                .appendHeader(
                        "resource_type_schema_version", request.getResourceTypeSchemaVersion())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .handleBody(
                        com.oracle.bmc.identitydomains.model.CloudGateServer.class,
                        GetCloudGateServerResponse.Builder::cloudGateServer)
                .handleResponseHeaderString(
                        "opc-request-id", GetCloudGateServerResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public GetConditionResponse getCondition(GetConditionRequest request) {

        Validate.notBlank(request.getConditionId(), "conditionId must not be blank");

        return clientCall(request, GetConditionResponse::builder)
                .logger(LOG, "getCondition")
                .serviceDetails(
                        "IdentityDomains",
                        "GetCondition",
                        "https://docs.oracle.com/iaas/api/#/en/identity-domains/v1/Condition/GetCondition")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetConditionRequest::builder)
                .basePath("")
                .appendPathParam("admin")
                .appendPathParam("v1")
                .appendPathParam("Conditions")
                .appendPathParam(request.getConditionId())
                .appendQueryParam("attributes", request.getAttributes())
                .appendListQueryParam(
                        "attributeSets",
                        request.getAttributeSets(),
                        com.oracle.bmc.util.internal.CollectionFormatType.Multi)
                .accept("application/json, application/scim+json")
                .appendHeader("authorization", request.getAuthorization())
                .appendHeader(
                        "resource_type_schema_version", request.getResourceTypeSchemaVersion())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .handleBody(
                        com.oracle.bmc.identitydomains.model.Condition.class,
                        GetConditionResponse.Builder::condition)
                .handleResponseHeaderString(
                        "opc-request-id", GetConditionResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public GetCustomerSecretKeyResponse getCustomerSecretKey(GetCustomerSecretKeyRequest request) {

        Validate.notBlank(
                request.getCustomerSecretKeyId(), "customerSecretKeyId must not be blank");

        return clientCall(request, GetCustomerSecretKeyResponse::builder)
                .logger(LOG, "getCustomerSecretKey")
                .serviceDetails(
                        "IdentityDomains",
                        "GetCustomerSecretKey",
                        "https://docs.oracle.com/iaas/api/#/en/identity-domains/v1/CustomerSecretKey/GetCustomerSecretKey")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetCustomerSecretKeyRequest::builder)
                .basePath("")
                .appendPathParam("admin")
                .appendPathParam("v1")
                .appendPathParam("CustomerSecretKeys")
                .appendPathParam(request.getCustomerSecretKeyId())
                .appendQueryParam("attributes", request.getAttributes())
                .appendListQueryParam(
                        "attributeSets",
                        request.getAttributeSets(),
                        com.oracle.bmc.util.internal.CollectionFormatType.Multi)
                .accept("application/json, application/scim+json")
                .appendHeader("authorization", request.getAuthorization())
                .appendHeader(
                        "resource_type_schema_version", request.getResourceTypeSchemaVersion())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .handleBody(
                        com.oracle.bmc.identitydomains.model.CustomerSecretKey.class,
                        GetCustomerSecretKeyResponse.Builder::customerSecretKey)
                .handleResponseHeaderString(
                        "opc-request-id", GetCustomerSecretKeyResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public GetDynamicResourceGroupResponse getDynamicResourceGroup(
            GetDynamicResourceGroupRequest request) {

        Validate.notBlank(
                request.getDynamicResourceGroupId(), "dynamicResourceGroupId must not be blank");

        return clientCall(request, GetDynamicResourceGroupResponse::builder)
                .logger(LOG, "getDynamicResourceGroup")
                .serviceDetails(
                        "IdentityDomains",
                        "GetDynamicResourceGroup",
                        "https://docs.oracle.com/iaas/api/#/en/identity-domains/v1/DynamicResourceGroup/GetDynamicResourceGroup")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetDynamicResourceGroupRequest::builder)
                .basePath("")
                .appendPathParam("admin")
                .appendPathParam("v1")
                .appendPathParam("DynamicResourceGroups")
                .appendPathParam(request.getDynamicResourceGroupId())
                .appendQueryParam("attributes", request.getAttributes())
                .appendListQueryParam(
                        "attributeSets",
                        request.getAttributeSets(),
                        com.oracle.bmc.util.internal.CollectionFormatType.Multi)
                .accept("application/json, application/scim+json")
                .appendHeader("authorization", request.getAuthorization())
                .appendHeader(
                        "resource_type_schema_version", request.getResourceTypeSchemaVersion())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .handleBody(
                        com.oracle.bmc.identitydomains.model.DynamicResourceGroup.class,
                        GetDynamicResourceGroupResponse.Builder::dynamicResourceGroup)
                .handleResponseHeaderString(
                        "opc-request-id", GetDynamicResourceGroupResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public GetGrantResponse getGrant(GetGrantRequest request) {

        Validate.notBlank(request.getGrantId(), "grantId must not be blank");

        return clientCall(request, GetGrantResponse::builder)
                .logger(LOG, "getGrant")
                .serviceDetails(
                        "IdentityDomains",
                        "GetGrant",
                        "https://docs.oracle.com/iaas/api/#/en/identity-domains/v1/Grant/GetGrant")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetGrantRequest::builder)
                .basePath("")
                .appendPathParam("admin")
                .appendPathParam("v1")
                .appendPathParam("Grants")
                .appendPathParam(request.getGrantId())
                .appendQueryParam("attributes", request.getAttributes())
                .appendListQueryParam(
                        "attributeSets",
                        request.getAttributeSets(),
                        com.oracle.bmc.util.internal.CollectionFormatType.Multi)
                .accept("application/json, application/scim+json")
                .appendHeader("authorization", request.getAuthorization())
                .appendHeader(
                        "resource_type_schema_version", request.getResourceTypeSchemaVersion())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .handleBody(
                        com.oracle.bmc.identitydomains.model.Grant.class,
                        GetGrantResponse.Builder::grant)
                .handleResponseHeaderString(
                        "opc-request-id", GetGrantResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public GetGroupResponse getGroup(GetGroupRequest request) {

        Validate.notBlank(request.getGroupId(), "groupId must not be blank");

        return clientCall(request, GetGroupResponse::builder)
                .logger(LOG, "getGroup")
                .serviceDetails(
                        "IdentityDomains",
                        "GetGroup",
                        "https://docs.oracle.com/iaas/api/#/en/identity-domains/v1/Group/GetGroup")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetGroupRequest::builder)
                .basePath("")
                .appendPathParam("admin")
                .appendPathParam("v1")
                .appendPathParam("Groups")
                .appendPathParam(request.getGroupId())
                .appendQueryParam("attributes", request.getAttributes())
                .appendListQueryParam(
                        "attributeSets",
                        request.getAttributeSets(),
                        com.oracle.bmc.util.internal.CollectionFormatType.Multi)
                .accept("application/json, application/scim+json")
                .appendHeader("authorization", request.getAuthorization())
                .appendHeader(
                        "resource_type_schema_version", request.getResourceTypeSchemaVersion())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .handleBody(
                        com.oracle.bmc.identitydomains.model.Group.class,
                        GetGroupResponse.Builder::group)
                .handleResponseHeaderString(
                        "opc-request-id", GetGroupResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public GetIdentityPropagationTrustResponse getIdentityPropagationTrust(
            GetIdentityPropagationTrustRequest request) {

        Validate.notBlank(
                request.getIdentityPropagationTrustId(),
                "identityPropagationTrustId must not be blank");

        return clientCall(request, GetIdentityPropagationTrustResponse::builder)
                .logger(LOG, "getIdentityPropagationTrust")
                .serviceDetails(
                        "IdentityDomains",
                        "GetIdentityPropagationTrust",
                        "https://docs.oracle.com/iaas/api/#/en/identity-domains/v1/IdentityPropagationTrust/GetIdentityPropagationTrust")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetIdentityPropagationTrustRequest::builder)
                .basePath("")
                .appendPathParam("admin")
                .appendPathParam("v1")
                .appendPathParam("IdentityPropagationTrusts")
                .appendPathParam(request.getIdentityPropagationTrustId())
                .appendQueryParam("attributes", request.getAttributes())
                .appendListQueryParam(
                        "attributeSets",
                        request.getAttributeSets(),
                        com.oracle.bmc.util.internal.CollectionFormatType.Multi)
                .accept("application/json, application/scim+json")
                .appendHeader("authorization", request.getAuthorization())
                .appendHeader(
                        "resource_type_schema_version", request.getResourceTypeSchemaVersion())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .handleBody(
                        com.oracle.bmc.identitydomains.model.IdentityPropagationTrust.class,
                        GetIdentityPropagationTrustResponse.Builder::identityPropagationTrust)
                .handleResponseHeaderString(
                        "opc-request-id", GetIdentityPropagationTrustResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public GetIdentityProviderResponse getIdentityProvider(GetIdentityProviderRequest request) {

        Validate.notBlank(request.getIdentityProviderId(), "identityProviderId must not be blank");

        return clientCall(request, GetIdentityProviderResponse::builder)
                .logger(LOG, "getIdentityProvider")
                .serviceDetails(
                        "IdentityDomains",
                        "GetIdentityProvider",
                        "https://docs.oracle.com/iaas/api/#/en/identity-domains/v1/IdentityProvider/GetIdentityProvider")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetIdentityProviderRequest::builder)
                .basePath("")
                .appendPathParam("admin")
                .appendPathParam("v1")
                .appendPathParam("IdentityProviders")
                .appendPathParam(request.getIdentityProviderId())
                .appendQueryParam("attributes", request.getAttributes())
                .appendListQueryParam(
                        "attributeSets",
                        request.getAttributeSets(),
                        com.oracle.bmc.util.internal.CollectionFormatType.Multi)
                .accept("application/json, application/scim+json")
                .appendHeader("authorization", request.getAuthorization())
                .appendHeader(
                        "resource_type_schema_version", request.getResourceTypeSchemaVersion())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .handleBody(
                        com.oracle.bmc.identitydomains.model.IdentityProvider.class,
                        GetIdentityProviderResponse.Builder::identityProvider)
                .handleResponseHeaderString(
                        "opc-request-id", GetIdentityProviderResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public GetIdentitySettingResponse getIdentitySetting(GetIdentitySettingRequest request) {

        Validate.notBlank(request.getIdentitySettingId(), "identitySettingId must not be blank");

        return clientCall(request, GetIdentitySettingResponse::builder)
                .logger(LOG, "getIdentitySetting")
                .serviceDetails(
                        "IdentityDomains",
                        "GetIdentitySetting",
                        "https://docs.oracle.com/iaas/api/#/en/identity-domains/v1/IdentitySetting/GetIdentitySetting")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetIdentitySettingRequest::builder)
                .basePath("")
                .appendPathParam("admin")
                .appendPathParam("v1")
                .appendPathParam("IdentitySettings")
                .appendPathParam(request.getIdentitySettingId())
                .appendQueryParam("attributes", request.getAttributes())
                .appendListQueryParam(
                        "attributeSets",
                        request.getAttributeSets(),
                        com.oracle.bmc.util.internal.CollectionFormatType.Multi)
                .accept("application/json, application/scim+json")
                .appendHeader("authorization", request.getAuthorization())
                .appendHeader(
                        "resource_type_schema_version", request.getResourceTypeSchemaVersion())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .handleBody(
                        com.oracle.bmc.identitydomains.model.IdentitySetting.class,
                        GetIdentitySettingResponse.Builder::identitySetting)
                .handleResponseHeaderString(
                        "opc-request-id", GetIdentitySettingResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public GetKmsiSettingResponse getKmsiSetting(GetKmsiSettingRequest request) {

        Validate.notBlank(request.getKmsiSettingId(), "kmsiSettingId must not be blank");

        return clientCall(request, GetKmsiSettingResponse::builder)
                .logger(LOG, "getKmsiSetting")
                .serviceDetails(
                        "IdentityDomains",
                        "GetKmsiSetting",
                        "https://docs.oracle.com/iaas/api/#/en/identity-domains/v1/KmsiSetting/GetKmsiSetting")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetKmsiSettingRequest::builder)
                .basePath("")
                .appendPathParam("admin")
                .appendPathParam("v1")
                .appendPathParam("KmsiSettings")
                .appendPathParam(request.getKmsiSettingId())
                .appendQueryParam("attributes", request.getAttributes())
                .appendListQueryParam(
                        "attributeSets",
                        request.getAttributeSets(),
                        com.oracle.bmc.util.internal.CollectionFormatType.Multi)
                .accept("application/json, application/scim+json")
                .appendHeader("authorization", request.getAuthorization())
                .appendHeader(
                        "resource_type_schema_version", request.getResourceTypeSchemaVersion())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .handleBody(
                        com.oracle.bmc.identitydomains.model.KmsiSetting.class,
                        GetKmsiSettingResponse.Builder::kmsiSetting)
                .handleResponseHeaderString(
                        "opc-request-id", GetKmsiSettingResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public GetMeResponse getMe(GetMeRequest request) {

        return clientCall(request, GetMeResponse::builder)
                .logger(LOG, "getMe")
                .serviceDetails(
                        "IdentityDomains",
                        "GetMe",
                        "https://docs.oracle.com/iaas/api/#/en/identity-domains/v1/Me/GetMe")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetMeRequest::builder)
                .basePath("")
                .appendPathParam("admin")
                .appendPathParam("v1")
                .appendPathParam("Me")
                .appendQueryParam("attributes", request.getAttributes())
                .appendListQueryParam(
                        "attributeSets",
                        request.getAttributeSets(),
                        com.oracle.bmc.util.internal.CollectionFormatType.Multi)
                .accept("application/json, application/scim+json")
                .appendHeader("authorization", request.getAuthorization())
                .appendHeader(
                        "resource_type_schema_version", request.getResourceTypeSchemaVersion())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .handleBody(
                        com.oracle.bmc.identitydomains.model.Me.class, GetMeResponse.Builder::me)
                .handleResponseHeaderString("opc-request-id", GetMeResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public GetMyApiKeyResponse getMyApiKey(GetMyApiKeyRequest request) {

        Validate.notBlank(request.getMyApiKeyId(), "myApiKeyId must not be blank");

        return clientCall(request, GetMyApiKeyResponse::builder)
                .logger(LOG, "getMyApiKey")
                .serviceDetails(
                        "IdentityDomains",
                        "GetMyApiKey",
                        "https://docs.oracle.com/iaas/api/#/en/identity-domains/v1/MyApiKey/GetMyApiKey")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetMyApiKeyRequest::builder)
                .basePath("")
                .appendPathParam("admin")
                .appendPathParam("v1")
                .appendPathParam("MyApiKeys")
                .appendPathParam(request.getMyApiKeyId())
                .accept("application/json, application/scim+json")
                .appendHeader("authorization", request.getAuthorization())
                .appendHeader(
                        "resource_type_schema_version", request.getResourceTypeSchemaVersion())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .handleBody(
                        com.oracle.bmc.identitydomains.model.MyApiKey.class,
                        GetMyApiKeyResponse.Builder::myApiKey)
                .handleResponseHeaderString(
                        "opc-request-id", GetMyApiKeyResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public GetMyAuthTokenResponse getMyAuthToken(GetMyAuthTokenRequest request) {

        Validate.notBlank(request.getMyAuthTokenId(), "myAuthTokenId must not be blank");

        return clientCall(request, GetMyAuthTokenResponse::builder)
                .logger(LOG, "getMyAuthToken")
                .serviceDetails(
                        "IdentityDomains",
                        "GetMyAuthToken",
                        "https://docs.oracle.com/iaas/api/#/en/identity-domains/v1/MyAuthToken/GetMyAuthToken")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetMyAuthTokenRequest::builder)
                .basePath("")
                .appendPathParam("admin")
                .appendPathParam("v1")
                .appendPathParam("MyAuthTokens")
                .appendPathParam(request.getMyAuthTokenId())
                .accept("application/json, application/scim+json")
                .appendHeader("authorization", request.getAuthorization())
                .appendHeader(
                        "resource_type_schema_version", request.getResourceTypeSchemaVersion())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .handleBody(
                        com.oracle.bmc.identitydomains.model.MyAuthToken.class,
                        GetMyAuthTokenResponse.Builder::myAuthToken)
                .handleResponseHeaderString(
                        "opc-request-id", GetMyAuthTokenResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public GetMyCompletedApprovalResponse getMyCompletedApproval(
            GetMyCompletedApprovalRequest request) {

        Validate.notBlank(
                request.getMyCompletedApprovalId(), "myCompletedApprovalId must not be blank");

        return clientCall(request, GetMyCompletedApprovalResponse::builder)
                .logger(LOG, "getMyCompletedApproval")
                .serviceDetails(
                        "IdentityDomains",
                        "GetMyCompletedApproval",
                        "https://docs.oracle.com/iaas/api/#/en/identity-domains/v1/MyCompletedApproval/GetMyCompletedApproval")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetMyCompletedApprovalRequest::builder)
                .basePath("")
                .appendPathParam("admin")
                .appendPathParam("v1")
                .appendPathParam("MyCompletedApprovals")
                .appendPathParam(request.getMyCompletedApprovalId())
                .accept("application/json, application/scim+json")
                .appendHeader("authorization", request.getAuthorization())
                .appendHeader(
                        "resource_type_schema_version", request.getResourceTypeSchemaVersion())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .handleBody(
                        com.oracle.bmc.identitydomains.model.MyCompletedApproval.class,
                        GetMyCompletedApprovalResponse.Builder::myCompletedApproval)
                .handleResponseHeaderString(
                        "opc-request-id", GetMyCompletedApprovalResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public GetMyCustomerSecretKeyResponse getMyCustomerSecretKey(
            GetMyCustomerSecretKeyRequest request) {

        Validate.notBlank(
                request.getMyCustomerSecretKeyId(), "myCustomerSecretKeyId must not be blank");

        return clientCall(request, GetMyCustomerSecretKeyResponse::builder)
                .logger(LOG, "getMyCustomerSecretKey")
                .serviceDetails(
                        "IdentityDomains",
                        "GetMyCustomerSecretKey",
                        "https://docs.oracle.com/iaas/api/#/en/identity-domains/v1/MyCustomerSecretKey/GetMyCustomerSecretKey")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetMyCustomerSecretKeyRequest::builder)
                .basePath("")
                .appendPathParam("admin")
                .appendPathParam("v1")
                .appendPathParam("MyCustomerSecretKeys")
                .appendPathParam(request.getMyCustomerSecretKeyId())
                .accept("application/json, application/scim+json")
                .appendHeader("authorization", request.getAuthorization())
                .appendHeader(
                        "resource_type_schema_version", request.getResourceTypeSchemaVersion())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .handleBody(
                        com.oracle.bmc.identitydomains.model.MyCustomerSecretKey.class,
                        GetMyCustomerSecretKeyResponse.Builder::myCustomerSecretKey)
                .handleResponseHeaderString(
                        "opc-request-id", GetMyCustomerSecretKeyResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public GetMyDeviceResponse getMyDevice(GetMyDeviceRequest request) {

        Validate.notBlank(request.getMyDeviceId(), "myDeviceId must not be blank");

        return clientCall(request, GetMyDeviceResponse::builder)
                .logger(LOG, "getMyDevice")
                .serviceDetails(
                        "IdentityDomains",
                        "GetMyDevice",
                        "https://docs.oracle.com/iaas/api/#/en/identity-domains/v1/MyDevice/GetMyDevice")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetMyDeviceRequest::builder)
                .basePath("")
                .appendPathParam("admin")
                .appendPathParam("v1")
                .appendPathParam("MyDevices")
                .appendPathParam(request.getMyDeviceId())
                .appendQueryParam("attributes", request.getAttributes())
                .appendListQueryParam(
                        "attributeSets",
                        request.getAttributeSets(),
                        com.oracle.bmc.util.internal.CollectionFormatType.Multi)
                .accept("application/json, application/scim+json")
                .appendHeader("authorization", request.getAuthorization())
                .appendHeader(
                        "resource_type_schema_version", request.getResourceTypeSchemaVersion())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .handleBody(
                        com.oracle.bmc.identitydomains.model.MyDevice.class,
                        GetMyDeviceResponse.Builder::myDevice)
                .handleResponseHeaderString(
                        "opc-request-id", GetMyDeviceResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public GetMyOAuth2ClientCredentialResponse getMyOAuth2ClientCredential(
            GetMyOAuth2ClientCredentialRequest request) {

        Validate.notBlank(
                request.getMyOAuth2ClientCredentialId(),
                "myOAuth2ClientCredentialId must not be blank");

        return clientCall(request, GetMyOAuth2ClientCredentialResponse::builder)
                .logger(LOG, "getMyOAuth2ClientCredential")
                .serviceDetails(
                        "IdentityDomains",
                        "GetMyOAuth2ClientCredential",
                        "https://docs.oracle.com/iaas/api/#/en/identity-domains/v1/MyOAuth2ClientCredential/GetMyOAuth2ClientCredential")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetMyOAuth2ClientCredentialRequest::builder)
                .basePath("")
                .appendPathParam("admin")
                .appendPathParam("v1")
                .appendPathParam("MyOAuth2ClientCredentials")
                .appendPathParam(request.getMyOAuth2ClientCredentialId())
                .accept("application/json, application/scim+json")
                .appendHeader("authorization", request.getAuthorization())
                .appendHeader(
                        "resource_type_schema_version", request.getResourceTypeSchemaVersion())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .handleBody(
                        com.oracle.bmc.identitydomains.model.MyOAuth2ClientCredential.class,
                        GetMyOAuth2ClientCredentialResponse.Builder::myOAuth2ClientCredential)
                .handleResponseHeaderString(
                        "opc-request-id", GetMyOAuth2ClientCredentialResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public GetMyPendingApprovalResponse getMyPendingApproval(GetMyPendingApprovalRequest request) {

        Validate.notBlank(
                request.getMyPendingApprovalId(), "myPendingApprovalId must not be blank");

        return clientCall(request, GetMyPendingApprovalResponse::builder)
                .logger(LOG, "getMyPendingApproval")
                .serviceDetails(
                        "IdentityDomains",
                        "GetMyPendingApproval",
                        "https://docs.oracle.com/iaas/api/#/en/identity-domains/v1/MyPendingApproval/GetMyPendingApproval")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetMyPendingApprovalRequest::builder)
                .basePath("")
                .appendPathParam("admin")
                .appendPathParam("v1")
                .appendPathParam("MyPendingApprovals")
                .appendPathParam(request.getMyPendingApprovalId())
                .accept("application/json, application/scim+json")
                .appendHeader("authorization", request.getAuthorization())
                .appendHeader(
                        "resource_type_schema_version", request.getResourceTypeSchemaVersion())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .handleBody(
                        com.oracle.bmc.identitydomains.model.MyPendingApproval.class,
                        GetMyPendingApprovalResponse.Builder::myPendingApproval)
                .handleResponseHeaderString(
                        "opc-request-id", GetMyPendingApprovalResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public GetMyRequestResponse getMyRequest(GetMyRequestRequest request) {

        Validate.notBlank(request.getMyRequestId(), "myRequestId must not be blank");

        return clientCall(request, GetMyRequestResponse::builder)
                .logger(LOG, "getMyRequest")
                .serviceDetails(
                        "IdentityDomains",
                        "GetMyRequest",
                        "https://docs.oracle.com/iaas/api/#/en/identity-domains/v1/MyRequest/GetMyRequest")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetMyRequestRequest::builder)
                .basePath("")
                .appendPathParam("admin")
                .appendPathParam("v1")
                .appendPathParam("MyRequests")
                .appendPathParam(request.getMyRequestId())
                .appendQueryParam("attributes", request.getAttributes())
                .appendListQueryParam(
                        "attributeSets",
                        request.getAttributeSets(),
                        com.oracle.bmc.util.internal.CollectionFormatType.Multi)
                .accept("application/json, application/scim+json")
                .appendHeader("authorization", request.getAuthorization())
                .appendHeader(
                        "resource_type_schema_version", request.getResourceTypeSchemaVersion())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .handleBody(
                        com.oracle.bmc.identitydomains.model.MyRequest.class,
                        GetMyRequestResponse.Builder::myRequest)
                .handleResponseHeaderString(
                        "opc-request-id", GetMyRequestResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public GetMySmtpCredentialResponse getMySmtpCredential(GetMySmtpCredentialRequest request) {

        Validate.notBlank(request.getMySmtpCredentialId(), "mySmtpCredentialId must not be blank");

        return clientCall(request, GetMySmtpCredentialResponse::builder)
                .logger(LOG, "getMySmtpCredential")
                .serviceDetails(
                        "IdentityDomains",
                        "GetMySmtpCredential",
                        "https://docs.oracle.com/iaas/api/#/en/identity-domains/v1/MySmtpCredential/GetMySmtpCredential")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetMySmtpCredentialRequest::builder)
                .basePath("")
                .appendPathParam("admin")
                .appendPathParam("v1")
                .appendPathParam("MySmtpCredentials")
                .appendPathParam(request.getMySmtpCredentialId())
                .accept("application/json, application/scim+json")
                .appendHeader("authorization", request.getAuthorization())
                .appendHeader(
                        "resource_type_schema_version", request.getResourceTypeSchemaVersion())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .handleBody(
                        com.oracle.bmc.identitydomains.model.MySmtpCredential.class,
                        GetMySmtpCredentialResponse.Builder::mySmtpCredential)
                .handleResponseHeaderString(
                        "opc-request-id", GetMySmtpCredentialResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public GetMySupportAccountResponse getMySupportAccount(GetMySupportAccountRequest request) {

        Validate.notBlank(request.getMySupportAccountId(), "mySupportAccountId must not be blank");

        return clientCall(request, GetMySupportAccountResponse::builder)
                .logger(LOG, "getMySupportAccount")
                .serviceDetails(
                        "IdentityDomains",
                        "GetMySupportAccount",
                        "https://docs.oracle.com/iaas/api/#/en/identity-domains/v1/MySupportAccount/GetMySupportAccount")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetMySupportAccountRequest::builder)
                .basePath("")
                .appendPathParam("admin")
                .appendPathParam("v1")
                .appendPathParam("MySupportAccounts")
                .appendPathParam(request.getMySupportAccountId())
                .accept("application/json, application/scim+json")
                .appendHeader("authorization", request.getAuthorization())
                .appendHeader(
                        "resource_type_schema_version", request.getResourceTypeSchemaVersion())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .handleBody(
                        com.oracle.bmc.identitydomains.model.MySupportAccount.class,
                        GetMySupportAccountResponse.Builder::mySupportAccount)
                .handleResponseHeaderString(
                        "opc-request-id", GetMySupportAccountResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public GetMyTrustedUserAgentResponse getMyTrustedUserAgent(
            GetMyTrustedUserAgentRequest request) {

        Validate.notBlank(
                request.getMyTrustedUserAgentId(), "myTrustedUserAgentId must not be blank");

        return clientCall(request, GetMyTrustedUserAgentResponse::builder)
                .logger(LOG, "getMyTrustedUserAgent")
                .serviceDetails(
                        "IdentityDomains",
                        "GetMyTrustedUserAgent",
                        "https://docs.oracle.com/iaas/api/#/en/identity-domains/v1/MyTrustedUserAgent/GetMyTrustedUserAgent")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetMyTrustedUserAgentRequest::builder)
                .basePath("")
                .appendPathParam("admin")
                .appendPathParam("v1")
                .appendPathParam("MyTrustedUserAgents")
                .appendPathParam(request.getMyTrustedUserAgentId())
                .appendQueryParam("attributes", request.getAttributes())
                .appendListQueryParam(
                        "attributeSets",
                        request.getAttributeSets(),
                        com.oracle.bmc.util.internal.CollectionFormatType.Multi)
                .accept("application/json, application/scim+json")
                .appendHeader("authorization", request.getAuthorization())
                .appendHeader(
                        "resource_type_schema_version", request.getResourceTypeSchemaVersion())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .handleBody(
                        com.oracle.bmc.identitydomains.model.MyTrustedUserAgent.class,
                        GetMyTrustedUserAgentResponse.Builder::myTrustedUserAgent)
                .handleResponseHeaderString(
                        "opc-request-id", GetMyTrustedUserAgentResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public GetMyUserDbCredentialResponse getMyUserDbCredential(
            GetMyUserDbCredentialRequest request) {

        Validate.notBlank(
                request.getMyUserDbCredentialId(), "myUserDbCredentialId must not be blank");

        return clientCall(request, GetMyUserDbCredentialResponse::builder)
                .logger(LOG, "getMyUserDbCredential")
                .serviceDetails(
                        "IdentityDomains",
                        "GetMyUserDbCredential",
                        "https://docs.oracle.com/iaas/api/#/en/identity-domains/v1/MyUserDbCredential/GetMyUserDbCredential")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetMyUserDbCredentialRequest::builder)
                .basePath("")
                .appendPathParam("admin")
                .appendPathParam("v1")
                .appendPathParam("MyUserDbCredentials")
                .appendPathParam(request.getMyUserDbCredentialId())
                .accept("application/json, application/scim+json")
                .appendHeader("authorization", request.getAuthorization())
                .appendHeader(
                        "resource_type_schema_version", request.getResourceTypeSchemaVersion())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .handleBody(
                        com.oracle.bmc.identitydomains.model.MyUserDbCredential.class,
                        GetMyUserDbCredentialResponse.Builder::myUserDbCredential)
                .handleResponseHeaderString(
                        "opc-request-id", GetMyUserDbCredentialResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public GetNetworkPerimeterResponse getNetworkPerimeter(GetNetworkPerimeterRequest request) {

        Validate.notBlank(request.getNetworkPerimeterId(), "networkPerimeterId must not be blank");

        return clientCall(request, GetNetworkPerimeterResponse::builder)
                .logger(LOG, "getNetworkPerimeter")
                .serviceDetails(
                        "IdentityDomains",
                        "GetNetworkPerimeter",
                        "https://docs.oracle.com/iaas/api/#/en/identity-domains/v1/NetworkPerimeter/GetNetworkPerimeter")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetNetworkPerimeterRequest::builder)
                .basePath("")
                .appendPathParam("admin")
                .appendPathParam("v1")
                .appendPathParam("NetworkPerimeters")
                .appendPathParam(request.getNetworkPerimeterId())
                .appendQueryParam("attributes", request.getAttributes())
                .appendListQueryParam(
                        "attributeSets",
                        request.getAttributeSets(),
                        com.oracle.bmc.util.internal.CollectionFormatType.Multi)
                .accept("application/json, application/scim+json")
                .appendHeader("authorization", request.getAuthorization())
                .appendHeader(
                        "resource_type_schema_version", request.getResourceTypeSchemaVersion())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .handleBody(
                        com.oracle.bmc.identitydomains.model.NetworkPerimeter.class,
                        GetNetworkPerimeterResponse.Builder::networkPerimeter)
                .handleResponseHeaderString(
                        "opc-request-id", GetNetworkPerimeterResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public GetNotificationSettingResponse getNotificationSetting(
            GetNotificationSettingRequest request) {

        Validate.notBlank(
                request.getNotificationSettingId(), "notificationSettingId must not be blank");

        return clientCall(request, GetNotificationSettingResponse::builder)
                .logger(LOG, "getNotificationSetting")
                .serviceDetails(
                        "IdentityDomains",
                        "GetNotificationSetting",
                        "https://docs.oracle.com/iaas/api/#/en/identity-domains/v1/NotificationSetting/GetNotificationSetting")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetNotificationSettingRequest::builder)
                .basePath("")
                .appendPathParam("admin")
                .appendPathParam("v1")
                .appendPathParam("NotificationSettings")
                .appendPathParam(request.getNotificationSettingId())
                .appendQueryParam("attributes", request.getAttributes())
                .appendListQueryParam(
                        "attributeSets",
                        request.getAttributeSets(),
                        com.oracle.bmc.util.internal.CollectionFormatType.Multi)
                .accept("application/json, application/scim+json")
                .appendHeader("authorization", request.getAuthorization())
                .appendHeader(
                        "resource_type_schema_version", request.getResourceTypeSchemaVersion())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .handleBody(
                        com.oracle.bmc.identitydomains.model.NotificationSetting.class,
                        GetNotificationSettingResponse.Builder::notificationSetting)
                .handleResponseHeaderString(
                        "opc-request-id", GetNotificationSettingResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public GetOAuth2ClientCredentialResponse getOAuth2ClientCredential(
            GetOAuth2ClientCredentialRequest request) {

        Validate.notBlank(
                request.getOAuth2ClientCredentialId(),
                "oAuth2ClientCredentialId must not be blank");

        return clientCall(request, GetOAuth2ClientCredentialResponse::builder)
                .logger(LOG, "getOAuth2ClientCredential")
                .serviceDetails(
                        "IdentityDomains",
                        "GetOAuth2ClientCredential",
                        "https://docs.oracle.com/iaas/api/#/en/identity-domains/v1/OAuth2ClientCredential/GetOAuth2ClientCredential")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetOAuth2ClientCredentialRequest::builder)
                .basePath("")
                .appendPathParam("admin")
                .appendPathParam("v1")
                .appendPathParam("OAuth2ClientCredentials")
                .appendPathParam(request.getOAuth2ClientCredentialId())
                .appendQueryParam("attributes", request.getAttributes())
                .appendListQueryParam(
                        "attributeSets",
                        request.getAttributeSets(),
                        com.oracle.bmc.util.internal.CollectionFormatType.Multi)
                .accept("application/json, application/scim+json")
                .appendHeader("authorization", request.getAuthorization())
                .appendHeader(
                        "resource_type_schema_version", request.getResourceTypeSchemaVersion())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .handleBody(
                        com.oracle.bmc.identitydomains.model.OAuth2ClientCredential.class,
                        GetOAuth2ClientCredentialResponse.Builder::oAuth2ClientCredential)
                .handleResponseHeaderString(
                        "opc-request-id", GetOAuth2ClientCredentialResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public GetOAuthClientCertificateResponse getOAuthClientCertificate(
            GetOAuthClientCertificateRequest request) {

        Validate.notBlank(
                request.getOAuthClientCertificateId(),
                "oAuthClientCertificateId must not be blank");

        return clientCall(request, GetOAuthClientCertificateResponse::builder)
                .logger(LOG, "getOAuthClientCertificate")
                .serviceDetails(
                        "IdentityDomains",
                        "GetOAuthClientCertificate",
                        "https://docs.oracle.com/iaas/api/#/en/identity-domains/v1/OAuthClientCertificate/GetOAuthClientCertificate")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetOAuthClientCertificateRequest::builder)
                .basePath("")
                .appendPathParam("admin")
                .appendPathParam("v1")
                .appendPathParam("OAuthClientCertificates")
                .appendPathParam(request.getOAuthClientCertificateId())
                .accept("application/json, application/scim+json")
                .appendHeader("authorization", request.getAuthorization())
                .appendHeader(
                        "resource_type_schema_version", request.getResourceTypeSchemaVersion())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .handleBody(
                        com.oracle.bmc.identitydomains.model.OAuthClientCertificate.class,
                        GetOAuthClientCertificateResponse.Builder::oAuthClientCertificate)
                .handleResponseHeaderString(
                        "opc-request-id", GetOAuthClientCertificateResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public GetOAuthPartnerCertificateResponse getOAuthPartnerCertificate(
            GetOAuthPartnerCertificateRequest request) {

        Validate.notBlank(
                request.getOAuthPartnerCertificateId(),
                "oAuthPartnerCertificateId must not be blank");

        return clientCall(request, GetOAuthPartnerCertificateResponse::builder)
                .logger(LOG, "getOAuthPartnerCertificate")
                .serviceDetails(
                        "IdentityDomains",
                        "GetOAuthPartnerCertificate",
                        "https://docs.oracle.com/iaas/api/#/en/identity-domains/v1/OAuthPartnerCertificate/GetOAuthPartnerCertificate")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetOAuthPartnerCertificateRequest::builder)
                .basePath("")
                .appendPathParam("admin")
                .appendPathParam("v1")
                .appendPathParam("OAuthPartnerCertificates")
                .appendPathParam(request.getOAuthPartnerCertificateId())
                .accept("application/json, application/scim+json")
                .appendHeader("authorization", request.getAuthorization())
                .appendHeader(
                        "resource_type_schema_version", request.getResourceTypeSchemaVersion())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .handleBody(
                        com.oracle.bmc.identitydomains.model.OAuthPartnerCertificate.class,
                        GetOAuthPartnerCertificateResponse.Builder::oAuthPartnerCertificate)
                .handleResponseHeaderString(
                        "opc-request-id", GetOAuthPartnerCertificateResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public GetOciConsoleSignOnPolicyConsentResponse getOciConsoleSignOnPolicyConsent(
            GetOciConsoleSignOnPolicyConsentRequest request) {

        Validate.notBlank(
                request.getOciConsoleSignOnPolicyConsentId(),
                "ociConsoleSignOnPolicyConsentId must not be blank");

        return clientCall(request, GetOciConsoleSignOnPolicyConsentResponse::builder)
                .logger(LOG, "getOciConsoleSignOnPolicyConsent")
                .serviceDetails(
                        "IdentityDomains",
                        "GetOciConsoleSignOnPolicyConsent",
                        "https://docs.oracle.com/iaas/api/#/en/identity-domains/v1/OciConsoleSignOnPolicyConsent/GetOciConsoleSignOnPolicyConsent")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetOciConsoleSignOnPolicyConsentRequest::builder)
                .basePath("")
                .appendPathParam("admin")
                .appendPathParam("v1")
                .appendPathParam("OciConsoleSignOnPolicyConsents")
                .appendPathParam(request.getOciConsoleSignOnPolicyConsentId())
                .appendQueryParam("attributes", request.getAttributes())
                .appendListQueryParam(
                        "attributeSets",
                        request.getAttributeSets(),
                        com.oracle.bmc.util.internal.CollectionFormatType.Multi)
                .accept("application/json, application/scim+json")
                .appendHeader("authorization", request.getAuthorization())
                .appendHeader(
                        "resource_type_schema_version", request.getResourceTypeSchemaVersion())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .handleBody(
                        com.oracle.bmc.identitydomains.model.OciConsoleSignOnPolicyConsent.class,
                        GetOciConsoleSignOnPolicyConsentResponse.Builder
                                ::ociConsoleSignOnPolicyConsent)
                .handleResponseHeaderString(
                        "opc-request-id",
                        GetOciConsoleSignOnPolicyConsentResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public GetPasswordPolicyResponse getPasswordPolicy(GetPasswordPolicyRequest request) {

        Validate.notBlank(request.getPasswordPolicyId(), "passwordPolicyId must not be blank");

        return clientCall(request, GetPasswordPolicyResponse::builder)
                .logger(LOG, "getPasswordPolicy")
                .serviceDetails(
                        "IdentityDomains",
                        "GetPasswordPolicy",
                        "https://docs.oracle.com/iaas/api/#/en/identity-domains/v1/PasswordPolicy/GetPasswordPolicy")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetPasswordPolicyRequest::builder)
                .basePath("")
                .appendPathParam("admin")
                .appendPathParam("v1")
                .appendPathParam("PasswordPolicies")
                .appendPathParam(request.getPasswordPolicyId())
                .appendQueryParam("attributes", request.getAttributes())
                .appendListQueryParam(
                        "attributeSets",
                        request.getAttributeSets(),
                        com.oracle.bmc.util.internal.CollectionFormatType.Multi)
                .accept("application/json, application/scim+json")
                .appendHeader("authorization", request.getAuthorization())
                .appendHeader(
                        "resource_type_schema_version", request.getResourceTypeSchemaVersion())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .handleBody(
                        com.oracle.bmc.identitydomains.model.PasswordPolicy.class,
                        GetPasswordPolicyResponse.Builder::passwordPolicy)
                .handleResponseHeaderString(
                        "opc-request-id", GetPasswordPolicyResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public GetPolicyResponse getPolicy(GetPolicyRequest request) {

        Validate.notBlank(request.getPolicyId(), "policyId must not be blank");

        return clientCall(request, GetPolicyResponse::builder)
                .logger(LOG, "getPolicy")
                .serviceDetails(
                        "IdentityDomains",
                        "GetPolicy",
                        "https://docs.oracle.com/iaas/api/#/en/identity-domains/v1/Policy/GetPolicy")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetPolicyRequest::builder)
                .basePath("")
                .appendPathParam("admin")
                .appendPathParam("v1")
                .appendPathParam("Policies")
                .appendPathParam(request.getPolicyId())
                .appendQueryParam("attributes", request.getAttributes())
                .appendListQueryParam(
                        "attributeSets",
                        request.getAttributeSets(),
                        com.oracle.bmc.util.internal.CollectionFormatType.Multi)
                .accept("application/json, application/scim+json")
                .appendHeader("authorization", request.getAuthorization())
                .appendHeader(
                        "resource_type_schema_version", request.getResourceTypeSchemaVersion())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .handleBody(
                        com.oracle.bmc.identitydomains.model.Policy.class,
                        GetPolicyResponse.Builder::policy)
                .handleResponseHeaderString(
                        "opc-request-id", GetPolicyResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public GetRuleResponse getRule(GetRuleRequest request) {

        Validate.notBlank(request.getRuleId(), "ruleId must not be blank");

        return clientCall(request, GetRuleResponse::builder)
                .logger(LOG, "getRule")
                .serviceDetails(
                        "IdentityDomains",
                        "GetRule",
                        "https://docs.oracle.com/iaas/api/#/en/identity-domains/v1/Rule/GetRule")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetRuleRequest::builder)
                .basePath("")
                .appendPathParam("admin")
                .appendPathParam("v1")
                .appendPathParam("Rules")
                .appendPathParam(request.getRuleId())
                .appendQueryParam("attributes", request.getAttributes())
                .appendListQueryParam(
                        "attributeSets",
                        request.getAttributeSets(),
                        com.oracle.bmc.util.internal.CollectionFormatType.Multi)
                .accept("application/json, application/scim+json")
                .appendHeader("authorization", request.getAuthorization())
                .appendHeader(
                        "resource_type_schema_version", request.getResourceTypeSchemaVersion())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .handleBody(
                        com.oracle.bmc.identitydomains.model.Rule.class,
                        GetRuleResponse.Builder::rule)
                .handleResponseHeaderString("opc-request-id", GetRuleResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public GetSchemaResponse getSchema(GetSchemaRequest request) {

        Validate.notBlank(request.getSchemaId(), "schemaId must not be blank");

        return clientCall(request, GetSchemaResponse::builder)
                .logger(LOG, "getSchema")
                .serviceDetails(
                        "IdentityDomains",
                        "GetSchema",
                        "https://docs.oracle.com/iaas/api/#/en/identity-domains/v1/Schema/GetSchema")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetSchemaRequest::builder)
                .basePath("")
                .appendPathParam("admin")
                .appendPathParam("v1")
                .appendPathParam("Schemas")
                .appendPathParam(request.getSchemaId())
                .accept("application/json, application/scim+json")
                .appendHeader("authorization", request.getAuthorization())
                .appendHeader(
                        "resource_type_schema_version", request.getResourceTypeSchemaVersion())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .handleBody(
                        com.oracle.bmc.identitydomains.model.Schema.class,
                        GetSchemaResponse.Builder::schema)
                .handleResponseHeaderString(
                        "opc-request-id", GetSchemaResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public GetSecurityQuestionResponse getSecurityQuestion(GetSecurityQuestionRequest request) {

        Validate.notBlank(request.getSecurityQuestionId(), "securityQuestionId must not be blank");

        return clientCall(request, GetSecurityQuestionResponse::builder)
                .logger(LOG, "getSecurityQuestion")
                .serviceDetails(
                        "IdentityDomains",
                        "GetSecurityQuestion",
                        "https://docs.oracle.com/iaas/api/#/en/identity-domains/v1/SecurityQuestion/GetSecurityQuestion")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetSecurityQuestionRequest::builder)
                .basePath("")
                .appendPathParam("admin")
                .appendPathParam("v1")
                .appendPathParam("SecurityQuestions")
                .appendPathParam(request.getSecurityQuestionId())
                .appendQueryParam("attributes", request.getAttributes())
                .appendListQueryParam(
                        "attributeSets",
                        request.getAttributeSets(),
                        com.oracle.bmc.util.internal.CollectionFormatType.Multi)
                .accept("application/json, application/scim+json")
                .appendHeader("authorization", request.getAuthorization())
                .appendHeader(
                        "resource_type_schema_version", request.getResourceTypeSchemaVersion())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .handleBody(
                        com.oracle.bmc.identitydomains.model.SecurityQuestion.class,
                        GetSecurityQuestionResponse.Builder::securityQuestion)
                .handleResponseHeaderString(
                        "opc-request-id", GetSecurityQuestionResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public GetSecurityQuestionSettingResponse getSecurityQuestionSetting(
            GetSecurityQuestionSettingRequest request) {

        Validate.notBlank(
                request.getSecurityQuestionSettingId(),
                "securityQuestionSettingId must not be blank");

        return clientCall(request, GetSecurityQuestionSettingResponse::builder)
                .logger(LOG, "getSecurityQuestionSetting")
                .serviceDetails(
                        "IdentityDomains",
                        "GetSecurityQuestionSetting",
                        "https://docs.oracle.com/iaas/api/#/en/identity-domains/v1/SecurityQuestionSetting/GetSecurityQuestionSetting")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetSecurityQuestionSettingRequest::builder)
                .basePath("")
                .appendPathParam("admin")
                .appendPathParam("v1")
                .appendPathParam("SecurityQuestionSettings")
                .appendPathParam(request.getSecurityQuestionSettingId())
                .appendQueryParam("attributes", request.getAttributes())
                .appendListQueryParam(
                        "attributeSets",
                        request.getAttributeSets(),
                        com.oracle.bmc.util.internal.CollectionFormatType.Multi)
                .accept("application/json, application/scim+json")
                .appendHeader("authorization", request.getAuthorization())
                .appendHeader(
                        "resource_type_schema_version", request.getResourceTypeSchemaVersion())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .handleBody(
                        com.oracle.bmc.identitydomains.model.SecurityQuestionSetting.class,
                        GetSecurityQuestionSettingResponse.Builder::securityQuestionSetting)
                .handleResponseHeaderString(
                        "opc-request-id", GetSecurityQuestionSettingResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public GetSelfRegistrationProfileResponse getSelfRegistrationProfile(
            GetSelfRegistrationProfileRequest request) {

        Validate.notBlank(
                request.getSelfRegistrationProfileId(),
                "selfRegistrationProfileId must not be blank");

        return clientCall(request, GetSelfRegistrationProfileResponse::builder)
                .logger(LOG, "getSelfRegistrationProfile")
                .serviceDetails(
                        "IdentityDomains",
                        "GetSelfRegistrationProfile",
                        "https://docs.oracle.com/iaas/api/#/en/identity-domains/v1/SelfRegistrationProfile/GetSelfRegistrationProfile")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetSelfRegistrationProfileRequest::builder)
                .basePath("")
                .appendPathParam("admin")
                .appendPathParam("v1")
                .appendPathParam("SelfRegistrationProfiles")
                .appendPathParam(request.getSelfRegistrationProfileId())
                .appendQueryParam("attributes", request.getAttributes())
                .appendListQueryParam(
                        "attributeSets",
                        request.getAttributeSets(),
                        com.oracle.bmc.util.internal.CollectionFormatType.Multi)
                .accept("application/json, application/scim+json")
                .appendHeader("authorization", request.getAuthorization())
                .appendHeader(
                        "resource_type_schema_version", request.getResourceTypeSchemaVersion())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .handleBody(
                        com.oracle.bmc.identitydomains.model.SelfRegistrationProfile.class,
                        GetSelfRegistrationProfileResponse.Builder::selfRegistrationProfile)
                .handleResponseHeaderString(
                        "opc-request-id", GetSelfRegistrationProfileResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public GetSettingResponse getSetting(GetSettingRequest request) {

        Validate.notBlank(request.getSettingId(), "settingId must not be blank");

        return clientCall(request, GetSettingResponse::builder)
                .logger(LOG, "getSetting")
                .serviceDetails(
                        "IdentityDomains",
                        "GetSetting",
                        "https://docs.oracle.com/iaas/api/#/en/identity-domains/v1/Setting/GetSetting")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetSettingRequest::builder)
                .basePath("")
                .appendPathParam("admin")
                .appendPathParam("v1")
                .appendPathParam("Settings")
                .appendPathParam(request.getSettingId())
                .appendQueryParam("attributes", request.getAttributes())
                .appendListQueryParam(
                        "attributeSets",
                        request.getAttributeSets(),
                        com.oracle.bmc.util.internal.CollectionFormatType.Multi)
                .accept("application/json, application/scim+json")
                .appendHeader("authorization", request.getAuthorization())
                .appendHeader(
                        "resource_type_schema_version", request.getResourceTypeSchemaVersion())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .handleBody(
                        com.oracle.bmc.identitydomains.model.Setting.class,
                        GetSettingResponse.Builder::setting)
                .handleResponseHeaderString(
                        "opc-request-id", GetSettingResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public GetSmtpCredentialResponse getSmtpCredential(GetSmtpCredentialRequest request) {

        Validate.notBlank(request.getSmtpCredentialId(), "smtpCredentialId must not be blank");

        return clientCall(request, GetSmtpCredentialResponse::builder)
                .logger(LOG, "getSmtpCredential")
                .serviceDetails(
                        "IdentityDomains",
                        "GetSmtpCredential",
                        "https://docs.oracle.com/iaas/api/#/en/identity-domains/v1/SmtpCredential/GetSmtpCredential")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetSmtpCredentialRequest::builder)
                .basePath("")
                .appendPathParam("admin")
                .appendPathParam("v1")
                .appendPathParam("SmtpCredentials")
                .appendPathParam(request.getSmtpCredentialId())
                .appendQueryParam("attributes", request.getAttributes())
                .appendListQueryParam(
                        "attributeSets",
                        request.getAttributeSets(),
                        com.oracle.bmc.util.internal.CollectionFormatType.Multi)
                .accept("application/json, application/scim+json")
                .appendHeader("authorization", request.getAuthorization())
                .appendHeader(
                        "resource_type_schema_version", request.getResourceTypeSchemaVersion())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .handleBody(
                        com.oracle.bmc.identitydomains.model.SmtpCredential.class,
                        GetSmtpCredentialResponse.Builder::smtpCredential)
                .handleResponseHeaderString(
                        "opc-request-id", GetSmtpCredentialResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public GetSocialIdentityProviderResponse getSocialIdentityProvider(
            GetSocialIdentityProviderRequest request) {

        Validate.notBlank(
                request.getSocialIdentityProviderId(),
                "socialIdentityProviderId must not be blank");

        return clientCall(request, GetSocialIdentityProviderResponse::builder)
                .logger(LOG, "getSocialIdentityProvider")
                .serviceDetails(
                        "IdentityDomains",
                        "GetSocialIdentityProvider",
                        "https://docs.oracle.com/iaas/api/#/en/identity-domains/v1/SocialIdentityProvider/GetSocialIdentityProvider")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetSocialIdentityProviderRequest::builder)
                .basePath("")
                .appendPathParam("admin")
                .appendPathParam("v1")
                .appendPathParam("SocialIdentityProviders")
                .appendPathParam(request.getSocialIdentityProviderId())
                .accept("application/json, application/scim+json")
                .appendHeader("authorization", request.getAuthorization())
                .appendHeader(
                        "resource_type_schema_version", request.getResourceTypeSchemaVersion())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .handleBody(
                        com.oracle.bmc.identitydomains.model.SocialIdentityProvider.class,
                        GetSocialIdentityProviderResponse.Builder::socialIdentityProvider)
                .handleResponseHeaderString(
                        "opc-request-id", GetSocialIdentityProviderResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public GetUserResponse getUser(GetUserRequest request) {

        Validate.notBlank(request.getUserId(), "userId must not be blank");

        return clientCall(request, GetUserResponse::builder)
                .logger(LOG, "getUser")
                .serviceDetails(
                        "IdentityDomains",
                        "GetUser",
                        "https://docs.oracle.com/iaas/api/#/en/identity-domains/v1/User/GetUser")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetUserRequest::builder)
                .basePath("")
                .appendPathParam("admin")
                .appendPathParam("v1")
                .appendPathParam("Users")
                .appendPathParam(request.getUserId())
                .appendQueryParam("attributes", request.getAttributes())
                .appendListQueryParam(
                        "attributeSets",
                        request.getAttributeSets(),
                        com.oracle.bmc.util.internal.CollectionFormatType.Multi)
                .accept("application/json, application/scim+json")
                .appendHeader("authorization", request.getAuthorization())
                .appendHeader(
                        "resource_type_schema_version", request.getResourceTypeSchemaVersion())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .handleBody(
                        com.oracle.bmc.identitydomains.model.User.class,
                        GetUserResponse.Builder::user)
                .handleResponseHeaderString("opc-request-id", GetUserResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public GetUserAttributesSettingResponse getUserAttributesSetting(
            GetUserAttributesSettingRequest request) {

        Validate.notBlank(
                request.getUserAttributesSettingId(), "userAttributesSettingId must not be blank");

        return clientCall(request, GetUserAttributesSettingResponse::builder)
                .logger(LOG, "getUserAttributesSetting")
                .serviceDetails(
                        "IdentityDomains",
                        "GetUserAttributesSetting",
                        "https://docs.oracle.com/iaas/api/#/en/identity-domains/v1/UserAttributesSetting/GetUserAttributesSetting")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetUserAttributesSettingRequest::builder)
                .basePath("")
                .appendPathParam("admin")
                .appendPathParam("v1")
                .appendPathParam("UserAttributesSettings")
                .appendPathParam(request.getUserAttributesSettingId())
                .appendQueryParam("attributes", request.getAttributes())
                .appendListQueryParam(
                        "attributeSets",
                        request.getAttributeSets(),
                        com.oracle.bmc.util.internal.CollectionFormatType.Multi)
                .accept("application/json, application/scim+json")
                .appendHeader("authorization", request.getAuthorization())
                .appendHeader(
                        "resource_type_schema_version", request.getResourceTypeSchemaVersion())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .handleBody(
                        com.oracle.bmc.identitydomains.model.UserAttributesSetting.class,
                        GetUserAttributesSettingResponse.Builder::userAttributesSetting)
                .handleResponseHeaderString(
                        "opc-request-id", GetUserAttributesSettingResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public GetUserDbCredentialResponse getUserDbCredential(GetUserDbCredentialRequest request) {

        Validate.notBlank(request.getUserDbCredentialId(), "userDbCredentialId must not be blank");

        return clientCall(request, GetUserDbCredentialResponse::builder)
                .logger(LOG, "getUserDbCredential")
                .serviceDetails(
                        "IdentityDomains",
                        "GetUserDbCredential",
                        "https://docs.oracle.com/iaas/api/#/en/identity-domains/v1/UserDbCredential/GetUserDbCredential")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetUserDbCredentialRequest::builder)
                .basePath("")
                .appendPathParam("admin")
                .appendPathParam("v1")
                .appendPathParam("UserDbCredentials")
                .appendPathParam(request.getUserDbCredentialId())
                .appendQueryParam("attributes", request.getAttributes())
                .appendListQueryParam(
                        "attributeSets",
                        request.getAttributeSets(),
                        com.oracle.bmc.util.internal.CollectionFormatType.Multi)
                .accept("application/json, application/scim+json")
                .appendHeader("authorization", request.getAuthorization())
                .appendHeader(
                        "resource_type_schema_version", request.getResourceTypeSchemaVersion())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .handleBody(
                        com.oracle.bmc.identitydomains.model.UserDbCredential.class,
                        GetUserDbCredentialResponse.Builder::userDbCredential)
                .handleResponseHeaderString(
                        "opc-request-id", GetUserDbCredentialResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public ListAccountMgmtInfosResponse listAccountMgmtInfos(ListAccountMgmtInfosRequest request) {

        return clientCall(request, ListAccountMgmtInfosResponse::builder)
                .logger(LOG, "listAccountMgmtInfos")
                .serviceDetails(
                        "IdentityDomains",
                        "ListAccountMgmtInfos",
                        "https://docs.oracle.com/iaas/api/#/en/identity-domains/v1/AccountMgmtInfos/ListAccountMgmtInfos")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListAccountMgmtInfosRequest::builder)
                .basePath("")
                .appendPathParam("admin")
                .appendPathParam("v1")
                .appendPathParam("AccountMgmtInfos")
                .appendQueryParam("filter", request.getFilter())
                .appendQueryParam("sortBy", request.getSortBy())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .appendQueryParam("startIndex", request.getStartIndex())
                .appendQueryParam("count", request.getCount())
                .appendQueryParam("attributes", request.getAttributes())
                .appendListQueryParam(
                        "attributeSets",
                        request.getAttributeSets(),
                        com.oracle.bmc.util.internal.CollectionFormatType.Multi)
                .appendQueryParam("page", request.getPage())
                .appendQueryParam("limit", request.getLimit())
                .accept("application/json, application/scim+json")
                .appendHeader("authorization", request.getAuthorization())
                .appendHeader(
                        "resource_type_schema_version", request.getResourceTypeSchemaVersion())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .handleBody(
                        com.oracle.bmc.identitydomains.model.AccountMgmtInfos.class,
                        ListAccountMgmtInfosResponse.Builder::accountMgmtInfos)
                .handleResponseHeaderString(
                        "opc-request-id", ListAccountMgmtInfosResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListAccountMgmtInfosResponse.Builder::opcNextPage)
                .callSync();
    }

    @Override
    public ListAccountRecoverySettingsResponse listAccountRecoverySettings(
            ListAccountRecoverySettingsRequest request) {

        return clientCall(request, ListAccountRecoverySettingsResponse::builder)
                .logger(LOG, "listAccountRecoverySettings")
                .serviceDetails(
                        "IdentityDomains",
                        "ListAccountRecoverySettings",
                        "https://docs.oracle.com/iaas/api/#/en/identity-domains/v1/AccountRecoverySettings/ListAccountRecoverySettings")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListAccountRecoverySettingsRequest::builder)
                .basePath("")
                .appendPathParam("admin")
                .appendPathParam("v1")
                .appendPathParam("AccountRecoverySettings")
                .appendQueryParam("attributes", request.getAttributes())
                .appendListQueryParam(
                        "attributeSets",
                        request.getAttributeSets(),
                        com.oracle.bmc.util.internal.CollectionFormatType.Multi)
                .appendQueryParam("page", request.getPage())
                .appendQueryParam("limit", request.getLimit())
                .accept("application/json, application/scim+json")
                .appendHeader("authorization", request.getAuthorization())
                .appendHeader(
                        "resource_type_schema_version", request.getResourceTypeSchemaVersion())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .handleBody(
                        com.oracle.bmc.identitydomains.model.AccountRecoverySettings.class,
                        ListAccountRecoverySettingsResponse.Builder::accountRecoverySettings)
                .handleResponseHeaderString(
                        "opc-request-id", ListAccountRecoverySettingsResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListAccountRecoverySettingsResponse.Builder::opcNextPage)
                .callSync();
    }

    @Override
    public ListApiKeysResponse listApiKeys(ListApiKeysRequest request) {

        return clientCall(request, ListApiKeysResponse::builder)
                .logger(LOG, "listApiKeys")
                .serviceDetails(
                        "IdentityDomains",
                        "ListApiKeys",
                        "https://docs.oracle.com/iaas/api/#/en/identity-domains/v1/ApiKeys/ListApiKeys")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListApiKeysRequest::builder)
                .basePath("")
                .appendPathParam("admin")
                .appendPathParam("v1")
                .appendPathParam("ApiKeys")
                .appendQueryParam("filter", request.getFilter())
                .appendQueryParam("sortBy", request.getSortBy())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .appendQueryParam("startIndex", request.getStartIndex())
                .appendQueryParam("count", request.getCount())
                .appendQueryParam("attributes", request.getAttributes())
                .appendListQueryParam(
                        "attributeSets",
                        request.getAttributeSets(),
                        com.oracle.bmc.util.internal.CollectionFormatType.Multi)
                .appendQueryParam("page", request.getPage())
                .appendQueryParam("limit", request.getLimit())
                .accept("application/json, application/scim+json")
                .appendHeader("authorization", request.getAuthorization())
                .appendHeader(
                        "resource_type_schema_version", request.getResourceTypeSchemaVersion())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .handleBody(
                        com.oracle.bmc.identitydomains.model.ApiKeys.class,
                        ListApiKeysResponse.Builder::apiKeys)
                .handleResponseHeaderString(
                        "opc-request-id", ListApiKeysResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListApiKeysResponse.Builder::opcNextPage)
                .callSync();
    }

    @Override
    public ListAppRolesResponse listAppRoles(ListAppRolesRequest request) {

        return clientCall(request, ListAppRolesResponse::builder)
                .logger(LOG, "listAppRoles")
                .serviceDetails(
                        "IdentityDomains",
                        "ListAppRoles",
                        "https://docs.oracle.com/iaas/api/#/en/identity-domains/v1/AppRoles/ListAppRoles")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListAppRolesRequest::builder)
                .basePath("")
                .appendPathParam("admin")
                .appendPathParam("v1")
                .appendPathParam("AppRoles")
                .appendQueryParam("filter", request.getFilter())
                .appendQueryParam("sortBy", request.getSortBy())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .appendQueryParam("startIndex", request.getStartIndex())
                .appendQueryParam("count", request.getCount())
                .appendQueryParam("attributes", request.getAttributes())
                .appendListQueryParam(
                        "attributeSets",
                        request.getAttributeSets(),
                        com.oracle.bmc.util.internal.CollectionFormatType.Multi)
                .appendQueryParam("page", request.getPage())
                .appendQueryParam("limit", request.getLimit())
                .accept("application/json, application/scim+json")
                .appendHeader("authorization", request.getAuthorization())
                .appendHeader(
                        "resource_type_schema_version", request.getResourceTypeSchemaVersion())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .handleBody(
                        com.oracle.bmc.identitydomains.model.AppRoles.class,
                        ListAppRolesResponse.Builder::appRoles)
                .handleResponseHeaderString(
                        "opc-request-id", ListAppRolesResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListAppRolesResponse.Builder::opcNextPage)
                .callSync();
    }

    @Override
    public ListApprovalWorkflowAssignmentsResponse listApprovalWorkflowAssignments(
            ListApprovalWorkflowAssignmentsRequest request) {

        return clientCall(request, ListApprovalWorkflowAssignmentsResponse::builder)
                .logger(LOG, "listApprovalWorkflowAssignments")
                .serviceDetails(
                        "IdentityDomains",
                        "ListApprovalWorkflowAssignments",
                        "https://docs.oracle.com/iaas/api/#/en/identity-domains/v1/ApprovalWorkflowAssignments/ListApprovalWorkflowAssignments")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListApprovalWorkflowAssignmentsRequest::builder)
                .basePath("")
                .appendPathParam("admin")
                .appendPathParam("v1")
                .appendPathParam("ApprovalWorkflowAssignments")
                .appendQueryParam("filter", request.getFilter())
                .appendQueryParam("sortBy", request.getSortBy())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .appendQueryParam("startIndex", request.getStartIndex())
                .appendQueryParam("count", request.getCount())
                .appendQueryParam("attributes", request.getAttributes())
                .appendListQueryParam(
                        "attributeSets",
                        request.getAttributeSets(),
                        com.oracle.bmc.util.internal.CollectionFormatType.Multi)
                .appendQueryParam("page", request.getPage())
                .appendQueryParam("limit", request.getLimit())
                .accept("application/json, application/scim+json")
                .appendHeader("authorization", request.getAuthorization())
                .appendHeader(
                        "resource_type_schema_version", request.getResourceTypeSchemaVersion())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .handleBody(
                        com.oracle.bmc.identitydomains.model.ApprovalWorkflowAssignments.class,
                        ListApprovalWorkflowAssignmentsResponse.Builder
                                ::approvalWorkflowAssignments)
                .handleResponseHeaderString(
                        "opc-request-id",
                        ListApprovalWorkflowAssignmentsResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page",
                        ListApprovalWorkflowAssignmentsResponse.Builder::opcNextPage)
                .callSync();
    }

    @Override
    public ListApprovalWorkflowStepsResponse listApprovalWorkflowSteps(
            ListApprovalWorkflowStepsRequest request) {

        return clientCall(request, ListApprovalWorkflowStepsResponse::builder)
                .logger(LOG, "listApprovalWorkflowSteps")
                .serviceDetails(
                        "IdentityDomains",
                        "ListApprovalWorkflowSteps",
                        "https://docs.oracle.com/iaas/api/#/en/identity-domains/v1/ApprovalWorkflowSteps/ListApprovalWorkflowSteps")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListApprovalWorkflowStepsRequest::builder)
                .basePath("")
                .appendPathParam("admin")
                .appendPathParam("v1")
                .appendPathParam("ApprovalWorkflowSteps")
                .appendQueryParam("filter", request.getFilter())
                .appendQueryParam("sortBy", request.getSortBy())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .appendQueryParam("startIndex", request.getStartIndex())
                .appendQueryParam("count", request.getCount())
                .appendQueryParam("attributes", request.getAttributes())
                .appendListQueryParam(
                        "attributeSets",
                        request.getAttributeSets(),
                        com.oracle.bmc.util.internal.CollectionFormatType.Multi)
                .appendQueryParam("page", request.getPage())
                .appendQueryParam("limit", request.getLimit())
                .accept("application/json, application/scim+json")
                .appendHeader("authorization", request.getAuthorization())
                .appendHeader(
                        "resource_type_schema_version", request.getResourceTypeSchemaVersion())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .handleBody(
                        com.oracle.bmc.identitydomains.model.ApprovalWorkflowSteps.class,
                        ListApprovalWorkflowStepsResponse.Builder::approvalWorkflowSteps)
                .handleResponseHeaderString(
                        "opc-request-id", ListApprovalWorkflowStepsResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListApprovalWorkflowStepsResponse.Builder::opcNextPage)
                .callSync();
    }

    @Override
    public ListApprovalWorkflowsResponse listApprovalWorkflows(
            ListApprovalWorkflowsRequest request) {

        return clientCall(request, ListApprovalWorkflowsResponse::builder)
                .logger(LOG, "listApprovalWorkflows")
                .serviceDetails(
                        "IdentityDomains",
                        "ListApprovalWorkflows",
                        "https://docs.oracle.com/iaas/api/#/en/identity-domains/v1/ApprovalWorkflows/ListApprovalWorkflows")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListApprovalWorkflowsRequest::builder)
                .basePath("")
                .appendPathParam("admin")
                .appendPathParam("v1")
                .appendPathParam("ApprovalWorkflows")
                .appendQueryParam("filter", request.getFilter())
                .appendQueryParam("sortBy", request.getSortBy())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .appendQueryParam("startIndex", request.getStartIndex())
                .appendQueryParam("count", request.getCount())
                .appendQueryParam("attributes", request.getAttributes())
                .appendListQueryParam(
                        "attributeSets",
                        request.getAttributeSets(),
                        com.oracle.bmc.util.internal.CollectionFormatType.Multi)
                .appendQueryParam("page", request.getPage())
                .appendQueryParam("limit", request.getLimit())
                .accept("application/json, application/scim+json")
                .appendHeader("authorization", request.getAuthorization())
                .appendHeader(
                        "resource_type_schema_version", request.getResourceTypeSchemaVersion())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .handleBody(
                        com.oracle.bmc.identitydomains.model.ApprovalWorkflows.class,
                        ListApprovalWorkflowsResponse.Builder::approvalWorkflows)
                .handleResponseHeaderString(
                        "opc-request-id", ListApprovalWorkflowsResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListApprovalWorkflowsResponse.Builder::opcNextPage)
                .callSync();
    }

    @Override
    public ListAppsResponse listApps(ListAppsRequest request) {

        return clientCall(request, ListAppsResponse::builder)
                .logger(LOG, "listApps")
                .serviceDetails(
                        "IdentityDomains",
                        "ListApps",
                        "https://docs.oracle.com/iaas/api/#/en/identity-domains/v1/Apps/ListApps")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListAppsRequest::builder)
                .basePath("")
                .appendPathParam("admin")
                .appendPathParam("v1")
                .appendPathParam("Apps")
                .appendQueryParam("filter", request.getFilter())
                .appendQueryParam("sortBy", request.getSortBy())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .appendQueryParam("startIndex", request.getStartIndex())
                .appendQueryParam("count", request.getCount())
                .appendQueryParam("attributes", request.getAttributes())
                .appendListQueryParam(
                        "attributeSets",
                        request.getAttributeSets(),
                        com.oracle.bmc.util.internal.CollectionFormatType.Multi)
                .appendQueryParam("page", request.getPage())
                .appendQueryParam("limit", request.getLimit())
                .accept("application/json, application/scim+json")
                .appendHeader("authorization", request.getAuthorization())
                .appendHeader(
                        "resource_type_schema_version", request.getResourceTypeSchemaVersion())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .handleBody(
                        com.oracle.bmc.identitydomains.model.Apps.class,
                        ListAppsResponse.Builder::apps)
                .handleResponseHeaderString(
                        "opc-request-id", ListAppsResponse.Builder::opcRequestId)
                .handleResponseHeaderString("opc-next-page", ListAppsResponse.Builder::opcNextPage)
                .callSync();
    }

    @Override
    public ListAuthTokensResponse listAuthTokens(ListAuthTokensRequest request) {

        return clientCall(request, ListAuthTokensResponse::builder)
                .logger(LOG, "listAuthTokens")
                .serviceDetails(
                        "IdentityDomains",
                        "ListAuthTokens",
                        "https://docs.oracle.com/iaas/api/#/en/identity-domains/v1/AuthTokens/ListAuthTokens")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListAuthTokensRequest::builder)
                .basePath("")
                .appendPathParam("admin")
                .appendPathParam("v1")
                .appendPathParam("AuthTokens")
                .appendQueryParam("filter", request.getFilter())
                .appendQueryParam("sortBy", request.getSortBy())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .appendQueryParam("startIndex", request.getStartIndex())
                .appendQueryParam("count", request.getCount())
                .appendQueryParam("attributes", request.getAttributes())
                .appendListQueryParam(
                        "attributeSets",
                        request.getAttributeSets(),
                        com.oracle.bmc.util.internal.CollectionFormatType.Multi)
                .appendQueryParam("page", request.getPage())
                .appendQueryParam("limit", request.getLimit())
                .accept("application/json, application/scim+json")
                .appendHeader("authorization", request.getAuthorization())
                .appendHeader(
                        "resource_type_schema_version", request.getResourceTypeSchemaVersion())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .handleBody(
                        com.oracle.bmc.identitydomains.model.AuthTokens.class,
                        ListAuthTokensResponse.Builder::authTokens)
                .handleResponseHeaderString(
                        "opc-request-id", ListAuthTokensResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListAuthTokensResponse.Builder::opcNextPage)
                .callSync();
    }

    @Override
    public ListAuthenticationFactorSettingsResponse listAuthenticationFactorSettings(
            ListAuthenticationFactorSettingsRequest request) {

        return clientCall(request, ListAuthenticationFactorSettingsResponse::builder)
                .logger(LOG, "listAuthenticationFactorSettings")
                .serviceDetails(
                        "IdentityDomains",
                        "ListAuthenticationFactorSettings",
                        "https://docs.oracle.com/iaas/api/#/en/identity-domains/v1/AuthenticationFactorSettings/ListAuthenticationFactorSettings")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListAuthenticationFactorSettingsRequest::builder)
                .basePath("")
                .appendPathParam("admin")
                .appendPathParam("v1")
                .appendPathParam("AuthenticationFactorSettings")
                .appendQueryParam("attributes", request.getAttributes())
                .appendListQueryParam(
                        "attributeSets",
                        request.getAttributeSets(),
                        com.oracle.bmc.util.internal.CollectionFormatType.Multi)
                .appendQueryParam("page", request.getPage())
                .appendQueryParam("limit", request.getLimit())
                .accept("application/json, application/scim+json")
                .appendHeader("authorization", request.getAuthorization())
                .appendHeader(
                        "resource_type_schema_version", request.getResourceTypeSchemaVersion())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .handleBody(
                        com.oracle.bmc.identitydomains.model.AuthenticationFactorSettings.class,
                        ListAuthenticationFactorSettingsResponse.Builder
                                ::authenticationFactorSettings)
                .handleResponseHeaderString(
                        "opc-request-id",
                        ListAuthenticationFactorSettingsResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page",
                        ListAuthenticationFactorSettingsResponse.Builder::opcNextPage)
                .callSync();
    }

    @Override
    public ListBrandingSettingsResponse listBrandingSettings(ListBrandingSettingsRequest request) {

        return clientCall(request, ListBrandingSettingsResponse::builder)
                .logger(LOG, "listBrandingSettings")
                .serviceDetails(
                        "IdentityDomains",
                        "ListBrandingSettings",
                        "https://docs.oracle.com/iaas/api/#/en/identity-domains/v1/BrandingSettings/ListBrandingSettings")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListBrandingSettingsRequest::builder)
                .basePath("")
                .appendPathParam("admin")
                .appendPathParam("v1")
                .appendPathParam("BrandingSettings")
                .appendQueryParam("attributes", request.getAttributes())
                .appendListQueryParam(
                        "attributeSets",
                        request.getAttributeSets(),
                        com.oracle.bmc.util.internal.CollectionFormatType.Multi)
                .appendQueryParam("page", request.getPage())
                .appendQueryParam("limit", request.getLimit())
                .accept("application/json, application/scim+json")
                .appendHeader("authorization", request.getAuthorization())
                .appendHeader(
                        "resource_type_schema_version", request.getResourceTypeSchemaVersion())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .handleBody(
                        com.oracle.bmc.identitydomains.model.BrandingSettings.class,
                        ListBrandingSettingsResponse.Builder::brandingSettings)
                .handleResponseHeaderString(
                        "opc-request-id", ListBrandingSettingsResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListBrandingSettingsResponse.Builder::opcNextPage)
                .callSync();
    }

    @Override
    public ListCloudGateMappingsResponse listCloudGateMappings(
            ListCloudGateMappingsRequest request) {

        return clientCall(request, ListCloudGateMappingsResponse::builder)
                .logger(LOG, "listCloudGateMappings")
                .serviceDetails(
                        "IdentityDomains",
                        "ListCloudGateMappings",
                        "https://docs.oracle.com/iaas/api/#/en/identity-domains/v1/CloudGateMappings/ListCloudGateMappings")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListCloudGateMappingsRequest::builder)
                .basePath("")
                .appendPathParam("admin")
                .appendPathParam("v1")
                .appendPathParam("CloudGateMappings")
                .appendQueryParam("filter", request.getFilter())
                .appendQueryParam("sortBy", request.getSortBy())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .appendQueryParam("startIndex", request.getStartIndex())
                .appendQueryParam("count", request.getCount())
                .appendQueryParam("attributes", request.getAttributes())
                .appendListQueryParam(
                        "attributeSets",
                        request.getAttributeSets(),
                        com.oracle.bmc.util.internal.CollectionFormatType.Multi)
                .appendQueryParam("page", request.getPage())
                .appendQueryParam("limit", request.getLimit())
                .accept("application/json, application/scim+json")
                .appendHeader("authorization", request.getAuthorization())
                .appendHeader(
                        "resource_type_schema_version", request.getResourceTypeSchemaVersion())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .handleBody(
                        com.oracle.bmc.identitydomains.model.CloudGateMappings.class,
                        ListCloudGateMappingsResponse.Builder::cloudGateMappings)
                .handleResponseHeaderString(
                        "opc-request-id", ListCloudGateMappingsResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListCloudGateMappingsResponse.Builder::opcNextPage)
                .callSync();
    }

    @Override
    public ListCloudGateServersResponse listCloudGateServers(ListCloudGateServersRequest request) {

        return clientCall(request, ListCloudGateServersResponse::builder)
                .logger(LOG, "listCloudGateServers")
                .serviceDetails(
                        "IdentityDomains",
                        "ListCloudGateServers",
                        "https://docs.oracle.com/iaas/api/#/en/identity-domains/v1/CloudGateServers/ListCloudGateServers")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListCloudGateServersRequest::builder)
                .basePath("")
                .appendPathParam("admin")
                .appendPathParam("v1")
                .appendPathParam("CloudGateServers")
                .appendQueryParam("filter", request.getFilter())
                .appendQueryParam("sortBy", request.getSortBy())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .appendQueryParam("startIndex", request.getStartIndex())
                .appendQueryParam("count", request.getCount())
                .appendQueryParam("attributes", request.getAttributes())
                .appendListQueryParam(
                        "attributeSets",
                        request.getAttributeSets(),
                        com.oracle.bmc.util.internal.CollectionFormatType.Multi)
                .appendQueryParam("page", request.getPage())
                .appendQueryParam("limit", request.getLimit())
                .accept("application/json, application/scim+json")
                .appendHeader("authorization", request.getAuthorization())
                .appendHeader(
                        "resource_type_schema_version", request.getResourceTypeSchemaVersion())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .handleBody(
                        com.oracle.bmc.identitydomains.model.CloudGateServers.class,
                        ListCloudGateServersResponse.Builder::cloudGateServers)
                .handleResponseHeaderString(
                        "opc-request-id", ListCloudGateServersResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListCloudGateServersResponse.Builder::opcNextPage)
                .callSync();
    }

    @Override
    public ListCloudGatesResponse listCloudGates(ListCloudGatesRequest request) {

        return clientCall(request, ListCloudGatesResponse::builder)
                .logger(LOG, "listCloudGates")
                .serviceDetails(
                        "IdentityDomains",
                        "ListCloudGates",
                        "https://docs.oracle.com/iaas/api/#/en/identity-domains/v1/CloudGates/ListCloudGates")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListCloudGatesRequest::builder)
                .basePath("")
                .appendPathParam("admin")
                .appendPathParam("v1")
                .appendPathParam("CloudGates")
                .appendQueryParam("filter", request.getFilter())
                .appendQueryParam("sortBy", request.getSortBy())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .appendQueryParam("startIndex", request.getStartIndex())
                .appendQueryParam("count", request.getCount())
                .appendQueryParam("attributes", request.getAttributes())
                .appendListQueryParam(
                        "attributeSets",
                        request.getAttributeSets(),
                        com.oracle.bmc.util.internal.CollectionFormatType.Multi)
                .appendQueryParam("page", request.getPage())
                .appendQueryParam("limit", request.getLimit())
                .accept("application/json, application/scim+json")
                .appendHeader("authorization", request.getAuthorization())
                .appendHeader(
                        "resource_type_schema_version", request.getResourceTypeSchemaVersion())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .handleBody(
                        com.oracle.bmc.identitydomains.model.CloudGates.class,
                        ListCloudGatesResponse.Builder::cloudGates)
                .handleResponseHeaderString(
                        "opc-request-id", ListCloudGatesResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListCloudGatesResponse.Builder::opcNextPage)
                .callSync();
    }

    @Override
    public ListConditionsResponse listConditions(ListConditionsRequest request) {

        return clientCall(request, ListConditionsResponse::builder)
                .logger(LOG, "listConditions")
                .serviceDetails(
                        "IdentityDomains",
                        "ListConditions",
                        "https://docs.oracle.com/iaas/api/#/en/identity-domains/v1/Condition/ListConditions")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListConditionsRequest::builder)
                .basePath("")
                .appendPathParam("admin")
                .appendPathParam("v1")
                .appendPathParam("Conditions")
                .appendQueryParam("filter", request.getFilter())
                .appendQueryParam("sortBy", request.getSortBy())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .appendQueryParam("startIndex", request.getStartIndex())
                .appendQueryParam("count", request.getCount())
                .appendQueryParam("attributes", request.getAttributes())
                .appendListQueryParam(
                        "attributeSets",
                        request.getAttributeSets(),
                        com.oracle.bmc.util.internal.CollectionFormatType.Multi)
                .appendQueryParam("page", request.getPage())
                .appendQueryParam("limit", request.getLimit())
                .accept("application/json, application/scim+json")
                .appendHeader("authorization", request.getAuthorization())
                .appendHeader(
                        "resource_type_schema_version", request.getResourceTypeSchemaVersion())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .handleBody(
                        com.oracle.bmc.identitydomains.model.Conditions.class,
                        ListConditionsResponse.Builder::conditions)
                .handleResponseHeaderString(
                        "opc-request-id", ListConditionsResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListConditionsResponse.Builder::opcNextPage)
                .callSync();
    }

    @Override
    public ListCustomerSecretKeysResponse listCustomerSecretKeys(
            ListCustomerSecretKeysRequest request) {

        return clientCall(request, ListCustomerSecretKeysResponse::builder)
                .logger(LOG, "listCustomerSecretKeys")
                .serviceDetails(
                        "IdentityDomains",
                        "ListCustomerSecretKeys",
                        "https://docs.oracle.com/iaas/api/#/en/identity-domains/v1/CustomerSecretKeys/ListCustomerSecretKeys")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListCustomerSecretKeysRequest::builder)
                .basePath("")
                .appendPathParam("admin")
                .appendPathParam("v1")
                .appendPathParam("CustomerSecretKeys")
                .appendQueryParam("filter", request.getFilter())
                .appendQueryParam("sortBy", request.getSortBy())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .appendQueryParam("startIndex", request.getStartIndex())
                .appendQueryParam("count", request.getCount())
                .appendQueryParam("attributes", request.getAttributes())
                .appendListQueryParam(
                        "attributeSets",
                        request.getAttributeSets(),
                        com.oracle.bmc.util.internal.CollectionFormatType.Multi)
                .appendQueryParam("page", request.getPage())
                .appendQueryParam("limit", request.getLimit())
                .accept("application/json, application/scim+json")
                .appendHeader("authorization", request.getAuthorization())
                .appendHeader(
                        "resource_type_schema_version", request.getResourceTypeSchemaVersion())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .handleBody(
                        com.oracle.bmc.identitydomains.model.CustomerSecretKeys.class,
                        ListCustomerSecretKeysResponse.Builder::customerSecretKeys)
                .handleResponseHeaderString(
                        "opc-request-id", ListCustomerSecretKeysResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListCustomerSecretKeysResponse.Builder::opcNextPage)
                .callSync();
    }

    @Override
    public ListDynamicResourceGroupsResponse listDynamicResourceGroups(
            ListDynamicResourceGroupsRequest request) {

        return clientCall(request, ListDynamicResourceGroupsResponse::builder)
                .logger(LOG, "listDynamicResourceGroups")
                .serviceDetails(
                        "IdentityDomains",
                        "ListDynamicResourceGroups",
                        "https://docs.oracle.com/iaas/api/#/en/identity-domains/v1/DynamicResourceGroups/ListDynamicResourceGroups")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListDynamicResourceGroupsRequest::builder)
                .basePath("")
                .appendPathParam("admin")
                .appendPathParam("v1")
                .appendPathParam("DynamicResourceGroups")
                .appendQueryParam("filter", request.getFilter())
                .appendQueryParam("sortBy", request.getSortBy())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .appendQueryParam("startIndex", request.getStartIndex())
                .appendQueryParam("count", request.getCount())
                .appendQueryParam("attributes", request.getAttributes())
                .appendListQueryParam(
                        "attributeSets",
                        request.getAttributeSets(),
                        com.oracle.bmc.util.internal.CollectionFormatType.Multi)
                .appendQueryParam("page", request.getPage())
                .appendQueryParam("limit", request.getLimit())
                .accept("application/json, application/scim+json")
                .appendHeader("authorization", request.getAuthorization())
                .appendHeader(
                        "resource_type_schema_version", request.getResourceTypeSchemaVersion())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .handleBody(
                        com.oracle.bmc.identitydomains.model.DynamicResourceGroups.class,
                        ListDynamicResourceGroupsResponse.Builder::dynamicResourceGroups)
                .handleResponseHeaderString(
                        "opc-request-id", ListDynamicResourceGroupsResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListDynamicResourceGroupsResponse.Builder::opcNextPage)
                .callSync();
    }

    @Override
    public ListGrantsResponse listGrants(ListGrantsRequest request) {

        return clientCall(request, ListGrantsResponse::builder)
                .logger(LOG, "listGrants")
                .serviceDetails(
                        "IdentityDomains",
                        "ListGrants",
                        "https://docs.oracle.com/iaas/api/#/en/identity-domains/v1/Grants/ListGrants")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListGrantsRequest::builder)
                .basePath("")
                .appendPathParam("admin")
                .appendPathParam("v1")
                .appendPathParam("Grants")
                .appendQueryParam("filter", request.getFilter())
                .appendQueryParam("sortBy", request.getSortBy())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .appendQueryParam("startIndex", request.getStartIndex())
                .appendQueryParam("count", request.getCount())
                .appendQueryParam("attributes", request.getAttributes())
                .appendListQueryParam(
                        "attributeSets",
                        request.getAttributeSets(),
                        com.oracle.bmc.util.internal.CollectionFormatType.Multi)
                .appendQueryParam("page", request.getPage())
                .appendQueryParam("limit", request.getLimit())
                .accept("application/json, application/scim+json")
                .appendHeader("authorization", request.getAuthorization())
                .appendHeader(
                        "resource_type_schema_version", request.getResourceTypeSchemaVersion())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .handleBody(
                        com.oracle.bmc.identitydomains.model.Grants.class,
                        ListGrantsResponse.Builder::grants)
                .handleResponseHeaderString(
                        "opc-request-id", ListGrantsResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListGrantsResponse.Builder::opcNextPage)
                .callSync();
    }

    @Override
    public ListGroupsResponse listGroups(ListGroupsRequest request) {

        return clientCall(request, ListGroupsResponse::builder)
                .logger(LOG, "listGroups")
                .serviceDetails(
                        "IdentityDomains",
                        "ListGroups",
                        "https://docs.oracle.com/iaas/api/#/en/identity-domains/v1/Groups/ListGroups")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListGroupsRequest::builder)
                .basePath("")
                .appendPathParam("admin")
                .appendPathParam("v1")
                .appendPathParam("Groups")
                .appendQueryParam("filter", request.getFilter())
                .appendQueryParam("sortBy", request.getSortBy())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .appendQueryParam("startIndex", request.getStartIndex())
                .appendQueryParam("count", request.getCount())
                .appendQueryParam("attributes", request.getAttributes())
                .appendListQueryParam(
                        "attributeSets",
                        request.getAttributeSets(),
                        com.oracle.bmc.util.internal.CollectionFormatType.Multi)
                .appendQueryParam("page", request.getPage())
                .appendQueryParam("limit", request.getLimit())
                .accept("application/json, application/scim+json")
                .appendHeader("authorization", request.getAuthorization())
                .appendHeader(
                        "resource_type_schema_version", request.getResourceTypeSchemaVersion())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .handleBody(
                        com.oracle.bmc.identitydomains.model.Groups.class,
                        ListGroupsResponse.Builder::groups)
                .handleResponseHeaderString(
                        "opc-request-id", ListGroupsResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListGroupsResponse.Builder::opcNextPage)
                .callSync();
    }

    @Override
    public ListIdentityPropagationTrustsResponse listIdentityPropagationTrusts(
            ListIdentityPropagationTrustsRequest request) {

        return clientCall(request, ListIdentityPropagationTrustsResponse::builder)
                .logger(LOG, "listIdentityPropagationTrusts")
                .serviceDetails(
                        "IdentityDomains",
                        "ListIdentityPropagationTrusts",
                        "https://docs.oracle.com/iaas/api/#/en/identity-domains/v1/IdentityPropagationTrusts/ListIdentityPropagationTrusts")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListIdentityPropagationTrustsRequest::builder)
                .basePath("")
                .appendPathParam("admin")
                .appendPathParam("v1")
                .appendPathParam("IdentityPropagationTrusts")
                .appendQueryParam("filter", request.getFilter())
                .appendQueryParam("sortBy", request.getSortBy())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .appendQueryParam("startIndex", request.getStartIndex())
                .appendQueryParam("count", request.getCount())
                .appendQueryParam("attributes", request.getAttributes())
                .appendListQueryParam(
                        "attributeSets",
                        request.getAttributeSets(),
                        com.oracle.bmc.util.internal.CollectionFormatType.Multi)
                .appendQueryParam("page", request.getPage())
                .appendQueryParam("limit", request.getLimit())
                .accept("application/json, application/scim+json")
                .appendHeader("authorization", request.getAuthorization())
                .appendHeader(
                        "resource_type_schema_version", request.getResourceTypeSchemaVersion())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .handleBody(
                        com.oracle.bmc.identitydomains.model.IdentityPropagationTrusts.class,
                        ListIdentityPropagationTrustsResponse.Builder::identityPropagationTrusts)
                .handleResponseHeaderString(
                        "opc-request-id",
                        ListIdentityPropagationTrustsResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListIdentityPropagationTrustsResponse.Builder::opcNextPage)
                .callSync();
    }

    @Override
    public ListIdentityProvidersResponse listIdentityProviders(
            ListIdentityProvidersRequest request) {

        return clientCall(request, ListIdentityProvidersResponse::builder)
                .logger(LOG, "listIdentityProviders")
                .serviceDetails(
                        "IdentityDomains",
                        "ListIdentityProviders",
                        "https://docs.oracle.com/iaas/api/#/en/identity-domains/v1/IdentityProviders/ListIdentityProviders")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListIdentityProvidersRequest::builder)
                .basePath("")
                .appendPathParam("admin")
                .appendPathParam("v1")
                .appendPathParam("IdentityProviders")
                .appendQueryParam("filter", request.getFilter())
                .appendQueryParam("sortBy", request.getSortBy())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .appendQueryParam("startIndex", request.getStartIndex())
                .appendQueryParam("count", request.getCount())
                .appendQueryParam("attributes", request.getAttributes())
                .appendListQueryParam(
                        "attributeSets",
                        request.getAttributeSets(),
                        com.oracle.bmc.util.internal.CollectionFormatType.Multi)
                .appendQueryParam("page", request.getPage())
                .appendQueryParam("limit", request.getLimit())
                .accept("application/json, application/scim+json")
                .appendHeader("authorization", request.getAuthorization())
                .appendHeader(
                        "resource_type_schema_version", request.getResourceTypeSchemaVersion())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .handleBody(
                        com.oracle.bmc.identitydomains.model.IdentityProviders.class,
                        ListIdentityProvidersResponse.Builder::identityProviders)
                .handleResponseHeaderString(
                        "opc-request-id", ListIdentityProvidersResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListIdentityProvidersResponse.Builder::opcNextPage)
                .callSync();
    }

    @Override
    public ListIdentitySettingsResponse listIdentitySettings(ListIdentitySettingsRequest request) {

        return clientCall(request, ListIdentitySettingsResponse::builder)
                .logger(LOG, "listIdentitySettings")
                .serviceDetails(
                        "IdentityDomains",
                        "ListIdentitySettings",
                        "https://docs.oracle.com/iaas/api/#/en/identity-domains/v1/IdentitySettings/ListIdentitySettings")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListIdentitySettingsRequest::builder)
                .basePath("")
                .appendPathParam("admin")
                .appendPathParam("v1")
                .appendPathParam("IdentitySettings")
                .appendQueryParam("attributes", request.getAttributes())
                .appendListQueryParam(
                        "attributeSets",
                        request.getAttributeSets(),
                        com.oracle.bmc.util.internal.CollectionFormatType.Multi)
                .appendQueryParam("page", request.getPage())
                .appendQueryParam("limit", request.getLimit())
                .accept("application/json, application/scim+json")
                .appendHeader("authorization", request.getAuthorization())
                .appendHeader(
                        "resource_type_schema_version", request.getResourceTypeSchemaVersion())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .handleBody(
                        com.oracle.bmc.identitydomains.model.IdentitySettings.class,
                        ListIdentitySettingsResponse.Builder::identitySettings)
                .handleResponseHeaderString(
                        "opc-request-id", ListIdentitySettingsResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListIdentitySettingsResponse.Builder::opcNextPage)
                .callSync();
    }

    @Override
    public ListKmsiSettingsResponse listKmsiSettings(ListKmsiSettingsRequest request) {

        return clientCall(request, ListKmsiSettingsResponse::builder)
                .logger(LOG, "listKmsiSettings")
                .serviceDetails(
                        "IdentityDomains",
                        "ListKmsiSettings",
                        "https://docs.oracle.com/iaas/api/#/en/identity-domains/v1/KmsiSettings/ListKmsiSettings")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListKmsiSettingsRequest::builder)
                .basePath("")
                .appendPathParam("admin")
                .appendPathParam("v1")
                .appendPathParam("KmsiSettings")
                .appendQueryParam("attributes", request.getAttributes())
                .appendListQueryParam(
                        "attributeSets",
                        request.getAttributeSets(),
                        com.oracle.bmc.util.internal.CollectionFormatType.Multi)
                .appendQueryParam("page", request.getPage())
                .appendQueryParam("limit", request.getLimit())
                .accept("application/json, application/scim+json")
                .appendHeader("authorization", request.getAuthorization())
                .appendHeader(
                        "resource_type_schema_version", request.getResourceTypeSchemaVersion())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .handleBody(
                        com.oracle.bmc.identitydomains.model.KmsiSettings.class,
                        ListKmsiSettingsResponse.Builder::kmsiSettings)
                .handleResponseHeaderString(
                        "opc-request-id", ListKmsiSettingsResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListKmsiSettingsResponse.Builder::opcNextPage)
                .callSync();
    }

    @Override
    public ListMyApiKeysResponse listMyApiKeys(ListMyApiKeysRequest request) {

        return clientCall(request, ListMyApiKeysResponse::builder)
                .logger(LOG, "listMyApiKeys")
                .serviceDetails(
                        "IdentityDomains",
                        "ListMyApiKeys",
                        "https://docs.oracle.com/iaas/api/#/en/identity-domains/v1/MyApiKeys/ListMyApiKeys")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListMyApiKeysRequest::builder)
                .basePath("")
                .appendPathParam("admin")
                .appendPathParam("v1")
                .appendPathParam("MyApiKeys")
                .appendQueryParam("filter", request.getFilter())
                .appendQueryParam("sortBy", request.getSortBy())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .appendQueryParam("startIndex", request.getStartIndex())
                .appendQueryParam("count", request.getCount())
                .appendQueryParam("page", request.getPage())
                .appendQueryParam("limit", request.getLimit())
                .accept("application/json, application/scim+json")
                .appendHeader("authorization", request.getAuthorization())
                .appendHeader(
                        "resource_type_schema_version", request.getResourceTypeSchemaVersion())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .handleBody(
                        com.oracle.bmc.identitydomains.model.MyApiKeys.class,
                        ListMyApiKeysResponse.Builder::myApiKeys)
                .handleResponseHeaderString(
                        "opc-request-id", ListMyApiKeysResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListMyApiKeysResponse.Builder::opcNextPage)
                .callSync();
    }

    @Override
    public ListMyAppsResponse listMyApps(ListMyAppsRequest request) {

        return clientCall(request, ListMyAppsResponse::builder)
                .logger(LOG, "listMyApps")
                .serviceDetails(
                        "IdentityDomains",
                        "ListMyApps",
                        "https://docs.oracle.com/iaas/api/#/en/identity-domains/v1/MyApps/ListMyApps")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListMyAppsRequest::builder)
                .basePath("")
                .appendPathParam("admin")
                .appendPathParam("v1")
                .appendPathParam("MyApps")
                .appendQueryParam("filter", request.getFilter())
                .appendQueryParam("sortBy", request.getSortBy())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .appendQueryParam("startIndex", request.getStartIndex())
                .appendQueryParam("count", request.getCount())
                .appendQueryParam("page", request.getPage())
                .appendQueryParam("limit", request.getLimit())
                .accept("application/json, application/scim+json")
                .appendHeader("authorization", request.getAuthorization())
                .appendHeader(
                        "resource_type_schema_version", request.getResourceTypeSchemaVersion())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .handleBody(
                        com.oracle.bmc.identitydomains.model.MyApps.class,
                        ListMyAppsResponse.Builder::myApps)
                .handleResponseHeaderString(
                        "opc-request-id", ListMyAppsResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListMyAppsResponse.Builder::opcNextPage)
                .callSync();
    }

    @Override
    public ListMyAuthTokensResponse listMyAuthTokens(ListMyAuthTokensRequest request) {

        return clientCall(request, ListMyAuthTokensResponse::builder)
                .logger(LOG, "listMyAuthTokens")
                .serviceDetails(
                        "IdentityDomains",
                        "ListMyAuthTokens",
                        "https://docs.oracle.com/iaas/api/#/en/identity-domains/v1/MyAuthTokens/ListMyAuthTokens")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListMyAuthTokensRequest::builder)
                .basePath("")
                .appendPathParam("admin")
                .appendPathParam("v1")
                .appendPathParam("MyAuthTokens")
                .appendQueryParam("filter", request.getFilter())
                .appendQueryParam("sortBy", request.getSortBy())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .appendQueryParam("startIndex", request.getStartIndex())
                .appendQueryParam("count", request.getCount())
                .appendQueryParam("page", request.getPage())
                .appendQueryParam("limit", request.getLimit())
                .accept("application/json, application/scim+json")
                .appendHeader("authorization", request.getAuthorization())
                .appendHeader(
                        "resource_type_schema_version", request.getResourceTypeSchemaVersion())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .handleBody(
                        com.oracle.bmc.identitydomains.model.MyAuthTokens.class,
                        ListMyAuthTokensResponse.Builder::myAuthTokens)
                .handleResponseHeaderString(
                        "opc-request-id", ListMyAuthTokensResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListMyAuthTokensResponse.Builder::opcNextPage)
                .callSync();
    }

    @Override
    public ListMyCompletedApprovalsResponse listMyCompletedApprovals(
            ListMyCompletedApprovalsRequest request) {

        return clientCall(request, ListMyCompletedApprovalsResponse::builder)
                .logger(LOG, "listMyCompletedApprovals")
                .serviceDetails(
                        "IdentityDomains",
                        "ListMyCompletedApprovals",
                        "https://docs.oracle.com/iaas/api/#/en/identity-domains/v1/MyCompletedApprovals/ListMyCompletedApprovals")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListMyCompletedApprovalsRequest::builder)
                .basePath("")
                .appendPathParam("admin")
                .appendPathParam("v1")
                .appendPathParam("MyCompletedApprovals")
                .appendQueryParam("filter", request.getFilter())
                .appendQueryParam("sortBy", request.getSortBy())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .appendQueryParam("startIndex", request.getStartIndex())
                .appendQueryParam("count", request.getCount())
                .appendQueryParam("page", request.getPage())
                .appendQueryParam("limit", request.getLimit())
                .accept("application/json, application/scim+json")
                .appendHeader("authorization", request.getAuthorization())
                .appendHeader(
                        "resource_type_schema_version", request.getResourceTypeSchemaVersion())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .handleBody(
                        com.oracle.bmc.identitydomains.model.MyCompletedApprovals.class,
                        ListMyCompletedApprovalsResponse.Builder::myCompletedApprovals)
                .handleResponseHeaderString(
                        "opc-request-id", ListMyCompletedApprovalsResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListMyCompletedApprovalsResponse.Builder::opcNextPage)
                .callSync();
    }

    @Override
    public ListMyCustomerSecretKeysResponse listMyCustomerSecretKeys(
            ListMyCustomerSecretKeysRequest request) {

        return clientCall(request, ListMyCustomerSecretKeysResponse::builder)
                .logger(LOG, "listMyCustomerSecretKeys")
                .serviceDetails(
                        "IdentityDomains",
                        "ListMyCustomerSecretKeys",
                        "https://docs.oracle.com/iaas/api/#/en/identity-domains/v1/MyCustomerSecretKeys/ListMyCustomerSecretKeys")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListMyCustomerSecretKeysRequest::builder)
                .basePath("")
                .appendPathParam("admin")
                .appendPathParam("v1")
                .appendPathParam("MyCustomerSecretKeys")
                .appendQueryParam("filter", request.getFilter())
                .appendQueryParam("sortBy", request.getSortBy())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .appendQueryParam("startIndex", request.getStartIndex())
                .appendQueryParam("count", request.getCount())
                .appendQueryParam("page", request.getPage())
                .appendQueryParam("limit", request.getLimit())
                .accept("application/json, application/scim+json")
                .appendHeader("authorization", request.getAuthorization())
                .appendHeader(
                        "resource_type_schema_version", request.getResourceTypeSchemaVersion())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .handleBody(
                        com.oracle.bmc.identitydomains.model.MyCustomerSecretKeys.class,
                        ListMyCustomerSecretKeysResponse.Builder::myCustomerSecretKeys)
                .handleResponseHeaderString(
                        "opc-request-id", ListMyCustomerSecretKeysResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListMyCustomerSecretKeysResponse.Builder::opcNextPage)
                .callSync();
    }

    @Override
    public ListMyDevicesResponse listMyDevices(ListMyDevicesRequest request) {

        return clientCall(request, ListMyDevicesResponse::builder)
                .logger(LOG, "listMyDevices")
                .serviceDetails(
                        "IdentityDomains",
                        "ListMyDevices",
                        "https://docs.oracle.com/iaas/api/#/en/identity-domains/v1/MyDevices/ListMyDevices")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListMyDevicesRequest::builder)
                .basePath("")
                .appendPathParam("admin")
                .appendPathParam("v1")
                .appendPathParam("MyDevices")
                .appendQueryParam("filter", request.getFilter())
                .appendQueryParam("sortBy", request.getSortBy())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .appendQueryParam("startIndex", request.getStartIndex())
                .appendQueryParam("count", request.getCount())
                .appendQueryParam("attributes", request.getAttributes())
                .appendListQueryParam(
                        "attributeSets",
                        request.getAttributeSets(),
                        com.oracle.bmc.util.internal.CollectionFormatType.Multi)
                .appendQueryParam("page", request.getPage())
                .appendQueryParam("limit", request.getLimit())
                .accept("application/json, application/scim+json")
                .appendHeader("authorization", request.getAuthorization())
                .appendHeader(
                        "resource_type_schema_version", request.getResourceTypeSchemaVersion())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .handleBody(
                        com.oracle.bmc.identitydomains.model.MyDevices.class,
                        ListMyDevicesResponse.Builder::myDevices)
                .handleResponseHeaderString(
                        "opc-request-id", ListMyDevicesResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListMyDevicesResponse.Builder::opcNextPage)
                .callSync();
    }

    @Override
    public ListMyGroupsResponse listMyGroups(ListMyGroupsRequest request) {

        return clientCall(request, ListMyGroupsResponse::builder)
                .logger(LOG, "listMyGroups")
                .serviceDetails(
                        "IdentityDomains",
                        "ListMyGroups",
                        "https://docs.oracle.com/iaas/api/#/en/identity-domains/v1/MyGroups/ListMyGroups")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListMyGroupsRequest::builder)
                .basePath("")
                .appendPathParam("admin")
                .appendPathParam("v1")
                .appendPathParam("MyGroups")
                .appendQueryParam("filter", request.getFilter())
                .appendQueryParam("sortBy", request.getSortBy())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .appendQueryParam("startIndex", request.getStartIndex())
                .appendQueryParam("count", request.getCount())
                .appendQueryParam("attributes", request.getAttributes())
                .appendListQueryParam(
                        "attributeSets",
                        request.getAttributeSets(),
                        com.oracle.bmc.util.internal.CollectionFormatType.Multi)
                .appendQueryParam("page", request.getPage())
                .appendQueryParam("limit", request.getLimit())
                .accept("application/json, application/scim+json")
                .appendHeader("authorization", request.getAuthorization())
                .appendHeader(
                        "resource_type_schema_version", request.getResourceTypeSchemaVersion())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .handleBody(
                        com.oracle.bmc.identitydomains.model.MyGroups.class,
                        ListMyGroupsResponse.Builder::myGroups)
                .handleResponseHeaderString(
                        "opc-request-id", ListMyGroupsResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListMyGroupsResponse.Builder::opcNextPage)
                .callSync();
    }

    @Override
    public ListMyOAuth2ClientCredentialsResponse listMyOAuth2ClientCredentials(
            ListMyOAuth2ClientCredentialsRequest request) {

        return clientCall(request, ListMyOAuth2ClientCredentialsResponse::builder)
                .logger(LOG, "listMyOAuth2ClientCredentials")
                .serviceDetails(
                        "IdentityDomains",
                        "ListMyOAuth2ClientCredentials",
                        "https://docs.oracle.com/iaas/api/#/en/identity-domains/v1/MyOAuth2ClientCredentials/ListMyOAuth2ClientCredentials")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListMyOAuth2ClientCredentialsRequest::builder)
                .basePath("")
                .appendPathParam("admin")
                .appendPathParam("v1")
                .appendPathParam("MyOAuth2ClientCredentials")
                .appendQueryParam("filter", request.getFilter())
                .appendQueryParam("sortBy", request.getSortBy())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .appendQueryParam("startIndex", request.getStartIndex())
                .appendQueryParam("count", request.getCount())
                .appendQueryParam("page", request.getPage())
                .appendQueryParam("limit", request.getLimit())
                .accept("application/json, application/scim+json")
                .appendHeader("authorization", request.getAuthorization())
                .appendHeader(
                        "resource_type_schema_version", request.getResourceTypeSchemaVersion())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .handleBody(
                        com.oracle.bmc.identitydomains.model.MyOAuth2ClientCredentials.class,
                        ListMyOAuth2ClientCredentialsResponse.Builder::myOAuth2ClientCredentials)
                .handleResponseHeaderString(
                        "opc-request-id",
                        ListMyOAuth2ClientCredentialsResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListMyOAuth2ClientCredentialsResponse.Builder::opcNextPage)
                .callSync();
    }

    @Override
    public ListMyPendingApprovalsResponse listMyPendingApprovals(
            ListMyPendingApprovalsRequest request) {

        return clientCall(request, ListMyPendingApprovalsResponse::builder)
                .logger(LOG, "listMyPendingApprovals")
                .serviceDetails(
                        "IdentityDomains",
                        "ListMyPendingApprovals",
                        "https://docs.oracle.com/iaas/api/#/en/identity-domains/v1/MyPendingApprovals/ListMyPendingApprovals")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListMyPendingApprovalsRequest::builder)
                .basePath("")
                .appendPathParam("admin")
                .appendPathParam("v1")
                .appendPathParam("MyPendingApprovals")
                .appendQueryParam("filter", request.getFilter())
                .appendQueryParam("sortBy", request.getSortBy())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .appendQueryParam("startIndex", request.getStartIndex())
                .appendQueryParam("count", request.getCount())
                .appendQueryParam("page", request.getPage())
                .appendQueryParam("limit", request.getLimit())
                .accept("application/json, application/scim+json")
                .appendHeader("authorization", request.getAuthorization())
                .appendHeader(
                        "resource_type_schema_version", request.getResourceTypeSchemaVersion())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .handleBody(
                        com.oracle.bmc.identitydomains.model.MyPendingApprovals.class,
                        ListMyPendingApprovalsResponse.Builder::myPendingApprovals)
                .handleResponseHeaderString(
                        "opc-request-id", ListMyPendingApprovalsResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListMyPendingApprovalsResponse.Builder::opcNextPage)
                .callSync();
    }

    @Override
    public ListMyRequestableGroupsResponse listMyRequestableGroups(
            ListMyRequestableGroupsRequest request) {

        return clientCall(request, ListMyRequestableGroupsResponse::builder)
                .logger(LOG, "listMyRequestableGroups")
                .serviceDetails(
                        "IdentityDomains",
                        "ListMyRequestableGroups",
                        "https://docs.oracle.com/iaas/api/#/en/identity-domains/v1/MyRequestableGroups/ListMyRequestableGroups")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListMyRequestableGroupsRequest::builder)
                .basePath("")
                .appendPathParam("admin")
                .appendPathParam("v1")
                .appendPathParam("MyRequestableGroups")
                .appendQueryParam("filter", request.getFilter())
                .appendQueryParam("sortBy", request.getSortBy())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .appendQueryParam("startIndex", request.getStartIndex())
                .appendQueryParam("count", request.getCount())
                .appendQueryParam("page", request.getPage())
                .appendQueryParam("limit", request.getLimit())
                .accept("application/json, application/scim+json")
                .appendHeader("authorization", request.getAuthorization())
                .appendHeader(
                        "resource_type_schema_version", request.getResourceTypeSchemaVersion())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .handleBody(
                        com.oracle.bmc.identitydomains.model.MyRequestableGroups.class,
                        ListMyRequestableGroupsResponse.Builder::myRequestableGroups)
                .handleResponseHeaderString(
                        "opc-request-id", ListMyRequestableGroupsResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListMyRequestableGroupsResponse.Builder::opcNextPage)
                .callSync();
    }

    @Override
    public ListMyRequestsResponse listMyRequests(ListMyRequestsRequest request) {

        return clientCall(request, ListMyRequestsResponse::builder)
                .logger(LOG, "listMyRequests")
                .serviceDetails(
                        "IdentityDomains",
                        "ListMyRequests",
                        "https://docs.oracle.com/iaas/api/#/en/identity-domains/v1/MyRequests/ListMyRequests")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListMyRequestsRequest::builder)
                .basePath("")
                .appendPathParam("admin")
                .appendPathParam("v1")
                .appendPathParam("MyRequests")
                .appendQueryParam("filter", request.getFilter())
                .appendQueryParam("sortBy", request.getSortBy())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .appendQueryParam("startIndex", request.getStartIndex())
                .appendQueryParam("count", request.getCount())
                .appendQueryParam("attributes", request.getAttributes())
                .appendListQueryParam(
                        "attributeSets",
                        request.getAttributeSets(),
                        com.oracle.bmc.util.internal.CollectionFormatType.Multi)
                .appendQueryParam("page", request.getPage())
                .appendQueryParam("limit", request.getLimit())
                .accept("application/json, application/scim+json")
                .appendHeader("authorization", request.getAuthorization())
                .appendHeader(
                        "resource_type_schema_version", request.getResourceTypeSchemaVersion())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .handleBody(
                        com.oracle.bmc.identitydomains.model.MyRequests.class,
                        ListMyRequestsResponse.Builder::myRequests)
                .handleResponseHeaderString(
                        "opc-request-id", ListMyRequestsResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListMyRequestsResponse.Builder::opcNextPage)
                .callSync();
    }

    @Override
    public ListMySmtpCredentialsResponse listMySmtpCredentials(
            ListMySmtpCredentialsRequest request) {

        return clientCall(request, ListMySmtpCredentialsResponse::builder)
                .logger(LOG, "listMySmtpCredentials")
                .serviceDetails(
                        "IdentityDomains",
                        "ListMySmtpCredentials",
                        "https://docs.oracle.com/iaas/api/#/en/identity-domains/v1/MySmtpCredentials/ListMySmtpCredentials")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListMySmtpCredentialsRequest::builder)
                .basePath("")
                .appendPathParam("admin")
                .appendPathParam("v1")
                .appendPathParam("MySmtpCredentials")
                .appendQueryParam("filter", request.getFilter())
                .appendQueryParam("sortBy", request.getSortBy())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .appendQueryParam("startIndex", request.getStartIndex())
                .appendQueryParam("count", request.getCount())
                .appendQueryParam("page", request.getPage())
                .appendQueryParam("limit", request.getLimit())
                .accept("application/json, application/scim+json")
                .appendHeader("authorization", request.getAuthorization())
                .appendHeader(
                        "resource_type_schema_version", request.getResourceTypeSchemaVersion())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .handleBody(
                        com.oracle.bmc.identitydomains.model.MySmtpCredentials.class,
                        ListMySmtpCredentialsResponse.Builder::mySmtpCredentials)
                .handleResponseHeaderString(
                        "opc-request-id", ListMySmtpCredentialsResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListMySmtpCredentialsResponse.Builder::opcNextPage)
                .callSync();
    }

    @Override
    public ListMySupportAccountsResponse listMySupportAccounts(
            ListMySupportAccountsRequest request) {

        return clientCall(request, ListMySupportAccountsResponse::builder)
                .logger(LOG, "listMySupportAccounts")
                .serviceDetails(
                        "IdentityDomains",
                        "ListMySupportAccounts",
                        "https://docs.oracle.com/iaas/api/#/en/identity-domains/v1/MySupportAccounts/ListMySupportAccounts")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListMySupportAccountsRequest::builder)
                .basePath("")
                .appendPathParam("admin")
                .appendPathParam("v1")
                .appendPathParam("MySupportAccounts")
                .appendQueryParam("filter", request.getFilter())
                .appendQueryParam("sortBy", request.getSortBy())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .appendQueryParam("startIndex", request.getStartIndex())
                .appendQueryParam("count", request.getCount())
                .appendQueryParam("page", request.getPage())
                .appendQueryParam("limit", request.getLimit())
                .accept("application/json, application/scim+json")
                .appendHeader("authorization", request.getAuthorization())
                .appendHeader(
                        "resource_type_schema_version", request.getResourceTypeSchemaVersion())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .handleBody(
                        com.oracle.bmc.identitydomains.model.MySupportAccounts.class,
                        ListMySupportAccountsResponse.Builder::mySupportAccounts)
                .handleResponseHeaderString(
                        "opc-request-id", ListMySupportAccountsResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListMySupportAccountsResponse.Builder::opcNextPage)
                .callSync();
    }

    @Override
    public ListMyTrustedUserAgentsResponse listMyTrustedUserAgents(
            ListMyTrustedUserAgentsRequest request) {

        return clientCall(request, ListMyTrustedUserAgentsResponse::builder)
                .logger(LOG, "listMyTrustedUserAgents")
                .serviceDetails(
                        "IdentityDomains",
                        "ListMyTrustedUserAgents",
                        "https://docs.oracle.com/iaas/api/#/en/identity-domains/v1/MyTrustedUserAgents/ListMyTrustedUserAgents")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListMyTrustedUserAgentsRequest::builder)
                .basePath("")
                .appendPathParam("admin")
                .appendPathParam("v1")
                .appendPathParam("MyTrustedUserAgents")
                .appendQueryParam("filter", request.getFilter())
                .appendQueryParam("sortBy", request.getSortBy())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .appendQueryParam("startIndex", request.getStartIndex())
                .appendQueryParam("count", request.getCount())
                .appendQueryParam("attributes", request.getAttributes())
                .appendListQueryParam(
                        "attributeSets",
                        request.getAttributeSets(),
                        com.oracle.bmc.util.internal.CollectionFormatType.Multi)
                .appendQueryParam("page", request.getPage())
                .appendQueryParam("limit", request.getLimit())
                .accept("application/json, application/scim+json")
                .appendHeader("authorization", request.getAuthorization())
                .appendHeader(
                        "resource_type_schema_version", request.getResourceTypeSchemaVersion())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .handleBody(
                        com.oracle.bmc.identitydomains.model.MyTrustedUserAgents.class,
                        ListMyTrustedUserAgentsResponse.Builder::myTrustedUserAgents)
                .handleResponseHeaderString(
                        "opc-request-id", ListMyTrustedUserAgentsResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListMyTrustedUserAgentsResponse.Builder::opcNextPage)
                .callSync();
    }

    @Override
    public ListMyUserDbCredentialsResponse listMyUserDbCredentials(
            ListMyUserDbCredentialsRequest request) {

        return clientCall(request, ListMyUserDbCredentialsResponse::builder)
                .logger(LOG, "listMyUserDbCredentials")
                .serviceDetails(
                        "IdentityDomains",
                        "ListMyUserDbCredentials",
                        "https://docs.oracle.com/iaas/api/#/en/identity-domains/v1/MyUserDbCredentials/ListMyUserDbCredentials")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListMyUserDbCredentialsRequest::builder)
                .basePath("")
                .appendPathParam("admin")
                .appendPathParam("v1")
                .appendPathParam("MyUserDbCredentials")
                .appendQueryParam("filter", request.getFilter())
                .appendQueryParam("sortBy", request.getSortBy())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .appendQueryParam("startIndex", request.getStartIndex())
                .appendQueryParam("count", request.getCount())
                .appendQueryParam("page", request.getPage())
                .appendQueryParam("limit", request.getLimit())
                .accept("application/json, application/scim+json")
                .appendHeader("authorization", request.getAuthorization())
                .appendHeader(
                        "resource_type_schema_version", request.getResourceTypeSchemaVersion())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .handleBody(
                        com.oracle.bmc.identitydomains.model.MyUserDbCredentials.class,
                        ListMyUserDbCredentialsResponse.Builder::myUserDbCredentials)
                .handleResponseHeaderString(
                        "opc-request-id", ListMyUserDbCredentialsResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListMyUserDbCredentialsResponse.Builder::opcNextPage)
                .callSync();
    }

    @Override
    public ListNetworkPerimetersResponse listNetworkPerimeters(
            ListNetworkPerimetersRequest request) {

        return clientCall(request, ListNetworkPerimetersResponse::builder)
                .logger(LOG, "listNetworkPerimeters")
                .serviceDetails(
                        "IdentityDomains",
                        "ListNetworkPerimeters",
                        "https://docs.oracle.com/iaas/api/#/en/identity-domains/v1/NetworkPerimeters/ListNetworkPerimeters")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListNetworkPerimetersRequest::builder)
                .basePath("")
                .appendPathParam("admin")
                .appendPathParam("v1")
                .appendPathParam("NetworkPerimeters")
                .appendQueryParam("filter", request.getFilter())
                .appendQueryParam("sortBy", request.getSortBy())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .appendQueryParam("startIndex", request.getStartIndex())
                .appendQueryParam("count", request.getCount())
                .appendQueryParam("attributes", request.getAttributes())
                .appendListQueryParam(
                        "attributeSets",
                        request.getAttributeSets(),
                        com.oracle.bmc.util.internal.CollectionFormatType.Multi)
                .appendQueryParam("page", request.getPage())
                .appendQueryParam("limit", request.getLimit())
                .accept("application/json, application/scim+json")
                .appendHeader("authorization", request.getAuthorization())
                .appendHeader(
                        "resource_type_schema_version", request.getResourceTypeSchemaVersion())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .handleBody(
                        com.oracle.bmc.identitydomains.model.NetworkPerimeters.class,
                        ListNetworkPerimetersResponse.Builder::networkPerimeters)
                .handleResponseHeaderString(
                        "opc-request-id", ListNetworkPerimetersResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListNetworkPerimetersResponse.Builder::opcNextPage)
                .callSync();
    }

    @Override
    public ListNotificationSettingsResponse listNotificationSettings(
            ListNotificationSettingsRequest request) {

        return clientCall(request, ListNotificationSettingsResponse::builder)
                .logger(LOG, "listNotificationSettings")
                .serviceDetails(
                        "IdentityDomains",
                        "ListNotificationSettings",
                        "https://docs.oracle.com/iaas/api/#/en/identity-domains/v1/NotificationSettings/ListNotificationSettings")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListNotificationSettingsRequest::builder)
                .basePath("")
                .appendPathParam("admin")
                .appendPathParam("v1")
                .appendPathParam("NotificationSettings")
                .appendQueryParam("attributes", request.getAttributes())
                .appendListQueryParam(
                        "attributeSets",
                        request.getAttributeSets(),
                        com.oracle.bmc.util.internal.CollectionFormatType.Multi)
                .appendQueryParam("page", request.getPage())
                .appendQueryParam("limit", request.getLimit())
                .accept("application/json, application/scim+json")
                .appendHeader("authorization", request.getAuthorization())
                .appendHeader(
                        "resource_type_schema_version", request.getResourceTypeSchemaVersion())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .handleBody(
                        com.oracle.bmc.identitydomains.model.NotificationSettings.class,
                        ListNotificationSettingsResponse.Builder::notificationSettings)
                .handleResponseHeaderString(
                        "opc-request-id", ListNotificationSettingsResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListNotificationSettingsResponse.Builder::opcNextPage)
                .callSync();
    }

    @Override
    public ListOAuth2ClientCredentialsResponse listOAuth2ClientCredentials(
            ListOAuth2ClientCredentialsRequest request) {

        return clientCall(request, ListOAuth2ClientCredentialsResponse::builder)
                .logger(LOG, "listOAuth2ClientCredentials")
                .serviceDetails(
                        "IdentityDomains",
                        "ListOAuth2ClientCredentials",
                        "https://docs.oracle.com/iaas/api/#/en/identity-domains/v1/OAuth2ClientCredentials/ListOAuth2ClientCredentials")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListOAuth2ClientCredentialsRequest::builder)
                .basePath("")
                .appendPathParam("admin")
                .appendPathParam("v1")
                .appendPathParam("OAuth2ClientCredentials")
                .appendQueryParam("filter", request.getFilter())
                .appendQueryParam("sortBy", request.getSortBy())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .appendQueryParam("startIndex", request.getStartIndex())
                .appendQueryParam("count", request.getCount())
                .appendQueryParam("attributes", request.getAttributes())
                .appendListQueryParam(
                        "attributeSets",
                        request.getAttributeSets(),
                        com.oracle.bmc.util.internal.CollectionFormatType.Multi)
                .appendQueryParam("page", request.getPage())
                .appendQueryParam("limit", request.getLimit())
                .accept("application/json, application/scim+json")
                .appendHeader("authorization", request.getAuthorization())
                .appendHeader(
                        "resource_type_schema_version", request.getResourceTypeSchemaVersion())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .handleBody(
                        com.oracle.bmc.identitydomains.model.OAuth2ClientCredentials.class,
                        ListOAuth2ClientCredentialsResponse.Builder::oAuth2ClientCredentials)
                .handleResponseHeaderString(
                        "opc-request-id", ListOAuth2ClientCredentialsResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListOAuth2ClientCredentialsResponse.Builder::opcNextPage)
                .callSync();
    }

    @Override
    public ListOAuthClientCertificatesResponse listOAuthClientCertificates(
            ListOAuthClientCertificatesRequest request) {

        return clientCall(request, ListOAuthClientCertificatesResponse::builder)
                .logger(LOG, "listOAuthClientCertificates")
                .serviceDetails(
                        "IdentityDomains",
                        "ListOAuthClientCertificates",
                        "https://docs.oracle.com/iaas/api/#/en/identity-domains/v1/OAuthClientCertificates/ListOAuthClientCertificates")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListOAuthClientCertificatesRequest::builder)
                .basePath("")
                .appendPathParam("admin")
                .appendPathParam("v1")
                .appendPathParam("OAuthClientCertificates")
                .appendQueryParam("filter", request.getFilter())
                .appendQueryParam("sortBy", request.getSortBy())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .appendQueryParam("startIndex", request.getStartIndex())
                .appendQueryParam("count", request.getCount())
                .appendQueryParam("page", request.getPage())
                .appendQueryParam("limit", request.getLimit())
                .accept("application/json, application/scim+json")
                .appendHeader("authorization", request.getAuthorization())
                .appendHeader(
                        "resource_type_schema_version", request.getResourceTypeSchemaVersion())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .handleBody(
                        com.oracle.bmc.identitydomains.model.OAuthClientCertificates.class,
                        ListOAuthClientCertificatesResponse.Builder::oAuthClientCertificates)
                .handleResponseHeaderString(
                        "opc-request-id", ListOAuthClientCertificatesResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListOAuthClientCertificatesResponse.Builder::opcNextPage)
                .callSync();
    }

    @Override
    public ListOAuthPartnerCertificatesResponse listOAuthPartnerCertificates(
            ListOAuthPartnerCertificatesRequest request) {

        return clientCall(request, ListOAuthPartnerCertificatesResponse::builder)
                .logger(LOG, "listOAuthPartnerCertificates")
                .serviceDetails(
                        "IdentityDomains",
                        "ListOAuthPartnerCertificates",
                        "https://docs.oracle.com/iaas/api/#/en/identity-domains/v1/OAuthPartnerCertificates/ListOAuthPartnerCertificates")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListOAuthPartnerCertificatesRequest::builder)
                .basePath("")
                .appendPathParam("admin")
                .appendPathParam("v1")
                .appendPathParam("OAuthPartnerCertificates")
                .appendQueryParam("filter", request.getFilter())
                .appendQueryParam("sortBy", request.getSortBy())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .appendQueryParam("startIndex", request.getStartIndex())
                .appendQueryParam("count", request.getCount())
                .appendQueryParam("page", request.getPage())
                .appendQueryParam("limit", request.getLimit())
                .accept("application/json, application/scim+json")
                .appendHeader("authorization", request.getAuthorization())
                .appendHeader(
                        "resource_type_schema_version", request.getResourceTypeSchemaVersion())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .handleBody(
                        com.oracle.bmc.identitydomains.model.OAuthPartnerCertificates.class,
                        ListOAuthPartnerCertificatesResponse.Builder::oAuthPartnerCertificates)
                .handleResponseHeaderString(
                        "opc-request-id",
                        ListOAuthPartnerCertificatesResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListOAuthPartnerCertificatesResponse.Builder::opcNextPage)
                .callSync();
    }

    @Override
    public ListOciConsoleSignOnPolicyConsentsResponse listOciConsoleSignOnPolicyConsents(
            ListOciConsoleSignOnPolicyConsentsRequest request) {

        return clientCall(request, ListOciConsoleSignOnPolicyConsentsResponse::builder)
                .logger(LOG, "listOciConsoleSignOnPolicyConsents")
                .serviceDetails(
                        "IdentityDomains",
                        "ListOciConsoleSignOnPolicyConsents",
                        "https://docs.oracle.com/iaas/api/#/en/identity-domains/v1/OciConsoleSignOnPolicyConsent/ListOciConsoleSignOnPolicyConsents")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListOciConsoleSignOnPolicyConsentsRequest::builder)
                .basePath("")
                .appendPathParam("admin")
                .appendPathParam("v1")
                .appendPathParam("OciConsoleSignOnPolicyConsents")
                .appendQueryParam("filter", request.getFilter())
                .appendQueryParam("sortBy", request.getSortBy())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .appendQueryParam("startIndex", request.getStartIndex())
                .appendQueryParam("count", request.getCount())
                .appendQueryParam("attributes", request.getAttributes())
                .appendListQueryParam(
                        "attributeSets",
                        request.getAttributeSets(),
                        com.oracle.bmc.util.internal.CollectionFormatType.Multi)
                .appendQueryParam("page", request.getPage())
                .appendQueryParam("limit", request.getLimit())
                .accept("application/json, application/scim+json")
                .appendHeader("authorization", request.getAuthorization())
                .appendHeader(
                        "resource_type_schema_version", request.getResourceTypeSchemaVersion())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .handleBody(
                        com.oracle.bmc.identitydomains.model.OciConsoleSignOnPolicyConsents.class,
                        ListOciConsoleSignOnPolicyConsentsResponse.Builder
                                ::ociConsoleSignOnPolicyConsents)
                .handleResponseHeaderString(
                        "opc-request-id",
                        ListOciConsoleSignOnPolicyConsentsResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page",
                        ListOciConsoleSignOnPolicyConsentsResponse.Builder::opcNextPage)
                .callSync();
    }

    @Override
    public ListPasswordPoliciesResponse listPasswordPolicies(ListPasswordPoliciesRequest request) {

        return clientCall(request, ListPasswordPoliciesResponse::builder)
                .logger(LOG, "listPasswordPolicies")
                .serviceDetails(
                        "IdentityDomains",
                        "ListPasswordPolicies",
                        "https://docs.oracle.com/iaas/api/#/en/identity-domains/v1/PasswordPolicies/ListPasswordPolicies")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListPasswordPoliciesRequest::builder)
                .basePath("")
                .appendPathParam("admin")
                .appendPathParam("v1")
                .appendPathParam("PasswordPolicies")
                .appendQueryParam("filter", request.getFilter())
                .appendQueryParam("sortBy", request.getSortBy())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .appendQueryParam("startIndex", request.getStartIndex())
                .appendQueryParam("count", request.getCount())
                .appendQueryParam("attributes", request.getAttributes())
                .appendListQueryParam(
                        "attributeSets",
                        request.getAttributeSets(),
                        com.oracle.bmc.util.internal.CollectionFormatType.Multi)
                .appendQueryParam("page", request.getPage())
                .appendQueryParam("limit", request.getLimit())
                .accept("application/json, application/scim+json")
                .appendHeader("authorization", request.getAuthorization())
                .appendHeader(
                        "resource_type_schema_version", request.getResourceTypeSchemaVersion())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .handleBody(
                        com.oracle.bmc.identitydomains.model.PasswordPolicies.class,
                        ListPasswordPoliciesResponse.Builder::passwordPolicies)
                .handleResponseHeaderString(
                        "opc-request-id", ListPasswordPoliciesResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListPasswordPoliciesResponse.Builder::opcNextPage)
                .callSync();
    }

    @Override
    public ListPoliciesResponse listPolicies(ListPoliciesRequest request) {

        return clientCall(request, ListPoliciesResponse::builder)
                .logger(LOG, "listPolicies")
                .serviceDetails(
                        "IdentityDomains",
                        "ListPolicies",
                        "https://docs.oracle.com/iaas/api/#/en/identity-domains/v1/Policy/ListPolicies")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListPoliciesRequest::builder)
                .basePath("")
                .appendPathParam("admin")
                .appendPathParam("v1")
                .appendPathParam("Policies")
                .appendQueryParam("filter", request.getFilter())
                .appendQueryParam("sortBy", request.getSortBy())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .appendQueryParam("startIndex", request.getStartIndex())
                .appendQueryParam("count", request.getCount())
                .appendQueryParam("attributes", request.getAttributes())
                .appendListQueryParam(
                        "attributeSets",
                        request.getAttributeSets(),
                        com.oracle.bmc.util.internal.CollectionFormatType.Multi)
                .appendQueryParam("page", request.getPage())
                .appendQueryParam("limit", request.getLimit())
                .accept("application/json, application/scim+json")
                .appendHeader("authorization", request.getAuthorization())
                .appendHeader(
                        "resource_type_schema_version", request.getResourceTypeSchemaVersion())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .handleBody(
                        com.oracle.bmc.identitydomains.model.Policies.class,
                        ListPoliciesResponse.Builder::policies)
                .handleResponseHeaderString(
                        "opc-request-id", ListPoliciesResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListPoliciesResponse.Builder::opcNextPage)
                .callSync();
    }

    @Override
    public ListResourceTypeSchemaAttributesResponse listResourceTypeSchemaAttributes(
            ListResourceTypeSchemaAttributesRequest request) {

        return clientCall(request, ListResourceTypeSchemaAttributesResponse::builder)
                .logger(LOG, "listResourceTypeSchemaAttributes")
                .serviceDetails(
                        "IdentityDomains",
                        "ListResourceTypeSchemaAttributes",
                        "https://docs.oracle.com/iaas/api/#/en/identity-domains/v1/ResourceTypeSchemaAttributes/ListResourceTypeSchemaAttributes")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListResourceTypeSchemaAttributesRequest::builder)
                .basePath("")
                .appendPathParam("admin")
                .appendPathParam("v1")
                .appendPathParam("ResourceTypeSchemaAttributes")
                .appendQueryParam("filter", request.getFilter())
                .appendQueryParam("sortBy", request.getSortBy())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .appendQueryParam("startIndex", request.getStartIndex())
                .appendQueryParam("count", request.getCount())
                .appendQueryParam("attributes", request.getAttributes())
                .appendListQueryParam(
                        "attributeSets",
                        request.getAttributeSets(),
                        com.oracle.bmc.util.internal.CollectionFormatType.Multi)
                .appendQueryParam("page", request.getPage())
                .appendQueryParam("limit", request.getLimit())
                .accept("application/json, application/scim+json")
                .appendHeader("authorization", request.getAuthorization())
                .appendHeader(
                        "resource_type_schema_version", request.getResourceTypeSchemaVersion())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .handleBody(
                        com.oracle.bmc.identitydomains.model.ResourceTypeSchemaAttributes.class,
                        ListResourceTypeSchemaAttributesResponse.Builder
                                ::resourceTypeSchemaAttributes)
                .handleResponseHeaderString(
                        "opc-request-id",
                        ListResourceTypeSchemaAttributesResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page",
                        ListResourceTypeSchemaAttributesResponse.Builder::opcNextPage)
                .callSync();
    }

    @Override
    public ListRulesResponse listRules(ListRulesRequest request) {

        return clientCall(request, ListRulesResponse::builder)
                .logger(LOG, "listRules")
                .serviceDetails(
                        "IdentityDomains",
                        "ListRules",
                        "https://docs.oracle.com/iaas/api/#/en/identity-domains/v1/Rule/ListRules")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListRulesRequest::builder)
                .basePath("")
                .appendPathParam("admin")
                .appendPathParam("v1")
                .appendPathParam("Rules")
                .appendQueryParam("filter", request.getFilter())
                .appendQueryParam("sortBy", request.getSortBy())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .appendQueryParam("startIndex", request.getStartIndex())
                .appendQueryParam("count", request.getCount())
                .appendQueryParam("attributes", request.getAttributes())
                .appendListQueryParam(
                        "attributeSets",
                        request.getAttributeSets(),
                        com.oracle.bmc.util.internal.CollectionFormatType.Multi)
                .appendQueryParam("page", request.getPage())
                .appendQueryParam("limit", request.getLimit())
                .accept("application/json, application/scim+json")
                .appendHeader("authorization", request.getAuthorization())
                .appendHeader(
                        "resource_type_schema_version", request.getResourceTypeSchemaVersion())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .handleBody(
                        com.oracle.bmc.identitydomains.model.Rules.class,
                        ListRulesResponse.Builder::rules)
                .handleResponseHeaderString(
                        "opc-request-id", ListRulesResponse.Builder::opcRequestId)
                .handleResponseHeaderString("opc-next-page", ListRulesResponse.Builder::opcNextPage)
                .callSync();
    }

    @Override
    public ListSchemasResponse listSchemas(ListSchemasRequest request) {

        return clientCall(request, ListSchemasResponse::builder)
                .logger(LOG, "listSchemas")
                .serviceDetails(
                        "IdentityDomains",
                        "ListSchemas",
                        "https://docs.oracle.com/iaas/api/#/en/identity-domains/v1/Schemas/ListSchemas")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListSchemasRequest::builder)
                .basePath("")
                .appendPathParam("admin")
                .appendPathParam("v1")
                .appendPathParam("Schemas")
                .appendQueryParam("sortBy", request.getSortBy())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .appendQueryParam("startIndex", request.getStartIndex())
                .appendQueryParam("count", request.getCount())
                .appendQueryParam("page", request.getPage())
                .appendQueryParam("limit", request.getLimit())
                .accept("application/json, application/scim+json")
                .appendHeader("authorization", request.getAuthorization())
                .appendHeader(
                        "resource_type_schema_version", request.getResourceTypeSchemaVersion())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .handleBody(
                        com.oracle.bmc.identitydomains.model.Schemas.class,
                        ListSchemasResponse.Builder::schemas)
                .handleResponseHeaderString(
                        "opc-request-id", ListSchemasResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListSchemasResponse.Builder::opcNextPage)
                .callSync();
    }

    @Override
    public ListSecurityQuestionSettingsResponse listSecurityQuestionSettings(
            ListSecurityQuestionSettingsRequest request) {

        return clientCall(request, ListSecurityQuestionSettingsResponse::builder)
                .logger(LOG, "listSecurityQuestionSettings")
                .serviceDetails(
                        "IdentityDomains",
                        "ListSecurityQuestionSettings",
                        "https://docs.oracle.com/iaas/api/#/en/identity-domains/v1/SecurityQuestionSettings/ListSecurityQuestionSettings")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListSecurityQuestionSettingsRequest::builder)
                .basePath("")
                .appendPathParam("admin")
                .appendPathParam("v1")
                .appendPathParam("SecurityQuestionSettings")
                .appendQueryParam("attributes", request.getAttributes())
                .appendListQueryParam(
                        "attributeSets",
                        request.getAttributeSets(),
                        com.oracle.bmc.util.internal.CollectionFormatType.Multi)
                .appendQueryParam("page", request.getPage())
                .appendQueryParam("limit", request.getLimit())
                .accept("application/json, application/scim+json")
                .appendHeader("authorization", request.getAuthorization())
                .appendHeader(
                        "resource_type_schema_version", request.getResourceTypeSchemaVersion())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .handleBody(
                        com.oracle.bmc.identitydomains.model.SecurityQuestionSettings.class,
                        ListSecurityQuestionSettingsResponse.Builder::securityQuestionSettings)
                .handleResponseHeaderString(
                        "opc-request-id",
                        ListSecurityQuestionSettingsResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListSecurityQuestionSettingsResponse.Builder::opcNextPage)
                .callSync();
    }

    @Override
    public ListSecurityQuestionsResponse listSecurityQuestions(
            ListSecurityQuestionsRequest request) {

        return clientCall(request, ListSecurityQuestionsResponse::builder)
                .logger(LOG, "listSecurityQuestions")
                .serviceDetails(
                        "IdentityDomains",
                        "ListSecurityQuestions",
                        "https://docs.oracle.com/iaas/api/#/en/identity-domains/v1/SecurityQuestions/ListSecurityQuestions")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListSecurityQuestionsRequest::builder)
                .basePath("")
                .appendPathParam("admin")
                .appendPathParam("v1")
                .appendPathParam("SecurityQuestions")
                .appendQueryParam("filter", request.getFilter())
                .appendQueryParam("sortBy", request.getSortBy())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .appendQueryParam("startIndex", request.getStartIndex())
                .appendQueryParam("count", request.getCount())
                .appendQueryParam("attributes", request.getAttributes())
                .appendListQueryParam(
                        "attributeSets",
                        request.getAttributeSets(),
                        com.oracle.bmc.util.internal.CollectionFormatType.Multi)
                .appendQueryParam("page", request.getPage())
                .appendQueryParam("limit", request.getLimit())
                .accept("application/json, application/scim+json")
                .appendHeader("authorization", request.getAuthorization())
                .appendHeader(
                        "resource_type_schema_version", request.getResourceTypeSchemaVersion())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .handleBody(
                        com.oracle.bmc.identitydomains.model.SecurityQuestions.class,
                        ListSecurityQuestionsResponse.Builder::securityQuestions)
                .handleResponseHeaderString(
                        "opc-request-id", ListSecurityQuestionsResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListSecurityQuestionsResponse.Builder::opcNextPage)
                .callSync();
    }

    @Override
    public ListSelfRegistrationProfilesResponse listSelfRegistrationProfiles(
            ListSelfRegistrationProfilesRequest request) {

        return clientCall(request, ListSelfRegistrationProfilesResponse::builder)
                .logger(LOG, "listSelfRegistrationProfiles")
                .serviceDetails(
                        "IdentityDomains",
                        "ListSelfRegistrationProfiles",
                        "https://docs.oracle.com/iaas/api/#/en/identity-domains/v1/SelfRegistrationProfiles/ListSelfRegistrationProfiles")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListSelfRegistrationProfilesRequest::builder)
                .basePath("")
                .appendPathParam("admin")
                .appendPathParam("v1")
                .appendPathParam("SelfRegistrationProfiles")
                .appendQueryParam("filter", request.getFilter())
                .appendQueryParam("sortBy", request.getSortBy())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .appendQueryParam("startIndex", request.getStartIndex())
                .appendQueryParam("count", request.getCount())
                .appendQueryParam("attributes", request.getAttributes())
                .appendListQueryParam(
                        "attributeSets",
                        request.getAttributeSets(),
                        com.oracle.bmc.util.internal.CollectionFormatType.Multi)
                .appendQueryParam("page", request.getPage())
                .appendQueryParam("limit", request.getLimit())
                .accept("application/json, application/scim+json")
                .appendHeader("authorization", request.getAuthorization())
                .appendHeader(
                        "resource_type_schema_version", request.getResourceTypeSchemaVersion())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .handleBody(
                        com.oracle.bmc.identitydomains.model.SelfRegistrationProfiles.class,
                        ListSelfRegistrationProfilesResponse.Builder::selfRegistrationProfiles)
                .handleResponseHeaderString(
                        "opc-request-id",
                        ListSelfRegistrationProfilesResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListSelfRegistrationProfilesResponse.Builder::opcNextPage)
                .callSync();
    }

    @Override
    public ListSettingsResponse listSettings(ListSettingsRequest request) {

        return clientCall(request, ListSettingsResponse::builder)
                .logger(LOG, "listSettings")
                .serviceDetails(
                        "IdentityDomains",
                        "ListSettings",
                        "https://docs.oracle.com/iaas/api/#/en/identity-domains/v1/Settings/ListSettings")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListSettingsRequest::builder)
                .basePath("")
                .appendPathParam("admin")
                .appendPathParam("v1")
                .appendPathParam("Settings")
                .appendQueryParam("attributes", request.getAttributes())
                .appendListQueryParam(
                        "attributeSets",
                        request.getAttributeSets(),
                        com.oracle.bmc.util.internal.CollectionFormatType.Multi)
                .appendQueryParam("page", request.getPage())
                .appendQueryParam("limit", request.getLimit())
                .accept("application/json, application/scim+json")
                .appendHeader("authorization", request.getAuthorization())
                .appendHeader(
                        "resource_type_schema_version", request.getResourceTypeSchemaVersion())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .handleBody(
                        com.oracle.bmc.identitydomains.model.Settings.class,
                        ListSettingsResponse.Builder::settings)
                .handleResponseHeaderString(
                        "opc-request-id", ListSettingsResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListSettingsResponse.Builder::opcNextPage)
                .callSync();
    }

    @Override
    public ListSmtpCredentialsResponse listSmtpCredentials(ListSmtpCredentialsRequest request) {

        return clientCall(request, ListSmtpCredentialsResponse::builder)
                .logger(LOG, "listSmtpCredentials")
                .serviceDetails(
                        "IdentityDomains",
                        "ListSmtpCredentials",
                        "https://docs.oracle.com/iaas/api/#/en/identity-domains/v1/SmtpCredentials/ListSmtpCredentials")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListSmtpCredentialsRequest::builder)
                .basePath("")
                .appendPathParam("admin")
                .appendPathParam("v1")
                .appendPathParam("SmtpCredentials")
                .appendQueryParam("filter", request.getFilter())
                .appendQueryParam("sortBy", request.getSortBy())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .appendQueryParam("startIndex", request.getStartIndex())
                .appendQueryParam("count", request.getCount())
                .appendQueryParam("attributes", request.getAttributes())
                .appendListQueryParam(
                        "attributeSets",
                        request.getAttributeSets(),
                        com.oracle.bmc.util.internal.CollectionFormatType.Multi)
                .appendQueryParam("page", request.getPage())
                .appendQueryParam("limit", request.getLimit())
                .accept("application/json, application/scim+json")
                .appendHeader("authorization", request.getAuthorization())
                .appendHeader(
                        "resource_type_schema_version", request.getResourceTypeSchemaVersion())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .handleBody(
                        com.oracle.bmc.identitydomains.model.SmtpCredentials.class,
                        ListSmtpCredentialsResponse.Builder::smtpCredentials)
                .handleResponseHeaderString(
                        "opc-request-id", ListSmtpCredentialsResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListSmtpCredentialsResponse.Builder::opcNextPage)
                .callSync();
    }

    @Override
    public ListSocialIdentityProvidersResponse listSocialIdentityProviders(
            ListSocialIdentityProvidersRequest request) {

        return clientCall(request, ListSocialIdentityProvidersResponse::builder)
                .logger(LOG, "listSocialIdentityProviders")
                .serviceDetails(
                        "IdentityDomains",
                        "ListSocialIdentityProviders",
                        "https://docs.oracle.com/iaas/api/#/en/identity-domains/v1/SocialIdentityProviders/ListSocialIdentityProviders")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListSocialIdentityProvidersRequest::builder)
                .basePath("")
                .appendPathParam("admin")
                .appendPathParam("v1")
                .appendPathParam("SocialIdentityProviders")
                .appendQueryParam("filter", request.getFilter())
                .appendQueryParam("sortBy", request.getSortBy())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .appendQueryParam("startIndex", request.getStartIndex())
                .appendQueryParam("count", request.getCount())
                .appendQueryParam("page", request.getPage())
                .appendQueryParam("limit", request.getLimit())
                .accept("application/json, application/scim+json")
                .appendHeader("authorization", request.getAuthorization())
                .appendHeader(
                        "resource_type_schema_version", request.getResourceTypeSchemaVersion())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .handleBody(
                        com.oracle.bmc.identitydomains.model.SocialIdentityProviders.class,
                        ListSocialIdentityProvidersResponse.Builder::socialIdentityProviders)
                .handleResponseHeaderString(
                        "opc-request-id", ListSocialIdentityProvidersResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListSocialIdentityProvidersResponse.Builder::opcNextPage)
                .callSync();
    }

    @Override
    public ListUserAttributesSettingsResponse listUserAttributesSettings(
            ListUserAttributesSettingsRequest request) {

        return clientCall(request, ListUserAttributesSettingsResponse::builder)
                .logger(LOG, "listUserAttributesSettings")
                .serviceDetails(
                        "IdentityDomains",
                        "ListUserAttributesSettings",
                        "https://docs.oracle.com/iaas/api/#/en/identity-domains/v1/UserAttributesSetting/ListUserAttributesSettings")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListUserAttributesSettingsRequest::builder)
                .basePath("")
                .appendPathParam("admin")
                .appendPathParam("v1")
                .appendPathParam("UserAttributesSettings")
                .appendQueryParam("attributes", request.getAttributes())
                .appendListQueryParam(
                        "attributeSets",
                        request.getAttributeSets(),
                        com.oracle.bmc.util.internal.CollectionFormatType.Multi)
                .appendQueryParam("page", request.getPage())
                .appendQueryParam("limit", request.getLimit())
                .accept("application/json, application/scim+json")
                .appendHeader("authorization", request.getAuthorization())
                .appendHeader(
                        "resource_type_schema_version", request.getResourceTypeSchemaVersion())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .handleBody(
                        com.oracle.bmc.identitydomains.model.UserAttributesSettings.class,
                        ListUserAttributesSettingsResponse.Builder::userAttributesSettings)
                .handleResponseHeaderString(
                        "opc-request-id", ListUserAttributesSettingsResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListUserAttributesSettingsResponse.Builder::opcNextPage)
                .callSync();
    }

    @Override
    public ListUserDbCredentialsResponse listUserDbCredentials(
            ListUserDbCredentialsRequest request) {

        return clientCall(request, ListUserDbCredentialsResponse::builder)
                .logger(LOG, "listUserDbCredentials")
                .serviceDetails(
                        "IdentityDomains",
                        "ListUserDbCredentials",
                        "https://docs.oracle.com/iaas/api/#/en/identity-domains/v1/UserDbCredentials/ListUserDbCredentials")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListUserDbCredentialsRequest::builder)
                .basePath("")
                .appendPathParam("admin")
                .appendPathParam("v1")
                .appendPathParam("UserDbCredentials")
                .appendQueryParam("filter", request.getFilter())
                .appendQueryParam("sortBy", request.getSortBy())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .appendQueryParam("startIndex", request.getStartIndex())
                .appendQueryParam("count", request.getCount())
                .appendQueryParam("attributes", request.getAttributes())
                .appendListQueryParam(
                        "attributeSets",
                        request.getAttributeSets(),
                        com.oracle.bmc.util.internal.CollectionFormatType.Multi)
                .appendQueryParam("page", request.getPage())
                .appendQueryParam("limit", request.getLimit())
                .accept("application/json, application/scim+json")
                .appendHeader("authorization", request.getAuthorization())
                .appendHeader(
                        "resource_type_schema_version", request.getResourceTypeSchemaVersion())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .handleBody(
                        com.oracle.bmc.identitydomains.model.UserDbCredentials.class,
                        ListUserDbCredentialsResponse.Builder::userDbCredentials)
                .handleResponseHeaderString(
                        "opc-request-id", ListUserDbCredentialsResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListUserDbCredentialsResponse.Builder::opcNextPage)
                .callSync();
    }

    @Override
    public ListUsersResponse listUsers(ListUsersRequest request) {

        return clientCall(request, ListUsersResponse::builder)
                .logger(LOG, "listUsers")
                .serviceDetails(
                        "IdentityDomains",
                        "ListUsers",
                        "https://docs.oracle.com/iaas/api/#/en/identity-domains/v1/Users/ListUsers")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListUsersRequest::builder)
                .basePath("")
                .appendPathParam("admin")
                .appendPathParam("v1")
                .appendPathParam("Users")
                .appendQueryParam("filter", request.getFilter())
                .appendQueryParam("sortBy", request.getSortBy())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .appendQueryParam("startIndex", request.getStartIndex())
                .appendQueryParam("count", request.getCount())
                .appendQueryParam("attributes", request.getAttributes())
                .appendListQueryParam(
                        "attributeSets",
                        request.getAttributeSets(),
                        com.oracle.bmc.util.internal.CollectionFormatType.Multi)
                .appendQueryParam("page", request.getPage())
                .appendQueryParam("limit", request.getLimit())
                .accept("application/json, application/scim+json")
                .appendHeader("authorization", request.getAuthorization())
                .appendHeader(
                        "resource_type_schema_version", request.getResourceTypeSchemaVersion())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .handleBody(
                        com.oracle.bmc.identitydomains.model.Users.class,
                        ListUsersResponse.Builder::users)
                .handleResponseHeaderString(
                        "opc-request-id", ListUsersResponse.Builder::opcRequestId)
                .handleResponseHeaderString("opc-next-page", ListUsersResponse.Builder::opcNextPage)
                .callSync();
    }

    @Override
    public PatchAccountRecoverySettingResponse patchAccountRecoverySetting(
            PatchAccountRecoverySettingRequest request) {

        Validate.notBlank(
                request.getAccountRecoverySettingId(),
                "accountRecoverySettingId must not be blank");

        return clientCall(request, PatchAccountRecoverySettingResponse::builder)
                .logger(LOG, "patchAccountRecoverySetting")
                .serviceDetails(
                        "IdentityDomains",
                        "PatchAccountRecoverySetting",
                        "https://docs.oracle.com/iaas/api/#/en/identity-domains/v1/AccountRecoverySetting/PatchAccountRecoverySetting")
                .method(com.oracle.bmc.http.client.Method.PATCH)
                .requestBuilder(PatchAccountRecoverySettingRequest::builder)
                .basePath("")
                .appendPathParam("admin")
                .appendPathParam("v1")
                .appendPathParam("AccountRecoverySettings")
                .appendPathParam(request.getAccountRecoverySettingId())
                .appendQueryParam("attributes", request.getAttributes())
                .appendListQueryParam(
                        "attributeSets",
                        request.getAttributeSets(),
                        com.oracle.bmc.util.internal.CollectionFormatType.Multi)
                .accept("application/json, application/scim+json")
                .appendHeader("authorization", request.getAuthorization())
                .appendHeader(
                        "resource_type_schema_version", request.getResourceTypeSchemaVersion())
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.identitydomains.model.AccountRecoverySetting.class,
                        PatchAccountRecoverySettingResponse.Builder::accountRecoverySetting)
                .handleResponseHeaderString(
                        "opc-request-id", PatchAccountRecoverySettingResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "etag", PatchAccountRecoverySettingResponse.Builder::etag)
                .callSync();
    }

    @Override
    public PatchApiKeyResponse patchApiKey(PatchApiKeyRequest request) {

        Validate.notBlank(request.getApiKeyId(), "apiKeyId must not be blank");

        return clientCall(request, PatchApiKeyResponse::builder)
                .logger(LOG, "patchApiKey")
                .serviceDetails(
                        "IdentityDomains",
                        "PatchApiKey",
                        "https://docs.oracle.com/iaas/api/#/en/identity-domains/v1/ApiKey/PatchApiKey")
                .method(com.oracle.bmc.http.client.Method.PATCH)
                .requestBuilder(PatchApiKeyRequest::builder)
                .basePath("")
                .appendPathParam("admin")
                .appendPathParam("v1")
                .appendPathParam("ApiKeys")
                .appendPathParam(request.getApiKeyId())
                .appendQueryParam("attributes", request.getAttributes())
                .appendListQueryParam(
                        "attributeSets",
                        request.getAttributeSets(),
                        com.oracle.bmc.util.internal.CollectionFormatType.Multi)
                .accept("application/json, application/scim+json")
                .appendHeader("authorization", request.getAuthorization())
                .appendHeader(
                        "resource_type_schema_version", request.getResourceTypeSchemaVersion())
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.identitydomains.model.ApiKey.class,
                        PatchApiKeyResponse.Builder::apiKey)
                .handleResponseHeaderString(
                        "opc-request-id", PatchApiKeyResponse.Builder::opcRequestId)
                .handleResponseHeaderString("etag", PatchApiKeyResponse.Builder::etag)
                .callSync();
    }

    @Override
    public PatchAppResponse patchApp(PatchAppRequest request) {

        Validate.notBlank(request.getAppId(), "appId must not be blank");

        return clientCall(request, PatchAppResponse::builder)
                .logger(LOG, "patchApp")
                .serviceDetails(
                        "IdentityDomains",
                        "PatchApp",
                        "https://docs.oracle.com/iaas/api/#/en/identity-domains/v1/App/PatchApp")
                .method(com.oracle.bmc.http.client.Method.PATCH)
                .requestBuilder(PatchAppRequest::builder)
                .basePath("")
                .appendPathParam("admin")
                .appendPathParam("v1")
                .appendPathParam("Apps")
                .appendPathParam(request.getAppId())
                .appendQueryParam("attributes", request.getAttributes())
                .appendListQueryParam(
                        "attributeSets",
                        request.getAttributeSets(),
                        com.oracle.bmc.util.internal.CollectionFormatType.Multi)
                .accept("application/json, application/scim+json")
                .appendHeader("authorization", request.getAuthorization())
                .appendHeader(
                        "resource_type_schema_version", request.getResourceTypeSchemaVersion())
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.identitydomains.model.App.class,
                        PatchAppResponse.Builder::app)
                .handleResponseHeaderString(
                        "opc-request-id", PatchAppResponse.Builder::opcRequestId)
                .handleResponseHeaderString("etag", PatchAppResponse.Builder::etag)
                .callSync();
    }

    @Override
    public PatchAppRoleResponse patchAppRole(PatchAppRoleRequest request) {

        Validate.notBlank(request.getAppRoleId(), "appRoleId must not be blank");

        return clientCall(request, PatchAppRoleResponse::builder)
                .logger(LOG, "patchAppRole")
                .serviceDetails(
                        "IdentityDomains",
                        "PatchAppRole",
                        "https://docs.oracle.com/iaas/api/#/en/identity-domains/v1/AppRole/PatchAppRole")
                .method(com.oracle.bmc.http.client.Method.PATCH)
                .requestBuilder(PatchAppRoleRequest::builder)
                .basePath("")
                .appendPathParam("admin")
                .appendPathParam("v1")
                .appendPathParam("AppRoles")
                .appendPathParam(request.getAppRoleId())
                .appendQueryParam("attributes", request.getAttributes())
                .appendListQueryParam(
                        "attributeSets",
                        request.getAttributeSets(),
                        com.oracle.bmc.util.internal.CollectionFormatType.Multi)
                .accept("application/json, application/scim+json")
                .appendHeader("authorization", request.getAuthorization())
                .appendHeader(
                        "resource_type_schema_version", request.getResourceTypeSchemaVersion())
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.identitydomains.model.AppRole.class,
                        PatchAppRoleResponse.Builder::appRole)
                .handleResponseHeaderString(
                        "opc-request-id", PatchAppRoleResponse.Builder::opcRequestId)
                .handleResponseHeaderString("etag", PatchAppRoleResponse.Builder::etag)
                .callSync();
    }

    @Override
    public PatchApprovalWorkflowResponse patchApprovalWorkflow(
            PatchApprovalWorkflowRequest request) {

        Validate.notBlank(request.getApprovalWorkflowId(), "approvalWorkflowId must not be blank");

        return clientCall(request, PatchApprovalWorkflowResponse::builder)
                .logger(LOG, "patchApprovalWorkflow")
                .serviceDetails(
                        "IdentityDomains",
                        "PatchApprovalWorkflow",
                        "https://docs.oracle.com/iaas/api/#/en/identity-domains/v1/ApprovalWorkflow/PatchApprovalWorkflow")
                .method(com.oracle.bmc.http.client.Method.PATCH)
                .requestBuilder(PatchApprovalWorkflowRequest::builder)
                .basePath("")
                .appendPathParam("admin")
                .appendPathParam("v1")
                .appendPathParam("ApprovalWorkflows")
                .appendPathParam(request.getApprovalWorkflowId())
                .appendQueryParam("attributes", request.getAttributes())
                .appendListQueryParam(
                        "attributeSets",
                        request.getAttributeSets(),
                        com.oracle.bmc.util.internal.CollectionFormatType.Multi)
                .accept("application/json, application/scim+json")
                .appendHeader("authorization", request.getAuthorization())
                .appendHeader(
                        "resource_type_schema_version", request.getResourceTypeSchemaVersion())
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.identitydomains.model.ApprovalWorkflow.class,
                        PatchApprovalWorkflowResponse.Builder::approvalWorkflow)
                .handleResponseHeaderString(
                        "opc-request-id", PatchApprovalWorkflowResponse.Builder::opcRequestId)
                .handleResponseHeaderString("etag", PatchApprovalWorkflowResponse.Builder::etag)
                .callSync();
    }

    @Override
    public PatchApprovalWorkflowStepResponse patchApprovalWorkflowStep(
            PatchApprovalWorkflowStepRequest request) {

        Validate.notBlank(
                request.getApprovalWorkflowStepId(), "approvalWorkflowStepId must not be blank");

        return clientCall(request, PatchApprovalWorkflowStepResponse::builder)
                .logger(LOG, "patchApprovalWorkflowStep")
                .serviceDetails(
                        "IdentityDomains",
                        "PatchApprovalWorkflowStep",
                        "https://docs.oracle.com/iaas/api/#/en/identity-domains/v1/ApprovalWorkflowStep/PatchApprovalWorkflowStep")
                .method(com.oracle.bmc.http.client.Method.PATCH)
                .requestBuilder(PatchApprovalWorkflowStepRequest::builder)
                .basePath("")
                .appendPathParam("admin")
                .appendPathParam("v1")
                .appendPathParam("ApprovalWorkflowSteps")
                .appendPathParam(request.getApprovalWorkflowStepId())
                .appendQueryParam("attributes", request.getAttributes())
                .appendListQueryParam(
                        "attributeSets",
                        request.getAttributeSets(),
                        com.oracle.bmc.util.internal.CollectionFormatType.Multi)
                .accept("application/json, application/scim+json")
                .appendHeader("authorization", request.getAuthorization())
                .appendHeader(
                        "resource_type_schema_version", request.getResourceTypeSchemaVersion())
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.identitydomains.model.ApprovalWorkflowStep.class,
                        PatchApprovalWorkflowStepResponse.Builder::approvalWorkflowStep)
                .handleResponseHeaderString(
                        "opc-request-id", PatchApprovalWorkflowStepResponse.Builder::opcRequestId)
                .handleResponseHeaderString("etag", PatchApprovalWorkflowStepResponse.Builder::etag)
                .callSync();
    }

    @Override
    public PatchAuthTokenResponse patchAuthToken(PatchAuthTokenRequest request) {

        Validate.notBlank(request.getAuthTokenId(), "authTokenId must not be blank");

        return clientCall(request, PatchAuthTokenResponse::builder)
                .logger(LOG, "patchAuthToken")
                .serviceDetails(
                        "IdentityDomains",
                        "PatchAuthToken",
                        "https://docs.oracle.com/iaas/api/#/en/identity-domains/v1/AuthToken/PatchAuthToken")
                .method(com.oracle.bmc.http.client.Method.PATCH)
                .requestBuilder(PatchAuthTokenRequest::builder)
                .basePath("")
                .appendPathParam("admin")
                .appendPathParam("v1")
                .appendPathParam("AuthTokens")
                .appendPathParam(request.getAuthTokenId())
                .appendQueryParam("attributes", request.getAttributes())
                .appendListQueryParam(
                        "attributeSets",
                        request.getAttributeSets(),
                        com.oracle.bmc.util.internal.CollectionFormatType.Multi)
                .accept("application/json, application/scim+json")
                .appendHeader("authorization", request.getAuthorization())
                .appendHeader(
                        "resource_type_schema_version", request.getResourceTypeSchemaVersion())
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.identitydomains.model.AuthToken.class,
                        PatchAuthTokenResponse.Builder::authToken)
                .handleResponseHeaderString(
                        "opc-request-id", PatchAuthTokenResponse.Builder::opcRequestId)
                .handleResponseHeaderString("etag", PatchAuthTokenResponse.Builder::etag)
                .callSync();
    }

    @Override
    public PatchCloudGateResponse patchCloudGate(PatchCloudGateRequest request) {

        Validate.notBlank(request.getCloudGateId(), "cloudGateId must not be blank");

        return clientCall(request, PatchCloudGateResponse::builder)
                .logger(LOG, "patchCloudGate")
                .serviceDetails(
                        "IdentityDomains",
                        "PatchCloudGate",
                        "https://docs.oracle.com/iaas/api/#/en/identity-domains/v1/CloudGate/PatchCloudGate")
                .method(com.oracle.bmc.http.client.Method.PATCH)
                .requestBuilder(PatchCloudGateRequest::builder)
                .basePath("")
                .appendPathParam("admin")
                .appendPathParam("v1")
                .appendPathParam("CloudGates")
                .appendPathParam(request.getCloudGateId())
                .appendQueryParam("attributes", request.getAttributes())
                .appendListQueryParam(
                        "attributeSets",
                        request.getAttributeSets(),
                        com.oracle.bmc.util.internal.CollectionFormatType.Multi)
                .accept("application/json, application/scim+json")
                .appendHeader("authorization", request.getAuthorization())
                .appendHeader(
                        "resource_type_schema_version", request.getResourceTypeSchemaVersion())
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.identitydomains.model.CloudGate.class,
                        PatchCloudGateResponse.Builder::cloudGate)
                .handleResponseHeaderString(
                        "opc-request-id", PatchCloudGateResponse.Builder::opcRequestId)
                .handleResponseHeaderString("etag", PatchCloudGateResponse.Builder::etag)
                .callSync();
    }

    @Override
    public PatchCloudGateMappingResponse patchCloudGateMapping(
            PatchCloudGateMappingRequest request) {

        Validate.notBlank(request.getCloudGateMappingId(), "cloudGateMappingId must not be blank");

        return clientCall(request, PatchCloudGateMappingResponse::builder)
                .logger(LOG, "patchCloudGateMapping")
                .serviceDetails(
                        "IdentityDomains",
                        "PatchCloudGateMapping",
                        "https://docs.oracle.com/iaas/api/#/en/identity-domains/v1/CloudGateMapping/PatchCloudGateMapping")
                .method(com.oracle.bmc.http.client.Method.PATCH)
                .requestBuilder(PatchCloudGateMappingRequest::builder)
                .basePath("")
                .appendPathParam("admin")
                .appendPathParam("v1")
                .appendPathParam("CloudGateMappings")
                .appendPathParam(request.getCloudGateMappingId())
                .appendQueryParam("attributes", request.getAttributes())
                .appendListQueryParam(
                        "attributeSets",
                        request.getAttributeSets(),
                        com.oracle.bmc.util.internal.CollectionFormatType.Multi)
                .accept("application/json, application/scim+json")
                .appendHeader("authorization", request.getAuthorization())
                .appendHeader(
                        "resource_type_schema_version", request.getResourceTypeSchemaVersion())
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.identitydomains.model.CloudGateMapping.class,
                        PatchCloudGateMappingResponse.Builder::cloudGateMapping)
                .handleResponseHeaderString(
                        "opc-request-id", PatchCloudGateMappingResponse.Builder::opcRequestId)
                .handleResponseHeaderString("etag", PatchCloudGateMappingResponse.Builder::etag)
                .callSync();
    }

    @Override
    public PatchCloudGateServerResponse patchCloudGateServer(PatchCloudGateServerRequest request) {

        Validate.notBlank(request.getCloudGateServerId(), "cloudGateServerId must not be blank");

        return clientCall(request, PatchCloudGateServerResponse::builder)
                .logger(LOG, "patchCloudGateServer")
                .serviceDetails(
                        "IdentityDomains",
                        "PatchCloudGateServer",
                        "https://docs.oracle.com/iaas/api/#/en/identity-domains/v1/CloudGateServer/PatchCloudGateServer")
                .method(com.oracle.bmc.http.client.Method.PATCH)
                .requestBuilder(PatchCloudGateServerRequest::builder)
                .basePath("")
                .appendPathParam("admin")
                .appendPathParam("v1")
                .appendPathParam("CloudGateServers")
                .appendPathParam(request.getCloudGateServerId())
                .appendQueryParam("attributes", request.getAttributes())
                .appendListQueryParam(
                        "attributeSets",
                        request.getAttributeSets(),
                        com.oracle.bmc.util.internal.CollectionFormatType.Multi)
                .accept("application/json, application/scim+json")
                .appendHeader("authorization", request.getAuthorization())
                .appendHeader(
                        "resource_type_schema_version", request.getResourceTypeSchemaVersion())
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.identitydomains.model.CloudGateServer.class,
                        PatchCloudGateServerResponse.Builder::cloudGateServer)
                .handleResponseHeaderString(
                        "opc-request-id", PatchCloudGateServerResponse.Builder::opcRequestId)
                .handleResponseHeaderString("etag", PatchCloudGateServerResponse.Builder::etag)
                .callSync();
    }

    @Override
    public PatchConditionResponse patchCondition(PatchConditionRequest request) {

        Validate.notBlank(request.getConditionId(), "conditionId must not be blank");

        return clientCall(request, PatchConditionResponse::builder)
                .logger(LOG, "patchCondition")
                .serviceDetails(
                        "IdentityDomains",
                        "PatchCondition",
                        "https://docs.oracle.com/iaas/api/#/en/identity-domains/v1/Condition/PatchCondition")
                .method(com.oracle.bmc.http.client.Method.PATCH)
                .requestBuilder(PatchConditionRequest::builder)
                .basePath("")
                .appendPathParam("admin")
                .appendPathParam("v1")
                .appendPathParam("Conditions")
                .appendPathParam(request.getConditionId())
                .appendQueryParam("attributes", request.getAttributes())
                .appendListQueryParam(
                        "attributeSets",
                        request.getAttributeSets(),
                        com.oracle.bmc.util.internal.CollectionFormatType.Multi)
                .accept("application/json, application/scim+json")
                .appendHeader("authorization", request.getAuthorization())
                .appendHeader(
                        "resource_type_schema_version", request.getResourceTypeSchemaVersion())
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.identitydomains.model.Condition.class,
                        PatchConditionResponse.Builder::condition)
                .handleResponseHeaderString(
                        "opc-request-id", PatchConditionResponse.Builder::opcRequestId)
                .handleResponseHeaderString("etag", PatchConditionResponse.Builder::etag)
                .callSync();
    }

    @Override
    public PatchCustomerSecretKeyResponse patchCustomerSecretKey(
            PatchCustomerSecretKeyRequest request) {

        Validate.notBlank(
                request.getCustomerSecretKeyId(), "customerSecretKeyId must not be blank");

        return clientCall(request, PatchCustomerSecretKeyResponse::builder)
                .logger(LOG, "patchCustomerSecretKey")
                .serviceDetails(
                        "IdentityDomains",
                        "PatchCustomerSecretKey",
                        "https://docs.oracle.com/iaas/api/#/en/identity-domains/v1/CustomerSecretKey/PatchCustomerSecretKey")
                .method(com.oracle.bmc.http.client.Method.PATCH)
                .requestBuilder(PatchCustomerSecretKeyRequest::builder)
                .basePath("")
                .appendPathParam("admin")
                .appendPathParam("v1")
                .appendPathParam("CustomerSecretKeys")
                .appendPathParam(request.getCustomerSecretKeyId())
                .appendQueryParam("attributes", request.getAttributes())
                .appendListQueryParam(
                        "attributeSets",
                        request.getAttributeSets(),
                        com.oracle.bmc.util.internal.CollectionFormatType.Multi)
                .accept("application/json, application/scim+json")
                .appendHeader("authorization", request.getAuthorization())
                .appendHeader(
                        "resource_type_schema_version", request.getResourceTypeSchemaVersion())
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.identitydomains.model.CustomerSecretKey.class,
                        PatchCustomerSecretKeyResponse.Builder::customerSecretKey)
                .handleResponseHeaderString(
                        "opc-request-id", PatchCustomerSecretKeyResponse.Builder::opcRequestId)
                .handleResponseHeaderString("etag", PatchCustomerSecretKeyResponse.Builder::etag)
                .callSync();
    }

    @Override
    public PatchDynamicResourceGroupResponse patchDynamicResourceGroup(
            PatchDynamicResourceGroupRequest request) {

        Validate.notBlank(
                request.getDynamicResourceGroupId(), "dynamicResourceGroupId must not be blank");

        return clientCall(request, PatchDynamicResourceGroupResponse::builder)
                .logger(LOG, "patchDynamicResourceGroup")
                .serviceDetails(
                        "IdentityDomains",
                        "PatchDynamicResourceGroup",
                        "https://docs.oracle.com/iaas/api/#/en/identity-domains/v1/DynamicResourceGroup/PatchDynamicResourceGroup")
                .method(com.oracle.bmc.http.client.Method.PATCH)
                .requestBuilder(PatchDynamicResourceGroupRequest::builder)
                .basePath("")
                .appendPathParam("admin")
                .appendPathParam("v1")
                .appendPathParam("DynamicResourceGroups")
                .appendPathParam(request.getDynamicResourceGroupId())
                .appendQueryParam("attributes", request.getAttributes())
                .appendListQueryParam(
                        "attributeSets",
                        request.getAttributeSets(),
                        com.oracle.bmc.util.internal.CollectionFormatType.Multi)
                .accept("application/json, application/scim+json")
                .appendHeader("authorization", request.getAuthorization())
                .appendHeader(
                        "resource_type_schema_version", request.getResourceTypeSchemaVersion())
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.identitydomains.model.DynamicResourceGroup.class,
                        PatchDynamicResourceGroupResponse.Builder::dynamicResourceGroup)
                .handleResponseHeaderString(
                        "opc-request-id", PatchDynamicResourceGroupResponse.Builder::opcRequestId)
                .handleResponseHeaderString("etag", PatchDynamicResourceGroupResponse.Builder::etag)
                .callSync();
    }

    @Override
    public PatchGrantResponse patchGrant(PatchGrantRequest request) {

        Validate.notBlank(request.getGrantId(), "grantId must not be blank");

        return clientCall(request, PatchGrantResponse::builder)
                .logger(LOG, "patchGrant")
                .serviceDetails(
                        "IdentityDomains",
                        "PatchGrant",
                        "https://docs.oracle.com/iaas/api/#/en/identity-domains/v1/Grant/PatchGrant")
                .method(com.oracle.bmc.http.client.Method.PATCH)
                .requestBuilder(PatchGrantRequest::builder)
                .basePath("")
                .appendPathParam("admin")
                .appendPathParam("v1")
                .appendPathParam("Grants")
                .appendPathParam(request.getGrantId())
                .appendQueryParam("attributes", request.getAttributes())
                .appendListQueryParam(
                        "attributeSets",
                        request.getAttributeSets(),
                        com.oracle.bmc.util.internal.CollectionFormatType.Multi)
                .accept("application/json, application/scim+json")
                .appendHeader("authorization", request.getAuthorization())
                .appendHeader(
                        "resource_type_schema_version", request.getResourceTypeSchemaVersion())
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.identitydomains.model.Grant.class,
                        PatchGrantResponse.Builder::grant)
                .handleResponseHeaderString(
                        "opc-request-id", PatchGrantResponse.Builder::opcRequestId)
                .handleResponseHeaderString("etag", PatchGrantResponse.Builder::etag)
                .callSync();
    }

    @Override
    public PatchGroupResponse patchGroup(PatchGroupRequest request) {

        Validate.notBlank(request.getGroupId(), "groupId must not be blank");

        return clientCall(request, PatchGroupResponse::builder)
                .logger(LOG, "patchGroup")
                .serviceDetails(
                        "IdentityDomains",
                        "PatchGroup",
                        "https://docs.oracle.com/iaas/api/#/en/identity-domains/v1/Group/PatchGroup")
                .method(com.oracle.bmc.http.client.Method.PATCH)
                .requestBuilder(PatchGroupRequest::builder)
                .basePath("")
                .appendPathParam("admin")
                .appendPathParam("v1")
                .appendPathParam("Groups")
                .appendPathParam(request.getGroupId())
                .appendQueryParam("attributes", request.getAttributes())
                .appendListQueryParam(
                        "attributeSets",
                        request.getAttributeSets(),
                        com.oracle.bmc.util.internal.CollectionFormatType.Multi)
                .accept("application/json, application/scim+json")
                .appendHeader("authorization", request.getAuthorization())
                .appendHeader(
                        "resource_type_schema_version", request.getResourceTypeSchemaVersion())
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.identitydomains.model.Group.class,
                        PatchGroupResponse.Builder::group)
                .handleResponseHeaderString(
                        "opc-request-id", PatchGroupResponse.Builder::opcRequestId)
                .handleResponseHeaderString("etag", PatchGroupResponse.Builder::etag)
                .callSync();
    }

    @Override
    public PatchIdentityPropagationTrustResponse patchIdentityPropagationTrust(
            PatchIdentityPropagationTrustRequest request) {

        Validate.notBlank(
                request.getIdentityPropagationTrustId(),
                "identityPropagationTrustId must not be blank");

        return clientCall(request, PatchIdentityPropagationTrustResponse::builder)
                .logger(LOG, "patchIdentityPropagationTrust")
                .serviceDetails(
                        "IdentityDomains",
                        "PatchIdentityPropagationTrust",
                        "https://docs.oracle.com/iaas/api/#/en/identity-domains/v1/IdentityPropagationTrust/PatchIdentityPropagationTrust")
                .method(com.oracle.bmc.http.client.Method.PATCH)
                .requestBuilder(PatchIdentityPropagationTrustRequest::builder)
                .basePath("")
                .appendPathParam("admin")
                .appendPathParam("v1")
                .appendPathParam("IdentityPropagationTrusts")
                .appendPathParam(request.getIdentityPropagationTrustId())
                .appendQueryParam("attributes", request.getAttributes())
                .appendListQueryParam(
                        "attributeSets",
                        request.getAttributeSets(),
                        com.oracle.bmc.util.internal.CollectionFormatType.Multi)
                .accept("application/json, application/scim+json")
                .appendHeader("authorization", request.getAuthorization())
                .appendHeader(
                        "resource_type_schema_version", request.getResourceTypeSchemaVersion())
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.identitydomains.model.IdentityPropagationTrust.class,
                        PatchIdentityPropagationTrustResponse.Builder::identityPropagationTrust)
                .handleResponseHeaderString(
                        "opc-request-id",
                        PatchIdentityPropagationTrustResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "etag", PatchIdentityPropagationTrustResponse.Builder::etag)
                .callSync();
    }

    @Override
    public PatchIdentityProviderResponse patchIdentityProvider(
            PatchIdentityProviderRequest request) {

        Validate.notBlank(request.getIdentityProviderId(), "identityProviderId must not be blank");

        return clientCall(request, PatchIdentityProviderResponse::builder)
                .logger(LOG, "patchIdentityProvider")
                .serviceDetails(
                        "IdentityDomains",
                        "PatchIdentityProvider",
                        "https://docs.oracle.com/iaas/api/#/en/identity-domains/v1/IdentityProvider/PatchIdentityProvider")
                .method(com.oracle.bmc.http.client.Method.PATCH)
                .requestBuilder(PatchIdentityProviderRequest::builder)
                .basePath("")
                .appendPathParam("admin")
                .appendPathParam("v1")
                .appendPathParam("IdentityProviders")
                .appendPathParam(request.getIdentityProviderId())
                .appendQueryParam("attributes", request.getAttributes())
                .appendListQueryParam(
                        "attributeSets",
                        request.getAttributeSets(),
                        com.oracle.bmc.util.internal.CollectionFormatType.Multi)
                .accept("application/json, application/scim+json")
                .appendHeader("authorization", request.getAuthorization())
                .appendHeader(
                        "resource_type_schema_version", request.getResourceTypeSchemaVersion())
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.identitydomains.model.IdentityProvider.class,
                        PatchIdentityProviderResponse.Builder::identityProvider)
                .handleResponseHeaderString(
                        "opc-request-id", PatchIdentityProviderResponse.Builder::opcRequestId)
                .handleResponseHeaderString("etag", PatchIdentityProviderResponse.Builder::etag)
                .callSync();
    }

    @Override
    public PatchIdentitySettingResponse patchIdentitySetting(PatchIdentitySettingRequest request) {

        Validate.notBlank(request.getIdentitySettingId(), "identitySettingId must not be blank");

        return clientCall(request, PatchIdentitySettingResponse::builder)
                .logger(LOG, "patchIdentitySetting")
                .serviceDetails(
                        "IdentityDomains",
                        "PatchIdentitySetting",
                        "https://docs.oracle.com/iaas/api/#/en/identity-domains/v1/IdentitySetting/PatchIdentitySetting")
                .method(com.oracle.bmc.http.client.Method.PATCH)
                .requestBuilder(PatchIdentitySettingRequest::builder)
                .basePath("")
                .appendPathParam("admin")
                .appendPathParam("v1")
                .appendPathParam("IdentitySettings")
                .appendPathParam(request.getIdentitySettingId())
                .appendQueryParam("attributes", request.getAttributes())
                .appendListQueryParam(
                        "attributeSets",
                        request.getAttributeSets(),
                        com.oracle.bmc.util.internal.CollectionFormatType.Multi)
                .accept("application/json, application/scim+json")
                .appendHeader("authorization", request.getAuthorization())
                .appendHeader(
                        "resource_type_schema_version", request.getResourceTypeSchemaVersion())
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.identitydomains.model.IdentitySetting.class,
                        PatchIdentitySettingResponse.Builder::identitySetting)
                .handleResponseHeaderString(
                        "opc-request-id", PatchIdentitySettingResponse.Builder::opcRequestId)
                .handleResponseHeaderString("etag", PatchIdentitySettingResponse.Builder::etag)
                .callSync();
    }

    @Override
    public PatchKmsiSettingResponse patchKmsiSetting(PatchKmsiSettingRequest request) {

        Validate.notBlank(request.getKmsiSettingId(), "kmsiSettingId must not be blank");

        return clientCall(request, PatchKmsiSettingResponse::builder)
                .logger(LOG, "patchKmsiSetting")
                .serviceDetails(
                        "IdentityDomains",
                        "PatchKmsiSetting",
                        "https://docs.oracle.com/iaas/api/#/en/identity-domains/v1/KmsiSetting/PatchKmsiSetting")
                .method(com.oracle.bmc.http.client.Method.PATCH)
                .requestBuilder(PatchKmsiSettingRequest::builder)
                .basePath("")
                .appendPathParam("admin")
                .appendPathParam("v1")
                .appendPathParam("KmsiSettings")
                .appendPathParam(request.getKmsiSettingId())
                .appendQueryParam("attributes", request.getAttributes())
                .appendListQueryParam(
                        "attributeSets",
                        request.getAttributeSets(),
                        com.oracle.bmc.util.internal.CollectionFormatType.Multi)
                .accept("application/json, application/scim+json")
                .appendHeader("authorization", request.getAuthorization())
                .appendHeader(
                        "resource_type_schema_version", request.getResourceTypeSchemaVersion())
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.identitydomains.model.KmsiSetting.class,
                        PatchKmsiSettingResponse.Builder::kmsiSetting)
                .handleResponseHeaderString(
                        "opc-request-id", PatchKmsiSettingResponse.Builder::opcRequestId)
                .handleResponseHeaderString("etag", PatchKmsiSettingResponse.Builder::etag)
                .callSync();
    }

    @Override
    public PatchMeResponse patchMe(PatchMeRequest request) {

        return clientCall(request, PatchMeResponse::builder)
                .logger(LOG, "patchMe")
                .serviceDetails(
                        "IdentityDomains",
                        "PatchMe",
                        "https://docs.oracle.com/iaas/api/#/en/identity-domains/v1/Me/PatchMe")
                .method(com.oracle.bmc.http.client.Method.PATCH)
                .requestBuilder(PatchMeRequest::builder)
                .basePath("")
                .appendPathParam("admin")
                .appendPathParam("v1")
                .appendPathParam("Me")
                .appendQueryParam("attributes", request.getAttributes())
                .appendListQueryParam(
                        "attributeSets",
                        request.getAttributeSets(),
                        com.oracle.bmc.util.internal.CollectionFormatType.Multi)
                .accept("application/json, application/scim+json")
                .appendHeader("authorization", request.getAuthorization())
                .appendHeader(
                        "resource_type_schema_version", request.getResourceTypeSchemaVersion())
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.identitydomains.model.Me.class, PatchMeResponse.Builder::me)
                .handleResponseHeaderString("opc-request-id", PatchMeResponse.Builder::opcRequestId)
                .handleResponseHeaderString("etag", PatchMeResponse.Builder::etag)
                .callSync();
    }

    @Override
    public PatchMyApiKeyResponse patchMyApiKey(PatchMyApiKeyRequest request) {

        Validate.notBlank(request.getMyApiKeyId(), "myApiKeyId must not be blank");

        return clientCall(request, PatchMyApiKeyResponse::builder)
                .logger(LOG, "patchMyApiKey")
                .serviceDetails(
                        "IdentityDomains",
                        "PatchMyApiKey",
                        "https://docs.oracle.com/iaas/api/#/en/identity-domains/v1/MyApiKey/PatchMyApiKey")
                .method(com.oracle.bmc.http.client.Method.PATCH)
                .requestBuilder(PatchMyApiKeyRequest::builder)
                .basePath("")
                .appendPathParam("admin")
                .appendPathParam("v1")
                .appendPathParam("MyApiKeys")
                .appendPathParam(request.getMyApiKeyId())
                .accept("application/json, application/scim+json")
                .appendHeader("authorization", request.getAuthorization())
                .appendHeader(
                        "resource_type_schema_version", request.getResourceTypeSchemaVersion())
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.identitydomains.model.MyApiKey.class,
                        PatchMyApiKeyResponse.Builder::myApiKey)
                .handleResponseHeaderString(
                        "opc-request-id", PatchMyApiKeyResponse.Builder::opcRequestId)
                .handleResponseHeaderString("etag", PatchMyApiKeyResponse.Builder::etag)
                .callSync();
    }

    @Override
    public PatchMyAuthTokenResponse patchMyAuthToken(PatchMyAuthTokenRequest request) {

        Validate.notBlank(request.getMyAuthTokenId(), "myAuthTokenId must not be blank");

        return clientCall(request, PatchMyAuthTokenResponse::builder)
                .logger(LOG, "patchMyAuthToken")
                .serviceDetails(
                        "IdentityDomains",
                        "PatchMyAuthToken",
                        "https://docs.oracle.com/iaas/api/#/en/identity-domains/v1/MyAuthToken/PatchMyAuthToken")
                .method(com.oracle.bmc.http.client.Method.PATCH)
                .requestBuilder(PatchMyAuthTokenRequest::builder)
                .basePath("")
                .appendPathParam("admin")
                .appendPathParam("v1")
                .appendPathParam("MyAuthTokens")
                .appendPathParam(request.getMyAuthTokenId())
                .accept("application/json, application/scim+json")
                .appendHeader("authorization", request.getAuthorization())
                .appendHeader(
                        "resource_type_schema_version", request.getResourceTypeSchemaVersion())
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.identitydomains.model.MyAuthToken.class,
                        PatchMyAuthTokenResponse.Builder::myAuthToken)
                .handleResponseHeaderString(
                        "opc-request-id", PatchMyAuthTokenResponse.Builder::opcRequestId)
                .handleResponseHeaderString("etag", PatchMyAuthTokenResponse.Builder::etag)
                .callSync();
    }

    @Override
    public PatchMyCustomerSecretKeyResponse patchMyCustomerSecretKey(
            PatchMyCustomerSecretKeyRequest request) {

        Validate.notBlank(
                request.getMyCustomerSecretKeyId(), "myCustomerSecretKeyId must not be blank");

        return clientCall(request, PatchMyCustomerSecretKeyResponse::builder)
                .logger(LOG, "patchMyCustomerSecretKey")
                .serviceDetails(
                        "IdentityDomains",
                        "PatchMyCustomerSecretKey",
                        "https://docs.oracle.com/iaas/api/#/en/identity-domains/v1/MyCustomerSecretKey/PatchMyCustomerSecretKey")
                .method(com.oracle.bmc.http.client.Method.PATCH)
                .requestBuilder(PatchMyCustomerSecretKeyRequest::builder)
                .basePath("")
                .appendPathParam("admin")
                .appendPathParam("v1")
                .appendPathParam("MyCustomerSecretKeys")
                .appendPathParam(request.getMyCustomerSecretKeyId())
                .accept("application/json, application/scim+json")
                .appendHeader("authorization", request.getAuthorization())
                .appendHeader(
                        "resource_type_schema_version", request.getResourceTypeSchemaVersion())
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.identitydomains.model.MyCustomerSecretKey.class,
                        PatchMyCustomerSecretKeyResponse.Builder::myCustomerSecretKey)
                .handleResponseHeaderString(
                        "opc-request-id", PatchMyCustomerSecretKeyResponse.Builder::opcRequestId)
                .handleResponseHeaderString("etag", PatchMyCustomerSecretKeyResponse.Builder::etag)
                .callSync();
    }

    @Override
    public PatchMyDeviceResponse patchMyDevice(PatchMyDeviceRequest request) {

        Validate.notBlank(request.getMyDeviceId(), "myDeviceId must not be blank");

        return clientCall(request, PatchMyDeviceResponse::builder)
                .logger(LOG, "patchMyDevice")
                .serviceDetails(
                        "IdentityDomains",
                        "PatchMyDevice",
                        "https://docs.oracle.com/iaas/api/#/en/identity-domains/v1/MyDevice/PatchMyDevice")
                .method(com.oracle.bmc.http.client.Method.PATCH)
                .requestBuilder(PatchMyDeviceRequest::builder)
                .basePath("")
                .appendPathParam("admin")
                .appendPathParam("v1")
                .appendPathParam("MyDevices")
                .appendPathParam(request.getMyDeviceId())
                .appendQueryParam("attributes", request.getAttributes())
                .appendListQueryParam(
                        "attributeSets",
                        request.getAttributeSets(),
                        com.oracle.bmc.util.internal.CollectionFormatType.Multi)
                .accept("application/json, application/scim+json")
                .appendHeader("authorization", request.getAuthorization())
                .appendHeader(
                        "resource_type_schema_version", request.getResourceTypeSchemaVersion())
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.identitydomains.model.MyDevice.class,
                        PatchMyDeviceResponse.Builder::myDevice)
                .handleResponseHeaderString(
                        "opc-request-id", PatchMyDeviceResponse.Builder::opcRequestId)
                .handleResponseHeaderString("etag", PatchMyDeviceResponse.Builder::etag)
                .callSync();
    }

    @Override
    public PatchMyOAuth2ClientCredentialResponse patchMyOAuth2ClientCredential(
            PatchMyOAuth2ClientCredentialRequest request) {

        Validate.notBlank(
                request.getMyOAuth2ClientCredentialId(),
                "myOAuth2ClientCredentialId must not be blank");

        return clientCall(request, PatchMyOAuth2ClientCredentialResponse::builder)
                .logger(LOG, "patchMyOAuth2ClientCredential")
                .serviceDetails(
                        "IdentityDomains",
                        "PatchMyOAuth2ClientCredential",
                        "https://docs.oracle.com/iaas/api/#/en/identity-domains/v1/MyOAuth2ClientCredential/PatchMyOAuth2ClientCredential")
                .method(com.oracle.bmc.http.client.Method.PATCH)
                .requestBuilder(PatchMyOAuth2ClientCredentialRequest::builder)
                .basePath("")
                .appendPathParam("admin")
                .appendPathParam("v1")
                .appendPathParam("MyOAuth2ClientCredentials")
                .appendPathParam(request.getMyOAuth2ClientCredentialId())
                .accept("application/json, application/scim+json")
                .appendHeader("authorization", request.getAuthorization())
                .appendHeader(
                        "resource_type_schema_version", request.getResourceTypeSchemaVersion())
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.identitydomains.model.MyOAuth2ClientCredential.class,
                        PatchMyOAuth2ClientCredentialResponse.Builder::myOAuth2ClientCredential)
                .handleResponseHeaderString(
                        "opc-request-id",
                        PatchMyOAuth2ClientCredentialResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "etag", PatchMyOAuth2ClientCredentialResponse.Builder::etag)
                .callSync();
    }

    @Override
    public PatchMyPendingApprovalResponse patchMyPendingApproval(
            PatchMyPendingApprovalRequest request) {

        Validate.notBlank(
                request.getMyPendingApprovalId(), "myPendingApprovalId must not be blank");

        return clientCall(request, PatchMyPendingApprovalResponse::builder)
                .logger(LOG, "patchMyPendingApproval")
                .serviceDetails(
                        "IdentityDomains",
                        "PatchMyPendingApproval",
                        "https://docs.oracle.com/iaas/api/#/en/identity-domains/v1/MyPendingApproval/PatchMyPendingApproval")
                .method(com.oracle.bmc.http.client.Method.PATCH)
                .requestBuilder(PatchMyPendingApprovalRequest::builder)
                .basePath("")
                .appendPathParam("admin")
                .appendPathParam("v1")
                .appendPathParam("MyPendingApprovals")
                .appendPathParam(request.getMyPendingApprovalId())
                .accept("application/json, application/scim+json")
                .appendHeader("authorization", request.getAuthorization())
                .appendHeader(
                        "resource_type_schema_version", request.getResourceTypeSchemaVersion())
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.identitydomains.model.MyPendingApproval.class,
                        PatchMyPendingApprovalResponse.Builder::myPendingApproval)
                .handleResponseHeaderString(
                        "opc-request-id", PatchMyPendingApprovalResponse.Builder::opcRequestId)
                .handleResponseHeaderString("etag", PatchMyPendingApprovalResponse.Builder::etag)
                .callSync();
    }

    @Override
    public PatchMyRequestResponse patchMyRequest(PatchMyRequestRequest request) {

        Validate.notBlank(request.getMyRequestId(), "myRequestId must not be blank");

        return clientCall(request, PatchMyRequestResponse::builder)
                .logger(LOG, "patchMyRequest")
                .serviceDetails(
                        "IdentityDomains",
                        "PatchMyRequest",
                        "https://docs.oracle.com/iaas/api/#/en/identity-domains/v1/MyRequest/PatchMyRequest")
                .method(com.oracle.bmc.http.client.Method.PATCH)
                .requestBuilder(PatchMyRequestRequest::builder)
                .basePath("")
                .appendPathParam("admin")
                .appendPathParam("v1")
                .appendPathParam("MyRequests")
                .appendPathParam(request.getMyRequestId())
                .appendQueryParam("attributes", request.getAttributes())
                .appendListQueryParam(
                        "attributeSets",
                        request.getAttributeSets(),
                        com.oracle.bmc.util.internal.CollectionFormatType.Multi)
                .accept("application/json, application/scim+json")
                .appendHeader("authorization", request.getAuthorization())
                .appendHeader(
                        "resource_type_schema_version", request.getResourceTypeSchemaVersion())
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.identitydomains.model.MyRequest.class,
                        PatchMyRequestResponse.Builder::myRequest)
                .handleResponseHeaderString(
                        "opc-request-id", PatchMyRequestResponse.Builder::opcRequestId)
                .handleResponseHeaderString("etag", PatchMyRequestResponse.Builder::etag)
                .callSync();
    }

    @Override
    public PatchMySmtpCredentialResponse patchMySmtpCredential(
            PatchMySmtpCredentialRequest request) {

        Validate.notBlank(request.getMySmtpCredentialId(), "mySmtpCredentialId must not be blank");

        return clientCall(request, PatchMySmtpCredentialResponse::builder)
                .logger(LOG, "patchMySmtpCredential")
                .serviceDetails(
                        "IdentityDomains",
                        "PatchMySmtpCredential",
                        "https://docs.oracle.com/iaas/api/#/en/identity-domains/v1/MySmtpCredential/PatchMySmtpCredential")
                .method(com.oracle.bmc.http.client.Method.PATCH)
                .requestBuilder(PatchMySmtpCredentialRequest::builder)
                .basePath("")
                .appendPathParam("admin")
                .appendPathParam("v1")
                .appendPathParam("MySmtpCredentials")
                .appendPathParam(request.getMySmtpCredentialId())
                .accept("application/json, application/scim+json")
                .appendHeader("authorization", request.getAuthorization())
                .appendHeader(
                        "resource_type_schema_version", request.getResourceTypeSchemaVersion())
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.identitydomains.model.MySmtpCredential.class,
                        PatchMySmtpCredentialResponse.Builder::mySmtpCredential)
                .handleResponseHeaderString(
                        "opc-request-id", PatchMySmtpCredentialResponse.Builder::opcRequestId)
                .handleResponseHeaderString("etag", PatchMySmtpCredentialResponse.Builder::etag)
                .callSync();
    }

    @Override
    public PatchNetworkPerimeterResponse patchNetworkPerimeter(
            PatchNetworkPerimeterRequest request) {

        Validate.notBlank(request.getNetworkPerimeterId(), "networkPerimeterId must not be blank");

        return clientCall(request, PatchNetworkPerimeterResponse::builder)
                .logger(LOG, "patchNetworkPerimeter")
                .serviceDetails(
                        "IdentityDomains",
                        "PatchNetworkPerimeter",
                        "https://docs.oracle.com/iaas/api/#/en/identity-domains/v1/NetworkPerimeter/PatchNetworkPerimeter")
                .method(com.oracle.bmc.http.client.Method.PATCH)
                .requestBuilder(PatchNetworkPerimeterRequest::builder)
                .basePath("")
                .appendPathParam("admin")
                .appendPathParam("v1")
                .appendPathParam("NetworkPerimeters")
                .appendPathParam(request.getNetworkPerimeterId())
                .appendQueryParam("attributes", request.getAttributes())
                .appendListQueryParam(
                        "attributeSets",
                        request.getAttributeSets(),
                        com.oracle.bmc.util.internal.CollectionFormatType.Multi)
                .accept("application/json, application/scim+json")
                .appendHeader("authorization", request.getAuthorization())
                .appendHeader(
                        "resource_type_schema_version", request.getResourceTypeSchemaVersion())
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.identitydomains.model.NetworkPerimeter.class,
                        PatchNetworkPerimeterResponse.Builder::networkPerimeter)
                .handleResponseHeaderString(
                        "opc-request-id", PatchNetworkPerimeterResponse.Builder::opcRequestId)
                .handleResponseHeaderString("etag", PatchNetworkPerimeterResponse.Builder::etag)
                .callSync();
    }

    @Override
    public PatchOAuth2ClientCredentialResponse patchOAuth2ClientCredential(
            PatchOAuth2ClientCredentialRequest request) {

        Validate.notBlank(
                request.getOAuth2ClientCredentialId(),
                "oAuth2ClientCredentialId must not be blank");

        return clientCall(request, PatchOAuth2ClientCredentialResponse::builder)
                .logger(LOG, "patchOAuth2ClientCredential")
                .serviceDetails(
                        "IdentityDomains",
                        "PatchOAuth2ClientCredential",
                        "https://docs.oracle.com/iaas/api/#/en/identity-domains/v1/OAuth2ClientCredential/PatchOAuth2ClientCredential")
                .method(com.oracle.bmc.http.client.Method.PATCH)
                .requestBuilder(PatchOAuth2ClientCredentialRequest::builder)
                .basePath("")
                .appendPathParam("admin")
                .appendPathParam("v1")
                .appendPathParam("OAuth2ClientCredentials")
                .appendPathParam(request.getOAuth2ClientCredentialId())
                .appendQueryParam("attributes", request.getAttributes())
                .appendListQueryParam(
                        "attributeSets",
                        request.getAttributeSets(),
                        com.oracle.bmc.util.internal.CollectionFormatType.Multi)
                .accept("application/json, application/scim+json")
                .appendHeader("authorization", request.getAuthorization())
                .appendHeader(
                        "resource_type_schema_version", request.getResourceTypeSchemaVersion())
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.identitydomains.model.OAuth2ClientCredential.class,
                        PatchOAuth2ClientCredentialResponse.Builder::oAuth2ClientCredential)
                .handleResponseHeaderString(
                        "opc-request-id", PatchOAuth2ClientCredentialResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "etag", PatchOAuth2ClientCredentialResponse.Builder::etag)
                .callSync();
    }

    @Override
    public PatchPasswordPolicyResponse patchPasswordPolicy(PatchPasswordPolicyRequest request) {

        Validate.notBlank(request.getPasswordPolicyId(), "passwordPolicyId must not be blank");

        return clientCall(request, PatchPasswordPolicyResponse::builder)
                .logger(LOG, "patchPasswordPolicy")
                .serviceDetails(
                        "IdentityDomains",
                        "PatchPasswordPolicy",
                        "https://docs.oracle.com/iaas/api/#/en/identity-domains/v1/PasswordPolicy/PatchPasswordPolicy")
                .method(com.oracle.bmc.http.client.Method.PATCH)
                .requestBuilder(PatchPasswordPolicyRequest::builder)
                .basePath("")
                .appendPathParam("admin")
                .appendPathParam("v1")
                .appendPathParam("PasswordPolicies")
                .appendPathParam(request.getPasswordPolicyId())
                .appendQueryParam("attributes", request.getAttributes())
                .appendListQueryParam(
                        "attributeSets",
                        request.getAttributeSets(),
                        com.oracle.bmc.util.internal.CollectionFormatType.Multi)
                .accept("application/json, application/scim+json")
                .appendHeader("authorization", request.getAuthorization())
                .appendHeader(
                        "resource_type_schema_version", request.getResourceTypeSchemaVersion())
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.identitydomains.model.PasswordPolicy.class,
                        PatchPasswordPolicyResponse.Builder::passwordPolicy)
                .handleResponseHeaderString(
                        "opc-request-id", PatchPasswordPolicyResponse.Builder::opcRequestId)
                .handleResponseHeaderString("etag", PatchPasswordPolicyResponse.Builder::etag)
                .callSync();
    }

    @Override
    public PatchPolicyResponse patchPolicy(PatchPolicyRequest request) {

        Validate.notBlank(request.getPolicyId(), "policyId must not be blank");

        return clientCall(request, PatchPolicyResponse::builder)
                .logger(LOG, "patchPolicy")
                .serviceDetails(
                        "IdentityDomains",
                        "PatchPolicy",
                        "https://docs.oracle.com/iaas/api/#/en/identity-domains/v1/Policy/PatchPolicy")
                .method(com.oracle.bmc.http.client.Method.PATCH)
                .requestBuilder(PatchPolicyRequest::builder)
                .basePath("")
                .appendPathParam("admin")
                .appendPathParam("v1")
                .appendPathParam("Policies")
                .appendPathParam(request.getPolicyId())
                .appendQueryParam("attributes", request.getAttributes())
                .appendListQueryParam(
                        "attributeSets",
                        request.getAttributeSets(),
                        com.oracle.bmc.util.internal.CollectionFormatType.Multi)
                .accept("application/json, application/scim+json")
                .appendHeader("authorization", request.getAuthorization())
                .appendHeader(
                        "resource_type_schema_version", request.getResourceTypeSchemaVersion())
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.identitydomains.model.Policy.class,
                        PatchPolicyResponse.Builder::policy)
                .handleResponseHeaderString(
                        "opc-request-id", PatchPolicyResponse.Builder::opcRequestId)
                .handleResponseHeaderString("etag", PatchPolicyResponse.Builder::etag)
                .callSync();
    }

    @Override
    public PatchRuleResponse patchRule(PatchRuleRequest request) {

        Validate.notBlank(request.getRuleId(), "ruleId must not be blank");

        return clientCall(request, PatchRuleResponse::builder)
                .logger(LOG, "patchRule")
                .serviceDetails(
                        "IdentityDomains",
                        "PatchRule",
                        "https://docs.oracle.com/iaas/api/#/en/identity-domains/v1/Rule/PatchRule")
                .method(com.oracle.bmc.http.client.Method.PATCH)
                .requestBuilder(PatchRuleRequest::builder)
                .basePath("")
                .appendPathParam("admin")
                .appendPathParam("v1")
                .appendPathParam("Rules")
                .appendPathParam(request.getRuleId())
                .appendQueryParam("attributes", request.getAttributes())
                .appendListQueryParam(
                        "attributeSets",
                        request.getAttributeSets(),
                        com.oracle.bmc.util.internal.CollectionFormatType.Multi)
                .accept("application/json, application/scim+json")
                .appendHeader("authorization", request.getAuthorization())
                .appendHeader(
                        "resource_type_schema_version", request.getResourceTypeSchemaVersion())
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.identitydomains.model.Rule.class,
                        PatchRuleResponse.Builder::rule)
                .handleResponseHeaderString(
                        "opc-request-id", PatchRuleResponse.Builder::opcRequestId)
                .handleResponseHeaderString("etag", PatchRuleResponse.Builder::etag)
                .callSync();
    }

    @Override
    public PatchSchemaResponse patchSchema(PatchSchemaRequest request) {

        Validate.notBlank(request.getSchemaId(), "schemaId must not be blank");

        return clientCall(request, PatchSchemaResponse::builder)
                .logger(LOG, "patchSchema")
                .serviceDetails(
                        "IdentityDomains",
                        "PatchSchema",
                        "https://docs.oracle.com/iaas/api/#/en/identity-domains/v1/Schema/PatchSchema")
                .method(com.oracle.bmc.http.client.Method.PATCH)
                .requestBuilder(PatchSchemaRequest::builder)
                .basePath("")
                .appendPathParam("admin")
                .appendPathParam("v1")
                .appendPathParam("Schemas")
                .appendPathParam(request.getSchemaId())
                .accept("application/json, application/scim+json")
                .appendHeader("authorization", request.getAuthorization())
                .appendHeader(
                        "resource_type_schema_version", request.getResourceTypeSchemaVersion())
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.identitydomains.model.Schema.class,
                        PatchSchemaResponse.Builder::schema)
                .handleResponseHeaderString(
                        "opc-request-id", PatchSchemaResponse.Builder::opcRequestId)
                .handleResponseHeaderString("etag", PatchSchemaResponse.Builder::etag)
                .callSync();
    }

    @Override
    public PatchSecurityQuestionResponse patchSecurityQuestion(
            PatchSecurityQuestionRequest request) {

        Validate.notBlank(request.getSecurityQuestionId(), "securityQuestionId must not be blank");

        return clientCall(request, PatchSecurityQuestionResponse::builder)
                .logger(LOG, "patchSecurityQuestion")
                .serviceDetails(
                        "IdentityDomains",
                        "PatchSecurityQuestion",
                        "https://docs.oracle.com/iaas/api/#/en/identity-domains/v1/SecurityQuestion/PatchSecurityQuestion")
                .method(com.oracle.bmc.http.client.Method.PATCH)
                .requestBuilder(PatchSecurityQuestionRequest::builder)
                .basePath("")
                .appendPathParam("admin")
                .appendPathParam("v1")
                .appendPathParam("SecurityQuestions")
                .appendPathParam(request.getSecurityQuestionId())
                .appendQueryParam("attributes", request.getAttributes())
                .appendListQueryParam(
                        "attributeSets",
                        request.getAttributeSets(),
                        com.oracle.bmc.util.internal.CollectionFormatType.Multi)
                .accept("application/json, application/scim+json")
                .appendHeader("authorization", request.getAuthorization())
                .appendHeader(
                        "resource_type_schema_version", request.getResourceTypeSchemaVersion())
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.identitydomains.model.SecurityQuestion.class,
                        PatchSecurityQuestionResponse.Builder::securityQuestion)
                .handleResponseHeaderString(
                        "opc-request-id", PatchSecurityQuestionResponse.Builder::opcRequestId)
                .handleResponseHeaderString("etag", PatchSecurityQuestionResponse.Builder::etag)
                .callSync();
    }

    @Override
    public PatchSecurityQuestionSettingResponse patchSecurityQuestionSetting(
            PatchSecurityQuestionSettingRequest request) {

        Validate.notBlank(
                request.getSecurityQuestionSettingId(),
                "securityQuestionSettingId must not be blank");

        return clientCall(request, PatchSecurityQuestionSettingResponse::builder)
                .logger(LOG, "patchSecurityQuestionSetting")
                .serviceDetails(
                        "IdentityDomains",
                        "PatchSecurityQuestionSetting",
                        "https://docs.oracle.com/iaas/api/#/en/identity-domains/v1/SecurityQuestionSetting/PatchSecurityQuestionSetting")
                .method(com.oracle.bmc.http.client.Method.PATCH)
                .requestBuilder(PatchSecurityQuestionSettingRequest::builder)
                .basePath("")
                .appendPathParam("admin")
                .appendPathParam("v1")
                .appendPathParam("SecurityQuestionSettings")
                .appendPathParam(request.getSecurityQuestionSettingId())
                .appendQueryParam("attributes", request.getAttributes())
                .appendListQueryParam(
                        "attributeSets",
                        request.getAttributeSets(),
                        com.oracle.bmc.util.internal.CollectionFormatType.Multi)
                .accept("application/json, application/scim+json")
                .appendHeader("authorization", request.getAuthorization())
                .appendHeader(
                        "resource_type_schema_version", request.getResourceTypeSchemaVersion())
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.identitydomains.model.SecurityQuestionSetting.class,
                        PatchSecurityQuestionSettingResponse.Builder::securityQuestionSetting)
                .handleResponseHeaderString(
                        "opc-request-id",
                        PatchSecurityQuestionSettingResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "etag", PatchSecurityQuestionSettingResponse.Builder::etag)
                .callSync();
    }

    @Override
    public PatchSelfRegistrationProfileResponse patchSelfRegistrationProfile(
            PatchSelfRegistrationProfileRequest request) {

        Validate.notBlank(
                request.getSelfRegistrationProfileId(),
                "selfRegistrationProfileId must not be blank");

        return clientCall(request, PatchSelfRegistrationProfileResponse::builder)
                .logger(LOG, "patchSelfRegistrationProfile")
                .serviceDetails(
                        "IdentityDomains",
                        "PatchSelfRegistrationProfile",
                        "https://docs.oracle.com/iaas/api/#/en/identity-domains/v1/SelfRegistrationProfile/PatchSelfRegistrationProfile")
                .method(com.oracle.bmc.http.client.Method.PATCH)
                .requestBuilder(PatchSelfRegistrationProfileRequest::builder)
                .basePath("")
                .appendPathParam("admin")
                .appendPathParam("v1")
                .appendPathParam("SelfRegistrationProfiles")
                .appendPathParam(request.getSelfRegistrationProfileId())
                .appendQueryParam("attributes", request.getAttributes())
                .appendListQueryParam(
                        "attributeSets",
                        request.getAttributeSets(),
                        com.oracle.bmc.util.internal.CollectionFormatType.Multi)
                .accept("application/json, application/scim+json")
                .appendHeader("authorization", request.getAuthorization())
                .appendHeader(
                        "resource_type_schema_version", request.getResourceTypeSchemaVersion())
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.identitydomains.model.SelfRegistrationProfile.class,
                        PatchSelfRegistrationProfileResponse.Builder::selfRegistrationProfile)
                .handleResponseHeaderString(
                        "opc-request-id",
                        PatchSelfRegistrationProfileResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "etag", PatchSelfRegistrationProfileResponse.Builder::etag)
                .callSync();
    }

    @Override
    public PatchSettingResponse patchSetting(PatchSettingRequest request) {

        Validate.notBlank(request.getSettingId(), "settingId must not be blank");

        return clientCall(request, PatchSettingResponse::builder)
                .logger(LOG, "patchSetting")
                .serviceDetails(
                        "IdentityDomains",
                        "PatchSetting",
                        "https://docs.oracle.com/iaas/api/#/en/identity-domains/v1/Setting/PatchSetting")
                .method(com.oracle.bmc.http.client.Method.PATCH)
                .requestBuilder(PatchSettingRequest::builder)
                .basePath("")
                .appendPathParam("admin")
                .appendPathParam("v1")
                .appendPathParam("Settings")
                .appendPathParam(request.getSettingId())
                .appendQueryParam("attributes", request.getAttributes())
                .appendListQueryParam(
                        "attributeSets",
                        request.getAttributeSets(),
                        com.oracle.bmc.util.internal.CollectionFormatType.Multi)
                .accept("application/json, application/scim+json")
                .appendHeader("authorization", request.getAuthorization())
                .appendHeader(
                        "resource_type_schema_version", request.getResourceTypeSchemaVersion())
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.identitydomains.model.Setting.class,
                        PatchSettingResponse.Builder::setting)
                .handleResponseHeaderString(
                        "opc-request-id", PatchSettingResponse.Builder::opcRequestId)
                .handleResponseHeaderString("etag", PatchSettingResponse.Builder::etag)
                .callSync();
    }

    @Override
    public PatchSmtpCredentialResponse patchSmtpCredential(PatchSmtpCredentialRequest request) {

        Validate.notBlank(request.getSmtpCredentialId(), "smtpCredentialId must not be blank");

        return clientCall(request, PatchSmtpCredentialResponse::builder)
                .logger(LOG, "patchSmtpCredential")
                .serviceDetails(
                        "IdentityDomains",
                        "PatchSmtpCredential",
                        "https://docs.oracle.com/iaas/api/#/en/identity-domains/v1/SmtpCredential/PatchSmtpCredential")
                .method(com.oracle.bmc.http.client.Method.PATCH)
                .requestBuilder(PatchSmtpCredentialRequest::builder)
                .basePath("")
                .appendPathParam("admin")
                .appendPathParam("v1")
                .appendPathParam("SmtpCredentials")
                .appendPathParam(request.getSmtpCredentialId())
                .appendQueryParam("attributes", request.getAttributes())
                .appendListQueryParam(
                        "attributeSets",
                        request.getAttributeSets(),
                        com.oracle.bmc.util.internal.CollectionFormatType.Multi)
                .accept("application/json, application/scim+json")
                .appendHeader("authorization", request.getAuthorization())
                .appendHeader(
                        "resource_type_schema_version", request.getResourceTypeSchemaVersion())
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.identitydomains.model.SmtpCredential.class,
                        PatchSmtpCredentialResponse.Builder::smtpCredential)
                .handleResponseHeaderString(
                        "opc-request-id", PatchSmtpCredentialResponse.Builder::opcRequestId)
                .handleResponseHeaderString("etag", PatchSmtpCredentialResponse.Builder::etag)
                .callSync();
    }

    @Override
    public PatchSocialIdentityProviderResponse patchSocialIdentityProvider(
            PatchSocialIdentityProviderRequest request) {

        Validate.notBlank(
                request.getSocialIdentityProviderId(),
                "socialIdentityProviderId must not be blank");

        return clientCall(request, PatchSocialIdentityProviderResponse::builder)
                .logger(LOG, "patchSocialIdentityProvider")
                .serviceDetails(
                        "IdentityDomains",
                        "PatchSocialIdentityProvider",
                        "https://docs.oracle.com/iaas/api/#/en/identity-domains/v1/SocialIdentityProvider/PatchSocialIdentityProvider")
                .method(com.oracle.bmc.http.client.Method.PATCH)
                .requestBuilder(PatchSocialIdentityProviderRequest::builder)
                .basePath("")
                .appendPathParam("admin")
                .appendPathParam("v1")
                .appendPathParam("SocialIdentityProviders")
                .appendPathParam(request.getSocialIdentityProviderId())
                .accept("application/json, application/scim+json")
                .appendHeader("authorization", request.getAuthorization())
                .appendHeader(
                        "resource_type_schema_version", request.getResourceTypeSchemaVersion())
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.identitydomains.model.SocialIdentityProvider.class,
                        PatchSocialIdentityProviderResponse.Builder::socialIdentityProvider)
                .handleResponseHeaderString(
                        "opc-request-id", PatchSocialIdentityProviderResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "etag", PatchSocialIdentityProviderResponse.Builder::etag)
                .callSync();
    }

    @Override
    public PatchUserResponse patchUser(PatchUserRequest request) {

        Validate.notBlank(request.getUserId(), "userId must not be blank");

        return clientCall(request, PatchUserResponse::builder)
                .logger(LOG, "patchUser")
                .serviceDetails(
                        "IdentityDomains",
                        "PatchUser",
                        "https://docs.oracle.com/iaas/api/#/en/identity-domains/v1/User/PatchUser")
                .method(com.oracle.bmc.http.client.Method.PATCH)
                .requestBuilder(PatchUserRequest::builder)
                .basePath("")
                .appendPathParam("admin")
                .appendPathParam("v1")
                .appendPathParam("Users")
                .appendPathParam(request.getUserId())
                .appendQueryParam("attributes", request.getAttributes())
                .appendListQueryParam(
                        "attributeSets",
                        request.getAttributeSets(),
                        com.oracle.bmc.util.internal.CollectionFormatType.Multi)
                .accept("application/json, application/scim+json")
                .appendHeader("authorization", request.getAuthorization())
                .appendHeader(
                        "resource_type_schema_version", request.getResourceTypeSchemaVersion())
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.identitydomains.model.User.class,
                        PatchUserResponse.Builder::user)
                .handleResponseHeaderString(
                        "opc-request-id", PatchUserResponse.Builder::opcRequestId)
                .handleResponseHeaderString("etag", PatchUserResponse.Builder::etag)
                .callSync();
    }

    @Override
    public PatchUserAttributesSettingResponse patchUserAttributesSetting(
            PatchUserAttributesSettingRequest request) {

        Validate.notBlank(
                request.getUserAttributesSettingId(), "userAttributesSettingId must not be blank");

        return clientCall(request, PatchUserAttributesSettingResponse::builder)
                .logger(LOG, "patchUserAttributesSetting")
                .serviceDetails(
                        "IdentityDomains",
                        "PatchUserAttributesSetting",
                        "https://docs.oracle.com/iaas/api/#/en/identity-domains/v1/UserAttributesSetting/PatchUserAttributesSetting")
                .method(com.oracle.bmc.http.client.Method.PATCH)
                .requestBuilder(PatchUserAttributesSettingRequest::builder)
                .basePath("")
                .appendPathParam("admin")
                .appendPathParam("v1")
                .appendPathParam("UserAttributesSettings")
                .appendPathParam(request.getUserAttributesSettingId())
                .appendQueryParam("attributes", request.getAttributes())
                .appendListQueryParam(
                        "attributeSets",
                        request.getAttributeSets(),
                        com.oracle.bmc.util.internal.CollectionFormatType.Multi)
                .accept("application/json, application/scim+json")
                .appendHeader("authorization", request.getAuthorization())
                .appendHeader(
                        "resource_type_schema_version", request.getResourceTypeSchemaVersion())
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.identitydomains.model.UserAttributesSetting.class,
                        PatchUserAttributesSettingResponse.Builder::userAttributesSetting)
                .handleResponseHeaderString(
                        "opc-request-id", PatchUserAttributesSettingResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "etag", PatchUserAttributesSettingResponse.Builder::etag)
                .callSync();
    }

    @Override
    public PutAccountRecoverySettingResponse putAccountRecoverySetting(
            PutAccountRecoverySettingRequest request) {

        Validate.notBlank(
                request.getAccountRecoverySettingId(),
                "accountRecoverySettingId must not be blank");

        return clientCall(request, PutAccountRecoverySettingResponse::builder)
                .logger(LOG, "putAccountRecoverySetting")
                .serviceDetails(
                        "IdentityDomains",
                        "PutAccountRecoverySetting",
                        "https://docs.oracle.com/iaas/api/#/en/identity-domains/v1/AccountRecoverySetting/PutAccountRecoverySetting")
                .method(com.oracle.bmc.http.client.Method.PUT)
                .requestBuilder(PutAccountRecoverySettingRequest::builder)
                .basePath("")
                .appendPathParam("admin")
                .appendPathParam("v1")
                .appendPathParam("AccountRecoverySettings")
                .appendPathParam(request.getAccountRecoverySettingId())
                .appendQueryParam("attributes", request.getAttributes())
                .appendListQueryParam(
                        "attributeSets",
                        request.getAttributeSets(),
                        com.oracle.bmc.util.internal.CollectionFormatType.Multi)
                .accept("application/json, application/scim+json")
                .appendHeader("authorization", request.getAuthorization())
                .appendHeader(
                        "resource_type_schema_version", request.getResourceTypeSchemaVersion())
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.identitydomains.model.AccountRecoverySetting.class,
                        PutAccountRecoverySettingResponse.Builder::accountRecoverySetting)
                .handleResponseHeaderString(
                        "opc-request-id", PutAccountRecoverySettingResponse.Builder::opcRequestId)
                .handleResponseHeaderString("etag", PutAccountRecoverySettingResponse.Builder::etag)
                .callSync();
    }

    @Override
    public PutAppResponse putApp(PutAppRequest request) {

        Validate.notBlank(request.getAppId(), "appId must not be blank");

        return clientCall(request, PutAppResponse::builder)
                .logger(LOG, "putApp")
                .serviceDetails(
                        "IdentityDomains",
                        "PutApp",
                        "https://docs.oracle.com/iaas/api/#/en/identity-domains/v1/App/PutApp")
                .method(com.oracle.bmc.http.client.Method.PUT)
                .requestBuilder(PutAppRequest::builder)
                .basePath("")
                .appendPathParam("admin")
                .appendPathParam("v1")
                .appendPathParam("Apps")
                .appendPathParam(request.getAppId())
                .appendQueryParam("attributes", request.getAttributes())
                .appendListQueryParam(
                        "attributeSets",
                        request.getAttributeSets(),
                        com.oracle.bmc.util.internal.CollectionFormatType.Multi)
                .accept("application/json, application/scim+json")
                .appendHeader("authorization", request.getAuthorization())
                .appendHeader(
                        "resource_type_schema_version", request.getResourceTypeSchemaVersion())
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.identitydomains.model.App.class, PutAppResponse.Builder::app)
                .handleResponseHeaderString("opc-request-id", PutAppResponse.Builder::opcRequestId)
                .handleResponseHeaderString("etag", PutAppResponse.Builder::etag)
                .callSync();
    }

    @Override
    public PutAppStatusChangerResponse putAppStatusChanger(PutAppStatusChangerRequest request) {

        Validate.notBlank(request.getAppStatusChangerId(), "appStatusChangerId must not be blank");

        return clientCall(request, PutAppStatusChangerResponse::builder)
                .logger(LOG, "putAppStatusChanger")
                .serviceDetails(
                        "IdentityDomains",
                        "PutAppStatusChanger",
                        "https://docs.oracle.com/iaas/api/#/en/identity-domains/v1/AppStatusChanger/PutAppStatusChanger")
                .method(com.oracle.bmc.http.client.Method.PUT)
                .requestBuilder(PutAppStatusChangerRequest::builder)
                .basePath("")
                .appendPathParam("admin")
                .appendPathParam("v1")
                .appendPathParam("AppStatusChanger")
                .appendPathParam(request.getAppStatusChangerId())
                .appendQueryParam("attributes", request.getAttributes())
                .appendListQueryParam(
                        "attributeSets",
                        request.getAttributeSets(),
                        com.oracle.bmc.util.internal.CollectionFormatType.Multi)
                .accept("application/json, application/scim+json")
                .appendHeader("authorization", request.getAuthorization())
                .appendHeader(
                        "resource_type_schema_version", request.getResourceTypeSchemaVersion())
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.identitydomains.model.AppStatusChanger.class,
                        PutAppStatusChangerResponse.Builder::appStatusChanger)
                .handleResponseHeaderString(
                        "opc-request-id", PutAppStatusChangerResponse.Builder::opcRequestId)
                .handleResponseHeaderString("etag", PutAppStatusChangerResponse.Builder::etag)
                .callSync();
    }

    @Override
    public PutApprovalWorkflowResponse putApprovalWorkflow(PutApprovalWorkflowRequest request) {

        Validate.notBlank(request.getApprovalWorkflowId(), "approvalWorkflowId must not be blank");

        return clientCall(request, PutApprovalWorkflowResponse::builder)
                .logger(LOG, "putApprovalWorkflow")
                .serviceDetails(
                        "IdentityDomains",
                        "PutApprovalWorkflow",
                        "https://docs.oracle.com/iaas/api/#/en/identity-domains/v1/ApprovalWorkflow/PutApprovalWorkflow")
                .method(com.oracle.bmc.http.client.Method.PUT)
                .requestBuilder(PutApprovalWorkflowRequest::builder)
                .basePath("")
                .appendPathParam("admin")
                .appendPathParam("v1")
                .appendPathParam("ApprovalWorkflows")
                .appendPathParam(request.getApprovalWorkflowId())
                .appendQueryParam("attributes", request.getAttributes())
                .appendListQueryParam(
                        "attributeSets",
                        request.getAttributeSets(),
                        com.oracle.bmc.util.internal.CollectionFormatType.Multi)
                .accept("application/json, application/scim+json")
                .appendHeader("authorization", request.getAuthorization())
                .appendHeader(
                        "resource_type_schema_version", request.getResourceTypeSchemaVersion())
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.identitydomains.model.ApprovalWorkflow.class,
                        PutApprovalWorkflowResponse.Builder::approvalWorkflow)
                .handleResponseHeaderString(
                        "opc-request-id", PutApprovalWorkflowResponse.Builder::opcRequestId)
                .handleResponseHeaderString("etag", PutApprovalWorkflowResponse.Builder::etag)
                .callSync();
    }

    @Override
    public PutAuthenticationFactorSettingResponse putAuthenticationFactorSetting(
            PutAuthenticationFactorSettingRequest request) {

        Validate.notBlank(
                request.getAuthenticationFactorSettingId(),
                "authenticationFactorSettingId must not be blank");

        return clientCall(request, PutAuthenticationFactorSettingResponse::builder)
                .logger(LOG, "putAuthenticationFactorSetting")
                .serviceDetails(
                        "IdentityDomains",
                        "PutAuthenticationFactorSetting",
                        "https://docs.oracle.com/iaas/api/#/en/identity-domains/v1/AuthenticationFactorSetting/PutAuthenticationFactorSetting")
                .method(com.oracle.bmc.http.client.Method.PUT)
                .requestBuilder(PutAuthenticationFactorSettingRequest::builder)
                .basePath("")
                .appendPathParam("admin")
                .appendPathParam("v1")
                .appendPathParam("AuthenticationFactorSettings")
                .appendPathParam(request.getAuthenticationFactorSettingId())
                .appendQueryParam("attributes", request.getAttributes())
                .appendListQueryParam(
                        "attributeSets",
                        request.getAttributeSets(),
                        com.oracle.bmc.util.internal.CollectionFormatType.Multi)
                .accept("application/json, application/scim+json")
                .appendHeader("authorization", request.getAuthorization())
                .appendHeader(
                        "resource_type_schema_version", request.getResourceTypeSchemaVersion())
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.identitydomains.model.AuthenticationFactorSetting.class,
                        PutAuthenticationFactorSettingResponse.Builder::authenticationFactorSetting)
                .handleResponseHeaderString(
                        "opc-request-id",
                        PutAuthenticationFactorSettingResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "etag", PutAuthenticationFactorSettingResponse.Builder::etag)
                .callSync();
    }

    @Override
    public PutCloudGateResponse putCloudGate(PutCloudGateRequest request) {

        Validate.notBlank(request.getCloudGateId(), "cloudGateId must not be blank");

        return clientCall(request, PutCloudGateResponse::builder)
                .logger(LOG, "putCloudGate")
                .serviceDetails(
                        "IdentityDomains",
                        "PutCloudGate",
                        "https://docs.oracle.com/iaas/api/#/en/identity-domains/v1/CloudGate/PutCloudGate")
                .method(com.oracle.bmc.http.client.Method.PUT)
                .requestBuilder(PutCloudGateRequest::builder)
                .basePath("")
                .appendPathParam("admin")
                .appendPathParam("v1")
                .appendPathParam("CloudGates")
                .appendPathParam(request.getCloudGateId())
                .appendQueryParam("attributes", request.getAttributes())
                .appendListQueryParam(
                        "attributeSets",
                        request.getAttributeSets(),
                        com.oracle.bmc.util.internal.CollectionFormatType.Multi)
                .accept("application/json, application/scim+json")
                .appendHeader("authorization", request.getAuthorization())
                .appendHeader(
                        "resource_type_schema_version", request.getResourceTypeSchemaVersion())
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.identitydomains.model.CloudGate.class,
                        PutCloudGateResponse.Builder::cloudGate)
                .handleResponseHeaderString(
                        "opc-request-id", PutCloudGateResponse.Builder::opcRequestId)
                .handleResponseHeaderString("etag", PutCloudGateResponse.Builder::etag)
                .callSync();
    }

    @Override
    public PutCloudGateMappingResponse putCloudGateMapping(PutCloudGateMappingRequest request) {

        Validate.notBlank(request.getCloudGateMappingId(), "cloudGateMappingId must not be blank");

        return clientCall(request, PutCloudGateMappingResponse::builder)
                .logger(LOG, "putCloudGateMapping")
                .serviceDetails(
                        "IdentityDomains",
                        "PutCloudGateMapping",
                        "https://docs.oracle.com/iaas/api/#/en/identity-domains/v1/CloudGateMapping/PutCloudGateMapping")
                .method(com.oracle.bmc.http.client.Method.PUT)
                .requestBuilder(PutCloudGateMappingRequest::builder)
                .basePath("")
                .appendPathParam("admin")
                .appendPathParam("v1")
                .appendPathParam("CloudGateMappings")
                .appendPathParam(request.getCloudGateMappingId())
                .appendQueryParam("attributes", request.getAttributes())
                .appendListQueryParam(
                        "attributeSets",
                        request.getAttributeSets(),
                        com.oracle.bmc.util.internal.CollectionFormatType.Multi)
                .accept("application/json, application/scim+json")
                .appendHeader("authorization", request.getAuthorization())
                .appendHeader(
                        "resource_type_schema_version", request.getResourceTypeSchemaVersion())
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.identitydomains.model.CloudGateMapping.class,
                        PutCloudGateMappingResponse.Builder::cloudGateMapping)
                .handleResponseHeaderString(
                        "opc-request-id", PutCloudGateMappingResponse.Builder::opcRequestId)
                .handleResponseHeaderString("etag", PutCloudGateMappingResponse.Builder::etag)
                .callSync();
    }

    @Override
    public PutCloudGateServerResponse putCloudGateServer(PutCloudGateServerRequest request) {

        Validate.notBlank(request.getCloudGateServerId(), "cloudGateServerId must not be blank");

        return clientCall(request, PutCloudGateServerResponse::builder)
                .logger(LOG, "putCloudGateServer")
                .serviceDetails(
                        "IdentityDomains",
                        "PutCloudGateServer",
                        "https://docs.oracle.com/iaas/api/#/en/identity-domains/v1/CloudGateServer/PutCloudGateServer")
                .method(com.oracle.bmc.http.client.Method.PUT)
                .requestBuilder(PutCloudGateServerRequest::builder)
                .basePath("")
                .appendPathParam("admin")
                .appendPathParam("v1")
                .appendPathParam("CloudGateServers")
                .appendPathParam(request.getCloudGateServerId())
                .appendQueryParam("attributes", request.getAttributes())
                .appendListQueryParam(
                        "attributeSets",
                        request.getAttributeSets(),
                        com.oracle.bmc.util.internal.CollectionFormatType.Multi)
                .accept("application/json, application/scim+json")
                .appendHeader("authorization", request.getAuthorization())
                .appendHeader(
                        "resource_type_schema_version", request.getResourceTypeSchemaVersion())
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.identitydomains.model.CloudGateServer.class,
                        PutCloudGateServerResponse.Builder::cloudGateServer)
                .handleResponseHeaderString(
                        "opc-request-id", PutCloudGateServerResponse.Builder::opcRequestId)
                .handleResponseHeaderString("etag", PutCloudGateServerResponse.Builder::etag)
                .callSync();
    }

    @Override
    public PutConditionResponse putCondition(PutConditionRequest request) {

        Validate.notBlank(request.getConditionId(), "conditionId must not be blank");

        return clientCall(request, PutConditionResponse::builder)
                .logger(LOG, "putCondition")
                .serviceDetails(
                        "IdentityDomains",
                        "PutCondition",
                        "https://docs.oracle.com/iaas/api/#/en/identity-domains/v1/Condition/PutCondition")
                .method(com.oracle.bmc.http.client.Method.PUT)
                .requestBuilder(PutConditionRequest::builder)
                .basePath("")
                .appendPathParam("admin")
                .appendPathParam("v1")
                .appendPathParam("Conditions")
                .appendPathParam(request.getConditionId())
                .appendQueryParam("attributes", request.getAttributes())
                .appendListQueryParam(
                        "attributeSets",
                        request.getAttributeSets(),
                        com.oracle.bmc.util.internal.CollectionFormatType.Multi)
                .accept("application/json, application/scim+json")
                .appendHeader("authorization", request.getAuthorization())
                .appendHeader(
                        "resource_type_schema_version", request.getResourceTypeSchemaVersion())
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.identitydomains.model.Condition.class,
                        PutConditionResponse.Builder::condition)
                .handleResponseHeaderString(
                        "opc-request-id", PutConditionResponse.Builder::opcRequestId)
                .handleResponseHeaderString("etag", PutConditionResponse.Builder::etag)
                .callSync();
    }

    @Override
    public PutDynamicResourceGroupResponse putDynamicResourceGroup(
            PutDynamicResourceGroupRequest request) {

        Validate.notBlank(
                request.getDynamicResourceGroupId(), "dynamicResourceGroupId must not be blank");

        return clientCall(request, PutDynamicResourceGroupResponse::builder)
                .logger(LOG, "putDynamicResourceGroup")
                .serviceDetails(
                        "IdentityDomains",
                        "PutDynamicResourceGroup",
                        "https://docs.oracle.com/iaas/api/#/en/identity-domains/v1/DynamicResourceGroup/PutDynamicResourceGroup")
                .method(com.oracle.bmc.http.client.Method.PUT)
                .requestBuilder(PutDynamicResourceGroupRequest::builder)
                .basePath("")
                .appendPathParam("admin")
                .appendPathParam("v1")
                .appendPathParam("DynamicResourceGroups")
                .appendPathParam(request.getDynamicResourceGroupId())
                .appendQueryParam("attributes", request.getAttributes())
                .appendListQueryParam(
                        "attributeSets",
                        request.getAttributeSets(),
                        com.oracle.bmc.util.internal.CollectionFormatType.Multi)
                .accept("application/json, application/scim+json")
                .appendHeader("authorization", request.getAuthorization())
                .appendHeader(
                        "resource_type_schema_version", request.getResourceTypeSchemaVersion())
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.identitydomains.model.DynamicResourceGroup.class,
                        PutDynamicResourceGroupResponse.Builder::dynamicResourceGroup)
                .handleResponseHeaderString(
                        "opc-request-id", PutDynamicResourceGroupResponse.Builder::opcRequestId)
                .handleResponseHeaderString("etag", PutDynamicResourceGroupResponse.Builder::etag)
                .callSync();
    }

    @Override
    public PutGroupResponse putGroup(PutGroupRequest request) {

        Validate.notBlank(request.getGroupId(), "groupId must not be blank");

        return clientCall(request, PutGroupResponse::builder)
                .logger(LOG, "putGroup")
                .serviceDetails(
                        "IdentityDomains",
                        "PutGroup",
                        "https://docs.oracle.com/iaas/api/#/en/identity-domains/v1/Group/PutGroup")
                .method(com.oracle.bmc.http.client.Method.PUT)
                .requestBuilder(PutGroupRequest::builder)
                .basePath("")
                .appendPathParam("admin")
                .appendPathParam("v1")
                .appendPathParam("Groups")
                .appendPathParam(request.getGroupId())
                .appendQueryParam("attributes", request.getAttributes())
                .appendListQueryParam(
                        "attributeSets",
                        request.getAttributeSets(),
                        com.oracle.bmc.util.internal.CollectionFormatType.Multi)
                .accept("application/json, application/scim+json")
                .appendHeader("authorization", request.getAuthorization())
                .appendHeader(
                        "resource_type_schema_version", request.getResourceTypeSchemaVersion())
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.identitydomains.model.Group.class,
                        PutGroupResponse.Builder::group)
                .handleResponseHeaderString(
                        "opc-request-id", PutGroupResponse.Builder::opcRequestId)
                .handleResponseHeaderString("etag", PutGroupResponse.Builder::etag)
                .callSync();
    }

    @Override
    public PutIdentityPropagationTrustResponse putIdentityPropagationTrust(
            PutIdentityPropagationTrustRequest request) {

        Validate.notBlank(
                request.getIdentityPropagationTrustId(),
                "identityPropagationTrustId must not be blank");

        return clientCall(request, PutIdentityPropagationTrustResponse::builder)
                .logger(LOG, "putIdentityPropagationTrust")
                .serviceDetails(
                        "IdentityDomains",
                        "PutIdentityPropagationTrust",
                        "https://docs.oracle.com/iaas/api/#/en/identity-domains/v1/IdentityPropagationTrust/PutIdentityPropagationTrust")
                .method(com.oracle.bmc.http.client.Method.PUT)
                .requestBuilder(PutIdentityPropagationTrustRequest::builder)
                .basePath("")
                .appendPathParam("admin")
                .appendPathParam("v1")
                .appendPathParam("IdentityPropagationTrusts")
                .appendPathParam(request.getIdentityPropagationTrustId())
                .appendQueryParam("attributes", request.getAttributes())
                .appendListQueryParam(
                        "attributeSets",
                        request.getAttributeSets(),
                        com.oracle.bmc.util.internal.CollectionFormatType.Multi)
                .accept("application/json, application/scim+json")
                .appendHeader("authorization", request.getAuthorization())
                .appendHeader(
                        "resource_type_schema_version", request.getResourceTypeSchemaVersion())
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.identitydomains.model.IdentityPropagationTrust.class,
                        PutIdentityPropagationTrustResponse.Builder::identityPropagationTrust)
                .handleResponseHeaderString(
                        "opc-request-id", PutIdentityPropagationTrustResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "etag", PutIdentityPropagationTrustResponse.Builder::etag)
                .callSync();
    }

    @Override
    public PutIdentityProviderResponse putIdentityProvider(PutIdentityProviderRequest request) {

        Validate.notBlank(request.getIdentityProviderId(), "identityProviderId must not be blank");

        return clientCall(request, PutIdentityProviderResponse::builder)
                .logger(LOG, "putIdentityProvider")
                .serviceDetails(
                        "IdentityDomains",
                        "PutIdentityProvider",
                        "https://docs.oracle.com/iaas/api/#/en/identity-domains/v1/IdentityProvider/PutIdentityProvider")
                .method(com.oracle.bmc.http.client.Method.PUT)
                .requestBuilder(PutIdentityProviderRequest::builder)
                .basePath("")
                .appendPathParam("admin")
                .appendPathParam("v1")
                .appendPathParam("IdentityProviders")
                .appendPathParam(request.getIdentityProviderId())
                .appendQueryParam("attributes", request.getAttributes())
                .appendListQueryParam(
                        "attributeSets",
                        request.getAttributeSets(),
                        com.oracle.bmc.util.internal.CollectionFormatType.Multi)
                .accept("application/json, application/scim+json")
                .appendHeader("authorization", request.getAuthorization())
                .appendHeader(
                        "resource_type_schema_version", request.getResourceTypeSchemaVersion())
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.identitydomains.model.IdentityProvider.class,
                        PutIdentityProviderResponse.Builder::identityProvider)
                .handleResponseHeaderString(
                        "opc-request-id", PutIdentityProviderResponse.Builder::opcRequestId)
                .handleResponseHeaderString("etag", PutIdentityProviderResponse.Builder::etag)
                .callSync();
    }

    @Override
    public PutIdentitySettingResponse putIdentitySetting(PutIdentitySettingRequest request) {

        Validate.notBlank(request.getIdentitySettingId(), "identitySettingId must not be blank");

        return clientCall(request, PutIdentitySettingResponse::builder)
                .logger(LOG, "putIdentitySetting")
                .serviceDetails(
                        "IdentityDomains",
                        "PutIdentitySetting",
                        "https://docs.oracle.com/iaas/api/#/en/identity-domains/v1/IdentitySetting/PutIdentitySetting")
                .method(com.oracle.bmc.http.client.Method.PUT)
                .requestBuilder(PutIdentitySettingRequest::builder)
                .basePath("")
                .appendPathParam("admin")
                .appendPathParam("v1")
                .appendPathParam("IdentitySettings")
                .appendPathParam(request.getIdentitySettingId())
                .appendQueryParam("attributes", request.getAttributes())
                .appendListQueryParam(
                        "attributeSets",
                        request.getAttributeSets(),
                        com.oracle.bmc.util.internal.CollectionFormatType.Multi)
                .accept("application/json, application/scim+json")
                .appendHeader("authorization", request.getAuthorization())
                .appendHeader(
                        "resource_type_schema_version", request.getResourceTypeSchemaVersion())
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.identitydomains.model.IdentitySetting.class,
                        PutIdentitySettingResponse.Builder::identitySetting)
                .handleResponseHeaderString(
                        "opc-request-id", PutIdentitySettingResponse.Builder::opcRequestId)
                .handleResponseHeaderString("etag", PutIdentitySettingResponse.Builder::etag)
                .callSync();
    }

    @Override
    public PutKmsiSettingResponse putKmsiSetting(PutKmsiSettingRequest request) {

        Validate.notBlank(request.getKmsiSettingId(), "kmsiSettingId must not be blank");

        return clientCall(request, PutKmsiSettingResponse::builder)
                .logger(LOG, "putKmsiSetting")
                .serviceDetails(
                        "IdentityDomains",
                        "PutKmsiSetting",
                        "https://docs.oracle.com/iaas/api/#/en/identity-domains/v1/KmsiSetting/PutKmsiSetting")
                .method(com.oracle.bmc.http.client.Method.PUT)
                .requestBuilder(PutKmsiSettingRequest::builder)
                .basePath("")
                .appendPathParam("admin")
                .appendPathParam("v1")
                .appendPathParam("KmsiSettings")
                .appendPathParam(request.getKmsiSettingId())
                .appendQueryParam("attributes", request.getAttributes())
                .appendListQueryParam(
                        "attributeSets",
                        request.getAttributeSets(),
                        com.oracle.bmc.util.internal.CollectionFormatType.Multi)
                .accept("application/json, application/scim+json")
                .appendHeader("authorization", request.getAuthorization())
                .appendHeader(
                        "resource_type_schema_version", request.getResourceTypeSchemaVersion())
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.identitydomains.model.KmsiSetting.class,
                        PutKmsiSettingResponse.Builder::kmsiSetting)
                .handleResponseHeaderString(
                        "opc-request-id", PutKmsiSettingResponse.Builder::opcRequestId)
                .handleResponseHeaderString("etag", PutKmsiSettingResponse.Builder::etag)
                .callSync();
    }

    @Override
    public PutMeResponse putMe(PutMeRequest request) {

        return clientCall(request, PutMeResponse::builder)
                .logger(LOG, "putMe")
                .serviceDetails(
                        "IdentityDomains",
                        "PutMe",
                        "https://docs.oracle.com/iaas/api/#/en/identity-domains/v1/Me/PutMe")
                .method(com.oracle.bmc.http.client.Method.PUT)
                .requestBuilder(PutMeRequest::builder)
                .basePath("")
                .appendPathParam("admin")
                .appendPathParam("v1")
                .appendPathParam("Me")
                .appendQueryParam("attributes", request.getAttributes())
                .appendListQueryParam(
                        "attributeSets",
                        request.getAttributeSets(),
                        com.oracle.bmc.util.internal.CollectionFormatType.Multi)
                .accept("application/json, application/scim+json")
                .appendHeader("authorization", request.getAuthorization())
                .appendHeader(
                        "resource_type_schema_version", request.getResourceTypeSchemaVersion())
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.identitydomains.model.Me.class, PutMeResponse.Builder::me)
                .handleResponseHeaderString("opc-request-id", PutMeResponse.Builder::opcRequestId)
                .handleResponseHeaderString("etag", PutMeResponse.Builder::etag)
                .callSync();
    }

    @Override
    public PutMePasswordChangerResponse putMePasswordChanger(PutMePasswordChangerRequest request) {

        return clientCall(request, PutMePasswordChangerResponse::builder)
                .logger(LOG, "putMePasswordChanger")
                .serviceDetails(
                        "IdentityDomains",
                        "PutMePasswordChanger",
                        "https://docs.oracle.com/iaas/api/#/en/identity-domains/v1/MePasswordChanger/PutMePasswordChanger")
                .method(com.oracle.bmc.http.client.Method.PUT)
                .requestBuilder(PutMePasswordChangerRequest::builder)
                .basePath("")
                .appendPathParam("admin")
                .appendPathParam("v1")
                .appendPathParam("MePasswordChanger")
                .accept("application/json, application/scim+json")
                .appendHeader("authorization", request.getAuthorization())
                .appendHeader(
                        "resource_type_schema_version", request.getResourceTypeSchemaVersion())
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.identitydomains.model.MePasswordChanger.class,
                        PutMePasswordChangerResponse.Builder::mePasswordChanger)
                .handleResponseHeaderString(
                        "opc-request-id", PutMePasswordChangerResponse.Builder::opcRequestId)
                .handleResponseHeaderString("etag", PutMePasswordChangerResponse.Builder::etag)
                .callSync();
    }

    @Override
    public PutNetworkPerimeterResponse putNetworkPerimeter(PutNetworkPerimeterRequest request) {

        Validate.notBlank(request.getNetworkPerimeterId(), "networkPerimeterId must not be blank");

        return clientCall(request, PutNetworkPerimeterResponse::builder)
                .logger(LOG, "putNetworkPerimeter")
                .serviceDetails(
                        "IdentityDomains",
                        "PutNetworkPerimeter",
                        "https://docs.oracle.com/iaas/api/#/en/identity-domains/v1/NetworkPerimeter/PutNetworkPerimeter")
                .method(com.oracle.bmc.http.client.Method.PUT)
                .requestBuilder(PutNetworkPerimeterRequest::builder)
                .basePath("")
                .appendPathParam("admin")
                .appendPathParam("v1")
                .appendPathParam("NetworkPerimeters")
                .appendPathParam(request.getNetworkPerimeterId())
                .appendQueryParam("attributes", request.getAttributes())
                .appendListQueryParam(
                        "attributeSets",
                        request.getAttributeSets(),
                        com.oracle.bmc.util.internal.CollectionFormatType.Multi)
                .accept("application/json, application/scim+json")
                .appendHeader("authorization", request.getAuthorization())
                .appendHeader(
                        "resource_type_schema_version", request.getResourceTypeSchemaVersion())
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.identitydomains.model.NetworkPerimeter.class,
                        PutNetworkPerimeterResponse.Builder::networkPerimeter)
                .handleResponseHeaderString(
                        "opc-request-id", PutNetworkPerimeterResponse.Builder::opcRequestId)
                .handleResponseHeaderString("etag", PutNetworkPerimeterResponse.Builder::etag)
                .callSync();
    }

    @Override
    public PutNotificationSettingResponse putNotificationSetting(
            PutNotificationSettingRequest request) {

        Validate.notBlank(
                request.getNotificationSettingId(), "notificationSettingId must not be blank");

        return clientCall(request, PutNotificationSettingResponse::builder)
                .logger(LOG, "putNotificationSetting")
                .serviceDetails(
                        "IdentityDomains",
                        "PutNotificationSetting",
                        "https://docs.oracle.com/iaas/api/#/en/identity-domains/v1/NotificationSetting/PutNotificationSetting")
                .method(com.oracle.bmc.http.client.Method.PUT)
                .requestBuilder(PutNotificationSettingRequest::builder)
                .basePath("")
                .appendPathParam("admin")
                .appendPathParam("v1")
                .appendPathParam("NotificationSettings")
                .appendPathParam(request.getNotificationSettingId())
                .appendQueryParam("attributes", request.getAttributes())
                .appendListQueryParam(
                        "attributeSets",
                        request.getAttributeSets(),
                        com.oracle.bmc.util.internal.CollectionFormatType.Multi)
                .accept("application/json, application/scim+json")
                .appendHeader("authorization", request.getAuthorization())
                .appendHeader(
                        "resource_type_schema_version", request.getResourceTypeSchemaVersion())
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.identitydomains.model.NotificationSetting.class,
                        PutNotificationSettingResponse.Builder::notificationSetting)
                .handleResponseHeaderString(
                        "opc-request-id", PutNotificationSettingResponse.Builder::opcRequestId)
                .handleResponseHeaderString("etag", PutNotificationSettingResponse.Builder::etag)
                .callSync();
    }

    @Override
    public PutPasswordPolicyResponse putPasswordPolicy(PutPasswordPolicyRequest request) {

        Validate.notBlank(request.getPasswordPolicyId(), "passwordPolicyId must not be blank");

        return clientCall(request, PutPasswordPolicyResponse::builder)
                .logger(LOG, "putPasswordPolicy")
                .serviceDetails(
                        "IdentityDomains",
                        "PutPasswordPolicy",
                        "https://docs.oracle.com/iaas/api/#/en/identity-domains/v1/PasswordPolicy/PutPasswordPolicy")
                .method(com.oracle.bmc.http.client.Method.PUT)
                .requestBuilder(PutPasswordPolicyRequest::builder)
                .basePath("")
                .appendPathParam("admin")
                .appendPathParam("v1")
                .appendPathParam("PasswordPolicies")
                .appendPathParam(request.getPasswordPolicyId())
                .appendQueryParam("attributes", request.getAttributes())
                .appendListQueryParam(
                        "attributeSets",
                        request.getAttributeSets(),
                        com.oracle.bmc.util.internal.CollectionFormatType.Multi)
                .accept("application/json, application/scim+json")
                .appendHeader("authorization", request.getAuthorization())
                .appendHeader(
                        "resource_type_schema_version", request.getResourceTypeSchemaVersion())
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.identitydomains.model.PasswordPolicy.class,
                        PutPasswordPolicyResponse.Builder::passwordPolicy)
                .handleResponseHeaderString(
                        "opc-request-id", PutPasswordPolicyResponse.Builder::opcRequestId)
                .handleResponseHeaderString("etag", PutPasswordPolicyResponse.Builder::etag)
                .callSync();
    }

    @Override
    public PutPolicyResponse putPolicy(PutPolicyRequest request) {

        Validate.notBlank(request.getPolicyId(), "policyId must not be blank");

        return clientCall(request, PutPolicyResponse::builder)
                .logger(LOG, "putPolicy")
                .serviceDetails(
                        "IdentityDomains",
                        "PutPolicy",
                        "https://docs.oracle.com/iaas/api/#/en/identity-domains/v1/Policy/PutPolicy")
                .method(com.oracle.bmc.http.client.Method.PUT)
                .requestBuilder(PutPolicyRequest::builder)
                .basePath("")
                .appendPathParam("admin")
                .appendPathParam("v1")
                .appendPathParam("Policies")
                .appendPathParam(request.getPolicyId())
                .appendQueryParam("attributes", request.getAttributes())
                .appendListQueryParam(
                        "attributeSets",
                        request.getAttributeSets(),
                        com.oracle.bmc.util.internal.CollectionFormatType.Multi)
                .accept("application/json, application/scim+json")
                .appendHeader("authorization", request.getAuthorization())
                .appendHeader(
                        "resource_type_schema_version", request.getResourceTypeSchemaVersion())
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.identitydomains.model.Policy.class,
                        PutPolicyResponse.Builder::policy)
                .handleResponseHeaderString(
                        "opc-request-id", PutPolicyResponse.Builder::opcRequestId)
                .handleResponseHeaderString("etag", PutPolicyResponse.Builder::etag)
                .callSync();
    }

    @Override
    public PutRuleResponse putRule(PutRuleRequest request) {

        Validate.notBlank(request.getRuleId(), "ruleId must not be blank");

        return clientCall(request, PutRuleResponse::builder)
                .logger(LOG, "putRule")
                .serviceDetails(
                        "IdentityDomains",
                        "PutRule",
                        "https://docs.oracle.com/iaas/api/#/en/identity-domains/v1/Rule/PutRule")
                .method(com.oracle.bmc.http.client.Method.PUT)
                .requestBuilder(PutRuleRequest::builder)
                .basePath("")
                .appendPathParam("admin")
                .appendPathParam("v1")
                .appendPathParam("Rules")
                .appendPathParam(request.getRuleId())
                .appendQueryParam("attributes", request.getAttributes())
                .appendListQueryParam(
                        "attributeSets",
                        request.getAttributeSets(),
                        com.oracle.bmc.util.internal.CollectionFormatType.Multi)
                .accept("application/json, application/scim+json")
                .appendHeader("authorization", request.getAuthorization())
                .appendHeader(
                        "resource_type_schema_version", request.getResourceTypeSchemaVersion())
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.identitydomains.model.Rule.class,
                        PutRuleResponse.Builder::rule)
                .handleResponseHeaderString("opc-request-id", PutRuleResponse.Builder::opcRequestId)
                .handleResponseHeaderString("etag", PutRuleResponse.Builder::etag)
                .callSync();
    }

    @Override
    public PutSchemaResponse putSchema(PutSchemaRequest request) {

        Validate.notBlank(request.getSchemaId(), "schemaId must not be blank");

        return clientCall(request, PutSchemaResponse::builder)
                .logger(LOG, "putSchema")
                .serviceDetails(
                        "IdentityDomains",
                        "PutSchema",
                        "https://docs.oracle.com/iaas/api/#/en/identity-domains/v1/Schema/PutSchema")
                .method(com.oracle.bmc.http.client.Method.PUT)
                .requestBuilder(PutSchemaRequest::builder)
                .basePath("")
                .appendPathParam("admin")
                .appendPathParam("v1")
                .appendPathParam("Schemas")
                .appendPathParam(request.getSchemaId())
                .accept("application/json, application/scim+json")
                .appendHeader("authorization", request.getAuthorization())
                .appendHeader(
                        "resource_type_schema_version", request.getResourceTypeSchemaVersion())
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.identitydomains.model.Schema.class,
                        PutSchemaResponse.Builder::schema)
                .handleResponseHeaderString(
                        "opc-request-id", PutSchemaResponse.Builder::opcRequestId)
                .handleResponseHeaderString("etag", PutSchemaResponse.Builder::etag)
                .callSync();
    }

    @Override
    public PutSecurityQuestionSettingResponse putSecurityQuestionSetting(
            PutSecurityQuestionSettingRequest request) {

        Validate.notBlank(
                request.getSecurityQuestionSettingId(),
                "securityQuestionSettingId must not be blank");

        return clientCall(request, PutSecurityQuestionSettingResponse::builder)
                .logger(LOG, "putSecurityQuestionSetting")
                .serviceDetails(
                        "IdentityDomains",
                        "PutSecurityQuestionSetting",
                        "https://docs.oracle.com/iaas/api/#/en/identity-domains/v1/SecurityQuestionSetting/PutSecurityQuestionSetting")
                .method(com.oracle.bmc.http.client.Method.PUT)
                .requestBuilder(PutSecurityQuestionSettingRequest::builder)
                .basePath("")
                .appendPathParam("admin")
                .appendPathParam("v1")
                .appendPathParam("SecurityQuestionSettings")
                .appendPathParam(request.getSecurityQuestionSettingId())
                .appendQueryParam("attributes", request.getAttributes())
                .appendListQueryParam(
                        "attributeSets",
                        request.getAttributeSets(),
                        com.oracle.bmc.util.internal.CollectionFormatType.Multi)
                .accept("application/json, application/scim+json")
                .appendHeader("authorization", request.getAuthorization())
                .appendHeader(
                        "resource_type_schema_version", request.getResourceTypeSchemaVersion())
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.identitydomains.model.SecurityQuestionSetting.class,
                        PutSecurityQuestionSettingResponse.Builder::securityQuestionSetting)
                .handleResponseHeaderString(
                        "opc-request-id", PutSecurityQuestionSettingResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "etag", PutSecurityQuestionSettingResponse.Builder::etag)
                .callSync();
    }

    @Override
    public PutSelfRegistrationProfileResponse putSelfRegistrationProfile(
            PutSelfRegistrationProfileRequest request) {

        Validate.notBlank(
                request.getSelfRegistrationProfileId(),
                "selfRegistrationProfileId must not be blank");

        return clientCall(request, PutSelfRegistrationProfileResponse::builder)
                .logger(LOG, "putSelfRegistrationProfile")
                .serviceDetails(
                        "IdentityDomains",
                        "PutSelfRegistrationProfile",
                        "https://docs.oracle.com/iaas/api/#/en/identity-domains/v1/SelfRegistrationProfile/PutSelfRegistrationProfile")
                .method(com.oracle.bmc.http.client.Method.PUT)
                .requestBuilder(PutSelfRegistrationProfileRequest::builder)
                .basePath("")
                .appendPathParam("admin")
                .appendPathParam("v1")
                .appendPathParam("SelfRegistrationProfiles")
                .appendPathParam(request.getSelfRegistrationProfileId())
                .appendQueryParam("attributes", request.getAttributes())
                .appendListQueryParam(
                        "attributeSets",
                        request.getAttributeSets(),
                        com.oracle.bmc.util.internal.CollectionFormatType.Multi)
                .accept("application/json, application/scim+json")
                .appendHeader("authorization", request.getAuthorization())
                .appendHeader(
                        "resource_type_schema_version", request.getResourceTypeSchemaVersion())
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.identitydomains.model.SelfRegistrationProfile.class,
                        PutSelfRegistrationProfileResponse.Builder::selfRegistrationProfile)
                .handleResponseHeaderString(
                        "opc-request-id", PutSelfRegistrationProfileResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "etag", PutSelfRegistrationProfileResponse.Builder::etag)
                .callSync();
    }

    @Override
    public PutSettingResponse putSetting(PutSettingRequest request) {

        Validate.notBlank(request.getSettingId(), "settingId must not be blank");

        return clientCall(request, PutSettingResponse::builder)
                .logger(LOG, "putSetting")
                .serviceDetails(
                        "IdentityDomains",
                        "PutSetting",
                        "https://docs.oracle.com/iaas/api/#/en/identity-domains/v1/Setting/PutSetting")
                .method(com.oracle.bmc.http.client.Method.PUT)
                .requestBuilder(PutSettingRequest::builder)
                .basePath("")
                .appendPathParam("admin")
                .appendPathParam("v1")
                .appendPathParam("Settings")
                .appendPathParam(request.getSettingId())
                .appendQueryParam("attributes", request.getAttributes())
                .appendListQueryParam(
                        "attributeSets",
                        request.getAttributeSets(),
                        com.oracle.bmc.util.internal.CollectionFormatType.Multi)
                .accept("application/json, application/scim+json")
                .appendHeader("authorization", request.getAuthorization())
                .appendHeader(
                        "resource_type_schema_version", request.getResourceTypeSchemaVersion())
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.identitydomains.model.Setting.class,
                        PutSettingResponse.Builder::setting)
                .handleResponseHeaderString(
                        "opc-request-id", PutSettingResponse.Builder::opcRequestId)
                .handleResponseHeaderString("etag", PutSettingResponse.Builder::etag)
                .callSync();
    }

    @Override
    public PutSocialIdentityProviderResponse putSocialIdentityProvider(
            PutSocialIdentityProviderRequest request) {

        Validate.notBlank(
                request.getSocialIdentityProviderId(),
                "socialIdentityProviderId must not be blank");

        return clientCall(request, PutSocialIdentityProviderResponse::builder)
                .logger(LOG, "putSocialIdentityProvider")
                .serviceDetails(
                        "IdentityDomains",
                        "PutSocialIdentityProvider",
                        "https://docs.oracle.com/iaas/api/#/en/identity-domains/v1/SocialIdentityProvider/PutSocialIdentityProvider")
                .method(com.oracle.bmc.http.client.Method.PUT)
                .requestBuilder(PutSocialIdentityProviderRequest::builder)
                .basePath("")
                .appendPathParam("admin")
                .appendPathParam("v1")
                .appendPathParam("SocialIdentityProviders")
                .appendPathParam(request.getSocialIdentityProviderId())
                .accept("application/json, application/scim+json")
                .appendHeader("authorization", request.getAuthorization())
                .appendHeader(
                        "resource_type_schema_version", request.getResourceTypeSchemaVersion())
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.identitydomains.model.SocialIdentityProvider.class,
                        PutSocialIdentityProviderResponse.Builder::socialIdentityProvider)
                .handleResponseHeaderString(
                        "opc-request-id", PutSocialIdentityProviderResponse.Builder::opcRequestId)
                .handleResponseHeaderString("etag", PutSocialIdentityProviderResponse.Builder::etag)
                .callSync();
    }

    @Override
    public PutUserResponse putUser(PutUserRequest request) {

        Validate.notBlank(request.getUserId(), "userId must not be blank");

        return clientCall(request, PutUserResponse::builder)
                .logger(LOG, "putUser")
                .serviceDetails(
                        "IdentityDomains",
                        "PutUser",
                        "https://docs.oracle.com/iaas/api/#/en/identity-domains/v1/User/PutUser")
                .method(com.oracle.bmc.http.client.Method.PUT)
                .requestBuilder(PutUserRequest::builder)
                .basePath("")
                .appendPathParam("admin")
                .appendPathParam("v1")
                .appendPathParam("Users")
                .appendPathParam(request.getUserId())
                .appendQueryParam("attributes", request.getAttributes())
                .appendListQueryParam(
                        "attributeSets",
                        request.getAttributeSets(),
                        com.oracle.bmc.util.internal.CollectionFormatType.Multi)
                .accept("application/json, application/scim+json")
                .appendHeader("authorization", request.getAuthorization())
                .appendHeader(
                        "resource_type_schema_version", request.getResourceTypeSchemaVersion())
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.identitydomains.model.User.class,
                        PutUserResponse.Builder::user)
                .handleResponseHeaderString("opc-request-id", PutUserResponse.Builder::opcRequestId)
                .handleResponseHeaderString("etag", PutUserResponse.Builder::etag)
                .callSync();
    }

    @Override
    public PutUserCapabilitiesChangerResponse putUserCapabilitiesChanger(
            PutUserCapabilitiesChangerRequest request) {

        Validate.notBlank(
                request.getUserCapabilitiesChangerId(),
                "userCapabilitiesChangerId must not be blank");

        return clientCall(request, PutUserCapabilitiesChangerResponse::builder)
                .logger(LOG, "putUserCapabilitiesChanger")
                .serviceDetails(
                        "IdentityDomains",
                        "PutUserCapabilitiesChanger",
                        "https://docs.oracle.com/iaas/api/#/en/identity-domains/v1/UserCapabilitiesChanger/PutUserCapabilitiesChanger")
                .method(com.oracle.bmc.http.client.Method.PUT)
                .requestBuilder(PutUserCapabilitiesChangerRequest::builder)
                .basePath("")
                .appendPathParam("admin")
                .appendPathParam("v1")
                .appendPathParam("UserCapabilitiesChanger")
                .appendPathParam(request.getUserCapabilitiesChangerId())
                .accept("application/json, application/scim+json")
                .appendHeader("authorization", request.getAuthorization())
                .appendHeader(
                        "resource_type_schema_version", request.getResourceTypeSchemaVersion())
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.identitydomains.model.UserCapabilitiesChanger.class,
                        PutUserCapabilitiesChangerResponse.Builder::userCapabilitiesChanger)
                .handleResponseHeaderString(
                        "opc-request-id", PutUserCapabilitiesChangerResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "etag", PutUserCapabilitiesChangerResponse.Builder::etag)
                .callSync();
    }

    @Override
    public PutUserPasswordChangerResponse putUserPasswordChanger(
            PutUserPasswordChangerRequest request) {

        Validate.notBlank(
                request.getUserPasswordChangerId(), "userPasswordChangerId must not be blank");

        return clientCall(request, PutUserPasswordChangerResponse::builder)
                .logger(LOG, "putUserPasswordChanger")
                .serviceDetails(
                        "IdentityDomains",
                        "PutUserPasswordChanger",
                        "https://docs.oracle.com/iaas/api/#/en/identity-domains/v1/UserPasswordChanger/PutUserPasswordChanger")
                .method(com.oracle.bmc.http.client.Method.PUT)
                .requestBuilder(PutUserPasswordChangerRequest::builder)
                .basePath("")
                .appendPathParam("admin")
                .appendPathParam("v1")
                .appendPathParam("UserPasswordChanger")
                .appendPathParam(request.getUserPasswordChangerId())
                .accept("application/json, application/scim+json")
                .appendHeader("authorization", request.getAuthorization())
                .appendHeader(
                        "resource_type_schema_version", request.getResourceTypeSchemaVersion())
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.identitydomains.model.UserPasswordChanger.class,
                        PutUserPasswordChangerResponse.Builder::userPasswordChanger)
                .handleResponseHeaderString(
                        "opc-request-id", PutUserPasswordChangerResponse.Builder::opcRequestId)
                .handleResponseHeaderString("etag", PutUserPasswordChangerResponse.Builder::etag)
                .callSync();
    }

    @Override
    public PutUserPasswordResetterResponse putUserPasswordResetter(
            PutUserPasswordResetterRequest request) {

        Validate.notBlank(
                request.getUserPasswordResetterId(), "userPasswordResetterId must not be blank");

        return clientCall(request, PutUserPasswordResetterResponse::builder)
                .logger(LOG, "putUserPasswordResetter")
                .serviceDetails(
                        "IdentityDomains",
                        "PutUserPasswordResetter",
                        "https://docs.oracle.com/iaas/api/#/en/identity-domains/v1/UserPasswordResetter/PutUserPasswordResetter")
                .method(com.oracle.bmc.http.client.Method.PUT)
                .requestBuilder(PutUserPasswordResetterRequest::builder)
                .basePath("")
                .appendPathParam("admin")
                .appendPathParam("v1")
                .appendPathParam("UserPasswordResetter")
                .appendPathParam(request.getUserPasswordResetterId())
                .accept("application/json, application/scim+json")
                .appendHeader("authorization", request.getAuthorization())
                .appendHeader(
                        "resource_type_schema_version", request.getResourceTypeSchemaVersion())
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.identitydomains.model.UserPasswordResetter.class,
                        PutUserPasswordResetterResponse.Builder::userPasswordResetter)
                .handleResponseHeaderString(
                        "opc-request-id", PutUserPasswordResetterResponse.Builder::opcRequestId)
                .handleResponseHeaderString("etag", PutUserPasswordResetterResponse.Builder::etag)
                .callSync();
    }

    @Override
    public PutUserStatusChangerResponse putUserStatusChanger(PutUserStatusChangerRequest request) {

        Validate.notBlank(
                request.getUserStatusChangerId(), "userStatusChangerId must not be blank");

        return clientCall(request, PutUserStatusChangerResponse::builder)
                .logger(LOG, "putUserStatusChanger")
                .serviceDetails(
                        "IdentityDomains",
                        "PutUserStatusChanger",
                        "https://docs.oracle.com/iaas/api/#/en/identity-domains/v1/UserStatusChanger/PutUserStatusChanger")
                .method(com.oracle.bmc.http.client.Method.PUT)
                .requestBuilder(PutUserStatusChangerRequest::builder)
                .basePath("")
                .appendPathParam("admin")
                .appendPathParam("v1")
                .appendPathParam("UserStatusChanger")
                .appendPathParam(request.getUserStatusChangerId())
                .appendQueryParam("attributes", request.getAttributes())
                .appendListQueryParam(
                        "attributeSets",
                        request.getAttributeSets(),
                        com.oracle.bmc.util.internal.CollectionFormatType.Multi)
                .accept("application/json, application/scim+json")
                .appendHeader("authorization", request.getAuthorization())
                .appendHeader(
                        "resource_type_schema_version", request.getResourceTypeSchemaVersion())
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.identitydomains.model.UserStatusChanger.class,
                        PutUserStatusChangerResponse.Builder::userStatusChanger)
                .handleResponseHeaderString(
                        "opc-request-id", PutUserStatusChangerResponse.Builder::opcRequestId)
                .handleResponseHeaderString("etag", PutUserStatusChangerResponse.Builder::etag)
                .callSync();
    }

    @Override
    public SearchAccountMgmtInfosResponse searchAccountMgmtInfos(
            SearchAccountMgmtInfosRequest request) {

        return clientCall(request, SearchAccountMgmtInfosResponse::builder)
                .logger(LOG, "searchAccountMgmtInfos")
                .serviceDetails(
                        "IdentityDomains",
                        "SearchAccountMgmtInfos",
                        "https://docs.oracle.com/iaas/api/#/en/identity-domains/v1/AccountMgmtInfos/SearchAccountMgmtInfos")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(SearchAccountMgmtInfosRequest::builder)
                .basePath("")
                .appendPathParam("admin")
                .appendPathParam("v1")
                .appendPathParam("AccountMgmtInfos")
                .appendPathParam(".search")
                .appendQueryParam("page", request.getPage())
                .appendQueryParam("limit", request.getLimit())
                .accept("application/json, application/scim+json")
                .appendHeader("authorization", request.getAuthorization())
                .appendHeader(
                        "resource_type_schema_version", request.getResourceTypeSchemaVersion())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.identitydomains.model.AccountMgmtInfos.class,
                        SearchAccountMgmtInfosResponse.Builder::accountMgmtInfos)
                .handleResponseHeaderString(
                        "opc-request-id", SearchAccountMgmtInfosResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", SearchAccountMgmtInfosResponse.Builder::opcNextPage)
                .callSync();
    }

    @Override
    public SearchApiKeysResponse searchApiKeys(SearchApiKeysRequest request) {

        return clientCall(request, SearchApiKeysResponse::builder)
                .logger(LOG, "searchApiKeys")
                .serviceDetails(
                        "IdentityDomains",
                        "SearchApiKeys",
                        "https://docs.oracle.com/iaas/api/#/en/identity-domains/v1/ApiKeys/SearchApiKeys")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(SearchApiKeysRequest::builder)
                .basePath("")
                .appendPathParam("admin")
                .appendPathParam("v1")
                .appendPathParam("ApiKeys")
                .appendPathParam(".search")
                .appendQueryParam("page", request.getPage())
                .appendQueryParam("limit", request.getLimit())
                .accept("application/json, application/scim+json")
                .appendHeader("authorization", request.getAuthorization())
                .appendHeader(
                        "resource_type_schema_version", request.getResourceTypeSchemaVersion())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.identitydomains.model.ApiKeys.class,
                        SearchApiKeysResponse.Builder::apiKeys)
                .handleResponseHeaderString(
                        "opc-request-id", SearchApiKeysResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", SearchApiKeysResponse.Builder::opcNextPage)
                .callSync();
    }

    @Override
    public SearchAppRolesResponse searchAppRoles(SearchAppRolesRequest request) {

        return clientCall(request, SearchAppRolesResponse::builder)
                .logger(LOG, "searchAppRoles")
                .serviceDetails(
                        "IdentityDomains",
                        "SearchAppRoles",
                        "https://docs.oracle.com/iaas/api/#/en/identity-domains/v1/AppRoles/SearchAppRoles")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(SearchAppRolesRequest::builder)
                .basePath("")
                .appendPathParam("admin")
                .appendPathParam("v1")
                .appendPathParam("AppRoles")
                .appendPathParam(".search")
                .appendQueryParam("page", request.getPage())
                .appendQueryParam("limit", request.getLimit())
                .accept("application/json, application/scim+json")
                .appendHeader("authorization", request.getAuthorization())
                .appendHeader(
                        "resource_type_schema_version", request.getResourceTypeSchemaVersion())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.identitydomains.model.AppRoles.class,
                        SearchAppRolesResponse.Builder::appRoles)
                .handleResponseHeaderString(
                        "opc-request-id", SearchAppRolesResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", SearchAppRolesResponse.Builder::opcNextPage)
                .callSync();
    }

    @Override
    public SearchAppsResponse searchApps(SearchAppsRequest request) {

        return clientCall(request, SearchAppsResponse::builder)
                .logger(LOG, "searchApps")
                .serviceDetails(
                        "IdentityDomains",
                        "SearchApps",
                        "https://docs.oracle.com/iaas/api/#/en/identity-domains/v1/Apps/SearchApps")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(SearchAppsRequest::builder)
                .basePath("")
                .appendPathParam("admin")
                .appendPathParam("v1")
                .appendPathParam("Apps")
                .appendPathParam(".search")
                .appendQueryParam("page", request.getPage())
                .appendQueryParam("limit", request.getLimit())
                .accept("application/json, application/scim+json")
                .appendHeader("authorization", request.getAuthorization())
                .appendHeader(
                        "resource_type_schema_version", request.getResourceTypeSchemaVersion())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.identitydomains.model.Apps.class,
                        SearchAppsResponse.Builder::apps)
                .handleResponseHeaderString(
                        "opc-request-id", SearchAppsResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", SearchAppsResponse.Builder::opcNextPage)
                .callSync();
    }

    @Override
    public SearchAuthTokensResponse searchAuthTokens(SearchAuthTokensRequest request) {

        return clientCall(request, SearchAuthTokensResponse::builder)
                .logger(LOG, "searchAuthTokens")
                .serviceDetails(
                        "IdentityDomains",
                        "SearchAuthTokens",
                        "https://docs.oracle.com/iaas/api/#/en/identity-domains/v1/AuthTokens/SearchAuthTokens")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(SearchAuthTokensRequest::builder)
                .basePath("")
                .appendPathParam("admin")
                .appendPathParam("v1")
                .appendPathParam("AuthTokens")
                .appendPathParam(".search")
                .appendQueryParam("page", request.getPage())
                .appendQueryParam("limit", request.getLimit())
                .accept("application/json, application/scim+json")
                .appendHeader("authorization", request.getAuthorization())
                .appendHeader(
                        "resource_type_schema_version", request.getResourceTypeSchemaVersion())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.identitydomains.model.AuthTokens.class,
                        SearchAuthTokensResponse.Builder::authTokens)
                .handleResponseHeaderString(
                        "opc-request-id", SearchAuthTokensResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", SearchAuthTokensResponse.Builder::opcNextPage)
                .callSync();
    }

    @Override
    public SearchAuthenticationFactorSettingsResponse searchAuthenticationFactorSettings(
            SearchAuthenticationFactorSettingsRequest request) {

        return clientCall(request, SearchAuthenticationFactorSettingsResponse::builder)
                .logger(LOG, "searchAuthenticationFactorSettings")
                .serviceDetails(
                        "IdentityDomains",
                        "SearchAuthenticationFactorSettings",
                        "https://docs.oracle.com/iaas/api/#/en/identity-domains/v1/AuthenticationFactorSettings/SearchAuthenticationFactorSettings")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(SearchAuthenticationFactorSettingsRequest::builder)
                .basePath("")
                .appendPathParam("admin")
                .appendPathParam("v1")
                .appendPathParam("AuthenticationFactorSettings")
                .appendPathParam(".search")
                .appendQueryParam("page", request.getPage())
                .appendQueryParam("limit", request.getLimit())
                .accept("application/json, application/scim+json")
                .appendHeader("authorization", request.getAuthorization())
                .appendHeader(
                        "resource_type_schema_version", request.getResourceTypeSchemaVersion())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.identitydomains.model.AuthenticationFactorSettings.class,
                        SearchAuthenticationFactorSettingsResponse.Builder
                                ::authenticationFactorSettings)
                .handleResponseHeaderString(
                        "opc-request-id",
                        SearchAuthenticationFactorSettingsResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page",
                        SearchAuthenticationFactorSettingsResponse.Builder::opcNextPage)
                .callSync();
    }

    @Override
    public SearchCloudGateMappingsResponse searchCloudGateMappings(
            SearchCloudGateMappingsRequest request) {

        return clientCall(request, SearchCloudGateMappingsResponse::builder)
                .logger(LOG, "searchCloudGateMappings")
                .serviceDetails(
                        "IdentityDomains",
                        "SearchCloudGateMappings",
                        "https://docs.oracle.com/iaas/api/#/en/identity-domains/v1/CloudGateMappings/SearchCloudGateMappings")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(SearchCloudGateMappingsRequest::builder)
                .basePath("")
                .appendPathParam("admin")
                .appendPathParam("v1")
                .appendPathParam("CloudGateMappings")
                .appendPathParam(".search")
                .appendQueryParam("page", request.getPage())
                .appendQueryParam("limit", request.getLimit())
                .accept("application/json, application/scim+json")
                .appendHeader("authorization", request.getAuthorization())
                .appendHeader(
                        "resource_type_schema_version", request.getResourceTypeSchemaVersion())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.identitydomains.model.CloudGateMappings.class,
                        SearchCloudGateMappingsResponse.Builder::cloudGateMappings)
                .handleResponseHeaderString(
                        "opc-request-id", SearchCloudGateMappingsResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", SearchCloudGateMappingsResponse.Builder::opcNextPage)
                .callSync();
    }

    @Override
    public SearchCloudGateServersResponse searchCloudGateServers(
            SearchCloudGateServersRequest request) {

        return clientCall(request, SearchCloudGateServersResponse::builder)
                .logger(LOG, "searchCloudGateServers")
                .serviceDetails(
                        "IdentityDomains",
                        "SearchCloudGateServers",
                        "https://docs.oracle.com/iaas/api/#/en/identity-domains/v1/CloudGateServers/SearchCloudGateServers")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(SearchCloudGateServersRequest::builder)
                .basePath("")
                .appendPathParam("admin")
                .appendPathParam("v1")
                .appendPathParam("CloudGateServers")
                .appendPathParam(".search")
                .appendQueryParam("page", request.getPage())
                .appendQueryParam("limit", request.getLimit())
                .accept("application/json, application/scim+json")
                .appendHeader("authorization", request.getAuthorization())
                .appendHeader(
                        "resource_type_schema_version", request.getResourceTypeSchemaVersion())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.identitydomains.model.CloudGateServers.class,
                        SearchCloudGateServersResponse.Builder::cloudGateServers)
                .handleResponseHeaderString(
                        "opc-request-id", SearchCloudGateServersResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", SearchCloudGateServersResponse.Builder::opcNextPage)
                .callSync();
    }

    @Override
    public SearchCloudGatesResponse searchCloudGates(SearchCloudGatesRequest request) {

        return clientCall(request, SearchCloudGatesResponse::builder)
                .logger(LOG, "searchCloudGates")
                .serviceDetails(
                        "IdentityDomains",
                        "SearchCloudGates",
                        "https://docs.oracle.com/iaas/api/#/en/identity-domains/v1/CloudGates/SearchCloudGates")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(SearchCloudGatesRequest::builder)
                .basePath("")
                .appendPathParam("admin")
                .appendPathParam("v1")
                .appendPathParam("CloudGates")
                .appendPathParam(".search")
                .appendQueryParam("page", request.getPage())
                .appendQueryParam("limit", request.getLimit())
                .accept("application/json, application/scim+json")
                .appendHeader("authorization", request.getAuthorization())
                .appendHeader(
                        "resource_type_schema_version", request.getResourceTypeSchemaVersion())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.identitydomains.model.CloudGates.class,
                        SearchCloudGatesResponse.Builder::cloudGates)
                .handleResponseHeaderString(
                        "opc-request-id", SearchCloudGatesResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", SearchCloudGatesResponse.Builder::opcNextPage)
                .callSync();
    }

    @Override
    public SearchConditionsResponse searchConditions(SearchConditionsRequest request) {

        return clientCall(request, SearchConditionsResponse::builder)
                .logger(LOG, "searchConditions")
                .serviceDetails(
                        "IdentityDomains",
                        "SearchConditions",
                        "https://docs.oracle.com/iaas/api/#/en/identity-domains/v1/Condition/SearchConditions")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(SearchConditionsRequest::builder)
                .basePath("")
                .appendPathParam("admin")
                .appendPathParam("v1")
                .appendPathParam("Conditions")
                .appendPathParam(".search")
                .appendQueryParam("page", request.getPage())
                .appendQueryParam("limit", request.getLimit())
                .accept("application/json, application/scim+json")
                .appendHeader("authorization", request.getAuthorization())
                .appendHeader(
                        "resource_type_schema_version", request.getResourceTypeSchemaVersion())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.identitydomains.model.Conditions.class,
                        SearchConditionsResponse.Builder::conditions)
                .handleResponseHeaderString(
                        "opc-request-id", SearchConditionsResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", SearchConditionsResponse.Builder::opcNextPage)
                .callSync();
    }

    @Override
    public SearchCustomerSecretKeysResponse searchCustomerSecretKeys(
            SearchCustomerSecretKeysRequest request) {

        return clientCall(request, SearchCustomerSecretKeysResponse::builder)
                .logger(LOG, "searchCustomerSecretKeys")
                .serviceDetails(
                        "IdentityDomains",
                        "SearchCustomerSecretKeys",
                        "https://docs.oracle.com/iaas/api/#/en/identity-domains/v1/CustomerSecretKeys/SearchCustomerSecretKeys")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(SearchCustomerSecretKeysRequest::builder)
                .basePath("")
                .appendPathParam("admin")
                .appendPathParam("v1")
                .appendPathParam("CustomerSecretKeys")
                .appendPathParam(".search")
                .appendQueryParam("page", request.getPage())
                .appendQueryParam("limit", request.getLimit())
                .accept("application/json, application/scim+json")
                .appendHeader("authorization", request.getAuthorization())
                .appendHeader(
                        "resource_type_schema_version", request.getResourceTypeSchemaVersion())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.identitydomains.model.CustomerSecretKeys.class,
                        SearchCustomerSecretKeysResponse.Builder::customerSecretKeys)
                .handleResponseHeaderString(
                        "opc-request-id", SearchCustomerSecretKeysResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", SearchCustomerSecretKeysResponse.Builder::opcNextPage)
                .callSync();
    }

    @Override
    public SearchDynamicResourceGroupsResponse searchDynamicResourceGroups(
            SearchDynamicResourceGroupsRequest request) {

        return clientCall(request, SearchDynamicResourceGroupsResponse::builder)
                .logger(LOG, "searchDynamicResourceGroups")
                .serviceDetails(
                        "IdentityDomains",
                        "SearchDynamicResourceGroups",
                        "https://docs.oracle.com/iaas/api/#/en/identity-domains/v1/DynamicResourceGroups/SearchDynamicResourceGroups")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(SearchDynamicResourceGroupsRequest::builder)
                .basePath("")
                .appendPathParam("admin")
                .appendPathParam("v1")
                .appendPathParam("DynamicResourceGroups")
                .appendPathParam(".search")
                .appendQueryParam("page", request.getPage())
                .appendQueryParam("limit", request.getLimit())
                .accept("application/json, application/scim+json")
                .appendHeader("authorization", request.getAuthorization())
                .appendHeader(
                        "resource_type_schema_version", request.getResourceTypeSchemaVersion())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.identitydomains.model.DynamicResourceGroups.class,
                        SearchDynamicResourceGroupsResponse.Builder::dynamicResourceGroups)
                .handleResponseHeaderString(
                        "opc-request-id", SearchDynamicResourceGroupsResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", SearchDynamicResourceGroupsResponse.Builder::opcNextPage)
                .callSync();
    }

    @Override
    public SearchGrantsResponse searchGrants(SearchGrantsRequest request) {

        return clientCall(request, SearchGrantsResponse::builder)
                .logger(LOG, "searchGrants")
                .serviceDetails(
                        "IdentityDomains",
                        "SearchGrants",
                        "https://docs.oracle.com/iaas/api/#/en/identity-domains/v1/Grants/SearchGrants")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(SearchGrantsRequest::builder)
                .basePath("")
                .appendPathParam("admin")
                .appendPathParam("v1")
                .appendPathParam("Grants")
                .appendPathParam(".search")
                .appendQueryParam("page", request.getPage())
                .appendQueryParam("limit", request.getLimit())
                .accept("application/json, application/scim+json")
                .appendHeader("authorization", request.getAuthorization())
                .appendHeader(
                        "resource_type_schema_version", request.getResourceTypeSchemaVersion())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.identitydomains.model.Grants.class,
                        SearchGrantsResponse.Builder::grants)
                .handleResponseHeaderString(
                        "opc-request-id", SearchGrantsResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", SearchGrantsResponse.Builder::opcNextPage)
                .callSync();
    }

    @Override
    public SearchGroupsResponse searchGroups(SearchGroupsRequest request) {

        return clientCall(request, SearchGroupsResponse::builder)
                .logger(LOG, "searchGroups")
                .serviceDetails(
                        "IdentityDomains",
                        "SearchGroups",
                        "https://docs.oracle.com/iaas/api/#/en/identity-domains/v1/Groups/SearchGroups")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(SearchGroupsRequest::builder)
                .basePath("")
                .appendPathParam("admin")
                .appendPathParam("v1")
                .appendPathParam("Groups")
                .appendPathParam(".search")
                .appendQueryParam("page", request.getPage())
                .appendQueryParam("limit", request.getLimit())
                .accept("application/json, application/scim+json")
                .appendHeader("authorization", request.getAuthorization())
                .appendHeader(
                        "resource_type_schema_version", request.getResourceTypeSchemaVersion())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.identitydomains.model.Groups.class,
                        SearchGroupsResponse.Builder::groups)
                .handleResponseHeaderString(
                        "opc-request-id", SearchGroupsResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", SearchGroupsResponse.Builder::opcNextPage)
                .callSync();
    }

    @Override
    public SearchIdentityProvidersResponse searchIdentityProviders(
            SearchIdentityProvidersRequest request) {

        return clientCall(request, SearchIdentityProvidersResponse::builder)
                .logger(LOG, "searchIdentityProviders")
                .serviceDetails(
                        "IdentityDomains",
                        "SearchIdentityProviders",
                        "https://docs.oracle.com/iaas/api/#/en/identity-domains/v1/IdentityProviders/SearchIdentityProviders")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(SearchIdentityProvidersRequest::builder)
                .basePath("")
                .appendPathParam("admin")
                .appendPathParam("v1")
                .appendPathParam("IdentityProviders")
                .appendPathParam(".search")
                .appendQueryParam("page", request.getPage())
                .appendQueryParam("limit", request.getLimit())
                .accept("application/json, application/scim+json")
                .appendHeader("authorization", request.getAuthorization())
                .appendHeader(
                        "resource_type_schema_version", request.getResourceTypeSchemaVersion())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.identitydomains.model.IdentityProviders.class,
                        SearchIdentityProvidersResponse.Builder::identityProviders)
                .handleResponseHeaderString(
                        "opc-request-id", SearchIdentityProvidersResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", SearchIdentityProvidersResponse.Builder::opcNextPage)
                .callSync();
    }

    @Override
    public SearchIdentitySettingsResponse searchIdentitySettings(
            SearchIdentitySettingsRequest request) {

        return clientCall(request, SearchIdentitySettingsResponse::builder)
                .logger(LOG, "searchIdentitySettings")
                .serviceDetails(
                        "IdentityDomains",
                        "SearchIdentitySettings",
                        "https://docs.oracle.com/iaas/api/#/en/identity-domains/v1/IdentitySettings/SearchIdentitySettings")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(SearchIdentitySettingsRequest::builder)
                .basePath("")
                .appendPathParam("admin")
                .appendPathParam("v1")
                .appendPathParam("IdentitySettings")
                .appendPathParam(".search")
                .appendQueryParam("page", request.getPage())
                .appendQueryParam("limit", request.getLimit())
                .accept("application/json, application/scim+json")
                .appendHeader("authorization", request.getAuthorization())
                .appendHeader(
                        "resource_type_schema_version", request.getResourceTypeSchemaVersion())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.identitydomains.model.IdentitySettings.class,
                        SearchIdentitySettingsResponse.Builder::identitySettings)
                .handleResponseHeaderString(
                        "opc-request-id", SearchIdentitySettingsResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", SearchIdentitySettingsResponse.Builder::opcNextPage)
                .callSync();
    }

    @Override
    public SearchKmsiSettingsResponse searchKmsiSettings(SearchKmsiSettingsRequest request) {

        return clientCall(request, SearchKmsiSettingsResponse::builder)
                .logger(LOG, "searchKmsiSettings")
                .serviceDetails(
                        "IdentityDomains",
                        "SearchKmsiSettings",
                        "https://docs.oracle.com/iaas/api/#/en/identity-domains/v1/KmsiSettings/SearchKmsiSettings")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(SearchKmsiSettingsRequest::builder)
                .basePath("")
                .appendPathParam("admin")
                .appendPathParam("v1")
                .appendPathParam("KmsiSettings")
                .appendPathParam(".search")
                .appendQueryParam("page", request.getPage())
                .appendQueryParam("limit", request.getLimit())
                .accept("application/json, application/scim+json")
                .appendHeader("authorization", request.getAuthorization())
                .appendHeader(
                        "resource_type_schema_version", request.getResourceTypeSchemaVersion())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.identitydomains.model.KmsiSettings.class,
                        SearchKmsiSettingsResponse.Builder::kmsiSettings)
                .handleResponseHeaderString(
                        "opc-request-id", SearchKmsiSettingsResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", SearchKmsiSettingsResponse.Builder::opcNextPage)
                .callSync();
    }

    @Override
    public SearchMyAppsResponse searchMyApps(SearchMyAppsRequest request) {

        return clientCall(request, SearchMyAppsResponse::builder)
                .logger(LOG, "searchMyApps")
                .serviceDetails(
                        "IdentityDomains",
                        "SearchMyApps",
                        "https://docs.oracle.com/iaas/api/#/en/identity-domains/v1/MyApps/SearchMyApps")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(SearchMyAppsRequest::builder)
                .basePath("")
                .appendPathParam("admin")
                .appendPathParam("v1")
                .appendPathParam("MyApps")
                .appendPathParam(".search")
                .appendQueryParam("page", request.getPage())
                .appendQueryParam("limit", request.getLimit())
                .accept("application/json, application/scim+json")
                .appendHeader("authorization", request.getAuthorization())
                .appendHeader(
                        "resource_type_schema_version", request.getResourceTypeSchemaVersion())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.identitydomains.model.MyApps.class,
                        SearchMyAppsResponse.Builder::myApps)
                .handleResponseHeaderString(
                        "opc-request-id", SearchMyAppsResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", SearchMyAppsResponse.Builder::opcNextPage)
                .callSync();
    }

    @Override
    public SearchMyGroupsResponse searchMyGroups(SearchMyGroupsRequest request) {

        return clientCall(request, SearchMyGroupsResponse::builder)
                .logger(LOG, "searchMyGroups")
                .serviceDetails(
                        "IdentityDomains",
                        "SearchMyGroups",
                        "https://docs.oracle.com/iaas/api/#/en/identity-domains/v1/MyGroups/SearchMyGroups")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(SearchMyGroupsRequest::builder)
                .basePath("")
                .appendPathParam("admin")
                .appendPathParam("v1")
                .appendPathParam("MyGroups")
                .appendPathParam(".search")
                .appendQueryParam("page", request.getPage())
                .appendQueryParam("limit", request.getLimit())
                .accept("application/json, application/scim+json")
                .appendHeader("authorization", request.getAuthorization())
                .appendHeader(
                        "resource_type_schema_version", request.getResourceTypeSchemaVersion())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.identitydomains.model.MyGroups.class,
                        SearchMyGroupsResponse.Builder::myGroups)
                .handleResponseHeaderString(
                        "opc-request-id", SearchMyGroupsResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", SearchMyGroupsResponse.Builder::opcNextPage)
                .callSync();
    }

    @Override
    public SearchMyRequestableGroupsResponse searchMyRequestableGroups(
            SearchMyRequestableGroupsRequest request) {

        return clientCall(request, SearchMyRequestableGroupsResponse::builder)
                .logger(LOG, "searchMyRequestableGroups")
                .serviceDetails(
                        "IdentityDomains",
                        "SearchMyRequestableGroups",
                        "https://docs.oracle.com/iaas/api/#/en/identity-domains/v1/MyRequestableGroups/SearchMyRequestableGroups")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(SearchMyRequestableGroupsRequest::builder)
                .basePath("")
                .appendPathParam("admin")
                .appendPathParam("v1")
                .appendPathParam("MyRequestableGroups")
                .appendPathParam(".search")
                .appendQueryParam("page", request.getPage())
                .appendQueryParam("limit", request.getLimit())
                .accept("application/json, application/scim+json")
                .appendHeader("authorization", request.getAuthorization())
                .appendHeader(
                        "resource_type_schema_version", request.getResourceTypeSchemaVersion())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.identitydomains.model.MyRequestableGroups.class,
                        SearchMyRequestableGroupsResponse.Builder::myRequestableGroups)
                .handleResponseHeaderString(
                        "opc-request-id", SearchMyRequestableGroupsResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", SearchMyRequestableGroupsResponse.Builder::opcNextPage)
                .callSync();
    }

    @Override
    public SearchMyRequestsResponse searchMyRequests(SearchMyRequestsRequest request) {

        return clientCall(request, SearchMyRequestsResponse::builder)
                .logger(LOG, "searchMyRequests")
                .serviceDetails(
                        "IdentityDomains",
                        "SearchMyRequests",
                        "https://docs.oracle.com/iaas/api/#/en/identity-domains/v1/MyRequests/SearchMyRequests")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(SearchMyRequestsRequest::builder)
                .basePath("")
                .appendPathParam("admin")
                .appendPathParam("v1")
                .appendPathParam("MyRequests")
                .appendPathParam(".search")
                .appendQueryParam("page", request.getPage())
                .appendQueryParam("limit", request.getLimit())
                .accept("application/json, application/scim+json")
                .appendHeader("authorization", request.getAuthorization())
                .appendHeader(
                        "resource_type_schema_version", request.getResourceTypeSchemaVersion())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.identitydomains.model.MyRequests.class,
                        SearchMyRequestsResponse.Builder::myRequests)
                .handleResponseHeaderString(
                        "opc-request-id", SearchMyRequestsResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", SearchMyRequestsResponse.Builder::opcNextPage)
                .callSync();
    }

    @Override
    public SearchNetworkPerimetersResponse searchNetworkPerimeters(
            SearchNetworkPerimetersRequest request) {

        return clientCall(request, SearchNetworkPerimetersResponse::builder)
                .logger(LOG, "searchNetworkPerimeters")
                .serviceDetails(
                        "IdentityDomains",
                        "SearchNetworkPerimeters",
                        "https://docs.oracle.com/iaas/api/#/en/identity-domains/v1/NetworkPerimeters/SearchNetworkPerimeters")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(SearchNetworkPerimetersRequest::builder)
                .basePath("")
                .appendPathParam("admin")
                .appendPathParam("v1")
                .appendPathParam("NetworkPerimeters")
                .appendPathParam(".search")
                .appendQueryParam("page", request.getPage())
                .appendQueryParam("limit", request.getLimit())
                .accept("application/json, application/scim+json")
                .appendHeader("authorization", request.getAuthorization())
                .appendHeader(
                        "resource_type_schema_version", request.getResourceTypeSchemaVersion())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.identitydomains.model.NetworkPerimeters.class,
                        SearchNetworkPerimetersResponse.Builder::networkPerimeters)
                .handleResponseHeaderString(
                        "opc-request-id", SearchNetworkPerimetersResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", SearchNetworkPerimetersResponse.Builder::opcNextPage)
                .callSync();
    }

    @Override
    public SearchNotificationSettingsResponse searchNotificationSettings(
            SearchNotificationSettingsRequest request) {

        return clientCall(request, SearchNotificationSettingsResponse::builder)
                .logger(LOG, "searchNotificationSettings")
                .serviceDetails(
                        "IdentityDomains",
                        "SearchNotificationSettings",
                        "https://docs.oracle.com/iaas/api/#/en/identity-domains/v1/NotificationSettings/SearchNotificationSettings")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(SearchNotificationSettingsRequest::builder)
                .basePath("")
                .appendPathParam("admin")
                .appendPathParam("v1")
                .appendPathParam("NotificationSettings")
                .appendPathParam(".search")
                .appendQueryParam("page", request.getPage())
                .appendQueryParam("limit", request.getLimit())
                .accept("application/json, application/scim+json")
                .appendHeader("authorization", request.getAuthorization())
                .appendHeader(
                        "resource_type_schema_version", request.getResourceTypeSchemaVersion())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.identitydomains.model.NotificationSettings.class,
                        SearchNotificationSettingsResponse.Builder::notificationSettings)
                .handleResponseHeaderString(
                        "opc-request-id", SearchNotificationSettingsResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", SearchNotificationSettingsResponse.Builder::opcNextPage)
                .callSync();
    }

    @Override
    public SearchOAuth2ClientCredentialsResponse searchOAuth2ClientCredentials(
            SearchOAuth2ClientCredentialsRequest request) {

        return clientCall(request, SearchOAuth2ClientCredentialsResponse::builder)
                .logger(LOG, "searchOAuth2ClientCredentials")
                .serviceDetails(
                        "IdentityDomains",
                        "SearchOAuth2ClientCredentials",
                        "https://docs.oracle.com/iaas/api/#/en/identity-domains/v1/OAuth2ClientCredentials/SearchOAuth2ClientCredentials")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(SearchOAuth2ClientCredentialsRequest::builder)
                .basePath("")
                .appendPathParam("admin")
                .appendPathParam("v1")
                .appendPathParam("OAuth2ClientCredentials")
                .appendPathParam(".search")
                .appendQueryParam("page", request.getPage())
                .appendQueryParam("limit", request.getLimit())
                .accept("application/json, application/scim+json")
                .appendHeader("authorization", request.getAuthorization())
                .appendHeader(
                        "resource_type_schema_version", request.getResourceTypeSchemaVersion())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.identitydomains.model.OAuth2ClientCredentials.class,
                        SearchOAuth2ClientCredentialsResponse.Builder::oAuth2ClientCredentials)
                .handleResponseHeaderString(
                        "opc-request-id",
                        SearchOAuth2ClientCredentialsResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", SearchOAuth2ClientCredentialsResponse.Builder::opcNextPage)
                .callSync();
    }

    @Override
    public SearchOAuthClientCertificatesResponse searchOAuthClientCertificates(
            SearchOAuthClientCertificatesRequest request) {

        return clientCall(request, SearchOAuthClientCertificatesResponse::builder)
                .logger(LOG, "searchOAuthClientCertificates")
                .serviceDetails(
                        "IdentityDomains",
                        "SearchOAuthClientCertificates",
                        "https://docs.oracle.com/iaas/api/#/en/identity-domains/v1/OAuthClientCertificates/SearchOAuthClientCertificates")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(SearchOAuthClientCertificatesRequest::builder)
                .basePath("")
                .appendPathParam("admin")
                .appendPathParam("v1")
                .appendPathParam("OAuthClientCertificates")
                .appendPathParam(".search")
                .appendQueryParam("page", request.getPage())
                .appendQueryParam("limit", request.getLimit())
                .accept("application/json, application/scim+json")
                .appendHeader("authorization", request.getAuthorization())
                .appendHeader(
                        "resource_type_schema_version", request.getResourceTypeSchemaVersion())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.identitydomains.model.OAuthClientCertificates.class,
                        SearchOAuthClientCertificatesResponse.Builder::oAuthClientCertificates)
                .handleResponseHeaderString(
                        "opc-request-id",
                        SearchOAuthClientCertificatesResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", SearchOAuthClientCertificatesResponse.Builder::opcNextPage)
                .callSync();
    }

    @Override
    public SearchOAuthPartnerCertificatesResponse searchOAuthPartnerCertificates(
            SearchOAuthPartnerCertificatesRequest request) {

        return clientCall(request, SearchOAuthPartnerCertificatesResponse::builder)
                .logger(LOG, "searchOAuthPartnerCertificates")
                .serviceDetails(
                        "IdentityDomains",
                        "SearchOAuthPartnerCertificates",
                        "https://docs.oracle.com/iaas/api/#/en/identity-domains/v1/OAuthPartnerCertificates/SearchOAuthPartnerCertificates")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(SearchOAuthPartnerCertificatesRequest::builder)
                .basePath("")
                .appendPathParam("admin")
                .appendPathParam("v1")
                .appendPathParam("OAuthPartnerCertificates")
                .appendPathParam(".search")
                .appendQueryParam("page", request.getPage())
                .appendQueryParam("limit", request.getLimit())
                .accept("application/json, application/scim+json")
                .appendHeader("authorization", request.getAuthorization())
                .appendHeader(
                        "resource_type_schema_version", request.getResourceTypeSchemaVersion())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.identitydomains.model.OAuthPartnerCertificates.class,
                        SearchOAuthPartnerCertificatesResponse.Builder::oAuthPartnerCertificates)
                .handleResponseHeaderString(
                        "opc-request-id",
                        SearchOAuthPartnerCertificatesResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page",
                        SearchOAuthPartnerCertificatesResponse.Builder::opcNextPage)
                .callSync();
    }

    @Override
    public SearchOciConsoleSignOnPolicyConsentsResponse searchOciConsoleSignOnPolicyConsents(
            SearchOciConsoleSignOnPolicyConsentsRequest request) {

        return clientCall(request, SearchOciConsoleSignOnPolicyConsentsResponse::builder)
                .logger(LOG, "searchOciConsoleSignOnPolicyConsents")
                .serviceDetails(
                        "IdentityDomains",
                        "SearchOciConsoleSignOnPolicyConsents",
                        "https://docs.oracle.com/iaas/api/#/en/identity-domains/v1/OciConsoleSignOnPolicyConsent/SearchOciConsoleSignOnPolicyConsents")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(SearchOciConsoleSignOnPolicyConsentsRequest::builder)
                .basePath("")
                .appendPathParam("admin")
                .appendPathParam("v1")
                .appendPathParam("OciConsoleSignOnPolicyConsents")
                .appendPathParam(".search")
                .appendQueryParam("page", request.getPage())
                .appendQueryParam("limit", request.getLimit())
                .accept("application/json, application/scim+json")
                .appendHeader("authorization", request.getAuthorization())
                .appendHeader(
                        "resource_type_schema_version", request.getResourceTypeSchemaVersion())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.identitydomains.model.OciConsoleSignOnPolicyConsents.class,
                        SearchOciConsoleSignOnPolicyConsentsResponse.Builder
                                ::ociConsoleSignOnPolicyConsents)
                .handleResponseHeaderString(
                        "opc-request-id",
                        SearchOciConsoleSignOnPolicyConsentsResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page",
                        SearchOciConsoleSignOnPolicyConsentsResponse.Builder::opcNextPage)
                .callSync();
    }

    @Override
    public SearchPasswordPoliciesResponse searchPasswordPolicies(
            SearchPasswordPoliciesRequest request) {

        return clientCall(request, SearchPasswordPoliciesResponse::builder)
                .logger(LOG, "searchPasswordPolicies")
                .serviceDetails(
                        "IdentityDomains",
                        "SearchPasswordPolicies",
                        "https://docs.oracle.com/iaas/api/#/en/identity-domains/v1/PasswordPolicies/SearchPasswordPolicies")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(SearchPasswordPoliciesRequest::builder)
                .basePath("")
                .appendPathParam("admin")
                .appendPathParam("v1")
                .appendPathParam("PasswordPolicies")
                .appendPathParam(".search")
                .appendQueryParam("page", request.getPage())
                .appendQueryParam("limit", request.getLimit())
                .accept("application/json, application/scim+json")
                .appendHeader("authorization", request.getAuthorization())
                .appendHeader(
                        "resource_type_schema_version", request.getResourceTypeSchemaVersion())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.identitydomains.model.PasswordPolicies.class,
                        SearchPasswordPoliciesResponse.Builder::passwordPolicies)
                .handleResponseHeaderString(
                        "opc-request-id", SearchPasswordPoliciesResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", SearchPasswordPoliciesResponse.Builder::opcNextPage)
                .callSync();
    }

    @Override
    public SearchPoliciesResponse searchPolicies(SearchPoliciesRequest request) {

        return clientCall(request, SearchPoliciesResponse::builder)
                .logger(LOG, "searchPolicies")
                .serviceDetails(
                        "IdentityDomains",
                        "SearchPolicies",
                        "https://docs.oracle.com/iaas/api/#/en/identity-domains/v1/Policy/SearchPolicies")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(SearchPoliciesRequest::builder)
                .basePath("")
                .appendPathParam("admin")
                .appendPathParam("v1")
                .appendPathParam("Policies")
                .appendPathParam(".search")
                .appendQueryParam("page", request.getPage())
                .appendQueryParam("limit", request.getLimit())
                .accept("application/json, application/scim+json")
                .appendHeader("authorization", request.getAuthorization())
                .appendHeader(
                        "resource_type_schema_version", request.getResourceTypeSchemaVersion())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.identitydomains.model.Policies.class,
                        SearchPoliciesResponse.Builder::policies)
                .handleResponseHeaderString(
                        "opc-request-id", SearchPoliciesResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", SearchPoliciesResponse.Builder::opcNextPage)
                .callSync();
    }

    @Override
    public SearchResourceTypeSchemaAttributesResponse searchResourceTypeSchemaAttributes(
            SearchResourceTypeSchemaAttributesRequest request) {

        return clientCall(request, SearchResourceTypeSchemaAttributesResponse::builder)
                .logger(LOG, "searchResourceTypeSchemaAttributes")
                .serviceDetails(
                        "IdentityDomains",
                        "SearchResourceTypeSchemaAttributes",
                        "https://docs.oracle.com/iaas/api/#/en/identity-domains/v1/ResourceTypeSchemaAttributes/SearchResourceTypeSchemaAttributes")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(SearchResourceTypeSchemaAttributesRequest::builder)
                .basePath("")
                .appendPathParam("admin")
                .appendPathParam("v1")
                .appendPathParam("ResourceTypeSchemaAttributes")
                .appendPathParam(".search")
                .appendQueryParam("page", request.getPage())
                .appendQueryParam("limit", request.getLimit())
                .accept("application/json, application/scim+json")
                .appendHeader("authorization", request.getAuthorization())
                .appendHeader(
                        "resource_type_schema_version", request.getResourceTypeSchemaVersion())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.identitydomains.model.ResourceTypeSchemaAttributes.class,
                        SearchResourceTypeSchemaAttributesResponse.Builder
                                ::resourceTypeSchemaAttributes)
                .handleResponseHeaderString(
                        "opc-request-id",
                        SearchResourceTypeSchemaAttributesResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page",
                        SearchResourceTypeSchemaAttributesResponse.Builder::opcNextPage)
                .callSync();
    }

    @Override
    public SearchRulesResponse searchRules(SearchRulesRequest request) {

        return clientCall(request, SearchRulesResponse::builder)
                .logger(LOG, "searchRules")
                .serviceDetails(
                        "IdentityDomains",
                        "SearchRules",
                        "https://docs.oracle.com/iaas/api/#/en/identity-domains/v1/Rule/SearchRules")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(SearchRulesRequest::builder)
                .basePath("")
                .appendPathParam("admin")
                .appendPathParam("v1")
                .appendPathParam("Rules")
                .appendPathParam(".search")
                .appendQueryParam("page", request.getPage())
                .appendQueryParam("limit", request.getLimit())
                .accept("application/json, application/scim+json")
                .appendHeader("authorization", request.getAuthorization())
                .appendHeader(
                        "resource_type_schema_version", request.getResourceTypeSchemaVersion())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.identitydomains.model.Rules.class,
                        SearchRulesResponse.Builder::rules)
                .handleResponseHeaderString(
                        "opc-request-id", SearchRulesResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", SearchRulesResponse.Builder::opcNextPage)
                .callSync();
    }

    @Override
    public SearchSchemasResponse searchSchemas(SearchSchemasRequest request) {

        return clientCall(request, SearchSchemasResponse::builder)
                .logger(LOG, "searchSchemas")
                .serviceDetails(
                        "IdentityDomains",
                        "SearchSchemas",
                        "https://docs.oracle.com/iaas/api/#/en/identity-domains/v1/Schemas/SearchSchemas")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(SearchSchemasRequest::builder)
                .basePath("")
                .appendPathParam("admin")
                .appendPathParam("v1")
                .appendPathParam("Schemas")
                .appendPathParam(".search")
                .appendQueryParam("page", request.getPage())
                .appendQueryParam("limit", request.getLimit())
                .accept("application/json, application/scim+json")
                .appendHeader("authorization", request.getAuthorization())
                .appendHeader(
                        "resource_type_schema_version", request.getResourceTypeSchemaVersion())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.identitydomains.model.Schemas.class,
                        SearchSchemasResponse.Builder::schemas)
                .handleResponseHeaderString(
                        "opc-request-id", SearchSchemasResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", SearchSchemasResponse.Builder::opcNextPage)
                .callSync();
    }

    @Override
    public SearchSecurityQuestionSettingsResponse searchSecurityQuestionSettings(
            SearchSecurityQuestionSettingsRequest request) {

        return clientCall(request, SearchSecurityQuestionSettingsResponse::builder)
                .logger(LOG, "searchSecurityQuestionSettings")
                .serviceDetails(
                        "IdentityDomains",
                        "SearchSecurityQuestionSettings",
                        "https://docs.oracle.com/iaas/api/#/en/identity-domains/v1/SecurityQuestionSettings/SearchSecurityQuestionSettings")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(SearchSecurityQuestionSettingsRequest::builder)
                .basePath("")
                .appendPathParam("admin")
                .appendPathParam("v1")
                .appendPathParam("SecurityQuestionSettings")
                .appendPathParam(".search")
                .appendQueryParam("page", request.getPage())
                .appendQueryParam("limit", request.getLimit())
                .accept("application/json, application/scim+json")
                .appendHeader("authorization", request.getAuthorization())
                .appendHeader(
                        "resource_type_schema_version", request.getResourceTypeSchemaVersion())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.identitydomains.model.SecurityQuestionSettings.class,
                        SearchSecurityQuestionSettingsResponse.Builder::securityQuestionSettings)
                .handleResponseHeaderString(
                        "opc-request-id",
                        SearchSecurityQuestionSettingsResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page",
                        SearchSecurityQuestionSettingsResponse.Builder::opcNextPage)
                .callSync();
    }

    @Override
    public SearchSecurityQuestionsResponse searchSecurityQuestions(
            SearchSecurityQuestionsRequest request) {

        return clientCall(request, SearchSecurityQuestionsResponse::builder)
                .logger(LOG, "searchSecurityQuestions")
                .serviceDetails(
                        "IdentityDomains",
                        "SearchSecurityQuestions",
                        "https://docs.oracle.com/iaas/api/#/en/identity-domains/v1/SecurityQuestions/SearchSecurityQuestions")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(SearchSecurityQuestionsRequest::builder)
                .basePath("")
                .appendPathParam("admin")
                .appendPathParam("v1")
                .appendPathParam("SecurityQuestions")
                .appendPathParam(".search")
                .appendQueryParam("page", request.getPage())
                .appendQueryParam("limit", request.getLimit())
                .accept("application/json, application/scim+json")
                .appendHeader("authorization", request.getAuthorization())
                .appendHeader(
                        "resource_type_schema_version", request.getResourceTypeSchemaVersion())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.identitydomains.model.SecurityQuestions.class,
                        SearchSecurityQuestionsResponse.Builder::securityQuestions)
                .handleResponseHeaderString(
                        "opc-request-id", SearchSecurityQuestionsResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", SearchSecurityQuestionsResponse.Builder::opcNextPage)
                .callSync();
    }

    @Override
    public SearchSelfRegistrationProfilesResponse searchSelfRegistrationProfiles(
            SearchSelfRegistrationProfilesRequest request) {

        return clientCall(request, SearchSelfRegistrationProfilesResponse::builder)
                .logger(LOG, "searchSelfRegistrationProfiles")
                .serviceDetails(
                        "IdentityDomains",
                        "SearchSelfRegistrationProfiles",
                        "https://docs.oracle.com/iaas/api/#/en/identity-domains/v1/SelfRegistrationProfiles/SearchSelfRegistrationProfiles")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(SearchSelfRegistrationProfilesRequest::builder)
                .basePath("")
                .appendPathParam("admin")
                .appendPathParam("v1")
                .appendPathParam("SelfRegistrationProfiles")
                .appendPathParam(".search")
                .appendQueryParam("page", request.getPage())
                .appendQueryParam("limit", request.getLimit())
                .accept("application/json, application/scim+json")
                .appendHeader("authorization", request.getAuthorization())
                .appendHeader(
                        "resource_type_schema_version", request.getResourceTypeSchemaVersion())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.identitydomains.model.SelfRegistrationProfiles.class,
                        SearchSelfRegistrationProfilesResponse.Builder::selfRegistrationProfiles)
                .handleResponseHeaderString(
                        "opc-request-id",
                        SearchSelfRegistrationProfilesResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page",
                        SearchSelfRegistrationProfilesResponse.Builder::opcNextPage)
                .callSync();
    }

    @Override
    public SearchSettingsResponse searchSettings(SearchSettingsRequest request) {

        return clientCall(request, SearchSettingsResponse::builder)
                .logger(LOG, "searchSettings")
                .serviceDetails(
                        "IdentityDomains",
                        "SearchSettings",
                        "https://docs.oracle.com/iaas/api/#/en/identity-domains/v1/Settings/SearchSettings")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(SearchSettingsRequest::builder)
                .basePath("")
                .appendPathParam("admin")
                .appendPathParam("v1")
                .appendPathParam("Settings")
                .appendPathParam(".search")
                .appendQueryParam("page", request.getPage())
                .appendQueryParam("limit", request.getLimit())
                .accept("application/json, application/scim+json")
                .appendHeader("authorization", request.getAuthorization())
                .appendHeader(
                        "resource_type_schema_version", request.getResourceTypeSchemaVersion())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.identitydomains.model.Settings.class,
                        SearchSettingsResponse.Builder::settings)
                .handleResponseHeaderString(
                        "opc-request-id", SearchSettingsResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", SearchSettingsResponse.Builder::opcNextPage)
                .callSync();
    }

    @Override
    public SearchSmtpCredentialsResponse searchSmtpCredentials(
            SearchSmtpCredentialsRequest request) {

        return clientCall(request, SearchSmtpCredentialsResponse::builder)
                .logger(LOG, "searchSmtpCredentials")
                .serviceDetails(
                        "IdentityDomains",
                        "SearchSmtpCredentials",
                        "https://docs.oracle.com/iaas/api/#/en/identity-domains/v1/SmtpCredentials/SearchSmtpCredentials")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(SearchSmtpCredentialsRequest::builder)
                .basePath("")
                .appendPathParam("admin")
                .appendPathParam("v1")
                .appendPathParam("SmtpCredentials")
                .appendPathParam(".search")
                .appendQueryParam("page", request.getPage())
                .appendQueryParam("limit", request.getLimit())
                .accept("application/json, application/scim+json")
                .appendHeader("authorization", request.getAuthorization())
                .appendHeader(
                        "resource_type_schema_version", request.getResourceTypeSchemaVersion())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.identitydomains.model.SmtpCredentials.class,
                        SearchSmtpCredentialsResponse.Builder::smtpCredentials)
                .handleResponseHeaderString(
                        "opc-request-id", SearchSmtpCredentialsResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", SearchSmtpCredentialsResponse.Builder::opcNextPage)
                .callSync();
    }

    @Override
    public SearchSocialIdentityProvidersResponse searchSocialIdentityProviders(
            SearchSocialIdentityProvidersRequest request) {

        return clientCall(request, SearchSocialIdentityProvidersResponse::builder)
                .logger(LOG, "searchSocialIdentityProviders")
                .serviceDetails(
                        "IdentityDomains",
                        "SearchSocialIdentityProviders",
                        "https://docs.oracle.com/iaas/api/#/en/identity-domains/v1/SocialIdentityProviders/SearchSocialIdentityProviders")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(SearchSocialIdentityProvidersRequest::builder)
                .basePath("")
                .appendPathParam("admin")
                .appendPathParam("v1")
                .appendPathParam("SocialIdentityProviders")
                .appendPathParam(".search")
                .appendQueryParam("page", request.getPage())
                .appendQueryParam("limit", request.getLimit())
                .accept("application/json, application/scim+json")
                .appendHeader("authorization", request.getAuthorization())
                .appendHeader(
                        "resource_type_schema_version", request.getResourceTypeSchemaVersion())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.identitydomains.model.SocialIdentityProviders.class,
                        SearchSocialIdentityProvidersResponse.Builder::socialIdentityProviders)
                .handleResponseHeaderString(
                        "opc-request-id",
                        SearchSocialIdentityProvidersResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", SearchSocialIdentityProvidersResponse.Builder::opcNextPage)
                .callSync();
    }

    @Override
    public SearchUserAttributesSettingsResponse searchUserAttributesSettings(
            SearchUserAttributesSettingsRequest request) {

        return clientCall(request, SearchUserAttributesSettingsResponse::builder)
                .logger(LOG, "searchUserAttributesSettings")
                .serviceDetails(
                        "IdentityDomains",
                        "SearchUserAttributesSettings",
                        "https://docs.oracle.com/iaas/api/#/en/identity-domains/v1/UserAttributesSetting/SearchUserAttributesSettings")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(SearchUserAttributesSettingsRequest::builder)
                .basePath("")
                .appendPathParam("admin")
                .appendPathParam("v1")
                .appendPathParam("UserAttributesSettings")
                .appendPathParam(".search")
                .appendQueryParam("page", request.getPage())
                .appendQueryParam("limit", request.getLimit())
                .accept("application/json, application/scim+json")
                .appendHeader("authorization", request.getAuthorization())
                .appendHeader(
                        "resource_type_schema_version", request.getResourceTypeSchemaVersion())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.identitydomains.model.UserAttributesSettings.class,
                        SearchUserAttributesSettingsResponse.Builder::userAttributesSettings)
                .handleResponseHeaderString(
                        "opc-request-id",
                        SearchUserAttributesSettingsResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", SearchUserAttributesSettingsResponse.Builder::opcNextPage)
                .callSync();
    }

    @Override
    public SearchUserDbCredentialsResponse searchUserDbCredentials(
            SearchUserDbCredentialsRequest request) {

        return clientCall(request, SearchUserDbCredentialsResponse::builder)
                .logger(LOG, "searchUserDbCredentials")
                .serviceDetails(
                        "IdentityDomains",
                        "SearchUserDbCredentials",
                        "https://docs.oracle.com/iaas/api/#/en/identity-domains/v1/UserDbCredentials/SearchUserDbCredentials")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(SearchUserDbCredentialsRequest::builder)
                .basePath("")
                .appendPathParam("admin")
                .appendPathParam("v1")
                .appendPathParam("UserDbCredentials")
                .appendPathParam(".search")
                .appendQueryParam("page", request.getPage())
                .appendQueryParam("limit", request.getLimit())
                .accept("application/json, application/scim+json")
                .appendHeader("authorization", request.getAuthorization())
                .appendHeader(
                        "resource_type_schema_version", request.getResourceTypeSchemaVersion())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.identitydomains.model.UserDbCredentials.class,
                        SearchUserDbCredentialsResponse.Builder::userDbCredentials)
                .handleResponseHeaderString(
                        "opc-request-id", SearchUserDbCredentialsResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", SearchUserDbCredentialsResponse.Builder::opcNextPage)
                .callSync();
    }

    @Override
    public SearchUsersResponse searchUsers(SearchUsersRequest request) {

        return clientCall(request, SearchUsersResponse::builder)
                .logger(LOG, "searchUsers")
                .serviceDetails(
                        "IdentityDomains",
                        "SearchUsers",
                        "https://docs.oracle.com/iaas/api/#/en/identity-domains/v1/Users/SearchUsers")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(SearchUsersRequest::builder)
                .basePath("")
                .appendPathParam("admin")
                .appendPathParam("v1")
                .appendPathParam("Users")
                .appendPathParam(".search")
                .appendQueryParam("page", request.getPage())
                .appendQueryParam("limit", request.getLimit())
                .accept("application/json, application/scim+json")
                .appendHeader("authorization", request.getAuthorization())
                .appendHeader(
                        "resource_type_schema_version", request.getResourceTypeSchemaVersion())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.identitydomains.model.Users.class,
                        SearchUsersResponse.Builder::users)
                .handleResponseHeaderString(
                        "opc-request-id", SearchUsersResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", SearchUsersResponse.Builder::opcNextPage)
                .callSync();
    }

    /**
     * Create a new client instance.
     *
     * @param authenticationDetailsProvider The authentication details (see {@link Builder#build})
     * @deprecated Use the {@link #builder() builder} instead.
     */
    @Deprecated
    public IdentityDomainsClient(
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
    public IdentityDomainsClient(
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
    public IdentityDomainsClient(
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
    public IdentityDomainsClient(
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
    public IdentityDomainsClient(
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
    public IdentityDomainsClient(
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
    public IdentityDomainsClient(
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
