/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
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
                    .serviceEndpointTemplate("https://identity.{region}.oci.{secondLevelDomain}")
                    .build();

    private static final org.slf4j.Logger LOG =
            org.slf4j.LoggerFactory.getLogger(IdentityDomainsClient.class);

    private IdentityDomainsClient(
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
                .basePath("/admin/v1")
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
    public CreateAuthTokenResponse createAuthToken(CreateAuthTokenRequest request) {

        return clientCall(request, CreateAuthTokenResponse::builder)
                .logger(LOG, "createAuthToken")
                .serviceDetails("IdentityDomains", "CreateAuthToken", "")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(CreateAuthTokenRequest::builder)
                .basePath("/admin/v1")
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
                .basePath("/admin/v1")
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
    public CreateCustomerSecretKeyResponse createCustomerSecretKey(
            CreateCustomerSecretKeyRequest request) {

        return clientCall(request, CreateCustomerSecretKeyResponse::builder)
                .logger(LOG, "createCustomerSecretKey")
                .serviceDetails("IdentityDomains", "CreateCustomerSecretKey", "")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(CreateCustomerSecretKeyRequest::builder)
                .basePath("/admin/v1")
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
                .basePath("/admin/v1")
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
    public CreateGroupResponse createGroup(CreateGroupRequest request) {

        return clientCall(request, CreateGroupResponse::builder)
                .logger(LOG, "createGroup")
                .serviceDetails("IdentityDomains", "CreateGroup", "")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(CreateGroupRequest::builder)
                .basePath("/admin/v1")
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
    public CreateIdentityProviderResponse createIdentityProvider(
            CreateIdentityProviderRequest request) {

        return clientCall(request, CreateIdentityProviderResponse::builder)
                .logger(LOG, "createIdentityProvider")
                .serviceDetails("IdentityDomains", "CreateIdentityProvider", "")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(CreateIdentityProviderRequest::builder)
                .basePath("/admin/v1")
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
                .basePath("/admin/v1")
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
                .basePath("/admin/v1")
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
                .basePath("/admin/v1")
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
                .basePath("/admin/v1")
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
                .basePath("/admin/v1")
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
                .basePath("/admin/v1")
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
                .basePath("/admin/v1")
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
                .basePath("/admin/v1")
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
    public CreateMySmtpCredentialResponse createMySmtpCredential(
            CreateMySmtpCredentialRequest request) {

        return clientCall(request, CreateMySmtpCredentialResponse::builder)
                .logger(LOG, "createMySmtpCredential")
                .serviceDetails("IdentityDomains", "CreateMySmtpCredential", "")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(CreateMySmtpCredentialRequest::builder)
                .basePath("/admin/v1")
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
                .basePath("/admin/v1")
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
                .basePath("/admin/v1")
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
    public CreateOAuth2ClientCredentialResponse createOAuth2ClientCredential(
            CreateOAuth2ClientCredentialRequest request) {

        return clientCall(request, CreateOAuth2ClientCredentialResponse::builder)
                .logger(LOG, "createOAuth2ClientCredential")
                .serviceDetails("IdentityDomains", "CreateOAuth2ClientCredential", "")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(CreateOAuth2ClientCredentialRequest::builder)
                .basePath("/admin/v1")
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
    public CreatePasswordPolicyResponse createPasswordPolicy(CreatePasswordPolicyRequest request) {

        return clientCall(request, CreatePasswordPolicyResponse::builder)
                .logger(LOG, "createPasswordPolicy")
                .serviceDetails("IdentityDomains", "CreatePasswordPolicy", "")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(CreatePasswordPolicyRequest::builder)
                .basePath("/admin/v1")
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
    public CreateSmtpCredentialResponse createSmtpCredential(CreateSmtpCredentialRequest request) {

        return clientCall(request, CreateSmtpCredentialResponse::builder)
                .logger(LOG, "createSmtpCredential")
                .serviceDetails("IdentityDomains", "CreateSmtpCredential", "")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(CreateSmtpCredentialRequest::builder)
                .basePath("/admin/v1")
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
    public CreateUserResponse createUser(CreateUserRequest request) {

        return clientCall(request, CreateUserResponse::builder)
                .logger(LOG, "createUser")
                .serviceDetails("IdentityDomains", "CreateUser", "")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(CreateUserRequest::builder)
                .basePath("/admin/v1")
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
                .basePath("/admin/v1")
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
                .serviceDetails("IdentityDomains", "DeleteApiKey", "")
                .method(com.oracle.bmc.http.client.Method.DELETE)
                .requestBuilder(DeleteApiKeyRequest::builder)
                .basePath("/admin/v1")
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
    public DeleteAuthTokenResponse deleteAuthToken(DeleteAuthTokenRequest request) {

        Validate.notBlank(request.getAuthTokenId(), "authTokenId must not be blank");

        return clientCall(request, DeleteAuthTokenResponse::builder)
                .logger(LOG, "deleteAuthToken")
                .serviceDetails("IdentityDomains", "DeleteAuthToken", "")
                .method(com.oracle.bmc.http.client.Method.DELETE)
                .requestBuilder(DeleteAuthTokenRequest::builder)
                .basePath("/admin/v1")
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
    public DeleteCustomerSecretKeyResponse deleteCustomerSecretKey(
            DeleteCustomerSecretKeyRequest request) {

        Validate.notBlank(
                request.getCustomerSecretKeyId(), "customerSecretKeyId must not be blank");

        return clientCall(request, DeleteCustomerSecretKeyResponse::builder)
                .logger(LOG, "deleteCustomerSecretKey")
                .serviceDetails("IdentityDomains", "DeleteCustomerSecretKey", "")
                .method(com.oracle.bmc.http.client.Method.DELETE)
                .requestBuilder(DeleteCustomerSecretKeyRequest::builder)
                .basePath("/admin/v1")
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
                .serviceDetails("IdentityDomains", "DeleteDynamicResourceGroup", "")
                .method(com.oracle.bmc.http.client.Method.DELETE)
                .requestBuilder(DeleteDynamicResourceGroupRequest::builder)
                .basePath("/admin/v1")
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
    public DeleteGroupResponse deleteGroup(DeleteGroupRequest request) {

        Validate.notBlank(request.getGroupId(), "groupId must not be blank");

        return clientCall(request, DeleteGroupResponse::builder)
                .logger(LOG, "deleteGroup")
                .serviceDetails("IdentityDomains", "DeleteGroup", "")
                .method(com.oracle.bmc.http.client.Method.DELETE)
                .requestBuilder(DeleteGroupRequest::builder)
                .basePath("/admin/v1")
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
    public DeleteIdentityProviderResponse deleteIdentityProvider(
            DeleteIdentityProviderRequest request) {

        Validate.notBlank(request.getIdentityProviderId(), "identityProviderId must not be blank");

        return clientCall(request, DeleteIdentityProviderResponse::builder)
                .logger(LOG, "deleteIdentityProvider")
                .serviceDetails("IdentityDomains", "DeleteIdentityProvider", "")
                .method(com.oracle.bmc.http.client.Method.DELETE)
                .requestBuilder(DeleteIdentityProviderRequest::builder)
                .basePath("/admin/v1")
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
                .serviceDetails("IdentityDomains", "DeleteMyApiKey", "")
                .method(com.oracle.bmc.http.client.Method.DELETE)
                .requestBuilder(DeleteMyApiKeyRequest::builder)
                .basePath("/admin/v1")
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
                .serviceDetails("IdentityDomains", "DeleteMyAuthToken", "")
                .method(com.oracle.bmc.http.client.Method.DELETE)
                .requestBuilder(DeleteMyAuthTokenRequest::builder)
                .basePath("/admin/v1")
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
                .serviceDetails("IdentityDomains", "DeleteMyCustomerSecretKey", "")
                .method(com.oracle.bmc.http.client.Method.DELETE)
                .requestBuilder(DeleteMyCustomerSecretKeyRequest::builder)
                .basePath("/admin/v1")
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
                .serviceDetails("IdentityDomains", "DeleteMyDevice", "")
                .method(com.oracle.bmc.http.client.Method.DELETE)
                .requestBuilder(DeleteMyDeviceRequest::builder)
                .basePath("/admin/v1")
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
                .serviceDetails("IdentityDomains", "DeleteMyOAuth2ClientCredential", "")
                .method(com.oracle.bmc.http.client.Method.DELETE)
                .requestBuilder(DeleteMyOAuth2ClientCredentialRequest::builder)
                .basePath("/admin/v1")
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
                .serviceDetails("IdentityDomains", "DeleteMySmtpCredential", "")
                .method(com.oracle.bmc.http.client.Method.DELETE)
                .requestBuilder(DeleteMySmtpCredentialRequest::builder)
                .basePath("/admin/v1")
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
                .serviceDetails("IdentityDomains", "DeleteMySupportAccount", "")
                .method(com.oracle.bmc.http.client.Method.DELETE)
                .requestBuilder(DeleteMySupportAccountRequest::builder)
                .basePath("/admin/v1")
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
                .serviceDetails("IdentityDomains", "DeleteMyTrustedUserAgent", "")
                .method(com.oracle.bmc.http.client.Method.DELETE)
                .requestBuilder(DeleteMyTrustedUserAgentRequest::builder)
                .basePath("/admin/v1")
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
                .serviceDetails("IdentityDomains", "DeleteMyUserDbCredential", "")
                .method(com.oracle.bmc.http.client.Method.DELETE)
                .requestBuilder(DeleteMyUserDbCredentialRequest::builder)
                .basePath("/admin/v1")
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
    public DeleteOAuth2ClientCredentialResponse deleteOAuth2ClientCredential(
            DeleteOAuth2ClientCredentialRequest request) {

        Validate.notBlank(
                request.getOAuth2ClientCredentialId(),
                "oAuth2ClientCredentialId must not be blank");

        return clientCall(request, DeleteOAuth2ClientCredentialResponse::builder)
                .logger(LOG, "deleteOAuth2ClientCredential")
                .serviceDetails("IdentityDomains", "DeleteOAuth2ClientCredential", "")
                .method(com.oracle.bmc.http.client.Method.DELETE)
                .requestBuilder(DeleteOAuth2ClientCredentialRequest::builder)
                .basePath("/admin/v1")
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
    public DeletePasswordPolicyResponse deletePasswordPolicy(DeletePasswordPolicyRequest request) {

        Validate.notBlank(request.getPasswordPolicyId(), "passwordPolicyId must not be blank");

        return clientCall(request, DeletePasswordPolicyResponse::builder)
                .logger(LOG, "deletePasswordPolicy")
                .serviceDetails("IdentityDomains", "DeletePasswordPolicy", "")
                .method(com.oracle.bmc.http.client.Method.DELETE)
                .requestBuilder(DeletePasswordPolicyRequest::builder)
                .basePath("/admin/v1")
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
    public DeleteSmtpCredentialResponse deleteSmtpCredential(DeleteSmtpCredentialRequest request) {

        Validate.notBlank(request.getSmtpCredentialId(), "smtpCredentialId must not be blank");

        return clientCall(request, DeleteSmtpCredentialResponse::builder)
                .logger(LOG, "deleteSmtpCredential")
                .serviceDetails("IdentityDomains", "DeleteSmtpCredential", "")
                .method(com.oracle.bmc.http.client.Method.DELETE)
                .requestBuilder(DeleteSmtpCredentialRequest::builder)
                .basePath("/admin/v1")
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
    public DeleteUserResponse deleteUser(DeleteUserRequest request) {

        Validate.notBlank(request.getUserId(), "userId must not be blank");

        return clientCall(request, DeleteUserResponse::builder)
                .logger(LOG, "deleteUser")
                .serviceDetails("IdentityDomains", "DeleteUser", "")
                .method(com.oracle.bmc.http.client.Method.DELETE)
                .requestBuilder(DeleteUserRequest::builder)
                .basePath("/admin/v1")
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
                .serviceDetails("IdentityDomains", "DeleteUserDbCredential", "")
                .method(com.oracle.bmc.http.client.Method.DELETE)
                .requestBuilder(DeleteUserDbCredentialRequest::builder)
                .basePath("/admin/v1")
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
    public GetApiKeyResponse getApiKey(GetApiKeyRequest request) {

        Validate.notBlank(request.getApiKeyId(), "apiKeyId must not be blank");

        return clientCall(request, GetApiKeyResponse::builder)
                .logger(LOG, "getApiKey")
                .serviceDetails("IdentityDomains", "GetApiKey", "")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetApiKeyRequest::builder)
                .basePath("/admin/v1")
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
    public GetAuthTokenResponse getAuthToken(GetAuthTokenRequest request) {

        Validate.notBlank(request.getAuthTokenId(), "authTokenId must not be blank");

        return clientCall(request, GetAuthTokenResponse::builder)
                .logger(LOG, "getAuthToken")
                .serviceDetails("IdentityDomains", "GetAuthToken", "")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetAuthTokenRequest::builder)
                .basePath("/admin/v1")
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
                .serviceDetails("IdentityDomains", "GetAuthenticationFactorSetting", "")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetAuthenticationFactorSettingRequest::builder)
                .basePath("/admin/v1")
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
    public GetCustomerSecretKeyResponse getCustomerSecretKey(GetCustomerSecretKeyRequest request) {

        Validate.notBlank(
                request.getCustomerSecretKeyId(), "customerSecretKeyId must not be blank");

        return clientCall(request, GetCustomerSecretKeyResponse::builder)
                .logger(LOG, "getCustomerSecretKey")
                .serviceDetails("IdentityDomains", "GetCustomerSecretKey", "")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetCustomerSecretKeyRequest::builder)
                .basePath("/admin/v1")
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
                .serviceDetails("IdentityDomains", "GetDynamicResourceGroup", "")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetDynamicResourceGroupRequest::builder)
                .basePath("/admin/v1")
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
    public GetGroupResponse getGroup(GetGroupRequest request) {

        Validate.notBlank(request.getGroupId(), "groupId must not be blank");

        return clientCall(request, GetGroupResponse::builder)
                .logger(LOG, "getGroup")
                .serviceDetails("IdentityDomains", "GetGroup", "")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetGroupRequest::builder)
                .basePath("/admin/v1")
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
    public GetIdentityProviderResponse getIdentityProvider(GetIdentityProviderRequest request) {

        Validate.notBlank(request.getIdentityProviderId(), "identityProviderId must not be blank");

        return clientCall(request, GetIdentityProviderResponse::builder)
                .logger(LOG, "getIdentityProvider")
                .serviceDetails("IdentityDomains", "GetIdentityProvider", "")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetIdentityProviderRequest::builder)
                .basePath("/admin/v1")
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
    public GetKmsiSettingResponse getKmsiSetting(GetKmsiSettingRequest request) {

        Validate.notBlank(request.getKmsiSettingId(), "kmsiSettingId must not be blank");

        return clientCall(request, GetKmsiSettingResponse::builder)
                .logger(LOG, "getKmsiSetting")
                .serviceDetails("IdentityDomains", "GetKmsiSetting", "")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetKmsiSettingRequest::builder)
                .basePath("/admin/v1")
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
                .serviceDetails("IdentityDomains", "GetMe", "")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetMeRequest::builder)
                .basePath("/admin/v1")
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
                .serviceDetails("IdentityDomains", "GetMyApiKey", "")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetMyApiKeyRequest::builder)
                .basePath("/admin/v1")
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
                .serviceDetails("IdentityDomains", "GetMyAuthToken", "")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetMyAuthTokenRequest::builder)
                .basePath("/admin/v1")
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
    public GetMyCustomerSecretKeyResponse getMyCustomerSecretKey(
            GetMyCustomerSecretKeyRequest request) {

        Validate.notBlank(
                request.getMyCustomerSecretKeyId(), "myCustomerSecretKeyId must not be blank");

        return clientCall(request, GetMyCustomerSecretKeyResponse::builder)
                .logger(LOG, "getMyCustomerSecretKey")
                .serviceDetails("IdentityDomains", "GetMyCustomerSecretKey", "")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetMyCustomerSecretKeyRequest::builder)
                .basePath("/admin/v1")
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
                .serviceDetails("IdentityDomains", "GetMyDevice", "")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetMyDeviceRequest::builder)
                .basePath("/admin/v1")
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
                .serviceDetails("IdentityDomains", "GetMyOAuth2ClientCredential", "")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetMyOAuth2ClientCredentialRequest::builder)
                .basePath("/admin/v1")
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
    public GetMySmtpCredentialResponse getMySmtpCredential(GetMySmtpCredentialRequest request) {

        Validate.notBlank(request.getMySmtpCredentialId(), "mySmtpCredentialId must not be blank");

        return clientCall(request, GetMySmtpCredentialResponse::builder)
                .logger(LOG, "getMySmtpCredential")
                .serviceDetails("IdentityDomains", "GetMySmtpCredential", "")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetMySmtpCredentialRequest::builder)
                .basePath("/admin/v1")
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
                .serviceDetails("IdentityDomains", "GetMySupportAccount", "")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetMySupportAccountRequest::builder)
                .basePath("/admin/v1")
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
                .serviceDetails("IdentityDomains", "GetMyTrustedUserAgent", "")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetMyTrustedUserAgentRequest::builder)
                .basePath("/admin/v1")
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
                .serviceDetails("IdentityDomains", "GetMyUserDbCredential", "")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetMyUserDbCredentialRequest::builder)
                .basePath("/admin/v1")
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
    public GetOAuth2ClientCredentialResponse getOAuth2ClientCredential(
            GetOAuth2ClientCredentialRequest request) {

        Validate.notBlank(
                request.getOAuth2ClientCredentialId(),
                "oAuth2ClientCredentialId must not be blank");

        return clientCall(request, GetOAuth2ClientCredentialResponse::builder)
                .logger(LOG, "getOAuth2ClientCredential")
                .serviceDetails("IdentityDomains", "GetOAuth2ClientCredential", "")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetOAuth2ClientCredentialRequest::builder)
                .basePath("/admin/v1")
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
    public GetPasswordPolicyResponse getPasswordPolicy(GetPasswordPolicyRequest request) {

        Validate.notBlank(request.getPasswordPolicyId(), "passwordPolicyId must not be blank");

        return clientCall(request, GetPasswordPolicyResponse::builder)
                .logger(LOG, "getPasswordPolicy")
                .serviceDetails("IdentityDomains", "GetPasswordPolicy", "")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetPasswordPolicyRequest::builder)
                .basePath("/admin/v1")
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
    public GetSmtpCredentialResponse getSmtpCredential(GetSmtpCredentialRequest request) {

        Validate.notBlank(request.getSmtpCredentialId(), "smtpCredentialId must not be blank");

        return clientCall(request, GetSmtpCredentialResponse::builder)
                .logger(LOG, "getSmtpCredential")
                .serviceDetails("IdentityDomains", "GetSmtpCredential", "")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetSmtpCredentialRequest::builder)
                .basePath("/admin/v1")
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
    public GetUserResponse getUser(GetUserRequest request) {

        Validate.notBlank(request.getUserId(), "userId must not be blank");

        return clientCall(request, GetUserResponse::builder)
                .logger(LOG, "getUser")
                .serviceDetails("IdentityDomains", "GetUser", "")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetUserRequest::builder)
                .basePath("/admin/v1")
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
    public GetUserDbCredentialResponse getUserDbCredential(GetUserDbCredentialRequest request) {

        Validate.notBlank(request.getUserDbCredentialId(), "userDbCredentialId must not be blank");

        return clientCall(request, GetUserDbCredentialResponse::builder)
                .logger(LOG, "getUserDbCredential")
                .serviceDetails("IdentityDomains", "GetUserDbCredential", "")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetUserDbCredentialRequest::builder)
                .basePath("/admin/v1")
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
    public ListApiKeysResponse listApiKeys(ListApiKeysRequest request) {

        return clientCall(request, ListApiKeysResponse::builder)
                .logger(LOG, "listApiKeys")
                .serviceDetails("IdentityDomains", "ListApiKeys", "")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListApiKeysRequest::builder)
                .basePath("/admin/v1")
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
    public ListAuthTokensResponse listAuthTokens(ListAuthTokensRequest request) {

        return clientCall(request, ListAuthTokensResponse::builder)
                .logger(LOG, "listAuthTokens")
                .serviceDetails("IdentityDomains", "ListAuthTokens", "")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListAuthTokensRequest::builder)
                .basePath("/admin/v1")
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
                .serviceDetails("IdentityDomains", "ListAuthenticationFactorSettings", "")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListAuthenticationFactorSettingsRequest::builder)
                .basePath("/admin/v1")
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
    public ListCustomerSecretKeysResponse listCustomerSecretKeys(
            ListCustomerSecretKeysRequest request) {

        return clientCall(request, ListCustomerSecretKeysResponse::builder)
                .logger(LOG, "listCustomerSecretKeys")
                .serviceDetails("IdentityDomains", "ListCustomerSecretKeys", "")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListCustomerSecretKeysRequest::builder)
                .basePath("/admin/v1")
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
                .serviceDetails("IdentityDomains", "ListDynamicResourceGroups", "")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListDynamicResourceGroupsRequest::builder)
                .basePath("/admin/v1")
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
    public ListGroupsResponse listGroups(ListGroupsRequest request) {

        return clientCall(request, ListGroupsResponse::builder)
                .logger(LOG, "listGroups")
                .serviceDetails("IdentityDomains", "ListGroups", "")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListGroupsRequest::builder)
                .basePath("/admin/v1")
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
    public ListIdentityProvidersResponse listIdentityProviders(
            ListIdentityProvidersRequest request) {

        return clientCall(request, ListIdentityProvidersResponse::builder)
                .logger(LOG, "listIdentityProviders")
                .serviceDetails("IdentityDomains", "ListIdentityProviders", "")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListIdentityProvidersRequest::builder)
                .basePath("/admin/v1")
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
    public ListKmsiSettingsResponse listKmsiSettings(ListKmsiSettingsRequest request) {

        return clientCall(request, ListKmsiSettingsResponse::builder)
                .logger(LOG, "listKmsiSettings")
                .serviceDetails("IdentityDomains", "ListKmsiSettings", "")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListKmsiSettingsRequest::builder)
                .basePath("/admin/v1")
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
                .serviceDetails("IdentityDomains", "ListMyApiKeys", "")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListMyApiKeysRequest::builder)
                .basePath("/admin/v1")
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
    public ListMyAuthTokensResponse listMyAuthTokens(ListMyAuthTokensRequest request) {

        return clientCall(request, ListMyAuthTokensResponse::builder)
                .logger(LOG, "listMyAuthTokens")
                .serviceDetails("IdentityDomains", "ListMyAuthTokens", "")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListMyAuthTokensRequest::builder)
                .basePath("/admin/v1")
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
    public ListMyCustomerSecretKeysResponse listMyCustomerSecretKeys(
            ListMyCustomerSecretKeysRequest request) {

        return clientCall(request, ListMyCustomerSecretKeysResponse::builder)
                .logger(LOG, "listMyCustomerSecretKeys")
                .serviceDetails("IdentityDomains", "ListMyCustomerSecretKeys", "")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListMyCustomerSecretKeysRequest::builder)
                .basePath("/admin/v1")
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
                .serviceDetails("IdentityDomains", "ListMyDevices", "")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListMyDevicesRequest::builder)
                .basePath("/admin/v1")
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
                .serviceDetails("IdentityDomains", "ListMyGroups", "")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListMyGroupsRequest::builder)
                .basePath("/admin/v1")
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
                .serviceDetails("IdentityDomains", "ListMyOAuth2ClientCredentials", "")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListMyOAuth2ClientCredentialsRequest::builder)
                .basePath("/admin/v1")
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
    public ListMySmtpCredentialsResponse listMySmtpCredentials(
            ListMySmtpCredentialsRequest request) {

        return clientCall(request, ListMySmtpCredentialsResponse::builder)
                .logger(LOG, "listMySmtpCredentials")
                .serviceDetails("IdentityDomains", "ListMySmtpCredentials", "")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListMySmtpCredentialsRequest::builder)
                .basePath("/admin/v1")
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
                .serviceDetails("IdentityDomains", "ListMySupportAccounts", "")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListMySupportAccountsRequest::builder)
                .basePath("/admin/v1")
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
                .serviceDetails("IdentityDomains", "ListMyTrustedUserAgents", "")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListMyTrustedUserAgentsRequest::builder)
                .basePath("/admin/v1")
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
                .serviceDetails("IdentityDomains", "ListMyUserDbCredentials", "")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListMyUserDbCredentialsRequest::builder)
                .basePath("/admin/v1")
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
    public ListOAuth2ClientCredentialsResponse listOAuth2ClientCredentials(
            ListOAuth2ClientCredentialsRequest request) {

        return clientCall(request, ListOAuth2ClientCredentialsResponse::builder)
                .logger(LOG, "listOAuth2ClientCredentials")
                .serviceDetails("IdentityDomains", "ListOAuth2ClientCredentials", "")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListOAuth2ClientCredentialsRequest::builder)
                .basePath("/admin/v1")
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
    public ListPasswordPoliciesResponse listPasswordPolicies(ListPasswordPoliciesRequest request) {

        return clientCall(request, ListPasswordPoliciesResponse::builder)
                .logger(LOG, "listPasswordPolicies")
                .serviceDetails("IdentityDomains", "ListPasswordPolicies", "")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListPasswordPoliciesRequest::builder)
                .basePath("/admin/v1")
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
    public ListSmtpCredentialsResponse listSmtpCredentials(ListSmtpCredentialsRequest request) {

        return clientCall(request, ListSmtpCredentialsResponse::builder)
                .logger(LOG, "listSmtpCredentials")
                .serviceDetails("IdentityDomains", "ListSmtpCredentials", "")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListSmtpCredentialsRequest::builder)
                .basePath("/admin/v1")
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
    public ListUserDbCredentialsResponse listUserDbCredentials(
            ListUserDbCredentialsRequest request) {

        return clientCall(request, ListUserDbCredentialsResponse::builder)
                .logger(LOG, "listUserDbCredentials")
                .serviceDetails("IdentityDomains", "ListUserDbCredentials", "")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListUserDbCredentialsRequest::builder)
                .basePath("/admin/v1")
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
                .serviceDetails("IdentityDomains", "ListUsers", "")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListUsersRequest::builder)
                .basePath("/admin/v1")
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
    public PatchApiKeyResponse patchApiKey(PatchApiKeyRequest request) {

        Validate.notBlank(request.getApiKeyId(), "apiKeyId must not be blank");

        return clientCall(request, PatchApiKeyResponse::builder)
                .logger(LOG, "patchApiKey")
                .serviceDetails("IdentityDomains", "PatchApiKey", "")
                .method(com.oracle.bmc.http.client.Method.PATCH)
                .requestBuilder(PatchApiKeyRequest::builder)
                .basePath("/admin/v1")
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
    public PatchAuthTokenResponse patchAuthToken(PatchAuthTokenRequest request) {

        Validate.notBlank(request.getAuthTokenId(), "authTokenId must not be blank");

        return clientCall(request, PatchAuthTokenResponse::builder)
                .logger(LOG, "patchAuthToken")
                .serviceDetails("IdentityDomains", "PatchAuthToken", "")
                .method(com.oracle.bmc.http.client.Method.PATCH)
                .requestBuilder(PatchAuthTokenRequest::builder)
                .basePath("/admin/v1")
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
    public PatchCustomerSecretKeyResponse patchCustomerSecretKey(
            PatchCustomerSecretKeyRequest request) {

        Validate.notBlank(
                request.getCustomerSecretKeyId(), "customerSecretKeyId must not be blank");

        return clientCall(request, PatchCustomerSecretKeyResponse::builder)
                .logger(LOG, "patchCustomerSecretKey")
                .serviceDetails("IdentityDomains", "PatchCustomerSecretKey", "")
                .method(com.oracle.bmc.http.client.Method.PATCH)
                .requestBuilder(PatchCustomerSecretKeyRequest::builder)
                .basePath("/admin/v1")
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
                .serviceDetails("IdentityDomains", "PatchDynamicResourceGroup", "")
                .method(com.oracle.bmc.http.client.Method.PATCH)
                .requestBuilder(PatchDynamicResourceGroupRequest::builder)
                .basePath("/admin/v1")
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
    public PatchGroupResponse patchGroup(PatchGroupRequest request) {

        Validate.notBlank(request.getGroupId(), "groupId must not be blank");

        return clientCall(request, PatchGroupResponse::builder)
                .logger(LOG, "patchGroup")
                .serviceDetails("IdentityDomains", "PatchGroup", "")
                .method(com.oracle.bmc.http.client.Method.PATCH)
                .requestBuilder(PatchGroupRequest::builder)
                .basePath("/admin/v1")
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
    public PatchIdentityProviderResponse patchIdentityProvider(
            PatchIdentityProviderRequest request) {

        Validate.notBlank(request.getIdentityProviderId(), "identityProviderId must not be blank");

        return clientCall(request, PatchIdentityProviderResponse::builder)
                .logger(LOG, "patchIdentityProvider")
                .serviceDetails("IdentityDomains", "PatchIdentityProvider", "")
                .method(com.oracle.bmc.http.client.Method.PATCH)
                .requestBuilder(PatchIdentityProviderRequest::builder)
                .basePath("/admin/v1")
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
    public PatchKmsiSettingResponse patchKmsiSetting(PatchKmsiSettingRequest request) {

        Validate.notBlank(request.getKmsiSettingId(), "kmsiSettingId must not be blank");

        return clientCall(request, PatchKmsiSettingResponse::builder)
                .logger(LOG, "patchKmsiSetting")
                .serviceDetails("IdentityDomains", "PatchKmsiSetting", "")
                .method(com.oracle.bmc.http.client.Method.PATCH)
                .requestBuilder(PatchKmsiSettingRequest::builder)
                .basePath("/admin/v1")
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
                .serviceDetails("IdentityDomains", "PatchMe", "")
                .method(com.oracle.bmc.http.client.Method.PATCH)
                .requestBuilder(PatchMeRequest::builder)
                .basePath("/admin/v1")
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
                .serviceDetails("IdentityDomains", "PatchMyApiKey", "")
                .method(com.oracle.bmc.http.client.Method.PATCH)
                .requestBuilder(PatchMyApiKeyRequest::builder)
                .basePath("/admin/v1")
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
                .serviceDetails("IdentityDomains", "PatchMyAuthToken", "")
                .method(com.oracle.bmc.http.client.Method.PATCH)
                .requestBuilder(PatchMyAuthTokenRequest::builder)
                .basePath("/admin/v1")
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
                .serviceDetails("IdentityDomains", "PatchMyCustomerSecretKey", "")
                .method(com.oracle.bmc.http.client.Method.PATCH)
                .requestBuilder(PatchMyCustomerSecretKeyRequest::builder)
                .basePath("/admin/v1")
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
                .serviceDetails("IdentityDomains", "PatchMyDevice", "")
                .method(com.oracle.bmc.http.client.Method.PATCH)
                .requestBuilder(PatchMyDeviceRequest::builder)
                .basePath("/admin/v1")
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
                .serviceDetails("IdentityDomains", "PatchMyOAuth2ClientCredential", "")
                .method(com.oracle.bmc.http.client.Method.PATCH)
                .requestBuilder(PatchMyOAuth2ClientCredentialRequest::builder)
                .basePath("/admin/v1")
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
    public PatchMySmtpCredentialResponse patchMySmtpCredential(
            PatchMySmtpCredentialRequest request) {

        Validate.notBlank(request.getMySmtpCredentialId(), "mySmtpCredentialId must not be blank");

        return clientCall(request, PatchMySmtpCredentialResponse::builder)
                .logger(LOG, "patchMySmtpCredential")
                .serviceDetails("IdentityDomains", "PatchMySmtpCredential", "")
                .method(com.oracle.bmc.http.client.Method.PATCH)
                .requestBuilder(PatchMySmtpCredentialRequest::builder)
                .basePath("/admin/v1")
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
    public PatchOAuth2ClientCredentialResponse patchOAuth2ClientCredential(
            PatchOAuth2ClientCredentialRequest request) {

        Validate.notBlank(
                request.getOAuth2ClientCredentialId(),
                "oAuth2ClientCredentialId must not be blank");

        return clientCall(request, PatchOAuth2ClientCredentialResponse::builder)
                .logger(LOG, "patchOAuth2ClientCredential")
                .serviceDetails("IdentityDomains", "PatchOAuth2ClientCredential", "")
                .method(com.oracle.bmc.http.client.Method.PATCH)
                .requestBuilder(PatchOAuth2ClientCredentialRequest::builder)
                .basePath("/admin/v1")
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
                .serviceDetails("IdentityDomains", "PatchPasswordPolicy", "")
                .method(com.oracle.bmc.http.client.Method.PATCH)
                .requestBuilder(PatchPasswordPolicyRequest::builder)
                .basePath("/admin/v1")
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
    public PatchSmtpCredentialResponse patchSmtpCredential(PatchSmtpCredentialRequest request) {

        Validate.notBlank(request.getSmtpCredentialId(), "smtpCredentialId must not be blank");

        return clientCall(request, PatchSmtpCredentialResponse::builder)
                .logger(LOG, "patchSmtpCredential")
                .serviceDetails("IdentityDomains", "PatchSmtpCredential", "")
                .method(com.oracle.bmc.http.client.Method.PATCH)
                .requestBuilder(PatchSmtpCredentialRequest::builder)
                .basePath("/admin/v1")
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
    public PatchUserResponse patchUser(PatchUserRequest request) {

        Validate.notBlank(request.getUserId(), "userId must not be blank");

        return clientCall(request, PatchUserResponse::builder)
                .logger(LOG, "patchUser")
                .serviceDetails("IdentityDomains", "PatchUser", "")
                .method(com.oracle.bmc.http.client.Method.PATCH)
                .requestBuilder(PatchUserRequest::builder)
                .basePath("/admin/v1")
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
    public PutAuthenticationFactorSettingResponse putAuthenticationFactorSetting(
            PutAuthenticationFactorSettingRequest request) {

        Validate.notBlank(
                request.getAuthenticationFactorSettingId(),
                "authenticationFactorSettingId must not be blank");

        return clientCall(request, PutAuthenticationFactorSettingResponse::builder)
                .logger(LOG, "putAuthenticationFactorSetting")
                .serviceDetails("IdentityDomains", "PutAuthenticationFactorSetting", "")
                .method(com.oracle.bmc.http.client.Method.PUT)
                .requestBuilder(PutAuthenticationFactorSettingRequest::builder)
                .basePath("/admin/v1")
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
    public PutDynamicResourceGroupResponse putDynamicResourceGroup(
            PutDynamicResourceGroupRequest request) {

        Validate.notBlank(
                request.getDynamicResourceGroupId(), "dynamicResourceGroupId must not be blank");

        return clientCall(request, PutDynamicResourceGroupResponse::builder)
                .logger(LOG, "putDynamicResourceGroup")
                .serviceDetails("IdentityDomains", "PutDynamicResourceGroup", "")
                .method(com.oracle.bmc.http.client.Method.PUT)
                .requestBuilder(PutDynamicResourceGroupRequest::builder)
                .basePath("/admin/v1")
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
                .serviceDetails("IdentityDomains", "PutGroup", "")
                .method(com.oracle.bmc.http.client.Method.PUT)
                .requestBuilder(PutGroupRequest::builder)
                .basePath("/admin/v1")
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
    public PutIdentityProviderResponse putIdentityProvider(PutIdentityProviderRequest request) {

        Validate.notBlank(request.getIdentityProviderId(), "identityProviderId must not be blank");

        return clientCall(request, PutIdentityProviderResponse::builder)
                .logger(LOG, "putIdentityProvider")
                .serviceDetails("IdentityDomains", "PutIdentityProvider", "")
                .method(com.oracle.bmc.http.client.Method.PUT)
                .requestBuilder(PutIdentityProviderRequest::builder)
                .basePath("/admin/v1")
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
    public PutKmsiSettingResponse putKmsiSetting(PutKmsiSettingRequest request) {

        Validate.notBlank(request.getKmsiSettingId(), "kmsiSettingId must not be blank");

        return clientCall(request, PutKmsiSettingResponse::builder)
                .logger(LOG, "putKmsiSetting")
                .serviceDetails("IdentityDomains", "PutKmsiSetting", "")
                .method(com.oracle.bmc.http.client.Method.PUT)
                .requestBuilder(PutKmsiSettingRequest::builder)
                .basePath("/admin/v1")
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
                .serviceDetails("IdentityDomains", "PutMe", "")
                .method(com.oracle.bmc.http.client.Method.PUT)
                .requestBuilder(PutMeRequest::builder)
                .basePath("/admin/v1")
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
                .serviceDetails("IdentityDomains", "PutMePasswordChanger", "")
                .method(com.oracle.bmc.http.client.Method.PUT)
                .requestBuilder(PutMePasswordChangerRequest::builder)
                .basePath("/admin/v1")
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
    public PutPasswordPolicyResponse putPasswordPolicy(PutPasswordPolicyRequest request) {

        Validate.notBlank(request.getPasswordPolicyId(), "passwordPolicyId must not be blank");

        return clientCall(request, PutPasswordPolicyResponse::builder)
                .logger(LOG, "putPasswordPolicy")
                .serviceDetails("IdentityDomains", "PutPasswordPolicy", "")
                .method(com.oracle.bmc.http.client.Method.PUT)
                .requestBuilder(PutPasswordPolicyRequest::builder)
                .basePath("/admin/v1")
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
    public PutUserResponse putUser(PutUserRequest request) {

        Validate.notBlank(request.getUserId(), "userId must not be blank");

        return clientCall(request, PutUserResponse::builder)
                .logger(LOG, "putUser")
                .serviceDetails("IdentityDomains", "PutUser", "")
                .method(com.oracle.bmc.http.client.Method.PUT)
                .requestBuilder(PutUserRequest::builder)
                .basePath("/admin/v1")
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
                .serviceDetails("IdentityDomains", "PutUserCapabilitiesChanger", "")
                .method(com.oracle.bmc.http.client.Method.PUT)
                .requestBuilder(PutUserCapabilitiesChangerRequest::builder)
                .basePath("/admin/v1")
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
                .serviceDetails("IdentityDomains", "PutUserPasswordChanger", "")
                .method(com.oracle.bmc.http.client.Method.PUT)
                .requestBuilder(PutUserPasswordChangerRequest::builder)
                .basePath("/admin/v1")
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
                .serviceDetails("IdentityDomains", "PutUserPasswordResetter", "")
                .method(com.oracle.bmc.http.client.Method.PUT)
                .requestBuilder(PutUserPasswordResetterRequest::builder)
                .basePath("/admin/v1")
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
                .serviceDetails("IdentityDomains", "PutUserStatusChanger", "")
                .method(com.oracle.bmc.http.client.Method.PUT)
                .requestBuilder(PutUserStatusChangerRequest::builder)
                .basePath("/admin/v1")
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
    public SearchApiKeysResponse searchApiKeys(SearchApiKeysRequest request) {

        return clientCall(request, SearchApiKeysResponse::builder)
                .logger(LOG, "searchApiKeys")
                .serviceDetails("IdentityDomains", "SearchApiKeys", "")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(SearchApiKeysRequest::builder)
                .basePath("/admin/v1")
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
    public SearchAuthTokensResponse searchAuthTokens(SearchAuthTokensRequest request) {

        return clientCall(request, SearchAuthTokensResponse::builder)
                .logger(LOG, "searchAuthTokens")
                .serviceDetails("IdentityDomains", "SearchAuthTokens", "")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(SearchAuthTokensRequest::builder)
                .basePath("/admin/v1")
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
                .serviceDetails("IdentityDomains", "SearchAuthenticationFactorSettings", "")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(SearchAuthenticationFactorSettingsRequest::builder)
                .basePath("/admin/v1")
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
    public SearchCustomerSecretKeysResponse searchCustomerSecretKeys(
            SearchCustomerSecretKeysRequest request) {

        return clientCall(request, SearchCustomerSecretKeysResponse::builder)
                .logger(LOG, "searchCustomerSecretKeys")
                .serviceDetails("IdentityDomains", "SearchCustomerSecretKeys", "")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(SearchCustomerSecretKeysRequest::builder)
                .basePath("/admin/v1")
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
                .serviceDetails("IdentityDomains", "SearchDynamicResourceGroups", "")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(SearchDynamicResourceGroupsRequest::builder)
                .basePath("/admin/v1")
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
    public SearchGroupsResponse searchGroups(SearchGroupsRequest request) {

        return clientCall(request, SearchGroupsResponse::builder)
                .logger(LOG, "searchGroups")
                .serviceDetails("IdentityDomains", "SearchGroups", "")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(SearchGroupsRequest::builder)
                .basePath("/admin/v1")
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
                .serviceDetails("IdentityDomains", "SearchIdentityProviders", "")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(SearchIdentityProvidersRequest::builder)
                .basePath("/admin/v1")
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
    public SearchKmsiSettingsResponse searchKmsiSettings(SearchKmsiSettingsRequest request) {

        return clientCall(request, SearchKmsiSettingsResponse::builder)
                .logger(LOG, "searchKmsiSettings")
                .serviceDetails("IdentityDomains", "SearchKmsiSettings", "")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(SearchKmsiSettingsRequest::builder)
                .basePath("/admin/v1")
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
    public SearchMyGroupsResponse searchMyGroups(SearchMyGroupsRequest request) {

        return clientCall(request, SearchMyGroupsResponse::builder)
                .logger(LOG, "searchMyGroups")
                .serviceDetails("IdentityDomains", "SearchMyGroups", "")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(SearchMyGroupsRequest::builder)
                .basePath("/admin/v1")
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
    public SearchOAuth2ClientCredentialsResponse searchOAuth2ClientCredentials(
            SearchOAuth2ClientCredentialsRequest request) {

        return clientCall(request, SearchOAuth2ClientCredentialsResponse::builder)
                .logger(LOG, "searchOAuth2ClientCredentials")
                .serviceDetails("IdentityDomains", "SearchOAuth2ClientCredentials", "")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(SearchOAuth2ClientCredentialsRequest::builder)
                .basePath("/admin/v1")
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
    public SearchPasswordPoliciesResponse searchPasswordPolicies(
            SearchPasswordPoliciesRequest request) {

        return clientCall(request, SearchPasswordPoliciesResponse::builder)
                .logger(LOG, "searchPasswordPolicies")
                .serviceDetails("IdentityDomains", "SearchPasswordPolicies", "")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(SearchPasswordPoliciesRequest::builder)
                .basePath("/admin/v1")
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
    public SearchSmtpCredentialsResponse searchSmtpCredentials(
            SearchSmtpCredentialsRequest request) {

        return clientCall(request, SearchSmtpCredentialsResponse::builder)
                .logger(LOG, "searchSmtpCredentials")
                .serviceDetails("IdentityDomains", "SearchSmtpCredentials", "")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(SearchSmtpCredentialsRequest::builder)
                .basePath("/admin/v1")
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
    public SearchUserDbCredentialsResponse searchUserDbCredentials(
            SearchUserDbCredentialsRequest request) {

        return clientCall(request, SearchUserDbCredentialsResponse::builder)
                .logger(LOG, "searchUserDbCredentials")
                .serviceDetails("IdentityDomains", "SearchUserDbCredentials", "")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(SearchUserDbCredentialsRequest::builder)
                .basePath("/admin/v1")
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
                .serviceDetails("IdentityDomains", "SearchUsers", "")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(SearchUsersRequest::builder)
                .basePath("/admin/v1")
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
