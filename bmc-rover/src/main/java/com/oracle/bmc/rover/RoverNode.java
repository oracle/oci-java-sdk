/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.rover;

import com.oracle.bmc.rover.requests.*;
import com.oracle.bmc.rover.responses.*;

/**
 * A description of the RoverCloudService API. This service client uses
 * CircuitBreakerUtils.DEFAULT_CIRCUIT_BREAKER for all the operations by default if no circuit
 * breaker configuration is defined by the user.
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20201210")
public interface RoverNode extends AutoCloseable {

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
     * Moves a rover node into a different compartment.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation uses
     *     RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is
     *     provided. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/rover/ChangeRoverNodeCompartmentExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use
     *     ChangeRoverNodeCompartment API.
     */
    ChangeRoverNodeCompartmentResponse changeRoverNodeCompartment(
            ChangeRoverNodeCompartmentRequest request);

    /**
     * Creates a new RoverNode.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation uses
     *     RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is
     *     provided. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/rover/CreateRoverNodeExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use CreateRoverNode
     *     API.
     */
    CreateRoverNodeResponse createRoverNode(CreateRoverNodeRequest request);

    /**
     * Deletes a RoverNode resource by identifier
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation uses
     *     RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is
     *     provided. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/rover/DeleteRoverNodeExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use DeleteRoverNode
     *     API.
     */
    DeleteRoverNodeResponse deleteRoverNode(DeleteRoverNodeRequest request);

    /**
     * Gets a RoverNode by identifier.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation uses
     *     RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is
     *     provided. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/rover/GetRoverNodeExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use GetRoverNode API.
     */
    GetRoverNodeResponse getRoverNode(GetRoverNodeRequest request);

    /**
     * Get the certificate for a rover node
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation uses
     *     RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is
     *     provided. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/rover/GetRoverNodeCertificateExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use
     *     GetRoverNodeCertificate API.
     */
    GetRoverNodeCertificateResponse getRoverNodeCertificate(GetRoverNodeCertificateRequest request);

    /**
     * Get the data encryption key for a rover node.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation uses
     *     RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is
     *     provided. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/rover/GetRoverNodeEncryptionKeyExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use
     *     GetRoverNodeEncryptionKey API.
     */
    GetRoverNodeEncryptionKeyResponse getRoverNodeEncryptionKey(
            GetRoverNodeEncryptionKeyRequest request);

    /**
     * Get the resource principal token for a rover node
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation uses
     *     RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is
     *     provided. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/rover/GetRoverNodeGetRptExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use GetRoverNodeGetRpt
     *     API.
     */
    GetRoverNodeGetRptResponse getRoverNodeGetRpt(GetRoverNodeGetRptRequest request);

    /**
     * Returns a list of RoverNodes.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation uses
     *     RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is
     *     provided. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/rover/ListRoverNodesExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use ListRoverNodes API.
     */
    ListRoverNodesResponse listRoverNodes(ListRoverNodesRequest request);

    /**
     * Retrieve Ca Bundle for a rover node
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation uses
     *     RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is
     *     provided. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/rover/RoverNodeActionRetrieveCaBundleExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use
     *     RoverNodeActionRetrieveCaBundle API.
     */
    RoverNodeActionRetrieveCaBundleResponse roverNodeActionRetrieveCaBundle(
            RoverNodeActionRetrieveCaBundleRequest request);

    /**
     * Get the resource principal public key for a rover node
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation uses
     *     RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is
     *     provided. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/rover/RoverNodeActionSetKeyExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use
     *     RoverNodeActionSetKey API.
     */
    RoverNodeActionSetKeyResponse roverNodeActionSetKey(RoverNodeActionSetKeyRequest request);

    /**
     * Request to generate certificate for a roverNode.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation uses
     *     RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is
     *     provided. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/rover/RoverNodeGenerateCertificateExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use
     *     RoverNodeGenerateCertificate API.
     */
    RoverNodeGenerateCertificateResponse roverNodeGenerateCertificate(
            RoverNodeGenerateCertificateRequest request);

    /**
     * Request to renew certificate for a roverNode.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation uses
     *     RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is
     *     provided. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/rover/RoverNodeRenewCertificateExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use
     *     RoverNodeRenewCertificate API.
     */
    RoverNodeRenewCertificateResponse roverNodeRenewCertificate(
            RoverNodeRenewCertificateRequest request);

    /**
     * Request to replace certificate authority for a roverNode.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation uses
     *     RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is
     *     provided. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/rover/RoverNodeReplaceCertificateAuthorityExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use
     *     RoverNodeReplaceCertificateAuthority API.
     */
    RoverNodeReplaceCertificateAuthorityResponse roverNodeReplaceCertificateAuthority(
            RoverNodeReplaceCertificateAuthorityRequest request);

    /**
     * Retrieve the leaf certificate info for a rover node
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation uses
     *     RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is
     *     provided. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/rover/RoverNodeRetrieveLeafCertificateExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use
     *     RoverNodeRetrieveLeafCertificate API.
     */
    RoverNodeRetrieveLeafCertificateResponse roverNodeRetrieveLeafCertificate(
            RoverNodeRetrieveLeafCertificateRequest request);

    /**
     * Updates the RoverNode
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation uses
     *     RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is
     *     provided. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/rover/UpdateRoverNodeExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use UpdateRoverNode
     *     API.
     */
    UpdateRoverNodeResponse updateRoverNode(UpdateRoverNodeRequest request);

    /**
     * Gets the pre-configured waiters available for resources for this service.
     *
     * @return The service waiters.
     */
    RoverNodeWaiters getWaiters();

    /**
     * Gets the pre-configured paginators available for list operations in this service which may
     * return multiple pages of data. These paginators provide an {@link java.lang.Iterable}
     * interface so that service responses, or resources/records, can be iterated through without
     * having to manually deal with pagination and page tokens.
     *
     * @return The service paginators.
     */
    RoverNodePaginators getPaginators();
}
