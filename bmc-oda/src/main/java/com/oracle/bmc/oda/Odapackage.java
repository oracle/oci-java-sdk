/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.oda;

import com.oracle.bmc.oda.requests.*;
import com.oracle.bmc.oda.responses.*;

/**
 * API to create and maintain Oracle Digital Assistant service instances.
 * This service client uses CircuitBreakerUtils.DEFAULT_CIRCUIT_BREAKER for all the operations by default if no circuit breaker configuration is defined by the user.
 */
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20190506")
public interface Odapackage extends AutoCloseable {

    /**
     * Rebuilds the client from scratch.
     * Useful to refresh certificates.
     */
    void refreshClient();

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
     * Determines whether realm specific endpoint should be used or not.
     * Set realmSpecificEndpointTemplateEnabled to "true" if the user wants to enable use of realm specific endpoint template, otherwise set it to "false"
     * @param realmSpecificEndpointTemplateEnabled flag to enable the use of realm specific endpoint template
     */
    void useRealmSpecificEndpointTemplate(boolean realmSpecificEndpointTemplateEnabled);

    /**
     * Starts an asynchronous job to import a package into a Digital Assistant instance.
     * <p>
     * To monitor the status of the job, take the `opc-work-request-id` response
     * header value and use it to call `GET /workRequests/{workRequestId}`.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation uses RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is provided.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/oda/CreateImportedPackageExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use CreateImportedPackage API.
     */
    CreateImportedPackageResponse createImportedPackage(CreateImportedPackageRequest request);

    /**
     * Starts an asynchronous job to delete a package from a Digital Assistant instance.
     * <p>
     * To monitor the status of the job, take the `opc-work-request-id` response
     * header value and use it to call `GET /workRequests/{workRequestId}`.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation uses RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is provided.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/oda/DeleteImportedPackageExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use DeleteImportedPackage API.
     */
    DeleteImportedPackageResponse deleteImportedPackage(DeleteImportedPackageRequest request);

    /**
     * Returns a list of summaries for imported packages in the instance.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation uses RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is provided.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/oda/GetImportedPackageExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use GetImportedPackage API.
     */
    GetImportedPackageResponse getImportedPackage(GetImportedPackageRequest request);

    /**
     * Returns details about a package, and how to import it.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation uses RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is provided.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/oda/GetPackageExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use GetPackage API.
     */
    GetPackageResponse getPackage(GetPackageRequest request);

    /**
     * Returns a list of summaries for imported packages in the instance.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation uses RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is provided.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/oda/ListImportedPackagesExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use ListImportedPackages API.
     */
    ListImportedPackagesResponse listImportedPackages(ListImportedPackagesRequest request);

    /**
     * Returns a page of summaries for packages that are available for import. The optional odaInstanceId query
     * parameter can be used to filter packages that are available for import by a specific instance. If odaInstanceId
     * query parameter is not provided, the returned list will
     * include packages available within the region indicated by the request URL. The optional resourceType query
     * param may be specified to filter packages that contain the indicated resource type. If no resourceType query
     * param is given, packages containing all resource types will be returned. The optional name query parameter can
     * be used to limit the list to packages whose name matches the given name. The optional displayName query
     * parameter can be used to limit the list to packages whose displayName matches the given name. The optional
     * isLatestVersionOnly query parameter can be used to limit the returned list to include only the latest version
     * of any given package. If not specified, all versions of any otherwise matching package will be returned.
     * <p>
     * If the `opc-next-page` header appears in the response, then
     * there are more items to retrieve. To get the next page in the subsequent
     * GET request, include the header's value as the `page` query parameter.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation uses RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is provided.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/oda/ListPackagesExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use ListPackages API.
     */
    ListPackagesResponse listPackages(ListPackagesRequest request);

    /**
     * Starts an asynchronous job to update a package within a Digital Assistant instance.
     * <p>
     * To monitor the status of the job, take the `opc-work-request-id` response
     * header value and use it to call `GET /workRequests/{workRequestId}`.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation uses RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is provided.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/oda/UpdateImportedPackageExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use UpdateImportedPackage API.
     */
    UpdateImportedPackageResponse updateImportedPackage(UpdateImportedPackageRequest request);

    /**
     * Gets the pre-configured paginators available for list operations in this service which may return multiple
     * pages of data. These paginators provide an {@link java.lang.Iterable} interface so that service responses, or
     * resources/records, can be iterated through without having to manually deal with pagination and page tokens.
     *
     * @return The service paginators.
     */
    OdapackagePaginators getPaginators();
}
