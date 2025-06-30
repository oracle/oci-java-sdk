/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.dbmulticloud;

import com.oracle.bmc.dbmulticloud.requests.*;
import com.oracle.bmc.dbmulticloud.responses.*;

/**
 * 1. Oracle Azure Connector Resource: This is for installing Azure Arc Server in ExaCS VM Cluster.
 * There are two way to install Azure Arc Server (Azure Identity) in ExaCS VMCluster. a. Using
 * Bearer Access Token or b. By providing Authentication token
 *
 * <p>2. Oracle Azure Blob Container Resource: This is for to capture Azure Container details and
 * same will be used in multiple ExaCS VMCluster to mount the Azure Container.
 *
 * <p>3. Oracle Azure Blob Mount Resource: This is for to mount Azure Container in ExaCS VMCluster
 * using Oracle Azure Connector and Oracle Azure Blob Container Resource.
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20240501")
public interface OracleDBAzureConnectorAsync extends AutoCloseable {

    /** Rebuilds the client from scratch. Useful to refresh certificates. */
    void refreshClient();

    /**
     * Sets the endpoint to call (ex, https://www.example.com).
     *
     * @param endpoint The endpoint of the serice.
     */
    void setEndpoint(String endpoint);

    /** Gets the set endpoint for REST call (ex, https://www.example.com) */
    String getEndpoint();

    /**
     * Sets the region to call (ex, Region.US_PHOENIX_1).
     *
     * <p>Note, this will call {@link #setEndpoint(String) setEndpoint} after resolving the
     * endpoint. If the service is not available in this region, however, an
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
     * Moves the Oracle DB Azure Connector Resource into a different compartment. When provided,
     * 'If-Match' is checked against 'ETag' values of the resource.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<ChangeOracleDbAzureConnectorCompartmentResponse>
            changeOracleDbAzureConnectorCompartment(
                    ChangeOracleDbAzureConnectorCompartmentRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    ChangeOracleDbAzureConnectorCompartmentRequest,
                                    ChangeOracleDbAzureConnectorCompartmentResponse>
                            handler);

    /**
     * Creates Oracle DB Azure Connector Resource and configured Azure Identity in OCI Database
     * Resource.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<CreateOracleDbAzureConnectorResponse> createOracleDbAzureConnector(
            CreateOracleDbAzureConnectorRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            CreateOracleDbAzureConnectorRequest,
                            CreateOracleDbAzureConnectorResponse>
                    handler);

    /**
     * Delete Oracle DB Azure Connector Resource and delete Azure Arc Identity too from Database
     * Resource.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<DeleteOracleDbAzureConnectorResponse> deleteOracleDbAzureConnector(
            DeleteOracleDbAzureConnectorRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            DeleteOracleDbAzureConnectorRequest,
                            DeleteOracleDbAzureConnectorResponse>
                    handler);

    /**
     * Get Oracle DB Azure Connector Resource form a particular Resource ID.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<GetOracleDbAzureConnectorResponse> getOracleDbAzureConnector(
            GetOracleDbAzureConnectorRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            GetOracleDbAzureConnectorRequest, GetOracleDbAzureConnectorResponse>
                    handler);

    /**
     * Lists the all Oracle DB Azure Connector Resource based on filters.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<ListOracleDbAzureConnectorsResponse> listOracleDbAzureConnectors(
            ListOracleDbAzureConnectorsRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            ListOracleDbAzureConnectorsRequest, ListOracleDbAzureConnectorsResponse>
                    handler);

    /**
     * Patch Azure Arc Agent on VM Cluster with new version.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<PatchOracleDbAzureConnectorResponse> patchOracleDbAzureConnector(
            PatchOracleDbAzureConnectorRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            PatchOracleDbAzureConnectorRequest, PatchOracleDbAzureConnectorResponse>
                    handler);

    /**
     * Modifies the existing Oracle DB Azure Connector Resource for a given ID.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<UpdateOracleDbAzureConnectorResponse> updateOracleDbAzureConnector(
            UpdateOracleDbAzureConnectorRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            UpdateOracleDbAzureConnectorRequest,
                            UpdateOracleDbAzureConnectorResponse>
                    handler);
}
