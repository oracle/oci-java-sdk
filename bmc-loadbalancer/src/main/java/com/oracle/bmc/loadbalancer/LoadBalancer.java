/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.loadbalancer;

import com.oracle.bmc.loadbalancer.requests.*;
import com.oracle.bmc.loadbalancer.responses.*;

/**
 * API for the Load Balancing service. Use this API to manage load balancers, backend sets, and related items. For more
 * information, see [Overview of Load Balancing](https://docs.cloud.oracle.com/iaas/Content/Balance/Concepts/balanceoverview.htm).
 *
 * This service client uses CircuitBreakerUtils.DEFAULT_CIRCUIT_BREAKER for all the operations by default if no circuit breaker configuration is defined by the user.
 */
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20170115")
public interface LoadBalancer extends AutoCloseable {

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
     * Moves a load balancer into a different compartment within the same tenancy. For information about moving resources
     * between compartments, see [Moving Resources to a Different Compartment](https://docs.cloud.oracle.com/iaas/Content/Identity/Tasks/managingcompartments.htm#moveRes).
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation will not retry by default, users can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to enable retries for it.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/loadbalancer/ChangeLoadBalancerCompartmentExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use ChangeLoadBalancerCompartment API.
     */
    ChangeLoadBalancerCompartmentResponse changeLoadBalancerCompartment(
            ChangeLoadBalancerCompartmentRequest request);

    /**
     * Adds a backend server to a backend set.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation will not retry by default, users can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to enable retries for it.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/loadbalancer/CreateBackendExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use CreateBackend API.
     */
    CreateBackendResponse createBackend(CreateBackendRequest request);

    /**
     * Adds a backend set to a load balancer.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation will not retry by default, users can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to enable retries for it.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/loadbalancer/CreateBackendSetExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use CreateBackendSet API.
     */
    CreateBackendSetResponse createBackendSet(CreateBackendSetRequest request);

    /**
     * Creates an asynchronous request to add an SSL certificate bundle.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation will not retry by default, users can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to enable retries for it.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/loadbalancer/CreateCertificateExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use CreateCertificate API.
     */
    CreateCertificateResponse createCertificate(CreateCertificateRequest request);

    /**
     * Adds a hostname resource to the specified load balancer. For more information, see
     * [Managing Request Routing](https://docs.cloud.oracle.com/Content/Balance/Tasks/managingrequest.htm).
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation will not retry by default, users can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to enable retries for it.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/loadbalancer/CreateHostnameExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use CreateHostname API.
     */
    CreateHostnameResponse createHostname(CreateHostnameRequest request);

    /**
     * Adds a listener to a load balancer.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation will not retry by default, users can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to enable retries for it.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/loadbalancer/CreateListenerExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use CreateListener API.
     */
    CreateListenerResponse createListener(CreateListenerRequest request);

    /**
     * Creates a new load balancer in the specified compartment. For general information about load balancers,
     * see [Overview of the Load Balancing Service](https://docs.cloud.oracle.com/Content/Balance/Concepts/balanceoverview.htm).
     * <p>
     * For the purposes of access control, you must provide the OCID of the compartment where you want
     * the load balancer to reside. Notice that the load balancer doesn't have to be in the same compartment as the VCN
     * or backend set. If you're not sure which compartment to use, put the load balancer in the same compartment as the VCN.
     * For information about access control and compartments, see
     * [Overview of the IAM Service](https://docs.cloud.oracle.com/Content/Identity/Concepts/overview.htm).
     * <p>
     * You must specify a display name for the load balancer. It does not have to be unique, and you can change it.
     * <p>
     * For information about Availability Domains, see
     * [Regions and Availability Domains](https://docs.cloud.oracle.com/Content/General/Concepts/regions.htm).
     * To get a list of Availability Domains, use the `ListAvailabilityDomains` operation
     * in the Identity and Access Management Service API.
     * <p>
     * All Oracle Cloud Infrastructure resources, including load balancers, get an Oracle-assigned,
     * unique ID called an Oracle Cloud Identifier (OCID). When you create a resource, you can find its OCID
     * in the response. You can also retrieve a resource's OCID by using a List API operation on that resource type,
     * or by viewing the resource in the Console. Fore more information, see
     * [Resource Identifiers](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm).
     * <p>
     * After you send your request, the new object's state will temporarily be PROVISIONING. Before using the
     * object, first make sure its state has changed to RUNNING.
     * <p>
     * When you create a load balancer, the system assigns an IP address.
     * To get the IP address, use the {@link #getLoadBalancer(GetLoadBalancerRequest) getLoadBalancer} operation.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation will not retry by default, users can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to enable retries for it.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/loadbalancer/CreateLoadBalancerExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use CreateLoadBalancer API.
     */
    CreateLoadBalancerResponse createLoadBalancer(CreateLoadBalancerRequest request);

    /**
     * Adds a path route set to a load balancer. For more information, see
     * [Managing Request Routing](https://docs.cloud.oracle.com/Content/Balance/Tasks/managingrequest.htm).
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation will not retry by default, users can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to enable retries for it.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/loadbalancer/CreatePathRouteSetExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use CreatePathRouteSet API.
     */
    CreatePathRouteSetResponse createPathRouteSet(CreatePathRouteSetRequest request);

    /**
     * Adds a routing policy to a load balancer. For more information, see
     * [Managing Request Routing](https://docs.cloud.oracle.com/Content/Balance/Tasks/managingrequest.htm).
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation will not retry by default, users can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to enable retries for it.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/loadbalancer/CreateRoutingPolicyExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use CreateRoutingPolicy API.
     */
    CreateRoutingPolicyResponse createRoutingPolicy(CreateRoutingPolicyRequest request);

    /**
     * Creates a new rule set associated with the specified load balancer. For more information, see
     * [Managing Rule Sets](https://docs.cloud.oracle.com/Content/Balance/Tasks/managingrulesets.htm).
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation will not retry by default, users can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to enable retries for it.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/loadbalancer/CreateRuleSetExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use CreateRuleSet API.
     */
    CreateRuleSetResponse createRuleSet(CreateRuleSetRequest request);

    /**
     * Creates a custom SSL cipher suite.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation will not retry by default, users can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to enable retries for it.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/loadbalancer/CreateSSLCipherSuiteExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use CreateSSLCipherSuite API.
     */
    CreateSSLCipherSuiteResponse createSSLCipherSuite(CreateSSLCipherSuiteRequest request);

    /**
     * Removes a backend server from a given load balancer and backend set.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation will not retry by default, users can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to enable retries for it.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/loadbalancer/DeleteBackendExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use DeleteBackend API.
     */
    DeleteBackendResponse deleteBackend(DeleteBackendRequest request);

    /**
     * Deletes the specified backend set. Note that deleting a backend set removes its backend servers from the load balancer.
     * <p>
     * Before you can delete a backend set, you must remove it from any active listeners.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation will not retry by default, users can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to enable retries for it.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/loadbalancer/DeleteBackendSetExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use DeleteBackendSet API.
     */
    DeleteBackendSetResponse deleteBackendSet(DeleteBackendSetRequest request);

    /**
     * Deletes an SSL certificate bundle from a load balancer.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation will not retry by default, users can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to enable retries for it.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/loadbalancer/DeleteCertificateExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use DeleteCertificate API.
     */
    DeleteCertificateResponse deleteCertificate(DeleteCertificateRequest request);

    /**
     * Deletes a hostname resource from the specified load balancer.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation will not retry by default, users can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to enable retries for it.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/loadbalancer/DeleteHostnameExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use DeleteHostname API.
     */
    DeleteHostnameResponse deleteHostname(DeleteHostnameRequest request);

    /**
     * Deletes a listener from a load balancer.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation will not retry by default, users can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to enable retries for it.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/loadbalancer/DeleteListenerExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use DeleteListener API.
     */
    DeleteListenerResponse deleteListener(DeleteListenerRequest request);

    /**
     * Stops a load balancer and removes it from service.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation will not retry by default, users can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to enable retries for it.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/loadbalancer/DeleteLoadBalancerExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use DeleteLoadBalancer API.
     */
    DeleteLoadBalancerResponse deleteLoadBalancer(DeleteLoadBalancerRequest request);

    /**
     * Deletes a path route set from the specified load balancer.
     * <p>
     * To delete a path route rule from a path route set, use the
     * {@link #updatePathRouteSet(UpdatePathRouteSetRequest) updatePathRouteSet} operation.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation will not retry by default, users can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to enable retries for it.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/loadbalancer/DeletePathRouteSetExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use DeletePathRouteSet API.
     */
    DeletePathRouteSetResponse deletePathRouteSet(DeletePathRouteSetRequest request);

    /**
     * Deletes a routing policy from the specified load balancer.
     * <p>
     * To delete a routing rule from a routing policy, use the
     * {@link #updateRoutingPolicy(UpdateRoutingPolicyRequest) updateRoutingPolicy} operation.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation will not retry by default, users can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to enable retries for it.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/loadbalancer/DeleteRoutingPolicyExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use DeleteRoutingPolicy API.
     */
    DeleteRoutingPolicyResponse deleteRoutingPolicy(DeleteRoutingPolicyRequest request);

    /**
     * Deletes a rule set from the specified load balancer.
     * <p>
     * To delete a rule from a rule set, use the
     * {@link #updateRuleSet(UpdateRuleSetRequest) updateRuleSet} operation.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation will not retry by default, users can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to enable retries for it.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/loadbalancer/DeleteRuleSetExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use DeleteRuleSet API.
     */
    DeleteRuleSetResponse deleteRuleSet(DeleteRuleSetRequest request);

    /**
     * Deletes an SSL cipher suite from a load balancer.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation will not retry by default, users can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to enable retries for it.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/loadbalancer/DeleteSSLCipherSuiteExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use DeleteSSLCipherSuite API.
     */
    DeleteSSLCipherSuiteResponse deleteSSLCipherSuite(DeleteSSLCipherSuiteRequest request);

    /**
     * Gets the specified backend server's configuration information.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation will not retry by default, users can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to enable retries for it.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/loadbalancer/GetBackendExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use GetBackend API.
     */
    GetBackendResponse getBackend(GetBackendRequest request);

    /**
     * Gets the current health status of the specified backend server.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation will not retry by default, users can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to enable retries for it.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/loadbalancer/GetBackendHealthExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use GetBackendHealth API.
     */
    GetBackendHealthResponse getBackendHealth(GetBackendHealthRequest request);

    /**
     * Gets the specified backend set's configuration information.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation will not retry by default, users can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to enable retries for it.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/loadbalancer/GetBackendSetExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use GetBackendSet API.
     */
    GetBackendSetResponse getBackendSet(GetBackendSetRequest request);

    /**
     * Gets the health status for the specified backend set.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation will not retry by default, users can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to enable retries for it.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/loadbalancer/GetBackendSetHealthExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use GetBackendSetHealth API.
     */
    GetBackendSetHealthResponse getBackendSetHealth(GetBackendSetHealthRequest request);

    /**
     * Gets the health check policy information for a given load balancer and backend set.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation will not retry by default, users can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to enable retries for it.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/loadbalancer/GetHealthCheckerExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use GetHealthChecker API.
     */
    GetHealthCheckerResponse getHealthChecker(GetHealthCheckerRequest request);

    /**
     * Gets the specified hostname resource's configuration information.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation will not retry by default, users can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to enable retries for it.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/loadbalancer/GetHostnameExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use GetHostname API.
     */
    GetHostnameResponse getHostname(GetHostnameRequest request);

    /**
     * Gets the specified load balancer's configuration information.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation will not retry by default, users can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to enable retries for it.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/loadbalancer/GetLoadBalancerExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use GetLoadBalancer API.
     */
    GetLoadBalancerResponse getLoadBalancer(GetLoadBalancerRequest request);

    /**
     * Gets the health status for the specified load balancer.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation will not retry by default, users can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to enable retries for it.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/loadbalancer/GetLoadBalancerHealthExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use GetLoadBalancerHealth API.
     */
    GetLoadBalancerHealthResponse getLoadBalancerHealth(GetLoadBalancerHealthRequest request);

    /**
     * Gets the specified path route set's configuration information.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation will not retry by default, users can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to enable retries for it.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/loadbalancer/GetPathRouteSetExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use GetPathRouteSet API.
     */
    GetPathRouteSetResponse getPathRouteSet(GetPathRouteSetRequest request);

    /**
     * Gets the specified routing policy.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation will not retry by default, users can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to enable retries for it.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/loadbalancer/GetRoutingPolicyExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use GetRoutingPolicy API.
     */
    GetRoutingPolicyResponse getRoutingPolicy(GetRoutingPolicyRequest request);

    /**
     * Gets the specified set of rules.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation will not retry by default, users can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to enable retries for it.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/loadbalancer/GetRuleSetExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use GetRuleSet API.
     */
    GetRuleSetResponse getRuleSet(GetRuleSetRequest request);

    /**
     * Gets the specified SSL cipher suite's configuration information.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation will not retry by default, users can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to enable retries for it.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/loadbalancer/GetSSLCipherSuiteExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use GetSSLCipherSuite API.
     */
    GetSSLCipherSuiteResponse getSSLCipherSuite(GetSSLCipherSuiteRequest request);

    /**
     * Gets the details of a work request.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation will not retry by default, users can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to enable retries for it.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/loadbalancer/GetWorkRequestExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use GetWorkRequest API.
     */
    GetWorkRequestResponse getWorkRequest(GetWorkRequestRequest request);

    /**
     * Lists all backend sets associated with a given load balancer.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation will not retry by default, users can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to enable retries for it.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/loadbalancer/ListBackendSetsExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use ListBackendSets API.
     */
    ListBackendSetsResponse listBackendSets(ListBackendSetsRequest request);

    /**
     * Lists the backend servers for a given load balancer and backend set.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation will not retry by default, users can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to enable retries for it.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/loadbalancer/ListBackendsExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use ListBackends API.
     */
    ListBackendsResponse listBackends(ListBackendsRequest request);

    /**
     * Lists all SSL certificates bundles associated with a given load balancer.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation will not retry by default, users can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to enable retries for it.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/loadbalancer/ListCertificatesExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use ListCertificates API.
     */
    ListCertificatesResponse listCertificates(ListCertificatesRequest request);

    /**
     * Lists all hostname resources associated with the specified load balancer.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation will not retry by default, users can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to enable retries for it.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/loadbalancer/ListHostnamesExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use ListHostnames API.
     */
    ListHostnamesResponse listHostnames(ListHostnamesRequest request);

    /**
     * Lists all of the rules from all of the rule sets associated with the specified listener. The response organizes
     * the rules in the following order:
     * <p>
     *  Access control rules
     * *  Allow method rules
     * *  Request header rules
     * *  Response header rules
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation will not retry by default, users can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to enable retries for it.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/loadbalancer/ListListenerRulesExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use ListListenerRules API.
     */
    ListListenerRulesResponse listListenerRules(ListListenerRulesRequest request);

    /**
     * Lists the summary health statuses for all load balancers in the specified compartment.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation will not retry by default, users can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to enable retries for it.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/loadbalancer/ListLoadBalancerHealthsExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use ListLoadBalancerHealths API.
     */
    ListLoadBalancerHealthsResponse listLoadBalancerHealths(ListLoadBalancerHealthsRequest request);

    /**
     * Lists all load balancers in the specified compartment.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation will not retry by default, users can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to enable retries for it.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/loadbalancer/ListLoadBalancersExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use ListLoadBalancers API.
     */
    ListLoadBalancersResponse listLoadBalancers(ListLoadBalancersRequest request);

    /**
     * Lists all path route sets associated with the specified load balancer.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation will not retry by default, users can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to enable retries for it.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/loadbalancer/ListPathRouteSetsExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use ListPathRouteSets API.
     */
    ListPathRouteSetsResponse listPathRouteSets(ListPathRouteSetsRequest request);

    /**
     * Lists the available load balancer policies.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation will not retry by default, users can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to enable retries for it.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/loadbalancer/ListPoliciesExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use ListPolicies API.
     */
    ListPoliciesResponse listPolicies(ListPoliciesRequest request);

    /**
     * Lists all supported traffic protocols.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation will not retry by default, users can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to enable retries for it.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/loadbalancer/ListProtocolsExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use ListProtocols API.
     */
    ListProtocolsResponse listProtocols(ListProtocolsRequest request);

    /**
     * Lists all routing policies associated with the specified load balancer.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation will not retry by default, users can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to enable retries for it.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/loadbalancer/ListRoutingPoliciesExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use ListRoutingPolicies API.
     */
    ListRoutingPoliciesResponse listRoutingPolicies(ListRoutingPoliciesRequest request);

    /**
     * Lists all rule sets associated with the specified load balancer.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation will not retry by default, users can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to enable retries for it.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/loadbalancer/ListRuleSetsExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use ListRuleSets API.
     */
    ListRuleSetsResponse listRuleSets(ListRuleSetsRequest request);

    /**
     * Lists all SSL cipher suites associated with the specified load balancer.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation will not retry by default, users can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to enable retries for it.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/loadbalancer/ListSSLCipherSuitesExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use ListSSLCipherSuites API.
     */
    ListSSLCipherSuitesResponse listSSLCipherSuites(ListSSLCipherSuitesRequest request);

    /**
     * Lists the valid load balancer shapes.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation will not retry by default, users can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to enable retries for it.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/loadbalancer/ListShapesExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use ListShapes API.
     */
    ListShapesResponse listShapes(ListShapesRequest request);

    /**
     * Lists the work requests for a given load balancer.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation will not retry by default, users can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to enable retries for it.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/loadbalancer/ListWorkRequestsExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use ListWorkRequests API.
     */
    ListWorkRequestsResponse listWorkRequests(ListWorkRequestsRequest request);

    /**
     * Updates the configuration of a backend server within the specified backend set.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation will not retry by default, users can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to enable retries for it.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/loadbalancer/UpdateBackendExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use UpdateBackend API.
     */
    UpdateBackendResponse updateBackend(UpdateBackendRequest request);

    /**
     * Updates a backend set.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation will not retry by default, users can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to enable retries for it.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/loadbalancer/UpdateBackendSetExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use UpdateBackendSet API.
     */
    UpdateBackendSetResponse updateBackendSet(UpdateBackendSetRequest request);

    /**
     * Updates the health check policy for a given load balancer and backend set.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation will not retry by default, users can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to enable retries for it.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/loadbalancer/UpdateHealthCheckerExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use UpdateHealthChecker API.
     */
    UpdateHealthCheckerResponse updateHealthChecker(UpdateHealthCheckerRequest request);

    /**
     * Overwrites an existing hostname resource on the specified load balancer. Use this operation to change a
     * virtual hostname.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation will not retry by default, users can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to enable retries for it.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/loadbalancer/UpdateHostnameExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use UpdateHostname API.
     */
    UpdateHostnameResponse updateHostname(UpdateHostnameRequest request);

    /**
     * Updates a listener for a given load balancer.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation will not retry by default, users can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to enable retries for it.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/loadbalancer/UpdateListenerExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use UpdateListener API.
     */
    UpdateListenerResponse updateListener(UpdateListenerRequest request);

    /**
     * Updates a load balancer's configuration.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation will not retry by default, users can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to enable retries for it.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/loadbalancer/UpdateLoadBalancerExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use UpdateLoadBalancer API.
     */
    UpdateLoadBalancerResponse updateLoadBalancer(UpdateLoadBalancerRequest request);

    /**
     * Update the shape of a load balancer. The new shape can be larger or smaller compared to existing shape of the
     * LB. The service will try to perform this operation in the least disruptive way to existing connections, but
     * there is a possibility that they might be lost during the LB resizing process. The new shape becomes effective
     * as soon as the related work request completes successfully, i.e. when reshaping to a larger shape, the LB will
     * start accepting larger bandwidth and when reshaping to a smaller one, the LB will be accepting smaller
     * bandwidth.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation will not retry by default, users can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to enable retries for it.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/loadbalancer/UpdateLoadBalancerShapeExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use UpdateLoadBalancerShape API.
     */
    UpdateLoadBalancerShapeResponse updateLoadBalancerShape(UpdateLoadBalancerShapeRequest request);

    /**
     * Updates the network security groups associated with the specified load balancer.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation will not retry by default, users can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to enable retries for it.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/loadbalancer/UpdateNetworkSecurityGroupsExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use UpdateNetworkSecurityGroups API.
     */
    UpdateNetworkSecurityGroupsResponse updateNetworkSecurityGroups(
            UpdateNetworkSecurityGroupsRequest request);

    /**
     * Overwrites an existing path route set on the specified load balancer. Use this operation to add, delete, or alter
     * path route rules in a path route set.
     * <p>
     * To add a new path route rule to a path route set, the `pathRoutes` in the
     * {@link #updatePathRouteSetDetails(UpdatePathRouteSetDetailsRequest) updatePathRouteSetDetails} object must include
     * both the new path route rule to add and the existing path route rules to retain.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation will not retry by default, users can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to enable retries for it.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/loadbalancer/UpdatePathRouteSetExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use UpdatePathRouteSet API.
     */
    UpdatePathRouteSetResponse updatePathRouteSet(UpdatePathRouteSetRequest request);

    /**
     * Overwrites an existing routing policy on the specified load balancer. Use this operation to add, delete, or alter
     * routing policy rules in a routing policy.
     * <p>
     * To add a new routing rule to a routing policy, the body must include both the new routing rule to add and the existing rules to retain.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation will not retry by default, users can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to enable retries for it.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/loadbalancer/UpdateRoutingPolicyExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use UpdateRoutingPolicy API.
     */
    UpdateRoutingPolicyResponse updateRoutingPolicy(UpdateRoutingPolicyRequest request);

    /**
     * Overwrites an existing set of rules on the specified load balancer. Use this operation to add or alter
     * the rules in a rule set.
     * <p>
     * To add a new rule to a set, the body must include both the new rule to add and the existing rules to retain.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation will not retry by default, users can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to enable retries for it.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/loadbalancer/UpdateRuleSetExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use UpdateRuleSet API.
     */
    UpdateRuleSetResponse updateRuleSet(UpdateRuleSetRequest request);

    /**
     * Updates an existing SSL cipher suite for the specified load balancer.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation will not retry by default, users can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to enable retries for it.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/loadbalancer/UpdateSSLCipherSuiteExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use UpdateSSLCipherSuite API.
     */
    UpdateSSLCipherSuiteResponse updateSSLCipherSuite(UpdateSSLCipherSuiteRequest request);

    /**
     * Gets the pre-configured waiters available for resources for this service.
     *
     * @return The service waiters.
     */
    LoadBalancerWaiters getWaiters();

    /**
     * Gets the pre-configured paginators available for list operations in this service which may return multiple
     * pages of data. These paginators provide an {@link java.lang.Iterable} interface so that service responses, or
     * resources/records, can be iterated through without having to manually deal with pagination and page tokens.
     *
     * @return The service paginators.
     */
    LoadBalancerPaginators getPaginators();
}
