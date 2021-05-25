/**
 * Copyright (c) 2016, 2021, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.secrets;

import com.oracle.bmc.secrets.requests.*;
import com.oracle.bmc.secrets.responses.*;

/**
 * API for retrieving secrets from vaults.
 */
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20190301")
public interface Secrets extends AutoCloseable {

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
     * Gets a secret bundle that matches either the specified `stage`, `secretVersionName`, or `versionNumber` parameter.
     * If none of these parameters are provided, the bundle for the secret version marked as `CURRENT` will be returned.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/secrets/GetSecretBundleExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use GetSecretBundle API.
     */
    GetSecretBundleResponse getSecretBundle(GetSecretBundleRequest request);

    /**
     * Gets a secret bundle by secret name and vault ID, and secret version that matches either the specified `stage`, `secretVersionName`, or `versionNumber` parameter.
     * If none of these parameters are provided, the bundle for the secret version marked as `CURRENT` is returned.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/secrets/GetSecretBundleByNameExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use GetSecretBundleByName API.
     */
    GetSecretBundleByNameResponse getSecretBundleByName(GetSecretBundleByNameRequest request);

    /**
     * Lists all secret bundle versions for the specified secret.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/secrets/ListSecretBundleVersionsExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use ListSecretBundleVersions API.
     */
    ListSecretBundleVersionsResponse listSecretBundleVersions(
            ListSecretBundleVersionsRequest request);

    /**
     * Gets the pre-configured paginators available for list operations in this service which may return multiple
     * pages of data. These paginators provide an {@link java.lang.Iterable} interface so that service responses, or
     * resources/records, can be iterated through without having to manually deal with pagination and page tokens.
     *
     * @return The service paginators.
     */
    SecretsPaginators getPaginators();
}
