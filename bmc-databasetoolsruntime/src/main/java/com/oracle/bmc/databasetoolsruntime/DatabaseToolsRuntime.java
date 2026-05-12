/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.databasetoolsruntime;

import com.oracle.bmc.databasetoolsruntime.requests.*;
import com.oracle.bmc.databasetoolsruntime.responses.*;

/**
 * Use the Database Tools Runtime API to connect to databases through Database Tools Connections.
 * This service client uses CircuitBreakerUtils.DEFAULT_CIRCUIT_BREAKER for all the operations by
 * default if no circuit breaker configuration is defined by the user.
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20230222")
public interface DatabaseToolsRuntime extends AutoCloseable {

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
     * Sets the region to call (ex, Region.US_PHOENIX_1).
     *
     * <p>Note, this will call {@link #setEndpoint(String) setEndpoint} after resolving the
     * endpoint. If the service is not available in this Region, however, an
     * IllegalArgumentException will be raised.
     *
     * @param region The region of the service.
     */
    void setRegion(com.oracle.bmc.Region region);

    /**
     * Sets the region to call (ex, 'us-phoenix-1').
     *
     * <p>Note, this will first try to map the region ID to a known Region and call {@link
     * #setRegion(Region) setRegion}.
     *
     * <p>If no known Region could be determined, it will create an endpoint based on the default
     * endpoint format ({@link com.oracle.bmc.Region#formatDefaultRegionEndpoint(Service, String)}
     * and then call {@link #setEndpoint(String) setEndpoint}.
     *
     * @param regionId The public region ID.
     */
    void setRegion(String regionId);

    /**
     * Determines whether realm specific endpoint should be used or not. Set
     * realmSpecificEndpointTemplateEnabled to "true" if the user wants to enable use of realm
     * specific endpoint template, otherwise set it to "false"
     *
     * @param realmSpecificEndpointTemplateEnabled flag to enable the use of realm specific endpoint
     *     template
     */
    void useRealmSpecificEndpointTemplate(boolean realmSpecificEndpointTemplateEnabled);

    /**
     * Attempts to cancel the specified work request.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation uses
     *     RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is
     *     provided. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/databasetoolsruntime/CancelWorkRequestExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use CancelWorkRequest
     *     API.
     */
    CancelWorkRequestResponse cancelWorkRequest(CancelWorkRequestRequest request);

    /**
     * Creates a credential for the user specified by the key.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation uses
     *     RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is
     *     provided. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/databasetoolsruntime/CreateCredentialExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use CreateCredential
     *     API.
     */
    CreateCredentialResponse createCredential(CreateCredentialRequest request);

    /**
     * Grants the EXECUTE privilege on the credential to the user specified by the key.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation uses
     *     RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is
     *     provided. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/databasetoolsruntime/CreateCredentialExecuteGranteeExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use
     *     CreateCredentialExecuteGrantee API.
     */
    CreateCredentialExecuteGranteeResponse createCredentialExecuteGrantee(
            CreateCredentialExecuteGranteeRequest request);

    /**
     * Creates a public synonym for the given credentials
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation uses
     *     RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is
     *     provided. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/databasetoolsruntime/CreateCredentialPublicSynonymExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use
     *     CreateCredentialPublicSynonym API.
     */
    CreateCredentialPublicSynonymResponse createCredentialPublicSynonym(
            CreateCredentialPublicSynonymRequest request);

    /**
     * Create a Database Tools database API gateway config pool resource
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation uses
     *     RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is
     *     provided. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/databasetoolsruntime/CreateDatabaseToolsDatabaseApiGatewayConfigPoolExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use
     *     CreateDatabaseToolsDatabaseApiGatewayConfigPool API.
     */
    CreateDatabaseToolsDatabaseApiGatewayConfigPoolResponse
            createDatabaseToolsDatabaseApiGatewayConfigPool(
                    CreateDatabaseToolsDatabaseApiGatewayConfigPoolRequest request);

    /**
     * Create a Database Tools database API gateway config API spec resource
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation uses
     *     RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is
     *     provided. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/databasetoolsruntime/CreateDatabaseToolsDatabaseApiGatewayConfigPoolApiSpecExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use
     *     CreateDatabaseToolsDatabaseApiGatewayConfigPoolApiSpec API.
     */
    CreateDatabaseToolsDatabaseApiGatewayConfigPoolApiSpecResponse
            createDatabaseToolsDatabaseApiGatewayConfigPoolApiSpec(
                    CreateDatabaseToolsDatabaseApiGatewayConfigPoolApiSpecRequest request);

    /**
     * Create a Database Tools database API gateway config auto API spec resource
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation uses
     *     RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is
     *     provided. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/databasetoolsruntime/CreateDatabaseToolsDatabaseApiGatewayConfigPoolAutoApiSpecExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use
     *     CreateDatabaseToolsDatabaseApiGatewayConfigPoolAutoApiSpec API.
     */
    CreateDatabaseToolsDatabaseApiGatewayConfigPoolAutoApiSpecResponse
            createDatabaseToolsDatabaseApiGatewayConfigPoolAutoApiSpec(
                    CreateDatabaseToolsDatabaseApiGatewayConfigPoolAutoApiSpecRequest request);

    /**
     * Delete credential
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation uses
     *     RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is
     *     provided. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/databasetoolsruntime/DeleteCredentialExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use DeleteCredential
     *     API.
     */
    DeleteCredentialResponse deleteCredential(DeleteCredentialRequest request);

    /**
     * Delete execute grantee
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation uses
     *     RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is
     *     provided. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/databasetoolsruntime/DeleteCredentialExecuteGranteeExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use
     *     DeleteCredentialExecuteGrantee API.
     */
    DeleteCredentialExecuteGranteeResponse deleteCredentialExecuteGrantee(
            DeleteCredentialExecuteGranteeRequest request);

    /**
     * Deletes the public synonym
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation uses
     *     RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is
     *     provided. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/databasetoolsruntime/DeleteCredentialPublicSynonymExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use
     *     DeleteCredentialPublicSynonym API.
     */
    DeleteCredentialPublicSynonymResponse deleteCredentialPublicSynonym(
            DeleteCredentialPublicSynonymRequest request);

    /**
     * Deletes the specified Database Tools database API gateway config pool resource.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation uses
     *     RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is
     *     provided. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/databasetoolsruntime/DeleteDatabaseToolsDatabaseApiGatewayConfigPoolExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use
     *     DeleteDatabaseToolsDatabaseApiGatewayConfigPool API.
     */
    DeleteDatabaseToolsDatabaseApiGatewayConfigPoolResponse
            deleteDatabaseToolsDatabaseApiGatewayConfigPool(
                    DeleteDatabaseToolsDatabaseApiGatewayConfigPoolRequest request);

    /**
     * Deletes the specified Database Tools database API gateway config API spec resource.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation uses
     *     RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is
     *     provided. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/databasetoolsruntime/DeleteDatabaseToolsDatabaseApiGatewayConfigPoolApiSpecExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use
     *     DeleteDatabaseToolsDatabaseApiGatewayConfigPoolApiSpec API.
     */
    DeleteDatabaseToolsDatabaseApiGatewayConfigPoolApiSpecResponse
            deleteDatabaseToolsDatabaseApiGatewayConfigPoolApiSpec(
                    DeleteDatabaseToolsDatabaseApiGatewayConfigPoolApiSpecRequest request);

    /**
     * Deletes the specified Database Tools database API gateway config auto API spec resource.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation uses
     *     RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is
     *     provided. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/databasetoolsruntime/DeleteDatabaseToolsDatabaseApiGatewayConfigPoolAutoApiSpecExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use
     *     DeleteDatabaseToolsDatabaseApiGatewayConfigPoolAutoApiSpec API.
     */
    DeleteDatabaseToolsDatabaseApiGatewayConfigPoolAutoApiSpecResponse
            deleteDatabaseToolsDatabaseApiGatewayConfigPoolAutoApiSpec(
                    DeleteDatabaseToolsDatabaseApiGatewayConfigPoolAutoApiSpecRequest request);

    /**
     * Execute statements on a database tools connection.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation uses
     *     RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is
     *     provided. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/databasetoolsruntime/ExecuteSqlDatabaseToolsConnectionExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use
     *     ExecuteSqlDatabaseToolsConnection API.
     */
    ExecuteSqlDatabaseToolsConnectionResponse executeSqlDatabaseToolsConnection(
            ExecuteSqlDatabaseToolsConnectionRequest request);

    /**
     * Get a credential
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation uses
     *     RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is
     *     provided. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/databasetoolsruntime/GetCredentialExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use GetCredential API.
     */
    GetCredentialResponse getCredential(GetCredentialRequest request);

    /**
     * Get a credential execute grantee
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation uses
     *     RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is
     *     provided. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/databasetoolsruntime/GetCredentialExecuteGranteeExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use
     *     GetCredentialExecuteGrantee API.
     */
    GetCredentialExecuteGranteeResponse getCredentialExecuteGrantee(
            GetCredentialExecuteGranteeRequest request);

    /**
     * Get a public synonym
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation uses
     *     RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is
     *     provided. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/databasetoolsruntime/GetCredentialPublicSynonymExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use
     *     GetCredentialPublicSynonym API.
     */
    GetCredentialPublicSynonymResponse getCredentialPublicSynonym(
            GetCredentialPublicSynonymRequest request);

    /**
     * Get the content of a Database Tools database API gateway config
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation uses
     *     RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is
     *     provided. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/databasetoolsruntime/GetDatabaseToolsDatabaseApiGatewayConfigContentExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use
     *     GetDatabaseToolsDatabaseApiGatewayConfigContent API.
     */
    GetDatabaseToolsDatabaseApiGatewayConfigContentResponse
            getDatabaseToolsDatabaseApiGatewayConfigContent(
                    GetDatabaseToolsDatabaseApiGatewayConfigContentRequest request);

    /**
     * Get a Database Tools database API gateway config global resource
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation uses
     *     RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is
     *     provided. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/databasetoolsruntime/GetDatabaseToolsDatabaseApiGatewayConfigGlobalExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use
     *     GetDatabaseToolsDatabaseApiGatewayConfigGlobal API.
     */
    GetDatabaseToolsDatabaseApiGatewayConfigGlobalResponse
            getDatabaseToolsDatabaseApiGatewayConfigGlobal(
                    GetDatabaseToolsDatabaseApiGatewayConfigGlobalRequest request);

    /**
     * Get a Database Tools database API gateway config pool resource
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation uses
     *     RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is
     *     provided. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/databasetoolsruntime/GetDatabaseToolsDatabaseApiGatewayConfigPoolExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use
     *     GetDatabaseToolsDatabaseApiGatewayConfigPool API.
     */
    GetDatabaseToolsDatabaseApiGatewayConfigPoolResponse
            getDatabaseToolsDatabaseApiGatewayConfigPool(
                    GetDatabaseToolsDatabaseApiGatewayConfigPoolRequest request);

    /**
     * Get a Database Tools database API gateway config API spec resource
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation uses
     *     RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is
     *     provided. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/databasetoolsruntime/GetDatabaseToolsDatabaseApiGatewayConfigPoolApiSpecExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use
     *     GetDatabaseToolsDatabaseApiGatewayConfigPoolApiSpec API.
     */
    GetDatabaseToolsDatabaseApiGatewayConfigPoolApiSpecResponse
            getDatabaseToolsDatabaseApiGatewayConfigPoolApiSpec(
                    GetDatabaseToolsDatabaseApiGatewayConfigPoolApiSpecRequest request);

    /**
     * Get a Database Tools database API gateway config auto API spec resource
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation uses
     *     RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is
     *     provided. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/databasetoolsruntime/GetDatabaseToolsDatabaseApiGatewayConfigPoolAutoApiSpecExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use
     *     GetDatabaseToolsDatabaseApiGatewayConfigPoolAutoApiSpec API.
     */
    GetDatabaseToolsDatabaseApiGatewayConfigPoolAutoApiSpecResponse
            getDatabaseToolsDatabaseApiGatewayConfigPoolAutoApiSpec(
                    GetDatabaseToolsDatabaseApiGatewayConfigPoolAutoApiSpecRequest request);

    /**
     * Get a property set
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation uses
     *     RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is
     *     provided. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/databasetoolsruntime/GetPropertySetExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use GetPropertySet API.
     */
    GetPropertySetResponse getPropertySet(GetPropertySetRequest request);

    /**
     * Get a user credential
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation uses
     *     RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is
     *     provided. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/databasetoolsruntime/GetUserCredentialExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use GetUserCredential
     *     API.
     */
    GetUserCredentialResponse getUserCredential(GetUserCredentialRequest request);

    /**
     * Gets the status of the specified work request.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation uses
     *     RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is
     *     provided. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/databasetoolsruntime/GetWorkRequestExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use GetWorkRequest API.
     */
    GetWorkRequestResponse getWorkRequest(GetWorkRequestRequest request);

    /**
     * Get a list of all execute grantees
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation uses
     *     RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is
     *     provided. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/databasetoolsruntime/ListCredentialExecuteGranteesExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use
     *     ListCredentialExecuteGrantees API.
     */
    ListCredentialExecuteGranteesResponse listCredentialExecuteGrantees(
            ListCredentialExecuteGranteesRequest request);

    /**
     * Get a list of all public synonyms for the given credential
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation uses
     *     RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is
     *     provided. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/databasetoolsruntime/ListCredentialPublicSynonymsExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use
     *     ListCredentialPublicSynonyms API.
     */
    ListCredentialPublicSynonymsResponse listCredentialPublicSynonyms(
            ListCredentialPublicSynonymsRequest request);

    /**
     * Returns a paginated list of `CredentialSummary` for the specified request.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation uses
     *     RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is
     *     provided. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/databasetoolsruntime/ListCredentialsExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use ListCredentials
     *     API.
     */
    ListCredentialsResponse listCredentials(ListCredentialsRequest request);

    /**
     * Returns list of database API gateway config setting descriptions to be provided as advanced
     * properties.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation uses
     *     RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is
     *     provided. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/databasetoolsruntime/ListDatabaseToolsDatabaseApiGatewayConfigAdvancedPropertiesExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use
     *     ListDatabaseToolsDatabaseApiGatewayConfigAdvancedProperties API.
     */
    ListDatabaseToolsDatabaseApiGatewayConfigAdvancedPropertiesResponse
            listDatabaseToolsDatabaseApiGatewayConfigAdvancedProperties(
                    ListDatabaseToolsDatabaseApiGatewayConfigAdvancedPropertiesRequest request);

    /**
     * Returns a list of Database Tools database API gateway config API spec resources
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation uses
     *     RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is
     *     provided. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/databasetoolsruntime/ListDatabaseToolsDatabaseApiGatewayConfigPoolApiSpecsExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use
     *     ListDatabaseToolsDatabaseApiGatewayConfigPoolApiSpecs API.
     */
    ListDatabaseToolsDatabaseApiGatewayConfigPoolApiSpecsResponse
            listDatabaseToolsDatabaseApiGatewayConfigPoolApiSpecs(
                    ListDatabaseToolsDatabaseApiGatewayConfigPoolApiSpecsRequest request);

    /**
     * Returns a list of Database Tools database API gateway config auto API spec resources
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation uses
     *     RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is
     *     provided. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/databasetoolsruntime/ListDatabaseToolsDatabaseApiGatewayConfigPoolAutoApiSpecsExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use
     *     ListDatabaseToolsDatabaseApiGatewayConfigPoolAutoApiSpecs API.
     */
    ListDatabaseToolsDatabaseApiGatewayConfigPoolAutoApiSpecsResponse
            listDatabaseToolsDatabaseApiGatewayConfigPoolAutoApiSpecs(
                    ListDatabaseToolsDatabaseApiGatewayConfigPoolAutoApiSpecsRequest request);

    /**
     * Returns a list of Database Tools database API gateway config pool resources
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation uses
     *     RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is
     *     provided. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/databasetoolsruntime/ListDatabaseToolsDatabaseApiGatewayConfigPoolsExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use
     *     ListDatabaseToolsDatabaseApiGatewayConfigPools API.
     */
    ListDatabaseToolsDatabaseApiGatewayConfigPoolsResponse
            listDatabaseToolsDatabaseApiGatewayConfigPools(
                    ListDatabaseToolsDatabaseApiGatewayConfigPoolsRequest request);

    /**
     * Returns a paginated list of user `UserCredentialSummary` for the specified request.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation uses
     *     RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is
     *     provided. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/databasetoolsruntime/ListUserCredentialsExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use ListUserCredentials
     *     API.
     */
    ListUserCredentialsResponse listUserCredentials(ListUserCredentialsRequest request);

    /**
     * Returns a paginated list of errors for the specified work request.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation uses
     *     RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is
     *     provided. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/databasetoolsruntime/ListWorkRequestErrorsExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use
     *     ListWorkRequestErrors API.
     */
    ListWorkRequestErrorsResponse listWorkRequestErrors(ListWorkRequestErrorsRequest request);

    /**
     * Returns a paginated list of logs for the specified work request.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation uses
     *     RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is
     *     provided. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/databasetoolsruntime/ListWorkRequestLogsExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use ListWorkRequestLogs
     *     API.
     */
    ListWorkRequestLogsResponse listWorkRequestLogs(ListWorkRequestLogsRequest request);

    /**
     * Lists the work requests in a compartment.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation uses
     *     RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is
     *     provided. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/databasetoolsruntime/ListWorkRequestsExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use ListWorkRequests
     *     API.
     */
    ListWorkRequestsResponse listWorkRequests(ListWorkRequestsRequest request);

    /**
     * Update a credential
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation uses
     *     RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is
     *     provided. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/databasetoolsruntime/UpdateCredentialExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use UpdateCredential
     *     API.
     */
    UpdateCredentialResponse updateCredential(UpdateCredentialRequest request);

    /**
     * Update a Database Tools database API gateway config global resource
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation uses
     *     RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is
     *     provided. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/databasetoolsruntime/UpdateDatabaseToolsDatabaseApiGatewayConfigGlobalExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use
     *     UpdateDatabaseToolsDatabaseApiGatewayConfigGlobal API.
     */
    UpdateDatabaseToolsDatabaseApiGatewayConfigGlobalResponse
            updateDatabaseToolsDatabaseApiGatewayConfigGlobal(
                    UpdateDatabaseToolsDatabaseApiGatewayConfigGlobalRequest request);

    /**
     * Update a Database Tools database API gateway config pool resource
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation uses
     *     RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is
     *     provided. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/databasetoolsruntime/UpdateDatabaseToolsDatabaseApiGatewayConfigPoolExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use
     *     UpdateDatabaseToolsDatabaseApiGatewayConfigPool API.
     */
    UpdateDatabaseToolsDatabaseApiGatewayConfigPoolResponse
            updateDatabaseToolsDatabaseApiGatewayConfigPool(
                    UpdateDatabaseToolsDatabaseApiGatewayConfigPoolRequest request);

    /**
     * Update a Database Tools database API gateway config API spec resource
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation uses
     *     RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is
     *     provided. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/databasetoolsruntime/UpdateDatabaseToolsDatabaseApiGatewayConfigPoolApiSpecExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use
     *     UpdateDatabaseToolsDatabaseApiGatewayConfigPoolApiSpec API.
     */
    UpdateDatabaseToolsDatabaseApiGatewayConfigPoolApiSpecResponse
            updateDatabaseToolsDatabaseApiGatewayConfigPoolApiSpec(
                    UpdateDatabaseToolsDatabaseApiGatewayConfigPoolApiSpecRequest request);

    /**
     * Update a Database Tools database API gateway config auto API spec resource
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation uses
     *     RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is
     *     provided. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/databasetoolsruntime/UpdateDatabaseToolsDatabaseApiGatewayConfigPoolAutoApiSpecExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use
     *     UpdateDatabaseToolsDatabaseApiGatewayConfigPoolAutoApiSpec API.
     */
    UpdateDatabaseToolsDatabaseApiGatewayConfigPoolAutoApiSpecResponse
            updateDatabaseToolsDatabaseApiGatewayConfigPoolAutoApiSpec(
                    UpdateDatabaseToolsDatabaseApiGatewayConfigPoolAutoApiSpecRequest request);

    /**
     * Update a property set
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation uses
     *     RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is
     *     provided. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/databasetoolsruntime/UpdatePropertySetExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use UpdatePropertySet
     *     API.
     */
    UpdatePropertySetResponse updatePropertySet(UpdatePropertySetRequest request);

    /**
     * Validates the specified Database Tools connection.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation uses
     *     RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is
     *     provided. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/databasetoolsruntime/ValidateDatabaseToolsConnectionExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use
     *     ValidateDatabaseToolsConnection API.
     */
    ValidateDatabaseToolsConnectionResponse validateDatabaseToolsConnection(
            ValidateDatabaseToolsConnectionRequest request);

    /**
     * Validates the Database Tools identity credentials by establishing a connection to the
     * customer database and executing the dbms_cloud.send_request to validate the credential.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation uses
     *     RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is
     *     provided. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/databasetoolsruntime/ValidateDatabaseToolsIdentityCredentialExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use
     *     ValidateDatabaseToolsIdentityCredential API.
     */
    ValidateDatabaseToolsIdentityCredentialResponse validateDatabaseToolsIdentityCredential(
            ValidateDatabaseToolsIdentityCredentialRequest request);

    /**
     * Gets the pre-configured waiters available for resources for this service.
     *
     * @return The service waiters.
     */
    DatabaseToolsRuntimeWaiters getWaiters();

    /**
     * Gets the pre-configured paginators available for list operations in this service which may
     * return multiple pages of data. These paginators provide an {@link java.lang.Iterable}
     * interface so that service responses, or resources/records, can be iterated through without
     * having to manually deal with pagination and page tokens.
     *
     * @return The service paginators.
     */
    DatabaseToolsRuntimePaginators getPaginators();
}
