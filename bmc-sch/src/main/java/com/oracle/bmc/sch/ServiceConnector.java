/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.sch;

import com.oracle.bmc.sch.requests.*;
import com.oracle.bmc.sch.responses.*;

/**
 * Use the Connector Hub API to transfer data between services in Oracle Cloud Infrastructure. For
 * more information about Connector Hub, see [the Connector Hub
 * documentation](https://docs.oracle.com/iaas/Content/connector-hub/home.htm). Connector Hub is
 * formerly known as Service Connector Hub.
 *
 * <p>This service client uses CircuitBreakerUtils.DEFAULT_CIRCUIT_BREAKER for all the operations by
 * default if no circuit breaker configuration is defined by the user.
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200909")
public interface ServiceConnector extends AutoCloseable {

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
     * Activates the specified connector.
     *
     * <p>After you send your request, the connector's state is temporarily UPDATING. When the state
     * changes to ACTIVE, data begins transferring from the source service to the target service.
     * For more information, see [Activating a
     * Connector](https://docs.oracle.com/iaas/Content/connector-hub/activate-service-connector.htm).
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation uses
     *     RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is
     *     provided. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/sch/ActivateServiceConnectorExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use
     *     ActivateServiceConnector API.
     */
    ActivateServiceConnectorResponse activateServiceConnector(
            ActivateServiceConnectorRequest request);

    /**
     * Moves a connector into a different compartment within the same tenancy. For more information,
     * see [Moving a
     * Connector](https://docs.oracle.com/iaas/Content/connector-hub/change-compartment-service-connector.htm).
     *
     * <p>When provided, If-Match is checked against ETag values of the resource.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation uses
     *     RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is
     *     provided. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/sch/ChangeServiceConnectorCompartmentExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use
     *     ChangeServiceConnectorCompartment API.
     */
    ChangeServiceConnectorCompartmentResponse changeServiceConnectorCompartment(
            ChangeServiceConnectorCompartmentRequest request);

    /**
     * Creates a new connector in the specified compartment. A connector is a logically defined flow
     * for moving data from a source service to a destination service in Oracle Cloud
     * Infrastructure. For more information, see [Creating a
     * Connector](https://docs.oracle.com/iaas/Content/connector-hub/create-service-connector.htm).
     * For general information about connectors, see [Overview of Connector
     * Hub](https://docs.oracle.com/iaas/Content/connector-hub/overview.htm).
     *
     * <p>For purposes of access control, you must provide the
     * [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
     * compartment where you want the connector to reside. Notice that the connector doesn't have to
     * be in the same compartment as the source or target services. For information about access
     * control and compartments, see [Overview of the IAM
     * Service](https://docs.oracle.com/iaas/Content/Identity/Concepts/overview.htm).
     *
     * <p>After you send your request, the new connector's state is temporarily CREATING. When the
     * state changes to ACTIVE, data begins transferring from the source service to the target
     * service. For instructions on deactivating and activating connectors, see [Activating a
     * Connector](https://docs.oracle.com/iaas/Content/connector-hub/activate-service-connector.htm).
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation uses
     *     RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is
     *     provided. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/sch/CreateServiceConnectorExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use
     *     CreateServiceConnector API.
     */
    CreateServiceConnectorResponse createServiceConnector(CreateServiceConnectorRequest request);

    /**
     * Deactivates the specified connector.
     *
     * <p>After you send your request, the connector's state is temporarily UPDATING and any data
     * transfer stops. The state then changes to INACTIVE. For more information, see [Deactivating a
     * Connector](https://docs.oracle.com/iaas/Content/connector-hub/deactivate-service-connector.htm).
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation uses
     *     RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is
     *     provided. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/sch/DeactivateServiceConnectorExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use
     *     DeactivateServiceConnector API.
     */
    DeactivateServiceConnectorResponse deactivateServiceConnector(
            DeactivateServiceConnectorRequest request);

    /**
     * Deletes the specified connector. For more information, see [Deleting a
     * Connector](https://docs.oracle.com/iaas/Content/connector-hub/delete-service-connector.htm).
     *
     * <p>After you send your request, the connector's state is temporarily DELETING and any data
     * transfer stops. The state then changes to DELETED.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation uses
     *     RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is
     *     provided. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/sch/DeleteServiceConnectorExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use
     *     DeleteServiceConnector API.
     */
    DeleteServiceConnectorResponse deleteServiceConnector(DeleteServiceConnectorRequest request);

    /**
     * Gets the specified connector's configuration information. For more information, see [Getting
     * a Connector](https://docs.oracle.com/iaas/Content/connector-hub/get-service-connector.htm).
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation uses
     *     RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is
     *     provided. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/sch/GetServiceConnectorExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use GetServiceConnector
     *     API.
     */
    GetServiceConnectorResponse getServiceConnector(GetServiceConnectorRequest request);

    /**
     * Gets the details of the specified work request. For more information, see [Getting a Work
     * Request's Details](https://docs.oracle.com/iaas/Content/connector-hub/get-work-request.htm).
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation uses
     *     RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is
     *     provided. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/sch/GetWorkRequestExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use GetWorkRequest API.
     */
    GetWorkRequestResponse getWorkRequest(GetWorkRequestRequest request);

    /**
     * Lists connectors in the specified compartment. For more information, see [Listing
     * Connectors](https://docs.oracle.com/iaas/Content/connector-hub/list-service-connector.htm).
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation uses
     *     RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is
     *     provided. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/sch/ListServiceConnectorsExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use
     *     ListServiceConnectors API.
     */
    ListServiceConnectorsResponse listServiceConnectors(ListServiceConnectorsRequest request);

    /**
     * Lists work request errors for the specified work request. Results are paginated. For more
     * information, see [Listing Work Request
     * Errors](https://docs.oracle.com/iaas/Content/connector-hub/list-work-request-error.htm).
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation uses
     *     RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is
     *     provided. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/sch/ListWorkRequestErrorsExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use
     *     ListWorkRequestErrors API.
     */
    ListWorkRequestErrorsResponse listWorkRequestErrors(ListWorkRequestErrorsRequest request);

    /**
     * Lists logs for the specified work request. Results are paginated. For more information, see
     * [Listing Work Request Log
     * Entries](https://docs.oracle.com/iaas/Content/connector-hub/list-work-request-log-entry.htm).
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation uses
     *     RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is
     *     provided. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/sch/ListWorkRequestLogsExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use ListWorkRequestLogs
     *     API.
     */
    ListWorkRequestLogsResponse listWorkRequestLogs(ListWorkRequestLogsRequest request);

    /**
     * Lists the work requests in the specified compartment. For more information, see [Listing Work
     * Requests](https://docs.oracle.com/iaas/Content/connector-hub/list-work-request.htm).
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation uses
     *     RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is
     *     provided. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/sch/ListWorkRequestsExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use ListWorkRequests
     *     API.
     */
    ListWorkRequestsResponse listWorkRequests(ListWorkRequestsRequest request);

    /**
     * Updates the configuration information for the specified connector. For more information, see
     * [Updating a
     * Connector](https://docs.oracle.com/iaas/Content/connector-hub/update-service-connector.htm).
     *
     * <p>After you send your request, the connector's state is temporarily UPDATING and any data
     * transfer pauses. The state then changes back to its original value: if ACTIVE, then data
     * transfer resumes.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation uses
     *     RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is
     *     provided. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/sch/UpdateServiceConnectorExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use
     *     UpdateServiceConnector API.
     */
    UpdateServiceConnectorResponse updateServiceConnector(UpdateServiceConnectorRequest request);

    /**
     * Gets the pre-configured waiters available for resources for this service.
     *
     * @return The service waiters.
     */
    ServiceConnectorWaiters getWaiters();

    /**
     * Gets the pre-configured paginators available for list operations in this service which may
     * return multiple pages of data. These paginators provide an {@link java.lang.Iterable}
     * interface so that service responses, or resources/records, can be iterated through without
     * having to manually deal with pagination and page tokens.
     *
     * @return The service paginators.
     */
    ServiceConnectorPaginators getPaginators();
}
