/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.databasetools;

import com.oracle.bmc.databasetools.requests.*;
import com.oracle.bmc.databasetools.responses.*;

/**
 * Use the Database Tools API to manage connections, private endpoints, and work requests in the Database Tools service.
 */
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20201005")
public interface DatabaseToolsAsync extends AutoCloseable {

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
     * Adds a lock to a DatabaseToolsConnection resource.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<AddDatabaseToolsConnectionLockResponse>
            addDatabaseToolsConnectionLock(
                    AddDatabaseToolsConnectionLockRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    AddDatabaseToolsConnectionLockRequest,
                                    AddDatabaseToolsConnectionLockResponse>
                            handler);

    /**
     * Adds a lock to a DatabaseToolsDatabaseApiGatewayConfig resource.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<AddDatabaseToolsDatabaseApiGatewayConfigLockResponse>
            addDatabaseToolsDatabaseApiGatewayConfigLock(
                    AddDatabaseToolsDatabaseApiGatewayConfigLockRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    AddDatabaseToolsDatabaseApiGatewayConfigLockRequest,
                                    AddDatabaseToolsDatabaseApiGatewayConfigLockResponse>
                            handler);

    /**
     * Adds a lock to a DatabaseToolsIdentity resource.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<AddDatabaseToolsIdentityLockResponse> addDatabaseToolsIdentityLock(
            AddDatabaseToolsIdentityLockRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            AddDatabaseToolsIdentityLockRequest,
                            AddDatabaseToolsIdentityLockResponse>
                    handler);

    /**
     * Adds a lock to a DatabaseToolsMcpServer resource.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<AddDatabaseToolsMcpServerLockResponse>
            addDatabaseToolsMcpServerLock(
                    AddDatabaseToolsMcpServerLockRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    AddDatabaseToolsMcpServerLockRequest,
                                    AddDatabaseToolsMcpServerLockResponse>
                            handler);

    /**
     * Adds a lock to a DatabaseToolsMcpToolset resource.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<AddDatabaseToolsMcpToolsetLockResponse>
            addDatabaseToolsMcpToolsetLock(
                    AddDatabaseToolsMcpToolsetLockRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    AddDatabaseToolsMcpToolsetLockRequest,
                                    AddDatabaseToolsMcpToolsetLockResponse>
                            handler);

    /**
     * Adds a lock to a DatabaseToolsPrivateEndpoint resource.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<AddDatabaseToolsPrivateEndpointLockResponse>
            addDatabaseToolsPrivateEndpointLock(
                    AddDatabaseToolsPrivateEndpointLockRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    AddDatabaseToolsPrivateEndpointLockRequest,
                                    AddDatabaseToolsPrivateEndpointLockResponse>
                            handler);

    /**
     * Adds a lock to a DatabaseToolsSqlReport resource.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<AddDatabaseToolsSqlReportLockResponse>
            addDatabaseToolsSqlReportLock(
                    AddDatabaseToolsSqlReportLockRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    AddDatabaseToolsSqlReportLockRequest,
                                    AddDatabaseToolsSqlReportLockResponse>
                            handler);

    /**
     * Deletes Database Tools McpServer resource.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<CascadingDeleteDatabaseToolsMcpServerResponse>
            cascadingDeleteDatabaseToolsMcpServer(
                    CascadingDeleteDatabaseToolsMcpServerRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    CascadingDeleteDatabaseToolsMcpServerRequest,
                                    CascadingDeleteDatabaseToolsMcpServerResponse>
                            handler);

    /**
     * Moves the specified Database Tools connection to a different compartment in the same tenancy.
     * For information about moving resources between compartments, see
     * [Moving Resources to a Different Compartment](https://docs.oracle.com/iaas/Content/Identity/Tasks/managingcompartments.htm#moveRes).
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<ChangeDatabaseToolsConnectionCompartmentResponse>
            changeDatabaseToolsConnectionCompartment(
                    ChangeDatabaseToolsConnectionCompartmentRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    ChangeDatabaseToolsConnectionCompartmentRequest,
                                    ChangeDatabaseToolsConnectionCompartmentResponse>
                            handler);

    /**
     * Moves the specified Database Tools database API gateway config to a different compartment in the same tenancy.
     * For information about moving resources between compartments, see
     * [Moving Resources to a Different Compartment](https://docs.oracle.com/iaas/Content/DbApiGatewayConfig/Tasks/managingcompartments.htm#moveRes).
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<ChangeDatabaseToolsDatabaseApiGatewayConfigCompartmentResponse>
            changeDatabaseToolsDatabaseApiGatewayConfigCompartment(
                    ChangeDatabaseToolsDatabaseApiGatewayConfigCompartmentRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    ChangeDatabaseToolsDatabaseApiGatewayConfigCompartmentRequest,
                                    ChangeDatabaseToolsDatabaseApiGatewayConfigCompartmentResponse>
                            handler);

    /**
     * Moves the specified Database Tools identity to a different compartment in the same tenancy.
     * For information about moving resources between compartments, see
     * [Moving Resources to a Different Compartment](https://docs.oracle.com/iaas/Content/Identity/Tasks/managingcompartments.htm#moveRes).
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<ChangeDatabaseToolsIdentityCompartmentResponse>
            changeDatabaseToolsIdentityCompartment(
                    ChangeDatabaseToolsIdentityCompartmentRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    ChangeDatabaseToolsIdentityCompartmentRequest,
                                    ChangeDatabaseToolsIdentityCompartmentResponse>
                            handler);

    /**
     * Moves the specified Database Tools mcpserver to a different compartment in the same tenancy.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<ChangeDatabaseToolsMcpServerCompartmentResponse>
            changeDatabaseToolsMcpServerCompartment(
                    ChangeDatabaseToolsMcpServerCompartmentRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    ChangeDatabaseToolsMcpServerCompartmentRequest,
                                    ChangeDatabaseToolsMcpServerCompartmentResponse>
                            handler);

    /**
     * Moves the specified Database Tools MCP Toolset to a different compartment in the same tenancy.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<ChangeDatabaseToolsMcpToolsetCompartmentResponse>
            changeDatabaseToolsMcpToolsetCompartment(
                    ChangeDatabaseToolsMcpToolsetCompartmentRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    ChangeDatabaseToolsMcpToolsetCompartmentRequest,
                                    ChangeDatabaseToolsMcpToolsetCompartmentResponse>
                            handler);

    /**
     * Moves a Database Tools private endpoint into a different compartment in the same tenancy.
     * For information about moving resources between compartments, see
     * [Moving Resources to a Different Compartment](https://docs.oracle.com/iaas/Content/Identity/Tasks/managingcompartments.htm#moveRes).
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<ChangeDatabaseToolsPrivateEndpointCompartmentResponse>
            changeDatabaseToolsPrivateEndpointCompartment(
                    ChangeDatabaseToolsPrivateEndpointCompartmentRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    ChangeDatabaseToolsPrivateEndpointCompartmentRequest,
                                    ChangeDatabaseToolsPrivateEndpointCompartmentResponse>
                            handler);

    /**
     * Moves the specified Database Tools SQL Report to a different compartment in the same tenancy.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<ChangeDatabaseToolsSqlReportCompartmentResponse>
            changeDatabaseToolsSqlReportCompartment(
                    ChangeDatabaseToolsSqlReportCompartmentRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    ChangeDatabaseToolsSqlReportCompartmentRequest,
                                    ChangeDatabaseToolsSqlReportCompartmentResponse>
                            handler);

    /**
     * Creates a new Database Tools connection.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<CreateDatabaseToolsConnectionResponse>
            createDatabaseToolsConnection(
                    CreateDatabaseToolsConnectionRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    CreateDatabaseToolsConnectionRequest,
                                    CreateDatabaseToolsConnectionResponse>
                            handler);

    /**
     * Creates a new Database Tools database API gateway config.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<CreateDatabaseToolsDatabaseApiGatewayConfigResponse>
            createDatabaseToolsDatabaseApiGatewayConfig(
                    CreateDatabaseToolsDatabaseApiGatewayConfigRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    CreateDatabaseToolsDatabaseApiGatewayConfigRequest,
                                    CreateDatabaseToolsDatabaseApiGatewayConfigResponse>
                            handler);

    /**
     * Creates a new Database Tools identity.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<CreateDatabaseToolsIdentityResponse> createDatabaseToolsIdentity(
            CreateDatabaseToolsIdentityRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            CreateDatabaseToolsIdentityRequest, CreateDatabaseToolsIdentityResponse>
                    handler);

    /**
     * Creates a new Database Tools MCP server.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<CreateDatabaseToolsMcpServerResponse> createDatabaseToolsMcpServer(
            CreateDatabaseToolsMcpServerRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            CreateDatabaseToolsMcpServerRequest,
                            CreateDatabaseToolsMcpServerResponse>
                    handler);

    /**
     * Creates a new Database Tools MCP Toolset.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<CreateDatabaseToolsMcpToolsetResponse>
            createDatabaseToolsMcpToolset(
                    CreateDatabaseToolsMcpToolsetRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    CreateDatabaseToolsMcpToolsetRequest,
                                    CreateDatabaseToolsMcpToolsetResponse>
                            handler);

    /**
     * Creates a new Database Tools private endpoint.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<CreateDatabaseToolsPrivateEndpointResponse>
            createDatabaseToolsPrivateEndpoint(
                    CreateDatabaseToolsPrivateEndpointRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    CreateDatabaseToolsPrivateEndpointRequest,
                                    CreateDatabaseToolsPrivateEndpointResponse>
                            handler);

    /**
     * Creates a new Database Tools  Sql Report.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<CreateDatabaseToolsSqlReportResponse> createDatabaseToolsSqlReport(
            CreateDatabaseToolsSqlReportRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            CreateDatabaseToolsSqlReportRequest,
                            CreateDatabaseToolsSqlReportResponse>
                    handler);

    /**
     * Deletes the specified Database Tools connection resource.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<DeleteDatabaseToolsConnectionResponse>
            deleteDatabaseToolsConnection(
                    DeleteDatabaseToolsConnectionRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    DeleteDatabaseToolsConnectionRequest,
                                    DeleteDatabaseToolsConnectionResponse>
                            handler);

    /**
     * Deletes the specified Database Tools database API gateway config resource.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<DeleteDatabaseToolsDatabaseApiGatewayConfigResponse>
            deleteDatabaseToolsDatabaseApiGatewayConfig(
                    DeleteDatabaseToolsDatabaseApiGatewayConfigRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    DeleteDatabaseToolsDatabaseApiGatewayConfigRequest,
                                    DeleteDatabaseToolsDatabaseApiGatewayConfigResponse>
                            handler);

    /**
     * Deletes the specified Database Tools identity resource.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<DeleteDatabaseToolsIdentityResponse> deleteDatabaseToolsIdentity(
            DeleteDatabaseToolsIdentityRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            DeleteDatabaseToolsIdentityRequest, DeleteDatabaseToolsIdentityResponse>
                    handler);

    /**
     * Deletes the specified Database Tools MCP server resource.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<DeleteDatabaseToolsMcpServerResponse> deleteDatabaseToolsMcpServer(
            DeleteDatabaseToolsMcpServerRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            DeleteDatabaseToolsMcpServerRequest,
                            DeleteDatabaseToolsMcpServerResponse>
                    handler);

    /**
     * Deletes the specified Database Tools MCP Toolset resource.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<DeleteDatabaseToolsMcpToolsetResponse>
            deleteDatabaseToolsMcpToolset(
                    DeleteDatabaseToolsMcpToolsetRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    DeleteDatabaseToolsMcpToolsetRequest,
                                    DeleteDatabaseToolsMcpToolsetResponse>
                            handler);

    /**
     * Deletes the specified Database Tools private endpoint.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<DeleteDatabaseToolsPrivateEndpointResponse>
            deleteDatabaseToolsPrivateEndpoint(
                    DeleteDatabaseToolsPrivateEndpointRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    DeleteDatabaseToolsPrivateEndpointRequest,
                                    DeleteDatabaseToolsPrivateEndpointResponse>
                            handler);

    /**
     * Deletes the specified Database Tools SQL Report resource.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<DeleteDatabaseToolsSqlReportResponse> deleteDatabaseToolsSqlReport(
            DeleteDatabaseToolsSqlReportRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            DeleteDatabaseToolsSqlReportRequest,
                            DeleteDatabaseToolsSqlReportResponse>
                    handler);

    /**
     * Gets details of the specified Database Tools connection.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<GetDatabaseToolsConnectionResponse> getDatabaseToolsConnection(
            GetDatabaseToolsConnectionRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            GetDatabaseToolsConnectionRequest, GetDatabaseToolsConnectionResponse>
                    handler);

    /**
     * Gets details of the specified Database Tools database API gateway config.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<GetDatabaseToolsDatabaseApiGatewayConfigResponse>
            getDatabaseToolsDatabaseApiGatewayConfig(
                    GetDatabaseToolsDatabaseApiGatewayConfigRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    GetDatabaseToolsDatabaseApiGatewayConfigRequest,
                                    GetDatabaseToolsDatabaseApiGatewayConfigResponse>
                            handler);

    /**
     * Gets details for the specified Database Tools endpoint service.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<GetDatabaseToolsEndpointServiceResponse>
            getDatabaseToolsEndpointService(
                    GetDatabaseToolsEndpointServiceRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    GetDatabaseToolsEndpointServiceRequest,
                                    GetDatabaseToolsEndpointServiceResponse>
                            handler);

    /**
     * Gets details of the specified Database Tools identity.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<GetDatabaseToolsIdentityResponse> getDatabaseToolsIdentity(
            GetDatabaseToolsIdentityRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            GetDatabaseToolsIdentityRequest, GetDatabaseToolsIdentityResponse>
                    handler);

    /**
     * Gets details of the specified Database Tools MCP server.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<GetDatabaseToolsMcpServerResponse> getDatabaseToolsMcpServer(
            GetDatabaseToolsMcpServerRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            GetDatabaseToolsMcpServerRequest, GetDatabaseToolsMcpServerResponse>
                    handler);

    /**
     * Gets details of the specified Database Tools MCP Toolset.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<GetDatabaseToolsMcpToolsetResponse> getDatabaseToolsMcpToolset(
            GetDatabaseToolsMcpToolsetRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            GetDatabaseToolsMcpToolsetRequest, GetDatabaseToolsMcpToolsetResponse>
                    handler);

    /**
     * Gets details of a specified Database Tools private endpoint.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<GetDatabaseToolsPrivateEndpointResponse>
            getDatabaseToolsPrivateEndpoint(
                    GetDatabaseToolsPrivateEndpointRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    GetDatabaseToolsPrivateEndpointRequest,
                                    GetDatabaseToolsPrivateEndpointResponse>
                            handler);

    /**
     * Gets details of the specified Database Tools SQL report.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<GetDatabaseToolsSqlReportResponse> getDatabaseToolsSqlReport(
            GetDatabaseToolsSqlReportRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            GetDatabaseToolsSqlReportRequest, GetDatabaseToolsSqlReportResponse>
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
     * Returns a list of Database Tools connections.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<ListDatabaseToolsConnectionsResponse> listDatabaseToolsConnections(
            ListDatabaseToolsConnectionsRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            ListDatabaseToolsConnectionsRequest,
                            ListDatabaseToolsConnectionsResponse>
                    handler);

    /**
     * Returns a list of Database Tools database API gateway configs.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<ListDatabaseToolsDatabaseApiGatewayConfigsResponse>
            listDatabaseToolsDatabaseApiGatewayConfigs(
                    ListDatabaseToolsDatabaseApiGatewayConfigsRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    ListDatabaseToolsDatabaseApiGatewayConfigsRequest,
                                    ListDatabaseToolsDatabaseApiGatewayConfigsResponse>
                            handler);

    /**
     * Returns a list of Database Tools endpoint services.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<ListDatabaseToolsEndpointServicesResponse>
            listDatabaseToolsEndpointServices(
                    ListDatabaseToolsEndpointServicesRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    ListDatabaseToolsEndpointServicesRequest,
                                    ListDatabaseToolsEndpointServicesResponse>
                            handler);

    /**
     * Returns a list of Database Tools identities.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<ListDatabaseToolsIdentitiesResponse> listDatabaseToolsIdentities(
            ListDatabaseToolsIdentitiesRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            ListDatabaseToolsIdentitiesRequest, ListDatabaseToolsIdentitiesResponse>
                    handler);

    /**
     * Returns a list of Database Tools MCP servers.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<ListDatabaseToolsMcpServersResponse> listDatabaseToolsMcpServers(
            ListDatabaseToolsMcpServersRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            ListDatabaseToolsMcpServersRequest, ListDatabaseToolsMcpServersResponse>
                    handler);

    /**
     * Returns a list of Database Tools Toolset versions
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<ListDatabaseToolsMcpToolsetVersionsResponse>
            listDatabaseToolsMcpToolsetVersions(
                    ListDatabaseToolsMcpToolsetVersionsRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    ListDatabaseToolsMcpToolsetVersionsRequest,
                                    ListDatabaseToolsMcpToolsetVersionsResponse>
                            handler);

    /**
     * Returns a list of Database Tools Toolsets.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<ListDatabaseToolsMcpToolsetsResponse> listDatabaseToolsMcpToolsets(
            ListDatabaseToolsMcpToolsetsRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            ListDatabaseToolsMcpToolsetsRequest,
                            ListDatabaseToolsMcpToolsetsResponse>
                    handler);

    /**
     * Returns a list of Database Tools private endpoints.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<ListDatabaseToolsPrivateEndpointsResponse>
            listDatabaseToolsPrivateEndpoints(
                    ListDatabaseToolsPrivateEndpointsRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    ListDatabaseToolsPrivateEndpointsRequest,
                                    ListDatabaseToolsPrivateEndpointsResponse>
                            handler);

    /**
     * Returns a list of Database Tools SQL reports.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<ListDatabaseToolsSqlReportsResponse> listDatabaseToolsSqlReports(
            ListDatabaseToolsSqlReportsRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            ListDatabaseToolsSqlReportsRequest, ListDatabaseToolsSqlReportsResponse>
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
     * Refresh Database Tools identity credential.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<RefreshDatabaseToolsIdentityCredentialResponse>
            refreshDatabaseToolsIdentityCredential(
                    RefreshDatabaseToolsIdentityCredentialRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    RefreshDatabaseToolsIdentityCredentialRequest,
                                    RefreshDatabaseToolsIdentityCredentialResponse>
                            handler);

    /**
     * Removes a lock from a DatabaseToolsConnection resource.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<RemoveDatabaseToolsConnectionLockResponse>
            removeDatabaseToolsConnectionLock(
                    RemoveDatabaseToolsConnectionLockRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    RemoveDatabaseToolsConnectionLockRequest,
                                    RemoveDatabaseToolsConnectionLockResponse>
                            handler);

    /**
     * Removes a lock from a DatabaseToolsDatabaseApiGatewayConfig resource.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<RemoveDatabaseToolsDatabaseApiGatewayConfigLockResponse>
            removeDatabaseToolsDatabaseApiGatewayConfigLock(
                    RemoveDatabaseToolsDatabaseApiGatewayConfigLockRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    RemoveDatabaseToolsDatabaseApiGatewayConfigLockRequest,
                                    RemoveDatabaseToolsDatabaseApiGatewayConfigLockResponse>
                            handler);

    /**
     * Removes a lock from a DatabaseToolsIdentity resource.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<RemoveDatabaseToolsIdentityLockResponse>
            removeDatabaseToolsIdentityLock(
                    RemoveDatabaseToolsIdentityLockRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    RemoveDatabaseToolsIdentityLockRequest,
                                    RemoveDatabaseToolsIdentityLockResponse>
                            handler);

    /**
     * Removes a lock from a DatabaseToolsMcpServer resource.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<RemoveDatabaseToolsMcpServerLockResponse>
            removeDatabaseToolsMcpServerLock(
                    RemoveDatabaseToolsMcpServerLockRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    RemoveDatabaseToolsMcpServerLockRequest,
                                    RemoveDatabaseToolsMcpServerLockResponse>
                            handler);

    /**
     * Removes a lock from a DatabaseToolsMcpToolset resource.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<RemoveDatabaseToolsMcpToolsetLockResponse>
            removeDatabaseToolsMcpToolsetLock(
                    RemoveDatabaseToolsMcpToolsetLockRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    RemoveDatabaseToolsMcpToolsetLockRequest,
                                    RemoveDatabaseToolsMcpToolsetLockResponse>
                            handler);

    /**
     * Removes a lock from a DatabaseToolsPrivateEndpoint resource.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<RemoveDatabaseToolsPrivateEndpointLockResponse>
            removeDatabaseToolsPrivateEndpointLock(
                    RemoveDatabaseToolsPrivateEndpointLockRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    RemoveDatabaseToolsPrivateEndpointLockRequest,
                                    RemoveDatabaseToolsPrivateEndpointLockResponse>
                            handler);

    /**
     * Removes a lock from a DatabaseToolsSqlReport resource.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<RemoveDatabaseToolsSqlReportLockResponse>
            removeDatabaseToolsSqlReportLock(
                    RemoveDatabaseToolsSqlReportLockRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    RemoveDatabaseToolsSqlReportLockRequest,
                                    RemoveDatabaseToolsSqlReportLockResponse>
                            handler);

    /**
     * Updates the specified Database Tools connection.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<UpdateDatabaseToolsConnectionResponse>
            updateDatabaseToolsConnection(
                    UpdateDatabaseToolsConnectionRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    UpdateDatabaseToolsConnectionRequest,
                                    UpdateDatabaseToolsConnectionResponse>
                            handler);

    /**
     * Updates the specified Database Tools database API gateway config.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<UpdateDatabaseToolsDatabaseApiGatewayConfigResponse>
            updateDatabaseToolsDatabaseApiGatewayConfig(
                    UpdateDatabaseToolsDatabaseApiGatewayConfigRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    UpdateDatabaseToolsDatabaseApiGatewayConfigRequest,
                                    UpdateDatabaseToolsDatabaseApiGatewayConfigResponse>
                            handler);

    /**
     * Updates the specified Database Tools identity.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<UpdateDatabaseToolsIdentityResponse> updateDatabaseToolsIdentity(
            UpdateDatabaseToolsIdentityRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            UpdateDatabaseToolsIdentityRequest, UpdateDatabaseToolsIdentityResponse>
                    handler);

    /**
     * Updates the specified Database Tools MCP server.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<UpdateDatabaseToolsMcpServerResponse> updateDatabaseToolsMcpServer(
            UpdateDatabaseToolsMcpServerRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            UpdateDatabaseToolsMcpServerRequest,
                            UpdateDatabaseToolsMcpServerResponse>
                    handler);

    /**
     * Updates the specified Database Tools MCP Toolset.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<UpdateDatabaseToolsMcpToolsetResponse>
            updateDatabaseToolsMcpToolset(
                    UpdateDatabaseToolsMcpToolsetRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    UpdateDatabaseToolsMcpToolsetRequest,
                                    UpdateDatabaseToolsMcpToolsetResponse>
                            handler);

    /**
     * Updates the specified Database Tools private endpoint.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<UpdateDatabaseToolsPrivateEndpointResponse>
            updateDatabaseToolsPrivateEndpoint(
                    UpdateDatabaseToolsPrivateEndpointRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    UpdateDatabaseToolsPrivateEndpointRequest,
                                    UpdateDatabaseToolsPrivateEndpointResponse>
                            handler);

    /**
     * Updates the specified Database Tools SQL Report.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<UpdateDatabaseToolsSqlReportResponse> updateDatabaseToolsSqlReport(
            UpdateDatabaseToolsSqlReportRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            UpdateDatabaseToolsSqlReportRequest,
                            UpdateDatabaseToolsSqlReportResponse>
                    handler);

    /**
     * Validates the Database Tools connection details by establishing a connection to the database.
     *
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
