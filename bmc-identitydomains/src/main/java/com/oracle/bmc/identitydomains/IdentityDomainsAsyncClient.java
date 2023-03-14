/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.identitydomains;

import com.oracle.bmc.util.internal.Validate;
import com.oracle.bmc.identitydomains.requests.*;
import com.oracle.bmc.identitydomains.responses.*;

import java.util.Objects;

/**
 * Async client implementation for IdentityDomains service. <br>
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
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: v1")
public class IdentityDomainsAsyncClient extends com.oracle.bmc.http.internal.BaseAsyncClient
        implements IdentityDomainsAsync {
    /** Service instance for IdentityDomains. */
    public static final com.oracle.bmc.Service SERVICE =
            com.oracle.bmc.Services.serviceBuilder()
                    .serviceName("IDENTITYDOMAINS")
                    .serviceEndpointPrefix("")
                    .serviceEndpointTemplate("https://identity.{region}.oci.{secondLevelDomain}")
                    .build();

    private static final org.slf4j.Logger LOG =
            org.slf4j.LoggerFactory.getLogger(IdentityDomainsAsyncClient.class);

    private IdentityDomainsAsyncClient(
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
            extends com.oracle.bmc.common.ClientBuilderBase<Builder, IdentityDomainsAsyncClient> {
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
        public IdentityDomainsAsyncClient build(
                @jakarta.annotation.Nonnull
                        com.oracle.bmc.auth.AbstractAuthenticationDetailsProvider
                                authenticationDetailsProvider) {
            return new IdentityDomainsAsyncClient(this, authenticationDetailsProvider);
        }
    }

    @Override
    public java.util.concurrent.Future<CreateApiKeyResponse> createApiKey(
            CreateApiKeyRequest request,
            final com.oracle.bmc.responses.AsyncHandler<CreateApiKeyRequest, CreateApiKeyResponse>
                    handler) {

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
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<CreateAuthTokenResponse> createAuthToken(
            CreateAuthTokenRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            CreateAuthTokenRequest, CreateAuthTokenResponse>
                    handler) {

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
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<CreateAuthenticationFactorsRemoverResponse>
            createAuthenticationFactorsRemover(
                    CreateAuthenticationFactorsRemoverRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    CreateAuthenticationFactorsRemoverRequest,
                                    CreateAuthenticationFactorsRemoverResponse>
                            handler) {

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
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<CreateCustomerSecretKeyResponse> createCustomerSecretKey(
            CreateCustomerSecretKeyRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            CreateCustomerSecretKeyRequest, CreateCustomerSecretKeyResponse>
                    handler) {

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
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<CreateDynamicResourceGroupResponse>
            createDynamicResourceGroup(
                    CreateDynamicResourceGroupRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    CreateDynamicResourceGroupRequest,
                                    CreateDynamicResourceGroupResponse>
                            handler) {

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
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<CreateGroupResponse> createGroup(
            CreateGroupRequest request,
            final com.oracle.bmc.responses.AsyncHandler<CreateGroupRequest, CreateGroupResponse>
                    handler) {

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
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<CreateIdentityProviderResponse> createIdentityProvider(
            CreateIdentityProviderRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            CreateIdentityProviderRequest, CreateIdentityProviderResponse>
                    handler) {

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
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<CreateMeResponse> createMe(
            CreateMeRequest request,
            final com.oracle.bmc.responses.AsyncHandler<CreateMeRequest, CreateMeResponse>
                    handler) {

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
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<CreateMyApiKeyResponse> createMyApiKey(
            CreateMyApiKeyRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            CreateMyApiKeyRequest, CreateMyApiKeyResponse>
                    handler) {

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
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<CreateMyAuthTokenResponse> createMyAuthToken(
            CreateMyAuthTokenRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            CreateMyAuthTokenRequest, CreateMyAuthTokenResponse>
                    handler) {

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
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<CreateMyAuthenticationFactorInitiatorResponse>
            createMyAuthenticationFactorInitiator(
                    CreateMyAuthenticationFactorInitiatorRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    CreateMyAuthenticationFactorInitiatorRequest,
                                    CreateMyAuthenticationFactorInitiatorResponse>
                            handler) {

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
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<CreateMyAuthenticationFactorValidatorResponse>
            createMyAuthenticationFactorValidator(
                    CreateMyAuthenticationFactorValidatorRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    CreateMyAuthenticationFactorValidatorRequest,
                                    CreateMyAuthenticationFactorValidatorResponse>
                            handler) {

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
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<CreateMyAuthenticationFactorsRemoverResponse>
            createMyAuthenticationFactorsRemover(
                    CreateMyAuthenticationFactorsRemoverRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    CreateMyAuthenticationFactorsRemoverRequest,
                                    CreateMyAuthenticationFactorsRemoverResponse>
                            handler) {

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
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<CreateMyCustomerSecretKeyResponse> createMyCustomerSecretKey(
            CreateMyCustomerSecretKeyRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            CreateMyCustomerSecretKeyRequest, CreateMyCustomerSecretKeyResponse>
                    handler) {

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
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<CreateMyOAuth2ClientCredentialResponse>
            createMyOAuth2ClientCredential(
                    CreateMyOAuth2ClientCredentialRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    CreateMyOAuth2ClientCredentialRequest,
                                    CreateMyOAuth2ClientCredentialResponse>
                            handler) {

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
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<CreateMySmtpCredentialResponse> createMySmtpCredential(
            CreateMySmtpCredentialRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            CreateMySmtpCredentialRequest, CreateMySmtpCredentialResponse>
                    handler) {

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
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<CreateMySupportAccountResponse> createMySupportAccount(
            CreateMySupportAccountRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            CreateMySupportAccountRequest, CreateMySupportAccountResponse>
                    handler) {

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
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<CreateMyUserDbCredentialResponse> createMyUserDbCredential(
            CreateMyUserDbCredentialRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            CreateMyUserDbCredentialRequest, CreateMyUserDbCredentialResponse>
                    handler) {

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
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<CreateOAuth2ClientCredentialResponse>
            createOAuth2ClientCredential(
                    CreateOAuth2ClientCredentialRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    CreateOAuth2ClientCredentialRequest,
                                    CreateOAuth2ClientCredentialResponse>
                            handler) {

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
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<CreatePasswordPolicyResponse> createPasswordPolicy(
            CreatePasswordPolicyRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            CreatePasswordPolicyRequest, CreatePasswordPolicyResponse>
                    handler) {

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
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<CreateSmtpCredentialResponse> createSmtpCredential(
            CreateSmtpCredentialRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            CreateSmtpCredentialRequest, CreateSmtpCredentialResponse>
                    handler) {

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
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<CreateUserResponse> createUser(
            CreateUserRequest request,
            final com.oracle.bmc.responses.AsyncHandler<CreateUserRequest, CreateUserResponse>
                    handler) {

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
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<CreateUserDbCredentialResponse> createUserDbCredential(
            CreateUserDbCredentialRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            CreateUserDbCredentialRequest, CreateUserDbCredentialResponse>
                    handler) {

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
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<DeleteApiKeyResponse> deleteApiKey(
            DeleteApiKeyRequest request,
            final com.oracle.bmc.responses.AsyncHandler<DeleteApiKeyRequest, DeleteApiKeyResponse>
                    handler) {

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
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<DeleteAuthTokenResponse> deleteAuthToken(
            DeleteAuthTokenRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            DeleteAuthTokenRequest, DeleteAuthTokenResponse>
                    handler) {

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
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<DeleteCustomerSecretKeyResponse> deleteCustomerSecretKey(
            DeleteCustomerSecretKeyRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            DeleteCustomerSecretKeyRequest, DeleteCustomerSecretKeyResponse>
                    handler) {

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
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<DeleteDynamicResourceGroupResponse>
            deleteDynamicResourceGroup(
                    DeleteDynamicResourceGroupRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    DeleteDynamicResourceGroupRequest,
                                    DeleteDynamicResourceGroupResponse>
                            handler) {

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
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<DeleteGroupResponse> deleteGroup(
            DeleteGroupRequest request,
            final com.oracle.bmc.responses.AsyncHandler<DeleteGroupRequest, DeleteGroupResponse>
                    handler) {

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
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<DeleteIdentityProviderResponse> deleteIdentityProvider(
            DeleteIdentityProviderRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            DeleteIdentityProviderRequest, DeleteIdentityProviderResponse>
                    handler) {

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
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<DeleteMyApiKeyResponse> deleteMyApiKey(
            DeleteMyApiKeyRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            DeleteMyApiKeyRequest, DeleteMyApiKeyResponse>
                    handler) {

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
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<DeleteMyAuthTokenResponse> deleteMyAuthToken(
            DeleteMyAuthTokenRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            DeleteMyAuthTokenRequest, DeleteMyAuthTokenResponse>
                    handler) {

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
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<DeleteMyCustomerSecretKeyResponse> deleteMyCustomerSecretKey(
            DeleteMyCustomerSecretKeyRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            DeleteMyCustomerSecretKeyRequest, DeleteMyCustomerSecretKeyResponse>
                    handler) {

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
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<DeleteMyDeviceResponse> deleteMyDevice(
            DeleteMyDeviceRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            DeleteMyDeviceRequest, DeleteMyDeviceResponse>
                    handler) {

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
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<DeleteMyOAuth2ClientCredentialResponse>
            deleteMyOAuth2ClientCredential(
                    DeleteMyOAuth2ClientCredentialRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    DeleteMyOAuth2ClientCredentialRequest,
                                    DeleteMyOAuth2ClientCredentialResponse>
                            handler) {

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
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<DeleteMySmtpCredentialResponse> deleteMySmtpCredential(
            DeleteMySmtpCredentialRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            DeleteMySmtpCredentialRequest, DeleteMySmtpCredentialResponse>
                    handler) {

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
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<DeleteMySupportAccountResponse> deleteMySupportAccount(
            DeleteMySupportAccountRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            DeleteMySupportAccountRequest, DeleteMySupportAccountResponse>
                    handler) {

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
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<DeleteMyTrustedUserAgentResponse> deleteMyTrustedUserAgent(
            DeleteMyTrustedUserAgentRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            DeleteMyTrustedUserAgentRequest, DeleteMyTrustedUserAgentResponse>
                    handler) {

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
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<DeleteMyUserDbCredentialResponse> deleteMyUserDbCredential(
            DeleteMyUserDbCredentialRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            DeleteMyUserDbCredentialRequest, DeleteMyUserDbCredentialResponse>
                    handler) {

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
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<DeleteOAuth2ClientCredentialResponse>
            deleteOAuth2ClientCredential(
                    DeleteOAuth2ClientCredentialRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    DeleteOAuth2ClientCredentialRequest,
                                    DeleteOAuth2ClientCredentialResponse>
                            handler) {

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
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<DeletePasswordPolicyResponse> deletePasswordPolicy(
            DeletePasswordPolicyRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            DeletePasswordPolicyRequest, DeletePasswordPolicyResponse>
                    handler) {

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
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<DeleteSmtpCredentialResponse> deleteSmtpCredential(
            DeleteSmtpCredentialRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            DeleteSmtpCredentialRequest, DeleteSmtpCredentialResponse>
                    handler) {

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
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<DeleteUserResponse> deleteUser(
            DeleteUserRequest request,
            final com.oracle.bmc.responses.AsyncHandler<DeleteUserRequest, DeleteUserResponse>
                    handler) {

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
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<DeleteUserDbCredentialResponse> deleteUserDbCredential(
            DeleteUserDbCredentialRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            DeleteUserDbCredentialRequest, DeleteUserDbCredentialResponse>
                    handler) {

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
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<GetApiKeyResponse> getApiKey(
            GetApiKeyRequest request,
            final com.oracle.bmc.responses.AsyncHandler<GetApiKeyRequest, GetApiKeyResponse>
                    handler) {

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
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<GetAuthTokenResponse> getAuthToken(
            GetAuthTokenRequest request,
            final com.oracle.bmc.responses.AsyncHandler<GetAuthTokenRequest, GetAuthTokenResponse>
                    handler) {

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
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<GetAuthenticationFactorSettingResponse>
            getAuthenticationFactorSetting(
                    GetAuthenticationFactorSettingRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    GetAuthenticationFactorSettingRequest,
                                    GetAuthenticationFactorSettingResponse>
                            handler) {

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
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<GetCustomerSecretKeyResponse> getCustomerSecretKey(
            GetCustomerSecretKeyRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            GetCustomerSecretKeyRequest, GetCustomerSecretKeyResponse>
                    handler) {

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
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<GetDynamicResourceGroupResponse> getDynamicResourceGroup(
            GetDynamicResourceGroupRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            GetDynamicResourceGroupRequest, GetDynamicResourceGroupResponse>
                    handler) {

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
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<GetGroupResponse> getGroup(
            GetGroupRequest request,
            final com.oracle.bmc.responses.AsyncHandler<GetGroupRequest, GetGroupResponse>
                    handler) {

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
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<GetIdentityProviderResponse> getIdentityProvider(
            GetIdentityProviderRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            GetIdentityProviderRequest, GetIdentityProviderResponse>
                    handler) {

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
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<GetKmsiSettingResponse> getKmsiSetting(
            GetKmsiSettingRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            GetKmsiSettingRequest, GetKmsiSettingResponse>
                    handler) {

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
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<GetMeResponse> getMe(
            GetMeRequest request,
            final com.oracle.bmc.responses.AsyncHandler<GetMeRequest, GetMeResponse> handler) {

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
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<GetMyApiKeyResponse> getMyApiKey(
            GetMyApiKeyRequest request,
            final com.oracle.bmc.responses.AsyncHandler<GetMyApiKeyRequest, GetMyApiKeyResponse>
                    handler) {

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
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<GetMyAuthTokenResponse> getMyAuthToken(
            GetMyAuthTokenRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            GetMyAuthTokenRequest, GetMyAuthTokenResponse>
                    handler) {

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
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<GetMyCustomerSecretKeyResponse> getMyCustomerSecretKey(
            GetMyCustomerSecretKeyRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            GetMyCustomerSecretKeyRequest, GetMyCustomerSecretKeyResponse>
                    handler) {

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
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<GetMyDeviceResponse> getMyDevice(
            GetMyDeviceRequest request,
            final com.oracle.bmc.responses.AsyncHandler<GetMyDeviceRequest, GetMyDeviceResponse>
                    handler) {

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
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<GetMyOAuth2ClientCredentialResponse>
            getMyOAuth2ClientCredential(
                    GetMyOAuth2ClientCredentialRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    GetMyOAuth2ClientCredentialRequest,
                                    GetMyOAuth2ClientCredentialResponse>
                            handler) {

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
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<GetMySmtpCredentialResponse> getMySmtpCredential(
            GetMySmtpCredentialRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            GetMySmtpCredentialRequest, GetMySmtpCredentialResponse>
                    handler) {

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
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<GetMySupportAccountResponse> getMySupportAccount(
            GetMySupportAccountRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            GetMySupportAccountRequest, GetMySupportAccountResponse>
                    handler) {

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
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<GetMyTrustedUserAgentResponse> getMyTrustedUserAgent(
            GetMyTrustedUserAgentRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            GetMyTrustedUserAgentRequest, GetMyTrustedUserAgentResponse>
                    handler) {

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
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<GetMyUserDbCredentialResponse> getMyUserDbCredential(
            GetMyUserDbCredentialRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            GetMyUserDbCredentialRequest, GetMyUserDbCredentialResponse>
                    handler) {

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
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<GetOAuth2ClientCredentialResponse> getOAuth2ClientCredential(
            GetOAuth2ClientCredentialRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            GetOAuth2ClientCredentialRequest, GetOAuth2ClientCredentialResponse>
                    handler) {

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
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<GetPasswordPolicyResponse> getPasswordPolicy(
            GetPasswordPolicyRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            GetPasswordPolicyRequest, GetPasswordPolicyResponse>
                    handler) {

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
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<GetSmtpCredentialResponse> getSmtpCredential(
            GetSmtpCredentialRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            GetSmtpCredentialRequest, GetSmtpCredentialResponse>
                    handler) {

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
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<GetUserResponse> getUser(
            GetUserRequest request,
            final com.oracle.bmc.responses.AsyncHandler<GetUserRequest, GetUserResponse> handler) {

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
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<GetUserDbCredentialResponse> getUserDbCredential(
            GetUserDbCredentialRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            GetUserDbCredentialRequest, GetUserDbCredentialResponse>
                    handler) {

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
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ListApiKeysResponse> listApiKeys(
            ListApiKeysRequest request,
            final com.oracle.bmc.responses.AsyncHandler<ListApiKeysRequest, ListApiKeysResponse>
                    handler) {

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
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ListAuthTokensResponse> listAuthTokens(
            ListAuthTokensRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ListAuthTokensRequest, ListAuthTokensResponse>
                    handler) {

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
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ListAuthenticationFactorSettingsResponse>
            listAuthenticationFactorSettings(
                    ListAuthenticationFactorSettingsRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    ListAuthenticationFactorSettingsRequest,
                                    ListAuthenticationFactorSettingsResponse>
                            handler) {

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
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ListCustomerSecretKeysResponse> listCustomerSecretKeys(
            ListCustomerSecretKeysRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ListCustomerSecretKeysRequest, ListCustomerSecretKeysResponse>
                    handler) {

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
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ListDynamicResourceGroupsResponse> listDynamicResourceGroups(
            ListDynamicResourceGroupsRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ListDynamicResourceGroupsRequest, ListDynamicResourceGroupsResponse>
                    handler) {

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
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ListGroupsResponse> listGroups(
            ListGroupsRequest request,
            final com.oracle.bmc.responses.AsyncHandler<ListGroupsRequest, ListGroupsResponse>
                    handler) {

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
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ListIdentityProvidersResponse> listIdentityProviders(
            ListIdentityProvidersRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ListIdentityProvidersRequest, ListIdentityProvidersResponse>
                    handler) {

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
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ListKmsiSettingsResponse> listKmsiSettings(
            ListKmsiSettingsRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ListKmsiSettingsRequest, ListKmsiSettingsResponse>
                    handler) {

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
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ListMyApiKeysResponse> listMyApiKeys(
            ListMyApiKeysRequest request,
            final com.oracle.bmc.responses.AsyncHandler<ListMyApiKeysRequest, ListMyApiKeysResponse>
                    handler) {

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
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ListMyAuthTokensResponse> listMyAuthTokens(
            ListMyAuthTokensRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ListMyAuthTokensRequest, ListMyAuthTokensResponse>
                    handler) {

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
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ListMyCustomerSecretKeysResponse> listMyCustomerSecretKeys(
            ListMyCustomerSecretKeysRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ListMyCustomerSecretKeysRequest, ListMyCustomerSecretKeysResponse>
                    handler) {

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
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ListMyDevicesResponse> listMyDevices(
            ListMyDevicesRequest request,
            final com.oracle.bmc.responses.AsyncHandler<ListMyDevicesRequest, ListMyDevicesResponse>
                    handler) {

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
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ListMyGroupsResponse> listMyGroups(
            ListMyGroupsRequest request,
            final com.oracle.bmc.responses.AsyncHandler<ListMyGroupsRequest, ListMyGroupsResponse>
                    handler) {

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
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ListMyOAuth2ClientCredentialsResponse>
            listMyOAuth2ClientCredentials(
                    ListMyOAuth2ClientCredentialsRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    ListMyOAuth2ClientCredentialsRequest,
                                    ListMyOAuth2ClientCredentialsResponse>
                            handler) {

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
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ListMySmtpCredentialsResponse> listMySmtpCredentials(
            ListMySmtpCredentialsRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ListMySmtpCredentialsRequest, ListMySmtpCredentialsResponse>
                    handler) {

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
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ListMySupportAccountsResponse> listMySupportAccounts(
            ListMySupportAccountsRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ListMySupportAccountsRequest, ListMySupportAccountsResponse>
                    handler) {

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
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ListMyTrustedUserAgentsResponse> listMyTrustedUserAgents(
            ListMyTrustedUserAgentsRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ListMyTrustedUserAgentsRequest, ListMyTrustedUserAgentsResponse>
                    handler) {

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
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ListMyUserDbCredentialsResponse> listMyUserDbCredentials(
            ListMyUserDbCredentialsRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ListMyUserDbCredentialsRequest, ListMyUserDbCredentialsResponse>
                    handler) {

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
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ListOAuth2ClientCredentialsResponse>
            listOAuth2ClientCredentials(
                    ListOAuth2ClientCredentialsRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    ListOAuth2ClientCredentialsRequest,
                                    ListOAuth2ClientCredentialsResponse>
                            handler) {

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
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ListPasswordPoliciesResponse> listPasswordPolicies(
            ListPasswordPoliciesRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ListPasswordPoliciesRequest, ListPasswordPoliciesResponse>
                    handler) {

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
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ListSmtpCredentialsResponse> listSmtpCredentials(
            ListSmtpCredentialsRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ListSmtpCredentialsRequest, ListSmtpCredentialsResponse>
                    handler) {

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
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ListUserDbCredentialsResponse> listUserDbCredentials(
            ListUserDbCredentialsRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ListUserDbCredentialsRequest, ListUserDbCredentialsResponse>
                    handler) {

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
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ListUsersResponse> listUsers(
            ListUsersRequest request,
            final com.oracle.bmc.responses.AsyncHandler<ListUsersRequest, ListUsersResponse>
                    handler) {

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
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<PatchApiKeyResponse> patchApiKey(
            PatchApiKeyRequest request,
            final com.oracle.bmc.responses.AsyncHandler<PatchApiKeyRequest, PatchApiKeyResponse>
                    handler) {

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
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<PatchAuthTokenResponse> patchAuthToken(
            PatchAuthTokenRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            PatchAuthTokenRequest, PatchAuthTokenResponse>
                    handler) {

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
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<PatchCustomerSecretKeyResponse> patchCustomerSecretKey(
            PatchCustomerSecretKeyRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            PatchCustomerSecretKeyRequest, PatchCustomerSecretKeyResponse>
                    handler) {

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
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<PatchDynamicResourceGroupResponse> patchDynamicResourceGroup(
            PatchDynamicResourceGroupRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            PatchDynamicResourceGroupRequest, PatchDynamicResourceGroupResponse>
                    handler) {

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
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<PatchGroupResponse> patchGroup(
            PatchGroupRequest request,
            final com.oracle.bmc.responses.AsyncHandler<PatchGroupRequest, PatchGroupResponse>
                    handler) {

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
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<PatchIdentityProviderResponse> patchIdentityProvider(
            PatchIdentityProviderRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            PatchIdentityProviderRequest, PatchIdentityProviderResponse>
                    handler) {

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
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<PatchKmsiSettingResponse> patchKmsiSetting(
            PatchKmsiSettingRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            PatchKmsiSettingRequest, PatchKmsiSettingResponse>
                    handler) {

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
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<PatchMeResponse> patchMe(
            PatchMeRequest request,
            final com.oracle.bmc.responses.AsyncHandler<PatchMeRequest, PatchMeResponse> handler) {

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
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<PatchMyApiKeyResponse> patchMyApiKey(
            PatchMyApiKeyRequest request,
            final com.oracle.bmc.responses.AsyncHandler<PatchMyApiKeyRequest, PatchMyApiKeyResponse>
                    handler) {

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
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<PatchMyAuthTokenResponse> patchMyAuthToken(
            PatchMyAuthTokenRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            PatchMyAuthTokenRequest, PatchMyAuthTokenResponse>
                    handler) {

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
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<PatchMyCustomerSecretKeyResponse> patchMyCustomerSecretKey(
            PatchMyCustomerSecretKeyRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            PatchMyCustomerSecretKeyRequest, PatchMyCustomerSecretKeyResponse>
                    handler) {

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
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<PatchMyDeviceResponse> patchMyDevice(
            PatchMyDeviceRequest request,
            final com.oracle.bmc.responses.AsyncHandler<PatchMyDeviceRequest, PatchMyDeviceResponse>
                    handler) {

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
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<PatchMyOAuth2ClientCredentialResponse>
            patchMyOAuth2ClientCredential(
                    PatchMyOAuth2ClientCredentialRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    PatchMyOAuth2ClientCredentialRequest,
                                    PatchMyOAuth2ClientCredentialResponse>
                            handler) {

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
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<PatchMySmtpCredentialResponse> patchMySmtpCredential(
            PatchMySmtpCredentialRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            PatchMySmtpCredentialRequest, PatchMySmtpCredentialResponse>
                    handler) {

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
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<PatchOAuth2ClientCredentialResponse>
            patchOAuth2ClientCredential(
                    PatchOAuth2ClientCredentialRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    PatchOAuth2ClientCredentialRequest,
                                    PatchOAuth2ClientCredentialResponse>
                            handler) {

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
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<PatchPasswordPolicyResponse> patchPasswordPolicy(
            PatchPasswordPolicyRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            PatchPasswordPolicyRequest, PatchPasswordPolicyResponse>
                    handler) {

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
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<PatchSmtpCredentialResponse> patchSmtpCredential(
            PatchSmtpCredentialRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            PatchSmtpCredentialRequest, PatchSmtpCredentialResponse>
                    handler) {

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
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<PatchUserResponse> patchUser(
            PatchUserRequest request,
            final com.oracle.bmc.responses.AsyncHandler<PatchUserRequest, PatchUserResponse>
                    handler) {

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
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<PutAuthenticationFactorSettingResponse>
            putAuthenticationFactorSetting(
                    PutAuthenticationFactorSettingRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    PutAuthenticationFactorSettingRequest,
                                    PutAuthenticationFactorSettingResponse>
                            handler) {

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
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<PutDynamicResourceGroupResponse> putDynamicResourceGroup(
            PutDynamicResourceGroupRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            PutDynamicResourceGroupRequest, PutDynamicResourceGroupResponse>
                    handler) {

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
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<PutGroupResponse> putGroup(
            PutGroupRequest request,
            final com.oracle.bmc.responses.AsyncHandler<PutGroupRequest, PutGroupResponse>
                    handler) {

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
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<PutIdentityProviderResponse> putIdentityProvider(
            PutIdentityProviderRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            PutIdentityProviderRequest, PutIdentityProviderResponse>
                    handler) {

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
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<PutKmsiSettingResponse> putKmsiSetting(
            PutKmsiSettingRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            PutKmsiSettingRequest, PutKmsiSettingResponse>
                    handler) {

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
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<PutMeResponse> putMe(
            PutMeRequest request,
            final com.oracle.bmc.responses.AsyncHandler<PutMeRequest, PutMeResponse> handler) {

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
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<PutMePasswordChangerResponse> putMePasswordChanger(
            PutMePasswordChangerRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            PutMePasswordChangerRequest, PutMePasswordChangerResponse>
                    handler) {

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
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<PutPasswordPolicyResponse> putPasswordPolicy(
            PutPasswordPolicyRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            PutPasswordPolicyRequest, PutPasswordPolicyResponse>
                    handler) {

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
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<PutUserResponse> putUser(
            PutUserRequest request,
            final com.oracle.bmc.responses.AsyncHandler<PutUserRequest, PutUserResponse> handler) {

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
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<PutUserCapabilitiesChangerResponse>
            putUserCapabilitiesChanger(
                    PutUserCapabilitiesChangerRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    PutUserCapabilitiesChangerRequest,
                                    PutUserCapabilitiesChangerResponse>
                            handler) {

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
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<PutUserPasswordChangerResponse> putUserPasswordChanger(
            PutUserPasswordChangerRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            PutUserPasswordChangerRequest, PutUserPasswordChangerResponse>
                    handler) {

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
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<PutUserPasswordResetterResponse> putUserPasswordResetter(
            PutUserPasswordResetterRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            PutUserPasswordResetterRequest, PutUserPasswordResetterResponse>
                    handler) {

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
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<PutUserStatusChangerResponse> putUserStatusChanger(
            PutUserStatusChangerRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            PutUserStatusChangerRequest, PutUserStatusChangerResponse>
                    handler) {

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
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<SearchApiKeysResponse> searchApiKeys(
            SearchApiKeysRequest request,
            final com.oracle.bmc.responses.AsyncHandler<SearchApiKeysRequest, SearchApiKeysResponse>
                    handler) {

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
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<SearchAuthTokensResponse> searchAuthTokens(
            SearchAuthTokensRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            SearchAuthTokensRequest, SearchAuthTokensResponse>
                    handler) {

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
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<SearchAuthenticationFactorSettingsResponse>
            searchAuthenticationFactorSettings(
                    SearchAuthenticationFactorSettingsRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    SearchAuthenticationFactorSettingsRequest,
                                    SearchAuthenticationFactorSettingsResponse>
                            handler) {

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
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<SearchCustomerSecretKeysResponse> searchCustomerSecretKeys(
            SearchCustomerSecretKeysRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            SearchCustomerSecretKeysRequest, SearchCustomerSecretKeysResponse>
                    handler) {

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
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<SearchDynamicResourceGroupsResponse>
            searchDynamicResourceGroups(
                    SearchDynamicResourceGroupsRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    SearchDynamicResourceGroupsRequest,
                                    SearchDynamicResourceGroupsResponse>
                            handler) {

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
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<SearchGroupsResponse> searchGroups(
            SearchGroupsRequest request,
            final com.oracle.bmc.responses.AsyncHandler<SearchGroupsRequest, SearchGroupsResponse>
                    handler) {

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
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<SearchIdentityProvidersResponse> searchIdentityProviders(
            SearchIdentityProvidersRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            SearchIdentityProvidersRequest, SearchIdentityProvidersResponse>
                    handler) {

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
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<SearchKmsiSettingsResponse> searchKmsiSettings(
            SearchKmsiSettingsRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            SearchKmsiSettingsRequest, SearchKmsiSettingsResponse>
                    handler) {

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
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<SearchMyGroupsResponse> searchMyGroups(
            SearchMyGroupsRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            SearchMyGroupsRequest, SearchMyGroupsResponse>
                    handler) {

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
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<SearchOAuth2ClientCredentialsResponse>
            searchOAuth2ClientCredentials(
                    SearchOAuth2ClientCredentialsRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    SearchOAuth2ClientCredentialsRequest,
                                    SearchOAuth2ClientCredentialsResponse>
                            handler) {

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
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<SearchPasswordPoliciesResponse> searchPasswordPolicies(
            SearchPasswordPoliciesRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            SearchPasswordPoliciesRequest, SearchPasswordPoliciesResponse>
                    handler) {

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
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<SearchSmtpCredentialsResponse> searchSmtpCredentials(
            SearchSmtpCredentialsRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            SearchSmtpCredentialsRequest, SearchSmtpCredentialsResponse>
                    handler) {

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
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<SearchUserDbCredentialsResponse> searchUserDbCredentials(
            SearchUserDbCredentialsRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            SearchUserDbCredentialsRequest, SearchUserDbCredentialsResponse>
                    handler) {

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
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<SearchUsersResponse> searchUsers(
            SearchUsersRequest request,
            final com.oracle.bmc.responses.AsyncHandler<SearchUsersRequest, SearchUsersResponse>
                    handler) {

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
                .callAsync(handler);
    }

    /**
     * Create a new client instance.
     *
     * @param authenticationDetailsProvider The authentication details (see {@link Builder#build})
     * @deprecated Use the {@link #builder() builder} instead.
     */
    @Deprecated
    public IdentityDomainsAsyncClient(
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
    public IdentityDomainsAsyncClient(
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
    public IdentityDomainsAsyncClient(
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
    public IdentityDomainsAsyncClient(
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
    public IdentityDomainsAsyncClient(
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
    public IdentityDomainsAsyncClient(
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
    public IdentityDomainsAsyncClient(
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
