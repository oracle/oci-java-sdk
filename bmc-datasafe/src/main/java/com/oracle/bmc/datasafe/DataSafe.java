/**
 * Copyright (c) 2016, 2021, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.datasafe;

import com.oracle.bmc.datasafe.requests.*;
import com.oracle.bmc.datasafe.responses.*;

/**
 * APIs for using Oracle Data Safe.
 */
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20181201")
public interface DataSafe extends AutoCloseable {

    /**
     * Sets the endpoint to call (ex, https://www.example.com).
     * @param endpoint The endpoint of the service.
     */
    void setEndpoint(String endpoint);

    /**
     * Gets the set endpoint for REST call (ex, https://www.example.com)
     */
    String getEndpoint();

    /**
     * Sets the region to call (ex, Region.US_PHOENIX_1).
     * <p>
     * Note, this will call {@link #setEndpoint(String) setEndpoint} after resolving the endpoint.  If the service is not available in this Region, however, an IllegalArgumentException will be raised.
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
     * Reactivates a previously deactivated Data Safe target database.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/datasafe/ActivateTargetDatabaseExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use ActivateTargetDatabase API.
     */
    ActivateTargetDatabaseResponse activateTargetDatabase(ActivateTargetDatabaseRequest request);

    /**
     * Moves the Data Safe private endpoint and its dependent resources to the specified compartment.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/datasafe/ChangeDataSafePrivateEndpointCompartmentExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use ChangeDataSafePrivateEndpointCompartment API.
     */
    ChangeDataSafePrivateEndpointCompartmentResponse changeDataSafePrivateEndpointCompartment(
            ChangeDataSafePrivateEndpointCompartmentRequest request);

    /**
     * Moves the specified on-premises connector into a different compartment.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/datasafe/ChangeOnPremConnectorCompartmentExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use ChangeOnPremConnectorCompartment API.
     */
    ChangeOnPremConnectorCompartmentResponse changeOnPremConnectorCompartment(
            ChangeOnPremConnectorCompartmentRequest request);

    /**
     * Moves the Data Safe target database to the specified compartment.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/datasafe/ChangeTargetDatabaseCompartmentExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use ChangeTargetDatabaseCompartment API.
     */
    ChangeTargetDatabaseCompartmentResponse changeTargetDatabaseCompartment(
            ChangeTargetDatabaseCompartmentRequest request);

    /**
     * Creates a new Data Safe private endpoint.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/datasafe/CreateDataSafePrivateEndpointExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use CreateDataSafePrivateEndpoint API.
     */
    CreateDataSafePrivateEndpointResponse createDataSafePrivateEndpoint(
            CreateDataSafePrivateEndpointRequest request);

    /**
     * Creates a new on-premises connector.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/datasafe/CreateOnPremConnectorExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use CreateOnPremConnector API.
     */
    CreateOnPremConnectorResponse createOnPremConnector(CreateOnPremConnectorRequest request);

    /**
     * Registers the specified database with Data Safe and creates a Data Safe target database in the Data Safe Console.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/datasafe/CreateTargetDatabaseExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use CreateTargetDatabase API.
     */
    CreateTargetDatabaseResponse createTargetDatabase(CreateTargetDatabaseRequest request);

    /**
     * Deactivates a target database in Data Safe.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/datasafe/DeactivateTargetDatabaseExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use DeactivateTargetDatabase API.
     */
    DeactivateTargetDatabaseResponse deactivateTargetDatabase(
            DeactivateTargetDatabaseRequest request);

    /**
     * Deletes the specified Data Safe private endpoint.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/datasafe/DeleteDataSafePrivateEndpointExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use DeleteDataSafePrivateEndpoint API.
     */
    DeleteDataSafePrivateEndpointResponse deleteDataSafePrivateEndpoint(
            DeleteDataSafePrivateEndpointRequest request);

    /**
     * Deletes the specified on-premises connector.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/datasafe/DeleteOnPremConnectorExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use DeleteOnPremConnector API.
     */
    DeleteOnPremConnectorResponse deleteOnPremConnector(DeleteOnPremConnectorRequest request);

    /**
     * Deregisters the specified database from Data Safe and removes the target database from the Data Safe Console.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/datasafe/DeleteTargetDatabaseExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use DeleteTargetDatabase API.
     */
    DeleteTargetDatabaseResponse deleteTargetDatabase(DeleteTargetDatabaseRequest request);

    /**
     * Downloads the privilege script to grant/revoke required roles from the Data Safe account on the target database.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/datasafe/DownloadPrivilegeScriptExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use DownloadPrivilegeScript API.
     */
    DownloadPrivilegeScriptResponse downloadPrivilegeScript(DownloadPrivilegeScriptRequest request);

    /**
     * Enables Data Safe in the tenancy and region.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/datasafe/EnableDataSafeConfigurationExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use EnableDataSafeConfiguration API.
     */
    EnableDataSafeConfigurationResponse enableDataSafeConfiguration(
            EnableDataSafeConfigurationRequest request);

    /**
     * Creates and downloads the configuration of the specified on-premises connector.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/datasafe/GenerateOnPremConnectorConfigurationExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use GenerateOnPremConnectorConfiguration API.
     */
    GenerateOnPremConnectorConfigurationResponse generateOnPremConnectorConfiguration(
            GenerateOnPremConnectorConfigurationRequest request);

    /**
     * Gets the details of the Data Safe configuration.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/datasafe/GetDataSafeConfigurationExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use GetDataSafeConfiguration API.
     */
    GetDataSafeConfigurationResponse getDataSafeConfiguration(
            GetDataSafeConfigurationRequest request);

    /**
     * Gets the details of the specified Data Safe private endpoint.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/datasafe/GetDataSafePrivateEndpointExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use GetDataSafePrivateEndpoint API.
     */
    GetDataSafePrivateEndpointResponse getDataSafePrivateEndpoint(
            GetDataSafePrivateEndpointRequest request);

    /**
     * Gets the details of the specified on-premises connector.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/datasafe/GetOnPremConnectorExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use GetOnPremConnector API.
     */
    GetOnPremConnectorResponse getOnPremConnector(GetOnPremConnectorRequest request);

    /**
     * Returns the details of the specified Data Safe target database.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/datasafe/GetTargetDatabaseExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use GetTargetDatabase API.
     */
    GetTargetDatabaseResponse getTargetDatabase(GetTargetDatabaseRequest request);

    /**
     * Gets the details of the specified work request.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/datasafe/GetWorkRequestExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use GetWorkRequest API.
     */
    GetWorkRequestResponse getWorkRequest(GetWorkRequestRequest request);

    /**
     * Gets a list of Data Safe private endpoints.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/datasafe/ListDataSafePrivateEndpointsExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use ListDataSafePrivateEndpoints API.
     */
    ListDataSafePrivateEndpointsResponse listDataSafePrivateEndpoints(
            ListDataSafePrivateEndpointsRequest request);

    /**
     * Gets a list of on-premises connectors.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/datasafe/ListOnPremConnectorsExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use ListOnPremConnectors API.
     */
    ListOnPremConnectorsResponse listOnPremConnectors(ListOnPremConnectorsRequest request);

    /**
     * Returns the list of registered target databases in Data Safe.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/datasafe/ListTargetDatabasesExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use ListTargetDatabases API.
     */
    ListTargetDatabasesResponse listTargetDatabases(ListTargetDatabasesRequest request);

    /**
     * Gets a list of errors for the specified work request.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/datasafe/ListWorkRequestErrorsExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use ListWorkRequestErrors API.
     */
    ListWorkRequestErrorsResponse listWorkRequestErrors(ListWorkRequestErrorsRequest request);

    /**
     * Gets a list of log entries for the specified work request.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/datasafe/ListWorkRequestLogsExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use ListWorkRequestLogs API.
     */
    ListWorkRequestLogsResponse listWorkRequestLogs(ListWorkRequestLogsRequest request);

    /**
     * Gets a list of work requests.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/datasafe/ListWorkRequestsExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use ListWorkRequests API.
     */
    ListWorkRequestsResponse listWorkRequests(ListWorkRequestsRequest request);

    /**
     * Updates one or more attributes of the specified Data Safe private endpoint.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/datasafe/UpdateDataSafePrivateEndpointExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use UpdateDataSafePrivateEndpoint API.
     */
    UpdateDataSafePrivateEndpointResponse updateDataSafePrivateEndpoint(
            UpdateDataSafePrivateEndpointRequest request);

    /**
     * Updates one or more attributes of the specified on-premises connector.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/datasafe/UpdateOnPremConnectorExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use UpdateOnPremConnector API.
     */
    UpdateOnPremConnectorResponse updateOnPremConnector(UpdateOnPremConnectorRequest request);

    /**
     * Updates the wallet for the specified on-premises connector to a new version.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/datasafe/UpdateOnPremConnectorWalletExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use UpdateOnPremConnectorWallet API.
     */
    UpdateOnPremConnectorWalletResponse updateOnPremConnectorWallet(
            UpdateOnPremConnectorWalletRequest request);

    /**
     * Updates one or more attributes of the specified Data Safe target database.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/datasafe/UpdateTargetDatabaseExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use UpdateTargetDatabase API.
     */
    UpdateTargetDatabaseResponse updateTargetDatabase(UpdateTargetDatabaseRequest request);

    /**
     * Gets the pre-configured waiters available for resources for this service.
     *
     * @return The service waiters.
     */
    DataSafeWaiters getWaiters();

    /**
     * Gets the pre-configured paginators available for list operations in this service which may return multiple
     * pages of data. These paginators provide an {@link java.lang.Iterable} interface so that service responses, or
     * resources/records, can be iterated through without having to manually deal with pagination and page tokens.
     *
     * @return The service paginators.
     */
    DataSafePaginators getPaginators();
}
