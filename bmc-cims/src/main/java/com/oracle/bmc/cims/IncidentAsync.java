/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.cims;

import com.oracle.bmc.cims.requests.*;
import com.oracle.bmc.cims.responses.*;

/**
 * Use the Support Management API to manage support requests. For more information, see [Getting
 * Help and Contacting
 * Support](https://docs.cloud.oracle.com/iaas/Content/GSG/Tasks/contactingsupport.htm). *Note**:
 * Before you can create service requests with this API, complete user registration at My Oracle
 * Cloud Support and then ask your tenancy administrator to provide you authorization for the
 * related user groups.
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20181231")
public interface IncidentAsync extends AutoCloseable {

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
     * Creates a support ticket in the specified tenancy. For more information, see [Creating
     * Support
     * Requests](https://docs.cloud.oracle.com/iaas/Content/GSG/support/create-incident.htm).
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<CreateIncidentResponse> createIncident(
            CreateIncidentRequest request,
            com.oracle.bmc.responses.AsyncHandler<CreateIncidentRequest, CreateIncidentResponse>
                    handler);

    /**
     * Gets the specified support ticket. For more information, see [Getting Details for a Support
     * Request](https://docs.cloud.oracle.com/iaas/Content/GSG/support/get-incident.htm).
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<GetIncidentResponse> getIncident(
            GetIncidentRequest request,
            com.oracle.bmc.responses.AsyncHandler<GetIncidentRequest, GetIncidentResponse> handler);

    /**
     * Depending on the selected `productType`, either lists available products (service groups,
     * services, service categories, and subcategories) for technical support tickets or lists
     * limits and current usage for limit increase tickets. This operation is called during creation
     * of technical support and limit increase tickets. For more information about listing products,
     * see [Listing Products for Support
     * Requests](https://docs.cloud.oracle.com/iaas/Content/GSG/support/list-incident-resource-types-taxonomy.htm).
     * For more information about listing limits, see [Listing Limits for Service Limit Increase
     * Requests](https://docs.cloud.oracle.com/iaas/Content/GSG/support/list-incident-resource-types-limit.htm).
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<ListIncidentResourceTypesResponse> listIncidentResourceTypes(
            ListIncidentResourceTypesRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            ListIncidentResourceTypesRequest, ListIncidentResourceTypesResponse>
                    handler);

    /**
     * Lists support tickets for the specified tenancy. For more information, see [Listing Support
     * Requests](https://docs.cloud.oracle.com/iaas/Content/GSG/support/list-incidents.htm).
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<ListIncidentsResponse> listIncidents(
            ListIncidentsRequest request,
            com.oracle.bmc.responses.AsyncHandler<ListIncidentsRequest, ListIncidentsResponse>
                    handler);

    /**
     * Updates the specified support ticket. For more information, see [Updating Support
     * Requests](https://docs.cloud.oracle.com/iaas/Content/GSG/support/update-incident.htm).
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<UpdateIncidentResponse> updateIncident(
            UpdateIncidentRequest request,
            com.oracle.bmc.responses.AsyncHandler<UpdateIncidentRequest, UpdateIncidentResponse>
                    handler);

    /**
     * Checks whether the requested user is valid. For more information, see [Validating a
     * User](https://docs.cloud.oracle.com/iaas/Content/GSG/support/validate-user.htm).
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<ValidateUserResponse> validateUser(
            ValidateUserRequest request,
            com.oracle.bmc.responses.AsyncHandler<ValidateUserRequest, ValidateUserResponse>
                    handler);
}
