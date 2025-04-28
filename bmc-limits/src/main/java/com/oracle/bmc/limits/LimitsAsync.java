/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.limits;

import com.oracle.bmc.limits.requests.*;
import com.oracle.bmc.limits.responses.*;

/** APIs that interact with the resource limits of a specific resource type. */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20181025")
public interface LimitsAsync extends AutoCloseable {

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
     * For a given compartmentId, resource limit name, and scope, returns the following: * The
     * number of available resources associated with the given limit. * The usage in the selected
     * compartment for the given limit. If Subscription Id is provided, then usage for resource
     * created in that subscription will be returned Note that not all resource limits support this
     * API. If the value is not available, the API returns a 404 response.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<GetResourceAvailabilityResponse> getResourceAvailability(
            GetResourceAvailabilityRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            GetResourceAvailabilityRequest, GetResourceAvailabilityResponse>
                    handler);

    /**
     * Includes a list of resource limits that are currently supported. If subscription Id is
     * provided, then only resource limits supported by subscription will be returned If the
     * 'areQuotasSupported' property is true, you can create quota policies on top of this limit at
     * the compartment level.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<ListLimitDefinitionsResponse> listLimitDefinitions(
            ListLimitDefinitionsRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            ListLimitDefinitionsRequest, ListLimitDefinitionsResponse>
                    handler);

    /**
     * Includes a full list of resource limits belonging to a given service. If subscription Id is
     * provided, limit value for subscription will be returned.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<ListLimitValuesResponse> listLimitValues(
            ListLimitValuesRequest request,
            com.oracle.bmc.responses.AsyncHandler<ListLimitValuesRequest, ListLimitValuesResponse>
                    handler);

    /**
     * Returns the list of supported services. If subscription ID is provided then only services
     * supported by subscription will be returned. This includes the programmatic service name,
     * along with the friendly service name.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<ListServicesResponse> listServices(
            ListServicesRequest request,
            com.oracle.bmc.responses.AsyncHandler<ListServicesRequest, ListServicesResponse>
                    handler);
}
