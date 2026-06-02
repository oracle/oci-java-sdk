/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.databasetoolsruntime;

import com.oracle.bmc.databasetoolsruntime.requests.*;
import com.oracle.bmc.databasetoolsruntime.responses.*;

/**
 * Use the Database Tools Runtime API to connect to databases through Database Tools Connections.
 */
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20230222")
public interface DatabaseToolsRuntimeAsync extends AutoCloseable {

    /**
     * Rebuilds the client from scratch.
     * Useful to refresh certificates.
     */
    void refreshClient();

    /**
     * Sets the endpoint to call (ex, https://www.example.com).
     * @param endpoint The endpoint of the serice.
     */
    void setEndpoint(String endpoint);

    /**
     * Gets the set endpoint for REST call (ex, https://www.example.com)
     */
    String getEndpoint();

    /**
     * Sets the region to call (ex, Region.US_PHOENIX_1).
     * <p>
     * Note, this will call {@link #setEndpoint(String) setEndpoint} after resolving the endpoint.  If the service is not available in this region, however, an IllegalArgumentException will be raised.
     * @param region The region of the service.
     */
    void setRegion(com.oracle.bmc.Region region);

    /**
     * Sets the region to call (ex, 'us-phoenix-1').
     * <p>
     * Note, this will first try to map the region ID to a known Region and call
     * {@link #setRegion(Region) setRegion}.
     * <p>
     * If no known Region could be determined, it will create an endpoint based on the
     * default endpoint format ({@link com.oracle.bmc.Region#formatDefaultRegionEndpoint(Service, String)}
     * and then call {@link #setEndpoint(String) setEndpoint}.
     * @param regionId The public region ID.
     */
    void setRegion(String regionId);

    /**
     * Determines whether realm specific endpoint should be used or not.
     * Set realmSpecificEndpointTemplateEnabled to "true" if the user wants to enable use of realm specific endpoint template, otherwise set it to "false"
     * @param realmSpecificEndpointTemplateEnabled flag to enable the use of realm specific endpoint template
     */
    void useRealmSpecificEndpointTemplate(boolean realmSpecificEndpointTemplateEnabled);

    /**
     * Attempts to cancel the specified work request.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<CancelWorkRequestResponse> cancelWorkRequest(
            CancelWorkRequestRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            CancelWorkRequestRequest, CancelWorkRequestResponse>
                    handler);

    /**
     * Creates a credential for the user specified by the key.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<CreateCredentialResponse> createCredential(
            CreateCredentialRequest request,
            com.oracle.bmc.responses.AsyncHandler<CreateCredentialRequest, CreateCredentialResponse>
                    handler);

    /**
     * Grants the EXECUTE privilege on the credential to the user specified by the key.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<CreateCredentialExecuteGranteeResponse>
            createCredentialExecuteGrantee(
                    CreateCredentialExecuteGranteeRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    CreateCredentialExecuteGranteeRequest,
                                    CreateCredentialExecuteGranteeResponse>
                            handler);

    /**
     * Creates a public synonym for the given credentials
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<CreateCredentialPublicSynonymResponse>
            createCredentialPublicSynonym(
                    CreateCredentialPublicSynonymRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    CreateCredentialPublicSynonymRequest,
                                    CreateCredentialPublicSynonymResponse>
                            handler);

    /**
     * Create a Database Tools database API gateway config pool resource
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<CreateDatabaseToolsDatabaseApiGatewayConfigPoolResponse>
            createDatabaseToolsDatabaseApiGatewayConfigPool(
                    CreateDatabaseToolsDatabaseApiGatewayConfigPoolRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    CreateDatabaseToolsDatabaseApiGatewayConfigPoolRequest,
                                    CreateDatabaseToolsDatabaseApiGatewayConfigPoolResponse>
                            handler);

    /**
     * Create a Database Tools database API gateway config API spec resource
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<CreateDatabaseToolsDatabaseApiGatewayConfigPoolApiSpecResponse>
            createDatabaseToolsDatabaseApiGatewayConfigPoolApiSpec(
                    CreateDatabaseToolsDatabaseApiGatewayConfigPoolApiSpecRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    CreateDatabaseToolsDatabaseApiGatewayConfigPoolApiSpecRequest,
                                    CreateDatabaseToolsDatabaseApiGatewayConfigPoolApiSpecResponse>
                            handler);

    /**
     * Create a Database Tools database API gateway config auto API spec resource
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<CreateDatabaseToolsDatabaseApiGatewayConfigPoolAutoApiSpecResponse>
            createDatabaseToolsDatabaseApiGatewayConfigPoolAutoApiSpec(
                    CreateDatabaseToolsDatabaseApiGatewayConfigPoolAutoApiSpecRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    CreateDatabaseToolsDatabaseApiGatewayConfigPoolAutoApiSpecRequest,
                                    CreateDatabaseToolsDatabaseApiGatewayConfigPoolAutoApiSpecResponse>
                            handler);

    /**
     * Delete credential
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<DeleteCredentialResponse> deleteCredential(
            DeleteCredentialRequest request,
            com.oracle.bmc.responses.AsyncHandler<DeleteCredentialRequest, DeleteCredentialResponse>
                    handler);

    /**
     * Delete execute grantee
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<DeleteCredentialExecuteGranteeResponse>
            deleteCredentialExecuteGrantee(
                    DeleteCredentialExecuteGranteeRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    DeleteCredentialExecuteGranteeRequest,
                                    DeleteCredentialExecuteGranteeResponse>
                            handler);

    /**
     * Deletes the public synonym
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<DeleteCredentialPublicSynonymResponse>
            deleteCredentialPublicSynonym(
                    DeleteCredentialPublicSynonymRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    DeleteCredentialPublicSynonymRequest,
                                    DeleteCredentialPublicSynonymResponse>
                            handler);

    /**
     * Deletes the specified Database Tools database API gateway config pool resource.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<DeleteDatabaseToolsDatabaseApiGatewayConfigPoolResponse>
            deleteDatabaseToolsDatabaseApiGatewayConfigPool(
                    DeleteDatabaseToolsDatabaseApiGatewayConfigPoolRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    DeleteDatabaseToolsDatabaseApiGatewayConfigPoolRequest,
                                    DeleteDatabaseToolsDatabaseApiGatewayConfigPoolResponse>
                            handler);

    /**
     * Deletes the specified Database Tools database API gateway config API spec resource.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<DeleteDatabaseToolsDatabaseApiGatewayConfigPoolApiSpecResponse>
            deleteDatabaseToolsDatabaseApiGatewayConfigPoolApiSpec(
                    DeleteDatabaseToolsDatabaseApiGatewayConfigPoolApiSpecRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    DeleteDatabaseToolsDatabaseApiGatewayConfigPoolApiSpecRequest,
                                    DeleteDatabaseToolsDatabaseApiGatewayConfigPoolApiSpecResponse>
                            handler);

    /**
     * Deletes the specified Database Tools database API gateway config auto API spec resource.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<DeleteDatabaseToolsDatabaseApiGatewayConfigPoolAutoApiSpecResponse>
            deleteDatabaseToolsDatabaseApiGatewayConfigPoolAutoApiSpec(
                    DeleteDatabaseToolsDatabaseApiGatewayConfigPoolAutoApiSpecRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    DeleteDatabaseToolsDatabaseApiGatewayConfigPoolAutoApiSpecRequest,
                                    DeleteDatabaseToolsDatabaseApiGatewayConfigPoolAutoApiSpecResponse>
                            handler);

    /**
     * Execute statements on a database tools connection.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<ExecuteSqlDatabaseToolsConnectionResponse>
            executeSqlDatabaseToolsConnection(
                    ExecuteSqlDatabaseToolsConnectionRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    ExecuteSqlDatabaseToolsConnectionRequest,
                                    ExecuteSqlDatabaseToolsConnectionResponse>
                            handler);

    /**
     * Get a credential
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<GetCredentialResponse> getCredential(
            GetCredentialRequest request,
            com.oracle.bmc.responses.AsyncHandler<GetCredentialRequest, GetCredentialResponse>
                    handler);

    /**
     * Get a credential execute grantee
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<GetCredentialExecuteGranteeResponse> getCredentialExecuteGrantee(
            GetCredentialExecuteGranteeRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            GetCredentialExecuteGranteeRequest, GetCredentialExecuteGranteeResponse>
                    handler);

    /**
     * Get a public synonym
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<GetCredentialPublicSynonymResponse> getCredentialPublicSynonym(
            GetCredentialPublicSynonymRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            GetCredentialPublicSynonymRequest, GetCredentialPublicSynonymResponse>
                    handler);

    /**
     * Get the content of a Database Tools database API gateway config
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<GetDatabaseToolsDatabaseApiGatewayConfigContentResponse>
            getDatabaseToolsDatabaseApiGatewayConfigContent(
                    GetDatabaseToolsDatabaseApiGatewayConfigContentRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    GetDatabaseToolsDatabaseApiGatewayConfigContentRequest,
                                    GetDatabaseToolsDatabaseApiGatewayConfigContentResponse>
                            handler);

    /**
     * Get a Database Tools database API gateway config global resource
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<GetDatabaseToolsDatabaseApiGatewayConfigGlobalResponse>
            getDatabaseToolsDatabaseApiGatewayConfigGlobal(
                    GetDatabaseToolsDatabaseApiGatewayConfigGlobalRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    GetDatabaseToolsDatabaseApiGatewayConfigGlobalRequest,
                                    GetDatabaseToolsDatabaseApiGatewayConfigGlobalResponse>
                            handler);

    /**
     * Get a Database Tools database API gateway config pool resource
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<GetDatabaseToolsDatabaseApiGatewayConfigPoolResponse>
            getDatabaseToolsDatabaseApiGatewayConfigPool(
                    GetDatabaseToolsDatabaseApiGatewayConfigPoolRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    GetDatabaseToolsDatabaseApiGatewayConfigPoolRequest,
                                    GetDatabaseToolsDatabaseApiGatewayConfigPoolResponse>
                            handler);

    /**
     * Get a Database Tools database API gateway config API spec resource
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<GetDatabaseToolsDatabaseApiGatewayConfigPoolApiSpecResponse>
            getDatabaseToolsDatabaseApiGatewayConfigPoolApiSpec(
                    GetDatabaseToolsDatabaseApiGatewayConfigPoolApiSpecRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    GetDatabaseToolsDatabaseApiGatewayConfigPoolApiSpecRequest,
                                    GetDatabaseToolsDatabaseApiGatewayConfigPoolApiSpecResponse>
                            handler);

    /**
     * Get a Database Tools database API gateway config auto API spec resource
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<GetDatabaseToolsDatabaseApiGatewayConfigPoolAutoApiSpecResponse>
            getDatabaseToolsDatabaseApiGatewayConfigPoolAutoApiSpec(
                    GetDatabaseToolsDatabaseApiGatewayConfigPoolAutoApiSpecRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    GetDatabaseToolsDatabaseApiGatewayConfigPoolAutoApiSpecRequest,
                                    GetDatabaseToolsDatabaseApiGatewayConfigPoolAutoApiSpecResponse>
                            handler);

    /**
     * Get a property set
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<GetPropertySetResponse> getPropertySet(
            GetPropertySetRequest request,
            com.oracle.bmc.responses.AsyncHandler<GetPropertySetRequest, GetPropertySetResponse>
                    handler);

    /**
     * Get a user credential
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<GetUserCredentialResponse> getUserCredential(
            GetUserCredentialRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            GetUserCredentialRequest, GetUserCredentialResponse>
                    handler);

    /**
     * Gets the status of the specified work request.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<GetWorkRequestResponse> getWorkRequest(
            GetWorkRequestRequest request,
            com.oracle.bmc.responses.AsyncHandler<GetWorkRequestRequest, GetWorkRequestResponse>
                    handler);

    /**
     * Get a list of all execute grantees
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<ListCredentialExecuteGranteesResponse>
            listCredentialExecuteGrantees(
                    ListCredentialExecuteGranteesRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    ListCredentialExecuteGranteesRequest,
                                    ListCredentialExecuteGranteesResponse>
                            handler);

    /**
     * Get a list of all public synonyms for the given credential
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<ListCredentialPublicSynonymsResponse> listCredentialPublicSynonyms(
            ListCredentialPublicSynonymsRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            ListCredentialPublicSynonymsRequest,
                            ListCredentialPublicSynonymsResponse>
                    handler);

    /**
     * Returns a paginated list of `CredentialSummary` for the specified request.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<ListCredentialsResponse> listCredentials(
            ListCredentialsRequest request,
            com.oracle.bmc.responses.AsyncHandler<ListCredentialsRequest, ListCredentialsResponse>
                    handler);

    /**
     * Returns list of database API gateway config setting descriptions to be provided as advanced properties.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<ListDatabaseToolsDatabaseApiGatewayConfigAdvancedPropertiesResponse>
            listDatabaseToolsDatabaseApiGatewayConfigAdvancedProperties(
                    ListDatabaseToolsDatabaseApiGatewayConfigAdvancedPropertiesRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    ListDatabaseToolsDatabaseApiGatewayConfigAdvancedPropertiesRequest,
                                    ListDatabaseToolsDatabaseApiGatewayConfigAdvancedPropertiesResponse>
                            handler);

    /**
     * Returns a list of Database Tools database API gateway config API spec resources
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<ListDatabaseToolsDatabaseApiGatewayConfigPoolApiSpecsResponse>
            listDatabaseToolsDatabaseApiGatewayConfigPoolApiSpecs(
                    ListDatabaseToolsDatabaseApiGatewayConfigPoolApiSpecsRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    ListDatabaseToolsDatabaseApiGatewayConfigPoolApiSpecsRequest,
                                    ListDatabaseToolsDatabaseApiGatewayConfigPoolApiSpecsResponse>
                            handler);

    /**
     * Returns a list of Database Tools database API gateway config auto API spec resources
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<ListDatabaseToolsDatabaseApiGatewayConfigPoolAutoApiSpecsResponse>
            listDatabaseToolsDatabaseApiGatewayConfigPoolAutoApiSpecs(
                    ListDatabaseToolsDatabaseApiGatewayConfigPoolAutoApiSpecsRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    ListDatabaseToolsDatabaseApiGatewayConfigPoolAutoApiSpecsRequest,
                                    ListDatabaseToolsDatabaseApiGatewayConfigPoolAutoApiSpecsResponse>
                            handler);

    /**
     * Returns a list of Database Tools database API gateway config pool resources
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<ListDatabaseToolsDatabaseApiGatewayConfigPoolsResponse>
            listDatabaseToolsDatabaseApiGatewayConfigPools(
                    ListDatabaseToolsDatabaseApiGatewayConfigPoolsRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    ListDatabaseToolsDatabaseApiGatewayConfigPoolsRequest,
                                    ListDatabaseToolsDatabaseApiGatewayConfigPoolsResponse>
                            handler);

    /**
     * Returns a paginated list of user `UserCredentialSummary` for the specified request.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<ListUserCredentialsResponse> listUserCredentials(
            ListUserCredentialsRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            ListUserCredentialsRequest, ListUserCredentialsResponse>
                    handler);

    /**
     * Returns a paginated list of errors for the specified work request.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<ListWorkRequestErrorsResponse> listWorkRequestErrors(
            ListWorkRequestErrorsRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            ListWorkRequestErrorsRequest, ListWorkRequestErrorsResponse>
                    handler);

    /**
     * Returns a paginated list of logs for the specified work request.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<ListWorkRequestLogsResponse> listWorkRequestLogs(
            ListWorkRequestLogsRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            ListWorkRequestLogsRequest, ListWorkRequestLogsResponse>
                    handler);

    /**
     * Lists the work requests in a compartment.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<ListWorkRequestsResponse> listWorkRequests(
            ListWorkRequestsRequest request,
            com.oracle.bmc.responses.AsyncHandler<ListWorkRequestsRequest, ListWorkRequestsResponse>
                    handler);

    /**
     * Update a credential
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<UpdateCredentialResponse> updateCredential(
            UpdateCredentialRequest request,
            com.oracle.bmc.responses.AsyncHandler<UpdateCredentialRequest, UpdateCredentialResponse>
                    handler);

    /**
     * Update a Database Tools database API gateway config global resource
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<UpdateDatabaseToolsDatabaseApiGatewayConfigGlobalResponse>
            updateDatabaseToolsDatabaseApiGatewayConfigGlobal(
                    UpdateDatabaseToolsDatabaseApiGatewayConfigGlobalRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    UpdateDatabaseToolsDatabaseApiGatewayConfigGlobalRequest,
                                    UpdateDatabaseToolsDatabaseApiGatewayConfigGlobalResponse>
                            handler);

    /**
     * Update a Database Tools database API gateway config pool resource
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<UpdateDatabaseToolsDatabaseApiGatewayConfigPoolResponse>
            updateDatabaseToolsDatabaseApiGatewayConfigPool(
                    UpdateDatabaseToolsDatabaseApiGatewayConfigPoolRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    UpdateDatabaseToolsDatabaseApiGatewayConfigPoolRequest,
                                    UpdateDatabaseToolsDatabaseApiGatewayConfigPoolResponse>
                            handler);

    /**
     * Update a Database Tools database API gateway config API spec resource
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<UpdateDatabaseToolsDatabaseApiGatewayConfigPoolApiSpecResponse>
            updateDatabaseToolsDatabaseApiGatewayConfigPoolApiSpec(
                    UpdateDatabaseToolsDatabaseApiGatewayConfigPoolApiSpecRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    UpdateDatabaseToolsDatabaseApiGatewayConfigPoolApiSpecRequest,
                                    UpdateDatabaseToolsDatabaseApiGatewayConfigPoolApiSpecResponse>
                            handler);

    /**
     * Update a Database Tools database API gateway config auto API spec resource
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<UpdateDatabaseToolsDatabaseApiGatewayConfigPoolAutoApiSpecResponse>
            updateDatabaseToolsDatabaseApiGatewayConfigPoolAutoApiSpec(
                    UpdateDatabaseToolsDatabaseApiGatewayConfigPoolAutoApiSpecRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    UpdateDatabaseToolsDatabaseApiGatewayConfigPoolAutoApiSpecRequest,
                                    UpdateDatabaseToolsDatabaseApiGatewayConfigPoolAutoApiSpecResponse>
                            handler);

    /**
     * Update a property set
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<UpdatePropertySetResponse> updatePropertySet(
            UpdatePropertySetRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            UpdatePropertySetRequest, UpdatePropertySetResponse>
                    handler);

    /**
     * Validates the specified Database Tools connection.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<ValidateDatabaseToolsConnectionResponse>
            validateDatabaseToolsConnection(
                    ValidateDatabaseToolsConnectionRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    ValidateDatabaseToolsConnectionRequest,
                                    ValidateDatabaseToolsConnectionResponse>
                            handler);

    /**
     * Validates the Database Tools identity credentials by establishing a connection to the customer database
     * and executing the dbms_cloud.send_request to validate the credential.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<ValidateDatabaseToolsIdentityCredentialResponse>
            validateDatabaseToolsIdentityCredential(
                    ValidateDatabaseToolsIdentityCredentialRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    ValidateDatabaseToolsIdentityCredentialRequest,
                                    ValidateDatabaseToolsIdentityCredentialResponse>
                            handler);
}
