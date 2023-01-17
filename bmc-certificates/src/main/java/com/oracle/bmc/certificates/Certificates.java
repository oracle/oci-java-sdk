/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.certificates;

import com.oracle.bmc.certificates.requests.*;
import com.oracle.bmc.certificates.responses.*;

/**
 * API for retrieving certificates.
 * This service client uses CircuitBreakerUtils.DEFAULT_CIRCUIT_BREAKER for all the operations by default if no circuit breaker configuration is defined by the user.
 */
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20210224")
public interface Certificates extends AutoCloseable {

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
     * Gets a ca-bundle bundle.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation will not retry by default, users can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to enable retries for it.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/certificates/GetCaBundleExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use GetCaBundle API.
     */
    GetCaBundleResponse getCaBundle(GetCaBundleRequest request);

    /**
     * Gets a certificate authority bundle that matches either the specified `stage`, `name`, or `versionNumber` parameter.
     * If none of these parameters are provided, the bundle for the certificate authority version marked as `CURRENT` will be returned.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation will not retry by default, users can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to enable retries for it.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/certificates/GetCertificateAuthorityBundleExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use GetCertificateAuthorityBundle API.
     */
    GetCertificateAuthorityBundleResponse getCertificateAuthorityBundle(
            GetCertificateAuthorityBundleRequest request);

    /**
     * Gets a certificate bundle that matches either the specified `stage`, `versionName`, or `versionNumber` parameter.
     * If none of these parameters are provided, the bundle for the certificate version marked as `CURRENT` will be returned.
     * <p>
     * By default, the private key is not included in the query result, and a CertificateBundlePublicOnly is returned.
     * If the private key is needed, use the CertificateBundleTypeQueryParam parameter to get a CertificateBundleWithPrivateKey response.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation will not retry by default, users can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to enable retries for it.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/certificates/GetCertificateBundleExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use GetCertificateBundle API.
     */
    GetCertificateBundleResponse getCertificateBundle(GetCertificateBundleRequest request);

    /**
     * Lists all certificate authority bundle versions for the specified certificate authority.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation will not retry by default, users can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to enable retries for it.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/certificates/ListCertificateAuthorityBundleVersionsExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use ListCertificateAuthorityBundleVersions API.
     */
    ListCertificateAuthorityBundleVersionsResponse listCertificateAuthorityBundleVersions(
            ListCertificateAuthorityBundleVersionsRequest request);

    /**
     * Lists all certificate bundle versions for the specified certificate.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation will not retry by default, users can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to enable retries for it.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/certificates/ListCertificateBundleVersionsExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use ListCertificateBundleVersions API.
     */
    ListCertificateBundleVersionsResponse listCertificateBundleVersions(
            ListCertificateBundleVersionsRequest request);
}
