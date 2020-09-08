/**
 * Copyright (c) 2016, 2020, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.sch;

import com.oracle.bmc.sch.requests.*;
import com.oracle.bmc.sch.responses.*;

/**
 * Use the Service Connector Hub API to transfer data between services in Oracle Cloud Infrastructure.
 * For more information about Service Connector Hub, see
 * [Service Connector Hub Overview](https://docs.cloud.oracle.com/iaas/service-connector-hub/using/index.htm).
 *
 */
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200909")
public interface ServiceConnector extends AutoCloseable {

    /**
     * Sets the endpoint to call (ex, https://www.example.com).
     * @param endpoint The endpoint of the service.
     */
    void setEndpoint(String endpoint);

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
     * Activates the specified service connector.
     * <p>
     * After you send your request, the service connector's state is temporarily
     * UPDATING. When the state changes to ACTIVE, data begins transferring from the
     * source service to the target service. For instructions on deactivating and
     * activating service connectors, see
     * [To activate or deactivate a service connector](https://docs.cloud.oracle.com/iaas/service-connector-hub/using/index.htm).
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    ActivateServiceConnectorResponse activateServiceConnector(
            ActivateServiceConnectorRequest request);

    /**
     * Moves a service connector into a different compartment within the same tenancy.
     * For information about moving resources between compartments, see
     * [Moving Resources to a Different Compartment](https://docs.cloud.oracle.com/iaas/Content/Identity/Tasks/managingcompartments.htm#moveRes).
     * <p>
     * When provided, If-Match is checked against ETag values of the resource.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    ChangeServiceConnectorCompartmentResponse changeServiceConnectorCompartment(
            ChangeServiceConnectorCompartmentRequest request);

    /**
     * Creates a new service connector in the specified compartment.
     * A service connector is a logically defined flow for moving data from
     * a source service to a destination service in Oracle Cloud Infrastructure.
     * For general information about service connectors, see
     * [Service Connector Hub Overview](https://docs.cloud.oracle.com/iaas/service-connector-hub/using/index.htm).
     * <p>
     * For purposes of access control, you must provide the
     * [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the compartment where
     * you want the service connector to reside. Notice that the service connector
     * doesn't have to be in the same compartment as the source or target services.
     * For information about access control and compartments, see
     * [Overview of the IAM Service](https://docs.cloud.oracle.com/iaas/Content/Identity/Concepts/overview.htm).
     * <p>
     * After you send your request, the new service connector's state is temporarily
     * CREATING. When the state changes to ACTIVE, data begins transferring from the
     * source service to the target service. For instructions on deactivating and
     * activating service connectors, see
     * [To activate or deactivate a service connector](https://docs.cloud.oracle.com/iaas/service-connector-hub/using/index.htm).
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    CreateServiceConnectorResponse createServiceConnector(CreateServiceConnectorRequest request);

    /**
     * Deactivates the specified service connector.
     * <p>
     * After you send your request, the service connector's state is temporarily
     * UPDATING and any data transfer stops. The state then changes to INACTIVE.
     * For instructions on deactivating and activating service connectors, see
     * [To activate or deactivate a service connector](https://docs.cloud.oracle.com/iaas/service-connector-hub/using/index.htm).
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    DeactivateServiceConnectorResponse deactivateServiceConnector(
            DeactivateServiceConnectorRequest request);

    /**
     * Deletes the specified service connector.
     * <p>
     * After you send your request, the service connector's state is temporarily
     * DELETING and any data transfer stops. The state then changes to DELETED.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    DeleteServiceConnectorResponse deleteServiceConnector(DeleteServiceConnectorRequest request);

    /**
     * Gets the specified service connector's configuration information.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    GetServiceConnectorResponse getServiceConnector(GetServiceConnectorRequest request);

    /**
     * Gets the details of the specified work request.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    GetWorkRequestResponse getWorkRequest(GetWorkRequestRequest request);

    /**
     * Lists service connectors in the specified compartment.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    ListServiceConnectorsResponse listServiceConnectors(ListServiceConnectorsRequest request);

    /**
     * Lists work request errors for the specified work request. Results are paginated.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    ListWorkRequestErrorsResponse listWorkRequestErrors(ListWorkRequestErrorsRequest request);

    /**
     * Lists logs for the specified work request. Results are paginated.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    ListWorkRequestLogsResponse listWorkRequestLogs(ListWorkRequestLogsRequest request);

    /**
     * Lists the work requests in the specified compartment.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    ListWorkRequestsResponse listWorkRequests(ListWorkRequestsRequest request);

    /**
     * Updates the configuration information for the specified service connector.
     * <p>
     * After you send your request, the service connector's state is temporarily
     * UPDATING and any data transfer pauses. The state then changes back to its
     * original value: if ACTIVE, then data transfer resumes.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    UpdateServiceConnectorResponse updateServiceConnector(UpdateServiceConnectorRequest request);

    /**
     * Gets the pre-configured waiters available for resources for this service.
     *
     * @return The service waiters.
     */
    ServiceConnectorWaiters getWaiters();

    /**
     * Gets the pre-configured paginators available for list operations in this service which may return multiple
     * pages of data. These paginators provide an {@link java.lang.Iterable} interface so that service responses, or
     * resources/records, can be iterated through without having to manually deal with pagination and page tokens.
     *
     * @return The service paginators.
     */
    ServiceConnectorPaginators getPaginators();
}
