/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.identitydomains;

import com.oracle.bmc.identitydomains.requests.*;
import com.oracle.bmc.identitydomains.responses.*;

/**
 * Use the Identity Domains API to manage resources within an identity domain, for example, users,
 * dynamic resource groups, groups, and identity providers. For information about managing resources
 * within identity domains, see [Identity and Access Management (with identity
 * domains)](https://docs.oracle.com/iaas/Content/Identity/home.htm). This REST API is SCIM
 * compliant. Use the table of contents and search tool to explore the Identity Domains API. This
 * service client uses CircuitBreakerUtils.DEFAULT_CIRCUIT_BREAKER for all the operations by default
 * if no circuit breaker configuration is defined by the user.
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: v1")
public interface IdentityDomains extends AutoCloseable {

    /** Rebuilds the client from scratch. Useful to refresh certificates. */
    void refreshClient();

    /**
     * Sets the endpoint to call (ex, https://www.example.com).
     *
     * @param endpoint The endpoint of the service.
     */
    void setEndpoint(String endpoint);

    /** Gets the set endpoint for REST call (ex, https://www.example.com) */
    String getEndpoint();

    /**
     * Add a user's api key
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation will not retry by default, users
     *     can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to
     *     enable retries for it. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/identitydomains/CreateApiKeyExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use CreateApiKey API.
     */
    CreateApiKeyResponse createApiKey(CreateApiKeyRequest request);

    /**
     * Add a user's auth token
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation will not retry by default, users
     *     can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to
     *     enable retries for it. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/identitydomains/CreateAuthTokenExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use CreateAuthToken
     *     API.
     */
    CreateAuthTokenResponse createAuthToken(CreateAuthTokenRequest request);

    /**
     * Remove All Authentication Factor Channels for a User
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation will not retry by default, users
     *     can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to
     *     enable retries for it. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/identitydomains/CreateAuthenticationFactorsRemoverExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use
     *     CreateAuthenticationFactorsRemover API.
     */
    CreateAuthenticationFactorsRemoverResponse createAuthenticationFactorsRemover(
            CreateAuthenticationFactorsRemoverRequest request);

    /**
     * Add a user's customer secret key
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation will not retry by default, users
     *     can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to
     *     enable retries for it. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/identitydomains/CreateCustomerSecretKeyExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use
     *     CreateCustomerSecretKey API.
     */
    CreateCustomerSecretKeyResponse createCustomerSecretKey(CreateCustomerSecretKeyRequest request);

    /**
     * Create a DynamicResourceGroup
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation will not retry by default, users
     *     can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to
     *     enable retries for it. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/identitydomains/CreateDynamicResourceGroupExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use
     *     CreateDynamicResourceGroup API.
     */
    CreateDynamicResourceGroupResponse createDynamicResourceGroup(
            CreateDynamicResourceGroupRequest request);

    /**
     * Create a Group
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation will not retry by default, users
     *     can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to
     *     enable retries for it. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/identitydomains/CreateGroupExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use CreateGroup API.
     */
    CreateGroupResponse createGroup(CreateGroupRequest request);

    /**
     * Create an Identity Provider
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation will not retry by default, users
     *     can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to
     *     enable retries for it. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/identitydomains/CreateIdentityProviderExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use
     *     CreateIdentityProvider API.
     */
    CreateIdentityProviderResponse createIdentityProvider(CreateIdentityProviderRequest request);

    /**
     * Self Register
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation will not retry by default, users
     *     can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to
     *     enable retries for it. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/identitydomains/CreateMeExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use CreateMe API.
     */
    CreateMeResponse createMe(CreateMeRequest request);

    /**
     * Add a user's api key
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation will not retry by default, users
     *     can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to
     *     enable retries for it. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/identitydomains/CreateMyApiKeyExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use CreateMyApiKey API.
     */
    CreateMyApiKeyResponse createMyApiKey(CreateMyApiKeyRequest request);

    /**
     * Add user's auth token
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation will not retry by default, users
     *     can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to
     *     enable retries for it. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/identitydomains/CreateMyAuthTokenExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use CreateMyAuthToken
     *     API.
     */
    CreateMyAuthTokenResponse createMyAuthToken(CreateMyAuthTokenRequest request);

    /**
     * Initiate Self Service Enrollment using the Requested MFA Factor
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation will not retry by default, users
     *     can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to
     *     enable retries for it. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/identitydomains/CreateMyAuthenticationFactorInitiatorExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use
     *     CreateMyAuthenticationFactorInitiator API.
     */
    CreateMyAuthenticationFactorInitiatorResponse createMyAuthenticationFactorInitiator(
            CreateMyAuthenticationFactorInitiatorRequest request);

    /**
     * Validate Self Service Enrollment using the Requested MFA Factor
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation will not retry by default, users
     *     can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to
     *     enable retries for it. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/identitydomains/CreateMyAuthenticationFactorValidatorExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use
     *     CreateMyAuthenticationFactorValidator API.
     */
    CreateMyAuthenticationFactorValidatorResponse createMyAuthenticationFactorValidator(
            CreateMyAuthenticationFactorValidatorRequest request);

    /**
     * Remove All Authentication Factor Channels for a User
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation will not retry by default, users
     *     can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to
     *     enable retries for it. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/identitydomains/CreateMyAuthenticationFactorsRemoverExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use
     *     CreateMyAuthenticationFactorsRemover API.
     */
    CreateMyAuthenticationFactorsRemoverResponse createMyAuthenticationFactorsRemover(
            CreateMyAuthenticationFactorsRemoverRequest request);

    /**
     * Add a user's customer secret key
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation will not retry by default, users
     *     can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to
     *     enable retries for it. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/identitydomains/CreateMyCustomerSecretKeyExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use
     *     CreateMyCustomerSecretKey API.
     */
    CreateMyCustomerSecretKeyResponse createMyCustomerSecretKey(
            CreateMyCustomerSecretKeyRequest request);

    /**
     * Add a user's oauth2 client credential
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation will not retry by default, users
     *     can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to
     *     enable retries for it. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/identitydomains/CreateMyOAuth2ClientCredentialExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use
     *     CreateMyOAuth2ClientCredential API.
     */
    CreateMyOAuth2ClientCredentialResponse createMyOAuth2ClientCredential(
            CreateMyOAuth2ClientCredentialRequest request);

    /**
     * Add a user's smtp credenials
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation will not retry by default, users
     *     can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to
     *     enable retries for it. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/identitydomains/CreateMySmtpCredentialExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use
     *     CreateMySmtpCredential API.
     */
    CreateMySmtpCredentialResponse createMySmtpCredential(CreateMySmtpCredentialRequest request);

    /**
     * Create a Support Account
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation will not retry by default, users
     *     can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to
     *     enable retries for it. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/identitydomains/CreateMySupportAccountExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use
     *     CreateMySupportAccount API.
     */
    CreateMySupportAccountResponse createMySupportAccount(CreateMySupportAccountRequest request);

    /**
     * Set a User's DbCredential
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation will not retry by default, users
     *     can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to
     *     enable retries for it. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/identitydomains/CreateMyUserDbCredentialExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use
     *     CreateMyUserDbCredential API.
     */
    CreateMyUserDbCredentialResponse createMyUserDbCredential(
            CreateMyUserDbCredentialRequest request);

    /**
     * Add a user's oauth2 client credential
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation will not retry by default, users
     *     can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to
     *     enable retries for it. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/identitydomains/CreateOAuth2ClientCredentialExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use
     *     CreateOAuth2ClientCredential API.
     */
    CreateOAuth2ClientCredentialResponse createOAuth2ClientCredential(
            CreateOAuth2ClientCredentialRequest request);

    /**
     * Create a Password Policy
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation will not retry by default, users
     *     can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to
     *     enable retries for it. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/identitydomains/CreatePasswordPolicyExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use
     *     CreatePasswordPolicy API.
     */
    CreatePasswordPolicyResponse createPasswordPolicy(CreatePasswordPolicyRequest request);

    /**
     * Add a user's smtp credenials
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation will not retry by default, users
     *     can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to
     *     enable retries for it. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/identitydomains/CreateSmtpCredentialExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use
     *     CreateSmtpCredential API.
     */
    CreateSmtpCredentialResponse createSmtpCredential(CreateSmtpCredentialRequest request);

    /**
     * Create a User
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation will not retry by default, users
     *     can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to
     *     enable retries for it. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/identitydomains/CreateUserExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use CreateUser API.
     */
    CreateUserResponse createUser(CreateUserRequest request);

    /**
     * Set a User's DbCredential
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation will not retry by default, users
     *     can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to
     *     enable retries for it. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/identitydomains/CreateUserDbCredentialExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use
     *     CreateUserDbCredential API.
     */
    CreateUserDbCredentialResponse createUserDbCredential(CreateUserDbCredentialRequest request);

    /**
     * Delete user's api key
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation will not retry by default, users
     *     can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to
     *     enable retries for it. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/identitydomains/DeleteApiKeyExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use DeleteApiKey API.
     */
    DeleteApiKeyResponse deleteApiKey(DeleteApiKeyRequest request);

    /**
     * Delete user's auth token
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation will not retry by default, users
     *     can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to
     *     enable retries for it. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/identitydomains/DeleteAuthTokenExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use DeleteAuthToken
     *     API.
     */
    DeleteAuthTokenResponse deleteAuthToken(DeleteAuthTokenRequest request);

    /**
     * Delete user's customer secret key
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation will not retry by default, users
     *     can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to
     *     enable retries for it. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/identitydomains/DeleteCustomerSecretKeyExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use
     *     DeleteCustomerSecretKey API.
     */
    DeleteCustomerSecretKeyResponse deleteCustomerSecretKey(DeleteCustomerSecretKeyRequest request);

    /**
     * Delete a DynamicResourceGroup
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation will not retry by default, users
     *     can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to
     *     enable retries for it. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/identitydomains/DeleteDynamicResourceGroupExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use
     *     DeleteDynamicResourceGroup API.
     */
    DeleteDynamicResourceGroupResponse deleteDynamicResourceGroup(
            DeleteDynamicResourceGroupRequest request);

    /**
     * Delete a Group
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation will not retry by default, users
     *     can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to
     *     enable retries for it. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/identitydomains/DeleteGroupExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use DeleteGroup API.
     */
    DeleteGroupResponse deleteGroup(DeleteGroupRequest request);

    /**
     * Delete an Identity Provider
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation will not retry by default, users
     *     can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to
     *     enable retries for it. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/identitydomains/DeleteIdentityProviderExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use
     *     DeleteIdentityProvider API.
     */
    DeleteIdentityProviderResponse deleteIdentityProvider(DeleteIdentityProviderRequest request);

    /**
     * Delete user's api key
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation will not retry by default, users
     *     can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to
     *     enable retries for it. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/identitydomains/DeleteMyApiKeyExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use DeleteMyApiKey API.
     */
    DeleteMyApiKeyResponse deleteMyApiKey(DeleteMyApiKeyRequest request);

    /**
     * Delete user's auth token
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation will not retry by default, users
     *     can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to
     *     enable retries for it. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/identitydomains/DeleteMyAuthTokenExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use DeleteMyAuthToken
     *     API.
     */
    DeleteMyAuthTokenResponse deleteMyAuthToken(DeleteMyAuthTokenRequest request);

    /**
     * Delete user's customer secret key
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation will not retry by default, users
     *     can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to
     *     enable retries for it. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/identitydomains/DeleteMyCustomerSecretKeyExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use
     *     DeleteMyCustomerSecretKey API.
     */
    DeleteMyCustomerSecretKeyResponse deleteMyCustomerSecretKey(
            DeleteMyCustomerSecretKeyRequest request);

    /**
     * Delete a Device
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation will not retry by default, users
     *     can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to
     *     enable retries for it. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/identitydomains/DeleteMyDeviceExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use DeleteMyDevice API.
     */
    DeleteMyDeviceResponse deleteMyDevice(DeleteMyDeviceRequest request);

    /**
     * Delete user's oauth2 client credential
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation will not retry by default, users
     *     can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to
     *     enable retries for it. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/identitydomains/DeleteMyOAuth2ClientCredentialExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use
     *     DeleteMyOAuth2ClientCredential API.
     */
    DeleteMyOAuth2ClientCredentialResponse deleteMyOAuth2ClientCredential(
            DeleteMyOAuth2ClientCredentialRequest request);

    /**
     * Delete user's smtp credenials
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation will not retry by default, users
     *     can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to
     *     enable retries for it. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/identitydomains/DeleteMySmtpCredentialExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use
     *     DeleteMySmtpCredential API.
     */
    DeleteMySmtpCredentialResponse deleteMySmtpCredential(DeleteMySmtpCredentialRequest request);

    /**
     * Delete a Support Account
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation will not retry by default, users
     *     can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to
     *     enable retries for it. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/identitydomains/DeleteMySupportAccountExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use
     *     DeleteMySupportAccount API.
     */
    DeleteMySupportAccountResponse deleteMySupportAccount(DeleteMySupportAccountRequest request);

    /**
     * Delete a Trusted User Agent
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation will not retry by default, users
     *     can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to
     *     enable retries for it. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/identitydomains/DeleteMyTrustedUserAgentExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use
     *     DeleteMyTrustedUserAgent API.
     */
    DeleteMyTrustedUserAgentResponse deleteMyTrustedUserAgent(
            DeleteMyTrustedUserAgentRequest request);

    /**
     * Remove a User's DbCredential
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation will not retry by default, users
     *     can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to
     *     enable retries for it. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/identitydomains/DeleteMyUserDbCredentialExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use
     *     DeleteMyUserDbCredential API.
     */
    DeleteMyUserDbCredentialResponse deleteMyUserDbCredential(
            DeleteMyUserDbCredentialRequest request);

    /**
     * Delete user's oauth2 client credential
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation will not retry by default, users
     *     can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to
     *     enable retries for it. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/identitydomains/DeleteOAuth2ClientCredentialExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use
     *     DeleteOAuth2ClientCredential API.
     */
    DeleteOAuth2ClientCredentialResponse deleteOAuth2ClientCredential(
            DeleteOAuth2ClientCredentialRequest request);

    /**
     * Delete a Password Policy
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation will not retry by default, users
     *     can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to
     *     enable retries for it. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/identitydomains/DeletePasswordPolicyExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use
     *     DeletePasswordPolicy API.
     */
    DeletePasswordPolicyResponse deletePasswordPolicy(DeletePasswordPolicyRequest request);

    /**
     * Delete user's smtp credenials
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation will not retry by default, users
     *     can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to
     *     enable retries for it. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/identitydomains/DeleteSmtpCredentialExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use
     *     DeleteSmtpCredential API.
     */
    DeleteSmtpCredentialResponse deleteSmtpCredential(DeleteSmtpCredentialRequest request);

    /**
     * Delete a User
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation will not retry by default, users
     *     can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to
     *     enable retries for it. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/identitydomains/DeleteUserExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use DeleteUser API.
     */
    DeleteUserResponse deleteUser(DeleteUserRequest request);

    /**
     * Remove a User's DbCredential
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation will not retry by default, users
     *     can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to
     *     enable retries for it. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/identitydomains/DeleteUserDbCredentialExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use
     *     DeleteUserDbCredential API.
     */
    DeleteUserDbCredentialResponse deleteUserDbCredential(DeleteUserDbCredentialRequest request);

    /**
     * Get user's api key
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation will not retry by default, users
     *     can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to
     *     enable retries for it. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/identitydomains/GetApiKeyExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use GetApiKey API.
     */
    GetApiKeyResponse getApiKey(GetApiKeyRequest request);

    /**
     * Get user's auth token
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation will not retry by default, users
     *     can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to
     *     enable retries for it. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/identitydomains/GetAuthTokenExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use GetAuthToken API.
     */
    GetAuthTokenResponse getAuthToken(GetAuthTokenRequest request);

    /**
     * Get Authentication Factor Settings
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation will not retry by default, users
     *     can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to
     *     enable retries for it. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/identitydomains/GetAuthenticationFactorSettingExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use
     *     GetAuthenticationFactorSetting API.
     */
    GetAuthenticationFactorSettingResponse getAuthenticationFactorSetting(
            GetAuthenticationFactorSettingRequest request);

    /**
     * Get user's customer secret key
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation will not retry by default, users
     *     can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to
     *     enable retries for it. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/identitydomains/GetCustomerSecretKeyExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use
     *     GetCustomerSecretKey API.
     */
    GetCustomerSecretKeyResponse getCustomerSecretKey(GetCustomerSecretKeyRequest request);

    /**
     * Get a DynamicResourceGroup
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation will not retry by default, users
     *     can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to
     *     enable retries for it. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/identitydomains/GetDynamicResourceGroupExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use
     *     GetDynamicResourceGroup API.
     */
    GetDynamicResourceGroupResponse getDynamicResourceGroup(GetDynamicResourceGroupRequest request);

    /**
     * Get a Group - The Group search and get operations on users/members will throw an exception if
     * it has more than 10K members, to avoid the exception use the pagination filter to get or
     * search group members
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation will not retry by default, users
     *     can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to
     *     enable retries for it. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/identitydomains/GetGroupExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use GetGroup API.
     */
    GetGroupResponse getGroup(GetGroupRequest request);

    /**
     * Get an Identity Provider
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation will not retry by default, users
     *     can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to
     *     enable retries for it. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/identitydomains/GetIdentityProviderExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use GetIdentityProvider
     *     API.
     */
    GetIdentityProviderResponse getIdentityProvider(GetIdentityProviderRequest request);

    /**
     * Get KmsiSettings
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation will not retry by default, users
     *     can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to
     *     enable retries for it. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/identitydomains/GetKmsiSettingExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use GetKmsiSetting API.
     */
    GetKmsiSettingResponse getKmsiSetting(GetKmsiSettingRequest request);

    /**
     * Get User Info
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation will not retry by default, users
     *     can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to
     *     enable retries for it. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/identitydomains/GetMeExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use GetMe API.
     */
    GetMeResponse getMe(GetMeRequest request);

    /**
     * Get user's api key
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation will not retry by default, users
     *     can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to
     *     enable retries for it. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/identitydomains/GetMyApiKeyExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use GetMyApiKey API.
     */
    GetMyApiKeyResponse getMyApiKey(GetMyApiKeyRequest request);

    /**
     * Get user's auth token
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation will not retry by default, users
     *     can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to
     *     enable retries for it. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/identitydomains/GetMyAuthTokenExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use GetMyAuthToken API.
     */
    GetMyAuthTokenResponse getMyAuthToken(GetMyAuthTokenRequest request);

    /**
     * Get user's customer secret key
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation will not retry by default, users
     *     can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to
     *     enable retries for it. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/identitydomains/GetMyCustomerSecretKeyExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use
     *     GetMyCustomerSecretKey API.
     */
    GetMyCustomerSecretKeyResponse getMyCustomerSecretKey(GetMyCustomerSecretKeyRequest request);

    /**
     * Get a Device
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation will not retry by default, users
     *     can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to
     *     enable retries for it. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/identitydomains/GetMyDeviceExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use GetMyDevice API.
     */
    GetMyDeviceResponse getMyDevice(GetMyDeviceRequest request);

    /**
     * Get user's oauth2 client credential
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation will not retry by default, users
     *     can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to
     *     enable retries for it. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/identitydomains/GetMyOAuth2ClientCredentialExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use
     *     GetMyOAuth2ClientCredential API.
     */
    GetMyOAuth2ClientCredentialResponse getMyOAuth2ClientCredential(
            GetMyOAuth2ClientCredentialRequest request);

    /**
     * Get user's smtp credentials
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation will not retry by default, users
     *     can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to
     *     enable retries for it. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/identitydomains/GetMySmtpCredentialExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use GetMySmtpCredential
     *     API.
     */
    GetMySmtpCredentialResponse getMySmtpCredential(GetMySmtpCredentialRequest request);

    /**
     * Get a Support Account
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation will not retry by default, users
     *     can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to
     *     enable retries for it. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/identitydomains/GetMySupportAccountExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use GetMySupportAccount
     *     API.
     */
    GetMySupportAccountResponse getMySupportAccount(GetMySupportAccountRequest request);

    /**
     * Get a Trusted User Agent
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation will not retry by default, users
     *     can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to
     *     enable retries for it. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/identitydomains/GetMyTrustedUserAgentExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use
     *     GetMyTrustedUserAgent API.
     */
    GetMyTrustedUserAgentResponse getMyTrustedUserAgent(GetMyTrustedUserAgentRequest request);

    /**
     * Get a User's DbCredentials
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation will not retry by default, users
     *     can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to
     *     enable retries for it. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/identitydomains/GetMyUserDbCredentialExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use
     *     GetMyUserDbCredential API.
     */
    GetMyUserDbCredentialResponse getMyUserDbCredential(GetMyUserDbCredentialRequest request);

    /**
     * Get user's oauth2 client credential
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation will not retry by default, users
     *     can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to
     *     enable retries for it. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/identitydomains/GetOAuth2ClientCredentialExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use
     *     GetOAuth2ClientCredential API.
     */
    GetOAuth2ClientCredentialResponse getOAuth2ClientCredential(
            GetOAuth2ClientCredentialRequest request);

    /**
     * Get a Password Policy
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation will not retry by default, users
     *     can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to
     *     enable retries for it. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/identitydomains/GetPasswordPolicyExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use GetPasswordPolicy
     *     API.
     */
    GetPasswordPolicyResponse getPasswordPolicy(GetPasswordPolicyRequest request);

    /**
     * Get user's smtp credentials
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation will not retry by default, users
     *     can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to
     *     enable retries for it. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/identitydomains/GetSmtpCredentialExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use GetSmtpCredential
     *     API.
     */
    GetSmtpCredentialResponse getSmtpCredential(GetSmtpCredentialRequest request);

    /**
     * Get a User
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation will not retry by default, users
     *     can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to
     *     enable retries for it. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/identitydomains/GetUserExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use GetUser API.
     */
    GetUserResponse getUser(GetUserRequest request);

    /**
     * Get a User's DbCredentials
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation will not retry by default, users
     *     can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to
     *     enable retries for it. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/identitydomains/GetUserDbCredentialExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use GetUserDbCredential
     *     API.
     */
    GetUserDbCredentialResponse getUserDbCredential(GetUserDbCredentialRequest request);

    /**
     * Search Api Key
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation will not retry by default, users
     *     can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to
     *     enable retries for it. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/identitydomains/ListApiKeysExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use ListApiKeys API.
     */
    ListApiKeysResponse listApiKeys(ListApiKeysRequest request);

    /**
     * Search AuthTokens
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation will not retry by default, users
     *     can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to
     *     enable retries for it. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/identitydomains/ListAuthTokensExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use ListAuthTokens API.
     */
    ListAuthTokensResponse listAuthTokens(ListAuthTokensRequest request);

    /**
     * Search Authentication Factor Settings
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation will not retry by default, users
     *     can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to
     *     enable retries for it. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/identitydomains/ListAuthenticationFactorSettingsExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use
     *     ListAuthenticationFactorSettings API.
     */
    ListAuthenticationFactorSettingsResponse listAuthenticationFactorSettings(
            ListAuthenticationFactorSettingsRequest request);

    /**
     * Search user's customer secret key
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation will not retry by default, users
     *     can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to
     *     enable retries for it. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/identitydomains/ListCustomerSecretKeysExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use
     *     ListCustomerSecretKeys API.
     */
    ListCustomerSecretKeysResponse listCustomerSecretKeys(ListCustomerSecretKeysRequest request);

    /**
     * Search DynamicResourceGroups
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation will not retry by default, users
     *     can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to
     *     enable retries for it. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/identitydomains/ListDynamicResourceGroupsExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use
     *     ListDynamicResourceGroups API.
     */
    ListDynamicResourceGroupsResponse listDynamicResourceGroups(
            ListDynamicResourceGroupsRequest request);

    /**
     * Search Groups.The Group search and get operations on users/members will throw an exception if
     * it has more than 10K members, to avoid the exception use the pagination filter to get or
     * search group members
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation will not retry by default, users
     *     can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to
     *     enable retries for it. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/identitydomains/ListGroupsExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use ListGroups API.
     */
    ListGroupsResponse listGroups(ListGroupsRequest request);

    /**
     * Search Identity Providers
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation will not retry by default, users
     *     can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to
     *     enable retries for it. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/identitydomains/ListIdentityProvidersExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use
     *     ListIdentityProviders API.
     */
    ListIdentityProvidersResponse listIdentityProviders(ListIdentityProvidersRequest request);

    /**
     * Search KmsiSettings
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation will not retry by default, users
     *     can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to
     *     enable retries for it. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/identitydomains/ListKmsiSettingsExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use ListKmsiSettings
     *     API.
     */
    ListKmsiSettingsResponse listKmsiSettings(ListKmsiSettingsRequest request);

    /**
     * Search Api Key
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation will not retry by default, users
     *     can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to
     *     enable retries for it. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/identitydomains/ListMyApiKeysExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use ListMyApiKeys API.
     */
    ListMyApiKeysResponse listMyApiKeys(ListMyApiKeysRequest request);

    /**
     * Search AuthTokens
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation will not retry by default, users
     *     can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to
     *     enable retries for it. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/identitydomains/ListMyAuthTokensExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use ListMyAuthTokens
     *     API.
     */
    ListMyAuthTokensResponse listMyAuthTokens(ListMyAuthTokensRequest request);

    /**
     * Search user's customer secret key
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation will not retry by default, users
     *     can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to
     *     enable retries for it. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/identitydomains/ListMyCustomerSecretKeysExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use
     *     ListMyCustomerSecretKeys API.
     */
    ListMyCustomerSecretKeysResponse listMyCustomerSecretKeys(
            ListMyCustomerSecretKeysRequest request);

    /**
     * Search Devices
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation will not retry by default, users
     *     can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to
     *     enable retries for it. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/identitydomains/ListMyDevicesExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use ListMyDevices API.
     */
    ListMyDevicesResponse listMyDevices(ListMyDevicesRequest request);

    /**
     * Search My Groups
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation will not retry by default, users
     *     can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to
     *     enable retries for it. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/identitydomains/ListMyGroupsExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use ListMyGroups API.
     */
    ListMyGroupsResponse listMyGroups(ListMyGroupsRequest request);

    /**
     * Search oauth2 client credentials
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation will not retry by default, users
     *     can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to
     *     enable retries for it. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/identitydomains/ListMyOAuth2ClientCredentialsExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use
     *     ListMyOAuth2ClientCredentials API.
     */
    ListMyOAuth2ClientCredentialsResponse listMyOAuth2ClientCredentials(
            ListMyOAuth2ClientCredentialsRequest request);

    /**
     * Search smtp credentials
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation will not retry by default, users
     *     can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to
     *     enable retries for it. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/identitydomains/ListMySmtpCredentialsExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use
     *     ListMySmtpCredentials API.
     */
    ListMySmtpCredentialsResponse listMySmtpCredentials(ListMySmtpCredentialsRequest request);

    /**
     * Search Support Accounts
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation will not retry by default, users
     *     can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to
     *     enable retries for it. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/identitydomains/ListMySupportAccountsExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use
     *     ListMySupportAccounts API.
     */
    ListMySupportAccountsResponse listMySupportAccounts(ListMySupportAccountsRequest request);

    /**
     * Search Trusted User Agents
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation will not retry by default, users
     *     can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to
     *     enable retries for it. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/identitydomains/ListMyTrustedUserAgentsExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use
     *     ListMyTrustedUserAgents API.
     */
    ListMyTrustedUserAgentsResponse listMyTrustedUserAgents(ListMyTrustedUserAgentsRequest request);

    /**
     * Search a User's DBCredentials
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation will not retry by default, users
     *     can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to
     *     enable retries for it. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/identitydomains/ListMyUserDbCredentialsExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use
     *     ListMyUserDbCredentials API.
     */
    ListMyUserDbCredentialsResponse listMyUserDbCredentials(ListMyUserDbCredentialsRequest request);

    /**
     * Search oauth2 client credentials
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation will not retry by default, users
     *     can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to
     *     enable retries for it. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/identitydomains/ListOAuth2ClientCredentialsExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use
     *     ListOAuth2ClientCredentials API.
     */
    ListOAuth2ClientCredentialsResponse listOAuth2ClientCredentials(
            ListOAuth2ClientCredentialsRequest request);

    /**
     * Search Password Policies
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation will not retry by default, users
     *     can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to
     *     enable retries for it. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/identitydomains/ListPasswordPoliciesExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use
     *     ListPasswordPolicies API.
     */
    ListPasswordPoliciesResponse listPasswordPolicies(ListPasswordPoliciesRequest request);

    /**
     * Search smtp credentials
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation will not retry by default, users
     *     can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to
     *     enable retries for it. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/identitydomains/ListSmtpCredentialsExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use ListSmtpCredentials
     *     API.
     */
    ListSmtpCredentialsResponse listSmtpCredentials(ListSmtpCredentialsRequest request);

    /**
     * Search a User's DBCredentials
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation will not retry by default, users
     *     can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to
     *     enable retries for it. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/identitydomains/ListUserDbCredentialsExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use
     *     ListUserDbCredentials API.
     */
    ListUserDbCredentialsResponse listUserDbCredentials(ListUserDbCredentialsRequest request);

    /**
     * Search Users
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation will not retry by default, users
     *     can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to
     *     enable retries for it. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/identitydomains/ListUsersExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use ListUsers API.
     */
    ListUsersResponse listUsers(ListUsersRequest request);

    /**
     * Update user's api key
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation will not retry by default, users
     *     can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to
     *     enable retries for it. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/identitydomains/PatchApiKeyExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use PatchApiKey API.
     */
    PatchApiKeyResponse patchApiKey(PatchApiKeyRequest request);

    /**
     * Update user's AuthToken
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation will not retry by default, users
     *     can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to
     *     enable retries for it. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/identitydomains/PatchAuthTokenExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use PatchAuthToken API.
     */
    PatchAuthTokenResponse patchAuthToken(PatchAuthTokenRequest request);

    /**
     * Update user's customer secret key
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation will not retry by default, users
     *     can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to
     *     enable retries for it. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/identitydomains/PatchCustomerSecretKeyExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use
     *     PatchCustomerSecretKey API.
     */
    PatchCustomerSecretKeyResponse patchCustomerSecretKey(PatchCustomerSecretKeyRequest request);

    /**
     * Update a DynamicResourceGroup
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation will not retry by default, users
     *     can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to
     *     enable retries for it. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/identitydomains/PatchDynamicResourceGroupExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use
     *     PatchDynamicResourceGroup API.
     */
    PatchDynamicResourceGroupResponse patchDynamicResourceGroup(
            PatchDynamicResourceGroupRequest request);

    /**
     * Update a Group
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation will not retry by default, users
     *     can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to
     *     enable retries for it. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/identitydomains/PatchGroupExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use PatchGroup API.
     */
    PatchGroupResponse patchGroup(PatchGroupRequest request);

    /**
     * Update an Identity Provider
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation will not retry by default, users
     *     can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to
     *     enable retries for it. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/identitydomains/PatchIdentityProviderExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use
     *     PatchIdentityProvider API.
     */
    PatchIdentityProviderResponse patchIdentityProvider(PatchIdentityProviderRequest request);

    /**
     * Update a Setting
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation will not retry by default, users
     *     can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to
     *     enable retries for it. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/identitydomains/PatchKmsiSettingExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use PatchKmsiSetting
     *     API.
     */
    PatchKmsiSettingResponse patchKmsiSetting(PatchKmsiSettingRequest request);

    /**
     * Update User Info
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation will not retry by default, users
     *     can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to
     *     enable retries for it. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/identitydomains/PatchMeExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use PatchMe API.
     */
    PatchMeResponse patchMe(PatchMeRequest request);

    /**
     * Update user's api key
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation will not retry by default, users
     *     can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to
     *     enable retries for it. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/identitydomains/PatchMyApiKeyExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use PatchMyApiKey API.
     */
    PatchMyApiKeyResponse patchMyApiKey(PatchMyApiKeyRequest request);

    /**
     * Update user's AuthToken
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation will not retry by default, users
     *     can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to
     *     enable retries for it. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/identitydomains/PatchMyAuthTokenExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use PatchMyAuthToken
     *     API.
     */
    PatchMyAuthTokenResponse patchMyAuthToken(PatchMyAuthTokenRequest request);

    /**
     * Update user's customer secret key
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation will not retry by default, users
     *     can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to
     *     enable retries for it. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/identitydomains/PatchMyCustomerSecretKeyExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use
     *     PatchMyCustomerSecretKey API.
     */
    PatchMyCustomerSecretKeyResponse patchMyCustomerSecretKey(
            PatchMyCustomerSecretKeyRequest request);

    /**
     * Update a Device
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation will not retry by default, users
     *     can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to
     *     enable retries for it. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/identitydomains/PatchMyDeviceExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use PatchMyDevice API.
     */
    PatchMyDeviceResponse patchMyDevice(PatchMyDeviceRequest request);

    /**
     * Update user's oauth2 client credential
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation will not retry by default, users
     *     can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to
     *     enable retries for it. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/identitydomains/PatchMyOAuth2ClientCredentialExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use
     *     PatchMyOAuth2ClientCredential API.
     */
    PatchMyOAuth2ClientCredentialResponse patchMyOAuth2ClientCredential(
            PatchMyOAuth2ClientCredentialRequest request);

    /**
     * Update user's smtp credentials
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation will not retry by default, users
     *     can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to
     *     enable retries for it. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/identitydomains/PatchMySmtpCredentialExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use
     *     PatchMySmtpCredential API.
     */
    PatchMySmtpCredentialResponse patchMySmtpCredential(PatchMySmtpCredentialRequest request);

    /**
     * Update user's oauth2 client credential
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation will not retry by default, users
     *     can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to
     *     enable retries for it. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/identitydomains/PatchOAuth2ClientCredentialExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use
     *     PatchOAuth2ClientCredential API.
     */
    PatchOAuth2ClientCredentialResponse patchOAuth2ClientCredential(
            PatchOAuth2ClientCredentialRequest request);

    /**
     * Update a Password Policy
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation will not retry by default, users
     *     can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to
     *     enable retries for it. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/identitydomains/PatchPasswordPolicyExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use PatchPasswordPolicy
     *     API.
     */
    PatchPasswordPolicyResponse patchPasswordPolicy(PatchPasswordPolicyRequest request);

    /**
     * Update user's smtp credentials
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation will not retry by default, users
     *     can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to
     *     enable retries for it. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/identitydomains/PatchSmtpCredentialExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use PatchSmtpCredential
     *     API.
     */
    PatchSmtpCredentialResponse patchSmtpCredential(PatchSmtpCredentialRequest request);

    /**
     * Update a User
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation will not retry by default, users
     *     can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to
     *     enable retries for it. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/identitydomains/PatchUserExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use PatchUser API.
     */
    PatchUserResponse patchUser(PatchUserRequest request);

    /**
     * Replace Authentication Factor Settings
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation will not retry by default, users
     *     can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to
     *     enable retries for it. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/identitydomains/PutAuthenticationFactorSettingExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use
     *     PutAuthenticationFactorSetting API.
     */
    PutAuthenticationFactorSettingResponse putAuthenticationFactorSetting(
            PutAuthenticationFactorSettingRequest request);

    /**
     * Replace a DynamicResourceGroup
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation will not retry by default, users
     *     can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to
     *     enable retries for it. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/identitydomains/PutDynamicResourceGroupExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use
     *     PutDynamicResourceGroup API.
     */
    PutDynamicResourceGroupResponse putDynamicResourceGroup(PutDynamicResourceGroupRequest request);

    /**
     * Replace a Group
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation will not retry by default, users
     *     can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to
     *     enable retries for it. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/identitydomains/PutGroupExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use PutGroup API.
     */
    PutGroupResponse putGroup(PutGroupRequest request);

    /**
     * Replace an Identity Provider
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation will not retry by default, users
     *     can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to
     *     enable retries for it. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/identitydomains/PutIdentityProviderExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use PutIdentityProvider
     *     API.
     */
    PutIdentityProviderResponse putIdentityProvider(PutIdentityProviderRequest request);

    /**
     * Replace KmsiSettings
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation will not retry by default, users
     *     can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to
     *     enable retries for it. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/identitydomains/PutKmsiSettingExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use PutKmsiSetting API.
     */
    PutKmsiSettingResponse putKmsiSetting(PutKmsiSettingRequest request);

    /**
     * Replace User Info
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation will not retry by default, users
     *     can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to
     *     enable retries for it. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/identitydomains/PutMeExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use PutMe API.
     */
    PutMeResponse putMe(PutMeRequest request);

    /**
     * Self-Service Password Update
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation will not retry by default, users
     *     can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to
     *     enable retries for it. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/identitydomains/PutMePasswordChangerExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use
     *     PutMePasswordChanger API.
     */
    PutMePasswordChangerResponse putMePasswordChanger(PutMePasswordChangerRequest request);

    /**
     * Replace a Password Policy
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation will not retry by default, users
     *     can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to
     *     enable retries for it. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/identitydomains/PutPasswordPolicyExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use PutPasswordPolicy
     *     API.
     */
    PutPasswordPolicyResponse putPasswordPolicy(PutPasswordPolicyRequest request);

    /**
     * Replace a User
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation will not retry by default, users
     *     can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to
     *     enable retries for it. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/identitydomains/PutUserExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use PutUser API.
     */
    PutUserResponse putUser(PutUserRequest request);

    /**
     * Change user capabilities
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation will not retry by default, users
     *     can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to
     *     enable retries for it. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/identitydomains/PutUserCapabilitiesChangerExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use
     *     PutUserCapabilitiesChanger API.
     */
    PutUserCapabilitiesChangerResponse putUserCapabilitiesChanger(
            PutUserCapabilitiesChangerRequest request);

    /**
     * Change a User Password (Known Value)
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation will not retry by default, users
     *     can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to
     *     enable retries for it. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/identitydomains/PutUserPasswordChangerExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use
     *     PutUserPasswordChanger API.
     */
    PutUserPasswordChangerResponse putUserPasswordChanger(PutUserPasswordChangerRequest request);

    /**
     * Reset a User Password (Random Value)
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation will not retry by default, users
     *     can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to
     *     enable retries for it. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/identitydomains/PutUserPasswordResetterExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use
     *     PutUserPasswordResetter API.
     */
    PutUserPasswordResetterResponse putUserPasswordResetter(PutUserPasswordResetterRequest request);

    /**
     * Change User Status
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation will not retry by default, users
     *     can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to
     *     enable retries for it. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/identitydomains/PutUserStatusChangerExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use
     *     PutUserStatusChanger API.
     */
    PutUserStatusChangerResponse putUserStatusChanger(PutUserStatusChangerRequest request);

    /**
     * Search ApiKeys Using POST
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation will not retry by default, users
     *     can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to
     *     enable retries for it. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/identitydomains/SearchApiKeysExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use SearchApiKeys API.
     */
    SearchApiKeysResponse searchApiKeys(SearchApiKeysRequest request);

    /**
     * Search AuthTokens Using POST
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation will not retry by default, users
     *     can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to
     *     enable retries for it. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/identitydomains/SearchAuthTokensExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use SearchAuthTokens
     *     API.
     */
    SearchAuthTokensResponse searchAuthTokens(SearchAuthTokensRequest request);

    /**
     * Search Authentication Factor Settings Using POST
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation will not retry by default, users
     *     can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to
     *     enable retries for it. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/identitydomains/SearchAuthenticationFactorSettingsExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use
     *     SearchAuthenticationFactorSettings API.
     */
    SearchAuthenticationFactorSettingsResponse searchAuthenticationFactorSettings(
            SearchAuthenticationFactorSettingsRequest request);

    /**
     * Search CustomerSecretKeys Using POST
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation will not retry by default, users
     *     can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to
     *     enable retries for it. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/identitydomains/SearchCustomerSecretKeysExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use
     *     SearchCustomerSecretKeys API.
     */
    SearchCustomerSecretKeysResponse searchCustomerSecretKeys(
            SearchCustomerSecretKeysRequest request);

    /**
     * Search DynamicResourceGroups Using POST
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation will not retry by default, users
     *     can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to
     *     enable retries for it. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/identitydomains/SearchDynamicResourceGroupsExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use
     *     SearchDynamicResourceGroups API.
     */
    SearchDynamicResourceGroupsResponse searchDynamicResourceGroups(
            SearchDynamicResourceGroupsRequest request);

    /**
     * Search Groups Using POST
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation will not retry by default, users
     *     can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to
     *     enable retries for it. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/identitydomains/SearchGroupsExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use SearchGroups API.
     */
    SearchGroupsResponse searchGroups(SearchGroupsRequest request);

    /**
     * Search Identity Providers Using POST
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation will not retry by default, users
     *     can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to
     *     enable retries for it. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/identitydomains/SearchIdentityProvidersExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use
     *     SearchIdentityProviders API.
     */
    SearchIdentityProvidersResponse searchIdentityProviders(SearchIdentityProvidersRequest request);

    /**
     * Search KmsiSettings Using POST
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation will not retry by default, users
     *     can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to
     *     enable retries for it. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/identitydomains/SearchKmsiSettingsExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use SearchKmsiSettings
     *     API.
     */
    SearchKmsiSettingsResponse searchKmsiSettings(SearchKmsiSettingsRequest request);

    /**
     * Search My Groups Using POST
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation will not retry by default, users
     *     can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to
     *     enable retries for it. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/identitydomains/SearchMyGroupsExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use SearchMyGroups API.
     */
    SearchMyGroupsResponse searchMyGroups(SearchMyGroupsRequest request);

    /**
     * Search Oauth2Clients Using POST
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation will not retry by default, users
     *     can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to
     *     enable retries for it. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/identitydomains/SearchOAuth2ClientCredentialsExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use
     *     SearchOAuth2ClientCredentials API.
     */
    SearchOAuth2ClientCredentialsResponse searchOAuth2ClientCredentials(
            SearchOAuth2ClientCredentialsRequest request);

    /**
     * Search Password Policies Using POST
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation will not retry by default, users
     *     can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to
     *     enable retries for it. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/identitydomains/SearchPasswordPoliciesExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use
     *     SearchPasswordPolicies API.
     */
    SearchPasswordPoliciesResponse searchPasswordPolicies(SearchPasswordPoliciesRequest request);

    /**
     * Search smtp credentials Using POST
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation will not retry by default, users
     *     can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to
     *     enable retries for it. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/identitydomains/SearchSmtpCredentialsExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use
     *     SearchSmtpCredentials API.
     */
    SearchSmtpCredentialsResponse searchSmtpCredentials(SearchSmtpCredentialsRequest request);

    /**
     * Search a User's DBCredentials using POST
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation will not retry by default, users
     *     can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to
     *     enable retries for it. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/identitydomains/SearchUserDbCredentialsExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use
     *     SearchUserDbCredentials API.
     */
    SearchUserDbCredentialsResponse searchUserDbCredentials(SearchUserDbCredentialsRequest request);

    /**
     * Search Users Using POST
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation will not retry by default, users
     *     can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to
     *     enable retries for it. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/identitydomains/SearchUsersExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use SearchUsers API.
     */
    SearchUsersResponse searchUsers(SearchUsersRequest request);
}
