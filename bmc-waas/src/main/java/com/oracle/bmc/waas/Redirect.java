/**
 * Copyright (c) 2016, 2019, Oracle and/or its affiliates. All rights reserved.
 */
package com.oracle.bmc.waas;

import com.oracle.bmc.waas.requests.*;
import com.oracle.bmc.waas.responses.*;

@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20181116")
public interface Redirect extends AutoCloseable {

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
     * Moves HTTP Redirect into a different compartment. When provided, If-Match is checked against ETag values of the WAAS policy.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    ChangeHttpRedirectCompartmentResponse changeHttpRedirectCompartment(
            ChangeHttpRedirectCompartmentRequest request);

    /**
     * Creates a new HTTP Redirect on the WAF edge.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    CreateHttpRedirectResponse createHttpRedirect(CreateHttpRedirectRequest request);

    /**
     * Deletes a redirect.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    DeleteHttpRedirectResponse deleteHttpRedirect(DeleteHttpRedirectRequest request);

    /**
     * Gets the details of a HTTP Redirect.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    GetHttpRedirectResponse getHttpRedirect(GetHttpRedirectRequest request);

    /**
     * Gets a list of HTTP Redirects.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    ListHttpRedirectsResponse listHttpRedirects(ListHttpRedirectsRequest request);

    /**
     * Updates the details of a HTTP Redirect, including target and tags. Only the fields specified in the request body will be updated; all other properties will remain unchanged.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    UpdateHttpRedirectResponse updateHttpRedirect(UpdateHttpRedirectRequest request);

    /**
     * Gets the pre-configured waiters available for resources for this service.
     *
     * @return The service waiters.
     */
    RedirectWaiters getWaiters();

    /**
     * Gets the pre-configured paginators available for list operations in this service which may return multiple
     * pages of data. These paginators provide an {@link java.lang.Iterable} interface so that service responses, or
     * resources/records, can be iterated through without having to manually deal with pagination and page tokens.
     *
     * @return The service paginators.
     */
    RedirectPaginators getPaginators();
}
