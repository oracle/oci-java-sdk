/**
 * Copyright (c) 2016, 2017, Oracle and/or its affiliates. All rights reserved.
 */
package com.oracle.bmc.loadbalancer;

import com.oracle.bmc.loadbalancer.requests.*;
import com.oracle.bmc.loadbalancer.responses.*;

@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20170115")
public interface LoadBalancerAsync extends AutoCloseable {

    /**
     * Sets the endpoint to call (ex, https://www.example.com).
     * @param endpoint The endpoint of the serice.
     */
    void setEndpoint(String endpoint);

    /**
     * Sets the region to call (ex, Region.US_PHOENIX_1).
     * <p>
     * Note, this will call {@link #setEndpoint(String) setEndpoint} after resolving the endpoint.  If the service is not available in this region, however, an IllegalArgumentException will be raised.
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
     * default endpoint format ({@link Region#formatDefaultRegionEndpoint(Service, String)}
     * and then call {@link #setEndpoint(String) setEndpoint}.
     * @param regionId The public region ID.
     */
    void setRegion(String regionId);

    /**
     * Adds a backend server to a backend set.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
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
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<CreateBackendSetResponse> createBackendSet(
            CreateBackendSetRequest request,
            com.oracle.bmc.responses.AsyncHandler<CreateBackendSetRequest, CreateBackendSetResponse>
                    handler);

    /**
     * Creates an asynchronous request to add an SSL certificate.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<CreateCertificateResponse> createCertificate(
            CreateCertificateRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            CreateCertificateRequest, CreateCertificateResponse>
                    handler);

    /**
     * Adds a listener to a load balancer.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<CreateListenerResponse> createListener(
            CreateListenerRequest request,
            com.oracle.bmc.responses.AsyncHandler<CreateListenerRequest, CreateListenerResponse>
                    handler);

    /**
     * Creates a new load balancer in the specified compartment. For general information about load balancers,
     * see [Overview of the Load Balancing Service](https://docs.us-phoenix-1.oraclecloud.com/Content/Balance/Concepts/balanceoverview.htm).
     * <p>
     * For the purposes of access control, you must provide the OCID of the compartment where you want
     * the load balancer to reside. Notice that the load balancer doesn't have to be in the same compartment as the VCN
     * or backend set. If you're not sure which compartment to use, put the load balancer in the same compartment as the VCN.
     * For information about access control and compartments, see
     * [Overview of the IAM Service](https://docs.us-phoenix-1.oraclecloud.com/Content/Identity/Concepts/overview.htm).
     * <p>
     * You must specify a display name for the load balancer. It does not have to be unique, and you can change it.
     * <p>
     * For information about Availability Domains, see
     * [Regions and Availability Domains](https://docs.us-phoenix-1.oraclecloud.com/Content/General/Concepts/regions.htm).
     * To get a list of Availability Domains, use the `ListAvailabilityDomains` operation
     * in the Identity and Access Management Service API.
     * <p>
     * All Oracle Bare Metal Cloud Services resources, including load balancers, get an Oracle-assigned,
     * unique ID called an Oracle Cloud Identifier (OCID). When you create a resource, you can find its OCID
     * in the response. You can also retrieve a resource's OCID by using a List API operation on that resource type,
     * or by viewing the resource in the Console. Fore more information, see
     * [Resource Identifiers](https://docs.us-phoenix-1.oraclecloud.com/Content/General/Concepts/identifiers.htm).
     * <p>
     * After you send your request, the new object's state will temporarily be PROVISIONING. Before using the
     * object, first make sure its state has changed to RUNNING.
     * <p>
     * When you create a load balancer, the system assigns an IP address.
     * To get the IP address, use the {@link #getLoadBalancer(GetLoadBalancerRequest, Consumer, Consumer) getLoadBalancer} operation.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<CreateLoadBalancerResponse> createLoadBalancer(
            CreateLoadBalancerRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            CreateLoadBalancerRequest, CreateLoadBalancerResponse>
                    handler);

    /**
     * Removes a backend server from a given load balancer and backend set.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<DeleteBackendResponse> deleteBackend(
            DeleteBackendRequest request,
            com.oracle.bmc.responses.AsyncHandler<DeleteBackendRequest, DeleteBackendResponse>
                    handler);

    /**
     * Deletes the specified backend set. Note that deleting a backend set removes its backend servers from the load balancer.
     * <p>
     * Before you can delete a backend set, you must remove it from any active listeners.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<DeleteBackendSetResponse> deleteBackendSet(
            DeleteBackendSetRequest request,
            com.oracle.bmc.responses.AsyncHandler<DeleteBackendSetRequest, DeleteBackendSetResponse>
                    handler);

    /**
     * Deletes an SSL certificate from a load balancer.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<DeleteCertificateResponse> deleteCertificate(
            DeleteCertificateRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            DeleteCertificateRequest, DeleteCertificateResponse>
                    handler);

    /**
     * Deletes a listener from a load balancer.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
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
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<DeleteLoadBalancerResponse> deleteLoadBalancer(
            DeleteLoadBalancerRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            DeleteLoadBalancerRequest, DeleteLoadBalancerResponse>
                    handler);

    /**
     * Gets the specified backend server's configuration information.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<GetBackendResponse> getBackend(
            GetBackendRequest request,
            com.oracle.bmc.responses.AsyncHandler<GetBackendRequest, GetBackendResponse> handler);

    /**
     * Gets the current health status of the specified backend server.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
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
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
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
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
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
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<GetHealthCheckerResponse> getHealthChecker(
            GetHealthCheckerRequest request,
            com.oracle.bmc.responses.AsyncHandler<GetHealthCheckerRequest, GetHealthCheckerResponse>
                    handler);

    /**
     * Gets the specified load balancer's configuration information.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
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
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<GetLoadBalancerHealthResponse> getLoadBalancerHealth(
            GetLoadBalancerHealthRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            GetLoadBalancerHealthRequest, GetLoadBalancerHealthResponse>
                    handler);

    /**
     * Gets the details of a work request.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
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
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
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
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<ListBackendsResponse> listBackends(
            ListBackendsRequest request,
            com.oracle.bmc.responses.AsyncHandler<ListBackendsRequest, ListBackendsResponse>
                    handler);

    /**
     * Lists all SSL certificates associated with a given load balancer.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<ListCertificatesResponse> listCertificates(
            ListCertificatesRequest request,
            com.oracle.bmc.responses.AsyncHandler<ListCertificatesRequest, ListCertificatesResponse>
                    handler);

    /**
     * Lists the summary health statuses for all load balancers in the specified compartment.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
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
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<ListLoadBalancersResponse> listLoadBalancers(
            ListLoadBalancersRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            ListLoadBalancersRequest, ListLoadBalancersResponse>
                    handler);

    /**
     * Lists the available load balancer policies.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
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
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<ListProtocolsResponse> listProtocols(
            ListProtocolsRequest request,
            com.oracle.bmc.responses.AsyncHandler<ListProtocolsRequest, ListProtocolsResponse>
                    handler);

    /**
     * Lists the valid load balancer shapes.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<ListShapesResponse> listShapes(
            ListShapesRequest request,
            com.oracle.bmc.responses.AsyncHandler<ListShapesRequest, ListShapesResponse> handler);

    /**
     * Lists the work requests for a given load balancer.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
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
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
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
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
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
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<UpdateHealthCheckerResponse> updateHealthChecker(
            UpdateHealthCheckerRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            UpdateHealthCheckerRequest, UpdateHealthCheckerResponse>
                    handler);

    /**
     * Updates a listener for a given load balancer.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
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
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<UpdateLoadBalancerResponse> updateLoadBalancer(
            UpdateLoadBalancerRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            UpdateLoadBalancerRequest, UpdateLoadBalancerResponse>
                    handler);
}
