/**
 * Copyright (c) 2016, 2019, Oracle and/or its affiliates. All rights reserved.
 */
package com.oracle.bmc.loadbalancer;

import com.oracle.bmc.loadbalancer.requests.*;
import com.oracle.bmc.loadbalancer.responses.*;

@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20170115")
public interface LoadBalancer extends AutoCloseable {

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
     * Adds a backend server to a backend set.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    CreateBackendResponse createBackend(CreateBackendRequest request);

    /**
     * Adds a backend set to a load balancer.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    CreateBackendSetResponse createBackendSet(CreateBackendSetRequest request);

    /**
     * Creates an asynchronous request to add an SSL certificate bundle.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    CreateCertificateResponse createCertificate(CreateCertificateRequest request);

    /**
     * Adds a hostname resource to the specified load balancer. For more information, see
     * [Managing Request Routing](https://docs.cloud.oracle.com/Content/Balance/Tasks/managingrequest.htm).
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    CreateHostnameResponse createHostname(CreateHostnameRequest request);

    /**
     * Adds a listener to a load balancer.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
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
     */
    CreateLoadBalancerResponse createLoadBalancer(CreateLoadBalancerRequest request);

    /**
     * Adds a path route set to a load balancer. For more information, see
     * [Managing Request Routing](https://docs.cloud.oracle.com/Content/Balance/Tasks/managingrequest.htm).
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    CreatePathRouteSetResponse createPathRouteSet(CreatePathRouteSetRequest request);

    /**
     * Creates a new rule set associated with the specified load balancer.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    CreateRuleSetResponse createRuleSet(CreateRuleSetRequest request);

    /**
     * Removes a backend server from a given load balancer and backend set.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
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
     */
    DeleteBackendSetResponse deleteBackendSet(DeleteBackendSetRequest request);

    /**
     * Deletes an SSL certificate bundle from a load balancer.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    DeleteCertificateResponse deleteCertificate(DeleteCertificateRequest request);

    /**
     * Deletes a hostname resource from the specified load balancer.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    DeleteHostnameResponse deleteHostname(DeleteHostnameRequest request);

    /**
     * Deletes a listener from a load balancer.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    DeleteListenerResponse deleteListener(DeleteListenerRequest request);

    /**
     * Stops a load balancer and removes it from service.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
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
     */
    DeletePathRouteSetResponse deletePathRouteSet(DeletePathRouteSetRequest request);

    /**
     * Deletes a rule set from the specified load balancer.
     * <p>
     * To delete a rule from a rule set, use the
     * {@link #updateRuleSet(UpdateRuleSetRequest) updateRuleSet} operation.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    DeleteRuleSetResponse deleteRuleSet(DeleteRuleSetRequest request);

    /**
     * Gets the specified backend server's configuration information.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    GetBackendResponse getBackend(GetBackendRequest request);

    /**
     * Gets the current health status of the specified backend server.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    GetBackendHealthResponse getBackendHealth(GetBackendHealthRequest request);

    /**
     * Gets the specified backend set's configuration information.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    GetBackendSetResponse getBackendSet(GetBackendSetRequest request);

    /**
     * Gets the health status for the specified backend set.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    GetBackendSetHealthResponse getBackendSetHealth(GetBackendSetHealthRequest request);

    /**
     * Gets the health check policy information for a given load balancer and backend set.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    GetHealthCheckerResponse getHealthChecker(GetHealthCheckerRequest request);

    /**
     * Gets the specified hostname resource's configuration information.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    GetHostnameResponse getHostname(GetHostnameRequest request);

    /**
     * Gets the specified load balancer's configuration information.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    GetLoadBalancerResponse getLoadBalancer(GetLoadBalancerRequest request);

    /**
     * Gets the health status for the specified load balancer.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    GetLoadBalancerHealthResponse getLoadBalancerHealth(GetLoadBalancerHealthRequest request);

    /**
     * Gets the specified path route set's configuration information.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    GetPathRouteSetResponse getPathRouteSet(GetPathRouteSetRequest request);

    /**
     * Gets the specified set of rules.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    GetRuleSetResponse getRuleSet(GetRuleSetRequest request);

    /**
     * Gets the details of a work request.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    GetWorkRequestResponse getWorkRequest(GetWorkRequestRequest request);

    /**
     * Lists all backend sets associated with a given load balancer.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    ListBackendSetsResponse listBackendSets(ListBackendSetsRequest request);

    /**
     * Lists the backend servers for a given load balancer and backend set.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    ListBackendsResponse listBackends(ListBackendsRequest request);

    /**
     * Lists all SSL certificates bundles associated with a given load balancer.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    ListCertificatesResponse listCertificates(ListCertificatesRequest request);

    /**
     * Lists all hostname resources associated with the specified load balancer.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    ListHostnamesResponse listHostnames(ListHostnamesRequest request);

    /**
     * Lists the summary health statuses for all load balancers in the specified compartment.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    ListLoadBalancerHealthsResponse listLoadBalancerHealths(ListLoadBalancerHealthsRequest request);

    /**
     * Lists all load balancers in the specified compartment.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    ListLoadBalancersResponse listLoadBalancers(ListLoadBalancersRequest request);

    /**
     * Lists all path route sets associated with the specified load balancer.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    ListPathRouteSetsResponse listPathRouteSets(ListPathRouteSetsRequest request);

    /**
     * Lists the available load balancer policies.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    ListPoliciesResponse listPolicies(ListPoliciesRequest request);

    /**
     * Lists all supported traffic protocols.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    ListProtocolsResponse listProtocols(ListProtocolsRequest request);

    /**
     * Lists all rule sets associated with the specified load balancer.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    ListRuleSetsResponse listRuleSets(ListRuleSetsRequest request);

    /**
     * Lists the valid load balancer shapes.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    ListShapesResponse listShapes(ListShapesRequest request);

    /**
     * Lists the work requests for a given load balancer.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    ListWorkRequestsResponse listWorkRequests(ListWorkRequestsRequest request);

    /**
     * Updates the configuration of a backend server within the specified backend set.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    UpdateBackendResponse updateBackend(UpdateBackendRequest request);

    /**
     * Updates a backend set.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    UpdateBackendSetResponse updateBackendSet(UpdateBackendSetRequest request);

    /**
     * Updates the health check policy for a given load balancer and backend set.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    UpdateHealthCheckerResponse updateHealthChecker(UpdateHealthCheckerRequest request);

    /**
     * Overwrites an existing hostname resource on the specified load balancer. Use this operation to change a
     * virtual hostname.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    UpdateHostnameResponse updateHostname(UpdateHostnameRequest request);

    /**
     * Updates a listener for a given load balancer.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    UpdateListenerResponse updateListener(UpdateListenerRequest request);

    /**
     * Updates a load balancer's configuration.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    UpdateLoadBalancerResponse updateLoadBalancer(UpdateLoadBalancerRequest request);

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
     */
    UpdatePathRouteSetResponse updatePathRouteSet(UpdatePathRouteSetRequest request);

    /**
     * Overwrites an existing set of rules on the specified load balancer. Use this operation to add or alter
     * the rules in a rule set.
     * <p>
     * To add a new rule to a set, the body must include both the new rule to add and the existing rules to retain.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    UpdateRuleSetResponse updateRuleSet(UpdateRuleSetRequest request);

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
