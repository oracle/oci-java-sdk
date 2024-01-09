/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.loadbalancer;

import com.oracle.bmc.loadbalancer.requests.*;
import com.oracle.bmc.loadbalancer.responses.*;

/**
 * API for the Load Balancing service. Use this API to manage load balancers, backend sets, and
 * related items. For more information, see [Overview of Load
 * Balancing](https://docs.cloud.oracle.com/iaas/Content/Balance/Concepts/balanceoverview.htm).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20170115")
public interface LoadBalancerAsync extends AutoCloseable {

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
     * Moves a load balancer into a different compartment within the same tenancy. For information
     * about moving resources between compartments, see [Moving Resources to a Different
     * Compartment](https://docs.cloud.oracle.com/iaas/Content/Identity/Tasks/managingcompartments.htm#moveRes).
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<ChangeLoadBalancerCompartmentResponse>
            changeLoadBalancerCompartment(
                    ChangeLoadBalancerCompartmentRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    ChangeLoadBalancerCompartmentRequest,
                                    ChangeLoadBalancerCompartmentResponse>
                            handler);

    /**
     * Adds a backend server to a backend set.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<CreateBackendResponse> createBackend(
            CreateBackendRequest request,
            com.oracle.bmc.responses.AsyncHandler<CreateBackendRequest, CreateBackendResponse>
                    handler);

    /**
     * Adds a backend set to a load balancer.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<CreateBackendSetResponse> createBackendSet(
            CreateBackendSetRequest request,
            com.oracle.bmc.responses.AsyncHandler<CreateBackendSetRequest, CreateBackendSetResponse>
                    handler);

    /**
     * Creates an asynchronous request to add an SSL certificate bundle.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<CreateCertificateResponse> createCertificate(
            CreateCertificateRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            CreateCertificateRequest, CreateCertificateResponse>
                    handler);

    /**
     * Adds a hostname resource to the specified load balancer. For more information, see [Managing
     * Request Routing](https://docs.cloud.oracle.com/Content/Balance/Tasks/managingrequest.htm).
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<CreateHostnameResponse> createHostname(
            CreateHostnameRequest request,
            com.oracle.bmc.responses.AsyncHandler<CreateHostnameRequest, CreateHostnameResponse>
                    handler);

    /**
     * Adds a listener to a load balancer.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<CreateListenerResponse> createListener(
            CreateListenerRequest request,
            com.oracle.bmc.responses.AsyncHandler<CreateListenerRequest, CreateListenerResponse>
                    handler);

    /**
     * Creates a new load balancer in the specified compartment. For general information about load
     * balancers, see [Overview of the Load Balancing
     * Service](https://docs.cloud.oracle.com/Content/Balance/Concepts/balanceoverview.htm).
     *
     * <p>For the purposes of access control, you must provide the OCID of the compartment where you
     * want the load balancer to reside. Notice that the load balancer doesn't have to be in the
     * same compartment as the VCN or backend set. If you're not sure which compartment to use, put
     * the load balancer in the same compartment as the VCN. For information about access control
     * and compartments, see [Overview of the IAM
     * Service](https://docs.cloud.oracle.com/Content/Identity/Concepts/overview.htm).
     *
     * <p>You must specify a display name for the load balancer. It does not have to be unique, and
     * you can change it.
     *
     * <p>For information about Availability Domains, see [Regions and Availability
     * Domains](https://docs.cloud.oracle.com/Content/General/Concepts/regions.htm). To get a list
     * of Availability Domains, use the `ListAvailabilityDomains` operation in the Identity and
     * Access Management Service API.
     *
     * <p>All Oracle Cloud Infrastructure resources, including load balancers, get an
     * Oracle-assigned, unique ID called an Oracle Cloud Identifier (OCID). When you create a
     * resource, you can find its OCID in the response. You can also retrieve a resource's OCID by
     * using a List API operation on that resource type, or by viewing the resource in the Console.
     * Fore more information, see [Resource
     * Identifiers](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm).
     *
     * <p>After you send your request, the new object's state will temporarily be PROVISIONING.
     * Before using the object, first make sure its state has changed to RUNNING.
     *
     * <p>When you create a load balancer, the system assigns an IP address. To get the IP address,
     * use the {@link #getLoadBalancer(GetLoadBalancerRequest, Consumer, Consumer) getLoadBalancer}
     * operation.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<CreateLoadBalancerResponse> createLoadBalancer(
            CreateLoadBalancerRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            CreateLoadBalancerRequest, CreateLoadBalancerResponse>
                    handler);

    /**
     * Adds a path route set to a load balancer. For more information, see [Managing Request
     * Routing](https://docs.cloud.oracle.com/Content/Balance/Tasks/managingrequest.htm).
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<CreatePathRouteSetResponse> createPathRouteSet(
            CreatePathRouteSetRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            CreatePathRouteSetRequest, CreatePathRouteSetResponse>
                    handler);

    /**
     * Adds a routing policy to a load balancer. For more information, see [Managing Request
     * Routing](https://docs.cloud.oracle.com/Content/Balance/Tasks/managingrequest.htm).
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<CreateRoutingPolicyResponse> createRoutingPolicy(
            CreateRoutingPolicyRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            CreateRoutingPolicyRequest, CreateRoutingPolicyResponse>
                    handler);

    /**
     * Creates a new rule set associated with the specified load balancer. For more information, see
     * [Managing Rule
     * Sets](https://docs.cloud.oracle.com/Content/Balance/Tasks/managingrulesets.htm).
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<CreateRuleSetResponse> createRuleSet(
            CreateRuleSetRequest request,
            com.oracle.bmc.responses.AsyncHandler<CreateRuleSetRequest, CreateRuleSetResponse>
                    handler);

    /**
     * Creates a custom SSL cipher suite.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<CreateSSLCipherSuiteResponse> createSSLCipherSuite(
            CreateSSLCipherSuiteRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            CreateSSLCipherSuiteRequest, CreateSSLCipherSuiteResponse>
                    handler);

    /**
     * Removes a backend server from a given load balancer and backend set.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<DeleteBackendResponse> deleteBackend(
            DeleteBackendRequest request,
            com.oracle.bmc.responses.AsyncHandler<DeleteBackendRequest, DeleteBackendResponse>
                    handler);

    /**
     * Deletes the specified backend set. Note that deleting a backend set removes its backend
     * servers from the load balancer.
     *
     * <p>Before you can delete a backend set, you must remove it from any active listeners.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<DeleteBackendSetResponse> deleteBackendSet(
            DeleteBackendSetRequest request,
            com.oracle.bmc.responses.AsyncHandler<DeleteBackendSetRequest, DeleteBackendSetResponse>
                    handler);

    /**
     * Deletes an SSL certificate bundle from a load balancer.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<DeleteCertificateResponse> deleteCertificate(
            DeleteCertificateRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            DeleteCertificateRequest, DeleteCertificateResponse>
                    handler);

    /**
     * Deletes a hostname resource from the specified load balancer.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<DeleteHostnameResponse> deleteHostname(
            DeleteHostnameRequest request,
            com.oracle.bmc.responses.AsyncHandler<DeleteHostnameRequest, DeleteHostnameResponse>
                    handler);

    /**
     * Deletes a listener from a load balancer.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<DeleteListenerResponse> deleteListener(
            DeleteListenerRequest request,
            com.oracle.bmc.responses.AsyncHandler<DeleteListenerRequest, DeleteListenerResponse>
                    handler);

    /**
     * Stops a load balancer and removes it from service.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<DeleteLoadBalancerResponse> deleteLoadBalancer(
            DeleteLoadBalancerRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            DeleteLoadBalancerRequest, DeleteLoadBalancerResponse>
                    handler);

    /**
     * Deletes a path route set from the specified load balancer.
     *
     * <p>To delete a path route rule from a path route set, use the {@link
     * #updatePathRouteSet(UpdatePathRouteSetRequest, Consumer, Consumer) updatePathRouteSet}
     * operation.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<DeletePathRouteSetResponse> deletePathRouteSet(
            DeletePathRouteSetRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            DeletePathRouteSetRequest, DeletePathRouteSetResponse>
                    handler);

    /**
     * Deletes a routing policy from the specified load balancer.
     *
     * <p>To delete a routing rule from a routing policy, use the {@link
     * #updateRoutingPolicy(UpdateRoutingPolicyRequest, Consumer, Consumer) updateRoutingPolicy}
     * operation.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<DeleteRoutingPolicyResponse> deleteRoutingPolicy(
            DeleteRoutingPolicyRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            DeleteRoutingPolicyRequest, DeleteRoutingPolicyResponse>
                    handler);

    /**
     * Deletes a rule set from the specified load balancer.
     *
     * <p>To delete a rule from a rule set, use the {@link #updateRuleSet(UpdateRuleSetRequest,
     * Consumer, Consumer) updateRuleSet} operation.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<DeleteRuleSetResponse> deleteRuleSet(
            DeleteRuleSetRequest request,
            com.oracle.bmc.responses.AsyncHandler<DeleteRuleSetRequest, DeleteRuleSetResponse>
                    handler);

    /**
     * Deletes an SSL cipher suite from a load balancer.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<DeleteSSLCipherSuiteResponse> deleteSSLCipherSuite(
            DeleteSSLCipherSuiteRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            DeleteSSLCipherSuiteRequest, DeleteSSLCipherSuiteResponse>
                    handler);

    /**
     * Gets the specified backend server's configuration information.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<GetBackendResponse> getBackend(
            GetBackendRequest request,
            com.oracle.bmc.responses.AsyncHandler<GetBackendRequest, GetBackendResponse> handler);

    /**
     * Gets the current health status of the specified backend server.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<GetBackendHealthResponse> getBackendHealth(
            GetBackendHealthRequest request,
            com.oracle.bmc.responses.AsyncHandler<GetBackendHealthRequest, GetBackendHealthResponse>
                    handler);

    /**
     * Gets the specified backend set's configuration information.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<GetBackendSetResponse> getBackendSet(
            GetBackendSetRequest request,
            com.oracle.bmc.responses.AsyncHandler<GetBackendSetRequest, GetBackendSetResponse>
                    handler);

    /**
     * Gets the health status for the specified backend set.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<GetBackendSetHealthResponse> getBackendSetHealth(
            GetBackendSetHealthRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            GetBackendSetHealthRequest, GetBackendSetHealthResponse>
                    handler);

    /**
     * Gets the health check policy information for a given load balancer and backend set.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<GetHealthCheckerResponse> getHealthChecker(
            GetHealthCheckerRequest request,
            com.oracle.bmc.responses.AsyncHandler<GetHealthCheckerRequest, GetHealthCheckerResponse>
                    handler);

    /**
     * Gets the specified hostname resource's configuration information.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<GetHostnameResponse> getHostname(
            GetHostnameRequest request,
            com.oracle.bmc.responses.AsyncHandler<GetHostnameRequest, GetHostnameResponse> handler);

    /**
     * Gets the specified load balancer's configuration information.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<GetLoadBalancerResponse> getLoadBalancer(
            GetLoadBalancerRequest request,
            com.oracle.bmc.responses.AsyncHandler<GetLoadBalancerRequest, GetLoadBalancerResponse>
                    handler);

    /**
     * Gets the health status for the specified load balancer.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<GetLoadBalancerHealthResponse> getLoadBalancerHealth(
            GetLoadBalancerHealthRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            GetLoadBalancerHealthRequest, GetLoadBalancerHealthResponse>
                    handler);

    /**
     * Gets the specified path route set's configuration information.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<GetPathRouteSetResponse> getPathRouteSet(
            GetPathRouteSetRequest request,
            com.oracle.bmc.responses.AsyncHandler<GetPathRouteSetRequest, GetPathRouteSetResponse>
                    handler);

    /**
     * Gets the specified routing policy.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<GetRoutingPolicyResponse> getRoutingPolicy(
            GetRoutingPolicyRequest request,
            com.oracle.bmc.responses.AsyncHandler<GetRoutingPolicyRequest, GetRoutingPolicyResponse>
                    handler);

    /**
     * Gets the specified set of rules.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<GetRuleSetResponse> getRuleSet(
            GetRuleSetRequest request,
            com.oracle.bmc.responses.AsyncHandler<GetRuleSetRequest, GetRuleSetResponse> handler);

    /**
     * Gets the specified SSL cipher suite's configuration information.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<GetSSLCipherSuiteResponse> getSSLCipherSuite(
            GetSSLCipherSuiteRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            GetSSLCipherSuiteRequest, GetSSLCipherSuiteResponse>
                    handler);

    /**
     * Gets the details of a work request.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<GetWorkRequestResponse> getWorkRequest(
            GetWorkRequestRequest request,
            com.oracle.bmc.responses.AsyncHandler<GetWorkRequestRequest, GetWorkRequestResponse>
                    handler);

    /**
     * Lists all backend sets associated with a given load balancer.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<ListBackendSetsResponse> listBackendSets(
            ListBackendSetsRequest request,
            com.oracle.bmc.responses.AsyncHandler<ListBackendSetsRequest, ListBackendSetsResponse>
                    handler);

    /**
     * Lists the backend servers for a given load balancer and backend set.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<ListBackendsResponse> listBackends(
            ListBackendsRequest request,
            com.oracle.bmc.responses.AsyncHandler<ListBackendsRequest, ListBackendsResponse>
                    handler);

    /**
     * Lists all SSL certificates bundles associated with a given load balancer.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<ListCertificatesResponse> listCertificates(
            ListCertificatesRequest request,
            com.oracle.bmc.responses.AsyncHandler<ListCertificatesRequest, ListCertificatesResponse>
                    handler);

    /**
     * Lists all hostname resources associated with the specified load balancer.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<ListHostnamesResponse> listHostnames(
            ListHostnamesRequest request,
            com.oracle.bmc.responses.AsyncHandler<ListHostnamesRequest, ListHostnamesResponse>
                    handler);

    /**
     * Lists all of the rules from all of the rule sets associated with the specified listener. The
     * response organizes the rules in the following order:
     *
     * <p>Access control rules * Allow method rules * Request header rules * Response header rules
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<ListListenerRulesResponse> listListenerRules(
            ListListenerRulesRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            ListListenerRulesRequest, ListListenerRulesResponse>
                    handler);

    /**
     * Lists the summary health statuses for all load balancers in the specified compartment.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<ListLoadBalancerHealthsResponse> listLoadBalancerHealths(
            ListLoadBalancerHealthsRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            ListLoadBalancerHealthsRequest, ListLoadBalancerHealthsResponse>
                    handler);

    /**
     * Lists all load balancers in the specified compartment.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<ListLoadBalancersResponse> listLoadBalancers(
            ListLoadBalancersRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            ListLoadBalancersRequest, ListLoadBalancersResponse>
                    handler);

    /**
     * Lists all path route sets associated with the specified load balancer.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<ListPathRouteSetsResponse> listPathRouteSets(
            ListPathRouteSetsRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            ListPathRouteSetsRequest, ListPathRouteSetsResponse>
                    handler);

    /**
     * Lists the available load balancer policies.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<ListPoliciesResponse> listPolicies(
            ListPoliciesRequest request,
            com.oracle.bmc.responses.AsyncHandler<ListPoliciesRequest, ListPoliciesResponse>
                    handler);

    /**
     * Lists all supported traffic protocols.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<ListProtocolsResponse> listProtocols(
            ListProtocolsRequest request,
            com.oracle.bmc.responses.AsyncHandler<ListProtocolsRequest, ListProtocolsResponse>
                    handler);

    /**
     * Lists all routing policies associated with the specified load balancer.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<ListRoutingPoliciesResponse> listRoutingPolicies(
            ListRoutingPoliciesRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            ListRoutingPoliciesRequest, ListRoutingPoliciesResponse>
                    handler);

    /**
     * Lists all rule sets associated with the specified load balancer.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<ListRuleSetsResponse> listRuleSets(
            ListRuleSetsRequest request,
            com.oracle.bmc.responses.AsyncHandler<ListRuleSetsRequest, ListRuleSetsResponse>
                    handler);

    /**
     * Lists all SSL cipher suites associated with the specified load balancer.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<ListSSLCipherSuitesResponse> listSSLCipherSuites(
            ListSSLCipherSuitesRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            ListSSLCipherSuitesRequest, ListSSLCipherSuitesResponse>
                    handler);

    /**
     * Lists the valid load balancer shapes.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<ListShapesResponse> listShapes(
            ListShapesRequest request,
            com.oracle.bmc.responses.AsyncHandler<ListShapesRequest, ListShapesResponse> handler);

    /**
     * Lists the work requests for a given load balancer.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<ListWorkRequestsResponse> listWorkRequests(
            ListWorkRequestsRequest request,
            com.oracle.bmc.responses.AsyncHandler<ListWorkRequestsRequest, ListWorkRequestsResponse>
                    handler);

    /**
     * Updates the configuration of a backend server within the specified backend set.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<UpdateBackendResponse> updateBackend(
            UpdateBackendRequest request,
            com.oracle.bmc.responses.AsyncHandler<UpdateBackendRequest, UpdateBackendResponse>
                    handler);

    /**
     * Updates a backend set.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<UpdateBackendSetResponse> updateBackendSet(
            UpdateBackendSetRequest request,
            com.oracle.bmc.responses.AsyncHandler<UpdateBackendSetRequest, UpdateBackendSetResponse>
                    handler);

    /**
     * Updates the health check policy for a given load balancer and backend set.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<UpdateHealthCheckerResponse> updateHealthChecker(
            UpdateHealthCheckerRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            UpdateHealthCheckerRequest, UpdateHealthCheckerResponse>
                    handler);

    /**
     * Overwrites an existing hostname resource on the specified load balancer. Use this operation
     * to change a virtual hostname.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<UpdateHostnameResponse> updateHostname(
            UpdateHostnameRequest request,
            com.oracle.bmc.responses.AsyncHandler<UpdateHostnameRequest, UpdateHostnameResponse>
                    handler);

    /**
     * Updates a listener for a given load balancer.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<UpdateListenerResponse> updateListener(
            UpdateListenerRequest request,
            com.oracle.bmc.responses.AsyncHandler<UpdateListenerRequest, UpdateListenerResponse>
                    handler);

    /**
     * Updates a load balancer's configuration.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<UpdateLoadBalancerResponse> updateLoadBalancer(
            UpdateLoadBalancerRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            UpdateLoadBalancerRequest, UpdateLoadBalancerResponse>
                    handler);

    /**
     * Update the shape of a load balancer. The new shape can be larger or smaller compared to
     * existing shape of the LB. The service will try to perform this operation in the least
     * disruptive way to existing connections, but there is a possibility that they might be lost
     * during the LB resizing process. The new shape becomes effective as soon as the related work
     * request completes successfully, i.e. when reshaping to a larger shape, the LB will start
     * accepting larger bandwidth and when reshaping to a smaller one, the LB will be accepting
     * smaller bandwidth.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<UpdateLoadBalancerShapeResponse> updateLoadBalancerShape(
            UpdateLoadBalancerShapeRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            UpdateLoadBalancerShapeRequest, UpdateLoadBalancerShapeResponse>
                    handler);

    /**
     * Updates the network security groups associated with the specified load balancer.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<UpdateNetworkSecurityGroupsResponse> updateNetworkSecurityGroups(
            UpdateNetworkSecurityGroupsRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            UpdateNetworkSecurityGroupsRequest, UpdateNetworkSecurityGroupsResponse>
                    handler);

    /**
     * Overwrites an existing path route set on the specified load balancer. Use this operation to
     * add, delete, or alter path route rules in a path route set.
     *
     * <p>To add a new path route rule to a path route set, the `pathRoutes` in the {@link
     * #updatePathRouteSetDetails(UpdatePathRouteSetDetailsRequest, Consumer, Consumer)
     * updatePathRouteSetDetails} object must include both the new path route rule to add and the
     * existing path route rules to retain.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<UpdatePathRouteSetResponse> updatePathRouteSet(
            UpdatePathRouteSetRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            UpdatePathRouteSetRequest, UpdatePathRouteSetResponse>
                    handler);

    /**
     * Overwrites an existing routing policy on the specified load balancer. Use this operation to
     * add, delete, or alter routing policy rules in a routing policy.
     *
     * <p>To add a new routing rule to a routing policy, the body must include both the new routing
     * rule to add and the existing rules to retain.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<UpdateRoutingPolicyResponse> updateRoutingPolicy(
            UpdateRoutingPolicyRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            UpdateRoutingPolicyRequest, UpdateRoutingPolicyResponse>
                    handler);

    /**
     * Overwrites an existing set of rules on the specified load balancer. Use this operation to add
     * or alter the rules in a rule set.
     *
     * <p>To add a new rule to a set, the body must include both the new rule to add and the
     * existing rules to retain.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<UpdateRuleSetResponse> updateRuleSet(
            UpdateRuleSetRequest request,
            com.oracle.bmc.responses.AsyncHandler<UpdateRuleSetRequest, UpdateRuleSetResponse>
                    handler);

    /**
     * Updates an existing SSL cipher suite for the specified load balancer.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<UpdateSSLCipherSuiteResponse> updateSSLCipherSuite(
            UpdateSSLCipherSuiteRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            UpdateSSLCipherSuiteRequest, UpdateSSLCipherSuiteResponse>
                    handler);
}
