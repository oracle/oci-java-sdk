/**
 * Copyright (c) 2016, 2020, Oracle and/or its affiliates. All rights reserved.
 */
package com.oracle.bmc.limits;

import com.oracle.bmc.limits.requests.*;
import com.oracle.bmc.limits.responses.*;

@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: ")
public interface Limits extends AutoCloseable {

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
     * For a given compartmentId, resource limit name, and scope, returns the following:
     *   - the number of available resources associated with the given limit
     *   - the usage in the selected compartment for the given limit
     *   Note: not all resource limits support this API. If the value is not available, the API will return 404.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    GetResourceAvailabilityResponse getResourceAvailability(GetResourceAvailabilityRequest request);

    /**
     * Includes a list of resource limits that are currently supported.
     * If the 'areQuotasSupported' property is true, you can create quota policies on top of this limit at the
     * compartment level.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    ListLimitDefinitionsResponse listLimitDefinitions(ListLimitDefinitionsRequest request);

    /**
     * Includes a full list of resource limits belonging to a given service.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    ListLimitValuesResponse listLimitValues(ListLimitValuesRequest request);

    /**
     * Returns the list of supported services.
     * This will include the programmatic service name, along with the friendly service name.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    ListServicesResponse listServices(ListServicesRequest request);

    /**
     * Gets the pre-configured paginators available for list operations in this service which may return multiple
     * pages of data. These paginators provide an {@link java.lang.Iterable} interface so that service responses, or
     * resources/records, can be iterated through without having to manually deal with pagination and page tokens.
     *
     * @return The service paginators.
     */
    LimitsPaginators getPaginators();
}
