/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.dbmulticloud;

import com.oracle.bmc.dbmulticloud.requests.*;
import com.oracle.bmc.dbmulticloud.responses.*;

/**
 * <b>Microsoft Azure:</b> <br>
 * <b>Oracle Azure Connector Resource:</b>:&nbsp;&nbsp;The Oracle Azure Connector Resource is used
 * to install the Azure Arc Server on an Exadata VM cluster in Oracle Exadata Database Service on
 * Dedicated Infrastructure (ExaDB-D). The supported method to install the Azure Arc Server (Azure
 * Identity) on the Exadata VM cluster:
 *
 * <ul>
 *   <li>Using a Bearer Access Token
 * </ul>
 *
 * <b>Oracle Azure Blob Container Resource:</b>&nbsp;&nbsp;The Oracle Azure Blob Container Resource
 * is used to capture the details of an Azure Blob Container. This resource can then be reused
 * across multiple Exadata VM clusters in Oracle Exadata Database Service on Dedicated
 * Infrastructure (ExaDB-D) to mount the Azure container.
 *
 * <p><b>Oracle Azure Blob Mount Resource:</b>&nbsp;&nbsp;The Oracle Azure Blob Mount Resource is
 * used to mount an Azure Blob Container on an Exadata VM cluster in Oracle Exadata Database Service
 * on Dedicated Infrastructure (ExaDB-D). It relies on both the Oracle Azure Connector and the
 * Oracle Azure Blob Container Resource to perform the mount operation.
 *
 * <p><b>Discover Azure Vaults and Keys Resource:</b>&nbsp;&nbsp;The Discover Oracle Azure Vaults
 * and Azure Keys Resource is used to discover Azure Vaults and the associated encryption keys
 * available in your Azure project.
 *
 * <p><b>Oracle Azure Vault:</b>&nbsp;&nbsp;The Oracle Azure Vault Resource is used to manage Azure
 * Vaults within Oracle Cloud Infrastructure (OCI) for use with services such as Oracle Exadata
 * Database Service on Dedicated Infrastructure.
 *
 * <p><b>Oracle Azure Key:</b>&nbsp;&nbsp;Oracle Azure Key Resource is used to register and manage a
 * Oracle Azure Key Key within Oracle Cloud Infrastructure (OCI) under an associated Azure Vault.
 * <br>
 * <b>Google Cloud:</b><br>
 * <b>Oracle Google Cloud Connector Resource:</b>&nbsp;&nbsp;The Oracle Google Cloud Connector
 * Resource is used to install the Google Cloud Identity Connector on an Exadata VM cluster in
 * Oracle Exadata Database Service on Dedicated Infrastructure (ExaDB-D).
 *
 * <p><b>Discover Google Key Rings and Keys Resource:</b>&nbsp;&nbsp;The Discover Google Key Rings
 * and Keys Resource is used to discover Google Cloud Key Rings and the associated encryption keys
 * available in your Google Cloud project.
 *
 * <p><b>Google Key Rings Resource:</b>&nbsp;&nbsp;The Google Key Rings Resource is used to register
 * and manage Google Cloud Key Rings within Oracle Cloud Infrastructure (OCI) for use with services
 * such as Oracle Exadata Database Service on Dedicated Infrastructure.
 *
 * <p><b>Google Key Resource:</b>&nbsp;&nbsp;The Google Key Resource is used to register and manage
 * a Google Cloud Key within Oracle Cloud Infrastructure (OCI) under an associated Google Key Ring.
 * <br>
 * <b>AWS</b>:<br>
 * <b>Oracle AWS Connector Resource:</b>&nbsp;&nbsp;The Oracle AWS Connector Resource is used to
 * install the AWS Identity Connector on an Exadata VM cluster in Oracle Exadata Database Service on
 * Dedicated Infrastructure (ExaDB-D).
 *
 * <p><b>Google AWS Key Resource:</b>&nbsp;&nbsp;The Oracle AWS Key Resource is used to register and
 * manage a AWS Key within Oracle Cloud Infrastructure (OCI).
 *
 * <p>This service client uses CircuitBreakerUtils.DEFAULT_CIRCUIT_BREAKER for all the operations by
 * default if no circuit breaker configuration is defined by the user.
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20240501")
public interface DbMulticloudGCPProvider extends AutoCloseable {

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
     * Moves the Oracle DB GCP Identity Connector resource into a different compartment. When
     * provided, 'If-Match' is checked against 'ETag' values of the resource.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation uses
     *     RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is
     *     provided. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/dbmulticloud/ChangeOracleDbGcpIdentityConnectorCompartmentExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use
     *     ChangeOracleDbGcpIdentityConnectorCompartment API.
     */
    ChangeOracleDbGcpIdentityConnectorCompartmentResponse
            changeOracleDbGcpIdentityConnectorCompartment(
                    ChangeOracleDbGcpIdentityConnectorCompartmentRequest request);

    /**
     * Moves the GCP Key Ring resource into a different compartment. When provided, 'If-Match' is
     * checked against 'ETag' values of the resource.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation uses
     *     RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is
     *     provided. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/dbmulticloud/ChangeOracleDbGcpKeyRingCompartmentExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use
     *     ChangeOracleDbGcpKeyRingCompartment API.
     */
    ChangeOracleDbGcpKeyRingCompartmentResponse changeOracleDbGcpKeyRingCompartment(
            ChangeOracleDbGcpKeyRingCompartmentRequest request);

    /**
     * Creates Oracle DB GCP Identity Connector resource.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation uses
     *     RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is
     *     provided. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/dbmulticloud/CreateOracleDbGcpIdentityConnectorExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use
     *     CreateOracleDbGcpIdentityConnector API.
     */
    CreateOracleDbGcpIdentityConnectorResponse createOracleDbGcpIdentityConnector(
            CreateOracleDbGcpIdentityConnectorRequest request);

    /**
     * Creates DB GCP Key Rings based on the provided information and retrieves the associated keys.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation uses
     *     RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is
     *     provided. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/dbmulticloud/CreateOracleDbGcpKeyRingExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use
     *     CreateOracleDbGcpKeyRing API.
     */
    CreateOracleDbGcpKeyRingResponse createOracleDbGcpKeyRing(
            CreateOracleDbGcpKeyRingRequest request);

    /**
     * Deletes the Oracle DB GCP Identity Connector resource and removes the associated connector
     * from the database resource.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation uses
     *     RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is
     *     provided. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/dbmulticloud/DeleteOracleDbGcpIdentityConnectorExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use
     *     DeleteOracleDbGcpIdentityConnector API.
     */
    DeleteOracleDbGcpIdentityConnectorResponse deleteOracleDbGcpIdentityConnector(
            DeleteOracleDbGcpIdentityConnectorRequest request);

    /**
     * Deletes the GCP Key Ring and its associated metadata.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation uses
     *     RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is
     *     provided. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/dbmulticloud/DeleteOracleDbGcpKeyRingExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use
     *     DeleteOracleDbGcpKeyRing API.
     */
    DeleteOracleDbGcpKeyRingResponse deleteOracleDbGcpKeyRing(
            DeleteOracleDbGcpKeyRingRequest request);

    /**
     * Retrieves the Oracle DB GCP Identity Connector for a specified resource
     * [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm).
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation uses
     *     RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is
     *     provided. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/dbmulticloud/GetOracleDbGcpIdentityConnectorExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use
     *     GetOracleDbGcpIdentityConnector API.
     */
    GetOracleDbGcpIdentityConnectorResponse getOracleDbGcpIdentityConnector(
            GetOracleDbGcpIdentityConnectorRequest request);

    /**
     * Retrieves Oracle DB Google Cloud Key details using a specific resource
     * [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm).
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation uses
     *     RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is
     *     provided. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/dbmulticloud/GetOracleDbGcpKeyExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use GetOracleDbGcpKey
     *     API.
     */
    GetOracleDbGcpKeyResponse getOracleDbGcpKey(GetOracleDbGcpKeyRequest request);

    /**
     * Retrieves the Oracle GCP Key Ring details using a specific Container resource
     * [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm).
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation uses
     *     RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is
     *     provided. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/dbmulticloud/GetOracleDbGcpKeyRingExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use
     *     GetOracleDbGcpKeyRing API.
     */
    GetOracleDbGcpKeyRingResponse getOracleDbGcpKeyRing(GetOracleDbGcpKeyRingRequest request);

    /**
     * Lists all Oracle DB GCP Identity Connectors based on the specified filters.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation uses
     *     RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is
     *     provided. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/dbmulticloud/ListOracleDbGcpIdentityConnectorsExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use
     *     ListOracleDbGcpIdentityConnectors API.
     */
    ListOracleDbGcpIdentityConnectorsResponse listOracleDbGcpIdentityConnectors(
            ListOracleDbGcpIdentityConnectorsRequest request);

    /**
     * Lists the all DB GCP Key Rings based on filters.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation uses
     *     RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is
     *     provided. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/dbmulticloud/ListOracleDbGcpKeyRingsExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use
     *     ListOracleDbGcpKeyRings API.
     */
    ListOracleDbGcpKeyRingsResponse listOracleDbGcpKeyRings(ListOracleDbGcpKeyRingsRequest request);

    /**
     * Lists all Oracle DB Google Cloud Keys based on the specified filters.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation uses
     *     RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is
     *     provided. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/dbmulticloud/ListOracleDbGcpKeysExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use ListOracleDbGcpKeys
     *     API.
     */
    ListOracleDbGcpKeysResponse listOracleDbGcpKeys(ListOracleDbGcpKeysRequest request);

    /**
     * Refreshes the Oracle DB GCP Connector resource.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation uses
     *     RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is
     *     provided. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/dbmulticloud/RefreshOracleDbGcpIdentityConnectorExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use
     *     RefreshOracleDbGcpIdentityConnector API.
     */
    RefreshOracleDbGcpIdentityConnectorResponse refreshOracleDbGcpIdentityConnector(
            RefreshOracleDbGcpIdentityConnectorRequest request);

    /**
     * Refreshes Oracle GCP Key Ring details from the backend.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation uses
     *     RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is
     *     provided. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/dbmulticloud/RefreshOracleDbGcpKeyRingExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use
     *     RefreshOracleDbGcpKeyRing API.
     */
    RefreshOracleDbGcpKeyRingResponse refreshOracleDbGcpKeyRing(
            RefreshOracleDbGcpKeyRingRequest request);

    /**
     * Modifies the existing Oracle DB GCP Identity Connector resource for a given
     * [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm).
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation uses
     *     RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is
     *     provided. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/dbmulticloud/UpdateOracleDbGcpIdentityConnectorExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use
     *     UpdateOracleDbGcpIdentityConnector API.
     */
    UpdateOracleDbGcpIdentityConnectorResponse updateOracleDbGcpIdentityConnector(
            UpdateOracleDbGcpIdentityConnectorRequest request);

    /**
     * Modifies the existing Oracle GCP Key Ring Details for a given
     * [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm).
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation uses
     *     RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is
     *     provided. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/dbmulticloud/UpdateOracleDbGcpKeyRingExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use
     *     UpdateOracleDbGcpKeyRing API.
     */
    UpdateOracleDbGcpKeyRingResponse updateOracleDbGcpKeyRing(
            UpdateOracleDbGcpKeyRingRequest request);

    /**
     * Gets the pre-configured waiters available for resources for this service.
     *
     * @return The service waiters.
     */
    DbMulticloudGCPProviderWaiters getWaiters();

    /**
     * Gets the pre-configured paginators available for list operations in this service which may
     * return multiple pages of data. These paginators provide an {@link java.lang.Iterable}
     * interface so that service responses, or resources/records, can be iterated through without
     * having to manually deal with pagination and page tokens.
     *
     * @return The service paginators.
     */
    DbMulticloudGCPProviderPaginators getPaginators();
}
