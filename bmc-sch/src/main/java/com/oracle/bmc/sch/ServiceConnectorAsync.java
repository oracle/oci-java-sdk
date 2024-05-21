/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.sch;

import com.oracle.bmc.sch.requests.*;
import com.oracle.bmc.sch.responses.*;

/**
 * Use the Connector Hub API to transfer data between services in Oracle Cloud Infrastructure.
 * For more information about Connector Hub, see
 * [the Connector Hub documentation](https://docs.cloud.oracle.com/iaas/Content/connector-hub/home.htm).
 * Connector Hub is formerly known as Service Connector Hub.
 *
 */
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200909")
public interface ServiceConnectorAsync extends AutoCloseable {

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
     * Activates the specified connector.
     * <p>
     * After you send your request, the connector's state is temporarily
     * UPDATING. When the state changes to ACTIVE, data begins transferring from the
     * source service to the target service.
     * For more information, see
     * [Activating a Connector](https://docs.cloud.oracle.com/iaas/Content/connector-hub/activate-service-connector.htm).
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<ActivateServiceConnectorResponse> activateServiceConnector(
            ActivateServiceConnectorRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            ActivateServiceConnectorRequest, ActivateServiceConnectorResponse>
                    handler);

    /**
     * Moves a connector into a different compartment within the same tenancy.
     * For more information, see
     * [Moving a Connector](https://docs.cloud.oracle.com/iaas/Content/connector-hub/change-compartment-service-connector.htm).
     * <p>
     * When provided, If-Match is checked against ETag values of the resource.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<ChangeServiceConnectorCompartmentResponse>
            changeServiceConnectorCompartment(
                    ChangeServiceConnectorCompartmentRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    ChangeServiceConnectorCompartmentRequest,
                                    ChangeServiceConnectorCompartmentResponse>
                            handler);

    /**
     * Creates a new connector in the specified compartment.
     * A connector is a logically defined flow for moving data from
     * a source service to a destination service in Oracle Cloud Infrastructure.
     * For more information, see
     * [Creating a Connector](https://docs.cloud.oracle.com/iaas/Content/connector-hub/create-service-connector.htm).
     * For general information about connectors, see
     * [Overview of Connector Hub](https://docs.cloud.oracle.com/iaas/Content/connector-hub/overview.htm).
     * <p>
     * For purposes of access control, you must provide the
     * [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the compartment where
     * you want the connector to reside. Notice that the connector
     * doesn't have to be in the same compartment as the source or target services.
     * For information about access control and compartments, see
     * [Overview of the IAM Service](https://docs.cloud.oracle.com/iaas/Content/Identity/Concepts/overview.htm).
     * <p>
     * After you send your request, the new connector's state is temporarily
     * CREATING. When the state changes to ACTIVE, data begins transferring from the
     * source service to the target service. For instructions on deactivating and
     * activating connectors, see
     * [Activating a Connector](https://docs.cloud.oracle.com/iaas/Content/connector-hub/activate-service-connector.htm).
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<CreateServiceConnectorResponse> createServiceConnector(
            CreateServiceConnectorRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            CreateServiceConnectorRequest, CreateServiceConnectorResponse>
                    handler);

    /**
     * Deactivates the specified connector.
     * <p>
     * After you send your request, the connector's state is temporarily
     * UPDATING and any data transfer stops. The state then changes to INACTIVE.
     * For more information, see
     * [Deactivating a Connector](https://docs.cloud.oracle.com/iaas/Content/connector-hub/deactivate-service-connector.htm).
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<DeactivateServiceConnectorResponse> deactivateServiceConnector(
            DeactivateServiceConnectorRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            DeactivateServiceConnectorRequest, DeactivateServiceConnectorResponse>
                    handler);

    /**
     * Deletes the specified connector.
     * For more information, see
     * [Deleting a Connector](https://docs.cloud.oracle.com/iaas/Content/connector-hub/delete-service-connector.htm).
     * <p>
     * After you send your request, the connector's state is temporarily
     * DELETING and any data transfer stops. The state then changes to DELETED.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<DeleteServiceConnectorResponse> deleteServiceConnector(
            DeleteServiceConnectorRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            DeleteServiceConnectorRequest, DeleteServiceConnectorResponse>
                    handler);

    /**
     * Gets the specified connector's configuration information.
     * For more information, see
     * [Getting a Connector](https://docs.cloud.oracle.com/iaas/Content/connector-hub/get-service-connector.htm).
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<GetServiceConnectorResponse> getServiceConnector(
            GetServiceConnectorRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            GetServiceConnectorRequest, GetServiceConnectorResponse>
                    handler);

    /**
     * Gets the details of the specified work request.
     * For more information, see
     * [Getting a Work Request's Details](https://docs.cloud.oracle.com/iaas/Content/connector-hub/get-work-request.htm).
     *
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
     * Lists connectors in the specified compartment.
     * For more information, see
     * [Listing Connectors](https://docs.cloud.oracle.com/iaas/Content/connector-hub/list-service-connector.htm).
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<ListServiceConnectorsResponse> listServiceConnectors(
            ListServiceConnectorsRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            ListServiceConnectorsRequest, ListServiceConnectorsResponse>
                    handler);

    /**
     * Lists work request errors for the specified work request. Results are paginated.
     * For more information, see
     * [Listing Work Request Errors](https://docs.cloud.oracle.com/iaas/Content/connector-hub/list-work-request-error.htm).
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
     * Lists logs for the specified work request. Results are paginated.
     * For more information, see
     * [Listing Work Request Log Entries](https://docs.cloud.oracle.com/iaas/Content/connector-hub/list-work-request-log-entry.htm).
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
     * Lists the work requests in the specified compartment.
     * For more information, see
     * [Listing Work Requests](https://docs.cloud.oracle.com/iaas/Content/connector-hub/list-work-request.htm).
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
     * Updates the configuration information for the specified connector.
     * For more information, see
     * [Updating a Connector](https://docs.cloud.oracle.com/iaas/Content/connector-hub/update-service-connector.htm).
     * <p>
     * After you send your request, the connector's state is temporarily
     * UPDATING and any data transfer pauses. The state then changes back to its
     * original value: if ACTIVE, then data transfer resumes.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<UpdateServiceConnectorResponse> updateServiceConnector(
            UpdateServiceConnectorRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            UpdateServiceConnectorRequest, UpdateServiceConnectorResponse>
                    handler);
}
